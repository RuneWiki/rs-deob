package deob;

@ObfuscatedName("ik")
public class class240 extends class176 {

    @ObfuscatedName("ik.x")
    public static class146 field3177 = new class146(64);

    @ObfuscatedName("ik.t")
    public int field3178 = 0;

    @ObfuscatedName("dh.c(Lhz;B)V")
    public static void method2256(class234 arg0) {
        Statics.field3180 = arg0;
    }

    @ObfuscatedName("cn.x(II)Lik;")
    public static class240 method1963(int arg0) {
        class240 var1 = (class240) field3177.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3180.method3825(5, arg0);
        class240 var3 = new class240();
        if (var2 != null) {
            var3.method4008(new class300(var2));
        }
        field3177.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.t(Lkz;I)V")
    public void method4008(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4014(arg0, var2);
        }
    }

    @ObfuscatedName("ik.g(Lkz;II)V")
    public void method4014(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3178 = arg0.method5304();
        }
    }
}
