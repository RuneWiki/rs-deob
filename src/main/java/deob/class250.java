package deob;

@ObfuscatedName("iq")
public class class250 extends class185 {

    @ObfuscatedName("iq.k")
    public static class155 field3229 = new class155(64);

    @ObfuscatedName("iq.s")
    public int field3228 = 0;

    @ObfuscatedName("i.z(Lic;I)V")
    public static void method47(class244 arg0) {
        Statics.field3230 = arg0;
    }

    @ObfuscatedName("hb.k(II)Liq;")
    public static class250 method3666(int arg0) {
        class250 var1 = (class250) field3229.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3230.method3873(5, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4053(new class310(var2));
        }
        field3229.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.s(Lkf;I)V")
    public void method4053(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4054(arg0, var2);
        }
    }

    @ObfuscatedName("iq.t(Lkf;II)V")
    public void method4054(class310 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3228 = arg0.method5195();
        }
    }
}
