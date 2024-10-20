package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ch")
public class class98 {

    @ObfuscatedName("ch.v")
    public int[] field1366;

    @ObfuscatedName("ch.g")
    public class108 field1361;

    @ObfuscatedName("ch.j")
    public int field1362 = 32;

    @ObfuscatedName("ch.b")
    public long field1363 = Statics.method1926();

    @ObfuscatedName("ch.u")
    public int field1370;

    @ObfuscatedName("ch.t")
    public int field1365;

    @ObfuscatedName("ch.n")
    public int field1376;

    @ObfuscatedName("ch.h")
    public long field1367 = 0L;

    @ObfuscatedName("ch.o")
    public int field1368 = 0;

    @ObfuscatedName("ch.i")
    public int field1369 = 0;

    @ObfuscatedName("ch.k")
    public int field1360 = 0;

    @ObfuscatedName("ch.q")
    public long field1371 = 0L;

    @ObfuscatedName("ch.y")
    public boolean field1372 = true;

    @ObfuscatedName("ch.ac")
    public int field1373 = 0;

    @ObfuscatedName("ch.am")
    public class108[] field1374 = new class108[8];

    @ObfuscatedName("ch.aw")
    public class108[] field1375 = new class108[8];

    @ObfuscatedName("cj.az(IZII)V")
    public static final void method1840(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1356 = arg0;
        Statics.field2847 = arg1;
        Statics.field271 = arg2;
    }

