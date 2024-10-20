package deob;

@ObfuscatedName("ip")
public class class240 extends class183 {

    @ObfuscatedName("ip.i")
    public static class155 field3175 = new class155(64);

    @ObfuscatedName("ip.y")
    public int field3177 = 0;

    @ObfuscatedName("eh.f(Lhz;I)V")
    public static void method3062(class234 arg0) {
        Statics.field3176 = arg0;
    }

    @ObfuscatedName("gv.i(II)Lip;")
    public static class240 method3372(int arg0) {
        class240 var1 = (class240) field3175.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3176.method3752(5, arg0);
        class240 var3 = new class240();
        if (var2 != null) {
            var3.method3940(new class300(var2));
        }
        field3175.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.y(Lkq;I)V")
    public void method3940(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method3942(arg0, var2);
        }
    }

    @ObfuscatedName("ip.w(Lkq;II)V")
    public void method3942(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3177 = arg0.method5112();
        }
    }
}
