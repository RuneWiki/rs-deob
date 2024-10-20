package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ct")
public class class98 {

    @ObfuscatedName("ct.a")
    public int[] field1347;

    @ObfuscatedName("ct.z")
    public class108 field1351;

    @ObfuscatedName("ct.e")
    public int field1359 = 32;

    @ObfuscatedName("ct.q")
    public long field1350 = class187.method3154();

    @ObfuscatedName("ct.j")
    public int field1363;

    @ObfuscatedName("ct.y")
    public int field1352;

    @ObfuscatedName("ct.m")
    public int field1353;

    @ObfuscatedName("ct.h")
    public long field1354 = 0L;

    @ObfuscatedName("ct.x")
    public int field1355 = 0;

    @ObfuscatedName("ct.f")
    public int field1344 = 0;

    @ObfuscatedName("ct.r")
    public int field1357 = 0;

    @ObfuscatedName("ct.n")
    public long field1358 = 0L;

    @ObfuscatedName("ct.g")
    public boolean field1362 = true;

    @ObfuscatedName("ct.av")
    public int field1360 = 0;

    @ObfuscatedName("ct.af")
    public class108[] field1361 = new class108[8];

    @ObfuscatedName("ct.ar")
    public class108[] field1349 = new class108[8];

    @ObfuscatedName("bp.ab(Lcl;I)V")
    public static final void method1069(class92 arg0) {
        Statics.field2592 = arg0;
    }

    @ObfuscatedName("ay.ao(IZIB)V")
    public static final void method528(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field66 = arg0;
        Statics.field1365 = arg1;
        Statics.field2819 = arg2;
    }

