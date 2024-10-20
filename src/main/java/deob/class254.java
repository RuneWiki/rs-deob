package deob;

@ObfuscatedName("ig")
public class class254 extends class183 {

    @ObfuscatedName("ig.f")
    public static boolean field3346 = false;

    @ObfuscatedName("ig.w")
    public static class155 field3315 = new class155(4096);

    @ObfuscatedName("ig.p")
    public static class155 field3318 = new class155(500);

    @ObfuscatedName("ig.b")
    public static class155 field3319 = new class155(30);

    @ObfuscatedName("ig.e")
    public static class155 field3362 = new class155(30);

    @ObfuscatedName("ig.x")
    public static class122[] field3317 = new class122[4];

    @ObfuscatedName("ig.a")
    public int field3324;

    @ObfuscatedName("ig.d")
    public int[] field3323;

    @ObfuscatedName("ig.c")
    public int[] field3320;

    @ObfuscatedName("ig.o")
    public String field3325 = class225.field2800;

    @ObfuscatedName("ig.v")
    public short[] field3314;

    @ObfuscatedName("ig.k")
    public short[] field3340;

    @ObfuscatedName("ig.s")
    public short[] field3328;

    @ObfuscatedName("ig.l")
    public short[] field3329;

    @ObfuscatedName("ig.t")
    public int field3330 = 1;

    @ObfuscatedName("ig.j")
    public int field3331 = 1;

    @ObfuscatedName("ig.n")
    public int field3332 = 2;

    @ObfuscatedName("ig.u")
    public boolean field3360 = true;

    @ObfuscatedName("ig.z")
    public int field3334 = -1;

    @ObfuscatedName("ig.h")
    public int field3326 = -1;

    @ObfuscatedName("ig.m")
    public boolean field3336 = false;

    @ObfuscatedName("ig.g")
    public boolean field3337 = false;

    @ObfuscatedName("ig.r")
    public int field3338 = -1;

    @ObfuscatedName("ig.q")
    public int field3339 = 16;

    @ObfuscatedName("ig.aa")
    public int field3333 = 0;

    @ObfuscatedName("ig.av")
    public int field3335 = 0;

    @ObfuscatedName("ig.aw")
    public String[] field3342 = new String[5];

    @ObfuscatedName("ig.as")
    public int field3343 = -1;

    @ObfuscatedName("ig.ak")
    public int field3344 = -1;

    @ObfuscatedName("ig.au")
    public boolean field3345 = false;

    @ObfuscatedName("ig.ah")
    public boolean field3356 = true;

    @ObfuscatedName("ig.aq")
    public int field3347 = 128;

    @ObfuscatedName("ig.ao")
    public int field3350 = 128;

    @ObfuscatedName("ig.an")
    public int field3349 = 128;

    @ObfuscatedName("ig.ar")
    public int field3352 = 0;

    @ObfuscatedName("ig.az")
    public int field3357 = 0;

    @ObfuscatedName("ig.ay")
    public int field3322 = 0;

    @ObfuscatedName("ig.ag")
    public boolean field3353 = false;

    @ObfuscatedName("ig.ac")
    public boolean field3354 = false;

    @ObfuscatedName("ig.al")
    public int field3355 = -1;

    @ObfuscatedName("ig.ae")
    public int[] field3321;

    @ObfuscatedName("ig.ad")
    public int field3327 = -1;

    @ObfuscatedName("ig.aj")
    public int field3358 = -1;

    @ObfuscatedName("ig.ax")
    public int field3359 = -1;

    @ObfuscatedName("ig.at")
    public int field3348 = 0;

    @ObfuscatedName("ig.af")
    public int field3351 = 0;

    @ObfuscatedName("ig.ap")
    public int field3361 = 0;

    @ObfuscatedName("ig.ai")
    public int[] field3363;

    @ObfuscatedName("ig.am")
    public class316 field3364;

