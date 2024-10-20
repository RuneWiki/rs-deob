package deob;

@ObfuscatedName("iz")
public class class214 extends class225 {

    @ObfuscatedName("iz.ac")
    public int field2415 = 0;

    @ObfuscatedName("iz.au")
    public int[] field2416;

    @ObfuscatedName("iz.ab")
    public int[] field2417;

    @ObfuscatedName("iz.aq")
    public int[] field2418;

    @ObfuscatedName("iz.al")
    public int field2419 = 0;

    @ObfuscatedName("iz.at")
    public int[] field2420;

    @ObfuscatedName("iz.aa")
    public int[] field2456;

    @ObfuscatedName("iz.ay")
    public int[] field2422;

    @ObfuscatedName("iz.ao")
    public byte[] field2443;

    @ObfuscatedName("iz.ax")
    public byte[] field2424;

    @ObfuscatedName("iz.ai")
    public byte[] field2445;

    @ObfuscatedName("iz.ag")
    public byte[] field2426;

    @ObfuscatedName("iz.ah")
    public short[] field2427;

    @ObfuscatedName("iz.av")
    public short[] field2428;

    @ObfuscatedName("iz.ar")
    public byte field2429 = 0;

    @ObfuscatedName("iz.am")
    public int field2444;

    @ObfuscatedName("iz.as")
    public byte[] field2431;

    @ObfuscatedName("iz.aj")
    public short[] field2432;

    @ObfuscatedName("iz.ak")
    public short[] field2449;

    @ObfuscatedName("iz.az")
    public short[] field2437;

    @ObfuscatedName("iz.ad")
    public int[] field2423;

    @ObfuscatedName("iz.ae")
    public int[] field2436;

    @ObfuscatedName("iz.ap")
    public int[][] field2430;

    @ObfuscatedName("iz.by")
    public int[][] field2438;

    @ObfuscatedName("iz.bb")
    public int[][] field2413;

    @ObfuscatedName("iz.bi")
    public int[][] field2440;

    @ObfuscatedName("iz.be")
    public class226[] field2441;

    @ObfuscatedName("iz.bk")
    public class234[] field2455;

    @ObfuscatedName("iz.bx")
    public class234[] field2442;

    @ObfuscatedName("iz.bo")
    public short field2433;

    @ObfuscatedName("iz.bz")
    public short field2425;

    @ObfuscatedName("iz.bm")
    public boolean field2446 = false;

    @ObfuscatedName("iz.bd")
    public int field2447;

    @ObfuscatedName("iz.bt")
    public int field2448;

    @ObfuscatedName("iz.bj")
    public int field2439;

    @ObfuscatedName("iz.bn")
    public int field2450;

    @ObfuscatedName("iz.bs")
    public int field2434;

    @ObfuscatedName("iz.br")
    public static int[] field2452 = new int[10000];

    @ObfuscatedName("iz.bg")
    public static int[] field2453 = new int[10000];

    @ObfuscatedName("iz.bu")
    public static int field2454 = 0;

    @ObfuscatedName("iz.bf")
    public static int[] field2435 = class219.field2512;

    @ObfuscatedName("iz.bq")
    public static int[] field2412 = class219.field2516;

    public class214() {
    }

    @ObfuscatedName("iz.af(Lnm;II)Liz;")
    public static class214 method4017(class344 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6090(arg1, arg2);
        return var3 == null ? null : new class214(var3);
    }

    public class214(byte[] arg0) {
        class489 var2 = new class489(10);
        var2.method8232(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3958(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3997(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3960(arg0);
        } else {
            this.method3961(arg0);
        }
    }

    @ObfuscatedName("iz.aw([B)V")
    public void method3958(byte[] arg0) {
        class489 var2 = new class489(arg0);
        class489 var3 = new class489(arg0);
        class489 var4 = new class489(arg0);
        class489 var5 = new class489(arg0);
        class489 var6 = new class489(arg0);
        class489 var7 = new class489(arg0);
        class489 var8 = new class489(arg0);
        var2.field4989 = arg0.length - 26;
        int var9 = var2.method8250();
        int var10 = var2.method8250();
        int var11 = var2.method8248();
        int var12 = var2.method8248();
        int var13 = var2.method8248();
        int var14 = var2.method8248();
        int var15 = var2.method8248();
        int var16 = var2.method8248();
        int var17 = var2.method8248();
        int var18 = var2.method8248();
        int var19 = var2.method8250();
        int var20 = var2.method8250();
        int var21 = var2.method8250();
        int var22 = var2.method8250();
        int var23 = var2.method8250();
        int var24 = var2.method8250();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2431 = new byte[var11];
            var2.field4989 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2431[var28] = var2.method8249();
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
        this.field2415 = var9;
        this.field2419 = var10;
        this.field2444 = var11;
        this.field2416 = new int[var9];
        this.field2417 = new int[var9];
        this.field2418 = new int[var9];
        this.field2420 = new int[var10];
        this.field2456 = new int[var10];
        this.field2422 = new int[var10];
        if (var17 == 1) {
            this.field2423 = new int[var9];
        }
        if (var12 == 1) {
            this.field2443 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2424 = new byte[var10];
        } else {
            this.field2429 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2445 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2436 = new int[var10];
        }
        if (var16 == 1) {
            this.field2428 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2426 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2413 = new int[var9][];
            this.field2440 = new int[var9][];
        }
        this.field2427 = new short[var10];
        if (var11 > 0) {
            this.field2432 = new short[var11];
            this.field2449 = new short[var11];
            this.field2437 = new short[var11];
        }
        var2.field4989 = var11;
        var3.field4989 = var47;
        var4.field4989 = var49;
        var5.field4989 = var51;
        var6.field4989 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8248();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8263();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8263();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8263();
            }
            this.field2416[var70] = var67 + var72;
            this.field2417[var70] = var68 + var73;
            this.field2418[var70] = var69 + var74;
            var67 = this.field2416[var70];
            var68 = this.field2417[var70];
            var69 = this.field2418[var70];
            if (var17 == 1) {
                this.field2423[var70] = var6.method8248();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8248();
                this.field2413[var75] = new int[var76];
                this.field2440[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2413[var75][var77] = var6.method8248();
                    this.field2440[var75][var77] = var6.method8248();
                }
            }
        }
        var2.field4989 = var45;
        var3.field4989 = var33;
        var4.field4989 = var36;
        var5.field4989 = var40;
        var6.field4989 = var37;
        var7.field4989 = var43;
        var8.field4989 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2427[var78] = (short) var2.method8250();
            if (var12 == 1) {
                this.field2443[var78] = var3.method8249();
            }
            if (var13 == 255) {
                this.field2424[var78] = var4.method8249();
            }
            if (var14 == 1) {
                this.field2445[var78] = var5.method8249();
            }
            if (var15 == 1) {
                this.field2436[var78] = var6.method8248();
            }
            if (var16 == 1) {
                this.field2428[var78] = (short) (var7.method8250() - 1);
            }
            if (this.field2426 != null && this.field2428[var78] != -1) {
                this.field2426[var78] = (byte) (var8.method8248() - 1);
            }
        }
        var2.field4989 = var39;
        var3.field4989 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8248();
            if (var84 == 1) {
                var79 = var2.method8263() + var82;
                var80 = var2.method8263() + var79;
                var81 = var2.method8263() + var80;
                var82 = var81;
                this.field2420[var83] = var79;
                this.field2456[var83] = var80;
                this.field2422[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8263() + var82;
                var82 = var81;
                this.field2420[var83] = var79;
                this.field2456[var83] = var80;
                this.field2422[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8263() + var82;
                var82 = var81;
                this.field2420[var83] = var79;
                this.field2456[var83] = var80;
                this.field2422[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8263() + var82;
                var82 = var81;
                this.field2420[var83] = var79;
                this.field2456[var83] = var87;
                this.field2422[var83] = var81;
            }
        }
        var2.field4989 = var53;
        var3.field4989 = var55;
        var4.field4989 = var57;
        var5.field4989 = var59;
        var6.field4989 = var61;
        var7.field4989 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2431[var88] & 0xFF;
            if (var89 == 0) {
                this.field2432[var88] = (short) var2.method8250();
                this.field2449[var88] = (short) var2.method8250();
                this.field2437[var88] = (short) var2.method8250();
            }
        }
        var2.field4989 = var65;
        int var90 = var2.method8248();
        if (var90 == 0) {
            return;
        }
        new class239();
        var2.method8250();
        var2.method8250();
        var2.method8250();
        var2.method8254();
    }

