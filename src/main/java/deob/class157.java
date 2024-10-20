package deob;

@ObfuscatedName("cf")
public class class157 extends class145 {

    @ObfuscatedName("cf.f")
    public int[] field2357;

    @ObfuscatedName("cf.g")
    public byte[] field2351;

    @ObfuscatedName("cf.d")
    public int[] field2355;

    @ObfuscatedName("cf.e")
    public short[] field2363;

    @ObfuscatedName("cf.b")
    public int field2367 = 0;

    @ObfuscatedName("cf.c")
    public short[] field2374;

    @ObfuscatedName("cf.a")
    public short[] field2371;

    @ObfuscatedName("cf.n")
    public short[] field2368;

    @ObfuscatedName("cf.o")
    public short[] field2362;

    @ObfuscatedName("cf.l")
    public int[] field2356;

    @ObfuscatedName("cf.m")
    public short[] field2373;

    @ObfuscatedName("cf.j")
    public byte[] field2359;

    @ObfuscatedName("cf.k")
    public int[] field2352;

    @ObfuscatedName("cf.h")
    public int[] field2358;

    @ObfuscatedName("cf.i")
    public byte[] field2366;

    @ObfuscatedName("cf.w")
    public int[] field2353;

    @ObfuscatedName("cf.v")
    public short[] field2375;

    @ObfuscatedName("cf.u")
    public short[] field2369;

    @ObfuscatedName("cf.t")
    public int field2379 = 0;

    @ObfuscatedName("cf.s")
    public byte[] field2350;

    @ObfuscatedName("cf.r")
    public short[] field2396;

    @ObfuscatedName("cf.q")
    public byte field2364 = 0;

    @ObfuscatedName("cf.p")
    public short[] field2377;

    @ObfuscatedName("cf.z")
    public int field2365;

    @ObfuscatedName("cf.y")
    public short[] field2370;

    @ObfuscatedName("cf.x")
    public byte[] field2381;

    @ObfuscatedName("cf.ay")
    public static int[] field2361 = class153.field2299;

    @ObfuscatedName("cf.at")
    public static int[] field2395 = class153.field2293;

    @ObfuscatedName("cf.as")
    public boolean field2354 = false;

    @ObfuscatedName("cf.ar")
    public class151[] field2382;

    @ObfuscatedName("cf.aq")
    public int[][] field2394;

    @ObfuscatedName("cf.ax")
    public int[] field2392;

    @ObfuscatedName("cf.aw")
    public int[] field2378;

    @ObfuscatedName("cf.av")
    public int field2384;

    @ObfuscatedName("cf.au")
    public int field2388;

    @ObfuscatedName("cf.ak")
    public int[][] field2380;

    @ObfuscatedName("cf.al")
    public static int[] field2372 = new int[10000];

    @ObfuscatedName("cf.ai")
    public class151[] field2383;

    @ObfuscatedName("cf.ao")
    public int field2391;

    @ObfuscatedName("cf.ap")
    public int field2389;

    @ObfuscatedName("cf.am")
    public int field2390;

    @ObfuscatedName("cf.an")
    public static int[] field2393 = new int[10000];

    @ObfuscatedName("cf.ac")
    public byte[] field2376;

    @ObfuscatedName("cf.ad")
    public short field2385;

    @ObfuscatedName("cf.aa")
    public static int field2360 = 0;

    @ObfuscatedName("cf.ab")
    public class143[] field2387;

    @ObfuscatedName("cf.ah")
    public short field2386;

    @ObfuscatedName("cf.b(Lek;II)Lcf;")
    public static class157 method2663(class89 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1266(arg1, arg2);
        return var3 == null ? null : new class157(var3);
    }

