package deob;

@ObfuscatedName("ax")
public class class38 extends class175 {

    @ObfuscatedName("ax.b")
    public static class171 field947 = new class171(64);

    @ObfuscatedName("ax.o")
    public int field948;

    @ObfuscatedName("ax.w")
    public int field952;

    @ObfuscatedName("ax.r")
    public int field950;

    @ObfuscatedName("aq.l(II)Lax;")
    public static class38 method791(int arg0) {
        class38 var1 = (class38) field947.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field954.method3029(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method809(new class127(var2));
        }
        field947.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.b(Ldm;I)V")
    public void method809(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method811(arg0, var2);
        }
    }

    @ObfuscatedName("ax.o(Ldm;II)V")
    public void method811(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field948 = arg0.method2442();
            this.field952 = arg0.method2440();
            this.field950 = arg0.method2440();
        }
    }
}
