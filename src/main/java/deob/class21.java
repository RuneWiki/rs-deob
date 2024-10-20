package deob;

@ObfuscatedName("z")
public class class21 extends class194 {

    @ObfuscatedName("z.q")
    public static class183 field551 = new class183(128);

    @ObfuscatedName("z.s")
    public int[] field550;

    @ObfuscatedName("z.h")
    public int[] field553;

    @ObfuscatedName("z.e")
    public String[] field552;

    @ObfuscatedName("z.n")
    public int field556;

    @ObfuscatedName("z.t")
    public int field554;

    @ObfuscatedName("z.l")
    public int field555;

    @ObfuscatedName("z.m")
    public int field559;

    @ObfuscatedName("cu.q(IB)Lz;")
    public static class21 method1869(int arg0) {
        class21 var1 = (class21) field551.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1875.method2811(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class21 var3 = new class21();
        class111 var4 = new class111(var2);
        var4.field1852 = var4.field1859.length - 12;
        int var5 = var4.method2153();
        var3.field556 = var4.method2307();
        var3.field554 = var4.method2307();
        var3.field555 = var4.method2307();
        var3.field559 = var4.method2307();
        var4.field1852 = 0;
        var4.method2155();
        var3.field550 = new int[var5];
        var3.field553 = new int[var5];
        var3.field552 = new String[var5];
        int var6 = 0;
        while (var4.field1852 < var4.field1859.length - 12) {
            int var7 = var4.method2307();
            if (var7 == 3) {
                var3.field552[var6] = var4.method2156();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field553[var6] = var4.method2231();
            } else {
                var3.field553[var6] = var4.method2153();
            }
            var3.field550[var6++] = var7;
        }
        field551.method3253(var3, (long) arg0);
        return var3;
    }
}
