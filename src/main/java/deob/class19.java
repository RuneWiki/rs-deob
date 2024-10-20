package deob;

@ObfuscatedName("z")
public class class19 extends class183 {

    @ObfuscatedName("z.g")
    public static class172 field537 = new class172(128);

    @ObfuscatedName("z.i")
    public int[] field527;

    @ObfuscatedName("z.k")
    public int[] field528;

    @ObfuscatedName("z.e")
    public String[] field536;

    @ObfuscatedName("z.w")
    public int field529;

    @ObfuscatedName("z.m")
    public int field531;

    @ObfuscatedName("z.u")
    public int field532;

    @ObfuscatedName("z.j")
    public int field530;

    @ObfuscatedName("cn.g(II)Lz;")
    public static class19 method1743(int arg0) {
        class19 var1 = (class19) field537.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field699.method2734(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1844 = var4.field1843.length - 12;
        int var5 = var4.method2112();
        var3.field529 = var4.method2094();
        var3.field531 = var4.method2094();
        var3.field532 = var4.method2094();
        var3.field530 = var4.method2094();
        var4.field1844 = 0;
        var4.method2279();
        var3.field527 = new int[var5];
        var3.field528 = new int[var5];
        var3.field536 = new String[var5];
        int var6 = 0;
        while (var4.field1844 < var4.field1843.length - 12) {
            int var7 = var4.method2094();
            if (var7 == 3) {
                var3.field536[var6] = var4.method2251();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field528[var6] = var4.method2092();
            } else {
                var3.field528[var6] = var4.method2112();
            }
            var3.field527[var6++] = var7;
        }
        field537.method3140(var3, (long) arg0);
        return var3;
    }
}
