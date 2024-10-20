package deob;

@ObfuscatedName("ie")
public class class244 extends class196 {

    @ObfuscatedName("ie.p")
    public static class191 field3279 = new class191(256);

    @ObfuscatedName("ie.x")
    public final int field3288;

    @ObfuscatedName("ie.g")
    public int field3281 = -1;

    @ObfuscatedName("ie.c")
    public int field3293 = -1;

    @ObfuscatedName("ie.l")
    public String field3280;

    @ObfuscatedName("ie.w")
    public int field3284;

    @ObfuscatedName("ie.b")
    public int field3282 = 0;

    @ObfuscatedName("ie.m")
    public String[] field3286 = new String[5];

    @ObfuscatedName("ie.i")
    public String field3287;

    @ObfuscatedName("ie.s")
    public int[] field3277;

    @ObfuscatedName("ie.r")
    public int field3276 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.e")
    public int field3290 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.a")
    public int field3291 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.v")
    public int field3283 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.t")
    public class259 field3294 = class259.field3536;

    @ObfuscatedName("ie.y")
    public class241 field3292 = class241.field3259;

    @ObfuscatedName("ie.z")
    public int[] field3295;

    @ObfuscatedName("ie.u")
    public byte[] field3296;

    @ObfuscatedName("ie.k")
    public int field3297 = -1;

    public class244(int arg0) {
        this.field3288 = arg0;
    }

    @ObfuscatedName("ie.j(Lfb;I)V")
    public void method3950(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method3959(arg0, var2);
        }
    }

    @ObfuscatedName("ie.h(Lfb;II)V")
    public void method3959(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3281 = arg0.method2918();
        } else if (arg1 == 2) {
            this.field3293 = arg0.method2918();
        } else if (arg1 == 3) {
            this.field3280 = arg0.method2911();
        } else if (arg1 == 4) {
            this.field3284 = arg0.method3070();
        } else if (arg1 == 5) {
            arg0.method3070();
        } else if (arg1 == 6) {
            this.field3282 = arg0.method2903();
        } else if (arg1 == 7) {
            int var3 = arg0.method2903();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2903();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3286[arg1 - 10] = arg0.method2911();
        } else if (arg1 == 15) {
            int var4 = arg0.method2903();
            this.field3277 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3277[var5] = arg0.method3077();
            }
            arg0.method2908();
            int var6 = arg0.method2903();
            this.field3295 = new int[var6];
            for (int var7 = 0; var7 < this.field3295.length; var7++) {
                this.field3295[var7] = arg0.method2908();
            }
            this.field3296 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3296[var8] = arg0.method2980();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3287 = arg0.method2911();
            } else if (arg1 == 18) {
                arg0.method2918();
            } else if (arg1 == 19) {
                this.field3297 = arg0.method3023();
            } else if (arg1 == 21) {
                arg0.method2908();
            } else if (arg1 == 22) {
                arg0.method2908();
            } else if (arg1 == 23) {
                arg0.method2903();
                arg0.method2903();
                arg0.method2903();
            } else if (arg1 == 24) {
                arg0.method3077();
                arg0.method3077();
            } else if (arg1 == 25) {
                arg0.method2918();
            } else if (arg1 == 28) {
                arg0.method2903();
            } else if (arg1 == 29) {
                class259[] var9 = new class259[] { class259.field3535, class259.field3534, class259.field3536 };
                this.field3294 = (class259) class170.method3644(var9, arg0.method2903());
            } else if (arg1 == 30) {
                this.field3292 = (class241) class170.method3644(class241.method749(), arg0.method2903());
            }
        }
    }

    @ObfuscatedName("ie.f(B)V")
    public void method3956() {
        if (this.field3277 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3277.length; var1 += 2) {
            if (this.field3277[var1] < this.field3276) {
                this.field3276 = this.field3277[var1];
            } else if (this.field3277[var1] > this.field3291) {
                this.field3291 = this.field3277[var1];
            }
            if (this.field3277[var1 + 1] < this.field3290) {
                this.field3290 = this.field3277[var1 + 1];
            } else if (this.field3277[var1 + 1] > this.field3283) {
                this.field3283 = this.field3277[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ie.p(ZB)Lkp;")
    public class287 method3953(boolean arg0) {
        int var2 = arg0 ? this.field3293 : this.field3281;
        return this.method3954(var2);
    }

    @ObfuscatedName("ie.x(IB)Lkp;")
    public class287 method3954(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class287 var2 = (class287) field3279.method3271((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class287 var3 = class288.method4115(Statics.field3289, arg0, 0);
        if (var3 != null) {
            field3279.method3270(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ie.g(I)I")
    public int method3975() {
        return this.field3288;
    }

    @ObfuscatedName("ap.c(I)V")
    public static void method565() {
        field3279.method3259();
    }
}
