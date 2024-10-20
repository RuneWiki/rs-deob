package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("ms")
public class class336 extends class50 {

    @ObfuscatedName("ms.ac")
    public class524 field3640;

    @ObfuscatedName("ms.ae")
    public int field3629 = 256;

    @ObfuscatedName("ms.ag")
    public int field3645 = 1000000;

    @ObfuscatedName("ms.am")
    public int[] field3656 = new int[16];

    @ObfuscatedName("ms.ax")
    public int[] field3659 = new int[16];

    @ObfuscatedName("ms.aq")
    public int[] field3633 = new int[16];

    @ObfuscatedName("ms.af")
    public int[] field3634 = new int[16];

    @ObfuscatedName("ms.at")
    public int[] field3635 = new int[16];

    @ObfuscatedName("ms.au")
    public int[] field3636 = new int[16];

    @ObfuscatedName("ms.ar")
    public int[] field3632 = new int[16];

    @ObfuscatedName("ms.al")
    public int[] field3647 = new int[16];

    @ObfuscatedName("ms.ad")
    public int[] field3631 = new int[16];

    @ObfuscatedName("ms.as")
    public int[] field3641 = new int[16];

    @ObfuscatedName("ms.ay")
    public int[] field3642 = new int[16];

    @ObfuscatedName("ms.aj")
    public int[] field3643 = new int[16];

    @ObfuscatedName("ms.av")
    public int[] field3644 = new int[16];

    @ObfuscatedName("ms.aw")
    public int[] field3628 = new int[16];

    @ObfuscatedName("ms.an")
    public int[] field3646 = new int[16];

    @ObfuscatedName("ms.ak")
    public class345[][] field3630 = new class345[16][128];

    @ObfuscatedName("ms.bn")
    public class345[][] field3648 = new class345[16][128];

    @ObfuscatedName("ms.bh")
    public class337 field3649 = new class337();

    @ObfuscatedName("ms.bd")
    public boolean field3650;

    @ObfuscatedName("ms.bx")
    public int field3651;

    @ObfuscatedName("ms.bf")
    public int field3652;

    @ObfuscatedName("ms.bm")
    public long field3653;

    @ObfuscatedName("ms.bs")
    public long field3654;

    @ObfuscatedName("ms.bw")
    public class343 field3655 = new class343(this);

    @ObfuscatedName("ms.ba")
    public class43 field3637 = null;

    @ObfuscatedName("ms.bj")
    public PriorityQueue field3657 = new PriorityQueue(5, new class346());

    @ObfuscatedName("ms.bp")
    public static AtomicBoolean field3658 = null;

    @ObfuscatedName("ms.by")
    public static ThreadPoolExecutor field3639 = null;

    @ObfuscatedName("ms.bb")
    public int field3638 = 0;

    public class336(class43 arg0) {
        this.field3637 = arg0;
        this.field3640 = new class524(128);
        this.method5867();
    }

    @ObfuscatedName("ms.ac(II)V")
    public void method5847(int arg0) {
        class43 var2 = this.field3637;
        synchronized (this.field3637) {
            this.field3629 = arg0;
        }
    }

    @ObfuscatedName("ms.ae(I)I")
    public int method5848() {
        return this.field3629;
    }

    @ObfuscatedName("ms.ag(Lnk;Lpo;Lbo;I)Z")
    public boolean method5876(class344 arg0, class391 arg1, class46 arg2) {
        class43 var4 = this.field3637;
        synchronized (this.field3637) {
            boolean var5 = true;
            PriorityQueue var6 = this.field3657;
            synchronized (this.field3657) {
                this.field3657.clear();
            }
            for (class348 var8 = (class348) arg0.field3701.method8691(); var8 != null; var8 = (class348) arg0.field3701.method8692()) {
                int var9 = (int) var8.field5122;
                class340 var10 = (class340) this.field3640.method8688((long) var9);
                if (var10 == null) {
                    byte[] var11 = arg1.method6788(var9);
                    class340 var12;
                    if (var11 == null) {
                        var12 = null;
                    } else {
                        var12 = new class340(var11);
                    }
                    var10 = var12;
                    if (var12 == null) {
                        var5 = false;
                        continue;
                    }
                    this.field3640.method8690(var12, (long) var9);
                }
                if (!var10.method6025(arg2, var8.field3742)) {
                    var5 = false;
                } else if (this.field3657 != null) {
                    PriorityQueue var13 = this.field3657;
                    synchronized (this.field3657) {
                        Iterator var14 = var10.field3692.iterator();
                        while (var14.hasNext()) {
                            class54 var15 = (class54) var14.next();
                            this.field3657.add(new class339(var8.field3741, var15));
                        }
                    }
                }
            }
            return var5;
        }
    }

