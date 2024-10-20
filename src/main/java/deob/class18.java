package deob;

@ObfuscatedName("l")
public class class18 extends class174 {

    @ObfuscatedName("l.m")
    public static class167 field525 = new class167(128);

    @ObfuscatedName("l.k")
    public int[] field521;

    @ObfuscatedName("l.y")
    public int[] field534;

    @ObfuscatedName("l.g")
    public String[] field523;

    @ObfuscatedName("l.r")
    public int field524;

    @ObfuscatedName("l.i")
    public int field522;

    @ObfuscatedName("l.f")
    public int field520;

    @ObfuscatedName("l.a")
    public int field533;

    @ObfuscatedName("n.m(II)Ll;")
    public static class18 method478(int arg0) {
        class18 var1 = (class18) field525.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field58.method2725(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class18 var3 = new class18();
        class104 var4 = new class104(var2);
        var4.field1806 = var4.field1808.length - 12;
        int var5 = var4.method2135();
        var3.field524 = var4.method2132();
        var3.field522 = var4.method2132();
        var3.field520 = var4.method2132();
        var3.field533 = var4.method2132();
        var4.field1806 = 0;
        var4.method2137();
        var3.field521 = new int[var5];
        var3.field534 = new int[var5];
        var3.field523 = new String[var5];
        int var6 = 0;
        while (var4.field1806 < var4.field1808.length - 12) {
            int var7 = var4.method2132();
            if (var7 == 3) {
                var3.field523[var6] = var4.method2138();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field534[var6] = var4.method2190();
            } else {
                var3.field534[var6] = var4.method2135();
            }
            var3.field521[var6++] = var7;
        }
        field525.method3130(var3, (long) arg0);
        return var3;
    }
}
