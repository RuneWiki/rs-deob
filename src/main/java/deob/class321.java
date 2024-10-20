package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mk")
public class class321 extends class50 {

    @ObfuscatedName("mk.am")
    public class505 field3484 = new class505(128);

    @ObfuscatedName("mk.ap")
    public int field3471 = 256;

    @ObfuscatedName("mk.af")
    public int field3499 = 1000000;

    @ObfuscatedName("mk.aj")
    public int[] field3481 = new int[16];

    @ObfuscatedName("mk.aq")
    public int[] field3473 = new int[16];

    @ObfuscatedName("mk.ar")
    public int[] field3501 = new int[16];

    @ObfuscatedName("mk.ag")
    public int[] field3475 = new int[16];

    @ObfuscatedName("mk.ao")
    public int[] field3476 = new int[16];

    @ObfuscatedName("mk.ae")
    public int[] field3477 = new int[16];

    @ObfuscatedName("mk.aa")
    public int[] field3478 = new int[16];

    @ObfuscatedName("mk.au")
    public int[] field3479 = new int[16];

    @ObfuscatedName("mk.an")
    public int[] field3480 = new int[16];

    @ObfuscatedName("mk.as")
    public int[] field3482 = new int[16];

    @ObfuscatedName("mk.ab")
    public int[] field3474 = new int[16];

    @ObfuscatedName("mk.ah")
    public int[] field3472 = new int[16];

    @ObfuscatedName("mk.ai")
    public int[] field3485 = new int[16];

    @ObfuscatedName("mk.ac")
    public int[] field3486 = new int[16];

    @ObfuscatedName("mk.al")
    public int[] field3495 = new int[16];

    @ObfuscatedName("mk.at")
    public class330[][] field3491 = new class330[16][128];

    @ObfuscatedName("mk.bj")
    public class330[][] field3489 = new class330[16][128];

    @ObfuscatedName("mk.bd")
    public class322 field3490 = new class322();

    @ObfuscatedName("mk.bg")
    public boolean field3470;

    @ObfuscatedName("mk.bt")
    public int field3492;

    @ObfuscatedName("mk.br")
    public int field3493;

    @ObfuscatedName("mk.ba")
    public long field3494;

    @ObfuscatedName("mk.bk")
    public long field3483;

    @ObfuscatedName("mk.bn")
    public class328 field3496 = new class328(this);

    @ObfuscatedName("mk.by")
    public PriorityQueue field3497 = new PriorityQueue(5, new class331());

    @ObfuscatedName("mk.bc")
    public static AtomicBoolean field3498 = null;

    @ObfuscatedName("mk.bx")
    public static ThreadPoolExecutor field3488 = null;

    @ObfuscatedName("mk.bf")
    public int field3500 = 0;

    public class321() {
        this.method5524();
    }

    @ObfuscatedName("mk.am(II)V")
    public synchronized void method5503(int arg0) {
        this.field3471 = arg0;
    }

    @ObfuscatedName("mk.ap(S)I")
    public int method5504() {
        return this.field3471;
    }

