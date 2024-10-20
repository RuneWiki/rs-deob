package deob;

@ObfuscatedName("u")
public class class19 extends class185 {

    @ObfuscatedName("u.c")
    public static class174 field532 = new class174(128);

    @ObfuscatedName("u.j")
    public int[] field544;

    @ObfuscatedName("u.y")
    public int[] field530;

    @ObfuscatedName("u.r")
    public String[] field533;

    @ObfuscatedName("u.f")
    public int field534;

    @ObfuscatedName("u.l")
    public int field535;

    @ObfuscatedName("u.b")
    public int field536;

    @ObfuscatedName("u.k")
    public int field537;

    @ObfuscatedName("ao.c(II)Lu;")
    public static class19 method566(int arg0) {
        class19 var1 = (class19) field532.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1268.method2746(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class108 var4 = new class108(var2);
        var4.field1826 = var4.field1830.length - 12;
        int var5 = var4.method2144();
        var3.field534 = var4.method2136();
        var3.field535 = var4.method2136();
        var3.field536 = var4.method2136();
        var3.field537 = var4.method2136();
        var4.field1826 = 0;
        var4.method2141();
        var3.field544 = new int[var5];
        var3.field530 = new int[var5];
        var3.field533 = new String[var5];
        int var6 = 0;
        while (var4.field1826 < var4.field1830.length - 12) {
            int var7 = var4.method2136();
            if (var7 == 3) {
                var3.field533[var6] = var4.method2216();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field530[var6] = var4.method2134();
            } else {
                var3.field530[var6] = var4.method2144();
            }
            var3.field544[var6++] = var7;
        }
        field532.method3167(var3, (long) arg0);
        return var3;
    }
}
