package deob;

@ObfuscatedName("iy")
public class class221 extends class484 {

    @ObfuscatedName("iy.av")
    public static class302 field2246 = new class302(64);

    @ObfuscatedName("iy.ag")
    public static class302 field2266 = new class302(50);

    @ObfuscatedName("iy.aa")
    public static class302 field2271 = new class302(200);

    @ObfuscatedName("iy.ay")
    public int field2254;

    @ObfuscatedName("iy.as")
    public int field2250;

    @ObfuscatedName("iy.aj")
    public String field2251 = class367.field3956;

    @ObfuscatedName("iy.an")
    public short[] field2252;

    @ObfuscatedName("iy.au")
    public short[] field2253;

    @ObfuscatedName("iy.ai")
    public short[] field2287;

    @ObfuscatedName("iy.ae")
    public short[] field2288;

    @ObfuscatedName("iy.aw")
    public int field2270 = 2000;

    @ObfuscatedName("iy.aq")
    public int field2274 = 0;

    @ObfuscatedName("iy.az")
    public int field2243 = 0;

    @ObfuscatedName("iy.at")
    public int field2259 = 0;

    @ObfuscatedName("iy.af")
    public int field2260 = 0;

    @ObfuscatedName("iy.ad")
    public int field2282 = 0;

    @ObfuscatedName("iy.by")
    public int field2262 = 0;

    @ObfuscatedName("iy.bd")
    public int field2257 = 1;

    @ObfuscatedName("iy.be")
    public int field2264 = -1;

    @ObfuscatedName("iy.bv")
    public int field2265 = -1;

    @ObfuscatedName("iy.ba")
    public int field2283 = -1;

    @ObfuscatedName("iy.bz")
    public boolean field2267 = false;

    @ObfuscatedName("iy.bb")
    public String[] field2268 = new String[] { null, null, class367.field3949, null, null };

    @ObfuscatedName("iy.bo")
    public String[] field2269 = new String[] { null, null, null, null, class367.field4124 };

    @ObfuscatedName("iy.bt")
    public int field2249 = -2;

    @ObfuscatedName("iy.bm")
    public int field2284 = -1;

    @ObfuscatedName("iy.br")
    public int field2272 = -1;

    @ObfuscatedName("iy.bs")
    public int field2248 = 0;

    @ObfuscatedName("iy.bc")
    public int field2247 = -1;

    @ObfuscatedName("iy.bu")
    public int field2273 = -1;

    @ObfuscatedName("iy.bf")
    public int field2276 = 0;

    @ObfuscatedName("iy.bh")
    public int field2277 = -1;

    @ObfuscatedName("iy.bl")
    public int field2278 = -1;

    @ObfuscatedName("iy.bg")
    public int field2279 = -1;

    @ObfuscatedName("iy.bj")
    public int field2255 = -1;

    @ObfuscatedName("iy.bx")
    public int field2281 = -1;

    @ObfuscatedName("iy.bi")
    public int field2290 = -1;

    @ObfuscatedName("iy.bq")
    public int[] field2275;

    @ObfuscatedName("iy.bw")
    public int[] field2244;

    @ObfuscatedName("iy.ce")
    public int field2285 = -1;

    @ObfuscatedName("iy.cu")
    public int field2291 = -1;

    @ObfuscatedName("iy.cw")
    public int field2263 = 128;

    @ObfuscatedName("iy.co")
    public int field2256 = 128;

    @ObfuscatedName("iy.cc")
    public int field2289 = 128;

    @ObfuscatedName("iy.cg")
    public int field2261 = 0;

    @ObfuscatedName("iy.cq")
    public int field2280 = 0;

    @ObfuscatedName("iy.cy")
    public int field2292 = 0;

    @ObfuscatedName("iy.cz")
    public int field2293 = 0;

    @ObfuscatedName("iy.cp")
    public class503 field2294;

