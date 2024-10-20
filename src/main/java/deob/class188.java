package deob;

@ObfuscatedName("gg")
public class class188 extends class130 {

    @ObfuscatedName("gg.h")
    public static class125 field2780 = new class125(64);

    @ObfuscatedName("gg.p")
    public int field2781 = 0;

    @ObfuscatedName("fh.q(Lgj;I)V")
    public static void method3092(class183 arg0) {
        Statics.field2778 = arg0;
        Statics.field2783 = Statics.field2778.method3126(16);
    }

    @ObfuscatedName("gj.d(IB)Lgg;")
    public static class188 method3169(int arg0) {
        class188 var1 = (class188) field2780.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2778.method3133(16, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3248(new class154(var2));
        }
        field2780.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.h(Lel;S)V")
    public void method3248(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3250(arg0, var2);
        }
    }

    @ObfuscatedName("gg.p(Lel;IB)V")
    public void method3250(class154 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2781 = arg0.method2668();
        }
    }
}
