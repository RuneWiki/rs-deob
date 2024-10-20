package deob;

@ObfuscatedName("ce")
public class class98 extends class202 {

    @ObfuscatedName("ce.d")
    public static class197 field1442 = new class197(128);

    @ObfuscatedName("ce.x")
    public int[] field1448;

    @ObfuscatedName("ce.k")
    public int[] field1447;

    @ObfuscatedName("ce.z")
    public String[] field1444;

    @ObfuscatedName("ce.v")
    public int field1445;

    @ObfuscatedName("ce.m")
    public int field1443;

    @ObfuscatedName("ce.b")
    public int field1441;

    @ObfuscatedName("ce.t")
    public int field1446;

    @ObfuscatedName("ce.p")
    public class194[] field1449;

    @ObfuscatedName("n.d([BI)Lce;")
    public static class98 method72(byte[] arg0) {
        class98 var1 = new class98();
        class181 var2 = new class181(arg0);
        var2.field2498 = var2.field2496.length - 2;
        int var3 = var2.method3179();
        int var4 = var2.field2496.length - 2 - var3 - 12;
        var2.field2498 = var4;
        int var5 = var2.method3041();
        var1.field1445 = var2.method3179();
        var1.field1443 = var2.method3179();
        var1.field1441 = var2.method3179();
        var1.field1446 = var2.method3179();
        int var6 = var2.method3204();
        if (var6 > 0) {
            var1.field1449 = var1.method1755(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3179();
                class194 var9 = new class194(class185.method1795(var8));
                var1.field1449[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3041();
                    int var11 = var2.method3041();
                    var9.method3392(new class206(var11), (long) var10);
                }
            }
        }
        var2.field2498 = 0;
        var2.method3224();
        var1.field1448 = new int[var5];
        var1.field1447 = new int[var5];
        var1.field1444 = new String[var5];
        int var12 = 0;
        while (var2.field2498 < var4) {
            int var13 = var2.method3179();
            if (var13 == 3) {
                var1.field1444[var12] = var2.method3045();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1447[var12] = var2.method3204();
            } else {
                var1.field1447[var12] = var2.method3041();
            }
            var1.field1448[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ce.x(II)[Lgi;")
    public class194[] method1755(int arg0) {
        return new class194[arg0];
    }
}
