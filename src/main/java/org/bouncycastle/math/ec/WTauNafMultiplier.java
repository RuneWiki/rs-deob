package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class WTauNafMultiplier extends AbstractECMultiplier {

    public static final String PRECOMP_NAME = "bc_wtnaf";

    public ECPoint multiplyPositive(ECPoint arg0, BigInteger arg1) {
        if (!(arg0 instanceof ECPoint.AbstractF2m)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        ECPoint.AbstractF2m var3 = (ECPoint.AbstractF2m) arg0;
        ECCurve.AbstractF2m var4 = (ECCurve.AbstractF2m) var3.getCurve();
        int var5 = var4.getFieldSize();
        byte var6 = var4.getA().toBigInteger().byteValue();
        byte var7 = Tnaf.getMu(var6);
        BigInteger[] var8 = var4.getSi();
        ZTauElement var9 = Tnaf.partModReduction(arg1, var5, var6, var8, var7, (byte) 10);
        return this.multiplyWTnaf(var3, var9, var4.getPreCompInfo(var3, "bc_wtnaf"), var6, var7);
    }

    public ECPoint.AbstractF2m multiplyWTnaf(ECPoint.AbstractF2m arg0, ZTauElement arg1, PreCompInfo arg2, byte arg3, byte arg4) {
        ZTauElement[] var6 = arg3 == 0 ? Tnaf.alpha0 : Tnaf.alpha1;
        BigInteger var7 = Tnaf.getTw(arg4, 4);
        byte[] var8 = Tnaf.tauAdicWNaf(arg4, arg1, (byte) 4, BigInteger.valueOf(16L), var7, var6);
        return multiplyFromWTnaf(arg0, var8, arg2);
    }

    public static ECPoint.AbstractF2m multiplyFromWTnaf(ECPoint.AbstractF2m arg0, byte[] arg1, PreCompInfo arg2) {
        ECCurve.AbstractF2m var3 = (ECCurve.AbstractF2m) arg0.getCurve();
        byte var4 = var3.getA().toBigInteger().byteValue();
        ECPoint.AbstractF2m[] var5;
        if (arg2 != null && arg2 instanceof WTauNafPreCompInfo) {
            var5 = ((WTauNafPreCompInfo) arg2).getPreComp();
        } else {
            var5 = Tnaf.getPreComp(arg0, var4);
            WTauNafPreCompInfo var6 = new WTauNafPreCompInfo();
            var6.setPreComp(var5);
            var3.setPreCompInfo(arg0, "bc_wtnaf", var6);
        }
        ECPoint.AbstractF2m[] var7 = new ECPoint.AbstractF2m[var5.length];
        for (int var8 = 0; var8 < var5.length; var8++) {
            var7[var8] = (ECPoint.AbstractF2m) var5[var8].negate();
        }
        ECPoint.AbstractF2m var9 = (ECPoint.AbstractF2m) arg0.getCurve().getInfinity();
        int var10 = 0;
        for (int var11 = arg1.length - 1; var11 >= 0; var11--) {
            var10++;
            byte var12 = arg1[var11];
            if (var12 != 0) {
                ECPoint.AbstractF2m var13 = var9.tauPow(var10);
                var10 = 0;
                ECPoint.AbstractF2m var14 = var12 > 0 ? var5[var12 >>> 1] : var7[-var12 >>> 1];
                var9 = (ECPoint.AbstractF2m) var13.add(var14);
            }
        }
        if (var10 > 0) {
            var9 = var9.tauPow(var10);
        }
        return var9;
    }
}
