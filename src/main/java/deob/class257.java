package deob;

@ObfuscatedName("ic")
public class class257 extends class195 {

    @ObfuscatedName("ic.k")
    public static class190 field3469 = new class190(64);

    @ObfuscatedName("ic.r")
    public static class190 field3470 = new class190(50);

    @ObfuscatedName("ic.w")
    public static class190 field3477 = new class190(200);

    @ObfuscatedName("ic.h")
    public int field3472;

    @ObfuscatedName("ic.t")
    public int field3473;

    @ObfuscatedName("ic.a")
    public String field3474 = "null";

    @ObfuscatedName("ic.e")
    public short[] field3479;

    @ObfuscatedName("ic.y")
    public short[] field3476;

    @ObfuscatedName("ic.l")
    public short[] field3494;

    @ObfuscatedName("ic.q")
    public short[] field3478;

    @ObfuscatedName("ic.f")
    public int field3489 = 2000;

    @ObfuscatedName("ic.j")
    public int field3480 = 0;

    @ObfuscatedName("ic.n")
    public int field3481 = 0;

    @ObfuscatedName("ic.z")
    public int field3483 = 0;

    @ObfuscatedName("ic.b")
    public int field3463 = 0;

    @ObfuscatedName("ic.d")
    public int field3484 = 0;

    @ObfuscatedName("ic.ap")
    public int field3485 = 0;

    @ObfuscatedName("ic.aj")
    public int field3482 = 1;

    @ObfuscatedName("ic.am")
    public boolean field3487 = false;

    @ObfuscatedName("ic.ag")
    public String[] field3488 = new String[] { null, null, class226.field2826, null, null };

    @ObfuscatedName("ic.av")
    public String[] field3508 = new String[] { null, null, null, null, class226.field2934 };

    @ObfuscatedName("ic.ab")
    public int field3471 = -2;

    @ObfuscatedName("ic.af")
    public int field3509 = -1;

    @ObfuscatedName("ic.ak")
    public int field3492 = -1;

    @ObfuscatedName("ic.ar")
    public int field3520 = 0;

    @ObfuscatedName("ic.an")
    public int field3486 = -1;

    @ObfuscatedName("ic.at")
    public int field3495 = -1;

    @ObfuscatedName("ic.aw")
    public int field3496 = 0;

    @ObfuscatedName("ic.ad")
    public int field3497 = -1;

    @ObfuscatedName("ic.ac")
    public int field3498 = -1;

    @ObfuscatedName("ic.ae")
    public int field3499 = -1;

    @ObfuscatedName("ic.ah")
    public int field3500 = -1;

    @ObfuscatedName("ic.ax")
    public int field3501 = -1;

    @ObfuscatedName("ic.ai")
    public int field3502 = -1;

    @ObfuscatedName("ic.aa")
    public int[] field3503;

    @ObfuscatedName("ic.aq")
    public int[] field3504;

    @ObfuscatedName("ic.as")
    public int field3516 = -1;

    @ObfuscatedName("ic.au")
    public int field3506 = -1;

    @ObfuscatedName("ic.az")
    public int field3507 = 128;

    @ObfuscatedName("ic.ay")
    public int field3518 = 128;

    @ObfuscatedName("ic.ao")
    public int field3491 = 128;

    @ObfuscatedName("ic.bz")
    public int field3510 = 0;

    @ObfuscatedName("ic.bd")
    public int field3511 = 0;

    @ObfuscatedName("ic.bu")
    public int field3512 = 0;

    @ObfuscatedName("ic.bh")
    public class187 field3513;

    @ObfuscatedName("ic.bg")
    public boolean field3514 = false;

    @ObfuscatedName("ic.bl")
    public int field3515 = -1;

    @ObfuscatedName("ic.bo")
    public int field3505 = -1;

    @ObfuscatedName("ic.bi")
    public int field3517 = -1;

    @ObfuscatedName("ic.bn")
    public int field3493 = -1;

    @ObfuscatedName("r.c(IB)Lic;")
    public static class257 method44(int arg0) {
        class257 var1 = (class257) field3469.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3253.method3741(10, arg0);
        class257 var3 = new class257();
        var3.field3472 = arg0;
        if (var2 != null) {
            var3.method4185(new class174(var2));
        }
        var3.method4154();
        if (var3.field3506 != -1) {
            var3.method4164(method44(var3.field3506), method44(var3.field3516));
        }
        if (var3.field3505 != -1) {
            var3.method4173(method44(var3.field3505), method44(var3.field3515));
        }
        if (var3.field3493 != -1) {
            var3.method4141(method44(var3.field3493), method44(var3.field3517));
        }
        if (!Statics.field2239 && var3.field3487) {
            var3.field3474 = class226.field2844;
            var3.field3514 = false;
            var3.field3488 = null;
            var3.field3508 = null;
            var3.field3471 = -1;
            var3.field3512 = 0;
            if (var3.field3513 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3513.method3205(); var5 != null; var5 = var3.field3513.method3191()) {
                    class252 var6 = class252.method4003((int) var5.field2437);
                    if (var6.field3362) {
                        var5.method3287();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3513 = null;
                }
            }
        }
        field3469.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.o(I)V")
    public void method4154() {
    }

    @ObfuscatedName("ic.i(Lfp;I)V")
    public void method4185(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4178(arg0, var2);
        }
    }

