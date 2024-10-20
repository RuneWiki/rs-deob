package deob;

@ObfuscatedName("iq")
public class class242 extends class195 {

    @ObfuscatedName("iq.m")
    public static class190 field3261 = new class190(64);

    @ObfuscatedName("iq.g")
    public int field3262 = 0;

    @ObfuscatedName("dv.e(II)Liq;")
    public static class242 method2262(int arg0) {
        class242 var1 = (class242) field3261.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3259.method3760(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method3906(new class174(var2));
        }
        field3261.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.o(Lfw;B)V")
    public void method3906(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method3907(arg0, var2);
        }
    }

    @ObfuscatedName("iq.m(Lfw;II)V")
    public void method3907(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3262 = arg0.method2930();
        }
    }
}
