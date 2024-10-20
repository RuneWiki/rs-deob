package deob;

@ObfuscatedName("aq")
public class class44 extends class195 {

    @ObfuscatedName("aq.e")
    public static class184 field988 = new class184(64);

    @ObfuscatedName("aq.a")
    public int field989;

    @ObfuscatedName("aq.k")
    public int field991;

    @ObfuscatedName("aq.p")
    public int field998;

    @ObfuscatedName("i.b(Lfj;I)V")
    public static void method167(class158 arg0) {
        Statics.field1000 = arg0;
    }

    @ObfuscatedName("m.e(II)Laq;")
    public static class44 method110(int arg0) {
        class44 var1 = (class44) field988.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1000.method2819(14, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method830(new class111(var2));
        }
        field988.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.a(Ldj;I)V")
    public void method830(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method831(arg0, var2);
        }
    }

    @ObfuscatedName("aq.k(Ldj;II)V")
    public void method831(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field989 = arg0.method2129();
            this.field991 = arg0.method2127();
            this.field998 = arg0.method2127();
        }
    }

    @ObfuscatedName("fh.p(I)V")
    public static void method2996() {
        field988.method3258();
    }
}
