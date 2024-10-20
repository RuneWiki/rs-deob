package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("lf")
public class class307 extends class50 {

    @ObfuscatedName("lf.au")
    public class489 field3443 = new class489(128);

    @ObfuscatedName("lf.ae")
    public int field3415 = 256;

    @ObfuscatedName("lf.ao")
    public int field3423 = 1000000;

    @ObfuscatedName("lf.at")
    public int[] field3417 = new int[16];

    @ObfuscatedName("lf.ac")
    public int[] field3418 = new int[16];

    @ObfuscatedName("lf.ai")
    public int[] field3419 = new int[16];

    @ObfuscatedName("lf.az")
    public int[] field3420 = new int[16];

    @ObfuscatedName("lf.ap")
    public int[] field3421 = new int[16];

    @ObfuscatedName("lf.aa")
    public int[] field3426 = new int[16];

    @ObfuscatedName("lf.af")
    public int[] field3432 = new int[16];

    @ObfuscatedName("lf.ad")
    public int[] field3422 = new int[16];

    @ObfuscatedName("lf.aq")
    public int[] field3425 = new int[16];

    @ObfuscatedName("lf.ah")
    public int[] field3414 = new int[16];

    @ObfuscatedName("lf.as")
    public int[] field3427 = new int[16];

    @ObfuscatedName("lf.ay")
    public int[] field3428 = new int[16];

    @ObfuscatedName("lf.aj")
    public int[] field3416 = new int[16];

    @ObfuscatedName("lf.av")
    public int[] field3430 = new int[16];

    @ObfuscatedName("lf.aw")
    public int[] field3441 = new int[16];

    @ObfuscatedName("lf.ak")
    public class316[][] field3429 = new class316[16][128];

    @ObfuscatedName("lf.bh")
    public class316[][] field3433 = new class316[16][128];

    @ObfuscatedName("lf.bj")
    public class308 field3434 = new class308();

    @ObfuscatedName("lf.bk")
    public boolean field3435;

    @ObfuscatedName("lf.bv")
    public int field3436;

    @ObfuscatedName("lf.bt")
    public int field3437;

    @ObfuscatedName("lf.bd")
    public long field3438;

    @ObfuscatedName("lf.by")
    public long field3431;

    @ObfuscatedName("lf.bs")
    public class314 field3440 = new class314(this);

    @ObfuscatedName("lf.bm")
    public PriorityQueue field3424 = new PriorityQueue(5, new class317());

    @ObfuscatedName("lf.bf")
    public static AtomicBoolean field3442 = null;

    @ObfuscatedName("lf.bq")
    public static ThreadPoolExecutor field3439 = null;

    @ObfuscatedName("lf.ba")
    public int field3444 = 0;

    public class307() {
        this.method5293();
    }

    @ObfuscatedName("lf.au(II)V")
    public synchronized void method5272(int arg0) {
        this.field3415 = arg0;
    }

    @ObfuscatedName("lf.ae(I)I")
    public int method5309() {
        return this.field3415;
    }

