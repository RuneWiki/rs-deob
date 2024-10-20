package deob;

@ObfuscatedName("cl")
public class class151 extends class107 {

    @ObfuscatedName("cl.f")
    public short[] field2300;

    @ObfuscatedName("cl.g")
    public byte[] field2264;

    @ObfuscatedName("cl.d")
    public int[] field2262;

    @ObfuscatedName("cl.e")
    public byte field2259 = 0;

    @ObfuscatedName("cl.b")
    public int[] field2257;

    @ObfuscatedName("cl.c")
    public int[] field2276;

    @ObfuscatedName("cl.a")
    public byte[] field2266;

    @ObfuscatedName("cl.n")
    public short[] field2291;

    @ObfuscatedName("cl.o")
    public byte[] field2288;

    @ObfuscatedName("cl.l")
    public short[] field2278;

    @ObfuscatedName("cl.m")
    public int field2255 = 0;

    @ObfuscatedName("cl.j")
    public byte[] field2263;

    @ObfuscatedName("cl.k")
    public short[] field2268;

    @ObfuscatedName("cl.h")
    public short[] field2274;

    @ObfuscatedName("cl.i")
    public int[] field2258;

    @ObfuscatedName("cl.w")
    public short[] field2285;

    @ObfuscatedName("cl.v")
    public int field2270 = 0;

    @ObfuscatedName("cl.u")
    public short[] field2267;

    @ObfuscatedName("cl.t")
    public short[] field2271;

    @ObfuscatedName("cl.s")
    public short[] field2272;

    @ObfuscatedName("cl.r")
    public short[] field2290;

    @ObfuscatedName("cl.q")
    public short[] field2280;

    @ObfuscatedName("cl.p")
    public int field2269;

    @ObfuscatedName("cl.z")
    public int[] field2277;

    @ObfuscatedName("cl.y")
    public byte[] field2265;

    @ObfuscatedName("cl.x")
    public int[] field2275;

    @ObfuscatedName("cl.az")
    public static int[] field2298 = class155.field2344;

    @ObfuscatedName("cl.as")
    public byte[] field2281;

    @ObfuscatedName("cl.ar")
    public class144[] field2279;

    @ObfuscatedName("cl.ax")
    public int[] field2283;

    @ObfuscatedName("cl.aw")
    public int field2295;

    @ObfuscatedName("cl.av")
    public int field2296;

    @ObfuscatedName("cl.au")
    public int field2293;

    @ObfuscatedName("cl.al")
    public int field2294;

    @ObfuscatedName("cl.ai")
    public short field2289;

    @ObfuscatedName("cl.aj")
    public int field2292;

    @ObfuscatedName("cl.ao")
    public int[][] field2284;

    @ObfuscatedName("cl.ap")
    public static int[] field2299 = new int[10000];

    @ObfuscatedName("cl.am")
    public boolean field2260 = false;

    @ObfuscatedName("cl.an")
    public class144[] field2287;

    @ObfuscatedName("cl.ac")
    public int[] field2282;

    @ObfuscatedName("cl.ad")
    public static int field2261 = 0;

    @ObfuscatedName("cl.aa")
    public class152[] field2286;

    @ObfuscatedName("cl.ag")
    public static int[] field2301 = class155.field2332;

    @ObfuscatedName("cl.ah")
    public int[][] field2273;

    @ObfuscatedName("cl.ae")
    public short field2256;

    @ObfuscatedName("cl.af")
    public static int[] field2297 = new int[10000];

