package deob;

import java.awt.Component;

@ObfuscatedName("ar")
public class class52 {

    @ObfuscatedName("ar.l")
    public int[] field1101;

    @ObfuscatedName("ar.i")
    public class48 field1082;

    @ObfuscatedName("ar.r")
    public int field1081 = 32;

    @ObfuscatedName("ar.o")
    public long field1091 = class121.method1389();

    @ObfuscatedName("ar.c")
    public int field1085;

    @ObfuscatedName("ar.f")
    public int field1086;

    @ObfuscatedName("ar.a")
    public int field1087;

    @ObfuscatedName("ar.t")
    public long field1097 = 0L;

    @ObfuscatedName("ar.u")
    public int field1089 = 0;

    @ObfuscatedName("ar.z")
    public int field1090 = 0;

    @ObfuscatedName("ar.v")
    public int field1102 = 0;

    @ObfuscatedName("ar.w")
    public long field1099 = 0L;

    @ObfuscatedName("ar.h")
    public boolean field1093 = true;

    @ObfuscatedName("ar.aj")
    public int field1083 = 0;

    @ObfuscatedName("ar.ax")
    public class48[] field1095 = new class48[8];

    @ObfuscatedName("ar.av")
    public class48[] field1096 = new class48[8];

    @ObfuscatedName("bh.v(Lba;Ljava/awt/Component;III)Lar;")
    public static final class52 method1284(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1094 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1101 = new int[256 * (Statics.field1077 ? 2 : 1)];
                var4.field1086 = arg3;
                var4.method935(arg1);
                var4.field1085 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1085 > 16384) {
                    var4.field1085 = 16384;
                }
                var4.method936(var4.field1085);
                if (Statics.field1078 > 0 && Statics.field1079 == null) {
                    Statics.field1079 = new class55();
                    Statics.field1079.field1165 = arg0;
                    arg0.method1495(Statics.field1079, Statics.field1078);
                }
                if (Statics.field1079 != null) {
                    if (Statics.field1079.field1166[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1079.field1166[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1101 = new int[256 * (Statics.field1077 ? 2 : 1)];
                    var6.field1086 = arg3;
                    var6.method935(arg1);
                    var6.field1085 = 16384;
                    var6.method936(var6.field1085);
                    if (Statics.field1078 > 0 && Statics.field1079 == null) {
                        Statics.field1079 = new class55();
                        Statics.field1079.field1165 = arg0;
                        arg0.method1495(Statics.field1079, Statics.field1078);
                    }
                    if (Statics.field1079 != null) {
                        if (Statics.field1079.field1166[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1079.field1166[arg2] = var6;
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

    @ObfuscatedName("ar.w(Lad;I)V")
    public final synchronized void method1168(class48 arg0) {
        this.field1082 = arg0;
    }

    @ObfuscatedName("ar.h(B)V")
    public final synchronized void method1185() {
        if (this.field1101 == null) {
            return;
        }
        long var1 = class121.method1389();
        try {
            if (this.field1097 != 0L) {
                if (var1 < this.field1097) {
                    return;
                }
                this.method936(this.field1085);
                this.field1097 = 0L;
                this.field1093 = true;
            }
            int var3 = this.method937();
            if (this.field1102 - var3 > this.field1089) {
                this.field1089 = this.field1102 - var3;
            }
            int var4 = this.field1087 + this.field1086;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1085) {
                this.field1085 += 1024;
                if (this.field1085 > 16384) {
                    this.field1085 = 16384;
                }
                this.method939();
                this.method936(this.field1085);
                var3 = 0;
                this.field1093 = true;
                if (var4 + 256 > this.field1085) {
                    var4 = this.field1085 - 256;
                    this.field1087 = var4 - this.field1086;
                }
            }
            while (var3 < var4) {
                this.method1173(this.field1101, 256);
                this.method945();
                var3 += 256;
            }
            if (var1 > this.field1099) {
                if (this.field1093) {
                    this.field1093 = false;
                } else if (this.field1089 == 0 && this.field1090 == 0) {
                    this.method939();
                    this.field1097 = var1 + 2000L;
                    return;
                } else {
                    this.field1087 = Math.min(this.field1090, this.field1089);
                    this.field1090 = this.field1089;
                }
                this.field1089 = 0;
                this.field1099 = var1 + 2000L;
            }
            this.field1102 = var3;
        } catch (Exception var8) {
            this.method939();
            this.field1097 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1091 + 500000L) {
                var1 = this.field1091;
            }
            while (var1 > this.field1091 + 5000L) {
                this.method1172(256);
                this.field1091 += (long) (256000 / Statics.field1094);
            }
        } catch (Exception var7) {
            this.field1091 = var1;
        }
    }

    @ObfuscatedName("ar.q(I)V")
    public final void method1169() {
        this.field1093 = true;
    }

    @ObfuscatedName("ar.g(I)V")
    public final synchronized void method1190() {
        this.field1093 = true;
        try {
            this.method940();
        } catch (Exception var2) {
            this.method939();
            this.field1097 = class121.method1389() + 2000L;
        }
    }

    @ObfuscatedName("ar.e(I)V")
    public final synchronized void method1171() {
        if (Statics.field1079 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1079.field1166[var2] == this) {
                    Statics.field1079.field1166[var2] = null;
                }
                if (Statics.field1079.field1166[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1079.field1169 = true;
                while (Statics.field1079.field1163) {
                    class126.method1326(50L);
                }
                Statics.field1079 = null;
            }
        }
        this.method939();
        this.field1101 = null;
    }

    @ObfuscatedName("ar.as(II)V")
    public final void method1172(int arg0) {
        this.field1083 -= arg0;
        if (this.field1083 < 0) {
            this.field1083 = 0;
        }
        if (this.field1082 != null) {
            this.field1082.method981(arg0);
        }
    }

    @ObfuscatedName("ar.an([II)V")
    public final void method1173(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1077) {
            var3 = arg1 << 1;
        }
        class128.method2667(arg0, 0, var3);
        this.field1083 -= arg1;
        if (this.field1082 != null && this.field1083 <= 0) {
            this.field1083 += Statics.field1094 >> 4;
            method2332(this.field1082);
            this.method1181(this.field1082, this.field1082.method1017());
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
                        class48 var10 = null;
                        class48 var11 = this.field1095[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1054;
                                if (var12 == null || var12.field1051 <= var8) {
                                    var11.field1055 = true;
                                    int var13 = var11.method984();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1051 += var13;
                                    }
                                    if (var4 >= this.field1081) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method977();
                                    if (var14 != null) {
                                        int var15 = var11.field1053;
                                        while (var14 != null) {
                                            this.method1181(var14, var15 * var14.method1017() >> 8);
                                            var14 = var11.method978();
                                        }
                                    }
                                    class48 var16 = var11.field1052;
                                    var11.field1052 = null;
                                    if (var10 == null) {
                                        this.field1095[var7] = var16;
                                    } else {
                                        var10.field1052 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1096[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1052;
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
                class48 var18 = this.field1095[var17];
                class48[] var19 = this.field1095;
                this.field1096[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1052;
                    var18.field1052 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1083 < 0) {
            this.field1083 = 0;
        }
        if (this.field1082 != null) {
            this.field1082.method1066(arg0, 0, arg1);
        }
        this.field1091 = class121.method1389();
    }

    @ObfuscatedName("dm.aj(Lad;B)V")
    public static final void method2332(class48 arg0) {
        arg0.field1055 = false;
        if (arg0.field1054 != null) {
            arg0.field1054.field1051 = 0;
        }
        for (class48 var1 = arg0.method977(); var1 != null; var1 = arg0.method978()) {
            method2332(var1);
        }
    }

    @ObfuscatedName("ar.ax(Lad;II)V")
    public final void method1181(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1096[var3];
        if (var4 == null) {
            this.field1095[var3] = arg0;
        } else {
            var4.field1052 = arg0;
        }
        this.field1096[var3] = arg0;
        arg0.field1053 = arg1;
    }

    @ObfuscatedName("ar.y(Ljava/awt/Component;)V")
    public void method935(Component arg0) throws Exception {
    }

    @ObfuscatedName("ar.m(I)V")
    public void method936(int arg0) throws Exception {
    }

    @ObfuscatedName("ar.d()I")
    public int method937() throws Exception {
        return this.field1085;
    }

    @ObfuscatedName("ar.k()V")
    public void method945() throws Exception {
    }

    @ObfuscatedName("ar.n()V")
    public void method939() {
    }

    @ObfuscatedName("ar.s()V")
    public void method940() throws Exception {
    }
}
