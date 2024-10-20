package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ar")
public class class40 {

    @ObfuscatedName("ar.r")
    public int[] field278;

    @ObfuscatedName("ar.u")
    public class46 field280;

    @ObfuscatedName("ar.k")
    public int field275 = 32;

    @ObfuscatedName("ar.h")
    public long field281 = class269.method2567();

    @ObfuscatedName("ar.x")
    public int field282;

    @ObfuscatedName("ar.l")
    public int field283;

    @ObfuscatedName("ar.a")
    public int field284;

    @ObfuscatedName("ar.p")
    public long field285 = 0L;

    @ObfuscatedName("ar.b")
    public int field286 = 0;

    @ObfuscatedName("ar.n")
    public int field287 = 0;

    @ObfuscatedName("ar.o")
    public int field297 = 0;

    @ObfuscatedName("ar.m")
    public long field289 = 0L;

    @ObfuscatedName("ar.d")
    public boolean field294 = true;

    @ObfuscatedName("ar.ap")
    public int field292 = 0;

    @ObfuscatedName("ar.ac")
    public class46[] field290 = new class46[8];

    @ObfuscatedName("ar.ae")
    public class46[] field293 = new class46[8];

    @ObfuscatedName("eb.n(Law;I)V")
    public static final void method2711(class48 arg0) {
        Statics.field2619 = arg0;
    }

    @ObfuscatedName("fi.o(IZII)V")
    public static final void method3119(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field288 = arg0;
        Statics.field1414 = arg1;
        Statics.field1213 = arg2;
    }

