package deob;

@ObfuscatedName("aq")
public class class49 extends class130 {

    @ObfuscatedName("aq.p")
    public static class125 field953 = new class125(128);

    @ObfuscatedName("aq.g")
    public int[] field942;

    @ObfuscatedName("aq.x")
    public int[] field948;

    @ObfuscatedName("aq.q")
    public String[] field941;

    @ObfuscatedName("aq.d")
    public int field939;

    @ObfuscatedName("aq.k")
    public int field943;

    @ObfuscatedName("aq.j")
    public int field944;

    @ObfuscatedName("aq.s")
    public int field945;

    @ObfuscatedName("x.p(IB)Laq;")
    public static class49 method31(int arg0) {
        class49 var1 = (class49) field953.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field75.method3044(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2098 = var4.field2092.length - 12;
        int var5 = var4.method2598();
        var3.field939 = var4.method2595();
        var3.field943 = var4.method2595();
        var3.field944 = var4.method2595();
        var3.field945 = var4.method2595();
        var4.field2098 = 0;
        var4.method2600();
        var3.field942 = new int[var5];
        var3.field948 = new int[var5];
        var3.field941 = new String[var5];
        int var6 = 0;
        while (var4.field2098 < var4.field2092.length - 12) {
            int var7 = var4.method2595();
            if (var7 == 3) {
                var3.field941[var6] = var4.method2625();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field948[var6] = var4.method2593();
            } else {
                var3.field948[var6] = var4.method2598();
            }
            var3.field942[var6++] = var7;
        }
        field953.method2174(var3, (long) arg0);
        return var3;
    }
}
