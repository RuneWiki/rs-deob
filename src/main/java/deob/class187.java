package deob;

@ObfuscatedName("gr")
public class class187 extends class130 {

    @ObfuscatedName("gr.i")
    public static class125 field2785 = new class125(64);

    @ObfuscatedName("gr.u")
    public int field2786 = 0;

    @ObfuscatedName("ag.f(Lgb;I)V")
    public static void method641(class183 arg0) {
        Statics.field2784 = arg0;
    }

    @ObfuscatedName("g.i(IB)Lgr;")
    public static class187 method182(int arg0) {
        class187 var1 = (class187) field2785.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2784.method3163(5, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3254(new class154(var2));
        }
        field2785.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gr.u(Leo;S)V")
    public void method3254(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3250(arg0, var2);
        }
    }

    @ObfuscatedName("gr.r(Leo;II)V")
    public void method3250(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2786 = arg0.method2668();
        }
    }
}
