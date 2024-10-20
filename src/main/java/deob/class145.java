package deob;

@ObfuscatedName("er")
public class class145 extends class195 {

    @ObfuscatedName("er.n")
    public class132[] field2149;

    @ObfuscatedName("fu.n(Lis;Lis;IZI)Ler;")
    public static class145 method2780(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3861(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3854(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3854(0, var8);
                } else {
                    var9 = arg1.method3854(var8, 0);
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
            return new class145(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class145(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        class194 var5 = new class194();
        int var6 = arg0.method3879(arg2);
        this.field2149 = new class132[var6];
        int[] var7 = arg0.method3861(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3880(arg2, var7[var8]);
            class139 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class139 var12 = (class139) var5.method3372(); var12 != null; var12 = (class139) var5.method3358()) {
                if (var12.field2054 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3854(0, var11);
                } else {
                    var13 = arg1.method3854(var11, 0);
                }
                var10 = new class139(var11, var13);
                var5.method3384(var10);
            }
            this.field2149[var7[var8]] = new class132(var9, var10);
        }
    }

    @ObfuscatedName("er.p(II)Z")
    public boolean method2682(int arg0) {
        return this.field2149[arg0].field1906;
    }
}
