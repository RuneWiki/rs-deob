package deob;

import java.awt.Component;

@ObfuscatedName("ab")
public class class51 {

    @ObfuscatedName("ab.g")
    public int[] field1081;

    @ObfuscatedName("ab.z")
    public class61 field1082;

    @ObfuscatedName("ab.t")
    public int field1101 = 32;

    @ObfuscatedName("ab.y")
    public long field1099 = class106.method3592();

    @ObfuscatedName("ab.w")
    public int field1085;

    @ObfuscatedName("ab.x")
    public int field1086;

    @ObfuscatedName("ab.v")
    public int field1087;

    @ObfuscatedName("ab.q")
    public long field1088 = 0L;

    @ObfuscatedName("ab.f")
    public int field1089 = 0;

    @ObfuscatedName("ab.s")
    public int field1083 = 0;

    @ObfuscatedName("ab.a")
    public int field1091 = 0;

    @ObfuscatedName("ab.m")
    public long field1093 = 0L;

    @ObfuscatedName("ab.c")
    public boolean field1090 = true;

    @ObfuscatedName("ab.an")
    public int field1100 = 0;

    @ObfuscatedName("ab.ao")
    public class61[] field1096 = new class61[8];

    @ObfuscatedName("ab.ah")
    public class61[] field1076 = new class61[8];

