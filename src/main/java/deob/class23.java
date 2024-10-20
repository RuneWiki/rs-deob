package deob;

@ObfuscatedName("f")
public class class23 extends class205 {

    @ObfuscatedName("f.s")
    public static class194 field590 = new class194(128);

    @ObfuscatedName("f.j")
    public int[] field585;

    @ObfuscatedName("f.p")
    public int[] field586;

    @ObfuscatedName("f.x")
    public String[] field587;

    @ObfuscatedName("f.d")
    public int field588;

    @ObfuscatedName("f.u")
    public int field589;

    @ObfuscatedName("f.o")
    public int field593;

    @ObfuscatedName("f.b")
    public int field591;

    @ObfuscatedName("o.s(II)Lf;")
    public static class23 method93(int arg0) {
        class23 var1 = (class23) field590.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field156.method3014(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class120 var4 = new class120(var2);
        var4.field2006 = var4.field2008.length - 12;
        int var5 = var4.method2343();
        var3.field588 = var4.method2430();
        var3.field589 = var4.method2430();
        var3.field593 = var4.method2430();
        var3.field591 = var4.method2430();
        var4.field2006 = 0;
        var4.method2385();
        var3.field585 = new int[var5];
        var3.field586 = new int[var5];
        var3.field587 = new String[var5];
        int var6 = 0;
        while (var4.field2006 < var4.field2008.length - 12) {
            int var7 = var4.method2430();
            if (var7 == 3) {
                var3.field587[var6] = var4.method2346();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field586[var6] = var4.method2338();
            } else {
                var3.field586[var6] = var4.method2343();
            }
            var3.field585[var6++] = var7;
        }
        field590.method3486(var3, (long) arg0);
        return var3;
    }
}
