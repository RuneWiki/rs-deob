package deob;

import java.awt.Component;

@ObfuscatedName("ag")
public class class50 {

    @ObfuscatedName("ag.l")
    public int[] field1075;

    @ObfuscatedName("ag.p")
    public class60 field1090;

    @ObfuscatedName("ag.r")
    public int field1082 = 32;

    @ObfuscatedName("ag.j")
    public long field1071 = class103.method1837();

    @ObfuscatedName("ag.c")
    public int field1079;

    @ObfuscatedName("ag.q")
    public int field1080;

    @ObfuscatedName("ag.n")
    public int field1081;

    @ObfuscatedName("ag.h")
    public long field1094 = 0L;

    @ObfuscatedName("ag.d")
    public int field1092 = 0;

    @ObfuscatedName("ag.b")
    public int field1084 = 0;

    @ObfuscatedName("ag.w")
    public int field1085 = 0;

    @ObfuscatedName("ag.z")
    public long field1077 = 0L;

    @ObfuscatedName("ag.x")
    public boolean field1087 = true;

    @ObfuscatedName("ag.ab")
    public int field1089 = 0;

    @ObfuscatedName("ag.ai")
    public class60[] field1083 = new class60[8];

    @ObfuscatedName("ag.aj")
    public class60[] field1091 = new class60[8];

    @ObfuscatedName("l.y(IZII)V")
    public static final void method77(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1078 = arg0;
        Statics.field1072 = arg1;
        Statics.field1073 = arg2;
    }

