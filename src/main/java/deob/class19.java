package deob;

@ObfuscatedName("r")
public class class19 extends class183 {

    @ObfuscatedName("r.k")
    public static class172 field529 = new class172(128);

    @ObfuscatedName("r.y")
    public int[] field520;

    @ObfuscatedName("r.s")
    public int[] field530;

    @ObfuscatedName("r.g")
    public String[] field524;

    @ObfuscatedName("r.h")
    public int field523;

    @ObfuscatedName("r.l")
    public int field519;

    @ObfuscatedName("r.e")
    public int field525;

    @ObfuscatedName("r.u")
    public int field526;

    @ObfuscatedName("cm.k(II)Lr;")
    public static class19 method2070(int arg0) {
        class19 var1 = (class19) field529.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1999.method2729(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1838 = var4.field1844.length - 12;
        int var5 = var4.method2143();
        var3.field523 = var4.method2239();
        var3.field519 = var4.method2239();
        var3.field525 = var4.method2239();
        var3.field526 = var4.method2239();
        var4.field1838 = 0;
        var4.method2271();
        var3.field520 = new int[var5];
        var3.field530 = new int[var5];
        var3.field524 = new String[var5];
        int var6 = 0;
        while (var4.field1838 < var4.field1844.length - 12) {
            int var7 = var4.method2239();
            if (var7 == 3) {
                var3.field524[var6] = var4.method2146();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field530[var6] = var4.method2138();
            } else {
                var3.field530[var6] = var4.method2143();
            }
            var3.field520[var6++] = var7;
        }
        field529.method3204(var3, (long) arg0);
        return var3;
    }
}
