package deob;

@ObfuscatedName("ie")
public class class243 extends class195 {

    @ObfuscatedName("ie.v")
    public static class190 field3292 = new class190(256);

    @ObfuscatedName("ie.b")
    public final int field3290;

    @ObfuscatedName("ie.y")
    public int field3294 = -1;

    @ObfuscatedName("ie.h")
    public int field3295 = -1;

    @ObfuscatedName("ie.x")
    public String field3296;

    @ObfuscatedName("ie.f")
    public int field3297;

    @ObfuscatedName("ie.n")
    public int field3311 = 0;

    @ObfuscatedName("ie.o")
    public String[] field3299 = new String[5];

    @ObfuscatedName("ie.z")
    public String field3309;

    @ObfuscatedName("ie.q")
    public int[] field3301;

    @ObfuscatedName("ie.j")
    public int field3308 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.k")
    public int field3303 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.r")
    public int field3304 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.m")
    public int field3305 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.d")
    public class258 field3300 = class258.field3539;

    @ObfuscatedName("ie.s")
    public class240 field3307 = class240.field3272;

    @ObfuscatedName("ie.g")
    public int[] field3293;

    @ObfuscatedName("ie.w")
    public byte[] field3310;

    @ObfuscatedName("ie.p")
    public int field3298 = -1;

    public class243(int arg0) {
        this.field3290 = arg0;
    }

    @ObfuscatedName("ie.i(Lfx;I)V")
    public void method3945(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method3944(arg0, var2);
        }
    }

    @ObfuscatedName("ie.c(Lfx;II)V")
    public void method3944(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3294 = arg0.method2885();
        } else if (arg1 == 2) {
            this.field3295 = arg0.method2885();
        } else if (arg1 == 3) {
            this.field3296 = arg0.method2878();
        } else if (arg1 == 4) {
            this.field3297 = arg0.method2874();
        } else if (arg1 == 5) {
            arg0.method2874();
        } else if (arg1 == 6) {
            this.field3311 = arg0.method2870();
        } else if (arg1 == 7) {
            int var3 = arg0.method2870();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2870();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3299[arg1 - 10] = arg0.method2878();
        } else if (arg1 == 15) {
            int var4 = arg0.method2870();
            this.field3301 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3301[var5] = arg0.method2873();
            }
            arg0.method2875();
            int var6 = arg0.method2870();
            this.field3293 = new int[var6];
            for (int var7 = 0; var7 < this.field3293.length; var7++) {
                this.field3293[var7] = arg0.method2875();
            }
            this.field3310 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3310[var8] = arg0.method2938();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3309 = arg0.method2878();
            } else if (arg1 == 18) {
                arg0.method2885();
            } else if (arg1 == 19) {
                this.field3298 = arg0.method2872();
            } else if (arg1 == 21) {
                arg0.method2875();
            } else if (arg1 == 22) {
                arg0.method2875();
            } else if (arg1 == 23) {
                arg0.method2870();
                arg0.method2870();
                arg0.method2870();
            } else if (arg1 == 24) {
                arg0.method2873();
                arg0.method2873();
            } else if (arg1 == 25) {
                arg0.method2885();
            } else if (arg1 == 28) {
                arg0.method2870();
            } else if (arg1 == 29) {
                class258[] var9 = new class258[] { class258.field3539, class258.field3540, class258.field3541 };
                this.field3300 = (class258) class169.method1610(var9, arg0.method2870());
            } else if (arg1 == 30) {
                class240[] var10 = new class240[] { class240.field3274, class240.field3276, class240.field3272 };
                this.field3307 = (class240) class169.method1610(var10, arg0.method2870());
            }
        }
    }

    @ObfuscatedName("ie.e(I)V")
    public void method3963() {
        if (this.field3301 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3301.length; var1 += 2) {
            if (this.field3301[var1] < this.field3308) {
                this.field3308 = this.field3301[var1];
            } else if (this.field3301[var1] > this.field3304) {
                this.field3304 = this.field3301[var1];
            }
            if (this.field3301[var1 + 1] < this.field3303) {
                this.field3303 = this.field3301[var1 + 1];
            } else if (this.field3301[var1 + 1] > this.field3305) {
                this.field3305 = this.field3301[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ie.v(ZI)Ljs;")
    public class286 method3962(boolean arg0) {
        int var2 = arg0 ? this.field3295 : this.field3294;
        return this.method3948(var2);
    }

    @ObfuscatedName("ie.b(II)Ljs;")
    public class286 method3948(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3292.method3220((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method718(Statics.field3302, arg0, 0);
        if (var3 != null) {
            field3292.method3222(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ie.y(I)I")
    public int method3949() {
        return this.field3290;
    }
}
