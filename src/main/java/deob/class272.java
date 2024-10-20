package deob;

@ObfuscatedName("js")
public class class272 extends class209 {

    @ObfuscatedName("js.m")
    public static class203 field3518 = new class203(64);

    @ObfuscatedName("js.d")
    public static class203 field3498 = new class203(50);

    @ObfuscatedName("js.z")
    public static class203 field3526 = new class203(200);

    @ObfuscatedName("js.v")
    public int field3506;

    @ObfuscatedName("js.g")
    public int field3504;

    @ObfuscatedName("js.j")
    public String field3523 = class240.field2865;

    @ObfuscatedName("js.b")
    public short[] field3540;

    @ObfuscatedName("js.u")
    public short[] field3510;

    @ObfuscatedName("js.t")
    public short[] field3511;

    @ObfuscatedName("js.n")
    public short[] field3514;

    @ObfuscatedName("js.h")
    public int field3513 = 2000;

    @ObfuscatedName("js.o")
    public int field3536 = 0;

    @ObfuscatedName("js.i")
    public int field3522 = 0;

    @ObfuscatedName("js.k")
    public int field3516 = 0;

    @ObfuscatedName("js.q")
    public int field3503 = 0;

    @ObfuscatedName("js.y")
    public int field3515 = 0;

    @ObfuscatedName("js.av")
    public int field3512 = 0;

    @ObfuscatedName("js.ag")
    public int field3520 = 1;

    @ObfuscatedName("js.af")
    public boolean field3521 = false;

    @ObfuscatedName("js.az")
    public String[] field3546 = new String[] { null, null, class240.field3002, null, null };

    @ObfuscatedName("js.at")
    public String[] field3532 = new String[] { null, null, null, null, class240.field2859 };

    @ObfuscatedName("js.am")
    public int field3524 = -2;

    @ObfuscatedName("js.aw")
    public int field3525 = -1;

    @ObfuscatedName("js.aa")
    public int field3537 = -1;

    @ObfuscatedName("js.as")
    public int field3527 = 0;

    @ObfuscatedName("js.al")
    public int field3528 = -1;

    @ObfuscatedName("js.ad")
    public int field3529 = -1;

    @ObfuscatedName("js.ax")
    public int field3530 = 0;

    @ObfuscatedName("js.ao")
    public int field3531 = -1;

    @ObfuscatedName("js.ae")
    public int field3517 = -1;

    @ObfuscatedName("js.ap")
    public int field3508 = -1;

    @ObfuscatedName("js.ar")
    public int field3534 = -1;

    @ObfuscatedName("js.ab")
    public int field3535 = -1;

    @ObfuscatedName("js.aq")
    public int field3547 = -1;

    @ObfuscatedName("js.au")
    public int[] field3545;

    @ObfuscatedName("js.aj")
    public int[] field3538;

    @ObfuscatedName("js.ah")
    public int field3539 = -1;

    @ObfuscatedName("js.ai")
    public int field3533 = -1;

    @ObfuscatedName("js.an")
    public int field3541 = 128;

    @ObfuscatedName("js.ay")
    public int field3542 = 128;

    @ObfuscatedName("js.ak")
    public int field3543 = 128;

    @ObfuscatedName("js.be")
    public int field3544 = 0;

    @ObfuscatedName("js.bo")
    public int field3507 = 0;

    @ObfuscatedName("js.bx")
    public int field3519 = 0;

    @ObfuscatedName("js.bf")
    public class200 field3505;

    @ObfuscatedName("js.bl")
    public boolean field3548 = false;

    @ObfuscatedName("js.bs")
    public int field3549 = -1;

    @ObfuscatedName("js.ba")
    public int field3550 = -1;

    @ObfuscatedName("js.bm")
    public int field3551 = -1;

    @ObfuscatedName("js.bg")
    public int field3552 = -1;

    @ObfuscatedName("dw.f(Lik;Lik;ZLkn;I)V")
    public static void method2516(class250 arg0, class250 arg1, boolean arg2, class301 arg3) {
        Statics.field3501 = arg0;
        Statics.field2055 = arg1;
        Statics.field391 = arg2;
        Statics.field3502 = Statics.field3501.method4326(10);
        Statics.field64 = arg3;
    }

