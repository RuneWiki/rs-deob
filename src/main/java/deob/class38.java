package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ay")
public class class38 {

    @ObfuscatedName("ay.k")
    public int[] field289;

    @ObfuscatedName("ay.d")
    public class44 field275;

    @ObfuscatedName("ay.m")
    public int field293 = 32;

    @ObfuscatedName("ay.u")
    public long field277 = class270.method2724();

    @ObfuscatedName("ay.t")
    public int field279;

    @ObfuscatedName("ay.g")
    public int field290;

    @ObfuscatedName("ay.x")
    public int field280;

    @ObfuscatedName("ay.a")
    public long field281 = 0L;

    @ObfuscatedName("ay.y")
    public int field282 = 0;

    @ObfuscatedName("ay.j")
    public int field276 = 0;

    @ObfuscatedName("ay.e")
    public int field284 = 0;

    @ObfuscatedName("ay.z")
    public long field285 = 0L;

    @ObfuscatedName("ay.h")
    public boolean field286 = true;

    @ObfuscatedName("ay.ao")
    public int field278 = 0;

    @ObfuscatedName("ay.aj")
    public class44[] field273 = new class44[8];

    @ObfuscatedName("ay.al")
    public class44[] field291 = new class44[8];

    @ObfuscatedName("cm.y(IZIB)V")
    public static final void method1990(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field269 = arg0;
        Statics.field271 = arg1;
        Statics.field296 = arg2;
    }

