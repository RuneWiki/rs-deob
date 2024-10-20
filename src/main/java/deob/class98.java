package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("cq")
public class class98 {

    @ObfuscatedName("cq.j")
    public int[] field1363;

    @ObfuscatedName("cq.x")
    public class108 field1364;

    @ObfuscatedName("cq.v")
    public int field1365 = 32;

    @ObfuscatedName("cq.h")
    public long field1362 = class187.method2664();

    @ObfuscatedName("cq.f")
    public int field1366;

    @ObfuscatedName("cq.a")
    public int field1368;

    @ObfuscatedName("cq.t")
    public int field1369;

    @ObfuscatedName("cq.k")
    public long field1370 = 0L;

    @ObfuscatedName("cq.z")
    public int field1371 = 0;

    @ObfuscatedName("cq.s")
    public int field1372 = 0;

    @ObfuscatedName("cq.y")
    public int field1373 = 0;

    @ObfuscatedName("cq.u")
    public long field1376 = 0L;

    @ObfuscatedName("cq.o")
    public boolean field1375 = true;

    @ObfuscatedName("cq.ac")
    public int field1380 = 0;

    @ObfuscatedName("cq.az")
    public class108[] field1367 = new class108[8];

    @ObfuscatedName("cq.aj")
    public class108[] field1377 = new class108[8];

    @ObfuscatedName("bg.an(IZII)V")
    public static final void method1575(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1378 = arg0;
        Statics.field265 = arg1;
        Statics.field190 = arg2;
    }

