package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("lc")
public class class308 extends class50 {

    @ObfuscatedName("lc.aw")
    public class490 field3412 = new class490(128);

    @ObfuscatedName("lc.ay")
    public int field3421 = 256;

    @ObfuscatedName("lc.ar")
    public int field3411 = 1000000;

    @ObfuscatedName("lc.am")
    public int[] field3413 = new int[16];

    @ObfuscatedName("lc.as")
    public int[] field3414 = new int[16];

    @ObfuscatedName("lc.aj")
    public int[] field3426 = new int[16];

    @ObfuscatedName("lc.ag")
    public int[] field3416 = new int[16];

    @ObfuscatedName("lc.az")
    public int[] field3415 = new int[16];

    @ObfuscatedName("lc.av")
    public int[] field3422 = new int[16];

    @ObfuscatedName("lc.ap")
    public int[] field3410 = new int[16];

    @ObfuscatedName("lc.aq")
    public int[] field3420 = new int[16];

    @ObfuscatedName("lc.at")
    public int[] field3433 = new int[16];

    @ObfuscatedName("lc.ao")
    public int[] field3434 = new int[16];

    @ObfuscatedName("lc.ac")
    public int[] field3423 = new int[16];

    @ObfuscatedName("lc.ak")
    public int[] field3424 = new int[16];

    @ObfuscatedName("lc.an")
    public int[] field3425 = new int[16];

    @ObfuscatedName("lc.af")
    public int[] field3418 = new int[16];

    @ObfuscatedName("lc.ai")
    public int[] field3441 = new int[16];

    @ObfuscatedName("lc.al")
    public class317[][] field3428 = new class317[16][128];

    @ObfuscatedName("lc.bd")
    public class317[][] field3429 = new class317[16][128];

    @ObfuscatedName("lc.bb")
    public class309 field3430 = new class309();

    @ObfuscatedName("lc.bn")
    public boolean field3431;

    @ObfuscatedName("lc.ba")
    public int field3432;

    @ObfuscatedName("lc.bf")
    public int field3427;

    @ObfuscatedName("lc.bs")
    public long field3417;

    @ObfuscatedName("lc.bp")
    public long field3435;

    @ObfuscatedName("lc.bv")
    public class315 field3436 = new class315(this);

    @ObfuscatedName("lc.bq")
    public PriorityQueue field3437 = new PriorityQueue(5, new class318());

    @ObfuscatedName("lc.bo")
    public static AtomicBoolean field3438 = null;

    @ObfuscatedName("lc.br")
    public static ThreadPoolExecutor field3439 = null;

    @ObfuscatedName("lc.bw")
    public int field3440 = 0;

    public class308() {
        this.method5307();
    }

    @ObfuscatedName("lc.aw(IB)V")
    public synchronized void method5256(int arg0) {
        this.field3421 = arg0;
    }

    @ObfuscatedName("lc.ay(I)I")
    public int method5257() {
        return this.field3421;
    }