    @ObfuscatedName("mk.af(Lmr;Low;Lbi;B)Z")
    public synchronized boolean method5505(class329 arg0, class375 arg1, class46 arg2) {
        boolean var4 = true;
        PriorityQueue var5 = this.field3497;
        synchronized (this.field3497) {
            this.field3497.clear();
        }
        for (class333 var7 = (class333) arg0.field3544.method8304(); var7 != null; var7 = (class333) arg0.field3544.method8302()) {
            int var8 = (int) var7.field4889;
            class325 var9 = (class325) this.field3484.method8301((long) var8);
            if (var9 == null) {
                var9 = class325.method5472(arg1, var8);
                if (var9 == null) {
                    var4 = false;
                    continue;
                }
                this.field3484.method8307(var9, (long) var8);
            }
            if (!var9.method5662(arg2, var7.field3587)) {
                var4 = false;
            } else if (this.field3497 != null) {
                PriorityQueue var10 = this.field3497;
                synchronized (this.field3497) {
                    Iterator var11 = var9.field3529.iterator();
                    while (var11.hasNext()) {
                        class54 var12 = (class54) var11.next();
                        this.field3497.add(new class324(var7.field3586, var12));
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("mk.aj(B)V")
    public void method5506() {
        if (this.field3497 == null) {
            return;
        }
        if (field3498 != null) {
            field3498.set(true);
        }
        field3498 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3498;
        if (field3488 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3488 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class323(this));
        }
        field3488.submit(new class327(this, var1));
    }

    @ObfuscatedName("mk.aq(I)V")
    public synchronized void method5604() {
        for (class325 var1 = (class325) this.field3484.method8304(); var1 != null; var1 = (class325) this.field3484.method8302()) {
            var1.method5665();
        }
    }

    @ObfuscatedName("mk.aa(I)V")
    public synchronized void method5508() {
        for (class325 var1 = (class325) this.field3484.method8304(); var1 != null; var1 = (class325) this.field3484.method8302()) {
            var1.method7988();
        }
    }

    @ObfuscatedName("mk.an(Lmr;ZB)V")
    public synchronized void method5593(class329 arg0, boolean arg1) {
        this.method5510();
        this.field3490.method5613(arg0.field3545);
        this.field3470 = arg1;
        this.field3494 = 0L;
        int var3 = this.field3490.method5648();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3490.method5616(var4);
            this.field3490.method5620(var4);
            this.field3490.method5638(var4);
        }
        this.field3492 = this.field3490.method5625();
        this.field3493 = this.field3490.field3506[this.field3492];
        this.field3483 = this.field3490.method5624(this.field3493);
    }

    @ObfuscatedName("mk.ad(I)V")
    public synchronized void method5510() {
        this.field3490.method5614();
        this.method5524();
    }

    @ObfuscatedName("mk.ax(I)Z")
    public synchronized boolean method5511() {
        return this.field3490.method5615();
    }

    @ObfuscatedName("mk.aw(B)Z")
    public synchronized boolean method5512() {
        return this.field3484.method8300() > 0;
    }

    @ObfuscatedName("mk.az(III)V")
    public synchronized void method5513(int arg0, int arg1) {
        this.method5514(arg0, arg1);
    }

    @ObfuscatedName("mk.av(IIB)V")
    public void method5514(int arg0, int arg1) {
        this.field3475[arg0] = arg1;
        this.field3477[arg0] = arg1 & 0xFFFFFF80;
        this.method5568(arg0, arg1);
    }

    @ObfuscatedName("mk.ak(IIB)V")
    public void method5568(int arg0, int arg1) {
        if (this.field3476[arg0] != arg1) {
            this.field3476[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3489[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mk.ay(IIIB)V")
    public void method5552(int arg0, int arg1, int arg2) {
        this.method5530(arg0, arg1, 64);
        if ((this.field3482[arg0] & 0x2) != 0) {
            for (class330 var4 = (class330) this.field3496.field3539.method6671(); var4 != null; var4 = (class330) this.field3496.field3539.method6674()) {
                if (var4.field3558 == arg0 && var4.field3560 < 0) {
                    this.field3491[arg0][var4.field3569] = null;
                    this.field3491[arg0][arg1] = var4;
                    int var5 = (var4.field3568 * var4.field3551 >> 12) + var4.field3550;
                    var4.field3550 += arg1 - var4.field3569 << 8;
                    var4.field3568 = var5 - var4.field3550;
                    var4.field3551 = 4096;
                    var4.field3569 = arg1;
                    return;
                }
            }
        }
        class325 var6 = (class325) this.field3484.method8301((long) this.field3476[arg0]);
        if (var6 == null || var6.field3522[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3522[arg1].method1040();
        if (var7 == null) {
            return;
        }
        class330 var8 = new class330();
        var8.field3558 = arg0;
        var8.field3547 = var6;
        var8.field3548 = var7;
        var8.field3546 = var6.field3527[arg1];
        var8.field3554 = var6.field3524[arg1];
        var8.field3569 = arg1;
        var8.field3552 = var6.field3532 * arg2 * arg2 * var6.field3525[arg1] + 1024 >> 11;
        var8.field3553 = var6.field3526[arg1] & 0xFF;
        var8.field3550 = (arg1 << 8) - (var6.field3523[arg1] & 0x7FFF);
        var8.field3557 = 0;
        var8.field3567 = 0;
        var8.field3559 = 0;
        var8.field3560 = -1;
        var8.field3561 = 0;
        if (this.field3485[arg0] == 0) {
            var8.field3564 = class49.method893(var7, this.method5529(var8), this.method5605(var8), this.method5567(var8));
        } else {
            var8.field3564 = class49.method893(var7, this.method5529(var8), 0, this.method5567(var8));
            this.method5517(var8, var6.field3523[arg1] < 0);
        }
        if (var6.field3523[arg1] < 0) {
            var8.field3564.method931(-1);
        }
        if (var8.field3554 >= 0) {
            class330 var9 = this.field3489[arg0][var8.field3554];
            if (var9 != null && var9.field3560 < 0) {
                this.field3491[arg0][var9.field3569] = null;
                var9.field3560 = 0;
            }
            this.field3489[arg0][var8.field3554] = var8;
        }
        this.field3496.field3539.method6666(var8);
        this.field3491[arg0][arg1] = var8;
    }

    @ObfuscatedName("mk.as(Lmv;ZB)V")
    public void method5517(class330 arg0, boolean arg1) {
        int var3 = arg0.field3548.field269.length;
        int var5;
        if (arg1 && arg0.field3548.field268) {
            int var4 = var3 + var3 - arg0.field3548.field270;
            var5 = (int) ((long) this.field3485[arg0.field3558] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3564.method896(true);
            }
        } else {
            var5 = (int) ((long) this.field3485[arg0.field3558] * (long) var3 >> 6);
        }
        arg0.field3564.method927(var5);
    }

    @ObfuscatedName("mk.ab(IIIB)V")
    public void method5530(int arg0, int arg1, int arg2) {
        class330 var4 = this.field3491[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3491[arg0][arg1] = null;
        if ((this.field3482[arg0] & 0x2) == 0) {
            var4.field3560 = 0;
            return;
        }
        for (class330 var5 = (class330) this.field3496.field3539.method6670(); var5 != null; var5 = (class330) this.field3496.field3539.method6665()) {
            if (var4.field3558 == var5.field3558 && var5.field3560 < 0 && var4 != var5) {
                var4.field3560 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mk.ah(IIIS)V")
    public void method5559(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mk.bg(III)V")
    public void method5519(int arg0, int arg1) {
    }

    @ObfuscatedName("mk.bt(III)V")
    public void method5520(int arg0, int arg1) {
        this.field3478[arg0] = arg1;
    }

    @ObfuscatedName("mk.br(II)V")
    public void method5521(int arg0) {
        for (class330 var2 = (class330) this.field3496.field3539.method6670(); var2 != null; var2 = (class330) this.field3496.field3539.method6665()) {
            if (arg0 < 0 || var2.field3558 == arg0) {
                if (var2.field3564 != null) {
                    var2.field3564.method983(Statics.field1994 / 100);
                    if (var2.field3564.method909()) {
                        this.field3496.field3538.method732(var2.field3564);
                    }
                    var2.method5686();
                }
                if (var2.field3560 < 0) {
                    this.field3491[var2.field3558][var2.field3569] = null;
                }
                var2.method7988();
            }
        }
    }

    @ObfuscatedName("mk.ba(IB)V")
    public void method5522(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5522(var2);
            }
            return;
        }
        this.field3481[arg0] = 12800;
        this.field3473[arg0] = 8192;
        this.field3501[arg0] = 16383;
        this.field3478[arg0] = 8192;
        this.field3479[arg0] = 0;
        this.field3480[arg0] = 8192;
        this.method5535(arg0);
        this.method5526(arg0);
        this.field3482[arg0] = 0;
        this.field3474[arg0] = 32767;
        this.field3472[arg0] = 256;
        this.field3485[arg0] = 0;
        this.method5581(arg0, 8192);
    }

    @ObfuscatedName("mk.bc(II)V")
    public void method5523(int arg0) {
        for (class330 var2 = (class330) this.field3496.field3539.method6670(); var2 != null; var2 = (class330) this.field3496.field3539.method6665()) {
            if ((arg0 < 0 || var2.field3558 == arg0) && var2.field3560 < 0) {
                this.field3491[var2.field3558][var2.field3569] = null;
                var2.field3560 = 0;
            }
        }
    }

    @ObfuscatedName("mk.bf(B)V")
    public void method5524() {
        this.method5521(-1);
        this.method5522(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3476[var1] = this.field3475[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3477[var2] = this.field3475[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mk.bp(II)V")
    public void method5535(int arg0) {
        if ((this.field3482[arg0] & 0x2) == 0) {
            return;
        }
        for (class330 var2 = (class330) this.field3496.field3539.method6670(); var2 != null; var2 = (class330) this.field3496.field3539.method6665()) {
            if (var2.field3558 == arg0 && this.field3491[arg0][var2.field3569] == null && var2.field3560 < 0) {
                var2.field3560 = 0;
            }
        }
    }

    @ObfuscatedName("mk.bv(II)V")
    public void method5526(int arg0) {
        if ((this.field3482[arg0] & 0x4) == 0) {
            return;
        }
        for (class330 var2 = (class330) this.field3496.field3539.method6670(); var2 != null; var2 = (class330) this.field3496.field3539.method6665()) {
            if (var2.field3558 == arg0) {
                var2.field3555 = 0;
            }
        }
    }

    @ObfuscatedName("mk.bm(II)V")
    public void method5527(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5530(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5552(var6, var7, var8);
            } else {
                this.method5530(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5559(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3477[var12] = (var14 << 14) + (this.field3477[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3477[var12] = (var14 << 7) + (this.field3477[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3479[var12] = (var14 << 7) + (this.field3479[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3479[var12] = (this.field3479[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3480[var12] = (var14 << 7) + (this.field3480[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3480[var12] = (this.field3480[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3481[var12] = (var14 << 7) + (this.field3481[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3481[var12] = (this.field3481[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3473[var12] = (var14 << 7) + (this.field3473[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3473[var12] = (this.field3473[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3501[var12] = (var14 << 7) + (this.field3501[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3501[var12] = (this.field3501[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3482[var12] |= 0x1;
                } else {
                    this.field3482[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3482[var12] |= 0x2;
                } else {
                    this.method5535(var12);
                    this.field3482[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3474[var12] = (var14 << 7) + (this.field3474[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3474[var12] = (this.field3474[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3474[var12] = (var14 << 7) + (this.field3474[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3474[var12] = (this.field3474[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5521(var12);
            }
            if (var13 == 121) {
                this.method5522(var12);
            }
            if (var13 == 123) {
                this.method5523(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3474[var12];
                if (var15 == 16384) {
                    this.field3472[var12] = (var14 << 7) + (this.field3472[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3474[var12];
                if (var16 == 16384) {
                    this.field3472[var12] = (this.field3472[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3485[var12] = (var14 << 7) + (this.field3485[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3485[var12] = (this.field3485[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3482[var12] |= 0x4;
                } else {
                    this.method5526(var12);
                    this.field3482[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5581(var12, (var14 << 7) + (this.field3486[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5581(var12, (this.field3486[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5568(var17, this.field3477[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5519(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5520(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5524();
            }
        }
    }

    @ObfuscatedName("mk.bq(III)V")
    public void method5581(int arg0, int arg1) {
        this.field3486[arg0] = arg1;
        this.field3495[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mk.bb(Lmv;B)I")
    public int method5529(class330 arg0) {
        int var2 = (arg0.field3568 * arg0.field3551 >> 12) + arg0.field3550;
        int var3 = ((this.field3478[arg0.field3558] - 8192) * this.field3472[arg0.field3558] >> 12) + var2;
        class319 var4 = arg0.field3546;
        if (var4.field3453 > 0 && (var4.field3452 > 0 || this.field3479[arg0.field3558] > 0)) {
            int var5 = var4.field3452 << 2;
            int var6 = var4.field3450 << 1;
            if (arg0.field3562 < var6) {
                var5 = arg0.field3562 * var5 / var6;
            }
            int var7 = (this.field3479[arg0.field3558] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3563 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3548.field271 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1994 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mk.bh(Lmv;I)I")
    public int method5605(class330 arg0) {
        class319 var2 = arg0.field3546;
        int var3 = this.field3481[arg0.field3558] * this.field3501[arg0.field3558] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3552 * var4 + 16384 >> 15;
        int var6 = this.field3471 * var5 + 128 >> 8;
        if (var2.field3454 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3557 * 1.953125E-5D * (double) var2.field3454) + 0.5D);
        }
        if (var2.field3447 != null) {
            int var7 = arg0.field3567;
            int var8 = var2.field3447[arg0.field3559 + 1];
            if (arg0.field3559 < var2.field3447.length - 2) {
                int var9 = (var2.field3447[arg0.field3559] & 0xFF) << 8;
                int var10 = (var2.field3447[arg0.field3559 + 2] & 0xFF) << 8;
                var8 += (var2.field3447[arg0.field3559 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3560 > 0 && var2.field3446 != null) {
            int var11 = arg0.field3560;
            int var12 = var2.field3446[arg0.field3561 + 1];
            if (arg0.field3561 < var2.field3446.length - 2) {
                int var13 = (var2.field3446[arg0.field3561] & 0xFF) << 8;
                int var14 = (var2.field3446[arg0.field3561 + 2] & 0xFF) << 8;
                var12 += (var2.field3446[arg0.field3561 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mk.bw(Lmv;I)I")
    public int method5567(class330 arg0) {
        int var2 = this.field3473[arg0.field3558];
        return var2 < 8192 ? arg0.field3553 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3553) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mk.ar()Lbl;")
    public synchronized class50 method738() {
        return this.field3496;
    }

    @ObfuscatedName("mk.ag()Lbl;")
    public synchronized class50 method766() {
        return null;
    }

    @ObfuscatedName("mk.ao()I")
    public synchronized int method740() {
        return 0;
    }

    @ObfuscatedName("mk.ae([III)V")
    public synchronized void method736(int[] arg0, int arg1, int arg2) {
        if (this.field3490.method5615()) {
            int var4 = this.field3499 * this.field3490.field3503 / Statics.field1994;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3494;
                if (this.field3483 - var5 >= 0L) {
                    this.field3494 = var5;
                    break;
                }
                int var7 = (int) ((this.field3483 - this.field3494 + (long) var4 - 1L) / (long) var4);
                this.field3494 += (long) var4 * (long) var7;
                this.field3496.method736(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5532();
            } while (this.field3490.method5615());
        }
        this.field3496.method736(arg0, arg1, arg2);
    }

    @ObfuscatedName("mk.au(I)V")
    public synchronized void method743(int arg0) {
        if (this.field3490.method5615()) {
            int var2 = this.field3499 * this.field3490.field3503 / Statics.field1994;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3494;
                if (this.field3483 - var3 >= 0L) {
                    this.field3494 = var3;
                    break;
                }
                int var5 = (int) ((this.field3483 - this.field3494 + (long) var2 - 1L) / (long) var2);
                this.field3494 += (long) var2 * (long) var5;
                this.field3496.method743(var5);
                arg0 -= var5;
                this.method5532();
            } while (this.field3490.method5615());
        }
        this.field3496.method743(arg0);
    }

    @ObfuscatedName("mk.bi(B)V")
    public void method5532() {
        int var1 = this.field3492;
        int var2 = this.field3493;
        long var3 = this.field3483;
        while (this.field3493 == var2) {
            while (this.field3490.field3506[var1] == var2) {
                this.field3490.method5616(var1);
                int var5 = this.field3490.method5621(var1);
                if (var5 == 1) {
                    this.field3490.method5619();
                    this.field3490.method5638(var1);
                    if (this.field3490.method5626()) {
                        if (!this.field3470 || var2 == 0) {
                            this.method5524();
                            this.field3490.method5614();
                            return;
                        }
                        this.field3490.method5652(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5527(var5);
                }
                this.field3490.method5620(var1);
                this.field3490.method5638(var1);
            }
            var1 = this.field3490.method5625();
            var2 = this.field3490.field3506[var1];
            var3 = this.field3490.method5624(var2);
        }
        this.field3492 = var1;
        this.field3493 = var2;
        this.field3483 = var3;
    }

    @ObfuscatedName("mk.bu(Lmv;I)Z")
    public boolean method5533(class330 arg0) {
        if (arg0.field3564 != null) {
            return false;
        }
        if (arg0.field3560 >= 0) {
            arg0.method7988();
            if (arg0.field3554 > 0 && this.field3489[arg0.field3558][arg0.field3554] == arg0) {
                this.field3489[arg0.field3558][arg0.field3554] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mk.be(Lmv;[IIII)Z")
    public boolean method5534(class330 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3565 = Statics.field1994 / 100;
        if (arg0.field3560 >= 0 && arg0.field3564 == null || arg0.field3564.method949()) {
            arg0.method5686();
            arg0.method7988();
            if (arg0.field3554 > 0 && this.field3489[arg0.field3558][arg0.field3554] == arg0) {
                this.field3489[arg0.field3558][arg0.field3554] = null;
            }
            return true;
        }
        int var5 = arg0.field3551;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3480[arg0.field3558] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3551 = var6;
        }
        arg0.field3564.method906(this.method5529(arg0));
        class319 var7 = arg0.field3546;
        boolean var8 = false;
        arg0.field3562++;
        arg0.field3563 += var7.field3453;
        double var9 = (double) ((arg0.field3569 - 60 << 8) + (arg0.field3568 * arg0.field3551 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3454 > 0) {
            if (var7.field3451 > 0) {
                arg0.field3557 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3451 * var9) + 0.5D);
            } else {
                arg0.field3557 += 128;
            }
        }
        if (var7.field3447 != null) {
            if (var7.field3449 > 0) {
                arg0.field3567 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3449 * var9) + 0.5D);
            } else {
                arg0.field3567 += 128;
            }
            while (arg0.field3559 < var7.field3447.length - 2 && arg0.field3567 > (var7.field3447[arg0.field3559 + 2] & 0xFF) << 8) {
                arg0.field3559 += 2;
            }
            if (arg0.field3559 == var7.field3447.length - 2 && var7.field3447[arg0.field3559 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3560 >= 0 && var7.field3446 != null && (this.field3482[arg0.field3558] & 0x1) == 0 && (arg0.field3554 < 0 || this.field3489[arg0.field3558][arg0.field3554] != arg0)) {
            if (var7.field3448 > 0) {
                arg0.field3560 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3448 * var9) + 0.5D);
            } else {
                arg0.field3560 += 128;
            }
            while (arg0.field3561 < var7.field3446.length - 2 && arg0.field3560 > (var7.field3446[arg0.field3561 + 2] & 0xFF) << 8) {
                arg0.field3561 += 2;
            }
            if (arg0.field3561 == var7.field3446.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3564.method904(arg0.field3565, this.method5605(arg0), this.method5567(arg0));
            return false;
        }
        arg0.field3564.method983(arg0.field3565);
        if (arg1 == null) {
            arg0.field3564.method743(arg3);
        } else {
            arg0.field3564.method736(arg1, arg2, arg3);
        }
        if (arg0.field3564.method909()) {
            this.field3496.field3538.method732(arg0.field3564);
        }
        arg0.method5686();
        if (arg0.field3560 >= 0) {
            arg0.method7988();
            if (arg0.field3554 > 0 && this.field3489[arg0.field3558][arg0.field3554] == arg0) {
                this.field3489[arg0.field3558][arg0.field3554] = null;
            }
        }
        return true;
    }
}
