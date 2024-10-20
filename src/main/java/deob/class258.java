package deob;

@ObfuscatedName("if")
public class class258 extends class196 {

    @ObfuscatedName("if.b")
    public static class191 field3493 = new class191(64);

    @ObfuscatedName("if.o")
    public static class191 field3481 = new class191(50);

    @ObfuscatedName("if.m")
    public static class191 field3484 = new class191(200);

    @ObfuscatedName("if.s")
    public int field3527;

    @ObfuscatedName("if.r")
    public int field3523;

    @ObfuscatedName("if.e")
    public String field3487 = "null";

    @ObfuscatedName("if.a")
    public short[] field3482;

    @ObfuscatedName("if.v")
    public short[] field3489;

    @ObfuscatedName("if.t")
    public short[] field3490;

    @ObfuscatedName("if.y")
    public short[] field3491;

    @ObfuscatedName("if.z")
    public int field3511 = 2000;

    @ObfuscatedName("if.u")
    public int field3492 = 0;

    @ObfuscatedName("if.k")
    public int field3483 = 0;

    @ObfuscatedName("if.q")
    public int field3495 = 0;

    @ObfuscatedName("if.n")
    public int field3496 = 0;

    @ObfuscatedName("if.d")
    public int field3488 = 0;

    @ObfuscatedName("if.ax")
    public int field3498 = 0;

    @ObfuscatedName("if.ao")
    public int field3497 = 1;

    @ObfuscatedName("if.an")
    public boolean field3500 = false;

    @ObfuscatedName("if.ar")
    public String[] field3501 = new String[] { null, null, class227.field2852, null, null };

    @ObfuscatedName("if.ag")
    public String[] field3478 = new String[] { null, null, null, null, class227.field2853 };

    @ObfuscatedName("if.ab")
    public int field3503 = -2;

    @ObfuscatedName("if.aj")
    public int field3504 = -1;

    @ObfuscatedName("if.ae")
    public int field3505 = -1;

    @ObfuscatedName("if.at")
    public int field3506 = 0;

    @ObfuscatedName("if.as")
    public int field3507 = -1;

    @ObfuscatedName("if.af")
    public int field3512 = -1;

    @ObfuscatedName("if.au")
    public int field3502 = 0;

    @ObfuscatedName("if.az")
    public int field3510 = -1;

    @ObfuscatedName("if.al")
    public int field3522 = -1;

    @ObfuscatedName("if.am")
    public int field3485 = -1;

    @ObfuscatedName("if.ah")
    public int field3513 = -1;

    @ObfuscatedName("if.ap")
    public int field3514 = -1;

    @ObfuscatedName("if.ad")
    public int field3515 = -1;

    @ObfuscatedName("if.aa")
    public int[] field3516;

    @ObfuscatedName("if.aw")
    public int[] field3508;

    @ObfuscatedName("if.aq")
    public int field3518 = -1;

    @ObfuscatedName("if.ai")
    public int field3519 = -1;

    @ObfuscatedName("if.ak")
    public int field3520 = 128;

    @ObfuscatedName("if.ac")
    public int field3517 = 128;

    @ObfuscatedName("if.ay")
    public int field3494 = 128;

    @ObfuscatedName("if.bk")
    public int field3479 = 0;

    @ObfuscatedName("if.bi")
    public int field3524 = 0;

    @ObfuscatedName("if.ba")
    public int field3525 = 0;

    @ObfuscatedName("if.bn")
    public class188 field3526;

    @ObfuscatedName("if.by")
    public boolean field3509 = false;

    @ObfuscatedName("if.bc")
    public int field3528 = -1;

    @ObfuscatedName("if.bh")
    public int field3529 = -1;

    @ObfuscatedName("if.bw")
    public int field3530 = -1;

    @ObfuscatedName("if.bj")
    public int field3531 = -1;

    @ObfuscatedName("in.j(Lia;Lia;ZLjh;B)V")
    public static void method4005(class237 arg0, class237 arg1, boolean arg2, class265 arg3) {
        Statics.field328 = arg0;
        Statics.field20 = arg1;
        Statics.field3480 = arg2;
        Statics.field3521 = Statics.field328.method3784(10);
        Statics.field2434 = arg3;
    }

