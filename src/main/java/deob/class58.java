package deob;

import java.awt.Component;

@ObfuscatedName("bi")
public class class58 {

    @ObfuscatedName("bi.n")
    public int[] field1028;

    @ObfuscatedName("bi.f")
    public class69 field1046;

    @ObfuscatedName("bi.a")
    public int field1031 = 32;

    @ObfuscatedName("bi.r")
    public long field1032 = class156.method910();

    @ObfuscatedName("bi.x")
    public int field1047;

    @ObfuscatedName("bi.z")
    public int field1034;

    @ObfuscatedName("bi.p")
    public int field1035;

    @ObfuscatedName("bi.s")
    public long field1036 = 0L;

    @ObfuscatedName("bi.o")
    public int field1037 = 0;

    @ObfuscatedName("bi.y")
    public int field1038 = 0;

    @ObfuscatedName("bi.w")
    public int field1039 = 0;

    @ObfuscatedName("bi.m")
    public long field1040 = 0L;

    @ObfuscatedName("bi.u")
    public boolean field1041 = true;

    @ObfuscatedName("bi.d")
    public int field1043 = 0;

    @ObfuscatedName("bi.g")
    public class69[] field1044 = new class69[8];

    @ObfuscatedName("bi.ap")
    public class69[] field1030 = new class69[8];

    @ObfuscatedName("fj.b(IZIB)V")
    public static final void method3026(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field3080 = arg0;
        Statics.field1033 = arg1;
        Statics.field1026 = arg2;
    }

