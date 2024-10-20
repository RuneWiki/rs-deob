package deob;

@ObfuscatedName("cf")
public class class96 extends class206 {

    @ObfuscatedName("cf.s")
    public static class201 field1425 = new class201(128);

    @ObfuscatedName("cf.g")
    public int[] field1430;

    @ObfuscatedName("cf.m")
    public int[] field1423;

    @ObfuscatedName("cf.h")
    public String[] field1421;

    @ObfuscatedName("cf.i")
    public int field1422;

    @ObfuscatedName("cf.w")
    public int field1426;

    @ObfuscatedName("cf.t")
    public int field1427;

    @ObfuscatedName("cf.d")
    public int field1428;

    @ObfuscatedName("cf.z")
    public class198[] field1429;

    @ObfuscatedName("ai.s(ILhj;I)Lcf;")
    public static class96 method457(int arg0, class231 arg1) {
        class96 var2 = (class96) field1425.method3673((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field335.method4201(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field335.method4207(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class96 var6 = method1729(var5);
            if (var6 != null) {
                field1425.method3675(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ch.g([BI)Lcf;")
    public static class96 method1729(byte[] arg0) {
        class96 var1 = new class96();
        class185 var2 = new class185(arg0);
        var2.field2514 = var2.field2512.length - 2;
        int var3 = var2.method3241();
        int var4 = var2.field2512.length - 2 - var3 - 12;
        var2.field2514 = var4;
        int var5 = var2.method3292();
        var1.field1422 = var2.method3241();
        var1.field1426 = var2.method3241();
        var1.field1427 = var2.method3241();
        var1.field1428 = var2.method3241();
        int var6 = var2.method3239();
        if (var6 > 0) {
            var1.field1429 = var1.method1882(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3241();
                class198 var9 = new class198(class189.method3203(var8));
                var1.field1429[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3292();
                    int var11 = var2.method3292();
                    var9.method3642(new class210(var11), (long) var10);
                }
            }
        }
        var2.field2514 = 0;
        var2.method3274();
        var1.field1430 = new int[var5];
        var1.field1423 = new int[var5];
        var1.field1421 = new String[var5];
        int var12 = 0;
        while (var2.field2514 < var4) {
            int var13 = var2.method3241();
            if (var13 == 3) {
                var1.field1421[var12] = var2.method3248();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1423[var12] = var2.method3239();
            } else {
                var1.field1423[var12] = var2.method3292();
            }
            var1.field1430[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cf.m(II)[Lgz;")
    public class198[] method1882(int arg0) {
        return new class198[arg0];
    }
}
