package deob;

@ObfuscatedName("gn")
public class class187 extends class130 {

    @ObfuscatedName("gn.m")
    public static class125 field2778 = new class125(64);

    @ObfuscatedName("gn.b")
    public int field2779 = 0;

    @ObfuscatedName("fn.o(Lgl;B)V")
    public static void method2991(class183 arg0) {
        Statics.field2780 = arg0;
    }

    @ObfuscatedName("gn.m(Lez;S)V")
    public void method3135(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3137(arg0, var2);
        }
    }

    @ObfuscatedName("gn.b(Lez;II)V")
    public void method3137(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2779 = arg0.method2554();
        }
    }
}
