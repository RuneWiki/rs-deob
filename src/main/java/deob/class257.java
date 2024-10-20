package deob;

@ObfuscatedName("ii")
public class class257 extends class195 {

    @ObfuscatedName("ii.x")
    public static class190 field3539 = new class190(64);

    @ObfuscatedName("ii.z")
    public static class190 field3495 = new class190(50);

    @ObfuscatedName("ii.n")
    public static class190 field3541 = new class190(200);

    @ObfuscatedName("ii.t")
    public int field3497;

    @ObfuscatedName("ii.a")
    public int field3498;

    @ObfuscatedName("ii.i")
    public String field3499 = "null";

    @ObfuscatedName("ii.h")
    public short[] field3533;

    @ObfuscatedName("ii.b")
    public short[] field3528;

    @ObfuscatedName("ii.j")
    public short[] field3502;

    @ObfuscatedName("ii.y")
    public short[] field3501;

    @ObfuscatedName("ii.k")
    public int field3504 = 2000;

    @ObfuscatedName("ii.c")
    public int field3494 = 0;

    @ObfuscatedName("ii.r")
    public int field3506 = 0;

    @ObfuscatedName("ii.m")
    public int field3507 = 0;

    @ObfuscatedName("ii.l")
    public int field3508 = 0;

    @ObfuscatedName("ii.f")
    public int field3509 = 0;

    @ObfuscatedName("ii.ap")
    public int field3510 = 0;

    @ObfuscatedName("ii.af")
    public int field3496 = 1;

    @ObfuscatedName("ii.aa")
    public boolean field3512 = false;

    @ObfuscatedName("ii.ay")
    public String[] field3500 = new String[] { null, null, class226.field2852, null, null };

    @ObfuscatedName("ii.aw")
    public String[] field3514 = new String[] { null, null, null, null, class226.field2853 };

    @ObfuscatedName("ii.at")
    public int field3516 = -2;

    @ObfuscatedName("ii.ao")
    public int field3517 = -1;

    @ObfuscatedName("ii.aq")
    public int field3518 = -1;

    @ObfuscatedName("ii.ax")
    public int field3519 = 0;

    @ObfuscatedName("ii.av")
    public int field3520 = -1;

    @ObfuscatedName("ii.al")
    public int field3524 = -1;

    @ObfuscatedName("ii.ae")
    public int field3522 = 0;

    @ObfuscatedName("ii.ab")
    public int field3523 = -1;

    @ObfuscatedName("ii.aj")
    public int field3493 = -1;

    @ObfuscatedName("ii.ac")
    public int field3525 = -1;

    @ObfuscatedName("ii.ad")
    public int field3526 = -1;

    @ObfuscatedName("ii.am")
    public int field3505 = -1;

    @ObfuscatedName("ii.ah")
    public int field3521 = -1;

    @ObfuscatedName("ii.ak")
    public int[] field3537;

    @ObfuscatedName("ii.ar")
    public int[] field3530;

    @ObfuscatedName("ii.ag")
    public int field3531 = -1;

    @ObfuscatedName("ii.ai")
    public int field3532 = -1;

    @ObfuscatedName("ii.au")
    public int field3503 = 128;

    @ObfuscatedName("ii.an")
    public int field3513 = 128;

    @ObfuscatedName("ii.as")
    public int field3535 = 128;

    @ObfuscatedName("ii.br")
    public int field3536 = 0;

    @ObfuscatedName("ii.bj")
    public int field3540 = 0;

    @ObfuscatedName("ii.bf")
    public int field3538 = 0;

    @ObfuscatedName("ii.bw")
    public class187 field3511;

    @ObfuscatedName("ii.bs")
    public boolean field3527 = false;

    @ObfuscatedName("ii.bp")
    public int field3542 = -1;

    @ObfuscatedName("ii.bv")
    public int field3486 = -1;

    @ObfuscatedName("ii.bi")
    public int field3529 = -1;

    @ObfuscatedName("ii.bz")
    public int field3544 = -1;

    @ObfuscatedName("dk.w(Lip;Lip;ZLjh;I)V")
    public static void method1952(class236 arg0, class236 arg1, boolean arg2, class264 arg3) {
        Statics.field3543 = arg0;
        Statics.field3492 = arg1;
        Statics.field3515 = arg2;
        Statics.field484 = Statics.field3543.method3908(10);
        Statics.field1674 = arg3;
    }

