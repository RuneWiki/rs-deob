package deob;

@ObfuscatedName("ir")
public class class260 extends class196 {

    @ObfuscatedName("ir.a")
    public static class191 field3568 = new class191(64);

    @ObfuscatedName("ir.r")
    public static class191 field3553 = new class191(50);

    @ObfuscatedName("ir.o")
    public int field3551;

    @ObfuscatedName("ir.n")
    public String field3552 = "null";

    @ObfuscatedName("ir.q")
    public int field3575 = 1;

    @ObfuscatedName("ir.b")
    public int[] field3550;

    @ObfuscatedName("ir.k")
    public int[] field3570;

    @ObfuscatedName("ir.s")
    public int field3556 = -1;

    @ObfuscatedName("ir.d")
    public int field3558 = -1;

    @ObfuscatedName("ir.l")
    public int field3547 = -1;

    @ObfuscatedName("ir.t")
    public int field3559 = -1;

    @ObfuscatedName("ir.y")
    public int field3560 = -1;

    @ObfuscatedName("ir.v")
    public int field3561 = -1;

    @ObfuscatedName("ir.c")
    public int field3562 = -1;

    @ObfuscatedName("ir.z")
    public short[] field3563;

    @ObfuscatedName("ir.u")
    public short[] field3564;

    @ObfuscatedName("ir.e")
    public short[] field3565;

    @ObfuscatedName("ir.p")
    public short[] field3566;

    @ObfuscatedName("ir.m")
    public String[] field3567 = new String[5];

    @ObfuscatedName("ir.x")
    public boolean field3581 = true;

    @ObfuscatedName("ir.h")
    public int field3569 = -1;

    @ObfuscatedName("ir.f")
    public int field3557 = 128;

    @ObfuscatedName("ir.g")
    public int field3573 = 128;

    @ObfuscatedName("ir.w")
    public boolean field3572 = false;

    @ObfuscatedName("ir.ar")
    public int field3574 = 0;

    @ObfuscatedName("ir.ax")
    public int field3554 = 0;

    @ObfuscatedName("ir.al")
    public int field3549 = -1;

    @ObfuscatedName("ir.ag")
    public int field3576 = 32;

    @ObfuscatedName("ir.ad")
    public int[] field3577;

    @ObfuscatedName("ir.ab")
    public int field3578 = -1;

    @ObfuscatedName("ir.am")
    public int field3579 = -1;

    @ObfuscatedName("ir.aq")
    public boolean field3580 = true;

    @ObfuscatedName("ir.at")
    public boolean field3555 = true;

    @ObfuscatedName("ir.az")
    public boolean field3582 = false;

    @ObfuscatedName("ir.ac")
    public class188 field3583;

    @ObfuscatedName("fz.i(IB)Lir;")
    public static class260 method2968(int arg0) {
        class260 var1 = (class260) field3568.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3571.method3824(9, arg0);
        class260 var3 = new class260();
        var3.field3551 = arg0;
        if (var2 != null) {
            var3.method4310(new class175(var2));
        }
        var3.method4318();
        field3568.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.j(I)V")
    public void method4318() {
    }

    @ObfuscatedName("ir.a(Lfp;I)V")
    public void method4310(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4292(arg0, var2);
        }
    }

