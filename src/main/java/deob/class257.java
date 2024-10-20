package deob;

@ObfuscatedName("iz")
public class class257 extends class195 {

    @ObfuscatedName("iz.p")
    public static class190 field3533 = new class190(64);

    @ObfuscatedName("iz.m")
    public static class190 field3494 = new class190(50);

    @ObfuscatedName("iz.u")
    public static class190 field3538 = new class190(200);

    @ObfuscatedName("iz.k")
    public int field3497;

    @ObfuscatedName("iz.t")
    public int field3544;

    @ObfuscatedName("iz.c")
    public String field3499 = "null";

    @ObfuscatedName("iz.o")
    public short[] field3500;

    @ObfuscatedName("iz.x")
    public short[] field3501;

    @ObfuscatedName("iz.f")
    public short[] field3518;

    @ObfuscatedName("iz.h")
    public short[] field3503;

    @ObfuscatedName("iz.z")
    public int field3504 = 2000;

    @ObfuscatedName("iz.i")
    public int field3521 = 0;

    @ObfuscatedName("iz.d")
    public int field3506 = 0;

    @ObfuscatedName("iz.b")
    public int field3490 = 0;

    @ObfuscatedName("iz.q")
    public int field3508 = 0;

    @ObfuscatedName("iz.y")
    public int field3509 = 0;

    @ObfuscatedName("iz.ai")
    public int field3510 = 0;

    @ObfuscatedName("iz.ae")
    public int field3511 = 1;

    @ObfuscatedName("iz.au")
    public boolean field3512 = false;

    @ObfuscatedName("iz.ak")
    public String[] field3513 = new String[] { null, null, class226.field2861, null, null };

    @ObfuscatedName("iz.ap")
    public String[] field3514 = new String[] { null, null, null, null, class226.field2862 };

    @ObfuscatedName("iz.am")
    public int field3515 = -2;

    @ObfuscatedName("iz.aw")
    public int field3516 = -1;

    @ObfuscatedName("iz.aq")
    public int field3517 = -1;

    @ObfuscatedName("iz.aa")
    public int field3531 = 0;

    @ObfuscatedName("iz.ag")
    public int field3524 = -1;

    @ObfuscatedName("iz.aj")
    public int field3495 = -1;

    @ObfuscatedName("iz.ax")
    public int field3528 = 0;

    @ObfuscatedName("iz.ad")
    public int field3522 = -1;

    @ObfuscatedName("iz.az")
    public int field3502 = -1;

    @ObfuscatedName("iz.as")
    public int field3507 = -1;

    @ObfuscatedName("iz.av")
    public int field3520 = -1;

    @ObfuscatedName("iz.ab")
    public int field3526 = -1;

    @ObfuscatedName("iz.at")
    public int field3527 = -1;

    @ObfuscatedName("iz.al")
    public int[] field3485;

    @ObfuscatedName("iz.ah")
    public int[] field3529;

    @ObfuscatedName("iz.an")
    public int field3530 = -1;

    @ObfuscatedName("iz.ay")
    public int field3525 = -1;

    @ObfuscatedName("iz.ao")
    public int field3532 = 128;

    @ObfuscatedName("iz.ac")
    public int field3498 = 128;

    @ObfuscatedName("iz.af")
    public int field3534 = 128;

    @ObfuscatedName("iz.bp")
    public int field3535 = 0;

    @ObfuscatedName("iz.bi")
    public int field3536 = 0;

    @ObfuscatedName("iz.ba")
    public int field3537 = 0;

    @ObfuscatedName("iz.bd")
    public class187 field3542;

    @ObfuscatedName("iz.bl")
    public boolean field3539 = false;

    @ObfuscatedName("iz.bc")
    public int field3540 = -1;

    @ObfuscatedName("iz.bb")
    public int field3541 = -1;

    @ObfuscatedName("iz.bn")
    public int field3493 = -1;

    @ObfuscatedName("iz.bs")
    public int field3543 = -1;

