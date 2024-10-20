package deob;

@ObfuscatedName("ic")
public class class256 extends class209 {

    @ObfuscatedName("ic.r")
    public static class203 field3299 = new class203(64);

    @ObfuscatedName("ic.e")
    public int field3300 = 0;

    @ObfuscatedName("gd.g(II)Lic;")
    public static class256 method3707(int arg0) {
        class256 var1 = (class256) field3299.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3302.method4438(5, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4596(new class185(var2));
        }
        field3299.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.r(Lgl;I)V")
    public void method4596(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4598(arg0, var2);
        }
    }

    @ObfuscatedName("ic.e(Lgl;II)V")
    public void method4598(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3300 = arg0.method3467();
        }
    }
}
