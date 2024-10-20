package deob;

@ObfuscatedName("v")
public class class5 extends class173 {

    @ObfuscatedName("v.p")
    public static class169 field80 = new class169(128);

    @ObfuscatedName("v.j")
    public int[] field76;

    @ObfuscatedName("v.w")
    public int[] field77;

    @ObfuscatedName("v.h")
    public String[] field78;

    @ObfuscatedName("v.v")
    public int field83;

    @ObfuscatedName("v.k")
    public int field79;

    @ObfuscatedName("v.g")
    public int field81;

    @ObfuscatedName("v.n")
    public int field75;

    @ObfuscatedName("ey.p(IS)Lv;")
    public static class5 method2899(int arg0) {
        class5 var1 = (class5) field80.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field166.method2973(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class126 var4 = new class126(var2);
        var4.field2043 = var4.field2047.length - 12;
        int var5 = var4.method2380();
        var3.field83 = var4.method2489();
        var3.field79 = var4.method2489();
        var3.field81 = var4.method2489();
        var3.field75 = var4.method2489();
        var4.field2043 = 0;
        var4.method2382();
        var3.field76 = new int[var5];
        var3.field77 = new int[var5];
        var3.field78 = new String[var5];
        int var6 = 0;
        while (var4.field2043 < var4.field2047.length - 12) {
            int var7 = var4.method2489();
            if (var7 == 3) {
                var3.field78[var6] = var4.method2383();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field77[var6] = var4.method2544();
            } else {
                var3.field77[var6] = var4.method2380();
            }
            var3.field76[var6++] = var7;
        }
        field80.method3223(var3, (long) arg0);
        return var3;
    }
}
