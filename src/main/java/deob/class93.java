package deob;

@ObfuscatedName("cx")
public class class93 extends class130 {

    @ObfuscatedName("cx.i")
    public class81[] field1563;

    public class93(class183 arg0, class183 arg1, int arg2, boolean arg3) {
        class129 var5 = new class129();
        int var6 = arg0.method3023(arg2);
        this.field1563 = new class81[var6];
        int[] var7 = arg0.method3092(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3014(arg2, var7[var8]);
            class87 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class87 var12 = (class87) var5.method2209(); var12 != null; var12 = (class87) var5.method2211()) {
                if (var12.field1470 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3015(0, var11);
                } else {
                    var13 = arg1.method3015(var11, 0);
                }
                var10 = new class87(var11, var13);
                var5.method2226(var10);
            }
            this.field1563[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cx.i(II)Z")
    public boolean method1783(int arg0) {
        return this.field1563[arg0].field1329;
    }
}
