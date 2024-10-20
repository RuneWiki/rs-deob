package deob;

@ObfuscatedName("ik")
public class class251 extends class185 {

    @ObfuscatedName("ik.s")
    public static class155 field3233 = new class155(64);

    @ObfuscatedName("ik.t")
    public int field3231 = 0;

    @ObfuscatedName("hs.z(Lic;I)V")
    public static void method3839(class244 arg0) {
        Statics.field3235 = arg0;
        Statics.field3232 = Statics.field3235.method3884(16);
    }

    @ObfuscatedName("gz.k(II)Lik;")
    public static class251 method3419(int arg0) {
        class251 var1 = (class251) field3233.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3235.method3873(16, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4065(new class310(var2));
        }
        field3233.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.s(Lkf;I)V")
    public void method4065(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4070(arg0, var2);
        }
    }

    @ObfuscatedName("ik.t(Lkf;IS)V")
    public void method4070(class310 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3231 = arg0.method5195();
        }
    }

    @ObfuscatedName("c.i(I)V")
    public static void method109() {
        field3233.method3172();
    }
}
