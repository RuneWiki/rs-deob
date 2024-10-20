package deob;

@ObfuscatedName("ir")
public class class255 extends class176 {

    @ObfuscatedName("ir.c")
    public static boolean field3357 = false;

    @ObfuscatedName("ir.e")
    public static class146 field3350 = new class146(4096);

    @ObfuscatedName("ir.i")
    public static class146 field3348 = new class146(500);

    @ObfuscatedName("ir.g")
    public static class146 field3375 = new class146(30);

    @ObfuscatedName("ir.d")
    public static class146 field3344 = new class146(30);

    @ObfuscatedName("ir.l")
    public static class122[] field3351 = new class122[4];

    @ObfuscatedName("ir.j")
    public int field3369;

    @ObfuscatedName("ir.m")
    public int[] field3347;

    @ObfuscatedName("ir.p")
    public int[] field3354;

    @ObfuscatedName("ir.h")
    public String field3355 = class225.field2775;

    @ObfuscatedName("ir.v")
    public short[] field3356;

    @ObfuscatedName("ir.n")
    public short[] field3372;

    @ObfuscatedName("ir.x")
    public short[] field3349;

    @ObfuscatedName("ir.w")
    public short[] field3367;

    @ObfuscatedName("ir.k")
    public int field3360 = 1;

    @ObfuscatedName("ir.q")
    public int field3361 = 1;

    @ObfuscatedName("ir.z")
    public int field3362 = 2;

    @ObfuscatedName("ir.y")
    public boolean field3363 = true;

    @ObfuscatedName("ir.f")
    public int field3364 = -1;

    @ObfuscatedName("ir.b")
    public int field3352 = -1;

    @ObfuscatedName("ir.r")
    public boolean field3366 = false;

    @ObfuscatedName("ir.s")
    public boolean field3358 = false;

    @ObfuscatedName("ir.a")
    public int field3368 = -1;

    @ObfuscatedName("ir.u")
    public int field3391 = 16;

    @ObfuscatedName("ir.ae")
    public int field3370 = 0;

    @ObfuscatedName("ir.af")
    public int field3371 = 0;

    @ObfuscatedName("ir.az")
    public String[] field3394 = new String[5];

    @ObfuscatedName("ir.ax")
    public int field3373 = -1;

    @ObfuscatedName("ir.aj")
    public int field3359 = -1;

    @ObfuscatedName("ir.au")
    public boolean field3393 = false;

    @ObfuscatedName("ir.ay")
    public boolean field3376 = true;

    @ObfuscatedName("ir.aa")
    public int field3377 = 128;

    @ObfuscatedName("ir.aq")
    public int field3378 = 128;

    @ObfuscatedName("ir.as")
    public int field3353 = 128;

    @ObfuscatedName("ir.ak")
    public int field3365 = 0;

    @ObfuscatedName("ir.ac")
    public int field3381 = 0;

    @ObfuscatedName("ir.aw")
    public int field3379 = 0;

    @ObfuscatedName("ir.ar")
    public boolean field3383 = false;

    @ObfuscatedName("ir.av")
    public boolean field3384 = false;

    @ObfuscatedName("ir.al")
    public int field3385 = -1;

    @ObfuscatedName("ir.ad")
    public int[] field3386;

    @ObfuscatedName("ir.am")
    public int field3388 = -1;

    @ObfuscatedName("ir.ao")
    public int field3380 = -1;

    @ObfuscatedName("ir.at")
    public int field3389 = -1;

    @ObfuscatedName("ir.an")
    public int field3390 = 0;

    @ObfuscatedName("ir.ag")
    public int field3387 = 0;

    @ObfuscatedName("ir.ai")
    public int field3392 = 0;

    @ObfuscatedName("ir.ab")
    public int[] field3345;

    @ObfuscatedName("ir.ap")
    public class317 field3374;

