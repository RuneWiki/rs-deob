package deob;

@ObfuscatedName("t")
public class class19 extends class183 {

    @ObfuscatedName("t.p")
    public static class172 field532 = new class172(128);

    @ObfuscatedName("t.g")
    public int[] field529;

    @ObfuscatedName("t.x")
    public int[] field530;

    @ObfuscatedName("t.c")
    public String[] field531;

    @ObfuscatedName("t.n")
    public int field537;

    @ObfuscatedName("t.s")
    public int field535;

    @ObfuscatedName("t.r")
    public int field534;

    @ObfuscatedName("t.w")
    public int field533;

    @ObfuscatedName("t.p(II)Lt;")
    public static class19 method493(int arg0) {
        class19 var1 = (class19) field532.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1818.method2855(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1837 = var4.field1838.length - 12;
        int var5 = var4.method2305();
        var3.field537 = var4.method2175();
        var3.field535 = var4.method2175();
        var3.field534 = var4.method2175();
        var3.field533 = var4.method2175();
        var4.field1837 = 0;
        var4.method2180();
        var3.field529 = new int[var5];
        var3.field530 = new int[var5];
        var3.field531 = new String[var5];
        int var6 = 0;
        while (var4.field1837 < var4.field1838.length - 12) {
            int var7 = var4.method2175();
            if (var7 == 3) {
                var3.field531[var6] = var4.method2351();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field530[var6] = var4.method2173();
            } else {
                var3.field530[var6] = var4.method2305();
            }
            var3.field529[var6++] = var7;
        }
        field532.method3234(var3, (long) arg0);
        return var3;
    }
}
