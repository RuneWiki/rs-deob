package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ag")
public class class40 {

    @ObfuscatedName("ag.q")
    public int[] field292;

    @ObfuscatedName("ag.x")
    public class46 field288;

    @ObfuscatedName("ag.p")
    public int field294 = 32;

    @ObfuscatedName("ag.n")
    public long field301 = class262.method4787();

    @ObfuscatedName("ag.m")
    public int field296;

    @ObfuscatedName("ag.d")
    public int field297;

    @ObfuscatedName("ag.j")
    public int field298;

    @ObfuscatedName("ag.f")
    public long field299 = 0L;

    @ObfuscatedName("ag.g")
    public int field300 = 0;

    @ObfuscatedName("ag.t")
    public int field289 = 0;

    @ObfuscatedName("ag.k")
    public int field302 = 0;

    @ObfuscatedName("ag.b")
    public long field303 = 0L;

    @ObfuscatedName("ag.z")
    public boolean field295 = true;

    @ObfuscatedName("ag.al")
    public int field305 = 0;

    @ObfuscatedName("ag.aa")
    public class46[] field304 = new class46[8];

    @ObfuscatedName("ag.ao")
    public class46[] field307 = new class46[8];

    @ObfuscatedName("mi.g(IZIB)V")
    public static final void method5695(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field306 = arg0;
        Statics.field290 = arg1;
        Statics.field157 = arg2;
    }

