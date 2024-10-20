package deob;

import java.awt.Component;

@ObfuscatedName("bm")
public class class58 {

    @ObfuscatedName("bm.d")
    public int[] field1036;

    @ObfuscatedName("bm.l")
    public class69 field1037;

    @ObfuscatedName("bm.g")
    public int field1038 = 32;

    @ObfuscatedName("bm.z")
    public long field1039 = class156.method118();

    @ObfuscatedName("bm.t")
    public int field1034;

    @ObfuscatedName("bm.m")
    public int field1050;

    @ObfuscatedName("bm.q")
    public int field1042;

    @ObfuscatedName("bm.e")
    public long field1043 = 0L;

    @ObfuscatedName("bm.v")
    public int field1044 = 0;

    @ObfuscatedName("bm.j")
    public int field1045 = 0;

    @ObfuscatedName("bm.p")
    public int field1046 = 0;

    @ObfuscatedName("bm.k")
    public long field1041 = 0L;

    @ObfuscatedName("bm.r")
    public boolean field1048 = true;

    @ObfuscatedName("bm.o")
    public int field1051 = 0;

    @ObfuscatedName("bm.b")
    public class69[] field1032 = new class69[8];

    @ObfuscatedName("bm.aj")
    public class69[] field1053 = new class69[8];

    @ObfuscatedName("o.u(IZIB)V")
    public static final void method242(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field66 = arg0;
        Statics.field1056 = arg1;
        Statics.field1049 = arg2;
    }

