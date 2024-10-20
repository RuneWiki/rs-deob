package deob;

@ObfuscatedName("ak")
public class class46 extends class205 {

    @ObfuscatedName("ak.u")
    public static class194 field1057 = new class194(64);

    @ObfuscatedName("ak.x")
    public boolean field1054 = false;

    @ObfuscatedName("ai.f(Lfl;I)V")
    public static void method775(class168 arg0) {
        Statics.field3145 = arg0;
    }

    @ObfuscatedName("aj.u(II)Lak;")
    public static class46 method693(int arg0) {
        class46 var1 = (class46) field1057.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3145.method3061(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method970(new class120(var2));
        }
        field1057.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.x(Ldj;I)V")
    public void method970(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method959(arg0, var2);
        }
    }

    @ObfuscatedName("ak.b(Ldj;II)V")
    public void method959(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1054 = true;
        }
    }
}
