package deob;

@ObfuscatedName("iq")
public class class250 extends class185 {

    @ObfuscatedName("iq.m")
    public static class155 field3199 = new class155(64);

    @ObfuscatedName("iq.k")
    public int field3198 = 0;

    @ObfuscatedName("kw.x(Liy;S)V")
    public static void method4778(class244 arg0) {
        Statics.field3200 = arg0;
    }

    @ObfuscatedName("hr.m(IB)Liq;")
    public static class250 method3846(int arg0) {
        class250 var1 = (class250) field3199.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3200.method3869(5, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4049(new class310(var2));
        }
        field3199.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.k(Lkb;I)V")
    public void method4049(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4050(arg0, var2);
        }
    }

    @ObfuscatedName("iq.d(Lkb;II)V")
    public void method4050(class310 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3198 = arg0.method5139();
        }
    }
}
