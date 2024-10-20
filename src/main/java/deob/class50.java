package deob;

import java.awt.Component;

@ObfuscatedName("ap")
public class class50 {

    @ObfuscatedName("ap.n")
    public int[] field1082;

    @ObfuscatedName("ap.a")
    public class60 field1083;

    @ObfuscatedName("ap.q")
    public int field1079 = 32;

    @ObfuscatedName("ap.i")
    public long field1085 = class103.method553();

    @ObfuscatedName("ap.f")
    public int field1088;

    @ObfuscatedName("ap.o")
    public int field1087;

    @ObfuscatedName("ap.t")
    public int field1089;

    @ObfuscatedName("ap.c")
    public long field1084 = 0L;

    @ObfuscatedName("ap.d")
    public int field1098 = 0;

    @ObfuscatedName("ap.g")
    public int field1091 = 0;

    @ObfuscatedName("ap.s")
    public int field1092 = 0;

    @ObfuscatedName("ap.m")
    public long field1093 = 0L;

    @ObfuscatedName("ap.v")
    public boolean field1102 = true;

    @ObfuscatedName("ap.aj")
    public int field1095 = 0;

    @ObfuscatedName("ap.al")
    public class60[] field1101 = new class60[8];

    @ObfuscatedName("ap.ai")
    public class60[] field1097 = new class60[8];

