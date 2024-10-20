package deob;

@ObfuscatedName("gl")
public class class207 extends class201 {

    @ObfuscatedName("gl.s")
    public static class207 field2421 = new class207();

    @ObfuscatedName("gl.t")
    public static byte[] field2405 = new byte[1];

    @ObfuscatedName("gl.v")
    public static class207 field2406 = new class207();

    @ObfuscatedName("gl.j")
    public static byte[] field2428 = new byte[1];

    @ObfuscatedName("gl.l")
    public int field2443 = 0;

    @ObfuscatedName("gl.n")
    public int[] field2425;

    @ObfuscatedName("gl.w")
    public int[] field2410;

    @ObfuscatedName("gl.f")
    public int[] field2458;

    @ObfuscatedName("gl.o")
    public int field2412 = 0;

    @ObfuscatedName("gl.x")
    public int[] field2429;

    @ObfuscatedName("gl.r")
    public int[] field2466;

    @ObfuscatedName("gl.p")
    public int[] field2415;

    @ObfuscatedName("gl.h")
    public int[] field2409;

    @ObfuscatedName("gl.k")
    public int[] field2417;

    @ObfuscatedName("gl.a")
    public int[] field2418;

    @ObfuscatedName("gl.q")
    public byte[] field2419;

    @ObfuscatedName("gl.u")
    public byte[] field2420;

    @ObfuscatedName("gl.e")
    public byte[] field2441;

    @ObfuscatedName("gl.c")
    public short[] field2422;

    @ObfuscatedName("gl.i")
    public byte field2442 = 0;

    @ObfuscatedName("gl.m")
    public int field2424 = 0;

    @ObfuscatedName("gl.b")
    public int[] field2454;

    @ObfuscatedName("gl.z")
    public int[] field2426;

    @ObfuscatedName("gl.d")
    public int[] field2427;

    @ObfuscatedName("gl.y")
    public int[][] field2451;

    @ObfuscatedName("gl.g")
    public int[][] field2445;

    @ObfuscatedName("gl.ae")
    public boolean field2430 = false;

    @ObfuscatedName("gl.an")
    public int field2435;

    @ObfuscatedName("gl.am")
    public int field2432;

    @ObfuscatedName("gl.al")
    public int field2416;

    @ObfuscatedName("gl.aq")
    public int field2434;

    @ObfuscatedName("gl.aa")
    public int field2414;

    @ObfuscatedName("gl.ab")
    public int field2413;

    @ObfuscatedName("gl.ax")
    public int field2437;

    @ObfuscatedName("gl.au")
    public int field2438;

    @ObfuscatedName("gl.av")
    public int field2439 = -1;

    @ObfuscatedName("gl.as")
    public int field2407 = -1;

    @ObfuscatedName("gl.ao")
    public int field2411 = -1;

    @ObfuscatedName("gl.ak")
    public static boolean[] field2433 = new boolean[6500];

    @ObfuscatedName("gl.aj")
    public static boolean[] field2444 = new boolean[6500];

    @ObfuscatedName("gl.at")
    public static int[] field2459 = new int[6500];

    @ObfuscatedName("gl.af")
    public static int[] field2431 = new int[6500];

    @ObfuscatedName("gl.ar")
    public static int[] field2447 = new int[6500];

    @ObfuscatedName("gl.ay")
    public static int[] field2448 = new int[6500];

    @ObfuscatedName("gl.ap")
    public static int[] field2449 = new int[6500];

    @ObfuscatedName("gl.ah")
    public static int[] field2450 = new int[6500];

    @ObfuscatedName("gl.ai")
    public static int[] field2452 = new int[1600];

    @ObfuscatedName("gl.ad")
    public static int[][] field2469 = new int[1600][512];

    @ObfuscatedName("gl.ac")
    public static int[] field2436 = new int[12];

    @ObfuscatedName("gl.aw")
    public static int[][] field2455 = new int[12][2000];

    @ObfuscatedName("gl.bt")
    public static int[] field2456 = new int[2000];

    @ObfuscatedName("gl.bk")
    public static int[] field2457 = new int[2000];

    @ObfuscatedName("gl.br")
    public static int[] field2423 = new int[12];

    @ObfuscatedName("gl.by")
    public static int[] field2408 = new int[10];

    @ObfuscatedName("gl.bv")
    public static int[] field2460 = new int[10];

    @ObfuscatedName("gl.bf")
    public static int[] field2461 = new int[10];

    @ObfuscatedName("gl.bo")
    public static boolean field2465 = true;

    @ObfuscatedName("gl.bu")
    public static int[] field2468 = class198.field2266;

    @ObfuscatedName("gl.bl")
    public static int[] field2446 = class198.field2273;

    @ObfuscatedName("gl.bj")
    public static int[] field2470 = class198.field2268;

    @ObfuscatedName("gl.bq")
    public static int[] field2471 = class198.field2271;

    public class207() {
    }

