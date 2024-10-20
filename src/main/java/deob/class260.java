package deob;

@ObfuscatedName("ik")
public class class260 extends class209 {

    @ObfuscatedName("ik.r")
    public static class203 field3340 = new class203(64);

    @ObfuscatedName("ik.e")
    public boolean field3342 = false;

    @ObfuscatedName("in.g(Liu;I)V")
    public static void method4422(class250 arg0) {
        Statics.field3341 = arg0;
    }

    @ObfuscatedName("g.r(IB)Lik;")
    public static class260 method1(int arg0) {
        class260 var1 = (class260) field3340.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3341.method4438(15, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4672(new class185(var2));
        }
        field3340.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.e(Lgl;I)V")
    public void method4672(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4670(arg0, var2);
        }
    }

    @ObfuscatedName("ik.q(Lgl;II)V")
    public void method4670(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3342 = true;
        }
    }
}
