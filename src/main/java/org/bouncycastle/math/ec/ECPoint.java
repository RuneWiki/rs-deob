package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;

public abstract class ECPoint {

    public static ECFieldElement[] EMPTY_ZS = new ECFieldElement[0];

    public Hashtable preCompTable;

    public ECCurve curve;

    public ECFieldElement x;

    public ECFieldElement y;

    public ECFieldElement[] zs;

    public boolean withCompression;

    public ECFieldElement getAffineXCoord() {
        this.checkNormalized();
        return this.getXCoord();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ECPoint)) {
            return this.equals((ECPoint) arg0);
        } else {
            return false;
        }
    }

    public final ECFieldElement[] getRawZCoords() {
        return this.zs;
    }

    public ECFieldElement getZCoord(int arg0) {
        return arg0 >= 0 && arg0 < this.zs.length ? this.zs[arg0] : null;
    }

    public abstract boolean satisfiesCurveEquation();

    public final ECPoint getDetachedPoint() {
        return this.normalize().detach();
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint twicePlus(ECPoint arg0) {
        return this.twice().add(arg0);
    }

    public int getCurveCoordinateSystem() {
        return this.curve == null ? 0 : this.curve.getCoordinateSystem();
    }

    /**
     * @deprecated
     */
    public boolean isCompressed() {
        return this.withCompression;
    }

    /**
     * @deprecated
     */
    public ECFieldElement getY() {
        return this.normalize().getYCoord();
    }

    public static ECFieldElement[] getInitialZCoords(ECCurve arg0) {
        int var1 = arg0 == null ? 0 : arg0.getCoordinateSystem();
        switch(var1) {
            case 0:
            case 5:
                return EMPTY_ZS;
            default:
                ECFieldElement var2 = arg0.fromBigInteger(ECConstants.ONE);
                switch(var1) {
                    case 1:
                    case 2:
                    case 6:
                        return new ECFieldElement[] { var2 };
                    case 3:
                        return new ECFieldElement[] { var2, var2, var2 };
                    case 4:
                        return new ECFieldElement[] { var2, arg0.getA() };
                    case 5:
                    default:
                        throw new IllegalArgumentException("unknown coordinate system");
                }
        }
    }

    public ECFieldElement getAffineYCoord() {
        this.checkNormalized();
        return this.getYCoord();
    }

    public ECFieldElement getXCoord() {
        return this.x;
    }

    public ECFieldElement getYCoord() {
        return this.y;
    }

    public boolean satisfiesCofactor() {
        BigInteger var1 = this.curve.getCofactor();
        return var1 == null || var1.equals(ECConstants.ONE) || !ECAlgorithms.referenceMultiply(this, var1).isInfinity();
    }

    public ECFieldElement[] getZCoords() {
        int var1 = this.zs.length;
        if (var1 == 0) {
            return EMPTY_ZS;
        } else {
            ECFieldElement[] var2 = new ECFieldElement[var1];
            System.arraycopy(this.zs, 0, var2, 0, var1);
            return var2;
        }
    }

    public final ECFieldElement getRawXCoord() {
        return this.x;
    }

    public final ECFieldElement getRawYCoord() {
        return this.y;
    }

    public String act() {
        if (this.isInfinity()) {
            return "INF";
        }
        StringBuffer var1 = new StringBuffer();
        var1.append('(');
        var1.append(this.getRawXCoord());
        var1.append(',');
        var1.append(this.getRawYCoord());
        for (int var2 = 0; var2 < this.zs.length; var2++) {
            var1.append(',');
            var1.append(this.zs[var2]);
        }
        var1.append(')');
        return var1.toString();
    }

    public void checkNormalized() {
        if (!this.isNormalized()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public ECPoint(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
        this(arg0, arg1, arg2, getInitialZCoords(arg0));
    }

    public int hashCode() {
        ECCurve var1 = this.getCurve();
        int var2 = var1 == null ? 0 : ~var1.hashCode();
        if (!this.isInfinity()) {
            ECPoint var3 = this.normalize();
            int var4 = var2 ^ var3.getXCoord().hashCode() * 17;
            var2 = var4 ^ var3.getYCoord().hashCode() * 257;
        }
        return var2;
    }

    public ECPoint normalize(ECFieldElement arg0) {
        switch(this.getCurveCoordinateSystem()) {
            case 1:
            case 6:
                return this.createScaledPoint(arg0, arg0);
            case 2:
            case 3:
            case 4:
                ECFieldElement var2 = arg0.square();
                ECFieldElement var3 = var2.multiply(arg0);
                return this.createScaledPoint(var2, var3);
            case 5:
            default:
                throw new IllegalStateException("not a projective coordinate system");
        }
    }

    public ECPoint createScaledPoint(ECFieldElement arg0, ECFieldElement arg1) {
        return this.getCurve().createRawPoint(this.getRawXCoord().multiply(arg0), this.getRawYCoord().multiply(arg1), this.withCompression);
    }

    public boolean isInfinity() {
        return this.x == null || this.y == null || this.zs.length > 0 && this.zs[0].isZero();
    }

    public abstract ECPoint detach();

    public boolean isValid() {
        if (this.isInfinity()) {
            return true;
        }
        ECCurve var1 = this.getCurve();
        if (var1 != null) {
            if (!this.satisfiesCurveEquation()) {
                return false;
            }
            if (!this.satisfiesCofactor()) {
                return false;
            }
        }
        return true;
    }

    public ECPoint scaleX(ECFieldElement arg0) {
        return this.isInfinity() ? this : this.getCurve().createRawPoint(this.getRawXCoord().multiply(arg0), this.getRawYCoord(), this.getRawZCoords(), this.withCompression);
    }

    public ECPoint scaleY(ECFieldElement arg0) {
        return this.isInfinity() ? this : this.getCurve().createRawPoint(this.getRawXCoord(), this.getRawYCoord().multiply(arg0), this.getRawZCoords(), this.withCompression);
    }

    public boolean equals(ECPoint arg0) {
        if (arg0 == null) {
            return false;
        }
        ECCurve var2 = this.getCurve();
        ECCurve var3 = arg0.getCurve();
        boolean var4 = var2 == null;
        boolean var5 = var3 == null;
        boolean var6 = this.isInfinity();
        boolean var7 = arg0.isInfinity();
        if (var6 || var7) {
            return var6 && var7 && (var4 || var5 || var2.equals(var3));
        }
        ECPoint var8 = this;
        ECPoint var9 = arg0;
        if (!var4 || !var5) {
            if (var4) {
                var9 = arg0.normalize();
            } else if (var5) {
                var8 = this.normalize();
            } else if (var2.equals(var3)) {
                ECPoint[] var10 = new ECPoint[] { this, var2.importPoint(arg0) };
                var2.normalizeAll(var10);
                var8 = var10[0];
                var9 = var10[1];
            } else {
                return false;
            }
        }
        return var8.getXCoord().equals(var9.getXCoord()) && var8.getYCoord().equals(var9.getYCoord());
    }

    public abstract ECPoint add(ECPoint arg0);

    public abstract ECPoint negate();

    public String toString() {
        if (this.isInfinity()) {
            return "INF";
        }
        StringBuffer var1 = new StringBuffer();
        var1.append('(');
        var1.append(this.getRawXCoord());
        var1.append(',');
        var1.append(this.getRawYCoord());
        for (int var2 = 0; var2 < this.zs.length; var2++) {
            var1.append(',');
            var1.append(this.zs[var2]);
        }
        var1.append(')');
        return var1.toString();
    }

    /**
     * @deprecated
     */
    public byte[] getEncoded() {
        return this.getEncoded(this.withCompression);
    }

    public byte[] getEncoded(boolean arg0) {
        if (this.isInfinity()) {
            return new byte[1];
        }
        ECPoint var2 = this.normalize();
        byte[] var3 = var2.getXCoord().getEncoded();
        if (arg0) {
            byte[] var4 = new byte[var3.length + 1];
            var4[0] = (byte) (var2.getCompressionYTilde() ? 3 : 2);
            System.arraycopy(var3, 0, var4, 1, var3.length);
            return var4;
        }
        byte[] var5 = var2.getYCoord().getEncoded();
        byte[] var6 = new byte[var3.length + var5.length + 1];
        var6[0] = 4;
        System.arraycopy(var3, 0, var6, 1, var3.length);
        System.arraycopy(var5, 0, var6, var3.length + 1, var5.length);
        return var6;
    }

    public abstract boolean getCompressionYTilde();

    public ECPoint threeTimes() {
        return this.twicePlus(this);
    }

    public String adm() {
        if (this.isInfinity()) {
            return "INF";
        }
        StringBuffer var1 = new StringBuffer();
        var1.append('(');
        var1.append(this.getRawXCoord());
        var1.append(',');
        var1.append(this.getRawYCoord());
        for (int var2 = 0; var2 < this.zs.length; var2++) {
            var1.append(',');
            var1.append(this.zs[var2]);
        }
        var1.append(')');
        return var1.toString();
    }

    public abstract ECPoint subtract(ECPoint arg0);

    public boolean bs(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ECPoint)) {
            return this.equals((ECPoint) arg0);
        } else {
            return false;
        }
    }

    public abstract ECPoint twice();

    public ECPoint timesPow2(int arg0) {
        if (arg0 < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        ECPoint var2 = this;
        while (true) {
            arg0--;
            if (arg0 < 0) {
                return var2;
            }
            var2 = var2.twice();
        }
    }

    public boolean isNormalized() {
        int var1 = this.getCurveCoordinateSystem();
        return var1 == 0 || var1 == 5 || this.isInfinity() || this.zs[0].isOne();
    }

    public ECPoint multiply(BigInteger arg0) {
        return this.getCurve().getMultiplier().multiply(this, arg0);
    }

    public ECPoint normalize() {
        if (this.isInfinity()) {
            return this;
        } else {
            switch(this.getCurveCoordinateSystem()) {
                case 0:
                case 5:
                    return this;
                default:
                    ECFieldElement var1 = this.getZCoord(0);
                    return var1.isOne() ? this : this.normalize(var1.invert());
            }
        }
    }

    public boolean bh(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ECPoint)) {
            return this.equals((ECPoint) arg0);
        } else {
            return false;
        }
    }

    public int ach() {
        ECCurve var1 = this.getCurve();
        int var2 = var1 == null ? 0 : ~var1.hashCode();
        if (!this.isInfinity()) {
            ECPoint var3 = this.normalize();
            int var4 = var2 ^ var3.getXCoord().hashCode() * 17;
            var2 = var4 ^ var3.getYCoord().hashCode() * 257;
        }
        return var2;
    }

    public int acn() {
        ECCurve var1 = this.getCurve();
        int var2 = var1 == null ? 0 : ~var1.hashCode();
        if (!this.isInfinity()) {
            ECPoint var3 = this.normalize();
            int var4 = var2 ^ var3.getXCoord().hashCode() * 17;
            var2 = var4 ^ var3.getYCoord().hashCode() * 257;
        }
        return var2;
    }

    public int acy() {
        ECCurve var1 = this.getCurve();
        int var2 = var1 == null ? 0 : ~var1.hashCode();
        if (!this.isInfinity()) {
            ECPoint var3 = this.normalize();
            int var4 = var2 ^ var3.getXCoord().hashCode() * 17;
            var2 = var4 ^ var3.getYCoord().hashCode() * 257;
        }
        return var2;
    }

    /**
     * @deprecated
     */
    public ECFieldElement getX() {
        return this.normalize().getXCoord();
    }

    public String acr() {
        if (this.isInfinity()) {
            return "INF";
        }
        StringBuffer var1 = new StringBuffer();
        var1.append('(');
        var1.append(this.getRawXCoord());
        var1.append(',');
        var1.append(this.getRawYCoord());
        for (int var2 = 0; var2 < this.zs.length; var2++) {
            var1.append(',');
            var1.append(this.zs[var2]);
        }
        var1.append(')');
        return var1.toString();
    }

    public String acj() {
        if (this.isInfinity()) {
            return "INF";
        }
        StringBuffer var1 = new StringBuffer();
        var1.append('(');
        var1.append(this.getRawXCoord());
        var1.append(',');
        var1.append(this.getRawYCoord());
        for (int var2 = 0; var2 < this.zs.length; var2++) {
            var1.append((char) 1689132716);
            var1.append(this.zs[var2]);
        }
        var1.append(')');
        return var1.toString();
    }

    public ECPoint(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3) {
        this.preCompTable = null;
        this.curve = arg0;
        this.x = arg1;
        this.y = arg2;
        this.zs = arg3;
    }

    public static class F2m extends ECPoint.AbstractF2m {

        public F2m(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3, boolean arg4) {
            super(arg0, arg1, arg2, arg3);
            this.withCompression = arg4;
        }

        /**
         * @deprecated
         */
        public F2m(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, boolean arg3) {
            super(arg0, arg1, arg2);
            if (arg1 == null != (arg2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (arg1 != null) {
                ECFieldElement.F2m.checkFieldElements(this.x, this.y);
                if (arg0 != null) {
                    ECFieldElement.F2m.checkFieldElements(this.x, this.curve.getA());
                }
            }
            this.withCompression = arg3;
        }

        public ECPoint negate() {
            if (this.isInfinity()) {
                return this;
            }
            ECFieldElement var1 = this.x;
            if (var1.isZero()) {
                return this;
            }
            switch(this.getCurveCoordinateSystem()) {
                case 0:
                    ECFieldElement var7 = this.y;
                    return new ECPoint.F2m(this.curve, var1, var7.add(var1), this.withCompression);
                case 1:
                    ECFieldElement var5 = this.y;
                    ECFieldElement var6 = this.zs[0];
                    return new ECPoint.F2m(this.curve, var1, var5.add(var1), new ECFieldElement[] { var6 }, this.withCompression);
                case 2:
                case 3:
                case 4:
                default:
                    throw new IllegalStateException("unsupported coordinate system");
                case 5:
                    ECFieldElement var4 = this.y;
                    return new ECPoint.F2m(this.curve, var1, var4.addOne(), this.withCompression);
                case 6:
                    ECFieldElement var2 = this.y;
                    ECFieldElement var3 = this.zs[0];
                    return new ECPoint.F2m(this.curve, var1, var2.add(var3), new ECFieldElement[] { var3 }, this.withCompression);
            }
        }

        public ECPoint detach() {
            return new ECPoint.F2m((ECCurve) null, this.getAffineXCoord(), this.getAffineYCoord());
        }

        public ECFieldElement getYCoord() {
            int var1 = this.getCurveCoordinateSystem();
            switch(var1) {
                case 5:
                case 6:
                    ECFieldElement var2 = this.x;
                    ECFieldElement var3 = this.y;
                    if (!this.isInfinity() && !var2.isZero()) {
                        ECFieldElement var4 = var3.add(var2).multiply(var2);
                        if (var1 == 6) {
                            ECFieldElement var5 = this.zs[0];
                            if (!var5.isOne()) {
                                var4 = var4.divide(var5);
                            }
                        }
                        return var4;
                    }
                    return var3;
                default:
                    return this.y;
            }
        }

        public boolean getCompressionYTilde() {
            ECFieldElement var1 = this.getRawXCoord();
            if (var1.isZero()) {
                return false;
            } else {
                ECFieldElement var2 = this.getRawYCoord();
                switch(this.getCurveCoordinateSystem()) {
                    case 5:
                    case 6:
                        return var2.testBitZero() != var1.testBitZero();
                    default:
                        return var2.divide(var1).testBitZero();
                }
            }
        }

        public ECPoint add(ECPoint arg0) {
            if (this.isInfinity()) {
                return arg0;
            } else if (arg0.isInfinity()) {
                return this;
            } else {
                ECCurve var2 = this.getCurve();
                int var3 = var2.getCoordinateSystem();
                ECFieldElement var4 = this.x;
                ECFieldElement var5 = arg0.x;
                switch(var3) {
                    case 0:
                        ECFieldElement var51 = this.y;
                        ECFieldElement var52 = arg0.y;
                        ECFieldElement var53 = var4.add(var5);
                        ECFieldElement var54 = var51.add(var52);
                        if (var53.isZero()) {
                            if (var54.isZero()) {
                                return this.twice();
                            }
                            return var2.getInfinity();
                        }
                        ECFieldElement var55 = var54.divide(var53);
                        ECFieldElement var56 = var55.square().add(var55).add(var53).add(var2.getA());
                        ECFieldElement var57 = var55.multiply(var4.add(var56)).add(var56).add(var51);
                        return new ECPoint.F2m(var2, var56, var57, this.withCompression);
                    case 1:
                        ECFieldElement var31 = this.y;
                        ECFieldElement var32 = this.zs[0];
                        ECFieldElement var33 = arg0.y;
                        ECFieldElement var34 = arg0.zs[0];
                        boolean var35 = var34.isOne();
                        ECFieldElement var36 = var32.multiply(var33);
                        ECFieldElement var37 = var35 ? var31 : var31.multiply(var34);
                        ECFieldElement var38 = var36.add(var37);
                        ECFieldElement var39 = var32.multiply(var5);
                        ECFieldElement var40 = var35 ? var4 : var4.multiply(var34);
                        ECFieldElement var41 = var39.add(var40);
                        if (var41.isZero()) {
                            if (var38.isZero()) {
                                return this.twice();
                            }
                            return var2.getInfinity();
                        }
                        ECFieldElement var42 = var41.square();
                        ECFieldElement var43 = var42.multiply(var41);
                        ECFieldElement var44 = var35 ? var32 : var32.multiply(var34);
                        ECFieldElement var45 = var38.add(var41);
                        ECFieldElement var46 = var45.multiplyPlusProduct(var38, var42, var2.getA()).multiply(var44).add(var43);
                        ECFieldElement var47 = var41.multiply(var46);
                        ECFieldElement var48 = var35 ? var42 : var42.multiply(var34);
                        ECFieldElement var49 = var38.multiplyPlusProduct(var4, var41, var31).multiplyPlusProduct(var48, var45, var46);
                        ECFieldElement var50 = var43.multiply(var44);
                        return new ECPoint.F2m(var2, var47, var49, new ECFieldElement[] { var50 }, this.withCompression);
                    case 6:
                        if (var4.isZero()) {
                            if (var5.isZero()) {
                                return var2.getInfinity();
                            }
                            return arg0.add(this);
                        } else {
                            ECFieldElement var6 = this.y;
                            ECFieldElement var7 = this.zs[0];
                            ECFieldElement var8 = arg0.y;
                            ECFieldElement var9 = arg0.zs[0];
                            boolean var10 = var7.isOne();
                            ECFieldElement var11 = var5;
                            ECFieldElement var12 = var8;
                            if (!var10) {
                                var11 = var5.multiply(var7);
                                var12 = var8.multiply(var7);
                            }
                            boolean var13 = var9.isOne();
                            ECFieldElement var14 = var4;
                            ECFieldElement var15 = var6;
                            if (!var13) {
                                var14 = var4.multiply(var9);
                                var15 = var6.multiply(var9);
                            }
                            ECFieldElement var16 = var15.add(var12);
                            ECFieldElement var17 = var14.add(var11);
                            if (var17.isZero()) {
                                if (var16.isZero()) {
                                    return this.twice();
                                }
                                return var2.getInfinity();
                            }
                            ECFieldElement var23;
                            ECFieldElement var25;
                            ECFieldElement var26;
                            if (var5.isZero()) {
                                ECPoint var18 = this.normalize();
                                ECFieldElement var19 = var18.getXCoord();
                                ECFieldElement var20 = var18.getYCoord();
                                ECFieldElement var22 = var20.add(var8).divide(var19);
                                var23 = var22.square().add(var22).add(var19).add(var2.getA());
                                if (var23.isZero()) {
                                    return new ECPoint.F2m(var2, var23, var2.getB().sqrt(), this.withCompression);
                                }
                                ECFieldElement var24 = var22.multiply(var19.add(var23)).add(var23).add(var20);
                                var25 = var24.divide(var23).add(var23);
                                var26 = var2.fromBigInteger(ECConstants.ONE);
                            } else {
                                ECFieldElement var27 = var17.square();
                                ECFieldElement var28 = var16.multiply(var14);
                                ECFieldElement var29 = var16.multiply(var11);
                                var23 = var28.multiply(var29);
                                if (var23.isZero()) {
                                    return new ECPoint.F2m(var2, var23, var2.getB().sqrt(), this.withCompression);
                                }
                                ECFieldElement var30 = var16.multiply(var27);
                                if (!var13) {
                                    var30 = var30.multiply(var9);
                                }
                                var25 = var29.add(var27).squarePlusProduct(var30, var6.add(var7));
                                var26 = var30;
                                if (!var10) {
                                    var26 = var30.multiply(var7);
                                }
                            }
                            return new ECPoint.F2m(var2, var23, var25, new ECFieldElement[] { var26 }, this.withCompression);
                        }
                    default:
                        throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }

        public ECPoint twice() {
            if (this.isInfinity()) {
                return this;
            }
            ECCurve var1 = this.getCurve();
            ECFieldElement var2 = this.x;
            if (var2.isZero()) {
                return var1.getInfinity();
            }
            int var3 = var1.getCoordinateSystem();
            switch(var3) {
                case 0:
                    ECFieldElement var33 = this.y;
                    ECFieldElement var34 = var33.divide(var2).add(var2);
                    ECFieldElement var35 = var34.square().add(var34).add(var1.getA());
                    ECFieldElement var36 = var2.squarePlusProduct(var35, var34.addOne());
                    return new ECPoint.F2m(var1, var35, var36, this.withCompression);
                case 1:
                    ECFieldElement var19 = this.y;
                    ECFieldElement var20 = this.zs[0];
                    boolean var21 = var20.isOne();
                    ECFieldElement var22 = var21 ? var2 : var2.multiply(var20);
                    ECFieldElement var23 = var21 ? var19 : var19.multiply(var20);
                    ECFieldElement var24 = var2.square();
                    ECFieldElement var25 = var24.add(var23);
                    ECFieldElement var27 = var22.square();
                    ECFieldElement var28 = var25.add(var22);
                    ECFieldElement var29 = var28.multiplyPlusProduct(var25, var27, var1.getA());
                    ECFieldElement var30 = var22.multiply(var29);
                    ECFieldElement var31 = var24.square().multiplyPlusProduct(var22, var29, var28);
                    ECFieldElement var32 = var22.multiply(var27);
                    return new ECPoint.F2m(var1, var30, var31, new ECFieldElement[] { var32 }, this.withCompression);
                case 6:
                    ECFieldElement var4 = this.y;
                    ECFieldElement var5 = this.zs[0];
                    boolean var6 = var5.isOne();
                    ECFieldElement var7 = var6 ? var4 : var4.multiply(var5);
                    ECFieldElement var8 = var6 ? var5 : var5.square();
                    ECFieldElement var9 = var1.getA();
                    ECFieldElement var10 = var6 ? var9 : var9.multiply(var8);
                    ECFieldElement var11 = var4.square().add(var7).add(var10);
                    if (var11.isZero()) {
                        return new ECPoint.F2m(var1, var11, var1.getB().sqrt(), this.withCompression);
                    }
                    ECFieldElement var12 = var11.square();
                    ECFieldElement var13 = var6 ? var11 : var11.multiply(var8);
                    ECFieldElement var14 = var1.getB();
                    ECFieldElement var17;
                    if (var14.bitLength() < var1.getFieldSize() >> 1) {
                        ECFieldElement var15 = var4.add(var2).square();
                        ECFieldElement var16;
                        if (var14.isOne()) {
                            var16 = var10.add(var8).square();
                        } else {
                            var16 = var10.squarePlusProduct(var14, var8.square());
                        }
                        var17 = var15.add(var11).add(var8).multiply(var15).add(var16).add(var12);
                        if (var9.isZero()) {
                            var17 = var17.add(var13);
                        } else if (!var9.isOne()) {
                            var17 = var17.add(var9.addOne().multiply(var13));
                        }
                    } else {
                        ECFieldElement var18 = var6 ? var2 : var2.multiply(var5);
                        var17 = var18.squarePlusProduct(var11, var7).add(var12).add(var13);
                    }
                    return new ECPoint.F2m(var1, var12, var17, new ECFieldElement[] { var13 }, this.withCompression);
                default:
                    throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public ECPoint twicePlus(ECPoint arg0) {
            if (this.isInfinity()) {
                return arg0;
            } else if (arg0.isInfinity()) {
                return this.twice();
            } else {
                ECCurve var2 = this.getCurve();
                ECFieldElement var3 = this.x;
                if (var3.isZero()) {
                    return arg0;
                }
                int var4 = var2.getCoordinateSystem();
                switch(var4) {
                    case 6:
                        ECFieldElement var5 = arg0.x;
                        ECFieldElement var6 = arg0.zs[0];
                        if (!var5.isZero() && var6.isOne()) {
                            ECFieldElement var7 = this.y;
                            ECFieldElement var8 = this.zs[0];
                            ECFieldElement var9 = arg0.y;
                            ECFieldElement var10 = var3.square();
                            ECFieldElement var11 = var7.square();
                            ECFieldElement var12 = var8.square();
                            ECFieldElement var13 = var7.multiply(var8);
                            ECFieldElement var14 = var2.getA().multiply(var12).add(var11).add(var13);
                            ECFieldElement var15 = var9.addOne();
                            ECFieldElement var16 = var2.getA().add(var15).multiply(var12).add(var11).multiplyPlusProduct(var14, var10, var12);
                            ECFieldElement var17 = var5.multiply(var12);
                            ECFieldElement var18 = var17.add(var14).square();
                            if (var18.isZero()) {
                                if (var16.isZero()) {
                                    return arg0.twice();
                                }
                                return var2.getInfinity();
                            }
                            if (var16.isZero()) {
                                return new ECPoint.F2m(var2, var16, var2.getB().sqrt(), this.withCompression);
                            }
                            ECFieldElement var19 = var16.square().multiply(var17);
                            ECFieldElement var20 = var16.multiply(var18).multiply(var12);
                            ECFieldElement var21 = var16.add(var18).square().multiplyPlusProduct(var14, var15, var20);
                            return new ECPoint.F2m(var2, var19, var21, new ECFieldElement[] { var20 }, this.withCompression);
                        }
                        return this.twice().add(arg0);
                    default:
                        return this.twice().add(arg0);
                }
            }
        }

        /**
         * @deprecated
         */
        public F2m(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
            this(arg0, arg1, arg2, false);
        }
    }

    public abstract static class AbstractF2m extends ECPoint {

        public ECPoint scaleY(ECFieldElement arg0) {
            if (this.isInfinity()) {
                return this;
            }
            int var2 = this.getCurveCoordinateSystem();
            switch(var2) {
                case 5:
                case 6:
                    ECFieldElement var3 = this.getRawXCoord();
                    ECFieldElement var4 = this.getRawYCoord();
                    ECFieldElement var5 = var4.add(var3).multiply(arg0).add(var3);
                    return this.getCurve().createRawPoint(var3, var5, this.getRawZCoords(), this.withCompression);
                default:
                    return super.scaleY(arg0);
            }
        }

        public ECPoint.AbstractF2m tauPow(int arg0) {
            if (this.isInfinity()) {
                return this;
            }
            ECCurve var2 = this.getCurve();
            int var3 = var2.getCoordinateSystem();
            ECFieldElement var4 = this.x;
            switch(var3) {
                case 0:
                case 5:
                    ECFieldElement var7 = this.y;
                    return (ECPoint.AbstractF2m) var2.createRawPoint(var4.squarePow(arg0), var7.squarePow(arg0), this.withCompression);
                case 1:
                case 6:
                    ECFieldElement var5 = this.y;
                    ECFieldElement var6 = this.zs[0];
                    return (ECPoint.AbstractF2m) var2.createRawPoint(var4.squarePow(arg0), var5.squarePow(arg0), new ECFieldElement[] { var6.squarePow(arg0) }, this.withCompression);
                case 2:
                case 3:
                case 4:
                default:
                    throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public boolean satisfiesCurveEquation() {
            ECCurve var1 = this.getCurve();
            ECFieldElement var2 = this.x;
            ECFieldElement var3 = var1.getA();
            ECFieldElement var4 = var1.getB();
            int var5 = var1.getCoordinateSystem();
            if (var5 == 6) {
                ECFieldElement var6 = this.zs[0];
                boolean var7 = var6.isOne();
                if (var2.isZero()) {
                    ECFieldElement var8 = this.y;
                    ECFieldElement var9 = var8.square();
                    ECFieldElement var10 = var4;
                    if (!var7) {
                        var10 = var4.multiply(var6.square());
                    }
                    return var9.equals(var10);
                }
                ECFieldElement var11 = this.y;
                ECFieldElement var12 = var2.square();
                ECFieldElement var13;
                ECFieldElement var14;
                if (var7) {
                    var13 = var11.square().add(var11).add(var3);
                    var14 = var12.square().add(var4);
                } else {
                    ECFieldElement var15 = var6.square();
                    ECFieldElement var16 = var15.square();
                    var13 = var11.add(var6).multiplyPlusProduct(var11, var3, var15);
                    var14 = var12.squarePlusProduct(var4, var16);
                }
                ECFieldElement var17 = var13.multiply(var12);
                return var17.equals(var14);
            } else {
                ECFieldElement var18 = this.y;
                ECFieldElement var19 = var18.add(var2).multiply(var18);
                switch(var5) {
                    case 1:
                        ECFieldElement var20 = this.zs[0];
                        if (!var20.isOne()) {
                            ECFieldElement var21 = var20.square();
                            ECFieldElement var22 = var20.multiply(var21);
                            var19 = var19.multiply(var20);
                            var3 = var3.multiply(var20);
                            var4 = var4.multiply(var22);
                        }
                    case 0:
                        ECFieldElement var23 = var2.add(var3).multiply(var2.square()).add(var4);
                        return var19.equals(var23);
                    default:
                        throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }

        public ECPoint scaleX(ECFieldElement arg0) {
            if (this.isInfinity()) {
                return this;
            }
            int var2 = this.getCurveCoordinateSystem();
            switch(var2) {
                case 5:
                    ECFieldElement var9 = this.getRawXCoord();
                    ECFieldElement var10 = this.getRawYCoord();
                    ECFieldElement var11 = var9.multiply(arg0);
                    ECFieldElement var12 = var10.add(var9).divide(arg0).add(var11);
                    return this.getCurve().createRawPoint(var9, var12, this.getRawZCoords(), this.withCompression);
                case 6:
                    ECFieldElement var3 = this.getRawXCoord();
                    ECFieldElement var4 = this.getRawYCoord();
                    ECFieldElement var5 = this.getRawZCoords()[0];
                    ECFieldElement var6 = var3.multiply(arg0.square());
                    ECFieldElement var7 = var4.add(var3).add(var6);
                    ECFieldElement var8 = var5.multiply(arg0);
                    return this.getCurve().createRawPoint(var6, var7, new ECFieldElement[] { var8 }, this.withCompression);
                default:
                    return super.scaleX(arg0);
            }
        }

        public AbstractF2m(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
            super(arg0, arg1, arg2);
        }

        public ECPoint subtract(ECPoint arg0) {
            return arg0.isInfinity() ? this : this.add(arg0.negate());
        }

        public ECPoint.AbstractF2m tau() {
            if (this.isInfinity()) {
                return this;
            }
            ECCurve var1 = this.getCurve();
            int var2 = var1.getCoordinateSystem();
            ECFieldElement var3 = this.x;
            switch(var2) {
                case 0:
                case 5:
                    ECFieldElement var6 = this.y;
                    return (ECPoint.AbstractF2m) var1.createRawPoint(var3.square(), var6.square(), this.withCompression);
                case 1:
                case 6:
                    ECFieldElement var4 = this.y;
                    ECFieldElement var5 = this.zs[0];
                    return (ECPoint.AbstractF2m) var1.createRawPoint(var3.square(), var4.square(), new ECFieldElement[] { var5.square() }, this.withCompression);
                case 2:
                case 3:
                case 4:
                default:
                    throw new IllegalStateException("unsupported coordinate system");
            }
        }

        public AbstractF2m(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    public static class Fp extends ECPoint.AbstractFp {

        public ECFieldElement two(ECFieldElement arg0) {
            return arg0.add(arg0);
        }

        public ECPoint threeTimes() {
            if (this.isInfinity()) {
                return this;
            }
            ECFieldElement var1 = this.y;
            if (var1.isZero()) {
                return this;
            }
            ECCurve var2 = this.getCurve();
            int var3 = var2.getCoordinateSystem();
            switch(var3) {
                case 0:
                    ECFieldElement var4 = this.x;
                    ECFieldElement var5 = this.two(var1);
                    ECFieldElement var6 = var5.square();
                    ECFieldElement var7 = this.three(var4.square()).add(this.getCurve().getA());
                    ECFieldElement var8 = var7.square();
                    ECFieldElement var9 = this.three(var4).multiply(var6).subtract(var8);
                    if (var9.isZero()) {
                        return this.getCurve().getInfinity();
                    }
                    ECFieldElement var10 = var9.multiply(var5);
                    ECFieldElement var11 = var10.invert();
                    ECFieldElement var12 = var9.multiply(var11).multiply(var7);
                    ECFieldElement var13 = var6.square().multiply(var11).subtract(var12);
                    ECFieldElement var14 = var13.subtract(var12).multiply(var12.add(var13)).add(var4);
                    ECFieldElement var15 = var4.subtract(var14).multiply(var13).subtract(var1);
                    return new ECPoint.Fp(var2, var14, var15, this.withCompression);
                case 4:
                    return this.twiceJacobianModified(false).add(this);
                default:
                    return this.twice().add(this);
            }
        }

        public Fp(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3, boolean arg4) {
            super(arg0, arg1, arg2, arg3);
            this.withCompression = arg4;
        }

        public ECPoint detach() {
            return new ECPoint.Fp((ECCurve) null, this.getAffineXCoord(), this.getAffineYCoord());
        }

        public ECFieldElement calculateJacobianModifiedW(ECFieldElement arg0, ECFieldElement arg1) {
            ECFieldElement var3 = this.getCurve().getA();
            if (var3.isZero() || arg0.isOne()) {
                return var3;
            }
            if (arg1 == null) {
                arg1 = arg0.square();
            }
            ECFieldElement var4 = arg1.square();
            ECFieldElement var5 = var3.negate();
            ECFieldElement var6;
            if (var5.bitLength() < var3.bitLength()) {
                var6 = var4.multiply(var5).negate();
            } else {
                var6 = var4.multiply(var3);
            }
            return var6;
        }

        public ECPoint add(ECPoint arg0) {
            if (this.isInfinity()) {
                return arg0;
            } else if (arg0.isInfinity()) {
                return this;
            } else if (this == arg0) {
                return this.twice();
            } else {
                ECCurve var2 = this.getCurve();
                int var3 = var2.getCoordinateSystem();
                ECFieldElement var4 = this.x;
                ECFieldElement var5 = this.y;
                ECFieldElement var6 = arg0.x;
                ECFieldElement var7 = arg0.y;
                switch(var3) {
                    case 0:
                        ECFieldElement var58 = var6.subtract(var4);
                        ECFieldElement var59 = var7.subtract(var5);
                        if (var58.isZero()) {
                            if (var59.isZero()) {
                                return this.twice();
                            }
                            return var2.getInfinity();
                        }
                        ECFieldElement var60 = var59.divide(var58);
                        ECFieldElement var61 = var60.square().subtract(var4).subtract(var6);
                        ECFieldElement var62 = var60.multiply(var4.subtract(var61)).subtract(var5);
                        return new ECPoint.Fp(var2, var61, var62, this.withCompression);
                    case 1:
                        ECFieldElement var40 = this.zs[0];
                        ECFieldElement var41 = arg0.zs[0];
                        boolean var42 = var40.isOne();
                        boolean var43 = var41.isOne();
                        ECFieldElement var44 = var42 ? var7 : var7.multiply(var40);
                        ECFieldElement var45 = var43 ? var5 : var5.multiply(var41);
                        ECFieldElement var46 = var44.subtract(var45);
                        ECFieldElement var47 = var42 ? var6 : var6.multiply(var40);
                        ECFieldElement var48 = var43 ? var4 : var4.multiply(var41);
                        ECFieldElement var49 = var47.subtract(var48);
                        if (var49.isZero()) {
                            if (var46.isZero()) {
                                return this.twice();
                            }
                            return var2.getInfinity();
                        }
                        ECFieldElement var50 = var42 ? var41 : (var43 ? var40 : var40.multiply(var41));
                        ECFieldElement var51 = var49.square();
                        ECFieldElement var52 = var51.multiply(var49);
                        ECFieldElement var53 = var51.multiply(var48);
                        ECFieldElement var54 = var46.square().multiply(var50).subtract(var52).subtract(this.two(var53));
                        ECFieldElement var55 = var49.multiply(var54);
                        ECFieldElement var56 = var53.subtract(var54).multiplyMinusProduct(var46, var45, var52);
                        ECFieldElement var57 = var52.multiply(var50);
                        return new ECPoint.Fp(var2, var55, var56, new ECFieldElement[] { var57 }, this.withCompression);
                    case 2:
                    case 4:
                        ECFieldElement var8 = this.zs[0];
                        ECFieldElement var9 = arg0.zs[0];
                        boolean var10 = var8.isOne();
                        ECFieldElement var11 = null;
                        ECFieldElement var18;
                        ECFieldElement var19;
                        ECFieldElement var21;
                        if (!var10 && var8.equals(var9)) {
                            ECFieldElement var12 = var4.subtract(var6);
                            ECFieldElement var13 = var5.subtract(var7);
                            if (var12.isZero()) {
                                if (var13.isZero()) {
                                    return this.twice();
                                }
                                return var2.getInfinity();
                            }
                            ECFieldElement var14 = var12.square();
                            ECFieldElement var15 = var4.multiply(var14);
                            ECFieldElement var16 = var6.multiply(var14);
                            ECFieldElement var17 = var15.subtract(var16).multiply(var5);
                            var18 = var13.square().subtract(var15).subtract(var16);
                            var19 = var15.subtract(var18).multiply(var13).subtract(var17);
                            var21 = var12.multiply(var8);
                        } else {
                            ECFieldElement var23;
                            ECFieldElement var24;
                            if (var10) {
                                var23 = var6;
                                var24 = var7;
                            } else {
                                ECFieldElement var25 = var8.square();
                                var23 = var25.multiply(var6);
                                ECFieldElement var26 = var25.multiply(var8);
                                var24 = var26.multiply(var7);
                            }
                            boolean var27 = var9.isOne();
                            ECFieldElement var29;
                            ECFieldElement var30;
                            if (var27) {
                                var29 = var4;
                                var30 = var5;
                            } else {
                                ECFieldElement var31 = var9.square();
                                var29 = var31.multiply(var4);
                                ECFieldElement var32 = var31.multiply(var9);
                                var30 = var32.multiply(var5);
                            }
                            ECFieldElement var33 = var29.subtract(var23);
                            ECFieldElement var34 = var30.subtract(var24);
                            if (var33.isZero()) {
                                if (var34.isZero()) {
                                    return this.twice();
                                }
                                return var2.getInfinity();
                            }
                            ECFieldElement var35 = var33.square();
                            ECFieldElement var36 = var35.multiply(var33);
                            ECFieldElement var37 = var35.multiply(var29);
                            var18 = var34.square().add(var36).subtract(this.two(var37));
                            var19 = var37.subtract(var18).multiplyMinusProduct(var34, var36, var30);
                            var21 = var33;
                            if (!var10) {
                                var21 = var33.multiply(var8);
                            }
                            if (!var27) {
                                var21 = var21.multiply(var9);
                            }
                            if (var21 == var33) {
                                var11 = var35;
                            }
                        }
                        ECFieldElement[] var39;
                        if (var3 == 4) {
                            ECFieldElement var38 = this.calculateJacobianModifiedW(var21, var11);
                            var39 = new ECFieldElement[] { var21, var38 };
                        } else {
                            var39 = new ECFieldElement[] { var21 };
                        }
                        return new ECPoint.Fp(var2, var18, var19, var39, this.withCompression);
                    case 3:
                    default:
                        throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }

        public ECPoint twice() {
            if (this.isInfinity()) {
                return this;
            }
            ECCurve var1 = this.getCurve();
            ECFieldElement var2 = this.y;
            if (var2.isZero()) {
                return var1.getInfinity();
            }
            int var3 = var1.getCoordinateSystem();
            ECFieldElement var4 = this.x;
            switch(var3) {
                case 0:
                    ECFieldElement var35 = var4.square();
                    ECFieldElement var36 = this.three(var35).add(this.getCurve().getA()).divide(this.two(var2));
                    ECFieldElement var37 = var36.square().subtract(this.two(var4));
                    ECFieldElement var38 = var36.multiply(var4.subtract(var37)).subtract(var2);
                    return new ECPoint.Fp(var1, var37, var38, this.withCompression);
                case 1:
                    ECFieldElement var20 = this.zs[0];
                    boolean var21 = var20.isOne();
                    ECFieldElement var22 = var1.getA();
                    if (!var22.isZero() && !var21) {
                        var22 = var22.multiply(var20.square());
                    }
                    ECFieldElement var23 = var22.add(this.three(var4.square()));
                    ECFieldElement var24 = var21 ? var2 : var2.multiply(var20);
                    ECFieldElement var25 = var21 ? var2.square() : var24.multiply(var2);
                    ECFieldElement var26 = var4.multiply(var25);
                    ECFieldElement var27 = this.four(var26);
                    ECFieldElement var28 = var23.square().subtract(this.two(var27));
                    ECFieldElement var29 = this.two(var24);
                    ECFieldElement var30 = var28.multiply(var29);
                    ECFieldElement var31 = this.two(var25);
                    ECFieldElement var32 = var27.subtract(var28).multiply(var23).subtract(this.two(var31.square()));
                    ECFieldElement var33 = var21 ? this.two(var31) : var29.square();
                    ECFieldElement var34 = this.two(var33).multiply(var24);
                    return new ECPoint.Fp(var1, var30, var32, new ECFieldElement[] { var34 }, this.withCompression);
                case 2:
                    ECFieldElement var5 = this.zs[0];
                    boolean var6 = var5.isOne();
                    ECFieldElement var7 = var2.square();
                    ECFieldElement var8 = var7.square();
                    ECFieldElement var9 = var1.getA();
                    ECFieldElement var10 = var9.negate();
                    ECFieldElement var12;
                    ECFieldElement var13;
                    if (var10.toBigInteger().equals(BigInteger.valueOf(3L))) {
                        ECFieldElement var11 = var6 ? var5 : var5.square();
                        var12 = this.three(var4.add(var11).multiply(var4.subtract(var11)));
                        var13 = this.four(var7.multiply(var4));
                    } else {
                        ECFieldElement var14 = var4.square();
                        var12 = this.three(var14);
                        if (var6) {
                            var12 = var12.add(var9);
                        } else if (!var9.isZero()) {
                            ECFieldElement var15 = var5.square();
                            ECFieldElement var16 = var15.square();
                            if (var10.bitLength() < var9.bitLength()) {
                                var12 = var12.subtract(var16.multiply(var10));
                            } else {
                                var12 = var12.add(var16.multiply(var9));
                            }
                        }
                        var13 = this.four(var4.multiply(var7));
                    }
                    ECFieldElement var17 = var12.square().subtract(this.two(var13));
                    ECFieldElement var18 = var13.subtract(var17).multiply(var12).subtract(this.eight(var8));
                    ECFieldElement var19 = this.two(var2);
                    if (!var6) {
                        var19 = var19.multiply(var5);
                    }
                    return new ECPoint.Fp(var1, var17, var18, new ECFieldElement[] { var19 }, this.withCompression);
                case 3:
                default:
                    throw new IllegalStateException("unsupported coordinate system");
                case 4:
                    return this.twiceJacobianModified(true);
            }
        }

        public ECPoint timesPow2(int arg0) {
            if (arg0 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            } else if (arg0 == 0 || this.isInfinity()) {
                return this;
            } else if (arg0 == 1) {
                return this.twice();
            } else {
                ECCurve var2 = this.getCurve();
                ECFieldElement var3 = this.y;
                if (var3.isZero()) {
                    return var2.getInfinity();
                }
                int var4 = var2.getCoordinateSystem();
                ECFieldElement var5 = var2.getA();
                ECFieldElement var6 = this.x;
                ECFieldElement var7 = this.zs.length < 1 ? var2.fromBigInteger(ECConstants.ONE) : this.zs[0];
                if (!var7.isOne()) {
                    switch(var4) {
                        case 0:
                            break;
                        case 1:
                            ECFieldElement var8 = var7.square();
                            var6 = var6.multiply(var7);
                            var3 = var3.multiply(var8);
                            var5 = this.calculateJacobianModifiedW(var7, var8);
                            break;
                        case 2:
                            var5 = this.calculateJacobianModifiedW(var7, (ECFieldElement) null);
                            break;
                        case 3:
                        default:
                            throw new IllegalStateException("unsupported coordinate system");
                        case 4:
                            var5 = this.getJacobianModifiedW();
                    }
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    if (var3.isZero()) {
                        return var2.getInfinity();
                    }
                    ECFieldElement var10 = var6.square();
                    ECFieldElement var11 = this.three(var10);
                    ECFieldElement var12 = this.two(var3);
                    ECFieldElement var13 = var12.multiply(var3);
                    ECFieldElement var14 = this.two(var6.multiply(var13));
                    ECFieldElement var15 = var13.square();
                    ECFieldElement var16 = this.two(var15);
                    if (!var5.isZero()) {
                        var11 = var11.add(var5);
                        var5 = this.two(var16.multiply(var5));
                    }
                    var6 = var11.square().subtract(this.two(var14));
                    var3 = var11.multiply(var14.subtract(var6)).subtract(var16);
                    var7 = var7.isOne() ? var12 : var12.multiply(var7);
                }
                switch(var4) {
                    case 0:
                        ECFieldElement var19 = var7.invert();
                        ECFieldElement var20 = var19.square();
                        ECFieldElement var21 = var20.multiply(var19);
                        return new ECPoint.Fp(var2, var6.multiply(var20), var3.multiply(var21), this.withCompression);
                    case 1:
                        ECFieldElement var17 = var6.multiply(var7);
                        ECFieldElement var18 = var7.multiply(var7.square());
                        return new ECPoint.Fp(var2, var17, var3, new ECFieldElement[] { var18 }, this.withCompression);
                    case 2:
                        return new ECPoint.Fp(var2, var6, var3, new ECFieldElement[] { var7 }, this.withCompression);
                    case 3:
                    default:
                        throw new IllegalStateException("unsupported coordinate system");
                    case 4:
                        return new ECPoint.Fp(var2, var6, var3, new ECFieldElement[] { var7, var5 }, this.withCompression);
                }
            }
        }

        /**
         * @deprecated
         */
        public Fp(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
            this(arg0, arg1, arg2, false);
        }

        public ECFieldElement getZCoord(int arg0) {
            return arg0 == 1 && 4 == this.getCurveCoordinateSystem() ? this.getJacobianModifiedW() : super.getZCoord(arg0);
        }

        /**
         * @deprecated
         */
        public Fp(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, boolean arg3) {
            super(arg0, arg1, arg2);
            if (arg1 == null != (arg2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.withCompression = arg3;
        }

        public ECFieldElement three(ECFieldElement arg0) {
            return this.two(arg0).add(arg0);
        }

        public ECFieldElement four(ECFieldElement arg0) {
            return this.two(this.two(arg0));
        }

        public ECFieldElement eight(ECFieldElement arg0) {
            return this.four(this.two(arg0));
        }

        public ECFieldElement doubleProductFromSquares(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement arg3) {
            return arg0.add(arg1).square().subtract(arg2).subtract(arg3);
        }

        public ECPoint negate() {
            if (this.isInfinity()) {
                return this;
            } else {
                ECCurve var1 = this.getCurve();
                int var2 = var1.getCoordinateSystem();
                return var2 == 0 ? new ECPoint.Fp(var1, this.x, this.y.negate(), this.withCompression) : new ECPoint.Fp(var1, this.x, this.y.negate(), this.zs, this.withCompression);
            }
        }

        public ECFieldElement getJacobianModifiedW() {
            ECFieldElement var1 = this.zs[1];
            if (var1 == null) {
                this.zs[1] = var1 = this.calculateJacobianModifiedW(this.zs[0], (ECFieldElement) null);
            }
            return var1;
        }

        public ECPoint twicePlus(ECPoint arg0) {
            if (this == arg0) {
                return this.threeTimes();
            } else if (this.isInfinity()) {
                return arg0;
            } else if (arg0.isInfinity()) {
                return this.twice();
            } else {
                ECFieldElement var2 = this.y;
                if (var2.isZero()) {
                    return arg0;
                }
                ECCurve var3 = this.getCurve();
                int var4 = var3.getCoordinateSystem();
                switch(var4) {
                    case 0:
                        ECFieldElement var5 = this.x;
                        ECFieldElement var6 = arg0.x;
                        ECFieldElement var7 = arg0.y;
                        ECFieldElement var8 = var6.subtract(var5);
                        ECFieldElement var9 = var7.subtract(var2);
                        if (var8.isZero()) {
                            if (var9.isZero()) {
                                return this.threeTimes();
                            }
                            return this;
                        } else {
                            ECFieldElement var10 = var8.square();
                            ECFieldElement var11 = var9.square();
                            ECFieldElement var12 = var10.multiply(this.two(var5).add(var6)).subtract(var11);
                            if (var12.isZero()) {
                                return var3.getInfinity();
                            }
                            ECFieldElement var13 = var12.multiply(var8);
                            ECFieldElement var14 = var13.invert();
                            ECFieldElement var15 = var12.multiply(var14).multiply(var9);
                            ECFieldElement var16 = this.two(var2).multiply(var10).multiply(var8).multiply(var14).subtract(var15);
                            ECFieldElement var17 = var16.subtract(var15).multiply(var15.add(var16)).add(var6);
                            ECFieldElement var18 = var5.subtract(var17).multiply(var16).subtract(var2);
                            return new ECPoint.Fp(var3, var17, var18, this.withCompression);
                        }
                    case 4:
                        return this.twiceJacobianModified(false).add(arg0);
                    default:
                        return this.twice().add(arg0);
                }
            }
        }

        public ECPoint.Fp twiceJacobianModified(boolean arg0) {
            ECFieldElement var2 = this.x;
            ECFieldElement var3 = this.y;
            ECFieldElement var4 = this.zs[0];
            ECFieldElement var5 = this.getJacobianModifiedW();
            ECFieldElement var6 = var2.square();
            ECFieldElement var7 = this.three(var6).add(var5);
            ECFieldElement var8 = this.two(var3);
            ECFieldElement var9 = var8.multiply(var3);
            ECFieldElement var10 = this.two(var2.multiply(var9));
            ECFieldElement var11 = var7.square().subtract(this.two(var10));
            ECFieldElement var12 = var9.square();
            ECFieldElement var13 = this.two(var12);
            ECFieldElement var14 = var7.multiply(var10.subtract(var11)).subtract(var13);
            ECFieldElement var15 = arg0 ? this.two(var13.multiply(var5)) : null;
            ECFieldElement var16 = var4.isOne() ? var8 : var8.multiply(var4);
            return new ECPoint.Fp(this.getCurve(), var11, var14, new ECFieldElement[] { var16, var15 }, this.withCompression);
        }
    }

    public abstract static class AbstractFp extends ECPoint {

        public boolean getCompressionYTilde() {
            return this.getAffineYCoord().testBitZero();
        }

        public AbstractFp(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2) {
            super(arg0, arg1, arg2);
        }

        public AbstractFp(ECCurve arg0, ECFieldElement arg1, ECFieldElement arg2, ECFieldElement[] arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean satisfiesCurveEquation() {
            ECFieldElement var1 = this.x;
            ECFieldElement var2 = this.y;
            ECFieldElement var3 = this.curve.getA();
            ECFieldElement var4 = this.curve.getB();
            ECFieldElement var5 = var2.square();
            switch(this.getCurveCoordinateSystem()) {
                case 0:
                    break;
                case 1:
                    ECFieldElement var10 = this.zs[0];
                    if (!var10.isOne()) {
                        ECFieldElement var11 = var10.square();
                        ECFieldElement var12 = var10.multiply(var11);
                        var5 = var5.multiply(var10);
                        var3 = var3.multiply(var11);
                        var4 = var4.multiply(var12);
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    ECFieldElement var6 = this.zs[0];
                    if (!var6.isOne()) {
                        ECFieldElement var7 = var6.square();
                        ECFieldElement var8 = var7.square();
                        ECFieldElement var9 = var7.multiply(var8);
                        var3 = var3.multiply(var8);
                        var4 = var4.multiply(var9);
                    }
                    break;
                default:
                    throw new IllegalStateException("unsupported coordinate system");
            }
            ECFieldElement var13 = var1.square().add(var3).multiply(var1).add(var4);
            return var5.equals(var13);
        }

        public ECPoint subtract(ECPoint arg0) {
            return arg0.isInfinity() ? this : this.add(arg0.negate());
        }
    }
}
