package deob;

@ObfuscatedName("gp")
public class class189 extends class130 {

    @ObfuscatedName("gp.d")
    public static class125 field2787 = new class125(64);

    @ObfuscatedName("gp.h")
    public boolean field2789 = false;

    @ObfuscatedName("gp.q(Lel;I)V")
    public void method3259(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3265(arg0, var2);
        }
    }

    @ObfuscatedName("gp.d(Lel;IB)V")
    public void method3265(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2789 = true;
        }
    }
}
