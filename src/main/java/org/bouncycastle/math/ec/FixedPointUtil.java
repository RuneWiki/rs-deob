package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class FixedPointUtil {

    public static final String PRECOMP_NAME = "bc_fixed_point";

    public static int getCombSize(ECCurve arg0) {
        BigInteger var1 = arg0.getOrder();
        return var1 == null ? arg0.getFieldSize() + 1 : var1.bitLength();
    }

    public static FixedPointPreCompInfo precompute(ECPoint arg0, int arg1) {
        ECCurve var2 = arg0.getCurve();
        int var3 = 0x1 << arg1;
        FixedPointPreCompInfo var4 = getFixedPointPreCompInfo(var2.getPreCompInfo(arg0, "bc_fixed_point"));
        ECPoint[] var5 = var4.getPreComp();
        if (var5 == null || var5.length < var3) {
            int var6 = getCombSize(var2);
            int var7 = (arg1 + var6 - 1) / arg1;
            ECPoint[] var8 = new ECPoint[arg1];
            var8[0] = arg0;
            for (int var9 = 1; var9 < arg1; var9++) {
                var8[var9] = var8[var9 - 1].timesPow2(var7);
            }
            var2.normalizeAll(var8);
            ECPoint[] var10 = new ECPoint[var3];
            var10[0] = var2.getInfinity();
            for (int var11 = arg1 - 1; var11 >= 0; var11--) {
                ECPoint var12 = var8[var11];
                int var13 = 0x1 << var11;
                for (int var14 = var13; var14 < var3; var14 += var13 << 1) {
                    var10[var14] = var10[var14 - var13].add(var12);
                }
            }
            var2.normalizeAll(var10);
            var4.setPreComp(var10);
            var4.setWidth(arg1);
            var2.setPreCompInfo(arg0, "bc_fixed_point", var4);
        }
        return var4;
    }

    public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo arg0) {
        return arg0 != null && arg0 instanceof FixedPointPreCompInfo ? (FixedPointPreCompInfo) arg0 : new FixedPointPreCompInfo();
    }
}
