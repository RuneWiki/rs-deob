package deob;

@ObfuscatedName("bn")
public class class53 extends class204 {

    @ObfuscatedName("bn.c")
    public static class193 field1159 = new class193(64);

    @ObfuscatedName("bn.l")
    public int field1158 = 0;

    @ObfuscatedName("cb.q(IB)Lbn;")
    public static class53 method1777(int arg0) {
        class53 var1 = (class53) field1159.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1156.method3094(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1078(new class119(var2));
        }
        field1159.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bn.c(Ldc;S)V")
    public void method1078(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method1080(arg0, var2);
        }
    }

    @ObfuscatedName("bn.l(Ldc;II)V")
    public void method1080(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1158 = arg0.method2430();
        }
    }
}
