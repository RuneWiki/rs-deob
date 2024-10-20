package deob;

@ObfuscatedName("ip")
public class class211 extends class511 {

    @ObfuscatedName("ip.au")
    public static class316 field2249 = new class316(64);

    @ObfuscatedName("ip.an")
    public static class316 field2226 = new class316(50);

    @ObfuscatedName("ip.ao")
    public static class316 field2235 = new class316(200);

    @ObfuscatedName("ip.ar")
    public int field2236;

    @ObfuscatedName("ip.ab")
    public int field2237;

    @ObfuscatedName("ip.az")
    public String field2282 = class383.field4405;

    @ObfuscatedName("ip.ag")
    public String field2239 = class383.field4405;

    @ObfuscatedName("ip.ad")
    public short[] field2240;

    @ObfuscatedName("ip.ac")
    public short[] field2241;

    @ObfuscatedName("ip.av")
    public short[] field2242;

    @ObfuscatedName("ip.ax")
    public short[] field2243;

    @ObfuscatedName("ip.aq")
    public int field2244 = 2000;

    @ObfuscatedName("ip.al")
    public int field2262 = 0;

    @ObfuscatedName("ip.aa")
    public int field2246 = 0;

    @ObfuscatedName("ip.ah")
    public int field2287 = 0;

    @ObfuscatedName("ip.bh")
    public int field2256 = 0;

    @ObfuscatedName("ip.bj")
    public int field2245 = 0;

    @ObfuscatedName("ip.bk")
    public int field2250 = 0;

    @ObfuscatedName("ip.bb")
    public int field2234 = 1;

    @ObfuscatedName("ip.bq")
    public int field2252 = -1;

    @ObfuscatedName("ip.bp")
    public int field2253 = -1;

    @ObfuscatedName("ip.bz")
    public int field2254 = -1;

    @ObfuscatedName("ip.bc")
    public boolean field2268 = false;

    @ObfuscatedName("ip.by")
    public String[] field2238 = new String[] { null, null, class383.field4181, null, null };

    @ObfuscatedName("ip.br")
    public String[] field2260 = new String[] { null, null, null, null, class383.field4182 };

    @ObfuscatedName("ip.bn")
    public String[][] field2258 = (String[][]) null;

    @ObfuscatedName("ip.bt")
    public int field2259 = -2;

    @ObfuscatedName("ip.bs")
    public int field2290 = -1;

    @ObfuscatedName("ip.bm")
    public int field2248 = -1;

    @ObfuscatedName("ip.bo")
    public int field2277 = 0;

    @ObfuscatedName("ip.bd")
    public int field2263 = -1;

    @ObfuscatedName("ip.ba")
    public int field2247 = -1;

    @ObfuscatedName("ip.bw")
    public int field2265 = 0;

    @ObfuscatedName("ip.bi")
    public int field2266 = -1;

    @ObfuscatedName("ip.bf")
    public int field2255 = -1;

    @ObfuscatedName("ip.bg")
    public int field2264 = -1;

    @ObfuscatedName("ip.bl")
    public int field2269 = -1;

    @ObfuscatedName("ip.be")
    public int field2270 = -1;

    @ObfuscatedName("ip.cq")
    public int field2271 = -1;

    @ObfuscatedName("ip.cb")
    public int[] field2251;

    @ObfuscatedName("ip.cd")
    public int[] field2273;

    @ObfuscatedName("ip.ci")
    public int field2274 = -1;

    @ObfuscatedName("ip.cn")
    public int field2275 = -1;

    @ObfuscatedName("ip.co")
    public int field2276 = 128;

    @ObfuscatedName("ip.cf")
    public int field2257 = 128;

    @ObfuscatedName("ip.cl")
    public int field2278 = 128;

    @ObfuscatedName("ip.cp")
    public int field2279 = 0;

    @ObfuscatedName("ip.cv")
    public int field2280 = 0;

    @ObfuscatedName("ip.cy")
    public int field2281 = 0;

    @ObfuscatedName("ip.cu")
    public int field2272 = 0;

    @ObfuscatedName("ip.ce")
    public class530 field2283;

    @ObfuscatedName("ip.cg")
    public boolean field2284 = false;

    @ObfuscatedName("ip.cx")
    public int field2285 = -1;

