package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mt")
public class class321 extends class50 {

    @ObfuscatedName("mt.ac")
    public class504 field3470 = new class504(128);

    @ObfuscatedName("mt.al")
    public int field3446 = 256;

    @ObfuscatedName("mt.ak")
    public int field3447 = 1000000;

    @ObfuscatedName("mt.ax")
    public int[] field3448 = new int[16];

    @ObfuscatedName("mt.ao")
    public int[] field3449 = new int[16];

    @ObfuscatedName("mt.ah")
    public int[] field3450 = new int[16];

    @ObfuscatedName("mt.ar")
    public int[] field3459 = new int[16];

    @ObfuscatedName("mt.ab")
    public int[] field3452 = new int[16];

    @ObfuscatedName("mt.am")
    public int[] field3445 = new int[16];

    @ObfuscatedName("mt.av")
    public int[] field3454 = new int[16];

    @ObfuscatedName("mt.ag")
    public int[] field3475 = new int[16];

    @ObfuscatedName("mt.aa")
    public int[] field3456 = new int[16];

    @ObfuscatedName("mt.ae")
    public int[] field3458 = new int[16];

    @ObfuscatedName("mt.aw")
    public int[] field3468 = new int[16];

    @ObfuscatedName("mt.aq")
    public int[] field3460 = new int[16];

    @ObfuscatedName("mt.az")
    public int[] field3461 = new int[16];

    @ObfuscatedName("mt.at")
    public int[] field3462 = new int[16];

    @ObfuscatedName("mt.af")
    public int[] field3476 = new int[16];

    @ObfuscatedName("mt.ad")
    public class330[][] field3466 = new class330[16][128];

    @ObfuscatedName("mt.bn")
    public class330[][] field3463 = new class330[16][128];

    @ObfuscatedName("mt.bk")
    public class322 field3453 = new class322();

    @ObfuscatedName("mt.by")
    public boolean field3464;

    @ObfuscatedName("mt.bd")
    public int field3467;

    @ObfuscatedName("mt.be")
    public int field3469;

    @ObfuscatedName("mt.bv")
    public long field3472;

    @ObfuscatedName("mt.ba")
    public long field3471;

    @ObfuscatedName("mt.bz")
    public class328 field3465 = new class328(this);

    @ObfuscatedName("mt.bb")
    public PriorityQueue field3473 = new PriorityQueue(5, new class331());

    @ObfuscatedName("mt.bo")
    public static AtomicBoolean field3474 = null;

    @ObfuscatedName("mt.bp")
    public static ThreadPoolExecutor field3455 = null;

    @ObfuscatedName("mt.bt")
    public int field3451 = 0;

    public class321() {
        this.method5432();
    }

    @ObfuscatedName("mt.ac(IB)V")
    public synchronized void method5411(int arg0) {
        this.field3446 = arg0;
    }

    @ObfuscatedName("mt.al(B)I")
    public int method5412() {
        return this.field3446;
    }

