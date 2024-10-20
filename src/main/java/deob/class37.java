package deob;

@ObfuscatedName("aq")
public class class37 extends class173 {

    @ObfuscatedName("aq.k")
    public static class169 field946 = new class169(64);

    @ObfuscatedName("aq.x")
    public int field940;

    @ObfuscatedName("aq.m")
    public int field943;

    @ObfuscatedName("aq.n")
    public int field941;

    @ObfuscatedName("ax.u(Leb;I)V")
    public static void method524(class151 arg0) {
        Statics.field945 = arg0;
    }

    @ObfuscatedName("aq.k(Ldl;I)V")
    public void method785(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method786(arg0, var2);
        }
    }

    @ObfuscatedName("aq.x(Ldl;IB)V")
    public void method786(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field940 = arg0.method2450();
            this.field943 = arg0.method2559();
            this.field941 = arg0.method2559();
        }
    }

    @ObfuscatedName("al.m(I)V")
    public static void method606() {
        field946.method3261();
    }
}
