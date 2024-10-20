package deob;

import java.awt.Component;

@ObfuscatedName("ah")
public class class52 {

    @ObfuscatedName("ah.n")
    public int[] field1087;

    @ObfuscatedName("ah.c")
    public class48 field1079;

    @ObfuscatedName("ah.h")
    public int field1072 = 32;

    @ObfuscatedName("ah.u")
    public long field1073 = class121.method2636();

    @ObfuscatedName("ah.y")
    public int field1074;

    @ObfuscatedName("ah.b")
    public int field1075;

    @ObfuscatedName("ah.t")
    public int field1081;

    @ObfuscatedName("ah.r")
    public long field1077 = 0L;

    @ObfuscatedName("ah.g")
    public int field1078 = 0;

    @ObfuscatedName("ah.m")
    public int field1085 = 0;

    @ObfuscatedName("ah.o")
    public int field1080 = 0;

    @ObfuscatedName("ah.e")
    public long field1070 = 0L;

    @ObfuscatedName("ah.f")
    public boolean field1076 = true;

    @ObfuscatedName("ah.as")
    public int field1090 = 0;

    @ObfuscatedName("ah.al")
    public class48[] field1086 = new class48[8];

    @ObfuscatedName("ah.aj")
    public class48[] field1069 = new class48[8];

