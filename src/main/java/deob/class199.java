package deob;

@ObfuscatedName("gz")
public class class199 extends class116 {

    @ObfuscatedName("gz.u")
    public class318 field2419 = new class318(128);

    @ObfuscatedName("gz.f")
    public int field2418 = 256;

    @ObfuscatedName("gz.b")
    public int field2420 = 1000000;

    @ObfuscatedName("gz.g")
    public int[] field2438 = new int[16];

    @ObfuscatedName("gz.z")
    public int[] field2421 = new int[16];

    @ObfuscatedName("gz.p")
    public int[] field2443 = new int[16];

    @ObfuscatedName("gz.h")
    public int[] field2423 = new int[16];

    @ObfuscatedName("gz.y")
    public int[] field2422 = new int[16];

    @ObfuscatedName("gz.i")
    public int[] field2425 = new int[16];

    @ObfuscatedName("gz.k")
    public int[] field2426 = new int[16];

    @ObfuscatedName("gz.x")
    public int[] field2444 = new int[16];

    @ObfuscatedName("gz.o")
    public int[] field2428 = new int[16];

    @ObfuscatedName("gz.s")
    public int[] field2429 = new int[16];

    @ObfuscatedName("gz.t")
    public int[] field2441 = new int[16];

    @ObfuscatedName("gz.m")
    public int[] field2431 = new int[16];

    @ObfuscatedName("gz.v")
    public int[] field2442 = new int[16];

    @ObfuscatedName("gz.q")
    public int[] field2433 = new int[16];

    @ObfuscatedName("gz.l")
    public int[] field2434 = new int[16];

    @ObfuscatedName("gz.j")
    public class200[][] field2435 = new class200[16][128];

    @ObfuscatedName("gz.af")
    public class200[][] field2436 = new class200[16][128];

    @ObfuscatedName("gz.ad")
    public class201 field2437 = new class201();

    @ObfuscatedName("gz.am")
    public boolean field2427;

    @ObfuscatedName("gz.ai")
    public int field2439;

    @ObfuscatedName("gz.ag")
    public int field2440;

    @ObfuscatedName("gz.ao")
    public long field2432;

    @ObfuscatedName("gz.aw")
    public long field2417;

    @ObfuscatedName("gz.ak")
    public class203 field2424 = new class203(this);

    public class199() {
        this.method3447();
    }

    @ObfuscatedName("gz.u(IB)V")
    public synchronized void method3516(int arg0) {
        this.field2418 = arg0;
    }

    @ObfuscatedName("gz.f(I)I")
    public int method3429() {
        return this.field2418;
    }

