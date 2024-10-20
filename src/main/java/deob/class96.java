package deob;

@ObfuscatedName("ch")
public class class96 extends class181 {

    @ObfuscatedName("ch.z")
    public class81[] field1646;

    public class96(class146 arg0, class146 arg1, int arg2, boolean arg3) {
        class177 var5 = new class177();
        int var6 = arg0.method2738(arg2);
        this.field1646 = new class81[var6];
        int[] var7 = arg0.method2720(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2705(arg2, var7[var8]);
            class95 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class95 var12 = (class95) var5.method3232(); var12 != null; var12 = (class95) var5.method3251()) {
                if (var12.field1640 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2739(0, var11);
                } else {
                    var13 = arg1.method2739(var11, 0);
                }
                var10 = new class95(var11, var13);
                var5.method3227(var10);
            }
            this.field1646[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("ch.z(IB)Z")
    public boolean method1969(int arg0) {
        return this.field1646[arg0].field1408;
    }
}
