package deob;

@ObfuscatedName("ez")
public class class151 extends class142 {

    @ObfuscatedName("ez.r")
    public static class100 field2259 = new class100(128);

    @ObfuscatedName("ez.l")
    public int[] field2257;

    @ObfuscatedName("ez.i")
    public int[] field2264;

    @ObfuscatedName("ez.e")
    public String[] field2260;

    @ObfuscatedName("ez.a")
    public int field2261;

    @ObfuscatedName("ez.g")
    public int field2262;

    @ObfuscatedName("ez.w")
    public int field2263;

    @ObfuscatedName("ez.v")
    public int field2258;

    @ObfuscatedName("cm.i(II)Lez;")
    public static class151 method1009(int arg0) {
        class151 var1 = (class151) field2259.method1231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1621.method1015(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class151 var3 = new class151();
        class135 var4 = new class135(var2);
        var4.field1722 = var4.field1723.length - 12;
        int var5 = var4.method1616();
        var3.field2261 = var4.method1725();
        var3.field2262 = var4.method1725();
        var3.field2263 = var4.method1725();
        var3.field2258 = var4.method1725();
        var4.field1722 = 0;
        var4.method1578();
        var3.field2257 = new int[var5];
        var3.field2264 = new int[var5];
        var3.field2260 = new String[var5];
        int var6 = 0;
        while (var4.field1722 < var4.field1723.length - 12) {
            int var7 = var4.method1725();
            if (var7 == 3) {
                var3.field2260[var6] = var4.method1716();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field2264[var6] = var4.method1571();
            } else {
                var3.field2264[var6] = var4.method1616();
            }
            var3.field2257[var6++] = var7;
        }
        field2259.method1232(var3, (long) arg0);
        return var3;
    }
}
