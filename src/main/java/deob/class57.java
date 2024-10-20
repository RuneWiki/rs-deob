package deob;

import java.awt.Component;

@ObfuscatedName("bc")
public class class57 {

    @ObfuscatedName("bc.t")
    public int[] field1166;

    @ObfuscatedName("bc.k")
    public class67 field1167;

    @ObfuscatedName("bc.s")
    public int field1180 = 32;

    @ObfuscatedName("bc.w")
    public long field1169 = class115.method2038();

    @ObfuscatedName("bc.e")
    public int field1170;

    @ObfuscatedName("bc.z")
    public int field1171;

    @ObfuscatedName("bc.p")
    public int field1176;

    @ObfuscatedName("bc.r")
    public long field1173 = 0L;

    @ObfuscatedName("bc.g")
    public int field1172 = 0;

    @ObfuscatedName("bc.n")
    public int field1175 = 0;

    @ObfuscatedName("bc.y")
    public int field1174 = 0;

    @ObfuscatedName("bc.v")
    public long field1177 = 0L;

    @ObfuscatedName("bc.q")
    public boolean field1178 = true;

    @ObfuscatedName("bc.aa")
    public int field1164 = 0;

    @ObfuscatedName("bc.ao")
    public class67[] field1181 = new class67[8];

    @ObfuscatedName("bc.as")
    public class67[] field1182 = new class67[8];

