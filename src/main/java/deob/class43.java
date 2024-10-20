package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bb")
public class class43 {

    @ObfuscatedName("bb.an")
    public int[] field299;

    @ObfuscatedName("bb.ar")
    public class50 field300;

    @ObfuscatedName("bb.ab")
    public int field301 = 32;

    @ObfuscatedName("bb.ag")
    public long field302 = class302.method655();

    @ObfuscatedName("bb.am")
    public int field303;

    @ObfuscatedName("bb.ax")
    public int field304;

    @ObfuscatedName("bb.ah")
    public int field315;

    @ObfuscatedName("bb.as")
    public long field306 = 0L;

    @ObfuscatedName("bb.ay")
    public int field307 = 0;

    @ObfuscatedName("bb.aj")
    public int field308 = 0;

    @ObfuscatedName("bb.av")
    public int field310 = 0;

    @ObfuscatedName("bb.aw")
    public long field298 = 0L;

    @ObfuscatedName("bb.ak")
    public boolean field311 = true;

    @ObfuscatedName("bb.bd")
    public int field295 = 0;

    @ObfuscatedName("bb.by")
    public class50[] field316 = new class50[8];

    @ObfuscatedName("bb.bs")
    public class50[] field317 = new class50[8];

    @ObfuscatedName("ti.ax(IZII)V")
    public static final void method8181(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field294 = arg0;
        Statics.field309 = arg1;
        Statics.field297 = arg2;
    }