    @ObfuscatedName("ir.r(Lfp;II)V")
    public void method4292(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2999();
            this.field3550 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3550[var4] = arg0.method2995();
            }
        } else if (arg1 == 2) {
            this.field3552 = arg0.method3002();
        } else if (arg1 == 12) {
            this.field3575 = arg0.method2999();
        } else if (arg1 == 13) {
            this.field3556 = arg0.method2995();
        } else if (arg1 == 14) {
            this.field3559 = arg0.method2995();
        } else if (arg1 == 15) {
            this.field3558 = arg0.method2995();
        } else if (arg1 == 16) {
            this.field3547 = arg0.method2995();
        } else if (arg1 == 17) {
            this.field3559 = arg0.method2995();
            this.field3560 = arg0.method2995();
            this.field3561 = arg0.method2995();
            this.field3562 = arg0.method2995();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3567[arg1 - 30] = arg0.method3002();
            if (this.field3567[arg1 - 30].equalsIgnoreCase(class227.field2861)) {
                this.field3567[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2999();
            this.field3563 = new short[var5];
            this.field3564 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3563[var6] = (short) arg0.method2995();
                this.field3564[var6] = (short) arg0.method2995();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2999();
            this.field3565 = new short[var7];
            this.field3566 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3565[var8] = (short) arg0.method2995();
                this.field3566[var8] = (short) arg0.method2995();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2999();
            this.field3570 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3570[var10] = arg0.method2995();
            }
        } else if (arg1 == 93) {
            this.field3581 = false;
        } else if (arg1 == 95) {
            this.field3569 = arg0.method2995();
        } else if (arg1 == 97) {
            this.field3557 = arg0.method2995();
        } else if (arg1 == 98) {
            this.field3573 = arg0.method2995();
        } else if (arg1 == 99) {
            this.field3572 = true;
        } else if (arg1 == 100) {
            this.field3574 = arg0.method3172();
        } else if (arg1 == 101) {
            this.field3554 = arg0.method3172() * 5;
        } else if (arg1 == 102) {
            this.field3549 = arg0.method2995();
        } else if (arg1 == 103) {
            this.field3576 = arg0.method2995();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3578 = arg0.method2995();
            if (this.field3578 == 65535) {
                this.field3578 = -1;
            }
            this.field3579 = arg0.method2995();
            if (this.field3579 == 65535) {
                this.field3579 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2995();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2999();
            this.field3577 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3577[var13] = arg0.method2995();
                if (this.field3577[var13] == 65535) {
                    this.field3577[var13] = -1;
                }
            }
            this.field3577[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3580 = false;
        } else if (arg1 == 109) {
            this.field3555 = false;
        } else if (arg1 == 111) {
            this.field3582 = true;
        } else if (arg1 == 249) {
            this.field3583 = class251.method475(arg0, this.field3583);
        }
    }

    @ObfuscatedName("ir.o(Ljw;ILjw;II)Lem;")
    public final class133 method4293(class262 arg0, int arg1, class262 arg2, int arg3) {
        if (this.field3577 != null) {
            class260 var5 = this.method4295();
            return var5 == null ? null : var5.method4293(arg0, arg1, arg2, arg3);
        }
        class133 var6 = (class133) field3553.method3347((long) this.field3551);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3550.length; var8++) {
                if (!Statics.field3548.method3826(this.field3550[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class127[] var9 = new class127[this.field3550.length];
            for (int var10 = 0; var10 < this.field3550.length; var10++) {
                var9[var10] = class127.method2209(Statics.field3548, this.field3550[var10], 0);
            }
            class127 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class127(var9, var9.length);
            }
            if (this.field3563 != null) {
                for (int var12 = 0; var12 < this.field3563.length; var12++) {
                    var11.method2258(this.field3563[var12], this.field3564[var12]);
                }
            }
            if (this.field3565 != null) {
                for (int var13 = 0; var13 < this.field3565.length; var13++) {
                    var11.method2260(this.field3565[var13], this.field3566[var13]);
                }
            }
            var6 = var11.method2264(this.field3574 + 64, this.field3554 + 850, -30, -50, -30);
            field3553.method3346(var6, (long) this.field3551);
        }
        class133 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4344(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4341(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2306(true);
        } else {
            var14 = arg2.method4341(var6, arg3);
        }
        if (this.field3557 != 128 || this.field3573 != 128) {
            var14.method2345(this.field3557, this.field3573, this.field3557);
        }
        return var14;
    }

    @ObfuscatedName("ir.n(B)Lde;")
    public final class127 method4294() {
        if (this.field3577 != null) {
            class260 var1 = this.method4295();
            return var1 == null ? null : var1.method4294();
        } else if (this.field3570 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3570.length; var3++) {
                if (!Statics.field3548.method3826(this.field3570[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class127[] var4 = new class127[this.field3570.length];
            for (int var5 = 0; var5 < this.field3570.length; var5++) {
                var4[var5] = class127.method2209(Statics.field3548, this.field3570[var5], 0);
            }
            class127 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class127(var4, var4.length);
            }
            if (this.field3563 != null) {
                for (int var7 = 0; var7 < this.field3563.length; var7++) {
                    var6.method2258(this.field3563[var7], this.field3564[var7]);
                }
            }
            if (this.field3565 != null) {
                for (int var8 = 0; var8 < this.field3565.length; var8++) {
                    var6.method2260(this.field3565[var8], this.field3566[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ir.q(B)Lir;")
    public final class260 method4295() {
        int var1 = -1;
        if (this.field3578 != -1) {
            var1 = class213.method1008(this.field3578);
        } else if (this.field3579 != -1) {
            var1 = class213.field2609[this.field3579];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3577.length - 1) {
            var2 = this.field3577[var1];
        } else {
            var2 = this.field3577[this.field3577.length - 1];
        }
        return var2 == -1 ? null : method2968(var2);
    }

    @ObfuscatedName("ir.b(I)Z")
    public boolean method4297() {
        if (this.field3577 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3578 != -1) {
            var1 = class213.method1008(this.field3578);
        } else if (this.field3579 != -1) {
            var1 = class213.field2609[this.field3579];
        }
        if (var1 >= 0 && var1 < this.field3577.length) {
            return this.field3577[var1] != -1;
        } else {
            return this.field3577[this.field3577.length - 1] != -1;
        }
    }

    @ObfuscatedName("ir.k(III)I")
    public int method4313(int arg0, int arg1) {
        return class251.method161(this.field3583, arg0, arg1);
    }

    @ObfuscatedName("ir.s(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4298(int arg0, String arg1) {
        return class251.method564(this.field3583, arg0, arg1);
    }
}
