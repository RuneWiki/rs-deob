package deob;

@ObfuscatedName("hc")
public class class208 extends class470 {

    @ObfuscatedName("hc.ap")
    public static class289 field2204 = new class289(64);

    @ObfuscatedName("hc.aq")
    public static class289 field2211 = new class289(50);

    @ObfuscatedName("hc.at")
    public static class289 field2244 = new class289(200);

    @ObfuscatedName("hc.ax")
    public int field2222;

    @ObfuscatedName("hc.aa")
    public int field2186;

    @ObfuscatedName("hc.au")
    public String field2228 = class353.field3906;

    @ObfuscatedName("hc.ae")
    public short[] field2191;

    @ObfuscatedName("hc.ab")
    public short[] field2196;

    @ObfuscatedName("hc.ad")
    public short[] field2197;

    @ObfuscatedName("hc.ao")
    public short[] field2198;

    @ObfuscatedName("hc.ac")
    public int field2199 = 2000;

    @ObfuscatedName("hc.ak")
    public int field2200 = 0;

    @ObfuscatedName("hc.an")
    public int field2190 = 0;

    @ObfuscatedName("hc.af")
    public int field2202 = 0;

    @ObfuscatedName("hc.ai")
    public int field2203 = 0;

    @ObfuscatedName("hc.al")
    public int field2201 = 0;

    @ObfuscatedName("hc.bn")
    public int field2205 = 0;

    @ObfuscatedName("hc.ba")
    public int field2206 = 1;

    @ObfuscatedName("hc.bf")
    public int field2239 = -1;

    @ObfuscatedName("hc.bs")
    public int field2208 = -1;

    @ObfuscatedName("hc.bp")
    public int field2209 = -1;

    @ObfuscatedName("hc.bv")
    public boolean field2210 = false;

    @ObfuscatedName("hc.bq")
    public String[] field2189 = new String[] { null, null, class353.field3899, null, null };

    @ObfuscatedName("hc.bo")
    public String[] field2212 = new String[] { null, null, null, null, class353.field4028 };

    @ObfuscatedName("hc.bw")
    public int field2213 = -2;

    @ObfuscatedName("hc.be")
    public int field2214 = -1;

    @ObfuscatedName("hc.bc")
    public int field2215 = -1;

    @ObfuscatedName("hc.bi")
    public int field2216 = 0;

    @ObfuscatedName("hc.bu")
    public int field2225 = -1;

    @ObfuscatedName("hc.bk")
    public int field2218 = -1;

    @ObfuscatedName("hc.bz")
    public int field2219 = 0;

    @ObfuscatedName("hc.bx")
    public int field2220 = -1;

    @ObfuscatedName("hc.bh")
    public int field2221 = -1;

    @ObfuscatedName("hc.bm")
    public int field2194 = -1;

    @ObfuscatedName("hc.bl")
    public int field2223 = -1;

    @ObfuscatedName("hc.bt")
    public int field2224 = -1;

    @ObfuscatedName("hc.by")
    public int field2234 = -1;

    @ObfuscatedName("hc.bg")
    public int[] field2242;

    @ObfuscatedName("hc.bj")
    public int[] field2195;

    @ObfuscatedName("hc.ct")
    public int field2227 = -1;

    @ObfuscatedName("hc.cf")
    public int field2229 = -1;

    @ObfuscatedName("hc.cz")
    public int field2230 = 128;

    @ObfuscatedName("hc.cb")
    public int field2231 = 128;

    @ObfuscatedName("hc.cs")
    public int field2232 = 128;

    @ObfuscatedName("hc.cj")
    public int field2233 = 0;

    @ObfuscatedName("hc.cn")
    public int field2237 = 0;

    @ObfuscatedName("hc.cw")
    public int field2235 = 0;

    @ObfuscatedName("hc.ce")
    public int field2241 = 0;

    @ObfuscatedName("hc.cq")
    public class489 field2193;

