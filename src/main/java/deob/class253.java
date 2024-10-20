package deob;

@ObfuscatedName("iv")
public class class253 extends class206 {

    @ObfuscatedName("iv.e")
    public static class201 field3374 = new class201(64);

    @ObfuscatedName("iv.k")
    public int field3375 = 0;

    @ObfuscatedName("cr.a(Lib;S)V")
    public static void method1575(class247 arg0) {
        Statics.field3376 = arg0;
        Statics.field2029 = Statics.field3376.method3907(16);
    }

    @ObfuscatedName("p.w(IS)Liv;")
    public static class253 method171(int arg0) {
        class253 var1 = (class253) field3374.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3376.method3897(16, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4056(new class185(var2));
        }
        field3374.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.e(Lgh;I)V")
    public void method4056(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4058(arg0, var2);
        }
    }

    @ObfuscatedName("iv.k(Lgh;IB)V")
    public void method4058(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3375 = arg0.method3194();
        }
    }
}
