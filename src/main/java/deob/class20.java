package deob;

@ObfuscatedName("g")
public class class20 extends class195 {

    @ObfuscatedName("g.p")
    public static class184 field556 = new class184(128);

    @ObfuscatedName("g.k")
    public int[] field554;

    @ObfuscatedName("g.e")
    public int[] field555;

    @ObfuscatedName("g.f")
    public String[] field570;

    @ObfuscatedName("g.w")
    public int field553;

    @ObfuscatedName("g.t")
    public int field569;

    @ObfuscatedName("g.s")
    public int field559;

    @ObfuscatedName("g.c")
    public int field560;

    @ObfuscatedName("db.p(II)Lg;")
    public static class20 method2526(int arg0) {
        class20 var1 = (class20) field556.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field133.method2896(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1885 = var4.field1889.length - 12;
        int var5 = var4.method2350();
        var3.field553 = var4.method2177();
        var3.field569 = var4.method2177();
        var3.field559 = var4.method2177();
        var3.field560 = var4.method2177();
        var4.field1885 = 0;
        var4.method2182();
        var3.field554 = new int[var5];
        var3.field555 = new int[var5];
        var3.field570 = new String[var5];
        int var6 = 0;
        while (var4.field1885 < var4.field1889.length - 12) {
            int var7 = var4.method2177();
            if (var7 == 3) {
                var3.field570[var6] = var4.method2265();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field555[var6] = var4.method2314();
            } else {
                var3.field555[var6] = var4.method2350();
            }
            var3.field554[var6++] = var7;
        }
        field556.method3370(var3, (long) arg0);
        return var3;
    }
}
