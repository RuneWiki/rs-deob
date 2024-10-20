package deob;

@ObfuscatedName("jk")
public class class266 extends class185 {

    @ObfuscatedName("jk.t")
    public static class155 field3430 = new class155(64);

    @ObfuscatedName("jk.e")
    public static class155 field3428 = new class155(50);

    @ObfuscatedName("jk.o")
    public static class155 field3444 = new class155(200);

    @ObfuscatedName("jk.x")
    public int field3432;

    @ObfuscatedName("jk.p")
    public int field3433;

    @ObfuscatedName("jk.r")
    public String field3434 = class234.field2793;

    @ObfuscatedName("jk.y")
    public short[] field3474;

    @ObfuscatedName("jk.s")
    public short[] field3460;

    @ObfuscatedName("jk.j")
    public short[] field3437;

    @ObfuscatedName("jk.w")
    public short[] field3445;

    @ObfuscatedName("jk.v")
    public int field3443 = 2000;

    @ObfuscatedName("jk.d")
    public int field3473 = 0;

    @ObfuscatedName("jk.a")
    public int field3441 = 0;

    @ObfuscatedName("jk.g")
    public int field3442 = 0;

    @ObfuscatedName("jk.h")
    public int field3438 = 0;

    @ObfuscatedName("jk.i")
    public int field3464 = 0;

    @ObfuscatedName("jk.ab")
    public int field3458 = 0;

    @ObfuscatedName("jk.ac")
    public int field3446 = 1;

    @ObfuscatedName("jk.ao")
    public boolean field3447 = false;

    @ObfuscatedName("jk.af")
    public String[] field3448 = new String[] { null, null, class234.field2938, null, null };

    @ObfuscatedName("jk.av")
    public String[] field3449 = new String[] { null, null, null, null, class234.field2787 };

    @ObfuscatedName("jk.ay")
    public int field3450 = -2;

    @ObfuscatedName("jk.ah")
    public int field3451 = -1;

    @ObfuscatedName("jk.az")
    public int field3431 = -1;

    @ObfuscatedName("jk.ak")
    public int field3453 = 0;

    @ObfuscatedName("jk.au")
    public int field3454 = -1;

    @ObfuscatedName("jk.ai")
    public int field3455 = -1;

    @ObfuscatedName("jk.ax")
    public int field3435 = 0;

    @ObfuscatedName("jk.ag")
    public int field3457 = -1;

    @ObfuscatedName("jk.aq")
    public int field3468 = -1;

    @ObfuscatedName("jk.aw")
    public int field3459 = -1;

    @ObfuscatedName("jk.an")
    public int field3479 = -1;

    @ObfuscatedName("jk.am")
    public int field3461 = -1;

    @ObfuscatedName("jk.aa")
    public int field3462 = -1;

    @ObfuscatedName("jk.at")
    public int[] field3463;

    @ObfuscatedName("jk.as")
    public int[] field3439;

    @ObfuscatedName("jk.aj")
    public int field3465 = -1;

    @ObfuscatedName("jk.ae")
    public int field3466 = -1;

    @ObfuscatedName("jk.al")
    public int field3467 = 128;

    @ObfuscatedName("jk.ap")
    public int field3477 = 128;

    @ObfuscatedName("jk.ad")
    public int field3469 = 128;

    @ObfuscatedName("jk.bb")
    public int field3470 = 0;

    @ObfuscatedName("jk.bf")
    public int field3471 = 0;

    @ObfuscatedName("jk.bp")
    public int field3472 = 0;

    @ObfuscatedName("jk.bg")
    public class327 field3452;

    @ObfuscatedName("jk.bc")
    public boolean field3424 = false;

    @ObfuscatedName("jk.bj")
    public int field3475 = -1;

    @ObfuscatedName("jk.bl")
    public int field3476 = -1;

    @ObfuscatedName("jk.bn")
    public int field3440 = -1;

    @ObfuscatedName("jk.bo")
    public int field3429 = -1;

