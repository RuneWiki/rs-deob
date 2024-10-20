package deob;

@ObfuscatedName("di")
public class class41 extends class144 {

    @ObfuscatedName("di.f")
    public int[] field307;

    @ObfuscatedName("di.g")
    public int[] field286;

    @ObfuscatedName("di.d")
    public int[][] field303;

    @ObfuscatedName("di.e")
    public int field287 = 0;

    @ObfuscatedName("di.b")
    public int[] field292;

    @ObfuscatedName("di.c")
    public short[] field318;

    @ObfuscatedName("di.a")
    public int[][] field337;

    @ObfuscatedName("di.n")
    public int[] field341;

    @ObfuscatedName("di.o")
    public static class41 field281 = new class41();

    @ObfuscatedName("di.l")
    public int[] field304;

    @ObfuscatedName("di.m")
    public byte[] field336;

    @ObfuscatedName("di.j")
    public static class41 field296 = new class41();

    @ObfuscatedName("di.k")
    public int[] field297;

    @ObfuscatedName("di.h")
    public int field308 = 0;

    @ObfuscatedName("di.i")
    public int[] field293;

    @ObfuscatedName("di.w")
    public int[] field279;

    @ObfuscatedName("di.v")
    public byte[] field300;

    @ObfuscatedName("di.u")
    public byte field298 = 0;

    @ObfuscatedName("di.t")
    public static byte[] field282 = new byte[1];

    @ObfuscatedName("di.s")
    public byte[] field294;

    @ObfuscatedName("di.r")
    public int[] field284;

    @ObfuscatedName("di.q")
    public int[] field302;

    @ObfuscatedName("di.p")
    public static byte[] field280 = new byte[1];

    @ObfuscatedName("di.z")
    public int[] field290;

    @ObfuscatedName("di.y")
    public int field299 = 0;

    @ObfuscatedName("di.x")
    public int[] field289;

    @ObfuscatedName("di.bx")
    public static int[] field313 = class151.field2279;

    @ObfuscatedName("di.bu")
    public static int[] field301 = new int[1000];

    @ObfuscatedName("di.bp")
    public static int[] field342 = class151.field2284;

    @ObfuscatedName("di.bl")
    public static int field338 = 0;

    @ObfuscatedName("di.bm")
    public static int[] field340 = class151.field2286;

    @ObfuscatedName("di.bf")
    public static int field335 = 0;

    @ObfuscatedName("di.bg")
    public static int field309 = 0;

    @ObfuscatedName("di.bb")
    public static boolean field327 = false;

    @ObfuscatedName("di.bc")
    public static int[] field339 = class151.field2285;

    @ObfuscatedName("di.az")
    public static int[] field323 = new int[12];

    @ObfuscatedName("di.ay")
    public static int[] field314 = new int[4096];

    @ObfuscatedName("di.at")
    public int field295;

    @ObfuscatedName("di.as")
    public static int[] field315 = new int[4096];

    @ObfuscatedName("di.ar")
    public static int[] field322 = new int[4096];

    @ObfuscatedName("di.aq")
    public static boolean[] field331 = new boolean[4096];

    @ObfuscatedName("di.ax")
    public int field334;

    @ObfuscatedName("di.aw")
    public static int[] field328 = new int[10];

    @ObfuscatedName("di.av")
    public static int[][] field324 = new int[12][2000];

    @ObfuscatedName("di.au")
    public int field283;

    @ObfuscatedName("di.ak")
    public static int[] field291 = new int[12];

    @ObfuscatedName("di.al")
    public static int[][] field312 = new int[1600][512];

    @ObfuscatedName("di.ai")
    public static boolean[] field332 = new boolean[4096];

    @ObfuscatedName("di.aj")
    public static int[] field317 = new int[4096];

    @ObfuscatedName("di.ao")
    public static int[] field329 = new int[10];

    @ObfuscatedName("di.ap")
    public static int[] field319 = new int[4096];

    @ObfuscatedName("di.am")
    public static int[] field326 = new int[2000];

    @ObfuscatedName("di.an")
    public static int[] field321 = new int[1600];

    @ObfuscatedName("di.aa")
    public boolean field305 = false;

    @ObfuscatedName("di.ab")
    public static int[] field316 = new int[4096];

    @ObfuscatedName("di.ag")
    public int field330;

