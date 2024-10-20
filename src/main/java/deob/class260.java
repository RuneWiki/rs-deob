package deob;

@ObfuscatedName("ih")
public class class260 extends class185 {

    @ObfuscatedName("ih.v")
    public static class155 field3326 = new class155(64);

    @ObfuscatedName("ih.d")
    public int field3327;

    @ObfuscatedName("ih.c")
    public int field3328;

    @ObfuscatedName("ih.y")
    public int field3329;

    @ObfuscatedName("bh.n(II)Lih;")
    public static class260 method1081(int arg0) {
        class260 var1 = (class260) field3326.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3331.method4032(14, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4292(new class311(var2));
        }
        field3326.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.v(Lkx;B)V")
    public void method4292(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4293(arg0, var2);
        }
    }

    @ObfuscatedName("ih.d(Lkx;II)V")
    public void method4293(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3327 = arg0.method5247();
            this.field3328 = arg0.method5310();
            this.field3329 = arg0.method5310();
        }
    }
}
