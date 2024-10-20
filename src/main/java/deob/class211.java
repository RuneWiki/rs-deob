package deob;

@ObfuscatedName("is")
public class class211 extends class504 {

    @ObfuscatedName("is.al")
    public static class317 field2230 = new class317(64);

    @ObfuscatedName("is.ad")
    public static class317 field2268 = new class317(50);

    @ObfuscatedName("is.ah")
    public static class317 field2270 = new class317(200);

    @ObfuscatedName("is.ab")
    public int field2233;

    @ObfuscatedName("is.az")
    public int field2264;

    @ObfuscatedName("is.aa")
    public String field2225 = class382.field4298;

    @ObfuscatedName("is.ai")
    public String field2236 = class382.field4298;

    @ObfuscatedName("is.ao")
    public short[] field2237;

    @ObfuscatedName("is.as")
    public short[] field2238;

    @ObfuscatedName("is.ay")
    public short[] field2232;

    @ObfuscatedName("is.aj")
    public short[] field2240;

    @ObfuscatedName("is.av")
    public int field2241 = 2000;

    @ObfuscatedName("is.aw")
    public int field2242 = 0;

    @ObfuscatedName("is.an")
    public int field2243 = 0;

    @ObfuscatedName("is.ak")
    public int field2244 = 0;

    @ObfuscatedName("is.bn")
    public int field2245 = 0;

    @ObfuscatedName("is.bh")
    public int field2250 = 0;

    @ObfuscatedName("is.bf")
    public int field2247 = 0;

    @ObfuscatedName("is.bm")
    public int field2226 = 1;

    @ObfuscatedName("is.bs")
    public int field2229 = -1;

    @ObfuscatedName("is.bw")
    public int field2231 = -1;

    @ObfuscatedName("is.ba")
    public int field2278 = -1;

    @ObfuscatedName("is.bj")
    public boolean field2252 = false;

    @ObfuscatedName("is.bp")
    public String[] field2253 = new String[] { null, null, class382.field4399, null, null };

    @ObfuscatedName("is.by")
    public String[] field2254 = new String[] { null, null, null, null, class382.field4139 };

    @ObfuscatedName("is.bb")
    public String[][] field2255 = (String[][]) null;

    @ObfuscatedName("is.bg")
    public int field2256 = -2;

    @ObfuscatedName("is.bl")
    public int field2251 = -1;

    @ObfuscatedName("is.bz")
    public int field2277 = -1;

    @ObfuscatedName("is.bu")
    public int field2249 = 0;

    @ObfuscatedName("is.br")
    public int field2260 = -1;

    @ObfuscatedName("is.bo")
    public int field2234 = -1;

    @ObfuscatedName("is.bv")
    public int field2262 = 0;

    @ObfuscatedName("is.bt")
    public int field2228 = -1;

    @ObfuscatedName("is.bq")
    public int field2257 = -1;

    @ObfuscatedName("is.bk")
    public int field2265 = -1;

    @ObfuscatedName("is.be")
    public int field2266 = -1;

    @ObfuscatedName("is.bc")
    public int field2267 = -1;

    @ObfuscatedName("is.cn")
    public int field2258 = -1;

    @ObfuscatedName("is.ch")
    public int[] field2269;

    @ObfuscatedName("is.cf")
    public int[] field2286;

    @ObfuscatedName("is.cu")
    public int field2271 = -1;

    @ObfuscatedName("is.cm")
    public int field2248 = -1;

    @ObfuscatedName("is.cj")
    public int field2273 = 128;

    @ObfuscatedName("is.cx")
    public int field2274 = 128;

    @ObfuscatedName("is.ci")
    public int field2275 = 128;

    @ObfuscatedName("is.cy")
    public int field2276 = 0;

    @ObfuscatedName("is.co")
    public int field2263 = 0;

    @ObfuscatedName("is.cv")
    public int field2272 = 0;

    @ObfuscatedName("is.cg")
    public int field2279 = 0;

    @ObfuscatedName("is.ct")
    public class523 field2280;

    @ObfuscatedName("is.cq")
    public boolean field2281 = false;

