package deob;

@ObfuscatedName("ga")
public class class195 extends class130 {

    @ObfuscatedName("ga.d")
    public static class125 field2850 = new class125(64);

    @ObfuscatedName("ga.m")
    public int field2851;

    @ObfuscatedName("ga.h")
    public int field2849;

    @ObfuscatedName("ga.w")
    public int field2853;

    @ObfuscatedName("fe.n(Lgj;I)V")
    public static void method3075(class183 arg0) {
        Statics.field2852 = arg0;
    }

    @ObfuscatedName("fw.d(IB)Lga;")
    public static class195 method3079(int arg0) {
        class195 var1 = (class195) field2850.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2852.method3093(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3345(new class161(var2));
        }
        field2850.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ga.m(Lfa;I)V")
    public void method3345(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3346(arg0, var2);
        }
    }

    @ObfuscatedName("ga.h(Lfa;II)V")
    public void method3346(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2851 = arg0.method2887();
            this.field2849 = arg0.method2823();
            this.field2853 = arg0.method2823();
        }
    }

    @ObfuscatedName("aw.w(I)V")
    public static void method628() {
        field2850.method2220();
    }
}
