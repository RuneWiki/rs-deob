package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ax")
public class class44 {

    @ObfuscatedName("ax.o")
    public int[] field333;

    @ObfuscatedName("ax.n")
    public class50 field317;

    @ObfuscatedName("ax.k")
    public int field318 = 32;

    @ObfuscatedName("ax.a")
    public long field316 = Statics.method1118();

    @ObfuscatedName("ax.s")
    public int field320;

    @ObfuscatedName("ax.l")
    public int field321;

    @ObfuscatedName("ax.t")
    public int field313;

    @ObfuscatedName("ax.c")
    public long field323 = 0L;

    @ObfuscatedName("ax.p")
    public int field324 = 0;

    @ObfuscatedName("ax.d")
    public int field325 = 0;

    @ObfuscatedName("ax.y")
    public int field330 = 0;

    @ObfuscatedName("ax.z")
    public long field319 = 0L;

    @ObfuscatedName("ax.w")
    public boolean field328 = true;

    @ObfuscatedName("ax.au")
    public int field329 = 0;

    @ObfuscatedName("ax.ar")
    public class50[] field322 = new class50[8];

    @ObfuscatedName("ax.at")
    public class50[] field331 = new class50[8];

    @ObfuscatedName("bl.ao(Lfp;IIB)Lax;")
    public static final class44 method1089(class165 arg0, int arg1, int arg2) {
        if (Statics.field326 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class44 var3 = Statics.field117.method309();
                var3.field333 = new int[256 * (Statics.field3355 ? 2 : 1)];
                var3.field321 = arg2;
                var3.method316();
                var3.field320 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field320 > 16384) {
                    var3.field320 = 16384;
                }
                var3.method317(var3.field320);
                if (Statics.field206 > 0 && Statics.field315 == null) {
                    Statics.field315 = new class46();
                    Statics.field60 = Executors.newScheduledThreadPool(1);
                    Statics.field60.scheduleAtFixedRate(Statics.field315, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field315 != null) {
                    if (Statics.field315.field350[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field315.field350[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class44();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ax.am(Laa;I)V")
    public final synchronized void method787(class50 arg0) {
        this.field317 = arg0;
    }

    @ObfuscatedName("ax.av(I)V")
    public final synchronized void method809() {
        if (this.field333 == null) {
            return;
        }
        long var1 = Statics.method1118();
        try {
            if (this.field323 != 0L) {
                if (var1 < this.field323) {
                    return;
                }
                this.method317(this.field320);
                this.field323 = 0L;
                this.field328 = true;
            }
            int var3 = this.method338();
            if (this.field330 - var3 > this.field324) {
                this.field324 = this.field330 - var3;
            }
            int var4 = this.field321 + this.field313;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field320) {
                this.field320 += 1024;
                if (this.field320 > 16384) {
                    this.field320 = 16384;
                }
                this.method340();
                this.method317(this.field320);
                var3 = 0;
                this.field328 = true;
                if (var4 + 256 > this.field320) {
                    var4 = this.field320 - 256;
                    this.field313 = var4 - this.field321;
                }
            }
            while (var3 < var4) {
                this.method791(this.field333, 256);
                this.method319();
                var3 += 256;
            }
            if (var1 > this.field319) {
                if (this.field328) {
                    this.field328 = false;
                } else if (this.field324 == 0 && this.field325 == 0) {
                    this.method340();
                    this.field323 = var1 + 2000L;
                    return;
                } else {
                    this.field313 = Math.min(this.field325, this.field324);
                    this.field325 = this.field324;
                }
                this.field324 = 0;
                this.field319 = var1 + 2000L;
            }
            this.field330 = var3;
        } catch (Exception var8) {
            this.method340();
            this.field323 = var1 + 2000L;
        }
        try {
            if (var1 > this.field316 + 500000L) {
                var1 = this.field316;
            }
            while (var1 > this.field316 + 5000L) {
                this.method790(256);
                this.field316 += (long) (256000 / Statics.field326);
            }
        } catch (Exception var7) {
            this.field316 = var1;
        }
    }

    @ObfuscatedName("ax.au(I)V")
    public final void method794() {
        this.field328 = true;
    }

    @ObfuscatedName("ax.ar(B)V")
    public final synchronized void method788() {
        this.field328 = true;
        try {
            this.method321();
        } catch (Exception var2) {
            this.method340();
            this.field323 = Statics.method1118() + 2000L;
        }
    }

    @ObfuscatedName("ax.at(I)V")
    public final synchronized void method789() {
        if (Statics.field315 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field315.field350[var2] == this) {
                    Statics.field315.field350[var2] = null;
                }
                if (Statics.field315.field350[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field60.shutdownNow();
                Statics.field60 = null;
                Statics.field315 = null;
            }
        }
        this.method340();
        this.field333 = null;
    }

    @ObfuscatedName("ax.ay(II)V")
    public final void method790(int arg0) {
        this.field329 -= arg0;
        if (this.field329 < 0) {
            this.field329 = 0;
        }
        if (this.field317 != null) {
            this.field317.method717(arg0);
        }
    }

    @ObfuscatedName("ax.an([II)V")
    public final void method791(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3355) {
            var3 = arg1 << 1;
        }
        class374.method6646(arg0, 0, var3);
        this.field329 -= arg1;
        if (this.field317 != null && this.field329 <= 0) {
            this.field329 += Statics.field326 >> 4;
            method5943(this.field317);
            this.method792(this.field317, this.field317.method904());
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
                        class50 var11 = this.field322[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field381;
                                if (var12 == null || var12.field479 <= var8) {
                                    var11.field383 = true;
                                    int var13 = var11.method709();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field479 += var13;
                                    }
                                    if (var4 >= this.field318) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method737();
                                    if (var14 != null) {
                                        int var15 = var11.field384;
                                        while (var14 != null) {
                                            this.method792(var14, var15 * var14.method904() >> 8);
                                            var14 = var11.method713();
                                        }
                                    }
                                    class50 var16 = var11.field382;
                                    var11.field382 = null;
                                    if (var10 == null) {
                                        this.field322[var7] = var16;
                                    } else {
                                        var10.field382 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field331[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field382;
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
                class50 var18 = this.field322[var17];
                class50[] var19 = this.field322;
                this.field331[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field382;
                    var18.field382 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field329 < 0) {
            this.field329 = 0;
        }
        if (this.field317 != null) {
            this.field317.method715(arg0, 0, arg1);
        }
        this.field316 = Statics.method1118();
    }

    @ObfuscatedName("lr.ab(Laa;B)V")
    public static final void method5943(class50 arg0) {
        arg0.field383 = false;
        if (arg0.field381 != null) {
            arg0.field381.field479 = 0;
        }
        for (class50 var1 = arg0.method737(); var1 != null; var1 = arg0.method713()) {
            method5943(var1);
        }
    }

    @ObfuscatedName("ax.al(Laa;II)V")
    public final void method792(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field331[var3];
        if (var4 == null) {
            this.field322[var3] = arg0;
        } else {
            var4.field382 = arg0;
        }
        this.field331[var3] = arg0;
        arg0.field384 = arg1;
    }

    @ObfuscatedName("ax.h(I)V")
    public void method316() throws Exception {
    }

    @ObfuscatedName("ax.e(IB)V")
    public void method317(int arg0) throws Exception {
    }

    @ObfuscatedName("ax.v(B)I")
    public int method338() throws Exception {
        return this.field320;
    }

    @ObfuscatedName("ax.x()V")
    public void method319() throws Exception {
    }

    @ObfuscatedName("ax.m(B)V")
    public void method340() {
    }

    @ObfuscatedName("ax.q(I)V")
    public void method321() throws Exception {
    }
}
