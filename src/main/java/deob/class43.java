package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bi")
public class class43 {

    @ObfuscatedName("bi.as")
    public int[] field259;

    @ObfuscatedName("bi.aw")
    public class50 field260;

    @ObfuscatedName("bi.af")
    public int field270 = 32;

    @ObfuscatedName("bi.aa")
    public long field262 = class329.method5009();

    @ObfuscatedName("bi.ah")
    public int field263;

    @ObfuscatedName("bi.ag")
    public int field264;

    @ObfuscatedName("bi.av")
    public int field256;

    @ObfuscatedName("bi.ar")
    public long field275 = 0L;

    @ObfuscatedName("bi.ap")
    public int field267 = 0;

    @ObfuscatedName("bi.ak")
    public int field268 = 0;

    @ObfuscatedName("bi.ai")
    public int field269 = 0;

    @ObfuscatedName("bi.at")
    public long field258 = 0L;

    @ObfuscatedName("bi.az")
    public boolean field271 = true;

    @ObfuscatedName("bi.bm")
    public int field272 = 0;

    @ObfuscatedName("bi.bd")
    public class50[] field273 = new class50[8];

    @ObfuscatedName("bi.bh")
    public class50[] field274 = new class50[8];

    @ObfuscatedName("lg.ar(Lbl;B)V")
    public static final void method5497(class52 arg0) {
        Statics.field944 = arg0;
    }

    @ObfuscatedName("mp.ap(IZII)V")
    public static final void method5626(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field5137 = arg0;
        Statics.field5023 = arg1;
        Statics.field257 = arg2;
    }

