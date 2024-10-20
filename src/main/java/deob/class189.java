package deob;

@ObfuscatedName("gs")
public class class189 extends class130 {

    @ObfuscatedName("gs.m")
    public static class125 field2787 = new class125(64);

    @ObfuscatedName("gs.b")
    public boolean field2786 = false;

    @ObfuscatedName("gs.o(Lez;I)V")
    public void method3159(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3161(arg0, var2);
        }
    }

    @ObfuscatedName("gs.m(Lez;II)V")
    public void method3161(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2786 = true;
        }
    }
}
