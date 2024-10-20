package deob;

@ObfuscatedName("ie")
public class class243 extends class195 {

    @ObfuscatedName("ie.p")
    public static class190 field3307 = new class190(256);

    @ObfuscatedName("ie.q")
    public final int field3293;

    @ObfuscatedName("ie.s")
    public int field3294 = -1;

    @ObfuscatedName("ie.r")
    public int field3302 = -1;

    @ObfuscatedName("ie.g")
    public String field3296;

    @ObfuscatedName("ie.v")
    public int field3297;

    @ObfuscatedName("ie.t")
    public int field3299 = 0;

    @ObfuscatedName("ie.o")
    public String[] field3295 = new String[5];

    @ObfuscatedName("ie.i")
    public String field3300;

    @ObfuscatedName("ie.u")
    public int[] field3301;

    @ObfuscatedName("ie.b")
    public int field3291 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.f")
    public int field3303 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.j")
    public int field3304 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.x")
    public int field3305 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.c")
    public class258 field3290 = class258.field3545;

    @ObfuscatedName("ie.h")
    public class240 field3306 = class240.field3278;

    @ObfuscatedName("ie.a")
    public int[] field3308;

    @ObfuscatedName("ie.z")
    public byte[] field3309;

    @ObfuscatedName("ie.l")
    public int field3310 = -1;

    public class243(int arg0) {
        this.field3293 = arg0;
    }

    @ObfuscatedName("fp.d(Lit;Lit;I)Z")
    public static boolean method2879(class236 arg0, class236 arg1) {
        Statics.field3292 = arg1;
        if (!arg0.method3949()) {
            return false;
        }
        Statics.field3298 = arg0.method3889(35);
        Statics.field25 = new class243[Statics.field3298];
        for (int var2 = 0; var2 < Statics.field3298; var2++) {
            byte[] var3 = arg0.method3875(35, var2);
            if (var3 != null) {
                Statics.field25[var2] = new class243(var2);
                Statics.field25[var2].method4034(new class174(var3));
                Statics.field25[var2].method4043();
            }
        }
        return true;
    }

    @ObfuscatedName("ie.k(Lfg;I)V")
    public void method4034(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4035(arg0, var2);
        }
    }

    @ObfuscatedName("ie.e(Lfg;IB)V")
    public void method4035(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3294 = arg0.method2971();
        } else if (arg1 == 2) {
            this.field3302 = arg0.method2971();
        } else if (arg1 == 3) {
            this.field3296 = arg0.method2964();
        } else if (arg1 == 4) {
            this.field3297 = arg0.method3059();
        } else if (arg1 == 5) {
            arg0.method3059();
        } else if (arg1 == 6) {
            this.field3299 = arg0.method2955();
        } else if (arg1 == 7) {
            int var3 = arg0.method2955();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2955();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3295[arg1 - 10] = arg0.method2964();
        } else if (arg1 == 15) {
            int var4 = arg0.method2955();
            this.field3301 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3301[var5] = arg0.method2958();
            }
            arg0.method2960();
            int var6 = arg0.method2955();
            this.field3308 = new int[var6];
            for (int var7 = 0; var7 < this.field3308.length; var7++) {
                this.field3308[var7] = arg0.method2960();
            }
            this.field3309 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3309[var8] = arg0.method2956();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3300 = arg0.method2964();
            } else if (arg1 == 18) {
                arg0.method2971();
            } else if (arg1 == 19) {
                this.field3310 = arg0.method3035();
            } else if (arg1 == 21) {
                arg0.method2960();
            } else if (arg1 == 22) {
                arg0.method2960();
            } else if (arg1 == 23) {
                arg0.method2955();
                arg0.method2955();
                arg0.method2955();
            } else if (arg1 == 24) {
                arg0.method2958();
                arg0.method2958();
            } else if (arg1 == 25) {
                arg0.method2971();
            } else if (arg1 == 28) {
                arg0.method2955();
            } else if (arg1 == 29) {
                class258[] var9 = new class258[] { class258.field3550, class258.field3545, class258.field3547 };
                this.field3290 = (class258) class169.method648(var9, arg0.method2955());
            } else if (arg1 == 30) {
                this.field3306 = (class240) class169.method648(class240.method3256(), arg0.method2955());
            }
        }
    }

    @ObfuscatedName("ie.p(I)V")
    public void method4043() {
        if (this.field3301 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3301.length; var1 += 2) {
            if (this.field3301[var1] < this.field3291) {
                this.field3291 = this.field3301[var1];
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

    @ObfuscatedName("ie.q(ZI)Lkr;")
    public class287 method4037(boolean arg0) {
        int var2 = arg0 ? this.field3302 : this.field3294;
        return this.method4038(var2);
    }

    @ObfuscatedName("ie.s(II)Lkr;")
    public class287 method4038(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class287 var2 = (class287) field3307.method3341((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class287 var3 = class288.method1953(Statics.field3292, arg0, 0);
        if (var3 != null) {
            field3307.method3343(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ie.r(I)I")
    public int method4039() {
        return this.field3293;
    }

    @ObfuscatedName("z.g(I)V")
    public static void method142() {
        field3307.method3345();
    }
}
