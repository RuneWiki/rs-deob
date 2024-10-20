package deob;

@ObfuscatedName("iy")
public class class257 extends class195 {

    @ObfuscatedName("iy.c")
    public static class190 field3498 = new class190(64);

    @ObfuscatedName("iy.o")
    public static class190 field3499 = new class190(50);

    @ObfuscatedName("iy.q")
    public static class190 field3516 = new class190(200);

    @ObfuscatedName("iy.a")
    public int field3521;

    @ObfuscatedName("iy.g")
    public int field3518;

    @ObfuscatedName("iy.v")
    public String field3535 = "null";

    @ObfuscatedName("iy.s")
    public short[] field3504;

    @ObfuscatedName("iy.k")
    public short[] field3505;

    @ObfuscatedName("iy.r")
    public short[] field3497;

    @ObfuscatedName("iy.l")
    public short[] field3507;

    @ObfuscatedName("iy.h")
    public int field3512 = 2000;

    @ObfuscatedName("iy.d")
    public int field3509 = 0;

    @ObfuscatedName("iy.x")
    public int field3510 = 0;

    @ObfuscatedName("iy.b")
    public int field3542 = 0;

    @ObfuscatedName("iy.y")
    public int field3517 = 0;

    @ObfuscatedName("iy.u")
    public int field3513 = 0;

    @ObfuscatedName("iy.av")
    public int field3503 = 0;

    @ObfuscatedName("iy.ax")
    public int field3515 = 1;

    @ObfuscatedName("iy.af")
    public boolean field3511 = false;

    @ObfuscatedName("iy.ae")
    public String[] field3502 = new String[] { null, null, class226.field2881, null, null };

    @ObfuscatedName("iy.ap")
    public String[] field3495 = new String[] { null, null, null, null, class226.field2865 };

    @ObfuscatedName("iy.al")
    public int field3519 = -2;

    @ObfuscatedName("iy.ab")
    public int field3506 = -1;

    @ObfuscatedName("iy.am")
    public int field3520 = -1;

    @ObfuscatedName("iy.ar")
    public int field3522 = 0;

    @ObfuscatedName("iy.ao")
    public int field3523 = -1;

    @ObfuscatedName("iy.ac")
    public int field3524 = -1;

    @ObfuscatedName("iy.aa")
    public int field3525 = 0;

    @ObfuscatedName("iy.ay")
    public int field3526 = -1;

    @ObfuscatedName("iy.aj")
    public int field3527 = -1;

    @ObfuscatedName("iy.ag")
    public int field3528 = -1;

    @ObfuscatedName("iy.aq")
    public int field3529 = -1;

    @ObfuscatedName("iy.as")
    public int field3530 = -1;

    @ObfuscatedName("iy.an")
    public int field3531 = -1;

    @ObfuscatedName("iy.az")
    public int[] field3532;

    @ObfuscatedName("iy.ai")
    public int[] field3533;

    @ObfuscatedName("iy.aw")
    public int field3534 = -1;

    @ObfuscatedName("iy.au")
    public int field3543 = -1;

    @ObfuscatedName("iy.ah")
    public int field3501 = 128;

    @ObfuscatedName("iy.ad")
    public int field3537 = 128;

    @ObfuscatedName("iy.at")
    public int field3538 = 128;

    @ObfuscatedName("iy.bg")
    public int field3539 = 0;

    @ObfuscatedName("iy.bf")
    public int field3540 = 0;

    @ObfuscatedName("iy.bi")
    public int field3541 = 0;

    @ObfuscatedName("iy.bv")
    public class187 field3508;

    @ObfuscatedName("iy.bz")
    public boolean field3514 = false;

    @ObfuscatedName("iy.ba")
    public int field3544 = -1;

    @ObfuscatedName("iy.bp")
    public int field3545 = -1;

    @ObfuscatedName("iy.bn")
    public int field3546 = -1;

    @ObfuscatedName("iy.br")
    public int field3547 = -1;

