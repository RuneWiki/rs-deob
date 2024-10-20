package deob;

@ObfuscatedName("gr")
public class class197 extends class428 {

    @ObfuscatedName("gr.b")
    public static class269 field2257 = new class269(64);

    @ObfuscatedName("gr.j")
    public static class269 field2211 = new class269(50);

    @ObfuscatedName("gr.g")
    public static class269 field2212 = new class269(200);

    @ObfuscatedName("gr.o")
    public int field2237;

    @ObfuscatedName("gr.n")
    public int field2261;

    @ObfuscatedName("gr.k")
    public String field2215 = class326.field3819;

    @ObfuscatedName("gr.a")
    public short[] field2255;

    @ObfuscatedName("gr.s")
    public short[] field2217;

    @ObfuscatedName("gr.l")
    public short[] field2218;

    @ObfuscatedName("gr.t")
    public short[] field2262;

    @ObfuscatedName("gr.c")
    public int field2220 = 2000;

    @ObfuscatedName("gr.p")
    public int field2221 = 0;

    @ObfuscatedName("gr.d")
    public int field2222 = 0;

    @ObfuscatedName("gr.y")
    public int field2229 = 0;

    @ObfuscatedName("gr.z")
    public int field2224 = 0;

    @ObfuscatedName("gr.w")
    public int field2209 = 0;

    @ObfuscatedName("gr.as")
    public int field2226 = 0;

    @ObfuscatedName("gr.ad")
    public int field2227 = 1;

    @ObfuscatedName("gr.ao")
    public int field2228 = -1;

    @ObfuscatedName("gr.am")
    public int field2249 = -1;

    @ObfuscatedName("gr.av")
    public int field2219 = -1;

    @ObfuscatedName("gr.au")
    public boolean field2231 = false;

    @ObfuscatedName("gr.ar")
    public String[] field2213 = new String[] { null, null, class326.field4065, null, null };

    @ObfuscatedName("gr.at")
    public String[] field2233 = new String[] { null, null, null, null, class326.field4132 };

    @ObfuscatedName("gr.an")
    public int field2234 = -2;

    @ObfuscatedName("gr.ab")
    public int field2235 = -1;

    @ObfuscatedName("gr.al")
    public int field2236 = -1;

    @ObfuscatedName("gr.ag")
    public int field2258 = 0;

    @ObfuscatedName("gr.az")
    public int field2214 = -1;

    @ObfuscatedName("gr.ak")
    public int field2230 = -1;

    @ObfuscatedName("gr.af")
    public int field2205 = 0;

    @ObfuscatedName("gr.ai")
    public int field2241 = -1;

    @ObfuscatedName("gr.ax")
    public int field2242 = -1;

    @ObfuscatedName("gr.ah")
    public int field2243 = -1;

    @ObfuscatedName("gr.aw")
    public int field2244 = -1;

    @ObfuscatedName("gr.aj")
    public int field2245 = -1;

    @ObfuscatedName("gr.aq")
    public int field2246 = -1;

    @ObfuscatedName("gr.ap")
    public int[] field2247;

    @ObfuscatedName("gr.aa")
    public int[] field2206;

    @ObfuscatedName("gr.ae")
    public int field2254 = -1;

    @ObfuscatedName("gr.ac")
    public int field2250 = -1;

    @ObfuscatedName("gr.bh")
    public int field2251 = 128;

    @ObfuscatedName("gr.be")
    public int field2252 = 128;

    @ObfuscatedName("gr.bf")
    public int field2253 = 128;

    @ObfuscatedName("gr.bo")
    public int field2210 = 0;

    @ObfuscatedName("gr.by")
    public int field2223 = 0;

    @ObfuscatedName("gr.bw")
    public int field2256 = 0;

    @ObfuscatedName("gr.bp")
    public int field2225 = 0;

    @ObfuscatedName("gr.bc")
    public class443 field2240;

    @ObfuscatedName("gr.bl")
    public boolean field2259 = false;

    @ObfuscatedName("gr.bv")
    public int field2232 = -1;

    @ObfuscatedName("gr.bx")
    public int field2238 = -1;

    @ObfuscatedName("gr.bg")
    public int field2239 = -1;

    @ObfuscatedName("gr.bz")
    public int field2263 = -1;

    @ObfuscatedName("ml.h(Lly;Lly;ZLnv;I)V")
    public static void method6056(class333 arg0, class333 arg1, boolean arg2, class368 arg3) {
        Statics.field2208 = arg0;
        Statics.field3700 = arg1;
        Statics.field1906 = arg2;
        Statics.field2248 = Statics.field2208.method5869(10);
        Statics.field3024 = arg3;
    }

