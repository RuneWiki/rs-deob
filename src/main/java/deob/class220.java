package deob;

@ObfuscatedName("hl")
public class class220 extends class214 {

    @ObfuscatedName("hl.i")
    public static class220 field2542 = new class220();

    @ObfuscatedName("hl.w")
    public static byte[] field2510 = new byte[1];

    @ObfuscatedName("hl.s")
    public static class220 field2569 = new class220();

    @ObfuscatedName("hl.a")
    public static byte[] field2512 = new byte[1];

    @ObfuscatedName("hl.o")
    public int field2513 = 0;

    @ObfuscatedName("hl.g")
    public int[] field2514;

    @ObfuscatedName("hl.e")
    public int[] field2515;

    @ObfuscatedName("hl.p")
    public int[] field2516;

    @ObfuscatedName("hl.j")
    public int field2517 = 0;

    @ObfuscatedName("hl.b")
    public int[] field2518;

    @ObfuscatedName("hl.x")
    public int[] field2519;

    @ObfuscatedName("hl.y")
    public int[] field2520;

    @ObfuscatedName("hl.k")
    public int[] field2521;

    @ObfuscatedName("hl.t")
    public int[] field2563;

    @ObfuscatedName("hl.l")
    public int[] field2556;

    @ObfuscatedName("hl.u")
    public byte[] field2524;

    @ObfuscatedName("hl.n")
    public byte[] field2525;

    @ObfuscatedName("hl.z")
    public byte[] field2567;

    @ObfuscatedName("hl.q")
    public short[] field2527;

    @ObfuscatedName("hl.d")
    public byte field2528 = 0;

    @ObfuscatedName("hl.r")
    public int field2523 = 0;

    @ObfuscatedName("hl.m")
    public int[] field2530;

    @ObfuscatedName("hl.c")
    public int[] field2531;

    @ObfuscatedName("hl.f")
    public int[] field2539;

    @ObfuscatedName("hl.h")
    public int[][] field2533;

    @ObfuscatedName("hl.v")
    public int[][] field2534;

    @ObfuscatedName("hl.ag")
    public boolean field2570 = false;

    @ObfuscatedName("hl.ae")
    public int field2536;

    @ObfuscatedName("hl.aq")
    public int field2537;

    @ObfuscatedName("hl.al")
    public int field2538;

    @ObfuscatedName("hl.am")
    public int field2526;

    @ObfuscatedName("hl.ai")
    public int field2553;

    @ObfuscatedName("hl.ah")
    public int field2540;

    @ObfuscatedName("hl.as")
    public int field2532;

    @ObfuscatedName("hl.at")
    public int field2554;

    @ObfuscatedName("hl.az")
    public int field2544 = -1;

    @ObfuscatedName("hl.ac")
    public int field2545 = -1;

    @ObfuscatedName("hl.ak")
    public int field2546 = -1;

    @ObfuscatedName("hl.ar")
    public static boolean[] field2555 = new boolean[6500];

    @ObfuscatedName("hl.ad")
    public static boolean[] field2549 = new boolean[6500];

    @ObfuscatedName("hl.an")
    public static int[] field2550 = new int[6500];

    @ObfuscatedName("hl.ax")
    public static int[] field2551 = new int[6500];

    @ObfuscatedName("hl.av")
    public static int[] field2552 = new int[6500];

    @ObfuscatedName("hl.ap")
    public static int[] field2575 = new int[6500];

    @ObfuscatedName("hl.au")
    public static int[] field2548 = new int[6500];

    @ObfuscatedName("hl.aj")
    public static int[] field2576 = new int[6500];

    @ObfuscatedName("hl.aw")
    public static int[] field2557 = new int[1600];

    @ObfuscatedName("hl.ao")
    public static int[][] field2558 = new int[1600][512];

    @ObfuscatedName("hl.aa")
    public static int[] field2559 = new int[12];

    @ObfuscatedName("hl.ay")
    public static int[][] field2560 = new int[12][2000];

    @ObfuscatedName("hl.bg")
    public static int[] field2561 = new int[2000];

    @ObfuscatedName("hl.bl")
    public static int[] field2562 = new int[2000];

    @ObfuscatedName("hl.bx")
    public static int[] field2529 = new int[12];

    @ObfuscatedName("hl.bd")
    public static int[] field2564 = new int[10];

    @ObfuscatedName("hl.bt")
    public static int[] field2565 = new int[10];

    @ObfuscatedName("hl.bf")
    public static int[] field2522 = new int[10];

    @ObfuscatedName("hl.bm")
    public static boolean field2577 = true;

    @ObfuscatedName("hl.bo")
    public static int[] field2543 = class211.field2362;

    @ObfuscatedName("hl.bv")
    public static int[] field2574 = class211.field2370;

    @ObfuscatedName("hl.bu")
    public static int[] field2541 = class211.field2365;

    @ObfuscatedName("hl.bz")
    public static int[] field2509 = class211.field2348;

    public class220() {
    }

