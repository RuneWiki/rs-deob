package deob;

import java.awt.Component;

@ObfuscatedName("ay")
public class class50 {

    @ObfuscatedName("ay.o")
    public int[] field1079;

    @ObfuscatedName("ay.b")
    public class60 field1074;

    @ObfuscatedName("ay.x")
    public int field1081 = 32;

    @ObfuscatedName("ay.n")
    public long field1082 = class103.method470();

    @ObfuscatedName("ay.d")
    public int field1083;

    @ObfuscatedName("ay.s")
    public int field1076;

    @ObfuscatedName("ay.v")
    public int field1085;

    @ObfuscatedName("ay.t")
    public long field1086 = 0L;

    @ObfuscatedName("ay.u")
    public int field1084 = 0;

    @ObfuscatedName("ay.l")
    public int field1088 = 0;

    @ObfuscatedName("ay.i")
    public int field1080 = 0;

    @ObfuscatedName("ay.h")
    public long field1090 = 0L;

    @ObfuscatedName("ay.e")
    public boolean field1091 = true;

    @ObfuscatedName("ay.aa")
    public int field1089 = 0;

    @ObfuscatedName("ay.ak")
    public class60[] field1093 = new class60[8];

    @ObfuscatedName("ay.al")
    public class60[] field1094 = new class60[8];

