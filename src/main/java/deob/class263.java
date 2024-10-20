package deob;

@ObfuscatedName("jd")
public class class263 extends class185 {

    @ObfuscatedName("jd.t")
    public static class155 field3350 = new class155(64);

    @ObfuscatedName("jd.i")
    public static class155 field3351 = new class155(64);

    @ObfuscatedName("jd.o")
    public static class155 field3364 = new class155(20);

    @ObfuscatedName("jd.d")
    public int field3355 = -1;

    @ObfuscatedName("jd.h")
    public int field3353 = 16777215;

    @ObfuscatedName("jd.a")
    public int field3357 = 70;

    @ObfuscatedName("jd.q")
    public int field3358 = -1;

    @ObfuscatedName("jd.c")
    public int field3352 = -1;

    @ObfuscatedName("jd.f")
    public int field3360 = -1;

    @ObfuscatedName("jd.y")
    public int field3361 = -1;

    @ObfuscatedName("jd.v")
    public int field3369 = 0;

    @ObfuscatedName("jd.j")
    public int field3363 = 0;

    @ObfuscatedName("jd.r")
    public int field3356 = -1;

    @ObfuscatedName("jd.u")
    public String field3362 = "";

    @ObfuscatedName("jd.p")
    public int field3366 = -1;

    @ObfuscatedName("jd.b")
    public int field3367 = 0;

    @ObfuscatedName("jd.l")
    public int[] field3368;

    @ObfuscatedName("jd.e")
    public int field3359 = -1;

    @ObfuscatedName("jd.ab")
    public int field3370 = -1;

    @ObfuscatedName("he.z(IB)Ljd;")
    public static class263 method3603(int arg0) {
        class263 var1 = (class263) field3350.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3348.method3873(32, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4280(new class310(var2));
        }
        field3350.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.k(Lkf;I)V")
    public void method4280(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4279(arg0, var2);
        }
    }

    @ObfuscatedName("jd.s(Lkf;II)V")
    public void method4279(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3355 = arg0.method5210();
        } else if (arg1 == 2) {
            this.field3353 = arg0.method5197();
        } else if (arg1 == 3) {
            this.field3358 = arg0.method5210();
        } else if (arg1 == 4) {
            this.field3360 = arg0.method5210();
        } else if (arg1 == 5) {
            this.field3352 = arg0.method5210();
        } else if (arg1 == 6) {
            this.field3361 = arg0.method5210();
        } else if (arg1 == 7) {
            this.field3369 = arg0.method5196();
        } else if (arg1 == 8) {
            this.field3362 = arg0.method5366();
        } else if (arg1 == 9) {
            this.field3357 = arg0.method5195();
        } else if (arg1 == 10) {
            this.field3363 = arg0.method5196();
        } else if (arg1 == 11) {
            this.field3356 = 0;
        } else if (arg1 == 12) {
            this.field3366 = arg0.method5193();
        } else if (arg1 == 13) {
            this.field3367 = arg0.method5196();
        } else if (arg1 == 14) {
            this.field3356 = arg0.method5195();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3359 = arg0.method5195();
            if (this.field3359 == 65535) {
                this.field3359 = -1;
            }
            this.field3370 = arg0.method5195();
            if (this.field3370 == 65535) {
                this.field3370 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5195();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5193();
            this.field3368 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3368[var5] = arg0.method5195();
                if (this.field3368[var5] == 65535) {
                    this.field3368[var5] = -1;
                }
            }
            this.field3368[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jd.t(B)Ljd;")
    public final class263 method4313() {
        int var1 = -1;
        if (this.field3359 != -1) {
            var1 = class222.method552(this.field3359);
        } else if (this.field3370 != -1) {
            var1 = class222.field2558[this.field3370];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3368.length - 1) {
            var2 = this.field3368[var1];
        } else {
            var2 = this.field3368[this.field3368.length - 1];
        }
        return var2 == -1 ? null : method3603(var2);
    }

    @ObfuscatedName("jd.i(II)Ljava/lang/String;")
    public String method4312(int arg0) {
        String var2 = this.field3362;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class301.method3467(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jd.o(I)Llp;")
    public class335 method4284() {
        if (this.field3358 < 0) {
            return null;
        }
        class335 var1 = (class335) field3351.method3170((long) this.field3358);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method4791(Statics.field3365, this.field3358, 0);
        if (var2 != null) {
            field3351.method3169(var2, (long) this.field3358);
        }
        return var2;
    }

    @ObfuscatedName("jd.x(I)Llp;")
    public class335 method4297() {
        if (this.field3352 < 0) {
            return null;
        }
        class335 var1 = (class335) field3351.method3170((long) this.field3352);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method4791(Statics.field3365, this.field3352, 0);
        if (var2 != null) {
            field3351.method3169(var2, (long) this.field3352);
        }
        return var2;
    }

    @ObfuscatedName("jd.w(I)Llp;")
    public class335 method4286() {
        if (this.field3360 < 0) {
            return null;
        }
        class335 var1 = (class335) field3351.method3170((long) this.field3360);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method4791(Statics.field3365, this.field3360, 0);
        if (var2 != null) {
            field3351.method3169(var2, (long) this.field3360);
        }
        return var2;
    }

    @ObfuscatedName("jd.g(B)Llp;")
    public class335 method4294() {
        if (this.field3361 < 0) {
            return null;
        }
        class335 var1 = (class335) field3351.method3170((long) this.field3361);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method4791(Statics.field3365, this.field3361, 0);
        if (var2 != null) {
            field3351.method3169(var2, (long) this.field3361);
        }
        return var2;
    }

    @ObfuscatedName("jd.m(I)Lkr;")
    public class305 method4285() {
        if (this.field3355 == -1) {
            return null;
        }
        class305 var1 = (class305) field3364.method3170((long) this.field3355);
        if (var1 != null) {
            return var1;
        }
        class305 var2 = class336.method3394(Statics.field3365, Statics.field3347, this.field3355, 0);
        if (var2 != null) {
            field3364.method3169(var2, (long) this.field3355);
        }
        return var2;
    }
}
