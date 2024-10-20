package deob;

@ObfuscatedName("ix")
public class class257 extends class195 {

    @ObfuscatedName("ix.r")
    public static class190 field3472 = new class190(64);

    @ObfuscatedName("ix.g")
    public static class190 field3476 = new class190(50);

    @ObfuscatedName("ix.s")
    public static class190 field3474 = new class190(200);

    @ObfuscatedName("ix.p")
    public int field3475;

    @ObfuscatedName("ix.u")
    public int field3473;

    @ObfuscatedName("ix.b")
    public String field3477 = "null";

    @ObfuscatedName("ix.w")
    public short[] field3478;

    @ObfuscatedName("ix.k")
    public short[] field3514;

    @ObfuscatedName("ix.n")
    public short[] field3480;

    @ObfuscatedName("ix.c")
    public short[] field3481;

    @ObfuscatedName("ix.l")
    public int field3466 = 2000;

    @ObfuscatedName("ix.m")
    public int field3483 = 0;

    @ObfuscatedName("ix.a")
    public int field3484 = 0;

    @ObfuscatedName("ix.h")
    public int field3485 = 0;

    @ObfuscatedName("ix.z")
    public int field3486 = 0;

    @ObfuscatedName("ix.j")
    public int field3487 = 0;

    @ObfuscatedName("ix.am")
    public int field3511 = 0;

    @ObfuscatedName("ix.ac")
    public int field3489 = 1;

    @ObfuscatedName("ix.ax")
    public boolean field3490 = false;

    @ObfuscatedName("ix.at")
    public String[] field3491 = new String[] { null, null, class226.field2835, null, null };

    @ObfuscatedName("ix.ag")
    public String[] field3492 = new String[] { null, null, null, null, class226.field3084 };

    @ObfuscatedName("ix.ae")
    public int field3488 = -2;

    @ObfuscatedName("ix.ai")
    public int field3493 = -1;

    @ObfuscatedName("ix.au")
    public int field3495 = -1;

    @ObfuscatedName("ix.ad")
    public int field3509 = 0;

    @ObfuscatedName("ix.ah")
    public int field3504 = -1;

    @ObfuscatedName("ix.ao")
    public int field3498 = -1;

    @ObfuscatedName("ix.av")
    public int field3499 = 0;

    @ObfuscatedName("ix.az")
    public int field3497 = -1;

    @ObfuscatedName("ix.aq")
    public int field3515 = -1;

    @ObfuscatedName("ix.ay")
    public int field3502 = -1;

    @ObfuscatedName("ix.an")
    public int field3503 = -1;

    @ObfuscatedName("ix.af")
    public int field3479 = -1;

    @ObfuscatedName("ix.aa")
    public int field3505 = -1;

    @ObfuscatedName("ix.ak")
    public int[] field3506;

    @ObfuscatedName("ix.as")
    public int[] field3507;

    @ObfuscatedName("ix.ap")
    public int field3508 = -1;

    @ObfuscatedName("ix.aw")
    public int field3500 = -1;

    @ObfuscatedName("ix.al")
    public int field3510 = 128;

    @ObfuscatedName("ix.ab")
    public int field3501 = 128;

    @ObfuscatedName("ix.aj")
    public int field3512 = 128;

    @ObfuscatedName("ix.bz")
    public int field3513 = 0;

    @ObfuscatedName("ix.bi")
    public int field3494 = 0;

    @ObfuscatedName("ix.bu")
    public int field3516 = 0;

    @ObfuscatedName("ix.bq")
    public class187 field3496;

    @ObfuscatedName("ix.bs")
    public boolean field3517 = false;

    @ObfuscatedName("ix.bv")
    public int field3518 = -1;

    @ObfuscatedName("ix.bh")
    public int field3519 = -1;

    @ObfuscatedName("ix.bx")
    public int field3520 = -1;

    @ObfuscatedName("ix.bn")
    public int field3521 = -1;

    @ObfuscatedName("fc.d(Lim;Lim;ZLjt;I)V")
    public static void method3111(class236 arg0, class236 arg1, boolean arg2, class264 arg3) {
        Statics.field3470 = arg0;
        Statics.field3471 = arg1;
        Statics.field489 = arg2;
        Statics.field1677 = Statics.field3470.method3761(10);
        Statics.field2552 = arg3;
    }

    @ObfuscatedName("ix.x(B)V")
    public void method4163() {
    }

