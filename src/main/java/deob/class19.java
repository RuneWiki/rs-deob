package deob;

@ObfuscatedName("y")
public class class19 extends class182 {

    @ObfuscatedName("y.t")
    public static class171 field520 = new class171(128);

    @ObfuscatedName("y.s")
    public int[] field515;

    @ObfuscatedName("y.f")
    public int[] field519;

    @ObfuscatedName("y.e")
    public String[] field518;

    @ObfuscatedName("y.d")
    public int field517;

    @ObfuscatedName("y.n")
    public int field527;

    @ObfuscatedName("y.v")
    public int field521;

    @ObfuscatedName("y.z")
    public int field522;

    @ObfuscatedName("f.t(IS)Ly;")
    public static class19 method15(int arg0) {
        class19 var1 = (class19) field520.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field175.method2709(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class107 var4 = new class107(var2);
        var4.field1830 = var4.field1831.length - 12;
        int var5 = var4.method2106();
        var3.field517 = var4.method2103();
        var3.field527 = var4.method2103();
        var3.field521 = var4.method2103();
        var3.field522 = var4.method2103();
        var4.field1830 = 0;
        var4.method2265();
        var3.field515 = new int[var5];
        var3.field519 = new int[var5];
        var3.field518 = new String[var5];
        int var6 = 0;
        while (var4.field1830 < var4.field1831.length - 12) {
            int var7 = var4.method2103();
            if (var7 == 3) {
                var3.field518[var6] = var4.method2109();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field519[var6] = var4.method2101();
            } else {
                var3.field519[var6] = var4.method2106();
            }
            var3.field515[var6++] = var7;
        }
        field520.method3168(var3, (long) arg0);
        return var3;
    }
}
