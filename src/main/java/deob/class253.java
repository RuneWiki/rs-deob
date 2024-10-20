package deob;

@ObfuscatedName("iu")
public class class253 extends class195 {

    @ObfuscatedName("iu.k")
    public static class190 field3396 = new class190(64);

    @ObfuscatedName("iu.e")
    public class187 field3395;

    @ObfuscatedName("ht.d(Lit;B)V")
    public static void method3690(class236 arg0) {
        Statics.field3398 = arg0;
    }

    @ObfuscatedName("hz.k(II)Liu;")
    public static class253 method3870(int arg0) {
        class253 var1 = (class253) field3396.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3398.method3875(34, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4197(new class174(var2));
        }
        var3.method4189();
        field3396.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.e(S)V")
    public void method4189() {
    }

    @ObfuscatedName("iu.p(Lfg;B)V")
    public void method4197(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4209(arg0, var2);
        }
    }

    @ObfuscatedName("iu.q(Lfg;II)V")
    public void method4209(class174 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3395 = class250.method535(arg0, this.field3395);
        }
    }

    @ObfuscatedName("iu.s(III)I")
    public int method4192(int arg0, int arg1) {
        return class250.method3871(this.field3395, arg0, arg1);
    }

    @ObfuscatedName("iu.r(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4193(int arg0, String arg1) {
        return class250.method1625(this.field3395, arg0, arg1);
    }

    @ObfuscatedName("fl.g(I)V")
    public static void method2788() {
        field3396.method3345();
    }
}
