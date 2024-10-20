package deob;

import java.util.Iterator;
import java.util.PriorityQueue;

@ObfuscatedName("lb")
public class class308 extends class50 {

    @ObfuscatedName("lb.at")
    public class477 field3427 = new class477(128);

    @ObfuscatedName("lb.an")
    public int field3411 = 256;

    @ObfuscatedName("lb.av")
    public int field3410 = 1000000;

    @ObfuscatedName("lb.as")
    public int[] field3413 = new int[16];

    @ObfuscatedName("lb.ax")
    public int[] field3428 = new int[16];

    @ObfuscatedName("lb.ap")
    public int[] field3432 = new int[16];

    @ObfuscatedName("lb.ab")
    public int[] field3416 = new int[16];

    @ObfuscatedName("lb.ak")
    public int[] field3417 = new int[16];

    @ObfuscatedName("lb.ae")
    public int[] field3418 = new int[16];

    @ObfuscatedName("lb.af")
    public int[] field3419 = new int[16];

    @ObfuscatedName("lb.ao")
    public int[] field3415 = new int[16];

    @ObfuscatedName("lb.aa")
    public int[] field3421 = new int[16];

    @ObfuscatedName("lb.au")
    public int[] field3422 = new int[16];

    @ObfuscatedName("lb.ai")
    public int[] field3423 = new int[16];

    @ObfuscatedName("lb.aq")
    public int[] field3424 = new int[16];

    @ObfuscatedName("lb.aw")
    public int[] field3425 = new int[16];

    @ObfuscatedName("lb.ay")
    public int[] field3426 = new int[16];

    @ObfuscatedName("lb.al")
    public int[] field3431 = new int[16];

    @ObfuscatedName("lb.am")
    public class316[][] field3437 = new class316[16][128];

    @ObfuscatedName("lb.bs")
    public class316[][] field3429 = new class316[16][128];

    @ObfuscatedName("lb.bc")
    public class309 field3430 = new class309();

    @ObfuscatedName("lb.bj")
    public boolean field3412;

    @ObfuscatedName("lb.bo")
    public int field3414;

    @ObfuscatedName("lb.bq")
    public int field3433;

    @ObfuscatedName("lb.bg")
    public long field3434;

    @ObfuscatedName("lb.bf")
    public long field3435;

    @ObfuscatedName("lb.bd")
    public class314 field3436 = new class314(this);

    @ObfuscatedName("lb.ba")
    public PriorityQueue field3420 = new PriorityQueue(5, new class307());

    public class308() {
        this.method5266();
    }

    @ObfuscatedName("lb.at(IB)V")
    public synchronized void method5206(int arg0) {
        this.field3411 = arg0;
    }

    @ObfuscatedName("lb.an(I)I")
    public int method5207() {
        return this.field3411;
    }

