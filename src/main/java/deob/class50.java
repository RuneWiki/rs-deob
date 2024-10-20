package deob;

import java.awt.Component;

@ObfuscatedName("aq")
public class class50 {

    @ObfuscatedName("aq.o")
    public int[] field1077;

    @ObfuscatedName("aq.q")
    public class60 field1078;

    @ObfuscatedName("aq.w")
    public int field1086 = 32;

    @ObfuscatedName("aq.y")
    public long field1080 = class103.method2455();

    @ObfuscatedName("aq.p")
    public int field1081;

    @ObfuscatedName("aq.m")
    public int field1082;

    @ObfuscatedName("aq.a")
    public int field1083;

    @ObfuscatedName("aq.u")
    public long field1084 = 0L;

    @ObfuscatedName("aq.n")
    public int field1085 = 0;

    @ObfuscatedName("aq.x")
    public int field1092 = 0;

    @ObfuscatedName("aq.f")
    public int field1087 = 0;

    @ObfuscatedName("aq.v")
    public long field1088 = 0L;

    @ObfuscatedName("aq.s")
    public boolean field1074 = true;

    @ObfuscatedName("aq.ag")
    public int field1090 = 0;

    @ObfuscatedName("aq.au")
    public class60[] field1091 = new class60[8];

    @ObfuscatedName("aq.ak")
    public class60[] field1079 = new class60[8];

    @ObfuscatedName("j.r(IZII)V")
    public static final void method492(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1075 = arg0;
        Statics.field2958 = arg1;
        Statics.field1921 = arg2;
    }

