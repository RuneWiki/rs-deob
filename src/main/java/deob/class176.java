package deob;

@ObfuscatedName("fu")
public class class176 extends class425 {

    @ObfuscatedName("fu.f")
    public static class266 field1862 = new class266(64);

    @ObfuscatedName("fu.c")
    public int field1861 = 0;

    @ObfuscatedName("aq.a(Llg;I)V")
    public static void method711(class330 arg0) {
        Statics.field4302 = arg0;
    }

    @ObfuscatedName("bc.f(IB)Lfu;")
    public static class176 method1110(int arg0) {
        class176 var1 = (class176) field1862.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4302.method5859(5, arg0);
        class176 var3 = new class176();
        if (var2 != null) {
            var3.method3096(new class464(var2));
        }
        field1862.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fu.c(Lqr;S)V")
    public void method3096(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3097(arg0, var2);
        }
    }

    @ObfuscatedName("fu.x(Lqr;IB)V")
    public void method3097(class464 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1861 = arg0.method7716();
        }
    }
}
