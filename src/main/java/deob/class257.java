package deob;

@ObfuscatedName("ir")
public class class257 extends class185 {

    @ObfuscatedName("ir.s")
    public static class155 field3303 = new class155(64);

    @ObfuscatedName("ir.t")
    public static class155 field3305 = new class155(64);

    @ObfuscatedName("ir.i")
    public int field3315;

    @ObfuscatedName("ir.w")
    public int field3308 = 255;

    @ObfuscatedName("ir.g")
    public int field3317 = 255;

    @ObfuscatedName("ir.m")
    public int field3310 = -1;

    @ObfuscatedName("ir.n")
    public int field3311 = 1;

    @ObfuscatedName("ir.d")
    public int field3312 = 70;

    @ObfuscatedName("ir.h")
    public int field3313 = -1;

    @ObfuscatedName("ir.a")
    public int field3314 = -1;

    @ObfuscatedName("ir.q")
    public int field3307 = 30;

    @ObfuscatedName("ir.c")
    public int field3316 = 0;

    @ObfuscatedName("gg.z(IB)Lir;")
    public static class257 method3468(int arg0) {
        class257 var1 = (class257) field3303.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3309.method3873(33, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4173(new class310(var2));
        }
        field3303.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.k(Lkf;I)V")
    public void method4173(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4174(arg0, var2);
        }
    }

    @ObfuscatedName("ir.s(Lkf;II)V")
    public void method4174(class310 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5195();
        } else if (arg1 == 2) {
            this.field3308 = arg0.method5193();
        } else if (arg1 == 3) {
            this.field3317 = arg0.method5193();
        } else if (arg1 == 4) {
            this.field3310 = 0;
        } else if (arg1 == 5) {
            this.field3312 = arg0.method5195();
        } else if (arg1 == 6) {
            arg0.method5193();
        } else if (arg1 == 7) {
            this.field3313 = arg0.method5210();
        } else if (arg1 == 8) {
            this.field3314 = arg0.method5210();
        } else if (arg1 == 11) {
            this.field3310 = arg0.method5195();
        } else if (arg1 == 14) {
            this.field3307 = arg0.method5193();
        } else if (arg1 == 15) {
            this.field3316 = arg0.method5193();
        }
    }

    @ObfuscatedName("ir.t(I)Llp;")
    public class335 method4175() {
        if (this.field3313 < 0) {
            return null;
        }
        class335 var1 = (class335) field3305.method3170((long) this.field3313);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method4791(Statics.field3302, this.field3313, 0);
        if (var2 != null) {
            field3305.method3169(var2, (long) this.field3313);
        }
        return var2;
    }

    @ObfuscatedName("ir.i(B)Llp;")
    public class335 method4176() {
        if (this.field3314 < 0) {
            return null;
        }
        class335 var1 = (class335) field3305.method3170((long) this.field3314);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method4791(Statics.field3302, this.field3314, 0);
        if (var2 != null) {
            field3305.method3169(var2, (long) this.field3314);
        }
        return var2;
    }
}
