package deob;

@ObfuscatedName("ig")
public class class241 extends class195 {

    @ObfuscatedName("ig.p")
    public static class190 field3285 = new class190(64);

    @ObfuscatedName("ig.i")
    public int field3286 = 0;

    @ObfuscatedName("cb.n(II)Lig;")
    public static class241 method1551(int arg0) {
        class241 var1 = (class241) field3285.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3284.method3880(5, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method3981(new class174(var2));
        }
        field3285.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.p(Lfl;I)V")
    public void method3981(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method3984(arg0, var2);
        }
    }

    @ObfuscatedName("ig.i(Lfl;II)V")
    public void method3984(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3286 = arg0.method3065();
        }
    }
}
