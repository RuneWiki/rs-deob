package deob;

@ObfuscatedName("jg")
public class class274 extends class209 {

    @ObfuscatedName("jg.m")
    public static class203 field3534 = new class203(64);

    @ObfuscatedName("jg.j")
    public static class203 field3541 = new class203(50);

    @ObfuscatedName("jg.g")
    public int field3536;

    @ObfuscatedName("jg.i")
    public String field3538 = class240.field3056;

    @ObfuscatedName("jg.h")
    public int field3539 = 1;

    @ObfuscatedName("jg.l")
    public int[] field3535;

    @ObfuscatedName("jg.d")
    public int[] field3540;

    @ObfuscatedName("jg.o")
    public int field3562 = -1;

    @ObfuscatedName("jg.s")
    public int field3559 = -1;

    @ObfuscatedName("jg.k")
    public int field3565 = -1;

    @ObfuscatedName("jg.v")
    public int field3544 = -1;

    @ObfuscatedName("jg.p")
    public int field3545 = -1;

    @ObfuscatedName("jg.n")
    public int field3546 = -1;

    @ObfuscatedName("jg.t")
    public int field3543 = -1;

    @ObfuscatedName("jg.r")
    public short[] field3548;

    @ObfuscatedName("jg.x")
    public short[] field3549;

    @ObfuscatedName("jg.b")
    public short[] field3550;

    @ObfuscatedName("jg.w")
    public short[] field3551;

    @ObfuscatedName("jg.e")
    public String[] field3558 = new String[5];

    @ObfuscatedName("jg.a")
    public boolean field3553 = true;

    @ObfuscatedName("jg.z")
    public int field3554 = -1;

    @ObfuscatedName("jg.y")
    public int field3555 = 128;

    @ObfuscatedName("jg.u")
    public int field3556 = 128;

    @ObfuscatedName("jg.f")
    public boolean field3557 = false;

    @ObfuscatedName("jg.at")
    public int field3542 = 0;

    @ObfuscatedName("jg.ay")
    public int field3552 = 0;

    @ObfuscatedName("jg.ak")
    public int field3560 = -1;

    @ObfuscatedName("jg.az")
    public int field3561 = 32;

    @ObfuscatedName("jg.aj")
    public int[] field3532;

    @ObfuscatedName("jg.af")
    public int field3547 = -1;

    @ObfuscatedName("jg.ah")
    public int field3564 = -1;

    @ObfuscatedName("jg.ab")
    public boolean field3537 = true;

    @ObfuscatedName("jg.aa")
    public boolean field3566 = true;

    @ObfuscatedName("jg.ac")
    public boolean field3567 = false;

    @ObfuscatedName("jg.ad")
    public class200 field3568;

    @ObfuscatedName("hv.c(Lih;Lih;B)V")
    public static void method4106(class250 arg0, class250 arg1) {
        Statics.field3563 = arg0;
        Statics.field3533 = arg1;
    }

    @ObfuscatedName("cy.q(II)Ljg;")
    public static class274 method1993(int arg0) {
        class274 var1 = (class274) field3534.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3563.method4210(9, arg0);
        class274 var3 = new class274();
        var3.field3536 = arg0;
        if (var2 != null) {
            var3.method4820(new class185(var2));
        }
        var3.method4798();
        field3534.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.m(B)V")
    public void method4798() {
    }

    @ObfuscatedName("jg.j(Lgg;I)V")
    public void method4820(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4800(arg0, var2);
        }
    }

