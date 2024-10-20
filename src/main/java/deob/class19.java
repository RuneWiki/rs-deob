package deob;

@ObfuscatedName("p")
public class class19 extends class182 {

    @ObfuscatedName("p.e")
    public static class171 field543 = new class171(128);

    @ObfuscatedName("p.o")
    public int[] field544;

    @ObfuscatedName("p.y")
    public int[] field540;

    @ObfuscatedName("p.b")
    public String[] field541;

    @ObfuscatedName("p.w")
    public int field542;

    @ObfuscatedName("p.r")
    public int field549;

    @ObfuscatedName("p.l")
    public int field548;

    @ObfuscatedName("p.s")
    public int field538;

    @ObfuscatedName("av.e(IB)Lp;")
    public static class19 method654(int arg0) {
        class19 var1 = (class19) field543.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2654.method2709(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1841 = var4.field1840.length - 12;
        int var5 = var4.method2207();
        var3.field542 = var4.method2232();
        var3.field549 = var4.method2232();
        var3.field548 = var4.method2232();
        var3.field538 = var4.method2232();
        var4.field1841 = 0;
        var4.method2072();
        var3.field544 = new int[var5];
        var3.field540 = new int[var5];
        var3.field541 = new String[var5];
        int var6 = 0;
        while (var4.field1841 < var4.field1840.length - 12) {
            int var7 = var4.method2232();
            if (var7 == 3) {
                var3.field541[var6] = var4.method2073();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field540[var6] = var4.method2123();
            } else {
                var3.field540[var6] = var4.method2207();
            }
            var3.field544[var6++] = var7;
        }
        field543.method3057(var3, (long) arg0);
        return var3;
    }
}
