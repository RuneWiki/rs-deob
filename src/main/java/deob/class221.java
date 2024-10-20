package deob;

@ObfuscatedName("hg")
public class class221 extends class108 {

    @ObfuscatedName("hg.g")
    public class205 field2558 = new class205(128);

    @ObfuscatedName("hg.r")
    public int field2538 = 256;

    @ObfuscatedName("hg.e")
    public int field2539 = 1000000;

    @ObfuscatedName("hg.q")
    public int[] field2552 = new int[16];

    @ObfuscatedName("hg.c")
    public int[] field2537 = new int[16];

    @ObfuscatedName("hg.l")
    public int[] field2542 = new int[16];

    @ObfuscatedName("hg.b")
    public int[] field2543 = new int[16];

    @ObfuscatedName("hg.n")
    public int[] field2540 = new int[16];

    @ObfuscatedName("hg.i")
    public int[] field2545 = new int[16];

    @ObfuscatedName("hg.p")
    public int[] field2544 = new int[16];

    @ObfuscatedName("hg.m")
    public int[] field2553 = new int[16];

    @ObfuscatedName("hg.d")
    public int[] field2559 = new int[16];

    @ObfuscatedName("hg.t")
    public int[] field2549 = new int[16];

    @ObfuscatedName("hg.k")
    public int[] field2546 = new int[16];

    @ObfuscatedName("hg.z")
    public int[] field2551 = new int[16];

    @ObfuscatedName("hg.s")
    public int[] field2541 = new int[16];

    @ObfuscatedName("hg.y")
    public int[] field2554 = new int[16];

    @ObfuscatedName("hg.u")
    public int[] field2547 = new int[16];

    @ObfuscatedName("hg.o")
    public class222[][] field2555 = new class222[16][128];

    @ObfuscatedName("hg.af")
    public class222[][] field2556 = new class222[16][128];

    @ObfuscatedName("hg.an")
    public class223 field2557 = new class223();

    @ObfuscatedName("hg.ax")
    public boolean field2548;

    @ObfuscatedName("hg.aw")
    public int field2550;

    @ObfuscatedName("hg.ae")
    public int field2560;

    @ObfuscatedName("hg.ac")
    public long field2561;

    @ObfuscatedName("hg.az")
    public long field2562;

    @ObfuscatedName("hg.aj")
    public class225 field2563 = new class225(this);

    public class221() {
        this.method4086();
    }

    @ObfuscatedName("hg.g(IB)V")
    public synchronized void method4094(int arg0) {
        this.field2538 = arg0;
    }

    @ObfuscatedName("hg.r(I)I")
    public int method4073() {
        return this.field2538;
    }

