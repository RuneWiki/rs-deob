package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mn")
public class class318 extends class50 {

    @ObfuscatedName("mn.at")
    public class501 field3430 = new class501(128);

    @ObfuscatedName("mn.ah")
    public int field3438 = 256;

    @ObfuscatedName("mn.ar")
    public int field3428 = 1000000;

    @ObfuscatedName("mn.ao")
    public int[] field3429 = new int[16];

    @ObfuscatedName("mn.ab")
    public int[] field3447 = new int[16];

    @ObfuscatedName("mn.au")
    public int[] field3427 = new int[16];

    @ObfuscatedName("mn.aa")
    public int[] field3455 = new int[16];

    @ObfuscatedName("mn.ac")
    public int[] field3433 = new int[16];

    @ObfuscatedName("mn.al")
    public int[] field3434 = new int[16];

    @ObfuscatedName("mn.az")
    public int[] field3449 = new int[16];

    @ObfuscatedName("mn.ap")
    public int[] field3436 = new int[16];

    @ObfuscatedName("mn.av")
    public int[] field3437 = new int[16];

    @ObfuscatedName("mn.ai")
    public int[] field3451 = new int[16];

    @ObfuscatedName("mn.aw")
    public int[] field3439 = new int[16];

    @ObfuscatedName("mn.ae")
    public int[] field3440 = new int[16];

    @ObfuscatedName("mn.an")
    public int[] field3441 = new int[16];

    @ObfuscatedName("mn.ag")
    public int[] field3444 = new int[16];

    @ObfuscatedName("mn.ad")
    public int[] field3443 = new int[16];

    @ObfuscatedName("mn.af")
    public class327[][] field3435 = new class327[16][128];

    @ObfuscatedName("mn.be")
    public class327[][] field3445 = new class327[16][128];

    @ObfuscatedName("mn.bd")
    public class319 field3446 = new class319();

    @ObfuscatedName("mn.bl")
    public boolean field3426;

    @ObfuscatedName("mn.bi")
    public int field3448;

    @ObfuscatedName("mn.bv")
    public int field3442;

    @ObfuscatedName("mn.bf")
    public long field3450;

    @ObfuscatedName("mn.bg")
    public long field3432;

    @ObfuscatedName("mn.ba")
    public class325 field3452 = new class325(this);

    @ObfuscatedName("mn.bm")
    public PriorityQueue field3453 = new PriorityQueue(5, new class328());

    @ObfuscatedName("mn.bp")
    public static AtomicBoolean field3454 = null;

    @ObfuscatedName("mn.bw")
    public static ThreadPoolExecutor field3431 = null;

    @ObfuscatedName("mn.bj")
    public int field3456 = 0;

    public class318() {
        this.method5425();
    }

    @ObfuscatedName("mn.at(IB)V")
    public synchronized void method5406(int arg0) {
        this.field3438 = arg0;
    }

    @ObfuscatedName("mn.ah(B)I")
    public int method5407() {
        return this.field3438;
    }

