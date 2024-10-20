package deob;

@ObfuscatedName("id")
public class class223 extends class489 {

    @ObfuscatedName("id.al")
    public static class304 field2306 = new class304(64);

    @ObfuscatedName("id.as")
    public static class304 field2307 = new class304(50);

    @ObfuscatedName("id.ag")
    public static class304 field2313 = new class304(200);

    @ObfuscatedName("id.ax")
    public int field2360;

    @ObfuscatedName("id.ar")
    public int field2310;

    @ObfuscatedName("id.aj")
    public String field2341 = class370.field4272;

    @ObfuscatedName("id.au")
    public String field2335 = class370.field4272;

    @ObfuscatedName("id.ay")
    public short[] field2352;

    @ObfuscatedName("id.ap")
    public short[] field2314;

    @ObfuscatedName("id.av")
    public short[] field2315;

    @ObfuscatedName("id.aa")
    public short[] field2316;

    @ObfuscatedName("id.aq")
    public int field2311 = 2000;

    @ObfuscatedName("id.am")
    public int field2318 = 0;

    @ObfuscatedName("id.ac")
    public int field2319 = 0;

    @ObfuscatedName("id.ae")
    public int field2320 = 0;

    @ObfuscatedName("id.ak")
    public int field2322 = 0;

    @ObfuscatedName("id.bp")
    public int field2302 = 0;

    @ObfuscatedName("id.bf")
    public int field2323 = 0;

    @ObfuscatedName("id.be")
    public int field2324 = 1;

    @ObfuscatedName("id.bn")
    public int field2325 = -1;

    @ObfuscatedName("id.bd")
    public int field2305 = -1;

    @ObfuscatedName("id.bo")
    public int field2327 = -1;

    @ObfuscatedName("id.bx")
    public boolean field2337 = false;

    @ObfuscatedName("id.bl")
    public String[] field2329 = new String[] { null, null, class370.field4008, null, null };

    @ObfuscatedName("id.bh")
    public String[] field2330 = new String[] { null, null, null, null, class370.field4304 };

    @ObfuscatedName("id.bj")
    public int field2331 = -2;

    @ObfuscatedName("id.bu")
    public int field2332 = -1;

    @ObfuscatedName("id.br")
    public int field2333 = -1;

    @ObfuscatedName("id.bb")
    public int field2334 = 0;

    @ObfuscatedName("id.by")
    public int field2300 = -1;

    @ObfuscatedName("id.bk")
    public int field2347 = -1;

    @ObfuscatedName("id.bt")
    public int field2308 = 0;

    @ObfuscatedName("id.bq")
    public int field2312 = -1;

    @ObfuscatedName("id.bi")
    public int field2339 = -1;

    @ObfuscatedName("id.bw")
    public int field2340 = -1;

    @ObfuscatedName("id.bm")
    public int field2321 = -1;

    @ObfuscatedName("id.ba")
    public int field2309 = -1;

    @ObfuscatedName("id.bv")
    public int field2343 = -1;

    @ObfuscatedName("id.bg")
    public int[] field2344;

    @ObfuscatedName("id.cb")
    public int[] field2345;

    @ObfuscatedName("id.cj")
    public int field2346 = -1;

    @ObfuscatedName("id.cr")
    public int field2336 = -1;

    @ObfuscatedName("id.cy")
    public int field2328 = 128;

    @ObfuscatedName("id.cg")
    public int field2349 = 128;

    @ObfuscatedName("id.cl")
    public int field2350 = 128;

    @ObfuscatedName("id.cw")
    public int field2351 = 0;

    @ObfuscatedName("id.ci")
    public int field2338 = 0;

    @ObfuscatedName("id.ct")
    public int field2353 = 0;

    @ObfuscatedName("id.cm")
    public int field2326 = 0;

    @ObfuscatedName("id.cd")
    public class508 field2354;

    @ObfuscatedName("id.cc")
    public boolean field2356 = false;

    @ObfuscatedName("id.cn")
    public int field2355 = -1;

    @ObfuscatedName("id.ce")
    public int field2358 = -1;

    @ObfuscatedName("id.cp")
    public int field2359 = -1;

    @ObfuscatedName("id.cu")
    public int field2342 = -1;