    @ObfuscatedName("cu.j(II)Liz;")
    public static class257 method1498(int arg0) {
        class257 var1 = (class257) field3533.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2052.method3787(10, arg0);
        class257 var3 = new class257();
        var3.field3497 = arg0;
        if (var2 != null) {
            var3.method4214(new class174(var2));
        }
        var3.method4194();
        if (var3.field3525 != -1) {
            var3.method4218(method1498(var3.field3525), method1498(var3.field3530));
        }
        if (var3.field3541 != -1) {
            var3.method4201(method1498(var3.field3541), method1498(var3.field3540));
        }
        if (var3.field3543 != -1) {
            var3.method4176(method1498(var3.field3543), method1498(var3.field3493));
        }
        if (!Statics.field3491 && var3.field3512) {
            var3.field3499 = class226.field3039;
            var3.field3539 = false;
            var3.field3513 = null;
            var3.field3514 = null;
            var3.field3515 = -1;
            var3.field3537 = 0;
            if (var3.field3542 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3542.method3208(); var5 != null; var5 = var3.field3542.method3209()) {
                    class252 var6 = class252.method3752((int) var5.field2467);
                    if (var6.field3390) {
                        var5.method3308();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3542 = null;
                }
            }
        }
        field3533.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.n(I)V")
    public void method4194() {
    }

    @ObfuscatedName("iz.r(Lfe;I)V")
    public void method4214(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4227(arg0, var2);
        }
    }

