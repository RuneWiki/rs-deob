package deob;

@ObfuscatedName("i")
public class class19 extends class185 {

    @ObfuscatedName("i.l")
    public static class174 field524 = new class174(128);

    @ObfuscatedName("i.y")
    public int[] field517;

    @ObfuscatedName("i.g")
    public int[] field518;

    @ObfuscatedName("i.j")
    public String[] field519;

    @ObfuscatedName("i.w")
    public int field520;

    @ObfuscatedName("i.c")
    public int field523;

    @ObfuscatedName("i.x")
    public int field522;

    @ObfuscatedName("i.f")
    public int field527;

    @ObfuscatedName("cz.l(II)Li;")
    public static class19 method1997(int arg0) {
        class19 var1 = (class19) field524.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1553.method2752(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class108 var4 = new class108(var2);
        var4.field1823 = var4.field1828.length - 12;
        int var5 = var4.method2297();
        var3.field520 = var4.method2163();
        var3.field523 = var4.method2163();
        var3.field522 = var4.method2163();
        var3.field527 = var4.method2163();
        var4.field1823 = 0;
        var4.method2167();
        var3.field517 = new int[var5];
        var3.field518 = new int[var5];
        var3.field519 = new String[var5];
        int var6 = 0;
        while (var4.field1823 < var4.field1828.length - 12) {
            int var7 = var4.method2163();
            if (var7 == 3) {
                var3.field519[var6] = var4.method2168();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field518[var6] = var4.method2291();
            } else {
                var3.field518[var6] = var4.method2297();
            }
            var3.field517[var6++] = var7;
        }
        field524.method3211(var3, (long) arg0);
        return var3;
    }
}