    public class220(class220[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2513 = 0;
        this.field2517 = 0;
        this.field2523 = 0;
        this.field2528 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class220 var8 = arg0[var7];
            if (var8 != null) {
                this.field2513 += var8.field2513;
                this.field2517 += var8.field2517;
                this.field2523 += var8.field2523;
                if (var8.field2524 == null) {
                    if (this.field2528 == -1) {
                        this.field2528 = var8.field2528;
                    }
                    if (this.field2528 != var8.field2528) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2525 != null;
                var5 |= var8.field2527 != null;
                var6 |= var8.field2567 != null;
            }
        }
        this.field2514 = new int[this.field2513];
        this.field2515 = new int[this.field2513];
        this.field2516 = new int[this.field2513];
        this.field2518 = new int[this.field2517];
        this.field2519 = new int[this.field2517];
        this.field2520 = new int[this.field2517];
        this.field2521 = new int[this.field2517];
        this.field2563 = new int[this.field2517];
        this.field2556 = new int[this.field2517];
        if (var3) {
            this.field2524 = new byte[this.field2517];
        }
        if (var4) {
            this.field2525 = new byte[this.field2517];
        }
        if (var5) {
            this.field2527 = new short[this.field2517];
        }
        if (var6) {
            this.field2567 = new byte[this.field2517];
        }
        if (this.field2523 > 0) {
            this.field2530 = new int[this.field2523];
            this.field2531 = new int[this.field2523];
            this.field2539 = new int[this.field2523];
        }
        this.field2513 = 0;
        this.field2517 = 0;
        this.field2523 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class220 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2517; var11++) {
                    this.field2518[this.field2517] = var10.field2518[var11] + this.field2513;
                    this.field2519[this.field2517] = var10.field2519[var11] + this.field2513;
                    this.field2520[this.field2517] = var10.field2520[var11] + this.field2513;
                    this.field2521[this.field2517] = var10.field2521[var11];
                    this.field2563[this.field2517] = var10.field2563[var11];
                    this.field2556[this.field2517] = var10.field2556[var11];
                    if (var3) {
                        if (var10.field2524 == null) {
                            this.field2524[this.field2517] = var10.field2528;
                        } else {
                            this.field2524[this.field2517] = var10.field2524[var11];
                        }
                    }
                    if (var4 && var10.field2525 != null) {
                        this.field2525[this.field2517] = var10.field2525[var11];
                    }
                    if (var5) {
                        if (var10.field2527 == null) {
                            this.field2527[this.field2517] = -1;
                        } else {
                            this.field2527[this.field2517] = var10.field2527[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2567 == null || var10.field2567[var11] == -1) {
                            this.field2567[this.field2517] = -1;
                        } else {
                            this.field2567[this.field2517] = (byte) (var10.field2567[var11] + this.field2523);
                        }
                    }
                    this.field2517++;
                }
                for (int var12 = 0; var12 < var10.field2523; var12++) {
                    this.field2530[this.field2523] = var10.field2530[var12] + this.field2513;
                    this.field2531[this.field2523] = var10.field2531[var12] + this.field2513;
                    this.field2539[this.field2523] = var10.field2539[var12] + this.field2513;
                    this.field2523++;
                }
                for (int var13 = 0; var13 < var10.field2513; var13++) {
                    this.field2514[this.field2513] = var10.field2514[var13];
                    this.field2515[this.field2513] = var10.field2515[var13];
                    this.field2516[this.field2513] = var10.field2516[var13];
                    this.field2513++;
                }
            }
        }
    }

    @ObfuscatedName("hl.i([[IIIIZI)Lhl;")
    public class220 method4063(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4095();
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
            var15.field2513 = this.field2513;
            var15.field2517 = this.field2517;
            var15.field2523 = this.field2523;
            var15.field2514 = this.field2514;
            var15.field2516 = this.field2516;
            var15.field2518 = this.field2518;
            var15.field2519 = this.field2519;
            var15.field2520 = this.field2520;
            var15.field2521 = this.field2521;
            var15.field2563 = this.field2563;
            var15.field2556 = this.field2556;
            var15.field2524 = this.field2524;
            var15.field2525 = this.field2525;
            var15.field2567 = this.field2567;
            var15.field2527 = this.field2527;
            var15.field2528 = this.field2528;
            var15.field2530 = this.field2530;
            var15.field2531 = this.field2531;
            var15.field2539 = this.field2539;
            var15.field2533 = this.field2533;
            var15.field2534 = this.field2534;
            var15.field2570 = this.field2570;
            var15.field2515 = new int[var15.field2513];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2513; var16++) {
                int var17 = this.field2514[var16] + arg1;
                int var18 = this.field2516[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2515[var16] = this.field2515[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2513; var26++) {
                int var27 = (-this.field2515[var26] << 16) / this.field2444;
                if (var27 < arg5) {
                    int var28 = this.field2514[var26] + arg1;
                    int var29 = this.field2516[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2515[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2515[var26];
                }
            }
        }
        var15.method4072();
        return var15;
    }

    @ObfuscatedName("hl.s(Z)Lhl;")
    public class220 method4065(boolean arg0) {
        if (!arg0 && field2510.length < this.field2517) {
            field2510 = new byte[this.field2517 + 100];
        }
        return this.method4096(arg0, field2542, field2510);
    }

    @ObfuscatedName("hl.a(Z)Lhl;")
    public class220 method4066(boolean arg0) {
        if (!arg0 && field2512.length < this.field2517) {
            field2512 = new byte[this.field2517 + 100];
        }
        return this.method4096(arg0, field2569, field2512);
    }

    @ObfuscatedName("hl.j(ZLhl;[B)Lhl;")
    public class220 method4096(boolean arg0, class220 arg1, byte[] arg2) {
        arg1.field2513 = this.field2513;
        arg1.field2517 = this.field2517;
        arg1.field2523 = this.field2523;
        if (arg1.field2514 == null || arg1.field2514.length < this.field2513) {
            arg1.field2514 = new int[this.field2513 + 100];
            arg1.field2515 = new int[this.field2513 + 100];
            arg1.field2516 = new int[this.field2513 + 100];
        }
        for (int var4 = 0; var4 < this.field2513; var4++) {
            arg1.field2514[var4] = this.field2514[var4];
            arg1.field2515[var4] = this.field2515[var4];
            arg1.field2516[var4] = this.field2516[var4];
        }
        if (arg0) {
            arg1.field2525 = this.field2525;
        } else {
            arg1.field2525 = arg2;
            if (this.field2525 == null) {
                for (int var5 = 0; var5 < this.field2517; var5++) {
                    arg1.field2525[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2517; var6++) {
                    arg1.field2525[var6] = this.field2525[var6];
                }
            }
        }
        arg1.field2518 = this.field2518;
        arg1.field2519 = this.field2519;
        arg1.field2520 = this.field2520;
        arg1.field2521 = this.field2521;
        arg1.field2563 = this.field2563;
        arg1.field2556 = this.field2556;
        arg1.field2524 = this.field2524;
        arg1.field2567 = this.field2567;
        arg1.field2527 = this.field2527;
        arg1.field2528 = this.field2528;
        arg1.field2530 = this.field2530;
        arg1.field2531 = this.field2531;
        arg1.field2539 = this.field2539;
        arg1.field2533 = this.field2533;
        arg1.field2534 = this.field2534;
        arg1.field2570 = this.field2570;
        arg1.method4072();
        return arg1;
    }

    @ObfuscatedName("hl.b(I)V")
    public void method4135(int arg0) {
        if (this.field2544 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2574[arg0];
        int var9 = field2543[arg0];
        for (int var10 = 0; var10 < this.field2513; var10++) {
            int var11 = class211.method3768(this.field2514[var10], this.field2516[var10], var8, var9);
            int var12 = this.field2515[var10];
            int var13 = class211.method3791(this.field2514[var10], this.field2516[var10], var8, var9);
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
        this.field2540 = (var2 + var5) / 2;
        this.field2532 = (var3 + var6) / 2;
        this.field2554 = (var4 + var7) / 2;
        this.field2544 = (var5 - var2 + 1) / 2;
        this.field2545 = (var6 - var3 + 1) / 2;
        this.field2546 = (var7 - var4 + 1) / 2;
        if (this.field2544 < 32) {
            this.field2544 = 32;
        }
        if (this.field2546 < 32) {
            this.field2546 = 32;
        }
        if (this.field2570) {
            this.field2544 += 8;
            this.field2546 += 8;
        }
    }

    @ObfuscatedName("hl.x()V")
    public void method4095() {
        if (this.field2536 == 1) {
            return;
        }
        this.field2536 = 1;
        this.field2444 = 0;
        this.field2537 = 0;
        this.field2538 = 0;
        for (int var1 = 0; var1 < this.field2513; var1++) {
            int var2 = this.field2514[var1];
            int var3 = this.field2515[var1];
            int var4 = this.field2516[var1];
            if (-var3 > this.field2444) {
                this.field2444 = -var3;
            }
            if (var3 > this.field2537) {
                this.field2537 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2538) {
                this.field2538 = var5;
            }
        }
        this.field2538 = (int) (Math.sqrt((double) this.field2538) + 0.99D);
        this.field2553 = (int) (Math.sqrt((double) (this.field2444 * this.field2444 + this.field2538 * this.field2538)) + 0.99D);
        this.field2526 = this.field2553 + (int) (Math.sqrt((double) (this.field2538 * this.field2538 + this.field2537 * this.field2537)) + 0.99D);
    }

    @ObfuscatedName("hl.y()V")
    public void method4077() {
        if (this.field2536 == 2) {
            return;
        }
        this.field2536 = 2;
        this.field2538 = 0;
        for (int var1 = 0; var1 < this.field2513; var1++) {
            int var2 = this.field2514[var1];
            int var3 = this.field2515[var1];
            int var4 = this.field2516[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2538) {
                this.field2538 = var5;
            }
        }
        this.field2538 = (int) (Math.sqrt((double) this.field2538) + 0.99D);
        this.field2553 = this.field2538;
        this.field2526 = this.field2538 + this.field2538;
    }

    @ObfuscatedName("hl.k()I")
    public int method4079() {
        this.method4095();
        return this.field2538;
    }

    @ObfuscatedName("hl.t()V")
    public void method4072() {
        this.field2536 = 0;
        this.field2544 = -1;
    }

    @ObfuscatedName("hl.l(Lho;I)V")
    public void method4073(class216 arg0, int arg1) {
        if (this.field2533 == null || arg1 == -1) {
            return;
        }
        class209 var3 = arg0.field2453[arg1];
        class212 var4 = var3.field2314;
        Statics.field2535 = 0;
        Statics.field2568 = 0;
        Statics.field2573 = 0;
        for (int var5 = 0; var5 < var3.field2311; var5++) {
            int var6 = var3.field2316[var5];
            this.method4075(var4.field2371[var6], var4.field2373[var6], var3.field2317[var5], var3.field2312[var5], var3.field2319[var5]);
        }
        this.method4072();
    }

    @ObfuscatedName("hl.u(Lho;ILho;I[I)V")
    public void method4117(class216 arg0, int arg1, class216 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method4073(arg0, arg1);
            return;
        }
        class209 var6 = arg0.field2453[arg1];
        class209 var7 = arg2.field2453[arg3];
        class212 var8 = var6.field2314;
        Statics.field2535 = 0;
        Statics.field2568 = 0;
        Statics.field2573 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2311; var11++) {
            int var12 = var6.field2316[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2371[var12] == 0) {
                this.method4075(var8.field2371[var12], var8.field2373[var12], var6.field2317[var11], var6.field2312[var11], var6.field2319[var11]);
            }
        }
        Statics.field2535 = 0;
        Statics.field2568 = 0;
        Statics.field2573 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2311; var15++) {
            int var16 = var7.field2316[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2371[var16] == 0) {
                this.method4075(var8.field2371[var16], var8.field2373[var16], var7.field2317[var15], var7.field2312[var15], var7.field2319[var15]);
            }
        }
        this.method4072();
    }

    @ObfuscatedName("hl.n(I[IIII)V")
    public void method4075(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2535 = 0;
            Statics.field2568 = 0;
            Statics.field2573 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2533.length) {
                    int[] var10 = this.field2533[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2535 += this.field2514[var12];
                        Statics.field2568 += this.field2515[var12];
                        Statics.field2573 += this.field2516[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2535 = Statics.field2535 / var7 + arg2;
                Statics.field2568 = Statics.field2568 / var7 + arg3;
                Statics.field2573 = Statics.field2573 / var7 + arg4;
            } else {
                Statics.field2535 = arg2;
                Statics.field2568 = arg3;
                Statics.field2573 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2533.length) {
                    int[] var15 = this.field2533[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2514[var17] += arg2;
                        this.field2515[var17] += arg3;
                        this.field2516[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2533.length) {
                    int[] var20 = this.field2533[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2514[var22] -= Statics.field2535;
                        this.field2515[var22] -= Statics.field2568;
                        this.field2516[var22] -= Statics.field2573;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2543[var25];
                            int var27 = field2574[var25];
                            int var28 = this.field2515[var22] * var26 + this.field2514[var22] * var27 >> 16;
                            this.field2515[var22] = this.field2515[var22] * var27 - this.field2514[var22] * var26 >> 16;
                            this.field2514[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2543[var23];
                            int var30 = field2574[var23];
                            int var31 = this.field2515[var22] * var30 - this.field2516[var22] * var29 >> 16;
                            this.field2516[var22] = this.field2516[var22] * var30 + this.field2515[var22] * var29 >> 16;
                            this.field2515[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2543[var24];
                            int var33 = field2574[var24];
                            int var34 = this.field2516[var22] * var32 + this.field2514[var22] * var33 >> 16;
                            this.field2516[var22] = this.field2516[var22] * var33 - this.field2514[var22] * var32 >> 16;
                            this.field2514[var22] = var34;
                        }
                        this.field2514[var22] += Statics.field2535;
                        this.field2515[var22] += Statics.field2568;
                        this.field2516[var22] += Statics.field2573;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2533.length) {
                    int[] var37 = this.field2533[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2514[var39] -= Statics.field2535;
                        this.field2515[var39] -= Statics.field2568;
                        this.field2516[var39] -= Statics.field2573;
                        this.field2514[var39] = this.field2514[var39] * arg2 / 128;
                        this.field2515[var39] = this.field2515[var39] * arg3 / 128;
                        this.field2516[var39] = this.field2516[var39] * arg4 / 128;
                        this.field2514[var39] += Statics.field2535;
                        this.field2515[var39] += Statics.field2568;
                        this.field2516[var39] += Statics.field2573;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2534 != null && this.field2525 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2534.length) {
                    int[] var42 = this.field2534[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2525[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2525[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hl.z()V")
    public void method4076() {
        for (int var1 = 0; var1 < this.field2513; var1++) {
            int var2 = this.field2514[var1];
            this.field2514[var1] = this.field2516[var1];
            this.field2516[var1] = -var2;
        }
        this.method4072();
    }

    @ObfuscatedName("hl.q()V")
    public void method4064() {
        for (int var1 = 0; var1 < this.field2513; var1++) {
            this.field2514[var1] = -this.field2514[var1];
            this.field2516[var1] = -this.field2516[var1];
        }
        this.method4072();
    }

    @ObfuscatedName("hl.d()V")
    public void method4128() {
        for (int var1 = 0; var1 < this.field2513; var1++) {
            int var2 = this.field2516[var1];
            this.field2516[var1] = this.field2514[var1];
            this.field2514[var1] = -var2;
        }
        this.method4072();
    }

    @ObfuscatedName("hl.r(I)V")
    public void method4071(int arg0) {
        int var2 = field2543[arg0];
        int var3 = field2574[arg0];
        for (int var4 = 0; var4 < this.field2513; var4++) {
            int var5 = this.field2515[var4] * var3 - this.field2516[var4] * var2 >> 16;
            this.field2516[var4] = this.field2516[var4] * var3 + this.field2515[var4] * var2 >> 16;
            this.field2515[var4] = var5;
        }
        this.method4072();
    }

    @ObfuscatedName("hl.m(III)V")
    public void method4070(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2513; var4++) {
            this.field2514[var4] += arg0;
            this.field2515[var4] += arg1;
            this.field2516[var4] += arg2;
        }
        this.method4072();
    }

    @ObfuscatedName("hl.c(III)V")
    public void method4081(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2513; var4++) {
            this.field2514[var4] = this.field2514[var4] * arg0 / 128;
            this.field2515[var4] = this.field2515[var4] * arg1 / 128;
            this.field2516[var4] = this.field2516[var4] * arg2 / 128;
        }
        this.method4072();
    }

    @ObfuscatedName("hl.f(IIIIIII)V")
    public final void method4082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2557[0] = -1;
        if (this.field2536 != 2 && this.field2536 != 1) {
            this.method4077();
        }
        int var8 = Statics.field2347;
        int var9 = Statics.field2357;
        int var10 = field2543[arg0];
        int var11 = field2574[arg0];
        int var12 = field2543[arg1];
        int var13 = field2574[arg1];
        int var14 = field2543[arg2];
        int var15 = field2574[arg2];
        int var16 = field2543[arg3];
        int var17 = field2574[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2513; var19++) {
            int var20 = this.field2514[var19];
            int var21 = this.field2515[var19];
            int var22 = this.field2516[var19];
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
            field2552[var19] = var30 - var18;
            field2550[var19] = class211.field2364 * var26 / var30 + var8;
            field2551[var19] = class211.field2364 * var29 / var30 + var9;
            if (this.field2523 > 0) {
                field2575[var19] = var26;
                field2548[var19] = var29;
                field2576[var19] = var30;
            }
        }
        try {
            this.method4113(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("hl.h(IIIIIIII)V")
    public final void method4068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2557[0] = -1;
        if (this.field2536 != 2 && this.field2536 != 1) {
            this.method4077();
        }
        int var9 = Statics.field2347;
        int var10 = Statics.field2357;
        int var11 = field2543[arg0];
        int var12 = field2574[arg0];
        int var13 = field2543[arg1];
        int var14 = field2574[arg1];
        int var15 = field2543[arg2];
        int var16 = field2574[arg2];
        int var17 = field2543[arg3];
        int var18 = field2574[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2513; var20++) {
            int var21 = this.field2514[var20];
            int var22 = this.field2515[var20];
            int var23 = this.field2516[var20];
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
            field2552[var20] = var31 - var19;
            field2550[var20] = class211.field2364 * var27 / arg7 + var9;
            field2551[var20] = class211.field2364 * var30 / arg7 + var10;
            if (this.field2523 > 0) {
                field2575[var20] = var27;
                field2548[var20] = var30;
                field2576[var20] = var31;
            }
        }
        try {
            this.method4113(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("hl.cl(IIIIIIIIJ)V")
    public void method4016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2557[0] = -1;
        if (this.field2536 != 1) {
            this.method4095();
        }
        this.method4135(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2538 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2538) * class211.field2364;
        if (var16 / var14 >= Statics.field2361) {
            return;
        }
        int var17 = (this.field2538 + var15) * class211.field2364;
        if (var17 / var14 <= Statics.field2360) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2538 * arg1 >> 16;
        int var20 = (var18 + var19) * class211.field2364;
        if (var20 / var14 <= Statics.field2356) {
            return;
        }
        int var21 = (this.field2444 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class211.field2364;
        if (var22 / var14 >= Statics.field2363) {
            return;
        }
        int var23 = (this.field2444 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field2523 > 0;
        int var27 = class221.field2590;
        int var29 = class221.method2911();
        boolean var30 = class221.method3211();
        boolean var31 = class221.method3654(arg8);
        boolean var32 = false;
        if (var31 && var30) {
            boolean var33 = false;
            if (field2577) {
                boolean var35;
                if (class221.method3211()) {
                    if (!class221.field2582) {
                        int var36 = Statics.field2402;
                        int var37 = Statics.field2415;
                        int var38 = Statics.field2404;
                        int var39 = Statics.field2405;
                        byte var40 = 50;
                        short var41 = 3500;
                        int var42 = (class221.field2590 - Statics.field2347) * var40 / class211.field2364;
                        int var43 = (class221.field2581 - Statics.field2357) * var40 / class211.field2364;
                        int var44 = (class221.field2590 - Statics.field2347) * var41 / class211.field2364;
                        int var45 = (class221.field2581 - Statics.field2357) * var41 / class211.field2364;
                        int var46 = class211.method3772(var43, var40, var37, var36);
                        int var47 = class211.method3773(var43, var40, var37, var36);
                        int var49 = class211.method3772(var45, var41, var37, var36);
                        int var50 = class211.method3773(var45, var41, var37, var36);
                        int var52 = class211.method3770(var42, var47, var39, var38);
                        int var53 = class211.method3771(var42, var47, var39, var38);
                        int var55 = class211.method3770(var44, var50, var39, var38);
                        int var56 = class211.method3771(var44, var50, var39, var38);
                        Statics.field2583 = (var52 + var55) / 2;
                        Statics.field2580 = (var46 + var49) / 2;
                        Statics.field1676 = (var53 + var56) / 2;
                        Statics.field2585 = (var55 - var52) / 2;
                        Statics.field4051 = (var49 - var46) / 2;
                        Statics.field2591 = (var56 - var53) / 2;
                        Statics.field3944 = Math.abs(Statics.field2585);
                        Statics.field1404 = Math.abs(Statics.field4051);
                        Statics.field1486 = Math.abs(Statics.field2591);
                    }
                    int var58 = this.field2540 + arg5;
                    int var59 = this.field2532 + arg6;
                    int var60 = this.field2554 + arg7;
                    int var61 = this.field2544;
                    int var62 = this.field2545;
                    int var63 = this.field2546;
                    int var64 = Statics.field2583 - var58;
                    int var65 = Statics.field2580 - var59;
                    int var66 = Statics.field1676 - var60;
                    if (Math.abs(var64) > Statics.field3944 + var61) {
                        var35 = false;
                    } else if (Math.abs(var65) > Statics.field1404 + var62) {
                        var35 = false;
                    } else if (Math.abs(var66) > Statics.field1486 + var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field4051 * var66 - Statics.field2591 * var65) > Statics.field1486 * var62 + Statics.field1404 * var63) {
                        var35 = false;
                    } else if (Math.abs(Statics.field2591 * var64 - Statics.field2585 * var66) > Statics.field3944 * var63 + Statics.field1486 * var61) {
                        var35 = false;
                    } else if (Math.abs(Statics.field2585 * var65 - Statics.field4051 * var64) > Statics.field3944 * var62 + Statics.field1404 * var61) {
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
                int var72 = var27 - Statics.field2347;
                int var73 = var29 - Statics.field2357;
                if (var72 > var68 && var72 < var69 && var73 > var70 && var73 < var71) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field2570) {
                    class221.field2588[++class221.field2587 - 1] = arg8;
                } else {
                    var32 = true;
                }
            }
        }
        int var76 = Statics.field2347;
        int var77 = Statics.field2357;
        int var78 = 0;
        int var79 = 0;
        if (arg0 != 0) {
            var78 = field2543[arg0];
            var79 = field2574[arg0];
        }
        for (int var80 = 0; var80 < this.field2513; var80++) {
            int var81 = this.field2514[var80];
            int var82 = this.field2515[var80];
            int var83 = this.field2516[var80];
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
            field2552[var80] = var92 - var12;
            if (var92 >= 50) {
                field2550[var80] = class211.field2364 * var88 / var92 + var76;
                field2551[var80] = class211.field2364 * var91 / var92 + var77;
            } else {
                field2550[var80] = -5000;
                var24 = true;
            }
            if (var26) {
                field2575[var80] = var88;
                field2548[var80] = var91;
                field2576[var80] = var92;
            }
        }
        try {
            this.method4113(var24, var32, this.field2570, arg8);
        } catch (Exception var95) {
        }
    }

    @ObfuscatedName("hl.v(ZZZJ)V")
    public final void method4113(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2526 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field2526; var6++) {
            field2557[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field2517; var8++) {
            if (this.field2556[var8] != -2) {
                int var9 = this.field2518[var8];
                int var10 = this.field2519[var8];
                int var11 = this.field2520[var8];
                int var12 = field2550[var9];
                int var13 = field2550[var10];
                int var14 = field2550[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2575[var9];
                    int var16 = field2575[var10];
                    int var17 = field2575[var11];
                    int var18 = field2548[var9];
                    int var19 = field2548[var10];
                    int var20 = field2548[var11];
                    int var21 = field2576[var9];
                    int var22 = field2576[var10];
                    int var23 = field2576[var11];
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
                        field2549[var8] = true;
                        int var33 = (field2552[var9] + field2552[var10] + field2552[var11]) / 3 + this.field2553;
                        field2558[var33][field2557[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field2551[var9];
                        int var35 = field2551[var10];
                        int var36 = field2551[var11];
                        int var37 = class221.field2581 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class221.field2581 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class221.field2590 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class221.field2590 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class221.field2588[++class221.field2587 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field2551[var11] - field2551[var10]) * (var12 - var13) - (field2551[var9] - field2551[var10]) * (var14 - var13) > 0) {
                        field2549[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field2358 && var13 <= Statics.field2358 && var14 <= Statics.field2358) {
                            field2555[var8] = false;
                        } else {
                            field2555[var8] = true;
                        }
                        int var44 = (field2552[var9] + field2552[var10] + field2552[var11]) / 3 + this.field2553;
                        field2558[var44][field2557[var44]++] = var8;
                    }
                }
            }
        }
        if (this.field2524 == null) {
            for (int var45 = this.field2526 - 1; var45 >= 0; var45--) {
                int var46 = field2557[var45];
                if (var46 > 0) {
                    int[] var47 = field2558[var45];
                    for (int var48 = 0; var48 < var46; var48++) {
                        this.method4086(var47[var48]);
                    }
                }
            }
            return;
        }
        for (int var49 = 0; var49 < 12; var49++) {
            field2559[var49] = 0;
            field2529[var49] = 0;
        }
        for (int var50 = this.field2526 - 1; var50 >= 0; var50--) {
            int var51 = field2557[var50];
            if (var51 > 0) {
                int[] var52 = field2558[var50];
                for (int var53 = 0; var53 < var51; var53++) {
                    int var54 = var52[var53];
                    byte var55 = this.field2524[var54];
                    int var56 = field2559[var55]++;
                    field2560[var55][var56] = var54;
                    if (var55 < 10) {
                        field2529[var55] += var50;
                    } else if (var55 == 10) {
                        field2561[var56] = var50;
                    } else {
                        field2562[var56] = var50;
                    }
                }
            }
        }
        int var57 = 0;
        if (field2559[1] > 0 || field2559[2] > 0) {
            var57 = (field2529[1] + field2529[2]) / (field2559[1] + field2559[2]);
        }
        int var58 = 0;
        if (field2559[3] > 0 || field2559[4] > 0) {
            var58 = (field2529[3] + field2529[4]) / (field2559[3] + field2559[4]);
        }
        int var59 = 0;
        if (field2559[6] > 0 || field2559[8] > 0) {
            var59 = (field2529[6] + field2529[8]) / (field2559[6] + field2559[8]);
        }
        int var60 = 0;
        int var61 = field2559[10];
        int[] var62 = field2560[10];
        int[] var63 = field2561;
        if (var60 == var61) {
            var60 = 0;
            var61 = field2559[11];
            var62 = field2560[11];
            var63 = field2562;
        }
        int var64;
        if (var60 < var61) {
            var64 = var63[var60];
        } else {
            var64 = -1000;
        }
        for (int var65 = 0; var65 < 10; var65++) {
            while (var65 == 0 && var64 > var57) {
                this.method4086(var62[var60++]);
                if (var60 == var61 && field2560[11] != var62) {
                    var60 = 0;
                    var61 = field2559[11];
                    var62 = field2560[11];
                    var63 = field2562;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 3 && var64 > var58) {
                this.method4086(var62[var60++]);
                if (var60 == var61 && field2560[11] != var62) {
                    var60 = 0;
                    var61 = field2559[11];
                    var62 = field2560[11];
                    var63 = field2562;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            while (var65 == 5 && var64 > var59) {
                this.method4086(var62[var60++]);
                if (var60 == var61 && field2560[11] != var62) {
                    var60 = 0;
                    var61 = field2559[11];
                    var62 = field2560[11];
                    var63 = field2562;
                }
                if (var60 < var61) {
                    var64 = var63[var60];
                } else {
                    var64 = -1000;
                }
            }
            int var66 = field2559[var65];
            int[] var67 = field2560[var65];
            for (int var68 = 0; var68 < var66; var68++) {
                this.method4086(var67[var68]);
            }
        }
        while (var64 != -1000) {
            this.method4086(var62[var60++]);
            if (var60 == var61 && field2560[11] != var62) {
                var60 = 0;
                var62 = field2560[11];
                var61 = field2559[11];
                var63 = field2562;
            }
            if (var60 < var61) {
                var64 = var63[var60];
            } else {
                var64 = -1000;
            }
        }
    }

    @ObfuscatedName("hl.ag(I)V")
    public final void method4086(int arg0) {
        if (field2549[arg0]) {
            this.method4087(arg0);
            return;
        }
        int var2 = this.field2518[arg0];
        int var3 = this.field2519[arg0];
        int var4 = this.field2520[arg0];
        class211.field2366 = field2555[arg0];
        if (this.field2525 == null) {
            class211.field2344 = 0;
        } else {
            class211.field2344 = this.field2525[arg0] & 0xFF;
        }
        if (this.field2527 != null && this.field2527[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2567 == null || this.field2567[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2567[arg0] & 0xFF;
                var6 = this.field2530[var5];
                var7 = this.field2531[var5];
                var8 = this.field2539[var5];
            }
            if (this.field2556[arg0] == -1) {
                class211.method3763(field2551[var2], field2551[var3], field2551[var4], field2550[var2], field2550[var3], field2550[var4], this.field2521[arg0], this.field2521[arg0], this.field2521[arg0], field2575[var6], field2575[var7], field2575[var8], field2548[var6], field2548[var7], field2548[var8], field2576[var6], field2576[var7], field2576[var8], this.field2527[arg0]);
            } else {
                class211.method3763(field2551[var2], field2551[var3], field2551[var4], field2550[var2], field2550[var3], field2550[var4], this.field2521[arg0], this.field2563[arg0], this.field2556[arg0], field2575[var6], field2575[var7], field2575[var8], field2548[var6], field2548[var7], field2548[var8], field2576[var6], field2576[var7], field2576[var8], this.field2527[arg0]);
            }
        } else if (this.field2556[arg0] == -1) {
            class211.method3761(field2551[var2], field2551[var3], field2551[var4], field2550[var2], field2550[var3], field2550[var4], field2541[this.field2521[arg0]]);
        } else {
            class211.method3759(field2551[var2], field2551[var3], field2551[var4], field2550[var2], field2550[var3], field2550[var4], this.field2521[arg0], this.field2563[arg0], this.field2556[arg0]);
        }
    }

    @ObfuscatedName("hl.ae(I)V")
    public final void method4087(int arg0) {
        int var2 = Statics.field2347;
        int var3 = Statics.field2357;
        int var4 = 0;
        int var5 = this.field2518[arg0];
        int var6 = this.field2519[arg0];
        int var7 = this.field2520[arg0];
        int var8 = field2576[var5];
        int var9 = field2576[var6];
        int var10 = field2576[var7];
        if (this.field2525 == null) {
            class211.field2344 = 0;
        } else {
            class211.field2344 = this.field2525[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2564[var4] = field2550[var5];
            field2565[var4] = field2551[var5];
            field2522[var4++] = this.field2521[arg0];
        } else {
            int var11 = field2575[var5];
            int var12 = field2548[var5];
            int var13 = this.field2521[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2509[var10 - var8];
                field2564[var4] = (((field2575[var7] - var11) * var14 >> 16) + var11) * class211.field2364 / 50 + var2;
                field2565[var4] = (((field2548[var7] - var12) * var14 >> 16) + var12) * class211.field2364 / 50 + var3;
                field2522[var4++] = ((this.field2556[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2509[var9 - var8];
                field2564[var4] = (((field2575[var6] - var11) * var15 >> 16) + var11) * class211.field2364 / 50 + var2;
                field2565[var4] = (((field2548[var6] - var12) * var15 >> 16) + var12) * class211.field2364 / 50 + var3;
                field2522[var4++] = ((this.field2563[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2564[var4] = field2550[var6];
            field2565[var4] = field2551[var6];
            field2522[var4++] = this.field2563[arg0];
        } else {
            int var16 = field2575[var6];
            int var17 = field2548[var6];
            int var18 = this.field2563[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2509[var8 - var9];
                field2564[var4] = (((field2575[var5] - var16) * var19 >> 16) + var16) * class211.field2364 / 50 + var2;
                field2565[var4] = (((field2548[var5] - var17) * var19 >> 16) + var17) * class211.field2364 / 50 + var3;
                field2522[var4++] = ((this.field2521[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2509[var10 - var9];
                field2564[var4] = (((field2575[var7] - var16) * var20 >> 16) + var16) * class211.field2364 / 50 + var2;
                field2565[var4] = (((field2548[var7] - var17) * var20 >> 16) + var17) * class211.field2364 / 50 + var3;
                field2522[var4++] = ((this.field2556[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2564[var4] = field2550[var7];
            field2565[var4] = field2551[var7];
            field2522[var4++] = this.field2556[arg0];
        } else {
            int var21 = field2575[var7];
            int var22 = field2548[var7];
            int var23 = this.field2556[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2509[var9 - var10];
                field2564[var4] = (((field2575[var6] - var21) * var24 >> 16) + var21) * class211.field2364 / 50 + var2;
                field2565[var4] = (((field2548[var6] - var22) * var24 >> 16) + var22) * class211.field2364 / 50 + var3;
                field2522[var4++] = ((this.field2563[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2509[var8 - var10];
                field2564[var4] = (((field2575[var5] - var21) * var25 >> 16) + var21) * class211.field2364 / 50 + var2;
                field2565[var4] = (((field2548[var5] - var22) * var25 >> 16) + var22) * class211.field2364 / 50 + var3;
                field2522[var4++] = ((this.field2521[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2564[0];
        int var27 = field2564[1];
        int var28 = field2564[2];
        int var29 = field2565[0];
        int var30 = field2565[1];
        int var31 = field2565[2];
        class211.field2366 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2358 || var27 > Statics.field2358 || var28 > Statics.field2358) {
                class211.field2366 = true;
            }
            if (this.field2527 != null && this.field2527[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2567 == null || this.field2567[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2567[arg0] & 0xFF;
                    var33 = this.field2530[var32];
                    var34 = this.field2531[var32];
                    var35 = this.field2539[var32];
                }
                if (this.field2556[arg0] == -1) {
                    class211.method3763(var29, var30, var31, var26, var27, var28, this.field2521[arg0], this.field2521[arg0], this.field2521[arg0], field2575[var33], field2575[var34], field2575[var35], field2548[var33], field2548[var34], field2548[var35], field2576[var33], field2576[var34], field2576[var35], this.field2527[arg0]);
                } else {
                    class211.method3763(var29, var30, var31, var26, var27, var28, field2522[0], field2522[1], field2522[2], field2575[var33], field2575[var34], field2575[var35], field2548[var33], field2548[var34], field2548[var35], field2576[var33], field2576[var34], field2576[var35], this.field2527[arg0]);
                }
            } else if (this.field2556[arg0] == -1) {
                class211.method3761(var29, var30, var31, var26, var27, var28, field2541[this.field2521[arg0]]);
            } else {
                class211.method3759(var29, var30, var31, var26, var27, var28, field2522[0], field2522[1], field2522[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2358 || var27 > Statics.field2358 || var28 > Statics.field2358 || field2564[3] < 0 || field2564[3] > Statics.field2358) {
            class211.field2366 = true;
        }
        if (this.field2527 != null && this.field2527[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2567 == null || this.field2567[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2567[arg0] & 0xFF;
                var37 = this.field2530[var36];
                var38 = this.field2531[var36];
                var39 = this.field2539[var36];
            }
            short var40 = this.field2527[arg0];
            if (this.field2556[arg0] == -1) {
                class211.method3763(var29, var30, var31, var26, var27, var28, this.field2521[arg0], this.field2521[arg0], this.field2521[arg0], field2575[var37], field2575[var38], field2575[var39], field2548[var37], field2548[var38], field2548[var39], field2576[var37], field2576[var38], field2576[var39], var40);
                class211.method3763(var29, var31, field2565[3], var26, var28, field2564[3], this.field2521[arg0], this.field2521[arg0], this.field2521[arg0], field2575[var37], field2575[var38], field2575[var39], field2548[var37], field2548[var38], field2548[var39], field2576[var37], field2576[var38], field2576[var39], var40);
            } else {
                class211.method3763(var29, var30, var31, var26, var27, var28, field2522[0], field2522[1], field2522[2], field2575[var37], field2575[var38], field2575[var39], field2548[var37], field2548[var38], field2548[var39], field2576[var37], field2576[var38], field2576[var39], var40);
                class211.method3763(var29, var31, field2565[3], var26, var28, field2564[3], field2522[0], field2522[2], field2522[3], field2575[var37], field2575[var38], field2575[var39], field2548[var37], field2548[var38], field2548[var39], field2576[var37], field2576[var38], field2576[var39], var40);
            }
        } else if (this.field2556[arg0] == -1) {
            int var41 = field2541[this.field2521[arg0]];
            class211.method3761(var29, var30, var31, var26, var27, var28, var41);
            class211.method3761(var29, var31, field2565[3], var26, var28, field2564[3], var41);
        } else {
            class211.method3759(var29, var30, var31, var26, var27, var28, field2522[0], field2522[1], field2522[2]);
            class211.method3759(var29, var31, field2565[3], var26, var28, field2564[3], field2522[0], field2522[2], field2522[3]);
        }
    }
}
