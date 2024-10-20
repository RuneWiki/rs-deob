package deob;

@ObfuscatedName("bb")
public class class43 {

    @ObfuscatedName("bb.ax")
    public int[] field298;

    @ObfuscatedName("bb.aw")
    public class50 field291;

    @ObfuscatedName("bb.az")
    public int field296 = 32;

    @ObfuscatedName("bb.av")
    public long field287 = Statics.method2852();

    @ObfuscatedName("bb.ak")
    public int field288;

    @ObfuscatedName("bb.ay")
    public int field289;

    @ObfuscatedName("bb.as")
    public int field290;

    @ObfuscatedName("bb.ab")
    public long field282 = 0L;

    @ObfuscatedName("bb.ah")
    public int field292 = 0;

    @ObfuscatedName("bb.ai")
    public int field293 = 0;

    @ObfuscatedName("bb.ac")
    public int field294 = 0;

    @ObfuscatedName("bb.al")
    public long field295 = 0L;

    @ObfuscatedName("bb.at")
    public boolean field285 = true;

    @ObfuscatedName("bb.ba")
    public int field286 = 0;

    @ObfuscatedName("bb.bk")
    public class50[] field299 = new class50[8];

    @ObfuscatedName("bb.bn")
    public class50[] field284 = new class50[8];

    @ObfuscatedName("bb.ah(Lbl;B)V")
    public final synchronized void method803(class50 arg0) {
        this.field291 = arg0;
    }

    @ObfuscatedName("bb.ai(I)V")
    public final synchronized void method804() {
        if (this.field298 == null) {
            return;
        }
        long var1 = Statics.method2852();
        try {
            if (this.field282 != 0L) {
                if (var1 < this.field282) {
                    return;
                }
                this.method338(this.field288);
                this.field282 = 0L;
                this.field285 = true;
            }
            int var3 = this.method333();
            if (this.field294 - var3 > this.field292) {
                this.field292 = this.field294 - var3;
            }
            int var4 = this.field290 + this.field289;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field288) {
                this.field288 += 1024;
                if (this.field288 > 16384) {
                    this.field288 = 16384;
                }
                this.method334();
                this.method338(this.field288);
                var3 = 0;
                this.field285 = true;
                if (var4 + 256 > this.field288) {
                    var4 = this.field288 - 256;
                    this.field290 = var4 - this.field289;
                }
            }
            while (var3 < var4) {
                this.method809(this.field298, 256);
                this.method342();
                var3 += 256;
            }
            if (var1 > this.field295) {
                if (this.field285) {
                    this.field285 = false;
                } else if (this.field292 == 0 && this.field293 == 0) {
                    this.method334();
                    this.field282 = var1 + 2000L;
                    return;
                } else {
                    this.field290 = Math.min(this.field293, this.field292);
                    this.field293 = this.field292;
                }
                this.field292 = 0;
                this.field295 = var1 + 2000L;
            }
            this.field294 = var3;
        } catch (Exception var8) {
            this.method334();
            this.field282 = var1 + 2000L;
        }
        try {
            if (var1 > this.field287 + 500000L) {
                var1 = this.field287;
            }
            while (var1 > this.field287 + 5000L) {
                this.method810(256);
                this.field287 += (long) (256000 / Statics.field1994);
            }
        } catch (Exception var7) {
            this.field287 = var1;
        }
    }

    @ObfuscatedName("bb.ac(I)V")
    public final void method821() {
        this.field285 = true;
    }

    @ObfuscatedName("bb.al(I)V")
    public final synchronized void method814() {
        this.field285 = true;
        try {
            this.method335();
        } catch (Exception var2) {
            this.method334();
            this.field282 = Statics.method2852() + 2000L;
        }
    }

    @ObfuscatedName("bb.at(I)V")
    public final synchronized void method805() {
        if (Statics.field283 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field283.field314[var2] == this) {
                    Statics.field283.field314[var2] = null;
                }
                if (Statics.field283.field314[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field297.shutdownNow();
                Statics.field297 = null;
                Statics.field283 = null;
            }
        }
        this.method334();
        this.field298 = null;
    }

    @ObfuscatedName("bb.bj(IB)V")
    public final void method810(int arg0) {
        this.field286 -= arg0;
        if (this.field286 < 0) {
            this.field286 = 0;
        }
        if (this.field291 != null) {
            this.field291.method743(arg0);
        }
    }

    @ObfuscatedName("bb.bd([II)V")
    public final void method809(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field4794) {
            var3 = arg1 << 1;
        }
        class426.method7289(arg0, 0, var3);
        this.field286 -= arg1;
        if (this.field291 != null && this.field286 <= 0) {
            this.field286 += Statics.field1994 >> 4;
            method3739(this.field291);
            this.method807(this.field291, this.field291.method890());
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
                        class50 var11 = this.field299[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class63 var12 = var11.field356;
                                if (var12 == null || var12.field467 <= var8) {
                                    var11.field355 = true;
                                    int var13 = var11.method740();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field467 += var13;
                                    }
                                    if (var4 >= this.field296) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method738();
                                    if (var14 != null) {
                                        int var15 = var11.field354;
                                        while (var14 != null) {
                                            this.method807(var14, var15 * var14.method890() >> 8);
                                            var14 = var11.method766();
                                        }
                                    }
                                    class50 var16 = var11.field357;
                                    var11.field357 = null;
                                    if (var10 == null) {
                                        this.field299[var7] = var16;
                                    } else {
                                        var10.field357 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field284[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field357;
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
                class50 var18 = this.field299[var17];
                class50[] var19 = this.field299;
                this.field284[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field357;
                    var18.field357 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field286 < 0) {
            this.field286 = 0;
        }
        if (this.field291 != null) {
            this.field291.method736(arg0, 0, arg1);
        }
        this.field287 = Statics.method2852();
    }

    @ObfuscatedName("hj.bg(Lbl;B)V")
    public static final void method3739(class50 arg0) {
        arg0.field355 = false;
        if (arg0.field356 != null) {
            arg0.field356.field467 = 0;
        }
        for (class50 var1 = arg0.method738(); var1 != null; var1 = arg0.method766()) {
            method3739(var1);
        }
    }

    @ObfuscatedName("bb.bt(Lbl;II)V")
    public final void method807(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field284[var3];
        if (var4 == null) {
            this.field299[var3] = arg0;
        } else {
            var4.field357 = arg0;
        }
        this.field284[var3] = arg0;
        arg0.field354 = arg1;
    }

    @ObfuscatedName("bb.am(S)V")
    public void method331() throws Exception {
    }

    @ObfuscatedName("bb.ap(IB)V")
    public void method338(int arg0) throws Exception {
    }

    @ObfuscatedName("bb.af(B)I")
    public int method333() throws Exception {
        return this.field288;
    }

    @ObfuscatedName("bb.aj()V")
    public void method342() throws Exception {
    }

    @ObfuscatedName("bb.aq(I)V")
    public void method334() {
    }

    @ObfuscatedName("bb.ar(I)V")
    public void method335() throws Exception {
    }
}
