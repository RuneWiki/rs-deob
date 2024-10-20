package deob;

@ObfuscatedName("x")
public class class5 extends class172 {

    @ObfuscatedName("x.c")
    public static class168 field87 = new class168(128);

    @ObfuscatedName("x.j")
    public int[] field75;

    @ObfuscatedName("x.f")
    public int[] field76;

    @ObfuscatedName("x.y")
    public String[] field84;

    @ObfuscatedName("x.x")
    public int field78;

    @ObfuscatedName("x.e")
    public int field79;

    @ObfuscatedName("x.m")
    public int field80;

    @ObfuscatedName("x.s")
    public int field81;

    @ObfuscatedName("g.c(IB)Lx;")
    public static class5 method163(int arg0) {
        class5 var1 = (class5) field87.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1409.method2821(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class125 var4 = new class125(var2);
        var4.field2003 = var4.field2002.length - 12;
        int var5 = var4.method2489();
        var3.field78 = var4.method2328();
        var3.field79 = var4.method2328();
        var3.field80 = var4.method2328();
        var3.field81 = var4.method2328();
        var4.field2003 = 0;
        var4.method2333();
        var3.field75 = new int[var5];
        var3.field76 = new int[var5];
        var3.field84 = new String[var5];
        int var6 = 0;
        while (var4.field2003 < var4.field2002.length - 12) {
            int var7 = var4.method2328();
            if (var7 == 3) {
                var3.field84[var6] = var4.method2515();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field76[var6] = var4.method2326();
            } else {
                var3.field76[var6] = var4.method2489();
            }
            var3.field75[var6++] = var7;
        }
        field87.method3089(var3, (long) arg0);
        return var3;
    }
}
