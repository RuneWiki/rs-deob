package deob;

@ObfuscatedName("dk")
public class class43 extends class107 {

    @ObfuscatedName("dk.f")
    public short[] field462;

    @ObfuscatedName("dk.g")
    public int[] field453;

    @ObfuscatedName("dk.d")
    public int[] field451;

    @ObfuscatedName("dk.e")
    public int[] field458;

    @ObfuscatedName("dk.b")
    public static class43 field446 = new class43();

    @ObfuscatedName("dk.c")
    public static byte[] field445 = new byte[1];

    @ObfuscatedName("dk.a")
    public int[] field455;

    @ObfuscatedName("dk.n")
    public int[][] field468;

    @ObfuscatedName("dk.o")
    public byte[] field460;

    @ObfuscatedName("dk.l")
    public int[] field467;

    @ObfuscatedName("dk.m")
    public int field448 = 0;

    @ObfuscatedName("dk.j")
    public int field452 = 0;

    @ObfuscatedName("dk.k")
    public int[] field472;

    @ObfuscatedName("dk.h")
    public byte field463 = 0;

    @ObfuscatedName("dk.i")
    public static byte[] field444 = new byte[1];

    @ObfuscatedName("dk.w")
    public int[] field447;

    @ObfuscatedName("dk.v")
    public static class43 field485 = new class43();

    @ObfuscatedName("dk.u")
    public int[] field457;

    @ObfuscatedName("dk.t")
    public int field450 = 0;

    @ObfuscatedName("dk.s")
    public byte[] field461;

    @ObfuscatedName("dk.r")
    public int[] field474;

    @ObfuscatedName("dk.q")
    public int[][] field501;

    @ObfuscatedName("dk.p")
    public byte[] field459;

    @ObfuscatedName("dk.z")
    public int[] field477;

    @ObfuscatedName("dk.y")
    public int[] field454;

    @ObfuscatedName("dk.x")
    public int[] field499;

    @ObfuscatedName("dk.bw")
    public static int[] field496 = class155.field2345;

    @ObfuscatedName("dk.bv")
    public static int field500 = 0;

    @ObfuscatedName("dk.by")
    public static int[] field488 = class155.field2332;

    @ObfuscatedName("dk.bx")
    public static int field464 = 0;

    @ObfuscatedName("dk.bn")
    public static int[] field484 = class155.field2342;

    @ObfuscatedName("dk.bo")
    public static int field506 = 0;

    @ObfuscatedName("dk.bp")
    public static int[] field504 = class155.field2344;

    @ObfuscatedName("dk.bq")
    public static boolean field469 = false;

    @ObfuscatedName("dk.bi")
    public static int[] field503 = new int[1000];

    @ObfuscatedName("dk.az")
    public static int[][] field482 = new int[12][2000];

    @ObfuscatedName("dk.ay")
    public static int[] field494 = new int[10];

    @ObfuscatedName("dk.at")
    public static int[] field495 = new int[10];

    @ObfuscatedName("dk.as")
    public boolean field489 = false;

    @ObfuscatedName("dk.ar")
    public static boolean[] field473 = new boolean[4096];

    @ObfuscatedName("dk.aq")
    public static int[] field493 = new int[10];

    @ObfuscatedName("dk.ax")
    public int field466;

    @ObfuscatedName("dk.aw")
    public static int[] field502 = new int[4096];

    @ObfuscatedName("dk.au")
    public static int[] field470 = new int[4096];

    @ObfuscatedName("dk.ak")
    public static int[] field492 = new int[12];

    @ObfuscatedName("dk.al")
    public static int[] field483 = new int[4096];

    @ObfuscatedName("dk.ai")
    public static boolean[] field471 = new boolean[4096];

    @ObfuscatedName("dk.aj")
    public static int[] field481 = new int[4096];

    @ObfuscatedName("dk.ao")
    public int field465;

    @ObfuscatedName("dk.ap")
    public static int[][] field487 = new int[1600][512];

    @ObfuscatedName("dk.am")
    public static int[] field480 = new int[4096];

    @ObfuscatedName("dk.ac")
    public int field478;

    @ObfuscatedName("dk.ad")
    public static int[] field449 = new int[12];

    @ObfuscatedName("dk.aa")
    public int field475;

    @ObfuscatedName("dk.ab")
    public static int[] field491 = new int[2000];

    @ObfuscatedName("dk.ag")
    public static int[] field490 = new int[2000];

    @ObfuscatedName("dk.ah")
    public int field456;

