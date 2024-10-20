package deob;

@ObfuscatedName("cx")
public class class96 {

    @ObfuscatedName("cx.f")
    public int[] field1300;

    @ObfuscatedName("cx.g")
    public class106 field1312;

    @ObfuscatedName("cx.m")
    public int field1299 = 32;

    @ObfuscatedName("cx.r")
    public long field1306 = class185.method3250();

    @ObfuscatedName("cx.t")
    public int field1303;

    @ObfuscatedName("cx.o")
    public int field1304;

    @ObfuscatedName("cx.y")
    public int field1307;

    @ObfuscatedName("cx.a")
    public long field1295 = 0L;

    @ObfuscatedName("cx.j")
    public int field1305 = 0;

    @ObfuscatedName("cx.d")
    public int field1308 = 0;

    @ObfuscatedName("cx.h")
    public int field1309 = 0;

    @ObfuscatedName("cx.c")
    public long field1302 = 0L;

    @ObfuscatedName("cx.v")
    public boolean field1311 = true;

    @ObfuscatedName("cx.as")
    public int field1314 = 0;

    @ObfuscatedName("cx.an")
    public class106[] field1313 = new class106[8];

    @ObfuscatedName("cx.ao")
    public class106[] field1310 = new class106[8];

    @ObfuscatedName("bs.v(IZII)V")
    public static final void method1590(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1301 = arg0;
        Statics.field1296 = arg1;
        Statics.field231 = arg2;
    }

    @ObfuscatedName("cx.ah(Ldo;I)V")
    public final synchronized void method2008(class106 arg0) {
        this.field1312 = arg0;
    }

    @ObfuscatedName("cx.ab(I)V")
    public final synchronized void method2009() {
        if (this.field1300 == null) {
            return;
        }
        long var1 = class185.method3250();
        try {
            if (this.field1295 != 0L) {
                if (var1 < this.field1295) {
                    return;
                }
                this.method640(this.field1303);
                this.field1295 = 0L;
                this.field1311 = true;
            }
            int var3 = this.method650();
            if (this.field1309 - var3 > this.field1305) {
                this.field1305 = this.field1309 - var3;
            }
            int var4 = this.field1307 + this.field1304;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1303) {
                this.field1303 += 1024;
                if (this.field1303 > 16384) {
                    this.field1303 = 16384;
                }
                this.method643();
                this.method640(this.field1303);
                var3 = 0;
                this.field1311 = true;
                if (var4 + 256 > this.field1303) {
                    var4 = this.field1303 - 256;
                    this.field1307 = var4 - this.field1304;
                }
            }
            while (var3 < var4) {
                this.method2013(this.field1300, 256);
                this.method654();
                var3 += 256;
            }
            if (var1 > this.field1302) {
                if (this.field1311) {
                    this.field1311 = false;
                } else if (this.field1305 == 0 && this.field1308 == 0) {
                    this.method643();
                    this.field1295 = var1 + 2000L;
                    return;
                } else {
                    this.field1307 = Math.min(this.field1308, this.field1305);
                    this.field1308 = this.field1305;
                }
                this.field1305 = 0;
                this.field1302 = var1 + 2000L;
            }
            this.field1309 = var3;
        } catch (Exception var8) {
            this.method643();
            this.field1295 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1306 + 500000L) {
                var1 = this.field1306;
            }
            while (var1 > this.field1306 + 5000L) {
                this.method2032(256);
                this.field1306 += (long) (256000 / Statics.field1301);
            }
        } catch (Exception var7) {
            this.field1306 = var1;
        }
    }

    @ObfuscatedName("cx.aw(I)V")
    public final void method2010() {
        this.field1311 = true;
    }

    @ObfuscatedName("cx.ak(I)V")
    public final synchronized void method2011() {
        this.field1311 = true;
        try {
            this.method644();
        } catch (Exception var2) {
            this.method643();
            this.field1295 = class185.method3250() + 2000L;
        }
    }

    @ObfuscatedName("cx.as(I)V")
    public final synchronized void method2012() {
        if (Statics.field1011 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1011.field1328[var2] == this) {
                    Statics.field1011.field1328[var2] = null;
                }
                if (Statics.field1011.field1328[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1856.shutdownNow();
                Statics.field1856 = null;
                Statics.field1011 = null;
            }
        }
        this.method643();
        this.field1300 = null;
    }

    @ObfuscatedName("cx.an(IB)V")
    public final void method2032(int arg0) {
        this.field1314 -= arg0;
        if (this.field1314 < 0) {
            this.field1314 = 0;
        }
        if (this.field1312 != null) {
            this.field1312.method1885(arg0);
        }
    }

    @ObfuscatedName("cx.ao([II)V")
    public final void method2013(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1296) {
            var3 = arg1 << 1;
        }
        class194.method3587(arg0, 0, var3);
        this.field1314 -= arg1;
        if (this.field1312 != null && this.field1314 <= 0) {
            this.field1314 += Statics.field1301 >> 4;
            method1827(this.field1312);
            this.method2028(this.field1312, this.field1312.method2106());
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
                        class106 var10 = null;
                        class106 var11 = this.field1313[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class109 var12 = var11.field1384;
                                if (var12 == null || var12.field1417 <= var8) {
                                    var11.field1386 = true;
                                    int var13 = var11.method1903();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1417 += var13;
                                    }
                                    if (var4 >= this.field1299) {
                                        break label105;
                                    }
                                    class106 var14 = var11.method1880();
                                    if (var14 != null) {
                                        int var15 = var11.field1385;
                                        while (var14 != null) {
                                            this.method2028(var14, var15 * var14.method2106() >> 8);
                                            var14 = var11.method1881();
                                        }
                                    }
                                    class106 var16 = var11.field1383;
                                    var11.field1383 = null;
                                    if (var10 == null) {
                                        this.field1313[var7] = var16;
                                    } else {
                                        var10.field1383 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1310[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1383;
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
                class106 var18 = this.field1313[var17];
                class106[] var19 = this.field1313;
                this.field1310[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class106 var21 = var18.field1383;
                    var18.field1383 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1314 < 0) {
            this.field1314 = 0;
        }
        if (this.field1312 != null) {
            this.field1312.method1883(arg0, 0, arg1);
        }
        this.field1306 = class185.method3250();
    }

    @ObfuscatedName("ce.at(Ldo;I)V")
    public static final void method1827(class106 arg0) {
        arg0.field1386 = false;
        if (arg0.field1384 != null) {
            arg0.field1384.field1417 = 0;
        }
        for (class106 var1 = arg0.method1880(); var1 != null; var1 = arg0.method1881()) {
            method1827(var1);
        }
    }

    @ObfuscatedName("cx.ai(Ldo;II)V")
    public final void method2028(class106 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class106 var4 = this.field1310[var3];
        if (var4 == null) {
            this.field1313[var3] = arg0;
        } else {
            var4.field1383 = arg0;
        }
        this.field1310[var3] = arg0;
        arg0.field1385 = arg1;
    }

    @ObfuscatedName("cx.z(I)V")
    public void method639() throws Exception {
    }

    @ObfuscatedName("cx.w(IS)V")
    public void method640(int arg0) throws Exception {
    }

    @ObfuscatedName("cx.s(B)I")
    public int method650() throws Exception {
        return this.field1303;
    }

    @ObfuscatedName("cx.l()V")
    public void method654() throws Exception {
    }

    @ObfuscatedName("cx.u(I)V")
    public void method643() {
    }

    @ObfuscatedName("cx.q(I)V")
    public void method644() throws Exception {
    }
}