    @ObfuscatedName("av.f(II)Ljk;")
    public static class266 method335(int arg0) {
        class266 var1 = (class266) field3430.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3456.method3905(10, arg0);
        class266 var3 = new class266();
        var3.field3432 = arg0;
        if (var2 != null) {
            var3.method4402(new class311(var2));
        }
        var3.method4401();
        if (var3.field3466 != -1) {
            var3.method4461(method335(var3.field3466), method335(var3.field3465));
        }
        if (var3.field3476 != -1) {
            var3.method4405(method335(var3.field3476), method335(var3.field3475));
        }
        if (var3.field3429 != -1) {
            var3.method4406(method335(var3.field3429), method335(var3.field3440));
        }
        if (!Statics.field1473 && var3.field3447) {
            var3.field3434 = class234.field2893;
            var3.field3424 = false;
            var3.field3448 = null;
            var3.field3449 = null;
            var3.field3450 = -1;
            var3.field3472 = 0;
            if (var3.field3452 != null) {
                boolean var4 = false;
                for (class190 var5 = var3.field3452.method5564(); var5 != null; var5 = var3.field3452.method5565()) {
                    class261 var6 = class261.method2034((int) var5.field2140);
                    if (var6.field3333) {
                        var5.method3407();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3452 = null;
                }
            }
        }
        field3430.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.b(I)V")
    public void method4401() {
    }

    @ObfuscatedName("jk.l(Lkb;B)V")
    public void method4402(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4403(arg0, var2);
        }
    }

    @ObfuscatedName("jk.m(Lkb;IB)V")
    public void method4403(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3433 = arg0.method5163();
        } else if (arg1 == 2) {
            this.field3434 = arg0.method5189();
        } else if (arg1 == 4) {
            this.field3443 = arg0.method5163();
        } else if (arg1 == 5) {
            this.field3473 = arg0.method5163();
        } else if (arg1 == 6) {
            this.field3441 = arg0.method5163();
        } else if (arg1 == 7) {
            this.field3438 = arg0.method5163();
            if (this.field3438 > 32767) {
                this.field3438 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3464 = arg0.method5163();
            if (this.field3464 > 32767) {
                this.field3464 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3458 = 1;
        } else if (arg1 == 12) {
            this.field3446 = arg0.method5330();
        } else if (arg1 == 16) {
            this.field3447 = true;
        } else if (arg1 == 23) {
            this.field3451 = arg0.method5163();
            this.field3453 = arg0.method5276();
        } else if (arg1 == 24) {
            this.field3431 = arg0.method5163();
        } else if (arg1 == 25) {
            this.field3454 = arg0.method5163();
            this.field3435 = arg0.method5276();
        } else if (arg1 == 26) {
            this.field3455 = arg0.method5163();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3448[arg1 - 30] = arg0.method5189();
            if (this.field3448[arg1 - 30].equalsIgnoreCase(class234.field2788)) {
                this.field3448[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3449[arg1 - 35] = arg0.method5189();
        } else if (arg1 == 40) {
            int var3 = arg0.method5276();
            this.field3474 = new short[var3];
            this.field3460 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3474[var4] = (short) arg0.method5163();
                this.field3460[var4] = (short) arg0.method5163();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5276();
            this.field3437 = new short[var5];
            this.field3445 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3437[var6] = (short) arg0.method5163();
                this.field3445[var6] = (short) arg0.method5163();
            }
        } else if (arg1 == 42) {
            this.field3450 = arg0.method5181();
        } else if (arg1 == 65) {
            this.field3424 = true;
        } else if (arg1 == 78) {
            this.field3457 = arg0.method5163();
        } else if (arg1 == 79) {
            this.field3468 = arg0.method5163();
        } else if (arg1 == 90) {
            this.field3459 = arg0.method5163();
        } else if (arg1 == 91) {
            this.field3461 = arg0.method5163();
        } else if (arg1 == 92) {
            this.field3479 = arg0.method5163();
        } else if (arg1 == 93) {
            this.field3462 = arg0.method5163();
        } else if (arg1 == 95) {
            this.field3442 = arg0.method5163();
        } else if (arg1 == 97) {
            this.field3465 = arg0.method5163();
        } else if (arg1 == 98) {
            this.field3466 = arg0.method5163();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3463 == null) {
                this.field3463 = new int[10];
                this.field3439 = new int[10];
            }
            this.field3463[arg1 - 100] = arg0.method5163();
            this.field3439[arg1 - 100] = arg0.method5163();
        } else if (arg1 == 110) {
            this.field3467 = arg0.method5163();
        } else if (arg1 == 111) {
            this.field3477 = arg0.method5163();
        } else if (arg1 == 112) {
            this.field3469 = arg0.method5163();
        } else if (arg1 == 113) {
            this.field3470 = arg0.method5181();
        } else if (arg1 == 114) {
            this.field3471 = arg0.method5181();
        } else if (arg1 == 115) {
            this.field3472 = arg0.method5276();
        } else if (arg1 == 139) {
            this.field3475 = arg0.method5163();
        } else if (arg1 == 140) {
            this.field3476 = arg0.method5163();
        } else if (arg1 == 148) {
            this.field3440 = arg0.method5163();
        } else if (arg1 == 149) {
            this.field3429 = arg0.method5163();
        } else if (arg1 == 249) {
            this.field3452 = class259.method4092(arg0, this.field3452);
        }
    }

    @ObfuscatedName("jk.z(Ljk;Ljk;S)V")
    public void method4461(class266 arg0, class266 arg1) {
        this.field3433 = arg0.field3433;
        this.field3443 = arg0.field3443;
        this.field3473 = arg0.field3473;
        this.field3441 = arg0.field3441;
        this.field3442 = arg0.field3442;
        this.field3438 = arg0.field3438;
        this.field3464 = arg0.field3464;
        this.field3474 = arg0.field3474;
        this.field3460 = arg0.field3460;
        this.field3437 = arg0.field3437;
        this.field3445 = arg0.field3445;
        this.field3434 = arg1.field3434;
        this.field3447 = arg1.field3447;
        this.field3446 = arg1.field3446;
        this.field3458 = 1;
    }

    @ObfuscatedName("jk.q(Ljk;Ljk;I)V")
    public void method4405(class266 arg0, class266 arg1) {
        this.field3433 = arg0.field3433;
        this.field3443 = arg0.field3443;
        this.field3473 = arg0.field3473;
        this.field3441 = arg0.field3441;
        this.field3442 = arg0.field3442;
        this.field3438 = arg0.field3438;
        this.field3464 = arg0.field3464;
        this.field3474 = arg1.field3474;
        this.field3460 = arg1.field3460;
        this.field3437 = arg1.field3437;
        this.field3445 = arg1.field3445;
        this.field3434 = arg1.field3434;
        this.field3447 = arg1.field3447;
        this.field3458 = arg1.field3458;
        this.field3451 = arg1.field3451;
        this.field3431 = arg1.field3431;
        this.field3457 = arg1.field3457;
        this.field3454 = arg1.field3454;
        this.field3455 = arg1.field3455;
        this.field3468 = arg1.field3468;
        this.field3459 = arg1.field3459;
        this.field3479 = arg1.field3479;
        this.field3461 = arg1.field3461;
        this.field3462 = arg1.field3462;
        this.field3472 = arg1.field3472;
        this.field3448 = arg1.field3448;
        this.field3449 = new String[5];
        if (arg1.field3449 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3449[var3] = arg1.field3449[var3];
            }
        }
        this.field3449[4] = class234.field2941;
        this.field3446 = 0;
    }

    @ObfuscatedName("jk.k(Ljk;Ljk;B)V")
    public void method4406(class266 arg0, class266 arg1) {
        this.field3433 = arg0.field3433;
        this.field3443 = arg0.field3443;
        this.field3473 = arg0.field3473;
        this.field3441 = arg0.field3441;
        this.field3442 = arg0.field3442;
        this.field3438 = arg0.field3438;
        this.field3464 = arg0.field3464;
        this.field3474 = arg0.field3474;
        this.field3460 = arg0.field3460;
        this.field3437 = arg0.field3437;
        this.field3445 = arg0.field3445;
        this.field3458 = arg0.field3458;
        this.field3434 = arg1.field3434;
        this.field3446 = 0;
        this.field3447 = false;
        this.field3424 = false;
    }

    @ObfuscatedName("jk.c(II)Len;")
    public final class131 method4460(int arg0) {
        if (this.field3463 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3439[var3] && this.field3439[var3] != 0) {
                    var2 = this.field3463[var3];
                }
            }
            if (var2 != -1) {
                return method335(var2).method4460(1);
            }
        }
        class131 var4 = class131.method2647(Statics.field1994, this.field3433, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3467 != 128 || this.field3477 != 128 || this.field3469 != 128) {
            var4.method2703(this.field3467, this.field3477, this.field3469);
        }
        if (this.field3474 != null) {
            for (int var5 = 0; var5 < this.field3474.length; var5++) {
                var4.method2660(this.field3474[var5], this.field3460[var5]);
            }
        }
        if (this.field3437 != null) {
            for (int var6 = 0; var6 < this.field3437.length; var6++) {
                var4.method2661(this.field3437[var6], this.field3445[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jk.u(II)Leh;")
    public final class137 method4408(int arg0) {
        if (this.field3463 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3439[var3] && this.field3439[var3] != 0) {
                    var2 = this.field3463[var3];
                }
            }
            if (var2 != -1) {
                return method335(var2).method4408(1);
            }
        }
        class137 var4 = (class137) field3428.method3155((long) this.field3432);
        if (var4 != null) {
            return var4;
        }
        class131 var5 = class131.method2647(Statics.field1994, this.field3433, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3467 != 128 || this.field3477 != 128 || this.field3469 != 128) {
            var5.method2703(this.field3467, this.field3477, this.field3469);
        }
        if (this.field3474 != null) {
            for (int var6 = 0; var6 < this.field3474.length; var6++) {
                var5.method2660(this.field3474[var6], this.field3460[var6]);
            }
        }
        if (this.field3437 != null) {
            for (int var7 = 0; var7 < this.field3437.length; var7++) {
                var5.method2661(this.field3437[var7], this.field3445[var7]);
            }
        }
        class137 var8 = var5.method2668(this.field3470 + 64, this.field3471 * 5 + 768, -50, -10, -50);
        var8.field1726 = true;
        field3428.method3157(var8, (long) this.field3432);
        return var8;
    }

    @ObfuscatedName("jk.t(IB)Ljk;")
    public class266 method4409(int arg0) {
        if (this.field3463 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3439[var3] && this.field3439[var3] != 0) {
                    var2 = this.field3463[var3];
                }
            }
            if (var2 != -1) {
                return method335(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("eu.e(IIIIIZB)Llc;")
    public static final class336 method2946(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class336 var8 = (class336) field3444.method3155(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class266 var9 = method335(arg0);
        if (arg1 > 1 && var9.field3463 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3439[var11] && var9.field3439[var11] != 0) {
                    var10 = var9.field3463[var11];
                }
            }
            if (var10 != -1) {
                var9 = method335(var10);
            }
        }
        class137 var12 = var9.method4408(1);
        if (var12 == null) {
            return null;
        }
        class336 var13 = null;
        if (var9.field3466 != -1) {
            var13 = method2946(var9.field3465, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3476 != -1) {
            var13 = method2946(var9.field3475, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3429 != -1) {
            var13 = method2946(var9.field3440, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3889;
        int var15 = Statics.field3884;
        int var16 = Statics.field3886;
        int[] var17 = new int[4];
        class332.method5646(var17);
        class336 var18 = new class336(36, 32);
        class332.method5649(var18.field3910, 36, 32);
        class332.method5648();
        class140.method2873();
        class140.method2909(16, 16);
        class140.field1795 = false;
        if (var9.field3429 != -1) {
            var13.method5773(0, 0);
        }
        int var19 = var9.field3443;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class140.field1815[var9.field3473] * var19 >> 16;
        int var21 = class140.field1800[var9.field3473] * var19 >> 16;
        var12.method2746();
        var12.method2799(0, var9.field3441, var9.field3442, var9.field3473, var9.field3438, var9.field3464 + var12.field1900 / 2 + var20, var9.field3464 + var21);
        if (var9.field3476 != -1) {
            var13.method5773(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5755(1);
        }
        if (arg2 >= 2) {
            var18.method5755(16777215);
        }
        if (arg3 != 0) {
            var18.method5789(arg3);
        }
        class332.method5649(var18.field3910, 36, 32);
        if (var9.field3466 != -1) {
            var13.method5773(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3458 == 1) {
            Statics.field3221.method5060(method3875(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3444.method3157(var18, var6);
        }
        class332.method5649(var14, var15, var16);
        class332.method5647(var17);
        class140.method2873();
        class140.field1795 = true;
        return var18;
    }

    @ObfuscatedName("he.o(II)Ljava/lang/String;")
    public static final String method3875(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class234.field2863 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class234.field2951 + "</col>";
        }
    }

    @ObfuscatedName("jk.n(ZI)Z")
    public final boolean method4410(boolean arg0) {
        int var2 = this.field3451;
        int var3 = this.field3431;
        int var4 = this.field3457;
        if (arg0) {
            var2 = this.field3454;
            var3 = this.field3455;
            var4 = this.field3468;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1994.method3902(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1994.method3902(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1994.method3902(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jk.x(ZI)Len;")
    public final class131 method4411(boolean arg0) {
        int var2 = this.field3451;
        int var3 = this.field3431;
        int var4 = this.field3457;
        if (arg0) {
            var2 = this.field3454;
            var3 = this.field3455;
            var4 = this.field3468;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var5 = class131.method2647(Statics.field1994, var2, 0);
        if (var3 != -1) {
            class131 var6 = class131.method2647(Statics.field1994, var3, 0);
            if (var4 == -1) {
                class131[] var9 = new class131[] { var5, var6 };
                var5 = new class131(var9, 2);
            } else {
                class131 var7 = class131.method2647(Statics.field1994, var4, 0);
                class131[] var8 = new class131[] { var5, var6, var7 };
                var5 = new class131(var8, 3);
            }
        }
        if (!arg0 && this.field3453 != 0) {
            var5.method2707(0, this.field3453, 0);
        }
        if (arg0 && this.field3435 != 0) {
            var5.method2707(0, this.field3435, 0);
        }
        if (this.field3474 != null) {
            for (int var10 = 0; var10 < this.field3474.length; var10++) {
                var5.method2660(this.field3474[var10], this.field3460[var10]);
            }
        }
        if (this.field3437 != null) {
            for (int var11 = 0; var11 < this.field3437.length; var11++) {
                var5.method2661(this.field3437[var11], this.field3445[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jk.p(ZB)Z")
    public final boolean method4400(boolean arg0) {
        int var2 = this.field3459;
        int var3 = this.field3479;
        if (arg0) {
            var2 = this.field3461;
            var3 = this.field3462;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1994.method3902(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1994.method3902(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jk.r(ZB)Len;")
    public final class131 method4413(boolean arg0) {
        int var2 = this.field3459;
        int var3 = this.field3479;
        if (arg0) {
            var2 = this.field3461;
            var3 = this.field3462;
        }
        if (var2 == -1) {
            return null;
        }
        class131 var4 = class131.method2647(Statics.field1994, var2, 0);
        if (var3 != -1) {
            class131 var5 = class131.method2647(Statics.field1994, var3, 0);
            class131[] var6 = new class131[] { var4, var5 };
            var4 = new class131(var6, 2);
        }
        if (this.field3474 != null) {
            for (int var7 = 0; var7 < this.field3474.length; var7++) {
                var4.method2660(this.field3474[var7], this.field3460[var7]);
            }
        }
        if (this.field3437 != null) {
            for (int var8 = 0; var8 < this.field3437.length; var8++) {
                var4.method2661(this.field3437[var8], this.field3445[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jk.y(III)I")
    public int method4439(int arg0, int arg1) {
        class327 var3 = this.field3452;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5561((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2139;
            }
        }
        return var4;
    }

    @ObfuscatedName("jk.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4450(int arg0, String arg1) {
        return class259.method275(this.field3452, arg0, arg1);
    }

    @ObfuscatedName("jk.j(B)I")
    public int method4416() {
        if (this.field3450 == -1 || this.field3449 == null) {
            return -1;
        } else if (this.field3450 >= 0) {
            return this.field3449[this.field3450] == null ? -1 : this.field3450;
        } else if (class234.field2787.equalsIgnoreCase(this.field3449[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("gj.d(B)V")
    public static void method3475() {
        field3430.method3158();
        field3428.method3158();
        field3444.method3158();
    }
}
