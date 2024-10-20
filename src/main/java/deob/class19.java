package deob;

@ObfuscatedName("i")
public class class19 extends class185 {

    @ObfuscatedName("i.e")
    public static class174 field525 = new class174(128);

    @ObfuscatedName("i.v")
    public int[] field534;

    @ObfuscatedName("i.k")
    public int[] field526;

    @ObfuscatedName("i.g")
    public String[] field535;

    @ObfuscatedName("i.q")
    public int field528;

    @ObfuscatedName("i.l")
    public int field529;

    @ObfuscatedName("i.a")
    public int field530;

    @ObfuscatedName("i.b")
    public int field531;

    @ObfuscatedName("client.e(IB)Li;")
    public static class19 method402(int arg0) {
        class19 var1 = (class19) field525.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field235.method2721(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class108 var4 = new class108(var2);
        var4.field1841 = var4.field1842.length - 12;
        int var5 = var4.method2127();
        var3.field528 = var4.method2124();
        var3.field529 = var4.method2124();
        var3.field530 = var4.method2124();
        var3.field531 = var4.method2124();
        var4.field1841 = 0;
        var4.method2129();
        var3.field534 = new int[var5];
        var3.field526 = new int[var5];
        var3.field535 = new String[var5];
        int var6 = 0;
        while (var4.field1841 < var4.field1842.length - 12) {
            int var7 = var4.method2124();
            if (var7 == 3) {
                var3.field535[var6] = var4.method2130();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field526[var6] = var4.method2122();
            } else {
                var3.field526[var6] = var4.method2127();
            }
            var3.field534[var6++] = var7;
        }
        field525.method3156(var3, (long) arg0);
        return var3;
    }
}
