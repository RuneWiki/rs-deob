package deob;

@ObfuscatedName("ic")
public class class259 extends class195 {

    @ObfuscatedName("ic.i")
    public static class190 field3594 = new class190(64);

    @ObfuscatedName("ic.j")
    public static class190 field3562 = new class190(50);

    @ObfuscatedName("ic.f")
    public int field3563;

    @ObfuscatedName("ic.m")
    public String field3564 = "null";

    @ObfuscatedName("ic.c")
    public int field3578 = 1;

    @ObfuscatedName("ic.z")
    public int[] field3566;

    @ObfuscatedName("ic.h")
    public int[] field3567;

    @ObfuscatedName("ic.g")
    public int field3575 = -1;

    @ObfuscatedName("ic.e")
    public int field3569 = -1;

    @ObfuscatedName("ic.o")
    public int field3570 = -1;

    @ObfuscatedName("ic.x")
    public int field3580 = -1;

    @ObfuscatedName("ic.a")
    public int field3572 = -1;

    @ObfuscatedName("ic.y")
    public int field3573 = -1;

    @ObfuscatedName("ic.r")
    public int field3574 = -1;

    @ObfuscatedName("ic.b")
    public short[] field3559;

    @ObfuscatedName("ic.s")
    public short[] field3576;

    @ObfuscatedName("ic.v")
    public short[] field3577;

    @ObfuscatedName("ic.t")
    public short[] field3588;

    @ObfuscatedName("ic.w")
    public String[] field3579 = new String[5];

    @ObfuscatedName("ic.l")
    public boolean field3571 = true;

    @ObfuscatedName("ic.q")
    public int field3581 = -1;

    @ObfuscatedName("ic.k")
    public int field3582 = 128;

    @ObfuscatedName("ic.d")
    public int field3568 = 128;

    @ObfuscatedName("ic.u")
    public boolean field3561 = false;

    @ObfuscatedName("ic.ae")
    public int field3585 = 0;

    @ObfuscatedName("ic.ao")
    public int field3587 = 0;

    @ObfuscatedName("ic.ad")
    public int field3584 = -1;

    @ObfuscatedName("ic.aa")
    public int field3565 = 32;

    @ObfuscatedName("ic.aw")
    public int[] field3589;

    @ObfuscatedName("ic.an")
    public int field3590 = -1;

    @ObfuscatedName("ic.al")
    public int field3591 = -1;

    @ObfuscatedName("ic.at")
    public boolean field3592 = true;

    @ObfuscatedName("ic.au")
    public boolean field3593 = true;

    @ObfuscatedName("ic.ak")
    public boolean field3583 = false;

    @ObfuscatedName("ic.as")
    public class187 field3595;

    @ObfuscatedName("ic.i(I)V")
    public void method4365() {
    }

