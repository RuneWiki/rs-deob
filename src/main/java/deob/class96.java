package deob;

@ObfuscatedName("cb")
public class class96 extends class180 {

    @ObfuscatedName("cb.y")
    public class81[] field1672;

    public class96(class145 arg0, class145 arg1, int arg2, boolean arg3) {
        class176 var5 = new class176();
        int var6 = arg0.method2714(arg2);
        this.field1672 = new class81[var6];
        int[] var7 = arg0.method2713(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2704(arg2, var7[var8]);
            class95 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class95 var12 = (class95) var5.method3234(); var12 != null; var12 = (class95) var5.method3209()) {
                if (var12.field1670 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2769(0, var11);
                } else {
                    var13 = arg1.method2769(var11, 0);
                }
                var10 = new class95(var11, var13);
                var5.method3202(var10);
            }
            this.field1672[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cb.y(II)Z")
    public boolean method1955(int arg0) {
        return this.field1672[arg0].field1427;
    }
}
