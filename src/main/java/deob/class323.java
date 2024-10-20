package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mx")
public class class323 extends class50 {

    @ObfuscatedName("mx.az")
    public class509 field3516;

    @ObfuscatedName("mx.ah")
    public int field3506 = 256;

    @ObfuscatedName("mx.af")
    public int field3507 = 1000000;

    @ObfuscatedName("mx.at")
    public int[] field3521 = new int[16];

    @ObfuscatedName("mx.an")
    public int[] field3509 = new int[16];

    @ObfuscatedName("mx.ao")
    public int[] field3518 = new int[16];

    @ObfuscatedName("mx.ab")
    public int[] field3511 = new int[16];

    @ObfuscatedName("mx.aw")
    public int[] field3512 = new int[16];

    @ObfuscatedName("mx.ad")
    public int[] field3513 = new int[16];

    @ObfuscatedName("mx.al")
    public int[] field3536 = new int[16];

    @ObfuscatedName("mx.as")
    public int[] field3515 = new int[16];

    @ObfuscatedName("mx.ag")
    public int[] field3532 = new int[16];

    @ObfuscatedName("mx.av")
    public int[] field3517 = new int[16];

    @ObfuscatedName("mx.aa")
    public int[] field3534 = new int[16];

    @ObfuscatedName("mx.aq")
    public int[] field3519 = new int[16];

    @ObfuscatedName("mx.am")
    public int[] field3508 = new int[16];

    @ObfuscatedName("mx.ac")
    public int[] field3514 = new int[16];

    @ObfuscatedName("mx.ae")
    public int[] field3522 = new int[16];

    @ObfuscatedName("mx.ak")
    public class332[][] field3523 = new class332[16][128];

    @ObfuscatedName("mx.bp")
    public class332[][] field3524 = new class332[16][128];

    @ObfuscatedName("mx.bz")
    public class324 field3525 = new class324();

    @ObfuscatedName("mx.bc")
    public boolean field3526;

    @ObfuscatedName("mx.bf")
    public int field3527;

    @ObfuscatedName("mx.be")
    public int field3528;

    @ObfuscatedName("mx.bn")
    public long field3510;

    @ObfuscatedName("mx.bd")
    public long field3530;

    @ObfuscatedName("mx.bo")
    public class330 field3531 = new class330(this);

    @ObfuscatedName("mx.bx")
    public class43 field3505 = null;

    @ObfuscatedName("mx.bl")
    public PriorityQueue field3533 = new PriorityQueue(5, new class333());

    @ObfuscatedName("mx.bh")
    public static AtomicBoolean field3520 = null;

    @ObfuscatedName("mx.bs")
    public static ThreadPoolExecutor field3529 = null;

    @ObfuscatedName("mx.bj")
    public int field3535 = 0;

    public class323(class43 arg0) {
        this.field3505 = arg0;
        this.field3516 = new class509(128);
        this.method5461();
    }

    @ObfuscatedName("mx.az(II)V")
    public void method5440(int arg0) {
        class43 var2 = this.field3505;
        synchronized (this.field3505) {
            this.field3506 = arg0;
        }
    }

    @ObfuscatedName("mx.ah(I)I")
    public int method5441() {
        return this.field3506;
    }

    @ObfuscatedName("mx.af(Lmr;Loc;Lbq;B)Z")
    public boolean method5512(class331 arg0, class379 arg1, class46 arg2) {
        class43 var4 = this.field3505;
        synchronized (this.field3505) {
            boolean var5 = true;
            PriorityQueue var6 = this.field3533;
            synchronized (this.field3533) {
                this.field3533.clear();
            }
            for (class335 var8 = (class335) arg0.field3575.method8207(); var8 != null; var8 = (class335) arg0.field3575.method8203()) {
                int var9 = (int) var8.field4951;
                class327 var10 = (class327) this.field3516.method8206((long) var9);
                if (var10 == null) {
                    var10 = class327.method3491(arg1, var9);
                    if (var10 == null) {
                        var5 = false;
                        continue;
                    }
                    this.field3516.method8204(var10, (long) var9);
                }
                if (!var10.method5610(arg2, var8.field3619)) {
                    var5 = false;
                } else if (this.field3533 != null) {
                    PriorityQueue var11 = this.field3533;
                    synchronized (this.field3533) {
                        Iterator var12 = var10.field3561.iterator();
                        while (var12.hasNext()) {
                            class54 var13 = (class54) var12.next();
                            this.field3533.add(new class326(var8.field3623, var13));
                        }
                    }
                }
            }
            return var5;
        }
    }

