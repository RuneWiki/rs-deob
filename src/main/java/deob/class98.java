package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("cy")
public class class98 {

    @ObfuscatedName("cy.q")
    public int[] field1353;

    @ObfuscatedName("cy.l")
    public class108 field1354;

    @ObfuscatedName("cy.f")
    public int field1355 = 32;

    @ObfuscatedName("cy.z")
    public long field1367 = class187.method1700();

    @ObfuscatedName("cy.a")
    public int field1357;

    @ObfuscatedName("cy.x")
    public int field1349;

    @ObfuscatedName("cy.b")
    public int field1351;

    @ObfuscatedName("cy.w")
    public long field1363 = 0L;

    @ObfuscatedName("cy.g")
    public int field1361 = 0;

    @ObfuscatedName("cy.d")
    public int field1358 = 0;

    @ObfuscatedName("cy.m")
    public int field1366 = 0;

    @ObfuscatedName("cy.t")
    public long field1364 = 0L;

    @ObfuscatedName("cy.h")
    public boolean field1360 = true;

    @ObfuscatedName("cy.ag")
    public int field1362 = 0;

    @ObfuscatedName("cy.av")
    public class108[] field1368 = new class108[8];

    @ObfuscatedName("cy.am")
    public class108[] field1369 = new class108[8];

    @ObfuscatedName("be.ah(IZII)V")
    public static final void method1673(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field56 = arg0;
        Statics.field1359 = arg1;
        Statics.field1365 = arg2;
    }

