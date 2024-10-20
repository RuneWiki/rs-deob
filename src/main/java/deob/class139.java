package deob;

@ObfuscatedName("ek")
public class class139 extends class176 {

    @ObfuscatedName("ek.q")
    public class126[] field1894;

    @ObfuscatedName("em.q(Lhp;Lhp;IZB)Lek;")
    public static class139 method2996(class234 arg0, class234 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3784(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3781(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3781(0, var8);
                } else {
                    var9 = arg1.method3781(var8, 0);
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
            return new class139(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class139(class234 arg0, class234 arg1, int arg2, boolean arg3) {
        class262 var5 = new class262();
        int var6 = arg0.method3785(arg2);
        this.field1894 = new class126[var6];
        int[] var7 = arg0.method3784(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3775(arg2, var7[var8]);
            class133 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class133 var12 = (class133) var5.method4507(); var12 != null; var12 = (class133) var5.method4509()) {
                if (var12.field1800 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3781(0, var11);
                } else {
                    var13 = arg1.method3781(var11, 0);
                }
                var10 = new class133(var11, var13);
                var5.method4532(var10);
            }
            this.field1894[var7[var8]] = new class126(var9, var10);
        }
    }

    @ObfuscatedName("ek.w(II)Z")
    public boolean method3002(int arg0) {
        return this.field1894[arg0].field1645;
    }
}
