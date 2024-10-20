package deob;

@ObfuscatedName("iu")
public class class257 extends class195 {

    @ObfuscatedName("iu.a")
    public static class190 field3486 = new class190(64);

    @ObfuscatedName("iu.k")
    public static class190 field3507 = new class190(50);

    @ObfuscatedName("iu.r")
    public static class190 field3503 = new class190(200);

    @ObfuscatedName("iu.x")
    public int field3513;

    @ObfuscatedName("iu.o")
    public int field3508;

    @ObfuscatedName("iu.j")
    public String field3489 = "null";

    @ObfuscatedName("iu.m")
    public short[] field3493;

    @ObfuscatedName("iu.d")
    public short[] field3494;

    @ObfuscatedName("iu.e")
    public short[] field3495;

    @ObfuscatedName("iu.s")
    public short[] field3496;

    @ObfuscatedName("iu.n")
    public int field3497 = 2000;

    @ObfuscatedName("iu.y")
    public int field3524 = 0;

    @ObfuscatedName("iu.w")
    public int field3499 = 0;

    @ObfuscatedName("iu.f")
    public int field3500 = 0;

    @ObfuscatedName("iu.c")
    public int field3519 = 0;

    @ObfuscatedName("iu.z")
    public int field3502 = 0;

    @ObfuscatedName("iu.ay")
    public int field3490 = 0;

    @ObfuscatedName("iu.ah")
    public int field3504 = 1;

    @ObfuscatedName("iu.az")
    public boolean field3505 = false;

    @ObfuscatedName("iu.ac")
    public String[] field3506 = new String[] { null, null, class226.field2955, null, null };

    @ObfuscatedName("iu.aq")
    public String[] field3482 = new String[] { null, null, null, null, class226.field2844 };

    @ObfuscatedName("iu.aj")
    public int field3510 = -2;

    @ObfuscatedName("iu.ax")
    public int field3498 = -1;

    @ObfuscatedName("iu.ad")
    public int field3501 = -1;

    @ObfuscatedName("iu.av")
    public int field3511 = 0;

    @ObfuscatedName("iu.ae")
    public int field3512 = -1;

    @ObfuscatedName("iu.ar")
    public int field3487 = -1;

    @ObfuscatedName("iu.ag")
    public int field3514 = 0;

    @ObfuscatedName("iu.at")
    public int field3515 = -1;

    @ObfuscatedName("iu.ai")
    public int field3516 = -1;

    @ObfuscatedName("iu.ao")
    public int field3491 = -1;

    @ObfuscatedName("iu.am")
    public int field3484 = -1;

    @ObfuscatedName("iu.ap")
    public int field3509 = -1;

    @ObfuscatedName("iu.as")
    public int field3520 = -1;

    @ObfuscatedName("iu.aw")
    public int[] field3521;

    @ObfuscatedName("iu.al")
    public int[] field3522;

    @ObfuscatedName("iu.ak")
    public int field3523 = -1;

    @ObfuscatedName("iu.aa")
    public int field3533 = -1;

    @ObfuscatedName("iu.an")
    public int field3488 = 128;

    @ObfuscatedName("iu.au")
    public int field3526 = 128;

    @ObfuscatedName("iu.ab")
    public int field3527 = 128;

    @ObfuscatedName("iu.bz")
    public int field3528 = 0;

    @ObfuscatedName("iu.bd")
    public int field3529 = 0;

    @ObfuscatedName("iu.bp")
    public int field3492 = 0;

    @ObfuscatedName("iu.bf")
    public class187 field3531;

    @ObfuscatedName("iu.bb")
    public boolean field3532 = false;

    @ObfuscatedName("iu.bw")
    public int field3530 = -1;

    @ObfuscatedName("iu.bh")
    public int field3534 = -1;

    @ObfuscatedName("iu.bl")
    public int field3535 = -1;

    @ObfuscatedName("iu.bi")
    public int field3536 = -1;

