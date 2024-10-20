package deob;

import java.awt.Component;

@ObfuscatedName("d")
public class class18 {

    @ObfuscatedName("d.l")
    public int[] field238;

    @ObfuscatedName("d.i")
    public class129 field253;

    @ObfuscatedName("d.e")
    public int field240 = 32;

    @ObfuscatedName("d.a")
    public long field241 = class63.method697();

    @ObfuscatedName("d.g")
    public int field239;

    @ObfuscatedName("d.w")
    public int field243;

    @ObfuscatedName("d.v")
    public int field237;

    @ObfuscatedName("d.u")
    public long field245 = 0L;

    @ObfuscatedName("d.m")
    public int field246 = 0;

    @ObfuscatedName("d.b")
    public int field247 = 0;

    @ObfuscatedName("d.f")
    public int field256 = 0;

    @ObfuscatedName("d.d")
    public long field244 = 0L;

    @ObfuscatedName("d.x")
    public boolean field242 = true;

    @ObfuscatedName("d.s")
    public int field248 = 0;

    @ObfuscatedName("d.p")
    public class129[] field249 = new class129[8];

    @ObfuscatedName("d.ak")
    public class129[] field258 = new class129[8];

    @ObfuscatedName("t.t(Lau;Ljava/awt/Component;III)Ld;")
    public static final class18 method5(class34 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field823 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class113 var4 = new class113();
                var4.field238 = new int[256 * (Statics.field251 ? 2 : 1)];
                var4.field243 = arg3;
                var4.method218(arg1);
                var4.field239 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field239 > 16384) {
                    var4.field239 = 16384;
                }
                var4.method211(var4.field239);
                if (Statics.field235 > 0 && Statics.field1505 == null) {
                    Statics.field1505 = new class20();
                    Statics.field1505.field288 = arg0;
                    arg0.method420(Statics.field1505, Statics.field235);
                }
                if (Statics.field1505 != null) {
                    if (Statics.field1505.field290[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1505.field290[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class112 var6 = new class112(arg0, arg2);
                    var6.field238 = new int[(Statics.field251 ? 2 : 1) * 256];
                    var6.field243 = arg3;
                    var6.method218(arg1);
                    var6.field239 = 16384;
                    var6.method211(var6.field239);
                    if (Statics.field235 > 0 && Statics.field1505 == null) {
                        Statics.field1505 = new class20();
                        Statics.field1505.field288 = arg0;
                        arg0.method420(Statics.field1505, Statics.field235);
                    }
                    if (Statics.field1505 != null) {
                        if (Statics.field1505.field290[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1505.field290[arg2] = var6;
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

    @ObfuscatedName("d.n(Ldb;B)V")
    public final synchronized void method207(class129 arg0) {
        this.field253 = arg0;
    }

    @ObfuscatedName("d.q(I)V")
    public final synchronized void method212() {
        if (this.field238 == null) {
            return;
        }
        long var1 = class63.method697();
        try {
            if (this.field245 != 0L) {
                if (var1 < this.field245) {
                    return;
                }
                this.method211(this.field239);
                this.field245 = 0L;
                this.field242 = true;
            }
            int var3 = this.method217();
            if (this.field256 - var3 > this.field246) {
                this.field246 = this.field256 - var3;
            }
            int var4 = this.field243 + this.field237;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field239) {
                this.field239 += 1024;
                if (this.field239 > 16384) {
                    this.field239 = 16384;
                }
                this.method214();
                this.method211(this.field239);
                var3 = 0;
                this.field242 = true;
                if (var4 + 256 > this.field239) {
                    var4 = this.field239 - 256;
                    this.field237 = var4 - this.field243;
                }
            }
            while (var3 < var4) {
                this.method209(this.field238, 256);
                this.method213();
                var3 += 256;
            }
            if (var1 > this.field244) {
                if (this.field242) {
                    this.field242 = false;
                } else if (this.field246 == 0 && this.field247 == 0) {
                    this.method214();
                    this.field245 = var1 + 2000L;
                    return;
                } else {
                    this.field237 = Math.min(this.field247, this.field246);
                    this.field247 = this.field246;
                }
                this.field246 = 0;
                this.field244 = var1 + 2000L;
            }
            this.field256 = var3;
        } catch (Exception var8) {
            this.method214();
            this.field245 = var1 + 2000L;
        }
        try {
            if (var1 > this.field241 + 500000L) {
                var1 = this.field241;
            }
            while (var1 > this.field241 + 5000L) {
                this.method250(256);
                this.field241 += (long) (256000 / Statics.field823);
            }
        } catch (Exception var7) {
            this.field241 = var1;
        }
    }

    @ObfuscatedName("d.h(I)V")
    public final void method204() {
        this.field242 = true;
    }

    @ObfuscatedName("d.k(I)V")
    public final synchronized void method208() {
        this.field242 = true;
        try {
            this.method215();
        } catch (Exception var2) {
            this.method214();
            this.field245 = class63.method697() + 2000L;
        }
    }

    @ObfuscatedName("d.r(B)V")
    public final synchronized void method206() {
        if (Statics.field1505 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1505.field290[var2] == this) {
                    Statics.field1505.field290[var2] = null;
                }
                if (Statics.field1505.field290[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1505.field287 = true;
                while (Statics.field1505.field289) {
                    Statics.method101(50L);
                }
                Statics.field1505 = null;
            }
        }
        this.method214();
        this.field238 = null;
    }

    @ObfuscatedName("d.l(IB)V")
    public final void method250(int arg0) {
        this.field248 -= arg0;
        if (this.field248 < 0) {
            this.field248 = 0;
        }
        if (this.field253 != null) {
            this.field253.method1500(arg0);
        }
    }

    @ObfuscatedName("d.i([II)V")
    public final void method209(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field251) {
            var3 = arg1 << 1;
        }
        class68.method838(arg0, 0, var3);
        this.field248 -= arg1;
        if (this.field253 != null && this.field248 <= 0) {
            this.field248 += Statics.field823 >> 4;
            method734(this.field253);
            this.method225(this.field253, this.field253.method1497());
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
                        class129 var10 = null;
                        class129 var11 = this.field249[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class128 var12 = var11.field1641;
                                if (var12 == null || var12.field1638 <= var8) {
                                    var11.field1639 = true;
                                    int var13 = var11.method1504();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1638 += var13;
                                    }
                                    if (var4 >= this.field240) {
                                        break label105;
                                    }
                                    class129 var14 = var11.method1512();
                                    if (var14 != null) {
                                        int var15 = var11.field1640;
                                        while (var14 != null) {
                                            this.method225(var14, var15 * var14.method1497() >> 8);
                                            var14 = var11.method1493();
                                        }
                                    }
                                    class129 var16 = var11.field1642;
                                    var11.field1642 = null;
                                    if (var10 == null) {
                                        this.field249[var7] = var16;
                                    } else {
                                        var10.field1642 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field258[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1642;
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
                class129 var18 = this.field249[var17];
                class129[] var19 = this.field249;
                this.field258[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class129 var21 = var18.field1642;
                    var18.field1642 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field248 < 0) {
            this.field248 = 0;
        }
        if (this.field253 != null) {
            this.field253.method1499(arg0, 0, arg1);
        }
        this.field241 = class63.method697();
    }

    @ObfuscatedName("ba.e(Ldb;I)V")
    public static final void method734(class129 arg0) {
        arg0.field1639 = false;
        if (arg0.field1641 != null) {
            arg0.field1641.field1638 = 0;
        }
        for (class129 var1 = arg0.method1512(); var1 != null; var1 = arg0.method1493()) {
            method734(var1);
        }
    }

    @ObfuscatedName("d.a(Ldb;II)V")
    public final void method225(class129 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class129 var4 = this.field258[var3];
        if (var4 == null) {
            this.field249[var3] = arg0;
        } else {
            var4.field1642 = arg0;
        }
        this.field258[var3] = arg0;
        arg0.field1640 = arg1;
    }

    @ObfuscatedName("d.g(Ljava/awt/Component;)V")
    public void method218(Component arg0) throws Exception {
    }

    @ObfuscatedName("d.w(I)V")
    public void method211(int arg0) throws Exception {
    }

    @ObfuscatedName("d.v()I")
    public int method217() throws Exception {
        return this.field239;
    }

    @ObfuscatedName("d.u()V")
    public void method213() throws Exception {
    }

    @ObfuscatedName("d.m()V")
    public void method214() {
    }

    @ObfuscatedName("d.b()V")
    public void method215() throws Exception {
    }
}
