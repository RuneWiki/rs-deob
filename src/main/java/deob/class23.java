package deob;

@ObfuscatedName("v")
public class class23 extends class204 {

    @ObfuscatedName("v.k")
    public static class193 field586 = new class193(128);

    @ObfuscatedName("v.h")
    public int[] field581;

    @ObfuscatedName("v.o")
    public int[] field582;

    @ObfuscatedName("v.z")
    public String[] field588;

    @ObfuscatedName("v.c")
    public int field583;

    @ObfuscatedName("v.d")
    public int field587;

    @ObfuscatedName("v.l")
    public int field584;

    @ObfuscatedName("v.b")
    public int field580;

    @ObfuscatedName("ez.k(IB)Lv;")
    public static class23 method2957(int arg0) {
        class23 var1 = (class23) field586.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field138.method3118(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1949 = var4.field1960.length - 12;
        int var5 = var4.method2415();
        var3.field583 = var4.method2332();
        var3.field587 = var4.method2332();
        var3.field584 = var4.method2332();
        var3.field580 = var4.method2332();
        var4.field1949 = 0;
        var4.method2494();
        var3.field581 = new int[var5];
        var3.field582 = new int[var5];
        var3.field588 = new String[var5];
        int var6 = 0;
        while (var4.field1949 < var4.field1960.length - 12) {
            int var7 = var4.method2332();
            if (var7 == 3) {
                var3.field588[var6] = var4.method2337();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field582[var6] = var4.method2330();
            } else {
                var3.field582[var6] = var4.method2415();
            }
            var3.field581[var6++] = var7;
        }
        field586.method3512(var3, (long) arg0);
        return var3;
    }
}
