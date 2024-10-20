package deob;

@ObfuscatedName("gt")
public class class188 extends class130 {

    @ObfuscatedName("gt.m")
    public static class125 field2775 = new class125(64);

    @ObfuscatedName("gt.h")
    public int field2773 = 0;

    @ObfuscatedName("bc.n(Lgj;I)V")
    public static void method1396(class183 arg0) {
        Statics.field2776 = arg0;
        Statics.field2774 = Statics.field2776.method3103(16);
    }

    @ObfuscatedName("fv.d(IB)Lgt;")
    public static class188 method3084(int arg0) {
        class188 var1 = (class188) field2775.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2776.method3093(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3233(new class161(var2));
        }
        field2775.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.m(Lfa;B)V")
    public void method3233(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3234(arg0, var2);
        }
    }

    @ObfuscatedName("gt.h(Lfa;IB)V")
    public void method3234(class161 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2773 = arg0.method2887();
        }
    }
}
