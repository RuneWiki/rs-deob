package deob;

@ObfuscatedName("dv")
public class class28 extends class6 {

    @ObfuscatedName("dv.b")
    public class141[] field332;

    public class28(class89 arg0, class89 arg1, int arg2, boolean arg3) {
        class15 var5 = new class15();
        int var6 = arg0.method1276(arg2);
        this.field332 = new class141[var6];
        int[] var7 = arg0.method1275(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1266(arg2, var7[var8]);
            class37 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class37 var12 = (class37) var5.method212(); var12 != null; var12 = (class37) var5.method201()) {
                if (var12.field458 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1272(0, var11);
                } else {
                    var13 = arg1.method1272(var11, 0);
                }
                var10 = new class37(var11, var13);
                var5.method219(var10);
            }
            this.field332[var7[var8]] = new class141(var9, var10);
        }
    }

    @ObfuscatedName("dv.h(II)Z")
    public boolean method474(int arg0) {
        return this.field332[arg0].field2162;
    }

    @ObfuscatedName("i.b(Lek;Lek;IZI)Ldv;")
    public static class28 method1192(class89 arg0, class89 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method1275(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method1272(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method1272(0, var8);
                } else {
                    var9 = arg1.method1272(var8, 0);
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
            return new class28(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }
}
