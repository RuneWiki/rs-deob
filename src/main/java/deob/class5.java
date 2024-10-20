package deob;

@ObfuscatedName("i")
public class class5 extends class172 {

    @ObfuscatedName("i.g")
    public static class168 field67 = new class168(128);

    @ObfuscatedName("i.e")
    public int[] field57;

    @ObfuscatedName("i.n")
    public int[] field58;

    @ObfuscatedName("i.j")
    public String[] field59;

    @ObfuscatedName("i.i")
    public int field60;

    @ObfuscatedName("i.o")
    public int field61;

    @ObfuscatedName("i.l")
    public int field56;

    @ObfuscatedName("i.p")
    public int field62;

    @ObfuscatedName("bh.g(IB)Li;")
    public static class5 method1386(int arg0) {
        class5 var1 = (class5) field67.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field731.method3012(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class126 var4 = new class126(var2);
        var4.field2016 = var4.field2013.length - 12;
        int var5 = var4.method2593();
        var3.field60 = var4.method2487();
        var3.field61 = var4.method2487();
        var3.field56 = var4.method2487();
        var3.field62 = var4.method2487();
        var4.field2016 = 0;
        var4.method2498();
        var3.field57 = new int[var5];
        var3.field58 = new int[var5];
        var3.field59 = new String[var5];
        int var6 = 0;
        while (var4.field2016 < var4.field2013.length - 12) {
            int var7 = var4.method2487();
            if (var7 == 3) {
                var3.field59[var6] = var4.method2470();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field58[var6] = var4.method2485();
            } else {
                var3.field58[var6] = var4.method2593();
            }
            var3.field57[var6++] = var7;
        }
        field67.method3314(var3, (long) arg0);
        return var3;
    }
}
