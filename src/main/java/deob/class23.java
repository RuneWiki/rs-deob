package deob;

@ObfuscatedName("a")
public class class23 extends class204 {

    @ObfuscatedName("a.i")
    public static class193 field593 = new class193(128);

    @ObfuscatedName("a.v")
    public int[] field592;

    @ObfuscatedName("a.r")
    public int[] field588;

    @ObfuscatedName("a.n")
    public String[] field589;

    @ObfuscatedName("a.x")
    public int field590;

    @ObfuscatedName("a.q")
    public int field591;

    @ObfuscatedName("a.h")
    public int field594;

    @ObfuscatedName("a.d")
    public int field596;

    @ObfuscatedName("ds.i(II)La;")
    public static class23 method2297(int arg0) {
        class23 var1 = (class23) field593.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2049.method3035(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1980 = var4.field1982.length - 12;
        int var5 = var4.method2350();
        var3.field590 = var4.method2347();
        var3.field591 = var4.method2347();
        var3.field594 = var4.method2347();
        var3.field596 = var4.method2347();
        var4.field1980 = 0;
        var4.method2411();
        var3.field592 = new int[var5];
        var3.field588 = new int[var5];
        var3.field589 = new String[var5];
        int var6 = 0;
        while (var4.field1980 < var4.field1982.length - 12) {
            int var7 = var4.method2347();
            if (var7 == 3) {
                var3.field589[var6] = var4.method2356();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field588[var6] = var4.method2380();
            } else {
                var3.field588[var6] = var4.method2350();
            }
            var3.field592[var6++] = var7;
        }
        field593.method3466(var3, (long) arg0);
        return var3;
    }
}
