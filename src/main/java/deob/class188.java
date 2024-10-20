package deob;

@ObfuscatedName("ga")
public class class188 extends class130 {

    @ObfuscatedName("ga.b")
    public static class125 field2781 = new class125(64);

    @ObfuscatedName("ga.g")
    public int field2783 = 0;

    @ObfuscatedName("aj.o(Lgl;I)V")
    public static void method861(class183 arg0) {
        Statics.field2782 = arg0;
        Statics.field2058 = Statics.field2782.method3054(16);
    }

    @ObfuscatedName("fd.m(IB)Lga;")
    public static class188 method3000(int arg0) {
        class188 var1 = (class188) field2781.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2782.method3012(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3148(new class154(var2));
        }
        field2781.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ga.b(Lez;I)V")
    public void method3148(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3154(arg0, var2);
        }
    }

    @ObfuscatedName("ga.g(Lez;II)V")
    public void method3154(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2783 = arg0.method2554();
        }
    }
}
