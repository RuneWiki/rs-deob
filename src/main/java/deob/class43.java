package deob;

@ObfuscatedName("bu")
public class class43 {

    @ObfuscatedName("bu.ay")
    public int[] field296;

    @ObfuscatedName("bu.as")
    public class50 field291;

    @ObfuscatedName("bu.aj")
    public int field293 = 32;

    @ObfuscatedName("bu.an")
    public long field294 = class316.method6401();

    @ObfuscatedName("bu.au")
    public int field292;

    @ObfuscatedName("bu.ai")
    public int field290;

    @ObfuscatedName("bu.ae")
    public int field300;

    @ObfuscatedName("bu.aw")
    public long field298 = 0L;

    @ObfuscatedName("bu.aq")
    public int field299 = 0;

    @ObfuscatedName("bu.az")
    public int field295 = 0;

    @ObfuscatedName("bu.at")
    public int field301 = 0;

    @ObfuscatedName("bu.af")
    public long field302 = 0L;

    @ObfuscatedName("bu.ad")
    public boolean field303 = true;

    @ObfuscatedName("bu.bv")
    public int field304 = 0;

    @ObfuscatedName("bu.ba")
    public class50[] field297 = new class50[8];

    @ObfuscatedName("bu.bz")
    public class50[] field306 = new class50[8];

    @ObfuscatedName("px.aq(Lbw;I)V")
    public static final void method6747(class52 arg0) {
        Statics.field85 = arg0;
    }

    @ObfuscatedName("fs.az(IZII)V")
    public static final void method2913(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field307 = arg0;
        Statics.field3131 = arg1;
        Statics.field2373 = arg2;
    }

    @ObfuscatedName("bu.at(Lbi;I)V")
    public final synchronized void method781(class50 arg0) {
        this.field291 = arg0;
    }

    @ObfuscatedName("bu.af(I)V")
    public final synchronized void method769() {
        if (this.field296 == null) {
            return;
        }
        long var1 = class316.method6401();
        try {
            if (this.field298 != 0L) {
                if (var1 < this.field298) {
                    return;
                }
                this.method315(this.field292);
                this.field298 = 0L;
                this.field303 = true;
            }
            int var3 = this.method316();
            if (this.field301 - var3 > this.field299) {
                this.field299 = this.field301 - var3;
            }
            int var4 = this.field300 + this.field290;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field292) {
                this.field292 += 1024;
                if (this.field292 > 16384) {
                    this.field292 = 16384;
                }
                this.method318();
                this.method315(this.field292);
                var3 = 0;
                this.field303 = true;
                if (var4 + 256 > this.field292) {
                    var4 = this.field292 - 256;
                    this.field300 = var4 - this.field290;
                }
            }
            while (var3 < var4) {
                this.method802(this.field296, 256);
                this.method317();
                var3 += 256;
            }
            if (var1 > this.field302) {
                if (this.field303) {
                    this.field303 = false;
                } else if (this.field299 == 0 && this.field295 == 0) {
                    this.method318();
                    this.field298 = var1 + 2000L;
                    return;
                } else {
                    this.field300 = Math.min(this.field295, this.field299);
                    this.field295 = this.field299;
                }
                this.field299 = 0;
                this.field302 = var1 + 2000L;
            }
            this.field301 = var3;
        } catch (Exception var8) {
            this.method318();
            this.field298 = var1 + 2000L;
        }
        try {
            if (var1 > this.field294 + 500000L) {
                var1 = this.field294;
            }
            while (var1 > this.field294 + 5000L) {
                this.method791(256);
                this.field294 += (long) (256000 / Statics.field307);
            }
        } catch (Exception var7) {
            this.field294 = var1;
        }
    }

    @ObfuscatedName("bu.ad(I)V")
    public final void method770() {
        this.field303 = true;
    }

    @ObfuscatedName("bu.bn(I)V")
    public final synchronized void method771() {
        this.field303 = true;
        try {
            this.method333();
        } catch (Exception var2) {
            this.method318();
            this.field298 = class316.method6401() + 2000L;
        }
    }

    @ObfuscatedName("bu.bk(I)V")
    public final synchronized void method772() {
        if (Statics.field1454 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1454.field322[var2] == this) {
                    Statics.field1454.field322[var2] = null;
                }
                if (Statics.field1454.field322[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3846.shutdownNow();
                Statics.field3846 = null;
                Statics.field1454 = null;
            }
        }
        this.method318();
        this.field296 = null;
    }

    @ObfuscatedName("bu.by(II)V")
    public final void method791(int arg0) {
        this.field304 -= arg0;
        if (this.field304 < 0) {
            this.field304 = 0;
        }
        if (this.field291 != null) {
            this.field291.method691(arg0);
        }
    }

    @ObfuscatedName("bu.bd([II)V")
    public final void method802(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3131) {
            var3 = arg1 << 1;
        }
        class425.method7092(arg0, 0, var3);
        this.field304 -= arg1;
        if (this.field291 != null && this.field304 <= 0) {
            this.field304 += Statics.field307 >> 4;
            method3338(this.field291);
            this.method793(this.field291, this.field291.method845());
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
                        class50 var11 = this.field297[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field368;
                                if (var12 == null || var12.field486 <= var8) {
                                    var11.field369 = true;
                                    int var13 = var11.method698();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field486 += var13;
                                    }
                                    if (var4 >= this.field293) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method696();
                                    if (var14 != null) {
                                        int var15 = var11.field367;
                                        while (var14 != null) {
                                            this.method793(var14, var15 * var14.method845() >> 8);
                                            var14 = var11.method729();
                                        }
                                    }
                                    class50 var16 = var11.field366;
                                    var11.field366 = null;
                                    if (var10 == null) {
                                        this.field297[var7] = var16;
                                    } else {
                                        var10.field366 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field306[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field366;
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
                class50 var18 = this.field297[var17];
                class50[] var19 = this.field297;
                this.field306[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field366;
                    var18.field366 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field304 < 0) {
            this.field304 = 0;
        }
        if (this.field291 != null) {
            this.field291.method699(arg0, 0, arg1);
        }
        this.field294 = class316.method6401();
    }

    @ObfuscatedName("hh.be(Lbi;B)V")
    public static final void method3338(class50 arg0) {
        arg0.field369 = false;
        if (arg0.field368 != null) {
            arg0.field368.field486 = 0;
        }
        for (class50 var1 = arg0.method696(); var1 != null; var1 = arg0.method729()) {
            method3338(var1);
        }
    }

    @ObfuscatedName("bu.bv(Lbi;IB)V")
    public final void method793(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field306[var3];
        if (var4 == null) {
            this.field297[var3] = arg0;
        } else {
            var4.field366 = arg0;
        }
        this.field306[var3] = arg0;
        arg0.field367 = arg1;
    }

    @ObfuscatedName("bu.ac(I)V")
    public void method314() throws Exception {
    }

    @ObfuscatedName("bu.al(IB)V")
    public void method315(int arg0) throws Exception {
    }

    @ObfuscatedName("bu.ak(I)I")
    public int method316() throws Exception {
        return this.field292;
    }

    @ObfuscatedName("bu.ax()V")
    public void method317() throws Exception {
    }

    @ObfuscatedName("bu.ao(S)V")
    public void method318() {
    }

    @ObfuscatedName("bu.ah(B)V")
    public void method333() throws Exception {
    }
}
