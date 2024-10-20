package deob;

@ObfuscatedName("fb")
public class class166 extends class142 {

    @ObfuscatedName("fb.r")
    public class46[] field2488;

    public class166(class86 arg0, class86 arg1, int arg2, boolean arg3) {
        class104 var5 = new class104();
        int var6 = arg0.method1025(arg2);
        this.field2488 = new class46[var6];
        int[] var7 = arg0.method1024(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1015(arg2, var7[var8]);
            class134 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class134 var12 = (class134) var5.method1305(); var12 != null; var12 = (class134) var5.method1287()) {
                if (var12.field1718 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1066(0, var11);
                } else {
                    var13 = arg1.method1066(var11, 0);
                }
                var10 = new class134(var11, var13);
                var5.method1284(var10);
            }
            this.field2488[var7[var8]] = new class46(var9, var10);
        }
    }

    @ObfuscatedName("fb.e(II)Z")
    public boolean method2633(int arg0) {
        return this.field2488[arg0].field652;
    }
}
