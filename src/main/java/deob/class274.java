package deob;

@ObfuscatedName("ji")
public class class274 extends class209 {

    @ObfuscatedName("ji.w")
    public static class203 field3561 = new class203(64);

    @ObfuscatedName("ji.s")
    public static class203 field3574 = new class203(50);

    @ObfuscatedName("ji.e")
    public int field3578;

    @ObfuscatedName("ji.a")
    public String field3564 = class240.field2865;

    @ObfuscatedName("ji.c")
    public int field3565 = 1;

    @ObfuscatedName("ji.p")
    public int[] field3566;

    @ObfuscatedName("ji.r")
    public int[] field3567;

    @ObfuscatedName("ji.m")
    public int field3568 = -1;

    @ObfuscatedName("ji.d")
    public int field3569 = -1;

    @ObfuscatedName("ji.z")
    public int field3581 = -1;

    @ObfuscatedName("ji.x")
    public int field3571 = -1;

    @ObfuscatedName("ji.v")
    public int field3572 = -1;

    @ObfuscatedName("ji.g")
    public int field3573 = -1;

    @ObfuscatedName("ji.j")
    public int field3593 = -1;

    @ObfuscatedName("ji.b")
    public short[] field3560;

    @ObfuscatedName("ji.u")
    public short[] field3562;

    @ObfuscatedName("ji.t")
    public short[] field3577;

    @ObfuscatedName("ji.n")
    public short[] field3575;

    @ObfuscatedName("ji.h")
    public String[] field3579 = new String[5];

    @ObfuscatedName("ji.o")
    public boolean field3576 = true;

    @ObfuscatedName("ji.i")
    public int field3580 = -1;

    @ObfuscatedName("ji.k")
    public int field3588 = 128;

    @ObfuscatedName("ji.q")
    public int field3583 = 128;

    @ObfuscatedName("ji.y")
    public boolean field3584 = false;

    @ObfuscatedName("ji.av")
    public int field3585 = 0;

    @ObfuscatedName("ji.ag")
    public int field3586 = 0;

    @ObfuscatedName("ji.af")
    public int field3587 = -1;

    @ObfuscatedName("ji.az")
    public int field3563 = 32;

    @ObfuscatedName("ji.at")
    public int[] field3589;

    @ObfuscatedName("ji.ac")
    public int field3590 = -1;

    @ObfuscatedName("ji.am")
    public int field3591 = -1;

    @ObfuscatedName("ji.aw")
    public boolean field3592 = true;

    @ObfuscatedName("ji.aa")
    public boolean field3570 = true;

    @ObfuscatedName("ji.as")
    public boolean field3582 = false;

    @ObfuscatedName("ji.al")
    public class200 field3595;

    @ObfuscatedName("ie.f(Lik;Lik;I)V")
    public static void method4274(class250 arg0, class250 arg1) {
        Statics.field3594 = arg0;
        Statics.field2442 = arg1;
    }

    @ObfuscatedName("n.l(II)Lji;")
    public static class274 method187(int arg0) {
        class274 var1 = (class274) field3561.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3594.method4289(9, arg0);
        class274 var3 = new class274();
        var3.field3578 = arg0;
        if (var2 != null) {
            var3.method4847(new class185(var2));
        }
        var3.method4846();
        field3561.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.w(B)V")
    public void method4846() {
    }

    @ObfuscatedName("ji.s(Lgm;B)V")
    public void method4847(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4848(arg0, var2);
        }
    }

