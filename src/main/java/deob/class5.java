package deob;

@ObfuscatedName("k")
public class class5 extends class174 {

    @ObfuscatedName("k.a")
    public static class170 field68 = new class170(128);

    @ObfuscatedName("k.r")
    public int[] field66;

    @ObfuscatedName("k.u")
    public int[] field65;

    @ObfuscatedName("k.t")
    public String[] field63;

    @ObfuscatedName("k.k")
    public int field64;

    @ObfuscatedName("k.x")
    public int field70;

    @ObfuscatedName("k.v")
    public int field67;

    @ObfuscatedName("k.g")
    public int field69;

    @ObfuscatedName("u.a(II)Lk;")
    public static class5 method27(int arg0) {
        class5 var1 = (class5) field68.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field739.method2943(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class126 var4 = new class126(var2);
        var4.field2016 = var4.field2015.length - 12;
        int var5 = var4.method2383();
        var3.field64 = var4.method2373();
        var3.field70 = var4.method2373();
        var3.field67 = var4.method2373();
        var3.field69 = var4.method2373();
        var4.field2016 = 0;
        var4.method2398();
        var3.field66 = new int[var5];
        var3.field65 = new int[var5];
        var3.field63 = new String[var5];
        int var6 = 0;
        while (var4.field2016 < var4.field2015.length - 12) {
            int var7 = var4.method2373();
            if (var7 == 3) {
                var3.field63[var6] = var4.method2386();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field65[var6] = var4.method2481();
            } else {
                var3.field65[var6] = var4.method2383();
            }
            var3.field66[var6++] = var7;
        }
        field68.method3210(var3, (long) arg0);
        return var3;
    }
}
