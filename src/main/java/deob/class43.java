package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bf")
public class class43 {

    @ObfuscatedName("bf.af")
    public int[] field281;

    @ObfuscatedName("bf.ax")
    public class50 field298;

    @ObfuscatedName("bf.an")
    public int field286 = 32;

    @ObfuscatedName("bf.ag")
    public long field287 = class318.method2218();

    @ObfuscatedName("bf.am")
    public int field288;

    @ObfuscatedName("bf.ad")
    public int field289;

    @ObfuscatedName("bf.at")
    public int field280;

    @ObfuscatedName("bf.ay")
    public long field291 = 0L;

    @ObfuscatedName("bf.ae")
    public int field292 = 0;

    @ObfuscatedName("bf.ac")
    public int field293 = 0;

    @ObfuscatedName("bf.ab")
    public int field294 = 0;

    @ObfuscatedName("bf.av")
    public long field295 = 0L;

    @ObfuscatedName("bf.ap")
    public boolean field299 = true;

    @ObfuscatedName("bf.ba")
    public int field285 = 0;

    @ObfuscatedName("bf.bt")
    public class50[] field284 = new class50[8];

    @ObfuscatedName("bf.bk")
    public class50[] field290 = new class50[8];

    @ObfuscatedName("be.ac(IZIB)V")
    public static final void method778(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field296 = arg0;
        Statics.field297 = arg1;
        Statics.field3961 = arg2;
    }

