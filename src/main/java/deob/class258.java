package deob;

@ObfuscatedName("iz")
public class class258 extends class176 {

    @ObfuscatedName("iz.o")
    public static class146 field3462 = new class146(64);

    @ObfuscatedName("iz.e")
    public static class146 field3463 = new class146(50);

    @ObfuscatedName("iz.i")
    public int field3475;

    @ObfuscatedName("iz.g")
    public String field3464 = class225.field2775;

    @ObfuscatedName("iz.d")
    public int field3484 = 1;

    @ObfuscatedName("iz.l")
    public int[] field3467;

    @ObfuscatedName("iz.j")
    public int[] field3468;

    @ObfuscatedName("iz.m")
    public int field3469 = -1;

    @ObfuscatedName("iz.p")
    public int field3470 = -1;

    @ObfuscatedName("iz.h")
    public int field3471 = -1;

    @ObfuscatedName("iz.v")
    public int field3460 = -1;

    @ObfuscatedName("iz.n")
    public int field3494 = -1;

    @ObfuscatedName("iz.x")
    public int field3474 = -1;

    @ObfuscatedName("iz.w")
    public int field3486 = -1;

    @ObfuscatedName("iz.k")
    public short[] field3476;

    @ObfuscatedName("iz.q")
    public short[] field3477;

    @ObfuscatedName("iz.z")
    public short[] field3478;

    @ObfuscatedName("iz.y")
    public short[] field3493;

    @ObfuscatedName("iz.f")
    public String[] field3480 = new String[5];

    @ObfuscatedName("iz.b")
    public boolean field3481 = true;

    @ObfuscatedName("iz.r")
    public int field3479 = -1;

    @ObfuscatedName("iz.s")
    public int field3465 = 128;

    @ObfuscatedName("iz.a")
    public int field3472 = 128;

    @ObfuscatedName("iz.u")
    public boolean field3485 = false;

    @ObfuscatedName("iz.ae")
    public int field3495 = 0;

    @ObfuscatedName("iz.af")
    public int field3487 = 0;

    @ObfuscatedName("iz.az")
    public int field3466 = -1;

    @ObfuscatedName("iz.ax")
    public int field3489 = 32;

    @ObfuscatedName("iz.aj")
    public int[] field3490;

    @ObfuscatedName("iz.au")
    public int field3491 = -1;

    @ObfuscatedName("iz.ay")
    public int field3492 = -1;

    @ObfuscatedName("iz.aa")
    public boolean field3483 = true;

    @ObfuscatedName("iz.aq")
    public boolean field3488 = true;

    @ObfuscatedName("iz.as")
    public boolean field3473 = false;

    @ObfuscatedName("iz.ak")
    public class317 field3496;

    @ObfuscatedName("ib.c(II)Liz;")
    public static class258 method3989(int arg0) {
        class258 var1 = (class258) field3462.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3482.method3845(9, arg0);
        class258 var3 = new class258();
        var3.field3475 = arg0;
        if (var2 != null) {
            var3.method4384(new class301(var2));
        }
        var3.method4383();
        field3462.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.t(B)V")
    public void method4383() {
    }

    @ObfuscatedName("iz.o(Lkp;I)V")
    public void method4384(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4385(arg0, var2);
        }
    }

