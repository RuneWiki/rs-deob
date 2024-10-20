package deob;

@ObfuscatedName("ir")
public class class245 extends class196 {

    @ObfuscatedName("ir.n")
    public static class191 field3306 = new class191(64);

    @ObfuscatedName("ir.g")
    public boolean field3303 = false;

    @ObfuscatedName("cx.e(Lit;I)V")
    public static void method1614(class237 arg0) {
        Statics.field3302 = arg0;
    }

    @ObfuscatedName("cp.n(II)Lir;")
    public static class245 method1425(int arg0) {
        class245 var1 = (class245) field3306.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3302.method3817(19, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method3999(new class175(var2));
        }
        field3306.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.g(Lfh;I)V")
    public void method3999(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method3998(arg0, var2);
        }
    }

    @ObfuscatedName("ir.y(Lfh;IB)V")
    public void method3998(class175 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3303 = true;
        }
    }
}
