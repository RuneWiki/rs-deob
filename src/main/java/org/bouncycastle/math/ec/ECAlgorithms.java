package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.PolynomialExtensionField;

public class ECAlgorithms {

    public static boolean isF2mCurve(ECCurve arg0) {
        return isF2mField(arg0.getField());
    }

    public static ECPoint implSumOfMultiplies(ECPoint[] arg0, ECPointMap arg1, BigInteger[] arg2) {
        int var3 = arg0.length;
        int var4 = var3 << 1;
        boolean[] var5 = new boolean[var4];
        WNafPreCompInfo[] var6 = new WNafPreCompInfo[var4];
        byte[][] var7 = new byte[var4][];
        for (int var8 = 0; var8 < var3; var8++) {
            int var9 = var8 << 1;
            int var10 = var9 + 1;
            BigInteger var11 = arg2[var9];
            var5[var9] = var11.signum() < 0;
            BigInteger var12 = var11.abs();
            BigInteger var13 = arg2[var10];
            var5[var10] = var13.signum() < 0;
            BigInteger var14 = var13.abs();
            int var15 = Math.max(2, Math.min(16, WNafUtil.getWindowSize(Math.max(var12.bitLength(), var14.bitLength()))));
            ECPoint var16 = arg0[var8];
            ECPoint var17 = WNafUtil.mapPointWithPrecomp(var16, var15, true, arg1);
            var6[var9] = WNafUtil.getWNafPreCompInfo(var16);
            var6[var10] = WNafUtil.getWNafPreCompInfo(var17);
            var7[var9] = WNafUtil.generateWindowNaf(var15, var12);
            var7[var10] = WNafUtil.generateWindowNaf(var15, var14);
        }
        return implSumOfMultiplies(var5, var6, var7);
    }

    public static boolean isF2mField(FiniteField arg0) {
        return arg0.getDimension() > 1 && arg0.getCharacteristic().equals(ECConstants.TWO) && arg0 instanceof PolynomialExtensionField;
    }

    public static boolean isFpCurve(ECCurve arg0) {
        return isFpField(arg0.getField());
    }

    public static boolean isFpField(FiniteField arg0) {
        return arg0.getDimension() == 1;
    }

    public static ECPoint referenceMultiply(ECPoint arg0, BigInteger arg1) {
        BigInteger var2 = arg1.abs();
        ECPoint var3 = arg0.getCurve().getInfinity();
        int var4 = var2.bitLength();
        if (var4 > 0) {
            if (var2.testBit(0)) {
                var3 = arg0;
            }
            for (int var5 = 1; var5 < var4; var5++) {
                arg0 = arg0.twice();
                if (var2.testBit(var5)) {
                    var3 = var3.add(arg0);
                }
            }
        }
        return arg1.signum() < 0 ? var3.negate() : var3;
    }

    public static ECPoint sumOfTwoMultiplies(ECPoint arg0, BigInteger arg1, ECPoint arg2, BigInteger arg3) {
        ECCurve var4 = arg0.getCurve();
        ECPoint var5 = importPoint(var4, arg2);
        if (var4 instanceof ECCurve.AbstractF2m) {
            ECCurve.AbstractF2m var6 = (ECCurve.AbstractF2m) var4;
            if (var6.isKoblitz()) {
                return validatePoint(arg0.multiply(arg1).add(var5.multiply(arg3)));
            }
        }
        ECEndomorphism var7 = var4.getEndomorphism();
        return var7 instanceof GLVEndomorphism ? validatePoint(implSumOfMultipliesGLV(new ECPoint[] { arg0, var5 }, new BigInteger[] { arg1, arg3 }, (GLVEndomorphism) var7)) : validatePoint(implShamirsTrickWNaf(arg0, arg1, var5, arg3));
    }