    public class207(class207[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2443 = 0;
        this.field2412 = 0;
        this.field2424 = 0;
        this.field2442 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class207 var8 = arg0[var7];
            if (var8 != null) {
                this.field2443 += var8.field2443;
                this.field2412 += var8.field2412;
                this.field2424 += var8.field2424;
                if (var8.field2419 == null) {
                    if (this.field2442 == -1) {
                        this.field2442 = var8.field2442;
                    }
                    if (this.field2442 != var8.field2442) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2420 != null;
                var5 |= var8.field2422 != null;
                var6 |= var8.field2441 != null;
            }
        }
        this.field2425 = new int[this.field2443];
        this.field2410 = new int[this.field2443];
        this.field2458 = new int[this.field2443];
        this.field2429 = new int[this.field2412];
        this.field2466 = new int[this.field2412];
        this.field2415 = new int[this.field2412];
        this.field2409 = new int[this.field2412];
        this.field2417 = new int[this.field2412];
        this.field2418 = new int[this.field2412];
        if (var3) {
            this.field2419 = new byte[this.field2412];
        }
        if (var4) {
            this.field2420 = new byte[this.field2412];
        }
        if (var5) {
            this.field2422 = new short[this.field2412];
        }
        if (var6) {
            this.field2441 = new byte[this.field2412];
        }
        if (this.field2424 > 0) {
            this.field2454 = new int[this.field2424];
            this.field2426 = new int[this.field2424];
            this.field2427 = new int[this.field2424];
        }
        this.field2443 = 0;
        this.field2412 = 0;
        this.field2424 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class207 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2412; var11++) {
                    this.field2429[this.field2412] = var10.field2429[var11] + this.field2443;
                    this.field2466[this.field2412] = var10.field2466[var11] + this.field2443;
                    this.field2415[this.field2412] = var10.field2415[var11] + this.field2443;
                    this.field2409[this.field2412] = var10.field2409[var11];
                    this.field2417[this.field2412] = var10.field2417[var11];
                    this.field2418[this.field2412] = var10.field2418[var11];
                    if (var3) {
                        if (var10.field2419 == null) {
                            this.field2419[this.field2412] = var10.field2442;
                        } else {
                            this.field2419[this.field2412] = var10.field2419[var11];
                        }
                    }
                    if (var4 && var10.field2420 != null) {
                        this.field2420[this.field2412] = var10.field2420[var11];
                    }
                    if (var5) {
                        if (var10.field2422 == null) {
                            this.field2422[this.field2412] = -1;
                        } else {
                            this.field2422[this.field2412] = var10.field2422[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2441 == null || var10.field2441[var11] == -1) {
                            this.field2441[this.field2412] = -1;
                        } else {
                            this.field2441[this.field2412] = (byte) (var10.field2441[var11] + this.field2424);
                        }
                    }
                    this.field2412++;
                }
                for (int var12 = 0; var12 < var10.field2424; var12++) {
                    this.field2454[this.field2424] = var10.field2454[var12] + this.field2443;
                    this.field2426[this.field2424] = var10.field2426[var12] + this.field2443;
                    this.field2427[this.field2424] = var10.field2427[var12] + this.field2443;
                    this.field2424++;
                }
                for (int var13 = 0; var13 < var10.field2443; var13++) {
                    this.field2425[this.field2443] = var10.field2425[var13];
                    this.field2410[this.field2443] = var10.field2410[var13];
                    this.field2458[this.field2443] = var10.field2458[var13];
                    this.field2443++;
                }
            }
        }
    }

    @ObfuscatedName("gl.s([[IIIIZI)Lgl;")
    public class207 method3767(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3772();
        int var7 = arg1 - this.field2416;
        int var8 = this.field2416 + arg1;
        int var9 = arg3 - this.field2416;
        int var10 = this.field2416 + arg3;
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
        class207 var15;
        if (arg4) {
            var15 = new class207();
            var15.field2443 = this.field2443;
            var15.field2412 = this.field2412;
            var15.field2424 = this.field2424;
            var15.field2425 = this.field2425;
            var15.field2458 = this.field2458;
            var15.field2429 = this.field2429;
            var15.field2466 = this.field2466;
            var15.field2415 = this.field2415;
            var15.field2409 = this.field2409;
            var15.field2417 = this.field2417;
            var15.field2418 = this.field2418;
            var15.field2419 = this.field2419;
            var15.field2420 = this.field2420;
            var15.field2441 = this.field2441;
            var15.field2422 = this.field2422;
            var15.field2442 = this.field2442;
            var15.field2454 = this.field2454;
            var15.field2426 = this.field2426;
            var15.field2427 = this.field2427;
            var15.field2451 = this.field2451;
            var15.field2445 = this.field2445;
            var15.field2430 = this.field2430;
            var15.field2410 = new int[var15.field2443];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2443; var16++) {
                int var17 = this.field2425[var16] + arg1;
                int var18 = this.field2458[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2410[var16] = this.field2410[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2443; var26++) {
                int var27 = (-this.field2410[var26] << 16) / this.field2346;
                if (var27 < arg5) {
                    int var28 = this.field2425[var26] + arg1;
                    int var29 = this.field2458[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2410[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2410[var26];
                }
            }
        }
        var15.method3775();
        return var15;
    }

    @ObfuscatedName("gl.v(Z)Lgl;")
    public class207 method3768(boolean arg0) {
        if (!arg0 && field2405.length < this.field2412) {
            field2405 = new byte[this.field2412 + 100];
        }
        return this.method3770(arg0, field2421, field2405);
    }

    @ObfuscatedName("gl.j(Z)Lgl;")
    public class207 method3769(boolean arg0) {
        if (!arg0 && field2428.length < this.field2412) {
            field2428 = new byte[this.field2412 + 100];
        }
        return this.method3770(arg0, field2406, field2428);
    }

    @ObfuscatedName("gl.l(ZLgl;[B)Lgl;")
    public class207 method3770(boolean arg0, class207 arg1, byte[] arg2) {
        arg1.field2443 = this.field2443;
        arg1.field2412 = this.field2412;
        arg1.field2424 = this.field2424;
        if (arg1.field2425 == null || arg1.field2425.length < this.field2443) {
            arg1.field2425 = new int[this.field2443 + 100];
            arg1.field2410 = new int[this.field2443 + 100];
            arg1.field2458 = new int[this.field2443 + 100];
        }
        for (int var4 = 0; var4 < this.field2443; var4++) {
            arg1.field2425[var4] = this.field2425[var4];
            arg1.field2410[var4] = this.field2410[var4];
            arg1.field2458[var4] = this.field2458[var4];
        }
        if (arg0) {
            arg1.field2420 = this.field2420;
        } else {
            arg1.field2420 = arg2;
            if (this.field2420 == null) {
                for (int var5 = 0; var5 < this.field2412; var5++) {
                    arg1.field2420[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2412; var6++) {
                    arg1.field2420[var6] = this.field2420[var6];
                }
            }
        }
        arg1.field2429 = this.field2429;
        arg1.field2466 = this.field2466;
        arg1.field2415 = this.field2415;
        arg1.field2409 = this.field2409;
        arg1.field2417 = this.field2417;
        arg1.field2418 = this.field2418;
        arg1.field2419 = this.field2419;
        arg1.field2441 = this.field2441;
        arg1.field2422 = this.field2422;
        arg1.field2442 = this.field2442;
        arg1.field2454 = this.field2454;
        arg1.field2426 = this.field2426;
        arg1.field2427 = this.field2427;
        arg1.field2451 = this.field2451;
        arg1.field2445 = this.field2445;
        arg1.field2430 = this.field2430;
        arg1.method3775();
        return arg1;
    }

    @ObfuscatedName("gl.n(I)V")
    public void method3771(int arg0) {
        if (this.field2439 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2446[arg0];
        int var9 = field2468[arg0];
        for (int var10 = 0; var10 < this.field2443; var10++) {
            int var11 = class198.method3474(this.field2425[var10], this.field2458[var10], var8, var9);
            int var12 = this.field2410[var10];
            int var13 = class198.method3455(this.field2425[var10], this.field2458[var10], var8, var9);
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
        this.field2413 = (var2 + var5) / 2;
        this.field2437 = (var3 + var6) / 2;
        this.field2438 = (var4 + var7) / 2;
        this.field2439 = (var5 - var2 + 1) / 2;
        this.field2407 = (var6 - var3 + 1) / 2;
        this.field2411 = (var7 - var4 + 1) / 2;
        if (this.field2439 < 32) {
            this.field2439 = 32;
        }
        if (this.field2411 < 32) {
            this.field2411 = 32;
        }
        if (this.field2430) {
            this.field2439 += 8;
            this.field2411 += 8;
        }
    }

    @ObfuscatedName("gl.f()V")
    public void method3772() {
        if (this.field2435 == 1) {
            return;
        }
        this.field2435 = 1;
        this.field2346 = 0;
        this.field2432 = 0;
        this.field2416 = 0;
        for (int var1 = 0; var1 < this.field2443; var1++) {
            int var2 = this.field2425[var1];
            int var3 = this.field2410[var1];
            int var4 = this.field2458[var1];
            if (-var3 > this.field2346) {
                this.field2346 = -var3;
            }
            if (var3 > this.field2432) {
                this.field2432 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2416) {
                this.field2416 = var5;
            }
        }
        this.field2416 = (int) (Math.sqrt((double) this.field2416) + 0.99D);
        this.field2414 = (int) (Math.sqrt((double) (this.field2346 * this.field2346 + this.field2416 * this.field2416)) + 0.99D);
        this.field2434 = this.field2414 + (int) (Math.sqrt((double) (this.field2432 * this.field2432 + this.field2416 * this.field2416)) + 0.99D);
    }

    @ObfuscatedName("gl.o()V")
    public void method3773() {
        if (this.field2435 == 2) {
            return;
        }
        this.field2435 = 2;
        this.field2416 = 0;
        for (int var1 = 0; var1 < this.field2443; var1++) {
            int var2 = this.field2425[var1];
            int var3 = this.field2410[var1];
            int var4 = this.field2458[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2416) {
                this.field2416 = var5;
            }
        }
        this.field2416 = (int) (Math.sqrt((double) this.field2416) + 0.99D);
        this.field2414 = this.field2416;
        this.field2434 = this.field2416 + this.field2416;
    }

    @ObfuscatedName("gl.x()I")
    public int method3774() {
        this.method3772();
        return this.field2416;
    }

    @ObfuscatedName("gl.r()V")
    public void method3775() {
        this.field2435 = 0;
        this.field2439 = -1;
    }

    @ObfuscatedName("gl.p(Lga;I)V")
    public void method3776(class203 arg0, int arg1) {
        if (this.field2451 == null || arg1 == -1) {
            return;
        }
        class196 var3 = arg0.field2354[arg1];
        class199 var4 = var3.field2216;
        Statics.field2462 = 0;
        Statics.field2463 = 0;
        Statics.field2464 = 0;
        for (int var5 = 0; var5 < var3.field2212; var5++) {
            int var6 = var3.field2218[var5];
            this.method3780(var4.field2274[var6], var4.field2276[var6], var3.field2217[var5], var3.field2220[var5], var3.field2219[var5]);
        }
        this.method3775();
    }

    @ObfuscatedName("gl.h(Lga;ILga;I[I)V")
    public void method3807(class203 arg0, int arg1, class203 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method3776(arg0, arg1);
            return;
        }
        class196 var6 = arg0.field2354[arg1];
        class196 var7 = arg2.field2354[arg3];
        class199 var8 = var6.field2216;
        Statics.field2462 = 0;
        Statics.field2463 = 0;
        Statics.field2464 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2212; var11++) {
            int var12 = var6.field2218[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2274[var12] == 0) {
                this.method3780(var8.field2274[var12], var8.field2276[var12], var6.field2217[var11], var6.field2220[var11], var6.field2219[var11]);
            }
        }
        Statics.field2462 = 0;
        Statics.field2463 = 0;
        Statics.field2464 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2212; var15++) {
            int var16 = var7.field2218[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2274[var16] == 0) {
                this.method3780(var8.field2274[var16], var8.field2276[var16], var7.field2217[var15], var7.field2220[var15], var7.field2219[var15]);
            }
        }
        this.method3775();
    }

    @ObfuscatedName("gl.k(I[IIII)V")
    public void method3780(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2462 = 0;
            Statics.field2463 = 0;
            Statics.field2464 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2451.length) {
                    int[] var10 = this.field2451[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2462 += this.field2425[var12];
                        Statics.field2463 += this.field2410[var12];
                        Statics.field2464 += this.field2458[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2462 = Statics.field2462 / var7 + arg2;
                Statics.field2463 = Statics.field2463 / var7 + arg3;
                Statics.field2464 = Statics.field2464 / var7 + arg4;
            } else {
                Statics.field2462 = arg2;
                Statics.field2463 = arg3;
                Statics.field2464 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2451.length) {
                    int[] var15 = this.field2451[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2425[var17] += arg2;
                        this.field2410[var17] += arg3;
                        this.field2458[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2451.length) {
                    int[] var20 = this.field2451[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2425[var22] -= Statics.field2462;
                        this.field2410[var22] -= Statics.field2463;
                        this.field2458[var22] -= Statics.field2464;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2468[var25];
                            int var27 = field2446[var25];
                            int var28 = this.field2425[var22] * var27 + this.field2410[var22] * var26 >> 16;
                            this.field2410[var22] = this.field2410[var22] * var27 - this.field2425[var22] * var26 >> 16;
                            this.field2425[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2468[var23];
                            int var30 = field2446[var23];
                            int var31 = this.field2410[var22] * var30 - this.field2458[var22] * var29 >> 16;
                            this.field2458[var22] = this.field2458[var22] * var30 + this.field2410[var22] * var29 >> 16;
                            this.field2410[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2468[var24];
                            int var33 = field2446[var24];
                            int var34 = this.field2458[var22] * var32 + this.field2425[var22] * var33 >> 16;
                            this.field2458[var22] = this.field2458[var22] * var33 - this.field2425[var22] * var32 >> 16;
                            this.field2425[var22] = var34;
                        }
                        this.field2425[var22] += Statics.field2462;
                        this.field2410[var22] += Statics.field2463;
                        this.field2458[var22] += Statics.field2464;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2451.length) {
                    int[] var37 = this.field2451[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2425[var39] -= Statics.field2462;
                        this.field2410[var39] -= Statics.field2463;
                        this.field2458[var39] -= Statics.field2464;
                        this.field2425[var39] = this.field2425[var39] * arg2 / 128;
                        this.field2410[var39] = this.field2410[var39] * arg3 / 128;
                        this.field2458[var39] = this.field2458[var39] * arg4 / 128;
                        this.field2425[var39] += Statics.field2462;
                        this.field2410[var39] += Statics.field2463;
                        this.field2458[var39] += Statics.field2464;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2445 != null && this.field2420 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2445.length) {
                    int[] var42 = this.field2445[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2420[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2420[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gl.a()V")
    public void method3795() {
        for (int var1 = 0; var1 < this.field2443; var1++) {
            int var2 = this.field2425[var1];
            this.field2425[var1] = this.field2458[var1];
            this.field2458[var1] = -var2;
        }
        this.method3775();
    }

    @ObfuscatedName("gl.q()V")
    public void method3779() {
        for (int var1 = 0; var1 < this.field2443; var1++) {
            this.field2425[var1] = -this.field2425[var1];
            this.field2458[var1] = -this.field2458[var1];
        }
        this.method3775();
    }

    @ObfuscatedName("gl.u()V")
    public void method3815() {
        for (int var1 = 0; var1 < this.field2443; var1++) {
            int var2 = this.field2458[var1];
            this.field2458[var1] = this.field2425[var1];
            this.field2425[var1] = -var2;
        }
        this.method3775();
    }

    @ObfuscatedName("gl.e(I)V")
    public void method3766(int arg0) {
        int var2 = field2468[arg0];
        int var3 = field2446[arg0];
        for (int var4 = 0; var4 < this.field2443; var4++) {
            int var5 = this.field2410[var4] * var3 - this.field2458[var4] * var2 >> 16;
            this.field2458[var4] = this.field2458[var4] * var3 + this.field2410[var4] * var2 >> 16;
            this.field2410[var4] = var5;
        }
        this.method3775();
    }

    @ObfuscatedName("gl.c(III)V")
    public void method3782(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2443; var4++) {
            this.field2425[var4] += arg0;
            this.field2410[var4] += arg1;
            this.field2458[var4] += arg2;
        }
        this.method3775();
    }

    @ObfuscatedName("gl.i(III)V")
    public void method3787(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2443; var4++) {
            this.field2425[var4] = this.field2425[var4] * arg0 / 128;
            this.field2410[var4] = this.field2410[var4] * arg1 / 128;
            this.field2458[var4] = this.field2458[var4] * arg2 / 128;
        }
        this.method3775();
    }

    @ObfuscatedName("gl.m(IIIIIII)V")
    public final void method3820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2452[0] = -1;
        if (this.field2435 != 2 && this.field2435 != 1) {
            this.method3773();
        }
        int var8 = Statics.field2259;
        int var9 = Statics.field2260;
        int var10 = field2468[arg0];
        int var11 = field2446[arg0];
        int var12 = field2468[arg1];
        int var13 = field2446[arg1];
        int var14 = field2468[arg2];
        int var15 = field2446[arg2];
        int var16 = field2468[arg3];
        int var17 = field2446[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2443; var19++) {
            int var20 = this.field2425[var19];
            int var21 = this.field2410[var19];
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
            field2447[var19] = var30 - var18;
            field2459[var19] = class198.field2262 * var26 / var30 + var8;
            field2431[var19] = class198.field2262 * var29 / var30 + var9;
            if (this.field2424 > 0) {
                field2448[var19] = var26;
                field2449[var19] = var29;
                field2450[var19] = var30;
            }
        }
        try {
            this.method3786(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("gl.b(IIIIIIII)V")
    public final void method3785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2452[0] = -1;
        if (this.field2435 != 2 && this.field2435 != 1) {
            this.method3773();
        }
        int var9 = Statics.field2259;
        int var10 = Statics.field2260;
        int var11 = field2468[arg0];
        int var12 = field2446[arg0];
        int var13 = field2468[arg1];
        int var14 = field2446[arg1];
        int var15 = field2468[arg2];
        int var16 = field2446[arg2];
        int var17 = field2468[arg3];
        int var18 = field2446[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2443; var20++) {
            int var21 = this.field2425[var20];
            int var22 = this.field2410[var20];
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
            field2447[var20] = var31 - var19;
            field2459[var20] = class198.field2262 * var27 / arg7 + var9;
            field2431[var20] = class198.field2262 * var30 / arg7 + var10;
            if (this.field2424 > 0) {
                field2448[var20] = var27;
                field2449[var20] = var30;
                field2450[var20] = var31;
            }
        }
        try {
            this.method3786(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("gl.cd(IIIIIIIIJ)V")
    public void method3727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2452[0] = -1;
        if (this.field2435 != 1) {
            this.method3772();
        }
        this.method3771(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2416 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2416) * class198.field2262;
        if (var16 / var14 >= Statics.field2264) {
            return;
        }
        int var17 = (this.field2416 + var15) * class198.field2262;
        if (var17 / var14 <= Statics.field2263) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2416 * arg1 >> 16;
        int var20 = (var18 + var19) * class198.field2262;
        if (var20 / var14 <= Statics.field2265) {
            return;
        }
        int var21 = (this.field2346 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class198.field2262;
        if (var22 / var14 >= Statics.field2248) {
            return;
        }
        int var23 = (this.field2346 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field2424 > 0;
        int var27 = class208.field2488;
        int var29 = class208.method2045();
        boolean var30 = class208.method3274();
        boolean var31 = arg8 != 0L;
        if (var31) {
            boolean var32 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var31 = !var32;
        }
        boolean var35 = false;
        if (var31 && var30) {
            boolean var36 = false;
            if (field2465) {
                var36 = class208.method2279(this, arg5, arg6, arg7);
            } else {
                int var37 = var12 - var13;
                if (var37 <= 50) {
                    var37 = 50;
                }
                int var38;
                int var39;
                if (var15 > 0) {
                    var38 = var16 / var14;
                    var39 = var17 / var37;
                } else {
                    var39 = var17 / var14;
                    var38 = var16 / var37;
                }
                int var40;
                int var41;
                if (var18 > 0) {
                    var40 = var22 / var14;
                    var41 = var20 / var37;
                } else {
                    var41 = var20 / var14;
                    var40 = var22 / var37;
                }
                int var42 = var27 - Statics.field2259;
                int var43 = var29 - Statics.field2260;
                if (var42 > var38 && var42 < var39 && var43 > var40 && var43 < var41) {
                    var36 = true;
                }
            }
            if (var36) {
                if (this.field2430) {
                    class208.field2485[++class208.field2484 - 1] = arg8;
                } else {
                    var35 = true;
                }
            }
        }
        int var46 = Statics.field2259;
        int var47 = Statics.field2260;
        int var48 = 0;
        int var49 = 0;
        if (arg0 != 0) {
            var48 = field2468[arg0];
            var49 = field2446[arg0];
        }
        for (int var50 = 0; var50 < this.field2443; var50++) {
            int var51 = this.field2425[var50];
            int var52 = this.field2410[var50];
            int var53 = this.field2458[var50];
            if (arg0 != 0) {
                int var54 = var48 * var53 + var49 * var51 >> 16;
                var53 = var49 * var53 - var48 * var51 >> 16;
                var51 = var54;
            }
            int var55 = arg5 + var51;
            int var56 = arg6 + var52;
            int var57 = arg7 + var53;
            int var58 = arg3 * var57 + arg4 * var55 >> 16;
            int var59 = arg4 * var57 - arg3 * var55 >> 16;
            int var61 = arg2 * var56 - arg1 * var59 >> 16;
            int var62 = arg1 * var56 + arg2 * var59 >> 16;
            field2447[var50] = var62 - var12;
            if (var62 >= 50) {
                field2459[var50] = class198.field2262 * var58 / var62 + var46;
                field2431[var50] = class198.field2262 * var61 / var62 + var47;
            } else {
                field2459[var50] = -5000;
                var24 = true;
            }
            if (var26) {
                field2448[var50] = var58;
                field2449[var50] = var61;
                field2450[var50] = var62;
            }
        }
        try {
            this.method3786(var24, var35, this.field2430, arg8);
        } catch (Exception var65) {
        }
    }

    @ObfuscatedName("gl.z(ZZZJ)V")
    public final void method3786(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2434 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field2434; var6++) {
            field2452[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field2412; var8++) {
            if (this.field2418[var8] != -2) {
                int var9 = this.field2429[var8];
                int var10 = this.field2466[var8];
                int var11 = this.field2415[var8];
                int var12 = field2459[var9];
                int var13 = field2459[var10];
                int var14 = field2459[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2448[var9];
                    int var16 = field2448[var10];
                    int var17 = field2448[var11];
                    int var18 = field2449[var9];
                    int var19 = field2449[var10];
                    int var20 = field2449[var11];
                    int var21 = field2450[var9];
                    int var22 = field2450[var10];
                    int var23 = field2450[var11];
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
                        field2444[var8] = true;
                        int var33 = (field2447[var9] + field2447[var10] + field2447[var11]) / 3 + this.field2414;
                        field2469[var33][field2452[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class208.method4542(field2431[var9], field2431[var10], field2431[var11], var12, var13, var14, var7)) {
                        class208.field2485[++class208.field2484 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field2431[var11] - field2431[var10]) * (var12 - var13) - (field2431[var9] - field2431[var10]) * (var14 - var13) > 0) {
                        field2444[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field2261 && var13 <= Statics.field2261 && var14 <= Statics.field2261) {
                            field2433[var8] = false;
                        } else {
                            field2433[var8] = true;
                        }
                        int var36 = (field2447[var9] + field2447[var10] + field2447[var11]) / 3 + this.field2414;
                        field2469[var36][field2452[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field2419 == null) {
            for (int var37 = this.field2434 - 1; var37 >= 0; var37--) {
                int var38 = field2452[var37];
                if (var38 > 0) {
                    int[] var39 = field2469[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method3825(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field2436[var41] = 0;
            field2423[var41] = 0;
        }
        for (int var42 = this.field2434 - 1; var42 >= 0; var42--) {
            int var43 = field2452[var42];
            if (var43 > 0) {
                int[] var44 = field2469[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field2419[var46];
                    int var48 = field2436[var47]++;
                    field2455[var47][var48] = var46;
                    if (var47 < 10) {
                        field2423[var47] += var42;
                    } else if (var47 == 10) {
                        field2456[var48] = var42;
                    } else {
                        field2457[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field2436[1] > 0 || field2436[2] > 0) {
            var49 = (field2423[1] + field2423[2]) / (field2436[1] + field2436[2]);
        }
        int var50 = 0;
        if (field2436[3] > 0 || field2436[4] > 0) {
            var50 = (field2423[3] + field2423[4]) / (field2436[3] + field2436[4]);
        }
        int var51 = 0;
        if (field2436[6] > 0 || field2436[8] > 0) {
            var51 = (field2423[6] + field2423[8]) / (field2436[6] + field2436[8]);
        }
        int var52 = 0;
        int var53 = field2436[10];
        int[] var54 = field2455[10];
        int[] var55 = field2456;
        if (var52 == var53) {
            var52 = 0;
            var53 = field2436[11];
            var54 = field2455[11];
            var55 = field2457;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method3825(var54[var52++]);
                if (var52 == var53 && field2455[11] != var54) {
                    var52 = 0;
                    var53 = field2436[11];
                    var54 = field2455[11];
                    var55 = field2457;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method3825(var54[var52++]);
                if (var52 == var53 && field2455[11] != var54) {
                    var52 = 0;
                    var53 = field2436[11];
                    var54 = field2455[11];
                    var55 = field2457;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method3825(var54[var52++]);
                if (var52 == var53 && field2455[11] != var54) {
                    var52 = 0;
                    var53 = field2436[11];
                    var54 = field2455[11];
                    var55 = field2457;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field2436[var57];
            int[] var59 = field2455[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method3825(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method3825(var54[var52++]);
            if (var52 == var53 && field2455[11] != var54) {
                var52 = 0;
                var54 = field2455[11];
                var53 = field2436[11];
                var55 = field2457;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("gl.d(I)V")
    public final void method3825(int arg0) {
        if (field2444[arg0]) {
            this.method3778(arg0);
            return;
        }
        int var2 = this.field2429[arg0];
        int var3 = this.field2466[arg0];
        int var4 = this.field2415[arg0];
        class198.field2252 = field2433[arg0];
        if (this.field2420 == null) {
            class198.field2258 = 0;
        } else {
            class198.field2258 = this.field2420[arg0] & 0xFF;
        }
        if (this.field2422 != null && this.field2422[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2441 == null || this.field2441[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2441[arg0] & 0xFF;
                var6 = this.field2454[var5];
                var7 = this.field2426[var5];
                var8 = this.field2427[var5];
            }
            if (this.field2418[arg0] == -1) {
                class198.method3503(field2431[var2], field2431[var3], field2431[var4], field2459[var2], field2459[var3], field2459[var4], this.field2409[arg0], this.field2409[arg0], this.field2409[arg0], field2448[var6], field2448[var7], field2448[var8], field2449[var6], field2449[var7], field2449[var8], field2450[var6], field2450[var7], field2450[var8], this.field2422[arg0]);
            } else {
                class198.method3503(field2431[var2], field2431[var3], field2431[var4], field2459[var2], field2459[var3], field2459[var4], this.field2409[arg0], this.field2417[arg0], this.field2418[arg0], field2448[var6], field2448[var7], field2448[var8], field2449[var6], field2449[var7], field2449[var8], field2450[var6], field2450[var7], field2450[var8], this.field2422[arg0]);
            }
        } else if (this.field2418[arg0] == -1) {
            class198.method3467(field2431[var2], field2431[var3], field2431[var4], field2459[var2], field2459[var3], field2459[var4], field2470[this.field2409[arg0]]);
        } else {
            class198.method3469(field2431[var2], field2431[var3], field2431[var4], field2459[var2], field2459[var3], field2459[var4], this.field2409[arg0], this.field2417[arg0], this.field2418[arg0]);
        }
    }

    @ObfuscatedName("gl.y(I)V")
    public final void method3778(int arg0) {
        int var2 = Statics.field2259;
        int var3 = Statics.field2260;
        int var4 = 0;
        int var5 = this.field2429[arg0];
        int var6 = this.field2466[arg0];
        int var7 = this.field2415[arg0];
        int var8 = field2450[var5];
        int var9 = field2450[var6];
        int var10 = field2450[var7];
        if (this.field2420 == null) {
            class198.field2258 = 0;
        } else {
            class198.field2258 = this.field2420[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2408[var4] = field2459[var5];
            field2460[var4] = field2431[var5];
            field2461[var4++] = this.field2409[arg0];
        } else {
            int var11 = field2448[var5];
            int var12 = field2449[var5];
            int var13 = this.field2409[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2471[var10 - var8];
                field2408[var4] = (((field2448[var7] - var11) * var14 >> 16) + var11) * class198.field2262 / 50 + var2;
                field2460[var4] = (((field2449[var7] - var12) * var14 >> 16) + var12) * class198.field2262 / 50 + var3;
                field2461[var4++] = ((this.field2418[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2471[var9 - var8];
                field2408[var4] = (((field2448[var6] - var11) * var15 >> 16) + var11) * class198.field2262 / 50 + var2;
                field2460[var4] = (((field2449[var6] - var12) * var15 >> 16) + var12) * class198.field2262 / 50 + var3;
                field2461[var4++] = ((this.field2417[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2408[var4] = field2459[var6];
            field2460[var4] = field2431[var6];
            field2461[var4++] = this.field2417[arg0];
        } else {
            int var16 = field2448[var6];
            int var17 = field2449[var6];
            int var18 = this.field2417[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2471[var8 - var9];
                field2408[var4] = (((field2448[var5] - var16) * var19 >> 16) + var16) * class198.field2262 / 50 + var2;
                field2460[var4] = (((field2449[var5] - var17) * var19 >> 16) + var17) * class198.field2262 / 50 + var3;
                field2461[var4++] = ((this.field2409[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2471[var10 - var9];
                field2408[var4] = (((field2448[var7] - var16) * var20 >> 16) + var16) * class198.field2262 / 50 + var2;
                field2460[var4] = (((field2449[var7] - var17) * var20 >> 16) + var17) * class198.field2262 / 50 + var3;
                field2461[var4++] = ((this.field2418[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2408[var4] = field2459[var7];
            field2460[var4] = field2431[var7];
            field2461[var4++] = this.field2418[arg0];
        } else {
            int var21 = field2448[var7];
            int var22 = field2449[var7];
            int var23 = this.field2418[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2471[var9 - var10];
                field2408[var4] = (((field2448[var6] - var21) * var24 >> 16) + var21) * class198.field2262 / 50 + var2;
                field2460[var4] = (((field2449[var6] - var22) * var24 >> 16) + var22) * class198.field2262 / 50 + var3;
                field2461[var4++] = ((this.field2417[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2471[var8 - var10];
                field2408[var4] = (((field2448[var5] - var21) * var25 >> 16) + var21) * class198.field2262 / 50 + var2;
                field2460[var4] = (((field2449[var5] - var22) * var25 >> 16) + var22) * class198.field2262 / 50 + var3;
                field2461[var4++] = ((this.field2409[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2408[0];
        int var27 = field2408[1];
        int var28 = field2408[2];
        int var29 = field2460[0];
        int var30 = field2460[1];
        int var31 = field2460[2];
        class198.field2252 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2261 || var27 > Statics.field2261 || var28 > Statics.field2261) {
                class198.field2252 = true;
            }
            if (this.field2422 != null && this.field2422[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2441 == null || this.field2441[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2441[arg0] & 0xFF;
                    var33 = this.field2454[var32];
                    var34 = this.field2426[var32];
                    var35 = this.field2427[var32];
                }
                if (this.field2418[arg0] == -1) {
                    class198.method3503(var29, var30, var31, var26, var27, var28, this.field2409[arg0], this.field2409[arg0], this.field2409[arg0], field2448[var33], field2448[var34], field2448[var35], field2449[var33], field2449[var34], field2449[var35], field2450[var33], field2450[var34], field2450[var35], this.field2422[arg0]);
                } else {
                    class198.method3503(var29, var30, var31, var26, var27, var28, field2461[0], field2461[1], field2461[2], field2448[var33], field2448[var34], field2448[var35], field2449[var33], field2449[var34], field2449[var35], field2450[var33], field2450[var34], field2450[var35], this.field2422[arg0]);
                }
            } else if (this.field2418[arg0] == -1) {
                class198.method3467(var29, var30, var31, var26, var27, var28, field2470[this.field2409[arg0]]);
            } else {
                class198.method3469(var29, var30, var31, var26, var27, var28, field2461[0], field2461[1], field2461[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2261 || var27 > Statics.field2261 || var28 > Statics.field2261 || field2408[3] < 0 || field2408[3] > Statics.field2261) {
            class198.field2252 = true;
        }
        if (this.field2422 != null && this.field2422[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2441 == null || this.field2441[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2441[arg0] & 0xFF;
                var37 = this.field2454[var36];
                var38 = this.field2426[var36];
                var39 = this.field2427[var36];
            }
            short var40 = this.field2422[arg0];
            if (this.field2418[arg0] == -1) {
                class198.method3503(var29, var30, var31, var26, var27, var28, this.field2409[arg0], this.field2409[arg0], this.field2409[arg0], field2448[var37], field2448[var38], field2448[var39], field2449[var37], field2449[var38], field2449[var39], field2450[var37], field2450[var38], field2450[var39], var40);
                class198.method3503(var29, var31, field2460[3], var26, var28, field2408[3], this.field2409[arg0], this.field2409[arg0], this.field2409[arg0], field2448[var37], field2448[var38], field2448[var39], field2449[var37], field2449[var38], field2449[var39], field2450[var37], field2450[var38], field2450[var39], var40);
            } else {
                class198.method3503(var29, var30, var31, var26, var27, var28, field2461[0], field2461[1], field2461[2], field2448[var37], field2448[var38], field2448[var39], field2449[var37], field2449[var38], field2449[var39], field2450[var37], field2450[var38], field2450[var39], var40);
                class198.method3503(var29, var31, field2460[3], var26, var28, field2408[3], field2461[0], field2461[2], field2461[3], field2448[var37], field2448[var38], field2448[var39], field2449[var37], field2449[var38], field2449[var39], field2450[var37], field2450[var38], field2450[var39], var40);
            }
        } else if (this.field2418[arg0] == -1) {
            int var41 = field2470[this.field2409[arg0]];
            class198.method3467(var29, var30, var31, var26, var27, var28, var41);
            class198.method3467(var29, var31, field2460[3], var26, var28, field2408[3], var41);
        } else {
            class198.method3469(var29, var30, var31, var26, var27, var28, field2461[0], field2461[1], field2461[2]);
            class198.method3469(var29, var31, field2460[3], var26, var28, field2408[3], field2461[0], field2461[2], field2461[3]);
        }
    }
}
