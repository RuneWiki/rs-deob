package deob;

import java.awt.Component;

@ObfuscatedName("af")
public class class50 {

    @ObfuscatedName("af.l")
    public int[] field1068;

    @ObfuscatedName("af.f")
    public class60 field1069;

    @ObfuscatedName("af.c")
    public int field1070 = 32;

    @ObfuscatedName("af.i")
    public long field1071 = class103.method527();

    @ObfuscatedName("af.o")
    public int field1072;

    @ObfuscatedName("af.d")
    public int field1073;

    @ObfuscatedName("af.b")
    public int field1074;

    @ObfuscatedName("af.v")
    public long field1075 = 0L;

    @ObfuscatedName("af.n")
    public int field1067 = 0;

    @ObfuscatedName("af.w")
    public int field1080 = 0;

    @ObfuscatedName("af.z")
    public int field1077 = 0;

    @ObfuscatedName("af.x")
    public long field1079 = 0L;

    @ObfuscatedName("af.q")
    public boolean field1078 = true;

    @ObfuscatedName("af.ak")
    public int field1081 = 0;

    @ObfuscatedName("af.ab")
    public class60[] field1086 = new class60[8];

    @ObfuscatedName("af.as")
    public class60[] field1083 = new class60[8];

    @ObfuscatedName("ew.n(Ldb;Ljava/awt/Component;IIB)Laf;")
    public static final class50 method2660(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1076 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1068 = new int[(Statics.field1066 ? 2 : 1) * 256];
                var4.field1073 = arg3;
                var4.method962(arg1);
                var4.field1072 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1072 > 16384) {
                    var4.field1072 = 16384;
                }
                var4.method959(var4.field1072);
                if (Statics.field1893 > 0 && Statics.field1065 == null) {
                    Statics.field1065 = new class66();
                    Statics.field1065.field1242 = arg0;
                    arg0.method2480(Statics.field1065, Statics.field1893);
                }
                if (Statics.field1065 != null) {
                    if (Statics.field1065.field1241[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1065.field1241[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1068 = new int[256 * (Statics.field1066 ? 2 : 1)];
                    var6.field1073 = arg3;
                    var6.method962(arg1);
                    var6.field1072 = 16384;
                    var6.method959(var6.field1072);
                    if (Statics.field1893 > 0 && Statics.field1065 == null) {
                        Statics.field1065 = new class66();
                        Statics.field1065.field1242 = arg0;
                        arg0.method2480(Statics.field1065, Statics.field1893);
                    }
                    if (Statics.field1065 != null) {
                        if (Statics.field1065.field1241[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1065.field1241[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class50();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("af.w(Lbc;I)V")
    public final synchronized void method1020(class60 arg0) {
        this.field1069 = arg0;
    }

    @ObfuscatedName("af.z(I)V")
    public final synchronized void method1029() {
        if (this.field1068 == null) {
            return;
        }
        long var1 = class103.method527();
        try {
            if (this.field1075 != 0L) {
                if (var1 < this.field1075) {
                    return;
                }
                this.method959(this.field1072);
                this.field1075 = 0L;
                this.field1078 = true;
            }
            int var3 = this.method960();
            if (this.field1077 - var3 > this.field1067) {
                this.field1067 = this.field1077 - var3;
            }
            int var4 = this.field1074 + this.field1073;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1072) {
                this.field1072 += 1024;
                if (this.field1072 > 16384) {
                    this.field1072 = 16384;
                }
                this.method967();
                this.method959(this.field1072);
                var3 = 0;
                this.field1078 = true;
                if (var4 + 256 > this.field1072) {
                    var4 = this.field1072 - 256;
                    this.field1074 = var4 - this.field1073;
                }
            }
            while (var3 < var4) {
                this.method1026(this.field1068, 256);
                this.method961();
                var3 += 256;
            }
            if (var1 > this.field1079) {
                if (this.field1078) {
                    this.field1078 = false;
                } else if (this.field1067 == 0 && this.field1080 == 0) {
                    this.method967();
                    this.field1075 = var1 + 2000L;
                    return;
                } else {
                    this.field1074 = Math.min(this.field1080, this.field1067);
                    this.field1080 = this.field1067;
                }
                this.field1067 = 0;
                this.field1079 = var1 + 2000L;
            }
            this.field1077 = var3;
        } catch (Exception var8) {
            this.method967();
            this.field1075 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1071 + 500000L) {
                var1 = this.field1071;
            }
            while (var1 > this.field1071 + 5000L) {
                this.method1025(256);
                this.field1071 += (long) (256000 / Statics.field1076);
            }
        } catch (Exception var7) {
            this.field1071 = var1;
        }
    }

    @ObfuscatedName("af.x(B)V")
    public final void method1022() {
        this.field1078 = true;
    }

    @ObfuscatedName("af.q(B)V")
    public final synchronized void method1023() {
        this.field1078 = true;
        try {
            this.method963();
        } catch (Exception var2) {
            this.method967();
            this.field1075 = class103.method527() + 2000L;
        }
    }

    @ObfuscatedName("af.s(B)V")
    public final synchronized void method1024() {
        if (Statics.field1065 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1065.field1241[var2] == this) {
                    Statics.field1065.field1241[var2] = null;
                }
                if (Statics.field1065.field1241[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1065.field1246 = true;
                while (Statics.field1065.field1243) {
                    class114.method658(50L);
                }
                Statics.field1065 = null;
            }
        }
        this.method967();
        this.field1068 = null;
    }

    @ObfuscatedName("af.j(IB)V")
    public final void method1025(int arg0) {
        this.field1081 -= arg0;
        if (this.field1081 < 0) {
            this.field1081 = 0;
        }
        if (this.field1069 != null) {
            this.field1069.method984(arg0);
        }
    }

    @ObfuscatedName("af.y([II)V")
    public final void method1026(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1066) {
            var3 = arg1 << 1;
        }
        class108.method2342(arg0, 0, var3);
        this.field1081 -= arg1;
        if (this.field1069 != null && this.field1081 <= 0) {
            this.field1081 += Statics.field1076 >> 4;
            method2414(this.field1069);
            this.method1030(this.field1069, this.field1069.method1124());
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
                        class60 var10 = null;
                        class60 var11 = this.field1086[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1158;
                                if (var12 == null || var12.field1155 <= var8) {
                                    var11.field1159 = true;
                                    int var13 = var11.method1017();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1155 += var13;
                                    }
                                    if (var4 >= this.field1070) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method1002();
                                    if (var14 != null) {
                                        int var15 = var11.field1157;
                                        while (var14 != null) {
                                            this.method1030(var14, var15 * var14.method1124() >> 8);
                                            var14 = var11.method980();
                                        }
                                    }
                                    class60 var16 = var11.field1156;
                                    var11.field1156 = null;
                                    if (var10 == null) {
                                        this.field1086[var7] = var16;
                                    } else {
                                        var10.field1156 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1083[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1156;
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
                class60 var18 = this.field1086[var17];
                class60[] var19 = this.field1086;
                this.field1083[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1156;
                    var18.field1156 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1081 < 0) {
            this.field1081 = 0;
        }
        if (this.field1069 != null) {
            this.field1069.method982(arg0, 0, arg1);
        }
        this.field1071 = class103.method527();
    }

    @ObfuscatedName("dl.r(Lbc;B)V")
    public static final void method2414(class60 arg0) {
        arg0.field1159 = false;
        if (arg0.field1158 != null) {
            arg0.field1158.field1155 = 0;
        }
        for (class60 var1 = arg0.method1002(); var1 != null; var1 = arg0.method980()) {
            method2414(var1);
        }
    }

    @ObfuscatedName("af.h(Lbc;II)V")
    public final void method1030(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1083[var3];
        if (var4 == null) {
            this.field1086[var3] = arg0;
        } else {
            var4.field1156 = arg0;
        }
        this.field1083[var3] = arg0;
        arg0.field1157 = arg1;
    }

    @ObfuscatedName("af.e(Ljava/awt/Component;)V")
    public void method962(Component arg0) throws Exception {
    }

    @ObfuscatedName("af.p(I)V")
    public void method959(int arg0) throws Exception {
    }

    @ObfuscatedName("af.a()I")
    public int method960() throws Exception {
        return this.field1072;
    }

    @ObfuscatedName("af.g()V")
    public void method961() throws Exception {
    }

    @ObfuscatedName("af.u()V")
    public void method967() {
    }

    @ObfuscatedName("af.k()V")
    public void method963() throws Exception {
    }
}
