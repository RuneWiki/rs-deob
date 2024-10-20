package deob;

@ObfuscatedName("gw")
public class class190 extends class130 {

    @ObfuscatedName("gw.m")
    public static class125 field2790 = new class125(64);

    @ObfuscatedName("gw.b")
    public boolean field2789 = false;

    @ObfuscatedName("ea.o(Lgl;I)V")
    public static void method2403(class183 arg0) {
        Statics.field2792 = arg0;
    }

    @ObfuscatedName("ay.m(II)Lgw;")
    public static class190 method703(int arg0) {
        class190 var1 = (class190) field2790.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2792.method3012(15, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3165(new class154(var2));
        }
        field2790.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.b(Lez;I)V")
    public void method3165(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3173(arg0, var2);
        }
    }

    @ObfuscatedName("gw.g(Lez;II)V")
    public void method3173(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2789 = true;
        }
    }
}
