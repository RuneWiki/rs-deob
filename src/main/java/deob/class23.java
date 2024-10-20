package deob;

@ObfuscatedName("r")
public class class23 extends class204 {

    @ObfuscatedName("r.v")
    public static class193 field597 = new class193(128);

    @ObfuscatedName("r.f")
    public int[] field593;

    @ObfuscatedName("r.i")
    public int[] field594;

    @ObfuscatedName("r.d")
    public String[] field595;

    @ObfuscatedName("r.o")
    public int field598;

    @ObfuscatedName("r.c")
    public int field592;

    @ObfuscatedName("r.p")
    public int field596;

    @ObfuscatedName("r.j")
    public int field599;

    @ObfuscatedName("dr.v(II)Lr;")
    public static class23 method2297(int arg0) {
        class23 var1 = (class23) field597.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2182.method3082(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class23 var3 = new class23();
        class119 var4 = new class119(var2);
        var4.field1984 = var4.field1988.length - 12;
        int var5 = var4.method2354();
        var3.field598 = var4.method2334();
        var3.field592 = var4.method2334();
        var3.field596 = var4.method2334();
        var3.field599 = var4.method2334();
        var4.field1984 = 0;
        var4.method2413();
        var3.field593 = new int[var5];
        var3.field594 = new int[var5];
        var3.field595 = new String[var5];
        int var6 = 0;
        while (var4.field1984 < var4.field1988.length - 12) {
            int var7 = var4.method2334();
            if (var7 == 3) {
                var3.field595[var6] = var4.method2357();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field594[var6] = var4.method2400();
            } else {
                var3.field594[var6] = var4.method2354();
            }
            var3.field593[var6++] = var7;
        }
        field597.method3502(var3, (long) arg0);
        return var3;
    }
}