    @ObfuscatedName("er.s(II)Lii;")
    public static class257 method2694(int arg0) {
        class257 var1 = (class257) field3539.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3543.method3876(10, arg0);
        class257 var3 = new class257();
        var3.field3497 = arg0;
        if (var2 != null) {
            var3.method4326(new class174(var2));
        }
        var3.method4330();
        if (var3.field3532 != -1) {
            var3.method4328(method2694(var3.field3532), method2694(var3.field3531));
        }
        if (var3.field3486 != -1) {
            var3.method4365(method2694(var3.field3486), method2694(var3.field3542));
        }
        if (var3.field3544 != -1) {
            var3.method4374(method2694(var3.field3544), method2694(var3.field3529));
        }
        if (!Statics.field3515 && var3.field3512) {
            var3.field3499 = class226.field2953;
            var3.field3527 = false;
            var3.field3500 = null;
            var3.field3514 = null;
            var3.field3516 = -1;
            var3.field3538 = 0;
            if (var3.field3511 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3511.method3327(); var5 != null; var5 = var3.field3511.method3328()) {
                    class252 var6 = class252.method3272((int) var5.field2464);
                    if (var6.field3390) {
                        var5.method3425();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3511 = null;
                }
            }
        }
        field3539.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.q(I)V")
    public void method4330() {
    }

    @ObfuscatedName("ii.o(Lfz;I)V")
    public void method4326(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4327(arg0, var2);
        }
    }

