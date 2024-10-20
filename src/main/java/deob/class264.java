package deob;

@ObfuscatedName("jd")
public class class264 extends class206 {

    @ObfuscatedName("jd.i")
    public static class201 field3454 = new class201(64);

    @ObfuscatedName("jd.w")
    public class198 field3455;

    @ObfuscatedName("eo.p(Lik;I)V")
    public static void method2807(class247 arg0) {
        Statics.field3456 = arg0;
    }

    @ObfuscatedName("er.i(II)Ljd;")
    public static class264 method2545(int arg0) {
        class264 var1 = (class264) field3454.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3456.method4032(34, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4359(new class185(var2));
        }
        var3.method4363();
        field3454.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.w(I)V")
    public void method4363() {
    }

    @ObfuscatedName("jd.s(Lgj;I)V")
    public void method4359(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4360(arg0, var2);
        }
    }

    @ObfuscatedName("jd.j(Lgj;II)V")
    public void method4360(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3455 = class261.method3985(arg0, this.field3455);
        }
    }

    @ObfuscatedName("jd.a(III)I")
    public int method4361(int arg0, int arg1) {
        return class261.method3004(this.field3455, arg0, arg1);
    }

    @ObfuscatedName("jd.t(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4362(int arg0, String arg1) {
        return class261.method997(this.field3455, arg0, arg1);
    }
}
