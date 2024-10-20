package deob;

@ObfuscatedName("u")
public class class19 extends class187 {

    @ObfuscatedName("u.a")
    public static class176 field536 = new class176(128);

    @ObfuscatedName("u.v")
    public int[] field534;

    @ObfuscatedName("u.i")
    public int[] field537;

    @ObfuscatedName("u.b")
    public String[] field542;

    @ObfuscatedName("u.l")
    public int field541;

    @ObfuscatedName("u.m")
    public int field535;

    @ObfuscatedName("u.w")
    public int field539;

    @ObfuscatedName("u.e")
    public int field540;

    @ObfuscatedName("eq.a(II)Lu;")
    public static class19 method2625(int arg0) {
        class19 var1 = (class19) field536.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field291.method2731(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class110 var4 = new class110(var2);
        var4.field1861 = var4.field1865.length - 12;
        int var5 = var4.method2136();
        var3.field541 = var4.method2282();
        var3.field535 = var4.method2282();
        var3.field539 = var4.method2282();
        var3.field540 = var4.method2282();
        var4.field1861 = 0;
        var4.method2138();
        var3.field534 = new int[var5];
        var3.field537 = new int[var5];
        var3.field542 = new String[var5];
        int var6 = 0;
        while (var4.field1861 < var4.field1865.length - 12) {
            int var7 = var4.method2282();
            if (var7 == 3) {
                var3.field542[var6] = var4.method2139();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field537[var6] = var4.method2199();
            } else {
                var3.field537[var6] = var4.method2136();
            }
            var3.field534[var6++] = var7;
        }
        field536.method3183(var3, (long) arg0);
        return var3;
    }
}