    @ObfuscatedName("kg.j(Lff;III)Lay;")
    public static final class38 method4973(class157 arg0, int arg1, int arg2) {
        if (Statics.field269 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class38 var3 = Statics.field4332.method349();
                var3.field289 = new int[(Statics.field271 ? 2 : 1) * 256];
                var3.field290 = arg2;
                var3.method357();
                var3.field279 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field279 > 16384) {
                    var3.field279 = 16384;
                }
                var3.method358(var3.field279);
                if (Statics.field296 > 0 && Statics.field12 == null) {
                    Statics.field12 = new class40();
                    Statics.field2405 = Executors.newScheduledThreadPool(1);
                    Statics.field2405.scheduleAtFixedRate(Statics.field12, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field12 != null) {
                    if (Statics.field12.field311[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field12.field311[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class38();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ay.e(Laf;I)V")
    public final synchronized void method683(class44 arg0) {
        this.field275 = arg0;
    }

    @ObfuscatedName("ay.z(I)V")
    public final synchronized void method684() {
        if (this.field289 == null) {
            return;
        }
        long var1 = class270.method2724();
        try {
            if (this.field281 != 0L) {
                if (var1 < this.field281) {
                    return;
                }
                this.method358(this.field279);
                this.field281 = 0L;
                this.field286 = true;
            }
            int var3 = this.method370();
            if (this.field284 - var3 > this.field282) {
                this.field282 = this.field284 - var3;
            }
            int var4 = this.field290 + this.field280;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field279) {
                this.field279 += 1024;
                if (this.field279 > 16384) {
                    this.field279 = 16384;
                }
                this.method356();
                this.method358(this.field279);
                var3 = 0;
                this.field286 = true;
                if (var4 + 256 > this.field279) {
                    var4 = this.field279 - 256;
                    this.field280 = var4 - this.field290;
                }
            }
            while (var3 < var4) {
                this.method689(this.field289, 256);
                this.method360();
                var3 += 256;
            }
            if (var1 > this.field285) {
                if (this.field286) {
                    this.field286 = false;
                } else if (this.field282 == 0 && this.field276 == 0) {
                    this.method356();
                    this.field281 = var1 + 2000L;
                    return;
                } else {
                    this.field280 = Math.min(this.field276, this.field282);
                    this.field276 = this.field282;
                }
                this.field282 = 0;
                this.field285 = var1 + 2000L;
            }
            this.field284 = var3;
        } catch (Exception var8) {
            this.method356();
            this.field281 = var1 + 2000L;
        }
        try {
            if (var1 > this.field277 + 500000L) {
                var1 = this.field277;
            }
            while (var1 > this.field277 + 5000L) {
                this.method708(256);
                this.field277 += (long) (256000 / Statics.field269);
            }
        } catch (Exception var7) {
            this.field277 = var1;
        }
    }

    @ObfuscatedName("ay.h(I)V")
    public final void method685() {
        this.field286 = true;
    }

    @ObfuscatedName("ay.ae(I)V")
    public final synchronized void method686() {
        this.field286 = true;
        try {
            this.method371();
        } catch (Exception var2) {
            this.method356();
            this.field281 = class270.method2724() + 2000L;
        }
    }

    @ObfuscatedName("ay.aq(B)V")
    public final synchronized void method687() {
        if (Statics.field12 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field12.field311[var2] == this) {
                    Statics.field12.field311[var2] = null;
                }
                if (Statics.field12.field311[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2405.shutdownNow();
                Statics.field2405 = null;
                Statics.field12 = null;
            }
        }
        this.method356();
        this.field289 = null;
    }

    @ObfuscatedName("ay.aw(IS)V")
    public final void method708(int arg0) {
        this.field278 -= arg0;
        if (this.field278 < 0) {
            this.field278 = 0;
        }
        if (this.field275 != null) {
            this.field275.method620(arg0);
        }
    }

    @ObfuscatedName("ay.am([II)V")
    public final void method689(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field271) {
            var3 = arg1 << 1;
        }
        class351.method5925(arg0, 0, var3);
        this.field278 -= arg1;
        if (this.field275 != null && this.field278 <= 0) {
            this.field278 += Statics.field269 >> 4;
            method5197(this.field275);
            this.method690(this.field275, this.field275.method763());
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
                        class44 var11 = this.field273[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class54 var12 = var11.field345;
                                if (var12 == null || var12.field441 <= var8) {
                                    var11.field343 = true;
                                    int var13 = var11.method617();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field441 += var13;
                                    }
                                    if (var4 >= this.field293) {
                                        break label105;
                                    }
                                    class44 var14 = var11.method615();
                                    if (var14 != null) {
                                        int var15 = var11.field344;
                                        while (var14 != null) {
                                            this.method690(var14, var15 * var14.method763() >> 8);
                                            var14 = var11.method616();
                                        }
                                    }
                                    class44 var16 = var11.field346;
                                    var11.field346 = null;
                                    if (var10 == null) {
                                        this.field273[var7] = var16;
                                    } else {
                                        var10.field346 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field291[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field346;
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
                class44 var18 = this.field273[var17];
                class44[] var19 = this.field273;
                this.field291[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class44 var21 = var18.field346;
                    var18.field346 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field278 < 0) {
            this.field278 = 0;
        }
        if (this.field275 != null) {
            this.field275.method618(arg0, 0, arg1);
        }
        this.field277 = class270.method2724();
    }

    @ObfuscatedName("kw.ak(Laf;I)V")
    public static final void method5197(class44 arg0) {
        arg0.field343 = false;
        if (arg0.field345 != null) {
            arg0.field345.field441 = 0;
        }
        for (class44 var1 = arg0.method615(); var1 != null; var1 = arg0.method616()) {
            method5197(var1);
        }
    }

    @ObfuscatedName("ay.ao(Laf;IS)V")
    public final void method690(class44 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class44 var4 = this.field291[var3];
        if (var4 == null) {
            this.field273[var3] = arg0;
        } else {
            var4.field346 = arg0;
        }
        this.field291[var3] = arg0;
        arg0.field344 = arg1;
    }

    @ObfuscatedName("ay.v(I)V")
    public void method357() throws Exception {
    }

    @ObfuscatedName("ay.c(II)V")
    public void method358(int arg0) throws Exception {
    }

    @ObfuscatedName("ay.i(I)I")
    public int method370() throws Exception {
        return this.field279;
    }

    @ObfuscatedName("ay.f()V")
    public void method360() throws Exception {
    }

    @ObfuscatedName("ay.b(I)V")
    public void method356() {
    }

    @ObfuscatedName("ay.n(I)V")
    public void method371() throws Exception {
    }
}
