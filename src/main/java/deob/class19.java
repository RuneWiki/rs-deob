package deob;

@ObfuscatedName("c")
public class class19 extends class183 {

    @ObfuscatedName("c.g")
    public static class172 field525 = new class172(128);

    @ObfuscatedName("c.s")
    public int[] field513;

    @ObfuscatedName("c.h")
    public int[] field526;

    @ObfuscatedName("c.m")
    public String[] field515;

    @ObfuscatedName("c.u")
    public int field516;

    @ObfuscatedName("c.j")
    public int field517;

    @ObfuscatedName("c.b")
    public int field527;

    @ObfuscatedName("c.v")
    public int field519;

    @ObfuscatedName("r.g(II)Lc;")
    public static class19 method166(int arg0) {
        class19 var1 = (class19) field525.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1803.method2667(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1835 = var4.field1839.length - 12;
        int var5 = var4.method2286();
        var3.field516 = var4.method2166();
        var3.field517 = var4.method2166();
        var3.field527 = var4.method2166();
        var3.field519 = var4.method2166();
        var4.field1835 = 0;
        var4.method2145();
        var3.field513 = new int[var5];
        var3.field526 = new int[var5];
        var3.field515 = new String[var5];
        int var6 = 0;
        while (var4.field1835 < var4.field1839.length - 12) {
            int var7 = var4.method2166();
            if (var7 == 3) {
                var3.field515[var6] = var4.method2137();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field526[var6] = var4.method2101();
            } else {
                var3.field526[var6] = var4.method2286();
            }
            var3.field513[var6++] = var7;
        }
        field525.method3126(var3, (long) arg0);
        return var3;
    }
}
