package deob;

@ObfuscatedName("ai")
public class class38 extends class174 {

    @ObfuscatedName("ai.w")
    public static class170 field959 = new class170(64);

    @ObfuscatedName("ai.f")
    public int field961;

    @ObfuscatedName("ai.e")
    public int field962;

    @ObfuscatedName("ai.t")
    public int field960;

    @ObfuscatedName("ch.i(Leg;B)V")
    public static void method1860(class152 arg0) {
        Statics.field963 = arg0;
    }

    @ObfuscatedName("ai.w(Ldz;B)V")
    public void method807(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method808(arg0, var2);
        }
    }

    @ObfuscatedName("ai.f(Ldz;IB)V")
    public void method808(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field961 = arg0.method2615();
            this.field962 = arg0.method2472();
            this.field960 = arg0.method2472();
        }
    }
}
