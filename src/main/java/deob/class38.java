package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ak")
public class class38 {

    @ObfuscatedName("ak.t")
    public int[] field253;

    @ObfuscatedName("ak.l")
    public class44 field272;

    @ObfuscatedName("ak.u")
    public int field255 = 32;

    @ObfuscatedName("ak.n")
    public long field256 = class398.method2381();

    @ObfuscatedName("ak.z")
    public int field257;

    @ObfuscatedName("ak.q")
    public int field265;

    @ObfuscatedName("ak.d")
    public int field259;

    @ObfuscatedName("ak.r")
    public long field260 = 0L;

    @ObfuscatedName("ak.m")
    public int field252 = 0;

    @ObfuscatedName("ak.c")
    public int field254 = 0;

    @ObfuscatedName("ak.f")
    public int field262 = 0;

    @ObfuscatedName("ak.h")
    public long field264 = 0L;

    @ObfuscatedName("ak.v")
    public boolean field258 = true;

    @ObfuscatedName("ak.ai")
    public int field268 = 0;

    @ObfuscatedName("ak.ah")
    public class44[] field269 = new class44[8];

    @ObfuscatedName("ak.as")
    public class44[] field270 = new class44[8];

    @ObfuscatedName("db.d(Lew;III)Lak;")
    public static final class38 method2383(class143 arg0, int arg1, int arg2) {
        if (Statics.field4360 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class38 var3 = Statics.field994.method354();
                var3.field253 = new int[256 * (Statics.field263 ? 2 : 1)];
                var3.field265 = arg2;
                var3.method367();
                var3.field257 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field257 > 16384) {
                    var3.field257 = 16384;
                }
                var3.method377(var3.field257);
                if (Statics.field273 > 0 && Statics.field1419 == null) {
                    Statics.field1419 = new class40();
                    Statics.field4219 = Executors.newScheduledThreadPool(1);
                    Statics.field4219.scheduleAtFixedRate(Statics.field1419, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1419 != null) {
                    if (Statics.field1419.field286[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1419.field286[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class38();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ak.r(Lav;I)V")
    public final synchronized void method717(class44 arg0) {
        this.field272 = arg0;
    }

    @ObfuscatedName("ak.m(I)V")
    public final synchronized void method710() {
        if (this.field253 == null) {
            return;
        }
        long var1 = class398.method2381();
        try {
            if (this.field260 != 0L) {
                if (var1 < this.field260) {
                    return;
                }
                this.method377(this.field257);
                this.field260 = 0L;
                this.field258 = true;
            }
            int var3 = this.method369();
            if (this.field262 - var3 > this.field252) {
                this.field252 = this.field262 - var3;
            }
            int var4 = this.field265 + this.field259;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field257) {
                this.field257 += 1024;
                if (this.field257 > 16384) {
                    this.field257 = 16384;
                }
                this.method371();
                this.method377(this.field257);
                var3 = 0;
                this.field258 = true;
                if (var4 + 256 > this.field257) {
                    var4 = this.field257 - 256;
                    this.field259 = var4 - this.field265;
                }
            }
            while (var3 < var4) {
                this.method707(this.field253, 256);
                this.method370();
                var3 += 256;
            }
            if (var1 > this.field264) {
                if (this.field258) {
                    this.field258 = false;
                } else if (this.field252 == 0 && this.field254 == 0) {
                    this.method371();
                    this.field260 = var1 + 2000L;
                    return;
                } else {
                    this.field259 = Math.min(this.field254, this.field252);
                    this.field254 = this.field252;
                }
                this.field252 = 0;
                this.field264 = var1 + 2000L;
            }
            this.field262 = var3;
        } catch (Exception var8) {
            this.method371();
            this.field260 = var1 + 2000L;
        }
        try {
            if (var1 > this.field256 + 500000L) {
                var1 = this.field256;
            }
            while (var1 > this.field256 + 5000L) {
                this.method706(256);
                this.field256 += (long) (256000 / Statics.field4360);
            }
        } catch (Exception var7) {
            this.field256 = var1;
        }
    }

    @ObfuscatedName("ak.c(I)V")
    public final void method726() {
        this.field258 = true;
    }

    @ObfuscatedName("ak.f(S)V")
    public final synchronized void method704() {
        this.field258 = true;
        try {
            this.method381();
        } catch (Exception var2) {
            this.method371();
            this.field260 = class398.method2381() + 2000L;
        }
    }

    @ObfuscatedName("ak.h(I)V")
    public final synchronized void method705() {
        if (Statics.field1419 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1419.field286[var2] == this) {
                    Statics.field1419.field286[var2] = null;
                }
                if (Statics.field1419.field286[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field4219.shutdownNow();
                Statics.field4219 = null;
                Statics.field1419 = null;
            }
        }
        this.method371();
        this.field253 = null;
    }

    @ObfuscatedName("ak.v(II)V")
    public final void method706(int arg0) {
        this.field268 -= arg0;
        if (this.field268 < 0) {
            this.field268 = 0;
        }
        if (this.field272 != null) {
            this.field272.method631(arg0);
        }
    }

    @ObfuscatedName("ak.ag([II)V")
    public final void method707(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field263) {
            var3 = arg1 << 1;
        }
        class322.method5339(arg0, 0, var3);
        this.field268 -= arg1;
        if (this.field272 != null && this.field268 <= 0) {
            this.field268 += Statics.field4360 >> 4;
            method2749(this.field272);
            this.method708(this.field272, this.field272.method828());
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
                        class44 var11 = this.field269[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class54 var12 = var11.field323;
                                if (var12 == null || var12.field415 <= var8) {
                                    var11.field324 = true;
                                    int var13 = var11.method628();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field415 += var13;
                                    }
                                    if (var4 >= this.field255) {
                                        break label105;
                                    }
                                    class44 var14 = var11.method626();
                                    if (var14 != null) {
                                        int var15 = var11.field321;
                                        while (var14 != null) {
                                            this.method708(var14, var15 * var14.method828() >> 8);
                                            var14 = var11.method627();
                                        }
                                    }
                                    class44 var16 = var11.field322;
                                    var11.field322 = null;
                                    if (var10 == null) {
                                        this.field269[var7] = var16;
                                    } else {
                                        var10.field322 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field270[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field322;
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
                class44 var18 = this.field269[var17];
                class44[] var19 = this.field269;
                this.field270[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class44 var21 = var18.field322;
                    var18.field322 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field268 < 0) {
            this.field268 = 0;
        }
        if (this.field272 != null) {
            this.field272.method640(arg0, 0, arg1);
        }
        this.field256 = class398.method2381();
    }

    @ObfuscatedName("es.ae(Lav;B)V")
    public static final void method2749(class44 arg0) {
        arg0.field324 = false;
        if (arg0.field323 != null) {
            arg0.field323.field415 = 0;
        }
        for (class44 var1 = arg0.method626(); var1 != null; var1 = arg0.method627()) {
            method2749(var1);
        }
    }

    @ObfuscatedName("ak.aq(Lav;IS)V")
    public final void method708(class44 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class44 var4 = this.field270[var3];
        if (var4 == null) {
            this.field269[var3] = arg0;
        } else {
            var4.field322 = arg0;
        }
        this.field270[var3] = arg0;
        arg0.field321 = arg1;
    }

    @ObfuscatedName("ak.i(B)V")
    public void method367() throws Exception {
    }

    @ObfuscatedName("ak.w(II)V")
    public void method377(int arg0) throws Exception {
    }

    @ObfuscatedName("ak.s(I)I")
    public int method369() throws Exception {
        return this.field257;
    }

    @ObfuscatedName("ak.a()V")
    public void method370() throws Exception {
    }

    @ObfuscatedName("ak.o(I)V")
    public void method371() {
    }

    @ObfuscatedName("ak.g(B)V")
    public void method381() throws Exception {
    }
}
