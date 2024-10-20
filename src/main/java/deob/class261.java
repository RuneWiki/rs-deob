package deob;

@ObfuscatedName("ja")
public class class261 extends class214 {

    @ObfuscatedName("ja.s")
    public static class208 field3312 = new class208(64);

    @ObfuscatedName("ja.g")
    public int field3313 = 0;

    @ObfuscatedName("iy.a(II)Lja;")
    public static class261 method4318(int arg0) {
        class261 var1 = (class261) field3312.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3311.method4422(5, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4586(new class190(var2));
        }
        field3312.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ja.s(Lgx;B)V")
    public void method4586(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4587(arg0, var2);
        }
    }

    @ObfuscatedName("ja.g(Lgx;II)V")
    public void method4587(class190 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3313 = arg0.method3610();
        }
    }
}
