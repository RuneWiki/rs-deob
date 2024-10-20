package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class WNafL2RMultiplier extends AbstractECMultiplier {

    public int getWindowSize(int arg0) {
        return WNafUtil.getWindowSize(arg0);
    }

    public ECPoint multiplyPositive(ECPoint arg0, BigInteger arg1) {
        int var3 = Math.max(2, Math.min(16, this.getWindowSize(arg1.bitLength())));
        WNafPreCompInfo var4 = WNafUtil.precompute(arg0, var3, true);
        ECPoint[] var5 = var4.getPreComp();
        ECPoint[] var6 = var4.getPreCompNeg();
        int[] var7 = WNafUtil.generateCompactWindowNaf(var3, arg1);
        ECPoint var8 = arg0.getCurve().getInfinity();
        int var9 = var7.length;
        if (var9 > 1) {
            var9--;
            int var10 = var7[var9];
            int var11 = var10 >> 16;
            int var12 = var10 & 0xFFFF;
            int var13 = Math.abs(var11);
            ECPoint[] var14 = var11 < 0 ? var6 : var5;
            ECPoint var20;
            if (var13 << 2 < 0x1 << var3) {
                byte var15 = LongArray.bitLengths[var13];
                int var16 = var3 - var15;
                int var17 = var13 ^ 0x1 << var15 - 1;
                int var18 = (0x1 << var3 - 1) - 1;
                int var19 = (var17 << var16) + 1;
                var20 = var14[var18 >>> 1].add(var14[var19 >>> 1]);
                var12 -= var16;
            } else {
                var20 = var14[var13 >>> 1];
            }
            var8 = var20.timesPow2(var12);
        }
        while (var9 > 0) {
            var9--;
            int var21 = var7[var9];
            int var22 = var21 >> 16;
            int var23 = var21 & 0xFFFF;
            int var24 = Math.abs(var22);
            ECPoint[] var25 = var22 < 0 ? var6 : var5;
            ECPoint var26 = var25[var24 >>> 1];
            ECPoint var27 = var8.twicePlus(var26);
            var8 = var27.timesPow2(var23);
        }
        return var8;
    }
}
