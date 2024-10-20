package deob;

@ObfuscatedName("jz")
public class class272 extends class209 {

    @ObfuscatedName("jz.o")
    public static class203 field3475 = new class203(64);

    @ObfuscatedName("jz.s")
    public static class203 field3476 = new class203(50);

    @ObfuscatedName("jz.k")
    public static class203 field3522 = new class203(200);

    @ObfuscatedName("jz.p")
    public int field3478;

    @ObfuscatedName("jz.n")
    public int field3510;

    @ObfuscatedName("jz.t")
    public String field3480 = class240.field3056;

    @ObfuscatedName("jz.r")
    public short[] field3468;

    @ObfuscatedName("jz.x")
    public short[] field3482;

    @ObfuscatedName("jz.b")
    public short[] field3473;

    @ObfuscatedName("jz.w")
    public short[] field3484;

    @ObfuscatedName("jz.e")
    public int field3485 = 2000;

    @ObfuscatedName("jz.a")
    public int field3495 = 0;

    @ObfuscatedName("jz.z")
    public int field3488 = 0;

    @ObfuscatedName("jz.y")
    public int field3472 = 0;

    @ObfuscatedName("jz.u")
    public int field3477 = 0;

    @ObfuscatedName("jz.f")
    public int field3490 = 0;

    @ObfuscatedName("jz.at")
    public int field3512 = 0;

    @ObfuscatedName("jz.ay")
    public int field3483 = 1;

    @ObfuscatedName("jz.ak")
    public boolean field3493 = false;

    @ObfuscatedName("jz.az")
    public String[] field3520 = new String[] { null, null, class240.field2824, null, null };

    @ObfuscatedName("jz.aj")
    public String[] field3503 = new String[] { null, null, null, null, class240.field2825 };

    @ObfuscatedName("jz.ah")
    public int field3481 = -2;

    @ObfuscatedName("jz.ab")
    public int field3479 = -1;

    @ObfuscatedName("jz.aa")
    public int field3498 = -1;

    @ObfuscatedName("jz.ac")
    public int field3497 = 0;

    @ObfuscatedName("jz.ad")
    public int field3486 = -1;

    @ObfuscatedName("jz.aq")
    public int field3501 = -1;

    @ObfuscatedName("jz.ax")
    public int field3502 = 0;

    @ObfuscatedName("jz.an")
    public int field3514 = -1;

    @ObfuscatedName("jz.ag")
    public int field3492 = -1;

    @ObfuscatedName("jz.ap")
    public int field3505 = -1;

    @ObfuscatedName("jz.aw")
    public int field3506 = -1;

    @ObfuscatedName("jz.al")
    public int field3513 = -1;

    @ObfuscatedName("jz.ar")
    public int field3508 = -1;

    @ObfuscatedName("jz.au")
    public int[] field3509;

    @ObfuscatedName("jz.av")
    public int[] field3494;

    @ObfuscatedName("jz.am")
    public int field3511 = -1;

    @ObfuscatedName("jz.ao")
    public int field3500 = -1;

    @ObfuscatedName("jz.ai")
    public int field3471 = 128;

    @ObfuscatedName("jz.ae")
    public int field3487 = 128;

    @ObfuscatedName("jz.as")
    public int field3515 = 128;

    @ObfuscatedName("jz.bw")
    public int field3516 = 0;

    @ObfuscatedName("jz.bg")
    public int field3517 = 0;

    @ObfuscatedName("jz.bu")
    public int field3518 = 0;

    @ObfuscatedName("jz.bs")
    public class200 field3519;

    @ObfuscatedName("jz.ba")
    public boolean field3507 = false;

    @ObfuscatedName("jz.bt")
    public int field3521 = -1;

    @ObfuscatedName("jz.br")
    public int field3491 = -1;

    @ObfuscatedName("jz.bq")
    public int field3523 = -1;

    @ObfuscatedName("jz.bp")
    public int field3524 = -1;