    @ObfuscatedName("hc.cm")
    public boolean field2238 = false;

    @ObfuscatedName("hc.ca")
    public int field2217 = -1;

    @ObfuscatedName("hc.cx")
    public int field2240 = -1;

    @ObfuscatedName("hc.co")
    public int field2236 = -1;

    @ObfuscatedName("hc.cu")
    public int field2207 = -1;

    @ObfuscatedName("ck.aw(Lnd;Lnd;ZLpc;I)V")
    public static void method1979(class360 arg0, class360 arg1, boolean arg2, class395 arg3) {
        Statics.field2621 = arg0;
        Statics.field1638 = arg1;
        Statics.field5025 = arg2;
        Statics.field2672 = Statics.field2621.method6127(10);
        Statics.field2447 = arg3;
    }

    @ObfuscatedName("ev.ay(II)Lhc;")
    public static class208 method2788(int arg0) {
        class208 var1 = (class208) field2204.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2621.method6117(10, arg0);
        class208 var3 = new class208();
        var3.field2222 = arg0;
        if (var2 != null) {
            var3.method3631(new class514(var2));
        }
        var3.method3630();
        if (var3.field2229 != -1) {
            var3.method3633(method2788(var3.field2229), method2788(var3.field2227));
        }
        if (var3.field2240 != -1) {
            var3.method3670(method2788(var3.field2240), method2788(var3.field2217));
        }
        if (var3.field2207 != -1) {
            var3.method3674(method2788(var3.field2207), method2788(var3.field2236));
        }
        if (!Statics.field5025 && var3.field2210) {
            if (var3.field2229 == -1 && var3.field2240 == -1 && var3.field2207 == -1) {
                var3.field2228 = var3.field2228 + class353.field3922;
            }
            var3.field2238 = false;
            for (int var4 = 0; var4 < var3.field2189.length; var4++) {
                var3.field2189[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2212.length; var5++) {
                if (var5 != 4) {
                    var3.field2212[var5] = null;
                }
            }
            var3.field2213 = -2;
            var3.field2235 = 0;
            if (var3.field2193 != null) {
                boolean var6 = false;
                for (class474 var7 = var3.field2193.method7965(); var7 != null; var7 = var3.field2193.method7973()) {
                    class203 var8 = class203.method5455((int) var7.field4819);
                    if (var8.field2102) {
                        var7.method7662();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2193 = null;
                }
            }
        }
        field2204.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hc.ar(I)V")
    public void method3630() {
        if (this.field2205 == 1) {
            this.field2241 = 0;
        }
    }

    @ObfuscatedName("hc.am(Lty;I)V")
    public void method3631(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3632(arg0, var2);
        }
    }

    @ObfuscatedName("hc.as(Lty;II)V")
    public void method3632(class514 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2186 = arg0.method8246();
        } else if (arg1 == 2) {
            this.field2228 = arg0.method8369();
        } else if (arg1 == 4) {
            this.field2199 = arg0.method8246();
        } else if (arg1 == 5) {
            this.field2200 = arg0.method8246();
        } else if (arg1 == 6) {
            this.field2190 = arg0.method8246();
        } else if (arg1 == 7) {
            this.field2203 = arg0.method8246();
            if (this.field2203 > 32767) {
                this.field2203 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2201 = arg0.method8246();
            if (this.field2201 > 32767) {
                this.field2201 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8369();
        } else if (arg1 == 11) {
            this.field2205 = 1;
        } else if (arg1 == 12) {
            this.field2206 = arg0.method8496();
        } else if (arg1 == 13) {
            this.field2239 = arg0.method8244();
        } else if (arg1 == 14) {
            this.field2208 = arg0.method8244();
        } else if (arg1 == 16) {
            this.field2210 = true;
        } else if (arg1 == 23) {
            this.field2214 = arg0.method8246();
            this.field2216 = arg0.method8244();
        } else if (arg1 == 24) {
            this.field2215 = arg0.method8246();
        } else if (arg1 == 25) {
            this.field2225 = arg0.method8246();
            this.field2219 = arg0.method8244();
        } else if (arg1 == 26) {
            this.field2218 = arg0.method8246();
        } else if (arg1 == 27) {
            this.field2209 = arg0.method8244();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2189[arg1 - 30] = arg0.method8369();
            if (this.field2189[arg1 - 30].equalsIgnoreCase(class353.field4029)) {
                this.field2189[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2212[arg1 - 35] = arg0.method8369();
        } else if (arg1 == 40) {
            int var3 = arg0.method8244();
            this.field2191 = new short[var3];
            this.field2196 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2191[var4] = (short) arg0.method8246();
                this.field2196[var4] = (short) arg0.method8246();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8244();
            this.field2197 = new short[var5];
            this.field2198 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2197[var6] = (short) arg0.method8246();
                this.field2198[var6] = (short) arg0.method8246();
            }
        } else if (arg1 == 42) {
            this.field2213 = arg0.method8264();
        } else if (arg1 == 65) {
            this.field2238 = true;
        } else if (arg1 == 75) {
            this.field2241 = arg0.method8497();
        } else if (arg1 == 78) {
            this.field2220 = arg0.method8246();
        } else if (arg1 == 79) {
            this.field2221 = arg0.method8246();
        } else if (arg1 == 90) {
            this.field2194 = arg0.method8246();
        } else if (arg1 == 91) {
            this.field2224 = arg0.method8246();
        } else if (arg1 == 92) {
            this.field2223 = arg0.method8246();
        } else if (arg1 == 93) {
            this.field2234 = arg0.method8246();
        } else if (arg1 == 94) {
            arg0.method8246();
        } else if (arg1 == 95) {
            this.field2202 = arg0.method8246();
        } else if (arg1 == 97) {
            this.field2227 = arg0.method8246();
        } else if (arg1 == 98) {
            this.field2229 = arg0.method8246();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2242 == null) {
                this.field2242 = new int[10];
                this.field2195 = new int[10];
            }
            this.field2242[arg1 - 100] = arg0.method8246();
            this.field2195[arg1 - 100] = arg0.method8246();
        } else if (arg1 == 110) {
            this.field2230 = arg0.method8246();
        } else if (arg1 == 111) {
            this.field2231 = arg0.method8246();
        } else if (arg1 == 112) {
            this.field2232 = arg0.method8246();
        } else if (arg1 == 113) {
            this.field2233 = arg0.method8264();
        } else if (arg1 == 114) {
            this.field2237 = arg0.method8264();
        } else if (arg1 == 115) {
            this.field2235 = arg0.method8244();
        } else if (arg1 == 139) {
            this.field2217 = arg0.method8246();
        } else if (arg1 == 140) {
            this.field2240 = arg0.method8246();
        } else if (arg1 == 148) {
            this.field2236 = arg0.method8246();
        } else if (arg1 == 149) {
            this.field2207 = arg0.method8246();
        } else if (arg1 == 249) {
            this.field2193 = class192.method2956(arg0, this.field2193);
        }
    }

    @ObfuscatedName("hc.aj(Lhc;Lhc;I)V")
    public void method3633(class208 arg0, class208 arg1) {
        this.field2186 = arg0.field2186;
        this.field2199 = arg0.field2199;
        this.field2200 = arg0.field2200;
        this.field2190 = arg0.field2190;
        this.field2202 = arg0.field2202;
        this.field2203 = arg0.field2203;
        this.field2201 = arg0.field2201;
        this.field2191 = arg0.field2191;
        this.field2196 = arg0.field2196;
        this.field2197 = arg0.field2197;
        this.field2198 = arg0.field2198;
        this.field2228 = arg1.field2228;
        this.field2210 = arg1.field2210;
        this.field2206 = arg1.field2206;
        this.field2205 = 1;
    }

    @ObfuscatedName("hc.ag(Lhc;Lhc;B)V")
    public void method3670(class208 arg0, class208 arg1) {
        this.field2186 = arg0.field2186;
        this.field2199 = arg0.field2199;
        this.field2200 = arg0.field2200;
        this.field2190 = arg0.field2190;
        this.field2202 = arg0.field2202;
        this.field2203 = arg0.field2203;
        this.field2201 = arg0.field2201;
        this.field2191 = arg1.field2191;
        this.field2196 = arg1.field2196;
        this.field2197 = arg1.field2197;
        this.field2198 = arg1.field2198;
        this.field2228 = arg1.field2228;
        this.field2210 = arg1.field2210;
        this.field2205 = arg1.field2205;
        this.field2239 = arg1.field2239;
        this.field2208 = arg1.field2208;
        this.field2209 = arg1.field2209;
        this.field2214 = arg1.field2214;
        this.field2215 = arg1.field2215;
        this.field2220 = arg1.field2220;
        this.field2225 = arg1.field2225;
        this.field2218 = arg1.field2218;
        this.field2221 = arg1.field2221;
        this.field2194 = arg1.field2194;
        this.field2223 = arg1.field2223;
        this.field2224 = arg1.field2224;
        this.field2234 = arg1.field2234;
        this.field2235 = arg1.field2235;
        this.field2189 = arg1.field2189;
        this.field2241 = arg1.field2241;
        this.field2212 = new String[5];
        if (arg1.field2212 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2212[var3] = arg1.field2212[var3];
            }
        }
        this.field2212[4] = class353.field3905;
        this.field2206 = 0;
    }

    @ObfuscatedName("hc.az(Lhc;Lhc;B)V")
    public void method3674(class208 arg0, class208 arg1) {
        this.field2186 = arg0.field2186;
        this.field2199 = arg0.field2199;
        this.field2200 = arg0.field2200;
        this.field2190 = arg0.field2190;
        this.field2202 = arg0.field2202;
        this.field2203 = arg0.field2203;
        this.field2201 = arg0.field2201;
        this.field2191 = arg0.field2191;
        this.field2196 = arg0.field2196;
        this.field2197 = arg0.field2197;
        this.field2198 = arg0.field2198;
        this.field2205 = arg0.field2205;
        this.field2228 = arg1.field2228;
        this.field2206 = 0;
        this.field2210 = false;
        this.field2238 = false;
    }

    @ObfuscatedName("hc.av(II)Lie;")
    public final class223 method3636(int arg0) {
        if (this.field2242 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2195[var3] && this.field2195[var3] != 0) {
                    var2 = this.field2242[var3];
                }
            }
            if (var2 != -1) {
                return method2788(var2).method3636(1);
            }
        }
        class223 var4 = class223.method3926(Statics.field1638, this.field2186, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2230 != 128 || this.field2231 != 128 || this.field2232 != 128) {
            var4.method3945(this.field2230, this.field2231, this.field2232);
        }
        if (this.field2191 != null) {
            for (int var5 = 0; var5 < this.field2191.length; var5++) {
                var4.method3942(this.field2191[var5], this.field2196[var5]);
            }
        }
        if (this.field2197 != null) {
            for (int var6 = 0; var6 < this.field2197.length; var6++) {
                var4.method3943(this.field2197[var6], this.field2198[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hc.ap(IB)Ljo;")
    public final class241 method3637(int arg0) {
        if (this.field2242 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2195[var3] && this.field2195[var3] != 0) {
                    var2 = this.field2242[var3];
                }
            }
            if (var2 != -1) {
                return method2788(var2).method3637(1);
            }
        }
        class241 var4 = (class241) field2211.method5152((long) this.field2222);
        if (var4 != null) {
            return var4;
        }
        class223 var5 = class223.method3926(Statics.field1638, this.field2186, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2230 != 128 || this.field2231 != 128 || this.field2232 != 128) {
            var5.method3945(this.field2230, this.field2231, this.field2232);
        }
        if (this.field2191 != null) {
            for (int var6 = 0; var6 < this.field2191.length; var6++) {
                var5.method3942(this.field2191[var6], this.field2196[var6]);
            }
        }
        if (this.field2197 != null) {
            for (int var7 = 0; var7 < this.field2197.length; var7++) {
                var5.method3943(this.field2197[var7], this.field2198[var7]);
            }
        }
        class241 var8 = var5.method3950(this.field2233 + 64, this.field2237 * 5 + 768, -50, -10, -50);
        var8.field2704 = true;
        field2211.method5149(var8, (long) this.field2222);
        return var8;
    }

    @ObfuscatedName("hc.aq(IB)Lhc;")
    public class208 method3638(int arg0) {
        if (this.field2242 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2195[var3] && this.field2195[var3] != 0) {
                    var2 = this.field2242[var3];
                }
            }
            if (var2 != -1) {
                return method2788(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("jd.at(IIIIIZI)Lud;")
    public static final class528 method4376(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class528 var8 = (class528) field2244.method5152(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class208 var9 = method2788(arg0);
        if (arg1 > 1 && var9.field2242 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2195[var11] && var9.field2195[var11] != 0) {
                    var10 = var9.field2242[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2788(var10);
            }
        }
        class241 var12 = var9.method3637(1);
        if (var12 == null) {
            return null;
        }
        class528 var13 = null;
        if (var9.field2229 != -1) {
            var13 = method4376(var9.field2227, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2240 != -1) {
            var13 = method4376(var9.field2217, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2207 != -1) {
            var13 = method4376(var9.field2236, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5137;
        int var15 = Statics.field5138;
        int var16 = Statics.field5139;
        float[] var17 = Statics.field5140;
        int[] var18 = new int[4];
        class524.method8591(var18);
        class528 var19 = new class528(36, 32);
        class228.method4048(var19.field5168, 36, 32, (float[]) null);
        class524.method8652();
        class228.method4049();
        class228.method4052(16, 16);
        class228.field2511.field2793 = false;
        if (var9.field2207 != -1) {
            var13.method8812(0, 0);
        }
        int var20 = var9.field2199;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class228.field2509[var9.field2200] * var20 >> 16;
        int var22 = class228.field2510[var9.field2200] * var20 >> 16;
        var12.method4427();
        var12.method4444(0, var9.field2190, var9.field2202, var9.field2200, var9.field2203, var9.field2201 + var12.field2613 / 2 + var21, var9.field2201 + var22);
        if (var9.field2240 != -1) {
            var13.method8812(0, 0);
        }
        if (arg2 >= 1) {
            var19.method8705(1);
        }
        if (arg2 >= 2) {
            var19.method8705(16777215);
        }
        if (arg3 != 0) {
            var19.method8706(arg3);
        }
        class228.method4048(var19.field5168, 36, 32, (float[]) null);
        if (var9.field2229 != -1) {
            var13.method8812(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2205 == 1) {
            Statics.field2447.method6810(method3239(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2244.method5149(var19, var6);
        }
        class228.method4048(var14, var15, var16, var17);
        class524.method8577(var18);
        class228.method4049();
        class228.field2511.field2793 = true;
        return var19;
    }

    @ObfuscatedName("gi.ah(II)Ljava/lang/String;")
    public static final String method3239(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class353.field4076 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class353.field3972 + "</col>";
        }
    }

    @ObfuscatedName("hc.ax(IB)Z")
    public final boolean method3705(int arg0) {
        int var2 = this.field2214;
        int var3 = this.field2215;
        int var4 = this.field2220;
        if (arg0 == 1) {
            var2 = this.field2225;
            var3 = this.field2218;
            var4 = this.field2221;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1638.method6190(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1638.method6190(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1638.method6190(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("hc.aa(II)Lie;")
    public final class223 method3640(int arg0) {
        int var2 = this.field2214;
        int var3 = this.field2215;
        int var4 = this.field2220;
        if (arg0 == 1) {
            var2 = this.field2225;
            var3 = this.field2218;
            var4 = this.field2221;
        }
        if (var2 == -1) {
            return null;
        }
        class223 var5 = class223.method3926(Statics.field1638, var2, 0);
        if (var3 != -1) {
            class223 var6 = class223.method3926(Statics.field1638, var3, 0);
            if (var4 == -1) {
                class223[] var9 = new class223[] { var5, var6 };
                var5 = new class223(var9, 2);
            } else {
                class223 var7 = class223.method3926(Statics.field1638, var4, 0);
                class223[] var8 = new class223[] { var5, var6, var7 };
                var5 = new class223(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2216 != 0) {
            var5.method3978(0, this.field2216, 0);
        }
        if (arg0 == 1 && this.field2219 != 0) {
            var5.method3978(0, this.field2219, 0);
        }
        if (this.field2191 != null) {
            for (int var10 = 0; var10 < this.field2191.length; var10++) {
                var5.method3942(this.field2191[var10], this.field2196[var10]);
            }
        }
        if (this.field2197 != null) {
            for (int var11 = 0; var11 < this.field2197.length; var11++) {
                var5.method3943(this.field2197[var11], this.field2198[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("hc.au(II)Z")
    public final boolean method3641(int arg0) {
        int var2 = this.field2194;
        int var3 = this.field2223;
        if (arg0 == 1) {
            var2 = this.field2224;
            var3 = this.field2234;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1638.method6190(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1638.method6190(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("hc.ae(II)Lie;")
    public final class223 method3692(int arg0) {
        int var2 = this.field2194;
        int var3 = this.field2223;
        if (arg0 == 1) {
            var2 = this.field2224;
            var3 = this.field2234;
        }
        if (var2 == -1) {
            return null;
        }
        class223 var4 = class223.method3926(Statics.field1638, var2, 0);
        if (var3 != -1) {
            class223 var5 = class223.method3926(Statics.field1638, var3, 0);
            class223[] var6 = new class223[] { var4, var5 };
            var4 = new class223(var6, 2);
        }
        if (this.field2191 != null) {
            for (int var7 = 0; var7 < this.field2191.length; var7++) {
                var4.method3942(this.field2191[var7], this.field2196[var7]);
            }
        }
        if (this.field2197 != null) {
            for (int var8 = 0; var8 < this.field2197.length; var8++) {
                var4.method3943(this.field2197[var8], this.field2198[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hc.ab(III)I")
    public int method3643(int arg0, int arg1) {
        return class192.method3237(this.field2193, arg0, arg1);
    }

    @ObfuscatedName("hc.ad(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3644(int arg0, String arg1) {
        class489 var3 = this.field2193;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class471 var5 = (class471) var3.method7961((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4815;
            }
        }
        return var4;
    }

    @ObfuscatedName("hc.ao(I)I")
    public int method3683() {
        if (this.field2213 == -1 || this.field2212 == null) {
            return -1;
        } else if (this.field2213 >= 0) {
            return this.field2212[this.field2213] == null ? -1 : this.field2213;
        } else if (class353.field4028.equalsIgnoreCase(this.field2212[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cu.ac(I)V")
    public static void method1181() {
        field2204.method5146();
        field2211.method5146();
        field2244.method5146();
    }

    @ObfuscatedName("dv.ak(I)V")
    public static void method2468() {
        field2244.method5146();
    }

    @ObfuscatedName("dz.an(ZI)V")
    public static void method2271(boolean arg0) {
        if (Statics.field5025 != arg0) {
            method1181();
            Statics.field5025 = arg0;
        }
    }

    @ObfuscatedName("hc.af(S)Z")
    public boolean method3654() {
        return this.field2196 != null;
    }

    @ObfuscatedName("hc.ai(I)Z")
    public boolean method3647() {
        return this.field2198 != null;
    }
}
