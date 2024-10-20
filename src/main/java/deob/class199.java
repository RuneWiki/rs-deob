package deob;

@ObfuscatedName("gb")
public class class199 extends class116 {

    @ObfuscatedName("gb.z")
    public class318 field2397 = new class318(128);

    @ObfuscatedName("gb.n")
    public int field2394 = 256;

    @ObfuscatedName("gb.v")
    public int field2395 = 1000000;

    @ObfuscatedName("gb.u")
    public int[] field2410 = new int[16];

    @ObfuscatedName("gb.r")
    public int[] field2406 = new int[16];

    @ObfuscatedName("gb.p")
    public int[] field2408 = new int[16];

    @ObfuscatedName("gb.q")
    public int[] field2399 = new int[16];

    @ObfuscatedName("gb.m")
    public int[] field2396 = new int[16];

    @ObfuscatedName("gb.y")
    public int[] field2401 = new int[16];

    @ObfuscatedName("gb.i")
    public int[] field2400 = new int[16];

    @ObfuscatedName("gb.c")
    public int[] field2403 = new int[16];

    @ObfuscatedName("gb.b")
    public int[] field2404 = new int[16];

    @ObfuscatedName("gb.h")
    public int[] field2405 = new int[16];

    @ObfuscatedName("gb.s")
    public int[] field2393 = new int[16];

    @ObfuscatedName("gb.f")
    public int[] field2419 = new int[16];

    @ObfuscatedName("gb.j")
    public int[] field2409 = new int[16];

    @ObfuscatedName("gb.d")
    public int[] field2407 = new int[16];

    @ObfuscatedName("gb.l")
    public int[] field2402 = new int[16];

    @ObfuscatedName("gb.k")
    public class200[][] field2411 = new class200[16][128];

    @ObfuscatedName("gb.ac")
    public class200[][] field2412 = new class200[16][128];

    @ObfuscatedName("gb.az")
    public class201 field2413 = new class201();

    @ObfuscatedName("gb.aw")
    public boolean field2414;

    @ObfuscatedName("gb.aa")
    public int field2415;

    @ObfuscatedName("gb.ap")
    public int field2416;

    @ObfuscatedName("gb.ar")
    public long field2417;

    @ObfuscatedName("gb.ab")
    public long field2418;

    @ObfuscatedName("gb.ax")
    public class203 field2398 = new class203(this);

    public class199() {
        this.method3354();
    }

    @ObfuscatedName("gb.z(II)V")
    public synchronized void method3409(int arg0) {
        this.field2394 = arg0;
    }

    @ObfuscatedName("gb.n(I)I")
    public int method3394() {
        return this.field2394;
    }

