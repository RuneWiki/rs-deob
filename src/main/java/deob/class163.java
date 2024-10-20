package deob;

@ObfuscatedName("fw")
public class class163 extends class143 {

    @ObfuscatedName("fw.r")
    public static class101 field2476 = new class101(64);

    @ObfuscatedName("fw.d")
    public int field2475 = 0;

    @ObfuscatedName("j.k(Lcv;I)V")
    public static void method150(class87 arg0) {
        Statics.field2477 = arg0;
    }

    @ObfuscatedName("b.u(II)Lfw;")
    public static class163 method230(int arg0) {
        class163 var1 = (class163) field2476.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2477.method1024(5, arg0);
        class163 var3 = new class163();
        if (var2 != null) {
            var3.method2563(new class136(var2));
        }
        field2476.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fw.v(Let;B)V")
    public void method2563(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2561(arg0, var2);
        }
    }

    @ObfuscatedName("fw.f(Let;IS)V")
    public void method2561(class136 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2475 = arg0.method1712();
        }
    }
}
