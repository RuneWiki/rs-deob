package deob;

@ObfuscatedName("if")
public class class257 extends class195 {

    @ObfuscatedName("if.n")
    public static class190 field3488 = new class190(64);

    @ObfuscatedName("if.a")
    public static class190 field3527 = new class190(50);

    @ObfuscatedName("if.o")
    public static class190 field3490 = new class190(200);

    @ObfuscatedName("if.q")
    public int field3491;

    @ObfuscatedName("if.j")
    public int field3526;

    @ObfuscatedName("if.k")
    public String field3496 = "null";

    @ObfuscatedName("if.r")
    public short[] field3523;

    @ObfuscatedName("if.m")
    public short[] field3495;

    @ObfuscatedName("if.d")
    public short[] field3484;

    @ObfuscatedName("if.s")
    public short[] field3497;

    @ObfuscatedName("if.g")
    public int field3498 = 2000;

    @ObfuscatedName("if.w")
    public int field3483 = 0;

    @ObfuscatedName("if.p")
    public int field3520 = 0;

    @ObfuscatedName("if.l")
    public int field3501 = 0;

    @ObfuscatedName("if.u")
    public int field3502 = 0;

    @ObfuscatedName("if.t")
    public int field3535 = 0;

    @ObfuscatedName("if.ad")
    public int field3504 = 0;

    @ObfuscatedName("if.ar")
    public int field3505 = 1;

    @ObfuscatedName("if.an")
    public boolean field3506 = false;

    @ObfuscatedName("if.af")
    public String[] field3489 = new String[] { null, null, class226.field2854, null, null };

    @ObfuscatedName("if.at")
    public String[] field3508 = new String[] { null, null, null, null, class226.field2996 };

    @ObfuscatedName("if.ai")
    public int field3507 = -2;

    @ObfuscatedName("if.aw")
    public int field3510 = -1;

    @ObfuscatedName("if.al")
    public int field3511 = -1;

    @ObfuscatedName("if.ab")
    public int field3518 = 0;

    @ObfuscatedName("if.aa")
    public int field3513 = -1;

    @ObfuscatedName("if.ap")
    public int field3514 = -1;

    @ObfuscatedName("if.ae")
    public int field3515 = 0;

    @ObfuscatedName("if.as")
    public int field3516 = -1;

    @ObfuscatedName("if.av")
    public int field3528 = -1;

    @ObfuscatedName("if.ag")
    public int field3500 = -1;

    @ObfuscatedName("if.az")
    public int field3519 = -1;

    @ObfuscatedName("if.ac")
    public int field3492 = -1;

    @ObfuscatedName("if.ax")
    public int field3521 = -1;

    @ObfuscatedName("if.au")
    public int[] field3522;

    @ObfuscatedName("if.aj")
    public int[] field3509;

    @ObfuscatedName("if.aq")
    public int field3524 = -1;

    @ObfuscatedName("if.ay")
    public int field3525 = -1;

    @ObfuscatedName("if.ak")
    public int field3503 = 128;

    @ObfuscatedName("if.ao")
    public int field3494 = 128;

    @ObfuscatedName("if.am")
    public int field3512 = 128;

    @ObfuscatedName("if.be")
    public int field3529 = 0;

    @ObfuscatedName("if.bs")
    public int field3530 = 0;

    @ObfuscatedName("if.bu")
    public int field3531 = 0;

    @ObfuscatedName("if.bo")
    public class187 field3532;

    @ObfuscatedName("if.bj")
    public boolean field3533 = false;

    @ObfuscatedName("if.bh")
    public int field3534 = -1;

    @ObfuscatedName("if.bf")
    public int field3493 = -1;

    @ObfuscatedName("if.bg")
    public int field3536 = -1;

    @ObfuscatedName("if.bl")
    public int field3537 = -1;

