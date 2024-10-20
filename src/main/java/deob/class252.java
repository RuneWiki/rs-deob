package deob;

@ObfuscatedName("ix")
public class class252 extends class181 {

    @ObfuscatedName("ix.q")
    public static class146 field3282 = new class146(64);

    @ObfuscatedName("ix.w")
    public int field3284 = 0;

    @ObfuscatedName("bk.m(IB)Lix;")
    public static class252 method1002(int arg0) {
        class252 var1 = (class252) field3282.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3285.method4156(16, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4348(new class202(var2));
        }
        field3282.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.f(Lgr;B)V")
    public void method4348(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4349(arg0, var2);
        }
    }

    @ObfuscatedName("ix.q(Lgr;II)V")
    public void method4349(class202 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3284 = arg0.method3530();
        }
    }
}