    @ObfuscatedName("ee.l(Ldh;Ljava/awt/Component;III)Lay;")
    public static final class50 method2761(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1096 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1079 = new int[(Statics.field1092 ? 2 : 1) * 256];
                var4.field1076 = arg3;
                var4.method950(arg1);
                var4.field1083 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1083 > 16384) {
                    var4.field1083 = 16384;
                }
                var4.method951(var4.field1083);
                if (Statics.field1075 > 0 && Statics.field1077 == null) {
                    Statics.field1077 = new class66();
                    Statics.field1077.field1252 = arg0;
                    arg0.method2463(Statics.field1077, Statics.field1075);
                }
                if (Statics.field1077 != null) {
                    if (Statics.field1077.field1247[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1077.field1247[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1079 = new int[(Statics.field1092 ? 2 : 1) * 256];
                    var6.field1076 = arg3;
                    var6.method950(arg1);
                    var6.field1083 = 16384;
                    var6.method951(var6.field1083);
                    if (Statics.field1075 > 0 && Statics.field1077 == null) {
                        Statics.field1077 = new class66();
                        Statics.field1077.field1252 = arg0;
                        arg0.method2463(Statics.field1077, Statics.field1075);
                    }
                    if (Statics.field1077 != null) {
                        if (Statics.field1077.field1247[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1077.field1247[arg2] = var6;
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

    @ObfuscatedName("ay.i(Lbz;I)V")
    public final synchronized void method1005(class60 arg0) {
        this.field1074 = arg0;
    }

    @ObfuscatedName("ay.h(B)V")
    public final synchronized void method1006() {
        if (this.field1079 == null) {
            return;
        }
        long var1 = class103.method470();
        try {
            if (this.field1086 != 0L) {
                if (var1 < this.field1086) {
                    return;
                }
                this.method951(this.field1083);
                this.field1086 = 0L;
                this.field1091 = true;
            }
            int var3 = this.method952();
            if (this.field1080 - var3 > this.field1084) {
                this.field1084 = this.field1080 - var3;
            }
            int var4 = this.field1085 + this.field1076;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1083) {
                this.field1083 += 1024;
                if (this.field1083 > 16384) {
                    this.field1083 = 16384;
                }
                this.method954();
                this.method951(this.field1083);
                var3 = 0;
                this.field1091 = true;
                if (var4 + 256 > this.field1083) {
                    var4 = this.field1083 - 256;
                    this.field1085 = var4 - this.field1076;
                }
            }
            while (var3 < var4) {
                this.method1015(this.field1079, 256);
                this.method953();
                var3 += 256;
            }
            if (var1 > this.field1090) {
                if (this.field1091) {
                    this.field1091 = false;
                } else if (this.field1084 == 0 && this.field1088 == 0) {
                    this.method954();
                    this.field1086 = var1 + 2000L;
                    return;
                } else {
                    this.field1085 = Math.min(this.field1088, this.field1084);
                    this.field1088 = this.field1084;
                }
                this.field1084 = 0;
                this.field1090 = var1 + 2000L;
            }
            this.field1080 = var3;
        } catch (Exception var8) {
            this.method954();
            this.field1086 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1082 + 500000L) {
                var1 = this.field1082;
            }
            while (var1 > this.field1082 + 5000L) {
                this.method1009(256);
                this.field1082 += (long) (256000 / Statics.field1096);
            }
        } catch (Exception var7) {
            this.field1082 = var1;
        }
    }

    @ObfuscatedName("ay.e(S)V")
    public final void method1007() {
        this.field1091 = true;
    }

    @ObfuscatedName("ay.a(B)V")
    public final synchronized void method1013() {
        this.field1091 = true;
        try {
            this.method961();
        } catch (Exception var2) {
            this.method954();
            this.field1086 = class103.method470() + 2000L;
        }
    }

    @ObfuscatedName("ay.c(I)V")
    public final synchronized void method1008() {
        if (Statics.field1077 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1077.field1247[var2] == this) {
                    Statics.field1077.field1247[var2] = null;
                }
                if (Statics.field1077.field1247[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1077.field1248 = true;
                while (Statics.field1077.field1246) {
                    class114.method2808(50L);
                }
                Statics.field1077 = null;
            }
        }
        this.method954();
        this.field1079 = null;
    }

    @ObfuscatedName("ay.f(II)V")
    public final void method1009(int arg0) {
        this.field1089 -= arg0;
        if (this.field1089 < 0) {
            this.field1089 = 0;
        }
        if (this.field1074 != null) {
            this.field1074.method976(arg0);
        }
    }

    @ObfuscatedName("ay.q([II)V")
    public final void method1015(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1092) {
            var3 = arg1 << 1;
        }
        class108.method2313(arg0, 0, var3);
        this.field1089 -= arg1;
        if (this.field1074 != null && this.field1089 <= 0) {
            this.field1089 += Statics.field1096 >> 4;
            Statics.method33(this.field1074);
            this.method1027(this.field1074, this.field1074.method1109());
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
                        class60 var11 = this.field1093[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1165;
                                if (var12 == null || var12.field1161 <= var8) {
                                    var11.field1162 = true;
                                    int var13 = var11.method974();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1161 += var13;
                                    }
                                    if (var4 >= this.field1081) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method991();
                                    if (var14 != null) {
                                        int var15 = var11.field1163;
                                        while (var14 != null) {
                                            this.method1027(var14, var15 * var14.method1109() >> 8);
                                            var14 = var11.method969();
                                        }
                                    }
                                    class60 var16 = var11.field1164;
                                    var11.field1164 = null;
                                    if (var10 == null) {
                                        this.field1093[var7] = var16;
                                    } else {
                                        var10.field1164 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1094[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1164;
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
                class60 var18 = this.field1093[var17];
                class60[] var19 = this.field1093;
                this.field1094[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1164;
                    var18.field1164 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1089 < 0) {
            this.field1089 = 0;
        }
        if (this.field1074 != null) {
            this.field1074.method1004(arg0, 0, arg1);
        }
        this.field1082 = class103.method470();
    }

    @ObfuscatedName("ay.aa(Lbz;II)V")
    public final void method1027(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1094[var3];
        if (var4 == null) {
            this.field1093[var3] = arg0;
        } else {
            var4.field1164 = arg0;
        }
        this.field1094[var3] = arg0;
        arg0.field1163 = arg1;
    }

    @ObfuscatedName("ay.k(Ljava/awt/Component;)V")
    public void method950(Component arg0) throws Exception {
    }

    @ObfuscatedName("ay.r(I)V")
    public void method951(int arg0) throws Exception {
    }

    @ObfuscatedName("ay.y()I")
    public int method952() throws Exception {
        return this.field1083;
    }

    @ObfuscatedName("ay.w()V")
    public void method953() throws Exception {
    }

    @ObfuscatedName("ay.m()V")
    public void method954() {
    }

    @ObfuscatedName("ay.j()V")
    public void method961() throws Exception {
    }
}
