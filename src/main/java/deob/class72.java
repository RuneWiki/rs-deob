package deob;

@ObfuscatedName("bn")
public class class72 extends class382 {

    @ObfuscatedName("bn.c")
    public static class249 field935 = new class249(128);

    @ObfuscatedName("bn.b")
    public String field938;

    @ObfuscatedName("bn.p")
    public int[] field937;

    @ObfuscatedName("bn.m")
    public int[] field934;

    @ObfuscatedName("bn.t")
    public String[] field939;

    @ObfuscatedName("bn.s")
    public int field936;

    @ObfuscatedName("bn.j")
    public int field940;

    @ObfuscatedName("bn.w")
    public int field941;

    @ObfuscatedName("bn.n")
    public int field942;

    @ObfuscatedName("bn.r")
    public class396[] field943;

    @ObfuscatedName("oi.c(IB)Lbn;")
    public static class72 method6586(int arg0) {
        class72 var1 = (class72) field935.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1680.method5053(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = method2730(var2);
            field935.method4515(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("gi.b(IIIB)Lbn;")
    public static class72 method3625(int arg0, int arg1, int arg2) {
        int var3 = class294.method4072(arg1, arg0);
        class72 var4 = (class72) field935.method4514((long) (var3 << 16));
        class72 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field1680.method5118(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field1680.method5059(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class72 var9 = method2730(var8);
                        if (var9 != null) {
                            field935.method4515(var9, (long) (var3 << 16));
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
        int var11 = (-3 - arg2 << 8) + arg0;
        class72 var13 = (class72) field935.method4514((long) (var11 << 16));
        class72 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var11);
            int var16 = Statics.field1680.method5118(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field1680.method5059(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class72 var18 = method2730(var17);
                    if (var18 != null) {
                        field935.method4515(var18, (long) (var11 << 16));
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

    @ObfuscatedName("eh.p([BI)Lbn;")
    public static class72 method2730(byte[] arg0) {
        class72 var1 = new class72();
        class419 var2 = new class419(arg0);
        var2.field4475 = var2.field4477.length - 2;
        int var3 = var2.method6672();
        int var4 = var2.field4477.length - 2 - var3 - 12;
        var2.field4475 = var4;
        int var5 = var2.method6675();
        var1.field936 = var2.method6672();
        var1.field940 = var2.method6672();
        var1.field941 = var2.method6672();
        var1.field942 = var2.method6672();
        int var6 = var2.method6781();
        if (var6 > 0) {
            var1.field943 = var1.method1943(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method6672();
                class396 var9 = new class396(var8 > 0 ? class259.method3053(var8) : 1);
                var1.field943[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method6675();
                    int var11 = var2.method6675();
                    var9.method6431(new class386(var11), (long) var10);
                }
            }
        }
        var2.field4475 = 0;
        var1.field938 = var2.method6679();
        var1.field937 = new int[var5];
        var1.field934 = new int[var5];
        var1.field939 = new String[var5];
        int var12 = 0;
        while (var2.field4475 < var4) {
            int var13 = var2.method6672();
            if (var13 == 3) {
                var1.field939[var12] = var2.method6707();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field934[var12] = var2.method6781();
            } else {
                var1.field934[var12] = var2.method6675();
            }
            var1.field937[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bn.m(II)[Loz;")
    public class396[] method1943(int arg0) {
        return new class396[arg0];
    }
}
