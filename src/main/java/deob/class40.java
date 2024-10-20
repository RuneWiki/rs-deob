package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("al")
public class class40 {

    @ObfuscatedName("al.b")
    public int[] field292;

    @ObfuscatedName("al.t")
    public class46 field291;

    @ObfuscatedName("al.g")
    public int field285 = 32;

    @ObfuscatedName("al.x")
    public long field286 = class270.method2485();

    @ObfuscatedName("al.n")
    public int field287;

    @ObfuscatedName("al.e")
    public int field288;

    @ObfuscatedName("al.h")
    public int field289;

    @ObfuscatedName("al.f")
    public long field290 = 0L;

    @ObfuscatedName("al.d")
    public int field295 = 0;

    @ObfuscatedName("al.j")
    public int field283 = 0;

    @ObfuscatedName("al.z")
    public int field293 = 0;

    @ObfuscatedName("al.i")
    public long field294 = 0L;

    @ObfuscatedName("al.u")
    public boolean field282 = true;

    @ObfuscatedName("al.aj")
    public int field296 = 0;

    @ObfuscatedName("al.ae")
    public class46[] field297 = new class46[8];

    @ObfuscatedName("al.az")
    public class46[] field298 = new class46[8];

    @ObfuscatedName("ix.d(IZII)V")
    public static final void method4440(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field301 = arg0;
        Statics.field3995 = arg1;
        Statics.field173 = arg2;
    }

