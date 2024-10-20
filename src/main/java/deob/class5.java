package deob;

@ObfuscatedName("u")
public class class5 extends class174 {

    @ObfuscatedName("u.j")
    public static class170 field74 = new class170(128);

    @ObfuscatedName("u.f")
    public int[] field76;

    @ObfuscatedName("u.o")
    public int[] field66;

    @ObfuscatedName("u.h")
    public String[] field67;

    @ObfuscatedName("u.u")
    public int field72;

    @ObfuscatedName("u.a")
    public int field68;

    @ObfuscatedName("u.q")
    public int field70;

    @ObfuscatedName("u.t")
    public int field71;

    @ObfuscatedName("s.j(II)Lu;")
    public static class5 method156(int arg0) {
        class5 var1 = (class5) field74.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field116.method3027(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2035 = var4.field2037.length - 12;
        int var5 = var4.method2508();
        var3.field72 = var4.method2582();
        var3.field68 = var4.method2582();
        var3.field70 = var4.method2582();
        var3.field71 = var4.method2582();
        var4.field2035 = 0;
        var4.method2471();
        var3.field76 = new int[var5];
        var3.field66 = new int[var5];
        var3.field67 = new String[var5];
        int var6 = 0;
        while (var4.field2035 < var4.field2037.length - 12) {
            int var7 = var4.method2582();
            if (var7 == 3) {
                var3.field67[var6] = var4.method2518();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field66[var6] = var4.method2464();
            } else {
                var3.field66[var6] = var4.method2508();
            }
            var3.field76[var6++] = var7;
        }
        field74.method3257(var3, (long) arg0);
        return var3;
    }
}
