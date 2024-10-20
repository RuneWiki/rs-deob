package deob;

@ObfuscatedName("cr")
public class class97 extends class219 {

    @ObfuscatedName("cr.g")
    public static class213 field1438 = new class213(128);

    @ObfuscatedName("cr.e")
    public int[] field1434;

    @ObfuscatedName("cr.b")
    public int[] field1433;

    @ObfuscatedName("cr.z")
    public String[] field1436;

    @ObfuscatedName("cr.n")
    public int field1437;

    @ObfuscatedName("cr.l")
    public int field1435;

    @ObfuscatedName("cr.s")
    public int field1439;

    @ObfuscatedName("cr.y")
    public int field1440;

    @ObfuscatedName("cr.c")
    public class210[] field1441;

    @ObfuscatedName("em.g(Liv;III)Lcr;")
    public static class97 method2993(class246 arg0, int arg1, int arg2) {
        int var3 = class251.method37(arg1, arg0);
        class97 var4 = (class97) field1438.method3706((long) (var3 << 16));
        class97 var5;
        if (var4 == null) {
            String var6 = String.valueOf(var3);
            int var7 = Statics.field533.method4306(var6);
            if (var7 == -1) {
                var5 = null;
            } else {
                label47: {
                    byte[] var8 = Statics.field533.method4274(var7);
                    if (var8 != null) {
                        if (var8.length <= 1) {
                            var5 = null;
                            break label47;
                        }
                        class97 var9 = method734(var8);
                        if (var9 != null) {
                            field1438.method3712(var9, (long) (var3 << 16));
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
        int var11 = (arg2 + 40000 << 8) + arg0.field2960;
        class97 var13 = (class97) field1438.method3706((long) (var11 << 16));
        class97 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var11);
            int var16 = Statics.field533.method4306(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = Statics.field533.method4274(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class97 var18 = method734(var17);
                    if (var18 != null) {
                        field1438.method3712(var18, (long) (var11 << 16));
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

    @ObfuscatedName("bq.e([BI)Lcr;")
    public static class97 method734(byte[] arg0) {
        class97 var1 = new class97();
        class195 var2 = new class195(arg0);
        var2.field2562 = var2.field2563.length - 2;
        int var3 = var2.method3310();
        int var4 = var2.field2563.length - 2 - var3 - 12;
        var2.field2562 = var4;
        int var5 = var2.method3472();
        var1.field1437 = var2.method3310();
        var1.field1435 = var2.method3310();
        var1.field1439 = var2.method3310();
        var1.field1440 = var2.method3310();
        int var6 = var2.method3332();
        if (var6 > 0) {
            var1.field1441 = var1.method1965(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3310();
                class210 var9 = new class210(var8 > 0 ? class200.method2426(var8) : 1);
                var1.field1441[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3472();
                    int var11 = var2.method3472();
                    var9.method3683(new class224(var11), (long) var10);
                }
            }
        }
        var2.field2562 = 0;
        var2.method3352();
        var1.field1434 = new int[var5];
        var1.field1433 = new int[var5];
        var1.field1436 = new String[var5];
        int var12 = 0;
        while (var2.field2562 < var4) {
            int var13 = var2.method3310();
            if (var13 == 3) {
                var1.field1436[var12] = var2.method3429();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1433[var12] = var2.method3332();
            } else {
                var1.field1433[var12] = var2.method3472();
            }
            var1.field1434[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cr.b(II)[Lhh;")
    public class210[] method1965(int arg0) {
        return new class210[arg0];
    }
}
