package deob;

@ObfuscatedName("ik")
public class class257 extends class185 {

    @ObfuscatedName("ik.q")
    public static class155 field3312 = new class155(64);

    @ObfuscatedName("ik.j")
    public static class155 field3309 = new class155(64);

    @ObfuscatedName("ik.p")
    public int field3313;

    @ObfuscatedName("ik.u")
    public int field3311 = 255;

    @ObfuscatedName("ik.a")
    public int field3316 = 255;

    @ObfuscatedName("ik.z")
    public int field3317 = -1;

    @ObfuscatedName("ik.w")
    public int field3318 = 1;

    @ObfuscatedName("ik.y")
    public int field3319 = 70;

    @ObfuscatedName("ik.c")
    public int field3320 = -1;

    @ObfuscatedName("ik.h")
    public int field3327 = -1;

    @ObfuscatedName("ik.k")
    public int field3322 = 30;

    @ObfuscatedName("ik.r")
    public int field3323 = 0;

    @ObfuscatedName("gx.m(II)Lik;")
    public static class257 method3397(int arg0) {
        class257 var1 = (class257) field3312.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3310.method3891(33, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4221(new class310(var2));
        }
        field3312.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.o(Lkn;I)V")
    public void method4221(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4222(arg0, var2);
        }
    }

    @ObfuscatedName("ik.q(Lkn;II)V")
    public void method4222(class310 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5283();
        } else if (arg1 == 2) {
            this.field3311 = arg0.method5227();
        } else if (arg1 == 3) {
            this.field3316 = arg0.method5227();
        } else if (arg1 == 4) {
            this.field3317 = 0;
        } else if (arg1 == 5) {
            this.field3319 = arg0.method5283();
        } else if (arg1 == 6) {
            arg0.method5227();
        } else if (arg1 == 7) {
            this.field3320 = arg0.method5353();
        } else if (arg1 == 8) {
            this.field3327 = arg0.method5353();
        } else if (arg1 == 11) {
            this.field3317 = arg0.method5283();
        } else if (arg1 == 14) {
            this.field3322 = arg0.method5227();
        } else if (arg1 == 15) {
            this.field3323 = arg0.method5227();
        }
    }

    @ObfuscatedName("ik.j(I)Llz;")
    public class335 method4223() {
        if (this.field3320 < 0) {
            return null;
        }
        class335 var1 = (class335) field3309.method3127((long) this.field3320);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method837(Statics.field3326, this.field3320, 0);
        if (var2 != null) {
            field3309.method3137(var2, (long) this.field3320);
        }
        return var2;
    }

    @ObfuscatedName("ik.p(I)Llz;")
    public class335 method4224() {
        if (this.field3327 < 0) {
            return null;
        }
        class335 var1 = (class335) field3309.method3127((long) this.field3327);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method837(Statics.field3326, this.field3327, 0);
        if (var2 != null) {
            field3309.method3137(var2, (long) this.field3327);
        }
        return var2;
    }

    @ObfuscatedName("ax.g(I)V")
    public static void method306() {
        field3312.method3130();
        field3309.method3130();
    }
}
