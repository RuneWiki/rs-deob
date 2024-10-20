package deob;

import java.awt.Component;

@ObfuscatedName("bd")
public class class58 {

    @ObfuscatedName("bd.r")
    public int[] field1067;

    @ObfuscatedName("bd.c")
    public class69 field1066;

    @ObfuscatedName("bd.i")
    public int field1080 = 32;

    @ObfuscatedName("bd.o")
    public long field1068 = class156.method12();

    @ObfuscatedName("bd.m")
    public int field1069;

    @ObfuscatedName("bd.s")
    public int field1070;

    @ObfuscatedName("bd.u")
    public int field1083;

    @ObfuscatedName("bd.b")
    public long field1061 = 0L;

    @ObfuscatedName("bd.v")
    public int field1073 = 0;

    @ObfuscatedName("bd.f")
    public int field1076 = 0;

    @ObfuscatedName("bd.z")
    public int field1064 = 0;

    @ObfuscatedName("bd.t")
    public long field1075 = 0L;

    @ObfuscatedName("bd.y")
    public boolean field1077 = true;

    @ObfuscatedName("bd.g")
    public int field1079 = 0;

    @ObfuscatedName("bd.e")
    public class69[] field1072 = new class69[8];

    @ObfuscatedName("bd.ae")
    public class69[] field1081 = new class69[8];

