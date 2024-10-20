package deob;

@ObfuscatedName("q")
public class class23 extends class204 {

    @ObfuscatedName("q.a")
    public static class193 field605 = new class193(128);

    @ObfuscatedName("q.r")
    public int[] field597;

    @ObfuscatedName("q.f")
    public int[] field598;

    @ObfuscatedName("q.s")
    public String[] field599;

    @ObfuscatedName("q.y")
    public int field600;

    @ObfuscatedName("q.e")
    public int field601;

    @ObfuscatedName("q.g")
    public int field602;

    @ObfuscatedName("q.m")
    public int field596;

    @ObfuscatedName("aa.a(II)Lq;")
    public static class23 method798(int arg0) {
        class23 var1 = (class23) field605.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field624.method3025(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1980 = var4.field1981.length - 12;
        int var5 = var4.method2350();
        var3.field600 = var4.method2347();
        var3.field601 = var4.method2347();
        var3.field602 = var4.method2347();
        var3.field596 = var4.method2347();
        var4.field1980 = 0;
        var4.method2352();
        var3.field597 = new int[var5];
        var3.field598 = new int[var5];
        var3.field599 = new String[var5];
        int var6 = 0;
        while (var4.field1980 < var4.field1981.length - 12) {
            int var7 = var4.method2347();
            if (var7 == 3) {
                var3.field599[var6] = var4.method2353();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field598[var6] = var4.method2412();
            } else {
                var3.field598[var6] = var4.method2350();
            }
            var3.field597[var6++] = var7;
        }
        field605.method3509(var3, (long) arg0);
        return var3;
    }
}
