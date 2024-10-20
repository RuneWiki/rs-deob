package deob;

@ObfuscatedName("eo")
public class class143 extends class195 {

    @ObfuscatedName("eo.w")
    public class130[] field2128;

    public class143(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        class194 var5 = new class194();
        int var6 = arg0.method3908(arg2);
        this.field2128 = new class130[var6];
        int[] var7 = arg0.method3886(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3876(arg2, var7[var8]);
            class137 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class137 var12 = (class137) var5.method3427(); var12 != null; var12 = (class137) var5.method3435()) {
                if (var12.field2035 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3883(0, var11);
                } else {
                    var13 = arg1.method3883(var11, 0);
                }
                var10 = new class137(var11, var13);
                var5.method3429(var10);
            }
            this.field2128[var7[var8]] = new class130(var9, var10);
        }
    }

    @ObfuscatedName("eo.w(II)Z")
    public boolean method2697(int arg0) {
        return this.field2128[arg0].field1886;
    }
}
