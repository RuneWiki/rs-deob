package deob;

@ObfuscatedName("ba")
public class class75 extends class435 {

    @ObfuscatedName("ba.f")
    public static class273 field988 = new class273(128);

    @ObfuscatedName("ba.w")
    public String field982;

    @ObfuscatedName("ba.v")
    public int[] field981;

    @ObfuscatedName("ba.s")
    public int[] field989;

    @ObfuscatedName("ba.z")
    public String[] field983;

    @ObfuscatedName("ba.j")
    public int field984;

    @ObfuscatedName("ba.i")
    public int field985;

    @ObfuscatedName("ba.n")
    public int field990;

    @ObfuscatedName("ba.l")
    public int field987;

    @ObfuscatedName("ba.k")
    public class450[] field979;

    @ObfuscatedName("by.f(II)Lba;")
    public static class75 method1999(int arg0) {
        class75 var1 = (class75) field988.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field66.method5990(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class75 var3 = method4523(var2);
            field988.method5027(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("eo.w(IIII)Lba;")
    public static class75 method3014(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class75 var5 = (class75) field988.method5028((long) (var3 << 16));
        class75 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field66.method5988(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field66.method5978(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class75 var10 = method4523(var9);
                        if (var10 != null) {
                            field988.method5027(var10, (long) (var3 << 16));
                            var6 = var10;
                            break label47;
                        }
                    }
                    var6 = null;
                }
            }
        } else {
            var6 = var5;
        }
        if (var6 != null) {
            return var6;
        }
        int var12 = class328.method3877(arg2, arg0);
        class75 var13 = (class75) field988.method5028((long) (var12 << 16));
        class75 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var12);
            int var16 = Statics.field66.method5988(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field66.method5978(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class75 var18 = method4523(var17);
                    if (var18 != null) {
                        field988.method5027(var18, (long) (var12 << 16));
                        var14 = var18;
                        return var14 == null ? null : var14;
                    }
                }
                var14 = null;
            }
        } else {
            var14 = var13;
        }
        return var14 == null ? null : var14;
    }

    @ObfuscatedName("ip.v([BB)Lba;")
    public static class75 method4523(byte[] arg0) {
        class75 var1 = new class75();
        class474 var2 = new class474(arg0);
        var2.field4939 = var2.field4936.length - 2;
        int var3 = var2.method8032();
        int var4 = var2.field4936.length - 2 - var3 - 12;
        var2.field4939 = var4;
        int var5 = var2.method7979();
        var1.field984 = var2.method8032();
        var1.field985 = var2.method8032();
        var1.field990 = var2.method8032();
        var1.field987 = var2.method8032();
        int var6 = var2.method7964();
        if (var6 > 0) {
            var1.field979 = var1.method2101(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8032();
                class450 var9 = new class450(var8 > 0 ? class289.method16(var8) : 1);
                var1.field979[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method7979();
                    int var11 = var2.method7979();
                    var9.method7693(new class439(var11), (long) var10);
                }
            }
        }
        var2.field4939 = 0;
        var1.field982 = var2.method7973();
        var1.field981 = new int[var5];
        var1.field989 = new int[var5];
        var1.field983 = new String[var5];
        int var12 = 0;
        while (var2.field4939 < var4) {
            int var13 = var2.method8032();
            if (var13 == 3) {
                var1.field983[var12] = var2.method7983();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field989[var12] = var2.method7964();
            } else {
                var1.field989[var12] = var2.method7979();
            }
            var1.field981[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ba.s(II)[Lqu;")
    public class450[] method2101(int arg0) {
        return new class450[arg0];
    }
}
