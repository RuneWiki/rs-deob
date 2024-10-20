package deob;

@ObfuscatedName("du")
public class class27 extends class145 {

    @ObfuscatedName("du.f")
    public int[] field290;

    @ObfuscatedName("du.g")
    public int[] field327;

    @ObfuscatedName("du.d")
    public int[] field270;

    @ObfuscatedName("du.e")
    public int[] field278;

    @ObfuscatedName("du.b")
    public static class27 field289 = new class27();

    @ObfuscatedName("du.c")
    public int[][] field299;

    @ObfuscatedName("du.a")
    public int[] field286;

    @ObfuscatedName("du.n")
    public short[] field283;

    @ObfuscatedName("du.o")
    public int[] field314;

    @ObfuscatedName("du.l")
    public int[] field271;

    @ObfuscatedName("du.m")
    public int[] field288;

    @ObfuscatedName("du.j")
    public int[] field274;

    @ObfuscatedName("du.k")
    public static class27 field305 = new class27();

    @ObfuscatedName("du.h")
    public static byte[] field321 = new byte[1];

    @ObfuscatedName("du.i")
    public byte[] field281;

    @ObfuscatedName("du.w")
    public static byte[] field268 = new byte[1];

    @ObfuscatedName("du.v")
    public int[][] field323;

    @ObfuscatedName("du.u")
    public byte field267 = 0;

    @ObfuscatedName("du.t")
    public int field269 = 0;

    @ObfuscatedName("du.s")
    public int field273 = 0;

    @ObfuscatedName("du.r")
    public byte[] field282;

    @ObfuscatedName("du.q")
    public int[] field279;

    @ObfuscatedName("du.p")
    public int[] field287;

    @ObfuscatedName("du.z")
    public byte[] field280;

    @ObfuscatedName("du.y")
    public int field312 = 0;

    @ObfuscatedName("du.x")
    public int[] field272;

    @ObfuscatedName("du.by")
    public static int[] field266 = class153.field2293;

    @ObfuscatedName("du.bn")
    public static int field322 = 0;

    @ObfuscatedName("du.bo")
    public static int field318 = 0;

    @ObfuscatedName("du.bq")
    public static int[] field320 = class153.field2294;

    @ObfuscatedName("du.bk")
    public static int[] field304 = new int[1000];

    @ObfuscatedName("du.bm")
    public static boolean field328 = false;

    @ObfuscatedName("du.bi")
    public static int[] field326 = class153.field2299;

    @ObfuscatedName("du.be")
    public static int field265 = 0;

    @ObfuscatedName("du.az")
    public static int[] field315 = new int[10];

    @ObfuscatedName("du.ay")
    public static int[] field311 = new int[2000];

    @ObfuscatedName("du.ba")
    public static int[] field285 = class153.field2297;

    @ObfuscatedName("du.at")
    public static int[][] field310 = new int[12][2000];

    @ObfuscatedName("du.as")
    public static int[] field301 = new int[4096];

    @ObfuscatedName("du.aq")
    public int field294;

    @ObfuscatedName("du.ax")
    public int field292;

    @ObfuscatedName("du.aw")
    public int field307;

    @ObfuscatedName("du.av")
    public static int[] field275 = new int[4096];

    @ObfuscatedName("du.au")
    public static int[] field284 = new int[4096];

    @ObfuscatedName("du.ak")
    public int field295;

    @ObfuscatedName("du.al")
    public static int[] field303 = new int[1600];

    @ObfuscatedName("du.ai")
    public static boolean[] field298 = new boolean[4096];

    @ObfuscatedName("du.aj")
    public static int[] field302 = new int[10];

    @ObfuscatedName("du.ap")
    public static int[] field324 = new int[4096];

    @ObfuscatedName("du.am")
    public static int[] field276 = new int[4096];

    @ObfuscatedName("du.an")
    public static int[][] field308 = new int[1600][512];

    @ObfuscatedName("du.ac")
    public boolean field291 = false;

    @ObfuscatedName("du.ad")
    public static int[] field300 = new int[4096];

    @ObfuscatedName("du.aa")
    public static int[] field309 = new int[12];

    @ObfuscatedName("du.ab")
    public int field296;

    @ObfuscatedName("du.ag")
    public static int[] field325 = new int[2000];

