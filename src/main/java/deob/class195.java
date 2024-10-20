package deob;

@ObfuscatedName("gr")
public class class195 extends class130 {

    @ObfuscatedName("gr.l")
    public static class125 field2851 = new class125(64);

    @ObfuscatedName("gr.i")
    public int field2850;

    @ObfuscatedName("gr.t")
    public int field2853;

    @ObfuscatedName("gr.k")
    public int field2855;

    @ObfuscatedName("gs.b(Lgj;I)V")
    public static void method3473(class183 arg0) {
        Statics.field2854 = arg0;
    }

    @ObfuscatedName("gr.l(Leg;I)V")
    public void method3412(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3418(arg0, var2);
        }
    }

    @ObfuscatedName("gr.i(Leg;IB)V")
    public void method3418(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2850 = arg0.method2801();
            this.field2853 = arg0.method2678();
            this.field2855 = arg0.method2678();
        }
    }
}
