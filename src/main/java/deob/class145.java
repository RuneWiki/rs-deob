package deob;

@ObfuscatedName("ek")
public class class145 extends class198 {

    @ObfuscatedName("ek.w")
    public class132[] field2150;

    public class145(class239 arg0, class239 arg1, int arg2, boolean arg3) {
        class197 var5 = new class197();
        int var6 = arg0.method3798(arg2);
        this.field2150 = new class132[var6];
        int[] var7 = arg0.method3736(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3754(arg2, var7[var8]);
            class139 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class139 var12 = (class139) var5.method3304(); var12 != null; var12 = (class139) var5.method3306()) {
                if (var12.field2061 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3733(0, var11);
                } else {
                    var13 = arg1.method3733(var11, 0);
                }
                var10 = new class139(var11, var13);
                var5.method3299(var10);
            }
            this.field2150[var7[var8]] = new class132(var9, var10);
        }
    }

    @ObfuscatedName("ek.w(II)Z")
    public boolean method2621(int arg0) {
        return this.field2150[arg0].field1907;
    }
}
