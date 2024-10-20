package deob;

@ObfuscatedName("z")
public class class19 extends class180 {

    @ObfuscatedName("z.e")
    public static class170 field531 = new class170(128);

    @ObfuscatedName("z.p")
    public int[] field526;

    @ObfuscatedName("z.a")
    public int[] field527;

    @ObfuscatedName("z.g")
    public String[] field530;

    @ObfuscatedName("z.u")
    public int field529;

    @ObfuscatedName("z.k")
    public int field528;

    @ObfuscatedName("z.m")
    public int field525;

    @ObfuscatedName("z.t")
    public int field532;

    @ObfuscatedName("dp.e(II)Lz;")
    public static class19 method2141(int arg0) {
        class19 var1 = (class19) field531.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field621.method2717(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1841 = var4.field1845.length - 12;
        int var5 = var4.method2146();
        var3.field529 = var4.method2182();
        var3.field528 = var4.method2182();
        var3.field525 = var4.method2182();
        var3.field532 = var4.method2182();
        var4.field1841 = 0;
        var4.method2281();
        var3.field526 = new int[var5];
        var3.field527 = new int[var5];
        var3.field530 = new String[var5];
        int var6 = 0;
        while (var4.field1841 < var4.field1845.length - 12) {
            int var7 = var4.method2182();
            if (var7 == 3) {
                var3.field530[var6] = var4.method2149();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field527[var6] = var4.method2125();
            } else {
                var3.field527[var6] = var4.method2146();
            }
            var3.field526[var6++] = var7;
        }
        field531.method3161(var3, (long) arg0);
        return var3;
    }
}
