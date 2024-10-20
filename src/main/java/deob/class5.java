package deob;

@ObfuscatedName("c")
public class class5 extends class172 {

    @ObfuscatedName("c.j")
    public static class168 field71 = new class168(128);

    @ObfuscatedName("c.y")
    public int[] field69;

    @ObfuscatedName("c.x")
    public int[] field75;

    @ObfuscatedName("c.z")
    public String[] field72;

    @ObfuscatedName("c.c")
    public int field73;

    @ObfuscatedName("c.e")
    public int field74;

    @ObfuscatedName("c.s")
    public int field77;

    @ObfuscatedName("c.i")
    public int field76;

    @ObfuscatedName("g.j(II)Lc;")
    public static class5 method54(int arg0) {
        class5 var1 = (class5) field71.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field260.method2903(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class126 var4 = new class126(var2);
        var4.field2020 = var4.field2025.length - 12;
        int var5 = var4.method2387();
        var3.field73 = var4.method2405();
        var3.field74 = var4.method2405();
        var3.field77 = var4.method2405();
        var3.field76 = var4.method2405();
        var4.field2020 = 0;
        var4.method2389();
        var3.field69 = new int[var5];
        var3.field75 = new int[var5];
        var3.field72 = new String[var5];
        int var6 = 0;
        while (var4.field2020 < var4.field2025.length - 12) {
            int var7 = var4.method2405();
            if (var7 == 3) {
                var3.field72[var6] = var4.method2390();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field75[var6] = var4.method2399();
            } else {
                var3.field75[var6] = var4.method2387();
            }
            var3.field69[var6++] = var7;
        }
        field71.method3181(var3, (long) arg0);
        return var3;
    }
}
