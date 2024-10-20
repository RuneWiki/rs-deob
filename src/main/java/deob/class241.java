package deob;

@ObfuscatedName("ie")
public class class241 extends class195 {

    @ObfuscatedName("ie.o")
    public static class190 field3254 = new class190(64);

    @ObfuscatedName("ie.m")
    public int field3255 = 0;

    @ObfuscatedName("p.e(Lin;B)V")
    public static void method117(class236 arg0) {
        Statics.field3257 = arg0;
    }

    @ObfuscatedName("ie.o(Lfw;I)V")
    public void method3895(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method3897(arg0, var2);
        }
    }

    @ObfuscatedName("ie.m(Lfw;II)V")
    public void method3897(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3255 = arg0.method2930();
        }
    }
}
