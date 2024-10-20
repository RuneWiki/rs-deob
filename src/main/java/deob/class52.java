package deob;

import java.awt.Component;

@ObfuscatedName("ao")
public class class52 {

    @ObfuscatedName("ao.u")
    public int[] field1094;

    @ObfuscatedName("ao.s")
    public class48 field1095;

    @ObfuscatedName("ao.e")
    public int field1096 = 32;

    @ObfuscatedName("ao.r")
    public long field1103 = class121.method548();

    @ObfuscatedName("ao.n")
    public int field1098;

    @ObfuscatedName("ao.g")
    public int field1102;

    @ObfuscatedName("ao.c")
    public int field1090;

    @ObfuscatedName("ao.v")
    public long field1101 = 0L;

    @ObfuscatedName("ao.b")
    public int field1115 = 0;

    @ObfuscatedName("ao.k")
    public int field1100 = 0;

    @ObfuscatedName("ao.t")
    public int field1104 = 0;

    @ObfuscatedName("ao.f")
    public long field1105 = 0L;

    @ObfuscatedName("ao.h")
    public boolean field1106 = true;

    @ObfuscatedName("ao.ah")
    public int field1109 = 0;

    @ObfuscatedName("ao.at")
    public class48[] field1092 = new class48[8];

    @ObfuscatedName("ao.aa")
    public class48[] field1107 = new class48[8];

