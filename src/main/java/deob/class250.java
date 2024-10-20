package deob;

@ObfuscatedName("if")
public class class250 extends class202 {

    @ObfuscatedName("if.j")
    public static class197 field3352 = new class197(256);

    @ObfuscatedName("if.v")
    public final int field3353;

    @ObfuscatedName("if.x")
    public int field3354 = -1;

    @ObfuscatedName("if.e")
    public int field3356 = -1;

    @ObfuscatedName("if.l")
    public String field3358;

    @ObfuscatedName("if.b")
    public int field3367;

    @ObfuscatedName("if.n")
    public int field3355 = 0;

    @ObfuscatedName("if.a")
    public String[] field3360 = new String[5];

    @ObfuscatedName("if.y")
    public String field3364;

    @ObfuscatedName("if.w")
    public int[] field3361;

    @ObfuscatedName("if.k")
    public int field3362 = Integer.MAX_VALUE;

    @ObfuscatedName("if.t")
    public int field3363 = Integer.MAX_VALUE;

    @ObfuscatedName("if.h")
    public int field3357 = Integer.MIN_VALUE;

    @ObfuscatedName("if.u")
    public int field3365 = Integer.MIN_VALUE;

    @ObfuscatedName("if.r")
    public class265 field3349 = class265.field3598;

    @ObfuscatedName("if.g")
    public class247 field3350 = class247.field3338;

    @ObfuscatedName("if.z")
    public int[] field3368;

    @ObfuscatedName("if.o")
    public byte[] field3369;

    @ObfuscatedName("if.d")
    public int field3370 = -1;

    public class250(int arg0) {
        this.field3353 = arg0;
    }

    @ObfuscatedName("if.m(Lfv;B)V")
    public void method4100(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4111(arg0, var2);
        }
    }

    @ObfuscatedName("if.p(Lfv;II)V")
    public void method4111(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3354 = arg0.method3028();
        } else if (arg1 == 2) {
            this.field3356 = arg0.method3028();
        } else if (arg1 == 3) {
            this.field3358 = arg0.method3021();
        } else if (arg1 == 4) {
            this.field3367 = arg0.method3075();
        } else if (arg1 == 5) {
            arg0.method3075();
        } else if (arg1 == 6) {
            this.field3355 = arg0.method3012();
        } else if (arg1 == 7) {
            int var3 = arg0.method3012();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3012();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3360[arg1 - 10] = arg0.method3021();
        } else if (arg1 == 15) {
            int var4 = arg0.method3012();
            this.field3361 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3361[var5] = arg0.method3015();
            }
            arg0.method3017();
            int var6 = arg0.method3012();
            this.field3368 = new int[var6];
            for (int var7 = 0; var7 < this.field3368.length; var7++) {
                this.field3368[var7] = arg0.method3017();
            }
            this.field3369 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3369[var8] = arg0.method3013();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3364 = arg0.method3021();
            } else if (arg1 == 18) {
                arg0.method3028();
            } else if (arg1 == 19) {
                this.field3370 = arg0.method3009();
            } else if (arg1 == 21) {
                arg0.method3017();
            } else if (arg1 == 22) {
                arg0.method3017();
            } else if (arg1 == 23) {
                arg0.method3012();
                arg0.method3012();
                arg0.method3012();
            } else if (arg1 == 24) {
                arg0.method3015();
                arg0.method3015();
            } else if (arg1 == 25) {
                arg0.method3028();
            } else if (arg1 == 28) {
                arg0.method3012();
            } else if (arg1 == 29) {
                class265[] var9 = new class265[] { class265.field3602, class265.field3600, class265.field3598 };
                this.field3349 = (class265) class176.method676(var9, arg0.method3012());
            } else if (arg1 == 30) {
                this.field3350 = (class247) class176.method676(class247.method2754(), arg0.method3012());
            }
        }
    }

    @ObfuscatedName("if.i(I)V")
    public void method4102() {
        if (this.field3361 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3361.length; var1 += 2) {
            if (this.field3361[var1] < this.field3362) {
                this.field3362 = this.field3361[var1];
            } else if (this.field3361[var1] > this.field3357) {
                this.field3357 = this.field3361[var1];
            }
            if (this.field3361[var1 + 1] < this.field3363) {
                this.field3363 = this.field3361[var1 + 1];
            } else if (this.field3361[var1 + 1] > this.field3365) {
                this.field3365 = this.field3361[var1 + 1];
            }
        }
    }

    @ObfuscatedName("if.j(ZB)Lkd;")
    public class295 method4119(boolean arg0) {
        int var2 = arg0 ? this.field3356 : this.field3354;
        return this.method4104(var2);
    }

    @ObfuscatedName("if.v(II)Lkd;")
    public class295 method4104(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class295 var2 = (class295) field3352.method3419((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class295 var3 = class296.method166(Statics.field3366, arg0, 0);
        if (var3 != null) {
            field3352.method3418(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("if.x(I)I")
    public int method4116() {
        return this.field3353;
    }
}
