package deob;

@ObfuscatedName("en")
public class class145 extends class195 {

    @ObfuscatedName("en.d")
    public class132[] field2113;

    public class145(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        class194 var5 = new class194();
        int var6 = arg0.method3761(arg2);
        this.field2113 = new class132[var6];
        int[] var7 = arg0.method3760(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3750(arg2, var7[var8]);
            class139 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class139 var12 = (class139) var5.method3323(); var12 != null; var12 = (class139) var5.method3325()) {
                if (var12.field2017 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3757(0, var11);
                } else {
                    var13 = arg1.method3757(var11, 0);
                }
                var10 = new class139(var11, var13);
                var5.method3318(var10);
            }
            this.field2113[var7[var8]] = new class132(var9, var10);
        }
    }

    @ObfuscatedName("en.d(II)Z")
    public boolean method2660(int arg0) {
        return this.field2113[arg0].field1857;
    }
}
