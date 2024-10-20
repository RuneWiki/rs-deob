package deob;

@ObfuscatedName("jg")
public class class264 extends class185 {

    @ObfuscatedName("jg.m")
    public static boolean field3391 = false;

    @ObfuscatedName("jg.j")
    public static class155 field3383 = new class155(4096);

    @ObfuscatedName("jg.p")
    public static class155 field3407 = new class155(500);

    @ObfuscatedName("jg.g")
    public static class155 field3387 = new class155(30);

    @ObfuscatedName("jg.n")
    public static class155 field3380 = new class155(30);

    @ObfuscatedName("jg.u")
    public static class131[] field3388 = new class131[4];

    @ObfuscatedName("jg.a")
    public int field3385;

    @ObfuscatedName("jg.z")
    public int[] field3417;

    @ObfuscatedName("jg.w")
    public int[] field3390;

    @ObfuscatedName("jg.y")
    public String field3418 = class234.field2799;

    @ObfuscatedName("jg.c")
    public short[] field3392;

    @ObfuscatedName("jg.h")
    public short[] field3393;

    @ObfuscatedName("jg.k")
    public short[] field3423;

    @ObfuscatedName("jg.r")
    public short[] field3395;

    @ObfuscatedName("jg.s")
    public int field3396 = 1;

    @ObfuscatedName("jg.v")
    public int field3397 = 1;

    @ObfuscatedName("jg.d")
    public int field3386 = 2;

    @ObfuscatedName("jg.e")
    public boolean field3399 = true;

    @ObfuscatedName("jg.l")
    public int field3400 = -1;

    @ObfuscatedName("jg.t")
    public int field3401 = -1;

    @ObfuscatedName("jg.x")
    public boolean field3402 = false;

    @ObfuscatedName("jg.b")
    public boolean field3403 = false;

    @ObfuscatedName("jg.i")
    public int field3384 = -1;

    @ObfuscatedName("jg.f")
    public int field3405 = 16;

    @ObfuscatedName("jg.ah")
    public int field3406 = 0;

    @ObfuscatedName("jg.ai")
    public int field3426 = 0;

    @ObfuscatedName("jg.ao")
    public String[] field3408 = new String[5];

    @ObfuscatedName("jg.ae")
    public int field3394 = -1;

    @ObfuscatedName("jg.ax")
    public int field3410 = -1;

    @ObfuscatedName("jg.ag")
    public boolean field3427 = false;

    @ObfuscatedName("jg.ab")
    public boolean field3412 = true;

    @ObfuscatedName("jg.am")
    public int field3411 = 128;

    @ObfuscatedName("jg.ak")
    public int field3414 = 128;

    @ObfuscatedName("jg.ad")
    public int field3415 = 128;

    @ObfuscatedName("jg.as")
    public int field3416 = 0;

    @ObfuscatedName("jg.ar")
    public int field3381 = 0;

    @ObfuscatedName("jg.ap")
    public int field3389 = 0;

    @ObfuscatedName("jg.al")
    public boolean field3419 = false;

    @ObfuscatedName("jg.an")
    public boolean field3420 = false;

    @ObfuscatedName("jg.ac")
    public int field3421 = -1;

    @ObfuscatedName("jg.av")
    public int[] field3422;

    @ObfuscatedName("jg.af")
    public int field3382 = -1;

    @ObfuscatedName("jg.at")
    public int field3424 = -1;

    @ObfuscatedName("jg.aa")
    public int field3425 = -1;

    @ObfuscatedName("jg.aw")
    public int field3413 = 0;

    @ObfuscatedName("jg.az")
    public int field3409 = 0;

    @ObfuscatedName("jg.aq")
    public int field3428 = 0;

    @ObfuscatedName("jg.ay")
    public int[] field3429;

    @ObfuscatedName("jg.au")
    public class326 field3430;

