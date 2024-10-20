package deob;

@ObfuscatedName("av")
public class class49 extends class130 {

    @ObfuscatedName("av.b")
    public static class125 field935 = new class125(128);

    @ObfuscatedName("av.l")
    public int[] field940;

    @ObfuscatedName("av.i")
    public int[] field931;

    @ObfuscatedName("av.t")
    public String[] field933;

    @ObfuscatedName("av.k")
    public int field934;

    @ObfuscatedName("av.h")
    public int field932;

    @ObfuscatedName("av.n")
    public int field936;

    @ObfuscatedName("av.f")
    public int field937;

    @ObfuscatedName("s.b(IB)Lav;")
    public static class49 method184(int arg0) {
        class49 var1 = (class49) field935.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2005.method3226(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2085 = var4.field2083.length - 12;
        int var5 = var4.method2683();
        var3.field934 = var4.method2801();
        var3.field932 = var4.method2801();
        var3.field936 = var4.method2801();
        var3.field937 = var4.method2801();
        var4.field2085 = 0;
        var4.method2685();
        var3.field940 = new int[var5];
        var3.field931 = new int[var5];
        var3.field933 = new String[var5];
        int var6 = 0;
        while (var4.field2085 < var4.field2083.length - 12) {
            int var7 = var4.method2801();
            if (var7 == 3) {
                var3.field933[var6] = var4.method2686();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field931[var6] = var4.method2678();
            } else {
                var3.field931[var6] = var4.method2683();
            }
            var3.field940[var6++] = var7;
        }
        field935.method2258(var3, (long) arg0);
        return var3;
    }
}
