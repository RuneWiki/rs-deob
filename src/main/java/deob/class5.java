package deob;

@ObfuscatedName("s")
public class class5 extends class176 {

    @ObfuscatedName("s.i")
    public static class172 field78 = new class172(128);

    @ObfuscatedName("s.b")
    public int[] field82;

    @ObfuscatedName("s.r")
    public int[] field74;

    @ObfuscatedName("s.l")
    public String[] field75;

    @ObfuscatedName("s.s")
    public int field72;

    @ObfuscatedName("s.d")
    public int field77;

    @ObfuscatedName("s.e")
    public int field73;

    @ObfuscatedName("s.u")
    public int field79;

    @ObfuscatedName("s.i(IB)Ls;")
    public static class5 method35(int arg0) {
        class5 var1 = (class5) field78.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1326.method3043(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class128 var4 = new class128(var2);
        var4.field2048 = var4.field2050.length - 12;
        int var5 = var4.method2468();
        var3.field72 = var4.method2473();
        var3.field77 = var4.method2473();
        var3.field73 = var4.method2473();
        var3.field79 = var4.method2473();
        var4.field2048 = 0;
        var4.method2525();
        var3.field82 = new int[var5];
        var3.field74 = new int[var5];
        var3.field75 = new String[var5];
        int var6 = 0;
        while (var4.field2048 < var4.field2050.length - 12) {
            int var7 = var4.method2473();
            if (var7 == 3) {
                var3.field75[var6] = var4.method2618();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field74[var6] = var4.method2531();
            } else {
                var3.field74[var6] = var4.method2468();
            }
            var3.field82[var6++] = var7;
        }
        field78.method3281(var3, (long) arg0);
        return var3;
    }
}
