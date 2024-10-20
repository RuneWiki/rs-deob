package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mc")
public class class332 extends class50 {

    @ObfuscatedName("mc.aq")
    public class521 field3629;

    @ObfuscatedName("mc.ad")
    public int field3597 = 256;

    @ObfuscatedName("mc.ag")
    public int field3618 = 1000000;

    @ObfuscatedName("mc.ak")
    public int[] field3616 = new int[16];

    @ObfuscatedName("mc.ap")
    public int[] field3600 = new int[16];

    @ObfuscatedName("mc.an")
    public int[] field3601 = new int[16];

    @ObfuscatedName("mc.aj")
    public int[] field3602 = new int[16];

    @ObfuscatedName("mc.av")
    public int[] field3603 = new int[16];

    @ObfuscatedName("mc.ab")
    public int[] field3604 = new int[16];

    @ObfuscatedName("mc.ai")
    public int[] field3605 = new int[16];

    @ObfuscatedName("mc.ae")
    public int[] field3622 = new int[16];

    @ObfuscatedName("mc.au")
    public int[] field3607 = new int[16];

    @ObfuscatedName("mc.aa")
    public int[] field3609 = new int[16];

    @ObfuscatedName("mc.as")
    public int[] field3610 = new int[16];

    @ObfuscatedName("mc.aw")
    public int[] field3621 = new int[16];

    @ObfuscatedName("mc.at")
    public int[] field3612 = new int[16];

    @ObfuscatedName("mc.af")
    public int[] field3598 = new int[16];

    @ObfuscatedName("mc.am")
    public int[] field3614 = new int[16];

    @ObfuscatedName("mc.ar")
    public class341[][] field3615 = new class341[16][128];

    @ObfuscatedName("mc.bt")
    public class341[][] field3596 = new class341[16][128];

    @ObfuscatedName("mc.bj")
    public class333 field3623 = new class333();

    @ObfuscatedName("mc.be")
    public boolean field3617;

    @ObfuscatedName("mc.bm")
    public int field3619;

    @ObfuscatedName("mc.bo")
    public int field3620;

    @ObfuscatedName("mc.bi")
    public long field3606;

    @ObfuscatedName("mc.ba")
    public long field3611;

    @ObfuscatedName("mc.bg")
    public class339 field3627 = new class339(this);

    @ObfuscatedName("mc.bs")
    public class43 field3624 = null;

    @ObfuscatedName("mc.bp")
    public PriorityQueue field3625 = new PriorityQueue(5, new class342());

    @ObfuscatedName("mc.bx")
    public static AtomicBoolean field3626 = null;

    @ObfuscatedName("mc.bu")
    public static ThreadPoolExecutor field3599 = null;

    @ObfuscatedName("mc.by")
    public int field3628 = 0;

    public class332(class43 arg0) {
        this.field3624 = arg0;
        this.field3629 = new class521(128);
        this.method5629();
    }

    @ObfuscatedName("mc.aq(IB)V")
    public void method5609(int arg0) {
        class43 var2 = this.field3624;
        synchronized (this.field3624) {
            this.field3597 = arg0;
        }
    }

    @ObfuscatedName("mc.ad(I)I")
    public int method5610() {
        return this.field3597;
    }

    @ObfuscatedName("mc.ag(Lnz;Lok;Lbh;B)Z")
    public boolean method5611(class340 arg0, class388 arg1, class46 arg2) {
        class43 var4 = this.field3624;
        synchronized (this.field3624) {
            boolean var5 = true;
            PriorityQueue var6 = this.field3625;
            synchronized (this.field3625) {
                this.field3625.clear();
            }
            for (class344 var8 = (class344) arg0.field3674.method8467(); var8 != null; var8 = (class344) arg0.field3674.method8471()) {
                int var9 = (int) var8.field5082;
                class336 var10 = (class336) this.field3629.method8464((long) var9);
                if (var10 == null) {
                    var10 = class336.method478(arg1, var9);
                    if (var10 == null) {
                        var5 = false;
                        continue;
                    }
                    this.field3629.method8470(var10, (long) var9);
                }
                if (!var10.method5777(arg2, var8.field3722)) {
                    var5 = false;
                } else if (this.field3625 != null) {
                    PriorityQueue var11 = this.field3625;
                    synchronized (this.field3625) {
                        Iterator var12 = var10.field3660.iterator();
                        while (var12.hasNext()) {
                            class54 var13 = (class54) var12.next();
                            this.field3625.add(new class335(var8.field3720, var13));
                        }
                    }
                }
            }
            return var5;
        }
    }

