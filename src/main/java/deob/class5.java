package deob;

@ObfuscatedName("f")
public class class5 extends class174 {

    @ObfuscatedName("f.d")
    public static class170 field75 = new class170(128);

    @ObfuscatedName("f.g")
    public int[] field81;

    @ObfuscatedName("f.a")
    public int[] field74;

    @ObfuscatedName("f.t")
    public String[] field76;

    @ObfuscatedName("f.f")
    public int field77;

    @ObfuscatedName("f.c")
    public int field78;

    @ObfuscatedName("f.p")
    public int field79;

    @ObfuscatedName("f.s")
    public int field73;

    @ObfuscatedName("bg.d(IB)Lf;")
    public static class5 method1507(int arg0) {
        class5 var1 = (class5) field75.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field89.method2958(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2042 = var4.field2035.length - 12;
        int var5 = var4.method2405();
        var3.field77 = var4.method2512();
        var3.field78 = var4.method2512();
        var3.field79 = var4.method2512();
        var3.field73 = var4.method2512();
        var4.field2042 = 0;
        var4.method2385();
        var3.field81 = new int[var5];
        var3.field74 = new int[var5];
        var3.field76 = new String[var5];
        int var6 = 0;
        while (var4.field2042 < var4.field2035.length - 12) {
            int var7 = var4.method2512();
            if (var7 == 3) {
                var3.field76[var6] = var4.method2408();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field74[var6] = var4.method2509();
            } else {
                var3.field74[var6] = var4.method2405();
            }
            var3.field81[var6++] = var7;
        }
        field75.method3221(var3, (long) arg0);
        return var3;
    }
}
