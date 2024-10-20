package deob;

@ObfuscatedName("w")
public class class20 extends class195 {

    @ObfuscatedName("w.b")
    public static class184 field545 = new class184(128);

    @ObfuscatedName("w.e")
    public int[] field544;

    @ObfuscatedName("w.a")
    public int[] field549;

    @ObfuscatedName("w.k")
    public String[] field543;

    @ObfuscatedName("w.p")
    public int field547;

    @ObfuscatedName("w.l")
    public int field548;

    @ObfuscatedName("w.u")
    public int field546;

    @ObfuscatedName("w.o")
    public int field552;

    @ObfuscatedName("ds.b(II)Lw;")
    public static class20 method2440(int arg0) {
        class20 var1 = (class20) field545.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field229.method2819(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1894 = var4.field1897.length - 12;
        int var5 = var4.method2194();
        var3.field547 = var4.method2129();
        var3.field548 = var4.method2129();
        var3.field546 = var4.method2129();
        var3.field552 = var4.method2129();
        var4.field1894 = 0;
        var4.method2335();
        var3.field544 = new int[var5];
        var3.field549 = new int[var5];
        var3.field543 = new String[var5];
        int var6 = 0;
        while (var4.field1894 < var4.field1897.length - 12) {
            int var7 = var4.method2129();
            if (var7 == 3) {
                var3.field543[var6] = var4.method2166();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field549[var6] = var4.method2127();
            } else {
                var3.field549[var6] = var4.method2194();
            }
            var3.field544[var6++] = var7;
        }
        field545.method3256(var3, (long) arg0);
        return var3;
    }
}
