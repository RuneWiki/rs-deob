package deob;

@ObfuscatedName("ij")
public class class242 extends class176 {

    @ObfuscatedName("ij.o")
    public static class146 field3207 = new class146(64);

    @ObfuscatedName("ij.e")
    public int field3209 = 0;

    @ObfuscatedName("cy.c(IB)Lij;")
    public static class242 method2078(int arg0) {
        class242 var1 = (class242) field3207.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3208.method3845(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method4038(new class301(var2));
        }
        field3207.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.t(Lkp;B)V")
    public void method4038(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4039(arg0, var2);
        }
    }

    @ObfuscatedName("ij.o(Lkp;IB)V")
    public void method4039(class301 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3209 = arg0.method5124();
        }
    }

    @ObfuscatedName("as.e(I)V")
    public static void method537() {
        field3207.method3103();
    }
}