    @ObfuscatedName("du.ah")
    public static boolean[] field306 = new boolean[4096];

    @ObfuscatedName("du.ae")
    public static int[] field316 = new int[10];

    @ObfuscatedName("du.af")
    public static int[] field313 = new int[12];

    @ObfuscatedName("du.b([[IIIIZI)Ldu;")
    public class27 method385(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method389();
        int var7 = arg1 - this.field294;
        int var8 = this.field294 + arg1;
        int var9 = arg3 - this.field294;
        int var10 = this.field294 + arg3;
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
        class27 var15;
        if (arg4) {
            var15 = new class27();
            var15.field269 = this.field269;
            var15.field273 = this.field273;
            var15.field312 = this.field312;
            var15.field270 = this.field270;
            var15.field290 = this.field290;
            var15.field274 = this.field274;
            var15.field272 = this.field272;
            var15.field327 = this.field327;
            var15.field314 = this.field314;
            var15.field278 = this.field278;
            var15.field279 = this.field279;
            var15.field280 = this.field280;
            var15.field281 = this.field281;
            var15.field282 = this.field282;
            var15.field283 = this.field283;
            var15.field267 = this.field267;
            var15.field286 = this.field286;
            var15.field287 = this.field287;
            var15.field288 = this.field288;
            var15.field299 = this.field299;
            var15.field323 = this.field323;
            var15.field291 = this.field291;
            var15.field271 = new int[var15.field269];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field269; var16++) {
                int var17 = this.field270[var16] + arg1;
                int var18 = this.field290[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field271[var16] = this.field271[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field269; var26++) {
                int var27 = (-this.field271[var26] << 16) / this.field2207;
                if (var27 < arg5) {
                    int var28 = this.field270[var26] + arg1;
                    int var29 = this.field290[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field271[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field271[var26];
                }
            }
        }
        var15.field292 = 0;
        return var15;
    }

    @ObfuscatedName("du.k(Z)Ldu;")
    public class27 method386(boolean arg0) {
        if (!arg0 && field321.length < this.field273) {
            field321 = new byte[this.field273 + 100];
        }
        return this.method388(arg0, field289, field321);
    }

    @ObfuscatedName("du.u(IIIIIII)V")
    public final void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field303[0] = -1;
        if (this.field292 != 2 && this.field292 != 1) {
            this.method390();
        }
        int var8 = Statics.field2285;
        int var9 = Statics.field2286;
        int var10 = field266[arg0];
        int var11 = field326[arg0];
        int var12 = field266[arg1];
        int var13 = field326[arg1];
        int var14 = field266[arg2];
        int var15 = field326[arg2];
        int var16 = field266[arg3];
        int var17 = field326[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field269; var19++) {
            int var20 = this.field270[var19];
            int var21 = this.field271[var19];
            int var22 = this.field290[var19];
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
            field275[var19] = var30 - var18;
            field300[var19] = (var26 << 9) / var30 + var8;
            field301[var19] = (var29 << 9) / var30 + var9;
            if (this.field312 > 0) {
                field284[var19] = var26;
                field324[var19] = var29;
                field276[var19] = var30;
            }
        }
        try {
            this.method412(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("du.l(ZLdu;[B)Ldu;")
    public class27 method388(boolean arg0, class27 arg1, byte[] arg2) {
        arg1.field269 = this.field269;
        arg1.field273 = this.field273;
        arg1.field312 = this.field312;
        if (arg1.field270 == null || arg1.field270.length < this.field269) {
            arg1.field270 = new int[this.field269 + 100];
            arg1.field271 = new int[this.field269 + 100];
            arg1.field290 = new int[this.field269 + 100];
        }
        for (int var4 = 0; var4 < this.field269; var4++) {
            arg1.field270[var4] = this.field270[var4];
            arg1.field271[var4] = this.field271[var4];
            arg1.field290[var4] = this.field290[var4];
        }
        if (arg0) {
            arg1.field281 = this.field281;
        } else {
            arg1.field281 = arg2;
            if (this.field281 == null) {
                for (int var5 = 0; var5 < this.field273; var5++) {
                    arg1.field281[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field273; var6++) {
                    arg1.field281[var6] = this.field281[var6];
                }
            }
        }
        arg1.field274 = this.field274;
        arg1.field272 = this.field272;
        arg1.field327 = this.field327;
        arg1.field314 = this.field314;
        arg1.field278 = this.field278;
        arg1.field279 = this.field279;
        arg1.field280 = this.field280;
        arg1.field282 = this.field282;
        arg1.field283 = this.field283;
        arg1.field267 = this.field267;
        arg1.field286 = this.field286;
        arg1.field287 = this.field287;
        arg1.field288 = this.field288;
        arg1.field299 = this.field299;
        arg1.field323 = this.field323;
        arg1.field291 = this.field291;
        arg1.field292 = 0;
        return arg1;
    }

    @ObfuscatedName("du.f()V")
    public void method389() {
        if (this.field292 == 1) {
            return;
        }
        this.field292 = 1;
        this.field2207 = 0;
        this.field307 = 0;
        this.field294 = 0;
        for (int var1 = 0; var1 < this.field269; var1++) {
            int var2 = this.field270[var1];
            int var3 = this.field271[var1];
            int var4 = this.field290[var1];
            if (-var3 > this.field2207) {
                this.field2207 = -var3;
            }
            if (var3 > this.field307) {
                this.field307 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field294) {
                this.field294 = var5;
            }
        }
        this.field294 = (int) (Math.sqrt((double) this.field294) + 0.99D);
        this.field296 = (int) (Math.sqrt((double) (this.field2207 * this.field2207 + this.field294 * this.field294)) + 0.99D);
        this.field295 = this.field296 + (int) (Math.sqrt((double) (this.field307 * this.field307 + this.field294 * this.field294)) + 0.99D);
    }

    @ObfuscatedName("du.s()V")
    public void method390() {
        if (this.field292 == 2) {
            return;
        }
        this.field292 = 2;
        this.field294 = 0;
        for (int var1 = 0; var1 < this.field269; var1++) {
            int var2 = this.field270[var1];
            int var3 = this.field271[var1];
            int var4 = this.field290[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field294) {
                this.field294 = var5;
            }
        }
        this.field294 = (int) (Math.sqrt((double) this.field294) + 0.99D);
        this.field296 = this.field294;
        this.field295 = this.field294 + this.field294;
    }

    @ObfuscatedName("du.g(Ldv;ILdv;I[I)V")
    public void method393(class28 arg0, int arg1, class28 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method466(arg0, arg1);
            return;
        }
        class141 var6 = arg0.field332[arg1];
        class141 var7 = arg2.field332[arg3];
        class37 var8 = var6.field2158;
        Statics.field317 = 0;
        Statics.field277 = 0;
        Statics.field319 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2157; var11++) {
            int var12 = var6.field2155[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field455[var12] == 0) {
                this.method394(var8.field455[var12], var8.field456[var12], var6.field2160[var11], var6.field2153[var11], var6.field2161[var11]);
            }
        }
        Statics.field317 = 0;
        Statics.field277 = 0;
        Statics.field319 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2157; var15++) {
            int var16 = var7.field2155[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field455[var16] == 0) {
                this.method394(var8.field455[var16], var8.field456[var16], var7.field2160[var15], var7.field2153[var15], var7.field2161[var15]);
            }
        }
        this.field292 = 0;
    }

    @ObfuscatedName("du.o(I[IIII)V")
    public void method394(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field317 = 0;
            Statics.field277 = 0;
            Statics.field319 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field299.length) {
                    int[] var10 = this.field299[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field317 += this.field270[var12];
                        Statics.field277 += this.field271[var12];
                        Statics.field319 += this.field290[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field317 = Statics.field317 / var7 + arg2;
                Statics.field277 = Statics.field277 / var7 + arg3;
                Statics.field319 = Statics.field319 / var7 + arg4;
            } else {
                Statics.field317 = arg2;
                Statics.field277 = arg3;
                Statics.field319 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field299.length) {
                    int[] var15 = this.field299[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field270[var17] += arg2;
                        this.field271[var17] += arg3;
                        this.field290[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field299.length) {
                    int[] var20 = this.field299[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field270[var22] -= Statics.field317;
                        this.field271[var22] -= Statics.field277;
                        this.field290[var22] -= Statics.field319;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field266[var25];
                            int var27 = field326[var25];
                            int var28 = this.field271[var22] * var26 + this.field270[var22] * var27 >> 16;
                            this.field271[var22] = this.field271[var22] * var27 - this.field270[var22] * var26 >> 16;
                            this.field270[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field266[var23];
                            int var30 = field326[var23];
                            int var31 = this.field271[var22] * var30 - this.field290[var22] * var29 >> 16;
                            this.field290[var22] = this.field290[var22] * var30 + this.field271[var22] * var29 >> 16;
                            this.field271[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field266[var24];
                            int var33 = field326[var24];
                            int var34 = this.field290[var22] * var32 + this.field270[var22] * var33 >> 16;
                            this.field290[var22] = this.field290[var22] * var33 - this.field270[var22] * var32 >> 16;
                            this.field270[var22] = var34;
                        }
                        this.field270[var22] += Statics.field317;
                        this.field271[var22] += Statics.field277;
                        this.field290[var22] += Statics.field319;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field299.length) {
                    int[] var37 = this.field299[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field270[var39] -= Statics.field317;
                        this.field271[var39] -= Statics.field277;
                        this.field290[var39] -= Statics.field319;
                        this.field270[var39] = this.field270[var39] * arg2 / 128;
                        this.field271[var39] = this.field271[var39] * arg3 / 128;
                        this.field290[var39] = this.field290[var39] * arg4 / 128;
                        this.field270[var39] += Statics.field317;
                        this.field271[var39] += Statics.field277;
                        this.field290[var39] += Statics.field319;
                    }
                }
            }
        } else if (arg0 == 5 && this.field323 != null && this.field281 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field323.length) {
                    int[] var42 = this.field323[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field281[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field281[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.e()V")
    public void method395() {
        for (int var1 = 0; var1 < this.field269; var1++) {
            int var2 = this.field270[var1];
            this.field270[var1] = this.field290[var1];
            this.field290[var1] = -var2;
        }
        this.field292 = 0;
    }

    @ObfuscatedName("du.q()V")
    public void method396() {
        for (int var1 = 0; var1 < this.field269; var1++) {
            this.field270[var1] = -this.field270[var1];
            this.field290[var1] = -this.field290[var1];
        }
        this.field292 = 0;
    }

    @ObfuscatedName("du.z()V")
    public void method397() {
        for (int var1 = 0; var1 < this.field269; var1++) {
            int var2 = this.field290[var1];
            this.field290[var1] = this.field270[var1];
            this.field270[var1] = -var2;
        }
        this.field292 = 0;
    }

    @ObfuscatedName("du.i(I)V")
    public void method398(int arg0) {
        int var2 = field266[arg0];
        int var3 = field326[arg0];
        for (int var4 = 0; var4 < this.field269; var4++) {
            int var5 = this.field271[var4] * var3 - this.field290[var4] * var2 >> 16;
            this.field290[var4] = this.field290[var4] * var3 + this.field271[var4] * var2 >> 16;
            this.field271[var4] = var5;
        }
        this.field292 = 0;
    }

    @ObfuscatedName("du.n(III)V")
    public void method399(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field269; var4++) {
            this.field270[var4] = this.field270[var4] * arg0 / 128;
            this.field271[var4] = this.field271[var4] * arg1 / 128;
            this.field290[var4] = this.field290[var4] * arg2 / 128;
        }
        this.field292 = 0;
    }

    @ObfuscatedName("du.y(IIIIIIII)V")
    public final void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field303[0] = -1;
        if (this.field292 != 2 && this.field292 != 1) {
            this.method390();
        }
        int var9 = Statics.field2285;
        int var10 = Statics.field2286;
        int var11 = field266[arg0];
        int var12 = field326[arg0];
        int var13 = field266[arg1];
        int var14 = field326[arg1];
        int var15 = field266[arg2];
        int var16 = field326[arg2];
        int var17 = field266[arg3];
        int var18 = field326[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field269; var20++) {
            int var21 = this.field270[var20];
            int var22 = this.field271[var20];
            int var23 = this.field290[var20];
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
            field275[var20] = var31 - var19;
            field300[var20] = (var27 << 9) / arg7 + var9;
            field301[var20] = (var30 << 9) / arg7 + var10;
            if (this.field312 > 0) {
                field284[var20] = var27;
                field324[var20] = var30;
                field276[var20] = var31;
            }
        }
        try {
            this.method412(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("du.d(Z)Ldu;")
    public class27 method403(boolean arg0) {
        if (!arg0 && field268.length < this.field273) {
            field268 = new byte[this.field273 + 100];
        }
        return this.method388(arg0, field305, field268);
    }

    @ObfuscatedName("du.v(I)V")
    public final void method404(int arg0) {
        if (field306[arg0]) {
            this.method405(arg0);
            return;
        }
        int var2 = this.field274[arg0];
        int var3 = this.field272[arg0];
        int var4 = this.field327[arg0];
        class153.field2281 = field298[arg0];
        if (this.field281 == null) {
            class153.field2298 = 0;
        } else {
            class153.field2298 = this.field281[arg0] & 0xFF;
        }
        if (this.field283 != null && this.field283[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field282 == null || this.field282[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field282[arg0] & 0xFF;
                var6 = this.field286[var5];
                var7 = this.field287[var5];
                var8 = this.field288[var5];
            }
            if (this.field279[arg0] == -1) {
                class153.method2558(field301[var2], field301[var3], field301[var4], field300[var2], field300[var3], field300[var4], this.field314[arg0], this.field314[arg0], this.field314[arg0], field284[var6], field284[var7], field284[var8], field324[var6], field324[var7], field324[var8], field276[var6], field276[var7], field276[var8], this.field283[arg0]);
            } else {
                class153.method2558(field301[var2], field301[var3], field301[var4], field300[var2], field300[var3], field300[var4], this.field314[arg0], this.field278[arg0], this.field279[arg0], field284[var6], field284[var7], field284[var8], field324[var6], field324[var7], field324[var8], field276[var6], field276[var7], field276[var8], this.field283[arg0]);
            }
        } else if (this.field279[arg0] == -1) {
            class153.method2532(field301[var2], field301[var3], field301[var4], field300[var2], field300[var3], field300[var4], field320[this.field314[arg0]]);
        } else {
            class153.method2568(field301[var2], field301[var3], field301[var4], field300[var2], field300[var3], field300[var4], this.field314[arg0], this.field278[arg0], this.field279[arg0]);
        }
    }

    @ObfuscatedName("du.ac(I)V")
    public final void method405(int arg0) {
        int var2 = Statics.field2285;
        int var3 = Statics.field2286;
        int var4 = 0;
        int var5 = this.field274[arg0];
        int var6 = this.field272[arg0];
        int var7 = this.field327[arg0];
        int var8 = field276[var5];
        int var9 = field276[var6];
        int var10 = field276[var7];
        if (this.field281 == null) {
            class153.field2298 = 0;
        } else {
            class153.field2298 = this.field281[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field302[var4] = field300[var5];
            field315[var4] = field301[var5];
            field316[var4++] = this.field314[arg0];
        } else {
            int var11 = field284[var5];
            int var12 = field324[var5];
            int var13 = this.field314[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field285[var10 - var8];
                field302[var4] = (((field284[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field315[var4] = (((field324[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field316[var4++] = ((this.field279[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field285[var9 - var8];
                field302[var4] = (((field284[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field315[var4] = (((field324[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field316[var4++] = ((this.field278[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field302[var4] = field300[var6];
            field315[var4] = field301[var6];
            field316[var4++] = this.field278[arg0];
        } else {
            int var16 = field284[var6];
            int var17 = field324[var6];
            int var18 = this.field278[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field285[var8 - var9];
                field302[var4] = (((field284[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field315[var4] = (((field324[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field316[var4++] = ((this.field314[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field285[var10 - var9];
                field302[var4] = (((field284[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field315[var4] = (((field324[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field316[var4++] = ((this.field279[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field302[var4] = field300[var7];
            field315[var4] = field301[var7];
            field316[var4++] = this.field279[arg0];
        } else {
            int var21 = field284[var7];
            int var22 = field324[var7];
            int var23 = this.field279[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field285[var9 - var10];
                field302[var4] = (((field284[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field315[var4] = (((field324[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field316[var4++] = ((this.field278[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field285[var8 - var10];
                field302[var4] = (((field284[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field315[var4] = (((field324[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field316[var4++] = ((this.field314[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field302[0];
        int var27 = field302[1];
        int var28 = field302[2];
        int var29 = field315[0];
        int var30 = field315[1];
        int var31 = field315[2];
        class153.field2281 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2290 || var27 > Statics.field2290 || var28 > Statics.field2290) {
                class153.field2281 = true;
            }
            if (this.field283 != null && this.field283[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field282 == null || this.field282[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field282[arg0] & 0xFF;
                    var33 = this.field286[var32];
                    var34 = this.field287[var32];
                    var35 = this.field288[var32];
                }
                if (this.field279[arg0] == -1) {
                    class153.method2558(var29, var30, var31, var26, var27, var28, this.field314[arg0], this.field314[arg0], this.field314[arg0], field284[var33], field284[var34], field284[var35], field324[var33], field324[var34], field324[var35], field276[var33], field276[var34], field276[var35], this.field283[arg0]);
                } else {
                    class153.method2558(var29, var30, var31, var26, var27, var28, field316[0], field316[1], field316[2], field284[var33], field284[var34], field284[var35], field324[var33], field324[var34], field324[var35], field276[var33], field276[var34], field276[var35], this.field283[arg0]);
                }
            } else if (this.field279[arg0] == -1) {
                class153.method2532(var29, var30, var31, var26, var27, var28, field320[this.field314[arg0]]);
            } else {
                class153.method2568(var29, var30, var31, var26, var27, var28, field316[0], field316[1], field316[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2290 || var27 > Statics.field2290 || var28 > Statics.field2290 || field302[3] < 0 || field302[3] > Statics.field2290) {
            class153.field2281 = true;
        }
        if (this.field283 != null && this.field283[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field282 == null || this.field282[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field282[arg0] & 0xFF;
                var37 = this.field286[var36];
                var38 = this.field287[var36];
                var39 = this.field288[var36];
            }
            short var40 = this.field283[arg0];
            if (this.field279[arg0] == -1) {
                class153.method2558(var29, var30, var31, var26, var27, var28, this.field314[arg0], this.field314[arg0], this.field314[arg0], field284[var37], field284[var38], field284[var39], field324[var37], field324[var38], field324[var39], field276[var37], field276[var38], field276[var39], var40);
                class153.method2558(var29, var31, field315[3], var26, var28, field302[3], this.field314[arg0], this.field314[arg0], this.field314[arg0], field284[var37], field284[var38], field284[var39], field324[var37], field324[var38], field324[var39], field276[var37], field276[var38], field276[var39], var40);
            } else {
                class153.method2558(var29, var30, var31, var26, var27, var28, field316[0], field316[1], field316[2], field284[var37], field284[var38], field284[var39], field324[var37], field324[var38], field324[var39], field276[var37], field276[var38], field276[var39], var40);
                class153.method2558(var29, var31, field315[3], var26, var28, field302[3], field316[0], field316[2], field316[3], field284[var37], field284[var38], field284[var39], field324[var37], field324[var38], field324[var39], field276[var37], field276[var38], field276[var39], var40);
            }
        } else if (this.field279[arg0] == -1) {
            int var41 = field320[this.field314[arg0]];
            class153.method2532(var29, var30, var31, var26, var27, var28, var41);
            class153.method2532(var29, var31, field315[3], var26, var28, field302[3], var41);
        } else {
            class153.method2568(var29, var30, var31, var26, var27, var28, field316[0], field316[1], field316[2]);
            class153.method2568(var29, var31, field315[3], var26, var28, field302[3], field316[0], field316[2], field316[3]);
        }
    }

    @ObfuscatedName("du.r(III)V")
    public void method406(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field269; var4++) {
            this.field270[var4] += arg0;
            this.field271[var4] += arg1;
            this.field290[var4] += arg2;
        }
        this.field292 = 0;
    }

    @ObfuscatedName("du.a(ZZI)V")
    public final void method412(boolean arg0, boolean arg1, int arg2) {
        if (this.field295 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field295; var4++) {
            field303[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field273; var5++) {
            if (this.field279[var5] != -2) {
                int var6 = this.field274[var5];
                int var7 = this.field272[var5];
                int var8 = this.field327[var5];
                int var9 = field300[var6];
                int var10 = field300[var7];
                int var11 = field300[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field284[var6];
                    int var13 = field284[var7];
                    int var14 = field284[var8];
                    int var15 = field324[var6];
                    int var16 = field324[var7];
                    int var17 = field324[var8];
                    int var18 = field276[var6];
                    int var19 = field276[var7];
                    int var20 = field276[var8];
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
                        field306[var5] = true;
                        int var30 = (field275[var6] + field275[var7] + field275[var8]) / 3 + this.field296;
                        field308[var30][field303[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method429(field318, field322, field301[var6], field301[var7], field301[var8], var9, var10, var11)) {
                        field304[field265++] = arg2;
                        arg1 = false;
                    }
                    if ((field301[var8] - field301[var7]) * (var9 - var10) - (field301[var6] - field301[var7]) * (var11 - var10) > 0) {
                        field306[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field2290 && var10 <= Statics.field2290 && var11 <= Statics.field2290) {
                            field298[var5] = false;
                        } else {
                            field298[var5] = true;
                        }
                        int var31 = (field275[var6] + field275[var7] + field275[var8]) / 3 + this.field296;
                        field308[var31][field303[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field280 == null) {
            for (int var32 = this.field295 - 1; var32 >= 0; var32--) {
                int var33 = field303[var32];
                if (var33 > 0) {
                    int[] var34 = field308[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method404(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field309[var36] = 0;
            field313[var36] = 0;
        }
        for (int var37 = this.field295 - 1; var37 >= 0; var37--) {
            int var38 = field303[var37];
            if (var38 > 0) {
                int[] var39 = field308[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field280[var41];
                    int var43 = field309[var42]++;
                    field310[var42][var43] = var41;
                    if (var42 < 10) {
                        field313[var42] += var37;
                    } else if (var42 == 10) {
                        field311[var43] = var37;
                    } else {
                        field325[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field309[1] > 0 || field309[2] > 0) {
            var44 = (field313[1] + field313[2]) / (field309[1] + field309[2]);
        }
        int var45 = 0;
        if (field309[3] > 0 || field309[4] > 0) {
            var45 = (field313[3] + field313[4]) / (field309[3] + field309[4]);
        }
        int var46 = 0;
        if (field309[6] > 0 || field309[8] > 0) {
            var46 = (field313[6] + field313[8]) / (field309[6] + field309[8]);
        }
        int var47 = 0;
        int var48 = field309[10];
        int[] var49 = field310[10];
        int[] var50 = field311;
        if (var47 == var48) {
            var47 = 0;
            var48 = field309[11];
            var49 = field310[11];
            var50 = field325;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method404(var49[var47++]);
                if (var47 == var48 && field310[11] != var49) {
                    var47 = 0;
                    var48 = field309[11];
                    var49 = field310[11];
                    var50 = field325;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method404(var49[var47++]);
                if (var47 == var48 && field310[11] != var49) {
                    var47 = 0;
                    var48 = field309[11];
                    var49 = field310[11];
                    var50 = field325;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method404(var49[var47++]);
                if (var47 == var48 && field310[11] != var49) {
                    var47 = 0;
                    var48 = field309[11];
                    var49 = field310[11];
                    var50 = field325;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field309[var52];
            int[] var54 = field310[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method404(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method404(var49[var47++]);
            if (var47 == var48 && field310[11] != var49) {
                var47 = 0;
                var49 = field310[11];
                var48 = field309[11];
                var50 = field325;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    public class27(class27[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field269 = 0;
        this.field273 = 0;
        this.field312 = 0;
        this.field267 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class27 var8 = arg0[var7];
            if (var8 != null) {
                this.field269 += var8.field269;
                this.field273 += var8.field273;
                this.field312 += var8.field312;
                if (var8.field280 == null) {
                    if (this.field267 == -1) {
                        this.field267 = var8.field267;
                    }
                    if (this.field267 != var8.field267) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field281 != null;
                var5 |= var8.field283 != null;
                var6 |= var8.field282 != null;
            }
        }
        this.field270 = new int[this.field269];
        this.field271 = new int[this.field269];
        this.field290 = new int[this.field269];
        this.field274 = new int[this.field273];
        this.field272 = new int[this.field273];
        this.field327 = new int[this.field273];
        this.field314 = new int[this.field273];
        this.field278 = new int[this.field273];
        this.field279 = new int[this.field273];
        if (var3) {
            this.field280 = new byte[this.field273];
        }
        if (var4) {
            this.field281 = new byte[this.field273];
        }
        if (var5) {
            this.field283 = new short[this.field273];
        }
        if (var6) {
            this.field282 = new byte[this.field273];
        }
        if (this.field312 > 0) {
            this.field286 = new int[this.field312];
            this.field287 = new int[this.field312];
            this.field288 = new int[this.field312];
        }
        this.field269 = 0;
        this.field273 = 0;
        this.field312 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class27 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field273; var11++) {
                    this.field274[this.field273] = var10.field274[var11] + this.field269;
                    this.field272[this.field273] = var10.field272[var11] + this.field269;
                    this.field327[this.field273] = var10.field327[var11] + this.field269;
                    this.field314[this.field273] = var10.field314[var11];
                    this.field278[this.field273] = var10.field278[var11];
                    this.field279[this.field273] = var10.field279[var11];
                    if (var3) {
                        if (var10.field280 == null) {
                            this.field280[this.field273] = var10.field267;
                        } else {
                            this.field280[this.field273] = var10.field280[var11];
                        }
                    }
                    if (var4 && var10.field281 != null) {
                        this.field281[this.field273] = var10.field281[var11];
                    }
                    if (var5) {
                        if (var10.field283 == null) {
                            this.field283[this.field273] = -1;
                        } else {
                            this.field283[this.field273] = var10.field283[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field282 == null || var10.field282[var11] == -1) {
                            this.field282[this.field273] = -1;
                        } else {
                            this.field282[this.field273] = (byte) (var10.field282[var11] + this.field312);
                        }
                    }
                    this.field273++;
                }
                for (int var12 = 0; var12 < var10.field312; var12++) {
                    this.field286[this.field312] = var10.field286[var12] + this.field269;
                    this.field287[this.field312] = var10.field287[var12] + this.field269;
                    this.field288[this.field312] = var10.field288[var12] + this.field269;
                    this.field312++;
                }
                for (int var13 = 0; var13 < var10.field269; var13++) {
                    this.field270[this.field269] = var10.field270[var13];
                    this.field271[this.field269] = var10.field271[var13];
                    this.field290[this.field269] = var10.field290[var13];
                    this.field269++;
                }
            }
        }
    }

    @ObfuscatedName("du.ax(IIIIIIII)Z")
    public final boolean method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    public class27() {
    }

    @ObfuscatedName("du.j()I")
    public int method431() {
        this.method389();
        return this.field294;
    }

    @ObfuscatedName("du.p(IIIIIIIII)V")
    public void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field303[0] = -1;
        if (this.field292 != 1) {
            this.method389();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field294 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field294 << 9;
        if (var15 / var13 >= Statics.field2275) {
            return;
        }
        int var16 = this.field294 + var14 << 9;
        if (var16 / var13 <= Statics.field2296) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field294 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field2291) {
            return;
        }
        int var20 = (this.field2207 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field2292) {
            return;
        }
        int var22 = (this.field2207 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field312 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field328) {
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
            int var32 = field318 - Statics.field2285;
            int var33 = field322 - Statics.field2286;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field291) {
                    field304[field265++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field2285;
        int var35 = Statics.field2286;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field266[arg0];
            var37 = field326[arg0];
        }
        for (int var38 = 0; var38 < this.field269; var38++) {
            int var39 = this.field270[var38];
            int var40 = this.field271[var38];
            int var41 = this.field290[var38];
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
            field275[var38] = var50 - var11;
            if (var50 >= 50) {
                field300[var38] = (var46 << 9) / var50 + var34;
                field301[var38] = (var49 << 9) / var50 + var35;
            } else {
                field300[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field284[var38] = var46;
                field324[var38] = var49;
                field276[var38] = var50;
            }
        }
        try {
            this.method412(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("du.x(Ldv;I)V")
    public void method466(class28 arg0, int arg1) {
        if (this.field299 == null || arg1 == -1) {
            return;
        }
        class141 var3 = arg0.field332[arg1];
        class37 var4 = var3.field2158;
        Statics.field317 = 0;
        Statics.field277 = 0;
        Statics.field319 = 0;
        for (int var5 = 0; var5 < var3.field2157; var5++) {
            int var6 = var3.field2155[var5];
            this.method394(var4.field455[var6], var4.field456[var6], var3.field2160[var5], var3.field2153[var5], var3.field2161[var5]);
        }
        this.field292 = 0;
    }
}
