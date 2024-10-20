package deob;

@ObfuscatedName("p")
public class class20 extends class195 {

    @ObfuscatedName("p.n")
    public static class184 field567 = new class184(128);

    @ObfuscatedName("p.o")
    public int[] field577;

    @ObfuscatedName("p.a")
    public int[] field566;

    @ObfuscatedName("p.w")
    public String[] field564;

    @ObfuscatedName("p.m")
    public int field568;

    @ObfuscatedName("p.h")
    public int field569;

    @ObfuscatedName("p.i")
    public int field578;

    @ObfuscatedName("p.r")
    public int field571;

    @ObfuscatedName("gk.n(II)Lp;")
    public static class20 method3576(int arg0) {
        class20 var1 = (class20) field567.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2089.method2925(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1890 = var4.field1889.length - 12;
        int var5 = var4.method2239();
        var3.field568 = var4.method2236();
        var3.field569 = var4.method2236();
        var3.field578 = var4.method2236();
        var3.field571 = var4.method2236();
        var4.field1890 = 0;
        var4.method2241();
        var3.field577 = new int[var5];
        var3.field566 = new int[var5];
        var3.field564 = new String[var5];
        int var6 = 0;
        while (var4.field1890 < var4.field1889.length - 12) {
            int var7 = var4.method2236();
            if (var7 == 3) {
                var3.field564[var6] = var4.method2242();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field566[var6] = var4.method2234();
            } else {
                var3.field566[var6] = var4.method2239();
            }
            var3.field577[var6++] = var7;
        }
        field567.method3372(var3, (long) arg0);
        return var3;
    }
}
