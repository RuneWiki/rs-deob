package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

public abstract class ECCurve {

    public int coord = 0;

    public ECEndomorphism endomorphism = null;

    public ECMultiplier multiplier = null;

    public FiniteField field;

    public static final int COORD_AFFINE = 0;

    public static final int COORD_HOMOGENEOUS = 1;

    public static final int COORD_JACOBIAN = 2;

    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;

    public static final int COORD_JACOBIAN_MODIFIED = 4;

    public static final int COORD_LAMBDA_AFFINE = 5;

    public static final int COORD_LAMBDA_PROJECTIVE = 6;

    public static final int COORD_SKEWED = 7;

    public BigInteger cofactor;

    public BigInteger order;

    public ECFieldElement a;

    public ECFieldElement b;

    public ECFieldElement getB() {
        return this.b;
    }

    /**
     * @deprecated
     */
    public ECPoint validatePoint(BigInteger arg0, BigInteger arg1, boolean arg2) {
        ECPoint var4 = this.createPoint(arg0, arg1, arg2);
        if (!var4.isValid()) {
            throw new IllegalArgumentException("Invalid point coordinates");
        }
        return var4;
    }

    public boolean ee(Object arg0) {
        return this == arg0 || arg0 instanceof ECCurve && this.equals((ECCurve) arg0);
    }

    public abstract ECFieldElement fromBigInteger(BigInteger arg0);

    public boolean em(Object arg0) {
        return this == arg0 || arg0 instanceof ECCurve && this.equals((ECCurve) arg0);
    }

    public synchronized ECCurve.Config configure() {
        return new ECCurve.Config(this.coord, this.endomorphism, this.multiplier);
    }

    public ECPoint validatePoint(BigInteger arg0, BigInteger arg1) {
        ECPoint var3 = this.createPoint(arg0, arg1);
        if (!var3.isValid()) {
            throw new IllegalArgumentException("Invalid point coordinates");
        }
        return var3;
    }

    public abstract ECPoint decompressPoint(int arg0, BigInteger arg1);

    public ECFieldElement getA() {
        return this.a;
    }

    /**
     * @deprecated
     */
    public ECPoint createPoint(BigInteger arg0, BigInteger arg1, boolean arg2) {
        return this.createRawPoint(this.fromBigInteger(arg0), this.fromBigInteger(arg1), arg2);
    }

    public abstract ECCurve cloneCurve();

