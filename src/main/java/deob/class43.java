package deob;

@ObfuscatedName("by")
public class class43 {

    @ObfuscatedName("by.as")
    public int[] field278;

    @ObfuscatedName("by.ay")
    public class50 field271;

    @ObfuscatedName("by.ak")
    public int field272 = 32;

    @ObfuscatedName("by.aj")
    public long field286 = class313.method3460();

    @ObfuscatedName("by.am")
    public int field274;

    @ObfuscatedName("by.aq")
    public int field273;

    @ObfuscatedName("by.ai")
    public int field268;

    @ObfuscatedName("by.aw")
    public long field277 = 0L;

    @ObfuscatedName("by.ae")
    public int field275 = 0;

    @ObfuscatedName("by.an")
    public int field265 = 0;

    @ObfuscatedName("by.ag")
    public int field280 = 0;

    @ObfuscatedName("by.ad")
    public long field281 = 0L;

    @ObfuscatedName("by.af")
    public boolean field270 = true;

    @ObfuscatedName("by.bf")
    public int field283 = 0;

    @ObfuscatedName("by.bg")
    public class50[] field284 = new class50[8];

    @ObfuscatedName("by.ba")
    public class50[] field285 = new class50[8];

    @ObfuscatedName("by.ag(Lbk;B)V")
    public final synchronized void method791(class50 arg0) {
        this.field271 = arg0;
    }

    @ObfuscatedName("by.ad(I)V")
    public final synchronized void method806() {
        if (this.field278 == null) {
            return;
        }
        long var1 = class313.method3460();
        try {
            if (this.field277 != 0L) {
                if (var1 < this.field277) {
                    return;
                }
                this.method331(this.field274);
                this.field277 = 0L;
                this.field270 = true;
            }
            int var3 = this.method339();
            if (this.field280 - var3 > this.field275) {
                this.field275 = this.field280 - var3;
            }
            int var4 = this.field273 + this.field268;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field274) {
                this.field274 += 1024;
                if (this.field274 > 16384) {
                    this.field274 = 16384;
                }
                this.method334();
                this.method331(this.field274);
                var3 = 0;
                this.field270 = true;
                if (var4 + 256 > this.field274) {
                    var4 = this.field274 - 256;
                    this.field268 = var4 - this.field273;
                }
            }
            while (var3 < var4) {
                this.method788(this.field278, 256);
                this.method349();
                var3 += 256;
            }
            if (var1 > this.field281) {
                if (this.field270) {
                    this.field270 = false;
                } else if (this.field275 == 0 && this.field265 == 0) {
                    this.method334();
                    this.field277 = var1 + 2000L;
                    return;
                } else {
                    this.field268 = Math.min(this.field265, this.field275);
                    this.field265 = this.field275;
                }
                this.field275 = 0;
                this.field281 = var1 + 2000L;
            }
            this.field280 = var3;
        } catch (Exception var8) {
            this.method334();
            this.field277 = var1 + 2000L;
        }
        try {
            if (var1 > this.field286 + 500000L) {
                var1 = this.field286;
            }
            while (var1 > this.field286 + 5000L) {
                this.method797(256);
                this.field286 += (long) (256000 / Statics.field276);
            }
        } catch (Exception var7) {
            this.field286 = var1;
        }
    }

    @ObfuscatedName("by.af(I)V")
    public final void method789() {
        this.field270 = true;
    }

    @ObfuscatedName("by.be(I)V")
    public final synchronized void method790() {
        this.field270 = true;
        try {
            this.method335();
        } catch (Exception var2) {
            this.method334();
            this.field277 = class313.method3460() + 2000L;
        }
    }

    @ObfuscatedName("by.bd(I)V")
    public final synchronized void method794() {
        if (Statics.field4546 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field4546.field301[var2] == this) {
                    Statics.field4546.field301[var2] = null;
                }
                if (Statics.field4546.field301[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3645.shutdownNow();
                Statics.field3645 = null;
                Statics.field4546 = null;
            }
        }
        this.method334();
        this.field278 = null;
    }

    @ObfuscatedName("by.bl(IB)V")
    public final void method797(int arg0) {
        this.field283 -= arg0;
        if (this.field283 < 0) {
            this.field283 = 0;
        }
        if (this.field271 != null) {
            this.field271.method729(arg0);
        }
    }

    @ObfuscatedName("by.bi([II)V")
    public final void method788(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2581) {
            var3 = arg1 << 1;
        }
        class422.method7155(arg0, 0, var3);
        this.field283 -= arg1;
        if (this.field271 != null && this.field283 <= 0) {
            this.field283 += Statics.field276 >> 4;
            method2584(this.field271);
            this.method793(this.field271, this.field271.method989());
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
                                class63 var12 = var11.field339;
                                if (var12 == null || var12.field452 <= var8) {
                                    var11.field337 = true;
                                    int var13 = var11.method750();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field452 += var13;
                                    }
                                    if (var4 >= this.field272) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method714();
                                    if (var14 != null) {
                                        int var15 = var11.field338;
                                        while (var14 != null) {
                                            this.method793(var14, var15 * var14.method989() >> 8);
                                            var14 = var11.method713();
                                        }
                                    }
                                    class50 var16 = var11.field340;
                                    var11.field340 = null;
                                    if (var10 == null) {
                                        this.field284[var7] = var16;
                                    } else {
                                        var10.field340 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field285[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field340;
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
                this.field285[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field340;
                    var18.field340 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field283 < 0) {
            this.field283 = 0;
        }
        if (this.field271 != null) {
            this.field271.method706(arg0, 0, arg1);
        }
        this.field286 = class313.method3460();
    }

    @ObfuscatedName("dn.bv(Lbk;I)V")
    public static final void method2584(class50 arg0) {
        arg0.field337 = false;
        if (arg0.field339 != null) {
            arg0.field339.field452 = 0;
        }
        for (class50 var1 = arg0.method714(); var1 != null; var1 = arg0.method713()) {
            method2584(var1);
        }
    }

    @ObfuscatedName("by.bf(Lbk;IB)V")
    public final void method793(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field285[var3];
        if (var4 == null) {
            this.field284[var3] = arg0;
        } else {
            var4.field340 = arg0;
        }
        this.field285[var3] = arg0;
        arg0.field338 = arg1;
    }

    @ObfuscatedName("by.at(B)V")
    public void method330() throws Exception {
    }

    @ObfuscatedName("by.ah(II)V")
    public void method331(int arg0) throws Exception {
    }

    @ObfuscatedName("by.ar(I)I")
    public int method339() throws Exception {
        return this.field274;
    }

    @ObfuscatedName("by.ao()V")
    public void method349() throws Exception {
    }

    @ObfuscatedName("by.ab(I)V")
    public void method334() {
    }

    @ObfuscatedName("by.au(I)V")
    public void method335() throws Exception {
    }
}
