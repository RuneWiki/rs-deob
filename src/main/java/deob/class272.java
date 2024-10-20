package deob;

@ObfuscatedName("ja")
public class class272 extends class209 {

    @ObfuscatedName("ja.s")
    public static class203 field3478 = new class203(64);

    @ObfuscatedName("ja.v")
    public static class203 field3479 = new class203(50);

    @ObfuscatedName("ja.k")
    public static class203 field3480 = new class203(200);

    @ObfuscatedName("ja.q")
    public int field3481;

    @ObfuscatedName("ja.l")
    public int field3482;

    @ObfuscatedName("ja.f")
    public String field3473 = class240.field2840;

    @ObfuscatedName("ja.z")
    public short[] field3513;

    @ObfuscatedName("ja.a")
    public short[] field3483;

    @ObfuscatedName("ja.x")
    public short[] field3486;

    @ObfuscatedName("ja.b")
    public short[] field3487;

    @ObfuscatedName("ja.w")
    public int field3524 = 2000;

    @ObfuscatedName("ja.g")
    public int field3475 = 0;

    @ObfuscatedName("ja.d")
    public int field3490 = 0;

    @ObfuscatedName("ja.m")
    public int field3491 = 0;

    @ObfuscatedName("ja.t")
    public int field3522 = 0;

    @ObfuscatedName("ja.h")
    public int field3493 = 0;

    @ObfuscatedName("ja.an")
    public int field3494 = 0;

    @ObfuscatedName("ja.al")
    public int field3488 = 1;

    @ObfuscatedName("ja.ah")
    public boolean field3484 = false;

    @ObfuscatedName("ja.ad")
    public String[] field3497 = new String[] { null, null, class240.field2872, null, null };

    @ObfuscatedName("ja.aa")
    public String[] field3509 = new String[] { null, null, null, null, class240.field2834 };

    @ObfuscatedName("ja.av")
    public int field3499 = -2;

    @ObfuscatedName("ja.am")
    public int field3500 = -1;

    @ObfuscatedName("ja.ap")
    public int field3501 = -1;

    @ObfuscatedName("ja.au")
    public int field3502 = 0;

    @ObfuscatedName("ja.ae")
    public int field3503 = -1;

    @ObfuscatedName("ja.ai")
    public int field3504 = -1;

    @ObfuscatedName("ja.ab")
    public int field3507 = 0;

    @ObfuscatedName("ja.aw")
    public int field3525 = -1;

    @ObfuscatedName("ja.ac")
    public int field3498 = -1;

    @ObfuscatedName("ja.aq")
    public int field3485 = -1;

    @ObfuscatedName("ja.az")
    public int field3489 = -1;

    @ObfuscatedName("ja.ay")
    public int field3510 = -1;

    @ObfuscatedName("ja.ao")
    public int field3511 = -1;

    @ObfuscatedName("ja.ak")
    public int[] field3512;

    @ObfuscatedName("ja.af")
    public int[] field3506;

    @ObfuscatedName("ja.ax")
    public int field3514 = -1;

    @ObfuscatedName("ja.ar")
    public int field3515 = -1;

    @ObfuscatedName("ja.at")
    public int field3516 = 128;

    @ObfuscatedName("ja.aj")
    public int field3517 = 128;

    @ObfuscatedName("ja.as")
    public int field3518 = 128;

    @ObfuscatedName("ja.br")
    public int field3519 = 0;

    @ObfuscatedName("ja.bd")
    public int field3520 = 0;

    @ObfuscatedName("ja.bp")
    public int field3521 = 0;

    @ObfuscatedName("ja.bk")
    public class200 field3496;

    @ObfuscatedName("ja.bm")
    public boolean field3492 = false;

    @ObfuscatedName("ja.bc")
    public int field3505 = -1;

    @ObfuscatedName("ja.bi")
    public int field3508 = -1;

    @ObfuscatedName("ja.bo")
    public int field3526 = -1;

    @ObfuscatedName("ja.bh")
    public int field3527 = -1;

