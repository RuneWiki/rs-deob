package deob;

@ObfuscatedName("a")
public class class5 extends class174 {

    @ObfuscatedName("a.b")
    public static class170 field72 = new class170(128);

    @ObfuscatedName("a.e")
    public int[] field67;

    @ObfuscatedName("a.g")
    public int[] field68;

    @ObfuscatedName("a.o")
    public String[] field69;

    @ObfuscatedName("a.a")
    public int field74;

    @ObfuscatedName("a.h")
    public int field71;

    @ObfuscatedName("a.j")
    public int field70;

    @ObfuscatedName("a.f")
    public int field73;

    @ObfuscatedName("ax.b(IB)La;")
    public static class5 method562(int arg0) {
        class5 var1 = (class5) field72.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field225.method3026(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class126 var4 = new class126(var2);
        var4.field2027 = var4.field2026.length - 12;
        int var5 = var4.method2439();
        var3.field74 = var4.method2572();
        var3.field71 = var4.method2572();
        var3.field70 = var4.method2572();
        var3.field73 = var4.method2572();
        var4.field2027 = 0;
        var4.method2443();
        var3.field67 = new int[var5];
        var3.field68 = new int[var5];
        var3.field69 = new String[var5];
        int var6 = 0;
        while (var4.field2027 < var4.field2026.length - 12) {
            int var7 = var4.method2572();
            if (var7 == 3) {
                var3.field69[var6] = var4.method2444();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field68[var6] = var4.method2436();
            } else {
                var3.field68[var6] = var4.method2439();
            }
            var3.field67[var6++] = var7;
        }
        field72.method3252(var3, (long) arg0);
        return var3;
    }
}
