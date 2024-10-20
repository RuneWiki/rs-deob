package deob;

@ObfuscatedName("if")
public class class258 extends class209 {

    @ObfuscatedName("if.s")
    public static class203 field3304 = new class203(256);

    @ObfuscatedName("if.e")
    public final int field3320;

    @ObfuscatedName("if.a")
    public int field3302 = -1;

    @ObfuscatedName("if.c")
    public int field3307 = -1;

    @ObfuscatedName("if.p")
    public String field3306;

    @ObfuscatedName("if.r")
    public int field3303;

    @ObfuscatedName("if.m")
    public int field3310 = 0;

    @ObfuscatedName("if.z")
    public String[] field3319 = new String[5];

    @ObfuscatedName("if.x")
    public String field3312;

    @ObfuscatedName("if.v")
    public int[] field3313;

    @ObfuscatedName("if.g")
    public int field3314 = Integer.MAX_VALUE;

    @ObfuscatedName("if.j")
    public int field3315 = Integer.MAX_VALUE;

    @ObfuscatedName("if.b")
    public int field3316 = Integer.MIN_VALUE;

    @ObfuscatedName("if.u")
    public int field3317 = Integer.MIN_VALUE;

    @ObfuscatedName("if.t")
    public class273 field3311 = class273.field3555;

    @ObfuscatedName("if.n")
    public class255 field3305 = class255.field3285;

    @ObfuscatedName("if.h")
    public int[] field3308;

    @ObfuscatedName("if.o")
    public byte[] field3321;

    @ObfuscatedName("if.i")
    public int field3322 = -1;

    public class258(int arg0) {
        this.field3320 = arg0;
    }

    @ObfuscatedName("ft.f(Lik;Lik;I)Z")
    public static boolean method3259(class250 arg0, class250 arg1) {
        Statics.field3309 = arg1;
        if (!arg0.method4294()) {
            return false;
        }
        Statics.field3301 = arg0.method4326(35);
        Statics.field3318 = new class258[Statics.field3301];
        for (int var2 = 0; var2 < Statics.field3301; var2++) {
            byte[] var3 = arg0.method4289(35, var2);
            Statics.field3318[var2] = new class258(var2);
            if (var3 != null) {
                Statics.field3318[var2].method4486(new class185(var3));
                Statics.field3318[var2].method4488();
            }
        }
        return true;
    }

    @ObfuscatedName("fj.l(II)Lif;")
    public static class258 method3139(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3318.length || Statics.field3318[arg0] == null ? new class258(arg0) : Statics.field3318[arg0];
    }

    @ObfuscatedName("if.w(Lgm;I)V")
    public void method4486(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4487(arg0, var2);
        }
    }

    @ObfuscatedName("if.s(Lgm;II)V")
    public void method4487(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3302 = arg0.method3381();
        } else if (arg1 == 2) {
            this.field3307 = arg0.method3381();
        } else if (arg1 == 3) {
            this.field3306 = arg0.method3353();
        } else if (arg1 == 4) {
            this.field3303 = arg0.method3348();
        } else if (arg1 == 5) {
            arg0.method3348();
        } else if (arg1 == 6) {
            this.field3310 = arg0.method3344();
        } else if (arg1 == 7) {
            int var3 = arg0.method3344();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3344();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3319[arg1 - 10] = arg0.method3353();
        } else if (arg1 == 15) {
            int var4 = arg0.method3344();
            this.field3313 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3313[var5] = arg0.method3544();
            }
            arg0.method3432();
            int var6 = arg0.method3344();
            this.field3308 = new int[var6];
            for (int var7 = 0; var7 < this.field3308.length; var7++) {
                this.field3308[var7] = arg0.method3432();
            }
            this.field3321 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3321[var8] = arg0.method3345();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3312 = arg0.method3353();
            } else if (arg1 == 18) {
                arg0.method3381();
            } else if (arg1 == 19) {
                this.field3322 = arg0.method3346();
            } else if (arg1 == 21) {
                arg0.method3432();
            } else if (arg1 == 22) {
                arg0.method3432();
            } else if (arg1 == 23) {
                arg0.method3344();
                arg0.method3344();
                arg0.method3344();
            } else if (arg1 == 24) {
                arg0.method3544();
                arg0.method3544();
            } else if (arg1 == 25) {
                arg0.method3381();
            } else if (arg1 == 28) {
                arg0.method3344();
            } else if (arg1 == 29) {
                class273[] var9 = new class273[] { class273.field3555, class273.field3559, class273.field3556 };
                this.field3311 = (class273) Statics.method1912(var9, arg0.method3344());
            } else if (arg1 == 30) {
                class255[] var10 = new class255[] { class255.field3287, class255.field3289, class255.field3285 };
                this.field3305 = (class255) Statics.method1912(var10, arg0.method3344());
            }
        }
    }

    @ObfuscatedName("if.e(I)V")
    public void method4488() {
        if (this.field3313 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3313.length; var1 += 2) {
            if (this.field3313[var1] < this.field3314) {
                this.field3314 = this.field3313[var1];
            } else if (this.field3313[var1] > this.field3316) {
                this.field3316 = this.field3313[var1];
            }
            if (this.field3313[var1 + 1] < this.field3315) {
                this.field3315 = this.field3313[var1 + 1];
            } else if (this.field3313[var1 + 1] > this.field3317) {
                this.field3317 = this.field3313[var1 + 1];
            }
        }
    }

    @ObfuscatedName("if.c(ZI)Llp;")
    public class324 method4489(boolean arg0) {
        int var2 = arg0 ? this.field3307 : this.field3302;
        return this.method4490(var2);
    }

    @ObfuscatedName("if.p(II)Llp;")
    public class324 method4490(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class324 var2 = (class324) field3304.method3737((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class324 var3 = class325.method2923(Statics.field3309, arg0, 0);
        if (var3 != null) {
            field3304.method3744(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("if.r(I)I")
    public int method4491() {
        return this.field3320;
    }
}
