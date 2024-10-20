package deob;

@ObfuscatedName("cx")
public class class87 extends class209 {

    @ObfuscatedName("cx.g")
    public static class203 field1262 = new class203(128);

    @ObfuscatedName("cx.r")
    public int[] field1258;

    @ObfuscatedName("cx.e")
    public int[] field1253;

    @ObfuscatedName("cx.q")
    public String[] field1256;

    @ObfuscatedName("cx.c")
    public int field1257;

    @ObfuscatedName("cx.l")
    public int field1255;

    @ObfuscatedName("cx.b")
    public int field1259;

    @ObfuscatedName("cx.w")
    public int field1260;

    @ObfuscatedName("cx.n")
    public class200[] field1254;

    @ObfuscatedName("i.g(IB)Lcx;")
    public static class87 method100(int arg0) {
        class87 var1 = (class87) field1262.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1915.method4438(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class87 var3 = method1925(var2);
            field1262.method3885(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ae.r(IIII)Lcx;")
    public static class87 method539(int arg0, int arg1, int arg2) {
        int var3 = class239.method4064(arg1, arg0);
        class87 var4 = method2023(var3, arg0);
        if (var4 == null) {
            int var5 = (arg2 + 40000 << 8) + arg0;
            class87 var7 = method2023(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("cx.e(IIB)Lcx;")
    public static class87 method2023(int arg0, int arg1) {
        class87 var2 = (class87) field1262.method3879((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1915.method4432(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1915.method4442(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class87 var6 = method1925(var5);
            if (var6 != null) {
                field1262.method3885(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("cg.q([BB)Lcx;")
    public static class87 method1925(byte[] arg0) {
        class87 var1 = new class87();
        class185 var2 = new class185(arg0);
        var2.field2406 = var2.field2405.length - 2;
        int var3 = var2.method3467();
        int var4 = var2.field2405.length - 2 - var3 - 12;
        var2.field2406 = var4;
        int var5 = var2.method3588();
        var1.field1257 = var2.method3467();
        var1.field1255 = var2.method3467();
        var1.field1259 = var2.method3467();
        var1.field1260 = var2.method3467();
        int var6 = var2.method3679();
        if (var6 > 0) {
            var1.field1254 = var1.method2021(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3467();
                class200 var9 = new class200(var8 > 0 ? class190.method29(var8) : 1);
                var1.field1254[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3588();
                    int var11 = var2.method3588();
                    var9.method3851(new class214(var11), (long) var10);
                }
            }
        }
        var2.field2406 = 0;
        var2.method3473();
        var1.field1258 = new int[var5];
        var1.field1253 = new int[var5];
        var1.field1256 = new String[var5];
        int var12 = 0;
        while (var2.field2406 < var4) {
            int var13 = var2.method3467();
            if (var13 == 3) {
                var1.field1256[var12] = var2.method3474();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1253[var12] = var2.method3679();
            } else {
                var1.field1253[var12] = var2.method3588();
            }
            var1.field1258[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cx.c(II)[Lgr;")
    public class200[] method2021(int arg0) {
        return new class200[arg0];
    }
}