    public static ECPoint shamirsTrick(ECPoint arg0, BigInteger arg1, ECPoint arg2, BigInteger arg3) {
        ECCurve var4 = arg0.getCurve();
        ECPoint var5 = importPoint(var4, arg2);
        return validatePoint(implShamirsTrickJsf(arg0, arg1, var5, arg3));
    }

    public static ECPoint implShamirsTrickWNaf(ECPoint[] arg0, ECPoint[] arg1, byte[] arg2, ECPoint[] arg3, ECPoint[] arg4, byte[] arg5) {
        int var6 = Math.max(arg2.length, arg5.length);
        ECCurve var7 = arg0[0].getCurve();
        ECPoint var8 = var7.getInfinity();
        ECPoint var9 = var8;
        int var10 = 0;
        for (int var11 = var6 - 1; var11 >= 0; var11--) {
            byte var12 = var11 < arg2.length ? arg2[var11] : 0;
            byte var13 = var11 < arg5.length ? arg5[var11] : 0;
            if ((var12 | var13) == 0) {
                var10++;
            } else {
                ECPoint var14 = var8;
                if (var12 != 0) {
                    int var15 = Math.abs(var12);
                    ECPoint[] var16 = var12 < 0 ? arg1 : arg0;
                    var14 = var8.add(var16[var15 >>> 1]);
                }
                if (var13 != 0) {
                    int var17 = Math.abs(var13);
                    ECPoint[] var18 = var13 < 0 ? arg4 : arg3;
                    var14 = var14.add(var18[var17 >>> 1]);
                }
                if (var10 > 0) {
                    var9 = var9.timesPow2(var10);
                    var10 = 0;
                }
                var9 = var9.twicePlus(var14);
            }
        }
        if (var10 > 0) {
            var9 = var9.timesPow2(var10);
        }
        return var9;
    }

    public static void montgomeryTrick(ECFieldElement[] arg0, int arg1, int arg2) {
        montgomeryTrick(arg0, arg1, arg2, (ECFieldElement) null);
    }

    public static ECPoint sumOfMultiplies(ECPoint[] arg0, BigInteger[] arg1) {
        if (arg0 == null || arg1 == null || arg0.length != arg1.length || arg0.length < 1) {
            throw new IllegalArgumentException("point and scalar arrays should be non-null, and of equal, non-zero, length");
        }
        int var2 = arg0.length;
        switch(var2) {
            case 1:
                return arg0[0].multiply(arg1[0]);
            case 2:
                return sumOfTwoMultiplies(arg0[0], arg1[0], arg0[1], arg1[1]);
            default:
                ECPoint var3 = arg0[0];
                ECCurve var4 = var3.getCurve();
                ECPoint[] var5 = new ECPoint[var2];
                var5[0] = var3;
                for (int var6 = 1; var6 < var2; var6++) {
                    var5[var6] = importPoint(var4, arg0[var6]);
                }
                ECEndomorphism var7 = var4.getEndomorphism();
                return var7 instanceof GLVEndomorphism ? validatePoint(implSumOfMultipliesGLV(var5, arg1, (GLVEndomorphism) var7)) : validatePoint(implSumOfMultiplies(var5, arg1));
        }
    }

    public static ECPoint validatePoint(ECPoint arg0) {
        if (!arg0.isValid()) {
            throw new IllegalArgumentException("Invalid point");
        }
        return arg0;
    }

    public static ECPoint importPoint(ECCurve arg0, ECPoint arg1) {
        ECCurve var2 = arg1.getCurve();
        if (!arg0.equals(var2)) {
            throw new IllegalArgumentException("Point must be on the same curve");
        }
        return arg0.importPoint(arg1);
    }

