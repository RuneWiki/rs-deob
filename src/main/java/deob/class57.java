package deob;

import java.awt.Component;

@ObfuscatedName("bq")
public class class57 {

    @ObfuscatedName("bq.j")
    public int[] field1183;

    @ObfuscatedName("bq.n")
    public class67 field1178;

    @ObfuscatedName("bq.l")
    public int field1179 = 32;

    @ObfuscatedName("bq.h")
    public long field1194 = class115.method207();

    @ObfuscatedName("bq.i")
    public int field1181;

    @ObfuscatedName("bq.v")
    public int field1182;

    @ObfuscatedName("bq.z")
    public int field1180;

    @ObfuscatedName("bq.u")
    public long field1184 = 0L;

    @ObfuscatedName("bq.t")
    public int field1185 = 0;

    @ObfuscatedName("bq.b")
    public int field1196 = 0;

    @ObfuscatedName("bq.c")
    public int field1187 = 0;

    @ObfuscatedName("bq.x")
    public long field1188 = 0L;

    @ObfuscatedName("bq.d")
    public boolean field1189 = true;

    @ObfuscatedName("bq.ad")
    public int field1192 = 0;

    @ObfuscatedName("bq.at")
    public class67[] field1177 = new class67[8];

    @ObfuscatedName("bq.aw")
    public class67[] field1193 = new class67[8];

