package deob;

@ObfuscatedName("ik")
public class class242 extends class195 {

    @ObfuscatedName("ik.x")
    public static class190 field3269 = new class190(64);

    @ObfuscatedName("ik.y")
    public int field3271 = 0;

    @ObfuscatedName("am.d(II)Lik;")
    public static class242 method174(int arg0) {
        class242 var1 = (class242) field3269.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3270.method3750(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method3891(new class174(var2));
        }
        field3269.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.q(Lfw;I)V")
    public void method3891(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method3885(arg0, var2);
        }
    }

    @ObfuscatedName("ik.x(Lfw;II)V")
    public void method3885(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3271 = arg0.method2916();
        }
    }

    @ObfuscatedName("fy.y(I)V")
    public static void method3151() {
        field3269.method3250();
    }
}
