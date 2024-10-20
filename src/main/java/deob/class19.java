package deob;

@ObfuscatedName("s")
public class class19 extends class182 {

    @ObfuscatedName("s.g")
    public static class171 field537 = new class171(128);

    @ObfuscatedName("s.v")
    public int[] field528;

    @ObfuscatedName("s.z")
    public int[] field529;

    @ObfuscatedName("s.h")
    public String[] field530;

    @ObfuscatedName("s.k")
    public int field540;

    @ObfuscatedName("s.l")
    public int field532;

    @ObfuscatedName("s.e")
    public int field527;

    @ObfuscatedName("s.j")
    public int field534;

    @ObfuscatedName("c.g(II)Ls;")
    public static class19 method509(int arg0) {
        class19 var1 = (class19) field537.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field215.method2708(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1839 = var4.field1840.length - 12;
        int var5 = var4.method2144();
        var3.field540 = var4.method2141();
        var3.field532 = var4.method2141();
        var3.field527 = var4.method2141();
        var3.field534 = var4.method2141();
        var4.field1839 = 0;
        var4.method2146();
        var3.field528 = new int[var5];
        var3.field529 = new int[var5];
        var3.field530 = new String[var5];
        int var6 = 0;
        while (var4.field1839 < var4.field1840.length - 12) {
            int var7 = var4.method2141();
            if (var7 == 3) {
                var3.field530[var6] = var4.method2147();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field529[var6] = var4.method2139();
            } else {
                var3.field529[var6] = var4.method2144();
            }
            var3.field528[var6++] = var7;
        }
        field537.method3167(var3, (long) arg0);
        return var3;
    }
}
