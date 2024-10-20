package deob;

@ObfuscatedName("bk")
public class class43 {

    @ObfuscatedName("bk.ax")
    public int[] field304;

    @ObfuscatedName("bk.aa")
    public class50 field301;

    @ObfuscatedName("bk.au")
    public int field302 = 32;

    @ObfuscatedName("bk.ae")
    public long field303 = class303.method2705();

    @ObfuscatedName("bk.ab")
    public int field319;

    @ObfuscatedName("bk.ad")
    public int field305;

    @ObfuscatedName("bk.ao")
    public int field306;

    @ObfuscatedName("bk.ac")
    public long field307 = 0L;

    @ObfuscatedName("bk.ak")
    public int field308 = 0;

    @ObfuscatedName("bk.an")
    public int field318 = 0;

    @ObfuscatedName("bk.af")
    public int field310 = 0;

    @ObfuscatedName("bk.ai")
    public long field311 = 0L;

    @ObfuscatedName("bk.al")
    public boolean field309 = true;

    @ObfuscatedName("bk.bs")
    public int field314 = 0;

    @ObfuscatedName("bk.bp")
    public class50[] field297 = new class50[8];

    @ObfuscatedName("bk.bv")
    public class50[] field313 = new class50[8];

    @ObfuscatedName("hz.ak(Lbj;I)V")
    public static final void method3371(class52 arg0) {
        Statics.field3459 = arg0;
    }

    @ObfuscatedName("jf.an(IZII)V")
    public static final void method4940(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field315 = arg0;
        Statics.field4376 = arg1;
        Statics.field1887 = arg2;
    }

    @ObfuscatedName("bk.af(Lby;B)V")
    public final synchronized void method774(class50 arg0) {
        this.field301 = arg0;
    }

    @ObfuscatedName("bk.ai(I)V")
    public final synchronized void method775() {
        if (this.field304 == null) {
            return;
        }
        long var1 = class303.method2705();
        try {
            if (this.field307 != 0L) {
                if (var1 < this.field307) {
                    return;
                }
                this.method334(this.field319);
                this.field307 = 0L;
                this.field309 = true;
            }
            int var3 = this.method317();
            if (this.field310 - var3 > this.field308) {
                this.field308 = this.field310 - var3;
            }
            int var4 = this.field306 + this.field305;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field319) {
                this.field319 += 1024;
                if (this.field319 > 16384) {
                    this.field319 = 16384;
                }
                this.method325();
                this.method334(this.field319);
                var3 = 0;
                this.field309 = true;
                if (var4 + 256 > this.field319) {
                    var4 = this.field319 - 256;
                    this.field306 = var4 - this.field305;
                }
            }
            while (var3 < var4) {
                this.method779(this.field304, 256);
                this.method322();
                var3 += 256;
            }
            if (var1 > this.field311) {
                if (this.field309) {
                    this.field309 = false;
                } else if (this.field308 == 0 && this.field318 == 0) {
                    this.method325();
                    this.field307 = var1 + 2000L;
                    return;
                } else {
                    this.field306 = Math.min(this.field318, this.field308);
                    this.field318 = this.field308;
                }
                this.field308 = 0;
                this.field311 = var1 + 2000L;
            }
            this.field310 = var3;
        } catch (Exception var8) {
            this.method325();
            this.field307 = var1 + 2000L;
        }
        try {
            if (var1 > this.field303 + 500000L) {
                var1 = this.field303;
            }
            while (var1 > this.field303 + 5000L) {
                this.method787(256);
                this.field303 += (long) (256000 / Statics.field315);
            }
        } catch (Exception var7) {
            this.field303 = var1;
        }
    }

    @ObfuscatedName("bk.al(I)V")
    public final void method776() {
        this.field309 = true;
    }

    @ObfuscatedName("bk.bd(I)V")
    public final synchronized void method808() {
        this.field309 = true;
        try {
            this.method323();
        } catch (Exception var2) {
            this.method325();
            this.field307 = class303.method2705() + 2000L;
        }
    }

    @ObfuscatedName("bk.bb(I)V")
    public final synchronized void method783() {
        if (Statics.field2976 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2976.field334[var2] == this) {
                    Statics.field2976.field334[var2] = null;
                }
                if (Statics.field2976.field334[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3028.shutdownNow();
                Statics.field3028 = null;
                Statics.field2976 = null;
            }
        }
        this.method325();
        this.field304 = null;
    }

    @ObfuscatedName("bk.bn(IB)V")
    public final void method787(int arg0) {
        this.field314 -= arg0;
        if (this.field314 < 0) {
            this.field314 = 0;
        }
        if (this.field301 != null) {
            this.field301.method713(arg0);
        }
    }

    @ObfuscatedName("bk.ba([II)V")
    public final void method779(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field4376) {
            var3 = arg1 << 1;
        }
        class411.method6986(arg0, 0, var3);
        this.field314 -= arg1;
        if (this.field301 != null && this.field314 <= 0) {
            this.field314 += Statics.field315 >> 4;
            method6027(this.field301);
            this.method780(this.field301, this.field301.method893());
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
                                class63 var12 = var11.field378;
                                if (var12 == null || var12.field487 <= var8) {
                                    var11.field380 = true;
                                    int var13 = var11.method700();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field487 += var13;
                                    }
                                    if (var4 >= this.field302) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method739();
                                    if (var14 != null) {
                                        int var15 = var11.field377;
                                        while (var14 != null) {
                                            this.method780(var14, var15 * var14.method893() >> 8);
                                            var14 = var11.method694();
                                        }
                                    }
                                    class50 var16 = var11.field379;
                                    var11.field379 = null;
                                    if (var10 == null) {
                                        this.field297[var7] = var16;
                                    } else {
                                        var10.field379 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field313[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field379;
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
                this.field313[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field379;
                    var18.field379 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field314 < 0) {
            this.field314 = 0;
        }
        if (this.field301 != null) {
            this.field301.method701(arg0, 0, arg1);
        }
        this.field303 = class303.method2705();
    }

    @ObfuscatedName("ns.bf(Lby;I)V")
    public static final void method6027(class50 arg0) {
        arg0.field380 = false;
        if (arg0.field378 != null) {
            arg0.field378.field487 = 0;
        }
        for (class50 var1 = arg0.method739(); var1 != null; var1 = arg0.method694()) {
            method6027(var1);
        }
    }

    @ObfuscatedName("bk.bs(Lby;II)V")
    public final void method780(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field313[var3];
        if (var4 == null) {
            this.field297[var3] = arg0;
        } else {
            var4.field379 = arg0;
        }
        this.field313[var3] = arg0;
        arg0.field377 = arg1;
    }

    @ObfuscatedName("bk.aw(S)V")
    public void method318() throws Exception {
    }

    @ObfuscatedName("bk.ay(II)V")
    public void method334(int arg0) throws Exception {
    }

    @ObfuscatedName("bk.ar(B)I")
    public int method317() throws Exception {
        return this.field319;
    }

    @ObfuscatedName("bk.am()V")
    public void method322() throws Exception {
    }

    @ObfuscatedName("bk.as(I)V")
    public void method325() {
    }

    @ObfuscatedName("bk.aj(I)V")
    public void method323() throws Exception {
    }
}
