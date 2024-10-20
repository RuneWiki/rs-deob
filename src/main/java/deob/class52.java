package deob;

import java.awt.Component;

@ObfuscatedName("aj")
public class class52 {

    @ObfuscatedName("aj.m")
    public int[] field1105;

    @ObfuscatedName("aj.q")
    public class62 field1107;

    @ObfuscatedName("aj.v")
    public int field1106 = 32;

    @ObfuscatedName("aj.n")
    public long field1108 = class107.method3468();

    @ObfuscatedName("aj.z")
    public int field1113;

    @ObfuscatedName("aj.r")
    public int field1110;

    @ObfuscatedName("aj.i")
    public int field1111;

    @ObfuscatedName("aj.s")
    public long field1101 = 0L;

    @ObfuscatedName("aj.c")
    public int field1112 = 0;

    @ObfuscatedName("aj.t")
    public int field1114 = 0;

    @ObfuscatedName("aj.h")
    public int field1115 = 0;

    @ObfuscatedName("aj.w")
    public long field1116 = 0L;

    @ObfuscatedName("aj.g")
    public boolean field1117 = true;

    @ObfuscatedName("aj.ax")
    public int field1119 = 0;

    @ObfuscatedName("aj.ag")
    public class62[] field1120 = new class62[8];

    @ObfuscatedName("aj.ai")
    public class62[] field1121 = new class62[8];