    @ObfuscatedName("di.ah")
    public int field310;

    @ObfuscatedName("di.ae")
    public static int[] field325 = new int[2000];

    @ObfuscatedName("di.af")
    public static int[] field285 = new int[10];

    @ObfuscatedName("di.j([[IIIIZI)Ldi;")
    public class41 method639(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method704();
        int var7 = arg1 - this.field334;
        int var8 = this.field334 + arg1;
        int var9 = arg3 - this.field334;
        int var10 = this.field334 + arg3;
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
        class41 var15;
        if (arg4) {
            var15 = new class41();
            var15.field308 = this.field308;
            var15.field287 = this.field287;
            var15.field299 = this.field299;
            var15.field284 = this.field284;
            var15.field286 = this.field286;
            var15.field307 = this.field307;
            var15.field289 = this.field289;
            var15.field290 = this.field290;
            var15.field304 = this.field304;
            var15.field279 = this.field279;
            var15.field293 = this.field293;
            var15.field294 = this.field294;
            var15.field336 = this.field336;
            var15.field300 = this.field300;
            var15.field318 = this.field318;
            var15.field298 = this.field298;
            var15.field292 = this.field292;
            var15.field297 = this.field297;
            var15.field302 = this.field302;
            var15.field303 = this.field303;
            var15.field337 = this.field337;
            var15.field305 = this.field305;
            var15.field341 = new int[var15.field308];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field308; var16++) {
                int var17 = this.field284[var16] + arg1;
                int var18 = this.field286[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field341[var16] = this.field341[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field308; var26++) {
                int var27 = (-this.field341[var26] << 16) / this.field2174;
                if (var27 < arg5) {
                    int var28 = this.field284[var26] + arg1;
                    int var29 = this.field286[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field341[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field341[var26];
                }
            }
        }
        var15.field295 = 0;
        return var15;
    }

    public class41(class41[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field308 = 0;
        this.field287 = 0;
        this.field299 = 0;
        this.field298 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class41 var8 = arg0[var7];
            if (var8 != null) {
                this.field308 += var8.field308;
                this.field287 += var8.field287;
                this.field299 += var8.field299;
                if (var8.field294 == null) {
                    if (this.field298 == -1) {
                        this.field298 = var8.field298;
                    }
                    if (this.field298 != var8.field298) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field336 != null;
                var5 |= var8.field318 != null;
                var6 |= var8.field300 != null;
            }
        }
        this.field284 = new int[this.field308];
        this.field341 = new int[this.field308];
        this.field286 = new int[this.field308];
        this.field307 = new int[this.field287];
        this.field289 = new int[this.field287];
        this.field290 = new int[this.field287];
        this.field304 = new int[this.field287];
        this.field279 = new int[this.field287];
        this.field293 = new int[this.field287];
        if (var3) {
            this.field294 = new byte[this.field287];
        }
        if (var4) {
            this.field336 = new byte[this.field287];
        }
        if (var5) {
            this.field318 = new short[this.field287];
        }
        if (var6) {
            this.field300 = new byte[this.field287];
        }
        if (this.field299 > 0) {
            this.field292 = new int[this.field299];
            this.field297 = new int[this.field299];
            this.field302 = new int[this.field299];
        }
        this.field308 = 0;
        this.field287 = 0;
        this.field299 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class41 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field287; var11++) {
                    this.field307[this.field287] = var10.field307[var11] + this.field308;
                    this.field289[this.field287] = var10.field289[var11] + this.field308;
                    this.field290[this.field287] = var10.field290[var11] + this.field308;
                    this.field304[this.field287] = var10.field304[var11];
                    this.field279[this.field287] = var10.field279[var11];
                    this.field293[this.field287] = var10.field293[var11];
                    if (var3) {
                        if (var10.field294 == null) {
                            this.field294[this.field287] = var10.field298;
                        } else {
                            this.field294[this.field287] = var10.field294[var11];
                        }
                    }
                    if (var4 && var10.field336 != null) {
                        this.field336[this.field287] = var10.field336[var11];
                    }
                    if (var5) {
                        if (var10.field318 == null) {
                            this.field318[this.field287] = -1;
                        } else {
                            this.field318[this.field287] = var10.field318[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field300 == null || var10.field300[var11] == -1) {
                            this.field300[this.field287] = -1;
                        } else {
                            this.field300[this.field287] = (byte) (var10.field300[var11] + this.field299);
                        }
                    }
                    this.field287++;
                }
                for (int var12 = 0; var12 < var10.field299; var12++) {
                    this.field292[this.field299] = var10.field292[var12] + this.field308;
                    this.field297[this.field299] = var10.field297[var12] + this.field308;
                    this.field302[this.field299] = var10.field302[var12] + this.field308;
                    this.field299++;
                }
                for (int var13 = 0; var13 < var10.field308; var13++) {
                    this.field284[this.field308] = var10.field284[var13];
                    this.field341[this.field308] = var10.field341[var13];
                    this.field286[this.field308] = var10.field286[var13];
                    this.field308++;
                }
            }
        }
    }

    @ObfuscatedName("di.o(Z)Ldi;")
    public class41 method641(boolean arg0) {
        if (!arg0 && field280.length < this.field287) {
            field280 = new byte[this.field287 + 100];
        }
        return this.method643(arg0, field296, field280);
    }

    @ObfuscatedName("di.v()V")
    public void method642() {
        for (int var1 = 0; var1 < this.field308; var1++) {
            this.field284[var1] = -this.field284[var1];
            this.field286[var1] = -this.field286[var1];
        }
        this.field295 = 0;
    }

    @ObfuscatedName("di.h(ZLdi;[B)Ldi;")
    public class41 method643(boolean arg0, class41 arg1, byte[] arg2) {
        arg1.field308 = this.field308;
        arg1.field287 = this.field287;
        arg1.field299 = this.field299;
        if (arg1.field284 == null || arg1.field284.length < this.field308) {
            arg1.field284 = new int[this.field308 + 100];
            arg1.field341 = new int[this.field308 + 100];
            arg1.field286 = new int[this.field308 + 100];
        }
        for (int var4 = 0; var4 < this.field308; var4++) {
            arg1.field284[var4] = this.field284[var4];
            arg1.field341[var4] = this.field341[var4];
            arg1.field286[var4] = this.field286[var4];
        }
        if (arg0) {
            arg1.field336 = this.field336;
        } else {
            arg1.field336 = arg2;
            if (this.field336 == null) {
                for (int var5 = 0; var5 < this.field287; var5++) {
                    arg1.field336[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field287; var6++) {
                    arg1.field336[var6] = this.field336[var6];
                }
            }
        }
        arg1.field307 = this.field307;
        arg1.field289 = this.field289;
        arg1.field290 = this.field290;
        arg1.field304 = this.field304;
        arg1.field279 = this.field279;
        arg1.field293 = this.field293;
        arg1.field294 = this.field294;
        arg1.field300 = this.field300;
        arg1.field318 = this.field318;
        arg1.field298 = this.field298;
        arg1.field292 = this.field292;
        arg1.field297 = this.field297;
        arg1.field302 = this.field302;
        arg1.field303 = this.field303;
        arg1.field337 = this.field337;
        arg1.field305 = this.field305;
        arg1.field295 = 0;
        return arg1;
    }

    @ObfuscatedName("di.aa(I)V")
    public final void method644(int arg0) {
        int var2 = Statics.field2272;
        int var3 = Statics.field2273;
        int var4 = 0;
        int var5 = this.field307[arg0];
        int var6 = this.field289[arg0];
        int var7 = this.field290[arg0];
        int var8 = field319[var5];
        int var9 = field319[var6];
        int var10 = field319[var7];
        if (this.field336 == null) {
            class151.field2262 = 0;
        } else {
            class151.field2262 = this.field336[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field328[var4] = field314[var5];
            field329[var4] = field315[var5];
            field285[var4++] = this.field304[arg0];
        } else {
            int var11 = field317[var5];
            int var12 = field322[var5];
            int var13 = this.field304[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field342[var10 - var8];
                field328[var4] = (((field317[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field329[var4] = (((field322[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field285[var4++] = ((this.field293[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field342[var9 - var8];
                field328[var4] = (((field317[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field329[var4] = (((field322[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field285[var4++] = ((this.field279[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field328[var4] = field314[var6];
            field329[var4] = field315[var6];
            field285[var4++] = this.field279[arg0];
        } else {
            int var16 = field317[var6];
            int var17 = field322[var6];
            int var18 = this.field279[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field342[var8 - var9];
                field328[var4] = (((field317[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field329[var4] = (((field322[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field285[var4++] = ((this.field304[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field342[var10 - var9];
                field328[var4] = (((field317[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field329[var4] = (((field322[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field285[var4++] = ((this.field293[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field328[var4] = field314[var7];
            field329[var4] = field315[var7];
            field285[var4++] = this.field293[arg0];
        } else {
            int var21 = field317[var7];
            int var22 = field322[var7];
            int var23 = this.field293[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field342[var9 - var10];
                field328[var4] = (((field317[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field329[var4] = (((field322[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field285[var4++] = ((this.field279[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field342[var8 - var10];
                field328[var4] = (((field317[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field329[var4] = (((field322[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field285[var4++] = ((this.field304[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field328[0];
        int var27 = field328[1];
        int var28 = field328[2];
        int var29 = field329[0];
        int var30 = field329[1];
        int var31 = field329[2];
        class151.field2281 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2263 || var27 > Statics.field2263 || var28 > Statics.field2263) {
                class151.field2281 = true;
            }
            if (this.field318 != null && this.field318[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field300 == null || this.field300[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field300[arg0] & 0xFF;
                    var33 = this.field292[var32];
                    var34 = this.field297[var32];
                    var35 = this.field302[var32];
                }
                if (this.field293[arg0] == -1) {
                    class151.method2811(var29, var30, var31, var26, var27, var28, this.field304[arg0], this.field304[arg0], this.field304[arg0], field317[var33], field317[var34], field317[var35], field322[var33], field322[var34], field322[var35], field319[var33], field319[var34], field319[var35], this.field318[arg0]);
                } else {
                    class151.method2811(var29, var30, var31, var26, var27, var28, field285[0], field285[1], field285[2], field317[var33], field317[var34], field317[var35], field322[var33], field322[var34], field322[var35], field319[var33], field319[var34], field319[var35], this.field318[arg0]);
                }
            } else if (this.field293[arg0] == -1) {
                class151.method2797(var29, var30, var31, var26, var27, var28, field313[this.field304[arg0]]);
            } else {
                class151.method2800(var29, var30, var31, var26, var27, var28, field285[0], field285[1], field285[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2263 || var27 > Statics.field2263 || var28 > Statics.field2263 || field328[3] < 0 || field328[3] > Statics.field2263) {
            class151.field2281 = true;
        }
        if (this.field318 != null && this.field318[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field300 == null || this.field300[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field300[arg0] & 0xFF;
                var37 = this.field292[var36];
                var38 = this.field297[var36];
                var39 = this.field302[var36];
            }
            short var40 = this.field318[arg0];
            if (this.field293[arg0] == -1) {
                class151.method2811(var29, var30, var31, var26, var27, var28, this.field304[arg0], this.field304[arg0], this.field304[arg0], field317[var37], field317[var38], field317[var39], field322[var37], field322[var38], field322[var39], field319[var37], field319[var38], field319[var39], var40);
                class151.method2811(var29, var31, field329[3], var26, var28, field328[3], this.field304[arg0], this.field304[arg0], this.field304[arg0], field317[var37], field317[var38], field317[var39], field322[var37], field322[var38], field322[var39], field319[var37], field319[var38], field319[var39], var40);
            } else {
                class151.method2811(var29, var30, var31, var26, var27, var28, field285[0], field285[1], field285[2], field317[var37], field317[var38], field317[var39], field322[var37], field322[var38], field322[var39], field319[var37], field319[var38], field319[var39], var40);
                class151.method2811(var29, var31, field329[3], var26, var28, field328[3], field285[0], field285[2], field285[3], field317[var37], field317[var38], field317[var39], field322[var37], field322[var38], field322[var39], field319[var37], field319[var38], field319[var39], var40);
            }
        } else if (this.field293[arg0] == -1) {
            int var41 = field313[this.field304[arg0]];
            class151.method2797(var29, var30, var31, var26, var27, var28, var41);
            class151.method2797(var29, var31, field329[3], var26, var28, field328[3], var41);
        } else {
            class151.method2800(var29, var30, var31, var26, var27, var28, field285[0], field285[1], field285[2]);
            class151.method2800(var29, var31, field329[3], var26, var28, field328[3], field285[0], field285[2], field285[3]);
        }
    }

    @ObfuscatedName("di.g()I")
    public int method646() {
        this.method704();
        return this.field334;
    }

    @ObfuscatedName("di.w(Ldj;I)V")
    public void method647(class44 arg0, int arg1) {
        if (this.field303 == null || arg1 == -1) {
            return;
        }
        class154 var3 = arg0.field363[arg1];
        class47 var4 = var3.field2330;
        Statics.field288 = 0;
        Statics.field306 = 0;
        Statics.field333 = 0;
        for (int var5 = 0; var5 < var3.field2331; var5++) {
            int var6 = var3.field2332[var5];
            this.method649(var4.field378[var6], var4.field379[var6], var3.field2334[var5], var3.field2336[var5], var3.field2335[var5]);
        }
        this.field295 = 0;
    }

    @ObfuscatedName("di.i(Ldj;ILdj;I[I)V")
    public void method648(class44 arg0, int arg1, class44 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method647(arg0, arg1);
            return;
        }
        class154 var6 = arg0.field363[arg1];
        class154 var7 = arg2.field363[arg3];
        class47 var8 = var6.field2330;
        Statics.field288 = 0;
        Statics.field306 = 0;
        Statics.field333 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2331; var11++) {
            int var12 = var6.field2332[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field378[var12] == 0) {
                this.method649(var8.field378[var12], var8.field379[var12], var6.field2334[var11], var6.field2336[var11], var6.field2335[var11]);
            }
        }
        Statics.field288 = 0;
        Statics.field306 = 0;
        Statics.field333 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2331; var15++) {
            int var16 = var7.field2332[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field378[var16] == 0) {
                this.method649(var8.field378[var16], var8.field379[var16], var7.field2334[var15], var7.field2336[var15], var7.field2335[var15]);
            }
        }
        this.field295 = 0;
    }

    @ObfuscatedName("di.s(I[IIII)V")
    public void method649(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field288 = 0;
            Statics.field306 = 0;
            Statics.field333 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field303.length) {
                    int[] var10 = this.field303[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field288 += this.field284[var12];
                        Statics.field306 += this.field341[var12];
                        Statics.field333 += this.field286[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field288 = Statics.field288 / var7 + arg2;
                Statics.field306 = Statics.field306 / var7 + arg3;
                Statics.field333 = Statics.field333 / var7 + arg4;
            } else {
                Statics.field288 = arg2;
                Statics.field306 = arg3;
                Statics.field333 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field303.length) {
                    int[] var15 = this.field303[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field284[var17] += arg2;
                        this.field341[var17] += arg3;
                        this.field286[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field303.length) {
                    int[] var20 = this.field303[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field284[var22] -= Statics.field288;
                        this.field341[var22] -= Statics.field306;
                        this.field286[var22] -= Statics.field333;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field339[var25];
                            int var27 = field340[var25];
                            int var28 = this.field341[var22] * var26 + this.field284[var22] * var27 >> 16;
                            this.field341[var22] = this.field341[var22] * var27 - this.field284[var22] * var26 >> 16;
                            this.field284[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field339[var23];
                            int var30 = field340[var23];
                            int var31 = this.field341[var22] * var30 - this.field286[var22] * var29 >> 16;
                            this.field286[var22] = this.field341[var22] * var29 + this.field286[var22] * var30 >> 16;
                            this.field341[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field339[var24];
                            int var33 = field340[var24];
                            int var34 = this.field286[var22] * var32 + this.field284[var22] * var33 >> 16;
                            this.field286[var22] = this.field286[var22] * var33 - this.field284[var22] * var32 >> 16;
                            this.field284[var22] = var34;
                        }
                        this.field284[var22] += Statics.field288;
                        this.field341[var22] += Statics.field306;
                        this.field286[var22] += Statics.field333;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field303.length) {
                    int[] var37 = this.field303[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field284[var39] -= Statics.field288;
                        this.field341[var39] -= Statics.field306;
                        this.field286[var39] -= Statics.field333;
                        this.field284[var39] = this.field284[var39] * arg2 / 128;
                        this.field341[var39] = this.field341[var39] * arg3 / 128;
                        this.field286[var39] = this.field286[var39] * arg4 / 128;
                        this.field284[var39] += Statics.field288;
                        this.field341[var39] += Statics.field306;
                        this.field286[var39] += Statics.field333;
                    }
                }
            }
        } else if (arg0 == 5 && this.field337 != null && this.field336 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field337.length) {
                    int[] var42 = this.field337[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field336[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field336[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("di.c()V")
    public void method652() {
        for (int var1 = 0; var1 < this.field308; var1++) {
            int var2 = this.field286[var1];
            this.field286[var1] = this.field284[var1];
            this.field284[var1] = -var2;
        }
        this.field295 = 0;
    }

    @ObfuscatedName("di.u(I)V")
    public void method653(int arg0) {
        int var2 = field339[arg0];
        int var3 = field340[arg0];
        for (int var4 = 0; var4 < this.field308; var4++) {
            int var5 = this.field341[var4] * var3 - this.field286[var4] * var2 >> 16;
            this.field286[var4] = this.field341[var4] * var2 + this.field286[var4] * var3 >> 16;
            this.field341[var4] = var5;
        }
        this.field295 = 0;
    }

    @ObfuscatedName("di.t(Z)Ldi;")
    public class41 method654(boolean arg0) {
        if (!arg0 && field282.length < this.field287) {
            field282 = new byte[this.field287 + 100];
        }
        return this.method643(arg0, field281, field282);
    }

    @ObfuscatedName("di.k(IIIIIII)V")
    public final void method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field321[0] = -1;
        if (this.field295 != 2 && this.field295 != 1) {
            this.method667();
        }
        int var8 = Statics.field2272;
        int var9 = Statics.field2273;
        int var10 = field339[arg0];
        int var11 = field340[arg0];
        int var12 = field339[arg1];
        int var13 = field340[arg1];
        int var14 = field339[arg2];
        int var15 = field340[arg2];
        int var16 = field339[arg3];
        int var17 = field340[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field308; var19++) {
            int var20 = this.field284[var19];
            int var21 = this.field341[var19];
            int var22 = this.field286[var19];
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
            field316[var19] = var30 - var18;
            field314[var19] = (var26 << 9) / var30 + var8;
            field315[var19] = (var29 << 9) / var30 + var9;
            if (this.field299 > 0) {
                field317[var19] = var26;
                field322[var19] = var29;
                field319[var19] = var30;
            }
        }
        try {
            this.method659(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("di.q(IIIIIIII)V")
    public final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field321[0] = -1;
        if (this.field295 != 2 && this.field295 != 1) {
            this.method667();
        }
        int var9 = Statics.field2272;
        int var10 = Statics.field2273;
        int var11 = field339[arg0];
        int var12 = field340[arg0];
        int var13 = field339[arg1];
        int var14 = field340[arg1];
        int var15 = field339[arg2];
        int var16 = field340[arg2];
        int var17 = field339[arg3];
        int var18 = field340[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field308; var20++) {
            int var21 = this.field284[var20];
            int var22 = this.field341[var20];
            int var23 = this.field286[var20];
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
            field316[var20] = var31 - var19;
            field314[var20] = (var27 << 9) / arg7 + var9;
            field315[var20] = (var30 << 9) / arg7 + var10;
            if (this.field299 > 0) {
                field317[var20] = var27;
                field322[var20] = var30;
                field319[var20] = var31;
            }
        }
        try {
            this.method659(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("di.au(IIIIIIIII)V")
    public void method658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field321[0] = -1;
        if (this.field295 != 1) {
            this.method704();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field334 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field334 << 9;
        if (var15 / var13 >= Statics.field2277) {
            return;
        }
        int var16 = this.field334 + var14 << 9;
        if (var16 / var13 <= Statics.field2283) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field334 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field2278) {
            return;
        }
        int var20 = (this.field2174 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field2264) {
            return;
        }
        int var22 = (this.field2174 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field299 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field327) {
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
            int var32 = field335 - Statics.field2272;
            int var33 = field309 - Statics.field2273;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field305) {
                    field301[field338++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field2272;
        int var35 = Statics.field2273;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field339[arg0];
            var37 = field340[arg0];
        }
        for (int var38 = 0; var38 < this.field308; var38++) {
            int var39 = this.field284[var38];
            int var40 = this.field341[var38];
            int var41 = this.field286[var38];
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
            field316[var38] = var50 - var11;
            if (var50 >= 50) {
                field314[var38] = (var46 << 9) / var50 + var34;
                field315[var38] = (var49 << 9) / var50 + var35;
            } else {
                field314[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field317[var38] = var46;
                field322[var38] = var49;
                field319[var38] = var50;
            }
        }
        try {
            this.method659(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("di.d(ZZI)V")
    public final void method659(boolean arg0, boolean arg1, int arg2) {
        if (this.field330 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field330; var4++) {
            field321[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field287; var5++) {
            if (this.field293[var5] != -2) {
                int var6 = this.field307[var5];
                int var7 = this.field289[var5];
                int var8 = this.field290[var5];
                int var9 = field314[var6];
                int var10 = field314[var7];
                int var11 = field314[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field317[var6];
                    int var13 = field317[var7];
                    int var14 = field317[var8];
                    int var15 = field322[var6];
                    int var16 = field322[var7];
                    int var17 = field322[var8];
                    int var18 = field319[var6];
                    int var19 = field319[var7];
                    int var20 = field319[var8];
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
                        field332[var5] = true;
                        int var30 = (field316[var6] + field316[var7] + field316[var8]) / 3 + this.field310;
                        field312[var30][field321[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method661(field335, field309, field315[var6], field315[var7], field315[var8], var9, var10, var11)) {
                        field301[field338++] = arg2;
                        arg1 = false;
                    }
                    if ((field315[var8] - field315[var7]) * (var9 - var10) - (field315[var6] - field315[var7]) * (var11 - var10) > 0) {
                        field332[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field2263 && var10 <= Statics.field2263 && var11 <= Statics.field2263) {
                            field331[var5] = false;
                        } else {
                            field331[var5] = true;
                        }
                        int var31 = (field316[var6] + field316[var7] + field316[var8]) / 3 + this.field310;
                        field312[var31][field321[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field294 == null) {
            for (int var32 = this.field330 - 1; var32 >= 0; var32--) {
                int var33 = field321[var32];
                if (var33 > 0) {
                    int[] var34 = field312[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method660(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field323[var36] = 0;
            field291[var36] = 0;
        }
        for (int var37 = this.field330 - 1; var37 >= 0; var37--) {
            int var38 = field321[var37];
            if (var38 > 0) {
                int[] var39 = field312[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field294[var41];
                    int var43 = field323[var42]++;
                    field324[var42][var43] = var41;
                    if (var42 < 10) {
                        field291[var42] += var37;
                    } else if (var42 == 10) {
                        field325[var43] = var37;
                    } else {
                        field326[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field323[1] > 0 || field323[2] > 0) {
            var44 = (field291[1] + field291[2]) / (field323[1] + field323[2]);
        }
        int var45 = 0;
        if (field323[3] > 0 || field323[4] > 0) {
            var45 = (field291[3] + field291[4]) / (field323[3] + field323[4]);
        }
        int var46 = 0;
        if (field323[6] > 0 || field323[8] > 0) {
            var46 = (field291[6] + field291[8]) / (field323[6] + field323[8]);
        }
        int var47 = 0;
        int var48 = field323[10];
        int[] var49 = field324[10];
        int[] var50 = field325;
        if (var47 == var48) {
            var47 = 0;
            var48 = field323[11];
            var49 = field324[11];
            var50 = field326;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method660(var49[var47++]);
                if (var47 == var48 && field324[11] != var49) {
                    var47 = 0;
                    var48 = field323[11];
                    var49 = field324[11];
                    var50 = field326;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method660(var49[var47++]);
                if (var47 == var48 && field324[11] != var49) {
                    var47 = 0;
                    var48 = field323[11];
                    var49 = field324[11];
                    var50 = field326;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method660(var49[var47++]);
                if (var47 == var48 && field324[11] != var49) {
                    var47 = 0;
                    var48 = field323[11];
                    var49 = field324[11];
                    var50 = field326;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field323[var52];
            int[] var54 = field324[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method660(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method660(var49[var47++]);
            if (var47 == var48 && field324[11] != var49) {
                var47 = 0;
                var49 = field324[11];
                var48 = field323[11];
                var50 = field326;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("di.a(I)V")
    public final void method660(int arg0) {
        if (field332[arg0]) {
            this.method644(arg0);
            return;
        }
        int var2 = this.field307[arg0];
        int var3 = this.field289[arg0];
        int var4 = this.field290[arg0];
        class151.field2281 = field331[arg0];
        if (this.field336 == null) {
            class151.field2262 = 0;
        } else {
            class151.field2262 = this.field336[arg0] & 0xFF;
        }
        if (this.field318 != null && this.field318[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field300 == null || this.field300[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field300[arg0] & 0xFF;
                var6 = this.field292[var5];
                var7 = this.field297[var5];
                var8 = this.field302[var5];
            }
            if (this.field293[arg0] == -1) {
                class151.method2811(field315[var2], field315[var3], field315[var4], field314[var2], field314[var3], field314[var4], this.field304[arg0], this.field304[arg0], this.field304[arg0], field317[var6], field317[var7], field317[var8], field322[var6], field322[var7], field322[var8], field319[var6], field319[var7], field319[var8], this.field318[arg0]);
            } else {
                class151.method2811(field315[var2], field315[var3], field315[var4], field314[var2], field314[var3], field314[var4], this.field304[arg0], this.field279[arg0], this.field293[arg0], field317[var6], field317[var7], field317[var8], field322[var6], field322[var7], field322[var8], field319[var6], field319[var7], field319[var8], this.field318[arg0]);
            }
        } else if (this.field293[arg0] == -1) {
            class151.method2797(field315[var2], field315[var3], field315[var4], field314[var2], field314[var3], field314[var4], field313[this.field304[arg0]]);
        } else {
            class151.method2800(field315[var2], field315[var3], field315[var4], field314[var2], field314[var3], field314[var4], this.field304[arg0], this.field279[arg0], this.field293[arg0]);
        }
    }

    @ObfuscatedName("di.at(IIIIIIII)Z")
    public final boolean method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @ObfuscatedName("di.n()V")
    public void method667() {
        if (this.field295 == 2) {
            return;
        }
        this.field295 = 2;
        this.field334 = 0;
        for (int var1 = 0; var1 < this.field308; var1++) {
            int var2 = this.field284[var1];
            int var3 = this.field341[var1];
            int var4 = this.field286[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field334) {
                this.field334 = var5;
            }
        }
        this.field334 = (int) (Math.sqrt((double) this.field334) + 0.99D);
        this.field310 = this.field334;
        this.field330 = this.field334 + this.field334;
    }

    @ObfuscatedName("di.y(III)V")
    public void method674(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field308; var4++) {
            this.field284[var4] += arg0;
            this.field341[var4] += arg1;
            this.field286[var4] += arg2;
        }
        this.field295 = 0;
    }

    @ObfuscatedName("di.m()V")
    public void method683() {
        for (int var1 = 0; var1 < this.field308; var1++) {
            int var2 = this.field284[var1];
            this.field284[var1] = this.field286[var1];
            this.field286[var1] = -var2;
        }
        this.field295 = 0;
    }

    @ObfuscatedName("di.b(III)V")
    public void method702(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field308; var4++) {
            this.field284[var4] = this.field284[var4] * arg0 / 128;
            this.field341[var4] = this.field341[var4] * arg1 / 128;
            this.field286[var4] = this.field286[var4] * arg2 / 128;
        }
        this.field295 = 0;
    }

    @ObfuscatedName("di.r()V")
    public void method704() {
        if (this.field295 == 1) {
            return;
        }
        this.field295 = 1;
        this.field2174 = 0;
        this.field283 = 0;
        this.field334 = 0;
        for (int var1 = 0; var1 < this.field308; var1++) {
            int var2 = this.field284[var1];
            int var3 = this.field341[var1];
            int var4 = this.field286[var1];
            if (-var3 > this.field2174) {
                this.field2174 = -var3;
            }
            if (var3 > this.field283) {
                this.field283 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field334) {
                this.field334 = var5;
            }
        }
        this.field334 = (int) (Math.sqrt((double) this.field334) + 0.99D);
        this.field310 = (int) (Math.sqrt((double) (this.field2174 * this.field2174 + this.field334 * this.field334)) + 0.99D);
        this.field330 = this.field310 + (int) (Math.sqrt((double) (this.field334 * this.field334 + this.field283 * this.field283)) + 0.99D);
    }

    public class41() {
    }
}
