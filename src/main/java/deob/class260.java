package deob;

@ObfuscatedName("ii")
public class class260 extends class209 {

    @ObfuscatedName("ii.c")
    public static class203 field3312 = new class203(64);

    @ObfuscatedName("ii.n")
    public boolean field3313 = false;

    @ObfuscatedName("ca.y(IB)Lii;")
    public static class260 method1792(int arg0) {
        class260 var1 = (class260) field3312.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3316.method4263(15, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4483(new class185(var2));
        }
        field3312.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.c(Lge;B)V")
    public void method4483(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4482(arg0, var2);
        }
    }

    @ObfuscatedName("ii.n(Lge;II)V")
    public void method4482(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3313 = true;
        }
    }
}
