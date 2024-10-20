package deob;

@ObfuscatedName("io")
public class class257 extends class195 {

    @ObfuscatedName("io.t")
    public static class190 field3493 = new class190(64);

    @ObfuscatedName("io.y")
    public static class190 field3494 = new class190(50);

    @ObfuscatedName("io.o")
    public static class190 field3510 = new class190(200);

    @ObfuscatedName("io.u")
    public int field3497;

    @ObfuscatedName("io.b")
    public int field3498;

    @ObfuscatedName("io.f")
    public String field3499 = "null";

    @ObfuscatedName("io.j")
    public short[] field3501;

    @ObfuscatedName("io.x")
    public short[] field3528;

    @ObfuscatedName("io.c")
    public short[] field3502;

    @ObfuscatedName("io.h")
    public short[] field3503;

    @ObfuscatedName("io.a")
    public int field3538 = 2000;

    @ObfuscatedName("io.z")
    public int field3505 = 0;

    @ObfuscatedName("io.l")
    public int field3506 = 0;

    @ObfuscatedName("io.w")
    public int field3507 = 0;

    @ObfuscatedName("io.n")
    public int field3540 = 0;

    @ObfuscatedName("io.m")
    public int field3509 = 0;

    @ObfuscatedName("io.ae")
    public int field3512 = 0;

    @ObfuscatedName("io.ai")
    public int field3511 = 1;

    @ObfuscatedName("io.ah")
    public boolean field3508 = false;

    @ObfuscatedName("io.ab")
    public String[] field3534 = new String[] { null, null, class226.field3104, null, null };

    @ObfuscatedName("io.ad")
    public String[] field3514 = new String[] { null, null, null, null, class226.field2859 };

    @ObfuscatedName("io.as")
    public int field3504 = -2;

    @ObfuscatedName("io.af")
    public int field3516 = -1;

    @ObfuscatedName("io.aq")
    public int field3526 = -1;

    @ObfuscatedName("io.am")
    public int field3518 = 0;

    @ObfuscatedName("io.az")
    public int field3490 = -1;

    @ObfuscatedName("io.av")
    public int field3520 = -1;

    @ObfuscatedName("io.an")
    public int field3521 = 0;

    @ObfuscatedName("io.ar")
    public int field3522 = -1;

    @ObfuscatedName("io.aa")
    public int field3523 = -1;

    @ObfuscatedName("io.aj")
    public int field3500 = -1;

    @ObfuscatedName("io.ap")
    public int field3525 = -1;

    @ObfuscatedName("io.ao")
    public int field3531 = -1;

    @ObfuscatedName("io.at")
    public int field3536 = -1;

    @ObfuscatedName("io.aw")
    public int[] field3524;

    @ObfuscatedName("io.ax")
    public int[] field3529;

    @ObfuscatedName("io.ac")
    public int field3530 = -1;

    @ObfuscatedName("io.au")
    public int field3537 = -1;

    @ObfuscatedName("io.al")
    public int field3532 = 128;

    @ObfuscatedName("io.ay")
    public int field3533 = 128;

    @ObfuscatedName("io.ak")
    public int field3519 = 128;

    @ObfuscatedName("io.bj")
    public int field3535 = 0;

    @ObfuscatedName("io.bf")
    public int field3541 = 0;

    @ObfuscatedName("io.bq")
    public int field3527 = 0;

    @ObfuscatedName("io.bc")
    public class187 field3495;

    @ObfuscatedName("io.by")
    public boolean field3539 = false;

    @ObfuscatedName("io.bb")
    public int field3496 = -1;

    @ObfuscatedName("io.bn")
    public int field3515 = -1;

    @ObfuscatedName("io.bd")
    public int field3542 = -1;

    @ObfuscatedName("io.bl")
    public int field3543 = -1;

