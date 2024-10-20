package deob;

@ObfuscatedName("f")
public class class19 extends class182 {

    @ObfuscatedName("f.k")
    public static class171 field541 = new class171(128);

    @ObfuscatedName("f.b")
    public int[] field529;

    @ObfuscatedName("f.e")
    public int[] field530;

    @ObfuscatedName("f.i")
    public String[] field531;

    @ObfuscatedName("f.t")
    public int field532;

    @ObfuscatedName("f.z")
    public int field540;

    @ObfuscatedName("f.g")
    public int field534;

    @ObfuscatedName("f.c")
    public int field528;

    @ObfuscatedName("j.k(II)Lf;")
    public static class19 method494(int arg0) {
        class19 var1 = (class19) field541.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field914.method2759(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1862 = var4.field1857.length - 12;
        int var5 = var4.method2120();
        var3.field532 = var4.method2117();
        var3.field540 = var4.method2117();
        var3.field534 = var4.method2117();
        var3.field528 = var4.method2117();
        var4.field1862 = 0;
        var4.method2177();
        var3.field529 = new int[var5];
        var3.field530 = new int[var5];
        var3.field531 = new String[var5];
        int var6 = 0;
        while (var4.field1862 < var4.field1857.length - 12) {
            int var7 = var4.method2117();
            if (var7 == 3) {
                var3.field531[var6] = var4.method2123();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field530[var6] = var4.method2115();
            } else {
                var3.field530[var6] = var4.method2120();
            }
            var3.field529[var6++] = var7;
        }
        field541.method3161(var3, (long) arg0);
        return var3;
    }
}
