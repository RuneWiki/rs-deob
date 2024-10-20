package deob;

@ObfuscatedName("im")
public class class257 extends class209 {

    @ObfuscatedName("im.e")
    public static class203 field3305 = new class203(64);

    @ObfuscatedName("im.q")
    public int field3306 = 0;

    @ObfuscatedName("fw.g(Liu;I)V")
    public static void method3223(class250 arg0) {
        Statics.field3304 = arg0;
        Statics.field3303 = Statics.field3304.method4496(16);
    }

    @ObfuscatedName("en.r(IB)Lim;")
    public static class257 method3104(int arg0) {
        class257 var1 = (class257) field3305.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3304.method4438(16, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4611(new class185(var2));
        }
        field3305.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.e(Lgl;I)V")
    public void method4611(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4612(arg0, var2);
        }
    }

    @ObfuscatedName("im.q(Lgl;II)V")
    public void method4612(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3306 = arg0.method3467();
        }
    }

    @ObfuscatedName("bf.c(I)V")
    public static void method1090() {
        field3305.method3880();
    }
}