    @ObfuscatedName("er.c(IB)Lir;")
    public static class255 method3070(int arg0) {
        class255 var1 = (class255) field3350.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3382.method3845(6, arg0);
        class255 var3 = new class255();
        var3.field3369 = arg0;
        if (var2 != null) {
            var3.method4274(new class301(var2));
        }
        var3.method4273();
        if (var3.field3384) {
            var3.field3362 = 0;
            var3.field3363 = false;
        }
        field3350.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.t(B)V")
    public void method4273() {
        if (this.field3364 == -1) {
            this.field3364 = 0;
            if (this.field3347 != null && (this.field3354 == null || this.field3354[0] == 10)) {
                this.field3364 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3394[var1] != null) {
                    this.field3364 = 1;
                }
            }
        }
        if (this.field3385 == -1) {
            this.field3385 = this.field3362 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ir.o(Lkp;I)V")
    public void method4274(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4275(arg0, var2);
        }
    }

    @ObfuscatedName("ir.e(Lkp;IB)V")
    public void method4275(class301 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5129();
            if (var3 > 0) {
                if (this.field3347 == null || field3357) {
                    this.field3354 = new int[var3];
                    this.field3347 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3347[var4] = arg0.method5124();
                        this.field3354[var4] = arg0.method5129();
                    }
                } else {
                    arg0.field3707 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3355 = arg0.method5138();
        } else if (arg1 == 5) {
            int var5 = arg0.method5129();
            if (var5 > 0) {
                if (this.field3347 == null || field3357) {
                    this.field3354 = null;
                    this.field3347 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3347[var6] = arg0.method5124();
                    }
                } else {
                    arg0.field3707 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3360 = arg0.method5129();
        } else if (arg1 == 15) {
            this.field3361 = arg0.method5129();
        } else if (arg1 == 17) {
            this.field3362 = 0;
            this.field3363 = false;
        } else if (arg1 == 18) {
            this.field3363 = false;
        } else if (arg1 == 19) {
            this.field3364 = arg0.method5129();
        } else if (arg1 == 21) {
            this.field3352 = 0;
        } else if (arg1 == 22) {
            this.field3366 = true;
        } else if (arg1 == 23) {
            this.field3358 = true;
        } else if (arg1 == 24) {
            this.field3368 = arg0.method5124();
            if (this.field3368 == 65535) {
                this.field3368 = -1;
            }
        } else if (arg1 == 27) {
            this.field3362 = 1;
        } else if (arg1 == 28) {
            this.field3391 = arg0.method5129();
        } else if (arg1 == 29) {
            this.field3370 = arg0.method5130();
        } else if (arg1 == 39) {
            this.field3371 = arg0.method5130();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3394[arg1 - 30] = arg0.method5138();
            if (this.field3394[arg1 - 30].equalsIgnoreCase(class225.field2770)) {
                this.field3394[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5129();
            this.field3356 = new short[var7];
            this.field3372 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3356[var8] = (short) arg0.method5124();
                this.field3372[var8] = (short) arg0.method5124();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5129();
            this.field3349 = new short[var9];
            this.field3367 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3349[var10] = (short) arg0.method5124();
                this.field3367[var10] = (short) arg0.method5124();
            }
        } else if (arg1 == 62) {
            this.field3393 = true;
        } else if (arg1 == 64) {
            this.field3376 = false;
        } else if (arg1 == 65) {
            this.field3377 = arg0.method5124();
        } else if (arg1 == 66) {
            this.field3378 = arg0.method5124();
        } else if (arg1 == 67) {
            this.field3353 = arg0.method5124();
        } else if (arg1 == 68) {
            this.field3359 = arg0.method5124();
        } else if (arg1 == 69) {
            arg0.method5129();
        } else if (arg1 == 70) {
            this.field3365 = arg0.method5132();
        } else if (arg1 == 71) {
            this.field3381 = arg0.method5132();
        } else if (arg1 == 72) {
            this.field3379 = arg0.method5132();
        } else if (arg1 == 73) {
            this.field3383 = true;
        } else if (arg1 == 74) {
            this.field3384 = true;
        } else if (arg1 == 75) {
            this.field3385 = arg0.method5129();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3388 = arg0.method5124();
            if (this.field3388 == 65535) {
                this.field3388 = -1;
            }
            this.field3380 = arg0.method5124();
            if (this.field3380 == 65535) {
                this.field3380 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5124();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5129();
            this.field3386 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3386[var15] = arg0.method5124();
                if (this.field3386[var15] == 65535) {
                    this.field3386[var15] = -1;
                }
            }
            this.field3386[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3389 = arg0.method5124();
            this.field3390 = arg0.method5129();
        } else if (arg1 == 79) {
            this.field3387 = arg0.method5124();
            this.field3392 = arg0.method5124();
            this.field3390 = arg0.method5129();
            int var11 = arg0.method5129();
            this.field3345 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3345[var12] = arg0.method5124();
            }
        } else if (arg1 == 81) {
            this.field3352 = arg0.method5129() * 256;
        } else if (arg1 == 82) {
            this.field3373 = arg0.method5124();
        } else if (arg1 == 249) {
            this.field3374 = class249.method1064(arg0, this.field3374);
        }
    }

    @ObfuscatedName("ir.i(II)Z")
    public final boolean method4276(int arg0) {
        if (this.field3354 != null) {
            for (int var4 = 0; var4 < this.field3354.length; var4++) {
                if (this.field3354[var4] == arg0) {
                    return Statics.field3346.method3838(this.field3347[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3347 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3347.length; var3++) {
                var2 &= Statics.field3346.method3838(this.field3347[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.g(I)Z")
    public final boolean method4317() {
        if (this.field3347 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3347.length; var2++) {
            var1 &= Statics.field3346.method3838(this.field3347[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ir.d(II[[IIIII)Leq;")
    public final class136 method4314(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3354 == null) {
            var7 = (long) ((this.field3369 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3369 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3375.method3100(var7);
        if (var9 == null) {
            class122 var10 = this.method4281(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3366) {
                var10.field1555 = (short) (this.field3370 + 64);
                var10.field1563 = (short) (this.field3371 * 25 + 768);
                var10.method2616();
                var9 = var10;
            } else {
                var9 = var10.method2595(this.field3370 + 64, this.field3371 * 25 + 768, -50, -10, -50);
            }
            field3375.method3102(var9, var7);
        }
        if (this.field3366) {
            var9 = ((class122) var9).method2581();
        }
        if (this.field3352 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2665(arg2, arg3, arg4, arg5, true, this.field3352);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2574(arg2, arg3, arg4, arg5, true, this.field3352);
            }
        }
        return var9;
    }

    @ObfuscatedName("ir.l(II[[IIIII)Ldx;")
    public final class128 method4291(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3354 == null) {
            var7 = (long) ((this.field3369 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3369 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3344.method3100(var7);
        if (var9 == null) {
            class122 var10 = this.method4281(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2595(this.field3370 + 64, this.field3371 * 25 + 768, -50, -10, -50);
            field3344.method3102(var9, var7);
        }
        if (this.field3352 >= 0) {
            var9 = var9.method2665(arg2, arg3, arg4, arg5, true, this.field3352);
        }
        return var9;
    }

    @ObfuscatedName("ir.j(II[[IIIILip;IB)Ldx;")
    public final class128 method4280(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class260 arg6, int arg7) {
        long var9;
        if (this.field3354 == null) {
            var9 = (long) ((this.field3369 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3369 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3344.method3100(var9);
        if (var11 == null) {
            class122 var12 = this.method4281(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2595(this.field3370 + 64, this.field3371 * 25 + 768, -50, -10, -50);
            field3344.method3102(var11, var9);
        }
        if (arg6 == null && this.field3352 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2666(true);
        } else {
            var13 = arg6.method4439(var11, arg7, arg1);
        }
        if (this.field3352 >= 0) {
            var13 = var13.method2665(arg2, arg3, arg4, arg5, false, this.field3352);
        }
        return var13;
    }

    @ObfuscatedName("ir.m(III)Ldg;")
    public final class122 method4281(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3354 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3347 == null) {
                return null;
            }
            boolean var4 = this.field3393;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3347.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3347[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3348.method3100((long) var7);
                if (var3 == null) {
                    var3 = class122.method2633(Statics.field3346, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2590();
                    }
                    field3348.method3102(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3351[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3351, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3354.length; var9++) {
                if (this.field3354[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3347[var8];
            boolean var11 = this.field3393 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3348.method3100((long) var10);
            if (var3 == null) {
                var3 = class122.method2633(Statics.field3346, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2590();
                }
                field3348.method3102(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3377 == 128 && this.field3378 == 128 && this.field3353 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3365 == 0 && this.field3381 == 0 && this.field3379 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3356 == null, this.field3349 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2586(256);
            var14.method2587(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2598();
        } else if (var15 == 2) {
            var14.method2584();
        } else if (var15 == 3) {
            var14.method2639();
        }
        if (this.field3356 != null) {
            for (int var16 = 0; var16 < this.field3356.length; var16++) {
                var14.method2588(this.field3356[var16], this.field3372[var16]);
            }
        }
        if (this.field3349 != null) {
            for (int var17 = 0; var17 < this.field3349.length; var17++) {
                var14.method2589(this.field3349[var17], this.field3367[var17]);
            }
        }
        if (var12) {
            var14.method2606(this.field3377, this.field3378, this.field3353);
        }
        if (var13) {
            var14.method2587(this.field3365, this.field3381, this.field3379);
        }
        return var14;
    }

    @ObfuscatedName("ir.p(I)Lir;")
    public final class255 method4304() {
        int var1 = -1;
        if (this.field3388 != -1) {
            var1 = Statics.method122(this.field3388);
        } else if (this.field3380 != -1) {
            var1 = class213.field2534[this.field3380];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3386.length - 1) {
            var2 = this.field3386[var1];
        } else {
            var2 = this.field3386[this.field3386.length - 1];
        }
        return var2 == -1 ? null : method3070(var2);
    }

    @ObfuscatedName("ir.h(III)I")
    public int method4283(int arg0, int arg1) {
        class317 var3 = this.field3374;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5510((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2112;
            }
        }
        return var4;
    }

    @ObfuscatedName("ir.v(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4284(int arg0, String arg1) {
        return class249.method2650(this.field3374, arg0, arg1);
    }

    @ObfuscatedName("ir.n(I)Z")
    public boolean method4285() {
        if (this.field3386 == null) {
            return this.field3389 != -1 || this.field3345 != null;
        }
        for (int var1 = 0; var1 < this.field3386.length; var1++) {
            if (this.field3386[var1] != -1) {
                class255 var2 = method3070(this.field3386[var1]);
                if (var2.field3389 != -1 || var2.field3345 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
