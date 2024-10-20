package deob;

@ObfuscatedName("iu")
public class class242 extends class195 {

    @ObfuscatedName("iu.e")
    public static class190 field3295 = new class190(64);

    @ObfuscatedName("iu.t")
    public int field3296 = 0;

    @ObfuscatedName("u.p(II)Liu;")
    public static class242 method194(int arg0) {
        class242 var1 = (class242) field3295.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3294.method3720(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method3856(new class174(var2));
        }
        field3295.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.m(Lfr;B)V")
    public void method3856(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3862(arg0, var2);
        }
    }

    @ObfuscatedName("iu.e(Lfr;II)V")
    public void method3862(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3296 = arg0.method2824();
        }
    }
}