    @ObfuscatedName("mn.ar(Lms;Lol;Lbc;I)Z")
    public synchronized boolean method5408(class326 arg0, class371 arg1, class46 arg2) {
        boolean var4 = true;
        PriorityQueue var5 = this.field3453;
        synchronized (this.field3453) {
            this.field3453.clear();
        }
        for (class330 var7 = (class330) arg0.field3497.method8157(); var7 != null; var7 = (class330) arg0.field3497.method8158()) {
            int var8 = (int) var7.field4849;
            class322 var9 = (class322) this.field3430.method8154((long) var8);
            if (var9 == null) {
                var9 = class322.method2408(arg1, var8);
                if (var9 == null) {
                    var4 = false;
                    continue;
                }
                this.field3430.method8156(var9, (long) var8);
            }
            if (!var9.method5570(arg2, var7.field3541)) {
                var4 = false;
            } else if (this.field3453 != null) {
                PriorityQueue var10 = this.field3453;
                synchronized (this.field3453) {
                    Iterator var11 = var9.field3480.iterator();
                    while (var11.hasNext()) {
                        class54 var12 = (class54) var11.next();
                        this.field3453.add(new class321(var7.field3540, var12));
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("mn.ao(B)V")
    public void method5409() {
        if (this.field3453 == null) {
            return;
        }
        if (field3454 != null) {
            field3454.set(true);
        }
        field3454 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3454;
        if (field3431 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3431 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class320(this));
        }
        field3431.submit(new class324(this, var1));
    }

    @ObfuscatedName("mn.ab(I)V")
    public synchronized void method5445() {
        for (class322 var1 = (class322) this.field3430.method8157(); var1 != null; var1 = (class322) this.field3430.method8158()) {
            var1.method5571();
        }
    }

    @ObfuscatedName("mn.az(B)V")
    public synchronized void method5411() {
        for (class322 var1 = (class322) this.field3430.method8157(); var1 != null; var1 = (class322) this.field3430.method8158()) {
            var1.method7828();
        }
    }

    @ObfuscatedName("mn.av(Lms;ZI)V")
    public synchronized void method5443(class326 arg0, boolean arg1) {
        this.method5413();
        this.field3446.method5558(arg0.field3498);
        this.field3426 = arg1;
        this.field3450 = 0L;
        int var3 = this.field3446.method5536();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3446.method5538(var4);
            this.field3446.method5520(var4);
            this.field3446.method5514(var4);
        }
        this.field3448 = this.field3446.method5521();
        this.field3442 = this.field3446.field3471[this.field3448];
        this.field3432 = this.field3446.method5524(this.field3442);
    }

    @ObfuscatedName("mn.ax(B)V")
    public synchronized void method5413() {
        this.field3446.method5522();
        this.method5425();
    }

    @ObfuscatedName("mn.as(I)Z")
    public synchronized boolean method5487() {
        return this.field3446.method5516();
    }

    @ObfuscatedName("mn.ay(S)Z")
    public synchronized boolean method5415() {
        return this.field3430.method8155() > 0;
    }

    @ObfuscatedName("mn.ak(III)V")
    public synchronized void method5416(int arg0, int arg1) {
        this.method5422(arg0, arg1);
    }

    @ObfuscatedName("mn.aj(IIB)V")
    public void method5422(int arg0, int arg1) {
        this.field3455[arg0] = arg1;
        this.field3434[arg0] = arg1 & 0xFFFFFF80;
        this.method5488(arg0, arg1);
    }

    @ObfuscatedName("mn.am(IIB)V")
    public void method5488(int arg0, int arg1) {
        if (this.field3433[arg0] != arg1) {
            this.field3433[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3445[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mn.aq(IIIB)V")
    public void method5483(int arg0, int arg1, int arg2) {
        this.method5418(arg0, arg1, 64);
        if ((this.field3451[arg0] & 0x2) != 0) {
            for (class327 var4 = (class327) this.field3452.field3493.method6572(); var4 != null; var4 = (class327) this.field3452.field3493.method6550()) {
                if (var4.field3516 == arg0 && var4.field3499 < 0) {
                    this.field3435[arg0][var4.field3518] = null;
                    this.field3435[arg0][arg1] = var4;
                    int var5 = (var4.field3509 * var4.field3508 >> 12) + var4.field3507;
                    var4.field3507 += arg1 - var4.field3518 << 8;
                    var4.field3508 = var5 - var4.field3507;
                    var4.field3509 = 4096;
                    var4.field3518 = arg1;
                    return;
                }
            }
        }
        class322 var6 = (class322) this.field3430.method8154((long) this.field3433[arg0]);
        if (var6 == null || var6.field3478[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3478[arg1].method1013();
        if (var7 == null) {
            return;
        }
        class327 var8 = new class327();
        var8.field3516 = arg0;
        var8.field3500 = var6;
        var8.field3501 = var7;
        var8.field3502 = var6.field3486[arg1];
        var8.field3503 = var6.field3483[arg1];
        var8.field3518 = arg1;
        var8.field3505 = var6.field3482 * arg2 * arg2 * var6.field3484[arg1] + 1024 >> 11;
        var8.field3506 = var6.field3481[arg1] & 0xFF;
        var8.field3507 = (arg1 << 8) - (var6.field3479[arg1] & 0x7FFF);
        var8.field3510 = 0;
        var8.field3511 = 0;
        var8.field3512 = 0;
        var8.field3499 = -1;
        var8.field3520 = 0;
        if (this.field3441[arg0] == 0) {
            var8.field3515 = class49.method871(var7, this.method5410(var8), this.method5420(var8), this.method5431(var8));
        } else {
            var8.field3515 = class49.method871(var7, this.method5410(var8), 0, this.method5431(var8));
            this.method5419(var8, var6.field3479[arg1] < 0);
        }
        if (var6.field3479[arg1] < 0) {
            var8.field3515.method925(-1);
        }
        if (var8.field3503 >= 0) {
            class327 var9 = this.field3445[arg0][var8.field3503];
            if (var9 != null && var9.field3499 < 0) {
                this.field3435[arg0][var9.field3518] = null;
                var9.field3499 = 0;
            }
            this.field3445[arg0][var8.field3503] = var8;
        }
        this.field3452.field3493.method6547(var8);
        this.field3435[arg0][arg1] = var8;
    }

    @ObfuscatedName("mn.ai(Lmw;ZB)V")
    public void method5419(class327 arg0, boolean arg1) {
        int var3 = arg0.field3501.field252.length;
        int var5;
        if (arg1 && arg0.field3501.field251) {
            int var4 = var3 + var3 - arg0.field3501.field253;
            var5 = (int) ((long) this.field3441[arg0.field3516] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3515.method870(true);
            }
        } else {
            var5 = (int) ((long) this.field3441[arg0.field3516] * (long) var3 >> 6);
        }
        arg0.field3515.method878(var5);
    }

    @ObfuscatedName("mn.aw(IIII)V")
    public void method5418(int arg0, int arg1, int arg2) {
        class327 var4 = this.field3435[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3435[arg0][arg1] = null;
        if ((this.field3451[arg0] & 0x2) == 0) {
            var4.field3499 = 0;
            return;
        }
        for (class327 var5 = (class327) this.field3452.field3493.method6579(); var5 != null; var5 = (class327) this.field3452.field3493.method6549()) {
            if (var4.field3516 == var5.field3516 && var5.field3499 < 0 && var4 != var5) {
                var4.field3499 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mn.ae(IIIB)V")
    public void method5496(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mn.an(IIB)V")
    public void method5421(int arg0, int arg1) {
    }

    @ObfuscatedName("mn.ag(IIS)V")
    public void method5450(int arg0, int arg1) {
        this.field3449[arg0] = arg1;
    }

    @ObfuscatedName("mn.ad(II)V")
    public void method5501(int arg0) {
        for (class327 var2 = (class327) this.field3452.field3493.method6579(); var2 != null; var2 = (class327) this.field3452.field3493.method6549()) {
            if (arg0 < 0 || var2.field3516 == arg0) {
                if (var2.field3515 != null) {
                    var2.field3515.method883(Statics.field276 / 100);
                    if (var2.field3515.method887()) {
                        this.field3452.field3494.method707(var2.field3515);
                    }
                    var2.method5595();
                }
                if (var2.field3499 < 0) {
                    this.field3435[var2.field3516][var2.field3518] = null;
                }
                var2.method7828();
            }
        }
    }

    @ObfuscatedName("mn.af(IB)V")
    public void method5423(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5423(var2);
            }
            return;
        }
        this.field3429[arg0] = 12800;
        this.field3447[arg0] = 8192;
        this.field3427[arg0] = 16383;
        this.field3449[arg0] = 8192;
        this.field3436[arg0] = 0;
        this.field3437[arg0] = 8192;
        this.method5405(arg0);
        this.method5427(arg0);
        this.field3451[arg0] = 0;
        this.field3439[arg0] = 32767;
        this.field3440[arg0] = 256;
        this.field3441[arg0] = 0;
        this.method5440(arg0, 8192);
    }

    @ObfuscatedName("mn.bn(II)V")
    public void method5424(int arg0) {
        for (class327 var2 = (class327) this.field3452.field3493.method6579(); var2 != null; var2 = (class327) this.field3452.field3493.method6549()) {
            if ((arg0 < 0 || var2.field3516 == arg0) && var2.field3499 < 0) {
                this.field3435[var2.field3516][var2.field3518] = null;
                var2.field3499 = 0;
            }
        }
    }

    @ObfuscatedName("mn.bo(I)V")
    public void method5425() {
        this.method5501(-1);
        this.method5423(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3433[var1] = this.field3455[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3434[var2] = this.field3455[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mn.bz(II)V")
    public void method5405(int arg0) {
        if ((this.field3451[arg0] & 0x2) == 0) {
            return;
        }
        for (class327 var2 = (class327) this.field3452.field3493.method6579(); var2 != null; var2 = (class327) this.field3452.field3493.method6549()) {
            if (var2.field3516 == arg0 && this.field3435[arg0][var2.field3518] == null && var2.field3499 < 0) {
                var2.field3499 = 0;
            }
        }
    }

    @ObfuscatedName("mn.bc(IB)V")
    public void method5427(int arg0) {
        if ((this.field3451[arg0] & 0x4) == 0) {
            return;
        }
        for (class327 var2 = (class327) this.field3452.field3493.method6579(); var2 != null; var2 = (class327) this.field3452.field3493.method6549()) {
            if (var2.field3516 == arg0) {
                var2.field3517 = 0;
            }
        }
    }

    @ObfuscatedName("mn.bs(II)V")
    public void method5428(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5418(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5483(var6, var7, var8);
            } else {
                this.method5418(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5496(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3434[var12] = (var14 << 14) + (this.field3434[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3434[var12] = (var14 << 7) + (this.field3434[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3436[var12] = (var14 << 7) + (this.field3436[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3436[var12] = (this.field3436[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3437[var12] = (var14 << 7) + (this.field3437[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3437[var12] = (this.field3437[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3429[var12] = (var14 << 7) + (this.field3429[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3429[var12] = (this.field3429[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3447[var12] = (var14 << 7) + (this.field3447[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3447[var12] = (this.field3447[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3427[var12] = (var14 << 7) + (this.field3427[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3427[var12] = (this.field3427[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3451[var12] |= 0x1;
                } else {
                    this.field3451[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3451[var12] |= 0x2;
                } else {
                    this.method5405(var12);
                    this.field3451[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3439[var12] = (var14 << 7) + (this.field3439[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3439[var12] = (this.field3439[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3439[var12] = (var14 << 7) + (this.field3439[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3439[var12] = (this.field3439[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5501(var12);
            }
            if (var13 == 121) {
                this.method5423(var12);
            }
            if (var13 == 123) {
                this.method5424(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3439[var12];
                if (var15 == 16384) {
                    this.field3440[var12] = (var14 << 7) + (this.field3440[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3439[var12];
                if (var16 == 16384) {
                    this.field3440[var12] = (this.field3440[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3441[var12] = (var14 << 7) + (this.field3441[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3441[var12] = (this.field3441[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3451[var12] |= 0x4;
                } else {
                    this.method5427(var12);
                    this.field3451[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5440(var12, (var14 << 7) + (this.field3444[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5440(var12, (this.field3444[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5488(var17, this.field3434[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5421(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method5450(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5425();
            }
        }
    }

    @ObfuscatedName("mn.bb(IIB)V")
    public void method5440(int arg0, int arg1) {
        this.field3444[arg0] = arg1;
        this.field3443[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mn.bk(Lmw;I)I")
    public int method5410(class327 arg0) {
        int var2 = (arg0.field3509 * arg0.field3508 >> 12) + arg0.field3507;
        int var3 = ((this.field3449[arg0.field3516] - 8192) * this.field3440[arg0.field3516] >> 12) + var2;
        class316 var4 = arg0.field3502;
        if (var4.field3411 > 0 && (var4.field3410 > 0 || this.field3436[arg0.field3516] > 0)) {
            int var5 = var4.field3410 << 2;
            int var6 = var4.field3405 << 1;
            if (arg0.field3513 < var6) {
                var5 = arg0.field3513 * var5 / var6;
            }
            int var7 = (this.field3436[arg0.field3516] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3504 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3501.field255 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field276 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mn.br(Lmw;B)I")
    public int method5420(class327 arg0) {
        class316 var2 = arg0.field3502;
        int var3 = this.field3429[arg0.field3516] * this.field3427[arg0.field3516] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3505 * var4 + 16384 >> 15;
        int var6 = this.field3438 * var5 + 128 >> 8;
        if (var2.field3406 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3510 * 1.953125E-5D * (double) var2.field3406) + 0.5D);
        }
        if (var2.field3407 != null) {
            int var7 = arg0.field3511;
            int var8 = var2.field3407[arg0.field3512 + 1];
            if (arg0.field3512 < var2.field3407.length - 2) {
                int var9 = (var2.field3407[arg0.field3512] & 0xFF) << 8;
                int var10 = (var2.field3407[arg0.field3512 + 2] & 0xFF) << 8;
                var8 += (var2.field3407[arg0.field3512 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3499 > 0 && var2.field3412 != null) {
            int var11 = arg0.field3499;
            int var12 = var2.field3412[arg0.field3520 + 1];
            if (arg0.field3520 < var2.field3412.length - 2) {
                int var13 = (var2.field3412[arg0.field3520] & 0xFF) << 8;
                int var14 = (var2.field3412[arg0.field3520 + 2] & 0xFF) << 8;
                var12 += (var2.field3412[arg0.field3520 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mn.bq(Lmw;B)I")
    public int method5431(class327 arg0) {
        int var2 = this.field3447[arg0.field3516];
        return var2 < 8192 ? arg0.field3506 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3506) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mn.au()Lbk;")
    public synchronized class50 method714() {
        return this.field3452;
    }

    @ObfuscatedName("mn.aa()Lbk;")
    public synchronized class50 method713() {
        return null;
    }

    @ObfuscatedName("mn.ac()I")
    public synchronized int method750() {
        return 0;
    }

    @ObfuscatedName("mn.al([III)V")
    public synchronized void method706(int[] arg0, int arg1, int arg2) {
        if (this.field3446.method5516()) {
            int var4 = this.field3428 * this.field3446.field3459 / Statics.field276;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3450;
                if (this.field3432 - var5 >= 0L) {
                    this.field3450 = var5;
                    break;
                }
                int var7 = (int) ((this.field3432 - this.field3450 + (long) var4 - 1L) / (long) var4);
                this.field3450 += (long) var4 * (long) var7;
                this.field3452.method706(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5434();
            } while (this.field3446.method5516());
        }
        this.field3452.method706(arg0, arg1, arg2);
    }

    @ObfuscatedName("mn.ap(I)V")
    public synchronized void method729(int arg0) {
        if (this.field3446.method5516()) {
            int var2 = this.field3428 * this.field3446.field3459 / Statics.field276;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3450;
                if (this.field3432 - var3 >= 0L) {
                    this.field3450 = var3;
                    break;
                }
                int var5 = (int) ((this.field3432 - this.field3450 + (long) var2 - 1L) / (long) var2);
                this.field3450 += (long) var2 * (long) var5;
                this.field3452.method729(var5);
                arg0 -= var5;
                this.method5434();
            } while (this.field3446.method5516());
        }
        this.field3452.method729(arg0);
    }

    @ObfuscatedName("mn.cf(I)V")
    public void method5434() {
        int var1 = this.field3448;
        int var2 = this.field3442;
        long var3 = this.field3432;
        while (this.field3442 == var2) {
            while (this.field3446.field3471[var1] == var2) {
                this.field3446.method5538(var1);
                int var5 = this.field3446.method5513(var1);
                if (var5 == 1) {
                    this.field3446.method5519();
                    this.field3446.method5514(var1);
                    if (this.field3446.method5526()) {
                        if (!this.field3426 || var2 == 0) {
                            this.method5425();
                            this.field3446.method5522();
                            return;
                        }
                        this.field3446.method5527(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5428(var5);
                }
                this.field3446.method5520(var1);
                this.field3446.method5514(var1);
            }
            var1 = this.field3446.method5521();
            var2 = this.field3446.field3471[var1];
            var3 = this.field3446.method5524(var2);
        }
        this.field3448 = var1;
        this.field3442 = var2;
        this.field3432 = var3;
    }

    @ObfuscatedName("mn.cg(Lmw;I)Z")
    public boolean method5435(class327 arg0) {
        if (arg0.field3515 != null) {
            return false;
        }
        if (arg0.field3499 >= 0) {
            arg0.method7828();
            if (arg0.field3503 > 0 && this.field3445[arg0.field3516][arg0.field3503] == arg0) {
                this.field3445[arg0.field3516][arg0.field3503] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mn.cv(Lmw;[IIII)Z")
    public boolean method5436(class327 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3514 = Statics.field276 / 100;
        if (arg0.field3499 >= 0 && arg0.field3515 == null || arg0.field3515.method959()) {
            arg0.method5595();
            arg0.method7828();
            if (arg0.field3503 > 0 && this.field3445[arg0.field3516][arg0.field3503] == arg0) {
                this.field3445[arg0.field3516][arg0.field3503] = null;
            }
            return true;
        }
        int var5 = arg0.field3509;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3437[arg0.field3516] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3509 = var6;
        }
        arg0.field3515.method879(this.method5410(arg0));
        class316 var7 = arg0.field3502;
        boolean var8 = false;
        arg0.field3513++;
        arg0.field3504 += var7.field3411;
        double var9 = (double) ((arg0.field3518 - 60 << 8) + (arg0.field3509 * arg0.field3508 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3406 > 0) {
            if (var7.field3409 > 0) {
                arg0.field3510 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3409 * var9) + 0.5D);
            } else {
                arg0.field3510 += 128;
            }
        }
        if (var7.field3407 != null) {
            if (var7.field3413 > 0) {
                arg0.field3511 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3413 * var9) + 0.5D);
            } else {
                arg0.field3511 += 128;
            }
            while (arg0.field3512 < var7.field3407.length - 2 && arg0.field3511 > (var7.field3407[arg0.field3512 + 2] & 0xFF) << 8) {
                arg0.field3512 += 2;
            }
            if (arg0.field3512 == var7.field3407.length - 2 && var7.field3407[arg0.field3512 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3499 >= 0 && var7.field3412 != null && (this.field3451[arg0.field3516] & 0x1) == 0 && (arg0.field3503 < 0 || this.field3445[arg0.field3516][arg0.field3503] != arg0)) {
            if (var7.field3408 > 0) {
                arg0.field3499 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3408 * var9) + 0.5D);
            } else {
                arg0.field3499 += 128;
            }
            while (arg0.field3520 < var7.field3412.length - 2 && arg0.field3499 > (var7.field3412[arg0.field3520 + 2] & 0xFF) << 8) {
                arg0.field3520 += 2;
            }
            if (arg0.field3520 == var7.field3412.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3515.method882(arg0.field3514, this.method5420(arg0), this.method5431(arg0));
            return false;
        }
        arg0.field3515.method883(arg0.field3514);
        if (arg1 == null) {
            arg0.field3515.method729(arg3);
        } else {
            arg0.field3515.method706(arg1, arg2, arg3);
        }
        if (arg0.field3515.method887()) {
            this.field3452.field3494.method707(arg0.field3515);
        }
        arg0.method5595();
        if (arg0.field3499 >= 0) {
            arg0.method7828();
            if (arg0.field3503 > 0 && this.field3445[arg0.field3516][arg0.field3503] == arg0) {
                this.field3445[arg0.field3516][arg0.field3503] = null;
            }
        }
        return true;
    }
}
