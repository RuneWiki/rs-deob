package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mo")
public class class323 extends class50 {

    @ObfuscatedName("mo.aq")
    public class508 field3488;

    @ObfuscatedName("mo.aw")
    public int field3489 = 256;

    @ObfuscatedName("mo.al")
    public int field3496 = 1000000;

    @ObfuscatedName("mo.ai")
    public int[] field3491 = new int[16];

    @ObfuscatedName("mo.ar")
    public int[] field3492 = new int[16];

    @ObfuscatedName("mo.as")
    public int[] field3515 = new int[16];

    @ObfuscatedName("mo.aa")
    public int[] field3494 = new int[16];

    @ObfuscatedName("mo.az")
    public int[] field3495 = new int[16];

    @ObfuscatedName("mo.ao")
    public int[] field3504 = new int[16];

    @ObfuscatedName("mo.au")
    public int[] field3497 = new int[16];

    @ObfuscatedName("mo.ak")
    public int[] field3503 = new int[16];

    @ObfuscatedName("mo.ah")
    public int[] field3493 = new int[16];

    @ObfuscatedName("mo.at")
    public int[] field3500 = new int[16];

    @ObfuscatedName("mo.ay")
    public int[] field3501 = new int[16];

    @ObfuscatedName("mo.ae")
    public int[] field3502 = new int[16];

    @ObfuscatedName("mo.ac")
    public int[] field3498 = new int[16];

    @ObfuscatedName("mo.ab")
    public int[] field3505 = new int[16];

    @ObfuscatedName("mo.av")
    public int[] field3517 = new int[16];

    @ObfuscatedName("mo.ap")
    public class332[][] field3506 = new class332[16][128];

    @ObfuscatedName("mo.bu")
    public class332[][] field3507 = new class332[16][128];

    @ObfuscatedName("mo.bo")
    public class324 field3508 = new class324();

    @ObfuscatedName("mo.bd")
    public boolean field3509;

    @ObfuscatedName("mo.bi")
    public int field3510;

    @ObfuscatedName("mo.bq")
    public int field3511;

    @ObfuscatedName("mo.ba")
    public long field3499;

    @ObfuscatedName("mo.bt")
    public long field3513;

    @ObfuscatedName("mo.bk")
    public class330 field3514 = new class330(this);

    @ObfuscatedName("mo.bm")
    public class43 field3490 = null;

    @ObfuscatedName("mo.bw")
    public PriorityQueue field3516 = new PriorityQueue(5, new class333());

    @ObfuscatedName("mo.bv")
    public static AtomicBoolean field3512 = null;

    @ObfuscatedName("mo.by")
    public static ThreadPoolExecutor field3518 = null;

    @ObfuscatedName("mo.bb")
    public int field3519 = 0;

    public class323(class43 arg0) {
        this.field3490 = arg0;
        this.field3488 = new class508(128);
        this.method5563();
    }

    @ObfuscatedName("mo.aq(II)V")
    public void method5622(int arg0) {
        class43 var2 = this.field3490;
        synchronized (this.field3490) {
            this.field3489 = arg0;
        }
    }

    @ObfuscatedName("mo.aw(S)I")
    public int method5544() {
        return this.field3489;
    }

    @ObfuscatedName("mo.al(Lmu;Lof;Lbc;I)Z")
    public boolean method5545(class331 arg0, class378 arg1, class46 arg2) {
        class43 var4 = this.field3490;
        synchronized (this.field3490) {
            boolean var5 = true;
            PriorityQueue var6 = this.field3516;
            synchronized (this.field3516) {
                this.field3516.clear();
            }
            for (class335 var8 = (class335) arg0.field3564.method8325(); var8 != null; var8 = (class335) arg0.field3564.method8333()) {
                int var9 = (int) var8.field4920;
                class327 var10 = (class327) this.field3488.method8322((long) var9);
                if (var10 == null) {
                    byte[] var11 = arg1.method6425(var9);
                    class327 var12;
                    if (var11 == null) {
                        var12 = null;
                    } else {
                        var12 = new class327(var11);
                    }
                    var10 = var12;
                    if (var12 == null) {
                        var5 = false;
                        continue;
                    }
                    this.field3488.method8324(var12, (long) var9);
                }
                if (!var10.method5703(arg2, var8.field3607)) {
                    var5 = false;
                } else if (this.field3516 != null) {
                    PriorityQueue var13 = this.field3516;
                    synchronized (this.field3516) {
                        Iterator var14 = var10.field3546.iterator();
                        while (var14.hasNext()) {
                            class54 var15 = (class54) var14.next();
                            this.field3516.add(new class326(var8.field3605, var15));
                        }
                    }
                }
            }
            return var5;
        }
    }

