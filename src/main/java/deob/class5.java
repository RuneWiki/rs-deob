package deob;

@ObfuscatedName("q")
public class class5 extends class174 {

    @ObfuscatedName("q.x")
    public static class170 field69 = new class170(128);

    @ObfuscatedName("q.p")
    public int[] field62;

    @ObfuscatedName("q.k")
    public int[] field71;

    @ObfuscatedName("q.a")
    public String[] field64;

    @ObfuscatedName("q.q")
    public int field65;

    @ObfuscatedName("q.j")
    public int field67;

    @ObfuscatedName("q.v")
    public int field66;

    @ObfuscatedName("q.w")
    public int field68;

    @ObfuscatedName("bl.x(II)Lq;")
    public static class5 method1205(int arg0) {
        class5 var1 = (class5) field69.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field815.method2920(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2008 = var4.field2015.length - 12;
        int var5 = var4.method2415();
        var3.field65 = var4.method2539();
        var3.field67 = var4.method2539();
        var3.field66 = var4.method2539();
        var3.field68 = var4.method2539();
        var4.field2008 = 0;
        var4.method2423();
        var3.field62 = new int[var5];
        var3.field71 = new int[var5];
        var3.field64 = new String[var5];
        int var6 = 0;
        while (var4.field2008 < var4.field2015.length - 12) {
            int var7 = var4.method2539();
            if (var7 == 3) {
                var3.field64[var6] = var4.method2571();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field71[var6] = var4.method2484();
            } else {
                var3.field71[var6] = var4.method2415();
            }
            var3.field62[var6++] = var7;
        }
        field69.method3197(var3, (long) arg0);
        return var3;
    }
}