    @ObfuscatedName("by.at(Lfd;III)Lch;")
    public static final class98 method1738(class157 arg0, int arg1, int arg2) {
        if (Statics.field1356 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class98 var3 = Statics.field1208.method657();
                var3.field1366 = new int[(Statics.field2847 ? 2 : 1) * 256];
                var3.field1365 = arg2;
                var3.method679();
                var3.field1370 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1370 > 16384) {
                    var3.field1370 = 16384;
                }
                var3.method680(var3.field1370);
                if (Statics.field271 > 0 && Statics.field1358 == null) {
                    Statics.field1358 = new class100();
                    Statics.field1961 = Executors.newScheduledThreadPool(1);
                    Statics.field1961.scheduleAtFixedRate(Statics.field1358, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1358 != null) {
                    if (Statics.field1358.field1388[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1358.field1388[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class98();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ch.ac(Ldm;B)V")
    public final synchronized void method2091(class108 arg0) {
        this.field1361 = arg0;
    }

    @ObfuscatedName("ch.am(I)V")
    public final synchronized void method2094() {
        if (this.field1366 == null) {
            return;
        }
        long var1 = Statics.method1926();
        try {
            if (this.field1367 != 0L) {
                if (var1 < this.field1367) {
                    return;
                }
                this.method680(this.field1370);
                this.field1367 = 0L;
                this.field1372 = true;
            }
            int var3 = this.method681();
            if (this.field1360 - var3 > this.field1368) {
                this.field1368 = this.field1360 - var3;
            }
            int var4 = this.field1376 + this.field1365;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1370) {
                this.field1370 += 1024;
                if (this.field1370 > 16384) {
                    this.field1370 = 16384;
                }
                this.method678();
                this.method680(this.field1370);
                var3 = 0;
                this.field1372 = true;
                if (var4 + 256 > this.field1370) {
                    var4 = this.field1370 - 256;
                    this.field1376 = var4 - this.field1365;
                }
            }
            while (var3 < var4) {
                this.method2098(this.field1366, 256);
                this.method682();
                var3 += 256;
            }
            if (var1 > this.field1371) {
                if (this.field1372) {
                    this.field1372 = false;
                } else if (this.field1368 == 0 && this.field1369 == 0) {
                    this.method678();
                    this.field1367 = var1 + 2000L;
                    return;
                } else {
                    this.field1376 = Math.min(this.field1369, this.field1368);
                    this.field1369 = this.field1368;
                }
                this.field1368 = 0;
                this.field1371 = var1 + 2000L;
            }
            this.field1360 = var3;
        } catch (Exception var8) {
            this.method678();
            this.field1367 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1363 + 500000L) {
                var1 = this.field1363;
            }
            while (var1 > this.field1363 + 5000L) {
                this.method2108(256);
                this.field1363 += (long) (256000 / Statics.field1356);
            }
        } catch (Exception var7) {
            this.field1363 = var1;
        }
    }

    @ObfuscatedName("ch.aw(I)V")
    public final void method2092() {
        this.field1372 = true;
    }

    @ObfuscatedName("ch.aa(I)V")
    public final synchronized void method2090() {
        this.field1372 = true;
        try {
            this.method684();
        } catch (Exception var2) {
            this.method678();
            this.field1367 = Statics.method1926() + 2000L;
        }
    }

    @ObfuscatedName("ch.as(I)V")
    public final synchronized void method2093() {
        if (Statics.field1358 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1358.field1388[var2] == this) {
                    Statics.field1358.field1388[var2] = null;
                }
                if (Statics.field1358.field1388[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1961.shutdownNow();
                Statics.field1961 = null;
                Statics.field1358 = null;
            }
        }
        this.method678();
        this.field1366 = null;
    }

    @ObfuscatedName("ch.al(IB)V")
    public final void method2108(int arg0) {
        this.field1373 -= arg0;
        if (this.field1373 < 0) {
            this.field1373 = 0;
        }
        if (this.field1361 != null) {
            this.field1361.method1977(arg0);
        }
    }

    @ObfuscatedName("ch.ad([II)V")
    public final void method2098(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2847) {
            var3 = arg1 << 1;
        }
        class196.method3659(arg0, 0, var3);
        this.field1373 -= arg1;
        if (this.field1361 != null && this.field1373 <= 0) {
            this.field1373 += Statics.field1356 >> 4;
            method152(this.field1361);
            this.method2095(this.field1361, this.field1361.method2265());
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
                        class108 var11 = this.field1374[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class111 var12 = var11.field1445;
                                if (var12 == null || var12.field1476 <= var8) {
                                    var11.field1444 = true;
                                    int var13 = var11.method1974();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1476 += var13;
                                    }
                                    if (var4 >= this.field1362) {
                                        break label105;
                                    }
                                    class108 var14 = var11.method1972();
                                    if (var14 != null) {
                                        int var15 = var11.field1443;
                                        while (var14 != null) {
                                            this.method2095(var14, var15 * var14.method2265() >> 8);
                                            var14 = var11.method1982();
                                        }
                                    }
                                    class108 var16 = var11.field1442;
                                    var11.field1442 = null;
                                    if (var10 == null) {
                                        this.field1374[var7] = var16;
                                    } else {
                                        var10.field1442 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1375[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1442;
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
                class108 var18 = this.field1374[var17];
                class108[] var19 = this.field1374;
                this.field1375[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class108 var21 = var18.field1442;
                    var18.field1442 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1373 < 0) {
            this.field1373 = 0;
        }
        if (this.field1361 != null) {
            this.field1361.method1975(arg0, 0, arg1);
        }
        this.field1363 = Statics.method1926();
    }

    @ObfuscatedName("j.ax(Ldm;B)V")
    public static final void method152(class108 arg0) {
        arg0.field1444 = false;
        if (arg0.field1445 != null) {
            arg0.field1445.field1476 = 0;
        }
        for (class108 var1 = arg0.method1972(); var1 != null; var1 = arg0.method1982()) {
            method152(var1);
        }
    }

    @ObfuscatedName("ch.ao(Ldm;II)V")
    public final void method2095(class108 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class108 var4 = this.field1375[var3];
        if (var4 == null) {
            this.field1374[var3] = arg0;
        } else {
            var4.field1442 = arg0;
        }
        this.field1375[var3] = arg0;
        arg0.field1443 = arg1;
    }

    @ObfuscatedName("ch.f(I)V")
    public void method679() throws Exception {
    }

    @ObfuscatedName("ch.l(II)V")
    public void method680(int arg0) throws Exception {
    }

    @ObfuscatedName("ch.w(I)I")
    public int method681() throws Exception {
        return this.field1370;
    }

    @ObfuscatedName("ch.s()V")
    public void method682() throws Exception {
    }

    @ObfuscatedName("ch.e(B)V")
    public void method678() {
    }

    @ObfuscatedName("ch.c(I)V")
    public void method684() throws Exception {
    }
}
