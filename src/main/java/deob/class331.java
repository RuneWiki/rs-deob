package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mw")
public class class331 extends class50 {

    @ObfuscatedName("mw.ak")
    public class520 field3600;

    @ObfuscatedName("mw.al")
    public int field3603 = 256;

    @ObfuscatedName("mw.aj")
    public int field3594 = 1000000;

    @ObfuscatedName("mw.az")
    public int[] field3591 = new int[16];

    @ObfuscatedName("mw.af")
    public int[] field3592 = new int[16];

    @ObfuscatedName("mw.aa")
    public int[] field3593 = new int[16];

    @ObfuscatedName("mw.at")
    public int[] field3620 = new int[16];

    @ObfuscatedName("mw.ab")
    public int[] field3613 = new int[16];

    @ObfuscatedName("mw.ac")
    public int[] field3596 = new int[16];

    @ObfuscatedName("mw.ao")
    public int[] field3611 = new int[16];

    @ObfuscatedName("mw.ah")
    public int[] field3598 = new int[16];

    @ObfuscatedName("mw.av")
    public int[] field3599 = new int[16];

    @ObfuscatedName("mw.aw")
    public int[] field3602 = new int[16];

    @ObfuscatedName("mw.ad")
    public int[] field3597 = new int[16];

    @ObfuscatedName("mw.ai")
    public int[] field3590 = new int[16];

    @ObfuscatedName("mw.an")
    public int[] field3605 = new int[16];

    @ObfuscatedName("mw.am")
    public int[] field3606 = new int[16];

    @ObfuscatedName("mw.ar")
    public int[] field3588 = new int[16];

    @ObfuscatedName("mw.ag")
    public class340[][] field3608 = new class340[16][128];

    @ObfuscatedName("mw.bs")
    public class340[][] field3609 = new class340[16][128];

    @ObfuscatedName("mw.bf")
    public class332 field3610 = new class332();

    @ObfuscatedName("mw.bo")
    public boolean field3619;

    @ObfuscatedName("mw.bi")
    public int field3612;

    @ObfuscatedName("mw.bt")
    public int field3604;

    @ObfuscatedName("mw.bn")
    public long field3614;

    @ObfuscatedName("mw.bw")
    public long field3615;

    @ObfuscatedName("mw.bl")
    public class338 field3616 = new class338(this);

    @ObfuscatedName("mw.be")
    public class43 field3617 = null;

    @ObfuscatedName("mw.bg")
    public PriorityQueue field3618 = new PriorityQueue(5, new class341());

    @ObfuscatedName("mw.bu")
    public static AtomicBoolean field3595 = null;

    @ObfuscatedName("mw.bh")
    public static ThreadPoolExecutor field3601 = null;

    @ObfuscatedName("mw.bk")
    public int field3621 = 0;

    public class331(class43 arg0) {
        this.field3617 = arg0;
        this.field3600 = new class520(128);
        this.method5686();
    }

    @ObfuscatedName("mw.ak(II)V")
    public void method5736(int arg0) {
        class43 var2 = this.field3617;
        synchronized (this.field3617) {
            this.field3603 = arg0;
        }
    }

    @ObfuscatedName("mw.al(B)I")
    public int method5766() {
        return this.field3603;
    }

    @ObfuscatedName("mw.aj(Lno;Lor;Lbq;I)Z")
    public boolean method5757(class339 arg0, class387 arg1, class46 arg2) {
        class43 var4 = this.field3617;
        synchronized (this.field3617) {
            boolean var5 = true;
            PriorityQueue var6 = this.field3618;
            synchronized (this.field3618) {
                this.field3618.clear();
            }
            for (class343 var8 = (class343) arg0.field3661.method8530(); var8 != null; var8 = (class343) arg0.field3661.method8531()) {
                int var9 = (int) var8.field5049;
                class335 var10 = (class335) this.field3600.method8528((long) var9);
                if (var10 == null) {
                    byte[] var11 = arg1.method6577(var9);
                    class335 var12;
                    if (var11 == null) {
                        var12 = null;
                    } else {
                        var12 = new class335(var11);
                    }
                    var10 = var12;
                    if (var12 == null) {
                        var5 = false;
                        continue;
                    }
                    this.field3600.method8527(var12, (long) var9);
                }
                if (!var10.method5828(arg2, var8.field3699)) {
                    var5 = false;
                } else if (this.field3618 != null) {
                    PriorityQueue var13 = this.field3618;
                    synchronized (this.field3618) {
                        Iterator var14 = var10.field3653.iterator();
                        while (var14.hasNext()) {
                            class54 var15 = (class54) var14.next();
                            this.field3618.add(new class334(var8.field3700, var15));
                        }
                    }
                }
            }
            return var5;
        }
    }

