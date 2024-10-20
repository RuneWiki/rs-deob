package deob;

@ObfuscatedName("a")
public class class20 extends class195 {

    @ObfuscatedName("a.n")
    public static class184 field553 = new class184(128);

    @ObfuscatedName("a.w")
    public int[] field551;

    @ObfuscatedName("a.i")
    public int[] field552;

    @ObfuscatedName("a.e")
    public String[] field561;

    @ObfuscatedName("a.h")
    public int field558;

    @ObfuscatedName("a.q")
    public int field555;

    @ObfuscatedName("a.l")
    public int field550;

    @ObfuscatedName("a.c")
    public int field557;

    @ObfuscatedName("u.n(IB)La;")
    public static class20 method153(int arg0) {
        class20 var1 = (class20) field553.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field194.method2859(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1888 = var4.field1886.length - 12;
        int var5 = var4.method2160();
        var3.field558 = var4.method2157();
        var3.field555 = var4.method2157();
        var3.field550 = var4.method2157();
        var3.field557 = var4.method2157();
        var4.field1888 = 0;
        var4.method2291();
        var3.field551 = new int[var5];
        var3.field552 = new int[var5];
        var3.field561 = new String[var5];
        int var6 = 0;
        while (var4.field1888 < var4.field1886.length - 12) {
            int var7 = var4.method2157();
            if (var7 == 3) {
                var3.field561[var6] = var4.method2163();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field552[var6] = var4.method2155();
            } else {
                var3.field552[var6] = var4.method2160();
            }
            var3.field551[var6++] = var7;
        }
        field553.method3317(var3, (long) arg0);
        return var3;
    }
}