    @ObfuscatedName("as.az(II)Lid;")
    public static class223 method87(int arg0) {
        class223 var1 = (class223) field2306.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2304.method6328(10, arg0);
        class223 var3 = new class223();
        var3.field2360 = arg0;
        if (var2 != null) {
            var3.method3860(new class535(var2));
        }
        var3.method3804();
        if (var3.field2336 != -1) {
            var3.method3818(method87(var3.field2336), method87(var3.field2346));
        }
        if (var3.field2358 != -1) {
            var3.method3868(method87(var3.field2358), method87(var3.field2355));
        }
        if (var3.field2342 != -1) {
            var3.method3809(method87(var3.field2342), method87(var3.field2359));
        }
        if (!Statics.field1832 && var3.field2337) {
            if (var3.field2336 == -1 && var3.field2358 == -1 && var3.field2342 == -1) {
                var3.field2341 = var3.field2341 + class370.field4020;
            }
            var3.field2335 = class370.field4006;
            var3.field2356 = false;
            for (int var4 = 0; var4 < var3.field2329.length; var4++) {
                var3.field2329[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2330.length; var5++) {
                if (var5 != 4) {
                    var3.field2330[var5] = null;
                }
            }
            var3.field2331 = -2;
            var3.field2353 = 0;
            if (var3.field2354 != null) {
                boolean var6 = false;
                for (class493 var7 = var3.field2354.method8181(); var7 != null; var7 = var3.field2354.method8179()) {
                    class218 var8 = class218.method2822((int) var7.field4951);
                    if (var8.field2215) {
                        var7.method7855();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2354 = null;
                }
            }
        }
        field2306.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.ah(S)V")
    public void method3804() {
        if (this.field2323 == 1) {
            this.field2326 = 0;
        }
    }

    @ObfuscatedName("id.af(Lur;B)V")
    public void method3860(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3806(arg0, var2);
        }
    }

    @ObfuscatedName("id.at(Lur;IB)V")
    public void method3806(class535 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2310 = arg0.method8670();
        } else if (arg1 == 2) {
            this.field2341 = arg0.method8473();
        } else if (arg1 == 3) {
            this.field2335 = arg0.method8473();
        } else if (arg1 == 4) {
            this.field2311 = arg0.method8670();
        } else if (arg1 == 5) {
            this.field2318 = arg0.method8670();
        } else if (arg1 == 6) {
            this.field2319 = arg0.method8670();
        } else if (arg1 == 7) {
            this.field2322 = arg0.method8670();
            if (this.field2322 > 32767) {
                this.field2322 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2302 = arg0.method8670();
            if (this.field2302 > 32767) {
                this.field2302 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8473();
        } else if (arg1 == 11) {
            this.field2323 = 1;
        } else if (arg1 == 12) {
            this.field2324 = arg0.method8682();
        } else if (arg1 == 13) {
            this.field2325 = arg0.method8462();
        } else if (arg1 == 14) {
            this.field2305 = arg0.method8462();
        } else if (arg1 == 16) {
            this.field2337 = true;
        } else if (arg1 == 23) {
            this.field2332 = arg0.method8670();
            this.field2334 = arg0.method8462();
        } else if (arg1 == 24) {
            this.field2333 = arg0.method8670();
        } else if (arg1 == 25) {
            this.field2300 = arg0.method8670();
            this.field2308 = arg0.method8462();
        } else if (arg1 == 26) {
            this.field2347 = arg0.method8670();
        } else if (arg1 == 27) {
            this.field2327 = arg0.method8462();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2329[arg1 - 30] = arg0.method8473();
            if (this.field2329[arg1 - 30].equalsIgnoreCase(class370.field4010)) {
                this.field2329[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2330[arg1 - 35] = arg0.method8473();
        } else if (arg1 == 40) {
            int var3 = arg0.method8462();
            this.field2352 = new short[var3];
            this.field2314 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2352[var4] = (short) arg0.method8670();
                this.field2314[var4] = (short) arg0.method8670();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8462();
            this.field2315 = new short[var5];
            this.field2316 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2315[var6] = (short) arg0.method8670();
                this.field2316[var6] = (short) arg0.method8670();
            }
        } else if (arg1 == 42) {
            this.field2331 = arg0.method8463();
        } else if (arg1 == 65) {
            this.field2356 = true;
        } else if (arg1 == 75) {
            this.field2326 = arg0.method8465();
        } else if (arg1 == 78) {
            this.field2312 = arg0.method8670();
        } else if (arg1 == 79) {
            this.field2339 = arg0.method8670();
        } else if (arg1 == 90) {
            this.field2340 = arg0.method8670();
        } else if (arg1 == 91) {
            this.field2309 = arg0.method8670();
        } else if (arg1 == 92) {
            this.field2321 = arg0.method8670();
        } else if (arg1 == 93) {
            this.field2343 = arg0.method8670();
        } else if (arg1 == 94) {
            arg0.method8670();
        } else if (arg1 == 95) {
            this.field2320 = arg0.method8670();
        } else if (arg1 == 97) {
            this.field2346 = arg0.method8670();
        } else if (arg1 == 98) {
            this.field2336 = arg0.method8670();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2344 == null) {
                this.field2344 = new int[10];
                this.field2345 = new int[10];
            }
            this.field2344[arg1 - 100] = arg0.method8670();
            this.field2345[arg1 - 100] = arg0.method8670();
        } else if (arg1 == 110) {
            this.field2328 = arg0.method8670();
        } else if (arg1 == 111) {
            this.field2349 = arg0.method8670();
        } else if (arg1 == 112) {
            this.field2350 = arg0.method8670();
        } else if (arg1 == 113) {
            this.field2351 = arg0.method8463();
        } else if (arg1 == 114) {
            this.field2338 = arg0.method8463();
        } else if (arg1 == 115) {
            this.field2353 = arg0.method8462();
        } else if (arg1 == 139) {
            this.field2355 = arg0.method8670();
        } else if (arg1 == 140) {
            this.field2358 = arg0.method8670();
        } else if (arg1 == 148) {
            this.field2359 = arg0.method8670();
        } else if (arg1 == 149) {
            this.field2342 = arg0.method8670();
        } else if (arg1 == 249) {
            this.field2354 = class201.method2084(arg0, this.field2354);
        }
    }

    @ObfuscatedName("id.an(Lid;Lid;I)V")
    public void method3818(class223 arg0, class223 arg1) {
        this.field2310 = arg0.field2310;
        this.field2311 = arg0.field2311;
        this.field2318 = arg0.field2318;
        this.field2319 = arg0.field2319;
        this.field2320 = arg0.field2320;
        this.field2322 = arg0.field2322;
        this.field2302 = arg0.field2302;
        this.field2352 = arg0.field2352;
        this.field2314 = arg0.field2314;
        this.field2315 = arg0.field2315;
        this.field2316 = arg0.field2316;
        this.field2341 = arg1.field2341;
        this.field2335 = class370.field4007;
        this.field2337 = arg1.field2337;
        this.field2324 = arg1.field2324;
        this.field2323 = 1;
    }

    @ObfuscatedName("id.ao(Lid;Lid;I)V")
    public void method3868(class223 arg0, class223 arg1) {
        this.field2310 = arg0.field2310;
        this.field2311 = arg0.field2311;
        this.field2318 = arg0.field2318;
        this.field2319 = arg0.field2319;
        this.field2320 = arg0.field2320;
        this.field2322 = arg0.field2322;
        this.field2302 = arg0.field2302;
        this.field2352 = arg1.field2352;
        this.field2314 = arg1.field2314;
        this.field2315 = arg1.field2315;
        this.field2316 = arg1.field2316;
        this.field2341 = arg1.field2341;
        this.field2335 = arg1.field2335;
        this.field2337 = arg1.field2337;
        this.field2323 = arg1.field2323;
        this.field2325 = arg1.field2325;
        this.field2305 = arg1.field2305;
        this.field2327 = arg1.field2327;
        this.field2332 = arg1.field2332;
        this.field2333 = arg1.field2333;
        this.field2312 = arg1.field2312;
        this.field2300 = arg1.field2300;
        this.field2347 = arg1.field2347;
        this.field2339 = arg1.field2339;
        this.field2340 = arg1.field2340;
        this.field2321 = arg1.field2321;
        this.field2309 = arg1.field2309;
        this.field2343 = arg1.field2343;
        this.field2353 = arg1.field2353;
        this.field2329 = arg1.field2329;
        this.field2326 = arg1.field2326;
        this.field2330 = new String[5];
        if (arg1.field2330 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2330[var3] = arg1.field2330[var3];
            }
        }
        this.field2330[4] = class370.field4048;
        this.field2324 = 0;
    }

    @ObfuscatedName("id.ab(Lid;Lid;S)V")
    public void method3809(class223 arg0, class223 arg1) {
        this.field2310 = arg0.field2310;
        this.field2311 = arg0.field2311;
        this.field2318 = arg0.field2318;
        this.field2319 = arg0.field2319;
        this.field2320 = arg0.field2320;
        this.field2322 = arg0.field2322;
        this.field2302 = arg0.field2302;
        this.field2352 = arg0.field2352;
        this.field2314 = arg0.field2314;
        this.field2315 = arg0.field2315;
        this.field2316 = arg0.field2316;
        this.field2323 = arg0.field2323;
        this.field2341 = arg1.field2341;
        this.field2335 = arg1.field2335;
        this.field2324 = 0;
        this.field2337 = false;
        this.field2356 = false;
    }

    @ObfuscatedName("id.aw(IB)Ljj;")
    public final class238 method3810(int arg0) {
        if (this.field2344 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2345[var3] && this.field2345[var3] != 0) {
                    var2 = this.field2344[var3];
                }
            }
            if (var2 != -1) {
                return method87(var2).method3810(1);
            }
        }
        class238 var4 = class238.method4116(Statics.field3089, this.field2310, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2328 != 128 || this.field2349 != 128 || this.field2350 != 128) {
            var4.method4133(this.field2328, this.field2349, this.field2350);
        }
        if (this.field2352 != null) {
            for (int var5 = 0; var5 < this.field2352.length; var5++) {
                var4.method4131(this.field2352[var5], this.field2314[var5]);
            }
        }
        if (this.field2315 != null) {
            for (int var6 = 0; var6 < this.field2315.length; var6++) {
                var4.method4135(this.field2315[var6], this.field2316[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("id.ad(IB)Ljn;")
    public final class256 method3811(int arg0) {
        if (this.field2344 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2345[var3] && this.field2345[var3] != 0) {
                    var2 = this.field2344[var3];
                }
            }
            if (var2 != -1) {
                return method87(var2).method3811(1);
            }
        }
        class256 var4 = (class256) field2307.method5336((long) this.field2360);
        if (var4 != null) {
            return var4;
        }
        class238 var5 = class238.method4116(Statics.field3089, this.field2310, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2328 != 128 || this.field2349 != 128 || this.field2350 != 128) {
            var5.method4133(this.field2328, this.field2349, this.field2350);
        }
        if (this.field2352 != null) {
            for (int var6 = 0; var6 < this.field2352.length; var6++) {
                var5.method4131(this.field2352[var6], this.field2314[var6]);
            }
        }
        if (this.field2315 != null) {
            for (int var7 = 0; var7 < this.field2315.length; var7++) {
                var5.method4135(this.field2315[var7], this.field2316[var7]);
            }
        }
        class256 var8 = var5.method4138(this.field2351 + 64, this.field2338 * 5 + 768, -50, -10, -50);
        var8.field2809 = true;
        field2307.method5346(var8, (long) this.field2360);
        return var8;
    }

    @ObfuscatedName("id.al(II)Lid;")
    public class223 method3812(int arg0) {
        if (this.field2344 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2345[var3] && this.field2345[var3] != 0) {
                    var2 = this.field2344[var3];
                }
            }
            if (var2 != -1) {
                return method87(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("hi.as(IIIIIZB)Lvg;")
    public static final class549 method3442(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class549 var8 = (class549) field2313.method5336(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class223 var9 = method87(arg0);
        if (arg1 > 1 && var9.field2344 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2345[var11] && var9.field2345[var11] != 0) {
                    var10 = var9.field2344[var11];
                }
            }
            if (var10 != -1) {
                var9 = method87(var10);
            }
        }
        class256 var12 = var9.method3811(1);
        if (var12 == null) {
            return null;
        }
        class549 var13 = null;
        if (var9.field2336 != -1) {
            var13 = method3442(var9.field2346, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2358 != -1) {
            var13 = method3442(var9.field2355, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2342 != -1) {
            var13 = method3442(var9.field2359, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5302;
        int var15 = Statics.field5303;
        int var16 = Statics.field5310;
        float[] var17 = Statics.field5305;
        int[] var18 = new int[4];
        class545.method8790(var18);
        class549 var19 = new class549(36, 32);
        class243.method4210(var19.field5336, 36, 32, (float[]) null);
        class545.method8788();
        class243.method4214();
        class243.method4217(16, 16);
        class243.field2612.field2886 = false;
        if (var9.field2342 != -1) {
            var13.method8900(0, 0);
        }
        int var20 = var9.field2311;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class243.field2616[var9.field2318] * var20 >> 16;
        int var22 = class243.field2613[var9.field2318] * var20 >> 16;
        var12.method4590();
        var12.method4664(0, var9.field2319, var9.field2320, var9.field2318, var9.field2322, var9.field2302 + var12.field2716 / 2 + var21, var9.field2302 + var22);
        if (var9.field2358 != -1) {
            var13.method8900(0, 0);
        }
        if (arg2 >= 1) {
            var19.method8896(1);
        }
        if (arg2 >= 2) {
            var19.method8896(16777215);
        }
        if (arg3 != 0) {
            var19.method8897(arg3);
        }
        class243.method4210(var19.field5336, 36, 32, (float[]) null);
        if (var9.field2336 != -1) {
            var13.method8900(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2323 == 1) {
            class414 var23 = Statics.field1888;
            String var24;
            if (arg1 < 100000) {
                var24 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var24 = "<col=ffffff>" + arg1 / 1000 + class370.field4187 + "</col>";
            } else {
                var24 = "<col=00ff80>" + arg1 / 1000000 + class370.field4185 + "</col>";
            }
            var23.method7017(var24, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2313.method5346(var19, var6);
        }
        class243.method4210(var14, var15, var16, var17);
        class545.method8842(var18);
        class243.method4214();
        class243.field2612.field2886 = true;
        return var19;
    }

    @ObfuscatedName("id.ag(II)Z")
    public final boolean method3813(int arg0) {
        int var2 = this.field2332;
        int var3 = this.field2333;
        int var4 = this.field2312;
        if (arg0 == 1) {
            var2 = this.field2300;
            var3 = this.field2347;
            var4 = this.field2339;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3089.method6330(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3089.method6330(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3089.method6330(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("id.ai(II)Ljj;")
    public final class238 method3814(int arg0) {
        int var2 = this.field2332;
        int var3 = this.field2333;
        int var4 = this.field2312;
        if (arg0 == 1) {
            var2 = this.field2300;
            var3 = this.field2347;
            var4 = this.field2339;
        }
        if (var2 == -1) {
            return null;
        }
        class238 var5 = class238.method4116(Statics.field3089, var2, 0);
        if (var3 != -1) {
            class238 var6 = class238.method4116(Statics.field3089, var3, 0);
            if (var4 == -1) {
                class238[] var9 = new class238[] { var5, var6 };
                var5 = new class238(var9, 2);
            } else {
                class238 var7 = class238.method4116(Statics.field3089, var4, 0);
                class238[] var8 = new class238[] { var5, var6, var7 };
                var5 = new class238(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2334 != 0) {
            var5.method4130(0, this.field2334, 0);
        }
        if (arg0 == 1 && this.field2308 != 0) {
            var5.method4130(0, this.field2308, 0);
        }
        if (this.field2352 != null) {
            for (int var10 = 0; var10 < this.field2352.length; var10++) {
                var5.method4131(this.field2352[var10], this.field2314[var10]);
            }
        }
        if (this.field2315 != null) {
            for (int var11 = 0; var11 < this.field2315.length; var11++) {
                var5.method4135(this.field2315[var11], this.field2316[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("id.ax(II)Z")
    public final boolean method3815(int arg0) {
        int var2 = this.field2340;
        int var3 = this.field2321;
        if (arg0 == 1) {
            var2 = this.field2309;
            var3 = this.field2343;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3089.method6330(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3089.method6330(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("id.ar(IB)Ljj;")
    public final class238 method3834(int arg0) {
        int var2 = this.field2340;
        int var3 = this.field2321;
        if (arg0 == 1) {
            var2 = this.field2309;
            var3 = this.field2343;
        }
        if (var2 == -1) {
            return null;
        }
        class238 var4 = class238.method4116(Statics.field3089, var2, 0);
        if (var3 != -1) {
            class238 var5 = class238.method4116(Statics.field3089, var3, 0);
            class238[] var6 = new class238[] { var4, var5 };
            var4 = new class238(var6, 2);
        }
        if (this.field2352 != null) {
            for (int var7 = 0; var7 < this.field2352.length; var7++) {
                var4.method4131(this.field2352[var7], this.field2314[var7]);
            }
        }
        if (this.field2315 != null) {
            for (int var8 = 0; var8 < this.field2315.length; var8++) {
                var4.method4135(this.field2315[var8], this.field2316[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("id.aj(III)I")
    public int method3817(int arg0, int arg1) {
        return Statics.method3746(this.field2354, arg0, arg1);
    }

    @ObfuscatedName("id.au(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3819(int arg0, String arg1) {
        return class201.method396(this.field2354, arg0, arg1);
    }

    @ObfuscatedName("id.ay(B)I")
    public int method3847() {
        if (this.field2331 == -1 || this.field2330 == null) {
            return -1;
        } else if (this.field2331 >= 0) {
            return this.field2330[this.field2331] == null ? -1 : this.field2331;
        } else if (class370.field4304.equalsIgnoreCase(this.field2330[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cl.ap(ZI)V")
    public static void method1020(boolean arg0) {
        if (Statics.field1832 != arg0) {
            field2306.method5339();
            field2307.method5339();
            field2313.method5339();
            Statics.field1832 = arg0;
        }
    }

    @ObfuscatedName("id.av(I)Z")
    public boolean method3872() {
        return this.field2314 != null;
    }

    @ObfuscatedName("id.aa(I)Z")
    public boolean method3821() {
        return this.field2316 != null;
    }
}