    @ObfuscatedName("am.f(Ldd;Ljava/awt/Component;IIB)Lag;")
    public static final class50 method679(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1078 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1075 = new int[256 * (Statics.field1072 ? 2 : 1)];
                var4.field1080 = arg3;
                var4.method908(arg1);
                var4.field1079 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1079 > 16384) {
                    var4.field1079 = 16384;
                }
                var4.method921(var4.field1079);
                if (Statics.field1073 > 0 && Statics.field2501 == null) {
                    Statics.field2501 = new class66();
                    Statics.field2501.field1253 = arg0;
                    arg0.method2418(Statics.field2501, Statics.field1073);
                }
                if (Statics.field2501 != null) {
                    if (Statics.field2501.field1245[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2501.field1245[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1075 = new int[256 * (Statics.field1072 ? 2 : 1)];
                    var6.field1080 = arg3;
                    var6.method908(arg1);
                    var6.field1079 = 16384;
                    var6.method921(var6.field1079);
                    if (Statics.field1073 > 0 && Statics.field2501 == null) {
                        Statics.field2501 = new class66();
                        Statics.field2501.field1253 = arg0;
                        arg0.method2418(Statics.field2501, Statics.field1073);
                    }
                    if (Statics.field2501 != null) {
                        if (Statics.field2501.field1245[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2501.field1245[arg2] = var6;
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

    @ObfuscatedName("ag.u(Lbm;I)V")
    public final synchronized void method971(class60 arg0) {
        this.field1090 = arg0;
    }

    @ObfuscatedName("ag.ab(I)V")
    public final synchronized void method972() {
        if (this.field1075 == null) {
            return;
        }
        long var1 = class103.method1837();
        try {
            if (this.field1094 != 0L) {
                if (var1 < this.field1094) {
                    return;
                }
                this.method921(this.field1079);
                this.field1094 = 0L;
                this.field1087 = true;
            }
            int var3 = this.method929();
            if (this.field1085 - var3 > this.field1092) {
                this.field1092 = this.field1085 - var3;
            }
            int var4 = this.field1081 + this.field1080;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1079) {
                this.field1079 += 1024;
                if (this.field1079 > 16384) {
                    this.field1079 = 16384;
                }
                this.method912();
                this.method921(this.field1079);
                var3 = 0;
                this.field1087 = true;
                if (var4 + 256 > this.field1079) {
                    var4 = this.field1079 - 256;
                    this.field1081 = var4 - this.field1080;
                }
            }
            while (var3 < var4) {
                this.method977(this.field1075, 256);
                this.method924();
                var3 += 256;
            }
            if (var1 > this.field1077) {
                if (this.field1087) {
                    this.field1087 = false;
                } else if (this.field1092 == 0 && this.field1084 == 0) {
                    this.method912();
                    this.field1094 = var1 + 2000L;
                    return;
                } else {
                    this.field1081 = Math.min(this.field1084, this.field1092);
                    this.field1084 = this.field1092;
                }
                this.field1092 = 0;
                this.field1077 = var1 + 2000L;
            }
            this.field1085 = var3;
        } catch (Exception var8) {
            this.method912();
            this.field1094 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1071 + 500000L) {
                var1 = this.field1071;
            }
            while (var1 > this.field1071 + 5000L) {
                this.method976(256);
                this.field1071 += (long) (256000 / Statics.field1078);
            }
        } catch (Exception var7) {
            this.field1071 = var1;
        }
    }

    @ObfuscatedName("ag.ai(I)V")
    public final void method973() {
        this.field1087 = true;
    }

    @ObfuscatedName("ag.aj(I)V")
    public final synchronized void method984() {
        this.field1087 = true;
        try {
            this.method911();
        } catch (Exception var2) {
            this.method912();
            this.field1094 = class103.method1837() + 2000L;
        }
    }

    @ObfuscatedName("ag.as(I)V")
    public final synchronized void method975() {
        if (Statics.field2501 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2501.field1245[var2] == this) {
                    Statics.field2501.field1245[var2] = null;
                }
                if (Statics.field2501.field1245[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2501.field1246 = true;
                while (Statics.field2501.field1250) {
                    class114.method26(50L);
                }
                Statics.field2501 = null;
            }
        }
        this.method912();
        this.field1075 = null;
    }

    @ObfuscatedName("ag.ax(II)V")
    public final void method976(int arg0) {
        this.field1089 -= arg0;
        if (this.field1089 < 0) {
            this.field1089 = 0;
        }
        if (this.field1090 != null) {
            this.field1090.method941(arg0);
        }
    }

    @ObfuscatedName("ag.ac([II)V")
    public final void method977(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1072) {
            var3 = arg1 << 1;
        }
        class108.method2283(arg0, 0, var3);
        this.field1089 -= arg1;
        if (this.field1090 != null && this.field1089 <= 0) {
            this.field1089 += Statics.field1078 >> 4;
            method521(this.field1090);
            this.method983(this.field1090, this.field1090.method1085());
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
                                class59 var12 = var11.field1162;
                                if (var12 == null || var12.field1159 <= var8) {
                                    var11.field1163 = true;
                                    int var13 = var11.method938();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1159 += var13;
                                    }
                                    if (var4 >= this.field1082) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method932();
                                    if (var14 != null) {
                                        int var15 = var11.field1160;
                                        while (var14 != null) {
                                            this.method983(var14, var15 * var14.method1085() >> 8);
                                            var14 = var11.method937();
                                        }
                                    }
                                    class60 var16 = var11.field1161;
                                    var11.field1161 = null;
                                    if (var10 == null) {
                                        this.field1083[var7] = var16;
                                    } else {
                                        var10.field1161 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1091[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1161;
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
                this.field1091[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1161;
                    var18.field1161 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1089 < 0) {
            this.field1089 = 0;
        }
        if (this.field1090 != null) {
            this.field1090.method939(arg0, 0, arg1);
        }
        this.field1071 = class103.method1837();
    }

    @ObfuscatedName("ab.az(Lbm;I)V")
    public static final void method521(class60 arg0) {
        arg0.field1163 = false;
        if (arg0.field1162 != null) {
            arg0.field1162.field1159 = 0;
        }
        for (class60 var1 = arg0.method932(); var1 != null; var1 = arg0.method937()) {
            method521(var1);
        }
    }

    @ObfuscatedName("ag.au(Lbm;II)V")
    public final void method983(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1091[var3];
        if (var4 == null) {
            this.field1083[var3] = arg0;
        } else {
            var4.field1161 = arg0;
        }
        this.field1091[var3] = arg0;
        arg0.field1160 = arg1;
    }

    @ObfuscatedName("ag.g(Ljava/awt/Component;)V")
    public void method908(Component arg0) throws Exception {
    }

    @ObfuscatedName("ag.s(I)V")
    public void method921(int arg0) throws Exception {
    }

    @ObfuscatedName("ag.v()I")
    public int method929() throws Exception {
        return this.field1079;
    }

    @ObfuscatedName("ag.o()V")
    public void method924() throws Exception {
    }

    @ObfuscatedName("ag.k()V")
    public void method912() {
    }

    @ObfuscatedName("ag.m()V")
    public void method911() throws Exception {
    }
}
