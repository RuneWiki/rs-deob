package deob;

@ObfuscatedName("j")
public class class5 extends class176 {

    @ObfuscatedName("j.e")
    public static class172 field76 = new class172(128);

    @ObfuscatedName("j.i")
    public int[] field72;

    @ObfuscatedName("j.k")
    public int[] field73;

    @ObfuscatedName("j.q")
    public String[] field74;

    @ObfuscatedName("j.j")
    public int field83;

    @ObfuscatedName("j.z")
    public int field81;

    @ObfuscatedName("j.m")
    public int field75;

    @ObfuscatedName("j.w")
    public int field78;

    @ObfuscatedName("ee.e(II)Lj;")
    public static class5 method2731(int arg0) {
        class5 var1 = (class5) field76.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1615.method3069(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class128 var4 = new class128(var2);
        var4.field2045 = var4.field2043.length - 12;
        int var5 = var4.method2592();
        var3.field83 = var4.method2456();
        var3.field81 = var4.method2456();
        var3.field75 = var4.method2456();
        var3.field78 = var4.method2456();
        var4.field2045 = 0;
        var4.method2439();
        var3.field72 = new int[var5];
        var3.field73 = new int[var5];
        var3.field74 = new String[var5];
        int var6 = 0;
        while (var4.field2045 < var4.field2043.length - 12) {
            int var7 = var4.method2456();
            if (var7 == 3) {
                var3.field74[var6] = var4.method2559();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field73[var6] = var4.method2548();
            } else {
                var3.field73[var6] = var4.method2592();
            }
            var3.field72[var6++] = var7;
        }
        field76.method3264(var3, (long) arg0);
        return var3;
    }
}
