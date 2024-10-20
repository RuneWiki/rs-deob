package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bd")
public class class43 {

    @ObfuscatedName("bd.ap")
    public int[] field284;

    @ObfuscatedName("bd.ae")
    public class50 field281;

    @ObfuscatedName("bd.ax")
    public int field282 = 32;

    @ObfuscatedName("bd.ay")
    public long field298 = class326.method2895();

    @ObfuscatedName("bd.au")
    public int field292;

    @ObfuscatedName("bd.as")
    public int field285;

    @ObfuscatedName("bd.aw")
    public int field286;

    @ObfuscatedName("bd.ad")
    public long field283 = 0L;

    @ObfuscatedName("bd.ai")
    public int field288 = 0;

    @ObfuscatedName("bd.an")
    public int field289 = 0;

    @ObfuscatedName("bd.am")
    public int field290 = 0;

    @ObfuscatedName("bd.ar")
    public long field291 = 0L;

    @ObfuscatedName("bd.ag")
    public boolean field287 = true;

    @ObfuscatedName("bd.bn")
    public int field294 = 0;

    @ObfuscatedName("bd.bw")
    public class50[] field296 = new class50[8];

    @ObfuscatedName("bd.bl")
    public class50[] field299 = new class50[8];

    @ObfuscatedName("ht.bs(Lby;S)V")
    public static final void method3472(class52 arg0) {
        Statics.field438 = arg0;
    }

