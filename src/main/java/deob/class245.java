package deob;

@ObfuscatedName("ia")
public class class245 extends class195 {

    @ObfuscatedName("ia.o")
    public static class190 field3293 = new class190(64);

    @ObfuscatedName("ia.m")
    public boolean field3294 = false;

    @ObfuscatedName("ia.e(Lfw;I)V")
    public void method3949(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method3950(arg0, var2);
        }
    }

    @ObfuscatedName("ia.o(Lfw;II)V")
    public void method3950(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3294 = true;
        }
    }
}
