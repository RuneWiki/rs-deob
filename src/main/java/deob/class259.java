package deob;

@ObfuscatedName("iy")
public class class259 extends class195 {

    @ObfuscatedName("iy.a")
    public static class190 field3558 = new class190(64);

    @ObfuscatedName("iy.t")
    public static class190 field3559 = new class190(50);

    @ObfuscatedName("iy.s")
    public int field3560;

    @ObfuscatedName("iy.r")
    public String field3561 = "null";

    @ObfuscatedName("iy.v")
    public int field3562 = 1;

    @ObfuscatedName("iy.y")
    public int[] field3563;

    @ObfuscatedName("iy.j")
    public int[] field3564;

    @ObfuscatedName("iy.k")
    public int field3565 = -1;

    @ObfuscatedName("iy.e")
    public int field3556 = -1;

    @ObfuscatedName("iy.o")
    public int field3567 = -1;

    @ObfuscatedName("iy.z")
    public int field3557 = -1;

    @ObfuscatedName("iy.l")
    public int field3578 = -1;

    @ObfuscatedName("iy.c")
    public int field3576 = -1;

    @ObfuscatedName("iy.m")
    public int field3571 = -1;

    @ObfuscatedName("iy.b")
    public short[] field3579;

    @ObfuscatedName("iy.f")
    public short[] field3569;

    @ObfuscatedName("iy.n")
    public short[] field3583;

    @ObfuscatedName("iy.u")
    public short[] field3570;

    @ObfuscatedName("iy.p")
    public String[] field3573 = new String[5];

    @ObfuscatedName("iy.q")
    public boolean field3577 = true;

    @ObfuscatedName("iy.d")
    public int field3572 = -1;

    @ObfuscatedName("iy.h")
    public int field3575 = 128;

    @ObfuscatedName("iy.g")
    public int field3580 = 128;

    @ObfuscatedName("iy.x")
    public boolean field3581 = false;

    @ObfuscatedName("iy.ah")
    public int field3582 = 0;

    @ObfuscatedName("iy.ab")
    public int field3566 = 0;

    @ObfuscatedName("iy.aw")
    public int field3584 = -1;

    @ObfuscatedName("iy.ai")
    public int field3574 = 32;

    @ObfuscatedName("iy.an")
    public int[] field3586;

    @ObfuscatedName("iy.au")
    public int field3587 = -1;

    @ObfuscatedName("iy.ar")
    public int field3588 = -1;

    @ObfuscatedName("iy.ay")
    public boolean field3589 = true;

    @ObfuscatedName("iy.ao")
    public boolean field3590 = true;

    @ObfuscatedName("iy.as")
    public boolean field3591 = false;

    @ObfuscatedName("iy.ak")
    public class187 field3592;

    @ObfuscatedName("as.i(II)Liy;")
    public static class259 method471(int arg0) {
        class259 var1 = (class259) field3558.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3568.method3768(9, arg0);
        class259 var3 = new class259();
        var3.field3560 = arg0;
        if (var2 != null) {
            var3.method4278(new class174(var2));
        }
        var3.method4297();
        field3558.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.w(I)V")
    public void method4297() {
    }

    @ObfuscatedName("iy.a(Lfp;B)V")
    public void method4278(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4279(arg0, var2);
        }
    }

