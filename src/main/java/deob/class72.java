package deob;

@ObfuscatedName("bd")
public class class72 extends class404 {

    @ObfuscatedName("bd.v")
    public static class257 field967 = new class257(128);

    @ObfuscatedName("bd.c")
    public String field955;

    @ObfuscatedName("bd.i")
    public int[] field957;

    @ObfuscatedName("bd.f")
    public int[] field958;

    @ObfuscatedName("bd.b")
    public String[] field963;

    @ObfuscatedName("bd.n")
    public int field960;

    @ObfuscatedName("bd.s")
    public int field961;

    @ObfuscatedName("bd.l")
    public int field959;

    @ObfuscatedName("bd.q")
    public int field962;

    @ObfuscatedName("bd.o")
    public class418[] field964;

    @ObfuscatedName("iy.c(IIII)Lbd;")
    public static class72 method4608(int arg0, int arg1, int arg2) {
        int var3 = class307.method2280(arg1, arg0);
        class72 var4 = method2478(var3, arg0);
        if (var4 == null) {
            int var5 = (-3 - arg2 << 8) + arg0;
            class72 var7 = method2478(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("dd.i(III)Lbd;")
    public static class72 method2478(int arg0, int arg1) {
        class72 var2 = (class72) field967.method4644((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1687.method5293(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1687.method5301(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class72 var6 = method719(var5);
            if (var6 != null) {
                field967.method4651(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ay.f([BI)Lbd;")
    public static class72 method719(byte[] arg0) {
        class72 var1 = new class72();
        class438 var2 = new class438(arg0);
        var2.field4621 = var2.field4618.length - 2;
        int var3 = var2.method7148();
        int var4 = var2.field4618.length - 2 - var3 - 12;
        var2.field4621 = var4;
        int var5 = var2.method6976();
        var1.field960 = var2.method7148();
        var1.field961 = var2.method7148();
        var1.field959 = var2.method7148();
        var1.field962 = var2.method7148();
        int var6 = var2.method6971();
        if (var6 > 0) {
            var1.field964 = var1.method1899(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method7148();
                class418 var9 = new class418(var8 > 0 ? class272.method1825(var8) : 1);
                var1.field964[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method6976();
                    int var11 = var2.method6976();
                    var9.method6757(new class408(var11), (long) var10);
                }
            }
        }
        var2.field4621 = 0;
        var1.field955 = var2.method6980();
        var1.field957 = new int[var5];
        var1.field958 = new int[var5];
        var1.field963 = new String[var5];
        int var12 = 0;
        while (var2.field4621 < var4) {
            int var13 = var2.method7148();
            if (var13 == 3) {
                var1.field963[var12] = var2.method6981();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field958[var12] = var2.method6971();
            } else {
                var1.field958[var12] = var2.method6976();
            }
            var1.field957[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bd.b(II)[Lpt;")
    public class418[] method1899(int arg0) {
        return new class418[arg0];
    }
}