    @ObfuscatedName("fx.i(II)Lif;")
    public static class257 method2996(int arg0) {
        class257 var1 = (class257) field3488.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2162.method3769(10, arg0);
        class257 var3 = new class257();
        var3.field3491 = arg0;
        if (var2 != null) {
            var3.method4219(new class174(var2));
        }
        var3.method4218();
        if (var3.field3525 != -1) {
            var3.method4221(method2996(var3.field3525), method2996(var3.field3524));
        }
        if (var3.field3493 != -1) {
            var3.method4233(method2996(var3.field3493), method2996(var3.field3534));
        }
        if (var3.field3537 != -1) {
            var3.method4223(method2996(var3.field3537), method2996(var3.field3536));
        }
        if (!Statics.field2013 && var3.field3506) {
            var3.field3496 = class226.field2949;
            var3.field3533 = false;
            var3.field3489 = null;
            var3.field3508 = null;
            var3.field3507 = -1;
            var3.field3531 = 0;
            if (var3.field3532 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3532.method3200(); var5 != null; var5 = var3.field3532.method3196()) {
                    class252 var6 = class252.method469((int) var5.field2480);
                    if (var6.field3389) {
                        var5.method3278();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3532 = null;
                }
            }
        }
        field3488.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.c(I)V")
    public void method4218() {
    }

    @ObfuscatedName("if.e(Lfx;I)V")
    public void method4219(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method4220(arg0, var2);
        }
    }

