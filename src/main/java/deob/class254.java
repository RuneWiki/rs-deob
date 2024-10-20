package deob;

@ObfuscatedName("iy")
public class class254 extends class176 {

    @ObfuscatedName("iy.q")
    public static boolean field3353 = false;

    @ObfuscatedName("iy.p")
    public static class146 field3391 = new class146(4096);

    @ObfuscatedName("iy.k")
    public static class146 field3388 = new class146(500);

    @ObfuscatedName("iy.l")
    public static class146 field3355 = new class146(30);

    @ObfuscatedName("iy.b")
    public static class146 field3356 = new class146(30);

    @ObfuscatedName("iy.i")
    public static class122[] field3399 = new class122[4];

    @ObfuscatedName("iy.c")
    public int field3358;

    @ObfuscatedName("iy.f")
    public int[] field3363;

    @ObfuscatedName("iy.m")
    public int[] field3360;

    @ObfuscatedName("iy.u")
    public String field3361 = class225.field2772;

    @ObfuscatedName("iy.x")
    public short[] field3376;

    @ObfuscatedName("iy.r")
    public short[] field3354;

    @ObfuscatedName("iy.v")
    public short[] field3364;

    @ObfuscatedName("iy.y")
    public short[] field3365;

    @ObfuscatedName("iy.g")
    public int field3366 = 1;

    @ObfuscatedName("iy.a")
    public int field3367 = 1;

    @ObfuscatedName("iy.j")
    public int field3383 = 2;

    @ObfuscatedName("iy.t")
    public boolean field3369 = true;

    @ObfuscatedName("iy.h")
    public int field3370 = -1;

    @ObfuscatedName("iy.o")
    public int field3371 = -1;

    @ObfuscatedName("iy.n")
    public boolean field3372 = false;

    @ObfuscatedName("iy.d")
    public boolean field3373 = false;

    @ObfuscatedName("iy.s")
    public int field3374 = -1;

    @ObfuscatedName("iy.z")
    public int field3375 = 16;

    @ObfuscatedName("iy.al")
    public int field3351 = 0;

    @ObfuscatedName("iy.av")
    public int field3381 = 0;

    @ObfuscatedName("iy.as")
    public String[] field3378 = new String[5];

    @ObfuscatedName("iy.aw")
    public int field3379 = -1;

    @ObfuscatedName("iy.ad")
    public int field3380 = -1;

    @ObfuscatedName("iy.ag")
    public boolean field3359 = false;

    @ObfuscatedName("iy.ar")
    public boolean field3357 = true;

    @ObfuscatedName("iy.ax")
    public int field3382 = 128;

    @ObfuscatedName("iy.az")
    public int field3384 = 128;

    @ObfuscatedName("iy.ae")
    public int field3385 = 128;

    @ObfuscatedName("iy.ao")
    public int field3386 = 0;

    @ObfuscatedName("iy.aj")
    public int field3387 = 0;

    @ObfuscatedName("iy.at")
    public int field3377 = 0;

    @ObfuscatedName("iy.ac")
    public boolean field3389 = false;

    @ObfuscatedName("iy.ap")
    public boolean field3390 = false;

    @ObfuscatedName("iy.aq")
    public int field3362 = -1;

    @ObfuscatedName("iy.aa")
    public int[] field3392;

    @ObfuscatedName("iy.an")
    public int field3350 = -1;

    @ObfuscatedName("iy.au")
    public int field3394 = -1;

    @ObfuscatedName("iy.ai")
    public int field3395 = -1;

    @ObfuscatedName("iy.ak")
    public int field3400 = 0;

    @ObfuscatedName("iy.ah")
    public int field3393 = 0;

    @ObfuscatedName("iy.am")
    public int field3398 = 0;

    @ObfuscatedName("iy.ay")
    public int[] field3368;

    @ObfuscatedName("iy.af")
    public class317 field3397;

