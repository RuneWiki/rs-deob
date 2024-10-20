package deob;

@ObfuscatedName("q")
public class class20 extends class195 {

    @ObfuscatedName("q.t")
    public static class184 field545 = new class184(128);

    @ObfuscatedName("q.b")
    public int[] field543;

    @ObfuscatedName("q.p")
    public int[] field541;

    @ObfuscatedName("q.e")
    public String[] field542;

    @ObfuscatedName("q.i")
    public int field539;

    @ObfuscatedName("q.o")
    public int field544;

    @ObfuscatedName("q.f")
    public int field549;

    @ObfuscatedName("q.d")
    public int field546;

    @ObfuscatedName("dw.t(IB)Lq;")
    public static class20 method2615(int arg0) {
        class20 var1 = (class20) field545.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2129.method2881(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1867 = var4.field1869.length - 12;
        int var5 = var4.method2177();
        var3.field539 = var4.method2255();
        var3.field544 = var4.method2255();
        var3.field549 = var4.method2255();
        var3.field546 = var4.method2255();
        var4.field1867 = 0;
        var4.method2179();
        var3.field543 = new int[var5];
        var3.field541 = new int[var5];
        var3.field542 = new String[var5];
        int var6 = 0;
        while (var4.field1867 < var4.field1869.length - 12) {
            int var7 = var4.method2255();
            if (var7 == 3) {
                var3.field542[var6] = var4.method2180();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field541[var6] = var4.method2172();
            } else {
                var3.field541[var6] = var4.method2177();
            }
            var3.field543[var6++] = var7;
        }
        field545.method3341(var3, (long) arg0);
        return var3;
    }
}
