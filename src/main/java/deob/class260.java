package deob;

@ObfuscatedName("ib")
public class class260 extends class198 {

    @ObfuscatedName("ib.z")
    public static class193 field3547 = new class193(64);

    @ObfuscatedName("ib.o")
    public static class193 field3508 = new class193(50);

    @ObfuscatedName("ib.q")
    public static class193 field3509 = new class193(200);

    @ObfuscatedName("ib.k")
    public int field3510;

    @ObfuscatedName("ib.e")
    public int field3555;

    @ObfuscatedName("ib.r")
    public String field3512 = "null";

    @ObfuscatedName("ib.l")
    public short[] field3502;

    @ObfuscatedName("ib.y")
    public short[] field3514;

    @ObfuscatedName("ib.w")
    public short[] field3515;

    @ObfuscatedName("ib.i")
    public short[] field3516;

    @ObfuscatedName("ib.g")
    public int field3534 = 2000;

    @ObfuscatedName("ib.a")
    public int field3518 = 0;

    @ObfuscatedName("ib.x")
    public int field3519 = 0;

    @ObfuscatedName("ib.b")
    public int field3520 = 0;

    @ObfuscatedName("ib.j")
    public int field3521 = 0;

    @ObfuscatedName("ib.v")
    public int field3500 = 0;

    @ObfuscatedName("ib.ap")
    public int field3523 = 0;

    @ObfuscatedName("ib.ar")
    public int field3524 = 1;

    @ObfuscatedName("ib.am")
    public boolean field3525 = false;

    @ObfuscatedName("ib.ab")
    public String[] field3526 = new String[] { null, null, class229.field2872, null, null };

    @ObfuscatedName("ib.af")
    public String[] field3527 = new String[] { null, null, null, null, class229.field2873 };

    @ObfuscatedName("ib.aq")
    public int field3528 = -2;

    @ObfuscatedName("ib.aj")
    public int field3503 = -1;

    @ObfuscatedName("ib.as")
    public int field3530 = -1;

    @ObfuscatedName("ib.av")
    public int field3531 = 0;

    @ObfuscatedName("ib.ao")
    public int field3532 = -1;

    @ObfuscatedName("ib.ag")
    public int field3543 = -1;

    @ObfuscatedName("ib.ay")
    public int field3539 = 0;

    @ObfuscatedName("ib.ax")
    public int field3535 = -1;

    @ObfuscatedName("ib.ad")
    public int field3546 = -1;

    @ObfuscatedName("ib.ae")
    public int field3522 = -1;

    @ObfuscatedName("ib.ac")
    public int field3538 = -1;

    @ObfuscatedName("ib.az")
    public int field3511 = -1;

    @ObfuscatedName("ib.ah")
    public int field3540 = -1;

    @ObfuscatedName("ib.at")
    public int[] field3541;

    @ObfuscatedName("ib.al")
    public int[] field3542;

    @ObfuscatedName("ib.au")
    public int field3554 = -1;

    @ObfuscatedName("ib.ak")
    public int field3536 = -1;

    @ObfuscatedName("ib.aw")
    public int field3545 = 128;

    @ObfuscatedName("ib.an")
    public int field3549 = 128;

    @ObfuscatedName("ib.ai")
    public int field3537 = 128;

    @ObfuscatedName("ib.bk")
    public int field3507 = 0;

    @ObfuscatedName("ib.bh")
    public int field3544 = 0;

    @ObfuscatedName("ib.bv")
    public int field3550 = 0;

    @ObfuscatedName("ib.bf")
    public class190 field3551;

    @ObfuscatedName("ib.bl")
    public boolean field3552 = false;

    @ObfuscatedName("ib.bp")
    public int field3553 = -1;

    @ObfuscatedName("ib.bc")
    public int field3529 = -1;

    @ObfuscatedName("ib.br")
    public int field3533 = -1;

    @ObfuscatedName("ib.bs")
    public int field3556 = -1;

    @ObfuscatedName("an.s(Liw;Liw;ZLjb;I)V")
    public static void method660(class239 arg0, class239 arg1, boolean arg2, class267 arg3) {
        Statics.field2433 = arg0;
        Statics.field3517 = arg1;
        Statics.field3506 = arg2;
        Statics.field2211 = Statics.field2433.method3858(10);
        Statics.field1356 = arg3;
    }