    @ObfuscatedName("ac.q(Lcc;Ljava/awt/Component;III)Lbd;")
    public static final class58 method780(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1062 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1067 = new int[256 * (Statics.field1071 ? 2 : 1)];
                var4.field1070 = arg3;
                var4.method1101(arg1);
                var4.field1069 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1069 > 16384) {
                    var4.field1069 = 16384;
                }
                var4.method1102(var4.field1069);
                if (Statics.field1063 > 0 && Statics.field1065 == null) {
                    Statics.field1065 = new class64();
                    Statics.field1065.field1105 = arg0;
                    arg0.method1930(Statics.field1065, Statics.field1063);
                }
                if (Statics.field1065 != null) {
                    if (Statics.field1065.field1108[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1065.field1108[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bd.d(Lbs;I)V")
    public final synchronized void method1093(class69 arg0) {
        this.field1066 = arg0;
    }

    @ObfuscatedName("bd.h(I)V")
    public final synchronized void method1094() {
        if (this.field1067 == null) {
            return;
        }
        long var1 = class156.method12();
        try {
            if (this.field1061 != 0L) {
                if (var1 < this.field1061) {
                    return;
                }
                this.method1102(this.field1069);
                this.field1061 = 0L;
                this.field1077 = true;
            }
            int var3 = this.method1118();
            if (this.field1064 - var3 > this.field1073) {
                this.field1073 = this.field1064 - var3;
            }
            int var4 = this.field1083 + this.field1070;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1069) {
                this.field1069 += 1024;
                if (this.field1069 > 16384) {
                    this.field1069 = 16384;
                }
                this.method1105();
                this.method1102(this.field1069);
                var3 = 0;
                this.field1077 = true;
                if (var4 + 256 > this.field1069) {
                    var4 = this.field1069 - 256;
                    this.field1083 = var4 - this.field1070;
                }
            }
            while (var3 < var4) {
                this.method1099(this.field1067, 256);
                this.method1104();
                var3 += 256;
            }
            if (var1 > this.field1075) {
                if (this.field1077) {
                    this.field1077 = false;
                } else if (this.field1073 == 0 && this.field1076 == 0) {
                    this.method1105();
                    this.field1061 = var1 + 2000L;
                    return;
                } else {
                    this.field1083 = Math.min(this.field1076, this.field1073);
                    this.field1076 = this.field1073;
                }
                this.field1073 = 0;
                this.field1075 = var1 + 2000L;
            }
            this.field1064 = var3;
        } catch (Exception var8) {
            this.method1105();
            this.field1061 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1068 + 500000L) {
                var1 = this.field1068;
            }
            while (var1 > this.field1068 + 5000L) {
                this.method1129(256);
                this.field1068 += (long) (256000 / Statics.field1062);
            }
        } catch (Exception var7) {
            this.field1068 = var1;
        }
    }

    @ObfuscatedName("bd.p(I)V")
    public final void method1095() {
        this.field1077 = true;
    }

    @ObfuscatedName("bd.j(I)V")
    public final synchronized void method1133() {
        this.field1077 = true;
        try {
            this.method1096();
        } catch (Exception var2) {
            this.method1105();
            this.field1061 = class156.method12() + 2000L;
        }
    }

    @ObfuscatedName("bd.n(B)V")
    public final synchronized void method1097() {
        if (Statics.field1065 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1065.field1108[var2] == this) {
                    Statics.field1065.field1108[var2] = null;
                }
                if (Statics.field1065.field1108[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1065.field1107 = true;
                while (Statics.field1065.field1111) {
                    class162.method2156(50L);
                }
                Statics.field1065 = null;
            }
        }
        this.method1105();
        this.field1067 = null;
    }

    @ObfuscatedName("bd.c(IB)V")
    public final void method1129(int arg0) {
        this.field1079 -= arg0;
        if (this.field1079 < 0) {
            this.field1079 = 0;
        }
        if (this.field1066 != null) {
            this.field1066.method978(arg0);
        }
    }

    @ObfuscatedName("bd.o([II)V")
    public final void method1099(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1071) {
            var3 = arg1 << 1;
        }
        class164.method2977(arg0, 0, var3);
        this.field1079 -= arg1;
        if (this.field1066 != null && this.field1079 <= 0) {
            this.field1079 += Statics.field1062 >> 4;
            method957(this.field1066);
            this.method1100(this.field1066, this.field1066.method1198());
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
                                class72 var12 = var11.field1157;
                                if (var12 == null || var12.field1191 <= var8) {
                                    var11.field1159 = true;
                                    int var13 = var11.method990();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1191 += var13;
                                    }
                                    if (var4 >= this.field1080) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method984();
                                    if (var14 != null) {
                                        int var15 = var11.field1160;
                                        while (var14 != null) {
                                            this.method1100(var14, var15 * var14.method1198() >> 8);
                                            var14 = var11.method974();
                                        }
                                    }
                                    class69 var16 = var11.field1158;
                                    var11.field1158 = null;
                                    if (var10 == null) {
                                        this.field1072[var7] = var16;
                                    } else {
                                        var10.field1158 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1081[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1158;
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
                this.field1081[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1158;
                    var18.field1158 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1079 < 0) {
            this.field1079 = 0;
        }
        if (this.field1066 != null) {
            this.field1066.method976(arg0, 0, arg1);
        }
        this.field1068 = class156.method12();
    }

    @ObfuscatedName("av.s(Lbs;I)V")
    public static final void method957(class69 arg0) {
        arg0.field1159 = false;
        if (arg0.field1157 != null) {
            arg0.field1157.field1191 = 0;
        }
        for (class69 var1 = arg0.method984(); var1 != null; var1 = arg0.method974()) {
            method957(var1);
        }
    }

    @ObfuscatedName("bd.u(Lbs;II)V")
    public final void method1100(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1081[var3];
        if (var4 == null) {
            this.field1072[var3] = arg0;
        } else {
            var4.field1158 = arg0;
        }
        this.field1081[var3] = arg0;
        arg0.field1160 = arg1;
    }

    @ObfuscatedName("bd.b(Ljava/awt/Component;I)V")
    public void method1101(Component arg0) throws Exception {
    }

    @ObfuscatedName("bd.v(II)V")
    public void method1102(int arg0) throws Exception {
    }

    @ObfuscatedName("bd.f(I)I")
    public int method1118() throws Exception {
        return this.field1069;
    }

    @ObfuscatedName("bd.z()V")
    public void method1104() throws Exception {
    }

    @ObfuscatedName("bd.t(I)V")
    public void method1105() {
    }

    @ObfuscatedName("bd.y(S)V")
    public void method1096() throws Exception {
    }
}
