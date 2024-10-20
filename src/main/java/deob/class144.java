package deob;

@ObfuscatedName("ez")
public class class144 extends class202 {

    @ObfuscatedName("ez.m")
    public class131[] field2056;

    public class144(class243 arg0, class243 arg1, int arg2, boolean arg3) {
        class201 var5 = new class201();
        int var6 = arg0.method3941(arg2);
        this.field2056 = new class131[var6];
        int[] var7 = arg0.method3936(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3930(arg2, var7[var8]);
            class138 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class138 var12 = (class138) var5.method3486(); var12 != null; var12 = (class138) var5.method3507()) {
                if (var12.field1967 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3937(0, var11);
                } else {
                    var13 = arg1.method3937(var11, 0);
                }
                var10 = new class138(var11, var13);
                var5.method3480(var10);
            }
            this.field2056[var7[var8]] = new class131(var9, var10);
        }
    }

    @ObfuscatedName("ez.m(IS)Z")
    public boolean method2744(int arg0) {
        return this.field2056[arg0].field1803;
    }
}