    @ObfuscatedName("ix.y(Lfw;B)V")
    public void method4230(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4165(arg0, var2);
        }
    }

    @ObfuscatedName("ix.e(Lfw;II)V")
    public void method4165(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3473 = arg0.method2916();
        } else if (arg1 == 2) {
            this.field3477 = arg0.method2922();
        } else if (arg1 == 4) {
            this.field3466 = arg0.method2916();
        } else if (arg1 == 5) {
            this.field3483 = arg0.method2916();
        } else if (arg1 == 6) {
            this.field3484 = arg0.method2916();
        } else if (arg1 == 7) {
            this.field3486 = arg0.method2916();
            if (this.field3486 > 32767) {
                this.field3486 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3487 = arg0.method2916();
            if (this.field3487 > 32767) {
                this.field3487 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3511 = 1;
        } else if (arg1 == 12) {
            this.field3489 = arg0.method2935();
        } else if (arg1 == 16) {
            this.field3490 = true;
        } else if (arg1 == 23) {
            this.field3493 = arg0.method2916();
            this.field3509 = arg0.method2921();
        } else if (arg1 == 24) {
            this.field3495 = arg0.method2916();
        } else if (arg1 == 25) {
            this.field3504 = arg0.method2916();
            this.field3499 = arg0.method2921();
        } else if (arg1 == 26) {
            this.field3498 = arg0.method2916();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3491[arg1 - 30] = arg0.method2922();
            if (this.field3491[arg1 - 30].equalsIgnoreCase(class226.field2837)) {
                this.field3491[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3492[arg1 - 35] = arg0.method2922();
        } else if (arg1 == 40) {
            int var3 = arg0.method2921();
            this.field3478 = new short[var3];
            this.field3514 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3478[var4] = (short) arg0.method2916();
                this.field3514[var4] = (short) arg0.method2916();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2921();
            this.field3480 = new short[var5];
            this.field3481 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3480[var6] = (short) arg0.method2916();
                this.field3481[var6] = (short) arg0.method2916();
            }
        } else if (arg1 == 42) {
            this.field3488 = arg0.method3082();
        } else if (arg1 == 65) {
            this.field3517 = true;
        } else if (arg1 == 78) {
            this.field3497 = arg0.method2916();
        } else if (arg1 == 79) {
            this.field3515 = arg0.method2916();
        } else if (arg1 == 90) {
            this.field3502 = arg0.method2916();
        } else if (arg1 == 91) {
            this.field3479 = arg0.method2916();
        } else if (arg1 == 92) {
            this.field3503 = arg0.method2916();
        } else if (arg1 == 93) {
            this.field3505 = arg0.method2916();
        } else if (arg1 == 95) {
            this.field3485 = arg0.method2916();
        } else if (arg1 == 97) {
            this.field3508 = arg0.method2916();
        } else if (arg1 == 98) {
            this.field3500 = arg0.method2916();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3506 == null) {
                this.field3506 = new int[10];
                this.field3507 = new int[10];
            }
            this.field3506[arg1 - 100] = arg0.method2916();
            this.field3507[arg1 - 100] = arg0.method2916();
        } else if (arg1 == 110) {
            this.field3510 = arg0.method2916();
        } else if (arg1 == 111) {
            this.field3501 = arg0.method2916();
        } else if (arg1 == 112) {
            this.field3512 = arg0.method2916();
        } else if (arg1 == 113) {
            this.field3513 = arg0.method3082();
        } else if (arg1 == 114) {
            this.field3494 = arg0.method3082() * 5;
        } else if (arg1 == 115) {
            this.field3516 = arg0.method2921();
        } else if (arg1 == 139) {
            this.field3518 = arg0.method2916();
        } else if (arg1 == 140) {
            this.field3519 = arg0.method2916();
        } else if (arg1 == 148) {
            this.field3520 = arg0.method2916();
        } else if (arg1 == 149) {
            this.field3521 = arg0.method2916();
        } else if (arg1 == 249) {
            this.field3496 = class250.method2459(arg0, this.field3496);
        }
    }

    @ObfuscatedName("ix.f(Lix;Lix;I)V")
    public void method4181(class257 arg0, class257 arg1) {
        this.field3473 = arg0.field3473;
        this.field3466 = arg0.field3466;
        this.field3483 = arg0.field3483;
        this.field3484 = arg0.field3484;
        this.field3485 = arg0.field3485;
        this.field3486 = arg0.field3486;
        this.field3487 = arg0.field3487;
        this.field3478 = arg0.field3478;
        this.field3514 = arg0.field3514;
        this.field3480 = arg0.field3480;
        this.field3481 = arg0.field3481;
        this.field3477 = arg1.field3477;
        this.field3490 = arg1.field3490;
        this.field3489 = arg1.field3489;
        this.field3511 = 1;
    }

    @ObfuscatedName("ix.v(Lix;Lix;B)V")
    public void method4167(class257 arg0, class257 arg1) {
        this.field3473 = arg0.field3473;
        this.field3466 = arg0.field3466;
        this.field3483 = arg0.field3483;
        this.field3484 = arg0.field3484;
        this.field3485 = arg0.field3485;
        this.field3486 = arg0.field3486;
        this.field3487 = arg0.field3487;
        this.field3478 = arg1.field3478;
        this.field3514 = arg1.field3514;
        this.field3480 = arg1.field3480;
        this.field3481 = arg1.field3481;
        this.field3477 = arg1.field3477;
        this.field3490 = arg1.field3490;
        this.field3511 = arg1.field3511;
        this.field3493 = arg1.field3493;
        this.field3495 = arg1.field3495;
        this.field3497 = arg1.field3497;
        this.field3504 = arg1.field3504;
        this.field3498 = arg1.field3498;
        this.field3515 = arg1.field3515;
        this.field3502 = arg1.field3502;
        this.field3503 = arg1.field3503;
        this.field3479 = arg1.field3479;
        this.field3505 = arg1.field3505;
        this.field3516 = arg1.field3516;
        this.field3491 = arg1.field3491;
        this.field3492 = new String[5];
        if (arg1.field3492 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3492[var3] = arg1.field3492[var3];
            }
        }
        this.field3492[4] = class226.field3060;
        this.field3489 = 0;
    }

    @ObfuscatedName("ix.t(Lix;Lix;I)V")
    public void method4168(class257 arg0, class257 arg1) {
        this.field3473 = arg0.field3473;
        this.field3466 = arg0.field3466;
        this.field3483 = arg0.field3483;
        this.field3484 = arg0.field3484;
        this.field3485 = arg0.field3485;
        this.field3486 = arg0.field3486;
        this.field3487 = arg0.field3487;
        this.field3478 = arg0.field3478;
        this.field3514 = arg0.field3514;
        this.field3480 = arg0.field3480;
        this.field3481 = arg0.field3481;
        this.field3511 = arg0.field3511;
        this.field3477 = arg1.field3477;
        this.field3489 = 0;
        this.field3490 = false;
        this.field3517 = false;
    }

    @ObfuscatedName("ix.i(II)Ldk;")
    public final class128 method4169(int arg0) {
        if (this.field3506 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3507[var3] && this.field3507[var3] != 0) {
                    var2 = this.field3506[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method992(var2).method4169(1);
            }
        }
        class128 var4 = class128.method2238(Statics.field3471, this.field3473, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3510 != 128 || this.field3501 != 128 || this.field3512 != 128) {
            var4.method2192(this.field3510, this.field3501, this.field3512);
        }
        if (this.field3478 != null) {
            for (int var5 = 0; var5 < this.field3478.length; var5++) {
                var4.method2226(this.field3478[var5], this.field3514[var5]);
            }
        }
        if (this.field3480 != null) {
            for (int var6 = 0; var6 < this.field3480.length; var6++) {
                var4.method2190(this.field3480[var6], this.field3481[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.r(IS)Lev;")
    public final class134 method4170(int arg0) {
        if (this.field3506 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3507[var3] && this.field3507[var3] != 0) {
                    var2 = this.field3506[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method992(var2).method4170(1);
            }
        }
        class134 var4 = (class134) field3476.method3252((long) this.field3475);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2238(Statics.field3471, this.field3473, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3510 != 128 || this.field3501 != 128 || this.field3512 != 128) {
            var5.method2192(this.field3510, this.field3501, this.field3512);
        }
        if (this.field3478 != null) {
            for (int var6 = 0; var6 < this.field3478.length; var6++) {
                var5.method2226(this.field3478[var6], this.field3514[var6]);
            }
        }
        if (this.field3480 != null) {
            for (int var7 = 0; var7 < this.field3480.length; var7++) {
                var5.method2190(this.field3480[var7], this.field3481[var7]);
            }
        }
        class134 var8 = var5.method2246(this.field3513 + 64, this.field3494 + 768, -50, -10, -50);
        var8.field1903 = true;
        field3476.method3256(var8, (long) this.field3475);
        return var8;
    }

    @ObfuscatedName("ix.g(II)Lix;")
    public class257 method4196(int arg0) {
        if (this.field3506 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3507[var3] && this.field3507[var3] != 0) {
                    var2 = this.field3506[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method992(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("as.s(IIIIIZB)Lji;")
    public static final class286 method619(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class286 var8 = (class286) field3474.method3252(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = Statics.method992(arg0);
        if (arg1 > 1 && var9.field3506 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3507[var11] && var9.field3507[var11] != 0) {
                    var10 = var9.field3506[var11];
                }
            }
            if (var10 != -1) {
                var9 = Statics.method992(var10);
            }
        }
        class134 var12 = var9.method4170(1);
        if (var12 == null) {
            return null;
        }
        class286 var13 = null;
        if (var9.field3500 != -1) {
            var13 = method619(var9.field3508, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3519 != -1) {
            var13 = method619(var9.field3518, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3521 != -1) {
            var13 = method619(var9.field3520, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3744;
        int var15 = Statics.field3739;
        int var16 = Statics.field3738;
        int[] var17 = new int[4];
        class282.method4605(var17);
        class286 var18 = new class286(36, 32);
        class282.method4611(var18.field3767, 36, 32);
        class282.method4547();
        class137.method2366();
        class137.method2447(16, 16);
        class137.field1980 = false;
        if (var9.field3521 != -1) {
            var13.method4671(0, 0);
        }
        int var19 = var9.field3466;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field1997[var9.field3483] * var19 >> 16;
        int var21 = class137.field1992[var9.field3483] * var19 >> 16;
        var12.method2270();
        var12.method2283(0, var9.field3484, var9.field3485, var9.field3483, var9.field3486, var9.field3487 + var12.field2088 / 2 + var20, var9.field3487 + var21);
        if (var9.field3519 != -1) {
            var13.method4671(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4667(1);
        }
        if (arg2 >= 2) {
            var18.method4667(16777215);
        }
        if (arg3 != 0) {
            var18.method4668(arg3);
        }
        class282.method4611(var18.field3767, 36, 32);
        if (var9.field3500 != -1) {
            var13.method4671(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3511 == 1) {
            Statics.field2552.method4371(method1675(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3474.method3256(var18, var6);
        }
        class282.method4611(var14, var15, var16);
        class282.method4578(var17);
        class137.method2366();
        class137.field1980 = true;
        return var18;
    }

    @ObfuscatedName("ck.o(II)Ljava/lang/String;")
    public static final String method1675(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class226.field2840 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class226.field2996 + "</col>";
        }
    }

    @ObfuscatedName("ix.p(ZB)Z")
    public final boolean method4172(boolean arg0) {
        int var2 = this.field3493;
        int var3 = this.field3495;
        int var4 = this.field3497;
        if (arg0) {
            var2 = this.field3504;
            var3 = this.field3498;
            var4 = this.field3515;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3471.method3752(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3471.method3752(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3471.method3752(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ix.u(ZB)Ldk;")
    public final class128 method4173(boolean arg0) {
        int var2 = this.field3493;
        int var3 = this.field3495;
        int var4 = this.field3497;
        if (arg0) {
            var2 = this.field3504;
            var3 = this.field3498;
            var4 = this.field3515;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2238(Statics.field3471, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2238(Statics.field3471, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2238(Statics.field3471, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3509 != 0) {
            var5.method2188(0, this.field3509, 0);
        }
        if (arg0 && this.field3499 != 0) {
            var5.method2188(0, this.field3499, 0);
        }
        if (this.field3478 != null) {
            for (int var10 = 0; var10 < this.field3478.length; var10++) {
                var5.method2226(this.field3478[var10], this.field3514[var10]);
            }
        }
        if (this.field3480 != null) {
            for (int var11 = 0; var11 < this.field3480.length; var11++) {
                var5.method2190(this.field3480[var11], this.field3481[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ix.b(ZB)Z")
    public final boolean method4174(boolean arg0) {
        int var2 = this.field3502;
        int var3 = this.field3503;
        if (arg0) {
            var2 = this.field3479;
            var3 = this.field3505;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3471.method3752(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3471.method3752(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ix.w(ZI)Ldk;")
    public final class128 method4175(boolean arg0) {
        int var2 = this.field3502;
        int var3 = this.field3503;
        if (arg0) {
            var2 = this.field3479;
            var3 = this.field3505;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2238(Statics.field3471, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2238(Statics.field3471, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3478 != null) {
            for (int var7 = 0; var7 < this.field3478.length; var7++) {
                var4.method2226(this.field3478[var7], this.field3514[var7]);
            }
        }
        if (this.field3480 != null) {
            for (int var8 = 0; var8 < this.field3480.length; var8++) {
                var4.method2190(this.field3480[var8], this.field3481[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.k(IIB)I")
    public int method4176(int arg0, int arg1) {
        return class250.method720(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("ix.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4177(int arg0, String arg1) {
        return class250.method319(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("ix.h(S)I")
    public int method4220() {
        if (this.field3488 == -1 || this.field3492 == null) {
            return -1;
        } else if (this.field3488 >= 0) {
            return this.field3492[this.field3488] == null ? -1 : this.field3488;
        } else if (class226.field3084.equalsIgnoreCase(this.field3492[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hz.z(B)V")
    public static void method3737() {
        field3472.method3250();
        field3476.method3250();
        field3474.method3250();
    }

    @ObfuscatedName("a.j(ZB)V")
    public static void method149(boolean arg0) {
        if (Statics.field489 != arg0) {
            method3737();
            Statics.field489 = arg0;
        }
    }
}
