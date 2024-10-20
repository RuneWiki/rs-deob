package deob;

@ObfuscatedName("ab")
public class class44 {

    @ObfuscatedName("ab.b")
    public int[] field299;

    @ObfuscatedName("ab.o")
    public class50 field310;

    @ObfuscatedName("ab.u")
    public int field301 = 32;

    @ObfuscatedName("ab.z")
    public long field302 = class280.method2629();

    @ObfuscatedName("ab.t")
    public int field303;

    @ObfuscatedName("ab.w")
    public int field304;

    @ObfuscatedName("ab.m")
    public int field305;

    @ObfuscatedName("ab.q")
    public long field306 = 0L;

    @ObfuscatedName("ab.i")
    public int field307 = 0;

    @ObfuscatedName("ab.e")
    public int field308 = 0;

    @ObfuscatedName("ab.g")
    public int field309 = 0;

    @ObfuscatedName("ab.k")
    public long field298 = 0L;

    @ObfuscatedName("ab.v")
    public boolean field300 = true;

    @ObfuscatedName("ab.af")
    public int field312 = 0;

    @ObfuscatedName("ab.ad")
    public class50[] field313 = new class50[8];

    @ObfuscatedName("ab.av")
    public class50[] field314 = new class50[8];

    @ObfuscatedName("gw.i(Laa;I)V")
    public static final void method3659(class52 arg0) {
        Statics.field184 = arg0;
    }

    @ObfuscatedName("fr.e(IZII)V")
    public static final void method2976(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field338 = arg0;
        Statics.field1745 = arg1;
        Statics.field3277 = arg2;
    }

    @ObfuscatedName("ab.k(Lay;I)V")
    public final synchronized void method803(class50 arg0) {
        this.field310 = arg0;
    }

    @ObfuscatedName("ab.v(I)V")
    public final synchronized void method810() {
        if (this.field299 == null) {
            return;
        }
        long var1 = class280.method2629();
        try {
            if (this.field306 != 0L) {
                if (var1 < this.field306) {
                    return;
                }
                this.method328(this.field303);
                this.field306 = 0L;
                this.field300 = true;
            }
            int var3 = this.method333();
            if (this.field309 - var3 > this.field307) {
                this.field307 = this.field309 - var3;
            }
            int var4 = this.field305 + this.field304;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field303) {
                this.field303 += 1024;
                if (this.field303 > 16384) {
                    this.field303 = 16384;
                }
                this.method330();
                this.method328(this.field303);
                var3 = 0;
                this.field300 = true;
                if (var4 + 256 > this.field303) {
                    var4 = this.field303 - 256;
                    this.field305 = var4 - this.field304;
                }
            }
            while (var3 < var4) {
                this.method787(this.field299, 256);
                this.method329();
                var3 += 256;
            }
            if (var1 > this.field298) {
                if (this.field300) {
                    this.field300 = false;
                } else if (this.field307 == 0 && this.field308 == 0) {
                    this.method330();
                    this.field306 = var1 + 2000L;
                    return;
                } else {
                    this.field305 = Math.min(this.field308, this.field307);
                    this.field308 = this.field307;
                }
                this.field307 = 0;
                this.field298 = var1 + 2000L;
            }
            this.field309 = var3;
        } catch (Exception var8) {
            this.method330();
            this.field306 = var1 + 2000L;
        }
        try {
            if (var1 > this.field302 + 500000L) {
                var1 = this.field302;
            }
            while (var1 > this.field302 + 5000L) {
                this.method791(256);
                this.field302 += (long) (256000 / Statics.field338);
            }
        } catch (Exception var7) {
            this.field302 = var1;
        }
    }

    @ObfuscatedName("ab.aj(I)V")
    public final void method790() {
        this.field300 = true;
    }

    @ObfuscatedName("ab.an(I)V")
    public final synchronized void method784() {
        this.field300 = true;
        try {
            this.method331();
        } catch (Exception var2) {
            this.method330();
            this.field306 = class280.method2629() + 2000L;
        }
    }

    @ObfuscatedName("ab.ah(I)V")
    public final synchronized void method785() {
        if (Statics.field317 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field317.field331[var2] == this) {
                    Statics.field317.field331[var2] = null;
                }
                if (Statics.field317.field331[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field4292.shutdownNow();
                Statics.field4292 = null;
                Statics.field317 = null;
            }
        }
        this.method330();
        this.field299 = null;
    }

    @ObfuscatedName("ab.ao(IB)V")
    public final void method791(int arg0) {
        this.field312 -= arg0;
        if (this.field312 < 0) {
            this.field312 = 0;
        }
        if (this.field310 != null) {
            this.field310.method725(arg0);
        }
    }

    @ObfuscatedName("ab.ac([II)V")
    public final void method787(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1745) {
            var3 = arg1 << 1;
        }
        class371.method6541(arg0, 0, var3);
        this.field312 -= arg1;
        if (this.field310 != null && this.field312 <= 0) {
            this.field312 += Statics.field338 >> 4;
            method2011(this.field310);
            this.method807(this.field310, this.field310.method859());
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
                        class50 var11 = this.field313[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field366;
                                if (var12 == null || var12.field460 <= var8) {
                                    var11.field367 = true;
                                    int var13 = var11.method720();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field460 += var13;
                                    }
                                    if (var4 >= this.field301) {
                                        break label105;
                                    }
                                    class50 var14 = var11.method718();
                                    if (var14 != null) {
                                        int var15 = var11.field365;
                                        while (var14 != null) {
                                            this.method807(var14, var15 * var14.method859() >> 8);
                                            var14 = var11.method719();
                                        }
                                    }
                                    class50 var16 = var11.field364;
                                    var11.field364 = null;
                                    if (var10 == null) {
                                        this.field313[var7] = var16;
                                    } else {
                                        var10.field364 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field314[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field364;
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
                class50 var18 = this.field313[var17];
                class50[] var19 = this.field313;
                this.field314[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class50 var21 = var18.field364;
                    var18.field364 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field312 < 0) {
            this.field312 = 0;
        }
        if (this.field310 != null) {
            this.field310.method721(arg0, 0, arg1);
        }
        this.field302 = class280.method2629();
    }

    @ObfuscatedName("bf.af(Lay;I)V")
    public static final void method2011(class50 arg0) {
        arg0.field367 = false;
        if (arg0.field366 != null) {
            arg0.field366.field460 = 0;
        }
        for (class50 var1 = arg0.method718(); var1 != null; var1 = arg0.method719()) {
            method2011(var1);
        }
    }

    @ObfuscatedName("ab.ad(Lay;II)V")
    public final void method807(class50 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class50 var4 = this.field314[var3];
        if (var4 == null) {
            this.field313[var3] = arg0;
        } else {
            var4.field364 = arg0;
        }
        this.field314[var3] = arg0;
        arg0.field365 = arg1;
    }

    @ObfuscatedName("ab.a(I)V")
    public void method336() throws Exception {
    }

    @ObfuscatedName("ab.f(IB)V")
    public void method328(int arg0) throws Exception {
    }

    @ObfuscatedName("ab.c(I)I")
    public int method333() throws Exception {
        return this.field303;
    }

    @ObfuscatedName("ab.x()V")
    public void method329() throws Exception {
    }

    @ObfuscatedName("ab.h(I)V")
    public void method330() {
    }

    @ObfuscatedName("ab.j(B)V")
    public void method331() throws Exception {
    }
}
