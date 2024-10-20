package deob;

@ObfuscatedName("ao")
public class class46 extends class204 {

    @ObfuscatedName("ao.f")
    public static class193 field1032 = new class193(64);

    @ObfuscatedName("ao.i")
    public boolean field1034 = false;

    @ObfuscatedName("ap.o(Lfd;B)V")
    public static void method724(class167 arg0) {
        Statics.field1033 = arg0;
    }

    @ObfuscatedName("ao.f(Ldc;I)V")
    public void method897(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method899(arg0, var2);
        }
    }

    @ObfuscatedName("ao.i(Ldc;II)V")
    public void method899(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1034 = true;
        }
    }
}