    @ObfuscatedName("ic.j(Lfl;S)V")
    public void method4351(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4350(arg0, var2);
        }
    }

    @ObfuscatedName("ic.f(Lfl;II)V")
    public void method4350(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2925();
            this.field3566 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3566[var4] = arg0.method3065();
            }
        } else if (arg1 == 2) {
            this.field3564 = arg0.method3098();
        } else if (arg1 == 12) {
            this.field3578 = arg0.method2925();
        } else if (arg1 == 13) {
            this.field3575 = arg0.method3065();
        } else if (arg1 == 14) {
            this.field3580 = arg0.method3065();
        } else if (arg1 == 15) {
            this.field3569 = arg0.method3065();
        } else if (arg1 == 16) {
            this.field3570 = arg0.method3065();
        } else if (arg1 == 17) {
            this.field3580 = arg0.method3065();
            this.field3572 = arg0.method3065();
            this.field3573 = arg0.method3065();
            this.field3574 = arg0.method3065();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3579[arg1 - 30] = arg0.method3098();
            if (this.field3579[arg1 - 30].equalsIgnoreCase(class226.field2979)) {
                this.field3579[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2925();
            this.field3559 = new short[var5];
            this.field3576 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3559[var6] = (short) arg0.method3065();
                this.field3576[var6] = (short) arg0.method3065();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2925();
            this.field3577 = new short[var7];
            this.field3588 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3577[var8] = (short) arg0.method3065();
                this.field3588[var8] = (short) arg0.method3065();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2925();
            this.field3567 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3567[var10] = arg0.method3065();
            }
        } else if (arg1 == 93) {
            this.field3571 = false;
        } else if (arg1 == 95) {
            this.field3581 = arg0.method3065();
        } else if (arg1 == 97) {
            this.field3582 = arg0.method3065();
        } else if (arg1 == 98) {
            this.field3568 = arg0.method3065();
        } else if (arg1 == 99) {
            this.field3561 = true;
        } else if (arg1 == 100) {
            this.field3585 = arg0.method2922();
        } else if (arg1 == 101) {
            this.field3587 = arg0.method2922();
        } else if (arg1 == 102) {
            this.field3584 = arg0.method3065();
        } else if (arg1 == 103) {
            this.field3565 = arg0.method3065();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3590 = arg0.method3065();
            if (this.field3590 == 65535) {
                this.field3590 = -1;
            }
            this.field3591 = arg0.method3065();
            if (this.field3591 == 65535) {
                this.field3591 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3065();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2925();
            this.field3589 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3589[var13] = arg0.method3065();
                if (this.field3589[var13] == 65535) {
                    this.field3589[var13] = -1;
                }
            }
            this.field3589[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3592 = false;
        } else if (arg1 == 109) {
            this.field3593 = false;
        } else if (arg1 == 111) {
            this.field3583 = true;
        } else if (arg1 == 249) {
            this.field3595 = class250.method1667(arg0, this.field3595);
        }
    }

    @ObfuscatedName("ic.m(Ljd;ILjd;II)Lek;")
    public final class134 method4352(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3589 != null) {
            class259 var5 = this.method4372();
            return var5 == null ? null : var5.method4352(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3562.method3280((long) this.field3563);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3566.length; var8++) {
                if (!Statics.field3560.method3832(this.field3566[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3566.length];
            for (int var10 = 0; var10 < this.field3566.length; var10++) {
                var9[var10] = class128.method2225(Statics.field3560, this.field3566[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3559 != null) {
                for (int var12 = 0; var12 < this.field3559.length; var12++) {
                    var11.method2299(this.field3559[var12], this.field3576[var12]);
                }
            }
            if (this.field3577 != null) {
                for (int var13 = 0; var13 < this.field3577.length; var13++) {
                    var11.method2239(this.field3577[var13], this.field3588[var13]);
                }
            }
            var6 = var11.method2246(this.field3585 + 64, this.field3587 * 5 + 850, -30, -50, -30);
            field3562.method3282(var6, (long) this.field3563);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4408(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4405(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2320(true);
        } else {
            var14 = arg2.method4405(var6, arg3);
        }
        if (this.field3582 != 128 || this.field3568 != 128) {
            var14.method2336(this.field3582, this.field3568, this.field3582);
        }
        return var14;
    }

    @ObfuscatedName("ic.c(I)Ldu;")
    public final class128 method4362() {
        if (this.field3589 != null) {
            class259 var1 = this.method4372();
            return var1 == null ? null : var1.method4362();
        } else if (this.field3567 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3567.length; var3++) {
                if (!Statics.field3560.method3832(this.field3567[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3567.length];
            for (int var5 = 0; var5 < this.field3567.length; var5++) {
                var4[var5] = class128.method2225(Statics.field3560, this.field3567[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3559 != null) {
                for (int var7 = 0; var7 < this.field3559.length; var7++) {
                    var6.method2299(this.field3559[var7], this.field3576[var7]);
                }
            }
            if (this.field3577 != null) {
                for (int var8 = 0; var8 < this.field3577.length; var8++) {
                    var6.method2239(this.field3577[var8], this.field3588[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ic.z(I)Lic;")
    public final class259 method4372() {
        int var1 = -1;
        if (this.field3590 != -1) {
            var1 = class212.method3578(this.field3590);
        } else if (this.field3591 != -1) {
            var1 = class212.field2615[this.field3591];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3589.length - 1) {
            var2 = this.field3589[var1];
        } else {
            var2 = this.field3589[this.field3589.length - 1];
        }
        return var2 == -1 ? null : Statics.method3798(var2);
    }

    @ObfuscatedName("ic.h(B)Z")
    public boolean method4354() {
        if (this.field3589 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3590 != -1) {
            var1 = class212.method3578(this.field3590);
        } else if (this.field3591 != -1) {
            var1 = class212.field2615[this.field3591];
        }
        if (var1 >= 0 && var1 < this.field3589.length) {
            return this.field3589[var1] != -1;
        } else {
            return this.field3589[this.field3589.length - 1] != -1;
        }
    }

    @ObfuscatedName("ic.g(IIB)I")
    public int method4355(int arg0, int arg1) {
        return class250.method4031(this.field3595, arg0, arg1);
    }

    @ObfuscatedName("ic.e(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4369(int arg0, String arg1) {
        return class250.method3573(this.field3595, arg0, arg1);
    }
}
