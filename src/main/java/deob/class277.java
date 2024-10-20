package deob;

@ObfuscatedName("jx")
public class class277 extends class214 {

    @ObfuscatedName("jx.l")
    public static class208 field3552 = new class208(64);

    @ObfuscatedName("jx.g")
    public static class208 field3562 = new class208(50);

    @ObfuscatedName("jx.b")
    public int field3573;

    @ObfuscatedName("jx.a")
    public String field3554 = class245.field2894;

    @ObfuscatedName("jx.c")
    public int field3549 = 1;

    @ObfuscatedName("jx.z")
    public int[] field3556;

    @ObfuscatedName("jx.j")
    public int[] field3557;

    @ObfuscatedName("jx.d")
    public int field3558 = -1;

    @ObfuscatedName("jx.t")
    public int field3559 = -1;

    @ObfuscatedName("jx.f")
    public int field3564 = -1;

    @ObfuscatedName("jx.i")
    public int field3555 = -1;

    @ObfuscatedName("jx.m")
    public int field3553 = -1;

    @ObfuscatedName("jx.v")
    public int field3563 = -1;

    @ObfuscatedName("jx.r")
    public int field3568 = -1;

    @ObfuscatedName("jx.x")
    public short[] field3565;

    @ObfuscatedName("jx.y")
    public short[] field3566;

    @ObfuscatedName("jx.p")
    public short[] field3560;

    @ObfuscatedName("jx.k")
    public short[] field3571;

    @ObfuscatedName("jx.o")
    public String[] field3569 = new String[5];

    @ObfuscatedName("jx.s")
    public boolean field3570 = true;

    @ObfuscatedName("jx.u")
    public int field3551 = -1;

    @ObfuscatedName("jx.e")
    public int field3572 = 128;

    @ObfuscatedName("jx.w")
    public int field3579 = 128;

    @ObfuscatedName("jx.q")
    public boolean field3567 = false;

    @ObfuscatedName("jx.aa")
    public int field3575 = 0;

    @ObfuscatedName("jx.ai")
    public int field3576 = 0;

    @ObfuscatedName("jx.ag")
    public int field3577 = -1;

    @ObfuscatedName("jx.at")
    public int field3578 = 32;

    @ObfuscatedName("jx.ad")
    public int[] field3574;

    @ObfuscatedName("jx.as")
    public int field3580 = -1;

    @ObfuscatedName("jx.ac")
    public int field3581 = -1;

    @ObfuscatedName("jx.an")
    public boolean field3582 = true;

    @ObfuscatedName("jx.ak")
    public boolean field3583 = true;

    @ObfuscatedName("jx.ah")
    public boolean field3584 = false;

    @ObfuscatedName("jx.al")
    public class205 field3585;

    @ObfuscatedName("m.n(Lij;Lij;I)V")
    public static void method153(class254 arg0, class254 arg1) {
        Statics.field3561 = arg0;
        Statics.field3550 = arg1;
    }

    @ObfuscatedName("l.h(II)Ljx;")
    public static class277 method17(int arg0) {
        class277 var1 = (class277) field3552.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3561.method4494(9, arg0);
        class277 var3 = new class277();
        var3.field3573 = arg0;
        if (var2 != null) {
            var3.method5004(new class190(var2));
        }
        var3.method4979();
        field3552.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.l(I)V")
    public void method4979() {
    }

    @ObfuscatedName("jx.g(Lgc;I)V")
    public void method5004(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4973(arg0, var2);
        }
    }

