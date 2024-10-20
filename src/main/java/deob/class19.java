package deob;

@ObfuscatedName("r")
public class class19 extends class182 {

    @ObfuscatedName("r.i")
    public static class171 field540 = new class171(128);

    @ObfuscatedName("r.c")
    public int[] field534;

    @ObfuscatedName("r.h")
    public int[] field535;

    @ObfuscatedName("r.v")
    public String[] field536;

    @ObfuscatedName("r.q")
    public int field537;

    @ObfuscatedName("r.s")
    public int field547;

    @ObfuscatedName("r.g")
    public int field539;

    @ObfuscatedName("r.u")
    public int field542;

    @ObfuscatedName("b.i(II)Lr;")
    public static class19 method162(int arg0) {
        class19 var1 = (class19) field540.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2487.method2811(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1837 = var4.field1841.length - 12;
        int var5 = var4.method2156();
        var3.field537 = var4.method2313();
        var3.field547 = var4.method2313();
        var3.field539 = var4.method2313();
        var3.field542 = var4.method2313();
        var4.field1837 = 0;
        var4.method2158();
        var3.field534 = new int[var5];
        var3.field535 = new int[var5];
        var3.field536 = new String[var5];
        int var6 = 0;
        while (var4.field1837 < var4.field1841.length - 12) {
            int var7 = var4.method2313();
            if (var7 == 3) {
                var3.field536[var6] = var4.method2159();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field535[var6] = var4.method2151();
            } else {
                var3.field535[var6] = var4.method2156();
            }
            var3.field534[var6++] = var7;
        }
        field540.method3186(var3, (long) arg0);
        return var3;
    }
}