    @ObfuscatedName("ap.j(Lbc;Ljava/awt/Component;III)Lao;")
    public static final class52 method546(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1099 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1094 = new int[(Statics.field1368 ? 2 : 1) * 256];
                var4.field1102 = arg3;
                var4.method942(arg1);
                var4.field1098 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1098 > 16384) {
                    var4.field1098 = 16384;
                }
                var4.method943(var4.field1098);
                if (Statics.field1091 > 0 && Statics.field1097 == null) {
                    Statics.field1097 = new class55();
                    Statics.field1097.field1178 = arg0;
                    arg0.method1549(Statics.field1097, Statics.field1091);
                }
                if (Statics.field1097 != null) {
                    if (Statics.field1097.field1181[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1097.field1181[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1094 = new int[(Statics.field1368 ? 2 : 1) * 256];
                    var6.field1102 = arg3;
                    var6.method942(arg1);
                    var6.field1098 = 16384;
                    var6.method943(var6.field1098);
                    if (Statics.field1091 > 0 && Statics.field1097 == null) {
                        Statics.field1097 = new class55();
                        Statics.field1097.field1178 = arg0;
                        arg0.method1549(Statics.field1097, Statics.field1091);
                    }
                    if (Statics.field1097 != null) {
                        if (Statics.field1097.field1181[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1097.field1181[arg2] = var6;
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

    @ObfuscatedName("ao.q(Lax;I)V")
    public final synchronized void method1200(class48 arg0) {
        this.field1095 = arg0;
    }

    @ObfuscatedName("ao.z(I)V")
    public final synchronized void method1197() {
        if (this.field1094 == null) {
            return;
        }
        long var1 = class121.method548();
        try {
            if (this.field1101 != 0L) {
                if (var1 < this.field1101) {
                    return;
                }
                this.method943(this.field1098);
                this.field1101 = 0L;
                this.field1106 = true;
            }
            int var3 = this.method952();
            if (this.field1104 - var3 > this.field1115) {
                this.field1115 = this.field1104 - var3;
            }
            int var4 = this.field1102 + this.field1090;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1098) {
                this.field1098 += 1024;
                if (this.field1098 > 16384) {
                    this.field1098 = 16384;
                }
                this.method946();
                this.method943(this.field1098);
                var3 = 0;
                this.field1106 = true;
                if (var4 + 256 > this.field1098) {
                    var4 = this.field1098 - 256;
                    this.field1090 = var4 - this.field1102;
                }
            }
            while (var3 < var4) {
                this.method1215(this.field1094, 256);
                this.method945();
                var3 += 256;
            }
            if (var1 > this.field1105) {
                if (this.field1106) {
                    this.field1106 = false;
                } else if (this.field1115 == 0 && this.field1100 == 0) {
                    this.method946();
                    this.field1101 = var1 + 2000L;
                    return;
                } else {
                    this.field1090 = Math.min(this.field1100, this.field1115);
                    this.field1100 = this.field1115;
                }
                this.field1115 = 0;
                this.field1105 = var1 + 2000L;
            }
            this.field1104 = var3;
        } catch (Exception var8) {
            this.method946();
            this.field1101 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1103 + 500000L) {
                var1 = this.field1103;
            }
            while (var1 > this.field1103 + 5000L) {
                this.method1221(256);
                this.field1103 += (long) (256000 / Statics.field1099);
            }
        } catch (Exception var7) {
            this.field1103 = var1;
        }
    }

    @ObfuscatedName("ao.af(I)V")
    public final void method1198() {
        this.field1106 = true;
    }

    @ObfuscatedName("ao.ap(I)V")
    public final synchronized void method1206() {
        this.field1106 = true;
        try {
            this.method947();
        } catch (Exception var2) {
            this.method946();
            this.field1101 = class121.method548() + 2000L;
        }
    }

    @ObfuscatedName("ao.ah(I)V")
    public final synchronized void method1199() {
        if (Statics.field1097 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1097.field1181[var2] == this) {
                    Statics.field1097.field1181[var2] = null;
                }
                if (Statics.field1097.field1181[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1097.field1183 = true;
                while (Statics.field1097.field1180) {
                    class126.method1463(50L);
                }
                Statics.field1097 = null;
            }
        }
        this.method946();
        this.field1094 = null;
    }

    @ObfuscatedName("ao.at(II)V")
    public final void method1221(int arg0) {
        this.field1109 -= arg0;
        if (this.field1109 < 0) {
            this.field1109 = 0;
        }
        if (this.field1095 != null) {
            this.field1095.method990(arg0);
        }
    }

    @ObfuscatedName("ao.aa([II)V")
    public final void method1215(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1368) {
            var3 = arg1 << 1;
        }
        class128.method2701(arg0, 0, var3);
        this.field1109 -= arg1;
        if (this.field1095 != null && this.field1109 <= 0) {
            this.field1109 += Statics.field1099 >> 4;
            method894(this.field1095);
            this.method1236(this.field1095, this.field1095.method966());
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
                        class48 var11 = this.field1092[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1069;
                                if (var12 == null || var12.field1065 <= var8) {
                                    var11.field1066 = true;
                                    int var13 = var11.method1123();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1065 += var13;
                                    }
                                    if (var4 >= this.field1096) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method1009();
                                    if (var14 != null) {
                                        int var15 = var11.field1067;
                                        while (var14 != null) {
                                            this.method1236(var14, var15 * var14.method966() >> 8);
                                            var14 = var11.method987();
                                        }
                                    }
                                    class48 var16 = var11.field1068;
                                    var11.field1068 = null;
                                    if (var10 == null) {
                                        this.field1092[var7] = var16;
                                    } else {
                                        var10.field1068 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1107[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1068;
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
                class48 var18 = this.field1092[var17];
                class48[] var19 = this.field1092;
                this.field1107[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1068;
                    var18.field1068 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1109 < 0) {
            this.field1109 = 0;
        }
        if (this.field1095 != null) {
            this.field1095.method978(arg0, 0, arg1);
        }
        this.field1103 = class121.method548();
    }

    @ObfuscatedName("as.ae(Lax;I)V")
    public static final void method894(class48 arg0) {
        arg0.field1066 = false;
        if (arg0.field1069 != null) {
            arg0.field1069.field1065 = 0;
        }
        for (class48 var1 = arg0.method1009(); var1 != null; var1 = arg0.method987()) {
            method894(var1);
        }
    }

    @ObfuscatedName("ao.aw(Lax;II)V")
    public final void method1236(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1107[var3];
        if (var4 == null) {
            this.field1092[var3] = arg0;
        } else {
            var4.field1068 = arg0;
        }
        this.field1107[var3] = arg0;
        arg0.field1067 = arg1;
    }

    @ObfuscatedName("ao.p(Ljava/awt/Component;)V")
    public void method942(Component arg0) throws Exception {
    }

    @ObfuscatedName("ao.l(I)V")
    public void method943(int arg0) throws Exception {
    }

    @ObfuscatedName("ao.d()I")
    public int method952() throws Exception {
        return this.field1098;
    }

    @ObfuscatedName("ao.x()V")
    public void method945() throws Exception {
    }

    @ObfuscatedName("ao.o()V")
    public void method946() {
    }

    @ObfuscatedName("ao.a()V")
    public void method947() throws Exception {
    }
}
