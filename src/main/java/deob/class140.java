package deob;

@ObfuscatedName("eg")
public class class140 extends class349 {

    @ObfuscatedName("eg.v")
    public static class223 field1526 = new class223(64);

    @ObfuscatedName("eg.j")
    public int field1528 = 0;

    @ObfuscatedName("ag.s(Ljy;B)V")
    public static void method1314(class277 arg0) {
        Statics.field1529 = arg0;
        Statics.field3631 = Statics.field1529.method4484(16);
    }

    @ObfuscatedName("ai.t(IB)Leg;")
    public static class140 method1405(int arg0) {
        class140 var1 = (class140) field1526.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1529.method4459(16, arg0);
        class140 var3 = new class140();
        if (var2 != null) {
            var3.method2390(new class385(var2));
        }
        field1526.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eg.v(Lnv;I)V")
    public void method2390(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2391(arg0, var2);
        }
    }

    @ObfuscatedName("eg.j(Lnv;II)V")
    public void method2391(class385 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1528 = arg0.method6053();
        }
    }
}
