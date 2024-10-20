package deob;

@ObfuscatedName("hz")
public class class202 extends class444 {

    @ObfuscatedName("hz.aa")
    public static class280 field2214 = new class280(64);

    @ObfuscatedName("hz.ay")
    public static class280 field2215 = new class280(50);

    @ObfuscatedName("hz.ao")
    public static class280 field2216 = new class280(200);

    @ObfuscatedName("hz.ai")
    public int field2262;

    @ObfuscatedName("hz.ag")
    public int field2218;

    @ObfuscatedName("hz.ah")
    public String field2261 = class337.field3889;

    @ObfuscatedName("hz.av")
    public short[] field2222;

    @ObfuscatedName("hz.ar")
    public short[] field2221;

    @ObfuscatedName("hz.am")
    public short[] field2233;

    @ObfuscatedName("hz.as")
    public short[] field2223;

    @ObfuscatedName("hz.aj")
    public int field2224 = 2000;

    @ObfuscatedName("hz.ak")
    public int field2225 = 0;

    @ObfuscatedName("hz.az")
    public int field2226 = 0;

    @ObfuscatedName("hz.ad")
    public int field2260 = 0;

    @ObfuscatedName("hz.ae")
    public int field2228 = 0;

    @ObfuscatedName("hz.ap")
    public int field2229 = 0;

    @ObfuscatedName("hz.bi")
    public int field2236 = 0;

    @ObfuscatedName("hz.be")
    public int field2211 = 1;

    @ObfuscatedName("hz.bk")
    public int field2232 = -1;

    @ObfuscatedName("hz.bx")
    public int field2217 = -1;

    @ObfuscatedName("hz.bo")
    public int field2234 = -1;

    @ObfuscatedName("hz.bz")
    public boolean field2231 = false;

    @ObfuscatedName("hz.bm")
    public String[] field2220 = new String[] { null, null, class337.field3837, null, null };

    @ObfuscatedName("hz.bd")
    public String[] field2237 = new String[] { null, null, null, null, class337.field4088 };

    @ObfuscatedName("hz.bj")
    public int field2238 = -2;

    @ObfuscatedName("hz.bn")
    public int field2239 = -1;

    @ObfuscatedName("hz.bs")
    public int field2240 = -1;

    @ObfuscatedName("hz.br")
    public int field2270 = 0;

    @ObfuscatedName("hz.bg")
    public int field2242 = -1;

    @ObfuscatedName("hz.bu")
    public int field2219 = -1;

    @ObfuscatedName("hz.bf")
    public int field2244 = 0;

    @ObfuscatedName("hz.bq")
    public int field2245 = -1;

    @ObfuscatedName("hz.ba")
    public int field2246 = -1;

    @ObfuscatedName("hz.bv")
    public int field2247 = -1;

    @ObfuscatedName("hz.bl")
    public int field2243 = -1;

    @ObfuscatedName("hz.bp")
    public int field2209 = -1;

    @ObfuscatedName("hz.bc")
    public int field2250 = -1;

    @ObfuscatedName("hz.bh")
    public int[] field2251;

    @ObfuscatedName("hz.bw")
    public int[] field2264;

    @ObfuscatedName("hz.ce")
    public int field2253 = -1;

    @ObfuscatedName("hz.ci")
    public int field2254 = -1;

    @ObfuscatedName("hz.cs")
    public int field2235 = 128;

    @ObfuscatedName("hz.cc")
    public int field2256 = 128;

    @ObfuscatedName("hz.cn")
    public int field2257 = 128;

    @ObfuscatedName("hz.ca")
    public int field2258 = 0;

    @ObfuscatedName("hz.cu")
    public int field2259 = 0;

    @ObfuscatedName("hz.ck")
    public int field2255 = 0;

    @ObfuscatedName("hz.cq")
    public int field2252 = 0;

    @ObfuscatedName("hz.cm")
    public class464 field2248;

    @ObfuscatedName("hz.cf")
    public boolean field2263 = false;

    @ObfuscatedName("hz.cl")
    public int field2241 = -1;

    @ObfuscatedName("hz.cg")
    public int field2265 = -1;

    @ObfuscatedName("hz.cr")
    public int field2266 = -1;

    @ObfuscatedName("hz.cy")
    public int field2267 = -1;

