package deob;

@ObfuscatedName("eu")
public class class57 extends class183 {

    @ObfuscatedName("eu.f")
    public int[] field607 = new int[16];

    @ObfuscatedName("eu.g")
    public int[] field596 = new int[16];

    @ObfuscatedName("eu.d")
    public int[] field590 = new int[16];

    @ObfuscatedName("eu.b")
    public class3 field598 = new class3(128);

    @ObfuscatedName("eu.c")
    public int[] field599 = new int[16];

    @ObfuscatedName("eu.a")
    public int[] field601 = new int[16];

    @ObfuscatedName("eu.o")
    public int[] field600 = new int[16];

    @ObfuscatedName("eu.l")
    public int[] field591 = new int[16];

    @ObfuscatedName("eu.m")
    public int[] field610 = new int[16];

    @ObfuscatedName("eu.j")
    public int[] field594 = new int[16];

    @ObfuscatedName("eu.k")
    public int field592 = 1000000;

    @ObfuscatedName("eu.h")
    public int field614 = 256;

    @ObfuscatedName("eu.v")
    public class63[][] field605 = new class63[16][128];

    @ObfuscatedName("eu.u")
    public int[] field588 = new int[16];

    @ObfuscatedName("eu.t")
    public int[] field589 = new int[16];

    @ObfuscatedName("eu.s")
    public int[] field593 = new int[16];

    @ObfuscatedName("eu.p")
    public int[] field602 = new int[16];

    @ObfuscatedName("eu.y")
    public int[] field587 = new int[16];

    @ObfuscatedName("eu.x")
    public int[] field595 = new int[16];

    @ObfuscatedName("eu.ar")
    public long field603;

    @ObfuscatedName("eu.aq")
    public int field609;

    @ObfuscatedName("eu.ax")
    public class55 field586 = new class55();

    @ObfuscatedName("eu.aw")
    public boolean field608;

    @ObfuscatedName("eu.ak")
    public int field612;

    @ObfuscatedName("eu.ai")
    public class95 field613 = new class95(this);

    @ObfuscatedName("eu.ac")
    public class63[][] field606 = new class63[16][128];

    @ObfuscatedName("eu.ab")
    public long field611;

    @ObfuscatedName("eu.h(I)I")
    public int method964() {
        return this.field614;
    }