    @ObfuscatedName("cn.c(II)Ljz;")
    public static class272 method1730(int arg0) {
        class272 var1 = (class272) field3475.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3496.method4210(10, arg0);
        class272 var3 = new class272();
        var3.field3478 = arg0;
        if (var2 != null) {
            var3.method4728(new class185(var2));
        }
        var3.method4727();
        if (var3.field3500 != -1) {
            var3.method4779(method1730(var3.field3500), method1730(var3.field3511));
        }
        if (var3.field3491 != -1) {
            var3.method4731(method1730(var3.field3491), method1730(var3.field3521));
        }
        if (var3.field3524 != -1) {
            var3.method4748(method1730(var3.field3524), method1730(var3.field3523));
        }
        if (!Statics.field3474 && var3.field3493) {
            var3.field3480 = class240.field2990;
            var3.field3507 = false;
            var3.field3520 = null;
            var3.field3503 = null;
            var3.field3481 = -1;
            var3.field3518 = 0;
            if (var3.field3519 != null) {
                boolean var4 = false;
                for (class207 var5 = var3.field3519.method3621(); var5 != null; var5 = var3.field3519.method3622()) {
                    class267 var6 = class267.method1682((int) var5.field2466);
                    if (var6.field3371) {
                        var5.method3733();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3519 = null;
                }
            }
        }
        field3475.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.q(S)V")
    public void method4727() {
    }

    @ObfuscatedName("jz.m(Lgg;I)V")
    public void method4728(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4735(arg0, var2);
        }
    }

    @ObfuscatedName("jz.j(Lgg;II)V")
    public void method4735(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3510 = arg0.method3245();
        } else if (arg1 == 2) {
            this.field3480 = arg0.method3251();
        } else if (arg1 == 4) {
            this.field3485 = arg0.method3245();
        } else if (arg1 == 5) {
            this.field3495 = arg0.method3245();
        } else if (arg1 == 6) {
            this.field3488 = arg0.method3245();
        } else if (arg1 == 7) {
            this.field3477 = arg0.method3245();
            if (this.field3477 > 32767) {
                this.field3477 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3490 = arg0.method3245();
            if (this.field3490 > 32767) {
                this.field3490 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3512 = 1;
        } else if (arg1 == 12) {
            this.field3483 = arg0.method3323();
        } else if (arg1 == 16) {
            this.field3493 = true;
        } else if (arg1 == 23) {
            this.field3479 = arg0.method3245();
            this.field3497 = arg0.method3243();
        } else if (arg1 == 24) {
            this.field3498 = arg0.method3245();
        } else if (arg1 == 25) {
            this.field3486 = arg0.method3245();
            this.field3502 = arg0.method3243();
        } else if (arg1 == 26) {
            this.field3501 = arg0.method3245();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3520[arg1 - 30] = arg0.method3251();
            if (this.field3520[arg1 - 30].equalsIgnoreCase(class240.field2826)) {
                this.field3520[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3503[arg1 - 35] = arg0.method3251();
        } else if (arg1 == 40) {
            int var3 = arg0.method3243();
            this.field3468 = new short[var3];
            this.field3482 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3468[var4] = (short) arg0.method3245();
                this.field3482[var4] = (short) arg0.method3245();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3243();
            this.field3473 = new short[var5];
            this.field3484 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3473[var6] = (short) arg0.method3245();
                this.field3484[var6] = (short) arg0.method3245();
            }
        } else if (arg1 == 42) {
            this.field3481 = arg0.method3244();
        } else if (arg1 == 65) {
            this.field3507 = true;
        } else if (arg1 == 78) {
            this.field3514 = arg0.method3245();
        } else if (arg1 == 79) {
            this.field3492 = arg0.method3245();
        } else if (arg1 == 90) {
            this.field3505 = arg0.method3245();
        } else if (arg1 == 91) {
            this.field3513 = arg0.method3245();
        } else if (arg1 == 92) {
            this.field3506 = arg0.method3245();
        } else if (arg1 == 93) {
            this.field3508 = arg0.method3245();
        } else if (arg1 == 95) {
            this.field3472 = arg0.method3245();
        } else if (arg1 == 97) {
            this.field3511 = arg0.method3245();
        } else if (arg1 == 98) {
            this.field3500 = arg0.method3245();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3509 == null) {
                this.field3509 = new int[10];
                this.field3494 = new int[10];
            }
            this.field3509[arg1 - 100] = arg0.method3245();
            this.field3494[arg1 - 100] = arg0.method3245();
        } else if (arg1 == 110) {
            this.field3471 = arg0.method3245();
        } else if (arg1 == 111) {
            this.field3487 = arg0.method3245();
        } else if (arg1 == 112) {
            this.field3515 = arg0.method3245();
        } else if (arg1 == 113) {
            this.field3516 = arg0.method3244();
        } else if (arg1 == 114) {
            this.field3517 = arg0.method3244();
        } else if (arg1 == 115) {
            this.field3518 = arg0.method3243();
        } else if (arg1 == 139) {
            this.field3521 = arg0.method3245();
        } else if (arg1 == 140) {
            this.field3491 = arg0.method3245();
        } else if (arg1 == 148) {
            this.field3523 = arg0.method3245();
        } else if (arg1 == 149) {
            this.field3524 = arg0.method3245();
        } else if (arg1 == 249) {
            this.field3519 = class265.method2860(arg0, this.field3519);
        }
    }

    @ObfuscatedName("jz.g(Ljz;Ljz;I)V")
    public void method4779(class272 arg0, class272 arg1) {
        this.field3510 = arg0.field3510;
        this.field3485 = arg0.field3485;
        this.field3495 = arg0.field3495;
        this.field3488 = arg0.field3488;
        this.field3472 = arg0.field3472;
        this.field3477 = arg0.field3477;
        this.field3490 = arg0.field3490;
        this.field3468 = arg0.field3468;
        this.field3482 = arg0.field3482;
        this.field3473 = arg0.field3473;
        this.field3484 = arg0.field3484;
        this.field3480 = arg1.field3480;
        this.field3493 = arg1.field3493;
        this.field3483 = arg1.field3483;
        this.field3512 = 1;
    }

    @ObfuscatedName("jz.i(Ljz;Ljz;I)V")
    public void method4731(class272 arg0, class272 arg1) {
        this.field3510 = arg0.field3510;
        this.field3485 = arg0.field3485;
        this.field3495 = arg0.field3495;
        this.field3488 = arg0.field3488;
        this.field3472 = arg0.field3472;
        this.field3477 = arg0.field3477;
        this.field3490 = arg0.field3490;
        this.field3468 = arg1.field3468;
        this.field3482 = arg1.field3482;
        this.field3473 = arg1.field3473;
        this.field3484 = arg1.field3484;
        this.field3480 = arg1.field3480;
        this.field3493 = arg1.field3493;
        this.field3512 = arg1.field3512;
        this.field3479 = arg1.field3479;
        this.field3498 = arg1.field3498;
        this.field3514 = arg1.field3514;
        this.field3486 = arg1.field3486;
        this.field3501 = arg1.field3501;
        this.field3492 = arg1.field3492;
        this.field3505 = arg1.field3505;
        this.field3506 = arg1.field3506;
        this.field3513 = arg1.field3513;
        this.field3508 = arg1.field3508;
        this.field3518 = arg1.field3518;
        this.field3520 = arg1.field3520;
        this.field3503 = new String[5];
        if (arg1.field3503 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3503[var3] = arg1.field3503[var3];
            }
        }
        this.field3503[4] = class240.field3060;
        this.field3483 = 0;
    }

    @ObfuscatedName("jz.h(Ljz;Ljz;I)V")
    public void method4748(class272 arg0, class272 arg1) {
        this.field3510 = arg0.field3510;
        this.field3485 = arg0.field3485;
        this.field3495 = arg0.field3495;
        this.field3488 = arg0.field3488;
        this.field3472 = arg0.field3472;
        this.field3477 = arg0.field3477;
        this.field3490 = arg0.field3490;
        this.field3468 = arg0.field3468;
        this.field3482 = arg0.field3482;
        this.field3473 = arg0.field3473;
        this.field3484 = arg0.field3484;
        this.field3512 = arg0.field3512;
        this.field3480 = arg1.field3480;
        this.field3483 = 0;
        this.field3493 = false;
        this.field3507 = false;
    }

    @ObfuscatedName("jz.l(II)Ldf;")
    public final class116 method4733(int arg0) {
        if (this.field3509 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3494[var3] && this.field3494[var3] != 0) {
                    var2 = this.field3509[var3];
                }
            }
            if (var2 != -1) {
                return method1730(var2).method4733(1);
            }
        }
        class116 var4 = class116.method2376(Statics.field3489, this.field3510, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3471 != 128 || this.field3487 != 128 || this.field3515 != 128) {
            var4.method2333(this.field3471, this.field3487, this.field3515);
        }
        if (this.field3468 != null) {
            for (int var5 = 0; var5 < this.field3468.length; var5++) {
                var4.method2330(this.field3468[var5], this.field3482[var5]);
            }
        }
        if (this.field3473 != null) {
            for (int var6 = 0; var6 < this.field3473.length; var6++) {
                var4.method2331(this.field3473[var6], this.field3484[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.o(II)Ldx;")
    public final class122 method4734(int arg0) {
        if (this.field3509 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3494[var3] && this.field3494[var3] != 0) {
                    var2 = this.field3509[var3];
                }
            }
            if (var2 != -1) {
                return method1730(var2).method4734(1);
            }
        }
        class122 var4 = (class122) field3476.method3654((long) this.field3478);
        if (var4 != null) {
            return var4;
        }
        class116 var5 = class116.method2376(Statics.field3489, this.field3510, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3471 != 128 || this.field3487 != 128 || this.field3515 != 128) {
            var5.method2333(this.field3471, this.field3487, this.field3515);
        }
        if (this.field3468 != null) {
            for (int var6 = 0; var6 < this.field3468.length; var6++) {
                var5.method2330(this.field3468[var6], this.field3482[var6]);
            }
        }
        if (this.field3473 != null) {
            for (int var7 = 0; var7 < this.field3473.length; var7++) {
                var5.method2331(this.field3473[var7], this.field3484[var7]);
            }
        }
        class122 var8 = var5.method2338(this.field3516 + 64, this.field3517 * 5 + 768, -50, -10, -50);
        var8.field1673 = true;
        field3476.method3646(var8, (long) this.field3478);
        return var8;
    }

    @ObfuscatedName("jz.k(IB)Ljz;")
    public class272 method4753(int arg0) {
        if (this.field3509 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3494[var3] && this.field3494[var3] != 0) {
                    var2 = this.field3509[var3];
                }
            }
            if (var2 != -1) {
                return method1730(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("al.v(IIIIIZI)Llt;")
    public static final class324 method678(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class324 var8 = (class324) field3522.method3654(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class272 var9 = method1730(arg0);
        if (arg1 > 1 && var9.field3509 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3494[var11] && var9.field3494[var11] != 0) {
                    var10 = var9.field3509[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1730(var10);
            }
        }
        class122 var12 = var9.method4734(1);
        if (var12 == null) {
            return null;
        }
        class324 var13 = null;
        if (var9.field3500 != -1) {
            var13 = method678(var9.field3511, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3491 != -1) {
            var13 = method678(var9.field3521, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3524 != -1) {
            var13 = method678(var9.field3523, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3827;
        int var15 = Statics.field3825;
        int var16 = Statics.field3824;
        int[] var17 = new int[4];
        class320.method5373(var17);
        class324 var18 = new class324(36, 32);
        class320.method5369(var18.field3853, 36, 32);
        class320.method5375();
        class125.method2554();
        class125.method2618(16, 16);
        class125.field1767 = false;
        if (var9.field3524 != -1) {
            var13.method5491(0, 0);
        }
        int var19 = var9.field3485;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class125.field1766[var9.field3495] * var19 >> 16;
        int var21 = class125.field1741[var9.field3495] * var19 >> 16;
        var12.method2496();
        var12.method2484(0, var9.field3488, var9.field3472, var9.field3495, var9.field3477, var9.field3490 + var12.field1849 / 2 + var20, var9.field3490 + var21);
        if (var9.field3491 != -1) {
            var13.method5491(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5507(1);
        }
        if (arg2 >= 2) {
            var18.method5507(16777215);
        }
        if (arg3 != 0) {
            var18.method5569(arg3);
        }
        class320.method5369(var18.field3853, 36, 32);
        if (var9.field3500 != -1) {
            var13.method5491(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3512 == 1) {
            class301 var22 = Statics.field1120;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class240.field2991 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class240.field2989 + "</col>";
            }
            var22.method5217(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3522.method3646(var18, var6);
        }
        class320.method5369(var14, var15, var16);
        class320.method5374(var17);
        class125.method2554();
        class125.field1767 = true;
        return var18;
    }

    @ObfuscatedName("jz.p(ZI)Z")
    public final boolean method4736(boolean arg0) {
        int var2 = this.field3479;
        int var3 = this.field3498;
        int var4 = this.field3514;
        if (arg0) {
            var2 = this.field3486;
            var3 = this.field3501;
            var4 = this.field3492;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3489.method4300(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3489.method4300(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3489.method4300(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jz.n(ZI)Ldf;")
    public final class116 method4737(boolean arg0) {
        int var2 = this.field3479;
        int var3 = this.field3498;
        int var4 = this.field3514;
        if (arg0) {
            var2 = this.field3486;
            var3 = this.field3501;
            var4 = this.field3492;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var5 = class116.method2376(Statics.field3489, var2, 0);
        if (var3 != -1) {
            class116 var6 = class116.method2376(Statics.field3489, var3, 0);
            if (var4 == -1) {
                class116[] var9 = new class116[] { var5, var6 };
                var5 = new class116(var9, 2);
            } else {
                class116 var7 = class116.method2376(Statics.field3489, var4, 0);
                class116[] var8 = new class116[] { var5, var6, var7 };
                var5 = new class116(var8, 3);
            }
        }
        if (!arg0 && this.field3497 != 0) {
            var5.method2329(0, this.field3497, 0);
        }
        if (arg0 && this.field3502 != 0) {
            var5.method2329(0, this.field3502, 0);
        }
        if (this.field3468 != null) {
            for (int var10 = 0; var10 < this.field3468.length; var10++) {
                var5.method2330(this.field3468[var10], this.field3482[var10]);
            }
        }
        if (this.field3473 != null) {
            for (int var11 = 0; var11 < this.field3473.length; var11++) {
                var5.method2331(this.field3473[var11], this.field3484[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jz.t(ZB)Z")
    public final boolean method4738(boolean arg0) {
        int var2 = this.field3505;
        int var3 = this.field3506;
        if (arg0) {
            var2 = this.field3513;
            var3 = this.field3508;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3489.method4300(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3489.method4300(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jz.r(ZI)Ldf;")
    public final class116 method4730(boolean arg0) {
        int var2 = this.field3505;
        int var3 = this.field3506;
        if (arg0) {
            var2 = this.field3513;
            var3 = this.field3508;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var4 = class116.method2376(Statics.field3489, var2, 0);
        if (var3 != -1) {
            class116 var5 = class116.method2376(Statics.field3489, var3, 0);
            class116[] var6 = new class116[] { var4, var5 };
            var4 = new class116(var6, 2);
        }
        if (this.field3468 != null) {
            for (int var7 = 0; var7 < this.field3468.length; var7++) {
                var4.method2330(this.field3468[var7], this.field3482[var7]);
            }
        }
        if (this.field3473 != null) {
            for (int var8 = 0; var8 < this.field3473.length; var8++) {
                var4.method2331(this.field3473[var8], this.field3484[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.x(III)I")
    public int method4732(int arg0, int arg1) {
        return class265.method2910(this.field3519, arg0, arg1);
    }

    @ObfuscatedName("jz.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4741(int arg0, String arg1) {
        return class265.method482(this.field3519, arg0, arg1);
    }

    @ObfuscatedName("jz.w(B)I")
    public int method4742() {
        if (this.field3481 == -1 || this.field3503 == null) {
            return -1;
        } else if (this.field3481 >= 0) {
            return this.field3503[this.field3481] == null ? -1 : this.field3481;
        } else if (class240.field2825.equalsIgnoreCase(this.field3503[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("dm.a(ZI)V")
    public static void method2637(boolean arg0) {
        if (Statics.field3474 != arg0) {
            field3475.method3647();
            field3476.method3647();
            field3522.method3647();
            Statics.field3474 = arg0;
        }
    }
}
