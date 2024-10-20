package deob;

@ObfuscatedName("i")
public class class19 extends class182 {

    @ObfuscatedName("i.k")
    public static class171 field535 = new class171(128);

    @ObfuscatedName("i.r")
    public int[] field530;

    @ObfuscatedName("i.y")
    public int[] field531;

    @ObfuscatedName("i.w")
    public String[] field529;

    @ObfuscatedName("i.m")
    public int field533;

    @ObfuscatedName("i.j")
    public int field532;

    @ObfuscatedName("i.g")
    public int field534;

    @ObfuscatedName("i.p")
    public int field536;

    @ObfuscatedName("c.k(II)Li;")
    public static class19 method488(int arg0) {
        class19 var1 = (class19) field535.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2101.method2749(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1863 = var4.field1865.length - 12;
        int var5 = var4.method2116();
        var3.field533 = var4.method2232();
        var3.field532 = var4.method2232();
        var3.field534 = var4.method2232();
        var3.field536 = var4.method2232();
        var4.field1863 = 0;
        var4.method2201();
        var3.field530 = new int[var5];
        var3.field531 = new int[var5];
        var3.field529 = new String[var5];
        int var6 = 0;
        while (var4.field1863 < var4.field1865.length - 12) {
            int var7 = var4.method2232();
            if (var7 == 3) {
                var3.field529[var6] = var4.method2119();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field531[var6] = var4.method2111();
            } else {
                var3.field531[var6] = var4.method2116();
            }
            var3.field530[var6++] = var7;
        }
        field535.method3137(var3, (long) arg0);
        return var3;
    }
}
