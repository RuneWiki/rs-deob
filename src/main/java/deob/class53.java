package deob;

@ObfuscatedName("bf")
public class class53 extends class205 {

    @ObfuscatedName("bf.g")
    public static class194 field1170 = new class194(64);

    @ObfuscatedName("bf.h")
    public int field1172 = 0;

    @ObfuscatedName("x.t(IB)Lbf;")
    public static class53 method548(int arg0) {
        class53 var1 = (class53) field1170.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1173.method3002(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1017(new class120(var2));
        }
        field1170.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bf.i(Ldr;B)V")
    public void method1017(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method1016(arg0, var2);
        }
    }

    @ObfuscatedName("bf.g(Ldr;IB)V")
    public void method1016(class120 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1172 = arg0.method2310();
        }
    }
}