    @ObfuscatedName("ak.t(Lex;III)Lag;")
    public static final class40 method401(class153 arg0, int arg1, int arg2) {
        if (Statics.field306 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class40 var3 = Statics.field4068.method359();
                var3.field292 = new int[256 * (Statics.field290 ? 2 : 1)];
                var3.field297 = arg2;
                var3.method370();
                var3.field296 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field296 > 16384) {
                    var3.field296 = 16384;
                }
                var3.method368(var3.field296);
                if (Statics.field157 > 0 && Statics.field4499 == null) {
                    Statics.field4499 = new class42();
                    Statics.field291 = Executors.newScheduledThreadPool(1);
                    Statics.field291.scheduleAtFixedRate(Statics.field4499, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field4499 != null) {
                    if (Statics.field4499.field322[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field4499.field322[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class40();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ag.k(Lan;I)V")
    public final synchronized void method703(class46 arg0) {
        this.field288 = arg0;
    }

    @ObfuscatedName("ag.b(I)V")
    public final synchronized void method705() {
        if (this.field292 == null) {
            return;
        }
        long var1 = class262.method4787();
        try {
            if (this.field299 != 0L) {
                if (var1 < this.field299) {
                    return;
                }
                this.method368(this.field296);
                this.field299 = 0L;
                this.field295 = true;
            }
            int var3 = this.method380();
            if (this.field302 - var3 > this.field300) {
                this.field300 = this.field302 - var3;
            }
            int var4 = this.field298 + this.field297;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field296) {
                this.field296 += 1024;
                if (this.field296 > 16384) {
                    this.field296 = 16384;
                }
                this.method373();
                this.method368(this.field296);
                var3 = 0;
                this.field295 = true;
                if (var4 + 256 > this.field296) {
                    var4 = this.field296 - 256;
                    this.field298 = var4 - this.field297;
                }
            }
            while (var3 < var4) {
                this.method726(this.field292, 256);
                this.method372();
                var3 += 256;
            }
            if (var1 > this.field303) {
                if (this.field295) {
                    this.field295 = false;
                } else if (this.field300 == 0 && this.field289 == 0) {
                    this.method373();
                    this.field299 = var1 + 2000L;
                    return;
                } else {
                    this.field298 = Math.min(this.field289, this.field300);
                    this.field289 = this.field300;
                }
                this.field300 = 0;
                this.field303 = var1 + 2000L;
            }
            this.field302 = var3;
        } catch (Exception var8) {
            this.method373();
            this.field299 = var1 + 2000L;
        }
        try {
            if (var1 > this.field301 + 500000L) {
                var1 = this.field301;
            }
            while (var1 > this.field301 + 5000L) {
                this.method738(256);
                this.field301 += (long) (256000 / Statics.field306);
            }
        } catch (Exception var7) {
            this.field301 = var1;
        }
    }

    @ObfuscatedName("ag.z(I)V")
    public final void method706() {
        this.field295 = true;
    }

    @ObfuscatedName("ag.ap(B)V")
    public final synchronized void method707() {
        this.field295 = true;
        try {
            this.method387();
        } catch (Exception var2) {
            this.method373();
            this.field299 = class262.method4787() + 2000L;
        }
    }

    @ObfuscatedName("ag.af(I)V")
    public final synchronized void method708() {
        if (Statics.field4499 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field4499.field322[var2] == this) {
                    Statics.field4499.field322[var2] = null;
                }
                if (Statics.field4499.field322[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field291.shutdownNow();
                Statics.field291 = null;
                Statics.field4499 = null;
            }
        }
        this.method373();
        this.field292 = null;
    }

    @ObfuscatedName("ag.ak(II)V")
    public final void method738(int arg0) {
        this.field305 -= arg0;
        if (this.field305 < 0) {
            this.field305 = 0;
        }
        if (this.field288 != null) {
            this.field288.method639(arg0);
        }
    }

    @ObfuscatedName("ag.av([II)V")
    public final void method726(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field290) {
            var3 = arg1 << 1;
        }
        class339.method5628(arg0, 0, var3);
        this.field305 -= arg1;
        if (this.field288 != null && this.field305 <= 0) {
            this.field305 += Statics.field306 >> 4;
            Statics.method55(this.field288);
            this.method711(this.field288, this.field288.method874());
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
                        class46 var11 = this.field304[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class56 var12 = var11.field361;
                                if (var12 == null || var12.field460 <= var8) {
                                    var11.field359 = true;
                                    int var13 = var11.method636();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field460 += var13;
                                    }
                                    if (var4 >= this.field294) {
                                        break label105;
                                    }
                                    class46 var14 = var11.method634();
                                    if (var14 != null) {
                                        int var15 = var11.field360;
                                        while (var14 != null) {
                                            this.method711(var14, var15 * var14.method874() >> 8);
                                            var14 = var11.method647();
                                        }
                                    }
                                    class46 var16 = var11.field362;
                                    var11.field362 = null;
                                    if (var10 == null) {
                                        this.field304[var7] = var16;
                                    } else {
                                        var10.field362 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field307[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field362;
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
                class46 var18 = this.field304[var17];
                class46[] var19 = this.field304;
                this.field307[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class46 var21 = var18.field362;
                    var18.field362 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field305 < 0) {
            this.field305 = 0;
        }
        if (this.field288 != null) {
            this.field288.method637(arg0, 0, arg1);
        }
        this.field301 = class262.method4787();
    }

    @ObfuscatedName("ag.al(Lan;II)V")
    public final void method711(class46 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class46 var4 = this.field307[var3];
        if (var4 == null) {
            this.field304[var3] = arg0;
        } else {
            var4.field362 = arg0;
        }
        this.field307[var3] = arg0;
        arg0.field360 = arg1;
    }

    @ObfuscatedName("ag.c(B)V")
    public void method370() throws Exception {
    }

    @ObfuscatedName("ag.l(II)V")
    public void method368(int arg0) throws Exception {
    }

    @ObfuscatedName("ag.s(B)I")
    public int method380() throws Exception {
        return this.field296;
    }

    @ObfuscatedName("ag.e()V")
    public void method372() throws Exception {
    }

    @ObfuscatedName("ag.r(I)V")
    public void method373() {
    }

    @ObfuscatedName("ag.o(B)V")
    public void method387() throws Exception {
    }
}
