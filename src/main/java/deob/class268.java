package deob;

@ObfuscatedName("ji")
public class class268 extends class209 {

    @ObfuscatedName("ji.r")
    public static class203 field3414 = new class203(64);

    @ObfuscatedName("ji.e")
    public class200 field3411;

    @ObfuscatedName("em.g(Liu;I)V")
    public static void method3044(class250 arg0) {
        Statics.field3412 = arg0;
    }

    @ObfuscatedName("ez.r(II)Lji;")
    public static class268 method3075(int arg0) {
        class268 var1 = (class268) field3414.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3412.method4438(34, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4791(new class185(var2));
        }
        var3.method4788();
        field3414.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.e(I)V")
    public void method4788() {
    }

    @ObfuscatedName("ji.q(Lgl;B)V")
    public void method4791(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4810(arg0, var2);
        }
    }

    @ObfuscatedName("ji.c(Lgl;IB)V")
    public void method4810(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3411 = Statics.method4265(arg0, this.field3411);
        }
    }

    @ObfuscatedName("ji.i(III)I")
    public int method4787(int arg0, int arg1) {
        return class265.method3138(this.field3411, arg0, arg1);
    }

    @ObfuscatedName("ji.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4792(int arg0, String arg1) {
        return class265.method3140(this.field3411, arg0, arg1);
    }

    @ObfuscatedName("bs.m(I)V")
    public static void method994() {
        field3414.method3880();
    }
}
