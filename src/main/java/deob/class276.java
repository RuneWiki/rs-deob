package deob;

@ObfuscatedName("jc")
public class class276 extends class214 {

    @ObfuscatedName("jc.b")
    public static class208 field3536 = new class208(64);

    @ObfuscatedName("jc.n")
    public static class208 field3511 = new class208(50);

    @ObfuscatedName("jc.e")
    public static class208 field3523 = new class208(200);

    @ObfuscatedName("jc.t")
    public int field3513;

    @ObfuscatedName("jc.l")
    public int field3505;

    @ObfuscatedName("jc.o")
    public String field3514 = class246.field2885;

    @ObfuscatedName("jc.u")
    public short[] field3544;

    @ObfuscatedName("jc.y")
    public short[] field3512;

    @ObfuscatedName("jc.k")
    public short[] field3518;

    @ObfuscatedName("jc.v")
    public short[] field3519;

    @ObfuscatedName("jc.d")
    public int field3549 = 2000;

    @ObfuscatedName("jc.w")
    public int field3521 = 0;

    @ObfuscatedName("jc.i")
    public int field3540 = 0;

    @ObfuscatedName("jc.c")
    public int field3516 = 0;

    @ObfuscatedName("jc.j")
    public int field3524 = 0;

    @ObfuscatedName("jc.z")
    public int field3525 = 0;

    @ObfuscatedName("jc.ag")
    public int field3526 = 0;

    @ObfuscatedName("jc.af")
    public int field3527 = 1;

    @ObfuscatedName("jc.ay")
    public boolean field3528 = false;

    @ObfuscatedName("jc.aa")
    public String[] field3529 = new String[] { null, null, class246.field2922, null, null };

    @ObfuscatedName("jc.ab")
    public String[] field3530 = new String[] { null, null, null, null, class246.field2879 };

    @ObfuscatedName("jc.aw")
    public int field3531 = -2;

    @ObfuscatedName("jc.an")
    public int field3532 = -1;

    @ObfuscatedName("jc.at")
    public int field3515 = -1;

    @ObfuscatedName("jc.ae")
    public int field3534 = 0;

    @ObfuscatedName("jc.av")
    public int field3535 = -1;

    @ObfuscatedName("jc.au")
    public int field3520 = -1;

    @ObfuscatedName("jc.aj")
    public int field3537 = 0;

    @ObfuscatedName("jc.as")
    public int field3507 = -1;

    @ObfuscatedName("jc.ar")
    public int field3539 = -1;

    @ObfuscatedName("jc.ai")
    public int field3541 = -1;

    @ObfuscatedName("jc.aq")
    public int field3522 = -1;

    @ObfuscatedName("jc.al")
    public int field3542 = -1;

    @ObfuscatedName("jc.az")
    public int field3543 = -1;

    @ObfuscatedName("jc.ac")
    public int[] field3517;

    @ObfuscatedName("jc.ao")
    public int[] field3545;

    @ObfuscatedName("jc.ad")
    public int field3546 = -1;

    @ObfuscatedName("jc.ax")
    public int field3559 = -1;

    @ObfuscatedName("jc.ap")
    public int field3548 = 128;

    @ObfuscatedName("jc.ak")
    public int field3510 = 128;

    @ObfuscatedName("jc.am")
    public int field3550 = 128;

    @ObfuscatedName("jc.bf")
    public int field3551 = 0;

    @ObfuscatedName("jc.bo")
    public int field3552 = 0;

    @ObfuscatedName("jc.be")
    public int field3557 = 0;

    @ObfuscatedName("jc.bd")
    public class205 field3554;

    @ObfuscatedName("jc.bz")
    public boolean field3555 = false;

    @ObfuscatedName("jc.bi")
    public int field3556 = -1;

    @ObfuscatedName("jc.bp")
    public int field3547 = -1;

    @ObfuscatedName("jc.bv")
    public int field3558 = -1;

    @ObfuscatedName("jc.bg")
    public int field3538 = -1;

