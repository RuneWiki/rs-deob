package deob;

@ObfuscatedName("er")
public class class145 extends class195 {

    @ObfuscatedName("er.i")
    public class132[] field2125;

    public class145(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        class194 var5 = new class194();
        int var6 = arg0.method3846(arg2);
        this.field2125 = new class132[var6];
        int[] var7 = arg0.method3845(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3836(arg2, var7[var8]);
            class139 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class139 var12 = (class139) var5.method3376(); var12 != null; var12 = (class139) var5.method3377()) {
                if (var12.field2035 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3927(0, var11);
                } else {
                    var13 = arg1.method3927(var11, 0);
                }
                var10 = new class139(var11, var13);
                var5.method3371(var10);
            }
            this.field2125[var7[var8]] = new class132(var9, var10);
        }
    }

    @ObfuscatedName("er.i(II)Z")
    public boolean method2689(int arg0) {
        return this.field2125[arg0].field1883;
    }
}