    @ObfuscatedName("ii.g(Lfz;IB)V")
    public void method4327(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3498 = arg0.method3178();
        } else if (arg1 == 2) {
            this.field3499 = arg0.method3111();
        } else if (arg1 == 4) {
            this.field3504 = arg0.method3178();
        } else if (arg1 == 5) {
            this.field3494 = arg0.method3178();
        } else if (arg1 == 6) {
            this.field3506 = arg0.method3178();
        } else if (arg1 == 7) {
            this.field3508 = arg0.method3178();
            if (this.field3508 > 32767) {
                this.field3508 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3509 = arg0.method3178();
            if (this.field3509 > 32767) {
                this.field3509 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3510 = 1;
        } else if (arg1 == 12) {
            this.field3496 = arg0.method3131();
        } else if (arg1 == 16) {
            this.field3512 = true;
        } else if (arg1 == 23) {
            this.field3517 = arg0.method3178();
            this.field3519 = arg0.method2971();
        } else if (arg1 == 24) {
            this.field3518 = arg0.method3178();
        } else if (arg1 == 25) {
            this.field3520 = arg0.method3178();
            this.field3522 = arg0.method2971();
        } else if (arg1 == 26) {
            this.field3524 = arg0.method3178();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3500[arg1 - 30] = arg0.method3111();
            if (this.field3500[arg1 - 30].equalsIgnoreCase(class226.field2857)) {
                this.field3500[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3514[arg1 - 35] = arg0.method3111();
        } else if (arg1 == 40) {
            int var3 = arg0.method2971();
            this.field3533 = new short[var3];
            this.field3528 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3533[var4] = (short) arg0.method3178();
                this.field3528[var4] = (short) arg0.method3178();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2971();
            this.field3502 = new short[var5];
            this.field3501 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3502[var6] = (short) arg0.method3178();
                this.field3501[var6] = (short) arg0.method3178();
            }
        } else if (arg1 == 42) {
            this.field3516 = arg0.method2972();
        } else if (arg1 == 65) {
            this.field3527 = true;
        } else if (arg1 == 78) {
            this.field3523 = arg0.method3178();
        } else if (arg1 == 79) {
            this.field3493 = arg0.method3178();
        } else if (arg1 == 90) {
            this.field3525 = arg0.method3178();
        } else if (arg1 == 91) {
            this.field3505 = arg0.method3178();
        } else if (arg1 == 92) {
            this.field3526 = arg0.method3178();
        } else if (arg1 == 93) {
            this.field3521 = arg0.method3178();
        } else if (arg1 == 95) {
            this.field3507 = arg0.method3178();
        } else if (arg1 == 97) {
            this.field3531 = arg0.method3178();
        } else if (arg1 == 98) {
            this.field3532 = arg0.method3178();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3537 == null) {
                this.field3537 = new int[10];
                this.field3530 = new int[10];
            }
            this.field3537[arg1 - 100] = arg0.method3178();
            this.field3530[arg1 - 100] = arg0.method3178();
        } else if (arg1 == 110) {
            this.field3503 = arg0.method3178();
        } else if (arg1 == 111) {
            this.field3513 = arg0.method3178();
        } else if (arg1 == 112) {
            this.field3535 = arg0.method3178();
        } else if (arg1 == 113) {
            this.field3536 = arg0.method2972();
        } else if (arg1 == 114) {
            this.field3540 = arg0.method2972() * 5;
        } else if (arg1 == 115) {
            this.field3538 = arg0.method2971();
        } else if (arg1 == 139) {
            this.field3542 = arg0.method3178();
        } else if (arg1 == 140) {
            this.field3486 = arg0.method3178();
        } else if (arg1 == 148) {
            this.field3529 = arg0.method3178();
        } else if (arg1 == 149) {
            this.field3544 = arg0.method3178();
        } else if (arg1 == 249) {
            this.field3511 = class250.method2227(arg0, this.field3511);
        }
    }

    @ObfuscatedName("ii.v(Lii;Lii;B)V")
    public void method4328(class257 arg0, class257 arg1) {
        this.field3498 = arg0.field3498;
        this.field3504 = arg0.field3504;
        this.field3494 = arg0.field3494;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3508 = arg0.field3508;
        this.field3509 = arg0.field3509;
        this.field3533 = arg0.field3533;
        this.field3528 = arg0.field3528;
        this.field3502 = arg0.field3502;
        this.field3501 = arg0.field3501;
        this.field3499 = arg1.field3499;
        this.field3512 = arg1.field3512;
        this.field3496 = arg1.field3496;
        this.field3510 = 1;
    }

    @ObfuscatedName("ii.p(Lii;Lii;I)V")
    public void method4365(class257 arg0, class257 arg1) {
        this.field3498 = arg0.field3498;
        this.field3504 = arg0.field3504;
        this.field3494 = arg0.field3494;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3508 = arg0.field3508;
        this.field3509 = arg0.field3509;
        this.field3533 = arg1.field3533;
        this.field3528 = arg1.field3528;
        this.field3502 = arg1.field3502;
        this.field3501 = arg1.field3501;
        this.field3499 = arg1.field3499;
        this.field3512 = arg1.field3512;
        this.field3510 = arg1.field3510;
        this.field3517 = arg1.field3517;
        this.field3518 = arg1.field3518;
        this.field3523 = arg1.field3523;
        this.field3520 = arg1.field3520;
        this.field3524 = arg1.field3524;
        this.field3493 = arg1.field3493;
        this.field3525 = arg1.field3525;
        this.field3526 = arg1.field3526;
        this.field3505 = arg1.field3505;
        this.field3521 = arg1.field3521;
        this.field3538 = arg1.field3538;
        this.field3500 = arg1.field3500;
        this.field3514 = new String[5];
        if (arg1.field3514 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3514[var3] = arg1.field3514[var3];
            }
        }
        this.field3514[4] = class226.field3105;
        this.field3496 = 0;
    }

    @ObfuscatedName("ii.e(Lii;Lii;B)V")
    public void method4374(class257 arg0, class257 arg1) {
        this.field3498 = arg0.field3498;
        this.field3504 = arg0.field3504;
        this.field3494 = arg0.field3494;
        this.field3506 = arg0.field3506;
        this.field3507 = arg0.field3507;
        this.field3508 = arg0.field3508;
        this.field3509 = arg0.field3509;
        this.field3533 = arg0.field3533;
        this.field3528 = arg0.field3528;
        this.field3502 = arg0.field3502;
        this.field3501 = arg0.field3501;
        this.field3510 = arg0.field3510;
        this.field3499 = arg1.field3499;
        this.field3496 = 0;
        this.field3512 = false;
        this.field3527 = false;
    }

