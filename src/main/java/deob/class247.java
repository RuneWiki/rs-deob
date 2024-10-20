package deob;

@ObfuscatedName("ip")
public class class247 extends class198 {

    @ObfuscatedName("ip.o")
    public static class193 field3317 = new class193(64);

    @ObfuscatedName("ip.x")
    public boolean field3318 = false;

    @ObfuscatedName("iq.w(Liq;B)V")
    public static void method3819(class239 arg0) {
        Statics.field3320 = arg0;
    }

    @ObfuscatedName("ip.o(Lfi;B)V")
    public void method3917(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method3918(arg0, var2);
        }
    }

    @ObfuscatedName("ip.x(Lfi;II)V")
    public void method3918(class177 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3318 = true;
        }
    }
}
