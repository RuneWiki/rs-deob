package deob;

@ObfuscatedName("jt")
public class class261 extends class215 {

    @ObfuscatedName("jt.q")
    public static class210 field3384 = new class210(64);

    @ObfuscatedName("jt.o")
    public int field3383 = 0;

    @ObfuscatedName("jt.b(Lgn;I)V")
    public void method4319(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4320(arg0, var2);
        }
    }

    @ObfuscatedName("jt.q(Lgn;II)V")
    public void method4320(class194 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3383 = arg0.method3249();
        }
    }
}
