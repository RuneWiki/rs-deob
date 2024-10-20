package deob;

@ObfuscatedName("ga")
public class class188 extends class130 {

    @ObfuscatedName("ga.u")
    public static class125 field2794 = new class125(64);

    @ObfuscatedName("ga.h")
    public int field2791 = 0;

    @ObfuscatedName("dq.f(IB)Lga;")
    public static class188 method1970(int arg0) {
        class188 var1 = (class188) field2794.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2789.method3163(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3268(new class154(var2));
        }
        field2794.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ga.i(Leo;I)V")
    public void method3268(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3260(arg0, var2);
        }
    }

    @ObfuscatedName("ga.u(Leo;IB)V")
    public void method3260(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2791 = arg0.method2668();
        }
    }

    @ObfuscatedName("ar.r(I)V")
    public static void method726() {
        field2794.method2244();
    }
}
