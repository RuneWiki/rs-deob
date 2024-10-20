package deob;

@ObfuscatedName("jc")
public class class276 extends class219 {

    @ObfuscatedName("jc.n")
    public static class213 field3528 = new class213(64);

    @ObfuscatedName("jc.r")
    public static class213 field3518 = new class213(64);

    @ObfuscatedName("jc.e")
    public int field3519;

    @ObfuscatedName("jc.s")
    public int field3522 = 255;

    @ObfuscatedName("jc.p")
    public int field3527 = 255;

    @ObfuscatedName("jc.x")
    public int field3524 = -1;

    @ObfuscatedName("jc.m")
    public int field3525 = 1;

    @ObfuscatedName("jc.h")
    public int field3526 = 70;

    @ObfuscatedName("jc.t")
    public int field3532 = -1;

    @ObfuscatedName("jc.i")
    public int field3523 = -1;

    @ObfuscatedName("jc.u")
    public int field3529 = 30;

    @ObfuscatedName("jc.q")
    public int field3530 = 0;

    @ObfuscatedName("jc.d(Lgy;I)V")
    public void method4586(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4587(arg0, var2);
        }
    }

    @ObfuscatedName("jc.z(Lgy;II)V")
    public void method4587(class195 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3269();
        } else if (arg1 == 2) {
            this.field3522 = arg0.method3330();
        } else if (arg1 == 3) {
            this.field3527 = arg0.method3330();
        } else if (arg1 == 4) {
            this.field3524 = 0;
        } else if (arg1 == 5) {
            this.field3526 = arg0.method3269();
        } else if (arg1 == 6) {
            arg0.method3330();
        } else if (arg1 == 7) {
            this.field3532 = arg0.method3295();
        } else if (arg1 == 8) {
            this.field3523 = arg0.method3295();
        } else if (arg1 == 11) {
            this.field3524 = arg0.method3269();
        } else if (arg1 == 14) {
            this.field3529 = arg0.method3330();
        } else if (arg1 == 15) {
            this.field3530 = arg0.method3330();
        }
    }

    @ObfuscatedName("jc.n(I)Lly;")
    public class332 method4588() {
        if (this.field3532 < 0) {
            return null;
        }
        class332 var1 = (class332) field3518.method3707((long) this.field3532);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method560(Statics.field3517, this.field3532, 0);
        if (var2 != null) {
            field3518.method3697(var2, (long) this.field3532);
        }
        return var2;
    }

    @ObfuscatedName("jc.r(I)Lly;")
    public class332 method4589() {
        if (this.field3523 < 0) {
            return null;
        }
        class332 var1 = (class332) field3518.method3707((long) this.field3523);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method560(Statics.field3517, this.field3523, 0);
        if (var2 != null) {
            field3518.method3697(var2, (long) this.field3523);
        }
        return var2;
    }

    @ObfuscatedName("fj.e(B)V")
    public static void method3150() {
        field3528.method3700();
        field3518.method3700();
    }
}
