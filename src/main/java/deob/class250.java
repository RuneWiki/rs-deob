package deob;

@ObfuscatedName("iu")
public class class250 extends class196 {

    @ObfuscatedName("iu.a")
    public static class191 field3367 = new class191(64);

    @ObfuscatedName("iu.r")
    public static class191 field3366 = new class191(64);

    @ObfuscatedName("iu.o")
    public int field3370;

    @ObfuscatedName("iu.b")
    public int field3365 = 255;

    @ObfuscatedName("iu.k")
    public int field3369 = 255;

    @ObfuscatedName("iu.s")
    public int field3372 = -1;

    @ObfuscatedName("iu.d")
    public int field3373 = 1;

    @ObfuscatedName("iu.l")
    public int field3374 = 70;

    @ObfuscatedName("iu.t")
    public int field3375 = -1;

    @ObfuscatedName("iu.y")
    public int field3376 = -1;

    @ObfuscatedName("iu.v")
    public int field3377 = 30;

    @ObfuscatedName("iu.c")
    public int field3378 = 0;

    @ObfuscatedName("al.i(Lii;Lii;I)V")
    public static void method254(class237 arg0, class237 arg1) {
        Statics.field3371 = arg0;
        Statics.field3368 = arg1;
    }

    @ObfuscatedName("ic.j(IB)Liu;")
    public static class250 method4007(int arg0) {
        class250 var1 = (class250) field3367.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3371.method3824(33, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4075(new class175(var2));
        }
        field3367.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.a(Lfp;B)V")
    public void method4075(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4083(arg0, var2);
        }
    }

    @ObfuscatedName("iu.r(Lfp;II)V")
    public void method4083(class175 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2995();
        } else if (arg1 == 2) {
            this.field3365 = arg0.method2999();
        } else if (arg1 == 3) {
            this.field3369 = arg0.method2999();
        } else if (arg1 == 4) {
            this.field3372 = 0;
        } else if (arg1 == 5) {
            this.field3374 = arg0.method2995();
        } else if (arg1 == 6) {
            arg0.method2999();
        } else if (arg1 == 7) {
            this.field3375 = arg0.method3009();
        } else if (arg1 == 8) {
            this.field3376 = arg0.method3009();
        } else if (arg1 == 11) {
            this.field3372 = arg0.method2995();
        } else if (arg1 == 14) {
            this.field3377 = arg0.method2999();
        } else if (arg1 == 15) {
            this.field3378 = arg0.method2999();
        }
    }

    @ObfuscatedName("iu.o(I)Lkd;")
    public class287 method4078() {
        if (this.field3375 < 0) {
            return null;
        }
        class287 var1 = (class287) field3366.method3347((long) this.field3375);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4185(Statics.field3368, this.field3375, 0);
        if (var2 != null) {
            field3366.method3346(var2, (long) this.field3375);
        }
        return var2;
    }

    @ObfuscatedName("iu.n(I)Lkd;")
    public class287 method4076() {
        if (this.field3376 < 0) {
            return null;
        }
        class287 var1 = (class287) field3366.method3347((long) this.field3376);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4185(Statics.field3368, this.field3376, 0);
        if (var2 != null) {
            field3366.method3346(var2, (long) this.field3376);
        }
        return var2;
    }
}
