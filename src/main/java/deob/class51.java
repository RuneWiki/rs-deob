package deob;

import java.awt.Component;

@ObfuscatedName("ap")
public class class51 {

    @ObfuscatedName("ap.r")
    public int[] field1085;

    @ObfuscatedName("ap.a")
    public class47 field1086;

    @ObfuscatedName("ap.q")
    public int field1087 = 32;

    @ObfuscatedName("ap.z")
    public long field1088 = class120.method8();

    @ObfuscatedName("ap.d")
    public int field1089;

    @ObfuscatedName("ap.x")
    public int field1090;

    @ObfuscatedName("ap.s")
    public int field1084;

    @ObfuscatedName("ap.m")
    public long field1092 = 0L;

    @ObfuscatedName("ap.y")
    public int field1103 = 0;

    @ObfuscatedName("ap.b")
    public int field1094 = 0;

    @ObfuscatedName("ap.h")
    public int field1093 = 0;

    @ObfuscatedName("ap.f")
    public long field1091 = 0L;

    @ObfuscatedName("ap.v")
    public boolean field1100 = true;

    @ObfuscatedName("ap.ad")
    public int field1098 = 0;

    @ObfuscatedName("ap.aw")
    public class47[] field1095 = new class47[8];

    @ObfuscatedName("ap.af")
    public class47[] field1096 = new class47[8];

