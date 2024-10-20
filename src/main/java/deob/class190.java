package deob;

@ObfuscatedName("gx")
public class class190 extends class130 {

    @ObfuscatedName("gx.i")
    public static class125 field2800 = new class125(64);

    @ObfuscatedName("gx.u")
    public boolean field2801 = false;

    @ObfuscatedName("client.f(Lgb;I)V")
    public static void method558(class183 arg0) {
        Statics.field2802 = arg0;
    }

    @ObfuscatedName("g.i(II)Lgx;")
    public static class190 method189(int arg0) {
        class190 var1 = (class190) field2800.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2802.method3163(15, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3279(new class154(var2));
        }
        field2800.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.u(Leo;I)V")
    public void method3279(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3286(arg0, var2);
        }
    }

    @ObfuscatedName("gx.r(Leo;II)V")
    public void method3286(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2801 = true;
        }
    }
}
