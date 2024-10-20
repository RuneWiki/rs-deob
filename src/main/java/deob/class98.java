package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("cy")
public class class98 {

    @ObfuscatedName("cy.p")
    public int[] field1358;

    @ObfuscatedName("cy.n")
    public class108 field1359;

    @ObfuscatedName("cy.t")
    public int field1367 = 32;

    @ObfuscatedName("cy.r")
    public long field1368 = class187.method918();

    @ObfuscatedName("cy.x")
    public int field1364;

    @ObfuscatedName("cy.b")
    public int field1363;

    @ObfuscatedName("cy.w")
    public int field1354;

    @ObfuscatedName("cy.e")
    public long field1365 = 0L;

    @ObfuscatedName("cy.a")
    public int field1366 = 0;

    @ObfuscatedName("cy.z")
    public int field1378 = 0;

    @ObfuscatedName("cy.y")
    public int field1362 = 0;

    @ObfuscatedName("cy.u")
    public long field1361 = 0L;

    @ObfuscatedName("cy.f")
    public boolean field1377 = true;

    @ObfuscatedName("cy.af")
    public int field1374 = 0;

    @ObfuscatedName("cy.ah")
    public class108[] field1369 = new class108[8];

    @ObfuscatedName("cy.ab")
    public class108[] field1376 = new class108[8];

    @ObfuscatedName("iy.y(Lch;I)V")
    public static final void method4206(class92 arg0) {
        Statics.field1357 = arg0;
    }

