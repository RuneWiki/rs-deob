package deob;

import java.awt.Component;

@ObfuscatedName("ag")
public class class50 {

    @ObfuscatedName("ag.h")
    public int[] field1076;

    @ObfuscatedName("ag.n")
    public class60 field1091;

    @ObfuscatedName("ag.w")
    public int field1080 = 32;

    @ObfuscatedName("ag.m")
    public long field1075 = class103.method1861();

    @ObfuscatedName("ag.x")
    public int field1087;

    @ObfuscatedName("ag.b")
    public int field1081;

    @ObfuscatedName("ag.u")
    public int field1082;

    @ObfuscatedName("ag.r")
    public long field1083 = 0L;

    @ObfuscatedName("ag.z")
    public int field1084 = 0;

    @ObfuscatedName("ag.v")
    public int field1085 = 0;

    @ObfuscatedName("ag.k")
    public int field1086 = 0;

    @ObfuscatedName("ag.a")
    public long field1092 = 0L;

    @ObfuscatedName("ag.d")
    public boolean field1072 = true;

    @ObfuscatedName("ag.al")
    public int field1089 = 0;

    @ObfuscatedName("ag.ao")
    public class60[] field1090 = new class60[8];

    @ObfuscatedName("ag.ap")
    public class60[] field1077 = new class60[8];