    @ObfuscatedName("ax.d(IB)Lio;")
    public static class257 method637(int arg0) {
        class257 var1 = (class257) field3493.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field301.method3875(10, arg0);
        class257 var3 = new class257();
        var3.field3497 = arg0;
        if (var2 != null) {
            var3.method4338(new class174(var2));
        }
        var3.method4302();
        if (var3.field3537 != -1) {
            var3.method4318(method637(var3.field3537), method637(var3.field3530));
        }
        if (var3.field3515 != -1) {
            var3.method4306(method637(var3.field3515), method637(var3.field3496));
        }
        if (var3.field3543 != -1) {
            var3.method4303(method637(var3.field3543), method637(var3.field3542));
        }
        if (!Statics.field617 && var3.field3508) {
            var3.field3499 = class226.field3012;
            var3.field3539 = false;
            var3.field3534 = null;
            var3.field3514 = null;
            var3.field3504 = -1;
            var3.field3527 = 0;
            if (var3.field3495 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3495.method3316(); var5 != null; var5 = var3.field3495.method3317()) {
                    class252 var6 = class252.method2786((int) var5.field2486);
                    if (var6.field3391) {
                        var5.method3407();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3495 = null;
                }
            }
        }
        field3493.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.k(B)V")
    public void method4302() {
    }

    @ObfuscatedName("io.e(Lfg;I)V")
    public void method4338(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4304(arg0, var2);
        }
    }

