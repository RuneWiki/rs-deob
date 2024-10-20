package deob;

import java.awt.Component;

@ObfuscatedName("bv")
public class class58 {

    @ObfuscatedName("bv.u")
    public int[] field1054;

    @ObfuscatedName("bv.k")
    public class69 field1057;

    @ObfuscatedName("bv.g")
    public int field1058 = 32;

    @ObfuscatedName("bv.y")
    public long field1066 = class156.method1888();

    @ObfuscatedName("bv.e")
    public int field1060;

    @ObfuscatedName("bv.q")
    public int field1061;

    @ObfuscatedName("bv.v")
    public int field1062;

    @ObfuscatedName("bv.l")
    public long field1063 = 0L;

    @ObfuscatedName("bv.s")
    public int field1064 = 0;

    @ObfuscatedName("bv.r")
    public int field1071 = 0;

    @ObfuscatedName("bv.m")
    public int field1056 = 0;

    @ObfuscatedName("bv.i")
    public long field1067 = 0L;

    @ObfuscatedName("bv.f")
    public boolean field1068 = true;

    @ObfuscatedName("bv.a")
    public int field1069 = 0;

    @ObfuscatedName("bv.o")
    public class69[] field1070 = new class69[8];

    @ObfuscatedName("bv.an")
    public class69[] field1055 = new class69[8];

