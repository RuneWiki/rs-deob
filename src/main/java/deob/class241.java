package deob;

@ObfuscatedName("iq")
public class class241 extends class176 {

    @ObfuscatedName("iq.v")
    public static class146 field3184 = new class146(64);

    @ObfuscatedName("iq.u")
    public int field3185 = 0;

    @ObfuscatedName("f.z(IB)Liq;")
    public static class241 method266(int arg0) {
        class241 var1 = (class241) field3184.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3183.method3726(16, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method3933(new class300(var2));
        }
        field3184.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.n(Lkl;I)V")
    public void method3933(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method3934(arg0, var2);
        }
    }

    @ObfuscatedName("iq.v(Lkl;II)V")
    public void method3934(class300 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3185 = arg0.method4992();
        }
    }

    @ObfuscatedName("gk.u(B)V")
    public static void method3515() {
        field3184.method2995();
    }
}