    @ObfuscatedName("mo.ai(B)V")
    public void method5546() {
        if (this.field3516 == null) {
            return;
        }
        if (field3512 != null) {
            field3512.set(true);
        }
        field3512 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3512;
        if (field3518 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3518 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class325(this));
        }
        field3518.submit(new class329(this, var1));
    }

    @ObfuscatedName("mo.ar(B)V")
    public void method5547() {
        class43 var1 = this.field3490;
        synchronized (this.field3490) {
            for (class327 var2 = (class327) this.field3488.method8325(); var2 != null; var2 = (class327) this.field3488.method8333()) {
                var2.method5702();
            }
        }
    }

    @ObfuscatedName("mo.au(B)V")
    public void method5582() {
        class43 var1 = this.field3490;
        synchronized (this.field3490) {
            for (class327 var2 = (class327) this.field3488.method8325(); var2 != null; var2 = (class327) this.field3488.method8333()) {
                var2.method7996();
            }
        }
    }

    @ObfuscatedName("mo.ah(Lmu;ZI)V")
    public void method5549(class331 arg0, boolean arg1) {
        class43 var3 = this.field3490;
        synchronized (this.field3490) {
            this.method5550();
            this.field3508.method5650(arg0.field3563);
            this.field3509 = arg1;
            this.field3499 = 0L;
            int var4 = this.field3508.method5653();
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3508.method5654(var5);
                this.field3508.method5657(var5);
                this.field3508.method5649(var5);
            }
            this.field3510 = this.field3508.method5683();
            this.field3511 = this.field3508.field3525[this.field3510];
            this.field3513 = this.field3508.method5698(this.field3511);
        }
    }

    @ObfuscatedName("mo.aj(B)V")
    public void method5550() {
        class43 var1 = this.field3490;
        synchronized (this.field3490) {
            this.field3508.method5668();
            this.method5563();
        }
    }

    @ObfuscatedName("mo.af(B)Z")
    public boolean method5551() {
        class43 var1 = this.field3490;
        synchronized (this.field3490) {
            return this.field3508.method5652();
        }
    }

    @ObfuscatedName("mo.ax(B)Z")
    public boolean method5608() {
        class43 var1 = this.field3490;
        synchronized (this.field3490) {
            return this.field3488.method8323() > 0;
        }
    }

    @ObfuscatedName("mo.an(IIB)V")
    public void method5609(int arg0, int arg1) {
        class43 var3 = this.field3490;
        synchronized (this.field3490) {
            this.method5554(arg0, arg1);
        }
    }

    @ObfuscatedName("mo.ag(III)V")
    public void method5554(int arg0, int arg1) {
        this.field3494[arg0] = arg1;
        this.field3504[arg0] = arg1 & 0xFFFFFF80;
        this.method5555(arg0, arg1);
    }

    @ObfuscatedName("mo.am(IIB)V")
    public void method5555(int arg0, int arg1) {
        if (this.field3495[arg0] != arg1) {
            this.field3495[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3507[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mo.ad(IIIB)V")
    public void method5556(int arg0, int arg1, int arg2) {
        this.method5558(arg0, arg1, 64);
        if ((this.field3500[arg0] & 0x2) != 0) {
            for (class332 var4 = (class332) this.field3514.field3560.method6695(); var4 != null; var4 = (class332) this.field3514.field3560.method6685()) {
                if (var4.field3577 == arg0 && var4.field3579 < 0) {
                    this.field3506[arg0][var4.field3570] = null;
                    this.field3506[arg0][arg1] = var4;
                    int var5 = (var4.field3575 * var4.field3574 >> 12) + var4.field3582;
                    var4.field3582 += arg1 - var4.field3570 << 8;
                    var4.field3574 = var5 - var4.field3582;
                    var4.field3575 = 4096;
                    var4.field3570 = arg1;
                    return;
                }
            }
        }
        class327 var6 = (class327) this.field3488.method8322((long) this.field3495[arg0]);
        if (var6 == null || var6.field3548[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3548[arg1].method997();
        if (var7 == null) {
            return;
        }
        class332 var8 = new class332();
        var8.field3577 = arg0;
        var8.field3576 = var6;
        var8.field3567 = var7;
        var8.field3568 = var6.field3553[arg1];
        var8.field3573 = var6.field3555[arg1];
        var8.field3570 = arg1;
        var8.field3571 = var6.field3552 * arg2 * arg2 * var6.field3550[arg1] + 1024 >> 11;
        var8.field3581 = var6.field3551[arg1] & 0xFF;
        var8.field3582 = (arg1 << 8) - (var6.field3549[arg1] & 0x7FFF);
        var8.field3572 = 0;
        var8.field3583 = 0;
        var8.field3578 = 0;
        var8.field3579 = -1;
        var8.field3580 = 0;
        if (this.field3498[arg0] == 0) {
            var8.field3569 = class49.method819(var7, this.method5567(var8), this.method5568(var8), this.method5569(var8));
        } else {
            var8.field3569 = class49.method819(var7, this.method5567(var8), 0, this.method5569(var8));
            this.method5557(var8, var6.field3549[arg1] < 0);
        }
        if (var6.field3549[arg1] < 0) {
            var8.field3569.method900(-1);
        }
        if (var8.field3573 >= 0) {
            class332 var9 = this.field3507[arg0][var8.field3573];
            if (var9 != null && var9.field3579 < 0) {
                this.field3506[arg0][var9.field3570] = null;
                var9.field3579 = 0;
            }
            this.field3507[arg0][var8.field3573] = var8;
        }
        this.field3514.field3560.method6678(var8);
        this.field3506[arg0][arg1] = var8;
    }

    @ObfuscatedName("mo.at(Lmw;ZI)V")
    public void method5557(class332 arg0, boolean arg1) {
        int var3 = arg0.field3567.field270.length;
        int var5;
        if (arg1 && arg0.field3567.field267) {
            int var4 = var3 + var3 - arg0.field3567.field268;
            var5 = (int) ((long) this.field3498[arg0.field3577] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3569.method827(true);
            }
        } else {
            var5 = (int) ((long) this.field3498[arg0.field3577] * (long) var3 >> 6);
        }
        arg0.field3569.method857(var5);
    }

    @ObfuscatedName("mo.ay(IIII)V")
    public void method5558(int arg0, int arg1, int arg2) {
        class332 var4 = this.field3506[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3506[arg0][arg1] = null;
        if ((this.field3500[arg0] & 0x2) == 0) {
            var4.field3579 = 0;
            return;
        }
        for (class332 var5 = (class332) this.field3514.field3560.method6702(); var5 != null; var5 = (class332) this.field3514.field3560.method6684()) {
            if (var4.field3577 == var5.field3577 && var5.field3579 < 0 && var4 != var5) {
                var4.field3579 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mo.ae(IIIB)V")
    public void method5548(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mo.ac(IIB)V")
    public void method5589(int arg0, int arg1) {
    }

    @ObfuscatedName("mo.ab(III)V")
    public void method5559(int arg0, int arg1) {
        this.field3497[arg0] = arg1;
    }

    @ObfuscatedName("mo.bw(IB)V")
    public void method5560(int arg0) {
        for (class332 var2 = (class332) this.field3514.field3560.method6702(); var2 != null; var2 = (class332) this.field3514.field3560.method6684()) {
            if (arg0 < 0 || var2.field3577 == arg0) {
                if (var2.field3569 != null) {
                    var2.field3569.method906(Statics.field296 / 100);
                    if (var2.field3569.method821()) {
                        this.field3514.field3561.method699(var2.field3569);
                    }
                    var2.method5730();
                }
                if (var2.field3579 < 0) {
                    this.field3506[var2.field3577][var2.field3570] = null;
                }
                var2.method7996();
            }
        }
    }

    @ObfuscatedName("mo.bv(II)V")
    public void method5605(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5605(var2);
            }
            return;
        }
        this.field3491[arg0] = 12800;
        this.field3492[arg0] = 8192;
        this.field3515[arg0] = 16383;
        this.field3497[arg0] = 8192;
        this.field3503[arg0] = 0;
        this.field3493[arg0] = 8192;
        this.method5564(arg0);
        this.method5574(arg0);
        this.field3500[arg0] = 0;
        this.field3501[arg0] = 32767;
        this.field3502[arg0] = 256;
        this.field3498[arg0] = 0;
        this.method5565(arg0, 8192);
    }

    @ObfuscatedName("mo.by(II)V")
    public void method5626(int arg0) {
        for (class332 var2 = (class332) this.field3514.field3560.method6702(); var2 != null; var2 = (class332) this.field3514.field3560.method6684()) {
            if ((arg0 < 0 || var2.field3577 == arg0) && var2.field3579 < 0) {
                this.field3506[var2.field3577][var2.field3570] = null;
                var2.field3579 = 0;
            }
        }
    }

    @ObfuscatedName("mo.bb(B)V")
    public void method5563() {
        this.method5560(-1);
        this.method5605(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3495[var1] = this.field3494[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3504[var2] = this.field3494[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mo.bf(II)V")
    public void method5564(int arg0) {
        if ((this.field3500[arg0] & 0x2) == 0) {
            return;
        }
        for (class332 var2 = (class332) this.field3514.field3560.method6702(); var2 != null; var2 = (class332) this.field3514.field3560.method6684()) {
            if (var2.field3577 == arg0 && this.field3506[arg0][var2.field3570] == null && var2.field3579 < 0) {
                var2.field3579 = 0;
            }
        }
    }

    @ObfuscatedName("mo.bg(II)V")
    public void method5574(int arg0) {
        if ((this.field3500[arg0] & 0x4) == 0) {
            return;
        }
        for (class332 var2 = (class332) this.field3514.field3560.method6702(); var2 != null; var2 = (class332) this.field3514.field3560.method6684()) {
            if (var2.field3577 == arg0) {
                var2.field3585 = 0;
            }
        }
    }

    @ObfuscatedName("mo.be(IB)V")
    public void method5619(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5558(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5556(var6, var7, var8);
            } else {
                this.method5558(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5548(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3504[var12] = (var14 << 14) + (this.field3504[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3504[var12] = (var14 << 7) + (this.field3504[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3503[var12] = (var14 << 7) + (this.field3503[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3503[var12] = (this.field3503[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3493[var12] = (var14 << 7) + (this.field3493[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3493[var12] = (this.field3493[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3491[var12] = (var14 << 7) + (this.field3491[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3491[var12] = (this.field3491[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3492[var12] = (var14 << 7) + (this.field3492[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3492[var12] = (this.field3492[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3515[var12] = (var14 << 7) + (this.field3515[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3515[var12] = (this.field3515[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3500[var12] |= 0x1;
                } else {
                    this.field3500[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3500[var12] |= 0x2;
                } else {
                    this.method5564(var12);
                    this.field3500[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3501[var12] = (var14 << 7) + (this.field3501[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3501[var12] = (this.field3501[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3501[var12] = (var14 << 7) + (this.field3501[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3501[var12] = (this.field3501[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5560(var12);
            }
            if (var13 == 121) {
                this.method5605(var12);
            }
            if (var13 == 123) {
                this.method5626(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3501[var12];
                if (var15 == 16384) {
                    this.field3502[var12] = (var14 << 7) + (this.field3502[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3501[var12];
                if (var16 == 16384) {
                    this.field3502[var12] = (this.field3502[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3498[var12] = (var14 << 7) + (this.field3498[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3498[var12] = (this.field3498[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3500[var12] |= 0x4;
                } else {
                    this.method5574(var12);
                    this.field3500[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5565(var12, (var14 << 7) + (this.field3505[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5565(var12, (this.field3505[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5555(var17, this.field3504[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5589(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5559(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5563();
            }
        }
    }

    @ObfuscatedName("mo.bc(III)V")
    public void method5565(int arg0, int arg1) {
        this.field3505[arg0] = arg1;
        this.field3517[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mo.bz(Lmw;I)I")
    public int method5567(class332 arg0) {
        int var2 = (arg0.field3575 * arg0.field3574 >> 12) + arg0.field3582;
        int var3 = ((this.field3497[arg0.field3577] - 8192) * this.field3502[arg0.field3577] >> 12) + var2;
        class321 var4 = arg0.field3568;
        if (var4.field3473 > 0 && (var4.field3472 > 0 || this.field3503[arg0.field3577] > 0)) {
            int var5 = var4.field3472 << 2;
            int var6 = var4.field3474 << 1;
            if (arg0.field3587 < var6) {
                var5 = arg0.field3587 * var5 / var6;
            }
            int var7 = (this.field3503[arg0.field3577] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3566 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3567.field266 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field296 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mo.bs(Lmw;I)I")
    public int method5568(class332 arg0) {
        class321 var2 = arg0.field3568;
        int var3 = this.field3515[arg0.field3577] * this.field3491[arg0.field3577] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3571 * var4 + 16384 >> 15;
        int var6 = this.field3489 * var5 + 128 >> 8;
        if (var2.field3466 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3572 * 1.953125E-5D * (double) var2.field3466) + 0.5D);
        }
        if (var2.field3468 != null) {
            int var7 = arg0.field3583;
            int var8 = var2.field3468[arg0.field3578 + 1];
            if (arg0.field3578 < var2.field3468.length - 2) {
                int var9 = (var2.field3468[arg0.field3578] & 0xFF) << 8;
                int var10 = (var2.field3468[arg0.field3578 + 2] & 0xFF) << 8;
                var8 += (var2.field3468[arg0.field3578 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3579 > 0 && var2.field3467 != null) {
            int var11 = arg0.field3579;
            int var12 = var2.field3467[arg0.field3580 + 1];
            if (arg0.field3580 < var2.field3467.length - 2) {
                int var13 = (var2.field3467[arg0.field3580] & 0xFF) << 8;
                int var14 = (var2.field3467[arg0.field3580 + 2] & 0xFF) << 8;
                var12 += (var2.field3467[arg0.field3580 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mo.bj(Lmw;I)I")
    public int method5569(class332 arg0) {
        int var2 = this.field3492[arg0.field3577];
        return var2 < 8192 ? arg0.field3581 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3581) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mo.as()Lbj;")
    public class50 method663() {
        return this.field3514;
    }

    @ObfuscatedName("mo.aa()Lbj;")
    public class50 method662() {
        return null;
    }

    @ObfuscatedName("mo.az()I")
    public int method677() {
        return 0;
    }

    @ObfuscatedName("mo.ao([III)V")
    public void method666(int[] arg0, int arg1, int arg2) {
        if (this.field3508.method5652()) {
            int var4 = this.field3496 * this.field3508.field3526 / Statics.field296;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3499;
                if (this.field3513 - var5 >= 0L) {
                    this.field3499 = var5;
                    break;
                }
                int var7 = (int) ((this.field3513 - this.field3499 + (long) var4 - 1L) / (long) var4);
                this.field3499 += (long) var4 * (long) var7;
                this.field3514.method666(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5575();
            } while (this.field3508.method5652());
        }
        this.field3514.method666(arg0, arg1, arg2);
    }

    @ObfuscatedName("mo.ak(I)V")
    public void method668(int arg0) {
        if (this.field3508.method5652()) {
            int var2 = this.field3496 * this.field3508.field3526 / Statics.field296;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3499;
                if (this.field3513 - var3 >= 0L) {
                    this.field3499 = var3;
                    break;
                }
                int var5 = (int) ((this.field3513 - this.field3499 + (long) var2 - 1L) / (long) var2);
                this.field3499 += (long) var2 * (long) var5;
                this.field3514.method668(var5);
                arg0 -= var5;
                this.method5575();
            } while (this.field3508.method5652());
        }
        this.field3514.method668(arg0);
    }

    @ObfuscatedName("mo.bl(I)V")
    public void method5575() {
        int var1 = this.field3510;
        int var2 = this.field3511;
        long var3 = this.field3513;
        while (this.field3511 == var2) {
            while (this.field3508.field3525[var1] == var2) {
                this.field3508.method5654(var1);
                int var5 = this.field3508.method5666(var1);
                if (var5 == 1) {
                    this.field3508.method5656();
                    this.field3508.method5649(var1);
                    if (this.field3508.method5663()) {
                        if (!this.field3509 || var2 == 0) {
                            this.method5563();
                            this.field3508.method5668();
                            return;
                        }
                        this.field3508.method5696(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5619(var5);
                }
                this.field3508.method5657(var1);
                this.field3508.method5649(var1);
            }
            var1 = this.field3508.method5683();
            var2 = this.field3508.field3525[var1];
            var3 = this.field3508.method5698(var2);
        }
        this.field3510 = var1;
        this.field3511 = var2;
        this.field3513 = var3;
    }

    @ObfuscatedName("mo.bx(Lmw;B)Z")
    public boolean method5570(class332 arg0) {
        if (arg0.field3569 != null) {
            return false;
        }
        if (arg0.field3579 >= 0) {
            arg0.method7996();
            if (arg0.field3573 > 0 && this.field3507[arg0.field3577][arg0.field3573] == arg0) {
                this.field3507[arg0.field3577][arg0.field3573] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mo.cs(Lmw;[IIIB)Z")
    public boolean method5598(class332 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3584 = Statics.field296 / 100;
        if (arg0.field3579 >= 0 && arg0.field3569 == null || arg0.field3569.method934()) {
            arg0.method5730();
            arg0.method7996();
            if (arg0.field3573 > 0 && this.field3507[arg0.field3577][arg0.field3573] == arg0) {
                this.field3507[arg0.field3577][arg0.field3573] = null;
            }
            return true;
        }
        int var5 = arg0.field3575;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3493[arg0.field3577] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3575 = var6;
        }
        arg0.field3569.method909(this.method5567(arg0));
        class321 var7 = arg0.field3568;
        boolean var8 = false;
        arg0.field3587++;
        arg0.field3566 += var7.field3473;
        double var9 = (double) ((arg0.field3570 - 60 << 8) + (arg0.field3575 * arg0.field3574 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3466 > 0) {
            if (var7.field3471 > 0) {
                arg0.field3572 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3471 * var9) + 0.5D);
            } else {
                arg0.field3572 += 128;
            }
        }
        if (var7.field3468 != null) {
            if (var7.field3469 > 0) {
                arg0.field3583 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3469 * var9) + 0.5D);
            } else {
                arg0.field3583 += 128;
            }
            while (arg0.field3578 < var7.field3468.length - 2 && arg0.field3583 > (var7.field3468[arg0.field3578 + 2] & 0xFF) << 8) {
                arg0.field3578 += 2;
            }
            if (arg0.field3578 == var7.field3468.length - 2 && var7.field3468[arg0.field3578 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3579 >= 0 && var7.field3467 != null && (this.field3500[arg0.field3577] & 0x1) == 0 && (arg0.field3573 < 0 || this.field3507[arg0.field3577][arg0.field3573] != arg0)) {
            if (var7.field3470 > 0) {
                arg0.field3579 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3470 * var9) + 0.5D);
            } else {
                arg0.field3579 += 128;
            }
            while (arg0.field3580 < var7.field3467.length - 2 && arg0.field3579 > (var7.field3467[arg0.field3580 + 2] & 0xFF) << 8) {
                arg0.field3580 += 2;
            }
            if (arg0.field3580 == var7.field3467.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3569.method830(arg0.field3584, this.method5568(arg0), this.method5569(arg0));
            return false;
        }
        arg0.field3569.method906(arg0.field3584);
        if (arg1 == null) {
            arg0.field3569.method668(arg3);
        } else {
            arg0.field3569.method666(arg1, arg2, arg3);
        }
        if (arg0.field3569.method821()) {
            this.field3514.field3561.method699(arg0.field3569);
        }
        arg0.method5730();
        if (arg0.field3579 >= 0) {
            arg0.method7996();
            if (arg0.field3573 > 0 && this.field3507[arg0.field3577][arg0.field3573] == arg0) {
                this.field3507[arg0.field3577][arg0.field3573] = null;
            }
        }
        return true;
    }
}
