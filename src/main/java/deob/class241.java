package deob;

@ObfuscatedName("in")
public class class241 extends class176 {

    @ObfuscatedName("in.i")
    public static class146 field3190 = new class146(64);

    @ObfuscatedName("in.k")
    public int field3189 = 0;

    @ObfuscatedName("bn.s(Lhz;B)V")
    public static void method967(class234 arg0) {
        Statics.field3188 = arg0;
        Statics.field3187 = Statics.field3188.method3776(16);
    }

    @ObfuscatedName("g.j(IB)Lin;")
    public static class241 method157(int arg0) {
        class241 var1 = (class241) field3190.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3188.method3790(16, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method3962(new class300(var2));
        }
        field3190.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.i(Lky;B)V")
    public void method3962(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method3963(arg0, var2);
        }
    }

    @ObfuscatedName("in.k(Lky;IB)V")
    public void method3963(class300 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3189 = arg0.method5054();
        }
    }

    @ObfuscatedName("ae.u(I)V")
    public static void method723() {
        field3190.method3068();
    }
}