    @ObfuscatedName("jg.g(Lgg;IS)V")
    public void method4800(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3243();
            this.field3535 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3535[var4] = arg0.method3245();
            }
        } else if (arg1 == 2) {
            this.field3538 = arg0.method3251();
        } else if (arg1 == 12) {
            this.field3539 = arg0.method3243();
        } else if (arg1 == 13) {
            this.field3562 = arg0.method3245();
        } else if (arg1 == 14) {
            this.field3544 = arg0.method3245();
        } else if (arg1 == 15) {
            this.field3559 = arg0.method3245();
        } else if (arg1 == 16) {
            this.field3565 = arg0.method3245();
        } else if (arg1 == 17) {
            this.field3544 = arg0.method3245();
            this.field3545 = arg0.method3245();
            this.field3546 = arg0.method3245();
            this.field3543 = arg0.method3245();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3558[arg1 - 30] = arg0.method3251();
            if (this.field3558[arg1 - 30].equalsIgnoreCase(class240.field2826)) {
                this.field3558[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method3243();
            this.field3548 = new short[var5];
            this.field3549 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3548[var6] = (short) arg0.method3245();
                this.field3549[var6] = (short) arg0.method3245();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3243();
            this.field3550 = new short[var7];
            this.field3551 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3550[var8] = (short) arg0.method3245();
                this.field3551[var8] = (short) arg0.method3245();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method3243();
            this.field3540 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3540[var10] = arg0.method3245();
            }
        } else if (arg1 == 93) {
            this.field3553 = false;
        } else if (arg1 == 95) {
            this.field3554 = arg0.method3245();
        } else if (arg1 == 97) {
            this.field3555 = arg0.method3245();
        } else if (arg1 == 98) {
            this.field3556 = arg0.method3245();
        } else if (arg1 == 99) {
            this.field3557 = true;
        } else if (arg1 == 100) {
            this.field3542 = arg0.method3244();
        } else if (arg1 == 101) {
            this.field3552 = arg0.method3244() * 5;
        } else if (arg1 == 102) {
            this.field3560 = arg0.method3245();
        } else if (arg1 == 103) {
            this.field3561 = arg0.method3245();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3547 = arg0.method3245();
            if (this.field3547 == 65535) {
                this.field3547 = -1;
            }
            this.field3564 = arg0.method3245();
            if (this.field3564 == 65535) {
                this.field3564 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3245();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method3243();
            this.field3532 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3532[var13] = arg0.method3245();
                if (this.field3532[var13] == 65535) {
                    this.field3532[var13] = -1;
                }
            }
            this.field3532[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3537 = false;
        } else if (arg1 == 109) {
            this.field3566 = false;
        } else if (arg1 == 111) {
            this.field3567 = true;
        } else if (arg1 == 249) {
            this.field3568 = class265.method2860(arg0, this.field3568);
        }
    }

    @ObfuscatedName("jg.i(Ljk;ILjk;II)Ldx;")
    public final class122 method4801(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field3532 != null) {
            class274 var5 = this.method4818();
            return var5 == null ? null : var5.method4801(arg0, arg1, arg2, arg3);
        }
        class122 var6 = (class122) field3541.method3654((long) this.field3536);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3535.length; var8++) {
                if (!Statics.field3533.method4300(this.field3535[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class116[] var9 = new class116[this.field3535.length];
            for (int var10 = 0; var10 < this.field3535.length; var10++) {
                var9[var10] = class116.method2376(Statics.field3533, this.field3535[var10], 0);
            }
            class116 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class116(var9, var9.length);
            }
            if (this.field3548 != null) {
                for (int var12 = 0; var12 < this.field3548.length; var12++) {
                    var11.method2330(this.field3548[var12], this.field3549[var12]);
                }
            }
            if (this.field3550 != null) {
                for (int var13 = 0; var13 < this.field3550.length; var13++) {
                    var11.method2331(this.field3550[var13], this.field3551[var13]);
                }
            }
            var6 = var11.method2338(this.field3542 + 64, this.field3552 + 850, -30, -50, -30);
            field3541.method3646(var6, (long) this.field3536);
        }
        class122 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4850(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4852(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2416(true);
        } else {
            var14 = arg2.method4852(var6, arg3);
        }
        if (this.field3555 != 128 || this.field3556 != 128) {
            var14.method2483(this.field3555, this.field3556, this.field3555);
        }
        return var14;
    }

    @ObfuscatedName("jg.h(B)Ldf;")
    public final class116 method4810() {
        if (this.field3532 != null) {
            class274 var1 = this.method4818();
            return var1 == null ? null : var1.method4810();
        } else if (this.field3540 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3540.length; var3++) {
                if (!Statics.field3533.method4300(this.field3540[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class116[] var4 = new class116[this.field3540.length];
            for (int var5 = 0; var5 < this.field3540.length; var5++) {
                var4[var5] = class116.method2376(Statics.field3533, this.field3540[var5], 0);
            }
            class116 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class116(var4, var4.length);
            }
            if (this.field3548 != null) {
                for (int var7 = 0; var7 < this.field3548.length; var7++) {
                    var6.method2330(this.field3548[var7], this.field3549[var7]);
                }
            }
            if (this.field3550 != null) {
                for (int var8 = 0; var8 < this.field3550.length; var8++) {
                    var6.method2331(this.field3550[var8], this.field3551[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jg.l(I)Ljg;")
    public final class274 method4818() {
        int var1 = -1;
        if (this.field3547 != -1) {
            var1 = class228.method1611(this.field3547);
        } else if (this.field3564 != -1) {
            var1 = class228.field2596[this.field3564];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3532.length - 1) {
            var2 = this.field3532[var1];
        } else {
            var2 = this.field3532[this.field3532.length - 1];
        }
        return var2 == -1 ? null : method1993(var2);
    }

    @ObfuscatedName("jg.o(B)Z")
    public boolean method4803() {
        if (this.field3532 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3547 != -1) {
            var1 = class228.method1611(this.field3547);
        } else if (this.field3564 != -1) {
            var1 = class228.field2596[this.field3564];
        }
        if (var1 >= 0 && var1 < this.field3532.length) {
            return this.field3532[var1] != -1;
        } else {
            return this.field3532[this.field3532.length - 1] != -1;
        }
    }

    @ObfuscatedName("jg.k(IIB)I")
    public int method4804(int arg0, int arg1) {
        return class265.method2910(this.field3568, arg0, arg1);
    }

    @ObfuscatedName("jg.v(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4805(int arg0, String arg1) {
        return class265.method482(this.field3568, arg0, arg1);
    }
}
