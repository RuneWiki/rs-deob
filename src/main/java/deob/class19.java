package deob;

@ObfuscatedName("b")
public class class19 extends class187 {

    @ObfuscatedName("b.v")
    public static class176 field538 = new class176(128);

    @ObfuscatedName("b.t")
    public int[] field530;

    @ObfuscatedName("b.f")
    public int[] field531;

    @ObfuscatedName("b.j")
    public String[] field529;

    @ObfuscatedName("b.l")
    public int field533;

    @ObfuscatedName("b.g")
    public int field534;

    @ObfuscatedName("b.k")
    public int field535;

    @ObfuscatedName("b.p")
    public int field532;

    @ObfuscatedName("aj.v(IB)Lb;")
    public static class19 method608(int arg0) {
        class19 var1 = (class19) field538.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1281.method2852(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class110 var4 = new class110(var2);
        var4.field1847 = var4.field1853.length - 12;
        int var5 = var4.method2297();
        var3.field533 = var4.method2194();
        var3.field534 = var4.method2194();
        var3.field535 = var4.method2194();
        var3.field532 = var4.method2194();
        var4.field1847 = 0;
        var4.method2168();
        var3.field530 = new int[var5];
        var3.field531 = new int[var5];
        var3.field529 = new String[var5];
        int var6 = 0;
        while (var4.field1847 < var4.field1853.length - 12) {
            int var7 = var4.method2194();
            if (var7 == 3) {
                var3.field529[var6] = var4.method2159();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field531[var6] = var4.method2257();
            } else {
                var3.field531[var6] = var4.method2297();
            }
            var3.field530[var6++] = var7;
        }
        field538.method3228(var3, (long) arg0);
        return var3;
    }
}
