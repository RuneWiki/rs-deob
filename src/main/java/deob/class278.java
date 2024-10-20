package deob;

@ObfuscatedName("jc")
public class class278 extends class219 {

    @ObfuscatedName("jc.e")
    public static class213 field3544 = new class213(64);

    @ObfuscatedName("jc.b")
    public int field3540;

    @ObfuscatedName("jc.z")
    public int field3543;

    @ObfuscatedName("jc.n")
    public int field3542;

    @ObfuscatedName("bn.g(Ljr;I)V")
    public static void method1102(class262 arg0) {
        Statics.field3541 = arg0;
    }

    @ObfuscatedName("jc.e(Lgg;I)V")
    public void method4592(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4591(arg0, var2);
        }
    }

    @ObfuscatedName("jc.b(Lgg;II)V")
    public void method4591(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3540 = arg0.method3310();
            this.field3543 = arg0.method3332();
            this.field3542 = arg0.method3332();
        }
    }
}
