package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class FixedPointCombMultiplier extends AbstractECMultiplier {

    public int getWidthForCombSize(int arg0) {
        return arg0 > 257 ? 6 : 5;
    }

    public ECPoint multiplyPositive(ECPoint arg0, BigInteger arg1) {
        ECCurve var3 = arg0.getCurve();
        int var4 = FixedPointUtil.getCombSize(var3);
        if (arg1.bitLength() > var4) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        int var5 = this.getWidthForCombSize(var4);
        FixedPointPreCompInfo var6 = FixedPointUtil.precompute(arg0, var5);
        ECPoint[] var7 = var6.getPreComp();
        int var8 = var6.getWidth();
        int var9 = (var4 + var8 - 1) / var8;
        ECPoint var10 = var3.getInfinity();
        int var11 = var8 * var9 - 1;
        for (int var12 = 0; var12 < var9; var12++) {
            int var13 = 0;
            for (int var14 = var11 - var12; var14 >= 0; var14 -= var9) {
                var13 <<= 0x1;
                if (arg1.testBit(var14)) {
                    var13 |= 0x1;
                }
            }
            var10 = var10.twicePlus(var7[var13]);
        }
        return var10;
    }
}
