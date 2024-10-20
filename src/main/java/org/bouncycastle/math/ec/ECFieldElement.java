package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

public abstract class ECFieldElement implements ECConstants {

    public abstract String getFieldName();

    public abstract BigInteger toBigInteger();

    public abstract int getFieldSize();

    public abstract ECFieldElement square();

    public abstract ECFieldElement invert();

    public abstract ECFieldElement negate();

    public abstract ECFieldElement multiply(ECFieldElement arg0);

    public abstract ECFieldElement divide(ECFieldElement arg0);

    public abstract ECFieldElement addOne();

    public abstract ECFieldElement subtract(ECFieldElement arg0);

    public String toString() {
        return this.toBigInteger().toString(16);
    }

    public abstract ECFieldElement sqrt();

    public int bitLength() {
        return this.toBigInteger().bitLength();
    }

    public boolean isOne() {
        return this.bitLength() == 1;
    }

    public boolean isZero() {
        return 0 == this.toBigInteger().signum();
    }

    public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiply(arg0).subtract(arg1.multiply(arg2));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
        return this.multiply(arg0).add(arg1.multiply(arg2));
    }

    public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.square().subtract(arg0.multiply(arg1));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
        return this.square().add(arg0.multiply(arg1));
    }

    public ECFieldElement squarePow(int arg0) {
        ECFieldElement var2 = this;
        for (int var3 = 0; var3 < arg0; var3++) {
            var2 = var2.square();
        }
        return var2;
    }

    public boolean testBitZero() {
        return this.toBigInteger().testBit(0);
    }

    public abstract ECFieldElement add(ECFieldElement arg0);

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray((this.getFieldSize() + 7) / 8, this.toBigInteger());
    }

    public String amw() {
        return this.toBigInteger().toString(16);
    }

    public String amu() {
        return this.toBigInteger().toString(16);
    }

    public static class Fp extends ECFieldElement {

        public BigInteger q;

        public BigInteger r;

        public BigInteger x;

        public ECFieldElement multiply(ECFieldElement arg0) {
            return new ECFieldElement.Fp(this.q, this.r, this.modMult(this.x, arg0.toBigInteger()));
        }

        /**
         * @deprecated
         */
        public Fp(BigInteger arg0, BigInteger arg1) {
            this(arg0, calculateResidue(arg0), arg1);
        }

        public Fp(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
            if (arg2 == null || arg2.signum() < 0 || arg2.compareTo(arg0) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.q = arg0;
            this.r = arg1;
            this.x = arg2;
        }

        public BigInteger toBigInteger() {
            return this.x;
        }

        public BigInteger modDouble(BigInteger arg0) {
            BigInteger var2 = arg0.shiftLeft(1);
            if (var2.compareTo(this.q) >= 0) {
                var2 = var2.subtract(this.q);
            }
            return var2;
        }

        public int getFieldSize() {
            return this.q.bitLength();
        }

        public BigInteger getQ() {
            return this.q;
        }

        public ECFieldElement add(ECFieldElement arg0) {
            return new ECFieldElement.Fp(this.q, this.r, this.modAdd(this.x, arg0.toBigInteger()));
        }

        public ECFieldElement square() {
            return new ECFieldElement.Fp(this.q, this.r, this.modMult(this.x, this.x));
        }

        public int ams() {
            return this.q.hashCode() ^ this.x.hashCode();
        }

        public ECFieldElement sqrt() {
            if (this.isZero() || this.isOne()) {
                return this;
            } else if (!this.q.testBit(0)) {
                throw new RuntimeException("not done yet");
            } else if (this.q.testBit(1)) {
                BigInteger var1 = this.q.shiftRight(2).add(ECConstants.ONE);
                return this.checkSqrt(new ECFieldElement.Fp(this.q, this.r, this.x.modPow(var1, this.q)));
            } else if (this.q.testBit(2)) {
                BigInteger var2 = this.x.modPow(this.q.shiftRight(3), this.q);
                BigInteger var3 = this.modMult(var2, this.x);
                BigInteger var4 = this.modMult(var3, var2);
                if (var4.equals(ECConstants.ONE)) {
                    return this.checkSqrt(new ECFieldElement.Fp(this.q, this.r, var3));
                } else {
                    BigInteger var5 = ECConstants.TWO.modPow(this.q.shiftRight(2), this.q);
                    BigInteger var6 = this.modMult(var3, var5);
                    return this.checkSqrt(new ECFieldElement.Fp(this.q, this.r, var6));
                }
            } else {
                BigInteger var7 = this.q.shiftRight(1);
                if (!this.x.modPow(var7, this.q).equals(ECConstants.ONE)) {
                    return null;
                }
                BigInteger var8 = this.x;
                BigInteger var9 = this.modDouble(this.modDouble(var8));
                BigInteger var10 = var7.add(ECConstants.ONE);
                BigInteger var11 = this.q.subtract(ECConstants.ONE);
                Random var12 = new Random();
                while (true) {
                    BigInteger var13;
                    do {
                        var13 = new BigInteger(this.q.bitLength(), var12);
                    } while (var13.compareTo(this.q) >= 0);
                    if (this.modReduce(var13.multiply(var13).subtract(var9)).modPow(var7, this.q).equals(var11)) {
                        BigInteger[] var14 = this.lucasSequence(var13, var8, var10);
                        BigInteger var15 = var14[0];
                        BigInteger var16 = var14[1];
                        if (this.modMult(var16, var16).equals(var9)) {
                            return new ECFieldElement.Fp(this.q, this.r, this.modHalfAbs(var16));
                        }
                        if (!var15.equals(ECConstants.ONE) && !var15.equals(var11)) {
                            return null;
                        }
                    }
                }
            }
        }

        public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
            BigInteger var4 = this.x;
            BigInteger var5 = arg0.toBigInteger();
            BigInteger var6 = arg1.toBigInteger();
            BigInteger var7 = arg2.toBigInteger();
            BigInteger var8 = var4.multiply(var5);
            BigInteger var9 = var6.multiply(var7);
            return new ECFieldElement.Fp(this.q, this.r, this.modReduce(var8.subtract(var9)));
        }

        public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
            BigInteger var4 = this.x;
            BigInteger var5 = arg0.toBigInteger();
            BigInteger var6 = arg1.toBigInteger();
            BigInteger var7 = arg2.toBigInteger();
            BigInteger var8 = var4.multiply(var5);
            BigInteger var9 = var6.multiply(var7);
            return new ECFieldElement.Fp(this.q, this.r, this.modReduce(var8.add(var9)));
        }

        public ECFieldElement divide(ECFieldElement arg0) {
            return new ECFieldElement.Fp(this.q, this.r, this.modMult(this.x, this.modInverse(arg0.toBigInteger())));
        }

        public ECFieldElement addOne() {
            BigInteger var1 = this.x.add(ECConstants.ONE);
            if (var1.compareTo(this.q) == 0) {
                var1 = ECConstants.ZERO;
            }
            return new ECFieldElement.Fp(this.q, this.r, var1);
        }

        public boolean gj(Object arg0) {
            if (this == arg0) {
                return true;
            } else if ((arg0 instanceof ECFieldElement.Fp)) {
                ECFieldElement.Fp var2 = (ECFieldElement.Fp) arg0;
                return this.q.equals(var2.q) && this.x.equals(var2.x);
            } else {
                return false;
            }
        }

        public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
            BigInteger var3 = this.x;
            BigInteger var4 = arg0.toBigInteger();
            BigInteger var5 = arg1.toBigInteger();
            BigInteger var6 = var3.multiply(var3);
            BigInteger var7 = var4.multiply(var5);
            return new ECFieldElement.Fp(this.q, this.r, this.modReduce(var6.subtract(var7)));
        }

        public int amg() {
            return this.q.hashCode() ^ this.x.hashCode();
        }

        public ECFieldElement negate() {
            return this.x.signum() == 0 ? this : new ECFieldElement.Fp(this.q, this.r, this.q.subtract(this.x));
        }

        public ECFieldElement subtract(ECFieldElement arg0) {
            return new ECFieldElement.Fp(this.q, this.r, this.modSubtract(this.x, arg0.toBigInteger()));
        }

        public ECFieldElement checkSqrt(ECFieldElement arg0) {
            return arg0.square().equals(this) ? arg0 : null;
        }

        public BigInteger[] lucasSequence(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
            int var4 = arg2.bitLength();
            int var5 = arg2.getLowestSetBit();
            BigInteger var6 = ECConstants.ONE;
            BigInteger var7 = ECConstants.TWO;
            BigInteger var8 = arg0;
            BigInteger var9 = ECConstants.ONE;
            BigInteger var10 = ECConstants.ONE;
            for (int var11 = var4 - 1; var11 >= var5 + 1; var11--) {
                var9 = this.modMult(var9, var10);
                if (arg2.testBit(var11)) {
                    var10 = this.modMult(var9, arg1);
                    var6 = this.modMult(var6, var8);
                    var7 = this.modReduce(var8.multiply(var7).subtract(arg0.multiply(var9)));
                    var8 = this.modReduce(var8.multiply(var8).subtract(var10.shiftLeft(1)));
                } else {
                    var10 = var9;
                    var6 = this.modReduce(var6.multiply(var7).subtract(var9));
                    var8 = this.modReduce(var8.multiply(var7).subtract(arg0.multiply(var9)));
                    var7 = this.modReduce(var7.multiply(var7).subtract(var9.shiftLeft(1)));
                }
            }
            BigInteger var12 = this.modMult(var9, var10);
            BigInteger var13 = this.modMult(var12, arg1);
            BigInteger var14 = this.modReduce(var6.multiply(var7).subtract(var12));
            BigInteger var15 = this.modReduce(var8.multiply(var7).subtract(arg0.multiply(var12)));
            BigInteger var16 = this.modMult(var12, var13);
            for (int var17 = 1; var17 <= var5; var17++) {
                var14 = this.modMult(var14, var15);
                var15 = this.modReduce(var15.multiply(var15).subtract(var16.shiftLeft(1)));
                var16 = this.modMult(var16, var16);
            }
            return new BigInteger[] { var14, var15 };
        }

        public BigInteger modAdd(BigInteger arg0, BigInteger arg1) {
            BigInteger var3 = arg0.add(arg1);
            if (var3.compareTo(this.q) >= 0) {
                var3 = var3.subtract(this.q);
            }
            return var3;
        }

        public ECFieldElement invert() {
            return new ECFieldElement.Fp(this.q, this.r, this.modInverse(this.x));
        }

        public BigInteger modHalf(BigInteger arg0) {
            if (arg0.testBit(0)) {
                arg0 = this.q.add(arg0);
            }
            return arg0.shiftRight(1);
        }

        public BigInteger modHalfAbs(BigInteger arg0) {
            if (arg0.testBit(0)) {
                arg0 = this.q.subtract(arg0);
            }
            return arg0.shiftRight(1);
        }

        public BigInteger modInverse(BigInteger arg0) {
            int var2 = this.getFieldSize();
            int var3 = var2 + 31 >> 5;
            int[] var4 = Nat.fromBigInteger(var2, this.q);
            int[] var5 = Nat.fromBigInteger(var2, arg0);
            int[] var6 = Nat.create(var3);
            Mod.invert(var4, var5, var6);
            return Nat.toBigInteger(var3, var6);
        }

        public static BigInteger calculateResidue(BigInteger arg0) {
            int var1 = arg0.bitLength();
            if (var1 >= 96) {
                BigInteger var2 = arg0.shiftRight(var1 - 64);
                if (var2.longValue() == -1L) {
                    return ONE.shiftLeft(var1).subtract(arg0);
                }
            }
            return null;
        }

        public BigInteger modReduce(BigInteger arg0) {
            if (this.r == null) {
                arg0 = arg0.mod(this.q);
            } else {
                boolean var2 = arg0.signum() < 0;
                if (var2) {
                    arg0 = arg0.abs();
                }
                int var3 = this.q.bitLength();
                boolean var4 = this.r.equals(ECConstants.ONE);
                while (arg0.bitLength() > var3 + 1) {
                    BigInteger var5 = arg0.shiftRight(var3);
                    BigInteger var6 = arg0.subtract(var5.shiftLeft(var3));
                    if (!var4) {
                        var5 = var5.multiply(this.r);
                    }
                    arg0 = var5.add(var6);
                }
                while (arg0.compareTo(this.q) >= 0) {
                    arg0 = arg0.subtract(this.q);
                }
                if (var2 && arg0.signum() != 0) {
                    arg0 = this.q.subtract(arg0);
                }
            }
            return arg0;
        }

        public BigInteger modSubtract(BigInteger arg0, BigInteger arg1) {
            BigInteger var3 = arg0.subtract(arg1);
            if (var3.signum() < 0) {
                var3 = var3.add(this.q);
            }
            return var3;
        }

        public boolean equals(Object arg0) {
            if (this == arg0) {
                return true;
            } else if ((arg0 instanceof ECFieldElement.Fp)) {
                ECFieldElement.Fp var2 = (ECFieldElement.Fp) arg0;
                return this.q.equals(var2.q) && this.x.equals(var2.x);
            } else {
                return false;
            }
        }

        public BigInteger modMult(BigInteger arg0, BigInteger arg1) {
            return this.modReduce(arg0.multiply(arg1));
        }

        public String getFieldName() {
            return "Fp";
        }

        public int hashCode() {
            return this.q.hashCode() ^ this.x.hashCode();
        }

        public int amf() {
            return this.q.hashCode() ^ this.x.hashCode();
        }

        public int amb() {
            return this.q.hashCode() ^ this.x.hashCode();
        }

        public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
            BigInteger var3 = this.x;
            BigInteger var4 = arg0.toBigInteger();
            BigInteger var5 = arg1.toBigInteger();
            BigInteger var6 = var3.multiply(var3);
            BigInteger var7 = var4.multiply(var5);
            return new ECFieldElement.Fp(this.q, this.r, this.modReduce(var6.add(var7)));
        }

        public int aml() {
            return this.q.hashCode() ^ this.x.hashCode();
        }
    }

    public static class F2m extends ECFieldElement {

        public int representation;

        public int[] ks;

        public int m;

        public LongArray x;

        public static final int GNB = 1;

        public static final int PPB = 3;

        public static final int TPB = 2;

        public boolean isOne() {
            return this.x.isOne();
        }

        /**
         * @deprecated
         */
        public F2m(int arg0, int arg1, BigInteger arg2) {
            this(arg0, arg1, 0, 0, arg2);
        }

        public int aml() {
            return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
        }

        public ECFieldElement squareMinusProduct(ECFieldElement arg0, ECFieldElement arg1) {
            return this.squarePlusProduct(arg0, arg1);
        }

        public ECFieldElement add(ECFieldElement arg0) {
            LongArray var2 = (LongArray) this.x.clone();
            ECFieldElement.F2m var3 = (ECFieldElement.F2m) arg0;
            var2.addShiftedByWords(var3.x, 0);
            return new ECFieldElement.F2m(this.m, this.ks, var2);
        }

        public boolean isZero() {
            return this.x.isZero();
        }

        public boolean testBitZero() {
            return this.x.testBitZero();
        }

        public BigInteger toBigInteger() {
            return this.x.toBigInteger();
        }

        public int getK3() {
            return this.ks.length >= 3 ? this.ks[2] : 0;
        }

        public ECFieldElement sqrt() {
            return this.x.isZero() || this.x.isOne() ? this : this.squarePow(this.m - 1);
        }

        public int bitLength() {
            return this.x.degree();
        }

        public boolean equals(Object arg0) {
            if (this == arg0) {
                return true;
            } else if ((arg0 instanceof ECFieldElement.F2m)) {
                ECFieldElement.F2m var2 = (ECFieldElement.F2m) arg0;
                return this.m == var2.m && this.representation == var2.representation && Arrays.areEqual(this.ks, var2.ks) && this.x.equals(var2.x);
            } else {
                return false;
            }
        }

        public ECFieldElement addOne() {
            return new ECFieldElement.F2m(this.m, this.ks, this.x.addOne());
        }

        public ECFieldElement subtract(ECFieldElement arg0) {
            return this.add(arg0);
        }

        public ECFieldElement multiply(ECFieldElement arg0) {
            return new ECFieldElement.F2m(this.m, this.ks, this.x.modMultiply(((ECFieldElement.F2m) arg0).x, this.m, this.ks));
        }

        public ECFieldElement multiplyMinusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
            return this.multiplyPlusProduct(arg0, arg1, arg2);
        }

        public int getRepresentation() {
            return this.representation;
        }

        public ECFieldElement divide(ECFieldElement arg0) {
            ECFieldElement var2 = arg0.invert();
            return this.multiply(var2);
        }

        public ECFieldElement negate() {
            return this;
        }

        /**
         * @deprecated
         */
        public F2m(int arg0, int arg1, int arg2, int arg3, BigInteger arg4) {
            if (arg4 == null || arg4.signum() < 0 || arg4.bitLength() > arg0) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (arg2 == 0 && arg3 == 0) {
                this.representation = 2;
                this.ks = new int[] { arg1 };
            } else if (arg2 < arg3) {
                if (arg2 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.representation = 3;
                this.ks = new int[] { arg1, arg2, arg3 };
            } else {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            }
            this.m = arg0;
            this.x = new LongArray(arg4);
        }

        public ECFieldElement square() {
            return new ECFieldElement.F2m(this.m, this.ks, this.x.modSquare(this.m, this.ks));
        }

        public ECFieldElement squarePlusProduct(ECFieldElement arg0, ECFieldElement arg1) {
            LongArray var3 = this.x;
            LongArray var4 = ((ECFieldElement.F2m) arg0).x;
            LongArray var5 = ((ECFieldElement.F2m) arg1).x;
            LongArray var6 = var3.square(this.m, this.ks);
            LongArray var7 = var4.multiply(var5, this.m, this.ks);
            if (var3 == var6) {
                var6 = (LongArray) var6.clone();
            }
            var6.addShiftedByWords(var7, 0);
            var6.reduce(this.m, this.ks);
            return new ECFieldElement.F2m(this.m, this.ks, var6);
        }

        public ECFieldElement squarePow(int arg0) {
            return arg0 < 1 ? this : new ECFieldElement.F2m(this.m, this.ks, this.x.modSquareN(arg0, this.m, this.ks));
        }

        public ECFieldElement invert() {
            return new ECFieldElement.F2m(this.m, this.ks, this.x.modInverse(this.m, this.ks));
        }

        public int getK1() {
            return this.ks[0];
        }

        public int getFieldSize() {
            return this.m;
        }

        public int getM() {
            return this.m;
        }

        public F2m(int arg0, int[] arg1, LongArray arg2) {
            this.m = arg0;
            this.representation = arg1.length == 1 ? 2 : 3;
            this.ks = arg1;
            this.x = arg2;
        }

        public int getK2() {
            return this.ks.length >= 2 ? this.ks[1] : 0;
        }

        public static void checkFieldElements(ECFieldElement arg0, ECFieldElement arg1) {
            if (!arg0 instanceof ECFieldElement.F2m || !arg1 instanceof ECFieldElement.F2m) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            ECFieldElement.F2m var2 = (ECFieldElement.F2m) arg0;
            ECFieldElement.F2m var3 = (ECFieldElement.F2m) arg1;
            if (var2.representation != var3.representation) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            } else if (var2.m != var3.m || !Arrays.areEqual(var2.ks, var3.ks)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        public String getFieldName() {
            return "F2m";
        }

        public int hashCode() {
            return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
        }

        public boolean gj(Object arg0) {
            if (this == arg0) {
                return true;
            } else if ((arg0 instanceof ECFieldElement.F2m)) {
                ECFieldElement.F2m var2 = (ECFieldElement.F2m) arg0;
                return this.m == var2.m && this.representation == var2.representation && Arrays.areEqual(this.ks, var2.ks) && this.x.equals(var2.x);
            } else {
                return false;
            }
        }

        public int ams() {
            return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
        }

        public int amf() {
            return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
        }

        public int amb() {
            return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
        }

        public int amg() {
            return this.x.hashCode() ^ this.m ^ Arrays.hashCode(this.ks);
        }

        public ECFieldElement multiplyPlusProduct(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement arg2) {
            LongArray var4 = this.x;
            LongArray var5 = ((ECFieldElement.F2m) arg0).x;
            LongArray var6 = ((ECFieldElement.F2m) arg1).x;
            LongArray var7 = ((ECFieldElement.F2m) arg2).x;
            LongArray var8 = var4.multiply(var5, this.m, this.ks);
            LongArray var9 = var6.multiply(var7, this.m, this.ks);
            if (var4 == var8 || var5 == var8) {
                var8 = (LongArray) var8.clone();
            }
            var8.addShiftedByWords(var9, 0);
            var8.reduce(this.m, this.ks);
            return new ECFieldElement.F2m(this.m, this.ks, var8);
        }
    }
}
