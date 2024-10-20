package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ar")
public class class40 {

    @ObfuscatedName("ar.h")
    public int[] field283;

    @ObfuscatedName("ar.g")
    public class46 field284;

    @ObfuscatedName("ar.e")
    public int field285 = 32;

    @ObfuscatedName("ar.a")
    public long field298 = class416.method5860();

    @ObfuscatedName("ar.u")
    public int field287;

    @ObfuscatedName("ar.k")
    public int field299;

    @ObfuscatedName("ar.f")
    public int field289;

    @ObfuscatedName("ar.l")
    public long field281 = 0L;

    @ObfuscatedName("ar.q")
    public int field291 = 0;

    @ObfuscatedName("ar.x")
    public int field292 = 0;

    @ObfuscatedName("ar.z")
    public int field293 = 0;

    @ObfuscatedName("ar.i")
    public long field294 = 0L;

    @ObfuscatedName("ar.y")
    public boolean field295 = true;

    @ObfuscatedName("ar.am")
    public int field296 = 0;

    @ObfuscatedName("ar.az")
    public class46[] field297 = new class46[8];

    @ObfuscatedName("ar.au")
    public class46[] field286 = new class46[8];

    @ObfuscatedName("eu.x(Law;I)V")
    public static final void method2617(class48 arg0) {
        Statics.field64 = arg0;
    }