    @ObfuscatedName("lf.ao(Lmv;Lnu;Lbi;I)Z")
    public synchronized boolean method5274(class315 arg0, class359 arg1, class46 arg2) {
        boolean var4 = true;
        PriorityQueue var5 = this.field3424;
        synchronized (this.field3424) {
            this.field3424.clear();
        }
        for (class319 var7 = (class319) arg0.field3487.method8027(); var7 != null; var7 = (class319) arg0.field3487.method8028()) {
            int var8 = (int) var7.field4814;
            class311 var9 = (class311) this.field3443.method8025((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method6134(var8);
                class311 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class311(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var4 = false;
                    continue;
                }
                this.field3443.method8035(var11, (long) var8);
            }
            if (!var9.method5437(arg2, var7.field3527)) {
                var4 = false;
            } else if (this.field3424 != null) {
                PriorityQueue var12 = this.field3424;
                synchronized (this.field3424) {
                    Iterator var13 = var9.field3476.iterator();
                    while (var13.hasNext()) {
                        class54 var14 = (class54) var13.next();
                        this.field3424.add(new class310(var7.field3528, var14));
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("lf.at(I)V")
    public void method5275() {
        if (this.field3424 == null) {
            return;
        }
        if (field3442 != null) {
            field3442.set(true);
        }
        field3442 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3442;
        if (field3439 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3439 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class309(this));
        }
        field3439.submit(new class313(this, var1));
    }

    @ObfuscatedName("lf.ac(I)V")
    public synchronized void method5276() {
        for (class311 var1 = (class311) this.field3443.method8027(); var1 != null; var1 = (class311) this.field3443.method8028()) {
            var1.method5438();
        }
    }

    @ObfuscatedName("lf.af(I)V")
    public synchronized void method5355() {
        for (class311 var1 = (class311) this.field3443.method8027(); var1 != null; var1 = (class311) this.field3443.method8028()) {
            var1.method7700();
        }
    }

    @ObfuscatedName("lf.aq(Lmv;ZI)V")
    public synchronized void method5277(class315 arg0, boolean arg1) {
        this.method5374();
        this.field3434.method5404(arg0.field3486);
        this.field3435 = arg1;
        this.field3438 = 0L;
        int var3 = this.field3434.method5383();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3434.method5384(var4);
            this.field3434.method5387(var4);
            this.field3434.method5385(var4);
        }
        this.field3436 = this.field3434.method5392();
        this.field3437 = this.field3434.field3450[this.field3436];
        this.field3431 = this.field3434.method5402(this.field3437);
    }

    @ObfuscatedName("lf.al(I)V")
    public synchronized void method5374() {
        this.field3434.method5380();
        this.method5293();
    }

    @ObfuscatedName("lf.an(B)Z")
    public synchronized boolean method5334() {
        return this.field3434.method5415();
    }

    @ObfuscatedName("lf.ar(B)Z")
    public synchronized boolean method5279() {
        return this.field3443.method8024() > 0;
    }

    @ObfuscatedName("lf.ab(III)V")
    public synchronized void method5299(int arg0, int arg1) {
        this.method5314(arg0, arg1);
    }

    @ObfuscatedName("lf.ag(IIB)V")
    public void method5314(int arg0, int arg1) {
        this.field3420[arg0] = arg1;
        this.field3426[arg0] = arg1 & 0xFFFFFF80;
        this.method5282(arg0, arg1);
    }

    @ObfuscatedName("lf.am(IIB)V")
    public void method5282(int arg0, int arg1) {
        if (this.field3421[arg0] != arg1) {
            this.field3421[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3433[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("lf.ax(IIII)V")
    public void method5283(int arg0, int arg1, int arg2) {
        this.method5285(arg0, arg1, 64);
        if ((this.field3414[arg0] & 0x2) != 0) {
            for (class316 var4 = (class316) this.field3440.field3485.method6394(); var4 != null; var4 = (class316) this.field3440.field3485.method6422()) {
                if (var4.field3498 == arg0 && var4.field3502 < 0) {
                    this.field3429[arg0][var4.field3493] = null;
                    this.field3429[arg0][arg1] = var4;
                    int var5 = (var4.field3500 * var4.field3497 >> 12) + var4.field3492;
                    var4.field3492 += arg1 - var4.field3493 << 8;
                    var4.field3497 = var5 - var4.field3492;
                    var4.field3500 = 4096;
                    var4.field3493 = arg1;
                    return;
                }
            }
        }
        class311 var6 = (class311) this.field3443.method8025((long) this.field3421[arg0]);
        if (var6 == null || var6.field3468[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3468[arg1].method1027();
        if (var7 == null) {
            return;
        }
        class316 var8 = new class316();
        var8.field3498 = arg0;
        var8.field3489 = var6;
        var8.field3490 = var7;
        var8.field3491 = var6.field3472[arg1];
        var8.field3504 = var6.field3473[arg1];
        var8.field3493 = arg1;
        var8.field3494 = var6.field3475 * arg2 * arg2 * var6.field3470[arg1] + 1024 >> 11;
        var8.field3495 = var6.field3471[arg1] & 0xFF;
        var8.field3492 = (arg1 << 8) - (var6.field3469[arg1] & 0x7FFF);
        var8.field3499 = 0;
        var8.field3506 = 0;
        var8.field3501 = 0;
        var8.field3502 = -1;
        var8.field3503 = 0;
        if (this.field3416[arg0] == 0) {
            var8.field3496 = class49.method879(var7, this.method5322(var8), this.method5328(var8), this.method5298(var8));
        } else {
            var8.field3496 = class49.method879(var7, this.method5322(var8), 0, this.method5298(var8));
            this.method5297(var8, var6.field3469[arg1] < 0);
        }
        if (var6.field3469[arg1] < 0) {
            var8.field3496.method880(-1);
        }
        if (var8.field3504 >= 0) {
            class316 var9 = this.field3433[arg0][var8.field3504];
            if (var9 != null && var9.field3502 < 0) {
                this.field3429[arg0][var9.field3493] = null;
                var9.field3502 = 0;
            }
            this.field3433[arg0][var8.field3504] = var8;
        }
        this.field3440.field3485.method6405(var8);
        this.field3429[arg0][arg1] = var8;
    }

    @ObfuscatedName("lf.ah(Lmg;ZS)V")
    public void method5297(class316 arg0, boolean arg1) {
        int var3 = arg0.field3490.field281.length;
        int var5;
        if (arg1 && arg0.field3490.field284) {
            int var4 = var3 + var3 - arg0.field3490.field282;
            var5 = (int) ((long) this.field3416[arg0.field3498] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3496.method933(true);
            }
        } else {
            var5 = (int) ((long) this.field3416[arg0.field3498] * (long) var3 >> 6);
        }
        arg0.field3496.method886(var5);
    }

    @ObfuscatedName("lf.as(IIII)V")
    public void method5285(int arg0, int arg1, int arg2) {
        class316 var4 = this.field3429[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3429[arg0][arg1] = null;
        if ((this.field3414[arg0] & 0x2) == 0) {
            var4.field3502 = 0;
            return;
        }
        for (class316 var5 = (class316) this.field3440.field3485.method6393(); var5 != null; var5 = (class316) this.field3440.field3485.method6395()) {
            if (var4.field3498 == var5.field3498 && var5.field3502 < 0 && var4 != var5) {
                var4.field3502 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("lf.ay(IIII)V")
    public void method5286(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("lf.aj(III)V")
    public void method5287(int arg0, int arg1) {
    }

    @ObfuscatedName("lf.av(III)V")
    public void method5288(int arg0, int arg1) {
        this.field3432[arg0] = arg1;
    }

    @ObfuscatedName("lf.aw(II)V")
    public void method5354(int arg0) {
        for (class316 var2 = (class316) this.field3440.field3485.method6393(); var2 != null; var2 = (class316) this.field3440.field3485.method6395()) {
            if (arg0 < 0 || var2.field3498 == arg0) {
                if (var2.field3496 != null) {
                    var2.field3496.method891(Statics.field294 / 100);
                    if (var2.field3496.method895()) {
                        this.field3440.field3481.method734(var2.field3496);
                    }
                    var2.method5457();
                }
                if (var2.field3502 < 0) {
                    this.field3429[var2.field3498][var2.field3493] = null;
                }
                var2.method7700();
            }
        }
    }

    @ObfuscatedName("lf.ak(IB)V")
    public void method5290(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5290(var2);
            }
            return;
        }
        this.field3417[arg0] = 12800;
        this.field3418[arg0] = 8192;
        this.field3419[arg0] = 16383;
        this.field3432[arg0] = 8192;
        this.field3422[arg0] = 0;
        this.field3425[arg0] = 8192;
        this.method5292(arg0);
        this.method5319(arg0);
        this.field3414[arg0] = 0;
        this.field3427[arg0] = 32767;
        this.field3428[arg0] = 256;
        this.field3416[arg0] = 0;
        this.method5295(arg0, 8192);
    }

    @ObfuscatedName("lf.bh(IB)V")
    public void method5291(int arg0) {
        for (class316 var2 = (class316) this.field3440.field3485.method6393(); var2 != null; var2 = (class316) this.field3440.field3485.method6395()) {
            if ((arg0 < 0 || var2.field3498 == arg0) && var2.field3502 < 0) {
                this.field3429[var2.field3498][var2.field3493] = null;
                var2.field3502 = 0;
            }
        }
    }

    @ObfuscatedName("lf.bm(I)V")
    public void method5293() {
        this.method5354(-1);
        this.method5290(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3421[var1] = this.field3420[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3426[var2] = this.field3420[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("lf.bf(II)V")
    public void method5292(int arg0) {
        if ((this.field3414[arg0] & 0x2) == 0) {
            return;
        }
        for (class316 var2 = (class316) this.field3440.field3485.method6393(); var2 != null; var2 = (class316) this.field3440.field3485.method6395()) {
            if (var2.field3498 == arg0 && this.field3429[arg0][var2.field3493] == null && var2.field3502 < 0) {
                var2.field3502 = 0;
            }
        }
    }

    @ObfuscatedName("lf.bq(II)V")
    public void method5319(int arg0) {
        if ((this.field3414[arg0] & 0x4) == 0) {
            return;
        }
        for (class316 var2 = (class316) this.field3440.field3485.method6393(); var2 != null; var2 = (class316) this.field3440.field3485.method6395()) {
            if (var2.field3498 == arg0) {
                var2.field3508 = 0;
            }
        }
    }

    @ObfuscatedName("lf.ba(IB)V")
    public void method5296(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5285(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5283(var6, var7, var8);
            } else {
                this.method5285(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5286(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3426[var12] = (var14 << 14) + (this.field3426[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3426[var12] = (var14 << 7) + (this.field3426[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3422[var12] = (var14 << 7) + (this.field3422[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3422[var12] = (this.field3422[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3425[var12] = (var14 << 7) + (this.field3425[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3425[var12] = (this.field3425[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3417[var12] = (var14 << 7) + (this.field3417[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3417[var12] = (this.field3417[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3418[var12] = (var14 << 7) + (this.field3418[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3418[var12] = (this.field3418[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3419[var12] = (var14 << 7) + (this.field3419[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3419[var12] = (this.field3419[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3414[var12] |= 0x1;
                } else {
                    this.field3414[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3414[var12] |= 0x2;
                } else {
                    this.method5292(var12);
                    this.field3414[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3427[var12] = (var14 << 7) + (this.field3427[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3427[var12] = (this.field3427[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3427[var12] = (var14 << 7) + (this.field3427[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3427[var12] = (this.field3427[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5354(var12);
            }
            if (var13 == 121) {
                this.method5290(var12);
            }
            if (var13 == 123) {
                this.method5291(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3427[var12];
                if (var15 == 16384) {
                    this.field3428[var12] = (var14 << 7) + (this.field3428[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3427[var12];
                if (var16 == 16384) {
                    this.field3428[var12] = (this.field3428[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3416[var12] = (var14 << 7) + (this.field3416[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3416[var12] = (this.field3416[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3414[var12] |= 0x4;
                } else {
                    this.method5319(var12);
                    this.field3414[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5295(var12, (var14 << 7) + (this.field3430[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5295(var12, (this.field3430[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5282(var17, this.field3426[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5287(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method5288(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5293();
            }
        }
    }

    @ObfuscatedName("lf.bl(III)V")
    public void method5295(int arg0, int arg1) {
        this.field3430[arg0] = arg1;
        this.field3441[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("lf.be(Lmg;B)I")
    public int method5322(class316 arg0) {
        int var2 = (arg0.field3500 * arg0.field3497 >> 12) + arg0.field3492;
        int var3 = ((this.field3432[arg0.field3498] - 8192) * this.field3428[arg0.field3498] >> 12) + var2;
        class305 var4 = arg0.field3491;
        if (var4.field3395 > 0 && (var4.field3394 > 0 || this.field3422[arg0.field3498] > 0)) {
            int var5 = var4.field3394 << 2;
            int var6 = var4.field3396 << 1;
            if (arg0.field3488 < var6) {
                var5 = arg0.field3488 * var5 / var6;
            }
            int var7 = (this.field3422[arg0.field3498] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3505 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3490.field283 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field294 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("lf.bi(Lmg;I)I")
    public int method5328(class316 arg0) {
        class305 var2 = arg0.field3491;
        int var3 = this.field3417[arg0.field3498] * this.field3419[arg0.field3498] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3494 * var4 + 16384 >> 15;
        int var6 = this.field3415 * var5 + 128 >> 8;
        if (var2.field3390 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3499 * 1.953125E-5D * (double) var2.field3390) + 0.5D);
        }
        if (var2.field3393 != null) {
            int var7 = arg0.field3506;
            int var8 = var2.field3393[arg0.field3501 + 1];
            if (arg0.field3501 < var2.field3393.length - 2) {
                int var9 = (var2.field3393[arg0.field3501] & 0xFF) << 8;
                int var10 = (var2.field3393[arg0.field3501 + 2] & 0xFF) << 8;
                var8 += (var2.field3393[arg0.field3501 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3502 > 0 && var2.field3399 != null) {
            int var11 = arg0.field3502;
            int var12 = var2.field3399[arg0.field3503 + 1];
            if (arg0.field3503 < var2.field3399.length - 2) {
                int var13 = (var2.field3399[arg0.field3503] & 0xFF) << 8;
                int var14 = (var2.field3399[arg0.field3503 + 2] & 0xFF) << 8;
                var12 += (var2.field3399[arg0.field3503 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("lf.bz(Lmg;I)I")
    public int method5298(class316 arg0) {
        int var2 = this.field3418[arg0.field3498];
        return var2 < 8192 ? arg0.field3495 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3495) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("lf.ai()Lbw;")
    public synchronized class50 method720() {
        return this.field3440;
    }

    @ObfuscatedName("lf.az()Lbw;")
    public synchronized class50 method712() {
        return null;
    }

    @ObfuscatedName("lf.ap()I")
    public synchronized int method713() {
        return 0;
    }

    @ObfuscatedName("lf.aa([III)V")
    public synchronized void method714(int[] arg0, int arg1, int arg2) {
        if (this.field3434.method5415()) {
            int var4 = this.field3423 * this.field3434.field3447 / Statics.field294;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3438;
                if (this.field3431 - var5 >= 0L) {
                    this.field3438 = var5;
                    break;
                }
                int var7 = (int) ((this.field3431 - this.field3438 + (long) var4 - 1L) / (long) var4);
                this.field3438 += (long) var4 * (long) var7;
                this.field3440.method714(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5301();
            } while (this.field3434.method5415());
        }
        this.field3440.method714(arg0, arg1, arg2);
    }

    @ObfuscatedName("lf.ad(I)V")
    public synchronized void method716(int arg0) {
        if (this.field3434.method5415()) {
            int var2 = this.field3423 * this.field3434.field3447 / Statics.field294;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3438;
                if (this.field3431 - var3 >= 0L) {
                    this.field3438 = var3;
                    break;
                }
                int var5 = (int) ((this.field3431 - this.field3438 + (long) var2 - 1L) / (long) var2);
                this.field3438 += (long) var2 * (long) var5;
                this.field3440.method716(var5);
                arg0 -= var5;
                this.method5301();
            } while (this.field3434.method5415());
        }
        this.field3440.method716(arg0);
    }

    @ObfuscatedName("lf.bx(B)V")
    public void method5301() {
        int var1 = this.field3436;
        int var2 = this.field3437;
        long var3 = this.field3431;
        while (this.field3437 == var2) {
            while (this.field3434.field3450[var1] == var2) {
                this.field3434.method5384(var1);
                int var5 = this.field3434.method5388(var1);
                if (var5 == 1) {
                    this.field3434.method5386();
                    this.field3434.method5385(var1);
                    if (this.field3434.method5393()) {
                        if (!this.field3435 || var2 == 0) {
                            this.method5293();
                            this.field3434.method5380();
                            return;
                        }
                        this.field3434.method5394(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5296(var5);
                }
                this.field3434.method5387(var1);
                this.field3434.method5385(var1);
            }
            var1 = this.field3434.method5392();
            var2 = this.field3434.field3450[var1];
            var3 = this.field3434.method5402(var2);
        }
        this.field3436 = var1;
        this.field3437 = var2;
        this.field3431 = var3;
    }

    @ObfuscatedName("lf.bn(Lmg;I)Z")
    public boolean method5366(class316 arg0) {
        if (arg0.field3496 != null) {
            return false;
        }
        if (arg0.field3502 >= 0) {
            arg0.method7700();
            if (arg0.field3504 > 0 && this.field3433[arg0.field3498][arg0.field3504] == arg0) {
                this.field3433[arg0.field3498][arg0.field3504] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("lf.bw(Lmg;[IIII)Z")
    public boolean method5303(class316 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3507 = Statics.field294 / 100;
        if (arg0.field3502 >= 0 && arg0.field3496 == null || arg0.field3496.method894()) {
            arg0.method5457();
            arg0.method7700();
            if (arg0.field3504 > 0 && this.field3433[arg0.field3498][arg0.field3504] == arg0) {
                this.field3433[arg0.field3498][arg0.field3504] = null;
            }
            return true;
        }
        int var5 = arg0.field3500;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3425[arg0.field3498] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3500 = var6;
        }
        arg0.field3496.method892(this.method5322(arg0));
        class305 var7 = arg0.field3491;
        boolean var8 = false;
        arg0.field3488++;
        arg0.field3505 += var7.field3395;
        double var9 = (double) ((arg0.field3493 - 60 << 8) + (arg0.field3500 * arg0.field3497 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3390 > 0) {
            if (var7.field3388 > 0) {
                arg0.field3499 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3388 * var9) + 0.5D);
            } else {
                arg0.field3499 += 128;
            }
        }
        if (var7.field3393 != null) {
            if (var7.field3389 > 0) {
                arg0.field3506 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3389 * var9) + 0.5D);
            } else {
                arg0.field3506 += 128;
            }
            while (arg0.field3501 < var7.field3393.length - 2 && arg0.field3506 > (var7.field3393[arg0.field3501 + 2] & 0xFF) << 8) {
                arg0.field3501 += 2;
            }
            if (arg0.field3501 == var7.field3393.length - 2 && var7.field3393[arg0.field3501 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3502 >= 0 && var7.field3399 != null && (this.field3414[arg0.field3498] & 0x1) == 0 && (arg0.field3504 < 0 || this.field3433[arg0.field3498][arg0.field3504] != arg0)) {
            if (var7.field3392 > 0) {
                arg0.field3502 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3392 * var9) + 0.5D);
            } else {
                arg0.field3502 += 128;
            }
            while (arg0.field3503 < var7.field3399.length - 2 && arg0.field3502 > (var7.field3399[arg0.field3503 + 2] & 0xFF) << 8) {
                arg0.field3503 += 2;
            }
            if (arg0.field3503 == var7.field3399.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3496.method896(arg0.field3507, this.method5328(arg0), this.method5298(arg0));
            return false;
        }
        arg0.field3496.method891(arg0.field3507);
        if (arg1 == null) {
            arg0.field3496.method716(arg3);
        } else {
            arg0.field3496.method714(arg1, arg2, arg3);
        }
        if (arg0.field3496.method895()) {
            this.field3440.field3481.method734(arg0.field3496);
        }
        arg0.method5457();
        if (arg0.field3502 >= 0) {
            arg0.method7700();
            if (arg0.field3504 > 0 && this.field3433[arg0.field3498][arg0.field3504] == arg0) {
                this.field3433[arg0.field3498][arg0.field3504] = null;
            }
        }
        return true;
    }
}