    @ObfuscatedName("bg.a(IS)Ljc;")
    public static class276 method1049(int arg0) {
        class276 var1 = (class276) field3536.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2059.method4422(10, arg0);
        class276 var3 = new class276();
        var3.field3513 = arg0;
        if (var2 != null) {
            var3.method4891(new class190(var2));
        }
        var3.method4902();
        if (var3.field3559 != -1) {
            var3.method4893(method1049(var3.field3559), method1049(var3.field3546));
        }
        if (var3.field3547 != -1) {
            var3.method4900(method1049(var3.field3547), method1049(var3.field3556));
        }
        if (var3.field3538 != -1) {
            var3.method4894(method1049(var3.field3538), method1049(var3.field3558));
        }
        if (!Statics.field3508 && var3.field3528) {
            var3.field3514 = class246.field2965;
            var3.field3555 = false;
            var3.field3529 = null;
            var3.field3530 = null;
            var3.field3531 = -1;
            var3.field3557 = 0;
            if (var3.field3554 != null) {
                boolean var4 = false;
                for (class212 var5 = var3.field3554.method3854(); var5 != null; var5 = var3.field3554.method3863()) {
                    class271 var6 = class271.method5008((int) var5.field2512);
                    if (var6.field3411) {
                        var5.method3960();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3554 = null;
                }
            }
        }
        field3536.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.s(B)V")
    public void method4902() {
    }

    @ObfuscatedName("jc.g(Lgx;I)V")
    public void method4891(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4892(arg0, var2);
        }
    }

    @ObfuscatedName("jc.x(Lgx;IB)V")
    public void method4892(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3505 = arg0.method3610();
        } else if (arg1 == 2) {
            this.field3514 = arg0.method3647();
        } else if (arg1 == 4) {
            this.field3549 = arg0.method3610();
        } else if (arg1 == 5) {
            this.field3521 = arg0.method3610();
        } else if (arg1 == 6) {
            this.field3540 = arg0.method3610();
        } else if (arg1 == 7) {
            this.field3524 = arg0.method3610();
            if (this.field3524 > 32767) {
                this.field3524 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3525 = arg0.method3610();
            if (this.field3525 > 32767) {
                this.field3525 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3526 = 1;
        } else if (arg1 == 12) {
            this.field3527 = arg0.method3460();
        } else if (arg1 == 16) {
            this.field3528 = true;
        } else if (arg1 == 23) {
            this.field3532 = arg0.method3610();
            this.field3534 = arg0.method3443();
        } else if (arg1 == 24) {
            this.field3515 = arg0.method3610();
        } else if (arg1 == 25) {
            this.field3535 = arg0.method3610();
            this.field3537 = arg0.method3443();
        } else if (arg1 == 26) {
            this.field3520 = arg0.method3610();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3529[arg1 - 30] = arg0.method3647();
            if (this.field3529[arg1 - 30].equalsIgnoreCase(class246.field2880)) {
                this.field3529[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3530[arg1 - 35] = arg0.method3647();
        } else if (arg1 == 40) {
            int var3 = arg0.method3443();
            this.field3544 = new short[var3];
            this.field3512 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3544[var4] = (short) arg0.method3610();
                this.field3512[var4] = (short) arg0.method3610();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3443();
            this.field3518 = new short[var5];
            this.field3519 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3518[var6] = (short) arg0.method3610();
                this.field3519[var6] = (short) arg0.method3610();
            }
        } else if (arg1 == 42) {
            this.field3531 = arg0.method3599();
        } else if (arg1 == 65) {
            this.field3555 = true;
        } else if (arg1 == 78) {
            this.field3507 = arg0.method3610();
        } else if (arg1 == 79) {
            this.field3539 = arg0.method3610();
        } else if (arg1 == 90) {
            this.field3541 = arg0.method3610();
        } else if (arg1 == 91) {
            this.field3542 = arg0.method3610();
        } else if (arg1 == 92) {
            this.field3522 = arg0.method3610();
        } else if (arg1 == 93) {
            this.field3543 = arg0.method3610();
        } else if (arg1 == 95) {
            this.field3516 = arg0.method3610();
        } else if (arg1 == 97) {
            this.field3546 = arg0.method3610();
        } else if (arg1 == 98) {
            this.field3559 = arg0.method3610();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3517 == null) {
                this.field3517 = new int[10];
                this.field3545 = new int[10];
            }
            this.field3517[arg1 - 100] = arg0.method3610();
            this.field3545[arg1 - 100] = arg0.method3610();
        } else if (arg1 == 110) {
            this.field3548 = arg0.method3610();
        } else if (arg1 == 111) {
            this.field3510 = arg0.method3610();
        } else if (arg1 == 112) {
            this.field3550 = arg0.method3610();
        } else if (arg1 == 113) {
            this.field3551 = arg0.method3599();
        } else if (arg1 == 114) {
            this.field3552 = arg0.method3599() * 5;
        } else if (arg1 == 115) {
            this.field3557 = arg0.method3443();
        } else if (arg1 == 139) {
            this.field3556 = arg0.method3610();
        } else if (arg1 == 140) {
            this.field3547 = arg0.method3610();
        } else if (arg1 == 148) {
            this.field3558 = arg0.method3610();
        } else if (arg1 == 149) {
            this.field3538 = arg0.method3610();
        } else if (arg1 == 249) {
            this.field3554 = class269.method5420(arg0, this.field3554);
        }
    }

    @ObfuscatedName("jc.h(Ljc;Ljc;I)V")
    public void method4893(class276 arg0, class276 arg1) {
        this.field3505 = arg0.field3505;
        this.field3549 = arg0.field3549;
        this.field3521 = arg0.field3521;
        this.field3540 = arg0.field3540;
        this.field3516 = arg0.field3516;
        this.field3524 = arg0.field3524;
        this.field3525 = arg0.field3525;
        this.field3544 = arg0.field3544;
        this.field3512 = arg0.field3512;
        this.field3518 = arg0.field3518;
        this.field3519 = arg0.field3519;
        this.field3514 = arg1.field3514;
        this.field3528 = arg1.field3528;
        this.field3527 = arg1.field3527;
        this.field3526 = 1;
    }

    @ObfuscatedName("jc.f(Ljc;Ljc;I)V")
    public void method4900(class276 arg0, class276 arg1) {
        this.field3505 = arg0.field3505;
        this.field3549 = arg0.field3549;
        this.field3521 = arg0.field3521;
        this.field3540 = arg0.field3540;
        this.field3516 = arg0.field3516;
        this.field3524 = arg0.field3524;
        this.field3525 = arg0.field3525;
        this.field3544 = arg1.field3544;
        this.field3512 = arg1.field3512;
        this.field3518 = arg1.field3518;
        this.field3519 = arg1.field3519;
        this.field3514 = arg1.field3514;
        this.field3528 = arg1.field3528;
        this.field3526 = arg1.field3526;
        this.field3532 = arg1.field3532;
        this.field3515 = arg1.field3515;
        this.field3507 = arg1.field3507;
        this.field3535 = arg1.field3535;
        this.field3520 = arg1.field3520;
        this.field3539 = arg1.field3539;
        this.field3541 = arg1.field3541;
        this.field3522 = arg1.field3522;
        this.field3542 = arg1.field3542;
        this.field3543 = arg1.field3543;
        this.field3557 = arg1.field3557;
        this.field3529 = arg1.field3529;
        this.field3530 = new String[5];
        if (arg1.field3530 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3530[var3] = arg1.field3530[var3];
            }
        }
        this.field3530[4] = class246.field3131;
        this.field3527 = 0;
    }

    @ObfuscatedName("jc.p(Ljc;Ljc;I)V")
    public void method4894(class276 arg0, class276 arg1) {
        this.field3505 = arg0.field3505;
        this.field3549 = arg0.field3549;
        this.field3521 = arg0.field3521;
        this.field3540 = arg0.field3540;
        this.field3516 = arg0.field3516;
        this.field3524 = arg0.field3524;
        this.field3525 = arg0.field3525;
        this.field3544 = arg0.field3544;
        this.field3512 = arg0.field3512;
        this.field3518 = arg0.field3518;
        this.field3519 = arg0.field3519;
        this.field3526 = arg0.field3526;
        this.field3514 = arg1.field3514;
        this.field3527 = 0;
        this.field3528 = false;
        this.field3555 = false;
    }

    @ObfuscatedName("jc.m(II)Ldk;")
    public final class121 method4895(int arg0) {
        if (this.field3517 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3545[var3] && this.field3545[var3] != 0) {
                    var2 = this.field3517[var3];
                }
            }
            if (var2 != -1) {
                return method1049(var2).method4895(1);
            }
        }
        class121 var4 = class121.method2585(Statics.field3638, this.field3505, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3548 != 128 || this.field3510 != 128 || this.field3550 != 128) {
            var4.method2601(this.field3548, this.field3510, this.field3550);
        }
        if (this.field3544 != null) {
            for (int var5 = 0; var5 < this.field3544.length; var5++) {
                var4.method2607(this.field3544[var5], this.field3512[var5]);
            }
        }
        if (this.field3518 != null) {
            for (int var6 = 0; var6 < this.field3518.length; var6++) {
                var4.method2656(this.field3518[var6], this.field3519[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jc.q(IB)Ldv;")
    public final class127 method4896(int arg0) {
        if (this.field3517 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3545[var3] && this.field3545[var3] != 0) {
                    var2 = this.field3517[var3];
                }
            }
            if (var2 != -1) {
                return method1049(var2).method4896(1);
            }
        }
        class127 var4 = (class127) field3511.method3885((long) this.field3513);
        if (var4 != null) {
            return var4;
        }
        class121 var5 = class121.method2585(Statics.field3638, this.field3505, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3548 != 128 || this.field3510 != 128 || this.field3550 != 128) {
            var5.method2601(this.field3548, this.field3510, this.field3550);
        }
        if (this.field3544 != null) {
            for (int var6 = 0; var6 < this.field3544.length; var6++) {
                var5.method2607(this.field3544[var6], this.field3512[var6]);
            }
        }
        if (this.field3518 != null) {
            for (int var7 = 0; var7 < this.field3518.length; var7++) {
                var5.method2656(this.field3518[var7], this.field3519[var7]);
            }
        }
        class127 var8 = var5.method2658(this.field3551 + 64, this.field3552 + 768, -50, -10, -50);
        var8.field1697 = true;
        field3511.method3878(var8, (long) this.field3513);
        return var8;
    }

    @ObfuscatedName("jc.b(II)Ljc;")
    public class276 method4897(int arg0) {
        if (this.field3517 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3545[var3] && this.field3545[var3] != 0) {
                    var2 = this.field3517[var3];
                }
            }
            if (var2 != -1) {
                return method1049(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ii.n(IIIIIZB)Lld;")
    public static final class328 method4398(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class328 var8 = (class328) field3523.method3885(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class276 var9 = method1049(arg0);
        if (arg1 > 1 && var9.field3517 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3545[var11] && var9.field3545[var11] != 0) {
                    var10 = var9.field3517[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1049(var10);
            }
        }
        class127 var12 = var9.method4896(1);
        if (var12 == null) {
            return null;
        }
        class328 var13 = null;
        if (var9.field3559 != -1) {
            var13 = method4398(var9.field3546, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3547 != -1) {
            var13 = method4398(var9.field3556, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3538 != -1) {
            var13 = method4398(var9.field3558, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3863;
        int var15 = Statics.field3864;
        int var16 = Statics.field3862;
        int[] var17 = new int[4];
        class324.method5545(var17);
        class328 var18 = new class328(36, 32);
        class324.method5560(var18.field3895, 36, 32);
        class324.method5547();
        class130.method2789();
        class130.method2792(16, 16);
        class130.field1766 = false;
        if (var9.field3538 != -1) {
            var13.method5668(0, 0);
        }
        int var19 = var9.field3549;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class130.field1779[var9.field3521] * var19 >> 16;
        int var21 = class130.field1768[var9.field3521] * var19 >> 16;
        var12.method2683();
        var12.method2694(0, var9.field3540, var9.field3516, var9.field3521, var9.field3524, var9.field3525 + var12.field1863 / 2 + var20, var9.field3525 + var21);
        if (var9.field3547 != -1) {
            var13.method5668(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5664(1);
        }
        if (arg2 >= 2) {
            var18.method5664(16777215);
        }
        if (arg3 != 0) {
            var18.method5665(arg3);
        }
        class324.method5560(var18.field3895, 36, 32);
        if (var9.field3559 != -1) {
            var13.method5668(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3526 == 1) {
            class305 var22 = Statics.field128;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class246.field3045 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class246.field3043 + "</col>";
            }
            var22.method5319(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3523.method3878(var18, var6);
        }
        class324.method5560(var14, var15, var16);
        class324.method5546(var17);
        class130.method2789();
        class130.field1766 = true;
        return var18;
    }

    @ObfuscatedName("jc.e(ZI)Z")
    public final boolean method4898(boolean arg0) {
        int var2 = this.field3532;
        int var3 = this.field3515;
        int var4 = this.field3507;
        if (arg0) {
            var2 = this.field3535;
            var3 = this.field3520;
            var4 = this.field3539;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3638.method4424(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3638.method4424(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3638.method4424(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("jc.r(ZB)Ldk;")
    public final class121 method4921(boolean arg0) {
        int var2 = this.field3532;
        int var3 = this.field3515;
        int var4 = this.field3507;
        if (arg0) {
            var2 = this.field3535;
            var3 = this.field3520;
            var4 = this.field3539;
        }
        if (var2 == -1) {
            return null;
        }
        class121 var5 = class121.method2585(Statics.field3638, var2, 0);
        if (var3 != -1) {
            class121 var6 = class121.method2585(Statics.field3638, var3, 0);
            if (var4 == -1) {
                class121[] var9 = new class121[] { var5, var6 };
                var5 = new class121(var9, 2);
            } else {
                class121 var7 = class121.method2585(Statics.field3638, var4, 0);
                class121[] var8 = new class121[] { var5, var6, var7 };
                var5 = new class121(var8, 3);
            }
        }
        if (!arg0 && this.field3534 != 0) {
            var5.method2620(0, this.field3534, 0);
        }
        if (arg0 && this.field3537 != 0) {
            var5.method2620(0, this.field3537, 0);
        }
        if (this.field3544 != null) {
            for (int var10 = 0; var10 < this.field3544.length; var10++) {
                var5.method2607(this.field3544[var10], this.field3512[var10]);
            }
        }
        if (this.field3518 != null) {
            for (int var11 = 0; var11 < this.field3518.length; var11++) {
                var5.method2656(this.field3518[var11], this.field3519[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("jc.t(ZI)Z")
    public final boolean method4908(boolean arg0) {
        int var2 = this.field3541;
        int var3 = this.field3522;
        if (arg0) {
            var2 = this.field3542;
            var3 = this.field3543;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3638.method4424(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3638.method4424(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("jc.l(ZI)Ldk;")
    public final class121 method4901(boolean arg0) {
        int var2 = this.field3541;
        int var3 = this.field3522;
        if (arg0) {
            var2 = this.field3542;
            var3 = this.field3543;
        }
        if (var2 == -1) {
            return null;
        }
        class121 var4 = class121.method2585(Statics.field3638, var2, 0);
        if (var3 != -1) {
            class121 var5 = class121.method2585(Statics.field3638, var3, 0);
            class121[] var6 = new class121[] { var4, var5 };
            var4 = new class121(var6, 2);
        }
        if (this.field3544 != null) {
            for (int var7 = 0; var7 < this.field3544.length; var7++) {
                var4.method2607(this.field3544[var7], this.field3512[var7]);
            }
        }
        if (this.field3518 != null) {
            for (int var8 = 0; var8 < this.field3518.length; var8++) {
                var4.method2656(this.field3518[var8], this.field3519[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("jc.o(IIS)I")
    public int method4932(int arg0, int arg1) {
        class205 var3 = this.field3554;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3851((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2527;
            }
        }
        return var4;
    }

    @ObfuscatedName("jc.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4903(int arg0, String arg1) {
        class205 var3 = this.field3554;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class203 var5 = (class203) var3.method3851((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2483;
            }
        }
        return var4;
    }

    @ObfuscatedName("jc.y(I)I")
    public int method4904() {
        if (this.field3531 == -1 || this.field3530 == null) {
            return -1;
        } else if (this.field3531 >= 0) {
            return this.field3530[this.field3531] == null ? -1 : this.field3531;
        } else if (class246.field2879.equalsIgnoreCase(this.field3530[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("jz.k(B)V")
    public static void method4765() {
        field3536.method3879();
        field3511.method3879();
        field3523.method3879();
    }
}