    @ObfuscatedName("ip.cz")
    public int field2286 = -1;

    @ObfuscatedName("ip.ch")
    public int field2229 = -1;

    @ObfuscatedName("ip.ct")
    public int field2288 = -1;

    @ObfuscatedName("qg.aw(II)Lip;")
    public static class211 method7530(int arg0) {
        class211 var1 = (class211) field2249.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2231.method7009(10, arg0);
        class211 var3 = new class211();
        var3.field2236 = arg0;
        if (var2 != null) {
            var3.method4005(new class558(var2));
        }
        var3.method4004();
        if (var3.field2275 != -1) {
            var3.method4057(method7530(var3.field2275), method7530(var3.field2274));
        }
        if (var3.field2286 != -1) {
            var3.method4032(method7530(var3.field2286), method7530(var3.field2285));
        }
        if (var3.field2288 != -1) {
            var3.method4049(method7530(var3.field2288), method7530(var3.field2229));
        }
        if (!Statics.field4946 && var3.field2268) {
            if (var3.field2275 == -1 && var3.field2286 == -1 && var3.field2288 == -1) {
                var3.field2282 = var3.field2282 + class383.field4303;
            }
            var3.field2239 = class383.field4179;
            var3.field2284 = false;
            for (int var4 = 0; var4 < var3.field2238.length; var4++) {
                var3.field2238[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2260.length; var5++) {
                if (var5 != 4) {
                    if (var3.field2258 != null) {
                        var3.field2258[var5] = null;
                    }
                    var3.field2260[var5] = null;
                }
            }
            var3.field2259 = -2;
            var3.field2281 = 0;
            if (var3.field2283 != null) {
                boolean var6 = false;
                for (class515 var7 = var3.field2283.method8964(); var7 != null; var7 = var3.field2283.method8967()) {
                    class206 var8 = class206.method5812((int) var7.field5170);
                    if (var8.field2136) {
                        var7.method8667();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2283 = null;
                }
            }
        }
        field2249.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.ak(I)V")
    public void method4004() {
        if (this.field2250 == 1) {
            this.field2272 = 0;
        }
    }

    @ObfuscatedName("ip.aj(Lvl;B)V")
    public void method4005(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method4006(arg0, var2);
        }
    }

    @ObfuscatedName("ip.ai(Lvl;IB)V")
    public void method4006(class558 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2237 = arg0.method9260();
        } else if (arg1 == 2) {
            this.field2282 = arg0.method9269();
        } else if (arg1 == 3) {
            this.field2239 = arg0.method9269();
        } else if (arg1 == 4) {
            this.field2244 = arg0.method9260();
        } else if (arg1 == 5) {
            this.field2262 = arg0.method9260();
        } else if (arg1 == 6) {
            this.field2246 = arg0.method9260();
        } else if (arg1 == 7) {
            this.field2256 = arg0.method9260();
            if (this.field2256 > 32767) {
                this.field2256 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2245 = arg0.method9260();
            if (this.field2245 > 32767) {
                this.field2245 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method9269();
        } else if (arg1 == 11) {
            this.field2250 = 1;
        } else if (arg1 == 12) {
            this.field2234 = arg0.method9264();
        } else if (arg1 == 13) {
            this.field2252 = arg0.method9258();
        } else if (arg1 == 14) {
            this.field2253 = arg0.method9258();
        } else if (arg1 == 16) {
            this.field2268 = true;
        } else if (arg1 == 23) {
            this.field2290 = arg0.method9260();
            this.field2277 = arg0.method9258();
        } else if (arg1 == 24) {
            this.field2248 = arg0.method9260();
        } else if (arg1 == 25) {
            this.field2263 = arg0.method9260();
            this.field2265 = arg0.method9258();
        } else if (arg1 == 26) {
            this.field2247 = arg0.method9260();
        } else if (arg1 == 27) {
            this.field2254 = arg0.method9258();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2238[arg1 - 30] = arg0.method9269();
            if (this.field2238[arg1 - 30].equalsIgnoreCase(class383.field4183)) {
                this.field2238[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2260[arg1 - 35] = arg0.method9269();
        } else if (arg1 == 40) {
            int var3 = arg0.method9258();
            this.field2240 = new short[var3];
            this.field2241 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2240[var4] = (short) arg0.method9260();
                this.field2241[var4] = (short) arg0.method9260();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method9258();
            this.field2242 = new short[var5];
            this.field2243 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2242[var6] = (short) arg0.method9260();
                this.field2243[var6] = (short) arg0.method9260();
            }
        } else if (arg1 == 42) {
            this.field2259 = arg0.method9259();
        } else if (arg1 == 43) {
            int var7 = arg0.method9258();
            if (this.field2258 == null) {
                this.field2258 = new String[5][];
            }
            boolean var8 = var7 >= 0 && var7 < 5;
            if (var8 && this.field2258[var7] == null) {
                this.field2258[var7] = new String[20];
            }
            while (true) {
                int var9 = arg0.method9258() - 1;
                if (var9 == -1) {
                    break;
                }
                String var10 = arg0.method9269();
                if (var8 && var9 >= 0 && var9 < 20) {
                    this.field2258[var7][var9] = var10;
                }
            }
        } else if (arg1 == 65) {
            this.field2284 = true;
        } else if (arg1 == 75) {
            this.field2272 = arg0.method9261();
        } else if (arg1 == 78) {
            this.field2266 = arg0.method9260();
        } else if (arg1 == 79) {
            this.field2255 = arg0.method9260();
        } else if (arg1 == 90) {
            this.field2264 = arg0.method9260();
        } else if (arg1 == 91) {
            this.field2270 = arg0.method9260();
        } else if (arg1 == 92) {
            this.field2269 = arg0.method9260();
        } else if (arg1 == 93) {
            this.field2271 = arg0.method9260();
        } else if (arg1 == 94) {
            arg0.method9260();
        } else if (arg1 == 95) {
            this.field2287 = arg0.method9260();
        } else if (arg1 == 97) {
            this.field2274 = arg0.method9260();
        } else if (arg1 == 98) {
            this.field2275 = arg0.method9260();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2251 == null) {
                this.field2251 = new int[10];
                this.field2273 = new int[10];
            }
            this.field2251[arg1 - 100] = arg0.method9260();
            this.field2273[arg1 - 100] = arg0.method9260();
        } else if (arg1 == 110) {
            this.field2276 = arg0.method9260();
        } else if (arg1 == 111) {
            this.field2257 = arg0.method9260();
        } else if (arg1 == 112) {
            this.field2278 = arg0.method9260();
        } else if (arg1 == 113) {
            this.field2279 = arg0.method9259();
        } else if (arg1 == 114) {
            this.field2280 = arg0.method9259() * 5;
        } else if (arg1 == 115) {
            this.field2281 = arg0.method9258();
        } else if (arg1 == 139) {
            this.field2285 = arg0.method9260();
        } else if (arg1 == 140) {
            this.field2286 = arg0.method9260();
        } else if (arg1 == 148) {
            this.field2229 = arg0.method9260();
        } else if (arg1 == 149) {
            this.field2288 = arg0.method9260();
        } else if (arg1 == 249) {
            this.field2283 = class188.method2372(arg0, this.field2283);
        }
    }

    @ObfuscatedName("ip.ay(Lip;Lip;I)V")
    public void method4057(class211 arg0, class211 arg1) {
        this.field2237 = arg0.field2237;
        this.field2244 = arg0.field2244;
        this.field2262 = arg0.field2262;
        this.field2246 = arg0.field2246;
        this.field2287 = arg0.field2287;
        this.field2256 = arg0.field2256;
        this.field2245 = arg0.field2245;
        this.field2240 = arg0.field2240;
        this.field2241 = arg0.field2241;
        this.field2242 = arg0.field2242;
        this.field2243 = arg0.field2243;
        this.field2282 = arg1.field2282;
        this.field2239 = class383.field4271;
        this.field2268 = arg1.field2268;
        this.field2234 = arg1.field2234;
        this.field2250 = 1;
    }

    @ObfuscatedName("ip.as(Lip;Lip;I)V")
    public void method4032(class211 arg0, class211 arg1) {
        this.field2237 = arg0.field2237;
        this.field2244 = arg0.field2244;
        this.field2262 = arg0.field2262;
        this.field2246 = arg0.field2246;
        this.field2287 = arg0.field2287;
        this.field2256 = arg0.field2256;
        this.field2245 = arg0.field2245;
        this.field2240 = arg1.field2240;
        this.field2241 = arg1.field2241;
        this.field2242 = arg1.field2242;
        this.field2243 = arg1.field2243;
        this.field2282 = arg1.field2282;
        this.field2239 = arg1.field2239;
        this.field2268 = arg1.field2268;
        this.field2250 = arg1.field2250;
        this.field2252 = arg1.field2252;
        this.field2253 = arg1.field2253;
        this.field2254 = arg1.field2254;
        this.field2290 = arg1.field2290;
        this.field2248 = arg1.field2248;
        this.field2266 = arg1.field2266;
        this.field2263 = arg1.field2263;
        this.field2247 = arg1.field2247;
        this.field2255 = arg1.field2255;
        this.field2264 = arg1.field2264;
        this.field2269 = arg1.field2269;
        this.field2270 = arg1.field2270;
        this.field2271 = arg1.field2271;
        this.field2281 = arg1.field2281;
        this.field2238 = arg1.field2238;
        this.field2272 = arg1.field2272;
        this.field2260 = new String[5];
        if (arg1.field2260 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2260[var3] = arg1.field2260[var3];
            }
        }
        this.field2260[4] = class383.field4187;
        if (arg1.field2258 == null) {
            this.field2258 = (String[][]) null;
        } else {
            this.field2258 = new String[5][];
            System.arraycopy(arg1.field2258, 0, this.field2258, 0, 4);
        }
        this.field2234 = 0;
    }

    @ObfuscatedName("ip.ae(Lip;Lip;B)V")
    public void method4049(class211 arg0, class211 arg1) {
        this.field2237 = arg0.field2237;
        this.field2244 = arg0.field2244;
        this.field2262 = arg0.field2262;
        this.field2246 = arg0.field2246;
        this.field2287 = arg0.field2287;
        this.field2256 = arg0.field2256;
        this.field2245 = arg0.field2245;
        this.field2240 = arg0.field2240;
        this.field2241 = arg0.field2241;
        this.field2242 = arg0.field2242;
        this.field2243 = arg0.field2243;
        this.field2250 = arg0.field2250;
        this.field2282 = arg1.field2282;
        this.field2239 = arg1.field2239;
        this.field2234 = 0;
        this.field2268 = false;
        this.field2284 = false;
    }

    @ObfuscatedName("ip.am(IB)Ljj;")
    public final class235 method4009(int arg0) {
        if (this.field2251 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2273[var3] && this.field2273[var3] != 0) {
                    var2 = this.field2251[var3];
                }
            }
            if (var2 != -1) {
                return method7530(var2).method4009(1);
            }
        }
        class235 var4 = class235.method4408(Statics.field4786, this.field2237, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2276 != 128 || this.field2257 != 128 || this.field2278 != 128) {
            var4.method4476(this.field2276, this.field2257, this.field2278);
        }
        this.method4017(var4, (class176) null);
        return var4;
    }

