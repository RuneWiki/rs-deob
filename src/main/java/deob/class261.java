package deob;

@ObfuscatedName("je")
public class class261 extends class185 {

    @ObfuscatedName("je.o")
    public static class155 field3344 = new class155(64);

    @ObfuscatedName("je.q")
    public class326 field3342;

    @ObfuscatedName("gg.m(Lic;I)V")
    public static void method3423(class244 arg0) {
        Statics.field3343 = arg0;
    }

    @ObfuscatedName("hx.o(IB)Lje;")
    public static class261 method3778(int arg0) {
        class261 var1 = (class261) field3344.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3343.method3891(34, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4299(new class310(var2));
        }
        var3.method4285();
        field3344.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.q(B)V")
    public void method4285() {
    }

    @ObfuscatedName("je.j(Lkn;I)V")
    public void method4299(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4284(arg0, var2);
        }
    }

    @ObfuscatedName("je.p(Lkn;II)V")
    public void method4284(class310 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3342 = class258.method4134(arg0, this.field3342);
        }
    }

    @ObfuscatedName("je.g(III)I")
    public int method4288(int arg0, int arg1) {
        return class258.method3448(this.field3342, arg0, arg1);
    }

    @ObfuscatedName("je.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4289(int arg0, String arg1) {
        return class258.method4181(this.field3342, arg0, arg1);
    }
}
