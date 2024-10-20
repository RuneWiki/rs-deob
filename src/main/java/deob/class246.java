package deob;

@ObfuscatedName("iq")
public class class246 extends class198 {

    @ObfuscatedName("iq.m")
    public static class193 field3307 = new class193(256);

    @ObfuscatedName("iq.h")
    public final int field3319;

    @ObfuscatedName("iq.t")
    public int field3309 = -1;

    @ObfuscatedName("iq.p")
    public int field3321 = -1;

    @ObfuscatedName("iq.d")
    public String field3311;

    @ObfuscatedName("iq.n")
    public int field3312;

    @ObfuscatedName("iq.z")
    public int field3313 = 0;

    @ObfuscatedName("iq.q")
    public String[] field3314 = new String[5];

    @ObfuscatedName("iq.u")
    public String field3315;

    @ObfuscatedName("iq.k")
    public int[] field3316;

    @ObfuscatedName("iq.e")
    public int field3310 = Integer.MAX_VALUE;

    @ObfuscatedName("iq.r")
    public int field3318 = Integer.MAX_VALUE;

    @ObfuscatedName("iq.l")
    public int field3308 = Integer.MIN_VALUE;

    @ObfuscatedName("iq.y")
    public int field3322 = Integer.MIN_VALUE;

    @ObfuscatedName("iq.w")
    public class261 field3304 = class261.field3563;

    @ObfuscatedName("iq.i")
    public class243 field3306 = class243.field3290;

    @ObfuscatedName("iq.g")
    public int[] field3323;

    @ObfuscatedName("iq.a")
    public byte[] field3324;

    @ObfuscatedName("iq.x")
    public int field3325 = -1;

    public class246(int arg0) {
        this.field3319 = arg0;
    }

    @ObfuscatedName("ez.s(Liw;Liw;I)Z")
    public static boolean method2699(class239 arg0, class239 arg1) {
        Statics.field3317 = arg1;
        if (!arg0.method3873()) {
            return false;
        }
        Statics.field3320 = arg0.method3858(35);
        Statics.field3305 = new class246[Statics.field3320];
        for (int var2 = 0; var2 < Statics.field3320; var2++) {
            byte[] var3 = arg0.method3840(35, var2);
            if (var3 != null) {
                Statics.field3305[var2] = new class246(var2);
                Statics.field3305[var2].method4004(new class177(var3));
                Statics.field3305[var2].method4023();
            }
        }
        return true;
    }

    @ObfuscatedName("iq.c(Lfs;B)V")
    public void method4004(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4005(arg0, var2);
        }
    }

    @ObfuscatedName("iq.f(Lfs;II)V")
    public void method4005(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3309 = arg0.method2980();
        } else if (arg1 == 2) {
            this.field3321 = arg0.method2980();
        } else if (arg1 == 3) {
            this.field3311 = arg0.method2973();
        } else if (arg1 == 4) {
            this.field3312 = arg0.method2969();
        } else if (arg1 == 5) {
            arg0.method2969();
        } else if (arg1 == 6) {
            this.field3313 = arg0.method2965();
        } else if (arg1 == 7) {
            int var3 = arg0.method2965();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2965();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3314[arg1 - 10] = arg0.method2973();
        } else if (arg1 == 15) {
            int var4 = arg0.method2965();
            this.field3316 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3316[var5] = arg0.method3157();
            }
            arg0.method2970();
            int var6 = arg0.method2965();
            this.field3323 = new int[var6];
            for (int var7 = 0; var7 < this.field3323.length; var7++) {
                this.field3323[var7] = arg0.method2970();
            }
            this.field3324 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3324[var8] = arg0.method2966();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3315 = arg0.method2973();
            } else if (arg1 == 18) {
                arg0.method2980();
            } else if (arg1 == 19) {
                this.field3325 = arg0.method2967();
            } else if (arg1 == 21) {
                arg0.method2970();
            } else if (arg1 == 22) {
                arg0.method2970();
            } else if (arg1 == 23) {
                arg0.method2965();
                arg0.method2965();
                arg0.method2965();
            } else if (arg1 == 24) {
                arg0.method3157();
                arg0.method3157();
            } else if (arg1 == 25) {
                arg0.method2980();
            } else if (arg1 == 28) {
                arg0.method2965();
            } else if (arg1 == 29) {
                class261[] var9 = new class261[] { class261.field3561, class261.field3560, class261.field3563 };
                this.field3304 = (class261) class172.method1577(var9, arg0.method2965());
            } else if (arg1 == 30) {
                class243[] var10 = new class243[] { class243.field3290, class243.field3289, class243.field3291 };
                this.field3306 = (class243) class172.method1577(var10, arg0.method2965());
            }
        }
    }

    @ObfuscatedName("iq.m(I)V")
    public void method4023() {
        if (this.field3316 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3316.length; var1 += 2) {
            if (this.field3316[var1] < this.field3310) {
                this.field3310 = this.field3316[var1];
            } else if (this.field3316[var1] > this.field3308) {
                this.field3308 = this.field3316[var1];
            }
            if (this.field3316[var1 + 1] < this.field3318) {
                this.field3318 = this.field3316[var1 + 1];
            } else if (this.field3316[var1 + 1] > this.field3322) {
                this.field3322 = this.field3316[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iq.h(ZI)Lkb;")
    public class289 method4007(boolean arg0) {
        int var2 = arg0 ? this.field3321 : this.field3309;
        return this.method4025(var2);
    }

    @ObfuscatedName("iq.t(II)Lkb;")
    public class289 method4025(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class289 var2 = (class289) field3307.method3319((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class289 var3 = class290.method4624(Statics.field3317, arg0, 0);
        if (var3 != null) {
            field3307.method3315(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iq.p(I)I")
    public int method4009() {
        return this.field3319;
    }

    @ObfuscatedName("bm.d(I)V")
    public static void method970() {
        field3307.method3316();
    }
}
