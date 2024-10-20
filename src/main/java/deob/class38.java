package deob;

@ObfuscatedName("ay")
public class class38 extends class174 {

    @ObfuscatedName("ay.e")
    public static class170 field936 = new class170(64);

    @ObfuscatedName("ay.g")
    public int field935;

    @ObfuscatedName("ay.o")
    public int field938;

    @ObfuscatedName("ay.a")
    public int field939;

    @ObfuscatedName("ay.b(Ldv;I)V")
    public void method793(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method794(arg0, var2);
        }
    }

    @ObfuscatedName("ay.e(Ldv;IB)V")
    public void method794(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field935 = arg0.method2572();
            this.field938 = arg0.method2436();
            this.field939 = arg0.method2436();
        }
    }
}
