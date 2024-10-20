package deob;

@ObfuscatedName("gr")
public class class205 extends class199 {

    @ObfuscatedName("gr.v")
    public static class205 field2433 = new class205();

    @ObfuscatedName("gr.n")
    public static byte[] field2424 = new byte[1];

    @ObfuscatedName("gr.f")
    public static class205 field2425 = new class205();

    @ObfuscatedName("gr.y")
    public static byte[] field2487 = new byte[1];

    @ObfuscatedName("gr.p")
    public int field2427 = 0;

    @ObfuscatedName("gr.j")
    public int[] field2428;

    @ObfuscatedName("gr.r")
    public int[] field2429;

    @ObfuscatedName("gr.b")
    public int[] field2447;

    @ObfuscatedName("gr.d")
    public int field2481 = 0;

    @ObfuscatedName("gr.s")
    public int[] field2432;

    @ObfuscatedName("gr.u")
    public int[] field2477;

    @ObfuscatedName("gr.l")
    public int[] field2434;

    @ObfuscatedName("gr.o")
    public int[] field2431;

    @ObfuscatedName("gr.c")
    public int[] field2436;

    @ObfuscatedName("gr.e")
    public int[] field2437;

    @ObfuscatedName("gr.g")
    public byte[] field2459;

    @ObfuscatedName("gr.a")
    public byte[] field2439;

    @ObfuscatedName("gr.k")
    public byte[] field2440;

    @ObfuscatedName("gr.m")
    public short[] field2441;

    @ObfuscatedName("gr.x")
    public byte field2442 = 0;

    @ObfuscatedName("gr.z")
    public int field2443 = 0;

    @ObfuscatedName("gr.w")
    public int[] field2444;

    @ObfuscatedName("gr.t")
    public int[] field2445;

    @ObfuscatedName("gr.h")
    public int[] field2469;

    @ObfuscatedName("gr.q")
    public int[][] field2488;

    @ObfuscatedName("gr.i")
    public int[][] field2448;

    @ObfuscatedName("gr.ae")
    public boolean field2449 = false;

    @ObfuscatedName("gr.ap")
    public int field2450;

    @ObfuscatedName("gr.ab")
    public int field2455;

    @ObfuscatedName("gr.al")
    public int field2452;

    @ObfuscatedName("gr.ad")
    public int field2465;

    @ObfuscatedName("gr.ai")
    public int field2454;

    @ObfuscatedName("gr.ar")
    public int field2430;

    @ObfuscatedName("gr.ag")
    public int field2453;

    @ObfuscatedName("gr.ax")
    public int field2471;

    @ObfuscatedName("gr.as")
    public int field2451 = -1;

    @ObfuscatedName("gr.aj")
    public int field2458 = -1;

    @ObfuscatedName("gr.am")
    public int field2462 = -1;

    @ObfuscatedName("gr.av")
    public static boolean[] field2456 = new boolean[4700];

    @ObfuscatedName("gr.ac")
    public static boolean[] field2486 = new boolean[4700];

    @ObfuscatedName("gr.at")
    public static int[] field2464 = new int[4700];

    @ObfuscatedName("gr.ah")
    public static int[] field2460 = new int[4700];

    @ObfuscatedName("gr.ao")
    public static int[] field2466 = new int[4700];

    @ObfuscatedName("gr.aq")
    public static int[] field2446 = new int[4700];

    @ObfuscatedName("gr.aw")
    public static int[] field2468 = new int[4700];

    @ObfuscatedName("gr.af")
    public static int[] field2423 = new int[4700];

    @ObfuscatedName("gr.ay")
    public static int[] field2467 = new int[1600];

    @ObfuscatedName("gr.aa")
    public static int[][] field2472 = new int[1600][512];

    @ObfuscatedName("gr.au")
    public static int[] field2473 = new int[12];

    @ObfuscatedName("gr.an")
    public static int[][] field2474 = new int[12][2000];

    @ObfuscatedName("gr.bd")
    public static int[] field2475 = new int[2000];

    @ObfuscatedName("gr.bt")
    public static int[] field2476 = new int[2000];

    @ObfuscatedName("gr.bq")
    public static int[] field2435 = new int[12];

    @ObfuscatedName("gr.bu")
    public static int[] field2478 = new int[10];

    @ObfuscatedName("gr.bl")
    public static int[] field2490 = new int[10];

    @ObfuscatedName("gr.bv")
    public static int[] field2480 = new int[10];

    @ObfuscatedName("gr.bs")
    public static boolean field2484 = true;

    @ObfuscatedName("gr.ba")
    public static int[] field2479 = class196.field2275;

    @ObfuscatedName("gr.be")
    public static int[] field2438 = class196.field2286;

    @ObfuscatedName("gr.bj")
    public static int[] field2489 = class196.field2273;

    @ObfuscatedName("gr.bx")
    public static int[] field2426 = class196.field2284;

    public class205() {
    }