    @ObfuscatedName("ad.j(Lda;Ljava/awt/Component;IIB)Laq;")
    public static final class50 method833(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1075 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1077 = new int[256 * (Statics.field2958 ? 2 : 1)];
                var4.field1082 = arg3;
                var4.method922(arg1);
                var4.field1081 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1081 > 16384) {
                    var4.field1081 = 16384;
                }
                var4.method923(var4.field1081);
                if (Statics.field1921 > 0 && Statics.field1089 == null) {
                    Statics.field1089 = new class66();
                    Statics.field1089.field1245 = arg0;
                    arg0.method2463(Statics.field1089, Statics.field1921);
                }
                if (Statics.field1089 != null) {
                    if (Statics.field1089.field1246[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1089.field1246[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1077 = new int[(Statics.field2958 ? 2 : 1) * 256];
                    var6.field1082 = arg3;
                    var6.method922(arg1);
                    var6.field1081 = 16384;
                    var6.method923(var6.field1081);
                    if (Statics.field1921 > 0 && Statics.field1089 == null) {
                        Statics.field1089 = new class66();
                        Statics.field1089.field1245 = arg0;
                        arg0.method2463(Statics.field1089, Statics.field1921);
                    }
                    if (Statics.field1089 != null) {
                        if (Statics.field1089.field1246[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1089.field1246[arg2] = var6;
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

    @ObfuscatedName("aq.h(Lbh;I)V")
    public final synchronized void method981(class60 arg0) {
        this.field1078 = arg0;
    }

    @ObfuscatedName("aq.d(I)V")
    public final synchronized void method985() {
        if (this.field1077 == null) {
            return;
        }
        long var1 = class103.method2455();
        try {
            if (this.field1084 != 0L) {
                if (var1 < this.field1084) {
                    return;
                }
                this.method923(this.field1081);
                this.field1084 = 0L;
                this.field1074 = true;
            }
            int var3 = this.method921();
            if (this.field1087 - var3 > this.field1085) {
                this.field1085 = this.field1087 - var3;
            }
            int var4 = this.field1083 + this.field1082;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1081) {
                this.field1081 += 1024;
                if (this.field1081 > 16384) {
                    this.field1081 = 16384;
                }
                this.method935();
                this.method923(this.field1081);
                var3 = 0;
                this.field1074 = true;
                if (var4 + 256 > this.field1081) {
                    var4 = this.field1081 - 256;
                    this.field1083 = var4 - this.field1082;
                }
            }
            while (var3 < var4) {
                this.method986(this.field1077, 256);
                this.method926();
                var3 += 256;
            }
            if (var1 > this.field1088) {
                if (this.field1074) {
                    this.field1074 = false;
                } else if (this.field1085 == 0 && this.field1092 == 0) {
                    this.method935();
                    this.field1084 = var1 + 2000L;
                    return;
                } else {
                    this.field1083 = Math.min(this.field1092, this.field1085);
                    this.field1092 = this.field1085;
                }
                this.field1085 = 0;
                this.field1088 = var1 + 2000L;
            }
            this.field1087 = var3;
        } catch (Exception var8) {
            this.method935();
            this.field1084 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1080 + 500000L) {
                var1 = this.field1080;
            }
            while (var1 > this.field1080 + 5000L) {
                this.method1016(256);
                this.field1080 += (long) (256000 / Statics.field1075);
            }
        } catch (Exception var7) {
            this.field1080 = var1;
        }
    }

    @ObfuscatedName("aq.l(I)V")
    public final void method988() {
        this.field1074 = true;
    }

    @ObfuscatedName("aq.ag(S)V")
    public final synchronized void method984() {
        this.field1074 = true;
        try {
            this.method927();
        } catch (Exception var2) {
            this.method935();
            this.field1084 = class103.method2455() + 2000L;
        }
    }

    @ObfuscatedName("aq.au(I)V")
    public final synchronized void method1002() {
        if (Statics.field1089 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1089.field1246[var2] == this) {
                    Statics.field1089.field1246[var2] = null;
                }
                if (Statics.field1089.field1246[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1089.field1247 = true;
                while (Statics.field1089.field1248) {
                    class114.method500(50L);
                }
                Statics.field1089 = null;
            }
        }
        this.method935();
        this.field1077 = null;
    }

    @ObfuscatedName("aq.ak(II)V")
    public final void method1016(int arg0) {
        this.field1090 -= arg0;
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1078 != null) {
            this.field1078.method943(arg0);
        }
    }

    @ObfuscatedName("aq.aw([II)V")
    public final void method986(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2958) {
            var3 = arg1 << 1;
        }
        class108.method2315(arg0, 0, var3);
        this.field1090 -= arg1;
        if (this.field1078 != null && this.field1090 <= 0) {
            this.field1090 += Statics.field1075 >> 4;
            method2454(this.field1078);
            this.method980(this.field1078, this.field1078.method1094());
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
                                class59 var12 = var11.field1163;
                                if (var12 == null || var12.field1160 <= var8) {
                                    var11.field1164 = true;
                                    int var13 = var11.method951();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1160 += var13;
                                    }
                                    if (var4 >= this.field1086) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method948();
                                    if (var14 != null) {
                                        int var15 = var11.field1162;
                                        while (var14 != null) {
                                            this.method980(var14, var15 * var14.method1094() >> 8);
                                            var14 = var11.method942();
                                        }
                                    }
                                    class60 var16 = var11.field1161;
                                    var11.field1161 = null;
                                    if (var10 == null) {
                                        this.field1091[var7] = var16;
                                    } else {
                                        var10.field1161 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1079[var7] = var10;
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
                class60 var18 = this.field1091[var17];
                class60[] var19 = this.field1091;
                this.field1079[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1161;
                    var18.field1161 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1078 != null) {
            this.field1078.method979(arg0, 0, arg1);
        }
        this.field1080 = class103.method2455();
    }

    @ObfuscatedName("dr.at(Lbh;I)V")
    public static final void method2454(class60 arg0) {
        arg0.field1164 = false;
        if (arg0.field1163 != null) {
            arg0.field1163.field1160 = 0;
        }
        for (class60 var1 = arg0.method948(); var1 != null; var1 = arg0.method942()) {
            method2454(var1);
        }
    }

    @ObfuscatedName("aq.ah(Lbh;II)V")
    public final void method980(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1079[var3];
        if (var4 == null) {
            this.field1091[var3] = arg0;
        } else {
            var4.field1161 = arg0;
        }
        this.field1079[var3] = arg0;
        arg0.field1162 = arg1;
    }

    @ObfuscatedName("aq.k(Ljava/awt/Component;)V")
    public void method922(Component arg0) throws Exception {
    }

    @ObfuscatedName("aq.b(I)V")
    public void method923(int arg0) throws Exception {
    }

    @ObfuscatedName("aq.e()I")
    public int method921() throws Exception {
        return this.field1081;
    }

    @ObfuscatedName("aq.i()V")
    public void method926() throws Exception {
    }

    @ObfuscatedName("aq.t()V")
    public void method935() {
    }

    @ObfuscatedName("aq.z()V")
    public void method927() throws Exception {
    }
}
