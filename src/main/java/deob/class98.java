package deob;

@ObfuscatedName("cw")
public class class98 extends class202 {

    @ObfuscatedName("cw.m")
    public static class197 field1446 = new class197(128);

    @ObfuscatedName("cw.p")
    public int[] field1437;

    @ObfuscatedName("cw.i")
    public int[] field1438;

    @ObfuscatedName("cw.j")
    public String[] field1439;

    @ObfuscatedName("cw.v")
    public int field1442;

    @ObfuscatedName("cw.x")
    public int field1436;

    @ObfuscatedName("cw.e")
    public int field1441;

    @ObfuscatedName("cw.l")
    public int field1443;

    @ObfuscatedName("cw.b")
    public class194[] field1444;

    @ObfuscatedName("ex.m(Lhy;III)Lcw;")
    public static class98 method2756(class227 arg0, int arg1, int arg2) {
        int var3 = Statics.method1643(arg1, arg0);
        class98 var4 = method573(var3, arg0);
        if (var4 == null) {
            int var5 = (arg2 + 40000 << 8) + arg0.field2872;
            class98 var7 = method573(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("aw.p(ILhy;I)Lcw;")
    public static class98 method573(int arg0, class227 arg1) {
        class98 var2 = (class98) field1446.method3419((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field549.method3985(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field549.method4026(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class98 var6 = method2814(var5);
            if (var6 != null) {
                field1446.method3418(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("fs.i([BI)Lcw;")
    public static class98 method2814(byte[] arg0) {
        class98 var1 = new class98();
        class181 var2 = new class181(arg0);
        var2.field2498 = var2.field2499.length - 2;
        int var3 = var2.method3009();
        int var4 = var2.field2499.length - 2 - var3 - 12;
        var2.field2498 = var4;
        int var5 = var2.method3017();
        var1.field1442 = var2.method3009();
        var1.field1436 = var2.method3009();
        var1.field1441 = var2.method3009();
        var1.field1443 = var2.method3009();
        int var6 = var2.method3012();
        if (var6 > 0) {
            var1.field1444 = var1.method1754(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3009();
                class194 var9 = new class194(class185.method2904(var8));
                var1.field1444[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3017();
                    int var11 = var2.method3017();
                    var9.method3396(new class206(var11), (long) var10);
                }
            }
        }
        var2.field2498 = 0;
        var2.method3020();
        var1.field1437 = new int[var5];
        var1.field1438 = new int[var5];
        var1.field1439 = new String[var5];
        int var12 = 0;
        while (var2.field2498 < var4) {
            int var13 = var2.method3009();
            if (var13 == 3) {
                var1.field1439[var12] = var2.method3021();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1438[var12] = var2.method3012();
            } else {
                var1.field1438[var12] = var2.method3017();
            }
            var1.field1437[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cw.j(IB)[Lgd;")
    public class194[] method1754(int arg0) {
        return new class194[arg0];
    }
}