    @ObfuscatedName("gb.v(Lgh;Lhp;Ldq;II)Z")
    public synchronized boolean method3336(class204 arg0, class234 arg1, class109 arg2, int arg3) {
        arg0.method3524();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2473.method5395(); var7 != null; var7 = (class178) arg0.field2473.method5392()) {
            int var8 = (int) var7.field2094;
            class202 var9 = (class202) this.field2397.method5393((long) var8);
            if (var9 == null) {
                var9 = class202.method455(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2397.method5394(var9, (long) var8);
            }
            if (!var9.method3503(arg2, var7.field2089, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3523();
        }
        return var5;
    }

    @ObfuscatedName("gb.u(I)V")
    public synchronized void method3428() {
        for (class202 var1 = (class202) this.field2397.method5395(); var1 != null; var1 = (class202) this.field2397.method5392()) {
            var1.method3514();
        }
    }

    @ObfuscatedName("gb.r(I)V")
    public synchronized void method3340() {
        for (class202 var1 = (class202) this.field2397.method5395(); var1 != null; var1 = (class202) this.field2397.method5392()) {
            var1.method3249();
        }
    }

    @ObfuscatedName("gb.i(Lgh;ZI)V")
    public synchronized void method3402(class204 arg0, boolean arg1) {
        this.method3415();
        this.field2413.method3485(arg0.field2472);
        this.field2414 = arg1;
        this.field2417 = 0L;
        int var3 = this.field2413.method3468();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2413.method3463(var4);
            this.field2413.method3456(var4);
            this.field2413.method3454(var4);
        }
        this.field2415 = this.field2413.method3461();
        this.field2416 = this.field2413.field2447[this.field2415];
        this.field2418 = this.field2413.method3460(this.field2416);
    }

    @ObfuscatedName("gb.b(B)V")
    public synchronized void method3415() {
        this.field2413.method3484();
        this.method3354();
    }

    @ObfuscatedName("gb.o(I)Z")
    public synchronized boolean method3353() {
        return this.field2413.method3450();
    }

    @ObfuscatedName("gb.a(IIB)V")
    public synchronized void method3395(int arg0, int arg1) {
        this.method3396(arg0, arg1);
    }

    @ObfuscatedName("gb.e(IIB)V")
    public void method3396(int arg0, int arg1) {
        this.field2399[arg0] = arg1;
        this.field2401[arg0] = arg1 & 0xFFFFFF80;
        this.method3344(arg0, arg1);
    }

    @ObfuscatedName("gb.x(III)V")
    public void method3344(int arg0, int arg1) {
        if (this.field2396[arg0] != arg1) {
            this.field2396[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2412[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gb.h(IIII)V")
    public void method3388(int arg0, int arg1, int arg2) {
        this.method3347(arg0, arg1, 64);
        if ((this.field2405[arg0] & 0x2) != 0) {
            for (class200 var4 = (class200) this.field2398.field2470.method4439(); var4 != null; var4 = (class200) this.field2398.field2470.method4456()) {
                if (var4.field2421 == arg0 && var4.field2434 < 0) {
                    this.field2411[arg0][var4.field2425] = null;
                    this.field2411[arg0][arg1] = var4;
                    int var5 = (var4.field2442 * var4.field2430 >> 12) + var4.field2428;
                    var4.field2428 += arg1 - var4.field2425 << 8;
                    var4.field2442 = var5 - var4.field2428;
                    var4.field2430 = 4096;
                    var4.field2425 = arg1;
                    return;
                }
            }
        }
        class202 var6 = (class202) this.field2397.method5393((long) this.field2396[arg0]);
        if (var6 == null) {
            return;
        }
        class104 var7 = var6.field2462[arg1];
        if (var7 == null) {
            return;
        }
        class200 var8 = new class200();
        var8.field2421 = arg0;
        var8.field2431 = var6;
        var8.field2422 = var7;
        var8.field2436 = var6.field2463[arg1];
        var8.field2424 = var6.field2461[arg1];
        var8.field2425 = arg1;
        var8.field2426 = var6.field2459 * arg2 * arg2 * var6.field2460[arg1] + 1024 >> 11;
        var8.field2427 = var6.field2457[arg1] & 0xFF;
        var8.field2428 = (arg1 << 8) - (var6.field2458[arg1] & 0x7FFF);
        var8.field2429 = 0;
        var8.field2432 = 0;
        var8.field2433 = 0;
        var8.field2434 = -1;
        var8.field2435 = 0;
        if (this.field2409[arg0] == 0) {
            var8.field2438 = class114.method2318(var7, this.method3359(var8), this.method3360(var8), this.method3400(var8));
        } else {
            var8.field2438 = class114.method2318(var7, this.method3359(var8), 0, this.method3400(var8));
            this.method3346(var8, var6.field2458[arg1] < 0);
        }
        if (var6.field2458[arg1] < 0) {
            var8.field2438.method2292(-1);
        }
        if (var8.field2424 >= 0) {
            class200 var9 = this.field2412[arg0][var8.field2424];
            if (var9 != null && var9.field2434 < 0) {
                this.field2411[arg0][var9.field2425] = null;
                var9.field2434 = 0;
            }
            this.field2412[arg0][var8.field2424] = var8;
        }
        this.field2398.field2470.method4433(var8);
        this.field2411[arg0][arg1] = var8;
    }

    @ObfuscatedName("gb.s(Lgu;ZB)V")
    public void method3346(class200 arg0, boolean arg1) {
        int var3 = arg0.field2422.field1366.length;
        int var5;
        if (arg1 && arg0.field2422.field1370) {
            int var4 = var3 + var3 - arg0.field2422.field1368;
            var5 = (int) ((long) this.field2409[arg0.field2421] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2438.method2299(true);
            }
        } else {
            var5 = (int) ((long) this.field2409[arg0.field2421] * (long) var3 >> 6);
        }
        arg0.field2438.method2344(var5);
    }

    @ObfuscatedName("gb.f(IIII)V")
    public void method3347(int arg0, int arg1, int arg2) {
        class200 var4 = this.field2411[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2411[arg0][arg1] = null;
        if ((this.field2405[arg0] & 0x2) == 0) {
            var4.field2434 = 0;
            return;
        }
        for (class200 var5 = (class200) this.field2398.field2470.method4431(); var5 != null; var5 = (class200) this.field2398.field2470.method4454()) {
            if (var4.field2421 == var5.field2421 && var5.field2434 < 0 && var4 != var5) {
                var4.field2434 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gb.j(IIII)V")
    public void method3348(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gb.d(III)V")
    public void method3435(int arg0, int arg1) {
    }

    @ObfuscatedName("gb.l(III)V")
    public void method3350(int arg0, int arg1) {
        this.field2400[arg0] = arg1;
    }

    @ObfuscatedName("gb.k(II)V")
    public void method3351(int arg0) {
        for (class200 var2 = (class200) this.field2398.field2470.method4431(); var2 != null; var2 = (class200) this.field2398.field2470.method4454()) {
            if (arg0 < 0 || var2.field2421 == arg0) {
                if (var2.field2438 != null) {
                    var2.field2438.method2303(Statics.field1930 / 100);
                    if (var2.field2438.method2307()) {
                        this.field2398.field2468.method2070(var2.field2438);
                    }
                    var2.method3441();
                }
                if (var2.field2434 < 0) {
                    this.field2411[var2.field2421][var2.field2425] = null;
                }
                var2.method3249();
            }
        }
    }

    @ObfuscatedName("gb.ai(IB)V")
    public void method3352(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3352(var2);
            }
            return;
        }
        this.field2410[arg0] = 12800;
        this.field2406[arg0] = 8192;
        this.field2408[arg0] = 16383;
        this.field2400[arg0] = 8192;
        this.field2403[arg0] = 0;
        this.field2404[arg0] = 8192;
        this.method3355(arg0);
        this.method3356(arg0);
        this.field2405[arg0] = 0;
        this.field2393[arg0] = 32767;
        this.field2419[arg0] = 256;
        this.field2409[arg0] = 0;
        this.method3393(arg0, 8192);
    }

    @ObfuscatedName("gb.ak(IB)V")
    public void method3432(int arg0) {
        for (class200 var2 = (class200) this.field2398.field2470.method4431(); var2 != null; var2 = (class200) this.field2398.field2470.method4454()) {
            if ((arg0 < 0 || var2.field2421 == arg0) && var2.field2434 < 0) {
                this.field2411[var2.field2421][var2.field2425] = null;
                var2.field2434 = 0;
            }
        }
    }

    @ObfuscatedName("gb.ae(I)V")
    public void method3354() {
        this.method3351(-1);
        this.method3352(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2396[var1] = this.field2399[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2401[var2] = this.field2399[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gb.av(IB)V")
    public void method3355(int arg0) {
        if ((this.field2405[arg0] & 0x2) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2398.field2470.method4431(); var2 != null; var2 = (class200) this.field2398.field2470.method4454()) {
            if (var2.field2421 == arg0 && this.field2411[arg0][var2.field2425] == null && var2.field2434 < 0) {
                var2.field2434 = 0;
            }
        }
    }

    @ObfuscatedName("gb.ag(II)V")
    public void method3356(int arg0) {
        if ((this.field2405[arg0] & 0x4) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2398.field2470.method4431(); var2 != null; var2 = (class200) this.field2398.field2470.method4454()) {
            if (var2.field2421 == arg0) {
                var2.field2420 = 0;
            }
        }
    }

    @ObfuscatedName("gb.aj(II)V")
    public void method3417(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3347(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3388(var6, var7, var8);
            } else {
                this.method3347(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3348(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2401[var12] = (var14 << 14) + (this.field2401[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2401[var12] = (var14 << 7) + (this.field2401[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2403[var12] = (var14 << 7) + (this.field2403[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2403[var12] = (this.field2403[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2404[var12] = (var14 << 7) + (this.field2404[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2404[var12] = (this.field2404[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2410[var12] = (var14 << 7) + (this.field2410[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2410[var12] = (this.field2410[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2406[var12] = (var14 << 7) + (this.field2406[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2406[var12] = (this.field2406[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2408[var12] = (var14 << 7) + (this.field2408[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2408[var12] = (this.field2408[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2405[var12] |= 0x1;
                } else {
                    this.field2405[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2405[var12] |= 0x2;
                } else {
                    this.method3355(var12);
                    this.field2405[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2393[var12] = (var14 << 7) + (this.field2393[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2393[var12] = (this.field2393[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2393[var12] = (var14 << 7) + (this.field2393[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2393[var12] = (this.field2393[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3351(var12);
            }
            if (var13 == 121) {
                this.method3352(var12);
            }
            if (var13 == 123) {
                this.method3432(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2393[var12];
                if (var15 == 16384) {
                    this.field2419[var12] = (var14 << 7) + (this.field2419[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2393[var12];
                if (var16 == 16384) {
                    this.field2419[var12] = (this.field2419[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2409[var12] = (var14 << 7) + (this.field2409[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2409[var12] = (this.field2409[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2405[var12] |= 0x4;
                } else {
                    this.method3356(var12);
                    this.field2405[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3393(var12, (var14 << 7) + (this.field2407[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3393(var12, (this.field2407[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3344(var17, this.field2401[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3435(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3350(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3354();
            }
        }
    }

    @ObfuscatedName("gb.ay(III)V")
    public void method3393(int arg0, int arg1) {
        this.field2407[arg0] = arg1;
        this.field2402[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gb.au(Lgu;I)I")
    public int method3359(class200 arg0) {
        int var2 = (arg0.field2442 * arg0.field2430 >> 12) + arg0.field2428;
        int var3 = ((this.field2400[arg0.field2421] - 8192) * this.field2419[arg0.field2421] >> 12) + var2;
        class197 var4 = arg0.field2436;
        if (var4.field2381 > 0 && (var4.field2380 > 0 || this.field2403[arg0.field2421] > 0)) {
            int var5 = var4.field2380 << 2;
            int var6 = var4.field2382 << 1;
            if (arg0.field2440 < var6) {
                var5 = arg0.field2440 * var5 / var6;
            }
            int var7 = (this.field2403[arg0.field2421] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2437 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2422.field1367 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1930 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gb.af(Lgu;I)I")
    public int method3360(class200 arg0) {
        class197 var2 = arg0.field2436;
        int var3 = this.field2410[arg0.field2421] * this.field2408[arg0.field2421] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2426 * var4 + 16384 >> 15;
        int var6 = this.field2394 * var5 + 128 >> 8;
        if (var2.field2376 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2429 * 1.953125E-5D * (double) var2.field2376) + 0.5D);
        }
        if (var2.field2377 != null) {
            int var7 = arg0.field2432;
            int var8 = var2.field2377[arg0.field2433 + 1];
            if (arg0.field2433 < var2.field2377.length - 2) {
                int var9 = (var2.field2377[arg0.field2433] & 0xFF) << 8;
                int var10 = (var2.field2377[arg0.field2433 + 2] & 0xFF) << 8;
                var8 += (var2.field2377[arg0.field2433 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2434 > 0 && var2.field2375 != null) {
            int var11 = arg0.field2434;
            int var12 = var2.field2375[arg0.field2435 + 1];
            if (arg0.field2435 < var2.field2375.length - 2) {
                int var13 = (var2.field2375[arg0.field2435] & 0xFF) << 8;
                int var14 = (var2.field2375[arg0.field2435 + 2] & 0xFF) << 8;
                var12 += (var2.field2375[arg0.field2435 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gb.at(Lgu;I)I")
    public int method3400(class200 arg0) {
        int var2 = this.field2406[arg0.field2421];
        return var2 < 8192 ? arg0.field2427 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2427) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gb.p()Ldc;")
    public synchronized class116 method2075() {
        return this.field2398;
    }

    @ObfuscatedName("gb.q()Ldc;")
    public synchronized class116 method2076() {
        return null;
    }

    @ObfuscatedName("gb.m()I")
    public synchronized int method2074() {
        return 0;
    }

    @ObfuscatedName("gb.y([III)V")
    public synchronized void method2078(int[] arg0, int arg1, int arg2) {
        if (this.field2413.method3450()) {
            int var4 = this.field2395 * this.field2413.field2444 / Statics.field1930;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2417;
                if (this.field2418 - var5 >= 0L) {
                    this.field2417 = var5;
                    break;
                }
                int var7 = (int) ((this.field2418 - this.field2417 + (long) var4 - 1L) / (long) var4);
                this.field2417 += (long) var4 * (long) var7;
                this.field2398.method2078(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3390();
            } while (this.field2413.method3450());
        }
        this.field2398.method2078(arg0, arg1, arg2);
    }

    @ObfuscatedName("gb.c(I)V")
    public synchronized void method2101(int arg0) {
        if (this.field2413.method3450()) {
            int var2 = this.field2395 * this.field2413.field2444 / Statics.field1930;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2417;
                if (this.field2418 - var3 >= 0L) {
                    this.field2417 = var3;
                    break;
                }
                int var5 = (int) ((this.field2418 - this.field2417 + (long) var2 - 1L) / (long) var2);
                this.field2417 += (long) var2 * (long) var5;
                this.field2398.method2101(var5);
                arg0 -= var5;
                this.method3390();
            } while (this.field2413.method3450());
        }
        this.field2398.method2101(arg0);
    }

    @ObfuscatedName("gb.bx(I)V")
    public void method3390() {
        int var1 = this.field2415;
        int var2 = this.field2416;
        long var3 = this.field2418;
        while (this.field2416 == var2) {
            while (this.field2413.field2447[var1] == var2) {
                this.field2413.method3463(var1);
                int var5 = this.field2413.method3457(var1);
                if (var5 == 1) {
                    this.field2413.method3452();
                    this.field2413.method3454(var1);
                    if (this.field2413.method3462()) {
                        if (!this.field2414 || var2 == 0) {
                            this.method3354();
                            this.field2413.method3484();
                            return;
                        }
                        this.field2413.method3476(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3417(var5);
                }
                this.field2413.method3456(var1);
                this.field2413.method3454(var1);
            }
            var1 = this.field2413.method3461();
            var2 = this.field2413.field2447[var1];
            var3 = this.field2413.method3460(var2);
        }
        this.field2415 = var1;
        this.field2416 = var2;
        this.field2418 = var3;
    }

    @ObfuscatedName("gb.bh(Lgu;I)Z")
    public boolean method3365(class200 arg0) {
        if (arg0.field2438 != null) {
            return false;
        }
        if (arg0.field2434 >= 0) {
            arg0.method3249();
            if (arg0.field2424 > 0 && this.field2412[arg0.field2421][arg0.field2424] == arg0) {
                this.field2412[arg0.field2421][arg0.field2424] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gb.bd(Lgu;[IIII)Z")
    public boolean method3366(class200 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2439 = Statics.field1930 / 100;
        if (arg0.field2434 >= 0 && arg0.field2438 == null || arg0.field2438.method2306()) {
            arg0.method3441();
            arg0.method3249();
            if (arg0.field2424 > 0 && this.field2412[arg0.field2421][arg0.field2424] == arg0) {
                this.field2412[arg0.field2421][arg0.field2424] = null;
            }
            return true;
        }
        int var5 = arg0.field2430;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2404[arg0.field2421] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2430 = var6;
        }
        arg0.field2438.method2304(this.method3359(arg0));
        class197 var7 = arg0.field2436;
        boolean var8 = false;
        arg0.field2440++;
        arg0.field2437 += var7.field2381;
        double var9 = (double) ((arg0.field2425 - 60 << 8) + (arg0.field2442 * arg0.field2430 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2376 > 0) {
            if (var7.field2379 > 0) {
                arg0.field2429 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2379 * var9) + 0.5D);
            } else {
                arg0.field2429 += 128;
            }
        }
        if (var7.field2377 != null) {
            if (var7.field2374 > 0) {
                arg0.field2432 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2374 * var9) + 0.5D);
            } else {
                arg0.field2432 += 128;
            }
            while (arg0.field2433 < var7.field2377.length - 2 && arg0.field2432 > (var7.field2377[arg0.field2433 + 2] & 0xFF) << 8) {
                arg0.field2433 += 2;
            }
            if (arg0.field2433 == var7.field2377.length - 2 && var7.field2377[arg0.field2433 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2434 >= 0 && var7.field2375 != null && (this.field2405[arg0.field2421] & 0x1) == 0 && (arg0.field2424 < 0 || this.field2412[arg0.field2421][arg0.field2424] != arg0)) {
            if (var7.field2378 > 0) {
                arg0.field2434 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2378 * var9) + 0.5D);
            } else {
                arg0.field2434 += 128;
            }
            while (arg0.field2435 < var7.field2375.length - 2 && arg0.field2434 > (var7.field2375[arg0.field2435 + 2] & 0xFF) << 8) {
                arg0.field2435 += 2;
            }
            if (arg0.field2435 == var7.field2375.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2438.method2302(arg0.field2439, this.method3360(arg0), this.method3400(arg0));
            return false;
        }
        arg0.field2438.method2303(arg0.field2439);
        if (arg1 == null) {
            arg0.field2438.method2101(arg3);
        } else {
            arg0.field2438.method2078(arg1, arg2, arg3);
        }
        if (arg0.field2438.method2307()) {
            this.field2398.field2468.method2070(arg0.field2438);
        }
        arg0.method3441();
        if (arg0.field2434 >= 0) {
            arg0.method3249();
            if (arg0.field2424 > 0 && this.field2412[arg0.field2421][arg0.field2424] == arg0) {
                this.field2412[arg0.field2421][arg0.field2424] = null;
            }
        }
        return true;
    }
}
