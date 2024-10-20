package deob;

@ObfuscatedName("ib")
public class class251 extends class181 {

    @ObfuscatedName("ib.f")
    public static class146 field3280 = new class146(64);

    @ObfuscatedName("ib.q")
    public int field3281 = 0;

    @ObfuscatedName("hb.m(IB)Lib;")
    public static class251 method4127(int arg0) {
        class251 var1 = (class251) field3280.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field25.method4156(5, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4345(new class202(var2));
        }
        field3280.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.f(Lgr;I)V")
    public void method4345(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4333(arg0, var2);
        }
    }

    @ObfuscatedName("ib.q(Lgr;II)V")
    public void method4333(class202 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3281 = arg0.method3530();
        }
    }
}