    @ObfuscatedName("ic.u(Lfp;II)V")
    public void method4178(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3473 = arg0.method2861();
        } else if (arg1 == 2) {
            this.field3474 = arg0.method2867();
        } else if (arg1 == 4) {
            this.field3489 = arg0.method2861();
        } else if (arg1 == 5) {
            this.field3480 = arg0.method2861();
        } else if (arg1 == 6) {
            this.field3481 = arg0.method2861();
        } else if (arg1 == 7) {
            this.field3463 = arg0.method2861();
            if (this.field3463 > 32767) {
                this.field3463 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field3484 = arg0.method2861();
            if (this.field3484 > 32767) {
                this.field3484 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3485 = 1;
        } else if (arg1 == 12) {
            this.field3482 = arg0.method2987();
        } else if (arg1 == 16) {
            this.field3487 = true;
        } else if (arg1 == 23) {
            this.field3509 = arg0.method2861();
            this.field3520 = arg0.method2843();
        } else if (arg1 == 24) {
            this.field3492 = arg0.method2861();
        } else if (arg1 == 25) {
            this.field3486 = arg0.method2861();
            this.field3496 = arg0.method2843();
        } else if (arg1 == 26) {
            this.field3495 = arg0.method2861();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3488[arg1 - 30] = arg0.method2867();
            if (this.field3488[arg1 - 30].equalsIgnoreCase(class226.field2875)) {
                this.field3488[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3508[arg1 - 35] = arg0.method2867();
        } else if (arg1 == 40) {
            int var3 = arg0.method2843();
            this.field3479 = new short[var3];
            this.field3476 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3479[var4] = (short) arg0.method2861();
                this.field3476[var4] = (short) arg0.method2861();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2843();
            this.field3494 = new short[var5];
            this.field3478 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3494[var6] = (short) arg0.method2861();
                this.field3478[var6] = (short) arg0.method2861();
            }
        } else if (arg1 == 42) {
            this.field3471 = arg0.method3014();
        } else if (arg1 == 65) {
            this.field3514 = true;
        } else if (arg1 == 78) {
            this.field3497 = arg0.method2861();
        } else if (arg1 == 79) {
            this.field3498 = arg0.method2861();
        } else if (arg1 == 90) {
            this.field3499 = arg0.method2861();
        } else if (arg1 == 91) {
            this.field3501 = arg0.method2861();
        } else if (arg1 == 92) {
            this.field3500 = arg0.method2861();
        } else if (arg1 == 93) {
            this.field3502 = arg0.method2861();
        } else if (arg1 == 95) {
            this.field3483 = arg0.method2861();
        } else if (arg1 == 97) {
            this.field3516 = arg0.method2861();
        } else if (arg1 == 98) {
            this.field3506 = arg0.method2861();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3503 == null) {
                this.field3503 = new int[10];
                this.field3504 = new int[10];
            }
            this.field3503[arg1 - 100] = arg0.method2861();
            this.field3504[arg1 - 100] = arg0.method2861();
        } else if (arg1 == 110) {
            this.field3507 = arg0.method2861();
        } else if (arg1 == 111) {
            this.field3518 = arg0.method2861();
        } else if (arg1 == 112) {
            this.field3491 = arg0.method2861();
        } else if (arg1 == 113) {
            this.field3510 = arg0.method3014();
        } else if (arg1 == 114) {
            this.field3511 = arg0.method3014() * 5;
        } else if (arg1 == 115) {
            this.field3512 = arg0.method2843();
        } else if (arg1 == 139) {
            this.field3515 = arg0.method2861();
        } else if (arg1 == 140) {
            this.field3505 = arg0.method2861();
        } else if (arg1 == 148) {
            this.field3517 = arg0.method2861();
        } else if (arg1 == 149) {
            this.field3493 = arg0.method2861();
        } else if (arg1 == 249) {
            this.field3513 = class250.method558(arg0, this.field3513);
        }
    }

    @ObfuscatedName("ic.g(Lic;Lic;I)V")
    public void method4164(class257 arg0, class257 arg1) {
        this.field3473 = arg0.field3473;
        this.field3489 = arg0.field3489;
        this.field3480 = arg0.field3480;
        this.field3481 = arg0.field3481;
        this.field3483 = arg0.field3483;
        this.field3463 = arg0.field3463;
        this.field3484 = arg0.field3484;
        this.field3479 = arg0.field3479;
        this.field3476 = arg0.field3476;
        this.field3494 = arg0.field3494;
        this.field3478 = arg0.field3478;
        this.field3474 = arg1.field3474;
        this.field3487 = arg1.field3487;
        this.field3482 = arg1.field3482;
        this.field3485 = 1;
    }

    @ObfuscatedName("ic.m(Lic;Lic;I)V")
    public void method4173(class257 arg0, class257 arg1) {
        this.field3473 = arg0.field3473;
        this.field3489 = arg0.field3489;
        this.field3480 = arg0.field3480;
        this.field3481 = arg0.field3481;
        this.field3483 = arg0.field3483;
        this.field3463 = arg0.field3463;
        this.field3484 = arg0.field3484;
        this.field3479 = arg1.field3479;
        this.field3476 = arg1.field3476;
        this.field3494 = arg1.field3494;
        this.field3478 = arg1.field3478;
        this.field3474 = arg1.field3474;
        this.field3487 = arg1.field3487;
        this.field3485 = arg1.field3485;
        this.field3509 = arg1.field3509;
        this.field3492 = arg1.field3492;
        this.field3497 = arg1.field3497;
        this.field3486 = arg1.field3486;
        this.field3495 = arg1.field3495;
        this.field3498 = arg1.field3498;
        this.field3499 = arg1.field3499;
        this.field3500 = arg1.field3500;
        this.field3501 = arg1.field3501;
        this.field3502 = arg1.field3502;
        this.field3512 = arg1.field3512;
        this.field3488 = arg1.field3488;
        this.field3508 = new String[5];
        if (arg1.field3508 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3508[var3] = arg1.field3508[var3];
            }
        }
        this.field3508[4] = class226.field2832;
        this.field3482 = 0;
    }

