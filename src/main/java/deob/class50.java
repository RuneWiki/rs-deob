package deob;

import java.awt.Component;

@ObfuscatedName("ah")
public class class50 {

    @ObfuscatedName("ah.u")
    public int[] field1071;

    @ObfuscatedName("ah.d")
    public class60 field1079;

    @ObfuscatedName("ah.h")
    public int field1073 = 32;

    @ObfuscatedName("ah.a")
    public long field1074 = class103.method550();

    @ObfuscatedName("ah.y")
    public int field1085;

    @ObfuscatedName("ah.v")
    public int field1076;

    @ObfuscatedName("ah.e")
    public int field1069;

    @ObfuscatedName("ah.b")
    public long field1086 = 0L;

    @ObfuscatedName("ah.z")
    public int field1077 = 0;

    @ObfuscatedName("ah.l")
    public int field1080 = 0;

    @ObfuscatedName("ah.t")
    public int field1081 = 0;

    @ObfuscatedName("ah.q")
    public long field1082 = 0L;

    @ObfuscatedName("ah.j")
    public boolean field1072 = true;

    @ObfuscatedName("ah.an")
    public int field1078 = 0;

    @ObfuscatedName("ah.aw")
    public class60[] field1083 = new class60[8];

    @ObfuscatedName("ah.at")
    public class60[] field1087 = new class60[8];

    @ObfuscatedName("cx.i(IZII)V")
    public static final void method1940(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2674 = arg0;
        Statics.field1924 = arg1;
        Statics.field1075 = arg2;
    }

