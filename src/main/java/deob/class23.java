package deob;

@ObfuscatedName("m")
public class class23 extends class205 {

    @ObfuscatedName("m.b")
    public static class194 field595 = new class194(128);

    @ObfuscatedName("m.g")
    public int[] field598;

    @ObfuscatedName("m.j")
    public int[] field591;

    @ObfuscatedName("m.d")
    public String[] field592;

    @ObfuscatedName("m.x")
    public int field593;

    @ObfuscatedName("m.y")
    public int field594;

    @ObfuscatedName("m.r")
    public int field589;

    @ObfuscatedName("m.c")
    public int field596;

    @ObfuscatedName("i.b(IS)Lm;")
    public static class23 method589(int arg0) {
        class23 var1 = (class23) field595.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2736.method3037(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class120 var4 = new class120(var2);
        var4.field1977 = var4.field1983.length - 12;
        int var5 = var4.method2349();
        var3.field593 = var4.method2346();
        var3.field594 = var4.method2346();
        var3.field589 = var4.method2346();
        var3.field596 = var4.method2346();
        var4.field1977 = 0;
        var4.method2351();
        var3.field598 = new int[var5];
        var3.field591 = new int[var5];
        var3.field592 = new String[var5];
        int var6 = 0;
        while (var4.field1977 < var4.field1983.length - 12) {
            int var7 = var4.method2346();
            if (var7 == 3) {
                var3.field592[var6] = var4.method2352();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field591[var6] = var4.method2344();
            } else {
                var3.field591[var6] = var4.method2349();
            }
            var3.field598[var6++] = var7;
        }
        field595.method3490(var3, (long) arg0);
        return var3;
    }
}
