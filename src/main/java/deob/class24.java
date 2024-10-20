package deob;

@ObfuscatedName("d")
public class class24 extends class208 {

    @ObfuscatedName("d.k")
    public static class197 field596 = new class197(128);

    @ObfuscatedName("d.q")
    public int[] field598;

    @ObfuscatedName("d.f")
    public int[] field592;

    @ObfuscatedName("d.c")
    public String[] field593;

    @ObfuscatedName("d.v")
    public int field594;

    @ObfuscatedName("d.j")
    public int field590;

    @ObfuscatedName("d.m")
    public int field601;

    @ObfuscatedName("d.y")
    public int field597;

    @ObfuscatedName("ay.k(IB)Ld;")
    public static class24 method700(int arg0) {
        class24 var1 = (class24) field596.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field312.method3097(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class24 var3 = new class24();
        class123 var4 = new class123(var2);
        var4.field2060 = var4.field2054.length - 12;
        int var5 = var4.method2432();
        var3.field594 = var4.method2547();
        var3.field590 = var4.method2547();
        var3.field601 = var4.method2547();
        var3.field597 = var4.method2547();
        var4.field2060 = 0;
        var4.method2493();
        var3.field598 = new int[var5];
        var3.field592 = new int[var5];
        var3.field593 = new String[var5];
        int var6 = 0;
        while (var4.field2060 < var4.field2054.length - 12) {
            int var7 = var4.method2547();
            if (var7 == 3) {
                var3.field593[var6] = var4.method2435();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field592[var6] = var4.method2427();
            } else {
                var3.field592[var6] = var4.method2432();
            }
            var3.field598[var6++] = var7;
        }
        field596.method3537(var3, (long) arg0);
        return var3;
    }
}