    @ObfuscatedName("hb.u(Lfo;III)Lcy;")
    public static final class98 method3955(class157 arg0, int arg1, int arg2) {
        if (Statics.field2434 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class98 var3 = Statics.field1357.method666();
                var3.field1358 = new int[(Statics.field1375 ? 2 : 1) * 256];
                var3.field1363 = arg2;
                var3.method681();
                var3.field1364 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1364 > 16384) {
                    var3.field1364 = 16384;
                }
                var3.method679(var3.field1364);
                if (Statics.field3809 > 0 && Statics.field1356 == null) {
                    Statics.field1356 = new class100();
                    Statics.field3216 = Executors.newScheduledThreadPool(1);
                    Statics.field3216.scheduleAtFixedRate(Statics.field1356, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1356 != null) {
                    if (Statics.field1356.field1391[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1356.field1391[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class98();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cy.f(Ldd;I)V")
    public final synchronized void method1992(class108 arg0) {
        this.field1359 = arg0;
    }

    @ObfuscatedName("cy.at(I)V")
    public final synchronized void method2002() {
        if (this.field1358 == null) {
            return;
        }
        long var1 = class187.method918();
        try {
            if (this.field1365 != 0L) {
                if (var1 < this.field1365) {
                    return;
                }
                this.method679(this.field1364);
                this.field1365 = 0L;
                this.field1377 = true;
            }
            int var3 = this.method682();
            if (this.field1362 - var3 > this.field1366) {
                this.field1366 = this.field1362 - var3;
            }
            int var4 = this.field1363 + this.field1354;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1364) {
                this.field1364 += 1024;
                if (this.field1364 > 16384) {
                    this.field1364 = 16384;
                }
                this.method680();
                this.method679(this.field1364);
                var3 = 0;
                this.field1377 = true;
                if (var4 + 256 > this.field1364) {
                    var4 = this.field1364 - 256;
                    this.field1354 = var4 - this.field1363;
                }
            }
            while (var3 < var4) {
                this.method1997(this.field1358, 256);
                this.method683();
                var3 += 256;
            }
            if (var1 > this.field1361) {
                if (this.field1377) {
                    this.field1377 = false;
                } else if (this.field1366 == 0 && this.field1378 == 0) {
                    this.method680();
                    this.field1365 = var1 + 2000L;
                    return;
                } else {
                    this.field1354 = Math.min(this.field1378, this.field1366);
                    this.field1378 = this.field1366;
                }
                this.field1366 = 0;
                this.field1361 = var1 + 2000L;
            }
            this.field1362 = var3;
        } catch (Exception var8) {
            this.method680();
            this.field1365 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1368 + 500000L) {
                var1 = this.field1368;
            }
            while (var1 > this.field1368 + 5000L) {
                this.method2022(256);
                this.field1368 += (long) (256000 / Statics.field2434);
            }
        } catch (Exception var7) {
            this.field1368 = var1;
        }
    }

    @ObfuscatedName("cy.ay(B)V")
    public final void method1994() {
        this.field1377 = true;
    }

    @ObfuscatedName("cy.ak(I)V")
    public final synchronized void method1995() {
        this.field1377 = true;
        try {
            this.method685();
        } catch (Exception var2) {
            this.method680();
            this.field1365 = class187.method918() + 2000L;
        }
    }

    @ObfuscatedName("cy.az(I)V")
    public final synchronized void method1996() {
        if (Statics.field1356 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1356.field1391[var2] == this) {
                    Statics.field1356.field1391[var2] = null;
                }
                if (Statics.field1356.field1391[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3216.shutdownNow();
                Statics.field3216 = null;
                Statics.field1356 = null;
            }
        }
        this.method680();
        this.field1358 = null;
    }

    @ObfuscatedName("cy.aj(IB)V")
    public final void method2022(int arg0) {
        this.field1374 -= arg0;
        if (this.field1374 < 0) {
            this.field1374 = 0;
        }
        if (this.field1359 != null) {
            this.field1359.method1872(arg0);
        }
    }

    @ObfuscatedName("cy.af([II)V")
    public final void method1997(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1375) {
            var3 = arg1 << 1;
        }
        class196.method3575(arg0, 0, var3);
        this.field1374 -= arg1;
        if (this.field1359 != null && this.field1374 <= 0) {
            this.field1374 += Statics.field2434 >> 4;
            method767(this.field1359);
            this.method2013(this.field1359, this.field1359.method2085());
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
                        class108 var11 = this.field1369[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class111 var12 = var11.field1449;
                                if (var12 == null || var12.field1481 <= var8) {
                                    var11.field1450 = true;
                                    int var13 = var11.method1875();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1481 += var13;
                                    }
                                    if (var4 >= this.field1367) {
                                        break label105;
                                    }
                                    class108 var14 = var11.method1879();
                                    if (var14 != null) {
                                        int var15 = var11.field1447;
                                        while (var14 != null) {
                                            this.method2013(var14, var15 * var14.method2085() >> 8);
                                            var14 = var11.method1874();
                                        }
                                    }
                                    class108 var16 = var11.field1448;
                                    var11.field1448 = null;
                                    if (var10 == null) {
                                        this.field1369[var7] = var16;
                                    } else {
                                        var10.field1448 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1376[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1448;
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
                class108 var18 = this.field1369[var17];
                class108[] var19 = this.field1369;
                this.field1376[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class108 var21 = var18.field1448;
                    var18.field1448 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1374 < 0) {
            this.field1374 = 0;
        }
        if (this.field1359 != null) {
            this.field1359.method1893(arg0, 0, arg1);
        }
        this.field1368 = class187.method918();
    }

    @ObfuscatedName("am.ah(Ldd;I)V")
    public static final void method767(class108 arg0) {
        arg0.field1450 = false;
        if (arg0.field1449 != null) {
            arg0.field1449.field1481 = 0;
        }
        for (class108 var1 = arg0.method1879(); var1 != null; var1 = arg0.method1874()) {
            method767(var1);
        }
    }

    @ObfuscatedName("cy.ab(Ldd;II)V")
    public final void method2013(class108 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class108 var4 = this.field1376[var3];
        if (var4 == null) {
            this.field1369[var3] = arg0;
        } else {
            var4.field1448 = arg0;
        }
        this.field1376[var3] = arg0;
        arg0.field1447 = arg1;
    }

    @ObfuscatedName("cy.c(I)V")
    public void method681() throws Exception {
    }

    @ObfuscatedName("cy.q(II)V")
    public void method679(int arg0) throws Exception {
    }

    @ObfuscatedName("cy.m(B)I")
    public int method682() throws Exception {
        return this.field1364;
    }

    @ObfuscatedName("cy.j()V")
    public void method683() throws Exception {
    }

    @ObfuscatedName("cy.g(I)V")
    public void method680() {
    }

    @ObfuscatedName("cy.i(I)V")
    public void method685() throws Exception {
    }
}