    public class157(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2692(arg0);
        } else {
            this.method2665(arg0);
        }
    }

    @ObfuscatedName("cf.d([B)V")
    public void method2665(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class50 var4 = new class50(arg0);
        class50 var5 = new class50(arg0);
        class50 var6 = new class50(arg0);
        class50 var7 = new class50(arg0);
        class50 var8 = new class50(arg0);
        var4.field540 = arg0.length - 18;
        int var9 = var4.method720();
        int var10 = var4.method720();
        int var11 = var4.method726();
        int var12 = var4.method726();
        int var13 = var4.method726();
        int var14 = var4.method726();
        int var15 = var4.method726();
        int var16 = var4.method726();
        int var17 = var4.method720();
        int var18 = var4.method720();
        int var19 = var4.method720();
        int var20 = var4.method720();
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2367 = var9;
        this.field2379 = var10;
        this.field2365 = var11;
        this.field2358 = new int[var9];
        this.field2352 = new int[var9];
        this.field2353 = new int[var9];
        this.field2355 = new int[var10];
        this.field2356 = new int[var10];
        this.field2357 = new int[var10];
        if (var11 > 0) {
            this.field2366 = new byte[var11];
            this.field2396 = new short[var11];
            this.field2368 = new short[var11];
            this.field2369 = new short[var11];
        }
        if (var16 == 1) {
            this.field2392 = new int[var9];
        }
        if (var12 == 1) {
            this.field2350 = new byte[var10];
            this.field2351 = new byte[var10];
            this.field2363 = new short[var10];
        }
        if (var13 == 255) {
            this.field2359 = new byte[var10];
        } else {
            this.field2364 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2381 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2378 = new int[var10];
        }
        this.field2362 = new short[var10];
        var4.field540 = var21;
        var5.field540 = var36;
        var6.field540 = var38;
        var7.field540 = var40;
        var8.field540 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method726();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method692();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method692();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method692();
            }
            this.field2358[var46] = var43 + var48;
            this.field2352[var46] = var44 + var49;
            this.field2353[var46] = var45 + var50;
            var43 = this.field2358[var46];
            var44 = this.field2352[var46];
            var45 = this.field2353[var46];
            if (var16 == 1) {
                this.field2392[var46] = var8.method726();
            }
        }
        var4.field540 = var32;
        var5.field540 = var28;
        var6.field540 = var26;
        var7.field540 = var30;
        var8.field540 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2362[var51] = (short) var4.method720();
            if (var12 == 1) {
                int var52 = var5.method726();
                if ((var52 & 0x1) == 1) {
                    this.field2350[var51] = 1;
                    var2 = true;
                } else {
                    this.field2350[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2351[var51] = (byte) (var52 >> 2);
                    this.field2363[var51] = this.field2362[var51];
                    this.field2362[var51] = 127;
                    if (this.field2363[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2351[var51] = -1;
                    this.field2363[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2359[var51] = var6.method681();
            }
            if (var14 == 1) {
                this.field2381[var51] = var7.method681();
            }
            if (var15 == 1) {
                this.field2378[var51] = var8.method726();
            }
        }
        var4.field540 = var25;
        var5.field540 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method726();
            if (var58 == 1) {
                var53 = var4.method692() + var56;
                var54 = var4.method692() + var53;
                var55 = var4.method692() + var54;
                var56 = var55;
                this.field2355[var57] = var53;
                this.field2356[var57] = var54;
                this.field2357[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method692() + var56;
                var56 = var55;
                this.field2355[var57] = var53;
                this.field2356[var57] = var54;
                this.field2357[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method692() + var56;
                var56 = var55;
                this.field2355[var57] = var53;
                this.field2356[var57] = var54;
                this.field2357[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method692() + var56;
                var56 = var55;
                this.field2355[var57] = var53;
                this.field2356[var57] = var61;
                this.field2357[var57] = var55;
            }
        }
        var4.field540 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2366[var62] = 0;
            this.field2396[var62] = (short) var4.method720();
            this.field2368[var62] = (short) var4.method720();
            this.field2369[var62] = (short) var4.method720();
        }
        if (this.field2351 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2351[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2396[var65] & 0xFFFF) == this.field2355[var64] && (this.field2368[var65] & 0xFFFF) == this.field2356[var64] && (this.field2369[var65] & 0xFFFF) == this.field2357[var64]) {
                        this.field2351[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2351 = null;
            }
        }
        if (!var3) {
            this.field2363 = null;
        }
        if (!var2) {
            this.field2350 = null;
        }
    }

    @ObfuscatedName("cf.l(Lcf;I)I")
    public final int method2667(class157 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2358[arg1];
        int var5 = arg0.field2352[arg1];
        int var6 = arg0.field2353[arg1];
        for (int var7 = 0; var7 < this.field2367; var7++) {
            if (this.field2358[var7] == var4 && this.field2352[var7] == var5 && this.field2353[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2358[this.field2367] = var4;
            this.field2352[this.field2367] = var5;
            this.field2353[this.field2367] = var6;
            if (arg0.field2392 != null) {
                this.field2392[this.field2367] = arg0.field2392[arg1];
            }
            var3 = this.field2367++;
        }
        return var3;
    }

    @ObfuscatedName("cf.f()Lcf;")
    public class157 method2668() {
        class157 var1 = new class157();
        if (this.field2350 != null) {
            var1.field2350 = new byte[this.field2379];
            for (int var2 = 0; var2 < this.field2379; var2++) {
                var1.field2350[var2] = this.field2350[var2];
            }
        }
        var1.field2367 = this.field2367;
        var1.field2379 = this.field2379;
        var1.field2365 = this.field2365;
        var1.field2358 = this.field2358;
        var1.field2352 = this.field2352;
        var1.field2353 = this.field2353;
        var1.field2355 = this.field2355;
        var1.field2356 = this.field2356;
        var1.field2357 = this.field2357;
        var1.field2359 = this.field2359;
        var1.field2381 = this.field2381;
        var1.field2351 = this.field2351;
        var1.field2362 = this.field2362;
        var1.field2363 = this.field2363;
        var1.field2364 = this.field2364;
        var1.field2366 = this.field2366;
        var1.field2396 = this.field2396;
        var1.field2368 = this.field2368;
        var1.field2369 = this.field2369;
        var1.field2370 = this.field2370;
        var1.field2371 = this.field2371;
        var1.field2377 = this.field2377;
        var1.field2373 = this.field2373;
        var1.field2376 = this.field2376;
        var1.field2374 = this.field2374;
        var1.field2375 = this.field2375;
        var1.field2392 = this.field2392;
        var1.field2378 = this.field2378;
        var1.field2394 = this.field2394;
        var1.field2380 = this.field2380;
        var1.field2382 = this.field2382;
        var1.field2387 = this.field2387;
        var1.field2386 = this.field2386;
        var1.field2385 = this.field2385;
        return var1;
    }

    @ObfuscatedName("cf.a()V")
    public void method2669() {
        if (this.field2354) {
            return;
        }
        this.field2207 = 0;
        this.field2384 = 0;
        this.field2388 = 999999;
        this.field2389 = -999999;
        this.field2390 = -99999;
        this.field2391 = 99999;
        for (int var1 = 0; var1 < this.field2367; var1++) {
            int var2 = this.field2358[var1];
            int var3 = this.field2352[var1];
            int var4 = this.field2353[var1];
            if (var2 < this.field2388) {
                this.field2388 = var2;
            }
            if (var2 > this.field2389) {
                this.field2389 = var2;
            }
            if (var4 < this.field2391) {
                this.field2391 = var4;
            }
            if (var4 > this.field2390) {
                this.field2390 = var4;
            }
            if (-var3 > this.field2207) {
                this.field2207 = -var3;
            }
            if (var3 > this.field2384) {
                this.field2384 = var3;
            }
        }
        this.field2354 = true;
    }

    @ObfuscatedName("cf.r()V")
    public void method2670() {
        for (int var1 = 0; var1 < this.field2367; var1++) {
            this.field2353[var1] = -this.field2353[var1];
        }
        for (int var2 = 0; var2 < this.field2379; var2++) {
            int var3 = this.field2355[var2];
            this.field2355[var2] = this.field2357[var2];
            this.field2357[var2] = var3;
        }
        this.method2681();
    }

    @ObfuscatedName("cf.j()V")
    public void method2671() {
        int var10002;
        if (this.field2392 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2367; var3++) {
                int var4 = this.field2392[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2394 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2394[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2367) {
                int var7 = this.field2392[var6];
                this.field2394[var7][var1[var7]++] = var6++;
            }
            this.field2392 = null;
        }
        if (this.field2378 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2379; var10++) {
            int var11 = this.field2378[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2380 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2380[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2379) {
            int var14 = this.field2378[var13];
            this.field2380[var14][var8[var14]++] = var13++;
        }
        this.field2378 = null;
    }

    @ObfuscatedName("cf.x()V")
    public void method2672() {
        for (int var1 = 0; var1 < this.field2367; var1++) {
            int var2 = this.field2358[var1];
            this.field2358[var1] = this.field2353[var1];
            this.field2353[var1] = -var2;
        }
        this.method2681();
    }

    @ObfuscatedName("cf.g()V")
    public void method2673() {
        for (int var1 = 0; var1 < this.field2367; var1++) {
            this.field2358[var1] = -this.field2358[var1];
            this.field2353[var1] = -this.field2353[var1];
        }
        this.method2681();
    }

    @ObfuscatedName("cf.o()V")
    public void method2674() {
        for (int var1 = 0; var1 < this.field2367; var1++) {
            int var2 = this.field2353[var1];
            this.field2353[var1] = this.field2358[var1];
            this.field2358[var1] = -var2;
        }
        this.method2681();
    }

    @ObfuscatedName("cf.e(I)V")
    public void method2675(int arg0) {
        int var2 = field2395[arg0];
        int var3 = field2361[arg0];
        for (int var4 = 0; var4 < this.field2367; var4++) {
            int var5 = this.field2358[var4] * var3 + this.field2353[var4] * var2 >> 16;
            this.field2353[var4] = this.field2353[var4] * var3 - this.field2358[var4] * var2 >> 16;
            this.field2358[var4] = var5;
        }
        this.method2681();
    }

    @ObfuscatedName("cf.q(III)V")
    public void method2677(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2367; var4++) {
            this.field2358[var4] += arg0;
            this.field2352[var4] += arg1;
            this.field2353[var4] += arg2;
        }
        this.method2681();
    }

    @ObfuscatedName("cf.i(SS)V")
    public void method2678(short arg0, short arg1) {
        if (this.field2363 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2379; var3++) {
            if (this.field2363[var3] == arg0) {
                this.field2363[var3] = arg1;
            }
        }
    }

    public class157() {
    }

    @ObfuscatedName("cf.n(III)V")
    public void method2679(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2367; var4++) {
            this.field2358[var4] = this.field2358[var4] * arg0 / 128;
            this.field2352[var4] = this.field2352[var4] * arg1 / 128;
            this.field2353[var4] = this.field2353[var4] * arg2 / 128;
        }
        this.method2681();
    }

    @ObfuscatedName("cf.u()V")
    public void method2680() {
        if (this.field2382 != null) {
            return;
        }
        this.field2382 = new class151[this.field2367];
        for (int var1 = 0; var1 < this.field2367; var1++) {
            this.field2382[var1] = new class151();
        }
        for (int var2 = 0; var2 < this.field2379; var2++) {
            int var3 = this.field2355[var2];
            int var4 = this.field2356[var2];
            int var5 = this.field2357[var2];
            int var6 = this.field2358[var4] - this.field2358[var3];
            int var7 = this.field2352[var4] - this.field2352[var3];
            int var8 = this.field2353[var4] - this.field2353[var3];
            int var9 = this.field2358[var5] - this.field2358[var3];
            int var10 = this.field2352[var5] - this.field2352[var3];
            int var11 = this.field2353[var5] - this.field2353[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2350 == null) {
                var19 = 0;
            } else {
                var19 = this.field2350[var2];
            }
            if (var19 == 0) {
                class151 var20 = this.field2382[var3];
                var20.field2264 += var16;
                var20.field2258 += var17;
                var20.field2259 += var18;
                var20.field2261++;
                class151 var21 = this.field2382[var4];
                var21.field2264 += var16;
                var21.field2258 += var17;
                var21.field2259 += var18;
                var21.field2261++;
                class151 var22 = this.field2382[var5];
                var22.field2264 += var16;
                var22.field2258 += var17;
                var22.field2259 += var18;
                var22.field2261++;
            } else if (var19 == 1) {
                if (this.field2387 == null) {
                    this.field2387 = new class143[this.field2379];
                }
                class143 var23 = this.field2387[var2] = new class143();
                var23.field2184 = var16;
                var23.field2183 = var17;
                var23.field2180 = var18;
            }
        }
    }

    @ObfuscatedName("cf.y()V")
    public void method2681() {
        this.field2382 = null;
        this.field2383 = null;
        this.field2387 = null;
        this.field2354 = false;
    }

    @ObfuscatedName("cf.v(Lcf;Lcf;IIIZ)V")
    public static void method2683(class157 arg0, class157 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2669();
        arg0.method2680();
        arg1.method2669();
        arg1.method2680();
        field2360++;
        int var6 = 0;
        int[] var7 = arg1.field2358;
        int var8 = arg1.field2367;
        for (int var9 = 0; var9 < arg0.field2367; var9++) {
            class151 var10 = arg0.field2382[var9];
            if (var10.field2261 != 0) {
                int var11 = arg0.field2352[var9] - arg3;
                if (var11 <= arg1.field2384) {
                    int var12 = arg0.field2358[var9] - arg2;
                    if (var12 >= arg1.field2388 && var12 <= arg1.field2389) {
                        int var13 = arg0.field2353[var9] - arg4;
                        if (var13 >= arg1.field2391 && var13 <= arg1.field2390) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class151 var15 = arg1.field2382[var14];
                                if (var7[var14] == var12 && arg1.field2353[var14] == var13 && arg1.field2352[var14] == var11 && var15.field2261 != 0) {
                                    if (arg0.field2383 == null) {
                                        arg0.field2383 = new class151[arg0.field2367];
                                    }
                                    if (arg1.field2383 == null) {
                                        arg1.field2383 = new class151[var8];
                                    }
                                    class151 var16 = arg0.field2383[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2383[var9] = new class151(var10);
                                    }
                                    class151 var17 = arg1.field2383[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2383[var14] = new class151(var15);
                                    }
                                    var16.field2264 += var15.field2264;
                                    var16.field2258 += var15.field2258;
                                    var16.field2259 += var15.field2259;
                                    var16.field2261 += var15.field2261;
                                    var17.field2264 += var10.field2264;
                                    var17.field2258 += var10.field2258;
                                    var17.field2259 += var10.field2259;
                                    var17.field2261 += var10.field2261;
                                    var6++;
                                    field2372[var9] = field2360;
                                    field2393[var14] = field2360;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 < 3 || !arg5) {
            return;
        }
        for (int var18 = 0; var18 < arg0.field2379; var18++) {
            if (field2372[arg0.field2355[var18]] == field2360 && field2372[arg0.field2356[var18]] == field2360 && field2372[arg0.field2357[var18]] == field2360) {
                if (arg0.field2350 == null) {
                    arg0.field2350 = new byte[arg0.field2379];
                }
                arg0.field2350[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2379; var19++) {
            if (field2393[arg1.field2355[var19]] == field2360 && field2393[arg1.field2356[var19]] == field2360 && field2393[arg1.field2357[var19]] == field2360) {
                if (arg1.field2350 == null) {
                    arg1.field2350 = new byte[arg1.field2379];
                }
                arg1.field2350[var19] = 2;
            }
        }
    }

    @ObfuscatedName("cf.ax(II)I")
    public static final int method2685(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cf.s([[IIIIZI)Lcf;")
    public class157 method2690(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2669();
        int var7 = this.field2388 + arg1;
        int var8 = this.field2389 + arg1;
        int var9 = this.field2391 + arg3;
        int var10 = this.field2390 + arg3;
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
        class157 var15;
        if (arg4) {
            var15 = new class157();
            var15.field2367 = this.field2367;
            var15.field2379 = this.field2379;
            var15.field2365 = this.field2365;
            var15.field2358 = this.field2358;
            var15.field2353 = this.field2353;
            var15.field2355 = this.field2355;
            var15.field2356 = this.field2356;
            var15.field2357 = this.field2357;
            var15.field2350 = this.field2350;
            var15.field2359 = this.field2359;
            var15.field2381 = this.field2381;
            var15.field2351 = this.field2351;
            var15.field2362 = this.field2362;
            var15.field2363 = this.field2363;
            var15.field2364 = this.field2364;
            var15.field2366 = this.field2366;
            var15.field2396 = this.field2396;
            var15.field2368 = this.field2368;
            var15.field2369 = this.field2369;
            var15.field2370 = this.field2370;
            var15.field2371 = this.field2371;
            var15.field2377 = this.field2377;
            var15.field2373 = this.field2373;
            var15.field2376 = this.field2376;
            var15.field2374 = this.field2374;
            var15.field2375 = this.field2375;
            var15.field2392 = this.field2392;
            var15.field2378 = this.field2378;
            var15.field2394 = this.field2394;
            var15.field2380 = this.field2380;
            var15.field2386 = this.field2386;
            var15.field2385 = this.field2385;
            var15.field2352 = new int[var15.field2367];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2367; var16++) {
                int var17 = this.field2358[var16] + arg1;
                int var18 = this.field2353[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2352[var16] = this.field2352[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2367; var26++) {
                int var27 = (-this.field2352[var26] << 16) / this.field2207;
                if (var27 < arg5) {
                    int var28 = this.field2358[var26] + arg1;
                    int var29 = this.field2353[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2352[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2352[var26];
                }
            }
        }
        var15.method2681();
        return var15;
    }

    @ObfuscatedName("cf.k([B)V")
    public void method2692(byte[] arg0) {
        class50 var2 = new class50(arg0);
        class50 var3 = new class50(arg0);
        class50 var4 = new class50(arg0);
        class50 var5 = new class50(arg0);
        class50 var6 = new class50(arg0);
        class50 var7 = new class50(arg0);
        class50 var8 = new class50(arg0);
        var2.field540 = arg0.length - 23;
        int var9 = var2.method720();
        int var10 = var2.method720();
        int var11 = var2.method726();
        int var12 = var2.method726();
        int var13 = var2.method726();
        int var14 = var2.method726();
        int var15 = var2.method726();
        int var16 = var2.method726();
        int var17 = var2.method726();
        int var18 = var2.method720();
        int var19 = var2.method720();
        int var20 = var2.method720();
        int var21 = var2.method720();
        int var22 = var2.method720();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2366 = new byte[var11];
            var2.field540 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2366[var26] = var2.method681();
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field2367 = var9;
        this.field2379 = var10;
        this.field2365 = var11;
        this.field2358 = new int[var9];
        this.field2352 = new int[var9];
        this.field2353 = new int[var9];
        this.field2355 = new int[var10];
        this.field2356 = new int[var10];
        this.field2357 = new int[var10];
        if (var17 == 1) {
            this.field2392 = new int[var9];
        }
        if (var12 == 1) {
            this.field2350 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2359 = new byte[var10];
        } else {
            this.field2364 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2381 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2378 = new int[var10];
        }
        if (var16 == 1) {
            this.field2363 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2351 = new byte[var10];
        }
        this.field2362 = new short[var10];
        if (var11 > 0) {
            this.field2396 = new short[var11];
            this.field2368 = new short[var11];
            this.field2369 = new short[var11];
            if (var24 > 0) {
                this.field2370 = new short[var24];
                this.field2371 = new short[var24];
                this.field2377 = new short[var24];
                this.field2373 = new short[var24];
                this.field2376 = new byte[var24];
                this.field2374 = new short[var24];
            }
            if (var25 > 0) {
                this.field2375 = new short[var25];
            }
        }
        var2.field540 = var11;
        var3.field540 = var44;
        var4.field540 = var46;
        var5.field540 = var48;
        var6.field540 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method726();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method692();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method692();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method692();
            }
            this.field2358[var67] = var64 + var69;
            this.field2352[var67] = var65 + var70;
            this.field2353[var67] = var66 + var71;
            var64 = this.field2358[var67];
            var65 = this.field2352[var67];
            var66 = this.field2353[var67];
            if (var17 == 1) {
                this.field2392[var67] = var6.method726();
            }
        }
        var2.field540 = var42;
        var3.field540 = var31;
        var4.field540 = var34;
        var5.field540 = var37;
        var6.field540 = var35;
        var7.field540 = var40;
        var8.field540 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2362[var72] = (short) var2.method720();
            if (var12 == 1) {
                this.field2350[var72] = var3.method681();
            }
            if (var13 == 255) {
                this.field2359[var72] = var4.method681();
            }
            if (var14 == 1) {
                this.field2381[var72] = var5.method681();
            }
            if (var15 == 1) {
                this.field2378[var72] = var6.method726();
            }
            if (var16 == 1) {
                this.field2363[var72] = (short) (var7.method720() - 1);
            }
            if (this.field2351 != null && this.field2363[var72] != -1) {
                this.field2351[var72] = (byte) (var8.method726() - 1);
            }
        }
        var2.field540 = var33;
        var3.field540 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method726();
            if (var78 == 1) {
                var73 = var2.method692() + var76;
                var74 = var2.method692() + var73;
                var75 = var2.method692() + var74;
                var76 = var75;
                this.field2355[var77] = var73;
                this.field2356[var77] = var74;
                this.field2357[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method692() + var76;
                var76 = var75;
                this.field2355[var77] = var73;
                this.field2356[var77] = var74;
                this.field2357[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method692() + var76;
                var76 = var75;
                this.field2355[var77] = var73;
                this.field2356[var77] = var74;
                this.field2357[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method692() + var76;
                var76 = var75;
                this.field2355[var77] = var73;
                this.field2356[var77] = var81;
                this.field2357[var77] = var75;
            }
        }
        var2.field540 = var50;
        var3.field540 = var52;
        var4.field540 = var54;
        var5.field540 = var56;
        var6.field540 = var58;
        var7.field540 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2366[var82] & 0xFF;
            if (var83 == 0) {
                this.field2396[var82] = (short) var2.method720();
                this.field2368[var82] = (short) var2.method720();
                this.field2369[var82] = (short) var2.method720();
            }
            if (var83 == 1) {
                this.field2396[var82] = (short) var3.method720();
                this.field2368[var82] = (short) var3.method720();
                this.field2369[var82] = (short) var3.method720();
                this.field2370[var82] = (short) var4.method720();
                this.field2371[var82] = (short) var4.method720();
                this.field2377[var82] = (short) var4.method720();
                this.field2373[var82] = (short) var5.method720();
                this.field2376[var82] = var6.method681();
                this.field2374[var82] = (short) var7.method720();
            }
            if (var83 == 2) {
                this.field2396[var82] = (short) var3.method720();
                this.field2368[var82] = (short) var3.method720();
                this.field2369[var82] = (short) var3.method720();
                this.field2370[var82] = (short) var4.method720();
                this.field2371[var82] = (short) var4.method720();
                this.field2377[var82] = (short) var4.method720();
                this.field2373[var82] = (short) var5.method720();
                this.field2376[var82] = var6.method681();
                this.field2374[var82] = (short) var7.method720();
                this.field2375[var82] = (short) var7.method720();
            }
            if (var83 == 3) {
                this.field2396[var82] = (short) var3.method720();
                this.field2368[var82] = (short) var3.method720();
                this.field2369[var82] = (short) var3.method720();
                this.field2370[var82] = (short) var4.method720();
                this.field2371[var82] = (short) var4.method720();
                this.field2377[var82] = (short) var4.method720();
                this.field2373[var82] = (short) var5.method720();
                this.field2376[var82] = var6.method681();
                this.field2374[var82] = (short) var7.method720();
            }
        }
        var2.field540 = var62;
        int var84 = var2.method726();
        if (var84 == 0) {
            return;
        }
        new class139();
        var2.method720();
        var2.method720();
        var2.method720();
        var2.method685();
    }

    @ObfuscatedName("cf.z(SS)V")
    public void method2701(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2379; var3++) {
            if (this.field2362[var3] == arg0) {
                this.field2362[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("cf.ac(IIIII)Ldu;")
    public final class27 method2706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2680();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class27 var8 = new class27();
        var8.field314 = new int[this.field2379];
        var8.field278 = new int[this.field2379];
        var8.field279 = new int[this.field2379];
        if (this.field2365 > 0 && this.field2351 != null) {
            int[] var9 = new int[this.field2365];
            for (int var10 = 0; var10 < this.field2379; var10++) {
                if (this.field2351[var10] != -1) {
                    var9[this.field2351[var10] & 0xFF]++;
                }
            }
            var8.field312 = 0;
            for (int var11 = 0; var11 < this.field2365; var11++) {
                if (var9[var11] > 0 && this.field2366[var11] == 0) {
                    var8.field312++;
                }
            }
            var8.field286 = new int[var8.field312];
            var8.field287 = new int[var8.field312];
            var8.field288 = new int[var8.field312];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2365; var13++) {
                if (var9[var13] > 0 && this.field2366[var13] == 0) {
                    var8.field286[var12] = this.field2396[var13] & 0xFFFF;
                    var8.field287[var12] = this.field2368[var13] & 0xFFFF;
                    var8.field288[var12] = this.field2369[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field282 = new byte[this.field2379];
            for (int var14 = 0; var14 < this.field2379; var14++) {
                if (this.field2351[var14] == -1) {
                    var8.field282[var14] = -1;
                } else {
                    var8.field282[var14] = (byte) var9[this.field2351[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2379; var15++) {
            byte var16;
            if (this.field2350 == null) {
                var16 = 0;
            } else {
                var16 = this.field2350[var15];
            }
            byte var17;
            if (this.field2381 == null) {
                var17 = 0;
            } else {
                var17 = this.field2381[var15];
            }
            short var18;
            if (this.field2363 == null) {
                var18 = -1;
            } else {
                var18 = this.field2363[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2362[var15] & 0xFFFF;
                    class151 var20;
                    if (this.field2383 == null || this.field2383[this.field2355[var15]] == null) {
                        var20 = this.field2382[this.field2355[var15]];
                    } else {
                        var20 = this.field2383[this.field2355[var15]];
                    }
                    int var21 = (var20.field2259 * arg4 + var20.field2264 * arg2 + var20.field2258 * arg3) / (var20.field2261 * var7) + arg0;
                    var8.field314[var15] = method2685(var19, var21);
                    class151 var22;
                    if (this.field2383 == null || this.field2383[this.field2356[var15]] == null) {
                        var22 = this.field2382[this.field2356[var15]];
                    } else {
                        var22 = this.field2383[this.field2356[var15]];
                    }
                    int var23 = (var22.field2259 * arg4 + var22.field2264 * arg2 + var22.field2258 * arg3) / (var22.field2261 * var7) + arg0;
                    var8.field278[var15] = method2685(var19, var23);
                    class151 var24;
                    if (this.field2383 == null || this.field2383[this.field2357[var15]] == null) {
                        var24 = this.field2382[this.field2357[var15]];
                    } else {
                        var24 = this.field2383[this.field2357[var15]];
                    }
                    int var25 = (var24.field2259 * arg4 + var24.field2264 * arg2 + var24.field2258 * arg3) / (var24.field2261 * var7) + arg0;
                    var8.field279[var15] = method2685(var19, var25);
                } else if (var16 == 1) {
                    class143 var26 = this.field2387[var15];
                    int var27 = (var26.field2180 * arg4 + var26.field2184 * arg2 + var26.field2183 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field314[var15] = method2685(this.field2362[var15] & 0xFFFF, var27);
                    var8.field279[var15] = -1;
                } else if (var16 == 3) {
                    var8.field314[var15] = 128;
                    var8.field279[var15] = -1;
                } else {
                    var8.field279[var15] = -2;
                }
            } else if (var16 == 0) {
                class151 var28;
                if (this.field2383 == null || this.field2383[this.field2355[var15]] == null) {
                    var28 = this.field2382[this.field2355[var15]];
                } else {
                    var28 = this.field2383[this.field2355[var15]];
                }
                int var29 = (var28.field2259 * arg4 + var28.field2264 * arg2 + var28.field2258 * arg3) / (var28.field2261 * var7) + arg0;
                var8.field314[var15] = method2734(var29);
                class151 var30;
                if (this.field2383 == null || this.field2383[this.field2356[var15]] == null) {
                    var30 = this.field2382[this.field2356[var15]];
                } else {
                    var30 = this.field2383[this.field2356[var15]];
                }
                int var31 = (var30.field2259 * arg4 + var30.field2264 * arg2 + var30.field2258 * arg3) / (var30.field2261 * var7) + arg0;
                var8.field278[var15] = method2734(var31);
                class151 var32;
                if (this.field2383 == null || this.field2383[this.field2357[var15]] == null) {
                    var32 = this.field2382[this.field2357[var15]];
                } else {
                    var32 = this.field2383[this.field2357[var15]];
                }
                int var33 = (var32.field2259 * arg4 + var32.field2264 * arg2 + var32.field2258 * arg3) / (var32.field2261 * var7) + arg0;
                var8.field279[var15] = method2734(var33);
            } else if (var16 == 1) {
                class143 var34 = this.field2387[var15];
                int var35 = (var34.field2180 * arg4 + var34.field2184 * arg2 + var34.field2183 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field314[var15] = method2734(var35);
                var8.field279[var15] = -1;
            } else {
                var8.field279[var15] = -2;
            }
        }
        this.method2671();
        var8.field269 = this.field2367;
        var8.field270 = this.field2358;
        var8.field271 = this.field2352;
        var8.field290 = this.field2353;
        var8.field273 = this.field2379;
        var8.field274 = this.field2355;
        var8.field272 = this.field2356;
        var8.field327 = this.field2357;
        var8.field280 = this.field2359;
        var8.field281 = this.field2381;
        var8.field267 = this.field2364;
        var8.field299 = this.field2394;
        var8.field323 = this.field2380;
        var8.field283 = this.field2363;
        return var8;
    }

    public class157(class157[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2367 = 0;
        this.field2379 = 0;
        this.field2365 = 0;
        this.field2364 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class157 var10 = arg0[var9];
            if (var10 != null) {
                this.field2367 += var10.field2367;
                this.field2379 += var10.field2379;
                this.field2365 += var10.field2365;
                if (var10.field2359 == null) {
                    if (this.field2364 == -1) {
                        this.field2364 = var10.field2364;
                    }
                    if (this.field2364 != var10.field2364) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2350 != null;
                var5 |= var10.field2381 != null;
                var6 |= var10.field2378 != null;
                var7 |= var10.field2363 != null;
                var8 |= var10.field2351 != null;
            }
        }
        this.field2358 = new int[this.field2367];
        this.field2352 = new int[this.field2367];
        this.field2353 = new int[this.field2367];
        this.field2392 = new int[this.field2367];
        this.field2355 = new int[this.field2379];
        this.field2356 = new int[this.field2379];
        this.field2357 = new int[this.field2379];
        if (var3) {
            this.field2350 = new byte[this.field2379];
        }
        if (var4) {
            this.field2359 = new byte[this.field2379];
        }
        if (var5) {
            this.field2381 = new byte[this.field2379];
        }
        if (var6) {
            this.field2378 = new int[this.field2379];
        }
        if (var7) {
            this.field2363 = new short[this.field2379];
        }
        if (var8) {
            this.field2351 = new byte[this.field2379];
        }
        this.field2362 = new short[this.field2379];
        if (this.field2365 > 0) {
            this.field2366 = new byte[this.field2365];
            this.field2396 = new short[this.field2365];
            this.field2368 = new short[this.field2365];
            this.field2369 = new short[this.field2365];
            this.field2370 = new short[this.field2365];
            this.field2371 = new short[this.field2365];
            this.field2377 = new short[this.field2365];
            this.field2373 = new short[this.field2365];
            this.field2376 = new byte[this.field2365];
            this.field2374 = new short[this.field2365];
            this.field2375 = new short[this.field2365];
        }
        this.field2367 = 0;
        this.field2379 = 0;
        this.field2365 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class157 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2379; var13++) {
                    if (var3 && var12.field2350 != null) {
                        this.field2350[this.field2379] = var12.field2350[var13];
                    }
                    if (var4) {
                        if (var12.field2359 == null) {
                            this.field2359[this.field2379] = var12.field2364;
                        } else {
                            this.field2359[this.field2379] = var12.field2359[var13];
                        }
                    }
                    if (var5 && var12.field2381 != null) {
                        this.field2381[this.field2379] = var12.field2381[var13];
                    }
                    if (var6 && var12.field2378 != null) {
                        this.field2378[this.field2379] = var12.field2378[var13];
                    }
                    if (var7) {
                        if (var12.field2363 == null) {
                            this.field2363[this.field2379] = -1;
                        } else {
                            this.field2363[this.field2379] = var12.field2363[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2351 == null || var12.field2351[var13] == -1) {
                            this.field2351[this.field2379] = -1;
                        } else {
                            this.field2351[this.field2379] = (byte) (var12.field2351[var13] + this.field2365);
                        }
                    }
                    this.field2362[this.field2379] = var12.field2362[var13];
                    this.field2355[this.field2379] = this.method2667(var12, var12.field2355[var13]);
                    this.field2356[this.field2379] = this.method2667(var12, var12.field2356[var13]);
                    this.field2357[this.field2379] = this.method2667(var12, var12.field2357[var13]);
                    this.field2379++;
                }
                for (int var14 = 0; var14 < var12.field2365; var14++) {
                    byte var15 = this.field2366[this.field2365] = var12.field2366[var14];
                    if (var15 == 0) {
                        this.field2396[this.field2365] = (short) this.method2667(var12, var12.field2396[var14]);
                        this.field2368[this.field2365] = (short) this.method2667(var12, var12.field2368[var14]);
                        this.field2369[this.field2365] = (short) this.method2667(var12, var12.field2369[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2396[this.field2365] = var12.field2396[var14];
                        this.field2368[this.field2365] = var12.field2368[var14];
                        this.field2369[this.field2365] = var12.field2369[var14];
                        this.field2370[this.field2365] = var12.field2370[var14];
                        this.field2371[this.field2365] = var12.field2371[var14];
                        this.field2377[this.field2365] = var12.field2377[var14];
                        this.field2373[this.field2365] = var12.field2373[var14];
                        this.field2376[this.field2365] = var12.field2376[var14];
                        this.field2374[this.field2365] = var12.field2374[var14];
                    }
                    if (var15 == 2) {
                        this.field2375[this.field2365] = var12.field2375[var14];
                    }
                    this.field2365++;
                }
            }
        }
    }

    public class157(class157 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2367 = arg0.field2367;
        this.field2379 = arg0.field2379;
        this.field2365 = arg0.field2365;
        if (arg1) {
            this.field2358 = arg0.field2358;
            this.field2352 = arg0.field2352;
            this.field2353 = arg0.field2353;
        } else {
            this.field2358 = new int[this.field2367];
            this.field2352 = new int[this.field2367];
            this.field2353 = new int[this.field2367];
            for (int var6 = 0; var6 < this.field2367; var6++) {
                this.field2358[var6] = arg0.field2358[var6];
                this.field2352[var6] = arg0.field2352[var6];
                this.field2353[var6] = arg0.field2353[var6];
            }
        }
        if (arg2) {
            this.field2362 = arg0.field2362;
        } else {
            this.field2362 = new short[this.field2379];
            for (int var7 = 0; var7 < this.field2379; var7++) {
                this.field2362[var7] = arg0.field2362[var7];
            }
        }
        if (arg3 || arg0.field2363 == null) {
            this.field2363 = arg0.field2363;
        } else {
            this.field2363 = new short[this.field2379];
            for (int var8 = 0; var8 < this.field2379; var8++) {
                this.field2363[var8] = arg0.field2363[var8];
            }
        }
        if (arg4) {
            this.field2381 = arg0.field2381;
        } else {
            this.field2381 = new byte[this.field2379];
            if (arg0.field2381 == null) {
                for (int var9 = 0; var9 < this.field2379; var9++) {
                    this.field2381[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2379; var10++) {
                    this.field2381[var10] = arg0.field2381[var10];
                }
            }
        }
        this.field2355 = arg0.field2355;
        this.field2356 = arg0.field2356;
        this.field2357 = arg0.field2357;
        this.field2350 = arg0.field2350;
        this.field2359 = arg0.field2359;
        this.field2351 = arg0.field2351;
        this.field2364 = arg0.field2364;
        this.field2366 = arg0.field2366;
        this.field2396 = arg0.field2396;
        this.field2368 = arg0.field2368;
        this.field2369 = arg0.field2369;
        this.field2370 = arg0.field2370;
        this.field2371 = arg0.field2371;
        this.field2377 = arg0.field2377;
        this.field2373 = arg0.field2373;
        this.field2376 = arg0.field2376;
        this.field2374 = arg0.field2374;
        this.field2375 = arg0.field2375;
        this.field2392 = arg0.field2392;
        this.field2378 = arg0.field2378;
        this.field2394 = arg0.field2394;
        this.field2380 = arg0.field2380;
        this.field2382 = arg0.field2382;
        this.field2387 = arg0.field2387;
        this.field2383 = arg0.field2383;
        this.field2386 = arg0.field2386;
        this.field2385 = arg0.field2385;
    }

    @ObfuscatedName("cf.aw(I)I")
    public static final int method2734(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
