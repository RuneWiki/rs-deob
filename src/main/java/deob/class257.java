package deob;

@ObfuscatedName("ij")
public class class257 extends class176 {

    @ObfuscatedName("ij.e")
    public static class146 field3466 = new class146(64);

    @ObfuscatedName("ij.p")
    public static class146 field3467 = new class146(50);

    @ObfuscatedName("ij.k")
    public int field3468;

    @ObfuscatedName("ij.l")
    public String field3469 = class225.field2772;

    @ObfuscatedName("ij.b")
    public int field3470 = 1;

    @ObfuscatedName("ij.i")
    public int[] field3471;

    @ObfuscatedName("ij.c")
    public int[] field3464;

    @ObfuscatedName("ij.f")
    public int field3473 = -1;

    @ObfuscatedName("ij.m")
    public int field3483 = -1;

    @ObfuscatedName("ij.u")
    public int field3475 = -1;

    @ObfuscatedName("ij.x")
    public int field3476 = -1;

    @ObfuscatedName("ij.r")
    public int field3500 = -1;

    @ObfuscatedName("ij.v")
    public int field3486 = -1;

    @ObfuscatedName("ij.y")
    public int field3502 = -1;

    @ObfuscatedName("ij.g")
    public short[] field3480;

    @ObfuscatedName("ij.a")
    public short[] field3481;

    @ObfuscatedName("ij.j")
    public short[] field3472;

    @ObfuscatedName("ij.t")
    public short[] field3482;

    @ObfuscatedName("ij.h")
    public String[] field3484 = new String[5];

    @ObfuscatedName("ij.o")
    public boolean field3494 = true;

    @ObfuscatedName("ij.n")
    public int field3479 = -1;

    @ObfuscatedName("ij.d")
    public int field3487 = 128;

    @ObfuscatedName("ij.s")
    public int field3489 = 128;

    @ObfuscatedName("ij.z")
    public boolean field3474 = false;

    @ObfuscatedName("ij.al")
    public int field3490 = 0;

    @ObfuscatedName("ij.av")
    public int field3478 = 0;

    @ObfuscatedName("ij.as")
    public int field3492 = -1;

    @ObfuscatedName("ij.aw")
    public int field3493 = 32;

    @ObfuscatedName("ij.ad")
    public int[] field3477;

    @ObfuscatedName("ij.ag")
    public int field3495 = -1;

    @ObfuscatedName("ij.ar")
    public int field3496 = -1;

    @ObfuscatedName("ij.ax")
    public boolean field3497 = true;

    @ObfuscatedName("ij.az")
    public boolean field3498 = true;

    @ObfuscatedName("ij.ae")
    public boolean field3499 = false;

    @ObfuscatedName("ij.ao")
    public class317 field3488;

    @ObfuscatedName("en.q(Lhp;Lhp;B)V")
    public static void method2997(class234 arg0, class234 arg1) {
        Statics.field3485 = arg0;
        Statics.field3465 = arg1;
    }

    @ObfuscatedName("bz.w(IB)Lij;")
    public static class257 method867(int arg0) {
        class257 var1 = (class257) field3466.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3485.method3775(9, arg0);
        class257 var3 = new class257();
        var3.field3468 = arg0;
        if (var2 != null) {
            var3.method4318(new class301(var2));
        }
        var3.method4319();
        field3466.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.e(I)V")
    public void method4319() {
    }

    @ObfuscatedName("ij.p(Lkf;I)V")
    public void method4318(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4328(arg0, var2);
        }
    }

