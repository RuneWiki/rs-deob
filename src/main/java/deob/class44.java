package deob;

@ObfuscatedName("az")
public class class44 extends class183 {

    @ObfuscatedName("az.y")
    public static class172 field988 = new class172(64);

    @ObfuscatedName("az.s")
    public int field985 = 0;

    @ObfuscatedName("ag.k(Lei;I)V")
    public static void method885(class147 arg0) {
        Statics.field2974 = arg0;
    }

    @ObfuscatedName("c.y(II)Laz;")
    public static class44 method115(int arg0) {
        class44 var1 = (class44) field988.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2974.method2729(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method814(new class107(var2));
        }
        field988.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.s(Ldy;I)V")
    public void method814(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("az.g(Ldy;IB)V")
    public void method816(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field985 = arg0.method2239();
        }
    }
}
