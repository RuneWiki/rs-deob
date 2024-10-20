package deob;

@ObfuscatedName("cf")
public class class96 extends class182 {

    @ObfuscatedName("cf.t")
    public class81[] field1663;

    public class96(class146 arg0, class146 arg1, int arg2, boolean arg3) {
        class177 var5 = new class177();
        int var6 = arg0.method2719(arg2);
        this.field1663 = new class81[var6];
        int[] var7 = arg0.method2786(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2709(arg2, var7[var8]);
            class95 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class95 var12 = (class95) var5.method3239(); var12 != null; var12 = (class95) var5.method3248()) {
                if (var12.field1654 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2715(0, var11);
                } else {
                    var13 = arg1.method2715(var11, 0);
                }
                var10 = new class95(var11, var13);
                var5.method3260(var10);
            }
            this.field1663[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cf.t(II)Z")
    public boolean method1939(int arg0) {
        return this.field1663[arg0].field1422;
    }
}
