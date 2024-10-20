package deob;

@ObfuscatedName("bg")
public class class72 extends class364 {

    @ObfuscatedName("bg.n")
    public static class236 field946 = new class236(128);

    @ObfuscatedName("bg.c")
    public String field942;

    @ObfuscatedName("bg.m")
    public int[] field941;

    @ObfuscatedName("bg.k")
    public int[] field948;

    @ObfuscatedName("bg.o")
    public String[] field943;

    @ObfuscatedName("bg.g")
    public int field950;

    @ObfuscatedName("bg.z")
    public int field945;

    @ObfuscatedName("bg.a")
    public int field939;

    @ObfuscatedName("bg.u")
    public int field947;

    @ObfuscatedName("bg.e")
    public class378[] field940;

    @ObfuscatedName("gh.n(IB)Lbg;")
    public static class72 method3558(int arg0) {
        class72 var1 = (class72) field946.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field991.method4710(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = method2130(var2);
            field946.method4169(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ci.c(IIII)Lbg;")
    public static class72 method1942(int arg0, int arg1, int arg2) {
        int var3 = class281.method3525(arg1, arg0);
        class72 var4 = (class72) field946.method4167((long) (var3 << 16));
        class72 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field991.method4725(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field991.method4771(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class72 var9 = method2130(var8);
                        if (var9 != null) {
                            field946.method4169(var9, (long) (var3 << 16));
                            var5 = var9;
                            break label47;
                        }
                    }
                    var5 = null;
                }
            }
        } else {
            var5 = var4;
        }
        if (var5 != null) {
            return var5;
        }
        int var11 = class281.method4194(arg2, arg0);
        class72 var12 = (class72) field946.method4167((long) (var11 << 16));
        class72 var13;
        if (var12 == null) {
            String var14 = String.valueOf(var11);
            int var15 = Statics.field991.method4725(var14);
            if (var15 == -1) {
                var13 = null;
            } else {
                byte[] var16 = Statics.field991.method4771(var15);
                if (var16 != null) {
                    if (var16.length <= 1) {
                        var13 = null;
                        return var13 == null ? null : var13;
                    }
                    class72 var17 = method2130(var16);
                    if (var17 != null) {
                        field946.method4169(var17, (long) (var11 << 16));
                        var13 = var17;
                        return var13 == null ? null : var13;
                    }
                }
                var13 = null;
            }
        } else {
            var13 = var12;
        }
        return var13 == null ? null : var13;
    }

    @ObfuscatedName("cm.m([BI)Lbg;")
    public static class72 method2130(byte[] arg0) {
        class72 var1 = new class72();
        class400 var2 = new class400(arg0);
        var2.field4272 = var2.field4271.length - 2;
        int var3 = var2.method6219();
        int var4 = var2.field4271.length - 2 - var3 - 12;
        var2.field4272 = var4;
        int var5 = var2.method6222();
        var1.field950 = var2.method6219();
        var1.field945 = var2.method6219();
        var1.field939 = var2.method6219();
        var1.field947 = var2.method6219();
        int var6 = var2.method6217();
        if (var6 > 0) {
            var1.field940 = var1.method1839(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method6219();
                class378 var9 = new class378(var8 > 0 ? class246.method1937(var8) : 1);
                var1.field940[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method6222();
                    int var11 = var2.method6222();
                    var9.method5997(new class368(var11), (long) var10);
                }
            }
        }
        var2.field4272 = 0;
        var1.field942 = var2.method6198();
        var1.field941 = new int[var5];
        var1.field948 = new int[var5];
        var1.field943 = new String[var5];
        int var12 = 0;
        while (var2.field4272 < var4) {
            int var13 = var2.method6219();
            if (var13 == 3) {
                var1.field943[var12] = var2.method6226();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field948[var12] = var2.method6217();
            } else {
                var1.field948[var12] = var2.method6222();
            }
            var1.field941[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bg.k(IB)[Lnz;")
    public class378[] method1839(int arg0) {
        return new class378[arg0];
    }
}
