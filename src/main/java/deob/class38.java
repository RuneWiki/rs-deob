package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ab")
public class class38 {

    @ObfuscatedName("ab.f")
    public int[] field270;

    @ObfuscatedName("ab.s")
    public class44 field271;

    @ObfuscatedName("ab.h")
    public int field272 = 32;

    @ObfuscatedName("ab.d")
    public long field273 = class397.method3986();

    @ObfuscatedName("ab.q")
    public int field283;

    @ObfuscatedName("ab.j")
    public int field275;

    @ObfuscatedName("ab.x")
    public int field276;

    @ObfuscatedName("ab.b")
    public long field277 = 0L;

    @ObfuscatedName("ab.t")
    public int field278 = 0;

    @ObfuscatedName("ab.r")
    public int field279 = 0;

    @ObfuscatedName("ab.p")
    public int field267 = 0;

    @ObfuscatedName("ab.w")
    public long field268 = 0L;

    @ObfuscatedName("ab.i")
    public boolean field282 = true;

    @ObfuscatedName("ab.at")
    public int field287 = 0;

    @ObfuscatedName("ab.as")
    public class44[] field284 = new class44[8];

    @ObfuscatedName("ab.ae")
    public class44[] field285 = new class44[8];

    @ObfuscatedName("ca.b(Lac;I)V")
    public static final void method2243(class46 arg0) {
        Statics.field1223 = arg0;
    }

