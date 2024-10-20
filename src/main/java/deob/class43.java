package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ak")
public class class43 {

    @ObfuscatedName("ak.m")
    public int[] field309;

    @ObfuscatedName("ak.t")
    public class49 field310;

    @ObfuscatedName("ak.h")
    public int field311 = 32;

    @ObfuscatedName("ak.p")
    public long field312 = class287.method3099();

    @ObfuscatedName("ak.o")
    public int field306;

    @ObfuscatedName("ak.u")
    public int field314;

    @ObfuscatedName("ak.x")
    public int field325;

    @ObfuscatedName("ak.a")
    public long field307 = 0L;

    @ObfuscatedName("ak.q")
    public int field317 = 0;

    @ObfuscatedName("ak.d")
    public int field318 = 0;

    @ObfuscatedName("ak.e")
    public int field319 = 0;

    @ObfuscatedName("ak.g")
    public long field320 = 0L;

    @ObfuscatedName("ak.y")
    public boolean field308 = true;

    @ObfuscatedName("ak.ar")
    public int field323 = 0;

    @ObfuscatedName("ak.al")
    public class49[] field324 = new class49[8];

    @ObfuscatedName("ak.at")
    public class49[] field315 = new class49[8];

    @ObfuscatedName("md.a(IZII)V")
    public static final void method6208(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field3322 = arg0;
        Statics.field321 = arg1;
        Statics.field3011 = arg2;
    }

