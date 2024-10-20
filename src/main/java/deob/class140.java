package deob;

@ObfuscatedName("ev")
public class class140 extends class47 {

    @ObfuscatedName("ev.p")
    public class174 field2370 = new class174(128);

    @ObfuscatedName("ev.j")
    public int field2386 = 256;

    @ObfuscatedName("ev.h")
    public int field2372 = 1000000;

    @ObfuscatedName("ev.v")
    public int[] field2373 = new int[16];

    @ObfuscatedName("ev.k")
    public int[] field2390 = new int[16];

    @ObfuscatedName("ev.g")
    public int[] field2375 = new int[16];

    @ObfuscatedName("ev.n")
    public int[] field2379 = new int[16];

    @ObfuscatedName("ev.c")
    public int[] field2377 = new int[16];

    @ObfuscatedName("ev.o")
    public int[] field2388 = new int[16];

    @ObfuscatedName("ev.u")
    public int[] field2391 = new int[16];

    @ObfuscatedName("ev.z")
    public int[] field2380 = new int[16];

    @ObfuscatedName("ev.e")
    public int[] field2381 = new int[16];

    @ObfuscatedName("ev.f")
    public int[] field2382 = new int[16];

    @ObfuscatedName("ev.a")
    public int[] field2383 = new int[16];

    @ObfuscatedName("ev.x")
    public int[] field2384 = new int[16];

    @ObfuscatedName("ev.r")
    public int[] field2385 = new int[16];

    @ObfuscatedName("ev.t")
    public int[] field2371 = new int[16];

    @ObfuscatedName("ev.b")
    public int[] field2387 = new int[16];

    @ObfuscatedName("ev.q")
    public class144[][] field2376 = new class144[16][128];

    @ObfuscatedName("ev.ae")
    public class144[][] field2374 = new class144[16][128];

    @ObfuscatedName("ev.at")
    public class143 field2378 = new class143();

    @ObfuscatedName("ev.aj")
    public boolean field2389;

    @ObfuscatedName("ev.aq")
    public int field2392;

    @ObfuscatedName("ev.ac")
    public int field2393;

    @ObfuscatedName("ev.az")
    public long field2394;

    @ObfuscatedName("ev.ao")
    public long field2395;

    @ObfuscatedName("ev.am")
    public class142 field2396 = new class142(this);

    public class140() {
        this.method2682();
    }

    @ObfuscatedName("ev.p(IB)V")
    public synchronized void method2761(int arg0) {
        this.field2386 = arg0;
    }

    @ObfuscatedName("ev.j(B)I")
    public int method2758() {
        return this.field2386;
    }

