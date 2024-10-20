package deob;

@ObfuscatedName("k")
public class class5 extends class174 {

    @ObfuscatedName("k.b")
    public static class170 field73 = new class170(128);

    @ObfuscatedName("k.c")
    public int[] field80;

    @ObfuscatedName("k.j")
    public int[] field72;

    @ObfuscatedName("k.i")
    public String[] field76;

    @ObfuscatedName("k.k")
    public int field74;

    @ObfuscatedName("k.q")
    public int field75;

    @ObfuscatedName("k.t")
    public int field77;

    @ObfuscatedName("k.v")
    public int field83;

    @ObfuscatedName("eo.b(II)Lk;")
    public static class5 method3042(int arg0) {
        class5 var1 = (class5) field73.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field386.method2964(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2051 = var4.field2056.length - 12;
        int var5 = var4.method2455();
        var3.field74 = var4.method2394();
        var3.field75 = var4.method2394();
        var3.field77 = var4.method2394();
        var3.field83 = var4.method2394();
        var4.field2051 = 0;
        var4.method2403();
        var3.field80 = new int[var5];
        var3.field72 = new int[var5];
        var3.field76 = new String[var5];
        int var6 = 0;
        while (var4.field2051 < var4.field2056.length - 12) {
            int var7 = var4.method2394();
            if (var7 == 3) {
                var3.field76[var6] = var4.method2473();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field72[var6] = var4.method2416();
            } else {
                var3.field72[var6] = var4.method2455();
            }
            var3.field80[var6++] = var7;
        }
        field73.method3190(var3, (long) arg0);
        return var3;
    }
}
