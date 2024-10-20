package deob;

@ObfuscatedName("bz")
public class class43 {

    @ObfuscatedName("bz.ap")
    public int[] field265;

    @ObfuscatedName("bz.ab")
    public class50 field266;

    @ObfuscatedName("bz.az")
    public int field278 = 32;

    @ObfuscatedName("bz.aa")
    public long field268 = class331.method3482();

    @ObfuscatedName("bz.ai")
    public int field269;

    @ObfuscatedName("bz.ao")
    public int field280;

    @ObfuscatedName("bz.as")
    public int field270;

    @ObfuscatedName("bz.ay")
    public long field272 = 0L;

    @ObfuscatedName("bz.aj")
    public int field273 = 0;

    @ObfuscatedName("bz.av")
    public int field274 = 0;

    @ObfuscatedName("bz.aw")
    public int field275 = 0;

    @ObfuscatedName("bz.an")
    public long field267 = 0L;

    @ObfuscatedName("bz.ak")
    public boolean field277 = true;

    @ObfuscatedName("bz.bm")
    public int field261 = 0;

    @ObfuscatedName("bz.bs")
    public class50[] field279 = new class50[8];

    @ObfuscatedName("bz.bw")
    public class50[] field276 = new class50[8];

    @ObfuscatedName("gf.as(IZII)V")
    public static final void method3370(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field271 = arg0;
        Statics.field262 = arg1;
        Statics.field5584 = arg2;
    }

    @ObfuscatedName("bz.ay(Lbk;I)V")
    public final synchronized void method782(class50 arg0) {
        this.field266 = arg0;
    }

    @ObfuscatedName("bz.aj(B)V")
    public final synchronized void method783() {
        if (this.field265 == null) {
            return;
        }
        long var1 = class331.method3482();
        try {
            if (this.field272 != 0L) {
                if (var1 < this.field272) {
                    return;
                }
                this.method314(this.field269);
                this.field272 = 0L;
                this.field277 = true;
            }
            int var3 = this.method315();
            if (this.field275 - var3 > this.field273) {
                this.field273 = this.field275 - var3;
            }
            int var4 = this.field280 + this.field270;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field269) {
                this.field269 += 1024;
                if (this.field269 > 16384) {
                    this.field269 = 16384;
                }
                this.method317();
                this.method314(this.field269);
                var3 = 0;
                this.field277 = true;
                if (var4 + 256 > this.field269) {
                    var4 = this.field269 - 256;
                    this.field270 = var4 - this.field280;
                }
            }
            while (var3 < var4) {
                this.method788(this.field265, 256);
                this.method325();
                var3 += 256;
            }
            if (var1 > this.field267) {
                if (this.field277) {
                    this.field277 = false;
                } else if (this.field273 == 0 && this.field274 == 0) {
                    this.method317();
                    this.field272 = var1 + 2000L;
                    return;
                } else {
                    this.field270 = Math.min(this.field274, this.field273);
                    this.field274 = this.field273;
                }
                this.field273 = 0;
                this.field267 = var1 + 2000L;
            }
            this.field275 = var3;
        } catch (Exception var8) {
            this.method317();
            this.field272 = var1 + 2000L;
        }
        try {
            if (var1 > this.field268 + 500000L) {
                var1 = this.field268;
            }
            while (var1 > this.field268 + 5000L) {
                this.method787(256);
                this.field268 += (long) (256000 / Statics.field271);
            }
        } catch (Exception var7) {
            this.field268 = var1;
        }
    }

    @ObfuscatedName("bz.av(I)V")
    public final void method784() {
        this.field277 = true;
    }

    @ObfuscatedName("bz.aw(B)V")
    public final synchronized void method785() {
        this.field277 = true;
        try {
            this.method318();
        } catch (Exception var2) {
            this.method317();
            this.field272 = class331.method3482() + 2000L;
        }
    }

    @ObfuscatedName("bz.an(I)V")
    public final synchronized void method800() {
        if (Statics.field4848 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field4848.field298[var2] == this) {
                    Statics.field4848.field298[var2] = null;
                }
                if (Statics.field4848.field298[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field263.shutdownNow();
                Statics.field263 = null;
                Statics.field4848 = null;
            }
        }
        this.method317();
        this.field265 = null;
    }

    @ObfuscatedName("bz.ak(II)V")
    public final void method787(int arg0) {
        this.field261 -= arg0;
        if (this.field261 < 0) {
            this.field261 = 0;
        }
        if (this.field266 != null) {
            this.field266.method716(arg0);
        }
    }

    @ObfuscatedName("bz.bn([II)V")
    public final void method788(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field262) {
            var3 = arg1 << 1;
        }
        class451.method7837(arg0, 0, var3);
        this.field261 -= arg1;
        if (this.field266 != null && this.field261 <= 0) {
            this.field261 += Statics.field271 >> 4;
            method5567(this.field266);
            this.method792(this.field266, this.field266.method912());
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
                        class50 var11 = this.field279[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field337;
                                if (var12 == null || var12.field456 <= var8) {
                                    var11.field336 = true;
                                    int var13 = var11.method711();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field456 += var13;
                                    }
                                    if (var4 >= this.field278) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method709();
                                    if (var14 != null) {
                                        int var15 = var11.field335;
                                        while (var14 != null) {
                                            this.method792(var14, var15 * var14.method912() >> 8);
                                            var14 = var11.method710();
                                        }
                                    }
                                    class50 var16 = var11.field338;
                                    var11.field338 = null;
                                    if (var10 == null) {
                                        this.field279[var7] = var16;
                                    } else {
                                        var10.field338 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field276[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field338;
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
                class50 var18 = this.field279[var17];
                class50[] var19 = this.field279;
                this.field276[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field338;
                    var18.field338 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field261 < 0) {
            this.field261 = 0;
        }
        if (this.field266 != null) {
            this.field266.method712(arg0, 0, arg1);
        }
        this.field268 = class331.method3482();
    }

    @ObfuscatedName("le.bh(Lbk;I)V")
    public static final void method5567(class50 arg0) {
        arg0.field336 = false;
        if (arg0.field337 != null) {
            arg0.field337.field456 = 0;
        }
        for (class50 var1 = arg0.method709(); var1 != null; var1 = arg0.method710()) {
            method5567(var1);
        }
    }

    @ObfuscatedName("bz.bd(Lbk;II)V")
    public final void method792(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field276[var3];
        if (var4 == null) {
            this.field279[var3] = arg0;
        } else {
            var4.field338 = arg0;
        }
        this.field276[var3] = arg0;
        arg0.field335 = arg1;
    }

    @ObfuscatedName("bz.ac(I)V")
    public void method330() throws Exception {
    }

    @ObfuscatedName("bz.ae(II)V")
    public void method314(int arg0) throws Exception {
    }

    @ObfuscatedName("bz.ag(I)I")
    public int method315() throws Exception {
        return this.field269;
    }

    @ObfuscatedName("bz.am()V")
    public void method325() throws Exception {
    }

    @ObfuscatedName("bz.ax(I)V")
    public void method317() {
    }

    @ObfuscatedName("bz.aq(B)V")
    public void method318() throws Exception {
    }
}