    @ObfuscatedName("ev.h(Leq;Ler;Lba;IB)Z")
    public synchronized boolean method2665(class138 arg0, class151 arg1, class57 arg2, int arg3) {
        arg0.method2645();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2360.method3277(); var7 != null; var7 = (class175) arg0.field2360.method3265()) {
            int var8 = (int) var7.field2809;
            class139 var9 = (class139) this.field2370.method3261((long) var8);
            if (var9 == null) {
                var9 = class139.method1992(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2370.method3262(var9, (long) var8);
            }
            if (!var9.method2651(arg2, var7.field2804, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2644();
        }
        return var5;
    }

    @ObfuscatedName("ev.v(B)V")
    public synchronized void method2666() {
        for (class139 var1 = (class139) this.field2370.method3277(); var1 != null; var1 = (class139) this.field2370.method3265()) {
            var1.method2652();
        }
    }

    @ObfuscatedName("ev.k(B)V")
    public synchronized void method2667() {
        for (class139 var1 = (class139) this.field2370.method3277(); var1 != null; var1 = (class139) this.field2370.method3265()) {
            var1.method3327();
        }
    }

    @ObfuscatedName("ev.g(Leq;ZB)V")
    public synchronized void method2672(class138 arg0, boolean arg1) {
        this.method2752();
        this.field2378.method2784(arg0.field2361);
        this.field2389 = arg1;
        this.field2394 = 0L;
        int var3 = this.field2378.method2787();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2378.method2788(var4);
            this.field2378.method2791(var4);
            this.field2378.method2789(var4);
        }
        this.field2392 = this.field2378.method2795();
        this.field2393 = this.field2378.field2414[this.field2392];
        this.field2395 = this.field2378.method2792(this.field2393);
    }

    @ObfuscatedName("ev.n(I)V")
    public synchronized void method2752() {
        this.field2378.method2822();
        this.method2682();
    }

    @ObfuscatedName("ev.c(I)Z")
    public synchronized boolean method2681() {
        return this.field2378.method2786();
    }

    @ObfuscatedName("ev.o(III)V")
    public synchronized void method2671(int arg0, int arg1) {
        this.method2692(arg0, arg1);
    }

    @ObfuscatedName("ev.u(III)V")
    public void method2692(int arg0, int arg1) {
        this.field2379[arg0] = arg1;
        this.field2388[arg0] = arg1 & 0xFFFFFF80;
        this.method2673(arg0, arg1);
    }

    @ObfuscatedName("ev.z(III)V")
    public void method2673(int arg0, int arg1) {
        if (this.field2377[arg0] != arg1) {
            this.field2377[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2374[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ev.e(IIII)V")
    public void method2674(int arg0, int arg1, int arg2) {
        this.method2676(arg0, arg1, 64);
        if ((this.field2382[arg0] & 0x2) != 0) {
            for (class144 var4 = (class144) this.field2396.field2406.method3286(); var4 != null; var4 = (class144) this.field2396.field2406.method3309()) {
                if (var4.field2441 == arg0 && var4.field2438 < 0) {
                    this.field2376[arg0][var4.field2443] = null;
                    this.field2376[arg0][arg1] = var4;
                    int var5 = (var4.field2434 * var4.field2433 >> 12) + var4.field2432;
                    var4.field2432 += arg1 - var4.field2443 << 8;
                    var4.field2433 = var5 - var4.field2432;
                    var4.field2434 = 4096;
                    var4.field2443 = arg1;
                    return;
                }
            }
        }
        class139 var6 = (class139) this.field2370.method3261((long) this.field2377[arg0]);
        if (var6 == null) {
            return;
        }
        class62 var7 = var6.field2363[arg1];
        if (var7 == null) {
            return;
        }
        class144 var8 = new class144();
        var8.field2441 = arg0;
        var8.field2439 = var6;
        var8.field2426 = var7;
        var8.field2427 = var6.field2367[arg1];
        var8.field2428 = var6.field2364[arg1];
        var8.field2443 = arg1;
        var8.field2424 = var6.field2365 * arg2 * arg2 * var6.field2368[arg1] + 1024 >> 11;
        var8.field2431 = var6.field2366[arg1] & 0xFF;
        var8.field2432 = (arg1 << 8) - (var6.field2362[arg1] & 0x7FFF);
        var8.field2429 = 0;
        var8.field2436 = 0;
        var8.field2437 = 0;
        var8.field2438 = -1;
        var8.field2435 = 0;
        if (this.field2385[arg0] == 0) {
            var8.field2442 = class44.method916(var7, this.method2749(var8), this.method2687(var8), this.method2688(var8));
        } else {
            var8.field2442 = class44.method916(var7, this.method2749(var8), 0, this.method2688(var8));
            this.method2698(var8, var6.field2362[arg1] < 0);
        }
        if (var6.field2362[arg1] < 0) {
            var8.field2442.method1009(-1);
        }
        if (var8.field2428 >= 0) {
            class144 var9 = this.field2374[arg0][var8.field2428];
            if (var9 != null && var9.field2438 < 0) {
                this.field2376[arg0][var9.field2443] = null;
                var9.field2438 = 0;
            }
            this.field2374[arg0][var8.field2428] = var8;
        }
        this.field2396.field2406.method3305(var8);
        this.field2376[arg0][arg1] = var8;
    }

    @ObfuscatedName("ev.l(Lex;ZI)V")
    public void method2698(class144 arg0, boolean arg1) {
        int var3 = arg0.field2426.field1230.length;
        int var5;
        if (arg1 && arg0.field2426.field1231) {
            int var4 = var3 + var3 - arg0.field2426.field1228;
            var5 = (int) ((long) this.field2385[arg0.field2441] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2442.method925(true);
            }
        } else {
            var5 = (int) ((long) this.field2385[arg0.field2441] * (long) var3 >> 6);
        }
        arg0.field2442.method947(var5);
    }

    @ObfuscatedName("ev.m(IIII)V")
    public void method2676(int arg0, int arg1, int arg2) {
        class144 var4 = this.field2376[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2376[arg0][arg1] = null;
        if ((this.field2382[arg0] & 0x2) == 0) {
            var4.field2438 = 0;
            return;
        }
        for (class144 var5 = (class144) this.field2396.field2406.method3285(); var5 != null; var5 = (class144) this.field2396.field2406.method3299()) {
            if (var4.field2441 == var5.field2441 && var5.field2438 < 0 && var4 != var5) {
                var4.field2438 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ev.s(IIIB)V")
    public void method2677(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ev.i(III)V")
    public void method2678(int arg0, int arg1) {
    }

    @ObfuscatedName("ev.y(III)V")
    public void method2679(int arg0, int arg1) {
        this.field2391[arg0] = arg1;
    }

    @ObfuscatedName("ev.d(II)V")
    public void method2680(int arg0) {
        for (class144 var2 = (class144) this.field2396.field2406.method3285(); var2 != null; var2 = (class144) this.field2396.field2406.method3299()) {
            if (arg0 < 0 || var2.field2441 == arg0) {
                if (var2.field2442 != null) {
                    var2.field2442.method929(Statics.field1265 / 100);
                    if (var2.field2442.method930()) {
                        this.field2396.field2408.method1062(var2.field2442);
                    }
                    var2.method2842();
                }
                if (var2.field2438 < 0) {
                    this.field2376[var2.field2441][var2.field2443] = null;
                }
                var2.method3327();
            }
        }
    }

    @ObfuscatedName("ev.f(II)V")
    public void method2704(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2704(var2);
            }
            return;
        }
        this.field2373[arg0] = 12800;
        this.field2390[arg0] = 8192;
        this.field2375[arg0] = 16383;
        this.field2391[arg0] = 8192;
        this.field2380[arg0] = 0;
        this.field2381[arg0] = 8192;
        this.method2724(arg0);
        this.method2663(arg0);
        this.field2382[arg0] = 0;
        this.field2383[arg0] = 32767;
        this.field2384[arg0] = 256;
        this.field2385[arg0] = 0;
        this.method2720(arg0, 8192);
    }

    @ObfuscatedName("ev.a(IB)V")
    public void method2683(int arg0) {
        for (class144 var2 = (class144) this.field2396.field2406.method3285(); var2 != null; var2 = (class144) this.field2396.field2406.method3299()) {
            if ((arg0 < 0 || var2.field2441 == arg0) && var2.field2438 < 0) {
                this.field2376[var2.field2441][var2.field2443] = null;
                var2.field2438 = 0;
            }
        }
    }

    @ObfuscatedName("ev.x(B)V")
    public void method2682() {
        this.method2680(-1);
        this.method2704(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2377[var1] = this.field2379[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2388[var2] = this.field2379[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ev.at(IS)V")
    public void method2724(int arg0) {
        if ((this.field2382[arg0] & 0x2) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2396.field2406.method3285(); var2 != null; var2 = (class144) this.field2396.field2406.method3299()) {
            if (var2.field2441 == arg0 && this.field2376[arg0][var2.field2443] == null && var2.field2438 < 0) {
                var2.field2438 = 0;
            }
        }
    }

    @ObfuscatedName("ev.aj(II)V")
    public void method2663(int arg0) {
        if ((this.field2382[arg0] & 0x4) == 0) {
            return;
        }
        for (class144 var2 = (class144) this.field2396.field2406.method3285(); var2 != null; var2 = (class144) this.field2396.field2406.method3299()) {
            if (var2.field2441 == arg0) {
                var2.field2444 = 0;
            }
        }
    }

    @ObfuscatedName("ev.aq(II)V")
    public void method2721(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2676(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2674(var6, var7, var8);
            } else {
                this.method2676(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2677(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2388[var12] = (var14 << 14) + (this.field2388[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2388[var12] = (var14 << 7) + (this.field2388[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2380[var12] = (var14 << 7) + (this.field2380[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2380[var12] = (this.field2380[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2381[var12] = (var14 << 7) + (this.field2381[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2381[var12] = (this.field2381[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2373[var12] = (var14 << 7) + (this.field2373[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2373[var12] = (this.field2373[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2390[var12] = (this.field2390[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2375[var12] = (var14 << 7) + (this.field2375[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2375[var12] = (this.field2375[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2382[var12] |= 0x1;
                } else {
                    this.field2382[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2382[var12] |= 0x2;
                } else {
                    this.method2724(var12);
                    this.field2382[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2383[var12] = (var14 << 7) + (this.field2383[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2383[var12] = (this.field2383[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2383[var12] = (var14 << 7) + (this.field2383[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2383[var12] = (this.field2383[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2680(var12);
            }
            if (var13 == 121) {
                this.method2704(var12);
            }
            if (var13 == 123) {
                this.method2683(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2383[var12];
                if (var15 == 16384) {
                    this.field2384[var12] = (var14 << 7) + (this.field2384[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2383[var12];
                if (var16 == 16384) {
                    this.field2384[var12] = (this.field2384[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2385[var12] = (var14 << 7) + (this.field2385[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2385[var12] = (this.field2385[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2382[var12] |= 0x4;
                } else {
                    this.method2663(var12);
                    this.field2382[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2720(var12, (var14 << 7) + (this.field2371[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2720(var12, (this.field2371[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2673(var17, this.field2388[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2678(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2679(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2682();
            }
        }
    }

    @ObfuscatedName("ev.ac(IIB)V")
    public void method2720(int arg0, int arg1) {
        this.field2371[arg0] = arg1;
        this.field2387[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ev.az(Lex;I)I")
    public int method2749(class144 arg0) {
        int var2 = (arg0.field2434 * arg0.field2433 >> 12) + arg0.field2432;
        int var3 = ((this.field2391[arg0.field2441] - 8192) * this.field2384[arg0.field2441] >> 12) + var2;
        class141 var4 = arg0.field2427;
        if (var4.field2404 > 0 && (var4.field2397 > 0 || this.field2380[arg0.field2441] > 0)) {
            int var5 = var4.field2397 << 2;
            int var6 = var4.field2405 << 1;
            if (arg0.field2440 < var6) {
                var5 = arg0.field2440 * var5 / var6;
            }
            int var7 = (this.field2380[arg0.field2441] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2425 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2426.field1229 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1265 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ev.ao(Lex;I)I")
    public int method2687(class144 arg0) {
        class141 var2 = arg0.field2427;
        int var3 = this.field2373[arg0.field2441] * this.field2375[arg0.field2441] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2424 * var4 + 16384 >> 15;
        int var6 = this.field2386 * var5 + 128 >> 8;
        if (var2.field2399 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2429 * 1.953125E-5D * (double) var2.field2399) + 0.5D);
        }
        if (var2.field2403 != null) {
            int var7 = arg0.field2436;
            int var8 = var2.field2403[arg0.field2437 + 1];
            if (arg0.field2437 < var2.field2403.length - 2) {
                int var9 = (var2.field2403[arg0.field2437] & 0xFF) << 8;
                int var10 = (var2.field2403[arg0.field2437 + 2] & 0xFF) << 8;
                var8 += (var2.field2403[arg0.field2437 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2438 > 0 && var2.field2398 != null) {
            int var11 = arg0.field2438;
            int var12 = var2.field2398[arg0.field2435 + 1];
            if (arg0.field2435 < var2.field2398.length - 2) {
                int var13 = (var2.field2398[arg0.field2435] & 0xFF) << 8;
                int var14 = (var2.field2398[arg0.field2435 + 2] & 0xFF) << 8;
                var12 += (var2.field2398[arg0.field2435 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ev.am(Lex;I)I")
    public int method2688(class144 arg0) {
        int var2 = this.field2390[arg0.field2441];
        return var2 < 8192 ? arg0.field2431 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2431) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ev.r()Lau;")
    public synchronized class47 method934() {
        return this.field2396;
    }

    @ObfuscatedName("ev.t()Lau;")
    public synchronized class47 method935() {
        return null;
    }

    @ObfuscatedName("ev.b()I")
    public synchronized int method936() {
        return 0;
    }

    @ObfuscatedName("ev.q([III)V")
    public synchronized void method972(int[] arg0, int arg1, int arg2) {
        if (this.field2378.method2786()) {
            int var4 = this.field2372 * this.field2378.field2411 / Statics.field1265;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2394;
                if (this.field2395 - var5 >= 0L) {
                    this.field2394 = var5;
                    break;
                }
                int var7 = (int) ((this.field2395 - this.field2394 + (long) var4 - 1L) / (long) var4);
                this.field2394 += (long) var4 * (long) var7;
                this.field2396.method972(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2691();
            } while (this.field2378.method2786());
        }
        this.field2396.method972(arg0, arg1, arg2);
    }

    @ObfuscatedName("ev.ae(I)V")
    public synchronized void method1039(int arg0) {
        if (this.field2378.method2786()) {
            int var2 = this.field2372 * this.field2378.field2411 / Statics.field1265;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2394;
                if (this.field2395 - var3 >= 0L) {
                    this.field2394 = var3;
                    break;
                }
                int var5 = (int) ((this.field2395 - this.field2394 + (long) var2 - 1L) / (long) var2);
                this.field2394 += (long) var2 * (long) var5;
                this.field2396.method1039(var5);
                arg0 -= var5;
                this.method2691();
            } while (this.field2378.method2786());
        }
        this.field2396.method1039(arg0);
    }

    @ObfuscatedName("ev.ad(I)V")
    public void method2691() {
        int var1 = this.field2392;
        int var2 = this.field2393;
        long var3 = this.field2395;
        while (this.field2393 == var2) {
            while (this.field2378.field2414[var1] == var2) {
                this.field2378.method2788(var1);
                int var5 = this.field2378.method2797(var1);
                if (var5 == 1) {
                    this.field2378.method2815();
                    this.field2378.method2789(var1);
                    if (this.field2378.method2796()) {
                        if (!this.field2389 || var2 == 0) {
                            this.method2682();
                            this.field2378.method2822();
                            return;
                        }
                        this.field2378.method2829(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2721(var5);
                }
                this.field2378.method2791(var1);
                this.field2378.method2789(var1);
            }
            var1 = this.field2378.method2795();
            var2 = this.field2378.field2414[var1];
            var3 = this.field2378.method2792(var2);
        }
        this.field2392 = var1;
        this.field2393 = var2;
        this.field2395 = var3;
    }

    @ObfuscatedName("ev.an(Lex;I)Z")
    public boolean method2755(class144 arg0) {
        if (arg0.field2442 != null) {
            return false;
        }
        if (arg0.field2438 >= 0) {
            arg0.method3327();
            if (arg0.field2428 > 0 && this.field2374[arg0.field2441][arg0.field2428] == arg0) {
                this.field2374[arg0.field2441][arg0.field2428] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ev.al(Lex;[IIII)Z")
    public boolean method2693(class144 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2430 = Statics.field1265 / 100;
        if (arg0.field2438 >= 0 && arg0.field2442 == null || arg0.field2442.method932()) {
            arg0.method2842();
            arg0.method3327();
            if (arg0.field2428 > 0 && this.field2374[arg0.field2441][arg0.field2428] == arg0) {
                this.field2374[arg0.field2441][arg0.field2428] = null;
            }
            return true;
        }
        int var5 = arg0.field2434;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2381[arg0.field2441] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2434 = var6;
        }
        arg0.field2442.method1013(this.method2749(arg0));
        class141 var7 = arg0.field2427;
        boolean var8 = false;
        arg0.field2440++;
        arg0.field2425 += var7.field2404;
        double var9 = (double) ((arg0.field2443 - 60 << 8) + (arg0.field2434 * arg0.field2433 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2399 > 0) {
            if (var7.field2402 > 0) {
                arg0.field2429 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2402 * var9) + 0.5D);
            } else {
                arg0.field2429 += 128;
            }
        }
        if (var7.field2403 != null) {
            if (var7.field2400 > 0) {
                arg0.field2436 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2400 * var9) + 0.5D);
            } else {
                arg0.field2436 += 128;
            }
            while (arg0.field2437 < var7.field2403.length - 2 && arg0.field2436 > (var7.field2403[arg0.field2437 + 2] & 0xFF) << 8) {
                arg0.field2437 += 2;
            }
            if (arg0.field2437 == var7.field2403.length - 2 && var7.field2403[arg0.field2437 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2438 >= 0 && var7.field2398 != null && (this.field2382[arg0.field2441] & 0x1) == 0 && (arg0.field2428 < 0 || this.field2374[arg0.field2441][arg0.field2428] != arg0)) {
            if (var7.field2401 > 0) {
                arg0.field2438 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2401 * var9) + 0.5D);
            } else {
                arg0.field2438 += 128;
            }
            while (arg0.field2435 < var7.field2398.length - 2 && arg0.field2438 > (var7.field2398[arg0.field2435 + 2] & 0xFF) << 8) {
                arg0.field2435 += 2;
            }
            if (arg0.field2435 == var7.field2398.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2442.method928(arg0.field2430, this.method2687(arg0), this.method2688(arg0));
            return false;
        }
        arg0.field2442.method929(arg0.field2430);
        if (arg1 == null) {
            arg0.field2442.method1039(arg3);
        } else {
            arg0.field2442.method972(arg1, arg2, arg3);
        }
        if (arg0.field2442.method930()) {
            this.field2396.field2408.method1062(arg0.field2442);
        }
        arg0.method2842();
        if (arg0.field2438 >= 0) {
            arg0.method3327();
            if (arg0.field2428 > 0 && this.field2374[arg0.field2441][arg0.field2428] == arg0) {
                this.field2374[arg0.field2441][arg0.field2428] = null;
            }
        }
        return true;
    }
}