    @ObfuscatedName("lc.ar(Lmp;Lnd;Lbh;S)Z")
    public synchronized boolean method5258(class316 arg0, class360 arg1, class46 arg2) {
        boolean var4 = true;
        PriorityQueue var5 = this.field3437;
        synchronized (this.field3437) {
            this.field3437.clear();
        }
        for (class320 var7 = (class320) arg0.field3484.method7983(); var7 != null; var7 = (class320) arg0.field3484.method7991()) {
            int var8 = (int) var7.field4819;
            class312 var9 = (class312) this.field3412.method7981((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method6123(var8);
                class312 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class312(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var4 = false;
                    continue;
                }
                this.field3412.method7990(var11, (long) var8);
            }
            if (!var9.method5433(arg2, var7.field3521)) {
                var4 = false;
            } else if (this.field3437 != null) {
                PriorityQueue var12 = this.field3437;
                synchronized (this.field3437) {
                    Iterator var13 = var9.field3472.iterator();
                    while (var13.hasNext()) {
                        class54 var14 = (class54) var13.next();
                        this.field3437.add(new class311(var7.field3520, var14));
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("lc.am(I)V")
    public void method5281() {
        if (this.field3437 == null) {
            return;
        }
        if (field3438 != null) {
            field3438.set(true);
        }
        field3438 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3438;
        if (field3439 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3439 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class310(this));
        }
        field3439.submit(new class314(this, var1));
    }

    @ObfuscatedName("lc.as(B)V")
    public synchronized void method5260() {
        for (class312 var1 = (class312) this.field3412.method7983(); var1 != null; var1 = (class312) this.field3412.method7991()) {
            var1.method5436();
        }
    }

    @ObfuscatedName("lc.ap(B)V")
    public synchronized void method5261() {
        for (class312 var1 = (class312) this.field3412.method7983(); var1 != null; var1 = (class312) this.field3412.method7991()) {
            var1.method7662();
        }
    }

    @ObfuscatedName("lc.at(Lmp;ZI)V")
    public synchronized void method5293(class316 arg0, boolean arg1) {
        this.method5263();
        this.field3430.method5369(arg0.field3485);
        this.field3431 = arg1;
        this.field3417 = 0L;
        int var3 = this.field3430.method5371();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3430.method5372(var4);
            this.field3430.method5375(var4);
            this.field3430.method5373(var4);
        }
        this.field3432 = this.field3430.method5425();
        this.field3427 = this.field3430.field3447[this.field3432];
        this.field3435 = this.field3430.method5379(this.field3427);
    }

    @ObfuscatedName("lc.ah(B)V")
    public synchronized void method5263() {
        this.field3430.method5389();
        this.method5307();
    }

    @ObfuscatedName("lc.ax(B)Z")
    public synchronized boolean method5264() {
        return this.field3430.method5406();
    }

    @ObfuscatedName("lc.aa(I)Z")
    public synchronized boolean method5350() {
        return this.field3412.method7989() > 0;
    }

    @ObfuscatedName("lc.au(III)V")
    public synchronized void method5266(int arg0, int arg1) {
        this.method5332(arg0, arg1);
    }

    @ObfuscatedName("lc.ae(III)V")
    public void method5332(int arg0, int arg1) {
        this.field3416[arg0] = arg1;
        this.field3422[arg0] = arg1 & 0xFFFFFF80;
        this.method5268(arg0, arg1);
    }

    @ObfuscatedName("lc.ab(III)V")
    public void method5268(int arg0, int arg1) {
        if (this.field3415[arg0] != arg1) {
            this.field3415[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3429[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("lc.ad(IIII)V")
    public void method5329(int arg0, int arg1, int arg2) {
        this.method5271(arg0, arg1, 64);
        if ((this.field3434[arg0] & 0x2) != 0) {
            for (class317 var4 = (class317) this.field3436.field3482.method6382(); var4 != null; var4 = (class317) this.field3436.field3482.method6391()) {
                if (var4.field3495 == arg0 && var4.field3500 < 0) {
                    this.field3428[arg0][var4.field3491] = null;
                    this.field3428[arg0][arg1] = var4;
                    int var5 = (var4.field3496 * var4.field3489 >> 12) + var4.field3504;
                    var4.field3504 += arg1 - var4.field3491 << 8;
                    var4.field3489 = var5 - var4.field3504;
                    var4.field3496 = 4096;
                    var4.field3491 = arg1;
                    return;
                }
            }
        }
        class312 var6 = (class312) this.field3412.method7981((long) this.field3415[arg0]);
        if (var6 == null || var6.field3467[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3467[arg1].method1028();
        if (var7 == null) {
            return;
        }
        class317 var8 = new class317();
        var8.field3495 = arg0;
        var8.field3490 = var6;
        var8.field3488 = var7;
        var8.field3505 = var6.field3470[arg1];
        var8.field3493 = var6.field3469[arg1];
        var8.field3491 = arg1;
        var8.field3492 = var6.field3471 * arg2 * arg2 * var6.field3468[arg1] + 1024 >> 11;
        var8.field3486 = var6.field3473[arg1] & 0xFF;
        var8.field3504 = (arg1 << 8) - (var6.field3466[arg1] & 0x7FFF);
        var8.field3494 = 0;
        var8.field3498 = 0;
        var8.field3499 = 0;
        var8.field3500 = -1;
        var8.field3501 = 0;
        if (this.field3425[arg0] == 0) {
            var8.field3497 = class49.method858(var7, this.method5356(var8), this.method5364(var8), this.method5285(var8));
        } else {
            var8.field3497 = class49.method858(var7, this.method5356(var8), 0, this.method5285(var8));
            this.method5270(var8, var6.field3466[arg1] < 0);
        }
        if (var6.field3466[arg1] < 0) {
            var8.field3497.method860(-1);
        }
        if (var8.field3493 >= 0) {
            class317 var9 = this.field3429[arg0][var8.field3493];
            if (var9 != null && var9.field3500 < 0) {
                this.field3428[arg0][var9.field3491] = null;
                var9.field3500 = 0;
            }
            this.field3429[arg0][var8.field3493] = var8;
        }
        this.field3436.field3482.method6367(var8);
        this.field3428[arg0][arg1] = var8;
    }

    @ObfuscatedName("lc.ao(Lmw;ZI)V")
    public void method5270(class317 arg0, boolean arg1) {
        int var3 = arg0.field3488.field286.length;
        int var5;
        if (arg1 && arg0.field3488.field283) {
            int var4 = var3 + var3 - arg0.field3488.field285;
            var5 = (int) ((long) this.field3425[arg0.field3495] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3497.method967(true);
            }
        } else {
            var5 = (int) ((long) this.field3425[arg0.field3495] * (long) var3 >> 6);
        }
        arg0.field3497.method944(var5);
    }

    @ObfuscatedName("lc.ac(IIII)V")
    public void method5271(int arg0, int arg1, int arg2) {
        class317 var4 = this.field3428[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3428[arg0][arg1] = null;
        if ((this.field3434[arg0] & 0x2) == 0) {
            var4.field3500 = 0;
            return;
        }
        for (class317 var5 = (class317) this.field3436.field3482.method6393(); var5 != null; var5 = (class317) this.field3436.field3482.method6374()) {
            if (var4.field3495 == var5.field3495 && var5.field3500 < 0 && var4 != var5) {
                var4.field3500 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("lc.ak(IIII)V")
    public void method5272(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("lc.an(IIB)V")
    public void method5273(int arg0, int arg1) {
    }

    @ObfuscatedName("lc.af(III)V")
    public void method5274(int arg0, int arg1) {
        this.field3410[arg0] = arg1;
    }

    @ObfuscatedName("lc.ai(II)V")
    public void method5303(int arg0) {
        for (class317 var2 = (class317) this.field3436.field3482.method6393(); var2 != null; var2 = (class317) this.field3436.field3482.method6374()) {
            if (arg0 < 0 || var2.field3495 == arg0) {
                if (var2.field3497 != null) {
                    var2.field3497.method871(Statics.field315 / 100);
                    if (var2.field3497.method986()) {
                        this.field3436.field3483.method693(var2.field3497);
                    }
                    var2.method5454();
                }
                if (var2.field3500 < 0) {
                    this.field3428[var2.field3495][var2.field3491] = null;
                }
                var2.method7662();
            }
        }
    }

    @ObfuscatedName("lc.al(II)V")
    public void method5276(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5276(var2);
            }
            return;
        }
        this.field3413[arg0] = 12800;
        this.field3414[arg0] = 8192;
        this.field3426[arg0] = 16383;
        this.field3410[arg0] = 8192;
        this.field3420[arg0] = 0;
        this.field3433[arg0] = 8192;
        this.method5279(arg0);
        this.method5280(arg0);
        this.field3434[arg0] = 0;
        this.field3423[arg0] = 32767;
        this.field3424[arg0] = 256;
        this.field3425[arg0] = 0;
        this.method5282(arg0, 8192);
    }

    @ObfuscatedName("lc.bd(II)V")
    public void method5277(int arg0) {
        for (class317 var2 = (class317) this.field3436.field3482.method6393(); var2 != null; var2 = (class317) this.field3436.field3482.method6374()) {
            if ((arg0 < 0 || var2.field3495 == arg0) && var2.field3500 < 0) {
                this.field3428[var2.field3495][var2.field3491] = null;
                var2.field3500 = 0;
            }
        }
    }

    @ObfuscatedName("lc.bb(I)V")
    public void method5307() {
        this.method5303(-1);
        this.method5276(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3415[var1] = this.field3416[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3422[var2] = this.field3416[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("lc.bc(II)V")
    public void method5279(int arg0) {
        if ((this.field3434[arg0] & 0x2) == 0) {
            return;
        }
        for (class317 var2 = (class317) this.field3436.field3482.method6393(); var2 != null; var2 = (class317) this.field3436.field3482.method6374()) {
            if (var2.field3495 == arg0 && this.field3428[arg0][var2.field3491] == null && var2.field3500 < 0) {
                var2.field3500 = 0;
            }
        }
    }

    @ObfuscatedName("lc.bi(II)V")
    public void method5280(int arg0) {
        if ((this.field3434[arg0] & 0x4) == 0) {
            return;
        }
        for (class317 var2 = (class317) this.field3436.field3482.method6393(); var2 != null; var2 = (class317) this.field3436.field3482.method6374()) {
            if (var2.field3495 == arg0) {
                var2.field3506 = 0;
            }
        }
    }

    @ObfuscatedName("lc.bu(IB)V")
    public void method5304(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5271(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5329(var6, var7, var8);
            } else {
                this.method5271(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5272(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3422[var12] = (var14 << 14) + (this.field3422[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3422[var12] = (var14 << 7) + (this.field3422[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3420[var12] = (var14 << 7) + (this.field3420[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3420[var12] = (this.field3420[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3433[var12] = (var14 << 7) + (this.field3433[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3433[var12] = (this.field3433[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3413[var12] = (var14 << 7) + (this.field3413[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3413[var12] = (this.field3413[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3414[var12] = (var14 << 7) + (this.field3414[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3414[var12] = (this.field3414[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3426[var12] = (var14 << 7) + (this.field3426[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3426[var12] = (this.field3426[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3434[var12] |= 0x1;
                } else {
                    this.field3434[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3434[var12] |= 0x2;
                } else {
                    this.method5279(var12);
                    this.field3434[var12] &= 0xFFFFFFFD;
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
                this.method5303(var12);
            }
            if (var13 == 121) {
                this.method5276(var12);
            }
            if (var13 == 123) {
                this.method5277(var12);
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
                    this.field3434[var12] |= 0x4;
                } else {
                    this.method5280(var12);
                    this.field3434[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5282(var12, (var14 << 7) + (this.field3418[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5282(var12, (this.field3418[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5268(var17, this.field3422[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5273(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5274(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5307();
            }
        }
    }

    @ObfuscatedName("lc.bk(III)V")
    public void method5282(int arg0, int arg1) {
        this.field3418[arg0] = arg1;
        this.field3441[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("lc.bh(Lmw;I)I")
    public int method5356(class317 arg0) {
        int var2 = (arg0.field3496 * arg0.field3489 >> 12) + arg0.field3504;
        int var3 = ((this.field3410[arg0.field3495] - 8192) * this.field3424[arg0.field3495] >> 12) + var2;
        class306 var4 = arg0.field3505;
        if (var4.field3388 > 0 && (var4.field3387 > 0 || this.field3420[arg0.field3495] > 0)) {
            int var5 = var4.field3387 << 2;
            int var6 = var4.field3389 << 1;
            if (arg0.field3502 < var6) {
                var5 = arg0.field3502 * var5 / var6;
            }
            int var7 = (this.field3420[arg0.field3495] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3503 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3488.field284 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field315 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("lc.bm(Lmw;B)I")
    public int method5364(class317 arg0) {
        class306 var2 = arg0.field3505;
        int var3 = this.field3426[arg0.field3495] * this.field3413[arg0.field3495] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3492 * var4 + 16384 >> 15;
        int var6 = this.field3421 * var5 + 128 >> 8;
        if (var2.field3383 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3494 * 1.953125E-5D * (double) var2.field3383) + 0.5D);
        }
        if (var2.field3382 != null) {
            int var7 = arg0.field3498;
            int var8 = var2.field3382[arg0.field3499 + 1];
            if (arg0.field3499 < var2.field3382.length - 2) {
                int var9 = (var2.field3382[arg0.field3499] & 0xFF) << 8;
                int var10 = (var2.field3382[arg0.field3499 + 2] & 0xFF) << 8;
                var8 += (var2.field3382[arg0.field3499 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3500 > 0 && var2.field3381 != null) {
            int var11 = arg0.field3500;
            int var12 = var2.field3381[arg0.field3501 + 1];
            if (arg0.field3501 < var2.field3381.length - 2) {
                int var13 = (var2.field3381[arg0.field3501] & 0xFF) << 8;
                int var14 = (var2.field3381[arg0.field3501 + 2] & 0xFF) << 8;
                var12 += (var2.field3381[arg0.field3501 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("lc.bl(Lmw;B)I")
    public int method5285(class317 arg0) {
        int var2 = this.field3414[arg0.field3495];
        return var2 < 8192 ? arg0.field3486 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3486) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("lc.aj()Lby;")
    public synchronized class50 method739() {
        return this.field3436;
    }

    @ObfuscatedName("lc.ag()Lby;")
    public synchronized class50 method694() {
        return null;
    }

    @ObfuscatedName("lc.az()I")
    public synchronized int method700() {
        return 0;
    }

    @ObfuscatedName("lc.av([III)V")
    public synchronized void method701(int[] arg0, int arg1, int arg2) {
        if (this.field3430.method5406()) {
            int var4 = this.field3411 * this.field3430.field3444 / Statics.field315;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3417;
                if (this.field3435 - var5 >= 0L) {
                    this.field3417 = var5;
                    break;
                }
                int var7 = (int) ((this.field3435 - this.field3417 + (long) var4 - 1L) / (long) var4);
                this.field3417 += (long) var4 * (long) var7;
                this.field3436.method701(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5287();
            } while (this.field3430.method5406());
        }
        this.field3436.method701(arg0, arg1, arg2);
    }

    @ObfuscatedName("lc.aq(I)V")
    public synchronized void method713(int arg0) {
        if (this.field3430.method5406()) {
            int var2 = this.field3411 * this.field3430.field3444 / Statics.field315;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3417;
                if (this.field3435 - var3 >= 0L) {
                    this.field3417 = var3;
                    break;
                }
                int var5 = (int) ((this.field3435 - this.field3417 + (long) var2 - 1L) / (long) var2);
                this.field3417 += (long) var2 * (long) var5;
                this.field3436.method713(var5);
                arg0 -= var5;
                this.method5287();
            } while (this.field3430.method5406());
        }
        this.field3436.method713(arg0);
    }

    @ObfuscatedName("lc.bt(B)V")
    public void method5287() {
        int var1 = this.field3432;
        int var2 = this.field3427;
        long var3 = this.field3435;
        while (this.field3427 == var2) {
            while (this.field3430.field3447[var1] == var2) {
                this.field3430.method5372(var1);
                int var5 = this.field3430.method5376(var1);
                if (var5 == 1) {
                    this.field3430.method5374();
                    this.field3430.method5373(var1);
                    if (this.field3430.method5424()) {
                        if (!this.field3431 || var2 == 0) {
                            this.method5307();
                            this.field3430.method5389();
                            return;
                        }
                        this.field3430.method5368(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5304(var5);
                }
                this.field3430.method5375(var1);
                this.field3430.method5373(var1);
            }
            var1 = this.field3430.method5425();
            var2 = this.field3430.field3447[var1];
            var3 = this.field3430.method5379(var2);
        }
        this.field3432 = var1;
        this.field3427 = var2;
        this.field3435 = var3;
    }

    @ObfuscatedName("lc.bg(Lmw;I)Z")
    public boolean method5288(class317 arg0) {
        if (arg0.field3497 != null) {
            return false;
        }
        if (arg0.field3500 >= 0) {
            arg0.method7662();
            if (arg0.field3493 > 0 && this.field3429[arg0.field3495][arg0.field3493] == arg0) {
                this.field3429[arg0.field3495][arg0.field3493] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("lc.bj(Lmw;[IIIS)Z")
    public boolean method5289(class317 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3487 = Statics.field315 / 100;
        if (arg0.field3500 >= 0 && arg0.field3497 == null || arg0.field3497.method874()) {
            arg0.method5454();
            arg0.method7662();
            if (arg0.field3493 > 0 && this.field3429[arg0.field3495][arg0.field3493] == arg0) {
                this.field3429[arg0.field3495][arg0.field3493] = null;
            }
            return true;
        }
        int var5 = arg0.field3496;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3433[arg0.field3495] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3496 = var6;
        }
        arg0.field3497.method872(this.method5356(arg0));
        class306 var7 = arg0.field3505;
        boolean var8 = false;
        arg0.field3502++;
        arg0.field3503 += var7.field3388;
        double var9 = (double) ((arg0.field3491 - 60 << 8) + (arg0.field3496 * arg0.field3489 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3383 > 0) {
            if (var7.field3392 > 0) {
                arg0.field3494 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3392 * var9) + 0.5D);
            } else {
                arg0.field3494 += 128;
            }
        }
        if (var7.field3382 != null) {
            if (var7.field3384 > 0) {
                arg0.field3498 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3384 * var9) + 0.5D);
            } else {
                arg0.field3498 += 128;
            }
            while (arg0.field3499 < var7.field3382.length - 2 && arg0.field3498 > (var7.field3382[arg0.field3499 + 2] & 0xFF) << 8) {
                arg0.field3499 += 2;
            }
            if (arg0.field3499 == var7.field3382.length - 2 && var7.field3382[arg0.field3499 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3500 >= 0 && var7.field3381 != null && (this.field3434[arg0.field3495] & 0x1) == 0 && (arg0.field3493 < 0 || this.field3429[arg0.field3495][arg0.field3493] != arg0)) {
            if (var7.field3386 > 0) {
                arg0.field3500 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3386 * var9) + 0.5D);
            } else {
                arg0.field3500 += 128;
            }
            while (arg0.field3501 < var7.field3381.length - 2 && arg0.field3500 > (var7.field3381[arg0.field3501 + 2] & 0xFF) << 8) {
                arg0.field3501 += 2;
            }
            if (arg0.field3501 == var7.field3381.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3497.method870(arg0.field3487, this.method5364(arg0), this.method5285(arg0));
            return false;
        }
        arg0.field3497.method871(arg0.field3487);
        if (arg1 == null) {
            arg0.field3497.method713(arg3);
        } else {
            arg0.field3497.method701(arg1, arg2, arg3);
        }
        if (arg0.field3497.method986()) {
            this.field3436.field3483.method693(arg0.field3497);
        }
        arg0.method5454();
        if (arg0.field3500 >= 0) {
            arg0.method7662();
            if (arg0.field3493 > 0 && this.field3429[arg0.field3495][arg0.field3493] == arg0) {
                this.field3429[arg0.field3495][arg0.field3493] = null;
            }
        }
        return true;
    }
}
