package deob;

@ObfuscatedName("m")
public class class20 extends class195 {

    @ObfuscatedName("m.y")
    public static class184 field565 = new class184(128);

    @ObfuscatedName("m.k")
    public int[] field572;

    @ObfuscatedName("m.g")
    public int[] field564;

    @ObfuscatedName("m.n")
    public String[] field575;

    @ObfuscatedName("m.t")
    public int field566;

    @ObfuscatedName("m.e")
    public int field567;

    @ObfuscatedName("m.q")
    public int field568;

    @ObfuscatedName("m.z")
    public int field569;

    @ObfuscatedName("x.y(II)Lm;")
    public static class20 method490(int arg0) {
        class20 var1 = (class20) field565.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1847.method2874(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1902 = var4.field1897.length - 12;
        int var5 = var4.method2165();
        var3.field566 = var4.method2339();
        var3.field567 = var4.method2339();
        var3.field568 = var4.method2339();
        var3.field569 = var4.method2339();
        var4.field1902 = 0;
        var4.method2243();
        var3.field572 = new int[var5];
        var3.field564 = new int[var5];
        var3.field575 = new String[var5];
        int var6 = 0;
        while (var4.field1902 < var4.field1897.length - 12) {
            int var7 = var4.method2339();
            if (var7 == 3) {
                var3.field575[var6] = var4.method2170();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field564[var6] = var4.method2205();
            } else {
                var3.field564[var6] = var4.method2165();
            }
            var3.field572[var6++] = var7;
        }
        field565.method3340(var3, (long) arg0);
        return var3;
    }
}