    @ObfuscatedName("gz.e(II)Lgr;")
    public static class197 method3345(int arg0) {
        class197 var1 = (class197) field2257.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2208.method5909(10, arg0);
        class197 var3 = new class197();
        var3.field2237 = arg0;
        if (var2 != null) {
            var3.method3576(new class467(var2));
        }
        var3.method3575();
        if (var3.field2250 != -1) {
            var3.method3616(method3345(var3.field2250), method3345(var3.field2254));
        }
        if (var3.field2238 != -1) {
            var3.method3574(method3345(var3.field2238), method3345(var3.field2232));
        }
        if (var3.field2263 != -1) {
            var3.method3615(method3345(var3.field2263), method3345(var3.field2239));
        }
        if (!Statics.field1906 && var3.field2231) {
            var3.field2215 = class326.field3929;
            var3.field2259 = false;
            for (int var4 = 0; var4 < var3.field2213.length; var4++) {
                var3.field2213[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2233.length; var5++) {
                if (var5 != 4) {
                    var3.field2233[var5] = null;
                }
            }
            var3.field2234 = -2;
            var3.field2256 = 0;
            if (var3.field2240 != null) {
                boolean var6 = false;
                for (class433 var7 = var3.field2240.method7513(); var7 != null; var7 = var3.field2240.method7527()) {
                    class193 var8 = class193.method3003((int) var7.field4686);
                    if (var8.field2119) {
                        var7.method7230();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2240 = null;
                }
            }
        }
        field2257.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gr.v(I)V")
    public void method3575() {
        if (this.field2226 == 1) {
            this.field2225 = 0;
        }
    }

    @ObfuscatedName("gr.x(Lqy;I)V")
    public void method3576(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3577(arg0, var2);
        }
    }

    @ObfuscatedName("gr.m(Lqy;II)V")
    public void method3577(class467 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2261 = arg0.method7794();
        } else if (arg1 == 2) {
            this.field2215 = arg0.method7801();
        } else if (arg1 == 4) {
            this.field2220 = arg0.method7794();
        } else if (arg1 == 5) {
            this.field2221 = arg0.method7794();
        } else if (arg1 == 6) {
            this.field2222 = arg0.method7794();
        } else if (arg1 == 7) {
            this.field2224 = arg0.method7794();
            if (this.field2224 > 32767) {
                this.field2224 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2209 = arg0.method7794();
            if (this.field2209 > 32767) {
                this.field2209 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method7801();
        } else if (arg1 == 11) {
            this.field2226 = 1;
        } else if (arg1 == 12) {
            this.field2227 = arg0.method7946();
        } else if (arg1 == 13) {
            this.field2228 = arg0.method7792();
        } else if (arg1 == 14) {
            this.field2249 = arg0.method7792();
        } else if (arg1 == 16) {
            this.field2231 = true;
        } else if (arg1 == 23) {
            this.field2235 = arg0.method7794();
            this.field2258 = arg0.method7792();
        } else if (arg1 == 24) {
            this.field2236 = arg0.method7794();
        } else if (arg1 == 25) {
            this.field2214 = arg0.method7794();
            this.field2205 = arg0.method7792();
        } else if (arg1 == 26) {
            this.field2230 = arg0.method7794();
        } else if (arg1 == 27) {
            this.field2219 = arg0.method7792();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2213[arg1 - 30] = arg0.method7801();
            if (this.field2213[arg1 - 30].equalsIgnoreCase(class326.field3820)) {
                this.field2213[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2233[arg1 - 35] = arg0.method7801();
        } else if (arg1 == 40) {
            int var3 = arg0.method7792();
            this.field2255 = new short[var3];
            this.field2217 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2255[var4] = (short) arg0.method7794();
                this.field2217[var4] = (short) arg0.method7794();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7792();
            this.field2218 = new short[var5];
            this.field2262 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2218[var6] = (short) arg0.method7794();
                this.field2262[var6] = (short) arg0.method7794();
            }
        } else if (arg1 == 42) {
            this.field2234 = arg0.method7793();
        } else if (arg1 == 65) {
            this.field2259 = true;
        } else if (arg1 == 75) {
            this.field2225 = arg0.method7795();
        } else if (arg1 == 78) {
            this.field2241 = arg0.method7794();
        } else if (arg1 == 79) {
            this.field2242 = arg0.method7794();
        } else if (arg1 == 90) {
            this.field2243 = arg0.method7794();
        } else if (arg1 == 91) {
            this.field2245 = arg0.method7794();
        } else if (arg1 == 92) {
            this.field2244 = arg0.method7794();
        } else if (arg1 == 93) {
            this.field2246 = arg0.method7794();
        } else if (arg1 == 94) {
            arg0.method7794();
        } else if (arg1 == 95) {
            this.field2229 = arg0.method7794();
        } else if (arg1 == 97) {
            this.field2254 = arg0.method7794();
        } else if (arg1 == 98) {
            this.field2250 = arg0.method7794();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2247 == null) {
                this.field2247 = new int[10];
                this.field2206 = new int[10];
            }
            this.field2247[arg1 - 100] = arg0.method7794();
            this.field2206[arg1 - 100] = arg0.method7794();
        } else if (arg1 == 110) {
            this.field2251 = arg0.method7794();
        } else if (arg1 == 111) {
            this.field2252 = arg0.method7794();
        } else if (arg1 == 112) {
            this.field2253 = arg0.method7794();
        } else if (arg1 == 113) {
            this.field2210 = arg0.method7793();
        } else if (arg1 == 114) {
            this.field2223 = arg0.method7793() * 5;
        } else if (arg1 == 115) {
            this.field2256 = arg0.method7792();
        } else if (arg1 == 139) {
            this.field2232 = arg0.method7794();
        } else if (arg1 == 140) {
            this.field2238 = arg0.method7794();
        } else if (arg1 == 148) {
            this.field2239 = arg0.method7794();
        } else if (arg1 == 149) {
            this.field2263 = arg0.method7794();
        } else if (arg1 == 249) {
            this.field2240 = class183.method2026(arg0, this.field2240);
        }
    }

    @ObfuscatedName("gr.q(Lgr;Lgr;B)V")
    public void method3616(class197 arg0, class197 arg1) {
        this.field2261 = arg0.field2261;
        this.field2220 = arg0.field2220;
        this.field2221 = arg0.field2221;
        this.field2222 = arg0.field2222;
        this.field2229 = arg0.field2229;
        this.field2224 = arg0.field2224;
        this.field2209 = arg0.field2209;
        this.field2255 = arg0.field2255;
        this.field2217 = arg0.field2217;
        this.field2218 = arg0.field2218;
        this.field2262 = arg0.field2262;
        this.field2215 = arg1.field2215;
        this.field2231 = arg1.field2231;
        this.field2227 = arg1.field2227;
        this.field2226 = 1;
    }

    @ObfuscatedName("gr.f(Lgr;Lgr;I)V")
    public void method3574(class197 arg0, class197 arg1) {
        this.field2261 = arg0.field2261;
        this.field2220 = arg0.field2220;
        this.field2221 = arg0.field2221;
        this.field2222 = arg0.field2222;
        this.field2229 = arg0.field2229;
        this.field2224 = arg0.field2224;
        this.field2209 = arg0.field2209;
        this.field2255 = arg1.field2255;
        this.field2217 = arg1.field2217;
        this.field2218 = arg1.field2218;
        this.field2262 = arg1.field2262;
        this.field2215 = arg1.field2215;
        this.field2231 = arg1.field2231;
        this.field2226 = arg1.field2226;
        this.field2228 = arg1.field2228;
        this.field2249 = arg1.field2249;
        this.field2219 = arg1.field2219;
        this.field2235 = arg1.field2235;
        this.field2236 = arg1.field2236;
        this.field2241 = arg1.field2241;
        this.field2214 = arg1.field2214;
        this.field2230 = arg1.field2230;
        this.field2242 = arg1.field2242;
        this.field2243 = arg1.field2243;
        this.field2244 = arg1.field2244;
        this.field2245 = arg1.field2245;
        this.field2246 = arg1.field2246;
        this.field2256 = arg1.field2256;
        this.field2213 = arg1.field2213;
        this.field2225 = arg1.field2225;
        this.field2233 = new String[5];
        if (arg1.field2233 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2233[var3] = arg1.field2233[var3];
            }
        }
        this.field2233[4] = class326.field4075;
        this.field2227 = 0;
    }

    @ObfuscatedName("gr.r(Lgr;Lgr;B)V")
    public void method3615(class197 arg0, class197 arg1) {
        this.field2261 = arg0.field2261;
        this.field2220 = arg0.field2220;
        this.field2221 = arg0.field2221;
        this.field2222 = arg0.field2222;
        this.field2229 = arg0.field2229;
        this.field2224 = arg0.field2224;
        this.field2209 = arg0.field2209;
        this.field2255 = arg0.field2255;
        this.field2217 = arg0.field2217;
        this.field2218 = arg0.field2218;
        this.field2262 = arg0.field2262;
        this.field2226 = arg0.field2226;
        this.field2215 = arg1.field2215;
        this.field2227 = 0;
        this.field2231 = false;
        this.field2259 = false;
    }

    @ObfuscatedName("gr.u(IB)Lgi;")
    public final class208 method3581(int arg0) {
        if (this.field2247 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2206[var3] && this.field2206[var3] != 0) {
                    var2 = this.field2247[var3];
                }
            }
            if (var2 != -1) {
                return method3345(var2).method3581(1);
            }
        }
        class208 var4 = class208.method3813(Statics.field3700, this.field2261, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2251 != 128 || this.field2252 != 128 || this.field2253 != 128) {
            var4.method3831(this.field2251, this.field2252, this.field2253);
        }
        if (this.field2255 != null) {
            for (int var5 = 0; var5 < this.field2255.length; var5++) {
                var4.method3828(this.field2255[var5], this.field2217[var5]);
            }
        }
        if (this.field2218 != null) {
            for (int var6 = 0; var6 < this.field2218.length; var6++) {
                var4.method3829(this.field2218[var6], this.field2262[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gr.b(II)Lhh;")
    public final class224 method3582(int arg0) {
        if (this.field2247 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2206[var3] && this.field2206[var3] != 0) {
                    var2 = this.field2247[var3];
                }
            }
            if (var2 != -1) {
                return method3345(var2).method3582(1);
            }
        }
        class224 var4 = (class224) field2211.method4917((long) this.field2237);
        if (var4 != null) {
            return var4;
        }
        class208 var5 = class208.method3813(Statics.field3700, this.field2261, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2251 != 128 || this.field2252 != 128 || this.field2253 != 128) {
            var5.method3831(this.field2251, this.field2252, this.field2253);
        }
        if (this.field2255 != null) {
            for (int var6 = 0; var6 < this.field2255.length; var6++) {
                var5.method3828(this.field2255[var6], this.field2217[var6]);
            }
        }
        if (this.field2218 != null) {
            for (int var7 = 0; var7 < this.field2218.length; var7++) {
                var5.method3829(this.field2218[var7], this.field2262[var7]);
            }
        }
        class224 var8 = var5.method3836(this.field2210 + 64, this.field2223 + 768, -50, -10, -50);
        var8.field2699 = true;
        field2211.method4925(var8, (long) this.field2237);
        return var8;
    }

    @ObfuscatedName("gr.j(II)Lgr;")
    public class197 method3583(int arg0) {
        if (this.field2247 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2206[var3] && this.field2206[var3] != 0) {
                    var2 = this.field2247[var3];
                }
            }
            if (var2 != -1) {
                return method3345(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("gt.g(IIIIIZB)Lrx;")
    public static final class481 method3731(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class481 var8 = (class481) field2212.method4917(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class197 var9 = method3345(arg0);
        if (arg1 > 1 && var9.field2247 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2206[var11] && var9.field2206[var11] != 0) {
                    var10 = var9.field2247[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3345(var10);
            }
        }
        class224 var12 = var9.method3582(1);
        if (var12 == null) {
            return null;
        }
        class481 var13 = null;
        if (var9.field2250 != -1) {
            var13 = method3731(var9.field2254, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2238 != -1) {
            var13 = method3731(var9.field2232, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2263 != -1) {
            var13 = method3731(var9.field2239, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4986;
        int var15 = Statics.field4985;
        int var16 = Statics.field4984;
        int[] var17 = new int[4];
        class477.method8114(var17);
        class481 var18 = new class481(36, 32);
        class477.method8119(var18.field5021, 36, 32);
        class477.method8116();
        class213.method3926();
        class213.method4008(16, 16);
        class213.field2496 = false;
        if (var9.field2263 != -1) {
            var13.method8252(0, 0);
        }
        int var19 = var9.field2220;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class213.field2486[var9.field2221] * var19 >> 16;
        int var21 = class213.field2509[var9.field2221] * var19 >> 16;
        var12.method4301();
        var12.method4292(0, var9.field2222, var9.field2229, var9.field2221, var9.field2224, var9.field2209 + var12.field2603 / 2 + var20, var9.field2209 + var21);
        if (var9.field2238 != -1) {
            var13.method8252(0, 0);
        }
        if (arg2 >= 1) {
            var18.method8233(1);
        }
        if (arg2 >= 2) {
            var18.method8233(16777215);
        }
        if (arg3 != 0) {
            var18.method8320(arg3);
        }
        class477.method8119(var18.field5021, 36, 32);
        if (var9.field2250 != -1) {
            var13.method8252(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2226 == 1) {
            Statics.field3024.method6525(method2601(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2212.method4925(var18, var6);
        }
        class477.method8119(var14, var15, var16);
        class477.method8115(var17);
        class213.method3926();
        class213.field2496 = true;
        return var18;
    }

    @ObfuscatedName("de.i(II)Ljava/lang/String;")
    public static final String method2601(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class326.field3994 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class326.field3992 + "</col>";
        }
    }

    @ObfuscatedName("gr.o(II)Z")
    public final boolean method3584(int arg0) {
        int var2 = this.field2235;
        int var3 = this.field2236;
        int var4 = this.field2241;
        if (arg0 == 1) {
            var2 = this.field2214;
            var3 = this.field2230;
            var4 = this.field2242;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3700.method5901(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3700.method5901(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3700.method5901(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gr.n(II)Lgi;")
    public final class208 method3585(int arg0) {
        int var2 = this.field2235;
        int var3 = this.field2236;
        int var4 = this.field2241;
        if (arg0 == 1) {
            var2 = this.field2214;
            var3 = this.field2230;
            var4 = this.field2242;
        }
        if (var2 == -1) {
            return null;
        }
        class208 var5 = class208.method3813(Statics.field3700, var2, 0);
        if (var3 != -1) {
            class208 var6 = class208.method3813(Statics.field3700, var3, 0);
            if (var4 == -1) {
                class208[] var9 = new class208[] { var5, var6 };
                var5 = new class208(var9, 2);
            } else {
                class208 var7 = class208.method3813(Statics.field3700, var4, 0);
                class208[] var8 = new class208[] { var5, var6, var7 };
                var5 = new class208(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2258 != 0) {
            var5.method3827(0, this.field2258, 0);
        }
        if (arg0 == 1 && this.field2205 != 0) {
            var5.method3827(0, this.field2205, 0);
        }
        if (this.field2255 != null) {
            for (int var10 = 0; var10 < this.field2255.length; var10++) {
                var5.method3828(this.field2255[var10], this.field2217[var10]);
            }
        }
        if (this.field2218 != null) {
            for (int var11 = 0; var11 < this.field2218.length; var11++) {
                var5.method3829(this.field2218[var11], this.field2262[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gr.k(IB)Z")
    public final boolean method3586(int arg0) {
        int var2 = this.field2243;
        int var3 = this.field2244;
        if (arg0 == 1) {
            var2 = this.field2245;
            var3 = this.field2246;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3700.method5901(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3700.method5901(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gr.a(IB)Lgi;")
    public final class208 method3587(int arg0) {
        int var2 = this.field2243;
        int var3 = this.field2244;
        if (arg0 == 1) {
            var2 = this.field2245;
            var3 = this.field2246;
        }
        if (var2 == -1) {
            return null;
        }
        class208 var4 = class208.method3813(Statics.field3700, var2, 0);
        if (var3 != -1) {
            class208 var5 = class208.method3813(Statics.field3700, var3, 0);
            class208[] var6 = new class208[] { var4, var5 };
            var4 = new class208(var6, 2);
        }
        if (this.field2255 != null) {
            for (int var7 = 0; var7 < this.field2255.length; var7++) {
                var4.method3828(this.field2255[var7], this.field2217[var7]);
            }
        }
        if (this.field2218 != null) {
            for (int var8 = 0; var8 < this.field2218.length; var8++) {
                var4.method3829(this.field2218[var8], this.field2262[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gr.s(III)I")
    public int method3588(int arg0, int arg1) {
        return class183.method2676(this.field2240, arg0, arg1);
    }

    @ObfuscatedName("gr.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3589(int arg0, String arg1) {
        class443 var3 = this.field2240;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class429 var5 = (class429) var3.method7525((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4680;
            }
        }
        return var4;
    }

    @ObfuscatedName("gr.t(B)I")
    public int method3599() {
        if (this.field2234 == -1 || this.field2233 == null) {
            return -1;
        } else if (this.field2234 >= 0) {
            return this.field2233[this.field2234] == null ? -1 : this.field2234;
        } else if (class326.field4132.equalsIgnoreCase(this.field2233[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("mk.c(ZI)V")
    public static void method6051(boolean arg0) {
        if (Statics.field1906 != arg0) {
            field2257.method4918();
            field2211.method4918();
            field2212.method4918();
            Statics.field1906 = arg0;
        }
    }

    @ObfuscatedName("gr.p(B)Z")
    public boolean method3614() {
        return this.field2217 != null;
    }

    @ObfuscatedName("gr.d(I)Z")
    public boolean method3592() {
        return this.field2262 != null;
    }
}
