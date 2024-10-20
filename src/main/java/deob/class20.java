package deob;

@ObfuscatedName("t")
public class class20 extends class185 {

    @ObfuscatedName("t.x")
    public static class174 field537 = new class174(128);

    @ObfuscatedName("t.v")
    public int[] field525;

    @ObfuscatedName("t.m")
    public int[] field534;

    @ObfuscatedName("t.e")
    public String[] field524;

    @ObfuscatedName("t.h")
    public int field528;

    @ObfuscatedName("t.p")
    public int field529;

    @ObfuscatedName("t.j")
    public int field530;

    @ObfuscatedName("t.i")
    public int field531;

    @ObfuscatedName("ce.x(II)Lt;")
    public static class20 method1888(int arg0) {
        class20 var1 = (class20) field537.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1991.method2751(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class108 var4 = new class108(var2);
        var4.field1841 = var4.field1839.length - 12;
        int var5 = var4.method2132();
        var3.field528 = var4.method2129();
        var3.field529 = var4.method2129();
        var3.field530 = var4.method2129();
        var3.field531 = var4.method2129();
        var4.field1841 = 0;
        var4.method2196();
        var3.field525 = new int[var5];
        var3.field534 = new int[var5];
        var3.field524 = new String[var5];
        int var6 = 0;
        while (var4.field1841 < var4.field1839.length - 12) {
            int var7 = var4.method2129();
            if (var7 == 3) {
                var3.field524[var6] = var4.method2270();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field534[var6] = var4.method2299();
            } else {
                var3.field534[var6] = var4.method2132();
            }
            var3.field525[var6++] = var7;
        }
        field537.method3183(var3, (long) arg0);
        return var3;
    }
}
