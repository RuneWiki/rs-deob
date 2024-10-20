package deob;

@ObfuscatedName("ij")
public class class243 extends class195 {

    @ObfuscatedName("ij.y")
    public static class190 field3278 = new class190(256);

    @ObfuscatedName("ij.e")
    public final int field3279;

    @ObfuscatedName("ij.f")
    public int field3293 = -1;

    @ObfuscatedName("ij.v")
    public int field3280 = -1;

    @ObfuscatedName("ij.t")
    public String field3282;

    @ObfuscatedName("ij.i")
    public int field3283;

    @ObfuscatedName("ij.r")
    public int field3284 = 0;

    @ObfuscatedName("ij.s")
    public String[] field3285 = new String[5];

    @ObfuscatedName("ij.o")
    public String field3286;

    @ObfuscatedName("ij.p")
    public int[] field3289;

    @ObfuscatedName("ij.u")
    public int field3288 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.b")
    public int field3275 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.w")
    public int field3281 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.k")
    public int field3291 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.n")
    public class258 field3292 = class258.field3528;

    @ObfuscatedName("ij.c")
    public class240 field3294 = class240.field3255;

    @ObfuscatedName("ij.l")
    public int[] field3276;

    @ObfuscatedName("ij.m")
    public byte[] field3295;

    @ObfuscatedName("ij.a")
    public int field3296 = -1;

    public class243(int arg0) {
        this.field3279 = arg0;
    }

    @ObfuscatedName("ij.d(Lfw;I)V")
    public void method3894(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method3901(arg0, var2);
        }
    }

    @ObfuscatedName("ij.q(Lfw;IB)V")
    public void method3901(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3293 = arg0.method2929();
        } else if (arg1 == 2) {
            this.field3280 = arg0.method2929();
        } else if (arg1 == 3) {
            this.field3282 = arg0.method2922();
        } else if (arg1 == 4) {
            this.field3283 = arg0.method2918();
        } else if (arg1 == 5) {
            arg0.method2918();
        } else if (arg1 == 6) {
            this.field3284 = arg0.method2921();
        } else if (arg1 == 7) {
            int var3 = arg0.method2921();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2921();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3285[arg1 - 10] = arg0.method2922();
        } else if (arg1 == 15) {
            int var4 = arg0.method2921();
            this.field3289 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3289[var5] = arg0.method2911();
            }
            arg0.method2935();
            int var6 = arg0.method2921();
            this.field3276 = new int[var6];
            for (int var7 = 0; var7 < this.field3276.length; var7++) {
                this.field3276[var7] = arg0.method2935();
            }
            this.field3295 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3295[var8] = arg0.method3082();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3286 = arg0.method2922();
            } else if (arg1 == 18) {
                arg0.method2929();
            } else if (arg1 == 19) {
                this.field3296 = arg0.method2916();
            } else if (arg1 == 21) {
                arg0.method2935();
            } else if (arg1 == 22) {
                arg0.method2935();
            } else if (arg1 == 23) {
                arg0.method2921();
                arg0.method2921();
                arg0.method2921();
            } else if (arg1 == 24) {
                arg0.method2911();
                arg0.method2911();
            } else if (arg1 == 25) {
                arg0.method2929();
            } else if (arg1 == 28) {
                arg0.method2921();
            } else if (arg1 == 29) {
                this.field3292 = (class258) class169.method2811(class258.method1568(), arg0.method2921());
            } else if (arg1 == 30) {
                class240[] var9 = new class240[] { class240.field3255, class240.field3256, class240.field3263 };
                this.field3294 = (class240) class169.method2811(var9, arg0.method2921());
            }
        }
    }

    @ObfuscatedName("ij.x(I)V")
    public void method3895() {
        if (this.field3289 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3289.length; var1 += 2) {
            if (this.field3289[var1] < this.field3288) {
                this.field3288 = this.field3289[var1];
            } else if (this.field3289[var1] > this.field3281) {
                this.field3281 = this.field3289[var1];
            }
            if (this.field3289[var1 + 1] < this.field3275) {
                this.field3275 = this.field3289[var1 + 1];
            } else if (this.field3289[var1 + 1] > this.field3291) {
                this.field3291 = this.field3289[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ij.y(ZI)Lji;")
    public class286 method3896(boolean arg0) {
        int var2 = arg0 ? this.field3280 : this.field3293;
        return this.method3897(var2);
    }

    @ObfuscatedName("ij.e(IB)Lji;")
    public class286 method3897(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3278.method3252((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method65(Statics.field3290, arg0, 0);
        if (var3 != null) {
            field3278.method3256(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ij.f(I)I")
    public int method3898() {
        return this.field3279;
    }
}
