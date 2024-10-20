package deob;

import java.awt.Component;

@ObfuscatedName("bn")
public class class58 {

    @ObfuscatedName("bn.j")
    public int[] field1051;

    @ObfuscatedName("bn.m")
    public class69 field1057;

    @ObfuscatedName("bn.a")
    public int field1058 = 32;

    @ObfuscatedName("bn.i")
    public long field1066 = class156.method1898();

    @ObfuscatedName("bn.s")
    public int field1059;

    @ObfuscatedName("bn.k")
    public int field1070;

    @ObfuscatedName("bn.f")
    public int field1062;

    @ObfuscatedName("bn.o")
    public long field1063 = 0L;

    @ObfuscatedName("bn.q")
    public int field1064 = 0;

    @ObfuscatedName("bn.c")
    public int field1061 = 0;

    @ObfuscatedName("bn.b")
    public int field1056 = 0;

    @ObfuscatedName("bn.w")
    public long field1067 = 0L;

    @ObfuscatedName("bn.l")
    public boolean field1068 = true;

    @ObfuscatedName("bn.z")
    public int field1071 = 0;

    @ObfuscatedName("bn.t")
    public class69[] field1072 = new class69[8];

    @ObfuscatedName("bn.ab")
    public class69[] field1073 = new class69[8];

