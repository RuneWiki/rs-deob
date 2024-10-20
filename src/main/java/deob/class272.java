package deob;

@ObfuscatedName("jw")
public class class272 extends class209 {

    @ObfuscatedName("jw.i")
    public static class203 field3508 = new class203(64);

    @ObfuscatedName("jw.p")
    public static class203 field3509 = new class203(50);

    @ObfuscatedName("jw.m")
    public static class203 field3547 = new class203(200);

    @ObfuscatedName("jw.j")
    public int field3558;

    @ObfuscatedName("jw.x")
    public int field3559;

    @ObfuscatedName("jw.v")
    public String field3516 = class240.field2863;

    @ObfuscatedName("jw.h")
    public short[] field3514;

    @ObfuscatedName("jw.f")
    public short[] field3515;

    @ObfuscatedName("jw.a")
    public short[] field3539;

    @ObfuscatedName("jw.t")
    public short[] field3517;

    @ObfuscatedName("jw.k")
    public int field3518 = 2000;

    @ObfuscatedName("jw.z")
    public int field3525 = 0;

    @ObfuscatedName("jw.s")
    public int field3520 = 0;

    @ObfuscatedName("jw.y")
    public int field3521 = 0;

    @ObfuscatedName("jw.u")
    public int field3522 = 0;

    @ObfuscatedName("jw.o")
    public int field3523 = 0;

    @ObfuscatedName("jw.af")
    public int field3524 = 0;

    @ObfuscatedName("jw.an")
    public int field3545 = 1;

    @ObfuscatedName("jw.ax")
    public boolean field3513 = false;

    @ObfuscatedName("jw.aw")
    public String[] field3527 = new String[] { null, null, class240.field2856, null, null };

    @ObfuscatedName("jw.ae")
    public String[] field3542 = new String[] { null, null, null, null, class240.field3106 };

    @ObfuscatedName("jw.az")
    public int field3529 = -2;

    @ObfuscatedName("jw.aj")
    public int field3530 = -1;

    @ObfuscatedName("jw.ag")
    public int field3531 = -1;

    @ObfuscatedName("jw.ab")
    public int field3503 = 0;

    @ObfuscatedName("jw.ar")
    public int field3533 = -1;

    @ObfuscatedName("jw.at")
    public int field3534 = -1;

    @ObfuscatedName("jw.as")
    public int field3535 = 0;

    @ObfuscatedName("jw.aa")
    public int field3536 = -1;

    @ObfuscatedName("jw.ai")
    public int field3537 = -1;

    @ObfuscatedName("jw.ad")
    public int field3557 = -1;

    @ObfuscatedName("jw.al")
    public int field3555 = -1;

    @ObfuscatedName("jw.ak")
    public int field3540 = -1;

    @ObfuscatedName("jw.ao")
    public int field3546 = -1;

    @ObfuscatedName("jw.am")
    public int[] field3554;

    @ObfuscatedName("jw.ay")
    public int[] field3543;

    @ObfuscatedName("jw.ah")
    public int field3550 = -1;

    @ObfuscatedName("jw.ap")
    public int field3553 = -1;

    @ObfuscatedName("jw.av")
    public int field3526 = 128;

    @ObfuscatedName("jw.au")
    public int field3538 = 128;

    @ObfuscatedName("jw.aq")
    public int field3548 = 128;

    @ObfuscatedName("jw.bs")
    public int field3549 = 0;

    @ObfuscatedName("jw.bz")
    public int field3532 = 0;

    @ObfuscatedName("jw.ba")
    public int field3541 = 0;

    @ObfuscatedName("jw.bi")
    public class200 field3552;

    @ObfuscatedName("jw.bp")
    public boolean field3510 = false;

    @ObfuscatedName("jw.bv")
    public int field3512 = -1;

    @ObfuscatedName("jw.bq")
    public int field3519 = -1;

    @ObfuscatedName("jw.bw")
    public int field3556 = -1;

    @ObfuscatedName("jw.bf")
    public int field3511 = -1;

    @ObfuscatedName("an.g(Liu;Liu;ZLkz;B)V")
    public static void method478(class250 arg0, class250 arg1, boolean arg2, class301 arg3) {
        Statics.field3507 = arg0;
        Statics.field33 = arg1;
        Statics.field2649 = arg2;
        Statics.field3841 = Statics.field3507.method4496(10);
        Statics.field1932 = arg3;
    }

