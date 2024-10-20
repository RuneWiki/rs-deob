package deob;

import java.awt.Component;

@ObfuscatedName("bk")
public class class57 {

    @ObfuscatedName("bk.m")
    public int[] field1196;

    @ObfuscatedName("bk.n")
    public class67 field1185;

    @ObfuscatedName("bk.k")
    public int field1179 = 32;

    @ObfuscatedName("bk.o")
    public long field1180 = class115.method671();

    @ObfuscatedName("bk.f")
    public int field1181;

    @ObfuscatedName("bk.s")
    public int field1174;

    @ObfuscatedName("bk.z")
    public int field1176;

    @ObfuscatedName("bk.b")
    public long field1184 = 0L;

    @ObfuscatedName("bk.p")
    public int field1183 = 0;

    @ObfuscatedName("bk.r")
    public int field1177 = 0;

    @ObfuscatedName("bk.x")
    public int field1187 = 0;

    @ObfuscatedName("bk.h")
    public long field1188 = 0L;

    @ObfuscatedName("bk.j")
    public boolean field1189 = true;

    @ObfuscatedName("bk.ah")
    public int field1182 = 0;

    @ObfuscatedName("bk.aa")
    public class67[] field1186 = new class67[8];

    @ObfuscatedName("bk.ao")
    public class67[] field1192 = new class67[8];

    @ObfuscatedName("g.l(IZIB)V")
    public static final void method36(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2644 = arg0;
        Statics.field1178 = arg1;
        Statics.field1175 = arg2;
    }

