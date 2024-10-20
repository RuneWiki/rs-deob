package deob;

@ObfuscatedName("iy")
public class class251 extends class185 {

    @ObfuscatedName("iy.q")
    public static class155 field3238 = new class155(64);

    @ObfuscatedName("iy.j")
    public int field3239 = 0;

    @ObfuscatedName("cf.m(Lic;B)V")
    public static void method2036(class244 arg0) {
        Statics.field3237 = arg0;
        Statics.field3240 = Statics.field3237.method3903(16);
    }

    @ObfuscatedName("hr.o(II)Liy;")
    public static class251 method3701(int arg0) {
        class251 var1 = (class251) field3238.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3237.method3891(16, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4108(new class310(var2));
        }
        field3238.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.q(Lkn;I)V")
    public void method4108(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4102(arg0, var2);
        }
    }

    @ObfuscatedName("iy.j(Lkn;II)V")
    public void method4102(class310 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3239 = arg0.method5283();
        }
    }

    @ObfuscatedName("ck.p(I)V")
    public static void method1934() {
        field3238.method3130();
    }
}