    @ObfuscatedName("dk.ae")
    public static int[] field479 = new int[4096];

    @ObfuscatedName("dk.af")
    public static int[] field486 = new int[1600];

    @ObfuscatedName("dk.v([[IIIIZI)Ldk;")
    public class43 method773(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method778();
        int var7 = arg1 - this.field465;
        int var8 = this.field465 + arg1;
        int var9 = arg3 - this.field465;
        int var10 = this.field465 + arg3;
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
        class43 var15;
        if (arg4) {
            var15 = new class43();
            var15.field448 = this.field448;
            var15.field452 = this.field452;
            var15.field450 = this.field450;
            var15.field477 = this.field477;
            var15.field451 = this.field451;
            var15.field453 = this.field453;
            var15.field454 = this.field454;
            var15.field455 = this.field455;
            var15.field457 = this.field457;
            var15.field472 = this.field472;
            var15.field458 = this.field458;
            var15.field459 = this.field459;
            var15.field460 = this.field460;
            var15.field461 = this.field461;
            var15.field462 = this.field462;
            var15.field463 = this.field463;
            var15.field447 = this.field447;
            var15.field474 = this.field474;
            var15.field467 = this.field467;
            var15.field468 = this.field468;
            var15.field501 = this.field501;
            var15.field489 = this.field489;
            var15.field499 = new int[var15.field448];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field448; var16++) {
                int var17 = this.field477[var16] + arg1;
                int var18 = this.field451[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field499[var16] = this.field499[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field448; var26++) {
                int var27 = (-this.field499[var26] << 16) / this.field1455;
                if (var27 < arg5) {
                    int var28 = this.field477[var26] + arg1;
                    int var29 = this.field451[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field499[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field499[var26];
                }
            }
        }
        var15.field478 = 0;
        return var15;
    }

    @ObfuscatedName("dk.b(Z)Ldk;")
    public class43 method774(boolean arg0) {
        if (!arg0 && field445.length < this.field452) {
            field445 = new byte[this.field452 + 100];
        }
        return this.method776(arg0, field485, field445);
    }

    @ObfuscatedName("dk.i(Z)Ldk;")
    public class43 method775(boolean arg0) {
        if (!arg0 && field444.length < this.field452) {
            field444 = new byte[this.field452 + 100];
        }
        return this.method776(arg0, field446, field444);
    }

    @ObfuscatedName("dk.m(ZLdk;[B)Ldk;")
    public class43 method776(boolean arg0, class43 arg1, byte[] arg2) {
        arg1.field448 = this.field448;
        arg1.field452 = this.field452;
        arg1.field450 = this.field450;
        if (arg1.field477 == null || arg1.field477.length < this.field448) {
            arg1.field477 = new int[this.field448 + 100];
            arg1.field499 = new int[this.field448 + 100];
            arg1.field451 = new int[this.field448 + 100];
        }
        for (int var4 = 0; var4 < this.field448; var4++) {
            arg1.field477[var4] = this.field477[var4];
            arg1.field499[var4] = this.field499[var4];
            arg1.field451[var4] = this.field451[var4];
        }
        if (arg0) {
            arg1.field460 = this.field460;
        } else {
            arg1.field460 = arg2;
            if (this.field460 == null) {
                for (int var5 = 0; var5 < this.field452; var5++) {
                    arg1.field460[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field452; var6++) {
                    arg1.field460[var6] = this.field460[var6];
                }
            }
        }
        arg1.field453 = this.field453;
        arg1.field454 = this.field454;
        arg1.field455 = this.field455;
        arg1.field457 = this.field457;
        arg1.field472 = this.field472;
        arg1.field458 = this.field458;
        arg1.field459 = this.field459;
        arg1.field461 = this.field461;
        arg1.field462 = this.field462;
        arg1.field463 = this.field463;
        arg1.field447 = this.field447;
        arg1.field474 = this.field474;
        arg1.field467 = this.field467;
        arg1.field468 = this.field468;
        arg1.field501 = this.field501;
        arg1.field489 = this.field489;
        arg1.field478 = 0;
        return arg1;
    }

    @ObfuscatedName("dk.z()V")
    public void method778() {
        if (this.field478 == 1) {
            return;
        }
        this.field478 = 1;
        this.field1455 = 0;
        this.field466 = 0;
        this.field465 = 0;
        for (int var1 = 0; var1 < this.field448; var1++) {
            int var2 = this.field477[var1];
            int var3 = this.field499[var1];
            int var4 = this.field451[var1];
            if (-var3 > this.field1455) {
                this.field1455 = -var3;
            }
            if (var3 > this.field466) {
                this.field466 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field465) {
                this.field465 = var5;
            }
        }
        this.field465 = (int) (Math.sqrt((double) this.field465) + 0.99D);
        this.field475 = (int) (Math.sqrt((double) (this.field1455 * this.field1455 + this.field465 * this.field465)) + 0.99D);
        this.field456 = this.field475 + (int) (Math.sqrt((double) (this.field466 * this.field466 + this.field465 * this.field465)) + 0.99D);
    }

    @ObfuscatedName("dk.n(I)V")
    public final void method779(int arg0) {
        int var2 = Statics.field2333;
        int var3 = Statics.field2334;
        int var4 = 0;
        int var5 = this.field453[arg0];
        int var6 = this.field454[arg0];
        int var7 = this.field455[arg0];
        int var8 = field502[var5];
        int var9 = field502[var6];
        int var10 = field502[var7];
        if (this.field460 == null) {
            class155.field2340 = 0;
        } else {
            class155.field2340 = this.field460[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field493[var4] = field479[var5];
            field494[var4] = field480[var5];
            field495[var4++] = this.field457[arg0];
        } else {
            int var11 = field470[var5];
            int var12 = field483[var5];
            int var13 = this.field457[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field496[var10 - var8];
                field493[var4] = (((field470[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field494[var4] = (((field483[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field495[var4++] = ((this.field458[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field496[var9 - var8];
                field493[var4] = (((field470[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field494[var4] = (((field483[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field495[var4++] = ((this.field472[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field493[var4] = field479[var6];
            field494[var4] = field480[var6];
            field495[var4++] = this.field472[arg0];
        } else {
            int var16 = field470[var6];
            int var17 = field483[var6];
            int var18 = this.field472[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field496[var8 - var9];
                field493[var4] = (((field470[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field494[var4] = (((field483[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field495[var4++] = ((this.field457[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field496[var10 - var9];
                field493[var4] = (((field470[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field494[var4] = (((field483[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field495[var4++] = ((this.field458[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field493[var4] = field479[var7];
            field494[var4] = field480[var7];
            field495[var4++] = this.field458[arg0];
        } else {
            int var21 = field470[var7];
            int var22 = field483[var7];
            int var23 = this.field458[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field496[var9 - var10];
                field493[var4] = (((field470[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field494[var4] = (((field483[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field495[var4++] = ((this.field472[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field496[var8 - var10];
                field493[var4] = (((field470[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field494[var4] = (((field483[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field495[var4++] = ((this.field457[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field493[0];
        int var27 = field493[1];
        int var28 = field493[2];
        int var29 = field494[0];
        int var30 = field494[1];
        int var31 = field494[2];
        class155.field2327 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2335 || var27 > Statics.field2335 || var28 > Statics.field2335) {
                class155.field2327 = true;
            }
            if (this.field462 != null && this.field462[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field461 == null || this.field461[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field461[arg0] & 0xFF;
                    var33 = this.field447[var32];
                    var34 = this.field474[var32];
                    var35 = this.field467[var32];
                }
                if (this.field458[arg0] == -1) {
                    class155.method2799(var29, var30, var31, var26, var27, var28, this.field457[arg0], this.field457[arg0], this.field457[arg0], field470[var33], field470[var34], field470[var35], field483[var33], field483[var34], field483[var35], field502[var33], field502[var34], field502[var35], this.field462[arg0]);
                } else {
                    class155.method2799(var29, var30, var31, var26, var27, var28, field495[0], field495[1], field495[2], field470[var33], field470[var34], field470[var35], field483[var33], field483[var34], field483[var35], field502[var33], field502[var34], field502[var35], this.field462[arg0]);
                }
            } else if (this.field458[arg0] == -1) {
                class155.method2763(var29, var30, var31, var26, var27, var28, field484[this.field457[arg0]]);
            } else {
                class155.method2761(var29, var30, var31, var26, var27, var28, field495[0], field495[1], field495[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2335 || var27 > Statics.field2335 || var28 > Statics.field2335 || field493[3] < 0 || field493[3] > Statics.field2335) {
            class155.field2327 = true;
        }
        if (this.field462 != null && this.field462[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field461 == null || this.field461[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field461[arg0] & 0xFF;
                var37 = this.field447[var36];
                var38 = this.field474[var36];
                var39 = this.field467[var36];
            }
            short var40 = this.field462[arg0];
            if (this.field458[arg0] == -1) {
                class155.method2799(var29, var30, var31, var26, var27, var28, this.field457[arg0], this.field457[arg0], this.field457[arg0], field470[var37], field470[var38], field470[var39], field483[var37], field483[var38], field483[var39], field502[var37], field502[var38], field502[var39], var40);
                class155.method2799(var29, var31, field494[3], var26, var28, field493[3], this.field457[arg0], this.field457[arg0], this.field457[arg0], field470[var37], field470[var38], field470[var39], field483[var37], field483[var38], field483[var39], field502[var37], field502[var38], field502[var39], var40);
            } else {
                class155.method2799(var29, var30, var31, var26, var27, var28, field495[0], field495[1], field495[2], field470[var37], field470[var38], field470[var39], field483[var37], field483[var38], field483[var39], field502[var37], field502[var38], field502[var39], var40);
                class155.method2799(var29, var31, field494[3], var26, var28, field493[3], field495[0], field495[2], field495[3], field470[var37], field470[var38], field470[var39], field483[var37], field483[var38], field483[var39], field502[var37], field502[var38], field502[var39], var40);
            }
        } else if (this.field458[arg0] == -1) {
            int var41 = field484[this.field457[arg0]];
            class155.method2763(var29, var30, var31, var26, var27, var28, var41);
            class155.method2763(var29, var31, field494[3], var26, var28, field493[3], var41);
        } else {
            class155.method2761(var29, var30, var31, var26, var27, var28, field495[0], field495[1], field495[2]);
            class155.method2761(var29, var31, field494[3], var26, var28, field493[3], field495[0], field495[2], field495[3]);
        }
    }

    public class43(class43[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field448 = 0;
        this.field452 = 0;
        this.field450 = 0;
        this.field463 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class43 var8 = arg0[var7];
            if (var8 != null) {
                this.field448 += var8.field448;
                this.field452 += var8.field452;
                this.field450 += var8.field450;
                if (var8.field459 == null) {
                    if (this.field463 == -1) {
                        this.field463 = var8.field463;
                    }
                    if (this.field463 != var8.field463) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field460 != null;
                var5 |= var8.field462 != null;
                var6 |= var8.field461 != null;
            }
        }
        this.field477 = new int[this.field448];
        this.field499 = new int[this.field448];
        this.field451 = new int[this.field448];
        this.field453 = new int[this.field452];
        this.field454 = new int[this.field452];
        this.field455 = new int[this.field452];
        this.field457 = new int[this.field452];
        this.field472 = new int[this.field452];
        this.field458 = new int[this.field452];
        if (var3) {
            this.field459 = new byte[this.field452];
        }
        if (var4) {
            this.field460 = new byte[this.field452];
        }
        if (var5) {
            this.field462 = new short[this.field452];
        }
        if (var6) {
            this.field461 = new byte[this.field452];
        }
        if (this.field450 > 0) {
            this.field447 = new int[this.field450];
            this.field474 = new int[this.field450];
            this.field467 = new int[this.field450];
        }
        this.field448 = 0;
        this.field452 = 0;
        this.field450 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class43 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field452; var11++) {
                    this.field453[this.field452] = var10.field453[var11] + this.field448;
                    this.field454[this.field452] = var10.field454[var11] + this.field448;
                    this.field455[this.field452] = var10.field455[var11] + this.field448;
                    this.field457[this.field452] = var10.field457[var11];
                    this.field472[this.field452] = var10.field472[var11];
                    this.field458[this.field452] = var10.field458[var11];
                    if (var3) {
                        if (var10.field459 == null) {
                            this.field459[this.field452] = var10.field463;
                        } else {
                            this.field459[this.field452] = var10.field459[var11];
                        }
                    }
                    if (var4 && var10.field460 != null) {
                        this.field460[this.field452] = var10.field460[var11];
                    }
                    if (var5) {
                        if (var10.field462 == null) {
                            this.field462[this.field452] = -1;
                        } else {
                            this.field462[this.field452] = var10.field462[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field461 == null || var10.field461[var11] == -1) {
                            this.field461[this.field452] = -1;
                        } else {
                            this.field461[this.field452] = (byte) (var10.field461[var11] + this.field450);
                        }
                    }
                    this.field452++;
                }
                for (int var12 = 0; var12 < var10.field450; var12++) {
                    this.field447[this.field450] = var10.field447[var12] + this.field448;
                    this.field474[this.field450] = var10.field474[var12] + this.field448;
                    this.field467[this.field450] = var10.field467[var12] + this.field448;
                    this.field450++;
                }
                for (int var13 = 0; var13 < var10.field448; var13++) {
                    this.field477[this.field448] = var10.field477[var13];
                    this.field499[this.field448] = var10.field499[var13];
                    this.field451[this.field448] = var10.field451[var13];
                    this.field448++;
                }
            }
        }
    }

    @ObfuscatedName("dk.u(Ldn;ILdn;I[I)V")
    public void method780(class48 arg0, int arg1, class48 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method824(arg0, arg1);
            return;
        }
        class147 var6 = arg0.field532[arg1];
        class147 var7 = arg2.field532[arg3];
        class44 var8 = var6.field2204;
        Statics.field505 = 0;
        Statics.field497 = 0;
        Statics.field498 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2205; var11++) {
            int var12 = var6.field2200[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field511[var12] == 0) {
                this.method781(var8.field511[var12], var8.field517[var12], var6.field2207[var11], var6.field2209[var11], var6.field2208[var11]);
            }
        }
        Statics.field505 = 0;
        Statics.field497 = 0;
        Statics.field498 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2205; var15++) {
            int var16 = var7.field2200[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field511[var16] == 0) {
                this.method781(var8.field511[var16], var8.field517[var16], var7.field2207[var15], var7.field2209[var15], var7.field2208[var15]);
            }
        }
        this.field478 = 0;
    }

    @ObfuscatedName("dk.k(I[IIII)V")
    public void method781(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field505 = 0;
            Statics.field497 = 0;
            Statics.field498 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field468.length) {
                    int[] var10 = this.field468[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field505 += this.field477[var12];
                        Statics.field497 += this.field499[var12];
                        Statics.field498 += this.field451[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field505 = Statics.field505 / var7 + arg2;
                Statics.field497 = Statics.field497 / var7 + arg3;
                Statics.field498 = Statics.field498 / var7 + arg4;
            } else {
                Statics.field505 = arg2;
                Statics.field497 = arg3;
                Statics.field498 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field468.length) {
                    int[] var15 = this.field468[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field477[var17] += arg2;
                        this.field499[var17] += arg3;
                        this.field451[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field468.length) {
                    int[] var20 = this.field468[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field477[var22] -= Statics.field505;
                        this.field499[var22] -= Statics.field497;
                        this.field451[var22] -= Statics.field498;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field504[var25];
                            int var27 = field488[var25];
                            int var28 = this.field499[var22] * var26 + this.field477[var22] * var27 >> 16;
                            this.field499[var22] = this.field499[var22] * var27 - this.field477[var22] * var26 >> 16;
                            this.field477[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field504[var23];
                            int var30 = field488[var23];
                            int var31 = this.field499[var22] * var30 - this.field451[var22] * var29 >> 16;
                            this.field451[var22] = this.field499[var22] * var29 + this.field451[var22] * var30 >> 16;
                            this.field499[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field504[var24];
                            int var33 = field488[var24];
                            int var34 = this.field477[var22] * var33 + this.field451[var22] * var32 >> 16;
                            this.field451[var22] = this.field451[var22] * var33 - this.field477[var22] * var32 >> 16;
                            this.field477[var22] = var34;
                        }
                        this.field477[var22] += Statics.field505;
                        this.field499[var22] += Statics.field497;
                        this.field451[var22] += Statics.field498;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field468.length) {
                    int[] var37 = this.field468[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field477[var39] -= Statics.field505;
                        this.field499[var39] -= Statics.field497;
                        this.field451[var39] -= Statics.field498;
                        this.field477[var39] = this.field477[var39] * arg2 / 128;
                        this.field499[var39] = this.field499[var39] * arg3 / 128;
                        this.field451[var39] = this.field451[var39] * arg4 / 128;
                        this.field477[var39] += Statics.field505;
                        this.field499[var39] += Statics.field497;
                        this.field451[var39] += Statics.field498;
                    }
                }
            }
        } else if (arg0 == 5 && this.field501 != null && this.field460 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field501.length) {
                    int[] var42 = this.field501[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field460[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field460[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.e()V")
    public void method782() {
        for (int var1 = 0; var1 < this.field448; var1++) {
            int var2 = this.field477[var1];
            this.field477[var1] = this.field451[var1];
            this.field451[var1] = -var2;
        }
        this.field478 = 0;
    }

    @ObfuscatedName("dk.p()V")
    public void method783() {
        for (int var1 = 0; var1 < this.field448; var1++) {
            this.field477[var1] = -this.field477[var1];
            this.field451[var1] = -this.field451[var1];
        }
        this.field478 = 0;
    }

    @ObfuscatedName("dk.s(I)V")
    public void method785(int arg0) {
        int var2 = field504[arg0];
        int var3 = field488[arg0];
        for (int var4 = 0; var4 < this.field448; var4++) {
            int var5 = this.field499[var4] * var3 - this.field451[var4] * var2 >> 16;
            this.field451[var4] = this.field499[var4] * var2 + this.field451[var4] * var3 >> 16;
            this.field499[var4] = var5;
        }
        this.field478 = 0;
    }

    @ObfuscatedName("dk.f(III)V")
    public void method786(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field448; var4++) {
            this.field477[var4] += arg0;
            this.field499[var4] += arg1;
            this.field451[var4] += arg2;
        }
        this.field478 = 0;
    }

    @ObfuscatedName("dk.l(I)V")
    public final void method788(int arg0) {
        if (field471[arg0]) {
            this.method779(arg0);
            return;
        }
        int var2 = this.field453[arg0];
        int var3 = this.field454[arg0];
        int var4 = this.field455[arg0];
        class155.field2327 = field473[arg0];
        if (this.field460 == null) {
            class155.field2340 = 0;
        } else {
            class155.field2340 = this.field460[arg0] & 0xFF;
        }
        if (this.field462 != null && this.field462[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field461 == null || this.field461[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field461[arg0] & 0xFF;
                var6 = this.field447[var5];
                var7 = this.field474[var5];
                var8 = this.field467[var5];
            }
            if (this.field458[arg0] == -1) {
                class155.method2799(field480[var2], field480[var3], field480[var4], field479[var2], field479[var3], field479[var4], this.field457[arg0], this.field457[arg0], this.field457[arg0], field470[var6], field470[var7], field470[var8], field483[var6], field483[var7], field483[var8], field502[var6], field502[var7], field502[var8], this.field462[arg0]);
            } else {
                class155.method2799(field480[var2], field480[var3], field480[var4], field479[var2], field479[var3], field479[var4], this.field457[arg0], this.field472[arg0], this.field458[arg0], field470[var6], field470[var7], field470[var8], field483[var6], field483[var7], field483[var8], field502[var6], field502[var7], field502[var8], this.field462[arg0]);
            }
        } else if (this.field458[arg0] == -1) {
            class155.method2763(field480[var2], field480[var3], field480[var4], field479[var2], field479[var3], field479[var4], field484[this.field457[arg0]]);
        } else {
            class155.method2761(field480[var2], field480[var3], field480[var4], field479[var2], field479[var3], field479[var4], this.field457[arg0], this.field472[arg0], this.field458[arg0]);
        }
    }

    @ObfuscatedName("dk.w(IIIIIIII)V")
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field486[0] = -1;
        if (this.field478 != 2 && this.field478 != 1) {
            this.method823();
        }
        int var9 = Statics.field2333;
        int var10 = Statics.field2334;
        int var11 = field504[arg0];
        int var12 = field488[arg0];
        int var13 = field504[arg1];
        int var14 = field488[arg1];
        int var15 = field504[arg2];
        int var16 = field488[arg2];
        int var17 = field504[arg3];
        int var18 = field488[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field448; var20++) {
            int var21 = this.field477[var20];
            int var22 = this.field499[var20];
            int var23 = this.field451[var20];
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
            field481[var20] = var31 - var19;
            field479[var20] = (var27 << 9) / arg7 + var9;
            field480[var20] = (var30 << 9) / arg7 + var10;
            if (this.field450 > 0) {
                field470[var20] = var27;
                field483[var20] = var30;
                field502[var20] = var31;
            }
        }
        try {
            this.method826(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dk.ao(IIIIIIIII)V")
    public void method790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field486[0] = -1;
        if (this.field478 != 1) {
            this.method778();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field465 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field465 << 9;
        if (var15 / var13 >= Statics.field2346) {
            return;
        }
        int var16 = this.field465 + var14 << 9;
        if (var16 / var13 <= Statics.field2337) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field465 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field2324) {
            return;
        }
        int var20 = (this.field1455 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field2339) {
            return;
        }
        int var22 = (this.field1455 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field450 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field469) {
            int var27 = var11 - var12;
            if (var27 <= 50) {
                var27 = 50;
            }
            int var28;
            int var29;
            if (var14 > 0) {
                var28 = var15 / var13;
                var29 = var16 / var27;
            } else {
                var29 = var16 / var13;
                var28 = var15 / var27;
            }
            int var30;
            int var31;
            if (var17 > 0) {
                var30 = var21 / var13;
                var31 = var19 / var27;
            } else {
                var31 = var19 / var13;
                var30 = var21 / var27;
            }
            int var32 = field500 - Statics.field2333;
            int var33 = field464 - Statics.field2334;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field489) {
                    field503[field506++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field2333;
        int var35 = Statics.field2334;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field504[arg0];
            var37 = field488[arg0];
        }
        for (int var38 = 0; var38 < this.field448; var38++) {
            int var39 = this.field477[var38];
            int var40 = this.field499[var38];
            int var41 = this.field451[var38];
            if (arg0 != 0) {
                int var42 = var36 * var41 + var37 * var39 >> 16;
                var41 = var37 * var41 - var36 * var39 >> 16;
                var39 = var42;
            }
            int var43 = arg5 + var39;
            int var44 = arg6 + var40;
            int var45 = arg7 + var41;
            int var46 = arg3 * var45 + arg4 * var43 >> 16;
            int var47 = arg4 * var45 - arg3 * var43 >> 16;
            int var49 = arg2 * var44 - arg1 * var47 >> 16;
            int var50 = arg1 * var44 + arg2 * var47 >> 16;
            field481[var38] = var50 - var11;
            if (var50 >= 50) {
                field479[var38] = (var46 << 9) / var50 + var34;
                field480[var38] = (var49 << 9) / var50 + var35;
            } else {
                field479[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field470[var38] = var46;
                field483[var38] = var49;
                field502[var38] = var50;
            }
        }
        try {
            this.method826(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("dk.t(IIIIIII)V")
    public final void method795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field486[0] = -1;
        if (this.field478 != 2 && this.field478 != 1) {
            this.method823();
        }
        int var8 = Statics.field2333;
        int var9 = Statics.field2334;
        int var10 = field504[arg0];
        int var11 = field488[arg0];
        int var12 = field504[arg1];
        int var13 = field488[arg1];
        int var14 = field504[arg2];
        int var15 = field488[arg2];
        int var16 = field504[arg3];
        int var17 = field488[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field448; var19++) {
            int var20 = this.field477[var19];
            int var21 = this.field499[var19];
            int var22 = this.field451[var19];
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
            field481[var19] = var30 - var18;
            field479[var19] = (var26 << 9) / var30 + var8;
            field480[var19] = (var29 << 9) / var30 + var9;
            if (this.field450 > 0) {
                field470[var19] = var26;
                field483[var19] = var29;
                field502[var19] = var30;
            }
        }
        try {
            this.method826(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dk.o()V")
    public void method809() {
        for (int var1 = 0; var1 < this.field448; var1++) {
            int var2 = this.field451[var1];
            this.field451[var1] = this.field477[var1];
            this.field477[var1] = -var2;
        }
        this.field478 = 0;
    }

    public class43() {
    }

    @ObfuscatedName("dk.q(IIIIIIII)Z")
    public final boolean method820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @ObfuscatedName("dk.y()I")
    public int method821() {
        this.method778();
        return this.field465;
    }

    @ObfuscatedName("dk.g()V")
    public void method823() {
        if (this.field478 == 2) {
            return;
        }
        this.field478 = 2;
        this.field465 = 0;
        for (int var1 = 0; var1 < this.field448; var1++) {
            int var2 = this.field477[var1];
            int var3 = this.field499[var1];
            int var4 = this.field451[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field465) {
                this.field465 = var5;
            }
        }
        this.field465 = (int) (Math.sqrt((double) this.field465) + 0.99D);
        this.field475 = this.field465;
        this.field456 = this.field465 + this.field465;
    }

    @ObfuscatedName("dk.a(Ldn;I)V")
    public void method824(class48 arg0, int arg1) {
        if (this.field468 == null || arg1 == -1) {
            return;
        }
        class147 var3 = arg0.field532[arg1];
        class44 var4 = var3.field2204;
        Statics.field505 = 0;
        Statics.field497 = 0;
        Statics.field498 = 0;
        for (int var5 = 0; var5 < var3.field2205; var5++) {
            int var6 = var3.field2200[var5];
            this.method781(var4.field511[var6], var4.field517[var6], var3.field2207[var5], var3.field2209[var5], var3.field2208[var5]);
        }
        this.field478 = 0;
    }

    @ObfuscatedName("dk.r(ZZI)V")
    public final void method826(boolean arg0, boolean arg1, int arg2) {
        if (this.field456 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field456; var4++) {
            field486[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field452; var5++) {
            if (this.field458[var5] != -2) {
                int var6 = this.field453[var5];
                int var7 = this.field454[var5];
                int var8 = this.field455[var5];
                int var9 = field479[var6];
                int var10 = field479[var7];
                int var11 = field479[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field470[var6];
                    int var13 = field470[var7];
                    int var14 = field470[var8];
                    int var15 = field483[var6];
                    int var16 = field483[var7];
                    int var17 = field483[var8];
                    int var18 = field502[var6];
                    int var19 = field502[var7];
                    int var20 = field502[var8];
                    int var21 = var12 - var13;
                    int var22 = var14 - var13;
                    int var23 = var15 - var16;
                    int var24 = var17 - var16;
                    int var25 = var18 - var19;
                    int var26 = var20 - var19;
                    int var27 = var23 * var26 - var24 * var25;
                    int var28 = var22 * var25 - var21 * var26;
                    int var29 = var21 * var24 - var22 * var23;
                    if (var19 * var29 + var13 * var27 + var16 * var28 > 0) {
                        field471[var5] = true;
                        int var30 = (field481[var6] + field481[var7] + field481[var8]) / 3 + this.field475;
                        field487[var30][field486[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method820(field500, field464, field480[var6], field480[var7], field480[var8], var9, var10, var11)) {
                        field503[field506++] = arg2;
                        arg1 = false;
                    }
                    if ((field480[var8] - field480[var7]) * (var9 - var10) - (field480[var6] - field480[var7]) * (var11 - var10) > 0) {
                        field471[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field2335 && var10 <= Statics.field2335 && var11 <= Statics.field2335) {
                            field473[var5] = false;
                        } else {
                            field473[var5] = true;
                        }
                        int var31 = (field481[var6] + field481[var7] + field481[var8]) / 3 + this.field475;
                        field487[var31][field486[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field459 == null) {
            for (int var32 = this.field456 - 1; var32 >= 0; var32--) {
                int var33 = field486[var32];
                if (var33 > 0) {
                    int[] var34 = field487[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method788(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field449[var36] = 0;
            field492[var36] = 0;
        }
        for (int var37 = this.field456 - 1; var37 >= 0; var37--) {
            int var38 = field486[var37];
            if (var38 > 0) {
                int[] var39 = field487[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field459[var41];
                    int var43 = field449[var42]++;
                    field482[var42][var43] = var41;
                    if (var42 < 10) {
                        field492[var42] += var37;
                    } else if (var42 == 10) {
                        field490[var43] = var37;
                    } else {
                        field491[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field449[1] > 0 || field449[2] > 0) {
            var44 = (field492[1] + field492[2]) / (field449[1] + field449[2]);
        }
        int var45 = 0;
        if (field449[3] > 0 || field449[4] > 0) {
            var45 = (field492[3] + field492[4]) / (field449[3] + field449[4]);
        }
        int var46 = 0;
        if (field449[6] > 0 || field449[8] > 0) {
            var46 = (field492[6] + field492[8]) / (field449[6] + field449[8]);
        }
        int var47 = 0;
        int var48 = field449[10];
        int[] var49 = field482[10];
        int[] var50 = field490;
        if (var47 == var48) {
            var47 = 0;
            var48 = field449[11];
            var49 = field482[11];
            var50 = field491;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method788(var49[var47++]);
                if (var47 == var48 && field482[11] != var49) {
                    var47 = 0;
                    var48 = field449[11];
                    var49 = field482[11];
                    var50 = field491;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method788(var49[var47++]);
                if (var47 == var48 && field482[11] != var49) {
                    var47 = 0;
                    var48 = field449[11];
                    var49 = field482[11];
                    var50 = field491;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method788(var49[var47++]);
                if (var47 == var48 && field482[11] != var49) {
                    var47 = 0;
                    var48 = field449[11];
                    var49 = field482[11];
                    var50 = field491;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field449[var52];
            int[] var54 = field482[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method788(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method788(var49[var47++]);
            if (var47 == var48 && field482[11] != var49) {
                var47 = 0;
                var49 = field482[11];
                var48 = field449[11];
                var50 = field491;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("dk.h(III)V")
    public void method829(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field448; var4++) {
            this.field477[var4] = this.field477[var4] * arg0 / 128;
            this.field499[var4] = this.field499[var4] * arg1 / 128;
            this.field451[var4] = this.field451[var4] * arg2 / 128;
        }
        this.field478 = 0;
    }
}
