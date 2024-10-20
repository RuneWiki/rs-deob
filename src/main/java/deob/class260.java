package deob;

@ObfuscatedName("il")
public class class260 extends class209 {

    @ObfuscatedName("il.l")
    public static class203 field3330 = new class203(64);

    @ObfuscatedName("il.w")
    public boolean field3328 = false;

    @ObfuscatedName("t.f(II)Lil;")
    public static class260 method185(int arg0) {
        class260 var1 = (class260) field3330.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3834.method4289(15, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4528(new class185(var2));
        }
        field3330.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.l(Lgm;B)V")
    public void method4528(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4526(arg0, var2);
        }
    }

    @ObfuscatedName("il.w(Lgm;II)V")
    public void method4526(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3328 = true;
        }
    }
}
