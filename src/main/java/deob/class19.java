package deob;

@ObfuscatedName("d")
public class class19 extends class182 {

    @ObfuscatedName("d.e")
    public static class171 field539 = new class171(128);

    @ObfuscatedName("d.v")
    public int[] field536;

    @ObfuscatedName("d.i")
    public int[] field537;

    @ObfuscatedName("d.g")
    public String[] field549;

    @ObfuscatedName("d.x")
    public int field545;

    @ObfuscatedName("d.b")
    public int field540;

    @ObfuscatedName("d.q")
    public int field541;

    @ObfuscatedName("d.l")
    public int field542;

    @ObfuscatedName("dk.e(IS)Ld;")
    public static class19 method2314(int arg0) {
        class19 var1 = (class19) field539.method3136((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field529.method2695(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1844 = var4.field1849.length - 12;
        int var5 = var4.method2121();
        var3.field545 = var4.method2152();
        var3.field540 = var4.method2152();
        var3.field541 = var4.method2152();
        var3.field542 = var4.method2152();
        var4.field1844 = 0;
        var4.method2250();
        var3.field536 = new int[var5];
        var3.field537 = new int[var5];
        var3.field549 = new String[var5];
        int var6 = 0;
        while (var4.field1844 < var4.field1849.length - 12) {
            int var7 = var4.method2152();
            if (var7 == 3) {
                var3.field549[var6] = var4.method2124();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field537[var6] = var4.method2226();
            } else {
                var3.field537[var6] = var4.method2121();
            }
            var3.field536[var6++] = var7;
        }
        field539.method3127(var3, (long) arg0);
        return var3;
    }
}
