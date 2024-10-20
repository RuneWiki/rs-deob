package deob;

@ObfuscatedName("q")
public class class5 extends class174 {

    @ObfuscatedName("q.i")
    public static class170 field80 = new class170(128);

    @ObfuscatedName("q.p")
    public int[] field69;

    @ObfuscatedName("q.a")
    public int[] field70;

    @ObfuscatedName("q.l")
    public String[] field71;

    @ObfuscatedName("q.q")
    public int field72;

    @ObfuscatedName("q.b")
    public int field73;

    @ObfuscatedName("q.u")
    public int field74;

    @ObfuscatedName("q.d")
    public int field75;

    @ObfuscatedName("as.i(IB)Lq;")
    public static class5 method744(int arg0) {
        class5 var1 = (class5) field80.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1795.method2932(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2037 = var4.field2039.length - 12;
        int var5 = var4.method2416();
        var3.field72 = var4.method2413();
        var3.field73 = var4.method2413();
        var3.field74 = var4.method2413();
        var3.field75 = var4.method2413();
        var4.field2037 = 0;
        var4.method2557();
        var3.field69 = new int[var5];
        var3.field70 = new int[var5];
        var3.field71 = new String[var5];
        int var6 = 0;
        while (var4.field2037 < var4.field2039.length - 12) {
            int var7 = var4.method2413();
            if (var7 == 3) {
                var3.field71[var6] = var4.method2419();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field70[var6] = var4.method2411();
            } else {
                var3.field70[var6] = var4.method2416();
            }
            var3.field69[var6++] = var7;
        }
        field80.method3225(var3, (long) arg0);
        return var3;
    }
}
