package deob;

@ObfuscatedName("cn")
public class class93 extends class151 {

    @ObfuscatedName("cn.d")
    public class81[] field1559;

    public class93(class185 arg0, class185 arg1, int arg2, boolean arg3) {
        class150 var5 = new class150();
        int var6 = arg0.method3097(arg2);
        this.field1559 = new class81[var6];
        int[] var7 = arg0.method3096(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3129(arg2, var7[var8]);
            class87 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class87 var12 = (class87) var5.method2666(); var12 != null; var12 = (class87) var5.method2668()) {
                if (var12.field1456 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3093(0, var11);
                } else {
                    var13 = arg1.method3093(var11, 0);
                }
                var10 = new class87(var11, var13);
                var5.method2662(var10);
            }
            this.field1559[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cn.d(II)Z")
    public boolean method1818(int arg0) {
        return this.field1559[arg0].field1316;
    }
}
