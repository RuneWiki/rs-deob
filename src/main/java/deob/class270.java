package deob;

@ObfuscatedName("jm")
public class class270 extends class207 {

    @ObfuscatedName("jm.a")
    public static class201 field3445 = new class201(64);

    @ObfuscatedName("jm.l")
    public static class201 field3446 = new class201(50);

    @ObfuscatedName("jm.d")
    public static class201 field3460 = new class201(200);

    @ObfuscatedName("jm.p")
    public int field3485;

    @ObfuscatedName("jm.g")
    public int field3473;

    @ObfuscatedName("jm.y")
    public String field3450 = class238.field2821;

    @ObfuscatedName("jm.c")
    public short[] field3451;

    @ObfuscatedName("jm.e")
    public short[] field3452;

    @ObfuscatedName("jm.t")
    public short[] field3453;

    @ObfuscatedName("jm.u")
    public short[] field3482;

    @ObfuscatedName("jm.i")
    public int field3455 = 2000;

    @ObfuscatedName("jm.z")
    public int field3471 = 0;

    @ObfuscatedName("jm.k")
    public int field3457 = 0;

    @ObfuscatedName("jm.r")
    public int field3458 = 0;

    @ObfuscatedName("jm.v")
    public int field3459 = 0;

    @ObfuscatedName("jm.o")
    public int field3487 = 0;

    @ObfuscatedName("jm.ai")
    public int field3483 = 0;

    @ObfuscatedName("jm.at")
    public int field3488 = 1;

    @ObfuscatedName("jm.ad")
    public boolean field3463 = false;

    @ObfuscatedName("jm.ac")
    public String[] field3464 = new String[] { null, null, class238.field2814, null, null };

    @ObfuscatedName("jm.ay")
    public String[] field3465 = new String[] { null, null, null, null, class238.field2815 };

    @ObfuscatedName("jm.as")
    public int field3466 = -2;

    @ObfuscatedName("jm.aw")
    public int field3467 = -1;

    @ObfuscatedName("jm.ag")
    public int field3472 = -1;

    @ObfuscatedName("jm.ah")
    public int field3462 = 0;

    @ObfuscatedName("jm.az")
    public int field3470 = -1;

    @ObfuscatedName("jm.ao")
    public int field3454 = -1;

    @ObfuscatedName("jm.ap")
    public int field3468 = 0;

    @ObfuscatedName("jm.af")
    public int field3449 = -1;

    @ObfuscatedName("jm.am")
    public int field3474 = -1;

    @ObfuscatedName("jm.aq")
    public int field3475 = -1;

    @ObfuscatedName("jm.aj")
    public int field3476 = -1;

    @ObfuscatedName("jm.ae")
    public int field3477 = -1;

    @ObfuscatedName("jm.au")
    public int field3478 = -1;

    @ObfuscatedName("jm.av")
    public int[] field3479;

    @ObfuscatedName("jm.ab")
    public int[] field3480;

    @ObfuscatedName("jm.aa")
    public int field3448 = -1;

    @ObfuscatedName("jm.ar")
    public int field3461 = -1;

    @ObfuscatedName("jm.ax")
    public int field3447 = 128;

    @ObfuscatedName("jm.al")
    public int field3484 = 128;

    @ObfuscatedName("jm.ak")
    public int field3456 = 128;

    @ObfuscatedName("jm.bc")
    public int field3486 = 0;

    @ObfuscatedName("jm.bo")
    public int field3494 = 0;

    @ObfuscatedName("jm.bx")
    public int field3440 = 0;

    @ObfuscatedName("jm.be")
    public class198 field3489;

    @ObfuscatedName("jm.br")
    public boolean field3490 = false;

    @ObfuscatedName("jm.bk")
    public int field3491 = -1;

    @ObfuscatedName("jm.bn")
    public int field3492 = -1;

    @ObfuscatedName("jm.bp")
    public int field3493 = -1;

    @ObfuscatedName("jm.bu")
    public int field3441 = -1;

