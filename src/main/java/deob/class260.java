package deob;

@ObfuscatedName("iq")
public class class260 extends class202 {

    @ObfuscatedName("iq.x")
    public static class197 field3462 = new class197(64);

    @ObfuscatedName("iq.k")
    public class194 field3461;

    @ObfuscatedName("n.d(Lid;B)V")
    public static void method70(class243 arg0) {
        Statics.field3463 = arg0;
    }

    @ObfuscatedName("fj.x(IB)Liq;")
    public static class260 method2842(int arg0) {
        class260 var1 = (class260) field3462.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3463.method3935(34, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4272(new class181(var2));
        }
        var3.method4270();
        field3462.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.k(I)V")
    public void method4270() {
    }

    @ObfuscatedName("iq.z(Lfr;I)V")
    public void method4272(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4287(arg0, var2);
        }
    }

    @ObfuscatedName("iq.v(Lfr;IB)V")
    public void method4287(class181 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3461 = class257.method2237(arg0, this.field3461);
        }
    }

    @ObfuscatedName("iq.m(IIS)I")
    public int method4273(int arg0, int arg1) {
        return class257.method4040(this.field3461, arg0, arg1);
    }

    @ObfuscatedName("iq.b(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4278(int arg0, String arg1) {
        return class257.method2778(this.field3461, arg0, arg1);
    }

    @ObfuscatedName("do.t(I)V")
    public static void method1985() {
        field3462.method3422();
    }
}