    @ObfuscatedName("ij.k(Lkf;IB)V")
    public void method4328(class301 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5077();
            this.field3471 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3471[var4] = arg0.method5069();
            }
        } else if (arg1 == 2) {
            this.field3469 = arg0.method5076();
        } else if (arg1 == 12) {
            this.field3470 = arg0.method5077();
        } else if (arg1 == 13) {
            this.field3473 = arg0.method5069();
        } else if (arg1 == 14) {
            this.field3476 = arg0.method5069();
        } else if (arg1 == 15) {
            this.field3483 = arg0.method5069();
        } else if (arg1 == 16) {
            this.field3475 = arg0.method5069();
        } else if (arg1 == 17) {
            this.field3476 = arg0.method5069();
            this.field3500 = arg0.method5069();
            this.field3486 = arg0.method5069();
            this.field3502 = arg0.method5069();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3484[arg1 - 30] = arg0.method5076();
            if (this.field3484[arg1 - 30].equalsIgnoreCase(class225.field2760)) {
                this.field3484[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5077();
            this.field3480 = new short[var5];
            this.field3481 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3480[var6] = (short) arg0.method5069();
                this.field3481[var6] = (short) arg0.method5069();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5077();
            this.field3472 = new short[var7];
            this.field3482 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3472[var8] = (short) arg0.method5069();
                this.field3482[var8] = (short) arg0.method5069();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5077();
            this.field3464 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3464[var10] = arg0.method5069();
            }
        } else if (arg1 == 93) {
            this.field3494 = false;
        } else if (arg1 == 95) {
            this.field3479 = arg0.method5069();
        } else if (arg1 == 97) {
            this.field3487 = arg0.method5069();
        } else if (arg1 == 98) {
            this.field3489 = arg0.method5069();
        } else if (arg1 == 99) {
            this.field3474 = true;
        } else if (arg1 == 100) {
            this.field3490 = arg0.method5068();
        } else if (arg1 == 101) {
            this.field3478 = arg0.method5068();
        } else if (arg1 == 102) {
            this.field3492 = arg0.method5069();
        } else if (arg1 == 103) {
            this.field3493 = arg0.method5069();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3495 = arg0.method5069();
            if (this.field3495 == 65535) {
                this.field3495 = -1;
            }
            this.field3496 = arg0.method5069();
            if (this.field3496 == 65535) {
                this.field3496 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5069();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5077();
            this.field3477 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3477[var13] = arg0.method5069();
                if (this.field3477[var13] == 65535) {
                    this.field3477[var13] = -1;
                }
            }
            this.field3477[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3497 = false;
        } else if (arg1 == 109) {
            this.field3498 = false;
        } else if (arg1 == 111) {
            this.field3499 = true;
        } else if (arg1 == 249) {
            this.field3488 = class248.method347(arg0, this.field3488);
        }
    }

    @ObfuscatedName("ij.l(Lis;ILis;IB)Ldm;")
    public final class128 method4322(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field3477 != null) {
            class257 var5 = this.method4324();
            return var5 == null ? null : var5.method4322(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3467.method3039((long) this.field3468);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3471.length; var8++) {
                if (!Statics.field3465.method3777(this.field3471[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3471.length];
            for (int var10 = 0; var10 < this.field3471.length; var10++) {
                var9[var10] = class122.method2512(Statics.field3465, this.field3471[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3480 != null) {
                for (int var12 = 0; var12 < this.field3480.length; var12++) {
                    var11.method2526(this.field3480[var12], this.field3481[var12]);
                }
            }
            if (this.field3472 != null) {
                for (int var13 = 0; var13 < this.field3472.length; var13++) {
                    var11.method2527(this.field3472[var13], this.field3482[var13]);
                }
            }
            var6 = var11.method2545(this.field3490 + 64, this.field3478 * 5 + 850, -30, -50, -30);
            field3467.method3041(var6, (long) this.field3468);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4380(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4399(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2602(true);
        } else {
            var14 = arg2.method4399(var6, arg3);
        }
        if (this.field3487 != 128 || this.field3489 != 128) {
            var14.method2687(this.field3487, this.field3489, this.field3487);
        }
        return var14;
    }

    @ObfuscatedName("ij.b(B)Lds;")
    public final class122 method4323() {
        if (this.field3477 != null) {
            class257 var1 = this.method4324();
            return var1 == null ? null : var1.method4323();
        } else if (this.field3464 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3464.length; var3++) {
                if (!Statics.field3465.method3777(this.field3464[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3464.length];
            for (int var5 = 0; var5 < this.field3464.length; var5++) {
                var4[var5] = class122.method2512(Statics.field3465, this.field3464[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3480 != null) {
                for (int var7 = 0; var7 < this.field3480.length; var7++) {
                    var6.method2526(this.field3480[var7], this.field3481[var7]);
                }
            }
            if (this.field3472 != null) {
                for (int var8 = 0; var8 < this.field3472.length; var8++) {
                    var6.method2527(this.field3472[var8], this.field3482[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ij.i(I)Lij;")
    public final class257 method4324() {
        int var1 = -1;
        if (this.field3495 != -1) {
            var1 = class213.method1099(this.field3495);
        } else if (this.field3496 != -1) {
            var1 = class213.field2526[this.field3496];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3477.length - 1) {
            var2 = this.field3477[var1];
        } else {
            var2 = this.field3477[this.field3477.length - 1];
        }
        return var2 == -1 ? null : method867(var2);
    }

    @ObfuscatedName("ij.c(B)Z")
    public boolean method4325() {
        if (this.field3477 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3495 != -1) {
            var1 = class213.method1099(this.field3495);
        } else if (this.field3496 != -1) {
            var1 = class213.field2526[this.field3496];
        }
        if (var1 >= 0 && var1 < this.field3477.length) {
            return this.field3477[var1] != -1;
        } else {
            return this.field3477[this.field3477.length - 1] != -1;
        }
    }

    @ObfuscatedName("ij.u(III)I")
    public int method4326(int arg0, int arg1) {
        class317 var3 = this.field3488;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5451((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2112;
            }
        }
        return var4;
    }

    @ObfuscatedName("ij.x(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4355(int arg0, String arg1) {
        return class248.method40(this.field3488, arg0, arg1);
    }

    @ObfuscatedName("az.r(I)V")
    public static void method507() {
        field3466.method3042();
        field3467.method3042();
    }
}
