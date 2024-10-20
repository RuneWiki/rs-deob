package deob;

@ObfuscatedName("gx")
public class class189 extends class130 {

    @ObfuscatedName("gx.l")
    public static class125 field2782 = new class125(64);

    @ObfuscatedName("gx.i")
    public boolean field2781 = false;

    @ObfuscatedName("gx.b(Leg;I)V")
    public void method3311(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3312(arg0, var2);
        }
    }

    @ObfuscatedName("gx.l(Leg;IS)V")
    public void method3312(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2781 = true;
        }
    }
}
