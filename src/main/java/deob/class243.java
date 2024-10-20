package deob;

@ObfuscatedName("ij")
public class class243 extends class195 {

    @ObfuscatedName("ij.t")
    public static class190 field3297 = new class190(256);

    @ObfuscatedName("ij.s")
    public final int field3298;

    @ObfuscatedName("ij.r")
    public int field3309 = -1;

    @ObfuscatedName("ij.v")
    public int field3313 = -1;

    @ObfuscatedName("ij.y")
    public String field3301;

    @ObfuscatedName("ij.j")
    public int field3302;

    @ObfuscatedName("ij.k")
    public int field3303 = 0;

    @ObfuscatedName("ij.o")
    public String[] field3305 = new String[5];

    @ObfuscatedName("ij.z")
    public String field3306;

    @ObfuscatedName("ij.l")
    public int[] field3307;

    @ObfuscatedName("ij.c")
    public int field3295 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.m")
    public int field3300 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.b")
    public int field3316 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.f")
    public int field3311 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.n")
    public class258 field3312 = class258.field3554;

    @ObfuscatedName("ij.u")
    public class240 field3310 = class240.field3281;

    @ObfuscatedName("ij.p")
    public int[] field3314;

    @ObfuscatedName("ij.q")
    public byte[] field3315;

    @ObfuscatedName("ij.d")
    public int field3308 = -1;

    public class243(int arg0) {
        this.field3298 = arg0;
    }

    @ObfuscatedName("au.i(Liq;Liq;B)Z")
    public static boolean method232(class236 arg0, class236 arg1) {
        Statics.field299 = arg1;
        if (!arg0.method3765()) {
            return false;
        }
        Statics.field3296 = arg0.method3787(35);
        Statics.field3304 = new class243[Statics.field3296];
        for (int var2 = 0; var2 < Statics.field3296; var2++) {
            byte[] var3 = arg0.method3768(35, var2);
            if (var3 != null) {
                Statics.field3304[var2] = new class243(var2);
                Statics.field3304[var2].method3929(new class174(var3));
                Statics.field3304[var2].method3951();
            }
        }
        return true;
    }

    @ObfuscatedName("ij.w(Lfp;B)V")
    public void method3929(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method3944(arg0, var2);
        }
    }

    @ObfuscatedName("ij.a(Lfp;II)V")
    public void method3944(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3309 = arg0.method2864();
        } else if (arg1 == 2) {
            this.field3313 = arg0.method2864();
        } else if (arg1 == 3) {
            this.field3301 = arg0.method2884();
        } else if (arg1 == 4) {
            this.field3302 = arg0.method2917();
        } else if (arg1 == 5) {
            arg0.method2917();
        } else if (arg1 == 6) {
            this.field3303 = arg0.method3061();
        } else if (arg1 == 7) {
            int var3 = arg0.method3061();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3061();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3305[arg1 - 10] = arg0.method2884();
        } else if (arg1 == 15) {
            int var4 = arg0.method3061();
            this.field3307 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3307[var5] = arg0.method3013();
            }
            arg0.method2885();
            int var6 = arg0.method3061();
            this.field3314 = new int[var6];
            for (int var7 = 0; var7 < this.field3314.length; var7++) {
                this.field3314[var7] = arg0.method2885();
            }
            this.field3315 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3315[var8] = arg0.method2930();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3306 = arg0.method2884();
            } else if (arg1 == 18) {
                arg0.method2864();
            } else if (arg1 == 19) {
                this.field3308 = arg0.method2882();
            } else if (arg1 == 21) {
                arg0.method2885();
            } else if (arg1 == 22) {
                arg0.method2885();
            } else if (arg1 == 23) {
                arg0.method3061();
                arg0.method3061();
                arg0.method3061();
            } else if (arg1 == 24) {
                arg0.method3013();
                arg0.method3013();
            } else if (arg1 == 25) {
                arg0.method2864();
            } else if (arg1 == 28) {
                arg0.method3061();
            } else if (arg1 == 29) {
                class258[] var9 = new class258[] { class258.field3553, class258.field3554, class258.field3552 };
                this.field3312 = (class258) class169.method2353(var9, arg0.method3061());
            } else if (arg1 == 30) {
                class240[] var10 = new class240[] { class240.field3281, class240.field3284, class240.field3280 };
                this.field3310 = (class240) class169.method2353(var10, arg0.method3061());
            }
        }
    }

    @ObfuscatedName("ij.t(B)V")
    public void method3951() {
        if (this.field3307 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3307.length; var1 += 2) {
            if (this.field3307[var1] < this.field3295) {
                this.field3295 = this.field3307[var1];
            } else if (this.field3307[var1] > this.field3316) {
                this.field3316 = this.field3307[var1];
            }
            if (this.field3307[var1 + 1] < this.field3300) {
                this.field3300 = this.field3307[var1 + 1];
            } else if (this.field3307[var1 + 1] > this.field3311) {
                this.field3311 = this.field3307[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ij.s(ZI)Ljk;")
    public class286 method3932(boolean arg0) {
        int var2 = arg0 ? this.field3313 : this.field3309;
        return this.method3933(var2);
    }

    @ObfuscatedName("ij.r(II)Ljk;")
    public class286 method3933(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3297.method3235((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method4215(Statics.field299, arg0, 0);
        if (var3 != null) {
            field3297.method3234(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ij.v(I)I")
    public int method3930() {
        return this.field3298;
    }

    @ObfuscatedName("ha.y(B)V")
    public static void method3751() {
        field3297.method3232();
    }
}
