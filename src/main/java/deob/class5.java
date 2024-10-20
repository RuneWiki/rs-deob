package deob;

@ObfuscatedName("p")
public class class5 extends class174 {

    @ObfuscatedName("p.a")
    public static class170 field72 = new class170(128);

    @ObfuscatedName("p.x")
    public int[] field69;

    @ObfuscatedName("p.e")
    public int[] field71;

    @ObfuscatedName("p.r")
    public String[] field68;

    @ObfuscatedName("p.p")
    public int field70;

    @ObfuscatedName("p.n")
    public int field73;

    @ObfuscatedName("p.o")
    public int field74;

    @ObfuscatedName("p.l")
    public int field75;

    @ObfuscatedName("ej.a(II)Lp;")
    public static class5 method2669(int arg0) {
        class5 var1 = (class5) field72.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field511.method2961(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2035 = var4.field2036.length - 12;
        int var5 = var4.method2416();
        var3.field70 = var4.method2413();
        var3.field73 = var4.method2413();
        var3.field74 = var4.method2413();
        var3.field75 = var4.method2413();
        var4.field2035 = 0;
        var4.method2418();
        var3.field69 = new int[var5];
        var3.field71 = new int[var5];
        var3.field68 = new String[var5];
        int var6 = 0;
        while (var4.field2035 < var4.field2036.length - 12) {
            int var7 = var4.method2413();
            if (var7 == 3) {
                var3.field68[var6] = var4.method2564();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field71[var6] = var4.method2411();
            } else {
                var3.field71[var6] = var4.method2416();
            }
            var3.field69[var6++] = var7;
        }
        field72.method3193(var3, (long) arg0);
        return var3;
    }
}
