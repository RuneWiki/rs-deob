package deob;

@ObfuscatedName("af")
public class class38 extends class174 {

    @ObfuscatedName("af.x")
    public static class170 field972 = new class170(64);

    @ObfuscatedName("af.e")
    public int field974;

    @ObfuscatedName("af.r")
    public int field973;

    @ObfuscatedName("af.p")
    public int field970;

    @ObfuscatedName("ez.a(II)Laf;")
    public static class38 method2642(int arg0) {
        class38 var1 = (class38) field972.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field971.method2961(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method823(new class127(var2));
        }
        field972.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.x(Ldy;I)V")
    public void method823(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method813(arg0, var2);
        }
    }

    @ObfuscatedName("af.e(Ldy;IB)V")
    public void method813(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field974 = arg0.method2413();
            this.field973 = arg0.method2411();
            this.field970 = arg0.method2411();
        }
    }
}
