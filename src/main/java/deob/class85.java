package deob;

@ObfuscatedName("cs")
public class class85 extends class207 {

    @ObfuscatedName("cs.w")
    public static class201 field1215 = new class201(128);

    @ObfuscatedName("cs.m")
    public int[] field1212;

    @ObfuscatedName("cs.q")
    public int[] field1217;

    @ObfuscatedName("cs.b")
    public String[] field1213;

    @ObfuscatedName("cs.f")
    public int field1214;

    @ObfuscatedName("cs.n")
    public int field1211;

    @ObfuscatedName("cs.h")
    public int field1216;

    @ObfuscatedName("cs.x")
    public int field1210;

    @ObfuscatedName("cs.j")
    public class198[] field1218;

    @ObfuscatedName("bf.w(IB)Lcs;")
    public static class85 method1689(int arg0) {
        class85 var1 = (class85) field1215.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field22.method4250(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class85 var3 = method2953(var2);
            field1215.method3712(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("at.m(IIII)Lcs;")
    public static class85 method453(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class85 var5 = (class85) field1215.method3707((long) (var3 << 16));
        class85 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = Statics.field22.method4268(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = Statics.field22.method4342(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class85 var10 = method2953(var9);
                        if (var10 != null) {
                            field1215.method3712(var10, (long) (var3 << 16));
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
        int var12 = (arg2 + 40000 << 8) + arg0;
        class85 var14 = (class85) field1215.method3707((long) (var12 << 16));
        class85 var15;
        if (var14 == null) {
            String var16 = String.valueOf(var12);
            int var17 = Statics.field22.method4268(var16);
            if (var17 == -1) {
                var15 = null;
            } else {
                byte[] var18 = Statics.field22.method4342(var17);
                if (var18 != null) {
                    if (var18.length <= 1) {
                        var15 = null;
                        return var15 == null ? null : var15;
                    }
                    class85 var19 = method2953(var18);
                    if (var19 != null) {
                        field1215.method3712(var19, (long) (var12 << 16));
                        var15 = var19;
                        return var15 == null ? null : var15;
                    }
                }
                var15 = null;
            }
        } else {
            var15 = var14;
        }
        return var15 == null ? null : var15;
    }

    @ObfuscatedName("eh.q([BI)Lcs;")
    public static class85 method2953(byte[] arg0) {
        class85 var1 = new class85();
        class183 var2 = new class183(arg0);
        var2.field2360 = var2.field2366.length - 2;
        int var3 = var2.method3268();
        int var4 = var2.field2366.length - 2 - var3 - 12;
        var2.field2360 = var4;
        int var5 = var2.method3267();
        var1.field1214 = var2.method3268();
        var1.field1211 = var2.method3268();
        var1.field1216 = var2.method3268();
        var1.field1210 = var2.method3268();
        int var6 = var2.method3436();
        if (var6 > 0) {
            var1.field1218 = var1.method1848(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3268();
                class198 var9 = new class198(var8 > 0 ? class188.method1781(var8) : 1);
                var1.field1218[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3267();
                    int var11 = var2.method3267();
                    var9.method3676(new class212(var11), (long) var10);
                }
            }
        }
        var2.field2360 = 0;
        var2.method3270();
        var1.field1212 = new int[var5];
        var1.field1217 = new int[var5];
        var1.field1213 = new String[var5];
        int var12 = 0;
        while (var2.field2360 < var4) {
            int var13 = var2.method3268();
            if (var13 == 3) {
                var1.field1213[var12] = var2.method3271();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1217[var12] = var2.method3436();
            } else {
                var1.field1217[var12] = var2.method3267();
            }
            var1.field1212[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cs.x(II)[Lgx;")
    public class198[] method1848(int arg0) {
        return new class198[arg0];
    }
}
