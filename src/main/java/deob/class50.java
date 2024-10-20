package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class50 {

    @ObfuscatedName("ax.y")
    public int[] field1068;

    @ObfuscatedName("ax.w")
    public class60 field1089;

    @ObfuscatedName("ax.x")
    public int field1073 = 32;

    @ObfuscatedName("ax.k")
    public long field1074 = class103.method494();

    @ObfuscatedName("ax.o")
    public int field1088;

    @ObfuscatedName("ax.a")
    public int field1076;

    @ObfuscatedName("ax.f")
    public int field1077;

    @ObfuscatedName("ax.r")
    public long field1072 = 0L;

    @ObfuscatedName("ax.e")
    public int field1079 = 0;

    @ObfuscatedName("ax.t")
    public int field1080 = 0;

    @ObfuscatedName("ax.c")
    public int field1083 = 0;

    @ObfuscatedName("ax.l")
    public long field1082 = 0L;

    @ObfuscatedName("ax.n")
    public boolean field1078 = true;

    @ObfuscatedName("ax.ah")
    public int field1085 = 0;

    @ObfuscatedName("ax.aj")
    public class60[] field1086 = new class60[8];

    @ObfuscatedName("ax.aq")
    public class60[] field1081 = new class60[8];

    @ObfuscatedName("k.p(IZII)V")
    public static final void method144(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1071 = arg0;
        Statics.field1069 = arg1;
        Statics.field1253 = arg2;
    }

    @ObfuscatedName("at.z(Ldv;Ljava/awt/Component;IIB)Lax;")
    public static final class50 method594(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1071 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1068 = new int[256 * (Statics.field1069 ? 2 : 1)];
                var4.field1076 = arg3;
                var4.method923(arg1);
                var4.field1088 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1088 > 16384) {
                    var4.field1088 = 16384;
                }
                var4.method914(var4.field1088);
                if (Statics.field1253 > 0 && Statics.field507 == null) {
                    Statics.field507 = new class66();
                    Statics.field507.field1257 = arg0;
                    arg0.method2443(Statics.field507, Statics.field1253);
                }
                if (Statics.field507 != null) {
                    if (Statics.field507.field1245[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field507.field1245[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1068 = new int[(Statics.field1069 ? 2 : 1) * 256];
                    var6.field1076 = arg3;
                    var6.method923(arg1);
                    var6.field1088 = 16384;
                    var6.method914(var6.field1088);
                    if (Statics.field1253 > 0 && Statics.field507 == null) {
                        Statics.field507 = new class66();
                        Statics.field507.field1257 = arg0;
                        arg0.method2443(Statics.field507, Statics.field1253);
                    }
                    if (Statics.field507 != null) {
                        if (Statics.field507.field1245[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field507.field1245[arg2] = var6;
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

    @ObfuscatedName("ax.q(Lbw;B)V")
    public final synchronized void method976(class60 arg0) {
        this.field1089 = arg0;
    }

    @ObfuscatedName("ax.i(B)V")
    public final synchronized void method977() {
        if (this.field1068 == null) {
            return;
        }
        long var1 = class103.method494();
        try {
            if (this.field1072 != 0L) {
                if (var1 < this.field1072) {
                    return;
                }
                this.method914(this.field1088);
                this.field1072 = 0L;
                this.field1078 = true;
            }
            int var3 = this.method912();
            if (this.field1083 - var3 > this.field1079) {
                this.field1079 = this.field1083 - var3;
            }
            int var4 = this.field1077 + this.field1076;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1088) {
                this.field1088 += 1024;
                if (this.field1088 > 16384) {
                    this.field1088 = 16384;
                }
                this.method910();
                this.method914(this.field1088);
                var3 = 0;
                this.field1078 = true;
                if (var4 + 256 > this.field1088) {
                    var4 = this.field1088 - 256;
                    this.field1077 = var4 - this.field1076;
                }
            }
            while (var3 < var4) {
                this.method981(this.field1068, 256);
                this.method913();
                var3 += 256;
            }
            if (var1 > this.field1082) {
                if (this.field1078) {
                    this.field1078 = false;
                } else if (this.field1079 == 0 && this.field1080 == 0) {
                    this.method910();
                    this.field1072 = var1 + 2000L;
                    return;
                } else {
                    this.field1077 = Math.min(this.field1080, this.field1079);
                    this.field1080 = this.field1079;
                }
                this.field1079 = 0;
                this.field1082 = var1 + 2000L;
            }
            this.field1083 = var3;
        } catch (Exception var8) {
            this.method910();
            this.field1072 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1074 + 500000L) {
                var1 = this.field1074;
            }
            while (var1 > this.field1074 + 5000L) {
                this.method980(256);
                this.field1074 += (long) (256000 / Statics.field1071);
            }
        } catch (Exception var7) {
            this.field1074 = var1;
        }
    }

    @ObfuscatedName("ax.ah(B)V")
    public final void method978() {
        this.field1078 = true;
    }

    @ObfuscatedName("ax.aj(B)V")
    public final synchronized void method987() {
        this.field1078 = true;
        try {
            this.method915();
        } catch (Exception var2) {
            this.method910();
            this.field1072 = class103.method494() + 2000L;
        }
    }

    @ObfuscatedName("ax.aq(I)V")
    public final synchronized void method1006() {
        if (Statics.field507 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field507.field1245[var2] == this) {
                    Statics.field507.field1245[var2] = null;
                }
                if (Statics.field507.field1245[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field507.field1246 = true;
                while (Statics.field507.field1247) {
                    class114.method2036(50L);
                }
                Statics.field507 = null;
            }
        }
        this.method910();
        this.field1068 = null;
    }

    @ObfuscatedName("ax.aa(II)V")
    public final void method980(int arg0) {
        this.field1085 -= arg0;
        if (this.field1085 < 0) {
            this.field1085 = 0;
        }
        if (this.field1089 != null) {
            this.field1089.method950(arg0);
        }
    }

    @ObfuscatedName("ax.ar([II)V")
    public final void method981(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1069) {
            var3 = arg1 << 1;
        }
        class108.method2316(arg0, 0, var3);
        this.field1085 -= arg1;
        if (this.field1089 != null && this.field1085 <= 0) {
            this.field1085 += Statics.field1071 >> 4;
            method1332(this.field1089);
            this.method982(this.field1089, this.field1089.method1098());
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
                                class59 var12 = var11.field1160;
                                if (var12 == null || var12.field1159 <= var8) {
                                    var11.field1162 = true;
                                    int var13 = var11.method940();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1159 += var13;
                                    }
                                    if (var4 >= this.field1073) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method938();
                                    if (var14 != null) {
                                        int var15 = var11.field1161;
                                        while (var14 != null) {
                                            this.method982(var14, var15 * var14.method1098() >> 8);
                                            var14 = var11.method939();
                                        }
                                    }
                                    class60 var16 = var11.field1163;
                                    var11.field1163 = null;
                                    if (var10 == null) {
                                        this.field1086[var7] = var16;
                                    } else {
                                        var10.field1163 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1081[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1163;
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
                this.field1081[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1163;
                    var18.field1163 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1085 < 0) {
            this.field1085 = 0;
        }
        if (this.field1089 != null) {
            this.field1089.method936(arg0, 0, arg1);
        }
        this.field1074 = class103.method494();
    }

    @ObfuscatedName("bp.at(Lbw;B)V")
    public static final void method1332(class60 arg0) {
        arg0.field1162 = false;
        if (arg0.field1160 != null) {
            arg0.field1160.field1159 = 0;
        }
        for (class60 var1 = arg0.method938(); var1 != null; var1 = arg0.method939()) {
            method1332(var1);
        }
    }

    @ObfuscatedName("ax.av(Lbw;II)V")
    public final void method982(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1081[var3];
        if (var4 == null) {
            this.field1086[var3] = arg0;
        } else {
            var4.field1163 = arg0;
        }
        this.field1081[var3] = arg0;
        arg0.field1161 = arg1;
    }

    @ObfuscatedName("ax.g(Ljava/awt/Component;)V")
    public void method923(Component arg0) throws Exception {
    }

    @ObfuscatedName("ax.s(I)V")
    public void method914(int arg0) throws Exception {
    }

    @ObfuscatedName("ax.h()I")
    public int method912() throws Exception {
        return this.field1088;
    }

    @ObfuscatedName("ax.m()V")
    public void method913() throws Exception {
    }

    @ObfuscatedName("ax.u()V")
    public void method910() {
    }

    @ObfuscatedName("ax.j()V")
    public void method915() throws Exception {
    }
}
