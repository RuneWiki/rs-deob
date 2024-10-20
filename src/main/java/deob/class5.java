package deob;

@ObfuscatedName("o")
public class class5 extends class174 {

    @ObfuscatedName("o.i")
    public static class170 field75 = new class170(128);

    @ObfuscatedName("o.v")
    public int[] field67;

    @ObfuscatedName("o.m")
    public int[] field68;

    @ObfuscatedName("o.j")
    public String[] field69;

    @ObfuscatedName("o.o")
    public int field74;

    @ObfuscatedName("o.l")
    public int field77;

    @ObfuscatedName("o.g")
    public int field72;

    @ObfuscatedName("o.w")
    public int field70;

    @ObfuscatedName("m.i(II)Lo;")
    public static class5 method22(int arg0) {
        class5 var1 = (class5) field75.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field413.method3032(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class5 var3 = new class5();
        class127 var4 = new class127(var2);
        var4.field2039 = var4.field2041.length - 12;
        int var5 = var4.method2668();
        var3.field74 = var4.method2493();
        var3.field77 = var4.method2493();
        var3.field72 = var4.method2493();
        var3.field70 = var4.method2493();
        var4.field2039 = 0;
        var4.method2497();
        var3.field67 = new int[var5];
        var3.field68 = new int[var5];
        var3.field69 = new String[var5];
        int var6 = 0;
        while (var4.field2039 < var4.field2041.length - 12) {
            int var7 = var4.method2493();
            if (var7 == 3) {
                var3.field69[var6] = var4.method2500();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field68[var6] = var4.method2491();
            } else {
                var3.field68[var6] = var4.method2668();
            }
            var3.field67[var6++] = var7;
        }
        field75.method3307(var3, (long) arg0);
        return var3;
    }
}