    @ObfuscatedName("ht.f(IB)Lig;")
    public static class254 method3616(int arg0) {
        class254 var1 = (class254) field3315.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3341.method3752(6, arg0);
        class254 var3 = new class254();
        var3.field3324 = arg0;
        if (var2 != null) {
            var3.method4227(new class300(var2));
        }
        var3.method4226();
        if (var3.field3354) {
            var3.field3332 = 0;
            var3.field3360 = false;
        }
        field3315.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.i(B)V")
    public void method4226() {
        if (this.field3334 == -1) {
            this.field3334 = 0;
            if (this.field3323 != null && (this.field3320 == null || this.field3320[0] == 10)) {
                this.field3334 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3342[var1] != null) {
                    this.field3334 = 1;
                }
            }
        }
        if (this.field3355 == -1) {
            this.field3355 = this.field3332 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ig.y(Lkq;B)V")
    public void method4227(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4253(arg0, var2);
        }
    }

    @ObfuscatedName("ig.w(Lkq;II)V")
    public void method4253(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5110();
            if (var3 > 0) {
                if (this.field3323 == null || field3346) {
                    this.field3320 = new int[var3];
                    this.field3323 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3323[var4] = arg0.method5112();
                        this.field3320[var4] = arg0.method5110();
                    }
                } else {
                    arg0.field3703 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3325 = arg0.method5119();
        } else if (arg1 == 5) {
            int var5 = arg0.method5110();
            if (var5 > 0) {
                if (this.field3323 == null || field3346) {
                    this.field3320 = null;
                    this.field3323 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3323[var6] = arg0.method5112();
                    }
                } else {
                    arg0.field3703 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3330 = arg0.method5110();
        } else if (arg1 == 15) {
            this.field3331 = arg0.method5110();
        } else if (arg1 == 17) {
            this.field3332 = 0;
            this.field3360 = false;
        } else if (arg1 == 18) {
            this.field3360 = false;
        } else if (arg1 == 19) {
            this.field3334 = arg0.method5110();
        } else if (arg1 == 21) {
            this.field3326 = 0;
        } else if (arg1 == 22) {
            this.field3336 = true;
        } else if (arg1 == 23) {
            this.field3337 = true;
        } else if (arg1 == 24) {
            this.field3338 = arg0.method5112();
            if (this.field3338 == 65535) {
                this.field3338 = -1;
            }
        } else if (arg1 == 27) {
            this.field3332 = 1;
        } else if (arg1 == 28) {
            this.field3339 = arg0.method5110();
        } else if (arg1 == 29) {
            this.field3333 = arg0.method5297();
        } else if (arg1 == 39) {
            this.field3335 = arg0.method5297() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3342[arg1 - 30] = arg0.method5119();
            if (this.field3342[arg1 - 30].equalsIgnoreCase(class225.field2747)) {
                this.field3342[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5110();
            this.field3314 = new short[var7];
            this.field3340 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3314[var8] = (short) arg0.method5112();
                this.field3340[var8] = (short) arg0.method5112();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5110();
            this.field3328 = new short[var9];
            this.field3329 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3328[var10] = (short) arg0.method5112();
                this.field3329[var10] = (short) arg0.method5112();
            }
        } else if (arg1 == 62) {
            this.field3345 = true;
        } else if (arg1 == 64) {
            this.field3356 = false;
        } else if (arg1 == 65) {
            this.field3347 = arg0.method5112();
        } else if (arg1 == 66) {
            this.field3350 = arg0.method5112();
        } else if (arg1 == 67) {
            this.field3349 = arg0.method5112();
        } else if (arg1 == 68) {
            this.field3344 = arg0.method5112();
        } else if (arg1 == 69) {
            arg0.method5110();
        } else if (arg1 == 70) {
            this.field3352 = arg0.method5113();
        } else if (arg1 == 71) {
            this.field3357 = arg0.method5113();
        } else if (arg1 == 72) {
            this.field3322 = arg0.method5113();
        } else if (arg1 == 73) {
            this.field3353 = true;
        } else if (arg1 == 74) {
            this.field3354 = true;
        } else if (arg1 == 75) {
            this.field3355 = arg0.method5110();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3327 = arg0.method5112();
            if (this.field3327 == 65535) {
                this.field3327 = -1;
            }
            this.field3358 = arg0.method5112();
            if (this.field3358 == 65535) {
                this.field3358 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5112();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5110();
            this.field3321 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3321[var15] = arg0.method5112();
                if (this.field3321[var15] == 65535) {
                    this.field3321[var15] = -1;
                }
            }
            this.field3321[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3359 = arg0.method5112();
            this.field3348 = arg0.method5110();
        } else if (arg1 == 79) {
            this.field3351 = arg0.method5112();
            this.field3361 = arg0.method5112();
            this.field3348 = arg0.method5110();
            int var11 = arg0.method5110();
            this.field3363 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3363[var12] = arg0.method5112();
            }
        } else if (arg1 == 81) {
            this.field3326 = arg0.method5110() * 256;
        } else if (arg1 == 82) {
            this.field3343 = arg0.method5112();
        } else if (arg1 == 249) {
            this.field3364 = class248.method3588(arg0, this.field3364);
        }
    }

    @ObfuscatedName("ig.p(II)Z")
    public final boolean method4229(int arg0) {
        if (this.field3320 != null) {
            for (int var4 = 0; var4 < this.field3320.length; var4++) {
                if (this.field3320[var4] == arg0) {
                    return Statics.field3316.method3754(this.field3323[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3323 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3323.length; var3++) {
                var2 &= Statics.field3316.method3754(this.field3323[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ig.b(I)Z")
    public final boolean method4230() {
        if (this.field3323 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3323.length; var2++) {
            var1 &= Statics.field3316.method3754(this.field3323[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ig.e(II[[IIIIB)Lep;")
    public final class136 method4259(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3320 == null) {
            var7 = (long) ((this.field3324 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3324 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3319.method3099(var7);
        if (var9 == null) {
            class122 var10 = this.method4245(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3336) {
                var10.field1532 = (short) (this.field3333 + 64);
                var10.field1552 = (short) (this.field3335 + 768);
                var10.method2559();
                var9 = var10;
            } else {
                var9 = var10.method2603(this.field3333 + 64, this.field3335 + 768, -50, -10, -50);
            }
            field3319.method3101(var9, var7);
        }
        if (this.field3336) {
            var9 = ((class122) var9).method2547();
        }
        if (this.field3326 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2676(arg2, arg3, arg4, arg5, true, this.field3326);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2548(arg2, arg3, arg4, arg5, true, this.field3326);
            }
        }
        return var9;
    }

    @ObfuscatedName("ig.x(II[[IIIII)Ldw;")
    public final class128 method4233(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3320 == null) {
            var7 = (long) ((this.field3324 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3324 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3362.method3099(var7);
        if (var9 == null) {
            class122 var10 = this.method4245(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2603(this.field3333 + 64, this.field3335 + 768, -50, -10, -50);
            field3362.method3101(var9, var7);
        }
        if (this.field3326 >= 0) {
            var9 = var9.method2676(arg2, arg3, arg4, arg5, true, this.field3326);
        }
        return var9;
    }

    @ObfuscatedName("ig.a(II[[IIIILiv;II)Ldw;")
    public final class128 method4237(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class259 arg6, int arg7) {
        long var9;
        if (this.field3320 == null) {
            var9 = (long) ((this.field3324 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3324 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3362.method3099(var9);
        if (var11 == null) {
            class122 var12 = this.method4245(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2603(this.field3333 + 64, this.field3335 + 768, -50, -10, -50);
            field3362.method3101(var11, var9);
        }
        if (arg6 == null && this.field3326 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2631(true);
        } else {
            var13 = arg6.method4402(var11, arg7, arg1);
        }
        if (this.field3326 >= 0) {
            var13 = var13.method2676(arg2, arg3, arg4, arg5, false, this.field3326);
        }
        return var13;
    }

    @ObfuscatedName("ig.d(IIB)Ldd;")
    public final class122 method4245(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3320 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3323 == null) {
                return null;
            }
            boolean var4 = this.field3345;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3323.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3323[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3318.method3099((long) var7);
                if (var3 == null) {
                    var3 = class122.method2543(Statics.field3316, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2561();
                    }
                    field3318.method3101(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3317[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3317, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3320.length; var9++) {
                if (this.field3320[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3323[var8];
            boolean var11 = this.field3345 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3318.method3099((long) var10);
            if (var3 == null) {
                var3 = class122.method2543(Statics.field3316, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2561();
                }
                field3318.method3101(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3347 == 128 && this.field3350 == 128 && this.field3349 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3352 == 0 && this.field3357 == 0 && this.field3322 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3314 == null, this.field3328 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2553(256);
            var14.method2550(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2616();
        } else if (var15 == 2) {
            var14.method2551();
        } else if (var15 == 3) {
            var14.method2542();
        }
        if (this.field3314 != null) {
            for (int var16 = 0; var16 < this.field3314.length; var16++) {
                var14.method2602(this.field3314[var16], this.field3340[var16]);
            }
        }
        if (this.field3328 != null) {
            for (int var17 = 0; var17 < this.field3328.length; var17++) {
                var14.method2556(this.field3328[var17], this.field3329[var17]);
            }
        }
        if (var12) {
            var14.method2554(this.field3347, this.field3350, this.field3349);
        }
        if (var13) {
            var14.method2550(this.field3352, this.field3357, this.field3322);
        }
        return var14;
    }

    @ObfuscatedName("ig.c(I)Lig;")
    public final class254 method4241() {
        int var1 = -1;
        if (this.field3327 != -1) {
            var1 = Statics.method782(this.field3327);
        } else if (this.field3358 != -1) {
            var1 = class213.field2511[this.field3358];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3321.length - 1) {
            var2 = this.field3321[var1];
        } else {
            var2 = this.field3321[this.field3321.length - 1];
        }
        return var2 == -1 ? null : method3616(var2);
    }

    @ObfuscatedName("ig.o(IIB)I")
    public int method4235(int arg0, int arg1) {
        return class248.method1895(this.field3364, arg0, arg1);
    }

    @ObfuscatedName("ig.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4236(int arg0, String arg1) {
        return class248.method131(this.field3364, arg0, arg1);
    }

    @ObfuscatedName("gf.t(I)V")
    public static void method3319() {
        field3315.method3102();
        field3318.method3102();
        field3319.method3102();
        field3362.method3102();
    }

    @ObfuscatedName("ig.j(I)Z")
    public boolean method4248() {
        if (this.field3321 == null) {
            return this.field3359 != -1 || this.field3363 != null;
        }
        for (int var1 = 0; var1 < this.field3321.length; var1++) {
            if (this.field3321[var1] != -1) {
                class254 var2 = method3616(this.field3321[var1]);
                if (var2.field3359 != -1 || var2.field3363 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