    @ObfuscatedName("ag.l(Lcx;Ljava/awt/Component;III)Lbi;")
    public static final class58 method844(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field3080 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1028 = new int[(Statics.field1033 ? 2 : 1) * 256];
                var4.field1034 = arg3;
                var4.method1089(arg1);
                var4.field1047 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1047 > 16384) {
                    var4.field1047 = 16384;
                }
                var4.method1090(var4.field1047);
                if (Statics.field1026 > 0 && Statics.field1029 == null) {
                    Statics.field1029 = new class64();
                    Statics.field1029.field1080 = arg0;
                    arg0.method1923(Statics.field1029, Statics.field1026);
                }
                if (Statics.field1029 != null) {
                    if (Statics.field1029.field1075[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1029.field1075[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bi.i(Lbq;I)V")
    public final synchronized void method1082(class69 arg0) {
        this.field1046 = arg0;
    }

    @ObfuscatedName("bi.t(I)V")
    public final synchronized void method1083() {
        if (this.field1028 == null) {
            return;
        }
        long var1 = class156.method910();
        try {
            if (this.field1036 != 0L) {
                if (var1 < this.field1036) {
                    return;
                }
                this.method1090(this.field1047);
                this.field1036 = 0L;
                this.field1041 = true;
            }
            int var3 = this.method1106();
            if (this.field1039 - var3 > this.field1037) {
                this.field1037 = this.field1039 - var3;
            }
            int var4 = this.field1035 + this.field1034;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1047) {
                this.field1047 += 1024;
                if (this.field1047 > 16384) {
                    this.field1047 = 16384;
                }
                this.method1084();
                this.method1090(this.field1047);
                var3 = 0;
                this.field1041 = true;
                if (var4 + 256 > this.field1047) {
                    var4 = this.field1047 - 256;
                    this.field1035 = var4 - this.field1034;
                }
            }
            while (var3 < var4) {
                this.method1121(this.field1028, 256);
                this.method1092();
                var3 += 256;
            }
            if (var1 > this.field1040) {
                if (this.field1041) {
                    this.field1041 = false;
                } else if (this.field1037 == 0 && this.field1038 == 0) {
                    this.method1084();
                    this.field1036 = var1 + 2000L;
                    return;
                } else {
                    this.field1035 = Math.min(this.field1038, this.field1037);
                    this.field1038 = this.field1037;
                }
                this.field1037 = 0;
                this.field1040 = var1 + 2000L;
            }
            this.field1039 = var3;
        } catch (Exception var8) {
            this.method1084();
            this.field1036 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1032 + 500000L) {
                var1 = this.field1032;
            }
            while (var1 > this.field1032 + 5000L) {
                this.method1086(256);
                this.field1032 += (long) (256000 / Statics.field3080);
            }
        } catch (Exception var7) {
            this.field1032 = var1;
        }
    }

    @ObfuscatedName("bi.k(I)V")
    public final void method1091() {
        this.field1041 = true;
    }

    @ObfuscatedName("bi.x(I)V")
    public final synchronized void method1085() {
        this.field1041 = true;
        try {
            this.method1094();
        } catch (Exception var2) {
            this.method1084();
            this.field1036 = class156.method910() + 2000L;
        }
    }

    @ObfuscatedName("bi.z(I)V")
    public final synchronized void method1112() {
        if (Statics.field1029 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1029.field1075[var2] == this) {
                    Statics.field1029.field1075[var2] = null;
                }
                if (Statics.field1029.field1075[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1029.field1076 = true;
                while (Statics.field1029.field1077) {
                    class162.method2157(50L);
                }
                Statics.field1029 = null;
            }
        }
        this.method1084();
        this.field1028 = null;
    }

    @ObfuscatedName("bi.p(II)V")
    public final void method1086(int arg0) {
        this.field1043 -= arg0;
        if (this.field1043 < 0) {
            this.field1043 = 0;
        }
        if (this.field1046 != null) {
            this.field1046.method974(arg0);
        }
    }

    @ObfuscatedName("bi.s([II)V")
    public final void method1121(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1033) {
            var3 = arg1 << 1;
        }
        class164.method2999(arg0, 0, var3);
        this.field1043 -= arg1;
        if (this.field1046 != null && this.field1043 <= 0) {
            this.field1043 += Statics.field3080 >> 4;
            method258(this.field1046);
            this.method1088(this.field1046, this.field1046.method1191());
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
                        class69 var11 = this.field1044[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1128;
                                if (var12 == null || var12.field1159 <= var8) {
                                    var11.field1125 = true;
                                    int var13 = var11.method971();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1159 += var13;
                                    }
                                    if (var4 >= this.field1031) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method996();
                                    if (var14 != null) {
                                        int var15 = var11.field1127;
                                        while (var14 != null) {
                                            this.method1088(var14, var15 * var14.method1191() >> 8);
                                            var14 = var11.method970();
                                        }
                                    }
                                    class69 var16 = var11.field1126;
                                    var11.field1126 = null;
                                    if (var10 == null) {
                                        this.field1044[var7] = var16;
                                    } else {
                                        var10.field1126 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1030[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1126;
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
                class69 var18 = this.field1044[var17];
                class69[] var19 = this.field1044;
                this.field1030[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1126;
                    var18.field1126 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1043 < 0) {
            this.field1043 = 0;
        }
        if (this.field1046 != null) {
            this.field1046.method985(arg0, 0, arg1);
        }
        this.field1032 = class156.method910();
    }

    @ObfuscatedName("d.o(Lbq;B)V")
    public static final void method258(class69 arg0) {
        arg0.field1125 = false;
        if (arg0.field1128 != null) {
            arg0.field1128.field1159 = 0;
        }
        for (class69 var1 = arg0.method996(); var1 != null; var1 = arg0.method970()) {
            method258(var1);
        }
    }

    @ObfuscatedName("bi.y(Lbq;IB)V")
    public final void method1088(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1030[var3];
        if (var4 == null) {
            this.field1044[var3] = arg0;
        } else {
            var4.field1126 = arg0;
        }
        this.field1030[var3] = arg0;
        arg0.field1127 = arg1;
    }

    @ObfuscatedName("bi.w(Ljava/awt/Component;I)V")
    public void method1089(Component arg0) throws Exception {
    }

    @ObfuscatedName("bi.m(II)V")
    public void method1090(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.u(B)I")
    public int method1106() throws Exception {
        return this.field1047;
    }

    @ObfuscatedName("bi.q()V")
    public void method1092() throws Exception {
    }

    @ObfuscatedName("bi.c(I)V")
    public void method1084() {
    }

    @ObfuscatedName("bi.v(I)V")
    public void method1094() throws Exception {
    }
}