    @ObfuscatedName("cd.r(II)Ljw;")
    public static class272 method1995(int arg0) {
        class272 var1 = (class272) field3508.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3507.method4438(10, arg0);
        class272 var3 = new class272();
        var3.field3558 = arg0;
        if (var2 != null) {
            var3.method4967(new class185(var2));
        }
        var3.method4914();
        if (var3.field3553 != -1) {
            var3.method4917(method1995(var3.field3553), method1995(var3.field3550));
        }
        if (var3.field3519 != -1) {
            var3.method4930(method1995(var3.field3519), method1995(var3.field3512));
        }
        if (var3.field3511 != -1) {
            var3.method4919(method1995(var3.field3511), method1995(var3.field3556));
        }
        if (!Statics.field2649 && var3.field3513) {
            var3.field3516 = class240.field2914;
            var3.field3510 = false;
            var3.field3527 = null;
            var3.field3542 = null;
            var3.field3529 = -1;
            var3.field3541 = 0;
            if (var3.field3552 != null) {
                boolean var4 = false;
                for (class207 var5 = var3.field3552.method3853(); var5 != null; var5 = var3.field3552.method3854()) {
                    class267 var6 = class267.method460((int) var5.field2497);
                    if (var6.field3405) {
                        var5.method3952();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3552 = null;
                }
            }
        }
        field3508.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jw.e(I)V")
    public void method4914() {
    }

    @ObfuscatedName("jw.q(Lgl;I)V")
    public void method4967(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4916(arg0, var2);
        }
    }

    @ObfuscatedName("jw.c(Lgl;II)V")
    public void method4916(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3559 = arg0.method3467();
        } else if (arg1 == 2) {
            this.field3516 = arg0.method3474();
        } else if (arg1 == 4) {
            this.field3518 = arg0.method3467();
        } else if (arg1 == 5) {
            this.field3525 = arg0.method3467();
        } else if (arg1 == 6) {
            this.field3520 = arg0.method3467();
        } else if (arg1 == 7) {
            this.field3522 = arg0.method3467();
            if (this.field3522 > 32767) {
                this.field3522 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3523 = arg0.method3467();
            if (this.field3523 > 32767) {
                this.field3523 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3524 = 1;
        } else if (arg1 == 12) {
            this.field3545 = arg0.method3588();
        } else if (arg1 == 16) {
            this.field3513 = true;
        } else if (arg1 == 23) {
            this.field3530 = arg0.method3467();
            this.field3503 = arg0.method3679();
        } else if (arg1 == 24) {
            this.field3531 = arg0.method3467();
        } else if (arg1 == 25) {
            this.field3533 = arg0.method3467();
            this.field3535 = arg0.method3679();
        } else if (arg1 == 26) {
            this.field3534 = arg0.method3467();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3527[arg1 - 30] = arg0.method3474();
            if (this.field3527[arg1 - 30].equalsIgnoreCase(class240.field2858)) {
                this.field3527[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3542[arg1 - 35] = arg0.method3474();
        } else if (arg1 == 40) {
            int var3 = arg0.method3679();
            this.field3514 = new short[var3];
            this.field3515 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3514[var4] = (short) arg0.method3467();
                this.field3515[var4] = (short) arg0.method3467();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3679();
            this.field3539 = new short[var5];
            this.field3517 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3539[var6] = (short) arg0.method3467();
                this.field3517[var6] = (short) arg0.method3467();
            }
        } else if (arg1 == 42) {
            this.field3529 = arg0.method3627();
        } else if (arg1 == 65) {
            this.field3510 = true;
        } else if (arg1 == 78) {
            this.field3536 = arg0.method3467();
        } else if (arg1 == 79) {
            this.field3537 = arg0.method3467();
        } else if (arg1 == 90) {
            this.field3557 = arg0.method3467();
        } else if (arg1 == 91) {
            this.field3540 = arg0.method3467();
        } else if (arg1 == 92) {
            this.field3555 = arg0.method3467();
        } else if (arg1 == 93) {
            this.field3546 = arg0.method3467();
        } else if (arg1 == 95) {
            this.field3521 = arg0.method3467();
        } else if (arg1 == 97) {
            this.field3550 = arg0.method3467();
        } else if (arg1 == 98) {
            this.field3553 = arg0.method3467();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3554 == null) {
                this.field3554 = new int[10];
                this.field3543 = new int[10];
            }
            this.field3554[arg1 - 100] = arg0.method3467();
            this.field3543[arg1 - 100] = arg0.method3467();
        } else if (arg1 == 110) {
            this.field3526 = arg0.method3467();
        } else if (arg1 == 111) {
            this.field3538 = arg0.method3467();
        } else if (arg1 == 112) {
            this.field3548 = arg0.method3467();
        } else if (arg1 == 113) {
            this.field3549 = arg0.method3627();
        } else if (arg1 == 114) {
            this.field3532 = arg0.method3627();
        } else if (arg1 == 115) {
            this.field3541 = arg0.method3679();
        } else if (arg1 == 139) {
            this.field3512 = arg0.method3467();
        } else if (arg1 == 140) {
            this.field3519 = arg0.method3467();
        } else if (arg1 == 148) {
            this.field3556 = arg0.method3467();
        } else if (arg1 == 149) {
            this.field3511 = arg0.method3467();
        } else if (arg1 == 249) {
            this.field3552 = Statics.method4265(arg0, this.field3552);
        }
    }

    @ObfuscatedName("jw.i(Ljw;Ljw;I)V")
    public void method4917(class272 arg0, class272 arg1) {
        this.field3559 = arg0.field3559;
        this.field3518 = arg0.field3518;
        this.field3525 = arg0.field3525;
        this.field3520 = arg0.field3520;
        this.field3521 = arg0.field3521;
        this.field3522 = arg0.field3522;
        this.field3523 = arg0.field3523;
        this.field3514 = arg0.field3514;
        this.field3515 = arg0.field3515;
        this.field3539 = arg0.field3539;
        this.field3517 = arg0.field3517;
        this.field3516 = arg1.field3516;
        this.field3513 = arg1.field3513;
        this.field3545 = arg1.field3545;
        this.field3524 = 1;
    }

    @ObfuscatedName("jw.p(Ljw;Ljw;B)V")
    public void method4930(class272 arg0, class272 arg1) {
        this.field3559 = arg0.field3559;
        this.field3518 = arg0.field3518;
        this.field3525 = arg0.field3525;
        this.field3520 = arg0.field3520;
        this.field3521 = arg0.field3521;
        this.field3522 = arg0.field3522;
        this.field3523 = arg0.field3523;
        this.field3514 = arg1.field3514;
        this.field3515 = arg1.field3515;
        this.field3539 = arg1.field3539;
        this.field3517 = arg1.field3517;
        this.field3516 = arg1.field3516;
        this.field3513 = arg1.field3513;
        this.field3524 = arg1.field3524;
        this.field3530 = arg1.field3530;
        this.field3531 = arg1.field3531;
        this.field3536 = arg1.field3536;
        this.field3533 = arg1.field3533;
        this.field3534 = arg1.field3534;
        this.field3537 = arg1.field3537;
        this.field3557 = arg1.field3557;
        this.field3555 = arg1.field3555;
        this.field3540 = arg1.field3540;
        this.field3546 = arg1.field3546;
        this.field3541 = arg1.field3541;
        this.field3527 = arg1.field3527;
        this.field3542 = new String[5];
        if (arg1.field3542 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3542[var3] = arg1.field3542[var3];
            }
        }
        this.field3542[4] = class240.field2933;
        this.field3545 = 0;
    }

    @ObfuscatedName("jw.m(Ljw;Ljw;B)V")
    public void method4919(class272 arg0, class272 arg1) {
        this.field3559 = arg0.field3559;
        this.field3518 = arg0.field3518;
        this.field3525 = arg0.field3525;
        this.field3520 = arg0.field3520;
        this.field3521 = arg0.field3521;
        this.field3522 = arg0.field3522;
        this.field3523 = arg0.field3523;
        this.field3514 = arg0.field3514;
        this.field3515 = arg0.field3515;
        this.field3539 = arg0.field3539;
        this.field3517 = arg0.field3517;
        this.field3524 = arg0.field3524;
        this.field3516 = arg1.field3516;
        this.field3545 = 0;
        this.field3513 = false;
        this.field3510 = false;
    }

    @ObfuscatedName("jw.d(IS)Ldu;")
    public final class116 method4973(int arg0) {
        if (this.field3554 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3543[var3] && this.field3543[var3] != 0) {
                    var2 = this.field3554[var3];
                }
            }
            if (var2 != -1) {
                return method1995(var2).method4973(1);
            }
        }
        class116 var4 = class116.method2641(Statics.field33, this.field3559, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3526 != 128 || this.field3538 != 128 || this.field3548 != 128) {
            var4.method2581(this.field3526, this.field3538, this.field3548);
        }
        if (this.field3514 != null) {
            for (int var5 = 0; var5 < this.field3514.length; var5++) {
                var4.method2573(this.field3514[var5], this.field3515[var5]);
            }
        }
        if (this.field3539 != null) {
            for (int var6 = 0; var6 < this.field3539.length; var6++) {
                var4.method2583(this.field3539[var6], this.field3517[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jw.j(II)Ldl;")
    public final class122 method4942(int arg0) {
        if (this.field3554 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3543[var3] && this.field3543[var3] != 0) {
                    var2 = this.field3554[var3];
                }
            }
            if (var2 != -1) {
                return method1995(var2).method4942(1);
            }
        }
        class122 var4 = (class122) field3509.method3879((long) this.field3558);
        if (var4 != null) {
            return var4;
        }
        class116 var5 = class116.method2641(Statics.field33, this.field3559, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3526 != 128 || this.field3538 != 128 || this.field3548 != 128) {
            var5.method2581(this.field3526, this.field3538, this.field3548);
        }
        if (this.field3514 != null) {
            for (int var6 = 0; var6 < this.field3514.length; var6++) {
                var5.method2573(this.field3514[var6], this.field3515[var6]);
            }
        }
        if (this.field3539 != null) {
            for (int var7 = 0; var7 < this.field3539.length; var7++) {
                var5.method2583(this.field3539[var7], this.field3517[var7]);
            }
        }
        class122 var8 = var5.method2570(this.field3549 + 64, this.field3532 * 5 + 768, -50, -10, -50);
        var8.field1665 = true;
        field3509.method3885(var8, (long) this.field3558);
        return var8;
    }

    @ObfuscatedName("jw.x(II)Ljw;")
    public class272 method4965(int arg0) {
        if (this.field3554 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3543[var3] && this.field3543[var3] != 0) {
                    var2 = this.field3554[var3];
                }
            }
            if (var2 != -1) {
                return method1995(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("aw.v(IIIIIZI)Lls;")
    public static final class324 method492(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class324 var8 = (class324) field3547.method3879(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class272 var9 = method1995(arg0);
        if (arg1 > 1 && var9.field3554 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3543[var11] && var9.field3543[var11] != 0) {
                    var10 = var9.field3554[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1995(var10);
            }
        }
        class122 var12 = var9.method4942(1);
        if (var12 == null) {
            return null;
        }
        class324 var13 = null;
        if (var9.field3553 != -1) {
            var13 = method492(var9.field3550, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3519 != -1) {
            var13 = method492(var9.field3512, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3511 != -1) {
            var13 = method492(var9.field3556, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3857;
        int var15 = Statics.field3855;
        int var16 = Statics.field3856;
        int[] var17 = new int[4];
        class320.method5646(var17);
        class324 var18 = new class324(36, 32);
        class320.method5574(var18.field3890, 36, 32);
        class320.method5579();
        class125.method2798();
        class125.method2784(16, 16);
        class125.field1732 = false;
        if (var9.field3511 != -1) {
            var13.method5689(0, 0);
        }
        int var19 = var9.field3518;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class125.field1748[var9.field3525] * var19 >> 16;
        int var21 = class125.field1755[var9.field3525] * var19 >> 16;
        var12.method2671();
        var12.method2723(0, var9.field3520, var9.field3521, var9.field3525, var9.field3522, var9.field3523 + var12.field1841 / 2 + var20, var9.field3523 + var21);
        if (var9.field3519 != -1) {
            var13.method5689(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5685(1);
        }
        if (arg2 >= 2) {
            var18.method5685(16777215);
        }
        if (arg3 != 0) {
            var18.method5686(arg3);
        }
        class320.method5574(var18.field3890, 36, 32);
        if (var9.field3553 != -1) {
            var13.method5689(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3524 == 1) {
            class301 var22 = Statics.field1932;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class240.field3130 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class240.field3021 + "</col>";
            }
            var22.method5390(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3547.method3885(var18, var6);
        }
        class320.method5574(var14, var15, var16);
        class320.method5586(var17);
        class125.method2798();
        class125.field1732 = true;
        return var18;
    }

    @ObfuscatedName("jw.h(ZI)Z")
    public final boolean method4923(boolean arg0) {
        int var2 = this.field3530;
        int var3 = this.field3531;
        int var4 = this.field3536;
        if (arg0) {
            var2 = this.field3533;
            var3 = this.field3534;
            var4 = this.field3537;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field33.method4437(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field33.method4437(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field33.method4437(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jw.f(ZB)Ldu;")
    public final class116 method4924(boolean arg0) {
        int var2 = this.field3530;
        int var3 = this.field3531;
        int var4 = this.field3536;
        if (arg0) {
            var2 = this.field3533;
            var3 = this.field3534;
            var4 = this.field3537;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var5 = class116.method2641(Statics.field33, var2, 0);
        if (var3 != -1) {
            class116 var6 = class116.method2641(Statics.field33, var3, 0);
            if (var4 == -1) {
                class116[] var9 = new class116[] { var5, var6 };
                var5 = new class116(var9, 2);
            } else {
                class116 var7 = class116.method2641(Statics.field33, var4, 0);
                class116[] var8 = new class116[] { var5, var6, var7 };
                var5 = new class116(var8, 3);
            }
        }
        if (!arg0 && this.field3503 != 0) {
            var5.method2625(0, this.field3503, 0);
        }
        if (arg0 && this.field3535 != 0) {
            var5.method2625(0, this.field3535, 0);
        }
        if (this.field3514 != null) {
            for (int var10 = 0; var10 < this.field3514.length; var10++) {
                var5.method2573(this.field3514[var10], this.field3515[var10]);
            }
        }
        if (this.field3539 != null) {
            for (int var11 = 0; var11 < this.field3539.length; var11++) {
                var5.method2583(this.field3539[var11], this.field3517[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jw.a(ZI)Z")
    public final boolean method4925(boolean arg0) {
        int var2 = this.field3557;
        int var3 = this.field3555;
        if (arg0) {
            var2 = this.field3540;
            var3 = this.field3546;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field33.method4437(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field33.method4437(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jw.t(ZS)Ldu;")
    public final class116 method4957(boolean arg0) {
        int var2 = this.field3557;
        int var3 = this.field3555;
        if (arg0) {
            var2 = this.field3540;
            var3 = this.field3546;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var4 = class116.method2641(Statics.field33, var2, 0);
        if (var3 != -1) {
            class116 var5 = class116.method2641(Statics.field33, var3, 0);
            class116[] var6 = new class116[] { var4, var5 };
            var4 = new class116(var6, 2);
        }
        if (this.field3514 != null) {
            for (int var7 = 0; var7 < this.field3514.length; var7++) {
                var4.method2573(this.field3514[var7], this.field3515[var7]);
            }
        }
        if (this.field3539 != null) {
            for (int var8 = 0; var8 < this.field3539.length; var8++) {
                var4.method2583(this.field3539[var8], this.field3517[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jw.k(III)I")
    public int method4952(int arg0, int arg1) {
        return class265.method3138(this.field3552, arg0, arg1);
    }

    @ObfuscatedName("jw.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4927(int arg0, String arg1) {
        return class265.method3140(this.field3552, arg0, arg1);
    }

    @ObfuscatedName("jw.y(I)I")
    public int method4928() {
        if (this.field3529 == -1 || this.field3542 == null) {
            return -1;
        } else if (this.field3529 >= 0) {
            return this.field3542[this.field3529] == null ? -1 : this.field3529;
        } else if (class240.field3106.equalsIgnoreCase(this.field3542[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cf.u(B)V")
    public static void method2067() {
        field3508.method3880();
        field3509.method3880();
        field3547.method3880();
    }
}