    public static ECPoint implShamirsTrickWNaf(ECPoint arg0, BigInteger arg1, ECPoint arg2, BigInteger arg3) {
        boolean var4 = arg1.signum() < 0;
        boolean var5 = arg3.signum() < 0;
        BigInteger var6 = arg1.abs();
        BigInteger var7 = arg3.abs();
        int var8 = Math.max(2, Math.min(16, WNafUtil.getWindowSize(var6.bitLength())));
        int var9 = Math.max(2, Math.min(16, WNafUtil.getWindowSize(var7.bitLength())));
        WNafPreCompInfo var10 = WNafUtil.precompute(arg0, var8, true);
        WNafPreCompInfo var11 = WNafUtil.precompute(arg2, var9, true);
        ECPoint[] var12 = var4 ? var10.getPreCompNeg() : var10.getPreComp();
        ECPoint[] var13 = var5 ? var11.getPreCompNeg() : var11.getPreComp();
        ECPoint[] var14 = var4 ? var10.getPreComp() : var10.getPreCompNeg();
        ECPoint[] var15 = var5 ? var11.getPreComp() : var11.getPreCompNeg();
        byte[] var16 = WNafUtil.generateWindowNaf(var8, var6);
        byte[] var17 = WNafUtil.generateWindowNaf(var9, var7);
        return implShamirsTrickWNaf(var12, var14, var16, var13, var15, var17);
    }

    public static ECPoint implShamirsTrickWNaf(ECPoint arg0, BigInteger arg1, ECPointMap arg2, BigInteger arg3) {
        boolean var4 = arg1.signum() < 0;
        boolean var5 = arg3.signum() < 0;
        BigInteger var6 = arg1.abs();
        BigInteger var7 = arg3.abs();
        int var8 = Math.max(2, Math.min(16, WNafUtil.getWindowSize(Math.max(var6.bitLength(), var7.bitLength()))));
        ECPoint var9 = WNafUtil.mapPointWithPrecomp(arg0, var8, true, arg2);
        WNafPreCompInfo var10 = WNafUtil.getWNafPreCompInfo(arg0);
        WNafPreCompInfo var11 = WNafUtil.getWNafPreCompInfo(var9);
        ECPoint[] var12 = var4 ? var10.getPreCompNeg() : var10.getPreComp();
        ECPoint[] var13 = var5 ? var11.getPreCompNeg() : var11.getPreComp();
        ECPoint[] var14 = var4 ? var10.getPreComp() : var10.getPreCompNeg();
        ECPoint[] var15 = var5 ? var11.getPreComp() : var11.getPreCompNeg();
        byte[] var16 = WNafUtil.generateWindowNaf(var8, var6);
        byte[] var17 = WNafUtil.generateWindowNaf(var8, var7);
        return implShamirsTrickWNaf(var12, var14, var16, var13, var15, var17);
    }

    public static ECPoint implShamirsTrickJsf(ECPoint arg0, BigInteger arg1, ECPoint arg2, BigInteger arg3) {
        ECCurve var4 = arg0.getCurve();
        ECPoint var5 = var4.getInfinity();
        ECPoint var6 = arg0.add(arg2);
        ECPoint var7 = arg0.subtract(arg2);
        ECPoint[] var8 = new ECPoint[] { arg2, var7, arg0, var6 };
        var4.normalizeAll(var8);
        ECPoint[] var9 = new ECPoint[] { var8[3].negate(), var8[2].negate(), var8[1].negate(), var8[0].negate(), var5, var8[0], var8[1], var8[2], var8[3] };
        byte[] var10 = WNafUtil.generateJSF(arg1, arg3);
        ECPoint var11 = var5;
        int var12 = var10.length;
        while (true) {
            var12--;
            if (var12 < 0) {
                return var11;
            }
            byte var13 = var10[var12];
            int var14 = var13 << 24 >> 28;
            int var15 = var13 << 28 >> 28;
            int var16 = var14 * 3 + 4 + var15;
            var11 = var11.twicePlus(var9[var16]);
        }
    }