    @ObfuscatedName("at.x(Lca;Ljava/awt/Component;III)Lbv;")
    public static final class58 method754(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2034 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1054 = new int[(Statics.field1059 ? 2 : 1) * 256];
                var4.field1061 = arg3;
                var4.method1101(arg1);
                var4.field1060 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1060 > 16384) {
                    var4.field1060 = 16384;
                }
                var4.method1140(var4.field1060);
                if (Statics.field1052 > 0 && Statics.field1053 == null) {
                    Statics.field1053 = new class64();
                    Statics.field1053.field1101 = arg0;
                    arg0.method1906(Statics.field1053, Statics.field1052);
                }
                if (Statics.field1053 != null) {
                    if (Statics.field1053.field1097[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1053.field1097[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bv.j(Lbo;I)V")
    public final synchronized void method1127(class69 arg0) {
        this.field1057 = arg0;
    }

    @ObfuscatedName("bv.c(I)V")
    public final synchronized void method1094() {
        if (this.field1054 == null) {
            return;
        }
        long var1 = class156.method1888();
        try {
            if (this.field1063 != 0L) {
                if (var1 < this.field1063) {
                    return;
                }
                this.method1140(this.field1060);
                this.field1063 = 0L;
                this.field1068 = true;
            }
            int var3 = this.method1103();
            if (this.field1056 - var3 > this.field1064) {
                this.field1064 = this.field1056 - var3;
            }
            int var4 = this.field1062 + this.field1061;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1060) {
                this.field1060 += 1024;
                if (this.field1060 > 16384) {
                    this.field1060 = 16384;
                }
                this.method1105();
                this.method1140(this.field1060);
                var3 = 0;
                this.field1068 = true;
                if (var4 + 256 > this.field1060) {
                    var4 = this.field1060 - 256;
                    this.field1062 = var4 - this.field1061;
                }
            }
            while (var3 < var4) {
                this.method1120(this.field1054, 256);
                this.method1104();
                var3 += 256;
            }
            if (var1 > this.field1067) {
                if (this.field1068) {
                    this.field1068 = false;
                } else if (this.field1064 == 0 && this.field1071 == 0) {
                    this.method1105();
                    this.field1063 = var1 + 2000L;
                    return;
                } else {
                    this.field1062 = Math.min(this.field1071, this.field1064);
                    this.field1071 = this.field1064;
                }
                this.field1064 = 0;
                this.field1067 = var1 + 2000L;
            }
            this.field1056 = var3;
        } catch (Exception var8) {
            this.method1105();
            this.field1063 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1066 + 500000L) {
                var1 = this.field1066;
            }
            while (var1 > this.field1066 + 5000L) {
                this.method1098(256);
                this.field1066 += (long) (256000 / Statics.field2034);
            }
        } catch (Exception var7) {
            this.field1066 = var1;
        }
    }

    @ObfuscatedName("bv.d(I)V")
    public final void method1095() {
        this.field1068 = true;
    }

    @ObfuscatedName("bv.w(I)V")
    public final synchronized void method1096() {
        this.field1068 = true;
        try {
            this.method1106();
        } catch (Exception var2) {
            this.method1105();
            this.field1063 = class156.method1888() + 2000L;
        }
    }

    @ObfuscatedName("bv.u(I)V")
    public final synchronized void method1097() {
        if (Statics.field1053 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1053.field1097[var2] == this) {
                    Statics.field1053.field1097[var2] = null;
                }
                if (Statics.field1053.field1097[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1053.field1096 = true;
                while (Statics.field1053.field1099) {
                    class162.method2485(50L);
                }
                Statics.field1053 = null;
            }
        }
        this.method1105();
        this.field1054 = null;
    }

    @ObfuscatedName("bv.y(II)V")
    public final void method1098(int arg0) {
        this.field1069 -= arg0;
        if (this.field1069 < 0) {
            this.field1069 = 0;
        }
        if (this.field1057 != null) {
            this.field1057.method974(arg0);
        }
    }

    @ObfuscatedName("bv.e([II)V")
    public final void method1120(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1059) {
            var3 = arg1 << 1;
        }
        class164.method2932(arg0, 0, var3);
        this.field1069 -= arg1;
        if (this.field1057 != null && this.field1069 <= 0) {
            this.field1069 += Statics.field2034 >> 4;
            method3066(this.field1057);
            this.method1134(this.field1057, this.field1057.method1202());
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
                        class69 var11 = this.field1070[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1148;
                                if (var12 == null || var12.field1182 <= var8) {
                                    var11.field1150 = true;
                                    int var13 = var11.method971();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1182 += var13;
                                    }
                                    if (var4 >= this.field1058) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method969();
                                    if (var14 != null) {
                                        int var15 = var11.field1149;
                                        while (var14 != null) {
                                            this.method1134(var14, var15 * var14.method1202() >> 8);
                                            var14 = var11.method970();
                                        }
                                    }
                                    class69 var16 = var11.field1151;
                                    var11.field1151 = null;
                                    if (var10 == null) {
                                        this.field1070[var7] = var16;
                                    } else {
                                        var10.field1151 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1055[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1151;
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
                class69 var18 = this.field1070[var17];
                class69[] var19 = this.field1070;
                this.field1055[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1151;
                    var18.field1151 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1069 < 0) {
            this.field1069 = 0;
        }
        if (this.field1057 != null) {
            this.field1057.method972(arg0, 0, arg1);
        }
        this.field1066 = class156.method1888();
    }

    @ObfuscatedName("fc.q(Lbo;I)V")
    public static final void method3066(class69 arg0) {
        arg0.field1150 = false;
        if (arg0.field1148 != null) {
            arg0.field1148.field1182 = 0;
        }
        for (class69 var1 = arg0.method969(); var1 != null; var1 = arg0.method970()) {
            method3066(var1);
        }
    }

    @ObfuscatedName("bv.v(Lbo;II)V")
    public final void method1134(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1055[var3];
        if (var4 == null) {
            this.field1070[var3] = arg0;
        } else {
            var4.field1151 = arg0;
        }
        this.field1055[var3] = arg0;
        arg0.field1149 = arg1;
    }

    @ObfuscatedName("bv.l(Ljava/awt/Component;I)V")
    public void method1101(Component arg0) throws Exception {
    }

    @ObfuscatedName("bv.s(IB)V")
    public void method1140(int arg0) throws Exception {
    }

    @ObfuscatedName("bv.r(B)I")
    public int method1103() throws Exception {
        return this.field1060;
    }

    @ObfuscatedName("bv.m()V")
    public void method1104() throws Exception {
    }

    @ObfuscatedName("bv.i(B)V")
    public void method1105() {
    }

    @ObfuscatedName("bv.f(B)V")
    public void method1106() throws Exception {
    }
}
