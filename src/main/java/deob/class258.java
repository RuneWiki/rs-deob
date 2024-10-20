package deob;

@ObfuscatedName("ix")
public class class258 extends class196 {

    @ObfuscatedName("ix.s")
    public static class191 field3536 = new class191(64);

    @ObfuscatedName("ix.d")
    public static class191 field3489 = new class191(50);

    @ObfuscatedName("ix.l")
    public static class191 field3501 = new class191(200);

    @ObfuscatedName("ix.y")
    public int field3492;

    @ObfuscatedName("ix.v")
    public int field3526;

    @ObfuscatedName("ix.c")
    public String field3494 = "null";

    @ObfuscatedName("ix.z")
    public short[] field3495;

    @ObfuscatedName("ix.u")
    public short[] field3496;

    @ObfuscatedName("ix.e")
    public short[] field3497;

    @ObfuscatedName("ix.p")
    public short[] field3535;

    @ObfuscatedName("ix.m")
    public int field3508 = 2000;

    @ObfuscatedName("ix.x")
    public int field3500 = 0;

    @ObfuscatedName("ix.h")
    public int field3485 = 0;

    @ObfuscatedName("ix.f")
    public int field3502 = 0;

    @ObfuscatedName("ix.g")
    public int field3503 = 0;

    @ObfuscatedName("ix.w")
    public int field3504 = 0;

    @ObfuscatedName("ix.ar")
    public int field3491 = 0;

    @ObfuscatedName("ix.ax")
    public int field3506 = 1;

    @ObfuscatedName("ix.al")
    public boolean field3507 = false;

    @ObfuscatedName("ix.ag")
    public String[] field3534 = new String[] { null, null, class227.field2860, null, null };

    @ObfuscatedName("ix.ad")
    public String[] field3509 = new String[] { null, null, null, null, class227.field3095 };

    @ObfuscatedName("ix.am")
    public int field3510 = -2;

    @ObfuscatedName("ix.aq")
    public int field3511 = -1;

    @ObfuscatedName("ix.at")
    public int field3512 = -1;

    @ObfuscatedName("ix.az")
    public int field3513 = 0;

    @ObfuscatedName("ix.ac")
    public int field3493 = -1;

    @ObfuscatedName("ix.aa")
    public int field3538 = -1;

    @ObfuscatedName("ix.aj")
    public int field3516 = 0;

    @ObfuscatedName("ix.ay")
    public int field3517 = -1;

    @ObfuscatedName("ix.av")
    public int field3530 = -1;

    @ObfuscatedName("ix.ao")
    public int field3519 = -1;

    @ObfuscatedName("ix.aw")
    public int field3520 = -1;

    @ObfuscatedName("ix.ah")
    public int field3521 = -1;

    @ObfuscatedName("ix.an")
    public int field3522 = -1;

    @ObfuscatedName("ix.af")
    public int[] field3523;

    @ObfuscatedName("ix.ak")
    public int[] field3524;

    @ObfuscatedName("ix.as")
    public int field3525 = -1;

    @ObfuscatedName("ix.ap")
    public int field3486 = -1;

    @ObfuscatedName("ix.ae")
    public int field3527 = 128;

    @ObfuscatedName("ix.ai")
    public int field3528 = 128;

    @ObfuscatedName("ix.au")
    public int field3529 = 128;

    @ObfuscatedName("ix.bp")
    public int field3499 = 0;

    @ObfuscatedName("ix.bd")
    public int field3531 = 0;

    @ObfuscatedName("ix.bs")
    public int field3532 = 0;

    @ObfuscatedName("ix.bc")
    public class188 field3533;

    @ObfuscatedName("ix.bv")
    public boolean field3488 = false;

    @ObfuscatedName("ix.bw")
    public int field3515 = -1;

    @ObfuscatedName("ix.bx")
    public int field3505 = -1;

    @ObfuscatedName("ix.br")
    public int field3537 = -1;

    @ObfuscatedName("ix.by")
    public int field3498 = -1;

