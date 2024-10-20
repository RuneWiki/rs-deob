package deob;

@ObfuscatedName("k")
public class class24 extends class208 {

    @ObfuscatedName("k.x")
    public static class197 field593 = new class197(128);

    @ObfuscatedName("k.r")
    public int[] field592;

    @ObfuscatedName("k.j")
    public int[] field599;

    @ObfuscatedName("k.z")
    public String[] field595;

    @ObfuscatedName("k.i")
    public int field596;

    @ObfuscatedName("k.b")
    public int field597;

    @ObfuscatedName("k.l")
    public int field598;

    @ObfuscatedName("k.m")
    public int field601;

    @ObfuscatedName("q.x(IS)Lk;")
    public static class24 method146(int arg0) {
        class24 var1 = (class24) field593.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3050.method3079(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class24 var3 = new class24();
        class123 var4 = new class123(var2);
        var4.field2057 = var4.field2056.length - 12;
        int var5 = var4.method2413();
        var3.field596 = var4.method2403();
        var3.field597 = var4.method2403();
        var3.field598 = var4.method2403();
        var3.field601 = var4.method2403();
        var4.field2057 = 0;
        var4.method2415();
        var3.field592 = new int[var5];
        var3.field599 = new int[var5];
        var3.field595 = new String[var5];
        int var6 = 0;
        while (var4.field2057 < var4.field2056.length - 12) {
            int var7 = var4.method2403();
            if (var7 == 3) {
                var3.field595[var6] = var4.method2626();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field599[var6] = var4.method2408();
            } else {
                var3.field599[var6] = var4.method2413();
            }
            var3.field592[var6++] = var7;
        }
        field593.method3535(var3, (long) arg0);
        return var3;
    }
}
