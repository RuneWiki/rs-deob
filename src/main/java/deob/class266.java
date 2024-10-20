package deob;

@ObfuscatedName("jv")
public class class266 extends class181 {

    @ObfuscatedName("jv.x")
    public static class146 field3515 = new class146(64);

    @ObfuscatedName("jv.d")
    public static class146 field3478 = new class146(50);

    @ObfuscatedName("jv.k")
    public static class146 field3475 = new class146(200);

    @ObfuscatedName("jv.i")
    public int field3480;

    @ObfuscatedName("jv.a")
    public int field3481;

    @ObfuscatedName("jv.z")
    public String field3482 = class236.field2980;

    @ObfuscatedName("jv.j")
    public short[] field3483;

    @ObfuscatedName("jv.s")
    public short[] field3484;

    @ObfuscatedName("jv.t")
    public short[] field3507;

    @ObfuscatedName("jv.y")
    public short[] field3491;

    @ObfuscatedName("jv.h")
    public int field3487 = 2000;

    @ObfuscatedName("jv.b")
    public int field3488 = 0;

    @ObfuscatedName("jv.c")
    public int field3516 = 0;

    @ObfuscatedName("jv.r")
    public int field3490 = 0;

    @ObfuscatedName("jv.p")
    public int field3496 = 0;

    @ObfuscatedName("jv.v")
    public int field3492 = 0;

    @ObfuscatedName("jv.ag")
    public int field3493 = 0;

    @ObfuscatedName("jv.aq")
    public int field3494 = 1;

    @ObfuscatedName("jv.aj")
    public boolean field3495 = false;

    @ObfuscatedName("jv.av")
    public String[] field3509 = new String[] { null, null, class236.field2908, null, null };

    @ObfuscatedName("jv.ar")
    public String[] field3477 = new String[] { null, null, null, null, class236.field3136 };

    @ObfuscatedName("jv.ay")
    public int field3514 = -2;

    @ObfuscatedName("jv.ah")
    public int field3499 = -1;

    @ObfuscatedName("jv.ak")
    public int field3473 = -1;

    @ObfuscatedName("jv.aw")
    public int field3501 = 0;

    @ObfuscatedName("jv.al")
    public int field3511 = -1;

    @ObfuscatedName("jv.ab")
    public int field3503 = -1;

    @ObfuscatedName("jv.ae")
    public int field3479 = 0;

    @ObfuscatedName("jv.at")
    public int field3505 = -1;

    @ObfuscatedName("jv.ad")
    public int field3506 = -1;

    @ObfuscatedName("jv.ap")
    public int field3498 = -1;

    @ObfuscatedName("jv.as")
    public int field3508 = -1;

    @ObfuscatedName("jv.am")
    public int field3522 = -1;

    @ObfuscatedName("jv.an")
    public int field3510 = -1;

    @ObfuscatedName("jv.az")
    public int[] field3525;

    @ObfuscatedName("jv.au")
    public int[] field3485;

    @ObfuscatedName("jv.ao")
    public int field3513 = -1;

    @ObfuscatedName("jv.aa")
    public int field3476 = -1;

    @ObfuscatedName("jv.ax")
    public int field3502 = 128;

    @ObfuscatedName("jv.af")
    public int field3497 = 128;

    @ObfuscatedName("jv.ai")
    public int field3517 = 128;

    @ObfuscatedName("jv.ba")
    public int field3518 = 0;

    @ObfuscatedName("jv.bb")
    public int field3519 = 0;

    @ObfuscatedName("jv.bs")
    public int field3520 = 0;

    @ObfuscatedName("jv.bq")
    public class317 field3521;

    @ObfuscatedName("jv.bn")
    public boolean field3489 = false;

    @ObfuscatedName("jv.bk")
    public int field3523 = -1;

    @ObfuscatedName("jv.bd")
    public int field3524 = -1;

    @ObfuscatedName("jv.bc")
    public int field3472 = -1;

    @ObfuscatedName("jv.bo")
    public int field3504 = -1;

