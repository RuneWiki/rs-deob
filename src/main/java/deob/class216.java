package deob;

@ObfuscatedName("ht")
public class class216 extends class365 {

    @ObfuscatedName("ht.l")
    public class209[] field2454;

    @ObfuscatedName("dh.l(Lkl;Lkl;IZB)Lht;")
    public static class216 method2403(class290 arg0, class290 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4765(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4763(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4763(0, var8);
                } else {
                    var9 = arg1.method4763(var8, 0);
                }
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return null;
        }
        try {
            return new class216(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class216(class290 arg0, class290 arg1, int arg2, boolean arg3) {
        class309 var5 = new class309();
        int var6 = arg0.method4774(arg2);
        this.field2454 = new class209[var6];
        int[] var7 = arg0.method4765(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4756(arg2, var7[var8]);
            class212 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class212 var12 = (class212) var5.method5035(); var12 != null; var12 = (class212) var5.method5022()) {
                if (var12.field2373 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4763(0, var11);
                } else {
                    var13 = arg1.method4763(var11, 0);
                }
                var10 = new class212(var11, var13);
                var5.method5015(var10);
            }
            this.field2454[var7[var8]] = new class209(var9, var10);
        }
    }

    @ObfuscatedName("ht.q(IB)Z")
    public boolean method4022(int arg0) {
        return this.field2454[arg0].field2316;
    }
}
