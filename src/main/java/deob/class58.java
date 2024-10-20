package deob;

import java.awt.Component;

@ObfuscatedName("bb")
public class class58 {

    @ObfuscatedName("bb.k")
    public int[] field1052;

    @ObfuscatedName("bb.u")
    public class69 field1038;

    @ObfuscatedName("bb.b")
    public int field1043 = 32;

    @ObfuscatedName("bb.x")
    public long field1044 = Statics.method28();

    @ObfuscatedName("bb.r")
    public int field1045;

    @ObfuscatedName("bb.n")
    public int field1049;

    @ObfuscatedName("bb.m")
    public int field1047;

    @ObfuscatedName("bb.j")
    public long field1048 = 0L;

    @ObfuscatedName("bb.w")
    public int field1046 = 0;

    @ObfuscatedName("bb.p")
    public int field1050 = 0;

    @ObfuscatedName("bb.o")
    public int field1051 = 0;

    @ObfuscatedName("bb.i")
    public long field1055 = 0L;

    @ObfuscatedName("bb.z")
    public boolean field1042 = true;

    @ObfuscatedName("bb.l")
    public int field1054 = 0;

    @ObfuscatedName("bb.v")
    public class69[] field1057 = new class69[8];

    @ObfuscatedName("bb.az")
    public class69[] field1056 = new class69[8];

    @ObfuscatedName("ec.s(IZII)V")
    public static final void method2516(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1058 = arg0;
        Statics.field1053 = arg1;
        Statics.field3282 = arg2;
    }

