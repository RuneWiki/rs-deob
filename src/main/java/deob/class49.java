package deob;

@ObfuscatedName("az")
public class class49 extends class130 {

    @ObfuscatedName("az.k")
    public static class125 field945 = new class125(128);

    @ObfuscatedName("az.y")
    public int[] field935;

    @ObfuscatedName("az.o")
    public int[] field936;

    @ObfuscatedName("az.r")
    public String[] field938;

    @ObfuscatedName("az.w")
    public int field943;

    @ObfuscatedName("az.j")
    public int field939;

    @ObfuscatedName("az.q")
    public int field940;

    @ObfuscatedName("az.d")
    public int field942;

    @ObfuscatedName("eg.k(II)Laz;")
    public static class49 method2436(int arg0) {
        class49 var1 = (class49) field945.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1764.method3065(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class161 var4 = new class161(var2);
        var4.field2267 = var4.field2258.length - 12;
        int var5 = var4.method2868();
        var3.field943 = var4.method2735();
        var3.field939 = var4.method2735();
        var3.field940 = var4.method2735();
        var3.field942 = var4.method2735();
        var4.field2267 = 0;
        var4.method2919();
        var3.field935 = new int[var5];
        var3.field936 = new int[var5];
        var3.field938 = new String[var5];
        int var6 = 0;
        while (var4.field2267 < var4.field2258.length - 12) {
            int var7 = var4.method2735();
            if (var7 == 3) {
                var3.field938[var6] = var4.method2740();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field936[var6] = var4.method2733();
            } else {
                var3.field936[var6] = var4.method2868();
            }
            var3.field935[var6++] = var7;
        }
        field945.method2164(var3, (long) arg0);
        return var3;
    }
}
