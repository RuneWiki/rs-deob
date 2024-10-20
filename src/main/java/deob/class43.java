package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bm")
public class class43 {

    @ObfuscatedName("bm.af")
    public int[] field257;

    @ObfuscatedName("bm.ar")
    public class50 field255;

    @ObfuscatedName("bm.ab")
    public int field259 = 32;

    @ObfuscatedName("bm.az")
    public long field258 = class330.method2257();

    @ObfuscatedName("bm.ag")
    public int field260;

    @ObfuscatedName("bm.ad")
    public int field264;

    @ObfuscatedName("bm.ac")
    public int field269;

    @ObfuscatedName("bm.av")
    public long field263 = 0L;

    @ObfuscatedName("bm.ax")
    public int field265 = 0;

    @ObfuscatedName("bm.aq")
    public int field266 = 0;

    @ObfuscatedName("bm.al")
    public int field267 = 0;

    @ObfuscatedName("bm.aa")
    public long field268 = 0L;

    @ObfuscatedName("bm.ah")
    public boolean field262 = true;

    @ObfuscatedName("bm.bb")
    public int field256 = 0;

    @ObfuscatedName("bm.bq")
    public class50[] field271 = new class50[8];

    @ObfuscatedName("bm.bp")
    public class50[] field272 = new class50[8];

