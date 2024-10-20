package deob;

@ObfuscatedName("iu")
public class class259 extends class185 {

    @ObfuscatedName("iu.m")
    public static class155 field3289 = new class155(64);

    @ObfuscatedName("iu.k")
    public int field3294;

    @ObfuscatedName("iu.d")
    public int field3291;

    @ObfuscatedName("iu.w")
    public int field3288;

    @ObfuscatedName("hg.x(IS)Liu;")
    public static class259 method3694(int arg0) {
        class259 var1 = (class259) field3289.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3292.method3869(14, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4168(new class310(var2));
        }
        field3289.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.m(Lkb;B)V")
    public void method4168(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4169(arg0, var2);
        }
    }

    @ObfuscatedName("iu.k(Lkb;II)V")
    public void method4169(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3294 = arg0.method5139();
            this.field3291 = arg0.method5137();
            this.field3288 = arg0.method5137();
        }
    }

    @ObfuscatedName("hy.d(I)V")
    public static void method3632() {
        field3289.method3141();
    }
}
