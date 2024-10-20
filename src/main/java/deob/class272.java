package deob;

@ObfuscatedName("jn")
public class class272 extends class209 {

    @ObfuscatedName("jn.g")
    public static class203 field3486 = new class203(64);

    @ObfuscatedName("jn.a")
    public static class203 field3487 = new class203(50);

    @ObfuscatedName("jn.r")
    public static class203 field3488 = new class203(200);

    @ObfuscatedName("jn.m")
    public int field3490;

    @ObfuscatedName("jn.q")
    public int field3520;

    @ObfuscatedName("jn.x")
    public String field3492 = class240.field2850;

    @ObfuscatedName("jn.u")
    public short[] field3493;

    @ObfuscatedName("jn.o")
    public short[] field3494;

    @ObfuscatedName("jn.t")
    public short[] field3509;

    @ObfuscatedName("jn.v")
    public short[] field3496;

    @ObfuscatedName("jn.p")
    public int field3497 = 2000;

    @ObfuscatedName("jn.z")
    public int field3498 = 0;

    @ObfuscatedName("jn.j")
    public int field3499 = 0;

    @ObfuscatedName("jn.i")
    public int field3532 = 0;

    @ObfuscatedName("jn.c")
    public int field3501 = 0;

    @ObfuscatedName("jn.y")
    public int field3517 = 0;

    @ObfuscatedName("jn.av")
    public int field3503 = 0;

    @ObfuscatedName("jn.as")
    public int field3534 = 1;

    @ObfuscatedName("jn.al")
    public boolean field3527 = false;

    @ObfuscatedName("jn.ax")
    public String[] field3506 = new String[] { null, null, class240.field2913, null, null };

    @ObfuscatedName("jn.ay")
    public String[] field3507 = new String[] { null, null, null, null, class240.field2852 };

    @ObfuscatedName("jn.ag")
    public int field3508 = -2;

    @ObfuscatedName("jn.aj")
    public int field3481 = -1;

    @ObfuscatedName("jn.an")
    public int field3510 = -1;

    @ObfuscatedName("jn.ap")
    public int field3518 = 0;

    @ObfuscatedName("jn.am")
    public int field3502 = -1;

    @ObfuscatedName("jn.ae")
    public int field3513 = -1;

    @ObfuscatedName("jn.ac")
    public int field3514 = 0;

    @ObfuscatedName("jn.ah")
    public int field3515 = -1;

    @ObfuscatedName("jn.aq")
    public int field3516 = -1;

    @ObfuscatedName("jn.af")
    public int field3504 = -1;

    @ObfuscatedName("jn.ab")
    public int field3485 = -1;

    @ObfuscatedName("jn.ar")
    public int field3519 = -1;

    @ObfuscatedName("jn.ao")
    public int field3482 = -1;

    @ObfuscatedName("jn.at")
    public int[] field3521;

    @ObfuscatedName("jn.ad")
    public int[] field3522;

    @ObfuscatedName("jn.ai")
    public int field3529 = -1;

    @ObfuscatedName("jn.ak")
    public int field3524 = -1;

    @ObfuscatedName("jn.au")
    public int field3525 = 128;

    @ObfuscatedName("jn.az")
    public int field3526 = 128;

    @ObfuscatedName("jn.aw")
    public int field3512 = 128;

    @ObfuscatedName("jn.bv")
    public int field3528 = 0;

    @ObfuscatedName("jn.bh")
    public int field3536 = 0;

    @ObfuscatedName("jn.bq")
    public int field3495 = 0;

    @ObfuscatedName("jn.bm")
    public class200 field3531;

    @ObfuscatedName("jn.bw")
    public boolean field3523 = false;

    @ObfuscatedName("jn.bi")
    public int field3491 = -1;

    @ObfuscatedName("jn.bb")
    public int field3533 = -1;

    @ObfuscatedName("jn.bd")
    public int field3535 = -1;

    @ObfuscatedName("jn.bu")
    public int field3530 = -1;

