package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bu")
public class class43 {

    @ObfuscatedName("bu.ai")
    public int[] field301;

    @ObfuscatedName("bu.ag")
    public class49 field302;

    @ObfuscatedName("bu.ah")
    public int field303 = 32;

    @ObfuscatedName("bu.av")
    public long field304 = class294.method2504();

    @ObfuscatedName("bu.ar")
    public int field312;

    @ObfuscatedName("bu.am")
    public int field306;

    @ObfuscatedName("bu.as")
    public int field298;

    @ObfuscatedName("bu.aj")
    public long field308 = 0L;

    @ObfuscatedName("bu.ak")
    public int field309 = 0;

    @ObfuscatedName("bu.az")
    public int field297 = 0;

    @ObfuscatedName("bu.ad")
    public int field311 = 0;

    @ObfuscatedName("bu.ae")
    public long field310 = 0L;

    @ObfuscatedName("bu.ap")
    public boolean field313 = true;

    @ObfuscatedName("bu.bx")
    public int field315 = 0;

    @ObfuscatedName("bu.bo")
    public class49[] field305 = new class49[8];

    @ObfuscatedName("bu.bz")
    public class49[] field316 = new class49[8];

    @ObfuscatedName("fc.as(Lgd;III)Lbu;")
    public static final class43 method3075(class168 arg0, int arg1, int arg2) {
        if (Statics.field307 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field300.method314();
                var3.field301 = new int[256 * (Statics.field314 ? 2 : 1)];
                var3.field306 = arg2;
                var3.method326();
                var3.field312 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field312 > 16384) {
                    var3.field312 = 16384;
                }
                var3.method329(var3.field312);
                if (Statics.field1411 > 0 && Statics.field4307 == null) {
                    Statics.field4307 = new class45();
                    Statics.field330 = Executors.newScheduledThreadPool(1);
                    Statics.field330.scheduleAtFixedRate(Statics.field4307, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field4307 != null) {
                    if (Statics.field4307.field332[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field4307.field332[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bu.aj(Lbp;I)V")
    public final synchronized void method805(class49 arg0) {
        this.field302 = arg0;
    }

    @ObfuscatedName("bu.ak(I)V")
    public final synchronized void method813() {
        if (this.field301 == null) {
            return;
        }
        long var1 = class294.method2504();
        try {
            if (this.field308 != 0L) {
                if (var1 < this.field308) {
                    return;
                }
                this.method329(this.field312);
                this.field308 = 0L;
                this.field313 = true;
            }
            int var3 = this.method332();
            if (this.field311 - var3 > this.field309) {
                this.field309 = this.field311 - var3;
            }
            int var4 = this.field306 + this.field298;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field312) {
                this.field312 += 1024;
                if (this.field312 > 16384) {
                    this.field312 = 16384;
                }
                this.method330();
                this.method329(this.field312);
                var3 = 0;
                this.field313 = true;
                if (var4 + 256 > this.field312) {
                    var4 = this.field312 - 256;
                    this.field298 = var4 - this.field306;
                }
            }
            while (var3 < var4) {
                this.method810(this.field301, 256);
                this.method327();
                var3 += 256;
            }
            if (var1 > this.field310) {
                if (this.field313) {
                    this.field313 = false;
                } else if (this.field309 == 0 && this.field297 == 0) {
                    this.method330();
                    this.field308 = var1 + 2000L;
                    return;
                } else {
                    this.field298 = Math.min(this.field297, this.field309);
                    this.field297 = this.field309;
                }
                this.field309 = 0;
                this.field310 = var1 + 2000L;
            }
            this.field311 = var3;
        } catch (Exception var8) {
            this.method330();
            this.field308 = var1 + 2000L;
        }
        try {
            if (var1 > this.field304 + 500000L) {
                var1 = this.field304;
            }
            while (var1 > this.field304 + 5000L) {
                this.method809(256);
                this.field304 += (long) (256000 / Statics.field307);
            }
        } catch (Exception var7) {
            this.field304 = var1;
        }
    }

    @ObfuscatedName("bu.az(I)V")
    public final void method807() {
        this.field313 = true;
    }

    @ObfuscatedName("bu.ad(I)V")
    public final synchronized void method824() {
        this.field313 = true;
        try {
            this.method328();
        } catch (Exception var2) {
            this.method330();
            this.field308 = class294.method2504() + 2000L;
        }
    }

    @ObfuscatedName("bu.ae(B)V")
    public final synchronized void method808() {
        if (Statics.field4307 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field4307.field332[var2] == this) {
                    Statics.field4307.field332[var2] = null;
                }
                if (Statics.field4307.field332[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field330.shutdownNow();
                Statics.field330 = null;
                Statics.field4307 = null;
            }
        }
        this.method330();
        this.field301 = null;
    }

    @ObfuscatedName("bu.ap(II)V")
    public final void method809(int arg0) {
        this.field315 -= arg0;
        if (this.field315 < 0) {
            this.field315 = 0;
        }
        if (this.field302 != null) {
            this.field302.method755(arg0);
        }
    }

    @ObfuscatedName("bu.by([II)V")
    public final void method810(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field314) {
            var3 = arg1 << 1;
        }
        class385.method6904(arg0, 0, var3);
        this.field315 -= arg1;
        if (this.field302 != null && this.field315 <= 0) {
            this.field315 += Statics.field307 >> 4;
            method3900(this.field302);
            this.method812(this.field302, this.field302.method875());
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
                        class49 var10 = null;
                        class49 var11 = this.field305[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field365;
                                if (var12 == null || var12.field461 <= var8) {
                                    var11.field363 = true;
                                    int var13 = var11.method728();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field461 += var13;
                                    }
                                    if (var4 >= this.field303) {
                                        break label105;
                                    }
                                    class49 var14 = var11.method726();
                                    if (var14 != null) {
                                        int var15 = var11.field366;
                                        while (var14 != null) {
                                            this.method812(var14, var15 * var14.method875() >> 8);
                                            var14 = var11.method727();
                                        }
                                    }
                                    class49 var16 = var11.field364;
                                    var11.field364 = null;
                                    if (var10 == null) {
                                        this.field305[var7] = var16;
                                    } else {
                                        var10.field364 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field316[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field364;
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
                class49 var18 = this.field305[var17];
                class49[] var19 = this.field305;
                this.field316[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class49 var21 = var18.field364;
                    var18.field364 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field315 < 0) {
            this.field315 = 0;
        }
        if (this.field302 != null) {
            this.field302.method729(arg0, 0, arg1);
        }
        this.field304 = class294.method2504();
    }

    @ObfuscatedName("hy.bb(Lbp;I)V")
    public static final void method3900(class49 arg0) {
        arg0.field363 = false;
        if (arg0.field365 != null) {
            arg0.field365.field461 = 0;
        }
        for (class49 var1 = arg0.method726(); var1 != null; var1 = arg0.method727()) {
            method3900(var1);
        }
    }

    @ObfuscatedName("bu.bi(Lbp;IB)V")
    public final void method812(class49 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class49 var4 = this.field316[var3];
        if (var4 == null) {
            this.field305[var3] = arg0;
        } else {
            var4.field364 = arg0;
        }
        this.field316[var3] = arg0;
        arg0.field366 = arg1;
    }

    @ObfuscatedName("bu.af(B)V")
    public void method326() throws Exception {
    }

    @ObfuscatedName("bu.an(II)V")
    public void method329(int arg0) throws Exception {
    }

    @ObfuscatedName("bu.aw(I)I")
    public int method332() throws Exception {
        return this.field312;
    }

    @ObfuscatedName("bu.ac()V")
    public void method327() throws Exception {
    }

    @ObfuscatedName("bu.au(I)V")
    public void method330() {
    }

    @ObfuscatedName("bu.ab(B)V")
    public void method328() throws Exception {
    }
}
