package deob;

@ObfuscatedName("m")
public class class5 extends class174 {

    @ObfuscatedName("m.q")
    public static class170 field74 = new class170(128);

    @ObfuscatedName("m.c")
    public int[] field67;

    @ObfuscatedName("m.p")
    public int[] field64;

    @ObfuscatedName("m.z")
    public String[] field65;

    @ObfuscatedName("m.m")
    public int field63;

    @ObfuscatedName("m.k")
    public int field78;

    @ObfuscatedName("m.v")
    public int field73;

    @ObfuscatedName("m.y")
    public int field69;

    @ObfuscatedName("ae.q(II)Lm;")
    public static class5 method636(int arg0) {
        class5 var1 = (class5) field74.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field135.method2952(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2039 = var4.field2042.length - 12;
        int var5 = var4.method2430();
        var3.field63 = var4.method2427();
        var3.field78 = var4.method2427();
        var3.field73 = var4.method2427();
        var3.field69 = var4.method2427();
        var4.field2039 = 0;
        var4.method2432();
        var3.field67 = new int[var5];
        var3.field64 = new int[var5];
        var3.field65 = new String[var5];
        int var6 = 0;
        while (var4.field2039 < var4.field2042.length - 12) {
            int var7 = var4.method2427();
            if (var7 == 3) {
                var3.field65[var6] = var4.method2460();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field64[var6] = var4.method2534();
            } else {
                var3.field64[var6] = var4.method2430();
            }
            var3.field67[var6++] = var7;
        }
        field74.method3225(var3, (long) arg0);
        return var3;
    }
}
