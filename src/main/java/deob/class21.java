package deob;

@ObfuscatedName("p")
public class class21 extends class198 {

    @ObfuscatedName("p.j")
    public static class187 field594 = new class187(128);

    @ObfuscatedName("p.y")
    public int[] field588;

    @ObfuscatedName("p.z")
    public int[] field598;

    @ObfuscatedName("p.l")
    public String[] field591;

    @ObfuscatedName("p.w")
    public int field592;

    @ObfuscatedName("p.d")
    public int field596;

    @ObfuscatedName("p.f")
    public int field590;

    @ObfuscatedName("p.i")
    public int field595;

    @ObfuscatedName("de.j(II)Lp;")
    public static class21 method2340(int arg0) {
        class21 var1 = (class21) field594.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2193.method2995(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class21 var3 = new class21();
        class114 var4 = new class114(var2);
        var4.field1894 = var4.field1891.length - 12;
        int var5 = var4.method2327();
        var3.field592 = var4.method2324();
        var3.field596 = var4.method2324();
        var3.field590 = var4.method2324();
        var3.field595 = var4.method2324();
        var4.field1894 = 0;
        var4.method2329();
        var3.field588 = new int[var5];
        var3.field598 = new int[var5];
        var3.field591 = new String[var5];
        int var6 = 0;
        while (var4.field1894 < var4.field1891.length - 12) {
            int var7 = var4.method2324();
            if (var7 == 3) {
                var3.field591[var6] = var4.method2440();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field598[var6] = var4.method2322();
            } else {
                var3.field598[var6] = var4.method2327();
            }
            var3.field588[var6++] = var7;
        }
        field594.method3434(var3, (long) arg0);
        return var3;
    }
}
