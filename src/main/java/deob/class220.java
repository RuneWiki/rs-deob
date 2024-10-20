package deob;

@ObfuscatedName("hl")
public class class220 extends class214 {

    @ObfuscatedName("hl.l")
    public static class220 field2536 = new class220();

    @ObfuscatedName("hl.q")
    public static byte[] field2529 = new byte[1];

    @ObfuscatedName("hl.f")
    public static class220 field2507 = new class220();

    @ObfuscatedName("hl.j")
    public static byte[] field2551 = new byte[1];

    @ObfuscatedName("hl.m")
    public int field2572 = 0;

    @ObfuscatedName("hl.k")
    public int[] field2510;

    @ObfuscatedName("hl.t")
    public int[] field2511;

    @ObfuscatedName("hl.a")
    public int[] field2525;

    @ObfuscatedName("hl.e")
    public int field2513 = 0;

    @ObfuscatedName("hl.i")
    public int[] field2514;

    @ObfuscatedName("hl.y")
    public int[] field2519;

    @ObfuscatedName("hl.w")
    public int[] field2553;

    @ObfuscatedName("hl.g")
    public int[] field2517;

    @ObfuscatedName("hl.v")
    public int[] field2518;

    @ObfuscatedName("hl.s")
    public int[] field2566;

    @ObfuscatedName("hl.c")
    public byte[] field2520;

    @ObfuscatedName("hl.b")
    public byte[] field2521;

    @ObfuscatedName("hl.x")
    public byte[] field2505;

    @ObfuscatedName("hl.p")
    public short[] field2561;

    @ObfuscatedName("hl.z")
    public byte field2524 = 0;

    @ObfuscatedName("hl.h")
    public int field2571 = 0;

    @ObfuscatedName("hl.o")
    public int[] field2526;

    @ObfuscatedName("hl.r")
    public int[] field2527;

    @ObfuscatedName("hl.n")
    public int[] field2528;

    @ObfuscatedName("hl.u")
    public int[][] field2522;

    @ObfuscatedName("hl.d")
    public int[][] field2530;

    @ObfuscatedName("hl.ab")
    public boolean field2531 = false;

    @ObfuscatedName("hl.ad")
    public int field2532;

    @ObfuscatedName("hl.as")
    public int field2533;

    @ObfuscatedName("hl.ak")
    public int field2534;

    @ObfuscatedName("hl.ah")
    public int field2537;

    @ObfuscatedName("hl.ay")
    public int field2512;

    @ObfuscatedName("hl.al")
    public int field2506;

    @ObfuscatedName("hl.ao")
    public int field2538;

    @ObfuscatedName("hl.au")
    public int field2523;

    @ObfuscatedName("hl.aa")
    public int field2535 = -1;

    @ObfuscatedName("hl.ag")
    public int field2541 = -1;

    @ObfuscatedName("hl.aq")
    public int field2542 = -1;

    @ObfuscatedName("hl.ac")
    public static boolean[] field2544 = new boolean[6500];

    @ObfuscatedName("hl.at")
    public static boolean[] field2545 = new boolean[6500];

    @ObfuscatedName("hl.ax")
    public static int[] field2546 = new int[6500];

    @ObfuscatedName("hl.an")
    public static int[] field2547 = new int[6500];

    @ObfuscatedName("hl.av")
    public static int[] field2548 = new int[6500];

    @ObfuscatedName("hl.ap")
    public static int[] field2549 = new int[6500];

    @ObfuscatedName("hl.aj")
    public static int[] field2550 = new int[6500];

    @ObfuscatedName("hl.am")
    public static int[] field2515 = new int[6500];

    @ObfuscatedName("hl.az")
    public static int[] field2540 = new int[1600];

    @ObfuscatedName("hl.ae")
    public static int[][] field2554 = new int[1600][512];

    @ObfuscatedName("hl.ai")
    public static int[] field2555 = new int[12];

    @ObfuscatedName("hl.af")
    public static int[][] field2556 = new int[12][2000];

    @ObfuscatedName("hl.bz")
    public static int[] field2557 = new int[2000];

    @ObfuscatedName("hl.bt")
    public static int[] field2558 = new int[2000];

    @ObfuscatedName("hl.bg")
    public static int[] field2559 = new int[12];

    @ObfuscatedName("hl.bf")
    public static int[] field2560 = new int[10];

    @ObfuscatedName("hl.bj")
    public static int[] field2508 = new int[10];

    @ObfuscatedName("hl.bo")
    public static int[] field2562 = new int[10];

    @ObfuscatedName("hl.ba")
    public static boolean field2539 = true;

    @ObfuscatedName("hl.bs")
    public static int[] field2569 = class211.field2371;

    @ObfuscatedName("hl.bd")
    public static int[] field2570 = class211.field2359;

    @ObfuscatedName("hl.bb")
    public static int[] field2516 = class211.field2350;

    @ObfuscatedName("hl.bh")
    public static int[] field2509 = class211.field2370;

    public class220() {
    }

