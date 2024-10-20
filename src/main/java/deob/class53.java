package deob;

@ObfuscatedName("bj")
public class class53 extends class204 {

    @ObfuscatedName("bj.f")
    public static class193 field1145 = new class193(64);

    @ObfuscatedName("bj.l")
    public int field1146 = 0;

    @ObfuscatedName("cg.j(Lfa;I)V")
    public static void method1962(class167 arg0) {
        Statics.field1150 = arg0;
        Statics.field1144 = Statics.field1150.method3094(16);
    }

    @ObfuscatedName("ac.m(II)Lbj;")
    public static class53 method799(int arg0) {
        class53 var1 = (class53) field1145.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1150.method3124(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1083(new class119(var2));
        }
        field1145.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bj.f(Ldc;I)V")
    public void method1083(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method1085(arg0, var2);
        }
    }

    @ObfuscatedName("bj.l(Ldc;IB)V")
    public void method1085(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1146 = arg0.method2374();
        }
    }

    @ObfuscatedName("l.u(S)V")
    public static void method45() {
        field1145.method3541();
    }
}
