package deob;

@ObfuscatedName("je")
public class class279 extends class346 {

    @ObfuscatedName("je.u")
    public static class199 field3399 = new class199(64);

    @ObfuscatedName("je.p")
    public int field3402 = 0;

    @ObfuscatedName("fk.f(Lir;B)V")
    public static void method2832(class253 arg0) {
        Statics.field3401 = arg0;
        Statics.field3400 = Statics.field3401.method3944(16);
    }

    @ObfuscatedName("km.o(II)Lje;")
    public static class279 method4938(int arg0) {
        class279 var1 = (class279) field3399.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3401.method3933(16, arg0);
        class279 var3 = new class279();
        if (var2 != null) {
            var3.method4327(new class382(var2));
        }
        field3399.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.u(Lnu;I)V")
    public void method4327(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4328(arg0, var2);
        }
    }

    @ObfuscatedName("je.p(Lnu;II)V")
    public void method4328(class382 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3402 = arg0.method5858();
        }
    }
}
