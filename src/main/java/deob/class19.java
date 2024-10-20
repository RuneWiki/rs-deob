package deob;

@ObfuscatedName("s")
public class class19 extends class181 {

    @ObfuscatedName("s.j")
    public static class171 field545 = new class171(128);

    @ObfuscatedName("s.z")
    public int[] field538;

    @ObfuscatedName("s.y")
    public int[] field549;

    @ObfuscatedName("s.h")
    public String[] field540;

    @ObfuscatedName("s.r")
    public int field541;

    @ObfuscatedName("s.e")
    public int field544;

    @ObfuscatedName("s.k")
    public int field543;

    @ObfuscatedName("s.b")
    public int field548;

    @ObfuscatedName("dd.j(IB)Ls;")
    public static class19 method2418(int arg0) {
        class19 var1 = (class19) field545.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2051.method2739(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1847 = var4.field1849.length - 12;
        int var5 = var4.method2135();
        var3.field541 = var4.method2132();
        var3.field544 = var4.method2132();
        var3.field543 = var4.method2132();
        var3.field548 = var4.method2132();
        var4.field1847 = 0;
        var4.method2137();
        var3.field538 = new int[var5];
        var3.field549 = new int[var5];
        var3.field540 = new String[var5];
        int var6 = 0;
        while (var4.field1847 < var4.field1849.length - 12) {
            int var7 = var4.method2132();
            if (var7 == 3) {
                var3.field540[var6] = var4.method2138();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field549[var6] = var4.method2130();
            } else {
                var3.field549[var6] = var4.method2135();
            }
            var3.field538[var6++] = var7;
        }
        field545.method3173(var3, (long) arg0);
        return var3;
    }
}
