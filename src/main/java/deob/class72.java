package deob;

@ObfuscatedName("bp")
public class class72 extends class365 {

    @ObfuscatedName("bp.i")
    public static class236 field934 = new class236(128);

    @ObfuscatedName("bp.w")
    public String field929;

    @ObfuscatedName("bp.s")
    public int[] field928;

    @ObfuscatedName("bp.a")
    public int[] field931;

    @ObfuscatedName("bp.o")
    public String[] field932;

    @ObfuscatedName("bp.g")
    public int field933;

    @ObfuscatedName("bp.e")
    public int field930;

    @ObfuscatedName("bp.p")
    public int field935;

    @ObfuscatedName("bp.j")
    public int field936;

    @ObfuscatedName("bp.b")
    public class379[] field937;

    @ObfuscatedName("ei.i(IB)Lbp;")
    public static class72 method2663(int arg0) {
        class72 var1 = (class72) field934.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field70.method4743(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = method2106(var2);
            field934.method4206(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("br.w(IIII)Lbp;")
    public static class72 method1674(int arg0, int arg1, int arg2) {
        int var3 = class281.method2104(arg1, arg0);
        class72 var4 = (class72) field934.method4205((long) (var3 << 16));
        class72 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field70.method4759(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field70.method4749(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class72 var9 = method2106(var8);
                        if (var9 != null) {
                            field934.method4206(var9, (long) (var3 << 16));
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
        class72 var13 = (class72) field934.method4205((long) (var11 << 16));
        class72 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var11);
            int var16 = Statics.field70.method4759(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field70.method4749(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class72 var18 = method2106(var17);
                    if (var18 != null) {
                        field934.method4206(var18, (long) (var11 << 16));
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

    @ObfuscatedName("cl.s([BI)Lbp;")
    public static class72 method2106(byte[] arg0) {
        class72 var1 = new class72();
        class401 var2 = new class401(arg0);
        var2.field4300 = var2.field4302.length - 2;
        int var3 = var2.method6242();
        int var4 = var2.field4302.length - 2 - var3 - 12;
        var2.field4300 = var4;
        int var5 = var2.method6245();
        var1.field933 = var2.method6242();
        var1.field930 = var2.method6242();
        var1.field935 = var2.method6242();
        var1.field936 = var2.method6242();
        int var6 = var2.method6240();
        if (var6 > 0) {
            var1.field937 = var1.method1880(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method6242();
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
                class379 var17 = new class379(var16);
                var1.field937[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method6245();
                    int var19 = var2.method6245();
                    var17.method6010(new class369(var19), (long) var18);
                }
            }
        }
        var2.field4300 = 0;
        var1.field929 = var2.method6369();
        var1.field928 = new int[var5];
        var1.field931 = new int[var5];
        var1.field932 = new String[var5];
        int var20 = 0;
        while (var2.field4300 < var4) {
            int var21 = var2.method6242();
            if (var21 == 3) {
                var1.field932[var20] = var2.method6335();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field931[var20] = var2.method6240();
            } else {
                var1.field931[var20] = var2.method6245();
            }
            var1.field928[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("bp.a(IB)[Lnf;")
    public class379[] method1880(int arg0) {
        return new class379[arg0];
    }
}
