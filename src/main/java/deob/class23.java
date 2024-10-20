package deob;

@ObfuscatedName("t")
public class class23 extends class205 {

    @ObfuscatedName("t.e")
    public static class194 field583 = new class194(128);

    @ObfuscatedName("t.w")
    public int[] field579;

    @ObfuscatedName("t.f")
    public int[] field580;

    @ObfuscatedName("t.s")
    public String[] field586;

    @ObfuscatedName("t.p")
    public int field582;

    @ObfuscatedName("t.h")
    public int field581;

    @ObfuscatedName("t.g")
    public int field584;

    @ObfuscatedName("t.a")
    public int field585;

    @ObfuscatedName("b.e(II)Lt;")
    public static class23 method215(int arg0) {
        class23 var1 = (class23) field583.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1190.method3048(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class120 var4 = new class120(var2);
        var4.field1977 = var4.field1981.length - 12;
        int var5 = var4.method2360();
        var3.field582 = var4.method2532();
        var3.field581 = var4.method2532();
        var3.field584 = var4.method2532();
        var3.field585 = var4.method2532();
        var4.field1977 = 0;
        var4.method2362();
        var3.field579 = new int[var5];
        var3.field580 = new int[var5];
        var3.field586 = new String[var5];
        int var6 = 0;
        while (var4.field1977 < var4.field1981.length - 12) {
            int var7 = var4.method2532();
            if (var7 == 3) {
                var3.field586[var6] = var4.method2363();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field580[var6] = var4.method2355();
            } else {
                var3.field580[var6] = var4.method2360();
            }
            var3.field579[var6++] = var7;
        }
        field583.method3475(var3, (long) arg0);
        return var3;
    }
}