    @ObfuscatedName("ah.bf(Lgz;IIB)Lbd;")
    public static final class43 method92(class177 arg0, int arg1, int arg2) {
        if (Statics.field1509 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field438.method290();
                var3.field284 = new int[256 * (Statics.field1894 ? 2 : 1)];
                var3.field285 = arg2;
                var3.method310();
                var3.field292 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field292 > 16384) {
                    var3.field292 = 16384;
                }
                var3.method309(var3.field292);
                if (Statics.field2793 > 0 && Statics.field44 == null) {
                    Statics.field44 = new class45();
                    Statics.field2188 = Executors.newScheduledThreadPool(1);
                    Statics.field2188.scheduleAtFixedRate(Statics.field44, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field44 != null) {
                    if (Statics.field44.field312[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field44.field312[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bd.bo(Lba;I)V")
    public final synchronized void method773(class50 arg0) {
        this.field281 = arg0;
    }

    @ObfuscatedName("bd.bi(I)V")
    public final synchronized void method797() {
        if (this.field284 == null) {
            return;
        }
        long var1 = class326.method2895();
        try {
            if (this.field283 != 0L) {
                if (var1 < this.field283) {
                    return;
                }
                this.method309(this.field292);
                this.field283 = 0L;
                this.field287 = true;
            }
            int var3 = this.method321();
            if (this.field290 - var3 > this.field288) {
                this.field288 = this.field290 - var3;
            }
            int var4 = this.field286 + this.field285;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field292) {
                this.field292 += 1024;
                if (this.field292 > 16384) {
                    this.field292 = 16384;
                }
                this.method312();
                this.method309(this.field292);
                var3 = 0;
                this.field287 = true;
                if (var4 + 256 > this.field292) {
                    var4 = this.field292 - 256;
                    this.field286 = var4 - this.field285;
                }
            }
            while (var3 < var4) {
                this.method784(this.field284, 256);
                this.method311();
                var3 += 256;
            }
            if (var1 > this.field291) {
                if (this.field287) {
                    this.field287 = false;
                } else if (this.field288 == 0 && this.field289 == 0) {
                    this.method312();
                    this.field283 = var1 + 2000L;
                    return;
                } else {
                    this.field286 = Math.min(this.field289, this.field288);
                    this.field289 = this.field288;
                }
                this.field288 = 0;
                this.field291 = var1 + 2000L;
            }
            this.field290 = var3;
        } catch (Exception var8) {
            this.method312();
            this.field283 = var1 + 2000L;
        }
        try {
            if (var1 > this.field298 + 500000L) {
                var1 = this.field298;
            }
            while (var1 > this.field298 + 5000L) {
                this.method776(256);
                this.field298 += (long) (256000 / Statics.field1509);
            }
        } catch (Exception var7) {
            this.field298 = var1;
        }
    }

    @ObfuscatedName("bd.bt(I)V")
    public final void method774() {
        this.field287 = true;
    }

    @ObfuscatedName("bd.bn(I)V")
    public final synchronized void method782() {
        this.field287 = true;
        try {
            this.method313();
        } catch (Exception var2) {
            this.method312();
            this.field283 = class326.method2895() + 2000L;
        }
    }

    @ObfuscatedName("bd.bw(B)V")
    public final synchronized void method775() {
        if (Statics.field44 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field44.field312[var2] == this) {
                    Statics.field44.field312[var2] = null;
                }
                if (Statics.field44.field312[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2188.shutdownNow();
                Statics.field2188 = null;
                Statics.field44 = null;
            }
        }
        this.method312();
        this.field284 = null;
    }

    @ObfuscatedName("bd.bl(II)V")
    public final void method776(int arg0) {
        this.field294 -= arg0;
        if (this.field294 < 0) {
            this.field294 = 0;
        }
        if (this.field281 != null) {
            this.field281.method713(arg0);
        }
    }

    @ObfuscatedName("bd.be([II)V")
    public final void method784(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1894) {
            var3 = arg1 << 1;
        }
        class447.method7642(arg0, 0, var3);
        this.field294 -= arg1;
        if (this.field281 != null && this.field294 <= 0) {
            this.field294 += Statics.field1509 >> 4;
            method1869(this.field281);
            this.method777(this.field281, this.field281.method860());
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
                        class50 var11 = this.field296[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field357;
                                if (var12 == null || var12.field466 <= var8) {
                                    var11.field355 = true;
                                    int var13 = var11.method706();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field466 += var13;
                                    }
                                    if (var4 >= this.field282) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method704();
                                    if (var14 != null) {
                                        int var15 = var11.field356;
                                        while (var14 != null) {
                                            this.method777(var14, var15 * var14.method860() >> 8);
                                            var14 = var11.method705();
                                        }
                                    }
                                    class50 var16 = var11.field358;
                                    var11.field358 = null;
                                    if (var10 == null) {
                                        this.field296[var7] = var16;
                                    } else {
                                        var10.field358 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field299[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field358;
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
                class50 var18 = this.field296[var17];
                class50[] var19 = this.field296;
                this.field299[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field358;
                    var18.field358 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field294 < 0) {
            this.field294 = 0;
        }
        if (this.field281 != null) {
            this.field281.method707(arg0, 0, arg1);
        }
        this.field298 = class326.method2895();
    }

    @ObfuscatedName("cy.bg(Lba;B)V")
    public static final void method1869(class50 arg0) {
        arg0.field355 = false;
        if (arg0.field357 != null) {
            arg0.field357.field466 = 0;
        }
        for (class50 var1 = arg0.method704(); var1 != null; var1 = arg0.method705()) {
            method1869(var1);
        }
    }

    @ObfuscatedName("bd.bu(Lba;II)V")
    public final void method777(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field299[var3];
        if (var4 == null) {
            this.field296[var3] = arg0;
        } else {
            var4.field358 = arg0;
        }
        this.field299[var3] = arg0;
        arg0.field356 = arg1;
    }

    @ObfuscatedName("bd.ak(B)V")
    public void method310() throws Exception {
    }

    @ObfuscatedName("bd.al(IB)V")
    public void method309(int arg0) throws Exception {
    }

    @ObfuscatedName("bd.aj(I)I")
    public int method321() throws Exception {
        return this.field292;
    }

    @ObfuscatedName("bd.az()V")
    public void method311() throws Exception {
    }

    @ObfuscatedName("bd.af(I)V")
    public void method312() {
    }

    @ObfuscatedName("bd.aa(B)V")
    public void method313() throws Exception {
    }
}