    public static ECPoint implSumOfMultiplies(ECPoint[] arg0, BigInteger[] arg1) {
        int var2 = arg0.length;
        boolean[] var3 = new boolean[var2];
        WNafPreCompInfo[] var4 = new WNafPreCompInfo[var2];
        byte[][] var5 = new byte[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            BigInteger var7 = arg1[var6];
            var3[var6] = var7.signum() < 0;
            BigInteger var8 = var7.abs();
            int var9 = Math.max(2, Math.min(16, WNafUtil.getWindowSize(var8.bitLength())));
            var4[var6] = WNafUtil.precompute(arg0[var6], var9, true);
            var5[var6] = WNafUtil.generateWindowNaf(var9, var8);
        }
        return implSumOfMultiplies(var3, var4, var5);
    }

    public static ECPoint implSumOfMultipliesGLV(ECPoint[] arg0, BigInteger[] arg1, GLVEndomorphism arg2) {
        BigInteger var3 = arg0[0].getCurve().getOrder();
        int var4 = arg0.length;
        BigInteger[] var5 = new BigInteger[var4 << 1];
        int var6 = 0;
        int var7 = 0;
        while (var6 < var4) {
            BigInteger[] var8 = arg2.decomposeScalar(arg1[var6].mod(var3));
            var5[var7++] = var8[0];
            var5[var7++] = var8[1];
            var6++;
        }
        ECPointMap var9 = arg2.getPointMap();
        if (arg2.hasEfficientPointMap()) {
            return implSumOfMultiplies(arg0, var9, var5);
        }
        ECPoint[] var10 = new ECPoint[var4 << 1];
        int var11 = 0;
        int var12 = 0;
        while (var11 < var4) {
            ECPoint var13 = arg0[var11];
            ECPoint var14 = var9.map(var13);
            var10[var12++] = var13;
            var10[var12++] = var14;
            var11++;
        }
        return implSumOfMultiplies(var10, var5);
    }

    public static void montgomeryTrick(ECFieldElement[] arg0, int arg1, int arg2, ECFieldElement arg3) {
        ECFieldElement[] var4 = new ECFieldElement[arg2];
        var4[0] = arg0[arg1];
        int var5 = 0;
        while (true) {
            var5++;
            if (var5 >= arg2) {
                var5--;
                if (arg3 != null) {
                    var4[var5] = var4[var5].multiply(arg3);
                }
                ECFieldElement var6 = var4[var5].invert();
                while (var5 > 0) {
                    int var7 = arg1 + var5--;
                    ECFieldElement var8 = arg0[var7];
                    arg0[var7] = var4[var5].multiply(var6);
                    var6 = var6.multiply(var8);
                }
                arg0[arg1] = var6;
                return;
            }
            var4[var5] = var4[var5 - 1].multiply(arg0[arg1 + var5]);
        }
    }

    public static ECPoint implSumOfMultiplies(boolean[] arg0, WNafPreCompInfo[] arg1, byte[][] arg2) {
        int var3 = 0;
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3 = Math.max(var3, arg2[var5].length);
        }
        ECCurve var6 = arg1[0].getPreComp()[0].getCurve();
        ECPoint var7 = var6.getInfinity();
        ECPoint var8 = var7;
        int var9 = 0;
        for (int var10 = var3 - 1; var10 >= 0; var10--) {
            ECPoint var11 = var7;
            for (int var12 = 0; var12 < var4; var12++) {
                byte[] var13 = arg2[var12];
                byte var14 = var10 < var13.length ? var13[var10] : 0;
                if (var14 != 0) {
                    int var15 = Math.abs(var14);
                    WNafPreCompInfo var16 = arg1[var12];
                    ECPoint[] var17 = var14 < 0 == arg0[var12] ? var16.getPreComp() : var16.getPreCompNeg();
                    var11 = var11.add(var17[var15 >>> 1]);
                }
            }
            if (var7 == var11) {
                var9++;
            } else {
                if (var9 > 0) {
                    var8 = var8.timesPow2(var9);
                    var9 = 0;
                }
                var8 = var8.twicePlus(var11);
            }
        }
        if (var9 > 0) {
            var8 = var8.timesPow2(var9);
        }
        return var8;
    }
}
