package deob;

@ObfuscatedName("am")
public class class177 extends class6 {

    @ObfuscatedName("am.k")
    public int field2658 = 0;

    @ObfuscatedName("am.h")
    public static class2 field2654 = new class2(64);

    @ObfuscatedName("am.b(Ldp;I)V")
    public void method3102(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method3104(arg0, var2);
        }
    }

    @ObfuscatedName("am.h(Ldp;II)V")
    public void method3104(class50 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2658 = arg0.method720();
        }
    }
}
