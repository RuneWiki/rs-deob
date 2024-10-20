package deob;

@ObfuscatedName("ce")
public class class93 extends class176 {

    @ObfuscatedName("ce.c")
    public static class146 field1269 = new class146(128);

    @ObfuscatedName("ce.t")
    public int[] field1267;

    @ObfuscatedName("ce.o")
    public int[] field1274;

    @ObfuscatedName("ce.e")
    public String[] field1268;

    @ObfuscatedName("ce.i")
    public int field1270;

    @ObfuscatedName("ce.g")
    public int field1271;

    @ObfuscatedName("ce.d")
    public int field1272;

    @ObfuscatedName("ce.l")
    public int field1273;

    @ObfuscatedName("ce.j")
    public class317[] field1266;

    @ObfuscatedName("eo.c(II)Lce;")
    public static class93 method3160(int arg0) {
        class93 var1 = (class93) field1269.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2017.method3845(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class93 var3 = method3267(var2);
            field1269.method3102(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("gj.t(IIII)Lce;")
    public static class93 method3430(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class93 var5 = method3227(var3, arg0);
        if (var5 == null) {
            int var6 = class223.method3653(arg2, arg0);
            class93 var7 = method3227(var6, arg0);
            return var7 == null ? null : var7;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("fj.o(III)Lce;")
    public static class93 method3227(int arg0, int arg1) {
        class93 var2 = (class93) field1269.method3100((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2017.method3854(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2017.method3898(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class93 var6 = method3267(var5);
            if (var6 != null) {
                field1269.method3102(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("fu.e([BB)Lce;")
    public static class93 method3267(byte[] arg0) {
        class93 var1 = new class93();
        class301 var2 = new class301(arg0);
        var2.field3707 = var2.field3708.length - 2;
        int var3 = var2.method5124();
        int var4 = var2.field3708.length - 2 - var3 - 12;
        var2.field3707 = var4;
        int var5 = var2.method5134();
        var1.field1270 = var2.method5124();
        var1.field1271 = var2.method5124();
        var1.field1272 = var2.method5124();
        var1.field1273 = var2.method5124();
        int var6 = var2.method5129();
        if (var6 > 0) {
            var1.field1266 = var1.method2079(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method5124();
                class317 var9 = new class317(var8 > 0 ? class189.method2097(var8) : 1);
                var1.field1266[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method5134();
                    int var11 = var2.method5134();
                    var9.method5496(new class180(var11), (long) var10);
                }
            }
        }
        var2.field3707 = 0;
        var2.method5196();
        var1.field1267 = new int[var5];
        var1.field1274 = new int[var5];
        var1.field1268 = new String[var5];
        int var12 = 0;
        while (var2.field3707 < var4) {
            int var13 = var2.method5124();
            if (var13 == 3) {
                var1.field1268[var12] = var2.method5138();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1274[var12] = var2.method5129();
            } else {
                var1.field1274[var12] = var2.method5134();
            }
            var1.field1267[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ce.i(IB)[Llp;")
    public class317[] method2079(int arg0) {
        return new class317[arg0];
    }
}
