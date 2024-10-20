package deob;

@ObfuscatedName("l")
public class class24 extends class208 {

    @ObfuscatedName("l.a")
    public static class197 field609 = new class197(128);

    @ObfuscatedName("l.d")
    public int[] field604;

    @ObfuscatedName("l.v")
    public int[] field601;

    @ObfuscatedName("l.r")
    public String[] field602;

    @ObfuscatedName("l.z")
    public int field603;

    @ObfuscatedName("l.t")
    public int field606;

    @ObfuscatedName("l.n")
    public int field605;

    @ObfuscatedName("l.i")
    public int field599;

    @ObfuscatedName("a.a(II)Ll;")
    public static class24 method2(int arg0) {
        class24 var1 = (class24) field609.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3084.method3117(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class24 var3 = new class24();
        class123 var4 = new class123(var2);
        var4.field2071 = var4.field2076.length - 12;
        int var5 = var4.method2400();
        var3.field603 = var4.method2584();
        var3.field606 = var4.method2584();
        var3.field605 = var4.method2584();
        var3.field599 = var4.method2584();
        var4.field2071 = 0;
        var4.method2402();
        var3.field604 = new int[var5];
        var3.field601 = new int[var5];
        var3.field602 = new String[var5];
        int var6 = 0;
        while (var4.field2071 < var4.field2076.length - 12) {
            int var7 = var4.method2584();
            if (var7 == 3) {
                var3.field602[var6] = var4.method2397();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field601[var6] = var4.method2395();
            } else {
                var3.field601[var6] = var4.method2400();
            }
            var3.field604[var6++] = var7;
        }
        field609.method3546(var3, (long) arg0);
        return var3;
    }
}
