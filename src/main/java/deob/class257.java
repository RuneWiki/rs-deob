package deob;

@ObfuscatedName("im")
public class class257 extends class195 {

    @ObfuscatedName("im.g")
    public static class190 field3502 = new class190(64);

    @ObfuscatedName("im.e")
    public static class190 field3503 = new class190(50);

    @ObfuscatedName("im.o")
    public static class190 field3504 = new class190(200);

    @ObfuscatedName("im.a")
    public int field3505;

    @ObfuscatedName("im.y")
    public int field3506;

    @ObfuscatedName("im.r")
    public String field3507 = "null";

    @ObfuscatedName("im.b")
    public short[] field3546;

    @ObfuscatedName("im.s")
    public short[] field3529;

    @ObfuscatedName("im.v")
    public short[] field3545;

    @ObfuscatedName("im.t")
    public short[] field3525;

    @ObfuscatedName("im.w")
    public int field3531 = 2000;

    @ObfuscatedName("im.l")
    public int field3513 = 0;

    @ObfuscatedName("im.q")
    public int field3514 = 0;

    @ObfuscatedName("im.k")
    public int field3494 = 0;

    @ObfuscatedName("im.d")
    public int field3518 = 0;

    @ObfuscatedName("im.u")
    public int field3517 = 0;

    @ObfuscatedName("im.ae")
    public int field3535 = 0;

    @ObfuscatedName("im.ao")
    public int field3509 = 1;

    @ObfuscatedName("im.ad")
    public boolean field3520 = false;

    @ObfuscatedName("im.aa")
    public String[] field3521 = new String[] { null, null, class226.field2855, null, null };

    @ObfuscatedName("im.aw")
    public String[] field3522 = new String[] { null, null, null, null, class226.field2959 };

    @ObfuscatedName("im.al")
    public int field3523 = -2;

    @ObfuscatedName("im.at")
    public int field3512 = -1;

    @ObfuscatedName("im.au")
    public int field3516 = -1;

    @ObfuscatedName("im.ak")
    public int field3526 = 0;

    @ObfuscatedName("im.as")
    public int field3527 = -1;

    @ObfuscatedName("im.ah")
    public int field3530 = -1;

    @ObfuscatedName("im.ab")
    public int field3510 = 0;

    @ObfuscatedName("im.am")
    public int field3524 = -1;

    @ObfuscatedName("im.ac")
    public int field3511 = -1;

    @ObfuscatedName("im.ax")
    public int field3532 = -1;

    @ObfuscatedName("im.av")
    public int field3533 = -1;

    @ObfuscatedName("im.aq")
    public int field3534 = -1;

    @ObfuscatedName("im.af")
    public int field3528 = -1;

    @ObfuscatedName("im.ag")
    public int[] field3536;

    @ObfuscatedName("im.ar")
    public int[] field3515;

    @ObfuscatedName("im.aj")
    public int field3538 = -1;

    @ObfuscatedName("im.ay")
    public int field3539 = -1;

    @ObfuscatedName("im.ap")
    public int field3540 = 128;

    @ObfuscatedName("im.ai")
    public int field3541 = 128;

    @ObfuscatedName("im.az")
    public int field3542 = 128;

    @ObfuscatedName("im.bv")
    public int field3543 = 0;

    @ObfuscatedName("im.bd")
    public int field3495 = 0;

    @ObfuscatedName("im.bc")
    public int field3551 = 0;

    @ObfuscatedName("im.bj")
    public class187 field3508;

    @ObfuscatedName("im.bx")
    public boolean field3547 = false;

    @ObfuscatedName("im.bf")
    public int field3548 = -1;

    @ObfuscatedName("im.bn")
    public int field3549 = -1;

    @ObfuscatedName("im.bh")
    public int field3550 = -1;

    @ObfuscatedName("im.bm")
    public int field3544 = -1;

