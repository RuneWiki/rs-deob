package deob;

@ObfuscatedName("ak")
public class class49 extends class130 {

    @ObfuscatedName("ak.s")
    public static class125 field939 = new class125(128);

    @ObfuscatedName("ak.c")
    public int[] field937;

    @ObfuscatedName("ak.f")
    public int[] field935;

    @ObfuscatedName("ak.h")
    public String[] field936;

    @ObfuscatedName("ak.a")
    public int field941;

    @ObfuscatedName("ak.g")
    public int field938;

    @ObfuscatedName("ak.k")
    public int field944;

    @ObfuscatedName("ak.u")
    public int field940;

    @ObfuscatedName("gq.s(II)Lak;")
    public static class49 method3225(int arg0) {
        class49 var1 = (class49) field939.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field202.method2986(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2098 = var4.field2100.length - 12;
        int var5 = var4.method2550();
        var3.field941 = var4.method2541();
        var3.field938 = var4.method2541();
        var3.field944 = var4.method2541();
        var3.field940 = var4.method2541();
        var4.field2098 = 0;
        var4.method2552();
        var3.field937 = new int[var5];
        var3.field935 = new int[var5];
        var3.field936 = new String[var5];
        int var6 = 0;
        while (var4.field2098 < var4.field2100.length - 12) {
            int var7 = var4.method2541();
            if (var7 == 3) {
                var3.field936[var6] = var4.method2734();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field935[var6] = var4.method2545();
            } else {
                var3.field935[var6] = var4.method2550();
            }
            var3.field937[var6++] = var7;
        }
        field939.method2123(var3, (long) arg0);
        return var3;
    }
}
