package deob;

@ObfuscatedName("at")
public class class51 extends class205 {

    @ObfuscatedName("at.u")
    public static class194 field1111 = new class194(64);

    @ObfuscatedName("at.x")
    public int field1110 = 0;

    @ObfuscatedName("by.f(Lfl;I)V")
    public static void method1279(class168 arg0) {
        Statics.field3216 = arg0;
    }

    @ObfuscatedName("at.u(Ldj;I)V")
    public void method1037(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method1038(arg0, var2);
        }
    }

    @ObfuscatedName("at.x(Ldj;II)V")
    public void method1038(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1110 = arg0.method2387();
        }
    }
}