    @ObfuscatedName("im.n(II)Lim;")
    public static class257 method4344(int arg0) {
        class257 var1 = (class257) field3502.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field666.method3880(10, arg0);
        class257 var3 = new class257();
        var3.field3505 = arg0;
        if (var2 != null) {
            var3.method4286(new class174(var2));
        }
        var3.method4340();
        if (var3.field3539 != -1) {
            var3.method4288(method4344(var3.field3539), method4344(var3.field3538));
        }
        if (var3.field3549 != -1) {
            var3.method4302(method4344(var3.field3549), method4344(var3.field3548));
        }
        if (var3.field3544 != -1) {
            var3.method4290(method4344(var3.field3544), method4344(var3.field3550));
        }
        if (!Statics.field3500 && var3.field3520) {
            var3.field3507 = class226.field2955;
            var3.field3547 = false;
            var3.field3521 = null;
            var3.field3522 = null;
            var3.field3523 = -1;
            var3.field3551 = 0;
            if (var3.field3508 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3508.method3246(); var5 != null; var5 = var3.field3508.method3247()) {
                    class252 var6 = class252.method1729((int) var5.field2483);
                    if (var6.field3388) {
                        var5.method3347();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3508 = null;
                }
            }
        }
        field3502.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.p(I)V")
    public void method4340() {
    }

    @ObfuscatedName("im.i(Lfl;I)V")
    public void method4286(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4287(arg0, var2);
        }
    }

