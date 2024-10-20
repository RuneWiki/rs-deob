package deob;

@ObfuscatedName("ik")
public class class254 extends class176 {

    @ObfuscatedName("ik.s")
    public static boolean field3375 = false;

    @ObfuscatedName("ik.k")
    public static class146 field3333 = new class146(4096);

    @ObfuscatedName("ik.u")
    public static class146 field3337 = new class146(500);

    @ObfuscatedName("ik.n")
    public static class146 field3335 = new class146(30);

    @ObfuscatedName("ik.t")
    public static class146 field3336 = new class146(30);

    @ObfuscatedName("ik.q")
    public static class122[] field3365 = new class122[4];

    @ObfuscatedName("ik.x")
    public int field3338;

    @ObfuscatedName("ik.d")
    public int[] field3371;

    @ObfuscatedName("ik.f")
    public int[] field3340;

    @ObfuscatedName("ik.c")
    public String field3341 = class225.field2929;

    @ObfuscatedName("ik.r")
    public short[] field3342;

    @ObfuscatedName("ik.y")
    public short[] field3343;

    @ObfuscatedName("ik.p")
    public short[] field3344;

    @ObfuscatedName("ik.b")
    public short[] field3345;

    @ObfuscatedName("ik.g")
    public int field3372 = 1;

    @ObfuscatedName("ik.e")
    public int field3347 = 1;

    @ObfuscatedName("ik.z")
    public int field3348 = 2;

    @ObfuscatedName("ik.a")
    public boolean field3334 = true;

    @ObfuscatedName("ik.w")
    public int field3350 = -1;

    @ObfuscatedName("ik.l")
    public int field3351 = -1;

    @ObfuscatedName("ik.h")
    public boolean field3352 = false;

    @ObfuscatedName("ik.v")
    public boolean field3381 = false;

    @ObfuscatedName("ik.m")
    public int field3339 = -1;

    @ObfuscatedName("ik.o")
    public int field3355 = 16;

    @ObfuscatedName("ik.av")
    public int field3356 = 0;

    @ObfuscatedName("ik.am")
    public int field3357 = 0;

    @ObfuscatedName("ik.ai")
    public String[] field3358 = new String[5];

    @ObfuscatedName("ik.af")
    public int field3359 = -1;

    @ObfuscatedName("ik.az")
    public int field3373 = -1;

    @ObfuscatedName("ik.aj")
    public boolean field3361 = false;

    @ObfuscatedName("ik.an")
    public boolean field3362 = true;

    @ObfuscatedName("ik.at")
    public int field3363 = 128;

    @ObfuscatedName("ik.as")
    public int field3368 = 128;

    @ObfuscatedName("ik.ak")
    public int field3369 = 128;

    @ObfuscatedName("ik.ao")
    public int field3366 = 0;

    @ObfuscatedName("ik.ac")
    public int field3367 = 0;

    @ObfuscatedName("ik.ar")
    public int field3349 = 0;

    @ObfuscatedName("ik.au")
    public boolean field3330 = false;

    @ObfuscatedName("ik.ax")
    public boolean field3370 = false;

    @ObfuscatedName("ik.ag")
    public int field3364 = -1;

    @ObfuscatedName("ik.aa")
    public int[] field3354;

    @ObfuscatedName("ik.ap")
    public int field3377 = -1;

    @ObfuscatedName("ik.aq")
    public int field3374 = -1;

    @ObfuscatedName("ik.ay")
    public int field3346 = -1;

    @ObfuscatedName("ik.ad")
    public int field3376 = 0;

    @ObfuscatedName("ik.al")
    public int field3353 = 0;

    @ObfuscatedName("ik.ah")
    public int field3378 = 0;

    @ObfuscatedName("ik.ab")
    public int[] field3379;

    @ObfuscatedName("ik.aw")
    public class316 field3380;

