package deob;

@ObfuscatedName("go")
public class class188 extends class130 {

    @ObfuscatedName("go.i")
    public static class125 field2770 = new class125(64);

    @ObfuscatedName("go.t")
    public int field2768 = 0;

    @ObfuscatedName("fj.b(Lgj;I)V")
    public static void method3027(class183 arg0) {
        Statics.field2771 = arg0;
        Statics.field2769 = Statics.field2771.method3200(16);
    }

    @ObfuscatedName("dd.l(II)Lgo;")
    public static class188 method2024(int arg0) {
        class188 var1 = (class188) field2770.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2771.method3226(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3305(new class154(var2));
        }
        field2770.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("go.i(Leg;B)V")
    public void method3305(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3297(arg0, var2);
        }
    }

    @ObfuscatedName("go.t(Leg;IS)V")
    public void method3297(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2768 = arg0.method2801();
        }
    }
}
