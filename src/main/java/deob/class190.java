package deob;

@ObfuscatedName("ga")
public class class190 extends class130 {

    @ObfuscatedName("ga.n")
    public static class125 field2789 = new class125(64);

    @ObfuscatedName("ga.g")
    public boolean field2788 = false;

    @ObfuscatedName("x.x(Lgo;B)V")
    public static void method14(class183 arg0) {
        Statics.field2794 = arg0;
    }

    @ObfuscatedName("ga.n(Leq;I)V")
    public void method3314(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3316(arg0, var2);
        }
    }

    @ObfuscatedName("ga.g(Leq;IB)V")
    public void method3316(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2788 = true;
        }
    }
}
