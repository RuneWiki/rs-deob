package deob;

@ObfuscatedName("ca")
public class class97 extends class187 {

    @ObfuscatedName("ca.b")
    public class82[] field1671;

    @ObfuscatedName("bv.b(Lex;Lex;IZS)Lca;")
    public static class97 method1596(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2771(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2768(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2768(0, var8);
                } else {
                    var9 = arg1.method2768(var8, 0);
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
            return new class97(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class97(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        class182 var5 = new class182();
        int var6 = arg0.method2772(arg2);
        this.field1671 = new class82[var6];
        int[] var7 = arg0.method2771(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2761(arg2, var7[var8]);
            class96 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class96 var12 = (class96) var5.method3293(); var12 != null; var12 = (class96) var5.method3288()) {
                if (var12.field1660 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2768(0, var11);
                } else {
                    var13 = arg1.method2768(var11, 0);
                }
                var10 = new class96(var11, var13);
                var5.method3302(var10);
            }
            this.field1671[var7[var8]] = new class82(var9, var10);
        }
    }

    @ObfuscatedName("ca.e(II)Z")
    public boolean method1959(int arg0) {
        return this.field1671[arg0].field1445;
    }
}
