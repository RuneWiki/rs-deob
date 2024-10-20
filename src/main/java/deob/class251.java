package deob;

@ObfuscatedName("is")
public class class251 extends class183 {

    @ObfuscatedName("is.i")
    public static class155 field3278 = new class155(64);

    @ObfuscatedName("is.y")
    public class316 field3280;

    @ObfuscatedName("ce.f(Lhz;I)V")
    public static void method2040(class234 arg0) {
        Statics.field3281 = arg0;
    }

    @ObfuscatedName("ix.i(II)Lis;")
    public static class251 method4071(int arg0) {
        class251 var1 = (class251) field3278.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3281.method3752(34, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4156(new class300(var2));
        }
        var3.method4161();
        field3278.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.y(I)V")
    public void method4161() {
    }

    @ObfuscatedName("is.w(Lkq;I)V")
    public void method4156(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4143(arg0, var2);
        }
    }

    @ObfuscatedName("is.p(Lkq;IB)V")
    public void method4143(class300 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3280 = class248.method3588(arg0, this.field3280);
        }
    }

    @ObfuscatedName("is.b(III)I")
    public int method4144(int arg0, int arg1) {
        return class248.method1895(this.field3280, arg0, arg1);
    }

    @ObfuscatedName("is.e(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4145(int arg0, String arg1) {
        return class248.method131(this.field3280, arg0, arg1);
    }

    @ObfuscatedName("v.x(B)V")
    public static void method126() {
        field3278.method3102();
    }
}
