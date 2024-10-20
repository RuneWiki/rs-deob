package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("af")
public class class40 {

    @ObfuscatedName("af.u")
    public int[] field285;

    @ObfuscatedName("af.l")
    public class46 field284;

    @ObfuscatedName("af.z")
    public int field282 = 32;

    @ObfuscatedName("af.r")
    public long field295 = class270.method3146();

    @ObfuscatedName("af.y")
    public int field290;

    @ObfuscatedName("af.p")
    public int field301;

    @ObfuscatedName("af.e")
    public int field287;

    @ObfuscatedName("af.b")
    public long field288 = 0L;

    @ObfuscatedName("af.x")
    public int field289 = 0;

    @ObfuscatedName("af.f")
    public int field294 = 0;

    @ObfuscatedName("af.t")
    public int field291 = 0;

    @ObfuscatedName("af.j")
    public long field292 = 0L;

    @ObfuscatedName("af.g")
    public boolean field293 = true;

    @ObfuscatedName("af.ab")
    public int field278 = 0;

    @ObfuscatedName("af.ak")
    public class46[] field296 = new class46[8];

    @ObfuscatedName("af.au")
    public class46[] field303 = new class46[8];

    @ObfuscatedName("mr.f(Lam;I)V")
    public static final void method5608(class48 arg0) {
        Statics.field4050 = arg0;
    }

    @ObfuscatedName("fp.t(Lfu;IIB)Laf;")
    public static final class40 method2920(class157 arg0, int arg1, int arg2) {
        if (Statics.field4153 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class40 var3 = Statics.field4050.method342();
                var3.field285 = new int[256 * (Statics.field297 ? 2 : 1)];
                var3.field301 = arg2;
                var3.method358();
                var3.field290 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field290 > 16384) {
                    var3.field290 = 16384;
                }
                var3.method359(var3.field290);
                if (Statics.field280 > 0 && Statics.field1726 == null) {
                    Statics.field1726 = new class42();
                    Statics.field279 = Executors.newScheduledThreadPool(1);
                    Statics.field279.scheduleAtFixedRate(Statics.field1726, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1726 != null) {
                    if (Statics.field1726.field316[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1726.field316[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class40();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("af.j(Lah;B)V")
    public final synchronized void method667(class46 arg0) {
        this.field284 = arg0;
    }

    @ObfuscatedName("af.g(I)V")
    public final synchronized void method698() {
        if (this.field285 == null) {
            return;
        }
        long var1 = class270.method3146();
        try {
            if (this.field288 != 0L) {
                if (var1 < this.field288) {
                    return;
                }
                this.method359(this.field290);
                this.field288 = 0L;
                this.field293 = true;
            }
            int var3 = this.method360();
            if (this.field291 - var3 > this.field289) {
                this.field289 = this.field291 - var3;
            }
            int var4 = this.field301 + this.field287;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field290) {
                this.field290 += 1024;
                if (this.field290 > 16384) {
                    this.field290 = 16384;
                }
                this.method374();
                this.method359(this.field290);
                var3 = 0;
                this.field293 = true;
                if (var4 + 256 > this.field290) {
                    var4 = this.field290 - 256;
                    this.field287 = var4 - this.field301;
                }
            }
            while (var3 < var4) {
                this.method670(this.field285, 256);
                this.method361();
                var3 += 256;
            }
            if (var1 > this.field292) {
                if (this.field293) {
                    this.field293 = false;
                } else if (this.field289 == 0 && this.field294 == 0) {
                    this.method374();
                    this.field288 = var1 + 2000L;
                    return;
                } else {
                    this.field287 = Math.min(this.field294, this.field289);
                    this.field294 = this.field289;
                }
                this.field289 = 0;
                this.field292 = var1 + 2000L;
            }
            this.field291 = var3;
        } catch (Exception var8) {
            this.method374();
            this.field288 = var1 + 2000L;
        }
        try {
            if (var1 > this.field295 + 500000L) {
                var1 = this.field295;
            }
            while (var1 > this.field295 + 5000L) {
                this.method666(256);
                this.field295 += (long) (256000 / Statics.field4153);
            }
        } catch (Exception var7) {
            this.field295 = var1;
        }
    }

    @ObfuscatedName("af.ar(B)V")
    public final void method663() {
        this.field293 = true;
    }

    @ObfuscatedName("af.aq(I)V")
    public final synchronized void method664() {
        this.field293 = true;
        try {
            this.method362();
        } catch (Exception var2) {
            this.method374();
            this.field288 = class270.method3146() + 2000L;
        }
    }

    @ObfuscatedName("af.av(I)V")
    public final synchronized void method669() {
        if (Statics.field1726 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1726.field316[var2] == this) {
                    Statics.field1726.field316[var2] = null;
                }
                if (Statics.field1726.field316[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field279.shutdownNow();
                Statics.field279 = null;
                Statics.field1726 = null;
            }
        }
        this.method374();
        this.field285 = null;
    }

    @ObfuscatedName("af.aj(II)V")
    public final void method666(int arg0) {
        this.field278 -= arg0;
        if (this.field278 < 0) {
            this.field278 = 0;
        }
        if (this.field284 != null) {
            this.field284.method587(arg0);
        }
    }

    @ObfuscatedName("af.ax([II)V")
    public final void method670(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field297) {
            var3 = arg1 << 1;
        }
        class352.method5816(arg0, 0, var3);
        this.field278 -= arg1;
        if (this.field284 != null && this.field278 <= 0) {
            this.field278 += Statics.field4153 >> 4;
            Statics.method2762(this.field284);
            this.method665(this.field284, this.field284.method765());
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
                        class46 var11 = this.field296[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class56 var12 = var11.field350;
                                if (var12 == null || var12.field447 <= var8) {
                                    var11.field352 = true;
                                    int var13 = var11.method584();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field447 += var13;
                                    }
                                    if (var4 >= this.field282) {
                                        break label105;
                                    }
                                    class46 var14 = var11.method582();
                                    if (var14 != null) {
                                        int var15 = var11.field349;
                                        while (var14 != null) {
                                            this.method665(var14, var15 * var14.method765() >> 8);
                                            var14 = var11.method595();
                                        }
                                    }
                                    class46 var16 = var11.field351;
                                    var11.field351 = null;
                                    if (var10 == null) {
                                        this.field296[var7] = var16;
                                    } else {
                                        var10.field351 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field303[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field351;
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
                class46 var18 = this.field296[var17];
                class46[] var19 = this.field296;
                this.field303[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class46 var21 = var18.field351;
                    var18.field351 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field278 < 0) {
            this.field278 = 0;
        }
        if (this.field284 != null) {
            this.field284.method577(arg0, 0, arg1);
        }
        this.field295 = class270.method3146();
    }

    @ObfuscatedName("af.ak(Lah;II)V")
    public final void method665(class46 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class46 var4 = this.field303[var3];
        if (var4 == null) {
            this.field296[var3] = arg0;
        } else {
            var4.field351 = arg0;
        }
        this.field303[var3] = arg0;
        arg0.field349 = arg1;
    }

    @ObfuscatedName("af.s(I)V")
    public void method358() throws Exception {
    }

    @ObfuscatedName("af.h(IB)V")
    public void method359(int arg0) throws Exception {
    }

    @ObfuscatedName("af.w(B)I")
    public int method360() throws Exception {
        return this.field290;
    }

    @ObfuscatedName("af.v()V")
    public void method361() throws Exception {
    }

    @ObfuscatedName("af.c(B)V")
    public void method374() {
    }

    @ObfuscatedName("af.q(I)V")
    public void method362() throws Exception {
    }
}
