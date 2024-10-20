package deob;

@ObfuscatedName("z")
public class class23 extends class204 {

    @ObfuscatedName("z.h")
    public static class193 field610 = new class193(128);

    @ObfuscatedName("z.q")
    public int[] field608;

    @ObfuscatedName("z.v")
    public int[] field609;

    @ObfuscatedName("z.n")
    public String[] field612;

    @ObfuscatedName("z.f")
    public int field611;

    @ObfuscatedName("z.g")
    public int field613;

    @ObfuscatedName("z.o")
    public int field616;

    @ObfuscatedName("z.s")
    public int field615;

    @ObfuscatedName("fm.h(II)Lz;")
    public static class23 method3068(int arg0) {
        class23 var1 = (class23) field610.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field219.method3073(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1973 = var4.field1978.length - 12;
        int var5 = var4.method2388();
        var3.field611 = var4.method2385();
        var3.field613 = var4.method2385();
        var3.field616 = var4.method2385();
        var3.field615 = var4.method2385();
        var4.field1973 = 0;
        var4.method2471();
        var3.field608 = new int[var5];
        var3.field609 = new int[var5];
        var3.field612 = new String[var5];
        int var6 = 0;
        while (var4.field1973 < var4.field1978.length - 12) {
            int var7 = var4.method2385();
            if (var7 == 3) {
                var3.field612[var6] = var4.method2391();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field609[var6] = var4.method2383();
            } else {
                var3.field609[var6] = var4.method2388();
            }
            var3.field608[var6++] = var7;
        }
        field610.method3540(var3, (long) arg0);
        return var3;
    }
}