    @ObfuscatedName("iy.t(Lfp;II)V")
    public void method4279(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3061();
            this.field3563 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3563[var4] = arg0.method2882();
            }
        } else if (arg1 == 2) {
            this.field3561 = arg0.method2884();
        } else if (arg1 == 12) {
            this.field3562 = arg0.method3061();
        } else if (arg1 == 13) {
            this.field3565 = arg0.method2882();
        } else if (arg1 == 14) {
            this.field3557 = arg0.method2882();
        } else if (arg1 == 15) {
            this.field3556 = arg0.method2882();
        } else if (arg1 == 16) {
            this.field3567 = arg0.method2882();
        } else if (arg1 == 17) {
            this.field3557 = arg0.method2882();
            this.field3578 = arg0.method2882();
            this.field3576 = arg0.method2882();
            this.field3571 = arg0.method2882();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3573[arg1 - 30] = arg0.method2884();
            if (this.field3573[arg1 - 30].equalsIgnoreCase(class226.field2863)) {
                this.field3573[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3061();
            this.field3579 = new short[var5];
            this.field3569 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3579[var6] = (short) arg0.method2882();
                this.field3569[var6] = (short) arg0.method2882();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3061();
            this.field3583 = new short[var7];
            this.field3570 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3583[var8] = (short) arg0.method2882();
                this.field3570[var8] = (short) arg0.method2882();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3061();
            this.field3564 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3564[var10] = arg0.method2882();
            }
        } else if (arg1 == 93) {
            this.field3577 = false;
        } else if (arg1 == 95) {
            this.field3572 = arg0.method2882();
        } else if (arg1 == 97) {
            this.field3575 = arg0.method2882();
        } else if (arg1 == 98) {
            this.field3580 = arg0.method2882();
        } else if (arg1 == 99) {
            this.field3581 = true;
        } else if (arg1 == 100) {
            this.field3582 = arg0.method2930();
        } else if (arg1 == 101) {
            this.field3566 = arg0.method2930();
        } else if (arg1 == 102) {
            this.field3584 = arg0.method2882();
        } else if (arg1 == 103) {
            this.field3574 = arg0.method2882();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3587 = arg0.method2882();
            if (this.field3587 == 65535) {
                this.field3587 = -1;
            }
            this.field3588 = arg0.method2882();
            if (this.field3588 == 65535) {
                this.field3588 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2882();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3061();
            this.field3586 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3586[var13] = arg0.method2882();
                if (this.field3586[var13] == 65535) {
                    this.field3586[var13] = -1;
                }
            }
            this.field3586[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3589 = false;
        } else if (arg1 == 109) {
            this.field3590 = false;
        } else if (arg1 == 111) {
            this.field3591 = true;
        } else if (arg1 == 249) {
            this.field3592 = class250.method1072(arg0, this.field3592);
        }
    }

    @ObfuscatedName("iy.s(Ljn;ILjn;II)Let;")
    public final class134 method4287(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3586 != null) {
            class259 var5 = this.method4282();
            return var5 == null ? null : var5.method4287(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3559.method3235((long) this.field3560);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3563.length; var8++) {
                if (!Statics.field3585.method3770(this.field3563[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3563.length];
            for (int var10 = 0; var10 < this.field3563.length; var10++) {
                var9[var10] = class128.method2190(Statics.field3585, this.field3563[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3579 != null) {
                for (int var12 = 0; var12 < this.field3579.length; var12++) {
                    var11.method2198(this.field3579[var12], this.field3569[var12]);
                }
            }
            if (this.field3583 != null) {
                for (int var13 = 0; var13 < this.field3583.length; var13++) {
                    var11.method2226(this.field3583[var13], this.field3570[var13]);
                }
            }
            var6 = var11.method2221(this.field3582 + 64, this.field3566 * 5 + 850, -30, -50, -30);
            field3559.method3234(var6, (long) this.field3560);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4330(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4340(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2306(true);
        } else {
            var14 = arg2.method4340(var6, arg3);
        }
        if (this.field3575 != 128 || this.field3580 != 128) {
            var14.method2342(this.field3575, this.field3580, this.field3575);
        }
        return var14;
    }

    @ObfuscatedName("iy.r(B)Ldo;")
    public final class128 method4281() {
        if (this.field3586 != null) {
            class259 var1 = this.method4282();
            return var1 == null ? null : var1.method4281();
        } else if (this.field3564 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3564.length; var3++) {
                if (!Statics.field3585.method3770(this.field3564[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3564.length];
            for (int var5 = 0; var5 < this.field3564.length; var5++) {
                var4[var5] = class128.method2190(Statics.field3585, this.field3564[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3579 != null) {
                for (int var7 = 0; var7 < this.field3579.length; var7++) {
                    var6.method2198(this.field3579[var7], this.field3569[var7]);
                }
            }
            if (this.field3583 != null) {
                for (int var8 = 0; var8 < this.field3583.length; var8++) {
                    var6.method2226(this.field3583[var8], this.field3570[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("iy.v(B)Liy;")
    public final class259 method4282() {
        int var1 = -1;
        if (this.field3587 != -1) {
            var1 = class212.method227(this.field3587);
        } else if (this.field3588 != -1) {
            var1 = class212.field2613[this.field3588];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3586.length - 1) {
            var2 = this.field3586[var1];
        } else {
            var2 = this.field3586[this.field3586.length - 1];
        }
        return var2 == -1 ? null : method471(var2);
    }

    @ObfuscatedName("iy.y(B)Z")
    public boolean method4302() {
        if (this.field3586 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3587 != -1) {
            var1 = class212.method227(this.field3587);
        } else if (this.field3588 != -1) {
            var1 = class212.field2613[this.field3588];
        }
        if (var1 >= 0 && var1 < this.field3586.length) {
            return this.field3586[var1] != -1;
        } else {
            return this.field3586[this.field3586.length - 1] != -1;
        }
    }

    @ObfuscatedName("iy.j(III)I")
    public int method4284(int arg0, int arg1) {
        return class250.method1727(this.field3592, arg0, arg1);
    }

    @ObfuscatedName("iy.k(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4285(int arg0, String arg1) {
        return class250.method1585(this.field3592, arg0, arg1);
    }
}
