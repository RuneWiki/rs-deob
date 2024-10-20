package deob;

@ObfuscatedName("ir")
public class class256 extends class209 {

    @ObfuscatedName("ir.c")
    public static class203 field3278 = new class203(64);

    @ObfuscatedName("ir.n")
    public int field3276 = 0;

    @ObfuscatedName("az.y(II)Lir;")
    public static class256 method662(int arg0) {
        class256 var1 = (class256) field3278.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1.method4263(5, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4429(new class185(var2));
        }
        field3278.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.c(Lge;B)V")
    public void method4429(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4436(arg0, var2);
        }
    }

    @ObfuscatedName("ir.n(Lge;II)V")
    public void method4436(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3276 = arg0.method3280();
        }
    }
}
