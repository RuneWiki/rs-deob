package deob;

import java.awt.Component;

@ObfuscatedName("ac")
public class class52 {

    @ObfuscatedName("ac.f")
    public int[] field1095;

    @ObfuscatedName("ac.b")
    public class48 field1105;

    @ObfuscatedName("ac.z")
    public int field1091 = 32;

    @ObfuscatedName("ac.l")
    public long field1089 = class121.method131();

    @ObfuscatedName("ac.e")
    public int field1093;

    @ObfuscatedName("ac.p")
    public int field1092;

    @ObfuscatedName("ac.o")
    public int field1086;

    @ObfuscatedName("ac.h")
    public long field1090 = 0L;

    @ObfuscatedName("ac.j")
    public int field1103 = 0;

    @ObfuscatedName("ac.x")
    public int field1098 = 0;

    @ObfuscatedName("ac.k")
    public int field1099 = 0;

    @ObfuscatedName("ac.a")
    public long field1100 = 0L;

    @ObfuscatedName("ac.y")
    public boolean field1101 = true;

    @ObfuscatedName("ac.au")
    public int field1102 = 0;

    @ObfuscatedName("ac.ae")
    public class48[] field1097 = new class48[8];

    @ObfuscatedName("ac.aa")
    public class48[] field1104 = new class48[8];

