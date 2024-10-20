package deob;

@ObfuscatedName("ev")
public class class139 extends class176 {

    @ObfuscatedName("ev.c")
    public class126[] field1861;

    @ObfuscatedName("au.c(Lhz;Lhz;IZB)Lev;")
    public static class139 method726(class234 arg0, class234 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3836(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3838(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3838(0, var8);
                } else {
                    var9 = arg1.method3838(var8, 0);
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
            return new class139(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class139(class234 arg0, class234 arg1, int arg2, boolean arg3) {
        class262 var5 = new class262();
        int var6 = arg0.method3837(arg2);
        this.field1861 = new class126[var6];
        int[] var7 = arg0.method3836(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3825(arg2, var7[var8]);
            class133 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class133 var12 = (class133) var5.method4550(); var12 != null; var12 = (class133) var5.method4573()) {
                if (var12.field1765 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3838(0, var11);
                } else {
                    var13 = arg1.method3838(var11, 0);
                }
                var10 = new class133(var11, var13);
                var5.method4572(var10);
            }
            this.field1861[var7[var8]] = new class126(var9, var10);
        }
    }

    @ObfuscatedName("ev.x(II)Z")
    public boolean method3023(int arg0) {
        return this.field1861[arg0].field1609;
    }
}
