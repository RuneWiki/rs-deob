package deob;

@ObfuscatedName("ca")
public class class96 extends class215 {

    @ObfuscatedName("ca.b")
    public static class210 field1407 = new class210(128);

    @ObfuscatedName("ca.q")
    public int[] field1403;

    @ObfuscatedName("ca.o")
    public int[] field1404;

    @ObfuscatedName("ca.p")
    public String[] field1409;

    @ObfuscatedName("ca.a")
    public int field1408;

    @ObfuscatedName("ca.h")
    public int field1402;

    @ObfuscatedName("ca.l")
    public int field1405;

    @ObfuscatedName("ca.y")
    public int field1406;

    @ObfuscatedName("ca.g")
    public class207[] field1410;

    @ObfuscatedName("o.b(ILiu;I)Lca;")
    public static class96 method2(int arg0, class240 arg1) {
        class96 var2 = (class96) field1407.method3658((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1233.method4177(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1233.method4167(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class96 var6 = method4266(var5);
            if (var6 != null) {
                field1407.method3659(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("in.q([BB)Lca;")
    public static class96 method4266(byte[] arg0) {
        class96 var1 = new class96();
        class194 var2 = new class194(arg0);
        var2.field2538 = var2.field2541.length - 2;
        int var3 = var2.method3249();
        int var4 = var2.field2541.length - 2 - var3 - 12;
        var2.field2538 = var4;
        int var5 = var2.method3261();
        var1.field1408 = var2.method3249();
        var1.field1402 = var2.method3249();
        var1.field1405 = var2.method3249();
        var1.field1406 = var2.method3249();
        int var6 = var2.method3247();
        if (var6 > 0) {
            var1.field1410 = var1.method1856(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3249();
                class207 var9 = new class207(var8 > 0 ? class198.method2924(var8) : 1);
                var1.field1410[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3261();
                    int var11 = var2.method3261();
                    var9.method3636(new class219(var11), (long) var10);
                }
            }
        }
        var2.field2538 = 0;
        var2.method3412();
        var1.field1403 = new int[var5];
        var1.field1404 = new int[var5];
        var1.field1409 = new String[var5];
        int var12 = 0;
        while (var2.field2538 < var4) {
            int var13 = var2.method3249();
            if (var13 == 3) {
                var1.field1409[var12] = var2.method3256();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1404[var12] = var2.method3247();
            } else {
                var1.field1404[var12] = var2.method3261();
            }
            var1.field1403[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ca.o(II)[Lgv;")
    public class207[] method1856(int arg0) {
        return new class207[arg0];
    }
}
