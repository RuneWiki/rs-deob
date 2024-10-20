package deob;

import java.awt.Component;

@ObfuscatedName("aw")
public class class52 {

    @ObfuscatedName("aw.h")
    public int[] field1087;

    @ObfuscatedName("aw.b")
    public class48 field1088;

    @ObfuscatedName("aw.r")
    public int field1089 = 32;

    @ObfuscatedName("aw.t")
    public long field1090 = class121.method533();

    @ObfuscatedName("aw.u")
    public int field1099;

    @ObfuscatedName("aw.g")
    public int field1086;

    @ObfuscatedName("aw.e")
    public int field1093;

    @ObfuscatedName("aw.n")
    public long field1085 = 0L;

    @ObfuscatedName("aw.o")
    public int field1095 = 0;

    @ObfuscatedName("aw.a")
    public int field1096 = 0;

    @ObfuscatedName("aw.f")
    public int field1091 = 0;

    @ObfuscatedName("aw.s")
    public long field1101 = 0L;

    @ObfuscatedName("aw.w")
    public boolean field1092 = true;

    @ObfuscatedName("aw.ao")
    public int field1100 = 0;

    @ObfuscatedName("aw.af")
    public class48[] field1103 = new class48[8];

    @ObfuscatedName("aw.ae")
    public class48[] field1098 = new class48[8];

    @ObfuscatedName("ap.ap(IZII)V")
    public static final void method241(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1097 = arg0;
        Statics.field1034 = arg1;
        Statics.field1105 = arg2;
    }

