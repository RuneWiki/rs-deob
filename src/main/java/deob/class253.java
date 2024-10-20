package deob;

@ObfuscatedName("ib")
public class class253 extends class185 {

    @ObfuscatedName("ib.k")
    public static class155 field3259 = new class155(64);

    @ObfuscatedName("ib.s")
    public boolean field3260 = false;

    @ObfuscatedName("cy.z(IB)Lib;")
    public static class253 method2138(int arg0) {
        class253 var1 = (class253) field3259.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3258.method3873(19, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4104(new class310(var2));
        }
        field3259.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.k(Lkf;B)V")
    public void method4104(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4105(arg0, var2);
        }
    }

    @ObfuscatedName("ib.s(Lkf;IB)V")
    public void method4105(class310 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3260 = true;
        }
    }
}