    @ObfuscatedName("iz.v(Lfe;II)V")
    public void method4227(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3544 = arg0.method2873();
        } else if (arg1 == 2) {
            this.field3499 = arg0.method2879();
        } else if (arg1 == 4) {
            this.field3504 = arg0.method2873();
        } else if (arg1 == 5) {
            this.field3521 = arg0.method2873();
        } else if (arg1 == 6) {
            this.field3506 = arg0.method2873();
        } else if (arg1 == 7) {
            this.field3508 = arg0.method2873();
            if (this.field3508 > 32767) {
                this.field3508 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3509 = arg0.method2873();
            if (this.field3509 > 32767) {
                this.field3509 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3510 = 1;
        } else if (arg1 == 12) {
            this.field3511 = arg0.method2876();
        } else if (arg1 == 16) {
            this.field3512 = true;
        } else if (arg1 == 23) {
            this.field3516 = arg0.method2873();
            this.field3531 = arg0.method2871();
        } else if (arg1 == 24) {
            this.field3517 = arg0.method2873();
        } else if (arg1 == 25) {
            this.field3524 = arg0.method2873();
            this.field3528 = arg0.method2871();
        } else if (arg1 == 26) {
            this.field3495 = arg0.method2873();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3513[arg1 - 30] = arg0.method2879();
            if (this.field3513[arg1 - 30].equalsIgnoreCase(class226.field3139)) {
                this.field3513[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3514[arg1 - 35] = arg0.method2879();
        } else if (arg1 == 40) {
            int var3 = arg0.method2871();
            this.field3500 = new short[var3];
            this.field3501 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3500[var4] = (short) arg0.method2873();
                this.field3501[var4] = (short) arg0.method2873();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2871();
            this.field3518 = new short[var5];
            this.field3503 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3518[var6] = (short) arg0.method2873();
                this.field3503[var6] = (short) arg0.method2873();
            }
        } else if (arg1 == 42) {
            this.field3515 = arg0.method2872();
        } else if (arg1 == 65) {
            this.field3539 = true;
        } else if (arg1 == 78) {
            this.field3522 = arg0.method2873();
        } else if (arg1 == 79) {
            this.field3502 = arg0.method2873();
        } else if (arg1 == 90) {
            this.field3507 = arg0.method2873();
        } else if (arg1 == 91) {
            this.field3526 = arg0.method2873();
        } else if (arg1 == 92) {
            this.field3520 = arg0.method2873();
        } else if (arg1 == 93) {
            this.field3527 = arg0.method2873();
        } else if (arg1 == 95) {
            this.field3490 = arg0.method2873();
        } else if (arg1 == 97) {
            this.field3530 = arg0.method2873();
        } else if (arg1 == 98) {
            this.field3525 = arg0.method2873();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3485 == null) {
                this.field3485 = new int[10];
                this.field3529 = new int[10];
            }
            this.field3485[arg1 - 100] = arg0.method2873();
            this.field3529[arg1 - 100] = arg0.method2873();
        } else if (arg1 == 110) {
            this.field3532 = arg0.method2873();
        } else if (arg1 == 111) {
            this.field3498 = arg0.method2873();
        } else if (arg1 == 112) {
            this.field3534 = arg0.method2873();
        } else if (arg1 == 113) {
            this.field3535 = arg0.method2872();
        } else if (arg1 == 114) {
            this.field3536 = arg0.method2872() * 5;
        } else if (arg1 == 115) {
            this.field3537 = arg0.method2871();
        } else if (arg1 == 139) {
            this.field3540 = arg0.method2873();
        } else if (arg1 == 140) {
            this.field3541 = arg0.method2873();
        } else if (arg1 == 148) {
            this.field3493 = arg0.method2873();
        } else if (arg1 == 149) {
            this.field3543 = arg0.method2873();
        } else if (arg1 == 249) {
            this.field3542 = class250.method1405(arg0, this.field3542);
        }
    }

    @ObfuscatedName("iz.e(Liz;Liz;S)V")
    public void method4218(class257 arg0, class257 arg1) {
        this.field3544 = arg0.field3544;
        this.field3504 = arg0.field3504;
        this.field3521 = arg0.field3521;
        this.field3506 = arg0.field3506;
        this.field3490 = arg0.field3490;
        this.field3508 = arg0.field3508;
        this.field3509 = arg0.field3509;
        this.field3500 = arg0.field3500;
        this.field3501 = arg0.field3501;
        this.field3518 = arg0.field3518;
        this.field3503 = arg0.field3503;
        this.field3499 = arg1.field3499;
        this.field3512 = arg1.field3512;
        this.field3511 = arg1.field3511;
        this.field3510 = 1;
    }

    @ObfuscatedName("iz.l(Liz;Liz;I)V")
    public void method4201(class257 arg0, class257 arg1) {
        this.field3544 = arg0.field3544;
        this.field3504 = arg0.field3504;
        this.field3521 = arg0.field3521;
        this.field3506 = arg0.field3506;
        this.field3490 = arg0.field3490;
        this.field3508 = arg0.field3508;
        this.field3509 = arg0.field3509;
        this.field3500 = arg1.field3500;
        this.field3501 = arg1.field3501;
        this.field3518 = arg1.field3518;
        this.field3503 = arg1.field3503;
        this.field3499 = arg1.field3499;
        this.field3512 = arg1.field3512;
        this.field3510 = arg1.field3510;
        this.field3516 = arg1.field3516;
        this.field3517 = arg1.field3517;
        this.field3522 = arg1.field3522;
        this.field3524 = arg1.field3524;
        this.field3495 = arg1.field3495;
        this.field3502 = arg1.field3502;
        this.field3507 = arg1.field3507;
        this.field3520 = arg1.field3520;
        this.field3526 = arg1.field3526;
        this.field3527 = arg1.field3527;
        this.field3537 = arg1.field3537;
        this.field3513 = arg1.field3513;
        this.field3514 = new String[5];
        if (arg1.field3514 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3514[var3] = arg1.field3514[var3];
            }
        }
        this.field3514[4] = class226.field2867;
        this.field3511 = 0;
    }

