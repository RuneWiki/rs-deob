package deob;

@ObfuscatedName("hn")
public class class207 extends class469 {

    @ObfuscatedName("hn.af")
    public static class288 field2230 = new class288(64);

    @ObfuscatedName("hn.ad")
    public static class288 field2277 = new class288(50);

    @ObfuscatedName("hn.aq")
    public static class288 field2232 = new class288(200);

    @ObfuscatedName("hn.an")
    public int field2233;

    @ObfuscatedName("hn.ar")
    public int field2234;

    @ObfuscatedName("hn.ab")
    public String field2251 = class352.field4223;

    @ObfuscatedName("hn.ag")
    public short[] field2270;

    @ObfuscatedName("hn.am")
    public short[] field2237;

    @ObfuscatedName("hn.ax")
    public short[] field2264;

    @ObfuscatedName("hn.ah")
    public short[] field2239;

    @ObfuscatedName("hn.as")
    public int field2250 = 2000;

    @ObfuscatedName("hn.ay")
    public int field2223 = 0;

    @ObfuscatedName("hn.aj")
    public int field2242 = 0;

    @ObfuscatedName("hn.av")
    public int field2227 = 0;

    @ObfuscatedName("hn.aw")
    public int field2224 = 0;

    @ObfuscatedName("hn.ak")
    public int field2245 = 0;

    @ObfuscatedName("hn.bk")
    public int field2246 = 0;

    @ObfuscatedName("hn.bv")
    public int field2247 = 1;

    @ObfuscatedName("hn.bt")
    public int field2248 = -1;

    @ObfuscatedName("hn.bd")
    public int field2231 = -1;

    @ObfuscatedName("hn.by")
    public int field2249 = -1;

    @ObfuscatedName("hn.bs")
    public boolean field2238 = false;

    @ObfuscatedName("hn.bm")
    public String[] field2252 = new String[] { null, null, class352.field4076, null, null };

    @ObfuscatedName("hn.bf")
    public String[] field2253 = new String[] { null, null, null, null, class352.field4085 };

    @ObfuscatedName("hn.ba")
    public int field2254 = -2;

    @ObfuscatedName("hn.bl")
    public int field2281 = -1;

    @ObfuscatedName("hn.bp")
    public int field2256 = -1;

    @ObfuscatedName("hn.bu")
    public int field2257 = 0;

    @ObfuscatedName("hn.bo")
    public int field2258 = -1;

    @ObfuscatedName("hn.bb")
    public int field2259 = -1;

    @ObfuscatedName("hn.br")
    public int field2260 = 0;

    @ObfuscatedName("hn.be")
    public int field2280 = -1;

    @ObfuscatedName("hn.bi")
    public int field2262 = -1;

    @ObfuscatedName("hn.bz")
    public int field2261 = -1;

    @ObfuscatedName("hn.bx")
    public int field2265 = -1;

    @ObfuscatedName("hn.bn")
    public int field2244 = -1;

    @ObfuscatedName("hn.bw")
    public int field2266 = -1;

    @ObfuscatedName("hn.bc")
    public int[] field2267;

    @ObfuscatedName("hn.bg")
    public int[] field2268;

    @ObfuscatedName("hn.cw")
    public int field2269 = -1;

    @ObfuscatedName("hn.cf")
    public int field2241 = -1;

    @ObfuscatedName("hn.cm")
    public int field2271 = 128;

    @ObfuscatedName("hn.cn")
    public int field2272 = 128;

    @ObfuscatedName("hn.cs")
    public int field2273 = 128;

    @ObfuscatedName("hn.cx")
    public int field2274 = 0;

    @ObfuscatedName("hn.cr")
    public int field2275 = 0;

    @ObfuscatedName("hn.cd")
    public int field2276 = 0;

    @ObfuscatedName("hn.ce")
    public int field2236 = 0;

    @ObfuscatedName("hn.cq")
    public class488 field2278;

    @ObfuscatedName("hn.cp")
    public boolean field2279 = false;

    @ObfuscatedName("hn.cv")
    public int field2255 = -1;

    @ObfuscatedName("hn.co")
    public int field2263 = -1;

    @ObfuscatedName("hn.cl")
    public int field2240 = -1;

    @ObfuscatedName("hn.cu")
    public int field2283 = -1;

