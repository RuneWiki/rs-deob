package deob;

@ObfuscatedName("is")
public class class249 extends class195 {

    @ObfuscatedName("is.e")
    public static class190 field3378 = new class190(64);

    @ObfuscatedName("is.t")
    public static class190 field3374 = new class190(64);

    @ObfuscatedName("is.w")
    public int field3375;

    @ObfuscatedName("is.i")
    public int field3376 = 255;

    @ObfuscatedName("is.f")
    public int field3377 = 255;

    @ObfuscatedName("is.c")
    public int field3385 = -1;

    @ObfuscatedName("is.o")
    public int field3382 = 1;

    @ObfuscatedName("is.q")
    public int field3380 = 70;

    @ObfuscatedName("is.n")
    public int field3381 = -1;

    @ObfuscatedName("is.a")
    public int field3379 = -1;

    @ObfuscatedName("is.g")
    public int field3383 = 30;

    @ObfuscatedName("is.v")
    public int field3384 = 0;

    @ObfuscatedName("z.p(Lil;Lil;B)V")
    public static void method18(class236 arg0, class236 arg1) {
        Statics.field3373 = arg0;
        Statics.field3752 = arg1;
    }

    @ObfuscatedName("is.m(Lfr;B)V")
    public void method3973(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3979(arg0, var2);
        }
    }

    @ObfuscatedName("is.e(Lfr;II)V")
    public void method3979(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2824();
        } else if (arg1 == 2) {
            this.field3376 = arg0.method2810();
        } else if (arg1 == 3) {
            this.field3377 = arg0.method2810();
        } else if (arg1 == 4) {
            this.field3385 = 0;
        } else if (arg1 == 5) {
            this.field3380 = arg0.method2824();
        } else if (arg1 == 6) {
            arg0.method2810();
        } else if (arg1 == 7) {
            this.field3381 = arg0.method2825();
        } else if (arg1 == 8) {
            this.field3379 = arg0.method2825();
        } else if (arg1 == 11) {
            this.field3385 = arg0.method2824();
        } else if (arg1 == 14) {
            this.field3383 = arg0.method2810();
        } else if (arg1 == 15) {
            this.field3384 = arg0.method2810();
        }
    }

    @ObfuscatedName("is.t(I)Ljy;")
    public class286 method3977() {
        if (this.field3381 < 0) {
            return null;
        }
        class286 var1 = (class286) field3374.method3182((long) this.field3381);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4306(Statics.field3752, this.field3381, 0);
        if (var2 != null) {
            field3374.method3179(var2, (long) this.field3381);
        }
        return var2;
    }

    @ObfuscatedName("is.w(I)Ljy;")
    public class286 method3975() {
        if (this.field3379 < 0) {
            return null;
        }
        class286 var1 = (class286) field3374.method3182((long) this.field3379);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4306(Statics.field3752, this.field3379, 0);
        if (var2 != null) {
            field3374.method3179(var2, (long) this.field3379);
        }
        return var2;
    }
}
