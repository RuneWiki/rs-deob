package deob;

@ObfuscatedName("ea")
public class class146 extends class196 {

    @ObfuscatedName("ea.e")
    public class133[] field2132;

    public class146(class237 arg0, class237 arg1, int arg2, boolean arg3) {
        class195 var5 = new class195();
        int var6 = arg0.method3828(arg2);
        this.field2132 = new class133[var6];
        int[] var7 = arg0.method3827(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3817(arg2, var7[var8]);
            class140 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class140 var12 = (class140) var5.method3348(); var12 != null; var12 = (class140) var5.method3350()) {
                if (var12.field2042 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3814(0, var11);
                } else {
                    var13 = arg1.method3814(var11, 0);
                }
                var10 = new class140(var11, var13);
                var5.method3379(var10);
            }
            this.field2132[var7[var8]] = new class133(var9, var10);
        }
    }

    @ObfuscatedName("ea.e(II)Z")
    public boolean method2703(int arg0) {
        return this.field2132[arg0].field1886;
    }
}