    @ObfuscatedName("ms.am(B)V")
    public void method5850() {
        if (this.field3657 == null) {
            return;
        }
        if (field3658 != null) {
            field3658.set(true);
        }
        field3658 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3658;
        if (field3639 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3639 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class338(this));
        }
        field3639.submit(new class342(this, var1));
    }

    @ObfuscatedName("ms.ax(B)V")
    public void method5851() {
        class43 var1 = this.field3637;
        synchronized (this.field3637) {
            for (class340 var2 = (class340) this.field3640.method8691(); var2 != null; var2 = (class340) this.field3640.method8692()) {
                var2.method6024();
            }
        }
    }

    @ObfuscatedName("ms.ar(B)V")
    public void method5852() {
        class43 var1 = this.field3637;
        synchronized (this.field3637) {
            for (class340 var2 = (class340) this.field3640.method8691(); var2 != null; var2 = (class340) this.field3640.method8692()) {
                var2.method8362();
            }
        }
    }

    @ObfuscatedName("ms.ad(Lnk;ZI)V")
    public void method5853(class344 arg0, boolean arg1) {
        class43 var3 = this.field3637;
        synchronized (this.field3637) {
            this.method5924();
            this.field3649.method5997(arg0.field3700);
            this.field3650 = arg1;
            this.field3653 = 0L;
            int var4 = this.field3649.method5968();
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3649.method5969(var5);
                this.field3649.method5972(var5);
                this.field3649.method5970(var5);
            }
            this.field3651 = this.field3649.method6000();
            this.field3652 = this.field3649.field3670[this.field3651];
            this.field3654 = this.field3649.method5976(this.field3652);
        }
    }

    @ObfuscatedName("ms.ah(I)V")
    public void method5924() {
        class43 var1 = this.field3637;
        synchronized (this.field3637) {
            this.field3649.method5966();
            this.method5867();
        }
    }

    @ObfuscatedName("ms.ap(I)Z")
    public boolean method5854() {
        class43 var1 = this.field3637;
        synchronized (this.field3637) {
            return this.field3649.method5984();
        }
    }

    @ObfuscatedName("ms.ab(I)Z")
    public boolean method5880() {
        class43 var1 = this.field3637;
        synchronized (this.field3637) {
            return this.field3640.method8689() > 0;
        }
    }

    @ObfuscatedName("ms.az(III)V")
    public void method5856(int arg0, int arg1) {
        class43 var3 = this.field3637;
        synchronized (this.field3637) {
            this.method5857(arg0, arg1);
        }
    }

    @ObfuscatedName("ms.aa(III)V")
    public void method5857(int arg0, int arg1) {
        this.field3634[arg0] = arg1;
        this.field3636[arg0] = arg1 & 0xFFFFFF80;
        this.method5858(arg0, arg1);
    }

    @ObfuscatedName("ms.ai(IIB)V")
    public void method5858(int arg0, int arg1) {
        if (this.field3635[arg0] != arg1) {
            this.field3635[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3648[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ms.ao(IIIB)V")
    public void method5942(int arg0, int arg1, int arg2) {
        this.method5860(arg0, arg1, 64);
        if ((this.field3641[arg0] & 0x2) != 0) {
            for (class345 var4 = (class345) this.field3655.field3697.method7028(); var4 != null; var4 = (class345) this.field3655.field3697.method7032()) {
                if (var4.field3712 == arg0 && var4.field3705 < 0) {
                    this.field3630[arg0][var4.field3707] = null;
                    this.field3630[arg0][arg1] = var4;
                    int var5 = (var4.field3711 * var4.field3702 >> 12) + var4.field3710;
                    var4.field3710 += arg1 - var4.field3707 << 8;
                    var4.field3711 = var5 - var4.field3710;
                    var4.field3702 = 4096;
                    var4.field3707 = arg1;
                    return;
                }
            }
        }
        class340 var6 = (class340) this.field3640.method8688((long) this.field3635[arg0]);
        if (var6 == null || var6.field3685[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3685[arg1].method1029();
        if (var7 == null) {
            return;
        }
        class345 var8 = new class345();
        var8.field3712 = arg0;
        var8.field3703 = var6;
        var8.field3716 = var7;
        var8.field3706 = var6.field3688[arg1];
        var8.field3713 = var6.field3689[arg1];
        var8.field3707 = arg1;
        var8.field3708 = var6.field3690 * arg2 * arg2 * var6.field3686[arg1] + 1024 >> 11;
        var8.field3709 = var6.field3687[arg1] & 0xFF;
        var8.field3710 = (arg1 << 8) - (var6.field3682[arg1] & 0x7FFF);
        var8.field3721 = 0;
        var8.field3714 = 0;
        var8.field3715 = 0;
        var8.field3705 = -1;
        var8.field3717 = 0;
        if (this.field3644[arg0] == 0) {
            var8.field3720 = class49.method962(var7, this.method5926(var8), this.method5890(var8), this.method5940(var8));
        } else {
            var8.field3720 = class49.method962(var7, this.method5926(var8), 0, this.method5940(var8));
            this.method5865(var8, var6.field3682[arg1] < 0);
        }
        if (var6.field3682[arg1] < 0) {
            var8.field3720.method887(-1);
        }
        if (var8.field3713 >= 0) {
            class345 var9 = this.field3648[arg0][var8.field3713];
            if (var9 != null && var9.field3705 < 0) {
                this.field3630[arg0][var9.field3707] = null;
                var9.field3705 = 0;
            }
            this.field3648[arg0][var8.field3713] = var8;
        }
        this.field3655.field3697.method7051(var8);
        this.field3630[arg0][arg1] = var8;
    }

    @ObfuscatedName("ms.as(Lnb;ZI)V")
    public void method5865(class345 arg0, boolean arg1) {
        int var3 = arg0.field3716.field248.length;
        int var5;
        if (arg1 && arg0.field3716.field251) {
            int var4 = var3 + var3 - arg0.field3716.field250;
            var5 = (int) ((long) this.field3644[arg0.field3712] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3720.method884(true);
            }
        } else {
            var5 = (int) ((long) this.field3644[arg0.field3712] * (long) var3 >> 6);
        }
        arg0.field3720.method883(var5);
    }

    @ObfuscatedName("ms.ay(IIII)V")
    public void method5860(int arg0, int arg1, int arg2) {
        class345 var4 = this.field3630[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3630[arg0][arg1] = null;
        if ((this.field3641[arg0] & 0x2) == 0) {
            var4.field3705 = 0;
            return;
        }
        for (class345 var5 = (class345) this.field3655.field3697.method7029(); var5 != null; var5 = (class345) this.field3655.field3697.method7031()) {
            if (var4.field3712 == var5.field3712 && var5.field3705 < 0 && var4 != var5) {
                var4.field3705 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ms.aj(IIII)V")
    public void method5861(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ms.av(III)V")
    public void method5862(int arg0, int arg1) {
    }

    @ObfuscatedName("ms.aw(IIB)V")
    public void method5863(int arg0, int arg1) {
        this.field3632[arg0] = arg1;
    }

    @ObfuscatedName("ms.by(IB)V")
    public void method5864(int arg0) {
        for (class345 var2 = (class345) this.field3655.field3697.method7029(); var2 != null; var2 = (class345) this.field3655.field3697.method7031()) {
            if (arg0 < 0 || var2.field3712 == arg0) {
                if (var2.field3720 != null) {
                    var2.field3720.method998(Statics.field271 / 100);
                    if (var2.field3720.method892()) {
                        this.field3655.field3696.method705(var2.field3720);
                    }
                    var2.method6049();
                }
                if (var2.field3705 < 0) {
                    this.field3630[var2.field3712][var2.field3707] = null;
                }
                var2.method8362();
            }
        }
    }

    @ObfuscatedName("ms.bb(II)V")
    public void method5959(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5959(var2);
            }
            return;
        }
        this.field3656[arg0] = 12800;
        this.field3659[arg0] = 8192;
        this.field3633[arg0] = 16383;
        this.field3632[arg0] = 8192;
        this.field3647[arg0] = 0;
        this.field3631[arg0] = 8192;
        this.method5868(arg0);
        this.method5869(arg0);
        this.field3641[arg0] = 0;
        this.field3642[arg0] = 32767;
        this.field3643[arg0] = 256;
        this.field3644[arg0] = 0;
        this.method5889(arg0, 8192);
    }

    @ObfuscatedName("ms.bi(II)V")
    public void method5866(int arg0) {
        for (class345 var2 = (class345) this.field3655.field3697.method7029(); var2 != null; var2 = (class345) this.field3655.field3697.method7031()) {
            if ((arg0 < 0 || var2.field3712 == arg0) && var2.field3705 < 0) {
                this.field3630[var2.field3712][var2.field3707] = null;
                var2.field3705 = 0;
            }
        }
    }

    @ObfuscatedName("ms.bg(I)V")
    public void method5867() {
        this.method5864(-1);
        this.method5959(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3635[var1] = this.field3634[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3636[var2] = this.field3634[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ms.br(II)V")
    public void method5868(int arg0) {
        if ((this.field3641[arg0] & 0x2) == 0) {
            return;
        }
        for (class345 var2 = (class345) this.field3655.field3697.method7029(); var2 != null; var2 = (class345) this.field3655.field3697.method7031()) {
            if (var2.field3712 == arg0 && this.field3630[arg0][var2.field3707] == null && var2.field3705 < 0) {
                var2.field3705 = 0;
            }
        }
    }

    @ObfuscatedName("ms.bo(II)V")
    public void method5869(int arg0) {
        if ((this.field3641[arg0] & 0x4) == 0) {
            return;
        }
        for (class345 var2 = (class345) this.field3655.field3697.method7029(); var2 != null; var2 = (class345) this.field3655.field3697.method7031()) {
            if (var2.field3712 == arg0) {
                var2.field3722 = 0;
            }
        }
    }

    @ObfuscatedName("ms.bv(II)V")
    public void method5870(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5860(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5942(var6, var7, var8);
            } else {
                this.method5860(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5861(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3636[var12] = (var14 << 14) + (this.field3636[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3636[var12] = (var14 << 7) + (this.field3636[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3647[var12] = (var14 << 7) + (this.field3647[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3647[var12] = (this.field3647[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3631[var12] = (var14 << 7) + (this.field3631[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3631[var12] = (this.field3631[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3656[var12] = (var14 << 7) + (this.field3656[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3656[var12] = (this.field3656[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3659[var12] = (var14 << 7) + (this.field3659[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3659[var12] = (this.field3659[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3633[var12] = (var14 << 7) + (this.field3633[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3633[var12] = (this.field3633[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3641[var12] |= 0x1;
                } else {
                    this.field3641[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3641[var12] |= 0x2;
                } else {
                    this.method5868(var12);
                    this.field3641[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3642[var12] = (var14 << 7) + (this.field3642[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3642[var12] = (this.field3642[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3642[var12] = (var14 << 7) + (this.field3642[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3642[var12] = (this.field3642[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5864(var12);
            }
            if (var13 == 121) {
                this.method5959(var12);
            }
            if (var13 == 123) {
                this.method5866(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3642[var12];
                if (var15 == 16384) {
                    this.field3643[var12] = (var14 << 7) + (this.field3643[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3642[var12];
                if (var16 == 16384) {
                    this.field3643[var12] = (this.field3643[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3644[var12] = (var14 << 7) + (this.field3644[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3644[var12] = (this.field3644[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3641[var12] |= 0x4;
                } else {
                    this.method5869(var12);
                    this.field3641[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5889(var12, (var14 << 7) + (this.field3628[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5889(var12, (this.field3628[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5858(var17, this.field3636[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5862(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5863(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5867();
            }
        }
    }

    @ObfuscatedName("ms.bq(III)V")
    public void method5889(int arg0, int arg1) {
        this.field3628[arg0] = arg1;
        this.field3646[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ms.bk(Lnb;I)I")
    public int method5926(class345 arg0) {
        int var2 = (arg0.field3711 * arg0.field3702 >> 12) + arg0.field3710;
        int var3 = ((this.field3632[arg0.field3712] - 8192) * this.field3643[arg0.field3712] >> 12) + var2;
        class334 var4 = arg0.field3706;
        if (var4.field3605 > 0 && (var4.field3613 > 0 || this.field3647[arg0.field3712] > 0)) {
            int var5 = var4.field3613 << 2;
            int var6 = var4.field3612 << 1;
            if (arg0.field3718 < var6) {
                var5 = arg0.field3718 * var5 / var6;
            }
            int var7 = (this.field3647[arg0.field3712] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3719 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3716.field249 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field271 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ms.be(Lnb;I)I")
    public int method5890(class345 arg0) {
        class334 var2 = arg0.field3706;
        int var3 = this.field3656[arg0.field3712] * this.field3633[arg0.field3712] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3708 * var4 + 16384 >> 15;
        int var6 = this.field3629 * var5 + 128 >> 8;
        if (var2.field3607 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3721 * 1.953125E-5D * (double) var2.field3607) + 0.5D);
        }
        if (var2.field3606 != null) {
            int var7 = arg0.field3714;
            int var8 = var2.field3606[arg0.field3715 + 1];
            if (arg0.field3715 < var2.field3606.length - 2) {
                int var9 = (var2.field3606[arg0.field3715] & 0xFF) << 8;
                int var10 = (var2.field3606[arg0.field3715 + 2] & 0xFF) << 8;
                var8 += (var2.field3606[arg0.field3715 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3705 > 0 && var2.field3611 != null) {
            int var11 = arg0.field3705;
            int var12 = var2.field3611[arg0.field3717 + 1];
            if (arg0.field3717 < var2.field3611.length - 2) {
                int var13 = (var2.field3611[arg0.field3717] & 0xFF) << 8;
                int var14 = (var2.field3611[arg0.field3717 + 2] & 0xFF) << 8;
                var12 += (var2.field3611[arg0.field3717 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ms.bc(Lnb;B)I")
    public int method5940(class345 arg0) {
        int var2 = this.field3659[arg0.field3712];
        return var2 < 8192 ? arg0.field3709 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3709) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ms.aq()Lbk;")
    public class50 method709() {
        return this.field3655;
    }

    @ObfuscatedName("ms.af()Lbk;")
    public class50 method710() {
        return null;
    }

    @ObfuscatedName("ms.at()I")
    public int method711() {
        return 0;
    }

    @ObfuscatedName("ms.au([III)V")
    public void method712(int[] arg0, int arg1, int arg2) {
        if (this.field3649.method5984()) {
            int var4 = this.field3645 * this.field3649.field3663 / Statics.field271;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3653;
                if (this.field3654 - var5 >= 0L) {
                    this.field3653 = var5;
                    break;
                }
                int var7 = (int) ((this.field3654 - this.field3653 + (long) var4 - 1L) / (long) var4);
                this.field3653 += (long) var4 * (long) var7;
                this.field3655.method712(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5912();
            } while (this.field3649.method5984());
        }
        this.field3655.method712(arg0, arg1, arg2);
    }

    @ObfuscatedName("ms.al(I)V")
    public void method716(int arg0) {
        if (this.field3649.method5984()) {
            int var2 = this.field3645 * this.field3649.field3663 / Statics.field271;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3653;
                if (this.field3654 - var3 >= 0L) {
                    this.field3653 = var3;
                    break;
                }
                int var5 = (int) ((this.field3654 - this.field3653 + (long) var2 - 1L) / (long) var2);
                this.field3653 += (long) var2 * (long) var5;
                this.field3655.method716(var5);
                arg0 -= var5;
                this.method5912();
            } while (this.field3649.method5984());
        }
        this.field3655.method716(arg0);
    }

    @ObfuscatedName("ms.cn(I)V")
    public void method5912() {
        int var1 = this.field3651;
        int var2 = this.field3652;
        long var3 = this.field3654;
        while (this.field3652 == var2) {
            while (this.field3649.field3670[var1] == var2) {
                this.field3649.method5969(var1);
                int var5 = this.field3649.method5973(var1);
                if (var5 == 1) {
                    this.field3649.method5971();
                    this.field3649.method5970(var1);
                    if (this.field3649.method5978()) {
                        if (!this.field3650 || var2 == 0) {
                            this.method5867();
                            this.field3649.method5966();
                            return;
                        }
                        this.field3649.method5979(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5870(var5);
                }
                this.field3649.method5972(var1);
                this.field3649.method5970(var1);
            }
            var1 = this.field3649.method6000();
            var2 = this.field3649.field3670[var1];
            var3 = this.field3649.method5976(var2);
        }
        this.field3651 = var1;
        this.field3652 = var2;
        this.field3654 = var3;
    }

    @ObfuscatedName("ms.ch(Lnb;B)Z")
    public boolean method5878(class345 arg0) {
        if (arg0.field3720 != null) {
            return false;
        }
        if (arg0.field3705 >= 0) {
            arg0.method8362();
            if (arg0.field3713 > 0 && this.field3648[arg0.field3712][arg0.field3713] == arg0) {
                this.field3648[arg0.field3712][arg0.field3713] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ms.cf(Lnb;[IIII)Z")
    public boolean method5879(class345 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3704 = Statics.field271 / 100;
        if (arg0.field3705 >= 0 && arg0.field3720 == null || arg0.field3720.method891()) {
            arg0.method6049();
            arg0.method8362();
            if (arg0.field3713 > 0 && this.field3648[arg0.field3712][arg0.field3713] == arg0) {
                this.field3648[arg0.field3712][arg0.field3713] = null;
            }
            return true;
        }
        int var5 = arg0.field3702;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3631[arg0.field3712] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3702 = var6;
        }
        arg0.field3720.method990(this.method5926(arg0));
        class334 var7 = arg0.field3706;
        boolean var8 = false;
        arg0.field3718++;
        arg0.field3719 += var7.field3605;
        double var9 = (double) ((arg0.field3707 - 60 << 8) + (arg0.field3711 * arg0.field3702 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3607 > 0) {
            if (var7.field3610 > 0) {
                arg0.field3721 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3610 * var9) + 0.5D);
            } else {
                arg0.field3721 += 128;
            }
        }
        if (var7.field3606 != null) {
            if (var7.field3608 > 0) {
                arg0.field3714 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3608 * var9) + 0.5D);
            } else {
                arg0.field3714 += 128;
            }
            while (arg0.field3715 < var7.field3606.length - 2 && arg0.field3714 > (var7.field3606[arg0.field3715 + 2] & 0xFF) << 8) {
                arg0.field3715 += 2;
            }
            if (arg0.field3715 == var7.field3606.length - 2 && var7.field3606[arg0.field3715 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3705 >= 0 && var7.field3611 != null && (this.field3641[arg0.field3712] & 0x1) == 0 && (arg0.field3713 < 0 || this.field3648[arg0.field3712][arg0.field3713] != arg0)) {
            if (var7.field3609 > 0) {
                arg0.field3705 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3609 * var9) + 0.5D);
            } else {
                arg0.field3705 += 128;
            }
            while (arg0.field3717 < var7.field3611.length - 2 && arg0.field3705 > (var7.field3611[arg0.field3717 + 2] & 0xFF) << 8) {
                arg0.field3717 += 2;
            }
            if (arg0.field3717 == var7.field3611.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3720.method946(arg0.field3704, this.method5890(arg0), this.method5940(arg0));
            return false;
        }
        arg0.field3720.method998(arg0.field3704);
        if (arg1 == null) {
            arg0.field3720.method716(arg3);
        } else {
            arg0.field3720.method712(arg1, arg2, arg3);
        }
        if (arg0.field3720.method892()) {
            this.field3655.field3696.method705(arg0.field3720);
        }
        arg0.method6049();
        if (arg0.field3705 >= 0) {
            arg0.method8362();
            if (arg0.field3713 > 0 && this.field3648[arg0.field3712][arg0.field3713] == arg0) {
                this.field3648[arg0.field3712][arg0.field3713] = null;
            }
        }
        return true;
    }
}
