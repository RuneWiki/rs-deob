package deob;

@ObfuscatedName("jt")
public class class278 extends class219 {

    @ObfuscatedName("jt.k")
    public static class213 field3540 = new class213(64);

    @ObfuscatedName("jt.t")
    public int field3541;

    @ObfuscatedName("jt.d")
    public int field3544;

    @ObfuscatedName("jt.h")
    public int field3543;

    @ObfuscatedName("jt.o(Lgc;I)V")
    public void method4507(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4511(arg0, var2);
        }
    }

    @ObfuscatedName("jt.k(Lgc;IB)V")
    public void method4511(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3541 = arg0.method3207();
            this.field3544 = arg0.method3205();
            this.field3543 = arg0.method3205();
        }
    }
}