    @ObfuscatedName("ab.i(II)Liu;")
    public static class257 method678(int arg0) {
        class257 var1 = (class257) field3486.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3517.method3836(10, arg0);
        class257 var3 = new class257();
        var3.field3513 = arg0;
        if (var2 != null) {
            var3.method4274(new class174(var2));
        }
        var3.method4288();
        if (var3.field3533 != -1) {
            var3.method4293(method678(var3.field3533), method678(var3.field3523));
        }
        if (var3.field3534 != -1) {
            var3.method4305(method678(var3.field3534), method678(var3.field3530));
        }
        if (var3.field3536 != -1) {
            var3.method4278(method678(var3.field3536), method678(var3.field3535));
        }
        if (!Statics.field3175 && var3.field3505) {
            var3.field3489 = class226.field3012;
            var3.field3532 = false;
            var3.field3506 = null;
            var3.field3482 = null;
            var3.field3510 = -1;
            var3.field3492 = 0;
            if (var3.field3531 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3531.method3278(); var5 != null; var5 = var3.field3531.method3274()) {
                    class252 var6 = class252.method699((int) var5.field2467);
                    if (var6.field3385) {
                        var5.method3364();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3531 = null;
                }
            }
        }
        field3486.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.h(I)V")
    public void method4288() {
    }

    @ObfuscatedName("iu.u(Lfv;B)V")
    public void method4274(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4275(arg0, var2);
        }
    }

