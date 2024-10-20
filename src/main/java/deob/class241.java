package deob;

@ObfuscatedName("ib")
public class class241 extends class176 {

    @ObfuscatedName("ib.b")
    public static class146 field3216 = new class146(64);

    @ObfuscatedName("ib.g")
    public int field3213 = 0;

    @ObfuscatedName("im.u(II)Lib;")
    public static class241 method3998(int arg0) {
        class241 var1 = (class241) field3216.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3215.method3928(16, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method4040(new class300(var2));
        }
        field3216.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.f(Lkg;I)V")
    public void method4040(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4037(arg0, var2);
        }
    }

    @ObfuscatedName("ib.b(Lkg;II)V")
    public void method4037(class300 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3213 = arg0.method5337();
        }
    }

    @ObfuscatedName("gk.g(I)V")
    public static void method3407() {
        field3216.method3075();
    }
}