    @ObfuscatedName("g.c(Lbg;Ljava/awt/Component;III)Lap;")
    public static final class51 method2(class73 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1989 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class50 var4 = new class50();
                var4.field1085 = new int[256 * (Statics.field1970 ? 2 : 1)];
                var4.field1090 = arg3;
                var4.method923(arg1);
                var4.field1089 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1089 > 16384) {
                    var4.field1089 = 16384;
                }
                var4.method945(var4.field1089);
                if (Statics.field185 > 0 && Statics.field1097 == null) {
                    Statics.field1097 = new class54();
                    Statics.field1097.field1166 = arg0;
                    arg0.method1485(Statics.field1097, Statics.field185);
                }
                if (Statics.field1097 != null) {
                    if (Statics.field1097.field1165[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1097.field1165[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class43 var6 = new class43(arg0, arg2);
                    var6.field1085 = new int[(Statics.field1970 ? 2 : 1) * 256];
                    var6.field1090 = arg3;
                    var6.method923(arg1);
                    var6.field1089 = 16384;
                    var6.method945(var6.field1089);
                    if (Statics.field185 > 0 && Statics.field1097 == null) {
                        Statics.field1097 = new class54();
                        Statics.field1097.field1166 = arg0;
                        arg0.method1485(Statics.field1097, Statics.field185);
                    }
                    if (Statics.field1097 != null) {
                        if (Statics.field1097.field1165[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1097.field1165[arg2] = var6;
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

    @ObfuscatedName("ap.al(Laz;I)V")
    public final synchronized void method1144(class47 arg0) {
        this.field1086 = arg0;
    }

    @ObfuscatedName("ap.ai(B)V")
    public final synchronized void method1145() {
        if (this.field1085 == null) {
            return;
        }
        long var1 = class120.method8();
        try {
            if (this.field1092 != 0L) {
                if (var1 < this.field1092) {
                    return;
                }
                this.method945(this.field1089);
                this.field1092 = 0L;
                this.field1100 = true;
            }
            int var3 = this.method925();
            if (this.field1093 - var3 > this.field1103) {
                this.field1103 = this.field1093 - var3;
            }
            int var4 = this.field1090 + this.field1084;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1089) {
                this.field1089 += 1024;
                if (this.field1089 > 16384) {
                    this.field1089 = 16384;
                }
                this.method924();
                this.method945(this.field1089);
                var3 = 0;
                this.field1100 = true;
                if (var4 + 256 > this.field1089) {
                    var4 = this.field1089 - 256;
                    this.field1084 = var4 - this.field1090;
                }
            }
            while (var3 < var4) {
                this.method1149(this.field1085, 256);
                this.method926();
                var3 += 256;
            }
            if (var1 > this.field1091) {
                if (this.field1100) {
                    this.field1100 = false;
                } else if (this.field1103 == 0 && this.field1094 == 0) {
                    this.method924();
                    this.field1092 = var1 + 2000L;
                    return;
                } else {
                    this.field1084 = Math.min(this.field1094, this.field1103);
                    this.field1094 = this.field1103;
                }
                this.field1103 = 0;
                this.field1091 = var1 + 2000L;
            }
            this.field1093 = var3;
        } catch (Exception var8) {
            this.method924();
            this.field1092 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1088 + 500000L) {
                var1 = this.field1088;
            }
            while (var1 > this.field1088 + 5000L) {
                this.method1153(256);
                this.field1088 += (long) (256000 / Statics.field1989);
            }
        } catch (Exception var7) {
            this.field1088 = var1;
        }
    }

    @ObfuscatedName("ap.ad(I)V")
    public final void method1146() {
        this.field1100 = true;
    }

    @ObfuscatedName("ap.aw(I)V")
    public final synchronized void method1147() {
        this.field1100 = true;
        try {
            this.method928();
        } catch (Exception var2) {
            this.method924();
            this.field1092 = class120.method8() + 2000L;
        }
    }

    @ObfuscatedName("ap.af(I)V")
    public final synchronized void method1151() {
        if (Statics.field1097 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1097.field1165[var2] == this) {
                    Statics.field1097.field1165[var2] = null;
                }
                if (Statics.field1097.field1165[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1097.field1169 = true;
                while (Statics.field1097.field1167) {
                    class125.method2058(50L);
                }
                Statics.field1097 = null;
            }
        }
        this.method924();
        this.field1085 = null;
    }

    @ObfuscatedName("ap.an(IB)V")
    public final void method1153(int arg0) {
        this.field1098 -= arg0;
        if (this.field1098 < 0) {
            this.field1098 = 0;
        }
        if (this.field1086 != null) {
            this.field1086.method974(arg0);
        }
    }

    @ObfuscatedName("ap.ao([II)V")
    public final void method1149(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1970) {
            var3 = arg1 << 1;
        }
        class127.method2687(arg0, 0, var3);
        this.field1098 -= arg1;
        if (this.field1086 != null && this.field1098 <= 0) {
            this.field1098 += Statics.field1989 >> 4;
            method103(this.field1086);
            this.method1157(this.field1086, this.field1086.method1004());
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
                        class47 var10 = null;
                        class47 var11 = this.field1095[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class46 var12 = var11.field1060;
                                if (var12 == null || var12.field1059 <= var8) {
                                    var11.field1062 = true;
                                    int var13 = var11.method972();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1059 += var13;
                                    }
                                    if (var4 >= this.field1087) {
                                        break label105;
                                    }
                                    class47 var14 = var11.method1030();
                                    if (var14 != null) {
                                        int var15 = var11.field1061;
                                        while (var14 != null) {
                                            this.method1157(var14, var15 * var14.method1004() >> 8);
                                            var14 = var11.method971();
                                        }
                                    }
                                    class47 var16 = var11.field1063;
                                    var11.field1063 = null;
                                    if (var10 == null) {
                                        this.field1095[var7] = var16;
                                    } else {
                                        var10.field1063 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1096[var7] = var10;
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
                class47 var18 = this.field1095[var17];
                class47[] var19 = this.field1095;
                this.field1096[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class47 var21 = var18.field1063;
                    var18.field1063 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1098 < 0) {
            this.field1098 = 0;
        }
        if (this.field1086 != null) {
            this.field1086.method973(arg0, 0, arg1);
        }
        this.field1088 = class120.method8();
    }

    @ObfuscatedName("w.ak(Laz;I)V")
    public static final void method103(class47 arg0) {
        arg0.field1062 = false;
        if (arg0.field1060 != null) {
            arg0.field1060.field1059 = 0;
        }
        for (class47 var1 = arg0.method1030(); var1 != null; var1 = arg0.method971()) {
            method103(var1);
        }
    }

    @ObfuscatedName("ap.ah(Laz;IB)V")
    public final void method1157(class47 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class47 var4 = this.field1096[var3];
        if (var4 == null) {
            this.field1095[var3] = arg0;
        } else {
            var4.field1063 = arg0;
        }
        this.field1096[var3] = arg0;
        arg0.field1061 = arg1;
    }

    @ObfuscatedName("ap.g(Ljava/awt/Component;)V")
    public void method923(Component arg0) throws Exception {
    }

    @ObfuscatedName("ap.e(I)V")
    public void method945(int arg0) throws Exception {
    }

    @ObfuscatedName("ap.n()I")
    public int method925() throws Exception {
        return this.field1089;
    }

    @ObfuscatedName("ap.j()V")
    public void method926() throws Exception {
    }

    @ObfuscatedName("ap.i()V")
    public void method924() {
    }

    @ObfuscatedName("ap.o()V")
    public void method928() throws Exception {
    }
}
