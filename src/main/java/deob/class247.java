package deob;

@ObfuscatedName("io")
public class class247 extends class183 {

    @ObfuscatedName("io.y")
    public static class155 field3248 = new class155(64);

    @ObfuscatedName("io.w")
    public static class155 field3247 = new class155(64);

    @ObfuscatedName("io.p")
    public int field3250;

    @ObfuscatedName("io.x")
    public int field3259 = 255;

    @ObfuscatedName("io.a")
    public int field3254 = 255;

    @ObfuscatedName("io.d")
    public int field3255 = -1;

    @ObfuscatedName("io.c")
    public int field3246 = 1;

    @ObfuscatedName("io.o")
    public int field3253 = 70;

    @ObfuscatedName("io.v")
    public int field3258 = -1;

    @ObfuscatedName("io.k")
    public int field3257 = -1;

    @ObfuscatedName("io.s")
    public int field3260 = 30;

    @ObfuscatedName("io.l")
    public int field3261 = 0;

    @ObfuscatedName("eh.f(Lhz;Lhz;I)V")
    public static void method3063(class234 arg0, class234 arg1) {
        Statics.field3249 = arg0;
        Statics.field3256 = arg1;
    }

    @ObfuscatedName("ah.i(II)Lio;")
    public static class247 method485(int arg0) {
        class247 var1 = (class247) field3248.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3249.method3752(33, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4073(new class300(var2));
        }
        field3248.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.y(Lkq;B)V")
    public void method4073(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4087(arg0, var2);
        }
    }

    @ObfuscatedName("io.w(Lkq;IB)V")
    public void method4087(class300 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5112();
        } else if (arg1 == 2) {
            this.field3259 = arg0.method5110();
        } else if (arg1 == 3) {
            this.field3254 = arg0.method5110();
        } else if (arg1 == 4) {
            this.field3255 = 0;
        } else if (arg1 == 5) {
            this.field3253 = arg0.method5112();
        } else if (arg1 == 6) {
            arg0.method5110();
        } else if (arg1 == 7) {
            this.field3258 = arg0.method5127();
        } else if (arg1 == 8) {
            this.field3257 = arg0.method5127();
        } else if (arg1 == 11) {
            this.field3255 = arg0.method5112();
        } else if (arg1 == 14) {
            this.field3260 = arg0.method5110();
        } else if (arg1 == 15) {
            this.field3261 = arg0.method5110();
        }
    }

    @ObfuscatedName("io.p(I)Lls;")
    public class325 method4075() {
        if (this.field3258 < 0) {
            return null;
        }
        class325 var1 = (class325) field3247.method3099((long) this.field3258);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = Statics.method4026(Statics.field3256, this.field3258, 0);
        if (var2 != null) {
            field3247.method3101(var2, (long) this.field3258);
        }
        return var2;
    }

    @ObfuscatedName("io.b(I)Lls;")
    public class325 method4076() {
        if (this.field3257 < 0) {
            return null;
        }
        class325 var1 = (class325) field3247.method3099((long) this.field3257);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = Statics.method4026(Statics.field3256, this.field3257, 0);
        if (var2 != null) {
            field3247.method3101(var2, (long) this.field3257);
        }
        return var2;
    }

    @ObfuscatedName("hl.e(B)V")
    public static void method3737() {
        field3248.method3102();
        field3247.method3102();
    }
}