    @ObfuscatedName("et.ad(Lft;III)Lcy;")
    public static final class98 method2914(class157 arg0, int arg1, int arg2) {
        if (Statics.field56 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class98 var3 = Statics.field1109.method643();
                var3.field1353 = new int[(Statics.field1359 ? 2 : 1) * 256];
                var3.field1349 = arg2;
                var3.method672();
                var3.field1357 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1357 > 16384) {
                    var3.field1357 = 16384;
                }
                var3.method673(var3.field1357);
                if (Statics.field1365 > 0 && Statics.field1352 == null) {
                    Statics.field1352 = new class100();
                    Statics.field1389 = Executors.newScheduledThreadPool(1);
                    Statics.field1389.scheduleAtFixedRate(Statics.field1352, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1352 != null) {
                    if (Statics.field1352.field1382[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1352.field1382[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class98();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cy.aa(Ldt;I)V")
    public final synchronized void method2057(class108 arg0) {
        this.field1354 = arg0;
    }

    @ObfuscatedName("cy.ag(I)V")
    public final synchronized void method2041() {
        if (this.field1353 == null) {
            return;
        }
        long var1 = class187.method1700();
        try {
            if (this.field1363 != 0L) {
                if (var1 < this.field1363) {
                    return;
                }
                this.method673(this.field1357);
                this.field1363 = 0L;
                this.field1360 = true;
            }
            int var3 = this.method674();
            if (this.field1366 - var3 > this.field1361) {
                this.field1361 = this.field1366 - var3;
            }
            int var4 = this.field1351 + this.field1349;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1357) {
                this.field1357 += 1024;
                if (this.field1357 > 16384) {
                    this.field1357 = 16384;
                }
                this.method676();
                this.method673(this.field1357);
                var3 = 0;
                this.field1360 = true;
                if (var4 + 256 > this.field1357) {
                    var4 = this.field1357 - 256;
                    this.field1351 = var4 - this.field1349;
                }
            }
            while (var3 < var4) {
                this.method2046(this.field1353, 256);
                this.method680();
                var3 += 256;
            }
            if (var1 > this.field1364) {
                if (this.field1360) {
                    this.field1360 = false;
                } else if (this.field1361 == 0 && this.field1358 == 0) {
                    this.method676();
                    this.field1363 = var1 + 2000L;
                    return;
                } else {
                    this.field1351 = Math.min(this.field1358, this.field1361);
                    this.field1358 = this.field1361;
                }
                this.field1361 = 0;
                this.field1364 = var1 + 2000L;
            }
            this.field1366 = var3;
        } catch (Exception var8) {
            this.method676();
            this.field1363 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1367 + 500000L) {
                var1 = this.field1367;
            }
            while (var1 > this.field1367 + 5000L) {
                this.method2040(256);
                this.field1367 += (long) (256000 / Statics.field56);
            }
        } catch (Exception var7) {
            this.field1367 = var1;
        }
    }

    @ObfuscatedName("cy.av(I)V")
    public final void method2050() {
        this.field1360 = true;
    }

    @ObfuscatedName("cy.am(I)V")
    public final synchronized void method2043() {
        this.field1360 = true;
        try {
            this.method679();
        } catch (Exception var2) {
            this.method676();
            this.field1363 = class187.method1700() + 2000L;
        }
    }

    @ObfuscatedName("cy.ap(B)V")
    public final synchronized void method2044() {
        if (Statics.field1352 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1352.field1382[var2] == this) {
                    Statics.field1352.field1382[var2] = null;
                }
                if (Statics.field1352.field1382[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1389.shutdownNow();
                Statics.field1389 = null;
                Statics.field1352 = null;
            }
        }
        this.method676();
        this.field1353 = null;
    }

    @ObfuscatedName("cy.au(IB)V")
    public final void method2040(int arg0) {
        this.field1362 -= arg0;
        if (this.field1362 < 0) {
            this.field1362 = 0;
        }
        if (this.field1354 != null) {
            this.field1354.method1958(arg0);
        }
    }

    @ObfuscatedName("cy.ae([II)V")
    public final void method2046(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1359) {
            var3 = arg1 << 1;
        }
        class196.method3612(arg0, 0, var3);
        this.field1362 -= arg1;
        if (this.field1354 != null && this.field1362 <= 0) {
            this.field1362 += Statics.field56 >> 4;
            method989(this.field1354);
            this.method2047(this.field1354, this.field1354.method2125());
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
                        class108 var10 = null;
                        class108 var11 = this.field1368[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class111 var12 = var11.field1432;
                                if (var12 == null || var12.field1466 <= var8) {
                                    var11.field1435 = true;
                                    int var13 = var11.method1936();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1466 += var13;
                                    }
                                    if (var4 >= this.field1355) {
                                        break label105;
                                    }
                                    class108 var14 = var11.method1928();
                                    if (var14 != null) {
                                        int var15 = var11.field1433;
                                        while (var14 != null) {
                                            this.method2047(var14, var15 * var14.method2125() >> 8);
                                            var14 = var11.method1929();
                                        }
                                    }
                                    class108 var16 = var11.field1434;
                                    var11.field1434 = null;
                                    if (var10 == null) {
                                        this.field1368[var7] = var16;
                                    } else {
                                        var10.field1434 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1369[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1434;
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
                class108 var18 = this.field1368[var17];
                class108[] var19 = this.field1368;
                this.field1369[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class108 var21 = var18.field1434;
                    var18.field1434 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1362 < 0) {
            this.field1362 = 0;
        }
        if (this.field1354 != null) {
            this.field1354.method1931(arg0, 0, arg1);
        }
        this.field1367 = class187.method1700();
    }

    @ObfuscatedName("bk.ai(Ldt;B)V")
    public static final void method989(class108 arg0) {
        arg0.field1435 = false;
        if (arg0.field1432 != null) {
            arg0.field1432.field1466 = 0;
        }
        for (class108 var1 = arg0.method1928(); var1 != null; var1 = arg0.method1929()) {
            method989(var1);
        }
    }

    @ObfuscatedName("cy.ab(Ldt;IB)V")
    public final void method2047(class108 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class108 var4 = this.field1369[var3];
        if (var4 == null) {
            this.field1368[var3] = arg0;
        } else {
            var4.field1434 = arg0;
        }
        this.field1369[var3] = arg0;
        arg0.field1433 = arg1;
    }

    @ObfuscatedName("cy.y(I)V")
    public void method672() throws Exception {
    }

    @ObfuscatedName("cy.c(II)V")
    public void method673(int arg0) throws Exception {
    }

    @ObfuscatedName("cy.n(I)I")
    public int method674() throws Exception {
        return this.field1357;
    }

    @ObfuscatedName("cy.u()V")
    public void method680() throws Exception {
    }

    @ObfuscatedName("cy.i(I)V")
    public void method676() {
    }

    @ObfuscatedName("cy.p(I)V")
    public void method679() throws Exception {
    }
}
