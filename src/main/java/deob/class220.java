package deob;

@ObfuscatedName("hg")
public class class220 extends class214 {

    @ObfuscatedName("hg.n")
    public static class220 field2523 = new class220();

    @ObfuscatedName("hg.c")
    public static byte[] field2495 = new byte[1];

    @ObfuscatedName("hg.m")
    public static class220 field2496 = new class220();

    @ObfuscatedName("hg.k")
    public static byte[] field2497 = new byte[1];

    @ObfuscatedName("hg.o")
    public int field2498 = 0;

    @ObfuscatedName("hg.g")
    public int[] field2551;

    @ObfuscatedName("hg.z")
    public int[] field2548;

    @ObfuscatedName("hg.a")
    public int[] field2501;

    @ObfuscatedName("hg.u")
    public int field2502 = 0;

    @ObfuscatedName("hg.e")
    public int[] field2503;

    @ObfuscatedName("hg.l")
    public int[] field2500;

    @ObfuscatedName("hg.y")
    public int[] field2504;

    @ObfuscatedName("hg.v")
    public int[] field2508;

    @ObfuscatedName("hg.f")
    public int[] field2507;

    @ObfuscatedName("hg.s")
    public int[] field2494;

    @ObfuscatedName("hg.h")
    public byte[] field2509;

    @ObfuscatedName("hg.d")
    public byte[] field2510;

    @ObfuscatedName("hg.q")
    public byte[] field2511;

    @ObfuscatedName("hg.j")
    public short[] field2512;

    @ObfuscatedName("hg.x")
    public byte field2549 = 0;

    @ObfuscatedName("hg.b")
    public int field2514 = 0;

    @ObfuscatedName("hg.t")
    public int[] field2499;

    @ObfuscatedName("hg.r")
    public int[] field2516;

    @ObfuscatedName("hg.p")
    public int[] field2550;

    @ObfuscatedName("hg.w")
    public int[][] field2518;

    @ObfuscatedName("hg.i")
    public int[][] field2519;

    @ObfuscatedName("hg.aq")
    public boolean field2520 = false;

    @ObfuscatedName("hg.ad")
    public int field2521;

    @ObfuscatedName("hg.al")
    public int field2522;

    @ObfuscatedName("hg.aa")
    public int field2538;

    @ObfuscatedName("hg.aw")
    public int field2545;

    @ObfuscatedName("hg.at")
    public int field2553;

    @ObfuscatedName("hg.as")
    public int field2526;

    @ObfuscatedName("hg.ae")
    public int field2527;

    @ObfuscatedName("hg.av")
    public int field2528;

    @ObfuscatedName("hg.ak")
    public int field2529 = -1;

    @ObfuscatedName("hg.an")
    public int field2530 = -1;

    @ObfuscatedName("hg.ab")
    public int field2531 = -1;

    @ObfuscatedName("hg.am")
    public static boolean[] field2533 = new boolean[6500];

    @ObfuscatedName("hg.ao")
    public static boolean[] field2534 = new boolean[6500];

    @ObfuscatedName("hg.ay")
    public static int[] field2535 = new int[6500];

    @ObfuscatedName("hg.aj")
    public static int[] field2536 = new int[6500];

    @ObfuscatedName("hg.ap")
    public static int[] field2517 = new int[6500];

    @ObfuscatedName("hg.ai")
    public static int[] field2559 = new int[6500];

    @ObfuscatedName("hg.ac")
    public static int[] field2542 = new int[6500];

    @ObfuscatedName("hg.ag")
    public static int[] field2540 = new int[6500];

    @ObfuscatedName("hg.az")
    public static int[] field2525 = new int[1600];

    @ObfuscatedName("hg.ah")
    public static int[][] field2543 = new int[1600][512];

    @ObfuscatedName("hg.af")
    public static int[] field2544 = new int[12];

    @ObfuscatedName("hg.ax")
    public static int[][] field2557 = new int[12][2000];

    @ObfuscatedName("hg.bd")
    public static int[] field2524 = new int[2000];

    @ObfuscatedName("hg.bt")
    public static int[] field2547 = new int[2000];

    @ObfuscatedName("hg.bf")
    public static int[] field2562 = new int[12];

    @ObfuscatedName("hg.bp")
    public static int[] field2539 = new int[10];

    @ObfuscatedName("hg.bl")
    public static int[] field2546 = new int[10];

    @ObfuscatedName("hg.bc")
    public static int[] field2537 = new int[10];

    @ObfuscatedName("hg.bj")
    public static boolean field2555 = true;

    @ObfuscatedName("hg.bu")
    public static int[] field2558 = class211.field2346;

    @ObfuscatedName("hg.bn")
    public static int[] field2556 = class211.field2357;

    @ObfuscatedName("hg.bk")
    public static int[] field2560 = class211.field2351;

    @ObfuscatedName("hg.bm")
    public static int[] field2561 = class211.field2355;

    public class220() {
    }

