package deob;

@ObfuscatedName("l")
public class class24 extends class208 {

    @ObfuscatedName("l.s")
    public static class197 field586 = new class197(128);

    @ObfuscatedName("l.z")
    public int[] field579;

    @ObfuscatedName("l.t")
    public int[] field581;

    @ObfuscatedName("l.y")
    public String[] field583;

    @ObfuscatedName("l.p")
    public int field582;

    @ObfuscatedName("l.g")
    public int field578;

    @ObfuscatedName("l.m")
    public int field580;

    @ObfuscatedName("l.f")
    public int field585;

    @ObfuscatedName("ck.s(II)Ll;")
    public static class24 method2053(int arg0) {
        class24 var1 = (class24) field586.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3047.method3091(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class24 var3 = new class24();
        class123 var4 = new class123(var2);
        var4.field2028 = var4.field2033.length - 12;
        int var5 = var4.method2408();
        var3.field582 = var4.method2550();
        var3.field578 = var4.method2550();
        var3.field580 = var4.method2550();
        var3.field585 = var4.method2550();
        var4.field2028 = 0;
        var4.method2370();
        var3.field579 = new int[var5];
        var3.field581 = new int[var5];
        var3.field583 = new String[var5];
        int var6 = 0;
        while (var4.field2028 < var4.field2033.length - 12) {
            int var7 = var4.method2550();
            if (var7 == 3) {
                var3.field583[var6] = var4.method2385();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field581[var6] = var4.method2363();
            } else {
                var3.field581[var6] = var4.method2408();
            }
            var3.field579[var6++] = var7;
        }
        field586.method3521(var3, (long) arg0);
        return var3;
    }
}
