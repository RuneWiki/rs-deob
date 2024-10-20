package deob;

@ObfuscatedName("o")
public class class5 extends class174 {

    @ObfuscatedName("o.p")
    public static class170 field59 = new class170(128);

    @ObfuscatedName("o.l")
    public int[] field60;

    @ObfuscatedName("o.d")
    public int[] field71;

    @ObfuscatedName("o.x")
    public String[] field69;

    @ObfuscatedName("o.o")
    public int field63;

    @ObfuscatedName("o.a")
    public int field61;

    @ObfuscatedName("o.w")
    public int field65;

    @ObfuscatedName("o.i")
    public int field66;

    @ObfuscatedName("n.p(II)Lo;")
    public static class5 method133(int arg0) {
        class5 var1 = (class5) field59.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field950.method3078(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2030 = var4.field2036.length - 12;
        int var5 = var4.method2489();
        var3.field63 = var4.method2581();
        var3.field61 = var4.method2581();
        var3.field65 = var4.method2581();
        var3.field66 = var4.method2581();
        var4.field2030 = 0;
        var4.method2505();
        var3.field60 = new int[var5];
        var3.field71 = new int[var5];
        var3.field69 = new String[var5];
        int var6 = 0;
        while (var4.field2030 < var4.field2036.length - 12) {
            int var7 = var4.method2581();
            if (var7 == 3) {
                var3.field69[var6] = var4.method2506();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field71[var6] = var4.method2498();
            } else {
                var3.field71[var6] = var4.method2489();
            }
            var3.field60[var6++] = var7;
        }
        field59.method3364(var3, (long) arg0);
        return var3;
    }
}
