package deob;

@ObfuscatedName("u")
public class class23 extends class204 {

    @ObfuscatedName("u.i")
    public static class193 field597 = new class193(128);

    @ObfuscatedName("u.v")
    public int[] field591;

    @ObfuscatedName("u.f")
    public int[] field600;

    @ObfuscatedName("u.h")
    public String[] field593;

    @ObfuscatedName("u.a")
    public int field594;

    @ObfuscatedName("u.s")
    public int field595;

    @ObfuscatedName("u.p")
    public int field596;

    @ObfuscatedName("u.r")
    public int field590;

    @ObfuscatedName("cd.i(IS)Lu;")
    public static class23 method1718(int arg0) {
        class23 var1 = (class23) field597.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field894.method3080(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1984 = var4.field1988.length - 12;
        int var5 = var4.method2315();
        var3.field594 = var4.method2312();
        var3.field595 = var4.method2312();
        var3.field596 = var4.method2312();
        var3.field590 = var4.method2312();
        var4.field1984 = 0;
        var4.method2317();
        var3.field591 = new int[var5];
        var3.field600 = new int[var5];
        var3.field593 = new String[var5];
        int var6 = 0;
        while (var4.field1984 < var4.field1988.length - 12) {
            int var7 = var4.method2312();
            if (var7 == 3) {
                var3.field593[var6] = var4.method2318();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field600[var6] = var4.method2310();
            } else {
                var3.field600[var6] = var4.method2315();
            }
            var3.field591[var6++] = var7;
        }
        field597.method3466(var3, (long) arg0);
        return var3;
    }
}
