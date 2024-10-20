package deob;

import java.awt.Component;

@ObfuscatedName("b")
public class class18 {

    @ObfuscatedName("b.r")
    public int[] field260;

    @ObfuscatedName("b.d")
    public class130 field256;

    @ObfuscatedName("b.k")
    public int field244 = 32;

    @ObfuscatedName("b.u")
    public long field257 = class64.method535();

    @ObfuscatedName("b.v")
    public int field240;

    @ObfuscatedName("b.f")
    public int field247;

    @ObfuscatedName("b.s")
    public int field248;

    @ObfuscatedName("b.j")
    public long field249 = 0L;

    @ObfuscatedName("b.e")
    public int field237 = 0;

    @ObfuscatedName("b.t")
    public int field251 = 0;

    @ObfuscatedName("b.y")
    public int field252 = 0;

    @ObfuscatedName("b.b")
    public long field253 = 0L;

    @ObfuscatedName("b.w")
    public boolean field254 = true;

    @ObfuscatedName("b.i")
    public int field255 = 0;

    @ObfuscatedName("b.m")
    public class130[] field261 = new class130[8];

    @ObfuscatedName("b.ai")
    public class130[] field262 = new class130[8];

    @ObfuscatedName("ft.q(Lan;Ljava/awt/Component;III)Lb;")
    public static final class18 method2505(class35 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field354 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class114 var4 = new class114();
                var4.field260 = new int[(Statics.field243 ? 2 : 1) * 256];
                var4.field247 = arg3;
                var4.method194(arg1);
                var4.field240 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field240 > 16384) {
                    var4.field240 = 16384;
                }
                var4.method195(var4.field240);
                if (Statics.field238 > 0 && Statics.field239 == null) {
                    Statics.field239 = new class20();
                    Statics.field239.field291 = arg0;
                    arg0.method426(Statics.field239, Statics.field238);
                }
                if (Statics.field239 != null) {
                    if (Statics.field239.field290[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field239.field290[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class113 var6 = new class113(arg0, arg2);
                    var6.field260 = new int[(Statics.field243 ? 2 : 1) * 256];
                    var6.field247 = arg3;
                    var6.method194(arg1);
                    var6.field240 = 16384;
                    var6.method195(var6.field240);
                    if (Statics.field238 > 0 && Statics.field239 == null) {
                        Statics.field239 = new class20();
                        Statics.field239.field291 = arg0;
                        arg0.method426(Statics.field239, Statics.field238);
                    }
                    if (Statics.field239 != null) {
                        if (Statics.field239.field290[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field239.field290[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class18();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("b.l(Ldr;I)V")
    public final synchronized void method210(class130 arg0) {
        this.field256 = arg0;
    }

    @ObfuscatedName("b.a(I)V")
    public final synchronized void method187() {
        if (this.field260 == null) {
            return;
        }
        long var1 = class64.method535();
        try {
            if (this.field249 != 0L) {
                if (var1 < this.field249) {
                    return;
                }
                this.method195(this.field240);
                this.field249 = 0L;
                this.field254 = true;
            }
            int var3 = this.method196();
            if (this.field252 - var3 > this.field237) {
                this.field237 = this.field252 - var3;
            }
            int var4 = this.field248 + this.field247;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field240) {
                this.field240 += 1024;
                if (this.field240 > 16384) {
                    this.field240 = 16384;
                }
                this.method217();
                this.method195(this.field240);
                var3 = 0;
                this.field254 = true;
                if (var4 + 256 > this.field240) {
                    var4 = this.field240 - 256;
                    this.field248 = var4 - this.field247;
                }
            }
            while (var3 < var4) {
                this.method216(this.field260, 256);
                this.method197();
                var3 += 256;
            }
            if (var1 > this.field253) {
                if (this.field254) {
                    this.field254 = false;
                } else if (this.field237 == 0 && this.field251 == 0) {
                    this.method217();
                    this.field249 = var1 + 2000L;
                    return;
                } else {
                    this.field248 = Math.min(this.field251, this.field237);
                    this.field251 = this.field237;
                }
                this.field237 = 0;
                this.field253 = var1 + 2000L;
            }
            this.field252 = var3;
        } catch (Exception var8) {
            this.method217();
            this.field249 = var1 + 2000L;
        }
        try {
            if (var1 > this.field257 + 500000L) {
                var1 = this.field257;
            }
            while (var1 > this.field257 + 5000L) {
                this.method191(256);
                this.field257 += (long) (256000 / Statics.field354);
            }
        } catch (Exception var7) {
            this.field257 = var1;
        }
    }

    @ObfuscatedName("b.o(B)V")
    public final void method188() {
        this.field254 = true;
    }

    @ObfuscatedName("b.c(I)V")
    public final synchronized void method200() {
        this.field254 = true;
        try {
            this.method199();
        } catch (Exception var2) {
            this.method217();
            this.field249 = class64.method535() + 2000L;
        }
    }

    @ObfuscatedName("b.h(I)V")
    public final synchronized void method190() {
        if (Statics.field239 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field239.field290[var2] == this) {
                    Statics.field239.field290[var2] = null;
                }
                if (Statics.field239.field290[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field239.field292 = true;
                while (Statics.field239.field293) {
                    class68.method86(50L);
                }
                Statics.field239 = null;
            }
        }
        this.method217();
        this.field260 = null;
    }

    @ObfuscatedName("b.r(II)V")
    public final void method191(int arg0) {
        this.field255 -= arg0;
        if (this.field255 < 0) {
            this.field255 = 0;
        }
        if (this.field256 != null) {
            this.field256.method1515(arg0);
        }
    }

    @ObfuscatedName("b.d([II)V")
    public final void method216(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field243) {
            var3 = arg1 << 1;
        }
        class69.method867(arg0, 0, var3);
        this.field255 -= arg1;
        if (this.field256 != null && this.field255 <= 0) {
            this.field255 += Statics.field354 >> 4;
            method540(this.field256);
            this.method193(this.field256, this.field256.method1509());
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
                        class130 var10 = null;
                        class130 var11 = this.field261[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class129 var12 = var11.field1639;
                                if (var12 == null || var12.field1638 <= var8) {
                                    var11.field1642 = true;
                                    int var13 = var11.method1512();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1638 += var13;
                                    }
                                    if (var4 >= this.field244) {
                                        break label105;
                                    }
                                    class130 var14 = var11.method1527();
                                    if (var14 != null) {
                                        int var15 = var11.field1640;
                                        while (var14 != null) {
                                            this.method193(var14, var15 * var14.method1509() >> 8);
                                            var14 = var11.method1511();
                                        }
                                    }
                                    class130 var16 = var11.field1641;
                                    var11.field1641 = null;
                                    if (var10 == null) {
                                        this.field261[var7] = var16;
                                    } else {
                                        var10.field1641 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field262[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1641;
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
                class130 var18 = this.field261[var17];
                class130[] var19 = this.field261;
                this.field262[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class130 var21 = var18.field1641;
                    var18.field1641 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field255 < 0) {
            this.field255 = 0;
        }
        if (this.field256 != null) {
            this.field256.method1514(arg0, 0, arg1);
        }
        this.field257 = class64.method535();
    }

    @ObfuscatedName("av.k(Ldr;I)V")
    public static final void method540(class130 arg0) {
        arg0.field1642 = false;
        if (arg0.field1639 != null) {
            arg0.field1639.field1638 = 0;
        }
        for (class130 var1 = arg0.method1527(); var1 != null; var1 = arg0.method1511()) {
            method540(var1);
        }
    }

    @ObfuscatedName("b.u(Ldr;II)V")
    public final void method193(class130 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class130 var4 = this.field262[var3];
        if (var4 == null) {
            this.field261[var3] = arg0;
        } else {
            var4.field1641 = arg0;
        }
        this.field262[var3] = arg0;
        arg0.field1640 = arg1;
    }

    @ObfuscatedName("b.v(Ljava/awt/Component;)V")
    public void method194(Component arg0) throws Exception {
    }

    @ObfuscatedName("b.f(I)V")
    public void method195(int arg0) throws Exception {
    }

    @ObfuscatedName("b.s()I")
    public int method196() throws Exception {
        return this.field240;
    }

    @ObfuscatedName("b.j()V")
    public void method197() throws Exception {
    }

    @ObfuscatedName("b.e()V")
    public void method217() {
    }

    @ObfuscatedName("b.t()V")
    public void method199() throws Exception {
    }
}