    @ObfuscatedName("fl.i(IB)Lix;")
    public static class258 method2955(int arg0) {
        class258 var1 = (class258) field3536.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1784.method3824(10, arg0);
        class258 var3 = new class258();
        var3.field3492 = arg0;
        if (var2 != null) {
            var3.method4228(new class175(var2));
        }
        var3.method4227();
        if (var3.field3486 != -1) {
            var3.method4233(method2955(var3.field3486), method2955(var3.field3525));
        }
        if (var3.field3505 != -1) {
            var3.method4287(method2955(var3.field3505), method2955(var3.field3515));
        }
        if (var3.field3498 != -1) {
            var3.method4248(method2955(var3.field3498), method2955(var3.field3537));
        }
        if (!Statics.field14 && var3.field3507) {
            var3.field3494 = class227.field3076;
            var3.field3488 = false;
            var3.field3534 = null;
            var3.field3509 = null;
            var3.field3510 = -1;
            var3.field3532 = 0;
            if (var3.field3533 != null) {
                boolean var4 = false;
                for (class194 var5 = var3.field3533.method3321(); var5 != null; var5 = var3.field3533.method3327()) {
                    class253 var6 = Statics.method661((int) var5.field2475);
                    if (var6.field3392) {
                        var5.method3397();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3533 = null;
                }
            }
        }
        field3536.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.j(I)V")
    public void method4227() {
    }

    @ObfuscatedName("ix.a(Lfp;B)V")
    public void method4228(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4256(arg0, var2);
        }
    }

    @ObfuscatedName("ix.r(Lfp;II)V")
    public void method4256(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3526 = arg0.method2995();
        } else if (arg1 == 2) {
            this.field3494 = arg0.method3002();
        } else if (arg1 == 4) {
            this.field3508 = arg0.method2995();
        } else if (arg1 == 5) {
            this.field3500 = arg0.method2995();
        } else if (arg1 == 6) {
            this.field3485 = arg0.method2995();
        } else if (arg1 == 7) {
            this.field3503 = arg0.method2995();
            if (this.field3503 > 32767) {
                this.field3503 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3504 = arg0.method2995();
            if (this.field3504 > 32767) {
                this.field3504 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3491 = 1;
        } else if (arg1 == 12) {
            this.field3506 = arg0.method2998();
        } else if (arg1 == 16) {
            this.field3507 = true;
        } else if (arg1 == 23) {
            this.field3511 = arg0.method2995();
            this.field3513 = arg0.method2999();
        } else if (arg1 == 24) {
            this.field3512 = arg0.method2995();
        } else if (arg1 == 25) {
            this.field3493 = arg0.method2995();
            this.field3516 = arg0.method2999();
        } else if (arg1 == 26) {
            this.field3538 = arg0.method2995();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3534[arg1 - 30] = arg0.method3002();
            if (this.field3534[arg1 - 30].equalsIgnoreCase(class227.field2861)) {
                this.field3534[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3509[arg1 - 35] = arg0.method3002();
        } else if (arg1 == 40) {
            int var3 = arg0.method2999();
            this.field3495 = new short[var3];
            this.field3496 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3495[var4] = (short) arg0.method2995();
                this.field3496[var4] = (short) arg0.method2995();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2999();
            this.field3497 = new short[var5];
            this.field3535 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3497[var6] = (short) arg0.method2995();
                this.field3535[var6] = (short) arg0.method2995();
            }
        } else if (arg1 == 42) {
            this.field3510 = arg0.method3172();
        } else if (arg1 == 65) {
            this.field3488 = true;
        } else if (arg1 == 78) {
            this.field3517 = arg0.method2995();
        } else if (arg1 == 79) {
            this.field3530 = arg0.method2995();
        } else if (arg1 == 90) {
            this.field3519 = arg0.method2995();
        } else if (arg1 == 91) {
            this.field3521 = arg0.method2995();
        } else if (arg1 == 92) {
            this.field3520 = arg0.method2995();
        } else if (arg1 == 93) {
            this.field3522 = arg0.method2995();
        } else if (arg1 == 95) {
            this.field3502 = arg0.method2995();
        } else if (arg1 == 97) {
            this.field3525 = arg0.method2995();
        } else if (arg1 == 98) {
            this.field3486 = arg0.method2995();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3523 == null) {
                this.field3523 = new int[10];
                this.field3524 = new int[10];
            }
            this.field3523[arg1 - 100] = arg0.method2995();
            this.field3524[arg1 - 100] = arg0.method2995();
        } else if (arg1 == 110) {
            this.field3527 = arg0.method2995();
        } else if (arg1 == 111) {
            this.field3528 = arg0.method2995();
        } else if (arg1 == 112) {
            this.field3529 = arg0.method2995();
        } else if (arg1 == 113) {
            this.field3499 = arg0.method3172();
        } else if (arg1 == 114) {
            this.field3531 = arg0.method3172();
        } else if (arg1 == 115) {
            this.field3532 = arg0.method2999();
        } else if (arg1 == 139) {
            this.field3515 = arg0.method2995();
        } else if (arg1 == 140) {
            this.field3505 = arg0.method2995();
        } else if (arg1 == 148) {
            this.field3537 = arg0.method2995();
        } else if (arg1 == 149) {
            this.field3498 = arg0.method2995();
        } else if (arg1 == 249) {
            this.field3533 = class251.method475(arg0, this.field3533);
        }
    }

    @ObfuscatedName("ix.o(Lix;Lix;I)V")
    public void method4233(class258 arg0, class258 arg1) {
        this.field3526 = arg0.field3526;
        this.field3508 = arg0.field3508;
        this.field3500 = arg0.field3500;
        this.field3485 = arg0.field3485;
        this.field3502 = arg0.field3502;
        this.field3503 = arg0.field3503;
        this.field3504 = arg0.field3504;
        this.field3495 = arg0.field3495;
        this.field3496 = arg0.field3496;
        this.field3497 = arg0.field3497;
        this.field3535 = arg0.field3535;
        this.field3494 = arg1.field3494;
        this.field3507 = arg1.field3507;
        this.field3506 = arg1.field3506;
        this.field3491 = 1;
    }

    @ObfuscatedName("ix.n(Lix;Lix;B)V")
    public void method4287(class258 arg0, class258 arg1) {
        this.field3526 = arg0.field3526;
        this.field3508 = arg0.field3508;
        this.field3500 = arg0.field3500;
        this.field3485 = arg0.field3485;
        this.field3502 = arg0.field3502;
        this.field3503 = arg0.field3503;
        this.field3504 = arg0.field3504;
        this.field3495 = arg1.field3495;
        this.field3496 = arg1.field3496;
        this.field3497 = arg1.field3497;
        this.field3535 = arg1.field3535;
        this.field3494 = arg1.field3494;
        this.field3507 = arg1.field3507;
        this.field3491 = arg1.field3491;
        this.field3511 = arg1.field3511;
        this.field3512 = arg1.field3512;
        this.field3517 = arg1.field3517;
        this.field3493 = arg1.field3493;
        this.field3538 = arg1.field3538;
        this.field3530 = arg1.field3530;
        this.field3519 = arg1.field3519;
        this.field3520 = arg1.field3520;
        this.field3521 = arg1.field3521;
        this.field3522 = arg1.field3522;
        this.field3532 = arg1.field3532;
        this.field3534 = arg1.field3534;
        this.field3509 = new String[5];
        if (arg1.field3509 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3509[var3] = arg1.field3509[var3];
            }
        }
        this.field3509[4] = class227.field2866;
        this.field3506 = 0;
    }

    @ObfuscatedName("ix.q(Lix;Lix;I)V")
    public void method4248(class258 arg0, class258 arg1) {
        this.field3526 = arg0.field3526;
        this.field3508 = arg0.field3508;
        this.field3500 = arg0.field3500;
        this.field3485 = arg0.field3485;
        this.field3502 = arg0.field3502;
        this.field3503 = arg0.field3503;
        this.field3504 = arg0.field3504;
        this.field3495 = arg0.field3495;
        this.field3496 = arg0.field3496;
        this.field3497 = arg0.field3497;
        this.field3535 = arg0.field3535;
        this.field3491 = arg0.field3491;
        this.field3494 = arg1.field3494;
        this.field3506 = 0;
        this.field3507 = false;
        this.field3488 = false;
    }

    @ObfuscatedName("ix.b(IS)Lde;")
    public final class127 method4231(int arg0) {
        if (this.field3523 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3524[var3] && this.field3524[var3] != 0) {
                    var2 = this.field3523[var3];
                }
            }
            if (var2 != -1) {
                return method2955(var2).method4231(1);
            }
        }
        class127 var4 = class127.method2209(Statics.field1379, this.field3526, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3527 != 128 || this.field3528 != 128 || this.field3529 != 128) {
            var4.method2261(this.field3527, this.field3528, this.field3529);
        }
        if (this.field3495 != null) {
            for (int var5 = 0; var5 < this.field3495.length; var5++) {
                var4.method2258(this.field3495[var5], this.field3496[var5]);
            }
        }
        if (this.field3497 != null) {
            for (int var6 = 0; var6 < this.field3497.length; var6++) {
                var4.method2260(this.field3497[var6], this.field3535[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.k(IS)Lem;")
    public final class133 method4229(int arg0) {
        if (this.field3523 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3524[var3] && this.field3524[var3] != 0) {
                    var2 = this.field3523[var3];
                }
            }
            if (var2 != -1) {
                return method2955(var2).method4229(1);
            }
        }
        class133 var4 = (class133) field3489.method3347((long) this.field3492);
        if (var4 != null) {
            return var4;
        }
        class127 var5 = class127.method2209(Statics.field1379, this.field3526, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3527 != 128 || this.field3528 != 128 || this.field3529 != 128) {
            var5.method2261(this.field3527, this.field3528, this.field3529);
        }
        if (this.field3495 != null) {
            for (int var6 = 0; var6 < this.field3495.length; var6++) {
                var5.method2258(this.field3495[var6], this.field3496[var6]);
            }
        }
        if (this.field3497 != null) {
            for (int var7 = 0; var7 < this.field3497.length; var7++) {
                var5.method2260(this.field3497[var7], this.field3535[var7]);
            }
        }
        class133 var8 = var5.method2264(this.field3499 + 64, this.field3531 * 5 + 768, -50, -10, -50);
        var8.field1958 = true;
        field3489.method3346(var8, (long) this.field3492);
        return var8;
    }

    @ObfuscatedName("ix.s(IB)Lix;")
    public class258 method4234(int arg0) {
        if (this.field3523 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3524[var3] && this.field3524[var3] != 0) {
                    var2 = this.field3523[var3];
                }
            }
            if (var2 != -1) {
                return method2955(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ab.d(IIIIIZI)Lkd;")
    public static final class287 method263(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class287 var8 = (class287) field3501.method3347(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class258 var9 = method2955(arg0);
        if (arg1 > 1 && var9.field3523 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3524[var11] && var9.field3524[var11] != 0) {
                    var10 = var9.field3523[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2955(var10);
            }
        }
        class133 var12 = var9.method4229(1);
        if (var12 == null) {
            return null;
        }
        class287 var13 = null;
        if (var9.field3486 != -1) {
            var13 = method263(var9.field3525, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3505 != -1) {
            var13 = method263(var9.field3515, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3498 != -1) {
            var13 = method263(var9.field3537, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3762;
        int var15 = Statics.field3761;
        int var16 = Statics.field3764;
        int[] var17 = new int[4];
        class283.method4566(var17);
        class287 var18 = new class287(36, 32);
        class283.method4547(var18.field3787, 36, 32);
        class283.method4553();
        class136.method2411();
        class136.method2414(16, 16);
        class136.field2034 = false;
        if (var9.field3498 != -1) {
            var13.method4673(0, 0);
        }
        int var19 = var9.field3508;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class136.field2045[var9.field3500] * var19 >> 16;
        int var21 = class136.field2029[var9.field3500] * var19 >> 16;
        var12.method2310();
        var12.method2323(0, var9.field3485, var9.field3502, var9.field3500, var9.field3503, var9.field3504 + var12.field2129 / 2 + var20, var9.field3504 + var21);
        if (var9.field3505 != -1) {
            var13.method4673(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4687(1);
        }
        if (arg2 >= 2) {
            var18.method4687(16777215);
        }
        if (arg3 != 0) {
            var18.method4748(arg3);
        }
        class283.method4547(var18.field3787, 36, 32);
        if (var9.field3486 != -1) {
            var13.method4673(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3491 == 1) {
            Statics.field3490.method4440(method3817(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3501.method3346(var18, var6);
        }
        class283.method4547(var14, var15, var16);
        class283.method4584(var17);
        class136.method2411();
        class136.field2034 = true;
        return var18;
    }

    @ObfuscatedName("ha.l(IB)Ljava/lang/String;")
    public static final String method3817(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class227.field3023 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class227.field3021 + "</col>";
        }
    }

    @ObfuscatedName("ix.c(ZI)Z")
    public final boolean method4278(boolean arg0) {
        int var2 = this.field3511;
        int var3 = this.field3512;
        int var4 = this.field3517;
        if (arg0) {
            var2 = this.field3493;
            var3 = this.field3538;
            var4 = this.field3530;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1379.method3826(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1379.method3826(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1379.method3826(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ix.u(ZI)Lde;")
    public final class127 method4272(boolean arg0) {
        int var2 = this.field3511;
        int var3 = this.field3512;
        int var4 = this.field3517;
        if (arg0) {
            var2 = this.field3493;
            var3 = this.field3538;
            var4 = this.field3530;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var5 = class127.method2209(Statics.field1379, var2, 0);
        if (var3 != -1) {
            class127 var6 = class127.method2209(Statics.field1379, var3, 0);
            if (var4 == -1) {
                class127[] var9 = new class127[] { var5, var6 };
                var5 = new class127(var9, 2);
            } else {
                class127 var7 = class127.method2209(Statics.field1379, var4, 0);
                class127[] var8 = new class127[] { var5, var6, var7 };
                var5 = new class127(var8, 3);
            }
        }
        if (!arg0 && this.field3513 != 0) {
            var5.method2248(0, this.field3513, 0);
        }
        if (arg0 && this.field3516 != 0) {
            var5.method2248(0, this.field3516, 0);
        }
        if (this.field3495 != null) {
            for (int var10 = 0; var10 < this.field3495.length; var10++) {
                var5.method2258(this.field3495[var10], this.field3496[var10]);
            }
        }
        if (this.field3497 != null) {
            for (int var11 = 0; var11 < this.field3497.length; var11++) {
                var5.method2260(this.field3497[var11], this.field3535[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ix.e(ZB)Z")
    public final boolean method4237(boolean arg0) {
        int var2 = this.field3519;
        int var3 = this.field3520;
        if (arg0) {
            var2 = this.field3521;
            var3 = this.field3522;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1379.method3826(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1379.method3826(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ix.p(ZI)Lde;")
    public final class127 method4242(boolean arg0) {
        int var2 = this.field3519;
        int var3 = this.field3520;
        if (arg0) {
            var2 = this.field3521;
            var3 = this.field3522;
        }
        if (var2 == -1) {
            return null;
        }
        class127 var4 = class127.method2209(Statics.field1379, var2, 0);
        if (var3 != -1) {
            class127 var5 = class127.method2209(Statics.field1379, var3, 0);
            class127[] var6 = new class127[] { var4, var5 };
            var4 = new class127(var6, 2);
        }
        if (this.field3495 != null) {
            for (int var7 = 0; var7 < this.field3495.length; var7++) {
                var4.method2258(this.field3495[var7], this.field3496[var7]);
            }
        }
        if (this.field3497 != null) {
            for (int var8 = 0; var8 < this.field3497.length; var8++) {
                var4.method2260(this.field3497[var8], this.field3535[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.m(III)I")
    public int method4239(int arg0, int arg1) {
        return class251.method161(this.field3533, arg0, arg1);
    }

    @ObfuscatedName("ix.x(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4240(int arg0, String arg1) {
        return class251.method564(this.field3533, arg0, arg1);
    }

    @ObfuscatedName("ix.g(I)I")
    public int method4241() {
        if (this.field3510 == -1 || this.field3509 == null) {
            return -1;
        } else if (this.field3510 >= 0) {
            return this.field3509[this.field3510] == null ? -1 : this.field3510;
        } else if (class227.field3095.equalsIgnoreCase(this.field3509[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("n.w(I)V")
    public static void method14() {
        field3536.method3355();
        field3489.method3355();
        field3501.method3355();
    }

    @ObfuscatedName("aa.ar(I)V")
    public static void method486() {
        field3501.method3355();
    }

    @ObfuscatedName("x.ax(ZI)V")
    public static void method165(boolean arg0) {
        if (Statics.field14 != arg0) {
            method14();
            Statics.field14 = arg0;
        }
    }
}
