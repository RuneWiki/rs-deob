package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("cc")
public class class96 {

    @ObfuscatedName("cc.p")
    public int[] field1328;

    @ObfuscatedName("cc.g")
    public class106 field1329;

    @ObfuscatedName("cc.y")
    public int field1330 = 32;

    @ObfuscatedName("cc.c")
    public long field1335 = class185.method3151();

    @ObfuscatedName("cc.e")
    public int field1332;

    @ObfuscatedName("cc.t")
    public int field1323;

    @ObfuscatedName("cc.u")
    public int field1333;

    @ObfuscatedName("cc.i")
    public long field1321 = 0L;

    @ObfuscatedName("cc.z")
    public int field1327 = 0;

    @ObfuscatedName("cc.k")
    public int field1336 = 0;

    @ObfuscatedName("cc.r")
    public int field1338 = 0;

    @ObfuscatedName("cc.v")
    public long field1339 = 0L;

    @ObfuscatedName("cc.o")
    public boolean field1334 = true;

    @ObfuscatedName("cc.an")
    public int field1341 = 0;

    @ObfuscatedName("cc.as")
    public class106[] field1342 = new class106[8];

    @ObfuscatedName("cc.aw")
    public class106[] field1343 = new class106[8];

    @ObfuscatedName("io.ad(Lck;I)V")
    public static final void method4228(class90 arg0) {
        Statics.field1340 = arg0;
    }

    @ObfuscatedName("gb.ac(IZII)V")
    public static final void method3522(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1331 = arg0;
        Statics.field1322 = arg1;
        Statics.field1325 = arg2;
    }

