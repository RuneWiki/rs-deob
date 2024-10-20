package deob;

@ObfuscatedName("iz")
public class class250 extends class202 {

    @ObfuscatedName("iz.z")
    public static class197 field3366 = new class197(256);

    @ObfuscatedName("iz.v")
    public final int field3367;

    @ObfuscatedName("iz.m")
    public int field3379 = -1;

    @ObfuscatedName("iz.b")
    public int field3369 = -1;

    @ObfuscatedName("iz.t")
    public String field3370;

    @ObfuscatedName("iz.p")
    public int field3371;

    @ObfuscatedName("iz.r")
    public int field3372 = 0;

    @ObfuscatedName("iz.u")
    public String[] field3378 = new String[5];

    @ObfuscatedName("iz.n")
    public String field3375;

    @ObfuscatedName("iz.c")
    public int[] field3376;

    @ObfuscatedName("iz.y")
    public int field3368 = Integer.MAX_VALUE;

    @ObfuscatedName("iz.j")
    public int field3364 = Integer.MAX_VALUE;

    @ObfuscatedName("iz.f")
    public int field3386 = Integer.MIN_VALUE;

    @ObfuscatedName("iz.s")
    public int field3377 = Integer.MIN_VALUE;

    @ObfuscatedName("iz.e")
    public class265 field3381 = class265.field3607;

    @ObfuscatedName("iz.q")
    public class247 field3380 = class247.field3345;

    @ObfuscatedName("iz.h")
    public int[] field3383;

    @ObfuscatedName("iz.i")
    public byte[] field3384;

    @ObfuscatedName("iz.o")
    public int field3385 = -1;

    public class250(int arg0) {
        this.field3367 = arg0;
    }

    @ObfuscatedName("iz.d(Lfr;I)V")
    public void method4100(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4101(arg0, var2);
        }
    }

    @ObfuscatedName("iz.x(Lfr;II)V")
    public void method4101(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3379 = arg0.method3184();
        } else if (arg1 == 2) {
            this.field3369 = arg0.method3184();
        } else if (arg1 == 3) {
            this.field3370 = arg0.method3045();
        } else if (arg1 == 4) {
            this.field3371 = arg0.method3235();
        } else if (arg1 == 5) {
            arg0.method3235();
        } else if (arg1 == 6) {
            this.field3372 = arg0.method3204();
        } else if (arg1 == 7) {
            int var3 = arg0.method3204();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3204();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3378[arg1 - 10] = arg0.method3045();
        } else if (arg1 == 15) {
            int var4 = arg0.method3204();
            this.field3376 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3376[var5] = arg0.method3147();
            }
            arg0.method3041();
            int var6 = arg0.method3204();
            this.field3383 = new int[var6];
            for (int var7 = 0; var7 < this.field3383.length; var7++) {
                this.field3383[var7] = arg0.method3041();
            }
            this.field3384 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3384[var8] = arg0.method3236();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3375 = arg0.method3045();
            } else if (arg1 == 18) {
                arg0.method3184();
            } else if (arg1 == 19) {
                this.field3385 = arg0.method3179();
            } else if (arg1 == 21) {
                arg0.method3041();
            } else if (arg1 == 22) {
                arg0.method3041();
            } else if (arg1 == 23) {
                arg0.method3204();
                arg0.method3204();
                arg0.method3204();
            } else if (arg1 == 24) {
                arg0.method3147();
                arg0.method3147();
            } else if (arg1 == 25) {
                arg0.method3184();
            } else if (arg1 == 28) {
                arg0.method3204();
            } else if (arg1 == 29) {
                this.field3381 = (class265) class176.method1702(class265.method230(), arg0.method3204());
            } else if (arg1 == 30) {
                class247[] var9 = new class247[] { class247.field3349, class247.field3345, class247.field3347 };
                this.field3380 = (class247) class176.method1702(var9, arg0.method3204());
            }
        }
    }

    @ObfuscatedName("iz.k(B)V")
    public void method4102() {
        if (this.field3376 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3376.length; var1 += 2) {
            if (this.field3376[var1] < this.field3368) {
                this.field3368 = this.field3376[var1];
            } else if (this.field3376[var1] > this.field3386) {
                this.field3386 = this.field3376[var1];
            }
            if (this.field3376[var1 + 1] < this.field3364) {
                this.field3364 = this.field3376[var1 + 1];
            } else if (this.field3376[var1 + 1] > this.field3377) {
                this.field3377 = this.field3376[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iz.z(ZB)Lky;")
    public class295 method4118(boolean arg0) {
        int var2 = arg0 ? this.field3369 : this.field3379;
        return this.method4119(var2);
    }

    @ObfuscatedName("iz.v(II)Lky;")
    public class295 method4119(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class295 var2 = (class295) field3366.method3418((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class295 var3 = class296.method4769(Statics.field3382, arg0, 0);
        if (var3 != null) {
            field3366.method3417(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iz.m(I)I")
    public int method4105() {
        return this.field3367;
    }

    @ObfuscatedName("bd.b(I)V")
    public static void method1057() {
        field3366.method3422();
    }
}