    @ObfuscatedName("iz.e(Lkp;IB)V")
    public void method4385(class301 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5129();
            this.field3467 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3467[var4] = arg0.method5124();
            }
        } else if (arg1 == 2) {
            this.field3464 = arg0.method5138();
        } else if (arg1 == 12) {
            this.field3484 = arg0.method5129();
        } else if (arg1 == 13) {
            this.field3469 = arg0.method5124();
        } else if (arg1 == 14) {
            this.field3460 = arg0.method5124();
        } else if (arg1 == 15) {
            this.field3470 = arg0.method5124();
        } else if (arg1 == 16) {
            this.field3471 = arg0.method5124();
        } else if (arg1 == 17) {
            this.field3460 = arg0.method5124();
            this.field3494 = arg0.method5124();
            this.field3474 = arg0.method5124();
            this.field3486 = arg0.method5124();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3480[arg1 - 30] = arg0.method5138();
            if (this.field3480[arg1 - 30].equalsIgnoreCase(class225.field2770)) {
                this.field3480[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5129();
            this.field3476 = new short[var5];
            this.field3477 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3476[var6] = (short) arg0.method5124();
                this.field3477[var6] = (short) arg0.method5124();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5129();
            this.field3478 = new short[var7];
            this.field3493 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3478[var8] = (short) arg0.method5124();
                this.field3493[var8] = (short) arg0.method5124();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5129();
            this.field3468 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3468[var10] = arg0.method5124();
            }
        } else if (arg1 == 93) {
            this.field3481 = false;
        } else if (arg1 == 95) {
            this.field3479 = arg0.method5124();
        } else if (arg1 == 97) {
            this.field3465 = arg0.method5124();
        } else if (arg1 == 98) {
            this.field3472 = arg0.method5124();
        } else if (arg1 == 99) {
            this.field3485 = true;
        } else if (arg1 == 100) {
            this.field3495 = arg0.method5130();
        } else if (arg1 == 101) {
            this.field3487 = arg0.method5130();
        } else if (arg1 == 102) {
            this.field3466 = arg0.method5124();
        } else if (arg1 == 103) {
            this.field3489 = arg0.method5124();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3491 = arg0.method5124();
            if (this.field3491 == 65535) {
                this.field3491 = -1;
            }
            this.field3492 = arg0.method5124();
            if (this.field3492 == 65535) {
                this.field3492 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5124();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5129();
            this.field3490 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3490[var13] = arg0.method5124();
                if (this.field3490[var13] == 65535) {
                    this.field3490[var13] = -1;
                }
            }
            this.field3490[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3483 = false;
        } else if (arg1 == 109) {
            this.field3488 = false;
        } else if (arg1 == 111) {
            this.field3473 = true;
        } else if (arg1 == 249) {
            this.field3496 = class249.method1064(arg0, this.field3496);
        }
    }

    @ObfuscatedName("iz.i(Lip;ILip;IB)Ldx;")
    public final class128 method4386(class260 arg0, int arg1, class260 arg2, int arg3) {
        if (this.field3490 != null) {
            class258 var5 = this.method4391();
            return var5 == null ? null : var5.method4386(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3463.method3100((long) this.field3475);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3467.length; var8++) {
                if (!Statics.field3461.method3838(this.field3467[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3467.length];
            for (int var10 = 0; var10 < this.field3467.length; var10++) {
                var9[var10] = class122.method2633(Statics.field3461, this.field3467[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3476 != null) {
                for (int var12 = 0; var12 < this.field3476.length; var12++) {
                    var11.method2588(this.field3476[var12], this.field3477[var12]);
                }
            }
            if (this.field3478 != null) {
                for (int var13 = 0; var13 < this.field3478.length; var13++) {
                    var11.method2589(this.field3478[var13], this.field3493[var13]);
                }
            }
            var6 = var11.method2595(this.field3495 + 64, this.field3487 * 5 + 850, -30, -50, -30);
            field3463.method3102(var6, (long) this.field3475);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4434(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4443(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2666(true);
        } else {
            var14 = arg2.method4443(var6, arg3);
        }
        if (this.field3465 != 128 || this.field3472 != 128) {
            var14.method2750(this.field3465, this.field3472, this.field3465);
        }
        return var14;
    }

    @ObfuscatedName("iz.g(I)Ldg;")
    public final class122 method4387() {
        if (this.field3490 != null) {
            class258 var1 = this.method4391();
            return var1 == null ? null : var1.method4387();
        } else if (this.field3468 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3468.length; var3++) {
                if (!Statics.field3461.method3838(this.field3468[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3468.length];
            for (int var5 = 0; var5 < this.field3468.length; var5++) {
                var4[var5] = class122.method2633(Statics.field3461, this.field3468[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3476 != null) {
                for (int var7 = 0; var7 < this.field3476.length; var7++) {
                    var6.method2588(this.field3476[var7], this.field3477[var7]);
                }
            }
            if (this.field3478 != null) {
                for (int var8 = 0; var8 < this.field3478.length; var8++) {
                    var6.method2589(this.field3478[var8], this.field3493[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("iz.d(B)Liz;")
    public final class258 method4391() {
        int var1 = -1;
        if (this.field3491 != -1) {
            var1 = Statics.method122(this.field3491);
        } else if (this.field3492 != -1) {
            var1 = class213.field2534[this.field3492];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3490.length - 1) {
            var2 = this.field3490[var1];
        } else {
            var2 = this.field3490[this.field3490.length - 1];
        }
        return var2 == -1 ? null : method3989(var2);
    }

    @ObfuscatedName("iz.l(I)Z")
    public boolean method4404() {
        if (this.field3490 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3491 != -1) {
            var1 = Statics.method122(this.field3491);
        } else if (this.field3492 != -1) {
            var1 = class213.field2534[this.field3492];
        }
        if (var1 >= 0 && var1 < this.field3490.length) {
            return this.field3490[var1] != -1;
        } else {
            return this.field3490[this.field3490.length - 1] != -1;
        }
    }

    @ObfuscatedName("iz.j(III)I")
    public int method4390(int arg0, int arg1) {
        return Statics.method3365(this.field3496, arg0, arg1);
    }

    @ObfuscatedName("iz.m(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4410(int arg0, String arg1) {
        return class249.method2650(this.field3496, arg0, arg1);
    }
}
