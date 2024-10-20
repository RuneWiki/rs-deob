package deob;

@ObfuscatedName("iw")
public class class257 extends class183 {

    @ObfuscatedName("iw.y")
    public static class155 field3431 = new class155(64);

    @ObfuscatedName("iw.w")
    public static class155 field3432 = new class155(50);

    @ObfuscatedName("iw.p")
    public int field3436;

    @ObfuscatedName("iw.b")
    public String field3458 = class225.field2800;

    @ObfuscatedName("iw.e")
    public int field3435 = 1;

    @ObfuscatedName("iw.x")
    public int[] field3448;

    @ObfuscatedName("iw.a")
    public int[] field3437;

    @ObfuscatedName("iw.d")
    public int field3438 = -1;

    @ObfuscatedName("iw.c")
    public int field3439 = -1;

    @ObfuscatedName("iw.o")
    public int field3429 = -1;

    @ObfuscatedName("iw.v")
    public int field3434 = -1;

    @ObfuscatedName("iw.k")
    public int field3442 = -1;

    @ObfuscatedName("iw.s")
    public int field3443 = -1;

    @ObfuscatedName("iw.l")
    public int field3440 = -1;

    @ObfuscatedName("iw.t")
    public short[] field3445;

    @ObfuscatedName("iw.j")
    public short[] field3446;

    @ObfuscatedName("iw.n")
    public short[] field3447;

    @ObfuscatedName("iw.u")
    public short[] field3462;

    @ObfuscatedName("iw.z")
    public String[] field3456 = new String[5];

    @ObfuscatedName("iw.h")
    public boolean field3450 = true;

    @ObfuscatedName("iw.m")
    public int field3457 = -1;

    @ObfuscatedName("iw.g")
    public int field3452 = 128;

    @ObfuscatedName("iw.r")
    public int field3453 = 128;

    @ObfuscatedName("iw.q")
    public boolean field3441 = false;

    @ObfuscatedName("iw.aa")
    public int field3455 = 0;

    @ObfuscatedName("iw.av")
    public int field3454 = 0;

    @ObfuscatedName("iw.aw")
    public int field3433 = -1;

    @ObfuscatedName("iw.as")
    public int field3451 = 32;

    @ObfuscatedName("iw.ak")
    public int[] field3459;

    @ObfuscatedName("iw.au")
    public int field3460 = -1;

    @ObfuscatedName("iw.ah")
    public int field3449 = -1;

    @ObfuscatedName("iw.aq")
    public boolean field3444 = true;

    @ObfuscatedName("iw.ao")
    public boolean field3463 = true;

    @ObfuscatedName("iw.an")
    public boolean field3464 = false;

    @ObfuscatedName("iw.ar")
    public class316 field3465;

    @ObfuscatedName("jm.f(II)Liw;")
    public static class257 method4706(int arg0) {
        class257 var1 = (class257) field3431.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3461.method3752(9, arg0);
        class257 var3 = new class257();
        var3.field3436 = arg0;
        if (var2 != null) {
            var3.method4339(new class300(var2));
        }
        var3.method4338();
        field3431.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.i(I)V")
    public void method4338() {
    }

    @ObfuscatedName("iw.y(Lkq;I)V")
    public void method4339(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4358(arg0, var2);
        }
    }

