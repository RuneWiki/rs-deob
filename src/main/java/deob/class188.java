package deob;

@ObfuscatedName("gb")
public class class188 extends class130 {

    @ObfuscatedName("gb.g")
    public static class125 field2779 = new class125(64);

    @ObfuscatedName("gb.v")
    public int field2778 = 0;

    @ObfuscatedName("en.n(II)Lgb;")
    public static class188 method2594(int arg0) {
        class188 var1 = (class188) field2779.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2193.method3153(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3291(new class154(var2));
        }
        field2779.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.g(Leq;I)V")
    public void method3291(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3293(arg0, var2);
        }
    }

    @ObfuscatedName("gb.v(Leq;II)V")
    public void method3293(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2778 = arg0.method2833();
        }
    }
}
