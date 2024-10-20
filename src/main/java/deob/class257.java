package deob;

@ObfuscatedName("ii")
public class class257 extends class195 {

    @ObfuscatedName("ii.q")
    public static class190 field3479 = new class190(64);

    @ObfuscatedName("ii.h")
    public static class190 field3472 = new class190(50);

    @ObfuscatedName("ii.i")
    public static class190 field3473 = new class190(200);

    @ObfuscatedName("ii.n")
    public int field3474;

    @ObfuscatedName("ii.c")
    public int field3505;

    @ObfuscatedName("ii.v")
    public String field3491 = "null";

    @ObfuscatedName("ii.u")
    public short[] field3475;

    @ObfuscatedName("ii.w")
    public short[] field3478;

    @ObfuscatedName("ii.z")
    public short[] field3487;

    @ObfuscatedName("ii.y")
    public short[] field3465;

    @ObfuscatedName("ii.p")
    public int field3496 = 2000;

    @ObfuscatedName("ii.l")
    public int field3482 = 0;

    @ObfuscatedName("ii.x")
    public int field3483 = 0;

    @ObfuscatedName("ii.r")
    public int field3484 = 0;

    @ObfuscatedName("ii.t")
    public int field3485 = 0;

    @ObfuscatedName("ii.a")
    public int field3508 = 0;

    @ObfuscatedName("ii.ad")
    public int field3501 = 0;

    @ObfuscatedName("ii.ay")
    public int field3488 = 1;

    @ObfuscatedName("ii.am")
    public boolean field3489 = false;

    @ObfuscatedName("ii.ae")
    public String[] field3490 = new String[] { null, null, class226.field2835, null, null };

    @ObfuscatedName("ii.az")
    public String[] field3510 = new String[] { null, null, null, null, class226.field2921 };

    @ObfuscatedName("ii.ai")
    public int field3492 = -2;

    @ObfuscatedName("ii.ap")
    public int field3493 = -1;

    @ObfuscatedName("ii.al")
    public int field3494 = -1;

    @ObfuscatedName("ii.aw")
    public int field3495 = 0;

    @ObfuscatedName("ii.ak")
    public int field3519 = -1;

    @ObfuscatedName("ii.ax")
    public int field3497 = -1;

    @ObfuscatedName("ii.at")
    public int field3503 = 0;

    @ObfuscatedName("ii.ao")
    public int field3499 = -1;

    @ObfuscatedName("ii.aq")
    public int field3500 = -1;

    @ObfuscatedName("ii.ab")
    public int field3481 = -1;

    @ObfuscatedName("ii.as")
    public int field3502 = -1;

    @ObfuscatedName("ii.av")
    public int field3514 = -1;

    @ObfuscatedName("ii.ac")
    public int field3504 = -1;

    @ObfuscatedName("ii.ag")
    public int[] field3517;

    @ObfuscatedName("ii.au")
    public int[] field3506;

    @ObfuscatedName("ii.aa")
    public int field3507 = -1;

    @ObfuscatedName("ii.an")
    public int field3498 = -1;

    @ObfuscatedName("ii.aj")
    public int field3509 = 128;

    @ObfuscatedName("ii.af")
    public int field3486 = 128;

    @ObfuscatedName("ii.ah")
    public int field3513 = 128;

    @ObfuscatedName("ii.bz")
    public int field3512 = 0;

    @ObfuscatedName("ii.bo")
    public int field3468 = 0;

    @ObfuscatedName("ii.bp")
    public int field3470 = 0;

    @ObfuscatedName("ii.bh")
    public class187 field3471;

    @ObfuscatedName("ii.bs")
    public boolean field3516 = false;

    @ObfuscatedName("ii.bq")
    public int field3476 = -1;

    @ObfuscatedName("ii.bd")
    public int field3518 = -1;

    @ObfuscatedName("ii.bn")
    public int field3515 = -1;

    @ObfuscatedName("ii.bf")
    public int field3520 = -1;

    @ObfuscatedName("eq.e(Lin;Lin;ZLjf;I)V")
    public static void method2643(class236 arg0, class236 arg1, boolean arg2, class264 arg3) {
        Statics.field3511 = arg0;
        Statics.field3469 = arg1;
        Statics.field3480 = arg2;
        Statics.field1528 = Statics.field3511.method3771(10);
        Statics.field528 = arg3;
    }

    @ObfuscatedName("ii.m(B)V")
    public void method4200() {
    }

