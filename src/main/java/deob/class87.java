package deob;

@ObfuscatedName("cz")
public class class87 extends class209 {

    @ObfuscatedName("cz.f")
    public static class203 field1256 = new class203(128);

    @ObfuscatedName("cz.l")
    public int[] field1255;

    @ObfuscatedName("cz.w")
    public int[] field1247;

    @ObfuscatedName("cz.s")
    public String[] field1248;

    @ObfuscatedName("cz.e")
    public int field1249;

    @ObfuscatedName("cz.a")
    public int field1258;

    @ObfuscatedName("cz.c")
    public int field1251;

    @ObfuscatedName("cz.p")
    public int field1250;

    @ObfuscatedName("cz.r")
    public class200[] field1253;

    @ObfuscatedName("at.f(II)Lcz;")
    public static class87 method506(int arg0) {
        class87 var1 = (class87) field1256.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1004.method4289(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class87 var3 = method516(var2);
            field1256.method3744(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("fi.l(IIII)Lcz;")
    public static class87 method3169(int arg0, int arg1, int arg2) {
        int var3 = class239.method83(arg1, arg0);
        class87 var4 = (class87) field1256.method3737((long) (var3 << 16));
        class87 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field1004.method4312(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field1004.method4296(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class87 var9 = method516(var8);
                        if (var9 != null) {
                            field1256.method3744(var9, (long) (var3 << 16));
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
        int var11 = class239.method184(arg2, arg0);
        class87 var12 = (class87) field1256.method3737((long) (var11 << 16));
        class87 var13;
        if (var12 == null) {
            String var14 = String.valueOf(var11);
            int var15 = Statics.field1004.method4312(var14);
            if (var15 == -1) {
                var13 = null;
            } else {
                byte[] var16 = Statics.field1004.method4296(var15);
                if (var16 != null) {
                    if (var16.length <= 1) {
                        var13 = null;
                        return var13 == null ? null : var13;
                    }
                    class87 var17 = method516(var16);
                    if (var17 != null) {
                        field1256.method3744(var17, (long) (var11 << 16));
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

    @ObfuscatedName("am.w([BI)Lcz;")
    public static class87 method516(byte[] arg0) {
        class87 var1 = new class87();
        class185 var2 = new class185(arg0);
        var2.field2414 = var2.field2415.length - 2;
        int var3 = var2.method3346();
        int var4 = var2.field2415.length - 2 - var3 - 12;
        var2.field2414 = var4;
        int var5 = var2.method3432();
        var1.field1249 = var2.method3346();
        var1.field1258 = var2.method3346();
        var1.field1251 = var2.method3346();
        var1.field1250 = var2.method3346();
        int var6 = var2.method3344();
        if (var6 > 0) {
            var1.field1253 = var1.method1915(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3346();
                int var16;
                if (var8 > 0) {
                    int var9 = var8 - 1;
                    int var10 = var9 | var9 >>> 1;
                    int var11 = var10 | var10 >>> 2;
                    int var12 = var11 | var11 >>> 4;
                    int var13 = var12 | var12 >>> 8;
                    int var14 = var13 | var13 >>> 16;
                    int var15 = var14 + 1;
                    var16 = var15;
                } else {
                    var16 = 1;
                }
                class200 var17 = new class200(var16);
                var1.field1253[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method3432();
                    int var19 = var2.method3432();
                    var17.method3708(new class214(var19), (long) var18);
                }
            }
        }
        var2.field2414 = 0;
        var2.method3352();
        var1.field1255 = new int[var5];
        var1.field1247 = new int[var5];
        var1.field1248 = new String[var5];
        int var20 = 0;
        while (var2.field2414 < var4) {
            int var21 = var2.method3346();
            if (var21 == 3) {
                var1.field1248[var20] = var2.method3353();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1247[var20] = var2.method3344();
            } else {
                var1.field1247[var20] = var2.method3432();
            }
            var1.field1255[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cz.s(IS)[Lga;")
    public class200[] method1915(int arg0) {
        return new class200[arg0];
    }
}