    @ObfuscatedName("iu.q(Lfv;II)V")
    public void method4275(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3508 = arg0.method2932();
        } else if (arg1 == 2) {
            this.field3489 = arg0.method2938();
        } else if (arg1 == 4) {
            this.field3497 = arg0.method2932();
        } else if (arg1 == 5) {
            this.field3524 = arg0.method2932();
        } else if (arg1 == 6) {
            this.field3499 = arg0.method2932();
        } else if (arg1 == 7) {
            this.field3519 = arg0.method2932();
            if (this.field3519 > 32767) {
                this.field3519 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3502 = arg0.method2932();
            if (this.field3502 > 32767) {
                this.field3502 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3490 = 1;
        } else if (arg1 == 12) {
            this.field3504 = arg0.method2927();
        } else if (arg1 == 16) {
            this.field3505 = true;
        } else if (arg1 == 23) {
            this.field3498 = arg0.method2932();
            this.field3511 = arg0.method2930();
        } else if (arg1 == 24) {
            this.field3501 = arg0.method2932();
        } else if (arg1 == 25) {
            this.field3512 = arg0.method2932();
            this.field3514 = arg0.method2930();
        } else if (arg1 == 26) {
            this.field3487 = arg0.method2932();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3506[arg1 - 30] = arg0.method2938();
            if (this.field3506[arg1 - 30].equalsIgnoreCase(class226.field2845)) {
                this.field3506[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3482[arg1 - 35] = arg0.method2938();
        } else if (arg1 == 40) {
            int var3 = arg0.method2930();
            this.field3493 = new short[var3];
            this.field3494 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3493[var4] = (short) arg0.method2932();
                this.field3494[var4] = (short) arg0.method2932();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2930();
            this.field3495 = new short[var5];
            this.field3496 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3495[var6] = (short) arg0.method2932();
                this.field3496[var6] = (short) arg0.method2932();
            }
        } else if (arg1 == 42) {
            this.field3510 = arg0.method2931();
        } else if (arg1 == 65) {
            this.field3532 = true;
        } else if (arg1 == 78) {
            this.field3515 = arg0.method2932();
        } else if (arg1 == 79) {
            this.field3516 = arg0.method2932();
        } else if (arg1 == 90) {
            this.field3491 = arg0.method2932();
        } else if (arg1 == 91) {
            this.field3509 = arg0.method2932();
        } else if (arg1 == 92) {
            this.field3484 = arg0.method2932();
        } else if (arg1 == 93) {
            this.field3520 = arg0.method2932();
        } else if (arg1 == 95) {
            this.field3500 = arg0.method2932();
        } else if (arg1 == 97) {
            this.field3523 = arg0.method2932();
        } else if (arg1 == 98) {
            this.field3533 = arg0.method2932();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3521 == null) {
                this.field3521 = new int[10];
                this.field3522 = new int[10];
            }
            this.field3521[arg1 - 100] = arg0.method2932();
            this.field3522[arg1 - 100] = arg0.method2932();
        } else if (arg1 == 110) {
            this.field3488 = arg0.method2932();
        } else if (arg1 == 111) {
            this.field3526 = arg0.method2932();
        } else if (arg1 == 112) {
            this.field3527 = arg0.method2932();
        } else if (arg1 == 113) {
            this.field3528 = arg0.method2931();
        } else if (arg1 == 114) {
            this.field3529 = arg0.method2931();
        } else if (arg1 == 115) {
            this.field3492 = arg0.method2930();
        } else if (arg1 == 139) {
            this.field3530 = arg0.method2932();
        } else if (arg1 == 140) {
            this.field3534 = arg0.method2932();
        } else if (arg1 == 148) {
            this.field3535 = arg0.method2932();
        } else if (arg1 == 149) {
            this.field3536 = arg0.method2932();
        } else if (arg1 == 249) {
            this.field3531 = class250.method2688(arg0, this.field3531);
        }
    }

    @ObfuscatedName("iu.g(Liu;Liu;I)V")
    public void method4293(class257 arg0, class257 arg1) {
        this.field3508 = arg0.field3508;
        this.field3497 = arg0.field3497;
        this.field3524 = arg0.field3524;
        this.field3499 = arg0.field3499;
        this.field3500 = arg0.field3500;
        this.field3519 = arg0.field3519;
        this.field3502 = arg0.field3502;
        this.field3493 = arg0.field3493;
        this.field3494 = arg0.field3494;
        this.field3495 = arg0.field3495;
        this.field3496 = arg0.field3496;
        this.field3489 = arg1.field3489;
        this.field3505 = arg1.field3505;
        this.field3504 = arg1.field3504;
        this.field3490 = 1;
    }

    @ObfuscatedName("iu.v(Liu;Liu;I)V")
    public void method4305(class257 arg0, class257 arg1) {
        this.field3508 = arg0.field3508;
        this.field3497 = arg0.field3497;
        this.field3524 = arg0.field3524;
        this.field3499 = arg0.field3499;
        this.field3500 = arg0.field3500;
        this.field3519 = arg0.field3519;
        this.field3502 = arg0.field3502;
        this.field3493 = arg1.field3493;
        this.field3494 = arg1.field3494;
        this.field3495 = arg1.field3495;
        this.field3496 = arg1.field3496;
        this.field3489 = arg1.field3489;
        this.field3505 = arg1.field3505;
        this.field3490 = arg1.field3490;
        this.field3498 = arg1.field3498;
        this.field3501 = arg1.field3501;
        this.field3515 = arg1.field3515;
        this.field3512 = arg1.field3512;
        this.field3487 = arg1.field3487;
        this.field3516 = arg1.field3516;
        this.field3491 = arg1.field3491;
        this.field3484 = arg1.field3484;
        this.field3509 = arg1.field3509;
        this.field3520 = arg1.field3520;
        this.field3492 = arg1.field3492;
        this.field3506 = arg1.field3506;
        this.field3482 = new String[5];
        if (arg1.field3482 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3482[var3] = arg1.field3482[var3];
            }
        }
        this.field3482[4] = class226.field3045;
        this.field3504 = 0;
    }

    @ObfuscatedName("iu.t(Liu;Liu;I)V")
    public void method4278(class257 arg0, class257 arg1) {
        this.field3508 = arg0.field3508;
        this.field3497 = arg0.field3497;
        this.field3524 = arg0.field3524;
        this.field3499 = arg0.field3499;
        this.field3500 = arg0.field3500;
        this.field3519 = arg0.field3519;
        this.field3502 = arg0.field3502;
        this.field3493 = arg0.field3493;
        this.field3494 = arg0.field3494;
        this.field3495 = arg0.field3495;
        this.field3496 = arg0.field3496;
        this.field3490 = arg0.field3490;
        this.field3489 = arg1.field3489;
        this.field3504 = 0;
        this.field3505 = false;
        this.field3532 = false;
    }

