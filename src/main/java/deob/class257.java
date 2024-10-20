package deob;

@ObfuscatedName("id")
public class class257 extends class195 {

    @ObfuscatedName("id.k")
    public static class190 field3498 = new class190(64);

    @ObfuscatedName("id.e")
    public static class190 field3501 = new class190(50);

    @ObfuscatedName("id.o")
    public static class190 field3549 = new class190(200);

    @ObfuscatedName("id.l")
    public int field3515;

    @ObfuscatedName("id.c")
    public int field3504;

    @ObfuscatedName("id.m")
    public String field3505 = "null";

    @ObfuscatedName("id.b")
    public short[] field3506;

    @ObfuscatedName("id.f")
    public short[] field3507;

    @ObfuscatedName("id.n")
    public short[] field3508;

    @ObfuscatedName("id.u")
    public short[] field3536;

    @ObfuscatedName("id.p")
    public int field3545 = 2000;

    @ObfuscatedName("id.q")
    public int field3511 = 0;

    @ObfuscatedName("id.d")
    public int field3512 = 0;

    @ObfuscatedName("id.h")
    public int field3513 = 0;

    @ObfuscatedName("id.g")
    public int field3514 = 0;

    @ObfuscatedName("id.x")
    public int field3534 = 0;

    @ObfuscatedName("id.ah")
    public int field3529 = 0;

    @ObfuscatedName("id.ab")
    public int field3510 = 1;

    @ObfuscatedName("id.aw")
    public boolean field3518 = false;

    @ObfuscatedName("id.ai")
    public String[] field3519 = new String[] { null, null, class226.field2861, null, null };

    @ObfuscatedName("id.an")
    public String[] field3520 = new String[] { null, null, null, null, class226.field3019 };

    @ObfuscatedName("id.ar")
    public int field3521 = -2;

    @ObfuscatedName("id.ay")
    public int field3522 = -1;

    @ObfuscatedName("id.ao")
    public int field3548 = -1;

    @ObfuscatedName("id.as")
    public int field3524 = 0;

    @ObfuscatedName("id.ak")
    public int field3525 = -1;

    @ObfuscatedName("id.aq")
    public int field3526 = -1;

    @ObfuscatedName("id.ax")
    public int field3527 = 0;

    @ObfuscatedName("id.ac")
    public int field3528 = -1;

    @ObfuscatedName("id.at")
    public int field3542 = -1;

    @ObfuscatedName("id.av")
    public int field3530 = -1;

    @ObfuscatedName("id.aa")
    public int field3500 = -1;

    @ObfuscatedName("id.am")
    public int field3532 = -1;

    @ObfuscatedName("id.az")
    public int field3533 = -1;

    @ObfuscatedName("id.al")
    public int[] field3531;

    @ObfuscatedName("id.ad")
    public int[] field3535;

    @ObfuscatedName("id.ae")
    public int field3497 = -1;

    @ObfuscatedName("id.ag")
    public int field3537 = -1;

    @ObfuscatedName("id.ap")
    public int field3546 = 128;

    @ObfuscatedName("id.af")
    public int field3539 = 128;

    @ObfuscatedName("id.aj")
    public int field3540 = 128;

    @ObfuscatedName("id.bb")
    public int field3541 = 0;

    @ObfuscatedName("id.bc")
    public int field3523 = 0;

    @ObfuscatedName("id.be")
    public int field3543 = 0;

    @ObfuscatedName("id.bv")
    public class187 field3544;

    @ObfuscatedName("id.bt")
    public boolean field3503 = false;

    @ObfuscatedName("id.bl")
    public int field3516 = -1;

    @ObfuscatedName("id.bp")
    public int field3538 = -1;

    @ObfuscatedName("id.br")
    public int field3509 = -1;

    @ObfuscatedName("id.bg")
    public int field3502 = -1;

