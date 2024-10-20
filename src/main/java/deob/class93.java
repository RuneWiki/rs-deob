package deob;

@ObfuscatedName("cc")
public class class93 extends class130 {

    @ObfuscatedName("cc.f")
    public class81[] field1596;

    public class93(class183 arg0, class183 arg1, int arg2, boolean arg3) {
        class129 var5 = new class129();
        int var6 = arg0.method3127(arg2);
        this.field1596 = new class81[var6];
        int[] var7 = arg0.method3126(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3163(arg2, var7[var8]);
            class87 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class87 var12 = (class87) var5.method2301(); var12 != null; var12 = (class87) var5.method2309()) {
                if (var12.field1495 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3152(0, var11);
                } else {
                    var13 = arg1.method3152(var11, 0);
                }
                var10 = new class87(var11, var13);
                var5.method2296(var10);
            }
            this.field1596[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cc.f(II)Z")
    public boolean method1840(int arg0) {
        return this.field1596[arg0].field1349;
    }
}
