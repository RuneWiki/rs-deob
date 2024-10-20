package deob;

@ObfuscatedName("w")
public class class20 extends class195 {

    @ObfuscatedName("w.o")
    public static class184 field554 = new class184(128);

    @ObfuscatedName("w.l")
    public int[] field568;

    @ObfuscatedName("w.g")
    public int[] field556;

    @ObfuscatedName("w.u")
    public String[] field557;

    @ObfuscatedName("w.q")
    public int field558;

    @ObfuscatedName("w.r")
    public int field559;

    @ObfuscatedName("w.v")
    public int field560;

    @ObfuscatedName("w.y")
    public int field561;

    @ObfuscatedName("aw.o(IB)Lw;")
    public static class20 method818(int arg0) {
        class20 var1 = (class20) field554.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field86.method2940(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1861 = var4.field1860.length - 12;
        int var5 = var4.method2273();
        var3.field558 = var4.method2397();
        var3.field559 = var4.method2397();
        var3.field560 = var4.method2397();
        var3.field561 = var4.method2397();
        var4.field1861 = 0;
        var4.method2226();
        var3.field568 = new int[var5];
        var3.field556 = new int[var5];
        var3.field557 = new String[var5];
        int var6 = 0;
        while (var4.field1861 < var4.field1860.length - 12) {
            int var7 = var4.method2397();
            if (var7 == 3) {
                var3.field557[var6] = var4.method2339();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field556[var6] = var4.method2219();
            } else {
                var3.field556[var6] = var4.method2273();
            }
            var3.field568[var6++] = var7;
        }
        field554.method3403(var3, (long) arg0);
        return var3;
    }
}