    @ObfuscatedName("mx.at(I)V")
    public void method5443() {
        if (this.field3533 == null) {
            return;
        }
        if (field3520 != null) {
            field3520.set(true);
        }
        field3520 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3520;
        if (field3529 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3529 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class325(this));
        }
        field3529.submit(new class329(this, var1));
    }

    @ObfuscatedName("mx.an(I)V")
    public void method5519() {
        class43 var1 = this.field3505;
        synchronized (this.field3505) {
            for (class327 var2 = (class327) this.field3516.method8207(); var2 != null; var2 = (class327) this.field3516.method8203()) {
                var2.method5603();
            }
        }
    }

    @ObfuscatedName("mx.al(B)V")
    public void method5445() {
        class43 var1 = this.field3505;
        synchronized (this.field3505) {
            for (class327 var2 = (class327) this.field3516.method8207(); var2 != null; var2 = (class327) this.field3516.method8203()) {
                var2.method7855();
            }
        }
    }

    @ObfuscatedName("mx.ag(Lmr;ZI)V")
    public void method5472(class331 arg0, boolean arg1) {
        class43 var3 = this.field3505;
        synchronized (this.field3505) {
            this.method5447();
            this.field3525.method5555(arg0.field3576);
            this.field3526 = arg1;
            this.field3510 = 0L;
            int var4 = this.field3525.method5558();
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3525.method5554(var5);
                this.field3525.method5564(var5);
                this.field3525.method5576(var5);
            }
            this.field3527 = this.field3525.method5567();
            this.field3528 = this.field3525.field3543[this.field3527];
            this.field3530 = this.field3525.method5566(this.field3528);
        }
    }

    @ObfuscatedName("mx.ai(I)V")
    public void method5447() {
        class43 var1 = this.field3505;
        synchronized (this.field3505) {
            this.field3525.method5556();
            this.method5461();
        }
    }

    @ObfuscatedName("mx.ax(B)Z")
    public boolean method5448() {
        class43 var1 = this.field3505;
        synchronized (this.field3505) {
            return this.field3525.method5596();
        }
    }

    @ObfuscatedName("mx.ar(I)Z")
    public boolean method5538() {
        class43 var1 = this.field3505;
        synchronized (this.field3505) {
            return this.field3516.method8205() > 0;
        }
    }

    @ObfuscatedName("mx.aj(III)V")
    public void method5450(int arg0, int arg1) {
        class43 var3 = this.field3505;
        synchronized (this.field3505) {
            this.method5451(arg0, arg1);
        }
    }

    @ObfuscatedName("mx.au(III)V")
    public void method5451(int arg0, int arg1) {
        this.field3511[arg0] = arg1;
        this.field3513[arg0] = arg1 & 0xFFFFFF80;
        this.method5452(arg0, arg1);
    }

    @ObfuscatedName("mx.ay(III)V")
    public void method5452(int arg0, int arg1) {
        if (this.field3512[arg0] != arg1) {
            this.field3512[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3524[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mx.ap(IIII)V")
    public void method5551(int arg0, int arg1, int arg2) {
        this.method5455(arg0, arg1, 64);
        if ((this.field3517[arg0] & 0x2) != 0) {
            for (class332 var4 = (class332) this.field3531.field3571.method6596(); var4 != null; var4 = (class332) this.field3531.field3571.method6584()) {
                if (var4.field3591 == arg0 && var4.field3583 < 0) {
                    this.field3523[arg0][var4.field3582] = null;
                    this.field3523[arg0][arg1] = var4;
                    int var5 = (var4.field3597 * var4.field3587 >> 12) + var4.field3584;
                    var4.field3584 += arg1 - var4.field3582 << 8;
                    var4.field3597 = var5 - var4.field3584;
                    var4.field3587 = 4096;
                    var4.field3582 = arg1;
                    return;
                }
            }
        }
        class327 var6 = (class327) this.field3516.method8206((long) this.field3512[arg0]);
        if (var6 == null || var6.field3560[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3560[arg1].method979();
        if (var7 == null) {
            return;
        }
        class332 var8 = new class332();
        var8.field3591 = arg0;
        var8.field3586 = var6;
        var8.field3579 = var7;
        var8.field3580 = var6.field3564[arg1];
        var8.field3581 = var6.field3565[arg1];
        var8.field3582 = arg1;
        var8.field3577 = var6.field3566 * arg2 * arg2 * var6.field3562[arg1] + 1024 >> 11;
        var8.field3590 = var6.field3563[arg1] & 0xFF;
        var8.field3584 = (arg1 << 8) - (var6.field3558[arg1] & 0x7FFF);
        var8.field3588 = 0;
        var8.field3589 = 0;
        var8.field3594 = 0;
        var8.field3583 = -1;
        var8.field3585 = 0;
        if (this.field3508[arg0] == 0) {
            var8.field3595 = class49.method830(var7, this.method5520(var8), this.method5468(var8), this.method5469(var8));
        } else {
            var8.field3595 = class49.method830(var7, this.method5520(var8), 0, this.method5469(var8));
            this.method5454(var8, var6.field3558[arg1] < 0);
        }
        if (var6.field3558[arg1] < 0) {
            var8.field3595.method832(-1);
        }
        if (var8.field3581 >= 0) {
            class332 var9 = this.field3524[arg0][var8.field3581];
            if (var9 != null && var9.field3583 < 0) {
                this.field3523[arg0][var9.field3582] = null;
                var9.field3583 = 0;
            }
            this.field3524[arg0][var8.field3581] = var8;
        }
        this.field3531.field3571.method6581(var8);
        this.field3523[arg0][arg1] = var8;
    }

    @ObfuscatedName("mx.av(Lme;ZI)V")
    public void method5454(class332 arg0, boolean arg1) {
        int var3 = arg0.field3579.field256.length;
        int var5;
        if (arg1 && arg0.field3579.field255) {
            int var4 = var3 + var3 - arg0.field3579.field257;
            var5 = (int) ((long) this.field3508[arg0.field3591] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3595.method839(true);
            }
        } else {
            var5 = (int) ((long) this.field3508[arg0.field3591] * (long) var3 >> 6);
        }
        arg0.field3595.method867(var5);
    }

    @ObfuscatedName("mx.aa(IIIB)V")
    public void method5455(int arg0, int arg1, int arg2) {
        class332 var4 = this.field3523[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3523[arg0][arg1] = null;
        if ((this.field3517[arg0] & 0x2) == 0) {
            var4.field3583 = 0;
            return;
        }
        for (class332 var5 = (class332) this.field3531.field3571.method6591(); var5 != null; var5 = (class332) this.field3531.field3571.method6605()) {
            if (var4.field3591 == var5.field3591 && var5.field3583 < 0 && var4 != var5) {
                var4.field3583 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mx.aq(IIIB)V")
    public void method5456(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mx.am(IIB)V")
    public void method5471(int arg0, int arg1) {
    }

    @ObfuscatedName("mx.ac(III)V")
    public void method5458(int arg0, int arg1) {
        this.field3536[arg0] = arg1;
    }

    @ObfuscatedName("mx.ae(IB)V")
    public void method5460(int arg0) {
        for (class332 var2 = (class332) this.field3531.field3571.method6591(); var2 != null; var2 = (class332) this.field3531.field3571.method6605()) {
            if (arg0 < 0 || var2.field3591 == arg0) {
                if (var2.field3595 != null) {
                    var2.field3595.method836(Statics.field4893 / 100);
                    if (var2.field3595.method846()) {
                        this.field3531.field3572.method670(var2.field3595);
                    }
                    var2.method5629();
                }
                if (var2.field3583 < 0) {
                    this.field3523[var2.field3591][var2.field3582] = null;
                }
                var2.method7855();
            }
        }
    }

    @ObfuscatedName("mx.bx(IB)V")
    public void method5525(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5525(var2);
            }
            return;
        }
        this.field3521[arg0] = 12800;
        this.field3509[arg0] = 8192;
        this.field3518[arg0] = 16383;
        this.field3536[arg0] = 8192;
        this.field3515[arg0] = 0;
        this.field3532[arg0] = 8192;
        this.method5463(arg0);
        this.method5464(arg0);
        this.field3517[arg0] = 0;
        this.field3534[arg0] = 32767;
        this.field3519[arg0] = 256;
        this.field3508[arg0] = 0;
        this.method5466(arg0, 8192);
    }

    @ObfuscatedName("mx.bl(IB)V")
    public void method5442(int arg0) {
        for (class332 var2 = (class332) this.field3531.field3571.method6591(); var2 != null; var2 = (class332) this.field3531.field3571.method6605()) {
            if ((arg0 < 0 || var2.field3591 == arg0) && var2.field3583 < 0) {
                this.field3523[var2.field3591][var2.field3582] = null;
                var2.field3583 = 0;
            }
        }
    }

    @ObfuscatedName("mx.bh(I)V")
    public void method5461() {
        this.method5460(-1);
        this.method5525(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3512[var1] = this.field3511[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3513[var2] = this.field3511[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mx.br(II)V")
    public void method5463(int arg0) {
        if ((this.field3517[arg0] & 0x2) == 0) {
            return;
        }
        for (class332 var2 = (class332) this.field3531.field3571.method6591(); var2 != null; var2 = (class332) this.field3531.field3571.method6605()) {
            if (var2.field3591 == arg0 && this.field3523[arg0][var2.field3582] == null && var2.field3583 < 0) {
                var2.field3583 = 0;
            }
        }
    }

    @ObfuscatedName("mx.bb(IB)V")
    public void method5464(int arg0) {
        if ((this.field3517[arg0] & 0x4) == 0) {
            return;
        }
        for (class332 var2 = (class332) this.field3531.field3571.method6591(); var2 != null; var2 = (class332) this.field3531.field3571.method6605()) {
            if (var2.field3591 == arg0) {
                var2.field3598 = 0;
            }
        }
    }

    @ObfuscatedName("mx.by(II)V")
    public void method5465(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5455(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5551(var6, var7, var8);
            } else {
                this.method5455(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5456(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3513[var12] = (var14 << 14) + (this.field3513[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3513[var12] = (var14 << 7) + (this.field3513[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3515[var12] = (var14 << 7) + (this.field3515[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3515[var12] = (this.field3515[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3532[var12] = (var14 << 7) + (this.field3532[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3532[var12] = (this.field3532[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3521[var12] = (var14 << 7) + (this.field3521[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3521[var12] = (this.field3521[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3509[var12] = (var14 << 7) + (this.field3509[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3509[var12] = (this.field3509[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3518[var12] = (var14 << 7) + (this.field3518[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3518[var12] = (this.field3518[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3517[var12] |= 0x1;
                } else {
                    this.field3517[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3517[var12] |= 0x2;
                } else {
                    this.method5463(var12);
                    this.field3517[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3534[var12] = (var14 << 7) + (this.field3534[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3534[var12] = (this.field3534[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3534[var12] = (var14 << 7) + (this.field3534[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3534[var12] = (this.field3534[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5460(var12);
            }
            if (var13 == 121) {
                this.method5525(var12);
            }
            if (var13 == 123) {
                this.method5442(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3534[var12];
                if (var15 == 16384) {
                    this.field3519[var12] = (var14 << 7) + (this.field3519[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3534[var12];
                if (var16 == 16384) {
                    this.field3519[var12] = (this.field3519[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3508[var12] = (var14 << 7) + (this.field3508[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3508[var12] = (this.field3508[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3517[var12] |= 0x4;
                } else {
                    this.method5464(var12);
                    this.field3517[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5466(var12, (var14 << 7) + (this.field3514[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5466(var12, (this.field3514[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5452(var17, this.field3513[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5471(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method5458(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5461();
            }
        }
    }

    @ObfuscatedName("mx.bt(III)V")
    public void method5466(int arg0, int arg1) {
        this.field3514[arg0] = arg1;
        this.field3522[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mx.bq(Lme;I)I")
    public int method5520(class332 arg0) {
        int var2 = (arg0.field3597 * arg0.field3587 >> 12) + arg0.field3584;
        int var3 = ((this.field3536[arg0.field3591] - 8192) * this.field3519[arg0.field3591] >> 12) + var2;
        class321 var4 = arg0.field3580;
        if (var4.field3486 > 0 && (var4.field3484 > 0 || this.field3515[arg0.field3591] > 0)) {
            int var5 = var4.field3484 << 2;
            int var6 = var4.field3482 << 1;
            if (arg0.field3593 < var6) {
                var5 = arg0.field3593 * var5 / var6;
            }
            int var7 = (this.field3515[arg0.field3591] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3596 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3579.field258 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field4893 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mx.bi(Lme;I)I")
    public int method5468(class332 arg0) {
        class321 var2 = arg0.field3580;
        int var3 = this.field3521[arg0.field3591] * this.field3518[arg0.field3591] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3577 * var4 + 16384 >> 15;
        int var6 = this.field3506 * var5 + 128 >> 8;
        if (var2.field3490 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3588 * 1.953125E-5D * (double) var2.field3490) + 0.5D);
        }
        if (var2.field3489 != null) {
            int var7 = arg0.field3589;
            int var8 = var2.field3489[arg0.field3594 + 1];
            if (arg0.field3594 < var2.field3489.length - 2) {
                int var9 = (var2.field3489[arg0.field3594] & 0xFF) << 8;
                int var10 = (var2.field3489[arg0.field3594 + 2] & 0xFF) << 8;
                var8 += (var2.field3489[arg0.field3594 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3583 > 0 && var2.field3483 != null) {
            int var11 = arg0.field3583;
            int var12 = var2.field3483[arg0.field3585 + 1];
            if (arg0.field3585 < var2.field3483.length - 2) {
                int var13 = (var2.field3483[arg0.field3585] & 0xFF) << 8;
                int var14 = (var2.field3483[arg0.field3585 + 2] & 0xFF) << 8;
                var12 += (var2.field3483[arg0.field3585 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mx.bw(Lme;I)I")
    public int method5469(class332 arg0) {
        int var2 = this.field3509[arg0.field3591];
        return var2 < 8192 ? arg0.field3590 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3590) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mx.ao()Lba;")
    public class50 method692() {
        return this.field3531;
    }

    @ObfuscatedName("mx.ab()Lba;")
    public class50 method696() {
        return null;
    }

    @ObfuscatedName("mx.aw()I")
    public int method709() {
        return 0;
    }

    @ObfuscatedName("mx.ad([III)V")
    public void method667(int[] arg0, int arg1, int arg2) {
        if (this.field3525.method5596()) {
            int var4 = this.field3507 * this.field3525.field3540 / Statics.field4893;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3510;
                if (this.field3530 - var5 >= 0L) {
                    this.field3510 = var5;
                    break;
                }
                int var7 = (int) ((this.field3530 - this.field3510 + (long) var4 - 1L) / (long) var4);
                this.field3510 += (long) var4 * (long) var7;
                this.field3531.method667(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5473();
            } while (this.field3525.method5596());
        }
        this.field3531.method667(arg0, arg1, arg2);
    }

    @ObfuscatedName("mx.as(I)V")
    public void method678(int arg0) {
        if (this.field3525.method5596()) {
            int var2 = this.field3507 * this.field3525.field3540 / Statics.field4893;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3510;
                if (this.field3530 - var3 >= 0L) {
                    this.field3510 = var3;
                    break;
                }
                int var5 = (int) ((this.field3530 - this.field3510 + (long) var2 - 1L) / (long) var2);
                this.field3510 += (long) var2 * (long) var5;
                this.field3531.method678(var5);
                arg0 -= var5;
                this.method5473();
            } while (this.field3525.method5596());
        }
        this.field3531.method678(arg0);
    }

    @ObfuscatedName("mx.bm(S)V")
    public void method5473() {
        int var1 = this.field3527;
        int var2 = this.field3528;
        long var3 = this.field3530;
        while (this.field3528 == var2) {
            while (this.field3525.field3543[var1] == var2) {
                this.field3525.method5554(var1);
                int var5 = this.field3525.method5586(var1);
                if (var5 == 1) {
                    this.field3525.method5561();
                    this.field3525.method5576(var1);
                    if (this.field3525.method5568()) {
                        if (!this.field3526 || var2 == 0) {
                            this.method5461();
                            this.field3525.method5556();
                            return;
                        }
                        this.field3525.method5569(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5465(var5);
                }
                this.field3525.method5564(var1);
                this.field3525.method5576(var1);
            }
            var1 = this.field3525.method5567();
            var2 = this.field3525.field3543[var1];
            var3 = this.field3525.method5566(var2);
        }
        this.field3527 = var1;
        this.field3528 = var2;
        this.field3530 = var3;
    }

    @ObfuscatedName("mx.ba(Lme;I)Z")
    public boolean method5444(class332 arg0) {
        if (arg0.field3595 != null) {
            return false;
        }
        if (arg0.field3583 >= 0) {
            arg0.method7855();
            if (arg0.field3581 > 0 && this.field3524[arg0.field3591][arg0.field3581] == arg0) {
                this.field3524[arg0.field3591][arg0.field3581] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mx.bv(Lme;[IIII)Z")
    public boolean method5476(class332 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3578 = Statics.field4893 / 100;
        if (arg0.field3583 >= 0 && arg0.field3595 == null || arg0.field3595.method828()) {
            arg0.method5629();
            arg0.method7855();
            if (arg0.field3581 > 0 && this.field3524[arg0.field3591][arg0.field3581] == arg0) {
                this.field3524[arg0.field3591][arg0.field3581] = null;
            }
            return true;
        }
        int var5 = arg0.field3587;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3532[arg0.field3591] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3587 = var6;
        }
        arg0.field3595.method865(this.method5520(arg0));
        class321 var7 = arg0.field3580;
        boolean var8 = false;
        arg0.field3593++;
        arg0.field3596 += var7.field3486;
        double var9 = (double) ((arg0.field3582 - 60 << 8) + (arg0.field3597 * arg0.field3587 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3490 > 0) {
            if (var7.field3487 > 0) {
                arg0.field3588 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3487 * var9) + 0.5D);
            } else {
                arg0.field3588 += 128;
            }
        }
        if (var7.field3489 != null) {
            if (var7.field3485 > 0) {
                arg0.field3589 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3485 * var9) + 0.5D);
            } else {
                arg0.field3589 += 128;
            }
            while (arg0.field3594 < var7.field3489.length - 2 && arg0.field3589 > (var7.field3489[arg0.field3594 + 2] & 0xFF) << 8) {
                arg0.field3594 += 2;
            }
            if (arg0.field3594 == var7.field3489.length - 2 && var7.field3489[arg0.field3594 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3583 >= 0 && var7.field3483 != null && (this.field3517[arg0.field3591] & 0x1) == 0 && (arg0.field3581 < 0 || this.field3524[arg0.field3591][arg0.field3581] != arg0)) {
            if (var7.field3488 > 0) {
                arg0.field3583 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3488 * var9) + 0.5D);
            } else {
                arg0.field3583 += 128;
            }
            while (arg0.field3585 < var7.field3483.length - 2 && arg0.field3583 > (var7.field3483[arg0.field3585 + 2] & 0xFF) << 8) {
                arg0.field3585 += 2;
            }
            if (arg0.field3585 == var7.field3483.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3595.method841(arg0.field3578, this.method5468(arg0), this.method5469(arg0));
            return false;
        }
        arg0.field3595.method836(arg0.field3578);
        if (arg1 == null) {
            arg0.field3595.method678(arg3);
        } else {
            arg0.field3595.method667(arg1, arg2, arg3);
        }
        if (arg0.field3595.method846()) {
            this.field3531.field3572.method670(arg0.field3595);
        }
        arg0.method5629();
        if (arg0.field3583 >= 0) {
            arg0.method7855();
            if (arg0.field3581 > 0 && this.field3524[arg0.field3591][arg0.field3581] == arg0) {
                this.field3524[arg0.field3591][arg0.field3581] = null;
            }
        }
        return true;
    }
}
