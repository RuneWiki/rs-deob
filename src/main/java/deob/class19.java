package deob;

@ObfuscatedName("h")
public class class19 extends class181 {

    @ObfuscatedName("h.b")
    public static class171 field532 = new class171(128);

    @ObfuscatedName("h.u")
    public int[] field540;

    @ObfuscatedName("h.x")
    public int[] field531;

    @ObfuscatedName("h.j")
    public String[] field536;

    @ObfuscatedName("h.o")
    public int field537;

    @ObfuscatedName("h.n")
    public int field534;

    @ObfuscatedName("h.y")
    public int field535;

    @ObfuscatedName("h.f")
    public int field529;

    @ObfuscatedName("i.b(II)Lh;")
    public static class19 method480(int arg0) {
        class19 var1 = (class19) field532.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2655.method2692(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1845 = var4.field1844.length - 12;
        int var5 = var4.method2139();
        var3.field537 = var4.method2136();
        var3.field534 = var4.method2136();
        var3.field535 = var4.method2136();
        var3.field529 = var4.method2136();
        var4.field1845 = 0;
        var4.method2133();
        var3.field540 = new int[var5];
        var3.field531 = new int[var5];
        var3.field536 = new String[var5];
        int var6 = 0;
        while (var4.field1845 < var4.field1844.length - 12) {
            int var7 = var4.method2136();
            if (var7 == 3) {
                var3.field536[var6] = var4.method2339();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field531[var6] = var4.method2134();
            } else {
                var3.field531[var6] = var4.method2139();
            }
            var3.field540[var6++] = var7;
        }
        field532.method3116(var3, (long) arg0);
        return var3;
    }
}