    @ObfuscatedName("iu.p(IB)Ldf;")
    public final class128 method4279(int arg0) {
        if (this.field3521 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3522[var3] && this.field3522[var3] != 0) {
                    var2 = this.field3521[var3];
                }
            }
            if (var2 != -1) {
                return method678(var2).method4279(1);
            }
        }
        class128 var4 = class128.method2227(Statics.field2303, this.field3508, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3488 != 128 || this.field3526 != 128 || this.field3527 != 128) {
            var4.method2294(this.field3488, this.field3526, this.field3527);
        }
        if (this.field3493 != null) {
            for (int var5 = 0; var5 < this.field3493.length; var5++) {
                var4.method2289(this.field3493[var5], this.field3494[var5]);
            }
        }
        if (this.field3495 != null) {
            for (int var6 = 0; var6 < this.field3495.length; var6++) {
                var4.method2295(this.field3495[var6], this.field3496[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iu.l(II)Lew;")
    public final class134 method4328(int arg0) {
        if (this.field3521 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3522[var3] && this.field3522[var3] != 0) {
                    var2 = this.field3521[var3];
                }
            }
            if (var2 != -1) {
                return method678(var2).method4328(1);
            }
        }
        class134 var4 = (class134) field3507.method3308((long) this.field3513);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2227(Statics.field2303, this.field3508, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3488 != 128 || this.field3526 != 128 || this.field3527 != 128) {
            var5.method2294(this.field3488, this.field3526, this.field3527);
        }
        if (this.field3493 != null) {
            for (int var6 = 0; var6 < this.field3493.length; var6++) {
                var5.method2289(this.field3493[var6], this.field3494[var6]);
            }
        }
        if (this.field3495 != null) {
            for (int var7 = 0; var7 < this.field3495.length; var7++) {
                var5.method2295(this.field3495[var7], this.field3496[var7]);
            }
        }
        class134 var8 = var5.method2271(this.field3528 + 64, this.field3529 * 5 + 768, -50, -10, -50);
        var8.field1909 = true;
        field3507.method3316(var8, (long) this.field3513);
        return var8;
    }

    @ObfuscatedName("iu.a(IB)Liu;")
    public class257 method4281(int arg0) {
        if (this.field3521 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3522[var3] && this.field3522[var3] != 0) {
                    var2 = this.field3521[var3];
                }
            }
            if (var2 != -1) {
                return method678(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("az.k(IIIIIZB)Ljk;")
    public static final class286 method226(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class286 var8 = (class286) field3503.method3308(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class257 var9 = method678(arg0);
        if (arg1 > 1 && var9.field3521 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3522[var11] && var9.field3522[var11] != 0) {
                    var10 = var9.field3521[var11];
                }
            }
            if (var10 != -1) {
                var9 = method678(var10);
            }
        }
        class134 var12 = var9.method4328(1);
        if (var12 == null) {
            return null;
        }
        class286 var13 = null;
        if (var9.field3533 != -1) {
            var13 = method226(var9.field3523, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3534 != -1) {
            var13 = method226(var9.field3530, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3536 != -1) {
            var13 = method226(var9.field3535, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3752;
        int var15 = Statics.field3748;
        int var16 = Statics.field3749;
        int[] var17 = new int[4];
        class282.method4634(var17);
        class286 var18 = new class286(36, 32);
        class282.method4652(var18.field3779, 36, 32);
        class282.method4636();
        class137.method2435();
        class137.method2409(16, 16);
        class137.field2001 = false;
        if (var9.field3536 != -1) {
            var13.method4831(0, 0);
        }
        int var19 = var9.field3497;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class137.field2021[var9.field3524] * var19 >> 16;
        int var21 = class137.field2022[var9.field3524] * var19 >> 16;
        var12.method2359();
        var12.method2336(0, var9.field3499, var9.field3500, var9.field3524, var9.field3519, var9.field3502 + var12.field2104 / 2 + var20, var9.field3502 + var21);
        if (var9.field3534 != -1) {
            var13.method4831(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4808(1);
        }
        if (arg2 >= 2) {
            var18.method4808(16777215);
        }
        if (arg3 != 0) {
            var18.method4753(arg3);
        }
        class282.method4652(var18.field3779, 36, 32);
        if (var9.field3533 != -1) {
            var13.method4831(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3490 == 1) {
            Statics.field3525.method4523(method3175(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field3503.method3316(var18, var6);
        }
        class282.method4652(var14, var15, var16);
        class282.method4635(var17);
        class137.method2435();
        class137.field2001 = true;
        return var18;
    }

    @ObfuscatedName("fi.b(IB)Ljava/lang/String;")
    public static final String method3175(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class226.field3006 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class226.field3004 + "</col>";
        }
    }

    @ObfuscatedName("iu.x(ZB)Z")
    public final boolean method4282(boolean arg0) {
        int var2 = this.field3498;
        int var3 = this.field3501;
        int var4 = this.field3515;
        if (arg0) {
            var2 = this.field3512;
            var3 = this.field3487;
            var4 = this.field3516;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2303.method3838(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2303.method3838(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2303.method3838(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("iu.o(ZI)Ldf;")
    public final class128 method4283(boolean arg0) {
        int var2 = this.field3498;
        int var3 = this.field3501;
        int var4 = this.field3515;
        if (arg0) {
            var2 = this.field3512;
            var3 = this.field3487;
            var4 = this.field3516;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2227(Statics.field2303, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2227(Statics.field2303, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2227(Statics.field2303, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3511 != 0) {
            var5.method2240(0, this.field3511, 0);
        }
        if (arg0 && this.field3514 != 0) {
            var5.method2240(0, this.field3514, 0);
        }
        if (this.field3493 != null) {
            for (int var10 = 0; var10 < this.field3493.length; var10++) {
                var5.method2289(this.field3493[var10], this.field3494[var10]);
            }
        }
        if (this.field3495 != null) {
            for (int var11 = 0; var11 < this.field3495.length; var11++) {
                var5.method2295(this.field3495[var11], this.field3496[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("iu.j(ZI)Z")
    public final boolean method4284(boolean arg0) {
        int var2 = this.field3491;
        int var3 = this.field3484;
        if (arg0) {
            var2 = this.field3509;
            var3 = this.field3520;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2303.method3838(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2303.method3838(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("iu.m(ZB)Ldf;")
    public final class128 method4287(boolean arg0) {
        int var2 = this.field3491;
        int var3 = this.field3484;
        if (arg0) {
            var2 = this.field3509;
            var3 = this.field3520;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2227(Statics.field2303, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2227(Statics.field2303, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3493 != null) {
            for (int var7 = 0; var7 < this.field3493.length; var7++) {
                var4.method2289(this.field3493[var7], this.field3494[var7]);
            }
        }
        if (this.field3495 != null) {
            for (int var8 = 0; var8 < this.field3495.length; var8++) {
                var4.method2295(this.field3495[var8], this.field3496[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iu.s(IIB)I")
    public int method4286(int arg0, int arg1) {
        return class250.method2899(this.field3531, arg0, arg1);
    }

    @ObfuscatedName("iu.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4285(int arg0, String arg1) {
        return Statics.method4095(this.field3531, arg0, arg1);
    }

    @ObfuscatedName("iu.y(I)I")
    public int method4323() {
        if (this.field3510 == -1 || this.field3482 == null) {
            return -1;
        } else if (this.field3510 >= 0) {
            return this.field3482[this.field3510] == null ? -1 : this.field3510;
        } else if (class226.field2844.equalsIgnoreCase(this.field3482[4])) {
            return 4;
        } else {
            return -1;
        }
    }
}
