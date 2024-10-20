package deob;

@ObfuscatedName("gd")
public class class201 extends class347 {

    @ObfuscatedName("gd.v")
    public class194[] field2369;

    public class201(class275 arg0, class275 arg1, int arg2, boolean arg3) {
        class294 var5 = new class294();
        int var6 = arg0.method4478(arg2);
        this.field2369 = new class194[var6];
        int[] var7 = arg0.method4477(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4468(arg2, var7[var8]);
            class197 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class197 var12 = (class197) var5.method4714(); var12 != null; var12 = (class197) var5.method4741()) {
                if (var12.field2291 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4499(0, var11);
                } else {
                    var13 = arg1.method4499(var11, 0);
                }
                var10 = new class197(var11, var13);
                var5.method4709(var10);
            }
            this.field2369[var7[var8]] = new class194(var9, var10);
        }
    }

    @ObfuscatedName("gd.v(IB)Z")
    public boolean method3746(int arg0) {
        return this.field2369[arg0].field2235;
    }
}
