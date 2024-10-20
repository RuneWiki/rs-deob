package deob;

@ObfuscatedName("n")
public class class23 extends class204 {

    @ObfuscatedName("n.h")
    public static class193 field592 = new class193(128);

    @ObfuscatedName("n.m")
    public int[] field593;

    @ObfuscatedName("n.i")
    public int[] field600;

    @ObfuscatedName("n.q")
    public String[] field598;

    @ObfuscatedName("n.p")
    public int field595;

    @ObfuscatedName("n.c")
    public int field596;

    @ObfuscatedName("n.f")
    public int field597;

    @ObfuscatedName("n.y")
    public int field594;

    @ObfuscatedName("eq.h(IS)Ln;")
    public static class23 method2911(int arg0) {
        class23 var1 = (class23) field592.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field798.method3051(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1988 = var4.field1989.length - 12;
        int var5 = var4.method2324();
        var3.field595 = var4.method2322();
        var3.field596 = var4.method2322();
        var3.field597 = var4.method2322();
        var3.field594 = var4.method2322();
        var4.field1988 = 0;
        var4.method2453();
        var3.field593 = new int[var5];
        var3.field600 = new int[var5];
        var3.field598 = new String[var5];
        int var6 = 0;
        while (var4.field1988 < var4.field1989.length - 12) {
            int var7 = var4.method2322();
            if (var7 == 3) {
                var3.field598[var6] = var4.method2350();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field600[var6] = var4.method2320();
            } else {
                var3.field600[var6] = var4.method2324();
            }
            var3.field593[var6++] = var7;
        }
        field592.method3474(var3, (long) arg0);
        return var3;
    }
}