    @ObfuscatedName("cl.m(Lcl;I)I")
    public final int method2654(class151 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2276[arg1];
        int var5 = arg0.field2257[arg1];
        int var6 = arg0.field2258[arg1];
        for (int var7 = 0; var7 < this.field2270; var7++) {
            if (this.field2276[var7] == var4 && this.field2257[var7] == var5 && this.field2258[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2276[this.field2270] = var4;
            this.field2257[this.field2270] = var5;
            this.field2258[this.field2270] = var6;
            if (arg0.field2282 != null) {
                this.field2282[this.field2270] = arg0.field2282[arg1];
            }
            var3 = this.field2270++;
        }
        return var3;
    }

    @ObfuscatedName("cl.v(Lel;II)Lcl;")
    public static class151 method2655(class87 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1298(arg1, arg2);
        return var3 == null ? null : new class151(var3);
    }

    public class151(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2701(arg0);
        } else {
            this.method2689(arg0);
        }
    }

    @ObfuscatedName("cl.s(SS)V")
    public void method2657(short arg0, short arg1) {
        if (this.field2268 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2255; var3++) {
            if (this.field2268[var3] == arg0) {
                this.field2268[var3] = arg1;
            }
        }
    }

    public class151(class151 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2270 = arg0.field2270;
        this.field2255 = arg0.field2255;
        this.field2269 = arg0.field2269;
        if (arg1) {
            this.field2276 = arg0.field2276;
            this.field2257 = arg0.field2257;
            this.field2258 = arg0.field2258;
        } else {
            this.field2276 = new int[this.field2270];
            this.field2257 = new int[this.field2270];
            this.field2258 = new int[this.field2270];
            for (int var6 = 0; var6 < this.field2270; var6++) {
                this.field2276[var6] = arg0.field2276[var6];
                this.field2257[var6] = arg0.field2257[var6];
                this.field2258[var6] = arg0.field2258[var6];
            }
        }
        if (arg2) {
            this.field2267 = arg0.field2267;
        } else {
            this.field2267 = new short[this.field2255];
            for (int var7 = 0; var7 < this.field2255; var7++) {
                this.field2267[var7] = arg0.field2267[var7];
            }
        }
        if (arg3 || arg0.field2268 == null) {
            this.field2268 = arg0.field2268;
        } else {
            this.field2268 = new short[this.field2255];
            for (int var8 = 0; var8 < this.field2255; var8++) {
                this.field2268[var8] = arg0.field2268[var8];
            }
        }
        if (arg4) {
            this.field2265 = arg0.field2265;
        } else {
            this.field2265 = new byte[this.field2255];
            if (arg0.field2265 == null) {
                for (int var9 = 0; var9 < this.field2255; var9++) {
                    this.field2265[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2255; var10++) {
                    this.field2265[var10] = arg0.field2265[var10];
                }
            }
        }
        this.field2277 = arg0.field2277;
        this.field2275 = arg0.field2275;
        this.field2262 = arg0.field2262;
        this.field2263 = arg0.field2263;
        this.field2264 = arg0.field2264;
        this.field2266 = arg0.field2266;
        this.field2259 = arg0.field2259;
        this.field2288 = arg0.field2288;
        this.field2272 = arg0.field2272;
        this.field2300 = arg0.field2300;
        this.field2274 = arg0.field2274;
        this.field2271 = arg0.field2271;
        this.field2285 = arg0.field2285;
        this.field2290 = arg0.field2290;
        this.field2278 = arg0.field2278;
        this.field2281 = arg0.field2281;
        this.field2291 = arg0.field2291;
        this.field2280 = arg0.field2280;
        this.field2282 = arg0.field2282;
        this.field2283 = arg0.field2283;
        this.field2284 = arg0.field2284;
        this.field2273 = arg0.field2273;
        this.field2287 = arg0.field2287;
        this.field2286 = arg0.field2286;
        this.field2279 = arg0.field2279;
        this.field2289 = arg0.field2289;
        this.field2256 = arg0.field2256;
    }

    @ObfuscatedName("cl.z()Lcl;")
    public class151 method2660() {
        class151 var1 = new class151();
        if (this.field2263 != null) {
            var1.field2263 = new byte[this.field2255];
            for (int var2 = 0; var2 < this.field2255; var2++) {
                var1.field2263[var2] = this.field2263[var2];
            }
        }
        var1.field2270 = this.field2270;
        var1.field2255 = this.field2255;
        var1.field2269 = this.field2269;
        var1.field2276 = this.field2276;
        var1.field2257 = this.field2257;
        var1.field2258 = this.field2258;
        var1.field2277 = this.field2277;
        var1.field2275 = this.field2275;
        var1.field2262 = this.field2262;
        var1.field2264 = this.field2264;
        var1.field2265 = this.field2265;
        var1.field2266 = this.field2266;
        var1.field2267 = this.field2267;
        var1.field2268 = this.field2268;
        var1.field2259 = this.field2259;
        var1.field2288 = this.field2288;
        var1.field2272 = this.field2272;
        var1.field2300 = this.field2300;
        var1.field2274 = this.field2274;
        var1.field2271 = this.field2271;
        var1.field2285 = this.field2285;
        var1.field2290 = this.field2290;
        var1.field2278 = this.field2278;
        var1.field2281 = this.field2281;
        var1.field2291 = this.field2291;
        var1.field2280 = this.field2280;
        var1.field2282 = this.field2282;
        var1.field2283 = this.field2283;
        var1.field2284 = this.field2284;
        var1.field2273 = this.field2273;
        var1.field2287 = this.field2287;
        var1.field2286 = this.field2286;
        var1.field2289 = this.field2289;
        var1.field2256 = this.field2256;
        return var1;
    }

    @ObfuscatedName("cl.g([[IIIIZI)Lcl;")
    public class151 method2661(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2673();
        int var7 = this.field2293 + arg1;
        int var8 = this.field2294 + arg1;
        int var9 = this.field2296 + arg3;
        int var10 = this.field2295 + arg3;
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
        class151 var15;
        if (arg4) {
            var15 = new class151();
            var15.field2270 = this.field2270;
            var15.field2255 = this.field2255;
            var15.field2269 = this.field2269;
            var15.field2276 = this.field2276;
            var15.field2258 = this.field2258;
            var15.field2277 = this.field2277;
            var15.field2275 = this.field2275;
            var15.field2262 = this.field2262;
            var15.field2263 = this.field2263;
            var15.field2264 = this.field2264;
            var15.field2265 = this.field2265;
            var15.field2266 = this.field2266;
            var15.field2267 = this.field2267;
            var15.field2268 = this.field2268;
            var15.field2259 = this.field2259;
            var15.field2288 = this.field2288;
            var15.field2272 = this.field2272;
            var15.field2300 = this.field2300;
            var15.field2274 = this.field2274;
            var15.field2271 = this.field2271;
            var15.field2285 = this.field2285;
            var15.field2290 = this.field2290;
            var15.field2278 = this.field2278;
            var15.field2281 = this.field2281;
            var15.field2291 = this.field2291;
            var15.field2280 = this.field2280;
            var15.field2282 = this.field2282;
            var15.field2283 = this.field2283;
            var15.field2284 = this.field2284;
            var15.field2273 = this.field2273;
            var15.field2289 = this.field2289;
            var15.field2256 = this.field2256;
            var15.field2257 = new int[var15.field2270];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2270; var16++) {
                int var17 = this.field2276[var16] + arg1;
                int var18 = this.field2258[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2257[var16] = this.field2257[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2270; var26++) {
                int var27 = (-this.field2257[var26] << 16) / this.field1455;
                if (var27 < arg5) {
                    int var28 = this.field2276[var26] + arg1;
                    int var29 = this.field2258[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2257[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2257[var26];
                }
            }
        }
        var15.method2672();
        return var15;
    }

    @ObfuscatedName("cl.y()V")
    public void method2662() {
        int var10002;
        if (this.field2282 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2270; var3++) {
                int var4 = this.field2282[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2284 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2284[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2270) {
                int var7 = this.field2282[var6];
                this.field2284[var7][var1[var7]++] = var6++;
            }
            this.field2282 = null;
        }
        if (this.field2283 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2255; var10++) {
            int var11 = this.field2283[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2273 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2273[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2255) {
            int var14 = this.field2283[var13];
            this.field2273[var14][var8[var14]++] = var13++;
        }
        this.field2283 = null;
    }

    @ObfuscatedName("cl.a()V")
    public void method2663() {
        for (int var1 = 0; var1 < this.field2270; var1++) {
            int var2 = this.field2276[var1];
            this.field2276[var1] = this.field2258[var1];
            this.field2258[var1] = -var2;
        }
        this.method2672();
    }

    @ObfuscatedName("cl.f()V")
    public void method2664() {
        for (int var1 = 0; var1 < this.field2270; var1++) {
            this.field2258[var1] = -this.field2258[var1];
        }
        for (int var2 = 0; var2 < this.field2255; var2++) {
            int var3 = this.field2277[var2];
            this.field2277[var2] = this.field2262[var2];
            this.field2262[var2] = var3;
        }
        this.method2672();
    }

    @ObfuscatedName("cl.k()V")
    public void method2665() {
        for (int var1 = 0; var1 < this.field2270; var1++) {
            int var2 = this.field2258[var1];
            this.field2258[var1] = this.field2276[var1];
            this.field2276[var1] = -var2;
        }
        this.method2672();
    }

    @ObfuscatedName("cl.p(III)V")
    public void method2666(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2270; var4++) {
            this.field2276[var4] += arg0;
            this.field2257[var4] += arg1;
            this.field2258[var4] += arg2;
        }
        this.method2672();
    }

    @ObfuscatedName("cl.o(SS)V")
    public void method2668(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2255; var3++) {
            if (this.field2267[var3] == arg0) {
                this.field2267[var3] = arg1;
            }
        }
    }

    public class151(class151[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2270 = 0;
        this.field2255 = 0;
        this.field2269 = 0;
        this.field2259 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class151 var10 = arg0[var9];
            if (var10 != null) {
                this.field2270 += var10.field2270;
                this.field2255 += var10.field2255;
                this.field2269 += var10.field2269;
                if (var10.field2264 == null) {
                    if (this.field2259 == -1) {
                        this.field2259 = var10.field2259;
                    }
                    if (this.field2259 != var10.field2259) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2263 != null;
                var5 |= var10.field2265 != null;
                var6 |= var10.field2283 != null;
                var7 |= var10.field2268 != null;
                var8 |= var10.field2266 != null;
            }
        }
        this.field2276 = new int[this.field2270];
        this.field2257 = new int[this.field2270];
        this.field2258 = new int[this.field2270];
        this.field2282 = new int[this.field2270];
        this.field2277 = new int[this.field2255];
        this.field2275 = new int[this.field2255];
        this.field2262 = new int[this.field2255];
        if (var3) {
            this.field2263 = new byte[this.field2255];
        }
        if (var4) {
            this.field2264 = new byte[this.field2255];
        }
        if (var5) {
            this.field2265 = new byte[this.field2255];
        }
        if (var6) {
            this.field2283 = new int[this.field2255];
        }
        if (var7) {
            this.field2268 = new short[this.field2255];
        }
        if (var8) {
            this.field2266 = new byte[this.field2255];
        }
        this.field2267 = new short[this.field2255];
        if (this.field2269 > 0) {
            this.field2288 = new byte[this.field2269];
            this.field2272 = new short[this.field2269];
            this.field2300 = new short[this.field2269];
            this.field2274 = new short[this.field2269];
            this.field2271 = new short[this.field2269];
            this.field2285 = new short[this.field2269];
            this.field2290 = new short[this.field2269];
            this.field2278 = new short[this.field2269];
            this.field2281 = new byte[this.field2269];
            this.field2291 = new short[this.field2269];
            this.field2280 = new short[this.field2269];
        }
        this.field2270 = 0;
        this.field2255 = 0;
        this.field2269 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class151 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2255; var13++) {
                    if (var3 && var12.field2263 != null) {
                        this.field2263[this.field2255] = var12.field2263[var13];
                    }
                    if (var4) {
                        if (var12.field2264 == null) {
                            this.field2264[this.field2255] = var12.field2259;
                        } else {
                            this.field2264[this.field2255] = var12.field2264[var13];
                        }
                    }
                    if (var5 && var12.field2265 != null) {
                        this.field2265[this.field2255] = var12.field2265[var13];
                    }
                    if (var6 && var12.field2283 != null) {
                        this.field2283[this.field2255] = var12.field2283[var13];
                    }
                    if (var7) {
                        if (var12.field2268 == null) {
                            this.field2268[this.field2255] = -1;
                        } else {
                            this.field2268[this.field2255] = var12.field2268[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2266 == null || var12.field2266[var13] == -1) {
                            this.field2266[this.field2255] = -1;
                        } else {
                            this.field2266[this.field2255] = (byte) (var12.field2266[var13] + this.field2269);
                        }
                    }
                    this.field2267[this.field2255] = var12.field2267[var13];
                    this.field2277[this.field2255] = this.method2654(var12, var12.field2277[var13]);
                    this.field2275[this.field2255] = this.method2654(var12, var12.field2275[var13]);
                    this.field2262[this.field2255] = this.method2654(var12, var12.field2262[var13]);
                    this.field2255++;
                }
                for (int var14 = 0; var14 < var12.field2269; var14++) {
                    byte var15 = this.field2288[this.field2269] = var12.field2288[var14];
                    if (var15 == 0) {
                        this.field2272[this.field2269] = (short) this.method2654(var12, var12.field2272[var14]);
                        this.field2300[this.field2269] = (short) this.method2654(var12, var12.field2300[var14]);
                        this.field2274[this.field2269] = (short) this.method2654(var12, var12.field2274[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2272[this.field2269] = var12.field2272[var14];
                        this.field2300[this.field2269] = var12.field2300[var14];
                        this.field2274[this.field2269] = var12.field2274[var14];
                        this.field2271[this.field2269] = var12.field2271[var14];
                        this.field2285[this.field2269] = var12.field2285[var14];
                        this.field2290[this.field2269] = var12.field2290[var14];
                        this.field2278[this.field2269] = var12.field2278[var14];
                        this.field2281[this.field2269] = var12.field2281[var14];
                        this.field2291[this.field2269] = var12.field2291[var14];
                    }
                    if (var15 == 2) {
                        this.field2280[this.field2269] = var12.field2280[var14];
                    }
                    this.field2269++;
                }
            }
        }
    }

    @ObfuscatedName("cl.h(III)V")
    public void method2670(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2270; var4++) {
            this.field2276[var4] = this.field2276[var4] * arg0 / 128;
            this.field2257[var4] = this.field2257[var4] * arg1 / 128;
            this.field2258[var4] = this.field2258[var4] * arg2 / 128;
        }
        this.method2672();
    }

    @ObfuscatedName("cl.t()V")
    public void method2671() {
        if (this.field2287 != null) {
            return;
        }
        this.field2287 = new class144[this.field2270];
        for (int var1 = 0; var1 < this.field2270; var1++) {
            this.field2287[var1] = new class144();
        }
        for (int var2 = 0; var2 < this.field2255; var2++) {
            int var3 = this.field2277[var2];
            int var4 = this.field2275[var2];
            int var5 = this.field2262[var2];
            int var6 = this.field2276[var4] - this.field2276[var3];
            int var7 = this.field2257[var4] - this.field2257[var3];
            int var8 = this.field2258[var4] - this.field2258[var3];
            int var9 = this.field2276[var5] - this.field2276[var3];
            int var10 = this.field2257[var5] - this.field2257[var3];
            int var11 = this.field2258[var5] - this.field2258[var3];
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
            if (this.field2263 == null) {
                var19 = 0;
            } else {
                var19 = this.field2263[var2];
            }
            if (var19 == 0) {
                class144 var20 = this.field2287[var3];
                var20.field2168 += var16;
                var20.field2166 += var17;
                var20.field2164 += var18;
                var20.field2162++;
                class144 var21 = this.field2287[var4];
                var21.field2168 += var16;
                var21.field2166 += var17;
                var21.field2164 += var18;
                var21.field2162++;
                class144 var22 = this.field2287[var5];
                var22.field2168 += var16;
                var22.field2166 += var17;
                var22.field2164 += var18;
                var22.field2162++;
            } else if (var19 == 1) {
                if (this.field2286 == null) {
                    this.field2286 = new class152[this.field2255];
                }
                class152 var23 = this.field2286[var2] = new class152();
                var23.field2306 = var16;
                var23.field2303 = var17;
                var23.field2307 = var18;
            }
        }
    }

    @ObfuscatedName("cl.w()V")
    public void method2672() {
        this.field2287 = null;
        this.field2279 = null;
        this.field2286 = null;
        this.field2260 = false;
    }

    @ObfuscatedName("cl.r()V")
    public void method2673() {
        if (this.field2260) {
            return;
        }
        this.field1455 = 0;
        this.field2292 = 0;
        this.field2293 = 999999;
        this.field2294 = -999999;
        this.field2295 = -99999;
        this.field2296 = 99999;
        for (int var1 = 0; var1 < this.field2270; var1++) {
            int var2 = this.field2276[var1];
            int var3 = this.field2257[var1];
            int var4 = this.field2258[var1];
            if (var2 < this.field2293) {
                this.field2293 = var2;
            }
            if (var2 > this.field2294) {
                this.field2294 = var2;
            }
            if (var4 < this.field2296) {
                this.field2296 = var4;
            }
            if (var4 > this.field2295) {
                this.field2295 = var4;
            }
            if (-var3 > this.field1455) {
                this.field1455 = -var3;
            }
            if (var3 > this.field2292) {
                this.field2292 = var3;
            }
        }
        this.field2260 = true;
    }

    @ObfuscatedName("cl.n(IIIII)Ldk;")
    public final class43 method2675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2671();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class43 var8 = new class43();
        var8.field457 = new int[this.field2255];
        var8.field472 = new int[this.field2255];
        var8.field458 = new int[this.field2255];
        if (this.field2269 > 0 && this.field2266 != null) {
            int[] var9 = new int[this.field2269];
            for (int var10 = 0; var10 < this.field2255; var10++) {
                if (this.field2266[var10] != -1) {
                    var9[this.field2266[var10] & 0xFF]++;
                }
            }
            var8.field450 = 0;
            for (int var11 = 0; var11 < this.field2269; var11++) {
                if (var9[var11] > 0 && this.field2288[var11] == 0) {
                    var8.field450++;
                }
            }
            var8.field447 = new int[var8.field450];
            var8.field474 = new int[var8.field450];
            var8.field467 = new int[var8.field450];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2269; var13++) {
                if (var9[var13] > 0 && this.field2288[var13] == 0) {
                    var8.field447[var12] = this.field2272[var13] & 0xFFFF;
                    var8.field474[var12] = this.field2300[var13] & 0xFFFF;
                    var8.field467[var12] = this.field2274[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field461 = new byte[this.field2255];
            for (int var14 = 0; var14 < this.field2255; var14++) {
                if (this.field2266[var14] == -1) {
                    var8.field461[var14] = -1;
                } else {
                    var8.field461[var14] = (byte) var9[this.field2266[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2255; var15++) {
            byte var16;
            if (this.field2263 == null) {
                var16 = 0;
            } else {
                var16 = this.field2263[var15];
            }
            byte var17;
            if (this.field2265 == null) {
                var17 = 0;
            } else {
                var17 = this.field2265[var15];
            }
            short var18;
            if (this.field2268 == null) {
                var18 = -1;
            } else {
                var18 = this.field2268[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2267[var15] & 0xFFFF;
                    class144 var20;
                    if (this.field2279 == null || this.field2279[this.field2277[var15]] == null) {
                        var20 = this.field2287[this.field2277[var15]];
                    } else {
                        var20 = this.field2279[this.field2277[var15]];
                    }
                    int var21 = (var20.field2164 * arg4 + var20.field2168 * arg2 + var20.field2166 * arg3) / (var20.field2162 * var7) + arg0;
                    var8.field457[var15] = method2727(var19, var21);
                    class144 var22;
                    if (this.field2279 == null || this.field2279[this.field2275[var15]] == null) {
                        var22 = this.field2287[this.field2275[var15]];
                    } else {
                        var22 = this.field2279[this.field2275[var15]];
                    }
                    int var23 = (var22.field2164 * arg4 + var22.field2168 * arg2 + var22.field2166 * arg3) / (var22.field2162 * var7) + arg0;
                    var8.field472[var15] = method2727(var19, var23);
                    class144 var24;
                    if (this.field2279 == null || this.field2279[this.field2262[var15]] == null) {
                        var24 = this.field2287[this.field2262[var15]];
                    } else {
                        var24 = this.field2279[this.field2262[var15]];
                    }
                    int var25 = (var24.field2164 * arg4 + var24.field2168 * arg2 + var24.field2166 * arg3) / (var24.field2162 * var7) + arg0;
                    var8.field458[var15] = method2727(var19, var25);
                } else if (var16 == 1) {
                    class152 var26 = this.field2286[var15];
                    int var27 = (var26.field2307 * arg4 + var26.field2306 * arg2 + var26.field2303 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field457[var15] = method2727(this.field2267[var15] & 0xFFFF, var27);
                    var8.field458[var15] = -1;
                } else if (var16 == 3) {
                    var8.field457[var15] = 128;
                    var8.field458[var15] = -1;
                } else {
                    var8.field458[var15] = -2;
                }
            } else if (var16 == 0) {
                class144 var28;
                if (this.field2279 == null || this.field2279[this.field2277[var15]] == null) {
                    var28 = this.field2287[this.field2277[var15]];
                } else {
                    var28 = this.field2279[this.field2277[var15]];
                }
                int var29 = (var28.field2164 * arg4 + var28.field2168 * arg2 + var28.field2166 * arg3) / (var28.field2162 * var7) + arg0;
                var8.field457[var15] = method2697(var29);
                class144 var30;
                if (this.field2279 == null || this.field2279[this.field2275[var15]] == null) {
                    var30 = this.field2287[this.field2275[var15]];
                } else {
                    var30 = this.field2279[this.field2275[var15]];
                }
                int var31 = (var30.field2164 * arg4 + var30.field2168 * arg2 + var30.field2166 * arg3) / (var30.field2162 * var7) + arg0;
                var8.field472[var15] = method2697(var31);
                class144 var32;
                if (this.field2279 == null || this.field2279[this.field2262[var15]] == null) {
                    var32 = this.field2287[this.field2262[var15]];
                } else {
                    var32 = this.field2279[this.field2262[var15]];
                }
                int var33 = (var32.field2164 * arg4 + var32.field2168 * arg2 + var32.field2166 * arg3) / (var32.field2162 * var7) + arg0;
                var8.field458[var15] = method2697(var33);
            } else if (var16 == 1) {
                class152 var34 = this.field2286[var15];
                int var35 = (var34.field2307 * arg4 + var34.field2306 * arg2 + var34.field2303 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field457[var15] = method2697(var35);
                var8.field458[var15] = -1;
            } else {
                var8.field458[var15] = -2;
            }
        }
        this.method2662();
        var8.field448 = this.field2270;
        var8.field477 = this.field2276;
        var8.field499 = this.field2257;
        var8.field451 = this.field2258;
        var8.field452 = this.field2255;
        var8.field453 = this.field2277;
        var8.field454 = this.field2275;
        var8.field455 = this.field2262;
        var8.field459 = this.field2264;
        var8.field460 = this.field2265;
        var8.field463 = this.field2259;
        var8.field468 = this.field2284;
        var8.field501 = this.field2273;
        var8.field462 = this.field2268;
        return var8;
    }

    public class151() {
    }

    @ObfuscatedName("cl.e(I)V")
    public void method2680(int arg0) {
        int var2 = field2298[arg0];
        int var3 = field2301[arg0];
        for (int var4 = 0; var4 < this.field2270; var4++) {
            int var5 = this.field2276[var4] * var3 + this.field2258[var4] * var2 >> 16;
            this.field2258[var4] = this.field2258[var4] * var3 - this.field2276[var4] * var2 >> 16;
            this.field2276[var4] = var5;
        }
        this.method2672();
    }

    @ObfuscatedName("cl.i([B)V")
    public void method2689(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class28 var4 = new class28(arg0);
        class28 var5 = new class28(arg0);
        class28 var6 = new class28(arg0);
        class28 var7 = new class28(arg0);
        class28 var8 = new class28(arg0);
        var4.field303 = arg0.length - 18;
        int var9 = var4.method349();
        int var10 = var4.method349();
        int var11 = var4.method450();
        int var12 = var4.method450();
        int var13 = var4.method450();
        int var14 = var4.method450();
        int var15 = var4.method450();
        int var16 = var4.method450();
        int var17 = var4.method349();
        int var18 = var4.method349();
        int var19 = var4.method349();
        int var20 = var4.method349();
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
        this.field2270 = var9;
        this.field2255 = var10;
        this.field2269 = var11;
        this.field2276 = new int[var9];
        this.field2257 = new int[var9];
        this.field2258 = new int[var9];
        this.field2277 = new int[var10];
        this.field2275 = new int[var10];
        this.field2262 = new int[var10];
        if (var11 > 0) {
            this.field2288 = new byte[var11];
            this.field2272 = new short[var11];
            this.field2300 = new short[var11];
            this.field2274 = new short[var11];
        }
        if (var16 == 1) {
            this.field2282 = new int[var9];
        }
        if (var12 == 1) {
            this.field2263 = new byte[var10];
            this.field2266 = new byte[var10];
            this.field2268 = new short[var10];
        }
        if (var13 == 255) {
            this.field2264 = new byte[var10];
        } else {
            this.field2259 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2265 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2283 = new int[var10];
        }
        this.field2267 = new short[var10];
        var4.field303 = var21;
        var5.field303 = var36;
        var6.field303 = var38;
        var7.field303 = var40;
        var8.field303 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method450();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method324();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method324();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method324();
            }
            this.field2276[var46] = var43 + var48;
            this.field2257[var46] = var44 + var49;
            this.field2258[var46] = var45 + var50;
            var43 = this.field2276[var46];
            var44 = this.field2257[var46];
            var45 = this.field2258[var46];
            if (var16 == 1) {
                this.field2282[var46] = var8.method450();
            }
        }
        var4.field303 = var32;
        var5.field303 = var28;
        var6.field303 = var26;
        var7.field303 = var30;
        var8.field303 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2267[var51] = (short) var4.method349();
            if (var12 == 1) {
                int var52 = var5.method450();
                if ((var52 & 0x1) == 1) {
                    this.field2263[var51] = 1;
                    var2 = true;
                } else {
                    this.field2263[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2266[var51] = (byte) (var52 >> 2);
                    this.field2268[var51] = this.field2267[var51];
                    this.field2267[var51] = 127;
                    if (this.field2268[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2266[var51] = -1;
                    this.field2268[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2264[var51] = var6.method313();
            }
            if (var14 == 1) {
                this.field2265[var51] = var7.method313();
            }
            if (var15 == 1) {
                this.field2283[var51] = var8.method450();
            }
        }
        var4.field303 = var25;
        var5.field303 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method450();
            if (var58 == 1) {
                var53 = var4.method324() + var56;
                var54 = var4.method324() + var53;
                var55 = var4.method324() + var54;
                var56 = var55;
                this.field2277[var57] = var53;
                this.field2275[var57] = var54;
                this.field2262[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method324() + var56;
                var56 = var55;
                this.field2277[var57] = var53;
                this.field2275[var57] = var54;
                this.field2262[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method324() + var56;
                var56 = var55;
                this.field2277[var57] = var53;
                this.field2275[var57] = var54;
                this.field2262[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method324() + var56;
                var56 = var55;
                this.field2277[var57] = var53;
                this.field2275[var57] = var61;
                this.field2262[var57] = var55;
            }
        }
        var4.field303 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2288[var62] = 0;
            this.field2272[var62] = (short) var4.method349();
            this.field2300[var62] = (short) var4.method349();
            this.field2274[var62] = (short) var4.method349();
        }
        if (this.field2266 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2266[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2272[var65] & 0xFFFF) == this.field2277[var64] && (this.field2300[var65] & 0xFFFF) == this.field2275[var64] && (this.field2274[var65] & 0xFFFF) == this.field2262[var64]) {
                        this.field2266[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2266 = null;
            }
        }
        if (!var3) {
            this.field2268 = null;
        }
        if (!var2) {
            this.field2263 = null;
        }
    }

    @ObfuscatedName("cl.as(I)I")
    public static final int method2697(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @ObfuscatedName("cl.b([B)V")
    public void method2701(byte[] arg0) {
        class28 var2 = new class28(arg0);
        class28 var3 = new class28(arg0);
        class28 var4 = new class28(arg0);
        class28 var5 = new class28(arg0);
        class28 var6 = new class28(arg0);
        class28 var7 = new class28(arg0);
        class28 var8 = new class28(arg0);
        var2.field303 = arg0.length - 23;
        int var9 = var2.method349();
        int var10 = var2.method349();
        int var11 = var2.method450();
        int var12 = var2.method450();
        int var13 = var2.method450();
        int var14 = var2.method450();
        int var15 = var2.method450();
        int var16 = var2.method450();
        int var17 = var2.method450();
        int var18 = var2.method349();
        int var19 = var2.method349();
        int var20 = var2.method349();
        int var21 = var2.method349();
        int var22 = var2.method349();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2288 = new byte[var11];
            var2.field303 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2288[var26] = var2.method313();
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
        this.field2270 = var9;
        this.field2255 = var10;
        this.field2269 = var11;
        this.field2276 = new int[var9];
        this.field2257 = new int[var9];
        this.field2258 = new int[var9];
        this.field2277 = new int[var10];
        this.field2275 = new int[var10];
        this.field2262 = new int[var10];
        if (var17 == 1) {
            this.field2282 = new int[var9];
        }
        if (var12 == 1) {
            this.field2263 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2264 = new byte[var10];
        } else {
            this.field2259 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2265 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2283 = new int[var10];
        }
        if (var16 == 1) {
            this.field2268 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2266 = new byte[var10];
        }
        this.field2267 = new short[var10];
        if (var11 > 0) {
            this.field2272 = new short[var11];
            this.field2300 = new short[var11];
            this.field2274 = new short[var11];
            if (var24 > 0) {
                this.field2271 = new short[var24];
                this.field2285 = new short[var24];
                this.field2290 = new short[var24];
                this.field2278 = new short[var24];
                this.field2281 = new byte[var24];
                this.field2291 = new short[var24];
            }
            if (var25 > 0) {
                this.field2280 = new short[var25];
            }
        }
        var2.field303 = var11;
        var3.field303 = var44;
        var4.field303 = var46;
        var5.field303 = var48;
        var6.field303 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method450();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method324();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method324();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method324();
            }
            this.field2276[var67] = var64 + var69;
            this.field2257[var67] = var65 + var70;
            this.field2258[var67] = var66 + var71;
            var64 = this.field2276[var67];
            var65 = this.field2257[var67];
            var66 = this.field2258[var67];
            if (var17 == 1) {
                this.field2282[var67] = var6.method450();
            }
        }
        var2.field303 = var42;
        var3.field303 = var31;
        var4.field303 = var34;
        var5.field303 = var37;
        var6.field303 = var35;
        var7.field303 = var40;
        var8.field303 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2267[var72] = (short) var2.method349();
            if (var12 == 1) {
                this.field2263[var72] = var3.method313();
            }
            if (var13 == 255) {
                this.field2264[var72] = var4.method313();
            }
            if (var14 == 1) {
                this.field2265[var72] = var5.method313();
            }
            if (var15 == 1) {
                this.field2283[var72] = var6.method450();
            }
            if (var16 == 1) {
                this.field2268[var72] = (short) (var7.method349() - 1);
            }
            if (this.field2266 != null && this.field2268[var72] != -1) {
                this.field2266[var72] = (byte) (var8.method450() - 1);
            }
        }
        var2.field303 = var33;
        var3.field303 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method450();
            if (var78 == 1) {
                var73 = var2.method324() + var76;
                var74 = var2.method324() + var73;
                var75 = var2.method324() + var74;
                var76 = var75;
                this.field2277[var77] = var73;
                this.field2275[var77] = var74;
                this.field2262[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method324() + var76;
                var76 = var75;
                this.field2277[var77] = var73;
                this.field2275[var77] = var74;
                this.field2262[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method324() + var76;
                var76 = var75;
                this.field2277[var77] = var73;
                this.field2275[var77] = var74;
                this.field2262[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method324() + var76;
                var76 = var75;
                this.field2277[var77] = var73;
                this.field2275[var77] = var81;
                this.field2262[var77] = var75;
            }
        }
        var2.field303 = var50;
        var3.field303 = var52;
        var4.field303 = var54;
        var5.field303 = var56;
        var6.field303 = var58;
        var7.field303 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2288[var82] & 0xFF;
            if (var83 == 0) {
                this.field2272[var82] = (short) var2.method349();
                this.field2300[var82] = (short) var2.method349();
                this.field2274[var82] = (short) var2.method349();
            }
            if (var83 == 1) {
                this.field2272[var82] = (short) var3.method349();
                this.field2300[var82] = (short) var3.method349();
                this.field2274[var82] = (short) var3.method349();
                this.field2271[var82] = (short) var4.method349();
                this.field2285[var82] = (short) var4.method349();
                this.field2290[var82] = (short) var4.method349();
                this.field2278[var82] = (short) var5.method349();
                this.field2281[var82] = var6.method313();
                this.field2291[var82] = (short) var7.method349();
            }
            if (var83 == 2) {
                this.field2272[var82] = (short) var3.method349();
                this.field2300[var82] = (short) var3.method349();
                this.field2274[var82] = (short) var3.method349();
                this.field2271[var82] = (short) var4.method349();
                this.field2285[var82] = (short) var4.method349();
                this.field2290[var82] = (short) var4.method349();
                this.field2278[var82] = (short) var5.method349();
                this.field2281[var82] = var6.method313();
                this.field2291[var82] = (short) var7.method349();
                this.field2280[var82] = (short) var7.method349();
            }
            if (var83 == 3) {
                this.field2272[var82] = (short) var3.method349();
                this.field2300[var82] = (short) var3.method349();
                this.field2274[var82] = (short) var3.method349();
                this.field2271[var82] = (short) var4.method349();
                this.field2285[var82] = (short) var4.method349();
                this.field2290[var82] = (short) var4.method349();
                this.field2278[var82] = (short) var5.method349();
                this.field2281[var82] = var6.method313();
                this.field2291[var82] = (short) var7.method349();
            }
        }
        var2.field303 = var62;
        int var84 = var2.method450();
        if (var84 == 0) {
            return;
        }
        new class146();
        var2.method349();
        var2.method349();
        var2.method349();
        var2.method504();
    }

    @ObfuscatedName("cl.q(II)I")
    public static final int method2727(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("cl.u()V")
    public void method2731() {
        for (int var1 = 0; var1 < this.field2270; var1++) {
            this.field2276[var1] = -this.field2276[var1];
            this.field2258[var1] = -this.field2258[var1];
        }
        this.method2672();
    }

    @ObfuscatedName("cl.l(Lcl;Lcl;IIIZ)V")
    public static void method2733(class151 arg0, class151 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2673();
        arg0.method2671();
        arg1.method2673();
        arg1.method2671();
        field2261++;
        int var6 = 0;
        int[] var7 = arg1.field2276;
        int var8 = arg1.field2270;
        for (int var9 = 0; var9 < arg0.field2270; var9++) {
            class144 var10 = arg0.field2287[var9];
            if (var10.field2162 != 0) {
                int var11 = arg0.field2257[var9] - arg3;
                if (var11 <= arg1.field2292) {
                    int var12 = arg0.field2276[var9] - arg2;
                    if (var12 >= arg1.field2293 && var12 <= arg1.field2294) {
                        int var13 = arg0.field2258[var9] - arg4;
                        if (var13 >= arg1.field2296 && var13 <= arg1.field2295) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class144 var15 = arg1.field2287[var14];
                                if (var7[var14] == var12 && arg1.field2258[var14] == var13 && arg1.field2257[var14] == var11 && var15.field2162 != 0) {
                                    if (arg0.field2279 == null) {
                                        arg0.field2279 = new class144[arg0.field2270];
                                    }
                                    if (arg1.field2279 == null) {
                                        arg1.field2279 = new class144[var8];
                                    }
                                    class144 var16 = arg0.field2279[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2279[var9] = new class144(var10);
                                    }
                                    class144 var17 = arg1.field2279[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2279[var14] = new class144(var15);
                                    }
                                    var16.field2168 += var15.field2168;
                                    var16.field2166 += var15.field2166;
                                    var16.field2164 += var15.field2164;
                                    var16.field2162 += var15.field2162;
                                    var17.field2168 += var10.field2168;
                                    var17.field2166 += var10.field2166;
                                    var17.field2164 += var10.field2164;
                                    var17.field2162 += var10.field2162;
                                    var6++;
                                    field2297[var9] = field2261;
                                    field2299[var14] = field2261;
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
        for (int var18 = 0; var18 < arg0.field2255; var18++) {
            if (field2297[arg0.field2277[var18]] == field2261 && field2297[arg0.field2275[var18]] == field2261 && field2297[arg0.field2262[var18]] == field2261) {
                if (arg0.field2263 == null) {
                    arg0.field2263 = new byte[arg0.field2255];
                }
                arg0.field2263[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2255; var19++) {
            if (field2299[arg1.field2277[var19]] == field2261 && field2299[arg1.field2275[var19]] == field2261 && field2299[arg1.field2262[var19]] == field2261) {
                if (arg1.field2263 == null) {
                    arg1.field2263 = new byte[arg1.field2255];
                }
                arg1.field2263[var19] = 2;
            }
        }
    }
}
