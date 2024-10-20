package deob;

@ObfuscatedName("iq")
public class class250 extends class176 {

    @ObfuscatedName("iq.t")
    public static class146 field3289 = new class146(64);

    @ObfuscatedName("iq.o")
    public int field3291;

    @ObfuscatedName("iq.e")
    public int field3294;

    @ObfuscatedName("iq.i")
    public int field3292;

    @ObfuscatedName("iq.c(Lkp;I)V")
    public void method4177(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4175(arg0, var2);
        }
    }

    @ObfuscatedName("iq.t(Lkp;II)V")
    public void method4175(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3291 = arg0.method5124();
            this.field3294 = arg0.method5129();
            this.field3292 = arg0.method5129();
        }
    }
}