    @ObfuscatedName("ev.j(Ldl;Ljava/awt/Component;IIB)Lag;")
    public static final class50 method2651(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1088 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1076 = new int[256 * (Statics.field1073 ? 2 : 1)];
                var4.field1081 = arg3;
                var4.method913(arg1);
                var4.field1087 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1087 > 16384) {
                    var4.field1087 = 16384;
                }
                var4.method915(var4.field1087);
                if (Statics.field1074 > 0 && Statics.field1809 == null) {
                    Statics.field1809 = new class66();
                    Statics.field1809.field1251 = arg0;
                    arg0.method2458(Statics.field1809, Statics.field1074);
                }
                if (Statics.field1809 != null) {
                    if (Statics.field1809.field1252[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1809.field1252[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1076 = new int[256 * (Statics.field1073 ? 2 : 1)];
                    var6.field1081 = arg3;
                    var6.method913(arg1);
                    var6.field1087 = 16384;
                    var6.method915(var6.field1087);
                    if (Statics.field1074 > 0 && Statics.field1809 == null) {
                        Statics.field1809 = new class66();
                        Statics.field1809.field1251 = arg0;
                        arg0.method2458(Statics.field1809, Statics.field1074);
                    }
                    if (Statics.field1809 != null) {
                        if (Statics.field1809.field1252[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1809.field1252[arg2] = var6;
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

    @ObfuscatedName("ag.s(Lbq;I)V")
    public final synchronized void method977(class60 arg0) {
        this.field1091 = arg0;
    }

    @ObfuscatedName("ag.f(I)V")
    public final synchronized void method972() {
        if (this.field1076 == null) {
            return;
        }
        long var1 = class103.method1861();
        try {
            if (this.field1083 != 0L) {
                if (var1 < this.field1083) {
                    return;
                }
                this.method915(this.field1087);
                this.field1083 = 0L;
                this.field1072 = true;
            }
            int var3 = this.method920();
            if (this.field1086 - var3 > this.field1084) {
                this.field1084 = this.field1086 - var3;
            }
            int var4 = this.field1082 + this.field1081;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1087) {
                this.field1087 += 1024;
                if (this.field1087 > 16384) {
                    this.field1087 = 16384;
                }
                this.method917();
                this.method915(this.field1087);
                var3 = 0;
                this.field1072 = true;
                if (var4 + 256 > this.field1087) {
                    var4 = this.field1087 - 256;
                    this.field1082 = var4 - this.field1081;
                }
            }
            while (var3 < var4) {
                this.method975(this.field1076, 256);
                this.method916();
                var3 += 256;
            }
            if (var1 > this.field1092) {
                if (this.field1072) {
                    this.field1072 = false;
                } else if (this.field1084 == 0 && this.field1085 == 0) {
                    this.method917();
                    this.field1083 = var1 + 2000L;
                    return;
                } else {
                    this.field1082 = Math.min(this.field1085, this.field1084);
                    this.field1085 = this.field1084;
                }
                this.field1084 = 0;
                this.field1092 = var1 + 2000L;
            }
            this.field1086 = var3;
        } catch (Exception var8) {
            this.method917();
            this.field1083 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1075 + 500000L) {
                var1 = this.field1075;
            }
            while (var1 > this.field1075 + 5000L) {
                this.method978(256);
                this.field1075 += (long) (256000 / Statics.field1088);
            }
        } catch (Exception var7) {
            this.field1075 = var1;
        }
    }

    @ObfuscatedName("ag.e(I)V")
    public final void method998() {
        this.field1072 = true;
    }

    @ObfuscatedName("ag.q(B)V")
    public final synchronized void method974() {
        this.field1072 = true;
        try {
            this.method918();
        } catch (Exception var2) {
            this.method917();
            this.field1083 = class103.method1861() + 2000L;
        }
    }

    @ObfuscatedName("ag.al(B)V")
    public final synchronized void method997() {
        if (Statics.field1809 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1809.field1252[var2] == this) {
                    Statics.field1809.field1252[var2] = null;
                }
                if (Statics.field1809.field1252[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1809.field1258 = true;
                while (Statics.field1809.field1250) {
                    class114.method1854(50L);
                }
                Statics.field1809 = null;
            }
        }
        this.method917();
        this.field1076 = null;
    }

    @ObfuscatedName("ag.ao(II)V")
    public final void method978(int arg0) {
        this.field1089 -= arg0;
        if (this.field1089 < 0) {
            this.field1089 = 0;
        }
        if (this.field1091 != null) {
            this.field1091.method945(arg0);
        }
    }

    @ObfuscatedName("ag.ap([II)V")
    public final void method975(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1073) {
            var3 = arg1 << 1;
        }
        class108.method2312(arg0, 0, var3);
        this.field1089 -= arg1;
        if (this.field1091 != null && this.field1089 <= 0) {
            this.field1089 += Statics.field1088 >> 4;
            method86(this.field1091);
            this.method981(this.field1091, this.field1091.method1075());
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
                        class60 var11 = this.field1090[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1169;
                                if (var12 == null || var12.field1165 <= var8) {
                                    var11.field1167 = true;
                                    int var13 = var11.method942();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1165 += var13;
                                    }
                                    if (var4 >= this.field1080) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method940();
                                    if (var14 != null) {
                                        int var15 = var11.field1166;
                                        while (var14 != null) {
                                            this.method981(var14, var15 * var14.method1075() >> 8);
                                            var14 = var11.method944();
                                        }
                                    }
                                    class60 var16 = var11.field1168;
                                    var11.field1168 = null;
                                    if (var10 == null) {
                                        this.field1090[var7] = var16;
                                    } else {
                                        var10.field1168 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1077[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1168;
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
                class60 var18 = this.field1090[var17];
                class60[] var19 = this.field1090;
                this.field1077[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1168;
                    var18.field1168 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1089 < 0) {
            this.field1089 = 0;
        }
        if (this.field1091 != null) {
            this.field1091.method943(arg0, 0, arg1);
        }
        this.field1075 = class103.method1861();
    }

    @ObfuscatedName("l.aa(Lbq;I)V")
    public static final void method86(class60 arg0) {
        arg0.field1167 = false;
        if (arg0.field1169 != null) {
            arg0.field1169.field1165 = 0;
        }
        for (class60 var1 = arg0.method940(); var1 != null; var1 = arg0.method944()) {
            method86(var1);
        }
    }

    @ObfuscatedName("ag.ak(Lbq;II)V")
    public final void method981(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1077[var3];
        if (var4 == null) {
            this.field1090[var3] = arg0;
        } else {
            var4.field1168 = arg0;
        }
        this.field1077[var3] = arg0;
        arg0.field1166 = arg1;
    }

    @ObfuscatedName("ag.t(Ljava/awt/Component;)V")
    public void method913(Component arg0) throws Exception {
    }

    @ObfuscatedName("ag.o(I)V")
    public void method915(int arg0) throws Exception {
    }

    @ObfuscatedName("ag.i()I")
    public int method920() throws Exception {
        return this.field1087;
    }

    @ObfuscatedName("ag.p()V")
    public void method916() throws Exception {
    }

    @ObfuscatedName("ag.c()V")
    public void method917() {
    }

    @ObfuscatedName("ag.y()V")
    public void method918() throws Exception {
    }
}
