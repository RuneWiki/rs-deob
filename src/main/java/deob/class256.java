package deob;

@ObfuscatedName("ii")
public class class256 extends class209 {

    @ObfuscatedName("ii.s")
    public static class203 field3257 = new class203(64);

    @ObfuscatedName("ii.o")
    public int field3258 = 0;

    @ObfuscatedName("bg.v(IB)Lii;")
    public static class256 method972(int arg0) {
        class256 var1 = (class256) field3257.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3256.method4270(5, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4450(new class185(var2));
        }
        field3257.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.s(Lgx;I)V")
    public void method4450(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4453(arg0, var2);
        }
    }

    @ObfuscatedName("ii.o(Lgx;II)V")
    public void method4453(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3258 = arg0.method3276();
        }
    }
}
