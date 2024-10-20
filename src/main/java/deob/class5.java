package deob;

@ObfuscatedName("t")
public class class5 extends class174 {

    @ObfuscatedName("t.i")
    public static class170 field69 = new class170(128);

    @ObfuscatedName("t.w")
    public int[] field62;

    @ObfuscatedName("t.f")
    public int[] field63;

    @ObfuscatedName("t.e")
    public String[] field70;

    @ObfuscatedName("t.t")
    public int field65;

    @ObfuscatedName("t.d")
    public int field66;

    @ObfuscatedName("t.p")
    public int field67;

    @ObfuscatedName("t.k")
    public int field71;

    @ObfuscatedName("cn.i(II)Lt;")
    public static class5 method2127(int arg0) {
        class5 var1 = (class5) field69.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2005.method2970(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2045 = var4.field2049.length - 12;
        int var5 = var4.method2457();
        var3.field65 = var4.method2615();
        var3.field66 = var4.method2615();
        var3.field67 = var4.method2615();
        var3.field71 = var4.method2615();
        var4.field2045 = 0;
        var4.method2591();
        var3.field62 = new int[var5];
        var3.field63 = new int[var5];
        var3.field70 = new String[var5];
        int var6 = 0;
        while (var4.field2045 < var4.field2049.length - 12) {
            int var7 = var4.method2615();
            if (var7 == 3) {
                var3.field70[var6] = var4.method2460();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field63[var6] = var4.method2472();
            } else {
                var3.field63[var6] = var4.method2457();
            }
            var3.field62[var6++] = var7;
        }
        field69.method3234(var3, (long) arg0);
        return var3;
    }
}
