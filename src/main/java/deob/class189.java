package deob;

@ObfuscatedName("gi")
public class class189 extends class130 {

    @ObfuscatedName("gi.e")
    public static class125 field2783 = new class125(64);

    @ObfuscatedName("gi.f")
    public boolean field2785 = false;

    @ObfuscatedName("k.i(Lgq;I)V")
    public static void method29(class183 arg0) {
        Statics.field2782 = arg0;
    }

    @ObfuscatedName("gi.e(Let;B)V")
    public void method3178(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3181(arg0, var2);
        }
    }

    @ObfuscatedName("gi.f(Let;IB)V")
    public void method3181(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2785 = true;
        }
    }
}
