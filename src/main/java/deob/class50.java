package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class50 {

    @ObfuscatedName("ax.p")
    public int[] field1074;

    @ObfuscatedName("ax.l")
    public class60 field1079;

    @ObfuscatedName("ax.k")
    public int field1088 = 32;

    @ObfuscatedName("ax.q")
    public long field1078 = class103.method29();

    @ObfuscatedName("ax.e")
    public int field1082;

    @ObfuscatedName("ax.t")
    public int field1083;

    @ObfuscatedName("ax.g")
    public int field1084;

    @ObfuscatedName("ax.c")
    public long field1092 = 0L;

    @ObfuscatedName("ax.m")
    public int field1086 = 0;

    @ObfuscatedName("ax.i")
    public int field1093 = 0;

    @ObfuscatedName("ax.h")
    public int field1094 = 0;

    @ObfuscatedName("ax.a")
    public long field1085 = 0L;

    @ObfuscatedName("ax.w")
    public boolean field1090 = true;

    @ObfuscatedName("ax.al")
    public int field1091 = 0;

    @ObfuscatedName("ax.ab")
    public class60[] field1089 = new class60[8];

    @ObfuscatedName("ax.au")
    public class60[] field1077 = new class60[8];

    @ObfuscatedName("do.h(Ldi;Ljava/awt/Component;IIB)Lax;")
    public static final class50 method2583(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1087 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1074 = new int[256 * (Statics.field1075 ? 2 : 1)];
                var4.field1083 = arg3;
                var4.method917(arg1);
                var4.field1082 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1082 > 16384) {
                    var4.field1082 = 16384;
                }
                var4.method919(var4.field1082);
                if (Statics.field607 > 0 && Statics.field1076 == null) {
                    Statics.field1076 = new class66();
                    Statics.field1076.field1249 = arg0;
                    arg0.method2487(Statics.field1076, Statics.field607);
                }
                if (Statics.field1076 != null) {
                    if (Statics.field1076.field1250[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1076.field1250[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1074 = new int[(Statics.field1075 ? 2 : 1) * 256];
                    var6.field1083 = arg3;
                    var6.method917(arg1);
                    var6.field1082 = 16384;
                    var6.method919(var6.field1082);
                    if (Statics.field607 > 0 && Statics.field1076 == null) {
                        Statics.field1076 = new class66();
                        Statics.field1076.field1249 = arg0;
                        arg0.method2487(Statics.field1076, Statics.field607);
                    }
                    if (Statics.field1076 != null) {
                        if (Statics.field1076.field1250[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1076.field1250[arg2] = var6;
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

    @ObfuscatedName("ax.a(Lbl;I)V")
    public final synchronized void method981(class60 arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("ax.w(I)V")
    public final synchronized void method985() {
        if (this.field1074 == null) {
            return;
        }
        long var1 = class103.method29();
        try {
            if (this.field1092 != 0L) {
                if (var1 < this.field1092) {
                    return;
                }
                this.method919(this.field1082);
                this.field1092 = 0L;
                this.field1090 = true;
            }
            int var3 = this.method920();
            if (this.field1094 - var3 > this.field1086) {
                this.field1086 = this.field1094 - var3;
            }
            int var4 = this.field1084 + this.field1083;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1082) {
                this.field1082 += 1024;
                if (this.field1082 > 16384) {
                    this.field1082 = 16384;
                }
                this.method929();
                this.method919(this.field1082);
                var3 = 0;
                this.field1090 = true;
                if (var4 + 256 > this.field1082) {
                    var4 = this.field1082 - 256;
                    this.field1084 = var4 - this.field1083;
                }
            }
            while (var3 < var4) {
                this.method980(this.field1074, 256);
                this.method930();
                var3 += 256;
            }
            if (var1 > this.field1085) {
                if (this.field1090) {
                    this.field1090 = false;
                } else if (this.field1086 == 0 && this.field1093 == 0) {
                    this.method929();
                    this.field1092 = var1 + 2000L;
                    return;
                } else {
                    this.field1084 = Math.min(this.field1093, this.field1086);
                    this.field1093 = this.field1086;
                }
                this.field1086 = 0;
                this.field1085 = var1 + 2000L;
            }
            this.field1094 = var3;
        } catch (Exception var8) {
            this.method929();
            this.field1092 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1078 + 500000L) {
                var1 = this.field1078;
            }
            while (var1 > this.field1078 + 5000L) {
                this.method986(256);
                this.field1078 += (long) (256000 / Statics.field1087);
            }
        } catch (Exception var7) {
            this.field1078 = var1;
        }
    }

    @ObfuscatedName("ax.z(I)V")
    public final void method983() {
        this.field1090 = true;
    }

    @ObfuscatedName("ax.v(I)V")
    public final synchronized void method984() {
        this.field1090 = true;
        try {
            this.method923();
        } catch (Exception var2) {
            this.method929();
            this.field1092 = class103.method29() + 2000L;
        }
    }

    @ObfuscatedName("ax.s(I)V")
    public final synchronized void method989() {
        if (Statics.field1076 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1076.field1250[var2] == this) {
                    Statics.field1076.field1250[var2] = null;
                }
                if (Statics.field1076.field1250[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1076.field1244 = true;
                while (Statics.field1076.field1245) {
                    class114.method2914(50L);
                }
                Statics.field1076 = null;
            }
        }
        this.method929();
        this.field1074 = null;
    }

    @ObfuscatedName("ax.r(II)V")
    public final void method986(int arg0) {
        this.field1091 -= arg0;
        if (this.field1091 < 0) {
            this.field1091 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method969(arg0);
        }
    }

    @ObfuscatedName("ax.d([II)V")
    public final void method980(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1075) {
            var3 = arg1 << 1;
        }
        class108.method2371(arg0, 0, var3);
        this.field1091 -= arg1;
        if (this.field1079 != null && this.field1091 <= 0) {
            this.field1091 += Statics.field1087 >> 4;
            method2673(this.field1079);
            this.method1003(this.field1079, this.field1079.method1089());
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
                        class60 var11 = this.field1089[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1159;
                                if (var12 == null || var12.field1157 <= var8) {
                                    var11.field1161 = true;
                                    int var13 = var11.method943();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1157 += var13;
                                    }
                                    if (var4 >= this.field1088) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method952();
                                    if (var14 != null) {
                                        int var15 = var11.field1160;
                                        while (var14 != null) {
                                            this.method1003(var14, var15 * var14.method1089() >> 8);
                                            var14 = var11.method942();
                                        }
                                    }
                                    class60 var16 = var11.field1158;
                                    var11.field1158 = null;
                                    if (var10 == null) {
                                        this.field1089[var7] = var16;
                                    } else {
                                        var10.field1158 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1077[var7] = var10;
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
                class60 var18 = this.field1089[var17];
                class60[] var19 = this.field1089;
                this.field1077[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1158;
                    var18.field1158 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1091 < 0) {
            this.field1091 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method944(arg0, 0, arg1);
        }
        this.field1078 = class103.method29();
    }

    @ObfuscatedName("ea.al(Lbl;I)V")
    public static final void method2673(class60 arg0) {
        arg0.field1161 = false;
        if (arg0.field1159 != null) {
            arg0.field1159.field1157 = 0;
        }
        for (class60 var1 = arg0.method952(); var1 != null; var1 = arg0.method942()) {
            method2673(var1);
        }
    }

    @ObfuscatedName("ax.ab(Lbl;II)V")
    public final void method1003(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1077[var3];
        if (var4 == null) {
            this.field1089[var3] = arg0;
        } else {
            var4.field1158 = arg0;
        }
        this.field1077[var3] = arg0;
        arg0.field1160 = arg1;
    }

    @ObfuscatedName("ax.b(Ljava/awt/Component;)V")
    public void method917(Component arg0) throws Exception {
    }

    @ObfuscatedName("ax.u(I)V")
    public void method919(int arg0) throws Exception {
    }

    @ObfuscatedName("ax.x()I")
    public int method920() throws Exception {
        return this.field1082;
    }

    @ObfuscatedName("ax.j()V")
    public void method930() throws Exception {
    }

    @ObfuscatedName("ax.o()V")
    public void method929() {
    }

    @ObfuscatedName("ax.n()V")
    public void method923() throws Exception {
    }
}