    @ObfuscatedName("dx.h(II)Lif;")
    public static class258 method1923(int arg0) {
        class258 var1 = (class258) field3493.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field328.method3773(10, arg0);
        class258 var3 = new class258();
        var3.field3527 = arg0;
        if (var2 != null) {
            var3.method4253(new class175(var2));
        }
        var3.method4288();
        if (var3.field3519 != -1) {
            var3.method4242(method1923(var3.field3519), method1923(var3.field3518));
        }
        if (var3.field3529 != -1) {
            var3.method4243(method1923(var3.field3529), method1923(var3.field3528));
        }
        if (var3.field3531 != -1) {
            var3.method4277(method1923(var3.field3531), method1923(var3.field3530));
        }
        if (!Statics.field3480 && var3.field3500) {
            var3.field3487 = class227.field2890;
            var3.field3509 = false;
            var3.field3501 = null;
            var3.field3478 = null;
            var3.field3503 = -1;
            var3.field3525 = 0;
            if (var3.field3526 != null) {
                boolean var4 = false;
                for (class194 var5 = var3.field3526.method3235(); var5 != null; var5 = var3.field3526.method3236()) {
                    class253 var6 = class253.method3764((int) var5.field2469);
                    if (var6.field3379) {
                        var5.method3314();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3526 = null;
                }
            }
        }
        field3493.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.f(I)V")
    public void method4288() {
    }

    @ObfuscatedName("if.p(Lfb;I)V")
    public void method4253(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4241(arg0, var2);
        }
    }

    @ObfuscatedName("if.x(Lfb;II)V")
    public void method4241(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3523 = arg0.method3023();
        } else if (arg1 == 2) {
            this.field3487 = arg0.method2911();
        } else if (arg1 == 4) {
            this.field3511 = arg0.method3023();
        } else if (arg1 == 5) {
            this.field3492 = arg0.method3023();
        } else if (arg1 == 6) {
            this.field3483 = arg0.method3023();
        } else if (arg1 == 7) {
            this.field3496 = arg0.method3023();
            if (this.field3496 > 32767) {
                this.field3496 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3488 = arg0.method3023();
            if (this.field3488 > 32767) {
                this.field3488 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3498 = 1;
        } else if (arg1 == 12) {
            this.field3497 = arg0.method2908();
        } else if (arg1 == 16) {
            this.field3500 = true;
        } else if (arg1 == 23) {
            this.field3504 = arg0.method3023();
            this.field3506 = arg0.method2903();
        } else if (arg1 == 24) {
            this.field3505 = arg0.method3023();
        } else if (arg1 == 25) {
            this.field3507 = arg0.method3023();
            this.field3502 = arg0.method2903();
        } else if (arg1 == 26) {
            this.field3512 = arg0.method3023();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3501[arg1 - 30] = arg0.method2911();
            if (this.field3501[arg1 - 30].equalsIgnoreCase(class227.field2979)) {
                this.field3501[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3478[arg1 - 35] = arg0.method2911();
        } else if (arg1 == 40) {
            int var3 = arg0.method2903();
            this.field3482 = new short[var3];
            this.field3489 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3482[var4] = (short) arg0.method3023();
                this.field3489[var4] = (short) arg0.method3023();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2903();
            this.field3490 = new short[var5];
            this.field3491 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3490[var6] = (short) arg0.method3023();
                this.field3491[var6] = (short) arg0.method3023();
            }
        } else if (arg1 == 42) {
            this.field3503 = arg0.method2980();
        } else if (arg1 == 65) {
            this.field3509 = true;
        } else if (arg1 == 78) {
            this.field3510 = arg0.method3023();
        } else if (arg1 == 79) {
            this.field3522 = arg0.method3023();
        } else if (arg1 == 90) {
            this.field3485 = arg0.method3023();
        } else if (arg1 == 91) {
            this.field3514 = arg0.method3023();
        } else if (arg1 == 92) {
            this.field3513 = arg0.method3023();
        } else if (arg1 == 93) {
            this.field3515 = arg0.method3023();
        } else if (arg1 == 95) {
            this.field3495 = arg0.method3023();
        } else if (arg1 == 97) {
            this.field3518 = arg0.method3023();
        } else if (arg1 == 98) {
            this.field3519 = arg0.method3023();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3516 == null) {
                this.field3516 = new int[10];
                this.field3508 = new int[10];
            }
            this.field3516[arg1 - 100] = arg0.method3023();
            this.field3508[arg1 - 100] = arg0.method3023();
        } else if (arg1 == 110) {
            this.field3520 = arg0.method3023();
        } else if (arg1 == 111) {
            this.field3517 = arg0.method3023();
        } else if (arg1 == 112) {
            this.field3494 = arg0.method3023();
        } else if (arg1 == 113) {
            this.field3479 = arg0.method2980();
        } else if (arg1 == 114) {
            this.field3524 = arg0.method2980() * 5;
        } else if (arg1 == 115) {
            this.field3525 = arg0.method2903();
        } else if (arg1 == 139) {
            this.field3528 = arg0.method3023();
        } else if (arg1 == 140) {
            this.field3529 = arg0.method3023();
        } else if (arg1 == 148) {
            this.field3530 = arg0.method3023();
        } else if (arg1 == 149) {
            this.field3531 = arg0.method3023();
        } else if (arg1 == 249) {
            this.field3526 = class251.method3769(arg0, this.field3526);
        }
    }

    @ObfuscatedName("if.g(Lif;Lif;B)V")
    public void method4242(class258 arg0, class258 arg1) {
        this.field3523 = arg0.field3523;
        this.field3511 = arg0.field3511;
        this.field3492 = arg0.field3492;
        this.field3483 = arg0.field3483;
        this.field3495 = arg0.field3495;
        this.field3496 = arg0.field3496;
        this.field3488 = arg0.field3488;
        this.field3482 = arg0.field3482;
        this.field3489 = arg0.field3489;
        this.field3490 = arg0.field3490;
        this.field3491 = arg0.field3491;
        this.field3487 = arg1.field3487;
        this.field3500 = arg1.field3500;
        this.field3497 = arg1.field3497;
        this.field3498 = 1;
    }

    @ObfuscatedName("if.c(Lif;Lif;S)V")
    public void method4243(class258 arg0, class258 arg1) {
        this.field3523 = arg0.field3523;
        this.field3511 = arg0.field3511;
        this.field3492 = arg0.field3492;
        this.field3483 = arg0.field3483;
        this.field3495 = arg0.field3495;
        this.field3496 = arg0.field3496;
        this.field3488 = arg0.field3488;
        this.field3482 = arg1.field3482;
        this.field3489 = arg1.field3489;
        this.field3490 = arg1.field3490;
        this.field3491 = arg1.field3491;
        this.field3487 = arg1.field3487;
        this.field3500 = arg1.field3500;
        this.field3498 = arg1.field3498;
        this.field3504 = arg1.field3504;
        this.field3505 = arg1.field3505;
        this.field3510 = arg1.field3510;
        this.field3507 = arg1.field3507;
        this.field3512 = arg1.field3512;
        this.field3522 = arg1.field3522;
        this.field3485 = arg1.field3485;
        this.field3513 = arg1.field3513;
        this.field3514 = arg1.field3514;
        this.field3515 = arg1.field3515;
        this.field3525 = arg1.field3525;
        this.field3501 = arg1.field3501;
        this.field3478 = new String[5];
        if (arg1.field3478 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3478[var3] = arg1.field3478[var3];
            }
        }
        this.field3478[4] = class227.field3051;
        this.field3497 = 0;
    }

    @ObfuscatedName("if.l(Lif;Lif;B)V")
    public void method4277(class258 arg0, class258 arg1) {
        this.field3523 = arg0.field3523;
        this.field3511 = arg0.field3511;
        this.field3492 = arg0.field3492;
        this.field3483 = arg0.field3483;
        this.field3495 = arg0.field3495;
        this.field3496 = arg0.field3496;
        this.field3488 = arg0.field3488;
        this.field3482 = arg0.field3482;
        this.field3489 = arg0.field3489;
        this.field3490 = arg0.field3490;
        this.field3491 = arg0.field3491;
        this.field3498 = arg0.field3498;
        this.field3487 = arg1.field3487;
        this.field3497 = 0;
        this.field3500 = false;
        this.field3509 = false;
    }

    @ObfuscatedName("if.w(IB)Ldi;")
    public final class129 method4239(int arg0) {
        if (this.field3516 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3508[var3] && this.field3508[var3] != 0) {
                    var2 = this.field3516[var3];
                }
            }
            if (var2 != -1) {
                return method1923(var2).method4239(1);
            }
        }
        class129 var4 = class129.method2208(Statics.field20, this.field3523, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3520 != 128 || this.field3517 != 128 || this.field3494 != 128) {
            var4.method2225(this.field3520, this.field3517, this.field3494);
        }
        if (this.field3482 != null) {
            for (int var5 = 0; var5 < this.field3482.length; var5++) {
                var4.method2241(this.field3482[var5], this.field3489[var5]);
            }
        }
        if (this.field3490 != null) {
            for (int var6 = 0; var6 < this.field3490.length; var6++) {
                var4.method2223(this.field3490[var6], this.field3491[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("if.b(IB)Leo;")
    public final class135 method4246(int arg0) {
        if (this.field3516 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3508[var3] && this.field3508[var3] != 0) {
                    var2 = this.field3516[var3];
                }
            }
            if (var2 != -1) {
                return method1923(var2).method4246(1);
            }
        }
        class135 var4 = (class135) field3481.method3271((long) this.field3527);
        if (var4 != null) {
            return var4;
        }
        class129 var5 = class129.method2208(Statics.field20, this.field3523, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3520 != 128 || this.field3517 != 128 || this.field3494 != 128) {
            var5.method2225(this.field3520, this.field3517, this.field3494);
        }
        if (this.field3482 != null) {
            for (int var6 = 0; var6 < this.field3482.length; var6++) {
                var5.method2241(this.field3482[var6], this.field3489[var6]);
            }
        }
        if (this.field3490 != null) {
            for (int var7 = 0; var7 < this.field3490.length; var7++) {
                var5.method2223(this.field3490[var7], this.field3491[var7]);
            }
        }
        class135 var8 = var5.method2229(this.field3479 + 64, this.field3524 + 768, -50, -10, -50);
        var8.field1991 = true;
        field3481.method3270(var8, (long) this.field3527);
        return var8;
    }

    @ObfuscatedName("if.o(IB)Lif;")
    public class258 method4240(int arg0) {
        if (this.field3516 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3508[var3] && this.field3508[var3] != 0) {
                    var2 = this.field3516[var3];
                }
            }
            if (var2 != -1) {
                return method1923(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cl.m(IIIIIZI)Lkp;")
    public static final class287 method1700(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class287 var8 = (class287) field3484.method3271(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class258 var9 = method1923(arg0);
        if (arg1 > 1 && var9.field3516 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3508[var11] && var9.field3508[var11] != 0) {
                    var10 = var9.field3516[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1923(var10);
            }
        }
        class135 var12 = var9.method4246(1);
        if (var12 == null) {
            return null;
        }
        class287 var13 = null;
        if (var9.field3519 != -1) {
            var13 = method1700(var9.field3518, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3529 != -1) {
            var13 = method1700(var9.field3528, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3531 != -1) {
            var13 = method1700(var9.field3530, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3749;
        int var15 = Statics.field3744;
        int var16 = Statics.field3745;
        int[] var17 = new int[4];
        class283.method4595(var17);
        class287 var18 = new class287(36, 32);
        class283.method4591(var18.field3768, 36, 32);
        class283.method4619();
        class138.method2391();
        class138.method2454(16, 16);
        class138.field2019 = false;
        if (var9.field3531 != -1) {
            var13.method4795(0, 0);
        }
        int var19 = var9.field3511;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class138.field2041[var9.field3492] * var19 >> 16;
        int var21 = class138.field2030[var9.field3492] * var19 >> 16;
        var12.method2305();
        var12.method2340(0, var9.field3483, var9.field3495, var9.field3492, var9.field3496, var9.field3488 + var12.field2130 / 2 + var20, var9.field3488 + var21);
        if (var9.field3529 != -1) {
            var13.method4795(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4710(1);
        }
        if (arg2 >= 2) {
            var18.method4710(16777215);
        }
        if (arg3 != 0) {
            var18.method4711(arg3);
        }
        class283.method4591(var18.field3768, 36, 32);
        if (var9.field3519 != -1) {
            var13.method4795(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3498 == 1) {
            class265 var22 = Statics.field2434;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class227.field2956 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class227.field3013 + "</col>";
            }
            var22.method4420(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3484.method3270(var18, var6);
        }
        class283.method4591(var14, var15, var16);
        class283.method4596(var17);
        class138.method2391();
        class138.field2019 = true;
        return var18;
    }

    @ObfuscatedName("if.e(ZI)Z")
    public final boolean method4248(boolean arg0) {
        int var2 = this.field3504;
        int var3 = this.field3505;
        int var4 = this.field3510;
        if (arg0) {
            var2 = this.field3507;
            var3 = this.field3512;
            var4 = this.field3522;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field20.method3775(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field20.method3775(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field20.method3775(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("if.a(ZI)Ldi;")
    public final class129 method4249(boolean arg0) {
        int var2 = this.field3504;
        int var3 = this.field3505;
        int var4 = this.field3510;
        if (arg0) {
            var2 = this.field3507;
            var3 = this.field3512;
            var4 = this.field3522;
        }
        if (var2 == -1) {
            return null;
        }
        class129 var5 = class129.method2208(Statics.field20, var2, 0);
        if (var3 != -1) {
            class129 var6 = class129.method2208(Statics.field20, var3, 0);
            if (var4 == -1) {
                class129[] var9 = new class129[] { var5, var6 };
                var5 = new class129(var9, 2);
            } else {
                class129 var7 = class129.method2208(Statics.field20, var4, 0);
                class129[] var8 = new class129[] { var5, var6, var7 };
                var5 = new class129(var8, 3);
            }
        }
        if (!arg0 && this.field3506 != 0) {
            var5.method2221(0, this.field3506, 0);
        }
        if (arg0 && this.field3502 != 0) {
            var5.method2221(0, this.field3502, 0);
        }
        if (this.field3482 != null) {
            for (int var10 = 0; var10 < this.field3482.length; var10++) {
                var5.method2241(this.field3482[var10], this.field3489[var10]);
            }
        }
        if (this.field3490 != null) {
            for (int var11 = 0; var11 < this.field3490.length; var11++) {
                var5.method2223(this.field3490[var11], this.field3491[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("if.v(ZI)Z")
    public final boolean method4250(boolean arg0) {
        int var2 = this.field3485;
        int var3 = this.field3513;
        if (arg0) {
            var2 = this.field3514;
            var3 = this.field3515;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field20.method3775(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field20.method3775(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("if.t(ZI)Ldi;")
    public final class129 method4251(boolean arg0) {
        int var2 = this.field3485;
        int var3 = this.field3513;
        if (arg0) {
            var2 = this.field3514;
            var3 = this.field3515;
        }
        if (var2 == -1) {
            return null;
        }
        class129 var4 = class129.method2208(Statics.field20, var2, 0);
        if (var3 != -1) {
            class129 var5 = class129.method2208(Statics.field20, var3, 0);
            class129[] var6 = new class129[] { var4, var5 };
            var4 = new class129(var6, 2);
        }
        if (this.field3482 != null) {
            for (int var7 = 0; var7 < this.field3482.length; var7++) {
                var4.method2241(this.field3482[var7], this.field3489[var7]);
            }
        }
        if (this.field3490 != null) {
            for (int var8 = 0; var8 < this.field3490.length; var8++) {
                var4.method2223(this.field3490[var8], this.field3491[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("if.y(III)I")
    public int method4252(int arg0, int arg1) {
        return class251.method1735(this.field3526, arg0, arg1);
    }

    @ObfuscatedName("if.u(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4302(int arg0, String arg1) {
        return class251.method246(this.field3526, arg0, arg1);
    }

    @ObfuscatedName("if.n(I)I")
    public int method4260() {
        if (this.field3503 == -1 || this.field3478 == null) {
            return -1;
        } else if (this.field3503 >= 0) {
            return this.field3478[this.field3503] == null ? -1 : this.field3503;
        } else if (class227.field2853.equalsIgnoreCase(this.field3478[4])) {
            return 4;
        } else {
            return -1;
        }
    }
}
