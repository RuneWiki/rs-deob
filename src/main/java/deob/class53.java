package deob;

@ObfuscatedName("bo")
public class class53 extends class204 {

    @ObfuscatedName("bo.i")
    public static class193 field1162 = new class193(64);

    @ObfuscatedName("bo.h")
    public int field1153 = 0;

    @ObfuscatedName("ev.o(II)Lbo;")
    public static class53 method2783(int arg0) {
        class53 var1 = (class53) field1162.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1156.method3030(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1017(new class119(var2));
        }
        field1162.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bo.f(Ldc;I)V")
    public void method1017(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method1016(arg0, var2);
        }
    }

    @ObfuscatedName("bo.i(Ldc;II)V")
    public void method1016(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1153 = arg0.method2292();
        }
    }
}
