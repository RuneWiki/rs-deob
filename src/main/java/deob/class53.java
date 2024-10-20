package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bd")
public class class53 {

    @ObfuscatedName("bd.c")
    public int[] field421;

    @ObfuscatedName("bd.e")
    public class59 field422;

    @ObfuscatedName("bd.g")
    public int field436 = 32;

    @ObfuscatedName("bd.a")
    public long field424 = class380.method2744();

    @ObfuscatedName("bd.k")
    public int field425;

    @ObfuscatedName("bd.m")
    public int field426;

    @ObfuscatedName("bd.x")
    public int field427;

    @ObfuscatedName("bd.z")
    public long field428 = 0L;

    @ObfuscatedName("bd.w")
    public int field437 = 0;

    @ObfuscatedName("bd.t")
    public int field423 = 0;

    @ObfuscatedName("bd.h")
    public int field431 = 0;

    @ObfuscatedName("bd.q")
    public long field432 = 0L;

    @ObfuscatedName("bd.i")
    public boolean field433 = true;

    @ObfuscatedName("bd.ai")
    public int field434 = 0;

    @ObfuscatedName("bd.ar")
    public class59[] field435 = new class59[8];

    @ObfuscatedName("bd.ag")
    public class59[] field440 = new class59[8];

    @ObfuscatedName("x.h(Lbh;I)V")
    public static final void method164(class61 arg0) {
        Statics.field224 = arg0;
    }

