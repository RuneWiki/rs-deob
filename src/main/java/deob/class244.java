package deob;

@ObfuscatedName("iq")
public class class244 extends class195 {

    @ObfuscatedName("iq.m")
    public static class190 field3323 = new class190(64);

    @ObfuscatedName("iq.e")
    public boolean field3321 = false;

    @ObfuscatedName("hv.p(IB)Liq;")
    public static class244 method3679(int arg0) {
        class244 var1 = (class244) field3323.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3322.method3720(19, arg0);
        class244 var3 = new class244();
        if (var2 != null) {
            var3.method3897(new class174(var2));
        }
        field3323.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.m(Lfr;B)V")
    public void method3897(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3889(arg0, var2);
        }
    }

    @ObfuscatedName("iq.e(Lfr;II)V")
    public void method3889(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3321 = true;
        }
    }
}
