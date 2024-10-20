package deob;

@ObfuscatedName("cv")
public class class98 extends class195 {

    @ObfuscatedName("cv.d")
    public static class190 field1519 = new class190(128);

    @ObfuscatedName("cv.k")
    public int[] field1525;

    @ObfuscatedName("cv.e")
    public int[] field1522;

    @ObfuscatedName("cv.p")
    public String[] field1520;

    @ObfuscatedName("cv.q")
    public int field1523;

    @ObfuscatedName("cv.s")
    public int field1524;

    @ObfuscatedName("cv.r")
    public int field1527;

    @ObfuscatedName("cv.g")
    public int field1526;

    @ObfuscatedName("cv.v")
    public class187[] field1521;

    @ObfuscatedName("q.d(ILhh;I)Lcv;")
    public static class98 method16(int arg0, class220 arg1) {
        class98 var2 = (class98) field1519.method3341((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field674.method3896(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field674.method3881(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class98 var6 = method3844(var5);
            if (var6 != null) {
                field1519.method3343(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("hh.k([BI)Lcv;")
    public static class98 method3844(byte[] arg0) {
        class98 var1 = new class98();
        class174 var2 = new class174(arg0);
        var2.field2405 = var2.field2409.length - 2;
        int var3 = var2.method3035();
        int var4 = var2.field2409.length - 2 - var3 - 12;
        var2.field2405 = var4;
        int var5 = var2.method2960();
        var1.field1523 = var2.method3035();
        var1.field1524 = var2.method3035();
        var1.field1527 = var2.method3035();
        var1.field1526 = var2.method3035();
        int var6 = var2.method2955();
        if (var6 > 0) {
            var1.field1521 = var1.method1765(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3035();
                class187 var9 = new class187(class178.method1636(var8));
                var1.field1521[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2960();
                    int var11 = var2.method2960();
                    var9.method3314(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2405 = 0;
        var2.method2963();
        var1.field1525 = new int[var5];
        var1.field1522 = new int[var5];
        var1.field1520 = new String[var5];
        int var12 = 0;
        while (var2.field2405 < var4) {
            int var13 = var2.method3035();
            if (var13 == 3) {
                var1.field1520[var12] = var2.method2964();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1522[var12] = var2.method2955();
            } else {
                var1.field1522[var12] = var2.method2960();
            }
            var1.field1525[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cv.e(IS)[Lgc;")
    public class187[] method1765(int arg0) {
        return new class187[arg0];
    }
}