    @ObfuscatedName("im.j(Lfl;II)V")
    public void method4287(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3506 = arg0.method3065();
        } else if (arg1 == 2) {
            this.field3507 = arg0.method3098();
        } else if (arg1 == 4) {
            this.field3531 = arg0.method3065();
        } else if (arg1 == 5) {
            this.field3513 = arg0.method3065();
        } else if (arg1 == 6) {
            this.field3514 = arg0.method3065();
        } else if (arg1 == 7) {
            this.field3518 = arg0.method3065();
            if (this.field3518 > 32767) {
                this.field3518 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3517 = arg0.method3065();
            if (this.field3517 > 32767) {
                this.field3517 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3535 = 1;
        } else if (arg1 == 12) {
            this.field3509 = arg0.method3058();
        } else if (arg1 == 16) {
            this.field3520 = true;
        } else if (arg1 == 23) {
            this.field3512 = arg0.method3065();
            this.field3526 = arg0.method2925();
        } else if (arg1 == 24) {
            this.field3516 = arg0.method3065();
        } else if (arg1 == 25) {
            this.field3527 = arg0.method3065();
            this.field3510 = arg0.method2925();
        } else if (arg1 == 26) {
            this.field3530 = arg0.method3065();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3521[arg1 - 30] = arg0.method3098();
            if (this.field3521[arg1 - 30].equalsIgnoreCase(class226.field2979)) {
                this.field3521[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3522[arg1 - 35] = arg0.method3098();
        } else if (arg1 == 40) {
            int var3 = arg0.method2925();
            this.field3546 = new short[var3];
            this.field3529 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3546[var4] = (short) arg0.method3065();
                this.field3529[var4] = (short) arg0.method3065();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2925();
            this.field3545 = new short[var5];
            this.field3525 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3545[var6] = (short) arg0.method3065();
                this.field3525[var6] = (short) arg0.method3065();
            }
        } else if (arg1 == 42) {
            this.field3523 = arg0.method2922();
        } else if (arg1 == 65) {
            this.field3547 = true;
        } else if (arg1 == 78) {
            this.field3524 = arg0.method3065();
        } else if (arg1 == 79) {
            this.field3511 = arg0.method3065();
        } else if (arg1 == 90) {
            this.field3532 = arg0.method3065();
        } else if (arg1 == 91) {
            this.field3534 = arg0.method3065();
        } else if (arg1 == 92) {
            this.field3533 = arg0.method3065();
        } else if (arg1 == 93) {
            this.field3528 = arg0.method3065();
        } else if (arg1 == 95) {
            this.field3494 = arg0.method3065();
        } else if (arg1 == 97) {
            this.field3538 = arg0.method3065();
        } else if (arg1 == 98) {
            this.field3539 = arg0.method3065();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3536 == null) {
                this.field3536 = new int[10];
                this.field3515 = new int[10];
            }
            this.field3536[arg1 - 100] = arg0.method3065();
            this.field3515[arg1 - 100] = arg0.method3065();
        } else if (arg1 == 110) {
            this.field3540 = arg0.method3065();
        } else if (arg1 == 111) {
            this.field3541 = arg0.method3065();
        } else if (arg1 == 112) {
            this.field3542 = arg0.method3065();
        } else if (arg1 == 113) {
            this.field3543 = arg0.method2922();
        } else if (arg1 == 114) {
            this.field3495 = arg0.method2922() * 5;
        } else if (arg1 == 115) {
            this.field3551 = arg0.method2925();
        } else if (arg1 == 139) {
            this.field3548 = arg0.method3065();
        } else if (arg1 == 140) {
            this.field3549 = arg0.method3065();
        } else if (arg1 == 148) {
            this.field3550 = arg0.method3065();
        } else if (arg1 == 149) {
            this.field3544 = arg0.method3065();
        } else if (arg1 == 249) {
            this.field3508 = class250.method1667(arg0, this.field3508);
        }
    }

    @ObfuscatedName("im.f(Lim;Lim;I)V")
    public void method4288(class257 arg0, class257 arg1) {
        this.field3506 = arg0.field3506;
        this.field3531 = arg0.field3531;
        this.field3513 = arg0.field3513;
        this.field3514 = arg0.field3514;
        this.field3494 = arg0.field3494;
        this.field3518 = arg0.field3518;
        this.field3517 = arg0.field3517;
        this.field3546 = arg0.field3546;
        this.field3529 = arg0.field3529;
        this.field3545 = arg0.field3545;
        this.field3525 = arg0.field3525;
        this.field3507 = arg1.field3507;
        this.field3520 = arg1.field3520;
        this.field3509 = arg1.field3509;
        this.field3535 = 1;
    }

    @ObfuscatedName("im.m(Lim;Lim;I)V")
    public void method4302(class257 arg0, class257 arg1) {
        this.field3506 = arg0.field3506;
        this.field3531 = arg0.field3531;
        this.field3513 = arg0.field3513;
        this.field3514 = arg0.field3514;
        this.field3494 = arg0.field3494;
        this.field3518 = arg0.field3518;
        this.field3517 = arg0.field3517;
        this.field3546 = arg1.field3546;
        this.field3529 = arg1.field3529;
        this.field3545 = arg1.field3545;
        this.field3525 = arg1.field3525;
        this.field3507 = arg1.field3507;
        this.field3520 = arg1.field3520;
        this.field3535 = arg1.field3535;
        this.field3512 = arg1.field3512;
        this.field3516 = arg1.field3516;
        this.field3524 = arg1.field3524;
        this.field3527 = arg1.field3527;
        this.field3530 = arg1.field3530;
        this.field3511 = arg1.field3511;
        this.field3532 = arg1.field3532;
        this.field3533 = arg1.field3533;
        this.field3534 = arg1.field3534;
        this.field3528 = arg1.field3528;
        this.field3551 = arg1.field3551;
        this.field3521 = arg1.field3521;
        this.field3522 = new String[5];
        if (arg1.field3522 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3522[var3] = arg1.field3522[var3];
            }
        }
        this.field3522[4] = class226.field3001;
        this.field3509 = 0;
    }

    @ObfuscatedName("im.c(Lim;Lim;S)V")
    public void method4290(class257 arg0, class257 arg1) {
        this.field3506 = arg0.field3506;
        this.field3531 = arg0.field3531;
        this.field3513 = arg0.field3513;
        this.field3514 = arg0.field3514;
        this.field3494 = arg0.field3494;
        this.field3518 = arg0.field3518;
        this.field3517 = arg0.field3517;
        this.field3546 = arg0.field3546;
        this.field3529 = arg0.field3529;
        this.field3545 = arg0.field3545;
        this.field3525 = arg0.field3525;
        this.field3535 = arg0.field3535;
        this.field3507 = arg1.field3507;
        this.field3509 = 0;
        this.field3520 = false;
        this.field3547 = false;
    }