    @ObfuscatedName("bi.x(Lbc;Ljava/awt/Component;IIB)Lac;")
    public static final class52 method1382(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1096 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1095 = new int[256 * (Statics.field1085 ? 2 : 1)];
                var4.field1092 = arg3;
                var4.method921(arg1);
                var4.field1093 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1093 > 16384) {
                    var4.field1093 = 16384;
                }
                var4.method915(var4.field1093);
                if (Statics.field1195 > 0 && Statics.field1087 == null) {
                    Statics.field1087 = new class55();
                    Statics.field1087.field1169 = arg0;
                    arg0.method1498(Statics.field1087, Statics.field1195);
                }
                if (Statics.field1087 != null) {
                    if (Statics.field1087.field1175[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1087.field1175[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1095 = new int[256 * (Statics.field1085 ? 2 : 1)];
                    var6.field1092 = arg3;
                    var6.method921(arg1);
                    var6.field1093 = 16384;
                    var6.method915(var6.field1093);
                    if (Statics.field1195 > 0 && Statics.field1087 == null) {
                        Statics.field1087 = new class55();
                        Statics.field1087.field1169 = arg0;
                        arg0.method1498(Statics.field1087, Statics.field1195);
                    }
                    if (Statics.field1087 != null) {
                        if (Statics.field1087.field1175[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1087.field1175[arg2] = var6;
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

    @ObfuscatedName("ac.k(Lax;I)V")
    public final synchronized void method1159(class48 arg0) {
        this.field1105 = arg0;
    }

    @ObfuscatedName("ac.a(I)V")
    public final synchronized void method1160() {
        if (this.field1095 == null) {
            return;
        }
        long var1 = class121.method131();
        try {
            if (this.field1090 != 0L) {
                if (var1 < this.field1090) {
                    return;
                }
                this.method915(this.field1093);
                this.field1090 = 0L;
                this.field1101 = true;
            }
            int var3 = this.method916();
            if (this.field1099 - var3 > this.field1103) {
                this.field1103 = this.field1099 - var3;
            }
            int var4 = this.field1092 + this.field1086;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1093) {
                this.field1093 += 1024;
                if (this.field1093 > 16384) {
                    this.field1093 = 16384;
                }
                this.method918();
                this.method915(this.field1093);
                var3 = 0;
                this.field1101 = true;
                if (var4 + 256 > this.field1093) {
                    var4 = this.field1093 - 256;
                    this.field1086 = var4 - this.field1092;
                }
            }
            while (var3 < var4) {
                this.method1164(this.field1095, 256);
                this.method917();
                var3 += 256;
            }
            if (var1 > this.field1100) {
                if (this.field1101) {
                    this.field1101 = false;
                } else if (this.field1103 == 0 && this.field1098 == 0) {
                    this.method918();
                    this.field1090 = var1 + 2000L;
                    return;
                } else {
                    this.field1086 = Math.min(this.field1098, this.field1103);
                    this.field1098 = this.field1103;
                }
                this.field1103 = 0;
                this.field1100 = var1 + 2000L;
            }
            this.field1099 = var3;
        } catch (Exception var8) {
            this.method918();
            this.field1090 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1089 + 500000L) {
                var1 = this.field1089;
            }
            while (var1 > this.field1089 + 5000L) {
                this.method1192(256);
                this.field1089 += (long) (256000 / Statics.field1096);
            }
        } catch (Exception var7) {
            this.field1089 = var1;
        }
    }

    @ObfuscatedName("ac.y(I)V")
    public final void method1161() {
        this.field1101 = true;
    }

    @ObfuscatedName("ac.q(I)V")
    public final synchronized void method1168() {
        this.field1101 = true;
        try {
            this.method929();
        } catch (Exception var2) {
            this.method918();
            this.field1090 = class121.method131() + 2000L;
        }
    }

    @ObfuscatedName("ac.c(B)V")
    public final synchronized void method1163() {
        if (Statics.field1087 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1087.field1175[var2] == this) {
                    Statics.field1087.field1175[var2] = null;
                }
                if (Statics.field1087.field1175[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1087.field1168 = true;
                while (Statics.field1087.field1166) {
                    class126.method209(50L);
                }
                Statics.field1087 = null;
            }
        }
        this.method918();
        this.field1095 = null;
    }

    @ObfuscatedName("ac.u(II)V")
    public final void method1192(int arg0) {
        this.field1102 -= arg0;
        if (this.field1102 < 0) {
            this.field1102 = 0;
        }
        if (this.field1105 != null) {
            this.field1105.method958(arg0);
        }
    }

    @ObfuscatedName("ac.ah([II)V")
    public final void method1164(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1085) {
            var3 = arg1 << 1;
        }
        class128.method2621(arg0, 0, var3);
        this.field1102 -= arg1;
        if (this.field1105 != null && this.field1102 <= 0) {
            this.field1102 += Statics.field1096 >> 4;
            method2673(this.field1105);
            this.method1165(this.field1105, this.field1105.method934());
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
                        class48 var11 = this.field1097[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1064;
                                if (var12 == null || var12.field1060 <= var8) {
                                    var11.field1061 = true;
                                    int var13 = var11.method946();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1060 += var13;
                                    }
                                    if (var4 >= this.field1091) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method935();
                                    if (var14 != null) {
                                        int var15 = var11.field1062;
                                        while (var14 != null) {
                                            this.method1165(var14, var15 * var14.method934() >> 8);
                                            var14 = var11.method1044();
                                        }
                                    }
                                    class48 var16 = var11.field1063;
                                    var11.field1063 = null;
                                    if (var10 == null) {
                                        this.field1097[var7] = var16;
                                    } else {
                                        var10.field1063 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1104[var7] = var10;
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
                class48 var18 = this.field1097[var17];
                class48[] var19 = this.field1097;
                this.field1104[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1063;
                    var18.field1063 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1102 < 0) {
            this.field1102 = 0;
        }
        if (this.field1105 != null) {
            this.field1105.method957(arg0, 0, arg1);
        }
        this.field1089 = class121.method131();
    }

    @ObfuscatedName("et.az(Lax;S)V")
    public static final void method2673(class48 arg0) {
        arg0.field1061 = false;
        if (arg0.field1064 != null) {
            arg0.field1064.field1060 = 0;
        }
        for (class48 var1 = arg0.method935(); var1 != null; var1 = arg0.method1044()) {
            method2673(var1);
        }
    }

    @ObfuscatedName("ac.au(Lax;II)V")
    public final void method1165(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1104[var3];
        if (var4 == null) {
            this.field1097[var3] = arg0;
        } else {
            var4.field1063 = arg0;
        }
        this.field1104[var3] = arg0;
        arg0.field1062 = arg1;
    }

    @ObfuscatedName("ac.g(Ljava/awt/Component;)V")
    public void method921(Component arg0) throws Exception {
    }

    @ObfuscatedName("ac.m(I)V")
    public void method915(int arg0) throws Exception {
    }

    @ObfuscatedName("ac.v()I")
    public int method916() throws Exception {
        return this.field1093;
    }

    @ObfuscatedName("ac.r()V")
    public void method917() throws Exception {
    }

    @ObfuscatedName("ac.n()V")
    public void method918() {
    }

    @ObfuscatedName("ac.i()V")
    public void method929() throws Exception {
    }
}
