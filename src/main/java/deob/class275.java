package deob;

@ObfuscatedName("jz")
public class class275 extends class214 {

    @ObfuscatedName("jz.d")
    public static class208 field3508 = new class208(64);

    @ObfuscatedName("jz.t")
    public static class208 field3495 = new class208(50);

    @ObfuscatedName("jz.f")
    public static class208 field3496 = new class208(200);

    @ObfuscatedName("jz.m")
    public int field3520;

    @ObfuscatedName("jz.v")
    public int field3498;

    @ObfuscatedName("jz.r")
    public String field3523 = class245.field2894;

    @ObfuscatedName("jz.x")
    public short[] field3500;

    @ObfuscatedName("jz.y")
    public short[] field3530;

    @ObfuscatedName("jz.p")
    public short[] field3502;

    @ObfuscatedName("jz.k")
    public short[] field3503;

    @ObfuscatedName("jz.o")
    public int field3504 = 2000;

    @ObfuscatedName("jz.s")
    public int field3505 = 0;

    @ObfuscatedName("jz.u")
    public int field3506 = 0;

    @ObfuscatedName("jz.e")
    public int field3507 = 0;

    @ObfuscatedName("jz.w")
    public int field3525 = 0;

    @ObfuscatedName("jz.q")
    public int field3494 = 0;

    @ObfuscatedName("jz.aa")
    public int field3510 = 0;

    @ObfuscatedName("jz.ai")
    public int field3532 = 1;

    @ObfuscatedName("jz.ag")
    public boolean field3512 = false;

    @ObfuscatedName("jz.at")
    public String[] field3537 = new String[] { null, null, class245.field2869, null, null };

    @ObfuscatedName("jz.ad")
    public String[] field3514 = new String[] { null, null, null, null, class245.field2870 };

    @ObfuscatedName("jz.ac")
    public int field3515 = -2;

    @ObfuscatedName("jz.an")
    public int field3492 = -1;

    @ObfuscatedName("jz.ak")
    public int field3517 = -1;

    @ObfuscatedName("jz.ah")
    public int field3518 = 0;

    @ObfuscatedName("jz.al")
    public int field3519 = -1;

    @ObfuscatedName("jz.am")
    public int field3501 = -1;

    @ObfuscatedName("jz.ao")
    public int field3528 = 0;

    @ObfuscatedName("jz.aq")
    public int field3522 = -1;

    @ObfuscatedName("jz.aw")
    public int field3511 = -1;

    @ObfuscatedName("jz.ab")
    public int field3524 = -1;

    @ObfuscatedName("jz.ae")
    public int field3534 = -1;

    @ObfuscatedName("jz.au")
    public int field3497 = -1;

    @ObfuscatedName("jz.ay")
    public int field3527 = -1;

    @ObfuscatedName("jz.az")
    public int[] field3526;

    @ObfuscatedName("jz.aj")
    public int[] field3529;

    @ObfuscatedName("jz.ar")
    public int field3499 = -1;

    @ObfuscatedName("jz.ax")
    public int field3531 = -1;

    @ObfuscatedName("jz.ap")
    public int field3521 = 128;

    @ObfuscatedName("jz.av")
    public int field3533 = 128;

    @ObfuscatedName("jz.af")
    public int field3490 = 128;

    @ObfuscatedName("jz.bf")
    public int field3535 = 0;

    @ObfuscatedName("jz.bi")
    public int field3536 = 0;

    @ObfuscatedName("jz.bx")
    public int field3509 = 0;

    @ObfuscatedName("jz.bu")
    public class205 field3538;

    @ObfuscatedName("jz.bq")
    public boolean field3539 = false;

    @ObfuscatedName("jz.be")
    public int field3540 = -1;

    @ObfuscatedName("jz.bj")
    public int field3541 = -1;

    @ObfuscatedName("jz.bm")
    public int field3542 = -1;

    @ObfuscatedName("jz.bv")
    public int field3543 = -1;

