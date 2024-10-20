package deob;

@ObfuscatedName("im")
public class class241 extends class183 {

    @ObfuscatedName("im.y")
    public static class155 field3182 = new class155(64);

    @ObfuscatedName("im.w")
    public int field3181 = 0;

    @ObfuscatedName("ec.i(II)Lim;")
    public static class241 method3055(int arg0) {
        class241 var1 = (class241) field3182.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3180.method3752(16, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method3956(new class300(var2));
        }
        field3182.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.y(Lkq;B)V")
    public void method3956(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method3957(arg0, var2);
        }
    }

    @ObfuscatedName("im.w(Lkq;II)V")
    public void method3957(class300 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3181 = arg0.method5112();
        }
    }

    @ObfuscatedName("bv.p(I)V")
    public static void method1588() {
        field3182.method3102();
    }
}
