package deob;

@ObfuscatedName("gr")
public class class201 extends class435 {

    @ObfuscatedName("gr.k")
    public static class273 field2212 = new class273(64);

    @ObfuscatedName("gr.c")
    public static class273 field2213 = new class273(50);

    @ObfuscatedName("gr.r")
    public static class273 field2214 = new class273(200);

    @ObfuscatedName("gr.m")
    public int field2215;

    @ObfuscatedName("gr.t")
    public int field2216;

    @ObfuscatedName("gr.h")
    public String field2266 = class330.field3846;

    @ObfuscatedName("gr.p")
    public short[] field2246;

    @ObfuscatedName("gr.o")
    public short[] field2219;

    @ObfuscatedName("gr.u")
    public short[] field2220;

    @ObfuscatedName("gr.x")
    public short[] field2221;

    @ObfuscatedName("gr.a")
    public int field2254 = 2000;

    @ObfuscatedName("gr.q")
    public int field2223 = 0;

    @ObfuscatedName("gr.d")
    public int field2224 = 0;

    @ObfuscatedName("gr.e")
    public int field2252 = 0;

    @ObfuscatedName("gr.g")
    public int field2226 = 0;

    @ObfuscatedName("gr.y")
    public int field2227 = 0;

    @ObfuscatedName("gr.af")
    public int field2228 = 0;

    @ObfuscatedName("gr.aa")
    public int field2248 = 1;

    @ObfuscatedName("gr.ai")
    public int field2230 = -1;

    @ObfuscatedName("gr.ag")
    public int field2231 = -1;

    @ObfuscatedName("gr.aw")
    public int field2232 = -1;

    @ObfuscatedName("gr.ar")
    public boolean field2235 = false;

    @ObfuscatedName("gr.al")
    public String[] field2262 = new String[] { null, null, class330.field3839, null, null };

    @ObfuscatedName("gr.at")
    public String[] field2211 = new String[] { null, null, null, null, class330.field3995 };

    @ObfuscatedName("gr.ax")
    public int field2236 = -2;

    @ObfuscatedName("gr.az")
    public int field2237 = -1;

    @ObfuscatedName("gr.ap")
    public int field2239 = -1;

    @ObfuscatedName("gr.ay")
    public int field2208 = 0;

    @ObfuscatedName("gr.ac")
    public int field2217 = -1;

    @ObfuscatedName("gr.av")
    public int field2241 = -1;

    @ObfuscatedName("gr.aq")
    public int field2256 = 0;

    @ObfuscatedName("gr.ak")
    public int field2243 = -1;

    @ObfuscatedName("gr.au")
    public int field2244 = -1;

    @ObfuscatedName("gr.ae")
    public int field2245 = -1;

    @ObfuscatedName("gr.ah")
    public int field2229 = -1;

    @ObfuscatedName("gr.ad")
    public int field2247 = -1;

    @ObfuscatedName("gr.ab")
    public int field2207 = -1;

    @ObfuscatedName("gr.an")
    public int[] field2222;

    @ObfuscatedName("gr.am")
    public int[] field2250;

    @ObfuscatedName("gr.as")
    public int field2251 = -1;

    @ObfuscatedName("gr.ao")
    public int field2205 = -1;

    @ObfuscatedName("gr.bj")
    public int field2253 = 128;

    @ObfuscatedName("gr.bf")
    public int field2225 = 128;

    @ObfuscatedName("gr.bz")
    public int field2255 = 128;

    @ObfuscatedName("gr.br")
    public int field2264 = 0;

    @ObfuscatedName("gr.bm")
    public int field2257 = 0;

    @ObfuscatedName("gr.be")
    public int field2258 = 0;

    @ObfuscatedName("gr.bo")
    public int field2259 = 0;

    @ObfuscatedName("gr.bl")
    public class450 field2260;

    @ObfuscatedName("gr.bq")
    public boolean field2261 = false;

    @ObfuscatedName("gr.bn")
    public int field2242 = -1;

    @ObfuscatedName("gr.bi")
    public int field2218 = -1;

    @ObfuscatedName("gr.bw")
    public int field2233 = -1;

    @ObfuscatedName("gr.bt")
    public int field2265 = -1;

