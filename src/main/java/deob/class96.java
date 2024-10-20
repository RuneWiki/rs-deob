package deob;

@ObfuscatedName("cd")
public class class96 extends class206 {

    @ObfuscatedName("cd.p")
    public static class201 field1422 = new class201(128);

    @ObfuscatedName("cd.i")
    public int[] field1411;

    @ObfuscatedName("cd.w")
    public int[] field1412;

    @ObfuscatedName("cd.s")
    public String[] field1413;

    @ObfuscatedName("cd.j")
    public int field1414;

    @ObfuscatedName("cd.a")
    public int field1415;

    @ObfuscatedName("cd.t")
    public int field1416;

    @ObfuscatedName("cd.r")
    public int field1417;

    @ObfuscatedName("cd.m")
    public class198[] field1419;

    @ObfuscatedName("aj.p(Lhe;III)Lcd;")
    public static class96 method644(class231 arg0, int arg1, int arg2) {
        int var3 = class236.method3411(arg1, arg0);
        class96 var4 = method27(var3, arg0);
        if (var4 == null) {
            int var5 = (arg2 + 40000 << 8) + arg0.field2878;
            class96 var7 = method27(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("t.i(ILhe;B)Lcd;")
    public static class96 method27(int arg0, class231 arg1) {
        class96 var2 = (class96) field1422.method3504((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field390.method4117(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field390.method4097(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class96 var6 = method1358(var5);
            if (var6 != null) {
                field1422.method3506(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("client.w([BI)Lcd;")
    public static class96 method1358(byte[] arg0) {
        class96 var1 = new class96();
        class185 var2 = new class185(arg0);
        var2.field2488 = var2.field2491.length - 2;
        int var3 = var2.method3124();
        int var4 = var2.field2491.length - 2 - var3 - 12;
        var2.field2488 = var4;
        int var5 = var2.method3127();
        var1.field1414 = var2.method3124();
        var1.field1415 = var2.method3124();
        var1.field1416 = var2.method3124();
        var1.field1417 = var2.method3124();
        int var6 = var2.method3197();
        if (var6 > 0) {
            var1.field1419 = var1.method1851(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3124();
                class198 var9 = new class198(class189.method2865(var8));
                var1.field1419[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3127();
                    int var11 = var2.method3127();
                    var9.method3483(new class210(var11), (long) var10);
                }
            }
        }
        var2.field2488 = 0;
        var2.method3181();
        var1.field1411 = new int[var5];
        var1.field1412 = new int[var5];
        var1.field1413 = new String[var5];
        int var12 = 0;
        while (var2.field2488 < var4) {
            int var13 = var2.method3124();
            if (var13 == 3) {
                var1.field1413[var12] = var2.method3131();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1412[var12] = var2.method3197();
            } else {
                var1.field1412[var12] = var2.method3127();
            }
            var1.field1411[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cd.s(II)[Lgs;")
    public class198[] method1851(int arg0) {
        return new class198[arg0];
    }
}
