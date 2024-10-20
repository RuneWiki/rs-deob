package deob;

@ObfuscatedName("ix")
public class class225 extends class500 {

    @ObfuscatedName("ix.ao")
    public static class312 field2343 = new class312(64);

    @ObfuscatedName("ix.ah")
    public static class312 field2334 = new class312(50);

    @ObfuscatedName("ix.av")
    public static class312 field2329 = new class312(200);

    @ObfuscatedName("ix.ap")
    public int field2336;

    @ObfuscatedName("ix.ae")
    public int field2337;

    @ObfuscatedName("ix.ax")
    public String field2338 = class378.field4097;

    @ObfuscatedName("ix.ay")
    public String field2335 = class378.field4097;

    @ObfuscatedName("ix.au")
    public short[] field2340;

    @ObfuscatedName("ix.as")
    public short[] field2365;

    @ObfuscatedName("ix.aw")
    public short[] field2383;

    @ObfuscatedName("ix.ad")
    public short[] field2359;

    @ObfuscatedName("ix.ai")
    public int field2344 = 2000;

    @ObfuscatedName("ix.an")
    public int field2345 = 0;

    @ObfuscatedName("ix.am")
    public int field2369 = 0;

    @ObfuscatedName("ix.ar")
    public int field2346 = 0;

    @ObfuscatedName("ix.ag")
    public int field2348 = 0;

    @ObfuscatedName("ix.bs")
    public int field2331 = 0;

    @ObfuscatedName("ix.bi")
    public int field2351 = 0;

    @ObfuscatedName("ix.bt")
    public int field2353 = 1;

    @ObfuscatedName("ix.bn")
    public int field2357 = -1;

    @ObfuscatedName("ix.bw")
    public int field2354 = -1;

    @ObfuscatedName("ix.bl")
    public int field2355 = -1;

    @ObfuscatedName("ix.be")
    public boolean field2356 = false;

    @ObfuscatedName("ix.bg")
    public String[] field2358 = new String[] { null, null, class378.field4090, null, null };

    @ObfuscatedName("ix.bu")
    public String[] field2376 = new String[] { null, null, null, null, class378.field4304 };

    @ObfuscatedName("ix.bk")
    public int field2339 = -2;

    @ObfuscatedName("ix.bp")
    public int field2360 = -1;

    @ObfuscatedName("ix.br")
    public int field2361 = -1;

    @ObfuscatedName("ix.bx")
    public int field2349 = 0;

    @ObfuscatedName("ix.bd")
    public int field2363 = -1;

    @ObfuscatedName("ix.bv")
    public int field2364 = -1;

    @ObfuscatedName("ix.bm")
    public int field2384 = 0;

    @ObfuscatedName("ix.bq")
    public int field2366 = -1;

    @ObfuscatedName("ix.bj")
    public int field2373 = -1;

    @ObfuscatedName("ix.bc")
    public int field2367 = -1;

    @ObfuscatedName("ix.bz")
    public int field2370 = -1;

    @ObfuscatedName("ix.ba")
    public int field2352 = -1;

    @ObfuscatedName("ix.bb")
    public int field2371 = -1;

    @ObfuscatedName("ix.by")
    public int[] field2372;

    @ObfuscatedName("ix.cw")
    public int[] field2368;

    @ObfuscatedName("ix.ck")
    public int field2374 = -1;

    @ObfuscatedName("ix.cn")
    public int field2375 = -1;

    @ObfuscatedName("ix.ch")
    public int field2382 = 128;

    @ObfuscatedName("ix.cp")
    public int field2377 = 128;

    @ObfuscatedName("ix.cd")
    public int field2378 = 128;

    @ObfuscatedName("ix.cs")
    public int field2379 = 0;

    @ObfuscatedName("ix.cm")
    public int field2380 = 0;

    @ObfuscatedName("ix.ci")
    public int field2381 = 0;

    @ObfuscatedName("ix.cc")
    public int field2333 = 0;