    @ObfuscatedName("ii.g(Lfw;B)V")
    public void method4201(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4202(arg0, var2);
        }
    }

    @ObfuscatedName("ii.d(Lfw;II)V")
    public void method4202(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3505 = arg0.method2930();
        } else if (arg1 == 2) {
            this.field3491 = arg0.method2899();
        } else if (arg1 == 4) {
            this.field3496 = arg0.method2930();
        } else if (arg1 == 5) {
            this.field3482 = arg0.method2930();
        } else if (arg1 == 6) {
            this.field3483 = arg0.method2930();
        } else if (arg1 == 7) {
            this.field3485 = arg0.method2930();
            if (this.field3485 > 32767) {
                this.field3485 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3508 = arg0.method2930();
            if (this.field3508 > 32767) {
                this.field3508 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3501 = 1;
        } else if (arg1 == 12) {
            this.field3488 = arg0.method2896();
        } else if (arg1 == 16) {
            this.field3489 = true;
        } else if (arg1 == 23) {
            this.field3493 = arg0.method2930();
            this.field3495 = arg0.method2891();
        } else if (arg1 == 24) {
            this.field3494 = arg0.method2930();
        } else if (arg1 == 25) {
            this.field3519 = arg0.method2930();
            this.field3503 = arg0.method2891();
        } else if (arg1 == 26) {
            this.field3497 = arg0.method2930();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3490[arg1 - 30] = arg0.method2899();
            if (this.field3490[arg1 - 30].equalsIgnoreCase(class226.field2837)) {
                this.field3490[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3510[arg1 - 35] = arg0.method2899();
        } else if (arg1 == 40) {
            int var3 = arg0.method2891();
            this.field3475 = new short[var3];
            this.field3478 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3475[var4] = (short) arg0.method2930();
                this.field3478[var4] = (short) arg0.method2930();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2891();
            this.field3487 = new short[var5];
            this.field3465 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3487[var6] = (short) arg0.method2930();
                this.field3465[var6] = (short) arg0.method2930();
            }
        } else if (arg1 == 42) {
            this.field3492 = arg0.method2944();
        } else if (arg1 == 65) {
            this.field3516 = true;
        } else if (arg1 == 78) {
            this.field3499 = arg0.method2930();
        } else if (arg1 == 79) {
            this.field3500 = arg0.method2930();
        } else if (arg1 == 90) {
            this.field3481 = arg0.method2930();
        } else if (arg1 == 91) {
            this.field3514 = arg0.method2930();
        } else if (arg1 == 92) {
            this.field3502 = arg0.method2930();
        } else if (arg1 == 93) {
            this.field3504 = arg0.method2930();
        } else if (arg1 == 95) {
            this.field3484 = arg0.method2930();
        } else if (arg1 == 97) {
            this.field3507 = arg0.method2930();
        } else if (arg1 == 98) {
            this.field3498 = arg0.method2930();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3517 == null) {
                this.field3517 = new int[10];
                this.field3506 = new int[10];
            }
            this.field3517[arg1 - 100] = arg0.method2930();
            this.field3506[arg1 - 100] = arg0.method2930();
        } else if (arg1 == 110) {
            this.field3509 = arg0.method2930();
        } else if (arg1 == 111) {
            this.field3486 = arg0.method2930();
        } else if (arg1 == 112) {
            this.field3513 = arg0.method2930();
        } else if (arg1 == 113) {
            this.field3512 = arg0.method2944();
        } else if (arg1 == 114) {
            this.field3468 = arg0.method2944();
        } else if (arg1 == 115) {
            this.field3470 = arg0.method2891();
        } else if (arg1 == 139) {
            this.field3476 = arg0.method2930();
        } else if (arg1 == 140) {
            this.field3518 = arg0.method2930();
        } else if (arg1 == 148) {
            this.field3515 = arg0.method2930();
        } else if (arg1 == 149) {
            this.field3520 = arg0.method2930();
        } else if (arg1 == 249) {
            this.field3471 = class250.method925(arg0, this.field3471);
        }
    }

    @ObfuscatedName("ii.b(Lii;Lii;B)V")
    public void method4234(class257 arg0, class257 arg1) {
        this.field3505 = arg0.field3505;
        this.field3496 = arg0.field3496;
        this.field3482 = arg0.field3482;
        this.field3483 = arg0.field3483;
        this.field3484 = arg0.field3484;
        this.field3485 = arg0.field3485;
        this.field3508 = arg0.field3508;
        this.field3475 = arg0.field3475;
        this.field3478 = arg0.field3478;
        this.field3487 = arg0.field3487;
        this.field3465 = arg0.field3465;
        this.field3491 = arg1.field3491;
        this.field3489 = arg1.field3489;
        this.field3488 = arg1.field3488;
        this.field3501 = 1;
    }

    @ObfuscatedName("ii.k(Lii;Lii;B)V")
    public void method4204(class257 arg0, class257 arg1) {
        this.field3505 = arg0.field3505;
        this.field3496 = arg0.field3496;
        this.field3482 = arg0.field3482;
        this.field3483 = arg0.field3483;
        this.field3484 = arg0.field3484;
        this.field3485 = arg0.field3485;
        this.field3508 = arg0.field3508;
        this.field3475 = arg1.field3475;
        this.field3478 = arg1.field3478;
        this.field3487 = arg1.field3487;
        this.field3465 = arg1.field3465;
        this.field3491 = arg1.field3491;
        this.field3489 = arg1.field3489;
        this.field3501 = arg1.field3501;
        this.field3493 = arg1.field3493;
        this.field3494 = arg1.field3494;
        this.field3499 = arg1.field3499;
        this.field3519 = arg1.field3519;
        this.field3497 = arg1.field3497;
        this.field3500 = arg1.field3500;
        this.field3481 = arg1.field3481;
        this.field3502 = arg1.field3502;
        this.field3514 = arg1.field3514;
        this.field3504 = arg1.field3504;
        this.field3470 = arg1.field3470;
        this.field3490 = arg1.field3490;
        this.field3510 = new String[5];
        if (arg1.field3510 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3510[var3] = arg1.field3510[var3];
            }
        }
        this.field3510[4] = class226.field2841;
        this.field3488 = 0;
    }

    @ObfuscatedName("ii.q(Lii;Lii;I)V")
    public void method4216(class257 arg0, class257 arg1) {
        this.field3505 = arg0.field3505;
        this.field3496 = arg0.field3496;
        this.field3482 = arg0.field3482;
        this.field3483 = arg0.field3483;
        this.field3484 = arg0.field3484;
        this.field3485 = arg0.field3485;
        this.field3508 = arg0.field3508;
        this.field3475 = arg0.field3475;
        this.field3478 = arg0.field3478;
        this.field3487 = arg0.field3487;
        this.field3465 = arg0.field3465;
        this.field3501 = arg0.field3501;
        this.field3491 = arg1.field3491;
        this.field3488 = 0;
        this.field3489 = false;
        this.field3516 = false;
    }

    @ObfuscatedName("ii.h(IB)Ldz;")
    public final class128 method4227(int arg0) {
        if (this.field3517 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3506[var3] && this.field3506[var3] != 0) {
                    var2 = this.field3517[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method461(var2).method4227(1);
            }
        }
        class128 var4 = class128.method2202(Statics.field3469, this.field3505, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3509 != 128 || this.field3486 != 128 || this.field3513 != 128) {
            var4.method2214(this.field3509, this.field3486, this.field3513);
        }
        if (this.field3475 != null) {
            for (int var5 = 0; var5 < this.field3475.length; var5++) {
                var4.method2189(this.field3475[var5], this.field3478[var5]);
            }
        }
        if (this.field3487 != null) {
            for (int var6 = 0; var6 < this.field3487.length; var6++) {
                var4.method2190(this.field3487[var6], this.field3465[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.i(IB)Leo;")
    public final class134 method4207(int arg0) {
        if (this.field3517 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3506[var3] && this.field3506[var3] != 0) {
                    var2 = this.field3517[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method461(var2).method4207(1);
            }
        }
        class134 var4 = (class134) field3472.method3248((long) this.field3474);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2202(Statics.field3469, this.field3505, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3509 != 128 || this.field3486 != 128 || this.field3513 != 128) {
            var5.method2214(this.field3509, this.field3486, this.field3513);
        }
        if (this.field3475 != null) {
            for (int var6 = 0; var6 < this.field3475.length; var6++) {
                var5.method2189(this.field3475[var6], this.field3478[var6]);
            }
        }
        if (this.field3487 != null) {
            for (int var7 = 0; var7 < this.field3487.length; var7++) {
                var5.method2190(this.field3487[var7], this.field3465[var7]);
            }
        }
        class134 var8 = var5.method2226(this.field3512 + 64, this.field3468 * 5 + 768, -50, -10, -50);
        var8.field1945 = true;
        field3472.method3250(var8, (long) this.field3474);
        return var8;
    }

    @ObfuscatedName("ii.s(IB)Lii;")
    public class257 method4219(int arg0) {
        if (this.field3517 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3506[var3] && this.field3506[var3] != 0) {
                    var2 = this.field3517[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method461(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fh.n(IIIIIZI)Lje;")
    public static final class286 method3102(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class286 var8 = (class286) field3473.method3248(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = Statics.method461(arg0);
        if (arg1 > 1 && var9.field3517 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3506[var11] && var9.field3506[var11] != 0) {
                    var10 = var9.field3517[var11];
                }
            }
            if (var10 != -1) {
                var9 = Statics.method461(var10);
            }
        }
        class134 var12 = var9.method4207(1);
        if (var12 == null) {
            return null;
        }
        class286 var13 = null;
        if (var9.field3498 != -1) {
            var13 = method3102(var9.field3507, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3518 != -1) {
            var13 = method3102(var9.field3476, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3520 != -1) {
            var13 = method3102(var9.field3515, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3748;
        int var15 = Statics.field3753;
        int var16 = Statics.field3750;
        int[] var17 = new int[4];
        class282.method4651(var17);
        class286 var18 = new class286(36, 32);
        class282.method4562(var18.field3779, 36, 32);
        class282.method4568();
        class137.method2382();
        class137.method2418(16, 16);
        class137.field2026 = false;
        if (var9.field3520 != -1) {
            var13.method4698(0, 0);
        }
        int var19 = var9.field3496;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field2034[var9.field3482] * var19 >> 16;
        int var21 = class137.field2035[var9.field3482] * var19 >> 16;
        var12.method2281();
        var12.method2293(0, var9.field3483, var9.field3484, var9.field3482, var9.field3485, var9.field3508 + var12.field2121 / 2 + var20, var9.field3508 + var21);
        if (var9.field3518 != -1) {
            var13.method4698(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4694(1);
        }
        if (arg2 >= 2) {
            var18.method4694(16777215);
        }
        if (arg3 != 0) {
            var18.method4695(arg3);
        }
        class282.method4562(var18.field3779, 36, 32);
        if (var9.field3498 != -1) {
            var13.method4698(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3501 == 1) {
            class264 var22 = Statics.field528;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class226.field2998 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class226.field3072 + "</col>";
            }
            var22.method4401(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3473.method3250(var18, var6);
        }
        class282.method4562(var14, var15, var16);
        class282.method4567(var17);
        class137.method2382();
        class137.field2026 = true;
        return var18;
    }

    @ObfuscatedName("ii.c(ZB)Z")
    public final boolean method4206(boolean arg0) {
        int var2 = this.field3493;
        int var3 = this.field3494;
        int var4 = this.field3499;
        if (arg0) {
            var2 = this.field3519;
            var3 = this.field3497;
            var4 = this.field3500;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3469.method3798(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3469.method3798(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3469.method3798(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ii.v(ZI)Ldz;")
    public final class128 method4210(boolean arg0) {
        int var2 = this.field3493;
        int var3 = this.field3494;
        int var4 = this.field3499;
        if (arg0) {
            var2 = this.field3519;
            var3 = this.field3497;
            var4 = this.field3500;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2202(Statics.field3469, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2202(Statics.field3469, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2202(Statics.field3469, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3495 != 0) {
            var5.method2188(0, this.field3495, 0);
        }
        if (arg0 && this.field3503 != 0) {
            var5.method2188(0, this.field3503, 0);
        }
        if (this.field3475 != null) {
            for (int var10 = 0; var10 < this.field3475.length; var10++) {
                var5.method2189(this.field3475[var10], this.field3478[var10]);
            }
        }
        if (this.field3487 != null) {
            for (int var11 = 0; var11 < this.field3487.length; var11++) {
                var5.method2190(this.field3487[var11], this.field3465[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ii.u(ZB)Z")
    public final boolean method4211(boolean arg0) {
        int var2 = this.field3481;
        int var3 = this.field3502;
        if (arg0) {
            var2 = this.field3514;
            var3 = this.field3504;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3469.method3798(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3469.method3798(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ii.w(ZI)Ldz;")
    public final class128 method4212(boolean arg0) {
        int var2 = this.field3481;
        int var3 = this.field3502;
        if (arg0) {
            var2 = this.field3514;
            var3 = this.field3504;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2202(Statics.field3469, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2202(Statics.field3469, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3475 != null) {
            for (int var7 = 0; var7 < this.field3475.length; var7++) {
                var4.method2189(this.field3475[var7], this.field3478[var7]);
            }
        }
        if (this.field3487 != null) {
            for (int var8 = 0; var8 < this.field3487.length; var8++) {
                var4.method2190(this.field3487[var8], this.field3465[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.p(III)I")
    public int method4217(int arg0, int arg1) {
        return class250.method2858(this.field3471, arg0, arg1);
    }

    @ObfuscatedName("ii.l(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4214(int arg0, String arg1) {
        return class250.method1539(this.field3471, arg0, arg1);
    }

    @ObfuscatedName("ii.x(I)I")
    public int method4199() {
        if (this.field3492 == -1 || this.field3510 == null) {
            return -1;
        } else if (this.field3492 >= 0) {
            return this.field3510[this.field3492] == null ? -1 : this.field3492;
        } else if (class226.field2921.equalsIgnoreCase(this.field3510[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fa.r(I)V")
    public static void method2809() {
        field3473.method3247();
    }
}
