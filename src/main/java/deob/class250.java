package deob;

@ObfuscatedName("ib")
public class class250 extends class202 {

    @ObfuscatedName("ib.g")
    public static class197 field3348 = new class197(256);

    @ObfuscatedName("ib.x")
    public final int field3349;

    @ObfuscatedName("ib.f")
    public int field3363 = -1;

    @ObfuscatedName("ib.u")
    public int field3351 = -1;

    @ObfuscatedName("ib.t")
    public String field3359;

    @ObfuscatedName("ib.k")
    public int field3353;

    @ObfuscatedName("ib.n")
    public int field3360 = 0;

    @ObfuscatedName("ib.o")
    public String[] field3350 = new String[5];

    @ObfuscatedName("ib.a")
    public String field3354;

    @ObfuscatedName("ib.q")
    public int[] field3357;

    @ObfuscatedName("ib.j")
    public int field3358 = Integer.MAX_VALUE;

    @ObfuscatedName("ib.m")
    public int field3356 = Integer.MAX_VALUE;

    @ObfuscatedName("ib.h")
    public int field3355 = Integer.MIN_VALUE;

    @ObfuscatedName("ib.c")
    public int field3361 = Integer.MIN_VALUE;

    @ObfuscatedName("ib.y")
    public class265 field3362 = class265.field3597;

    @ObfuscatedName("ib.p")
    public class247 field3345 = class247.field3327;

    @ObfuscatedName("ib.i")
    public int[] field3364;

    @ObfuscatedName("ib.l")
    public byte[] field3365;

    @ObfuscatedName("ib.z")
    public int field3366 = -1;

    public class250(int arg0) {
        this.field3349 = arg0;
    }

    @ObfuscatedName("ib.b(Lfs;B)V")
    public void method3965(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method3966(arg0, var2);
        }
    }

    @ObfuscatedName("ib.s(Lfs;II)V")
    public void method3966(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3363 = arg0.method2960();
        } else if (arg1 == 2) {
            this.field3351 = arg0.method2960();
        } else if (arg1 == 3) {
            this.field3359 = arg0.method2953();
        } else if (arg1 == 4) {
            this.field3353 = arg0.method3010();
        } else if (arg1 == 5) {
            arg0.method3010();
        } else if (arg1 == 6) {
            this.field3360 = arg0.method2945();
        } else if (arg1 == 7) {
            int var3 = arg0.method2945();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2945();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3350[arg1 - 10] = arg0.method2953();
        } else if (arg1 == 15) {
            int var4 = arg0.method2945();
            this.field3357 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3357[var5] = arg0.method3050();
            }
            arg0.method2996();
            int var6 = arg0.method2945();
            this.field3364 = new int[var6];
            for (int var7 = 0; var7 < this.field3364.length; var7++) {
                this.field3364[var7] = arg0.method2996();
            }
            this.field3365 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3365[var8] = arg0.method2946();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3354 = arg0.method2953();
            } else if (arg1 == 18) {
                arg0.method2960();
            } else if (arg1 == 19) {
                this.field3366 = arg0.method3081();
            } else if (arg1 == 21) {
                arg0.method2996();
            } else if (arg1 == 22) {
                arg0.method2996();
            } else if (arg1 == 23) {
                arg0.method2945();
                arg0.method2945();
                arg0.method2945();
            } else if (arg1 == 24) {
                arg0.method3050();
                arg0.method3050();
            } else if (arg1 == 25) {
                arg0.method2960();
            } else if (arg1 == 28) {
                arg0.method2945();
            } else if (arg1 == 29) {
                class265[] var9 = new class265[] { class265.field3596, class265.field3597, class265.field3595 };
                this.field3362 = (class265) class176.method2719(var9, arg0.method2945());
            } else if (arg1 == 30) {
                this.field3345 = (class247) class176.method2719(class247.method3807(), arg0.method2945());
            }
        }
    }

    @ObfuscatedName("ib.r(I)V")
    public void method3967() {
        if (this.field3357 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3357.length; var1 += 2) {
            if (this.field3357[var1] < this.field3358) {
                this.field3358 = this.field3357[var1];
            } else if (this.field3357[var1] > this.field3355) {
                this.field3355 = this.field3357[var1];
            }
            if (this.field3357[var1 + 1] < this.field3356) {
                this.field3356 = this.field3357[var1 + 1];
            } else if (this.field3357[var1 + 1] > this.field3361) {
                this.field3361 = this.field3357[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ib.g(ZI)Lkb;")
    public class295 method3972(boolean arg0) {
        int var2 = arg0 ? this.field3351 : this.field3363;
        return this.method3969(var2);
    }

    @ObfuscatedName("ib.x(II)Lkb;")
    public class295 method3969(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class295 var2 = (class295) field3348.method3330((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class295 var3 = class296.method2845(Statics.field3352, arg0, 0);
        if (var3 != null) {
            field3348.method3332(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ib.f(S)I")
    public int method3970() {
        return this.field3349;
    }

    @ObfuscatedName("gd.u(I)V")
    public static void method3235() {
        field3348.method3333();
    }
}
