package deob;

@ObfuscatedName("iq")
public class class240 extends class176 {

    @ObfuscatedName("iq.t")
    public static class146 field3189 = new class146(64);

    @ObfuscatedName("iq.n")
    public int field3187 = 0;

    @ObfuscatedName("z.a(II)Liq;")
    public static class240 method256(int arg0) {
        class240 var1 = (class240) field3189.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3.method3873(5, arg0);
        class240 var3 = new class240();
        if (var2 != null) {
            var3.method4060(new class300(var2));
        }
        field3189.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.t(Lkc;B)V")
    public void method4060(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4064(arg0, var2);
        }
    }

    @ObfuscatedName("iq.n(Lkc;IB)V")
    public void method4064(class300 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3187 = arg0.method5166();
        }
    }
}
