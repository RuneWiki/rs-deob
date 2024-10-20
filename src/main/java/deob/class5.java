package deob;

@ObfuscatedName("i")
public class class5 extends class172 {

    @ObfuscatedName("i.z")
    public static class168 field80 = new class168(128);

    @ObfuscatedName("i.h")
    public int[] field78;

    @ObfuscatedName("i.c")
    public int[] field77;

    @ObfuscatedName("i.p")
    public String[] field72;

    @ObfuscatedName("i.i")
    public int field73;

    @ObfuscatedName("i.v")
    public int field74;

    @ObfuscatedName("i.l")
    public int field75;

    @ObfuscatedName("i.m")
    public int field76;

    @ObfuscatedName("dz.z(II)Li;")
    public static class5 method2373(int arg0) {
        class5 var1 = (class5) field80.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field256.method2951(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class126 var4 = new class126(var2);
        var4.field2003 = var4.field2007.length - 12;
        int var5 = var4.method2467();
        var3.field73 = var4.method2627();
        var3.field74 = var4.method2627();
        var3.field75 = var4.method2627();
        var3.field76 = var4.method2627();
        var4.field2003 = 0;
        var4.method2589();
        var3.field78 = new int[var5];
        var3.field77 = new int[var5];
        var3.field72 = new String[var5];
        int var6 = 0;
        while (var4.field2003 < var4.field2007.length - 12) {
            int var7 = var4.method2627();
            if (var7 == 3) {
                var3.field72[var6] = var4.method2603();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field77[var6] = var4.method2450();
            } else {
                var3.field77[var6] = var4.method2467();
            }
            var3.field78[var6++] = var7;
        }
        field80.method3237(var3, (long) arg0);
        return var3;
    }
}
