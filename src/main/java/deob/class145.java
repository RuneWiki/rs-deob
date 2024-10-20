package deob;

@ObfuscatedName("eh")
public class class145 extends class195 {

    @ObfuscatedName("eh.e")
    public class132[] field2138;

    @ObfuscatedName("cs.e(Lin;Lin;IZI)Leh;")
    public static class145 method1548(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3790(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3767(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3767(0, var8);
                } else {
                    var9 = arg1.method3767(var8, 0);
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
        int var6 = arg0.method3771(arg2);
        this.field2138 = new class132[var6];
        int[] var7 = arg0.method3790(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3760(arg2, var7[var8]);
            class139 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class139 var12 = (class139) var5.method3336(); var12 != null; var12 = (class139) var5.method3324()) {
                if (var12.field2051 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3767(0, var11);
                } else {
                    var13 = arg1.method3767(var11, 0);
                }
                var10 = new class139(var11, var13);
                var5.method3318(var10);
            }
            this.field2138[var7[var8]] = new class132(var9, var10);
        }
    }

    @ObfuscatedName("eh.o(II)Z")
    public boolean method2651(int arg0) {
        return this.field2138[arg0].field1892;
    }
}