    @ObfuscatedName("if.v(Lfx;IB)V")
    public void method4220(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3526 = arg0.method2872();
        } else if (arg1 == 2) {
            this.field3496 = arg0.method2878();
        } else if (arg1 == 4) {
            this.field3498 = arg0.method2872();
        } else if (arg1 == 5) {
            this.field3483 = arg0.method2872();
        } else if (arg1 == 6) {
            this.field3520 = arg0.method2872();
        } else if (arg1 == 7) {
            this.field3502 = arg0.method2872();
            if (this.field3502 > 32767) {
                this.field3502 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3535 = arg0.method2872();
            if (this.field3535 > 32767) {
                this.field3535 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3504 = 1;
        } else if (arg1 == 12) {
            this.field3505 = arg0.method2875();
        } else if (arg1 == 16) {
            this.field3506 = true;
        } else if (arg1 == 23) {
            this.field3510 = arg0.method2872();
            this.field3518 = arg0.method2870();
        } else if (arg1 == 24) {
            this.field3511 = arg0.method2872();
        } else if (arg1 == 25) {
            this.field3513 = arg0.method2872();
            this.field3515 = arg0.method2870();
        } else if (arg1 == 26) {
            this.field3514 = arg0.method2872();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3489[arg1 - 30] = arg0.method2878();
            if (this.field3489[arg1 - 30].equalsIgnoreCase(class226.field3014)) {
                this.field3489[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3508[arg1 - 35] = arg0.method2878();
        } else if (arg1 == 40) {
            int var3 = arg0.method2870();
            this.field3523 = new short[var3];
            this.field3495 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3523[var4] = (short) arg0.method2872();
                this.field3495[var4] = (short) arg0.method2872();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2870();
            this.field3484 = new short[var5];
            this.field3497 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3484[var6] = (short) arg0.method2872();
                this.field3497[var6] = (short) arg0.method2872();
            }
        } else if (arg1 == 42) {
            this.field3507 = arg0.method2938();
        } else if (arg1 == 65) {
            this.field3533 = true;
        } else if (arg1 == 78) {
            this.field3516 = arg0.method2872();
        } else if (arg1 == 79) {
            this.field3528 = arg0.method2872();
        } else if (arg1 == 90) {
            this.field3500 = arg0.method2872();
        } else if (arg1 == 91) {
            this.field3492 = arg0.method2872();
        } else if (arg1 == 92) {
            this.field3519 = arg0.method2872();
        } else if (arg1 == 93) {
            this.field3521 = arg0.method2872();
        } else if (arg1 == 95) {
            this.field3501 = arg0.method2872();
        } else if (arg1 == 97) {
            this.field3524 = arg0.method2872();
        } else if (arg1 == 98) {
            this.field3525 = arg0.method2872();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3522 == null) {
                this.field3522 = new int[10];
                this.field3509 = new int[10];
            }
            this.field3522[arg1 - 100] = arg0.method2872();
            this.field3509[arg1 - 100] = arg0.method2872();
        } else if (arg1 == 110) {
            this.field3503 = arg0.method2872();
        } else if (arg1 == 111) {
            this.field3494 = arg0.method2872();
        } else if (arg1 == 112) {
            this.field3512 = arg0.method2872();
        } else if (arg1 == 113) {
            this.field3529 = arg0.method2938();
        } else if (arg1 == 114) {
            this.field3530 = arg0.method2938() * 5;
        } else if (arg1 == 115) {
            this.field3531 = arg0.method2870();
        } else if (arg1 == 139) {
            this.field3534 = arg0.method2872();
        } else if (arg1 == 140) {
            this.field3493 = arg0.method2872();
        } else if (arg1 == 148) {
            this.field3536 = arg0.method2872();
        } else if (arg1 == 149) {
            this.field3537 = arg0.method2872();
        } else if (arg1 == 249) {
            this.field3532 = class250.method1933(arg0, this.field3532);
        }
    }

    @ObfuscatedName("if.b(Lif;Lif;I)V")
    public void method4221(class257 arg0, class257 arg1) {
        this.field3526 = arg0.field3526;
        this.field3498 = arg0.field3498;
        this.field3483 = arg0.field3483;
        this.field3520 = arg0.field3520;
        this.field3501 = arg0.field3501;
        this.field3502 = arg0.field3502;
        this.field3535 = arg0.field3535;
        this.field3523 = arg0.field3523;
        this.field3495 = arg0.field3495;
        this.field3484 = arg0.field3484;
        this.field3497 = arg0.field3497;
        this.field3496 = arg1.field3496;
        this.field3506 = arg1.field3506;
        this.field3505 = arg1.field3505;
        this.field3504 = 1;
    }

    @ObfuscatedName("if.y(Lif;Lif;B)V")
    public void method4233(class257 arg0, class257 arg1) {
        this.field3526 = arg0.field3526;
        this.field3498 = arg0.field3498;
        this.field3483 = arg0.field3483;
        this.field3520 = arg0.field3520;
        this.field3501 = arg0.field3501;
        this.field3502 = arg0.field3502;
        this.field3535 = arg0.field3535;
        this.field3523 = arg1.field3523;
        this.field3495 = arg1.field3495;
        this.field3484 = arg1.field3484;
        this.field3497 = arg1.field3497;
        this.field3496 = arg1.field3496;
        this.field3506 = arg1.field3506;
        this.field3504 = arg1.field3504;
        this.field3510 = arg1.field3510;
        this.field3511 = arg1.field3511;
        this.field3516 = arg1.field3516;
        this.field3513 = arg1.field3513;
        this.field3514 = arg1.field3514;
        this.field3528 = arg1.field3528;
        this.field3500 = arg1.field3500;
        this.field3519 = arg1.field3519;
        this.field3492 = arg1.field3492;
        this.field3521 = arg1.field3521;
        this.field3531 = arg1.field3531;
        this.field3489 = arg1.field3489;
        this.field3508 = new String[5];
        if (arg1.field3508 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3508[var3] = arg1.field3508[var3];
            }
        }
        this.field3508[4] = class226.field3108;
        this.field3505 = 0;
    }

    @ObfuscatedName("if.h(Lif;Lif;I)V")
    public void method4223(class257 arg0, class257 arg1) {
        this.field3526 = arg0.field3526;
        this.field3498 = arg0.field3498;
        this.field3483 = arg0.field3483;
        this.field3520 = arg0.field3520;
        this.field3501 = arg0.field3501;
        this.field3502 = arg0.field3502;
        this.field3535 = arg0.field3535;
        this.field3523 = arg0.field3523;
        this.field3495 = arg0.field3495;
        this.field3484 = arg0.field3484;
        this.field3497 = arg0.field3497;
        this.field3504 = arg0.field3504;
        this.field3496 = arg1.field3496;
        this.field3505 = 0;
        this.field3506 = false;
        this.field3533 = false;
    }