    @ObfuscatedName("lb.av(Lmv;Lnq;Lbz;B)Z")
    public synchronized boolean method5258(class315 arg0, class357 arg1, class46 arg2) {
        boolean var4 = true;
        for (class317 var5 = (class317) arg0.field3474.method7871(); var5 != null; var5 = (class317) arg0.field3474.method7879()) {
            int var6 = (int) var5.field4757;
            class312 var7 = (class312) this.field3427.method7872((long) var6);
            if (var7 == null) {
                byte[] var8 = arg1.method6143(var6);
                class312 var9;
                if (var8 == null) {
                    var9 = null;
                } else {
                    var9 = new class312(var8);
                }
                var7 = var9;
                if (var9 == null) {
                    var4 = false;
                    continue;
                }
                this.field3427.method7878(var9, (long) var6);
            }
            if (!var7.method5362(arg2, var5.field3501)) {
                var4 = false;
            } else if (this.field3420 != null) {
                Iterator var10 = var7.field3467.iterator();
                while (var10.hasNext()) {
                    class54 var11 = (class54) var10.next();
                    this.field3420.add(new class311(var5.field3500, var11));
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("lb.as(B)V")
    public synchronized void method5209() {
        for (class312 var1 = (class312) this.field3427.method7871(); var1 != null; var1 = (class312) this.field3427.method7879()) {
            var1.method5360();
        }
    }

    @ObfuscatedName("lb.ax(I)V")
    public synchronized void method5232() {
        for (class312 var1 = (class312) this.field3427.method7871(); var1 != null; var1 = (class312) this.field3427.method7879()) {
            var1.method7560();
        }
    }

    @ObfuscatedName("lb.af(Lmv;ZI)V")
    public synchronized void method5211(class315 arg0, boolean arg1) {
        this.method5212();
        this.field3430.method5331(arg0.field3475);
        this.field3412 = arg1;
        this.field3434 = 0L;
        int var3 = this.field3430.method5303();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3430.method5310(var4);
            this.field3430.method5342(var4);
            this.field3430.method5305(var4);
        }
        this.field3414 = this.field3430.method5300();
        this.field3433 = this.field3430.field3442[this.field3414];
        this.field3435 = this.field3430.method5327(this.field3433);
    }

    @ObfuscatedName("lb.aa(I)V")
    public synchronized void method5212() {
        this.field3430.method5301();
        this.method5266();
    }

    @ObfuscatedName("lb.aj(I)Z")
    public synchronized boolean method5213() {
        return this.field3430.method5302();
    }

    @ObfuscatedName("lb.ad(III)V")
    public synchronized void method5233(int arg0, int arg1) {
        this.method5238(arg0, arg1);
    }

    @ObfuscatedName("lb.ac(IIB)V")
    public void method5238(int arg0, int arg1) {
        this.field3416[arg0] = arg1;
        this.field3418[arg0] = arg1 & 0xFFFFFF80;
        this.method5285(arg0, arg1);
    }

    @ObfuscatedName("lb.ag(III)V")
    public void method5285(int arg0, int arg1) {
        if (this.field3417[arg0] != arg1) {
            this.field3417[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3429[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("lb.ar(IIII)V")
    public void method5215(int arg0, int arg1, int arg2) {
        this.method5217(arg0, arg1, 64);
        if ((this.field3422[arg0] & 0x2) != 0) {
            for (class316 var4 = (class316) this.field3436.field3471.method6310(); var4 != null; var4 = (class316) this.field3436.field3471.method6339()) {
                if (var4.field3491 == arg0 && var4.field3490 < 0) {
                    this.field3437[arg0][var4.field3481] = null;
                    this.field3437[arg0][arg1] = var4;
                    int var5 = (var4.field3486 * var4.field3485 >> 12) + var4.field3492;
                    var4.field3492 += arg1 - var4.field3481 << 8;
                    var4.field3485 = var5 - var4.field3492;
                    var4.field3486 = 4096;
                    var4.field3481 = arg1;
                    return;
                }
            }
        }
        class312 var6 = (class312) this.field3427.method7872((long) this.field3417[arg0]);
        if (var6 == null || var6.field3461[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3461[arg1].method970();
        if (var7 == null) {
            return;
        }
        class316 var8 = new class316();
        var8.field3491 = arg0;
        var8.field3477 = var6;
        var8.field3478 = var7;
        var8.field3499 = var6.field3466[arg1];
        var8.field3480 = var6.field3460[arg1];
        var8.field3481 = arg1;
        var8.field3482 = var6.field3465 * arg2 * arg2 * var6.field3464[arg1] + 1024 >> 11;
        var8.field3483 = var6.field3469[arg1] & 0xFF;
        var8.field3492 = (arg1 << 8) - (var6.field3463[arg1] & 0x7FFF);
        var8.field3487 = 0;
        var8.field3488 = 0;
        var8.field3489 = 0;
        var8.field3490 = -1;
        var8.field3496 = 0;
        if (this.field3425[arg0] == 0) {
            var8.field3479 = class49.method908(var7, this.method5229(var8), this.method5230(var8), this.method5231(var8));
        } else {
            var8.field3479 = class49.method908(var7, this.method5229(var8), 0, this.method5231(var8));
            this.method5237(var8, var6.field3463[arg1] < 0);
        }
        if (var6.field3463[arg1] < 0) {
            var8.field3479.method868(-1);
        }
        if (var8.field3480 >= 0) {
            class316 var9 = this.field3429[arg0][var8.field3480];
            if (var9 != null && var9.field3490 < 0) {
                this.field3437[arg0][var9.field3481] = null;
                var9.field3490 = 0;
            }
            this.field3429[arg0][var8.field3480] = var8;
        }
        this.field3436.field3471.method6303(var8);
        this.field3437[arg0][arg1] = var8;
    }

    @ObfuscatedName("lb.ah(Lma;ZB)V")
    public void method5237(class316 arg0, boolean arg1) {
        int var3 = arg0.field3478.field265.length;
        int var5;
        if (arg1 && arg0.field3478.field268) {
            int var4 = var3 + var3 - arg0.field3478.field264;
            var5 = (int) ((long) this.field3425[arg0.field3491] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3479.method835(true);
            }
        } else {
            var5 = (int) ((long) this.field3425[arg0.field3491] * (long) var3 >> 6);
        }
        arg0.field3479.method834(var5);
    }

    @ObfuscatedName("lb.az(IIII)V")
    public void method5217(int arg0, int arg1, int arg2) {
        class316 var4 = this.field3437[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3437[arg0][arg1] = null;
        if ((this.field3422[arg0] & 0x2) == 0) {
            var4.field3490 = 0;
            return;
        }
        for (class316 var5 = (class316) this.field3436.field3471.method6309(); var5 != null; var5 = (class316) this.field3436.field3471.method6311()) {
            if (var4.field3491 == var5.field3491 && var5.field3490 < 0 && var4 != var5) {
                var4.field3490 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("lb.au(IIII)V")
    public void method5218(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("lb.ai(III)V")
    public void method5219(int arg0, int arg1) {
    }

    @ObfuscatedName("lb.aq(III)V")
    public void method5224(int arg0, int arg1) {
        this.field3419[arg0] = arg1;
    }

    @ObfuscatedName("lb.aw(IB)V")
    public void method5221(int arg0) {
        for (class316 var2 = (class316) this.field3436.field3471.method6309(); var2 != null; var2 = (class316) this.field3436.field3471.method6311()) {
            if (arg0 < 0 || var2.field3491 == arg0) {
                if (var2.field3479 != null) {
                    var2.field3479.method839(Statics.field292 / 100);
                    if (var2.field3479.method903()) {
                        this.field3436.field3473.method665(var2.field3479);
                    }
                    var2.method5375();
                }
                if (var2.field3490 < 0) {
                    this.field3437[var2.field3491][var2.field3481] = null;
                }
                var2.method7560();
            }
        }
    }

    @ObfuscatedName("lb.ay(IS)V")
    public void method5240(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5240(var2);
            }
            return;
        }
        this.field3413[arg0] = 12800;
        this.field3428[arg0] = 8192;
        this.field3432[arg0] = 16383;
        this.field3419[arg0] = 8192;
        this.field3415[arg0] = 0;
        this.field3421[arg0] = 8192;
        this.method5225(arg0);
        this.method5265(arg0);
        this.field3422[arg0] = 0;
        this.field3423[arg0] = 32767;
        this.field3424[arg0] = 256;
        this.field3425[arg0] = 0;
        this.method5228(arg0, 8192);
    }

    @ObfuscatedName("lb.al(II)V")
    public void method5223(int arg0) {
        for (class316 var2 = (class316) this.field3436.field3471.method6309(); var2 != null; var2 = (class316) this.field3436.field3471.method6311()) {
            if ((arg0 < 0 || var2.field3491 == arg0) && var2.field3490 < 0) {
                this.field3437[var2.field3491][var2.field3481] = null;
                var2.field3490 = 0;
            }
        }
    }

    @ObfuscatedName("lb.am(I)V")
    public void method5266() {
        this.method5221(-1);
        this.method5240(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3417[var1] = this.field3416[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3418[var2] = this.field3416[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("lb.bp(II)V")
    public void method5225(int arg0) {
        if ((this.field3422[arg0] & 0x2) == 0) {
            return;
        }
        for (class316 var2 = (class316) this.field3436.field3471.method6309(); var2 != null; var2 = (class316) this.field3436.field3471.method6311()) {
            if (var2.field3491 == arg0 && this.field3437[arg0][var2.field3481] == null && var2.field3490 < 0) {
                var2.field3490 = 0;
            }
        }
    }

    @ObfuscatedName("lb.bw(II)V")
    public void method5265(int arg0) {
        if ((this.field3422[arg0] & 0x4) == 0) {
            return;
        }
        for (class316 var2 = (class316) this.field3436.field3471.method6309(); var2 != null; var2 = (class316) this.field3436.field3471.method6311()) {
            if (var2.field3491 == arg0) {
                var2.field3484 = 0;
            }
        }
    }

    @ObfuscatedName("lb.bk(II)V")
    public void method5227(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5217(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5215(var6, var7, var8);
            } else {
                this.method5217(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5218(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3418[var12] = (var14 << 14) + (this.field3418[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3418[var12] = (var14 << 7) + (this.field3418[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3415[var12] = (var14 << 7) + (this.field3415[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3415[var12] = (this.field3415[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3421[var12] = (var14 << 7) + (this.field3421[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3421[var12] = (this.field3421[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3413[var12] = (var14 << 7) + (this.field3413[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3413[var12] = (this.field3413[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3428[var12] = (var14 << 7) + (this.field3428[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3428[var12] = (this.field3428[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3432[var12] = (var14 << 7) + (this.field3432[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3432[var12] = (this.field3432[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3422[var12] |= 0x1;
                } else {
                    this.field3422[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3422[var12] |= 0x2;
                } else {
                    this.method5225(var12);
                    this.field3422[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3423[var12] = (var14 << 7) + (this.field3423[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3423[var12] = (this.field3423[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3423[var12] = (var14 << 7) + (this.field3423[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3423[var12] = (this.field3423[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5221(var12);
            }
            if (var13 == 121) {
                this.method5240(var12);
            }
            if (var13 == 123) {
                this.method5223(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3423[var12];
                if (var15 == 16384) {
                    this.field3424[var12] = (var14 << 7) + (this.field3424[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3423[var12];
                if (var16 == 16384) {
                    this.field3424[var12] = (this.field3424[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3425[var12] = (var14 << 7) + (this.field3425[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3425[var12] = (this.field3425[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3422[var12] |= 0x4;
                } else {
                    this.method5265(var12);
                    this.field3422[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5228(var12, (var14 << 7) + (this.field3426[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5228(var12, (this.field3426[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5285(var17, this.field3418[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5219(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method5224(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5266();
            }
        }
    }

    @ObfuscatedName("lb.bv(IIB)V")
    public void method5228(int arg0, int arg1) {
        this.field3426[arg0] = arg1;
        this.field3431[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("lb.bm(Lma;B)I")
    public int method5229(class316 arg0) {
        int var2 = (arg0.field3486 * arg0.field3485 >> 12) + arg0.field3492;
        int var3 = ((this.field3419[arg0.field3491] - 8192) * this.field3424[arg0.field3491] >> 12) + var2;
        class304 var4 = arg0.field3499;
        if (var4.field3373 > 0 && (var4.field3379 > 0 || this.field3415[arg0.field3491] > 0)) {
            int var5 = var4.field3379 << 2;
            int var6 = var4.field3378 << 1;
            if (arg0.field3494 < var6) {
                var5 = arg0.field3494 * var5 / var6;
            }
            int var7 = (this.field3415[arg0.field3491] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3493 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3478.field266 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field292 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("lb.br(Lma;I)I")
    public int method5230(class316 arg0) {
        class304 var2 = arg0.field3499;
        int var3 = this.field3413[arg0.field3491] * this.field3432[arg0.field3491] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3482 * var4 + 16384 >> 15;
        int var6 = this.field3411 * var5 + 128 >> 8;
        if (var2.field3374 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3487 * 1.953125E-5D * (double) var2.field3374) + 0.5D);
        }
        if (var2.field3375 != null) {
            int var7 = arg0.field3488;
            int var8 = var2.field3375[arg0.field3489 + 1];
            if (arg0.field3489 < var2.field3375.length - 2) {
                int var9 = (var2.field3375[arg0.field3489] & 0xFF) << 8;
                int var10 = (var2.field3375[arg0.field3489 + 2] & 0xFF) << 8;
                var8 += (var2.field3375[arg0.field3489 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3490 > 0 && var2.field3382 != null) {
            int var11 = arg0.field3490;
            int var12 = var2.field3382[arg0.field3496 + 1];
            if (arg0.field3496 < var2.field3382.length - 2) {
                int var13 = (var2.field3382[arg0.field3496] & 0xFF) << 8;
                int var14 = (var2.field3382[arg0.field3496 + 2] & 0xFF) << 8;
                var12 += (var2.field3382[arg0.field3496 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("lb.bu(Lma;B)I")
    public int method5231(class316 arg0) {
        int var2 = this.field3428[arg0.field3491];
        return var2 < 8192 ? arg0.field3483 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3483) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("lb.ap()Lby;")
    public synchronized class50 method701() {
        return this.field3436;
    }

    @ObfuscatedName("lb.ab()Lby;")
    public synchronized class50 method702() {
        return null;
    }

    @ObfuscatedName("lb.ak()I")
    public synchronized int method672() {
        return 0;
    }

    @ObfuscatedName("lb.ae([III)V")
    public synchronized void method677(int[] arg0, int arg1, int arg2) {
        if (this.field3430.method5302()) {
            int var4 = this.field3410 * this.field3430.field3439 / Statics.field292;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3434;
                if (this.field3435 - var5 >= 0L) {
                    this.field3434 = var5;
                    break;
                }
                int var7 = (int) ((this.field3435 - this.field3434 + (long) var4 - 1L) / (long) var4);
                this.field3434 += (long) var4 * (long) var7;
                this.field3436.method677(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5259();
            } while (this.field3430.method5302());
        }
        this.field3436.method677(arg0, arg1, arg2);
    }

    @ObfuscatedName("lb.ao(I)V")
    public synchronized void method674(int arg0) {
        if (this.field3430.method5302()) {
            int var2 = this.field3410 * this.field3430.field3439 / Statics.field292;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3434;
                if (this.field3435 - var3 >= 0L) {
                    this.field3434 = var3;
                    break;
                }
                int var5 = (int) ((this.field3435 - this.field3434 + (long) var2 - 1L) / (long) var2);
                this.field3434 += (long) var2 * (long) var5;
                this.field3436.method674(var5);
                arg0 -= var5;
                this.method5259();
            } while (this.field3430.method5302());
        }
        this.field3436.method674(arg0);
    }

    @ObfuscatedName("lb.by(B)V")
    public void method5259() {
        int var1 = this.field3414;
        int var2 = this.field3433;
        long var3 = this.field3435;
        while (this.field3433 == var2) {
            while (this.field3430.field3442[var1] == var2) {
                this.field3430.method5310(var1);
                int var5 = this.field3430.method5308(var1);
                if (var5 == 1) {
                    this.field3430.method5347();
                    this.field3430.method5305(var1);
                    if (this.field3430.method5339()) {
                        if (!this.field3412 || var2 == 0) {
                            this.method5266();
                            this.field3430.method5301();
                            return;
                        }
                        this.field3430.method5314(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5227(var5);
                }
                this.field3430.method5342(var1);
                this.field3430.method5305(var1);
            }
            var1 = this.field3430.method5300();
            var2 = this.field3430.field3442[var1];
            var3 = this.field3430.method5327(var2);
        }
        this.field3414 = var1;
        this.field3433 = var2;
        this.field3435 = var3;
    }

    @ObfuscatedName("lb.bt(Lma;I)Z")
    public boolean method5234(class316 arg0) {
        if (arg0.field3479 != null) {
            return false;
        }
        if (arg0.field3490 >= 0) {
            arg0.method7560();
            if (arg0.field3480 > 0 && this.field3429[arg0.field3491][arg0.field3480] == arg0) {
                this.field3429[arg0.field3491][arg0.field3480] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("lb.bl(Lma;[IIIB)Z")
    public boolean method5235(class316 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3495 = Statics.field292 / 100;
        if (arg0.field3490 >= 0 && arg0.field3479 == null || arg0.field3479.method910()) {
            arg0.method5375();
            arg0.method7560();
            if (arg0.field3480 > 0 && this.field3429[arg0.field3491][arg0.field3480] == arg0) {
                this.field3429[arg0.field3491][arg0.field3480] = null;
            }
            return true;
        }
        int var5 = arg0.field3486;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3421[arg0.field3491] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3486 = var6;
        }
        arg0.field3479.method840(this.method5229(arg0));
        class304 var7 = arg0.field3499;
        boolean var8 = false;
        arg0.field3494++;
        arg0.field3493 += var7.field3373;
        double var9 = (double) ((arg0.field3481 - 60 << 8) + (arg0.field3486 * arg0.field3485 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3374 > 0) {
            if (var7.field3380 > 0) {
                arg0.field3487 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3380 * var9) + 0.5D);
            } else {
                arg0.field3487 += 128;
            }
        }
        if (var7.field3375 != null) {
            if (var7.field3376 > 0) {
                arg0.field3488 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3376 * var9) + 0.5D);
            } else {
                arg0.field3488 += 128;
            }
            while (arg0.field3489 < var7.field3375.length - 2 && arg0.field3488 > (var7.field3375[arg0.field3489 + 2] & 0xFF) << 8) {
                arg0.field3489 += 2;
            }
            if (arg0.field3489 == var7.field3375.length - 2 && var7.field3375[arg0.field3489 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3490 >= 0 && var7.field3382 != null && (this.field3422[arg0.field3491] & 0x1) == 0 && (arg0.field3480 < 0 || this.field3429[arg0.field3491][arg0.field3480] != arg0)) {
            if (var7.field3377 > 0) {
                arg0.field3490 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3377 * var9) + 0.5D);
            } else {
                arg0.field3490 += 128;
            }
            while (arg0.field3496 < var7.field3382.length - 2 && arg0.field3490 > (var7.field3382[arg0.field3496 + 2] & 0xFF) << 8) {
                arg0.field3496 += 2;
            }
            if (arg0.field3496 == var7.field3382.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3479.method838(arg0.field3495, this.method5230(arg0), this.method5231(arg0));
            return false;
        }
        arg0.field3479.method839(arg0.field3495);
        if (arg1 == null) {
            arg0.field3479.method674(arg3);
        } else {
            arg0.field3479.method677(arg1, arg2, arg3);
        }
        if (arg0.field3479.method903()) {
            this.field3436.field3473.method665(arg0.field3479);
        }
        arg0.method5375();
        if (arg0.field3490 >= 0) {
            arg0.method7560();
            if (arg0.field3480 > 0 && this.field3429[arg0.field3491][arg0.field3480] == arg0) {
                this.field3429[arg0.field3491][arg0.field3480] = null;
            }
        }
        return true;
    }
}