    public class220(class220[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2498 = 0;
        this.field2502 = 0;
        this.field2514 = 0;
        this.field2549 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class220 var8 = arg0[var7];
            if (var8 != null) {
                this.field2498 += var8.field2498;
                this.field2502 += var8.field2502;
                this.field2514 += var8.field2514;
                if (var8.field2509 == null) {
                    if (this.field2549 == -1) {
                        this.field2549 = var8.field2549;
                    }
                    if (this.field2549 != var8.field2549) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2510 != null;
                var5 |= var8.field2512 != null;
                var6 |= var8.field2511 != null;
            }
        }
        this.field2551 = new int[this.field2498];
        this.field2548 = new int[this.field2498];
        this.field2501 = new int[this.field2498];
        this.field2503 = new int[this.field2502];
        this.field2500 = new int[this.field2502];
        this.field2504 = new int[this.field2502];
        this.field2508 = new int[this.field2502];
        this.field2507 = new int[this.field2502];
        this.field2494 = new int[this.field2502];
        if (var3) {
            this.field2509 = new byte[this.field2502];
        }
        if (var4) {
            this.field2510 = new byte[this.field2502];
        }
        if (var5) {
            this.field2512 = new short[this.field2502];
        }
        if (var6) {
            this.field2511 = new byte[this.field2502];
        }
        if (this.field2514 > 0) {
            this.field2499 = new int[this.field2514];
            this.field2516 = new int[this.field2514];
            this.field2550 = new int[this.field2514];
        }
        this.field2498 = 0;
        this.field2502 = 0;
        this.field2514 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class220 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2502; var11++) {
                    this.field2503[this.field2502] = var10.field2503[var11] + this.field2498;
                    this.field2500[this.field2502] = var10.field2500[var11] + this.field2498;
                    this.field2504[this.field2502] = var10.field2504[var11] + this.field2498;
                    this.field2508[this.field2502] = var10.field2508[var11];
                    this.field2507[this.field2502] = var10.field2507[var11];
                    this.field2494[this.field2502] = var10.field2494[var11];
                    if (var3) {
                        if (var10.field2509 == null) {
                            this.field2509[this.field2502] = var10.field2549;
                        } else {
                            this.field2509[this.field2502] = var10.field2509[var11];
                        }
                    }
                    if (var4 && var10.field2510 != null) {
                        this.field2510[this.field2502] = var10.field2510[var11];
                    }
                    if (var5) {
                        if (var10.field2512 == null) {
                            this.field2512[this.field2502] = -1;
                        } else {
                            this.field2512[this.field2502] = var10.field2512[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2511 == null || var10.field2511[var11] == -1) {
                            this.field2511[this.field2502] = -1;
                        } else {
                            this.field2511[this.field2502] = (byte) (var10.field2511[var11] + this.field2514);
                        }
                    }
                    this.field2502++;
                }
                for (int var12 = 0; var12 < var10.field2514; var12++) {
                    this.field2499[this.field2514] = var10.field2499[var12] + this.field2498;
                    this.field2516[this.field2514] = var10.field2516[var12] + this.field2498;
                    this.field2550[this.field2514] = var10.field2550[var12] + this.field2498;
                    this.field2514++;
                }
                for (int var13 = 0; var13 < var10.field2498; var13++) {
                    this.field2551[this.field2498] = var10.field2551[var13];
                    this.field2548[this.field2498] = var10.field2548[var13];
                    this.field2501[this.field2498] = var10.field2501[var13];
                    this.field2498++;
                }
            }
        }
    }

    @ObfuscatedName("hg.n([[IIIIZI)Lhg;")
    public class220 method4014(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4018();
        int var7 = arg1 - this.field2538;
        int var8 = this.field2538 + arg1;
        int var9 = arg3 - this.field2538;
        int var10 = this.field2538 + arg3;
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
        class220 var15;
        if (arg4) {
            var15 = new class220();
            var15.field2498 = this.field2498;
            var15.field2502 = this.field2502;
            var15.field2514 = this.field2514;
            var15.field2551 = this.field2551;
            var15.field2501 = this.field2501;
            var15.field2503 = this.field2503;
            var15.field2500 = this.field2500;
            var15.field2504 = this.field2504;
            var15.field2508 = this.field2508;
            var15.field2507 = this.field2507;
            var15.field2494 = this.field2494;
            var15.field2509 = this.field2509;
            var15.field2510 = this.field2510;
            var15.field2511 = this.field2511;
            var15.field2512 = this.field2512;
            var15.field2549 = this.field2549;
            var15.field2499 = this.field2499;
            var15.field2516 = this.field2516;
            var15.field2550 = this.field2550;
            var15.field2518 = this.field2518;
            var15.field2519 = this.field2519;
            var15.field2520 = this.field2520;
            var15.field2548 = new int[var15.field2498];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2498; var16++) {
                int var17 = this.field2551[var16] + arg1;
                int var18 = this.field2501[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2548[var16] = this.field2548[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2498; var26++) {
                int var27 = (-this.field2548[var26] << 16) / this.field2429;
                if (var27 < arg5) {
                    int var28 = this.field2551[var26] + arg1;
                    int var29 = this.field2501[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2548[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2548[var26];
                }
            }
        }
        var15.method4021();
        return var15;
    }

    @ObfuscatedName("hg.m(Z)Lhg;")
    public class220 method4015(boolean arg0) {
        if (!arg0 && field2495.length < this.field2502) {
            field2495 = new byte[this.field2502 + 100];
        }
        return this.method4017(arg0, field2523, field2495);
    }

    @ObfuscatedName("hg.k(Z)Lhg;")
    public class220 method4016(boolean arg0) {
        if (!arg0 && field2497.length < this.field2502) {
            field2497 = new byte[this.field2502 + 100];
        }
        return this.method4017(arg0, field2496, field2497);
    }

    @ObfuscatedName("hg.z(ZLhg;[B)Lhg;")
    public class220 method4017(boolean arg0, class220 arg1, byte[] arg2) {
        arg1.field2498 = this.field2498;
        arg1.field2502 = this.field2502;
        arg1.field2514 = this.field2514;
        if (arg1.field2551 == null || arg1.field2551.length < this.field2498) {
            arg1.field2551 = new int[this.field2498 + 100];
            arg1.field2548 = new int[this.field2498 + 100];
            arg1.field2501 = new int[this.field2498 + 100];
        }
        for (int var4 = 0; var4 < this.field2498; var4++) {
            arg1.field2551[var4] = this.field2551[var4];
            arg1.field2548[var4] = this.field2548[var4];
            arg1.field2501[var4] = this.field2501[var4];
        }
        if (arg0) {
            arg1.field2510 = this.field2510;
        } else {
            arg1.field2510 = arg2;
            if (this.field2510 == null) {
                for (int var5 = 0; var5 < this.field2502; var5++) {
                    arg1.field2510[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2502; var6++) {
                    arg1.field2510[var6] = this.field2510[var6];
                }
            }
        }
        arg1.field2503 = this.field2503;
        arg1.field2500 = this.field2500;
        arg1.field2504 = this.field2504;
        arg1.field2508 = this.field2508;
        arg1.field2507 = this.field2507;
        arg1.field2494 = this.field2494;
        arg1.field2509 = this.field2509;
        arg1.field2511 = this.field2511;
        arg1.field2512 = this.field2512;
        arg1.field2549 = this.field2549;
        arg1.field2499 = this.field2499;
        arg1.field2516 = this.field2516;
        arg1.field2550 = this.field2550;
        arg1.field2518 = this.field2518;
        arg1.field2519 = this.field2519;
        arg1.field2520 = this.field2520;
        arg1.method4021();
        return arg1;
    }

    @ObfuscatedName("hg.a(I)V")
    public void method4046(int arg0) {
        if (this.field2529 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2556[arg0];
        int var9 = field2558[arg0];
        for (int var10 = 0; var10 < this.field2498; var10++) {
            int var11 = class211.method3717(this.field2551[var10], this.field2501[var10], var8, var9);
            int var12 = this.field2548[var10];
            int var13 = class211.method3750(this.field2551[var10], this.field2501[var10], var8, var9);
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
        this.field2526 = (var2 + var5) / 2;
        this.field2527 = (var3 + var6) / 2;
        this.field2528 = (var4 + var7) / 2;
        this.field2529 = (var5 - var2 + 1) / 2;
        this.field2530 = (var6 - var3 + 1) / 2;
        this.field2531 = (var7 - var4 + 1) / 2;
        if (this.field2529 < 32) {
            this.field2529 = 32;
        }
        if (this.field2531 < 32) {
            this.field2531 = 32;
        }
        if (this.field2520) {
            this.field2529 += 8;
            this.field2531 += 8;
        }
    }

    @ObfuscatedName("hg.u()V")
    public void method4018() {
        if (this.field2521 == 1) {
            return;
        }
        this.field2521 = 1;
        this.field2429 = 0;
        this.field2522 = 0;
        this.field2538 = 0;
        for (int var1 = 0; var1 < this.field2498; var1++) {
            int var2 = this.field2551[var1];
            int var3 = this.field2548[var1];
            int var4 = this.field2501[var1];
            if (-var3 > this.field2429) {
                this.field2429 = -var3;
            }
            if (var3 > this.field2522) {
                this.field2522 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2538) {
                this.field2538 = var5;
            }
        }
        this.field2538 = (int) (Math.sqrt((double) this.field2538) + 0.99D);
        this.field2553 = (int) (Math.sqrt((double) (this.field2429 * this.field2429 + this.field2538 * this.field2538)) + 0.99D);
        this.field2545 = this.field2553 + (int) (Math.sqrt((double) (this.field2538 * this.field2538 + this.field2522 * this.field2522)) + 0.99D);
    }

    @ObfuscatedName("hg.e()V")
    public void method4019() {
        if (this.field2521 == 2) {
            return;
        }
        this.field2521 = 2;
        this.field2538 = 0;
        for (int var1 = 0; var1 < this.field2498; var1++) {
            int var2 = this.field2551[var1];
            int var3 = this.field2548[var1];
            int var4 = this.field2501[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2538) {
                this.field2538 = var5;
            }
        }
        this.field2538 = (int) (Math.sqrt((double) this.field2538) + 0.99D);
        this.field2553 = this.field2538;
        this.field2545 = this.field2538 + this.field2538;
    }

    @ObfuscatedName("hg.l()I")
    public int method4051() {
        this.method4018();
        return this.field2538;
    }

    @ObfuscatedName("hg.y()V")
    public void method4021() {
        this.field2521 = 0;
        this.field2529 = -1;
    }

    @ObfuscatedName("hg.v(Lhd;I)V")
    public void method4057(class216 arg0, int arg1) {
        if (this.field2518 == null || arg1 == -1) {
            return;
        }
        class209 var3 = arg0.field2436[arg1];
        class212 var4 = var3.field2298;
        Statics.field2552 = 0;
        Statics.field2506 = 0;
        Statics.field2554 = 0;
        for (int var5 = 0; var5 < var3.field2301; var5++) {
            int var6 = var3.field2304[var5];
            this.method4024(var4.field2358[var6], var4.field2361[var6], var3.field2303[var5], var3.field2300[var5], var3.field2305[var5]);
        }
        this.method4021();
    }

    @ObfuscatedName("hg.f(Lhd;ILhd;I[I)V")
    public void method4085(class216 arg0, int arg1, class216 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method4057(arg0, arg1);
            return;
        }
        class209 var6 = arg0.field2436[arg1];
        class209 var7 = arg2.field2436[arg3];
        class212 var8 = var6.field2298;
        Statics.field2552 = 0;
        Statics.field2506 = 0;
        Statics.field2554 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2301; var11++) {
            int var12 = var6.field2304[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2358[var12] == 0) {
                this.method4024(var8.field2358[var12], var8.field2361[var12], var6.field2303[var11], var6.field2300[var11], var6.field2305[var11]);
            }
        }
        Statics.field2552 = 0;
        Statics.field2506 = 0;
        Statics.field2554 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2301; var15++) {
            int var16 = var7.field2304[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2358[var16] == 0) {
                this.method4024(var8.field2358[var16], var8.field2361[var16], var7.field2303[var15], var7.field2300[var15], var7.field2305[var15]);
            }
        }
        this.method4021();
    }

    @ObfuscatedName("hg.s(I[IIII)V")
    public void method4024(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2552 = 0;
            Statics.field2506 = 0;
            Statics.field2554 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2518.length) {
                    int[] var10 = this.field2518[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2552 += this.field2551[var12];
                        Statics.field2506 += this.field2548[var12];
                        Statics.field2554 += this.field2501[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2552 = Statics.field2552 / var7 + arg2;
                Statics.field2506 = Statics.field2506 / var7 + arg3;
                Statics.field2554 = Statics.field2554 / var7 + arg4;
            } else {
                Statics.field2552 = arg2;
                Statics.field2506 = arg3;
                Statics.field2554 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2518.length) {
                    int[] var15 = this.field2518[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2551[var17] += arg2;
                        this.field2548[var17] += arg3;
                        this.field2501[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2518.length) {
                    int[] var20 = this.field2518[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2551[var22] -= Statics.field2552;
                        this.field2548[var22] -= Statics.field2506;
                        this.field2501[var22] -= Statics.field2554;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2558[var25];
                            int var27 = field2556[var25];
                            int var28 = this.field2551[var22] * var27 + this.field2548[var22] * var26 >> 16;
                            this.field2548[var22] = this.field2548[var22] * var27 - this.field2551[var22] * var26 >> 16;
                            this.field2551[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2558[var23];
                            int var30 = field2556[var23];
                            int var31 = this.field2548[var22] * var30 - this.field2501[var22] * var29 >> 16;
                            this.field2501[var22] = this.field2548[var22] * var29 + this.field2501[var22] * var30 >> 16;
                            this.field2548[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2558[var24];
                            int var33 = field2556[var24];
                            int var34 = this.field2551[var22] * var33 + this.field2501[var22] * var32 >> 16;
                            this.field2501[var22] = this.field2501[var22] * var33 - this.field2551[var22] * var32 >> 16;
                            this.field2551[var22] = var34;
                        }
                        this.field2551[var22] += Statics.field2552;
                        this.field2548[var22] += Statics.field2506;
                        this.field2501[var22] += Statics.field2554;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2518.length) {
                    int[] var37 = this.field2518[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2551[var39] -= Statics.field2552;
                        this.field2548[var39] -= Statics.field2506;
                        this.field2501[var39] -= Statics.field2554;
                        this.field2551[var39] = this.field2551[var39] * arg2 / 128;
                        this.field2548[var39] = this.field2548[var39] * arg3 / 128;
                        this.field2501[var39] = this.field2501[var39] * arg4 / 128;
                        this.field2551[var39] += Statics.field2552;
                        this.field2548[var39] += Statics.field2506;
                        this.field2501[var39] += Statics.field2554;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2519 != null && this.field2510 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2519.length) {
                    int[] var42 = this.field2519[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2510[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2510[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hg.h()V")
    public void method4049() {
        for (int var1 = 0; var1 < this.field2498; var1++) {
            int var2 = this.field2551[var1];
            this.field2551[var1] = this.field2501[var1];
            this.field2501[var1] = -var2;
        }
        this.method4021();
    }

    @ObfuscatedName("hg.d()V")
    public void method4022() {
        for (int var1 = 0; var1 < this.field2498; var1++) {
            this.field2551[var1] = -this.field2551[var1];
            this.field2501[var1] = -this.field2501[var1];
        }
        this.method4021();
    }

    @ObfuscatedName("hg.q()V")
    public void method4025() {
        for (int var1 = 0; var1 < this.field2498; var1++) {
            int var2 = this.field2501[var1];
            this.field2501[var1] = this.field2551[var1];
            this.field2551[var1] = -var2;
        }
        this.method4021();
    }

    @ObfuscatedName("hg.j(I)V")
    public void method4028(int arg0) {
        int var2 = field2558[arg0];
        int var3 = field2556[arg0];
        for (int var4 = 0; var4 < this.field2498; var4++) {
            int var5 = this.field2548[var4] * var3 - this.field2501[var4] * var2 >> 16;
            this.field2501[var4] = this.field2548[var4] * var2 + this.field2501[var4] * var3 >> 16;
            this.field2548[var4] = var5;
        }
        this.method4021();
    }

    @ObfuscatedName("hg.x(III)V")
    public void method4029(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2498; var4++) {
            this.field2551[var4] += arg0;
            this.field2548[var4] += arg1;
            this.field2501[var4] += arg2;
        }
        this.method4021();
    }

    @ObfuscatedName("hg.b(III)V")
    public void method4030(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2498; var4++) {
            this.field2551[var4] = this.field2551[var4] * arg0 / 128;
            this.field2548[var4] = this.field2548[var4] * arg1 / 128;
            this.field2501[var4] = this.field2501[var4] * arg2 / 128;
        }
        this.method4021();
    }

    @ObfuscatedName("hg.t(IIIIIII)V")
    public final void method4077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2525[0] = -1;
        if (this.field2521 != 2 && this.field2521 != 1) {
            this.method4019();
        }
        int var8 = Statics.field2343;
        int var9 = Statics.field2344;
        int var10 = field2558[arg0];
        int var11 = field2556[arg0];
        int var12 = field2558[arg1];
        int var13 = field2556[arg1];
        int var14 = field2558[arg2];
        int var15 = field2556[arg2];
        int var16 = field2558[arg3];
        int var17 = field2556[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2498; var19++) {
            int var20 = this.field2551[var19];
            int var21 = this.field2548[var19];
            int var22 = this.field2501[var19];
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
            field2517[var19] = var30 - var18;
            field2535[var19] = class211.field2342 * var26 / var30 + var8;
            field2536[var19] = class211.field2342 * var29 / var30 + var9;
            if (this.field2514 > 0) {
                field2559[var19] = var26;
                field2542[var19] = var29;
                field2540[var19] = var30;
            }
        }
        try {
            this.method4027(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("hg.r(IIIIIIII)V")
    public final void method4031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2525[0] = -1;
        if (this.field2521 != 2 && this.field2521 != 1) {
            this.method4019();
        }
        int var9 = Statics.field2343;
        int var10 = Statics.field2344;
        int var11 = field2558[arg0];
        int var12 = field2556[arg0];
        int var13 = field2558[arg1];
        int var14 = field2556[arg1];
        int var15 = field2558[arg2];
        int var16 = field2556[arg2];
        int var17 = field2558[arg3];
        int var18 = field2556[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2498; var20++) {
            int var21 = this.field2551[var20];
            int var22 = this.field2548[var20];
            int var23 = this.field2501[var20];
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
            field2517[var20] = var31 - var19;
            field2535[var20] = class211.field2342 * var27 / arg7 + var9;
            field2536[var20] = class211.field2342 * var30 / arg7 + var10;
            if (this.field2514 > 0) {
                field2559[var20] = var27;
                field2542[var20] = var30;
                field2540[var20] = var31;
            }
        }
        try {
            this.method4027(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("hg.cc(IIIIIIIIJ)V")
    public void method3970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2525[0] = -1;
        if (this.field2521 != 1) {
            this.method4018();
        }
        this.method4046(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2538 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2538) * class211.field2342;
        if (var16 / var14 >= Statics.field2352) {
            return;
        }
        int var17 = (this.field2538 + var15) * class211.field2342;
        if (var17 / var14 <= Statics.field2332) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2538 * arg1 >> 16;
        int var20 = (var18 + var19) * class211.field2342;
        if (var20 / var14 <= Statics.field2350) {
            return;
        }
        int var21 = (this.field2429 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class211.field2342;
        if (var22 / var14 >= Statics.field2349) {
            return;
        }
        int var23 = (this.field2429 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field2514 > 0;
        int var27 = class221.field2565;
        int var29 = class221.field2566;
        boolean var31 = class221.method5295();
        boolean var32 = class221.method3110(arg8);
        boolean var33 = false;
        if (var32 && var31) {
            boolean var34 = false;
            if (field2555) {
                var34 = class221.method3509(this, arg5, arg6, arg7);
            } else {
                int var35 = var12 - var13;
                if (var35 <= 50) {
                    var35 = 50;
                }
                int var36;
                int var37;
                if (var15 > 0) {
                    var36 = var16 / var14;
                    var37 = var17 / var35;
                } else {
                    var37 = var17 / var14;
                    var36 = var16 / var35;
                }
                int var38;
                int var39;
                if (var18 > 0) {
                    var38 = var22 / var14;
                    var39 = var20 / var35;
                } else {
                    var39 = var20 / var14;
                    var38 = var22 / var35;
                }
                int var40 = var27 - Statics.field2343;
                int var41 = var29 - Statics.field2344;
                if (var40 > var36 && var40 < var37 && var41 > var38 && var41 < var39) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field2520) {
                    class221.method396(arg8);
                } else {
                    var33 = true;
                }
            }
        }
        int var42 = Statics.field2343;
        int var43 = Statics.field2344;
        int var44 = 0;
        int var45 = 0;
        if (arg0 != 0) {
            var44 = field2558[arg0];
            var45 = field2556[arg0];
        }
        for (int var46 = 0; var46 < this.field2498; var46++) {
            int var47 = this.field2551[var46];
            int var48 = this.field2548[var46];
            int var49 = this.field2501[var46];
            if (arg0 != 0) {
                int var50 = var44 * var49 + var45 * var47 >> 16;
                var49 = var45 * var49 - var44 * var47 >> 16;
                var47 = var50;
            }
            int var51 = arg5 + var47;
            int var52 = arg6 + var48;
            int var53 = arg7 + var49;
            int var54 = arg3 * var53 + arg4 * var51 >> 16;
            int var55 = arg4 * var53 - arg3 * var51 >> 16;
            int var57 = arg2 * var52 - arg1 * var55 >> 16;
            int var58 = arg1 * var52 + arg2 * var55 >> 16;
            field2517[var46] = var58 - var12;
            if (var58 >= 50) {
                field2535[var46] = class211.field2342 * var54 / var58 + var42;
                field2536[var46] = class211.field2342 * var57 / var58 + var43;
            } else {
                field2535[var46] = -5000;
                var24 = true;
            }
            if (var26) {
                field2559[var46] = var54;
                field2542[var46] = var57;
                field2540[var46] = var58;
            }
        }
        try {
            this.method4027(var24, var33, this.field2520, arg8);
        } catch (Exception var61) {
        }
    }

    @ObfuscatedName("hg.p(ZZZJ)V")
    public final void method4027(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2545 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field2545; var6++) {
            field2525[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field2502; var8++) {
            if (this.field2494[var8] != -2) {
                int var9 = this.field2503[var8];
                int var10 = this.field2500[var8];
                int var11 = this.field2504[var8];
                int var12 = field2535[var9];
                int var13 = field2535[var10];
                int var14 = field2535[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2559[var9];
                    int var16 = field2559[var10];
                    int var17 = field2559[var11];
                    int var18 = field2542[var9];
                    int var19 = field2542[var10];
                    int var20 = field2542[var11];
                    int var21 = field2540[var9];
                    int var22 = field2540[var10];
                    int var23 = field2540[var11];
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
                        field2534[var8] = true;
                        int var33 = (field2517[var9] + field2517[var10] + field2517[var11]) / 3 + this.field2553;
                        field2543[var33][field2525[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field2536[var9];
                        int var35 = field2536[var10];
                        int var36 = field2536[var11];
                        int var37 = class221.field2566 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class221.field2566 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class221.field2565 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class221.field2565 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class221.method396(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field2536[var11] - field2536[var10]) * (var12 - var13) - (field2536[var9] - field2536[var10]) * (var14 - var13) > 0) {
                        field2534[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field2345 && var13 <= Statics.field2345 && var14 <= Statics.field2345) {
                            field2533[var8] = false;
                        } else {
                            field2533[var8] = true;
                        }
                        int var42 = (field2517[var9] + field2517[var10] + field2517[var11]) / 3 + this.field2553;
                        field2543[var42][field2525[var42]++] = var8;
                    }
                }
            }
        }
        if (this.field2509 == null) {
            for (int var43 = this.field2545 - 1; var43 >= 0; var43--) {
                int var44 = field2525[var43];
                if (var44 > 0) {
                    int[] var45 = field2543[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method4034(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field2544[var47] = 0;
            field2562[var47] = 0;
        }
        for (int var48 = this.field2545 - 1; var48 >= 0; var48--) {
            int var49 = field2525[var48];
            if (var49 > 0) {
                int[] var50 = field2543[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field2509[var52];
                    int var54 = field2544[var53]++;
                    field2557[var53][var54] = var52;
                    if (var53 < 10) {
                        field2562[var53] += var48;
                    } else if (var53 == 10) {
                        field2524[var54] = var48;
                    } else {
                        field2547[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field2544[1] > 0 || field2544[2] > 0) {
            var55 = (field2562[1] + field2562[2]) / (field2544[1] + field2544[2]);
        }
        int var56 = 0;
        if (field2544[3] > 0 || field2544[4] > 0) {
            var56 = (field2562[3] + field2562[4]) / (field2544[3] + field2544[4]);
        }
        int var57 = 0;
        if (field2544[6] > 0 || field2544[8] > 0) {
            var57 = (field2562[6] + field2562[8]) / (field2544[6] + field2544[8]);
        }
        int var58 = 0;
        int var59 = field2544[10];
        int[] var60 = field2557[10];
        int[] var61 = field2524;
        if (var58 == var59) {
            var58 = 0;
            var59 = field2544[11];
            var60 = field2557[11];
            var61 = field2547;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method4034(var60[var58++]);
                if (var58 == var59 && field2557[11] != var60) {
                    var58 = 0;
                    var59 = field2544[11];
                    var60 = field2557[11];
                    var61 = field2547;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method4034(var60[var58++]);
                if (var58 == var59 && field2557[11] != var60) {
                    var58 = 0;
                    var59 = field2544[11];
                    var60 = field2557[11];
                    var61 = field2547;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method4034(var60[var58++]);
                if (var58 == var59 && field2557[11] != var60) {
                    var58 = 0;
                    var59 = field2544[11];
                    var60 = field2557[11];
                    var61 = field2547;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field2544[var63];
            int[] var65 = field2557[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method4034(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method4034(var60[var58++]);
            if (var58 == var59 && field2557[11] != var60) {
                var58 = 0;
                var60 = field2557[11];
                var59 = field2544[11];
                var61 = field2547;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("hg.w(I)V")
    public final void method4034(int arg0) {
        if (field2534[arg0]) {
            this.method4035(arg0);
            return;
        }
        int var2 = this.field2503[arg0];
        int var3 = this.field2500[arg0];
        int var4 = this.field2504[arg0];
        class211.field2353 = field2533[arg0];
        if (this.field2510 == null) {
            class211.field2335 = 0;
        } else {
            class211.field2335 = this.field2510[arg0] & 0xFF;
        }
        if (this.field2512 != null && this.field2512[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2511 == null || this.field2511[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2511[arg0] & 0xFF;
                var6 = this.field2499[var5];
                var7 = this.field2516[var5];
                var8 = this.field2550[var5];
            }
            if (this.field2494[arg0] == -1) {
                class211.method3748(field2536[var2], field2536[var3], field2536[var4], field2535[var2], field2535[var3], field2535[var4], this.field2508[arg0], this.field2508[arg0], this.field2508[arg0], field2559[var6], field2559[var7], field2559[var8], field2542[var6], field2542[var7], field2542[var8], field2540[var6], field2540[var7], field2540[var8], this.field2512[arg0]);
            } else {
                class211.method3748(field2536[var2], field2536[var3], field2536[var4], field2535[var2], field2535[var3], field2535[var4], this.field2508[arg0], this.field2507[arg0], this.field2494[arg0], field2559[var6], field2559[var7], field2559[var8], field2542[var6], field2542[var7], field2542[var8], field2540[var6], field2540[var7], field2540[var8], this.field2512[arg0]);
            }
        } else if (this.field2494[arg0] == -1) {
            class211.method3715(field2536[var2], field2536[var3], field2536[var4], field2535[var2], field2535[var3], field2535[var4], field2560[this.field2508[arg0]]);
        } else {
            class211.method3709(field2536[var2], field2536[var3], field2536[var4], field2535[var2], field2535[var3], field2535[var4], this.field2508[arg0], this.field2507[arg0], this.field2494[arg0]);
        }
    }

    @ObfuscatedName("hg.i(I)V")
    public final void method4035(int arg0) {
        int var2 = Statics.field2343;
        int var3 = Statics.field2344;
        int var4 = 0;
        int var5 = this.field2503[arg0];
        int var6 = this.field2500[arg0];
        int var7 = this.field2504[arg0];
        int var8 = field2540[var5];
        int var9 = field2540[var6];
        int var10 = field2540[var7];
        if (this.field2510 == null) {
            class211.field2335 = 0;
        } else {
            class211.field2335 = this.field2510[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2539[var4] = field2535[var5];
            field2546[var4] = field2536[var5];
            field2537[var4++] = this.field2508[arg0];
        } else {
            int var11 = field2559[var5];
            int var12 = field2542[var5];
            int var13 = this.field2508[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2561[var10 - var8];
                field2539[var4] = (((field2559[var7] - var11) * var14 >> 16) + var11) * class211.field2342 / 50 + var2;
                field2546[var4] = (((field2542[var7] - var12) * var14 >> 16) + var12) * class211.field2342 / 50 + var3;
                field2537[var4++] = ((this.field2494[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2561[var9 - var8];
                field2539[var4] = (((field2559[var6] - var11) * var15 >> 16) + var11) * class211.field2342 / 50 + var2;
                field2546[var4] = (((field2542[var6] - var12) * var15 >> 16) + var12) * class211.field2342 / 50 + var3;
                field2537[var4++] = ((this.field2507[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2539[var4] = field2535[var6];
            field2546[var4] = field2536[var6];
            field2537[var4++] = this.field2507[arg0];
        } else {
            int var16 = field2559[var6];
            int var17 = field2542[var6];
            int var18 = this.field2507[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2561[var8 - var9];
                field2539[var4] = (((field2559[var5] - var16) * var19 >> 16) + var16) * class211.field2342 / 50 + var2;
                field2546[var4] = (((field2542[var5] - var17) * var19 >> 16) + var17) * class211.field2342 / 50 + var3;
                field2537[var4++] = ((this.field2508[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2561[var10 - var9];
                field2539[var4] = (((field2559[var7] - var16) * var20 >> 16) + var16) * class211.field2342 / 50 + var2;
                field2546[var4] = (((field2542[var7] - var17) * var20 >> 16) + var17) * class211.field2342 / 50 + var3;
                field2537[var4++] = ((this.field2494[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2539[var4] = field2535[var7];
            field2546[var4] = field2536[var7];
            field2537[var4++] = this.field2494[arg0];
        } else {
            int var21 = field2559[var7];
            int var22 = field2542[var7];
            int var23 = this.field2494[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2561[var9 - var10];
                field2539[var4] = (((field2559[var6] - var21) * var24 >> 16) + var21) * class211.field2342 / 50 + var2;
                field2546[var4] = (((field2542[var6] - var22) * var24 >> 16) + var22) * class211.field2342 / 50 + var3;
                field2537[var4++] = ((this.field2507[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2561[var8 - var10];
                field2539[var4] = (((field2559[var5] - var21) * var25 >> 16) + var21) * class211.field2342 / 50 + var2;
                field2546[var4] = (((field2542[var5] - var22) * var25 >> 16) + var22) * class211.field2342 / 50 + var3;
                field2537[var4++] = ((this.field2508[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2539[0];
        int var27 = field2539[1];
        int var28 = field2539[2];
        int var29 = field2546[0];
        int var30 = field2546[1];
        int var31 = field2546[2];
        class211.field2353 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2345 || var27 > Statics.field2345 || var28 > Statics.field2345) {
                class211.field2353 = true;
            }
            if (this.field2512 != null && this.field2512[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2511 == null || this.field2511[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2511[arg0] & 0xFF;
                    var33 = this.field2499[var32];
                    var34 = this.field2516[var32];
                    var35 = this.field2550[var32];
                }
                if (this.field2494[arg0] == -1) {
                    class211.method3748(var29, var30, var31, var26, var27, var28, this.field2508[arg0], this.field2508[arg0], this.field2508[arg0], field2559[var33], field2559[var34], field2559[var35], field2542[var33], field2542[var34], field2542[var35], field2540[var33], field2540[var34], field2540[var35], this.field2512[arg0]);
                } else {
                    class211.method3748(var29, var30, var31, var26, var27, var28, field2537[0], field2537[1], field2537[2], field2559[var33], field2559[var34], field2559[var35], field2542[var33], field2542[var34], field2542[var35], field2540[var33], field2540[var34], field2540[var35], this.field2512[arg0]);
                }
            } else if (this.field2494[arg0] == -1) {
                class211.method3715(var29, var30, var31, var26, var27, var28, field2560[this.field2508[arg0]]);
            } else {
                class211.method3709(var29, var30, var31, var26, var27, var28, field2537[0], field2537[1], field2537[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2345 || var27 > Statics.field2345 || var28 > Statics.field2345 || field2539[3] < 0 || field2539[3] > Statics.field2345) {
            class211.field2353 = true;
        }
        if (this.field2512 != null && this.field2512[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2511 == null || this.field2511[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2511[arg0] & 0xFF;
                var37 = this.field2499[var36];
                var38 = this.field2516[var36];
                var39 = this.field2550[var36];
            }
            short var40 = this.field2512[arg0];
            if (this.field2494[arg0] == -1) {
                class211.method3748(var29, var30, var31, var26, var27, var28, this.field2508[arg0], this.field2508[arg0], this.field2508[arg0], field2559[var37], field2559[var38], field2559[var39], field2542[var37], field2542[var38], field2542[var39], field2540[var37], field2540[var38], field2540[var39], var40);
                class211.method3748(var29, var31, field2546[3], var26, var28, field2539[3], this.field2508[arg0], this.field2508[arg0], this.field2508[arg0], field2559[var37], field2559[var38], field2559[var39], field2542[var37], field2542[var38], field2542[var39], field2540[var37], field2540[var38], field2540[var39], var40);
            } else {
                class211.method3748(var29, var30, var31, var26, var27, var28, field2537[0], field2537[1], field2537[2], field2559[var37], field2559[var38], field2559[var39], field2542[var37], field2542[var38], field2542[var39], field2540[var37], field2540[var38], field2540[var39], var40);
                class211.method3748(var29, var31, field2546[3], var26, var28, field2539[3], field2537[0], field2537[2], field2537[3], field2559[var37], field2559[var38], field2559[var39], field2542[var37], field2542[var38], field2542[var39], field2540[var37], field2540[var38], field2540[var39], var40);
            }
        } else if (this.field2494[arg0] == -1) {
            int var41 = field2560[this.field2508[arg0]];
            class211.method3715(var29, var30, var31, var26, var27, var28, var41);
            class211.method3715(var29, var31, field2546[3], var26, var28, field2539[3], var41);
        } else {
            class211.method3709(var29, var30, var31, var26, var27, var28, field2537[0], field2537[1], field2537[2]);
            class211.method3709(var29, var31, field2546[3], var26, var28, field2539[3], field2537[0], field2537[2], field2537[3]);
        }
    }
}
