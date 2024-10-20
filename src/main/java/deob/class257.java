package deob;

@ObfuscatedName("it")
public class class257 extends class176 {

    @ObfuscatedName("it.n")
    public static class146 field3471 = new class146(64);

    @ObfuscatedName("it.q")
    public static class146 field3462 = new class146(50);

    @ObfuscatedName("it.v")
    public int field3465;

    @ObfuscatedName("it.l")
    public String field3491 = class225.field2836;

    @ObfuscatedName("it.c")
    public int field3460 = 1;

    @ObfuscatedName("it.o")
    public int[] field3461;

    @ObfuscatedName("it.i")
    public int[] field3477;

    @ObfuscatedName("it.d")
    public int field3463 = -1;

    @ObfuscatedName("it.m")
    public int field3484 = -1;

    @ObfuscatedName("it.p")
    public int field3455 = -1;

    @ObfuscatedName("it.h")
    public int field3466 = -1;

    @ObfuscatedName("it.k")
    public int field3467 = -1;

    @ObfuscatedName("it.x")
    public int field3457 = -1;

    @ObfuscatedName("it.j")
    public int field3456 = -1;

    @ObfuscatedName("it.r")
    public short[] field3470;

    @ObfuscatedName("it.e")
    public short[] field3480;

    @ObfuscatedName("it.s")
    public short[] field3472;

    @ObfuscatedName("it.b")
    public short[] field3473;

    @ObfuscatedName("it.z")
    public String[] field3474 = new String[5];

    @ObfuscatedName("it.f")
    public boolean field3475 = true;

    @ObfuscatedName("it.g")
    public int field3476 = -1;

    @ObfuscatedName("it.w")
    public int field3486 = 128;

    @ObfuscatedName("it.u")
    public int field3478 = 128;

    @ObfuscatedName("it.y")
    public boolean field3479 = false;

    @ObfuscatedName("it.aa")
    public int field3459 = 0;

    @ObfuscatedName("it.aw")
    public int field3481 = 0;

    @ObfuscatedName("it.ar")
    public int field3482 = -1;

    @ObfuscatedName("it.aq")
    public int field3468 = 32;

    @ObfuscatedName("it.ad")
    public int[] field3458;

    @ObfuscatedName("it.ag")
    public int field3485 = -1;

    @ObfuscatedName("it.ak")
    public int field3483 = -1;

    @ObfuscatedName("it.av")
    public boolean field3487 = true;

    @ObfuscatedName("it.am")
    public boolean field3488 = true;

    @ObfuscatedName("it.ab")
    public boolean field3489 = false;

    @ObfuscatedName("it.ax")
    public class316 field3490;

    @ObfuscatedName("cj.a(Lhq;Lhq;I)V")
    public static void method2146(class234 arg0, class234 arg1) {
        Statics.field3469 = arg0;
        Statics.field3454 = arg1;
    }

    @ObfuscatedName("bl.t(II)Lit;")
    public static class257 method1054(int arg0) {
        class257 var1 = (class257) field3471.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3469.method3873(9, arg0);
        class257 var3 = new class257();
        var3.field3465 = arg0;
        if (var2 != null) {
            var3.method4428(new class300(var2));
        }
        var3.method4430();
        field3471.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.n(I)V")
    public void method4430() {
    }

    @ObfuscatedName("it.q(Lkc;I)V")
    public void method4428(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4405(arg0, var2);
        }
    }

