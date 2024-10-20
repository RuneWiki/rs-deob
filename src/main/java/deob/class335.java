package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mn")
public class class335 extends class50 {

    @ObfuscatedName("mn.ap")
    public class531 field3640;

    @ObfuscatedName("mn.aw")
    public int field3668 = 256;

    @ObfuscatedName("mn.ak")
    public int field3639 = 1000000;

    @ObfuscatedName("mn.aj")
    public int[] field3642 = new int[16];

    @ObfuscatedName("mn.ai")
    public int[] field3643 = new int[16];

    @ObfuscatedName("mn.ay")
    public int[] field3644 = new int[16];

    @ObfuscatedName("mn.as")
    public int[] field3645 = new int[16];

    @ObfuscatedName("mn.ae")
    public int[] field3672 = new int[16];

    @ObfuscatedName("mn.am")
    public int[] field3663 = new int[16];

    @ObfuscatedName("mn.at")
    public int[] field3666 = new int[16];

    @ObfuscatedName("mn.au")
    public int[] field3649 = new int[16];

    @ObfuscatedName("mn.an")
    public int[] field3658 = new int[16];

    @ObfuscatedName("mn.ac")
    public int[] field3653 = new int[16];

    @ObfuscatedName("mn.av")
    public int[] field3654 = new int[16];

    @ObfuscatedName("mn.ax")
    public int[] field3655 = new int[16];

    @ObfuscatedName("mn.aq")
    public int[] field3656 = new int[16];

    @ObfuscatedName("mn.al")
    public int[] field3650 = new int[16];

    @ObfuscatedName("mn.aa")
    public int[] field3651 = new int[16];

    @ObfuscatedName("mn.ah")
    public class344[][] field3659 = new class344[16][128];

    @ObfuscatedName("mn.bh")
    public class344[][] field3660 = new class344[16][128];

    @ObfuscatedName("mn.bj")
    public class336 field3661 = new class336();

    @ObfuscatedName("mn.bv")
    public boolean field3662;

    @ObfuscatedName("mn.bx")
    public int field3646;

    @ObfuscatedName("mn.bk")
    public int field3664;

    @ObfuscatedName("mn.bb")
    public long field3665;

    @ObfuscatedName("mn.bq")
    public long field3657;

    @ObfuscatedName("mn.bp")
    public class342 field3667 = new class342(this);

    @ObfuscatedName("mn.bz")
    public class43 field3670 = null;

    @ObfuscatedName("mn.bc")
    public PriorityQueue field3669 = new PriorityQueue(5, new class345());

    @ObfuscatedName("mn.by")
    public static AtomicBoolean field3647 = null;

    @ObfuscatedName("mn.br")
    public static ThreadPoolExecutor field3671 = null;

    @ObfuscatedName("mn.bn")
    public int field3648 = 0;

    public class335(class43 arg0) {
        this.field3670 = arg0;
        this.field3640 = new class531(128);
        this.method6060();
    }

    @ObfuscatedName("mn.ap(IS)V")
    public void method6093(int arg0) {
        class43 var2 = this.field3670;
        synchronized (this.field3670) {
            this.field3668 = arg0;
        }
    }

    @ObfuscatedName("mn.aw(I)I")
    public int method6039() {
        return this.field3668;
    }

    @ObfuscatedName("mn.ak(Lnv;Lpe;Lba;I)Z")
    public boolean method6040(class343 arg0, class392 arg1, class46 arg2) {
        class43 var4 = this.field3670;
        synchronized (this.field3670) {
            boolean var5 = true;
            PriorityQueue var6 = this.field3669;
            synchronized (this.field3669) {
                this.field3669.clear();
            }
            for (class347 var8 = (class347) arg0.field3720.method8996(); var8 != null; var8 = (class347) arg0.field3720.method8999()) {
                int var9 = (int) var8.field5170;
                class339 var10 = (class339) this.field3640.method8993((long) var9);
                if (var10 == null) {
                    var10 = class339.method5359(arg1, var9);
                    if (var10 == null) {
                        var5 = false;
                        continue;
                    }
                    this.field3640.method8990(var10, (long) var9);
                }
                if (!var10.method6197(arg2, var8.field3762)) {
                    var5 = false;
                } else if (this.field3669 != null) {
                    PriorityQueue var11 = this.field3669;
                    synchronized (this.field3669) {
                        Iterator var12 = var10.field3704.iterator();
                        while (var12.hasNext()) {
                            class54 var13 = (class54) var12.next();
                            this.field3669.add(new class338(var8.field3764, var13));
                        }
                    }
                }
            }
            return var5;
        }
    }

