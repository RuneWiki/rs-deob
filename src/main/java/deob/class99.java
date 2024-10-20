package deob;

@ObfuscatedName("ck")
public class class99 extends class196 {

    @ObfuscatedName("ck.i")
    public static class191 field1547 = new class191(128);

    @ObfuscatedName("ck.j")
    public int[] field1539;

    @ObfuscatedName("ck.a")
    public int[] field1540;

    @ObfuscatedName("ck.r")
    public String[] field1541;

    @ObfuscatedName("ck.o")
    public int field1548;

    @ObfuscatedName("ck.n")
    public int field1546;

    @ObfuscatedName("ck.q")
    public int field1538;

    @ObfuscatedName("ck.b")
    public int field1545;

    @ObfuscatedName("ck.k")
    public class188[] field1543;

    @ObfuscatedName("et.i([BI)Lck;")
    public static class99 method2757(byte[] arg0) {
        class99 var1 = new class99();
        class175 var2 = new class175(arg0);
        var2.field2395 = var2.field2392.length - 2;
        int var3 = var2.method2995();
        int var4 = var2.field2392.length - 2 - var3 - 12;
        var2.field2395 = var4;
        int var5 = var2.method2998();
        var1.field1548 = var2.method2995();
        var1.field1546 = var2.method2995();
        var1.field1538 = var2.method2995();
        var1.field1545 = var2.method2995();
        int var6 = var2.method2999();
        if (var6 > 0) {
            var1.field1543 = var1.method1705(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method2995();
                class188 var9 = new class188(class179.method2906(var8));
                var1.field1543[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method2998();
                    int var11 = var2.method2998();
                    var9.method3319(new class200(var11), (long) var10);
                }
            }
        }
        var2.field2395 = 0;
        var2.method3021();
        var1.field1539 = new int[var5];
        var1.field1540 = new int[var5];
        var1.field1541 = new String[var5];
        int var12 = 0;
        while (var2.field2395 < var4) {
            int var13 = var2.method2995();
            if (var13 == 3) {
                var1.field1541[var12] = var2.method3002();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1540[var12] = var2.method2999();
            } else {
                var1.field1540[var12] = var2.method2998();
            }
            var1.field1539[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ck.j(II)[Lgi;")
    public class188[] method1705(int arg0) {
        return new class188[arg0];
    }
}
