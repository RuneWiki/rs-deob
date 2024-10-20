package deob;

@ObfuscatedName("ij")
public class class252 extends class195 {

    @ObfuscatedName("ij.o")
    public static class190 field3365 = new class190(64);

    @ObfuscatedName("ij.i")
    public char field3360;

    @ObfuscatedName("ij.u")
    public int field3361;

    @ObfuscatedName("ij.g")
    public String field3364;

    @ObfuscatedName("ij.m")
    public boolean field3362 = true;

    @ObfuscatedName("ev.c(Lip;B)V")
    public static void method2603(class236 arg0) {
        Statics.field3363 = arg0;
    }

    @ObfuscatedName("ia.o(IB)Lij;")
    public static class252 method4003(int arg0) {
        class252 var1 = (class252) field3365.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3363.method3741(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4010(new class174(var2));
        }
        var3.method4009();
        field3365.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.i(B)V")
    public void method4009() {
    }

    @ObfuscatedName("ij.u(Lfp;I)V")
    public void method4010(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4011(arg0, var2);
        }
    }

    @ObfuscatedName("ij.g(Lfp;II)V")
    public void method4011(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3360 = class267.method198(arg0.method3014());
        } else if (arg1 == 2) {
            this.field3361 = arg0.method2987();
        } else if (arg1 == 4) {
            this.field3362 = false;
        } else if (arg1 == 5) {
            this.field3364 = arg0.method2867();
        }
    }

    @ObfuscatedName("ij.m(I)Z")
    public boolean method4019() {
        return this.field3360 == 's';
    }
}