    @ObfuscatedName("np.m(Lfr;IIS)Lar;")
    public static final class40 method6222(class157 arg0, int arg1, int arg2) {
        if (Statics.field288 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class40 var3 = Statics.field2619.method301();
                var3.field278 = new int[256 * (Statics.field1414 ? 2 : 1)];
                var3.field283 = arg2;
                var3.method338();
                var3.field282 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field282 > 16384) {
                    var3.field282 = 16384;
                }
                var3.method321(var3.field282);
                if (Statics.field1213 > 0 && Statics.field277 == null) {
                    Statics.field277 = new class42();
                    Statics.field276 = Executors.newScheduledThreadPool(1);
                    Statics.field276.scheduleAtFixedRate(Statics.field277, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field277 != null) {
                    if (Statics.field277.field311[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field277.field311[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class40();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ar.d(Laz;I)V")
    public final synchronized void method660(class46 arg0) {
        this.field280 = arg0;
    }

    @ObfuscatedName("ar.ad(I)V")
    public final synchronized void method661() {
        if (this.field278 == null) {
            return;
        }
        long var1 = class269.method2567();
        try {
            if (this.field285 != 0L) {
                if (var1 < this.field285) {
                    return;
                }
                this.method321(this.field282);
                this.field285 = 0L;
                this.field294 = true;
            }
            int var3 = this.method324();
            if (this.field297 - var3 > this.field286) {
                this.field286 = this.field297 - var3;
            }
            int var4 = this.field284 + this.field283;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field282) {
                this.field282 += 1024;
                if (this.field282 > 16384) {
                    this.field282 = 16384;
                }
                this.method327();
                this.method321(this.field282);
                var3 = 0;
                this.field294 = true;
                if (var4 + 256 > this.field282) {
                    var4 = this.field282 - 256;
                    this.field284 = var4 - this.field283;
                }
            }
            while (var3 < var4) {
                this.method666(this.field278, 256);
                this.method320();
                var3 += 256;
            }
            if (var1 > this.field289) {
                if (this.field294) {
                    this.field294 = false;
                } else if (this.field286 == 0 && this.field287 == 0) {
                    this.method327();
                    this.field285 = var1 + 2000L;
                    return;
                } else {
                    this.field284 = Math.min(this.field287, this.field286);
                    this.field287 = this.field286;
                }
                this.field286 = 0;
                this.field289 = var1 + 2000L;
            }
            this.field297 = var3;
        } catch (Exception var8) {
            this.method327();
            this.field285 = var1 + 2000L;
        }
        try {
            if (var1 > this.field281 + 500000L) {
                var1 = this.field281;
            }
            while (var1 > this.field281 + 5000L) {
                this.method665(256);
                this.field281 += (long) (256000 / Statics.field288);
            }
        } catch (Exception var7) {
            this.field281 = var1;
        }
    }

    @ObfuscatedName("ar.ak(I)V")
    public final void method688() {
        this.field294 = true;
    }

    @ObfuscatedName("ar.al(I)V")
    public final synchronized void method670() {
        this.field294 = true;
        try {
            this.method325();
        } catch (Exception var2) {
            this.method327();
            this.field285 = class269.method2567() + 2000L;
        }
    }

    @ObfuscatedName("ar.ao(B)V")
    public final synchronized void method664() {
        if (Statics.field277 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field277.field311[var2] == this) {
                    Statics.field277.field311[var2] = null;
                }
                if (Statics.field277.field311[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field276.shutdownNow();
                Statics.field276 = null;
                Statics.field277 = null;
            }
        }
        this.method327();
        this.field278 = null;
    }

    @ObfuscatedName("ar.ab(II)V")
    public final void method665(int arg0) {
        this.field292 -= arg0;
        if (this.field292 < 0) {
            this.field292 = 0;
        }
        if (this.field280 != null) {
            this.field280.method586(arg0);
        }
    }

    @ObfuscatedName("ar.ap([II)V")
    public final void method666(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1414) {
            var3 = arg1 << 1;
        }
        class351.method5895(arg0, 0, var3);
        this.field292 -= arg1;
        if (this.field280 != null && this.field292 <= 0) {
            this.field292 += Statics.field288 >> 4;
            method5508(this.field280);
            this.method667(this.field280, this.field280.method745());
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
                        class46 var10 = null;
                        class46 var11 = this.field290[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class56 var12 = var11.field348;
                                if (var12 == null || var12.field443 <= var8) {
                                    var11.field349 = true;
                                    int var13 = var11.method583();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field443 += var13;
                                    }
                                    if (var4 >= this.field275) {
                                        break label105;
                                    }
                                    class46 var14 = var11.method581();
                                    if (var14 != null) {
                                        int var15 = var11.field347;
                                        while (var14 != null) {
                                            this.method667(var14, var15 * var14.method745() >> 8);
                                            var14 = var11.method606();
                                        }
                                    }
                                    class46 var16 = var11.field350;
                                    var11.field350 = null;
                                    if (var10 == null) {
                                        this.field290[var7] = var16;
                                    } else {
                                        var10.field350 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field293[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field350;
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
                class46 var18 = this.field290[var17];
                class46[] var19 = this.field290;
                this.field293[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class46 var21 = var18.field350;
                    var18.field350 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field292 < 0) {
            this.field292 = 0;
        }
        if (this.field280 != null) {
            this.field280.method584(arg0, 0, arg1);
        }
        this.field281 = class269.method2567();
    }

    @ObfuscatedName("lb.ac(Laz;B)V")
    public static final void method5508(class46 arg0) {
        arg0.field349 = false;
        if (arg0.field348 != null) {
            arg0.field348.field443 = 0;
        }
        for (class46 var1 = arg0.method581(); var1 != null; var1 = arg0.method606()) {
            method5508(var1);
        }
    }

    @ObfuscatedName("ar.ae(Laz;II)V")
    public final void method667(class46 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class46 var4 = this.field293[var3];
        if (var4 == null) {
            this.field290[var3] = arg0;
        } else {
            var4.field350 = arg0;
        }
        this.field293[var3] = arg0;
        arg0.field347 = arg1;
    }

    @ObfuscatedName("ar.c(I)V")
    public void method338() throws Exception {
    }

    @ObfuscatedName("ar.v(II)V")
    public void method321(int arg0) throws Exception {
    }

    @ObfuscatedName("ar.q(I)I")
    public int method324() throws Exception {
        return this.field282;
    }

    @ObfuscatedName("ar.f()V")
    public void method320() throws Exception {
    }

    @ObfuscatedName("ar.j(B)V")
    public void method327() {
    }

    @ObfuscatedName("ar.e(B)V")
    public void method325() throws Exception {
    }
}
