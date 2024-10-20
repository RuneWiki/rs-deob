package deob;

import java.awt.Component;

@ObfuscatedName("ab")
public class class50 {

    @ObfuscatedName("ab.o")
    public int[] field1077;

    @ObfuscatedName("ab.h")
    public class60 field1079;

    @ObfuscatedName("ab.b")
    public int field1096 = 32;

    @ObfuscatedName("ab.r")
    public long field1080 = class103.method98();

    @ObfuscatedName("ab.l")
    public int field1092;

    @ObfuscatedName("ab.x")
    public int field1088;

    @ObfuscatedName("ab.q")
    public int field1083;

    @ObfuscatedName("ab.t")
    public long field1084 = 0L;

    @ObfuscatedName("ab.y")
    public int field1085 = 0;

    @ObfuscatedName("ab.d")
    public int field1076 = 0;

    @ObfuscatedName("ab.z")
    public int field1087 = 0;

    @ObfuscatedName("ab.n")
    public long field1078 = 0L;

    @ObfuscatedName("ab.v")
    public boolean field1082 = true;

    @ObfuscatedName("ab.ar")
    public int field1090 = 0;

    @ObfuscatedName("ab.ac")
    public class60[] field1091 = new class60[8];

    @ObfuscatedName("ab.ah")
    public class60[] field1086 = new class60[8];

