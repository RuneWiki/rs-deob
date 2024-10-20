package deob;

@ObfuscatedName("bp")
public class class53 extends class205 {

    @ObfuscatedName("bp.x")
    public static class194 field1169 = new class194(64);

    @ObfuscatedName("bp.b")
    public int field1170 = 0;

    @ObfuscatedName("bu.f(Lfl;I)V")
    public static void method1583(class168 arg0) {
        Statics.field3164 = arg0;
        Statics.field2055 = Statics.field3164.method3096(16);
    }

    @ObfuscatedName("fk.u(II)Lbp;")
    public static class53 method2969(int arg0) {
        class53 var1 = (class53) field1169.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3164.method3061(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1109(new class120(var2));
        }
        field1169.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bp.x(Ldj;I)V")
    public void method1109(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method1110(arg0, var2);
        }
    }

    @ObfuscatedName("bp.b(Ldj;II)V")
    public void method1110(class120 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1170 = arg0.method2387();
        }
    }
}