    @ObfuscatedName("fg.i(Liq;Liq;ZLjf;I)V")
    public static void method2850(class236 arg0, class236 arg1, boolean arg2, class264 arg3) {
        Statics.field3173 = arg0;
        Statics.field3208 = arg1;
        Statics.field808 = arg2;
        Statics.field1390 = Statics.field3173.method3787(10);
        Statics.field3408 = arg3;
    }

    @ObfuscatedName("fa.w(II)Lid;")
    public static class257 method3084(int arg0) {
        class257 var1 = (class257) field3498.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3173.method3768(10, arg0);
        class257 var3 = new class257();
        var3.field3515 = arg0;
        if (var2 != null) {
            var3.method4267(new class174(var2));
        }
        var3.method4217();
        if (var3.field3537 != -1) {
            var3.method4220(method3084(var3.field3537), method3084(var3.field3497));
        }
        if (var3.field3538 != -1) {
            var3.method4250(method3084(var3.field3538), method3084(var3.field3516));
        }
        if (var3.field3502 != -1) {
            var3.method4253(method3084(var3.field3502), method3084(var3.field3509));
        }
        if (!Statics.field808 && var3.field3518) {
            var3.field3505 = class226.field3014;
            var3.field3503 = false;
            var3.field3519 = null;
            var3.field3520 = null;
            var3.field3521 = -1;
            var3.field3543 = 0;
            if (var3.field3544 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3544.method3200(); var5 != null; var5 = var3.field3544.method3196()) {
                    class252 var6 = class252.method2639((int) var5.field2473);
                    if (var6.field3396) {
                        var5.method3290();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3544 = null;
                }
            }
        }
        field3498.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.a(I)V")
    public void method4217() {
    }

    @ObfuscatedName("id.t(Lfp;B)V")
    public void method4267(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4224(arg0, var2);
        }
    }

