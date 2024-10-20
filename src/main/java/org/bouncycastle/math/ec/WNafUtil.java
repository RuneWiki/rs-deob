package org.bouncycastle.math.ec;

import java.math.BigInteger;

public abstract class WNafUtil {

    public static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = new int[] { 13, 41, 121, 337, 897, 2305 };

    public static final byte[] EMPTY_BYTES = new byte[0];

    public static final int[] EMPTY_INTS = new int[0];

    public static final ECPoint[] EMPTY_POINTS = new ECPoint[0];

    public static final String PRECOMP_NAME = "bc_wnaf";

    public static ECPoint[] resizeTable(ECPoint[] arg0, int arg1) {
        ECPoint[] var2 = new ECPoint[arg1];
        System.arraycopy(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    public static int[] generateCompactNaf(BigInteger arg0) {
        if (arg0.bitLength() >>> 16 != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (arg0.signum() == 0) {
            return EMPTY_INTS;
        } else {
            BigInteger var1 = arg0.shiftLeft(1).add(arg0);
            int var2 = var1.bitLength();
            int[] var3 = new int[var2 >> 1];
            BigInteger var4 = var1.xor(arg0);
            int var5 = var2 - 1;
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 1; var8 < var5; var8++) {
                if (var4.testBit(var8)) {
                    int var9 = arg0.testBit(var8) ? -1 : 1;
                    var3[var6++] = var9 << 16 | var7;
                    var7 = 1;
                    var8++;
                } else {
                    var7++;
                }
            }
            var3[var6++] = 0x10000 | var7;
            if (var3.length > var6) {
                var3 = trim(var3, var6);
            }
            return var3;
        }
    }

    public static WNafPreCompInfo precompute(ECPoint arg0, int arg1, boolean arg2) {
        ECCurve var3 = arg0.getCurve();
        WNafPreCompInfo var4 = getWNafPreCompInfo(var3.getPreCompInfo(arg0, "bc_wnaf"));
        int var5 = 0;
        int var6 = 0x1 << Math.max(0, arg1 - 2);
        ECPoint[] var7 = var4.getPreComp();
        if (var7 == null) {
            var7 = EMPTY_POINTS;
        } else {
            var5 = var7.length;
        }
        if (var5 < var6) {
            var7 = resizeTable(var7, var6);
            if (var6 == 1) {
                var7[0] = arg0.normalize();
            } else {
                int var8 = var5;
                if (var5 == 0) {
                    var7[0] = arg0;
                    var8 = 1;
                }
                ECFieldElement var9 = null;
                if (var6 == 2) {
                    var7[1] = arg0.threeTimes();
                } else {
                    ECPoint var10 = var4.getTwice();
                    ECPoint var11 = var7[var8 - 1];
                    if (var10 == null) {
                        var10 = var7[0].twice();
                        var4.setTwice(var10);
                        if (!var10.isInfinity() && ECAlgorithms.isFpCurve(var3) && var3.getFieldSize() >= 64) {
                            switch(var3.getCoordinateSystem()) {
                                case 2:
                                case 3:
                                case 4:
                                    var9 = var10.getZCoord(0);
                                    var10 = var3.createPoint(var10.getXCoord().toBigInteger(), var10.getYCoord().toBigInteger());
                                    ECFieldElement var12 = var9.square();
                                    ECFieldElement var13 = var12.multiply(var9);
                                    var11 = var11.scaleX(var12).scaleY(var13);
                                    if (var5 == 0) {
                                        var7[0] = var11;
                                    }
                            }
                        }
                    }
                    while (var8 < var6) {
                        var7[var8++] = var11 = var11.add(var10);
                    }
                }
                var3.normalizeAll(var7, var5, var6 - var5, var9);
            }
        }
        var4.setPreComp(var7);
        if (arg2) {
            ECPoint[] var14 = var4.getPreCompNeg();
            int var15;
            if (var14 == null) {
                var15 = 0;
                var14 = new ECPoint[var6];
            } else {
                var15 = var14.length;
                if (var15 < var6) {
                    var14 = resizeTable(var14, var6);
                }
            }
            while (var15 < var6) {
                var14[var15] = var7[var15].negate();
                var15++;
            }
            var4.setPreCompNeg(var14);
        }
        var3.setPreCompInfo(arg0, "bc_wnaf", var4);
        return var4;
    }

    public static byte[] generateNaf(BigInteger arg0) {
        if (arg0.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger var1 = arg0.shiftLeft(1).add(arg0);
        int var2 = var1.bitLength() - 1;
        byte[] var3 = new byte[var2];
        BigInteger var4 = var1.xor(arg0);
        for (int var5 = 1; var5 < var2; var5++) {
            if (var4.testBit(var5)) {
                var3[var5 - 1] = (byte) (arg0.testBit(var5) ? -1 : 1);
                var5++;
            }
        }
        var3[var2 - 1] = 1;
        return var3;
    }

    public static byte[] generateWindowNaf(int arg0, BigInteger arg1) {
        if (arg0 == 2) {
            return generateNaf(arg1);
        } else if (arg0 < 2 || arg0 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        } else if (arg1.signum() == 0) {
            return EMPTY_BYTES;
        } else {
            byte[] var2 = new byte[arg1.bitLength() + 1];
            int var3 = 0x1 << arg0;
            int var4 = var3 - 1;
            int var5 = var3 >>> 1;
            boolean var6 = false;
            int var7 = 0;
            int var8 = 0;
            while (var8 <= arg1.bitLength()) {
                if (arg1.testBit(var8) == var6) {
                    var8++;
                } else {
                    arg1 = arg1.shiftRight(var8);
                    int var9 = arg1.intValue() & var4;
                    if (var6) {
                        var9++;
                    }
                    var6 = (var9 & var5) != 0;
                    if (var6) {
                        var9 -= var3;
                    }
                    var7 += var7 > 0 ? var8 - 1 : var8;
                    var2[var7++] = (byte) var9;
                    var8 = arg0;
                }
            }
            if (var2.length > var7) {
                var2 = trim(var2, var7);
            }
            return var2;
        }
    }

    public static int getNafWeight(BigInteger arg0) {
        if (arg0.signum() == 0) {
            return 0;
        } else {
            BigInteger var1 = arg0.shiftLeft(1).add(arg0);
            BigInteger var2 = var1.xor(arg0);
            return var2.bitCount();
        }
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint arg0) {
        return getWNafPreCompInfo(arg0.getCurve().getPreCompInfo(arg0, "bc_wnaf"));
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo arg0) {
        return arg0 != null && arg0 instanceof WNafPreCompInfo ? (WNafPreCompInfo) arg0 : new WNafPreCompInfo();
    }

    public static int getWindowSize(int arg0) {
        return getWindowSize(arg0, DEFAULT_WINDOW_SIZE_CUTOFFS);
    }

    public static int[] generateCompactWindowNaf(int arg0, BigInteger arg1) {
        if (arg0 == 2) {
            return generateCompactNaf(arg1);
        } else if (arg0 < 2 || arg0 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        } else if (arg1.bitLength() >>> 16 != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        } else if (arg1.signum() == 0) {
            return EMPTY_INTS;
        } else {
            int[] var2 = new int[arg1.bitLength() / arg0 + 1];
            int var3 = 0x1 << arg0;
            int var4 = var3 - 1;
            int var5 = var3 >>> 1;
            boolean var6 = false;
            int var7 = 0;
            int var8 = 0;
            while (var8 <= arg1.bitLength()) {
                if (arg1.testBit(var8) == var6) {
                    var8++;
                } else {
                    arg1 = arg1.shiftRight(var8);
                    int var9 = arg1.intValue() & var4;
                    if (var6) {
                        var9++;
                    }
                    var6 = (var9 & var5) != 0;
                    if (var6) {
                        var9 -= var3;
                    }
                    int var10 = var7 > 0 ? var8 - 1 : var8;
                    var2[var7++] = var9 << 16 | var10;
                    var8 = arg0;
                }
            }
            if (var2.length > var7) {
                var2 = trim(var2, var7);
            }
            return var2;
        }
    }

    public static ECPoint mapPointWithPrecomp(ECPoint arg0, int arg1, boolean arg2, ECPointMap arg3) {
        ECCurve var4 = arg0.getCurve();
        WNafPreCompInfo var5 = precompute(arg0, arg1, arg2);
        ECPoint var6 = arg3.map(arg0);
        WNafPreCompInfo var7 = getWNafPreCompInfo(var4.getPreCompInfo(var6, "bc_wnaf"));
        ECPoint var8 = var5.getTwice();
        if (var8 != null) {
            ECPoint var9 = arg3.map(var8);
            var7.setTwice(var9);
        }
        ECPoint[] var10 = var5.getPreComp();
        ECPoint[] var11 = new ECPoint[var10.length];
        for (int var12 = 0; var12 < var10.length; var12++) {
            var11[var12] = arg3.map(var10[var12]);
        }
        var7.setPreComp(var11);
        if (arg2) {
            ECPoint[] var13 = new ECPoint[var11.length];
            for (int var14 = 0; var14 < var13.length; var14++) {
                var13[var14] = var11[var14].negate();
            }
            var7.setPreCompNeg(var13);
        }
        var4.setPreCompInfo(var6, "bc_wnaf", var7);
        return var6;
    }

    public static byte[] generateJSF(BigInteger arg0, BigInteger arg1) {
        int var2 = Math.max(arg0.bitLength(), arg1.bitLength()) + 1;
        byte[] var3 = new byte[var2];
        BigInteger var4 = arg0;
        BigInteger var5 = arg1;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        while ((var7 | var8) != 0 || var4.bitLength() > var9 || var5.bitLength() > var9) {
            int var10 = (var4.intValue() >>> var9) + var7 & 0x7;
            int var11 = (var5.intValue() >>> var9) + var8 & 0x7;
            int var12 = var10 & 0x1;
            if (var12 != 0) {
                var12 -= var10 & 0x2;
                if (var10 + var12 == 4 && (var11 & 0x3) == 2) {
                    var12 = -var12;
                }
            }
            int var13 = var11 & 0x1;
            if (var13 != 0) {
                var13 -= var11 & 0x2;
                if (var11 + var13 == 4 && (var10 & 0x3) == 2) {
                    var13 = -var13;
                }
            }
            if (var7 << 1 == var12 + 1) {
                var7 ^= 0x1;
            }
            if (var8 << 1 == var13 + 1) {
                var8 ^= 0x1;
            }
            var9++;
            if (var9 == 30) {
                var9 = 0;
                var4 = var4.shiftRight(30);
                var5 = var5.shiftRight(30);
            }
            var3[var6++] = (byte) (var12 << 4 | var13 & 0xF);
        }
        if (var3.length > var6) {
            var3 = trim(var3, var6);
        }
        return var3;
    }

    public static byte[] trim(byte[] arg0, int arg1) {
        byte[] var2 = new byte[arg1];
        System.arraycopy(arg0, 0, var2, 0, var2.length);
        return var2;
    }

    public static int[] trim(int[] arg0, int arg1) {
        int[] var2 = new int[arg1];
        System.arraycopy(arg0, 0, var2, 0, var2.length);
        return var2;
    }

    public static int getWindowSize(int arg0, int[] arg1) {
        int var2;
        for (var2 = 0; var2 < arg1.length && arg0 >= arg1[var2]; var2++) {
        }
        return var2 + 2;
    }
}
