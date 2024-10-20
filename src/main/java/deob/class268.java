package deob;

@ObfuscatedName("jp")
public class class268 extends class209 {

    @ObfuscatedName("jp.s")
    public static class203 field3362 = new class203(64);

    @ObfuscatedName("jp.o")
    public class200 field3363;

    @ObfuscatedName("q.v(Lis;I)V")
    public static void method209(class250 arg0) {
        Statics.field3364 = arg0;
    }

    @ObfuscatedName("ei.s(II)Ljp;")
    public static class268 method2859(int arg0) {
        class268 var1 = (class268) field3362.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3364.method4270(34, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4639(new class185(var2));
        }
        var3.method4638();
        field3362.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.o(I)V")
    public void method4638() {
    }

    @ObfuscatedName("jp.k(Lgx;I)V")
    public void method4639(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4643(arg0, var2);
        }
    }

    @ObfuscatedName("jp.u(Lgx;II)V")
    public void method4643(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3363 = class265.method172(arg0, this.field3363);
        }
    }

    @ObfuscatedName("jp.i(III)I")
    public int method4640(int arg0, int arg1) {
        return class265.method3063(this.field3363, arg0, arg1);
    }

    @ObfuscatedName("jp.t(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4641(int arg0, String arg1) {
        return class265.method2331(this.field3363, arg0, arg1);
    }
}
