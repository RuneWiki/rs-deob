package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("aq")
public class class38 {

    @ObfuscatedName("aq.v")
    public int[] field268;

    @ObfuscatedName("aq.s")
    public class44 field269;

    @ObfuscatedName("aq.c")
    public int field270 = 32;

    @ObfuscatedName("aq.b")
    public long field271 = class398.method2299();

    @ObfuscatedName("aq.x")
    public int field272;

    @ObfuscatedName("aq.p")
    public int field273;

    @ObfuscatedName("aq.z")
    public int field266;

    @ObfuscatedName("aq.h")
    public long field275 = 0L;

    @ObfuscatedName("aq.o")
    public int field276 = 0;

    @ObfuscatedName("aq.r")
    public int field263 = 0;

    @ObfuscatedName("aq.n")
    public int field278 = 0;

    @ObfuscatedName("aq.u")
    public long field279 = 0L;

    @ObfuscatedName("aq.d")
    public boolean field267 = true;

    @ObfuscatedName("aq.ay")
    public int field282 = 0;

    @ObfuscatedName("aq.al")
    public class44[] field287 = new class44[8];

    @ObfuscatedName("aq.ao")
    public class44[] field283 = new class44[8];

    @ObfuscatedName("fn.h(Lew;IIS)Laq;")
    public static final class38 method2939(class143 arg0, int arg1, int arg2) {
        if (Statics.field280 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class38 var3 = Statics.field848.method363();
                var3.field268 = new int[(Statics.field274 ? 2 : 1) * 256];
                var3.field273 = arg2;
                var3.method378();
                var3.field272 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field272 > 16384) {
                    var3.field272 = 16384;
                }
                var3.method377(var3.field272);
                if (Statics.field284 > 0 && Statics.field2378 == null) {
                    Statics.field2378 = new class40();
                    Statics.field277 = Executors.newScheduledThreadPool(1);
                    Statics.field277.scheduleAtFixedRate(Statics.field2378, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2378 != null) {
                    if (Statics.field2378.field305[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2378.field305[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class38();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("aq.o(Lav;I)V")
    public final synchronized void method687(class44 arg0) {
        this.field269 = arg0;
    }

    @ObfuscatedName("aq.r(I)V")
    public final synchronized void method704() {
        if (this.field268 == null) {
            return;
        }
        long var1 = class398.method2299();
        try {
            if (this.field275 != 0L) {
                if (var1 < this.field275) {
                    return;
                }
                this.method377(this.field272);
                this.field275 = 0L;
                this.field267 = true;
            }
            int var3 = this.method387();
            if (this.field278 - var3 > this.field276) {
                this.field276 = this.field278 - var3;
            }
            int var4 = this.field273 + this.field266;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field272) {
                this.field272 += 1024;
                if (this.field272 > 16384) {
                    this.field272 = 16384;
                }
                this.method381();
                this.method377(this.field272);
                var3 = 0;
                this.field267 = true;
                if (var4 + 256 > this.field272) {
                    var4 = this.field272 - 256;
                    this.field266 = var4 - this.field273;
                }
            }
            while (var3 < var4) {
                this.method688(this.field268, 256);
                this.method380();
                var3 += 256;
            }
            if (var1 > this.field279) {
                if (this.field267) {
                    this.field267 = false;
                } else if (this.field276 == 0 && this.field263 == 0) {
                    this.method381();
                    this.field275 = var1 + 2000L;
                    return;
                } else {
                    this.field266 = Math.min(this.field263, this.field276);
                    this.field263 = this.field276;
                }
                this.field276 = 0;
                this.field279 = var1 + 2000L;
            }
            this.field278 = var3;
        } catch (Exception var8) {
            this.method381();
            this.field275 = var1 + 2000L;
        }
        try {
            if (var1 > this.field271 + 500000L) {
                var1 = this.field271;
            }
            while (var1 > this.field271 + 5000L) {
                this.method692(256);
                this.field271 += (long) (256000 / Statics.field280);
            }
        } catch (Exception var7) {
            this.field271 = var1;
        }
    }

    @ObfuscatedName("aq.n(I)V")
    public final void method689() {
        this.field267 = true;
    }

    @ObfuscatedName("aq.u(I)V")
    public final synchronized void method696() {
        this.field267 = true;
        try {
            this.method383();
        } catch (Exception var2) {
            this.method381();
            this.field275 = class398.method2299() + 2000L;
        }
    }

    @ObfuscatedName("aq.d(I)V")
    public final synchronized void method691() {
        if (Statics.field2378 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2378.field305[var2] == this) {
                    Statics.field2378.field305[var2] = null;
                }
                if (Statics.field2378.field305[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field277.shutdownNow();
                Statics.field277 = null;
                Statics.field2378 = null;
            }
        }
        this.method381();
        this.field268 = null;
    }

    @ObfuscatedName("aq.ab(II)V")
    public final void method692(int arg0) {
        this.field282 -= arg0;
        if (this.field282 < 0) {
            this.field282 = 0;
        }
        if (this.field269 != null) {
            this.field269.method613(arg0);
        }
    }

    @ObfuscatedName("aq.ad([II)V")
    public final void method688(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field274) {
            var3 = arg1 << 1;
        }
        class322.method5370(arg0, 0, var3);
        this.field282 -= arg1;
        if (this.field269 != null && this.field282 <= 0) {
            this.field282 += Statics.field280 >> 4;
            method154(this.field269);
            this.method695(this.field269, this.field269.method842());
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
                        class44 var10 = null;
                        class44 var11 = this.field287[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class54 var12 = var11.field337;
                                if (var12 == null || var12.field431 <= var8) {
                                    var11.field335 = true;
                                    int var13 = var11.method624();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field431 += var13;
                                    }
                                    if (var4 >= this.field270) {
                                        break label105;
                                    }
                                    class44 var14 = var11.method615();
                                    if (var14 != null) {
                                        int var15 = var11.field336;
                                        while (var14 != null) {
                                            this.method695(var14, var15 * var14.method842() >> 8);
                                            var14 = var11.method616();
                                        }
                                    }
                                    class44 var16 = var11.field338;
                                    var11.field338 = null;
                                    if (var10 == null) {
                                        this.field287[var7] = var16;
                                    } else {
                                        var10.field338 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field283[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field338;
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
                class44 var18 = this.field287[var17];
                class44[] var19 = this.field287;
                this.field283[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class44 var21 = var18.field338;
                    var18.field338 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field282 < 0) {
            this.field282 = 0;
        }
        if (this.field269 != null) {
            this.field269.method618(arg0, 0, arg1);
        }
        this.field271 = class398.method2299();
    }

    @ObfuscatedName("g.as(Lav;I)V")
    public static final void method154(class44 arg0) {
        arg0.field335 = false;
        if (arg0.field337 != null) {
            arg0.field337.field431 = 0;
        }
        for (class44 var1 = arg0.method615(); var1 != null; var1 = arg0.method616()) {
            method154(var1);
        }
    }

    @ObfuscatedName("aq.ak(Lav;II)V")
    public final void method695(class44 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class44 var4 = this.field283[var3];
        if (var4 == null) {
            this.field287[var3] = arg0;
        } else {
            var4.field338 = arg0;
        }
        this.field283[var3] = arg0;
        arg0.field336 = arg1;
    }

    @ObfuscatedName("aq.l(I)V")
    public void method378() throws Exception {
    }

    @ObfuscatedName("aq.q(IB)V")
    public void method377(int arg0) throws Exception {
    }

    @ObfuscatedName("aq.f(I)I")
    public int method387() throws Exception {
        return this.field272;
    }

    @ObfuscatedName("aq.j()V")
    public void method380() throws Exception {
    }

    @ObfuscatedName("aq.m(I)V")
    public void method381() {
    }

    @ObfuscatedName("aq.k(B)V")
    public void method383() throws Exception {
    }
}
