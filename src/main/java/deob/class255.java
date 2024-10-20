package deob;

@ObfuscatedName("il")
public class class255 extends class206 {

    @ObfuscatedName("il.i")
    public static class201 field3376 = new class201(64);

    @ObfuscatedName("il.w")
    public boolean field3378 = false;

    @ObfuscatedName("ds.p(Lik;B)V")
    public static void method2120(class247 arg0) {
        Statics.field3377 = arg0;
    }

    @ObfuscatedName("aq.i(IS)Lil;")
    public static class255 method551(int arg0) {
        class255 var1 = (class255) field3376.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3377.method4032(19, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4229(new class185(var2));
        }
        field3376.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.w(Lgj;I)V")
    public void method4229(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4227(arg0, var2);
        }
    }

    @ObfuscatedName("il.s(Lgj;IB)V")
    public void method4227(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3378 = true;
        }
    }
}