    @ObfuscatedName("gn.ay(Lea;III)Lcc;")
    public static final class96 method3512(class155 arg0, int arg1, int arg2) {
        if (Statics.field1331 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class96 var3 = Statics.field1340.method672();
                var3.field1328 = new int[(Statics.field1322 ? 2 : 1) * 256];
                var3.field1323 = arg2;
                var3.method702();
                var3.field1332 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1332 > 16384) {
                    var3.field1332 = 16384;
                }
                var3.method701(var3.field1332);
                if (Statics.field1325 > 0 && Statics.field2764 == null) {
                    Statics.field2764 = new class98();
                    Statics.field1324 = Executors.newScheduledThreadPool(1);
                    Statics.field1324.scheduleAtFixedRate(Statics.field2764, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2764 != null) {
                    if (Statics.field2764.field1356[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2764.field1356[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class96();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("cc.an(Ldu;B)V")
    public final synchronized void method2057(class106 arg0) {
        this.field1329 = arg0;
    }

    @ObfuscatedName("cc.as(I)V")
    public final synchronized void method2041() {
        if (this.field1328 == null) {
            return;
        }
        long var1 = class185.method3151();
        try {
            if (this.field1321 != 0L) {
                if (var1 < this.field1321) {
                    return;
                }
                this.method701(this.field1332);
                this.field1321 = 0L;
                this.field1334 = true;
            }
            int var3 = this.method704();
            if (this.field1338 - var3 > this.field1327) {
                this.field1327 = this.field1338 - var3;
            }
            int var4 = this.field1333 + this.field1323;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1332) {
                this.field1332 += 1024;
                if (this.field1332 > 16384) {
                    this.field1332 = 16384;
                }
                this.method706();
                this.method701(this.field1332);
                var3 = 0;
                this.field1334 = true;
                if (var4 + 256 > this.field1332) {
                    var4 = this.field1332 - 256;
                    this.field1333 = var4 - this.field1323;
                }
            }
            while (var3 < var4) {
                this.method2078(this.field1328, 256);
                this.method722();
                var3 += 256;
            }
            if (var1 > this.field1339) {
                if (this.field1334) {
                    this.field1334 = false;
                } else if (this.field1327 == 0 && this.field1336 == 0) {
                    this.method706();
                    this.field1321 = var1 + 2000L;
                    return;
                } else {
                    this.field1333 = Math.min(this.field1336, this.field1327);
                    this.field1336 = this.field1327;
                }
                this.field1327 = 0;
                this.field1339 = var1 + 2000L;
            }
            this.field1338 = var3;
        } catch (Exception var8) {
            this.method706();
            this.field1321 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1335 + 500000L) {
                var1 = this.field1335;
            }
            while (var1 > this.field1335 + 5000L) {
                this.method2045(256);
                this.field1335 += (long) (256000 / Statics.field1331);
            }
        } catch (Exception var7) {
            this.field1335 = var1;
        }
    }

    @ObfuscatedName("cc.aw(I)V")
    public final void method2042() {
        this.field1334 = true;
    }

    @ObfuscatedName("cc.ag(I)V")
    public final synchronized void method2079() {
        this.field1334 = true;
        try {
            this.method707();
        } catch (Exception var2) {
            this.method706();
            this.field1321 = class185.method3151() + 2000L;
        }
    }

    @ObfuscatedName("cc.ah(I)V")
    public final synchronized void method2044() {
        if (Statics.field2764 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2764.field1356[var2] == this) {
                    Statics.field2764.field1356[var2] = null;
                }
                if (Statics.field2764.field1356[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1324.shutdownNow();
                Statics.field1324 = null;
                Statics.field2764 = null;
            }
        }
        this.method706();
        this.field1328 = null;
    }

    @ObfuscatedName("cc.az(IS)V")
    public final void method2045(int arg0) {
        this.field1341 -= arg0;
        if (this.field1341 < 0) {
            this.field1341 = 0;
        }
        if (this.field1329 != null) {
            this.field1329.method1917(arg0);
        }
    }

    @ObfuscatedName("cc.ao([II)V")
    public final void method2078(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1322) {
            var3 = arg1 << 1;
        }
        class194.method3619(arg0, 0, var3);
        this.field1341 -= arg1;
        if (this.field1329 != null && this.field1341 <= 0) {
            this.field1341 += Statics.field1331 >> 4;
            method200(this.field1329);
            this.method2046(this.field1329, this.field1329.method2249());
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
                        class106 var11 = this.field1342[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class109 var12 = var11.field1409;
                                if (var12 == null || var12.field1441 <= var8) {
                                    var11.field1410 = true;
                                    int var13 = var11.method1910();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1441 += var13;
                                    }
                                    if (var4 >= this.field1330) {
                                        break label105;
                                    }
                                    class106 var14 = var11.method1908();
                                    if (var14 != null) {
                                        int var15 = var11.field1407;
                                        while (var14 != null) {
                                            this.method2046(var14, var15 * var14.method2249() >> 8);
                                            var14 = var11.method1909();
                                        }
                                    }
                                    class106 var16 = var11.field1408;
                                    var11.field1408 = null;
                                    if (var10 == null) {
                                        this.field1342[var7] = var16;
                                    } else {
                                        var10.field1408 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1343[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1408;
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
                class106 var18 = this.field1342[var17];
                class106[] var19 = this.field1342;
                this.field1343[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class106 var21 = var18.field1408;
                    var18.field1408 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1341 < 0) {
            this.field1341 = 0;
        }
        if (this.field1329 != null) {
            this.field1329.method1945(arg0, 0, arg1);
        }
        this.field1335 = class185.method3151();
    }

    @ObfuscatedName("u.ap(Ldu;I)V")
    public static final void method200(class106 arg0) {
        arg0.field1410 = false;
        if (arg0.field1409 != null) {
            arg0.field1409.field1441 = 0;
        }
        for (class106 var1 = arg0.method1908(); var1 != null; var1 = arg0.method1909()) {
            method200(var1);
        }
    }

    @ObfuscatedName("cc.af(Ldu;II)V")
    public final void method2046(class106 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class106 var4 = this.field1343[var3];
        if (var4 == null) {
            this.field1342[var3] = arg0;
        } else {
            var4.field1408 = arg0;
        }
        this.field1343[var3] = arg0;
        arg0.field1407 = arg1;
    }

    @ObfuscatedName("cc.w(I)V")
    public void method702() throws Exception {
    }

    @ObfuscatedName("cc.m(IB)V")
    public void method701(int arg0) throws Exception {
    }

    @ObfuscatedName("cc.q(I)I")
    public int method704() throws Exception {
        return this.field1332;
    }

    @ObfuscatedName("cc.x()V")
    public void method722() throws Exception {
    }

    @ObfuscatedName("cc.j(B)V")
    public void method706() {
    }

    @ObfuscatedName("cc.a(I)V")
    public void method707() throws Exception {
    }
}