    @ObfuscatedName("f.m(Ldq;Ljava/awt/Component;IIB)Lah;")
    public static final class50 method545(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2674 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1071 = new int[256 * (Statics.field1924 ? 2 : 1)];
                var4.field1076 = arg3;
                var4.method979(arg1);
                var4.field1085 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1085 > 16384) {
                    var4.field1085 = 16384;
                }
                var4.method980(var4.field1085);
                if (Statics.field1075 > 0 && Statics.field566 == null) {
                    Statics.field566 = new class66();
                    Statics.field566.field1249 = arg0;
                    arg0.method2546(Statics.field566, Statics.field1075);
                }
                if (Statics.field566 != null) {
                    if (Statics.field566.field1239[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field566.field1239[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1071 = new int[256 * (Statics.field1924 ? 2 : 1)];
                    var6.field1076 = arg3;
                    var6.method979(arg1);
                    var6.field1085 = 16384;
                    var6.method980(var6.field1085);
                    if (Statics.field1075 > 0 && Statics.field566 == null) {
                        Statics.field566 = new class66();
                        Statics.field566.field1249 = arg0;
                        arg0.method2546(Statics.field566, Statics.field1075);
                    }
                    if (Statics.field566 != null) {
                        if (Statics.field566.field1239[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field566.field1239[arg2] = var6;
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

    @ObfuscatedName("ah.f(Lbn;I)V")
    public final synchronized void method1039(class60 arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("ah.k(I)V")
    public final synchronized void method1045() {
        if (this.field1071 == null) {
            return;
        }
        long var1 = class103.method550();
        try {
            if (this.field1086 != 0L) {
                if (var1 < this.field1086) {
                    return;
                }
                this.method980(this.field1085);
                this.field1086 = 0L;
                this.field1072 = true;
            }
            int var3 = this.method981();
            if (this.field1081 - var3 > this.field1077) {
                this.field1077 = this.field1081 - var3;
            }
            int var4 = this.field1076 + this.field1069;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1085) {
                this.field1085 += 1024;
                if (this.field1085 > 16384) {
                    this.field1085 = 16384;
                }
                this.method983();
                this.method980(this.field1085);
                var3 = 0;
                this.field1072 = true;
                if (var4 + 256 > this.field1085) {
                    var4 = this.field1085 - 256;
                    this.field1069 = var4 - this.field1076;
                }
            }
            while (var3 < var4) {
                this.method1044(this.field1071, 256);
                this.method997();
                var3 += 256;
            }
            if (var1 > this.field1082) {
                if (this.field1072) {
                    this.field1072 = false;
                } else if (this.field1077 == 0 && this.field1080 == 0) {
                    this.method983();
                    this.field1086 = var1 + 2000L;
                    return;
                } else {
                    this.field1069 = Math.min(this.field1080, this.field1077);
                    this.field1080 = this.field1077;
                }
                this.field1077 = 0;
                this.field1082 = var1 + 2000L;
            }
            this.field1081 = var3;
        } catch (Exception var8) {
            this.method983();
            this.field1086 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1074 + 500000L) {
                var1 = this.field1074;
            }
            while (var1 > this.field1074 + 5000L) {
                this.method1043(256);
                this.field1074 += (long) (256000 / Statics.field2674);
            }
        } catch (Exception var7) {
            this.field1074 = var1;
        }
    }

    @ObfuscatedName("ah.an(B)V")
    public final void method1041() {
        this.field1072 = true;
    }

    @ObfuscatedName("ah.aw(B)V")
    public final synchronized void method1047() {
        this.field1072 = true;
        try {
            this.method986();
        } catch (Exception var2) {
            this.method983();
            this.field1086 = class103.method550() + 2000L;
        }
    }

    @ObfuscatedName("ah.at(I)V")
    public final synchronized void method1046() {
        if (Statics.field566 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field566.field1239[var2] == this) {
                    Statics.field566.field1239[var2] = null;
                }
                if (Statics.field566.field1239[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field566.field1240 = true;
                while (Statics.field566.field1241) {
                    class114.method1917(50L);
                }
                Statics.field566 = null;
            }
        }
        this.method983();
        this.field1071 = null;
    }

    @ObfuscatedName("ah.al(II)V")
    public final void method1043(int arg0) {
        this.field1078 -= arg0;
        if (this.field1078 < 0) {
            this.field1078 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method1010(arg0);
        }
    }

    @ObfuscatedName("ah.as([II)V")
    public final void method1044(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1924) {
            var3 = arg1 << 1;
        }
        class108.method2375(arg0, 0, var3);
        this.field1078 -= arg1;
        if (this.field1079 != null && this.field1078 <= 0) {
            this.field1078 += Statics.field2674 >> 4;
            method735(this.field1079);
            this.method1051(this.field1079, this.field1079.method1150());
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
                        class60 var11 = this.field1083[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1155;
                                if (var12 == null || var12.field1153 <= var8) {
                                    var11.field1157 = true;
                                    int var13 = var11.method1030();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1153 += var13;
                                    }
                                    if (var4 >= this.field1073) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method1005();
                                    if (var14 != null) {
                                        int var15 = var11.field1154;
                                        while (var14 != null) {
                                            this.method1051(var14, var15 * var14.method1150() >> 8);
                                            var14 = var11.method1029();
                                        }
                                    }
                                    class60 var16 = var11.field1156;
                                    var11.field1156 = null;
                                    if (var10 == null) {
                                        this.field1083[var7] = var16;
                                    } else {
                                        var10.field1156 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1087[var7] = var10;
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
                class60 var18 = this.field1083[var17];
                class60[] var19 = this.field1083;
                this.field1087[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1156;
                    var18.field1156 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1078 < 0) {
            this.field1078 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method1008(arg0, 0, arg1);
        }
        this.field1074 = class103.method550();
    }

    @ObfuscatedName("az.ak(Lbn;B)V")
    public static final void method735(class60 arg0) {
        arg0.field1157 = false;
        if (arg0.field1155 != null) {
            arg0.field1155.field1153 = 0;
        }
        for (class60 var1 = arg0.method1005(); var1 != null; var1 = arg0.method1029()) {
            method735(var1);
        }
    }

    @ObfuscatedName("ah.aa(Lbn;II)V")
    public final void method1051(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1087[var3];
        if (var4 == null) {
            this.field1083[var3] = arg0;
        } else {
            var4.field1156 = arg0;
        }
        this.field1087[var3] = arg0;
        arg0.field1154 = arg1;
    }

    @ObfuscatedName("ah.p(Ljava/awt/Component;)V")
    public void method979(Component arg0) throws Exception {
    }

    @ObfuscatedName("ah.g(I)V")
    public void method980(int arg0) throws Exception {
    }

    @ObfuscatedName("ah.x()I")
    public int method981() throws Exception {
        return this.field1085;
    }

    @ObfuscatedName("ah.c()V")
    public void method997() throws Exception {
    }

    @ObfuscatedName("ah.n()V")
    public void method983() {
    }

    @ObfuscatedName("ah.s()V")
    public void method986() throws Exception {
    }
}
