package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ca")
public class class98 {

    @ObfuscatedName("ca.m")
    public int[] field1345;

    @ObfuscatedName("ca.q")
    public class108 field1346;

    @ObfuscatedName("ca.x")
    public int field1357 = 32;

    @ObfuscatedName("ca.u")
    public long field1348 = class187.method2864();

    @ObfuscatedName("ca.o")
    public int field1349;

    @ObfuscatedName("ca.t")
    public int field1347;

    @ObfuscatedName("ca.v")
    public int field1351;

    @ObfuscatedName("ca.p")
    public long field1360 = 0L;

    @ObfuscatedName("ca.z")
    public int field1353 = 0;

    @ObfuscatedName("ca.j")
    public int field1354 = 0;

    @ObfuscatedName("ca.i")
    public int field1355 = 0;

    @ObfuscatedName("ca.c")
    public long field1356 = 0L;

    @ObfuscatedName("ca.y")
    public boolean field1344 = true;

    @ObfuscatedName("ca.aa")
    public int field1359 = 0;

    @ObfuscatedName("ca.ag")
    public class108[] field1362 = new class108[8];

    @ObfuscatedName("ca.aj")
    public class108[] field1361 = new class108[8];

    @ObfuscatedName("o.al(IZII)V")
    public static final void method211(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field3801 = arg0;
        Statics.field1350 = arg1;
        Statics.field1342 = arg2;
    }