    @ObfuscatedName("mt.ak(Lmk;Lom;Lbl;I)Z")
    public synchronized boolean method5413(class329 arg0, class374 arg1, class46 arg2) {
        boolean var4 = true;
        PriorityQueue var5 = this.field3473;
        synchronized (this.field3473) {
            this.field3473.clear();
        }
        for (class333 var7 = (class333) arg0.field3515.method8091(); var7 != null; var7 = (class333) arg0.field3515.method8092()) {
            int var8 = (int) var7.field4857;
            class325 var9 = (class325) this.field3470.method8104((long) var8);
            if (var9 == null) {
                var9 = class325.method5312(arg1, var8);
                if (var9 == null) {
                    var4 = false;
                    continue;
                }
                this.field3470.method8098(var9, (long) var8);
            }
            if (!var9.method5580(arg2, var7.field3555)) {
                var4 = false;
            } else if (this.field3473 != null) {
                PriorityQueue var10 = this.field3473;
                synchronized (this.field3473) {
                    Iterator var11 = var9.field3504.iterator();
                    while (var11.hasNext()) {
                        class54 var12 = (class54) var11.next();
                        this.field3473.add(new class324(var7.field3556, var12));
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("mt.ax(B)V")
    public void method5419() {
        if (this.field3473 == null) {
            return;
        }
        if (field3474 != null) {
            field3474.set(true);
        }
        field3474 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3474;
        if (field3455 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3455 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class323(this));
        }
        field3455.submit(new class327(this, var1));
    }

    @ObfuscatedName("mt.ao(I)V")
    public synchronized void method5415() {
        for (class325 var1 = (class325) this.field3470.method8091(); var1 != null; var1 = (class325) this.field3470.method8092()) {
            var1.method5574();
        }
    }

    @ObfuscatedName("mt.av(B)V")
    public synchronized void method5470() {
        for (class325 var1 = (class325) this.field3470.method8091(); var1 != null; var1 = (class325) this.field3470.method8092()) {
            var1.method7776();
        }
    }

    @ObfuscatedName("mt.aa(Lmk;ZI)V")
    public synchronized void method5484(class329 arg0, boolean arg1) {
        this.method5417();
        this.field3453.method5516(arg0.field3514);
        this.field3464 = arg1;
        this.field3472 = 0L;
        int var3 = this.field3453.method5560();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3453.method5520(var4);
            this.field3453.method5523(var4);
            this.field3453.method5521(var4);
        }
        this.field3467 = this.field3453.method5522();
        this.field3469 = this.field3453.field3481[this.field3467];
        this.field3471 = this.field3453.method5567(this.field3469);
    }

    @ObfuscatedName("mt.ap(I)V")
    public synchronized void method5417() {
        this.field3453.method5517();
        this.method5432();
    }

    @ObfuscatedName("mt.ay(I)Z")
    public synchronized boolean method5418() {
        return this.field3453.method5570();
    }

    @ObfuscatedName("mt.as(I)Z")
    public synchronized boolean method5475() {
        return this.field3470.method8090() > 0;
    }

    @ObfuscatedName("mt.aj(IIB)V")
    public synchronized void method5420(int arg0, int arg1) {
        this.method5421(arg0, arg1);
    }

    @ObfuscatedName("mt.an(IIS)V")
    public void method5421(int arg0, int arg1) {
        this.field3459[arg0] = arg1;
        this.field3445[arg0] = arg1 & 0xFFFFFF80;
        this.method5422(arg0, arg1);
    }

    @ObfuscatedName("mt.au(III)V")
    public void method5422(int arg0, int arg1) {
        if (this.field3452[arg0] != arg1) {
            this.field3452[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3463[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mt.ai(IIII)V")
    public void method5489(int arg0, int arg1, int arg2) {
        this.method5425(arg0, arg1, 64);
        if ((this.field3458[arg0] & 0x2) != 0) {
            for (class330 var4 = (class330) this.field3465.field3510.method6527(); var4 != null; var4 = (class330) this.field3465.field3510.method6530()) {
                if (var4.field3517 == arg0 && var4.field3525 < 0) {
                    this.field3466[arg0][var4.field3521] = null;
                    this.field3466[arg0][arg1] = var4;
                    int var5 = (var4.field3530 * var4.field3526 >> 12) + var4.field3518;
                    var4.field3518 += arg1 - var4.field3521 << 8;
                    var4.field3530 = var5 - var4.field3518;
                    var4.field3526 = 4096;
                    var4.field3521 = arg1;
                    return;
                }
            }
        }
        class325 var6 = (class325) this.field3470.method8104((long) this.field3452[arg0]);
        if (var6 == null || var6.field3498[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3498[arg1].method1005();
        if (var7 == null) {
            return;
        }
        class330 var8 = new class330();
        var8.field3517 = arg0;
        var8.field3533 = var6;
        var8.field3516 = var7;
        var8.field3519 = var6.field3502[arg1];
        var8.field3520 = var6.field3496[arg1];
        var8.field3521 = arg1;
        var8.field3522 = var6.field3501 * arg2 * arg2 * var6.field3500[arg1] + 1024 >> 11;
        var8.field3523 = var6.field3503[arg1] & 0xFF;
        var8.field3518 = (arg1 << 8) - (var6.field3499[arg1] & 0x7FFF);
        var8.field3527 = 0;
        var8.field3528 = 0;
        var8.field3529 = 0;
        var8.field3525 = -1;
        var8.field3531 = 0;
        if (this.field3461[arg0] == 0) {
            var8.field3524 = class49.method896(var7, this.method5453(var8), this.method5438(var8), this.method5439(var8));
        } else {
            var8.field3524 = class49.method896(var7, this.method5453(var8), 0, this.method5439(var8));
            this.method5424(var8, var6.field3499[arg1] < 0);
        }
        if (var6.field3499[arg1] < 0) {
            var8.field3524.method867(-1);
        }
        if (var8.field3520 >= 0) {
            class330 var9 = this.field3463[arg0][var8.field3520];
            if (var9 != null && var9.field3525 < 0) {
                this.field3466[arg0][var9.field3521] = null;
                var9.field3525 = 0;
            }
            this.field3463[arg0][var8.field3520] = var8;
        }
        this.field3465.field3510.method6526(var8);
        this.field3466[arg0][arg1] = var8;
    }

    @ObfuscatedName("mt.ae(Lms;ZI)V")
    public void method5424(class330 arg0, boolean arg1) {
        int var3 = arg0.field3516.field279.length;
        int var5;
        if (arg1 && arg0.field3516.field280) {
            int var4 = var3 + var3 - arg0.field3516.field277;
            var5 = (int) ((long) this.field3461[arg0.field3517] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3524.method856(true);
            }
        } else {
            var5 = (int) ((long) this.field3461[arg0.field3517] * (long) var3 >> 6);
        }
        arg0.field3524.method855(var5);
    }

    @ObfuscatedName("mt.aw(IIII)V")
    public void method5425(int arg0, int arg1, int arg2) {
        class330 var4 = this.field3466[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3466[arg0][arg1] = null;
        if ((this.field3458[arg0] & 0x2) == 0) {
            var4.field3525 = 0;
            return;
        }
        for (class330 var5 = (class330) this.field3465.field3510.method6532(); var5 != null; var5 = (class330) this.field3465.field3510.method6543()) {
            if (var4.field3517 == var5.field3517 && var5.field3525 < 0 && var4 != var5) {
                var4.field3525 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mt.aq(IIII)V")
    public void method5478(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mt.bb(III)V")
    public void method5427(int arg0, int arg1) {
    }

    @ObfuscatedName("mt.bo(III)V")
    public void method5428(int arg0, int arg1) {
        this.field3454[arg0] = arg1;
    }

    @ObfuscatedName("mt.bp(IB)V")
    public void method5429(int arg0) {
        for (class330 var2 = (class330) this.field3465.field3510.method6532(); var2 != null; var2 = (class330) this.field3465.field3510.method6543()) {
            if (arg0 < 0 || var2.field3517 == arg0) {
                if (var2.field3524 != null) {
                    var2.field3524.method860(Statics.field307 / 100);
                    if (var2.field3524.method870()) {
                        this.field3465.field3513.method725(var2.field3524);
                    }
                    var2.method5596();
                }
                if (var2.field3525 < 0) {
                    this.field3466[var2.field3517][var2.field3521] = null;
                }
                var2.method7776();
            }
        }
    }

    @ObfuscatedName("mt.bm(IB)V")
    public void method5430(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5430(var2);
            }
            return;
        }
        this.field3448[arg0] = 12800;
        this.field3449[arg0] = 8192;
        this.field3450[arg0] = 16383;
        this.field3454[arg0] = 8192;
        this.field3475[arg0] = 0;
        this.field3456[arg0] = 8192;
        this.method5441(arg0);
        this.method5502(arg0);
        this.field3458[arg0] = 0;
        this.field3468[arg0] = 32767;
        this.field3460[arg0] = 256;
        this.field3461[arg0] = 0;
        this.method5442(arg0, 8192);
    }

    @ObfuscatedName("mt.br(II)V")
    public void method5431(int arg0) {
        for (class330 var2 = (class330) this.field3465.field3510.method6532(); var2 != null; var2 = (class330) this.field3465.field3510.method6543()) {
            if ((arg0 < 0 || var2.field3517 == arg0) && var2.field3525 < 0) {
                this.field3466[var2.field3517][var2.field3521] = null;
                var2.field3525 = 0;
            }
        }
    }

    @ObfuscatedName("mt.bc(I)V")
    public void method5432() {
        this.method5429(-1);
        this.method5430(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3452[var1] = this.field3459[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3445[var2] = this.field3459[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mt.bu(II)V")
    public void method5441(int arg0) {
        if ((this.field3458[arg0] & 0x2) == 0) {
            return;
        }
        for (class330 var2 = (class330) this.field3465.field3510.method6532(); var2 != null; var2 = (class330) this.field3465.field3510.method6543()) {
            if (var2.field3517 == arg0 && this.field3466[arg0][var2.field3521] == null && var2.field3525 < 0) {
                var2.field3525 = 0;
            }
        }
    }

    @ObfuscatedName("mt.bf(IB)V")
    public void method5502(int arg0) {
        if ((this.field3458[arg0] & 0x4) == 0) {
            return;
        }
        for (class330 var2 = (class330) this.field3465.field3510.method6532(); var2 != null; var2 = (class330) this.field3465.field3510.method6543()) {
            if (var2.field3517 == arg0) {
                var2.field3536 = 0;
            }
        }
    }

    @ObfuscatedName("mt.bh(II)V")
    public void method5435(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5425(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5489(var6, var7, var8);
            } else {
                this.method5425(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5478(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3445[var12] = (var14 << 14) + (this.field3445[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3445[var12] = (var14 << 7) + (this.field3445[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3475[var12] = (var14 << 7) + (this.field3475[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3475[var12] = (this.field3475[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3456[var12] = (var14 << 7) + (this.field3456[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3456[var12] = (this.field3456[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3448[var12] = (var14 << 7) + (this.field3448[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3448[var12] = (this.field3448[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3449[var12] = (var14 << 7) + (this.field3449[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3449[var12] = (this.field3449[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3450[var12] = (var14 << 7) + (this.field3450[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3450[var12] = (this.field3450[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3458[var12] |= 0x1;
                } else {
                    this.field3458[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3458[var12] |= 0x2;
                } else {
                    this.method5441(var12);
                    this.field3458[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3468[var12] = (var14 << 7) + (this.field3468[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3468[var12] = (this.field3468[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3468[var12] = (var14 << 7) + (this.field3468[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3468[var12] = (this.field3468[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5429(var12);
            }
            if (var13 == 121) {
                this.method5430(var12);
            }
            if (var13 == 123) {
                this.method5431(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3468[var12];
                if (var15 == 16384) {
                    this.field3460[var12] = (var14 << 7) + (this.field3460[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3468[var12];
                if (var16 == 16384) {
                    this.field3460[var12] = (this.field3460[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3461[var12] = (var14 << 7) + (this.field3461[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3461[var12] = (this.field3461[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3458[var12] |= 0x4;
                } else {
                    this.method5502(var12);
                    this.field3458[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5442(var12, (var14 << 7) + (this.field3462[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5442(var12, (this.field3462[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5422(var17, this.field3445[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5427(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5428(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5432();
            }
        }
    }

    @ObfuscatedName("mt.bl(III)V")
    public void method5442(int arg0, int arg1) {
        this.field3462[arg0] = arg1;
        this.field3476[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mt.bg(Lms;S)I")
    public int method5453(class330 arg0) {
        int var2 = (arg0.field3530 * arg0.field3526 >> 12) + arg0.field3518;
        int var3 = ((this.field3454[arg0.field3517] - 8192) * this.field3460[arg0.field3517] >> 12) + var2;
        class319 var4 = arg0.field3519;
        if (var4.field3425 > 0 && (var4.field3424 > 0 || this.field3475[arg0.field3517] > 0)) {
            int var5 = var4.field3424 << 2;
            int var6 = var4.field3427 << 1;
            if (arg0.field3532 < var6) {
                var5 = arg0.field3532 * var5 / var6;
            }
            int var7 = (this.field3475[arg0.field3517] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3535 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3516.field278 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field307 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mt.bj(Lms;B)I")
    public int method5438(class330 arg0) {
        class319 var2 = arg0.field3519;
        int var3 = this.field3450[arg0.field3517] * this.field3448[arg0.field3517] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3522 * var4 + 16384 >> 15;
        int var6 = this.field3446 * var5 + 128 >> 8;
        if (var2.field3420 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3527 * 1.953125E-5D * (double) var2.field3420) + 0.5D);
        }
        if (var2.field3421 != null) {
            int var7 = arg0.field3528;
            int var8 = var2.field3421[arg0.field3529 + 1];
            if (arg0.field3529 < var2.field3421.length - 2) {
                int var9 = (var2.field3421[arg0.field3529] & 0xFF) << 8;
                int var10 = (var2.field3421[arg0.field3529 + 2] & 0xFF) << 8;
                var8 += (var2.field3421[arg0.field3529 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3525 > 0 && var2.field3419 != null) {
            int var11 = arg0.field3525;
            int var12 = var2.field3419[arg0.field3531 + 1];
            if (arg0.field3531 < var2.field3419.length - 2) {
                int var13 = (var2.field3419[arg0.field3531] & 0xFF) << 8;
                int var14 = (var2.field3419[arg0.field3531 + 2] & 0xFF) << 8;
                var12 += (var2.field3419[arg0.field3531 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mt.bx(Lms;B)I")
    public int method5439(class330 arg0) {
        int var2 = this.field3449[arg0.field3517];
        return var2 < 8192 ? arg0.field3523 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3523) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mt.ah()Lbi;")
    public synchronized class50 method696() {
        return this.field3465;
    }

    @ObfuscatedName("mt.ar()Lbi;")
    public synchronized class50 method729() {
        return null;
    }

    @ObfuscatedName("mt.ab()I")
    public synchronized int method698() {
        return 0;
    }

    @ObfuscatedName("mt.am([III)V")
    public synchronized void method699(int[] arg0, int arg1, int arg2) {
        if (this.field3453.method5570()) {
            int var4 = this.field3447 * this.field3453.field3485 / Statics.field307;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3472;
                if (this.field3471 - var5 >= 0L) {
                    this.field3472 = var5;
                    break;
                }
                int var7 = (int) ((this.field3471 - this.field3472 + (long) var4 - 1L) / (long) var4);
                this.field3472 += (long) var4 * (long) var7;
                this.field3465.method699(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5443();
            } while (this.field3453.method5570());
        }
        this.field3465.method699(arg0, arg1, arg2);
    }

    @ObfuscatedName("mt.ag(I)V")
    public synchronized void method691(int arg0) {
        if (this.field3453.method5570()) {
            int var2 = this.field3447 * this.field3453.field3485 / Statics.field307;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3472;
                if (this.field3471 - var3 >= 0L) {
                    this.field3472 = var3;
                    break;
                }
                int var5 = (int) ((this.field3471 - this.field3472 + (long) var2 - 1L) / (long) var2);
                this.field3472 += (long) var2 * (long) var5;
                this.field3465.method691(var5);
                arg0 -= var5;
                this.method5443();
            } while (this.field3453.method5570());
        }
        this.field3465.method691(arg0);
    }

    @ObfuscatedName("mt.bi(I)V")
    public void method5443() {
        int var1 = this.field3467;
        int var2 = this.field3469;
        long var3 = this.field3471;
        while (this.field3469 == var2) {
            while (this.field3453.field3481[var1] == var2) {
                this.field3453.method5520(var1);
                int var5 = this.field3453.method5524(var1);
                if (var5 == 1) {
                    this.field3453.method5568();
                    this.field3453.method5521(var1);
                    if (this.field3453.method5529()) {
                        if (!this.field3464 || var2 == 0) {
                            this.method5432();
                            this.field3453.method5517();
                            return;
                        }
                        this.field3453.method5530(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5435(var5);
                }
                this.field3453.method5523(var1);
                this.field3453.method5521(var1);
            }
            var1 = this.field3453.method5522();
            var2 = this.field3453.field3481[var1];
            var3 = this.field3453.method5567(var2);
        }
        this.field3467 = var1;
        this.field3469 = var2;
        this.field3471 = var3;
    }

    @ObfuscatedName("mt.bq(Lms;B)Z")
    public boolean method5471(class330 arg0) {
        if (arg0.field3524 != null) {
            return false;
        }
        if (arg0.field3525 >= 0) {
            arg0.method7776();
            if (arg0.field3520 > 0 && this.field3463[arg0.field3517][arg0.field3520] == arg0) {
                this.field3463[arg0.field3517][arg0.field3520] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mt.bw(Lms;[IIIS)Z")
    public boolean method5445(class330 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3537 = Statics.field307 / 100;
        if (arg0.field3525 >= 0 && arg0.field3524 == null || arg0.field3524.method863()) {
            arg0.method5596();
            arg0.method7776();
            if (arg0.field3520 > 0 && this.field3463[arg0.field3517][arg0.field3520] == arg0) {
                this.field3463[arg0.field3517][arg0.field3520] = null;
            }
            return true;
        }
        int var5 = arg0.field3526;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3456[arg0.field3517] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3526 = var6;
        }
        arg0.field3524.method861(this.method5453(arg0));
        class319 var7 = arg0.field3519;
        boolean var8 = false;
        arg0.field3532++;
        arg0.field3535 += var7.field3425;
        double var9 = (double) ((arg0.field3521 - 60 << 8) + (arg0.field3530 * arg0.field3526 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3420 > 0) {
            if (var7.field3422 > 0) {
                arg0.field3527 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3422 * var9) + 0.5D);
            } else {
                arg0.field3527 += 128;
            }
        }
        if (var7.field3421 != null) {
            if (var7.field3426 > 0) {
                arg0.field3528 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3426 * var9) + 0.5D);
            } else {
                arg0.field3528 += 128;
            }
            while (arg0.field3529 < var7.field3421.length - 2 && arg0.field3528 > (var7.field3421[arg0.field3529 + 2] & 0xFF) << 8) {
                arg0.field3529 += 2;
            }
            if (arg0.field3529 == var7.field3421.length - 2 && var7.field3421[arg0.field3529 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3525 >= 0 && var7.field3419 != null && (this.field3458[arg0.field3517] & 0x1) == 0 && (arg0.field3520 < 0 || this.field3463[arg0.field3517][arg0.field3520] != arg0)) {
            if (var7.field3418 > 0) {
                arg0.field3525 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3418 * var9) + 0.5D);
            } else {
                arg0.field3525 += 128;
            }
            while (arg0.field3531 < var7.field3419.length - 2 && arg0.field3525 > (var7.field3419[arg0.field3531 + 2] & 0xFF) << 8) {
                arg0.field3531 += 2;
            }
            if (arg0.field3531 == var7.field3419.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3524.method859(arg0.field3537, this.method5438(arg0), this.method5439(arg0));
            return false;
        }
        arg0.field3524.method860(arg0.field3537);
        if (arg1 == null) {
            arg0.field3524.method691(arg3);
        } else {
            arg0.field3524.method699(arg1, arg2, arg3);
        }
        if (arg0.field3524.method870()) {
            this.field3465.field3513.method725(arg0.field3524);
        }
        arg0.method5596();
        if (arg0.field3525 >= 0) {
            arg0.method7776();
            if (arg0.field3520 > 0 && this.field3463[arg0.field3517][arg0.field3520] == arg0) {
                this.field3463[arg0.field3517][arg0.field3520] = null;
            }
        }
        return true;
    }
}
