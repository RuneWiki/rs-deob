package deob;

@ObfuscatedName("cx")
public class class98 extends class202 {

    @ObfuscatedName("cx.b")
    public static class197 field1437 = new class197(128);

    @ObfuscatedName("cx.s")
    public int[] field1432;

    @ObfuscatedName("cx.r")
    public int[] field1435;

    @ObfuscatedName("cx.g")
    public String[] field1439;

    @ObfuscatedName("cx.x")
    public int field1434;

    @ObfuscatedName("cx.f")
    public int field1436;

    @ObfuscatedName("cx.u")
    public int field1433;

    @ObfuscatedName("cx.t")
    public int field1438;

    @ObfuscatedName("cx.k")
    public class194[] field1440;

    @ObfuscatedName("eg.b(Lhf;III)Lcx;")
    public static class98 method2721(class227 arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0.field2861;
        class98 var5 = method1381(var3, arg0);
        if (var5 == null) {
            int var6 = class232.method1616(arg2, arg0);
            class98 var7 = method1381(var6, arg0);
            return var7 == null ? null : var7;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("bj.s(ILhf;B)Lcx;")
    public static class98 method1381(int arg0, class227 arg1) {
        class98 var2 = (class98) field1437.method3330((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field393.method3832(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field393.method3823(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class98 var6 = method1686(var5);
            if (var6 != null) {
                field1437.method3332(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("cm.r([BI)Lcx;")
    public static class98 method1686(byte[] arg0) {
        class98 var1 = new class98();
        class181 var2 = new class181(arg0);
        var2.field2488 = var2.field2495.length - 2;
        int var3 = var2.method3081();
        int var4 = var2.field2495.length - 2 - var3 - 12;
        var2.field2488 = var4;
        int var5 = var2.method2996();
        var1.field1434 = var2.method3081();
        var1.field1436 = var2.method3081();
        var1.field1433 = var2.method3081();
        var1.field1438 = var2.method3081();
        int var6 = var2.method2945();
        if (var6 > 0) {
            var1.field1440 = var1.method1688(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3081();
                class194 var9 = new class194(class185.method159(var8));
                var1.field1440[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2996();
                    int var11 = var2.method2996();
                    var9.method3301(new class206(var11), (long) var10);
                }
            }
        }
        var2.field2488 = 0;
        var2.method3003();
        var1.field1432 = new int[var5];
        var1.field1435 = new int[var5];
        var1.field1439 = new String[var5];
        int var12 = 0;
        while (var2.field2488 < var4) {
            int var13 = var2.method3081();
            if (var13 == 3) {
                var1.field1439[var12] = var2.method2953();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1435[var12] = var2.method2945();
            } else {
                var1.field1435[var12] = var2.method2996();
            }
            var1.field1432[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cx.g(II)[Lgu;")
    public class194[] method1688(int arg0) {
        return new class194[arg0];
    }
}