    @ObfuscatedName("jp.y(IB)Lja;")
    public static class272 method4572(int arg0) {
        class272 var1 = (class272) field3478.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3495.method4263(10, arg0);
        class272 var3 = new class272();
        var3.field3481 = arg0;
        if (var2 != null) {
            var3.method4727(new class185(var2));
        }
        var3.method4761();
        if (var3.field3515 != -1) {
            var3.method4729(method4572(var3.field3515), method4572(var3.field3514));
        }
        if (var3.field3508 != -1) {
            var3.method4730(method4572(var3.field3508), method4572(var3.field3505));
        }
        if (var3.field3527 != -1) {
            var3.method4731(method4572(var3.field3527), method4572(var3.field3526));
        }
        if (!Statics.field3523 && var3.field3484) {
            var3.field3473 = class240.field3050;
            var3.field3492 = false;
            var3.field3497 = null;
            var3.field3509 = null;
            var3.field3499 = -1;
            var3.field3521 = 0;
            if (var3.field3496 != null) {
                boolean var4 = false;
                for (class207 var5 = var3.field3496.method3653(); var5 != null; var5 = var3.field3496.method3654()) {
                    class267 var6 = class267.method2458((int) var5.field2470);
                    if (var6.field3380) {
                        var5.method3766();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3496 = null;
                }
            }
        }
        field3478.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ja.c(I)V")
    public void method4761() {
    }

    @ObfuscatedName("ja.n(Lge;I)V")
    public void method4727(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4728(arg0, var2);
        }
    }

    @ObfuscatedName("ja.u(Lge;II)V")
    public void method4728(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3482 = arg0.method3280();
        } else if (arg1 == 2) {
            this.field3473 = arg0.method3277();
        } else if (arg1 == 4) {
            this.field3524 = arg0.method3280();
        } else if (arg1 == 5) {
            this.field3475 = arg0.method3280();
        } else if (arg1 == 6) {
            this.field3490 = arg0.method3280();
        } else if (arg1 == 7) {
            this.field3522 = arg0.method3280();
            if (this.field3522 > 32767) {
                this.field3522 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3493 = arg0.method3280();
            if (this.field3493 > 32767) {
                this.field3493 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3494 = 1;
        } else if (arg1 == 12) {
            this.field3488 = arg0.method3374();
        } else if (arg1 == 16) {
            this.field3484 = true;
        } else if (arg1 == 23) {
            this.field3500 = arg0.method3280();
            this.field3502 = arg0.method3299();
        } else if (arg1 == 24) {
            this.field3501 = arg0.method3280();
        } else if (arg1 == 25) {
            this.field3503 = arg0.method3280();
            this.field3507 = arg0.method3299();
        } else if (arg1 == 26) {
            this.field3504 = arg0.method3280();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3497[arg1 - 30] = arg0.method3277();
            if (this.field3497[arg1 - 30].equalsIgnoreCase(class240.field2835)) {
                this.field3497[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3509[arg1 - 35] = arg0.method3277();
        } else if (arg1 == 40) {
            int var3 = arg0.method3299();
            this.field3513 = new short[var3];
            this.field3483 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3513[var4] = (short) arg0.method3280();
                this.field3483[var4] = (short) arg0.method3280();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3299();
            this.field3486 = new short[var5];
            this.field3487 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3486[var6] = (short) arg0.method3280();
                this.field3487[var6] = (short) arg0.method3280();
            }
        } else if (arg1 == 42) {
            this.field3499 = arg0.method3319();
        } else if (arg1 == 65) {
            this.field3492 = true;
        } else if (arg1 == 78) {
            this.field3525 = arg0.method3280();
        } else if (arg1 == 79) {
            this.field3498 = arg0.method3280();
        } else if (arg1 == 90) {
            this.field3485 = arg0.method3280();
        } else if (arg1 == 91) {
            this.field3510 = arg0.method3280();
        } else if (arg1 == 92) {
            this.field3489 = arg0.method3280();
        } else if (arg1 == 93) {
            this.field3511 = arg0.method3280();
        } else if (arg1 == 95) {
            this.field3491 = arg0.method3280();
        } else if (arg1 == 97) {
            this.field3514 = arg0.method3280();
        } else if (arg1 == 98) {
            this.field3515 = arg0.method3280();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3512 == null) {
                this.field3512 = new int[10];
                this.field3506 = new int[10];
            }
            this.field3512[arg1 - 100] = arg0.method3280();
            this.field3506[arg1 - 100] = arg0.method3280();
        } else if (arg1 == 110) {
            this.field3516 = arg0.method3280();
        } else if (arg1 == 111) {
            this.field3517 = arg0.method3280();
        } else if (arg1 == 112) {
            this.field3518 = arg0.method3280();
        } else if (arg1 == 113) {
            this.field3519 = arg0.method3319();
        } else if (arg1 == 114) {
            this.field3520 = arg0.method3319() * 5;
        } else if (arg1 == 115) {
            this.field3521 = arg0.method3299();
        } else if (arg1 == 139) {
            this.field3505 = arg0.method3280();
        } else if (arg1 == 140) {
            this.field3508 = arg0.method3280();
        } else if (arg1 == 148) {
            this.field3526 = arg0.method3280();
        } else if (arg1 == 149) {
            this.field3527 = arg0.method3280();
        } else if (arg1 == 249) {
            this.field3496 = class265.method4229(arg0, this.field3496);
        }
    }

    @ObfuscatedName("ja.i(Lja;Lja;B)V")
    public void method4729(class272 arg0, class272 arg1) {
        this.field3482 = arg0.field3482;
        this.field3524 = arg0.field3524;
        this.field3475 = arg0.field3475;
        this.field3490 = arg0.field3490;
        this.field3491 = arg0.field3491;
        this.field3522 = arg0.field3522;
        this.field3493 = arg0.field3493;
        this.field3513 = arg0.field3513;
        this.field3483 = arg0.field3483;
        this.field3486 = arg0.field3486;
        this.field3487 = arg0.field3487;
        this.field3473 = arg1.field3473;
        this.field3484 = arg1.field3484;
        this.field3488 = arg1.field3488;
        this.field3494 = 1;
    }

    @ObfuscatedName("ja.p(Lja;Lja;I)V")
    public void method4730(class272 arg0, class272 arg1) {
        this.field3482 = arg0.field3482;
        this.field3524 = arg0.field3524;
        this.field3475 = arg0.field3475;
        this.field3490 = arg0.field3490;
        this.field3491 = arg0.field3491;
        this.field3522 = arg0.field3522;
        this.field3493 = arg0.field3493;
        this.field3513 = arg1.field3513;
        this.field3483 = arg1.field3483;
        this.field3486 = arg1.field3486;
        this.field3487 = arg1.field3487;
        this.field3473 = arg1.field3473;
        this.field3484 = arg1.field3484;
        this.field3494 = arg1.field3494;
        this.field3500 = arg1.field3500;
        this.field3501 = arg1.field3501;
        this.field3525 = arg1.field3525;
        this.field3503 = arg1.field3503;
        this.field3504 = arg1.field3504;
        this.field3498 = arg1.field3498;
        this.field3485 = arg1.field3485;
        this.field3489 = arg1.field3489;
        this.field3510 = arg1.field3510;
        this.field3511 = arg1.field3511;
        this.field3521 = arg1.field3521;
        this.field3497 = arg1.field3497;
        this.field3509 = new String[5];
        if (arg1.field3509 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3509[var3] = arg1.field3509[var3];
            }
        }
        this.field3509[4] = class240.field2839;
        this.field3488 = 0;
    }

    @ObfuscatedName("ja.e(Lja;Lja;I)V")
    public void method4731(class272 arg0, class272 arg1) {
        this.field3482 = arg0.field3482;
        this.field3524 = arg0.field3524;
        this.field3475 = arg0.field3475;
        this.field3490 = arg0.field3490;
        this.field3491 = arg0.field3491;
        this.field3522 = arg0.field3522;
        this.field3493 = arg0.field3493;
        this.field3513 = arg0.field3513;
        this.field3483 = arg0.field3483;
        this.field3486 = arg0.field3486;
        this.field3487 = arg0.field3487;
        this.field3494 = arg0.field3494;
        this.field3473 = arg1.field3473;
        this.field3488 = 0;
        this.field3484 = false;
        this.field3492 = false;
    }

    @ObfuscatedName("ja.s(II)Ldz;")
    public final class116 method4732(int arg0) {
        if (this.field3512 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3506[var3] && this.field3506[var3] != 0) {
                    var2 = this.field3512[var3];
                }
            }
            if (var2 != -1) {
                return method4572(var2).method4732(1);
            }
        }
        class116 var4 = class116.method2378(Statics.field3476, this.field3482, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3516 != 128 || this.field3517 != 128 || this.field3518 != 128) {
            var4.method2394(this.field3516, this.field3517, this.field3518);
        }
        if (this.field3513 != null) {
            for (int var5 = 0; var5 < this.field3513.length; var5++) {
                var4.method2386(this.field3513[var5], this.field3483[var5]);
            }
        }
        if (this.field3486 != null) {
            for (int var6 = 0; var6 < this.field3486.length; var6++) {
                var4.method2392(this.field3486[var6], this.field3487[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ja.v(IB)Lde;")
    public final class122 method4733(int arg0) {
        if (this.field3512 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3506[var3] && this.field3506[var3] != 0) {
                    var2 = this.field3512[var3];
                }
            }
            if (var2 != -1) {
                return method4572(var2).method4733(1);
            }
        }
        class122 var4 = (class122) field3479.method3685((long) this.field3481);
        if (var4 != null) {
            return var4;
        }
        class116 var5 = class116.method2378(Statics.field3476, this.field3482, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3516 != 128 || this.field3517 != 128 || this.field3518 != 128) {
            var5.method2394(this.field3516, this.field3517, this.field3518);
        }
        if (this.field3513 != null) {
            for (int var6 = 0; var6 < this.field3513.length; var6++) {
                var5.method2386(this.field3513[var6], this.field3483[var6]);
            }
        }
        if (this.field3486 != null) {
            for (int var7 = 0; var7 < this.field3486.length; var7++) {
                var5.method2392(this.field3486[var7], this.field3487[var7]);
            }
        }
        class122 var8 = var5.method2399(this.field3519 + 64, this.field3520 + 768, -50, -10, -50);
        var8.field1632 = true;
        field3479.method3687(var8, (long) this.field3481);
        return var8;
    }

    @ObfuscatedName("ja.k(IS)Lja;")
    public class272 method4734(int arg0) {
        if (this.field3512 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3506[var3] && this.field3506[var3] != 0) {
                    var2 = this.field3512[var3];
                }
            }
            if (var2 != -1) {
                return method4572(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ef.o(IIIIIZI)Llu;")
    public static final class324 method2865(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class324 var8 = (class324) field3480.method3685(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class272 var9 = method4572(arg0);
        if (arg1 > 1 && var9.field3512 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3506[var11] && var9.field3506[var11] != 0) {
                    var10 = var9.field3512[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4572(var10);
            }
        }
        class122 var12 = var9.method4733(1);
        if (var12 == null) {
            return null;
        }
        class324 var13 = null;
        if (var9.field3515 != -1) {
            var13 = method2865(var9.field3514, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3508 != -1) {
            var13 = method2865(var9.field3505, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3527 != -1) {
            var13 = method2865(var9.field3526, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3826;
        int var15 = Statics.field3821;
        int var16 = Statics.field3820;
        int[] var17 = new int[4];
        class320.method5366(var17);
        class324 var18 = new class324(36, 32);
        class320.method5362(var18.field3851, 36, 32);
        class320.method5361();
        class125.method2618();
        class125.method2608(16, 16);
        class125.field1735 = false;
        if (var9.field3527 != -1) {
            var13.method5569(0, 0);
        }
        int var19 = var9.field3524;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class125.field1747[var9.field3475] * var19 >> 16;
        int var21 = class125.field1748[var9.field3475] * var19 >> 16;
        var12.method2473();
        var12.method2490(0, var9.field3490, var9.field3491, var9.field3475, var9.field3522, var9.field3493 + var12.field1828 / 2 + var20, var9.field3493 + var21);
        if (var9.field3508 != -1) {
            var13.method5569(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5552(1);
        }
        if (arg2 >= 2) {
            var18.method5552(16777215);
        }
        if (arg3 != 0) {
            var18.method5562(arg3);
        }
        class320.method5362(var18.field3851, 36, 32);
        if (var9.field3515 != -1) {
            var13.method5569(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3494 == 1) {
            Statics.field1712.method5144(method79(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3480.method3687(var18, var6);
        }
        class320.method5362(var14, var15, var16);
        class320.method5367(var17);
        class125.method2618();
        class125.field1735 = true;
        return var18;
    }

    @ObfuscatedName("p.q(II)Ljava/lang/String;")
    public static final String method79(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class240.field3000 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class240.field2998 + "</col>";
        }
    }

    @ObfuscatedName("ja.l(ZB)Z")
    public final boolean method4764(boolean arg0) {
        int var2 = this.field3500;
        int var3 = this.field3501;
        int var4 = this.field3525;
        if (arg0) {
            var2 = this.field3503;
            var3 = this.field3504;
            var4 = this.field3498;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3476.method4323(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3476.method4323(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3476.method4323(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ja.f(ZB)Ldz;")
    public final class116 method4736(boolean arg0) {
        int var2 = this.field3500;
        int var3 = this.field3501;
        int var4 = this.field3525;
        if (arg0) {
            var2 = this.field3503;
            var3 = this.field3504;
            var4 = this.field3498;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var5 = class116.method2378(Statics.field3476, var2, 0);
        if (var3 != -1) {
            class116 var6 = class116.method2378(Statics.field3476, var3, 0);
            if (var4 == -1) {
                class116[] var9 = new class116[] { var5, var6 };
                var5 = new class116(var9, 2);
            } else {
                class116 var7 = class116.method2378(Statics.field3476, var4, 0);
                class116[] var8 = new class116[] { var5, var6, var7 };
                var5 = new class116(var8, 3);
            }
        }
        if (!arg0 && this.field3502 != 0) {
            var5.method2447(0, this.field3502, 0);
        }
        if (arg0 && this.field3507 != 0) {
            var5.method2447(0, this.field3507, 0);
        }
        if (this.field3513 != null) {
            for (int var10 = 0; var10 < this.field3513.length; var10++) {
                var5.method2386(this.field3513[var10], this.field3483[var10]);
            }
        }
        if (this.field3486 != null) {
            for (int var11 = 0; var11 < this.field3486.length; var11++) {
                var5.method2392(this.field3486[var11], this.field3487[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ja.z(ZI)Z")
    public final boolean method4735(boolean arg0) {
        int var2 = this.field3485;
        int var3 = this.field3489;
        if (arg0) {
            var2 = this.field3510;
            var3 = this.field3511;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3476.method4323(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3476.method4323(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ja.a(ZI)Ldz;")
    public final class116 method4742(boolean arg0) {
        int var2 = this.field3485;
        int var3 = this.field3489;
        if (arg0) {
            var2 = this.field3510;
            var3 = this.field3511;
        }
        if (var2 == -1) {
            return null;
        }
        class116 var4 = class116.method2378(Statics.field3476, var2, 0);
        if (var3 != -1) {
            class116 var5 = class116.method2378(Statics.field3476, var3, 0);
            class116[] var6 = new class116[] { var4, var5 };
            var4 = new class116(var6, 2);
        }
        if (this.field3513 != null) {
            for (int var7 = 0; var7 < this.field3513.length; var7++) {
                var4.method2386(this.field3513[var7], this.field3483[var7]);
            }
        }
        if (this.field3486 != null) {
            for (int var8 = 0; var8 < this.field3486.length; var8++) {
                var4.method2392(this.field3486[var8], this.field3487[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ja.x(III)I")
    public int method4739(int arg0, int arg1) {
        return class265.method4405(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("ja.b(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4740(int arg0, String arg1) {
        return class265.method966(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("ja.w(I)I")
    public int method4763() {
        if (this.field3499 == -1 || this.field3509 == null) {
            return -1;
        } else if (this.field3499 >= 0) {
            return this.field3509[this.field3499] == null ? -1 : this.field3499;
        } else if (class240.field2834.equalsIgnoreCase(this.field3509[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("gx.g(I)V")
    public static void method3530() {
        field3478.method3695();
        field3479.method3695();
        field3480.method3695();
    }

    @ObfuscatedName("il.m(ZS)V")
    public static void method4233(boolean arg0) {
        if (Statics.field3523 != arg0) {
            method3530();
            Statics.field3523 = arg0;
        }
    }
}