    @ObfuscatedName("jo.j(Lfs;IIB)Lal;")
    public static final class40 method4623(class157 arg0, int arg1, int arg2) {
        if (Statics.field301 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class40 var3 = Statics.field299.method332();
                var3.field292 = new int[(Statics.field3995 ? 2 : 1) * 256];
                var3.field288 = arg2;
                var3.method342();
                var3.field287 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field287 > 16384) {
                    var3.field287 = 16384;
                }
                var3.method343(var3.field287);
                if (Statics.field173 > 0 && Statics.field3300 == null) {
                    Statics.field3300 = new class42();
                    Statics.field1038 = Executors.newScheduledThreadPool(1);
                    Statics.field1038.scheduleAtFixedRate(Statics.field3300, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3300 != null) {
                    if (Statics.field3300.field317[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3300.field317[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class40();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("al.z(Lao;I)V")
    public final synchronized void method706(class46 arg0) {
        this.field291 = arg0;
    }

    @ObfuscatedName("al.i(I)V")
    public final synchronized void method687() {
        if (this.field292 == null) {
            return;
        }
        long var1 = class270.method2485();
        try {
            if (this.field290 != 0L) {
                if (var1 < this.field290) {
                    return;
                }
                this.method343(this.field287);
                this.field290 = 0L;
                this.field282 = true;
            }
            int var3 = this.method344();
            if (this.field293 - var3 > this.field295) {
                this.field295 = this.field293 - var3;
            }
            int var4 = this.field289 + this.field288;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field287) {
                this.field287 += 1024;
                if (this.field287 > 16384) {
                    this.field287 = 16384;
                }
                this.method346();
                this.method343(this.field287);
                var3 = 0;
                this.field282 = true;
                if (var4 + 256 > this.field287) {
                    var4 = this.field287 - 256;
                    this.field289 = var4 - this.field288;
                }
            }
            while (var3 < var4) {
                this.method691(this.field292, 256);
                this.method345();
                var3 += 256;
            }
            if (var1 > this.field294) {
                if (this.field282) {
                    this.field282 = false;
                } else if (this.field295 == 0 && this.field283 == 0) {
                    this.method346();
                    this.field290 = var1 + 2000L;
                    return;
                } else {
                    this.field289 = Math.min(this.field283, this.field295);
                    this.field283 = this.field295;
                }
                this.field295 = 0;
                this.field294 = var1 + 2000L;
            }
            this.field293 = var3;
        } catch (Exception var8) {
            this.method346();
            this.field290 = var1 + 2000L;
        }
        try {
            if (var1 > this.field286 + 500000L) {
                var1 = this.field286;
            }
            while (var1 > this.field286 + 5000L) {
                this.method693(256);
                this.field286 += (long) (256000 / Statics.field301);
            }
        } catch (Exception var7) {
            this.field286 = var1;
        }
    }

    @ObfuscatedName("al.u(I)V")
    public final void method714() {
        this.field282 = true;
    }

    @ObfuscatedName("al.ag(I)V")
    public final synchronized void method689() {
        this.field282 = true;
        try {
            this.method354();
        } catch (Exception var2) {
            this.method346();
            this.field290 = class270.method2485() + 2000L;
        }
    }

    @ObfuscatedName("al.ar(B)V")
    public final synchronized void method690() {
        if (Statics.field3300 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3300.field317[var2] == this) {
                    Statics.field3300.field317[var2] = null;
                }
                if (Statics.field3300.field317[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1038.shutdownNow();
                Statics.field1038 = null;
                Statics.field3300 = null;
            }
        }
        this.method346();
        this.field292 = null;
    }

    @ObfuscatedName("al.am(II)V")
    public final void method693(int arg0) {
        this.field296 -= arg0;
        if (this.field296 < 0) {
            this.field296 = 0;
        }
        if (this.field291 != null) {
            this.field291.method614(arg0);
        }
    }

    @ObfuscatedName("al.ac([II)V")
    public final void method691(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3995) {
            var3 = arg1 << 1;
        }
        class352.method5831(arg0, 0, var3);
        this.field296 -= arg1;
        if (this.field291 != null && this.field296 <= 0) {
            this.field296 += Statics.field301 >> 4;
            method1565(this.field291);
            this.method692(this.field291, this.field291.method769());
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
                        class46 var10 = null;
                        class46 var11 = this.field297[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class56 var12 = var11.field348;
                                if (var12 == null || var12.field449 <= var8) {
                                    var11.field351 = true;
                                    int var13 = var11.method599();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field449 += var13;
                                    }
                                    if (var4 >= this.field285) {
                                        break label105;
                                    }
                                    class46 var14 = var11.method601();
                                    if (var14 != null) {
                                        int var15 = var11.field349;
                                        while (var14 != null) {
                                            this.method692(var14, var15 * var14.method769() >> 8);
                                            var14 = var11.method602();
                                        }
                                    }
                                    class46 var16 = var11.field350;
                                    var11.field350 = null;
                                    if (var10 == null) {
                                        this.field297[var7] = var16;
                                    } else {
                                        var10.field350 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field298[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field350;
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
                class46 var18 = this.field297[var17];
                class46[] var19 = this.field297;
                this.field298[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class46 var21 = var18.field350;
                    var18.field350 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field296 < 0) {
            this.field296 = 0;
        }
        if (this.field291 != null) {
            this.field291.method604(arg0, 0, arg1);
        }
        this.field286 = class270.method2485();
    }

    @ObfuscatedName("bx.ab(Lao;B)V")
    public static final void method1565(class46 arg0) {
        arg0.field351 = false;
        if (arg0.field348 != null) {
            arg0.field348.field449 = 0;
        }
        for (class46 var1 = arg0.method601(); var1 != null; var1 = arg0.method602()) {
            method1565(var1);
        }
    }

    @ObfuscatedName("al.aj(Lao;IB)V")
    public final void method692(class46 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class46 var4 = this.field298[var3];
        if (var4 == null) {
            this.field297[var3] = arg0;
        } else {
            var4.field350 = arg0;
        }
        this.field298[var3] = arg0;
        arg0.field349 = arg1;
    }

    @ObfuscatedName("al.o(I)V")
    public void method342() throws Exception {
    }

    @ObfuscatedName("al.q(IS)V")
    public void method343(int arg0) throws Exception {
    }

    @ObfuscatedName("al.l(S)I")
    public int method344() throws Exception {
        return this.field287;
    }

    @ObfuscatedName("al.k()V")
    public void method345() throws Exception {
    }

    @ObfuscatedName("al.a(B)V")
    public void method346() {
    }

    @ObfuscatedName("al.m(I)V")
    public void method354() throws Exception {
    }
}
