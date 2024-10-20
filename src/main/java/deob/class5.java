package deob;

@ObfuscatedName("r")
public class class5 extends class173 {

    @ObfuscatedName("r.v")
    public static class169 field69 = new class169(128);

    @ObfuscatedName("r.f")
    public int[] field63;

    @ObfuscatedName("r.n")
    public int[] field64;

    @ObfuscatedName("r.c")
    public String[] field70;

    @ObfuscatedName("r.r")
    public int field66;

    @ObfuscatedName("r.k")
    public int field67;

    @ObfuscatedName("r.e")
    public int field68;

    @ObfuscatedName("r.q")
    public int field76;

    @ObfuscatedName("i.v(II)Lr;")
    public static class5 method163(int arg0) {
        class5 var1 = (class5) field69.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2000.method3020(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class126 var4 = new class126(var2);
        var4.field2027 = var4.field2029.length - 12;
        int var5 = var4.method2500();
        var3.field66 = var4.method2468();
        var3.field67 = var4.method2468();
        var3.field68 = var4.method2468();
        var3.field76 = var4.method2468();
        var4.field2027 = 0;
        var4.method2473();
        var3.field63 = new int[var5];
        var3.field64 = new int[var5];
        var3.field70 = new String[var5];
        int var6 = 0;
        while (var4.field2027 < var4.field2029.length - 12) {
            int var7 = var4.method2468();
            if (var7 == 3) {
                var3.field70[var6] = var4.method2462();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field64[var6] = var4.method2466();
            } else {
                var3.field64[var6] = var4.method2500();
            }
            var3.field63[var6++] = var7;
        }
        field69.method3231(var3, (long) arg0);
        return var3;
    }
}