    @ObfuscatedName("en.q(Ldp;IIB)Lbd;")
    public static final class53 method2525(class128 arg0, int arg1, int arg2) {
        if (Statics.field429 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class53 var3 = Statics.field224.method282();
                var3.field421 = new int[256 * (Statics.field417 ? 2 : 1)];
                var3.field426 = arg2;
                var3.method298();
                var3.field425 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field425 > 16384) {
                    var3.field425 = 16384;
                }
                var3.method299(var3.field425);
                if (Statics.field419 > 0 && Statics.field625 == null) {
                    Statics.field625 = new class55();
                    Statics.field3113 = Executors.newScheduledThreadPool(1);
                    Statics.field3113.scheduleAtFixedRate(Statics.field625, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field625 != null) {
                    if (Statics.field625.field463[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field625.field463[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class53();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bd.i(Lbm;B)V")
    public final synchronized void method632(class59 arg0) {
        this.field422 = arg0;
    }

    @ObfuscatedName("bd.ae(B)V")
    public final synchronized void method633() {
        if (this.field421 == null) {
            return;
        }
        long var1 = class380.method2744();
        try {
            if (this.field428 != 0L) {
                if (var1 < this.field428) {
                    return;
                }
                this.method299(this.field425);
                this.field428 = 0L;
                this.field433 = true;
            }
            int var3 = this.method316();
            if (this.field431 - var3 > this.field437) {
                this.field437 = this.field431 - var3;
            }
            int var4 = this.field427 + this.field426;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field425) {
                this.field425 += 1024;
                if (this.field425 > 16384) {
                    this.field425 = 16384;
                }
                this.method302();
                this.method299(this.field425);
                var3 = 0;
                this.field433 = true;
                if (var4 + 256 > this.field425) {
                    var4 = this.field425 - 256;
                    this.field427 = var4 - this.field426;
                }
            }
            while (var3 < var4) {
                this.method655(this.field421, 256);
                this.method301();
                var3 += 256;
            }
            if (var1 > this.field432) {
                if (this.field433) {
                    this.field433 = false;
                } else if (this.field437 == 0 && this.field423 == 0) {
                    this.method302();
                    this.field428 = var1 + 2000L;
                    return;
                } else {
                    this.field427 = Math.min(this.field423, this.field437);
                    this.field423 = this.field437;
                }
                this.field437 = 0;
                this.field432 = var1 + 2000L;
            }
            this.field431 = var3;
        } catch (Exception var8) {
            this.method302();
            this.field428 = var1 + 2000L;
        }
        try {
            if (var1 > this.field424 + 500000L) {
                var1 = this.field424;
            }
            while (var1 > this.field424 + 5000L) {
                this.method659(256);
                this.field424 += (long) (256000 / Statics.field429);
            }
        } catch (Exception var7) {
            this.field424 = var1;
        }
    }

    @ObfuscatedName("bd.ap(I)V")
    public final void method634() {
        this.field433 = true;
    }

    @ObfuscatedName("bd.ab(I)V")
    public final synchronized void method665() {
        this.field433 = true;
        try {
            this.method303();
        } catch (Exception var2) {
            this.method302();
            this.field428 = class380.method2744() + 2000L;
        }
    }

    @ObfuscatedName("bd.al(I)V")
    public final synchronized void method635() {
        if (Statics.field625 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field625.field463[var2] == this) {
                    Statics.field625.field463[var2] = null;
                }
                if (Statics.field625.field463[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3113.shutdownNow();
                Statics.field3113 = null;
                Statics.field625 = null;
            }
        }
        this.method302();
        this.field421 = null;
    }

    @ObfuscatedName("bd.ad(II)V")
    public final void method659(int arg0) {
        this.field434 -= arg0;
        if (this.field434 < 0) {
            this.field434 = 0;
        }
        if (this.field422 != null) {
            this.field422.method558(arg0);
        }
    }

    @ObfuscatedName("bd.ai([II)V")
    public final void method655(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field417) {
            var3 = arg1 << 1;
        }
        class307.method5073(arg0, 0, var3);
        this.field434 -= arg1;
        if (this.field422 != null && this.field434 <= 0) {
            this.field434 += Statics.field429 >> 4;
            method2864(this.field422);
            this.method637(this.field422, this.field422.method754());
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
                        class59 var10 = null;
                        class59 var11 = this.field435[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field494;
                                if (var12 == null || var12.field593 <= var8) {
                                    var11.field497 = true;
                                    int var13 = var11.method557();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field593 += var13;
                                    }
                                    if (var4 >= this.field436) {
                                        break label105;
                                    }
                                    class59 var14 = var11.method553();
                                    if (var14 != null) {
                                        int var15 = var11.field495;
                                        while (var14 != null) {
                                            this.method637(var14, var15 * var14.method754() >> 8);
                                            var14 = var11.method556();
                                        }
                                    }
                                    class59 var16 = var11.field496;
                                    var11.field496 = null;
                                    if (var10 == null) {
                                        this.field435[var7] = var16;
                                    } else {
                                        var10.field496 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field440[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field496;
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
                class59 var18 = this.field435[var17];
                class59[] var19 = this.field435;
                this.field440[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class59 var21 = var18.field496;
                    var18.field496 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field434 < 0) {
            this.field434 = 0;
        }
        if (this.field422 != null) {
            this.field422.method586(arg0, 0, arg1);
        }
        this.field424 = class380.method2744();
    }

    @ObfuscatedName("eo.ar(Lbm;S)V")
    public static final void method2864(class59 arg0) {
        arg0.field497 = false;
        if (arg0.field494 != null) {
            arg0.field494.field593 = 0;
        }
        for (class59 var1 = arg0.method553(); var1 != null; var1 = arg0.method556()) {
            method2864(var1);
        }
    }

    @ObfuscatedName("bd.ag(Lbm;II)V")
    public final void method637(class59 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class59 var4 = this.field440[var3];
        if (var4 == null) {
            this.field435[var3] = arg0;
        } else {
            var4.field496 = arg0;
        }
        this.field440[var3] = arg0;
        arg0.field495 = arg1;
    }

    @ObfuscatedName("bd.v(B)V")
    public void method298() throws Exception {
    }

    @ObfuscatedName("bd.n(IS)V")
    public void method299(int arg0) throws Exception {
    }

    @ObfuscatedName("bd.f(B)I")
    public int method316() throws Exception {
        return this.field425;
    }

    @ObfuscatedName("bd.y()V")
    public void method301() throws Exception {
    }

    @ObfuscatedName("bd.p(S)V")
    public void method302() {
    }

    @ObfuscatedName("bd.j(I)V")
    public void method303() throws Exception {
    }
}