    @ObfuscatedName("as.c(Lci;Ljava/awt/Component;IIB)Lbb;")
    public static final class58 method711(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1058 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1052 = new int[256 * (Statics.field1053 ? 2 : 1)];
                var4.field1049 = arg3;
                var4.method982(arg1);
                var4.field1045 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1045 > 16384) {
                    var4.field1045 = 16384;
                }
                var4.method983(var4.field1045);
                if (Statics.field3282 > 0 && Statics.field1039 == null) {
                    Statics.field1039 = new class64();
                    Statics.field1039.field1091 = arg0;
                    arg0.method1806(Statics.field1039, Statics.field3282);
                }
                if (Statics.field1039 != null) {
                    if (Statics.field1039.field1094[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1039.field1094[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bb.f(Lby;I)V")
    public final synchronized void method974(class69 arg0) {
        this.field1038 = arg0;
    }

    @ObfuscatedName("bb.g(I)V")
    public final synchronized void method1013() {
        if (this.field1052 == null) {
            return;
        }
        long var1 = Statics.method28();
        try {
            if (this.field1048 != 0L) {
                if (var1 < this.field1048) {
                    return;
                }
                this.method983(this.field1045);
                this.field1048 = 0L;
                this.field1042 = true;
            }
            int var3 = this.method984();
            if (this.field1051 - var3 > this.field1046) {
                this.field1046 = this.field1051 - var3;
            }
            int var4 = this.field1049 + this.field1047;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1045) {
                this.field1045 += 1024;
                if (this.field1045 > 16384) {
                    this.field1045 = 16384;
                }
                this.method1004();
                this.method983(this.field1045);
                var3 = 0;
                this.field1042 = true;
                if (var4 + 256 > this.field1045) {
                    var4 = this.field1045 - 256;
                    this.field1047 = var4 - this.field1049;
                }
            }
            while (var3 < var4) {
                this.method980(this.field1052, 256);
                this.method973();
                var3 += 256;
            }
            if (var1 > this.field1055) {
                if (this.field1042) {
                    this.field1042 = false;
                } else if (this.field1046 == 0 && this.field1050 == 0) {
                    this.method1004();
                    this.field1048 = var1 + 2000L;
                    return;
                } else {
                    this.field1047 = Math.min(this.field1050, this.field1046);
                    this.field1050 = this.field1046;
                }
                this.field1046 = 0;
                this.field1055 = var1 + 2000L;
            }
            this.field1051 = var3;
        } catch (Exception var8) {
            this.method1004();
            this.field1048 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1044 + 500000L) {
                var1 = this.field1044;
            }
            while (var1 > this.field1044 + 5000L) {
                this.method979(256);
                this.field1044 += (long) (256000 / Statics.field1058);
            }
        } catch (Exception var7) {
            this.field1044 = var1;
        }
    }

    @ObfuscatedName("bb.k(B)V")
    public final void method999() {
        this.field1042 = true;
    }

    @ObfuscatedName("bb.u(B)V")
    public final synchronized void method997() {
        this.field1042 = true;
        try {
            this.method987();
        } catch (Exception var2) {
            this.method1004();
            this.field1048 = Statics.method28() + 2000L;
        }
    }

    @ObfuscatedName("bb.b(B)V")
    public final synchronized void method976() {
        if (Statics.field1039 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1039.field1094[var2] == this) {
                    Statics.field1039.field1094[var2] = null;
                }
                if (Statics.field1039.field1094[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1039.field1092 = true;
                while (Statics.field1039.field1090) {
                    class162.method746(50L);
                }
                Statics.field1039 = null;
            }
        }
        this.method1004();
        this.field1052 = null;
    }

    @ObfuscatedName("bb.x(II)V")
    public final void method979(int arg0) {
        this.field1054 -= arg0;
        if (this.field1054 < 0) {
            this.field1054 = 0;
        }
        if (this.field1038 != null) {
            this.field1038.method857(arg0);
        }
    }

    @ObfuscatedName("bb.r([II)V")
    public final void method980(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1053) {
            var3 = arg1 << 1;
        }
        class164.method2822(arg0, 0, var3);
        this.field1054 -= arg1;
        if (this.field1038 != null && this.field1054 <= 0) {
            this.field1054 += Statics.field1058 >> 4;
            method666(this.field1038);
            this.method981(this.field1038, this.field1038.method1118());
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
                        class69 var10 = null;
                        class69 var11 = this.field1057[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1142;
                                if (var12 == null || var12.field1174 <= var8) {
                                    var11.field1140 = true;
                                    int var13 = var11.method855();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1174 += var13;
                                    }
                                    if (var4 >= this.field1043) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method852();
                                    if (var14 != null) {
                                        int var15 = var11.field1141;
                                        while (var14 != null) {
                                            this.method981(var14, var15 * var14.method1118() >> 8);
                                            var14 = var11.method854();
                                        }
                                    }
                                    class69 var16 = var11.field1143;
                                    var11.field1143 = null;
                                    if (var10 == null) {
                                        this.field1057[var7] = var16;
                                    } else {
                                        var10.field1143 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1056[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1143;
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
                class69 var18 = this.field1057[var17];
                class69[] var19 = this.field1057;
                this.field1056[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1143;
                    var18.field1143 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1054 < 0) {
            this.field1054 = 0;
        }
        if (this.field1038 != null) {
            this.field1038.method869(arg0, 0, arg1);
        }
        this.field1044 = Statics.method28();
    }

    @ObfuscatedName("ae.n(Lby;I)V")
    public static final void method666(class69 arg0) {
        arg0.field1140 = false;
        if (arg0.field1142 != null) {
            arg0.field1142.field1174 = 0;
        }
        for (class69 var1 = arg0.method852(); var1 != null; var1 = arg0.method854()) {
            method666(var1);
        }
    }

    @ObfuscatedName("bb.m(Lby;IB)V")
    public final void method981(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1056[var3];
        if (var4 == null) {
            this.field1057[var3] = arg0;
        } else {
            var4.field1143 = arg0;
        }
        this.field1056[var3] = arg0;
        arg0.field1141 = arg1;
    }

    @ObfuscatedName("bb.j(Ljava/awt/Component;I)V")
    public void method982(Component arg0) throws Exception {
    }

    @ObfuscatedName("bb.w(II)V")
    public void method983(int arg0) throws Exception {
    }

    @ObfuscatedName("bb.p(I)I")
    public int method984() throws Exception {
        return this.field1045;
    }

    @ObfuscatedName("bb.o()V")
    public void method973() throws Exception {
    }

    @ObfuscatedName("bb.i(I)V")
    public void method1004() {
    }

    @ObfuscatedName("bb.z(I)V")
    public void method987() throws Exception {
    }
}