    @ObfuscatedName("eu.w(Lem;Lek;Lbn;II)Z")
    public synchronized boolean method965(class98 arg0, class89 arg1, class117 arg2, int arg3) {
        arg0.method1404();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class21 var7 = (class21) arg0.field1372.method16(); var7 != null; var7 = (class21) arg0.field1372.method17()) {
            int var8 = (int) var7.field213;
            class87 var9 = (class87) this.field598.method20((long) var8);
            if (var9 == null) {
                var9 = class87.method1150(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field598.method14(var9, (long) var8);
            }
            if (!var9.method1223(arg2, var7.field225, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method1405();
        }
        return var5;
    }

    @ObfuscatedName("eu.t(I)V")
    public synchronized void method966() {
        for (class87 var1 = (class87) this.field598.method16(); var1 != null; var1 = (class87) this.field598.method17()) {
            var1.method1226();
        }
    }

    @ObfuscatedName("eu.ax(IB)V")
    public void method969(int arg0) {
        if ((this.field588[arg0] & 0x2) == 0) {
            return;
        }
        for (class63 var2 = (class63) this.field613.field1322.method212(); var2 != null; var2 = (class63) this.field613.field1322.method201()) {
            if (var2.field686 == arg0 && this.field605[arg0][var2.field684] == null && var2.field693 < 0) {
                var2.field693 = 0;
            }
        }
    }

    @ObfuscatedName("eu.s(B)Z")
    public synchronized boolean method970() {
        return this.field586.method935();
    }

    @ObfuscatedName("eu.j(III)V")
    public synchronized void method971(int arg0, int arg1) {
        this.method972(arg0, arg1);
    }

    @ObfuscatedName("eu.x(IIB)V")
    public void method972(int arg0, int arg1) {
        this.field607[arg0] = arg1;
        this.field594[arg0] = arg1 & 0xFFFFFF80;
        this.method973(arg0, arg1);
    }

    @ObfuscatedName("eu.g(III)V")
    public void method973(int arg0, int arg1) {
        if (this.field593[arg0] != arg1) {
            this.field593[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field606[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eu.o(IIIB)V")
    public void method974(int arg0, int arg1, int arg2) {
        this.method1073(arg0, arg1, 64);
        if ((this.field588[arg0] & 0x2) != 0) {
            for (class63 var4 = (class63) this.field613.field1322.method200(); var4 != null; var4 = (class63) this.field613.field1322.method202()) {
                if (var4.field686 == arg0 && var4.field693 < 0) {
                    this.field605[arg0][var4.field684] = null;
                    this.field605[arg0][arg1] = var4;
                    int var5 = (var4.field689 * var4.field688 >> 12) + var4.field690;
                    var4.field690 += arg1 - var4.field684 << 8;
                    var4.field688 = var5 - var4.field690;
                    var4.field689 = 4096;
                    var4.field684 = arg1;
                    return;
                }
            }
        }
        class87 var6 = (class87) this.field598.method20((long) this.field593[arg0]);
        if (var6 == null) {
            return;
        }
        class120 var7 = var6.field1228[arg1];
        if (var7 == null) {
            return;
        }
        class63 var8 = new class63();
        var8.field686 = arg0;
        var8.field700 = var6;
        var8.field681 = var7;
        var8.field682 = var6.field1227[arg1];
        var8.field683 = var6.field1231[arg1];
        var8.field684 = arg1;
        var8.field691 = var6.field1230 * arg2 * arg2 * var6.field1225[arg1] + 1024 >> 11;
        var8.field687 = var6.field1229[arg1] & 0xFF;
        var8.field690 = (arg1 << 8) - (var6.field1226[arg1] & 0x7FFF);
        var8.field685 = 0;
        var8.field680 = 0;
        var8.field692 = 0;
        var8.field693 = -1;
        var8.field694 = 0;
        if (this.field602[arg0] == 0) {
            var8.field697 = class181.method3157(var7, this.method988(var8), this.method989(var8), this.method990(var8));
        } else {
            var8.field697 = class181.method3157(var7, this.method988(var8), 0, this.method990(var8));
            this.method975(var8, var6.field1226[arg1] < 0);
        }
        if (var6.field1226[arg1] < 0) {
            var8.field697.method3238(-1);
        }
        if (var8.field683 >= 0) {
            class63 var9 = this.field606[arg0][var8.field683];
            if (var9 != null && var9.field693 < 0) {
                this.field605[arg0][var9.field684] = null;
                var9.field693 = 0;
            }
            this.field606[arg0][var8.field683] = var8;
        }
        this.field613.field1322.method219(var8);
        this.field605[arg0][arg1] = var8;
    }

    @ObfuscatedName("eu.e(Ley;ZI)V")
    public void method975(class63 arg0, boolean arg1) {
        int var3 = arg0.field681.field1942.length;
        int var5;
        if (arg1 && arg0.field681.field1943) {
            int var4 = var3 + var3 - arg0.field681.field1941;
            var5 = (int) ((long) this.field602[arg0.field686] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field697.method3164(true);
            }
        } else {
            var5 = (int) ((long) this.field602[arg0.field686] * (long) var3 >> 6);
        }
        arg0.field697.method3173(var5);
    }

    @ObfuscatedName("eu.c()I")
    public synchronized int method976() {
        return 0;
    }

    @ObfuscatedName("eu.z(IIII)V")
    public void method977(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eu.i(III)V")
    public void method978(int arg0, int arg1) {
    }

    @ObfuscatedName("eu.b(II)V")
    public synchronized void method979(int arg0) {
        this.field614 = arg0;
    }

    @ObfuscatedName("eu.n(IB)V")
    public void method980(int arg0) {
        for (class63 var2 = (class63) this.field613.field1322.method212(); var2 != null; var2 = (class63) this.field613.field1322.method201()) {
            if (arg0 < 0 || var2.field686 == arg0) {
                if (var2.field697 != null) {
                    var2.field697.method3168(Statics.field2840 / 100);
                    if (var2.field697.method3172()) {
                        this.field613.field1324.method2799(var2.field697);
                    }
                    var2.method1102();
                }
                if (var2.field693 < 0) {
                    this.field605[var2.field686][var2.field684] = null;
                }
                var2.method234();
            }
        }
    }

    @ObfuscatedName("eu.y(IB)V")
    public void method982(int arg0) {
        for (class63 var2 = (class63) this.field613.field1322.method212(); var2 != null; var2 = (class63) this.field613.field1322.method201()) {
            if ((arg0 < 0 || var2.field686 == arg0) && var2.field693 < 0) {
                this.field605[var2.field686][var2.field684] = null;
                var2.field693 = 0;
            }
        }
    }

    @ObfuscatedName("eu.a(B)V")
    public void method983() {
        this.method980(-1);
        this.method1003(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field593[var1] = this.field607[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field594[var2] = this.field607[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eu.aw(II)V")
    public void method985(int arg0) {
        if ((this.field588[arg0] & 0x4) == 0) {
            return;
        }
        for (class63 var2 = (class63) this.field613.field1322.method212(); var2 != null; var2 = (class63) this.field613.field1322.method201()) {
            if (var2.field686 == arg0) {
                var2.field699 = 0;
            }
        }
    }

    @ObfuscatedName("eu.aq(II)V")
    public void method986(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method1073(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method974(var6, var7, var8);
            } else {
                this.method1073(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method977(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field594[var12] = (var14 << 14) + (this.field594[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field594[var12] = (var14 << 7) + (this.field594[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field596[var12] = (var14 << 7) + (this.field596[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field596[var12] = (this.field596[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field600[var12] = (var14 << 7) + (this.field600[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field600[var12] = (this.field600[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field589[var12] = (var14 << 7) + (this.field589[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field589[var12] = (this.field589[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field590[var12] = (var14 << 7) + (this.field590[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field590[var12] = (this.field590[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field591[var12] = (var14 << 7) + (this.field591[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field591[var12] = (this.field591[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field588[var12] |= 0x1;
                } else {
                    this.field588[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field588[var12] |= 0x2;
                } else {
                    this.method969(var12);
                    this.field588[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field587[var12] = (var14 << 7) + (this.field587[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field587[var12] = (this.field587[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field587[var12] = (var14 << 7) + (this.field587[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field587[var12] = (this.field587[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method980(var12);
            }
            if (var13 == 121) {
                this.method1003(var12);
            }
            if (var13 == 123) {
                this.method982(var12);
            }
            if (var13 == 6) {
                int var15 = this.field587[var12];
                if (var15 == 16384) {
                    this.field601[var12] = (var14 << 7) + (this.field601[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field587[var12];
                if (var16 == 16384) {
                    this.field601[var12] = (this.field601[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field602[var12] = (var14 << 7) + (this.field602[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field602[var12] = (this.field602[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field588[var12] |= 0x4;
                } else {
                    this.method985(var12);
                    this.field588[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method1069(var12, (var14 << 7) + (this.field610[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method1069(var12, (this.field610[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method973(var17, this.field594[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method978(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method1046(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method983();
            }
        }
    }

    @ObfuscatedName("eu.ab(Ley;I)I")
    public int method988(class63 arg0) {
        int var2 = (arg0.field689 * arg0.field688 >> 12) + arg0.field690;
        int var3 = ((this.field595[arg0.field686] - 8192) * this.field601[arg0.field686] >> 12) + var2;
        class33 var4 = arg0.field682;
        if (var4.field413 > 0 && (var4.field410 > 0 || this.field596[arg0.field686] > 0)) {
            int var5 = var4.field410 << 2;
            int var6 = var4.field417 << 1;
            if (arg0.field679 < var6) {
                var5 = arg0.field679 * var5 / var6;
            }
            int var7 = (this.field596[arg0.field686] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field696 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field681.field1939 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2840 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eu.ar(Ley;I)I")
    public int method989(class63 arg0) {
        class33 var2 = arg0.field682;
        int var3 = this.field589[arg0.field686] * this.field591[arg0.field686] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field691 * var4 + 16384 >> 15;
        int var6 = this.field614 * var5 + 128 >> 8;
        if (var2.field411 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field685 * 1.953125E-5D * (double) var2.field411) + 0.5D);
        }
        if (var2.field420 != null) {
            int var7 = arg0.field680;
            int var8 = var2.field420[arg0.field692 + 1];
            if (arg0.field692 < var2.field420.length - 2) {
                int var9 = (var2.field420[arg0.field692] & 0xFF) << 8;
                int var10 = (var2.field420[arg0.field692 + 2] & 0xFF) << 8;
                var8 += (var2.field420[arg0.field692 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field693 > 0 && var2.field422 != null) {
            int var11 = arg0.field693;
            int var12 = var2.field422[arg0.field694 + 1];
            if (arg0.field694 < var2.field422.length - 2) {
                int var13 = (var2.field422[arg0.field694] & 0xFF) << 8;
                int var14 = (var2.field422[arg0.field694 + 2] & 0xFF) << 8;
                var12 += (var2.field422[arg0.field694 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eu.ai(Ley;I)I")
    public int method990(class63 arg0) {
        int var2 = this.field590[arg0.field686];
        return var2 < 8192 ? arg0.field687 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field687) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eu.m()Lag;")
    public synchronized class183 method992() {
        return null;
    }

    @ObfuscatedName("eu.ac(I)V")
    public synchronized void method995(int arg0) {
        if (this.field586.method935()) {
            int var2 = this.field592 * this.field586.field567 / Statics.field2840;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field611;
                if (this.field603 - var3 >= 0L) {
                    this.field611 = var3;
                    break;
                }
                int var5 = (int) ((this.field603 - this.field611 + (long) var2 - 1L) / (long) var2);
                this.field611 += (long) var2 * (long) var5;
                this.field613.method995(var5);
                arg0 -= var5;
                this.method996();
            } while (this.field586.method935());
        }
        this.field613.method995(arg0);
    }

    @ObfuscatedName("eu.ah(B)V")
    public void method996() {
        int var1 = this.field609;
        int var2 = this.field612;
        long var3 = this.field603;
        while (this.field612 == var2) {
            while (this.field586.field570[var1] == var2) {
                this.field586.method901(var1);
                int var5 = this.field586.method936(var1);
                if (var5 == 1) {
                    this.field586.method906();
                    this.field586.method919(var1);
                    if (this.field586.method912()) {
                        if (!this.field608 || var2 == 0) {
                            this.method983();
                            this.field586.method902();
                            return;
                        }
                        this.field586.method913(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method986(var5);
                }
                this.field586.method905(var1);
                this.field586.method919(var1);
            }
            var1 = this.field586.method909();
            var2 = this.field586.field570[var1];
            var3 = this.field586.method908(var2);
        }
        this.field609 = var1;
        this.field612 = var2;
        this.field603 = var3;
    }

    @ObfuscatedName("eu.ad(Ley;I)Z")
    public boolean method997(class63 arg0) {
        if (arg0.field697 != null) {
            return false;
        }
        if (arg0.field693 >= 0) {
            arg0.method234();
            if (arg0.field683 > 0 && this.field606[arg0.field686][arg0.field683] == arg0) {
                this.field606[arg0.field686][arg0.field683] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eu.as(Ley;[IIIB)Z")
    public boolean method998(class63 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field698 = Statics.field2840 / 100;
        if (arg0.field693 >= 0 && arg0.field697 == null || arg0.field697.method3208()) {
            arg0.method1102();
            arg0.method234();
            if (arg0.field683 > 0 && this.field606[arg0.field686][arg0.field683] == arg0) {
                this.field606[arg0.field686][arg0.field683] = null;
            }
            return true;
        }
        int var5 = arg0.field689;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field600[arg0.field686] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field689 = var6;
        }
        arg0.field697.method3169(this.method988(arg0));
        class33 var7 = arg0.field682;
        boolean var8 = false;
        arg0.field679++;
        arg0.field696 += var7.field413;
        double var9 = (double) ((arg0.field684 - 60 << 8) + (arg0.field689 * arg0.field688 >> 12)) * 5.086263020833333E-6D;
        if (var7.field411 > 0) {
            if (var7.field415 > 0) {
                arg0.field685 += (int) (128.0D * Math.pow(2.0D, (double) var7.field415 * var9) + 0.5D);
            } else {
                arg0.field685 += 128;
            }
        }
        if (var7.field420 != null) {
            if (var7.field412 > 0) {
                arg0.field680 += (int) (128.0D * Math.pow(2.0D, (double) var7.field412 * var9) + 0.5D);
            } else {
                arg0.field680 += 128;
            }
            while (arg0.field692 < var7.field420.length - 2 && arg0.field680 > (var7.field420[arg0.field692 + 2] & 0xFF) << 8) {
                arg0.field692 += 2;
            }
            if (arg0.field692 == var7.field420.length - 2 && var7.field420[arg0.field692 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field693 >= 0 && var7.field422 != null && (this.field588[arg0.field686] & 0x1) == 0 && (arg0.field683 < 0 || this.field606[arg0.field686][arg0.field683] != arg0)) {
            if (var7.field409 > 0) {
                arg0.field693 += (int) (128.0D * Math.pow(2.0D, (double) var7.field409 * var9) + 0.5D);
            } else {
                arg0.field693 += 128;
            }
            while (arg0.field694 < var7.field422.length - 2 && arg0.field693 > (var7.field422[arg0.field694 + 2] & 0xFF) << 8) {
                arg0.field694 += 2;
            }
            if (arg0.field694 == var7.field422.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field697.method3167(arg0.field698, this.method989(arg0), this.method990(arg0));
            return false;
        }
        arg0.field697.method3168(arg0.field698);
        if (arg1 == null) {
            arg0.field697.method995(arg3);
        } else {
            arg0.field697.method1018(arg1, arg2, arg3);
        }
        if (arg0.field697.method3172()) {
            this.field613.field1324.method2799(arg0.field697);
        }
        arg0.method1102();
        if (arg0.field693 >= 0) {
            arg0.method234();
            if (arg0.field683 > 0 && this.field606[arg0.field686][arg0.field683] == arg0) {
                this.field606[arg0.field686][arg0.field683] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eu.u(IB)V")
    public void method1003(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method1003(var2);
            }
            return;
        }
        this.field589[arg0] = 12800;
        this.field590[arg0] = 8192;
        this.field591[arg0] = 16383;
        this.field595[arg0] = 8192;
        this.field596[arg0] = 0;
        this.field600[arg0] = 8192;
        this.method969(arg0);
        this.method985(arg0);
        this.field588[arg0] = 0;
        this.field587[arg0] = 32767;
        this.field601[arg0] = 256;
        this.field602[arg0] = 0;
        this.method1069(arg0, 8192);
    }

    @ObfuscatedName("eu.f(I)V")
    public synchronized void method1004() {
        this.field586.method902();
        this.method983();
    }

    @ObfuscatedName("eu.v([III)V")
    public synchronized void method1018(int[] arg0, int arg1, int arg2) {
        if (this.field586.method935()) {
            int var4 = this.field592 * this.field586.field567 / Statics.field2840;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field611;
                if (this.field603 - var5 >= 0L) {
                    this.field611 = var5;
                    break;
                }
                int var7 = (int) ((this.field603 - this.field611 + (long) var4 - 1L) / (long) var4);
                this.field611 += (long) var4 * (long) var7;
                this.field613.method1018(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method996();
            } while (this.field586.method935());
        }
        this.field613.method1018(arg0, arg1, arg2);
    }

    public class57() {
        this.method983();
    }

    @ObfuscatedName("eu.p()Lag;")
    public synchronized class183 method1027() {
        return this.field613;
    }

    @ObfuscatedName("eu.l(Lem;ZB)V")
    public synchronized void method1034(class98 arg0, boolean arg1) {
        this.method1004();
        this.field586.method922(arg0.field1371);
        this.field608 = arg1;
        this.field611 = 0L;
        int var3 = this.field586.method903();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field586.method901(var4);
            this.field586.method905(var4);
            this.field586.method919(var4);
        }
        this.field609 = this.field586.method909();
        this.field612 = this.field586.field570[this.field609];
        this.field603 = this.field586.method908(this.field612);
    }

    @ObfuscatedName("eu.d(B)V")
    public synchronized void method1041() {
        for (class87 var1 = (class87) this.field598.method16(); var1 != null; var1 = (class87) this.field598.method17()) {
            var1.method234();
        }
    }

    @ObfuscatedName("eu.r(IIB)V")
    public void method1046(int arg0, int arg1) {
        this.field595[arg0] = arg1;
    }

    @ObfuscatedName("eu.ak(IIS)V")
    public void method1069(int arg0, int arg1) {
        this.field610[arg0] = arg1;
        this.field599[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eu.q(IIII)V")
    public void method1073(int arg0, int arg1, int arg2) {
        class63 var4 = this.field605[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field605[arg0][arg1] = null;
        if ((this.field588[arg0] & 0x2) == 0) {
            var4.field693 = 0;
            return;
        }
        for (class63 var5 = (class63) this.field613.field1322.method212(); var5 != null; var5 = (class63) this.field613.field1322.method201()) {
            if (var4.field686 == var5.field686 && var5.field693 < 0 && var4 != var5) {
                var4.field693 = 0;
                break;
            }
        }
    }
}
