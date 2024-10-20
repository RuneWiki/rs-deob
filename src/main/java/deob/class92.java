package deob;

@ObfuscatedName("cn")
public class class92 extends class214 {

    @ObfuscatedName("cn.n")
    public static class208 field1252 = new class208(128);

    @ObfuscatedName("cn.h")
    public int[] field1243;

    @ObfuscatedName("cn.l")
    public int[] field1244;

    @ObfuscatedName("cn.g")
    public String[] field1245;

    @ObfuscatedName("cn.b")
    public int field1242;

    @ObfuscatedName("cn.a")
    public int field1251;

    @ObfuscatedName("cn.c")
    public int field1247;

    @ObfuscatedName("cn.z")
    public int field1249;

    @ObfuscatedName("cn.j")
    public class205[] field1250;

    @ObfuscatedName("io.n(II)Lcn;")
    public static class92 method4616(int arg0) {
        class92 var1 = (class92) field1252.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1733.method4494(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class92 var3 = method2037(var2);
            field1252.method3908(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bs.h(IIII)Lcn;")
    public static class92 method1134(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class92 var5 = method1009(var3, arg0);
        if (var5 == null) {
            int var6 = class244.method2782(arg2, arg0);
            class92 var7 = method1009(var6, arg0);
            return var7 == null ? null : var7;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("bj.l(IIB)Lcn;")
    public static class92 method1009(int arg0, int arg1) {
        class92 var2 = (class92) field1252.method3902((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1733.method4472(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1733.method4470(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class92 var6 = method2037(var5);
            if (var6 != null) {
                field1252.method3908(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ci.g([BB)Lcn;")
    public static class92 method2037(byte[] arg0) {
        class92 var1 = new class92();
        class190 var2 = new class190(arg0);
        var2.field2423 = var2.field2424.length - 2;
        int var3 = var2.method3513();
        int var4 = var2.field2424.length - 2 - var3 - 12;
        var2.field2423 = var4;
        int var5 = var2.method3562();
        var1.field1242 = var2.method3513();
        var1.field1251 = var2.method3513();
        var1.field1247 = var2.method3513();
        var1.field1249 = var2.method3513();
        int var6 = var2.method3511();
        if (var6 > 0) {
            var1.field1250 = var1.method2026(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3513();
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
                class205 var17 = new class205(var16);
                var1.field1250[var7] = var17;
                while (var8-- > 0) {
                    int var18 = var2.method3562();
                    int var19 = var2.method3562();
                    var17.method3877(new class219(var19), (long) var18);
                }
            }
        }
        var2.field2423 = 0;
        var2.method3575();
        var1.field1243 = new int[var5];
        var1.field1244 = new int[var5];
        var1.field1245 = new String[var5];
        int var20 = 0;
        while (var2.field2423 < var4) {
            int var21 = var2.method3513();
            if (var21 == 3) {
                var1.field1245[var20] = var2.method3520();
            } else if (var21 >= 100 || var21 == 21 || var21 == 38 || var21 == 39) {
                var1.field1244[var20] = var2.method3511();
            } else {
                var1.field1244[var20] = var2.method3562();
            }
            var1.field1243[var20++] = var21;
        }
        return var1;
    }

    @ObfuscatedName("cn.b(IB)[Lgq;")
    public class205[] method2026(int arg0) {
        return new class205[arg0];
    }
}
