package deob;

@ObfuscatedName("l")
public class class23 extends class204 {

    @ObfuscatedName("l.y")
    public static class193 field592 = new class193(128);

    @ObfuscatedName("l.d")
    public int[] field591;

    @ObfuscatedName("l.g")
    public int[] field599;

    @ObfuscatedName("l.w")
    public String[] field593;

    @ObfuscatedName("l.e")
    public int field594;

    @ObfuscatedName("l.c")
    public int field595;

    @ObfuscatedName("l.a")
    public int field596;

    @ObfuscatedName("l.q")
    public int field597;

    @ObfuscatedName("j.y(IB)Ll;")
    public static class23 method558(int arg0) {
        class23 var1 = (class23) field592.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2221.method3045(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1973 = var4.field1974.length - 12;
        int var5 = var4.method2331();
        var3.field594 = var4.method2525();
        var3.field595 = var4.method2525();
        var3.field596 = var4.method2525();
        var3.field597 = var4.method2525();
        var4.field1973 = 0;
        var4.method2448();
        var3.field591 = new int[var5];
        var3.field599 = new int[var5];
        var3.field593 = new String[var5];
        int var6 = 0;
        while (var4.field1973 < var4.field1974.length - 12) {
            int var7 = var4.method2525();
            if (var7 == 3) {
                var3.field593[var6] = var4.method2334();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field599[var6] = var4.method2326();
            } else {
                var3.field599[var6] = var4.method2331();
            }
            var3.field591[var6++] = var7;
        }
        field592.method3427(var3, (long) arg0);
        return var3;
    }
}