    public abstract ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2);

    public abstract ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3);

    public ECMultiplier createDefaultMultiplier() {
        return this.endomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism) this.endomorphism) : new WNafL2RMultiplier();
    }

    public static int[] getAllCoordinateSystems() {
        return new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };
    }

    public PreCompInfo getPreCompInfo(ECPoint arg0, String arg1) {
        this.checkPoint(arg0);
        synchronized (arg0) {
            Hashtable var4 = arg0.preCompTable;
            return var4 == null ? null : (PreCompInfo) var4.get(arg1);
        }
    }

    public abstract int getFieldSize();

    public void setPreCompInfo(ECPoint arg0, String arg1, PreCompInfo arg2) {
        this.checkPoint(arg0);
        synchronized (arg0) {
            Hashtable var5 = arg0.preCompTable;
            if (var5 == null) {
                arg0.preCompTable = var5 = new Hashtable(4);
            }
            var5.put(arg1, arg2);
        }
    }

    public void normalizeAll(ECPoint[] arg0) {
        this.normalizeAll(arg0, 0, arg0.length, (ECFieldElement) null);
    }

    public void normalizeAll(ECPoint[] arg0, int arg1, int arg2, ECFieldElement arg3) {
        this.checkPoints(arg0, arg1, arg2);
        switch(this.getCoordinateSystem()) {
            case 0:
            case 5:
                if (arg3 != null) {
                    throw new IllegalArgumentException("'iso' not valid for affine coordinates");
                }
                return;
            default:
                ECFieldElement[] var5 = new ECFieldElement[arg2];
                int[] var6 = new int[arg2];
                int var7 = 0;
                for (int var8 = 0; var8 < arg2; var8++) {
                    ECPoint var9 = arg0[arg1 + var8];
                    if (var9 != null && (arg3 != null || !var9.isNormalized())) {
                        var5[var7] = var9.getZCoord(0);
                        var6[var7++] = arg1 + var8;
                    }
                }
                if (var7 != 0) {
                    ECAlgorithms.montgomeryTrick(var5, 0, var7, arg3);
                    for (int var10 = 0; var10 < var7; var10++) {
                        int var11 = var6[var10];
                        arg0[var11] = arg0[var11].normalize(var5[var10]);
                    }
                }
        }
    }

    public abstract ECPoint getInfinity();

    public FiniteField getField() {
        return this.field;
    }

    public ECCurve(FiniteField arg0) {
        this.field = arg0;
    }

    public ECPoint createPoint(BigInteger arg0, BigInteger arg1) {
        return this.createPoint(arg0, arg1, false);
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public synchronized ECMultiplier getMultiplier() {
        if (this.multiplier == null) {
            this.multiplier = this.createDefaultMultiplier();
        }
        return this.multiplier;
    }

    public ECPoint importPoint(ECPoint arg0) {
        if (this == arg0.getCurve()) {
            return arg0;
        } else if (arg0.isInfinity()) {
            return this.getInfinity();
        } else {
            ECPoint var2 = arg0.normalize();
            return this.validatePoint(var2.getXCoord().toBigInteger(), var2.getYCoord().toBigInteger(), var2.withCompression);
        }
    }

    public ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public abstract boolean isValidFieldElement(BigInteger arg0);

    public ECPoint decodePoint(byte[] arg0) {
        Object var2 = null;
        int var3 = (this.getFieldSize() + 7) / 8;
        byte var4 = arg0[0];
        ECPoint var7;
        switch(var4) {
            case 0:
                if (arg0.length != 1) {
                    throw new IllegalArgumentException("Incorrect length for infinity encoding");
                }
                var7 = this.getInfinity();
                break;
            case 1:
            case 5:
            default:
                throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(var4, 16));
            case 2:
            case 3:
                if (var3 + 1 != arg0.length) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                int var10 = var4 & 0x1;
                BigInteger var11 = BigIntegers.fromUnsignedByteArray(arg0, 1, var3);
                var7 = this.decompressPoint(var10, var11);
                if (!var7.satisfiesCofactor()) {
                    throw new IllegalArgumentException("Invalid point");
                }
                break;
            case 4:
                if (var3 * 2 + 1 != arg0.length) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                BigInteger var8 = BigIntegers.fromUnsignedByteArray(arg0, 1, var3);
                BigInteger var9 = BigIntegers.fromUnsignedByteArray(arg0, var3 + 1, var3);
                var7 = this.validatePoint(var8, var9);
                break;
            case 6:
            case 7:
                if (var3 * 2 + 1 != arg0.length) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger var5 = BigIntegers.fromUnsignedByteArray(arg0, 1, var3);
                BigInteger var6 = BigIntegers.fromUnsignedByteArray(arg0, var3 + 1, var3);
                if (var6.testBit(0) != (var4 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                var7 = this.validatePoint(var5, var6);
        }
        if (var4 != 0 && var7.isInfinity()) {
            throw new IllegalArgumentException("Invalid infinity encoding");
        }
        return var7;
    }

    public void checkPoints(ECPoint[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        } else if (arg1 >= 0 && arg2 >= 0 && arg1 <= arg0.length - arg2) {
            for (int var4 = 0; var4 < arg2; var4++) {
                ECPoint var5 = arg0[arg1 + var4];
                if (var5 != null && this != var5.getCurve()) {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
        } else {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
    }

    public void checkPoints(ECPoint[] arg0) {
        this.checkPoints(arg0, 0, arg0.length);
    }

    public boolean equals(ECCurve arg0) {
        return this == arg0 || arg0 != null && this.getField().equals(arg0.getField()) && this.getA().toBigInteger().equals(arg0.getA().toBigInteger()) && this.getB().toBigInteger().equals(arg0.getB().toBigInteger());
    }

    public int agk() {
        return this.getField().hashCode() ^ Integers.rotateLeft(this.getA().toBigInteger().hashCode(), 8) ^ Integers.rotateLeft(this.getB().toBigInteger().hashCode(), 16);
    }

    public boolean equals(Object arg0) {
        return this == arg0 || arg0 instanceof ECCurve && this.equals((ECCurve) arg0);
    }

    public int hashCode() {
        return this.getField().hashCode() ^ Integers.rotateLeft(this.getA().toBigInteger().hashCode(), 8) ^ Integers.rotateLeft(this.getB().toBigInteger().hashCode(), 16);
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public boolean ez(Object arg0) {
        return this == arg0 || arg0 instanceof ECCurve && this.equals((ECCurve) arg0);
    }

    public void checkPoint(ECPoint arg0) {
        if (arg0 == null || this != arg0.getCurve()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public boolean supportsCoordinateSystem(int arg0) {
        return arg0 == 0;
    }

    public static class Fp extends ECCurve.AbstractFp {

        public BigInteger q;

        public BigInteger r;

        public ECPoint.Fp infinity;

        public static final int FP_DEFAULT_COORDS = 4;

        public ECPoint getInfinity() {
            return this.infinity;
        }

        public Fp(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4) {
            super(arg0);
            this.q = arg0;
            this.r = ECFieldElement.Fp.calculateResidue(arg0);
            this.infinity = new ECPoint.Fp(this, (ECFieldElement) null, (ECFieldElement) null);
            this.a = this.fromBigInteger(arg1);
            this.b = this.fromBigInteger(arg2);
            this.order = arg3;
            this.cofactor = arg4;
            this.coord = 4;
        }

        public Fp(BigInteger arg0, BigInteger arg1, ECFieldElement arg2, ECFieldElement arg3) {
            this(arg0, arg1, arg2, arg3, (BigInteger) null, (BigInteger) null);
        }

        public Fp(BigInteger arg0, BigInteger arg1, ECFieldElement arg2, ECFieldElement arg3, BigInteger arg4, BigInteger arg5) {
            super(arg0);
            this.q = arg0;
            this.r = arg1;
            this.infinity = new ECPoint.Fp(this, (ECFieldElement) null, (ECFieldElement) null);
            this.a = arg2;
            this.b = arg3;
            this.order = arg4;
            this.cofactor = arg5;
            this.coord = 4;
        }

        public ECCurve cloneCurve() {
            return new ECCurve.Fp(this.q, this.r, this.a, this.b, this.order, this.cofactor);
        }

        public boolean supportsCoordinateSystem(int arg0) {
            switch(arg0) {
                case 0:
                case 1:
                case 2:
                case 4:
                    return true;
                case 3:
                default:
                    return false;
            }
        }

        public BigInteger getQ() {
            return this.q;
        }

        public int getFieldSize() {
            return this.q.bitLength();
        }

        public ECFieldElement fromBigInteger(BigInteger arg0) {
            return new ECFieldElement.Fp(this.q, this.r, arg0);
        }

        public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
            return new ECPoint.Fp(this, arg0, arg1, arg2);
        }

        public Fp(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
            this(arg0, arg1, arg2, (BigInteger) null, (BigInteger) null);
        }

        public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
            return new ECPoint.Fp(this, arg0, arg1, arg2, arg3);
        }

        public ECPoint importPoint(ECPoint arg0) {
            if (this != arg0.getCurve() && this.getCoordinateSystem() == 2 && !arg0.isInfinity()) {
                switch(arg0.getCurve().getCoordinateSystem()) {
                    case 2:
                    case 3:
                    case 4:
                        return new ECPoint.Fp(this, this.fromBigInteger(arg0.x.toBigInteger()), this.fromBigInteger(arg0.y.toBigInteger()), new ECFieldElement[] { this.fromBigInteger(arg0.zs[0].toBigInteger()) }, arg0.withCompression);
                }
            }
            return super.importPoint(arg0);
        }
    }

    public static class F2m extends ECCurve.AbstractF2m {

        public int m;

        public int k1;

        public int k2;

        public int k3;

        public ECPoint.F2m infinity;

        public static final int F2M_DEFAULT_COORDS = 6;

        public ECFieldElement fromBigInteger(BigInteger arg0) {
            return new ECFieldElement.F2m(this.m, this.k1, this.k2, this.k3, arg0);
        }

        public F2m(int arg0, int arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, BigInteger arg5) {
            this(arg0, arg1, 0, 0, (BigInteger) arg2, (BigInteger) arg3, arg4, arg5);
        }

        public F2m(int arg0, int arg1, int arg2, int arg3, BigInteger arg4, BigInteger arg5) {
            this(arg0, arg1, arg2, arg3, (BigInteger) arg4, (BigInteger) arg5, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int arg0, int arg1, int arg2, int arg3, BigInteger arg4, BigInteger arg5, BigInteger arg6, BigInteger arg7) {
            super(arg0, arg1, arg2, arg3);
            this.m = arg0;
            this.k1 = arg1;
            this.k2 = arg2;
            this.k3 = arg3;
            this.order = arg6;
            this.cofactor = arg7;
            this.infinity = new ECPoint.F2m(this, (ECFieldElement) null, (ECFieldElement) null);
            this.a = this.fromBigInteger(arg4);
            this.b = this.fromBigInteger(arg5);
            this.coord = 6;
        }

        public F2m(int arg0, int arg1, int arg2, int arg3, ECFieldElement arg4, ECFieldElement arg5, BigInteger arg6, BigInteger arg7) {
            super(arg0, arg1, arg2, arg3);
            this.m = arg0;
            this.k1 = arg1;
            this.k2 = arg2;
            this.k3 = arg3;
            this.order = arg6;
            this.cofactor = arg7;
            this.infinity = new ECPoint.F2m(this, (ECFieldElement) null, (ECFieldElement) null);
            this.a = arg4;
            this.b = arg5;
            this.coord = 6;
        }

        public ECCurve cloneCurve() {
            return new ECCurve.F2m(this.m, this.k1, this.k2, this.k3, this.a, this.b, this.order, this.cofactor);
        }

        public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
            return new ECPoint.F2m(this, arg0, arg1, arg2);
        }

        public ECMultiplier createDefaultMultiplier() {
            return (ECMultiplier) (this.isKoblitz() ? new WTauNafMultiplier() : super.createDefaultMultiplier());
        }

        public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
            return new ECPoint.F2m(this, arg0, arg1, arg2, arg3);
        }

        public int getK1() {
            return this.k1;
        }

        public boolean supportsCoordinateSystem(int arg0) {
            switch(arg0) {
                case 0:
                case 1:
                case 6:
                    return true;
                default:
                    return false;
            }
        }

        public F2m(int arg0, int arg1, BigInteger arg2, BigInteger arg3) {
            this(arg0, arg1, 0, 0, (BigInteger) arg2, (BigInteger) arg3, (BigInteger) null, (BigInteger) null);
        }

        public int getFieldSize() {
            return this.m;
        }

        public int getM() {
            return this.m;
        }

        public ECPoint getInfinity() {
            return this.infinity;
        }

        public boolean isTrinomial() {
            return this.k2 == 0 && this.k3 == 0;
        }

        public int getK2() {
            return this.k2;
        }

        public int getK3() {
            return this.k3;
        }

        /**
         * @deprecated
         */
        public BigInteger getN() {
            return this.order;
        }

        /**
         * @deprecated
         */
        public BigInteger getH() {
            return this.cofactor;
        }
    }

    public class Config {

        public int coord;

        public ECEndomorphism endomorphism;

        public ECMultiplier multiplier;

        public ECCurve.Config setEndomorphism(ECEndomorphism arg0) {
            this.endomorphism = arg0;
            return this;
        }

        public ECCurve.Config setCoordinateSystem(int arg0) {
            this.coord = arg0;
            return this;
        }

        public Config(int arg1, ECEndomorphism arg2, ECMultiplier arg3) {
            this.coord = arg1;
            this.endomorphism = arg2;
            this.multiplier = arg3;
        }

        public ECCurve.Config setMultiplier(ECMultiplier arg0) {
            this.multiplier = arg0;
            return this;
        }

        public ECCurve create() {
            if (!ECCurve.this.supportsCoordinateSystem(this.coord)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECCurve var1 = ECCurve.this.cloneCurve();
            if (ECCurve.this == var1) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (var1) {
                var1.coord = this.coord;
                var1.endomorphism = this.endomorphism;
                var1.multiplier = this.multiplier;
                return var1;
            }
        }
    }

    public abstract static class AbstractF2m extends ECCurve {

        public BigInteger[] si = null;

        public static BigInteger inverse(int arg0, int[] arg1, BigInteger arg2) {
            return (new LongArray(arg2)).modInverse(arg0, arg1).toBigInteger();
        }

        public static FiniteField buildField(int arg0, int arg1, int arg2, int arg3) {
            if (arg1 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            } else if (arg2 == 0) {
                if (arg3 != 0) {
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
                return FiniteFields.getBinaryExtensionField(new int[] { 0, arg1, arg0 });
            } else if (arg2 <= arg1) {
                throw new IllegalArgumentException("k2 must be > k1");
            } else if (arg3 <= arg2) {
                throw new IllegalArgumentException("k3 must be > k2");
            } else {
                return FiniteFields.getBinaryExtensionField(new int[] { 0, arg1, arg2, arg3, arg0 });
            }
        }

        public AbstractF2m(int arg0, int arg1, int arg2, int arg3) {
            super(buildField(arg0, arg1, arg2, arg3));
        }

        public boolean isValidFieldElement(BigInteger arg0) {
            return arg0 != null && arg0.signum() >= 0 && arg0.bitLength() <= this.getFieldSize();
        }

        public synchronized BigInteger[] getSi() {
            if (this.si == null) {
                this.si = Tnaf.getSi(this);
            }
            return this.si;
        }

        public ECPoint createPoint(BigInteger arg0, BigInteger arg1, boolean arg2) {
            ECFieldElement var4 = this.fromBigInteger(arg0);
            ECFieldElement var5 = this.fromBigInteger(arg1);
            int var6 = this.getCoordinateSystem();
            switch(var6) {
                case 5:
                case 6:
                    if (!var4.isZero()) {
                        var5 = var5.divide(var4).add(var4);
                    } else if (!var5.square().equals(this.getB())) {
                        throw new IllegalArgumentException();
                    }
                default:
                    return this.createRawPoint(var4, var5, arg2);
            }
        }

        public ECPoint decompressPoint(int arg0, BigInteger arg1) {
            ECFieldElement var3 = this.fromBigInteger(arg1);
            ECFieldElement var4 = null;
            if (var3.isZero()) {
                var4 = this.getB().sqrt();
            } else {
                ECFieldElement var5 = var3.square().invert().multiply(this.getB()).add(this.getA()).add(var3);
                ECFieldElement var6 = this.solveQuadraticEquation(var5);
                if (var6 != null) {
                    if (var6.testBitZero() != (arg0 == 1)) {
                        var6 = var6.addOne();
                    }
                    switch(this.getCoordinateSystem()) {
                        case 5:
                        case 6:
                            var4 = var6.add(var3);
                            break;
                        default:
                            var4 = var6.multiply(var3);
                    }
                }
            }
            if (var4 == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            return this.createRawPoint(var3, var4, true);
        }

        public ECFieldElement solveQuadraticEquation(ECFieldElement arg0) {
            if (arg0.isZero()) {
                return arg0;
            }
            ECFieldElement var2 = this.fromBigInteger(ECConstants.ZERO);
            int var3 = this.getFieldSize();
            Random var4 = new Random();
            ECFieldElement var6;
            ECFieldElement var10;
            do {
                ECFieldElement var5 = this.fromBigInteger(new BigInteger(var3, var4));
                var6 = var2;
                ECFieldElement var7 = arg0;
                for (int var8 = 1; var8 < var3; var8++) {
                    ECFieldElement var9 = var7.square();
                    var6 = var6.square().add(var9.multiply(var5));
                    var7 = var9.add(arg0);
                }
                if (!var7.isZero()) {
                    return null;
                }
                var10 = var6.square().add(var6);
            } while (var10.isZero());
            return var6;
        }

        public boolean isKoblitz() {
            return this.order != null && this.cofactor != null && this.b.isOne() && (this.a.isZero() || this.a.isOne());
        }
    }

    public abstract static class AbstractFp extends ECCurve {

        public boolean isValidFieldElement(BigInteger arg0) {
            return arg0 != null && arg0.signum() >= 0 && arg0.compareTo(this.getField().getCharacteristic()) < 0;
        }

        public AbstractFp(BigInteger arg0) {
            super(FiniteFields.getPrimeField(arg0));
        }

        public ECPoint decompressPoint(int arg0, BigInteger arg1) {
            ECFieldElement var3 = this.fromBigInteger(arg1);
            ECFieldElement var4 = var3.square().add(this.a).multiply(var3).add(this.b);
            ECFieldElement var5 = var4.sqrt();
            if (var5 == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (var5.testBitZero() != (arg0 == 1)) {
                var5 = var5.negate();
            }
            return this.createRawPoint(var3, var5, true);
        }
    }
}
