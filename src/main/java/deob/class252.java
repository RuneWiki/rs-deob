package deob;

@ObfuscatedName("it")
public class class252 extends class196 {

    @ObfuscatedName("it.h")
    public static class191 field3368 = new class191(64);

    @ObfuscatedName("it.f")
    public int field3367;

    @ObfuscatedName("it.p")
    public int field3370;

    @ObfuscatedName("it.x")
    public int field3369;

    @ObfuscatedName("it.j(Lfb;I)V")
    public void method4087(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4088(arg0, var2);
        }
    }

    @ObfuscatedName("it.h(Lfb;IB)V")
    public void method4088(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3367 = arg0.method3023();
            this.field3370 = arg0.method2903();
            this.field3369 = arg0.method2903();
        }
    }

    @ObfuscatedName("ca.f(I)V")
    public static void method1578() {
        field3368.method3259();
    }
}
