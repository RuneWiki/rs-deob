package deob;

@ObfuscatedName("ii")
public class class258 extends class196 {

    @ObfuscatedName("ii.u")
    public static class191 field3482 = new class191(64);

    @ObfuscatedName("ii.d")
    public static class191 field3483 = new class191(50);

    @ObfuscatedName("ii.o")
    public static class191 field3484 = new class191(200);

    @ObfuscatedName("ii.h")
    public int field3527;

    @ObfuscatedName("ii.s")
    public int field3509;

    @ObfuscatedName("ii.c")
    public String field3487 = "null";

    @ObfuscatedName("ii.m")
    public short[] field3488;

    @ObfuscatedName("ii.a")
    public short[] field3489;

    @ObfuscatedName("ii.t")
    public short[] field3497;

    @ObfuscatedName("ii.p")
    public short[] field3493;

    @ObfuscatedName("ii.f")
    public int field3492 = 2000;

    @ObfuscatedName("ii.b")
    public int field3494 = 0;

    @ObfuscatedName("ii.x")
    public int field3532 = 0;

    @ObfuscatedName("ii.i")
    public int field3516 = 0;

    @ObfuscatedName("ii.j")
    public int field3496 = 0;

    @ObfuscatedName("ii.q")
    public int field3501 = 0;

    @ObfuscatedName("ii.ag")
    public int field3485 = 0;

    @ObfuscatedName("ii.ay")
    public int field3499 = 1;

    @ObfuscatedName("ii.au")
    public boolean field3500 = false;

    @ObfuscatedName("ii.ah")
    public String[] field3524 = new String[] { null, null, class227.field2827, null, null };

    @ObfuscatedName("ii.ao")
    public String[] field3502 = new String[] { null, null, null, null, class227.field2828 };

    @ObfuscatedName("ii.ae")
    public int field3503 = -2;

    @ObfuscatedName("ii.ax")
    public int field3533 = -1;

    @ObfuscatedName("ii.az")
    public int field3505 = -1;

    @ObfuscatedName("ii.aw")
    public int field3490 = 0;

    @ObfuscatedName("ii.av")
    public int field3507 = -1;

    @ObfuscatedName("ii.ac")
    public int field3478 = -1;

    @ObfuscatedName("ii.ak")
    public int field3508 = 0;

    @ObfuscatedName("ii.ad")
    public int field3510 = -1;

    @ObfuscatedName("ii.at")
    public int field3511 = -1;

    @ObfuscatedName("ii.af")
    public int field3512 = -1;

    @ObfuscatedName("ii.am")
    public int field3513 = -1;

    @ObfuscatedName("ii.aq")
    public int field3514 = -1;

    @ObfuscatedName("ii.as")
    public int field3515 = -1;

    @ObfuscatedName("ii.ab")
    public int[] field3523;

    @ObfuscatedName("ii.ap")
    public int[] field3517;

    @ObfuscatedName("ii.ai")
    public int field3504 = -1;

    @ObfuscatedName("ii.an")
    public int field3519 = -1;

    @ObfuscatedName("ii.ar")
    public int field3520 = 128;

    @ObfuscatedName("ii.aj")
    public int field3521 = 128;

    @ObfuscatedName("ii.aa")
    public int field3491 = 128;

    @ObfuscatedName("ii.bn")
    public int field3477 = 0;

    @ObfuscatedName("ii.bo")
    public int field3506 = 0;

    @ObfuscatedName("ii.bq")
    public int field3525 = 0;

    @ObfuscatedName("ii.ba")
    public class188 field3526;

    @ObfuscatedName("ii.bg")
    public boolean field3522 = false;

    @ObfuscatedName("ii.bd")
    public int field3528 = -1;

    @ObfuscatedName("ii.bp")
    public int field3529 = -1;

    @ObfuscatedName("ii.bi")
    public int field3530 = -1;

    @ObfuscatedName("ii.by")
    public int field3531 = -1;

