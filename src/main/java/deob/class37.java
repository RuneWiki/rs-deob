package deob;

@ObfuscatedName("al")
public class class37 extends class173 {

    @ObfuscatedName("al.j")
    public static class169 field951 = new class169(64);

    @ObfuscatedName("al.w")
    public int field957;

    @ObfuscatedName("al.h")
    public int field953;

    @ObfuscatedName("al.v")
    public int field954;

    @ObfuscatedName("al.p(Ldv;I)V")
    public void method784(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method773(arg0, var2);
        }
    }

    @ObfuscatedName("al.j(Ldv;IB)V")
    public void method773(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field957 = arg0.method2489();
            this.field953 = arg0.method2544();
            this.field954 = arg0.method2544();
        }
    }

    @ObfuscatedName("cd.w(I)V")
    public static void method1645() {
        field951.method3217();
    }
}
