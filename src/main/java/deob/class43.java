package deob;

@ObfuscatedName("bv")
public class class43 {

    @ObfuscatedName("bv.az")
    public int[] field266;

    @ObfuscatedName("bv.ax")
    public class50 field267;

    @ObfuscatedName("bv.ac")
    public int field268 = 32;

    @ObfuscatedName("bv.al")
    public long field281 = class327.method4500();

    @ObfuscatedName("bv.ay")
    public int field270;

    @ObfuscatedName("bv.ao")
    public int field271;

    @ObfuscatedName("bv.aa")
    public int field272;

    @ObfuscatedName("bv.as")
    public long field282 = 0L;

    @ObfuscatedName("bv.aw")
    public int field274 = 0;

    @ObfuscatedName("bv.at")
    public int field275 = 0;

    @ObfuscatedName("bv.af")
    public int field276 = 0;

    @ObfuscatedName("bv.am")
    public long field265 = 0L;

    @ObfuscatedName("bv.ar")
    public boolean field283 = true;

    @ObfuscatedName("bv.bi")
    public int field280 = 0;

    @ObfuscatedName("bv.ba")
    public class50[] field273 = new class50[8];

    @ObfuscatedName("bv.bg")
    public class50[] field278 = new class50[8];

    @ObfuscatedName("hp.bt(IZII)V")
    public static final void method3398(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field264 = arg0;
        Statics.field1001 = arg1;
        Statics.field4435 = arg2;
    }

    @ObfuscatedName("bv.bj(Lbk;I)V")
    public final synchronized void method818(class50 arg0) {
        this.field267 = arg0;
    }

    @ObfuscatedName("bv.be(I)V")
    public final synchronized void method791() {
        if (this.field266 == null) {
            return;
        }
        long var1 = class327.method4500();
        try {
            if (this.field282 != 0L) {
                if (var1 < this.field282) {
                    return;
                }
                this.method338(this.field270);
                this.field282 = 0L;
                this.field283 = true;
            }
            int var3 = this.method325();
            if (this.field276 - var3 > this.field274) {
                this.field274 = this.field276 - var3;
            }
            int var4 = this.field272 + this.field271;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field270) {
                this.field270 += 1024;
                if (this.field270 > 16384) {
                    this.field270 = 16384;
                }
                this.method324();
                this.method338(this.field270);
                var3 = 0;
                this.field283 = true;
                if (var4 + 256 > this.field270) {
                    var4 = this.field270 - 256;
                    this.field272 = var4 - this.field271;
                }
            }
            while (var3 < var4) {
                this.method795(this.field266, 256);
                this.method326();
                var3 += 256;
            }
            if (var1 > this.field265) {
                if (this.field283) {
                    this.field283 = false;
                } else if (this.field274 == 0 && this.field275 == 0) {
                    this.method324();
                    this.field282 = var1 + 2000L;
                    return;
                } else {
                    this.field272 = Math.min(this.field275, this.field274);
                    this.field275 = this.field274;
                }
                this.field274 = 0;
                this.field265 = var1 + 2000L;
            }
            this.field276 = var3;
        } catch (Exception var8) {
            this.method324();
            this.field282 = var1 + 2000L;
        }
        try {
            if (var1 > this.field281 + 500000L) {
                var1 = this.field281;
            }
            while (var1 > this.field281 + 5000L) {
                this.method794(256);
                this.field281 += (long) (256000 / Statics.field264);
            }
        } catch (Exception var7) {
            this.field281 = var1;
        }
    }

    @ObfuscatedName("bv.bm(I)V")
    public final void method813() {
        this.field283 = true;
    }

    @ObfuscatedName("bv.bo(I)V")
    public final synchronized void method800() {
        this.field283 = true;
        try {
            this.method328();
        } catch (Exception var2) {
            this.method324();
            this.field282 = class327.method4500() + 2000L;
        }
    }

    @ObfuscatedName("bv.bi(I)V")
    public final synchronized void method793() {
        if (Statics.field262 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field262.field295[var2] == this) {
                    Statics.field262.field295[var2] = null;
                }
                if (Statics.field262.field295[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field269.shutdownNow();
                Statics.field269 = null;
                Statics.field262 = null;
            }
        }
        this.method324();
        this.field266 = null;
    }

    @ObfuscatedName("bv.ba(II)V")
    public final void method794(int arg0) {
        this.field280 -= arg0;
        if (this.field280 < 0) {
            this.field280 = 0;
        }
        if (this.field267 != null) {
            this.field267.method721(arg0);
        }
    }

    @ObfuscatedName("bv.bg([II)V")
    public final void method795(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1001) {
            var3 = arg1 << 1;
        }
        class448.method7593(arg0, 0, var3);
        this.field280 -= arg1;
        if (this.field267 != null && this.field280 <= 0) {
            this.field280 += Statics.field264 >> 4;
            method446(this.field267);
            this.method796(this.field267, this.field267.method876());
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
                                class63 var12 = var11.field334;
                                if (var12 == null || var12.field442 <= var8) {
                                    var11.field331 = true;
                                    int var13 = var11.method724();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field442 += var13;
                                    }
                                    if (var4 >= this.field268) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method750();
                                    if (var14 != null) {
                                        int var15 = var11.field332;
                                        while (var14 != null) {
                                            this.method796(var14, var15 * var14.method876() >> 8);
                                            var14 = var11.method738();
                                        }
                                    }
                                    class50 var16 = var11.field333;
                                    var11.field333 = null;
                                    if (var10 == null) {
                                        this.field273[var7] = var16;
                                    } else {
                                        var10.field333 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field278[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field333;
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
                this.field278[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field333;
                    var18.field333 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field280 < 0) {
            this.field280 = 0;
        }
        if (this.field267 != null) {
            this.field267.method718(arg0, 0, arg1);
        }
        this.field281 = class327.method4500();
    }

    @ObfuscatedName("bo.bs(Lbk;I)V")
    public static final void method446(class50 arg0) {
        arg0.field331 = false;
        if (arg0.field334 != null) {
            arg0.field334.field442 = 0;
        }
        for (class50 var1 = arg0.method750(); var1 != null; var1 = arg0.method738()) {
            method446(var1);
        }
    }

    @ObfuscatedName("bv.bp(Lbk;II)V")
    public final void method796(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field278[var3];
        if (var4 == null) {
            this.field273[var3] = arg0;
        } else {
            var4.field333 = arg0;
        }
        this.field278[var3] = arg0;
        arg0.field332 = arg1;
    }

    @ObfuscatedName("bv.aq(I)V")
    public void method323() throws Exception {
    }

    @ObfuscatedName("bv.ad(IB)V")
    public void method338(int arg0) throws Exception {
    }

    @ObfuscatedName("bv.ag(B)I")
    public int method325() throws Exception {
        return this.field270;
    }

    @ObfuscatedName("bv.ak()V")
    public void method326() throws Exception {
    }

    @ObfuscatedName("bv.ap(I)V")
    public void method324() {
    }

    @ObfuscatedName("bv.an(B)V")
    public void method328() throws Exception {
    }
}
