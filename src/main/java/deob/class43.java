package deob;

@ObfuscatedName("by")
public class class43 {

    @ObfuscatedName("by.ax")
    public int[] field269;

    @ObfuscatedName("by.ar")
    public class50 field272;

    @ObfuscatedName("by.aj")
    public int field273 = 32;

    @ObfuscatedName("by.au")
    public long field274 = class318.method3596();

    @ObfuscatedName("by.ay")
    public int field275;

    @ObfuscatedName("by.ap")
    public int field271;

    @ObfuscatedName("by.av")
    public int field281;

    @ObfuscatedName("by.aa")
    public long field278 = 0L;

    @ObfuscatedName("by.aq")
    public int field279 = 0;

    @ObfuscatedName("by.am")
    public int field276 = 0;

    @ObfuscatedName("by.ac")
    public int field287 = 0;

    @ObfuscatedName("by.ae")
    public long field282 = 0L;

    @ObfuscatedName("by.ak")
    public boolean field283 = true;

    @ObfuscatedName("by.bn")
    public int field280 = 0;

    @ObfuscatedName("by.bd")
    public class50[] field285 = new class50[8];

    @ObfuscatedName("by.bo")
    public class50[] field286 = new class50[8];

    @ObfuscatedName("by.aq(Lba;I)V")
    public final synchronized void method757(class50 arg0) {
        this.field272 = arg0;
    }

    @ObfuscatedName("by.am(B)V")
    public final synchronized void method749() {
        if (this.field269 == null) {
            return;
        }
        long var1 = class318.method3596();
        try {
            if (this.field278 != 0L) {
                if (var1 < this.field278) {
                    return;
                }
                this.method297(this.field275);
                this.field278 = 0L;
                this.field283 = true;
            }
            int var3 = this.method298();
            if (this.field287 - var3 > this.field279) {
                this.field279 = this.field287 - var3;
            }
            int var4 = this.field281 + this.field271;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field275) {
                this.field275 += 1024;
                if (this.field275 > 16384) {
                    this.field275 = 16384;
                }
                this.method300();
                this.method297(this.field275);
                var3 = 0;
                this.field283 = true;
                if (var4 + 256 > this.field275) {
                    var4 = this.field275 - 256;
                    this.field281 = var4 - this.field271;
                }
            }
            while (var3 < var4) {
                this.method750(this.field269, 256);
                this.method299();
                var3 += 256;
            }
            if (var1 > this.field282) {
                if (this.field283) {
                    this.field283 = false;
                } else if (this.field279 == 0 && this.field276 == 0) {
                    this.method300();
                    this.field278 = var1 + 2000L;
                    return;
                } else {
                    this.field281 = Math.min(this.field276, this.field279);
                    this.field276 = this.field279;
                }
                this.field279 = 0;
                this.field282 = var1 + 2000L;
            }
            this.field287 = var3;
        } catch (Exception var8) {
            this.method300();
            this.field278 = var1 + 2000L;
        }
        try {
            if (var1 > this.field274 + 500000L) {
                var1 = this.field274;
            }
            while (var1 > this.field274 + 5000L) {
                this.method753(256);
                this.field274 += (long) (256000 / Statics.field4893);
            }
        } catch (Exception var7) {
            this.field274 = var1;
        }
    }

    @ObfuscatedName("by.ac(I)V")
    public final void method756() {
        this.field283 = true;
    }

    @ObfuscatedName("by.ae(I)V")
    public final synchronized void method751() {
        this.field283 = true;
        try {
            this.method301();
        } catch (Exception var2) {
            this.method300();
            this.field278 = class318.method3596() + 2000L;
        }
    }

    @ObfuscatedName("by.ak(B)V")
    public final synchronized void method752() {
        if (Statics.field270 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field270.field303[var2] == this) {
                    Statics.field270.field303[var2] = null;
                }
                if (Statics.field270.field303[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1672.shutdownNow();
                Statics.field1672 = null;
                Statics.field270 = null;
            }
        }
        this.method300();
        this.field269 = null;
    }

    @ObfuscatedName("by.bp(II)V")
    public final void method753(int arg0) {
        this.field280 -= arg0;
        if (this.field280 < 0) {
            this.field280 = 0;
        }
        if (this.field272 != null) {
            this.field272.method678(arg0);
        }
    }

    @ObfuscatedName("by.bz([II)V")
    public final void method750(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field277) {
            var3 = arg1 << 1;
        }
        class430.method7190(arg0, 0, var3);
        this.field280 -= arg1;
        if (this.field272 != null && this.field280 <= 0) {
            this.field280 += Statics.field4893 >> 4;
            method5644(this.field272);
            this.method754(this.field272, this.field272.method827());
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
                        class50 var11 = this.field285[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field344;
                                if (var12 == null || var12.field457 <= var8) {
                                    var11.field346 = true;
                                    int var13 = var11.method709();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field457 += var13;
                                    }
                                    if (var4 >= this.field273) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method692();
                                    if (var14 != null) {
                                        int var15 = var11.field345;
                                        while (var14 != null) {
                                            this.method754(var14, var15 * var14.method827() >> 8);
                                            var14 = var11.method696();
                                        }
                                    }
                                    class50 var16 = var11.field343;
                                    var11.field343 = null;
                                    if (var10 == null) {
                                        this.field285[var7] = var16;
                                    } else {
                                        var10.field343 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field286[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field343;
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
                class50 var18 = this.field285[var17];
                class50[] var19 = this.field285;
                this.field286[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field343;
                    var18.field343 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field280 < 0) {
            this.field280 = 0;
        }
        if (this.field272 != null) {
            this.field272.method667(arg0, 0, arg1);
        }
        this.field274 = class318.method3596();
    }

    @ObfuscatedName("ml.bc(Lba;I)V")
    public static final void method5644(class50 arg0) {
        arg0.field346 = false;
        if (arg0.field344 != null) {
            arg0.field344.field457 = 0;
        }
        for (class50 var1 = arg0.method692(); var1 != null; var1 = arg0.method696()) {
            method5644(var1);
        }
    }

    @ObfuscatedName("by.bf(Lba;II)V")
    public final void method754(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field286[var3];
        if (var4 == null) {
            this.field285[var3] = arg0;
        } else {
            var4.field343 = arg0;
        }
        this.field286[var3] = arg0;
        arg0.field345 = arg1;
    }

    @ObfuscatedName("by.az(I)V")
    public void method314() throws Exception {
    }

    @ObfuscatedName("by.ah(II)V")
    public void method297(int arg0) throws Exception {
    }

    @ObfuscatedName("by.af(I)I")
    public int method298() throws Exception {
        return this.field275;
    }

    @ObfuscatedName("by.at()V")
    public void method299() throws Exception {
    }

    @ObfuscatedName("by.an(I)V")
    public void method300() {
    }

    @ObfuscatedName("by.ao(S)V")
    public void method301() throws Exception {
    }
}