    @ObfuscatedName("at.c(Lde;Ljava/awt/Component;IIB)Laj;")
    public static final class52 method635(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1124 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1105 = new int[256 * (Statics.field1102 ? 2 : 1)];
                var4.field1110 = arg3;
                var4.method965(arg1);
                var4.field1113 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1113 > 16384) {
                    var4.field1113 = 16384;
                }
                var4.method955(var4.field1113);
                if (Statics.field1103 > 0 && Statics.field2894 == null) {
                    Statics.field2894 = new class68();
                    Statics.field2894.field1286 = arg0;
                    arg0.method2507(Statics.field2894, Statics.field1103);
                }
                if (Statics.field2894 != null) {
                    if (Statics.field2894.field1284[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2894.field1284[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1105 = new int[(Statics.field1102 ? 2 : 1) * 256];
                    var6.field1110 = arg3;
                    var6.method965(arg1);
                    var6.field1113 = 16384;
                    var6.method955(var6.field1113);
                    if (Statics.field1103 > 0 && Statics.field2894 == null) {
                        Statics.field2894 = new class68();
                        Statics.field2894.field1286 = arg0;
                        arg0.method2507(Statics.field2894, Statics.field1103);
                    }
                    if (Statics.field2894 != null) {
                        if (Statics.field2894.field1284[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2894.field1284[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class52();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("aj.t(Lbk;I)V")
    public final synchronized void method1019(class62 arg0) {
        this.field1107 = arg0;
    }

    @ObfuscatedName("aj.h(I)V")
    public final synchronized void method1028() {
        if (this.field1105 == null) {
            return;
        }
        long var1 = class107.method3468();
        try {
            if (this.field1101 != 0L) {
                if (var1 < this.field1101) {
                    return;
                }
                this.method955(this.field1113);
                this.field1101 = 0L;
                this.field1117 = true;
            }
            int var3 = this.method956();
            if (this.field1115 - var3 > this.field1112) {
                this.field1112 = this.field1115 - var3;
            }
            int var4 = this.field1111 + this.field1110;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1113) {
                this.field1113 += 1024;
                if (this.field1113 > 16384) {
                    this.field1113 = 16384;
                }
                this.method958();
                this.method955(this.field1113);
                var3 = 0;
                this.field1117 = true;
                if (var4 + 256 > this.field1113) {
                    var4 = this.field1113 - 256;
                    this.field1111 = var4 - this.field1110;
                }
            }
            while (var3 < var4) {
                this.method1015(this.field1105, 256);
                this.method957();
                var3 += 256;
            }
            if (var1 > this.field1116) {
                if (this.field1117) {
                    this.field1117 = false;
                } else if (this.field1112 == 0 && this.field1114 == 0) {
                    this.method958();
                    this.field1101 = var1 + 2000L;
                    return;
                } else {
                    this.field1111 = Math.min(this.field1114, this.field1112);
                    this.field1114 = this.field1112;
                }
                this.field1112 = 0;
                this.field1116 = var1 + 2000L;
            }
            this.field1115 = var3;
        } catch (Exception var8) {
            this.method958();
            this.field1101 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1108 + 500000L) {
                var1 = this.field1108;
            }
            while (var1 > this.field1108 + 5000L) {
                this.method1012(256);
                this.field1108 += (long) (256000 / Statics.field1124);
            }
        } catch (Exception var7) {
            this.field1108 = var1;
        }
    }

    @ObfuscatedName("aj.w(B)V")
    public final void method1010() {
        this.field1117 = true;
    }

    @ObfuscatedName("aj.g(I)V")
    public final synchronized void method1020() {
        this.field1117 = true;
        try {
            this.method959();
        } catch (Exception var2) {
            this.method958();
            this.field1101 = class107.method3468() + 2000L;
        }
    }

    @ObfuscatedName("aj.f(B)V")
    public final synchronized void method1009() {
        if (Statics.field2894 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2894.field1284[var2] == this) {
                    Statics.field2894.field1284[var2] = null;
                }
                if (Statics.field2894.field1284[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2894.field1285 = true;
                while (Statics.field2894.field1291) {
                    class119.method555(50L);
                }
                Statics.field2894 = null;
            }
        }
        this.method958();
        this.field1105 = null;
    }

    @ObfuscatedName("aj.y(IS)V")
    public final void method1012(int arg0) {
        this.field1119 -= arg0;
        if (this.field1119 < 0) {
            this.field1119 = 0;
        }
        if (this.field1107 != null) {
            this.field1107.method981(arg0);
        }
    }

    @ObfuscatedName("aj.j([II)V")
    public final void method1015(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1102) {
            var3 = arg1 << 1;
        }
        class112.method2349(arg0, 0, var3);
        this.field1119 -= arg1;
        if (this.field1107 != null && this.field1119 <= 0) {
            this.field1119 += Statics.field1124 >> 4;
            method2797(this.field1107);
            this.method1026(this.field1107, this.field1107.method1119());
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
                        class62 var10 = null;
                        class62 var11 = this.field1120[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1201;
                                if (var12 == null || var12.field1198 <= var8) {
                                    var11.field1202 = true;
                                    int var13 = var11.method978();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1198 += var13;
                                    }
                                    if (var4 >= this.field1106) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method976();
                                    if (var14 != null) {
                                        int var15 = var11.field1200;
                                        while (var14 != null) {
                                            this.method1026(var14, var15 * var14.method1119() >> 8);
                                            var14 = var11.method984();
                                        }
                                    }
                                    class62 var16 = var11.field1199;
                                    var11.field1199 = null;
                                    if (var10 == null) {
                                        this.field1120[var7] = var16;
                                    } else {
                                        var10.field1199 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1121[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1199;
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
                class62 var18 = this.field1120[var17];
                class62[] var19 = this.field1120;
                this.field1121[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1199;
                    var18.field1199 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1119 < 0) {
            this.field1119 = 0;
        }
        if (this.field1107 != null) {
            this.field1107.method979(arg0, 0, arg1);
        }
        this.field1108 = class107.method3468();
    }

    @ObfuscatedName("ei.x(Lbk;I)V")
    public static final void method2797(class62 arg0) {
        arg0.field1202 = false;
        if (arg0.field1201 != null) {
            arg0.field1201.field1198 = 0;
        }
        for (class62 var1 = arg0.method976(); var1 != null; var1 = arg0.method984()) {
            method2797(var1);
        }
    }

    @ObfuscatedName("aj.d(Lbk;IB)V")
    public final void method1026(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1121[var3];
        if (var4 == null) {
            this.field1120[var3] = arg0;
        } else {
            var4.field1199 = arg0;
        }
        this.field1121[var3] = arg0;
        arg0.field1200 = arg1;
    }

    @ObfuscatedName("aj.b(Ljava/awt/Component;)V")
    public void method965(Component arg0) throws Exception {
    }

    @ObfuscatedName("aj.e(I)V")
    public void method955(int arg0) throws Exception {
    }

    @ObfuscatedName("aj.a()I")
    public int method956() throws Exception {
        return this.field1113;
    }

    @ObfuscatedName("aj.k()V")
    public void method957() throws Exception {
    }

    @ObfuscatedName("aj.p()V")
    public void method958() {
    }

    @ObfuscatedName("aj.l()V")
    public void method959() throws Exception {
    }
}
