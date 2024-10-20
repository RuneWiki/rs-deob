package deob;

@ObfuscatedName("k")
public class class23 extends class204 {

    @ObfuscatedName("k.n")
    public static class193 field605 = new class193(128);

    @ObfuscatedName("k.q")
    public int[] field594;

    @ObfuscatedName("k.c")
    public int[] field595;

    @ObfuscatedName("k.l")
    public String[] field604;

    @ObfuscatedName("k.r")
    public int field597;

    @ObfuscatedName("k.u")
    public int field598;

    @ObfuscatedName("k.j")
    public int field599;

    @ObfuscatedName("k.w")
    public int field600;

    @ObfuscatedName("ci.n(II)Lk;")
    public static class23 method2043(int arg0) {
        class23 var1 = (class23) field605.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field779.method3094(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1982 = var4.field1987.length - 12;
        int var5 = var4.method2365();
        var3.field597 = var4.method2430();
        var3.field598 = var4.method2430();
        var3.field599 = var4.method2430();
        var3.field600 = var4.method2430();
        var4.field1982 = 0;
        var4.method2367();
        var3.field594 = new int[var5];
        var3.field595 = new int[var5];
        var3.field604 = new String[var5];
        int var6 = 0;
        while (var4.field1982 < var4.field1987.length - 12) {
            int var7 = var4.method2430();
            if (var7 == 3) {
                var3.field604[var6] = var4.method2368();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field595[var6] = var4.method2360();
            } else {
                var3.field595[var6] = var4.method2365();
            }
            var3.field594[var6++] = var7;
        }
        field605.method3488(var3, (long) arg0);
        return var3;
    }
}
