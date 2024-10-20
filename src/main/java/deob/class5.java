package deob;

@ObfuscatedName("n")
public class class5 extends class173 {

    @ObfuscatedName("n.u")
    public static class169 field73 = new class169(128);

    @ObfuscatedName("n.k")
    public int[] field68;

    @ObfuscatedName("n.x")
    public int[] field65;

    @ObfuscatedName("n.m")
    public String[] field67;

    @ObfuscatedName("n.n")
    public int field64;

    @ObfuscatedName("n.q")
    public int field69;

    @ObfuscatedName("n.a")
    public int field70;

    @ObfuscatedName("n.g")
    public int field71;

    @ObfuscatedName("bx.u(IB)Ln;")
    public static class5 method1475(int arg0) {
        class5 var1 = (class5) field73.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1803.method2965(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class126 var4 = new class126(var2);
        var4.field2024 = var4.field2022.length - 12;
        int var5 = var4.method2526();
        var3.field64 = var4.method2450();
        var3.field69 = var4.method2450();
        var3.field70 = var4.method2450();
        var3.field71 = var4.method2450();
        var4.field2024 = 0;
        var4.method2569();
        var3.field68 = new int[var5];
        var3.field65 = new int[var5];
        var3.field67 = new String[var5];
        int var6 = 0;
        while (var4.field2024 < var4.field2022.length - 12) {
            int var7 = var4.method2450();
            if (var7 == 3) {
                var3.field67[var6] = var4.method2630();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field65[var6] = var4.method2559();
            } else {
                var3.field65[var6] = var4.method2526();
            }
            var3.field68[var6++] = var7;
        }
        field73.method3260(var3, (long) arg0);
        return var3;
    }
}
