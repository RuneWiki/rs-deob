package deob;

@ObfuscatedName("bq")
public class class53 {

    @ObfuscatedName("bq.k")
    public int[] field419;

    @ObfuscatedName("bq.g")
    public class59 field400;

    @ObfuscatedName("bq.t")
    public int field401 = 32;

    @ObfuscatedName("bq.x")
    public long field402 = class381.method4000();

    @ObfuscatedName("bq.u")
    public int field403;

    @ObfuscatedName("bq.q")
    public int field404;

    @ObfuscatedName("bq.s")
    public int field397;

    @ObfuscatedName("bq.p")
    public long field406 = 0L;

    @ObfuscatedName("bq.c")
    public int field413 = 0;

    @ObfuscatedName("bq.n")
    public int field408 = 0;

    @ObfuscatedName("bq.l")
    public int field414 = 0;

    @ObfuscatedName("bq.w")
    public long field410 = 0L;

    @ObfuscatedName("bq.a")
    public boolean field416 = true;

    @ObfuscatedName("bq.az")
    public int field412 = 0;

    @ObfuscatedName("bq.ap")
    public class59[] field409 = new class59[8];

    @ObfuscatedName("bq.ag")
    public class59[] field407 = new class59[8];

    @ObfuscatedName("ll.c(Lba;I)V")
    public static final void method5287(class61 arg0) {
        Statics.field4062 = arg0;
    }

    @ObfuscatedName("bq.l(Lbc;B)V")
    public final synchronized void method672(class59 arg0) {
        this.field400 = arg0;
    }

    @ObfuscatedName("bq.w(I)V")
    public final synchronized void method684() {
        if (this.field419 == null) {
            return;
        }
        long var1 = class381.method4000();
        try {
            if (this.field406 != 0L) {
                if (var1 < this.field406) {
                    return;
                }
                this.method338(this.field403);
                this.field406 = 0L;
                this.field416 = true;
            }
            int var3 = this.method336();
            if (this.field414 - var3 > this.field413) {
                this.field413 = this.field414 - var3;
            }
            int var4 = this.field404 + this.field397;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field403) {
                this.field403 += 1024;
                if (this.field403 > 16384) {
                    this.field403 = 16384;
                }
                this.method356();
                this.method338(this.field403);
                var3 = 0;
                this.field416 = true;
                if (var4 + 256 > this.field403) {
                    var4 = this.field403 - 256;
                    this.field397 = var4 - this.field404;
                }
            }
            while (var3 < var4) {
                this.method676(this.field419, 256);
                this.method354();
                var3 += 256;
            }
            if (var1 > this.field410) {
                if (this.field416) {
                    this.field416 = false;
                } else if (this.field413 == 0 && this.field408 == 0) {
                    this.method356();
                    this.field406 = var1 + 2000L;
                    return;
                } else {
                    this.field397 = Math.min(this.field408, this.field413);
                    this.field408 = this.field413;
                }
                this.field413 = 0;
                this.field410 = var1 + 2000L;
            }
            this.field414 = var3;
        } catch (Exception var8) {
            this.method356();
            this.field406 = var1 + 2000L;
        }
        try {
            if (var1 > this.field402 + 500000L) {
                var1 = this.field402;
            }
            while (var1 > this.field402 + 5000L) {
                this.method675(256);
                this.field402 += (long) (256000 / Statics.field3922);
            }
        } catch (Exception var7) {
            this.field402 = var1;
        }
    }

    @ObfuscatedName("bq.a(I)V")
    public final void method678() {
        this.field416 = true;
    }

    @ObfuscatedName("bq.aw(I)V")
    public final synchronized void method702() {
        this.field416 = true;
        try {
            this.method342();
        } catch (Exception var2) {
            this.method356();
            this.field406 = class381.method4000() + 2000L;
        }
    }

    @ObfuscatedName("bq.ak(I)V")
    public final synchronized void method674() {
        if (Statics.field1008 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1008.field437[var2] == this) {
                    Statics.field1008.field437[var2] = null;
                }
                if (Statics.field1008.field437[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field399.shutdownNow();
                Statics.field399 = null;
                Statics.field1008 = null;
            }
        }
        this.method356();
        this.field419 = null;
    }

    @ObfuscatedName("bq.ad(IB)V")
    public final void method675(int arg0) {
        this.field412 -= arg0;
        if (this.field412 < 0) {
            this.field412 = 0;
        }
        if (this.field400 != null) {
            this.field400.method599(arg0);
        }
    }

    @ObfuscatedName("bq.at([II)V")
    public final void method676(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field411) {
            var3 = arg1 << 1;
        }
        class308.method5044(arg0, 0, var3);
        this.field412 -= arg1;
        if (this.field400 != null && this.field412 <= 0) {
            this.field412 += Statics.field3922 >> 4;
            method4501(this.field400);
            this.method677(this.field400, this.field400.method754());
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
                        class59 var10 = null;
                        class59 var11 = this.field409[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field472;
                                if (var12 == null || var12.field566 <= var8) {
                                    var11.field475 = true;
                                    int var13 = var11.method596();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field566 += var13;
                                    }
                                    if (var4 >= this.field401) {
                                        break label105;
                                    }
                                    class59 var14 = var11.method594();
                                    if (var14 != null) {
                                        int var15 = var11.field474;
                                        while (var14 != null) {
                                            this.method677(var14, var15 * var14.method754() >> 8);
                                            var14 = var11.method595();
                                        }
                                    }
                                    class59 var16 = var11.field473;
                                    var11.field473 = null;
                                    if (var10 == null) {
                                        this.field409[var7] = var16;
                                    } else {
                                        var10.field473 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field407[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field473;
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
                class59 var18 = this.field409[var17];
                class59[] var19 = this.field409;
                this.field407[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class59 var21 = var18.field473;
                    var18.field473 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field412 < 0) {
            this.field412 = 0;
        }
        if (this.field400 != null) {
            this.field400.method616(arg0, 0, arg1);
        }
        this.field402 = class381.method4000();
    }

    @ObfuscatedName("jq.ah(Lbc;I)V")
    public static final void method4501(class59 arg0) {
        arg0.field475 = false;
        if (arg0.field472 != null) {
            arg0.field472.field566 = 0;
        }
        for (class59 var1 = arg0.method594(); var1 != null; var1 = arg0.method595()) {
            method4501(var1);
        }
    }

    @ObfuscatedName("bq.az(Lbc;II)V")
    public final void method677(class59 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class59 var4 = this.field407[var3];
        if (var4 == null) {
            this.field409[var3] = arg0;
        } else {
            var4.field473 = arg0;
        }
        this.field407[var3] = arg0;
        arg0.field474 = arg1;
    }

    @ObfuscatedName("bq.f(B)V")
    public void method348() throws Exception {
    }

    @ObfuscatedName("bq.e(II)V")
    public void method338(int arg0) throws Exception {
    }

    @ObfuscatedName("bq.v(B)I")
    public int method336() throws Exception {
        return this.field403;
    }

    @ObfuscatedName("bq.y()V")
    public void method354() throws Exception {
    }

    @ObfuscatedName("bq.j(I)V")
    public void method356() {
    }

    @ObfuscatedName("bq.o(I)V")
    public void method342() throws Exception {
    }
}
