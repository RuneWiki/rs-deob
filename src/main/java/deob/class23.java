package deob;

@ObfuscatedName("y")
public class class23 extends class204 {

    @ObfuscatedName("y.f")
    public static class193 field610 = new class193(128);

    @ObfuscatedName("y.s")
    public int[] field599;

    @ObfuscatedName("y.q")
    public int[] field601;

    @ObfuscatedName("y.g")
    public String[] field602;

    @ObfuscatedName("y.m")
    public int field609;

    @ObfuscatedName("y.t")
    public int field600;

    @ObfuscatedName("y.j")
    public int field605;

    @ObfuscatedName("y.n")
    public int field606;

    @ObfuscatedName("ab.f(II)Ly;")
    public static class23 method624(int arg0) {
        class23 var1 = (class23) field610.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2052.method3038(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1994 = var4.field2000.length - 12;
        int var5 = var4.method2368();
        var3.field609 = var4.method2353();
        var3.field600 = var4.method2353();
        var3.field605 = var4.method2353();
        var3.field606 = var4.method2353();
        var4.field1994 = 0;
        var4.method2370();
        var3.field599 = new int[var5];
        var3.field601 = new int[var5];
        var3.field602 = new String[var5];
        int var6 = 0;
        while (var4.field1994 < var4.field2000.length - 12) {
            int var7 = var4.method2353();
            if (var7 == 3) {
                var3.field602[var6] = var4.method2365();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field601[var6] = var4.method2363();
            } else {
                var3.field601[var6] = var4.method2368();
            }
            var3.field599[var6++] = var7;
        }
        field610.method3508(var3, (long) arg0);
        return var3;
    }
}
