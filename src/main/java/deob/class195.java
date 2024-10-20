package deob;

@ObfuscatedName("go")
public class class195 extends class130 {

    @ObfuscatedName("go.m")
    public static class125 field2848 = new class125(64);

    @ObfuscatedName("go.b")
    public int field2851;

    @ObfuscatedName("go.g")
    public int field2850;

    @ObfuscatedName("go.h")
    public int field2847;

    @ObfuscatedName("fh.o(Lgl;S)V")
    public static void method2811(class183 arg0) {
        Statics.field2852 = arg0;
    }

    @ObfuscatedName("go.m(Lez;B)V")
    public void method3253(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3254(arg0, var2);
        }
    }

    @ObfuscatedName("go.b(Lez;IS)V")
    public void method3254(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2851 = arg0.method2554();
            this.field2850 = arg0.method2552();
            this.field2847 = arg0.method2552();
        }
    }

    @ObfuscatedName("fs.g(I)V")
    public static void method3004() {
        field2848.method2139();
    }
}