    @ObfuscatedName("v.x(Lcc;Ljava/awt/Component;IIB)Lbm;")
    public static final class58 method176(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field66 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1036 = new int[(Statics.field1056 ? 2 : 1) * 256];
                var4.field1050 = arg3;
                var4.method1011(arg1);
                var4.field1034 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1034 > 16384) {
                    var4.field1034 = 16384;
                }
                var4.method1002(var4.field1034);
                if (Statics.field1049 > 0 && Statics.field1052 == null) {
                    Statics.field1052 = new class64();
                    Statics.field1052.field1087 = arg0;
                    arg0.method1815(Statics.field1052, Statics.field1049);
                }
                if (Statics.field1052 != null) {
                    if (Statics.field1052.field1088[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1052.field1088[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bm.i(Lbx;S)V")
    public final synchronized void method1009(class69 arg0) {
        this.field1037 = arg0;
    }

    @ObfuscatedName("bm.a(B)V")
    public final synchronized void method1004() {
        if (this.field1036 == null) {
            return;
        }
        long var1 = class156.method118();
        try {
            if (this.field1043 != 0L) {
                if (var1 < this.field1043) {
                    return;
                }
                this.method1002(this.field1034);
                this.field1043 = 0L;
                this.field1048 = true;
            }
            int var3 = this.method1014();
            if (this.field1046 - var3 > this.field1044) {
                this.field1044 = this.field1046 - var3;
            }
            int var4 = this.field1050 + this.field1042;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1034) {
                this.field1034 += 1024;
                if (this.field1034 > 16384) {
                    this.field1034 = 16384;
                }
                this.method1030();
                this.method1002(this.field1034);
                var3 = 0;
                this.field1048 = true;
                if (var4 + 256 > this.field1034) {
                    var4 = this.field1034 - 256;
                    this.field1042 = var4 - this.field1050;
                }
            }
            while (var3 < var4) {
                this.method1012(this.field1036, 256);
                this.method1013();
                var3 += 256;
            }
            if (var1 > this.field1041) {
                if (this.field1048) {
                    this.field1048 = false;
                } else if (this.field1044 == 0 && this.field1045 == 0) {
                    this.method1030();
                    this.field1043 = var1 + 2000L;
                    return;
                } else {
                    this.field1042 = Math.min(this.field1045, this.field1044);
                    this.field1045 = this.field1044;
                }
                this.field1044 = 0;
                this.field1041 = var1 + 2000L;
            }
            this.field1046 = var3;
        } catch (Exception var8) {
            this.method1030();
            this.field1043 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1039 + 500000L) {
                var1 = this.field1039;
            }
            while (var1 > this.field1039 + 5000L) {
                this.method1008(256);
                this.field1039 += (long) (256000 / Statics.field66);
            }
        } catch (Exception var7) {
            this.field1039 = var1;
        }
    }

    @ObfuscatedName("bm.c(B)V")
    public final void method1005() {
        this.field1048 = true;
    }

    @ObfuscatedName("bm.g(I)V")
    public final synchronized void method1006() {
        this.field1048 = true;
        try {
            this.method1016();
        } catch (Exception var2) {
            this.method1030();
            this.field1043 = class156.method118() + 2000L;
        }
    }

    @ObfuscatedName("bm.z(B)V")
    public final synchronized void method1007() {
        if (Statics.field1052 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1052.field1088[var2] == this) {
                    Statics.field1052.field1088[var2] = null;
                }
                if (Statics.field1052.field1088[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1052.field1089 = true;
                while (Statics.field1052.field1090) {
                    class162.method1528(50L);
                }
                Statics.field1052 = null;
            }
        }
        this.method1030();
        this.field1036 = null;
    }

    @ObfuscatedName("bm.t(IB)V")
    public final void method1008(int arg0) {
        this.field1051 -= arg0;
        if (this.field1051 < 0) {
            this.field1051 = 0;
        }
        if (this.field1037 != null) {
            this.field1037.method887(arg0);
        }
    }

    @ObfuscatedName("bm.m([II)V")
    public final void method1012(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1056) {
            var3 = arg1 << 1;
        }
        class164.method2897(arg0, 0, var3);
        this.field1051 -= arg1;
        if (this.field1037 != null && this.field1051 <= 0) {
            this.field1051 += Statics.field66 >> 4;
            method3033(this.field1037);
            this.method1010(this.field1037, this.field1037.method1098());
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
                        class69 var11 = this.field1032[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1137;
                                if (var12 == null || var12.field1168 <= var8) {
                                    var11.field1136 = true;
                                    int var13 = var11.method889();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1168 += var13;
                                    }
                                    if (var4 >= this.field1038) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method879();
                                    if (var14 != null) {
                                        int var15 = var11.field1135;
                                        while (var14 != null) {
                                            this.method1010(var14, var15 * var14.method1098() >> 8);
                                            var14 = var11.method896();
                                        }
                                    }
                                    class69 var16 = var11.field1134;
                                    var11.field1134 = null;
                                    if (var10 == null) {
                                        this.field1032[var7] = var16;
                                    } else {
                                        var10.field1134 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1053[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1134;
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
                class69 var18 = this.field1032[var17];
                class69[] var19 = this.field1032;
                this.field1053[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1134;
                    var18.field1134 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1051 < 0) {
            this.field1051 = 0;
        }
        if (this.field1037 != null) {
            this.field1037.method912(arg0, 0, arg1);
        }
        this.field1039 = class156.method118();
    }

    @ObfuscatedName("fe.q(Lbx;B)V")
    public static final void method3033(class69 arg0) {
        arg0.field1136 = false;
        if (arg0.field1137 != null) {
            arg0.field1137.field1168 = 0;
        }
        for (class69 var1 = arg0.method879(); var1 != null; var1 = arg0.method896()) {
            method3033(var1);
        }
    }

    @ObfuscatedName("bm.e(Lbx;II)V")
    public final void method1010(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1053[var3];
        if (var4 == null) {
            this.field1032[var3] = arg0;
        } else {
            var4.field1134 = arg0;
        }
        this.field1053[var3] = arg0;
        arg0.field1135 = arg1;
    }

    @ObfuscatedName("bm.v(Ljava/awt/Component;I)V")
    public void method1011(Component arg0) throws Exception {
    }

    @ObfuscatedName("bm.j(II)V")
    public void method1002(int arg0) throws Exception {
    }

    @ObfuscatedName("bm.p(I)I")
    public int method1014() throws Exception {
        return this.field1034;
    }

    @ObfuscatedName("bm.k()V")
    public void method1013() throws Exception {
    }

    @ObfuscatedName("bm.r(I)V")
    public void method1030() {
    }

    @ObfuscatedName("bm.y(I)V")
    public void method1016() throws Exception {
    }
}