    @ObfuscatedName("iy.cb")
    public boolean field2295 = false;

    @ObfuscatedName("iy.cn")
    public int field2296 = -1;

    @ObfuscatedName("iy.ck")
    public int field2297 = -1;

    @ObfuscatedName("iy.cr")
    public int field2298 = -1;

    @ObfuscatedName("iy.cs")
    public int field2299 = -1;

    @ObfuscatedName("dv.ac(Lom;Lom;ZLpu;I)V")
    public static void method2089(class374 arg0, class374 arg1, boolean arg2, class409 arg3) {
        Statics.field3415 = arg0;
        Statics.field3838 = arg1;
        Statics.field1271 = arg2;
        Statics.field3066 = Statics.field3415.method6273(10);
        Statics.field1642 = arg3;
    }

    @ObfuscatedName("im.al(IB)Liy;")
    public static class221 method3594(int arg0) {
        class221 var1 = (class221) field2246.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3415.method6342(10, arg0);
        class221 var3 = new class221();
        var3.field2254 = arg0;
        if (var2 != null) {
            var3.method3735(new class530(var2));
        }
        var3.method3734();
        if (var3.field2291 != -1) {
            var3.method3743(method3594(var3.field2291), method3594(var3.field2285));
        }
        if (var3.field2297 != -1) {
            var3.method3812(method3594(var3.field2297), method3594(var3.field2296));
        }
        if (var3.field2299 != -1) {
            var3.method3762(method3594(var3.field2299), method3594(var3.field2298));
        }
        if (!Statics.field1271 && var3.field2267) {
            if (var3.field2291 == -1 && var3.field2297 == -1 && var3.field2299 == -1) {
                var3.field2251 = var3.field2251 + class367.field4206;
            }
            var3.field2295 = false;
            for (int var4 = 0; var4 < var3.field2268.length; var4++) {
                var3.field2268[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2269.length; var5++) {
                if (var5 != 4) {
                    var3.field2269[var5] = null;
                }
            }
            var3.field2249 = -2;
            var3.field2292 = 0;
            if (var3.field2294 != null) {
                boolean var6 = false;
                for (class488 var7 = var3.field2294.method8073(); var7 != null; var7 = var3.field2294.method8074()) {
                    class216 var8 = class216.method3279((int) var7.field4857);
                    if (var8.field2153) {
                        var7.method7776();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2294 = null;
                }
            }
        }
        field2246.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.ak(I)V")
    public void method3734() {
        if (this.field2262 == 1) {
            this.field2293 = 0;
        }
    }

    @ObfuscatedName("iy.ax(Lul;I)V")
    public void method3735(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3777(arg0, var2);
        }
    }

    @ObfuscatedName("iy.ao(Lul;II)V")
    public void method3777(class530 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2250 = arg0.method8598();
        } else if (arg1 == 2) {
            this.field2251 = arg0.method8588();
        } else if (arg1 == 4) {
            this.field2270 = arg0.method8598();
        } else if (arg1 == 5) {
            this.field2274 = arg0.method8598();
        } else if (arg1 == 6) {
            this.field2243 = arg0.method8598();
        } else if (arg1 == 7) {
            this.field2260 = arg0.method8598();
            if (this.field2260 > 32767) {
                this.field2260 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2282 = arg0.method8598();
            if (this.field2282 > 32767) {
                this.field2282 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8588();
        } else if (arg1 == 11) {
            this.field2262 = 1;
        } else if (arg1 == 12) {
            this.field2257 = arg0.method8371();
        } else if (arg1 == 13) {
            this.field2264 = arg0.method8365();
        } else if (arg1 == 14) {
            this.field2265 = arg0.method8365();
        } else if (arg1 == 16) {
            this.field2267 = true;
        } else if (arg1 == 23) {
            this.field2284 = arg0.method8598();
            this.field2248 = arg0.method8365();
        } else if (arg1 == 24) {
            this.field2272 = arg0.method8598();
        } else if (arg1 == 25) {
            this.field2247 = arg0.method8598();
            this.field2276 = arg0.method8365();
        } else if (arg1 == 26) {
            this.field2273 = arg0.method8598();
        } else if (arg1 == 27) {
            this.field2283 = arg0.method8365();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2268[arg1 - 30] = arg0.method8588();
            if (this.field2268[arg1 - 30].equalsIgnoreCase(class367.field3951)) {
                this.field2268[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2269[arg1 - 35] = arg0.method8588();
        } else if (arg1 == 40) {
            int var3 = arg0.method8365();
            this.field2252 = new short[var3];
            this.field2253 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2252[var4] = (short) arg0.method8598();
                this.field2253[var4] = (short) arg0.method8598();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8365();
            this.field2287 = new short[var5];
            this.field2288 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2287[var6] = (short) arg0.method8598();
                this.field2288[var6] = (short) arg0.method8598();
            }
        } else if (arg1 == 42) {
            this.field2249 = arg0.method8366();
        } else if (arg1 == 65) {
            this.field2295 = true;
        } else if (arg1 == 75) {
            this.field2293 = arg0.method8368();
        } else if (arg1 == 78) {
            this.field2277 = arg0.method8598();
        } else if (arg1 == 79) {
            this.field2278 = arg0.method8598();
        } else if (arg1 == 90) {
            this.field2279 = arg0.method8598();
        } else if (arg1 == 91) {
            this.field2281 = arg0.method8598();
        } else if (arg1 == 92) {
            this.field2255 = arg0.method8598();
        } else if (arg1 == 93) {
            this.field2290 = arg0.method8598();
        } else if (arg1 == 94) {
            arg0.method8598();
        } else if (arg1 == 95) {
            this.field2259 = arg0.method8598();
        } else if (arg1 == 97) {
            this.field2285 = arg0.method8598();
        } else if (arg1 == 98) {
            this.field2291 = arg0.method8598();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2275 == null) {
                this.field2275 = new int[10];
                this.field2244 = new int[10];
            }
            this.field2275[arg1 - 100] = arg0.method8598();
            this.field2244[arg1 - 100] = arg0.method8598();
        } else if (arg1 == 110) {
            this.field2263 = arg0.method8598();
        } else if (arg1 == 111) {
            this.field2256 = arg0.method8598();
        } else if (arg1 == 112) {
            this.field2289 = arg0.method8598();
        } else if (arg1 == 113) {
            this.field2261 = arg0.method8366();
        } else if (arg1 == 114) {
            this.field2280 = arg0.method8366() * 5;
        } else if (arg1 == 115) {
            this.field2292 = arg0.method8365();
        } else if (arg1 == 139) {
            this.field2296 = arg0.method8598();
        } else if (arg1 == 140) {
            this.field2297 = arg0.method8598();
        } else if (arg1 == 148) {
            this.field2298 = arg0.method8598();
        } else if (arg1 == 149) {
            this.field2299 = arg0.method8598();
        } else if (arg1 == 249) {
            this.field2294 = class199.method3135(arg0, this.field2294);
        }
    }

    @ObfuscatedName("iy.ah(Liy;Liy;B)V")
    public void method3743(class221 arg0, class221 arg1) {
        this.field2250 = arg0.field2250;
        this.field2270 = arg0.field2270;
        this.field2274 = arg0.field2274;
        this.field2243 = arg0.field2243;
        this.field2259 = arg0.field2259;
        this.field2260 = arg0.field2260;
        this.field2282 = arg0.field2282;
        this.field2252 = arg0.field2252;
        this.field2253 = arg0.field2253;
        this.field2287 = arg0.field2287;
        this.field2288 = arg0.field2288;
        this.field2251 = arg1.field2251;
        this.field2267 = arg1.field2267;
        this.field2257 = arg1.field2257;
        this.field2262 = 1;
    }

    @ObfuscatedName("iy.ar(Liy;Liy;I)V")
    public void method3812(class221 arg0, class221 arg1) {
        this.field2250 = arg0.field2250;
        this.field2270 = arg0.field2270;
        this.field2274 = arg0.field2274;
        this.field2243 = arg0.field2243;
        this.field2259 = arg0.field2259;
        this.field2260 = arg0.field2260;
        this.field2282 = arg0.field2282;
        this.field2252 = arg1.field2252;
        this.field2253 = arg1.field2253;
        this.field2287 = arg1.field2287;
        this.field2288 = arg1.field2288;
        this.field2251 = arg1.field2251;
        this.field2267 = arg1.field2267;
        this.field2262 = arg1.field2262;
        this.field2264 = arg1.field2264;
        this.field2265 = arg1.field2265;
        this.field2283 = arg1.field2283;
        this.field2284 = arg1.field2284;
        this.field2272 = arg1.field2272;
        this.field2277 = arg1.field2277;
        this.field2247 = arg1.field2247;
        this.field2273 = arg1.field2273;
        this.field2278 = arg1.field2278;
        this.field2279 = arg1.field2279;
        this.field2255 = arg1.field2255;
        this.field2281 = arg1.field2281;
        this.field2290 = arg1.field2290;
        this.field2292 = arg1.field2292;
        this.field2268 = arg1.field2268;
        this.field2293 = arg1.field2293;
        this.field2269 = new String[5];
        if (arg1.field2269 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2269[var3] = arg1.field2269[var3];
            }
        }
        this.field2269[4] = class367.field4076;
        this.field2257 = 0;
    }

    @ObfuscatedName("iy.ab(Liy;Liy;S)V")
    public void method3762(class221 arg0, class221 arg1) {
        this.field2250 = arg0.field2250;
        this.field2270 = arg0.field2270;
        this.field2274 = arg0.field2274;
        this.field2243 = arg0.field2243;
        this.field2259 = arg0.field2259;
        this.field2260 = arg0.field2260;
        this.field2282 = arg0.field2282;
        this.field2252 = arg0.field2252;
        this.field2253 = arg0.field2253;
        this.field2287 = arg0.field2287;
        this.field2288 = arg0.field2288;
        this.field2262 = arg0.field2262;
        this.field2251 = arg1.field2251;
        this.field2257 = 0;
        this.field2267 = false;
        this.field2295 = false;
    }

    @ObfuscatedName("iy.am(IB)Ljw;")
    public final class236 method3739(int arg0) {
        if (this.field2275 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2244[var3] && this.field2244[var3] != 0) {
                    var2 = this.field2275[var3];
                }
            }
            if (var2 != -1) {
                return method3594(var2).method3739(1);
            }
        }
        class236 var4 = class236.method4058(Statics.field3838, this.field2250, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2263 != 128 || this.field2256 != 128 || this.field2289 != 128) {
            var4.method4113(this.field2263, this.field2256, this.field2289);
        }
        if (this.field2252 != null) {
            for (int var5 = 0; var5 < this.field2252.length; var5++) {
                var4.method4132(this.field2252[var5], this.field2253[var5]);
            }
        }
        if (this.field2287 != null) {
            for (int var6 = 0; var6 < this.field2287.length; var6++) {
                var4.method4074(this.field2287[var6], this.field2288[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iy.av(IB)Ljn;")
    public final class254 method3770(int arg0) {
        if (this.field2275 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2244[var3] && this.field2244[var3] != 0) {
                    var2 = this.field2275[var3];
                }
            }
            if (var2 != -1) {
                return method3594(var2).method3770(1);
            }
        }
        class254 var4 = (class254) field2266.method5286((long) this.field2254);
        if (var4 != null) {
            return var4;
        }
        class236 var5 = class236.method4058(Statics.field3838, this.field2250, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2263 != 128 || this.field2256 != 128 || this.field2289 != 128) {
            var5.method4113(this.field2263, this.field2256, this.field2289);
        }
        if (this.field2252 != null) {
            for (int var6 = 0; var6 < this.field2252.length; var6++) {
                var5.method4132(this.field2252[var6], this.field2253[var6]);
            }
        }
        if (this.field2287 != null) {
            for (int var7 = 0; var7 < this.field2287.length; var7++) {
                var5.method4074(this.field2287[var7], this.field2288[var7]);
            }
        }
        class254 var8 = var5.method4080(this.field2261 + 64, this.field2280 + 768, -50, -10, -50);
        var8.field2756 = true;
        field2266.method5289(var8, (long) this.field2254);
        return var8;
    }

    @ObfuscatedName("iy.ag(II)Liy;")
    public class221 method3741(int arg0) {
        if (this.field2275 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2244[var3] && this.field2244[var3] != 0) {
                    var2 = this.field2275[var3];
                }
            }
            if (var2 != -1) {
                return method3594(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("gj.aa(IIIIIZI)Lud;")
    public static final class544 method3091(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class544 var8 = (class544) field2271.method5286(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class221 var9 = method3594(arg0);
        if (arg1 > 1 && var9.field2275 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2244[var11] && var9.field2244[var11] != 0) {
                    var10 = var9.field2275[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3594(var10);
            }
        }
        class254 var12 = var9.method3770(1);
        if (var12 == null) {
            return null;
        }
        class544 var13 = null;
        if (var9.field2291 != -1) {
            var13 = method3091(var9.field2285, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2297 != -1) {
            var13 = method3091(var9.field2296, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2299 != -1) {
            var13 = method3091(var9.field2298, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5211;
        int var15 = Statics.field5207;
        int var16 = Statics.field5209;
        float[] var17 = Statics.field5210;
        int[] var18 = new int[4];
        class540.method8696(var18);
        class544 var19 = new class544(36, 32);
        class241.method4165(var19.field5235, 36, 32, (float[]) null);
        class540.method8698();
        class241.method4170();
        class241.method4169(16, 16);
        class241.field2551.field2832 = false;
        if (var9.field2299 != -1) {
            var13.method8823(0, 0);
        }
        int var20 = var9.field2270;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class241.field2553[var9.field2274] * var20 >> 16;
        int var22 = class241.field2554[var9.field2274] * var20 >> 16;
        var12.method4543();
        var12.method4566(0, var9.field2243, var9.field2259, var9.field2274, var9.field2260, var9.field2282 + var12.field2662 / 2 + var21, var9.field2282 + var22);
        if (var9.field2297 != -1) {
            var13.method8823(0, 0);
        }
        if (arg2 >= 1) {
            var19.method8835(1);
        }
        if (arg2 >= 2) {
            var19.method8835(16777215);
        }
        if (arg3 != 0) {
            var19.method8903(arg3);
        }
        class241.method4165(var19.field5235, 36, 32, (float[]) null);
        if (var9.field2291 != -1) {
            var13.method8823(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2262 == 1) {
            Statics.field1642.method6954(method7763(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2271.method5289(var19, var6);
        }
        class241.method4165(var14, var15, var16, var17);
        class540.method8697(var18);
        class241.method4170();
        class241.field2551.field2832 = true;
        return var19;
    }

    @ObfuscatedName("sa.ap(II)Ljava/lang/String;")
    public static final String method7763(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class367.field4218 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class367.field4255 + "</col>";
        }
    }

    @ObfuscatedName("iy.ay(II)Z")
    public final boolean method3742(int arg0) {
        int var2 = this.field2284;
        int var3 = this.field2272;
        int var4 = this.field2277;
        if (arg0 == 1) {
            var2 = this.field2247;
            var3 = this.field2273;
            var4 = this.field2278;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3838.method6265(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3838.method6265(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3838.method6265(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("iy.as(IB)Ljw;")
    public final class236 method3811(int arg0) {
        int var2 = this.field2284;
        int var3 = this.field2272;
        int var4 = this.field2277;
        if (arg0 == 1) {
            var2 = this.field2247;
            var3 = this.field2273;
            var4 = this.field2278;
        }
        if (var2 == -1) {
            return null;
        }
        class236 var5 = class236.method4058(Statics.field3838, var2, 0);
        if (var3 != -1) {
            class236 var6 = class236.method4058(Statics.field3838, var3, 0);
            if (var4 == -1) {
                class236[] var9 = new class236[] { var5, var6 };
                var5 = new class236(var9, 2);
            } else {
                class236 var7 = class236.method4058(Statics.field3838, var4, 0);
                class236[] var8 = new class236[] { var5, var6, var7 };
                var5 = new class236(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2248 != 0) {
            var5.method4104(0, this.field2248, 0);
        }
        if (arg0 == 1 && this.field2276 != 0) {
            var5.method4104(0, this.field2276, 0);
        }
        if (this.field2252 != null) {
            for (int var10 = 0; var10 < this.field2252.length; var10++) {
                var5.method4132(this.field2252[var10], this.field2253[var10]);
            }
        }
        if (this.field2287 != null) {
            for (int var11 = 0; var11 < this.field2287.length; var11++) {
                var5.method4074(this.field2287[var11], this.field2288[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("iy.aj(II)Z")
    public final boolean method3744(int arg0) {
        int var2 = this.field2279;
        int var3 = this.field2255;
        if (arg0 == 1) {
            var2 = this.field2281;
            var3 = this.field2290;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3838.method6265(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3838.method6265(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("iy.an(IB)Ljw;")
    public final class236 method3745(int arg0) {
        int var2 = this.field2279;
        int var3 = this.field2255;
        if (arg0 == 1) {
            var2 = this.field2281;
            var3 = this.field2290;
        }
        if (var2 == -1) {
            return null;
        }
        class236 var4 = class236.method4058(Statics.field3838, var2, 0);
        if (var3 != -1) {
            class236 var5 = class236.method4058(Statics.field3838, var3, 0);
            class236[] var6 = new class236[] { var4, var5 };
            var4 = new class236(var6, 2);
        }
        if (this.field2252 != null) {
            for (int var7 = 0; var7 < this.field2252.length; var7++) {
                var4.method4132(this.field2252[var7], this.field2253[var7]);
            }
        }
        if (this.field2287 != null) {
            for (int var8 = 0; var8 < this.field2287.length; var8++) {
                var4.method4074(this.field2287[var8], this.field2288[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("iy.au(III)I")
    public int method3738(int arg0, int arg1) {
        return class199.method2595(this.field2294, arg0, arg1);
    }

    @ObfuscatedName("iy.ai(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3778(int arg0, String arg1) {
        return class199.method439(this.field2294, arg0, arg1);
    }

    @ObfuscatedName("iy.ae(I)I")
    public int method3817() {
        if (this.field2249 == -1 || this.field2269 == null) {
            return -1;
        } else if (this.field2249 >= 0) {
            return this.field2269[this.field2249] == null ? -1 : this.field2249;
        } else if (class367.field4124.equalsIgnoreCase(this.field2269[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("mm.aw(I)V")
    public static void method5345() {
        field2246.method5288();
        field2266.method5288();
        field2271.method5288();
    }

    @ObfuscatedName("na.aq(ZI)V")
    public static void method6160(boolean arg0) {
        if (Statics.field1271 != arg0) {
            method5345();
            Statics.field1271 = arg0;
        }
    }

    @ObfuscatedName("iy.az(B)Z")
    public boolean method3749() {
        return this.field2253 != null;
    }

    @ObfuscatedName("iy.at(B)Z")
    public boolean method3750() {
        return this.field2288 != null;
    }
}
