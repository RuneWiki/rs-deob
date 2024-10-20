package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class Tnaf {

    public static final BigInteger MINUS_ONE = ECConstants.ONE.negate();

    public static final BigInteger MINUS_TWO = ECConstants.TWO.negate();

    public static final BigInteger MINUS_THREE = ECConstants.THREE.negate();

    public static final ZTauElement[] alpha0 = new ZTauElement[] { null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(MINUS_THREE, MINUS_ONE), null, new ZTauElement(MINUS_ONE, MINUS_ONE), null, new ZTauElement(ECConstants.ONE, MINUS_ONE), null };

    public static final byte[][] alpha0Tnaf = new byte[][] { null, { 1 }, null, { -1, 0, 1 }, null, { 1, 0, 1 }, null, { -1, 0, 0, 1 } };

    public static final ZTauElement[] alpha1 = new ZTauElement[] { null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(MINUS_THREE, ECConstants.ONE), null, new ZTauElement(MINUS_ONE, ECConstants.ONE), null, new ZTauElement(ECConstants.ONE, ECConstants.ONE), null };

    public static final byte[][] alpha1Tnaf = new byte[][] { null, { 1 }, null, { -1, 0, 1 }, null, { 1, 0, 1 }, null, { -1, 0, 0, -1 } };

    public static final byte POW_2_WIDTH = 16;

    public static final byte WIDTH = 4;

    public static BigInteger norm(byte arg0, ZTauElement arg1) {
        BigInteger var2 = arg1.u.multiply(arg1.u);
        BigInteger var3 = arg1.u.multiply(arg1.v);
        BigInteger var4 = arg1.v.multiply(arg1.v).shiftLeft(1);
        BigInteger var5;
        if (arg0 == 1) {
            var5 = var2.add(var3).add(var4);
        } else if (arg0 == -1) {
            var5 = var2.subtract(var3).add(var4);
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        return var5;
    }

    public static byte[] tauAdicWNaf(byte arg0, ZTauElement arg1, byte arg2, BigInteger arg3, BigInteger arg4, ZTauElement[] arg5) {
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger var6 = norm(arg0, arg1);
        int var7 = var6.bitLength();
        int var8 = var7 > 30 ? var7 + 4 + arg2 : arg2 + 34;
        byte[] var9 = new byte[var8];
        BigInteger var10 = arg3.shiftRight(1);
        BigInteger var11 = arg1.u;
        BigInteger var12 = arg1.v;
        int var13 = 0;
        while (!var11.equals(ECConstants.ZERO) || !var12.equals(ECConstants.ZERO)) {
            if (var11.testBit(0)) {
                BigInteger var14 = var11.add(var12.multiply(arg4)).mod(arg3);
                byte var15;
                if (var14.compareTo(var10) >= 0) {
                    var15 = (byte) var14.subtract(arg3).intValue();
                } else {
                    var15 = (byte) var14.intValue();
                }
                var9[var13] = var15;
                boolean var16 = true;
                if (var15 < 0) {
                    var16 = false;
                    var15 = (byte) (-var15);
                }
                if (var16) {
                    var11 = var11.subtract(arg5[var15].u);
                    var12 = var12.subtract(arg5[var15].v);
                } else {
                    var11 = var11.add(arg5[var15].u);
                    var12 = var12.add(arg5[var15].v);
                }
            } else {
                var9[var13] = 0;
            }
            BigInteger var17 = var11;
            if (arg0 == 1) {
                var11 = var12.add(var11.shiftRight(1));
            } else {
                var11 = var12.subtract(var11.shiftRight(1));
            }
            var12 = var17.shiftRight(1).negate();
            var13++;
        }
        return var9;
    }

    public static byte getMu(int arg0) {
        return (byte) (arg0 == 0 ? -1 : 1);
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger arg0, BigInteger arg1, BigInteger arg2, byte arg3, int arg4, int arg5) {
        int var6 = (arg4 + 5) / 2 + arg5;
        BigInteger var7 = arg0.shiftRight(arg4 - var6 - 2 + arg3);
        BigInteger var8 = arg1.multiply(var7);
        BigInteger var9 = var8.shiftRight(arg4);
        BigInteger var10 = arg2.multiply(var9);
        BigInteger var11 = var8.add(var10);
        BigInteger var12 = var11.shiftRight(var6 - arg5);
        if (var11.testBit(var6 - arg5 - 1)) {
            var12 = var12.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(var12, arg5);
    }

    public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m arg0, ZTauElement arg1) {
        ECCurve.AbstractF2m var2 = (ECCurve.AbstractF2m) arg0.getCurve();
        byte var3 = getMu(var2.getA());
        byte[] var4 = tauAdicNaf(var3, arg1);
        return multiplyFromTnaf(arg0, var4);
    }

    public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m arg0) {
        return arg0.tau();
    }

    public static byte getMu(ECCurve.AbstractF2m arg0) {
        if (!arg0.isKoblitz()) {
            throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
        }
        return (byte) (arg0.getA().isZero() ? -1 : 1);
    }

    public static byte getMu(ECFieldElement arg0) {
        return (byte) (arg0.isZero() ? -1 : 1);
    }

    public static int getShiftsForCofactor(BigInteger arg0) {
        if (arg0 != null) {
            if (arg0.equals(ECConstants.TWO)) {
                return 1;
            }
            if (arg0.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] getLucas(byte arg0, int arg1, boolean arg2) {
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger var3;
        BigInteger var4;
        if (arg2) {
            var3 = ECConstants.TWO;
            var4 = BigInteger.valueOf((long) arg0);
        } else {
            var3 = ECConstants.ZERO;
            var4 = ECConstants.ONE;
        }
        for (int var5 = 1; var5 < arg1; var5++) {
            Object var6 = null;
            BigInteger var7;
            if (arg0 == 1) {
                var7 = var4;
            } else {
                var7 = var4.negate();
            }
            BigInteger var8 = var7.subtract(var3.shiftLeft(1));
            var3 = var4;
            var4 = var8;
        }
        return new BigInteger[] { var3, var4 };
    }

    public static BigInteger getTw(byte arg0, int arg1) {
        if (arg1 == 4) {
            return arg0 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        } else {
            BigInteger[] var2 = getLucas(arg0, arg1, false);
            BigInteger var3 = ECConstants.ZERO.setBit(arg1);
            BigInteger var4 = var2[1].modInverse(var3);
            return ECConstants.TWO.multiply(var2[0]).multiply(var4).mod(var3);
        }
    }

    public static BigInteger[] getSi(ECCurve.AbstractF2m arg0) {
        if (!arg0.isKoblitz()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int var1 = arg0.getFieldSize();
        int var2 = arg0.getA().toBigInteger().intValue();
        byte var3 = getMu(var2);
        int var4 = getShiftsForCofactor(arg0.getCofactor());
        int var5 = var1 + 3 - var2;
        BigInteger[] var6 = getLucas(var3, var5, false);
        if (var3 == 1) {
            var6[0] = var6[0].negate();
            var6[1] = var6[1].negate();
        }
        BigInteger var7 = ECConstants.ONE.add(var6[1]).shiftRight(var4);
        BigInteger var8 = ECConstants.ONE.add(var6[0]).shiftRight(var4).negate();
        return new BigInteger[] { var7, var8 };
    }

    public static SimpleBigDecimal norm(byte arg0, SimpleBigDecimal arg1, SimpleBigDecimal arg2) {
        SimpleBigDecimal var3 = arg1.multiply(arg1);
        SimpleBigDecimal var4 = arg1.multiply(arg2);
        SimpleBigDecimal var5 = arg2.multiply(arg2).shiftLeft(1);
        SimpleBigDecimal var6;
        if (arg0 == 1) {
            var6 = var3.add(var4).add(var5);
        } else if (arg0 == -1) {
            var6 = var3.subtract(var4).add(var5);
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        return var6;
    }

    public static byte[] tauAdicNaf(byte arg0, ZTauElement arg1) {
        if (arg0 != 1 && arg0 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger var2 = norm(arg0, arg1);
        int var3 = var2.bitLength();
        int var4 = var3 > 30 ? var3 + 4 : 34;
        byte[] var5 = new byte[var4];
        int var6 = 0;
        int var7 = 0;
        BigInteger var8 = arg1.u;
        BigInteger var9 = arg1.v;
        while (!var8.equals(ECConstants.ZERO) || !var9.equals(ECConstants.ZERO)) {
            if (var8.testBit(0)) {
                var5[var6] = (byte) ECConstants.TWO.subtract(var8.subtract(var9.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                if (var5[var6] == 1) {
                    var8 = var8.clearBit(0);
                } else {
                    var8 = var8.add(ECConstants.ONE);
                }
                var7 = var6;
            } else {
                var5[var6] = 0;
            }
            BigInteger var11 = var8;
            BigInteger var12 = var8.shiftRight(1);
            if (arg0 == 1) {
                var8 = var9.add(var12);
            } else {
                var8 = var9.subtract(var12);
            }
            var9 = var11.shiftRight(1).negate();
            var6++;
        }
        var7++;
        byte[] var10 = new byte[var7];
        System.arraycopy(var5, 0, var10, 0, var7);
        return var10;
    }

    public static ZTauElement partModReduction(BigInteger arg0, int arg1, byte arg2, BigInteger[] arg3, byte arg4, byte arg5) {
        BigInteger var6;
        if (arg4 == 1) {
            var6 = arg3[0].add(arg3[1]);
        } else {
            var6 = arg3[0].subtract(arg3[1]);
        }
        BigInteger[] var7 = getLucas(arg4, arg1, true);
        BigInteger var8 = var7[1];
        SimpleBigDecimal var9 = approximateDivisionByN(arg0, arg3[0], var8, arg2, arg1, arg5);
        SimpleBigDecimal var10 = approximateDivisionByN(arg0, arg3[1], var8, arg2, arg1, arg5);
        ZTauElement var11 = round(var9, var10, arg4);
        BigInteger var12 = arg0.subtract(var6.multiply(var11.u)).subtract(BigInteger.valueOf(2L).multiply(arg3[1]).multiply(var11.v));
        BigInteger var13 = arg3[1].multiply(var11.u).subtract(arg3[0].multiply(var11.v));
        return new ZTauElement(var12, var13);
    }

    public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m arg0, BigInteger arg1) {
        ECCurve.AbstractF2m var2 = (ECCurve.AbstractF2m) arg0.getCurve();
        int var3 = var2.getFieldSize();
        int var4 = var2.getA().toBigInteger().intValue();
        byte var5 = getMu(var4);
        BigInteger[] var6 = var2.getSi();
        ZTauElement var7 = partModReduction(arg1, var3, (byte) var4, var6, var5, (byte) 10);
        return multiplyTnaf(arg0, var7);
    }

    public static ZTauElement round(SimpleBigDecimal arg0, SimpleBigDecimal arg1, byte arg2) {
        int var3 = arg0.getScale();
        if (arg1.getScale() != var3) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        } else if (arg2 == 1 || arg2 == -1) {
            BigInteger var4 = arg0.round();
            BigInteger var5 = arg1.round();
            SimpleBigDecimal var6 = arg0.subtract(var4);
            SimpleBigDecimal var7 = arg1.subtract(var5);
            SimpleBigDecimal var8 = var6.add(var6);
            SimpleBigDecimal var9;
            if (arg2 == 1) {
                var9 = var8.add(var7);
            } else {
                var9 = var8.subtract(var7);
            }
            SimpleBigDecimal var10 = var7.add(var7).add(var7);
            SimpleBigDecimal var11 = var10.add(var7);
            SimpleBigDecimal var12;
            SimpleBigDecimal var13;
            if (arg2 == 1) {
                var12 = var6.subtract(var10);
                var13 = var6.add(var11);
            } else {
                var12 = var6.add(var10);
                var13 = var6.subtract(var11);
            }
            byte var14 = 0;
            byte var15 = 0;
            if (var9.compareTo(ECConstants.ONE) >= 0) {
                if (var12.compareTo(MINUS_ONE) < 0) {
                    var15 = arg2;
                } else {
                    var14 = 1;
                }
            } else if (var13.compareTo(ECConstants.TWO) >= 0) {
                var15 = arg2;
            }
            if (var9.compareTo(MINUS_ONE) < 0) {
                if (var12.compareTo(ECConstants.ONE) >= 0) {
                    var15 = (byte) (-arg2);
                } else {
                    var14 = -1;
                }
            } else if (var13.compareTo(MINUS_TWO) < 0) {
                var15 = (byte) (-arg2);
            }
            BigInteger var16 = var4.add(BigInteger.valueOf((long) var14));
            BigInteger var17 = var5.add(BigInteger.valueOf((long) var15));
            return new ZTauElement(var16, var17);
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }

    public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m arg0, byte[] arg1) {
        ECCurve var2 = arg0.getCurve();
        ECPoint.AbstractF2m var3 = (ECPoint.AbstractF2m) var2.getInfinity();
        ECPoint.AbstractF2m var4 = (ECPoint.AbstractF2m) arg0.negate();
        int var5 = 0;
        for (int var6 = arg1.length - 1; var6 >= 0; var6--) {
            var5++;
            byte var7 = arg1[var6];
            if (var7 != 0) {
                ECPoint.AbstractF2m var8 = var3.tauPow(var5);
                var5 = 0;
                ECPoint.AbstractF2m var9 = var7 > 0 ? arg0 : var4;
                var3 = (ECPoint.AbstractF2m) var8.add(var9);
            }
        }
        if (var5 > 0) {
            var3 = var3.tauPow(var5);
        }
        return var3;
    }

    public static BigInteger[] getSi(int arg0, int arg1, BigInteger arg2) {
        byte var3 = getMu(arg1);
        int var4 = getShiftsForCofactor(arg2);
        int var5 = arg0 + 3 - arg1;
        BigInteger[] var6 = getLucas(var3, var5, false);
        if (var3 == 1) {
            var6[0] = var6[0].negate();
            var6[1] = var6[1].negate();
        }
        BigInteger var7 = ECConstants.ONE.add(var6[1]).shiftRight(var4);
        BigInteger var8 = ECConstants.ONE.add(var6[0]).shiftRight(var4).negate();
        return new BigInteger[] { var7, var8 };
    }

    public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m arg0, byte arg1) {
        byte[][] var2 = arg1 == 0 ? alpha0Tnaf : alpha1Tnaf;
        ECPoint.AbstractF2m[] var3 = new ECPoint.AbstractF2m[var2.length + 1 >>> 1];
        var3[0] = arg0;
        int var4 = var2.length;
        for (int var5 = 3; var5 < var4; var5 += 2) {
            var3[var5 >>> 1] = multiplyFromTnaf(arg0, var2[var5]);
        }
        arg0.getCurve().normalizeAll(var3);
        return var3;
    }
}