    @ObfuscatedName("hc.p(II)Liy;")
    public static class257 method3684(int arg0) {
        class257 var1 = (class257) field3498.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1410.method3720(10, arg0);
        class257 var3 = new class257();
        var3.field3521 = arg0;
        if (var2 != null) {
            var3.method4135(new class174(var2));
        }
        var3.method4134();
        if (var3.field3543 != -1) {
            var3.method4139(method3684(var3.field3543), method3684(var3.field3534));
        }
        if (var3.field3545 != -1) {
            var3.method4138(method3684(var3.field3545), method3684(var3.field3544));
        }
        if (var3.field3547 != -1) {
            var3.method4170(method3684(var3.field3547), method3684(var3.field3546));
        }
        if (!Statics.field3286 && var3.field3511) {
            var3.field3535 = class226.field2911;
            var3.field3514 = false;
            var3.field3502 = null;
            var3.field3495 = null;
            var3.field3519 = -1;
            var3.field3541 = 0;
            if (var3.field3508 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3508.method3155(); var5 != null; var5 = var3.field3508.method3157()) {
                    class252 var6 = class252.method3691((int) var5.field2483);
                    if (var6.field3397) {
                        var5.method3234();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3508 = null;
                }
            }
        }
        field3498.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.m(I)V")
    public void method4134() {
    }

    @ObfuscatedName("iy.e(Lfr;B)V")
    public void method4135(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method4136(arg0, var2);
        }
    }

    @ObfuscatedName("iy.t(Lfr;II)V")
    public void method4136(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3518 = arg0.method2824();
        } else if (arg1 == 2) {
            this.field3535 = arg0.method2818();
        } else if (arg1 == 4) {
            this.field3512 = arg0.method2824();
        } else if (arg1 == 5) {
            this.field3509 = arg0.method2824();
        } else if (arg1 == 6) {
            this.field3510 = arg0.method2824();
        } else if (arg1 == 7) {
            this.field3517 = arg0.method2824();
            if (this.field3517 > 32767) {
                this.field3517 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3513 = arg0.method2824();
            if (this.field3513 > 32767) {
                this.field3513 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3503 = 1;
        } else if (arg1 == 12) {
            this.field3515 = arg0.method2803();
        } else if (arg1 == 16) {
            this.field3511 = true;
        } else if (arg1 == 23) {
            this.field3506 = arg0.method2824();
            this.field3522 = arg0.method2810();
        } else if (arg1 == 24) {
            this.field3520 = arg0.method2824();
        } else if (arg1 == 25) {
            this.field3523 = arg0.method2824();
            this.field3525 = arg0.method2810();
        } else if (arg1 == 26) {
            this.field3524 = arg0.method2824();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3502[arg1 - 30] = arg0.method2818();
            if (this.field3502[arg1 - 30].equalsIgnoreCase(class226.field2866)) {
                this.field3502[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3495[arg1 - 35] = arg0.method2818();
        } else if (arg1 == 40) {
            int var3 = arg0.method2810();
            this.field3504 = new short[var3];
            this.field3505 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3504[var4] = (short) arg0.method2824();
                this.field3505[var4] = (short) arg0.method2824();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2810();
            this.field3497 = new short[var5];
            this.field3507 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3497[var6] = (short) arg0.method2824();
                this.field3507[var6] = (short) arg0.method2824();
            }
        } else if (arg1 == 42) {
            this.field3519 = arg0.method2811();
        } else if (arg1 == 65) {
            this.field3514 = true;
        } else if (arg1 == 78) {
            this.field3526 = arg0.method2824();
        } else if (arg1 == 79) {
            this.field3527 = arg0.method2824();
        } else if (arg1 == 90) {
            this.field3528 = arg0.method2824();
        } else if (arg1 == 91) {
            this.field3530 = arg0.method2824();
        } else if (arg1 == 92) {
            this.field3529 = arg0.method2824();
        } else if (arg1 == 93) {
            this.field3531 = arg0.method2824();
        } else if (arg1 == 95) {
            this.field3542 = arg0.method2824();
        } else if (arg1 == 97) {
            this.field3534 = arg0.method2824();
        } else if (arg1 == 98) {
            this.field3543 = arg0.method2824();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3532 == null) {
                this.field3532 = new int[10];
                this.field3533 = new int[10];
            }
            this.field3532[arg1 - 100] = arg0.method2824();
            this.field3533[arg1 - 100] = arg0.method2824();
        } else if (arg1 == 110) {
            this.field3501 = arg0.method2824();
        } else if (arg1 == 111) {
            this.field3537 = arg0.method2824();
        } else if (arg1 == 112) {
            this.field3538 = arg0.method2824();
        } else if (arg1 == 113) {
            this.field3539 = arg0.method2811();
        } else if (arg1 == 114) {
            this.field3540 = arg0.method2811() * 5;
        } else if (arg1 == 115) {
            this.field3541 = arg0.method2810();
        } else if (arg1 == 139) {
            this.field3544 = arg0.method2824();
        } else if (arg1 == 140) {
            this.field3545 = arg0.method2824();
        } else if (arg1 == 148) {
            this.field3546 = arg0.method2824();
        } else if (arg1 == 149) {
            this.field3547 = arg0.method2824();
        } else if (arg1 == 249) {
            this.field3508 = class250.method2793(arg0, this.field3508);
        }
    }

    @ObfuscatedName("iy.w(Liy;Liy;I)V")
    public void method4139(class257 arg0, class257 arg1) {
        this.field3518 = arg0.field3518;
        this.field3512 = arg0.field3512;
        this.field3509 = arg0.field3509;
        this.field3510 = arg0.field3510;
        this.field3542 = arg0.field3542;
        this.field3517 = arg0.field3517;
        this.field3513 = arg0.field3513;
        this.field3504 = arg0.field3504;
        this.field3505 = arg0.field3505;
        this.field3497 = arg0.field3497;
        this.field3507 = arg0.field3507;
        this.field3535 = arg1.field3535;
        this.field3511 = arg1.field3511;
        this.field3515 = arg1.field3515;
        this.field3503 = 1;
    }

    @ObfuscatedName("iy.z(Liy;Liy;I)V")
    public void method4138(class257 arg0, class257 arg1) {
        this.field3518 = arg0.field3518;
        this.field3512 = arg0.field3512;
        this.field3509 = arg0.field3509;
        this.field3510 = arg0.field3510;
        this.field3542 = arg0.field3542;
        this.field3517 = arg0.field3517;
        this.field3513 = arg0.field3513;
        this.field3504 = arg1.field3504;
        this.field3505 = arg1.field3505;
        this.field3497 = arg1.field3497;
        this.field3507 = arg1.field3507;
        this.field3535 = arg1.field3535;
        this.field3511 = arg1.field3511;
        this.field3503 = arg1.field3503;
        this.field3506 = arg1.field3506;
        this.field3520 = arg1.field3520;
        this.field3526 = arg1.field3526;
        this.field3523 = arg1.field3523;
        this.field3524 = arg1.field3524;
        this.field3527 = arg1.field3527;
        this.field3528 = arg1.field3528;
        this.field3529 = arg1.field3529;
        this.field3530 = arg1.field3530;
        this.field3531 = arg1.field3531;
        this.field3541 = arg1.field3541;
        this.field3502 = arg1.field3502;
        this.field3495 = new String[5];
        if (arg1.field3495 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3495[var3] = arg1.field3495[var3];
            }
        }
        this.field3495[4] = class226.field2870;
        this.field3515 = 0;
    }

