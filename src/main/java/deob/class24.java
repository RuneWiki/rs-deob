package deob;

@ObfuscatedName("y")
public class class24 extends class208 {

    @ObfuscatedName("y.l")
    public static class197 field612 = new class197(128);

    @ObfuscatedName("y.g")
    public int[] field608;

    @ObfuscatedName("y.r")
    public int[] field609;

    @ObfuscatedName("y.e")
    public String[] field610;

    @ObfuscatedName("y.h")
    public int field611;

    @ObfuscatedName("y.s")
    public int field607;

    @ObfuscatedName("y.k")
    public int field613;

    @ObfuscatedName("y.u")
    public int field614;

    @ObfuscatedName("q.l(II)Ly;")
    public static class24 method162(int arg0) {
        class24 var1 = (class24) field612.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field582.method3210(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class24 var3 = new class24();
        class123 var4 = new class123(var2);
        var4.field2051 = var4.field2052.length - 12;
        int var5 = var4.method2477();
        var3.field611 = var4.method2492();
        var3.field607 = var4.method2492();
        var3.field613 = var4.method2492();
        var3.field614 = var4.method2492();
        var4.field2051 = 0;
        var4.method2497();
        var3.field608 = new int[var5];
        var3.field609 = new int[var5];
        var3.field610 = new String[var5];
        int var6 = 0;
        while (var4.field2051 < var4.field2052.length - 12) {
            int var7 = var4.method2492();
            if (var7 == 3) {
                var3.field610[var6] = var4.method2520();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field609[var6] = var4.method2490();
            } else {
                var3.field609[var6] = var4.method2477();
            }
            var3.field608[var6++] = var7;
        }
        field612.method3655(var3, (long) arg0);
        return var3;
    }
}