    @ObfuscatedName("dl.t(Lei;III)Lab;")
    public static final class38 method2354(class143 arg0, int arg1, int arg2) {
        if (Statics.field3288 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class38 var3 = Statics.field1223.method356();
                var3.field270 = new int[(Statics.field274 ? 2 : 1) * 256];
                var3.field275 = arg2;
                var3.method373();
                var3.field283 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field283 > 16384) {
                    var3.field283 = 16384;
                }
                var3.method374(var3.field283);
                if (Statics.field269 > 0 && Statics.field3012 == null) {
                    Statics.field3012 = new class40();
                    Statics.field280 = Executors.newScheduledThreadPool(1);
                    Statics.field280.scheduleAtFixedRate(Statics.field3012, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3012 != null) {
                    if (Statics.field3012.field303[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3012.field303[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class38();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ab.r(Lap;B)V")
    public final synchronized void method723(class44 arg0) {
        this.field271 = arg0;
    }

    @ObfuscatedName("ab.p(I)V")
    public final synchronized void method702() {
        if (this.field270 == null) {
            return;
        }
        long var1 = class397.method3986();
        try {
            if (this.field277 != 0L) {
                if (var1 < this.field277) {
                    return;
                }
                this.method374(this.field283);
                this.field277 = 0L;
                this.field282 = true;
            }
            int var3 = this.method375();
            if (this.field267 - var3 > this.field278) {
                this.field278 = this.field267 - var3;
            }
            int var4 = this.field276 + this.field275;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field283) {
                this.field283 += 1024;
                if (this.field283 > 16384) {
                    this.field283 = 16384;
                }
                this.method377();
                this.method374(this.field283);
                var3 = 0;
                this.field282 = true;
                if (var4 + 256 > this.field283) {
                    var4 = this.field283 - 256;
                    this.field276 = var4 - this.field275;
                }
            }
            while (var3 < var4) {
                this.method727(this.field270, 256);
                this.method381();
                var3 += 256;
            }
            if (var1 > this.field268) {
                if (this.field282) {
                    this.field282 = false;
                } else if (this.field278 == 0 && this.field279 == 0) {
                    this.method377();
                    this.field277 = var1 + 2000L;
                    return;
                } else {
                    this.field276 = Math.min(this.field279, this.field278);
                    this.field279 = this.field278;
                }
                this.field278 = 0;
                this.field268 = var1 + 2000L;
            }
            this.field267 = var3;
        } catch (Exception var8) {
            this.method377();
            this.field277 = var1 + 2000L;
        }
        try {
            if (var1 > this.field273 + 500000L) {
                var1 = this.field273;
            }
            while (var1 > this.field273 + 5000L) {
                this.method706(256);
                this.field273 += (long) (256000 / Statics.field3288);
            }
        } catch (Exception var7) {
            this.field273 = var1;
        }
    }

    @ObfuscatedName("ab.w(I)V")
    public final void method703() {
        this.field282 = true;
    }

    @ObfuscatedName("ab.i(I)V")
    public final synchronized void method709() {
        this.field282 = true;
        try {
            this.method378();
        } catch (Exception var2) {
            this.method377();
            this.field277 = class397.method3986() + 2000L;
        }
    }

    @ObfuscatedName("ab.aq(I)V")
    public final synchronized void method705() {
        if (Statics.field3012 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3012.field303[var2] == this) {
                    Statics.field3012.field303[var2] = null;
                }
                if (Statics.field3012.field303[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field280.shutdownNow();
                Statics.field280 = null;
                Statics.field3012 = null;
            }
        }
        this.method377();
        this.field270 = null;
    }

    @ObfuscatedName("ab.ad(II)V")
    public final void method706(int arg0) {
        this.field287 -= arg0;
        if (this.field287 < 0) {
            this.field287 = 0;
        }
        if (this.field271 != null) {
            this.field271.method641(arg0);
        }
    }

    @ObfuscatedName("ab.al([II)V")
    public final void method727(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field274) {
            var3 = arg1 << 1;
        }
        class322.method5305(arg0, 0, var3);
        this.field287 -= arg1;
        if (this.field271 != null && this.field287 <= 0) {
            this.field287 += Statics.field3288 >> 4;
            method2679(this.field271);
            this.method708(this.field271, this.field271.method771());
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
                        class44 var11 = this.field284[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class54 var12 = var11.field334;
                                if (var12 == null || var12.field433 <= var8) {
                                    var11.field337 = true;
                                    int var13 = var11.method614();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field433 += var13;
                                    }
                                    if (var4 >= this.field272) {
                                        break label105;
                                    }
                                    class44 var14 = var11.method612();
                                    if (var14 != null) {
                                        int var15 = var11.field336;
                                        while (var14 != null) {
                                            this.method708(var14, var15 * var14.method771() >> 8);
                                            var14 = var11.method613();
                                        }
                                    }
                                    class44 var16 = var11.field335;
                                    var11.field335 = null;
                                    if (var10 == null) {
                                        this.field284[var7] = var16;
                                    } else {
                                        var10.field335 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field285[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field335;
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
                class44 var18 = this.field284[var17];
                class44[] var19 = this.field284;
                this.field285[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class44 var21 = var18.field335;
                    var18.field335 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field287 < 0) {
            this.field287 = 0;
        }
        if (this.field271 != null) {
            this.field271.method615(arg0, 0, arg1);
        }
        this.field273 = class397.method3986();
    }

    @ObfuscatedName("fo.aa(Lap;I)V")
    public static final void method2679(class44 arg0) {
        arg0.field337 = false;
        if (arg0.field334 != null) {
            arg0.field334.field433 = 0;
        }
        for (class44 var1 = arg0.method612(); var1 != null; var1 = arg0.method613()) {
            method2679(var1);
        }
    }

    @ObfuscatedName("ab.aw(Lap;IB)V")
    public final void method708(class44 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class44 var4 = this.field285[var3];
        if (var4 == null) {
            this.field284[var3] = arg0;
        } else {
            var4.field335 = arg0;
        }
        this.field285[var3] = arg0;
        arg0.field336 = arg1;
    }

    @ObfuscatedName("ab.n(B)V")
    public void method373() throws Exception {
    }

    @ObfuscatedName("ab.c(IB)V")
    public void method374(int arg0) throws Exception {
    }

    @ObfuscatedName("ab.m(B)I")
    public int method375() throws Exception {
        return this.field283;
    }

    @ObfuscatedName("ab.k()V")
    public void method381() throws Exception {
    }

    @ObfuscatedName("ab.o(B)V")
    public void method377() {
    }

    @ObfuscatedName("ab.g(I)V")
    public void method378() throws Exception {
    }
}