    @ObfuscatedName("ix.cb")
    public class519 field2347;

    @ObfuscatedName("ix.cr")
    public boolean field2350 = false;

    @ObfuscatedName("ix.co")
    public int field2385 = -1;

    @ObfuscatedName("ix.cf")
    public int field2386 = -1;

    @ObfuscatedName("ix.ce")
    public int field2387 = -1;

    @ObfuscatedName("ix.cz")
    public int field2342 = -1;

    @ObfuscatedName("da.ak(Lor;Lor;ZLqb;B)V")
    public static void method2220(class387 arg0, class387 arg1, boolean arg2, class431 arg3) {
        Statics.field2388 = arg0;
        Statics.field2332 = arg1;
        Statics.field3240 = arg2;
        Statics.field1758 = Statics.field2388.method6591(10);
        Statics.field2228 = arg3;
    }

    @ObfuscatedName("ag.al(IB)Lix;")
    public static class225 method369(int arg0) {
        class225 var1 = (class225) field2343.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2388.method6573(10, arg0);
        class225 var3 = new class225();
        var3.field2336 = arg0;
        if (var2 != null) {
            var3.method3949(new class546(var2));
        }
        var3.method3925();
        if (var3.field2375 != -1) {
            var3.method3928(method369(var3.field2375), method369(var3.field2374));
        }
        if (var3.field2386 != -1) {
            var3.method3929(method369(var3.field2386), method369(var3.field2385));
        }
        if (var3.field2342 != -1) {
            var3.method3945(method369(var3.field2342), method369(var3.field2387));
        }
        if (!Statics.field3240 && var3.field2356) {
            if (var3.field2375 == -1 && var3.field2386 == -1 && var3.field2342 == -1) {
                var3.field2338 = var3.field2338 + class378.field4139;
            }
            var3.field2335 = class378.field4323;
            var3.field2350 = false;
            for (int var4 = 0; var4 < var3.field2358.length; var4++) {
                var3.field2358[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2376.length; var5++) {
                if (var5 != 4) {
                    var3.field2376[var5] = null;
                }
            }
            var3.field2339 = -2;
            var3.field2381 = 0;
            if (var3.field2347 != null) {
                boolean var6 = false;
                for (class504 var7 = var3.field2347.method8509(); var7 != null; var7 = var3.field2347.method8507()) {
                    class220 var8 = class220.method5373((int) var7.field5049);
                    if (var8.field2235) {
                        var7.method8189();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2347 = null;
                }
            }
        }
        field2343.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.aj(I)V")
    public void method3925() {
        if (this.field2351 == 1) {
            this.field2333 = 0;
        }
    }

    @ObfuscatedName("ix.az(Lua;B)V")
    public void method3949(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3927(arg0, var2);
        }
    }

    @ObfuscatedName("ix.af(Lua;IB)V")
    public void method3927(class546 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2337 = arg0.method8798();
        } else if (arg1 == 2) {
            this.field2338 = arg0.method8806();
        } else if (arg1 == 3) {
            this.field2335 = arg0.method8806();
        } else if (arg1 == 4) {
            this.field2344 = arg0.method8798();
        } else if (arg1 == 5) {
            this.field2345 = arg0.method8798();
        } else if (arg1 == 6) {
            this.field2369 = arg0.method8798();
        } else if (arg1 == 7) {
            this.field2348 = arg0.method8798();
            if (this.field2348 > 32767) {
                this.field2348 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2331 = arg0.method8798();
            if (this.field2331 > 32767) {
                this.field2331 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8806();
        } else if (arg1 == 11) {
            this.field2351 = 1;
        } else if (arg1 == 12) {
            this.field2353 = arg0.method8801();
        } else if (arg1 == 13) {
            this.field2357 = arg0.method8796();
        } else if (arg1 == 14) {
            this.field2354 = arg0.method8796();
        } else if (arg1 == 16) {
            this.field2356 = true;
        } else if (arg1 == 23) {
            this.field2360 = arg0.method8798();
            this.field2349 = arg0.method8796();
        } else if (arg1 == 24) {
            this.field2361 = arg0.method8798();
        } else if (arg1 == 25) {
            this.field2363 = arg0.method8798();
            this.field2384 = arg0.method8796();
        } else if (arg1 == 26) {
            this.field2364 = arg0.method8798();
        } else if (arg1 == 27) {
            this.field2355 = arg0.method8796();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2358[arg1 - 30] = arg0.method8806();
            if (this.field2358[arg1 - 30].equalsIgnoreCase(class378.field4092)) {
                this.field2358[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2376[arg1 - 35] = arg0.method8806();
        } else if (arg1 == 40) {
            int var3 = arg0.method8796();
            this.field2340 = new short[var3];
            this.field2365 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2340[var4] = (short) arg0.method8798();
                this.field2365[var4] = (short) arg0.method8798();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8796();
            this.field2383 = new short[var5];
            this.field2359 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2383[var6] = (short) arg0.method8798();
                this.field2359[var6] = (short) arg0.method8798();
            }
        } else if (arg1 == 42) {
            this.field2339 = arg0.method8797();
        } else if (arg1 == 65) {
            this.field2350 = true;
        } else if (arg1 == 75) {
            this.field2333 = arg0.method8926();
        } else if (arg1 == 78) {
            this.field2366 = arg0.method8798();
        } else if (arg1 == 79) {
            this.field2373 = arg0.method8798();
        } else if (arg1 == 90) {
            this.field2367 = arg0.method8798();
        } else if (arg1 == 91) {
            this.field2352 = arg0.method8798();
        } else if (arg1 == 92) {
            this.field2370 = arg0.method8798();
        } else if (arg1 == 93) {
            this.field2371 = arg0.method8798();
        } else if (arg1 == 94) {
            arg0.method8798();
        } else if (arg1 == 95) {
            this.field2346 = arg0.method8798();
        } else if (arg1 == 97) {
            this.field2374 = arg0.method8798();
        } else if (arg1 == 98) {
            this.field2375 = arg0.method8798();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2372 == null) {
                this.field2372 = new int[10];
                this.field2368 = new int[10];
            }
            this.field2372[arg1 - 100] = arg0.method8798();
            this.field2368[arg1 - 100] = arg0.method8798();
        } else if (arg1 == 110) {
            this.field2382 = arg0.method8798();
        } else if (arg1 == 111) {
            this.field2377 = arg0.method8798();
        } else if (arg1 == 112) {
            this.field2378 = arg0.method8798();
        } else if (arg1 == 113) {
            this.field2379 = arg0.method8797();
        } else if (arg1 == 114) {
            this.field2380 = arg0.method8797() * 5;
        } else if (arg1 == 115) {
            this.field2381 = arg0.method8796();
        } else if (arg1 == 139) {
            this.field2385 = arg0.method8798();
        } else if (arg1 == 140) {
            this.field2386 = arg0.method8798();
        } else if (arg1 == 148) {
            this.field2387 = arg0.method8798();
        } else if (arg1 == 149) {
            this.field2342 = arg0.method8798();
        } else if (arg1 == 249) {
            this.field2347 = class203.method2113(arg0, this.field2347);
        }
    }

    @ObfuscatedName("ix.aa(Lix;Lix;I)V")
    public void method3928(class225 arg0, class225 arg1) {
        this.field2337 = arg0.field2337;
        this.field2344 = arg0.field2344;
        this.field2345 = arg0.field2345;
        this.field2369 = arg0.field2369;
        this.field2346 = arg0.field2346;
        this.field2348 = arg0.field2348;
        this.field2331 = arg0.field2331;
        this.field2340 = arg0.field2340;
        this.field2365 = arg0.field2365;
        this.field2383 = arg0.field2383;
        this.field2359 = arg0.field2359;
        this.field2338 = arg1.field2338;
        this.field2335 = class378.field4165;
        this.field2356 = arg1.field2356;
        this.field2353 = arg1.field2353;
        this.field2351 = 1;
    }

    @ObfuscatedName("ix.at(Lix;Lix;I)V")
    public void method3929(class225 arg0, class225 arg1) {
        this.field2337 = arg0.field2337;
        this.field2344 = arg0.field2344;
        this.field2345 = arg0.field2345;
        this.field2369 = arg0.field2369;
        this.field2346 = arg0.field2346;
        this.field2348 = arg0.field2348;
        this.field2331 = arg0.field2331;
        this.field2340 = arg1.field2340;
        this.field2365 = arg1.field2365;
        this.field2383 = arg1.field2383;
        this.field2359 = arg1.field2359;
        this.field2338 = arg1.field2338;
        this.field2335 = arg1.field2335;
        this.field2356 = arg1.field2356;
        this.field2351 = arg1.field2351;
        this.field2357 = arg1.field2357;
        this.field2354 = arg1.field2354;
        this.field2355 = arg1.field2355;
        this.field2360 = arg1.field2360;
        this.field2361 = arg1.field2361;
        this.field2366 = arg1.field2366;
        this.field2363 = arg1.field2363;
        this.field2364 = arg1.field2364;
        this.field2373 = arg1.field2373;
        this.field2367 = arg1.field2367;
        this.field2370 = arg1.field2370;
        this.field2352 = arg1.field2352;
        this.field2371 = arg1.field2371;
        this.field2381 = arg1.field2381;
        this.field2358 = arg1.field2358;
        this.field2333 = arg1.field2333;
        this.field2376 = new String[5];
        if (arg1.field2376 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2376[var3] = arg1.field2376[var3];
            }
        }
        this.field2376[4] = class378.field4164;
        this.field2353 = 0;
    }

    @ObfuscatedName("ix.ab(Lix;Lix;I)V")
    public void method3945(class225 arg0, class225 arg1) {
        this.field2337 = arg0.field2337;
        this.field2344 = arg0.field2344;
        this.field2345 = arg0.field2345;
        this.field2369 = arg0.field2369;
        this.field2346 = arg0.field2346;
        this.field2348 = arg0.field2348;
        this.field2331 = arg0.field2331;
        this.field2340 = arg0.field2340;
        this.field2365 = arg0.field2365;
        this.field2383 = arg0.field2383;
        this.field2359 = arg0.field2359;
        this.field2351 = arg0.field2351;
        this.field2338 = arg1.field2338;
        this.field2335 = arg1.field2335;
        this.field2353 = 0;
        this.field2356 = false;
        this.field2350 = false;
    }

    @ObfuscatedName("ix.ac(II)Ljb;")
    public final class243 method3931(int arg0) {
        if (this.field2372 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2368[var3] && this.field2368[var3] != 0) {
                    var2 = this.field2372[var3];
                }
            }
            if (var2 != -1) {
                return method369(var2).method3931(1);
            }
        }
        class243 var4 = class243.method4274(Statics.field2332, this.field2337, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2382 != 128 || this.field2377 != 128 || this.field2378 != 128) {
            var4.method4256(this.field2382, this.field2377, this.field2378);
        }
        if (this.field2340 != null) {
            for (int var5 = 0; var5 < this.field2340.length; var5++) {
                var4.method4253(this.field2340[var5], this.field2365[var5]);
            }
        }
        if (this.field2383 != null) {
            for (int var6 = 0; var6 < this.field2383.length; var6++) {
                var4.method4280(this.field2383[var6], this.field2359[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.ao(II)Lkb;")
    public final class264 method3932(int arg0) {
        if (this.field2372 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2368[var3] && this.field2368[var3] != 0) {
                    var2 = this.field2372[var3];
                }
            }
            if (var2 != -1) {
                return method369(var2).method3932(1);
            }
        }
        class264 var4 = (class264) field2334.method5570((long) this.field2336);
        if (var4 != null) {
            return var4;
        }
        class243 var5 = class243.method4274(Statics.field2332, this.field2337, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2382 != 128 || this.field2377 != 128 || this.field2378 != 128) {
            var5.method4256(this.field2382, this.field2377, this.field2378);
        }
        if (this.field2340 != null) {
            for (int var6 = 0; var6 < this.field2340.length; var6++) {
                var5.method4253(this.field2340[var6], this.field2365[var6]);
            }
        }
        if (this.field2383 != null) {
            for (int var7 = 0; var7 < this.field2383.length; var7++) {
                var5.method4280(this.field2383[var7], this.field2359[var7]);
            }
        }
        class264 var8 = var5.method4252(this.field2379 + 64, this.field2380 + 768, -50, -10, -50);
        var8.field2898 = true;
        field2334.method5564(var8, (long) this.field2336);
        return var8;
    }

    @ObfuscatedName("ix.ah(IB)Lix;")
    public class225 method3933(int arg0) {
        if (this.field2372 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2368[var3] && this.field2368[var3] != 0) {
                    var2 = this.field2372[var3];
                }
            }
            if (var2 != -1) {
                return method369(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ge.av(IIIIIZB)Lvc;")
    public static final class560 method3302(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class560 var8 = (class560) field2329.method5570(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class225 var9 = method369(arg0);
        if (arg1 > 1 && var9.field2372 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2368[var11] && var9.field2368[var11] != 0) {
                    var10 = var9.field2372[var11];
                }
            }
            if (var10 != -1) {
                var9 = method369(var10);
            }
        }
        class264 var12 = var9.method3932(1);
        if (var12 == null) {
            return null;
        }
        class560 var13 = null;
        if (var9.field2375 != -1) {
            var13 = method3302(var9.field2374, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2386 != -1) {
            var13 = method3302(var9.field2385, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2342 != -1) {
            var13 = method3302(var9.field2387, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5413;
        int var15 = Statics.field5418;
        int var16 = Statics.field5415;
        float[] var17 = Statics.field5416;
        int[] var18 = new int[4];
        class556.method9155(var18);
        class560 var19 = new class560(36, 32);
        class248.method4341(var19.field5445, 36, 32, (float[]) null);
        class556.method9120();
        class248.method4398();
        class248.method4345(16, 16);
        class248.field2670.field2979 = false;
        if (var9.field2342 != -1) {
            var13.method9319(0, 0);
        }
        int var20 = var9.field2344;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class248.field2665[var9.field2345] * var20 >> 16;
        int var22 = class248.field2669[var9.field2345] * var20 >> 16;
        var12.method4806();
        var12.method4914(0, var9.field2369, var9.field2346, var9.field2345, var9.field2348, var9.field2331 + var12.field2801 / 2 + var21, var9.field2331 + var22);
        if (var9.field2386 != -1) {
            var13.method9319(0, 0);
        }
        if (arg2 >= 1) {
            var19.method9216(1);
        }
        if (arg2 >= 2) {
            var19.method9216(16777215);
        }
        if (arg3 != 0) {
            var19.method9224(arg3);
        }
        class248.method4341(var19.field5445, 36, 32, (float[]) null);
        if (var9.field2375 != -1) {
            var13.method9319(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2351 == 1) {
            Statics.field2228.method7488(method2382(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2329.method5564(var19, var6);
        }
        class248.method4341(var14, var15, var16, var17);
        class556.method9107(var18);
        class248.method4398();
        class248.field2670.field2979 = true;
        return var19;
    }

    @ObfuscatedName("di.aq(II)Ljava/lang/String;")
    public static final String method2382(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class378.field4147 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class378.field4267 + "</col>";
        }
    }

    @ObfuscatedName("ix.ap(II)Z")
    public final boolean method3953(int arg0) {
        int var2 = this.field2360;
        int var3 = this.field2361;
        int var4 = this.field2366;
        if (arg0 == 1) {
            var2 = this.field2363;
            var3 = this.field2364;
            var4 = this.field2373;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2332.method6586(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2332.method6586(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2332.method6586(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ix.ae(IB)Ljb;")
    public final class243 method3990(int arg0) {
        int var2 = this.field2360;
        int var3 = this.field2361;
        int var4 = this.field2366;
        if (arg0 == 1) {
            var2 = this.field2363;
            var3 = this.field2364;
            var4 = this.field2373;
        }
        if (var2 == -1) {
            return null;
        }
        class243 var5 = class243.method4274(Statics.field2332, var2, 0);
        if (var3 != -1) {
            class243 var6 = class243.method4274(Statics.field2332, var3, 0);
            if (var4 == -1) {
                class243[] var9 = new class243[] { var5, var6 };
                var5 = new class243(var9, 2);
            } else {
                class243 var7 = class243.method4274(Statics.field2332, var4, 0);
                class243[] var8 = new class243[] { var5, var6, var7 };
                var5 = new class243(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2349 != 0) {
            var5.method4238(0, this.field2349, 0);
        }
        if (arg0 == 1 && this.field2384 != 0) {
            var5.method4238(0, this.field2384, 0);
        }
        if (this.field2340 != null) {
            for (int var10 = 0; var10 < this.field2340.length; var10++) {
                var5.method4253(this.field2340[var10], this.field2365[var10]);
            }
        }
        if (this.field2383 != null) {
            for (int var11 = 0; var11 < this.field2383.length; var11++) {
                var5.method4280(this.field2383[var11], this.field2359[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ix.ax(II)Z")
    public final boolean method3936(int arg0) {
        int var2 = this.field2367;
        int var3 = this.field2370;
        if (arg0 == 1) {
            var2 = this.field2352;
            var3 = this.field2371;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2332.method6586(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2332.method6586(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ix.ay(II)Ljb;")
    public final class243 method3937(int arg0) {
        int var2 = this.field2367;
        int var3 = this.field2370;
        if (arg0 == 1) {
            var2 = this.field2352;
            var3 = this.field2371;
        }
        if (var2 == -1) {
            return null;
        }
        class243 var4 = class243.method4274(Statics.field2332, var2, 0);
        if (var3 != -1) {
            class243 var5 = class243.method4274(Statics.field2332, var3, 0);
            class243[] var6 = new class243[] { var4, var5 };
            var4 = new class243(var6, 2);
        }
        if (this.field2340 != null) {
            for (int var7 = 0; var7 < this.field2340.length; var7++) {
                var4.method4253(this.field2340[var7], this.field2365[var7]);
            }
        }
        if (this.field2383 != null) {
            for (int var8 = 0; var8 < this.field2383.length; var8++) {
                var4.method4280(this.field2383[var8], this.field2359[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.au(IIB)I")
    public int method3938(int arg0, int arg1) {
        class519 var3 = this.field2347;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class503 var5 = (class503) var3.method8506((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field5047;
            }
        }
        return var4;
    }

    @ObfuscatedName("ix.as(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3939(int arg0, String arg1) {
        return class203.method2600(this.field2347, arg0, arg1);
    }

    @ObfuscatedName("ix.aw(I)I")
    public int method3940() {
        if (this.field2339 == -1 || this.field2376 == null) {
            return -1;
        } else if (this.field2339 >= 0) {
            return this.field2376[this.field2339] == null ? -1 : this.field2339;
        } else if (class378.field4304.equalsIgnoreCase(this.field2376[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("gc.ad(B)V")
    public static void method3118() {
        field2329.method5572();
    }

    @ObfuscatedName("ix.ai(I)Z")
    public boolean method3941() {
        return this.field2365 != null;
    }

    @ObfuscatedName("ix.an(I)Z")
    public boolean method3942() {
        return this.field2359 != null;
    }
}
