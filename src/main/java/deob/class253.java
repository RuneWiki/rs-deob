package deob;

@ObfuscatedName("io")
public class class253 extends class176 {

    @ObfuscatedName("io.k")
    public static class146 field3309 = new class146(64);

    @ObfuscatedName("io.u")
    public static class146 field3310 = new class146(64);

    @ObfuscatedName("io.n")
    public static class146 field3311 = new class146(20);

    @ObfuscatedName("io.c")
    public int field3321 = -1;

    @ObfuscatedName("io.r")
    public int field3314 = 16777215;

    @ObfuscatedName("io.y")
    public int field3315 = 70;

    @ObfuscatedName("io.p")
    public int field3316 = -1;

    @ObfuscatedName("io.b")
    public int field3317 = -1;

    @ObfuscatedName("io.g")
    public int field3312 = -1;

    @ObfuscatedName("io.e")
    public int field3313 = -1;

    @ObfuscatedName("io.z")
    public int field3320 = 0;

    @ObfuscatedName("io.a")
    public int field3308 = 0;

    @ObfuscatedName("io.w")
    public int field3319 = -1;

    @ObfuscatedName("io.l")
    public String field3323 = "";

    @ObfuscatedName("io.h")
    public int field3324 = -1;

    @ObfuscatedName("io.v")
    public int field3325 = 0;

    @ObfuscatedName("io.m")
    public int[] field3326;

    @ObfuscatedName("io.o")
    public int field3327 = -1;

    @ObfuscatedName("io.av")
    public int field3322 = -1;

    @ObfuscatedName("ix.s(II)Lio;")
    public static class253 method4116(int arg0) {
        class253 var1 = (class253) field3309.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3328.method3790(32, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4150(new class300(var2));
        }
        field3309.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.j(Lky;I)V")
    public void method4150(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4151(arg0, var2);
        }
    }

    @ObfuscatedName("io.i(Lky;II)V")
    public void method4151(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3321 = arg0.method5246();
        } else if (arg1 == 2) {
            this.field3314 = arg0.method5169();
        } else if (arg1 == 3) {
            this.field3316 = arg0.method5246();
        } else if (arg1 == 4) {
            this.field3312 = arg0.method5246();
        } else if (arg1 == 5) {
            this.field3317 = arg0.method5246();
        } else if (arg1 == 6) {
            this.field3313 = arg0.method5246();
        } else if (arg1 == 7) {
            this.field3320 = arg0.method5055();
        } else if (arg1 == 8) {
            this.field3323 = arg0.method5062();
        } else if (arg1 == 9) {
            this.field3315 = arg0.method5054();
        } else if (arg1 == 10) {
            this.field3308 = arg0.method5055();
        } else if (arg1 == 11) {
            this.field3319 = 0;
        } else if (arg1 == 12) {
            this.field3324 = arg0.method5179();
        } else if (arg1 == 13) {
            this.field3325 = arg0.method5055();
        } else if (arg1 == 14) {
            this.field3319 = arg0.method5054();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3327 = arg0.method5054();
            if (this.field3327 == 65535) {
                this.field3327 = -1;
            }
            this.field3322 = arg0.method5054();
            if (this.field3322 == 65535) {
                this.field3322 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5054();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5179();
            this.field3326 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3326[var5] = arg0.method5054();
                if (this.field3326[var5] == 65535) {
                    this.field3326[var5] = -1;
                }
            }
            this.field3326[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("io.k(I)Lio;")
    public final class253 method4152() {
        int var1 = -1;
        if (this.field3327 != -1) {
            var1 = class213.method3606(this.field3327);
        } else if (this.field3322 != -1) {
            var1 = class213.field2503[this.field3322];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3326.length - 1) {
            var2 = this.field3326[var1];
        } else {
            var2 = this.field3326[this.field3326.length - 1];
        }
        return var2 == -1 ? null : method4116(var2);
    }

    @ObfuscatedName("io.u(II)Ljava/lang/String;")
    public String method4153(int arg0) {
        String var2 = this.field3323;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class291.method4786(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("io.n(B)Lls;")
    public class325 method4181() {
        if (this.field3316 < 0) {
            return null;
        }
        class325 var1 = (class325) field3310.method3065((long) this.field3316);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method2824(Statics.field59, this.field3316, 0);
        if (var2 != null) {
            field3310.method3067(var2, (long) this.field3316);
        }
        return var2;
    }

    @ObfuscatedName("io.t(I)Lls;")
    public class325 method4155() {
        if (this.field3317 < 0) {
            return null;
        }
        class325 var1 = (class325) field3310.method3065((long) this.field3317);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method2824(Statics.field59, this.field3317, 0);
        if (var2 != null) {
            field3310.method3067(var2, (long) this.field3317);
        }
        return var2;
    }

    @ObfuscatedName("io.q(B)Lls;")
    public class325 method4159() {
        if (this.field3312 < 0) {
            return null;
        }
        class325 var1 = (class325) field3310.method3065((long) this.field3312);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method2824(Statics.field59, this.field3312, 0);
        if (var2 != null) {
            field3310.method3067(var2, (long) this.field3312);
        }
        return var2;
    }

    @ObfuscatedName("io.x(B)Lls;")
    public class325 method4157() {
        if (this.field3313 < 0) {
            return null;
        }
        class325 var1 = (class325) field3310.method3065((long) this.field3313);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method2824(Statics.field59, this.field3313, 0);
        if (var2 != null) {
            field3310.method3067(var2, (long) this.field3313);
        }
        return var2;
    }

    @ObfuscatedName("io.d(I)Lkb;")
    public class295 method4156() {
        if (this.field3321 == -1) {
            return null;
        }
        class295 var1 = (class295) field3311.method3065((long) this.field3321);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class326.method3212(Statics.field59, Statics.field354, this.field3321, 0);
        if (var2 != null) {
            field3311.method3067(var2, (long) this.field3321);
        }
        return var2;
    }

    @ObfuscatedName("b.f(I)V")
    public static void method154() {
        field3309.method3068();
        field3310.method3068();
        field3311.method3068();
    }
}
