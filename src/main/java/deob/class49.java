package deob;

@ObfuscatedName("ak")
public class class49 extends class130 {

    @ObfuscatedName("ak.n")
    public static class125 field937 = new class125(128);

    @ObfuscatedName("ak.d")
    public int[] field940;

    @ObfuscatedName("ak.m")
    public int[] field935;

    @ObfuscatedName("ak.h")
    public String[] field936;

    @ObfuscatedName("ak.w")
    public int field933;

    @ObfuscatedName("ak.r")
    public int field941;

    @ObfuscatedName("ak.c")
    public int field939;

    @ObfuscatedName("ak.p")
    public int field938;

    @ObfuscatedName("fe.n(IB)Lak;")
    public static class49 method3076(int arg0) {
        class49 var1 = (class49) field937.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field276.method3093(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class161 var4 = new class161(var2);
        var4.field2285 = var4.field2291.length - 12;
        int var5 = var4.method2785();
        var3.field933 = var4.method2887();
        var3.field941 = var4.method2887();
        var3.field939 = var4.method2887();
        var3.field938 = var4.method2887();
        var4.field2285 = 0;
        var4.method2884();
        var3.field940 = new int[var5];
        var3.field935 = new int[var5];
        var3.field936 = new String[var5];
        int var6 = 0;
        while (var4.field2285 < var4.field2291.length - 12) {
            int var7 = var4.method2887();
            if (var7 == 3) {
                var3.field936[var6] = var4.method2847();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field935[var6] = var4.method2823();
            } else {
                var3.field935[var6] = var4.method2785();
            }
            var3.field940[var6++] = var7;
        }
        field937.method2219(var3, (long) arg0);
        return var3;
    }
}
