package deob;

import java.awt.Component;

@ObfuscatedName("bq")
public class class57 {

    @ObfuscatedName("bq.n")
    public int[] field1201;

    @ObfuscatedName("bq.k")
    public class67 field1186;

    @ObfuscatedName("bq.r")
    public int field1187 = 32;

    @ObfuscatedName("bq.b")
    public long field1188 = class115.method2249();

    @ObfuscatedName("bq.q")
    public int field1189;

    @ObfuscatedName("bq.u")
    public int field1200;

    @ObfuscatedName("bq.g")
    public int field1191;

    @ObfuscatedName("bq.y")
    public long field1195 = 0L;

    @ObfuscatedName("bq.s")
    public int field1193 = 0;

    @ObfuscatedName("bq.d")
    public int field1185 = 0;

    @ObfuscatedName("bq.z")
    public int field1194 = 0;

    @ObfuscatedName("bq.p")
    public long field1196 = 0L;

    @ObfuscatedName("bq.w")
    public boolean field1198 = true;

    @ObfuscatedName("bq.ab")
    public int field1199 = 0;

    @ObfuscatedName("bq.ak")
    public class67[] field1205 = new class67[8];

    @ObfuscatedName("bq.am")
    public class67[] field1190 = new class67[8];

    @ObfuscatedName("ey.c(Lea;Ljava/awt/Component;IIS)Lbq;")
    public static final class57 method2773(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1781 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1201 = new int[256 * (Statics.field1192 ? 2 : 1)];
                var4.field1200 = arg3;
                var4.method1106(arg1);
                var4.field1189 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1189 > 16384) {
                    var4.field1189 = 16384;
                }
                var4.method1099(var4.field1189);
                if (Statics.field1197 > 0 && Statics.field1184 == null) {
                    Statics.field1184 = new class73();
                    Statics.field1184.field1361 = arg0;
                    arg0.method2689(Statics.field1184, Statics.field1197);
                }
                if (Statics.field1184 != null) {
                    if (Statics.field1184.field1360[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1184.field1360[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1201 = new int[(Statics.field1192 ? 2 : 1) * 256];
                    var6.field1200 = arg3;
                    var6.method1106(arg1);
                    var6.field1189 = 16384;
                    var6.method1099(var6.field1189);
                    if (Statics.field1197 > 0 && Statics.field1184 == null) {
                        Statics.field1184 = new class73();
                        Statics.field1184.field1361 = arg0;
                        arg0.method2689(Statics.field1184, Statics.field1197);
                    }
                    if (Statics.field1184 != null) {
                        if (Statics.field1184.field1360[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1184.field1360[arg2] = var6;
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

    @ObfuscatedName("bq.x(Lbf;I)V")
    public final synchronized void method1164(class67 arg0) {
        this.field1186 = arg0;
    }

    @ObfuscatedName("bq.e(B)V")
    public final synchronized void method1159() {
        if (this.field1201 == null) {
            return;
        }
        long var1 = class115.method2249();
        try {
            if (this.field1195 != 0L) {
                if (var1 < this.field1195) {
                    return;
                }
                this.method1099(this.field1189);
                this.field1195 = 0L;
                this.field1198 = true;
            }
            int var3 = this.method1101();
            if (this.field1194 - var3 > this.field1193) {
                this.field1193 = this.field1194 - var3;
            }
            int var4 = this.field1200 + this.field1191;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1189) {
                this.field1189 += 1024;
                if (this.field1189 > 16384) {
                    this.field1189 = 16384;
                }
                this.method1102();
                this.method1099(this.field1189);
                var3 = 0;
                this.field1198 = true;
                if (var4 + 256 > this.field1189) {
                    var4 = this.field1189 - 256;
                    this.field1191 = var4 - this.field1200;
                }
            }
            while (var3 < var4) {
                this.method1165(this.field1201, 256);
                this.method1107();
                var3 += 256;
            }
            if (var1 > this.field1196) {
                if (this.field1198) {
                    this.field1198 = false;
                } else if (this.field1193 == 0 && this.field1185 == 0) {
                    this.method1102();
                    this.field1195 = var1 + 2000L;
                    return;
                } else {
                    this.field1191 = Math.min(this.field1185, this.field1193);
                    this.field1185 = this.field1193;
                }
                this.field1193 = 0;
                this.field1196 = var1 + 2000L;
            }
            this.field1194 = var3;
        } catch (Exception var8) {
            this.method1102();
            this.field1195 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1188 + 500000L) {
                var1 = this.field1188;
            }
            while (var1 > this.field1188 + 5000L) {
                this.method1162(256);
                this.field1188 += (long) (256000 / Statics.field1781);
            }
        } catch (Exception var7) {
            this.field1188 = var1;
        }
    }

    @ObfuscatedName("bq.v(B)V")
    public final void method1167() {
        this.field1198 = true;
    }

    @ObfuscatedName("bq.ab(I)V")
    public final synchronized void method1160() {
        this.field1198 = true;
        try {
            this.method1103();
        } catch (Exception var2) {
            this.method1102();
            this.field1195 = class115.method2249() + 2000L;
        }
    }

    @ObfuscatedName("bq.ak(I)V")
    public final synchronized void method1161() {
        if (Statics.field1184 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1184.field1360[var2] == this) {
                    Statics.field1184.field1360[var2] = null;
                }
                if (Statics.field1184.field1360[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1184.field1358 = true;
                while (Statics.field1184.field1359) {
                    class127.method2202(50L);
                }
                Statics.field1184 = null;
            }
        }
        this.method1102();
        this.field1201 = null;
    }

    @ObfuscatedName("bq.am(IB)V")
    public final void method1162(int arg0) {
        this.field1199 -= arg0;
        if (this.field1199 < 0) {
            this.field1199 = 0;
        }
        if (this.field1186 != null) {
            this.field1186.method1131(arg0);
        }
    }

    @ObfuscatedName("bq.aw([II)V")
    public final void method1165(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1192) {
            var3 = arg1 << 1;
        }
        class120.method2539(arg0, 0, var3);
        this.field1199 -= arg1;
        if (this.field1186 != null && this.field1199 <= 0) {
            this.field1199 += Statics.field1781 >> 4;
            method979(this.field1186);
            this.method1163(this.field1186, this.field1186.method1262());
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
                        class67 var11 = this.field1205[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1273;
                                if (var12 == null || var12.field1271 <= var8) {
                                    var11.field1274 = true;
                                    int var13 = var11.method1121();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1271 += var13;
                                    }
                                    if (var4 >= this.field1187) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1126();
                                    if (var14 != null) {
                                        int var15 = var11.field1272;
                                        while (var14 != null) {
                                            this.method1163(var14, var15 * var14.method1262() >> 8);
                                            var14 = var11.method1138();
                                        }
                                    }
                                    class67 var16 = var11.field1275;
                                    var11.field1275 = null;
                                    if (var10 == null) {
                                        this.field1205[var7] = var16;
                                    } else {
                                        var10.field1275 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1190[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1275;
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
                class67 var18 = this.field1205[var17];
                class67[] var19 = this.field1205;
                this.field1190[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1275;
                    var18.field1275 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1199 < 0) {
            this.field1199 = 0;
        }
        if (this.field1186 != null) {
            this.field1186.method1129(arg0, 0, arg1);
        }
        this.field1188 = class115.method2249();
    }

    @ObfuscatedName("ay.az(Lbf;I)V")
    public static final void method979(class67 arg0) {
        arg0.field1274 = false;
        if (arg0.field1273 != null) {
            arg0.field1273.field1271 = 0;
        }
        for (class67 var1 = arg0.method1126(); var1 != null; var1 = arg0.method1138()) {
            method979(var1);
        }
    }

    @ObfuscatedName("bq.ac(Lbf;IS)V")
    public final void method1163(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1190[var3];
        if (var4 == null) {
            this.field1205[var3] = arg0;
        } else {
            var4.field1275 = arg0;
        }
        this.field1190[var3] = arg0;
        arg0.field1272 = arg1;
    }

    @ObfuscatedName("bq.j(Ljava/awt/Component;)V")
    public void method1106(Component arg0) throws Exception {
    }

    @ObfuscatedName("bq.l(I)V")
    public void method1099(int arg0) throws Exception {
    }

    @ObfuscatedName("bq.a()I")
    public int method1101() throws Exception {
        return this.field1189;
    }

    @ObfuscatedName("bq.i()V")
    public void method1107() throws Exception {
    }

    @ObfuscatedName("bq.f()V")
    public void method1102() {
    }

    @ObfuscatedName("bq.m()V")
    public void method1103() throws Exception {
    }
}