    @ObfuscatedName("d.u(Les;Ljava/awt/Component;IIB)Lbk;")
    public static final class57 method6(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2644 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1196 = new int[256 * (Statics.field1178 ? 2 : 1)];
                var4.field1174 = arg3;
                var4.method1101(arg1);
                var4.field1181 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1181 > 16384) {
                    var4.field1181 = 16384;
                }
                var4.method1106(var4.field1181);
                if (Statics.field1175 > 0 && Statics.field1352 == null) {
                    Statics.field1352 = new class73();
                    Statics.field1352.field1350 = arg0;
                    arg0.method2689(Statics.field1352, Statics.field1175);
                }
                if (Statics.field1352 != null) {
                    if (Statics.field1352.field1349[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1352.field1349[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1196 = new int[(Statics.field1178 ? 2 : 1) * 256];
                    var6.field1174 = arg3;
                    var6.method1101(arg1);
                    var6.field1181 = 16384;
                    var6.method1106(var6.field1181);
                    if (Statics.field1175 > 0 && Statics.field1352 == null) {
                        Statics.field1352 = new class73();
                        Statics.field1352.field1350 = arg0;
                        arg0.method2689(Statics.field1352, Statics.field1175);
                    }
                    if (Statics.field1352 != null) {
                        if (Statics.field1352.field1349[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1352.field1349[arg2] = var6;
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

    @ObfuscatedName("bk.t(Lbs;B)V")
    public final synchronized void method1154(class67 arg0) {
        this.field1185 = arg0;
    }

    @ObfuscatedName("bk.i(B)V")
    public final synchronized void method1185() {
        if (this.field1196 == null) {
            return;
        }
        long var1 = class115.method671();
        try {
            if (this.field1184 != 0L) {
                if (var1 < this.field1184) {
                    return;
                }
                this.method1106(this.field1181);
                this.field1184 = 0L;
                this.field1189 = true;
            }
            int var3 = this.method1110();
            if (this.field1187 - var3 > this.field1183) {
                this.field1183 = this.field1187 - var3;
            }
            int var4 = this.field1176 + this.field1174;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1181) {
                this.field1181 += 1024;
                if (this.field1181 > 16384) {
                    this.field1181 = 16384;
                }
                this.method1093();
                this.method1106(this.field1181);
                var3 = 0;
                this.field1189 = true;
                if (var4 + 256 > this.field1181) {
                    var4 = this.field1181 - 256;
                    this.field1176 = var4 - this.field1174;
                }
            }
            while (var3 < var4) {
                this.method1165(this.field1196, 256);
                this.method1090();
                var3 += 256;
            }
            if (var1 > this.field1188) {
                if (this.field1189) {
                    this.field1189 = false;
                } else if (this.field1183 == 0 && this.field1177 == 0) {
                    this.method1093();
                    this.field1184 = var1 + 2000L;
                    return;
                } else {
                    this.field1176 = Math.min(this.field1177, this.field1183);
                    this.field1177 = this.field1183;
                }
                this.field1183 = 0;
                this.field1188 = var1 + 2000L;
            }
            this.field1187 = var3;
        } catch (Exception var8) {
            this.method1093();
            this.field1184 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1180 + 500000L) {
                var1 = this.field1180;
            }
            while (var1 > this.field1180 + 5000L) {
                this.method1159(256);
                this.field1180 += (long) (256000 / Statics.field2644);
            }
        } catch (Exception var7) {
            this.field1180 = var1;
        }
    }

    @ObfuscatedName("bk.ah(I)V")
    public final void method1156() {
        this.field1189 = true;
    }

    @ObfuscatedName("bk.aa(B)V")
    public final synchronized void method1163() {
        this.field1189 = true;
        try {
            this.method1107();
        } catch (Exception var2) {
            this.method1093();
            this.field1184 = class115.method671() + 2000L;
        }
    }

    @ObfuscatedName("bk.ao(I)V")
    public final synchronized void method1177() {
        if (Statics.field1352 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1352.field1349[var2] == this) {
                    Statics.field1352.field1349[var2] = null;
                }
                if (Statics.field1352.field1349[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1352.field1357 = true;
                while (Statics.field1352.field1356) {
                    class127.method1535(50L);
                }
                Statics.field1352 = null;
            }
        }
        this.method1093();
        this.field1196 = null;
    }

    @ObfuscatedName("bk.ai(IB)V")
    public final void method1159(int arg0) {
        this.field1182 -= arg0;
        if (this.field1182 < 0) {
            this.field1182 = 0;
        }
        if (this.field1185 != null) {
            this.field1185.method1134(arg0);
        }
    }

    @ObfuscatedName("bk.ab([II)V")
    public final void method1165(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1178) {
            var3 = arg1 << 1;
        }
        class120.method2546(arg0, 0, var3);
        this.field1182 -= arg1;
        if (this.field1185 != null && this.field1182 <= 0) {
            this.field1182 += Statics.field2644 >> 4;
            method1553(this.field1185);
            this.method1173(this.field1185, this.field1185.method1309());
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
                        class67 var11 = this.field1186[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1266;
                                if (var12 == null || var12.field1263 <= var8) {
                                    var11.field1264 = true;
                                    int var13 = var11.method1145();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1263 += var13;
                                    }
                                    if (var4 >= this.field1179) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1123();
                                    if (var14 != null) {
                                        int var15 = var11.field1267;
                                        while (var14 != null) {
                                            this.method1173(var14, var15 * var14.method1309() >> 8);
                                            var14 = var11.method1118();
                                        }
                                    }
                                    class67 var16 = var11.field1265;
                                    var11.field1265 = null;
                                    if (var10 == null) {
                                        this.field1186[var7] = var16;
                                    } else {
                                        var10.field1265 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1192[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1265;
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
                class67 var18 = this.field1186[var17];
                class67[] var19 = this.field1186;
                this.field1192[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1265;
                    var18.field1265 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1182 < 0) {
            this.field1182 = 0;
        }
        if (this.field1185 != null) {
            this.field1185.method1119(arg0, 0, arg1);
        }
        this.field1180 = class115.method671();
    }

    @ObfuscatedName("bx.ae(Lbs;S)V")
    public static final void method1553(class67 arg0) {
        arg0.field1264 = false;
        if (arg0.field1266 != null) {
            arg0.field1266.field1263 = 0;
        }
        for (class67 var1 = arg0.method1123(); var1 != null; var1 = arg0.method1118()) {
            method1553(var1);
        }
    }

    @ObfuscatedName("bk.aw(Lbs;IS)V")
    public final void method1173(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1192[var3];
        if (var4 == null) {
            this.field1186[var3] = arg0;
        } else {
            var4.field1265 = arg0;
        }
        this.field1192[var3] = arg0;
        arg0.field1267 = arg1;
    }

    @ObfuscatedName("bk.y(Ljava/awt/Component;)V")
    public void method1101(Component arg0) throws Exception {
    }

    @ObfuscatedName("bk.d(I)V")
    public void method1106(int arg0) throws Exception {
    }

    @ObfuscatedName("bk.g()I")
    public int method1110() throws Exception {
        return this.field1181;
    }

    @ObfuscatedName("bk.w()V")
    public void method1090() throws Exception {
    }

    @ObfuscatedName("bk.e()V")
    public void method1093() {
    }

    @ObfuscatedName("bk.c()V")
    public void method1107() throws Exception {
    }
}
