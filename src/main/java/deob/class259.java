package deob;

@ObfuscatedName("in")
public class class259 extends class195 {

    @ObfuscatedName("in.x")
    public static class190 field3552 = new class190(64);

    @ObfuscatedName("in.y")
    public static class190 field3533 = new class190(50);

    @ObfuscatedName("in.e")
    public int field3534;

    @ObfuscatedName("in.f")
    public String field3554 = "null";

    @ObfuscatedName("in.v")
    public int field3536 = 1;

    @ObfuscatedName("in.t")
    public int[] field3537;

    @ObfuscatedName("in.i")
    public int[] field3538;

    @ObfuscatedName("in.r")
    public int field3564 = -1;

    @ObfuscatedName("in.g")
    public int field3540 = -1;

    @ObfuscatedName("in.s")
    public int field3532 = -1;

    @ObfuscatedName("in.o")
    public int field3542 = -1;

    @ObfuscatedName("in.p")
    public int field3539 = -1;

    @ObfuscatedName("in.u")
    public int field3544 = -1;

    @ObfuscatedName("in.b")
    public int field3545 = -1;

    @ObfuscatedName("in.w")
    public short[] field3546;

    @ObfuscatedName("in.k")
    public short[] field3547;

    @ObfuscatedName("in.n")
    public short[] field3548;

    @ObfuscatedName("in.c")
    public short[] field3549;

    @ObfuscatedName("in.l")
    public String[] field3550 = new String[5];

    @ObfuscatedName("in.m")
    public boolean field3551 = true;

    @ObfuscatedName("in.a")
    public int field3531 = -1;

    @ObfuscatedName("in.h")
    public int field3553 = 128;

    @ObfuscatedName("in.z")
    public int field3563 = 128;

    @ObfuscatedName("in.j")
    public boolean field3555 = false;

    @ObfuscatedName("in.am")
    public int field3556 = 0;

    @ObfuscatedName("in.ac")
    public int field3557 = 0;

    @ObfuscatedName("in.ax")
    public int field3535 = -1;

    @ObfuscatedName("in.at")
    public int field3559 = 32;

    @ObfuscatedName("in.ag")
    public int[] field3560;

    @ObfuscatedName("in.ar")
    public int field3561 = -1;

    @ObfuscatedName("in.ae")
    public int field3562 = -1;

    @ObfuscatedName("in.ai")
    public boolean field3543 = true;

    @ObfuscatedName("in.au")
    public boolean field3541 = true;

    @ObfuscatedName("in.ad")
    public boolean field3565 = false;

    @ObfuscatedName("in.ah")
    public class187 field3566;

    @ObfuscatedName("g.d(Lim;Lim;I)V")
    public static void method48(class236 arg0, class236 arg1) {
        Statics.field2087 = arg0;
        Statics.field3558 = arg1;
    }

    @ObfuscatedName("bn.q(II)Lin;")
    public static class259 method941(int arg0) {
        class259 var1 = (class259) field3552.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2087.method3750(9, arg0);
        class259 var3 = new class259();
        var3.field3534 = arg0;
        if (var2 != null) {
            var3.method4247(new class174(var2));
        }
        var3.method4275();
        field3552.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.x(I)V")
    public void method4275() {
    }

    @ObfuscatedName("in.y(Lfw;I)V")
    public void method4247(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4240(arg0, var2);
        }
    }