    @ObfuscatedName("by.ax(Lff;IIB)Lcq;")
    public static final class98 method1733(class157 arg0, int arg1, int arg2) {
        if (Statics.field1378 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class98 var3 = Statics.field1037.method686();
                var3.field1363 = new int[(Statics.field265 ? 2 : 1) * 256];
                var3.field1368 = arg2;
                var3.method716();
                var3.field1366 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1366 > 16384) {
                    var3.field1366 = 16384;
                }
                var3.method717(var3.field1366);
                if (Statics.field190 > 0 && Statics.field2847 == null) {
                    Statics.field2847 = new class100();
                    Statics.field1156 = Executors.newScheduledThreadPool(1);
                    Statics.field1156.scheduleAtFixedRate(Statics.field2847, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2847 != null) {
                    if (Statics.field2847.field1392[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2847.field1392[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class98();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cq.aw(Ldz;I)V")
    public final synchronized void method2239(class108 arg0) {
        this.field1364 = arg0;
    }

    @ObfuscatedName("cq.ae(B)V")
    public final synchronized void method2209() {
        if (this.field1363 == null) {
            return;
        }
        long var1 = class187.method2664();
        try {
            if (this.field1370 != 0L) {
                if (var1 < this.field1370) {
                    return;
                }
                this.method717(this.field1366);
                this.field1370 = 0L;
                this.field1375 = true;
            }
            int var3 = this.method718();
            if (this.field1373 - var3 > this.field1371) {
                this.field1371 = this.field1373 - var3;
            }
            int var4 = this.field1369 + this.field1368;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1366) {
                this.field1366 += 1024;
                if (this.field1366 > 16384) {
                    this.field1366 = 16384;
                }
                this.method725();
                this.method717(this.field1366);
                var3 = 0;
                this.field1375 = true;
                if (var4 + 256 > this.field1366) {
                    var4 = this.field1366 - 256;
                    this.field1369 = var4 - this.field1368;
                }
            }
            while (var3 < var4) {
                this.method2214(this.field1363, 256);
                this.method719();
                var3 += 256;
            }
            if (var1 > this.field1376) {
                if (this.field1375) {
                    this.field1375 = false;
                } else if (this.field1371 == 0 && this.field1372 == 0) {
                    this.method725();
                    this.field1370 = var1 + 2000L;
                    return;
                } else {
                    this.field1369 = Math.min(this.field1372, this.field1371);
                    this.field1372 = this.field1371;
                }
                this.field1371 = 0;
                this.field1376 = var1 + 2000L;
            }
            this.field1373 = var3;
        } catch (Exception var8) {
            this.method725();
            this.field1370 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1362 + 500000L) {
                var1 = this.field1362;
            }
            while (var1 > this.field1362 + 5000L) {
                this.method2213(256);
                this.field1362 += (long) (256000 / Statics.field1378);
            }
        } catch (Exception var7) {
            this.field1362 = var1;
        }
    }

    @ObfuscatedName("cq.ac(I)V")
    public final void method2210() {
        this.field1375 = true;
    }

    @ObfuscatedName("cq.az(I)V")
    public final synchronized void method2211() {
        this.field1375 = true;
        try {
            this.method731();
        } catch (Exception var2) {
            this.method725();
            this.field1370 = class187.method2664() + 2000L;
        }
    }

    @ObfuscatedName("cq.aj(I)V")
    public final synchronized void method2244() {
        if (Statics.field2847 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2847.field1392[var2] == this) {
                    Statics.field2847.field1392[var2] = null;
                }
                if (Statics.field2847.field1392[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1156.shutdownNow();
                Statics.field1156 = null;
                Statics.field2847 = null;
            }
        }
        this.method725();
        this.field1363 = null;
    }

    @ObfuscatedName("cq.ag(II)V")
    public final void method2213(int arg0) {
        this.field1380 -= arg0;
        if (this.field1380 < 0) {
            this.field1380 = 0;
        }
        if (this.field1364 != null) {
            this.field1364.method2089(arg0);
        }
    }

    @ObfuscatedName("cq.ab([II)V")
    public final void method2214(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field265) {
            var3 = arg1 << 1;
        }
        class196.method3791(arg0, 0, var3);
        this.field1380 -= arg1;
        if (this.field1364 != null && this.field1380 <= 0) {
            this.field1380 += Statics.field1378 >> 4;
            method1051(this.field1364);
            this.method2215(this.field1364, this.field1364.method2306());
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
                        class108 var11 = this.field1367[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class111 var12 = var11.field1443;
                                if (var12 == null || var12.field1477 <= var8) {
                                    var11.field1446 = true;
                                    int var13 = var11.method2086();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1477 += var13;
                                    }
                                    if (var4 >= this.field1365) {
                                        break label105;
                                    }
                                    class108 var14 = var11.method2084();
                                    if (var14 != null) {
                                        int var15 = var11.field1444;
                                        while (var14 != null) {
                                            this.method2215(var14, var15 * var14.method2306() >> 8);
                                            var14 = var11.method2085();
                                        }
                                    }
                                    class108 var16 = var11.field1445;
                                    var11.field1445 = null;
                                    if (var10 == null) {
                                        this.field1367[var7] = var16;
                                    } else {
                                        var10.field1445 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1377[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1445;
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
                class108 var18 = this.field1367[var17];
                class108[] var19 = this.field1367;
                this.field1377[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class108 var21 = var18.field1445;
                    var18.field1445 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1380 < 0) {
            this.field1380 = 0;
        }
        if (this.field1364 != null) {
            this.field1364.method2087(arg0, 0, arg1);
        }
        this.field1362 = class187.method2664();
    }

    @ObfuscatedName("bq.ar(Ldz;I)V")
    public static final void method1051(class108 arg0) {
        arg0.field1446 = false;
        if (arg0.field1443 != null) {
            arg0.field1443.field1477 = 0;
        }
        for (class108 var1 = arg0.method2084(); var1 != null; var1 = arg0.method2085()) {
            method1051(var1);
        }
    }

    @ObfuscatedName("cq.at(Ldz;II)V")
    public final void method2215(class108 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class108 var4 = this.field1377[var3];
        if (var4 == null) {
            this.field1367[var3] = arg0;
        } else {
            var4.field1445 = arg0;
        }
        this.field1377[var3] = arg0;
        arg0.field1444 = arg1;
    }

    @ObfuscatedName("cq.g(I)V")
    public void method716() throws Exception {
    }

    @ObfuscatedName("cq.r(IB)V")
    public void method717(int arg0) throws Exception {
    }

    @ObfuscatedName("cq.e(I)I")
    public int method718() throws Exception {
        return this.field1366;
    }

    @ObfuscatedName("cq.q()V")
    public void method719() throws Exception {
    }

    @ObfuscatedName("cq.c(I)V")
    public void method725() {
    }

    @ObfuscatedName("cq.i(I)V")
    public void method731() throws Exception {
    }
}
