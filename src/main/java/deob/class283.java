package deob;

@ObfuscatedName("jg")
public class class283 extends class346 {

    @ObfuscatedName("jg.u")
    public static class199 field3442 = new class199(64);

    @ObfuscatedName("jg.p")
    public static class199 field3445 = new class199(64);

    @ObfuscatedName("jg.b")
    public int field3446;

    @ObfuscatedName("jg.g")
    public int field3447 = 255;

    @ObfuscatedName("jg.h")
    public int field3448 = 255;

    @ObfuscatedName("jg.n")
    public int field3456 = -1;

    @ObfuscatedName("jg.l")
    public int field3450 = 1;

    @ObfuscatedName("jg.m")
    public int field3451 = 70;

    @ObfuscatedName("jg.d")
    public int field3452 = -1;

    @ObfuscatedName("jg.c")
    public int field3453 = -1;

    @ObfuscatedName("jg.j")
    public int field3449 = 30;

    @ObfuscatedName("jg.r")
    public int field3454 = 0;

    @ObfuscatedName("ge.f(Lir;Lir;S)V")
    public static void method3338(class253 arg0, class253 arg1) {
        Statics.field3455 = arg0;
        Statics.field3443 = arg1;
    }

    @ObfuscatedName("jg.o(Lnu;I)V")
    public void method4402(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4413(arg0, var2);
        }
    }

    @ObfuscatedName("jg.u(Lnu;II)V")
    public void method4413(class382 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5858();
        } else if (arg1 == 2) {
            this.field3447 = arg0.method5856();
        } else if (arg1 == 3) {
            this.field3448 = arg0.method5856();
        } else if (arg1 == 4) {
            this.field3456 = 0;
        } else if (arg1 == 5) {
            this.field3451 = arg0.method5858();
        } else if (arg1 == 6) {
            arg0.method5856();
        } else if (arg1 == 7) {
            this.field3452 = arg0.method5873();
        } else if (arg1 == 8) {
            this.field3453 = arg0.method5873();
        } else if (arg1 == 11) {
            this.field3456 = arg0.method5858();
        } else if (arg1 == 14) {
            this.field3449 = arg0.method5856();
        } else if (arg1 == 15) {
            this.field3454 = arg0.method5856();
        }
    }

    @ObfuscatedName("jg.p(I)Loh;")
    public class395 method4403() {
        if (this.field3452 < 0) {
            return null;
        }
        class395 var1 = (class395) field3445.method3398((long) this.field3452);
        if (var1 != null) {
            return var1;
        }
        class395 var2 = class396.method3341(Statics.field3443, this.field3452, 0);
        if (var2 != null) {
            field3445.method3400(var2, (long) this.field3452);
        }
        return var2;
    }

    @ObfuscatedName("jg.b(I)Loh;")
    public class395 method4406() {
        if (this.field3453 < 0) {
            return null;
        }
        class395 var1 = (class395) field3445.method3398((long) this.field3453);
        if (var1 != null) {
            return var1;
        }
        class395 var2 = class396.method3341(Statics.field3443, this.field3453, 0);
        if (var2 != null) {
            field3445.method3400(var2, (long) this.field3453);
        }
        return var2;
    }
}