    @ObfuscatedName("mc.ak(I)V")
    public void method5612() {
        if (this.field3625 == null) {
            return;
        }
        if (field3626 != null) {
            field3626.set(true);
        }
        field3626 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3626;
        if (field3599 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3599 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class334(this));
        }
        field3599.submit(new class338(this, var1));
    }

    @ObfuscatedName("mc.ap(B)V")
    public void method5668() {
        class43 var1 = this.field3624;
        synchronized (this.field3624) {
            for (class336 var2 = (class336) this.field3629.method8467(); var2 != null; var2 = (class336) this.field3629.method8471()) {
                var2.method5778();
            }
        }
    }

    @ObfuscatedName("mc.ai(B)V")
    public void method5613() {
        class43 var1 = this.field3624;
        synchronized (this.field3624) {
            for (class336 var2 = (class336) this.field3629.method8467(); var2 != null; var2 = (class336) this.field3629.method8471()) {
                var2.method8130();
            }
        }
    }

    @ObfuscatedName("mc.au(Lnz;ZI)V")
    public void method5666(class340 arg0, boolean arg1) {
        class43 var3 = this.field3624;
        synchronized (this.field3624) {
            this.method5642();
            this.field3623.method5738(arg0.field3675);
            this.field3617 = arg1;
            this.field3606 = 0L;
            int var4 = this.field3623.method5728();
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3623.method5770(var5);
                this.field3623.method5765(var5);
                this.field3623.method5751(var5);
            }
            this.field3619 = this.field3623.method5735();
            this.field3620 = this.field3623.field3635[this.field3619];
            this.field3611 = this.field3623.method5734(this.field3620);
        }
    }

    @ObfuscatedName("mc.ah(B)V")
    public void method5642() {
        class43 var1 = this.field3624;
        synchronized (this.field3624) {
            this.field3623.method5724();
            this.method5629();
        }
    }

    @ObfuscatedName("mc.az(B)Z")
    public boolean method5615() {
        class43 var1 = this.field3624;
        synchronized (this.field3624) {
            return this.field3623.method5725();
        }
    }

    @ObfuscatedName("mc.ax(I)Z")
    public boolean method5616() {
        class43 var1 = this.field3624;
        synchronized (this.field3624) {
            return this.field3629.method8465() > 0;
        }
    }

    @ObfuscatedName("mc.ac(III)V")
    public void method5617(int arg0, int arg1) {
        class43 var3 = this.field3624;
        synchronized (this.field3624) {
            this.method5636(arg0, arg1);
        }
    }

    @ObfuscatedName("mc.al(III)V")
    public void method5636(int arg0, int arg1) {
        this.field3602[arg0] = arg1;
        this.field3604[arg0] = arg1 & 0xFFFFFF80;
        this.method5685(arg0, arg1);
    }

    @ObfuscatedName("mc.ay(IIB)V")
    public void method5685(int arg0, int arg1) {
        if (this.field3603[arg0] != arg1) {
            this.field3603[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3596[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mc.ao(IIIS)V")
    public void method5620(int arg0, int arg1, int arg2) {
        this.method5657(arg0, arg1, 64);
        if ((this.field3609[arg0] & 0x2) != 0) {
            for (class341 var4 = (class341) this.field3627.field3670.method6798(); var4 != null; var4 = (class341) this.field3627.field3670.method6800()) {
                if (var4.field3686 == arg0 && var4.field3681 < 0) {
                    this.field3615[arg0][var4.field3676] = null;
                    this.field3615[arg0][arg1] = var4;
                    int var5 = (var4.field3685 * var4.field3679 >> 12) + var4.field3684;
                    var4.field3684 += arg1 - var4.field3676 << 8;
                    var4.field3685 = var5 - var4.field3684;
                    var4.field3679 = 4096;
                    var4.field3676 = arg1;
                    return;
                }
            }
        }
        class336 var6 = (class336) this.field3629.method8464((long) this.field3603[arg0]);
        if (var6 == null || var6.field3654[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3654[arg1].method1026();
        if (var7 == null) {
            return;
        }
        class341 var8 = new class341();
        var8.field3686 = arg0;
        var8.field3677 = var6;
        var8.field3678 = var7;
        var8.field3691 = var6.field3652[arg1];
        var8.field3680 = var6.field3658[arg1];
        var8.field3676 = arg1;
        var8.field3682 = var6.field3657 * arg2 * arg2 * var6.field3656[arg1] + 1024 >> 11;
        var8.field3683 = var6.field3653[arg1] & 0xFF;
        var8.field3684 = (arg1 << 8) - (var6.field3655[arg1] & 0x7FFF);
        var8.field3690 = 0;
        var8.field3687 = 0;
        var8.field3695 = 0;
        var8.field3681 = -1;
        var8.field3689 = 0;
        if (this.field3612[arg0] == 0) {
            var8.field3694 = class49.method878(var7, this.method5633(var8), this.method5638(var8), this.method5628(var8));
        } else {
            var8.field3694 = class49.method878(var7, this.method5633(var8), 0, this.method5628(var8));
            this.method5627(var8, var6.field3655[arg1] < 0);
        }
        if (var6.field3655[arg1] < 0) {
            var8.field3694.method963(-1);
        }
        if (var8.field3680 >= 0) {
            class341 var9 = this.field3596[arg0][var8.field3680];
            if (var9 != null && var9.field3681 < 0) {
                this.field3615[arg0][var9.field3676] = null;
                var9.field3681 = 0;
            }
            this.field3596[arg0][var8.field3680] = var8;
        }
        this.field3627.field3670.method6794(var8);
        this.field3615[arg0][arg1] = var8;
    }

    @ObfuscatedName("mc.aa(Lna;ZS)V")
    public void method5627(class341 arg0, boolean arg1) {
        int var3 = arg0.field3678.field248.length;
        int var5;
        if (arg1 && arg0.field3678.field252) {
            int var4 = var3 + var3 - arg0.field3678.field250;
            var5 = (int) ((long) this.field3612[arg0.field3686] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3694.method936(true);
            }
        } else {
            var5 = (int) ((long) this.field3612[arg0.field3686] * (long) var3 >> 6);
        }
        arg0.field3694.method959(var5);
    }

    @ObfuscatedName("mc.as(IIII)V")
    public void method5657(int arg0, int arg1, int arg2) {
        class341 var4 = this.field3615[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3615[arg0][arg1] = null;
        if ((this.field3609[arg0] & 0x2) == 0) {
            var4.field3681 = 0;
            return;
        }
        for (class341 var5 = (class341) this.field3627.field3670.method6814(); var5 != null; var5 = (class341) this.field3627.field3670.method6799()) {
            if (var4.field3686 == var5.field3686 && var5.field3681 < 0 && var4 != var5) {
                var4.field3681 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mc.aw(IIIB)V")
    public void method5711(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mc.at(III)V")
    public void method5624(int arg0, int arg1) {
    }

    @ObfuscatedName("mc.af(IIB)V")
    public void method5717(int arg0, int arg1) {
        this.field3605[arg0] = arg1;
    }

    @ObfuscatedName("mc.bx(II)V")
    public void method5626(int arg0) {
        for (class341 var2 = (class341) this.field3627.field3670.method6814(); var2 != null; var2 = (class341) this.field3627.field3670.method6799()) {
            if (arg0 < 0 || var2.field3686 == arg0) {
                if (var2.field3694 != null) {
                    var2.field3694.method890(Statics.field264 / 100);
                    if (var2.field3694.method885()) {
                        this.field3627.field3671.method711(var2.field3694);
                    }
                    var2.method5803();
                }
                if (var2.field3681 < 0) {
                    this.field3615[var2.field3686][var2.field3676] = null;
                }
                var2.method8130();
            }
        }
    }

    @ObfuscatedName("mc.bu(IB)V")
    public void method5691(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5691(var2);
            }
            return;
        }
        this.field3616[arg0] = 12800;
        this.field3600[arg0] = 8192;
        this.field3601[arg0] = 16383;
        this.field3605[arg0] = 8192;
        this.field3622[arg0] = 0;
        this.field3607[arg0] = 8192;
        this.method5660(arg0);
        this.method5630(arg0);
        this.field3609[arg0] = 0;
        this.field3610[arg0] = 32767;
        this.field3621[arg0] = 256;
        this.field3612[arg0] = 0;
        this.method5632(arg0, 8192);
    }

    @ObfuscatedName("mc.by(IB)V")
    public void method5694(int arg0) {
        for (class341 var2 = (class341) this.field3627.field3670.method6814(); var2 != null; var2 = (class341) this.field3627.field3670.method6799()) {
            if ((arg0 < 0 || var2.field3686 == arg0) && var2.field3681 < 0) {
                this.field3615[var2.field3686][var2.field3676] = null;
                var2.field3681 = 0;
            }
        }
    }

    @ObfuscatedName("mc.bc(I)V")
    public void method5629() {
        this.method5626(-1);
        this.method5691(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3603[var1] = this.field3602[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3604[var2] = this.field3602[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mc.bb(IS)V")
    public void method5660(int arg0) {
        if ((this.field3609[arg0] & 0x2) == 0) {
            return;
        }
        for (class341 var2 = (class341) this.field3627.field3670.method6814(); var2 != null; var2 = (class341) this.field3627.field3670.method6799()) {
            if (var2.field3686 == arg0 && this.field3615[arg0][var2.field3676] == null && var2.field3681 < 0) {
                var2.field3681 = 0;
            }
        }
    }

    @ObfuscatedName("mc.bn(IB)V")
    public void method5630(int arg0) {
        if ((this.field3609[arg0] & 0x4) == 0) {
            return;
        }
        for (class341 var2 = (class341) this.field3627.field3670.method6814(); var2 != null; var2 = (class341) this.field3627.field3670.method6799()) {
            if (var2.field3686 == arg0) {
                var2.field3696 = 0;
            }
        }
    }

    @ObfuscatedName("mc.bh(IB)V")
    public void method5703(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5657(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5620(var6, var7, var8);
            } else {
                this.method5657(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5711(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3604[var12] = (var14 << 14) + (this.field3604[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3604[var12] = (var14 << 7) + (this.field3604[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3622[var12] = (var14 << 7) + (this.field3622[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3622[var12] = (this.field3622[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3607[var12] = (var14 << 7) + (this.field3607[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3607[var12] = (this.field3607[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3616[var12] = (var14 << 7) + (this.field3616[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3616[var12] = (this.field3616[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3600[var12] = (var14 << 7) + (this.field3600[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3600[var12] = (this.field3600[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3601[var12] = (var14 << 7) + (this.field3601[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3601[var12] = (this.field3601[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3609[var12] |= 0x1;
                } else {
                    this.field3609[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3609[var12] |= 0x2;
                } else {
                    this.method5660(var12);
                    this.field3609[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3610[var12] = (var14 << 7) + (this.field3610[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3610[var12] = (this.field3610[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3610[var12] = (var14 << 7) + (this.field3610[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3610[var12] = (this.field3610[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5626(var12);
            }
            if (var13 == 121) {
                this.method5691(var12);
            }
            if (var13 == 123) {
                this.method5694(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3610[var12];
                if (var15 == 16384) {
                    this.field3621[var12] = (var14 << 7) + (this.field3621[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3610[var12];
                if (var16 == 16384) {
                    this.field3621[var12] = (this.field3621[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3612[var12] = (var14 << 7) + (this.field3612[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3612[var12] = (this.field3612[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3609[var12] |= 0x4;
                } else {
                    this.method5630(var12);
                    this.field3609[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5632(var12, (var14 << 7) + (this.field3598[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5632(var12, (this.field3598[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5685(var17, this.field3604[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5624(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5717(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5629();
            }
        }
    }

    @ObfuscatedName("mc.bq(III)V")
    public void method5632(int arg0, int arg1) {
        this.field3598[arg0] = arg1;
        this.field3614[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mc.bd(Lna;I)I")
    public int method5633(class341 arg0) {
        int var2 = (arg0.field3685 * arg0.field3679 >> 12) + arg0.field3684;
        int var3 = ((this.field3605[arg0.field3686] - 8192) * this.field3621[arg0.field3686] >> 12) + var2;
        class330 var4 = arg0.field3691;
        if (var4.field3574 > 0 && (var4.field3568 > 0 || this.field3622[arg0.field3686] > 0)) {
            int var5 = var4.field3568 << 2;
            int var6 = var4.field3570 << 1;
            if (arg0.field3688 < var6) {
                var5 = arg0.field3688 * var5 / var6;
            }
            int var7 = (this.field3622[arg0.field3686] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3693 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3678.field251 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field264 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mc.bz(Lna;I)I")
    public int method5638(class341 arg0) {
        class330 var2 = arg0.field3691;
        int var3 = this.field3616[arg0.field3686] * this.field3601[arg0.field3686] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3682 * var4 + 16384 >> 15;
        int var6 = this.field3597 * var5 + 128 >> 8;
        if (var2.field3569 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3690 * 1.953125E-5D * (double) var2.field3569) + 0.5D);
        }
        if (var2.field3579 != null) {
            int var7 = arg0.field3687;
            int var8 = var2.field3579[arg0.field3695 + 1];
            if (arg0.field3695 < var2.field3579.length - 2) {
                int var9 = (var2.field3579[arg0.field3695] & 0xFF) << 8;
                int var10 = (var2.field3579[arg0.field3695 + 2] & 0xFF) << 8;
                var8 += (var2.field3579[arg0.field3695 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3681 > 0 && var2.field3575 != null) {
            int var11 = arg0.field3681;
            int var12 = var2.field3575[arg0.field3689 + 1];
            if (arg0.field3689 < var2.field3575.length - 2) {
                int var13 = (var2.field3575[arg0.field3689] & 0xFF) << 8;
                int var14 = (var2.field3575[arg0.field3689 + 2] & 0xFF) << 8;
                var12 += (var2.field3575[arg0.field3689 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mc.bk(Lna;I)I")
    public int method5628(class341 arg0) {
        int var2 = this.field3600[arg0.field3686];
        return var2 < 8192 ? arg0.field3683 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3683) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mc.an()Lbk;")
    public class50 method750() {
        return this.field3627;
    }

    @ObfuscatedName("mc.aj()Lbk;")
    public class50 method738() {
        return null;
    }

    @ObfuscatedName("mc.av()I")
    public int method724() {
        return 0;
    }

    @ObfuscatedName("mc.ab([III)V")
    public void method718(int[] arg0, int arg1, int arg2) {
        if (this.field3623.method5725()) {
            int var4 = this.field3618 * this.field3623.field3631 / Statics.field264;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3606;
                if (this.field3611 - var5 >= 0L) {
                    this.field3606 = var5;
                    break;
                }
                int var7 = (int) ((this.field3611 - this.field3606 + (long) var4 - 1L) / (long) var4);
                this.field3606 += (long) var4 * (long) var7;
                this.field3627.method718(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5683();
            } while (this.field3623.method5725());
        }
        this.field3627.method718(arg0, arg1, arg2);
    }

    @ObfuscatedName("mc.ae(I)V")
    public void method721(int arg0) {
        if (this.field3623.method5725()) {
            int var2 = this.field3618 * this.field3623.field3631 / Statics.field264;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3606;
                if (this.field3611 - var3 >= 0L) {
                    this.field3606 = var3;
                    break;
                }
                int var5 = (int) ((this.field3611 - this.field3606 + (long) var2 - 1L) / (long) var2);
                this.field3606 += (long) var2 * (long) var5;
                this.field3627.method721(var5);
                arg0 -= var5;
                this.method5683();
            } while (this.field3623.method5725());
        }
        this.field3627.method721(arg0);
    }

    @ObfuscatedName("mc.br(I)V")
    public void method5683() {
        int var1 = this.field3619;
        int var2 = this.field3620;
        long var3 = this.field3611;
        while (this.field3620 == var2) {
            while (this.field3623.field3635[var1] == var2) {
                this.field3623.method5770(var1);
                int var5 = this.field3623.method5731(var1);
                if (var5 == 1) {
                    this.field3623.method5729();
                    this.field3623.method5751(var1);
                    if (this.field3623.method5736()) {
                        if (!this.field3617 || var2 == 0) {
                            this.method5629();
                            this.field3623.method5724();
                            return;
                        }
                        this.field3623.method5737(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5703(var5);
                }
                this.field3623.method5765(var1);
                this.field3623.method5751(var1);
            }
            var1 = this.field3623.method5735();
            var2 = this.field3623.field3635[var1];
            var3 = this.field3623.method5734(var2);
        }
        this.field3619 = var1;
        this.field3620 = var2;
        this.field3611 = var3;
    }

    @ObfuscatedName("mc.bf(Lna;B)Z")
    public boolean method5664(class341 arg0) {
        if (arg0.field3694 != null) {
            return false;
        }
        if (arg0.field3681 >= 0) {
            arg0.method8130();
            if (arg0.field3680 > 0 && this.field3596[arg0.field3686][arg0.field3680] == arg0) {
                this.field3596[arg0.field3686][arg0.field3680] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mc.cf(Lna;[IIII)Z")
    public boolean method5686(class341 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3692 = Statics.field264 / 100;
        if (arg0.field3681 >= 0 && arg0.field3694 == null || arg0.field3694.method893()) {
            arg0.method5803();
            arg0.method8130();
            if (arg0.field3680 > 0 && this.field3596[arg0.field3686][arg0.field3680] == arg0) {
                this.field3596[arg0.field3686][arg0.field3680] = null;
            }
            return true;
        }
        int var5 = arg0.field3679;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3607[arg0.field3686] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3679 = var6;
        }
        arg0.field3694.method891(this.method5633(arg0));
        class330 var7 = arg0.field3691;
        boolean var8 = false;
        arg0.field3688++;
        arg0.field3693 += var7.field3574;
        double var9 = (double) ((arg0.field3676 - 60 << 8) + (arg0.field3685 * arg0.field3679 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3569 > 0) {
            if (var7.field3572 > 0) {
                arg0.field3690 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3572 * var9) + 0.5D);
            } else {
                arg0.field3690 += 128;
            }
        }
        if (var7.field3579 != null) {
            if (var7.field3573 > 0) {
                arg0.field3687 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3573 * var9) + 0.5D);
            } else {
                arg0.field3687 += 128;
            }
            while (arg0.field3695 < var7.field3579.length - 2 && arg0.field3687 > (var7.field3579[arg0.field3695 + 2] & 0xFF) << 8) {
                arg0.field3695 += 2;
            }
            if (arg0.field3695 == var7.field3579.length - 2 && var7.field3579[arg0.field3695 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3681 >= 0 && var7.field3575 != null && (this.field3609[arg0.field3686] & 0x1) == 0 && (arg0.field3680 < 0 || this.field3596[arg0.field3686][arg0.field3680] != arg0)) {
            if (var7.field3571 > 0) {
                arg0.field3681 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3571 * var9) + 0.5D);
            } else {
                arg0.field3681 += 128;
            }
            while (arg0.field3689 < var7.field3575.length - 2 && arg0.field3681 > (var7.field3575[arg0.field3689 + 2] & 0xFF) << 8) {
                arg0.field3689 += 2;
            }
            if (arg0.field3689 == var7.field3575.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3694.method889(arg0.field3692, this.method5638(arg0), this.method5628(arg0));
            return false;
        }
        arg0.field3694.method890(arg0.field3692);
        if (arg1 == null) {
            arg0.field3694.method721(arg3);
        } else {
            arg0.field3694.method718(arg1, arg2, arg3);
        }
        if (arg0.field3694.method885()) {
            this.field3627.field3671.method711(arg0.field3694);
        }
        arg0.method5803();
        if (arg0.field3681 >= 0) {
            arg0.method8130();
            if (arg0.field3680 > 0 && this.field3596[arg0.field3686][arg0.field3680] == arg0) {
                this.field3596[arg0.field3686][arg0.field3680] = null;
            }
        }
        return true;
    }
}
