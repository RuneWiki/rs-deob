package deob;

@ObfuscatedName("y")
public class class24 extends class208 {

    @ObfuscatedName("y.f")
    public static class197 field610 = new class197(128);

    @ObfuscatedName("y.e")
    public int[] field595;

    @ObfuscatedName("y.n")
    public int[] field594;

    @ObfuscatedName("y.t")
    public String[] field597;

    @ObfuscatedName("y.v")
    public int field598;

    @ObfuscatedName("y.b")
    public int field603;

    @ObfuscatedName("y.m")
    public int field600;

    @ObfuscatedName("y.k")
    public int field608;

    @ObfuscatedName("cn.f(II)Ly;")
    public static class24 method1609(int arg0) {
        class24 var1 = (class24) field610.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field532.method3107(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class24 var3 = new class24();
        class123 var4 = new class123(var2);
        var4.field2052 = var4.field2053.length - 12;
        int var5 = var4.method2404();
        var3.field598 = var4.method2401();
        var3.field603 = var4.method2401();
        var3.field600 = var4.method2401();
        var3.field608 = var4.method2401();
        var4.field2052 = 0;
        var4.method2406();
        var3.field595 = new int[var5];
        var3.field594 = new int[var5];
        var3.field597 = new String[var5];
        int var6 = 0;
        while (var4.field2052 < var4.field2053.length - 12) {
            int var7 = var4.method2401();
            if (var7 == 3) {
                var3.field597[var6] = var4.method2407();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field594[var6] = var4.method2522();
            } else {
                var3.field594[var6] = var4.method2404();
            }
            var3.field595[var6++] = var7;
        }
        field610.method3571(var3, (long) arg0);
        return var3;
    }
}