    @ObfuscatedName("o.an(Lfu;III)Lct;")
    public static final class98 method29(class157 arg0, int arg1, int arg2) {
        if (Statics.field66 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class98 var3 = Statics.field2592.method655();
                var3.field1347 = new int[(Statics.field1365 ? 2 : 1) * 256];
                var3.field1352 = arg2;
                var3.method670();
                var3.field1363 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1363 > 16384) {
                    var3.field1363 = 16384;
                }
                var3.method675(var3.field1363);
                if (Statics.field2819 > 0 && Statics.field1345 == null) {
                    Statics.field1345 = new class100();
                    Statics.field1917 = Executors.newScheduledThreadPool(1);
                    Statics.field1917.scheduleAtFixedRate(Statics.field1345, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1345 != null) {
                    if (Statics.field1345.field1377[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1345.field1377[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class98();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ct.ay(Ldm;I)V")
    public final synchronized void method2040(class108 arg0) {
        this.field1351 = arg0;
    }

    @ObfuscatedName("ct.av(I)V")
    public final synchronized void method2041() {
        if (this.field1347 == null) {
            return;
        }
        long var1 = class187.method3154();
        try {
            if (this.field1354 != 0L) {
                if (var1 < this.field1354) {
                    return;
                }
                this.method675(this.field1363);
                this.field1354 = 0L;
                this.field1362 = true;
            }
            int var3 = this.method672();
            if (this.field1357 - var3 > this.field1355) {
                this.field1355 = this.field1357 - var3;
            }
            int var4 = this.field1353 + this.field1352;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1363) {
                this.field1363 += 1024;
                if (this.field1363 > 16384) {
                    this.field1363 = 16384;
                }
                this.method674();
                this.method675(this.field1363);
                var3 = 0;
                this.field1362 = true;
                if (var4 + 256 > this.field1363) {
                    var4 = this.field1363 - 256;
                    this.field1353 = var4 - this.field1352;
                }
            }
            while (var3 < var4) {
                this.method2046(this.field1347, 256);
                this.method669();
                var3 += 256;
            }
            if (var1 > this.field1358) {
                if (this.field1362) {
                    this.field1362 = false;
                } else if (this.field1355 == 0 && this.field1344 == 0) {
                    this.method674();
                    this.field1354 = var1 + 2000L;
                    return;
                } else {
                    this.field1353 = Math.min(this.field1344, this.field1355);
                    this.field1344 = this.field1355;
                }
                this.field1355 = 0;
                this.field1358 = var1 + 2000L;
            }
            this.field1357 = var3;
        } catch (Exception var8) {
            this.method674();
            this.field1354 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1350 + 500000L) {
                var1 = this.field1350;
            }
            while (var1 > this.field1350 + 5000L) {
                this.method2045(256);
                this.field1350 += (long) (256000 / Statics.field66);
            }
        } catch (Exception var7) {
            this.field1350 = var1;
        }
    }

    @ObfuscatedName("ct.af(B)V")
    public final void method2048() {
        this.field1362 = true;
    }

    @ObfuscatedName("ct.ar(I)V")
    public final synchronized void method2043() {
        this.field1362 = true;
        try {
            this.method684();
        } catch (Exception var2) {
            this.method674();
            this.field1354 = class187.method3154() + 2000L;
        }
    }

    @ObfuscatedName("ct.am(I)V")
    public final synchronized void method2056() {
        if (Statics.field1345 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1345.field1377[var2] == this) {
                    Statics.field1345.field1377[var2] = null;
                }
                if (Statics.field1345.field1377[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1917.shutdownNow();
                Statics.field1917 = null;
                Statics.field1345 = null;
            }
        }
        this.method674();
        this.field1347 = null;
    }

    @ObfuscatedName("ct.aj(IB)V")
    public final void method2045(int arg0) {
        this.field1360 -= arg0;
        if (this.field1360 < 0) {
            this.field1360 = 0;
        }
        if (this.field1351 != null) {
            this.field1351.method1904(arg0);
        }
    }

    @ObfuscatedName("ct.aq([II)V")
    public final void method2046(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1365) {
            var3 = arg1 << 1;
        }
        class196.method3611(arg0, 0, var3);
        this.field1360 -= arg1;
        if (this.field1351 != null && this.field1360 <= 0) {
            this.field1360 += Statics.field66 >> 4;
            method3237(this.field1351);
            this.method2047(this.field1351, this.field1351.method2143());
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
                        class108 var11 = this.field1361[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class111 var12 = var11.field1434;
                                if (var12 == null || var12.field1466 <= var8) {
                                    var11.field1433 = true;
                                    int var13 = var11.method1901();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1466 += var13;
                                    }
                                    if (var4 >= this.field1359) {
                                        break label105;
                                    }
                                    class108 var14 = var11.method1899();
                                    if (var14 != null) {
                                        int var15 = var11.field1435;
                                        while (var14 != null) {
                                            this.method2047(var14, var15 * var14.method2143() >> 8);
                                            var14 = var11.method1900();
                                        }
                                    }
                                    class108 var16 = var11.field1432;
                                    var11.field1432 = null;
                                    if (var10 == null) {
                                        this.field1361[var7] = var16;
                                    } else {
                                        var10.field1432 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1349[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1432;
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
                class108 var18 = this.field1361[var17];
                class108[] var19 = this.field1361;
                this.field1349[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class108 var21 = var18.field1432;
                    var18.field1432 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1360 < 0) {
            this.field1360 = 0;
        }
        if (this.field1351 != null) {
            this.field1351.method1933(arg0, 0, arg1);
        }
        this.field1350 = class187.method3154();
    }

    @ObfuscatedName("fe.ak(Ldm;I)V")
    public static final void method3237(class108 arg0) {
        arg0.field1433 = false;
        if (arg0.field1434 != null) {
            arg0.field1434.field1466 = 0;
        }
        for (class108 var1 = arg0.method1899(); var1 != null; var1 = arg0.method1900()) {
            method3237(var1);
        }
    }

    @ObfuscatedName("ct.ax(Ldm;IB)V")
    public final void method2047(class108 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class108 var4 = this.field1349[var3];
        if (var4 == null) {
            this.field1361[var3] = arg0;
        } else {
            var4.field1432 = arg0;
        }
        this.field1349[var3] = arg0;
        arg0.field1435 = arg1;
    }

    @ObfuscatedName("ct.v(I)V")
    public void method670() throws Exception {
    }

    @ObfuscatedName("ct.s(II)V")
    public void method675(int arg0) throws Exception {
    }

    @ObfuscatedName("ct.o(I)I")
    public int method672() throws Exception {
        return this.field1363;
    }

    @ObfuscatedName("ct.k()V")
    public void method669() throws Exception {
    }

    @ObfuscatedName("ct.u(I)V")
    public void method674() {
    }

    @ObfuscatedName("ct.i(I)V")
    public void method684() throws Exception {
    }
}
