package deob;

@ObfuscatedName("j")
public class class19 extends class180 {

    @ObfuscatedName("j.y")
    public static class170 field524 = new class170(128);

    @ObfuscatedName("j.u")
    public int[] field519;

    @ObfuscatedName("j.k")
    public int[] field521;

    @ObfuscatedName("j.v")
    public String[] field526;

    @ObfuscatedName("j.l")
    public int field522;

    @ObfuscatedName("j.g")
    public int field523;

    @ObfuscatedName("j.a")
    public int field525;

    @ObfuscatedName("j.x")
    public int field520;

    @ObfuscatedName("dt.y(IB)Lj;")
    public static class19 method2357(int arg0) {
        class19 var1 = (class19) field524.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1640.method2704(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1854 = var4.field1856.length - 12;
        int var5 = var4.method2114();
        var3.field522 = var4.method2111();
        var3.field523 = var4.method2111();
        var3.field525 = var4.method2111();
        var3.field520 = var4.method2111();
        var4.field1854 = 0;
        var4.method2116();
        var3.field519 = new int[var5];
        var3.field521 = new int[var5];
        var3.field526 = new String[var5];
        int var6 = 0;
        while (var4.field1854 < var4.field1856.length - 12) {
            int var7 = var4.method2111();
            if (var7 == 3) {
                var3.field526[var6] = var4.method2126();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field521[var6] = var4.method2109();
            } else {
                var3.field521[var6] = var4.method2114();
            }
            var3.field519[var6++] = var7;
        }
        field524.method3147(var3, (long) arg0);
        return var3;
    }
}