    @ObfuscatedName("cg.f(IB)Lgr;")
    public static class201 method2583(int arg0) {
        class201 var1 = (class201) field2212.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field11.method5990(10, arg0);
        class201 var3 = new class201();
        var3.field2215 = arg0;
        if (var2 != null) {
            var3.method3650(new class474(var2));
        }
        var3.method3703();
        if (var3.field2205 != -1) {
            var3.method3652(method2583(var3.field2205), method2583(var3.field2251));
        }
        if (var3.field2218 != -1) {
            var3.method3677(method2583(var3.field2218), method2583(var3.field2242));
        }
        if (var3.field2265 != -1) {
            var3.method3712(method2583(var3.field2265), method2583(var3.field2233));
        }
        if (!Statics.field2210 && var3.field2235) {
            var3.field2266 = class330.field3899;
            var3.field2261 = false;
            for (int var4 = 0; var4 < var3.field2262.length; var4++) {
                var3.field2262[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2211.length; var5++) {
                if (var5 != 4) {
                    var3.field2211[var5] = null;
                }
            }
            var3.field2236 = -2;
            var3.field2258 = 0;
            if (var3.field2260 != null) {
                boolean var6 = false;
                for (class440 var7 = var3.field2260.method7694(); var7 != null; var7 = var3.field2260.method7695()) {
                    class197 var8 = class197.method2995((int) var7.field4711);
                    if (var8.field2123) {
                        var7.method7431();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2260 = null;
                }
            }
        }
        field2212.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gr.w(I)V")
    public void method3703() {
        if (this.field2228 == 1) {
            this.field2259 = 0;
        }
    }

    @ObfuscatedName("gr.v(Lrd;I)V")
    public void method3650(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3716(arg0, var2);
        }
    }

    @ObfuscatedName("gr.s(Lrd;IB)V")
    public void method3716(class474 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2216 = arg0.method8032();
        } else if (arg1 == 2) {
            this.field2266 = arg0.method7983();
        } else if (arg1 == 4) {
            this.field2254 = arg0.method8032();
        } else if (arg1 == 5) {
            this.field2223 = arg0.method8032();
        } else if (arg1 == 6) {
            this.field2224 = arg0.method8032();
        } else if (arg1 == 7) {
            this.field2226 = arg0.method8032();
            if (this.field2226 > 32767) {
                this.field2226 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2227 = arg0.method8032();
            if (this.field2227 > 32767) {
                this.field2227 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method7983();
        } else if (arg1 == 11) {
            this.field2228 = 1;
        } else if (arg1 == 12) {
            this.field2248 = arg0.method7979();
        } else if (arg1 == 13) {
            this.field2230 = arg0.method7964();
        } else if (arg1 == 14) {
            this.field2231 = arg0.method7964();
        } else if (arg1 == 16) {
            this.field2235 = true;
        } else if (arg1 == 23) {
            this.field2237 = arg0.method8032();
            this.field2208 = arg0.method7964();
        } else if (arg1 == 24) {
            this.field2239 = arg0.method8032();
        } else if (arg1 == 25) {
            this.field2217 = arg0.method8032();
            this.field2256 = arg0.method7964();
        } else if (arg1 == 26) {
            this.field2241 = arg0.method8032();
        } else if (arg1 == 27) {
            this.field2232 = arg0.method7964();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2262[arg1 - 30] = arg0.method7983();
            if (this.field2262[arg1 - 30].equalsIgnoreCase(class330.field3841)) {
                this.field2262[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2211[arg1 - 35] = arg0.method7983();
        } else if (arg1 == 40) {
            int var3 = arg0.method7964();
            this.field2246 = new short[var3];
            this.field2219 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2246[var4] = (short) arg0.method8032();
                this.field2219[var4] = (short) arg0.method8032();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7964();
            this.field2220 = new short[var5];
            this.field2221 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2220[var6] = (short) arg0.method8032();
                this.field2221[var6] = (short) arg0.method8032();
            }
        } else if (arg1 == 42) {
            this.field2236 = arg0.method7965();
        } else if (arg1 == 65) {
            this.field2261 = true;
        } else if (arg1 == 75) {
            this.field2259 = arg0.method7967();
        } else if (arg1 == 78) {
            this.field2243 = arg0.method8032();
        } else if (arg1 == 79) {
            this.field2244 = arg0.method8032();
        } else if (arg1 == 90) {
            this.field2245 = arg0.method8032();
        } else if (arg1 == 91) {
            this.field2247 = arg0.method8032();
        } else if (arg1 == 92) {
            this.field2229 = arg0.method8032();
        } else if (arg1 == 93) {
            this.field2207 = arg0.method8032();
        } else if (arg1 == 94) {
            arg0.method8032();
        } else if (arg1 == 95) {
            this.field2252 = arg0.method8032();
        } else if (arg1 == 97) {
            this.field2251 = arg0.method8032();
        } else if (arg1 == 98) {
            this.field2205 = arg0.method8032();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2222 == null) {
                this.field2222 = new int[10];
                this.field2250 = new int[10];
            }
            this.field2222[arg1 - 100] = arg0.method8032();
            this.field2250[arg1 - 100] = arg0.method8032();
        } else if (arg1 == 110) {
            this.field2253 = arg0.method8032();
        } else if (arg1 == 111) {
            this.field2225 = arg0.method8032();
        } else if (arg1 == 112) {
            this.field2255 = arg0.method8032();
        } else if (arg1 == 113) {
            this.field2264 = arg0.method7965();
        } else if (arg1 == 114) {
            this.field2257 = arg0.method7965() * 5;
        } else if (arg1 == 115) {
            this.field2258 = arg0.method7964();
        } else if (arg1 == 139) {
            this.field2242 = arg0.method8032();
        } else if (arg1 == 140) {
            this.field2218 = arg0.method8032();
        } else if (arg1 == 148) {
            this.field2233 = arg0.method8032();
        } else if (arg1 == 149) {
            this.field2265 = arg0.method8032();
        } else if (arg1 == 249) {
            this.field2260 = class187.method2938(arg0, this.field2260);
        }
    }

    @ObfuscatedName("gr.z(Lgr;Lgr;I)V")
    public void method3652(class201 arg0, class201 arg1) {
        this.field2216 = arg0.field2216;
        this.field2254 = arg0.field2254;
        this.field2223 = arg0.field2223;
        this.field2224 = arg0.field2224;
        this.field2252 = arg0.field2252;
        this.field2226 = arg0.field2226;
        this.field2227 = arg0.field2227;
        this.field2246 = arg0.field2246;
        this.field2219 = arg0.field2219;
        this.field2220 = arg0.field2220;
        this.field2221 = arg0.field2221;
        this.field2266 = arg1.field2266;
        this.field2235 = arg1.field2235;
        this.field2248 = arg1.field2248;
        this.field2228 = 1;
    }

    @ObfuscatedName("gr.j(Lgr;Lgr;B)V")
    public void method3677(class201 arg0, class201 arg1) {
        this.field2216 = arg0.field2216;
        this.field2254 = arg0.field2254;
        this.field2223 = arg0.field2223;
        this.field2224 = arg0.field2224;
        this.field2252 = arg0.field2252;
        this.field2226 = arg0.field2226;
        this.field2227 = arg0.field2227;
        this.field2246 = arg1.field2246;
        this.field2219 = arg1.field2219;
        this.field2220 = arg1.field2220;
        this.field2221 = arg1.field2221;
        this.field2266 = arg1.field2266;
        this.field2235 = arg1.field2235;
        this.field2228 = arg1.field2228;
        this.field2230 = arg1.field2230;
        this.field2231 = arg1.field2231;
        this.field2232 = arg1.field2232;
        this.field2237 = arg1.field2237;
        this.field2239 = arg1.field2239;
        this.field2243 = arg1.field2243;
        this.field2217 = arg1.field2217;
        this.field2241 = arg1.field2241;
        this.field2244 = arg1.field2244;
        this.field2245 = arg1.field2245;
        this.field2229 = arg1.field2229;
        this.field2247 = arg1.field2247;
        this.field2207 = arg1.field2207;
        this.field2258 = arg1.field2258;
        this.field2262 = arg1.field2262;
        this.field2259 = arg1.field2259;
        this.field2211 = new String[5];
        if (arg1.field2211 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2211[var3] = arg1.field2211[var3];
            }
        }
        this.field2211[4] = class330.field3845;
        this.field2248 = 0;
    }

    @ObfuscatedName("gr.i(Lgr;Lgr;I)V")
    public void method3712(class201 arg0, class201 arg1) {
        this.field2216 = arg0.field2216;
        this.field2254 = arg0.field2254;
        this.field2223 = arg0.field2223;
        this.field2224 = arg0.field2224;
        this.field2252 = arg0.field2252;
        this.field2226 = arg0.field2226;
        this.field2227 = arg0.field2227;
        this.field2246 = arg0.field2246;
        this.field2219 = arg0.field2219;
        this.field2220 = arg0.field2220;
        this.field2221 = arg0.field2221;
        this.field2228 = arg0.field2228;
        this.field2266 = arg1.field2266;
        this.field2248 = 0;
        this.field2235 = false;
        this.field2261 = false;
    }

    @ObfuscatedName("gr.n(II)Lhe;")
    public final class212 method3655(int arg0) {
        if (this.field2222 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2250[var3] && this.field2250[var3] != 0) {
                    var2 = this.field2222[var3];
                }
            }
            if (var2 != -1) {
                return method2583(var2).method3655(1);
            }
        }
        class212 var4 = class212.method3915(Statics.field2209, this.field2216, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2253 != 128 || this.field2225 != 128 || this.field2255 != 128) {
            var4.method3905(this.field2253, this.field2225, this.field2255);
        }
        if (this.field2246 != null) {
            for (int var5 = 0; var5 < this.field2246.length; var5++) {
                var4.method3902(this.field2246[var5], this.field2219[var5]);
            }
        }
        if (this.field2220 != null) {
            for (int var6 = 0; var6 < this.field2220.length; var6++) {
                var4.method3943(this.field2220[var6], this.field2221[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gr.l(IB)Lhs;")
    public final class228 method3656(int arg0) {
        if (this.field2222 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2250[var3] && this.field2250[var3] != 0) {
                    var2 = this.field2222[var3];
                }
            }
            if (var2 != -1) {
                return method2583(var2).method3656(1);
            }
        }
        class228 var4 = (class228) field2213.method5028((long) this.field2215);
        if (var4 != null) {
            return var4;
        }
        class212 var5 = class212.method3915(Statics.field2209, this.field2216, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2253 != 128 || this.field2225 != 128 || this.field2255 != 128) {
            var5.method3905(this.field2253, this.field2225, this.field2255);
        }
        if (this.field2246 != null) {
            for (int var6 = 0; var6 < this.field2246.length; var6++) {
                var5.method3902(this.field2246[var6], this.field2219[var6]);
            }
        }
        if (this.field2220 != null) {
            for (int var7 = 0; var7 < this.field2220.length; var7++) {
                var5.method3943(this.field2220[var7], this.field2221[var7]);
            }
        }
        class228 var8 = var5.method3888(this.field2264 + 64, this.field2257 + 768, -50, -10, -50);
        var8.field2702 = true;
        field2213.method5027(var8, (long) this.field2215);
        return var8;
    }

    @ObfuscatedName("gr.k(IB)Lgr;")
    public class201 method3697(int arg0) {
        if (this.field2222 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2250[var3] && this.field2250[var3] != 0) {
                    var2 = this.field2222[var3];
                }
            }
            if (var2 != -1) {
                return method2583(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ho.c(IIIIIZB)Lrs;")
    public static final class488 method4303(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class488 var8 = (class488) field2214.method5028(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class201 var9 = method2583(arg0);
        if (arg1 > 1 && var9.field2222 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2250[var11] && var9.field2250[var11] != 0) {
                    var10 = var9.field2222[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2583(var10);
            }
        }
        class228 var12 = var9.method3656(1);
        if (var12 == null) {
            return null;
        }
        class488 var13 = null;
        if (var9.field2205 != -1) {
            var13 = method4303(var9.field2251, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2218 != -1) {
            var13 = method4303(var9.field2242, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2265 != -1) {
            var13 = method4303(var9.field2233, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5012;
        int var15 = Statics.field5011;
        int var16 = Statics.field5008;
        int[] var17 = new int[4];
        class484.method8290(var17);
        class488 var18 = new class488(36, 32);
        class484.method8286(var18.field5041, 36, 32);
        class484.method8349();
        class217.method4023();
        class217.method4073(16, 16);
        class217.field2501 = false;
        if (var9.field2265 != -1) {
            var13.method8402(0, 0);
        }
        int var19 = var9.field2254;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class217.field2515[var9.field2223] * var19 >> 16;
        int var21 = class217.field2516[var9.field2223] * var19 >> 16;
        var12.method4338();
        var12.method4355(0, var9.field2224, var9.field2252, var9.field2223, var9.field2226, var9.field2227 + var12.field2609 / 2 + var20, var9.field2227 + var21);
        if (var9.field2218 != -1) {
            var13.method8402(0, 0);
        }
        if (arg2 >= 1) {
            var18.method8439(1);
        }
        if (arg2 >= 2) {
            var18.method8439(16777215);
        }
        if (arg3 != 0) {
            var18.method8399(arg3);
        }
        class484.method8286(var18.field5041, 36, 32);
        if (var9.field2205 != -1) {
            var13.method8402(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2228 == 1) {
            Statics.field1643.method6634(method5339(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2214.method5027(var18, var6);
        }
        class484.method8286(var14, var15, var16);
        class484.method8291(var17);
        class217.method4023();
        class217.field2501 = true;
        return var18;
    }

    @ObfuscatedName("kc.r(IB)Ljava/lang/String;")
    public static final String method5339(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class330.field4016 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class330.field4014 + "</col>";
        }
    }

    @ObfuscatedName("gr.b(II)Z")
    public final boolean method3668(int arg0) {
        int var2 = this.field2237;
        int var3 = this.field2239;
        int var4 = this.field2243;
        if (arg0 == 1) {
            var2 = this.field2217;
            var3 = this.field2241;
            var4 = this.field2244;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2209.method5983(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2209.method5983(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2209.method5983(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gr.m(II)Lhe;")
    public final class212 method3658(int arg0) {
        int var2 = this.field2237;
        int var3 = this.field2239;
        int var4 = this.field2243;
        if (arg0 == 1) {
            var2 = this.field2217;
            var3 = this.field2241;
            var4 = this.field2244;
        }
        if (var2 == -1) {
            return null;
        }
        class212 var5 = class212.method3915(Statics.field2209, var2, 0);
        if (var3 != -1) {
            class212 var6 = class212.method3915(Statics.field2209, var3, 0);
            if (var4 == -1) {
                class212[] var9 = new class212[] { var5, var6 };
                var5 = new class212(var9, 2);
            } else {
                class212 var7 = class212.method3915(Statics.field2209, var4, 0);
                class212[] var8 = new class212[] { var5, var6, var7 };
                var5 = new class212(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2208 != 0) {
            var5.method3901(0, this.field2208, 0);
        }
        if (arg0 == 1 && this.field2256 != 0) {
            var5.method3901(0, this.field2256, 0);
        }
        if (this.field2246 != null) {
            for (int var10 = 0; var10 < this.field2246.length; var10++) {
                var5.method3902(this.field2246[var10], this.field2219[var10]);
            }
        }
        if (this.field2220 != null) {
            for (int var11 = 0; var11 < this.field2220.length; var11++) {
                var5.method3943(this.field2220[var11], this.field2221[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gr.t(IB)Z")
    public final boolean method3659(int arg0) {
        int var2 = this.field2245;
        int var3 = this.field2229;
        if (arg0 == 1) {
            var2 = this.field2247;
            var3 = this.field2207;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2209.method5983(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2209.method5983(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gr.h(II)Lhe;")
    public final class212 method3660(int arg0) {
        int var2 = this.field2245;
        int var3 = this.field2229;
        if (arg0 == 1) {
            var2 = this.field2247;
            var3 = this.field2207;
        }
        if (var2 == -1) {
            return null;
        }
        class212 var4 = class212.method3915(Statics.field2209, var2, 0);
        if (var3 != -1) {
            class212 var5 = class212.method3915(Statics.field2209, var3, 0);
            class212[] var6 = new class212[] { var4, var5 };
            var4 = new class212(var6, 2);
        }
        if (this.field2246 != null) {
            for (int var7 = 0; var7 < this.field2246.length; var7++) {
                var4.method3902(this.field2246[var7], this.field2219[var7]);
            }
        }
        if (this.field2220 != null) {
            for (int var8 = 0; var8 < this.field2220.length; var8++) {
                var4.method3943(this.field2220[var8], this.field2221[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gr.p(III)I")
    public int method3661(int arg0, int arg1) {
        class450 var3 = this.field2260;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class439 var5 = (class439) var3.method7691((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4708;
            }
        }
        return var4;
    }

    @ObfuscatedName("gr.o(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3662(int arg0, String arg1) {
        return class187.method3012(this.field2260, arg0, arg1);
    }

    @ObfuscatedName("gr.u(B)I")
    public int method3713() {
        if (this.field2236 == -1 || this.field2211 == null) {
            return -1;
        } else if (this.field2236 >= 0) {
            return this.field2211[this.field2236] == null ? -1 : this.field2236;
        } else if (class330.field3995.equalsIgnoreCase(this.field2211[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("fg.x(I)V")
    public static void method3220() {
        field2212.method5033();
        field2213.method5033();
        field2214.method5033();
    }

    @ObfuscatedName("gn.a(ZI)V")
    public static void method3567(boolean arg0) {
        if (Statics.field2210 != arg0) {
            method3220();
            Statics.field2210 = arg0;
        }
    }

    @ObfuscatedName("gr.q(I)Z")
    public boolean method3706() {
        return this.field2219 != null;
    }

    @ObfuscatedName("gr.d(I)Z")
    public boolean method3707() {
        return this.field2221 != null;
    }
}
