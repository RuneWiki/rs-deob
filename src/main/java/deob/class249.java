package deob;

@ObfuscatedName("iq")
public class class249 extends class183 {

    @ObfuscatedName("iq.i")
    public static class155 field3266 = new class155(64);

    @ObfuscatedName("iq.y")
    public int field3265;

    @ObfuscatedName("iq.w")
    public int field3267;

    @ObfuscatedName("iq.p")
    public int field3269;

    @ObfuscatedName("eg.f(IB)Liq;")
    public static class249 method3046(int arg0) {
        class249 var1 = (class249) field3266.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3268.method3752(14, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4104(new class300(var2));
        }
        field3266.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.i(Lkq;I)V")
    public void method4104(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4100(arg0, var2);
        }
    }

    @ObfuscatedName("iq.y(Lkq;II)V")
    public void method4100(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3265 = arg0.method5112();
            this.field3267 = arg0.method5110();
            this.field3269 = arg0.method5110();
        }
    }

    @ObfuscatedName("go.w(I)V")
    public static void method3564() {
        field3266.method3102();
    }
}
