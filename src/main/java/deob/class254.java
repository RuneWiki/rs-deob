package deob;

@ObfuscatedName("iw")
public class class254 extends class206 {

    @ObfuscatedName("iw.s")
    public static class201 field3356 = new class201(256);

    @ObfuscatedName("iw.j")
    public final int field3361;

    @ObfuscatedName("iw.a")
    public int field3358 = -1;

    @ObfuscatedName("iw.t")
    public int field3359 = -1;

    @ObfuscatedName("iw.r")
    public String field3360;

    @ObfuscatedName("iw.m")
    public int field3362;

    @ObfuscatedName("iw.h")
    public int field3353 = 0;

    @ObfuscatedName("iw.x")
    public String[] field3363 = new String[5];

    @ObfuscatedName("iw.q")
    public String field3367;

    @ObfuscatedName("iw.v")
    public int[] field3365;

    @ObfuscatedName("iw.n")
    public int field3364 = Integer.MAX_VALUE;

    @ObfuscatedName("iw.y")
    public int field3366 = Integer.MAX_VALUE;

    @ObfuscatedName("iw.d")
    public int field3368 = Integer.MIN_VALUE;

    @ObfuscatedName("iw.l")
    public int field3369 = Integer.MIN_VALUE;

    @ObfuscatedName("iw.f")
    public class269 field3357 = class269.field3603;

    @ObfuscatedName("iw.k")
    public class251 field3371 = class251.field3340;

    @ObfuscatedName("iw.e")
    public int[] field3372;

    @ObfuscatedName("iw.u")
    public byte[] field3373;

    @ObfuscatedName("iw.g")
    public int field3374 = -1;

    public class254(int arg0) {
        this.field3361 = arg0;
    }

    @ObfuscatedName("fs.p(Lik;Lik;B)Z")
    public static boolean method2915(class247 arg0, class247 arg1) {
        Statics.field3370 = arg1;
        if (!arg0.method4037()) {
            return false;
        }
        Statics.field3355 = arg0.method4044(35);
        Statics.field3354 = new class254[Statics.field3355];
        for (int var2 = 0; var2 < Statics.field3355; var2++) {
            byte[] var3 = arg0.method4032(35, var2);
            if (var3 != null) {
                Statics.field3354[var2] = new class254(var2);
                Statics.field3354[var2].method4203(new class185(var3));
                Statics.field3354[var2].method4220();
            }
        }
        return true;
    }

    @ObfuscatedName("iw.i(Lgj;I)V")
    public void method4203(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4200(arg0, var2);
        }
    }

    @ObfuscatedName("iw.w(Lgj;IB)V")
    public void method4200(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3358 = arg0.method3132();
        } else if (arg1 == 2) {
            this.field3359 = arg0.method3132();
        } else if (arg1 == 3) {
            this.field3360 = arg0.method3131();
        } else if (arg1 == 4) {
            this.field3362 = arg0.method3138();
        } else if (arg1 == 5) {
            arg0.method3138();
        } else if (arg1 == 6) {
            this.field3353 = arg0.method3197();
        } else if (arg1 == 7) {
            int var3 = arg0.method3197();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3197();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3363[arg1 - 10] = arg0.method3131();
        } else if (arg1 == 15) {
            int var4 = arg0.method3197();
            this.field3365 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3365[var5] = arg0.method3125();
            }
            arg0.method3127();
            int var6 = arg0.method3197();
            this.field3372 = new int[var6];
            for (int var7 = 0; var7 < this.field3372.length; var7++) {
                this.field3372[var7] = arg0.method3127();
            }
            this.field3373 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3373[var8] = arg0.method3123();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3367 = arg0.method3131();
            } else if (arg1 == 18) {
                arg0.method3132();
            } else if (arg1 == 19) {
                this.field3374 = arg0.method3124();
            } else if (arg1 == 21) {
                arg0.method3127();
            } else if (arg1 == 22) {
                arg0.method3127();
            } else if (arg1 == 23) {
                arg0.method3197();
                arg0.method3197();
                arg0.method3197();
            } else if (arg1 == 24) {
                arg0.method3125();
                arg0.method3125();
            } else if (arg1 == 25) {
                arg0.method3132();
            } else if (arg1 == 28) {
                arg0.method3197();
            } else if (arg1 == 29) {
                this.field3357 = (class269) class180.method4646(class269.method4475(), arg0.method3197());
            } else if (arg1 == 30) {
                class251[] var9 = new class251[] { class251.field3339, class251.field3340, class251.field3341 };
                this.field3371 = (class251) class180.method4646(var9, arg0.method3197());
            }
        }
    }

    @ObfuscatedName("iw.s(B)V")
    public void method4220() {
        if (this.field3365 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3365.length; var1 += 2) {
            if (this.field3365[var1] < this.field3364) {
                this.field3364 = this.field3365[var1];
            } else if (this.field3365[var1] > this.field3368) {
                this.field3368 = this.field3365[var1];
            }
            if (this.field3365[var1 + 1] < this.field3366) {
                this.field3366 = this.field3365[var1 + 1];
            } else if (this.field3365[var1 + 1] > this.field3369) {
                this.field3369 = this.field3365[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iw.j(ZI)Lko;")
    public class310 method4201(boolean arg0) {
        int var2 = arg0 ? this.field3359 : this.field3358;
        return this.method4206(var2);
    }

    @ObfuscatedName("iw.a(II)Lko;")
    public class310 method4206(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class310 var2 = (class310) field3356.method3504((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class310 var3 = class311.method18(Statics.field3370, arg0, 0);
        if (var3 != null) {
            field3356.method3506(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iw.t(I)I")
    public int method4202() {
        return this.field3361;
    }

    @ObfuscatedName("bo.r(I)V")
    public static void method1035() {
        field3356.method3513();
    }
}
