package deob;

@ObfuscatedName("gp")
public class class199 extends class116 {

    @ObfuscatedName("gp.s")
    public class318 field2405 = new class318(128);

    @ObfuscatedName("gp.j")
    public int field2391 = 256;

    @ObfuscatedName("gp.i")
    public int field2392 = 1000000;

    @ObfuscatedName("gp.k")
    public int[] field2407 = new int[16];

    @ObfuscatedName("gp.u")
    public int[] field2394 = new int[16];

    @ObfuscatedName("gp.n")
    public int[] field2395 = new int[16];

    @ObfuscatedName("gp.t")
    public int[] field2396 = new int[16];

    @ObfuscatedName("gp.q")
    public int[] field2414 = new int[16];

    @ObfuscatedName("gp.x")
    public int[] field2398 = new int[16];

    @ObfuscatedName("gp.d")
    public int[] field2399 = new int[16];

    @ObfuscatedName("gp.f")
    public int[] field2400 = new int[16];

    @ObfuscatedName("gp.c")
    public int[] field2401 = new int[16];

    @ObfuscatedName("gp.a")
    public int[] field2415 = new int[16];

    @ObfuscatedName("gp.w")
    public int[] field2404 = new int[16];

    @ObfuscatedName("gp.l")
    public int[] field2409 = new int[16];

    @ObfuscatedName("gp.h")
    public int[] field2390 = new int[16];

    @ObfuscatedName("gp.v")
    public int[] field2410 = new int[16];

    @ObfuscatedName("gp.m")
    public int[] field2416 = new int[16];

    @ObfuscatedName("gp.o")
    public class200[][] field2406 = new class200[16][128];

    @ObfuscatedName("gp.av")
    public class200[][] field2403 = new class200[16][128];

    @ObfuscatedName("gp.am")
    public class201 field2411 = new class201();

    @ObfuscatedName("gp.ai")
    public boolean field2412;

    @ObfuscatedName("gp.af")
    public int field2413;

    @ObfuscatedName("gp.az")
    public int field2393;

    @ObfuscatedName("gp.aj")
    public long field2397;

    @ObfuscatedName("gp.an")
    public long field2408;

    @ObfuscatedName("gp.at")
    public class203 field2417 = new class203(this);

    public class199() {
        this.method3484();
    }

    @ObfuscatedName("gp.s(II)V")
    public synchronized void method3421(int arg0) {
        this.field2391 = arg0;
    }

    @ObfuscatedName("gp.j(I)I")
    public int method3399() {
        return this.field2391;
    }

