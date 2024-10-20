package deob;

@ObfuscatedName("fo")
public class class171 extends class407 {

    @ObfuscatedName("fo.f")
    public static class257 field1841 = new class257(64);

    @ObfuscatedName("fo.n")
    public int field1843 = 0;

    @ObfuscatedName("dv.c(IB)Lfo;")
    public static class171 method2780(int arg0) {
        class171 var1 = (class171) field1841.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1844.method5499(16, arg0);
        class171 var3 = new class171();
        if (var2 != null) {
            var3.method3171(new class445(var2));
        }
        field1841.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fo.p(Lqq;S)V")
    public void method3171(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3165(arg0, var2);
        }
    }

    @ObfuscatedName("fo.f(Lqq;II)V")
    public void method3165(class445 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1843 = arg0.method7198();
        }
    }
}