    @ObfuscatedName("iz.s(Liz;Liz;I)V")
    public void method4176(class257 arg0, class257 arg1) {
        this.field3544 = arg0.field3544;
        this.field3504 = arg0.field3504;
        this.field3521 = arg0.field3521;
        this.field3506 = arg0.field3506;
        this.field3490 = arg0.field3490;
        this.field3508 = arg0.field3508;
        this.field3509 = arg0.field3509;
        this.field3500 = arg0.field3500;
        this.field3501 = arg0.field3501;
        this.field3518 = arg0.field3518;
        this.field3503 = arg0.field3503;
        this.field3510 = arg0.field3510;
        this.field3499 = arg1.field3499;
        this.field3511 = 0;
        this.field3512 = false;
        this.field3539 = false;
    }

    @ObfuscatedName("iz.w(IB)Ldv;")
    public final class128 method4179(int arg0) {
        if (this.field3485 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3485[var3];
                }
            }
            if (var2 != -1) {
                return method1498(var2).method4179(1);
            }
        }
        class128 var4 = class128.method2173(Statics.field3505, this.field3544, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3532 != 128 || this.field3498 != 128 || this.field3534 != 128) {
            var4.method2189(this.field3532, this.field3498, this.field3534);
        }
        if (this.field3500 != null) {
            for (int var5 = 0; var5 < this.field3500.length; var5++) {
                var4.method2186(this.field3500[var5], this.field3501[var5]);
            }
        }
        if (this.field3518 != null) {
            for (int var6 = 0; var6 < this.field3518.length; var6++) {
                var4.method2187(this.field3518[var6], this.field3503[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iz.p(IB)Lej;")
    public final class134 method4184(int arg0) {
        if (this.field3485 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3485[var3];
                }
            }
            if (var2 != -1) {
                return method1498(var2).method4184(1);
            }
        }
        class134 var4 = (class134) field3494.method3245((long) this.field3497);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2173(Statics.field3505, this.field3544, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3532 != 128 || this.field3498 != 128 || this.field3534 != 128) {
            var5.method2189(this.field3532, this.field3498, this.field3534);
        }
        if (this.field3500 != null) {
            for (int var6 = 0; var6 < this.field3500.length; var6++) {
                var5.method2186(this.field3500[var6], this.field3501[var6]);
            }
        }
        if (this.field3518 != null) {
            for (int var7 = 0; var7 < this.field3518.length; var7++) {
                var5.method2187(this.field3518[var7], this.field3503[var7]);
            }
        }
        class134 var8 = var5.method2194(this.field3535 + 64, this.field3536 + 768, -50, -10, -50);
        var8.field1976 = true;
        field3494.method3247(var8, (long) this.field3497);
        return var8;
    }

    @ObfuscatedName("iz.m(II)Liz;")
    public class257 method4185(int arg0) {
        if (this.field3485 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3529[var3] && this.field3529[var3] != 0) {
                    var2 = this.field3485[var3];
                }
            }
            if (var2 != -1) {
                return method1498(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ed.u(IIIIIZB)Ljt;")
    public static final class286 method2656(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class286 var8 = (class286) field3538.method3245(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = method1498(arg0);
        if (arg1 > 1 && var9.field3485 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3529[var11] && var9.field3529[var11] != 0) {
                    var10 = var9.field3485[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1498(var10);
            }
        }
        class134 var12 = var9.method4184(1);
        if (var12 == null) {
            return null;
        }
        class286 var13 = null;
        if (var9.field3525 != -1) {
            var13 = method2656(var9.field3530, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3541 != -1) {
            var13 = method2656(var9.field3540, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3543 != -1) {
            var13 = method2656(var9.field3493, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3759;
        int var15 = Statics.field3756;
        int var16 = Statics.field3757;
        int[] var17 = new int[4];
        class282.method4509(var17);
        class286 var18 = new class286(36, 32);
        class282.method4505(var18.field3792, 36, 32);
        class282.method4581();
        class137.method2371();
        class137.method2376(16, 16);
        class137.field2012 = false;
        if (var9.field3543 != -1) {
            var13.method4683(0, 0);
        }
        int var19 = var9.field3504;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field2009[var9.field3521] * var19 >> 16;
        int var21 = class137.field2035[var9.field3521] * var19 >> 16;
        var12.method2319();
        var12.method2289(0, var9.field3506, var9.field3490, var9.field3521, var9.field3508, var9.field3509 + var12.field2119 / 2 + var20, var9.field3509 + var21);
        if (var9.field3541 != -1) {
            var13.method4683(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4630(1);
        }
        if (arg2 >= 2) {
            var18.method4630(16777215);
        }
        if (arg3 != 0) {
            var18.method4631(arg3);
        }
        class282.method4505(var18.field3792, 36, 32);
        if (var9.field3525 != -1) {
            var13.method4683(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3510 == 1) {
            class264 var22 = Statics.field3496;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class226.field3024 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class226.field2954 + "</col>";
            }
            var22.method4387(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3538.method3247(var18, var6);
        }
        class282.method4505(var14, var15, var16);
        class282.method4510(var17);
        class137.method2371();
        class137.field2012 = true;
        return var18;
    }

    @ObfuscatedName("iz.g(ZI)Z")
    public final boolean method4219(boolean arg0) {
        int var2 = this.field3516;
        int var3 = this.field3517;
        int var4 = this.field3522;
        if (arg0) {
            var2 = this.field3524;
            var3 = this.field3495;
            var4 = this.field3502;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3505.method3765(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3505.method3765(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3505.method3765(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("iz.k(ZB)Ldv;")
    public final class128 method4187(boolean arg0) {
        int var2 = this.field3516;
        int var3 = this.field3517;
        int var4 = this.field3522;
        if (arg0) {
            var2 = this.field3524;
            var3 = this.field3495;
            var4 = this.field3502;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2173(Statics.field3505, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2173(Statics.field3505, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2173(Statics.field3505, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3531 != 0) {
            var5.method2185(0, this.field3531, 0);
        }
        if (arg0 && this.field3528 != 0) {
            var5.method2185(0, this.field3528, 0);
        }
        if (this.field3500 != null) {
            for (int var10 = 0; var10 < this.field3500.length; var10++) {
                var5.method2186(this.field3500[var10], this.field3501[var10]);
            }
        }
        if (this.field3518 != null) {
            for (int var11 = 0; var11 < this.field3518.length; var11++) {
                var5.method2187(this.field3518[var11], this.field3503[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("iz.c(ZI)Z")
    public final boolean method4188(boolean arg0) {
        int var2 = this.field3507;
        int var3 = this.field3520;
        if (arg0) {
            var2 = this.field3526;
            var3 = this.field3527;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3505.method3765(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3505.method3765(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("iz.o(ZB)Ldv;")
    public final class128 method4189(boolean arg0) {
        int var2 = this.field3507;
        int var3 = this.field3520;
        if (arg0) {
            var2 = this.field3526;
            var3 = this.field3527;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2173(Statics.field3505, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2173(Statics.field3505, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3500 != null) {
            for (int var7 = 0; var7 < this.field3500.length; var7++) {
                var4.method2186(this.field3500[var7], this.field3501[var7]);
            }
        }
        if (this.field3518 != null) {
            for (int var8 = 0; var8 < this.field3518.length; var8++) {
                var4.method2187(this.field3518[var8], this.field3503[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iz.x(III)I")
    public int method4186(int arg0, int arg1) {
        return class250.method2715(this.field3542, arg0, arg1);
    }

    @ObfuscatedName("iz.h(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4228(int arg0, String arg1) {
        return class250.method2741(this.field3542, arg0, arg1);
    }

    @ObfuscatedName("iz.z(I)I")
    public int method4192() {
        if (this.field3515 == -1 || this.field3514 == null) {
            return -1;
        } else if (this.field3515 >= 0) {
            return this.field3514[this.field3515] == null ? -1 : this.field3515;
        } else if (class226.field2862.equalsIgnoreCase(this.field3514[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("at.i(ZI)V")
    public static void method551(boolean arg0) {
        if (Statics.field3491 != arg0) {
            field3533.method3244();
            field3494.method3244();
            field3538.method3244();
            Statics.field3491 = arg0;
        }
    }
}
