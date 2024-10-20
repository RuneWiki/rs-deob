package deob;

@ObfuscatedName("ir")
public class class252 extends class195 {

    @ObfuscatedName("ir.m")
    public static class190 field3395 = new class190(64);

    @ObfuscatedName("ir.e")
    public char field3400;

    @ObfuscatedName("ir.t")
    public int field3398;

    @ObfuscatedName("ir.w")
    public String field3399;

    @ObfuscatedName("ir.z")
    public boolean field3397 = true;

    @ObfuscatedName("ho.p(IB)Lir;")
    public static class252 method3691(int arg0) {
        class252 var1 = (class252) field3395.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3396.method3720(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method3998(new class174(var2));
        }
        var3.method4005();
        field3395.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.m(I)V")
    public void method4005() {
    }

    @ObfuscatedName("ir.e(Lfr;I)V")
    public void method3998(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3999(arg0, var2);
        }
    }

    @ObfuscatedName("ir.t(Lfr;IB)V")
    public void method3999(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3400 = class267.method3393(arg0.method2811());
        } else if (arg1 == 2) {
            this.field3398 = arg0.method2803();
        } else if (arg1 == 4) {
            this.field3397 = false;
        } else if (arg1 == 5) {
            this.field3399 = arg0.method2818();
        }
    }

    @ObfuscatedName("ir.w(I)Z")
    public boolean method3997() {
        return this.field3400 == 's';
    }
}
