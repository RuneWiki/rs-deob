package deob;

@ObfuscatedName("gi")
public class class188 extends class130 {

    @ObfuscatedName("gi.f")
    public static class125 field2781 = new class125(64);

    @ObfuscatedName("gi.h")
    public int field2779 = 0;

    @ObfuscatedName("gi.s(Lea;I)V")
    public void method3131(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3132(arg0, var2);
        }
    }

    @ObfuscatedName("gi.c(Lea;II)V")
    public void method3132(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2779 = arg0.method2541();
        }
    }

    @ObfuscatedName("ea.f(I)V")
    public static void method2742() {
        field2781.method2124();
    }
}