    @ObfuscatedName("di.q(IS)Liy;")
    public static class254 method2713(int arg0) {
        class254 var1 = (class254) field3391.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3396.method3775(6, arg0);
        class254 var3 = new class254();
        var3.field3358 = arg0;
        if (var2 != null) {
            var3.method4242(new class301(var2));
        }
        var3.method4203();
        if (var3.field3390) {
            var3.field3383 = 0;
            var3.field3369 = false;
        }
        field3391.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.w(I)V")
    public void method4203() {
        if (this.field3370 == -1) {
            this.field3370 = 0;
            if (this.field3363 != null && (this.field3360 == null || this.field3360[0] == 10)) {
                this.field3370 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3378[var1] != null) {
                    this.field3370 = 1;
                }
            }
        }
        if (this.field3362 == -1) {
            this.field3362 = this.field3383 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("iy.e(Lkf;B)V")
    public void method4242(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4245(arg0, var2);
        }
    }

    @ObfuscatedName("iy.p(Lkf;II)V")
    public void method4245(class301 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5077();
            if (var3 > 0) {
                if (this.field3363 == null || field3353) {
                    this.field3360 = new int[var3];
                    this.field3363 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3363[var4] = arg0.method5069();
                        this.field3360[var4] = arg0.method5077();
                    }
                } else {
                    arg0.field3733 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3361 = arg0.method5076();
        } else if (arg1 == 5) {
            int var5 = arg0.method5077();
            if (var5 > 0) {
                if (this.field3363 == null || field3353) {
                    this.field3360 = null;
                    this.field3363 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3363[var6] = arg0.method5069();
                    }
                } else {
                    arg0.field3733 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3366 = arg0.method5077();
        } else if (arg1 == 15) {
            this.field3367 = arg0.method5077();
        } else if (arg1 == 17) {
            this.field3383 = 0;
            this.field3369 = false;
        } else if (arg1 == 18) {
            this.field3369 = false;
        } else if (arg1 == 19) {
            this.field3370 = arg0.method5077();
        } else if (arg1 == 21) {
            this.field3371 = 0;
        } else if (arg1 == 22) {
            this.field3372 = true;
        } else if (arg1 == 23) {
            this.field3373 = true;
        } else if (arg1 == 24) {
            this.field3374 = arg0.method5069();
            if (this.field3374 == 65535) {
                this.field3374 = -1;
            }
        } else if (arg1 == 27) {
            this.field3383 = 1;
        } else if (arg1 == 28) {
            this.field3375 = arg0.method5077();
        } else if (arg1 == 29) {
            this.field3351 = arg0.method5068();
        } else if (arg1 == 39) {
            this.field3381 = arg0.method5068();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3378[arg1 - 30] = arg0.method5076();
            if (this.field3378[arg1 - 30].equalsIgnoreCase(class225.field2760)) {
                this.field3378[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5077();
            this.field3376 = new short[var7];
            this.field3354 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3376[var8] = (short) arg0.method5069();
                this.field3354[var8] = (short) arg0.method5069();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5077();
            this.field3364 = new short[var9];
            this.field3365 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3364[var10] = (short) arg0.method5069();
                this.field3365[var10] = (short) arg0.method5069();
            }
        } else if (arg1 == 62) {
            this.field3359 = true;
        } else if (arg1 == 64) {
            this.field3357 = false;
        } else if (arg1 == 65) {
            this.field3382 = arg0.method5069();
        } else if (arg1 == 66) {
            this.field3384 = arg0.method5069();
        } else if (arg1 == 67) {
            this.field3385 = arg0.method5069();
        } else if (arg1 == 68) {
            this.field3380 = arg0.method5069();
        } else if (arg1 == 69) {
            arg0.method5077();
        } else if (arg1 == 70) {
            this.field3386 = arg0.method5179();
        } else if (arg1 == 71) {
            this.field3387 = arg0.method5179();
        } else if (arg1 == 72) {
            this.field3377 = arg0.method5179();
        } else if (arg1 == 73) {
            this.field3389 = true;
        } else if (arg1 == 74) {
            this.field3390 = true;
        } else if (arg1 == 75) {
            this.field3362 = arg0.method5077();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3350 = arg0.method5069();
            if (this.field3350 == 65535) {
                this.field3350 = -1;
            }
            this.field3394 = arg0.method5069();
            if (this.field3394 == 65535) {
                this.field3394 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5069();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5077();
            this.field3392 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3392[var15] = arg0.method5069();
                if (this.field3392[var15] == 65535) {
                    this.field3392[var15] = -1;
                }
            }
            this.field3392[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3395 = arg0.method5069();
            this.field3400 = arg0.method5077();
        } else if (arg1 == 79) {
            this.field3393 = arg0.method5069();
            this.field3398 = arg0.method5069();
            this.field3400 = arg0.method5077();
            int var11 = arg0.method5077();
            this.field3368 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3368[var12] = arg0.method5069();
            }
        } else if (arg1 == 81) {
            this.field3371 = arg0.method5077() * 256;
        } else if (arg1 == 82) {
            this.field3379 = arg0.method5069();
        } else if (arg1 == 249) {
            this.field3397 = class248.method347(arg0, this.field3397);
        }
    }

    @ObfuscatedName("iy.k(II)Z")
    public final boolean method4206(int arg0) {
        if (this.field3360 != null) {
            for (int var4 = 0; var4 < this.field3360.length; var4++) {
                if (this.field3360[var4] == arg0) {
                    return Statics.field3352.method3777(this.field3363[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3363 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3363.length; var3++) {
                var2 &= Statics.field3352.method3777(this.field3363[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iy.l(I)Z")
    public final boolean method4225() {
        if (this.field3363 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3363.length; var2++) {
            var1 &= Statics.field3352.method3777(this.field3363[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("iy.b(II[[IIIIB)Leo;")
    public final class136 method4208(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3360 == null) {
            var7 = (long) ((this.field3358 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3358 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3355.method3039(var7);
        if (var9 == null) {
            class122 var10 = this.method4211(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3372) {
                var10.field1581 = (short) (this.field3351 + 64);
                var10.field1578 = (short) (this.field3381 * 25 + 768);
                var10.method2530();
                var9 = var10;
            } else {
                var9 = var10.method2545(this.field3351 + 64, this.field3381 * 25 + 768, -50, -10, -50);
            }
            field3355.method3041(var9, var7);
        }
        if (this.field3372) {
            var9 = ((class122) var9).method2518();
        }
        if (this.field3371 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2601(arg2, arg3, arg4, arg5, true, this.field3371);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2519(arg2, arg3, arg4, arg5, true, this.field3371);
            }
        }
        return var9;
    }

    @ObfuscatedName("iy.i(II[[IIIII)Ldm;")
    public final class128 method4209(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3360 == null) {
            var7 = (long) ((this.field3358 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3358 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3356.method3039(var7);
        if (var9 == null) {
            class122 var10 = this.method4211(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2545(this.field3351 + 64, this.field3381 * 25 + 768, -50, -10, -50);
            field3356.method3041(var9, var7);
        }
        if (this.field3371 >= 0) {
            var9 = var9.method2601(arg2, arg3, arg4, arg5, true, this.field3371);
        }
        return var9;
    }

    @ObfuscatedName("iy.c(II[[IIIILis;IB)Ldm;")
    public final class128 method4231(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class259 arg6, int arg7) {
        long var9;
        if (this.field3360 == null) {
            var9 = (long) ((this.field3358 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3358 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3356.method3039(var9);
        if (var11 == null) {
            class122 var12 = this.method4211(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2545(this.field3351 + 64, this.field3381 * 25 + 768, -50, -10, -50);
            field3356.method3041(var11, var9);
        }
        if (arg6 == null && this.field3371 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2602(true);
        } else {
            var13 = arg6.method4378(var11, arg7, arg1);
        }
        if (this.field3371 >= 0) {
            var13 = var13.method2601(arg2, arg3, arg4, arg5, false, this.field3371);
        }
        return var13;
    }

    @ObfuscatedName("iy.u(III)Lds;")
    public final class122 method4211(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3360 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3363 == null) {
                return null;
            }
            boolean var4 = this.field3359;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3363.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3363[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3388.method3039((long) var7);
                if (var3 == null) {
                    var3 = class122.method2512(Statics.field3352, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2528();
                    }
                    field3388.method3041(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3399[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3399, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3360.length; var9++) {
                if (this.field3360[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3363[var8];
            boolean var11 = this.field3359 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3388.method3039((long) var10);
            if (var3 == null) {
                var3 = class122.method2512(Statics.field3352, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2528();
                }
                field3388.method3041(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3382 == 128 && this.field3384 == 128 && this.field3385 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3386 == 0 && this.field3387 == 0 && this.field3377 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3376 == null, this.field3364 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2524(256);
            var14.method2525(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2521();
        } else if (var15 == 2) {
            var14.method2540();
        } else if (var15 == 3) {
            var14.method2523();
        }
        if (this.field3376 != null) {
            for (int var16 = 0; var16 < this.field3376.length; var16++) {
                var14.method2526(this.field3376[var16], this.field3354[var16]);
            }
        }
        if (this.field3364 != null) {
            for (int var17 = 0; var17 < this.field3364.length; var17++) {
                var14.method2527(this.field3364[var17], this.field3365[var17]);
            }
        }
        if (var12) {
            var14.method2529(this.field3382, this.field3384, this.field3385);
        }
        if (var13) {
            var14.method2525(this.field3386, this.field3387, this.field3377);
        }
        return var14;
    }

    @ObfuscatedName("iy.x(B)Liy;")
    public final class254 method4212() {
        int var1 = -1;
        if (this.field3350 != -1) {
            var1 = class213.method1099(this.field3350);
        } else if (this.field3394 != -1) {
            var1 = class213.field2526[this.field3394];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3392.length - 1) {
            var2 = this.field3392[var1];
        } else {
            var2 = this.field3392[this.field3392.length - 1];
        }
        return var2 == -1 ? null : method2713(var2);
    }

    @ObfuscatedName("iy.r(III)I")
    public int method4213(int arg0, int arg1) {
        class317 var3 = this.field3397;
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

    @ObfuscatedName("iy.v(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4249(int arg0, String arg1) {
        return class248.method40(this.field3397, arg0, arg1);
    }

    @ObfuscatedName("dc.y(B)V")
    public static void method2509() {
        field3391.method3042();
        field3388.method3042();
        field3355.method3042();
        field3356.method3042();
    }

    @ObfuscatedName("iy.g(I)Z")
    public boolean method4215() {
        if (this.field3392 == null) {
            return this.field3395 != -1 || this.field3368 != null;
        }
        for (int var1 = 0; var1 < this.field3392.length; var1++) {
            if (this.field3392[var1] != -1) {
                class254 var2 = method2713(this.field3392[var1]);
                if (var2.field3395 != -1 || var2.field3368 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
