package deob;

@ObfuscatedName("p")
public class class20 extends class195 {

    @ObfuscatedName("p.n")
    public static class184 field585 = new class184(128);

    @ObfuscatedName("p.g")
    public int[] field581;

    @ObfuscatedName("p.a")
    public int[] field582;

    @ObfuscatedName("p.m")
    public String[] field583;

    @ObfuscatedName("p.s")
    public int field589;

    @ObfuscatedName("p.j")
    public int field587;

    @ObfuscatedName("p.f")
    public int field586;

    @ObfuscatedName("p.b")
    public int field584;

    @ObfuscatedName("r.n(II)Lp;")
    public static class20 method160(int arg0) {
        class20 var1 = (class20) field585.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2954.method2929(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class20 var3 = new class20();
        class111 var4 = new class111(var2);
        var4.field1896 = var4.field1904.length - 12;
        int var5 = var4.method2366();
        var3.field589 = var4.method2395();
        var3.field587 = var4.method2395();
        var3.field586 = var4.method2395();
        var3.field584 = var4.method2395();
        var4.field1896 = 0;
        var4.method2222();
        var3.field581 = new int[var5];
        var3.field582 = new int[var5];
        var3.field583 = new String[var5];
        int var6 = 0;
        while (var4.field1896 < var4.field1904.length - 12) {
            int var7 = var4.method2395();
            if (var7 == 3) {
                var3.field583[var6] = var4.method2223();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field582[var6] = var4.method2211();
            } else {
                var3.field582[var6] = var4.method2366();
            }
            var3.field581[var6++] = var7;
        }
        field585.method3396(var3, (long) arg0);
        return var3;
    }
}
