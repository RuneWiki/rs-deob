package deob;

@ObfuscatedName("cw")
public class class87 extends class209 {

    @ObfuscatedName("cw.f")
    public static class203 field1232 = new class203(128);

    @ObfuscatedName("cw.h")
    public int[] field1239;

    @ObfuscatedName("cw.e")
    public int[] field1234;

    @ObfuscatedName("cw.b")
    public String[] field1235;

    @ObfuscatedName("cw.l")
    public int field1236;

    @ObfuscatedName("cw.w")
    public int field1237;

    @ObfuscatedName("cw.d")
    public int field1240;

    @ObfuscatedName("cw.n")
    public int field1233;

    @ObfuscatedName("cw.s")
    public class200[] field1238;

    @ObfuscatedName("au.f(II)Lcw;")
    public static class87 method876(int arg0) {
        class87 var1 = (class87) field1232.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field568.method4267(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class87 var3 = method653(var2);
            field1232.method3723(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bs.h(IIII)Lcw;")
    public static class87 method1512(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class87 var5 = method679(var3, arg0);
        if (var5 == null) {
            int var6 = (arg2 + 40000 << 8) + arg0;
            class87 var8 = method679(var6, arg0);
            return var8 == null ? null : var8;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("at.e(III)Lcw;")
    public static class87 method679(int arg0, int arg1) {
        class87 var2 = (class87) field1232.method3724((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field568.method4285(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field568.method4333(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class87 var6 = method653(var5);
            if (var6 != null) {
                field1232.method3723(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ar.b([BI)Lcw;")
    public static class87 method653(byte[] arg0) {
        class87 var1 = new class87();
        class185 var2 = new class185(arg0);
        var2.field2397 = var2.field2399.length - 2;
        int var3 = var2.method3325();
        int var4 = var2.field2399.length - 2 - var3 - 12;
        var2.field2397 = var4;
        int var5 = var2.method3328();
        var1.field1236 = var2.method3325();
        var1.field1237 = var2.method3325();
        var1.field1240 = var2.method3325();
        var1.field1233 = var2.method3325();
        int var6 = var2.method3323();
        if (var6 > 0) {
            var1.field1238 = var1.method1864(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3325();
                class200 var9 = new class200(var8 > 0 ? class190.method2912(var8) : 1);
                var1.field1238[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3328();
                    int var11 = var2.method3328();
                    var9.method3698(new class214(var11), (long) var10);
                }
            }
        }
        var2.field2397 = 0;
        var2.method3379();
        var1.field1239 = new int[var5];
        var1.field1234 = new int[var5];
        var1.field1235 = new String[var5];
        int var12 = 0;
        while (var2.field2397 < var4) {
            int var13 = var2.method3325();
            if (var13 == 3) {
                var1.field1235[var12] = var2.method3435();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1234[var12] = var2.method3323();
            } else {
                var1.field1234[var12] = var2.method3328();
            }
            var1.field1239[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cw.l(II)[Lgt;")
    public class200[] method1864(int arg0) {
        return new class200[arg0];
    }
}
