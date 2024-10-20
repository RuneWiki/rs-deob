package deob;

@ObfuscatedName("gd")
public class class187 extends class130 {

    @ObfuscatedName("gd.d")
    public static class125 field2771 = new class125(64);

    @ObfuscatedName("gd.h")
    public int field2775 = 0;

    @ObfuscatedName("u.q(Lgj;I)V")
    public static void method158(class183 arg0) {
        Statics.field2773 = arg0;
    }

    @ObfuscatedName("ga.d(II)Lgd;")
    public static class187 method3202(int arg0) {
        class187 var1 = (class187) field2771.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2773.method3133(5, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3239(new class154(var2));
        }
        field2771.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.h(Lel;B)V")
    public void method3239(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3240(arg0, var2);
        }
    }

    @ObfuscatedName("gd.p(Lel;II)V")
    public void method3240(class154 arg0, int arg1) {
        if (arg1 == 2) {
            this.field2775 = arg0.method2668();
        }
    }
}
