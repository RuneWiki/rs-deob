package deob;

@ObfuscatedName("r")
public class class19 extends class185 {

    @ObfuscatedName("r.g")
    public static class174 field527 = new class174(128);

    @ObfuscatedName("r.j")
    public int[] field534;

    @ObfuscatedName("r.z")
    public int[] field525;

    @ObfuscatedName("r.b")
    public String[] field528;

    @ObfuscatedName("r.k")
    public int field531;

    @ObfuscatedName("r.c")
    public int field530;

    @ObfuscatedName("r.w")
    public int field536;

    @ObfuscatedName("r.l")
    public int field532;

    @ObfuscatedName("u.g(II)Lr;")
    public static class19 method160(int arg0) {
        class19 var1 = (class19) field527.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1348.method2660(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class108 var4 = new class108(var2);
        var4.field1824 = var4.field1828.length - 12;
        int var5 = var4.method2117();
        var3.field531 = var4.method2263();
        var3.field530 = var4.method2263();
        var3.field536 = var4.method2263();
        var3.field532 = var4.method2263();
        var4.field1824 = 0;
        var4.method2231();
        var3.field534 = new int[var5];
        var3.field525 = new int[var5];
        var3.field528 = new String[var5];
        int var6 = 0;
        while (var4.field1824 < var4.field1828.length - 12) {
            int var7 = var4.method2263();
            if (var7 == 3) {
                var3.field528[var6] = var4.method2091();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field525[var6] = var4.method2083();
            } else {
                var3.field525[var6] = var4.method2117();
            }
            var3.field534[var6++] = var7;
        }
        field527.method3099(var3, (long) arg0);
        return var3;
    }
}