    @ObfuscatedName("bd.q(Lfg;III)Lak;")
    public static final class43 method1821(class168 arg0, int arg1, int arg2) {
        if (Statics.field3322 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field1782.method312();
                var3.field309 = new int[256 * (Statics.field321 ? 2 : 1)];
                var3.field314 = arg2;
                var3.method325();
                var3.field306 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field306 > 16384) {
                    var3.field306 = 16384;
                }
                var3.method335(var3.field306);
                if (Statics.field3011 > 0 && Statics.field3037 == null) {
                    Statics.field3037 = new class45();
                    Statics.field316 = Executors.newScheduledThreadPool(1);
                    Statics.field316.scheduleAtFixedRate(Statics.field3037, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3037 != null) {
                    if (Statics.field3037.field341[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3037.field341[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ak.d(Lan;I)V")
    public final synchronized void method772(class49 arg0) {
        this.field310 = arg0;
    }

    @ObfuscatedName("ak.e(I)V")
    public final synchronized void method773() {
        if (this.field309 == null) {
            return;
        }
        long var1 = class287.method3099();
        try {
            if (this.field307 != 0L) {
                if (var1 < this.field307) {
                    return;
                }
                this.method335(this.field306);
                this.field307 = 0L;
                this.field308 = true;
            }
            int var3 = this.method327();
            if (this.field319 - var3 > this.field317) {
                this.field317 = this.field319 - var3;
            }
            int var4 = this.field325 + this.field314;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field306) {
                this.field306 += 1024;
                if (this.field306 > 16384) {
                    this.field306 = 16384;
                }
                this.method329();
                this.method335(this.field306);
                var3 = 0;
                this.field308 = true;
                if (var4 + 256 > this.field306) {
                    var4 = this.field306 - 256;
                    this.field325 = var4 - this.field314;
                }
            }
            while (var3 < var4) {
                this.method777(this.field309, 256);
                this.method328();
                var3 += 256;
            }
            if (var1 > this.field320) {
                if (this.field308) {
                    this.field308 = false;
                } else if (this.field317 == 0 && this.field318 == 0) {
                    this.method329();
                    this.field307 = var1 + 2000L;
                    return;
                } else {
                    this.field325 = Math.min(this.field318, this.field317);
                    this.field318 = this.field317;
                }
                this.field317 = 0;
                this.field320 = var1 + 2000L;
            }
            this.field319 = var3;
        } catch (Exception var8) {
            this.method329();
            this.field307 = var1 + 2000L;
        }
        try {
            if (var1 > this.field312 + 500000L) {
                var1 = this.field312;
            }
            while (var1 > this.field312 + 5000L) {
                this.method794(256);
                this.field312 += (long) (256000 / Statics.field3322);
            }
        } catch (Exception var7) {
            this.field312 = var1;
        }
    }

    @ObfuscatedName("ak.g(I)V")
    public final void method776() {
        this.field308 = true;
    }

    @ObfuscatedName("ak.y(I)V")
    public final synchronized void method775() {
        this.field308 = true;
        try {
            this.method330();
        } catch (Exception var2) {
            this.method329();
            this.field307 = class287.method3099() + 2000L;
        }
    }

    @ObfuscatedName("ak.af(S)V")
    public final synchronized void method803() {
        if (Statics.field3037 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3037.field341[var2] == this) {
                    Statics.field3037.field341[var2] = null;
                }
                if (Statics.field3037.field341[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field316.shutdownNow();
                Statics.field316 = null;
                Statics.field3037 = null;
            }
        }
        this.method329();
        this.field309 = null;
    }

    @ObfuscatedName("ak.aa(II)V")
    public final void method794(int arg0) {
        this.field323 -= arg0;
        if (this.field323 < 0) {
            this.field323 = 0;
        }
        if (this.field310 != null) {
            this.field310.method703(arg0);
        }
    }

    @ObfuscatedName("ak.ai([II)V")
    public final void method777(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field321) {
            var3 = arg1 << 1;
        }
        class378.method6762(arg0, 0, var3);
        this.field323 -= arg1;
        if (this.field310 != null && this.field323 <= 0) {
            this.field323 += Statics.field3322 >> 4;
            method452(this.field310);
            this.method778(this.field310, this.field310.method979());
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
                        class49 var10 = null;
                        class49 var11 = this.field324[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field369;
                                if (var12 == null || var12.field467 <= var8) {
                                    var11.field371 = true;
                                    int var13 = var11.method702();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field467 += var13;
                                    }
                                    if (var4 >= this.field311) {
                                        break label105;
                                    }
                                    class49 var14 = var11.method714();
                                    if (var14 != null) {
                                        int var15 = var11.field370;
                                        while (var14 != null) {
                                            this.method778(var14, var15 * var14.method979() >> 8);
                                            var14 = var11.method699();
                                        }
                                    }
                                    class49 var16 = var11.field372;
                                    var11.field372 = null;
                                    if (var10 == null) {
                                        this.field324[var7] = var16;
                                    } else {
                                        var10.field372 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field315[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field372;
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
                class49 var18 = this.field324[var17];
                class49[] var19 = this.field324;
                this.field315[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class49 var21 = var18.field372;
                    var18.field372 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field323 < 0) {
            this.field323 = 0;
        }
        if (this.field310 != null) {
            this.field310.method710(arg0, 0, arg1);
        }
        this.field312 = class287.method3099();
    }

    @ObfuscatedName("ar.ag(Lan;I)V")
    public static final void method452(class49 arg0) {
        arg0.field371 = false;
        if (arg0.field369 != null) {
            arg0.field369.field467 = 0;
        }
        for (class49 var1 = arg0.method714(); var1 != null; var1 = arg0.method699()) {
            method452(var1);
        }
    }

    @ObfuscatedName("ak.aw(Lan;II)V")
    public final void method778(class49 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class49 var4 = this.field315[var3];
        if (var4 == null) {
            this.field324[var3] = arg0;
        } else {
            var4.field372 = arg0;
        }
        this.field315[var3] = arg0;
        arg0.field370 = arg1;
    }

    @ObfuscatedName("ak.f(I)V")
    public void method325() throws Exception {
    }

    @ObfuscatedName("ak.w(II)V")
    public void method335(int arg0) throws Exception {
    }

    @ObfuscatedName("ak.v(I)I")
    public int method327() throws Exception {
        return this.field306;
    }

    @ObfuscatedName("ak.s()V")
    public void method328() throws Exception {
    }

    @ObfuscatedName("ak.z(I)V")
    public void method329() {
    }

    @ObfuscatedName("ak.j(I)V")
    public void method330() throws Exception {
    }
}