    @ObfuscatedName("hh.au(II)Lhn;")
    public static class207 method3280(int arg0) {
        class207 var1 = (class207) field2230.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4424.method6128(10, arg0);
        class207 var3 = new class207();
        var3.field2233 = arg0;
        if (var2 != null) {
            var3.method3657(new class515(var2));
        }
        var3.method3707();
        if (var3.field2241 != -1) {
            var3.method3654(method3280(var3.field2241), method3280(var3.field2269));
        }
        if (var3.field2263 != -1) {
            var3.method3670(method3280(var3.field2263), method3280(var3.field2255));
        }
        if (var3.field2283 != -1) {
            var3.method3656(method3280(var3.field2283), method3280(var3.field2240));
        }
        if (!Statics.field2229 && var3.field2238) {
            if (var3.field2241 == -1 && var3.field2263 == -1 && var3.field2283 == -1) {
                var3.field2251 = var3.field2251 + class352.field4142;
            }
            var3.field2279 = false;
            for (int var4 = 0; var4 < var3.field2252.length; var4++) {
                var3.field2252[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2253.length; var5++) {
                if (var5 != 4) {
                    var3.field2253[var5] = null;
                }
            }
            var3.field2254 = -2;
            var3.field2276 = 0;
            if (var3.field2278 != null) {
                boolean var6 = false;
                for (class473 var7 = var3.field2278.method8011(); var7 != null; var7 = var3.field2278.method8012()) {
                    class203 var8 = class203.method3266((int) var7.field4814);
                    if (var8.field2134) {
                        var7.method7700();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2278 = null;
                }
            }
        }
        field2230.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hn.ae(I)V")
    public void method3707() {
        if (this.field2246 == 1) {
            this.field2236 = 0;
        }
    }

    @ObfuscatedName("hn.ao(Ltm;B)V")
    public void method3657(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3653(arg0, var2);
        }
    }

    @ObfuscatedName("hn.at(Ltm;II)V")
    public void method3653(class515 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2234 = arg0.method8448();
        } else if (arg1 == 2) {
            this.field2251 = arg0.method8311();
        } else if (arg1 == 4) {
            this.field2250 = arg0.method8448();
        } else if (arg1 == 5) {
            this.field2223 = arg0.method8448();
        } else if (arg1 == 6) {
            this.field2242 = arg0.method8448();
        } else if (arg1 == 7) {
            this.field2224 = arg0.method8448();
            if (this.field2224 > 32767) {
                this.field2224 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2245 = arg0.method8448();
            if (this.field2245 > 32767) {
                this.field2245 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8311();
        } else if (arg1 == 11) {
            this.field2246 = 1;
        } else if (arg1 == 12) {
            this.field2247 = arg0.method8306();
        } else if (arg1 == 13) {
            this.field2248 = arg0.method8300();
        } else if (arg1 == 14) {
            this.field2231 = arg0.method8300();
        } else if (arg1 == 16) {
            this.field2238 = true;
        } else if (arg1 == 23) {
            this.field2281 = arg0.method8448();
            this.field2257 = arg0.method8300();
        } else if (arg1 == 24) {
            this.field2256 = arg0.method8448();
        } else if (arg1 == 25) {
            this.field2258 = arg0.method8448();
            this.field2260 = arg0.method8300();
        } else if (arg1 == 26) {
            this.field2259 = arg0.method8448();
        } else if (arg1 == 27) {
            this.field2249 = arg0.method8300();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2252[arg1 - 30] = arg0.method8311();
            if (this.field2252[arg1 - 30].equalsIgnoreCase(class352.field4165)) {
                this.field2252[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2253[arg1 - 35] = arg0.method8311();
        } else if (arg1 == 40) {
            int var3 = arg0.method8300();
            this.field2270 = new short[var3];
            this.field2237 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2270[var4] = (short) arg0.method8448();
                this.field2237[var4] = (short) arg0.method8448();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8300();
            this.field2264 = new short[var5];
            this.field2239 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2264[var6] = (short) arg0.method8448();
                this.field2239[var6] = (short) arg0.method8448();
            }
        } else if (arg1 == 42) {
            this.field2254 = arg0.method8301();
        } else if (arg1 == 65) {
            this.field2279 = true;
        } else if (arg1 == 75) {
            this.field2236 = arg0.method8303();
        } else if (arg1 == 78) {
            this.field2280 = arg0.method8448();
        } else if (arg1 == 79) {
            this.field2262 = arg0.method8448();
        } else if (arg1 == 90) {
            this.field2261 = arg0.method8448();
        } else if (arg1 == 91) {
            this.field2244 = arg0.method8448();
        } else if (arg1 == 92) {
            this.field2265 = arg0.method8448();
        } else if (arg1 == 93) {
            this.field2266 = arg0.method8448();
        } else if (arg1 == 94) {
            arg0.method8448();
        } else if (arg1 == 95) {
            this.field2227 = arg0.method8448();
        } else if (arg1 == 97) {
            this.field2269 = arg0.method8448();
        } else if (arg1 == 98) {
            this.field2241 = arg0.method8448();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2267 == null) {
                this.field2267 = new int[10];
                this.field2268 = new int[10];
            }
            this.field2267[arg1 - 100] = arg0.method8448();
            this.field2268[arg1 - 100] = arg0.method8448();
        } else if (arg1 == 110) {
            this.field2271 = arg0.method8448();
        } else if (arg1 == 111) {
            this.field2272 = arg0.method8448();
        } else if (arg1 == 112) {
            this.field2273 = arg0.method8448();
        } else if (arg1 == 113) {
            this.field2274 = arg0.method8301();
        } else if (arg1 == 114) {
            this.field2275 = arg0.method8301() * 5;
        } else if (arg1 == 115) {
            this.field2276 = arg0.method8300();
        } else if (arg1 == 139) {
            this.field2255 = arg0.method8448();
        } else if (arg1 == 140) {
            this.field2263 = arg0.method8448();
        } else if (arg1 == 148) {
            this.field2240 = arg0.method8448();
        } else if (arg1 == 149) {
            this.field2283 = arg0.method8448();
        } else if (arg1 == 249) {
            this.field2278 = class192.method1074(arg0, this.field2278);
        }
    }

    @ObfuscatedName("hn.ac(Lhn;Lhn;B)V")
    public void method3654(class207 arg0, class207 arg1) {
        this.field2234 = arg0.field2234;
        this.field2250 = arg0.field2250;
        this.field2223 = arg0.field2223;
        this.field2242 = arg0.field2242;
        this.field2227 = arg0.field2227;
        this.field2224 = arg0.field2224;
        this.field2245 = arg0.field2245;
        this.field2270 = arg0.field2270;
        this.field2237 = arg0.field2237;
        this.field2264 = arg0.field2264;
        this.field2239 = arg0.field2239;
        this.field2251 = arg1.field2251;
        this.field2238 = arg1.field2238;
        this.field2247 = arg1.field2247;
        this.field2246 = 1;
    }

    @ObfuscatedName("hn.ai(Lhn;Lhn;B)V")
    public void method3670(class207 arg0, class207 arg1) {
        this.field2234 = arg0.field2234;
        this.field2250 = arg0.field2250;
        this.field2223 = arg0.field2223;
        this.field2242 = arg0.field2242;
        this.field2227 = arg0.field2227;
        this.field2224 = arg0.field2224;
        this.field2245 = arg0.field2245;
        this.field2270 = arg1.field2270;
        this.field2237 = arg1.field2237;
        this.field2264 = arg1.field2264;
        this.field2239 = arg1.field2239;
        this.field2251 = arg1.field2251;
        this.field2238 = arg1.field2238;
        this.field2246 = arg1.field2246;
        this.field2248 = arg1.field2248;
        this.field2231 = arg1.field2231;
        this.field2249 = arg1.field2249;
        this.field2281 = arg1.field2281;
        this.field2256 = arg1.field2256;
        this.field2280 = arg1.field2280;
        this.field2258 = arg1.field2258;
        this.field2259 = arg1.field2259;
        this.field2262 = arg1.field2262;
        this.field2261 = arg1.field2261;
        this.field2265 = arg1.field2265;
        this.field2244 = arg1.field2244;
        this.field2266 = arg1.field2266;
        this.field2276 = arg1.field2276;
        this.field2252 = arg1.field2252;
        this.field2236 = arg1.field2236;
        this.field2253 = new String[5];
        if (arg1.field2253 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2253[var3] = arg1.field2253[var3];
            }
        }
        this.field2253[4] = class352.field3951;
        this.field2247 = 0;
    }

    @ObfuscatedName("hn.az(Lhn;Lhn;I)V")
    public void method3656(class207 arg0, class207 arg1) {
        this.field2234 = arg0.field2234;
        this.field2250 = arg0.field2250;
        this.field2223 = arg0.field2223;
        this.field2242 = arg0.field2242;
        this.field2227 = arg0.field2227;
        this.field2224 = arg0.field2224;
        this.field2245 = arg0.field2245;
        this.field2270 = arg0.field2270;
        this.field2237 = arg0.field2237;
        this.field2264 = arg0.field2264;
        this.field2239 = arg0.field2239;
        this.field2246 = arg0.field2246;
        this.field2251 = arg1.field2251;
        this.field2247 = 0;
        this.field2238 = false;
        this.field2279 = false;
    }

    @ObfuscatedName("hn.ap(IB)Lic;")
    public final class222 method3663(int arg0) {
        if (this.field2267 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2268[var3] && this.field2268[var3] != 0) {
                    var2 = this.field2267[var3];
                }
            }
            if (var2 != -1) {
                return method3280(var2).method3663(1);
            }
        }
        class222 var4 = class222.method4002(Statics.field2228, this.field2234, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2271 != 128 || this.field2272 != 128 || this.field2273 != 128) {
            var4.method3960(this.field2271, this.field2272, this.field2273);
        }
        if (this.field2270 != null) {
            for (int var5 = 0; var5 < this.field2270.length; var5++) {
                var4.method3996(this.field2270[var5], this.field2237[var5]);
            }
        }
        if (this.field2264 != null) {
            for (int var6 = 0; var6 < this.field2264.length; var6++) {
                var4.method3958(this.field2264[var6], this.field2239[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hn.aa(II)Ljr;")
    public final class240 method3658(int arg0) {
        if (this.field2267 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2268[var3] && this.field2268[var3] != 0) {
                    var2 = this.field2267[var3];
                }
            }
            if (var2 != -1) {
                return method3280(var2).method3658(1);
            }
        }
        class240 var4 = (class240) field2277.method5182((long) this.field2233);
        if (var4 != null) {
            return var4;
        }
        class222 var5 = class222.method4002(Statics.field2228, this.field2234, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2271 != 128 || this.field2272 != 128 || this.field2273 != 128) {
            var5.method3960(this.field2271, this.field2272, this.field2273);
        }
        if (this.field2270 != null) {
            for (int var6 = 0; var6 < this.field2270.length; var6++) {
                var5.method3996(this.field2270[var6], this.field2237[var6]);
            }
        }
        if (this.field2264 != null) {
            for (int var7 = 0; var7 < this.field2264.length; var7++) {
                var5.method3958(this.field2264[var7], this.field2239[var7]);
            }
        }
        class240 var8 = var5.method3965(this.field2274 + 64, this.field2275 + 768, -50, -10, -50);
        var8.field2713 = true;
        field2277.method5177(var8, (long) this.field2233);
        return var8;
    }

    @ObfuscatedName("hn.af(II)Lhn;")
    public class207 method3659(int arg0) {
        if (this.field2267 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2268[var3] && this.field2268[var3] != 0) {
                    var2 = this.field2267[var3];
                }
            }
            if (var2 != -1) {
                return method3280(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ac.ad(IIIIIZI)Lui;")
    public static final class529 method9(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class529 var8 = (class529) field2232.method5182(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class207 var9 = method3280(arg0);
        if (arg1 > 1 && var9.field2267 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2268[var11] && var9.field2268[var11] != 0) {
                    var10 = var9.field2267[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3280(var10);
            }
        }
        class240 var12 = var9.method3658(1);
        if (var12 == null) {
            return null;
        }
        class529 var13 = null;
        if (var9.field2241 != -1) {
            var13 = method9(var9.field2269, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2263 != -1) {
            var13 = method9(var9.field2255, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2283 != -1) {
            var13 = method9(var9.field2240, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5183;
        int var15 = Statics.field5181;
        int var16 = Statics.field5182;
        float[] var17 = Statics.field5185;
        int[] var18 = new int[4];
        class525.method8606(var18);
        class529 var19 = new class529(36, 32);
        class227.method4064(var19.field5216, 36, 32, (float[]) null);
        class525.method8608();
        class227.method4065();
        class227.method4125(16, 16);
        class227.field2537.field2812 = false;
        if (var9.field2283 != -1) {
            var13.method8774(0, 0);
        }
        int var20 = var9.field2250;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class227.field2535[var9.field2223] * var20 >> 16;
        int var22 = class227.field2533[var9.field2223] * var20 >> 16;
        var12.method4450();
        var12.method4458(0, var9.field2242, var9.field2227, var9.field2223, var9.field2224, var9.field2245 + var12.field2638 / 2 + var21, var9.field2245 + var22);
        if (var9.field2263 != -1) {
            var13.method8774(0, 0);
        }
        if (arg2 >= 1) {
            var19.method8720(1);
        }
        if (arg2 >= 2) {
            var19.method8720(16777215);
        }
        if (arg3 != 0) {
            var19.method8721(arg3);
        }
        class227.method4064(var19.field5216, 36, 32, (float[]) null);
        if (var9.field2241 != -1) {
            var13.method8774(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2246 == 1) {
            class394 var23 = Statics.field4760;
            String var24;
            if (arg1 < 100000) {
                var24 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var24 = "<col=ffffff>" + arg1 / 1000 + class352.field4091 + "</col>";
            } else {
                var24 = "<col=00ff80>" + arg1 / 1000000 + class352.field4089 + "</col>";
            }
            var23.method6925(var24, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2232.method5177(var19, var6);
        }
        class227.method4064(var14, var15, var16, var17);
        class525.method8673(var18);
        class227.method4065();
        class227.field2537.field2812 = true;
        return var19;
    }

    @ObfuscatedName("hn.aq(IB)Z")
    public final boolean method3660(int arg0) {
        int var2 = this.field2281;
        int var3 = this.field2256;
        int var4 = this.field2280;
        if (arg0 == 1) {
            var2 = this.field2258;
            var3 = this.field2259;
            var4 = this.field2262;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2228.method6130(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2228.method6130(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2228.method6130(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("hn.al(II)Lic;")
    public final class222 method3661(int arg0) {
        int var2 = this.field2281;
        int var3 = this.field2256;
        int var4 = this.field2280;
        if (arg0 == 1) {
            var2 = this.field2258;
            var3 = this.field2259;
            var4 = this.field2262;
        }
        if (var2 == -1) {
            return null;
        }
        class222 var5 = class222.method4002(Statics.field2228, var2, 0);
        if (var3 != -1) {
            class222 var6 = class222.method4002(Statics.field2228, var3, 0);
            if (var4 == -1) {
                class222[] var9 = new class222[] { var5, var6 };
                var5 = new class222(var9, 2);
            } else {
                class222 var7 = class222.method4002(Statics.field2228, var4, 0);
                class222[] var8 = new class222[] { var5, var6, var7 };
                var5 = new class222(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2257 != 0) {
            var5.method3956(0, this.field2257, 0);
        }
        if (arg0 == 1 && this.field2260 != 0) {
            var5.method3956(0, this.field2260, 0);
        }
        if (this.field2270 != null) {
            for (int var10 = 0; var10 < this.field2270.length; var10++) {
                var5.method3996(this.field2270[var10], this.field2237[var10]);
            }
        }
        if (this.field2264 != null) {
            for (int var11 = 0; var11 < this.field2264.length; var11++) {
                var5.method3958(this.field2264[var11], this.field2239[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("hn.an(II)Z")
    public final boolean method3662(int arg0) {
        int var2 = this.field2261;
        int var3 = this.field2265;
        if (arg0 == 1) {
            var2 = this.field2244;
            var3 = this.field2266;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2228.method6130(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2228.method6130(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("hn.ar(II)Lic;")
    public final class222 method3665(int arg0) {
        int var2 = this.field2261;
        int var3 = this.field2265;
        if (arg0 == 1) {
            var2 = this.field2244;
            var3 = this.field2266;
        }
        if (var2 == -1) {
            return null;
        }
        class222 var4 = class222.method4002(Statics.field2228, var2, 0);
        if (var3 != -1) {
            class222 var5 = class222.method4002(Statics.field2228, var3, 0);
            class222[] var6 = new class222[] { var4, var5 };
            var4 = new class222(var6, 2);
        }
        if (this.field2270 != null) {
            for (int var7 = 0; var7 < this.field2270.length; var7++) {
                var4.method3996(this.field2270[var7], this.field2237[var7]);
            }
        }
        if (this.field2264 != null) {
            for (int var8 = 0; var8 < this.field2264.length; var8++) {
                var4.method3958(this.field2264[var8], this.field2239[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hn.ab(IIS)I")
    public int method3664(int arg0, int arg1) {
        return class192.method157(this.field2278, arg0, arg1);
    }

    @ObfuscatedName("hn.ag(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3655(int arg0, String arg1) {
        class488 var3 = this.field2278;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class470 var5 = (class470) var3.method8008((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4810;
            }
        }
        return var4;
    }

    @ObfuscatedName("hn.am(I)I")
    public int method3666() {
        if (this.field2254 == -1 || this.field2253 == null) {
            return -1;
        } else if (this.field2254 >= 0) {
            return this.field2253[this.field2254] == null ? -1 : this.field2254;
        } else if (class352.field4085.equalsIgnoreCase(this.field2253[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ev.ax(B)V")
    public static void method2710() {
        field2232.method5175();
    }

    @ObfuscatedName("hn.ah(I)Z")
    public boolean method3715() {
        return this.field2237 != null;
    }

    @ObfuscatedName("hn.as(I)Z")
    public boolean method3668() {
        return this.field2239 != null;
    }
}
