package deob;

@ObfuscatedName("it")
public class class252 extends class176 {

    @ObfuscatedName("it.t")
    public static class146 field3306 = new class146(64);

    @ObfuscatedName("it.o")
    public class317 field3307;

    @ObfuscatedName("br.c(Lii;B)V")
    public static void method1889(class235 arg0) {
        Statics.field3309 = arg0;
    }

    @ObfuscatedName("kz.t(II)Lit;")
    public static class252 method4964(int arg0) {
        class252 var1 = (class252) field3306.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3309.method3845(34, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4206(new class301(var2));
        }
        var3.method4205();
        field3306.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.o(I)V")
    public void method4205() {
    }

    @ObfuscatedName("it.e(Lkp;I)V")
    public void method4206(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4207(arg0, var2);
        }
    }

    @ObfuscatedName("it.i(Lkp;IS)V")
    public void method4207(class301 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3307 = class249.method1064(arg0, this.field3307);
        }
    }

    @ObfuscatedName("it.g(III)I")
    public int method4208(int arg0, int arg1) {
        return Statics.method3365(this.field3307, arg0, arg1);
    }

    @ObfuscatedName("it.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4204(int arg0, String arg1) {
        return class249.method2650(this.field3307, arg0, arg1);
    }

    @ObfuscatedName("ed.l(I)V")
    public static void method3182() {
        field3306.method3103();
    }
}