    @ObfuscatedName("ee.f(II)Ljn;")
    public static class272 method2892(int arg0) {
        class272 var1 = (class272) field3486.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2454.method4267(10, arg0);
        class272 var3 = new class272();
        var3.field3490 = arg0;
        if (var2 != null) {
            var3.method4724(new class185(var2));
        }
        var3.method4773();
        if (var3.field3524 != -1) {
            var3.method4726(method2892(var3.field3524), method2892(var3.field3529));
        }
        if (var3.field3533 != -1) {
            var3.method4727(method2892(var3.field3533), method2892(var3.field3491));
        }
        if (var3.field3530 != -1) {
            var3.method4728(method2892(var3.field3530), method2892(var3.field3535));
        }
        if (!Statics.field1231 && var3.field3527) {
            var3.field3492 = class240.field2985;
            var3.field3523 = false;
            var3.field3506 = null;
            var3.field3507 = null;
            var3.field3508 = -1;
            var3.field3495 = 0;
            if (var3.field3531 != null) {
                boolean var4 = false;
                for (class207 var5 = var3.field3531.method3706(); var5 != null; var5 = var3.field3531.method3700()) {
                    class267 var6 = class267.method1645((int) var5.field2486);
                    if (var6.field3382) {
                        var5.method3812();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3531 = null;
                }
            }
        }
        field3486.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.h(I)V")
    public void method4773() {
    }

    @ObfuscatedName("jn.e(Lgx;I)V")
    public void method4724(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4725(arg0, var2);
        }
    }

    @ObfuscatedName("jn.b(Lgx;II)V")
    public void method4725(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3520 = arg0.method3325();
        } else if (arg1 == 2) {
            this.field3492 = arg0.method3435();
        } else if (arg1 == 4) {
            this.field3497 = arg0.method3325();
        } else if (arg1 == 5) {
            this.field3498 = arg0.method3325();
        } else if (arg1 == 6) {
            this.field3499 = arg0.method3325();
        } else if (arg1 == 7) {
            this.field3501 = arg0.method3325();
            if (this.field3501 > 32767) {
                this.field3501 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3517 = arg0.method3325();
            if (this.field3517 > 32767) {
                this.field3517 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3503 = 1;
        } else if (arg1 == 12) {
            this.field3534 = arg0.method3328();
        } else if (arg1 == 16) {
            this.field3527 = true;
        } else if (arg1 == 23) {
            this.field3481 = arg0.method3325();
            this.field3518 = arg0.method3323();
        } else if (arg1 == 24) {
            this.field3510 = arg0.method3325();
        } else if (arg1 == 25) {
            this.field3502 = arg0.method3325();
            this.field3514 = arg0.method3323();
        } else if (arg1 == 26) {
            this.field3513 = arg0.method3325();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3506[arg1 - 30] = arg0.method3435();
            if (this.field3506[arg1 - 30].equalsIgnoreCase(class240.field2897)) {
                this.field3506[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3507[arg1 - 35] = arg0.method3435();
        } else if (arg1 == 40) {
            int var3 = arg0.method3323();
            this.field3493 = new short[var3];
            this.field3494 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3493[var4] = (short) arg0.method3325();
                this.field3494[var4] = (short) arg0.method3325();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3323();
            this.field3509 = new short[var5];
            this.field3496 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3509[var6] = (short) arg0.method3325();
                this.field3496[var6] = (short) arg0.method3325();
            }
        } else if (arg1 == 42) {
            this.field3508 = arg0.method3324();
        } else if (arg1 == 65) {
            this.field3523 = true;
        } else if (arg1 == 78) {
            this.field3515 = arg0.method3325();
        } else if (arg1 == 79) {
            this.field3516 = arg0.method3325();
        } else if (arg1 == 90) {
            this.field3504 = arg0.method3325();
        } else if (arg1 == 91) {
            this.field3519 = arg0.method3325();
        } else if (arg1 == 92) {
            this.field3485 = arg0.method3325();
        } else if (arg1 == 93) {
            this.field3482 = arg0.method3325();
        } else if (arg1 == 95) {
            this.field3532 = arg0.method3325();
        } else if (arg1 == 97) {
            this.field3529 = arg0.method3325();
        } else if (arg1 == 98) {
            this.field3524 = arg0.method3325();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3521 == null) {
                this.field3521 = new int[10];
                this.field3522 = new int[10];
            }
            this.field3521[arg1 - 100] = arg0.method3325();
            this.field3522[arg1 - 100] = arg0.method3325();
        } else if (arg1 == 110) {
            this.field3525 = arg0.method3325();
        } else if (arg1 == 111) {
            this.field3526 = arg0.method3325();
        } else if (arg1 == 112) {
            this.field3512 = arg0.method3325();
        } else if (arg1 == 113) {
            this.field3528 = arg0.method3324();
        } else if (arg1 == 114) {
            this.field3536 = arg0.method3324() * 5;
        } else if (arg1 == 115) {
            this.field3495 = arg0.method3323();
        } else if (arg1 == 139) {
            this.field3491 = arg0.method3325();
        } else if (arg1 == 140) {
            this.field3533 = arg0.method3325();
        } else if (arg1 == 148) {
            this.field3535 = arg0.method3325();
        } else if (arg1 == 149) {
            this.field3530 = arg0.method3325();
        } else if (arg1 == 249) {
            this.field3531 = class265.method1460(arg0, this.field3531);
        }
    }

    @ObfuscatedName("jn.l(Ljn;Ljn;B)V")
    public void method4726(class272 arg0, class272 arg1) {
        this.field3520 = arg0.field3520;
        this.field3497 = arg0.field3497;
        this.field3498 = arg0.field3498;
        this.field3499 = arg0.field3499;
        this.field3532 = arg0.field3532;
        this.field3501 = arg0.field3501;
        this.field3517 = arg0.field3517;
        this.field3493 = arg0.field3493;
        this.field3494 = arg0.field3494;
        this.field3509 = arg0.field3509;
        this.field3496 = arg0.field3496;
        this.field3492 = arg1.field3492;
        this.field3527 = arg1.field3527;
        this.field3534 = arg1.field3534;
        this.field3503 = 1;
    }

    @ObfuscatedName("jn.w(Ljn;Ljn;I)V")
    public void method4727(class272 arg0, class272 arg1) {
        this.field3520 = arg0.field3520;
        this.field3497 = arg0.field3497;
        this.field3498 = arg0.field3498;
        this.field3499 = arg0.field3499;
        this.field3532 = arg0.field3532;
        this.field3501 = arg0.field3501;
        this.field3517 = arg0.field3517;
        this.field3493 = arg1.field3493;
        this.field3494 = arg1.field3494;
        this.field3509 = arg1.field3509;
        this.field3496 = arg1.field3496;
        this.field3492 = arg1.field3492;
        this.field3527 = arg1.field3527;
        this.field3503 = arg1.field3503;
        this.field3481 = arg1.field3481;
        this.field3510 = arg1.field3510;
        this.field3515 = arg1.field3515;
        this.field3502 = arg1.field3502;
        this.field3513 = arg1.field3513;
        this.field3516 = arg1.field3516;
        this.field3504 = arg1.field3504;
        this.field3485 = arg1.field3485;
        this.field3519 = arg1.field3519;
        this.field3482 = arg1.field3482;
        this.field3495 = arg1.field3495;
        this.field3506 = arg1.field3506;
        this.field3507 = new String[5];
        if (arg1.field3507 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3507[var3] = arg1.field3507[var3];
            }
        }
        this.field3507[4] = class240.field2849;
        this.field3534 = 0;
    }

    @ObfuscatedName("jn.d(Ljn;Ljn;B)V")
    public void method4728(class272 arg0, class272 arg1) {
        this.field3520 = arg0.field3520;
        this.field3497 = arg0.field3497;
        this.field3498 = arg0.field3498;
        this.field3499 = arg0.field3499;
        this.field3532 = arg0.field3532;
        this.field3501 = arg0.field3501;
        this.field3517 = arg0.field3517;
        this.field3493 = arg0.field3493;
        this.field3494 = arg0.field3494;
        this.field3509 = arg0.field3509;
        this.field3496 = arg0.field3496;
        this.field3503 = arg0.field3503;
        this.field3492 = arg1.field3492;
        this.field3534 = 0;
        this.field3527 = false;
        this.field3523 = false;
    }

    @ObfuscatedName("jn.n(II)Ldt;")
    public final class116 method4729(int arg0) {
        if (this.field3521 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3522[var3] && this.field3522[var3] != 0) {
                    var2 = this.field3521[var3];
                }
            }
            if (var2 != -1) {
                return method2892(var2).method4729(1);
            }
        }
        class116 var4 = class116.method2385(Statics.field3484, this.field3520, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3525 != 128 || this.field3526 != 128 || this.field3512 != 128) {
            var4.method2401(this.field3525, this.field3526, this.field3512);
        }
        if (this.field3493 != null) {
            for (int var5 = 0; var5 < this.field3493.length; var5++) {
                var4.method2398(this.field3493[var5], this.field3494[var5]);
            }
        }
        if (this.field3509 != null) {
            for (int var6 = 0; var6 < this.field3509.length; var6++) {
                var4.method2399(this.field3509[var6], this.field3496[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jn.s(II)Lds;")
    public final class122 method4730(int arg0) {
        if (this.field3521 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3522[var3] && this.field3522[var3] != 0) {
                    var2 = this.field3521[var3];
                }
            }
            if (var2 != -1) {
                return method2892(var2).method4730(1);
            }
        }
        class122 var4 = (class122) field3487.method3724((long) this.field3490);
        if (var4 != null) {
            return var4;
        }
        class116 var5 = class116.method2385(Statics.field3484, this.field3520, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3525 != 128 || this.field3526 != 128 || this.field3512 != 128) {
            var5.method2401(this.field3525, this.field3526, this.field3512);
        }
        if (this.field3493 != null) {
            for (int var6 = 0; var6 < this.field3493.length; var6++) {
                var5.method2398(this.field3493[var6], this.field3494[var6]);
            }
        }
        if (this.field3509 != null) {
            for (int var7 = 0; var7 < this.field3509.length; var7++) {
                var5.method2399(this.field3509[var7], this.field3496[var7]);
            }
        }
        class122 var8 = var5.method2406(this.field3528 + 64, this.field3536 + 768, -50, -10, -50);
        var8.field1642 = true;
        field3487.method3723(var8, (long) this.field3490);
        return var8;
    }

    @ObfuscatedName("jn.g(II)Ljn;")
    public class272 method4731(int arg0) {
        if (this.field3521 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3522[var3] && this.field3522[var3] != 0) {
                    var2 = this.field3521[var3];
                }
            }
            if (var2 != -1) {
                return method2892(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("l.k(IIIIIZI)Lly;")
    public static final class324 method63(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class324 var8 = (class324) field3488.method3724(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class272 var9 = method2892(arg0);
        if (arg1 > 1 && var9.field3521 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3522[var11] && var9.field3522[var11] != 0) {
                    var10 = var9.field3521[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2892(var10);
            }
        }
        class122 var12 = var9.method4730(1);
        if (var12 == null) {
            return null;
        }
        class324 var13 = null;
        if (var9.field3524 != -1) {
            var13 = method63(var9.field3529, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3533 != -1) {
            var13 = method63(var9.field3491, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3530 != -1) {
            var13 = method63(var9.field3535, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3848;
        int var15 = Statics.field3846;
        int var16 = Statics.field3847;
        int[] var17 = new int[4];
        class320.method5342(var17);
        class324 var18 = new class324(36, 32);
        class320.method5338(var18.field3873, 36, 32);
        class320.method5344();
        class125.method2601();
        class125.method2604(16, 16);
        class125.field1720 = false;
        if (var9.field3530 != -1) {
            var13.method5460(0, 0);
        }
        int var19 = var9.field3497;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class125.field1742[var9.field3498] * var19 >> 16;
        int var21 = class125.field1743[var9.field3498] * var19 >> 16;
        var12.method2534();
        var12.method2503(0, var9.field3499, var9.field3532, var9.field3498, var9.field3501, var9.field3517 + var12.field1829 / 2 + var20, var9.field3517 + var21);
        if (var9.field3533 != -1) {
            var13.method5460(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5525(1);
        }
        if (arg2 >= 2) {
            var18.method5525(16777215);
        }
        if (arg3 != 0) {
            var18.method5457(arg3);
        }
        class320.method5338(var18.field3873, 36, 32);
        if (var9.field3524 != -1) {
            var13.method5460(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3503 == 1) {
            class301 var22 = Statics.field3489;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class240.field3073 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class240.field3008 + "</col>";
            }
            var22.method5134(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3488.method3723(var18, var6);
        }
        class320.method5338(var14, var15, var16);
        class320.method5343(var17);
        class125.method2601();
        class125.field1720 = true;
        return var18;
    }

    @ObfuscatedName("jn.m(ZI)Z")
    public final boolean method4732(boolean arg0) {
        int var2 = this.field3481;
        int var3 = this.field3510;
        int var4 = this.field3515;
        if (arg0) {
            var2 = this.field3502;
            var3 = this.field3513;
            var4 = this.field3516;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3484.method4316(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3484.method4316(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3484.method4316(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jn.q(ZI)Ldt;")
    public final class116 method4778(boolean arg0) {
        int var2 = this.field3481;
        int var3 = this.field3510;
        int var4 = this.field3515;
        if (arg0) {
            var2 = this.field3502;
            var3 = this.field3513;
            var4 = this.field3516;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var5 = class116.method2385(Statics.field3484, var2, 0);
        if (var3 != -1) {
            class116 var6 = class116.method2385(Statics.field3484, var3, 0);
            if (var4 == -1) {
                class116[] var9 = new class116[] { var5, var6 };
                var5 = new class116(var9, 2);
            } else {
                class116 var7 = class116.method2385(Statics.field3484, var4, 0);
                class116[] var8 = new class116[] { var5, var6, var7 };
                var5 = new class116(var8, 3);
            }
        }
        if (!arg0 && this.field3518 != 0) {
            var5.method2443(0, this.field3518, 0);
        }
        if (arg0 && this.field3514 != 0) {
            var5.method2443(0, this.field3514, 0);
        }
        if (this.field3493 != null) {
            for (int var10 = 0; var10 < this.field3493.length; var10++) {
                var5.method2398(this.field3493[var10], this.field3494[var10]);
            }
        }
        if (this.field3509 != null) {
            for (int var11 = 0; var11 < this.field3509.length; var11++) {
                var5.method2399(this.field3509[var11], this.field3496[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jn.x(ZI)Z")
    public final boolean method4734(boolean arg0) {
        int var2 = this.field3504;
        int var3 = this.field3485;
        if (arg0) {
            var2 = this.field3519;
            var3 = this.field3482;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3484.method4316(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3484.method4316(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jn.u(ZI)Ldt;")
    public final class116 method4735(boolean arg0) {
        int var2 = this.field3504;
        int var3 = this.field3485;
        if (arg0) {
            var2 = this.field3519;
            var3 = this.field3482;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var4 = class116.method2385(Statics.field3484, var2, 0);
        if (var3 != -1) {
            class116 var5 = class116.method2385(Statics.field3484, var3, 0);
            class116[] var6 = new class116[] { var4, var5 };
            var4 = new class116(var6, 2);
        }
        if (this.field3493 != null) {
            for (int var7 = 0; var7 < this.field3493.length; var7++) {
                var4.method2398(this.field3493[var7], this.field3494[var7]);
            }
        }
        if (this.field3509 != null) {
            for (int var8 = 0; var8 < this.field3509.length; var8++) {
                var4.method2399(this.field3509[var8], this.field3496[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jn.o(III)I")
    public int method4736(int arg0, int arg1) {
        return class265.method4252(this.field3531, arg0, arg1);
    }

    @ObfuscatedName("jn.t(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4737(int arg0, String arg1) {
        return Statics.method213(this.field3531, arg0, arg1);
    }

    @ObfuscatedName("jn.v(I)I")
    public int method4742() {
        if (this.field3508 == -1 || this.field3507 == null) {
            return -1;
        } else if (this.field3508 >= 0) {
            return this.field3507[this.field3508] == null ? -1 : this.field3508;
        } else if (class240.field2852.equalsIgnoreCase(this.field3507[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ik.p(I)V")
    public static void method4246() {
        field3486.method3725();
        field3487.method3725();
        field3488.method3725();
    }

    @ObfuscatedName("ar.z(I)V")
    public static void method652() {
        field3488.method3725();
    }
}
