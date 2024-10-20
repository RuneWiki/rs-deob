package deob;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("mr")
public class class334 extends class50 {

    @ObfuscatedName("mr.ab")
    public class522 field3585;

    @ObfuscatedName("mr.ay")
    public int field3575 = 256;

    @ObfuscatedName("mr.an")
    public int field3598 = 1000000;

    @ObfuscatedName("mr.au")
    public int[] field3576 = new int[16];

    @ObfuscatedName("mr.ax")
    public int[] field3574 = new int[16];

    @ObfuscatedName("mr.ao")
    public int[] field3579 = new int[16];

    @ObfuscatedName("mr.am")
    public int[] field3577 = new int[16];

    @ObfuscatedName("mr.ac")
    public int[] field3581 = new int[16];

    @ObfuscatedName("mr.ae")
    public int[] field3602 = new int[16];

    @ObfuscatedName("mr.ad")
    public int[] field3582 = new int[16];

    @ObfuscatedName("mr.aq")
    public int[] field3584 = new int[16];

    @ObfuscatedName("mr.al")
    public int[] field3583 = new int[16];

    @ObfuscatedName("mr.av")
    public int[] field3586 = new int[16];

    @ObfuscatedName("mr.ar")
    public int[] field3587 = new int[16];

    @ObfuscatedName("mr.ap")
    public int[] field3588 = new int[16];

    @ObfuscatedName("mr.ak")
    public int[] field3589 = new int[16];

    @ObfuscatedName("mr.ai")
    public int[] field3580 = new int[16];

    @ObfuscatedName("mr.at")
    public int[] field3591 = new int[16];

    @ObfuscatedName("mr.az")
    public class343[][] field3592 = new class343[16][128];

    @ObfuscatedName("mr.bg")
    public class343[][] field3593 = new class343[16][128];

    @ObfuscatedName("mr.bz")
    public class335 field3594 = new class335();

    @ObfuscatedName("mr.bj")
    public boolean field3595;

    @ObfuscatedName("mr.bc")
    public int field3596;

    @ObfuscatedName("mr.bo")
    public int field3578;

    @ObfuscatedName("mr.bm")
    public long field3590;

    @ObfuscatedName("mr.bd")
    public long field3599;

    @ObfuscatedName("mr.bh")
    public class341 field3600 = new class341(this);

    @ObfuscatedName("mr.bx")
    public class43 field3601 = null;

    @ObfuscatedName("mr.bv")
    public PriorityQueue field3597 = new PriorityQueue(5, new class344());

    @ObfuscatedName("mr.bu")
    public static AtomicBoolean field3603 = null;

    @ObfuscatedName("mr.bp")
    public static ThreadPoolExecutor field3604 = null;

    @ObfuscatedName("mr.br")
    public int field3605 = 0;

    public class334(class43 arg0) {
        this.field3601 = arg0;
        this.field3585 = new class522(128);
        this.method5780();
    }

    @ObfuscatedName("mr.ab(II)V")
    public void method5691(int arg0) {
        class43 var2 = this.field3601;
        synchronized (this.field3601) {
            this.field3575 = arg0;
        }
    }

    @ObfuscatedName("mr.ay(I)I")
    public int method5710() {
        return this.field3575;
    }

    @ObfuscatedName("mr.an(Lnd;Lob;Lbn;I)Z")
    public boolean method5725(class342 arg0, class389 arg1, class46 arg2) {
        class43 var4 = this.field3601;
        synchronized (this.field3601) {
            boolean var5 = true;
            PriorityQueue var6 = this.field3597;
            synchronized (this.field3597) {
                this.field3597.clear();
            }
            for (class346 var8 = (class346) arg0.field3646.method8546(); var8 != null; var8 = (class346) arg0.field3646.method8539()) {
                int var9 = (int) var8.field5075;
                class338 var10 = (class338) this.field3585.method8544((long) var9);
                if (var10 == null) {
                    var10 = class338.method94(arg1, var9);
                    if (var10 == null) {
                        var5 = false;
                        continue;
                    }
                    this.field3585.method8551(var10, (long) var9);
                }
                if (!var10.method5879(arg2, var8.field3689)) {
                    var5 = false;
                } else if (this.field3597 != null) {
                    PriorityQueue var11 = this.field3597;
                    synchronized (this.field3597) {
                        Iterator var12 = var10.field3636.iterator();
                        while (var12.hasNext()) {
                            class54 var13 = (class54) var12.next();
                            this.field3597.add(new class337(var8.field3692, var13));
                        }
                    }
                }
            }
            return var5;
        }
    }