    @ObfuscatedName("m.x(Lcd;Ljava/awt/Component;III)Lbn;")
    public static final class58 method103(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1054 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1051 = new int[(Statics.field1060 ? 2 : 1) * 256];
                var4.field1070 = arg3;
                var4.method1108(arg1);
                var4.field1059 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1059 > 16384) {
                    var4.field1059 = 16384;
                }
                var4.method1121(var4.field1059);
                if (Statics.field1053 > 0 && Statics.field1052 == null) {
                    Statics.field1052 = new class64();
                    Statics.field1052.field1108 = arg0;
                    arg0.method1954(Statics.field1052, Statics.field1053);
                }
                if (Statics.field1052 != null) {
                    if (Statics.field1052.field1102[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1052.field1102[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bn.n(Lbs;B)V")
    public final synchronized void method1100(class69 arg0) {
        this.field1057 = arg0;
    }

    @ObfuscatedName("bn.g(I)V")
    public final synchronized void method1101() {
        if (this.field1051 == null) {
            return;
        }
        long var1 = class156.method1898();
        try {
            if (this.field1063 != 0L) {
                if (var1 < this.field1063) {
                    return;
                }
                this.method1121(this.field1059);
                this.field1063 = 0L;
                this.field1068 = true;
            }
            int var3 = this.method1110();
            if (this.field1056 - var3 > this.field1064) {
                this.field1064 = this.field1056 - var3;
            }
            int var4 = this.field1070 + this.field1062;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1059) {
                this.field1059 += 1024;
                if (this.field1059 > 16384) {
                    this.field1059 = 16384;
                }
                this.method1112();
                this.method1121(this.field1059);
                var3 = 0;
                this.field1068 = true;
                if (var4 + 256 > this.field1059) {
                    var4 = this.field1059 - 256;
                    this.field1062 = var4 - this.field1070;
                }
            }
            while (var3 < var4) {
                this.method1106(this.field1051, 256);
                this.method1111();
                var3 += 256;
            }
            if (var1 > this.field1067) {
                if (this.field1068) {
                    this.field1068 = false;
                } else if (this.field1064 == 0 && this.field1061 == 0) {
                    this.method1112();
                    this.field1063 = var1 + 2000L;
                    return;
                } else {
                    this.field1062 = Math.min(this.field1061, this.field1064);
                    this.field1061 = this.field1064;
                }
                this.field1064 = 0;
                this.field1067 = var1 + 2000L;
            }
            this.field1056 = var3;
        } catch (Exception var8) {
            this.method1112();
            this.field1063 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1066 + 500000L) {
                var1 = this.field1066;
            }
            while (var1 > this.field1066 + 5000L) {
                this.method1122(256);
                this.field1066 += (long) (256000 / Statics.field1054);
            }
        } catch (Exception var7) {
            this.field1066 = var1;
        }
    }

    @ObfuscatedName("bn.v(I)V")
    public final void method1131() {
        this.field1068 = true;
    }

    @ObfuscatedName("bn.y(I)V")
    public final synchronized void method1103() {
        this.field1068 = true;
        try {
            this.method1113();
        } catch (Exception var2) {
            this.method1112();
            this.field1063 = class156.method1898() + 2000L;
        }
    }

    @ObfuscatedName("bn.p(I)V")
    public final synchronized void method1104() {
        if (Statics.field1052 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1052.field1102[var2] == this) {
                    Statics.field1052.field1102[var2] = null;
                }
                if (Statics.field1052.field1102[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1052.field1103 = true;
                while (Statics.field1052.field1104) {
                    class162.method951(50L);
                }
                Statics.field1052 = null;
            }
        }
        this.method1112();
        this.field1051 = null;
    }

    @ObfuscatedName("bn.j(IB)V")
    public final void method1122(int arg0) {
        this.field1071 -= arg0;
        if (this.field1071 < 0) {
            this.field1071 = 0;
        }
        if (this.field1057 != null) {
            this.field1057.method987(arg0);
        }
    }

    @ObfuscatedName("bn.s([II)V")
    public final void method1106(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1060) {
            var3 = arg1 << 1;
        }
        class164.method3001(arg0, 0, var3);
        this.field1071 -= arg1;
        if (this.field1057 != null && this.field1071 <= 0) {
            this.field1071 += Statics.field1054 >> 4;
            method949(this.field1057);
            this.method1107(this.field1057, this.field1057.method1233());
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
                        class69 var11 = this.field1072[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1160;
                                if (var12 == null || var12.field1191 <= var8) {
                                    var11.field1157 = true;
                                    int var13 = var11.method984();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1191 += var13;
                                    }
                                    if (var4 >= this.field1058) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method982();
                                    if (var14 != null) {
                                        int var15 = var11.field1158;
                                        while (var14 != null) {
                                            this.method1107(var14, var15 * var14.method1233() >> 8);
                                            var14 = var11.method983();
                                        }
                                    }
                                    class69 var16 = var11.field1159;
                                    var11.field1159 = null;
                                    if (var10 == null) {
                                        this.field1072[var7] = var16;
                                    } else {
                                        var10.field1159 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1073[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1159;
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
                class69 var18 = this.field1072[var17];
                class69[] var19 = this.field1072;
                this.field1073[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1159;
                    var18.field1159 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1071 < 0) {
            this.field1071 = 0;
        }
        if (this.field1057 != null) {
            this.field1057.method985(arg0, 0, arg1);
        }
        this.field1066 = class156.method1898();
    }

    @ObfuscatedName("ai.k(Lbs;I)V")
    public static final void method949(class69 arg0) {
        arg0.field1157 = false;
        if (arg0.field1160 != null) {
            arg0.field1160.field1191 = 0;
        }
        for (class69 var1 = arg0.method982(); var1 != null; var1 = arg0.method983()) {
            method949(var1);
        }
    }

    @ObfuscatedName("bn.f(Lbs;IB)V")
    public final void method1107(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1073[var3];
        if (var4 == null) {
            this.field1072[var3] = arg0;
        } else {
            var4.field1159 = arg0;
        }
        this.field1073[var3] = arg0;
        arg0.field1158 = arg1;
    }

    @ObfuscatedName("bn.o(Ljava/awt/Component;I)V")
    public void method1108(Component arg0) throws Exception {
    }

    @ObfuscatedName("bn.q(II)V")
    public void method1121(int arg0) throws Exception {
    }

    @ObfuscatedName("bn.c(I)I")
    public int method1110() throws Exception {
        return this.field1059;
    }

    @ObfuscatedName("bn.b()V")
    public void method1111() throws Exception {
    }

    @ObfuscatedName("bn.w(I)V")
    public void method1112() {
    }

    @ObfuscatedName("bn.l(I)V")
    public void method1113() throws Exception {
    }
}