    @ObfuscatedName("ip.at(II)Ljy;")
    public final class256 method4010(int arg0) {
        if (this.field2251 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2273[var3] && this.field2273[var3] != 0) {
                    var2 = this.field2251[var3];
                }
            }
            if (var2 != -1) {
                return method7530(var2).method4010(1);
            }
        }
        class256 var4 = (class256) field2226.method5928((long) this.field2236);
        if (var4 != null) {
            return var4;
        }
        class235 var5 = class235.method4408(Statics.field4786, this.field2237, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2276 != 128 || this.field2257 != 128 || this.field2278 != 128) {
            var5.method4476(this.field2276, this.field2257, this.field2278);
        }
        this.method4017(var5, (class176) null);
        class256 var6 = var5.method4460(this.field2279 + 64, this.field2280 + 768, -50, -10, -50);
        var6.field2842 = true;
        field2226.method5931(var6, (long) this.field2236);
        return var6;
    }

    @ObfuscatedName("ip.au(Lgz;I)Ljy;")
    public final class256 method4029(class176 arg0) {
        class256 var2 = arg0.field1868;
        if (var2 != null) {
            return var2;
        }
        class235 var3 = class235.method4408(Statics.field4786, arg0.field1877, 0);
        if (var3 == null) {
            return null;
        }
        if (this.field2276 != 128 || this.field2257 != 128 || this.field2278 != 128) {
            var3.method4476(this.field2276, this.field2257, this.field2278);
        }
        this.method4017(var3, arg0);
        class256 var4 = var3.method4460(this.field2279 + 64, this.field2280 + 768, -50, -10, -50);
        var4.field2842 = true;
        arg0.field1868 = var4;
        return var4;
    }

    @ObfuscatedName("ip.an(II)Lip;")
    public class211 method4011(int arg0) {
        if (this.field2251 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2273[var3] && this.field2273[var3] != 0) {
                    var2 = this.field2251[var3];
                }
            }
            if (var2 != -1) {
                return method7530(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ej.ao(IIIIIZI)Lvv;")
    public static final class572 method3108(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class572 var8 = (class572) field2235.method5928(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class211 var9 = method7530(arg0);
        if (arg1 > 1 && var9.field2251 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2273[var11] && var9.field2273[var11] != 0) {
                    var10 = var9.field2251[var11];
                }
            }
            if (var10 != -1) {
                var9 = method7530(var10);
            }
        }
        class256 var12 = var9.method4010(1);
        if (var12 == null) {
            return null;
        }
        class572 var13 = null;
        if (var9.field2275 != -1) {
            var13 = method3108(var9.field2274, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2286 != -1) {
            var13 = method3108(var9.field2285, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2288 != -1) {
            var13 = method3108(var9.field2229, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5533;
        int var15 = Statics.field5532;
        int var16 = Statics.field5531;
        float[] var17 = Statics.field5534;
        int[] var18 = new int[4];
        class568.method9665(var18);
        class572 var19 = new class572(36, 32);
        class240.method4506(var19.field5567, 36, 32, (float[]) null);
        class568.method9612();
        class240.method4580();
        class240.method4516(16, 16);
        class240.field2589.field2914 = false;
        if (var9.field2288 != -1) {
            var13.method9825(0, 0);
        }
        int var20 = var9.field2244;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class240.field2591[var9.field2262] * var20 >> 16;
        int var22 = class240.field2592[var9.field2262] * var20 >> 16;
        var12.method5013();
        var12.method5018(0, var9.field2246, var9.field2287, var9.field2262, var9.field2256, var9.field2245 + var12.field2745 / 2 + var21, var9.field2245 + var22);
        if (var9.field2286 != -1) {
            var13.method9825(0, 0);
        }
        if (arg2 >= 1) {
            var19.method9743(1);
        }
        if (arg2 >= 2) {
            var19.method9743(16777215);
        }
        if (arg3 != 0) {
            var19.method9739(arg3);
        }
        class240.method4506(var19.field5567, 36, 32, (float[]) null);
        if (var9.field2275 != -1) {
            var13.method9825(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2250 == 1) {
            class436 var23 = Statics.field1983;
            String var24;
            if (arg1 < 100000) {
                var24 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var24 = "<col=ffffff>" + arg1 / 1000 + class383.field4361 + "</col>";
            } else {
                var24 = "<col=00ff80>" + arg1 / 1000000 + class383.field4344 + "</col>";
            }
            var23.method7932(var24, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2235.method5931(var19, var6);
        }
        class240.method4506(var14, var15, var16, var17);
        class568.method9611(var18);
        class240.method4580();
        class240.field2589.field2914 = true;
        return var19;
    }

    @ObfuscatedName("ip.af(ILgz;I)Z")
    public final boolean method4036(int arg0, class176 arg1) {
        int var3 = this.field2290;
        int var4 = this.field2248;
        int var5 = this.field2266;
        if (arg0 == 1) {
            var3 = this.field2263;
            var4 = this.field2247;
            var5 = this.field2255;
        }
        if (arg1 != null) {
            var3 = arg0 == 0 ? arg1.field1869 : arg1.field1874;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!Statics.field4786.method7023(var3, 0)) {
            var6 = false;
        }
        if (var4 != -1 && !Statics.field4786.method7023(var4, 0)) {
            var6 = false;
        }
        if (var5 != -1 && !Statics.field4786.method7023(var5, 0)) {
            var6 = false;
        }
        return var6;
    }

    @ObfuscatedName("ip.ar(ILgz;B)Ljj;")
    public final class235 method4014(int arg0, class176 arg1) {
        int var3 = this.field2290;
        int var4 = this.field2248;
        int var5 = this.field2266;
        if (arg0 == 1) {
            var3 = this.field2263;
            var4 = this.field2247;
            var5 = this.field2255;
        }
        if (arg1 != null) {
            var3 = arg0 == 0 ? arg1.field1869 : arg1.field1874;
        }
        if (var3 == -1) {
            return null;
        }
        class235 var6 = class235.method4408(Statics.field4786, var3, 0);
        if (var4 != -1) {
            class235 var7 = class235.method4408(Statics.field4786, var4, 0);
            if (var5 == -1) {
                class235[] var10 = new class235[] { var6, var7 };
                var6 = new class235(var10, 2);
            } else {
                class235 var8 = class235.method4408(Statics.field4786, var5, 0);
                class235[] var9 = new class235[] { var6, var7, var8 };
                var6 = new class235(var9, 3);
            }
        }
        if (arg0 == 0 && this.field2277 != 0) {
            var6.method4392(0, this.field2277, 0);
        }
        if (arg0 == 1 && this.field2265 != 0) {
            var6.method4392(0, this.field2265, 0);
        }
        this.method4017(var6, arg1);
        return var6;
    }

    @ObfuscatedName("ip.ab(ILgz;B)Z")
    public final boolean method4015(int arg0, class176 arg1) {
        int var3 = this.field2264;
        int var4 = this.field2269;
        if (arg0 == 1) {
            var3 = this.field2270;
            var4 = this.field2271;
        }
        if (arg1 != null) {
            var3 = arg0 == 0 ? arg1.field1875 : arg1.field1876;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field4786.method7023(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field4786.method7023(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ip.az(ILgz;I)Ljj;")
    public final class235 method4044(int arg0, class176 arg1) {
        int var3 = this.field2264;
        int var4 = this.field2269;
        if (arg0 == 1) {
            var3 = this.field2270;
            var4 = this.field2271;
        }
        if (arg1 != null) {
            var3 = arg0 == 0 ? arg1.field1875 : arg1.field1876;
        }
        if (var3 == -1) {
            return null;
        }
        class235 var5 = class235.method4408(Statics.field4786, var3, 0);
        if (var4 != -1) {
            class235 var6 = class235.method4408(Statics.field4786, var4, 0);
            class235[] var7 = new class235[] { var5, var6 };
            var5 = new class235(var7, 2);
        }
        this.method4017(var5, arg1);
        return var5;
    }

    @ObfuscatedName("ip.ag(Ljj;Lgz;I)V")
    public void method4017(class235 arg0, class176 arg1) {
        if (this.field2240 != null) {
            short[] var3 = this.field2240;
            short[] var4 = this.field2241;
            if (arg1 != null && arg1.field1873 != null && this.field2241.length == arg1.field1873.length) {
                var4 = arg1.field1873;
            }
            for (int var5 = 0; var5 < this.field2240.length; var5++) {
                arg0.method4393(var3[var5], var4[var5]);
            }
        }
        if (this.field2242 == null) {
            return;
        }
        short[] var6 = this.field2242;
        short[] var7 = this.field2243;
        if (arg1 != null && arg1.field1872 != null && this.field2243.length == arg1.field1872.length) {
            var7 = arg1.field1872;
        }
        for (int var8 = 0; var8 < this.field2242.length; var8++) {
            arg0.method4394(var6[var8], var7[var8]);
        }
    }

    @ObfuscatedName("ip.ad(III)I")
    public int method4018(int arg0, int arg1) {
        return class188.method3588(this.field2283, arg0, arg1);
    }

    @ObfuscatedName("ip.ac(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4019(int arg0, String arg1) {
        return class188.method5808(this.field2283, arg0, arg1);
    }

    @ObfuscatedName("ip.av(B)I")
    public int method4020() {
        if (this.field2259 == -1 || this.field2260 == null) {
            return -1;
        } else if (this.field2259 >= 0) {
            return this.field2260[this.field2259] == null ? -1 : this.field2259;
        } else if (class383.field4182.equalsIgnoreCase(this.field2260[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hs.ax(I)V")
    public static void method3869() {
        field2235.method5930();
    }

    @ObfuscatedName("ip.aq(B)Z")
    public boolean method4007() {
        return this.field2241 != null;
    }

    @ObfuscatedName("ip.al(B)Z")
    public boolean method4022() {
        return this.field2243 != null;
    }
}
