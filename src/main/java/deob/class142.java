package deob;

@ObfuscatedName("ej")
public class class142 extends class215 {

    @ObfuscatedName("ej.b")
    public class129[] field2014;

    public class142(class256 arg0, class256 arg1, int arg2, boolean arg3) {
        class214 var5 = new class214();
        int var6 = arg0.method4172(arg2);
        this.field2014 = new class129[var6];
        int[] var7 = arg0.method4222(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4158(arg2, var7[var8]);
            class136 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class136 var12 = (class136) var5.method3739(); var12 != null; var12 = (class136) var5.method3745()) {
                if (var12.field1928 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4168(0, var11);
                } else {
                    var13 = arg1.method4168(var11, 0);
                }
                var10 = new class136(var11, var13);
                var5.method3741(var10);
            }
            this.field2014[var7[var8]] = new class129(var9, var10);
        }
    }

    @ObfuscatedName("ej.b(II)Z")
    public boolean method2834(int arg0) {
        return this.field2014[arg0].field1778;
    }
}
