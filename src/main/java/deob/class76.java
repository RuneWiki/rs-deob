package deob;

@ObfuscatedName("bz")
public class class76 extends class425 {

    @ObfuscatedName("bz.a")
    public static class266 field965 = new class266(128);

    @ObfuscatedName("bz.f")
    public String field963;

    @ObfuscatedName("bz.c")
    public int[] field964;

    @ObfuscatedName("bz.x")
    public int[] field970;

    @ObfuscatedName("bz.h")
    public String[] field966;

    @ObfuscatedName("bz.j")
    public int field967;

    @ObfuscatedName("bz.y")
    public int field968;

    @ObfuscatedName("bz.d")
    public int field969;

    @ObfuscatedName("bz.n")
    public int field962;

    @ObfuscatedName("bz.r")
    public class440[] field971;

    @ObfuscatedName("fx.a(IB)Lbz;")
    public static class76 method2980(int arg0) {
        class76 var1 = (class76) field965.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2035.method5859(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class76 var3 = method656(var2);
            field965.method4834(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bw.f(IIII)Lbz;")
    public static class76 method1944(int arg0, int arg1, int arg2) {
        int var3 = class322.method3553(arg1, arg0);
        class76 var4 = method7580(var3, arg0);
        if (var4 == null) {
            int var5 = class322.method1924(arg2, arg0);
            class76 var6 = method7580(var5, arg0);
            return var6 == null ? null : var6;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("qi.c(III)Lbz;")
    public static class76 method7580(int arg0, int arg1) {
        class76 var2 = (class76) field965.method4839((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2035.method5813(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2035.method5797(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class76 var6 = method656(var5);
            if (var6 != null) {
                field965.method4834(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ae.x([BI)Lbz;")
    public static class76 method656(byte[] arg0) {
        class76 var1 = new class76();
        class464 var2 = new class464(arg0);
        var2.field4864 = var2.field4867.length - 2;
        int var3 = var2.method7716();
        int var4 = var2.field4867.length - 2 - var3 - 12;
        var2.field4864 = var4;
        int var5 = var2.method7720();
        var1.field967 = var2.method7716();
        var1.field968 = var2.method7716();
        var1.field969 = var2.method7716();
        var1.field962 = var2.method7716();
        int var6 = var2.method7735();
        if (var6 > 0) {
            var1.field971 = var1.method2026(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method7716();
                class440 var9 = new class440(var8 > 0 ? class282.method707(var8) : 1);
                var1.field971[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method7720();
                    int var11 = var2.method7720();
                    var9.method7448(new class429(var11), (long) var10);
                }
            }
        }
        var2.field4864 = 0;
        var1.field963 = var2.method7899();
        var1.field964 = new int[var5];
        var1.field970 = new int[var5];
        var1.field966 = new String[var5];
        int var12 = 0;
        while (var2.field4864 < var4) {
            int var13 = var2.method7716();
            if (var13 == 3) {
                var1.field966[var12] = var2.method7725();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field970[var12] = var2.method7735();
            } else {
                var1.field970[var12] = var2.method7720();
            }
            var1.field964[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bz.h(IS)[Lpe;")
    public class440[] method2026(int arg0) {
        return new class440[arg0];
    }
}
