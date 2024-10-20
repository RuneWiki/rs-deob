package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bi")
public class class43 {

    @ObfuscatedName("bi.ad")
    public int[] field286;

    @ObfuscatedName("bi.ac")
    public class50 field282;

    @ObfuscatedName("bi.ag")
    public int field279 = 32;

    @ObfuscatedName("bi.ar")
    public long field281 = class301.method4630();

    @ObfuscatedName("bi.ah")
    public int field291;

    @ObfuscatedName("bi.az")
    public int field290;

    @ObfuscatedName("bi.au")
    public int field287;

    @ObfuscatedName("bi.ai")
    public long field288 = 0L;

    @ObfuscatedName("bi.aq")
    public int field289 = 0;

    @ObfuscatedName("bi.aw")
    public int field278 = 0;

    @ObfuscatedName("bi.ay")
    public int field294 = 0;

    @ObfuscatedName("bi.al")
    public long field283 = 0L;

    @ObfuscatedName("bi.am")
    public boolean field293 = true;

    @ObfuscatedName("bi.bg")
    public int field285 = 0;

    @ObfuscatedName("bi.bf")
    public class50[] field295 = new class50[8];

    @ObfuscatedName("bi.bd")
    public class50[] field296 = new class50[8];

    @ObfuscatedName("qu.ah(Lbl;I)V")
    public static final void method7458(class52 arg0) {
        Statics.field4601 = arg0;
    }

    @ObfuscatedName("ko.az(IZII)V")
    public static final void method5079(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field292 = arg0;
        Statics.field3873 = arg1;
        Statics.field2945 = arg2;
    }

