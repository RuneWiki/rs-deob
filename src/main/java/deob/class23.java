package deob;

@ObfuscatedName("j")
public class class23 extends class204 {

    @ObfuscatedName("j.c")
    public static class193 field584 = new class193(128);

    @ObfuscatedName("j.h")
    public int[] field582;

    @ObfuscatedName("j.k")
    public int[] field594;

    @ObfuscatedName("j.t")
    public String[] field583;

    @ObfuscatedName("j.g")
    public int field581;

    @ObfuscatedName("j.o")
    public int field585;

    @ObfuscatedName("j.i")
    public int field586;

    @ObfuscatedName("j.w")
    public int field587;

    @ObfuscatedName("eh.c(IB)Lj;")
    public static class23 method2885(int arg0) {
        class23 var1 = (class23) field584.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1746.method2994(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1955 = var4.field1956.length - 12;
        int var5 = var4.method2296();
        var3.field581 = var4.method2293();
        var3.field585 = var4.method2293();
        var3.field586 = var4.method2293();
        var3.field587 = var4.method2293();
        var4.field1955 = 0;
        var4.method2298();
        var3.field582 = new int[var5];
        var3.field594 = new int[var5];
        var3.field583 = new String[var5];
        int var6 = 0;
        while (var4.field1955 < var4.field1956.length - 12) {
            int var7 = var4.method2293();
            if (var7 == 3) {
                var3.field583[var6] = var4.method2299();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field594[var6] = var4.method2291();
            } else {
                var3.field594[var6] = var4.method2296();
            }
            var3.field582[var6++] = var7;
        }
        field584.method3487(var3, (long) arg0);
        return var3;
    }
}
