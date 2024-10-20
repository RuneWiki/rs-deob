package deob;

@ObfuscatedName("gq")
public class class195 extends class130 {

    @ObfuscatedName("gq.c")
    public static class125 field2853 = new class125(64);

    @ObfuscatedName("gq.f")
    public int field2854;

    @ObfuscatedName("gq.h")
    public int field2852;

    @ObfuscatedName("gq.a")
    public int field2856;

    @ObfuscatedName("f.s(Lgp;B)V")
    public static void method24(class183 arg0) {
        Statics.field2858 = arg0;
    }

    @ObfuscatedName("gq.f(Lea;B)V")
    public void method3236(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3226(arg0, var2);
        }
    }

    @ObfuscatedName("gq.g(Lea;II)V")
    public void method3226(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2854 = arg0.method2541();
            this.field2852 = arg0.method2545();
            this.field2856 = arg0.method2545();
        }
    }

    @ObfuscatedName("cb.k(I)V")
    public static void method1441() {
        field2853.method2124();
    }
}
