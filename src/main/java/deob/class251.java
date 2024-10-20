package deob;

@ObfuscatedName("ik")
public class class251 extends class195 {

    @ObfuscatedName("ik.h")
    public static class190 field3379 = new class190(64);

    @ObfuscatedName("ik.u")
    public int field3375;

    @ObfuscatedName("ik.q")
    public int field3376;

    @ObfuscatedName("ik.g")
    public int field3377;

    @ObfuscatedName("b.i(II)Lik;")
    public static class251 method53(int arg0) {
        class251 var1 = (class251) field3379.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field29.method3836(14, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4129(new class174(var2));
        }
        field3379.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.h(Lfv;I)V")
    public void method4129(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4128(arg0, var2);
        }
    }

    @ObfuscatedName("ik.u(Lfv;II)V")
    public void method4128(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3375 = arg0.method2932();
            this.field3376 = arg0.method2930();
            this.field3377 = arg0.method2930();
        }
    }
}