    @ObfuscatedName("is.cc")
    public int field2282 = -1;

    @ObfuscatedName("is.cz")
    public int field2283 = -1;

    @ObfuscatedName("is.cw")
    public int field2235 = -1;

    @ObfuscatedName("is.cr")
    public int field2285 = -1;

    @ObfuscatedName("dh.ac(II)Lis;")
    public static class211 method2414(int arg0) {
        class211 var1 = (class211) field2230.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3694.method6782(10, arg0);
        class211 var3 = new class211();
        var3.field2233 = arg0;
        if (var2 != null) {
            var3.method3880(new class551(var2));
        }
        var3.method3845();
        if (var3.field2248 != -1) {
            var3.method3909(method2414(var3.field2248), method2414(var3.field2271));
        }
        if (var3.field2283 != -1) {
            var3.method3891(method2414(var3.field2283), method2414(var3.field2282));
        }
        if (var3.field2285 != -1) {
            var3.method3850(method2414(var3.field2285), method2414(var3.field2235));
        }
        if (!Statics.field1981 && var3.field2252) {
            if (var3.field2248 == -1 && var3.field2283 == -1 && var3.field2285 == -1) {
                var3.field2225 = var3.field2225 + class382.field4244;
            }
            var3.field2236 = class382.field4169;
            var3.field2281 = false;
            for (int var4 = 0; var4 < var3.field2253.length; var4++) {
                var3.field2253[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2254.length; var5++) {
                if (var5 != 4) {
                    if (var3.field2255 != null) {
                        var3.field2255[var5] = null;
                    }
                    var3.field2254[var5] = null;
                }
            }
            var3.field2256 = -2;
            var3.field2272 = 0;
            if (var3.field2280 != null) {
                boolean var6 = false;
                for (class508 var7 = var3.field2280.method8669(); var7 != null; var7 = var3.field2280.method8665()) {
                    class206 var8 = class206.method7467((int) var7.field5122);
                    if (var8.field2125) {
                        var7.method8362();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2280 = null;
                }
            }
        }
        field2230.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.ae(I)V")
    public void method3845() {
        if (this.field2247 == 1) {
            this.field2279 = 0;
        }
    }

    @ObfuscatedName("is.ag(Lvf;B)V")
    public void method3880(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3847(arg0, var2);
        }
    }

    @ObfuscatedName("is.am(Lvf;II)V")
    public void method3847(class551 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2264 = arg0.method9119();
        } else if (arg1 == 2) {
            this.field2225 = arg0.method9166();
        } else if (arg1 == 3) {
            this.field2236 = arg0.method9166();
        } else if (arg1 == 4) {
            this.field2241 = arg0.method9119();
        } else if (arg1 == 5) {
            this.field2242 = arg0.method9119();
        } else if (arg1 == 6) {
            this.field2243 = arg0.method9119();
        } else if (arg1 == 7) {
            this.field2245 = arg0.method9119();
            if (this.field2245 > 32767) {
                this.field2245 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2250 = arg0.method9119();
            if (this.field2250 > 32767) {
                this.field2250 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method9166();
        } else if (arg1 == 11) {
            this.field2247 = 1;
        } else if (arg1 == 12) {
            this.field2226 = arg0.method9110();
        } else if (arg1 == 13) {
            this.field2229 = arg0.method8955();
        } else if (arg1 == 14) {
            this.field2231 = arg0.method8955();
        } else if (arg1 == 16) {
            this.field2252 = true;
        } else if (arg1 == 23) {
            this.field2251 = arg0.method9119();
            this.field2249 = arg0.method8955();
        } else if (arg1 == 24) {
            this.field2277 = arg0.method9119();
        } else if (arg1 == 25) {
            this.field2260 = arg0.method9119();
            this.field2262 = arg0.method8955();
        } else if (arg1 == 26) {
            this.field2234 = arg0.method9119();
        } else if (arg1 == 27) {
            this.field2278 = arg0.method8955();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2253[arg1 - 30] = arg0.method9166();
            if (this.field2253[arg1 - 30].equalsIgnoreCase(class382.field4140)) {
                this.field2253[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2254[arg1 - 35] = arg0.method9166();
        } else if (arg1 == 40) {
            int var3 = arg0.method8955();
            this.field2237 = new short[var3];
            this.field2238 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2237[var4] = (short) arg0.method9119();
                this.field2238[var4] = (short) arg0.method9119();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8955();
            this.field2232 = new short[var5];
            this.field2240 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2232[var6] = (short) arg0.method9119();
                this.field2240[var6] = (short) arg0.method9119();
            }
        } else if (arg1 == 42) {
            this.field2256 = arg0.method8975();
        } else if (arg1 == 43) {
            int var7 = arg0.method8955();
            if (this.field2255 == null) {
                this.field2255 = new String[5][];
            }
            boolean var8 = var7 >= 0 && var7 < 5;
            if (var8 && this.field2255[var7] == null) {
                this.field2255[var7] = new String[20];
            }
            while (true) {
                int var9 = arg0.method8955() - 1;
                if (var9 == -1) {
                    break;
                }
                String var10 = arg0.method9166();
                if (var8 && var9 >= 0 && var9 < 20) {
                    this.field2255[var7][var9] = var10;
                }
            }
        } else if (arg1 == 65) {
            this.field2281 = true;
        } else if (arg1 == 75) {
            this.field2279 = arg0.method8977();
        } else if (arg1 == 78) {
            this.field2228 = arg0.method9119();
        } else if (arg1 == 79) {
            this.field2257 = arg0.method9119();
        } else if (arg1 == 90) {
            this.field2265 = arg0.method9119();
        } else if (arg1 == 91) {
            this.field2267 = arg0.method9119();
        } else if (arg1 == 92) {
            this.field2266 = arg0.method9119();
        } else if (arg1 == 93) {
            this.field2258 = arg0.method9119();
        } else if (arg1 == 94) {
            arg0.method9119();
        } else if (arg1 == 95) {
            this.field2244 = arg0.method9119();
        } else if (arg1 == 97) {
            this.field2271 = arg0.method9119();
        } else if (arg1 == 98) {
            this.field2248 = arg0.method9119();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2269 == null) {
                this.field2269 = new int[10];
                this.field2286 = new int[10];
            }
            this.field2269[arg1 - 100] = arg0.method9119();
            this.field2286[arg1 - 100] = arg0.method9119();
        } else if (arg1 == 110) {
            this.field2273 = arg0.method9119();
        } else if (arg1 == 111) {
            this.field2274 = arg0.method9119();
        } else if (arg1 == 112) {
            this.field2275 = arg0.method9119();
        } else if (arg1 == 113) {
            this.field2276 = arg0.method8975();
        } else if (arg1 == 114) {
            this.field2263 = arg0.method8975() * 5;
        } else if (arg1 == 115) {
            this.field2272 = arg0.method8955();
        } else if (arg1 == 139) {
            this.field2282 = arg0.method9119();
        } else if (arg1 == 140) {
            this.field2283 = arg0.method9119();
        } else if (arg1 == 148) {
            this.field2235 = arg0.method9119();
        } else if (arg1 == 149) {
            this.field2285 = arg0.method9119();
        } else if (arg1 == 249) {
            this.field2280 = class188.method3374(arg0, this.field2280);
        }
    }

    @ObfuscatedName("is.ax(Lis;Lis;I)V")
    public void method3909(class211 arg0, class211 arg1) {
        this.field2264 = arg0.field2264;
        this.field2241 = arg0.field2241;
        this.field2242 = arg0.field2242;
        this.field2243 = arg0.field2243;
        this.field2244 = arg0.field2244;
        this.field2245 = arg0.field2245;
        this.field2250 = arg0.field2250;
        this.field2237 = arg0.field2237;
        this.field2238 = arg0.field2238;
        this.field2232 = arg0.field2232;
        this.field2240 = arg0.field2240;
        this.field2225 = arg1.field2225;
        this.field2236 = class382.field4137;
        this.field2252 = arg1.field2252;
        this.field2226 = arg1.field2226;
        this.field2247 = 1;
    }

    @ObfuscatedName("is.aq(Lis;Lis;I)V")
    public void method3891(class211 arg0, class211 arg1) {
        this.field2264 = arg0.field2264;
        this.field2241 = arg0.field2241;
        this.field2242 = arg0.field2242;
        this.field2243 = arg0.field2243;
        this.field2244 = arg0.field2244;
        this.field2245 = arg0.field2245;
        this.field2250 = arg0.field2250;
        this.field2237 = arg1.field2237;
        this.field2238 = arg1.field2238;
        this.field2232 = arg1.field2232;
        this.field2240 = arg1.field2240;
        this.field2225 = arg1.field2225;
        this.field2236 = arg1.field2236;
        this.field2252 = arg1.field2252;
        this.field2247 = arg1.field2247;
        this.field2229 = arg1.field2229;
        this.field2231 = arg1.field2231;
        this.field2278 = arg1.field2278;
        this.field2251 = arg1.field2251;
        this.field2277 = arg1.field2277;
        this.field2228 = arg1.field2228;
        this.field2260 = arg1.field2260;
        this.field2234 = arg1.field2234;
        this.field2257 = arg1.field2257;
        this.field2265 = arg1.field2265;
        this.field2266 = arg1.field2266;
        this.field2267 = arg1.field2267;
        this.field2258 = arg1.field2258;
        this.field2272 = arg1.field2272;
        this.field2253 = arg1.field2253;
        this.field2279 = arg1.field2279;
        this.field2254 = new String[5];
        if (arg1.field2254 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2254[var3] = arg1.field2254[var3];
            }
        }
        this.field2254[4] = class382.field4307;
        if (arg1.field2255 == null) {
            this.field2255 = (String[][]) null;
        } else {
            this.field2255 = new String[5][];
            System.arraycopy(arg1.field2255, 0, this.field2255, 0, 4);
        }
        this.field2226 = 0;
    }

    @ObfuscatedName("is.af(Lis;Lis;B)V")
    public void method3850(class211 arg0, class211 arg1) {
        this.field2264 = arg0.field2264;
        this.field2241 = arg0.field2241;
        this.field2242 = arg0.field2242;
        this.field2243 = arg0.field2243;
        this.field2244 = arg0.field2244;
        this.field2245 = arg0.field2245;
        this.field2250 = arg0.field2250;
        this.field2237 = arg0.field2237;
        this.field2238 = arg0.field2238;
        this.field2232 = arg0.field2232;
        this.field2240 = arg0.field2240;
        this.field2247 = arg0.field2247;
        this.field2225 = arg1.field2225;
        this.field2236 = arg1.field2236;
        this.field2226 = 0;
        this.field2252 = false;
        this.field2281 = false;
    }

    @ObfuscatedName("is.at(II)Ljv;")
    public final class235 method3851(int arg0) {
        if (this.field2269 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2286[var3] && this.field2286[var3] != 0) {
                    var2 = this.field2269[var3];
                }
            }
            if (var2 != -1) {
                return method2414(var2).method3851(1);
            }
        }
        class235 var4 = class235.method4302(Statics.field2261, this.field2264, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2273 != 128 || this.field2274 != 128 || this.field2275 != 128) {
            var4.method4257(this.field2273, this.field2274, this.field2275);
        }
        if (this.field2237 != null) {
            for (int var5 = 0; var5 < this.field2237.length; var5++) {
                var4.method4254(this.field2237[var5], this.field2238[var5]);
            }
        }
        if (this.field2232 != null) {
            for (int var6 = 0; var6 < this.field2232.length; var6++) {
                var4.method4259(this.field2232[var6], this.field2240[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("is.au(II)Ljm;")
    public final class256 method3905(int arg0) {
        if (this.field2269 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2286[var3] && this.field2286[var3] != 0) {
                    var2 = this.field2269[var3];
                }
            }
            if (var2 != -1) {
                return method2414(var2).method3905(1);
            }
        }
        class256 var4 = (class256) field2268.method5733((long) this.field2233);
        if (var4 != null) {
            return var4;
        }
        class235 var5 = class235.method4302(Statics.field2261, this.field2264, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2273 != 128 || this.field2274 != 128 || this.field2275 != 128) {
            var5.method4257(this.field2273, this.field2274, this.field2275);
        }
        if (this.field2237 != null) {
            for (int var6 = 0; var6 < this.field2237.length; var6++) {
                var5.method4254(this.field2237[var6], this.field2238[var6]);
            }
        }
        if (this.field2232 != null) {
            for (int var7 = 0; var7 < this.field2232.length; var7++) {
                var5.method4259(this.field2232[var7], this.field2240[var7]);
            }
        }
        class256 var8 = var5.method4266(this.field2276 + 64, this.field2263 + 768, -50, -10, -50);
        var8.field2797 = true;
        field2268.method5735(var8, (long) this.field2233);
        return var8;
    }

    @ObfuscatedName("is.ar(II)Lis;")
    public class211 method3853(int arg0) {
        if (this.field2269 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2286[var3] && this.field2286[var3] != 0) {
                    var2 = this.field2269[var3];
                }
            }
            if (var2 != -1) {
                return method2414(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ax.al(IIIIIZI)Lvv;")
    public static final class565 method11(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class565 var8 = (class565) field2270.method5733(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class211 var9 = method2414(arg0);
        if (arg1 > 1 && var9.field2269 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2286[var11] && var9.field2286[var11] != 0) {
                    var10 = var9.field2269[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2414(var10);
            }
        }
        class256 var12 = var9.method3905(1);
        if (var12 == null) {
            return null;
        }
        class565 var13 = null;
        if (var9.field2248 != -1) {
            var13 = method11(var9.field2271, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2283 != -1) {
            var13 = method11(var9.field2282, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2285 != -1) {
            var13 = method11(var9.field2235, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5489;
        int var15 = Statics.field5483;
        int var16 = Statics.field5484;
        float[] var17 = Statics.field5485;
        int[] var18 = new int[4];
        class561.method9296(var18);
        class565 var19 = new class565(36, 32);
        class240.method4342(var19.field5513, 36, 32, (float[]) null);
        class561.method9298();
        class240.method4386();
        class240.method4345(16, 16);
        class240.field2589.field2909 = false;
        if (var9.field2285 != -1) {
            var13.method9410(0, 0);
        }
        int var20 = var9.field2241;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class240.field2590[var9.field2242] * var20 >> 16;
        int var22 = class240.field2588[var9.field2242] * var20 >> 16;
        var12.method4814();
        var12.method4830(0, var9.field2243, var9.field2244, var9.field2242, var9.field2245, var9.field2250 + var12.field2736 / 2 + var21, var9.field2250 + var22);
        if (var9.field2283 != -1) {
            var13.method9410(0, 0);
        }
        if (arg2 >= 1) {
            var19.method9420(1);
        }
        if (arg2 >= 2) {
            var19.method9420(16777215);
        }
        if (arg3 != 0) {
            var19.method9512(arg3);
        }
        class240.method4342(var19.field5513, 36, 32, (float[]) null);
        if (var9.field2248 != -1) {
            var13.method9410(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2247 == 1) {
            class435 var23 = Statics.field3680;
            String var24;
            if (arg1 < 100000) {
                var24 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var24 = "<col=ffffff>" + arg1 / 1000 + class382.field4340 + "</col>";
            } else {
                var24 = "<col=00ff80>" + arg1 / 1000000 + class382.field4315 + "</col>";
            }
            var23.method7662(var24, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2270.method5735(var19, var6);
        }
        class240.method4342(var14, var15, var16, var17);
        class561.method9293(var18);
        class240.method4386();
        class240.field2589.field2909 = true;
        return var19;
    }

    @ObfuscatedName("is.ad(IB)Z")
    public final boolean method3915(int arg0) {
        int var2 = this.field2251;
        int var3 = this.field2277;
        int var4 = this.field2228;
        if (arg0 == 1) {
            var2 = this.field2260;
            var3 = this.field2234;
            var4 = this.field2257;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2261.method6784(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2261.method6784(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2261.method6784(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("is.ah(II)Ljv;")
    public final class235 method3855(int arg0) {
        int var2 = this.field2251;
        int var3 = this.field2277;
        int var4 = this.field2228;
        if (arg0 == 1) {
            var2 = this.field2260;
            var3 = this.field2234;
            var4 = this.field2257;
        }
        if (var2 == -1) {
            return null;
        }
        class235 var5 = class235.method4302(Statics.field2261, var2, 0);
        if (var3 != -1) {
            class235 var6 = class235.method4302(Statics.field2261, var3, 0);
            if (var4 == -1) {
                class235[] var9 = new class235[] { var5, var6 };
                var5 = new class235(var9, 2);
            } else {
                class235 var7 = class235.method4302(Statics.field2261, var4, 0);
                class235[] var8 = new class235[] { var5, var6, var7 };
                var5 = new class235(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2249 != 0) {
            var5.method4246(0, this.field2249, 0);
        }
        if (arg0 == 1 && this.field2262 != 0) {
            var5.method4246(0, this.field2262, 0);
        }
        if (this.field2237 != null) {
            for (int var10 = 0; var10 < this.field2237.length; var10++) {
                var5.method4254(this.field2237[var10], this.field2238[var10]);
            }
        }
        if (this.field2232 != null) {
            for (int var11 = 0; var11 < this.field2232.length; var11++) {
                var5.method4259(this.field2232[var11], this.field2240[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("is.ap(II)Z")
    public final boolean method3856(int arg0) {
        int var2 = this.field2265;
        int var3 = this.field2266;
        if (arg0 == 1) {
            var2 = this.field2267;
            var3 = this.field2258;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2261.method6784(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2261.method6784(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("is.ab(IB)Ljv;")
    public final class235 method3857(int arg0) {
        int var2 = this.field2265;
        int var3 = this.field2266;
        if (arg0 == 1) {
            var2 = this.field2267;
            var3 = this.field2258;
        }
        if (var2 == -1) {
            return null;
        }
        class235 var4 = class235.method4302(Statics.field2261, var2, 0);
        if (var3 != -1) {
            class235 var5 = class235.method4302(Statics.field2261, var3, 0);
            class235[] var6 = new class235[] { var4, var5 };
            var4 = new class235(var6, 2);
        }
        if (this.field2237 != null) {
            for (int var7 = 0; var7 < this.field2237.length; var7++) {
                var4.method4254(this.field2237[var7], this.field2238[var7]);
            }
        }
        if (this.field2232 != null) {
            for (int var8 = 0; var8 < this.field2232.length; var8++) {
                var4.method4259(this.field2232[var8], this.field2240[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("is.az(IIB)I")
    public int method3918(int arg0, int arg1) {
        return class188.method414(this.field2280, arg0, arg1);
    }

    @ObfuscatedName("is.aa(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3861(int arg0, String arg1) {
        class523 var3 = this.field2280;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class505 var5 = (class505) var3.method8666((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field5118;
            }
        }
        return var4;
    }

    @ObfuscatedName("is.ai(I)I")
    public int method3846() {
        if (this.field2256 == -1 || this.field2254 == null) {
            return -1;
        } else if (this.field2256 >= 0) {
            return this.field2254[this.field2256] == null ? -1 : this.field2256;
        } else if (class382.field4139.equalsIgnoreCase(this.field2254[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("id.ao(I)V")
    public static void method3825() {
        field2230.method5736();
        field2268.method5736();
        field2270.method5736();
    }

    @ObfuscatedName("fu.as(B)V")
    public static void method3192() {
        field2270.method5736();
    }

    @ObfuscatedName("hx.ay(ZI)V")
    public static void method3729(boolean arg0) {
        if (Statics.field1981 != arg0) {
            method3825();
            Statics.field1981 = arg0;
        }
    }

    @ObfuscatedName("is.aj(B)Z")
    public boolean method3860() {
        return this.field2238 != null;
    }

    @ObfuscatedName("is.av(I)Z")
    public boolean method3859() {
        return this.field2240 != null;
    }
}
