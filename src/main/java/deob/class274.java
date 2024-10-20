package deob;

@ObfuscatedName("ju")
public class class274 extends class209 {

    @ObfuscatedName("ju.o")
    public static class203 field3514 = new class203(64);

    @ObfuscatedName("ju.k")
    public static class203 field3515 = new class203(50);

    @ObfuscatedName("ju.u")
    public int field3532;

    @ObfuscatedName("ju.i")
    public String field3517 = class240.field2830;

    @ObfuscatedName("ju.t")
    public int field3518 = 1;

    @ObfuscatedName("ju.p")
    public int[] field3519;

    @ObfuscatedName("ju.l")
    public int[] field3538;

    @ObfuscatedName("ju.b")
    public int field3521 = -1;

    @ObfuscatedName("ju.c")
    public int field3522 = -1;

    @ObfuscatedName("ju.d")
    public int field3523 = -1;

    @ObfuscatedName("ju.w")
    public int field3524 = -1;

    @ObfuscatedName("ju.a")
    public int field3525 = -1;

    @ObfuscatedName("ju.z")
    public int field3526 = -1;

    @ObfuscatedName("ju.e")
    public int field3527 = -1;

    @ObfuscatedName("ju.q")
    public short[] field3530;

    @ObfuscatedName("ju.j")
    public short[] field3529;

    @ObfuscatedName("ju.y")
    public short[] field3531;

    @ObfuscatedName("ju.m")
    public short[] field3540;

    @ObfuscatedName("ju.h")
    public String[] field3534 = new String[5];

    @ObfuscatedName("ju.x")
    public boolean field3533 = true;

    @ObfuscatedName("ju.f")
    public int field3528 = -1;

    @ObfuscatedName("ju.r")
    public int field3535 = 128;

    @ObfuscatedName("ju.n")
    public int field3513 = 128;

    @ObfuscatedName("ju.g")
    public boolean field3537 = false;

    @ObfuscatedName("ju.ac")
    public int field3516 = 0;

    @ObfuscatedName("ju.ab")
    public int field3539 = 0;

    @ObfuscatedName("ju.ao")
    public int field3545 = -1;

    @ObfuscatedName("ju.an")
    public int field3541 = 32;

    @ObfuscatedName("ju.ay")
    public int[] field3542;

    @ObfuscatedName("ju.av")
    public int field3543 = -1;

    @ObfuscatedName("ju.af")
    public int field3544 = -1;

    @ObfuscatedName("ju.ar")
    public boolean field3512 = true;

    @ObfuscatedName("ju.am")
    public boolean field3546 = true;

    @ObfuscatedName("ju.aj")
    public boolean field3547 = false;

    @ObfuscatedName("ju.aq")
    public class200 field3548;

    @ObfuscatedName("cx.v(II)Lju;")
    public static class274 method1807(int arg0) {
        class274 var1 = (class274) field3514.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3520.method4270(9, arg0);
        class274 var3 = new class274();
        var3.field3532 = arg0;
        if (var2 != null) {
            var3.method4810(new class185(var2));
        }
        var3.method4809();
        field3514.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.s(I)V")
    public void method4809() {
    }

    @ObfuscatedName("ju.o(Lgx;I)V")
    public void method4810(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4811(arg0, var2);
        }
    }

