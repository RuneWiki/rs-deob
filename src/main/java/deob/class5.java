package deob;

@ObfuscatedName("n")
public class class5 extends class174 {

    @ObfuscatedName("n.y")
    public static class170 field69 = new class170(128);

    @ObfuscatedName("n.m")
    public int[] field58;

    @ObfuscatedName("n.d")
    public int[] field73;

    @ObfuscatedName("n.k")
    public String[] field60;

    @ObfuscatedName("n.n")
    public int field61;

    @ObfuscatedName("n.s")
    public int field62;

    @ObfuscatedName("n.x")
    public int field63;

    @ObfuscatedName("n.b")
    public int field64;

    @ObfuscatedName("p.y(II)Ln;")
    public static class5 method99(int arg0) {
        class5 var1 = (class5) field69.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field93.method2991(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2036 = var4.field2037.length - 12;
        int var5 = var4.method2628();
        var3.field61 = var4.method2460();
        var3.field62 = var4.method2460();
        var3.field63 = var4.method2460();
        var3.field64 = var4.method2460();
        var4.field2036 = 0;
        var4.method2514();
        var3.field58 = new int[var5];
        var3.field73 = new int[var5];
        var3.field60 = new String[var5];
        int var6 = 0;
        while (var4.field2036 < var4.field2037.length - 12) {
            int var7 = var4.method2460();
            if (var7 == 3) {
                var3.field60[var6] = var4.method2466();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field73[var6] = var4.method2534();
            } else {
                var3.field73[var6] = var4.method2628();
            }
            var3.field58[var6++] = var7;
        }
        field69.method3291(var3, (long) arg0);
        return var3;
    }
}