    @ObfuscatedName("bf.ax(Lfc;IIB)Lca;")
    public static final class98 method1717(class157 arg0, int arg1, int arg2) {
        if (Statics.field3801 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class98 var3 = Statics.field1230.method640();
                var3.field1345 = new int[256 * (Statics.field1350 ? 2 : 1)];
                var3.field1347 = arg2;
                var3.method656();
                var3.field1349 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1349 > 16384) {
                    var3.field1349 = 16384;
                }
                var3.method657(var3.field1349);
                if (Statics.field1342 > 0 && Statics.field2028 == null) {
                    Statics.field2028 = new class100();
                    Statics.field1341 = Executors.newScheduledThreadPool(1);
                    Statics.field1341.scheduleAtFixedRate(Statics.field2028, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2028 != null) {
                    if (Statics.field2028.field1374[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2028.field1374[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class98();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ca.ay(Lde;B)V")
    public final synchronized void method2039(class108 arg0) {
        this.field1346 = arg0;
    }

    @ObfuscatedName("ca.aa(I)V")
    public final synchronized void method2040() {
        if (this.field1345 == null) {
            return;
        }
        long var1 = class187.method2864();
        try {
            if (this.field1360 != 0L) {
                if (var1 < this.field1360) {
                    return;
                }
                this.method657(this.field1349);
                this.field1360 = 0L;
                this.field1344 = true;
            }
            int var3 = this.method659();
            if (this.field1355 - var3 > this.field1353) {
                this.field1353 = this.field1355 - var3;
            }
            int var4 = this.field1351 + this.field1347;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1349) {
                this.field1349 += 1024;
                if (this.field1349 > 16384) {
                    this.field1349 = 16384;
                }
                this.method663();
                this.method657(this.field1349);
                var3 = 0;
                this.field1344 = true;
                if (var4 + 256 > this.field1349) {
                    var4 = this.field1349 - 256;
                    this.field1351 = var4 - this.field1347;
                }
            }
            while (var3 < var4) {
                this.method2045(this.field1345, 256);
                this.method671();
                var3 += 256;
            }
            if (var1 > this.field1356) {
                if (this.field1344) {
                    this.field1344 = false;
                } else if (this.field1353 == 0 && this.field1354 == 0) {
                    this.method663();
                    this.field1360 = var1 + 2000L;
                    return;
                } else {
                    this.field1351 = Math.min(this.field1354, this.field1353);
                    this.field1354 = this.field1353;
                }
                this.field1353 = 0;
                this.field1356 = var1 + 2000L;
            }
            this.field1355 = var3;
        } catch (Exception var8) {
            this.method663();
            this.field1360 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1348 + 500000L) {
                var1 = this.field1348;
            }
            while (var1 > this.field1348 + 5000L) {
                this.method2044(256);
                this.field1348 += (long) (256000 / Statics.field3801);
            }
        } catch (Exception var7) {
            this.field1348 = var1;
        }
    }

    @ObfuscatedName("ca.ag(I)V")
    public final void method2041() {
        this.field1344 = true;
    }

    @ObfuscatedName("ca.aj(I)V")
    public final synchronized void method2042() {
        this.field1344 = true;
        try {
            this.method661();
        } catch (Exception var2) {
            this.method663();
            this.field1360 = class187.method2864() + 2000L;
        }
    }

    @ObfuscatedName("ca.an(I)V")
    public final synchronized void method2043() {
        if (Statics.field2028 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2028.field1374[var2] == this) {
                    Statics.field2028.field1374[var2] = null;
                }
                if (Statics.field2028.field1374[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1341.shutdownNow();
                Statics.field1341 = null;
                Statics.field2028 = null;
            }
        }
        this.method663();
        this.field1345 = null;
    }

    @ObfuscatedName("ca.ap(II)V")
    public final void method2044(int arg0) {
        this.field1359 -= arg0;
        if (this.field1359 < 0) {
            this.field1359 = 0;
        }
        if (this.field1346 != null) {
            this.field1346.method1919(arg0);
        }
    }

    @ObfuscatedName("ca.am([II)V")
    public final void method2045(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1350) {
            var3 = arg1 << 1;
        }
        class196.method3646(arg0, 0, var3);
        this.field1359 -= arg1;
        if (this.field1346 != null && this.field1359 <= 0) {
            this.field1359 += Statics.field3801 >> 4;
            method5053(this.field1346);
            this.method2056(this.field1346, this.field1346.method2131());
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
                        class108 var11 = this.field1362[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class111 var12 = var11.field1430;
                                if (var12 == null || var12.field1462 <= var8) {
                                    var11.field1431 = true;
                                    int var13 = var11.method1908();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1462 += var13;
                                    }
                                    if (var4 >= this.field1357) {
                                        break label105;
                                    }
                                    class108 var14 = var11.method1914();
                                    if (var14 != null) {
                                        int var15 = var11.field1428;
                                        while (var14 != null) {
                                            this.method2056(var14, var15 * var14.method2131() >> 8);
                                            var14 = var11.method1915();
                                        }
                                    }
                                    class108 var16 = var11.field1429;
                                    var11.field1429 = null;
                                    if (var10 == null) {
                                        this.field1362[var7] = var16;
                                    } else {
                                        var10.field1429 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1361[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1429;
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
                class108 var18 = this.field1362[var17];
                class108[] var19 = this.field1362;
                this.field1361[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class108 var21 = var18.field1429;
                    var18.field1429 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1359 < 0) {
            this.field1359 = 0;
        }
        if (this.field1346 != null) {
            this.field1346.method1917(arg0, 0, arg1);
        }
        this.field1348 = class187.method2864();
    }

    @ObfuscatedName("kf.ae(Lde;I)V")
    public static final void method5053(class108 arg0) {
        arg0.field1431 = false;
        if (arg0.field1430 != null) {
            arg0.field1430.field1462 = 0;
        }
        for (class108 var1 = arg0.method1914(); var1 != null; var1 = arg0.method1915()) {
            method5053(var1);
        }
    }

    @ObfuscatedName("ca.ac(Lde;II)V")
    public final void method2056(class108 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class108 var4 = this.field1361[var3];
        if (var4 == null) {
            this.field1362[var3] = arg0;
        } else {
            var4.field1429 = arg0;
        }
        this.field1361[var3] = arg0;
        arg0.field1428 = arg1;
    }

    @ObfuscatedName("ca.f(I)V")
    public void method656() throws Exception {
    }

    @ObfuscatedName("ca.h(IB)V")
    public void method657(int arg0) throws Exception {
    }

    @ObfuscatedName("ca.e(I)I")
    public int method659() throws Exception {
        return this.field1349;
    }

    @ObfuscatedName("ca.b()V")
    public void method671() throws Exception {
    }

    @ObfuscatedName("ca.l(B)V")
    public void method663() {
    }

    @ObfuscatedName("ca.w(I)V")
    public void method661() throws Exception {
    }
}