    @ObfuscatedName("iw.ab(Lig;III)Lbf;")
    public static final class43 method4044(class213 arg0, int arg1, int arg2) {
        if (Statics.field296 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field172.method280();
                var3.field281 = new int[(Statics.field297 ? 2 : 1) * 256];
                var3.field289 = arg2;
                var3.method294();
                var3.field288 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field288 > 16384) {
                    var3.field288 = 16384;
                }
                var3.method296(var3.field288);
                if (Statics.field3961 > 0 && Statics.field130 == null) {
                    Statics.field130 = new class45();
                    Statics.field283 = Executors.newScheduledThreadPool(1);
                    Statics.field283.scheduleAtFixedRate(Statics.field130, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field130 != null) {
                    if (Statics.field130.field311[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field130.field311[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bf.av(Lbj;I)V")
    public final synchronized void method735(class50 arg0) {
        this.field298 = arg0;
    }

    @ObfuscatedName("bf.ap(I)V")
    public final synchronized void method742() {
        if (this.field281 == null) {
            return;
        }
        long var1 = class318.method2218();
        try {
            if (this.field291 != 0L) {
                if (var1 < this.field291) {
                    return;
                }
                this.method296(this.field288);
                this.field291 = 0L;
                this.field299 = true;
            }
            int var3 = this.method297();
            if (this.field294 - var3 > this.field292) {
                this.field292 = this.field294 - var3;
            }
            int var4 = this.field289 + this.field280;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field288) {
                this.field288 += 1024;
                if (this.field288 > 16384) {
                    this.field288 = 16384;
                }
                this.method299();
                this.method296(this.field288);
                var3 = 0;
                this.field299 = true;
                if (var4 + 256 > this.field288) {
                    var4 = this.field288 - 256;
                    this.field280 = var4 - this.field289;
                }
            }
            while (var3 < var4) {
                this.method740(this.field281, 256);
                this.method298();
                var3 += 256;
            }
            if (var1 > this.field295) {
                if (this.field299) {
                    this.field299 = false;
                } else if (this.field292 == 0 && this.field293 == 0) {
                    this.method299();
                    this.field291 = var1 + 2000L;
                    return;
                } else {
                    this.field280 = Math.min(this.field293, this.field292);
                    this.field293 = this.field292;
                }
                this.field292 = 0;
                this.field295 = var1 + 2000L;
            }
            this.field294 = var3;
        } catch (Exception var8) {
            this.method299();
            this.field291 = var1 + 2000L;
        }
        try {
            if (var1 > this.field287 + 500000L) {
                var1 = this.field287;
            }
            while (var1 > this.field287 + 5000L) {
                this.method745(256);
                this.field287 += (long) (256000 / Statics.field296);
            }
        } catch (Exception var7) {
            this.field287 = var1;
        }
    }

    @ObfuscatedName("bf.bu(B)V")
    public final void method736() {
        this.field299 = true;
    }

    @ObfuscatedName("bf.bo(B)V")
    public final synchronized void method741() {
        this.field299 = true;
        try {
            this.method300();
        } catch (Exception var2) {
            this.method299();
            this.field291 = class318.method2218() + 2000L;
        }
    }

    @ObfuscatedName("bf.bd(S)V")
    public final synchronized void method739() {
        if (Statics.field130 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field130.field311[var2] == this) {
                    Statics.field130.field311[var2] = null;
                }
                if (Statics.field130.field311[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field283.shutdownNow();
                Statics.field283 = null;
                Statics.field130 = null;
            }
        }
        this.method299();
        this.field281 = null;
    }

    @ObfuscatedName("bf.bi(II)V")
    public final void method745(int arg0) {
        this.field285 -= arg0;
        if (this.field285 < 0) {
            this.field285 = 0;
        }
        if (this.field298 != null) {
            this.field298.method668(arg0);
        }
    }

    @ObfuscatedName("bf.bq([II)V")
    public final void method740(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field297) {
            var3 = arg1 << 1;
        }
        class429.method7310(arg0, 0, var3);
        this.field285 -= arg1;
        if (this.field298 != null && this.field285 <= 0) {
            this.field285 += Statics.field296 >> 4;
            method1077(this.field298);
            this.method756(this.field298, this.field298.method853());
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
                        class50 var11 = this.field284[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field351;
                                if (var12 == null || var12.field464 <= var8) {
                                    var11.field350 = true;
                                    int var13 = var11.method677();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field464 += var13;
                                    }
                                    if (var4 >= this.field286) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method663();
                                    if (var14 != null) {
                                        int var15 = var11.field349;
                                        while (var14 != null) {
                                            this.method756(var14, var15 * var14.method853() >> 8);
                                            var14 = var11.method662();
                                        }
                                    }
                                    class50 var16 = var11.field352;
                                    var11.field352 = null;
                                    if (var10 == null) {
                                        this.field284[var7] = var16;
                                    } else {
                                        var10.field352 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field290[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field352;
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
                class50 var18 = this.field284[var17];
                class50[] var19 = this.field284;
                this.field290[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field352;
                    var18.field352 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field285 < 0) {
            this.field285 = 0;
        }
        if (this.field298 != null) {
            this.field298.method666(arg0, 0, arg1);
        }
        this.field287 = class318.method2218();
    }

    @ObfuscatedName("cl.ba(Lbj;B)V")
    public static final void method1077(class50 arg0) {
        arg0.field350 = false;
        if (arg0.field351 != null) {
            arg0.field351.field464 = 0;
        }
        for (class50 var1 = arg0.method663(); var1 != null; var1 = arg0.method662()) {
            method1077(var1);
        }
    }

    @ObfuscatedName("bf.bt(Lbj;IB)V")
    public final void method756(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field290[var3];
        if (var4 == null) {
            this.field284[var3] = arg0;
        } else {
            var4.field352 = arg0;
        }
        this.field290[var3] = arg0;
        arg0.field349 = arg1;
    }

    @ObfuscatedName("bf.aq(B)V")
    public void method294() throws Exception {
    }

    @ObfuscatedName("bf.aw(IB)V")
    public void method296(int arg0) throws Exception {
    }

    @ObfuscatedName("bf.al(I)I")
    public int method297() throws Exception {
        return this.field288;
    }

    @ObfuscatedName("bf.ai()V")
    public void method298() throws Exception {
    }

    @ObfuscatedName("bf.ar(B)V")
    public void method299() {
    }

    @ObfuscatedName("bf.as(I)V")
    public void method300() throws Exception {
    }
}
