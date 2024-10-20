package deob;

@ObfuscatedName("w")
public class class19 extends class183 {

    @ObfuscatedName("w.g")
    public static class172 field533 = new class172(128);

    @ObfuscatedName("w.s")
    public int[] field530;

    @ObfuscatedName("w.v")
    public int[] field532;

    @ObfuscatedName("w.o")
    public String[] field536;

    @ObfuscatedName("w.k")
    public int field534;

    @ObfuscatedName("w.m")
    public int field535;

    @ObfuscatedName("w.i")
    public int field541;

    @ObfuscatedName("w.t")
    public int field539;

    @ObfuscatedName("n.g(II)Lw;")
    public static class19 method151(int arg0) {
        class19 var1 = (class19) field533.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field59.method2703(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1851 = var4.field1854.length - 12;
        int var5 = var4.method2097();
        var3.field534 = var4.method2094();
        var3.field535 = var4.method2094();
        var3.field541 = var4.method2094();
        var3.field539 = var4.method2094();
        var4.field1851 = 0;
        var4.method2127();
        var3.field530 = new int[var5];
        var3.field532 = new int[var5];
        var3.field536 = new String[var5];
        int var6 = 0;
        while (var4.field1851 < var4.field1854.length - 12) {
            int var7 = var4.method2094();
            if (var7 == 3) {
                var3.field536[var6] = var4.method2100();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field532[var6] = var4.method2116();
            } else {
                var3.field532[var6] = var4.method2097();
            }
            var3.field530[var6++] = var7;
        }
        field533.method3115(var3, (long) arg0);
        return var3;
    }
}
