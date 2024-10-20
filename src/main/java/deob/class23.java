package deob;

@ObfuscatedName("k")
public class class23 extends class205 {

    @ObfuscatedName("k.j")
    public static class194 field573 = new class194(128);

    @ObfuscatedName("k.h")
    public int[] field577;

    @ObfuscatedName("k.m")
    public int[] field572;

    @ObfuscatedName("k.z")
    public String[] field575;

    @ObfuscatedName("k.x")
    public int field579;

    @ObfuscatedName("k.e")
    public int field576;

    @ObfuscatedName("k.i")
    public int field578;

    @ObfuscatedName("k.c")
    public int field582;

    @ObfuscatedName("al.j(II)Lk;")
    public static class23 method995(int arg0) {
        class23 var1 = (class23) field573.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1777.method3011(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class120 var4 = new class120(var2);
        var4.field1972 = var4.field1974.length - 12;
        int var5 = var4.method2366();
        var3.field579 = var4.method2363();
        var3.field576 = var4.method2363();
        var3.field578 = var4.method2363();
        var3.field582 = var4.method2363();
        var4.field1972 = 0;
        var4.method2368();
        var3.field577 = new int[var5];
        var3.field572 = new int[var5];
        var3.field575 = new String[var5];
        int var6 = 0;
        while (var4.field1972 < var4.field1974.length - 12) {
            int var7 = var4.method2363();
            if (var7 == 3) {
                var3.field575[var6] = var4.method2369();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field572[var6] = var4.method2361();
            } else {
                var3.field572[var6] = var4.method2366();
            }
            var3.field577[var6++] = var7;
        }
        field573.method3462(var3, (long) arg0);
        return var3;
    }
}