    @ObfuscatedName("ic.s(Lic;Lic;I)V")
    public void method4141(class257 arg0, class257 arg1) {
        this.field3473 = arg0.field3473;
        this.field3489 = arg0.field3489;
        this.field3480 = arg0.field3480;
        this.field3481 = arg0.field3481;
        this.field3483 = arg0.field3483;
        this.field3463 = arg0.field3463;
        this.field3484 = arg0.field3484;
        this.field3479 = arg0.field3479;
        this.field3476 = arg0.field3476;
        this.field3494 = arg0.field3494;
        this.field3478 = arg0.field3478;
        this.field3485 = arg0.field3485;
        this.field3474 = arg1.field3474;
        this.field3482 = 0;
        this.field3487 = false;
        this.field3514 = false;
    }

    @ObfuscatedName("ic.x(IB)Ldj;")
    public final class128 method4142(int arg0) {
        if (this.field3503 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3504[var3] && this.field3504[var3] != 0) {
                    var2 = this.field3503[var3];
                }
            }
            if (var2 != -1) {
                return method44(var2).method4142(1);
            }
        }
        class128 var4 = class128.method2138(Statics.field3467, this.field3473, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3507 != 128 || this.field3518 != 128 || this.field3491 != 128) {
            var4.method2156(this.field3507, this.field3518, this.field3491);
        }
        if (this.field3479 != null) {
            for (int var5 = 0; var5 < this.field3479.length; var5++) {
                var4.method2153(this.field3479[var5], this.field3476[var5]);
            }
        }
        if (this.field3494 != null) {
            for (int var6 = 0; var6 < this.field3494.length; var6++) {
                var4.method2154(this.field3494[var6], this.field3478[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ic.p(IB)Leo;")
    public final class134 method4188(int arg0) {
        if (this.field3503 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3504[var3] && this.field3504[var3] != 0) {
                    var2 = this.field3503[var3];
                }
            }
            if (var2 != -1) {
                return method44(var2).method4188(1);
            }
        }
        class134 var4 = (class134) field3470.method3220((long) this.field3472);
        if (var4 != null) {
            return var4;
        }
        class128 var5 = class128.method2138(Statics.field3467, this.field3473, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3507 != 128 || this.field3518 != 128 || this.field3491 != 128) {
            var5.method2156(this.field3507, this.field3518, this.field3491);
        }
        if (this.field3479 != null) {
            for (int var6 = 0; var6 < this.field3479.length; var6++) {
                var5.method2153(this.field3479[var6], this.field3476[var6]);
            }
        }
        if (this.field3494 != null) {
            for (int var7 = 0; var7 < this.field3494.length; var7++) {
                var5.method2154(this.field3494[var7], this.field3478[var7]);
            }
        }
        class134 var8 = var5.method2142(this.field3510 + 64, this.field3511 + 768, -50, -10, -50);
        var8.field1880 = true;
        field3470.method3233(var8, (long) this.field3472);
        return var8;
    }

    @ObfuscatedName("ic.k(IB)Lic;")
    public class257 method4144(int arg0) {
        if (this.field3503 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3504[var3] && this.field3504[var3] != 0) {
                    var2 = this.field3503[var3];
                }
            }
            if (var2 != -1) {
                return method44(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ic.w(ZI)Z")
    public final boolean method4145(boolean arg0) {
        int var2 = this.field3509;
        int var3 = this.field3492;
        int var4 = this.field3497;
        if (arg0) {
            var2 = this.field3486;
            var3 = this.field3495;
            var4 = this.field3498;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3467.method3716(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3467.method3716(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3467.method3716(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ic.v(ZI)Ldj;")
    public final class128 method4146(boolean arg0) {
        int var2 = this.field3509;
        int var3 = this.field3492;
        int var4 = this.field3497;
        if (arg0) {
            var2 = this.field3486;
            var3 = this.field3495;
            var4 = this.field3498;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var5 = class128.method2138(Statics.field3467, var2, 0);
        if (var3 != -1) {
            class128 var6 = class128.method2138(Statics.field3467, var3, 0);
            if (var4 == -1) {
                class128[] var9 = new class128[] { var5, var6 };
                var5 = new class128(var9, 2);
            } else {
                class128 var7 = class128.method2138(Statics.field3467, var4, 0);
                class128[] var8 = new class128[] { var5, var6, var7 };
                var5 = new class128(var8, 3);
            }
        }
        if (!arg0 && this.field3520 != 0) {
            var5.method2152(0, this.field3520, 0);
        }
        if (arg0 && this.field3496 != 0) {
            var5.method2152(0, this.field3496, 0);
        }
        if (this.field3479 != null) {
            for (int var10 = 0; var10 < this.field3479.length; var10++) {
                var5.method2153(this.field3479[var10], this.field3476[var10]);
            }
        }
        if (this.field3494 != null) {
            for (int var11 = 0; var11 < this.field3494.length; var11++) {
                var5.method2154(this.field3494[var11], this.field3478[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ic.h(ZI)Z")
    public final boolean method4190(boolean arg0) {
        int var2 = this.field3499;
        int var3 = this.field3500;
        if (arg0) {
            var2 = this.field3501;
            var3 = this.field3502;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3467.method3716(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3467.method3716(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ic.t(ZB)Ldj;")
    public final class128 method4148(boolean arg0) {
        int var2 = this.field3499;
        int var3 = this.field3500;
        if (arg0) {
            var2 = this.field3501;
            var3 = this.field3502;
        }
        if (var2 == -1) {
            return null;
        }
        class128 var4 = class128.method2138(Statics.field3467, var2, 0);
        if (var3 != -1) {
            class128 var5 = class128.method2138(Statics.field3467, var3, 0);
            class128[] var6 = new class128[] { var4, var5 };
            var4 = new class128(var6, 2);
        }
        if (this.field3479 != null) {
            for (int var7 = 0; var7 < this.field3479.length; var7++) {
                var4.method2153(this.field3479[var7], this.field3476[var7]);
            }
        }
        if (this.field3494 != null) {
            for (int var8 = 0; var8 < this.field3494.length; var8++) {
                var4.method2154(this.field3494[var8], this.field3478[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ic.l(III)I")
    public int method4149(int arg0, int arg1) {
        return class250.method1861(this.field3513, arg0, arg1);
    }

    @ObfuscatedName("ic.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4172(int arg0, String arg1) {
        return class250.method3707(this.field3513, arg0, arg1);
    }

    @ObfuscatedName("ic.f(I)I")
    public int method4143() {
        if (this.field3471 == -1 || this.field3508 == null) {
            return -1;
        } else if (this.field3471 >= 0) {
            return this.field3508[this.field3471] == null ? -1 : this.field3471;
        } else if (class226.field2934.equalsIgnoreCase(this.field3508[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ff.j(B)V")
    public static void method2824() {
        field3469.method3223();
        field3470.method3223();
        field3477.method3223();
    }

    @ObfuscatedName("hz.n(ZI)V")
    public static void method3695(boolean arg0) {
        if (Statics.field2239 != arg0) {
            method2824();
            Statics.field2239 = arg0;
        }
    }
}