    @ObfuscatedName("dn.w(IB)Ljm;")
    public static class270 method2571(int arg0) {
        class270 var1 = (class270) field3445.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3444.method4250(10, arg0);
        class270 var3 = new class270();
        var3.field3485 = arg0;
        if (var2 != null) {
            var3.method4713(new class183(var2));
        }
        var3.method4712();
        if (var3.field3461 != -1) {
            var3.method4731(method2571(var3.field3461), method2571(var3.field3448));
        }
        if (var3.field3492 != -1) {
            var3.method4719(method2571(var3.field3492), method2571(var3.field3491));
        }
        if (var3.field3441 != -1) {
            var3.method4750(method2571(var3.field3441), method2571(var3.field3493));
        }
        if (!Statics.field32 && var3.field3463) {
            var3.field3450 = class238.field2884;
            var3.field3490 = false;
            var3.field3464 = null;
            var3.field3465 = null;
            var3.field3466 = -1;
            var3.field3440 = 0;
            if (var3.field3489 != null) {
                boolean var4 = false;
                for (class205 var5 = var3.field3489.method3680(); var5 != null; var5 = var3.field3489.method3679()) {
                    class265 var6 = class265.method3505((int) var5.field2450);
                    if (var6.field3350) {
                        var5.method3782();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3489 = null;
                }
            }
        }
        field3445.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.m(B)V")
    public void method4712() {
    }

    @ObfuscatedName("jm.q(Lgy;I)V")
    public void method4713(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4714(arg0, var2);
        }
    }

    @ObfuscatedName("jm.x(Lgy;II)V")
    public void method4714(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3473 = arg0.method3268();
        } else if (arg1 == 2) {
            this.field3450 = arg0.method3271();
        } else if (arg1 == 4) {
            this.field3455 = arg0.method3268();
        } else if (arg1 == 5) {
            this.field3471 = arg0.method3268();
        } else if (arg1 == 6) {
            this.field3457 = arg0.method3268();
        } else if (arg1 == 7) {
            this.field3459 = arg0.method3268();
            if (this.field3459 > 32767) {
                this.field3459 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3487 = arg0.method3268();
            if (this.field3487 > 32767) {
                this.field3487 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3483 = 1;
        } else if (arg1 == 12) {
            this.field3488 = arg0.method3267();
        } else if (arg1 == 16) {
            this.field3463 = true;
        } else if (arg1 == 23) {
            this.field3467 = arg0.method3268();
            this.field3462 = arg0.method3436();
        } else if (arg1 == 24) {
            this.field3472 = arg0.method3268();
        } else if (arg1 == 25) {
            this.field3470 = arg0.method3268();
            this.field3468 = arg0.method3436();
        } else if (arg1 == 26) {
            this.field3454 = arg0.method3268();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3464[arg1 - 30] = arg0.method3271();
            if (this.field3464[arg1 - 30].equalsIgnoreCase(class238.field2816)) {
                this.field3464[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3465[arg1 - 35] = arg0.method3271();
        } else if (arg1 == 40) {
            int var3 = arg0.method3436();
            this.field3451 = new short[var3];
            this.field3452 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3451[var4] = (short) arg0.method3268();
                this.field3452[var4] = (short) arg0.method3268();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3436();
            this.field3453 = new short[var5];
            this.field3482 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3453[var6] = (short) arg0.method3268();
                this.field3482[var6] = (short) arg0.method3268();
            }
        } else if (arg1 == 42) {
            this.field3466 = arg0.method3263();
        } else if (arg1 == 65) {
            this.field3490 = true;
        } else if (arg1 == 78) {
            this.field3449 = arg0.method3268();
        } else if (arg1 == 79) {
            this.field3474 = arg0.method3268();
        } else if (arg1 == 90) {
            this.field3475 = arg0.method3268();
        } else if (arg1 == 91) {
            this.field3477 = arg0.method3268();
        } else if (arg1 == 92) {
            this.field3476 = arg0.method3268();
        } else if (arg1 == 93) {
            this.field3478 = arg0.method3268();
        } else if (arg1 == 95) {
            this.field3458 = arg0.method3268();
        } else if (arg1 == 97) {
            this.field3448 = arg0.method3268();
        } else if (arg1 == 98) {
            this.field3461 = arg0.method3268();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3479 == null) {
                this.field3479 = new int[10];
                this.field3480 = new int[10];
            }
            this.field3479[arg1 - 100] = arg0.method3268();
            this.field3480[arg1 - 100] = arg0.method3268();
        } else if (arg1 == 110) {
            this.field3447 = arg0.method3268();
        } else if (arg1 == 111) {
            this.field3484 = arg0.method3268();
        } else if (arg1 == 112) {
            this.field3456 = arg0.method3268();
        } else if (arg1 == 113) {
            this.field3486 = arg0.method3263();
        } else if (arg1 == 114) {
            this.field3494 = arg0.method3263();
        } else if (arg1 == 115) {
            this.field3440 = arg0.method3436();
        } else if (arg1 == 139) {
            this.field3491 = arg0.method3268();
        } else if (arg1 == 140) {
            this.field3492 = arg0.method3268();
        } else if (arg1 == 148) {
            this.field3493 = arg0.method3268();
        } else if (arg1 == 149) {
            this.field3441 = arg0.method3268();
        } else if (arg1 == 249) {
            this.field3489 = Statics.method2312(arg0, this.field3489);
        }
    }

    @ObfuscatedName("jm.j(Ljm;Ljm;B)V")
    public void method4731(class270 arg0, class270 arg1) {
        this.field3473 = arg0.field3473;
        this.field3455 = arg0.field3455;
        this.field3471 = arg0.field3471;
        this.field3457 = arg0.field3457;
        this.field3458 = arg0.field3458;
        this.field3459 = arg0.field3459;
        this.field3487 = arg0.field3487;
        this.field3451 = arg0.field3451;
        this.field3452 = arg0.field3452;
        this.field3453 = arg0.field3453;
        this.field3482 = arg0.field3482;
        this.field3450 = arg1.field3450;
        this.field3463 = arg1.field3463;
        this.field3488 = arg1.field3488;
        this.field3483 = 1;
    }

    @ObfuscatedName("jm.a(Ljm;Ljm;I)V")
    public void method4719(class270 arg0, class270 arg1) {
        this.field3473 = arg0.field3473;
        this.field3455 = arg0.field3455;
        this.field3471 = arg0.field3471;
        this.field3457 = arg0.field3457;
        this.field3458 = arg0.field3458;
        this.field3459 = arg0.field3459;
        this.field3487 = arg0.field3487;
        this.field3451 = arg1.field3451;
        this.field3452 = arg1.field3452;
        this.field3453 = arg1.field3453;
        this.field3482 = arg1.field3482;
        this.field3450 = arg1.field3450;
        this.field3463 = arg1.field3463;
        this.field3483 = arg1.field3483;
        this.field3467 = arg1.field3467;
        this.field3472 = arg1.field3472;
        this.field3449 = arg1.field3449;
        this.field3470 = arg1.field3470;
        this.field3454 = arg1.field3454;
        this.field3474 = arg1.field3474;
        this.field3475 = arg1.field3475;
        this.field3476 = arg1.field3476;
        this.field3477 = arg1.field3477;
        this.field3478 = arg1.field3478;
        this.field3440 = arg1.field3440;
        this.field3464 = arg1.field3464;
        this.field3465 = new String[5];
        if (arg1.field3465 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3465[var3] = arg1.field3465[var3];
            }
        }
        this.field3465[4] = class238.field2820;
        this.field3488 = 0;
    }

    @ObfuscatedName("jm.l(Ljm;Ljm;B)V")
    public void method4750(class270 arg0, class270 arg1) {
        this.field3473 = arg0.field3473;
        this.field3455 = arg0.field3455;
        this.field3471 = arg0.field3471;
        this.field3457 = arg0.field3457;
        this.field3458 = arg0.field3458;
        this.field3459 = arg0.field3459;
        this.field3487 = arg0.field3487;
        this.field3451 = arg0.field3451;
        this.field3452 = arg0.field3452;
        this.field3453 = arg0.field3453;
        this.field3482 = arg0.field3482;
        this.field3483 = arg0.field3483;
        this.field3450 = arg1.field3450;
        this.field3488 = 0;
        this.field3463 = false;
        this.field3490 = false;
    }

    @ObfuscatedName("jm.d(II)Ldo;")
    public final class114 method4721(int arg0) {
        if (this.field3479 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3480[var3] && this.field3480[var3] != 0) {
                    var2 = this.field3479[var3];
                }
            }
            if (var2 != -1) {
                return method2571(var2).method4721(1);
            }
        }
        class114 var4 = class114.method2406(Statics.field3282, this.field3473, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3447 != 128 || this.field3484 != 128 || this.field3456 != 128) {
            var4.method2461(this.field3447, this.field3484, this.field3456);
        }
        if (this.field3451 != null) {
            for (int var5 = 0; var5 < this.field3451.length; var5++) {
                var4.method2476(this.field3451[var5], this.field3452[var5]);
            }
        }
        if (this.field3453 != null) {
            for (int var6 = 0; var6 < this.field3453.length; var6++) {
                var4.method2419(this.field3453[var6], this.field3482[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jm.s(II)Ldk;")
    public final class120 method4717(int arg0) {
        if (this.field3479 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3480[var3] && this.field3480[var3] != 0) {
                    var2 = this.field3479[var3];
                }
            }
            if (var2 != -1) {
                return method2571(var2).method4717(1);
            }
        }
        class120 var4 = (class120) field3446.method3707((long) this.field3485);
        if (var4 != null) {
            return var4;
        }
        class114 var5 = class114.method2406(Statics.field3282, this.field3473, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3447 != 128 || this.field3484 != 128 || this.field3456 != 128) {
            var5.method2461(this.field3447, this.field3484, this.field3456);
        }
        if (this.field3451 != null) {
            for (int var6 = 0; var6 < this.field3451.length; var6++) {
                var5.method2476(this.field3451[var6], this.field3452[var6]);
            }
        }
        if (this.field3453 != null) {
            for (int var7 = 0; var7 < this.field3453.length; var7++) {
                var5.method2419(this.field3453[var7], this.field3482[var7]);
            }
        }
        class120 var8 = var5.method2418(this.field3486 + 64, this.field3494 * 5 + 768, -50, -10, -50);
        var8.field1637 = true;
        field3446.method3712(var8, (long) this.field3485);
        return var8;
    }

    @ObfuscatedName("jm.p(II)Ljm;")
    public class270 method4718(int arg0) {
        if (this.field3479 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3480[var3] && this.field3480[var3] != 0) {
                    var2 = this.field3479[var3];
                }
            }
            if (var2 != -1) {
                return method2571(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fr.g(IIIIIZB)Llc;")
    public static final class319 method3161(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class319 var8 = (class319) field3460.method3707(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class270 var9 = method2571(arg0);
        if (arg1 > 1 && var9.field3479 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3480[var11] && var9.field3480[var11] != 0) {
                    var10 = var9.field3479[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2571(var10);
            }
        }
        class120 var12 = var9.method4717(1);
        if (var12 == null) {
            return null;
        }
        class319 var13 = null;
        if (var9.field3461 != -1) {
            var13 = method3161(var9.field3448, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3492 != -1) {
            var13 = method3161(var9.field3491, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3441 != -1) {
            var13 = method3161(var9.field3493, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3773;
        int var15 = Statics.field3771;
        int var16 = Statics.field3767;
        int[] var17 = new int[4];
        class315.method5341(var17);
        class319 var18 = new class319(36, 32);
        class315.method5326(var18.field3799, 36, 32);
        class315.method5332();
        class123.method2637();
        class123.method2608(16, 16);
        class123.field1727 = false;
        if (var9.field3441 != -1) {
            var13.method5448(0, 0);
        }
        int var19 = var9.field3455;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class123.field1703[var9.field3471] * var19 >> 16;
        int var21 = class123.field1709[var9.field3471] * var19 >> 16;
        var12.method2512();
        var12.method2525(0, var9.field3457, var9.field3458, var9.field3471, var9.field3459, var9.field3487 + var12.field1806 / 2 + var20, var9.field3487 + var21);
        if (var9.field3492 != -1) {
            var13.method5448(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5548(1);
        }
        if (arg2 >= 2) {
            var18.method5548(16777215);
        }
        if (arg3 != 0) {
            var18.method5449(arg3);
        }
        class315.method5326(var18.field3799, 36, 32);
        if (var9.field3461 != -1) {
            var13.method5448(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3483 == 1) {
            class299 var22 = Statics.field2037;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class238.field2979 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class238.field2977 + "</col>";
            }
            var22.method5114(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3460.method3712(var18, var6);
        }
        class315.method5326(var14, var15, var16);
        class315.method5331(var17);
        class123.method2637();
        class123.field1727 = true;
        return var18;
    }

    @ObfuscatedName("jm.y(ZI)Z")
    public final boolean method4723(boolean arg0) {
        int var2 = this.field3467;
        int var3 = this.field3472;
        int var4 = this.field3449;
        if (arg0) {
            var2 = this.field3470;
            var3 = this.field3454;
            var4 = this.field3474;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3282.method4332(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3282.method4332(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3282.method4332(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jm.c(ZI)Ldo;")
    public final class114 method4720(boolean arg0) {
        int var2 = this.field3467;
        int var3 = this.field3472;
        int var4 = this.field3449;
        if (arg0) {
            var2 = this.field3470;
            var3 = this.field3454;
            var4 = this.field3474;
        }
        if (var2 == -1) {
            return null;
        }
        class114 var5 = class114.method2406(Statics.field3282, var2, 0);
        if (var3 != -1) {
            class114 var6 = class114.method2406(Statics.field3282, var3, 0);
            if (var4 == -1) {
                class114[] var9 = new class114[] { var5, var6 };
                var5 = new class114(var9, 2);
            } else {
                class114 var7 = class114.method2406(Statics.field3282, var4, 0);
                class114[] var8 = new class114[] { var5, var6, var7 };
                var5 = new class114(var8, 3);
            }
        }
        if (!arg0 && this.field3462 != 0) {
            var5.method2417(0, this.field3462, 0);
        }
        if (arg0 && this.field3468 != 0) {
            var5.method2417(0, this.field3468, 0);
        }
        if (this.field3451 != null) {
            for (int var10 = 0; var10 < this.field3451.length; var10++) {
                var5.method2476(this.field3451[var10], this.field3452[var10]);
            }
        }
        if (this.field3453 != null) {
            for (int var11 = 0; var11 < this.field3453.length; var11++) {
                var5.method2419(this.field3453[var11], this.field3482[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jm.e(ZI)Z")
    public final boolean method4756(boolean arg0) {
        int var2 = this.field3475;
        int var3 = this.field3476;
        if (arg0) {
            var2 = this.field3477;
            var3 = this.field3478;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3282.method4332(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3282.method4332(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jm.t(ZI)Ldo;")
    public final class114 method4763(boolean arg0) {
        int var2 = this.field3475;
        int var3 = this.field3476;
        if (arg0) {
            var2 = this.field3477;
            var3 = this.field3478;
        }
        if (var2 == -1) {
            return null;
        }
        class114 var4 = class114.method2406(Statics.field3282, var2, 0);
        if (var3 != -1) {
            class114 var5 = class114.method2406(Statics.field3282, var3, 0);
            class114[] var6 = new class114[] { var4, var5 };
            var4 = new class114(var6, 2);
        }
        if (this.field3451 != null) {
            for (int var7 = 0; var7 < this.field3451.length; var7++) {
                var4.method2476(this.field3451[var7], this.field3452[var7]);
            }
        }
        if (this.field3453 != null) {
            for (int var8 = 0; var8 < this.field3453.length; var8++) {
                var4.method2419(this.field3453[var8], this.field3482[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jm.u(III)I")
    public int method4716(int arg0, int arg1) {
        class198 var3 = this.field3489;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class212 var5 = (class212) var3.method3675((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2465;
            }
        }
        return var4;
    }

    @ObfuscatedName("jm.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4724(int arg0, String arg1) {
        return class263.method1701(this.field3489, arg0, arg1);
    }

    @ObfuscatedName("jm.r(B)I")
    public int method4725() {
        if (this.field3466 == -1 || this.field3465 == null) {
            return -1;
        } else if (this.field3466 >= 0) {
            return this.field3465[this.field3466] == null ? -1 : this.field3466;
        } else if (class238.field2815.equalsIgnoreCase(this.field3465[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("z.v(I)V")
    public static void method281() {
        field3445.method3708();
        field3446.method3708();
        field3460.method3708();
    }

    @ObfuscatedName("dn.o(I)V")
    public static void method2602() {
        field3460.method3708();
    }
}
