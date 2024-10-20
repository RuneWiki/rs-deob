package deob;

@ObfuscatedName("i")
public class class23 extends class205 {

    @ObfuscatedName("i.f")
    public static class194 field601 = new class194(128);

    @ObfuscatedName("i.u")
    public int[] field593;

    @ObfuscatedName("i.x")
    public int[] field594;

    @ObfuscatedName("i.b")
    public String[] field602;

    @ObfuscatedName("i.l")
    public int field592;

    @ObfuscatedName("i.d")
    public int field597;

    @ObfuscatedName("i.n")
    public int field598;

    @ObfuscatedName("i.m")
    public int field599;

    @ObfuscatedName("ff.f(II)Li;")
    public static class23 method3192(int arg0) {
        class23 var1 = (class23) field601.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field256.method3061(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class120 var4 = new class120(var2);
        var4.field1999 = var4.field2001.length - 12;
        int var5 = var4.method2527();
        var3.field592 = var4.method2387();
        var3.field597 = var4.method2387();
        var3.field598 = var4.method2387();
        var3.field599 = var4.method2387();
        var4.field1999 = 0;
        var4.method2392();
        var3.field593 = new int[var5];
        var3.field594 = new int[var5];
        var3.field602 = new String[var5];
        int var6 = 0;
        while (var4.field1999 < var4.field2001.length - 12) {
            int var7 = var4.method2387();
            if (var7 == 3) {
                var3.field602[var6] = var4.method2499();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field594[var6] = var4.method2385();
            } else {
                var3.field594[var6] = var4.method2527();
            }
            var3.field593[var6++] = var7;
        }
        field601.method3521(var3, (long) arg0);
        return var3;
    }
}