    @ObfuscatedName("ex.am(Lba;Ljava/awt/Component;III)Law;")
    public static final class52 method2882(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1097 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1087 = new int[(Statics.field1034 ? 2 : 1) * 256];
                var4.field1086 = arg3;
                var4.method929(arg1);
                var4.field1099 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1099 > 16384) {
                    var4.field1099 = 16384;
                }
                var4.method930(var4.field1099);
                if (Statics.field1105 > 0 && Statics.field256 == null) {
                    Statics.field256 = new class55();
                    Statics.field256.field1169 = arg0;
                    arg0.method1512(Statics.field256, Statics.field1105);
                }
                if (Statics.field256 != null) {
                    if (Statics.field256.field1168[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field256.field1168[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1087 = new int[256 * (Statics.field1034 ? 2 : 1)];
                    var6.field1086 = arg3;
                    var6.method929(arg1);
                    var6.field1099 = 16384;
                    var6.method930(var6.field1099);
                    if (Statics.field1105 > 0 && Statics.field256 == null) {
                        Statics.field256 = new class55();
                        Statics.field256.field1169 = arg0;
                        arg0.method1512(Statics.field256, Statics.field1105);
                    }
                    if (Statics.field256 != null) {
                        if (Statics.field256.field1168[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field256.field1168[arg2] = var6;
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

    @ObfuscatedName("aw.ao(Lav;I)V")
    public final synchronized void method1175(class48 arg0) {
        this.field1088 = arg0;
    }

    @ObfuscatedName("aw.af(I)V")
    public final synchronized void method1168() {
        if (this.field1087 == null) {
            return;
        }
        long var1 = class121.method533();
        try {
            if (this.field1085 != 0L) {
                if (var1 < this.field1085) {
                    return;
                }
                this.method930(this.field1099);
                this.field1085 = 0L;
                this.field1092 = true;
            }
            int var3 = this.method931();
            if (this.field1091 - var3 > this.field1095) {
                this.field1095 = this.field1091 - var3;
            }
            int var4 = this.field1093 + this.field1086;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1099) {
                this.field1099 += 1024;
                if (this.field1099 > 16384) {
                    this.field1099 = 16384;
                }
                this.method948();
                this.method930(this.field1099);
                var3 = 0;
                this.field1092 = true;
                if (var4 + 256 > this.field1099) {
                    var4 = this.field1099 - 256;
                    this.field1093 = var4 - this.field1086;
                }
            }
            while (var3 < var4) {
                this.method1171(this.field1087, 256);
                this.method940();
                var3 += 256;
            }
            if (var1 > this.field1101) {
                if (this.field1092) {
                    this.field1092 = false;
                } else if (this.field1095 == 0 && this.field1096 == 0) {
                    this.method948();
                    this.field1085 = var1 + 2000L;
                    return;
                } else {
                    this.field1093 = Math.min(this.field1096, this.field1095);
                    this.field1096 = this.field1095;
                }
                this.field1095 = 0;
                this.field1101 = var1 + 2000L;
            }
            this.field1091 = var3;
        } catch (Exception var8) {
            this.method948();
            this.field1085 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1090 + 500000L) {
                var1 = this.field1090;
            }
            while (var1 > this.field1090 + 5000L) {
                this.method1170(256);
                this.field1090 += (long) (256000 / Statics.field1097);
            }
        } catch (Exception var7) {
            this.field1090 = var1;
        }
    }

    @ObfuscatedName("aw.ae(I)V")
    public final void method1173() {
        this.field1092 = true;
    }

    @ObfuscatedName("aw.az(I)V")
    public final synchronized void method1177() {
        this.field1092 = true;
        try {
            this.method937();
        } catch (Exception var2) {
            this.method948();
            this.field1085 = class121.method533() + 2000L;
        }
    }

    @ObfuscatedName("aw.al(S)V")
    public final synchronized void method1169() {
        if (Statics.field256 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field256.field1168[var2] == this) {
                    Statics.field256.field1168[var2] = null;
                }
                if (Statics.field256.field1168[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field256.field1167 = true;
                while (Statics.field256.field1170) {
                    class126.method210(50L);
                }
                Statics.field256 = null;
            }
        }
        this.method948();
        this.field1087 = null;
    }

    @ObfuscatedName("aw.ak(II)V")
    public final void method1170(int arg0) {
        this.field1100 -= arg0;
        if (this.field1100 < 0) {
            this.field1100 = 0;
        }
        if (this.field1088 != null) {
            this.field1088.method981(arg0);
        }
    }

    @ObfuscatedName("aw.ac([II)V")
    public final void method1171(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1034) {
            var3 = arg1 << 1;
        }
        class128.method2610(arg0, 0, var3);
        this.field1100 -= arg1;
        if (this.field1088 != null && this.field1100 <= 0) {
            this.field1100 += Statics.field1097 >> 4;
            method242(this.field1088);
            this.method1183(this.field1088, this.field1088.method1081());
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
                        class48 var11 = this.field1103[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1061;
                                if (var12 == null || var12.field1060 <= var8) {
                                    var11.field1064 = true;
                                    int var13 = var11.method979();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1060 += var13;
                                    }
                                    if (var4 >= this.field1089) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method1006();
                                    if (var14 != null) {
                                        int var15 = var11.field1062;
                                        while (var14 != null) {
                                            this.method1183(var14, var15 * var14.method1081() >> 8);
                                            var14 = var11.method1039();
                                        }
                                    }
                                    class48 var16 = var11.field1063;
                                    var11.field1063 = null;
                                    if (var10 == null) {
                                        this.field1103[var7] = var16;
                                    } else {
                                        var10.field1063 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1098[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1063;
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
                class48 var18 = this.field1103[var17];
                class48[] var19 = this.field1103;
                this.field1098[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1063;
                    var18.field1063 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1100 < 0) {
            this.field1100 = 0;
        }
        if (this.field1088 != null) {
            this.field1088.method1059(arg0, 0, arg1);
        }
        this.field1090 = class121.method533();
    }

    @ObfuscatedName("ap.an(Lav;I)V")
    public static final void method242(class48 arg0) {
        arg0.field1064 = false;
        if (arg0.field1061 != null) {
            arg0.field1061.field1060 = 0;
        }
        for (class48 var1 = arg0.method1006(); var1 != null; var1 = arg0.method1039()) {
            method242(var1);
        }
    }

    @ObfuscatedName("aw.ai(Lav;II)V")
    public final void method1183(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1098[var3];
        if (var4 == null) {
            this.field1103[var3] = arg0;
        } else {
            var4.field1063 = arg0;
        }
        this.field1098[var3] = arg0;
        arg0.field1062 = arg1;
    }

    @ObfuscatedName("aw.q(Ljava/awt/Component;)V")
    public void method929(Component arg0) throws Exception {
    }

    @ObfuscatedName("aw.c(I)V")
    public void method930(int arg0) throws Exception {
    }

    @ObfuscatedName("aw.p()I")
    public int method931() throws Exception {
        return this.field1099;
    }

    @ObfuscatedName("aw.z()V")
    public void method940() throws Exception {
    }

    @ObfuscatedName("aw.m()V")
    public void method948() {
    }

    @ObfuscatedName("aw.k()V")
    public void method937() throws Exception {
    }
}