    @ObfuscatedName("ii.d(IS)Ldo;")
    public final class126 method4331(int arg0) {
        if (this.field3537 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3530[var3] && this.field3530[var3] != 0) {
                    var2 = this.field3537[var3];
                }
            }
            if (var2 != -1) {
                return method2694(var2).method4331(1);
            }
        }
        class126 var4 = class126.method2334(Statics.field3492, this.field3498, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3503 != 128 || this.field3513 != 128 || this.field3535 != 128) {
            var4.method2270(this.field3503, this.field3513, this.field3535);
        }
        if (this.field3533 != null) {
            for (int var5 = 0; var5 < this.field3533.length; var5++) {
                var4.method2267(this.field3533[var5], this.field3528[var5]);
            }
        }
        if (this.field3502 != null) {
            for (int var6 = 0; var6 < this.field3502.length; var6++) {
                var4.method2295(this.field3502[var6], this.field3501[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.x(II)Leh;")
    public final class132 method4353(int arg0) {
        if (this.field3537 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3530[var3] && this.field3530[var3] != 0) {
                    var2 = this.field3537[var3];
                }
            }
            if (var2 != -1) {
                return method2694(var2).method4353(1);
            }
        }
        class132 var4 = (class132) field3495.method3357((long) this.field3497);
        if (var4 != null) {
            return var4;
        }
        class126 var5 = class126.method2334(Statics.field3492, this.field3498, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3503 != 128 || this.field3513 != 128 || this.field3535 != 128) {
            var5.method2270(this.field3503, this.field3513, this.field3535);
        }
        if (this.field3533 != null) {
            for (int var6 = 0; var6 < this.field3533.length; var6++) {
                var5.method2267(this.field3533[var6], this.field3528[var6]);
            }
        }
        if (this.field3502 != null) {
            for (int var7 = 0; var7 < this.field3502.length; var7++) {
                var5.method2295(this.field3502[var7], this.field3501[var7]);
            }
        }
        class132 var8 = var5.method2275(this.field3536 + 64, this.field3540 + 768, -50, -10, -50);
        var8.field1937 = true;
        field3495.method3371(var8, (long) this.field3497);
        return var8;
    }

    @ObfuscatedName("ii.u(IB)Lii;")
    public class257 method4332(int arg0) {
        if (this.field3537 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3530[var3] && this.field3530[var3] != 0) {
                    var2 = this.field3537[var3];
                }
            }
            if (var2 != -1) {
                return method2694(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("client.i(IIIIIZI)Lky;")
    public static final class287 method1410(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class287 var8 = (class287) field3541.method3357(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = method2694(arg0);
        if (arg1 > 1 && var9.field3537 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3530[var11] && var9.field3530[var11] != 0) {
                    var10 = var9.field3537[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2694(var10);
            }
        }
        class132 var12 = var9.method4353(1);
        if (var12 == null) {
            return null;
        }
        class287 var13 = null;
        if (var9.field3532 != -1) {
            var13 = method1410(var9.field3531, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3486 != -1) {
            var13 = method1410(var9.field3542, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3544 != -1) {
            var13 = method1410(var9.field3529, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3773;
        int var15 = Statics.field3769;
        int var16 = Statics.field3770;
        int[] var17 = new int[4];
        class283.method4749(var17);
        class287 var18 = new class287(36, 32);
        class283.method4694(var18.field3804, 36, 32);
        class283.method4700();
        class135.method2476();
        class135.method2444(16, 16);
        class135.field2001 = false;
        if (var9.field3544 != -1) {
            var13.method4822(0, 0);
        }
        int var19 = var9.field3504;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class135.field2024[var9.field3494] * var19 >> 16;
        int var21 = class135.field2025[var9.field3494] * var19 >> 16;
        var12.method2358();
        var12.method2371(0, var9.field3506, var9.field3507, var9.field3494, var9.field3508, var9.field3509 + var12.field2103 / 2 + var20, var9.field3509 + var21);
        if (var9.field3486 != -1) {
            var13.method4822(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4818(1);
        }
        if (arg2 >= 2) {
            var18.method4818(16777215);
        }
        if (arg3 != 0) {
            var18.method4819(arg3);
        }
        class283.method4694(var18.field3804, 36, 32);
        if (var9.field3532 != -1) {
            var13.method4822(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3510 == 1) {
            class264 var22 = Statics.field1674;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class226.field3081 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class226.field2901 + "</col>";
            }
            var22.method4508(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3541.method3371(var18, var6);
        }
        class283.method4694(var14, var15, var16);
        class283.method4699(var17);
        class135.method2476();
        class135.field2001 = true;
        return var18;
    }

    @ObfuscatedName("ii.h(ZI)Z")
    public final boolean method4349(boolean arg0) {
        int var2 = this.field3517;
        int var3 = this.field3518;
        int var4 = this.field3523;
        if (arg0) {
            var2 = this.field3520;
            var3 = this.field3524;
            var4 = this.field3493;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3492.method3878(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3492.method3878(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3492.method3878(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ii.b(ZI)Ldo;")
    public final class126 method4384(boolean arg0) {
        int var2 = this.field3517;
        int var3 = this.field3518;
        int var4 = this.field3523;
        if (arg0) {
            var2 = this.field3520;
            var3 = this.field3524;
            var4 = this.field3493;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var5 = class126.method2334(Statics.field3492, var2, 0);
        if (var3 != -1) {
            class126 var6 = class126.method2334(Statics.field3492, var3, 0);
            if (var4 == -1) {
                class126[] var9 = new class126[] { var5, var6 };
                var5 = new class126(var9, 2);
            } else {
                class126 var7 = class126.method2334(Statics.field3492, var4, 0);
                class126[] var8 = new class126[] { var5, var6, var7 };
                var5 = new class126(var8, 3);
            }
        }
        if (!arg0 && this.field3519 != 0) {
            var5.method2263(0, this.field3519, 0);
        }
        if (arg0 && this.field3522 != 0) {
            var5.method2263(0, this.field3522, 0);
        }
        if (this.field3533 != null) {
            for (int var10 = 0; var10 < this.field3533.length; var10++) {
                var5.method2267(this.field3533[var10], this.field3528[var10]);
            }
        }
        if (this.field3502 != null) {
            for (int var11 = 0; var11 < this.field3502.length; var11++) {
                var5.method2295(this.field3502[var11], this.field3501[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ii.j(ZB)Z")
    public final boolean method4334(boolean arg0) {
        int var2 = this.field3525;
        int var3 = this.field3526;
        if (arg0) {
            var2 = this.field3505;
            var3 = this.field3521;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3492.method3878(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3492.method3878(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ii.y(ZI)Ldo;")
    public final class126 method4347(boolean arg0) {
        int var2 = this.field3525;
        int var3 = this.field3526;
        if (arg0) {
            var2 = this.field3505;
            var3 = this.field3521;
        }
        if (var2 == -1) {
            return null;
        }
        class126 var4 = class126.method2334(Statics.field3492, var2, 0);
        if (var3 != -1) {
            class126 var5 = class126.method2334(Statics.field3492, var3, 0);
            class126[] var6 = new class126[] { var4, var5 };
            var4 = new class126(var6, 2);
        }
        if (this.field3533 != null) {
            for (int var7 = 0; var7 < this.field3533.length; var7++) {
                var4.method2267(this.field3533[var7], this.field3528[var7]);
            }
        }
        if (this.field3502 != null) {
            for (int var8 = 0; var8 < this.field3502.length; var8++) {
                var4.method2295(this.field3502[var8], this.field3501[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ii.c(III)I")
    public int method4337(int arg0, int arg1) {
        return class250.method3857(this.field3511, arg0, arg1);
    }

    @ObfuscatedName("ii.r(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4338(int arg0, String arg1) {
        return class250.method3625(this.field3511, arg0, arg1);
    }

    @ObfuscatedName("ii.m(I)I")
    public int method4339() {
        if (this.field3516 == -1 || this.field3514 == null) {
            return -1;
        } else if (this.field3516 >= 0) {
            return this.field3514[this.field3516] == null ? -1 : this.field3516;
        } else if (class226.field2853.equalsIgnoreCase(this.field3514[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ho.l(I)V")
    public static void method3695() {
        field3539.method3361();
        field3495.method3361();
        field3541.method3361();
    }
}