    @ObfuscatedName("co.j(Ldp;Ljava/awt/Component;III)Lab;")
    public static final class51 method2058(class127 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1092 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1081 = new int[(Statics.field1077 ? 2 : 1) * 256];
                var4.field1086 = arg3;
                var4.method932(arg1);
                var4.field1085 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1085 > 16384) {
                    var4.field1085 = 16384;
                }
                var4.method928(var4.field1085);
                if (Statics.field1078 > 0 && Statics.field1079 == null) {
                    Statics.field1079 = new class67();
                    Statics.field1079.field1259 = arg0;
                    arg0.method2496(Statics.field1079, Statics.field1078);
                }
                if (Statics.field1079 != null) {
                    if (Statics.field1079.field1251[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1079.field1251[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1081 = new int[(Statics.field1077 ? 2 : 1) * 256];
                    var6.field1086 = arg3;
                    var6.method932(arg1);
                    var6.field1085 = 16384;
                    var6.method928(var6.field1085);
                    if (Statics.field1078 > 0 && Statics.field1079 == null) {
                        Statics.field1079 = new class67();
                        Statics.field1079.field1259 = arg0;
                        arg0.method2496(Statics.field1079, Statics.field1078);
                    }
                    if (Statics.field1079 != null) {
                        if (Statics.field1079.field1251[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1079.field1251[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class51();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ab.d(Lbe;B)V")
    public final synchronized void method976(class61 arg0) {
        this.field1082 = arg0;
    }

    @ObfuscatedName("ab.l(I)V")
    public final synchronized void method977() {
        if (this.field1081 == null) {
            return;
        }
        long var1 = class106.method3592();
        try {
            if (this.field1088 != 0L) {
                if (var1 < this.field1088) {
                    return;
                }
                this.method928(this.field1085);
                this.field1088 = 0L;
                this.field1090 = true;
            }
            int var3 = this.method919();
            if (this.field1091 - var3 > this.field1089) {
                this.field1089 = this.field1091 - var3;
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
                this.method921();
                this.method928(this.field1085);
                var3 = 0;
                this.field1090 = true;
                if (var4 + 256 > this.field1085) {
                    var4 = this.field1085 - 256;
                    this.field1087 = var4 - this.field1086;
                }
            }
            while (var3 < var4) {
                this.method996(this.field1081, 256);
                this.method922();
                var3 += 256;
            }
            if (var1 > this.field1093) {
                if (this.field1090) {
                    this.field1090 = false;
                } else if (this.field1089 == 0 && this.field1083 == 0) {
                    this.method921();
                    this.field1088 = var1 + 2000L;
                    return;
                } else {
                    this.field1087 = Math.min(this.field1083, this.field1089);
                    this.field1083 = this.field1089;
                }
                this.field1089 = 0;
                this.field1093 = var1 + 2000L;
            }
            this.field1091 = var3;
        } catch (Exception var8) {
            this.method921();
            this.field1088 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1099 + 500000L) {
                var1 = this.field1099;
            }
            while (var1 > this.field1099 + 5000L) {
                this.method988(256);
                this.field1099 += (long) (256000 / Statics.field1092);
            }
        } catch (Exception var7) {
            this.field1099 = var1;
        }
    }

    @ObfuscatedName("ab.u(I)V")
    public final void method978() {
        this.field1090 = true;
    }

    @ObfuscatedName("ab.r(I)V")
    public final synchronized void method979() {
        this.field1090 = true;
        try {
            this.method925();
        } catch (Exception var2) {
            this.method921();
            this.field1088 = class106.method3592() + 2000L;
        }
    }

    @ObfuscatedName("ab.an(B)V")
    public final synchronized void method980() {
        if (Statics.field1079 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1079.field1251[var2] == this) {
                    Statics.field1079.field1251[var2] = null;
                }
                if (Statics.field1079.field1251[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1079.field1252 = true;
                while (Statics.field1079.field1253) {
                    class118.method2490(50L);
                }
                Statics.field1079 = null;
            }
        }
        this.method921();
        this.field1081 = null;
    }

    @ObfuscatedName("ab.ao(II)V")
    public final void method988(int arg0) {
        this.field1100 -= arg0;
        if (this.field1100 < 0) {
            this.field1100 = 0;
        }
        if (this.field1082 != null) {
            this.field1082.method948(arg0);
        }
    }

    @ObfuscatedName("ab.ah([II)V")
    public final void method996(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1077) {
            var3 = arg1 << 1;
        }
        class111.method2337(arg0, 0, var3);
        this.field1100 -= arg1;
        if (this.field1082 != null && this.field1100 <= 0) {
            this.field1100 += Statics.field1092 >> 4;
            method818(this.field1082);
            this.method982(this.field1082, this.field1082.method1118());
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
                        class61 var10 = null;
                        class61 var11 = this.field1096[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1169;
                                if (var12 == null || var12.field1165 <= var8) {
                                    var11.field1168 = true;
                                    int var13 = var11.method959();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1165 += var13;
                                    }
                                    if (var4 >= this.field1101) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method943();
                                    if (var14 != null) {
                                        int var15 = var11.field1167;
                                        while (var14 != null) {
                                            this.method982(var14, var15 * var14.method1118() >> 8);
                                            var14 = var11.method944();
                                        }
                                    }
                                    class61 var16 = var11.field1166;
                                    var11.field1166 = null;
                                    if (var10 == null) {
                                        this.field1096[var7] = var16;
                                    } else {
                                        var10.field1166 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1076[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1166;
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
                class61 var18 = this.field1096[var17];
                class61[] var19 = this.field1096;
                this.field1076[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1166;
                    var18.field1166 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1100 < 0) {
            this.field1100 = 0;
        }
        if (this.field1082 != null) {
            this.field1082.method946(arg0, 0, arg1);
        }
        this.field1099 = class106.method3592();
    }

    @ObfuscatedName("ac.ai(Lbe;I)V")
    public static final void method818(class61 arg0) {
        arg0.field1168 = false;
        if (arg0.field1169 != null) {
            arg0.field1169.field1165 = 0;
        }
        for (class61 var1 = arg0.method943(); var1 != null; var1 = arg0.method944()) {
            method818(var1);
        }
    }

    @ObfuscatedName("ab.aa(Lbe;II)V")
    public final void method982(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1076[var3];
        if (var4 == null) {
            this.field1096[var3] = arg0;
        } else {
            var4.field1166 = arg0;
        }
        this.field1076[var3] = arg0;
        arg0.field1167 = arg1;
    }

    @ObfuscatedName("ab.b(Ljava/awt/Component;)V")
    public void method932(Component arg0) throws Exception {
    }

    @ObfuscatedName("ab.e(I)V")
    public void method928(int arg0) throws Exception {
    }

    @ObfuscatedName("ab.i()I")
    public int method919() throws Exception {
        return this.field1085;
    }

    @ObfuscatedName("ab.k()V")
    public void method922() throws Exception {
    }

    @ObfuscatedName("ab.h()V")
    public void method921() {
    }

    @ObfuscatedName("ab.p()V")
    public void method925() throws Exception {
    }
}