    @ObfuscatedName("id.s(Lfp;IB)V")
    public void method4224(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3504 = arg0.method2882();
        } else if (arg1 == 2) {
            this.field3505 = arg0.method2884();
        } else if (arg1 == 4) {
            this.field3545 = arg0.method2882();
        } else if (arg1 == 5) {
            this.field3511 = arg0.method2882();
        } else if (arg1 == 6) {
            this.field3512 = arg0.method2882();
        } else if (arg1 == 7) {
            this.field3514 = arg0.method2882();
            if (this.field3514 > 32767) {
                this.field3514 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3534 = arg0.method2882();
            if (this.field3534 > 32767) {
                this.field3534 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3529 = 1;
        } else if (arg1 == 12) {
            this.field3510 = arg0.method2885();
        } else if (arg1 == 16) {
            this.field3518 = true;
        } else if (arg1 == 23) {
            this.field3522 = arg0.method2882();
            this.field3524 = arg0.method3061();
        } else if (arg1 == 24) {
            this.field3548 = arg0.method2882();
        } else if (arg1 == 25) {
            this.field3525 = arg0.method2882();
            this.field3527 = arg0.method3061();
        } else if (arg1 == 26) {
            this.field3526 = arg0.method2882();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3519[arg1 - 30] = arg0.method2884();
            if (this.field3519[arg1 - 30].equalsIgnoreCase(class226.field2863)) {
                this.field3519[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3520[arg1 - 35] = arg0.method2884();
        } else if (arg1 == 40) {
            int var3 = arg0.method3061();
            this.field3506 = new short[var3];
            this.field3507 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3506[var4] = (short) arg0.method2882();
                this.field3507[var4] = (short) arg0.method2882();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3061();
            this.field3508 = new short[var5];
            this.field3536 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3508[var6] = (short) arg0.method2882();
                this.field3536[var6] = (short) arg0.method2882();
            }
        } else if (arg1 == 42) {
            this.field3521 = arg0.method2930();
        } else if (arg1 == 65) {
            this.field3503 = true;
        } else if (arg1 == 78) {
            this.field3528 = arg0.method2882();
        } else if (arg1 == 79) {
            this.field3542 = arg0.method2882();
        } else if (arg1 == 90) {
            this.field3530 = arg0.method2882();
        } else if (arg1 == 91) {
            this.field3532 = arg0.method2882();
        } else if (arg1 == 92) {
            this.field3500 = arg0.method2882();
        } else if (arg1 == 93) {
            this.field3533 = arg0.method2882();
        } else if (arg1 == 95) {
            this.field3513 = arg0.method2882();
        } else if (arg1 == 97) {
            this.field3497 = arg0.method2882();
        } else if (arg1 == 98) {
            this.field3537 = arg0.method2882();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3531 == null) {
                this.field3531 = new int[10];
                this.field3535 = new int[10];
            }
            this.field3531[arg1 - 100] = arg0.method2882();
            this.field3535[arg1 - 100] = arg0.method2882();
        } else if (arg1 == 110) {
            this.field3546 = arg0.method2882();
        } else if (arg1 == 111) {
            this.field3539 = arg0.method2882();
        } else if (arg1 == 112) {
            this.field3540 = arg0.method2882();
        } else if (arg1 == 113) {
            this.field3541 = arg0.method2930();
        } else if (arg1 == 114) {
            this.field3523 = arg0.method2930() * 5;
        } else if (arg1 == 115) {
            this.field3543 = arg0.method3061();
        } else if (arg1 == 139) {
            this.field3516 = arg0.method2882();
        } else if (arg1 == 140) {
            this.field3538 = arg0.method2882();
        } else if (arg1 == 148) {
            this.field3509 = arg0.method2882();
        } else if (arg1 == 149) {
            this.field3502 = arg0.method2882();
        } else if (arg1 == 249) {
            this.field3544 = class250.method1072(arg0, this.field3544);
        }
    }

    @ObfuscatedName("id.r(Lid;Lid;I)V")
    public void method4220(class257 arg0, class257 arg1) {
        this.field3504 = arg0.field3504;
        this.field3545 = arg0.field3545;
        this.field3511 = arg0.field3511;
        this.field3512 = arg0.field3512;
        this.field3513 = arg0.field3513;
        this.field3514 = arg0.field3514;
        this.field3534 = arg0.field3534;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3508 = arg0.field3508;
        this.field3536 = arg0.field3536;
        this.field3505 = arg1.field3505;
        this.field3518 = arg1.field3518;
        this.field3510 = arg1.field3510;
        this.field3529 = 1;
    }

    @ObfuscatedName("id.v(Lid;Lid;I)V")
    public void method4250(class257 arg0, class257 arg1) {
        this.field3504 = arg0.field3504;
        this.field3545 = arg0.field3545;
        this.field3511 = arg0.field3511;
        this.field3512 = arg0.field3512;
        this.field3513 = arg0.field3513;
        this.field3514 = arg0.field3514;
        this.field3534 = arg0.field3534;
        this.field3506 = arg1.field3506;
        this.field3507 = arg1.field3507;
        this.field3508 = arg1.field3508;
        this.field3536 = arg1.field3536;
        this.field3505 = arg1.field3505;
        this.field3518 = arg1.field3518;
        this.field3529 = arg1.field3529;
        this.field3522 = arg1.field3522;
        this.field3548 = arg1.field3548;
        this.field3528 = arg1.field3528;
        this.field3525 = arg1.field3525;
        this.field3526 = arg1.field3526;
        this.field3542 = arg1.field3542;
        this.field3530 = arg1.field3530;
        this.field3500 = arg1.field3500;
        this.field3532 = arg1.field3532;
        this.field3533 = arg1.field3533;
        this.field3543 = arg1.field3543;
        this.field3519 = arg1.field3519;
        this.field3520 = new String[5];
        if (arg1.field3520 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3520[var3] = arg1.field3520[var3];
            }
        }
        this.field3520[4] = class226.field3050;
        this.field3510 = 0;
    }

