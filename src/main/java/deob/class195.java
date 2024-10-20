package deob;

@ObfuscatedName("gt")
public class class195 extends class130 {

    @ObfuscatedName("gt.e")
    public static class125 field2851 = new class125(64);

    @ObfuscatedName("gt.f")
    public int field2849;

    @ObfuscatedName("gt.k")
    public int field2850;

    @ObfuscatedName("gt.g")
    public int field2853;

    @ObfuscatedName("ap.i(Lgq;B)V")
    public static void method646(class183 arg0) {
        Statics.field2049 = arg0;
    }

    @ObfuscatedName("o.e(II)Lgt;")
    public static class195 method556(int arg0) {
        class195 var1 = (class195) field2851.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2049.method3014(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3278(new class154(var2));
        }
        field2851.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.f(Let;B)V")
    public void method3278(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3277(arg0, var2);
        }
    }

    @ObfuscatedName("gt.k(Let;II)V")
    public void method3277(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2849 = arg0.method2575();
            this.field2850 = arg0.method2573();
            this.field2853 = arg0.method2573();
        }
    }
}