    @ObfuscatedName("ba.m(II)Ljg;")
    public static class264 method752(int arg0) {
        class264 var1 = (class264) field3383.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3398.method3891(6, arg0);
        class264 var3 = new class264();
        var3.field3385 = arg0;
        if (var2 != null) {
            var3.method4353(new class310(var2));
        }
        var3.method4377();
        if (var3.field3420) {
            var3.field3386 = 0;
            var3.field3399 = false;
        }
        field3383.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.o(I)V")
    public void method4377() {
        if (this.field3400 == -1) {
            this.field3400 = 0;
            if (this.field3417 != null && (this.field3390 == null || this.field3390[0] == 10)) {
                this.field3400 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3408[var1] != null) {
                    this.field3400 = 1;
                }
            }
        }
        if (this.field3421 == -1) {
            this.field3421 = this.field3386 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jg.q(Lkn;I)V")
    public void method4353(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4354(arg0, var2);
        }
    }

    @ObfuscatedName("jg.j(Lkn;II)V")
    public void method4354(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5227();
            if (var3 > 0) {
                if (this.field3417 == null || field3391) {
                    this.field3390 = new int[var3];
                    this.field3417 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3417[var4] = arg0.method5283();
                        this.field3390[var4] = arg0.method5227();
                    }
                } else {
                    arg0.field3734 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3418 = arg0.method5236();
        } else if (arg1 == 5) {
            int var5 = arg0.method5227();
            if (var5 > 0) {
                if (this.field3417 == null || field3391) {
                    this.field3390 = null;
                    this.field3417 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3417[var6] = arg0.method5283();
                    }
                } else {
                    arg0.field3734 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3396 = arg0.method5227();
        } else if (arg1 == 15) {
            this.field3397 = arg0.method5227();
        } else if (arg1 == 17) {
            this.field3386 = 0;
            this.field3399 = false;
        } else if (arg1 == 18) {
            this.field3399 = false;
        } else if (arg1 == 19) {
            this.field3400 = arg0.method5227();
        } else if (arg1 == 21) {
            this.field3401 = 0;
        } else if (arg1 == 22) {
            this.field3402 = true;
        } else if (arg1 == 23) {
            this.field3403 = true;
        } else if (arg1 == 24) {
            this.field3384 = arg0.method5283();
            if (this.field3384 == 65535) {
                this.field3384 = -1;
            }
        } else if (arg1 == 27) {
            this.field3386 = 1;
        } else if (arg1 == 28) {
            this.field3405 = arg0.method5227();
        } else if (arg1 == 29) {
            this.field3406 = arg0.method5228();
        } else if (arg1 == 39) {
            this.field3426 = arg0.method5228() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3408[arg1 - 30] = arg0.method5236();
            if (this.field3408[arg1 - 30].equalsIgnoreCase(class234.field2871)) {
                this.field3408[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5227();
            this.field3392 = new short[var7];
            this.field3393 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3392[var8] = (short) arg0.method5283();
                this.field3393[var8] = (short) arg0.method5283();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5227();
            this.field3423 = new short[var9];
            this.field3395 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3423[var10] = (short) arg0.method5283();
                this.field3395[var10] = (short) arg0.method5283();
            }
        } else if (arg1 == 62) {
            this.field3427 = true;
        } else if (arg1 == 64) {
            this.field3412 = false;
        } else if (arg1 == 65) {
            this.field3411 = arg0.method5283();
        } else if (arg1 == 66) {
            this.field3414 = arg0.method5283();
        } else if (arg1 == 67) {
            this.field3415 = arg0.method5283();
        } else if (arg1 == 68) {
            this.field3410 = arg0.method5283();
        } else if (arg1 == 69) {
            arg0.method5227();
        } else if (arg1 == 70) {
            this.field3416 = arg0.method5241();
        } else if (arg1 == 71) {
            this.field3381 = arg0.method5241();
        } else if (arg1 == 72) {
            this.field3389 = arg0.method5241();
        } else if (arg1 == 73) {
            this.field3419 = true;
        } else if (arg1 == 74) {
            this.field3420 = true;
        } else if (arg1 == 75) {
            this.field3421 = arg0.method5227();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3382 = arg0.method5283();
            if (this.field3382 == 65535) {
                this.field3382 = -1;
            }
            this.field3424 = arg0.method5283();
            if (this.field3424 == 65535) {
                this.field3424 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5283();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5227();
            this.field3422 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3422[var15] = arg0.method5283();
                if (this.field3422[var15] == 65535) {
                    this.field3422[var15] = -1;
                }
            }
            this.field3422[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3425 = arg0.method5283();
            this.field3413 = arg0.method5227();
        } else if (arg1 == 79) {
            this.field3409 = arg0.method5283();
            this.field3428 = arg0.method5283();
            this.field3413 = arg0.method5227();
            int var11 = arg0.method5227();
            this.field3429 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3429[var12] = arg0.method5283();
            }
        } else if (arg1 == 81) {
            this.field3401 = arg0.method5227() * 256;
        } else if (arg1 == 82) {
            this.field3394 = arg0.method5283();
        } else if (arg1 == 249) {
            this.field3430 = class258.method4134(arg0, this.field3430);
        }
    }

    @ObfuscatedName("jg.p(II)Z")
    public final boolean method4355(int arg0) {
        if (this.field3390 != null) {
            for (int var4 = 0; var4 < this.field3390.length; var4++) {
                if (this.field3390[var4] == arg0) {
                    return Statics.field3404.method3893(this.field3417[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3417 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3417.length; var3++) {
                var2 &= Statics.field3404.method3893(this.field3417[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jg.g(I)Z")
    public final boolean method4356() {
        if (this.field3417 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3417.length; var2++) {
            var1 &= Statics.field3404.method3893(this.field3417[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jg.n(II[[IIIIS)Lel;")
    public final class145 method4357(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3390 == null) {
            var7 = (long) ((this.field3385 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3385 << 10) + (arg0 << 3) + arg1);
        }
        class145 var9 = (class145) field3387.method3127(var7);
        if (var9 == null) {
            class131 var10 = this.method4378(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3402) {
                var10.field1605 = (short) (this.field3406 + 64);
                var10.field1606 = (short) (this.field3426 + 768);
                var10.method2635();
                var9 = var10;
            } else {
                var9 = var10.method2619(this.field3406 + 64, this.field3426 + 768, -50, -10, -50);
            }
            field3387.method3137(var9, var7);
        }
        if (this.field3402) {
            var9 = ((class131) var9).method2652();
        }
        if (this.field3401 >= 0) {
            if (var9 instanceof class137) {
                var9 = ((class137) var9).method2706(arg2, arg3, arg4, arg5, true, this.field3401);
            } else if (var9 instanceof class131) {
                var9 = ((class131) var9).method2626(arg2, arg3, arg4, arg5, true, this.field3401);
            }
        }
        return var9;
    }

    @ObfuscatedName("jg.u(II[[IIIII)Lef;")
    public final class137 method4358(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3390 == null) {
            var7 = (long) ((this.field3385 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3385 << 10) + (arg0 << 3) + arg1);
        }
        class137 var9 = (class137) field3380.method3127(var7);
        if (var9 == null) {
            class131 var10 = this.method4378(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2619(this.field3406 + 64, this.field3426 + 768, -50, -10, -50);
            field3380.method3137(var9, var7);
        }
        if (this.field3401 >= 0) {
            var9 = var9.method2706(arg2, arg3, arg4, arg5, true, this.field3401);
        }
        return var9;
    }

    @ObfuscatedName("jg.a(II[[IIIILjm;II)Lef;")
    public final class137 method4359(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class269 arg6, int arg7) {
        long var9;
        if (this.field3390 == null) {
            var9 = (long) ((this.field3385 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3385 << 10) + (arg0 << 3) + arg1);
        }
        class137 var11 = (class137) field3380.method3127(var9);
        if (var11 == null) {
            class131 var12 = this.method4378(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2619(this.field3406 + 64, this.field3426 + 768, -50, -10, -50);
            field3380.method3137(var11, var9);
        }
        if (arg6 == null && this.field3401 == -1) {
            return var11;
        }
        class137 var13;
        if (arg6 == null) {
            var13 = var11.method2770(true);
        } else {
            var13 = arg6.method4540(var11, arg7, arg1);
        }
        if (this.field3401 >= 0) {
            var13 = var13.method2706(arg2, arg3, arg4, arg5, false, this.field3401);
        }
        return var13;
    }

    @ObfuscatedName("jg.z(IIB)Lek;")
    public final class131 method4378(int arg0, int arg1) {
        class131 var3 = null;
        if (this.field3390 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3417 == null) {
                return null;
            }
            boolean var4 = this.field3427;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3417.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3417[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class131) field3407.method3127((long) var7);
                if (var3 == null) {
                    var3 = class131.method2632(Statics.field3404, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2633();
                    }
                    field3407.method3137(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3388[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class131(field3388, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3390.length; var9++) {
                if (this.field3390[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3417[var8];
            boolean var11 = this.field3427 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class131) field3407.method3127((long) var10);
            if (var3 == null) {
                var3 = class131.method2632(Statics.field3404, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2633();
                }
                field3407.method3137(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3411 == 128 && this.field3414 == 128 && this.field3415 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3416 == 0 && this.field3381 == 0 && this.field3389 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class131 var14 = new class131(var3, arg1 == 0 && !var12 && !var13, this.field3392 == null, this.field3423 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2682(256);
            var14.method2631(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2628();
        } else if (var15 == 2) {
            var14.method2658();
        } else if (var15 == 3) {
            var14.method2629();
        }
        if (this.field3392 != null) {
            for (int var16 = 0; var16 < this.field3392.length; var16++) {
                var14.method2639(this.field3392[var16], this.field3393[var16]);
            }
        }
        if (this.field3423 != null) {
            for (int var17 = 0; var17 < this.field3423.length; var17++) {
                var14.method2690(this.field3423[var17], this.field3395[var17]);
            }
        }
        if (var12) {
            var14.method2634(this.field3411, this.field3414, this.field3415);
        }
        if (var13) {
            var14.method2631(this.field3416, this.field3381, this.field3389);
        }
        return var14;
    }

    @ObfuscatedName("jg.w(I)Ljg;")
    public final class264 method4361() {
        int var1 = -1;
        if (this.field3382 != -1) {
            var1 = class222.method3842(this.field3382);
        } else if (this.field3424 != -1) {
            var1 = class222.field2562[this.field3424];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3422.length - 1) {
            var2 = this.field3422[var1];
        } else {
            var2 = this.field3422[this.field3422.length - 1];
        }
        return var2 == -1 ? null : method752(var2);
    }

    @ObfuscatedName("jg.y(III)I")
    public int method4362(int arg0, int arg1) {
        return class258.method3448(this.field3430, arg0, arg1);
    }

    @ObfuscatedName("jg.c(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4380(int arg0, String arg1) {
        return class258.method4181(this.field3430, arg0, arg1);
    }

    @ObfuscatedName("jg.h(I)Z")
    public boolean method4364() {
        if (this.field3422 == null) {
            return this.field3425 != -1 || this.field3429 != null;
        }
        for (int var1 = 0; var1 < this.field3422.length; var1++) {
            if (this.field3422[var1] != -1) {
                class264 var2 = method752(this.field3422[var1]);
                if (var2.field3425 != -1 || var2.field3429 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
