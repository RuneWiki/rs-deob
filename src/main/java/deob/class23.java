package deob;

@ObfuscatedName("c")
public class class23 extends class204 {

    @ObfuscatedName("c.n")
    public static class193 field570 = new class193(128);

    @ObfuscatedName("c.d")
    public int[] field571;

    @ObfuscatedName("c.s")
    public int[] field572;

    @ObfuscatedName("c.q")
    public String[] field578;

    @ObfuscatedName("c.j")
    public int field574;

    @ObfuscatedName("c.k")
    public int field575;

    @ObfuscatedName("c.i")
    public int field577;

    @ObfuscatedName("c.m")
    public int field573;

    @ObfuscatedName("ct.n(II)Lc;")
    public static class23 method1997(int arg0) {
        class23 var1 = (class23) field570.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field948.method3010(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1977 = var4.field1981.length - 12;
        int var5 = var4.method2343();
        var3.field574 = var4.method2377();
        var3.field575 = var4.method2377();
        var3.field577 = var4.method2377();
        var3.field573 = var4.method2377();
        var4.field1977 = 0;
        var4.method2345();
        var3.field571 = new int[var5];
        var3.field572 = new int[var5];
        var3.field578 = new String[var5];
        int var6 = 0;
        while (var4.field1977 < var4.field1981.length - 12) {
            int var7 = var4.method2377();
            if (var7 == 3) {
                var3.field578[var6] = var4.method2492();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field572[var6] = var4.method2338();
            } else {
                var3.field572[var6] = var4.method2343();
            }
            var3.field571[var6++] = var7;
        }
        field570.method3481(var3, (long) arg0);
        return var3;
    }
}
