package deob;

@ObfuscatedName("hf")
public class class212 extends class119 {

    @ObfuscatedName("hf.d")
    public class198 field2603 = new class198(128);

    @ObfuscatedName("hf.x")
    public int field2612 = 256;

    @ObfuscatedName("hf.k")
    public int field2618 = 1000000;

    @ObfuscatedName("hf.z")
    public int[] field2604 = new int[16];

    @ObfuscatedName("hf.v")
    public int[] field2605 = new int[16];

    @ObfuscatedName("hf.m")
    public int[] field2602 = new int[16];

    @ObfuscatedName("hf.b")
    public int[] field2622 = new int[16];

    @ObfuscatedName("hf.t")
    public int[] field2608 = new int[16];

    @ObfuscatedName("hf.p")
    public int[] field2610 = new int[16];

    @ObfuscatedName("hf.r")
    public int[] field2616 = new int[16];

    @ObfuscatedName("hf.l")
    public int[] field2611 = new int[16];

    @ObfuscatedName("hf.u")
    public int[] field2609 = new int[16];

    @ObfuscatedName("hf.q")
    public int[] field2613 = new int[16];

    @ObfuscatedName("hf.h")
    public int[] field2614 = new int[16];

    @ObfuscatedName("hf.i")
    public int[] field2615 = new int[16];

    @ObfuscatedName("hf.o")
    public int[] field2607 = new int[16];

    @ObfuscatedName("hf.w")
    public int[] field2617 = new int[16];

    @ObfuscatedName("hf.g")
    public int[] field2625 = new int[16];

    @ObfuscatedName("hf.a")
    public class213[][] field2619 = new class213[16][128];

    @ObfuscatedName("hf.ah")
    public class213[][] field2620 = new class213[16][128];

    @ObfuscatedName("hf.ak")
    public class214 field2621 = new class214();

    @ObfuscatedName("hf.aa")
    public boolean field2606;

    @ObfuscatedName("hf.ax")
    public int field2623;

    @ObfuscatedName("hf.aq")
    public int field2624;

    @ObfuscatedName("hf.au")
    public long field2601;

    @ObfuscatedName("hf.al")
    public long field2626;

    @ObfuscatedName("hf.ae")
    public class216 field2627 = new class216(this);

    public class212() {
        this.method3603();
    }

    @ObfuscatedName("hf.d(II)V")
    public synchronized void method3587(int arg0) {
        this.field2612 = arg0;
    }

    @ObfuscatedName("hf.x(I)I")
    public int method3620() {
        return this.field2612;
    }

