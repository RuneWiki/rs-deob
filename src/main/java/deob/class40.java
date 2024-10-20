package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ad")
public class class40 {

    @ObfuscatedName("ad.t")
    public int[] field300;

    @ObfuscatedName("ad.u")
    public class46 field292;

    @ObfuscatedName("ad.d")
    public int field306 = 32;

    @ObfuscatedName("ad.b")
    public long field295 = class271.method5624();

    @ObfuscatedName("ad.a")
    public int field296;

    @ObfuscatedName("ad.l")
    public int field297;

    @ObfuscatedName("ad.e")
    public int field310;

    @ObfuscatedName("ad.g")
    public long field288 = 0L;

    @ObfuscatedName("ad.y")
    public int field293 = 0;

    @ObfuscatedName("ad.i")
    public int field301 = 0;

    @ObfuscatedName("ad.r")
    public int field302 = 0;

    @ObfuscatedName("ad.z")
    public long field303 = 0L;

    @ObfuscatedName("ad.o")
    public boolean field304 = true;

    @ObfuscatedName("ad.ai")
    public int field305 = 0;

    @ObfuscatedName("ad.an")
    public class46[] field289 = new class46[8];

    @ObfuscatedName("ad.aa")
    public class46[] field307 = new class46[8];

    @ObfuscatedName("bt.y(Law;I)V")
    public static final void method2026(class48 arg0) {
        Statics.field2857 = arg0;
    }

    @ObfuscatedName("ff.i(IZIB)V")
    public static final void method3140(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field308 = arg0;
        Statics.field298 = arg1;
        Statics.field290 = arg2;
    }