    @ObfuscatedName("ed.ah(Lgh;III)Lbb;")
    public static final class43 method2565(class172 arg0, int arg1, int arg2) {
        if (Statics.field294 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field2474.method313();
                var3.field299 = new int[256 * (Statics.field309 ? 2 : 1)];
                var3.field304 = arg2;
                var3.method334();
                var3.field303 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field303 > 16384) {
                    var3.field303 = 16384;
                }
                var3.method319(var3.field303);
                if (Statics.field297 > 0 && Statics.field118 == null) {
                    Statics.field118 = new class45();
                    Statics.field296 = Executors.newScheduledThreadPool(1);
                    Statics.field296.scheduleAtFixedRate(Statics.field118, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field118 != null) {
                    if (Statics.field118.field331[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field118.field331[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bb.as(Lbw;I)V")
    public final synchronized void method796(class50 arg0) {
        this.field300 = arg0;
    }

    @ObfuscatedName("bb.ay(B)V")
    public final synchronized void method806() {
        if (this.field299 == null) {
            return;
        }
        long var1 = class302.method655();
        try {
            if (this.field306 != 0L) {
                if (var1 < this.field306) {
                    return;
                }
                this.method319(this.field303);
                this.field306 = 0L;
                this.field311 = true;
            }
            int var3 = this.method322();
            if (this.field310 - var3 > this.field307) {
                this.field307 = this.field310 - var3;
            }
            int var4 = this.field315 + this.field304;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field303) {
                this.field303 += 1024;
                if (this.field303 > 16384) {
                    this.field303 = 16384;
                }
                this.method324();
                this.method319(this.field303);
                var3 = 0;
                this.field311 = true;
                if (var4 + 256 > this.field303) {
                    var4 = this.field303 - 256;
                    this.field315 = var4 - this.field304;
                }
            }
            while (var3 < var4) {
                this.method801(this.field299, 256);
                this.method323();
                var3 += 256;
            }
            if (var1 > this.field298) {
                if (this.field311) {
                    this.field311 = false;
                } else if (this.field307 == 0 && this.field308 == 0) {
                    this.method324();
                    this.field306 = var1 + 2000L;
                    return;
                } else {
                    this.field315 = Math.min(this.field308, this.field307);
                    this.field308 = this.field307;
                }
                this.field307 = 0;
                this.field298 = var1 + 2000L;
            }
            this.field310 = var3;
        } catch (Exception var8) {
            this.method324();
            this.field306 = var1 + 2000L;
        }
        try {
            if (var1 > this.field302 + 500000L) {
                var1 = this.field302;
            }
            while (var1 > this.field302 + 5000L) {
                this.method800(256);
                this.field302 += (long) (256000 / Statics.field294);
            }
        } catch (Exception var7) {
            this.field302 = var1;
        }
    }

    @ObfuscatedName("bb.aj(I)V")
    public final void method797() {
        this.field311 = true;
    }

    @ObfuscatedName("bb.av(B)V")
    public final synchronized void method805() {
        this.field311 = true;
        try {
            this.method325();
        } catch (Exception var2) {
            this.method324();
            this.field306 = class302.method655() + 2000L;
        }
    }

    @ObfuscatedName("bb.aw(B)V")
    public final synchronized void method799() {
        if (Statics.field118 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field118.field331[var2] == this) {
                    Statics.field118.field331[var2] = null;
                }
                if (Statics.field118.field331[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field296.shutdownNow();
                Statics.field296 = null;
                Statics.field118 = null;
            }
        }
        this.method324();
        this.field299 = null;
    }

    @ObfuscatedName("bb.ak(IB)V")
    public final void method800(int arg0) {
        this.field295 -= arg0;
        if (this.field295 < 0) {
            this.field295 = 0;
        }
        if (this.field300 != null) {
            this.field300.method716(arg0);
        }
    }

    @ObfuscatedName("bb.bh([II)V")
    public final void method801(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field309) {
            var3 = arg1 << 1;
        }
        class410.method7026(arg0, 0, var3);
        this.field295 -= arg1;
        if (this.field300 != null && this.field295 <= 0) {
            this.field295 += Statics.field294 >> 4;
            method461(this.field300);
            this.method802(this.field300, this.field300.method877());
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
                        class50 var11 = this.field316[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field374;
                                if (var12 == null || var12.field491 <= var8) {
                                    var11.field373 = true;
                                    int var13 = var11.method713();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field491 += var13;
                                    }
                                    if (var4 >= this.field301) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method720();
                                    if (var14 != null) {
                                        int var15 = var11.field372;
                                        while (var14 != null) {
                                            this.method802(var14, var15 * var14.method877() >> 8);
                                            var14 = var11.method712();
                                        }
                                    }
                                    class50 var16 = var11.field371;
                                    var11.field371 = null;
                                    if (var10 == null) {
                                        this.field316[var7] = var16;
                                    } else {
                                        var10.field371 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field317[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field371;
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
                class50 var18 = this.field316[var17];
                class50[] var19 = this.field316;
                this.field317[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field371;
                    var18.field371 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field295 < 0) {
            this.field295 = 0;
        }
        if (this.field300 != null) {
            this.field300.method714(arg0, 0, arg1);
        }
        this.field302 = class302.method655();
    }

    @ObfuscatedName("bd.bj(Lbw;I)V")
    public static final void method461(class50 arg0) {
        arg0.field373 = false;
        if (arg0.field374 != null) {
            arg0.field374.field491 = 0;
        }
        for (class50 var1 = arg0.method720(); var1 != null; var1 = arg0.method712()) {
            method461(var1);
        }
    }

    @ObfuscatedName("bb.bk(Lbw;II)V")
    public final void method802(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field317[var3];
        if (var4 == null) {
            this.field316[var3] = arg0;
        } else {
            var4.field371 = arg0;
        }
        this.field317[var3] = arg0;
        arg0.field372 = arg1;
    }

    @ObfuscatedName("bb.au(I)V")
    public void method334() throws Exception {
    }

    @ObfuscatedName("bb.ae(IB)V")
    public void method319(int arg0) throws Exception {
    }

    @ObfuscatedName("bb.ao(I)I")
    public int method322() throws Exception {
        return this.field303;
    }

    @ObfuscatedName("bb.at()V")
    public void method323() throws Exception {
    }

    @ObfuscatedName("bb.ac(I)V")
    public void method324() {
    }

    @ObfuscatedName("bb.ai(B)V")
    public void method325() throws Exception {
    }
}
