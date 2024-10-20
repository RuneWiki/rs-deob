package deob;

@ObfuscatedName("m")
public class class23 extends class204 {

    @ObfuscatedName("m.o")
    public static class193 field587 = new class193(128);

    @ObfuscatedName("m.e")
    public int[] field581;

    @ObfuscatedName("m.u")
    public int[] field597;

    @ObfuscatedName("m.b")
    public String[] field583;

    @ObfuscatedName("m.p")
    public int field585;

    @ObfuscatedName("m.s")
    public int field582;

    @ObfuscatedName("m.y")
    public int field586;

    @ObfuscatedName("m.t")
    public int field593;

    @ObfuscatedName("s.o(II)Lm;")
    public static class23 method68(int arg0) {
        class23 var1 = (class23) field587.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2022.method3057(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1974 = var4.field1977.length - 12;
        int var5 = var4.method2342();
        var3.field585 = var4.method2339();
        var3.field582 = var4.method2339();
        var3.field586 = var4.method2339();
        var3.field593 = var4.method2339();
        var4.field1974 = 0;
        var4.method2383();
        var3.field581 = new int[var5];
        var3.field597 = new int[var5];
        var3.field583 = new String[var5];
        int var6 = 0;
        while (var4.field1974 < var4.field1977.length - 12) {
            int var7 = var4.method2339();
            if (var7 == 3) {
                var3.field583[var6] = var4.method2528();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field597[var6] = var4.method2427();
            } else {
                var3.field597[var6] = var4.method2342();
            }
            var3.field581[var6++] = var7;
        }
        field587.method3512(var3, (long) arg0);
        return var3;
    }
}