    @ObfuscatedName("ad.w(Lef;Ljava/awt/Component;III)Lbq;")
    public static final class57 method629(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1186 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1183 = new int[(Statics.field1174 ? 2 : 1) * 256];
                var4.field1182 = arg3;
                var4.method1103(arg1);
                var4.field1181 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1181 > 16384) {
                    var4.field1181 = 16384;
                }
                var4.method1105(var4.field1181);
                if (Statics.field1175 > 0 && Statics.field3177 == null) {
                    Statics.field3177 = new class73();
                    Statics.field3177.field1353 = arg0;
                    arg0.method2719(Statics.field3177, Statics.field1175);
                }
                if (Statics.field3177 != null) {
                    if (Statics.field3177.field1350[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3177.field1350[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1183 = new int[256 * (Statics.field1174 ? 2 : 1)];
                    var6.field1182 = arg3;
                    var6.method1103(arg1);
                    var6.field1181 = 16384;
                    var6.method1105(var6.field1181);
                    if (Statics.field1175 > 0 && Statics.field3177 == null) {
                        Statics.field3177 = new class73();
                        Statics.field3177.field1353 = arg0;
                        arg0.method2719(Statics.field3177, Statics.field1175);
                    }
                    if (Statics.field3177 != null) {
                        if (Statics.field3177.field1350[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field3177.field1350[arg2] = var6;
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

    @ObfuscatedName("bq.k(Lbe;B)V")
    public final synchronized void method1167(class67 arg0) {
        this.field1178 = arg0;
    }

    @ObfuscatedName("bq.o(B)V")
    public final synchronized void method1168() {
        if (this.field1183 == null) {
            return;
        }
        long var1 = class115.method207();
        try {
            if (this.field1184 != 0L) {
                if (var1 < this.field1184) {
                    return;
                }
                this.method1105(this.field1181);
                this.field1184 = 0L;
                this.field1189 = true;
            }
            int var3 = this.method1106();
            if (this.field1187 - var3 > this.field1185) {
                this.field1185 = this.field1187 - var3;
            }
            int var4 = this.field1182 + this.field1180;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1181) {
                this.field1181 += 1024;
                if (this.field1181 > 16384) {
                    this.field1181 = 16384;
                }
                this.method1108();
                this.method1105(this.field1181);
                var3 = 0;
                this.field1189 = true;
                if (var4 + 256 > this.field1181) {
                    var4 = this.field1181 - 256;
                    this.field1180 = var4 - this.field1182;
                }
            }
            while (var3 < var4) {
                this.method1175(this.field1183, 256);
                this.method1107();
                var3 += 256;
            }
            if (var1 > this.field1188) {
                if (this.field1189) {
                    this.field1189 = false;
                } else if (this.field1185 == 0 && this.field1196 == 0) {
                    this.method1108();
                    this.field1184 = var1 + 2000L;
                    return;
                } else {
                    this.field1180 = Math.min(this.field1196, this.field1185);
                    this.field1196 = this.field1185;
                }
                this.field1185 = 0;
                this.field1188 = var1 + 2000L;
            }
            this.field1187 = var3;
        } catch (Exception var8) {
            this.method1108();
            this.field1184 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1194 + 500000L) {
                var1 = this.field1194;
            }
            while (var1 > this.field1194 + 5000L) {
                this.method1172(256);
                this.field1194 += (long) (256000 / Statics.field1186);
            }
        } catch (Exception var7) {
            this.field1194 = var1;
        }
    }

    @ObfuscatedName("bq.ad(I)V")
    public final void method1169() {
        this.field1189 = true;
    }

    @ObfuscatedName("bq.at(B)V")
    public final synchronized void method1170() {
        this.field1189 = true;
        try {
            this.method1104();
        } catch (Exception var2) {
            this.method1108();
            this.field1184 = class115.method207() + 2000L;
        }
    }

    @ObfuscatedName("bq.aw(I)V")
    public final synchronized void method1171() {
        if (Statics.field3177 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3177.field1350[var2] == this) {
                    Statics.field3177.field1350[var2] = null;
                }
                if (Statics.field3177.field1350[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3177.field1354 = true;
                while (Statics.field3177.field1355) {
                    class127.method2148(50L);
                }
                Statics.field3177 = null;
            }
        }
        this.method1108();
        this.field1183 = null;
    }

    @ObfuscatedName("bq.ax(IB)V")
    public final void method1172(int arg0) {
        this.field1192 -= arg0;
        if (this.field1192 < 0) {
            this.field1192 = 0;
        }
        if (this.field1178 != null) {
            this.field1178.method1136(arg0);
        }
    }

    @ObfuscatedName("bq.ak([II)V")
    public final void method1175(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1174) {
            var3 = arg1 << 1;
        }
        class120.method2551(arg0, 0, var3);
        this.field1192 -= arg1;
        if (this.field1178 != null && this.field1192 <= 0) {
            this.field1192 += Statics.field1186 >> 4;
            method2063(this.field1178);
            this.method1173(this.field1178, this.field1178.method1277());
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
                        class67 var11 = this.field1177[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1267;
                                if (var12 == null || var12.field1263 <= var8) {
                                    var11.field1264 = true;
                                    int var13 = var11.method1132();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1263 += var13;
                                    }
                                    if (var4 >= this.field1179) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1131();
                                    if (var14 != null) {
                                        int var15 = var11.field1265;
                                        while (var14 != null) {
                                            this.method1173(var14, var15 * var14.method1277() >> 8);
                                            var14 = var11.method1165();
                                        }
                                    }
                                    class67 var16 = var11.field1266;
                                    var11.field1266 = null;
                                    if (var10 == null) {
                                        this.field1177[var7] = var16;
                                    } else {
                                        var10.field1266 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1193[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1266;
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
                class67 var18 = this.field1177[var17];
                class67[] var19 = this.field1177;
                this.field1193[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1266;
                    var18.field1266 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1192 < 0) {
            this.field1192 = 0;
        }
        if (this.field1178 != null) {
            this.field1178.method1134(arg0, 0, arg1);
        }
        this.field1194 = class115.method207();
    }

    @ObfuscatedName("cn.ah(Lbe;I)V")
    public static final void method2063(class67 arg0) {
        arg0.field1264 = false;
        if (arg0.field1267 != null) {
            arg0.field1267.field1263 = 0;
        }
        for (class67 var1 = arg0.method1131(); var1 != null; var1 = arg0.method1165()) {
            method2063(var1);
        }
    }

    @ObfuscatedName("bq.ac(Lbe;II)V")
    public final void method1173(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1193[var3];
        if (var4 == null) {
            this.field1177[var3] = arg0;
        } else {
            var4.field1266 = arg0;
        }
        this.field1193[var3] = arg0;
        arg0.field1265 = arg1;
    }

    @ObfuscatedName("bq.a(Ljava/awt/Component;)V")
    public void method1103(Component arg0) throws Exception {
    }

    @ObfuscatedName("bq.r(I)V")
    public void method1105(int arg0) throws Exception {
    }

    @ObfuscatedName("bq.f()I")
    public int method1106() throws Exception {
        return this.field1181;
    }

    @ObfuscatedName("bq.s()V")
    public void method1107() throws Exception {
    }

    @ObfuscatedName("bq.y()V")
    public void method1108() {
    }

    @ObfuscatedName("bq.e()V")
    public void method1104() throws Exception {
    }
}
