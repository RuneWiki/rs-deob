package deob;

@ObfuscatedName("ea")
public class class145 extends class195 {

    @ObfuscatedName("ea.c")
    public class132[] field2103;

    @ObfuscatedName("cn.c(Lip;Lip;IZI)Lea;")
    public static class145 method1632(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3792(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3721(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3721(0, var8);
                } else {
                    var9 = arg1.method3721(var8, 0);
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
        int var6 = arg0.method3739(arg2);
        this.field2103 = new class132[var6];
        int[] var7 = arg0.method3792(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3741(arg2, var7[var8]);
            class139 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class139 var12 = (class139) var5.method3296(); var12 != null; var12 = (class139) var5.method3298()) {
                if (var12.field2015 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3721(0, var11);
                } else {
                    var13 = arg1.method3721(var11, 0);
                }
                var10 = new class139(var11, var13);
                var5.method3290(var10);
            }
            this.field2103[var7[var8]] = new class132(var9, var10);
        }
    }

    @ObfuscatedName("ea.o(II)Z")
    public boolean method2611(int arg0) {
        return this.field2103[arg0].field1846;
    }
}
