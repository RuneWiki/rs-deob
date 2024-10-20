package deob;

@ObfuscatedName("gr")
public class class192 extends class151 {

    @ObfuscatedName("gr.c")
    public static class146 field2796 = new class146(64);

    @ObfuscatedName("gr.n")
    public boolean field2797 = false;

    @ObfuscatedName("cl.d(Lgd;B)V")
    public static void method1813(class185 arg0) {
        Statics.field2798 = arg0;
    }

    @ObfuscatedName("gr.c(Ldu;I)V")
    public void method3252(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3256(arg0, var2);
        }
    }

    @ObfuscatedName("gr.n(Ldu;IS)V")
    public void method3256(class130 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2797 = true;
        }
    }
}