    @ObfuscatedName("hx.au(Lgr;IIS)Lbi;")
    public static final class43 method3580(class171 arg0, int arg1, int arg2) {
        if (Statics.field292 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field4601.method310();
                var3.field286 = new int[(Statics.field3873 ? 2 : 1) * 256];
                var3.field290 = arg2;
                var3.method323();
                var3.field291 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field291 > 16384) {
                    var3.field291 = 16384;
                }
                var3.method324(var3.field291);
                if (Statics.field2945 > 0 && Statics.field4390 == null) {
                    Statics.field4390 = new class45();
                    Statics.field280 = Executors.newScheduledThreadPool(1);
                    Statics.field280.scheduleAtFixedRate(Statics.field4390, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field4390 != null) {
                    if (Statics.field4390.field316[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field4390.field316[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bi.ai(Lby;I)V")
    public final synchronized void method739(class50 arg0) {
        this.field282 = arg0;
    }

    @ObfuscatedName("bi.aq(I)V")
    public final synchronized void method740() {
        if (this.field286 == null) {
            return;
        }
        long var1 = class301.method4630();
        try {
            if (this.field288 != 0L) {
                if (var1 < this.field288) {
                    return;
                }
                this.method324(this.field291);
                this.field288 = 0L;
                this.field293 = true;
            }
            int var3 = this.method325();
            if (this.field294 - var3 > this.field289) {
                this.field289 = this.field294 - var3;
            }
            int var4 = this.field290 + this.field287;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field291) {
                this.field291 += 1024;
                if (this.field291 > 16384) {
                    this.field291 = 16384;
                }
                this.method332();
                this.method324(this.field291);
                var3 = 0;
                this.field293 = true;
                if (var4 + 256 > this.field291) {
                    var4 = this.field291 - 256;
                    this.field287 = var4 - this.field290;
                }
            }
            while (var3 < var4) {
                this.method744(this.field286, 256);
                this.method326();
                var3 += 256;
            }
            if (var1 > this.field283) {
                if (this.field293) {
                    this.field293 = false;
                } else if (this.field289 == 0 && this.field278 == 0) {
                    this.method332();
                    this.field288 = var1 + 2000L;
                    return;
                } else {
                    this.field287 = Math.min(this.field278, this.field289);
                    this.field278 = this.field289;
                }
                this.field289 = 0;
                this.field283 = var1 + 2000L;
            }
            this.field294 = var3;
        } catch (Exception var8) {
            this.method332();
            this.field288 = var1 + 2000L;
        }
        try {
            if (var1 > this.field281 + 500000L) {
                var1 = this.field281;
            }
            while (var1 > this.field281 + 5000L) {
                this.method750(256);
                this.field281 += (long) (256000 / Statics.field292);
            }
        } catch (Exception var7) {
            this.field281 = var1;
        }
    }

    @ObfuscatedName("bi.aw(I)V")
    public final void method741() {
        this.field293 = true;
    }

    @ObfuscatedName("bi.ay(I)V")
    public final synchronized void method742() {
        this.field293 = true;
        try {
            this.method322();
        } catch (Exception var2) {
            this.method332();
            this.field288 = class301.method4630() + 2000L;
        }
    }

    @ObfuscatedName("bi.al(I)V")
    public final synchronized void method748() {
        if (Statics.field4390 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field4390.field316[var2] == this) {
                    Statics.field4390.field316[var2] = null;
                }
                if (Statics.field4390.field316[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field280.shutdownNow();
                Statics.field280 = null;
                Statics.field4390 = null;
            }
        }
        this.method332();
        this.field286 = null;
    }

    @ObfuscatedName("bi.am(II)V")
    public final void method750(int arg0) {
        this.field285 -= arg0;
        if (this.field285 < 0) {
            this.field285 = 0;
        }
        if (this.field282 != null) {
            this.field282.method674(arg0);
        }
    }

    @ObfuscatedName("bi.bs([II)V")
    public final void method744(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3873) {
            var3 = arg1 << 1;
        }
        class398.method6918(arg0, 0, var3);
        this.field285 -= arg1;
        if (this.field282 != null && this.field285 <= 0) {
            this.field285 += Statics.field292 >> 4;
            method2145(this.field282);
            this.method747(this.field282, this.field282.method888());
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
                        class50 var11 = this.field295[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field355;
                                if (var12 == null || var12.field473 <= var8) {
                                    var11.field356 = true;
                                    int var13 = var11.method672();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field473 += var13;
                                    }
                                    if (var4 >= this.field279) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method701();
                                    if (var14 != null) {
                                        int var15 = var11.field354;
                                        while (var14 != null) {
                                            this.method747(var14, var15 * var14.method888() >> 8);
                                            var14 = var11.method702();
                                        }
                                    }
                                    class50 var16 = var11.field353;
                                    var11.field353 = null;
                                    if (var10 == null) {
                                        this.field295[var7] = var16;
                                    } else {
                                        var10.field353 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field296[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field353;
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
                class50 var18 = this.field295[var17];
                class50[] var19 = this.field295;
                this.field296[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field353;
                    var18.field353 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field285 < 0) {
            this.field285 = 0;
        }
        if (this.field282 != null) {
            this.field282.method677(arg0, 0, arg1);
        }
        this.field281 = class301.method4630();
    }

    @ObfuscatedName("dx.bc(Lby;B)V")
    public static final void method2145(class50 arg0) {
        arg0.field356 = false;
        if (arg0.field355 != null) {
            arg0.field355.field473 = 0;
        }
        for (class50 var1 = arg0.method701(); var1 != null; var1 = arg0.method702()) {
            method2145(var1);
        }
    }

    @ObfuscatedName("bi.bj(Lby;II)V")
    public final void method747(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field296[var3];
        if (var4 == null) {
            this.field295[var3] = arg0;
        } else {
            var4.field353 = arg0;
        }
        this.field296[var3] = arg0;
        arg0.field354 = arg1;
    }

    @ObfuscatedName("bi.at(I)V")
    public void method323() throws Exception {
    }

    @ObfuscatedName("bi.an(II)V")
    public void method324(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.av(I)I")
    public int method325() throws Exception {
        return this.field291;
    }

    @ObfuscatedName("bi.as()V")
    public void method326() throws Exception {
    }

    @ObfuscatedName("bi.ax(I)V")
    public void method332() {
    }

    @ObfuscatedName("bi.ap(I)V")
    public void method322() throws Exception {
    }
}
