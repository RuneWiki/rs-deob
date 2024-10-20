package deob;

@ObfuscatedName("io")
public class class260 extends class209 {

    @ObfuscatedName("io.h")
    public static class203 field3316 = new class203(64);

    @ObfuscatedName("io.e")
    public boolean field3318 = false;

    @ObfuscatedName("aw.f(II)Lio;")
    public static class260 method928(int arg0) {
        class260 var1 = (class260) field3316.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3319.method4267(15, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4480(new class185(var2));
        }
        field3316.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.h(Lgx;B)V")
    public void method4480(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4482(arg0, var2);
        }
    }

    @ObfuscatedName("io.e(Lgx;II)V")
    public void method4482(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3318 = true;
        }
    }
}
