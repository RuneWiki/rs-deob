package deob;

@ObfuscatedName("iy")
public class class259 extends class185 {

    @ObfuscatedName("iy.k")
    public static class155 field3321 = new class155(64);

    @ObfuscatedName("iy.s")
    public int field3325;

    @ObfuscatedName("iy.t")
    public int field3323;

    @ObfuscatedName("iy.i")
    public int field3324;

    @ObfuscatedName("fo.z(II)Liy;")
    public static class259 method3285(int arg0) {
        class259 var1 = (class259) field3321.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3322.method3873(14, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4199(new class310(var2));
        }
        field3321.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.k(Lkf;I)V")
    public void method4199(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4200(arg0, var2);
        }
    }

    @ObfuscatedName("iy.s(Lkf;II)V")
    public void method4200(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3325 = arg0.method5195();
            this.field3323 = arg0.method5193();
            this.field3324 = arg0.method5193();
        }
    }

    @ObfuscatedName("fh.t(I)V")
    public static void method3335() {
        field3321.method3172();
    }
}
