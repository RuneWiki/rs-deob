package deob;

@ObfuscatedName("ct")
public class class96 extends class183 {

    @ObfuscatedName("ct.k")
    public class81[] field1658;

    @ObfuscatedName("ax.k(Lei;Lei;IZI)Lct;")
    public static class96 method1022(class147 arg0, class147 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2738(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2735(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2735(0, var8);
                } else {
                    var9 = arg1.method2735(var8, 0);
                }
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return null;
        }
        try {
            return new class96(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class96(class147 arg0, class147 arg1, int arg2, boolean arg3) {
        class178 var5 = new class178();
        int var6 = arg0.method2739(arg2);
        this.field1658 = new class81[var6];
        int[] var7 = arg0.method2738(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2729(arg2, var7[var8]);
            class95 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class95 var12 = (class95) var5.method3301(); var12 != null; var12 = (class95) var5.method3278()) {
                if (var12.field1641 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2735(0, var11);
                } else {
                    var13 = arg1.method2735(var11, 0);
                }
                var10 = new class95(var11, var13);
                var5.method3271(var10);
            }
            this.field1658[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("ct.y(II)Z")
    public boolean method1977(int arg0) {
        return this.field1658[arg0].field1419;
    }
}