    @ObfuscatedName("im.z(II)Ldu;")
    public final class128 method4333(int arg0) {
        if (this.field3536 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3515[var3] && this.field3515[var3] != 0) {
                    var2 = this.field3536[var3];
                }
            }
            if (var2 != -1) {
                return method4344(var2).method4333(1);
            }
        }
        class128 var4 = class128.method2225(Statics.field3499, this.field3506, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3540 != 128 || this.field3541 != 128 || this.field3542 != 128) {
            var4.method2241(this.field3540, this.field3541, this.field3542);
        }
        if (this.field3546 != null) {
            for (int var5 = 0; var5 < this.field3546.length; var5++) {
                var4.method2299(this.field3546[var5], this.field3529[var5]);
            }
        }
        if (this.field3545 != null) {
            for (int var6 = 0; var6 < this.field3545.length; var6++) {
                var4.method2239(this.field3545[var6], this.field3525[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("im.h(IB)Lek;")
    public final class134 method4292(int arg0) {
        if (this.field3536 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3515[var3] && this.field3515[var3] != 0) {
                    var2 = this.field3536[var3];
                }
            }
            if (var2 != -1) {
                return method4344(var2).method4292(1);
            }
        }
        class134 var4 = (class134) field3503.method3280((long) this.field3505);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2225(Statics.field3499, this.field3506, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3540 != 128 || this.field3541 != 128 || this.field3542 != 128) {
            var5.method2241(this.field3540, this.field3541, this.field3542);
        }
        if (this.field3546 != null) {
            for (int var6 = 0; var6 < this.field3546.length; var6++) {
                var5.method2299(this.field3546[var6], this.field3529[var6]);
            }
        }
        if (this.field3545 != null) {
            for (int var7 = 0; var7 < this.field3545.length; var7++) {
                var5.method2239(this.field3545[var7], this.field3525[var7]);
            }
        }
        class134 var8 = var5.method2246(this.field3543 + 64, this.field3495 + 768, -50, -10, -50);
        var8.field1958 = true;
        field3503.method3282(var8, (long) this.field3505);
        return var8;
    }

    @ObfuscatedName("im.g(II)Lim;")
    public class257 method4293(int arg0) {
        if (this.field3536 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3515[var3] && this.field3515[var3] != 0) {
                    var2 = this.field3536[var3];
                }
            }
            if (var2 != -1) {
                return method4344(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("eq.e(IIIIIZI)Ljp;")
    public static final class286 method2399(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class286 var8 = (class286) field3504.method3280(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = method4344(arg0);
        if (arg1 > 1 && var9.field3536 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3515[var11] && var9.field3515[var11] != 0) {
                    var10 = var9.field3536[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4344(var10);
            }
        }
        class134 var12 = var9.method4292(1);
        if (var12 == null) {
            return null;
        }
        class286 var13 = null;
        if (var9.field3539 != -1) {
            var13 = method2399(var9.field3538, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3549 != -1) {
            var13 = method2399(var9.field3548, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3544 != -1) {
            var13 = method2399(var9.field3550, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3753;
        int var15 = Statics.field3754;
        int var16 = Statics.field3758;
        int[] var17 = new int[4];
        class282.method4645(var17);
        class286 var18 = new class286(36, 32);
        class282.method4673(var18.field3788, 36, 32);
        class282.method4646();
        class137.method2403();
        class137.method2406(16, 16);
        class137.field2023 = false;
        if (var9.field3544 != -1) {
            var13.method4770(0, 0);
        }
        int var19 = var9.field3531;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field2020[var9.field3513] * var19 >> 16;
        int var21 = class137.field2044[var9.field3513] * var19 >> 16;
        var12.method2324();
        var12.method2337(0, var9.field3514, var9.field3494, var9.field3513, var9.field3518, var9.field3517 + var12.field2130 / 2 + var20, var9.field3517 + var21);
        if (var9.field3549 != -1) {
            var13.method4770(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4820(1);
        }
        if (arg2 >= 2) {
            var18.method4820(16777215);
        }
        if (arg3 != 0) {
            var18.method4768(arg3);
        }
        class282.method4673(var18.field3788, 36, 32);
        if (var9.field3539 != -1) {
            var13.method4770(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3535 == 1) {
            class264 var22 = Statics.field1293;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class226.field3018 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class226.field3016 + "</col>";
            }
            var22.method4472(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3504.method3282(var18, var6);
        }
        class282.method4673(var14, var15, var16);
        class282.method4730(var17);
        class137.method2403();
        class137.field2023 = true;
        return var18;
    }

    @ObfuscatedName("im.o(ZB)Z")
    public final boolean method4294(boolean arg0) {
        int var2 = this.field3512;
        int var3 = this.field3516;
        int var4 = this.field3524;
        if (arg0) {
            var2 = this.field3527;
            var3 = this.field3530;
            var4 = this.field3511;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3499.method3832(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3499.method3832(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3499.method3832(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("im.x(ZI)Ldu;")
    public final class128 method4295(boolean arg0) {
        int var2 = this.field3512;
        int var3 = this.field3516;
        int var4 = this.field3524;
        if (arg0) {
            var2 = this.field3527;
            var3 = this.field3530;
            var4 = this.field3511;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2225(Statics.field3499, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2225(Statics.field3499, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2225(Statics.field3499, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3526 != 0) {
            var5.method2237(0, this.field3526, 0);
        }
        if (arg0 && this.field3510 != 0) {
            var5.method2237(0, this.field3510, 0);
        }
        if (this.field3546 != null) {
            for (int var10 = 0; var10 < this.field3546.length; var10++) {
                var5.method2299(this.field3546[var10], this.field3529[var10]);
            }
        }
        if (this.field3545 != null) {
            for (int var11 = 0; var11 < this.field3545.length; var11++) {
                var5.method2239(this.field3545[var11], this.field3525[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("im.a(ZB)Z")
    public final boolean method4296(boolean arg0) {
        int var2 = this.field3532;
        int var3 = this.field3533;
        if (arg0) {
            var2 = this.field3534;
            var3 = this.field3528;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3499.method3832(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3499.method3832(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("im.y(ZB)Ldu;")
    public final class128 method4300(boolean arg0) {
        int var2 = this.field3532;
        int var3 = this.field3533;
        if (arg0) {
            var2 = this.field3534;
            var3 = this.field3528;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2225(Statics.field3499, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2225(Statics.field3499, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3546 != null) {
            for (int var7 = 0; var7 < this.field3546.length; var7++) {
                var4.method2299(this.field3546[var7], this.field3529[var7]);
            }
        }
        if (this.field3545 != null) {
            for (int var8 = 0; var8 < this.field3545.length; var8++) {
                var4.method2239(this.field3545[var8], this.field3525[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("im.r(IIB)I")
    public int method4328(int arg0, int arg1) {
        return class250.method4031(this.field3508, arg0, arg1);
    }

    @ObfuscatedName("im.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4299(int arg0, String arg1) {
        return class250.method3573(this.field3508, arg0, arg1);
    }

    @ObfuscatedName("im.s(I)I")
    public int method4297() {
        if (this.field3523 == -1 || this.field3522 == null) {
            return -1;
        } else if (this.field3523 >= 0) {
            return this.field3522[this.field3523] == null ? -1 : this.field3523;
        } else if (class226.field2959.equalsIgnoreCase(this.field3522[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("m.v(B)V")
    public static void method16() {
        field3504.method3286();
    }
}