    @ObfuscatedName("iy.j(Liy;Liy;B)V")
    public void method4170(class257 arg0, class257 arg1) {
        this.field3518 = arg0.field3518;
        this.field3512 = arg0.field3512;
        this.field3509 = arg0.field3509;
        this.field3510 = arg0.field3510;
        this.field3542 = arg0.field3542;
        this.field3517 = arg0.field3517;
        this.field3513 = arg0.field3513;
        this.field3504 = arg0.field3504;
        this.field3505 = arg0.field3505;
        this.field3497 = arg0.field3497;
        this.field3507 = arg0.field3507;
        this.field3503 = arg0.field3503;
        this.field3535 = arg1.field3535;
        this.field3515 = 0;
        this.field3511 = false;
        this.field3514 = false;
    }

    @ObfuscatedName("iy.c(II)Ldo;")
    public final class128 method4142(int arg0) {
        if (this.field3532 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3533[var3] && this.field3533[var3] != 0) {
                    var2 = this.field3532[var3];
                }
            }
            if (var2 != -1) {
                return method3684(var2).method4142(1);
            }
        }
        class128 var4 = class128.method2137(Statics.field1486, this.field3518, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3501 != 128 || this.field3537 != 128 || this.field3538 != 128) {
            var4.method2152(this.field3501, this.field3537, this.field3538);
        }
        if (this.field3504 != null) {
            for (int var5 = 0; var5 < this.field3504.length; var5++) {
                var4.method2149(this.field3504[var5], this.field3505[var5]);
            }
        }
        if (this.field3497 != null) {
            for (int var6 = 0; var6 < this.field3497.length; var6++) {
                var4.method2147(this.field3497[var6], this.field3507[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iy.o(IB)Les;")
    public final class134 method4182(int arg0) {
        if (this.field3532 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3533[var3] && this.field3533[var3] != 0) {
                    var2 = this.field3532[var3];
                }
            }
            if (var2 != -1) {
                return method3684(var2).method4182(1);
            }
        }
        class134 var4 = (class134) field3499.method3182((long) this.field3521);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2137(Statics.field1486, this.field3518, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3501 != 128 || this.field3537 != 128 || this.field3538 != 128) {
            var5.method2152(this.field3501, this.field3537, this.field3538);
        }
        if (this.field3504 != null) {
            for (int var6 = 0; var6 < this.field3504.length; var6++) {
                var5.method2149(this.field3504[var6], this.field3505[var6]);
            }
        }
        if (this.field3497 != null) {
            for (int var7 = 0; var7 < this.field3497.length; var7++) {
                var5.method2147(this.field3497[var7], this.field3507[var7]);
            }
        }
        class134 var8 = var5.method2148(this.field3539 + 64, this.field3540 + 768, -50, -10, -50);
        var8.field1950 = true;
        field3499.method3179(var8, (long) this.field3521);
        return var8;
    }

    @ObfuscatedName("iy.q(IB)Liy;")
    public class257 method4155(int arg0) {
        if (this.field3532 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3533[var3] && this.field3533[var3] != 0) {
                    var2 = this.field3532[var3];
                }
            }
            if (var2 != -1) {
                return method3684(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ip.a(IB)Ljava/lang/String;")
    public static final String method3887(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class226.field3027 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class226.field3088 + "</col>";
        }
    }

    @ObfuscatedName("iy.g(ZI)Z")
    public final boolean method4143(boolean arg0) {
        int var2 = this.field3506;
        int var3 = this.field3520;
        int var4 = this.field3526;
        if (arg0) {
            var2 = this.field3523;
            var3 = this.field3524;
            var4 = this.field3527;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1486.method3706(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1486.method3706(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1486.method3706(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("iy.v(ZI)Ldo;")
    public final class128 method4144(boolean arg0) {
        int var2 = this.field3506;
        int var3 = this.field3520;
        int var4 = this.field3526;
        if (arg0) {
            var2 = this.field3523;
            var3 = this.field3524;
            var4 = this.field3527;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2137(Statics.field1486, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2137(Statics.field1486, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2137(Statics.field1486, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3522 != 0) {
            var5.method2186(0, this.field3522, 0);
        }
        if (arg0 && this.field3525 != 0) {
            var5.method2186(0, this.field3525, 0);
        }
        if (this.field3504 != null) {
            for (int var10 = 0; var10 < this.field3504.length; var10++) {
                var5.method2149(this.field3504[var10], this.field3505[var10]);
            }
        }
        if (this.field3497 != null) {
            for (int var11 = 0; var11 < this.field3497.length; var11++) {
                var5.method2147(this.field3497[var11], this.field3507[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("iy.s(ZB)Z")
    public final boolean method4145(boolean arg0) {
        int var2 = this.field3528;
        int var3 = this.field3529;
        if (arg0) {
            var2 = this.field3530;
            var3 = this.field3531;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1486.method3706(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1486.method3706(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("iy.k(ZI)Ldo;")
    public final class128 method4146(boolean arg0) {
        int var2 = this.field3528;
        int var3 = this.field3529;
        if (arg0) {
            var2 = this.field3530;
            var3 = this.field3531;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2137(Statics.field1486, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2137(Statics.field1486, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3504 != null) {
            for (int var7 = 0; var7 < this.field3504.length; var7++) {
                var4.method2149(this.field3504[var7], this.field3505[var7]);
            }
        }
        if (this.field3497 != null) {
            for (int var8 = 0; var8 < this.field3497.length; var8++) {
                var4.method2147(this.field3497[var8], this.field3507[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iy.r(IIB)I")
    public int method4152(int arg0, int arg1) {
        return class250.method1645(this.field3508, arg0, arg1);
    }

    @ObfuscatedName("iy.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4148(int arg0, String arg1) {
        return class250.method2742(this.field3508, arg0, arg1);
    }

    @ObfuscatedName("iy.d(B)I")
    public int method4176() {
        if (this.field3519 == -1 || this.field3495 == null) {
            return -1;
        } else if (this.field3519 >= 0) {
            return this.field3495[this.field3519] == null ? -1 : this.field3519;
        } else if (class226.field2865.equalsIgnoreCase(this.field3495[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hw.x(I)V")
    public static void method3568() {
        field3516.method3180();
    }

    @ObfuscatedName("cd.b(ZI)V")
    public static void method1569(boolean arg0) {
        if (Statics.field3286 != arg0) {
            field3498.method3180();
            field3499.method3180();
            field3516.method3180();
            Statics.field3286 = arg0;
        }
    }
}