    @ObfuscatedName("u.c(Ldz;Ljava/awt/Component;III)Lab;")
    public static final class50 method92(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field72 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1077 = new int[(Statics.field1089 ? 2 : 1) * 256];
                var4.field1088 = arg3;
                var4.method916(arg1);
                var4.field1092 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1092 > 16384) {
                    var4.field1092 = 16384;
                }
                var4.method915(var4.field1092);
                if (Statics.field70 > 0 && Statics.field1768 == null) {
                    Statics.field1768 = new class66();
                    Statics.field1768.field1254 = arg0;
                    arg0.method2461(Statics.field1768, Statics.field70);
                }
                if (Statics.field1768 != null) {
                    if (Statics.field1768.field1248[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1768.field1248[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1077 = new int[(Statics.field1089 ? 2 : 1) * 256];
                    var6.field1088 = arg3;
                    var6.method916(arg1);
                    var6.field1092 = 16384;
                    var6.method915(var6.field1092);
                    if (Statics.field70 > 0 && Statics.field1768 == null) {
                        Statics.field1768 = new class66();
                        Statics.field1768.field1254 = arg0;
                        arg0.method2461(Statics.field1768, Statics.field70);
                    }
                    if (Statics.field1768 != null) {
                        if (Statics.field1768.field1248[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1768.field1248[arg2] = var6;
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

    @ObfuscatedName("ab.ar(Lbz;I)V")
    public final synchronized void method979(class60 arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("ab.ac(I)V")
    public final synchronized void method980() {
        if (this.field1077 == null) {
            return;
        }
        long var1 = class103.method98();
        try {
            if (this.field1084 != 0L) {
                if (var1 < this.field1084) {
                    return;
                }
                this.method915(this.field1092);
                this.field1084 = 0L;
                this.field1082 = true;
            }
            int var3 = this.method934();
            if (this.field1087 - var3 > this.field1085) {
                this.field1085 = this.field1087 - var3;
            }
            int var4 = this.field1088 + this.field1083;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1092) {
                this.field1092 += 1024;
                if (this.field1092 > 16384) {
                    this.field1092 = 16384;
                }
                this.method919();
                this.method915(this.field1092);
                var3 = 0;
                this.field1082 = true;
                if (var4 + 256 > this.field1092) {
                    var4 = this.field1092 - 256;
                    this.field1083 = var4 - this.field1088;
                }
            }
            while (var3 < var4) {
                this.method984(this.field1077, 256);
                this.method918();
                var3 += 256;
            }
            if (var1 > this.field1078) {
                if (this.field1082) {
                    this.field1082 = false;
                } else if (this.field1085 == 0 && this.field1076 == 0) {
                    this.method919();
                    this.field1084 = var1 + 2000L;
                    return;
                } else {
                    this.field1083 = Math.min(this.field1076, this.field1085);
                    this.field1076 = this.field1085;
                }
                this.field1085 = 0;
                this.field1078 = var1 + 2000L;
            }
            this.field1087 = var3;
        } catch (Exception var8) {
            this.method919();
            this.field1084 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1080 + 500000L) {
                var1 = this.field1080;
            }
            while (var1 > this.field1080 + 5000L) {
                this.method1004(256);
                this.field1080 += (long) (256000 / Statics.field72);
            }
        } catch (Exception var7) {
            this.field1080 = var1;
        }
    }

    @ObfuscatedName("ab.ah(I)V")
    public final void method981() {
        this.field1082 = true;
    }

    @ObfuscatedName("ab.ap(I)V")
    public final synchronized void method1000() {
        this.field1082 = true;
        try {
            this.method920();
        } catch (Exception var2) {
            this.method919();
            this.field1084 = class103.method98() + 2000L;
        }
    }

    @ObfuscatedName("ab.aj(I)V")
    public final synchronized void method982() {
        if (Statics.field1768 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1768.field1248[var2] == this) {
                    Statics.field1768.field1248[var2] = null;
                }
                if (Statics.field1768.field1248[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1768.field1249 = true;
                while (Statics.field1768.field1251) {
                    class114.method1935(50L);
                }
                Statics.field1768 = null;
            }
        }
        this.method919();
        this.field1077 = null;
    }

    @ObfuscatedName("ab.as(II)V")
    public final void method1004(int arg0) {
        this.field1090 -= arg0;
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method949(arg0);
        }
    }

    @ObfuscatedName("ab.aa([II)V")
    public final void method984(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1089) {
            var3 = arg1 << 1;
        }
        class108.method2293(arg0, 0, var3);
        this.field1090 -= arg1;
        if (this.field1079 != null && this.field1090 <= 0) {
            this.field1090 += Statics.field72 >> 4;
            method2400(this.field1079);
            this.method985(this.field1079, this.field1079.method1113());
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
                        class60 var11 = this.field1091[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1165;
                                if (var12 == null || var12.field1162 <= var8) {
                                    var11.field1163 = true;
                                    int var13 = var11.method947();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1162 += var13;
                                    }
                                    if (var4 >= this.field1096) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method945();
                                    if (var14 != null) {
                                        int var15 = var11.field1164;
                                        while (var14 != null) {
                                            this.method985(var14, var15 * var14.method1113() >> 8);
                                            var14 = var11.method946();
                                        }
                                    }
                                    class60 var16 = var11.field1166;
                                    var11.field1166 = null;
                                    if (var10 == null) {
                                        this.field1091[var7] = var16;
                                    } else {
                                        var10.field1166 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1086[var7] = var10;
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
                class60 var18 = this.field1091[var17];
                class60[] var19 = this.field1091;
                this.field1086[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1166;
                    var18.field1166 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method954(arg0, 0, arg1);
        }
        this.field1080 = class103.method98();
    }

    @ObfuscatedName("dm.am(Lbz;B)V")
    public static final void method2400(class60 arg0) {
        arg0.field1163 = false;
        if (arg0.field1165 != null) {
            arg0.field1165.field1162 = 0;
        }
        for (class60 var1 = arg0.method945(); var1 != null; var1 = arg0.method946()) {
            method2400(var1);
        }
    }

    @ObfuscatedName("ab.ae(Lbz;II)V")
    public final void method985(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1086[var3];
        if (var4 == null) {
            this.field1091[var3] = arg0;
        } else {
            var4.field1166 = arg0;
        }
        this.field1086[var3] = arg0;
        arg0.field1164 = arg1;
    }

    @ObfuscatedName("ab.g(Ljava/awt/Component;)V")
    public void method916(Component arg0) throws Exception {
    }

    @ObfuscatedName("ab.i(I)V")
    public void method915(int arg0) throws Exception {
    }

    @ObfuscatedName("ab.k()I")
    public int method934() throws Exception {
        return this.field1092;
    }

    @ObfuscatedName("ab.e()V")
    public void method918() throws Exception {
    }

    @ObfuscatedName("ab.w()V")
    public void method919() {
    }

    @ObfuscatedName("ab.m()V")
    public void method920() throws Exception {
    }
}
