package deob;

@ObfuscatedName("jd")
public class class263 extends class214 {

    @ObfuscatedName("jd.x")
    public static class208 field3322 = new class208(256);

    @ObfuscatedName("jd.h")
    public final int field3325;

    @ObfuscatedName("jd.f")
    public int field3326 = -1;

    @ObfuscatedName("jd.p")
    public int field3327 = -1;

    @ObfuscatedName("jd.m")
    public String field3328;

    @ObfuscatedName("jd.q")
    public int field3329;

    @ObfuscatedName("jd.b")
    public int field3330 = 0;

    @ObfuscatedName("jd.e")
    public String[] field3332 = new String[5];

    @ObfuscatedName("jd.r")
    public String field3338;

    @ObfuscatedName("jd.t")
    public int[] field3334;

    @ObfuscatedName("jd.l")
    public int field3335 = Integer.MAX_VALUE;

    @ObfuscatedName("jd.o")
    public int field3336 = Integer.MAX_VALUE;

    @ObfuscatedName("jd.u")
    public int field3337 = Integer.MIN_VALUE;

    @ObfuscatedName("jd.y")
    public int field3333 = Integer.MIN_VALUE;

    @ObfuscatedName("jd.k")
    public class277 field3339 = class277.field3561;

    @ObfuscatedName("jd.v")
    public class260 field3340 = class260.field3304;

    @ObfuscatedName("jd.d")
    public int[] field3341;

    @ObfuscatedName("jd.w")
    public byte[] field3324;

    @ObfuscatedName("jd.i")
    public int field3343 = -1;

    public class263(int arg0) {
        this.field3325 = arg0;
    }

    @ObfuscatedName("af.a(Liz;Liz;I)Z")
    public static boolean method368(class255 arg0, class255 arg1) {
        Statics.field3342 = arg1;
        if (!arg0.method4427()) {
            return false;
        }
        Statics.field3323 = arg0.method4419(35);
        Statics.field3321 = new class263[Statics.field3323];
        for (int var2 = 0; var2 < Statics.field3323; var2++) {
            byte[] var3 = arg0.method4422(35, var2);
            Statics.field3321[var2] = new class263(var2);
            if (var3 != null) {
                Statics.field3321[var2].method4608(new class190(var3));
                Statics.field3321[var2].method4610();
            }
        }
        return true;
    }

    @ObfuscatedName("ay.s(II)Ljd;")
    public static class263 method379(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3321.length || Statics.field3321[arg0] == null ? new class263(arg0) : Statics.field3321[arg0];
    }

    @ObfuscatedName("jd.g(Lgx;I)V")
    public void method4608(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4626(arg0, var2);
        }
    }

    @ObfuscatedName("jd.x(Lgx;II)V")
    public void method4626(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3326 = arg0.method3656();
        } else if (arg1 == 2) {
            this.field3327 = arg0.method3656();
        } else if (arg1 == 3) {
            this.field3328 = arg0.method3647();
        } else if (arg1 == 4) {
            this.field3329 = arg0.method3459();
        } else if (arg1 == 5) {
            arg0.method3459();
        } else if (arg1 == 6) {
            this.field3330 = arg0.method3443();
        } else if (arg1 == 7) {
            int var3 = arg0.method3443();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3443();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3332[arg1 - 10] = arg0.method3647();
        } else if (arg1 == 15) {
            int var4 = arg0.method3443();
            this.field3334 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3334[var5] = arg0.method3458();
            }
            arg0.method3460();
            int var6 = arg0.method3443();
            this.field3341 = new int[var6];
            for (int var7 = 0; var7 < this.field3341.length; var7++) {
                this.field3341[var7] = arg0.method3460();
            }
            this.field3324 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3324[var8] = arg0.method3599();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3338 = arg0.method3647();
            } else if (arg1 == 18) {
                arg0.method3656();
            } else if (arg1 == 19) {
                this.field3343 = arg0.method3610();
            } else if (arg1 == 21) {
                arg0.method3460();
            } else if (arg1 == 22) {
                arg0.method3460();
            } else if (arg1 == 23) {
                arg0.method3443();
                arg0.method3443();
                arg0.method3443();
            } else if (arg1 == 24) {
                arg0.method3458();
                arg0.method3458();
            } else if (arg1 == 25) {
                arg0.method3656();
            } else if (arg1 == 28) {
                arg0.method3443();
            } else if (arg1 == 29) {
                class277[] var9 = new class277[] { class277.field3561, class277.field3562, class277.field3565 };
                this.field3339 = (class277) Statics.method2007(var9, arg0.method3443());
            } else if (arg1 == 30) {
                class260[] var10 = new class260[] { class260.field3304, class260.field3303, class260.field3305 };
                this.field3340 = (class260) Statics.method2007(var10, arg0.method3443());
            }
        }
    }

    @ObfuscatedName("jd.h(I)V")
    public void method4610() {
        if (this.field3334 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3334.length; var1 += 2) {
            if (this.field3334[var1] < this.field3335) {
                this.field3335 = this.field3334[var1];
            } else if (this.field3334[var1] > this.field3337) {
                this.field3337 = this.field3334[var1];
            }
            if (this.field3334[var1 + 1] < this.field3336) {
                this.field3336 = this.field3334[var1 + 1];
            } else if (this.field3334[var1 + 1] > this.field3333) {
                this.field3333 = this.field3334[var1 + 1];
            }
        }
    }

    @ObfuscatedName("jd.f(ZI)Lld;")
    public class328 method4611(boolean arg0) {
        int var2 = arg0 ? this.field3327 : this.field3326;
        return this.method4612(var2);
    }

    @ObfuscatedName("jd.p(II)Lld;")
    public class328 method4612(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class328 var2 = (class328) field3322.method3885((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class328 var3 = class329.method4673(Statics.field3342, arg0, 0);
        if (var3 != null) {
            field3322.method3878(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("jd.m(I)I")
    public int method4627() {
        return this.field3325;
    }
}