    @ObfuscatedName("mw.az(B)V")
    public void method5677() {
        if (this.field3618 == null) {
            return;
        }
        if (field3595 != null) {
            field3595.set(true);
        }
        field3595 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3595;
        if (field3601 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3601 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class333(this));
        }
        field3601.submit(new class337(this, var1));
    }

    @ObfuscatedName("mw.af(B)V")
    public void method5669() {
        class43 var1 = this.field3617;
        synchronized (this.field3617) {
            for (class335 var2 = (class335) this.field3600.method8530(); var2 != null; var2 = (class335) this.field3600.method8531()) {
                var2.method5829();
            }
        }
    }

    @ObfuscatedName("mw.ao(I)V")
    public void method5666() {
        class43 var1 = this.field3617;
        synchronized (this.field3617) {
            for (class335 var2 = (class335) this.field3600.method8530(); var2 != null; var2 = (class335) this.field3600.method8531()) {
                var2.method8189();
            }
        }
    }

    @ObfuscatedName("mw.av(Lno;ZB)V")
    public void method5671(class339 arg0, boolean arg1) {
        class43 var3 = this.field3617;
        synchronized (this.field3617) {
            this.method5672();
            this.field3610.method5800(arg0.field3662);
            this.field3619 = arg1;
            this.field3614 = 0L;
            int var4 = this.field3610.method5784();
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3610.method5785(var5);
                this.field3610.method5782(var5);
                this.field3610.method5786(var5);
            }
            this.field3612 = this.field3610.method5792();
            this.field3604 = this.field3610.field3626[this.field3612];
            this.field3615 = this.field3610.method5781(this.field3604);
        }
    }

    @ObfuscatedName("mw.aq(I)V")
    public void method5672() {
        class43 var1 = this.field3617;
        synchronized (this.field3617) {
            this.field3610.method5794();
            this.method5686();
        }
    }

    @ObfuscatedName("mw.ap(B)Z")
    public boolean method5673() {
        class43 var1 = this.field3617;
        synchronized (this.field3617) {
            return this.field3610.method5783();
        }
    }

    @ObfuscatedName("mw.ae(S)Z")
    public boolean method5674() {
        class43 var1 = this.field3617;
        synchronized (this.field3617) {
            return this.field3600.method8529() > 0;
        }
    }

    @ObfuscatedName("mw.ax(III)V")
    public void method5675(int arg0, int arg1) {
        class43 var3 = this.field3617;
        synchronized (this.field3617) {
            this.method5676(arg0, arg1);
        }
    }

    @ObfuscatedName("mw.ay(III)V")
    public void method5676(int arg0, int arg1) {
        this.field3620[arg0] = arg1;
        this.field3596[arg0] = arg1 & 0xFFFFFF80;
        this.method5754(arg0, arg1);
    }

    @ObfuscatedName("mw.au(IIB)V")
    public void method5754(int arg0, int arg1) {
        if (this.field3613[arg0] != arg1) {
            this.field3613[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3609[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mw.as(IIII)V")
    public void method5678(int arg0, int arg1, int arg2) {
        this.method5680(arg0, arg1, 64);
        if ((this.field3602[arg0] & 0x2) != 0) {
            for (class340 var4 = (class340) this.field3616.field3658.method6835(); var4 != null; var4 = (class340) this.field3616.field3658.method6856()) {
                if (var4.field3667 == arg0 && var4.field3677 < 0) {
                    this.field3608[arg0][var4.field3669] = null;
                    this.field3608[arg0][arg1] = var4;
                    int var5 = (var4.field3673 * var4.field3668 >> 12) + var4.field3680;
                    var4.field3680 += arg1 - var4.field3669 << 8;
                    var4.field3668 = var5 - var4.field3680;
                    var4.field3673 = 4096;
                    var4.field3669 = arg1;
                    return;
                }
            }
        }
        class335 var6 = (class335) this.field3600.method8528((long) this.field3613[arg0]);
        if (var6 == null || var6.field3647[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3647[arg1].method1002();
        if (var7 == null) {
            return;
        }
        class340 var8 = new class340();
        var8.field3667 = arg0;
        var8.field3664 = var6;
        var8.field3674 = var7;
        var8.field3666 = var6.field3650[arg1];
        var8.field3665 = var6.field3652[arg1];
        var8.field3669 = arg1;
        var8.field3682 = var6.field3646 * arg2 * arg2 * var6.field3649[arg1] + 1024 >> 11;
        var8.field3670 = var6.field3654[arg1] & 0xFF;
        var8.field3680 = (arg1 << 8) - (var6.field3648[arg1] & 0x7FFF);
        var8.field3671 = 0;
        var8.field3675 = 0;
        var8.field3681 = 0;
        var8.field3677 = -1;
        var8.field3678 = 0;
        if (this.field3605[arg0] == 0) {
            var8.field3672 = class49.method864(var7, this.method5689(var8), this.method5690(var8), this.method5691(var8));
        } else {
            var8.field3672 = class49.method864(var7, this.method5689(var8), 0, this.method5691(var8));
            this.method5698(var8, var6.field3648[arg1] < 0);
        }
        if (var6.field3648[arg1] < 0) {
            var8.field3672.method866(-1);
        }
        if (var8.field3665 >= 0) {
            class340 var9 = this.field3609[arg0][var8.field3665];
            if (var9 != null && var9.field3677 < 0) {
                this.field3608[arg0][var9.field3669] = null;
                var9.field3677 = 0;
            }
            this.field3609[arg0][var8.field3665] = var8;
        }
        this.field3616.field3658.method6829(var8);
        this.field3608[arg0][arg1] = var8;
    }

    @ObfuscatedName("mw.aw(Lne;ZB)V")
    public void method5698(class340 arg0, boolean arg1) {
        int var3 = arg0.field3674.field269.length;
        int var5;
        if (arg1 && arg0.field3674.field270) {
            int var4 = var3 + var3 - arg0.field3674.field266;
            var5 = (int) ((long) this.field3605[arg0.field3667] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3672.method873(true);
            }
        } else {
            var5 = (int) ((long) this.field3605[arg0.field3667] * (long) var3 >> 6);
        }
        arg0.field3672.method872(var5);
    }

    @ObfuscatedName("mw.ad(IIII)V")
    public void method5680(int arg0, int arg1, int arg2) {
        class340 var4 = this.field3608[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3608[arg0][arg1] = null;
        if ((this.field3602[arg0] & 0x2) == 0) {
            var4.field3677 = 0;
            return;
        }
        for (class340 var5 = (class340) this.field3616.field3658.method6834(); var5 != null; var5 = (class340) this.field3616.field3658.method6842()) {
            if (var4.field3667 == var5.field3667 && var5.field3677 < 0 && var4 != var5) {
                var4.field3677 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mw.bn(IIII)V")
    public void method5729(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mw.bw(III)V")
    public void method5682(int arg0, int arg1) {
    }

    @ObfuscatedName("mw.bu(III)V")
    public void method5768(int arg0, int arg1) {
        this.field3611[arg0] = arg1;
    }

    @ObfuscatedName("mw.bh(IB)V")
    public void method5683(int arg0) {
        for (class340 var2 = (class340) this.field3616.field3658.method6834(); var2 != null; var2 = (class340) this.field3616.field3658.method6842()) {
            if (arg0 < 0 || var2.field3667 == arg0) {
                if (var2.field3672 != null) {
                    var2.field3672.method877(Statics.field1509 / 100);
                    if (var2.field3672.method881()) {
                        this.field3616.field3657.method699(var2.field3672);
                    }
                    var2.method5851();
                }
                if (var2.field3677 < 0) {
                    this.field3608[var2.field3667][var2.field3669] = null;
                }
                var2.method8189();
            }
        }
    }

    @ObfuscatedName("mw.bk(IB)V")
    public void method5684(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5684(var2);
            }
            return;
        }
        this.field3591[arg0] = 12800;
        this.field3592[arg0] = 8192;
        this.field3593[arg0] = 16383;
        this.field3611[arg0] = 8192;
        this.field3598[arg0] = 0;
        this.field3599[arg0] = 8192;
        this.method5704(arg0);
        this.method5687(arg0);
        this.field3602[arg0] = 0;
        this.field3597[arg0] = 32767;
        this.field3590[arg0] = 256;
        this.field3605[arg0] = 0;
        this.method5688(arg0, 8192);
    }

    @ObfuscatedName("mw.br(II)V")
    public void method5685(int arg0) {
        for (class340 var2 = (class340) this.field3616.field3658.method6834(); var2 != null; var2 = (class340) this.field3616.field3658.method6842()) {
            if ((arg0 < 0 || var2.field3667 == arg0) && var2.field3677 < 0) {
                this.field3608[var2.field3667][var2.field3669] = null;
                var2.field3677 = 0;
            }
        }
    }

    @ObfuscatedName("mw.bx(I)V")
    public void method5686() {
        this.method5683(-1);
        this.method5684(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3613[var1] = this.field3620[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3596[var2] = this.field3620[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mw.bd(II)V")
    public void method5704(int arg0) {
        if ((this.field3602[arg0] & 0x2) == 0) {
            return;
        }
        for (class340 var2 = (class340) this.field3616.field3658.method6834(); var2 != null; var2 = (class340) this.field3616.field3658.method6842()) {
            if (var2.field3667 == arg0 && this.field3608[arg0][var2.field3669] == null && var2.field3677 < 0) {
                var2.field3677 = 0;
            }
        }
    }

    @ObfuscatedName("mw.bv(II)V")
    public void method5687(int arg0) {
        if ((this.field3602[arg0] & 0x4) == 0) {
            return;
        }
        for (class340 var2 = (class340) this.field3616.field3658.method6834(); var2 != null; var2 = (class340) this.field3616.field3658.method6842()) {
            if (var2.field3667 == arg0) {
                var2.field3683 = 0;
            }
        }
    }

    @ObfuscatedName("mw.bm(II)V")
    public void method5752(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5680(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5678(var6, var7, var8);
            } else {
                this.method5680(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5729(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3596[var12] = (var14 << 14) + (this.field3596[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3596[var12] = (var14 << 7) + (this.field3596[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3598[var12] = (var14 << 7) + (this.field3598[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3598[var12] = (this.field3598[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3599[var12] = (var14 << 7) + (this.field3599[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3599[var12] = (this.field3599[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3591[var12] = (var14 << 7) + (this.field3591[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3591[var12] = (this.field3591[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3592[var12] = (var14 << 7) + (this.field3592[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3592[var12] = (this.field3592[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3593[var12] = (var14 << 7) + (this.field3593[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3593[var12] = (this.field3593[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3602[var12] |= 0x1;
                } else {
                    this.field3602[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3602[var12] |= 0x2;
                } else {
                    this.method5704(var12);
                    this.field3602[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3597[var12] = (var14 << 7) + (this.field3597[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3597[var12] = (this.field3597[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3597[var12] = (var14 << 7) + (this.field3597[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3597[var12] = (this.field3597[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5683(var12);
            }
            if (var13 == 121) {
                this.method5684(var12);
            }
            if (var13 == 123) {
                this.method5685(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3597[var12];
                if (var15 == 16384) {
                    this.field3590[var12] = (var14 << 7) + (this.field3590[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3597[var12];
                if (var16 == 16384) {
                    this.field3590[var12] = (this.field3590[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3605[var12] = (var14 << 7) + (this.field3605[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3605[var12] = (this.field3605[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3602[var12] |= 0x4;
                } else {
                    this.method5687(var12);
                    this.field3602[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5688(var12, (var14 << 7) + (this.field3606[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5688(var12, (this.field3606[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5754(var17, this.field3596[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5682(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method5768(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5686();
            }
        }
    }

    @ObfuscatedName("mw.bq(III)V")
    public void method5688(int arg0, int arg1) {
        this.field3606[arg0] = arg1;
        this.field3588[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mw.bj(Lne;B)I")
    public int method5689(class340 arg0) {
        int var2 = (arg0.field3673 * arg0.field3668 >> 12) + arg0.field3680;
        int var3 = ((this.field3611[arg0.field3667] - 8192) * this.field3590[arg0.field3667] >> 12) + var2;
        class329 var4 = arg0.field3666;
        if (var4.field3574 > 0 && (var4.field3573 > 0 || this.field3598[arg0.field3667] > 0)) {
            int var5 = var4.field3573 << 2;
            int var6 = var4.field3567 << 1;
            if (arg0.field3679 < var6) {
                var5 = arg0.field3679 * var5 / var6;
            }
            int var7 = (this.field3598[arg0.field3667] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3676 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3674.field267 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1509 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mw.bc(Lne;B)I")
    public int method5690(class340 arg0) {
        class329 var2 = arg0.field3666;
        int var3 = this.field3593[arg0.field3667] * this.field3591[arg0.field3667] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3682 * var4 + 16384 >> 15;
        int var6 = this.field3603 * var5 + 128 >> 8;
        if (var2.field3569 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3671 * 1.953125E-5D * (double) var2.field3569) + 0.5D);
        }
        if (var2.field3571 != null) {
            int var7 = arg0.field3675;
            int var8 = var2.field3571[arg0.field3681 + 1];
            if (arg0.field3681 < var2.field3571.length - 2) {
                int var9 = (var2.field3571[arg0.field3681] & 0xFF) << 8;
                int var10 = (var2.field3571[arg0.field3681 + 2] & 0xFF) << 8;
                var8 += (var2.field3571[arg0.field3681 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3677 > 0 && var2.field3568 != null) {
            int var11 = arg0.field3677;
            int var12 = var2.field3568[arg0.field3678 + 1];
            if (arg0.field3678 < var2.field3568.length - 2) {
                int var13 = (var2.field3568[arg0.field3678] & 0xFF) << 8;
                int var14 = (var2.field3568[arg0.field3678 + 2] & 0xFF) << 8;
                var12 += (var2.field3568[arg0.field3678 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mw.bz(Lne;I)I")
    public int method5691(class340 arg0) {
        int var2 = this.field3592[arg0.field3667];
        return var2 < 8192 ? arg0.field3670 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3670) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mw.aa()Lba;")
    public class50 method704() {
        return this.field3616;
    }

    @ObfuscatedName("mw.at()Lba;")
    public class50 method705() {
        return null;
    }

    @ObfuscatedName("mw.ab()I")
    public int method706() {
        return 0;
    }

    @ObfuscatedName("mw.ac([III)V")
    public void method707(int[] arg0, int arg1, int arg2) {
        if (this.field3610.method5783()) {
            int var4 = this.field3594 * this.field3610.field3623 / Statics.field1509;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3614;
                if (this.field3615 - var5 >= 0L) {
                    this.field3614 = var5;
                    break;
                }
                int var7 = (int) ((this.field3615 - this.field3614 + (long) var4 - 1L) / (long) var4);
                this.field3614 += (long) var4 * (long) var7;
                this.field3616.method707(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5713();
            } while (this.field3610.method5783());
        }
        this.field3616.method707(arg0, arg1, arg2);
    }

    @ObfuscatedName("mw.ah(I)V")
    public void method713(int arg0) {
        if (this.field3610.method5783()) {
            int var2 = this.field3594 * this.field3610.field3623 / Statics.field1509;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3614;
                if (this.field3615 - var3 >= 0L) {
                    this.field3614 = var3;
                    break;
                }
                int var5 = (int) ((this.field3615 - this.field3614 + (long) var2 - 1L) / (long) var2);
                this.field3614 += (long) var2 * (long) var5;
                this.field3616.method713(var5);
                arg0 -= var5;
                this.method5713();
            } while (this.field3610.method5783());
        }
        this.field3616.method713(arg0);
    }

    @ObfuscatedName("mw.ba(I)V")
    public void method5713() {
        int var1 = this.field3612;
        int var2 = this.field3604;
        long var3 = this.field3615;
        while (this.field3604 == var2) {
            while (this.field3610.field3626[var1] == var2) {
                this.field3610.method5785(var1);
                int var5 = this.field3610.method5788(var1);
                if (var5 == 1) {
                    this.field3610.method5808();
                    this.field3610.method5786(var1);
                    if (this.field3610.method5816()) {
                        if (!this.field3619 || var2 == 0) {
                            this.method5686();
                            this.field3610.method5794();
                            return;
                        }
                        this.field3610.method5809(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5752(var5);
                }
                this.field3610.method5782(var1);
                this.field3610.method5786(var1);
            }
            var1 = this.field3610.method5792();
            var2 = this.field3610.field3626[var1];
            var3 = this.field3610.method5781(var2);
        }
        this.field3612 = var1;
        this.field3604 = var2;
        this.field3615 = var3;
    }

    @ObfuscatedName("mw.bb(Lne;B)Z")
    public boolean method5694(class340 arg0) {
        if (arg0.field3672 != null) {
            return false;
        }
        if (arg0.field3677 >= 0) {
            arg0.method8189();
            if (arg0.field3665 > 0 && this.field3609[arg0.field3667][arg0.field3665] == arg0) {
                this.field3609[arg0.field3667][arg0.field3665] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mw.by(Lne;[IIII)Z")
    public boolean method5725(class340 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3663 = Statics.field1509 / 100;
        if (arg0.field3677 >= 0 && arg0.field3672 == null || arg0.field3672.method885()) {
            arg0.method5851();
            arg0.method8189();
            if (arg0.field3665 > 0 && this.field3609[arg0.field3667][arg0.field3665] == arg0) {
                this.field3609[arg0.field3667][arg0.field3665] = null;
            }
            return true;
        }
        int var5 = arg0.field3673;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3599[arg0.field3667] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3673 = var6;
        }
        arg0.field3672.method878(this.method5689(arg0));
        class329 var7 = arg0.field3666;
        boolean var8 = false;
        arg0.field3679++;
        arg0.field3676 += var7.field3574;
        double var9 = (double) ((arg0.field3669 - 60 << 8) + (arg0.field3673 * arg0.field3668 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3569 > 0) {
            if (var7.field3575 > 0) {
                arg0.field3671 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3575 * var9) + 0.5D);
            } else {
                arg0.field3671 += 128;
            }
        }
        if (var7.field3571 != null) {
            if (var7.field3570 > 0) {
                arg0.field3675 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3570 * var9) + 0.5D);
            } else {
                arg0.field3675 += 128;
            }
            while (arg0.field3681 < var7.field3571.length - 2 && arg0.field3675 > (var7.field3571[arg0.field3681 + 2] & 0xFF) << 8) {
                arg0.field3681 += 2;
            }
            if (arg0.field3681 == var7.field3571.length - 2 && var7.field3571[arg0.field3681 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3677 >= 0 && var7.field3568 != null && (this.field3602[arg0.field3667] & 0x1) == 0 && (arg0.field3665 < 0 || this.field3609[arg0.field3667][arg0.field3665] != arg0)) {
            if (var7.field3572 > 0) {
                arg0.field3677 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3572 * var9) + 0.5D);
            } else {
                arg0.field3677 += 128;
            }
            while (arg0.field3678 < var7.field3568.length - 2 && arg0.field3677 > (var7.field3568[arg0.field3678 + 2] & 0xFF) << 8) {
                arg0.field3678 += 2;
            }
            if (arg0.field3678 == var7.field3568.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3672.method876(arg0.field3663, this.method5690(arg0), this.method5691(arg0));
            return false;
        }
        arg0.field3672.method877(arg0.field3663);
        if (arg1 == null) {
            arg0.field3672.method713(arg3);
        } else {
            arg0.field3672.method707(arg1, arg2, arg3);
        }
        if (arg0.field3672.method881()) {
            this.field3616.field3657.method699(arg0.field3672);
        }
        arg0.method5851();
        if (arg0.field3677 >= 0) {
            arg0.method8189();
            if (arg0.field3665 > 0 && this.field3609[arg0.field3667][arg0.field3665] == arg0) {
                this.field3609[arg0.field3667][arg0.field3665] = null;
            }
        }
        return true;
    }
}
