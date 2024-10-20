package deob;

@ObfuscatedName("aq")
public class class44 extends class183 {

    @ObfuscatedName("aq.i")
    public static class172 field1000 = new class172(64);

    @ObfuscatedName("aq.k")
    public int field1003 = 0;

    @ObfuscatedName("bh.g(Leo;I)V")
    public static void method1318(class147 arg0) {
        Statics.field1001 = arg0;
    }

    @ObfuscatedName("h.i(IB)Laq;")
    public static class44 method117(int arg0) {
        class44 var1 = (class44) field1000.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1001.method2734(5, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method817(new class107(var2));
        }
        field1000.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.k(Ldk;I)V")
    public void method817(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method810(arg0, var2);
        }
    }

    @ObfuscatedName("aq.e(Ldk;II)V")
    public void method810(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1003 = arg0.method2094();
        }
    }
}
