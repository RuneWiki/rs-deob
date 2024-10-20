package deob;

@ObfuscatedName("eg")
public class class148 extends class185 {

    @ObfuscatedName("eg.m")
    public class135[] field1915;

    public class148(class244 arg0, class244 arg1, int arg2, boolean arg3) {
        class272 var5 = new class272();
        int var6 = arg0.method3903(arg2);
        this.field1915 = new class135[var6];
        int[] var7 = arg0.method3902(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3891(arg2, var7[var8]);
            class142 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class142 var12 = (class142) var5.method4651(); var12 != null; var12 = (class142) var5.method4656()) {
                if (var12.field1824 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3899(0, var11);
                } else {
                    var13 = arg1.method3899(var11, 0);
                }
                var10 = new class142(var11, var13);
                var5.method4644(var10);
            }
            this.field1915[var7[var8]] = new class135(var9, var10);
        }
    }

    @ObfuscatedName("eg.m(IB)Z")
    public boolean method3097(int arg0) {
        return this.field1915[arg0].field1671;
    }
}
