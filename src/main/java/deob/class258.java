package deob;

@ObfuscatedName("iu")
public class class258 extends class209 {

    @ObfuscatedName("iu.k")
    public static class203 field3268 = new class203(256);

    @ObfuscatedName("iu.u")
    public final int field3266;

    @ObfuscatedName("iu.i")
    public int field3265 = -1;

    @ObfuscatedName("iu.t")
    public int field3274 = -1;

    @ObfuscatedName("iu.p")
    public String field3267;

    @ObfuscatedName("iu.l")
    public int field3270;

    @ObfuscatedName("iu.b")
    public int field3271 = 0;

    @ObfuscatedName("iu.d")
    public String[] field3272 = new String[5];

    @ObfuscatedName("iu.w")
    public String field3269;

    @ObfuscatedName("iu.a")
    public int[] field3273;

    @ObfuscatedName("iu.z")
    public int field3275 = Integer.MAX_VALUE;

    @ObfuscatedName("iu.e")
    public int field3276 = Integer.MAX_VALUE;

    @ObfuscatedName("iu.q")
    public int field3263 = Integer.MIN_VALUE;

    @ObfuscatedName("iu.j")
    public int field3278 = Integer.MIN_VALUE;

    @ObfuscatedName("iu.y")
    public class273 field3279 = class273.field3508;

    @ObfuscatedName("iu.m")
    public class255 field3280 = class255.field3251;

    @ObfuscatedName("iu.h")
    public int[] field3281;

    @ObfuscatedName("iu.x")
    public byte[] field3277;

    @ObfuscatedName("iu.f")
    public int field3283 = -1;

    public class258(int arg0) {
        this.field3266 = arg0;
    }

    @ObfuscatedName("iu.v(Lgx;I)V")
    public void method4477(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4478(arg0, var2);
        }
    }

    @ObfuscatedName("iu.s(Lgx;II)V")
    public void method4478(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3265 = arg0.method3291();
        } else if (arg1 == 2) {
            this.field3274 = arg0.method3291();
        } else if (arg1 == 3) {
            this.field3267 = arg0.method3490();
        } else if (arg1 == 4) {
            this.field3270 = arg0.method3494();
        } else if (arg1 == 5) {
            arg0.method3494();
        } else if (arg1 == 6) {
            this.field3271 = arg0.method3274();
        } else if (arg1 == 7) {
            int var3 = arg0.method3274();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3274();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3272[arg1 - 10] = arg0.method3490();
        } else if (arg1 == 15) {
            int var4 = arg0.method3274();
            this.field3273 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3273[var5] = arg0.method3277();
            }
            arg0.method3279();
            int var6 = arg0.method3274();
            this.field3281 = new int[var6];
            for (int var7 = 0; var7 < this.field3281.length; var7++) {
                this.field3281[var7] = arg0.method3279();
            }
            this.field3277 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3277[var8] = arg0.method3275();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3269 = arg0.method3490();
            } else if (arg1 == 18) {
                arg0.method3291();
            } else if (arg1 == 19) {
                this.field3283 = arg0.method3276();
            } else if (arg1 == 21) {
                arg0.method3279();
            } else if (arg1 == 22) {
                arg0.method3279();
            } else if (arg1 == 23) {
                arg0.method3274();
                arg0.method3274();
                arg0.method3274();
            } else if (arg1 == 24) {
                arg0.method3277();
                arg0.method3277();
            } else if (arg1 == 25) {
                arg0.method3291();
            } else if (arg1 == 28) {
                arg0.method3274();
            } else if (arg1 == 29) {
                class273[] var9 = new class273[] { class273.field3511, class273.field3507, class273.field3508 };
                this.field3279 = (class273) class180.method34(var9, arg0.method3274());
            } else if (arg1 == 30) {
                this.field3280 = (class255) class180.method34(class255.method623(), arg0.method3274());
            }
        }
    }

    @ObfuscatedName("iu.o(I)V")
    public void method4476() {
        if (this.field3273 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3273.length; var1 += 2) {
            if (this.field3273[var1] < this.field3275) {
                this.field3275 = this.field3273[var1];
            } else if (this.field3273[var1] > this.field3263) {
                this.field3263 = this.field3273[var1];
            }
            if (this.field3273[var1 + 1] < this.field3276) {
                this.field3276 = this.field3273[var1 + 1];
            } else if (this.field3273[var1 + 1] > this.field3278) {
                this.field3278 = this.field3273[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iu.k(ZB)Llh;")
    public class322 method4480(boolean arg0) {
        int var2 = arg0 ? this.field3274 : this.field3265;
        return this.method4481(var2);
    }

    @ObfuscatedName("iu.u(II)Llh;")
    public class322 method4481(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class322 var2 = (class322) field3268.method3687((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class322 var3 = class323.method4067(Statics.field3282, arg0, 0);
        if (var3 != null) {
            field3268.method3689(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iu.i(I)I")
    public int method4482() {
        return this.field3266;
    }

    @ObfuscatedName("e.t(I)V")
    public static void method184() {
        field3268.method3697();
    }
}
