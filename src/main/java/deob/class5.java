package deob;

@ObfuscatedName("l")
public class class5 extends class174 {

    @ObfuscatedName("l.f")
    public static class170 field72 = new class170(128);

    @ObfuscatedName("l.t")
    public int[] field70;

    @ObfuscatedName("l.n")
    public int[] field68;

    @ObfuscatedName("l.e")
    public String[] field71;

    @ObfuscatedName("l.l")
    public int field67;

    @ObfuscatedName("l.d")
    public int field69;

    @ObfuscatedName("l.r")
    public int field73;

    @ObfuscatedName("l.k")
    public int field74;

    @ObfuscatedName("ac.f(IB)Ll;")
    public static class5 method733(int arg0) {
        class5 var1 = (class5) field72.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field198.method3035(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2033 = var4.field2030.length - 12;
        int var5 = var4.method2463();
        var3.field67 = var4.method2460();
        var3.field69 = var4.method2460();
        var3.field73 = var4.method2460();
        var3.field74 = var4.method2460();
        var4.field2033 = 0;
        var4.method2465();
        var3.field70 = new int[var5];
        var3.field68 = new int[var5];
        var3.field71 = new String[var5];
        int var6 = 0;
        while (var4.field2033 < var4.field2030.length - 12) {
            int var7 = var4.method2460();
            if (var7 == 3) {
                var3.field71[var6] = var4.method2636();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field68[var6] = var4.method2458();
            } else {
                var3.field68[var6] = var4.method2463();
            }
            var3.field70[var6++] = var7;
        }
        field72.method3275(var3, (long) arg0);
        return var3;
    }
}
