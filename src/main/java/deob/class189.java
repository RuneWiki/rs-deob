package deob;

@ObfuscatedName("ge")
public class class189 extends class130 {

    @ObfuscatedName("ge.g")
    public static class125 field2778 = new class125(64);

    @ObfuscatedName("ge.x")
    public boolean field2780 = false;

    @ObfuscatedName("dt.p(Lgp;I)V")
    public static void method2114(class183 arg0) {
        Statics.field2779 = arg0;
    }

    @ObfuscatedName("ge.g(Lev;I)V")
    public void method3185(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3184(arg0, var2);
        }
    }

    @ObfuscatedName("ge.x(Lev;II)V")
    public void method3184(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2780 = true;
        }
    }
}