    @ObfuscatedName("gp.i(Lgy;Lhz;Ldh;II)Z")
    public synchronized boolean method3400(class204 arg0, class234 arg1, class109 arg2, int arg3) {
        arg0.method3574();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2471.method5432(); var7 != null; var7 = (class178) arg0.field2471.method5433()) {
            int var8 = (int) var7.field2096;
            class202 var9 = (class202) this.field2405.method5434((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3831(var8);
                class202 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class202(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2405.method5429(var11, (long) var8);
            }
            if (!var9.method3561(arg2, var7.field2091, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3573();
        }
        return var5;
    }

    @ObfuscatedName("gp.k(I)V")
    public synchronized void method3465() {
        for (class202 var1 = (class202) this.field2405.method5432(); var1 != null; var1 = (class202) this.field2405.method5433()) {
            var1.method3566();
        }
    }

    @ObfuscatedName("gp.u(B)V")
    public synchronized void method3402() {
        for (class202 var1 = (class202) this.field2405.method5432(); var1 != null; var1 = (class202) this.field2405.method5433()) {
            var1.method3304();
        }
    }

    @ObfuscatedName("gp.d(Lgy;ZB)V")
    public synchronized void method3403(class204 arg0, boolean arg1) {
        this.method3404();
        this.field2411.method3511(arg0.field2472);
        this.field2412 = arg1;
        this.field2397 = 0L;
        int var3 = this.field2411.method3509();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2411.method3515(var4);
            this.field2411.method3543(var4);
            this.field2411.method3553(var4);
        }
        this.field2413 = this.field2411.method3523();
        this.field2393 = this.field2411.field2446[this.field2413];
        this.field2408 = this.field2411.method3522(this.field2393);
    }

    @ObfuscatedName("gp.c(B)V")
    public synchronized void method3404() {
        this.field2411.method3512();
        this.method3484();
    }

    @ObfuscatedName("gp.r(I)Z")
    public synchronized boolean method3405() {
        return this.field2411.method3513();
    }

    @ObfuscatedName("gp.y(III)V")
    public synchronized void method3406(int arg0, int arg1) {
        this.method3477(arg0, arg1);
    }

    @ObfuscatedName("gp.p(IIB)V")
    public void method3477(int arg0, int arg1) {
        this.field2396[arg0] = arg1;
        this.field2398[arg0] = arg1 & 0xFFFFFF80;
        this.method3408(arg0, arg1);
    }

    @ObfuscatedName("gp.g(III)V")
    public void method3408(int arg0, int arg1) {
        if (this.field2414[arg0] != arg1) {
            this.field2414[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2403[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gp.e(IIII)V")
    public void method3409(int arg0, int arg1, int arg2) {
        this.method3488(arg0, arg1, 64);
        if ((this.field2415[arg0] & 0x2) != 0) {
            for (class200 var4 = (class200) this.field2417.field2465.method4481(); var4 != null; var4 = (class200) this.field2417.field2465.method4483()) {
                if (var4.field2438 == arg0 && var4.field2434 < 0) {
                    this.field2406[arg0][var4.field2425] = null;
                    this.field2406[arg0][arg1] = var4;
                    int var5 = (var4.field2441 * var4.field2429 >> 12) + var4.field2427;
                    var4.field2427 += arg1 - var4.field2425 << 8;
                    var4.field2429 = var5 - var4.field2427;
                    var4.field2441 = 4096;
                    var4.field2425 = arg1;
                    return;
                }
            }
        }
        class202 var6 = (class202) this.field2405.method5434((long) this.field2414[arg0]);
        if (var6 == null) {
            return;
        }
        class104 var7 = var6.field2457[arg1];
        if (var7 == null) {
            return;
        }
        class200 var8 = new class200();
        var8.field2438 = arg0;
        var8.field2421 = var6;
        var8.field2422 = var7;
        var8.field2423 = var6.field2461[arg1];
        var8.field2424 = var6.field2462[arg1];
        var8.field2425 = arg1;
        var8.field2426 = var6.field2460 * arg2 * arg2 * var6.field2463[arg1] + 1024 >> 11;
        var8.field2430 = var6.field2464[arg1] & 0xFF;
        var8.field2427 = (arg1 << 8) - (var6.field2458[arg1] & 0x7FFF);
        var8.field2431 = 0;
        var8.field2432 = 0;
        var8.field2433 = 0;
        var8.field2434 = -1;
        var8.field2435 = 0;
        if (this.field2390[arg0] == 0) {
            var8.field2428 = class114.method2310(var7, this.method3411(var8), this.method3442(var8), this.method3424(var8));
        } else {
            var8.field2428 = class114.method2310(var7, this.method3411(var8), 0, this.method3424(var8));
            this.method3469(var8, var6.field2458[arg1] < 0);
        }
        if (var6.field2458[arg1] < 0) {
            var8.field2428.method2312(-1);
        }
        if (var8.field2424 >= 0) {
            class200 var9 = this.field2403[arg0][var8.field2424];
            if (var9 != null && var9.field2434 < 0) {
                this.field2406[arg0][var9.field2425] = null;
                var9.field2434 = 0;
            }
            this.field2403[arg0][var8.field2424] = var8;
        }
        this.field2417.field2465.method4475(var8);
        this.field2406[arg0][arg1] = var8;
    }

    @ObfuscatedName("gp.z(Lgd;ZI)V")
    public void method3469(class200 arg0, boolean arg1) {
        int var3 = arg0.field2422.field1364.length;
        int var5;
        if (arg1 && arg0.field2422.field1363) {
            int var4 = var3 + var3 - arg0.field2422.field1365;
            var5 = (int) ((long) this.field2390[arg0.field2438] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2428.method2318(true);
            }
        } else {
            var5 = (int) ((long) this.field2390[arg0.field2438] * (long) var3 >> 6);
        }
        arg0.field2428.method2317(var5);
    }

    @ObfuscatedName("gp.w(IIIB)V")
    public void method3488(int arg0, int arg1, int arg2) {
        class200 var4 = this.field2406[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2406[arg0][arg1] = null;
        if ((this.field2415[arg0] & 0x2) == 0) {
            var4.field2434 = 0;
            return;
        }
        for (class200 var5 = (class200) this.field2417.field2465.method4480(); var5 != null; var5 = (class200) this.field2417.field2465.method4491()) {
            if (var4.field2438 == var5.field2438 && var5.field2434 < 0 && var4 != var5) {
                var4.field2434 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gp.l(IIII)V")
    public void method3412(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gp.az(III)V")
    public void method3413(int arg0, int arg1) {
    }

    @ObfuscatedName("gp.at(III)V")
    public void method3414(int arg0, int arg1) {
        this.field2399[arg0] = arg1;
    }

    @ObfuscatedName("gp.as(II)V")
    public void method3474(int arg0) {
        for (class200 var2 = (class200) this.field2417.field2465.method4480(); var2 != null; var2 = (class200) this.field2417.field2465.method4491()) {
            if (arg0 < 0 || var2.field2438 == arg0) {
                if (var2.field2428 != null) {
                    var2.field2428.method2322(Statics.field1384 / 100);
                    if (var2.field2428.method2307()) {
                        this.field2417.field2469.method2103(var2.field2428);
                    }
                    var2.method3503();
                }
                if (var2.field2434 < 0) {
                    this.field2406[var2.field2438][var2.field2425] = null;
                }
                var2.method3304();
            }
        }
    }

    @ObfuscatedName("gp.ao(II)V")
    public void method3475(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3475(var2);
            }
            return;
        }
        this.field2407[arg0] = 12800;
        this.field2394[arg0] = 8192;
        this.field2395[arg0] = 16383;
        this.field2399[arg0] = 8192;
        this.field2400[arg0] = 0;
        this.field2401[arg0] = 8192;
        this.method3410(arg0);
        this.method3501(arg0);
        this.field2415[arg0] = 0;
        this.field2404[arg0] = 32767;
        this.field2409[arg0] = 256;
        this.field2390[arg0] = 0;
        this.method3422(arg0, 8192);
    }

    @ObfuscatedName("gp.ac(II)V")
    public void method3428(int arg0) {
        for (class200 var2 = (class200) this.field2417.field2465.method4480(); var2 != null; var2 = (class200) this.field2417.field2465.method4491()) {
            if ((arg0 < 0 || var2.field2438 == arg0) && var2.field2434 < 0) {
                this.field2406[var2.field2438][var2.field2425] = null;
                var2.field2434 = 0;
            }
        }
    }

    @ObfuscatedName("gp.ar(I)V")
    public void method3484() {
        this.method3474(-1);
        this.method3475(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2414[var1] = this.field2396[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2398[var2] = this.field2396[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gp.au(II)V")
    public void method3410(int arg0) {
        if ((this.field2415[arg0] & 0x2) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2417.field2465.method4480(); var2 != null; var2 = (class200) this.field2417.field2465.method4491()) {
            if (var2.field2438 == arg0 && this.field2406[arg0][var2.field2425] == null && var2.field2434 < 0) {
                var2.field2434 = 0;
            }
        }
    }

    @ObfuscatedName("gp.ax(II)V")
    public void method3501(int arg0) {
        if ((this.field2415[arg0] & 0x4) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2417.field2465.method4480(); var2 != null; var2 = (class200) this.field2417.field2465.method4491()) {
            if (var2.field2438 == arg0) {
                var2.field2440 = 0;
            }
        }
    }

    @ObfuscatedName("gp.ag(II)V")
    public void method3435(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3488(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3409(var6, var7, var8);
            } else {
                this.method3488(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3412(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2398[var12] = (var14 << 14) + (this.field2398[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2398[var12] = (var14 << 7) + (this.field2398[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2400[var12] = (var14 << 7) + (this.field2400[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2400[var12] = (this.field2400[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2401[var12] = (var14 << 7) + (this.field2401[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2401[var12] = (this.field2401[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2407[var12] = (var14 << 7) + (this.field2407[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2407[var12] = (this.field2407[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2394[var12] = (var14 << 7) + (this.field2394[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2394[var12] = (this.field2394[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2395[var12] = (var14 << 7) + (this.field2395[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2395[var12] = (this.field2395[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2415[var12] |= 0x1;
                } else {
                    this.field2415[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2415[var12] |= 0x2;
                } else {
                    this.method3410(var12);
                    this.field2415[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2404[var12] = (var14 << 7) + (this.field2404[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2404[var12] = (this.field2404[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2404[var12] = (var14 << 7) + (this.field2404[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2404[var12] = (this.field2404[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3474(var12);
            }
            if (var13 == 121) {
                this.method3475(var12);
            }
            if (var13 == 123) {
                this.method3428(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2404[var12];
                if (var15 == 16384) {
                    this.field2409[var12] = (var14 << 7) + (this.field2409[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2404[var12];
                if (var16 == 16384) {
                    this.field2409[var12] = (this.field2409[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2390[var12] = (var14 << 7) + (this.field2390[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2390[var12] = (this.field2390[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2415[var12] |= 0x4;
                } else {
                    this.method3501(var12);
                    this.field2415[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3422(var12, (var14 << 7) + (this.field2410[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3422(var12, (this.field2410[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3408(var17, this.field2398[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3413(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3414(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3484();
            }
        }
    }

    @ObfuscatedName("gp.aa(III)V")
    public void method3422(int arg0, int arg1) {
        this.field2410[arg0] = arg1;
        this.field2416[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gp.ap(Lgd;I)I")
    public int method3411(class200 arg0) {
        int var2 = (arg0.field2441 * arg0.field2429 >> 12) + arg0.field2427;
        int var3 = ((this.field2399[arg0.field2438] - 8192) * this.field2409[arg0.field2438] >> 12) + var2;
        class197 var4 = arg0.field2423;
        if (var4.field2377 > 0 && (var4.field2376 > 0 || this.field2400[arg0.field2438] > 0)) {
            int var5 = var4.field2376 << 2;
            int var6 = var4.field2378 << 1;
            if (arg0.field2436 < var6) {
                var5 = arg0.field2436 * var5 / var6;
            }
            int var7 = (this.field2400[arg0.field2438] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2437 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2422.field1367 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1384 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gp.aq(Lgd;B)I")
    public int method3442(class200 arg0) {
        class197 var2 = arg0.field2423;
        int var3 = this.field2395[arg0.field2438] * this.field2407[arg0.field2438] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2426 * var4 + 16384 >> 15;
        int var6 = this.field2391 * var5 + 128 >> 8;
        if (var2.field2373 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2431 * 1.953125E-5D * (double) var2.field2373) + 0.5D);
        }
        if (var2.field2370 != null) {
            int var7 = arg0.field2432;
            int var8 = var2.field2370[arg0.field2433 + 1];
            if (arg0.field2433 < var2.field2370.length - 2) {
                int var9 = (var2.field2370[arg0.field2433] & 0xFF) << 8;
                int var10 = (var2.field2370[arg0.field2433 + 2] & 0xFF) << 8;
                var8 += (var2.field2370[arg0.field2433 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2434 > 0 && var2.field2371 != null) {
            int var11 = arg0.field2434;
            int var12 = var2.field2371[arg0.field2435 + 1];
            if (arg0.field2435 < var2.field2371.length - 2) {
                int var13 = (var2.field2371[arg0.field2435] & 0xFF) << 8;
                int var14 = (var2.field2371[arg0.field2435 + 2] & 0xFF) << 8;
                var12 += (var2.field2371[arg0.field2435 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gp.ay(Lgd;B)I")
    public int method3424(class200 arg0) {
        int var2 = this.field2394[arg0.field2438];
        return var2 < 8192 ? arg0.field2430 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2430) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gp.n()Ldz;")
    public synchronized class116 method2093() {
        return this.field2417;
    }

    @ObfuscatedName("gp.t()Ldz;")
    public synchronized class116 method2094() {
        return null;
    }

    @ObfuscatedName("gp.q()I")
    public synchronized int method2095() {
        return 0;
    }

    @ObfuscatedName("gp.x([III)V")
    public synchronized void method2096(int[] arg0, int arg1, int arg2) {
        if (this.field2411.method3513()) {
            int var4 = this.field2392 * this.field2411.field2443 / Statics.field1384;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2397;
                if (this.field2408 - var5 >= 0L) {
                    this.field2397 = var5;
                    break;
                }
                int var7 = (int) ((this.field2408 - this.field2397 + (long) var4 - 1L) / (long) var4);
                this.field2397 += (long) var4 * (long) var7;
                this.field2417.method2096(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3425();
            } while (this.field2411.method3513());
        }
        this.field2417.method2096(arg0, arg1, arg2);
    }

    @ObfuscatedName("gp.f(I)V")
    public synchronized void method2106(int arg0) {
        if (this.field2411.method3513()) {
            int var2 = this.field2392 * this.field2411.field2443 / Statics.field1384;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2397;
                if (this.field2408 - var3 >= 0L) {
                    this.field2397 = var3;
                    break;
                }
                int var5 = (int) ((this.field2408 - this.field2397 + (long) var2 - 1L) / (long) var2);
                this.field2397 += (long) var2 * (long) var5;
                this.field2417.method2106(var5);
                arg0 -= var5;
                this.method3425();
            } while (this.field2411.method3513());
        }
        this.field2417.method2106(arg0);
    }

    @ObfuscatedName("gp.ad(I)V")
    public void method3425() {
        int var1 = this.field2413;
        int var2 = this.field2393;
        long var3 = this.field2408;
        while (this.field2393 == var2) {
            while (this.field2411.field2446[var1] == var2) {
                this.field2411.method3515(var1);
                int var5 = this.field2411.method3546(var1);
                if (var5 == 1) {
                    this.field2411.method3517();
                    this.field2411.method3553(var1);
                    if (this.field2411.method3524()) {
                        if (!this.field2412 || var2 == 0) {
                            this.method3484();
                            this.field2411.method3512();
                            return;
                        }
                        this.field2411.method3525(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3435(var5);
                }
                this.field2411.method3543(var1);
                this.field2411.method3553(var1);
            }
            var1 = this.field2411.method3523();
            var2 = this.field2411.field2446[var1];
            var3 = this.field2411.method3522(var2);
        }
        this.field2413 = var1;
        this.field2393 = var2;
        this.field2408 = var3;
    }

    @ObfuscatedName("gp.al(Lgd;B)Z")
    public boolean method3426(class200 arg0) {
        if (arg0.field2428 != null) {
            return false;
        }
        if (arg0.field2434 >= 0) {
            arg0.method3304();
            if (arg0.field2424 > 0 && this.field2403[arg0.field2438][arg0.field2424] == arg0) {
                this.field2403[arg0.field2438][arg0.field2424] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gp.ah(Lgd;[IIIB)Z")
    public boolean method3416(class200 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2439 = Statics.field1384 / 100;
        if (arg0.field2434 >= 0 && arg0.field2428 == null || arg0.field2428.method2325()) {
            arg0.method3503();
            arg0.method3304();
            if (arg0.field2424 > 0 && this.field2403[arg0.field2438][arg0.field2424] == arg0) {
                this.field2403[arg0.field2438][arg0.field2424] = null;
            }
            return true;
        }
        int var5 = arg0.field2441;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2401[arg0.field2438] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2441 = var6;
        }
        arg0.field2428.method2323(this.method3411(arg0));
        class197 var7 = arg0.field2423;
        boolean var8 = false;
        arg0.field2436++;
        arg0.field2437 += var7.field2377;
        double var9 = (double) ((arg0.field2425 - 60 << 8) + (arg0.field2441 * arg0.field2429 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2373 > 0) {
            if (var7.field2375 > 0) {
                arg0.field2431 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2375 * var9) + 0.5D);
            } else {
                arg0.field2431 += 128;
            }
        }
        if (var7.field2370 != null) {
            if (var7.field2372 > 0) {
                arg0.field2432 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2372 * var9) + 0.5D);
            } else {
                arg0.field2432 += 128;
            }
            while (arg0.field2433 < var7.field2370.length - 2 && arg0.field2432 > (var7.field2370[arg0.field2433 + 2] & 0xFF) << 8) {
                arg0.field2433 += 2;
            }
            if (arg0.field2433 == var7.field2370.length - 2 && var7.field2370[arg0.field2433 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2434 >= 0 && var7.field2371 != null && (this.field2415[arg0.field2438] & 0x1) == 0 && (arg0.field2424 < 0 || this.field2403[arg0.field2438][arg0.field2424] != arg0)) {
            if (var7.field2374 > 0) {
                arg0.field2434 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2374 * var9) + 0.5D);
            } else {
                arg0.field2434 += 128;
            }
            while (arg0.field2435 < var7.field2371.length - 2 && arg0.field2434 > (var7.field2371[arg0.field2435 + 2] & 0xFF) << 8) {
                arg0.field2435 += 2;
            }
            if (arg0.field2435 == var7.field2371.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2428.method2321(arg0.field2439, this.method3442(arg0), this.method3424(arg0));
            return false;
        }
        arg0.field2428.method2322(arg0.field2439);
        if (arg1 == null) {
            arg0.field2428.method2106(arg3);
        } else {
            arg0.field2428.method2096(arg1, arg2, arg3);
        }
        if (arg0.field2428.method2307()) {
            this.field2417.field2469.method2103(arg0.field2428);
        }
        arg0.method3503();
        if (arg0.field2434 >= 0) {
            arg0.method3304();
            if (arg0.field2424 > 0 && this.field2403[arg0.field2438][arg0.field2424] == arg0) {
                this.field2403[arg0.field2438][arg0.field2424] = null;
            }
        }
        return true;
    }
}
