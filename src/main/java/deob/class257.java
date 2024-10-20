package deob;

@ObfuscatedName("id")
public class class257 extends class209 {

    @ObfuscatedName("id.e")
    public static class203 field3285 = new class203(64);

    @ObfuscatedName("id.b")
    public int field3287 = 0;

    @ObfuscatedName("fu.f(II)Lid;")
    public static class257 method3120(int arg0) {
        class257 var1 = (class257) field3285.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3288.method4267(16, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4440(new class185(var2));
        }
        field3285.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.h(Lgx;B)V")
    public void method4440(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4444(arg0, var2);
        }
    }

    @ObfuscatedName("id.e(Lgx;IB)V")
    public void method4444(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3287 = arg0.method3325();
        }
    }
}
