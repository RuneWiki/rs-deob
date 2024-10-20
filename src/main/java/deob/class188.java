package deob;

@ObfuscatedName("gr")
public class class188 extends class130 {

    @ObfuscatedName("gr.f")
    public static class125 field2778 = new class125(64);

    @ObfuscatedName("gr.k")
    public int field2779 = 0;

    @ObfuscatedName("al.i(II)Lgr;")
    public static class188 method740(int arg0) {
        class188 var1 = (class188) field2778.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2776.method3014(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3165(new class154(var2));
        }
        field2778.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gr.e(Let;I)V")
    public void method3165(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3167(arg0, var2);
        }
    }

    @ObfuscatedName("gr.f(Let;II)V")
    public void method3167(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2779 = arg0.method2575();
        }
    }

    @ObfuscatedName("e.k(I)V")
    public static void method17() {
        field2778.method2155();
    }
}