    public class220(class220[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2572 = 0;
        this.field2513 = 0;
        this.field2571 = 0;
        this.field2524 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class220 var8 = arg0[var7];
            if (var8 != null) {
                this.field2572 += var8.field2572;
                this.field2513 += var8.field2513;
                this.field2571 += var8.field2571;
                if (var8.field2520 == null) {
                    if (this.field2524 == -1) {
                        this.field2524 = var8.field2524;
                    }
                    if (this.field2524 != var8.field2524) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2521 != null;
                var5 |= var8.field2561 != null;
                var6 |= var8.field2505 != null;
            }
        }
        this.field2510 = new int[this.field2572];
        this.field2511 = new int[this.field2572];
        this.field2525 = new int[this.field2572];
        this.field2514 = new int[this.field2513];
        this.field2519 = new int[this.field2513];
        this.field2553 = new int[this.field2513];
        this.field2517 = new int[this.field2513];
        this.field2518 = new int[this.field2513];
        this.field2566 = new int[this.field2513];
        if (var3) {
            this.field2520 = new byte[this.field2513];
        }
        if (var4) {
            this.field2521 = new byte[this.field2513];
        }
        if (var5) {
            this.field2561 = new short[this.field2513];
        }
        if (var6) {
            this.field2505 = new byte[this.field2513];
        }
        if (this.field2571 > 0) {
            this.field2526 = new int[this.field2571];
            this.field2527 = new int[this.field2571];
            this.field2528 = new int[this.field2571];
        }
        this.field2572 = 0;
        this.field2513 = 0;
        this.field2571 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class220 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2513; var11++) {
                    this.field2514[this.field2513] = var10.field2514[var11] + this.field2572;
                    this.field2519[this.field2513] = var10.field2519[var11] + this.field2572;
                    this.field2553[this.field2513] = var10.field2553[var11] + this.field2572;
                    this.field2517[this.field2513] = var10.field2517[var11];
                    this.field2518[this.field2513] = var10.field2518[var11];
                    this.field2566[this.field2513] = var10.field2566[var11];
                    if (var3) {
                        if (var10.field2520 == null) {
                            this.field2520[this.field2513] = var10.field2524;
                        } else {
                            this.field2520[this.field2513] = var10.field2520[var11];
                        }
                    }
                    if (var4 && var10.field2521 != null) {
                        this.field2521[this.field2513] = var10.field2521[var11];
                    }
                    if (var5) {
                        if (var10.field2561 == null) {
                            this.field2561[this.field2513] = -1;
                        } else {
                            this.field2561[this.field2513] = var10.field2561[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2505 == null || var10.field2505[var11] == -1) {
                            this.field2505[this.field2513] = -1;
                        } else {
                            this.field2505[this.field2513] = (byte) (var10.field2505[var11] + this.field2571);
                        }
                    }
                    this.field2513++;
                }
                for (int var12 = 0; var12 < var10.field2571; var12++) {
                    this.field2526[this.field2571] = var10.field2526[var12] + this.field2572;
                    this.field2527[this.field2571] = var10.field2527[var12] + this.field2572;
                    this.field2528[this.field2571] = var10.field2528[var12] + this.field2572;
                    this.field2571++;
                }
                for (int var13 = 0; var13 < var10.field2572; var13++) {
                    this.field2510[this.field2572] = var10.field2510[var13];
                    this.field2511[this.field2572] = var10.field2511[var13];
                    this.field2525[this.field2572] = var10.field2525[var13];
                    this.field2572++;
                }
            }
        }
    }

    @ObfuscatedName("hl.l([[IIIIZI)Lhl;")
    public class220 method4124(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4076();
        int var7 = arg1 - this.field2534;
        int var8 = this.field2534 + arg1;
        int var9 = arg3 - this.field2534;
        int var10 = this.field2534 + arg3;
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
            var15.field2572 = this.field2572;
            var15.field2513 = this.field2513;
            var15.field2571 = this.field2571;
            var15.field2510 = this.field2510;
            var15.field2525 = this.field2525;
            var15.field2514 = this.field2514;
            var15.field2519 = this.field2519;
            var15.field2553 = this.field2553;
            var15.field2517 = this.field2517;
            var15.field2518 = this.field2518;
            var15.field2566 = this.field2566;
            var15.field2520 = this.field2520;
            var15.field2521 = this.field2521;
            var15.field2505 = this.field2505;
            var15.field2561 = this.field2561;
            var15.field2524 = this.field2524;
            var15.field2526 = this.field2526;
            var15.field2527 = this.field2527;
            var15.field2528 = this.field2528;
            var15.field2522 = this.field2522;
            var15.field2530 = this.field2530;
            var15.field2531 = this.field2531;
            var15.field2511 = new int[var15.field2572];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2572; var16++) {
                int var17 = this.field2510[var16] + arg1;
                int var18 = this.field2525[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2511[var16] = this.field2511[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2572; var26++) {
                int var27 = (-this.field2511[var26] << 16) / this.field2449;
                if (var27 < arg5) {
                    int var28 = this.field2510[var26] + arg1;
                    int var29 = this.field2525[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2511[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2511[var26];
                }
            }
        }
        var15.method4069();
        return var15;
    }

    @ObfuscatedName("hl.f(Z)Lhl;")
    public class220 method4062(boolean arg0) {
        if (!arg0 && field2529.length < this.field2513) {
            field2529 = new byte[this.field2513 + 100];
        }
        return this.method4064(arg0, field2536, field2529);
    }

    @ObfuscatedName("hl.j(Z)Lhl;")
    public class220 method4071(boolean arg0) {
        if (!arg0 && field2551.length < this.field2513) {
            field2551 = new byte[this.field2513 + 100];
        }
        return this.method4064(arg0, field2507, field2551);
    }

    @ObfuscatedName("hl.m(ZLhl;[B)Lhl;")
    public class220 method4064(boolean arg0, class220 arg1, byte[] arg2) {
        arg1.field2572 = this.field2572;
        arg1.field2513 = this.field2513;
        arg1.field2571 = this.field2571;
        if (arg1.field2510 == null || arg1.field2510.length < this.field2572) {
            arg1.field2510 = new int[this.field2572 + 100];
            arg1.field2511 = new int[this.field2572 + 100];
            arg1.field2525 = new int[this.field2572 + 100];
        }
        for (int var4 = 0; var4 < this.field2572; var4++) {
            arg1.field2510[var4] = this.field2510[var4];
            arg1.field2511[var4] = this.field2511[var4];
            arg1.field2525[var4] = this.field2525[var4];
        }
        if (arg0) {
            arg1.field2521 = this.field2521;
        } else {
            arg1.field2521 = arg2;
            if (this.field2521 == null) {
                for (int var5 = 0; var5 < this.field2513; var5++) {
                    arg1.field2521[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2513; var6++) {
                    arg1.field2521[var6] = this.field2521[var6];
                }
            }
        }
        arg1.field2514 = this.field2514;
        arg1.field2519 = this.field2519;
        arg1.field2553 = this.field2553;
        arg1.field2517 = this.field2517;
        arg1.field2518 = this.field2518;
        arg1.field2566 = this.field2566;
        arg1.field2520 = this.field2520;
        arg1.field2505 = this.field2505;
        arg1.field2561 = this.field2561;
        arg1.field2524 = this.field2524;
        arg1.field2526 = this.field2526;
        arg1.field2527 = this.field2527;
        arg1.field2528 = this.field2528;
        arg1.field2522 = this.field2522;
        arg1.field2530 = this.field2530;
        arg1.field2531 = this.field2531;
        arg1.method4069();
        return arg1;
    }

    @ObfuscatedName("hl.k(I)V")
    public void method4065(int arg0) {
        if (this.field2535 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2570[arg0];
        int var9 = field2569[arg0];
        for (int var10 = 0; var10 < this.field2572; var10++) {
            int var11 = class211.method3764(this.field2510[var10], this.field2525[var10], var8, var9);
            int var12 = this.field2511[var10];
            int var13 = class211.method3765(this.field2510[var10], this.field2525[var10], var8, var9);
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
        this.field2506 = (var2 + var5) / 2;
        this.field2538 = (var3 + var6) / 2;
        this.field2523 = (var4 + var7) / 2;
        this.field2535 = (var5 - var2 + 1) / 2;
        this.field2541 = (var6 - var3 + 1) / 2;
        this.field2542 = (var7 - var4 + 1) / 2;
        if (this.field2535 < 32) {
            this.field2535 = 32;
        }
        if (this.field2542 < 32) {
            this.field2542 = 32;
        }
        if (this.field2531) {
            this.field2535 += 8;
            this.field2542 += 8;
        }
    }

    @ObfuscatedName("hl.a()V")
    public void method4076() {
        if (this.field2532 == 1) {
            return;
        }
        this.field2532 = 1;
        this.field2449 = 0;
        this.field2533 = 0;
        this.field2534 = 0;
        for (int var1 = 0; var1 < this.field2572; var1++) {
            int var2 = this.field2510[var1];
            int var3 = this.field2511[var1];
            int var4 = this.field2525[var1];
            if (-var3 > this.field2449) {
                this.field2449 = -var3;
            }
            if (var3 > this.field2533) {
                this.field2533 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2534) {
                this.field2534 = var5;
            }
        }
        this.field2534 = (int) (Math.sqrt((double) this.field2534) + 0.99D);
        this.field2512 = (int) (Math.sqrt((double) (this.field2449 * this.field2449 + this.field2534 * this.field2534)) + 0.99D);
        this.field2537 = this.field2512 + (int) (Math.sqrt((double) (this.field2534 * this.field2534 + this.field2533 * this.field2533)) + 0.99D);
    }

    @ObfuscatedName("hl.e()V")
    public void method4067() {
        if (this.field2532 == 2) {
            return;
        }
        this.field2532 = 2;
        this.field2534 = 0;
        for (int var1 = 0; var1 < this.field2572; var1++) {
            int var2 = this.field2510[var1];
            int var3 = this.field2511[var1];
            int var4 = this.field2525[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2534) {
                this.field2534 = var5;
            }
        }
        this.field2534 = (int) (Math.sqrt((double) this.field2534) + 0.99D);
        this.field2512 = this.field2534;
        this.field2537 = this.field2534 + this.field2534;
    }

    @ObfuscatedName("hl.i()I")
    public int method4092() {
        this.method4076();
        return this.field2534;
    }

    @ObfuscatedName("hl.y()V")
    public void method4069() {
        this.field2532 = 0;
        this.field2535 = -1;
    }

    @ObfuscatedName("hl.w(Lht;I)V")
    public void method4070(class216 arg0, int arg1) {
        if (this.field2522 == null || arg1 == -1) {
            return;
        }
        class209 var3 = arg0.field2454[arg1];
        class212 var4 = var3.field2306;
        Statics.field2563 = 0;
        Statics.field2564 = 0;
        Statics.field2565 = 0;
        for (int var5 = 0; var5 < var3.field2311; var5++) {
            int var6 = var3.field2312[var5];
            this.method4072(var4.field2375[var6], var4.field2379[var6], var3.field2310[var5], var3.field2314[var5], var3.field2315[var5]);
        }
        this.method4069();
    }

    @ObfuscatedName("hl.g(Lht;ILht;I[I)V")
    public void method4073(class216 arg0, int arg1, class216 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method4070(arg0, arg1);
            return;
        }
        class209 var6 = arg0.field2454[arg1];
        class209 var7 = arg2.field2454[arg3];
        class212 var8 = var6.field2306;
        Statics.field2563 = 0;
        Statics.field2564 = 0;
        Statics.field2565 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2311; var11++) {
            int var12 = var6.field2312[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2375[var12] == 0) {
                this.method4072(var8.field2375[var12], var8.field2379[var12], var6.field2310[var11], var6.field2314[var11], var6.field2315[var11]);
            }
        }
        Statics.field2563 = 0;
        Statics.field2564 = 0;
        Statics.field2565 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2311; var15++) {
            int var16 = var7.field2312[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2375[var16] == 0) {
                this.method4072(var8.field2375[var16], var8.field2379[var16], var7.field2310[var15], var7.field2314[var15], var7.field2315[var15]);
            }
        }
        this.method4069();
    }

    @ObfuscatedName("hl.v(I[IIII)V")
    public void method4072(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2563 = 0;
            Statics.field2564 = 0;
            Statics.field2565 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2522.length) {
                    int[] var10 = this.field2522[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2563 += this.field2510[var12];
                        Statics.field2564 += this.field2511[var12];
                        Statics.field2565 += this.field2525[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2563 = Statics.field2563 / var7 + arg2;
                Statics.field2564 = Statics.field2564 / var7 + arg3;
                Statics.field2565 = Statics.field2565 / var7 + arg4;
            } else {
                Statics.field2563 = arg2;
                Statics.field2564 = arg3;
                Statics.field2565 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2522.length) {
                    int[] var15 = this.field2522[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2510[var17] += arg2;
                        this.field2511[var17] += arg3;
                        this.field2525[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2522.length) {
                    int[] var20 = this.field2522[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2510[var22] -= Statics.field2563;
                        this.field2511[var22] -= Statics.field2564;
                        this.field2525[var22] -= Statics.field2565;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2569[var25];
                            int var27 = field2570[var25];
                            int var28 = this.field2511[var22] * var26 + this.field2510[var22] * var27 >> 16;
                            this.field2511[var22] = this.field2511[var22] * var27 - this.field2510[var22] * var26 >> 16;
                            this.field2510[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2569[var23];
                            int var30 = field2570[var23];
                            int var31 = this.field2511[var22] * var30 - this.field2525[var22] * var29 >> 16;
                            this.field2525[var22] = this.field2525[var22] * var30 + this.field2511[var22] * var29 >> 16;
                            this.field2511[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2569[var24];
                            int var33 = field2570[var24];
                            int var34 = this.field2525[var22] * var32 + this.field2510[var22] * var33 >> 16;
                            this.field2525[var22] = this.field2525[var22] * var33 - this.field2510[var22] * var32 >> 16;
                            this.field2510[var22] = var34;
                        }
                        this.field2510[var22] += Statics.field2563;
                        this.field2511[var22] += Statics.field2564;
                        this.field2525[var22] += Statics.field2565;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2522.length) {
                    int[] var37 = this.field2522[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2510[var39] -= Statics.field2563;
                        this.field2511[var39] -= Statics.field2564;
                        this.field2525[var39] -= Statics.field2565;
                        this.field2510[var39] = this.field2510[var39] * arg2 / 128;
                        this.field2511[var39] = this.field2511[var39] * arg3 / 128;
                        this.field2525[var39] = this.field2525[var39] * arg4 / 128;
                        this.field2510[var39] += Statics.field2563;
                        this.field2511[var39] += Statics.field2564;
                        this.field2525[var39] += Statics.field2565;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2530 != null && this.field2521 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2530.length) {
                    int[] var42 = this.field2530[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2521[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2521[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hl.s()V")
    public void method4098() {
        for (int var1 = 0; var1 < this.field2572; var1++) {
            int var2 = this.field2510[var1];
            this.field2510[var1] = this.field2525[var1];
            this.field2525[var1] = -var2;
        }
        this.method4069();
    }

    @ObfuscatedName("hl.c()V")
    public void method4075() {
        for (int var1 = 0; var1 < this.field2572; var1++) {
            this.field2510[var1] = -this.field2510[var1];
            this.field2525[var1] = -this.field2525[var1];
        }
        this.method4069();
    }

    @ObfuscatedName("hl.b()V")
    public void method4136() {
        for (int var1 = 0; var1 < this.field2572; var1++) {
            int var2 = this.field2525[var1];
            this.field2525[var1] = this.field2510[var1];
            this.field2510[var1] = -var2;
        }
        this.method4069();
    }

    @ObfuscatedName("hl.x(I)V")
    public void method4077(int arg0) {
        int var2 = field2569[arg0];
        int var3 = field2570[arg0];
        for (int var4 = 0; var4 < this.field2572; var4++) {
            int var5 = this.field2511[var4] * var3 - this.field2525[var4] * var2 >> 16;
            this.field2525[var4] = this.field2525[var4] * var3 + this.field2511[var4] * var2 >> 16;
            this.field2511[var4] = var5;
        }
        this.method4069();
    }

    @ObfuscatedName("hl.p(III)V")
    public void method4119(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2572; var4++) {
            this.field2510[var4] += arg0;
            this.field2511[var4] += arg1;
            this.field2525[var4] += arg2;
        }
        this.method4069();
    }

    @ObfuscatedName("hl.z(III)V")
    public void method4068(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2572; var4++) {
            this.field2510[var4] = this.field2510[var4] * arg0 / 128;
            this.field2511[var4] = this.field2511[var4] * arg1 / 128;
            this.field2525[var4] = this.field2525[var4] * arg2 / 128;
        }
        this.method4069();
    }

    @ObfuscatedName("hl.h(IIIIIII)V")
    public final void method4078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2540[0] = -1;
        if (this.field2532 != 2 && this.field2532 != 1) {
            this.method4067();
        }
        int var8 = Statics.field2358;
        int var9 = Statics.field2354;
        int var10 = field2569[arg0];
        int var11 = field2570[arg0];
        int var12 = field2569[arg1];
        int var13 = field2570[arg1];
        int var14 = field2569[arg2];
        int var15 = field2570[arg2];
        int var16 = field2569[arg3];
        int var17 = field2570[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2572; var19++) {
            int var20 = this.field2510[var19];
            int var21 = this.field2511[var19];
            int var22 = this.field2525[var19];
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
            field2548[var19] = var30 - var18;
            field2546[var19] = class211.field2357 * var26 / var30 + var8;
            field2547[var19] = class211.field2357 * var29 / var30 + var9;
            if (this.field2571 > 0) {
                field2549[var19] = var26;
                field2550[var19] = var29;
                field2515[var19] = var30;
            }
        }
        try {
            this.method4081(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("hl.o(IIIIIIII)V")
    public final void method4107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2540[0] = -1;
        if (this.field2532 != 2 && this.field2532 != 1) {
            this.method4067();
        }
        int var9 = Statics.field2358;
        int var10 = Statics.field2354;
        int var11 = field2569[arg0];
        int var12 = field2570[arg0];
        int var13 = field2569[arg1];
        int var14 = field2570[arg1];
        int var15 = field2569[arg2];
        int var16 = field2570[arg2];
        int var17 = field2569[arg3];
        int var18 = field2570[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2572; var20++) {
            int var21 = this.field2510[var20];
            int var22 = this.field2511[var20];
            int var23 = this.field2525[var20];
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
            field2548[var20] = var31 - var19;
            field2546[var20] = class211.field2357 * var27 / arg7 + var9;
            field2547[var20] = class211.field2357 * var30 / arg7 + var10;
            if (this.field2571 > 0) {
                field2549[var20] = var27;
                field2550[var20] = var30;
                field2515[var20] = var31;
            }
        }
        try {
            this.method4081(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("hl.cr(IIIIIIIIJ)V")
    public void method4015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2540[0] = -1;
        if (this.field2532 != 1) {
            this.method4076();
        }
        this.method4065(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2534 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2534) * class211.field2357;
        if (var16 / var14 >= Statics.field2351) {
            return;
        }
        int var17 = (this.field2534 + var15) * class211.field2357;
        if (var17 / var14 <= Statics.field2362) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2534 * arg1 >> 16;
        int var20 = (var18 + var19) * class211.field2357;
        if (var20 / var14 <= Statics.field2364) {
            return;
        }
        int var21 = (this.field2449 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class211.field2357;
        if (var22 / var14 >= Statics.field2365) {
            return;
        }
        int var23 = (this.field2449 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field2571 > 0;
        int var27 = class221.method2131();
        int var28 = class221.method2896();
        boolean var29 = class221.method503();
        boolean var30 = class221.method57(arg8);
        boolean var31 = false;
        if (var30 && var29) {
            boolean var32 = false;
            if (field2539) {
                var32 = class221.method172(this, arg5, arg6, arg7);
            } else {
                int var33 = var12 - var13;
                if (var33 <= 50) {
                    var33 = 50;
                }
                int var34;
                int var35;
                if (var15 > 0) {
                    var34 = var16 / var14;
                    var35 = var17 / var33;
                } else {
                    var35 = var17 / var14;
                    var34 = var16 / var33;
                }
                int var36;
                int var37;
                if (var18 > 0) {
                    var36 = var22 / var14;
                    var37 = var20 / var33;
                } else {
                    var37 = var20 / var14;
                    var36 = var22 / var33;
                }
                int var38 = var27 - Statics.field2358;
                int var39 = var28 - Statics.field2354;
                if (var38 > var34 && var38 < var35 && var39 > var36 && var39 < var37) {
                    var32 = true;
                }
            }
            if (var32) {
                if (this.field2531) {
                    class221.field2583[++class221.field2582 - 1] = arg8;
                } else {
                    var31 = true;
                }
            }
        }
        int var42 = Statics.field2358;
        int var43 = Statics.field2354;
        int var44 = 0;
        int var45 = 0;
        if (arg0 != 0) {
            var44 = field2569[arg0];
            var45 = field2570[arg0];
        }
        for (int var46 = 0; var46 < this.field2572; var46++) {
            int var47 = this.field2510[var46];
            int var48 = this.field2511[var46];
            int var49 = this.field2525[var46];
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
            field2548[var46] = var58 - var12;
            if (var58 >= 50) {
                field2546[var46] = class211.field2357 * var54 / var58 + var42;
                field2547[var46] = class211.field2357 * var57 / var58 + var43;
            } else {
                field2546[var46] = -5000;
                var24 = true;
            }
            if (var26) {
                field2549[var46] = var54;
                field2550[var46] = var57;
                field2515[var46] = var58;
            }
        }
        try {
            this.method4081(var24, var31, this.field2531, arg8);
        } catch (Exception var61) {
        }
    }

    @ObfuscatedName("hl.r(ZZZJ)V")
    public final void method4081(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2537 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field2537; var6++) {
            field2540[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field2513; var8++) {
            if (this.field2566[var8] != -2) {
                int var9 = this.field2514[var8];
                int var10 = this.field2519[var8];
                int var11 = this.field2553[var8];
                int var12 = field2546[var9];
                int var13 = field2546[var10];
                int var14 = field2546[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2549[var9];
                    int var16 = field2549[var10];
                    int var17 = field2549[var11];
                    int var18 = field2550[var9];
                    int var19 = field2550[var10];
                    int var20 = field2550[var11];
                    int var21 = field2515[var9];
                    int var22 = field2515[var10];
                    int var23 = field2515[var11];
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
                        field2545[var8] = true;
                        int var33 = (field2548[var9] + field2548[var10] + field2548[var11]) / 3 + this.field2512;
                        field2554[var33][field2540[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field2547[var9];
                        int var35 = field2547[var10];
                        int var36 = field2547[var11];
                        int var37 = class221.field2575 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class221.field2575 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class221.field2576 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class221.field2576 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class221.field2583[++class221.field2582 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field2547[var11] - field2547[var10]) * (var12 - var13) - (field2547[var9] - field2547[var10]) * (var14 - var13) > 0) {
                        field2545[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field2360 && var13 <= Statics.field2360 && var14 <= Statics.field2360) {
                            field2544[var8] = false;
                        } else {
                            field2544[var8] = true;
                        }
                        int var44 = (field2548[var9] + field2548[var10] + field2548[var11]) / 3 + this.field2512;
                        field2554[var44][field2540[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field2520 == null) {
            for (int var45 = this.field2537 - 1; var45 >= 0; var45--) {
                int var46 = field2540[var45];
                if (var46 > 0) {
                    int[] var47 = field2554[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method4082(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field2555[var49] = 0;
            field2559[var49] = 0;
        }
        for (int var50 = this.field2537 - 1; var50 >= 0; var50--) {
            int var51 = field2540[var50];
            if (var51 > 0) {
                int[] var52 = field2554[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field2520[var54];
                    int var56 = field2555[var55]++;
                    field2556[var55][var56] = var54;
                    if (var55 < 10) {
                        field2559[var55] += var50;
                    } else if (var55 == 10) {
                        field2557[var56] = var50;
                    } else {
                        field2558[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field2555[1] > 0 || field2555[2] > 0) {
            var57 = (field2559[1] + field2559[2]) / (field2555[1] + field2555[2]);
        }
        int var58 = 0;
        if (field2555[3] > 0 || field2555[4] > 0) {
            var58 = (field2559[3] + field2559[4]) / (field2555[3] + field2555[4]);
        }
        int var59 = 0;
        if (field2555[6] > 0 || field2555[8] > 0) {
            var59 = (field2559[6] + field2559[8]) / (field2555[6] + field2555[8]);
        }
        int var60 = 0;
        int var61 = field2555[10];
        int[] var62 = field2556[10];
        int[] var63 = field2557;
        if (var60 == var61) {
            var60 = 0;
            var61 = field2555[11];
            var62 = field2556[11];
            var63 = field2558;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method4082(var62[var60++]);
                if (var60 == var61 && field2556[11] != var62) {
                    var60 = 0;
                    var61 = field2555[11];
                    var62 = field2556[11];
                    var63 = field2558;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method4082(var62[var60++]);
                if (var60 == var61 && field2556[11] != var62) {
                    var60 = 0;
                    var61 = field2555[11];
                    var62 = field2556[11];
                    var63 = field2558;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method4082(var62[var60++]);
                if (var60 == var61 && field2556[11] != var62) {
                    var60 = 0;
                    var61 = field2555[11];
                    var62 = field2556[11];
                    var63 = field2558;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field2555[var65];
            int[] var67 = field2556[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method4082(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method4082(var62[var60++]);
            if (var60 == var61 && field2556[11] != var62) {
                var60 = 0;
                var62 = field2556[11];
                var61 = field2555[11];
                var63 = field2558;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("hl.n(I)V")
    public final void method4082(int arg0) {
        if (field2545[arg0]) {
            this.method4083(arg0);
            return;
        }
        int var2 = this.field2514[arg0];
        int var3 = this.field2519[arg0];
        int var4 = this.field2553[arg0];
        class211.field2348 = field2544[arg0];
        if (this.field2521 == null) {
            class211.field2368 = 0;
        } else {
            class211.field2368 = this.field2521[arg0] & 0xFF;
        }
        if (this.field2561 != null && this.field2561[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2505 == null || this.field2505[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2505[arg0] & 0xFF;
                var6 = this.field2526[var5];
                var7 = this.field2527[var5];
                var8 = this.field2528[var5];
            }
            if (this.field2566[arg0] == -1) {
                class211.method3759(field2547[var2], field2547[var3], field2547[var4], field2546[var2], field2546[var3], field2546[var4], this.field2517[arg0], this.field2517[arg0], this.field2517[arg0], field2549[var6], field2549[var7], field2549[var8], field2550[var6], field2550[var7], field2550[var8], field2515[var6], field2515[var7], field2515[var8], this.field2561[arg0]);
            } else {
                class211.method3759(field2547[var2], field2547[var3], field2547[var4], field2546[var2], field2546[var3], field2546[var4], this.field2517[arg0], this.field2518[arg0], this.field2566[arg0], field2549[var6], field2549[var7], field2549[var8], field2550[var6], field2550[var7], field2550[var8], field2515[var6], field2515[var7], field2515[var8], this.field2561[arg0]);
            }
        } else if (this.field2566[arg0] == -1) {
            class211.method3757(field2547[var2], field2547[var3], field2547[var4], field2546[var2], field2546[var3], field2546[var4], field2516[this.field2517[arg0]]);
        } else {
            class211.method3755(field2547[var2], field2547[var3], field2547[var4], field2546[var2], field2546[var3], field2546[var4], this.field2517[arg0], this.field2518[arg0], this.field2566[arg0]);
        }
    }

    @ObfuscatedName("hl.u(I)V")
    public final void method4083(int arg0) {
        int var2 = Statics.field2358;
        int var3 = Statics.field2354;
        int var4 = 0;
        int var5 = this.field2514[arg0];
        int var6 = this.field2519[arg0];
        int var7 = this.field2553[arg0];
        int var8 = field2515[var5];
        int var9 = field2515[var6];
        int var10 = field2515[var7];
        if (this.field2521 == null) {
            class211.field2368 = 0;
        } else {
            class211.field2368 = this.field2521[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2560[var4] = field2546[var5];
            field2508[var4] = field2547[var5];
            field2562[var4++] = this.field2517[arg0];
        } else {
            int var11 = field2549[var5];
            int var12 = field2550[var5];
            int var13 = this.field2517[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2509[var10 - var8];
                field2560[var4] = (((field2549[var7] - var11) * var14 >> 16) + var11) * class211.field2357 / 50 + var2;
                field2508[var4] = (((field2550[var7] - var12) * var14 >> 16) + var12) * class211.field2357 / 50 + var3;
                field2562[var4++] = ((this.field2566[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2509[var9 - var8];
                field2560[var4] = (((field2549[var6] - var11) * var15 >> 16) + var11) * class211.field2357 / 50 + var2;
                field2508[var4] = (((field2550[var6] - var12) * var15 >> 16) + var12) * class211.field2357 / 50 + var3;
                field2562[var4++] = ((this.field2518[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2560[var4] = field2546[var6];
            field2508[var4] = field2547[var6];
            field2562[var4++] = this.field2518[arg0];
        } else {
            int var16 = field2549[var6];
            int var17 = field2550[var6];
            int var18 = this.field2518[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2509[var8 - var9];
                field2560[var4] = (((field2549[var5] - var16) * var19 >> 16) + var16) * class211.field2357 / 50 + var2;
                field2508[var4] = (((field2550[var5] - var17) * var19 >> 16) + var17) * class211.field2357 / 50 + var3;
                field2562[var4++] = ((this.field2517[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2509[var10 - var9];
                field2560[var4] = (((field2549[var7] - var16) * var20 >> 16) + var16) * class211.field2357 / 50 + var2;
                field2508[var4] = (((field2550[var7] - var17) * var20 >> 16) + var17) * class211.field2357 / 50 + var3;
                field2562[var4++] = ((this.field2566[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2560[var4] = field2546[var7];
            field2508[var4] = field2547[var7];
            field2562[var4++] = this.field2566[arg0];
        } else {
            int var21 = field2549[var7];
            int var22 = field2550[var7];
            int var23 = this.field2566[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2509[var9 - var10];
                field2560[var4] = (((field2549[var6] - var21) * var24 >> 16) + var21) * class211.field2357 / 50 + var2;
                field2508[var4] = (((field2550[var6] - var22) * var24 >> 16) + var22) * class211.field2357 / 50 + var3;
                field2562[var4++] = ((this.field2518[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2509[var8 - var10];
                field2560[var4] = (((field2549[var5] - var21) * var25 >> 16) + var21) * class211.field2357 / 50 + var2;
                field2508[var4] = (((field2550[var5] - var22) * var25 >> 16) + var22) * class211.field2357 / 50 + var3;
                field2562[var4++] = ((this.field2517[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2560[0];
        int var27 = field2560[1];
        int var28 = field2560[2];
        int var29 = field2508[0];
        int var30 = field2508[1];
        int var31 = field2508[2];
        class211.field2348 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2360 || var27 > Statics.field2360 || var28 > Statics.field2360) {
                class211.field2348 = true;
            }
            if (this.field2561 != null && this.field2561[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2505 == null || this.field2505[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2505[arg0] & 0xFF;
                    var33 = this.field2526[var32];
                    var34 = this.field2527[var32];
                    var35 = this.field2528[var32];
                }
                if (this.field2566[arg0] == -1) {
                    class211.method3759(var29, var30, var31, var26, var27, var28, this.field2517[arg0], this.field2517[arg0], this.field2517[arg0], field2549[var33], field2549[var34], field2549[var35], field2550[var33], field2550[var34], field2550[var35], field2515[var33], field2515[var34], field2515[var35], this.field2561[arg0]);
                } else {
                    class211.method3759(var29, var30, var31, var26, var27, var28, field2562[0], field2562[1], field2562[2], field2549[var33], field2549[var34], field2549[var35], field2550[var33], field2550[var34], field2550[var35], field2515[var33], field2515[var34], field2515[var35], this.field2561[arg0]);
                }
            } else if (this.field2566[arg0] == -1) {
                class211.method3757(var29, var30, var31, var26, var27, var28, field2516[this.field2517[arg0]]);
            } else {
                class211.method3755(var29, var30, var31, var26, var27, var28, field2562[0], field2562[1], field2562[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2360 || var27 > Statics.field2360 || var28 > Statics.field2360 || field2560[3] < 0 || field2560[3] > Statics.field2360) {
            class211.field2348 = true;
        }
        if (this.field2561 != null && this.field2561[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2505 == null || this.field2505[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2505[arg0] & 0xFF;
                var37 = this.field2526[var36];
                var38 = this.field2527[var36];
                var39 = this.field2528[var36];
            }
            short var40 = this.field2561[arg0];
            if (this.field2566[arg0] == -1) {
                class211.method3759(var29, var30, var31, var26, var27, var28, this.field2517[arg0], this.field2517[arg0], this.field2517[arg0], field2549[var37], field2549[var38], field2549[var39], field2550[var37], field2550[var38], field2550[var39], field2515[var37], field2515[var38], field2515[var39], var40);
                class211.method3759(var29, var31, field2508[3], var26, var28, field2560[3], this.field2517[arg0], this.field2517[arg0], this.field2517[arg0], field2549[var37], field2549[var38], field2549[var39], field2550[var37], field2550[var38], field2550[var39], field2515[var37], field2515[var38], field2515[var39], var40);
            } else {
                class211.method3759(var29, var30, var31, var26, var27, var28, field2562[0], field2562[1], field2562[2], field2549[var37], field2549[var38], field2549[var39], field2550[var37], field2550[var38], field2550[var39], field2515[var37], field2515[var38], field2515[var39], var40);
                class211.method3759(var29, var31, field2508[3], var26, var28, field2560[3], field2562[0], field2562[2], field2562[3], field2549[var37], field2549[var38], field2549[var39], field2550[var37], field2550[var38], field2550[var39], field2515[var37], field2515[var38], field2515[var39], var40);
            }
        } else if (this.field2566[arg0] == -1) {
            int var41 = field2516[this.field2517[arg0]];
            class211.method3757(var29, var30, var31, var26, var27, var28, var41);
            class211.method3757(var29, var31, field2508[3], var26, var28, field2560[3], var41);
        } else {
            class211.method3755(var29, var30, var31, var26, var27, var28, field2562[0], field2562[1], field2562[2]);
            class211.method3755(var29, var31, field2508[3], var26, var28, field2560[3], field2562[0], field2562[2], field2562[3]);
        }
    }
}
