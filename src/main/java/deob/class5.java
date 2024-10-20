package deob;

@ObfuscatedName("y")
public class class5 extends class174 {

    @ObfuscatedName("y.p")
    public static class170 field73 = new class170(128);

    @ObfuscatedName("y.e")
    public int[] field61;

    @ObfuscatedName("y.a")
    public int[] field62;

    @ObfuscatedName("y.h")
    public String[] field69;

    @ObfuscatedName("y.y")
    public int field63;

    @ObfuscatedName("y.j")
    public int field65;

    @ObfuscatedName("y.l")
    public int field66;

    @ObfuscatedName("y.f")
    public int field67;

    @ObfuscatedName("b.p(IB)Ly;")
    public static class5 method234(int arg0) {
        class5 var1 = (class5) field73.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field761.method3048(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2029 = var4.field2033.length - 12;
        int var5 = var4.method2617();
        var3.field63 = var4.method2496();
        var3.field65 = var4.method2496();
        var3.field66 = var4.method2496();
        var3.field67 = var4.method2496();
        var4.field2029 = 0;
        var4.method2576();
        var3.field61 = new int[var5];
        var3.field62 = new int[var5];
        var3.field69 = new String[var5];
        int var6 = 0;
        while (var4.field2029 < var4.field2033.length - 12) {
            int var7 = var4.method2496();
            if (var7 == 3) {
                var3.field69[var6] = var4.method2502();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field62[var6] = var4.method2494();
            } else {
                var3.field62[var6] = var4.method2617();
            }
            var3.field61[var6++] = var7;
        }
        field73.method3268(var3, (long) arg0);
        return var3;
    }
}
