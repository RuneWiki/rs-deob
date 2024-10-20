package deob;

@ObfuscatedName("fw")
public class class170 extends class406 {

    @ObfuscatedName("fw.w")
    public static class256 field1809 = new class256(64);

    @ObfuscatedName("fw.v")
    public int field1807 = 0;

    @ObfuscatedName("ej.s(Lls;I)V")
    public static void method2659(class316 arg0) {
        Statics.field1805 = arg0;
        Statics.field1810 = Statics.field1805.method5184(16);
    }

    @ObfuscatedName("fw.w(Lqr;I)V")
    public void method2949(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method2950(arg0, var2);
        }
    }

    @ObfuscatedName("fw.v(Lqr;IB)V")
    public void method2950(class444 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1807 = arg0.method7120();
        }
    }
}
