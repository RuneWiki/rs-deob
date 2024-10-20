package deob;

@ObfuscatedName("hz")
public class class206 extends class457 {

    @ObfuscatedName("hz.af")
    public static class287 field2207 = new class287(64);

    @ObfuscatedName("hz.ao")
    public static class287 field2204 = new class287(50);

    @ObfuscatedName("hz.aa")
    public static class287 field2203 = new class287(200);

    @ObfuscatedName("hz.ad")
    public int field2206;

    @ObfuscatedName("hz.ac")
    public int field2255;

    @ObfuscatedName("hz.ag")
    public String field2208 = class350.field3887;

    @ObfuscatedName("hz.ar")
    public short[] field2209;

    @ObfuscatedName("hz.ah")
    public short[] field2210;

    @ObfuscatedName("hz.az")
    public short[] field2211;

    @ObfuscatedName("hz.au")
    public short[] field2245;

    @ObfuscatedName("hz.ai")
    public int field2248 = 2000;

    @ObfuscatedName("hz.aq")
    public int field2214 = 0;

    @ObfuscatedName("hz.aw")
    public int field2221 = 0;

    @ObfuscatedName("hz.ay")
    public int field2216 = 0;

    @ObfuscatedName("hz.al")
    public int field2217 = 0;

    @ObfuscatedName("hz.am")
    public int field2226 = 0;

    @ObfuscatedName("hz.bj")
    public int field2213 = 0;

    @ObfuscatedName("hz.bo")
    public int field2246 = 1;

    @ObfuscatedName("hz.bq")
    public int field2202 = -1;

    @ObfuscatedName("hz.bg")
    public int field2222 = -1;

    @ObfuscatedName("hz.bf")
    public int field2223 = -1;

    @ObfuscatedName("hz.bd")
    public boolean field2224 = false;

    @ObfuscatedName("hz.ba")
    public String[] field2205 = new String[] { null, null, class350.field3880, null, null };

    @ObfuscatedName("hz.bn")
    public String[] field2231 = new String[] { null, null, null, null, class350.field3881 };

    @ObfuscatedName("hz.bx")
    public int field2227 = -2;

    @ObfuscatedName("hz.be")
    public int field2228 = -1;

    @ObfuscatedName("hz.bh")
    public int field2229 = -1;

    @ObfuscatedName("hz.bp")
    public int field2230 = 0;

    @ObfuscatedName("hz.bw")
    public int field2218 = -1;

    @ObfuscatedName("hz.bi")
    public int field2232 = -1;

    @ObfuscatedName("hz.bk")
    public int field2233 = 0;

    @ObfuscatedName("hz.bv")
    public int field2234 = -1;

    @ObfuscatedName("hz.bz")
    public int field2235 = -1;

    @ObfuscatedName("hz.bm")
    public int field2220 = -1;

    @ObfuscatedName("hz.br")
    public int field2237 = -1;

    @ObfuscatedName("hz.bu")
    public int field2238 = -1;

    @ObfuscatedName("hz.by")
    public int field2219 = -1;

    @ObfuscatedName("hz.bt")
    public int[] field2256;

    @ObfuscatedName("hz.bl")
    public int[] field2197;

    @ObfuscatedName("hz.cs")
    public int field2242 = -1;

    @ObfuscatedName("hz.cu")
    public int field2243 = -1;

    @ObfuscatedName("hz.ca")
    public int field2244 = 128;

    @ObfuscatedName("hz.cf")
    public int field2241 = 128;

    @ObfuscatedName("hz.cw")
    public int field2225 = 128;

    @ObfuscatedName("hz.ch")
    public int field2239 = 0;

    @ObfuscatedName("hz.cp")
    public int field2240 = 0;

    @ObfuscatedName("hz.cy")
    public int field2249 = 0;

    @ObfuscatedName("hz.cd")
    public int field2250 = 0;

    @ObfuscatedName("hz.cv")
    public class476 field2251;

    @ObfuscatedName("hz.cr")
    public boolean field2252 = false;

    @ObfuscatedName("hz.cm")
    public int field2253 = -1;

    @ObfuscatedName("hz.cg")
    public int field2254 = -1;

    @ObfuscatedName("hz.ci")
    public int field2236 = -1;

    @ObfuscatedName("hz.cb")
    public int field2212 = -1;

