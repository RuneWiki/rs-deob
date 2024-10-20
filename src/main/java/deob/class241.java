package deob;

@ObfuscatedName("is")
public class class241 extends class195 {

    @ObfuscatedName("is.k")
    public static class190 field3282 = new class190(64);

    @ObfuscatedName("is.e")
    public int field3281 = 0;

    @ObfuscatedName("cw.d(Lit;I)V")
    public static void method1778(class236 arg0) {
        Statics.field3284 = arg0;
    }

    @ObfuscatedName("ex.k(II)Lis;")
    public static class241 method2727(int arg0) {
        class241 var1 = (class241) field3282.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3284.method3875(5, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method4009(new class174(var2));
        }
        field3282.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.e(Lfg;B)V")
    public void method4009(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4011(arg0, var2);
        }
    }

    @ObfuscatedName("is.p(Lfg;II)V")
    public void method4011(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3281 = arg0.method3035();
        }
    }
}
