package deob;

@ObfuscatedName("im")
public class class257 extends class209 {

    @ObfuscatedName("im.o")
    public static class203 field3260 = new class203(64);

    @ObfuscatedName("im.k")
    public int field3261 = 0;

    @ObfuscatedName("cz.v(II)Lim;")
    public static class257 method1871(int arg0) {
        class257 var1 = (class257) field3260.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3262.method4270(16, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4462(new class185(var2));
        }
        field3260.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.s(Lgx;I)V")
    public void method4462(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4466(arg0, var2);
        }
    }

    @ObfuscatedName("im.o(Lgx;II)V")
    public void method4466(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3261 = arg0.method3276();
        }
    }

    @ObfuscatedName("f.k(B)V")
    public static void method307() {
        field3260.method3697();
    }
}