    @ObfuscatedName("lw.at(II)Lhz;")
    public static class206 method5155(int arg0) {
        class206 var1 = (class206) field2207.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2215.method6080(10, arg0);
        class206 var3 = new class206();
        var3.field2206 = arg0;
        if (var2 != null) {
            var3.method3622(new class501(var2));
        }
        var3.method3638();
        if (var3.field2243 != -1) {
            var3.method3641(method5155(var3.field2243), method5155(var3.field2242));
        }
        if (var3.field2254 != -1) {
            var3.method3625(method5155(var3.field2254), method5155(var3.field2253));
        }
        if (var3.field2212 != -1) {
            var3.method3626(method5155(var3.field2212), method5155(var3.field2236));
        }
        if (!Statics.field2247 && var3.field2224) {
            var3.field2208 = var3.field2208 + class350.field4168;
            var3.field2252 = false;
            for (int var4 = 0; var4 < var3.field2205.length; var4++) {
                var3.field2205[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2231.length; var5++) {
                if (var5 != 4) {
                    var3.field2231[var5] = null;
                }
            }
            var3.field2227 = -2;
            var3.field2249 = 0;
            if (var3.field2251 != null) {
                boolean var6 = false;
                for (class461 var7 = var3.field2251.method7852(); var7 != null; var7 = var3.field2251.method7862()) {
                    class202 var8 = class202.method6280((int) var7.field4757);
                    if (var8.field2105) {
                        var7.method7560();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2251 = null;
                }
            }
        }
        field2207.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hz.an(I)V")
    public void method3638() {
        if (this.field2213 == 1) {
            this.field2250 = 0;
        }
    }

    @ObfuscatedName("hz.av(Ltz;I)V")
    public void method3622(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3623(arg0, var2);
        }
    }

    @ObfuscatedName("hz.as(Ltz;II)V")
    public void method3623(class501 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2255 = arg0.method8195();
        } else if (arg1 == 2) {
            this.field2208 = arg0.method8253();
        } else if (arg1 == 4) {
            this.field2248 = arg0.method8195();
        } else if (arg1 == 5) {
            this.field2214 = arg0.method8195();
        } else if (arg1 == 6) {
            this.field2221 = arg0.method8195();
        } else if (arg1 == 7) {
            this.field2217 = arg0.method8195();
            if (this.field2217 > 32767) {
                this.field2217 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2226 = arg0.method8195();
            if (this.field2226 > 32767) {
                this.field2226 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8253();
        } else if (arg1 == 11) {
            this.field2213 = 1;
        } else if (arg1 == 12) {
            this.field2246 = arg0.method8134();
        } else if (arg1 == 13) {
            this.field2202 = arg0.method8129();
        } else if (arg1 == 14) {
            this.field2222 = arg0.method8129();
        } else if (arg1 == 16) {
            this.field2224 = true;
        } else if (arg1 == 23) {
            this.field2228 = arg0.method8195();
            this.field2230 = arg0.method8129();
        } else if (arg1 == 24) {
            this.field2229 = arg0.method8195();
        } else if (arg1 == 25) {
            this.field2218 = arg0.method8195();
            this.field2233 = arg0.method8129();
        } else if (arg1 == 26) {
            this.field2232 = arg0.method8195();
        } else if (arg1 == 27) {
            this.field2223 = arg0.method8129();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2205[arg1 - 30] = arg0.method8253();
            if (this.field2205[arg1 - 30].equalsIgnoreCase(class350.field4141)) {
                this.field2205[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2231[arg1 - 35] = arg0.method8253();
        } else if (arg1 == 40) {
            int var3 = arg0.method8129();
            this.field2209 = new short[var3];
            this.field2210 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2209[var4] = (short) arg0.method8195();
                this.field2210[var4] = (short) arg0.method8195();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8129();
            this.field2211 = new short[var5];
            this.field2245 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2211[var6] = (short) arg0.method8195();
                this.field2245[var6] = (short) arg0.method8195();
            }
        } else if (arg1 == 42) {
            this.field2227 = arg0.method8130();
        } else if (arg1 == 65) {
            this.field2252 = true;
        } else if (arg1 == 75) {
            this.field2250 = arg0.method8268();
        } else if (arg1 == 78) {
            this.field2234 = arg0.method8195();
        } else if (arg1 == 79) {
            this.field2235 = arg0.method8195();
        } else if (arg1 == 90) {
            this.field2220 = arg0.method8195();
        } else if (arg1 == 91) {
            this.field2238 = arg0.method8195();
        } else if (arg1 == 92) {
            this.field2237 = arg0.method8195();
        } else if (arg1 == 93) {
            this.field2219 = arg0.method8195();
        } else if (arg1 == 94) {
            arg0.method8195();
        } else if (arg1 == 95) {
            this.field2216 = arg0.method8195();
        } else if (arg1 == 97) {
            this.field2242 = arg0.method8195();
        } else if (arg1 == 98) {
            this.field2243 = arg0.method8195();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2256 == null) {
                this.field2256 = new int[10];
                this.field2197 = new int[10];
            }
            this.field2256[arg1 - 100] = arg0.method8195();
            this.field2197[arg1 - 100] = arg0.method8195();
        } else if (arg1 == 110) {
            this.field2244 = arg0.method8195();
        } else if (arg1 == 111) {
            this.field2241 = arg0.method8195();
        } else if (arg1 == 112) {
            this.field2225 = arg0.method8195();
        } else if (arg1 == 113) {
            this.field2239 = arg0.method8130();
        } else if (arg1 == 114) {
            this.field2240 = arg0.method8130() * 5;
        } else if (arg1 == 115) {
            this.field2249 = arg0.method8129();
        } else if (arg1 == 139) {
            this.field2253 = arg0.method8195();
        } else if (arg1 == 140) {
            this.field2254 = arg0.method8195();
        } else if (arg1 == 148) {
            this.field2236 = arg0.method8195();
        } else if (arg1 == 149) {
            this.field2212 = arg0.method8195();
        } else if (arg1 == 249) {
            this.field2251 = class191.method661(arg0, this.field2251);
        }
    }

    @ObfuscatedName("hz.ax(Lhz;Lhz;I)V")
    public void method3641(class206 arg0, class206 arg1) {
        this.field2255 = arg0.field2255;
        this.field2248 = arg0.field2248;
        this.field2214 = arg0.field2214;
        this.field2221 = arg0.field2221;
        this.field2216 = arg0.field2216;
        this.field2217 = arg0.field2217;
        this.field2226 = arg0.field2226;
        this.field2209 = arg0.field2209;
        this.field2210 = arg0.field2210;
        this.field2211 = arg0.field2211;
        this.field2245 = arg0.field2245;
        this.field2208 = arg1.field2208;
        this.field2224 = arg1.field2224;
        this.field2246 = arg1.field2246;
        this.field2213 = 1;
    }

    @ObfuscatedName("hz.ap(Lhz;Lhz;B)V")
    public void method3625(class206 arg0, class206 arg1) {
        this.field2255 = arg0.field2255;
        this.field2248 = arg0.field2248;
        this.field2214 = arg0.field2214;
        this.field2221 = arg0.field2221;
        this.field2216 = arg0.field2216;
        this.field2217 = arg0.field2217;
        this.field2226 = arg0.field2226;
        this.field2209 = arg1.field2209;
        this.field2210 = arg1.field2210;
        this.field2211 = arg1.field2211;
        this.field2245 = arg1.field2245;
        this.field2208 = arg1.field2208;
        this.field2224 = arg1.field2224;
        this.field2213 = arg1.field2213;
        this.field2202 = arg1.field2202;
        this.field2222 = arg1.field2222;
        this.field2223 = arg1.field2223;
        this.field2228 = arg1.field2228;
        this.field2229 = arg1.field2229;
        this.field2234 = arg1.field2234;
        this.field2218 = arg1.field2218;
        this.field2232 = arg1.field2232;
        this.field2235 = arg1.field2235;
        this.field2220 = arg1.field2220;
        this.field2237 = arg1.field2237;
        this.field2238 = arg1.field2238;
        this.field2219 = arg1.field2219;
        this.field2249 = arg1.field2249;
        this.field2205 = arg1.field2205;
        this.field2250 = arg1.field2250;
        this.field2231 = new String[5];
        if (arg1.field2231 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2231[var3] = arg1.field2231[var3];
            }
        }
        this.field2231[4] = class350.field3886;
        this.field2246 = 0;
    }

    @ObfuscatedName("hz.ab(Lhz;Lhz;B)V")
    public void method3626(class206 arg0, class206 arg1) {
        this.field2255 = arg0.field2255;
        this.field2248 = arg0.field2248;
        this.field2214 = arg0.field2214;
        this.field2221 = arg0.field2221;
        this.field2216 = arg0.field2216;
        this.field2217 = arg0.field2217;
        this.field2226 = arg0.field2226;
        this.field2209 = arg0.field2209;
        this.field2210 = arg0.field2210;
        this.field2211 = arg0.field2211;
        this.field2245 = arg0.field2245;
        this.field2213 = arg0.field2213;
        this.field2208 = arg1.field2208;
        this.field2246 = 0;
        this.field2224 = false;
        this.field2252 = false;
    }

    @ObfuscatedName("hz.ak(II)Lit;")
    public final class221 method3646(int arg0) {
        if (this.field2256 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2197[var3] && this.field2197[var3] != 0) {
                    var2 = this.field2256[var3];
                }
            }
            if (var2 != -1) {
                return method5155(var2).method3646(1);
            }
        }
        class221 var4 = class221.method3913(Statics.field2201, this.field2255, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2244 != 128 || this.field2241 != 128 || this.field2225 != 128) {
            var4.method3929(this.field2244, this.field2241, this.field2225);
        }
        if (this.field2209 != null) {
            for (int var5 = 0; var5 < this.field2209.length; var5++) {
                var4.method3995(this.field2209[var5], this.field2210[var5]);
            }
        }
        if (this.field2211 != null) {
            for (int var6 = 0; var6 < this.field2211.length; var6++) {
                var4.method3965(this.field2211[var6], this.field2245[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.ae(IB)Ljd;")
    public final class239 method3628(int arg0) {
        if (this.field2256 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2197[var3] && this.field2197[var3] != 0) {
                    var2 = this.field2256[var3];
                }
            }
            if (var2 != -1) {
                return method5155(var2).method3628(1);
            }
        }
        class239 var4 = (class239) field2204.method5121((long) this.field2206);
        if (var4 != null) {
            return var4;
        }
        class221 var5 = class221.method3913(Statics.field2201, this.field2255, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2244 != 128 || this.field2241 != 128 || this.field2225 != 128) {
            var5.method3929(this.field2244, this.field2241, this.field2225);
        }
        if (this.field2209 != null) {
            for (int var6 = 0; var6 < this.field2209.length; var6++) {
                var5.method3995(this.field2209[var6], this.field2210[var6]);
            }
        }
        if (this.field2211 != null) {
            for (int var7 = 0; var7 < this.field2211.length; var7++) {
                var5.method3965(this.field2211[var7], this.field2245[var7]);
            }
        }
        class239 var8 = var5.method3934(this.field2239 + 64, this.field2240 + 768, -50, -10, -50);
        var8.field2737 = true;
        field2204.method5123(var8, (long) this.field2206);
        return var8;
    }

    @ObfuscatedName("hz.af(II)Lhz;")
    public class206 method3629(int arg0) {
        if (this.field2256 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2197[var3] && this.field2197[var3] != 0) {
                    var2 = this.field2256[var3];
                }
            }
            if (var2 != -1) {
                return method5155(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dz.ao(IIIIIZI)Ltm;")
    public static final class515 method2154(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class515 var8 = (class515) field2203.method5121(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class206 var9 = method5155(arg0);
        if (arg1 > 1 && var9.field2256 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2197[var11] && var9.field2197[var11] != 0) {
                    var10 = var9.field2256[var11];
                }
            }
            if (var10 != -1) {
                var9 = method5155(var10);
            }
        }
        class239 var12 = var9.method3628(1);
        if (var12 == null) {
            return null;
        }
        class515 var13 = null;
        if (var9.field2243 != -1) {
            var13 = method2154(var9.field2242, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2254 != -1) {
            var13 = method2154(var9.field2253, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2212 != -1) {
            var13 = method2154(var9.field2236, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5091;
        int var15 = Statics.field5086;
        int var16 = Statics.field5088;
        float[] var17 = Statics.field5089;
        int[] var18 = new int[4];
        class511.method8462(var18);
        class515 var19 = new class515(36, 32);
        class226.method4023(var19.field5123, 36, 32, (float[]) null);
        class511.method8464();
        class226.method4022();
        class226.method4027(16, 16);
        class226.field2521.field2806 = false;
        if (var9.field2212 != -1) {
            var13.method8661(0, 0);
        }
        int var20 = var9.field2248;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class226.field2523[var9.field2214] * var20 >> 16;
        int var22 = class226.field2520[var9.field2214] * var20 >> 16;
        var12.method4492();
        var12.method4433(0, var9.field2221, var9.field2216, var9.field2214, var9.field2217, var9.field2226 + var12.field2621 / 2 + var21, var9.field2226 + var22);
        if (var9.field2254 != -1) {
            var13.method8661(0, 0);
        }
        if (arg2 >= 1) {
            var19.method8688(1);
        }
        if (arg2 >= 2) {
            var19.method8688(16777215);
        }
        if (arg3 != 0) {
            var19.method8648(arg3);
        }
        class226.method4023(var19.field5123, 36, 32, (float[]) null);
        if (var9.field2243 != -1) {
            var13.method8661(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2213 == 1) {
            class392 var23 = Statics.field2936;
            String var24;
            if (arg1 < 100000) {
                var24 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var24 = "<col=ffffff>" + arg1 / 1000 + class350.field4057 + "</col>";
            } else {
                var24 = "<col=00ff80>" + arg1 / 1000000 + class350.field3890 + "</col>";
            }
            var23.method6828(var24, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2203.method5123(var19, var6);
        }
        class226.method4023(var14, var15, var16, var17);
        class511.method8463(var18);
        class226.method4022();
        class226.field2521.field2806 = true;
        return var19;
    }

    @ObfuscatedName("hz.aa(II)Z")
    public final boolean method3630(int arg0) {
        int var2 = this.field2228;
        int var3 = this.field2229;
        int var4 = this.field2234;
        if (arg0 == 1) {
            var2 = this.field2218;
            var3 = this.field2232;
            var4 = this.field2235;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2201.method6082(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2201.method6082(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2201.method6082(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("hz.aj(II)Lit;")
    public final class221 method3659(int arg0) {
        int var2 = this.field2228;
        int var3 = this.field2229;
        int var4 = this.field2234;
        if (arg0 == 1) {
            var2 = this.field2218;
            var3 = this.field2232;
            var4 = this.field2235;
        }
        if (var2 == -1) {
            return null;
        }
        class221 var5 = class221.method3913(Statics.field2201, var2, 0);
        if (var3 != -1) {
            class221 var6 = class221.method3913(Statics.field2201, var3, 0);
            if (var4 == -1) {
                class221[] var9 = new class221[] { var5, var6 };
                var5 = new class221(var9, 2);
            } else {
                class221 var7 = class221.method3913(Statics.field2201, var4, 0);
                class221[] var8 = new class221[] { var5, var6, var7 };
                var5 = new class221(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2230 != 0) {
            var5.method3925(0, this.field2230, 0);
        }
        if (arg0 == 1 && this.field2233 != 0) {
            var5.method3925(0, this.field2233, 0);
        }
        if (this.field2209 != null) {
            for (int var10 = 0; var10 < this.field2209.length; var10++) {
                var5.method3995(this.field2209[var10], this.field2210[var10]);
            }
        }
        if (this.field2211 != null) {
            for (int var11 = 0; var11 < this.field2211.length; var11++) {
                var5.method3965(this.field2211[var11], this.field2245[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("hz.ad(II)Z")
    public final boolean method3632(int arg0) {
        int var2 = this.field2220;
        int var3 = this.field2237;
        if (arg0 == 1) {
            var2 = this.field2238;
            var3 = this.field2219;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2201.method6082(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2201.method6082(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("hz.ac(II)Lit;")
    public final class221 method3633(int arg0) {
        int var2 = this.field2220;
        int var3 = this.field2237;
        if (arg0 == 1) {
            var2 = this.field2238;
            var3 = this.field2219;
        }
        if (var2 == -1) {
            return null;
        }
        class221 var4 = class221.method3913(Statics.field2201, var2, 0);
        if (var3 != -1) {
            class221 var5 = class221.method3913(Statics.field2201, var3, 0);
            class221[] var6 = new class221[] { var4, var5 };
            var4 = new class221(var6, 2);
        }
        if (this.field2209 != null) {
            for (int var7 = 0; var7 < this.field2209.length; var7++) {
                var4.method3995(this.field2209[var7], this.field2210[var7]);
            }
        }
        if (this.field2211 != null) {
            for (int var8 = 0; var8 < this.field2211.length; var8++) {
                var4.method3965(this.field2211[var8], this.field2245[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.ag(IIB)I")
    public int method3634(int arg0, int arg1) {
        class476 var3 = this.field2251;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class460 var5 = (class460) var3.method7848((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4754;
            }
        }
        return var4;
    }

    @ObfuscatedName("hz.ar(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3635(int arg0, String arg1) {
        return class191.method3094(this.field2251, arg0, arg1);
    }

    @ObfuscatedName("hz.ah(S)I")
    public int method3636() {
        if (this.field2227 == -1 || this.field2231 == null) {
            return -1;
        } else if (this.field2227 >= 0) {
            return this.field2231[this.field2227] == null ? -1 : this.field2227;
        } else if (class350.field3881.equalsIgnoreCase(this.field2231[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("gt.az(B)V")
    public static void method3095() {
        field2203.method5124();
    }

    @ObfuscatedName("il.au(ZB)V")
    public static void method3820(boolean arg0) {
        if (Statics.field2247 != arg0) {
            field2207.method5124();
            field2204.method5124();
            field2203.method5124();
            Statics.field2247 = arg0;
        }
    }

    @ObfuscatedName("hz.ai(B)Z")
    public boolean method3637() {
        return this.field2210 != null;
    }

    @ObfuscatedName("hz.aq(I)Z")
    public boolean method3681() {
        return this.field2245 != null;
    }
}