    @ObfuscatedName("gd.ak(Lig;III)Lbi;")
    public static final class43 method3327(class213 arg0, int arg1, int arg2) {
        if (Statics.field5137 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field944.method281();
                var3.field259 = new int[256 * (Statics.field5023 ? 2 : 1)];
                var3.field264 = arg2;
                var3.method297();
                var3.field263 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field263 > 16384) {
                    var3.field263 = 16384;
                }
                var3.method298(var3.field263);
                if (Statics.field257 > 0 && Statics.field266 == null) {
                    Statics.field266 = new class45();
                    Statics.field3169 = Executors.newScheduledThreadPool(1);
                    Statics.field3169.scheduleAtFixedRate(Statics.field266, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field266 != null) {
                    if (Statics.field266.field289[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field266.field289[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bi.ai(Lbb;B)V")
    public final synchronized void method760(class50 arg0) {
        this.field260 = arg0;
    }

    @ObfuscatedName("bi.at(I)V")
    public final synchronized void method771() {
        if (this.field259 == null) {
            return;
        }
        long var1 = class329.method5009();
        try {
            if (this.field275 != 0L) {
                if (var1 < this.field275) {
                    return;
                }
                this.method298(this.field263);
                this.field275 = 0L;
                this.field271 = true;
            }
            int var3 = this.method299();
            if (this.field269 - var3 > this.field267) {
                this.field267 = this.field269 - var3;
            }
            int var4 = this.field264 + this.field256;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field263) {
                this.field263 += 1024;
                if (this.field263 > 16384) {
                    this.field263 = 16384;
                }
                this.method301();
                this.method298(this.field263);
                var3 = 0;
                this.field271 = true;
                if (var4 + 256 > this.field263) {
                    var4 = this.field263 - 256;
                    this.field256 = var4 - this.field264;
                }
            }
            while (var3 < var4) {
                this.method749(this.field259, 256);
                this.method300();
                var3 += 256;
            }
            if (var1 > this.field258) {
                if (this.field271) {
                    this.field271 = false;
                } else if (this.field267 == 0 && this.field268 == 0) {
                    this.method301();
                    this.field275 = var1 + 2000L;
                    return;
                } else {
                    this.field256 = Math.min(this.field268, this.field267);
                    this.field268 = this.field267;
                }
                this.field267 = 0;
                this.field258 = var1 + 2000L;
            }
            this.field269 = var3;
        } catch (Exception var8) {
            this.method301();
            this.field275 = var1 + 2000L;
        }
        try {
            if (var1 > this.field262 + 500000L) {
                var1 = this.field262;
            }
            while (var1 > this.field262 + 5000L) {
                this.method748(256);
                this.field262 += (long) (256000 / Statics.field5137);
            }
        } catch (Exception var7) {
            this.field262 = var1;
        }
    }

    @ObfuscatedName("bi.az(I)V")
    public final void method745() {
        this.field271 = true;
    }

    @ObfuscatedName("bi.bg(I)V")
    public final synchronized void method746() {
        this.field271 = true;
        try {
            this.method302();
        } catch (Exception var2) {
            this.method301();
            this.field275 = class329.method5009() + 2000L;
        }
    }

    @ObfuscatedName("bi.bz(B)V")
    public final synchronized void method775() {
        if (Statics.field266 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field266.field289[var2] == this) {
                    Statics.field266.field289[var2] = null;
                }
                if (Statics.field266.field289[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3169.shutdownNow();
                Statics.field3169 = null;
                Statics.field266 = null;
            }
        }
        this.method301();
        this.field259 = null;
    }

    @ObfuscatedName("bi.bj(II)V")
    public final void method748(int arg0) {
        this.field272 -= arg0;
        if (this.field272 < 0) {
            this.field272 = 0;
        }
        if (this.field260 != null) {
            this.field260.method693(arg0);
        }
    }

    @ObfuscatedName("bi.bc([II)V")
    public final void method749(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field5023) {
            var3 = arg1 << 1;
        }
        class449.method7693(arg0, 0, var3);
        this.field272 -= arg1;
        if (this.field260 != null && this.field272 <= 0) {
            this.field272 += Statics.field5137 >> 4;
            method3301(this.field260);
            this.method747(this.field260, this.field260.method827());
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
                        class50 var11 = this.field273[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field329;
                                if (var12 == null || var12.field444 <= var8) {
                                    var11.field332 = true;
                                    int var13 = var11.method682();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field444 += var13;
                                    }
                                    if (var4 >= this.field270) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method705();
                                    if (var14 != null) {
                                        int var15 = var11.field330;
                                        while (var14 != null) {
                                            this.method747(var14, var15 * var14.method827() >> 8);
                                            var14 = var11.method687();
                                        }
                                    }
                                    class50 var16 = var11.field331;
                                    var11.field331 = null;
                                    if (var10 == null) {
                                        this.field273[var7] = var16;
                                    } else {
                                        var10.field331 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field274[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field331;
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
                class50 var18 = this.field273[var17];
                class50[] var19 = this.field273;
                this.field274[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field331;
                    var18.field331 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field272 < 0) {
            this.field272 = 0;
        }
        if (this.field260 != null) {
            this.field260.method683(arg0, 0, arg1);
        }
        this.field262 = class329.method5009();
    }

    @ObfuscatedName("gu.bo(Lbb;B)V")
    public static final void method3301(class50 arg0) {
        arg0.field332 = false;
        if (arg0.field329 != null) {
            arg0.field329.field444 = 0;
        }
        for (class50 var1 = arg0.method705(); var1 != null; var1 = arg0.method687()) {
            method3301(var1);
        }
    }

    @ObfuscatedName("bi.bm(Lbb;II)V")
    public final void method747(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field274[var3];
        if (var4 == null) {
            this.field273[var3] = arg0;
        } else {
            var4.field331 = arg0;
        }
        this.field274[var3] = arg0;
        arg0.field330 = arg1;
    }

    @ObfuscatedName("bi.ab(I)V")
    public void method297() throws Exception {
    }

    @ObfuscatedName("bi.ay(IB)V")
    public void method298(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.an(I)I")
    public int method299() throws Exception {
        return this.field263;
    }

    @ObfuscatedName("bi.au()V")
    public void method300() throws Exception {
    }

    @ObfuscatedName("bi.ax(I)V")
    public void method301() {
    }

    @ObfuscatedName("bi.ao(B)V")
    public void method302() throws Exception {
    }
}