    @ObfuscatedName("t.z(Leb;III)Lar;")
    public static final class40 method26(class153 arg0, int arg1, int arg2) {
        if (Statics.field4059 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class40 var3 = Statics.field64.method384();
                var3.field283 = new int[256 * (Statics.field3178 ? 2 : 1)];
                var3.field299 = arg2;
                var3.method402();
                var3.field287 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field287 > 16384) {
                    var3.field287 = 16384;
                }
                var3.method403(var3.field287);
                if (Statics.field1340 > 0 && Statics.field282 == null) {
                    Statics.field282 = new class42();
                    Statics.field288 = Executors.newScheduledThreadPool(1);
                    Statics.field288.scheduleAtFixedRate(Statics.field282, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field282 != null) {
                    if (Statics.field282.field313[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field282.field313[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class40();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ar.i(Lai;I)V")
    public final synchronized void method735(class46 arg0) {
        this.field284 = arg0;
    }

    @ObfuscatedName("ar.y(I)V")
    public final synchronized void method762() {
        if (this.field283 == null) {
            return;
        }
        long var1 = class416.method5860();
        try {
            if (this.field281 != 0L) {
                if (var1 < this.field281) {
                    return;
                }
                this.method403(this.field287);
                this.field281 = 0L;
                this.field295 = true;
            }
            int var3 = this.method422();
            if (this.field293 - var3 > this.field291) {
                this.field291 = this.field293 - var3;
            }
            int var4 = this.field299 + this.field289;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field287) {
                this.field287 += 1024;
                if (this.field287 > 16384) {
                    this.field287 = 16384;
                }
                this.method406();
                this.method403(this.field287);
                var3 = 0;
                this.field295 = true;
                if (var4 + 256 > this.field287) {
                    var4 = this.field287 - 256;
                    this.field289 = var4 - this.field299;
                }
            }
            while (var3 < var4) {
                this.method741(this.field283, 256);
                this.method405();
                var3 += 256;
            }
            if (var1 > this.field294) {
                if (this.field295) {
                    this.field295 = false;
                } else if (this.field291 == 0 && this.field292 == 0) {
                    this.method406();
                    this.field281 = var1 + 2000L;
                    return;
                } else {
                    this.field289 = Math.min(this.field292, this.field291);
                    this.field292 = this.field291;
                }
                this.field291 = 0;
                this.field294 = var1 + 2000L;
            }
            this.field293 = var3;
        } catch (Exception var8) {
            this.method406();
            this.field281 = var1 + 2000L;
        }
        try {
            if (var1 > this.field298 + 500000L) {
                var1 = this.field298;
            }
            while (var1 > this.field298 + 5000L) {
                this.method740(256);
                this.field298 += (long) (256000 / Statics.field4059);
            }
        } catch (Exception var7) {
            this.field298 = var1;
        }
    }

    @ObfuscatedName("ar.ah(I)V")
    public final void method738() {
        this.field295 = true;
    }

    @ObfuscatedName("ar.ao(I)V")
    public final synchronized void method737() {
        this.field295 = true;
        try {
            this.method407();
        } catch (Exception var2) {
            this.method406();
            this.field281 = class416.method5860() + 2000L;
        }
    }

    @ObfuscatedName("ar.ab(I)V")
    public final synchronized void method739() {
        if (Statics.field282 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field282.field313[var2] == this) {
                    Statics.field282.field313[var2] = null;
                }
                if (Statics.field282.field313[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field288.shutdownNow();
                Statics.field288 = null;
                Statics.field282 = null;
            }
        }
        this.method406();
        this.field283 = null;
    }

    @ObfuscatedName("ar.an(II)V")
    public final void method740(int arg0) {
        this.field296 -= arg0;
        if (this.field296 < 0) {
            this.field296 = 0;
        }
        if (this.field284 != null) {
            this.field284.method669(arg0);
        }
    }

    @ObfuscatedName("ar.ax([II)V")
    public final void method741(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3178) {
            var3 = arg1 << 1;
        }
        class334.method5625(arg0, 0, var3);
        this.field296 -= arg1;
        if (this.field284 != null && this.field296 <= 0) {
            this.field296 += Statics.field4059 >> 4;
            method112(this.field284);
            this.method742(this.field284, this.field284.method815());
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
                        class46 var11 = this.field297[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class56 var12 = var11.field345;
                                if (var12 == null || var12.field441 <= var8) {
                                    var11.field348 = true;
                                    int var13 = var11.method666();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field441 += var13;
                                    }
                                    if (var4 >= this.field285) {
                                        break label105;
                                    }
                                    class46 var14 = var11.method664();
                                    if (var14 != null) {
                                        int var15 = var11.field347;
                                        while (var14 != null) {
                                            this.method742(var14, var15 * var14.method815() >> 8);
                                            var14 = var11.method678();
                                        }
                                    }
                                    class46 var16 = var11.field346;
                                    var11.field346 = null;
                                    if (var10 == null) {
                                        this.field297[var7] = var16;
                                    } else {
                                        var10.field346 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field286[var7] = var10;
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
                class46 var18 = this.field297[var17];
                class46[] var19 = this.field297;
                this.field286[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class46 var21 = var18.field346;
                    var18.field346 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field296 < 0) {
            this.field296 = 0;
        }
        if (this.field284 != null) {
            this.field284.method667(arg0, 0, arg1);
        }
        this.field298 = class416.method5860();
    }

    @ObfuscatedName("o.am(Lai;I)V")
    public static final void method112(class46 arg0) {
        arg0.field348 = false;
        if (arg0.field345 != null) {
            arg0.field345.field441 = 0;
        }
        for (class46 var1 = arg0.method664(); var1 != null; var1 = arg0.method678()) {
            method112(var1);
        }
    }

    @ObfuscatedName("ar.az(Lai;IB)V")
    public final void method742(class46 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class46 var4 = this.field286[var3];
        if (var4 == null) {
            this.field297[var3] = arg0;
        } else {
            var4.field346 = arg0;
        }
        this.field286[var3] = arg0;
        arg0.field347 = arg1;
    }

    @ObfuscatedName("ar.c(I)V")
    public void method402() throws Exception {
    }

    @ObfuscatedName("ar.b(II)V")
    public void method403(int arg0) throws Exception {
    }

    @ObfuscatedName("ar.p(I)I")
    public int method422() throws Exception {
        return this.field287;
    }

    @ObfuscatedName("ar.m()V")
    public void method405() throws Exception {
    }

    @ObfuscatedName("ar.t(B)V")
    public void method406() {
    }

    @ObfuscatedName("ar.s(I)V")
    public void method407() throws Exception {
    }
}