    @ObfuscatedName("dh.af(IB)Lhz;")
    public static class202 method2286(int arg0) {
        class202 var1 = (class202) field2214.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4311.method6090(10, arg0);
        class202 var3 = new class202();
        var3.field2262 = arg0;
        if (var2 != null) {
            var3.method3711(new class489(var2));
        }
        var3.method3773();
        if (var3.field2254 != -1) {
            var3.method3715(method2286(var3.field2254), method2286(var3.field2253));
        }
        if (var3.field2265 != -1) {
            var3.method3716(method2286(var3.field2265), method2286(var3.field2241));
        }
        if (var3.field2267 != -1) {
            var3.method3713(method2286(var3.field2267), method2286(var3.field2266));
        }
        if (!Statics.field1844 && var3.field2231) {
            var3.field2261 = class337.field3995;
            var3.field2263 = false;
            for (int var4 = 0; var4 < var3.field2220.length; var4++) {
                var3.field2220[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2237.length; var5++) {
                if (var5 != 4) {
                    var3.field2237[var5] = null;
                }
            }
            var3.field2238 = -2;
            var3.field2255 = 0;
            if (var3.field2248 != null) {
                boolean var6 = false;
                for (class449 var7 = var3.field2248.method7948(); var7 != null; var7 = var3.field2248.method7951()) {
                    class198 var8 = class198.method505((int) var7.field4745);
                    if (var8.field2117) {
                        var7.method7651();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2248 = null;
                }
            }
        }
        field2214.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hz.an(I)V")
    public void method3773() {
        if (this.field2236 == 1) {
            this.field2252 = 0;
        }
    }

    @ObfuscatedName("hz.aw(Lsg;B)V")
    public void method3711(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3772(arg0, var2);
        }
    }

    @ObfuscatedName("hz.ac(Lsg;IB)V")
    public void method3772(class489 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2218 = arg0.method8250();
        } else if (arg1 == 2) {
            this.field2261 = arg0.method8259();
        } else if (arg1 == 4) {
            this.field2224 = arg0.method8250();
        } else if (arg1 == 5) {
            this.field2225 = arg0.method8250();
        } else if (arg1 == 6) {
            this.field2226 = arg0.method8250();
        } else if (arg1 == 7) {
            this.field2228 = arg0.method8250();
            if (this.field2228 > 32767) {
                this.field2228 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2229 = arg0.method8250();
            if (this.field2229 > 32767) {
                this.field2229 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8259();
        } else if (arg1 == 11) {
            this.field2236 = 1;
        } else if (arg1 == 12) {
            this.field2211 = arg0.method8254();
        } else if (arg1 == 13) {
            this.field2232 = arg0.method8248();
        } else if (arg1 == 14) {
            this.field2217 = arg0.method8248();
        } else if (arg1 == 16) {
            this.field2231 = true;
        } else if (arg1 == 23) {
            this.field2239 = arg0.method8250();
            this.field2270 = arg0.method8248();
        } else if (arg1 == 24) {
            this.field2240 = arg0.method8250();
        } else if (arg1 == 25) {
            this.field2242 = arg0.method8250();
            this.field2244 = arg0.method8248();
        } else if (arg1 == 26) {
            this.field2219 = arg0.method8250();
        } else if (arg1 == 27) {
            this.field2234 = arg0.method8248();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2220[arg1 - 30] = arg0.method8259();
            if (this.field2220[arg1 - 30].equalsIgnoreCase(class337.field4129)) {
                this.field2220[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2237[arg1 - 35] = arg0.method8259();
        } else if (arg1 == 40) {
            int var3 = arg0.method8248();
            this.field2222 = new short[var3];
            this.field2221 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2222[var4] = (short) arg0.method8250();
                this.field2221[var4] = (short) arg0.method8250();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8248();
            this.field2233 = new short[var5];
            this.field2223 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2233[var6] = (short) arg0.method8250();
                this.field2223[var6] = (short) arg0.method8250();
            }
        } else if (arg1 == 42) {
            this.field2238 = arg0.method8249();
        } else if (arg1 == 65) {
            this.field2263 = true;
        } else if (arg1 == 75) {
            this.field2252 = arg0.method8445();
        } else if (arg1 == 78) {
            this.field2245 = arg0.method8250();
        } else if (arg1 == 79) {
            this.field2246 = arg0.method8250();
        } else if (arg1 == 90) {
            this.field2247 = arg0.method8250();
        } else if (arg1 == 91) {
            this.field2209 = arg0.method8250();
        } else if (arg1 == 92) {
            this.field2243 = arg0.method8250();
        } else if (arg1 == 93) {
            this.field2250 = arg0.method8250();
        } else if (arg1 == 94) {
            arg0.method8250();
        } else if (arg1 == 95) {
            this.field2260 = arg0.method8250();
        } else if (arg1 == 97) {
            this.field2253 = arg0.method8250();
        } else if (arg1 == 98) {
            this.field2254 = arg0.method8250();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2251 == null) {
                this.field2251 = new int[10];
                this.field2264 = new int[10];
            }
            this.field2251[arg1 - 100] = arg0.method8250();
            this.field2264[arg1 - 100] = arg0.method8250();
        } else if (arg1 == 110) {
            this.field2235 = arg0.method8250();
        } else if (arg1 == 111) {
            this.field2256 = arg0.method8250();
        } else if (arg1 == 112) {
            this.field2257 = arg0.method8250();
        } else if (arg1 == 113) {
            this.field2258 = arg0.method8249();
        } else if (arg1 == 114) {
            this.field2259 = arg0.method8249() * 5;
        } else if (arg1 == 115) {
            this.field2255 = arg0.method8248();
        } else if (arg1 == 139) {
            this.field2241 = arg0.method8250();
        } else if (arg1 == 140) {
            this.field2265 = arg0.method8250();
        } else if (arg1 == 148) {
            this.field2266 = arg0.method8250();
        } else if (arg1 == 149) {
            this.field2267 = arg0.method8250();
        } else if (arg1 == 249) {
            this.field2248 = class187.method2057(arg0, this.field2248);
        }
    }

    @ObfuscatedName("hz.au(Lhz;Lhz;I)V")
    public void method3715(class202 arg0, class202 arg1) {
        this.field2218 = arg0.field2218;
        this.field2224 = arg0.field2224;
        this.field2225 = arg0.field2225;
        this.field2226 = arg0.field2226;
        this.field2260 = arg0.field2260;
        this.field2228 = arg0.field2228;
        this.field2229 = arg0.field2229;
        this.field2222 = arg0.field2222;
        this.field2221 = arg0.field2221;
        this.field2233 = arg0.field2233;
        this.field2223 = arg0.field2223;
        this.field2261 = arg1.field2261;
        this.field2231 = arg1.field2231;
        this.field2211 = arg1.field2211;
        this.field2236 = 1;
    }

    @ObfuscatedName("hz.ab(Lhz;Lhz;I)V")
    public void method3716(class202 arg0, class202 arg1) {
        this.field2218 = arg0.field2218;
        this.field2224 = arg0.field2224;
        this.field2225 = arg0.field2225;
        this.field2226 = arg0.field2226;
        this.field2260 = arg0.field2260;
        this.field2228 = arg0.field2228;
        this.field2229 = arg0.field2229;
        this.field2222 = arg1.field2222;
        this.field2221 = arg1.field2221;
        this.field2233 = arg1.field2233;
        this.field2223 = arg1.field2223;
        this.field2261 = arg1.field2261;
        this.field2231 = arg1.field2231;
        this.field2236 = arg1.field2236;
        this.field2232 = arg1.field2232;
        this.field2217 = arg1.field2217;
        this.field2234 = arg1.field2234;
        this.field2239 = arg1.field2239;
        this.field2240 = arg1.field2240;
        this.field2245 = arg1.field2245;
        this.field2242 = arg1.field2242;
        this.field2219 = arg1.field2219;
        this.field2246 = arg1.field2246;
        this.field2247 = arg1.field2247;
        this.field2243 = arg1.field2243;
        this.field2209 = arg1.field2209;
        this.field2250 = arg1.field2250;
        this.field2255 = arg1.field2255;
        this.field2220 = arg1.field2220;
        this.field2252 = arg1.field2252;
        this.field2237 = new String[5];
        if (arg1.field2237 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2237[var3] = arg1.field2237[var3];
            }
        }
        this.field2237[4] = class337.field3843;
        this.field2211 = 0;
    }

    @ObfuscatedName("hz.aq(Lhz;Lhz;I)V")
    public void method3713(class202 arg0, class202 arg1) {
        this.field2218 = arg0.field2218;
        this.field2224 = arg0.field2224;
        this.field2225 = arg0.field2225;
        this.field2226 = arg0.field2226;
        this.field2260 = arg0.field2260;
        this.field2228 = arg0.field2228;
        this.field2229 = arg0.field2229;
        this.field2222 = arg0.field2222;
        this.field2221 = arg0.field2221;
        this.field2233 = arg0.field2233;
        this.field2223 = arg0.field2223;
        this.field2236 = arg0.field2236;
        this.field2261 = arg1.field2261;
        this.field2211 = 0;
        this.field2231 = false;
        this.field2263 = false;
    }

    @ObfuscatedName("hz.al(II)Liz;")
    public final class214 method3776(int arg0) {
        if (this.field2251 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2264[var3] && this.field2264[var3] != 0) {
                    var2 = this.field2251[var3];
                }
            }
            if (var2 != -1) {
                return method2286(var2).method3776(1);
            }
        }
        class214 var4 = class214.method4017(Statics.field2212, this.field2218, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2235 != 128 || this.field2256 != 128 || this.field2257 != 128) {
            var4.method3974(this.field2235, this.field2256, this.field2257);
        }
        if (this.field2222 != null) {
            for (int var5 = 0; var5 < this.field2222.length; var5++) {
                var4.method3971(this.field2222[var5], this.field2221[var5]);
            }
        }
        if (this.field2233 != null) {
            for (int var6 = 0; var6 < this.field2233.length; var6++) {
                var4.method4022(this.field2233[var6], this.field2223[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.at(II)Lit;")
    public final class232 method3737(int arg0) {
        if (this.field2251 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2264[var3] && this.field2264[var3] != 0) {
                    var2 = this.field2251[var3];
                }
            }
            if (var2 != -1) {
                return method2286(var2).method3737(1);
            }
        }
        class232 var4 = (class232) field2215.method5119((long) this.field2262);
        if (var4 != null) {
            return var4;
        }
        class214 var5 = class214.method4017(Statics.field2212, this.field2218, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2235 != 128 || this.field2256 != 128 || this.field2257 != 128) {
            var5.method3974(this.field2235, this.field2256, this.field2257);
        }
        if (this.field2222 != null) {
            for (int var6 = 0; var6 < this.field2222.length; var6++) {
                var5.method3971(this.field2222[var6], this.field2221[var6]);
            }
        }
        if (this.field2233 != null) {
            for (int var7 = 0; var7 < this.field2233.length; var7++) {
                var5.method4022(this.field2233[var7], this.field2223[var7]);
            }
        }
        class232 var8 = var5.method3979(this.field2258 + 64, this.field2259 + 768, -50, -10, -50);
        var8.field2714 = true;
        field2215.method5121(var8, (long) this.field2262);
        return var8;
    }

    @ObfuscatedName("hz.aa(II)Lhz;")
    public class202 method3720(int arg0) {
        if (this.field2251 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2264[var3] && this.field2264[var3] != 0) {
                    var2 = this.field2251[var3];
                }
            }
            if (var2 != -1) {
                return method2286(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("jy.ay(IIIIIZI)Ltq;")
    public static final class503 method4936(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class503 var8 = (class503) field2216.method5119(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class202 var9 = method2286(arg0);
        if (arg1 > 1 && var9.field2251 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2264[var11] && var9.field2264[var11] != 0) {
                    var10 = var9.field2251[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2286(var10);
            }
        }
        class232 var12 = var9.method3737(1);
        if (var12 == null) {
            return null;
        }
        class503 var13 = null;
        if (var9.field2254 != -1) {
            var13 = method4936(var9.field2253, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2265 != -1) {
            var13 = method4936(var9.field2241, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2267 != -1) {
            var13 = method4936(var9.field2266, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5067;
        int var15 = Statics.field5061;
        int var16 = Statics.field5060;
        float[] var17 = Statics.field5063;
        int[] var18 = new int[4];
        class499.method8574(var18);
        class503 var19 = new class503(36, 32);
        class219.method9(var19.field5089, 36, 32, (float[]) null);
        class499.method8576();
        class219.method264();
        Statics.method4757(16, 16);
        class219.field2515.field2790 = false;
        if (var9.field2267 != -1) {
            var13.method8690(0, 0);
        }
        int var20 = var9.field2224;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class219.field2512[var9.field2225] * var20 >> 16;
        int var22 = class219.field2516[var9.field2225] * var20 >> 16;
        var12.method4451();
        var12.method4502(0, var9.field2226, var9.field2260, var9.field2225, var9.field2228, var9.field2229 + var12.field2619 / 2 + var21, var9.field2229 + var22);
        if (var9.field2265 != -1) {
            var13.method8690(0, 0);
        }
        if (arg2 >= 1) {
            var19.method8686(1);
        }
        if (arg2 >= 2) {
            var19.method8686(16777215);
        }
        if (arg3 != 0) {
            var19.method8736(arg3);
        }
        class219.method9(var19.field5089, 36, 32, (float[]) null);
        if (var9.field2254 != -1) {
            var13.method8690(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2236 == 1) {
            Statics.field1505.method6837(method2546(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2216.method5121(var19, var6);
        }
        class219.method9(var14, var15, var16, var17);
        class499.method8575(var18);
        class219.method264();
        class219.field2515.field2790 = true;
        return var19;
    }

    @ObfuscatedName("dy.ao(II)Ljava/lang/String;")
    public static final String method2546(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class337.field3946 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class337.field4012 + "</col>";
        }
    }

    @ObfuscatedName("hz.ax(II)Z")
    public final boolean method3721(int arg0) {
        int var2 = this.field2239;
        int var3 = this.field2240;
        int var4 = this.field2245;
        if (arg0 == 1) {
            var2 = this.field2242;
            var3 = this.field2219;
            var4 = this.field2246;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2212.method6073(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2212.method6073(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2212.method6073(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("hz.ai(II)Liz;")
    public final class214 method3734(int arg0) {
        int var2 = this.field2239;
        int var3 = this.field2240;
        int var4 = this.field2245;
        if (arg0 == 1) {
            var2 = this.field2242;
            var3 = this.field2219;
            var4 = this.field2246;
        }
        if (var2 == -1) {
            return null;
        }
        class214 var5 = class214.method4017(Statics.field2212, var2, 0);
        if (var3 != -1) {
            class214 var6 = class214.method4017(Statics.field2212, var3, 0);
            if (var4 == -1) {
                class214[] var9 = new class214[] { var5, var6 };
                var5 = new class214(var9, 2);
            } else {
                class214 var7 = class214.method4017(Statics.field2212, var4, 0);
                class214[] var8 = new class214[] { var5, var6, var7 };
                var5 = new class214(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2270 != 0) {
            var5.method3970(0, this.field2270, 0);
        }
        if (arg0 == 1 && this.field2244 != 0) {
            var5.method3970(0, this.field2244, 0);
        }
        if (this.field2222 != null) {
            for (int var10 = 0; var10 < this.field2222.length; var10++) {
                var5.method3971(this.field2222[var10], this.field2221[var10]);
            }
        }
        if (this.field2233 != null) {
            for (int var11 = 0; var11 < this.field2233.length; var11++) {
                var5.method4022(this.field2233[var11], this.field2223[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("hz.ag(II)Z")
    public final boolean method3723(int arg0) {
        int var2 = this.field2247;
        int var3 = this.field2243;
        if (arg0 == 1) {
            var2 = this.field2209;
            var3 = this.field2250;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2212.method6073(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2212.method6073(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("hz.ah(II)Liz;")
    public final class214 method3724(int arg0) {
        int var2 = this.field2247;
        int var3 = this.field2243;
        if (arg0 == 1) {
            var2 = this.field2209;
            var3 = this.field2250;
        }
        if (var2 == -1) {
            return null;
        }
        class214 var4 = class214.method4017(Statics.field2212, var2, 0);
        if (var3 != -1) {
            class214 var5 = class214.method4017(Statics.field2212, var3, 0);
            class214[] var6 = new class214[] { var4, var5 };
            var4 = new class214(var6, 2);
        }
        if (this.field2222 != null) {
            for (int var7 = 0; var7 < this.field2222.length; var7++) {
                var4.method3971(this.field2222[var7], this.field2221[var7]);
            }
        }
        if (this.field2233 != null) {
            for (int var8 = 0; var8 < this.field2233.length; var8++) {
                var4.method4022(this.field2233[var8], this.field2223[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.av(IIB)I")
    public int method3725(int arg0, int arg1) {
        class464 var3 = this.field2248;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class448 var5 = (class448) var3.method7945((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4744;
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.ar(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3726(int arg0, String arg1) {
        return class187.method3440(this.field2248, arg0, arg1);
    }

    @ObfuscatedName("hz.am(B)I")
    public int method3727() {
        if (this.field2238 == -1 || this.field2237 == null) {
            return -1;
        } else if (this.field2238 >= 0) {
            return this.field2237[this.field2238] == null ? -1 : this.field2238;
        } else if (class337.field4088.equalsIgnoreCase(this.field2237[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("oq.as(B)V")
    public static void method6751() {
        field2214.method5125();
        field2215.method5125();
        field2216.method5125();
    }

    @ObfuscatedName("ec.aj(I)V")
    public static void method2959() {
        field2216.method5125();
    }

    @ObfuscatedName("hz.ak(S)Z")
    public boolean method3712() {
        return this.field2221 != null;
    }

    @ObfuscatedName("hz.az(I)Z")
    public boolean method3728() {
        return this.field2223 != null;
    }
}
