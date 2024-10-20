package deob;

@ObfuscatedName("iu")
public class class251 extends class195 {

    @ObfuscatedName("iu.p")
    public static class190 field3386 = new class190(64);

    @ObfuscatedName("iu.i")
    public int field3383;

    @ObfuscatedName("iu.j")
    public int field3381;

    @ObfuscatedName("iu.f")
    public int field3384;

    @ObfuscatedName("fc.n(Lis;I)V")
    public static void method2832(class236 arg0) {
        Statics.field3382 = arg0;
    }

    @ObfuscatedName("b.p(II)Liu;")
    public static class251 method110(int arg0) {
        class251 var1 = (class251) field3386.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3382.method3880(14, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4131(new class174(var2));
        }
        field3386.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.i(Lfl;I)V")
    public void method4131(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4128(arg0, var2);
        }
    }

    @ObfuscatedName("iu.j(Lfl;II)V")
    public void method4128(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3383 = arg0.method3065();
            this.field3381 = arg0.method2925();
            this.field3384 = arg0.method2925();
        }
    }
}
