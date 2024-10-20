package deob;

@ObfuscatedName("jf")
public class class268 extends class209 {

    @ObfuscatedName("jf.l")
    public static class203 field3404 = new class203(64);

    @ObfuscatedName("jf.w")
    public class200 field3403;

    @ObfuscatedName("fn.f(IB)Ljf;")
    public static class268 method3234(int arg0) {
        class268 var1 = (class268) field3404.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3402.method4289(34, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4648(new class185(var2));
        }
        var3.method4654();
        field3404.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.l(S)V")
    public void method4654() {
    }

    @ObfuscatedName("jf.w(Lgm;I)V")
    public void method4648(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4649(arg0, var2);
        }
    }

    @ObfuscatedName("jf.s(Lgm;IB)V")
    public void method4649(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3403 = class265.method1002(arg0, this.field3403);
        }
    }

    @ObfuscatedName("jf.e(III)I")
    public int method4650(int arg0, int arg1) {
        return class265.method944(this.field3403, arg0, arg1);
    }

    @ObfuscatedName("jf.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4658(int arg0, String arg1) {
        class200 var3 = this.field3403;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class198 var5 = (class198) var3.method3706((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2468;
            }
        }
        return var4;
    }
}