    @ObfuscatedName("it.v(Lkc;II)V")
    public void method4405(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5123();
            this.field3461 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3461[var4] = arg0.method5166();
            }
        } else if (arg1 == 2) {
            this.field3491 = arg0.method5132();
        } else if (arg1 == 12) {
            this.field3460 = arg0.method5123();
        } else if (arg1 == 13) {
            this.field3463 = arg0.method5166();
        } else if (arg1 == 14) {
            this.field3466 = arg0.method5166();
        } else if (arg1 == 15) {
            this.field3484 = arg0.method5166();
        } else if (arg1 == 16) {
            this.field3455 = arg0.method5166();
        } else if (arg1 == 17) {
            this.field3466 = arg0.method5166();
            this.field3467 = arg0.method5166();
            this.field3457 = arg0.method5166();
            this.field3456 = arg0.method5166();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3474[arg1 - 30] = arg0.method5132();
            if (this.field3474[arg1 - 30].equalsIgnoreCase(class225.field2746)) {
                this.field3474[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5123();
            this.field3470 = new short[var5];
            this.field3480 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3470[var6] = (short) arg0.method5166();
                this.field3480[var6] = (short) arg0.method5166();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5123();
            this.field3472 = new short[var7];
            this.field3473 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3472[var8] = (short) arg0.method5166();
                this.field3473[var8] = (short) arg0.method5166();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5123();
            this.field3477 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3477[var10] = arg0.method5166();
            }
        } else if (arg1 == 93) {
            this.field3475 = false;
        } else if (arg1 == 95) {
            this.field3476 = arg0.method5166();
        } else if (arg1 == 97) {
            this.field3486 = arg0.method5166();
        } else if (arg1 == 98) {
            this.field3478 = arg0.method5166();
        } else if (arg1 == 99) {
            this.field3479 = true;
        } else if (arg1 == 100) {
            this.field3459 = arg0.method5268();
        } else if (arg1 == 101) {
            this.field3481 = arg0.method5268() * 5;
        } else if (arg1 == 102) {
            this.field3482 = arg0.method5166();
        } else if (arg1 == 103) {
            this.field3468 = arg0.method5166();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3485 = arg0.method5166();
            if (this.field3485 == 65535) {
                this.field3485 = -1;
            }
            this.field3483 = arg0.method5166();
            if (this.field3483 == 65535) {
                this.field3483 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5166();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5123();
            this.field3458 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3458[var13] = arg0.method5166();
                if (this.field3458[var13] == 65535) {
                    this.field3458[var13] = -1;
                }
            }
            this.field3458[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3487 = false;
        } else if (arg1 == 109) {
            this.field3488 = false;
        } else if (arg1 == 111) {
            this.field3489 = true;
        } else if (arg1 == 249) {
            this.field3490 = class248.method3205(arg0, this.field3490);
        }
    }

    @ObfuscatedName("it.l(Liv;ILiv;II)Ldv;")
    public final class128 method4406(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field3458 != null) {
            class257 var5 = this.method4408();
            return var5 == null ? null : var5.method4406(arg0, arg1, arg2, arg3);
        }
        class128 var6 = (class128) field3462.method3120((long) this.field3465);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3461.length; var8++) {
                if (!Statics.field3454.method3875(this.field3461[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class122[] var9 = new class122[this.field3461.length];
            for (int var10 = 0; var10 < this.field3461.length; var10++) {
                var9[var10] = class122.method2685(Statics.field3454, this.field3461[var10], 0);
            }
            class122 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class122(var9, var9.length);
            }
            if (this.field3470 != null) {
                for (int var12 = 0; var12 < this.field3470.length; var12++) {
                    var11.method2640(this.field3470[var12], this.field3480[var12]);
                }
            }
            if (this.field3472 != null) {
                for (int var13 = 0; var13 < this.field3472.length; var13++) {
                    var11.method2653(this.field3472[var13], this.field3473[var13]);
                }
            }
            var6 = var11.method2660(this.field3459 + 64, this.field3481 + 850, -30, -50, -30);
            field3462.method3122(var6, (long) this.field3465);
        }
        class128 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4468(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4454(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2757(true);
        } else {
            var14 = arg2.method4454(var6, arg3);
        }
        if (this.field3486 != 128 || this.field3478 != 128) {
            var14.method2746(this.field3486, this.field3478, this.field3486);
        }
        return var14;
    }

    @ObfuscatedName("it.c(B)Ldu;")
    public final class122 method4407() {
        if (this.field3458 != null) {
            class257 var1 = this.method4408();
            return var1 == null ? null : var1.method4407();
        } else if (this.field3477 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3477.length; var3++) {
                if (!Statics.field3454.method3875(this.field3477[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class122[] var4 = new class122[this.field3477.length];
            for (int var5 = 0; var5 < this.field3477.length; var5++) {
                var4[var5] = class122.method2685(Statics.field3454, this.field3477[var5], 0);
            }
            class122 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class122(var4, var4.length);
            }
            if (this.field3470 != null) {
                for (int var7 = 0; var7 < this.field3470.length; var7++) {
                    var6.method2640(this.field3470[var7], this.field3480[var7]);
                }
            }
            if (this.field3472 != null) {
                for (int var8 = 0; var8 < this.field3472.length; var8++) {
                    var6.method2653(this.field3472[var8], this.field3473[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("it.o(B)Lit;")
    public final class257 method4408() {
        int var1 = -1;
        if (this.field3485 != -1) {
            var1 = class213.method3185(this.field3485);
        } else if (this.field3483 != -1) {
            var1 = class213.field2507[this.field3483];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3458.length - 1) {
            var2 = this.field3458[var1];
        } else {
            var2 = this.field3458[this.field3458.length - 1];
        }
        return var2 == -1 ? null : method1054(var2);
    }

    @ObfuscatedName("it.i(B)Z")
    public boolean method4402() {
        if (this.field3458 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3485 != -1) {
            var1 = class213.method3185(this.field3485);
        } else if (this.field3483 != -1) {
            var1 = class213.field2507[this.field3483];
        }
        if (var1 >= 0 && var1 < this.field3458.length) {
            return this.field3458[var1] != -1;
        } else {
            return this.field3458[this.field3458.length - 1] != -1;
        }
    }

    @ObfuscatedName("it.d(III)I")
    public int method4429(int arg0, int arg1) {
        return class248.method4841(this.field3490, arg0, arg1);
    }

    @ObfuscatedName("it.m(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4420(int arg0, String arg1) {
        class316 var3 = this.field3490;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class177 var5 = (class177) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2084;
            }
        }
        return var4;
    }
}
