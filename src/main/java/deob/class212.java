package deob;

@ObfuscatedName("he")
public class class212 extends class222 {

    @ObfuscatedName("he.s")
    public int field2390 = 0;

    @ObfuscatedName("he.z")
    public int[] field2391;

    @ObfuscatedName("he.j")
    public int[] field2409;

    @ObfuscatedName("he.i")
    public int[] field2393;

    @ObfuscatedName("he.n")
    public int field2417 = 0;

    @ObfuscatedName("he.l")
    public int[] field2395;

    @ObfuscatedName("he.k")
    public int[] field2396;

    @ObfuscatedName("he.c")
    public int[] field2397;

    @ObfuscatedName("he.r")
    public byte[] field2419;

    @ObfuscatedName("he.b")
    public byte[] field2399;

    @ObfuscatedName("he.m")
    public byte[] field2387;

    @ObfuscatedName("he.t")
    public byte[] field2401;

    @ObfuscatedName("he.h")
    public short[] field2418;

    @ObfuscatedName("he.p")
    public short[] field2403;

    @ObfuscatedName("he.o")
    public byte field2431 = 0;

    @ObfuscatedName("he.u")
    public int field2388;

    @ObfuscatedName("he.x")
    public byte[] field2406;

    @ObfuscatedName("he.a")
    public short[] field2407;

    @ObfuscatedName("he.q")
    public short[] field2405;

    @ObfuscatedName("he.d")
    public short[] field2411;

    @ObfuscatedName("he.e")
    public int[] field2410;

    @ObfuscatedName("he.g")
    public int[] field2398;

    @ObfuscatedName("he.y")
    public int[][] field2412;

    @ObfuscatedName("he.af")
    public int[][] field2413;

    @ObfuscatedName("he.aa")
    public int[][] field2414;

    @ObfuscatedName("he.ai")
    public int[][] field2415;

    @ObfuscatedName("he.ag")
    public class223[] field2416;

    @ObfuscatedName("he.aw")
    public class230[] field2422;

    @ObfuscatedName("he.ar")
    public class230[] field2404;

    @ObfuscatedName("he.al")
    public short field2394;

    @ObfuscatedName("he.at")
    public short field2408;

    @ObfuscatedName("he.aj")
    public boolean field2421 = false;

    @ObfuscatedName("he.ax")
    public int field2402;

    @ObfuscatedName("he.az")
    public int field2423;

    @ObfuscatedName("he.ap")
    public int field2424;

    @ObfuscatedName("he.ay")
    public int field2425;

    @ObfuscatedName("he.ac")
    public int field2426;

    @ObfuscatedName("he.av")
    public static int[] field2400 = new int[10000];

    @ObfuscatedName("he.aq")
    public static int[] field2428 = new int[10000];

    @ObfuscatedName("he.ak")
    public static int field2429 = 0;

    @ObfuscatedName("he.au")
    public static int[] field2427 = class217.field2515;

    @ObfuscatedName("he.ae")
    public static int[] field2392 = class217.field2516;

    public class212() {
    }

    @ObfuscatedName("he.f(Lln;II)Lhe;")
    public static class212 method3915(class337 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5990(arg1, arg2);
        return var3 == null ? null : new class212(var3);
    }

