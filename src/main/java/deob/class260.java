package deob;

@ObfuscatedName("ia")
public class class260 extends class181 {

    @ObfuscatedName("ia.f")
    public static class146 field3373 = new class146(64);

    @ObfuscatedName("ia.q")
    public int field3372;

    @ObfuscatedName("ia.w")
    public int field3371;

    @ObfuscatedName("ia.o")
    public int field3370;

    @ObfuscatedName("d.m(Lir;B)V")
    public static void method118(class245 arg0) {
        Statics.field3374 = arg0;
    }

    @ObfuscatedName("ee.f(IB)Lia;")
    public static class260 method2985(int arg0) {
        class260 var1 = (class260) field3373.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3374.method4156(14, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4488(new class202(var2));
        }
        field3373.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.q(Lgr;I)V")
    public void method4488(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4489(arg0, var2);
        }
    }

    @ObfuscatedName("ia.w(Lgr;IB)V")
    public void method4489(class202 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3372 = arg0.method3530();
            this.field3371 = arg0.method3551();
            this.field3370 = arg0.method3551();
        }
    }
}