    @ObfuscatedName("hg.e(Lhh;Liu;Lci;II)Z")
    public synchronized boolean method4069(class226 arg0, class250 arg1, class101 arg2, int arg3) {
        arg0.method4259();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class216 var7 = (class216) arg0.field2620.method3916(); var7 != null; var7 = (class216) arg0.field2620.method3910()) {
            int var8 = (int) var7.field2497;
            class224 var9 = (class224) this.field2558.method3905((long) var8);
            if (var9 == null) {
                var9 = class224.method471(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2558.method3907(var9, (long) var8);
            }
            if (!var9.method4235(arg2, var7.field2515, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4264();
        }
        return var5;
    }

    @ObfuscatedName("hg.q(I)V")
    public synchronized void method4070() {
        for (class224 var1 = (class224) this.field2558.method3916(); var1 != null; var1 = (class224) this.field2558.method3910()) {
            var1.method4236();
        }
    }

    @ObfuscatedName("hg.c(B)V")
    public synchronized void method4130() {
        for (class224 var1 = (class224) this.field2558.method3916(); var1 != null; var1 = (class224) this.field2558.method3910()) {
            var1.method3952();
        }
    }

    @ObfuscatedName("hg.j(Lhh;ZI)V")
    public synchronized void method4072(class226 arg0, boolean arg1) {
        this.method4172();
        this.field2557.method4182(arg0.field2621);
        this.field2548 = arg1;
        this.field2561 = 0L;
        int var3 = this.field2557.method4223();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2557.method4219(var4);
            this.field2557.method4188(var4);
            this.field2557.method4186(var4);
        }
        this.field2550 = this.field2557.method4224();
        this.field2560 = this.field2557.field2592[this.field2550];
        this.field2562 = this.field2557.method4192(this.field2560);
    }

    @ObfuscatedName("hg.v(B)V")
    public synchronized void method4172() {
        this.field2557.method4233();
        this.method4086();
    }

    @ObfuscatedName("hg.h(I)Z")
    public synchronized boolean method4146() {
        return this.field2557.method4180();
    }

    @ObfuscatedName("hg.f(IIB)V")
    public synchronized void method4074(int arg0, int arg1) {
        this.method4137(arg0, arg1);
    }

    @ObfuscatedName("hg.a(III)V")
    public void method4137(int arg0, int arg1) {
        this.field2543[arg0] = arg1;
        this.field2545[arg0] = arg1 & 0xFFFFFF80;
        this.method4076(arg0, arg1);
    }

    @ObfuscatedName("hg.t(IIB)V")
    public void method4076(int arg0, int arg1) {
        if (this.field2540[arg0] != arg1) {
            this.field2540[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2556[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hg.k(IIIB)V")
    public void method4077(int arg0, int arg1, int arg2) {
        this.method4132(arg0, arg1, 64);
        if ((this.field2549[arg0] & 0x2) != 0) {
            for (class222 var4 = (class222) this.field2563.field2616.method3955(); var4 != null; var4 = (class222) this.field2563.field2616.method3976()) {
                if (var4.field2586 == arg0 && var4.field2578 < 0) {
                    this.field2555[arg0][var4.field2569] = null;
                    this.field2555[arg0][arg1] = var4;
                    int var5 = (var4.field2574 * var4.field2573 >> 12) + var4.field2587;
                    var4.field2587 += arg1 - var4.field2569 << 8;
                    var4.field2573 = var5 - var4.field2587;
                    var4.field2574 = 4096;
                    var4.field2569 = arg1;
                    return;
                }
            }
        }
        class224 var6 = (class224) this.field2558.method3905((long) this.field2540[arg0]);
        if (var6 == null) {
            return;
        }
        class96 var7 = var6.field2603[arg1];
        if (var7 == null) {
            return;
        }
        class222 var8 = new class222();
        var8.field2586 = arg0;
        var8.field2572 = var6;
        var8.field2566 = var7;
        var8.field2567 = var6.field2607[arg1];
        var8.field2584 = var6.field2608[arg1];
        var8.field2569 = arg1;
        var8.field2571 = var6.field2604 * arg2 * arg2 * var6.field2605[arg1] + 1024 >> 11;
        var8.field2570 = var6.field2613[arg1] & 0xFF;
        var8.field2587 = (arg1 << 8) - (var6.field2602[arg1] & 0x7FFF);
        var8.field2575 = 0;
        var8.field2576 = 0;
        var8.field2565 = 0;
        var8.field2578 = -1;
        var8.field2579 = 0;
        if (this.field2541[arg0] == 0) {
            var8.field2582 = class106.method2310(var7, this.method4091(var8), this.method4092(var8), this.method4093(var8));
        } else {
            var8.field2582 = class106.method2310(var7, this.method4091(var8), 0, this.method4093(var8));
            this.method4078(var8, var6.field2602[arg1] < 0);
        }
        if (var6.field2602[arg1] < 0) {
            var8.field2582.method2312(-1);
        }
        if (var8.field2584 >= 0) {
            class222 var9 = this.field2556[arg0][var8.field2584];
            if (var9 != null && var9.field2578 < 0) {
                this.field2555[arg0][var9.field2569] = null;
                var9.field2578 = 0;
            }
            this.field2556[arg0][var8.field2584] = var8;
        }
        this.field2563.field2616.method3957(var8);
        this.field2555[arg0][arg1] = var8;
    }

    @ObfuscatedName("hg.s(Lho;ZB)V")
    public void method4078(class222 arg0, boolean arg1) {
        int var3 = arg0.field2566.field1346.length;
        int var5;
        if (arg1 && arg0.field2566.field1345) {
            int var4 = var3 + var3 - arg0.field2566.field1347;
            var5 = (int) ((long) this.field2541[arg0.field2586] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2582.method2319(true);
            }
        } else {
            var5 = (int) ((long) this.field2541[arg0.field2586] * (long) var3 >> 6);
        }
        arg0.field2582.method2318(var5);
    }

    @ObfuscatedName("hg.y(IIIB)V")
    public void method4132(int arg0, int arg1, int arg2) {
        class222 var4 = this.field2555[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2555[arg0][arg1] = null;
        if ((this.field2549[arg0] & 0x2) == 0) {
            var4.field2578 = 0;
            return;
        }
        for (class222 var5 = (class222) this.field2563.field2616.method3979(); var5 != null; var5 = (class222) this.field2563.field2616.method3964()) {
            if (var4.field2586 == var5.field2586 && var5.field2578 < 0 && var4 != var5) {
                var4.field2578 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hg.u(IIII)V")
    public void method4080(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hg.o(IIB)V")
    public void method4067(int arg0, int arg1) {
    }

    @ObfuscatedName("hg.af(IIB)V")
    public void method4082(int arg0, int arg1) {
        this.field2544[arg0] = arg1;
    }

    @ObfuscatedName("hg.an(II)V")
    public void method4083(int arg0) {
        for (class222 var2 = (class222) this.field2563.field2616.method3979(); var2 != null; var2 = (class222) this.field2563.field2616.method3964()) {
            if (arg0 < 0 || var2.field2586 == arg0) {
                if (var2.field2582 != null) {
                    var2.field2582.method2323(Statics.field1378 / 100);
                    if (var2.field2582.method2327()) {
                        this.field2563.field2618.method2082(var2.field2582);
                    }
                    var2.method4176();
                }
                if (var2.field2578 < 0) {
                    this.field2555[var2.field2586][var2.field2569] = null;
                }
                var2.method3952();
            }
        }
    }

    @ObfuscatedName("hg.ax(IB)V")
    public void method4084(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4084(var2);
            }
            return;
        }
        this.field2552[arg0] = 12800;
        this.field2537[arg0] = 8192;
        this.field2542[arg0] = 16383;
        this.field2544[arg0] = 8192;
        this.field2553[arg0] = 0;
        this.field2559[arg0] = 8192;
        this.method4087(arg0);
        this.method4088(arg0);
        this.field2549[arg0] = 0;
        this.field2546[arg0] = 32767;
        this.field2551[arg0] = 256;
        this.field2541[arg0] = 0;
        this.method4090(arg0, 8192);
    }

    @ObfuscatedName("hg.ad(II)V")
    public void method4150(int arg0) {
        for (class222 var2 = (class222) this.field2563.field2616.method3979(); var2 != null; var2 = (class222) this.field2563.field2616.method3964()) {
            if ((arg0 < 0 || var2.field2586 == arg0) && var2.field2578 < 0) {
                this.field2555[var2.field2586][var2.field2569] = null;
                var2.field2578 = 0;
            }
        }
    }

    @ObfuscatedName("hg.al(I)V")
    public void method4086() {
        this.method4083(-1);
        this.method4084(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2540[var1] = this.field2543[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2545[var2] = this.field2543[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hg.ak(II)V")
    public void method4087(int arg0) {
        if ((this.field2549[arg0] & 0x2) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2563.field2616.method3979(); var2 != null; var2 = (class222) this.field2563.field2616.method3964()) {
            if (var2.field2586 == arg0 && this.field2555[arg0][var2.field2569] == null && var2.field2578 < 0) {
                var2.field2578 = 0;
            }
        }
    }

    @ObfuscatedName("hg.ah(II)V")
    public void method4088(int arg0) {
        if ((this.field2549[arg0] & 0x4) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2563.field2616.method3979(); var2 != null; var2 = (class222) this.field2563.field2616.method3964()) {
            if (var2.field2586 == arg0) {
                var2.field2568 = 0;
            }
        }
    }

    @ObfuscatedName("hg.ap(II)V")
    public void method4125(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4132(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4077(var6, var7, var8);
            } else {
                this.method4132(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4080(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2545[var12] = (var14 << 14) + (this.field2545[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2545[var12] = (var14 << 7) + (this.field2545[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2553[var12] = (var14 << 7) + (this.field2553[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2553[var12] = (this.field2553[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2559[var12] = (var14 << 7) + (this.field2559[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2559[var12] = (this.field2559[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2552[var12] = (var14 << 7) + (this.field2552[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2552[var12] = (this.field2552[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2537[var12] = (var14 << 7) + (this.field2537[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2537[var12] = (this.field2537[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2542[var12] = (var14 << 7) + (this.field2542[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2542[var12] = (this.field2542[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2549[var12] |= 0x1;
                } else {
                    this.field2549[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2549[var12] |= 0x2;
                } else {
                    this.method4087(var12);
                    this.field2549[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2546[var12] = (var14 << 7) + (this.field2546[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2546[var12] = (this.field2546[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2546[var12] = (var14 << 7) + (this.field2546[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2546[var12] = (this.field2546[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4083(var12);
            }
            if (var13 == 121) {
                this.method4084(var12);
            }
            if (var13 == 123) {
                this.method4150(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2546[var12];
                if (var15 == 16384) {
                    this.field2551[var12] = (var14 << 7) + (this.field2551[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2546[var12];
                if (var16 == 16384) {
                    this.field2551[var12] = (this.field2551[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2541[var12] = (var14 << 7) + (this.field2541[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2541[var12] = (this.field2541[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2549[var12] |= 0x4;
                } else {
                    this.method4088(var12);
                    this.field2549[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4090(var12, (var14 << 7) + (this.field2554[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4090(var12, (this.field2554[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4076(var17, this.field2545[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4067(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4082(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4086();
            }
        }
    }

    @ObfuscatedName("hg.au(III)V")
    public void method4090(int arg0, int arg1) {
        this.field2554[arg0] = arg1;
        this.field2547[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hg.aq(Lho;I)I")
    public int method4091(class222 arg0) {
        int var2 = (arg0.field2574 * arg0.field2573 >> 12) + arg0.field2587;
        int var3 = ((this.field2544[arg0.field2586] - 8192) * this.field2551[arg0.field2586] >> 12) + var2;
        class219 var4 = arg0.field2567;
        if (var4.field2524 > 0 && (var4.field2527 > 0 || this.field2553[arg0.field2586] > 0)) {
            int var5 = var4.field2527 << 2;
            int var6 = var4.field2521 << 1;
            if (arg0.field2580 < var6) {
                var5 = arg0.field2580 * var5 / var6;
            }
            int var7 = (this.field2553[arg0.field2586] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2581 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2566.field1348 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1378 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hg.bs(Lho;I)I")
    public int method4092(class222 arg0) {
        class219 var2 = arg0.field2567;
        int var3 = this.field2552[arg0.field2586] * this.field2542[arg0.field2586] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2571 * var4 + 16384 >> 15;
        int var6 = this.field2538 * var5 + 128 >> 8;
        if (var2.field2523 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2575 * 1.953125E-5D * (double) var2.field2523) + 0.5D);
        }
        if (var2.field2522 != null) {
            int var7 = arg0.field2576;
            int var8 = var2.field2522[arg0.field2565 + 1];
            if (arg0.field2565 < var2.field2522.length - 2) {
                int var9 = (var2.field2522[arg0.field2565] & 0xFF) << 8;
                int var10 = (var2.field2522[arg0.field2565 + 2] & 0xFF) << 8;
                var8 += (var2.field2522[arg0.field2565 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2578 > 0 && var2.field2525 != null) {
            int var11 = arg0.field2578;
            int var12 = var2.field2525[arg0.field2579 + 1];
            if (arg0.field2579 < var2.field2525.length - 2) {
                int var13 = (var2.field2525[arg0.field2579] & 0xFF) << 8;
                int var14 = (var2.field2525[arg0.field2579 + 2] & 0xFF) << 8;
                var12 += (var2.field2525[arg0.field2579 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hg.bz(Lho;I)I")
    public int method4093(class222 arg0) {
        int var2 = this.field2537[arg0.field2586];
        return var2 < 8192 ? arg0.field2570 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2570) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hg.i()Ldz;")
    public synchronized class108 method2084() {
        return this.field2563;
    }

    @ObfuscatedName("hg.p()Ldz;")
    public synchronized class108 method2085() {
        return null;
    }

    @ObfuscatedName("hg.m()I")
    public synchronized int method2086() {
        return 0;
    }

    @ObfuscatedName("hg.d([III)V")
    public synchronized void method2087(int[] arg0, int arg1, int arg2) {
        if (this.field2557.method4180()) {
            int var4 = this.field2539 * this.field2557.field2589 / Statics.field1378;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2561;
                if (this.field2562 - var5 >= 0L) {
                    this.field2561 = var5;
                    break;
                }
                int var7 = (int) ((this.field2562 - this.field2561 + (long) var4 - 1L) / (long) var4);
                this.field2561 += (long) var4 * (long) var7;
                this.field2563.method2087(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4098();
            } while (this.field2557.method4180());
        }
        this.field2563.method2087(arg0, arg1, arg2);
    }

    @ObfuscatedName("hg.x(I)V")
    public synchronized void method2089(int arg0) {
        if (this.field2557.method4180()) {
            int var2 = this.field2539 * this.field2557.field2589 / Statics.field1378;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2561;
                if (this.field2562 - var3 >= 0L) {
                    this.field2561 = var3;
                    break;
                }
                int var5 = (int) ((this.field2562 - this.field2561 + (long) var2 - 1L) / (long) var2);
                this.field2561 += (long) var2 * (long) var5;
                this.field2563.method2089(var5);
                arg0 -= var5;
                this.method4098();
            } while (this.field2557.method4180());
        }
        this.field2563.method2089(arg0);
    }

    @ObfuscatedName("hg.ba(I)V")
    public void method4098() {
        int var1 = this.field2550;
        int var2 = this.field2560;
        long var3 = this.field2562;
        while (this.field2560 == var2) {
            while (this.field2557.field2592[var1] == var2) {
                this.field2557.method4219(var1);
                int var5 = this.field2557.method4189(var1);
                if (var5 == 1) {
                    this.field2557.method4187();
                    this.field2557.method4186(var1);
                    if (this.field2557.method4194()) {
                        if (!this.field2548 || var2 == 0) {
                            this.method4086();
                            this.field2557.method4233();
                            return;
                        }
                        this.field2557.method4185(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4125(var5);
                }
                this.field2557.method4188(var1);
                this.field2557.method4186(var1);
            }
            var1 = this.field2557.method4224();
            var2 = this.field2557.field2592[var1];
            var3 = this.field2557.method4192(var2);
        }
        this.field2550 = var1;
        this.field2560 = var2;
        this.field2562 = var3;
    }

    @ObfuscatedName("hg.bi(Lho;I)Z")
    public boolean method4096(class222 arg0) {
        if (arg0.field2582 != null) {
            return false;
        }
        if (arg0.field2578 >= 0) {
            arg0.method3952();
            if (arg0.field2584 > 0 && this.field2556[arg0.field2586][arg0.field2584] == arg0) {
                this.field2556[arg0.field2586][arg0.field2584] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hg.bp(Lho;[IIII)Z")
    public boolean method4161(class222 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2577 = Statics.field1378 / 100;
        if (arg0.field2578 >= 0 && arg0.field2582 == null || arg0.field2582.method2326()) {
            arg0.method4176();
            arg0.method3952();
            if (arg0.field2584 > 0 && this.field2556[arg0.field2586][arg0.field2584] == arg0) {
                this.field2556[arg0.field2586][arg0.field2584] = null;
            }
            return true;
        }
        int var5 = arg0.field2574;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2559[arg0.field2586] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2574 = var6;
        }
        arg0.field2582.method2321(this.method4091(arg0));
        class219 var7 = arg0.field2567;
        boolean var8 = false;
        arg0.field2580++;
        arg0.field2581 += var7.field2524;
        double var9 = (double) ((arg0.field2569 - 60 << 8) + (arg0.field2574 * arg0.field2573 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2523 > 0) {
            if (var7.field2526 > 0) {
                arg0.field2575 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2526 * var9) + 0.5D);
            } else {
                arg0.field2575 += 128;
            }
        }
        if (var7.field2522 != null) {
            if (var7.field2529 > 0) {
                arg0.field2576 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2529 * var9) + 0.5D);
            } else {
                arg0.field2576 += 128;
            }
            while (arg0.field2565 < var7.field2522.length - 2 && arg0.field2576 > (var7.field2522[arg0.field2565 + 2] & 0xFF) << 8) {
                arg0.field2565 += 2;
            }
            if (arg0.field2565 == var7.field2522.length - 2 && var7.field2522[arg0.field2565 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2578 >= 0 && var7.field2525 != null && (this.field2549[arg0.field2586] & 0x1) == 0 && (arg0.field2584 < 0 || this.field2556[arg0.field2586][arg0.field2584] != arg0)) {
            if (var7.field2528 > 0) {
                arg0.field2578 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2528 * var9) + 0.5D);
            } else {
                arg0.field2578 += 128;
            }
            while (arg0.field2579 < var7.field2525.length - 2 && arg0.field2578 > (var7.field2525[arg0.field2579 + 2] & 0xFF) << 8) {
                arg0.field2579 += 2;
            }
            if (arg0.field2579 == var7.field2525.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2582.method2322(arg0.field2577, this.method4092(arg0), this.method4093(arg0));
            return false;
        }
        arg0.field2582.method2323(arg0.field2577);
        if (arg1 == null) {
            arg0.field2582.method2089(arg3);
        } else {
            arg0.field2582.method2087(arg1, arg2, arg3);
        }
        if (arg0.field2582.method2327()) {
            this.field2563.field2618.method2082(arg0.field2582);
        }
        arg0.method4176();
        if (arg0.field2578 >= 0) {
            arg0.method3952();
            if (arg0.field2584 > 0 && this.field2556[arg0.field2586][arg0.field2584] == arg0) {
                this.field2556[arg0.field2586][arg0.field2584] = null;
            }
        }
        return true;
    }
}
