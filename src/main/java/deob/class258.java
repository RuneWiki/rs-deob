package deob;

@ObfuscatedName("ix")
public class class258 extends class185 {

    @ObfuscatedName("ix.l")
    public static class155 field3318 = new class155(64);

    @ObfuscatedName("ix.m")
    public static class155 field3308 = new class155(64);

    @ObfuscatedName("ix.z")
    public int field3311;

    @ObfuscatedName("ix.c")
    public int field3312 = 255;

    @ObfuscatedName("ix.u")
    public int field3313 = 255;

    @ObfuscatedName("ix.t")
    public int field3309 = -1;

    @ObfuscatedName("ix.e")
    public int field3315 = 1;

    @ObfuscatedName("ix.o")
    public int field3314 = 70;

    @ObfuscatedName("ix.n")
    public int field3317 = -1;

    @ObfuscatedName("ix.x")
    public int field3316 = -1;

    @ObfuscatedName("ix.p")
    public int field3319 = 30;

    @ObfuscatedName("ix.r")
    public int field3320 = 0;

    @ObfuscatedName("ix.f(Lkb;I)V")
    public void method4226(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4227(arg0, var2);
        }
    }

    @ObfuscatedName("ix.b(Lkb;II)V")
    public void method4227(class311 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5163();
        } else if (arg1 == 2) {
            this.field3312 = arg0.method5276();
        } else if (arg1 == 3) {
            this.field3313 = arg0.method5276();
        } else if (arg1 == 4) {
            this.field3309 = 0;
        } else if (arg1 == 5) {
            this.field3314 = arg0.method5163();
        } else if (arg1 == 6) {
            arg0.method5276();
        } else if (arg1 == 7) {
            this.field3317 = arg0.method5394();
        } else if (arg1 == 8) {
            this.field3316 = arg0.method5394();
        } else if (arg1 == 11) {
            this.field3309 = arg0.method5163();
        } else if (arg1 == 14) {
            this.field3319 = arg0.method5276();
        } else if (arg1 == 15) {
            this.field3320 = arg0.method5276();
        }
    }

    @ObfuscatedName("ix.l(B)Llc;")
    public class336 method4228() {
        if (this.field3317 < 0) {
            return null;
        }
        class336 var1 = (class336) field3308.method3155((long) this.field3317);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method2722(Statics.field3307, this.field3317, 0);
        if (var2 != null) {
            field3308.method3157(var2, (long) this.field3317);
        }
        return var2;
    }

    @ObfuscatedName("ix.m(B)Llc;")
    public class336 method4229() {
        if (this.field3316 < 0) {
            return null;
        }
        class336 var1 = (class336) field3308.method3155((long) this.field3316);
        if (var1 != null) {
            return var1;
        }
        class336 var2 = class337.method2722(Statics.field3307, this.field3316, 0);
        if (var2 != null) {
            field3308.method3157(var2, (long) this.field3316);
        }
        return var2;
    }

    @ObfuscatedName("ac.z(I)V")
    public static void method265() {
        field3318.method3158();
        field3308.method3158();
    }
}