    @ObfuscatedName("hf.c(IB)Lib;")
    public static class260 method3655(int arg0) {
        class260 var1 = (class260) field3547.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2433.method3840(10, arg0);
        class260 var3 = new class260();
        var3.field3510 = arg0;
        if (var2 != null) {
            var3.method4346(new class177(var2));
        }
        var3.method4293();
        if (var3.field3536 != -1) {
            var3.method4296(method3655(var3.field3536), method3655(var3.field3554));
        }
        if (var3.field3529 != -1) {
            var3.method4297(method3655(var3.field3529), method3655(var3.field3553));
        }
        if (var3.field3556 != -1) {
            var3.method4351(method3655(var3.field3556), method3655(var3.field3533));
        }
        if (!Statics.field3506 && var3.field3525) {
            var3.field3512 = class229.field3089;
            var3.field3552 = false;
            var3.field3526 = null;
            var3.field3527 = null;
            var3.field3528 = -1;
            var3.field3550 = 0;
            if (var3.field3551 != null) {
                boolean var4 = false;
                for (class196 var5 = var3.field3551.method3286(); var5 != null; var5 = var3.field3551.method3284()) {
                    class255 var6 = class255.method3819((int) var5.field2487);
                    if (var6.field3405) {
                        var5.method3372();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3551 = null;
                }
            }
        }
        field3547.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.f(I)V")
    public void method4293() {
    }

    @ObfuscatedName("ib.m(Lfs;I)V")
    public void method4346(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4298(arg0, var2);
        }
    }

    @ObfuscatedName("ib.h(Lfs;II)V")
    public void method4298(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3555 = arg0.method2967();
        } else if (arg1 == 2) {
            this.field3512 = arg0.method2973();
        } else if (arg1 == 4) {
            this.field3534 = arg0.method2967();
        } else if (arg1 == 5) {
            this.field3518 = arg0.method2967();
        } else if (arg1 == 6) {
            this.field3519 = arg0.method2967();
        } else if (arg1 == 7) {
            this.field3521 = arg0.method2967();
            if (this.field3521 > 32767) {
                this.field3521 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3500 = arg0.method2967();
            if (this.field3500 > 32767) {
                this.field3500 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3523 = 1;
        } else if (arg1 == 12) {
            this.field3524 = arg0.method2970();
        } else if (arg1 == 16) {
            this.field3525 = true;
        } else if (arg1 == 23) {
            this.field3503 = arg0.method2967();
            this.field3531 = arg0.method2965();
        } else if (arg1 == 24) {
            this.field3530 = arg0.method2967();
        } else if (arg1 == 25) {
            this.field3532 = arg0.method2967();
            this.field3539 = arg0.method2965();
        } else if (arg1 == 26) {
            this.field3543 = arg0.method2967();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3526[arg1 - 30] = arg0.method2973();
            if (this.field3526[arg1 - 30].equalsIgnoreCase(class229.field2874)) {
                this.field3526[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3527[arg1 - 35] = arg0.method2973();
        } else if (arg1 == 40) {
            int var3 = arg0.method2965();
            this.field3502 = new short[var3];
            this.field3514 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3502[var4] = (short) arg0.method2967();
                this.field3514[var4] = (short) arg0.method2967();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2965();
            this.field3515 = new short[var5];
            this.field3516 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3515[var6] = (short) arg0.method2967();
                this.field3516[var6] = (short) arg0.method2967();
            }
        } else if (arg1 == 42) {
            this.field3528 = arg0.method2966();
        } else if (arg1 == 65) {
            this.field3552 = true;
        } else if (arg1 == 78) {
            this.field3535 = arg0.method2967();
        } else if (arg1 == 79) {
            this.field3546 = arg0.method2967();
        } else if (arg1 == 90) {
            this.field3522 = arg0.method2967();
        } else if (arg1 == 91) {
            this.field3511 = arg0.method2967();
        } else if (arg1 == 92) {
            this.field3538 = arg0.method2967();
        } else if (arg1 == 93) {
            this.field3540 = arg0.method2967();
        } else if (arg1 == 95) {
            this.field3520 = arg0.method2967();
        } else if (arg1 == 97) {
            this.field3554 = arg0.method2967();
        } else if (arg1 == 98) {
            this.field3536 = arg0.method2967();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3541 == null) {
                this.field3541 = new int[10];
                this.field3542 = new int[10];
            }
            this.field3541[arg1 - 100] = arg0.method2967();
            this.field3542[arg1 - 100] = arg0.method2967();
        } else if (arg1 == 110) {
            this.field3545 = arg0.method2967();
        } else if (arg1 == 111) {
            this.field3549 = arg0.method2967();
        } else if (arg1 == 112) {
            this.field3537 = arg0.method2967();
        } else if (arg1 == 113) {
            this.field3507 = arg0.method2966();
        } else if (arg1 == 114) {
            this.field3544 = arg0.method2966() * 5;
        } else if (arg1 == 115) {
            this.field3550 = arg0.method2965();
        } else if (arg1 == 139) {
            this.field3553 = arg0.method2967();
        } else if (arg1 == 140) {
            this.field3529 = arg0.method2967();
        } else if (arg1 == 148) {
            this.field3533 = arg0.method2967();
        } else if (arg1 == 149) {
            this.field3556 = arg0.method2967();
        } else if (arg1 == 249) {
            this.field3551 = class253.method3798(arg0, this.field3551);
        }
    }

    @ObfuscatedName("ib.t(Lib;Lib;I)V")
    public void method4296(class260 arg0, class260 arg1) {
        this.field3555 = arg0.field3555;
        this.field3534 = arg0.field3534;
        this.field3518 = arg0.field3518;
        this.field3519 = arg0.field3519;
        this.field3520 = arg0.field3520;
        this.field3521 = arg0.field3521;
        this.field3500 = arg0.field3500;
        this.field3502 = arg0.field3502;
        this.field3514 = arg0.field3514;
        this.field3515 = arg0.field3515;
        this.field3516 = arg0.field3516;
        this.field3512 = arg1.field3512;
        this.field3525 = arg1.field3525;
        this.field3524 = arg1.field3524;
        this.field3523 = 1;
    }

    @ObfuscatedName("ib.p(Lib;Lib;I)V")
    public void method4297(class260 arg0, class260 arg1) {
        this.field3555 = arg0.field3555;
        this.field3534 = arg0.field3534;
        this.field3518 = arg0.field3518;
        this.field3519 = arg0.field3519;
        this.field3520 = arg0.field3520;
        this.field3521 = arg0.field3521;
        this.field3500 = arg0.field3500;
        this.field3502 = arg1.field3502;
        this.field3514 = arg1.field3514;
        this.field3515 = arg1.field3515;
        this.field3516 = arg1.field3516;
        this.field3512 = arg1.field3512;
        this.field3525 = arg1.field3525;
        this.field3523 = arg1.field3523;
        this.field3503 = arg1.field3503;
        this.field3530 = arg1.field3530;
        this.field3535 = arg1.field3535;
        this.field3532 = arg1.field3532;
        this.field3543 = arg1.field3543;
        this.field3546 = arg1.field3546;
        this.field3522 = arg1.field3522;
        this.field3538 = arg1.field3538;
        this.field3511 = arg1.field3511;
        this.field3540 = arg1.field3540;
        this.field3550 = arg1.field3550;
        this.field3526 = arg1.field3526;
        this.field3527 = new String[5];
        if (arg1.field3527 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3527[var3] = arg1.field3527[var3];
            }
        }
        this.field3527[4] = class229.field2878;
        this.field3524 = 0;
    }

    @ObfuscatedName("ib.d(Lib;Lib;I)V")
    public void method4351(class260 arg0, class260 arg1) {
        this.field3555 = arg0.field3555;
        this.field3534 = arg0.field3534;
        this.field3518 = arg0.field3518;
        this.field3519 = arg0.field3519;
        this.field3520 = arg0.field3520;
        this.field3521 = arg0.field3521;
        this.field3500 = arg0.field3500;
        this.field3502 = arg0.field3502;
        this.field3514 = arg0.field3514;
        this.field3515 = arg0.field3515;
        this.field3516 = arg0.field3516;
        this.field3523 = arg0.field3523;
        this.field3512 = arg1.field3512;
        this.field3524 = 0;
        this.field3525 = false;
        this.field3552 = false;
    }

    @ObfuscatedName("ib.n(IB)Ldn;")
    public final class128 method4299(int arg0) {
        if (this.field3541 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3542[var3] && this.field3542[var3] != 0) {
                    var2 = this.field3541[var3];
                }
            }
            if (var2 != -1) {
                return method3655(var2).method4299(1);
            }
        }
        class128 var4 = class128.method2239(Statics.field3517, this.field3555, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3545 != 128 || this.field3549 != 128 || this.field3537 != 128) {
            var4.method2267(this.field3545, this.field3549, this.field3537);
        }
        if (this.field3502 != null) {
            for (int var5 = 0; var5 < this.field3502.length; var5++) {
                var4.method2249(this.field3502[var5], this.field3514[var5]);
            }
        }
        if (this.field3515 != null) {
            for (int var6 = 0; var6 < this.field3515.length; var6++) {
                var4.method2250(this.field3515[var6], this.field3516[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ib.z(II)Leb;")
    public final class134 method4312(int arg0) {
        if (this.field3541 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3542[var3] && this.field3542[var3] != 0) {
                    var2 = this.field3541[var3];
                }
            }
            if (var2 != -1) {
                return method3655(var2).method4312(1);
            }
        }
        class134 var4 = (class134) field3508.method3319((long) this.field3510);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2239(Statics.field3517, this.field3555, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3545 != 128 || this.field3549 != 128 || this.field3537 != 128) {
            var5.method2267(this.field3545, this.field3549, this.field3537);
        }
        if (this.field3502 != null) {
            for (int var6 = 0; var6 < this.field3502.length; var6++) {
                var5.method2249(this.field3502[var6], this.field3514[var6]);
            }
        }
        if (this.field3515 != null) {
            for (int var7 = 0; var7 < this.field3515.length; var7++) {
                var5.method2250(this.field3515[var7], this.field3516[var7]);
            }
        }
        class134 var8 = var5.method2257(this.field3507 + 64, this.field3544 + 768, -50, -10, -50);
        var8.field1950 = true;
        field3508.method3315(var8, (long) this.field3510);
        return var8;
    }

    @ObfuscatedName("ib.o(IB)Lib;")
    public class260 method4301(int arg0) {
        if (this.field3541 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3542[var3] && this.field3542[var3] != 0) {
                    var2 = this.field3541[var3];
                }
            }
            if (var2 != -1) {
                return method3655(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ar.u(IIIIIZB)Lkb;")
    public static final class289 method220(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class289 var8 = (class289) field3509.method3319(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class260 var9 = method3655(arg0);
        if (arg1 > 1 && var9.field3541 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3542[var11] && var9.field3542[var11] != 0) {
                    var10 = var9.field3541[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3655(var10);
            }
        }
        class134 var12 = var9.method4312(1);
        if (var12 == null) {
            return null;
        }
        class289 var13 = null;
        if (var9.field3536 != -1) {
            var13 = method220(var9.field3554, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3529 != -1) {
            var13 = method220(var9.field3553, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3556 != -1) {
            var13 = method220(var9.field3533, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3766;
        int var15 = Statics.field3767;
        int var16 = Statics.field3771;
        int[] var17 = new int[4];
        class285.method4657(var17);
        class289 var18 = new class289(36, 32);
        class285.method4721(var18.field3801, 36, 32);
        class285.method4659();
        class137.method2433();
        class137.method2436(16, 16);
        class137.field2012 = false;
        if (var9.field3556 != -1) {
            var13.method4795(0, 0);
        }
        int var19 = var9.field3534;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field2034[var9.field3518] * var19 >> 16;
        int var21 = class137.field2019[var9.field3518] * var19 >> 16;
        var12.method2346();
        var12.method2359(0, var9.field3519, var9.field3520, var9.field3518, var9.field3521, var9.field3500 + var12.field2117 / 2 + var20, var9.field3500 + var21);
        if (var9.field3529 != -1) {
            var13.method4795(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4792(1);
        }
        if (arg2 >= 2) {
            var18.method4792(16777215);
        }
        if (arg3 != 0) {
            var18.method4772(arg3);
        }
        class285.method4721(var18.field3801, 36, 32);
        if (var9.field3536 != -1) {
            var13.method4795(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3523 == 1) {
            Statics.field1356.method4503(method3925(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3509.method3315(var18, var6);
        }
        class285.method4721(var14, var15, var16);
        class285.method4661(var17);
        class137.method2433();
        class137.field2012 = true;
        return var18;
    }

    @ObfuscatedName("iw.r(II)Ljava/lang/String;")
    public static final String method3925(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class229.field2935 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class229.field2949 + "</col>";
        }
    }

    @ObfuscatedName("ib.l(ZB)Z")
    public final boolean method4295(boolean arg0) {
        int var2 = this.field3503;
        int var3 = this.field3530;
        int var4 = this.field3535;
        if (arg0) {
            var2 = this.field3532;
            var3 = this.field3543;
            var4 = this.field3546;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3517.method3842(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3517.method3842(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3517.method3842(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ib.y(ZB)Ldn;")
    public final class128 method4325(boolean arg0) {
        int var2 = this.field3503;
        int var3 = this.field3530;
        int var4 = this.field3535;
        if (arg0) {
            var2 = this.field3532;
            var3 = this.field3543;
            var4 = this.field3546;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2239(Statics.field3517, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2239(Statics.field3517, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2239(Statics.field3517, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3531 != 0) {
            var5.method2248(0, this.field3531, 0);
        }
        if (arg0 && this.field3539 != 0) {
            var5.method2248(0, this.field3539, 0);
        }
        if (this.field3502 != null) {
            for (int var10 = 0; var10 < this.field3502.length; var10++) {
                var5.method2249(this.field3502[var10], this.field3514[var10]);
            }
        }
        if (this.field3515 != null) {
            for (int var11 = 0; var11 < this.field3515.length; var11++) {
                var5.method2250(this.field3515[var11], this.field3516[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ib.w(ZI)Z")
    public final boolean method4304(boolean arg0) {
        int var2 = this.field3522;
        int var3 = this.field3538;
        if (arg0) {
            var2 = this.field3511;
            var3 = this.field3540;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3517.method3842(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3517.method3842(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ib.i(ZI)Ldn;")
    public final class128 method4303(boolean arg0) {
        int var2 = this.field3522;
        int var3 = this.field3538;
        if (arg0) {
            var2 = this.field3511;
            var3 = this.field3540;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2239(Statics.field3517, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2239(Statics.field3517, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3502 != null) {
            for (int var7 = 0; var7 < this.field3502.length; var7++) {
                var4.method2249(this.field3502[var7], this.field3514[var7]);
            }
        }
        if (this.field3515 != null) {
            for (int var8 = 0; var8 < this.field3515.length; var8++) {
                var4.method2250(this.field3515[var8], this.field3516[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ib.g(IIB)I")
    public int method4306(int arg0, int arg1) {
        return class253.method163(this.field3551, arg0, arg1);
    }

    @ObfuscatedName("ib.a(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4307(int arg0, String arg1) {
        return class253.method471(this.field3551, arg0, arg1);
    }

    @ObfuscatedName("ib.x(I)I")
    public int method4308() {
        if (this.field3528 == -1 || this.field3527 == null) {
            return -1;
        } else if (this.field3528 >= 0) {
            return this.field3527[this.field3528] == null ? -1 : this.field3528;
        } else if (class229.field2873.equalsIgnoreCase(this.field3527[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hs.j(I)V")
    public static void method3809() {
        field3547.method3316();
        field3508.method3316();
        field3509.method3316();
    }

    @ObfuscatedName("bl.v(I)V")
    public static void method715() {
        field3509.method3316();
    }

    @ObfuscatedName("az.ap(ZB)V")
    public static void method533(boolean arg0) {
        if (Statics.field3506 != arg0) {
            method3809();
            Statics.field3506 = arg0;
        }
    }
}