    @ObfuscatedName("id.y(Lid;Lid;B)V")
    public void method4253(class257 arg0, class257 arg1) {
        this.field3504 = arg0.field3504;
        this.field3545 = arg0.field3545;
        this.field3511 = arg0.field3511;
        this.field3512 = arg0.field3512;
        this.field3513 = arg0.field3513;
        this.field3514 = arg0.field3514;
        this.field3534 = arg0.field3534;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3508 = arg0.field3508;
        this.field3536 = arg0.field3536;
        this.field3529 = arg0.field3529;
        this.field3505 = arg1.field3505;
        this.field3510 = 0;
        this.field3518 = false;
        this.field3503 = false;
    }

    @ObfuscatedName("id.j(II)Ldo;")
    public final class128 method4223(int arg0) {
        if (this.field3531 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3535[var3] && this.field3535[var3] != 0) {
                    var2 = this.field3531[var3];
                }
            }
            if (var2 != -1) {
                return method3084(var2).method4223(1);
            }
        }
        class128 var4 = class128.method2190(Statics.field3208, this.field3504, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3546 != 128 || this.field3539 != 128 || this.field3540 != 128) {
            var4.method2201(this.field3546, this.field3539, this.field3540);
        }
        if (this.field3506 != null) {
            for (int var5 = 0; var5 < this.field3506.length; var5++) {
                var4.method2198(this.field3506[var5], this.field3507[var5]);
            }
        }
        if (this.field3508 != null) {
            for (int var6 = 0; var6 < this.field3508.length; var6++) {
                var4.method2226(this.field3508[var6], this.field3536[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("id.k(II)Let;")
    public final class134 method4249(int arg0) {
        if (this.field3531 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3535[var3] && this.field3535[var3] != 0) {
                    var2 = this.field3531[var3];
                }
            }
            if (var2 != -1) {
                return method3084(var2).method4249(1);
            }
        }
        class134 var4 = (class134) field3501.method3235((long) this.field3515);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2190(Statics.field3208, this.field3504, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3546 != 128 || this.field3539 != 128 || this.field3540 != 128) {
            var5.method2201(this.field3546, this.field3539, this.field3540);
        }
        if (this.field3506 != null) {
            for (int var6 = 0; var6 < this.field3506.length; var6++) {
                var5.method2198(this.field3506[var6], this.field3507[var6]);
            }
        }
        if (this.field3508 != null) {
            for (int var7 = 0; var7 < this.field3508.length; var7++) {
                var5.method2226(this.field3508[var7], this.field3536[var7]);
            }
        }
        class134 var8 = var5.method2221(this.field3541 + 64, this.field3523 + 768, -50, -10, -50);
        var8.field1951 = true;
        field3501.method3234(var8, (long) this.field3515);
        return var8;
    }

    @ObfuscatedName("id.e(IB)Lid;")
    public class257 method4225(int arg0) {
        if (this.field3531 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3535[var3] && this.field3535[var3] != 0) {
                    var2 = this.field3531[var3];
                }
            }
            if (var2 != -1) {
                return method3084(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("q.o(IIIIIZI)Ljk;")
    public static final class286 method139(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class286 var8 = (class286) field3549.method3235(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = method3084(arg0);
        if (arg1 > 1 && var9.field3531 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3535[var11] && var9.field3535[var11] != 0) {
                    var10 = var9.field3531[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3084(var10);
            }
        }
        class134 var12 = var9.method4249(1);
        if (var12 == null) {
            return null;
        }
        class286 var13 = null;
        if (var9.field3537 != -1) {
            var13 = method139(var9.field3497, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3538 != -1) {
            var13 = method139(var9.field3516, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3502 != -1) {
            var13 = method139(var9.field3509, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3758;
        int var15 = Statics.field3761;
        int var16 = Statics.field3757;
        int[] var17 = new int[4];
        class282.method4555(var17);
        class286 var18 = new class286(36, 32);
        class282.method4553(var18.field3791, 36, 32);
        class282.method4559();
        class137.method2358();
        class137.method2361(16, 16);
        class137.field2024 = false;
        if (var9.field3502 != -1) {
            var13.method4659(0, 0);
        }
        int var19 = var9.field3545;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field2046[var9.field3511] * var19 >> 16;
        int var21 = class137.field2023[var9.field3511] * var19 >> 16;
        var12.method2269();
        var12.method2282(0, var9.field3512, var9.field3513, var9.field3511, var9.field3514, var9.field3534 + var12.field2136 / 2 + var20, var9.field3534 + var21);
        if (var9.field3538 != -1) {
            var13.method4659(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4664(1);
        }
        if (arg2 >= 2) {
            var18.method4664(16777215);
        }
        if (arg3 != 0) {
            var18.method4665(arg3);
        }
        class282.method4553(var18.field3791, 36, 32);
        if (var9.field3537 != -1) {
            var13.method4659(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3529 == 1) {
            class264 var22 = Statics.field3408;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class226.field2936 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class226.field3024 + "</col>";
            }
            var22.method4422(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3549.method3234(var18, var6);
        }
        class282.method4553(var14, var15, var16);
        class282.method4552(var17);
        class137.method2358();
        class137.field2024 = true;
        return var18;
    }

    @ObfuscatedName("id.z(ZI)Z")
    public final boolean method4272(boolean arg0) {
        int var2 = this.field3522;
        int var3 = this.field3548;
        int var4 = this.field3528;
        if (arg0) {
            var2 = this.field3525;
            var3 = this.field3526;
            var4 = this.field3542;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3208.method3770(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3208.method3770(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3208.method3770(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("id.l(ZB)Ldo;")
    public final class128 method4231(boolean arg0) {
        int var2 = this.field3522;
        int var3 = this.field3548;
        int var4 = this.field3528;
        if (arg0) {
            var2 = this.field3525;
            var3 = this.field3526;
            var4 = this.field3542;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2190(Statics.field3208, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2190(Statics.field3208, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2190(Statics.field3208, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3524 != 0) {
            var5.method2206(0, this.field3524, 0);
        }
        if (arg0 && this.field3527 != 0) {
            var5.method2206(0, this.field3527, 0);
        }
        if (this.field3506 != null) {
            for (int var10 = 0; var10 < this.field3506.length; var10++) {
                var5.method2198(this.field3506[var10], this.field3507[var10]);
            }
        }
        if (this.field3508 != null) {
            for (int var11 = 0; var11 < this.field3508.length; var11++) {
                var5.method2226(this.field3508[var11], this.field3536[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("id.c(ZB)Z")
    public final boolean method4228(boolean arg0) {
        int var2 = this.field3530;
        int var3 = this.field3500;
        if (arg0) {
            var2 = this.field3532;
            var3 = this.field3533;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3208.method3770(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3208.method3770(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("id.b(ZI)Ldo;")
    public final class128 method4229(boolean arg0) {
        int var2 = this.field3530;
        int var3 = this.field3500;
        if (arg0) {
            var2 = this.field3532;
            var3 = this.field3533;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2190(Statics.field3208, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2190(Statics.field3208, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3506 != null) {
            for (int var7 = 0; var7 < this.field3506.length; var7++) {
                var4.method2198(this.field3506[var7], this.field3507[var7]);
            }
        }
        if (this.field3508 != null) {
            for (int var8 = 0; var8 < this.field3508.length; var8++) {
                var4.method2226(this.field3508[var8], this.field3536[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("id.f(III)I")
    public int method4227(int arg0, int arg1) {
        return class250.method1727(this.field3544, arg0, arg1);
    }

    @ObfuscatedName("id.n(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4230(int arg0, String arg1) {
        return class250.method1585(this.field3544, arg0, arg1);
    }

    @ObfuscatedName("id.u(B)I")
    public int method4265() {
        if (this.field3521 == -1 || this.field3520 == null) {
            return -1;
        } else if (this.field3521 >= 0) {
            return this.field3520[this.field3521] == null ? -1 : this.field3521;
        } else if (class226.field3019.equalsIgnoreCase(this.field3520[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("at.p(B)V")
    public static void method503() {
        field3549.method3232();
    }
}