    public class212(byte[] arg0) {
        class474 var2 = new class474(10);
        var2.method7950(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3889(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3887(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3891(arg0);
        } else {
            this.method3892(arg0);
        }
    }

    @ObfuscatedName("he.v([B)V")
    public void method3889(byte[] arg0) {
        class474 var2 = new class474(arg0);
        class474 var3 = new class474(arg0);
        class474 var4 = new class474(arg0);
        class474 var5 = new class474(arg0);
        class474 var6 = new class474(arg0);
        class474 var7 = new class474(arg0);
        class474 var8 = new class474(arg0);
        var2.field4939 = arg0.length - 26;
        int var9 = var2.method8032();
        int var10 = var2.method8032();
        int var11 = var2.method7964();
        int var12 = var2.method7964();
        int var13 = var2.method7964();
        int var14 = var2.method7964();
        int var15 = var2.method7964();
        int var16 = var2.method7964();
        int var17 = var2.method7964();
        int var18 = var2.method7964();
        int var19 = var2.method8032();
        int var20 = var2.method8032();
        int var21 = var2.method8032();
        int var22 = var2.method8032();
        int var23 = var2.method8032();
        int var24 = var2.method8032();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2406 = new byte[var11];
            var2.field4939 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2406[var28] = var2.method7965();
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var12 == 1) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var13 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var15 == 1) {
            var35 += var10;
        }
        int var39 = var24 + var35;
        int var40 = var39;
        if (var14 == 1) {
            var39 += var10;
        }
        int var42 = var22 + var39;
        int var43 = var42;
        if (var16 == 1) {
            var42 += var10 * 2;
        }
        int var45 = var23 + var42;
        int var47 = var10 * 2 + var45;
        int var49 = var19 + var47;
        int var51 = var20 + var49;
        int var53 = var21 + var51;
        int var55 = var25 * 6 + var53;
        int var57 = var26 * 6 + var55;
        int var59 = var26 * 6 + var57;
        int var61 = var26 * 2 + var59;
        int var63 = var26 + var61;
        int var65 = var26 * 2 + var27 * 2 + var63;
        this.field2390 = var9;
        this.field2417 = var10;
        this.field2388 = var11;
        this.field2391 = new int[var9];
        this.field2409 = new int[var9];
        this.field2393 = new int[var9];
        this.field2395 = new int[var10];
        this.field2396 = new int[var10];
        this.field2397 = new int[var10];
        if (var17 == 1) {
            this.field2410 = new int[var9];
        }
        if (var12 == 1) {
            this.field2419 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2399 = new byte[var10];
        } else {
            this.field2431 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2387 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2398 = new int[var10];
        }
        if (var16 == 1) {
            this.field2403 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2401 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2414 = new int[var9][];
            this.field2415 = new int[var9][];
        }
        this.field2418 = new short[var10];
        if (var11 > 0) {
            this.field2407 = new short[var11];
            this.field2405 = new short[var11];
            this.field2411 = new short[var11];
        }
        var2.field4939 = var11;
        var3.field4939 = var47;
        var4.field4939 = var49;
        var5.field4939 = var51;
        var6.field4939 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method7964();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method7978();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method7978();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method7978();
            }
            this.field2391[var70] = var67 + var72;
            this.field2409[var70] = var68 + var73;
            this.field2393[var70] = var69 + var74;
            var67 = this.field2391[var70];
            var68 = this.field2409[var70];
            var69 = this.field2393[var70];
            if (var17 == 1) {
                this.field2410[var70] = var6.method7964();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method7964();
                this.field2414[var75] = new int[var76];
                this.field2415[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2414[var75][var77] = var6.method7964();
                    this.field2415[var75][var77] = var6.method7964();
                }
            }
        }
        var2.field4939 = var45;
        var3.field4939 = var33;
        var4.field4939 = var36;
        var5.field4939 = var40;
        var6.field4939 = var37;
        var7.field4939 = var43;
        var8.field4939 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2418[var78] = (short) var2.method8032();
            if (var12 == 1) {
                this.field2419[var78] = var3.method7965();
            }
            if (var13 == 255) {
                this.field2399[var78] = var4.method7965();
            }
            if (var14 == 1) {
                this.field2387[var78] = var5.method7965();
            }
            if (var15 == 1) {
                this.field2398[var78] = var6.method7964();
            }
            if (var16 == 1) {
                this.field2403[var78] = (short) (var7.method8032() - 1);
            }
            if (this.field2401 != null && this.field2403[var78] != -1) {
                this.field2401[var78] = (byte) (var8.method7964() - 1);
            }
        }
        var2.field4939 = var39;
        var3.field4939 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method7964();
            if (var84 == 1) {
                var79 = var2.method7978() + var82;
                var80 = var2.method7978() + var79;
                var81 = var2.method7978() + var80;
                var82 = var81;
                this.field2395[var83] = var79;
                this.field2396[var83] = var80;
                this.field2397[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method7978() + var82;
                var82 = var81;
                this.field2395[var83] = var79;
                this.field2396[var83] = var80;
                this.field2397[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method7978() + var82;
                var82 = var81;
                this.field2395[var83] = var79;
                this.field2396[var83] = var80;
                this.field2397[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method7978() + var82;
                var82 = var81;
                this.field2395[var83] = var79;
                this.field2396[var83] = var87;
                this.field2397[var83] = var81;
            }
        }
        var2.field4939 = var53;
        var3.field4939 = var55;
        var4.field4939 = var57;
        var5.field4939 = var59;
        var6.field4939 = var61;
        var7.field4939 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2406[var88] & 0xFF;
            if (var89 == 0) {
                this.field2407[var88] = (short) var2.method8032();
                this.field2405[var88] = (short) var2.method8032();
                this.field2411[var88] = (short) var2.method8032();
            }
        }
        var2.field4939 = var65;
        int var90 = var2.method7964();
        if (var90 == 0) {
            return;
        }
        new class232();
        var2.method8032();
        var2.method8032();
        var2.method8032();
        var2.method7979();
    }

    @ObfuscatedName("he.s([B)V")
    public void method3887(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class474 var4 = new class474(arg0);
        class474 var5 = new class474(arg0);
        class474 var6 = new class474(arg0);
        class474 var7 = new class474(arg0);
        class474 var8 = new class474(arg0);
        var4.field4939 = arg0.length - 23;
        int var9 = var4.method8032();
        int var10 = var4.method8032();
        int var11 = var4.method7964();
        int var12 = var4.method7964();
        int var13 = var4.method7964();
        int var14 = var4.method7964();
        int var15 = var4.method7964();
        int var16 = var4.method7964();
        int var17 = var4.method7964();
        int var18 = var4.method8032();
        int var19 = var4.method8032();
        int var20 = var4.method8032();
        int var21 = var4.method8032();
        int var22 = var4.method8032();
        byte var23 = 0;
        int var25 = var9 + var23;
        int var27 = var10 + var25;
        int var28 = var27;
        if (var13 == 255) {
            var27 += var10;
        }
        int var29 = var27;
        if (var15 == 1) {
            var27 += var10;
        }
        int var30 = var27;
        if (var12 == 1) {
            var27 += var10;
        }
        int var32 = var22 + var27;
        int var33 = var32;
        if (var14 == 1) {
            var32 += var10;
        }
        int var35 = var21 + var32;
        int var37 = var10 * 2 + var35;
        int var39 = var11 * 6 + var37;
        int var41 = var18 + var39;
        int var43 = var19 + var41;
        int var10000 = var20 + var43;
        this.field2390 = var9;
        this.field2417 = var10;
        this.field2388 = var11;
        this.field2391 = new int[var9];
        this.field2409 = new int[var9];
        this.field2393 = new int[var9];
        this.field2395 = new int[var10];
        this.field2396 = new int[var10];
        this.field2397 = new int[var10];
        if (var11 > 0) {
            this.field2406 = new byte[var11];
            this.field2407 = new short[var11];
            this.field2405 = new short[var11];
            this.field2411 = new short[var11];
        }
        if (var16 == 1) {
            this.field2410 = new int[var9];
        }
        if (var12 == 1) {
            this.field2419 = new byte[var10];
            this.field2401 = new byte[var10];
            this.field2403 = new short[var10];
        }
        if (var13 == 255) {
            this.field2399 = new byte[var10];
        } else {
            this.field2431 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2387 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2398 = new int[var10];
        }
        if (var17 == 1) {
            this.field2414 = new int[var9][];
            this.field2415 = new int[var9][];
        }
        this.field2418 = new short[var10];
        var4.field4939 = var23;
        var5.field4939 = var39;
        var6.field4939 = var41;
        var7.field4939 = var43;
        var8.field4939 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method7964();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method7978();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method7978();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method7978();
            }
            this.field2391[var49] = var46 + var51;
            this.field2409[var49] = var47 + var52;
            this.field2393[var49] = var48 + var53;
            var46 = this.field2391[var49];
            var47 = this.field2409[var49];
            var48 = this.field2393[var49];
            if (var16 == 1) {
                this.field2410[var49] = var8.method7964();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method7964();
                this.field2414[var54] = new int[var55];
                this.field2415[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2414[var54][var56] = var8.method7964();
                    this.field2415[var54][var56] = var8.method7964();
                }
            }
        }
        var4.field4939 = var35;
        var5.field4939 = var30;
        var6.field4939 = var28;
        var7.field4939 = var33;
        var8.field4939 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2418[var57] = (short) var4.method8032();
            if (var12 == 1) {
                int var58 = var5.method7964();
                if ((var58 & 0x1) == 1) {
                    this.field2419[var57] = 1;
                    var2 = true;
                } else {
                    this.field2419[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2401[var57] = (byte) (var58 >> 2);
                    this.field2403[var57] = this.field2418[var57];
                    this.field2418[var57] = 127;
                    if (this.field2403[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2401[var57] = -1;
                    this.field2403[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2399[var57] = var6.method7965();
            }
            if (var14 == 1) {
                this.field2387[var57] = var7.method7965();
            }
            if (var15 == 1) {
                this.field2398[var57] = var8.method7964();
            }
        }
        var4.field4939 = var32;
        var5.field4939 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method7964();
            if (var64 == 1) {
                var59 = var4.method7978() + var62;
                var60 = var4.method7978() + var59;
                var61 = var4.method7978() + var60;
                var62 = var61;
                this.field2395[var63] = var59;
                this.field2396[var63] = var60;
                this.field2397[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method7978() + var62;
                var62 = var61;
                this.field2395[var63] = var59;
                this.field2396[var63] = var60;
                this.field2397[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method7978() + var62;
                var62 = var61;
                this.field2395[var63] = var59;
                this.field2396[var63] = var60;
                this.field2397[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method7978() + var62;
                var62 = var61;
                this.field2395[var63] = var59;
                this.field2396[var63] = var67;
                this.field2397[var63] = var61;
            }
        }
        var4.field4939 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2406[var68] = 0;
            this.field2407[var68] = (short) var4.method8032();
            this.field2405[var68] = (short) var4.method8032();
            this.field2411[var68] = (short) var4.method8032();
        }
        if (this.field2401 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2401[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2407[var71] & 0xFFFF) == this.field2395[var70] && (this.field2405[var71] & 0xFFFF) == this.field2396[var70] && (this.field2411[var71] & 0xFFFF) == this.field2397[var70]) {
                        this.field2401[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2401 = null;
            }
        }
        if (!var3) {
            this.field2403 = null;
        }
        if (!var2) {
            this.field2419 = null;
        }
    }

    @ObfuscatedName("he.k([B)V")
    public void method3891(byte[] arg0) {
        class474 var2 = new class474(arg0);
        class474 var3 = new class474(arg0);
        class474 var4 = new class474(arg0);
        class474 var5 = new class474(arg0);
        class474 var6 = new class474(arg0);
        class474 var7 = new class474(arg0);
        class474 var8 = new class474(arg0);
        var2.field4939 = arg0.length - 23;
        int var9 = var2.method8032();
        int var10 = var2.method8032();
        int var11 = var2.method7964();
        int var12 = var2.method7964();
        int var13 = var2.method7964();
        int var14 = var2.method7964();
        int var15 = var2.method7964();
        int var16 = var2.method7964();
        int var17 = var2.method7964();
        int var18 = var2.method8032();
        int var19 = var2.method8032();
        int var20 = var2.method8032();
        int var21 = var2.method8032();
        int var22 = var2.method8032();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2406 = new byte[var11];
            var2.field4939 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2406[var26] = var2.method7965();
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
        this.field2390 = var9;
        this.field2417 = var10;
        this.field2388 = var11;
        this.field2391 = new int[var9];
        this.field2409 = new int[var9];
        this.field2393 = new int[var9];
        this.field2395 = new int[var10];
        this.field2396 = new int[var10];
        this.field2397 = new int[var10];
        if (var17 == 1) {
            this.field2410 = new int[var9];
        }
        if (var12 == 1) {
            this.field2419 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2399 = new byte[var10];
        } else {
            this.field2431 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2387 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2398 = new int[var10];
        }
        if (var16 == 1) {
            this.field2403 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2401 = new byte[var10];
        }
        this.field2418 = new short[var10];
        if (var11 > 0) {
            this.field2407 = new short[var11];
            this.field2405 = new short[var11];
            this.field2411 = new short[var11];
        }
        var2.field4939 = var11;
        var3.field4939 = var44;
        var4.field4939 = var46;
        var5.field4939 = var48;
        var6.field4939 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method7964();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method7978();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method7978();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method7978();
            }
            this.field2391[var67] = var64 + var69;
            this.field2409[var67] = var65 + var70;
            this.field2393[var67] = var66 + var71;
            var64 = this.field2391[var67];
            var65 = this.field2409[var67];
            var66 = this.field2393[var67];
            if (var17 == 1) {
                this.field2410[var67] = var6.method7964();
            }
        }
        var2.field4939 = var42;
        var3.field4939 = var31;
        var4.field4939 = var34;
        var5.field4939 = var37;
        var6.field4939 = var35;
        var7.field4939 = var40;
        var8.field4939 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2418[var72] = (short) var2.method8032();
            if (var12 == 1) {
                this.field2419[var72] = var3.method7965();
            }
            if (var13 == 255) {
                this.field2399[var72] = var4.method7965();
            }
            if (var14 == 1) {
                this.field2387[var72] = var5.method7965();
            }
            if (var15 == 1) {
                this.field2398[var72] = var6.method7964();
            }
            if (var16 == 1) {
                this.field2403[var72] = (short) (var7.method8032() - 1);
            }
            if (this.field2401 != null && this.field2403[var72] != -1) {
                this.field2401[var72] = (byte) (var8.method7964() - 1);
            }
        }
        var2.field4939 = var33;
        var3.field4939 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method7964();
            if (var78 == 1) {
                var73 = var2.method7978() + var76;
                var74 = var2.method7978() + var73;
                var75 = var2.method7978() + var74;
                var76 = var75;
                this.field2395[var77] = var73;
                this.field2396[var77] = var74;
                this.field2397[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method7978() + var76;
                var76 = var75;
                this.field2395[var77] = var73;
                this.field2396[var77] = var74;
                this.field2397[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method7978() + var76;
                var76 = var75;
                this.field2395[var77] = var73;
                this.field2396[var77] = var74;
                this.field2397[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method7978() + var76;
                var76 = var75;
                this.field2395[var77] = var73;
                this.field2396[var77] = var81;
                this.field2397[var77] = var75;
            }
        }
        var2.field4939 = var50;
        var3.field4939 = var52;
        var4.field4939 = var54;
        var5.field4939 = var56;
        var6.field4939 = var58;
        var7.field4939 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2406[var82] & 0xFF;
            if (var83 == 0) {
                this.field2407[var82] = (short) var2.method8032();
                this.field2405[var82] = (short) var2.method8032();
                this.field2411[var82] = (short) var2.method8032();
            }
        }
        var2.field4939 = var62;
        int var84 = var2.method7964();
        if (var84 == 0) {
            return;
        }
        new class232();
        var2.method8032();
        var2.method8032();
        var2.method8032();
        var2.method7979();
    }

    @ObfuscatedName("he.c([B)V")
    public void method3892(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class474 var4 = new class474(arg0);
        class474 var5 = new class474(arg0);
        class474 var6 = new class474(arg0);
        class474 var7 = new class474(arg0);
        class474 var8 = new class474(arg0);
        var4.field4939 = arg0.length - 18;
        int var9 = var4.method8032();
        int var10 = var4.method8032();
        int var11 = var4.method7964();
        int var12 = var4.method7964();
        int var13 = var4.method7964();
        int var14 = var4.method7964();
        int var15 = var4.method7964();
        int var16 = var4.method7964();
        int var17 = var4.method8032();
        int var18 = var4.method8032();
        int var19 = var4.method8032();
        int var20 = var4.method8032();
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
        this.field2390 = var9;
        this.field2417 = var10;
        this.field2388 = var11;
        this.field2391 = new int[var9];
        this.field2409 = new int[var9];
        this.field2393 = new int[var9];
        this.field2395 = new int[var10];
        this.field2396 = new int[var10];
        this.field2397 = new int[var10];
        if (var11 > 0) {
            this.field2406 = new byte[var11];
            this.field2407 = new short[var11];
            this.field2405 = new short[var11];
            this.field2411 = new short[var11];
        }
        if (var16 == 1) {
            this.field2410 = new int[var9];
        }
        if (var12 == 1) {
            this.field2419 = new byte[var10];
            this.field2401 = new byte[var10];
            this.field2403 = new short[var10];
        }
        if (var13 == 255) {
            this.field2399 = new byte[var10];
        } else {
            this.field2431 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2387 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2398 = new int[var10];
        }
        this.field2418 = new short[var10];
        var4.field4939 = var21;
        var5.field4939 = var36;
        var6.field4939 = var38;
        var7.field4939 = var40;
        var8.field4939 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method7964();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method7978();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method7978();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method7978();
            }
            this.field2391[var46] = var43 + var48;
            this.field2409[var46] = var44 + var49;
            this.field2393[var46] = var45 + var50;
            var43 = this.field2391[var46];
            var44 = this.field2409[var46];
            var45 = this.field2393[var46];
            if (var16 == 1) {
                this.field2410[var46] = var8.method7964();
            }
        }
        var4.field4939 = var32;
        var5.field4939 = var28;
        var6.field4939 = var26;
        var7.field4939 = var30;
        var8.field4939 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2418[var51] = (short) var4.method8032();
            if (var12 == 1) {
                int var52 = var5.method7964();
                if ((var52 & 0x1) == 1) {
                    this.field2419[var51] = 1;
                    var2 = true;
                } else {
                    this.field2419[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2401[var51] = (byte) (var52 >> 2);
                    this.field2403[var51] = this.field2418[var51];
                    this.field2418[var51] = 127;
                    if (this.field2403[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2401[var51] = -1;
                    this.field2403[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2399[var51] = var6.method7965();
            }
            if (var14 == 1) {
                this.field2387[var51] = var7.method7965();
            }
            if (var15 == 1) {
                this.field2398[var51] = var8.method7964();
            }
        }
        var4.field4939 = var25;
        var5.field4939 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method7964();
            if (var58 == 1) {
                var53 = var4.method7978() + var56;
                var54 = var4.method7978() + var53;
                var55 = var4.method7978() + var54;
                var56 = var55;
                this.field2395[var57] = var53;
                this.field2396[var57] = var54;
                this.field2397[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method7978() + var56;
                var56 = var55;
                this.field2395[var57] = var53;
                this.field2396[var57] = var54;
                this.field2397[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method7978() + var56;
                var56 = var55;
                this.field2395[var57] = var53;
                this.field2396[var57] = var54;
                this.field2397[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method7978() + var56;
                var56 = var55;
                this.field2395[var57] = var53;
                this.field2396[var57] = var61;
                this.field2397[var57] = var55;
            }
        }
        var4.field4939 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2406[var62] = 0;
            this.field2407[var62] = (short) var4.method8032();
            this.field2405[var62] = (short) var4.method8032();
            this.field2411[var62] = (short) var4.method8032();
        }
        if (this.field2401 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2401[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2407[var65] & 0xFFFF) == this.field2395[var64] && (this.field2405[var65] & 0xFFFF) == this.field2396[var64] && (this.field2411[var65] & 0xFFFF) == this.field2397[var64]) {
                        this.field2401[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2401 = null;
            }
        }
        if (!var3) {
            this.field2403 = null;
        }
        if (!var2) {
            this.field2419 = null;
        }
    }

    public class212(class212[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2390 = 0;
        this.field2417 = 0;
        this.field2388 = 0;
        this.field2431 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class212 var11 = arg0[var10];
            if (var11 != null) {
                this.field2390 += var11.field2390;
                this.field2417 += var11.field2417;
                this.field2388 += var11.field2388;
                if (var11.field2399 == null) {
                    if (this.field2431 == -1) {
                        this.field2431 = var11.field2431;
                    }
                    if (this.field2431 != var11.field2431) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2419 != null;
                var5 |= var11.field2387 != null;
                var6 |= var11.field2398 != null;
                var7 |= var11.field2403 != null;
                var8 |= var11.field2401 != null;
                var9 |= var11.field2414 != null;
            }
        }
        this.field2391 = new int[this.field2390];
        this.field2409 = new int[this.field2390];
        this.field2393 = new int[this.field2390];
        this.field2410 = new int[this.field2390];
        this.field2395 = new int[this.field2417];
        this.field2396 = new int[this.field2417];
        this.field2397 = new int[this.field2417];
        if (var3) {
            this.field2419 = new byte[this.field2417];
        }
        if (var4) {
            this.field2399 = new byte[this.field2417];
        }
        if (var5) {
            this.field2387 = new byte[this.field2417];
        }
        if (var6) {
            this.field2398 = new int[this.field2417];
        }
        if (var7) {
            this.field2403 = new short[this.field2417];
        }
        if (var8) {
            this.field2401 = new byte[this.field2417];
        }
        if (var9) {
            this.field2414 = new int[this.field2390][];
            this.field2415 = new int[this.field2390][];
        }
        this.field2418 = new short[this.field2417];
        if (this.field2388 > 0) {
            this.field2406 = new byte[this.field2388];
            this.field2407 = new short[this.field2388];
            this.field2405 = new short[this.field2388];
            this.field2411 = new short[this.field2388];
        }
        this.field2390 = 0;
        this.field2417 = 0;
        this.field2388 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class212 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2417; var14++) {
                    if (var3 && var13.field2419 != null) {
                        this.field2419[this.field2417] = var13.field2419[var14];
                    }
                    if (var4) {
                        if (var13.field2399 == null) {
                            this.field2399[this.field2417] = var13.field2431;
                        } else {
                            this.field2399[this.field2417] = var13.field2399[var14];
                        }
                    }
                    if (var5 && var13.field2387 != null) {
                        this.field2387[this.field2417] = var13.field2387[var14];
                    }
                    if (var6 && var13.field2398 != null) {
                        this.field2398[this.field2417] = var13.field2398[var14];
                    }
                    if (var7) {
                        if (var13.field2403 == null) {
                            this.field2403[this.field2417] = -1;
                        } else {
                            this.field2403[this.field2417] = var13.field2403[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2401 == null || var13.field2401[var14] == -1) {
                            this.field2401[this.field2417] = -1;
                        } else {
                            this.field2401[this.field2417] = (byte) (var13.field2401[var14] + this.field2388);
                        }
                    }
                    this.field2418[this.field2417] = var13.field2418[var14];
                    this.field2395[this.field2417] = this.method3914(var13, var13.field2395[var14]);
                    this.field2396[this.field2417] = this.method3914(var13, var13.field2396[var14]);
                    this.field2397[this.field2417] = this.method3914(var13, var13.field2397[var14]);
                    this.field2417++;
                }
                for (int var15 = 0; var15 < var13.field2388; var15++) {
                    byte var16 = this.field2406[this.field2388] = var13.field2406[var15];
                    if (var16 == 0) {
                        this.field2407[this.field2388] = (short) this.method3914(var13, var13.field2407[var15]);
                        this.field2405[this.field2388] = (short) this.method3914(var13, var13.field2405[var15]);
                        this.field2411[this.field2388] = (short) this.method3914(var13, var13.field2411[var15]);
                    }
                    this.field2388++;
                }
            }
        }
    }

    @ObfuscatedName("he.r(Lhe;I)I")
    public final int method3914(class212 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2391[arg1];
        int var5 = arg0.field2409[arg1];
        int var6 = arg0.field2393[arg1];
        for (int var7 = 0; var7 < this.field2390; var7++) {
            if (this.field2391[var7] == var4 && this.field2409[var7] == var5 && this.field2393[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2391[this.field2390] = var4;
            this.field2409[this.field2390] = var5;
            this.field2393[this.field2390] = var6;
            if (arg0.field2410 != null) {
                this.field2410[this.field2390] = arg0.field2410[arg1];
            }
            if (arg0.field2414 != null) {
                this.field2414[this.field2390] = arg0.field2414[arg1];
                this.field2415[this.field2390] = arg0.field2415[arg1];
            }
            var3 = this.field2390++;
        }
        return var3;
    }

    public class212(class212 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2390 = arg0.field2390;
        this.field2417 = arg0.field2417;
        this.field2388 = arg0.field2388;
        if (arg1) {
            this.field2391 = arg0.field2391;
            this.field2409 = arg0.field2409;
            this.field2393 = arg0.field2393;
        } else {
            this.field2391 = new int[this.field2390];
            this.field2409 = new int[this.field2390];
            this.field2393 = new int[this.field2390];
            for (int var6 = 0; var6 < this.field2390; var6++) {
                this.field2391[var6] = arg0.field2391[var6];
                this.field2409[var6] = arg0.field2409[var6];
                this.field2393[var6] = arg0.field2393[var6];
            }
        }
        if (arg2) {
            this.field2418 = arg0.field2418;
        } else {
            this.field2418 = new short[this.field2417];
            for (int var7 = 0; var7 < this.field2417; var7++) {
                this.field2418[var7] = arg0.field2418[var7];
            }
        }
        if (arg3 || arg0.field2403 == null) {
            this.field2403 = arg0.field2403;
        } else {
            this.field2403 = new short[this.field2417];
            for (int var8 = 0; var8 < this.field2417; var8++) {
                this.field2403[var8] = arg0.field2403[var8];
            }
        }
        if (arg4) {
            this.field2387 = arg0.field2387;
        } else {
            this.field2387 = new byte[this.field2417];
            if (arg0.field2387 == null) {
                for (int var9 = 0; var9 < this.field2417; var9++) {
                    this.field2387[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2417; var10++) {
                    this.field2387[var10] = arg0.field2387[var10];
                }
            }
        }
        this.field2395 = arg0.field2395;
        this.field2396 = arg0.field2396;
        this.field2397 = arg0.field2397;
        this.field2419 = arg0.field2419;
        this.field2399 = arg0.field2399;
        this.field2401 = arg0.field2401;
        this.field2431 = arg0.field2431;
        this.field2406 = arg0.field2406;
        this.field2407 = arg0.field2407;
        this.field2405 = arg0.field2405;
        this.field2411 = arg0.field2411;
        this.field2410 = arg0.field2410;
        this.field2398 = arg0.field2398;
        this.field2412 = arg0.field2412;
        this.field2413 = arg0.field2413;
        this.field2422 = arg0.field2422;
        this.field2416 = arg0.field2416;
        this.field2404 = arg0.field2404;
        this.field2414 = arg0.field2414;
        this.field2415 = arg0.field2415;
        this.field2394 = arg0.field2394;
        this.field2408 = arg0.field2408;
    }

    @ObfuscatedName("he.b()Lhe;")
    public class212 method3941() {
        class212 var1 = new class212();
        if (this.field2419 != null) {
            var1.field2419 = new byte[this.field2417];
            for (int var2 = 0; var2 < this.field2417; var2++) {
                var1.field2419[var2] = this.field2419[var2];
            }
        }
        var1.field2390 = this.field2390;
        var1.field2417 = this.field2417;
        var1.field2388 = this.field2388;
        var1.field2391 = this.field2391;
        var1.field2409 = this.field2409;
        var1.field2393 = this.field2393;
        var1.field2395 = this.field2395;
        var1.field2396 = this.field2396;
        var1.field2397 = this.field2397;
        var1.field2399 = this.field2399;
        var1.field2387 = this.field2387;
        var1.field2401 = this.field2401;
        var1.field2418 = this.field2418;
        var1.field2403 = this.field2403;
        var1.field2431 = this.field2431;
        var1.field2406 = this.field2406;
        var1.field2407 = this.field2407;
        var1.field2405 = this.field2405;
        var1.field2411 = this.field2411;
        var1.field2410 = this.field2410;
        var1.field2398 = this.field2398;
        var1.field2412 = this.field2412;
        var1.field2413 = this.field2413;
        var1.field2422 = this.field2422;
        var1.field2416 = this.field2416;
        var1.field2394 = this.field2394;
        var1.field2408 = this.field2408;
        return var1;
    }

    @ObfuscatedName("he.m([[IIIIZI)Lhe;")
    public class212 method3895(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3908();
        int var7 = this.field2423 + arg1;
        int var8 = this.field2424 + arg1;
        int var9 = this.field2426 + arg3;
        int var10 = this.field2425 + arg3;
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
        class212 var15;
        if (arg4) {
            var15 = new class212();
            var15.field2390 = this.field2390;
            var15.field2417 = this.field2417;
            var15.field2388 = this.field2388;
            var15.field2391 = this.field2391;
            var15.field2393 = this.field2393;
            var15.field2395 = this.field2395;
            var15.field2396 = this.field2396;
            var15.field2397 = this.field2397;
            var15.field2419 = this.field2419;
            var15.field2399 = this.field2399;
            var15.field2387 = this.field2387;
            var15.field2401 = this.field2401;
            var15.field2418 = this.field2418;
            var15.field2403 = this.field2403;
            var15.field2431 = this.field2431;
            var15.field2406 = this.field2406;
            var15.field2407 = this.field2407;
            var15.field2405 = this.field2405;
            var15.field2411 = this.field2411;
            var15.field2410 = this.field2410;
            var15.field2398 = this.field2398;
            var15.field2412 = this.field2412;
            var15.field2413 = this.field2413;
            var15.field2394 = this.field2394;
            var15.field2408 = this.field2408;
            var15.field2409 = new int[var15.field2390];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2390; var16++) {
                int var17 = this.field2391[var16] + arg1;
                int var18 = this.field2393[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2409[var16] = this.field2409[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2390; var26++) {
                int var27 = (-this.field2409[var26] << 16) / this.field2609;
                if (var27 < arg5) {
                    int var28 = this.field2391[var26] + arg1;
                    int var29 = this.field2393[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2409[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2409[var26];
                }
            }
        }
        var15.method3907();
        return var15;
    }

    @ObfuscatedName("he.t()V")
    public void method3896() {
        int var10002;
        if (this.field2410 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2390; var3++) {
                int var4 = this.field2410[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2412 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2412[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2390) {
                int var7 = this.field2410[var6];
                this.field2412[var7][var1[var7]++] = var6++;
            }
            this.field2410 = null;
        }
        if (this.field2398 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2417; var10++) {
            int var11 = this.field2398[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2413 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2413[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2417) {
            int var14 = this.field2398[var13];
            this.field2413[var14][var8[var14]++] = var13++;
        }
        this.field2398 = null;
    }

    @ObfuscatedName("he.h()V")
    public void method3937() {
        for (int var1 = 0; var1 < this.field2390; var1++) {
            int var2 = this.field2391[var1];
            this.field2391[var1] = this.field2393[var1];
            this.field2393[var1] = -var2;
        }
        this.method3907();
    }

    @ObfuscatedName("he.p()V")
    public void method3898() {
        for (int var1 = 0; var1 < this.field2390; var1++) {
            this.field2391[var1] = -this.field2391[var1];
            this.field2393[var1] = -this.field2393[var1];
        }
        this.method3907();
    }

    @ObfuscatedName("he.o()V")
    public void method3899() {
        for (int var1 = 0; var1 < this.field2390; var1++) {
            int var2 = this.field2393[var1];
            this.field2393[var1] = this.field2391[var1];
            this.field2391[var1] = -var2;
        }
        this.method3907();
    }

    @ObfuscatedName("he.u(I)V")
    public void method3900(int arg0) {
        int var2 = field2427[arg0];
        int var3 = field2392[arg0];
        for (int var4 = 0; var4 < this.field2390; var4++) {
            int var5 = this.field2393[var4] * var2 + this.field2391[var4] * var3 >> 16;
            this.field2393[var4] = this.field2393[var4] * var3 - this.field2391[var4] * var2 >> 16;
            this.field2391[var4] = var5;
        }
        this.method3907();
    }

    @ObfuscatedName("he.x(III)V")
    public void method3901(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2390; var4++) {
            this.field2391[var4] += arg0;
            this.field2409[var4] += arg1;
            this.field2393[var4] += arg2;
        }
        this.method3907();
    }

    @ObfuscatedName("he.a(SS)V")
    public void method3902(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2417; var3++) {
            if (this.field2418[var3] == arg0) {
                this.field2418[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("he.q(SS)V")
    public void method3943(short arg0, short arg1) {
        if (this.field2403 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2417; var3++) {
            if (this.field2403[var3] == arg0) {
                this.field2403[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("he.d()V")
    public void method3962() {
        for (int var1 = 0; var1 < this.field2390; var1++) {
            this.field2393[var1] = -this.field2393[var1];
        }
        for (int var2 = 0; var2 < this.field2417; var2++) {
            int var3 = this.field2395[var2];
            this.field2395[var2] = this.field2397[var2];
            this.field2397[var2] = var3;
        }
        this.method3907();
    }

    @ObfuscatedName("he.e(III)V")
    public void method3905(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2390; var4++) {
            this.field2391[var4] = this.field2391[var4] * arg0 / 128;
            this.field2409[var4] = this.field2409[var4] * arg1 / 128;
            this.field2393[var4] = this.field2393[var4] * arg2 / 128;
        }
        this.method3907();
    }

    @ObfuscatedName("he.g()V")
    public void method3965() {
        if (this.field2422 != null) {
            return;
        }
        this.field2422 = new class230[this.field2390];
        for (int var1 = 0; var1 < this.field2390; var1++) {
            this.field2422[var1] = new class230();
        }
        for (int var2 = 0; var2 < this.field2417; var2++) {
            int var3 = this.field2395[var2];
            int var4 = this.field2396[var2];
            int var5 = this.field2397[var2];
            int var6 = this.field2391[var4] - this.field2391[var3];
            int var7 = this.field2409[var4] - this.field2409[var3];
            int var8 = this.field2393[var4] - this.field2393[var3];
            int var9 = this.field2391[var5] - this.field2391[var3];
            int var10 = this.field2409[var5] - this.field2409[var3];
            int var11 = this.field2393[var5] - this.field2393[var3];
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
            if (this.field2419 == null) {
                var19 = 0;
            } else {
                var19 = this.field2419[var2];
            }
            if (var19 == 0) {
                class230 var20 = this.field2422[var3];
                var20.field2757 += var16;
                var20.field2754 += var17;
                var20.field2755 += var18;
                var20.field2756++;
                class230 var21 = this.field2422[var4];
                var21.field2757 += var16;
                var21.field2754 += var17;
                var21.field2755 += var18;
                var21.field2756++;
                class230 var22 = this.field2422[var5];
                var22.field2757 += var16;
                var22.field2754 += var17;
                var22.field2755 += var18;
                var22.field2756++;
            } else if (var19 == 1) {
                if (this.field2416 == null) {
                    this.field2416 = new class223[this.field2417];
                }
                class223 var23 = this.field2416[var2] = new class223();
                var23.field2616 = var16;
                var23.field2612 = var17;
                var23.field2613 = var18;
            }
        }
    }

    @ObfuscatedName("he.y()V")
    public void method3907() {
        this.field2422 = null;
        this.field2404 = null;
        this.field2416 = null;
        this.field2421 = false;
    }

    @ObfuscatedName("he.af()V")
    public void method3908() {
        if (this.field2421) {
            return;
        }
        this.field2609 = 0;
        this.field2402 = 0;
        this.field2423 = 999999;
        this.field2424 = -999999;
        this.field2425 = -99999;
        this.field2426 = 99999;
        for (int var1 = 0; var1 < this.field2390; var1++) {
            int var2 = this.field2391[var1];
            int var3 = this.field2409[var1];
            int var4 = this.field2393[var1];
            if (var2 < this.field2423) {
                this.field2423 = var2;
            }
            if (var2 > this.field2424) {
                this.field2424 = var2;
            }
            if (var4 < this.field2426) {
                this.field2426 = var4;
            }
            if (var4 > this.field2425) {
                this.field2425 = var4;
            }
            if (-var3 > this.field2609) {
                this.field2609 = -var3;
            }
            if (var3 > this.field2402) {
                this.field2402 = var3;
            }
        }
        this.field2421 = true;
    }

    @ObfuscatedName("he.aa(Lhe;Lhe;IIIZ)V")
    public static void method3909(class212 arg0, class212 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3908();
        arg0.method3965();
        arg1.method3908();
        arg1.method3965();
        field2429++;
        int var6 = 0;
        int[] var7 = arg1.field2391;
        int var8 = arg1.field2390;
        for (int var9 = 0; var9 < arg0.field2390; var9++) {
            class230 var10 = arg0.field2422[var9];
            if (var10.field2756 != 0) {
                int var11 = arg0.field2409[var9] - arg3;
                if (var11 <= arg1.field2402) {
                    int var12 = arg0.field2391[var9] - arg2;
                    if (var12 >= arg1.field2423 && var12 <= arg1.field2424) {
                        int var13 = arg0.field2393[var9] - arg4;
                        if (var13 >= arg1.field2426 && var13 <= arg1.field2425) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class230 var15 = arg1.field2422[var14];
                                if (var7[var14] == var12 && arg1.field2393[var14] == var13 && arg1.field2409[var14] == var11 && var15.field2756 != 0) {
                                    if (arg0.field2404 == null) {
                                        arg0.field2404 = new class230[arg0.field2390];
                                    }
                                    if (arg1.field2404 == null) {
                                        arg1.field2404 = new class230[var8];
                                    }
                                    class230 var16 = arg0.field2404[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2404[var9] = new class230(var10);
                                    }
                                    class230 var17 = arg1.field2404[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2404[var14] = new class230(var15);
                                    }
                                    var16.field2757 += var15.field2757;
                                    var16.field2754 += var15.field2754;
                                    var16.field2755 += var15.field2755;
                                    var16.field2756 += var15.field2756;
                                    var17.field2757 += var10.field2757;
                                    var17.field2754 += var10.field2754;
                                    var17.field2755 += var10.field2755;
                                    var17.field2756 += var10.field2756;
                                    var6++;
                                    field2400[var9] = field2429;
                                    field2428[var14] = field2429;
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
        for (int var18 = 0; var18 < arg0.field2417; var18++) {
            if (field2400[arg0.field2395[var18]] == field2429 && field2400[arg0.field2396[var18]] == field2429 && field2400[arg0.field2397[var18]] == field2429) {
                if (arg0.field2419 == null) {
                    arg0.field2419 = new byte[arg0.field2417];
                }
                arg0.field2419[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2417; var19++) {
            if (field2428[arg1.field2395[var19]] == field2429 && field2428[arg1.field2396[var19]] == field2429 && field2428[arg1.field2397[var19]] == field2429) {
                if (arg1.field2419 == null) {
                    arg1.field2419 = new byte[arg1.field2417];
                }
                arg1.field2419[var19] = 2;
            }
        }
    }

    @ObfuscatedName("he.ai(IIIII)Lhs;")
    public final class228 method3888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3965();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class228 var8 = new class228();
        var8.field2685 = new int[this.field2417];
        var8.field2686 = new int[this.field2417];
        var8.field2715 = new int[this.field2417];
        if (this.field2388 > 0 && this.field2401 != null) {
            int[] var9 = new int[this.field2388];
            for (int var10 = 0; var10 < this.field2417; var10++) {
                if (this.field2401[var10] != -1) {
                    var9[this.field2401[var10] & 0xFF]++;
                }
            }
            var8.field2693 = 0;
            for (int var11 = 0; var11 < this.field2388; var11++) {
                if (var9[var11] > 0 && this.field2406[var11] == 0) {
                    var8.field2693++;
                }
            }
            var8.field2694 = new int[var8.field2693];
            var8.field2695 = new int[var8.field2693];
            var8.field2718 = new int[var8.field2693];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2388; var13++) {
                if (var9[var13] > 0 && this.field2406[var13] == 0) {
                    var8.field2694[var12] = this.field2407[var13] & 0xFFFF;
                    var8.field2695[var12] = this.field2405[var13] & 0xFFFF;
                    var8.field2718[var12] = this.field2411[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2690 = new byte[this.field2417];
            for (int var14 = 0; var14 < this.field2417; var14++) {
                if (this.field2401[var14] == -1) {
                    var8.field2690[var14] = -1;
                } else {
                    var8.field2690[var14] = (byte) var9[this.field2401[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2417; var15++) {
            byte var16;
            if (this.field2419 == null) {
                var16 = 0;
            } else {
                var16 = this.field2419[var15];
            }
            byte var17;
            if (this.field2387 == null) {
                var17 = 0;
            } else {
                var17 = this.field2387[var15];
            }
            short var18;
            if (this.field2403 == null) {
                var18 = -1;
            } else {
                var18 = this.field2403[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2418[var15] & 0xFFFF;
                    class230 var20;
                    if (this.field2404 == null || this.field2404[this.field2395[var15]] == null) {
                        var20 = this.field2422[this.field2395[var15]];
                    } else {
                        var20 = this.field2404[this.field2395[var15]];
                    }
                    int var21 = (var20.field2755 * arg4 + var20.field2757 * arg2 + var20.field2754 * arg3) / (var20.field2756 * var7) + arg0;
                    var8.field2685[var15] = method3911(var19, var21);
                    class230 var22;
                    if (this.field2404 == null || this.field2404[this.field2396[var15]] == null) {
                        var22 = this.field2422[this.field2396[var15]];
                    } else {
                        var22 = this.field2404[this.field2396[var15]];
                    }
                    int var23 = (var22.field2755 * arg4 + var22.field2757 * arg2 + var22.field2754 * arg3) / (var22.field2756 * var7) + arg0;
                    var8.field2686[var15] = method3911(var19, var23);
                    class230 var24;
                    if (this.field2404 == null || this.field2404[this.field2397[var15]] == null) {
                        var24 = this.field2422[this.field2397[var15]];
                    } else {
                        var24 = this.field2404[this.field2397[var15]];
                    }
                    int var25 = (var24.field2755 * arg4 + var24.field2757 * arg2 + var24.field2754 * arg3) / (var24.field2756 * var7) + arg0;
                    var8.field2715[var15] = method3911(var19, var25);
                } else if (var16 == 1) {
                    class223 var26 = this.field2416[var15];
                    int var27 = (var26.field2613 * arg4 + var26.field2616 * arg2 + var26.field2612 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2685[var15] = method3911(this.field2418[var15] & 0xFFFF, var27);
                    var8.field2715[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2685[var15] = 128;
                    var8.field2715[var15] = -1;
                } else {
                    var8.field2715[var15] = -2;
                }
            } else if (var16 == 0) {
                class230 var28;
                if (this.field2404 == null || this.field2404[this.field2395[var15]] == null) {
                    var28 = this.field2422[this.field2395[var15]];
                } else {
                    var28 = this.field2404[this.field2395[var15]];
                }
                int var29 = (var28.field2755 * arg4 + var28.field2757 * arg2 + var28.field2754 * arg3) / (var28.field2756 * var7) + arg0;
                var8.field2685[var15] = method3922(var29);
                class230 var30;
                if (this.field2404 == null || this.field2404[this.field2396[var15]] == null) {
                    var30 = this.field2422[this.field2396[var15]];
                } else {
                    var30 = this.field2404[this.field2396[var15]];
                }
                int var31 = (var30.field2755 * arg4 + var30.field2757 * arg2 + var30.field2754 * arg3) / (var30.field2756 * var7) + arg0;
                var8.field2686[var15] = method3922(var31);
                class230 var32;
                if (this.field2404 == null || this.field2404[this.field2397[var15]] == null) {
                    var32 = this.field2422[this.field2397[var15]];
                } else {
                    var32 = this.field2404[this.field2397[var15]];
                }
                int var33 = (var32.field2755 * arg4 + var32.field2757 * arg2 + var32.field2754 * arg3) / (var32.field2756 * var7) + arg0;
                var8.field2715[var15] = method3922(var33);
            } else if (var16 == 1) {
                class223 var34 = this.field2416[var15];
                int var35 = (var34.field2613 * arg4 + var34.field2616 * arg2 + var34.field2612 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2685[var15] = method3922(var35);
                var8.field2715[var15] = -1;
            } else {
                var8.field2715[var15] = -2;
            }
        }
        this.method3896();
        var8.field2677 = this.field2390;
        var8.field2736 = this.field2391;
        var8.field2679 = this.field2409;
        var8.field2680 = this.field2393;
        var8.field2681 = this.field2417;
        var8.field2682 = this.field2395;
        var8.field2683 = this.field2396;
        var8.field2684 = this.field2397;
        var8.field2688 = this.field2399;
        var8.field2689 = this.field2387;
        var8.field2720 = this.field2431;
        var8.field2697 = this.field2412;
        var8.field2698 = this.field2413;
        var8.field2691 = this.field2403;
        var8.field2717 = this.field2414;
        var8.field2700 = this.field2415;
        return var8;
    }

    @ObfuscatedName("he.ag(II)I")
    public static final int method3911(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("he.aw(I)I")
    public static final int method3922(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
