package deob;

@ObfuscatedName("gd")
public class class206 extends class200 {

    @ObfuscatedName("gd.f")
    public static class206 field2453 = new class206();

    @ObfuscatedName("gd.e")
    public static byte[] field2420 = new byte[1];

    @ObfuscatedName("gd.v")
    public static class206 field2421 = new class206();

    @ObfuscatedName("gd.y")
    public static byte[] field2422 = new byte[1];

    @ObfuscatedName("gd.j")
    public int field2466 = 0;

    @ObfuscatedName("gd.o")
    public int[] field2430;

    @ObfuscatedName("gd.m")
    public int[] field2425;

    @ObfuscatedName("gd.r")
    public int[] field2458;

    @ObfuscatedName("gd.h")
    public int field2427 = 0;

    @ObfuscatedName("gd.d")
    public int[] field2428;

    @ObfuscatedName("gd.z")
    public int[] field2434;

    @ObfuscatedName("gd.b")
    public int[] field2447;

    @ObfuscatedName("gd.i")
    public int[] field2431;

    @ObfuscatedName("gd.k")
    public int[] field2426;

    @ObfuscatedName("gd.g")
    public int[] field2487;

    @ObfuscatedName("gd.t")
    public byte[] field2456;

    @ObfuscatedName("gd.x")
    public byte[] field2435;

    @ObfuscatedName("gd.u")
    public byte[] field2449;

    @ObfuscatedName("gd.q")
    public short[] field2437;

    @ObfuscatedName("gd.s")
    public byte field2438 = 0;

    @ObfuscatedName("gd.p")
    public int field2439 = 0;

    @ObfuscatedName("gd.c")
    public int[] field2450;

    @ObfuscatedName("gd.n")
    public int[] field2441;

    @ObfuscatedName("gd.l")
    public int[] field2442;

    @ObfuscatedName("gd.w")
    public int[][] field2463;

    @ObfuscatedName("gd.a")
    public int[][] field2444;

    @ObfuscatedName("gd.aw")
    public boolean field2445 = false;

    @ObfuscatedName("gd.ak")
    public int field2446;

    @ObfuscatedName("gd.ad")
    public int field2424;

    @ObfuscatedName("gd.at")
    public int field2448;

    @ObfuscatedName("gd.ah")
    public int field2433;

    @ObfuscatedName("gd.az")
    public int field2419;

    @ObfuscatedName("gd.ap")
    public int field2451;

    @ObfuscatedName("gd.ag")
    public int field2481;

    @ObfuscatedName("gd.ab")
    public int field2432;

    @ObfuscatedName("gd.aq")
    public int field2454 = -1;

    @ObfuscatedName("gd.ae")
    public int field2455 = -1;

    @ObfuscatedName("gd.ao")
    public int field2465 = -1;

    @ObfuscatedName("gd.al")
    public static boolean[] field2470 = new boolean[6500];

    @ObfuscatedName("gd.aj")
    public static boolean[] field2459 = new boolean[6500];

    @ObfuscatedName("gd.ac")
    public static int[] field2460 = new int[6500];

    @ObfuscatedName("gd.as")
    public static int[] field2472 = new int[6500];

    @ObfuscatedName("gd.au")
    public static int[] field2462 = new int[6500];

    @ObfuscatedName("gd.ay")
    public static int[] field2436 = new int[6500];

    @ObfuscatedName("gd.am")
    public static int[] field2464 = new int[6500];

    @ObfuscatedName("gd.aa")
    public static int[] field2478 = new int[6500];

    @ObfuscatedName("gd.av")
    public static int[] field2467 = new int[1600];

    @ObfuscatedName("gd.ax")
    public static int[][] field2452 = new int[1600][512];

    @ObfuscatedName("gd.ar")
    public static int[] field2469 = new int[12];

    @ObfuscatedName("gd.af")
    public static int[][] field2468 = new int[12][2000];

    @ObfuscatedName("gd.bq")
    public static int[] field2471 = new int[2000];

    @ObfuscatedName("gd.bx")
    public static int[] field2423 = new int[2000];

    @ObfuscatedName("gd.bi")
    public static int[] field2473 = new int[12];

    @ObfuscatedName("gd.bz")
    public static int[] field2474 = new int[10];

    @ObfuscatedName("gd.bb")
    public static int[] field2475 = new int[10];

    @ObfuscatedName("gd.bv")
    public static int[] field2476 = new int[10];

    @ObfuscatedName("gd.bs")
    public static boolean field2480 = true;

    @ObfuscatedName("gd.by")
    public static int[] field2461 = class197.field2271;

    @ObfuscatedName("gd.bt")
    public static int[] field2484 = class197.field2285;

    @ObfuscatedName("gd.bg")
    public static int[] field2485 = class197.field2277;

    @ObfuscatedName("gd.bm")
    public static int[] field2486 = class197.field2283;

    public class206() {
    }