    @ObfuscatedName("iz.ac([B)V")
    public void method3997(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class489 var4 = new class489(arg0);
        class489 var5 = new class489(arg0);
        class489 var6 = new class489(arg0);
        class489 var7 = new class489(arg0);
        class489 var8 = new class489(arg0);
        var4.field4989 = arg0.length - 23;
        int var9 = var4.method8250();
        int var10 = var4.method8250();
        int var11 = var4.method8248();
        int var12 = var4.method8248();
        int var13 = var4.method8248();
        int var14 = var4.method8248();
        int var15 = var4.method8248();
        int var16 = var4.method8248();
        int var17 = var4.method8248();
        int var18 = var4.method8250();
        int var19 = var4.method8250();
        int var20 = var4.method8250();
        int var21 = var4.method8250();
        int var22 = var4.method8250();
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
        this.field2415 = var9;
        this.field2419 = var10;
        this.field2444 = var11;
        this.field2416 = new int[var9];
        this.field2417 = new int[var9];
        this.field2418 = new int[var9];
        this.field2420 = new int[var10];
        this.field2456 = new int[var10];
        this.field2422 = new int[var10];
        if (var11 > 0) {
            this.field2431 = new byte[var11];
            this.field2432 = new short[var11];
            this.field2449 = new short[var11];
            this.field2437 = new short[var11];
        }
        if (var16 == 1) {
            this.field2423 = new int[var9];
        }
        if (var12 == 1) {
            this.field2443 = new byte[var10];
            this.field2426 = new byte[var10];
            this.field2428 = new short[var10];
        }
        if (var13 == 255) {
            this.field2424 = new byte[var10];
        } else {
            this.field2429 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2445 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2436 = new int[var10];
        }
        if (var17 == 1) {
            this.field2413 = new int[var9][];
            this.field2440 = new int[var9][];
        }
        this.field2427 = new short[var10];
        var4.field4989 = var23;
        var5.field4989 = var39;
        var6.field4989 = var41;
        var7.field4989 = var43;
        var8.field4989 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8248();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8263();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8263();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8263();
            }
            this.field2416[var49] = var46 + var51;
            this.field2417[var49] = var47 + var52;
            this.field2418[var49] = var48 + var53;
            var46 = this.field2416[var49];
            var47 = this.field2417[var49];
            var48 = this.field2418[var49];
            if (var16 == 1) {
                this.field2423[var49] = var8.method8248();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8248();
                this.field2413[var54] = new int[var55];
                this.field2440[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2413[var54][var56] = var8.method8248();
                    this.field2440[var54][var56] = var8.method8248();
                }
            }
        }
        var4.field4989 = var35;
        var5.field4989 = var30;
        var6.field4989 = var28;
        var7.field4989 = var33;
        var8.field4989 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2427[var57] = (short) var4.method8250();
            if (var12 == 1) {
                int var58 = var5.method8248();
                if ((var58 & 0x1) == 1) {
                    this.field2443[var57] = 1;
                    var2 = true;
                } else {
                    this.field2443[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2426[var57] = (byte) (var58 >> 2);
                    this.field2428[var57] = this.field2427[var57];
                    this.field2427[var57] = 127;
                    if (this.field2428[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2426[var57] = -1;
                    this.field2428[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2424[var57] = var6.method8249();
            }
            if (var14 == 1) {
                this.field2445[var57] = var7.method8249();
            }
            if (var15 == 1) {
                this.field2436[var57] = var8.method8248();
            }
        }
        var4.field4989 = var32;
        var5.field4989 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8248();
            if (var64 == 1) {
                var59 = var4.method8263() + var62;
                var60 = var4.method8263() + var59;
                var61 = var4.method8263() + var60;
                var62 = var61;
                this.field2420[var63] = var59;
                this.field2456[var63] = var60;
                this.field2422[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8263() + var62;
                var62 = var61;
                this.field2420[var63] = var59;
                this.field2456[var63] = var60;
                this.field2422[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8263() + var62;
                var62 = var61;
                this.field2420[var63] = var59;
                this.field2456[var63] = var60;
                this.field2422[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8263() + var62;
                var62 = var61;
                this.field2420[var63] = var59;
                this.field2456[var63] = var67;
                this.field2422[var63] = var61;
            }
        }
        var4.field4989 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2431[var68] = 0;
            this.field2432[var68] = (short) var4.method8250();
            this.field2449[var68] = (short) var4.method8250();
            this.field2437[var68] = (short) var4.method8250();
        }
        if (this.field2426 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2426[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2432[var71] & 0xFFFF) == this.field2420[var70] && (this.field2449[var71] & 0xFFFF) == this.field2456[var70] && (this.field2437[var71] & 0xFFFF) == this.field2422[var70]) {
                        this.field2426[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2426 = null;
            }
        }
        if (!var3) {
            this.field2428 = null;
        }
        if (!var2) {
            this.field2443 = null;
        }
    }

    @ObfuscatedName("iz.at([B)V")
    public void method3960(byte[] arg0) {
        class489 var2 = new class489(arg0);
        class489 var3 = new class489(arg0);
        class489 var4 = new class489(arg0);
        class489 var5 = new class489(arg0);
        class489 var6 = new class489(arg0);
        class489 var7 = new class489(arg0);
        class489 var8 = new class489(arg0);
        var2.field4989 = arg0.length - 23;
        int var9 = var2.method8250();
        int var10 = var2.method8250();
        int var11 = var2.method8248();
        int var12 = var2.method8248();
        int var13 = var2.method8248();
        int var14 = var2.method8248();
        int var15 = var2.method8248();
        int var16 = var2.method8248();
        int var17 = var2.method8248();
        int var18 = var2.method8250();
        int var19 = var2.method8250();
        int var20 = var2.method8250();
        int var21 = var2.method8250();
        int var22 = var2.method8250();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2431 = new byte[var11];
            var2.field4989 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2431[var26] = var2.method8249();
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
        this.field2415 = var9;
        this.field2419 = var10;
        this.field2444 = var11;
        this.field2416 = new int[var9];
        this.field2417 = new int[var9];
        this.field2418 = new int[var9];
        this.field2420 = new int[var10];
        this.field2456 = new int[var10];
        this.field2422 = new int[var10];
        if (var17 == 1) {
            this.field2423 = new int[var9];
        }
        if (var12 == 1) {
            this.field2443 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2424 = new byte[var10];
        } else {
            this.field2429 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2445 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2436 = new int[var10];
        }
        if (var16 == 1) {
            this.field2428 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2426 = new byte[var10];
        }
        this.field2427 = new short[var10];
        if (var11 > 0) {
            this.field2432 = new short[var11];
            this.field2449 = new short[var11];
            this.field2437 = new short[var11];
        }
        var2.field4989 = var11;
        var3.field4989 = var44;
        var4.field4989 = var46;
        var5.field4989 = var48;
        var6.field4989 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8248();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8263();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8263();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8263();
            }
            this.field2416[var67] = var64 + var69;
            this.field2417[var67] = var65 + var70;
            this.field2418[var67] = var66 + var71;
            var64 = this.field2416[var67];
            var65 = this.field2417[var67];
            var66 = this.field2418[var67];
            if (var17 == 1) {
                this.field2423[var67] = var6.method8248();
            }
        }
        var2.field4989 = var42;
        var3.field4989 = var31;
        var4.field4989 = var34;
        var5.field4989 = var37;
        var6.field4989 = var35;
        var7.field4989 = var40;
        var8.field4989 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2427[var72] = (short) var2.method8250();
            if (var12 == 1) {
                this.field2443[var72] = var3.method8249();
            }
            if (var13 == 255) {
                this.field2424[var72] = var4.method8249();
            }
            if (var14 == 1) {
                this.field2445[var72] = var5.method8249();
            }
            if (var15 == 1) {
                this.field2436[var72] = var6.method8248();
            }
            if (var16 == 1) {
                this.field2428[var72] = (short) (var7.method8250() - 1);
            }
            if (this.field2426 != null && this.field2428[var72] != -1) {
                this.field2426[var72] = (byte) (var8.method8248() - 1);
            }
        }
        var2.field4989 = var33;
        var3.field4989 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8248();
            if (var78 == 1) {
                var73 = var2.method8263() + var76;
                var74 = var2.method8263() + var73;
                var75 = var2.method8263() + var74;
                var76 = var75;
                this.field2420[var77] = var73;
                this.field2456[var77] = var74;
                this.field2422[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8263() + var76;
                var76 = var75;
                this.field2420[var77] = var73;
                this.field2456[var77] = var74;
                this.field2422[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8263() + var76;
                var76 = var75;
                this.field2420[var77] = var73;
                this.field2456[var77] = var74;
                this.field2422[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8263() + var76;
                var76 = var75;
                this.field2420[var77] = var73;
                this.field2456[var77] = var81;
                this.field2422[var77] = var75;
            }
        }
        var2.field4989 = var50;
        var3.field4989 = var52;
        var4.field4989 = var54;
        var5.field4989 = var56;
        var6.field4989 = var58;
        var7.field4989 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2431[var82] & 0xFF;
            if (var83 == 0) {
                this.field2432[var82] = (short) var2.method8250();
                this.field2449[var82] = (short) var2.method8250();
                this.field2437[var82] = (short) var2.method8250();
            }
        }
        var2.field4989 = var62;
        int var84 = var2.method8248();
        if (var84 == 0) {
            return;
        }
        new class239();
        var2.method8250();
        var2.method8250();
        var2.method8250();
        var2.method8254();
    }

    @ObfuscatedName("iz.aa([B)V")
    public void method3961(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class489 var4 = new class489(arg0);
        class489 var5 = new class489(arg0);
        class489 var6 = new class489(arg0);
        class489 var7 = new class489(arg0);
        class489 var8 = new class489(arg0);
        var4.field4989 = arg0.length - 18;
        int var9 = var4.method8250();
        int var10 = var4.method8250();
        int var11 = var4.method8248();
        int var12 = var4.method8248();
        int var13 = var4.method8248();
        int var14 = var4.method8248();
        int var15 = var4.method8248();
        int var16 = var4.method8248();
        int var17 = var4.method8250();
        int var18 = var4.method8250();
        int var19 = var4.method8250();
        int var20 = var4.method8250();
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
        this.field2415 = var9;
        this.field2419 = var10;
        this.field2444 = var11;
        this.field2416 = new int[var9];
        this.field2417 = new int[var9];
        this.field2418 = new int[var9];
        this.field2420 = new int[var10];
        this.field2456 = new int[var10];
        this.field2422 = new int[var10];
        if (var11 > 0) {
            this.field2431 = new byte[var11];
            this.field2432 = new short[var11];
            this.field2449 = new short[var11];
            this.field2437 = new short[var11];
        }
        if (var16 == 1) {
            this.field2423 = new int[var9];
        }
        if (var12 == 1) {
            this.field2443 = new byte[var10];
            this.field2426 = new byte[var10];
            this.field2428 = new short[var10];
        }
        if (var13 == 255) {
            this.field2424 = new byte[var10];
        } else {
            this.field2429 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2445 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2436 = new int[var10];
        }
        this.field2427 = new short[var10];
        var4.field4989 = var21;
        var5.field4989 = var36;
        var6.field4989 = var38;
        var7.field4989 = var40;
        var8.field4989 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8248();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8263();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8263();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8263();
            }
            this.field2416[var46] = var43 + var48;
            this.field2417[var46] = var44 + var49;
            this.field2418[var46] = var45 + var50;
            var43 = this.field2416[var46];
            var44 = this.field2417[var46];
            var45 = this.field2418[var46];
            if (var16 == 1) {
                this.field2423[var46] = var8.method8248();
            }
        }
        var4.field4989 = var32;
        var5.field4989 = var28;
        var6.field4989 = var26;
        var7.field4989 = var30;
        var8.field4989 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2427[var51] = (short) var4.method8250();
            if (var12 == 1) {
                int var52 = var5.method8248();
                if ((var52 & 0x1) == 1) {
                    this.field2443[var51] = 1;
                    var2 = true;
                } else {
                    this.field2443[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2426[var51] = (byte) (var52 >> 2);
                    this.field2428[var51] = this.field2427[var51];
                    this.field2427[var51] = 127;
                    if (this.field2428[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2426[var51] = -1;
                    this.field2428[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2424[var51] = var6.method8249();
            }
            if (var14 == 1) {
                this.field2445[var51] = var7.method8249();
            }
            if (var15 == 1) {
                this.field2436[var51] = var8.method8248();
            }
        }
        var4.field4989 = var25;
        var5.field4989 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8248();
            if (var58 == 1) {
                var53 = var4.method8263() + var56;
                var54 = var4.method8263() + var53;
                var55 = var4.method8263() + var54;
                var56 = var55;
                this.field2420[var57] = var53;
                this.field2456[var57] = var54;
                this.field2422[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8263() + var56;
                var56 = var55;
                this.field2420[var57] = var53;
                this.field2456[var57] = var54;
                this.field2422[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8263() + var56;
                var56 = var55;
                this.field2420[var57] = var53;
                this.field2456[var57] = var54;
                this.field2422[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8263() + var56;
                var56 = var55;
                this.field2420[var57] = var53;
                this.field2456[var57] = var61;
                this.field2422[var57] = var55;
            }
        }
        var4.field4989 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2431[var62] = 0;
            this.field2432[var62] = (short) var4.method8250();
            this.field2449[var62] = (short) var4.method8250();
            this.field2437[var62] = (short) var4.method8250();
        }
        if (this.field2426 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2426[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2432[var65] & 0xFFFF) == this.field2420[var64] && (this.field2449[var65] & 0xFFFF) == this.field2456[var64] && (this.field2437[var65] & 0xFFFF) == this.field2422[var64]) {
                        this.field2426[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2426 = null;
            }
        }
        if (!var3) {
            this.field2428 = null;
        }
        if (!var2) {
            this.field2443 = null;
        }
    }

    public class214(class214[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2415 = 0;
        this.field2419 = 0;
        this.field2444 = 0;
        this.field2429 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class214 var11 = arg0[var10];
            if (var11 != null) {
                this.field2415 += var11.field2415;
                this.field2419 += var11.field2419;
                this.field2444 += var11.field2444;
                if (var11.field2424 == null) {
                    if (this.field2429 == -1) {
                        this.field2429 = var11.field2429;
                    }
                    if (this.field2429 != var11.field2429) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2443 != null;
                var5 |= var11.field2445 != null;
                var6 |= var11.field2436 != null;
                var7 |= var11.field2428 != null;
                var8 |= var11.field2426 != null;
                var9 |= var11.field2413 != null;
            }
        }
        this.field2416 = new int[this.field2415];
        this.field2417 = new int[this.field2415];
        this.field2418 = new int[this.field2415];
        this.field2423 = new int[this.field2415];
        this.field2420 = new int[this.field2419];
        this.field2456 = new int[this.field2419];
        this.field2422 = new int[this.field2419];
        if (var3) {
            this.field2443 = new byte[this.field2419];
        }
        if (var4) {
            this.field2424 = new byte[this.field2419];
        }
        if (var5) {
            this.field2445 = new byte[this.field2419];
        }
        if (var6) {
            this.field2436 = new int[this.field2419];
        }
        if (var7) {
            this.field2428 = new short[this.field2419];
        }
        if (var8) {
            this.field2426 = new byte[this.field2419];
        }
        if (var9) {
            this.field2413 = new int[this.field2415][];
            this.field2440 = new int[this.field2415][];
        }
        this.field2427 = new short[this.field2419];
        if (this.field2444 > 0) {
            this.field2431 = new byte[this.field2444];
            this.field2432 = new short[this.field2444];
            this.field2449 = new short[this.field2444];
            this.field2437 = new short[this.field2444];
        }
        this.field2415 = 0;
        this.field2419 = 0;
        this.field2444 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class214 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2419; var14++) {
                    if (var3 && var13.field2443 != null) {
                        this.field2443[this.field2419] = var13.field2443[var14];
                    }
                    if (var4) {
                        if (var13.field2424 == null) {
                            this.field2424[this.field2419] = var13.field2429;
                        } else {
                            this.field2424[this.field2419] = var13.field2424[var14];
                        }
                    }
                    if (var5 && var13.field2445 != null) {
                        this.field2445[this.field2419] = var13.field2445[var14];
                    }
                    if (var6 && var13.field2436 != null) {
                        this.field2436[this.field2419] = var13.field2436[var14];
                    }
                    if (var7) {
                        if (var13.field2428 == null) {
                            this.field2428[this.field2419] = -1;
                        } else {
                            this.field2428[this.field2419] = var13.field2428[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2426 == null || var13.field2426[var14] == -1) {
                            this.field2426[this.field2419] = -1;
                        } else {
                            this.field2426[this.field2419] = (byte) (var13.field2426[var14] + this.field2444);
                        }
                    }
                    this.field2427[this.field2419] = var13.field2427[var14];
                    this.field2420[this.field2419] = this.method3991(var13, var13.field2420[var14]);
                    this.field2456[this.field2419] = this.method3991(var13, var13.field2456[var14]);
                    this.field2422[this.field2419] = this.method3991(var13, var13.field2422[var14]);
                    this.field2419++;
                }
                for (int var15 = 0; var15 < var13.field2444; var15++) {
                    byte var16 = this.field2431[this.field2444] = var13.field2431[var15];
                    if (var16 == 0) {
                        this.field2432[this.field2444] = (short) this.method3991(var13, var13.field2432[var15]);
                        this.field2449[this.field2444] = (short) this.method3991(var13, var13.field2449[var15]);
                        this.field2437[this.field2444] = (short) this.method3991(var13, var13.field2437[var15]);
                    }
                    this.field2444++;
                }
            }
        }
    }

    @ObfuscatedName("iz.ay(Liz;I)I")
    public final int method3991(class214 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2416[arg1];
        int var5 = arg0.field2417[arg1];
        int var6 = arg0.field2418[arg1];
        for (int var7 = 0; var7 < this.field2415; var7++) {
            if (this.field2416[var7] == var4 && this.field2417[var7] == var5 && this.field2418[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2416[this.field2415] = var4;
            this.field2417[this.field2415] = var5;
            this.field2418[this.field2415] = var6;
            if (arg0.field2423 != null) {
                this.field2423[this.field2415] = arg0.field2423[arg1];
            }
            if (arg0.field2413 != null) {
                this.field2413[this.field2415] = arg0.field2413[arg1];
                this.field2440[this.field2415] = arg0.field2440[arg1];
            }
            var3 = this.field2415++;
        }
        return var3;
    }

    public class214(class214 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2415 = arg0.field2415;
        this.field2419 = arg0.field2419;
        this.field2444 = arg0.field2444;
        if (arg1) {
            this.field2416 = arg0.field2416;
            this.field2417 = arg0.field2417;
            this.field2418 = arg0.field2418;
        } else {
            this.field2416 = new int[this.field2415];
            this.field2417 = new int[this.field2415];
            this.field2418 = new int[this.field2415];
            for (int var6 = 0; var6 < this.field2415; var6++) {
                this.field2416[var6] = arg0.field2416[var6];
                this.field2417[var6] = arg0.field2417[var6];
                this.field2418[var6] = arg0.field2418[var6];
            }
        }
        if (arg2) {
            this.field2427 = arg0.field2427;
        } else {
            this.field2427 = new short[this.field2419];
            for (int var7 = 0; var7 < this.field2419; var7++) {
                this.field2427[var7] = arg0.field2427[var7];
            }
        }
        if (arg3 || arg0.field2428 == null) {
            this.field2428 = arg0.field2428;
        } else {
            this.field2428 = new short[this.field2419];
            for (int var8 = 0; var8 < this.field2419; var8++) {
                this.field2428[var8] = arg0.field2428[var8];
            }
        }
        if (arg4) {
            this.field2445 = arg0.field2445;
        } else {
            this.field2445 = new byte[this.field2419];
            if (arg0.field2445 == null) {
                for (int var9 = 0; var9 < this.field2419; var9++) {
                    this.field2445[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2419; var10++) {
                    this.field2445[var10] = arg0.field2445[var10];
                }
            }
        }
        this.field2420 = arg0.field2420;
        this.field2456 = arg0.field2456;
        this.field2422 = arg0.field2422;
        this.field2443 = arg0.field2443;
        this.field2424 = arg0.field2424;
        this.field2426 = arg0.field2426;
        this.field2429 = arg0.field2429;
        this.field2431 = arg0.field2431;
        this.field2432 = arg0.field2432;
        this.field2449 = arg0.field2449;
        this.field2437 = arg0.field2437;
        this.field2423 = arg0.field2423;
        this.field2436 = arg0.field2436;
        this.field2430 = arg0.field2430;
        this.field2438 = arg0.field2438;
        this.field2455 = arg0.field2455;
        this.field2441 = arg0.field2441;
        this.field2442 = arg0.field2442;
        this.field2413 = arg0.field2413;
        this.field2440 = arg0.field2440;
        this.field2433 = arg0.field2433;
        this.field2425 = arg0.field2425;
    }

    @ObfuscatedName("iz.ao()Liz;")
    public class214 method3987() {
        class214 var1 = new class214();
        if (this.field2443 != null) {
            var1.field2443 = new byte[this.field2419];
            for (int var2 = 0; var2 < this.field2419; var2++) {
                var1.field2443[var2] = this.field2443[var2];
            }
        }
        var1.field2415 = this.field2415;
        var1.field2419 = this.field2419;
        var1.field2444 = this.field2444;
        var1.field2416 = this.field2416;
        var1.field2417 = this.field2417;
        var1.field2418 = this.field2418;
        var1.field2420 = this.field2420;
        var1.field2456 = this.field2456;
        var1.field2422 = this.field2422;
        var1.field2424 = this.field2424;
        var1.field2445 = this.field2445;
        var1.field2426 = this.field2426;
        var1.field2427 = this.field2427;
        var1.field2428 = this.field2428;
        var1.field2429 = this.field2429;
        var1.field2431 = this.field2431;
        var1.field2432 = this.field2432;
        var1.field2449 = this.field2449;
        var1.field2437 = this.field2437;
        var1.field2423 = this.field2423;
        var1.field2436 = this.field2436;
        var1.field2430 = this.field2430;
        var1.field2438 = this.field2438;
        var1.field2455 = this.field2455;
        var1.field2441 = this.field2441;
        var1.field2433 = this.field2433;
        var1.field2425 = this.field2425;
        return var1;
    }

    @ObfuscatedName("iz.ax([[IIIIZI)Liz;")
    public class214 method3964(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3977();
        int var7 = this.field2448 + arg1;
        int var8 = this.field2439 + arg1;
        int var9 = this.field2434 + arg3;
        int var10 = this.field2450 + arg3;
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
        class214 var15;
        if (arg4) {
            var15 = new class214();
            var15.field2415 = this.field2415;
            var15.field2419 = this.field2419;
            var15.field2444 = this.field2444;
            var15.field2416 = this.field2416;
            var15.field2418 = this.field2418;
            var15.field2420 = this.field2420;
            var15.field2456 = this.field2456;
            var15.field2422 = this.field2422;
            var15.field2443 = this.field2443;
            var15.field2424 = this.field2424;
            var15.field2445 = this.field2445;
            var15.field2426 = this.field2426;
            var15.field2427 = this.field2427;
            var15.field2428 = this.field2428;
            var15.field2429 = this.field2429;
            var15.field2431 = this.field2431;
            var15.field2432 = this.field2432;
            var15.field2449 = this.field2449;
            var15.field2437 = this.field2437;
            var15.field2423 = this.field2423;
            var15.field2436 = this.field2436;
            var15.field2430 = this.field2430;
            var15.field2438 = this.field2438;
            var15.field2433 = this.field2433;
            var15.field2425 = this.field2425;
            var15.field2417 = new int[var15.field2415];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2415; var16++) {
                int var17 = this.field2416[var16] + arg1;
                int var18 = this.field2418[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2417[var16] = this.field2417[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2415; var26++) {
                int var27 = (-this.field2417[var26] << 16) / this.field2619;
                if (var27 < arg5) {
                    int var28 = this.field2416[var26] + arg1;
                    int var29 = this.field2418[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2417[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2417[var26];
                }
            }
        }
        var15.method3976();
        return var15;
    }

    @ObfuscatedName("iz.ai()V")
    public void method3972() {
        int var10002;
        if (this.field2423 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2415; var3++) {
                int var4 = this.field2423[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2430 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2430[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2415) {
                int var7 = this.field2423[var6];
                this.field2430[var7][var1[var7]++] = var6++;
            }
            this.field2423 = null;
        }
        if (this.field2436 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2419; var10++) {
            int var11 = this.field2436[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2438 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2438[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2419) {
            int var14 = this.field2436[var13];
            this.field2438[var14][var8[var14]++] = var13++;
        }
        this.field2436 = null;
    }

    @ObfuscatedName("iz.ag()V")
    public void method3966() {
        for (int var1 = 0; var1 < this.field2415; var1++) {
            int var2 = this.field2416[var1];
            this.field2416[var1] = this.field2418[var1];
            this.field2418[var1] = -var2;
        }
        this.method3976();
    }

    @ObfuscatedName("iz.ah()V")
    public void method3969() {
        for (int var1 = 0; var1 < this.field2415; var1++) {
            this.field2416[var1] = -this.field2416[var1];
            this.field2418[var1] = -this.field2418[var1];
        }
        this.method3976();
    }

    @ObfuscatedName("iz.av()V")
    public void method3968() {
        for (int var1 = 0; var1 < this.field2415; var1++) {
            int var2 = this.field2418[var1];
            this.field2418[var1] = this.field2416[var1];
            this.field2416[var1] = -var2;
        }
        this.method3976();
    }

    @ObfuscatedName("iz.ar(I)V")
    public void method4035(int arg0) {
        int var2 = field2435[arg0];
        int var3 = field2412[arg0];
        for (int var4 = 0; var4 < this.field2415; var4++) {
            int var5 = this.field2418[var4] * var2 + this.field2416[var4] * var3 >> 16;
            this.field2418[var4] = this.field2418[var4] * var3 - this.field2416[var4] * var2 >> 16;
            this.field2416[var4] = var5;
        }
        this.method3976();
    }

    @ObfuscatedName("iz.am(III)V")
    public void method3970(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2415; var4++) {
            this.field2416[var4] += arg0;
            this.field2417[var4] += arg1;
            this.field2418[var4] += arg2;
        }
        this.method3976();
    }

    @ObfuscatedName("iz.as(SS)V")
    public void method3971(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2419; var3++) {
            if (this.field2427[var3] == arg0) {
                this.field2427[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("iz.aj(SS)V")
    public void method4022(short arg0, short arg1) {
        if (this.field2428 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2419; var3++) {
            if (this.field2428[var3] == arg0) {
                this.field2428[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("iz.ak()V")
    public void method3973() {
        for (int var1 = 0; var1 < this.field2415; var1++) {
            this.field2418[var1] = -this.field2418[var1];
        }
        for (int var2 = 0; var2 < this.field2419; var2++) {
            int var3 = this.field2420[var2];
            this.field2420[var2] = this.field2422[var2];
            this.field2422[var2] = var3;
        }
        this.method3976();
    }

    @ObfuscatedName("iz.az(III)V")
    public void method3974(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2415; var4++) {
            this.field2416[var4] = this.field2416[var4] * arg0 / 128;
            this.field2417[var4] = this.field2417[var4] * arg1 / 128;
            this.field2418[var4] = this.field2418[var4] * arg2 / 128;
        }
        this.method3976();
    }

    @ObfuscatedName("iz.ad()V")
    public void method4039() {
        if (this.field2455 != null) {
            return;
        }
        this.field2455 = new class234[this.field2415];
        for (int var1 = 0; var1 < this.field2415; var1++) {
            this.field2455[var1] = new class234();
        }
        for (int var2 = 0; var2 < this.field2419; var2++) {
            int var3 = this.field2420[var2];
            int var4 = this.field2456[var2];
            int var5 = this.field2422[var2];
            int var6 = this.field2416[var4] - this.field2416[var3];
            int var7 = this.field2417[var4] - this.field2417[var3];
            int var8 = this.field2418[var4] - this.field2418[var3];
            int var9 = this.field2416[var5] - this.field2416[var3];
            int var10 = this.field2417[var5] - this.field2417[var3];
            int var11 = this.field2418[var5] - this.field2418[var3];
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
            if (this.field2443 == null) {
                var19 = 0;
            } else {
                var19 = this.field2443[var2];
            }
            if (var19 == 0) {
                class234 var20 = this.field2455[var3];
                var20.field2779 += var16;
                var20.field2777 += var17;
                var20.field2778 += var18;
                var20.field2776++;
                class234 var21 = this.field2455[var4];
                var21.field2779 += var16;
                var21.field2777 += var17;
                var21.field2778 += var18;
                var21.field2776++;
                class234 var22 = this.field2455[var5];
                var22.field2779 += var16;
                var22.field2777 += var17;
                var22.field2778 += var18;
                var22.field2776++;
            } else if (var19 == 1) {
                if (this.field2441 == null) {
                    this.field2441 = new class226[this.field2419];
                }
                class226 var23 = this.field2441[var2] = new class226();
                var23.field2624 = var16;
                var23.field2622 = var17;
                var23.field2621 = var18;
            }
        }
    }

    @ObfuscatedName("iz.ae()V")
    public void method3976() {
        this.field2455 = null;
        this.field2442 = null;
        this.field2441 = null;
        this.field2446 = false;
    }

    @ObfuscatedName("iz.ap()V")
    public void method3977() {
        if (this.field2446) {
            return;
        }
        this.field2619 = 0;
        this.field2447 = 0;
        this.field2448 = 999999;
        this.field2439 = -999999;
        this.field2450 = -99999;
        this.field2434 = 99999;
        for (int var1 = 0; var1 < this.field2415; var1++) {
            int var2 = this.field2416[var1];
            int var3 = this.field2417[var1];
            int var4 = this.field2418[var1];
            if (var2 < this.field2448) {
                this.field2448 = var2;
            }
            if (var2 > this.field2439) {
                this.field2439 = var2;
            }
            if (var4 < this.field2434) {
                this.field2434 = var4;
            }
            if (var4 > this.field2450) {
                this.field2450 = var4;
            }
            if (-var3 > this.field2619) {
                this.field2619 = -var3;
            }
            if (var3 > this.field2447) {
                this.field2447 = var3;
            }
        }
        this.field2446 = true;
    }

    @ObfuscatedName("iz.by(Liz;Liz;IIIZ)V")
    public static void method3978(class214 arg0, class214 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3977();
        arg0.method4039();
        arg1.method3977();
        arg1.method4039();
        field2454++;
        int var6 = 0;
        int[] var7 = arg1.field2416;
        int var8 = arg1.field2415;
        for (int var9 = 0; var9 < arg0.field2415; var9++) {
            class234 var10 = arg0.field2455[var9];
            if (var10.field2776 != 0) {
                int var11 = arg0.field2417[var9] - arg3;
                if (var11 <= arg1.field2447) {
                    int var12 = arg0.field2416[var9] - arg2;
                    if (var12 >= arg1.field2448 && var12 <= arg1.field2439) {
                        int var13 = arg0.field2418[var9] - arg4;
                        if (var13 >= arg1.field2434 && var13 <= arg1.field2450) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class234 var15 = arg1.field2455[var14];
                                if (var7[var14] == var12 && arg1.field2418[var14] == var13 && arg1.field2417[var14] == var11 && var15.field2776 != 0) {
                                    if (arg0.field2442 == null) {
                                        arg0.field2442 = new class234[arg0.field2415];
                                    }
                                    if (arg1.field2442 == null) {
                                        arg1.field2442 = new class234[var8];
                                    }
                                    class234 var16 = arg0.field2442[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2442[var9] = new class234(var10);
                                    }
                                    class234 var17 = arg1.field2442[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2442[var14] = new class234(var15);
                                    }
                                    var16.field2779 += var15.field2779;
                                    var16.field2777 += var15.field2777;
                                    var16.field2778 += var15.field2778;
                                    var16.field2776 += var15.field2776;
                                    var17.field2779 += var10.field2779;
                                    var17.field2777 += var10.field2777;
                                    var17.field2778 += var10.field2778;
                                    var17.field2776 += var10.field2776;
                                    var6++;
                                    field2452[var9] = field2454;
                                    field2453[var14] = field2454;
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
        for (int var18 = 0; var18 < arg0.field2419; var18++) {
            if (field2452[arg0.field2420[var18]] == field2454 && field2452[arg0.field2456[var18]] == field2454 && field2452[arg0.field2422[var18]] == field2454) {
                if (arg0.field2443 == null) {
                    arg0.field2443 = new byte[arg0.field2419];
                }
                arg0.field2443[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2419; var19++) {
            if (field2453[arg1.field2420[var19]] == field2454 && field2453[arg1.field2456[var19]] == field2454 && field2453[arg1.field2422[var19]] == field2454) {
                if (arg1.field2443 == null) {
                    arg1.field2443 = new byte[arg1.field2419];
                }
                arg1.field2443[var19] = 2;
            }
        }
    }

    @ObfuscatedName("iz.bb(IIIII)Lit;")
    public final class232 method3979(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4039();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class232 var8 = new class232();
        var8.field2721 = new int[this.field2419];
        var8.field2702 = new int[this.field2419];
        var8.field2703 = new int[this.field2419];
        if (this.field2444 > 0 && this.field2426 != null) {
            int[] var9 = new int[this.field2444];
            for (int var10 = 0; var10 < this.field2419; var10++) {
                if (this.field2426[var10] != -1) {
                    var9[this.field2426[var10] & 0xFF]++;
                }
            }
            var8.field2709 = 0;
            for (int var11 = 0; var11 < this.field2444; var11++) {
                if (var9[var11] > 0 && this.field2431[var11] == 0) {
                    var8.field2709++;
                }
            }
            var8.field2760 = new int[var8.field2709];
            var8.field2711 = new int[var8.field2709];
            var8.field2745 = new int[var8.field2709];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2444; var13++) {
                if (var9[var13] > 0 && this.field2431[var13] == 0) {
                    var8.field2760[var12] = this.field2432[var13] & 0xFFFF;
                    var8.field2711[var12] = this.field2449[var13] & 0xFFFF;
                    var8.field2745[var12] = this.field2437[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2710 = new byte[this.field2419];
            for (int var14 = 0; var14 < this.field2419; var14++) {
                if (this.field2426[var14] == -1) {
                    var8.field2710[var14] = -1;
                } else {
                    var8.field2710[var14] = (byte) var9[this.field2426[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2419; var15++) {
            byte var16;
            if (this.field2443 == null) {
                var16 = 0;
            } else {
                var16 = this.field2443[var15];
            }
            byte var17;
            if (this.field2445 == null) {
                var17 = 0;
            } else {
                var17 = this.field2445[var15];
            }
            short var18;
            if (this.field2428 == null) {
                var18 = -1;
            } else {
                var18 = this.field2428[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2427[var15] & 0xFFFF;
                    class234 var20;
                    if (this.field2442 == null || this.field2442[this.field2420[var15]] == null) {
                        var20 = this.field2455[this.field2420[var15]];
                    } else {
                        var20 = this.field2442[this.field2420[var15]];
                    }
                    int var21 = (var20.field2778 * arg4 + var20.field2779 * arg2 + var20.field2777 * arg3) / (var20.field2776 * var7) + arg0;
                    var8.field2721[var15] = method3962(var19, var21);
                    class234 var22;
                    if (this.field2442 == null || this.field2442[this.field2456[var15]] == null) {
                        var22 = this.field2455[this.field2456[var15]];
                    } else {
                        var22 = this.field2442[this.field2456[var15]];
                    }
                    int var23 = (var22.field2778 * arg4 + var22.field2779 * arg2 + var22.field2777 * arg3) / (var22.field2776 * var7) + arg0;
                    var8.field2702[var15] = method3962(var19, var23);
                    class234 var24;
                    if (this.field2442 == null || this.field2442[this.field2422[var15]] == null) {
                        var24 = this.field2455[this.field2422[var15]];
                    } else {
                        var24 = this.field2442[this.field2422[var15]];
                    }
                    int var25 = (var24.field2778 * arg4 + var24.field2779 * arg2 + var24.field2777 * arg3) / (var24.field2776 * var7) + arg0;
                    var8.field2703[var15] = method3962(var19, var25);
                } else if (var16 == 1) {
                    class226 var26 = this.field2441[var15];
                    int var27 = (var26.field2621 * arg4 + var26.field2624 * arg2 + var26.field2622 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2721[var15] = method3962(this.field2427[var15] & 0xFFFF, var27);
                    var8.field2703[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2721[var15] = 128;
                    var8.field2703[var15] = -1;
                } else {
                    var8.field2703[var15] = -2;
                }
            } else if (var16 == 0) {
                class234 var28;
                if (this.field2442 == null || this.field2442[this.field2420[var15]] == null) {
                    var28 = this.field2455[this.field2420[var15]];
                } else {
                    var28 = this.field2442[this.field2420[var15]];
                }
                int var29 = (var28.field2778 * arg4 + var28.field2779 * arg2 + var28.field2777 * arg3) / (var28.field2776 * var7) + arg0;
                var8.field2721[var15] = method3981(var29);
                class234 var30;
                if (this.field2442 == null || this.field2442[this.field2456[var15]] == null) {
                    var30 = this.field2455[this.field2456[var15]];
                } else {
                    var30 = this.field2442[this.field2456[var15]];
                }
                int var31 = (var30.field2778 * arg4 + var30.field2779 * arg2 + var30.field2777 * arg3) / (var30.field2776 * var7) + arg0;
                var8.field2702[var15] = method3981(var31);
                class234 var32;
                if (this.field2442 == null || this.field2442[this.field2422[var15]] == null) {
                    var32 = this.field2455[this.field2422[var15]];
                } else {
                    var32 = this.field2442[this.field2422[var15]];
                }
                int var33 = (var32.field2778 * arg4 + var32.field2779 * arg2 + var32.field2777 * arg3) / (var32.field2776 * var7) + arg0;
                var8.field2703[var15] = method3981(var33);
            } else if (var16 == 1) {
                class226 var34 = this.field2441[var15];
                int var35 = (var34.field2621 * arg4 + var34.field2624 * arg2 + var34.field2622 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2721[var15] = method3981(var35);
                var8.field2703[var15] = -1;
            } else {
                var8.field2703[var15] = -2;
            }
        }
        this.method3972();
        var8.field2693 = this.field2415;
        var8.field2694 = this.field2416;
        var8.field2695 = this.field2417;
        var8.field2763 = this.field2418;
        var8.field2697 = this.field2419;
        var8.field2698 = this.field2420;
        var8.field2699 = this.field2456;
        var8.field2700 = this.field2422;
        var8.field2704 = this.field2424;
        var8.field2705 = this.field2445;
        var8.field2708 = this.field2429;
        var8.field2713 = this.field2430;
        var8.field2751 = this.field2438;
        var8.field2707 = this.field2428;
        var8.field2712 = this.field2413;
        var8.field2716 = this.field2440;
        return var8;
    }

    @ObfuscatedName("iz.bi(II)I")
    public static final int method3962(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("iz.be(I)I")
    public static final int method3981(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