    @ObfuscatedName("if.x(II)Ldw;")
    public final class128 method4226(int arg0) {
        if (this.field3522 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3509[var3] && this.field3509[var3] != 0) {
                    var2 = this.field3522[var3];
                }
            }
            if (var2 != -1) {
                return method2996(var2).method4226(1);
            }
        }
        class128 var4 = class128.method2208(Statics.field877, this.field3526, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3503 != 128 || this.field3494 != 128 || this.field3512 != 128) {
            var4.method2193(this.field3503, this.field3494, this.field3512);
        }
        if (this.field3523 != null) {
            for (int var5 = 0; var5 < this.field3523.length; var5++) {
                var4.method2190(this.field3523[var5], this.field3495[var5]);
            }
        }
        if (this.field3484 != null) {
            for (int var6 = 0; var6 < this.field3484.length; var6++) {
                var4.method2231(this.field3484[var6], this.field3497[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("if.f(II)Led;")
    public final class134 method4273(int arg0) {
        if (this.field3522 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3509[var3] && this.field3509[var3] != 0) {
                    var2 = this.field3522[var3];
                }
            }
            if (var2 != -1) {
                return method2996(var2).method4273(1);
            }
        }
        class134 var4 = (class134) field3527.method3220((long) this.field3491);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2208(Statics.field877, this.field3526, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3503 != 128 || this.field3494 != 128 || this.field3512 != 128) {
            var5.method2193(this.field3503, this.field3494, this.field3512);
        }
        if (this.field3523 != null) {
            for (int var6 = 0; var6 < this.field3523.length; var6++) {
                var5.method2190(this.field3523[var6], this.field3495[var6]);
            }
        }
        if (this.field3484 != null) {
            for (int var7 = 0; var7 < this.field3484.length; var7++) {
                var5.method2231(this.field3484[var7], this.field3497[var7]);
            }
        }
        class134 var8 = var5.method2198(this.field3529 + 64, this.field3530 + 768, -50, -10, -50);
        var8.field1988 = true;
        field3527.method3222(var8, (long) this.field3491);
        return var8;
    }

    @ObfuscatedName("if.n(II)Lif;")
    public class257 method4244(int arg0) {
        if (this.field3522 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3509[var3] && this.field3509[var3] != 0) {
                    var2 = this.field3522[var3];
                }
            }
            if (var2 != -1) {
                return method2996(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cg.a(IIIIIZS)Ljs;")
    public static final class286 method1568(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class286 var8 = (class286) field3490.method3220(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = method2996(arg0);
        if (arg1 > 1 && var9.field3522 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3509[var11] && var9.field3509[var11] != 0) {
                    var10 = var9.field3522[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2996(var10);
            }
        }
        class134 var12 = var9.method4273(1);
        if (var12 == null) {
            return null;
        }
        class286 var13 = null;
        if (var9.field3525 != -1) {
            var13 = method1568(var9.field3524, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3493 != -1) {
            var13 = method1568(var9.field3534, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3537 != -1) {
            var13 = method1568(var9.field3536, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3756;
        int var15 = Statics.field3754;
        int var16 = Statics.field3759;
        int[] var17 = new int[4];
        class282.method4595(var17);
        class286 var18 = new class286(36, 32);
        class282.method4610(var18.field3783, 36, 32);
        class282.method4557();
        class137.method2376();
        class137.method2374(16, 16);
        class137.field2052 = false;
        if (var9.field3537 != -1) {
            var13.method4676(0, 0);
        }
        int var19 = var9.field3498;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field2053[var9.field3483] * var19 >> 16;
        int var21 = class137.field2041[var9.field3483] * var19 >> 16;
        var12.method2277();
        var12.method2289(0, var9.field3520, var9.field3501, var9.field3483, var9.field3502, var9.field3535 + var12.field2141 / 2 + var20, var9.field3535 + var21);
        if (var9.field3493 != -1) {
            var13.method4676(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4672(1);
        }
        if (arg2 >= 2) {
            var18.method4672(16777215);
        }
        if (arg3 != 0) {
            var18.method4714(arg3);
        }
        class282.method4610(var18.field3783, 36, 32);
        if (var9.field3525 != -1) {
            var13.method4676(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3504 == 1) {
            class264 var22 = Statics.field845;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class226.field3017 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class226.field3015 + "</col>";
            }
            var22.method4383(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3490.method3222(var18, var6);
        }
        class282.method4610(var14, var15, var16);
        class282.method4566(var17);
        class137.method2376();
        class137.field2052 = true;
        return var18;
    }

    @ObfuscatedName("if.o(ZB)Z")
    public final boolean method4236(boolean arg0) {
        int var2 = this.field3510;
        int var3 = this.field3511;
        int var4 = this.field3516;
        if (arg0) {
            var2 = this.field3513;
            var3 = this.field3514;
            var4 = this.field3528;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field877.method3771(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field877.method3771(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field877.method3771(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("if.z(ZI)Ldw;")
    public final class128 method4228(boolean arg0) {
        int var2 = this.field3510;
        int var3 = this.field3511;
        int var4 = this.field3516;
        if (arg0) {
            var2 = this.field3513;
            var3 = this.field3514;
            var4 = this.field3528;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2208(Statics.field877, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2208(Statics.field877, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2208(Statics.field877, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3518 != 0) {
            var5.method2189(0, this.field3518, 0);
        }
        if (arg0 && this.field3515 != 0) {
            var5.method2189(0, this.field3515, 0);
        }
        if (this.field3523 != null) {
            for (int var10 = 0; var10 < this.field3523.length; var10++) {
                var5.method2190(this.field3523[var10], this.field3495[var10]);
            }
        }
        if (this.field3484 != null) {
            for (int var11 = 0; var11 < this.field3484.length; var11++) {
                var5.method2231(this.field3484[var11], this.field3497[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("if.q(ZB)Z")
    public final boolean method4229(boolean arg0) {
        int var2 = this.field3500;
        int var3 = this.field3519;
        if (arg0) {
            var2 = this.field3492;
            var3 = this.field3521;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field877.method3771(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field877.method3771(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("if.j(ZB)Ldw;")
    public final class128 method4230(boolean arg0) {
        int var2 = this.field3500;
        int var3 = this.field3519;
        if (arg0) {
            var2 = this.field3492;
            var3 = this.field3521;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2208(Statics.field877, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2208(Statics.field877, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3523 != null) {
            for (int var7 = 0; var7 < this.field3523.length; var7++) {
                var4.method2190(this.field3523[var7], this.field3495[var7]);
            }
        }
        if (this.field3484 != null) {
            for (int var8 = 0; var8 < this.field3484.length; var8++) {
                var4.method2231(this.field3484[var8], this.field3497[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("if.l(IIB)I")
    public int method4232(int arg0, int arg1) {
        return class250.method1453(this.field3532, arg0, arg1);
    }

    @ObfuscatedName("if.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4286(int arg0, String arg1) {
        return class250.method446(this.field3532, arg0, arg1);
    }

    @ObfuscatedName("if.t(I)I")
    public int method4265() {
        if (this.field3507 == -1 || this.field3508 == null) {
            return -1;
        } else if (this.field3507 >= 0) {
            return this.field3508[this.field3507] == null ? -1 : this.field3507;
        } else if (class226.field2996.equalsIgnoreCase(this.field3508[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aj.ad(ZB)V")
    public static void method574(boolean arg0) {
        if (Statics.field2013 != arg0) {
            field3488.method3221();
            field3527.method3221();
            field3490.method3221();
            Statics.field2013 = arg0;
        }
    }
}
