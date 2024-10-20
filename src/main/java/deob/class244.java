package deob;

@ObfuscatedName("io")
public class class244 extends class196 {

    @ObfuscatedName("io.y")
    public static class191 field3279 = new class191(256);

    @ObfuscatedName("io.w")
    public final int field3298;

    @ObfuscatedName("io.k")
    public int field3281 = -1;

    @ObfuscatedName("io.v")
    public int field3282 = -1;

    @ObfuscatedName("io.z")
    public String field3283;

    @ObfuscatedName("io.r")
    public int field3284;

    @ObfuscatedName("io.u")
    public int field3285 = 0;

    @ObfuscatedName("io.o")
    public String[] field3286 = new String[5];

    @ObfuscatedName("io.l")
    public String field3276;

    @ObfuscatedName("io.h")
    public int[] field3288;

    @ObfuscatedName("io.s")
    public int field3289 = Integer.MAX_VALUE;

    @ObfuscatedName("io.c")
    public int field3290 = Integer.MAX_VALUE;

    @ObfuscatedName("io.m")
    public int field3291 = Integer.MIN_VALUE;

    @ObfuscatedName("io.a")
    public int field3278 = Integer.MIN_VALUE;

    @ObfuscatedName("io.t")
    public class259 field3292 = class259.field3534;

    @ObfuscatedName("io.p")
    public class241 field3294 = class241.field3259;

    @ObfuscatedName("io.f")
    public int[] field3293;

    @ObfuscatedName("io.b")
    public byte[] field3296;

    @ObfuscatedName("io.x")
    public int field3297 = -1;

    public class244(int arg0) {
        this.field3298 = arg0;
    }

    @ObfuscatedName("ec.e(Lit;Lit;I)Z")
    public static boolean method2711(class237 arg0, class237 arg1) {
        Statics.field3287 = arg1;
        if (!arg0.method3833()) {
            return false;
        }
        Statics.field3280 = arg0.method3828(35);
        Statics.field3277 = new class244[Statics.field3280];
        for (int var2 = 0; var2 < Statics.field3280; var2++) {
            byte[] var3 = arg0.method3817(35, var2);
            if (var3 != null) {
                Statics.field3277[var2] = new class244(var2);
                Statics.field3277[var2].method3987(new class175(var3));
                Statics.field3277[var2].method3977();
            }
        }
        return true;
    }

    @ObfuscatedName("io.n(Lfh;I)V")
    public void method3987(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method3976(arg0, var2);
        }
    }

    @ObfuscatedName("io.g(Lfh;IB)V")
    public void method3976(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3281 = arg0.method2943();
        } else if (arg1 == 2) {
            this.field3282 = arg0.method2943();
        } else if (arg1 == 3) {
            this.field3283 = arg0.method3113();
        } else if (arg1 == 4) {
            this.field3284 = arg0.method2932();
        } else if (arg1 == 5) {
            arg0.method2932();
        } else if (arg1 == 6) {
            this.field3285 = arg0.method2928();
        } else if (arg1 == 7) {
            int var3 = arg0.method2928();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2928();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3286[arg1 - 10] = arg0.method3113();
        } else if (arg1 == 15) {
            int var4 = arg0.method2928();
            this.field3288 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3288[var5] = arg0.method2931();
            }
            arg0.method2933();
            int var6 = arg0.method2928();
            this.field3293 = new int[var6];
            for (int var7 = 0; var7 < this.field3293.length; var7++) {
                this.field3293[var7] = arg0.method2933();
            }
            this.field3296 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3296[var8] = arg0.method2998();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3276 = arg0.method3113();
            } else if (arg1 == 18) {
                arg0.method2943();
            } else if (arg1 == 19) {
                this.field3297 = arg0.method3091();
            } else if (arg1 == 21) {
                arg0.method2933();
            } else if (arg1 == 22) {
                arg0.method2933();
            } else if (arg1 == 23) {
                arg0.method2928();
                arg0.method2928();
                arg0.method2928();
            } else if (arg1 == 24) {
                arg0.method2931();
                arg0.method2931();
            } else if (arg1 == 25) {
                arg0.method2943();
            } else if (arg1 == 28) {
                arg0.method2928();
            } else if (arg1 == 29) {
                this.field3292 = (class259) class170.method2298(class259.method3617(), arg0.method2928());
            } else if (arg1 == 30) {
                this.field3294 = (class241) class170.method2298(Statics.method3793(), arg0.method2928());
            }
        }
    }

    @ObfuscatedName("io.y(B)V")
    public void method3977() {
        if (this.field3288 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3288.length; var1 += 2) {
            if (this.field3288[var1] < this.field3289) {
                this.field3289 = this.field3288[var1];
            } else if (this.field3288[var1] > this.field3291) {
                this.field3291 = this.field3288[var1];
            }
            if (this.field3288[var1 + 1] < this.field3290) {
                this.field3290 = this.field3288[var1 + 1];
            } else if (this.field3288[var1 + 1] > this.field3278) {
                this.field3278 = this.field3288[var1 + 1];
            }
        }
    }

    @ObfuscatedName("io.w(ZB)Lkn;")
    public class287 method3981(boolean arg0) {
        int var2 = arg0 ? this.field3282 : this.field3281;
        return this.method3978(var2);
    }

    @ObfuscatedName("io.k(II)Lkn;")
    public class287 method3978(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class287 var2 = (class287) field3279.method3288((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class287 var3 = class288.method994(Statics.field3287, arg0, 0);
        if (var3 != null) {
            field3279.method3278(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("io.v(I)I")
    public int method3980() {
        return this.field3298;
    }
}