    @ObfuscatedName("ju.k(Lgx;II)V")
    public void method4811(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3274();
            this.field3519 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3519[var4] = arg0.method3276();
            }
        } else if (arg1 == 2) {
            this.field3517 = arg0.method3490();
        } else if (arg1 == 12) {
            this.field3518 = arg0.method3274();
        } else if (arg1 == 13) {
            this.field3521 = arg0.method3276();
        } else if (arg1 == 14) {
            this.field3524 = arg0.method3276();
        } else if (arg1 == 15) {
            this.field3522 = arg0.method3276();
        } else if (arg1 == 16) {
            this.field3523 = arg0.method3276();
        } else if (arg1 == 17) {
            this.field3524 = arg0.method3276();
            this.field3525 = arg0.method3276();
            this.field3526 = arg0.method3276();
            this.field3527 = arg0.method3276();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3534[arg1 - 30] = arg0.method3490();
            if (this.field3534[arg1 - 30].equalsIgnoreCase(class240.field2825)) {
                this.field3534[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3274();
            this.field3530 = new short[var5];
            this.field3529 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3530[var6] = (short) arg0.method3276();
                this.field3529[var6] = (short) arg0.method3276();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3274();
            this.field3531 = new short[var7];
            this.field3540 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3531[var8] = (short) arg0.method3276();
                this.field3540[var8] = (short) arg0.method3276();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3274();
            this.field3538 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3538[var10] = arg0.method3276();
            }
        } else if (arg1 == 93) {
            this.field3533 = false;
        } else if (arg1 == 95) {
            this.field3528 = arg0.method3276();
        } else if (arg1 == 97) {
            this.field3535 = arg0.method3276();
        } else if (arg1 == 98) {
            this.field3513 = arg0.method3276();
        } else if (arg1 == 99) {
            this.field3537 = true;
        } else if (arg1 == 100) {
            this.field3516 = arg0.method3275();
        } else if (arg1 == 101) {
            this.field3539 = arg0.method3275() * 5;
        } else if (arg1 == 102) {
            this.field3545 = arg0.method3276();
        } else if (arg1 == 103) {
            this.field3541 = arg0.method3276();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3543 = arg0.method3276();
            if (this.field3543 == 65535) {
                this.field3543 = -1;
            }
            this.field3544 = arg0.method3276();
            if (this.field3544 == 65535) {
                this.field3544 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3276();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3274();
            this.field3542 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3542[var13] = arg0.method3276();
                if (this.field3542[var13] == 65535) {
                    this.field3542[var13] = -1;
                }
            }
            this.field3542[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3512 = false;
        } else if (arg1 == 109) {
            this.field3546 = false;
        } else if (arg1 == 111) {
            this.field3547 = true;
        } else if (arg1 == 249) {
            this.field3548 = class265.method172(arg0, this.field3548);
        }
    }

    @ObfuscatedName("ju.u(Ljb;ILjb;IB)Lda;")
    public final class122 method4812(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field3542 != null) {
            class274 var5 = this.method4814();
            return var5 == null ? null : var5.method4812(arg0, arg1, arg2, arg3);
        }
        class122 var6 = (class122) field3515.method3687((long) this.field3532);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3519.length; var8++) {
                if (!Statics.field3536.method4272(this.field3519[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class116[] var9 = new class116[this.field3519.length];
            for (int var10 = 0; var10 < this.field3519.length; var10++) {
                var9[var10] = class116.method2418(Statics.field3536, this.field3519[var10], 0);
            }
            class116 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class116(var9, var9.length);
            }
            if (this.field3530 != null) {
                for (int var12 = 0; var12 < this.field3530.length; var12++) {
                    var11.method2391(this.field3530[var12], this.field3529[var12]);
                }
            }
            if (this.field3531 != null) {
                for (int var13 = 0; var13 < this.field3531.length; var13++) {
                    var11.method2436(this.field3531[var13], this.field3540[var13]);
                }
            }
            var6 = var11.method2399(this.field3516 + 64, this.field3539 + 850, -30, -50, -30);
            field3515.method3689(var6, (long) this.field3532);
        }
        class122 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4865(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4862(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2526(true);
        } else {
            var14 = arg2.method4862(var6, arg3);
        }
        if (this.field3535 != 128 || this.field3513 != 128) {
            var14.method2490(this.field3535, this.field3513, this.field3535);
        }
        return var14;
    }

    @ObfuscatedName("ju.i(I)Ldc;")
    public final class116 method4828() {
        if (this.field3542 != null) {
            class274 var1 = this.method4814();
            return var1 == null ? null : var1.method4828();
        } else if (this.field3538 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3538.length; var3++) {
                if (!Statics.field3536.method4272(this.field3538[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class116[] var4 = new class116[this.field3538.length];
            for (int var5 = 0; var5 < this.field3538.length; var5++) {
                var4[var5] = class116.method2418(Statics.field3536, this.field3538[var5], 0);
            }
            class116 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class116(var4, var4.length);
            }
            if (this.field3530 != null) {
                for (int var7 = 0; var7 < this.field3530.length; var7++) {
                    var6.method2391(this.field3530[var7], this.field3529[var7]);
                }
            }
            if (this.field3531 != null) {
                for (int var8 = 0; var8 < this.field3531.length; var8++) {
                    var6.method2436(this.field3531[var8], this.field3540[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ju.t(I)Lju;")
    public final class274 method4814() {
        int var1 = -1;
        if (this.field3543 != -1) {
            var1 = class228.method3899(this.field3543);
        } else if (this.field3544 != -1) {
            var1 = class228.field2596[this.field3544];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3542.length - 1) {
            var2 = this.field3542[var1];
        } else {
            var2 = this.field3542[this.field3542.length - 1];
        }
        return var2 == -1 ? null : method1807(var2);
    }

    @ObfuscatedName("ju.c(I)Z")
    public boolean method4815() {
        if (this.field3542 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3543 != -1) {
            var1 = class228.method3899(this.field3543);
        } else if (this.field3544 != -1) {
            var1 = class228.field2596[this.field3544];
        }
        if (var1 >= 0 && var1 < this.field3542.length) {
            return this.field3542[var1] != -1;
        } else {
            return this.field3542[this.field3542.length - 1] != -1;
        }
    }

    @ObfuscatedName("ju.w(III)I")
    public int method4816(int arg0, int arg1) {
        return class265.method3063(this.field3548, arg0, arg1);
    }

    @ObfuscatedName("ju.a(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4836(int arg0, String arg1) {
        return class265.method2331(this.field3548, arg0, arg1);
    }

    @ObfuscatedName("al.z(I)V")
    public static void method937() {
        field3514.method3697();
        field3515.method3697();
    }
}