    @ObfuscatedName("mn.aj(B)V")
    public void method6041() {
        if (this.field3669 == null) {
            return;
        }
        if (field3647 != null) {
            field3647.set(true);
        }
        field3647 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3647;
        if (field3671 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3671 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class337(this));
        }
        field3671.submit(new class341(this, var1));
    }

    @ObfuscatedName("mn.ai(B)V")
    public void method6042() {
        class43 var1 = this.field3670;
        synchronized (this.field3670) {
            for (class339 var2 = (class339) this.field3640.method8996(); var2 != null; var2 = (class339) this.field3640.method8999()) {
                var2.method6198();
            }
        }
    }

    @ObfuscatedName("mn.at(I)V")
    public void method6043() {
        class43 var1 = this.field3670;
        synchronized (this.field3670) {
            for (class339 var2 = (class339) this.field3640.method8996(); var2 != null; var2 = (class339) this.field3640.method8999()) {
                var2.method8667();
            }
        }
    }

    @ObfuscatedName("mn.an(Lnv;ZI)V")
    public void method6044(class343 arg0, boolean arg1) {
        class43 var3 = this.field3670;
        synchronized (this.field3670) {
            this.method6137();
            this.field3661.method6151(arg0.field3719);
            this.field3662 = arg1;
            this.field3665 = 0L;
            int var4 = this.field3661.method6163();
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3661.method6175(var5);
                this.field3661.method6158(var5);
                this.field3661.method6156(var5);
            }
            this.field3646 = this.field3661.method6162();
            this.field3664 = this.field3661.field3678[this.field3646];
            this.field3657 = this.field3661.method6150(this.field3664);
        }
    }

    @ObfuscatedName("mn.ao(I)V")
    public void method6137() {
        class43 var1 = this.field3670;
        synchronized (this.field3670) {
            this.field3661.method6152();
            this.method6060();
        }
    }

    @ObfuscatedName("mn.af(I)Z")
    public boolean method6046() {
        class43 var1 = this.field3670;
        synchronized (this.field3670) {
            return this.field3661.method6153();
        }
    }

    @ObfuscatedName("mn.ar(I)Z")
    public boolean method6052() {
        class43 var1 = this.field3670;
        synchronized (this.field3670) {
            return this.field3640.method8988() > 0;
        }
    }

    @ObfuscatedName("mn.ab(III)V")
    public void method6048(int arg0, int arg1) {
        class43 var3 = this.field3670;
        synchronized (this.field3670) {
            this.method6147(arg0, arg1);
        }
    }

    @ObfuscatedName("mn.az(III)V")
    public void method6147(int arg0, int arg1) {
        this.field3645[arg0] = arg1;
        this.field3663[arg0] = arg1 & 0xFFFFFF80;
        this.method6114(arg0, arg1);
    }

    @ObfuscatedName("mn.ag(III)V")
    public void method6114(int arg0, int arg1) {
        if (this.field3672[arg0] != arg1) {
            this.field3672[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3660[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mn.ad(IIII)V")
    public void method6051(int arg0, int arg1, int arg2) {
        this.method6119(arg0, arg1, 64);
        if ((this.field3653[arg0] & 0x2) != 0) {
            for (class344 var4 = (class344) this.field3667.field3713.method7262(); var4 != null; var4 = (class344) this.field3667.field3713.method7273()) {
                if (var4.field3736 == arg0 && var4.field3732 < 0) {
                    this.field3659[arg0][var4.field3726] = null;
                    this.field3659[arg0][arg1] = var4;
                    int var5 = (var4.field3740 * var4.field3731 >> 12) + var4.field3721;
                    var4.field3721 += arg1 - var4.field3726 << 8;
                    var4.field3740 = var5 - var4.field3721;
                    var4.field3731 = 4096;
                    var4.field3726 = arg1;
                    return;
                }
            }
        }
        class339 var6 = (class339) this.field3640.method8993((long) this.field3672[arg0]);
        if (var6 == null || var6.field3705[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3705[arg1].method1062();
        if (var7 == null) {
            return;
        }
        class344 var8 = new class344();
        var8.field3736 = arg0;
        var8.field3722 = var6;
        var8.field3723 = var7;
        var8.field3724 = var6.field3702[arg1];
        var8.field3733 = var6.field3703[arg1];
        var8.field3726 = arg1;
        var8.field3727 = var6.field3698 * arg2 * arg2 * var6.field3700[arg1] + 1024 >> 11;
        var8.field3728 = var6.field3701[arg1] & 0xFF;
        var8.field3721 = (arg1 << 8) - (var6.field3699[arg1] & 0x7FFF);
        var8.field3729 = 0;
        var8.field3738 = 0;
        var8.field3734 = 0;
        var8.field3732 = -1;
        var8.field3725 = 0;
        if (this.field3656[arg0] == 0) {
            var8.field3739 = class49.method877(var7, this.method6065(var8), this.method6066(var8), this.method6099(var8));
        } else {
            var8.field3739 = class49.method877(var7, this.method6065(var8), 0, this.method6099(var8));
            this.method6116(var8, var6.field3699[arg1] < 0);
        }
        if (var6.field3699[arg1] < 0) {
            var8.field3739.method879(-1);
        }
        if (var8.field3733 >= 0) {
            class344 var9 = this.field3660[arg0][var8.field3733];
            if (var9 != null && var9.field3732 < 0) {
                this.field3659[arg0][var9.field3726] = null;
                var9.field3732 = 0;
            }
            this.field3660[arg0][var8.field3733] = var8;
        }
        this.field3667.field3713.method7243(var8);
        this.field3659[arg0][arg1] = var8;
    }

    @ObfuscatedName("mn.ac(Lnx;ZI)V")
    public void method6116(class344 arg0, boolean arg1) {
        int var3 = arg0.field3723.field242.length;
        int var5;
        if (arg1 && arg0.field3723.field241) {
            int var4 = var3 + var3 - arg0.field3723.field245;
            var5 = (int) ((long) this.field3656[arg0.field3736] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3739.method1011(true);
            }
        } else {
            var5 = (int) ((long) this.field3656[arg0.field3736] * (long) var3 >> 6);
        }
        arg0.field3739.method891(var5);
    }

    @ObfuscatedName("mn.av(IIII)V")
    public void method6119(int arg0, int arg1, int arg2) {
        class344 var4 = this.field3659[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3659[arg0][arg1] = null;
        if ((this.field3653[arg0] & 0x2) == 0) {
            var4.field3732 = 0;
            return;
        }
        for (class344 var5 = (class344) this.field3667.field3713.method7247(); var5 != null; var5 = (class344) this.field3667.field3713.method7249()) {
            if (var4.field3736 == var5.field3736 && var5.field3732 < 0 && var4 != var5) {
                var4.field3732 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mn.ax(IIII)V")
    public void method6054(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mn.aq(IIS)V")
    public void method6055(int arg0, int arg1) {
    }

    @ObfuscatedName("mn.al(III)V")
    public void method6139(int arg0, int arg1) {
        this.field3666[arg0] = arg1;
    }

    @ObfuscatedName("mn.bb(II)V")
    public void method6057(int arg0) {
        for (class344 var2 = (class344) this.field3667.field3713.method7247(); var2 != null; var2 = (class344) this.field3667.field3713.method7249()) {
            if (arg0 < 0 || var2.field3736 == arg0) {
                if (var2.field3739 != null) {
                    var2.field3739.method1002(Statics.field1060 / 100);
                    if (var2.field3739.method894()) {
                        this.field3667.field3714.method697(var2.field3739);
                    }
                    var2.method6223();
                }
                if (var2.field3732 < 0) {
                    this.field3659[var2.field3736][var2.field3726] = null;
                }
                var2.method8667();
            }
        }
    }

    @ObfuscatedName("mn.bq(II)V")
    public void method6058(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method6058(var2);
            }
            return;
        }
        this.field3642[arg0] = 12800;
        this.field3643[arg0] = 8192;
        this.field3644[arg0] = 16383;
        this.field3666[arg0] = 8192;
        this.field3649[arg0] = 0;
        this.field3658[arg0] = 8192;
        this.method6061(arg0);
        this.method6106(arg0);
        this.field3653[arg0] = 0;
        this.field3654[arg0] = 32767;
        this.field3655[arg0] = 256;
        this.field3656[arg0] = 0;
        this.method6064(arg0, 8192);
    }

    @ObfuscatedName("mn.bp(II)V")
    public void method6108(int arg0) {
        for (class344 var2 = (class344) this.field3667.field3713.method7247(); var2 != null; var2 = (class344) this.field3667.field3713.method7249()) {
            if ((arg0 < 0 || var2.field3736 == arg0) && var2.field3732 < 0) {
                this.field3659[var2.field3736][var2.field3726] = null;
                var2.field3732 = 0;
            }
        }
    }

    @ObfuscatedName("mn.by(I)V")
    public void method6060() {
        this.method6057(-1);
        this.method6058(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3672[var1] = this.field3645[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3663[var2] = this.field3645[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mn.br(IB)V")
    public void method6061(int arg0) {
        if ((this.field3653[arg0] & 0x2) == 0) {
            return;
        }
        for (class344 var2 = (class344) this.field3667.field3713.method7247(); var2 != null; var2 = (class344) this.field3667.field3713.method7249()) {
            if (var2.field3736 == arg0 && this.field3659[arg0][var2.field3726] == null && var2.field3732 < 0) {
                var2.field3732 = 0;
            }
        }
    }

    @ObfuscatedName("mn.bn(II)V")
    public void method6106(int arg0) {
        if ((this.field3653[arg0] & 0x4) == 0) {
            return;
        }
        for (class344 var2 = (class344) this.field3667.field3713.method7247(); var2 != null; var2 = (class344) this.field3667.field3713.method7249()) {
            if (var2.field3736 == arg0) {
                var2.field3741 = 0;
            }
        }
    }

    @ObfuscatedName("mn.bu(II)V")
    public void method6063(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method6119(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method6051(var6, var7, var8);
            } else {
                this.method6119(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method6054(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3663[var12] = (var14 << 14) + (this.field3663[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3663[var12] = (var14 << 7) + (this.field3663[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3649[var12] = (var14 << 7) + (this.field3649[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3649[var12] = (this.field3649[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3658[var12] = (var14 << 7) + (this.field3658[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3658[var12] = (this.field3658[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3642[var12] = (var14 << 7) + (this.field3642[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3642[var12] = (this.field3642[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3643[var12] = (var14 << 7) + (this.field3643[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3643[var12] = (this.field3643[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3644[var12] = (var14 << 7) + (this.field3644[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3644[var12] = (this.field3644[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3653[var12] |= 0x1;
                } else {
                    this.field3653[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3653[var12] |= 0x2;
                } else {
                    this.method6061(var12);
                    this.field3653[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3654[var12] = (var14 << 7) + (this.field3654[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3654[var12] = (this.field3654[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3654[var12] = (var14 << 7) + (this.field3654[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3654[var12] = (this.field3654[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method6057(var12);
            }
            if (var13 == 121) {
                this.method6058(var12);
            }
            if (var13 == 123) {
                this.method6108(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3654[var12];
                if (var15 == 16384) {
                    this.field3655[var12] = (var14 << 7) + (this.field3655[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3654[var12];
                if (var16 == 16384) {
                    this.field3655[var12] = (this.field3655[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3656[var12] = (var14 << 7) + (this.field3656[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3656[var12] = (this.field3656[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3653[var12] |= 0x4;
                } else {
                    this.method6106(var12);
                    this.field3653[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method6064(var12, (var14 << 7) + (this.field3650[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method6064(var12, (this.field3650[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method6114(var17, this.field3663[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method6055(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method6139(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method6060();
            }
        }
    }

    @ObfuscatedName("mn.bs(III)V")
    public void method6064(int arg0, int arg1) {
        this.field3650[arg0] = arg1;
        this.field3651[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mn.bm(Lnx;I)I")
    public int method6065(class344 arg0) {
        int var2 = (arg0.field3740 * arg0.field3731 >> 12) + arg0.field3721;
        int var3 = ((this.field3666[arg0.field3736] - 8192) * this.field3655[arg0.field3736] >> 12) + var2;
        class333 var4 = arg0.field3724;
        if (var4.field3619 > 0 && (var4.field3618 > 0 || this.field3649[arg0.field3736] > 0)) {
            int var5 = var4.field3618 << 2;
            int var6 = var4.field3620 << 1;
            if (arg0.field3737 < var6) {
                var5 = arg0.field3737 * var5 / var6;
            }
            int var7 = (this.field3649[arg0.field3736] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3730 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3723.field244 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1060 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mn.bo(Lnx;I)I")
    public int method6066(class344 arg0) {
        class333 var2 = arg0.field3724;
        int var3 = this.field3644[arg0.field3736] * this.field3642[arg0.field3736] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3727 * var4 + 16384 >> 15;
        int var6 = this.field3668 * var5 + 128 >> 8;
        if (var2.field3612 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3729 * 1.953125E-5D * (double) var2.field3612) + 0.5D);
        }
        if (var2.field3613 != null) {
            int var7 = arg0.field3738;
            int var8 = var2.field3613[arg0.field3734 + 1];
            if (arg0.field3734 < var2.field3613.length - 2) {
                int var9 = (var2.field3613[arg0.field3734] & 0xFF) << 8;
                int var10 = (var2.field3613[arg0.field3734 + 2] & 0xFF) << 8;
                var8 += (var2.field3613[arg0.field3734 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3732 > 0 && var2.field3614 != null) {
            int var11 = arg0.field3732;
            int var12 = var2.field3614[arg0.field3725 + 1];
            if (arg0.field3725 < var2.field3614.length - 2) {
                int var13 = (var2.field3614[arg0.field3725] & 0xFF) << 8;
                int var14 = (var2.field3614[arg0.field3725 + 2] & 0xFF) << 8;
                var12 += (var2.field3614[arg0.field3725 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mn.bd(Lnx;I)I")
    public int method6099(class344 arg0) {
        int var2 = this.field3643[arg0.field3736];
        return var2 < 8192 ? arg0.field3728 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3728) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mn.ay()Lbg;")
    public class50 method703() {
        return this.field3667;
    }

    @ObfuscatedName("mn.as()Lbg;")
    public class50 method722() {
        return null;
    }

    @ObfuscatedName("mn.ae()I")
    public int method705() {
        return 0;
    }

    @ObfuscatedName("mn.am([III)V")
    public void method706(int[] arg0, int arg1, int arg2) {
        if (this.field3661.method6153()) {
            int var4 = this.field3639 * this.field3661.field3674 / Statics.field1060;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3665;
                if (this.field3657 - var5 >= 0L) {
                    this.field3665 = var5;
                    break;
                }
                int var7 = (int) ((this.field3657 - this.field3665 + (long) var4 - 1L) / (long) var4);
                this.field3665 += (long) var4 * (long) var7;
                this.field3667.method706(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method6056();
            } while (this.field3661.method6153());
        }
        this.field3667.method706(arg0, arg1, arg2);
    }

    @ObfuscatedName("mn.au(I)V")
    public void method708(int arg0) {
        if (this.field3661.method6153()) {
            int var2 = this.field3639 * this.field3661.field3674 / Statics.field1060;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3665;
                if (this.field3657 - var3 >= 0L) {
                    this.field3665 = var3;
                    break;
                }
                int var5 = (int) ((this.field3657 - this.field3665 + (long) var2 - 1L) / (long) var2);
                this.field3665 += (long) var2 * (long) var5;
                this.field3667.method708(var5);
                arg0 -= var5;
                this.method6056();
            } while (this.field3661.method6153());
        }
        this.field3667.method708(arg0);
    }

    @ObfuscatedName("mn.ba(B)V")
    public void method6056() {
        int var1 = this.field3646;
        int var2 = this.field3664;
        long var3 = this.field3657;
        while (this.field3664 == var2) {
            while (this.field3661.field3678[var1] == var2) {
                this.field3661.method6175(var1);
                int var5 = this.field3661.method6159(var1);
                if (var5 == 1) {
                    this.field3661.method6157();
                    this.field3661.method6156(var1);
                    if (this.field3661.method6164()) {
                        if (!this.field3662 || var2 == 0) {
                            this.method6060();
                            this.field3661.method6152();
                            return;
                        }
                        this.field3661.method6190(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method6063(var5);
                }
                this.field3661.method6158(var1);
                this.field3661.method6156(var1);
            }
            var1 = this.field3661.method6162();
            var2 = this.field3661.field3678[var1];
            var3 = this.field3661.method6150(var2);
        }
        this.field3646 = var1;
        this.field3664 = var2;
        this.field3657 = var3;
    }

    @ObfuscatedName("mn.bw(Lnx;I)Z")
    public boolean method6062(class344 arg0) {
        if (arg0.field3739 != null) {
            return false;
        }
        if (arg0.field3732 >= 0) {
            arg0.method8667();
            if (arg0.field3733 > 0 && this.field3660[arg0.field3736][arg0.field3733] == arg0) {
                this.field3660[arg0.field3736][arg0.field3733] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mn.bi(Lnx;[IIII)Z")
    public boolean method6070(class344 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3735 = Statics.field1060 / 100;
        if (arg0.field3732 >= 0 && arg0.field3739 == null || arg0.field3739.method893()) {
            arg0.method6223();
            arg0.method8667();
            if (arg0.field3733 > 0 && this.field3660[arg0.field3736][arg0.field3733] == arg0) {
                this.field3660[arg0.field3736][arg0.field3733] = null;
            }
            return true;
        }
        int var5 = arg0.field3731;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3658[arg0.field3736] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3731 = var6;
        }
        arg0.field3739.method984(this.method6065(arg0));
        class333 var7 = arg0.field3724;
        boolean var8 = false;
        arg0.field3737++;
        arg0.field3730 += var7.field3619;
        double var9 = (double) ((arg0.field3726 - 60 << 8) + (arg0.field3740 * arg0.field3731 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3612 > 0) {
            if (var7.field3617 > 0) {
                arg0.field3729 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3617 * var9) + 0.5D);
            } else {
                arg0.field3729 += 128;
            }
        }
        if (var7.field3613 != null) {
            if (var7.field3615 > 0) {
                arg0.field3738 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3615 * var9) + 0.5D);
            } else {
                arg0.field3738 += 128;
            }
            while (arg0.field3734 < var7.field3613.length - 2 && arg0.field3738 > (var7.field3613[arg0.field3734 + 2] & 0xFF) << 8) {
                arg0.field3734 += 2;
            }
            if (arg0.field3734 == var7.field3613.length - 2 && var7.field3613[arg0.field3734 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3732 >= 0 && var7.field3614 != null && (this.field3653[arg0.field3736] & 0x1) == 0 && (arg0.field3733 < 0 || this.field3660[arg0.field3736][arg0.field3733] != arg0)) {
            if (var7.field3616 > 0) {
                arg0.field3732 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3616 * var9) + 0.5D);
            } else {
                arg0.field3732 += 128;
            }
            while (arg0.field3725 < var7.field3614.length - 2 && arg0.field3732 > (var7.field3614[arg0.field3725 + 2] & 0xFF) << 8) {
                arg0.field3725 += 2;
            }
            if (arg0.field3725 == var7.field3614.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3739.method889(arg0.field3735, this.method6066(arg0), this.method6099(arg0));
            return false;
        }
        arg0.field3739.method1002(arg0.field3735);
        if (arg1 == null) {
            arg0.field3739.method708(arg3);
        } else {
            arg0.field3739.method706(arg1, arg2, arg3);
        }
        if (arg0.field3739.method894()) {
            this.field3667.field3714.method697(arg0.field3739);
        }
        arg0.method6223();
        if (arg0.field3732 >= 0) {
            arg0.method8667();
            if (arg0.field3733 > 0 && this.field3660[arg0.field3736][arg0.field3733] == arg0) {
                this.field3660[arg0.field3736][arg0.field3733] = null;
            }
        }
        return true;
    }
}
