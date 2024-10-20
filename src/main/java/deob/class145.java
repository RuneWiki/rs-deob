package deob;

@ObfuscatedName("ea")
public class class145 extends class195 {

    @ObfuscatedName("ea.p")
    public class132[] field2152;

    @ObfuscatedName("y.p(Lil;Lil;IZI)Lea;")
    public static class145 method188(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3714(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3711(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3711(0, var8);
                } else {
                    var9 = arg1.method3711(var8, 0);
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
        int var6 = arg0.method3784(arg2);
        this.field2152 = new class132[var6];
        int[] var7 = arg0.method3714(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3720(arg2, var7[var8]);
            class139 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class139 var12 = (class139) var5.method3252(); var12 != null; var12 = (class139) var5.method3277()) {
                if (var12.field2058 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3711(0, var11);
                } else {
                    var13 = arg1.method3711(var11, 0);
                }
                var10 = new class139(var11, var13);
                var5.method3270(var10);
            }
            this.field2152[var7[var8]] = new class132(var9, var10);
        }
    }

    @ObfuscatedName("ea.m(IB)Z")
    public boolean method2587(int arg0) {
        return this.field2152[arg0].field1897;
    }
}