    @ObfuscatedName("iw.w(Lkq;II)V")
    public void method4358(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5110();
            this.field3448 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3448[var4] = arg0.method5112();
            }
        } else if (arg1 == 2) {
            this.field3458 = arg0.method5119();
        } else if (arg1 == 12) {
            this.field3435 = arg0.method5110();
        } else if (arg1 == 13) {
            this.field3438 = arg0.method5112();
        } else if (arg1 == 14) {
            this.field3434 = arg0.method5112();
        } else if (arg1 == 15) {
            this.field3439 = arg0.method5112();
        } else if (arg1 == 16) {
            this.field3429 = arg0.method5112();
        } else if (arg1 == 17) {
            this.field3434 = arg0.method5112();
            this.field3442 = arg0.method5112();
            this.field3443 = arg0.method5112();
            this.field3440 = arg0.method5112();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3456[arg1 - 30] = arg0.method5119();
            if (this.field3456[arg1 - 30].equalsIgnoreCase(class225.field2747)) {
                this.field3456[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5110();
            this.field3445 = new short[var5];
            this.field3446 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3445[var6] = (short) arg0.method5112();
                this.field3446[var6] = (short) arg0.method5112();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5110();
            this.field3447 = new short[var7];
            this.field3462 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3447[var8] = (short) arg0.method5112();
                this.field3462[var8] = (short) arg0.method5112();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5110();
            this.field3437 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3437[var10] = arg0.method5112();
            }
        } else if (arg1 == 93) {
            this.field3450 = false;
        } else if (arg1 == 95) {
            this.field3457 = arg0.method5112();
        } else if (arg1 == 97) {
            this.field3452 = arg0.method5112();
        } else if (arg1 == 98) {
            this.field3453 = arg0.method5112();
        } else if (arg1 == 99) {
            this.field3441 = true;
        } else if (arg1 == 100) {
            this.field3455 = arg0.method5297();
        } else if (arg1 == 101) {
            this.field3454 = arg0.method5297();
        } else if (arg1 == 102) {
            this.field3433 = arg0.method5112();
        } else if (arg1 == 103) {
            this.field3451 = arg0.method5112();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3460 = arg0.method5112();
            if (this.field3460 == 65535) {
                this.field3460 = -1;
            }
            this.field3449 = arg0.method5112();
            if (this.field3449 == 65535) {
                this.field3449 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5112();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5110();
            this.field3459 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3459[var13] = arg0.method5112();
                if (this.field3459[var13] == 65535) {
                    this.field3459[var13] = -1;
                }
            }
            this.field3459[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3444 = false;
        } else if (arg1 == 109) {
            this.field3463 = false;
        } else if (arg1 == 111) {
            this.field3464 = true;
        } else if (arg1 == 249) {
            this.field3465 = class248.method3588(arg0, this.field3465);
        }
    }

    @ObfuscatedName("iw.p(Liv;ILiv;IB)Ldw;")
    public final class128 method4351(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field3459 != null) {
            class257 var5 = this.method4343();
            return var5 == null ? null : var5.method4351(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3432.method3099((long) this.field3436);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3448.length; var8++) {
                if (!Statics.field3430.method3754(this.field3448[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3448.length];
            for (int var10 = 0; var10 < this.field3448.length; var10++) {
                var9[var10] = class122.method2543(Statics.field3430, this.field3448[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3445 != null) {
                for (int var12 = 0; var12 < this.field3445.length; var12++) {
                    var11.method2602(this.field3445[var12], this.field3446[var12]);
                }
            }
            if (this.field3447 != null) {
                for (int var13 = 0; var13 < this.field3447.length; var13++) {
                    var11.method2556(this.field3447[var13], this.field3462[var13]);
                }
            }
            var6 = var11.method2603(this.field3455 + 64, this.field3454 * 5 + 850, -30, -50, -30);
            field3432.method3101(var6, (long) this.field3436);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4404(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4417(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2631(true);
        } else {
            var14 = arg2.method4417(var6, arg3);
        }
        if (this.field3452 != 128 || this.field3453 != 128) {
            var14.method2647(this.field3452, this.field3453, this.field3452);
        }
        return var14;
    }

    @ObfuscatedName("iw.b(B)Ldd;")
    public final class122 method4354() {
        if (this.field3459 != null) {
            class257 var1 = this.method4343();
            return var1 == null ? null : var1.method4354();
        } else if (this.field3437 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3437.length; var3++) {
                if (!Statics.field3430.method3754(this.field3437[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3437.length];
            for (int var5 = 0; var5 < this.field3437.length; var5++) {
                var4[var5] = class122.method2543(Statics.field3430, this.field3437[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3445 != null) {
                for (int var7 = 0; var7 < this.field3445.length; var7++) {
                    var6.method2602(this.field3445[var7], this.field3446[var7]);
                }
            }
            if (this.field3447 != null) {
                for (int var8 = 0; var8 < this.field3447.length; var8++) {
                    var6.method2556(this.field3447[var8], this.field3462[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("iw.e(B)Liw;")
    public final class257 method4343() {
        int var1 = -1;
        if (this.field3460 != -1) {
            var1 = Statics.method782(this.field3460);
        } else if (this.field3449 != -1) {
            var1 = class213.field2511[this.field3449];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3459.length - 1) {
            var2 = this.field3459[var1];
        } else {
            var2 = this.field3459[this.field3459.length - 1];
        }
        return var2 == -1 ? null : method4706(var2);
    }

    @ObfuscatedName("iw.x(I)Z")
    public boolean method4344() {
        if (this.field3459 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3460 != -1) {
            var1 = Statics.method782(this.field3460);
        } else if (this.field3449 != -1) {
            var1 = class213.field2511[this.field3449];
        }
        if (var1 >= 0 && var1 < this.field3459.length) {
            return this.field3459[var1] != -1;
        } else {
            return this.field3459[this.field3459.length - 1] != -1;
        }
    }

    @ObfuscatedName("iw.a(III)I")
    public int method4370(int arg0, int arg1) {
        return class248.method1895(this.field3465, arg0, arg1);
    }

    @ObfuscatedName("iw.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4346(int arg0, String arg1) {
        return class248.method131(this.field3465, arg0, arg1);
    }

    @ObfuscatedName("ic.c(I)V")
    public static void method3918() {
        field3431.method3102();
        field3432.method3102();
    }
}