    @ObfuscatedName("hw.s(II)Lik;")
    public static class254 method3676(int arg0) {
        class254 var1 = (class254) field3333.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3331.method3790(6, arg0);
        class254 var3 = new class254();
        var3.field3338 = arg0;
        if (var2 != null) {
            var3.method4195(new class300(var2));
        }
        var3.method4190();
        if (var3.field3370) {
            var3.field3348 = 0;
            var3.field3334 = false;
        }
        field3333.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.j(I)V")
    public void method4190() {
        if (this.field3350 == -1) {
            this.field3350 = 0;
            if (this.field3371 != null && (this.field3340 == null || this.field3340[0] == 10)) {
                this.field3350 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3358[var1] != null) {
                    this.field3350 = 1;
                }
            }
        }
        if (this.field3364 == -1) {
            this.field3364 = this.field3348 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ik.i(Lky;I)V")
    public void method4195(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4194(arg0, var2);
        }
    }

    @ObfuscatedName("ik.k(Lky;IB)V")
    public void method4194(class300 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5179();
            if (var3 > 0) {
                if (this.field3371 == null || field3375) {
                    this.field3340 = new int[var3];
                    this.field3371 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3371[var4] = arg0.method5054();
                        this.field3340[var4] = arg0.method5179();
                    }
                } else {
                    arg0.field3704 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3341 = arg0.method5150();
        } else if (arg1 == 5) {
            int var5 = arg0.method5179();
            if (var5 > 0) {
                if (this.field3371 == null || field3375) {
                    this.field3340 = null;
                    this.field3371 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3371[var6] = arg0.method5054();
                    }
                } else {
                    arg0.field3704 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3372 = arg0.method5179();
        } else if (arg1 == 15) {
            this.field3347 = arg0.method5179();
        } else if (arg1 == 17) {
            this.field3348 = 0;
            this.field3334 = false;
        } else if (arg1 == 18) {
            this.field3334 = false;
        } else if (arg1 == 19) {
            this.field3350 = arg0.method5179();
        } else if (arg1 == 21) {
            this.field3351 = 0;
        } else if (arg1 == 22) {
            this.field3352 = true;
        } else if (arg1 == 23) {
            this.field3381 = true;
        } else if (arg1 == 24) {
            this.field3339 = arg0.method5054();
            if (this.field3339 == 65535) {
                this.field3339 = -1;
            }
        } else if (arg1 == 27) {
            this.field3348 = 1;
        } else if (arg1 == 28) {
            this.field3355 = arg0.method5179();
        } else if (arg1 == 29) {
            this.field3356 = arg0.method5034();
        } else if (arg1 == 39) {
            this.field3357 = arg0.method5034();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3358[arg1 - 30] = arg0.method5150();
            if (this.field3358[arg1 - 30].equalsIgnoreCase(class225.field2741)) {
                this.field3358[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5179();
            this.field3342 = new short[var7];
            this.field3343 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3342[var8] = (short) arg0.method5054();
                this.field3343[var8] = (short) arg0.method5054();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5179();
            this.field3344 = new short[var9];
            this.field3345 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3344[var10] = (short) arg0.method5054();
                this.field3345[var10] = (short) arg0.method5054();
            }
        } else if (arg1 == 62) {
            this.field3361 = true;
        } else if (arg1 == 64) {
            this.field3362 = false;
        } else if (arg1 == 65) {
            this.field3363 = arg0.method5054();
        } else if (arg1 == 66) {
            this.field3368 = arg0.method5054();
        } else if (arg1 == 67) {
            this.field3369 = arg0.method5054();
        } else if (arg1 == 68) {
            this.field3373 = arg0.method5054();
        } else if (arg1 == 69) {
            arg0.method5179();
        } else if (arg1 == 70) {
            this.field3366 = arg0.method5055();
        } else if (arg1 == 71) {
            this.field3367 = arg0.method5055();
        } else if (arg1 == 72) {
            this.field3349 = arg0.method5055();
        } else if (arg1 == 73) {
            this.field3330 = true;
        } else if (arg1 == 74) {
            this.field3370 = true;
        } else if (arg1 == 75) {
            this.field3364 = arg0.method5179();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3377 = arg0.method5054();
            if (this.field3377 == 65535) {
                this.field3377 = -1;
            }
            this.field3374 = arg0.method5054();
            if (this.field3374 == 65535) {
                this.field3374 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5054();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5179();
            this.field3354 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3354[var15] = arg0.method5054();
                if (this.field3354[var15] == 65535) {
                    this.field3354[var15] = -1;
                }
            }
            this.field3354[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3346 = arg0.method5054();
            this.field3376 = arg0.method5179();
        } else if (arg1 == 79) {
            this.field3353 = arg0.method5054();
            this.field3378 = arg0.method5054();
            this.field3376 = arg0.method5179();
            int var11 = arg0.method5179();
            this.field3379 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3379[var12] = arg0.method5054();
            }
        } else if (arg1 == 81) {
            this.field3351 = arg0.method5179() * 256;
        } else if (arg1 == 82) {
            this.field3359 = arg0.method5054();
        } else if (arg1 == 249) {
            this.field3380 = Statics.method2030(arg0, this.field3380);
        }
    }

    @ObfuscatedName("ik.u(II)Z")
    public final boolean method4192(int arg0) {
        if (this.field3340 != null) {
            for (int var4 = 0; var4 < this.field3340.length; var4++) {
                if (this.field3340[var4] == arg0) {
                    return Statics.field3332.method3845(this.field3371[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3371 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3371.length; var3++) {
                var2 &= Statics.field3332.method3845(this.field3371[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ik.n(I)Z")
    public final boolean method4189() {
        if (this.field3371 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3371.length; var2++) {
            var1 &= Statics.field3332.method3845(this.field3371[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ik.t(II[[IIIIB)Len;")
    public final class136 method4191(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3340 == null) {
            var7 = (long) ((this.field3338 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3338 << 10) + (arg0 << 3) + arg1);
        }
        class136 var9 = (class136) field3335.method3065(var7);
        if (var9 == null) {
            class122 var10 = this.method4197(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3352) {
                var10.field1532 = (short) (this.field3356 + 64);
                var10.field1557 = (short) (this.field3357 * 25 + 768);
                var10.method2538();
                var9 = var10;
            } else {
                var9 = var10.method2542(this.field3356 + 64, this.field3357 * 25 + 768, -50, -10, -50);
            }
            field3335.method3067(var9, var7);
        }
        if (this.field3352) {
            var9 = ((class122) var9).method2526();
        }
        if (this.field3351 >= 0) {
            if (var9 instanceof class128) {
                var9 = ((class128) var9).method2622(arg2, arg3, arg4, arg5, true, this.field3351);
            } else if (var9 instanceof class122) {
                var9 = ((class122) var9).method2527(arg2, arg3, arg4, arg5, true, this.field3351);
            }
        }
        return var9;
    }

    @ObfuscatedName("ik.q(II[[IIIII)Ldo;")
    public final class128 method4230(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3340 == null) {
            var7 = (long) ((this.field3338 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3338 << 10) + (arg0 << 3) + arg1);
        }
        class128 var9 = (class128) field3336.method3065(var7);
        if (var9 == null) {
            class122 var10 = this.method4197(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2542(this.field3356 + 64, this.field3357 * 25 + 768, -50, -10, -50);
            field3336.method3067(var9, var7);
        }
        if (this.field3351 >= 0) {
            var9 = var9.method2622(arg2, arg3, arg4, arg5, true, this.field3351);
        }
        return var9;
    }

    @ObfuscatedName("ik.x(II[[IIIILij;II)Ldo;")
    public final class128 method4187(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class259 arg6, int arg7) {
        long var9;
        if (this.field3340 == null) {
            var9 = (long) ((this.field3338 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3338 << 10) + (arg0 << 3) + arg1);
        }
        class128 var11 = (class128) field3336.method3065(var9);
        if (var11 == null) {
            class122 var12 = this.method4197(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2542(this.field3356 + 64, this.field3357 * 25 + 768, -50, -10, -50);
            field3336.method3067(var11, var9);
        }
        if (arg6 == null && this.field3351 == -1) {
            return var11;
        }
        class128 var13;
        if (arg6 == null) {
            var13 = var11.method2623(true);
        } else {
            var13 = arg6.method4364(var11, arg7, arg1);
        }
        if (this.field3351 >= 0) {
            var13 = var13.method2622(arg2, arg3, arg4, arg5, false, this.field3351);
        }
        return var13;
    }

    @ObfuscatedName("ik.d(III)Ldq;")
    public final class122 method4197(int arg0, int arg1) {
        class122 var3 = null;
        if (this.field3340 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3371 == null) {
                return null;
            }
            boolean var4 = this.field3361;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3371.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3371[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class122) field3337.method3065((long) var7);
                if (var3 == null) {
                    var3 = class122.method2521(Statics.field3332, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2536();
                    }
                    field3337.method3067(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3365[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class122(field3365, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3340.length; var9++) {
                if (this.field3340[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3371[var8];
            boolean var11 = this.field3361 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class122) field3337.method3065((long) var10);
            if (var3 == null) {
                var3 = class122.method2521(Statics.field3332, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2536();
                }
                field3337.method3067(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3363 == 128 && this.field3368 == 128 && this.field3369 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3366 == 0 && this.field3367 == 0 && this.field3349 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class122 var14 = new class122(var3, arg1 == 0 && !var12 && !var13, this.field3342 == null, this.field3344 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2532(256);
            var14.method2533(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2587();
        } else if (var15 == 2) {
            var14.method2530();
        } else if (var15 == 3) {
            var14.method2531();
        }
        if (this.field3342 != null) {
            for (int var16 = 0; var16 < this.field3342.length; var16++) {
                var14.method2534(this.field3342[var16], this.field3343[var16]);
            }
        }
        if (this.field3344 != null) {
            for (int var17 = 0; var17 < this.field3344.length; var17++) {
                var14.method2535(this.field3344[var17], this.field3345[var17]);
            }
        }
        if (var12) {
            var14.method2537(this.field3363, this.field3368, this.field3369);
        }
        if (var13) {
            var14.method2533(this.field3366, this.field3367, this.field3349);
        }
        return var14;
    }

    @ObfuscatedName("ik.f(I)Lik;")
    public final class254 method4204() {
        int var1 = -1;
        if (this.field3377 != -1) {
            var1 = class213.method3606(this.field3377);
        } else if (this.field3374 != -1) {
            var1 = class213.field2503[this.field3374];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3354.length - 1) {
            var2 = this.field3354[var1];
        } else {
            var2 = this.field3354[this.field3354.length - 1];
        }
        return var2 == -1 ? null : method3676(var2);
    }

    @ObfuscatedName("ik.c(III)I")
    public int method4196(int arg0, int arg1) {
        class316 var3 = this.field3380;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5405((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2094;
            }
        }
        return var4;
    }

    @ObfuscatedName("ik.r(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4211(int arg0, String arg1) {
        return class248.method3751(this.field3380, arg0, arg1);
    }

    @ObfuscatedName("kz.y(I)V")
    public static void method4885() {
        field3333.method3068();
        field3337.method3068();
        field3335.method3068();
        field3336.method3068();
    }

    @ObfuscatedName("ik.p(I)Z")
    public boolean method4229() {
        if (this.field3354 == null) {
            return this.field3346 != -1 || this.field3379 != null;
        }
        for (int var1 = 0; var1 < this.field3354.length; var1++) {
            if (this.field3354[var1] != -1) {
                class254 var2 = method3676(this.field3354[var1]);
                if (var2.field3346 != -1 || var2.field3379 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