    @ObfuscatedName("ji.e(Lgm;IB)V")
    public void method4848(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3344();
            this.field3566 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3566[var4] = arg0.method3346();
            }
        } else if (arg1 == 2) {
            this.field3564 = arg0.method3353();
        } else if (arg1 == 12) {
            this.field3565 = arg0.method3344();
        } else if (arg1 == 13) {
            this.field3568 = arg0.method3346();
        } else if (arg1 == 14) {
            this.field3571 = arg0.method3346();
        } else if (arg1 == 15) {
            this.field3569 = arg0.method3346();
        } else if (arg1 == 16) {
            this.field3581 = arg0.method3346();
        } else if (arg1 == 17) {
            this.field3571 = arg0.method3346();
            this.field3572 = arg0.method3346();
            this.field3573 = arg0.method3346();
            this.field3593 = arg0.method3346();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3579[arg1 - 30] = arg0.method3353();
            if (this.field3579[arg1 - 30].equalsIgnoreCase(class240.field2860)) {
                this.field3579[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3344();
            this.field3560 = new short[var5];
            this.field3562 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3560[var6] = (short) arg0.method3346();
                this.field3562[var6] = (short) arg0.method3346();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3344();
            this.field3577 = new short[var7];
            this.field3575 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3577[var8] = (short) arg0.method3346();
                this.field3575[var8] = (short) arg0.method3346();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3344();
            this.field3567 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3567[var10] = arg0.method3346();
            }
        } else if (arg1 == 93) {
            this.field3576 = false;
        } else if (arg1 == 95) {
            this.field3580 = arg0.method3346();
        } else if (arg1 == 97) {
            this.field3588 = arg0.method3346();
        } else if (arg1 == 98) {
            this.field3583 = arg0.method3346();
        } else if (arg1 == 99) {
            this.field3584 = true;
        } else if (arg1 == 100) {
            this.field3585 = arg0.method3345();
        } else if (arg1 == 101) {
            this.field3586 = arg0.method3345();
        } else if (arg1 == 102) {
            this.field3587 = arg0.method3346();
        } else if (arg1 == 103) {
            this.field3563 = arg0.method3346();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3590 = arg0.method3346();
            if (this.field3590 == 65535) {
                this.field3590 = -1;
            }
            this.field3591 = arg0.method3346();
            if (this.field3591 == 65535) {
                this.field3591 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3346();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3344();
            this.field3589 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3589[var13] = arg0.method3346();
                if (this.field3589[var13] == 65535) {
                    this.field3589[var13] = -1;
                }
            }
            this.field3589[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3592 = false;
        } else if (arg1 == 109) {
            this.field3570 = false;
        } else if (arg1 == 111) {
            this.field3582 = true;
        } else if (arg1 == 249) {
            this.field3595 = class265.method1002(arg0, this.field3595);
        }
    }

    @ObfuscatedName("ji.c(Ljw;ILjw;II)Lds;")
    public final class122 method4849(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field3589 != null) {
            class274 var5 = this.method4868();
            return var5 == null ? null : var5.method4849(arg0, arg1, arg2, arg3);
        }
        class122 var6 = (class122) field3574.method3737((long) this.field3578);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3566.length; var8++) {
                if (!Statics.field2442.method4359(this.field3566[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class116[] var9 = new class116[this.field3566.length];
            for (int var10 = 0; var10 < this.field3566.length; var10++) {
                var9[var10] = class116.method2435(Statics.field2442, this.field3566[var10], 0);
            }
            class116 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class116(var9, var9.length);
            }
            if (this.field3560 != null) {
                for (int var12 = 0; var12 < this.field3560.length; var12++) {
                    var11.method2447(this.field3560[var12], this.field3562[var12]);
                }
            }
            if (this.field3577 != null) {
                for (int var13 = 0; var13 < this.field3577.length; var13++) {
                    var11.method2448(this.field3577[var13], this.field3575[var13]);
                }
            }
            var6 = var11.method2468(this.field3585 + 64, this.field3586 * 5 + 850, -30, -50, -30);
            field3574.method3744(var6, (long) this.field3578);
        }
        class122 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4927(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4904(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2536(true);
        } else {
            var14 = arg2.method4904(var6, arg3);
        }
        if (this.field3588 != 128 || this.field3583 != 128) {
            var14.method2581(this.field3588, this.field3583, this.field3588);
        }
        return var14;
    }

    @ObfuscatedName("ji.p(I)Ldb;")
    public final class116 method4878() {
        if (this.field3589 != null) {
            class274 var1 = this.method4868();
            return var1 == null ? null : var1.method4878();
        } else if (this.field3567 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3567.length; var3++) {
                if (!Statics.field2442.method4359(this.field3567[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class116[] var4 = new class116[this.field3567.length];
            for (int var5 = 0; var5 < this.field3567.length; var5++) {
                var4[var5] = class116.method2435(Statics.field2442, this.field3567[var5], 0);
            }
            class116 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class116(var4, var4.length);
            }
            if (this.field3560 != null) {
                for (int var7 = 0; var7 < this.field3560.length; var7++) {
                    var6.method2447(this.field3560[var7], this.field3562[var7]);
                }
            }
            if (this.field3577 != null) {
                for (int var8 = 0; var8 < this.field3577.length; var8++) {
                    var6.method2448(this.field3577[var8], this.field3575[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ji.r(I)Lji;")
    public final class274 method4868() {
        int var1 = -1;
        if (this.field3590 != -1) {
            var1 = class228.method2155(this.field3590);
        } else if (this.field3591 != -1) {
            var1 = class228.field2628[this.field3591];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3589.length - 1) {
            var2 = this.field3589[var1];
        } else {
            var2 = this.field3589[this.field3589.length - 1];
        }
        return var2 == -1 ? null : method187(var2);
    }

    @ObfuscatedName("ji.m(I)Z")
    public boolean method4854() {
        if (this.field3589 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3590 != -1) {
            var1 = class228.method2155(this.field3590);
        } else if (this.field3591 != -1) {
            var1 = class228.field2628[this.field3591];
        }
        if (var1 >= 0 && var1 < this.field3589.length) {
            return this.field3589[var1] != -1;
        } else {
            return this.field3589[this.field3589.length - 1] != -1;
        }
    }

    @ObfuscatedName("ji.d(III)I")
    public int method4863(int arg0, int arg1) {
        return class265.method944(this.field3595, arg0, arg1);
    }

    @ObfuscatedName("ji.z(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4870(int arg0, String arg1) {
        class200 var3 = this.field3595;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class198 var5 = (class198) var3.method3706((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2468;
            }
        }
        return var4;
    }

    @ObfuscatedName("ic.x(B)V")
    public static void method4511() {
        field3561.method3740();
        field3574.method3740();
    }
}
