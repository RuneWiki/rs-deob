package deob;

@ObfuscatedName("cu")
public class class96 extends class183 {

    @ObfuscatedName("cu.g")
    public class81[] field1666;

    public class96(class147 arg0, class147 arg1, int arg2, boolean arg3) {
        class178 var5 = new class178();
        int var6 = arg0.method2732(arg2);
        this.field1666 = new class81[var6];
        int[] var7 = arg0.method2707(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2667(arg2, var7[var8]);
            class95 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class95 var12 = (class95) var5.method3196(); var12 != null; var12 = (class95) var5.method3206()) {
                if (var12.field1656 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2673(0, var11);
                } else {
                    var13 = arg1.method2673(var11, 0);
                }
                var10 = new class95(var11, var13);
                var5.method3200(var10);
            }
            this.field1666[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cu.g(IS)Z")
    public boolean method1949(int arg0) {
        return this.field1666[arg0].field1442;
    }
}
