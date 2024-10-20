package deob;

@ObfuscatedName("d")
public class class23 extends class204 {

    @ObfuscatedName("d.j")
    public static class193 field578 = new class193(128);

    @ObfuscatedName("d.m")
    public int[] field579;

    @ObfuscatedName("d.f")
    public int[] field577;

    @ObfuscatedName("d.l")
    public String[] field575;

    @ObfuscatedName("d.u")
    public int field584;

    @ObfuscatedName("d.a")
    public int field580;

    @ObfuscatedName("d.h")
    public int field581;

    @ObfuscatedName("d.i")
    public int field582;

    @ObfuscatedName("et.j(II)Ld;")
    public static class23 method2800(int arg0) {
        class23 var1 = (class23) field578.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field91.method3124(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1982 = var4.field1981.length - 12;
        int var5 = var4.method2377();
        var3.field584 = var4.method2374();
        var3.field580 = var4.method2374();
        var3.field581 = var4.method2374();
        var3.field582 = var4.method2374();
        var4.field1982 = 0;
        var4.method2379();
        var3.field579 = new int[var5];
        var3.field577 = new int[var5];
        var3.field575 = new String[var5];
        int var6 = 0;
        while (var4.field1982 < var4.field1981.length - 12) {
            int var7 = var4.method2374();
            if (var7 == 3) {
                var3.field575[var6] = var4.method2380();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field577[var6] = var4.method2372();
            } else {
                var3.field577[var6] = var4.method2377();
            }
            var3.field579[var6++] = var7;
        }
        field578.method3540(var3, (long) arg0);
        return var3;
    }
}
