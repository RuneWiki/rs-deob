package deob;

@ObfuscatedName("ib")
public class class258 extends class202 {

    @ObfuscatedName("ib.p")
    public static class197 field3437 = new class197(64);

    @ObfuscatedName("ib.i")
    public int field3435;

    @ObfuscatedName("ib.j")
    public int field3438;

    @ObfuscatedName("ib.v")
    public int field3436;

    @ObfuscatedName("f.m(Lik;I)V")
    public static void method189(class243 arg0) {
        Statics.field271 = arg0;
    }

    @ObfuscatedName("hq.p(II)Lib;")
    public static class258 method3772(int arg0) {
        class258 var1 = (class258) field3437.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field271.method3930(14, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4234(new class181(var2));
        }
        field3437.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.i(Lfv;I)V")
    public void method4234(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4235(arg0, var2);
        }
    }

    @ObfuscatedName("ib.j(Lfv;IB)V")
    public void method4235(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3435 = arg0.method3009();
            this.field3438 = arg0.method3012();
            this.field3436 = arg0.method3012();
        }
    }

    @ObfuscatedName("cy.v(I)V")
    public static void method1619() {
        field3437.method3423();
    }
}