    @ObfuscatedName("mr.au(I)V")
    public void method5695() {
        if (this.field3597 == null) {
            return;
        }
        if (field3603 != null) {
            field3603.set(true);
        }
        field3603 = new AtomicBoolean(false);
        AtomicBoolean var1 = field3603;
        if (field3604 == null) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field3604 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class336(this));
        }
        field3604.submit(new class340(this, var1));
    }

    @ObfuscatedName("mr.ax(B)V")
    public void method5696() {
        class43 var1 = this.field3601;
        synchronized (this.field3601) {
            for (class338 var2 = (class338) this.field3585.method8546(); var2 != null; var2 = (class338) this.field3585.method8539()) {
                var2.method5871();
            }
        }
    }

    @ObfuscatedName("mr.ad(B)V")
    public void method5697() {
        class43 var1 = this.field3601;
        synchronized (this.field3601) {
            for (class338 var2 = (class338) this.field3585.method8546(); var2 != null; var2 = (class338) this.field3585.method8539()) {
                var2.method8218();
            }
        }
    }

    @ObfuscatedName("mr.al(Lnd;ZI)V")
    public void method5698(class342 arg0, boolean arg1) {
        class43 var3 = this.field3601;
        synchronized (this.field3601) {
            this.method5699();
            this.field3594.method5851(arg0.field3645);
            this.field3595 = arg1;
            this.field3590 = 0L;
            int var4 = this.field3594.method5853();
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3594.method5860(var5);
                this.field3594.method5857(var5);
                this.field3594.method5822(var5);
            }
            this.field3596 = this.field3594.method5855();
            this.field3578 = this.field3594.field3610[this.field3596];
            this.field3599 = this.field3594.method5814(this.field3578);
        }
    }

    @ObfuscatedName("mr.aj(I)V")
    public void method5699() {
        class43 var1 = this.field3601;
        synchronized (this.field3601) {
            this.field3594.method5812();
            this.method5780();
        }
    }

    @ObfuscatedName("mr.as(I)Z")
    public boolean method5700() {
        class43 var1 = this.field3601;
        synchronized (this.field3601) {
            return this.field3594.method5813();
        }
    }

    @ObfuscatedName("mr.aw(I)Z")
    public boolean method5748() {
        class43 var1 = this.field3601;
        synchronized (this.field3601) {
            return this.field3585.method8536() > 0;
        }
    }

    @ObfuscatedName("mr.af(III)V")
    public void method5702(int arg0, int arg1) {
        class43 var3 = this.field3601;
        synchronized (this.field3601) {
            this.method5777(arg0, arg1);
        }
    }

    @ObfuscatedName("mr.aa(IIB)V")
    public void method5777(int arg0, int arg1) {
        this.field3577[arg0] = arg1;
        this.field3602[arg0] = arg1 & 0xFFFFFF80;
        this.method5704(arg0, arg1);
    }

    @ObfuscatedName("mr.ah(III)V")
    public void method5704(int arg0, int arg1) {
        if (this.field3581[arg0] != arg1) {
            this.field3581[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3593[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("mr.ag(IIII)V")
    public void method5705(int arg0, int arg1, int arg2) {
        this.method5706(arg0, arg1, 64);
        if ((this.field3586[arg0] & 0x2) != 0) {
            for (class343 var4 = (class343) this.field3600.field3640.method6897(); var4 != null; var4 = (class343) this.field3600.field3640.method6899()) {
                if (var4.field3653 == arg0 && var4.field3661 < 0) {
                    this.field3592[arg0][var4.field3658] = null;
                    this.field3592[arg0][arg1] = var4;
                    int var5 = (var4.field3663 * var4.field3657 >> 12) + var4.field3655;
                    var4.field3655 += arg1 - var4.field3658 << 8;
                    var4.field3663 = var5 - var4.field3655;
                    var4.field3657 = 4096;
                    var4.field3658 = arg1;
                    return;
                }
            }
        }
        class338 var6 = (class338) this.field3585.method8544((long) this.field3581[arg0]);
        if (var6 == null || var6.field3630[arg1] == null) {
            return;
        }
        class41 var7 = var6.field3630[arg1].method986();
        if (var7 == null) {
            return;
        }
        class343 var8 = new class343();
        var8.field3653 = arg0;
        var8.field3659 = var6;
        var8.field3649 = var7;
        var8.field3656 = var6.field3634[arg1];
        var8.field3651 = var6.field3631[arg1];
        var8.field3658 = arg1;
        var8.field3648 = var6.field3633 * arg2 * arg2 * var6.field3629[arg1] + 1024 >> 11;
        var8.field3650 = var6.field3632[arg1] & 0xFF;
        var8.field3655 = (arg1 << 8) - (var6.field3635[arg1] & 0x7FFF);
        var8.field3647 = 0;
        var8.field3666 = 0;
        var8.field3660 = 0;
        var8.field3661 = -1;
        var8.field3662 = 0;
        if (this.field3589[arg0] == 0) {
            var8.field3665 = class49.method830(var7, this.method5718(var8), this.method5795(var8), this.method5774(var8));
        } else {
            var8.field3665 = class49.method830(var7, this.method5718(var8), 0, this.method5774(var8));
            this.method5717(var8, var6.field3635[arg1] < 0);
        }
        if (var6.field3635[arg1] < 0) {
            var8.field3665.method832(-1);
        }
        if (var8.field3651 >= 0) {
            class343 var9 = this.field3593[arg0][var8.field3651];
            if (var9 != null && var9.field3661 < 0) {
                this.field3592[arg0][var9.field3658] = null;
                var9.field3661 = 0;
            }
            this.field3593[arg0][var8.field3651] = var8;
        }
        this.field3600.field3640.method6892(var8);
        this.field3592[arg0][arg1] = var8;
    }

    @ObfuscatedName("mr.av(Lno;ZI)V")
    public void method5717(class343 arg0, boolean arg1) {
        int var3 = arg0.field3649.field243.length;
        int var5;
        if (arg1 && arg0.field3649.field242) {
            int var4 = var3 + var3 - arg0.field3649.field244;
            var5 = (int) ((long) this.field3589[arg0.field3653] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3665.method922(true);
            }
        } else {
            var5 = (int) ((long) this.field3589[arg0.field3653] * (long) var3 >> 6);
        }
        arg0.field3665.method931(var5);
    }

    @ObfuscatedName("mr.ar(IIII)V")
    public void method5706(int arg0, int arg1, int arg2) {
        class343 var4 = this.field3592[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3592[arg0][arg1] = null;
        if ((this.field3586[arg0] & 0x2) == 0) {
            var4.field3661 = 0;
            return;
        }
        for (class343 var5 = (class343) this.field3600.field3640.method6907(); var5 != null; var5 = (class343) this.field3600.field3640.method6896()) {
            if (var4.field3653 == var5.field3653 && var5.field3661 < 0 && var4 != var5) {
                var4.field3661 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("mr.ap(IIII)V")
    public void method5707(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("mr.ak(IIB)V")
    public void method5708(int arg0, int arg1) {
    }

    @ObfuscatedName("mr.ai(III)V")
    public void method5709(int arg0, int arg1) {
        this.field3582[arg0] = arg1;
    }

    @ObfuscatedName("mr.bz(IB)V")
    public void method5693(int arg0) {
        for (class343 var2 = (class343) this.field3600.field3640.method6907(); var2 != null; var2 = (class343) this.field3600.field3640.method6896()) {
            if (arg0 < 0 || var2.field3653 == arg0) {
                if (var2.field3665 != null) {
                    var2.field3665.method962(Statics.field5137 / 100);
                    if (var2.field3665.method846()) {
                        this.field3600.field3642.method675(var2.field3665);
                    }
                    var2.method5892();
                }
                if (var2.field3661 < 0) {
                    this.field3592[var2.field3653][var2.field3658] = null;
                }
                var2.method8218();
            }
        }
    }

    @ObfuscatedName("mr.bj(II)V")
    public void method5711(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5711(var2);
            }
            return;
        }
        this.field3576[arg0] = 12800;
        this.field3574[arg0] = 8192;
        this.field3579[arg0] = 16383;
        this.field3582[arg0] = 8192;
        this.field3584[arg0] = 0;
        this.field3583[arg0] = 8192;
        this.method5714(arg0);
        this.method5715(arg0);
        this.field3586[arg0] = 0;
        this.field3587[arg0] = 32767;
        this.field3588[arg0] = 256;
        this.field3589[arg0] = 0;
        this.method5733(arg0, 8192);
    }

    @ObfuscatedName("mr.bc(II)V")
    public void method5772(int arg0) {
        for (class343 var2 = (class343) this.field3600.field3640.method6907(); var2 != null; var2 = (class343) this.field3600.field3640.method6896()) {
            if ((arg0 < 0 || var2.field3653 == arg0) && var2.field3661 < 0) {
                this.field3592[var2.field3653][var2.field3658] = null;
                var2.field3661 = 0;
            }
        }
    }

    @ObfuscatedName("mr.bm(B)V")
    public void method5780() {
        this.method5693(-1);
        this.method5711(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3581[var1] = this.field3577[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3602[var2] = this.field3577[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("mr.bu(IB)V")
    public void method5714(int arg0) {
        if ((this.field3586[arg0] & 0x2) == 0) {
            return;
        }
        for (class343 var2 = (class343) this.field3600.field3640.method6907(); var2 != null; var2 = (class343) this.field3600.field3640.method6896()) {
            if (var2.field3653 == arg0 && this.field3592[arg0][var2.field3658] == null && var2.field3661 < 0) {
                var2.field3661 = 0;
            }
        }
    }

    @ObfuscatedName("mr.bp(II)V")
    public void method5715(int arg0) {
        if ((this.field3586[arg0] & 0x4) == 0) {
            return;
        }
        for (class343 var2 = (class343) this.field3600.field3640.method6907(); var2 != null; var2 = (class343) this.field3600.field3640.method6896()) {
            if (var2.field3653 == arg0) {
                var2.field3667 = 0;
            }
        }
    }

    @ObfuscatedName("mr.br(II)V")
    public void method5757(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5706(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5705(var6, var7, var8);
            } else {
                this.method5706(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5707(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3602[var12] = (var14 << 14) + (this.field3602[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3602[var12] = (var14 << 7) + (this.field3602[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3584[var12] = (var14 << 7) + (this.field3584[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3584[var12] = (this.field3584[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3583[var12] = (var14 << 7) + (this.field3583[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3583[var12] = (this.field3583[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3576[var12] = (var14 << 7) + (this.field3576[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3576[var12] = (this.field3576[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3574[var12] = (var14 << 7) + (this.field3574[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3574[var12] = (this.field3574[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3579[var12] = (var14 << 7) + (this.field3579[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3579[var12] = (this.field3579[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3586[var12] |= 0x1;
                } else {
                    this.field3586[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3586[var12] |= 0x2;
                } else {
                    this.method5714(var12);
                    this.field3586[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3587[var12] = (var14 << 7) + (this.field3587[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3587[var12] = (this.field3587[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3587[var12] = (var14 << 7) + (this.field3587[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3587[var12] = (this.field3587[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5693(var12);
            }
            if (var13 == 121) {
                this.method5711(var12);
            }
            if (var13 == 123) {
                this.method5772(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3587[var12];
                if (var15 == 16384) {
                    this.field3588[var12] = (var14 << 7) + (this.field3588[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3587[var12];
                if (var16 == 16384) {
                    this.field3588[var12] = (this.field3588[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3589[var12] = (var14 << 7) + (this.field3589[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3589[var12] = (this.field3589[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3586[var12] |= 0x4;
                } else {
                    this.method5715(var12);
                    this.field3586[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5733(var12, (var14 << 7) + (this.field3580[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5733(var12, (this.field3580[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5704(var17, this.field3602[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5708(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method5709(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5780();
            }
        }
    }

    @ObfuscatedName("mr.bf(III)V")
    public void method5733(int arg0, int arg1) {
        this.field3580[arg0] = arg1;
        this.field3591[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("mr.bq(Lno;B)I")
    public int method5718(class343 arg0) {
        int var2 = (arg0.field3663 * arg0.field3657 >> 12) + arg0.field3655;
        int var3 = ((this.field3582[arg0.field3653] - 8192) * this.field3588[arg0.field3653] >> 12) + var2;
        class332 var4 = arg0.field3656;
        if (var4.field3557 > 0 && (var4.field3558 > 0 || this.field3584[arg0.field3653] > 0)) {
            int var5 = var4.field3558 << 2;
            int var6 = var4.field3553 << 1;
            if (arg0.field3654 < var6) {
                var5 = arg0.field3654 * var5 / var6;
            }
            int var7 = (this.field3584[arg0.field3653] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3664 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3649.field246 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field5137 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("mr.bt(Lno;I)I")
    public int method5795(class343 arg0) {
        class332 var2 = arg0.field3656;
        int var3 = this.field3579[arg0.field3653] * this.field3576[arg0.field3653] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3648 * var4 + 16384 >> 15;
        int var6 = this.field3575 * var5 + 128 >> 8;
        if (var2.field3552 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3647 * 1.953125E-5D * (double) var2.field3552) + 0.5D);
        }
        if (var2.field3550 != null) {
            int var7 = arg0.field3666;
            int var8 = var2.field3550[arg0.field3660 + 1];
            if (arg0.field3660 < var2.field3550.length - 2) {
                int var9 = (var2.field3550[arg0.field3660] & 0xFF) << 8;
                int var10 = (var2.field3550[arg0.field3660 + 2] & 0xFF) << 8;
                var8 += (var2.field3550[arg0.field3660 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3661 > 0 && var2.field3551 != null) {
            int var11 = arg0.field3661;
            int var12 = var2.field3551[arg0.field3662 + 1];
            if (arg0.field3662 < var2.field3551.length - 2) {
                int var13 = (var2.field3551[arg0.field3662] & 0xFF) << 8;
                int var14 = (var2.field3551[arg0.field3662 + 2] & 0xFF) << 8;
                var12 += (var2.field3551[arg0.field3662 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("mr.bi(Lno;B)I")
    public int method5774(class343 arg0) {
        int var2 = this.field3574[arg0.field3653];
        return var2 < 8192 ? arg0.field3650 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3650) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("mr.ao()Lbb;")
    public class50 method705() {
        return this.field3600;
    }

    @ObfuscatedName("mr.am()Lbb;")
    public class50 method687() {
        return null;
    }

    @ObfuscatedName("mr.ac()I")
    public int method682() {
        return 0;
    }

    @ObfuscatedName("mr.ae([III)V")
    public void method683(int[] arg0, int arg1, int arg2) {
        if (this.field3594.method5813()) {
            int var4 = this.field3598 * this.field3594.field3614 / Statics.field5137;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3590;
                if (this.field3599 - var5 >= 0L) {
                    this.field3590 = var5;
                    break;
                }
                int var7 = (int) ((this.field3599 - this.field3590 + (long) var4 - 1L) / (long) var4);
                this.field3590 += (long) var4 * (long) var7;
                this.field3600.method683(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5724();
            } while (this.field3594.method5813());
        }
        this.field3600.method683(arg0, arg1, arg2);
    }

    @ObfuscatedName("mr.aq(I)V")
    public void method693(int arg0) {
        if (this.field3594.method5813()) {
            int var2 = this.field3598 * this.field3594.field3614 / Statics.field5137;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3590;
                if (this.field3599 - var3 >= 0L) {
                    this.field3590 = var3;
                    break;
                }
                int var5 = (int) ((this.field3599 - this.field3590 + (long) var2 - 1L) / (long) var2);
                this.field3590 += (long) var2 * (long) var5;
                this.field3600.method693(var5);
                arg0 -= var5;
                this.method5724();
            } while (this.field3594.method5813());
        }
        this.field3600.method693(arg0);
    }

    @ObfuscatedName("mr.be(B)V")
    public void method5724() {
        int var1 = this.field3596;
        int var2 = this.field3578;
        long var3 = this.field3599;
        while (this.field3578 == var2) {
            while (this.field3594.field3610[var1] == var2) {
                this.field3594.method5860(var1);
                int var5 = this.field3594.method5819(var1);
                if (var5 == 1) {
                    this.field3594.method5817();
                    this.field3594.method5822(var1);
                    if (this.field3594.method5811()) {
                        if (!this.field3595 || var2 == 0) {
                            this.method5780();
                            this.field3594.method5812();
                            return;
                        }
                        this.field3594.method5825(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5757(var5);
                }
                this.field3594.method5857(var1);
                this.field3594.method5822(var1);
            }
            var1 = this.field3594.method5855();
            var2 = this.field3594.field3610[var1];
            var3 = this.field3594.method5814(var2);
        }
        this.field3596 = var1;
        this.field3578 = var2;
        this.field3599 = var3;
    }

    @ObfuscatedName("mr.ba(Lno;I)Z")
    public boolean method5722(class343 arg0) {
        if (arg0.field3665 != null) {
            return false;
        }
        if (arg0.field3661 >= 0) {
            arg0.method8218();
            if (arg0.field3651 > 0 && this.field3593[arg0.field3653][arg0.field3651] == arg0) {
                this.field3593[arg0.field3653][arg0.field3651] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("mr.bn(Lno;[IIIB)Z")
    public boolean method5723(class343 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3652 = Statics.field5137 / 100;
        if (arg0.field3661 >= 0 && arg0.field3665 == null || arg0.field3665.method845()) {
            arg0.method5892();
            arg0.method8218();
            if (arg0.field3651 > 0 && this.field3593[arg0.field3653][arg0.field3651] == arg0) {
                this.field3593[arg0.field3653][arg0.field3651] = null;
            }
            return true;
        }
        int var5 = arg0.field3657;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3583[arg0.field3653] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3657 = var6;
        }
        arg0.field3665.method844(this.method5718(arg0));
        class332 var7 = arg0.field3656;
        boolean var8 = false;
        arg0.field3654++;
        arg0.field3664 += var7.field3557;
        double var9 = (double) ((arg0.field3658 - 60 << 8) + (arg0.field3663 * arg0.field3657 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3552 > 0) {
            if (var7.field3555 > 0) {
                arg0.field3647 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3555 * var9) + 0.5D);
            } else {
                arg0.field3647 += 128;
            }
        }
        if (var7.field3550 != null) {
            if (var7.field3561 > 0) {
                arg0.field3666 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3561 * var9) + 0.5D);
            } else {
                arg0.field3666 += 128;
            }
            while (arg0.field3660 < var7.field3550.length - 2 && arg0.field3666 > (var7.field3550[arg0.field3660 + 2] & 0xFF) << 8) {
                arg0.field3660 += 2;
            }
            if (arg0.field3660 == var7.field3550.length - 2 && var7.field3550[arg0.field3660 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3661 >= 0 && var7.field3551 != null && (this.field3586[arg0.field3653] & 0x1) == 0 && (arg0.field3651 < 0 || this.field3593[arg0.field3653][arg0.field3651] != arg0)) {
            if (var7.field3554 > 0) {
                arg0.field3661 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3554 * var9) + 0.5D);
            } else {
                arg0.field3661 += 128;
            }
            while (arg0.field3662 < var7.field3551.length - 2 && arg0.field3661 > (var7.field3551[arg0.field3662 + 2] & 0xFF) << 8) {
                arg0.field3662 += 2;
            }
            if (arg0.field3662 == var7.field3551.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3665.method842(arg0.field3652, this.method5795(arg0), this.method5774(arg0));
            return false;
        }
        arg0.field3665.method962(arg0.field3652);
        if (arg1 == null) {
            arg0.field3665.method693(arg3);
        } else {
            arg0.field3665.method683(arg1, arg2, arg3);
        }
        if (arg0.field3665.method846()) {
            this.field3600.field3642.method675(arg0.field3665);
        }
        arg0.method5892();
        if (arg0.field3661 >= 0) {
            arg0.method8218();
            if (arg0.field3651 > 0 && this.field3593[arg0.field3653][arg0.field3651] == arg0) {
                this.field3593[arg0.field3653][arg0.field3651] = null;
            }
        }
        return true;
    }
}
