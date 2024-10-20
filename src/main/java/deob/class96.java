package deob;

@ObfuscatedName("cz")
public class class96 extends class183 {

    @ObfuscatedName("cz.p")
    public class81[] field1673;

    @ObfuscatedName("at.p(Ler;Ler;IZB)Lcz;")
    public static class96 method591(class147 arg0, class147 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2795(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2811(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2811(0, var8);
                } else {
                    var9 = arg1.method2811(var8, 0);
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
        int var6 = arg0.method2796(arg2);
        this.field1673 = new class81[var6];
        int[] var7 = arg0.method2795(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2855(arg2, var7[var8]);
            class95 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class95 var12 = (class95) var5.method3303(); var12 != null; var12 = (class95) var5.method3300()) {
                if (var12.field1670 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2811(0, var11);
                } else {
                    var13 = arg1.method2811(var11, 0);
                }
                var10 = new class95(var11, var13);
                var5.method3291(var10);
            }
            this.field1673[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cz.g(II)Z")
    public boolean method2019(int arg0) {
        return this.field1673[arg0].field1444;
    }
}