    @ObfuscatedName("in.e(Lfw;II)V")
    public void method4240(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2921();
            this.field3537 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3537[var4] = arg0.method2916();
            }
        } else if (arg1 == 2) {
            this.field3554 = arg0.method2922();
        } else if (arg1 == 12) {
            this.field3536 = arg0.method2921();
        } else if (arg1 == 13) {
            this.field3564 = arg0.method2916();
        } else if (arg1 == 14) {
            this.field3542 = arg0.method2916();
        } else if (arg1 == 15) {
            this.field3540 = arg0.method2916();
        } else if (arg1 == 16) {
            this.field3532 = arg0.method2916();
        } else if (arg1 == 17) {
            this.field3542 = arg0.method2916();
            this.field3539 = arg0.method2916();
            this.field3544 = arg0.method2916();
            this.field3545 = arg0.method2916();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3550[arg1 - 30] = arg0.method2922();
            if (this.field3550[arg1 - 30].equalsIgnoreCase(class226.field2837)) {
                this.field3550[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2921();
            this.field3546 = new short[var5];
            this.field3547 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3546[var6] = (short) arg0.method2916();
                this.field3547[var6] = (short) arg0.method2916();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2921();
            this.field3548 = new short[var7];
            this.field3549 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3548[var8] = (short) arg0.method2916();
                this.field3549[var8] = (short) arg0.method2916();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2921();
            this.field3538 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3538[var10] = arg0.method2916();
            }
        } else if (arg1 == 93) {
            this.field3551 = false;
        } else if (arg1 == 95) {
            this.field3531 = arg0.method2916();
        } else if (arg1 == 97) {
            this.field3553 = arg0.method2916();
        } else if (arg1 == 98) {
            this.field3563 = arg0.method2916();
        } else if (arg1 == 99) {
            this.field3555 = true;
        } else if (arg1 == 100) {
            this.field3556 = arg0.method3082();
        } else if (arg1 == 101) {
            this.field3557 = arg0.method3082();
        } else if (arg1 == 102) {
            this.field3535 = arg0.method2916();
        } else if (arg1 == 103) {
            this.field3559 = arg0.method2916();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3561 = arg0.method2916();
            if (this.field3561 == 65535) {
                this.field3561 = -1;
            }
            this.field3562 = arg0.method2916();
            if (this.field3562 == 65535) {
                this.field3562 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2916();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2921();
            this.field3560 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3560[var13] = arg0.method2916();
                if (this.field3560[var13] == 65535) {
                    this.field3560[var13] = -1;
                }
            }
            this.field3560[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3543 = false;
        } else if (arg1 == 109) {
            this.field3541 = false;
        } else if (arg1 == 111) {
            this.field3565 = true;
        } else if (arg1 == 249) {
            this.field3566 = class250.method2459(arg0, this.field3566);
        }
    }

    @ObfuscatedName("in.f(Ljj;ILjj;II)Lev;")
    public final class134 method4248(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3560 != null) {
            class259 var5 = this.method4244();
            return var5 == null ? null : var5.method4248(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3533.method3252((long) this.field3534);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3537.length; var8++) {
                if (!Statics.field3558.method3752(this.field3537[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3537.length];
            for (int var10 = 0; var10 < this.field3537.length; var10++) {
                var9[var10] = class128.method2238(Statics.field3558, this.field3537[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3546 != null) {
                for (int var12 = 0; var12 < this.field3546.length; var12++) {
                    var11.method2226(this.field3546[var12], this.field3547[var12]);
                }
            }
            if (this.field3548 != null) {
                for (int var13 = 0; var13 < this.field3548.length; var13++) {
                    var11.method2190(this.field3548[var13], this.field3549[var13]);
                }
            }
            var6 = var11.method2246(this.field3556 + 64, this.field3557 * 5 + 850, -30, -50, -30);
            field3533.method3256(var6, (long) this.field3534);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4306(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4303(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2266(true);
        } else {
            var14 = arg2.method4303(var6, arg3);
        }
        if (this.field3553 != 128 || this.field3563 != 128) {
            var14.method2282(this.field3553, this.field3563, this.field3553);
        }
        return var14;
    }

    @ObfuscatedName("in.v(B)Ldk;")
    public final class128 method4241() {
        if (this.field3560 != null) {
            class259 var1 = this.method4244();
            return var1 == null ? null : var1.method4241();
        } else if (this.field3538 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3538.length; var3++) {
                if (!Statics.field3558.method3752(this.field3538[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3538.length];
            for (int var5 = 0; var5 < this.field3538.length; var5++) {
                var4[var5] = class128.method2238(Statics.field3558, this.field3538[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3546 != null) {
                for (int var7 = 0; var7 < this.field3546.length; var7++) {
                    var6.method2226(this.field3546[var7], this.field3547[var7]);
                }
            }
            if (this.field3548 != null) {
                for (int var8 = 0; var8 < this.field3548.length; var8++) {
                    var6.method2190(this.field3548[var8], this.field3549[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("in.t(S)Lin;")
    public final class259 method4244() {
        int var1 = -1;
        if (this.field3561 != -1) {
            var1 = class212.method1567(this.field3561);
        } else if (this.field3562 != -1) {
            var1 = class212.field2585[this.field3562];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3560.length - 1) {
            var2 = this.field3560[var1];
        } else {
            var2 = this.field3560[this.field3560.length - 1];
        }
        return var2 == -1 ? null : method941(var2);
    }

    @ObfuscatedName("in.i(I)Z")
    public boolean method4246() {
        if (this.field3560 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3561 != -1) {
            var1 = class212.method1567(this.field3561);
        } else if (this.field3562 != -1) {
            var1 = class212.field2585[this.field3562];
        }
        if (var1 >= 0 && var1 < this.field3560.length) {
            return this.field3560[var1] != -1;
        } else {
            return this.field3560[this.field3560.length - 1] != -1;
        }
    }

    @ObfuscatedName("in.r(III)I")
    public int method4242(int arg0, int arg1) {
        return class250.method720(this.field3566, arg0, arg1);
    }

    @ObfuscatedName("in.g(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4243(int arg0, String arg1) {
        return class250.method319(this.field3566, arg0, arg1);
    }

    @ObfuscatedName("bb.s(I)V")
    public static void method1014() {
        field3552.method3250();
        field3533.method3250();
    }
}
