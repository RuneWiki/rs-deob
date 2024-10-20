package deob;

@ObfuscatedName("fc")
public class class169 extends class405 {

    @ObfuscatedName("fc.v")
    public static class256 field1820 = new class256(64);

    @ObfuscatedName("fc.q")
    public int field1821 = 0;

    @ObfuscatedName("cf.c(Llh;I)V")
    public static void method2125(class315 arg0) {
        Statics.field1819 = arg0;
    }

    @ObfuscatedName("fc.q(Lqt;B)V")
    public void method3028(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3029(arg0, var2);
        }
    }

    @ObfuscatedName("fc.f(Lqt;II)V")
    public void method3029(class443 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1821 = arg0.method7049();
        }
    }
}
