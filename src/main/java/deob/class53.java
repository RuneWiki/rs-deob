package deob;

@ObfuscatedName("bb")
public class class53 extends class205 {

    @ObfuscatedName("bb.d")
    public static class194 field1171 = new class194(64);

    @ObfuscatedName("bb.c")
    public int field1172 = 0;

    @ObfuscatedName("aj.a(II)Lbb;")
    public static class53 method987(int arg0) {
        class53 var1 = (class53) field1171.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1174.method3188(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1159(new class120(var2));
        }
        field1171.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bb.w(Ldx;I)V")
    public void method1159(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method1174(arg0, var2);
        }
    }

    @ObfuscatedName("bb.d(Ldx;II)V")
    public void method1174(class120 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1172 = arg0.method2464();
        }
    }

    @ObfuscatedName("t.c(S)V")
    public static void method196() {
        field1171.method3582();
    }
}
