package deob;

@ObfuscatedName("c")
public class class23 extends class204 {

    @ObfuscatedName("c.j")
    public static class193 field591 = new class193(128);

    @ObfuscatedName("c.l")
    public int[] field589;

    @ObfuscatedName("c.a")
    public int[] field590;

    @ObfuscatedName("c.i")
    public String[] field595;

    @ObfuscatedName("c.f")
    public int field592;

    @ObfuscatedName("c.m")
    public int field588;

    @ObfuscatedName("c.o")
    public int field593;

    @ObfuscatedName("c.h")
    public int field602;

    @ObfuscatedName("c.j(IB)Lc;")
    public static class23 method577(int arg0) {
        class23 var1 = (class23) field591.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2650.method3005(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1999 = var4.field1996.length - 12;
        int var5 = var4.method2321();
        var3.field592 = var4.method2318();
        var3.field588 = var4.method2318();
        var3.field593 = var4.method2318();
        var3.field602 = var4.method2318();
        var4.field1999 = 0;
        var4.method2323();
        var3.field589 = new int[var5];
        var3.field590 = new int[var5];
        var3.field595 = new String[var5];
        int var6 = 0;
        while (var4.field1999 < var4.field1996.length - 12) {
            int var7 = var4.method2318();
            if (var7 == 3) {
                var3.field595[var6] = var4.method2324();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field590[var6] = var4.method2316();
            } else {
                var3.field590[var6] = var4.method2321();
            }
            var3.field589[var6++] = var7;
        }
        field591.method3468(var3, (long) arg0);
        return var3;
    }
}
