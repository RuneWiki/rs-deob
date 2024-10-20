package deob;

@ObfuscatedName("js")
public class class274 extends class209 {

    @ObfuscatedName("js.n")
    public static class203 field3537 = new class203(64);

    @ObfuscatedName("js.u")
    public static class203 field3538 = new class203(50);

    @ObfuscatedName("js.i")
    public int field3539;

    @ObfuscatedName("js.r")
    public String field3540 = class240.field2840;

    @ObfuscatedName("js.j")
    public int field3553 = 1;

    @ObfuscatedName("js.p")
    public int[] field3542;

    @ObfuscatedName("js.e")
    public int[] field3559;

    @ObfuscatedName("js.s")
    public int field3544 = -1;

    @ObfuscatedName("js.v")
    public int field3545 = -1;

    @ObfuscatedName("js.k")
    public int field3546 = -1;

    @ObfuscatedName("js.o")
    public int field3547 = -1;

    @ObfuscatedName("js.q")
    public int field3548 = -1;

    @ObfuscatedName("js.l")
    public int field3549 = -1;

    @ObfuscatedName("js.f")
    public int field3550 = -1;

    @ObfuscatedName("js.z")
    public short[] field3561;

    @ObfuscatedName("js.a")
    public short[] field3535;

    @ObfuscatedName("js.x")
    public short[] field3568;

    @ObfuscatedName("js.b")
    public short[] field3554;

    @ObfuscatedName("js.w")
    public String[] field3555 = new String[5];

    @ObfuscatedName("js.g")
    public boolean field3556 = true;

    @ObfuscatedName("js.d")
    public int field3557 = -1;

    @ObfuscatedName("js.m")
    public int field3552 = 128;

    @ObfuscatedName("js.t")
    public int field3541 = 128;

    @ObfuscatedName("js.h")
    public boolean field3560 = false;

    @ObfuscatedName("js.an")
    public int field3570 = 0;

    @ObfuscatedName("js.al")
    public int field3562 = 0;

    @ObfuscatedName("js.ah")
    public int field3563 = -1;

    @ObfuscatedName("js.ad")
    public int field3564 = 32;

    @ObfuscatedName("js.aa")
    public int[] field3565;

    @ObfuscatedName("js.ag")
    public int field3566 = -1;

    @ObfuscatedName("js.av")
    public int field3567 = -1;

    @ObfuscatedName("js.am")
    public boolean field3558 = true;

    @ObfuscatedName("js.ap")
    public boolean field3569 = true;

    @ObfuscatedName("js.au")
    public boolean field3551 = false;

    @ObfuscatedName("js.ae")
    public class200 field3571;

    @ObfuscatedName("js.c(B)V")
    public void method4801() {
    }

