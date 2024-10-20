package deob;

@ObfuscatedName("az")
public class class49 extends class130 {

    @ObfuscatedName("az.f")
    public static class125 field969 = new class125(128);

    @ObfuscatedName("az.i")
    public int[] field966;

    @ObfuscatedName("az.u")
    public int[] field963;

    @ObfuscatedName("az.h")
    public String[] field964;

    @ObfuscatedName("az.r")
    public int field965;

    @ObfuscatedName("az.o")
    public int field961;

    @ObfuscatedName("az.l")
    public int field967;

    @ObfuscatedName("az.n")
    public int field968;

    @ObfuscatedName("aq.f(II)Laz;")
    public static class49 method590(int arg0) {
        class49 var1 = (class49) field969.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field878.method3163(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2111 = var4.field2114.length - 12;
        int var5 = var4.method2695();
        var3.field965 = var4.method2668();
        var3.field961 = var4.method2668();
        var3.field967 = var4.method2668();
        var3.field968 = var4.method2668();
        var4.field2111 = 0;
        var4.method2721();
        var3.field966 = new int[var5];
        var3.field963 = new int[var5];
        var3.field964 = new String[var5];
        int var6 = 0;
        while (var4.field2111 < var4.field2114.length - 12) {
            int var7 = var4.method2668();
            if (var7 == 3) {
                var3.field964[var6] = var4.method2674();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field963[var6] = var4.method2666();
            } else {
                var3.field963[var6] = var4.method2695();
            }
            var3.field966[var6++] = var7;
        }
        field969.method2246(var3, (long) arg0);
        return var3;
    }
}