    @ObfuscatedName("hf.k(Lht;Lid;Lds;II)Z")
    public synchronized boolean method3589(class217 arg0, class243 arg1, class112 arg2, int arg3) {
        arg0.method3774();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class207 var7 = (class207) arg0.field2681.method3437(); var7 != null; var7 = (class207) arg0.field2681.method3433()) {
            int var8 = (int) var7.field2564;
            class215 var9 = (class215) this.field2603.method3438((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3941(var8);
                class215 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class215(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2603.method3431(var11, (long) var8);
            }
            if (!var9.method3753(arg2, var7.field2580, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3771();
        }
        return var5;
    }

    @ObfuscatedName("hf.z(B)V")
    public synchronized void method3593() {
        for (class215 var1 = (class215) this.field2603.method3437(); var1 != null; var1 = (class215) this.field2603.method3433()) {
            var1.method3758();
        }
    }

    @ObfuscatedName("hf.v(I)V")
    public synchronized void method3622() {
        for (class215 var1 = (class215) this.field2603.method3437(); var1 != null; var1 = (class215) this.field2603.method3433()) {
            var1.method3475();
        }
    }

    @ObfuscatedName("hf.r(Lht;ZI)V")
    public synchronized void method3614(class217 arg0, boolean arg1) {
        this.method3592();
        this.field2621.method3697(arg0.field2680);
        this.field2606 = arg1;
        this.field2601 = 0L;
        int var3 = this.field2621.method3700();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2621.method3701(var4);
            this.field2621.method3704(var4);
            this.field2621.method3711(var4);
        }
        this.field2623 = this.field2621.method3734();
        this.field2624 = this.field2621.field2656[this.field2623];
        this.field2626 = this.field2621.method3708(this.field2624);
    }

    @ObfuscatedName("hf.u(I)V")
    public synchronized void method3592() {
        this.field2621.method3698();
        this.method3603();
    }

    @ObfuscatedName("hf.c(S)Z")
    public synchronized boolean method3662() {
        return this.field2621.method3699();
    }

    @ObfuscatedName("hf.j(III)V")
    public synchronized void method3594(int arg0, int arg1) {
        this.method3668(arg0, arg1);
    }

    @ObfuscatedName("hf.f(III)V")
    public void method3668(int arg0, int arg1) {
        this.field2622[arg0] = arg1;
        this.field2610[arg0] = arg1 & 0xFFFFFF80;
        this.method3653(arg0, arg1);
    }

    @ObfuscatedName("hf.s(IIB)V")
    public void method3653(int arg0, int arg1) {
        if (this.field2608[arg0] != arg1) {
            this.field2608[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2620[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hf.e(IIII)V")
    public void method3660(int arg0, int arg1, int arg2) {
        this.method3586(arg0, arg1, 64);
        if ((this.field2613[arg0] & 0x2) != 0) {
            for (class213 var4 = (class213) this.field2627.field2677.method3487(); var4 != null; var4 = (class213) this.field2627.field2677.method3489()) {
                if (var4.field2648 == arg0 && var4.field2649 < 0) {
                    this.field2619[arg0][var4.field2635] = null;
                    this.field2619[arg0][arg1] = var4;
                    int var5 = (var4.field2640 * var4.field2639 >> 12) + var4.field2638;
                    var4.field2638 += arg1 - var4.field2635 << 8;
                    var4.field2639 = var5 - var4.field2638;
                    var4.field2640 = 4096;
                    var4.field2635 = arg1;
                    return;
                }
            }
        }
        class215 var6 = (class215) this.field2603.method3438((long) this.field2608[arg0]);
        if (var6 == null) {
            return;
        }
        class107 var7 = var6.field2667[arg1];
        if (var7 == null) {
            return;
        }
        class213 var8 = new class213();
        var8.field2648 = arg0;
        var8.field2645 = var6;
        var8.field2631 = var7;
        var8.field2633 = var6.field2671[arg1];
        var8.field2634 = var6.field2672[arg1];
        var8.field2635 = arg1;
        var8.field2636 = var6.field2669 * arg2 * arg2 * var6.field2670[arg1] + 1024 >> 11;
        var8.field2637 = var6.field2666[arg1] & 0xFF;
        var8.field2638 = (arg1 << 8) - (var6.field2668[arg1] & 0x7FFF);
        var8.field2644 = 0;
        var8.field2642 = 0;
        var8.field2643 = 0;
        var8.field2649 = -1;
        var8.field2630 = 0;
        if (this.field2607[arg0] == 0) {
            var8.field2632 = class117.method2055(var7, this.method3608(var8), this.method3609(var8), this.method3610(var8));
        } else {
            var8.field2632 = class117.method2055(var7, this.method3608(var8), 0, this.method3610(var8));
            this.method3596(var8, var6.field2668[arg1] < 0);
        }
        if (var6.field2668[arg1] < 0) {
            var8.field2632.method2057(-1);
        }
        if (var8.field2634 >= 0) {
            class213 var9 = this.field2620[arg0][var8.field2634];
            if (var9 != null && var9.field2649 < 0) {
                this.field2619[arg0][var9.field2635] = null;
                var9.field2649 = 0;
            }
            this.field2620[arg0][var8.field2634] = var8;
        }
        this.field2627.field2677.method3502(var8);
        this.field2619[arg0][arg1] = var8;
    }

    @ObfuscatedName("hf.q(Lha;ZB)V")
    public void method3596(class213 arg0, boolean arg1) {
        int var3 = arg0.field2631.field1528.length;
        int var5;
        if (arg1 && arg0.field2631.field1531) {
            int var4 = var3 + var3 - arg0.field2631.field1530;
            var5 = (int) ((long) this.field2607[arg0.field2648] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2632.method2064(true);
            }
        } else {
            var5 = (int) ((long) this.field2607[arg0.field2648] * (long) var3 >> 6);
        }
        arg0.field2632.method2063(var5);
    }

    @ObfuscatedName("hf.h(IIII)V")
    public void method3586(int arg0, int arg1, int arg2) {
        class213 var4 = this.field2619[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2619[arg0][arg1] = null;
        if ((this.field2613[arg0] & 0x2) == 0) {
            var4.field2649 = 0;
            return;
        }
        for (class213 var5 = (class213) this.field2627.field2677.method3500(); var5 != null; var5 = (class213) this.field2627.field2677.method3511()) {
            if (var4.field2648 == var5.field2648 && var5.field2649 < 0 && var4 != var5) {
                var4.field2649 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hf.i(IIIB)V")
    public void method3591(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hf.o(III)V")
    public void method3616(int arg0, int arg1) {
    }

    @ObfuscatedName("hf.w(III)V")
    public void method3655(int arg0, int arg1) {
        this.field2616[arg0] = arg1;
    }

    @ObfuscatedName("hf.ah(II)V")
    public void method3600(int arg0) {
        for (class213 var2 = (class213) this.field2627.field2677.method3500(); var2 != null; var2 = (class213) this.field2627.field2677.method3511()) {
            if (arg0 < 0 || var2.field2648 == arg0) {
                if (var2.field2632 != null) {
                    var2.field2632.method2056(Statics.field1546 / 100);
                    if (var2.field2632.method2110()) {
                        this.field2627.field2678.method1805(var2.field2632);
                    }
                    var2.method3691();
                }
                if (var2.field2649 < 0) {
                    this.field2619[var2.field2648][var2.field2635] = null;
                }
                var2.method3475();
            }
        }
    }

    @ObfuscatedName("hf.an(II)V")
    public void method3669(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3669(var2);
            }
            return;
        }
        this.field2604[arg0] = 12800;
        this.field2605[arg0] = 8192;
        this.field2602[arg0] = 16383;
        this.field2616[arg0] = 8192;
        this.field2611[arg0] = 0;
        this.field2609[arg0] = 8192;
        this.method3604(arg0);
        this.method3605(arg0);
        this.field2613[arg0] = 0;
        this.field2614[arg0] = 32767;
        this.field2615[arg0] = 256;
        this.field2607[arg0] = 0;
        this.method3607(arg0, 8192);
    }

    @ObfuscatedName("hf.ai(II)V")
    public void method3602(int arg0) {
        for (class213 var2 = (class213) this.field2627.field2677.method3500(); var2 != null; var2 = (class213) this.field2627.field2677.method3511()) {
            if ((arg0 < 0 || var2.field2648 == arg0) && var2.field2649 < 0) {
                this.field2619[var2.field2648][var2.field2635] = null;
                var2.field2649 = 0;
            }
        }
    }

    @ObfuscatedName("hf.ar(I)V")
    public void method3603() {
        this.method3600(-1);
        this.method3669(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2608[var1] = this.field2622[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2610[var2] = this.field2622[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hf.ac(II)V")
    public void method3604(int arg0) {
        if ((this.field2613[arg0] & 0x2) == 0) {
            return;
        }
        for (class213 var2 = (class213) this.field2627.field2677.method3500(); var2 != null; var2 = (class213) this.field2627.field2677.method3511()) {
            if (var2.field2648 == arg0 && this.field2619[arg0][var2.field2635] == null && var2.field2649 < 0) {
                var2.field2649 = 0;
            }
        }
    }

    @ObfuscatedName("hf.af(II)V")
    public void method3605(int arg0) {
        if ((this.field2613[arg0] & 0x4) == 0) {
            return;
        }
        for (class213 var2 = (class213) this.field2627.field2677.method3500(); var2 != null; var2 = (class213) this.field2627.field2677.method3511()) {
            if (var2.field2648 == arg0) {
                var2.field2650 = 0;
            }
        }
    }

    @ObfuscatedName("hf.ao(IS)V")
    public void method3606(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3586(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3660(var6, var7, var8);
            } else {
                this.method3586(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3591(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2610[var12] = (var14 << 14) + (this.field2610[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2610[var12] = (var14 << 7) + (this.field2610[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2611[var12] = (var14 << 7) + (this.field2611[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2611[var12] = (this.field2611[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2609[var12] = (var14 << 7) + (this.field2609[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2609[var12] = (this.field2609[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2604[var12] = (var14 << 7) + (this.field2604[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2604[var12] = (this.field2604[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2605[var12] = (var14 << 7) + (this.field2605[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2605[var12] = (this.field2605[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2602[var12] = (var14 << 7) + (this.field2602[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2602[var12] = (this.field2602[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2613[var12] |= 0x1;
                } else {
                    this.field2613[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2613[var12] |= 0x2;
                } else {
                    this.method3604(var12);
                    this.field2613[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2614[var12] = (var14 << 7) + (this.field2614[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2614[var12] = (this.field2614[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2614[var12] = (var14 << 7) + (this.field2614[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2614[var12] = (this.field2614[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3600(var12);
            }
            if (var13 == 121) {
                this.method3669(var12);
            }
            if (var13 == 123) {
                this.method3602(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2614[var12];
                if (var15 == 16384) {
                    this.field2615[var12] = (var14 << 7) + (this.field2615[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2614[var12];
                if (var16 == 16384) {
                    this.field2615[var12] = (this.field2615[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2607[var12] = (var14 << 7) + (this.field2607[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2607[var12] = (this.field2607[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2613[var12] |= 0x4;
                } else {
                    this.method3605(var12);
                    this.field2613[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3607(var12, (var14 << 7) + (this.field2617[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3607(var12, (this.field2617[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3653(var17, this.field2610[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3616(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3655(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3603();
            }
        }
    }

    @ObfuscatedName("hf.ab(III)V")
    public void method3607(int arg0, int arg1) {
        this.field2617[arg0] = arg1;
        this.field2625[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hf.az(Lha;I)I")
    public int method3608(class213 arg0) {
        int var2 = (arg0.field2640 * arg0.field2639 >> 12) + arg0.field2638;
        int var3 = ((this.field2616[arg0.field2648] - 8192) * this.field2615[arg0.field2648] >> 12) + var2;
        class210 var4 = arg0.field2633;
        if (var4.field2592 > 0 && (var4.field2591 > 0 || this.field2611[arg0.field2648] > 0)) {
            int var5 = var4.field2591 << 2;
            int var6 = var4.field2587 << 1;
            if (arg0.field2646 < var6) {
                var5 = arg0.field2646 * var5 / var6;
            }
            int var7 = (this.field2611[arg0.field2648] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2647 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2631.field1532 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1546 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hf.at(Lha;I)I")
    public int method3609(class213 arg0) {
        class210 var2 = arg0.field2633;
        int var3 = this.field2604[arg0.field2648] * this.field2602[arg0.field2648] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2636 * var4 + 16384 >> 15;
        int var6 = this.field2612 * var5 + 128 >> 8;
        if (var2.field2594 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2644 * 1.953125E-5D * (double) var2.field2594) + 0.5D);
        }
        if (var2.field2589 != null) {
            int var7 = arg0.field2642;
            int var8 = var2.field2589[arg0.field2643 + 1];
            if (arg0.field2643 < var2.field2589.length - 2) {
                int var9 = (var2.field2589[arg0.field2643] & 0xFF) << 8;
                int var10 = (var2.field2589[arg0.field2643 + 2] & 0xFF) << 8;
                var8 += (var2.field2589[arg0.field2643 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2649 > 0 && var2.field2586 != null) {
            int var11 = arg0.field2649;
            int var12 = var2.field2586[arg0.field2630 + 1];
            if (arg0.field2630 < var2.field2586.length - 2) {
                int var13 = (var2.field2586[arg0.field2630] & 0xFF) << 8;
                int var14 = (var2.field2586[arg0.field2630 + 2] & 0xFF) << 8;
                var12 += (var2.field2586[arg0.field2630 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hf.bj(Lha;I)I")
    public int method3610(class213 arg0) {
        int var2 = this.field2605[arg0.field2648];
        return var2 < 8192 ? arg0.field2637 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2637) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hf.m()Ldn;")
    public synchronized class119 method1834() {
        return this.field2627;
    }

    @ObfuscatedName("hf.b()Ldn;")
    public synchronized class119 method1811() {
        return null;
    }

    @ObfuscatedName("hf.t()I")
    public synchronized int method1812() {
        return 0;
    }

    @ObfuscatedName("hf.p([III)V")
    public synchronized void method1813(int[] arg0, int arg1, int arg2) {
        if (this.field2621.method3699()) {
            int var4 = this.field2618 * this.field2621.field2653 / Statics.field1546;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2601;
                if (this.field2626 - var5 >= 0L) {
                    this.field2601 = var5;
                    break;
                }
                int var7 = (int) ((this.field2626 - this.field2601 + (long) var4 - 1L) / (long) var4);
                this.field2601 += (long) var4 * (long) var7;
                this.field2627.method1813(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3612();
            } while (this.field2621.method3699());
        }
        this.field2627.method1813(arg0, arg1, arg2);
    }

    @ObfuscatedName("hf.l(I)V")
    public synchronized void method1815(int arg0) {
        if (this.field2621.method3699()) {
            int var2 = this.field2618 * this.field2621.field2653 / Statics.field1546;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2601;
                if (this.field2626 - var3 >= 0L) {
                    this.field2601 = var3;
                    break;
                }
                int var5 = (int) ((this.field2626 - this.field2601 + (long) var2 - 1L) / (long) var2);
                this.field2601 += (long) var2 * (long) var5;
                this.field2627.method1815(var5);
                arg0 -= var5;
                this.method3612();
            } while (this.field2621.method3699());
        }
        this.field2627.method1815(arg0);
    }

    @ObfuscatedName("hf.bq(I)V")
    public void method3612() {
        int var1 = this.field2623;
        int var2 = this.field2624;
        long var3 = this.field2626;
        while (this.field2624 == var2) {
            while (this.field2621.field2656[var1] == var2) {
                this.field2621.method3701(var1);
                int var5 = this.field2621.method3725(var1);
                if (var5 == 1) {
                    this.field2621.method3720();
                    this.field2621.method3711(var1);
                    if (this.field2621.method3723()) {
                        if (!this.field2606 || var2 == 0) {
                            this.method3603();
                            this.field2621.method3698();
                            return;
                        }
                        this.field2621.method3709(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3606(var5);
                }
                this.field2621.method3704(var1);
                this.field2621.method3711(var1);
            }
            var1 = this.field2621.method3734();
            var2 = this.field2621.field2656[var1];
            var3 = this.field2621.method3708(var2);
        }
        this.field2623 = var1;
        this.field2624 = var2;
        this.field2626 = var3;
    }

    @ObfuscatedName("hf.bo(Lha;S)Z")
    public boolean method3672(class213 arg0) {
        if (arg0.field2632 != null) {
            return false;
        }
        if (arg0.field2649 >= 0) {
            arg0.method3475();
            if (arg0.field2634 > 0 && this.field2620[arg0.field2648][arg0.field2634] == arg0) {
                this.field2620[arg0.field2648][arg0.field2634] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hf.bk(Lha;[IIII)Z")
    public boolean method3601(class213 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2641 = Statics.field1546 / 100;
        if (arg0.field2649 >= 0 && arg0.field2632 == null || arg0.field2632.method2071()) {
            arg0.method3691();
            arg0.method3475();
            if (arg0.field2634 > 0 && this.field2620[arg0.field2648][arg0.field2634] == arg0) {
                this.field2620[arg0.field2648][arg0.field2634] = null;
            }
            return true;
        }
        int var5 = arg0.field2640;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2609[arg0.field2648] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2640 = var6;
        }
        arg0.field2632.method2069(this.method3608(arg0));
        class210 var7 = arg0.field2633;
        boolean var8 = false;
        arg0.field2646++;
        arg0.field2647 += var7.field2592;
        double var9 = (double) ((arg0.field2635 - 60 << 8) + (arg0.field2640 * arg0.field2639 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2594 > 0) {
            if (var7.field2590 > 0) {
                arg0.field2644 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2590 * var9) + 0.5D);
            } else {
                arg0.field2644 += 128;
            }
        }
        if (var7.field2589 != null) {
            if (var7.field2593 > 0) {
                arg0.field2642 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2593 * var9) + 0.5D);
            } else {
                arg0.field2642 += 128;
            }
            while (arg0.field2643 < var7.field2589.length - 2 && arg0.field2642 > (var7.field2589[arg0.field2643 + 2] & 0xFF) << 8) {
                arg0.field2643 += 2;
            }
            if (arg0.field2643 == var7.field2589.length - 2 && var7.field2589[arg0.field2643 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2649 >= 0 && var7.field2586 != null && (this.field2613[arg0.field2648] & 0x1) == 0 && (arg0.field2634 < 0 || this.field2620[arg0.field2648][arg0.field2634] != arg0)) {
            if (var7.field2588 > 0) {
                arg0.field2649 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2588 * var9) + 0.5D);
            } else {
                arg0.field2649 += 128;
            }
            while (arg0.field2630 < var7.field2586.length - 2 && arg0.field2649 > (var7.field2586[arg0.field2630 + 2] & 0xFF) << 8) {
                arg0.field2630 += 2;
            }
            if (arg0.field2630 == var7.field2586.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2632.method2124(arg0.field2641, this.method3609(arg0), this.method3610(arg0));
            return false;
        }
        arg0.field2632.method2056(arg0.field2641);
        if (arg1 == null) {
            arg0.field2632.method1815(arg3);
        } else {
            arg0.field2632.method1813(arg1, arg2, arg3);
        }
        if (arg0.field2632.method2110()) {
            this.field2627.field2678.method1805(arg0.field2632);
        }
        arg0.method3691();
        if (arg0.field2649 >= 0) {
            arg0.method3475();
            if (arg0.field2634 > 0 && this.field2620[arg0.field2648][arg0.field2634] == arg0) {
                this.field2620[arg0.field2648][arg0.field2634] = null;
            }
        }
        return true;
    }
}
