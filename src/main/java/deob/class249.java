package deob;

@ObfuscatedName("iq")
public class class249 extends class176 {

    @ObfuscatedName("iq.f")
    public static class146 field3298 = new class146(64);

    @ObfuscatedName("iq.b")
    public int field3297;

    @ObfuscatedName("iq.g")
    public int field3296;

    @ObfuscatedName("iq.z")
    public int field3300;

    @ObfuscatedName("gd.u(Lhf;B)V")
    public static void method3341(class234 arg0) {
        Statics.field3302 = arg0;
    }

    @ObfuscatedName("iq.f(Lkg;I)V")
    public void method4174(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4175(arg0, var2);
        }
    }

    @ObfuscatedName("iq.b(Lkg;II)V")
    public void method4175(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3297 = arg0.method5337();
            this.field3296 = arg0.method5138();
            this.field3300 = arg0.method5138();
        }
    }
}
