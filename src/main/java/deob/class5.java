package deob;

@ObfuscatedName("g")
public class class5 extends class174 {

    @ObfuscatedName("g.c")
    public static class170 field77 = new class170(128);

    @ObfuscatedName("g.q")
    public int[] field63;

    @ObfuscatedName("g.y")
    public int[] field72;

    @ObfuscatedName("g.v")
    public String[] field65;

    @ObfuscatedName("g.g")
    public int field62;

    @ObfuscatedName("g.x")
    public int field67;

    @ObfuscatedName("g.u")
    public int field68;

    @ObfuscatedName("g.l")
    public int field69;

    @ObfuscatedName("cj.c(II)Lg;")
    public static class5 method1587(int arg0) {
        class5 var1 = (class5) field77.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field896.method2886(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2052 = var4.field2057.length - 12;
        int var5 = var4.method2323();
        var3.field62 = var4.method2327();
        var3.field67 = var4.method2327();
        var3.field68 = var4.method2327();
        var3.field69 = var4.method2327();
        var4.field2052 = 0;
        var4.method2325();
        var3.field63 = new int[var5];
        var3.field72 = new int[var5];
        var3.field65 = new String[var5];
        int var6 = 0;
        while (var4.field2052 < var4.field2057.length - 12) {
            int var7 = var4.method2327();
            if (var7 == 3) {
                var3.field65[var6] = var4.method2315();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field72[var6] = var4.method2383();
            } else {
                var3.field72[var6] = var4.method2323();
            }
            var3.field63[var6++] = var7;
        }
        field77.method3092(var3, (long) arg0);
        return var3;
    }
}