    @ObfuscatedName("jb.ax(Lio;III)Lbm;")
    public static final class43 method4929(class219 arg0, int arg1, int arg2) {
        if (Statics.field1060 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field270.method313();
                var3.field257 = new int[(Statics.field5411 ? 2 : 1) * 256];
                var3.field264 = arg2;
                var3.method336();
                var3.field260 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field260 > 16384) {
                    var3.field260 = 16384;
                }
                var3.method331(var3.field260);
                if (Statics.field4887 > 0 && Statics.field5354 == null) {
                    Statics.field5354 = new class45();
                    Statics.field16 = Executors.newScheduledThreadPool(1);
                    Statics.field16.scheduleAtFixedRate(Statics.field5354, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field5354 != null) {
                    if (Statics.field5354.field289[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field5354.field289[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bm.aq(Lbg;B)V")
    public final synchronized void method779(class50 arg0) {
        this.field255 = arg0;
    }

    @ObfuscatedName("bm.al(B)V")
    public final synchronized void method780() {
        if (this.field257 == null) {
            return;
        }
        long var1 = class330.method2257();
        try {
            if (this.field263 != 0L) {
                if (var1 < this.field263) {
                    return;
                }
                this.method331(this.field260);
                this.field263 = 0L;
                this.field262 = true;
            }
            int var3 = this.method332();
            if (this.field267 - var3 > this.field265) {
                this.field265 = this.field267 - var3;
            }
            int var4 = this.field269 + this.field264;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field260) {
                this.field260 += 1024;
                if (this.field260 > 16384) {
                    this.field260 = 16384;
                }
                this.method330();
                this.method331(this.field260);
                var3 = 0;
                this.field262 = true;
                if (var4 + 256 > this.field260) {
                    var4 = this.field260 - 256;
                    this.field269 = var4 - this.field264;
                }
            }
            while (var3 < var4) {
                this.method783(this.field257, 256);
                this.method333();
                var3 += 256;
            }
            if (var1 > this.field268) {
                if (this.field262) {
                    this.field262 = false;
                } else if (this.field265 == 0 && this.field266 == 0) {
                    this.method330();
                    this.field263 = var1 + 2000L;
                    return;
                } else {
                    this.field269 = Math.min(this.field266, this.field265);
                    this.field266 = this.field265;
                }
                this.field265 = 0;
                this.field268 = var1 + 2000L;
            }
            this.field267 = var3;
        } catch (Exception var8) {
            this.method330();
            this.field263 = var1 + 2000L;
        }
        try {
            if (var1 > this.field258 + 500000L) {
                var1 = this.field258;
            }
            while (var1 > this.field258 + 5000L) {
                this.method782(256);
                this.field258 += (long) (256000 / Statics.field1060);
            }
        } catch (Exception var7) {
            this.field258 = var1;
        }
    }

    @ObfuscatedName("bm.aa(I)V")
    public final void method781() {
        this.field262 = true;
    }

    @ObfuscatedName("bm.ah(I)V")
    public final synchronized void method803() {
        this.field262 = true;
        try {
            this.method339();
        } catch (Exception var2) {
            this.method330();
            this.field263 = class330.method2257() + 2000L;
        }
    }

    @ObfuscatedName("bm.bh(I)V")
    public final synchronized void method789() {
        if (Statics.field5354 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field5354.field289[var2] == this) {
                    Statics.field5354.field289[var2] = null;
                }
                if (Statics.field5354.field289[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field16.shutdownNow();
                Statics.field16 = null;
                Statics.field5354 = null;
            }
        }
        this.method330();
        this.field257 = null;
    }

    @ObfuscatedName("bm.bj(IB)V")
    public final void method782(int arg0) {
        this.field256 -= arg0;
        if (this.field256 < 0) {
            this.field256 = 0;
        }
        if (this.field255 != null) {
            this.field255.method708(arg0);
        }
    }

    @ObfuscatedName("bm.bv([II)V")
    public final void method783(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field5411) {
            var3 = arg1 << 1;
        }
        class452.method8083(arg0, 0, var3);
        this.field256 -= arg1;
        if (this.field255 != null && this.field256 <= 0) {
            this.field256 += Statics.field1060 >> 4;
            method5971(this.field255);
            this.method784(this.field255, this.field255.method876());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class50 var10 = null;
                        class50 var11 = this.field271[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field326;
                                if (var12 == null || var12.field441 <= var8) {
                                    var11.field328 = true;
                                    int var13 = var11.method705();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field441 += var13;
                                    }
                                    if (var4 >= this.field259) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method703();
                                    if (var14 != null) {
                                        int var15 = var11.field327;
                                        while (var14 != null) {
                                            this.method784(var14, var15 * var14.method876() >> 8);
                                            var14 = var11.method722();
                                        }
                                    }
                                    class50 var16 = var11.field329;
                                    var11.field329 = null;
                                    if (var10 == null) {
                                        this.field271[var7] = var16;
                                    } else {
                                        var10.field329 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field272[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field329;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class50 var18 = this.field271[var17];
                class50[] var19 = this.field271;
                this.field272[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field329;
                    var18.field329 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field256 < 0) {
            this.field256 = 0;
        }
        if (this.field255 != null) {
            this.field255.method706(arg0, 0, arg1);
        }
        this.field258 = class330.method2257();
    }

    @ObfuscatedName("mz.bx(Lbg;I)V")
    public static final void method5971(class50 arg0) {
        arg0.field328 = false;
        if (arg0.field326 != null) {
            arg0.field326.field441 = 0;
        }
        for (class50 var1 = arg0.method703(); var1 != null; var1 = arg0.method722()) {
            method5971(var1);
        }
    }

    @ObfuscatedName("bm.bk(Lbg;II)V")
    public final void method784(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field272[var3];
        if (var4 == null) {
            this.field271[var3] = arg0;
        } else {
            var4.field329 = arg0;
        }
        this.field272[var3] = arg0;
        arg0.field327 = arg1;
    }

    @ObfuscatedName("bm.ap(B)V")
    public void method336() throws Exception {
    }

    @ObfuscatedName("bm.aw(II)V")
    public void method331(int arg0) throws Exception {
    }

    @ObfuscatedName("bm.ak(B)I")
    public int method332() throws Exception {
        return this.field260;
    }

    @ObfuscatedName("bm.aj()V")
    public void method333() throws Exception {
    }

    @ObfuscatedName("bm.ai(B)V")
    public void method330() {
    }

    @ObfuscatedName("bm.ay(I)V")
    public void method339() throws Exception {
    }
}
