package deob;

@ObfuscatedName("iy")
public class class257 extends class209 {

    @ObfuscatedName("iy.w")
    public static class203 field3296 = new class203(64);

    @ObfuscatedName("iy.s")
    public int field3294 = 0;

    @ObfuscatedName("bd.f(Lik;B)V")
    public static void method1766(class250 arg0) {
        Statics.field3299 = arg0;
        Statics.field3300 = Statics.field3299.method4326(16);
    }

    @ObfuscatedName("ev.l(IB)Liy;")
    public static class257 method3019(int arg0) {
        class257 var1 = (class257) field3296.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3299.method4289(16, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4474(new class185(var2));
        }
        field3296.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.w(Lgm;I)V")
    public void method4474(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4476(arg0, var2);
        }
    }

    @ObfuscatedName("iy.s(Lgm;II)V")
    public void method4476(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3294 = arg0.method3346();
        }
    }
}