    @ObfuscatedName("jz.e(II)Lii;")
    public static class258 method4627(int arg0) {
        class258 var1 = (class258) field3482.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1326.method3817(10, arg0);
        class258 var3 = new class258();
        var3.field3527 = arg0;
        if (var2 != null) {
            var3.method4271(new class175(var2));
        }
        var3.method4270();
        if (var3.field3519 != -1) {
            var3.method4273(method4627(var3.field3519), method4627(var3.field3504));
        }
        if (var3.field3529 != -1) {
            var3.method4325(method4627(var3.field3529), method4627(var3.field3528));
        }
        if (var3.field3531 != -1) {
            var3.method4275(method4627(var3.field3531), method4627(var3.field3530));
        }
        if (!Statics.field3480 && var3.field3500) {
            var3.field3487 = class227.field3055;
            var3.field3522 = false;
            var3.field3524 = null;
            var3.field3502 = null;
            var3.field3503 = -1;
            var3.field3525 = 0;
            if (var3.field3526 != null) {
                boolean var4 = false;
                for (class194 var5 = var3.field3526.method3252(); var5 != null; var5 = var3.field3526.method3253()) {
                    class253 var6 = class253.method3666((int) var5.field2451);
                    if (var6.field3383) {
                        var5.method3333();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3526 = null;
                }
            }
        }
        field3482.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.n(I)V")
    public void method4270() {
    }

    @ObfuscatedName("ii.g(Lfh;B)V")
    public void method4271(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4272(arg0, var2);
        }
    }

    @ObfuscatedName("ii.y(Lfh;II)V")
    public void method4272(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3509 = arg0.method3091();
        } else if (arg1 == 2) {
            this.field3487 = arg0.method3113();
        } else if (arg1 == 4) {
            this.field3492 = arg0.method3091();
        } else if (arg1 == 5) {
            this.field3494 = arg0.method3091();
        } else if (arg1 == 6) {
            this.field3532 = arg0.method3091();
        } else if (arg1 == 7) {
            this.field3496 = arg0.method3091();
            if (this.field3496 > 32767) {
                this.field3496 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3501 = arg0.method3091();
            if (this.field3501 > 32767) {
                this.field3501 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3485 = 1;
        } else if (arg1 == 12) {
            this.field3499 = arg0.method2933();
        } else if (arg1 == 16) {
            this.field3500 = true;
        } else if (arg1 == 23) {
            this.field3533 = arg0.method3091();
            this.field3490 = arg0.method2928();
        } else if (arg1 == 24) {
            this.field3505 = arg0.method3091();
        } else if (arg1 == 25) {
            this.field3507 = arg0.method3091();
            this.field3508 = arg0.method2928();
        } else if (arg1 == 26) {
            this.field3478 = arg0.method3091();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3524[arg1 - 30] = arg0.method3113();
            if (this.field3524[arg1 - 30].equalsIgnoreCase(class227.field2829)) {
                this.field3524[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3502[arg1 - 35] = arg0.method3113();
        } else if (arg1 == 40) {
            int var3 = arg0.method2928();
            this.field3488 = new short[var3];
            this.field3489 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3488[var4] = (short) arg0.method3091();
                this.field3489[var4] = (short) arg0.method3091();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2928();
            this.field3497 = new short[var5];
            this.field3493 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3497[var6] = (short) arg0.method3091();
                this.field3493[var6] = (short) arg0.method3091();
            }
        } else if (arg1 == 42) {
            this.field3503 = arg0.method2998();
        } else if (arg1 == 65) {
            this.field3522 = true;
        } else if (arg1 == 78) {
            this.field3510 = arg0.method3091();
        } else if (arg1 == 79) {
            this.field3511 = arg0.method3091();
        } else if (arg1 == 90) {
            this.field3512 = arg0.method3091();
        } else if (arg1 == 91) {
            this.field3514 = arg0.method3091();
        } else if (arg1 == 92) {
            this.field3513 = arg0.method3091();
        } else if (arg1 == 93) {
            this.field3515 = arg0.method3091();
        } else if (arg1 == 95) {
            this.field3516 = arg0.method3091();
        } else if (arg1 == 97) {
            this.field3504 = arg0.method3091();
        } else if (arg1 == 98) {
            this.field3519 = arg0.method3091();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3523 == null) {
                this.field3523 = new int[10];
                this.field3517 = new int[10];
            }
            this.field3523[arg1 - 100] = arg0.method3091();
            this.field3517[arg1 - 100] = arg0.method3091();
        } else if (arg1 == 110) {
            this.field3520 = arg0.method3091();
        } else if (arg1 == 111) {
            this.field3521 = arg0.method3091();
        } else if (arg1 == 112) {
            this.field3491 = arg0.method3091();
        } else if (arg1 == 113) {
            this.field3477 = arg0.method2998();
        } else if (arg1 == 114) {
            this.field3506 = arg0.method2998() * 5;
        } else if (arg1 == 115) {
            this.field3525 = arg0.method2928();
        } else if (arg1 == 139) {
            this.field3528 = arg0.method3091();
        } else if (arg1 == 140) {
            this.field3529 = arg0.method3091();
        } else if (arg1 == 148) {
            this.field3530 = arg0.method3091();
        } else if (arg1 == 149) {
            this.field3531 = arg0.method3091();
        } else if (arg1 == 249) {
            this.field3526 = class251.method990(arg0, this.field3526);
        }
    }

    @ObfuscatedName("ii.w(Lii;Lii;I)V")
    public void method4273(class258 arg0, class258 arg1) {
        this.field3509 = arg0.field3509;
        this.field3492 = arg0.field3492;
        this.field3494 = arg0.field3494;
        this.field3532 = arg0.field3532;
        this.field3516 = arg0.field3516;
        this.field3496 = arg0.field3496;
        this.field3501 = arg0.field3501;
        this.field3488 = arg0.field3488;
        this.field3489 = arg0.field3489;
        this.field3497 = arg0.field3497;
        this.field3493 = arg0.field3493;
        this.field3487 = arg1.field3487;
        this.field3500 = arg1.field3500;
        this.field3499 = arg1.field3499;
        this.field3485 = 1;
    }

    @ObfuscatedName("ii.k(Lii;Lii;I)V")
    public void method4325(class258 arg0, class258 arg1) {
        this.field3509 = arg0.field3509;
        this.field3492 = arg0.field3492;
        this.field3494 = arg0.field3494;
        this.field3532 = arg0.field3532;
        this.field3516 = arg0.field3516;
        this.field3496 = arg0.field3496;
        this.field3501 = arg0.field3501;
        this.field3488 = arg1.field3488;
        this.field3489 = arg1.field3489;
        this.field3497 = arg1.field3497;
        this.field3493 = arg1.field3493;
        this.field3487 = arg1.field3487;
        this.field3500 = arg1.field3500;
        this.field3485 = arg1.field3485;
        this.field3533 = arg1.field3533;
        this.field3505 = arg1.field3505;
        this.field3510 = arg1.field3510;
        this.field3507 = arg1.field3507;
        this.field3478 = arg1.field3478;
        this.field3511 = arg1.field3511;
        this.field3512 = arg1.field3512;
        this.field3513 = arg1.field3513;
        this.field3514 = arg1.field3514;
        this.field3515 = arg1.field3515;
        this.field3525 = arg1.field3525;
        this.field3524 = arg1.field3524;
        this.field3502 = new String[5];
        if (arg1.field3502 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3502[var3] = arg1.field3502[var3];
            }
        }
        this.field3502[4] = class227.field3060;
        this.field3499 = 0;
    }

    @ObfuscatedName("ii.v(Lii;Lii;B)V")
    public void method4275(class258 arg0, class258 arg1) {
        this.field3509 = arg0.field3509;
        this.field3492 = arg0.field3492;
        this.field3494 = arg0.field3494;
        this.field3532 = arg0.field3532;
        this.field3516 = arg0.field3516;
        this.field3496 = arg0.field3496;
        this.field3501 = arg0.field3501;
        this.field3488 = arg0.field3488;
        this.field3489 = arg0.field3489;
        this.field3497 = arg0.field3497;
        this.field3493 = arg0.field3493;
        this.field3485 = arg0.field3485;
        this.field3487 = arg1.field3487;
        this.field3499 = 0;
        this.field3500 = false;
        this.field3522 = false;
    }

    @ObfuscatedName("ii.z(II)Ldn;")
    public final class129 method4276(int arg0) {
        if (this.field3523 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3517[var3] && this.field3517[var3] != 0) {
                    var2 = this.field3523[var3];
                }
            }
            if (var2 != -1) {
                return method4627(var2).method4276(1);
            }
        }
        class129 var4 = class129.method2235(Statics.field2587, this.field3509, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3520 != 128 || this.field3521 != 128 || this.field3491 != 128) {
            var4.method2237(this.field3520, this.field3521, this.field3491);
        }
        if (this.field3488 != null) {
            for (int var5 = 0; var5 < this.field3488.length; var5++) {
                var4.method2234(this.field3488[var5], this.field3489[var5]);
            }
        }
        if (this.field3497 != null) {
            for (int var6 = 0; var6 < this.field3497.length; var6++) {
                var4.method2248(this.field3497[var6], this.field3493[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.r(IB)Lew;")
    public final class135 method4309(int arg0) {
        if (this.field3523 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3517[var3] && this.field3517[var3] != 0) {
                    var2 = this.field3523[var3];
                }
            }
            if (var2 != -1) {
                return method4627(var2).method4309(1);
            }
        }
        class135 var4 = (class135) field3483.method3288((long) this.field3527);
        if (var4 != null) {
            return var4;
        }
        class129 var5 = class129.method2235(Statics.field2587, this.field3509, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3520 != 128 || this.field3521 != 128 || this.field3491 != 128) {
            var5.method2237(this.field3520, this.field3521, this.field3491);
        }
        if (this.field3488 != null) {
            for (int var6 = 0; var6 < this.field3488.length; var6++) {
                var5.method2234(this.field3488[var6], this.field3489[var6]);
            }
        }
        if (this.field3497 != null) {
            for (int var7 = 0; var7 < this.field3497.length; var7++) {
                var5.method2248(this.field3497[var7], this.field3493[var7]);
            }
        }
        class135 var8 = var5.method2242(this.field3477 + 64, this.field3506 + 768, -50, -10, -50);
        var8.field1939 = true;
        field3483.method3278(var8, (long) this.field3527);
        return var8;
    }

    @ObfuscatedName("ii.u(II)Lii;")
    public class258 method4278(int arg0) {
        if (this.field3523 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3517[var3] && this.field3517[var3] != 0) {
                    var2 = this.field3523[var3];
                }
            }
            if (var2 != -1) {
                return method4627(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fe.d(IIIIIZB)Lkn;")
    public static final class287 method2777(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class287 var8 = (class287) field3484.method3288(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class258 var9 = method4627(arg0);
        if (arg1 > 1 && var9.field3523 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3517[var11] && var9.field3517[var11] != 0) {
                    var10 = var9.field3523[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4627(var10);
            }
        }
        class135 var12 = var9.method4309(1);
        if (var12 == null) {
            return null;
        }
        class287 var13 = null;
        if (var9.field3519 != -1) {
            var13 = method2777(var9.field3504, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3529 != -1) {
            var13 = method2777(var9.field3528, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3531 != -1) {
            var13 = method2777(var9.field3530, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3743;
        int var15 = Statics.field3739;
        int var16 = Statics.field3741;
        int[] var17 = new int[4];
        class283.method4643(var17);
        class287 var18 = new class287(36, 32);
        class283.method4639(var18.field3771, 36, 32);
        class283.method4645();
        class138.method2428();
        class138.method2431(16, 16);
        class138.field2005 = false;
        if (var9.field3531 != -1) {
            var13.method4809(0, 0);
        }
        int var19 = var9.field3492;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class138.field2004[var9.field3494] * var19 >> 16;
        int var21 = class138.field2027[var9.field3494] * var19 >> 16;
        var12.method2320();
        var12.method2333(0, var9.field3532, var9.field3516, var9.field3494, var9.field3496, var9.field3501 + var12.field2113 / 2 + var20, var9.field3501 + var21);
        if (var9.field3529 != -1) {
            var13.method4809(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4762(1);
        }
        if (arg2 >= 2) {
            var18.method4762(16777215);
        }
        if (arg3 != 0) {
            var18.method4763(arg3);
        }
        class283.method4639(var18.field3771, 36, 32);
        if (var9.field3519 != -1) {
            var13.method4809(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3485 == 1) {
            Statics.field2401.method4459(method2301(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3484.method3278(var18, var6);
        }
        class283.method4639(var14, var15, var16);
        class283.method4718(var17);
        class138.method2428();
        class138.field2005 = true;
        return var18;
    }

    @ObfuscatedName("eh.o(II)Ljava/lang/String;")
    public static final String method2301(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class227.field2990 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class227.field2882 + "</col>";
        }
    }

    @ObfuscatedName("ii.s(ZB)Z")
    public final boolean method4279(boolean arg0) {
        int var2 = this.field3533;
        int var3 = this.field3505;
        int var4 = this.field3510;
        if (arg0) {
            var2 = this.field3507;
            var3 = this.field3478;
            var4 = this.field3511;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2587.method3819(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2587.method3819(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2587.method3819(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ii.c(ZI)Ldn;")
    public final class129 method4307(boolean arg0) {
        int var2 = this.field3533;
        int var3 = this.field3505;
        int var4 = this.field3510;
        if (arg0) {
            var2 = this.field3507;
            var3 = this.field3478;
            var4 = this.field3511;
        }
        if (var2 == -1) {
            return null;
        }
        class129 var5 = class129.method2235(Statics.field2587, var2, 0);
        if (var3 != -1) {
            class129 var6 = class129.method2235(Statics.field2587, var3, 0);
            if (var4 == -1) {
                class129[] var9 = new class129[] { var5, var6 };
                var5 = new class129(var9, 2);
            } else {
                class129 var7 = class129.method2235(Statics.field2587, var4, 0);
                class129[] var8 = new class129[] { var5, var6, var7 };
                var5 = new class129(var8, 3);
            }
        }
        if (!arg0 && this.field3490 != 0) {
            var5.method2222(0, this.field3490, 0);
        }
        if (arg0 && this.field3508 != 0) {
            var5.method2222(0, this.field3508, 0);
        }
        if (this.field3488 != null) {
            for (int var10 = 0; var10 < this.field3488.length; var10++) {
                var5.method2234(this.field3488[var10], this.field3489[var10]);
            }
        }
        if (this.field3497 != null) {
            for (int var11 = 0; var11 < this.field3497.length; var11++) {
                var5.method2248(this.field3497[var11], this.field3493[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ii.m(ZI)Z")
    public final boolean method4281(boolean arg0) {
        int var2 = this.field3512;
        int var3 = this.field3513;
        if (arg0) {
            var2 = this.field3514;
            var3 = this.field3515;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2587.method3819(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2587.method3819(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ii.a(ZI)Ldn;")
    public final class129 method4277(boolean arg0) {
        int var2 = this.field3512;
        int var3 = this.field3513;
        if (arg0) {
            var2 = this.field3514;
            var3 = this.field3515;
        }
        if (var2 == -1) {
            return null;
        }
        class129 var4 = class129.method2235(Statics.field2587, var2, 0);
        if (var3 != -1) {
            class129 var5 = class129.method2235(Statics.field2587, var3, 0);
            class129[] var6 = new class129[] { var4, var5 };
            var4 = new class129(var6, 2);
        }
        if (this.field3488 != null) {
            for (int var7 = 0; var7 < this.field3488.length; var7++) {
                var4.method2234(this.field3488[var7], this.field3489[var7]);
            }
        }
        if (this.field3497 != null) {
            for (int var8 = 0; var8 < this.field3497.length; var8++) {
                var4.method2248(this.field3497[var8], this.field3493[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.t(IIB)I")
    public int method4283(int arg0, int arg1) {
        return class251.method464(this.field3526, arg0, arg1);
    }

    @ObfuscatedName("ii.p(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4284(int arg0, String arg1) {
        return class251.method2901(this.field3526, arg0, arg1);
    }

    @ObfuscatedName("ii.f(B)I")
    public int method4285() {
        if (this.field3503 == -1 || this.field3502 == null) {
            return -1;
        } else if (this.field3503 >= 0) {
            return this.field3502[this.field3503] == null ? -1 : this.field3503;
        } else if (class227.field2828.equalsIgnoreCase(this.field3502[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("w.x(ZB)V")
    public static void method10(boolean arg0) {
        if (Statics.field3480 != arg0) {
            field3482.method3282();
            field3483.method3282();
            field3484.method3282();
            Statics.field3480 = arg0;
        }
    }
}