    @ObfuscatedName("dp.f(Lbp;Ljava/awt/Component;III)Lah;")
    public static final class52 method2258(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1082 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1087 = new int[256 * (Statics.field1974 ? 2 : 1)];
                var4.field1075 = arg3;
                var4.method904(arg1);
                var4.field1074 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1074 > 16384) {
                    var4.field1074 = 16384;
                }
                var4.method908(var4.field1074);
                if (Statics.field1068 > 0 && Statics.field1067 == null) {
                    Statics.field1067 = new class55();
                    Statics.field1067.field1156 = arg0;
                    arg0.method1458(Statics.field1067, Statics.field1068);
                }
                if (Statics.field1067 != null) {
                    if (Statics.field1067.field1151[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1067.field1151[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1087 = new int[256 * (Statics.field1974 ? 2 : 1)];
                    var6.field1075 = arg3;
                    var6.method904(arg1);
                    var6.field1074 = 16384;
                    var6.method908(var6.field1074);
                    if (Statics.field1068 > 0 && Statics.field1067 == null) {
                        Statics.field1067 = new class55();
                        Statics.field1067.field1156 = arg0;
                        arg0.method1458(Statics.field1067, Statics.field1068);
                    }
                    if (Statics.field1067 != null) {
                        if (Statics.field1067.field1151[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1067.field1151[arg2] = var6;
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

    @ObfuscatedName("ah.i(Lau;I)V")
    public final synchronized void method1123(class48 arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("ah.d(I)V")
    public final synchronized void method1124() {
        if (this.field1087 == null) {
            return;
        }
        long var1 = class121.method2636();
        try {
            if (this.field1077 != 0L) {
                if (var1 < this.field1077) {
                    return;
                }
                this.method908(this.field1074);
                this.field1077 = 0L;
                this.field1076 = true;
            }
            int var3 = this.method905();
            if (this.field1080 - var3 > this.field1078) {
                this.field1078 = this.field1080 - var3;
            }
            int var4 = this.field1081 + this.field1075;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1074) {
                this.field1074 += 1024;
                if (this.field1074 > 16384) {
                    this.field1074 = 16384;
                }
                this.method907();
                this.method908(this.field1074);
                var3 = 0;
                this.field1076 = true;
                if (var4 + 256 > this.field1074) {
                    var4 = this.field1074 - 256;
                    this.field1081 = var4 - this.field1075;
                }
            }
            while (var3 < var4) {
                this.method1142(this.field1087, 256);
                this.method906();
                var3 += 256;
            }
            if (var1 > this.field1070) {
                if (this.field1076) {
                    this.field1076 = false;
                } else if (this.field1078 == 0 && this.field1085 == 0) {
                    this.method907();
                    this.field1077 = var1 + 2000L;
                    return;
                } else {
                    this.field1081 = Math.min(this.field1085, this.field1078);
                    this.field1085 = this.field1078;
                }
                this.field1078 = 0;
                this.field1070 = var1 + 2000L;
            }
            this.field1080 = var3;
        } catch (Exception var8) {
            this.method907();
            this.field1077 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1073 + 500000L) {
                var1 = this.field1073;
            }
            while (var1 > this.field1073 + 5000L) {
                this.method1128(256);
                this.field1073 += (long) (256000 / Statics.field1082);
            }
        } catch (Exception var7) {
            this.field1073 = var1;
        }
    }

    @ObfuscatedName("ah.z(B)V")
    public final void method1148() {
        this.field1076 = true;
    }

    @ObfuscatedName("ah.ai(I)V")
    public final synchronized void method1126() {
        this.field1076 = true;
        try {
            this.method911();
        } catch (Exception var2) {
            this.method907();
            this.field1077 = class121.method2636() + 2000L;
        }
    }

    @ObfuscatedName("ah.ag(I)V")
    public final synchronized void method1127() {
        if (Statics.field1067 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1067.field1151[var2] == this) {
                    Statics.field1067.field1151[var2] = null;
                }
                if (Statics.field1067.field1151[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1067.field1153 = true;
                while (Statics.field1067.field1159) {
                    class126.method731(50L);
                }
                Statics.field1067 = null;
            }
        }
        this.method907();
        this.field1087 = null;
    }

    @ObfuscatedName("ah.as(II)V")
    public final void method1128(int arg0) {
        this.field1090 -= arg0;
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method950(arg0);
        }
    }

    @ObfuscatedName("ah.al([II)V")
    public final void method1142(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1974) {
            var3 = arg1 << 1;
        }
        class128.method2594(arg0, 0, var3);
        this.field1090 -= arg1;
        if (this.field1079 != null && this.field1090 <= 0) {
            this.field1090 += Statics.field1082 >> 4;
            method2271(this.field1079);
            this.method1150(this.field1079, this.field1079.method995());
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
                        class48 var11 = this.field1086[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1043;
                                if (var12 == null || var12.field1042 <= var8) {
                                    var11.field1045 = true;
                                    int var13 = var11.method976();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1042 += var13;
                                    }
                                    if (var4 >= this.field1072) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method946();
                                    if (var14 != null) {
                                        int var15 = var11.field1044;
                                        while (var14 != null) {
                                            this.method1150(var14, var15 * var14.method995() >> 8);
                                            var14 = var11.method947();
                                        }
                                    }
                                    class48 var16 = var11.field1046;
                                    var11.field1046 = null;
                                    if (var10 == null) {
                                        this.field1086[var7] = var16;
                                    } else {
                                        var10.field1046 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1069[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1046;
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
                class48 var18 = this.field1086[var17];
                class48[] var19 = this.field1086;
                this.field1069[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1046;
                    var18.field1046 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method1006(arg0, 0, arg1);
        }
        this.field1073 = class121.method2636();
    }

    @ObfuscatedName("du.aj(Lau;I)V")
    public static final void method2271(class48 arg0) {
        arg0.field1045 = false;
        if (arg0.field1043 != null) {
            arg0.field1043.field1042 = 0;
        }
        for (class48 var1 = arg0.method946(); var1 != null; var1 = arg0.method947()) {
            method2271(var1);
        }
    }

    @ObfuscatedName("ah.am(Lau;II)V")
    public final void method1150(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1069[var3];
        if (var4 == null) {
            this.field1086[var3] = arg0;
        } else {
            var4.field1046 = arg0;
        }
        this.field1069[var3] = arg0;
        arg0.field1044 = arg1;
    }

    @ObfuscatedName("ah.x(Ljava/awt/Component;)V")
    public void method904(Component arg0) throws Exception {
    }

    @ObfuscatedName("ah.p(I)V")
    public void method908(int arg0) throws Exception {
    }

    @ObfuscatedName("ah.k()I")
    public int method905() throws Exception {
        return this.field1074;
    }

    @ObfuscatedName("ah.a()V")
    public void method906() throws Exception {
    }

    @ObfuscatedName("ah.q()V")
    public void method907() {
    }

    @ObfuscatedName("ah.j()V")
    public void method911() throws Exception {
    }
}