    @ObfuscatedName("io.p(Lfg;II)V")
    public void method4304(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3498 = arg0.method3035();
        } else if (arg1 == 2) {
            this.field3499 = arg0.method2964();
        } else if (arg1 == 4) {
            this.field3538 = arg0.method3035();
        } else if (arg1 == 5) {
            this.field3505 = arg0.method3035();
        } else if (arg1 == 6) {
            this.field3506 = arg0.method3035();
        } else if (arg1 == 7) {
            this.field3540 = arg0.method3035();
            if (this.field3540 > 32767) {
                this.field3540 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3509 = arg0.method3035();
            if (this.field3509 > 32767) {
                this.field3509 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3512 = 1;
        } else if (arg1 == 12) {
            this.field3511 = arg0.method2960();
        } else if (arg1 == 16) {
            this.field3508 = true;
        } else if (arg1 == 23) {
            this.field3516 = arg0.method3035();
            this.field3518 = arg0.method2955();
        } else if (arg1 == 24) {
            this.field3526 = arg0.method3035();
        } else if (arg1 == 25) {
            this.field3490 = arg0.method3035();
            this.field3521 = arg0.method2955();
        } else if (arg1 == 26) {
            this.field3520 = arg0.method3035();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3534[arg1 - 30] = arg0.method2964();
            if (this.field3534[arg1 - 30].equalsIgnoreCase(class226.field2860)) {
                this.field3534[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3514[arg1 - 35] = arg0.method2964();
        } else if (arg1 == 40) {
            int var3 = arg0.method2955();
            this.field3501 = new short[var3];
            this.field3528 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3501[var4] = (short) arg0.method3035();
                this.field3528[var4] = (short) arg0.method3035();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2955();
            this.field3502 = new short[var5];
            this.field3503 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3502[var6] = (short) arg0.method3035();
                this.field3503[var6] = (short) arg0.method3035();
            }
        } else if (arg1 == 42) {
            this.field3504 = arg0.method2956();
        } else if (arg1 == 65) {
            this.field3539 = true;
        } else if (arg1 == 78) {
            this.field3522 = arg0.method3035();
        } else if (arg1 == 79) {
            this.field3523 = arg0.method3035();
        } else if (arg1 == 90) {
            this.field3500 = arg0.method3035();
        } else if (arg1 == 91) {
            this.field3531 = arg0.method3035();
        } else if (arg1 == 92) {
            this.field3525 = arg0.method3035();
        } else if (arg1 == 93) {
            this.field3536 = arg0.method3035();
        } else if (arg1 == 95) {
            this.field3507 = arg0.method3035();
        } else if (arg1 == 97) {
            this.field3530 = arg0.method3035();
        } else if (arg1 == 98) {
            this.field3537 = arg0.method3035();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3524 == null) {
                this.field3524 = new int[10];
                this.field3529 = new int[10];
            }
            this.field3524[arg1 - 100] = arg0.method3035();
            this.field3529[arg1 - 100] = arg0.method3035();
        } else if (arg1 == 110) {
            this.field3532 = arg0.method3035();
        } else if (arg1 == 111) {
            this.field3533 = arg0.method3035();
        } else if (arg1 == 112) {
            this.field3519 = arg0.method3035();
        } else if (arg1 == 113) {
            this.field3535 = arg0.method2956();
        } else if (arg1 == 114) {
            this.field3541 = arg0.method2956() * 5;
        } else if (arg1 == 115) {
            this.field3527 = arg0.method2955();
        } else if (arg1 == 139) {
            this.field3496 = arg0.method3035();
        } else if (arg1 == 140) {
            this.field3515 = arg0.method3035();
        } else if (arg1 == 148) {
            this.field3542 = arg0.method3035();
        } else if (arg1 == 149) {
            this.field3543 = arg0.method3035();
        } else if (arg1 == 249) {
            this.field3495 = class250.method535(arg0, this.field3495);
        }
    }

    @ObfuscatedName("io.q(Lio;Lio;I)V")
    public void method4318(class257 arg0, class257 arg1) {
        this.field3498 = arg0.field3498;
        this.field3538 = arg0.field3538;
        this.field3505 = arg0.field3505;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3540 = arg0.field3540;
        this.field3509 = arg0.field3509;
        this.field3501 = arg0.field3501;
        this.field3528 = arg0.field3528;
        this.field3502 = arg0.field3502;
        this.field3503 = arg0.field3503;
        this.field3499 = arg1.field3499;
        this.field3508 = arg1.field3508;
        this.field3511 = arg1.field3511;
        this.field3512 = 1;
    }

    @ObfuscatedName("io.s(Lio;Lio;B)V")
    public void method4306(class257 arg0, class257 arg1) {
        this.field3498 = arg0.field3498;
        this.field3538 = arg0.field3538;
        this.field3505 = arg0.field3505;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3540 = arg0.field3540;
        this.field3509 = arg0.field3509;
        this.field3501 = arg1.field3501;
        this.field3528 = arg1.field3528;
        this.field3502 = arg1.field3502;
        this.field3503 = arg1.field3503;
        this.field3499 = arg1.field3499;
        this.field3508 = arg1.field3508;
        this.field3512 = arg1.field3512;
        this.field3516 = arg1.field3516;
        this.field3526 = arg1.field3526;
        this.field3522 = arg1.field3522;
        this.field3490 = arg1.field3490;
        this.field3520 = arg1.field3520;
        this.field3523 = arg1.field3523;
        this.field3500 = arg1.field3500;
        this.field3525 = arg1.field3525;
        this.field3531 = arg1.field3531;
        this.field3536 = arg1.field3536;
        this.field3527 = arg1.field3527;
        this.field3534 = arg1.field3534;
        this.field3514 = new String[5];
        if (arg1.field3514 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3514[var3] = arg1.field3514[var3];
            }
        }
        this.field3514[4] = class226.field2864;
        this.field3511 = 0;
    }

    @ObfuscatedName("io.r(Lio;Lio;I)V")
    public void method4303(class257 arg0, class257 arg1) {
        this.field3498 = arg0.field3498;
        this.field3538 = arg0.field3538;
        this.field3505 = arg0.field3505;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3540 = arg0.field3540;
        this.field3509 = arg0.field3509;
        this.field3501 = arg0.field3501;
        this.field3528 = arg0.field3528;
        this.field3502 = arg0.field3502;
        this.field3503 = arg0.field3503;
        this.field3512 = arg0.field3512;
        this.field3499 = arg1.field3499;
        this.field3511 = 0;
        this.field3508 = false;
        this.field3539 = false;
    }

