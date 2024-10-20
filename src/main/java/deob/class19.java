package deob;

@ObfuscatedName("d")
public class class19 extends class185 {

    @ObfuscatedName("d.f")
    public static class174 field535 = new class174(128);

    @ObfuscatedName("d.k")
    public int[] field526;

    @ObfuscatedName("d.y")
    public int[] field529;

    @ObfuscatedName("d.e")
    public String[] field530;

    @ObfuscatedName("d.r")
    public int field533;

    @ObfuscatedName("d.a")
    public int field531;

    @ObfuscatedName("d.n")
    public int field532;

    @ObfuscatedName("d.x")
    public int field527;

    @ObfuscatedName("dl.f(IB)Ld;")
    public static class19 method2520(int arg0) {
        class19 var1 = (class19) field535.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1923.method2763(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class108 var4 = new class108(var2);
        var4.field1859 = var4.field1854.length - 12;
        int var5 = var4.method2256();
        var3.field533 = var4.method2160();
        var3.field531 = var4.method2160();
        var3.field532 = var4.method2160();
        var3.field527 = var4.method2160();
        var4.field1859 = 0;
        var4.method2165();
        var3.field526 = new int[var5];
        var3.field529 = new int[var5];
        var3.field530 = new String[var5];
        int var6 = 0;
        while (var4.field1859 < var4.field1854.length - 12) {
            int var7 = var4.method2160();
            if (var7 == 3) {
                var3.field530[var6] = var4.method2275();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field529[var6] = var4.method2158();
            } else {
                var3.field529[var6] = var4.method2256();
            }
            var3.field526[var6++] = var7;
        }
        field535.method3209(var3, (long) arg0);
        return var3;
    }
}