    @ObfuscatedName("ef.x(Ldg;Ljava/awt/Component;IIB)Lap;")
    public static final class50 method2691(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1090 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1082 = new int[(Statics.field1086 ? 2 : 1) * 256];
                var4.field1087 = arg3;
                var4.method905(arg1);
                var4.field1088 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1088 > 16384) {
                    var4.field1088 = 16384;
                }
                var4.method906(var4.field1088);
                if (Statics.field1080 > 0 && Statics.field526 == null) {
                    Statics.field526 = new class66();
                    Statics.field526.field1253 = arg0;
                    arg0.method2492(Statics.field526, Statics.field1080);
                }
                if (Statics.field526 != null) {
                    if (Statics.field526.field1254[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field526.field1254[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1082 = new int[256 * (Statics.field1086 ? 2 : 1)];
                    var6.field1087 = arg3;
                    var6.method905(arg1);
                    var6.field1088 = 16384;
                    var6.method906(var6.field1088);
                    if (Statics.field1080 > 0 && Statics.field526 == null) {
                        Statics.field526 = new class66();
                        Statics.field526.field1253 = arg0;
                        arg0.method2492(Statics.field526, Statics.field1080);
                    }
                    if (Statics.field526 != null) {
                        if (Statics.field526.field1254[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field526.field1254[arg2] = var6;
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

    @ObfuscatedName("ap.aj(Lbf;S)V")
    public final synchronized void method974(class60 arg0) {
        this.field1083 = arg0;
    }

    @ObfuscatedName("ap.al(I)V")
    public final synchronized void method976() {
        if (this.field1082 == null) {
            return;
        }
        long var1 = class103.method553();
        try {
            if (this.field1084 != 0L) {
                if (var1 < this.field1084) {
                    return;
                }
                this.method906(this.field1088);
                this.field1084 = 0L;
                this.field1102 = true;
            }
            int var3 = this.method919();
            if (this.field1092 - var3 > this.field1098) {
                this.field1098 = this.field1092 - var3;
            }
            int var4 = this.field1089 + this.field1087;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1088) {
                this.field1088 += 1024;
                if (this.field1088 > 16384) {
                    this.field1088 = 16384;
                }
                this.method927();
                this.method906(this.field1088);
                var3 = 0;
                this.field1102 = true;
                if (var4 + 256 > this.field1088) {
                    var4 = this.field1088 - 256;
                    this.field1089 = var4 - this.field1087;
                }
            }
            while (var3 < var4) {
                this.method979(this.field1082, 256);
                this.method908();
                var3 += 256;
            }
            if (var1 > this.field1093) {
                if (this.field1102) {
                    this.field1102 = false;
                } else if (this.field1098 == 0 && this.field1091 == 0) {
                    this.method927();
                    this.field1084 = var1 + 2000L;
                    return;
                } else {
                    this.field1089 = Math.min(this.field1091, this.field1098);
                    this.field1091 = this.field1098;
                }
                this.field1098 = 0;
                this.field1093 = var1 + 2000L;
            }
            this.field1092 = var3;
        } catch (Exception var8) {
            this.method927();
            this.field1084 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1085 + 500000L) {
                var1 = this.field1085;
            }
            while (var1 > this.field1085 + 5000L) {
                this.method983(256);
                this.field1085 += (long) (256000 / Statics.field1090);
            }
        } catch (Exception var7) {
            this.field1085 = var1;
        }
    }

    @ObfuscatedName("ap.af(I)V")
    public final void method982() {
        this.field1102 = true;
    }

    @ObfuscatedName("ap.ai(I)V")
    public final synchronized void method984() {
        this.field1102 = true;
        try {
            this.method910();
        } catch (Exception var2) {
            this.method927();
            this.field1084 = class103.method553() + 2000L;
        }
    }

    @ObfuscatedName("ap.ak(I)V")
    public final synchronized void method977() {
        if (Statics.field526 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field526.field1254[var2] == this) {
                    Statics.field526.field1254[var2] = null;
                }
                if (Statics.field526.field1254[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field526.field1256 = true;
                while (Statics.field526.field1259) {
                    class114.method589(50L);
                }
                Statics.field526 = null;
            }
        }
        this.method927();
        this.field1082 = null;
    }

    @ObfuscatedName("ap.ae(IB)V")
    public final void method983(int arg0) {
        this.field1095 -= arg0;
        if (this.field1095 < 0) {
            this.field1095 = 0;
        }
        if (this.field1083 != null) {
            this.field1083.method940(arg0);
        }
    }

    @ObfuscatedName("ap.ag([II)V")
    public final void method979(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1086) {
            var3 = arg1 << 1;
        }
        class108.method2336(arg0, 0, var3);
        this.field1095 -= arg1;
        if (this.field1083 != null && this.field1095 <= 0) {
            this.field1095 += Statics.field1090 >> 4;
            method765(this.field1083);
            this.method978(this.field1083, this.field1083.method1112());
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
                        class60 var11 = this.field1101[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1171;
                                if (var12 == null || var12.field1168 <= var8) {
                                    var11.field1172 = true;
                                    int var13 = var11.method937();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1168 += var13;
                                    }
                                    if (var4 >= this.field1079) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method935();
                                    if (var14 != null) {
                                        int var15 = var11.field1170;
                                        while (var14 != null) {
                                            this.method978(var14, var15 * var14.method1112() >> 8);
                                            var14 = var11.method954();
                                        }
                                    }
                                    class60 var16 = var11.field1169;
                                    var11.field1169 = null;
                                    if (var10 == null) {
                                        this.field1101[var7] = var16;
                                    } else {
                                        var10.field1169 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1097[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1169;
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
                class60 var18 = this.field1101[var17];
                class60[] var19 = this.field1101;
                this.field1097[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1169;
                    var18.field1169 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1095 < 0) {
            this.field1095 = 0;
        }
        if (this.field1083 != null) {
            this.field1083.method938(arg0, 0, arg1);
        }
        this.field1085 = class103.method553();
    }

    @ObfuscatedName("at.ar(Lbf;I)V")
    public static final void method765(class60 arg0) {
        arg0.field1172 = false;
        if (arg0.field1171 != null) {
            arg0.field1171.field1168 = 0;
        }
        for (class60 var1 = arg0.method935(); var1 != null; var1 = arg0.method954()) {
            method765(var1);
        }
    }

    @ObfuscatedName("ap.an(Lbf;II)V")
    public final void method978(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1097[var3];
        if (var4 == null) {
            this.field1101[var3] = arg0;
        } else {
            var4.field1169 = arg0;
        }
        this.field1097[var3] = arg0;
        arg0.field1170 = arg1;
    }

    @ObfuscatedName("ap.j(Ljava/awt/Component;)V")
    public void method905(Component arg0) throws Exception {
    }

    @ObfuscatedName("ap.z(I)V")
    public void method906(int arg0) throws Exception {
    }

    @ObfuscatedName("ap.y()I")
    public int method919() throws Exception {
        return this.field1088;
    }

    @ObfuscatedName("ap.h()V")
    public void method908() throws Exception {
    }

    @ObfuscatedName("ap.r()V")
    public void method927() {
    }

    @ObfuscatedName("ap.e()V")
    public void method910() throws Exception {
    }
}
