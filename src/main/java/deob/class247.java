package deob;

@ObfuscatedName("ix")
public class class247 extends class176 {

    @ObfuscatedName("ix.t")
    public static class146 field3257 = new class146(64);

    @ObfuscatedName("ix.g")
    public static class146 field3253 = new class146(64);

    @ObfuscatedName("ix.l")
    public int field3254;

    @ObfuscatedName("ix.v")
    public int field3250 = 255;

    @ObfuscatedName("ix.d")
    public int field3258 = 255;

    @ObfuscatedName("ix.z")
    public int field3259 = -1;

    @ObfuscatedName("ix.n")
    public int field3262 = 1;

    @ObfuscatedName("ix.h")
    public int field3261 = 70;

    @ObfuscatedName("ix.f")
    public int field3255 = -1;

    @ObfuscatedName("ix.s")
    public int field3256 = -1;

    @ObfuscatedName("ix.p")
    public int field3264 = 30;

    @ObfuscatedName("ix.e")
    public int field3265 = 0;

    @ObfuscatedName("ia.c(Lhz;Lhz;B)V")
    public static void method4416(class234 arg0, class234 arg1) {
        Statics.field3263 = arg0;
        Statics.field3251 = arg1;
    }

    @ObfuscatedName("ix.x(Lkz;B)V")
    public void method4143(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4135(arg0, var2);
        }
    }

    @ObfuscatedName("ix.t(Lkz;II)V")
    public void method4135(class300 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5304();
        } else if (arg1 == 2) {
            this.field3250 = arg0.method5103();
        } else if (arg1 == 3) {
            this.field3258 = arg0.method5103();
        } else if (arg1 == 4) {
            this.field3259 = 0;
        } else if (arg1 == 5) {
            this.field3261 = arg0.method5304();
        } else if (arg1 == 6) {
            arg0.method5103();
        } else if (arg1 == 7) {
            this.field3255 = arg0.method5261();
        } else if (arg1 == 8) {
            this.field3256 = arg0.method5261();
        } else if (arg1 == 11) {
            this.field3259 = arg0.method5304();
        } else if (arg1 == 14) {
            this.field3264 = arg0.method5103();
        } else if (arg1 == 15) {
            this.field3265 = arg0.method5103();
        }
    }

    @ObfuscatedName("ix.g(B)Lli;")
    public class325 method4136() {
        if (this.field3255 < 0) {
            return null;
        }
        class325 var1 = (class325) field3253.method3061((long) this.field3255);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method5636(Statics.field3251, this.field3255, 0);
        if (var2 != null) {
            field3253.method3062(var2, (long) this.field3255);
        }
        return var2;
    }

    @ObfuscatedName("ix.l(I)Lli;")
    public class325 method4151() {
        if (this.field3256 < 0) {
            return null;
        }
        class325 var1 = (class325) field3253.method3061((long) this.field3256);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method5636(Statics.field3251, this.field3256, 0);
        if (var2 != null) {
            field3253.method3062(var2, (long) this.field3256);
        }
        return var2;
    }

    @ObfuscatedName("ff.u(I)V")
    public static void method3161() {
        field3257.method3063();
        field3253.method3063();
    }
}