    public class206(class206[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2466 = 0;
        this.field2427 = 0;
        this.field2439 = 0;
        this.field2438 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class206 var8 = arg0[var7];
            if (var8 != null) {
                this.field2466 += var8.field2466;
                this.field2427 += var8.field2427;
                this.field2439 += var8.field2439;
                if (var8.field2456 == null) {
                    if (this.field2438 == -1) {
                        this.field2438 = var8.field2438;
                    }
                    if (this.field2438 != var8.field2438) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2435 != null;
                var5 |= var8.field2437 != null;
                var6 |= var8.field2449 != null;
            }
        }
        this.field2430 = new int[this.field2466];
        this.field2425 = new int[this.field2466];
        this.field2458 = new int[this.field2466];
        this.field2428 = new int[this.field2427];
        this.field2434 = new int[this.field2427];
        this.field2447 = new int[this.field2427];
        this.field2431 = new int[this.field2427];
        this.field2426 = new int[this.field2427];
        this.field2487 = new int[this.field2427];
        if (var3) {
            this.field2456 = new byte[this.field2427];
        }
        if (var4) {
            this.field2435 = new byte[this.field2427];
        }
        if (var5) {
            this.field2437 = new short[this.field2427];
        }
        if (var6) {
            this.field2449 = new byte[this.field2427];
        }
        if (this.field2439 > 0) {
            this.field2450 = new int[this.field2439];
            this.field2441 = new int[this.field2439];
            this.field2442 = new int[this.field2439];
        }
        this.field2466 = 0;
        this.field2427 = 0;
        this.field2439 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class206 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2427; var11++) {
                    this.field2428[this.field2427] = var10.field2428[var11] + this.field2466;
                    this.field2434[this.field2427] = var10.field2434[var11] + this.field2466;
                    this.field2447[this.field2427] = var10.field2447[var11] + this.field2466;
                    this.field2431[this.field2427] = var10.field2431[var11];
                    this.field2426[this.field2427] = var10.field2426[var11];
                    this.field2487[this.field2427] = var10.field2487[var11];
                    if (var3) {
                        if (var10.field2456 == null) {
                            this.field2456[this.field2427] = var10.field2438;
                        } else {
                            this.field2456[this.field2427] = var10.field2456[var11];
                        }
                    }
                    if (var4 && var10.field2435 != null) {
                        this.field2435[this.field2427] = var10.field2435[var11];
                    }
                    if (var5) {
                        if (var10.field2437 == null) {
                            this.field2437[this.field2427] = -1;
                        } else {
                            this.field2437[this.field2427] = var10.field2437[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2449 == null || var10.field2449[var11] == -1) {
                            this.field2449[this.field2427] = -1;
                        } else {
                            this.field2449[this.field2427] = (byte) (var10.field2449[var11] + this.field2439);
                        }
                    }
                    this.field2427++;
                }
                for (int var12 = 0; var12 < var10.field2439; var12++) {
                    this.field2450[this.field2439] = var10.field2450[var12] + this.field2466;
                    this.field2441[this.field2439] = var10.field2441[var12] + this.field2466;
                    this.field2442[this.field2439] = var10.field2442[var12] + this.field2466;
                    this.field2439++;
                }
                for (int var13 = 0; var13 < var10.field2466; var13++) {
                    this.field2430[this.field2466] = var10.field2430[var13];
                    this.field2425[this.field2466] = var10.field2425[var13];
                    this.field2458[this.field2466] = var10.field2458[var13];
                    this.field2466++;
                }
            }
        }
    }

    @ObfuscatedName("gd.f([[IIIIZI)Lgd;")
    public class206 method3838(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3842();
        int var7 = arg1 - this.field2448;
        int var8 = this.field2448 + arg1;
        int var9 = arg3 - this.field2448;
        int var10 = this.field2448 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class206 var15;
        if (arg4) {
            var15 = new class206();
            var15.field2466 = this.field2466;
            var15.field2427 = this.field2427;
            var15.field2439 = this.field2439;
            var15.field2430 = this.field2430;
            var15.field2458 = this.field2458;
            var15.field2428 = this.field2428;
            var15.field2434 = this.field2434;
            var15.field2447 = this.field2447;
            var15.field2431 = this.field2431;
            var15.field2426 = this.field2426;
            var15.field2487 = this.field2487;
            var15.field2456 = this.field2456;
            var15.field2435 = this.field2435;
            var15.field2449 = this.field2449;
            var15.field2437 = this.field2437;
            var15.field2438 = this.field2438;
            var15.field2450 = this.field2450;
            var15.field2441 = this.field2441;
            var15.field2442 = this.field2442;
            var15.field2463 = this.field2463;
            var15.field2444 = this.field2444;
            var15.field2445 = this.field2445;
            var15.field2425 = new int[var15.field2466];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2466; var16++) {
                int var17 = this.field2430[var16] + arg1;
                int var18 = this.field2458[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2425[var16] = this.field2425[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2466; var26++) {
                int var27 = (-this.field2425[var26] << 16) / this.field2359;
                if (var27 < arg5) {
                    int var28 = this.field2430[var26] + arg1;
                    int var29 = this.field2458[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2425[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2425[var26];
                }
            }
        }
        var15.method3856();
        return var15;
    }

    @ObfuscatedName("gd.v(Z)Lgd;")
    public class206 method3839(boolean arg0) {
        if (!arg0 && field2420.length < this.field2427) {
            field2420 = new byte[this.field2427 + 100];
        }
        return this.method3851(arg0, field2453, field2420);
    }

    @ObfuscatedName("gd.j(Z)Lgd;")
    public class206 method3859(boolean arg0) {
        if (!arg0 && field2422.length < this.field2427) {
            field2422 = new byte[this.field2427 + 100];
        }
        return this.method3851(arg0, field2421, field2422);
    }

    @ObfuscatedName("gd.o(ZLgd;[B)Lgd;")
    public class206 method3851(boolean arg0, class206 arg1, byte[] arg2) {
        arg1.field2466 = this.field2466;
        arg1.field2427 = this.field2427;
        arg1.field2439 = this.field2439;
        if (arg1.field2430 == null || arg1.field2430.length < this.field2466) {
            arg1.field2430 = new int[this.field2466 + 100];
            arg1.field2425 = new int[this.field2466 + 100];
            arg1.field2458 = new int[this.field2466 + 100];
        }
        for (int var4 = 0; var4 < this.field2466; var4++) {
            arg1.field2430[var4] = this.field2430[var4];
            arg1.field2425[var4] = this.field2425[var4];
            arg1.field2458[var4] = this.field2458[var4];
        }
        if (arg0) {
            arg1.field2435 = this.field2435;
        } else {
            arg1.field2435 = arg2;
            if (this.field2435 == null) {
                for (int var5 = 0; var5 < this.field2427; var5++) {
                    arg1.field2435[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2427; var6++) {
                    arg1.field2435[var6] = this.field2435[var6];
                }
            }
        }
        arg1.field2428 = this.field2428;
        arg1.field2434 = this.field2434;
        arg1.field2447 = this.field2447;
        arg1.field2431 = this.field2431;
        arg1.field2426 = this.field2426;
        arg1.field2487 = this.field2487;
        arg1.field2456 = this.field2456;
        arg1.field2449 = this.field2449;
        arg1.field2437 = this.field2437;
        arg1.field2438 = this.field2438;
        arg1.field2450 = this.field2450;
        arg1.field2441 = this.field2441;
        arg1.field2442 = this.field2442;
        arg1.field2463 = this.field2463;
        arg1.field2444 = this.field2444;
        arg1.field2445 = this.field2445;
        arg1.method3856();
        return arg1;
    }

    @ObfuscatedName("gd.m(I)V")
    public void method3841(int arg0) {
        if (this.field2454 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2484[arg0];
        int var9 = field2461[arg0];
        for (int var10 = 0; var10 < this.field2466; var10++) {
            int var11 = class197.method3511(this.field2430[var10], this.field2458[var10], var8, var9);
            int var12 = this.field2425[var10];
            int var13 = class197.method3512(this.field2430[var10], this.field2458[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field2451 = (var2 + var5) / 2;
        this.field2481 = (var3 + var6) / 2;
        this.field2432 = (var4 + var7) / 2;
        this.field2454 = (var5 - var2 + 1) / 2;
        this.field2455 = (var6 - var3 + 1) / 2;
        this.field2465 = (var7 - var4 + 1) / 2;
        if (this.field2454 < 32) {
            this.field2454 = 32;
        }
        if (this.field2465 < 32) {
            this.field2465 = 32;
        }
        if (this.field2445) {
            this.field2454 += 8;
            this.field2465 += 8;
        }
    }

    @ObfuscatedName("gd.r()V")
    public void method3842() {
        if (this.field2446 == 1) {
            return;
        }
        this.field2446 = 1;
        this.field2359 = 0;
        this.field2424 = 0;
        this.field2448 = 0;
        for (int var1 = 0; var1 < this.field2466; var1++) {
            int var2 = this.field2430[var1];
            int var3 = this.field2425[var1];
            int var4 = this.field2458[var1];
            if (-var3 > this.field2359) {
                this.field2359 = -var3;
            }
            if (var3 > this.field2424) {
                this.field2424 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2448) {
                this.field2448 = var5;
            }
        }
        this.field2448 = (int) (Math.sqrt((double) this.field2448) + 0.99D);
        this.field2419 = (int) (Math.sqrt((double) (this.field2359 * this.field2359 + this.field2448 * this.field2448)) + 0.99D);
        this.field2433 = this.field2419 + (int) (Math.sqrt((double) (this.field2448 * this.field2448 + this.field2424 * this.field2424)) + 0.99D);
    }

    @ObfuscatedName("gd.h()V")
    public void method3845() {
        if (this.field2446 == 2) {
            return;
        }
        this.field2446 = 2;
        this.field2448 = 0;
        for (int var1 = 0; var1 < this.field2466; var1++) {
            int var2 = this.field2430[var1];
            int var3 = this.field2425[var1];
            int var4 = this.field2458[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2448) {
                this.field2448 = var5;
            }
        }
        this.field2448 = (int) (Math.sqrt((double) this.field2448) + 0.99D);
        this.field2419 = this.field2448;
        this.field2433 = this.field2448 + this.field2448;
    }

    @ObfuscatedName("gd.d()I")
    public int method3867() {
        this.method3842();
        return this.field2448;
    }

    @ObfuscatedName("gd.z()V")
    public void method3856() {
        this.field2446 = 0;
        this.field2454 = -1;
    }

    @ObfuscatedName("gd.b(Lgi;I)V")
    public void method3897(class202 arg0, int arg1) {
        if (this.field2463 == null || arg1 == -1) {
            return;
        }
        class195 var3 = arg0.field2367[arg1];
        class198 var4 = var3.field2229;
        Statics.field2477 = 0;
        Statics.field2443 = 0;
        Statics.field2479 = 0;
        for (int var5 = 0; var5 < var3.field2230; var5++) {
            int var6 = var3.field2231[var5];
            this.method3909(var4.field2288[var6], var4.field2287[var6], var3.field2234[var5], var3.field2233[var5], var3.field2235[var5]);
        }
        this.method3856();
    }

    @ObfuscatedName("gd.i(Lgi;ILgi;I[I)V")
    public void method3846(class202 arg0, int arg1, class202 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method3897(arg0, arg1);
            return;
        }
        class195 var6 = arg0.field2367[arg1];
        class195 var7 = arg2.field2367[arg3];
        class198 var8 = var6.field2229;
        Statics.field2477 = 0;
        Statics.field2443 = 0;
        Statics.field2479 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2230; var11++) {
            int var12 = var6.field2231[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2288[var12] == 0) {
                this.method3909(var8.field2288[var12], var8.field2287[var12], var6.field2234[var11], var6.field2233[var11], var6.field2235[var11]);
            }
        }
        Statics.field2477 = 0;
        Statics.field2443 = 0;
        Statics.field2479 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2230; var15++) {
            int var16 = var7.field2231[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2288[var16] == 0) {
                this.method3909(var8.field2288[var16], var8.field2287[var16], var7.field2234[var15], var7.field2233[var15], var7.field2235[var15]);
            }
        }
        this.method3856();
    }

    @ObfuscatedName("gd.k(I[IIII)V")
    public void method3909(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2477 = 0;
            Statics.field2443 = 0;
            Statics.field2479 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2463.length) {
                    int[] var10 = this.field2463[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2477 += this.field2430[var12];
                        Statics.field2443 += this.field2425[var12];
                        Statics.field2479 += this.field2458[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2477 = Statics.field2477 / var7 + arg2;
                Statics.field2443 = Statics.field2443 / var7 + arg3;
                Statics.field2479 = Statics.field2479 / var7 + arg4;
            } else {
                Statics.field2477 = arg2;
                Statics.field2443 = arg3;
                Statics.field2479 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2463.length) {
                    int[] var15 = this.field2463[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2430[var17] += arg2;
                        this.field2425[var17] += arg3;
                        this.field2458[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2463.length) {
                    int[] var20 = this.field2463[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2430[var22] -= Statics.field2477;
                        this.field2425[var22] -= Statics.field2443;
                        this.field2458[var22] -= Statics.field2479;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2461[var25];
                            int var27 = field2484[var25];
                            int var28 = this.field2430[var22] * var27 + this.field2425[var22] * var26 >> 16;
                            this.field2425[var22] = this.field2425[var22] * var27 - this.field2430[var22] * var26 >> 16;
                            this.field2430[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2461[var23];
                            int var30 = field2484[var23];
                            int var31 = this.field2425[var22] * var30 - this.field2458[var22] * var29 >> 16;
                            this.field2458[var22] = this.field2458[var22] * var30 + this.field2425[var22] * var29 >> 16;
                            this.field2425[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2461[var24];
                            int var33 = field2484[var24];
                            int var34 = this.field2458[var22] * var32 + this.field2430[var22] * var33 >> 16;
                            this.field2458[var22] = this.field2458[var22] * var33 - this.field2430[var22] * var32 >> 16;
                            this.field2430[var22] = var34;
                        }
                        this.field2430[var22] += Statics.field2477;
                        this.field2425[var22] += Statics.field2443;
                        this.field2458[var22] += Statics.field2479;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2463.length) {
                    int[] var37 = this.field2463[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2430[var39] -= Statics.field2477;
                        this.field2425[var39] -= Statics.field2443;
                        this.field2458[var39] -= Statics.field2479;
                        this.field2430[var39] = this.field2430[var39] * arg2 / 128;
                        this.field2425[var39] = this.field2425[var39] * arg3 / 128;
                        this.field2458[var39] = this.field2458[var39] * arg4 / 128;
                        this.field2430[var39] += Statics.field2477;
                        this.field2425[var39] += Statics.field2443;
                        this.field2458[var39] += Statics.field2479;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2444 != null && this.field2435 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2444.length) {
                    int[] var42 = this.field2444[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2435[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2435[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gd.g()V")
    public void method3848() {
        for (int var1 = 0; var1 < this.field2466; var1++) {
            int var2 = this.field2430[var1];
            this.field2430[var1] = this.field2458[var1];
            this.field2458[var1] = -var2;
        }
        this.method3856();
    }

    @ObfuscatedName("gd.t()V")
    public void method3849() {
        for (int var1 = 0; var1 < this.field2466; var1++) {
            this.field2430[var1] = -this.field2430[var1];
            this.field2458[var1] = -this.field2458[var1];
        }
        this.method3856();
    }

    @ObfuscatedName("gd.x()V")
    public void method3850() {
        for (int var1 = 0; var1 < this.field2466; var1++) {
            int var2 = this.field2458[var1];
            this.field2458[var1] = this.field2430[var1];
            this.field2430[var1] = -var2;
        }
        this.method3856();
    }

    @ObfuscatedName("gd.u(I)V")
    public void method3852(int arg0) {
        int var2 = field2461[arg0];
        int var3 = field2484[arg0];
        for (int var4 = 0; var4 < this.field2466; var4++) {
            int var5 = this.field2425[var4] * var3 - this.field2458[var4] * var2 >> 16;
            this.field2458[var4] = this.field2458[var4] * var3 + this.field2425[var4] * var2 >> 16;
            this.field2425[var4] = var5;
        }
        this.method3856();
    }

    @ObfuscatedName("gd.q(III)V")
    public void method3872(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2466; var4++) {
            this.field2430[var4] += arg0;
            this.field2425[var4] += arg1;
            this.field2458[var4] += arg2;
        }
        this.method3856();
    }

    @ObfuscatedName("gd.s(III)V")
    public void method3892(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2466; var4++) {
            this.field2430[var4] = this.field2430[var4] * arg0 / 128;
            this.field2425[var4] = this.field2425[var4] * arg1 / 128;
            this.field2458[var4] = this.field2458[var4] * arg2 / 128;
        }
        this.method3856();
    }

    @ObfuscatedName("gd.p(IIIIIII)V")
    public final void method3883(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2467[0] = -1;
        if (this.field2446 != 2 && this.field2446 != 1) {
            this.method3845();
        }
        int var8 = Statics.field2269;
        int var9 = Statics.field2272;
        int var10 = field2461[arg0];
        int var11 = field2484[arg0];
        int var12 = field2461[arg1];
        int var13 = field2484[arg1];
        int var14 = field2461[arg2];
        int var15 = field2484[arg2];
        int var16 = field2461[arg3];
        int var17 = field2484[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2466; var19++) {
            int var20 = this.field2430[var19];
            int var21 = this.field2425[var19];
            int var22 = this.field2458[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field2462[var19] = var30 - var18;
            field2460[var19] = class197.field2270 * var26 / var30 + var8;
            field2472[var19] = class197.field2270 * var29 / var30 + var9;
            if (this.field2439 > 0) {
                field2436[var19] = var26;
                field2464[var19] = var29;
                field2478[var19] = var30;
            }
        }
        try {
            this.method3866(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("gd.c(IIIIIIII)V")
    public final void method3847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2467[0] = -1;
        if (this.field2446 != 2 && this.field2446 != 1) {
            this.method3845();
        }
        int var9 = Statics.field2269;
        int var10 = Statics.field2272;
        int var11 = field2461[arg0];
        int var12 = field2484[arg0];
        int var13 = field2461[arg1];
        int var14 = field2484[arg1];
        int var15 = field2461[arg2];
        int var16 = field2484[arg2];
        int var17 = field2461[arg3];
        int var18 = field2484[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2466; var20++) {
            int var21 = this.field2430[var20];
            int var22 = this.field2425[var20];
            int var23 = this.field2458[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field2462[var20] = var31 - var19;
            field2460[var20] = class197.field2270 * var27 / arg7 + var9;
            field2472[var20] = class197.field2270 * var30 / arg7 + var10;
            if (this.field2439 > 0) {
                field2436[var20] = var27;
                field2464[var20] = var30;
                field2478[var20] = var31;
            }
        }
        try {
            this.method3866(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("gd.bh(IIIIIIIIJ)V")
    public void method3785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2467[0] = -1;
        if (this.field2446 != 1) {
            this.method3842();
        }
        this.method3841(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2448 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2448) * class197.field2270;
        if (var16 / var14 >= Statics.field2276) {
            return;
        }
        int var17 = (this.field2448 + var15) * class197.field2270;
        if (var17 / var14 <= Statics.field2275) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2448 * arg1 >> 16;
        int var20 = (var18 + var19) * class197.field2270;
        if (var20 / var14 <= Statics.field2274) {
            return;
        }
        int var21 = (this.field2359 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class197.field2270;
        if (var22 / var14 >= Statics.field2278) {
            return;
        }
        int var23 = (this.field2359 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field2439 > 0;
        int var27 = class207.method2611();
        int var28 = class207.method3016();
        boolean var29 = class207.method63();
        boolean var30 = arg8 != 0L && !class207.method193(arg8);
        boolean var32 = false;
        if (var30 && var29) {
            boolean var33 = false;
            if (field2480) {
                boolean var35;
                if (class207.method63()) {
                    if (!class207.field2492) {
                        int var36 = Statics.field2317;
                        int var37 = Statics.field2305;
                        int var38 = Statics.field2346;
                        int var39 = Statics.field2320;
                        byte var40 = 50;
                        short var41 = 3500;
                        int var42 = (class207.field2494 - Statics.field2269) * var40 / class197.field2270;
                        int var43 = (class207.field2498 - Statics.field2272) * var40 / class197.field2270;
                        int var44 = (class207.field2494 - Statics.field2269) * var41 / class197.field2270;
                        int var45 = (class207.field2498 - Statics.field2272) * var41 / class197.field2270;
                        int var46 = class197.method3515(var43, var40, var37, var36);
                        int var47 = class197.method3573(var43, var40, var37, var36);
                        int var49 = class197.method3515(var45, var41, var37, var36);
                        int var50 = class197.method3573(var45, var41, var37, var36);
                        int var52 = class197.method3534(var42, var47, var39, var38);
                        int var53 = class197.method3542(var42, var47, var39, var38);
                        int var55 = class197.method3534(var44, var50, var39, var38);
                        int var56 = class197.method3542(var44, var50, var39, var38);
                        Statics.field21 = (var52 + var55) / 2;
                        Statics.field2491 = (var46 + var49) / 2;
                        Statics.field4245 = (var53 + var56) / 2;
                        Statics.field1443 = (var55 - var52) / 2;
                        Statics.field69 = (var49 - var46) / 2;
                        Statics.field2147 = (var56 - var53) / 2;
                        Statics.field1524 = Math.abs(Statics.field1443);
                        Statics.field1630 = Math.abs(Statics.field69);
                        Statics.field181 = Math.abs(Statics.field2147);
                    }
                    int var58 = this.field2451 + arg5;
                    int var59 = this.field2481 + arg6;
                    int var60 = this.field2432 + arg7;
                    int var61 = this.field2454;
                    int var62 = this.field2455;
                    int var63 = this.field2465;
                    int var64 = Statics.field21 - var58;
                    int var65 = Statics.field2491 - var59;
                    int var66 = Statics.field4245 - var60;
                    if (Math.abs(var64) > Statics.field1524 + var61) {
                        var35 = false;
                    } else if (Math.abs(var65) > Statics.field1630 + var62) {
                        var35 = false;
                    } else if (Math.abs(var66) > Statics.field181 + var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field69 * var66 - Statics.field2147 * var65) > Statics.field181 * var62 + Statics.field1630 * var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field2147 * var64 - Statics.field1443 * var66) > Statics.field181 * var61 + Statics.field1524 * var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1443 * var65 - Statics.field69 * var64) > Statics.field1630 * var61 + Statics.field1524 * var62) {
                        var35 = false;
                    } else {
                        var35 = true;
                    }
                } else {
                    var35 = false;
                }
                var33 = var35;
            } else {
                int var67 = var12 - var13;
                if (var67 <= 50) {
                    var67 = 50;
                }
                int var68;
                int var69;
                if (var15 > 0) {
                    var68 = var16 / var14;
                    var69 = var17 / var67;
                } else {
                    var69 = var17 / var14;
                    var68 = var16 / var67;
                }
                int var70;
                int var71;
                if (var18 > 0) {
                    var70 = var22 / var14;
                    var71 = var20 / var67;
                } else {
                    var71 = var20 / var14;
                    var70 = var22 / var67;
                }
                int var72 = var27 - Statics.field2269;
                int var73 = var28 - Statics.field2272;
                if (var72 > var68 && var72 < var69 && var73 > var70 && var73 < var71) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field2445) {
                    class207.field2490[++class207.field2501 - 1] = arg8;
                } else {
                    var32 = true;
                }
            }
        }
        int var76 = Statics.field2269;
        int var77 = Statics.field2272;
        int var78 = 0;
        int var79 = 0;
        if (arg0 != 0) {
            var78 = field2461[arg0];
            var79 = field2484[arg0];
        }
        for (int var80 = 0; var80 < this.field2466; var80++) {
            int var81 = this.field2430[var80];
            int var82 = this.field2425[var80];
            int var83 = this.field2458[var80];
            if (arg0 != 0) {
                int var84 = var78 * var83 + var79 * var81 >> 16;
                var83 = var79 * var83 - var78 * var81 >> 16;
                var81 = var84;
            }
            int var85 = arg5 + var81;
            int var86 = arg6 + var82;
            int var87 = arg7 + var83;
            int var88 = arg3 * var87 + arg4 * var85 >> 16;
            int var89 = arg4 * var87 - arg3 * var85 >> 16;
            int var91 = arg2 * var86 - arg1 * var89 >> 16;
            int var92 = arg1 * var86 + arg2 * var89 >> 16;
            field2462[var80] = var92 - var12;
            if (var92 >= 50) {
                field2460[var80] = class197.field2270 * var88 / var92 + var76;
                field2472[var80] = class197.field2270 * var91 / var92 + var77;
            } else {
                field2460[var80] = -5000;
                var24 = true;
            }
            if (var26) {
                field2436[var80] = var88;
                field2464[var80] = var91;
                field2478[var80] = var92;
            }
        }
        try {
            this.method3866(var24, var32, this.field2445, arg8);
        } catch (Exception var95) {
        }
    }

    @ObfuscatedName("gd.n(ZZZJ)V")
    public final void method3866(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2433 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field2433; var6++) {
            field2467[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field2427; var8++) {
            if (this.field2487[var8] != -2) {
                int var9 = this.field2428[var8];
                int var10 = this.field2434[var8];
                int var11 = this.field2447[var8];
                int var12 = field2460[var9];
                int var13 = field2460[var10];
                int var14 = field2460[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2436[var9];
                    int var16 = field2436[var10];
                    int var17 = field2436[var11];
                    int var18 = field2464[var9];
                    int var19 = field2464[var10];
                    int var20 = field2464[var11];
                    int var21 = field2478[var9];
                    int var22 = field2478[var10];
                    int var23 = field2478[var11];
                    int var24 = var15 - var16;
                    int var25 = var17 - var16;
                    int var26 = var18 - var19;
                    int var27 = var20 - var19;
                    int var28 = var21 - var22;
                    int var29 = var23 - var22;
                    int var30 = var26 * var29 - var27 * var28;
                    int var31 = var25 * var28 - var24 * var29;
                    int var32 = var24 * var27 - var25 * var26;
                    if (var22 * var32 + var16 * var30 + var19 * var31 > 0) {
                        field2459[var8] = true;
                        int var33 = (field2462[var9] + field2462[var10] + field2462[var11]) / 3 + this.field2419;
                        field2452[var33][field2467[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class207.method5648(field2472[var9], field2472[var10], field2472[var11], var12, var13, var14, var7)) {
                        class207.field2490[++class207.field2501 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field2472[var11] - field2472[var10]) * (var12 - var13) - (field2472[var9] - field2472[var10]) * (var14 - var13) > 0) {
                        field2459[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field2273 && var13 <= Statics.field2273 && var14 <= Statics.field2273) {
                            field2470[var8] = false;
                        } else {
                            field2470[var8] = true;
                        }
                        int var36 = (field2462[var9] + field2462[var10] + field2462[var11]) / 3 + this.field2419;
                        field2452[var36][field2467[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field2456 == null) {
            for (int var37 = this.field2433 - 1; var37 >= 0; var37--) {
                int var38 = field2467[var37];
                if (var38 > 0) {
                    int[] var39 = field2452[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method3857(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field2469[var41] = 0;
            field2473[var41] = 0;
        }
        for (int var42 = this.field2433 - 1; var42 >= 0; var42--) {
            int var43 = field2467[var42];
            if (var43 > 0) {
                int[] var44 = field2452[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field2456[var46];
                    int var48 = field2469[var47]++;
                    field2468[var47][var48] = var46;
                    if (var47 < 10) {
                        field2473[var47] += var42;
                    } else if (var47 == 10) {
                        field2471[var48] = var42;
                    } else {
                        field2423[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field2469[1] > 0 || field2469[2] > 0) {
            var49 = (field2473[1] + field2473[2]) / (field2469[1] + field2469[2]);
        }
        int var50 = 0;
        if (field2469[3] > 0 || field2469[4] > 0) {
            var50 = (field2473[3] + field2473[4]) / (field2469[3] + field2469[4]);
        }
        int var51 = 0;
        if (field2469[6] > 0 || field2469[8] > 0) {
            var51 = (field2473[6] + field2473[8]) / (field2469[6] + field2469[8]);
        }
        int var52 = 0;
        int var53 = field2469[10];
        int[] var54 = field2468[10];
        int[] var55 = field2471;
        if (var52 == var53) {
            var52 = 0;
            var53 = field2469[11];
            var54 = field2468[11];
            var55 = field2423;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method3857(var54[var52++]);
                if (var52 == var53 && field2468[11] != var54) {
                    var52 = 0;
                    var53 = field2469[11];
                    var54 = field2468[11];
                    var55 = field2423;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method3857(var54[var52++]);
                if (var52 == var53 && field2468[11] != var54) {
                    var52 = 0;
                    var53 = field2469[11];
                    var54 = field2468[11];
                    var55 = field2423;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method3857(var54[var52++]);
                if (var52 == var53 && field2468[11] != var54) {
                    var52 = 0;
                    var53 = field2469[11];
                    var54 = field2468[11];
                    var55 = field2423;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field2469[var57];
            int[] var59 = field2468[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method3857(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method3857(var54[var52++]);
            if (var52 == var53 && field2468[11] != var54) {
                var52 = 0;
                var54 = field2468[11];
                var53 = field2469[11];
                var55 = field2423;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("gd.l(I)V")
    public final void method3857(int arg0) {
        if (field2459[arg0]) {
            this.method3858(arg0);
            return;
        }
        int var2 = this.field2428[arg0];
        int var3 = this.field2434[arg0];
        int var4 = this.field2447[arg0];
        class197.field2263 = field2470[arg0];
        if (this.field2435 == null) {
            class197.field2262 = 0;
        } else {
            class197.field2262 = this.field2435[arg0] & 0xFF;
        }
        if (this.field2437 != null && this.field2437[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2449 == null || this.field2449[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2449[arg0] & 0xFF;
                var6 = this.field2450[var5];
                var7 = this.field2441[var5];
                var8 = this.field2442[var5];
            }
            if (this.field2487[arg0] == -1) {
                class197.method3506(field2472[var2], field2472[var3], field2472[var4], field2460[var2], field2460[var3], field2460[var4], this.field2431[arg0], this.field2431[arg0], this.field2431[arg0], field2436[var6], field2436[var7], field2436[var8], field2464[var6], field2464[var7], field2464[var8], field2478[var6], field2478[var7], field2478[var8], this.field2437[arg0]);
            } else {
                class197.method3506(field2472[var2], field2472[var3], field2472[var4], field2460[var2], field2460[var3], field2460[var4], this.field2431[arg0], this.field2426[arg0], this.field2487[arg0], field2436[var6], field2436[var7], field2436[var8], field2464[var6], field2464[var7], field2464[var8], field2478[var6], field2478[var7], field2478[var8], this.field2437[arg0]);
            }
        } else if (this.field2487[arg0] == -1) {
            class197.method3504(field2472[var2], field2472[var3], field2472[var4], field2460[var2], field2460[var3], field2460[var4], field2485[this.field2431[arg0]]);
        } else {
            class197.method3502(field2472[var2], field2472[var3], field2472[var4], field2460[var2], field2460[var3], field2460[var4], this.field2431[arg0], this.field2426[arg0], this.field2487[arg0]);
        }
    }

    @ObfuscatedName("gd.w(I)V")
    public final void method3858(int arg0) {
        int var2 = Statics.field2269;
        int var3 = Statics.field2272;
        int var4 = 0;
        int var5 = this.field2428[arg0];
        int var6 = this.field2434[arg0];
        int var7 = this.field2447[arg0];
        int var8 = field2478[var5];
        int var9 = field2478[var6];
        int var10 = field2478[var7];
        if (this.field2435 == null) {
            class197.field2262 = 0;
        } else {
            class197.field2262 = this.field2435[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2474[var4] = field2460[var5];
            field2475[var4] = field2472[var5];
            field2476[var4++] = this.field2431[arg0];
        } else {
            int var11 = field2436[var5];
            int var12 = field2464[var5];
            int var13 = this.field2431[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2486[var10 - var8];
                field2474[var4] = (((field2436[var7] - var11) * var14 >> 16) + var11) * class197.field2270 / 50 + var2;
                field2475[var4] = (((field2464[var7] - var12) * var14 >> 16) + var12) * class197.field2270 / 50 + var3;
                field2476[var4++] = ((this.field2487[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2486[var9 - var8];
                field2474[var4] = (((field2436[var6] - var11) * var15 >> 16) + var11) * class197.field2270 / 50 + var2;
                field2475[var4] = (((field2464[var6] - var12) * var15 >> 16) + var12) * class197.field2270 / 50 + var3;
                field2476[var4++] = ((this.field2426[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2474[var4] = field2460[var6];
            field2475[var4] = field2472[var6];
            field2476[var4++] = this.field2426[arg0];
        } else {
            int var16 = field2436[var6];
            int var17 = field2464[var6];
            int var18 = this.field2426[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2486[var8 - var9];
                field2474[var4] = (((field2436[var5] - var16) * var19 >> 16) + var16) * class197.field2270 / 50 + var2;
                field2475[var4] = (((field2464[var5] - var17) * var19 >> 16) + var17) * class197.field2270 / 50 + var3;
                field2476[var4++] = ((this.field2431[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2486[var10 - var9];
                field2474[var4] = (((field2436[var7] - var16) * var20 >> 16) + var16) * class197.field2270 / 50 + var2;
                field2475[var4] = (((field2464[var7] - var17) * var20 >> 16) + var17) * class197.field2270 / 50 + var3;
                field2476[var4++] = ((this.field2487[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2474[var4] = field2460[var7];
            field2475[var4] = field2472[var7];
            field2476[var4++] = this.field2487[arg0];
        } else {
            int var21 = field2436[var7];
            int var22 = field2464[var7];
            int var23 = this.field2487[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2486[var9 - var10];
                field2474[var4] = (((field2436[var6] - var21) * var24 >> 16) + var21) * class197.field2270 / 50 + var2;
                field2475[var4] = (((field2464[var6] - var22) * var24 >> 16) + var22) * class197.field2270 / 50 + var3;
                field2476[var4++] = ((this.field2426[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2486[var8 - var10];
                field2474[var4] = (((field2436[var5] - var21) * var25 >> 16) + var21) * class197.field2270 / 50 + var2;
                field2475[var4] = (((field2464[var5] - var22) * var25 >> 16) + var22) * class197.field2270 / 50 + var3;
                field2476[var4++] = ((this.field2431[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2474[0];
        int var27 = field2474[1];
        int var28 = field2474[2];
        int var29 = field2475[0];
        int var30 = field2475[1];
        int var31 = field2475[2];
        class197.field2263 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2273 || var27 > Statics.field2273 || var28 > Statics.field2273) {
                class197.field2263 = true;
            }
            if (this.field2437 != null && this.field2437[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2449 == null || this.field2449[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2449[arg0] & 0xFF;
                    var33 = this.field2450[var32];
                    var34 = this.field2441[var32];
                    var35 = this.field2442[var32];
                }
                if (this.field2487[arg0] == -1) {
                    class197.method3506(var29, var30, var31, var26, var27, var28, this.field2431[arg0], this.field2431[arg0], this.field2431[arg0], field2436[var33], field2436[var34], field2436[var35], field2464[var33], field2464[var34], field2464[var35], field2478[var33], field2478[var34], field2478[var35], this.field2437[arg0]);
                } else {
                    class197.method3506(var29, var30, var31, var26, var27, var28, field2476[0], field2476[1], field2476[2], field2436[var33], field2436[var34], field2436[var35], field2464[var33], field2464[var34], field2464[var35], field2478[var33], field2478[var34], field2478[var35], this.field2437[arg0]);
                }
            } else if (this.field2487[arg0] == -1) {
                class197.method3504(var29, var30, var31, var26, var27, var28, field2485[this.field2431[arg0]]);
            } else {
                class197.method3502(var29, var30, var31, var26, var27, var28, field2476[0], field2476[1], field2476[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2273 || var27 > Statics.field2273 || var28 > Statics.field2273 || field2474[3] < 0 || field2474[3] > Statics.field2273) {
            class197.field2263 = true;
        }
        if (this.field2437 != null && this.field2437[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2449 == null || this.field2449[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2449[arg0] & 0xFF;
                var37 = this.field2450[var36];
                var38 = this.field2441[var36];
                var39 = this.field2442[var36];
            }
            short var40 = this.field2437[arg0];
            if (this.field2487[arg0] == -1) {
                class197.method3506(var29, var30, var31, var26, var27, var28, this.field2431[arg0], this.field2431[arg0], this.field2431[arg0], field2436[var37], field2436[var38], field2436[var39], field2464[var37], field2464[var38], field2464[var39], field2478[var37], field2478[var38], field2478[var39], var40);
                class197.method3506(var29, var31, field2475[3], var26, var28, field2474[3], this.field2431[arg0], this.field2431[arg0], this.field2431[arg0], field2436[var37], field2436[var38], field2436[var39], field2464[var37], field2464[var38], field2464[var39], field2478[var37], field2478[var38], field2478[var39], var40);
            } else {
                class197.method3506(var29, var30, var31, var26, var27, var28, field2476[0], field2476[1], field2476[2], field2436[var37], field2436[var38], field2436[var39], field2464[var37], field2464[var38], field2464[var39], field2478[var37], field2478[var38], field2478[var39], var40);
                class197.method3506(var29, var31, field2475[3], var26, var28, field2474[3], field2476[0], field2476[2], field2476[3], field2436[var37], field2436[var38], field2436[var39], field2464[var37], field2464[var38], field2464[var39], field2478[var37], field2478[var38], field2478[var39], var40);
            }
        } else if (this.field2487[arg0] == -1) {
            int var41 = field2485[this.field2431[arg0]];
            class197.method3504(var29, var30, var31, var26, var27, var28, var41);
            class197.method3504(var29, var31, field2475[3], var26, var28, field2474[3], var41);
        } else {
            class197.method3502(var29, var30, var31, var26, var27, var28, field2476[0], field2476[1], field2476[2]);
            class197.method3502(var29, var31, field2475[3], var26, var28, field2474[3], field2476[0], field2476[2], field2476[3]);
        }
    }
}
