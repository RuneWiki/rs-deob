package deob;

@ObfuscatedName("ak")
public class class38 extends class174 {

    @ObfuscatedName("ak.r")
    public static class170 field937 = new class170(64);

    @ObfuscatedName("ak.u")
    public int field936;

    @ObfuscatedName("ak.t")
    public int field939;

    @ObfuscatedName("ak.k")
    public int field938;

    @ObfuscatedName("cf.a(Lev;B)V")
    public static void method1983(class152 arg0) {
        Statics.field943 = arg0;
    }

    @ObfuscatedName("ak.r(Ldf;I)V")
    public void method750(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method752(arg0, var2);
        }
    }

    @ObfuscatedName("ak.u(Ldf;II)V")
    public void method752(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field936 = arg0.method2373();
            this.field939 = arg0.method2481();
            this.field938 = arg0.method2481();
        }
    }
}
