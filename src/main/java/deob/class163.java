package deob;

import java.awt.Component;

@ObfuscatedName("at")
public class class163 {

    @ObfuscatedName("at.f")
    public int field2441 = 0;

    @ObfuscatedName("at.e")
    public int field2437;

    @ObfuscatedName("at.a")
    public class182 field2434;

    @ObfuscatedName("at.o")
    public int field2452;

    @ObfuscatedName("at.k")
    public long field2436 = class42.method1378();

    @ObfuscatedName("at.h")
    public int field2442 = 0;

    @ObfuscatedName("at.w")
    public long field2444 = 0L;

    @ObfuscatedName("at.u")
    public int field2431 = 32;

    @ObfuscatedName("at.t")
    public int field2435 = 0;

    @ObfuscatedName("at.s")
    public long field2440 = 0L;

    @ObfuscatedName("at.r")
    public boolean field2445 = true;

    @ObfuscatedName("at.p")
    public int field2439;

    @ObfuscatedName("at.y")
    public int[] field2433;

    @ObfuscatedName("at.ax")
    public int field2446 = 0;

    @ObfuscatedName("at.ao")
    public class182[] field2447 = new class182[8];

    @ObfuscatedName("at.ah")
    public class182[] field2448 = new class182[8];

    @ObfuscatedName("at.as(B)V")
    public final synchronized void method2922() {
        if (this.field2433 == null) {
            return;
        }
        long var1 = class42.method1378();
        try {
            if (this.field2440 != 0L) {
                if (var1 < this.field2440) {
                    return;
                }
                this.method2860(this.field2437);
                this.field2440 = 0L;
                this.field2445 = true;
            }
            int var3 = this.method2876();
            if (this.field2435 - var3 > this.field2441) {
                this.field2441 = this.field2435 - var3;
            }
            int var4 = this.field2452 + this.field2439;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field2437) {
                this.field2437 += 1024;
                if (this.field2437 > 16384) {
                    this.field2437 = 16384;
                }
                this.method2863();
                this.method2860(this.field2437);
                var3 = 0;
                this.field2445 = true;
                if (var4 + 256 > this.field2437) {
                    var4 = this.field2437 - 256;
                    this.field2452 = var4 - this.field2439;
                }
            }
            while (var3 < var4) {
                this.method2926(this.field2433, 256);
                this.method2862();
                var3 += 256;
            }
            if (var1 > this.field2444) {
                if (this.field2445) {
                    this.field2445 = false;
                } else if (this.field2441 == 0 && this.field2442 == 0) {
                    this.method2863();
                    this.field2440 = var1 + 2000L;
                    return;
                } else {
                    this.field2452 = Math.min(this.field2442, this.field2441);
                    this.field2442 = this.field2441;
                }
                this.field2441 = 0;
                this.field2444 = var1 + 2000L;
            }
            this.field2435 = var3;
        } catch (Exception var8) {
            this.method2863();
            this.field2440 = var1 + 2000L;
        }
        try {
            if (var1 > this.field2436 + 500000L) {
                var1 = this.field2436;
            }
            while (var1 > this.field2436 + 5000L) {
                this.method2923(256);
                this.field2436 += (long) (256000 / Statics.field1914);
            }
        } catch (Exception var7) {
            this.field2436 = var1;
        }
    }

    @ObfuscatedName("at.ah(IB)V")
    public final void method2923(int arg0) {
        this.field2446 -= arg0;
        if (this.field2446 < 0) {
            this.field2446 = 0;
        }
        if (this.field2434 != null) {
            this.field2434.method549(arg0);
        }
    }

    @ObfuscatedName("at.ax(I)V")
    public final synchronized void method2924() {
        this.field2445 = true;
        try {
            this.method2867();
        } catch (Exception var2) {
            this.method2863();
            this.field2440 = class42.method1378() + 2000L;
        }
    }

    @ObfuscatedName("at.q(Lab;B)V")
    public final synchronized void method2925(class182 arg0) {
        this.field2434 = arg0;
    }

    @ObfuscatedName("at.aa([II)V")
    public final void method2926(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1773) {
            var3 = arg1 << 1;
        }
        class37.method713(arg0, 0, var3);
        this.field2446 -= arg1;
        if (this.field2434 != null && this.field2446 <= 0) {
            this.field2446 += Statics.field1914 >> 4;
            method956(this.field2434);
            this.method2927(this.field2434, this.field2434.method3265());
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
                        class182 var10 = null;
                        class182 var11 = this.field2447[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class183 var12 = var11.field2810;
                                if (var12 == null || var12.field2814 <= var8) {
                                    var11.field2813 = true;
                                    int var13 = var11.method560();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2814 += var13;
                                    }
                                    if (var4 >= this.field2431) {
                                        break label105;
                                    }
                                    class182 var14 = var11.method545();
                                    if (var14 != null) {
                                        int var15 = var11.field2811;
                                        while (var14 != null) {
                                            this.method2927(var14, var15 * var14.method3265() >> 8);
                                            var14 = var11.method555();
                                        }
                                    }
                                    class182 var16 = var11.field2812;
                                    var11.field2812 = null;
                                    if (var10 == null) {
                                        this.field2447[var7] = var16;
                                    } else {
                                        var10.field2812 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2448[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2812;
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
                class182 var18 = this.field2447[var17];
                class182[] var19 = this.field2447;
                this.field2448[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class182 var21 = var18.field2812;
                    var18.field2812 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field2446 < 0) {
            this.field2446 = 0;
        }
        if (this.field2434 != null) {
            this.field2434.method548(arg0, 0, arg1);
        }
        this.field2436 = class42.method1378();
    }

    @ObfuscatedName("at.ar(Lab;IB)V")
    public final void method2927(class182 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class182 var4 = this.field2448[var3];
        if (var4 == null) {
            this.field2447[var3] = arg0;
        } else {
            var4.field2812 = arg0;
        }
        this.field2448[var3] = arg0;
        arg0.field2811 = arg1;
    }

    @ObfuscatedName("at.v(Ljava/awt/Component;)V")
    public void method2859(Component arg0) throws Exception {
    }

    @ObfuscatedName("at.c(I)V")
    public void method2860(int arg0) throws Exception {
    }

    @ObfuscatedName("at.ao(B)V")
    public final synchronized void method2929() {
        if (Statics.field2432 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2432.field1869[var2] == this) {
                    Statics.field2432.field1869[var2] = null;
                }
                if (Statics.field2432.field1869[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2432.field1871 = true;
                while (Statics.field2432.field1872) {
                    class134.method1468(50L);
                }
                Statics.field2432 = null;
            }
        }
        this.method2863();
        this.field2433 = null;
    }

    @ObfuscatedName("at.m()V")
    public void method2863() {
    }

    @ObfuscatedName("at.z()V")
    public void method2867() throws Exception {
    }

    @ObfuscatedName("at.b()I")
    public int method2876() throws Exception {
        return this.field2437;
    }

    @ObfuscatedName("at.ac(I)V")
    public final void method2938() {
        this.field2445 = true;
    }

    @ObfuscatedName("at.i()V")
    public void method2862() throws Exception {
    }

    @ObfuscatedName("c.an(Lab;I)V")
    public static final void method956(class182 arg0) {
        arg0.field2813 = false;
        if (arg0.field2810 != null) {
            arg0.field2810.field2814 = 0;
        }
        for (class182 var1 = arg0.method545(); var1 != null; var1 = arg0.method555()) {
            method956(var1);
        }
    }

    @ObfuscatedName("j.n(Lbc;Ljava/awt/Component;IIB)Lat;")
    public static final class163 method1138(class130 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1914 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class161 var4 = new class161();
                var4.field2433 = new int[256 * (Statics.field1773 ? 2 : 1)];
                var4.field2439 = arg3;
                var4.method2859(arg1);
                var4.field2437 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field2437 > 16384) {
                    var4.field2437 = 16384;
                }
                var4.method2860(var4.field2437);
                if (Statics.field534 > 0 && Statics.field2432 == null) {
                    Statics.field2432 = new class124();
                    Statics.field2432.field1870 = arg0;
                    arg0.method2224(Statics.field2432, Statics.field534);
                }
                if (Statics.field2432 != null) {
                    if (Statics.field2432.field1869[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2432.field1869[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class176 var6 = new class176(arg0, arg2);
                    var6.field2433 = new int[256 * (Statics.field1773 ? 2 : 1)];
                    var6.field2439 = arg3;
                    var6.method2859(arg1);
                    var6.field2437 = 16384;
                    var6.method2860(var6.field2437);
                    if (Statics.field534 > 0 && Statics.field2432 == null) {
                        Statics.field2432 = new class124();
                        Statics.field2432.field1870 = arg0;
                        arg0.method2224(Statics.field2432, Statics.field534);
                    }
                    if (Statics.field2432 != null) {
                        if (Statics.field2432.field1869[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2432.field1869[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class163();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