    @ObfuscatedName("gz.b(Lgt;Lhf;Ldk;II)Z")
    public synchronized boolean method3525(class204 arg0, class234 arg1, class109 arg2, int arg3) {
        arg0.method3618();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2499.method5551(); var7 != null; var7 = (class178) arg0.field2499.method5556()) {
            int var8 = (int) var7.field2126;
            class202 var9 = (class202) this.field2419.method5549((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3850(var8);
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
                this.field2419.method5550(var11, (long) var8);
            }
            if (!var9.method3598(arg2, var7.field2122, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3615();
        }
        return var5;
    }

    @ObfuscatedName("gz.g(B)V")
    public synchronized void method3431() {
        for (class202 var1 = (class202) this.field2419.method5551(); var1 != null; var1 = (class202) this.field2419.method5556()) {
            var1.method3599();
        }
    }

    @ObfuscatedName("gz.z(I)V")
    public synchronized void method3432() {
        for (class202 var1 = (class202) this.field2419.method5551(); var1 != null; var1 = (class202) this.field2419.method5556()) {
            var1.method3332();
        }
    }

    @ObfuscatedName("gz.i(Lgt;ZI)V")
    public synchronized void method3433(class204 arg0, boolean arg1) {
        this.method3472();
        this.field2437.method3543(arg0.field2500);
        this.field2427 = arg1;
        this.field2432 = 0L;
        int var3 = this.field2437.method3544();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2437.method3545(var4);
            this.field2437.method3548(var4);
            this.field2437.method3540(var4);
        }
        this.field2439 = this.field2437.method3553();
        this.field2440 = this.field2437.field2474[this.field2439];
        this.field2417 = this.field2437.method3552(this.field2440);
    }

    @ObfuscatedName("gz.x(I)V")
    public synchronized void method3472() {
        this.field2437.method3542();
        this.method3447();
    }

    @ObfuscatedName("gz.o(I)Z")
    public synchronized boolean method3524() {
        return this.field2437.method3588();
    }

    @ObfuscatedName("gz.e(III)V")
    public synchronized void method3435(int arg0, int arg1) {
        this.method3466(arg0, arg1);
    }

    @ObfuscatedName("gz.n(III)V")
    public void method3466(int arg0, int arg1) {
        this.field2423[arg0] = arg1;
        this.field2425[arg0] = arg1 & 0xFFFFFF80;
        this.method3437(arg0, arg1);
    }

    @ObfuscatedName("gz.c(III)V")
    public void method3437(int arg0, int arg1) {
        if (this.field2422[arg0] != arg1) {
            this.field2422[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2436[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gz.s(IIII)V")
    public void method3438(int arg0, int arg1, int arg2) {
        this.method3465(arg0, arg1, 64);
        if ((this.field2429[arg0] & 0x2) != 0) {
            for (class200 var4 = (class200) this.field2424.field2497.method4569(); var4 != null; var4 = (class200) this.field2424.field2497.method4597()) {
                if (var4.field2450 == arg0 && var4.field2460 < 0) {
                    this.field2435[arg0][var4.field2451] = null;
                    this.field2435[arg0][arg1] = var4;
                    int var5 = (var4.field2456 * var4.field2455 >> 12) + var4.field2466;
                    var4.field2466 += arg1 - var4.field2451 << 8;
                    var4.field2455 = var5 - var4.field2466;
                    var4.field2456 = 4096;
                    var4.field2451 = arg1;
                    return;
                }
            }
        }
        class202 var6 = (class202) this.field2419.method5549((long) this.field2422[arg0]);
        if (var6 == null) {
            return;
        }
        class104 var7 = var6.field2485[arg1];
        if (var7 == null) {
            return;
        }
        class200 var8 = new class200();
        var8.field2450 = arg0;
        var8.field2447 = var6;
        var8.field2454 = var7;
        var8.field2449 = var6.field2489[arg1];
        var8.field2446 = var6.field2488[arg1];
        var8.field2451 = arg1;
        var8.field2452 = var6.field2490 * arg2 * arg2 * var6.field2487[arg1] + 1024 >> 11;
        var8.field2453 = var6.field2484[arg1] & 0xFF;
        var8.field2466 = (arg1 << 8) - (var6.field2486[arg1] & 0x7FFF);
        var8.field2457 = 0;
        var8.field2458 = 0;
        var8.field2459 = 0;
        var8.field2460 = -1;
        var8.field2461 = 0;
        if (this.field2442[arg0] == 0) {
            var8.field2468 = class114.method2338(var7, this.method3510(var8), this.method3453(var8), this.method3454(var8));
        } else {
            var8.field2468 = class114.method2338(var7, this.method3510(var8), 0, this.method3454(var8));
            this.method3439(var8, var6.field2486[arg1] < 0);
        }
        if (var6.field2486[arg1] < 0) {
            var8.field2468.method2341(-1);
        }
        if (var8.field2446 >= 0) {
            class200 var9 = this.field2436[arg0][var8.field2446];
            if (var9 != null && var9.field2460 < 0) {
                this.field2435[arg0][var9.field2451] = null;
                var9.field2460 = 0;
            }
            this.field2436[arg0][var8.field2446] = var8;
        }
        this.field2424.field2497.method4563(var8);
        this.field2435[arg0][arg1] = var8;
    }

    @ObfuscatedName("gz.t(Lge;ZI)V")
    public void method3439(class200 arg0, boolean arg1) {
        int var3 = arg0.field2454.field1376.length;
        int var5;
        if (arg1 && arg0.field2454.field1379) {
            int var4 = var3 + var3 - arg0.field2454.field1377;
            var5 = (int) ((long) this.field2442[arg0.field2450] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2468.method2348(true);
            }
        } else {
            var5 = (int) ((long) this.field2442[arg0.field2450] * (long) var3 >> 6);
        }
        arg0.field2468.method2477(var5);
    }

    @ObfuscatedName("gz.m(IIIB)V")
    public void method3465(int arg0, int arg1, int arg2) {
        class200 var4 = this.field2435[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2435[arg0][arg1] = null;
        if ((this.field2429[arg0] & 0x2) == 0) {
            var4.field2460 = 0;
            return;
        }
        for (class200 var5 = (class200) this.field2424.field2497.method4568(); var5 != null; var5 = (class200) this.field2424.field2497.method4561()) {
            if (var4.field2450 == var5.field2450 && var5.field2460 < 0 && var4 != var5) {
                var4.field2460 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gz.v(IIIB)V")
    public void method3441(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gz.q(III)V")
    public void method3442(int arg0, int arg1) {
    }

    @ObfuscatedName("gz.l(III)V")
    public void method3443(int arg0, int arg1) {
        this.field2426[arg0] = arg1;
    }

    @ObfuscatedName("gz.aa(II)V")
    public void method3444(int arg0) {
        for (class200 var2 = (class200) this.field2424.field2497.method4568(); var2 != null; var2 = (class200) this.field2424.field2497.method4561()) {
            if (arg0 < 0 || var2.field2450 == arg0) {
                if (var2.field2468 != null) {
                    var2.field2468.method2352(Statics.field1275 / 100);
                    if (var2.field2468.method2444()) {
                        this.field2424.field2498.method2113(var2.field2468);
                    }
                    var2.method3539();
                }
                if (var2.field2460 < 0) {
                    this.field2435[var2.field2450][var2.field2451] = null;
                }
                var2.method3332();
            }
        }
    }

    @ObfuscatedName("gz.ab(IB)V")
    public void method3469(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3469(var2);
            }
            return;
        }
        this.field2438[arg0] = 12800;
        this.field2421[arg0] = 8192;
        this.field2443[arg0] = 16383;
        this.field2426[arg0] = 8192;
        this.field2444[arg0] = 0;
        this.field2428[arg0] = 8192;
        this.method3486(arg0);
        this.method3449(arg0);
        this.field2429[arg0] = 0;
        this.field2441[arg0] = 32767;
        this.field2431[arg0] = 256;
        this.field2442[arg0] = 0;
        this.method3451(arg0, 8192);
    }

    @ObfuscatedName("gz.ar(IB)V")
    public void method3446(int arg0) {
        for (class200 var2 = (class200) this.field2424.field2497.method4568(); var2 != null; var2 = (class200) this.field2424.field2497.method4561()) {
            if ((arg0 < 0 || var2.field2450 == arg0) && var2.field2460 < 0) {
                this.field2435[var2.field2450][var2.field2451] = null;
                var2.field2460 = 0;
            }
        }
    }

    @ObfuscatedName("gz.ac(B)V")
    public void method3447() {
        this.method3444(-1);
        this.method3469(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2422[var1] = this.field2423[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2425[var2] = this.field2423[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gz.az(II)V")
    public void method3486(int arg0) {
        if ((this.field2429[arg0] & 0x2) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2424.field2497.method4568(); var2 != null; var2 = (class200) this.field2424.field2497.method4561()) {
            if (var2.field2450 == arg0 && this.field2435[arg0][var2.field2451] == null && var2.field2460 < 0) {
                var2.field2460 = 0;
            }
        }
    }

    @ObfuscatedName("gz.ae(II)V")
    public void method3449(int arg0) {
        if ((this.field2429[arg0] & 0x4) == 0) {
            return;
        }
        for (class200 var2 = (class200) this.field2424.field2497.method4568(); var2 != null; var2 = (class200) this.field2424.field2497.method4561()) {
            if (var2.field2450 == arg0) {
                var2.field2464 = 0;
            }
        }
    }

    @ObfuscatedName("gz.aj(II)V")
    public void method3430(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3465(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3438(var6, var7, var8);
            } else {
                this.method3465(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3441(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2425[var12] = (var14 << 14) + (this.field2425[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2425[var12] = (var14 << 7) + (this.field2425[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2444[var12] = (var14 << 7) + (this.field2444[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2444[var12] = (this.field2444[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2428[var12] = (var14 << 7) + (this.field2428[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2428[var12] = (this.field2428[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2438[var12] = (var14 << 7) + (this.field2438[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2438[var12] = (this.field2438[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2421[var12] = (var14 << 7) + (this.field2421[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2421[var12] = (this.field2421[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2443[var12] = (var14 << 7) + (this.field2443[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2443[var12] = (this.field2443[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2429[var12] |= 0x1;
                } else {
                    this.field2429[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2429[var12] |= 0x2;
                } else {
                    this.method3486(var12);
                    this.field2429[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2441[var12] = (var14 << 7) + (this.field2441[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2441[var12] = (this.field2441[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2441[var12] = (var14 << 7) + (this.field2441[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2441[var12] = (this.field2441[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3444(var12);
            }
            if (var13 == 121) {
                this.method3469(var12);
            }
            if (var13 == 123) {
                this.method3446(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2441[var12];
                if (var15 == 16384) {
                    this.field2431[var12] = (var14 << 7) + (this.field2431[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2441[var12];
                if (var16 == 16384) {
                    this.field2431[var12] = (this.field2431[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2442[var12] = (var14 << 7) + (this.field2442[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2442[var12] = (this.field2442[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2429[var12] |= 0x4;
                } else {
                    this.method3449(var12);
                    this.field2429[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3451(var12, (var14 << 7) + (this.field2433[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3451(var12, (this.field2433[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3437(var17, this.field2425[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3442(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3443(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3447();
            }
        }
    }

    @ObfuscatedName("gz.ap(III)V")
    public void method3451(int arg0, int arg1) {
        this.field2433[arg0] = arg1;
        this.field2434[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gz.an(Lge;B)I")
    public int method3510(class200 arg0) {
        int var2 = (arg0.field2456 * arg0.field2455 >> 12) + arg0.field2466;
        int var3 = ((this.field2426[arg0.field2450] - 8192) * this.field2431[arg0.field2450] >> 12) + var2;
        class197 var4 = arg0.field2449;
        if (var4.field2406 > 0 && (var4.field2402 > 0 || this.field2444[arg0.field2450] > 0)) {
            int var5 = var4.field2402 << 2;
            int var6 = var4.field2403 << 1;
            if (arg0.field2462 < var6) {
                var5 = arg0.field2462 * var5 / var6;
            }
            int var7 = (this.field2444[arg0.field2450] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2463 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2454.field1378 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1275 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gz.al(Lge;B)I")
    public int method3453(class200 arg0) {
        class197 var2 = arg0.field2449;
        int var3 = this.field2443[arg0.field2450] * this.field2438[arg0.field2450] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2452 * var4 + 16384 >> 15;
        int var6 = this.field2418 * var5 + 128 >> 8;
        if (var2.field2401 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2457 * 1.953125E-5D * (double) var2.field2401) + 0.5D);
        }
        if (var2.field2405 != null) {
            int var7 = arg0.field2458;
            int var8 = var2.field2405[arg0.field2459 + 1];
            if (arg0.field2459 < var2.field2405.length - 2) {
                int var9 = (var2.field2405[arg0.field2459] & 0xFF) << 8;
                int var10 = (var2.field2405[arg0.field2459 + 2] & 0xFF) << 8;
                var8 += (var2.field2405[arg0.field2459 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2460 > 0 && var2.field2400 != null) {
            int var11 = arg0.field2460;
            int var12 = var2.field2400[arg0.field2461 + 1];
            if (arg0.field2461 < var2.field2400.length - 2) {
                int var13 = (var2.field2400[arg0.field2461] & 0xFF) << 8;
                int var14 = (var2.field2400[arg0.field2461 + 2] & 0xFF) << 8;
                var12 += (var2.field2400[arg0.field2461 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gz.ay(Lge;I)I")
    public int method3454(class200 arg0) {
        int var2 = this.field2421[arg0.field2450];
        return var2 < 8192 ? arg0.field2453 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2453) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gz.p()Ldt;")
    public synchronized class116 method2116() {
        return this.field2424;
    }

    @ObfuscatedName("gz.h()Ldt;")
    public synchronized class116 method2117() {
        return null;
    }

    @ObfuscatedName("gz.y()I")
    public synchronized int method2110() {
        return 0;
    }

    @ObfuscatedName("gz.w([III)V")
    public synchronized void method2119(int[] arg0, int arg1, int arg2) {
        if (this.field2437.method3588()) {
            int var4 = this.field2420 * this.field2437.field2471 / Statics.field1275;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2432;
                if (this.field2417 - var5 >= 0L) {
                    this.field2432 = var5;
                    break;
                }
                int var7 = (int) ((this.field2417 - this.field2432 + (long) var4 - 1L) / (long) var4);
                this.field2432 += (long) var4 * (long) var7;
                this.field2424.method2119(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3456();
            } while (this.field2437.method3588());
        }
        this.field2424.method2119(arg0, arg1, arg2);
    }

    @ObfuscatedName("gz.k(I)V")
    public synchronized void method2121(int arg0) {
        if (this.field2437.method3588()) {
            int var2 = this.field2420 * this.field2437.field2471 / Statics.field1275;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2432;
                if (this.field2417 - var3 >= 0L) {
                    this.field2432 = var3;
                    break;
                }
                int var5 = (int) ((this.field2417 - this.field2432 + (long) var2 - 1L) / (long) var2);
                this.field2432 += (long) var2 * (long) var5;
                this.field2424.method2121(var5);
                arg0 -= var5;
                this.method3456();
            } while (this.field2437.method3588());
        }
        this.field2424.method2121(arg0);
    }

    @ObfuscatedName("gz.ax(I)V")
    public void method3456() {
        int var1 = this.field2439;
        int var2 = this.field2440;
        long var3 = this.field2417;
        while (this.field2440 == var2) {
            while (this.field2437.field2474[var1] == var2) {
                this.field2437.method3545(var1);
                int var5 = this.field2437.method3582(var1);
                if (var5 == 1) {
                    this.field2437.method3590();
                    this.field2437.method3540(var1);
                    if (this.field2437.method3586()) {
                        if (!this.field2427 || var2 == 0) {
                            this.method3447();
                            this.field2437.method3542();
                            return;
                        }
                        this.field2437.method3583(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3430(var5);
                }
                this.field2437.method3548(var1);
                this.field2437.method3540(var1);
            }
            var1 = this.field2437.method3553();
            var2 = this.field2437.field2474[var1];
            var3 = this.field2437.method3552(var2);
        }
        this.field2439 = var1;
        this.field2440 = var2;
        this.field2417 = var3;
    }

    @ObfuscatedName("gz.au(Lge;B)Z")
    public boolean method3457(class200 arg0) {
        if (arg0.field2468 != null) {
            return false;
        }
        if (arg0.field2460 >= 0) {
            arg0.method3332();
            if (arg0.field2446 > 0 && this.field2436[arg0.field2450][arg0.field2446] == arg0) {
                this.field2436[arg0.field2450][arg0.field2446] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gz.as(Lge;[IIII)Z")
    public boolean method3458(class200 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2465 = Statics.field1275 / 100;
        if (arg0.field2460 >= 0 && arg0.field2468 == null || arg0.field2468.method2354()) {
            arg0.method3539();
            arg0.method3332();
            if (arg0.field2446 > 0 && this.field2436[arg0.field2450][arg0.field2446] == arg0) {
                this.field2436[arg0.field2450][arg0.field2446] = null;
            }
            return true;
        }
        int var5 = arg0.field2456;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2428[arg0.field2450] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2456 = var6;
        }
        arg0.field2468.method2437(this.method3510(arg0));
        class197 var7 = arg0.field2449;
        boolean var8 = false;
        arg0.field2462++;
        arg0.field2463 += var7.field2406;
        double var9 = (double) ((arg0.field2451 - 60 << 8) + (arg0.field2456 * arg0.field2455 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2401 > 0) {
            if (var7.field2404 > 0) {
                arg0.field2457 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2404 * var9) + 0.5D);
            } else {
                arg0.field2457 += 128;
            }
        }
        if (var7.field2405 != null) {
            if (var7.field2399 > 0) {
                arg0.field2458 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2399 * var9) + 0.5D);
            } else {
                arg0.field2458 += 128;
            }
            while (arg0.field2459 < var7.field2405.length - 2 && arg0.field2458 > (var7.field2405[arg0.field2459 + 2] & 0xFF) << 8) {
                arg0.field2459 += 2;
            }
            if (arg0.field2459 == var7.field2405.length - 2 && var7.field2405[arg0.field2459 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2460 >= 0 && var7.field2400 != null && (this.field2429[arg0.field2450] & 0x1) == 0 && (arg0.field2446 < 0 || this.field2436[arg0.field2450][arg0.field2446] != arg0)) {
            if (var7.field2408 > 0) {
                arg0.field2460 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2408 * var9) + 0.5D);
            } else {
                arg0.field2460 += 128;
            }
            while (arg0.field2461 < var7.field2400.length - 2 && arg0.field2460 > (var7.field2400[arg0.field2461 + 2] & 0xFF) << 8) {
                arg0.field2461 += 2;
            }
            if (arg0.field2461 == var7.field2400.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2468.method2351(arg0.field2465, this.method3453(arg0), this.method3454(arg0));
            return false;
        }
        arg0.field2468.method2352(arg0.field2465);
        if (arg1 == null) {
            arg0.field2468.method2121(arg3);
        } else {
            arg0.field2468.method2119(arg1, arg2, arg3);
        }
        if (arg0.field2468.method2444()) {
            this.field2424.field2498.method2113(arg0.field2468);
        }
        arg0.method3539();
        if (arg0.field2460 >= 0) {
            arg0.method3332();
            if (arg0.field2446 > 0 && this.field2436[arg0.field2450][arg0.field2446] == arg0) {
                this.field2436[arg0.field2450][arg0.field2446] = null;
            }
        }
        return true;
    }
}
