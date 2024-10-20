package deob;

@ObfuscatedName("cg")
public class class96 extends class182 {

    @ObfuscatedName("cg.e")
    public class81[] field1671;

    public class96(class146 arg0, class146 arg1, int arg2, boolean arg3) {
        class177 var5 = new class177();
        int var6 = arg0.method2670(arg2);
        this.field1671 = new class81[var6];
        int[] var7 = arg0.method2657(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2709(arg2, var7[var8]);
            class95 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class95 var12 = (class95) var5.method3122(); var12 != null; var12 = (class95) var5.method3124()) {
                if (var12.field1661 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2640(0, var11);
                } else {
                    var13 = arg1.method2640(var11, 0);
                }
                var10 = new class95(var11, var13);
                var5.method3117(var10);
            }
            this.field1671[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cg.e(II)Z")
    public boolean method1914(int arg0) {
        return this.field1671[arg0].field1440;
    }
}
