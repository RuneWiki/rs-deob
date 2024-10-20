package deob;

import java.awt.Component;

@ObfuscatedName("y")
public class class18 {

    @ObfuscatedName("y.j")
    public int[] field243;

    @ObfuscatedName("y.z")
    public class129 field242;

    @ObfuscatedName("y.g")
    public int field256 = 32;

    @ObfuscatedName("y.q")
    public long field244 = class63.method1135();

    @ObfuscatedName("y.i")
    public int field245;

    @ObfuscatedName("y.s")
    public int field246;

    @ObfuscatedName("y.u")
    public int field247;

    @ObfuscatedName("y.v")
    public long field248 = 0L;

    @ObfuscatedName("y.w")
    public int field249 = 0;

    @ObfuscatedName("y.e")
    public int field255 = 0;

    @ObfuscatedName("y.b")
    public int field251 = 0;

    @ObfuscatedName("y.y")
    public long field250 = 0L;

    @ObfuscatedName("y.t")
    public boolean field253 = true;

    @ObfuscatedName("y.x")
    public int field259 = 0;

    @ObfuscatedName("y.p")
    public class129[] field240 = new class129[8];

    @ObfuscatedName("y.ad")
    public class129[] field261 = new class129[8];

    @ObfuscatedName("cm.d(Lak;Ljava/awt/Component;III)Ly;")
    public static final class18 method1132(class34 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field241 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class113 var4 = new class113();
                var4.field243 = new int[256 * (Statics.field236 ? 2 : 1)];
                var4.field246 = arg3;
                var4.method209(arg1);
                var4.field245 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field245 > 16384) {
                    var4.field245 = 16384;
                }
                var4.method214(var4.field245);
                if (Statics.field239 > 0 && Statics.field238 == null) {
                    Statics.field238 = new class20();
                    Statics.field238.field290 = arg0;
                    arg0.method437(Statics.field238, Statics.field239);
                }
                if (Statics.field238 != null) {
                    if (Statics.field238.field293[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field238.field293[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class112 var6 = new class112(arg0, arg2);
                    var6.field243 = new int[256 * (Statics.field236 ? 2 : 1)];
                    var6.field246 = arg3;
                    var6.method209(arg1);
                    var6.field245 = 16384;
                    var6.method214(var6.field245);
                    if (Statics.field239 > 0 && Statics.field238 == null) {
                        Statics.field238 = new class20();
                        Statics.field238.field290 = arg0;
                        arg0.method437(Statics.field238, Statics.field239);
                    }
                    if (Statics.field238 != null) {
                        if (Statics.field238.field293[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field238.field293[arg2] = var6;
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

    @ObfuscatedName("y.l(Ldx;I)V")
    public final synchronized void method240(class129 arg0) {
        this.field242 = arg0;
    }

    @ObfuscatedName("y.m(B)V")
    public final synchronized void method235() {
        if (this.field243 == null) {
            return;
        }
        long var1 = class63.method1135();
        try {
            if (this.field248 != 0L) {
                if (var1 < this.field248) {
                    return;
                }
                this.method214(this.field245);
                this.field248 = 0L;
                this.field253 = true;
            }
            int var3 = this.method215();
            if (this.field251 - var3 > this.field249) {
                this.field249 = this.field251 - var3;
            }
            int var4 = this.field247 + this.field246;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field245) {
                this.field245 += 1024;
                if (this.field245 > 16384) {
                    this.field245 = 16384;
                }
                this.method217();
                this.method214(this.field245);
                var3 = 0;
                this.field253 = true;
                if (var4 + 256 > this.field245) {
                    var4 = this.field245 - 256;
                    this.field247 = var4 - this.field246;
                }
            }
            while (var3 < var4) {
                this.method250(this.field243, 256);
                this.method216();
                var3 += 256;
            }
            if (var1 > this.field250) {
                if (this.field253) {
                    this.field253 = false;
                } else if (this.field249 == 0 && this.field255 == 0) {
                    this.method217();
                    this.field248 = var1 + 2000L;
                    return;
                } else {
                    this.field247 = Math.min(this.field255, this.field249);
                    this.field255 = this.field249;
                }
                this.field249 = 0;
                this.field250 = var1 + 2000L;
            }
            this.field251 = var3;
        } catch (Exception var8) {
            this.method217();
            this.field248 = var1 + 2000L;
        }
        try {
            if (var1 > this.field244 + 500000L) {
                var1 = this.field244;
            }
            while (var1 > this.field244 + 5000L) {
                this.method210(256);
                this.field244 += (long) (256000 / Statics.field241);
            }
        } catch (Exception var7) {
            this.field244 = var1;
        }
    }

    @ObfuscatedName("y.c(B)V")
    public final void method207() {
        this.field253 = true;
    }

    @ObfuscatedName("y.n(I)V")
    public final synchronized void method208() {
        this.field253 = true;
        try {
            this.method218();
        } catch (Exception var2) {
            this.method217();
            this.field248 = class63.method1135() + 2000L;
        }
    }

    @ObfuscatedName("y.j(I)V")
    public final synchronized void method248() {
        if (Statics.field238 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field238.field293[var2] == this) {
                    Statics.field238.field293[var2] = null;
                }
                if (Statics.field238.field293[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field238.field292 = true;
                while (Statics.field238.field291) {
                    class67.method1020(50L);
                }
                Statics.field238 = null;
            }
        }
        this.method217();
        this.field243 = null;
    }

    @ObfuscatedName("y.z(II)V")
    public final void method210(int arg0) {
        this.field259 -= arg0;
        if (this.field259 < 0) {
            this.field259 = 0;
        }
        if (this.field242 != null) {
            this.field242.method1521(arg0);
        }
    }

    @ObfuscatedName("y.g([II)V")
    public final void method250(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field236) {
            var3 = arg1 << 1;
        }
        class68.method883(arg0, 0, var3);
        this.field259 -= arg1;
        if (this.field242 != null && this.field259 <= 0) {
            this.field259 += Statics.field241 >> 4;
            method815(this.field242);
            this.method212(this.field242, this.field242.method1514());
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
                        class129 var11 = this.field240[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class128 var12 = var11.field1644;
                                if (var12 == null || var12.field1642 <= var8) {
                                    var11.field1643 = true;
                                    int var13 = var11.method1518();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1642 += var13;
                                    }
                                    if (var4 >= this.field256) {
                                        break label105;
                                    }
                                    class129 var14 = var11.method1516();
                                    if (var14 != null) {
                                        int var15 = var11.field1646;
                                        while (var14 != null) {
                                            this.method212(var14, var15 * var14.method1514() >> 8);
                                            var14 = var11.method1517();
                                        }
                                    }
                                    class129 var16 = var11.field1645;
                                    var11.field1645 = null;
                                    if (var10 == null) {
                                        this.field240[var7] = var16;
                                    } else {
                                        var10.field1645 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field261[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1645;
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
                class129 var18 = this.field240[var17];
                class129[] var19 = this.field240;
                this.field261[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class129 var21 = var18.field1645;
                    var18.field1645 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field259 < 0) {
            this.field259 = 0;
        }
        if (this.field242 != null) {
            this.field242.method1520(arg0, 0, arg1);
        }
        this.field244 = class63.method1135();
    }

    @ObfuscatedName("bw.q(Ldx;I)V")
    public static final void method815(class129 arg0) {
        arg0.field1643 = false;
        if (arg0.field1644 != null) {
            arg0.field1644.field1642 = 0;
        }
        for (class129 var1 = arg0.method1516(); var1 != null; var1 = arg0.method1517()) {
            method815(var1);
        }
    }

    @ObfuscatedName("y.i(Ldx;II)V")
    public final void method212(class129 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class129 var4 = this.field261[var3];
        if (var4 == null) {
            this.field240[var3] = arg0;
        } else {
            var4.field1645 = arg0;
        }
        this.field261[var3] = arg0;
        arg0.field1646 = arg1;
    }

    @ObfuscatedName("y.s(Ljava/awt/Component;)V")
    public void method209(Component arg0) throws Exception {
    }

    @ObfuscatedName("y.u(I)V")
    public void method214(int arg0) throws Exception {
    }

    @ObfuscatedName("y.v()I")
    public int method215() throws Exception {
        return this.field245;
    }

    @ObfuscatedName("y.w()V")
    public void method216() throws Exception {
    }

    @ObfuscatedName("y.e()V")
    public void method217() {
    }

    @ObfuscatedName("y.b()V")
    public void method218() throws Exception {
    }
}
