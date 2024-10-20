package deob;

@ObfuscatedName("ib")
public class class244 extends class195 {

    @ObfuscatedName("ib.o")
    public static class190 field3289 = new class190(64);

    @ObfuscatedName("ib.m")
    public boolean field3290 = false;

    @ObfuscatedName("ib.e(Lfw;I)V")
    public void method3938(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method3940(arg0, var2);
        }
    }

    @ObfuscatedName("ib.o(Lfw;II)V")
    public void method3940(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3290 = true;
        }
    }
}
