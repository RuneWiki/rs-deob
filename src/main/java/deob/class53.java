package deob;

@ObfuscatedName("bb")
public class class53 extends class205 {

    @ObfuscatedName("bb.m")
    public static class194 field1142 = new class194(64);

    @ObfuscatedName("bb.z")
    public int field1145 = 0;

    @ObfuscatedName("fc.j(II)Lbb;")
    public static class53 method3201(int arg0) {
        class53 var1 = (class53) field1142.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1150.method3011(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1058(new class120(var2));
        }
        field1142.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bb.h(Ldx;I)V")
    public void method1058(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method1065(arg0, var2);
        }
    }

    @ObfuscatedName("bb.m(Ldx;II)V")
    public void method1065(class120 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1145 = arg0.method2363();
        }
    }
}
