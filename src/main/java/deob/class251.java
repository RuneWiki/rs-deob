package deob;

@ObfuscatedName("im")
public class class251 extends class195 {

    @ObfuscatedName("im.o")
    public static class190 field3356 = new class190(64);

    @ObfuscatedName("im.m")
    public int field3359;

    @ObfuscatedName("im.g")
    public int field3357;

    @ObfuscatedName("im.d")
    public int field3355;

    @ObfuscatedName("eg.e(Lin;I)V")
    public static void method2272(class236 arg0) {
        Statics.field3361 = arg0;
    }

    @ObfuscatedName("im.o(Lfw;B)V")
    public void method4049(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4051(arg0, var2);
        }
    }

    @ObfuscatedName("im.m(Lfw;II)V")
    public void method4051(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3359 = arg0.method2930();
            this.field3357 = arg0.method2891();
            this.field3355 = arg0.method2891();
        }
    }

    @ObfuscatedName("ht.g(I)V")
    public static void method3751() {
        field3356.method3247();
    }
}