    @ObfuscatedName("jx.b(Lgc;IB)V")
    public void method4973(class190 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3511();
            this.field3556 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3556[var4] = arg0.method3513();
            }
        } else if (arg1 == 2) {
            this.field3554 = arg0.method3520();
        } else if (arg1 == 12) {
            this.field3549 = arg0.method3511();
        } else if (arg1 == 13) {
            this.field3558 = arg0.method3513();
        } else if (arg1 == 14) {
            this.field3555 = arg0.method3513();
        } else if (arg1 == 15) {
            this.field3559 = arg0.method3513();
        } else if (arg1 == 16) {
            this.field3564 = arg0.method3513();
        } else if (arg1 == 17) {
            this.field3555 = arg0.method3513();
            this.field3553 = arg0.method3513();
            this.field3563 = arg0.method3513();
            this.field3568 = arg0.method3513();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3569[arg1 - 30] = arg0.method3520();
            if (this.field3569[arg1 - 30].equalsIgnoreCase(class245.field2999)) {
                this.field3569[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3511();
            this.field3565 = new short[var5];
            this.field3566 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3565[var6] = (short) arg0.method3513();
                this.field3566[var6] = (short) arg0.method3513();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3511();
            this.field3560 = new short[var7];
            this.field3571 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3560[var8] = (short) arg0.method3513();
                this.field3571[var8] = (short) arg0.method3513();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3511();
            this.field3557 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3557[var10] = arg0.method3513();
            }
        } else if (arg1 == 93) {
            this.field3570 = false;
        } else if (arg1 == 95) {
            this.field3551 = arg0.method3513();
        } else if (arg1 == 97) {
            this.field3572 = arg0.method3513();
        } else if (arg1 == 98) {
            this.field3579 = arg0.method3513();
        } else if (arg1 == 99) {
            this.field3567 = true;
        } else if (arg1 == 100) {
            this.field3575 = arg0.method3512();
        } else if (arg1 == 101) {
            this.field3576 = arg0.method3512();
        } else if (arg1 == 102) {
            this.field3577 = arg0.method3513();
        } else if (arg1 == 103) {
            this.field3578 = arg0.method3513();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3580 = arg0.method3513();
            if (this.field3580 == 65535) {
                this.field3580 = -1;
            }
            this.field3581 = arg0.method3513();
            if (this.field3581 == 65535) {
                this.field3581 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3513();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3511();
            this.field3574 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3574[var13] = arg0.method3513();
                if (this.field3574[var13] == 65535) {
                    this.field3574[var13] = -1;
                }
            }
            this.field3574[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3582 = false;
        } else if (arg1 == 109) {
            this.field3583 = false;
        } else if (arg1 == 111) {
            this.field3584 = true;
        } else if (arg1 == 249) {
            this.field3585 = class268.method4601(arg0, this.field3585);
        }
    }

    @ObfuscatedName("jx.a(Ljt;ILjt;II)Ldq;")
    public final class127 method4974(class279 arg0, int arg1, class279 arg2, int arg3) {
        if (this.field3574 != null) {
            class277 var5 = this.method4976();
            return var5 == null ? null : var5.method4974(arg0, arg1, arg2, arg3);
        }
        class127 var6 = (class127) field3562.method3902((long) this.field3573);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3556.length; var8++) {
                if (!Statics.field3550.method4456(this.field3556[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class121[] var9 = new class121[this.field3556.length];
            for (int var10 = 0; var10 < this.field3556.length; var10++) {
                var9[var10] = class121.method2653(Statics.field3550, this.field3556[var10], 0);
            }
            class121 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class121(var9, var9.length);
            }
            if (this.field3565 != null) {
                for (int var12 = 0; var12 < this.field3565.length; var12++) {
                    var11.method2648(this.field3565[var12], this.field3566[var12]);
                }
            }
            if (this.field3560 != null) {
                for (int var13 = 0; var13 < this.field3560.length; var13++) {
                    var11.method2590(this.field3560[var13], this.field3571[var13]);
                }
            }
            var6 = var11.method2611(this.field3575 + 64, this.field3576 * 5 + 850, -30, -50, -30);
            field3562.method3908(var6, (long) this.field3573);
        }
        class127 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method5040(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method5043(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2672(true);
        } else {
            var14 = arg2.method5043(var6, arg3);
        }
        if (this.field3572 != 128 || this.field3579 != 128) {
            var14.method2722(this.field3572, this.field3579, this.field3572);
        }
        return var14;
    }

    @ObfuscatedName("jx.c(B)Lde;")
    public final class121 method4970() {
        if (this.field3574 != null) {
            class277 var1 = this.method4976();
            return var1 == null ? null : var1.method4970();
        } else if (this.field3557 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3557.length; var3++) {
                if (!Statics.field3550.method4456(this.field3557[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class121[] var4 = new class121[this.field3557.length];
            for (int var5 = 0; var5 < this.field3557.length; var5++) {
                var4[var5] = class121.method2653(Statics.field3550, this.field3557[var5], 0);
            }
            class121 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class121(var4, var4.length);
            }
            if (this.field3565 != null) {
                for (int var7 = 0; var7 < this.field3565.length; var7++) {
                    var6.method2648(this.field3565[var7], this.field3566[var7]);
                }
            }
            if (this.field3560 != null) {
                for (int var8 = 0; var8 < this.field3560.length; var8++) {
                    var6.method2590(this.field3560[var8], this.field3571[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jx.z(B)Ljx;")
    public final class277 method4976() {
        int var1 = -1;
        if (this.field3580 != -1) {
            var1 = class233.method4441(this.field3580);
        } else if (this.field3581 != -1) {
            var1 = class233.field2632[this.field3581];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3574.length - 1) {
            var2 = this.field3574[var1];
        } else {
            var2 = this.field3574[this.field3574.length - 1];
        }
        return var2 == -1 ? null : method17(var2);
    }

    @ObfuscatedName("jx.j(I)Z")
    public boolean method4999() {
        if (this.field3574 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3580 != -1) {
            var1 = class233.method4441(this.field3580);
        } else if (this.field3581 != -1) {
            var1 = class233.field2632[this.field3581];
        }
        if (var1 >= 0 && var1 < this.field3574.length) {
            return this.field3574[var1] != -1;
        } else {
            return this.field3574[this.field3574.length - 1] != -1;
        }
    }

    @ObfuscatedName("jx.d(III)I")
    public int method4985(int arg0, int arg1) {
        class205 var3 = this.field3585;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3870((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2517;
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method5003(int arg0, String arg1) {
        class205 var3 = this.field3585;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class203 var5 = (class203) var3.method3870((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2473;
            }
        }
        return var4;
    }
}