    @ObfuscatedName("ap.c(Lep;Ljava/awt/Component;III)Lbc;")
    public static final class57 method759(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1184 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1166 = new int[(Statics.field3216 ? 2 : 1) * 256];
                var4.field1171 = arg3;
                var4.method1118(arg1);
                var4.field1170 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1170 > 16384) {
                    var4.field1170 = 16384;
                }
                var4.method1119(var4.field1170);
                if (Statics.field1163 > 0 && Statics.field660 == null) {
                    Statics.field660 = new class73();
                    Statics.field660.field1343 = arg0;
                    arg0.method2747(Statics.field660, Statics.field1163);
                }
                if (Statics.field660 != null) {
                    if (Statics.field660.field1341[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field660.field1341[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1166 = new int[(Statics.field3216 ? 2 : 1) * 256];
                    var6.field1171 = arg3;
                    var6.method1118(arg1);
                    var6.field1170 = 16384;
                    var6.method1119(var6.field1170);
                    if (Statics.field1163 > 0 && Statics.field660 == null) {
                        Statics.field660 = new class73();
                        Statics.field660.field1343 = arg0;
                        arg0.method2747(Statics.field660, Statics.field1163);
                    }
                    if (Statics.field660 != null) {
                        if (Statics.field660.field1341[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field660.field1341[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class57();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bc.b(Lbp;B)V")
    public final synchronized void method1183(class67 arg0) {
        this.field1167 = arg0;
    }

    @ObfuscatedName("bc.aa(S)V")
    public final synchronized void method1184() {
        if (this.field1166 == null) {
            return;
        }
        long var1 = class115.method2038();
        try {
            if (this.field1173 != 0L) {
                if (var1 < this.field1173) {
                    return;
                }
                this.method1119(this.field1170);
                this.field1173 = 0L;
                this.field1178 = true;
            }
            int var3 = this.method1120();
            if (this.field1174 - var3 > this.field1172) {
                this.field1172 = this.field1174 - var3;
            }
            int var4 = this.field1176 + this.field1171;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1170) {
                this.field1170 += 1024;
                if (this.field1170 > 16384) {
                    this.field1170 = 16384;
                }
                this.method1122();
                this.method1119(this.field1170);
                var3 = 0;
                this.field1178 = true;
                if (var4 + 256 > this.field1170) {
                    var4 = this.field1170 - 256;
                    this.field1176 = var4 - this.field1171;
                }
            }
            while (var3 < var4) {
                this.method1189(this.field1166, 256);
                this.method1125();
                var3 += 256;
            }
            if (var1 > this.field1177) {
                if (this.field1178) {
                    this.field1178 = false;
                } else if (this.field1172 == 0 && this.field1175 == 0) {
                    this.method1122();
                    this.field1173 = var1 + 2000L;
                    return;
                } else {
                    this.field1176 = Math.min(this.field1175, this.field1172);
                    this.field1175 = this.field1172;
                }
                this.field1172 = 0;
                this.field1177 = var1 + 2000L;
            }
            this.field1174 = var3;
        } catch (Exception var8) {
            this.method1122();
            this.field1173 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1169 + 500000L) {
                var1 = this.field1169;
            }
            while (var1 > this.field1169 + 5000L) {
                this.method1188(256);
                this.field1169 += (long) (256000 / Statics.field1184);
            }
        } catch (Exception var7) {
            this.field1169 = var1;
        }
    }

    @ObfuscatedName("bc.ao(I)V")
    public final void method1185() {
        this.field1178 = true;
    }

    @ObfuscatedName("bc.as(I)V")
    public final synchronized void method1209() {
        this.field1178 = true;
        try {
            this.method1139();
        } catch (Exception var2) {
            this.method1122();
            this.field1173 = class115.method2038() + 2000L;
        }
    }

    @ObfuscatedName("bc.ae(I)V")
    public final synchronized void method1187() {
        if (Statics.field660 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field660.field1341[var2] == this) {
                    Statics.field660.field1341[var2] = null;
                }
                if (Statics.field660.field1341[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field660.field1342 = true;
                while (Statics.field660.field1339) {
                    class127.method692(50L);
                }
                Statics.field660 = null;
            }
        }
        this.method1122();
        this.field1166 = null;
    }

    @ObfuscatedName("bc.ai(IB)V")
    public final void method1188(int arg0) {
        this.field1164 -= arg0;
        if (this.field1164 < 0) {
            this.field1164 = 0;
        }
        if (this.field1167 != null) {
            this.field1167.method1142(arg0);
        }
    }

    @ObfuscatedName("bc.am([II)V")
    public final void method1189(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3216) {
            var3 = arg1 << 1;
        }
        class120.method2585(arg0, 0, var3);
        this.field1164 -= arg1;
        if (this.field1167 != null && this.field1164 <= 0) {
            this.field1164 += Statics.field1184 >> 4;
            method120(this.field1167);
            this.method1190(this.field1167, this.field1167.method1284());
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
                        class67 var10 = null;
                        class67 var11 = this.field1181[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1254;
                                if (var12 == null || var12.field1251 <= var8) {
                                    var11.field1252 = true;
                                    int var13 = var11.method1149();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1251 += var13;
                                    }
                                    if (var4 >= this.field1180) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1147();
                                    if (var14 != null) {
                                        int var15 = var11.field1253;
                                        while (var14 != null) {
                                            this.method1190(var14, var15 * var14.method1284() >> 8);
                                            var14 = var11.method1148();
                                        }
                                    }
                                    class67 var16 = var11.field1255;
                                    var11.field1255 = null;
                                    if (var10 == null) {
                                        this.field1181[var7] = var16;
                                    } else {
                                        var10.field1255 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1182[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1255;
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
                class67 var18 = this.field1181[var17];
                class67[] var19 = this.field1181;
                this.field1182[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1255;
                    var18.field1255 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1164 < 0) {
            this.field1164 = 0;
        }
        if (this.field1167 != null) {
            this.field1167.method1150(arg0, 0, arg1);
        }
        this.field1169 = class115.method2038();
    }

    @ObfuscatedName("i.ax(Lbp;I)V")
    public static final void method120(class67 arg0) {
        arg0.field1252 = false;
        if (arg0.field1254 != null) {
            arg0.field1254.field1251 = 0;
        }
        for (class67 var1 = arg0.method1147(); var1 != null; var1 = arg0.method1148()) {
            method120(var1);
        }
    }

    @ObfuscatedName("bc.ay(Lbp;IB)V")
    public final void method1190(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1182[var3];
        if (var4 == null) {
            this.field1181[var3] = arg0;
        } else {
            var4.field1255 = arg0;
        }
        this.field1182[var3] = arg0;
        arg0.field1253 = arg1;
    }

    @ObfuscatedName("bc.j(Ljava/awt/Component;)V")
    public void method1118(Component arg0) throws Exception {
    }

    @ObfuscatedName("bc.m(I)V")
    public void method1119(int arg0) throws Exception {
    }

    @ObfuscatedName("bc.f()I")
    public int method1120() throws Exception {
        return this.field1170;
    }

    @ObfuscatedName("bc.l()V")
    public void method1125() throws Exception {
    }

    @ObfuscatedName("bc.u()V")
    public void method1122() {
    }

    @ObfuscatedName("bc.a()V")
    public void method1139() throws Exception {
    }
}
