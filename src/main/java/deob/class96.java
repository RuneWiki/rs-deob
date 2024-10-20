package deob;

@ObfuscatedName("cd")
public class class96 extends class182 {

    @ObfuscatedName("cd.e")
    public class81[] field1669;

    public class96(class146 arg0, class146 arg1, int arg2, boolean arg3) {
        class177 var5 = new class177();
        int var6 = arg0.method2705(arg2);
        this.field1669 = new class81[var6];
        int[] var7 = arg0.method2704(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2695(arg2, var7[var8]);
            class95 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class95 var12 = (class95) var5.method3210(); var12 != null; var12 = (class95) var5.method3182()) {
                if (var12.field1662 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2763(0, var11);
                } else {
                    var13 = arg1.method2763(var11, 0);
                }
                var10 = new class95(var11, var13);
                var5.method3183(var10);
            }
            this.field1669[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cd.e(II)Z")
    public boolean method1960(int arg0) {
        return this.field1669[arg0].field1438;
    }
}