    public class205(class205[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2427 = 0;
        this.field2481 = 0;
        this.field2443 = 0;
        this.field2442 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class205 var8 = arg0[var7];
            if (var8 != null) {
                this.field2427 += var8.field2427;
                this.field2481 += var8.field2481;
                this.field2443 += var8.field2443;
                if (var8.field2459 == null) {
                    if (this.field2442 == -1) {
                        this.field2442 = var8.field2442;
                    }
                    if (this.field2442 != var8.field2442) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2439 != null;
                var5 |= var8.field2441 != null;
                var6 |= var8.field2440 != null;
            }
        }
        this.field2428 = new int[this.field2427];
        this.field2429 = new int[this.field2427];
        this.field2447 = new int[this.field2427];
        this.field2432 = new int[this.field2481];
        this.field2477 = new int[this.field2481];
        this.field2434 = new int[this.field2481];
        this.field2431 = new int[this.field2481];
        this.field2436 = new int[this.field2481];
        this.field2437 = new int[this.field2481];
        if (var3) {
            this.field2459 = new byte[this.field2481];
        }
        if (var4) {
            this.field2439 = new byte[this.field2481];
        }
        if (var5) {
            this.field2441 = new short[this.field2481];
        }
        if (var6) {
            this.field2440 = new byte[this.field2481];
        }
        if (this.field2443 > 0) {
            this.field2444 = new int[this.field2443];
            this.field2445 = new int[this.field2443];
            this.field2469 = new int[this.field2443];
        }
        this.field2427 = 0;
        this.field2481 = 0;
        this.field2443 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class205 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2481; var11++) {
                    this.field2432[this.field2481] = var10.field2432[var11] + this.field2427;
                    this.field2477[this.field2481] = var10.field2477[var11] + this.field2427;
                    this.field2434[this.field2481] = var10.field2434[var11] + this.field2427;
                    this.field2431[this.field2481] = var10.field2431[var11];
                    this.field2436[this.field2481] = var10.field2436[var11];
                    this.field2437[this.field2481] = var10.field2437[var11];
                    if (var3) {
                        if (var10.field2459 == null) {
                            this.field2459[this.field2481] = var10.field2442;
                        } else {
                            this.field2459[this.field2481] = var10.field2459[var11];
                        }
                    }
                    if (var4 && var10.field2439 != null) {
                        this.field2439[this.field2481] = var10.field2439[var11];
                    }
                    if (var5) {
                        if (var10.field2441 == null) {
                            this.field2441[this.field2481] = -1;
                        } else {
                            this.field2441[this.field2481] = var10.field2441[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2440 == null || var10.field2440[var11] == -1) {
                            this.field2440[this.field2481] = -1;
                        } else {
                            this.field2440[this.field2481] = (byte) (var10.field2440[var11] + this.field2443);
                        }
                    }
                    this.field2481++;
                }
                for (int var12 = 0; var12 < var10.field2443; var12++) {
                    this.field2444[this.field2443] = var10.field2444[var12] + this.field2427;
                    this.field2445[this.field2443] = var10.field2445[var12] + this.field2427;
                    this.field2469[this.field2443] = var10.field2469[var12] + this.field2427;
                    this.field2443++;
                }
                for (int var13 = 0; var13 < var10.field2427; var13++) {
                    this.field2428[this.field2427] = var10.field2428[var13];
                    this.field2429[this.field2427] = var10.field2429[var13];
                    this.field2447[this.field2427] = var10.field2447[var13];
                    this.field2427++;
                }
            }
        }
    }

    @ObfuscatedName("gr.v([[IIIIZI)Lgr;")
    public class205 method3786(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3791();
        int var7 = arg1 - this.field2452;
        int var8 = this.field2452 + arg1;
        int var9 = arg3 - this.field2452;
        int var10 = this.field2452 + arg3;
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
        class205 var15;
        if (arg4) {
            var15 = new class205();
            var15.field2427 = this.field2427;
            var15.field2481 = this.field2481;
            var15.field2443 = this.field2443;
            var15.field2428 = this.field2428;
            var15.field2447 = this.field2447;
            var15.field2432 = this.field2432;
            var15.field2477 = this.field2477;
            var15.field2434 = this.field2434;
            var15.field2431 = this.field2431;
            var15.field2436 = this.field2436;
            var15.field2437 = this.field2437;
            var15.field2459 = this.field2459;
            var15.field2439 = this.field2439;
            var15.field2440 = this.field2440;
            var15.field2441 = this.field2441;
            var15.field2442 = this.field2442;
            var15.field2444 = this.field2444;
            var15.field2445 = this.field2445;
            var15.field2469 = this.field2469;
            var15.field2488 = this.field2488;
            var15.field2448 = this.field2448;
            var15.field2449 = this.field2449;
            var15.field2429 = new int[var15.field2427];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2427; var16++) {
                int var17 = this.field2428[var16] + arg1;
                int var18 = this.field2447[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2429[var16] = this.field2429[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2427; var26++) {
                int var27 = (-this.field2429[var26] << 16) / this.field2360;
                if (var27 < arg5) {
                    int var28 = this.field2428[var26] + arg1;
                    int var29 = this.field2447[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2429[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2429[var26];
                }
            }
        }
        var15.method3794();
        return var15;
    }

    @ObfuscatedName("gr.f(Z)Lgr;")
    public class205 method3787(boolean arg0) {
        if (!arg0 && field2424.length < this.field2481) {
            field2424 = new byte[this.field2481 + 100];
        }
        return this.method3789(arg0, field2433, field2424);
    }

    @ObfuscatedName("gr.y(Z)Lgr;")
    public class205 method3797(boolean arg0) {
        if (!arg0 && field2487.length < this.field2481) {
            field2487 = new byte[this.field2481 + 100];
        }
        return this.method3789(arg0, field2425, field2487);
    }

    @ObfuscatedName("gr.b(ZLgr;[B)Lgr;")
    public class205 method3789(boolean arg0, class205 arg1, byte[] arg2) {
        arg1.field2427 = this.field2427;
        arg1.field2481 = this.field2481;
        arg1.field2443 = this.field2443;
        if (arg1.field2428 == null || arg1.field2428.length < this.field2427) {
            arg1.field2428 = new int[this.field2427 + 100];
            arg1.field2429 = new int[this.field2427 + 100];
            arg1.field2447 = new int[this.field2427 + 100];
        }
        for (int var4 = 0; var4 < this.field2427; var4++) {
            arg1.field2428[var4] = this.field2428[var4];
            arg1.field2429[var4] = this.field2429[var4];
            arg1.field2447[var4] = this.field2447[var4];
        }
        if (arg0) {
            arg1.field2439 = this.field2439;
        } else {
            arg1.field2439 = arg2;
            if (this.field2439 == null) {
                for (int var5 = 0; var5 < this.field2481; var5++) {
                    arg1.field2439[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2481; var6++) {
                    arg1.field2439[var6] = this.field2439[var6];
                }
            }
        }
        arg1.field2432 = this.field2432;
        arg1.field2477 = this.field2477;
        arg1.field2434 = this.field2434;
        arg1.field2431 = this.field2431;
        arg1.field2436 = this.field2436;
        arg1.field2437 = this.field2437;
        arg1.field2459 = this.field2459;
        arg1.field2440 = this.field2440;
        arg1.field2441 = this.field2441;
        arg1.field2442 = this.field2442;
        arg1.field2444 = this.field2444;
        arg1.field2445 = this.field2445;
        arg1.field2469 = this.field2469;
        arg1.field2488 = this.field2488;
        arg1.field2448 = this.field2448;
        arg1.field2449 = this.field2449;
        arg1.method3794();
        return arg1;
    }

    @ObfuscatedName("gr.d(I)V")
    public void method3822(int arg0) {
        if (this.field2451 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2438[arg0];
        int var9 = field2479[arg0];
        for (int var10 = 0; var10 < this.field2427; var10++) {
            int var11 = class196.method3509(this.field2428[var10], this.field2447[var10], var8, var9);
            int var12 = this.field2429[var10];
            int var13 = class196.method3510(this.field2428[var10], this.field2447[var10], var8, var9);
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
        this.field2430 = (var2 + var5) / 2;
        this.field2453 = (var3 + var6) / 2;
        this.field2471 = (var4 + var7) / 2;
        this.field2451 = (var5 - var2 + 1) / 2;
        this.field2458 = (var6 - var3 + 1) / 2;
        this.field2462 = (var7 - var4 + 1) / 2;
        if (this.field2451 < 32) {
            this.field2451 = 32;
        }
        if (this.field2462 < 32) {
            this.field2462 = 32;
        }
        if (this.field2449) {
            this.field2451 += 8;
            this.field2462 += 8;
        }
    }

    @ObfuscatedName("gr.s()V")
    public void method3791() {
        if (this.field2450 == 1) {
            return;
        }
        this.field2450 = 1;
        this.field2360 = 0;
        this.field2455 = 0;
        this.field2452 = 0;
        for (int var1 = 0; var1 < this.field2427; var1++) {
            int var2 = this.field2428[var1];
            int var3 = this.field2429[var1];
            int var4 = this.field2447[var1];
            if (-var3 > this.field2360) {
                this.field2360 = -var3;
            }
            if (var3 > this.field2455) {
                this.field2455 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2452) {
                this.field2452 = var5;
            }
        }
        this.field2452 = (int) (Math.sqrt((double) this.field2452) + 0.99D);
        this.field2454 = (int) (Math.sqrt((double) (this.field2360 * this.field2360 + this.field2452 * this.field2452)) + 0.99D);
        this.field2465 = this.field2454 + (int) (Math.sqrt((double) (this.field2455 * this.field2455 + this.field2452 * this.field2452)) + 0.99D);
    }

    @ObfuscatedName("gr.u()V")
    public void method3792() {
        if (this.field2450 == 2) {
            return;
        }
        this.field2450 = 2;
        this.field2452 = 0;
        for (int var1 = 0; var1 < this.field2427; var1++) {
            int var2 = this.field2428[var1];
            int var3 = this.field2429[var1];
            int var4 = this.field2447[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2452) {
                this.field2452 = var5;
            }
        }
        this.field2452 = (int) (Math.sqrt((double) this.field2452) + 0.99D);
        this.field2454 = this.field2452;
        this.field2465 = this.field2452 + this.field2452;
    }

    @ObfuscatedName("gr.l()I")
    public int method3818() {
        this.method3791();
        return this.field2452;
    }

    @ObfuscatedName("gr.o()V")
    public void method3794() {
        this.field2450 = 0;
        this.field2451 = -1;
    }

    @ObfuscatedName("gr.c(Lgd;I)V")
    public void method3795(class201 arg0, int arg1) {
        if (this.field2488 == null || arg1 == -1) {
            return;
        }
        class194 var3 = arg0.field2369[arg1];
        class197 var4 = var3.field2228;
        Statics.field2463 = 0;
        Statics.field2482 = 0;
        Statics.field2483 = 0;
        for (int var5 = 0; var5 < var3.field2231; var5++) {
            int var6 = var3.field2229[var5];
            this.method3817(var4.field2289[var6], var4.field2290[var6], var3.field2232[var5], var3.field2233[var5], var3.field2234[var5]);
        }
        this.method3794();
    }

    @ObfuscatedName("gr.e(Lgd;ILgd;I[I)V")
    public void method3832(class201 arg0, int arg1, class201 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method3795(arg0, arg1);
            return;
        }
        class194 var6 = arg0.field2369[arg1];
        class194 var7 = arg2.field2369[arg3];
        class197 var8 = var6.field2228;
        Statics.field2463 = 0;
        Statics.field2482 = 0;
        Statics.field2483 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2231; var11++) {
            int var12 = var6.field2229[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2289[var12] == 0) {
                this.method3817(var8.field2289[var12], var8.field2290[var12], var6.field2232[var11], var6.field2233[var11], var6.field2234[var11]);
            }
        }
        Statics.field2463 = 0;
        Statics.field2482 = 0;
        Statics.field2483 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2231; var15++) {
            int var16 = var7.field2229[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2289[var16] == 0) {
                this.method3817(var8.field2289[var16], var8.field2290[var16], var7.field2232[var15], var7.field2233[var15], var7.field2234[var15]);
            }
        }
        this.method3794();
    }

    @ObfuscatedName("gr.g(I[IIII)V")
    public void method3817(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2463 = 0;
            Statics.field2482 = 0;
            Statics.field2483 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2488.length) {
                    int[] var10 = this.field2488[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2463 += this.field2428[var12];
                        Statics.field2482 += this.field2429[var12];
                        Statics.field2483 += this.field2447[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2463 = Statics.field2463 / var7 + arg2;
                Statics.field2482 = Statics.field2482 / var7 + arg3;
                Statics.field2483 = Statics.field2483 / var7 + arg4;
            } else {
                Statics.field2463 = arg2;
                Statics.field2482 = arg3;
                Statics.field2483 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2488.length) {
                    int[] var15 = this.field2488[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2428[var17] += arg2;
                        this.field2429[var17] += arg3;
                        this.field2447[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2488.length) {
                    int[] var20 = this.field2488[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2428[var22] -= Statics.field2463;
                        this.field2429[var22] -= Statics.field2482;
                        this.field2447[var22] -= Statics.field2483;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2479[var25];
                            int var27 = field2438[var25];
                            int var28 = this.field2429[var22] * var26 + this.field2428[var22] * var27 >> 16;
                            this.field2429[var22] = this.field2429[var22] * var27 - this.field2428[var22] * var26 >> 16;
                            this.field2428[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2479[var23];
                            int var30 = field2438[var23];
                            int var31 = this.field2429[var22] * var30 - this.field2447[var22] * var29 >> 16;
                            this.field2447[var22] = this.field2447[var22] * var30 + this.field2429[var22] * var29 >> 16;
                            this.field2429[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2479[var24];
                            int var33 = field2438[var24];
                            int var34 = this.field2447[var22] * var32 + this.field2428[var22] * var33 >> 16;
                            this.field2447[var22] = this.field2447[var22] * var33 - this.field2428[var22] * var32 >> 16;
                            this.field2428[var22] = var34;
                        }
                        this.field2428[var22] += Statics.field2463;
                        this.field2429[var22] += Statics.field2482;
                        this.field2447[var22] += Statics.field2483;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2488.length) {
                    int[] var37 = this.field2488[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2428[var39] -= Statics.field2463;
                        this.field2429[var39] -= Statics.field2482;
                        this.field2447[var39] -= Statics.field2483;
                        this.field2428[var39] = this.field2428[var39] * arg2 / 128;
                        this.field2429[var39] = this.field2429[var39] * arg3 / 128;
                        this.field2447[var39] = this.field2447[var39] * arg4 / 128;
                        this.field2428[var39] += Statics.field2463;
                        this.field2429[var39] += Statics.field2482;
                        this.field2447[var39] += Statics.field2483;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2448 != null && this.field2439 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2448.length) {
                    int[] var42 = this.field2448[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2439[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2439[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gr.a()V")
    public void method3798() {
        for (int var1 = 0; var1 < this.field2427; var1++) {
            int var2 = this.field2428[var1];
            this.field2428[var1] = this.field2447[var1];
            this.field2447[var1] = -var2;
        }
        this.method3794();
    }

    @ObfuscatedName("gr.k()V")
    public void method3843() {
        for (int var1 = 0; var1 < this.field2427; var1++) {
            this.field2428[var1] = -this.field2428[var1];
            this.field2447[var1] = -this.field2447[var1];
        }
        this.method3794();
    }

    @ObfuscatedName("gr.m()V")
    public void method3800() {
        for (int var1 = 0; var1 < this.field2427; var1++) {
            int var2 = this.field2447[var1];
            this.field2447[var1] = this.field2428[var1];
            this.field2428[var1] = -var2;
        }
        this.method3794();
    }

    @ObfuscatedName("gr.x(I)V")
    public void method3801(int arg0) {
        int var2 = field2479[arg0];
        int var3 = field2438[arg0];
        for (int var4 = 0; var4 < this.field2427; var4++) {
            int var5 = this.field2429[var4] * var3 - this.field2447[var4] * var2 >> 16;
            this.field2447[var4] = this.field2447[var4] * var3 + this.field2429[var4] * var2 >> 16;
            this.field2429[var4] = var5;
        }
        this.method3794();
    }

    @ObfuscatedName("gr.z(III)V")
    public void method3802(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2427; var4++) {
            this.field2428[var4] += arg0;
            this.field2429[var4] += arg1;
            this.field2447[var4] += arg2;
        }
        this.method3794();
    }

    @ObfuscatedName("gr.w(III)V")
    public void method3803(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2427; var4++) {
            this.field2428[var4] = this.field2428[var4] * arg0 / 128;
            this.field2429[var4] = this.field2429[var4] * arg1 / 128;
            this.field2447[var4] = this.field2447[var4] * arg2 / 128;
        }
        this.method3794();
    }

    @ObfuscatedName("gr.t(IIIIIII)V")
    public final void method3855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2467[0] = -1;
        if (this.field2450 != 2 && this.field2450 != 1) {
            this.method3792();
        }
        int var8 = Statics.field2272;
        int var9 = Statics.field2265;
        int var10 = field2479[arg0];
        int var11 = field2438[arg0];
        int var12 = field2479[arg1];
        int var13 = field2438[arg1];
        int var14 = field2479[arg2];
        int var15 = field2438[arg2];
        int var16 = field2479[arg3];
        int var17 = field2438[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2427; var19++) {
            int var20 = this.field2428[var19];
            int var21 = this.field2429[var19];
            int var22 = this.field2447[var19];
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
            field2466[var19] = var30 - var18;
            field2464[var19] = class196.field2271 * var26 / var30 + var8;
            field2460[var19] = class196.field2271 * var29 / var30 + var9;
            if (this.field2443 > 0) {
                field2446[var19] = var26;
                field2468[var19] = var29;
                field2423[var19] = var30;
            }
        }
        try {
            this.method3806(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("gr.h(IIIIIIII)V")
    public final void method3847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2467[0] = -1;
        if (this.field2450 != 2 && this.field2450 != 1) {
            this.method3792();
        }
        int var9 = Statics.field2272;
        int var10 = Statics.field2265;
        int var11 = field2479[arg0];
        int var12 = field2438[arg0];
        int var13 = field2479[arg1];
        int var14 = field2438[arg1];
        int var15 = field2479[arg2];
        int var16 = field2438[arg2];
        int var17 = field2479[arg3];
        int var18 = field2438[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2427; var20++) {
            int var21 = this.field2428[var20];
            int var22 = this.field2429[var20];
            int var23 = this.field2447[var20];
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
            field2466[var20] = var31 - var19;
            field2464[var20] = class196.field2271 * var27 / arg7 + var9;
            field2460[var20] = class196.field2271 * var30 / arg7 + var10;
            if (this.field2443 > 0) {
                field2446[var20] = var27;
                field2468[var20] = var30;
                field2423[var20] = var31;
            }
        }
        try {
            this.method3806(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("gr.ct(IIIIIIIIJ)V")
    public void method3742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2467[0] = -1;
        if (this.field2450 != 1) {
            this.method3791();
        }
        this.method3822(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2452 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2452) * class196.field2271;
        if (var16 / var14 >= Statics.field2277) {
            return;
        }
        int var17 = (this.field2452 + var15) * class196.field2271;
        if (var17 / var14 <= Statics.field2276) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2452 * arg1 >> 16;
        int var20 = (var18 + var19) * class196.field2271;
        if (var20 / var14 <= Statics.field2278) {
            return;
        }
        int var21 = (this.field2360 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class196.field2271;
        if (var22 / var14 >= Statics.field2260) {
            return;
        }
        int var23 = (this.field2360 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field2443 > 0;
        int var27 = class206.method2283();
        int var28 = class206.method2093();
        boolean var29 = class206.field2494;
        boolean var31 = arg8 != 0L;
        if (var31) {
            boolean var32 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var31 = !var32;
        }
        boolean var35 = false;
        if (var31 && var29) {
            boolean var36 = false;
            if (field2484) {
                boolean var38 = class206.field2494;
                boolean var39;
                if (var38) {
                    class206.method2322();
                    int var40 = this.field2430 + arg5;
                    int var41 = this.field2453 + arg6;
                    int var42 = this.field2471 + arg7;
                    int var43 = this.field2451;
                    int var44 = this.field2458;
                    int var45 = this.field2462;
                    int var46 = Statics.field2493 - var40;
                    int var47 = Statics.field3119 - var41;
                    int var48 = Statics.field2498 - var42;
                    if (Math.abs(var46) > Statics.field1921 + var43) {
                        var39 = false;
                    } else if (Math.abs(var47) > Statics.field141 + var44) {
                        var39 = false;
                    } else if (Math.abs(var48) > Statics.field630 + var45) {
                        var39 = false;
                    } else if (Math.abs(Statics.field2083 * var48 - Statics.field3127 * var47) > Statics.field630 * var44 + Statics.field141 * var45) {
                        var39 = false;
                    } else if (Math.abs(Statics.field3127 * var46 - Statics.field2497 * var48) > Statics.field630 * var43 + Statics.field1921 * var45) {
                        var39 = false;
                    } else if (Math.abs(Statics.field2497 * var47 - Statics.field2083 * var46) > Statics.field1921 * var44 + Statics.field141 * var43) {
                        var39 = false;
                    } else {
                        var39 = true;
                    }
                } else {
                    var39 = false;
                }
                var36 = var39;
            } else {
                int var49 = var12 - var13;
                if (var49 <= 50) {
                    var49 = 50;
                }
                int var50;
                int var51;
                if (var15 > 0) {
                    var50 = var16 / var14;
                    var51 = var17 / var49;
                } else {
                    var51 = var17 / var14;
                    var50 = var16 / var49;
                }
                int var52;
                int var53;
                if (var18 > 0) {
                    var52 = var22 / var14;
                    var53 = var20 / var49;
                } else {
                    var53 = var20 / var14;
                    var52 = var22 / var49;
                }
                int var54 = var27 - Statics.field2272;
                int var55 = var28 - Statics.field2265;
                if (var54 > var50 && var54 < var51 && var55 > var52 && var55 < var53) {
                    var36 = true;
                }
            }
            if (var36) {
                if (this.field2449) {
                    class206.method1990(arg8);
                } else {
                    var35 = true;
                }
            }
        }
        int var56 = Statics.field2272;
        int var57 = Statics.field2265;
        int var58 = 0;
        int var59 = 0;
        if (arg0 != 0) {
            var58 = field2479[arg0];
            var59 = field2438[arg0];
        }
        for (int var60 = 0; var60 < this.field2427; var60++) {
            int var61 = this.field2428[var60];
            int var62 = this.field2429[var60];
            int var63 = this.field2447[var60];
            if (arg0 != 0) {
                int var64 = var58 * var63 + var59 * var61 >> 16;
                var63 = var59 * var63 - var58 * var61 >> 16;
                var61 = var64;
            }
            int var65 = arg5 + var61;
            int var66 = arg6 + var62;
            int var67 = arg7 + var63;
            int var68 = arg3 * var67 + arg4 * var65 >> 16;
            int var69 = arg4 * var67 - arg3 * var65 >> 16;
            int var71 = arg2 * var66 - arg1 * var69 >> 16;
            int var72 = arg1 * var66 + arg2 * var69 >> 16;
            field2466[var60] = var72 - var12;
            if (var72 >= 50) {
                field2464[var60] = class196.field2271 * var68 / var72 + var56;
                field2460[var60] = class196.field2271 * var71 / var72 + var57;
            } else {
                field2464[var60] = -5000;
                var24 = true;
            }
            if (var26) {
                field2446[var60] = var68;
                field2468[var60] = var71;
                field2423[var60] = var72;
            }
        }
        try {
            this.method3806(var24, var35, this.field2449, arg8);
        } catch (Exception var75) {
        }
    }

    @ObfuscatedName("gr.q(ZZZJ)V")
    public final void method3806(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2465 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field2465; var6++) {
            field2467[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field2481; var8++) {
            if (this.field2437[var8] != -2) {
                int var9 = this.field2432[var8];
                int var10 = this.field2477[var8];
                int var11 = this.field2434[var8];
                int var12 = field2464[var9];
                int var13 = field2464[var10];
                int var14 = field2464[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2446[var9];
                    int var16 = field2446[var10];
                    int var17 = field2446[var11];
                    int var18 = field2468[var9];
                    int var19 = field2468[var10];
                    int var20 = field2468[var11];
                    int var21 = field2423[var9];
                    int var22 = field2423[var10];
                    int var23 = field2423[var11];
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
                        field2486[var8] = true;
                        int var33 = (field2466[var9] + field2466[var10] + field2466[var11]) / 3 + this.field2454;
                        field2472[var33][field2467[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class206.method1868(field2460[var9], field2460[var10], field2460[var11], var12, var13, var14, var7)) {
                        class206.method1990(arg3);
                        arg1 = false;
                    }
                    if ((field2460[var11] - field2460[var10]) * (var12 - var13) - (field2460[var9] - field2460[var10]) * (var14 - var13) > 0) {
                        field2486[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field2264 && var13 <= Statics.field2264 && var14 <= Statics.field2264) {
                            field2456[var8] = false;
                        } else {
                            field2456[var8] = true;
                        }
                        int var34 = (field2466[var9] + field2466[var10] + field2466[var11]) / 3 + this.field2454;
                        field2472[var34][field2467[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field2459 == null) {
            for (int var35 = this.field2465 - 1; var35 >= 0; var35--) {
                int var36 = field2467[var35];
                if (var36 > 0) {
                    int[] var37 = field2472[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method3856(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field2473[var39] = 0;
            field2435[var39] = 0;
        }
        for (int var40 = this.field2465 - 1; var40 >= 0; var40--) {
            int var41 = field2467[var40];
            if (var41 > 0) {
                int[] var42 = field2472[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field2459[var44];
                    int var46 = field2473[var45]++;
                    field2474[var45][var46] = var44;
                    if (var45 < 10) {
                        field2435[var45] += var40;
                    } else if (var45 == 10) {
                        field2475[var46] = var40;
                    } else {
                        field2476[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field2473[1] > 0 || field2473[2] > 0) {
            var47 = (field2435[1] + field2435[2]) / (field2473[1] + field2473[2]);
        }
        int var48 = 0;
        if (field2473[3] > 0 || field2473[4] > 0) {
            var48 = (field2435[3] + field2435[4]) / (field2473[3] + field2473[4]);
        }
        int var49 = 0;
        if (field2473[6] > 0 || field2473[8] > 0) {
            var49 = (field2435[6] + field2435[8]) / (field2473[6] + field2473[8]);
        }
        int var50 = 0;
        int var51 = field2473[10];
        int[] var52 = field2474[10];
        int[] var53 = field2475;
        if (var50 == var51) {
            var50 = 0;
            var51 = field2473[11];
            var52 = field2474[11];
            var53 = field2476;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method3856(var52[var50++]);
                if (var50 == var51 && field2474[11] != var52) {
                    var50 = 0;
                    var51 = field2473[11];
                    var52 = field2474[11];
                    var53 = field2476;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method3856(var52[var50++]);
                if (var50 == var51 && field2474[11] != var52) {
                    var50 = 0;
                    var51 = field2473[11];
                    var52 = field2474[11];
                    var53 = field2476;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method3856(var52[var50++]);
                if (var50 == var51 && field2474[11] != var52) {
                    var50 = 0;
                    var51 = field2473[11];
                    var52 = field2474[11];
                    var53 = field2476;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field2473[var55];
            int[] var57 = field2474[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method3856(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method3856(var52[var50++]);
            if (var50 == var51 && field2474[11] != var52) {
                var50 = 0;
                var52 = field2474[11];
                var51 = field2473[11];
                var53 = field2476;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("gr.i(I)V")
    public final void method3856(int arg0) {
        if (field2486[arg0]) {
            this.method3808(arg0);
            return;
        }
        int var2 = this.field2432[arg0];
        int var3 = this.field2477[arg0];
        int var4 = this.field2434[arg0];
        class196.field2263 = field2456[arg0];
        if (this.field2439 == null) {
            class196.field2281 = 0;
        } else {
            class196.field2281 = this.field2439[arg0] & 0xFF;
        }
        if (this.field2441 != null && this.field2441[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2440 == null || this.field2440[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2440[arg0] & 0xFF;
                var6 = this.field2444[var5];
                var7 = this.field2445[var5];
                var8 = this.field2469[var5];
            }
            if (this.field2437[arg0] == -1) {
                class196.method3523(field2460[var2], field2460[var3], field2460[var4], field2464[var2], field2464[var3], field2464[var4], this.field2431[arg0], this.field2431[arg0], this.field2431[arg0], field2446[var6], field2446[var7], field2446[var8], field2468[var6], field2468[var7], field2468[var8], field2423[var6], field2423[var7], field2423[var8], this.field2441[arg0]);
            } else {
                class196.method3523(field2460[var2], field2460[var3], field2460[var4], field2464[var2], field2464[var3], field2464[var4], this.field2431[arg0], this.field2436[arg0], this.field2437[arg0], field2446[var6], field2446[var7], field2446[var8], field2468[var6], field2468[var7], field2468[var8], field2423[var6], field2423[var7], field2423[var8], this.field2441[arg0]);
            }
        } else if (this.field2437[arg0] == -1) {
            class196.method3565(field2460[var2], field2460[var3], field2460[var4], field2464[var2], field2464[var3], field2464[var4], field2489[this.field2431[arg0]]);
        } else {
            class196.method3500(field2460[var2], field2460[var3], field2460[var4], field2464[var2], field2464[var3], field2464[var4], this.field2431[arg0], this.field2436[arg0], this.field2437[arg0]);
        }
    }

    @ObfuscatedName("gr.ae(I)V")
    public final void method3808(int arg0) {
        int var2 = Statics.field2272;
        int var3 = Statics.field2265;
        int var4 = 0;
        int var5 = this.field2432[arg0];
        int var6 = this.field2477[arg0];
        int var7 = this.field2434[arg0];
        int var8 = field2423[var5];
        int var9 = field2423[var6];
        int var10 = field2423[var7];
        if (this.field2439 == null) {
            class196.field2281 = 0;
        } else {
            class196.field2281 = this.field2439[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2478[var4] = field2464[var5];
            field2490[var4] = field2460[var5];
            field2480[var4++] = this.field2431[arg0];
        } else {
            int var11 = field2446[var5];
            int var12 = field2468[var5];
            int var13 = this.field2431[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2426[var10 - var8];
                field2478[var4] = (((field2446[var7] - var11) * var14 >> 16) + var11) * class196.field2271 / 50 + var2;
                field2490[var4] = (((field2468[var7] - var12) * var14 >> 16) + var12) * class196.field2271 / 50 + var3;
                field2480[var4++] = ((this.field2437[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2426[var9 - var8];
                field2478[var4] = (((field2446[var6] - var11) * var15 >> 16) + var11) * class196.field2271 / 50 + var2;
                field2490[var4] = (((field2468[var6] - var12) * var15 >> 16) + var12) * class196.field2271 / 50 + var3;
                field2480[var4++] = ((this.field2436[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2478[var4] = field2464[var6];
            field2490[var4] = field2460[var6];
            field2480[var4++] = this.field2436[arg0];
        } else {
            int var16 = field2446[var6];
            int var17 = field2468[var6];
            int var18 = this.field2436[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2426[var8 - var9];
                field2478[var4] = (((field2446[var5] - var16) * var19 >> 16) + var16) * class196.field2271 / 50 + var2;
                field2490[var4] = (((field2468[var5] - var17) * var19 >> 16) + var17) * class196.field2271 / 50 + var3;
                field2480[var4++] = ((this.field2431[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2426[var10 - var9];
                field2478[var4] = (((field2446[var7] - var16) * var20 >> 16) + var16) * class196.field2271 / 50 + var2;
                field2490[var4] = (((field2468[var7] - var17) * var20 >> 16) + var17) * class196.field2271 / 50 + var3;
                field2480[var4++] = ((this.field2437[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2478[var4] = field2464[var7];
            field2490[var4] = field2460[var7];
            field2480[var4++] = this.field2437[arg0];
        } else {
            int var21 = field2446[var7];
            int var22 = field2468[var7];
            int var23 = this.field2437[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2426[var9 - var10];
                field2478[var4] = (((field2446[var6] - var21) * var24 >> 16) + var21) * class196.field2271 / 50 + var2;
                field2490[var4] = (((field2468[var6] - var22) * var24 >> 16) + var22) * class196.field2271 / 50 + var3;
                field2480[var4++] = ((this.field2436[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2426[var8 - var10];
                field2478[var4] = (((field2446[var5] - var21) * var25 >> 16) + var21) * class196.field2271 / 50 + var2;
                field2490[var4] = (((field2468[var5] - var22) * var25 >> 16) + var22) * class196.field2271 / 50 + var3;
                field2480[var4++] = ((this.field2431[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2478[0];
        int var27 = field2478[1];
        int var28 = field2478[2];
        int var29 = field2490[0];
        int var30 = field2490[1];
        int var31 = field2490[2];
        class196.field2263 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2264 || var27 > Statics.field2264 || var28 > Statics.field2264) {
                class196.field2263 = true;
            }
            if (this.field2441 != null && this.field2441[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2440 == null || this.field2440[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2440[arg0] & 0xFF;
                    var33 = this.field2444[var32];
                    var34 = this.field2445[var32];
                    var35 = this.field2469[var32];
                }
                if (this.field2437[arg0] == -1) {
                    class196.method3523(var29, var30, var31, var26, var27, var28, this.field2431[arg0], this.field2431[arg0], this.field2431[arg0], field2446[var33], field2446[var34], field2446[var35], field2468[var33], field2468[var34], field2468[var35], field2423[var33], field2423[var34], field2423[var35], this.field2441[arg0]);
                } else {
                    class196.method3523(var29, var30, var31, var26, var27, var28, field2480[0], field2480[1], field2480[2], field2446[var33], field2446[var34], field2446[var35], field2468[var33], field2468[var34], field2468[var35], field2423[var33], field2423[var34], field2423[var35], this.field2441[arg0]);
                }
            } else if (this.field2437[arg0] == -1) {
                class196.method3565(var29, var30, var31, var26, var27, var28, field2489[this.field2431[arg0]]);
            } else {
                class196.method3500(var29, var30, var31, var26, var27, var28, field2480[0], field2480[1], field2480[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2264 || var27 > Statics.field2264 || var28 > Statics.field2264 || field2478[3] < 0 || field2478[3] > Statics.field2264) {
            class196.field2263 = true;
        }
        if (this.field2441 != null && this.field2441[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2440 == null || this.field2440[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2440[arg0] & 0xFF;
                var37 = this.field2444[var36];
                var38 = this.field2445[var36];
                var39 = this.field2469[var36];
            }
            short var40 = this.field2441[arg0];
            if (this.field2437[arg0] == -1) {
                class196.method3523(var29, var30, var31, var26, var27, var28, this.field2431[arg0], this.field2431[arg0], this.field2431[arg0], field2446[var37], field2446[var38], field2446[var39], field2468[var37], field2468[var38], field2468[var39], field2423[var37], field2423[var38], field2423[var39], var40);
                class196.method3523(var29, var31, field2490[3], var26, var28, field2478[3], this.field2431[arg0], this.field2431[arg0], this.field2431[arg0], field2446[var37], field2446[var38], field2446[var39], field2468[var37], field2468[var38], field2468[var39], field2423[var37], field2423[var38], field2423[var39], var40);
            } else {
                class196.method3523(var29, var30, var31, var26, var27, var28, field2480[0], field2480[1], field2480[2], field2446[var37], field2446[var38], field2446[var39], field2468[var37], field2468[var38], field2468[var39], field2423[var37], field2423[var38], field2423[var39], var40);
                class196.method3523(var29, var31, field2490[3], var26, var28, field2478[3], field2480[0], field2480[2], field2480[3], field2446[var37], field2446[var38], field2446[var39], field2468[var37], field2468[var38], field2468[var39], field2423[var37], field2423[var38], field2423[var39], var40);
            }
        } else if (this.field2437[arg0] == -1) {
            int var41 = field2489[this.field2431[arg0]];
            class196.method3565(var29, var30, var31, var26, var27, var28, var41);
            class196.method3565(var29, var31, field2490[3], var26, var28, field2478[3], var41);
        } else {
            class196.method3500(var29, var30, var31, var26, var27, var28, field2480[0], field2480[1], field2480[2]);
            class196.method3500(var29, var31, field2490[3], var26, var28, field2478[3], field2480[0], field2480[2], field2480[3]);
        }
    }
}