    @ObfuscatedName("js.n(Lge;I)V")
    public void method4802(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4834(arg0, var2);
        }
    }

    @ObfuscatedName("js.u(Lge;II)V")
    public void method4834(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3299();
            this.field3542 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3542[var4] = arg0.method3280();
            }
        } else if (arg1 == 2) {
            this.field3540 = arg0.method3277();
        } else if (arg1 == 12) {
            this.field3553 = arg0.method3299();
        } else if (arg1 == 13) {
            this.field3544 = arg0.method3280();
        } else if (arg1 == 14) {
            this.field3547 = arg0.method3280();
        } else if (arg1 == 15) {
            this.field3545 = arg0.method3280();
        } else if (arg1 == 16) {
            this.field3546 = arg0.method3280();
        } else if (arg1 == 17) {
            this.field3547 = arg0.method3280();
            this.field3548 = arg0.method3280();
            this.field3549 = arg0.method3280();
            this.field3550 = arg0.method3280();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3555[arg1 - 30] = arg0.method3277();
            if (this.field3555[arg1 - 30].equalsIgnoreCase(class240.field2835)) {
                this.field3555[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3299();
            this.field3561 = new short[var5];
            this.field3535 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3561[var6] = (short) arg0.method3280();
                this.field3535[var6] = (short) arg0.method3280();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3299();
            this.field3568 = new short[var7];
            this.field3554 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3568[var8] = (short) arg0.method3280();
                this.field3554[var8] = (short) arg0.method3280();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3299();
            this.field3559 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3559[var10] = arg0.method3280();
            }
        } else if (arg1 == 93) {
            this.field3556 = false;
        } else if (arg1 == 95) {
            this.field3557 = arg0.method3280();
        } else if (arg1 == 97) {
            this.field3552 = arg0.method3280();
        } else if (arg1 == 98) {
            this.field3541 = arg0.method3280();
        } else if (arg1 == 99) {
            this.field3560 = true;
        } else if (arg1 == 100) {
            this.field3570 = arg0.method3319();
        } else if (arg1 == 101) {
            this.field3562 = arg0.method3319() * 5;
        } else if (arg1 == 102) {
            this.field3563 = arg0.method3280();
        } else if (arg1 == 103) {
            this.field3564 = arg0.method3280();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3566 = arg0.method3280();
            if (this.field3566 == 65535) {
                this.field3566 = -1;
            }
            this.field3567 = arg0.method3280();
            if (this.field3567 == 65535) {
                this.field3567 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3280();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3299();
            this.field3565 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3565[var13] = arg0.method3280();
                if (this.field3565[var13] == 65535) {
                    this.field3565[var13] = -1;
                }
            }
            this.field3565[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3558 = false;
        } else if (arg1 == 109) {
            this.field3569 = false;
        } else if (arg1 == 111) {
            this.field3551 = true;
        } else if (arg1 == 249) {
            this.field3571 = class265.method4229(arg0, this.field3571);
        }
    }

    @ObfuscatedName("js.i(Ljo;ILjo;II)Lde;")
    public final class122 method4803(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field3565 != null) {
            class274 var5 = this.method4815();
            return var5 == null ? null : var5.method4803(arg0, arg1, arg2, arg3);
        }
        class122 var6 = (class122) field3538.method3685((long) this.field3539);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3542.length; var8++) {
                if (!Statics.field3536.method4323(this.field3542[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class116[] var9 = new class116[this.field3542.length];
            for (int var10 = 0; var10 < this.field3542.length; var10++) {
                var9[var10] = class116.method2378(Statics.field3536, this.field3542[var10], 0);
            }
            class116 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class116(var9, var9.length);
            }
            if (this.field3561 != null) {
                for (int var12 = 0; var12 < this.field3561.length; var12++) {
                    var11.method2386(this.field3561[var12], this.field3535[var12]);
                }
            }
            if (this.field3568 != null) {
                for (int var13 = 0; var13 < this.field3568.length; var13++) {
                    var11.method2392(this.field3568[var13], this.field3554[var13]);
                }
            }
            var6 = var11.method2399(this.field3570 + 64, this.field3562 + 850, -30, -50, -30);
            field3538.method3687(var6, (long) this.field3539);
        }
        class122 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4866(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4890(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2469(true);
        } else {
            var14 = arg2.method4890(var6, arg3);
        }
        if (this.field3552 != 128 || this.field3541 != 128) {
            var14.method2485(this.field3552, this.field3541, this.field3552);
        }
        return var14;
    }

    @ObfuscatedName("js.p(I)Ldz;")
    public final class116 method4804() {
        if (this.field3565 != null) {
            class274 var1 = this.method4815();
            return var1 == null ? null : var1.method4804();
        } else if (this.field3559 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3559.length; var3++) {
                if (!Statics.field3536.method4323(this.field3559[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class116[] var4 = new class116[this.field3559.length];
            for (int var5 = 0; var5 < this.field3559.length; var5++) {
                var4[var5] = class116.method2378(Statics.field3536, this.field3559[var5], 0);
            }
            class116 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class116(var4, var4.length);
            }
            if (this.field3561 != null) {
                for (int var7 = 0; var7 < this.field3561.length; var7++) {
                    var6.method2386(this.field3561[var7], this.field3535[var7]);
                }
            }
            if (this.field3568 != null) {
                for (int var8 = 0; var8 < this.field3568.length; var8++) {
                    var6.method2392(this.field3568[var8], this.field3554[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("js.e(I)Ljs;")
    public final class274 method4815() {
        int var1 = -1;
        if (this.field3566 != -1) {
            var1 = class228.method3085(this.field3566);
        } else if (this.field3567 != -1) {
            var1 = class228.field2601[this.field3567];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3565.length - 1) {
            var2 = this.field3565[var1];
        } else {
            var2 = this.field3565[this.field3565.length - 1];
        }
        return var2 == -1 ? null : Statics.method4448(var2);
    }

    @ObfuscatedName("js.s(I)Z")
    public boolean method4814() {
        if (this.field3565 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3566 != -1) {
            var1 = class228.method3085(this.field3566);
        } else if (this.field3567 != -1) {
            var1 = class228.field2601[this.field3567];
        }
        if (var1 >= 0 && var1 < this.field3565.length) {
            return this.field3565[var1] != -1;
        } else {
            return this.field3565[this.field3565.length - 1] != -1;
        }
    }

    @ObfuscatedName("js.v(III)I")
    public int method4807(int arg0, int arg1) {
        return class265.method4405(this.field3571, arg0, arg1);
    }

    @ObfuscatedName("js.k(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4822(int arg0, String arg1) {
        return class265.method966(this.field3571, arg0, arg1);
    }
}
