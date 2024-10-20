package deob;

@ObfuscatedName("d")
public class class20 extends class194 {

    @ObfuscatedName("d.e")
    public static class183 field524 = new class183(128);

    @ObfuscatedName("d.a")
    public int[] field526;

    @ObfuscatedName("d.l")
    public int[] field520;

    @ObfuscatedName("d.c")
    public String[] field521;

    @ObfuscatedName("d.u")
    public int field522;

    @ObfuscatedName("d.w")
    public int field518;

    @ObfuscatedName("d.i")
    public int field523;

    @ObfuscatedName("d.r")
    public int field525;

    @ObfuscatedName("aq.e(II)Ld;")
    public static class20 method871(int arg0) {
        class20 var1 = (class20) field524.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field26.method2843(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1834 = var4.field1835.length - 12;
        int var5 = var4.method2378();
        var3.field522 = var4.method2178();
        var3.field518 = var4.method2178();
        var3.field523 = var4.method2178();
        var3.field525 = var4.method2178();
        var4.field1834 = 0;
        var4.method2284();
        var3.field526 = new int[var5];
        var3.field520 = new int[var5];
        var3.field521 = new String[var5];
        int var6 = 0;
        while (var4.field1834 < var4.field1835.length - 12) {
            int var7 = var4.method2178();
            if (var7 == 3) {
                var3.field521[var6] = var4.method2167();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field520[var6] = var4.method2176();
            } else {
                var3.field520[var6] = var4.method2378();
            }
            var3.field526[var6++] = var7;
        }
        field524.method3304(var3, (long) arg0);
        return var3;
    }
}
