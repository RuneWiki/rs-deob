package deob;

@ObfuscatedName("gz")
public class class190 extends class130 {

    @ObfuscatedName("gz.d")
    public static class125 field2788 = new class125(64);

    @ObfuscatedName("gz.m")
    public boolean field2787 = false;

    @ObfuscatedName("gz.n(Lfa;I)V")
    public void method3261(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3254(arg0, var2);
        }
    }

    @ObfuscatedName("gz.d(Lfa;IB)V")
    public void method3254(class161 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2787 = true;
        }
    }
}