    @ObfuscatedName("hw.n(II)Ljz;")
    public static class275 method4283(int arg0) {
        class275 var1 = (class275) field3508.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2088.method4494(10, arg0);
        class275 var3 = new class275();
        var3.field3520 = arg0;
        if (var2 != null) {
            var3.method4910(new class190(var2));
        }
        var3.method4909();
        if (var3.field3531 != -1) {
            var3.method4912(method4283(var3.field3531), method4283(var3.field3499));
        }
        if (var3.field3541 != -1) {
            var3.method4940(method4283(var3.field3541), method4283(var3.field3540));
        }
        if (var3.field3543 != -1) {
            var3.method4913(method4283(var3.field3543), method4283(var3.field3542));
        }
        if (!Statics.field2624 && var3.field3512) {
            var3.field3523 = class245.field2914;
            var3.field3539 = false;
            var3.field3537 = null;
            var3.field3514 = null;
            var3.field3515 = -1;
            var3.field3509 = 0;
            if (var3.field3538 != null) {
                boolean var4 = false;
                for (class212 var5 = var3.field3538.method3869(); var5 != null; var5 = var3.field3538.method3874()) {
                    class270 var6 = class270.method53((int) var5.field2502);
                    if (var6.field3398) {
                        var5.method3973();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3538 = null;
                }
            }
        }
        field3508.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.h(I)V")
    public void method4909() {
    }

    @ObfuscatedName("jz.l(Lgc;B)V")
    public void method4910(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4911(arg0, var2);
        }
    }

    @ObfuscatedName("jz.g(Lgc;IB)V")
    public void method4911(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3498 = arg0.method3513();
        } else if (arg1 == 2) {
            this.field3523 = arg0.method3520();
        } else if (arg1 == 4) {
            this.field3504 = arg0.method3513();
        } else if (arg1 == 5) {
            this.field3505 = arg0.method3513();
        } else if (arg1 == 6) {
            this.field3506 = arg0.method3513();
        } else if (arg1 == 7) {
            this.field3525 = arg0.method3513();
            if (this.field3525 > 32767) {
                this.field3525 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3494 = arg0.method3513();
            if (this.field3494 > 32767) {
                this.field3494 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3510 = 1;
        } else if (arg1 == 12) {
            this.field3532 = arg0.method3562();
        } else if (arg1 == 16) {
            this.field3512 = true;
        } else if (arg1 == 23) {
            this.field3492 = arg0.method3513();
            this.field3518 = arg0.method3511();
        } else if (arg1 == 24) {
            this.field3517 = arg0.method3513();
        } else if (arg1 == 25) {
            this.field3519 = arg0.method3513();
            this.field3528 = arg0.method3511();
        } else if (arg1 == 26) {
            this.field3501 = arg0.method3513();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3537[arg1 - 30] = arg0.method3520();
            if (this.field3537[arg1 - 30].equalsIgnoreCase(class245.field2999)) {
                this.field3537[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3514[arg1 - 35] = arg0.method3520();
        } else if (arg1 == 40) {
            int var3 = arg0.method3511();
            this.field3500 = new short[var3];
            this.field3530 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3500[var4] = (short) arg0.method3513();
                this.field3530[var4] = (short) arg0.method3513();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3511();
            this.field3502 = new short[var5];
            this.field3503 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3502[var6] = (short) arg0.method3513();
                this.field3503[var6] = (short) arg0.method3513();
            }
        } else if (arg1 == 42) {
            this.field3515 = arg0.method3512();
        } else if (arg1 == 65) {
            this.field3539 = true;
        } else if (arg1 == 78) {
            this.field3522 = arg0.method3513();
        } else if (arg1 == 79) {
            this.field3511 = arg0.method3513();
        } else if (arg1 == 90) {
            this.field3524 = arg0.method3513();
        } else if (arg1 == 91) {
            this.field3497 = arg0.method3513();
        } else if (arg1 == 92) {
            this.field3534 = arg0.method3513();
        } else if (arg1 == 93) {
            this.field3527 = arg0.method3513();
        } else if (arg1 == 95) {
            this.field3507 = arg0.method3513();
        } else if (arg1 == 97) {
            this.field3499 = arg0.method3513();
        } else if (arg1 == 98) {
            this.field3531 = arg0.method3513();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3526 == null) {
                this.field3526 = new int[10];
                this.field3529 = new int[10];
            }
            this.field3526[arg1 - 100] = arg0.method3513();
            this.field3529[arg1 - 100] = arg0.method3513();
        } else if (arg1 == 110) {
            this.field3521 = arg0.method3513();
        } else if (arg1 == 111) {
            this.field3533 = arg0.method3513();
        } else if (arg1 == 112) {
            this.field3490 = arg0.method3513();
        } else if (arg1 == 113) {
            this.field3535 = arg0.method3512();
        } else if (arg1 == 114) {
            this.field3536 = arg0.method3512();
        } else if (arg1 == 115) {
            this.field3509 = arg0.method3511();
        } else if (arg1 == 139) {
            this.field3540 = arg0.method3513();
        } else if (arg1 == 140) {
            this.field3541 = arg0.method3513();
        } else if (arg1 == 148) {
            this.field3542 = arg0.method3513();
        } else if (arg1 == 149) {
            this.field3543 = arg0.method3513();
        } else if (arg1 == 249) {
            this.field3538 = class268.method4601(arg0, this.field3538);
        }
    }

    @ObfuscatedName("jz.b(Ljz;Ljz;I)V")
    public void method4912(class275 arg0, class275 arg1) {
        this.field3498 = arg0.field3498;
        this.field3504 = arg0.field3504;
        this.field3505 = arg0.field3505;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3525 = arg0.field3525;
        this.field3494 = arg0.field3494;
        this.field3500 = arg0.field3500;
        this.field3530 = arg0.field3530;
        this.field3502 = arg0.field3502;
        this.field3503 = arg0.field3503;
        this.field3523 = arg1.field3523;
        this.field3512 = arg1.field3512;
        this.field3532 = arg1.field3532;
        this.field3510 = 1;
    }

    @ObfuscatedName("jz.a(Ljz;Ljz;I)V")
    public void method4940(class275 arg0, class275 arg1) {
        this.field3498 = arg0.field3498;
        this.field3504 = arg0.field3504;
        this.field3505 = arg0.field3505;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3525 = arg0.field3525;
        this.field3494 = arg0.field3494;
        this.field3500 = arg1.field3500;
        this.field3530 = arg1.field3530;
        this.field3502 = arg1.field3502;
        this.field3503 = arg1.field3503;
        this.field3523 = arg1.field3523;
        this.field3512 = arg1.field3512;
        this.field3510 = arg1.field3510;
        this.field3492 = arg1.field3492;
        this.field3517 = arg1.field3517;
        this.field3522 = arg1.field3522;
        this.field3519 = arg1.field3519;
        this.field3501 = arg1.field3501;
        this.field3511 = arg1.field3511;
        this.field3524 = arg1.field3524;
        this.field3534 = arg1.field3534;
        this.field3497 = arg1.field3497;
        this.field3527 = arg1.field3527;
        this.field3509 = arg1.field3509;
        this.field3537 = arg1.field3537;
        this.field3514 = new String[5];
        if (arg1.field3514 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3514[var3] = arg1.field3514[var3];
            }
        }
        this.field3514[4] = class245.field2875;
        this.field3532 = 0;
    }

    @ObfuscatedName("jz.c(Ljz;Ljz;I)V")
    public void method4913(class275 arg0, class275 arg1) {
        this.field3498 = arg0.field3498;
        this.field3504 = arg0.field3504;
        this.field3505 = arg0.field3505;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3525 = arg0.field3525;
        this.field3494 = arg0.field3494;
        this.field3500 = arg0.field3500;
        this.field3530 = arg0.field3530;
        this.field3502 = arg0.field3502;
        this.field3503 = arg0.field3503;
        this.field3510 = arg0.field3510;
        this.field3523 = arg1.field3523;
        this.field3532 = 0;
        this.field3512 = false;
        this.field3539 = false;
    }

    @ObfuscatedName("jz.z(IB)Lde;")
    public final class121 method4915(int arg0) {
        if (this.field3526 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3526[var3];
                }
            }
            if (var2 != -1) {
                return method4283(var2).method4915(1);
            }
        }
        class121 var4 = class121.method2653(Statics.field3513, this.field3498, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3521 != 128 || this.field3533 != 128 || this.field3490 != 128) {
            var4.method2601(this.field3521, this.field3533, this.field3490);
        }
        if (this.field3500 != null) {
            for (int var5 = 0; var5 < this.field3500.length; var5++) {
                var4.method2648(this.field3500[var5], this.field3530[var5]);
            }
        }
        if (this.field3502 != null) {
            for (int var6 = 0; var6 < this.field3502.length; var6++) {
                var4.method2590(this.field3502[var6], this.field3503[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.j(II)Ldq;")
    public final class127 method4928(int arg0) {
        if (this.field3526 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3526[var3];
                }
            }
            if (var2 != -1) {
                return method4283(var2).method4928(1);
            }
        }
        class127 var4 = (class127) field3495.method3902((long) this.field3520);
        if (var4 != null) {
            return var4;
        }
        class121 var5 = class121.method2653(Statics.field3513, this.field3498, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3521 != 128 || this.field3533 != 128 || this.field3490 != 128) {
            var5.method2601(this.field3521, this.field3533, this.field3490);
        }
        if (this.field3500 != null) {
            for (int var6 = 0; var6 < this.field3500.length; var6++) {
                var5.method2648(this.field3500[var6], this.field3530[var6]);
            }
        }
        if (this.field3502 != null) {
            for (int var7 = 0; var7 < this.field3502.length; var7++) {
                var5.method2590(this.field3502[var7], this.field3503[var7]);
            }
        }
        class127 var8 = var5.method2611(this.field3535 + 64, this.field3536 * 5 + 768, -50, -10, -50);
        var8.field1673 = true;
        field3495.method3908(var8, (long) this.field3520);
        return var8;
    }

    @ObfuscatedName("jz.d(II)Ljz;")
    public class275 method4924(int arg0) {
        if (this.field3526 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3526[var3];
                }
            }
            if (var2 != -1) {
                return method4283(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("c.i(IIIIIZI)Llu;")
    public static final class327 method55(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class327 var8 = (class327) field3496.method3902(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class275 var9 = method4283(arg0);
        if (arg1 > 1 && var9.field3526 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3529[var11] && var9.field3529[var11] != 0) {
                    var10 = var9.field3526[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4283(var10);
            }
        }
        class127 var12 = var9.method4928(1);
        if (var12 == null) {
            return null;
        }
        class327 var13 = null;
        if (var9.field3531 != -1) {
            var13 = method55(var9.field3499, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3541 != -1) {
            var13 = method55(var9.field3540, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3543 != -1) {
            var13 = method55(var9.field3542, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3855;
        int var15 = Statics.field3858;
        int var16 = Statics.field3854;
        int[] var17 = new int[4];
        class323.method5594(var17);
        class327 var18 = new class327(36, 32);
        class323.method5613(var18.field3883, 36, 32);
        class323.method5596();
        class130.method2785();
        class130.method2832(16, 16);
        class130.field1766 = false;
        if (var9.field3543 != -1) {
            var13.method5742(0, 0);
        }
        int var19 = var9.field3504;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class130.field1768[var9.field3505] * var19 >> 16;
        int var21 = class130.field1769[var9.field3505] * var19 >> 16;
        var12.method2676();
        var12.method2734(0, var9.field3506, var9.field3507, var9.field3505, var9.field3525, var9.field3494 + var12.field1860 / 2 + var20, var9.field3494 + var21);
        if (var9.field3541 != -1) {
            var13.method5742(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5694(1);
        }
        if (arg2 >= 2) {
            var18.method5694(16777215);
        }
        if (arg3 != 0) {
            var18.method5695(arg3);
        }
        class323.method5613(var18.field3883, 36, 32);
        if (var9.field3531 != -1) {
            var13.method5742(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3510 == 1) {
            class304 var22 = Statics.field2471;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class245.field2970 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class245.field3034 + "</col>";
            }
            var22.method5337(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3496.method3908(var18, var6);
        }
        class323.method5613(var14, var15, var16);
        class323.method5595(var17);
        class130.method2785();
        class130.field1766 = true;
        return var18;
    }

    @ObfuscatedName("jz.m(ZI)Z")
    public final boolean method4918(boolean arg0) {
        int var2 = this.field3492;
        int var3 = this.field3517;
        int var4 = this.field3522;
        if (arg0) {
            var2 = this.field3519;
            var3 = this.field3501;
            var4 = this.field3511;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3513.method4456(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3513.method4456(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3513.method4456(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jz.v(ZB)Lde;")
    public final class121 method4919(boolean arg0) {
        int var2 = this.field3492;
        int var3 = this.field3517;
        int var4 = this.field3522;
        if (arg0) {
            var2 = this.field3519;
            var3 = this.field3501;
            var4 = this.field3511;
        }
        if (var2 == -1) {
            return null;
        }
        class121 var5 = class121.method2653(Statics.field3513, var2, 0);
        if (var3 != -1) {
            class121 var6 = class121.method2653(Statics.field3513, var3, 0);
            if (var4 == -1) {
                class121[] var9 = new class121[] { var5, var6 };
                var5 = new class121(var9, 2);
            } else {
                class121 var7 = class121.method2653(Statics.field3513, var4, 0);
                class121[] var8 = new class121[] { var5, var6, var7 };
                var5 = new class121(var8, 3);
            }
        }
        if (!arg0 && this.field3518 != 0) {
            var5.method2588(0, this.field3518, 0);
        }
        if (arg0 && this.field3528 != 0) {
            var5.method2588(0, this.field3528, 0);
        }
        if (this.field3500 != null) {
            for (int var10 = 0; var10 < this.field3500.length; var10++) {
                var5.method2648(this.field3500[var10], this.field3530[var10]);
            }
        }
        if (this.field3502 != null) {
            for (int var11 = 0; var11 < this.field3502.length; var11++) {
                var5.method2590(this.field3502[var11], this.field3503[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jz.r(ZI)Z")
    public final boolean method4920(boolean arg0) {
        int var2 = this.field3524;
        int var3 = this.field3534;
        if (arg0) {
            var2 = this.field3497;
            var3 = this.field3527;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3513.method4456(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3513.method4456(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jz.x(ZB)Lde;")
    public final class121 method4921(boolean arg0) {
        int var2 = this.field3524;
        int var3 = this.field3534;
        if (arg0) {
            var2 = this.field3497;
            var3 = this.field3527;
        }
        if (var2 == -1) {
            return null;
        }
        class121 var4 = class121.method2653(Statics.field3513, var2, 0);
        if (var3 != -1) {
            class121 var5 = class121.method2653(Statics.field3513, var3, 0);
            class121[] var6 = new class121[] { var4, var5 };
            var4 = new class121(var6, 2);
        }
        if (this.field3500 != null) {
            for (int var7 = 0; var7 < this.field3500.length; var7++) {
                var4.method2648(this.field3500[var7], this.field3530[var7]);
            }
        }
        if (this.field3502 != null) {
            for (int var8 = 0; var8 < this.field3502.length; var8++) {
                var4.method2590(this.field3502[var8], this.field3503[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.y(IIB)I")
    public int method4922(int arg0, int arg1) {
        class205 var3 = this.field3538;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3870((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2517;
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4959(int arg0, String arg1) {
        class205 var3 = this.field3538;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class203 var5 = (class203) var3.method3870((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2473;
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.k(I)I")
    public int method4939() {
        if (this.field3515 == -1 || this.field3514 == null) {
            return -1;
        } else if (this.field3515 >= 0) {
            return this.field3514[this.field3515] == null ? -1 : this.field3515;
        } else if (class245.field2870.equalsIgnoreCase(this.field3514[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("u.o(B)V")
    public static void method269() {
        field3496.method3899();
    }
}
