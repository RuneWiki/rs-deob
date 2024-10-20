package deob;

@ObfuscatedName("n")
public class class5 extends class174 {

    @ObfuscatedName("n.g")
    public static class170 field66 = new class170(128);

    @ObfuscatedName("n.m")
    public int[] field77;

    @ObfuscatedName("n.v")
    public int[] field74;

    @ObfuscatedName("n.r")
    public String[] field67;

    @ObfuscatedName("n.n")
    public int field65;

    @ObfuscatedName("n.i")
    public int field68;

    @ObfuscatedName("n.s")
    public int field69;

    @ObfuscatedName("n.w")
    public int field70;

    @ObfuscatedName("bf.g(II)Ln;")
    public static class5 method1380(int arg0) {
        class5 var1 = (class5) field66.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field343.method2968(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2023 = var4.field2028.length - 12;
        int var5 = var4.method2430();
        var3.field65 = var4.method2416();
        var3.field68 = var4.method2416();
        var3.field69 = var4.method2416();
        var3.field70 = var4.method2416();
        var4.field2023 = 0;
        var4.method2421();
        var3.field77 = new int[var5];
        var3.field74 = new int[var5];
        var3.field67 = new String[var5];
        int var6 = 0;
        while (var4.field2023 < var4.field2028.length - 12) {
            int var7 = var4.method2416();
            if (var7 == 3) {
                var3.field67[var6] = var4.method2422();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field74[var6] = var4.method2414();
            } else {
                var3.field74[var6] = var4.method2430();
            }
            var3.field77[var6++] = var7;
        }
        field66.method3249(var3, (long) arg0);
        return var3;
    }
}
