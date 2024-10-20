package deob;

@ObfuscatedName("n")
public class class23 extends class204 {

    @ObfuscatedName("n.o")
    public static class193 field608 = new class193(128);

    @ObfuscatedName("n.f")
    public int[] field600;

    @ObfuscatedName("n.i")
    public int[] field609;

    @ObfuscatedName("n.h")
    public String[] field603;

    @ObfuscatedName("n.q")
    public int field604;

    @ObfuscatedName("n.u")
    public int field605;

    @ObfuscatedName("n.m")
    public int field606;

    @ObfuscatedName("n.y")
    public int field607;

    @ObfuscatedName("z.o(II)Ln;")
    public static class23 method176(int arg0) {
        class23 var1 = (class23) field608.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1010.method3030(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1984 = var4.field1989.length - 12;
        int var5 = var4.method2295();
        var3.field604 = var4.method2292();
        var3.field605 = var4.method2292();
        var3.field606 = var4.method2292();
        var3.field607 = var4.method2292();
        var4.field1984 = 0;
        var4.method2297();
        var3.field600 = new int[var5];
        var3.field609 = new int[var5];
        var3.field603 = new String[var5];
        int var6 = 0;
        while (var4.field1984 < var4.field1989.length - 12) {
            int var7 = var4.method2292();
            if (var7 == 3) {
                var3.field603[var6] = var4.method2344();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field609[var6] = var4.method2290();
            } else {
                var3.field609[var6] = var4.method2295();
            }
            var3.field600[var6++] = var7;
        }
        field608.method3451(var3, (long) arg0);
        return var3;
    }
}
