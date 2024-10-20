package deob;

@ObfuscatedName("ar")
public class class50 extends class205 {

    @ObfuscatedName("ar.u")
    public static class194 field1101 = new class194(64);

    @ObfuscatedName("ar.x")
    public boolean field1102 = false;

    @ObfuscatedName("m.f(Lfl;I)V")
    public static void method108(class168 arg0) {
        Statics.field1107 = arg0;
    }

    @ObfuscatedName("fa.u(II)Lar;")
    public static class50 method3316(int arg0) {
        class50 var1 = (class50) field1101.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1107.method3061(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method1032(new class120(var2));
        }
        field1101.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.x(Ldj;B)V")
    public void method1032(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method1017(arg0, var2);
        }
    }

    @ObfuscatedName("ar.b(Ldj;IB)V")
    public void method1017(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1102 = true;
        }
    }
}