    @ObfuscatedName("m.l(II)Ljs;")
    public static class272 method92(int arg0) {
        class272 var1 = (class272) field3518.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3501.method4289(10, arg0);
        class272 var3 = new class272();
        var3.field3506 = arg0;
        if (var2 != null) {
            var3.method4764(new class185(var2));
        }
        var3.method4769();
        if (var3.field3533 != -1) {
            var3.method4766(method92(var3.field3533), method92(var3.field3539));
        }
        if (var3.field3550 != -1) {
            var3.method4767(method92(var3.field3550), method92(var3.field3549));
        }
        if (var3.field3552 != -1) {
            var3.method4838(method92(var3.field3552), method92(var3.field3551));
        }
        if (!Statics.field391 && var3.field3521) {
            var3.field3523 = class240.field2927;
            var3.field3548 = false;
            var3.field3546 = null;
            var3.field3532 = null;
            var3.field3524 = -1;
            var3.field3519 = 0;
            if (var3.field3505 != null) {
                boolean var4 = false;
                for (class207 var5 = var3.field3505.method3710(); var5 != null; var5 = var3.field3505.method3711()) {
                    class267 var6 = class267.method281((int) var5.field2497);
                    if (var6.field3395) {
                        var5.method3818();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3505 = null;
                }
            }
        }
        field3518.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("js.w(I)V")
    public void method4769() {
    }

    @ObfuscatedName("js.s(Lgm;B)V")
    public void method4764(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4765(arg0, var2);
        }
    }

    @ObfuscatedName("js.e(Lgm;II)V")
    public void method4765(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3504 = arg0.method3346();
        } else if (arg1 == 2) {
            this.field3523 = arg0.method3353();
        } else if (arg1 == 4) {
            this.field3513 = arg0.method3346();
        } else if (arg1 == 5) {
            this.field3536 = arg0.method3346();
        } else if (arg1 == 6) {
            this.field3522 = arg0.method3346();
        } else if (arg1 == 7) {
            this.field3503 = arg0.method3346();
            if (this.field3503 > 32767) {
                this.field3503 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3515 = arg0.method3346();
            if (this.field3515 > 32767) {
                this.field3515 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3512 = 1;
        } else if (arg1 == 12) {
            this.field3520 = arg0.method3432();
        } else if (arg1 == 16) {
            this.field3521 = true;
        } else if (arg1 == 23) {
            this.field3525 = arg0.method3346();
            this.field3527 = arg0.method3344();
        } else if (arg1 == 24) {
            this.field3537 = arg0.method3346();
        } else if (arg1 == 25) {
            this.field3528 = arg0.method3346();
            this.field3530 = arg0.method3344();
        } else if (arg1 == 26) {
            this.field3529 = arg0.method3346();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3546[arg1 - 30] = arg0.method3353();
            if (this.field3546[arg1 - 30].equalsIgnoreCase(class240.field2860)) {
                this.field3546[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3532[arg1 - 35] = arg0.method3353();
        } else if (arg1 == 40) {
            int var3 = arg0.method3344();
            this.field3540 = new short[var3];
            this.field3510 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3540[var4] = (short) arg0.method3346();
                this.field3510[var4] = (short) arg0.method3346();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3344();
            this.field3511 = new short[var5];
            this.field3514 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3511[var6] = (short) arg0.method3346();
                this.field3514[var6] = (short) arg0.method3346();
            }
        } else if (arg1 == 42) {
            this.field3524 = arg0.method3345();
        } else if (arg1 == 65) {
            this.field3548 = true;
        } else if (arg1 == 78) {
            this.field3531 = arg0.method3346();
        } else if (arg1 == 79) {
            this.field3517 = arg0.method3346();
        } else if (arg1 == 90) {
            this.field3508 = arg0.method3346();
        } else if (arg1 == 91) {
            this.field3535 = arg0.method3346();
        } else if (arg1 == 92) {
            this.field3534 = arg0.method3346();
        } else if (arg1 == 93) {
            this.field3547 = arg0.method3346();
        } else if (arg1 == 95) {
            this.field3516 = arg0.method3346();
        } else if (arg1 == 97) {
            this.field3539 = arg0.method3346();
        } else if (arg1 == 98) {
            this.field3533 = arg0.method3346();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3545 == null) {
                this.field3545 = new int[10];
                this.field3538 = new int[10];
            }
            this.field3545[arg1 - 100] = arg0.method3346();
            this.field3538[arg1 - 100] = arg0.method3346();
        } else if (arg1 == 110) {
            this.field3541 = arg0.method3346();
        } else if (arg1 == 111) {
            this.field3542 = arg0.method3346();
        } else if (arg1 == 112) {
            this.field3543 = arg0.method3346();
        } else if (arg1 == 113) {
            this.field3544 = arg0.method3345();
        } else if (arg1 == 114) {
            this.field3507 = arg0.method3345() * 5;
        } else if (arg1 == 115) {
            this.field3519 = arg0.method3344();
        } else if (arg1 == 139) {
            this.field3549 = arg0.method3346();
        } else if (arg1 == 140) {
            this.field3550 = arg0.method3346();
        } else if (arg1 == 148) {
            this.field3551 = arg0.method3346();
        } else if (arg1 == 149) {
            this.field3552 = arg0.method3346();
        } else if (arg1 == 249) {
            this.field3505 = class265.method1002(arg0, this.field3505);
        }
    }

    @ObfuscatedName("js.c(Ljs;Ljs;I)V")
    public void method4766(class272 arg0, class272 arg1) {
        this.field3504 = arg0.field3504;
        this.field3513 = arg0.field3513;
        this.field3536 = arg0.field3536;
        this.field3522 = arg0.field3522;
        this.field3516 = arg0.field3516;
        this.field3503 = arg0.field3503;
        this.field3515 = arg0.field3515;
        this.field3540 = arg0.field3540;
        this.field3510 = arg0.field3510;
        this.field3511 = arg0.field3511;
        this.field3514 = arg0.field3514;
        this.field3523 = arg1.field3523;
        this.field3521 = arg1.field3521;
        this.field3520 = arg1.field3520;
        this.field3512 = 1;
    }

    @ObfuscatedName("js.p(Ljs;Ljs;I)V")
    public void method4767(class272 arg0, class272 arg1) {
        this.field3504 = arg0.field3504;
        this.field3513 = arg0.field3513;
        this.field3536 = arg0.field3536;
        this.field3522 = arg0.field3522;
        this.field3516 = arg0.field3516;
        this.field3503 = arg0.field3503;
        this.field3515 = arg0.field3515;
        this.field3540 = arg1.field3540;
        this.field3510 = arg1.field3510;
        this.field3511 = arg1.field3511;
        this.field3514 = arg1.field3514;
        this.field3523 = arg1.field3523;
        this.field3521 = arg1.field3521;
        this.field3512 = arg1.field3512;
        this.field3525 = arg1.field3525;
        this.field3537 = arg1.field3537;
        this.field3531 = arg1.field3531;
        this.field3528 = arg1.field3528;
        this.field3529 = arg1.field3529;
        this.field3517 = arg1.field3517;
        this.field3508 = arg1.field3508;
        this.field3534 = arg1.field3534;
        this.field3535 = arg1.field3535;
        this.field3547 = arg1.field3547;
        this.field3519 = arg1.field3519;
        this.field3546 = arg1.field3546;
        this.field3532 = new String[5];
        if (arg1.field3532 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3532[var3] = arg1.field3532[var3];
            }
        }
        this.field3532[4] = class240.field2864;
        this.field3520 = 0;
    }

    @ObfuscatedName("js.r(Ljs;Ljs;I)V")
    public void method4838(class272 arg0, class272 arg1) {
        this.field3504 = arg0.field3504;
        this.field3513 = arg0.field3513;
        this.field3536 = arg0.field3536;
        this.field3522 = arg0.field3522;
        this.field3516 = arg0.field3516;
        this.field3503 = arg0.field3503;
        this.field3515 = arg0.field3515;
        this.field3540 = arg0.field3540;
        this.field3510 = arg0.field3510;
        this.field3511 = arg0.field3511;
        this.field3514 = arg0.field3514;
        this.field3512 = arg0.field3512;
        this.field3523 = arg1.field3523;
        this.field3520 = 0;
        this.field3521 = false;
        this.field3548 = false;
    }

    @ObfuscatedName("js.m(II)Ldb;")
    public final class116 method4835(int arg0) {
        if (this.field3545 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3538[var3] && this.field3538[var3] != 0) {
                    var2 = this.field3545[var3];
                }
            }
            if (var2 != -1) {
                return method92(var2).method4835(1);
            }
        }
        class116 var4 = class116.method2435(Statics.field2055, this.field3504, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3541 != 128 || this.field3542 != 128 || this.field3543 != 128) {
            var4.method2450(this.field3541, this.field3542, this.field3543);
        }
        if (this.field3540 != null) {
            for (int var5 = 0; var5 < this.field3540.length; var5++) {
                var4.method2447(this.field3540[var5], this.field3510[var5]);
            }
        }
        if (this.field3511 != null) {
            for (int var6 = 0; var6 < this.field3511.length; var6++) {
                var4.method2448(this.field3511[var6], this.field3514[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("js.d(IS)Lds;")
    public final class122 method4770(int arg0) {
        if (this.field3545 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3538[var3] && this.field3538[var3] != 0) {
                    var2 = this.field3545[var3];
                }
            }
            if (var2 != -1) {
                return method92(var2).method4770(1);
            }
        }
        class122 var4 = (class122) field3498.method3737((long) this.field3506);
        if (var4 != null) {
            return var4;
        }
        class116 var5 = class116.method2435(Statics.field2055, this.field3504, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3541 != 128 || this.field3542 != 128 || this.field3543 != 128) {
            var5.method2450(this.field3541, this.field3542, this.field3543);
        }
        if (this.field3540 != null) {
            for (int var6 = 0; var6 < this.field3540.length; var6++) {
                var5.method2447(this.field3540[var6], this.field3510[var6]);
            }
        }
        if (this.field3511 != null) {
            for (int var7 = 0; var7 < this.field3511.length; var7++) {
                var5.method2448(this.field3511[var7], this.field3514[var7]);
            }
        }
        class122 var8 = var5.method2468(this.field3544 + 64, this.field3507 + 768, -50, -10, -50);
        var8.field1663 = true;
        field3498.method3744(var8, (long) this.field3506);
        return var8;
    }

    @ObfuscatedName("js.z(II)Ljs;")
    public class272 method4771(int arg0) {
        if (this.field3545 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3538[var3] && this.field3538[var3] != 0) {
                    var2 = this.field3545[var3];
                }
            }
            if (var2 != -1) {
                return method92(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ey.x(IIIIIZI)Llp;")
    public static final class324 method2912(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class324 var8 = (class324) field3526.method3737(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class272 var9 = method92(arg0);
        if (arg1 > 1 && var9.field3545 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3538[var11] && var9.field3538[var11] != 0) {
                    var10 = var9.field3545[var11];
                }
            }
            if (var10 != -1) {
                var9 = method92(var10);
            }
        }
        class122 var12 = var9.method4770(1);
        if (var12 == null) {
            return null;
        }
        class324 var13 = null;
        if (var9.field3533 != -1) {
            var13 = method2912(var9.field3539, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3550 != -1) {
            var13 = method2912(var9.field3549, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3552 != -1) {
            var13 = method2912(var9.field3551, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3850;
        int var15 = Statics.field3848;
        int var16 = Statics.field3849;
        int[] var17 = new int[4];
        class320.method5505(var17);
        class324 var18 = new class324(36, 32);
        class320.method5452(var18.field3873, 36, 32);
        class320.method5453();
        class125.method2640();
        class125.method2643(16, 16);
        class125.field1727 = false;
        if (var9.field3552 != -1) {
            var13.method5567(0, 0);
        }
        int var19 = var9.field3513;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class125.field1749[var9.field3536] * var19 >> 16;
        int var21 = class125.field1743[var9.field3536] * var19 >> 16;
        var12.method2535();
        var12.method2548(0, var9.field3522, var9.field3516, var9.field3536, var9.field3503, var9.field3515 + var12.field1841 / 2 + var20, var9.field3515 + var21);
        if (var9.field3550 != -1) {
            var13.method5567(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5563(1);
        }
        if (arg2 >= 2) {
            var18.method5563(16777215);
        }
        if (arg3 != 0) {
            var18.method5636(arg3);
        }
        class320.method5452(var18.field3873, 36, 32);
        if (var9.field3533 != -1) {
            var13.method5567(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3512 == 1) {
            Statics.field64.method5225(method473(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3526.method3744(var18, var6);
        }
        class320.method5452(var14, var15, var16);
        class320.method5457(var17);
        class125.method2640();
        class125.field1727 = true;
        return var18;
    }

    @ObfuscatedName("at.v(IB)Ljava/lang/String;")
    public static final String method473(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class240.field3006 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class240.field3052 + "</col>";
        }
    }

    @ObfuscatedName("js.g(ZB)Z")
    public final boolean method4772(boolean arg0) {
        int var2 = this.field3525;
        int var3 = this.field3537;
        int var4 = this.field3531;
        if (arg0) {
            var2 = this.field3528;
            var3 = this.field3529;
            var4 = this.field3517;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2055.method4359(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2055.method4359(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2055.method4359(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("js.u(ZI)Ldb;")
    public final class116 method4773(boolean arg0) {
        int var2 = this.field3525;
        int var3 = this.field3537;
        int var4 = this.field3531;
        if (arg0) {
            var2 = this.field3528;
            var3 = this.field3529;
            var4 = this.field3517;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var5 = class116.method2435(Statics.field2055, var2, 0);
        if (var3 != -1) {
            class116 var6 = class116.method2435(Statics.field2055, var3, 0);
            if (var4 == -1) {
                class116[] var9 = new class116[] { var5, var6 };
                var5 = new class116(var9, 2);
            } else {
                class116 var7 = class116.method2435(Statics.field2055, var4, 0);
                class116[] var8 = new class116[] { var5, var6, var7 };
                var5 = new class116(var8, 3);
            }
        }
        if (!arg0 && this.field3527 != 0) {
            var5.method2446(0, this.field3527, 0);
        }
        if (arg0 && this.field3530 != 0) {
            var5.method2446(0, this.field3530, 0);
        }
        if (this.field3540 != null) {
            for (int var10 = 0; var10 < this.field3540.length; var10++) {
                var5.method2447(this.field3540[var10], this.field3510[var10]);
            }
        }
        if (this.field3511 != null) {
            for (int var11 = 0; var11 < this.field3511.length; var11++) {
                var5.method2448(this.field3511[var11], this.field3514[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("js.o(ZI)Z")
    public final boolean method4763(boolean arg0) {
        int var2 = this.field3508;
        int var3 = this.field3534;
        if (arg0) {
            var2 = this.field3535;
            var3 = this.field3547;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2055.method4359(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2055.method4359(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("js.i(ZI)Ldb;")
    public final class116 method4775(boolean arg0) {
        int var2 = this.field3508;
        int var3 = this.field3534;
        if (arg0) {
            var2 = this.field3535;
            var3 = this.field3547;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var4 = class116.method2435(Statics.field2055, var2, 0);
        if (var3 != -1) {
            class116 var5 = class116.method2435(Statics.field2055, var3, 0);
            class116[] var6 = new class116[] { var4, var5 };
            var4 = new class116(var6, 2);
        }
        if (this.field3540 != null) {
            for (int var7 = 0; var7 < this.field3540.length; var7++) {
                var4.method2447(this.field3540[var7], this.field3510[var7]);
            }
        }
        if (this.field3511 != null) {
            for (int var8 = 0; var8 < this.field3511.length; var8++) {
                var4.method2448(this.field3511[var8], this.field3514[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("js.k(III)I")
    public int method4776(int arg0, int arg1) {
        return class265.method944(this.field3505, arg0, arg1);
    }

    @ObfuscatedName("js.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4777(int arg0, String arg1) {
        class200 var3 = this.field3505;
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

    @ObfuscatedName("js.y(I)I")
    public int method4782() {
        if (this.field3524 == -1 || this.field3532 == null) {
            return -1;
        } else if (this.field3524 >= 0) {
            return this.field3532[this.field3524] == null ? -1 : this.field3524;
        } else if (class240.field2859.equalsIgnoreCase(this.field3532[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("el.av(I)V")
    public static void method2920() {
        field3526.method3740();
    }

    @ObfuscatedName("es.ag(ZI)V")
    public static void method2939(boolean arg0) {
        if (Statics.field391 != arg0) {
            field3518.method3740();
            field3498.method3740();
            field3526.method3740();
            Statics.field391 = arg0;
        }
    }
}