    @ObfuscatedName("io.g(IB)Ldl;")
    public final class126 method4354(int arg0) {
        if (this.field3524 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3524[var3];
                }
            }
            if (var2 != -1) {
                return method637(var2).method4354(1);
            }
        }
        class126 var4 = class126.method2268(Statics.field1407, this.field3498, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3532 != 128 || this.field3533 != 128 || this.field3519 != 128) {
            var4.method2285(this.field3532, this.field3533, this.field3519);
        }
        if (this.field3501 != null) {
            for (int var5 = 0; var5 < this.field3501.length; var5++) {
                var4.method2284(this.field3501[var5], this.field3528[var5]);
            }
        }
        if (this.field3502 != null) {
            for (int var6 = 0; var6 < this.field3502.length; var6++) {
                var4.method2283(this.field3502[var6], this.field3503[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("io.v(II)Leb;")
    public final class132 method4325(int arg0) {
        if (this.field3524 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3524[var3];
                }
            }
            if (var2 != -1) {
                return method637(var2).method4325(1);
            }
        }
        class132 var4 = (class132) field3494.method3341((long) this.field3497);
        if (var4 != null) {
            return var4;
        }
        class126 var5 = class126.method2268(Statics.field1407, this.field3498, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3532 != 128 || this.field3533 != 128 || this.field3519 != 128) {
            var5.method2285(this.field3532, this.field3533, this.field3519);
        }
        if (this.field3501 != null) {
            for (int var6 = 0; var6 < this.field3501.length; var6++) {
                var5.method2284(this.field3501[var6], this.field3528[var6]);
            }
        }
        if (this.field3502 != null) {
            for (int var7 = 0; var7 < this.field3502.length; var7++) {
                var5.method2283(this.field3502[var7], this.field3503[var7]);
            }
        }
        class132 var8 = var5.method2290(this.field3535 + 64, this.field3541 + 768, -50, -10, -50);
        var8.field1939 = true;
        field3494.method3343(var8, (long) this.field3497);
        return var8;
    }

    @ObfuscatedName("io.t(IB)Lio;")
    public class257 method4356(int arg0) {
        if (this.field3524 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3524[var3];
                }
            }
            if (var2 != -1) {
                return method637(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("w.y(IIIIIZI)Lkr;")
    public static final class287 method156(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class287 var8 = (class287) field3510.method3341(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = method637(arg0);
        if (arg1 > 1 && var9.field3524 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3529[var11] && var9.field3529[var11] != 0) {
                    var10 = var9.field3524[var11];
                }
            }
            if (var10 != -1) {
                var9 = method637(var10);
            }
        }
        class132 var12 = var9.method4325(1);
        if (var12 == null) {
            return null;
        }
        class287 var13 = null;
        if (var9.field3537 != -1) {
            var13 = method156(var9.field3530, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3515 != -1) {
            var13 = method156(var9.field3496, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3543 != -1) {
            var13 = method156(var9.field3542, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3774;
        int var15 = Statics.field3769;
        int var16 = Statics.field3770;
        int[] var17 = new int[4];
        class283.method4681(var17);
        class287 var18 = new class287(36, 32);
        class283.method4677(var18.field3796, 36, 32);
        class283.method4683();
        class135.method2450();
        class135.method2452(16, 16);
        class135.field2000 = false;
        if (var9.field3543 != -1) {
            var13.method4794(0, 0);
        }
        int var19 = var9.field3538;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class135.field2016[var9.field3505] * var19 >> 16;
        int var21 = class135.field2023[var9.field3505] * var19 >> 16;
        var12.method2364();
        var12.method2377(0, var9.field3506, var9.field3507, var9.field3505, var9.field3540, var9.field3509 + var12.field2115 / 2 + var20, var9.field3509 + var21);
        if (var9.field3515 != -1) {
            var13.method4794(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4793(1);
        }
        if (arg2 >= 2) {
            var18.method4793(16777215);
        }
        if (arg3 != 0) {
            var18.method4815(arg3);
        }
        class283.method4677(var18.field3796, 36, 32);
        if (var9.field3537 != -1) {
            var13.method4794(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3512 == 1) {
            class264 var22 = Statics.field3489;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class226.field3021 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class226.field2949 + "</col>";
            }
            var22.method4480(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3510.method3343(var18, var6);
        }
        class283.method4677(var14, var15, var16);
        class283.method4682(var17);
        class135.method2450();
        class135.field2000 = true;
        return var18;
    }

    @ObfuscatedName("io.o(ZI)Z")
    public final boolean method4311(boolean arg0) {
        int var2 = this.field3516;
        int var3 = this.field3526;
        int var4 = this.field3522;
        if (arg0) {
            var2 = this.field3490;
            var3 = this.field3520;
            var4 = this.field3523;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1407.method3894(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1407.method3894(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1407.method3894(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("io.i(ZB)Ldl;")
    public final class126 method4312(boolean arg0) {
        int var2 = this.field3516;
        int var3 = this.field3526;
        int var4 = this.field3522;
        if (arg0) {
            var2 = this.field3490;
            var3 = this.field3520;
            var4 = this.field3523;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var5 = class126.method2268(Statics.field1407, var2, 0);
        if (var3 != -1) {
            class126 var6 = class126.method2268(Statics.field1407, var3, 0);
            if (var4 == -1) {
                class126[] var9 = new class126[] { var5, var6 };
                var5 = new class126(var9, 2);
            } else {
                class126 var7 = class126.method2268(Statics.field1407, var4, 0);
                class126[] var8 = new class126[] { var5, var6, var7 };
                var5 = new class126(var8, 3);
            }
        }
        if (!arg0 && this.field3518 != 0) {
            var5.method2281(0, this.field3518, 0);
        }
        if (arg0 && this.field3521 != 0) {
            var5.method2281(0, this.field3521, 0);
        }
        if (this.field3501 != null) {
            for (int var10 = 0; var10 < this.field3501.length; var10++) {
                var5.method2284(this.field3501[var10], this.field3528[var10]);
            }
        }
        if (this.field3502 != null) {
            for (int var11 = 0; var11 < this.field3502.length; var11++) {
                var5.method2283(this.field3502[var11], this.field3503[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("io.u(ZI)Z")
    public final boolean method4329(boolean arg0) {
        int var2 = this.field3500;
        int var3 = this.field3525;
        if (arg0) {
            var2 = this.field3531;
            var3 = this.field3536;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1407.method3894(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1407.method3894(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("io.x(ZB)Ldl;")
    public final class126 method4313(boolean arg0) {
        int var2 = this.field3500;
        int var3 = this.field3525;
        if (arg0) {
            var2 = this.field3531;
            var3 = this.field3536;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var4 = class126.method2268(Statics.field1407, var2, 0);
        if (var3 != -1) {
            class126 var5 = class126.method2268(Statics.field1407, var3, 0);
            class126[] var6 = new class126[] { var4, var5 };
            var4 = new class126(var6, 2);
        }
        if (this.field3501 != null) {
            for (int var7 = 0; var7 < this.field3501.length; var7++) {
                var4.method2284(this.field3501[var7], this.field3528[var7]);
            }
        }
        if (this.field3502 != null) {
            for (int var8 = 0; var8 < this.field3502.length; var8++) {
                var4.method2283(this.field3502[var8], this.field3503[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("io.c(III)I")
    public int method4309(int arg0, int arg1) {
        return class250.method3871(this.field3495, arg0, arg1);
    }

    @ObfuscatedName("io.h(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4316(int arg0, String arg1) {
        return class250.method1625(this.field3495, arg0, arg1);
    }

    @ObfuscatedName("io.a(I)I")
    public int method4317() {
        if (this.field3504 == -1 || this.field3514 == null) {
            return -1;
        } else if (this.field3504 >= 0) {
            return this.field3514[this.field3504] == null ? -1 : this.field3504;
        } else if (class226.field2859.equalsIgnoreCase(this.field3514[4])) {
            return 4;
        } else {
            return -1;
        }
    }
}
