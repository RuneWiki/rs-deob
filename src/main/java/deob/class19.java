package deob;

@ObfuscatedName("a")
public class class19 extends class187 {

    @ObfuscatedName("a.b")
    public static class176 field519 = new class176(128);

    @ObfuscatedName("a.e")
    public int[] field513;

    @ObfuscatedName("a.i")
    public int[] field514;

    @ObfuscatedName("a.k")
    public String[] field515;

    @ObfuscatedName("a.h")
    public int field516;

    @ObfuscatedName("a.p")
    public int field517;

    @ObfuscatedName("a.n")
    public int field518;

    @ObfuscatedName("a.o")
    public int field521;

    @ObfuscatedName("l.b(IS)La;")
    public static class19 method515(int arg0) {
        class19 var1 = (class19) field519.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2159.method2761(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class19 var3 = new class19();
        class110 var4 = new class110(var2);
        var4.field1855 = var4.field1862.length - 12;
        int var5 = var4.method2195();
        var3.field516 = var4.method2292();
        var3.field517 = var4.method2292();
        var3.field518 = var4.method2292();
        var3.field521 = var4.method2292();
        var4.field1855 = 0;
        var4.method2216();
        var3.field513 = new int[var5];
        var3.field514 = new int[var5];
        var3.field515 = new String[var5];
        int var6 = 0;
        while (var4.field1855 < var4.field1862.length - 12) {
            int var7 = var4.method2292();
            if (var7 == 3) {
                var3.field515[var6] = var4.method2150();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field514[var6] = var4.method2142();
            } else {
                var3.field514[var6] = var4.method2195();
            }
            var3.field513[var6++] = var7;
        }
        field519.method3220(var3, (long) arg0);
        return var3;
    }
}
