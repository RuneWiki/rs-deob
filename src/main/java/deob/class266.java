package deob;

@ObfuscatedName("jk")
public class class266 extends class209 {

    @ObfuscatedName("jk.r")
    public static class203 field3397 = new class203(64);

    @ObfuscatedName("jk.e")
    public int field3398;

    @ObfuscatedName("jk.q")
    public int field3400;

    @ObfuscatedName("jk.c")
    public int field3399;

    @ObfuscatedName("fv.g(Liu;I)V")
    public static void method3346(class250 arg0) {
        Statics.field3401 = arg0;
    }

    @ObfuscatedName("bt.r(IB)Ljk;")
    public static class266 method1886(int arg0) {
        class266 var1 = (class266) field3397.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3401.method4438(14, arg0);
        class266 var3 = new class266();
        if (var2 != null) {
            var3.method4757(new class185(var2));
        }
        field3397.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.e(Lgl;I)V")
    public void method4757(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4761(arg0, var2);
        }
    }

    @ObfuscatedName("jk.q(Lgl;II)V")
    public void method4761(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3398 = arg0.method3467();
            this.field3400 = arg0.method3679();
            this.field3399 = arg0.method3679();
        }
    }
}