    @ObfuscatedName("hb.r(Lfr;III)Lad;")
    public static final class40 method4612(class158 arg0, int arg1, int arg2) {
        if (Statics.field308 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class40 var3 = Statics.field2857.method364();
                var3.field300 = new int[256 * (Statics.field298 ? 2 : 1)];
                var3.field297 = arg2;
                var3.method378();
                var3.field296 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field296 > 16384) {
                    var3.field296 = 16384;
                }
                var3.method387(var3.field296);
                if (Statics.field290 > 0 && Statics.field410 == null) {
                    Statics.field410 = new class42();
                    Statics.field4185 = Executors.newScheduledThreadPool(1);
                    Statics.field4185.scheduleAtFixedRate(Statics.field410, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field410 != null) {
                    if (Statics.field410.field322[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field410.field322[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class40();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ad.z(Lay;I)V")
    public final synchronized void method726(class46 arg0) {
        this.field292 = arg0;
    }

    @ObfuscatedName("ad.o(I)V")
    public final synchronized void method727() {
        if (this.field300 == null) {
            return;
        }
        long var1 = class271.method5624();
        try {
            if (this.field288 != 0L) {
                if (var1 < this.field288) {
                    return;
                }
                this.method387(this.field296);
                this.field288 = 0L;
                this.field304 = true;
            }
            int var3 = this.method384();
            if (this.field302 - var3 > this.field293) {
                this.field293 = this.field302 - var3;
            }
            int var4 = this.field310 + this.field297;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field296) {
                this.field296 += 1024;
                if (this.field296 > 16384) {
                    this.field296 = 16384;
                }
                this.method376();
                this.method387(this.field296);
                var3 = 0;
                this.field304 = true;
                if (var4 + 256 > this.field296) {
                    var4 = this.field296 - 256;
                    this.field310 = var4 - this.field297;
                }
            }
            while (var3 < var4) {
                this.method731(this.field300, 256);
                this.method386();
                var3 += 256;
            }
            if (var1 > this.field303) {
                if (this.field304) {
                    this.field304 = false;
                } else if (this.field293 == 0 && this.field301 == 0) {
                    this.method376();
                    this.field288 = var1 + 2000L;
                    return;
                } else {
                    this.field310 = Math.min(this.field301, this.field293);
                    this.field301 = this.field293;
                }
                this.field293 = 0;
                this.field303 = var1 + 2000L;
            }
            this.field302 = var3;
        } catch (Exception var8) {
            this.method376();
            this.field288 = var1 + 2000L;
        }
        try {
            if (var1 > this.field295 + 500000L) {
                var1 = this.field295;
            }
            while (var1 > this.field295 + 5000L) {
                this.method730(256);
                this.field295 += (long) (256000 / Statics.field308);
            }
        } catch (Exception var7) {
            this.field295 = var1;
        }
    }

    @ObfuscatedName("ad.as(I)V")
    public final void method751() {
        this.field304 = true;
    }

    @ObfuscatedName("ad.ac(I)V")
    public final synchronized void method750() {
        this.field304 = true;
        try {
            this.method382();
        } catch (Exception var2) {
            this.method376();
            this.field288 = class271.method5624() + 2000L;
        }
    }

    @ObfuscatedName("ad.ao(I)V")
    public final synchronized void method729() {
        if (Statics.field410 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field410.field322[var2] == this) {
                    Statics.field410.field322[var2] = null;
                }
                if (Statics.field410.field322[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field4185.shutdownNow();
                Statics.field4185 = null;
                Statics.field410 = null;
            }
        }
        this.method376();
        this.field300 = null;
    }

    @ObfuscatedName("ad.ar(II)V")
    public final void method730(int arg0) {
        this.field305 -= arg0;
        if (this.field305 < 0) {
            this.field305 = 0;
        }
        if (this.field292 != null) {
            this.field292.method655(arg0);
        }
    }

    @ObfuscatedName("ad.aq([II)V")
    public final void method731(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field298) {
            var3 = arg1 << 1;
        }
        class353.method6040(arg0, 0, var3);
        this.field305 -= arg1;
        if (this.field292 != null && this.field305 <= 0) {
            this.field305 += Statics.field308 >> 4;
            method3163(this.field292);
            this.method741(this.field292, this.field292.method901());
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
                        class46 var11 = this.field289[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class56 var12 = var11.field362;
                                if (var12 == null || var12.field462 <= var8) {
                                    var11.field363 = true;
                                    int var13 = var11.method652();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field462 += var13;
                                    }
                                    if (var4 >= this.field306) {
                                        break label105;
                                    }
                                    class46 var14 = var11.method650();
                                    if (var14 != null) {
                                        int var15 = var11.field361;
                                        while (var14 != null) {
                                            this.method741(var14, var15 * var14.method901() >> 8);
                                            var14 = var11.method661();
                                        }
                                    }
                                    class46 var16 = var11.field360;
                                    var11.field360 = null;
                                    if (var10 == null) {
                                        this.field289[var7] = var16;
                                    } else {
                                        var10.field360 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field307[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field360;
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
                class46 var18 = this.field289[var17];
                class46[] var19 = this.field289;
                this.field307[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class46 var21 = var18.field360;
                    var18.field360 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field305 < 0) {
            this.field305 = 0;
        }
        if (this.field292 != null) {
            this.field292.method665(arg0, 0, arg1);
        }
        this.field295 = class271.method5624();
    }

    @ObfuscatedName("fq.ai(Lay;I)V")
    public static final void method3163(class46 arg0) {
        arg0.field363 = false;
        if (arg0.field362 != null) {
            arg0.field362.field462 = 0;
        }
        for (class46 var1 = arg0.method650(); var1 != null; var1 = arg0.method661()) {
            method3163(var1);
        }
    }

    @ObfuscatedName("ad.an(Lay;IS)V")
    public final void method741(class46 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class46 var4 = this.field307[var3];
        if (var4 == null) {
            this.field289[var3] = arg0;
        } else {
            var4.field360 = arg0;
        }
        this.field307[var3] = arg0;
        arg0.field361 = arg1;
    }

    @ObfuscatedName("ad.c(I)V")
    public void method378() throws Exception {
    }

    @ObfuscatedName("ad.p(IS)V")
    public void method387(int arg0) throws Exception {
    }

    @ObfuscatedName("ad.f(I)I")
    public int method384() throws Exception {
        return this.field296;
    }

    @ObfuscatedName("ad.n()V")
    public void method386() throws Exception {
    }

    @ObfuscatedName("ad.k(I)V")
    public void method376() {
    }

    @ObfuscatedName("ad.w(I)V")
    public void method382() throws Exception {
    }
}