    @ObfuscatedName("hc.m(II)Ljv;")
    public static class266 method4129(int arg0) {
        class266 var1 = (class266) field3515.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3512.method4156(10, arg0);
        class266 var3 = new class266();
        var3.field3480 = arg0;
        if (var2 != null) {
            var3.method4696(new class202(var2));
        }
        var3.method4645();
        if (var3.field3476 != -1) {
            var3.method4684(method4129(var3.field3476), method4129(var3.field3513));
        }
        if (var3.field3524 != -1) {
            var3.method4649(method4129(var3.field3524), method4129(var3.field3523));
        }
        if (var3.field3504 != -1) {
            var3.method4650(method4129(var3.field3504), method4129(var3.field3472));
        }
        if (!Statics.field250 && var3.field3495) {
            var3.field3482 = class236.field3066;
            var3.field3489 = false;
            var3.field3509 = null;
            var3.field3477 = null;
            var3.field3514 = -1;
            var3.field3520 = 0;
            if (var3.field3521 != null) {
                boolean var4 = false;
                for (class186 var5 = var3.field3521.method5385(); var5 != null; var5 = var3.field3521.method5397()) {
                    class261 var6 = class261.method4106((int) var5.field2139);
                    if (var6.field3382) {
                        var5.method3306();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3521 = null;
                }
            }
        }
        field3515.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.f(I)V")
    public void method4645() {
    }

    @ObfuscatedName("jv.q(Lgr;I)V")
    public void method4696(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4647(arg0, var2);
        }
    }

    @ObfuscatedName("jv.w(Lgr;II)V")
    public void method4647(class202 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3481 = arg0.method3530();
        } else if (arg1 == 2) {
            this.field3482 = arg0.method3426();
        } else if (arg1 == 4) {
            this.field3487 = arg0.method3530();
        } else if (arg1 == 5) {
            this.field3488 = arg0.method3530();
        } else if (arg1 == 6) {
            this.field3516 = arg0.method3530();
        } else if (arg1 == 7) {
            this.field3496 = arg0.method3530();
            if (this.field3496 > 32767) {
                this.field3496 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3492 = arg0.method3530();
            if (this.field3492 > 32767) {
                this.field3492 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3493 = 1;
        } else if (arg1 == 12) {
            this.field3494 = arg0.method3620();
        } else if (arg1 == 16) {
            this.field3495 = true;
        } else if (arg1 == 23) {
            this.field3499 = arg0.method3530();
            this.field3501 = arg0.method3551();
        } else if (arg1 == 24) {
            this.field3473 = arg0.method3530();
        } else if (arg1 == 25) {
            this.field3511 = arg0.method3530();
            this.field3479 = arg0.method3551();
        } else if (arg1 == 26) {
            this.field3503 = arg0.method3530();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3509[arg1 - 30] = arg0.method3426();
            if (this.field3509[arg1 - 30].equalsIgnoreCase(class236.field2844)) {
                this.field3509[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3477[arg1 - 35] = arg0.method3426();
        } else if (arg1 == 40) {
            int var3 = arg0.method3551();
            this.field3483 = new short[var3];
            this.field3484 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3483[var4] = (short) arg0.method3530();
                this.field3484[var4] = (short) arg0.method3530();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3551();
            this.field3507 = new short[var5];
            this.field3491 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3507[var6] = (short) arg0.method3530();
                this.field3491[var6] = (short) arg0.method3530();
            }
        } else if (arg1 == 42) {
            this.field3514 = arg0.method3537();
        } else if (arg1 == 65) {
            this.field3489 = true;
        } else if (arg1 == 78) {
            this.field3505 = arg0.method3530();
        } else if (arg1 == 79) {
            this.field3506 = arg0.method3530();
        } else if (arg1 == 90) {
            this.field3498 = arg0.method3530();
        } else if (arg1 == 91) {
            this.field3522 = arg0.method3530();
        } else if (arg1 == 92) {
            this.field3508 = arg0.method3530();
        } else if (arg1 == 93) {
            this.field3510 = arg0.method3530();
        } else if (arg1 == 95) {
            this.field3490 = arg0.method3530();
        } else if (arg1 == 97) {
            this.field3513 = arg0.method3530();
        } else if (arg1 == 98) {
            this.field3476 = arg0.method3530();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3525 == null) {
                this.field3525 = new int[10];
                this.field3485 = new int[10];
            }
            this.field3525[arg1 - 100] = arg0.method3530();
            this.field3485[arg1 - 100] = arg0.method3530();
        } else if (arg1 == 110) {
            this.field3502 = arg0.method3530();
        } else if (arg1 == 111) {
            this.field3497 = arg0.method3530();
        } else if (arg1 == 112) {
            this.field3517 = arg0.method3530();
        } else if (arg1 == 113) {
            this.field3518 = arg0.method3537();
        } else if (arg1 == 114) {
            this.field3519 = arg0.method3537() * 5;
        } else if (arg1 == 115) {
            this.field3520 = arg0.method3551();
        } else if (arg1 == 139) {
            this.field3523 = arg0.method3530();
        } else if (arg1 == 140) {
            this.field3524 = arg0.method3530();
        } else if (arg1 == 148) {
            this.field3472 = arg0.method3530();
        } else if (arg1 == 149) {
            this.field3504 = arg0.method3530();
        } else if (arg1 == 249) {
            this.field3521 = Statics.method4176(arg0, this.field3521);
        }
    }

    @ObfuscatedName("jv.o(Ljv;Ljv;I)V")
    public void method4684(class266 arg0, class266 arg1) {
        this.field3481 = arg0.field3481;
        this.field3487 = arg0.field3487;
        this.field3488 = arg0.field3488;
        this.field3516 = arg0.field3516;
        this.field3490 = arg0.field3490;
        this.field3496 = arg0.field3496;
        this.field3492 = arg0.field3492;
        this.field3483 = arg0.field3483;
        this.field3484 = arg0.field3484;
        this.field3507 = arg0.field3507;
        this.field3491 = arg0.field3491;
        this.field3482 = arg1.field3482;
        this.field3495 = arg1.field3495;
        this.field3494 = arg1.field3494;
        this.field3493 = 1;
    }

    @ObfuscatedName("jv.u(Ljv;Ljv;I)V")
    public void method4649(class266 arg0, class266 arg1) {
        this.field3481 = arg0.field3481;
        this.field3487 = arg0.field3487;
        this.field3488 = arg0.field3488;
        this.field3516 = arg0.field3516;
        this.field3490 = arg0.field3490;
        this.field3496 = arg0.field3496;
        this.field3492 = arg0.field3492;
        this.field3483 = arg1.field3483;
        this.field3484 = arg1.field3484;
        this.field3507 = arg1.field3507;
        this.field3491 = arg1.field3491;
        this.field3482 = arg1.field3482;
        this.field3495 = arg1.field3495;
        this.field3493 = arg1.field3493;
        this.field3499 = arg1.field3499;
        this.field3473 = arg1.field3473;
        this.field3505 = arg1.field3505;
        this.field3511 = arg1.field3511;
        this.field3503 = arg1.field3503;
        this.field3506 = arg1.field3506;
        this.field3498 = arg1.field3498;
        this.field3508 = arg1.field3508;
        this.field3522 = arg1.field3522;
        this.field3510 = arg1.field3510;
        this.field3520 = arg1.field3520;
        this.field3509 = arg1.field3509;
        this.field3477 = new String[5];
        if (arg1.field3477 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3477[var3] = arg1.field3477[var3];
            }
        }
        this.field3477[4] = class236.field2848;
        this.field3494 = 0;
    }

    @ObfuscatedName("jv.g(Ljv;Ljv;I)V")
    public void method4650(class266 arg0, class266 arg1) {
        this.field3481 = arg0.field3481;
        this.field3487 = arg0.field3487;
        this.field3488 = arg0.field3488;
        this.field3516 = arg0.field3516;
        this.field3490 = arg0.field3490;
        this.field3496 = arg0.field3496;
        this.field3492 = arg0.field3492;
        this.field3483 = arg0.field3483;
        this.field3484 = arg0.field3484;
        this.field3507 = arg0.field3507;
        this.field3491 = arg0.field3491;
        this.field3493 = arg0.field3493;
        this.field3482 = arg1.field3482;
        this.field3494 = 0;
        this.field3495 = false;
        this.field3489 = false;
    }

    @ObfuscatedName("jv.l(II)Ldw;")
    public final class122 method4651(int arg0) {
        if (this.field3525 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3485[var3] && this.field3485[var3] != 0) {
                    var2 = this.field3525[var3];
                }
            }
            if (var2 != -1) {
                return method4129(var2).method4651(1);
            }
        }
        class122 var4 = class122.method2537(Statics.field3500, this.field3481, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3502 != 128 || this.field3497 != 128 || this.field3517 != 128) {
            var4.method2539(this.field3502, this.field3497, this.field3517);
        }
        if (this.field3483 != null) {
            for (int var5 = 0; var5 < this.field3483.length; var5++) {
                var4.method2538(this.field3483[var5], this.field3484[var5]);
            }
        }
        if (this.field3507 != null) {
            for (int var6 = 0; var6 < this.field3507.length; var6++) {
                var4.method2543(this.field3507[var6], this.field3491[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jv.e(II)Ldu;")
    public final class128 method4667(int arg0) {
        if (this.field3525 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3485[var3] && this.field3485[var3] != 0) {
                    var2 = this.field3525[var3];
                }
            }
            if (var2 != -1) {
                return method4129(var2).method4667(1);
            }
        }
        class128 var4 = (class128) field3478.method3011((long) this.field3480);
        if (var4 != null) {
            return var4;
        }
        class122 var5 = class122.method2537(Statics.field3500, this.field3481, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3502 != 128 || this.field3497 != 128 || this.field3517 != 128) {
            var5.method2539(this.field3502, this.field3497, this.field3517);
        }
        if (this.field3483 != null) {
            for (int var6 = 0; var6 < this.field3483.length; var6++) {
                var5.method2538(this.field3483[var6], this.field3484[var6]);
            }
        }
        if (this.field3507 != null) {
            for (int var7 = 0; var7 < this.field3507.length; var7++) {
                var5.method2543(this.field3507[var7], this.field3491[var7]);
            }
        }
        class128 var8 = var5.method2572(this.field3518 + 64, this.field3519 + 768, -50, -10, -50);
        var8.field1644 = true;
        field3478.method3009(var8, (long) this.field3480);
        return var8;
    }

    @ObfuscatedName("jv.x(IB)Ljv;")
    public class266 method4653(int arg0) {
        if (this.field3525 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3485[var3] && this.field3485[var3] != 0) {
                    var2 = this.field3525[var3];
                }
            }
            if (var2 != -1) {
                return method4129(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ht.d(IIIIIZI)Lln;")
    public static final class328 method4051(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class328 var8 = (class328) field3475.method3011(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class266 var9 = method4129(arg0);
        if (arg1 > 1 && var9.field3525 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3485[var11] && var9.field3485[var11] != 0) {
                    var10 = var9.field3525[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4129(var10);
            }
        }
        class128 var12 = var9.method4667(1);
        if (var12 == null) {
            return null;
        }
        class328 var13 = null;
        if (var9.field3476 != -1) {
            var13 = method4051(var9.field3513, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3524 != -1) {
            var13 = method4051(var9.field3523, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3504 != -1) {
            var13 = method4051(var9.field3472, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3871;
        int var15 = Statics.field3873;
        int var16 = Statics.field3874;
        int[] var17 = new int[4];
        class324.method5476(var17);
        class328 var18 = new class328(36, 32);
        class324.method5473(var18.field3900, 36, 32);
        class324.method5464();
        class131.method2766();
        class131.method2738(16, 16);
        class131.field1737 = false;
        if (var9.field3504 != -1) {
            var13.method5584(0, 0);
        }
        int var19 = var9.field3487;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class131.field1757[var9.field3488] * var19 >> 16;
        int var21 = class131.field1760[var9.field3488] * var19 >> 16;
        var12.method2659();
        var12.method2636(0, var9.field3516, var9.field3490, var9.field3488, var9.field3496, var9.field3492 + var12.field1851 / 2 + var20, var9.field3492 + var21);
        if (var9.field3524 != -1) {
            var13.method5584(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5582(1);
        }
        if (arg2 >= 2) {
            var18.method5582(16777215);
        }
        if (arg3 != 0) {
            var18.method5580(arg3);
        }
        class324.method5473(var18.field3900, 36, 32);
        if (var9.field3476 != -1) {
            var13.method5584(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3493 == 1) {
            Statics.field2462.method5207(method3384(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3475.method3009(var18, var6);
        }
        class324.method5473(var14, var15, var16);
        class324.method5463(var17);
        class131.method2766();
        class131.field1737 = true;
        return var18;
    }

    @ObfuscatedName("gy.a(II)Ljava/lang/String;")
    public static final String method3384(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class236.field2883 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class236.field3092 + "</col>";
        }
    }

    @ObfuscatedName("jv.z(ZI)Z")
    public final boolean method4654(boolean arg0) {
        int var2 = this.field3499;
        int var3 = this.field3473;
        int var4 = this.field3505;
        if (arg0) {
            var2 = this.field3511;
            var3 = this.field3503;
            var4 = this.field3506;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3500.method4158(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3500.method4158(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3500.method4158(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jv.j(ZB)Ldw;")
    public final class122 method4655(boolean arg0) {
        int var2 = this.field3499;
        int var3 = this.field3473;
        int var4 = this.field3505;
        if (arg0) {
            var2 = this.field3511;
            var3 = this.field3503;
            var4 = this.field3506;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var5 = class122.method2537(Statics.field3500, var2, 0);
        if (var3 != -1) {
            class122 var6 = class122.method2537(Statics.field3500, var3, 0);
            if (var4 == -1) {
                class122[] var9 = new class122[] { var5, var6 };
                var5 = new class122(var9, 2);
            } else {
                class122 var7 = class122.method2537(Statics.field3500, var4, 0);
                class122[] var8 = new class122[] { var5, var6, var7 };
                var5 = new class122(var8, 3);
            }
        }
        if (!arg0 && this.field3501 != 0) {
            var5.method2541(0, this.field3501, 0);
        }
        if (arg0 && this.field3479 != 0) {
            var5.method2541(0, this.field3479, 0);
        }
        if (this.field3483 != null) {
            for (int var10 = 0; var10 < this.field3483.length; var10++) {
                var5.method2538(this.field3483[var10], this.field3484[var10]);
            }
        }
        if (this.field3507 != null) {
            for (int var11 = 0; var11 < this.field3507.length; var11++) {
                var5.method2543(this.field3507[var11], this.field3491[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jv.s(ZI)Z")
    public final boolean method4656(boolean arg0) {
        int var2 = this.field3498;
        int var3 = this.field3508;
        if (arg0) {
            var2 = this.field3522;
            var3 = this.field3510;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3500.method4158(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3500.method4158(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jv.t(ZI)Ldw;")
    public final class122 method4670(boolean arg0) {
        int var2 = this.field3498;
        int var3 = this.field3508;
        if (arg0) {
            var2 = this.field3522;
            var3 = this.field3510;
        }
        if (var2 == -1) {
            return null;
        }
        class122 var4 = class122.method2537(Statics.field3500, var2, 0);
        if (var3 != -1) {
            class122 var5 = class122.method2537(Statics.field3500, var3, 0);
            class122[] var6 = new class122[] { var4, var5 };
            var4 = new class122(var6, 2);
        }
        if (this.field3483 != null) {
            for (int var7 = 0; var7 < this.field3483.length; var7++) {
                var4.method2538(this.field3483[var7], this.field3484[var7]);
            }
        }
        if (this.field3507 != null) {
            for (int var8 = 0; var8 < this.field3507.length; var8++) {
                var4.method2543(this.field3507[var8], this.field3491[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jv.y(IIS)I")
    public int method4658(int arg0, int arg1) {
        class317 var3 = this.field3521;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class185 var5 = (class185) var3.method5382((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2138;
            }
        }
        return var4;
    }

    @ObfuscatedName("jv.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4659(int arg0, String arg1) {
        return class259.method2980(this.field3521, arg0, arg1);
    }

    @ObfuscatedName("jv.b(I)I")
    public int method4660() {
        if (this.field3514 == -1 || this.field3477 == null) {
            return -1;
        } else if (this.field3514 >= 0) {
            return this.field3477[this.field3514] == null ? -1 : this.field3514;
        } else if (class236.field3136.equalsIgnoreCase(this.field3477[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("bp.c(I)V")
    public static void method1615() {
        field3515.method3010();
        field3478.method3010();
        field3475.method3010();
    }

    @ObfuscatedName("jr.p(B)V")
    public static void method4627() {
        field3475.method3010();
    }
}
