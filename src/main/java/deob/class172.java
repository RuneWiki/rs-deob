package deob;

@ObfuscatedName("fg")
public class class172 extends class405 {

    @ObfuscatedName("fg.v")
    public static class256 field1854 = new class256(64);

    @ObfuscatedName("fg.q")
    public boolean field1853 = false;

    @ObfuscatedName("iz.c(Llh;B)V")
    public static void method4587(class315 arg0) {
        Statics.field1855 = arg0;
    }

    @ObfuscatedName("fg.v(Lqt;B)V")
    public void method3081(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3083(arg0, var2);
        }
    }

    @ObfuscatedName("fg.q(Lqt;II)V")
    public void method3083(class443 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1853 = true;
        }
    }
}
