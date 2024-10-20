package deob;

import java.awt.Component;

@ObfuscatedName("bk")
public class class57 {

    @ObfuscatedName("bk.l")
    public int[] field1203;

    @ObfuscatedName("bk.i")
    public class67 field1184;

    @ObfuscatedName("bk.w")
    public int field1185 = 32;

    @ObfuscatedName("bk.v")
    public long field1186 = class115.method645();

    @ObfuscatedName("bk.o")
    public int field1187;

    @ObfuscatedName("bk.p")
    public int field1182;

    @ObfuscatedName("bk.b")
    public int field1191;

    @ObfuscatedName("bk.z")
    public long field1190 = 0L;

    @ObfuscatedName("bk.k")
    public int field1196 = 0;

    @ObfuscatedName("bk.r")
    public int field1192 = 0;

    @ObfuscatedName("bk.d")
    public int field1179 = 0;

    @ObfuscatedName("bk.u")
    public long field1194 = 0L;

    @ObfuscatedName("bk.a")
    public boolean field1200 = true;

    @ObfuscatedName("bk.ab")
    public int field1193 = 0;

    @ObfuscatedName("bk.au")
    public class67[] field1197 = new class67[8];

    @ObfuscatedName("bk.ae")
    public class67[] field1198 = new class67[8];

    @ObfuscatedName("w.r(Lez;Ljava/awt/Component;IIS)Lbk;")
    public static final class57 method133(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field3153 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1203 = new int[(Statics.field1195 ? 2 : 1) * 256];
                var4.field1182 = arg3;
                var4.method1102(arg1);
                var4.field1187 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1187 > 16384) {
                    var4.field1187 = 16384;
                }
                var4.method1103(var4.field1187);
                if (Statics.field1180 > 0 && Statics.field1181 == null) {
                    Statics.field1181 = new class73();
                    Statics.field1181.field1364 = arg0;
                    arg0.method2714(Statics.field1181, Statics.field1180);
                }
                if (Statics.field1181 != null) {
                    if (Statics.field1181.field1359[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1181.field1359[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1203 = new int[256 * (Statics.field1195 ? 2 : 1)];
                    var6.field1182 = arg3;
                    var6.method1102(arg1);
                    var6.field1187 = 16384;
                    var6.method1103(var6.field1187);
                    if (Statics.field1180 > 0 && Statics.field1181 == null) {
                        Statics.field1181 = new class73();
                        Statics.field1181.field1364 = arg0;
                        arg0.method2714(Statics.field1181, Statics.field1180);
                    }
                    if (Statics.field1181 != null) {
                        if (Statics.field1181.field1359[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1181.field1359[arg2] = var6;
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

    @ObfuscatedName("bk.d(Lbm;I)V")
    public final synchronized void method1163(class67 arg0) {
        this.field1184 = arg0;
    }

    @ObfuscatedName("bk.u(I)V")
    public final synchronized void method1165() {
        if (this.field1203 == null) {
            return;
        }
        long var1 = class115.method645();
        try {
            if (this.field1190 != 0L) {
                if (var1 < this.field1190) {
                    return;
                }
                this.method1103(this.field1187);
                this.field1190 = 0L;
                this.field1200 = true;
            }
            int var3 = this.method1104();
            if (this.field1179 - var3 > this.field1196) {
                this.field1196 = this.field1179 - var3;
            }
            int var4 = this.field1191 + this.field1182;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1187) {
                this.field1187 += 1024;
                if (this.field1187 > 16384) {
                    this.field1187 = 16384;
                }
                this.method1105();
                this.method1103(this.field1187);
                var3 = 0;
                this.field1200 = true;
                if (var4 + 256 > this.field1187) {
                    var4 = this.field1187 - 256;
                    this.field1191 = var4 - this.field1182;
                }
            }
            while (var3 < var4) {
                this.method1170(this.field1203, 256);
                this.method1113();
                var3 += 256;
            }
            if (var1 > this.field1194) {
                if (this.field1200) {
                    this.field1200 = false;
                } else if (this.field1196 == 0 && this.field1192 == 0) {
                    this.method1105();
                    this.field1190 = var1 + 2000L;
                    return;
                } else {
                    this.field1191 = Math.min(this.field1192, this.field1196);
                    this.field1192 = this.field1196;
                }
                this.field1196 = 0;
                this.field1194 = var1 + 2000L;
            }
            this.field1179 = var3;
        } catch (Exception var8) {
            this.method1105();
            this.field1190 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1186 + 500000L) {
                var1 = this.field1186;
            }
            while (var1 > this.field1186 + 5000L) {
                this.method1187(256);
                this.field1186 += (long) (256000 / Statics.field3153);
            }
        } catch (Exception var7) {
            this.field1186 = var1;
        }
    }

    @ObfuscatedName("bk.a(I)V")
    public final void method1166() {
        this.field1200 = true;
    }

    @ObfuscatedName("bk.x(I)V")
    public final synchronized void method1167() {
        this.field1200 = true;
        try {
            this.method1106();
        } catch (Exception var2) {
            this.method1105();
            this.field1190 = class115.method645() + 2000L;
        }
    }

    @ObfuscatedName("bk.y(I)V")
    public final synchronized void method1168() {
        if (Statics.field1181 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1181.field1359[var2] == this) {
                    Statics.field1181.field1359[var2] = null;
                }
                if (Statics.field1181.field1359[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1181.field1355 = true;
                while (Statics.field1181.field1356) {
                    class127.method1962(50L);
                }
                Statics.field1181 = null;
            }
        }
        this.method1105();
        this.field1203 = null;
    }

    @ObfuscatedName("bk.c(II)V")
    public final void method1187(int arg0) {
        this.field1193 -= arg0;
        if (this.field1193 < 0) {
            this.field1193 = 0;
        }
        if (this.field1184 != null) {
            this.field1184.method1118(arg0);
        }
    }

    @ObfuscatedName("bk.h([II)V")
    public final void method1170(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1195) {
            var3 = arg1 << 1;
        }
        class120.method2566(arg0, 0, var3);
        this.field1193 -= arg1;
        if (this.field1184 != null && this.field1193 <= 0) {
            this.field1193 += Statics.field3153 >> 4;
            method881(this.field1184);
            this.method1173(this.field1184, this.field1184.method1384());
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
                        class67 var11 = this.field1197[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1269;
                                if (var12 == null || var12.field1268 <= var8) {
                                    var11.field1270 = true;
                                    int var13 = var11.method1132();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1268 += var13;
                                    }
                                    if (var4 >= this.field1185) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1155();
                                    if (var14 != null) {
                                        int var15 = var11.field1271;
                                        while (var14 != null) {
                                            this.method1173(var14, var15 * var14.method1384() >> 8);
                                            var14 = var11.method1125();
                                        }
                                    }
                                    class67 var16 = var11.field1272;
                                    var11.field1272 = null;
                                    if (var10 == null) {
                                        this.field1197[var7] = var16;
                                    } else {
                                        var10.field1272 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1198[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1272;
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
                class67 var18 = this.field1197[var17];
                class67[] var19 = this.field1197;
                this.field1198[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1272;
                    var18.field1272 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1193 < 0) {
            this.field1193 = 0;
        }
        if (this.field1184 != null) {
            this.field1184.method1124(arg0, 0, arg1);
        }
        this.field1186 = class115.method645();
    }

    @ObfuscatedName("ai.e(Lbm;I)V")
    public static final void method881(class67 arg0) {
        arg0.field1270 = false;
        if (arg0.field1269 != null) {
            arg0.field1269.field1268 = 0;
        }
        for (class67 var1 = arg0.method1155(); var1 != null; var1 = arg0.method1125()) {
            method881(var1);
        }
    }

    @ObfuscatedName("bk.ab(Lbm;II)V")
    public final void method1173(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1198[var3];
        if (var4 == null) {
            this.field1197[var3] = arg0;
        } else {
            var4.field1272 = arg0;
        }
        this.field1198[var3] = arg0;
        arg0.field1271 = arg1;
    }

    @ObfuscatedName("bk.f(Ljava/awt/Component;)V")
    public void method1102(Component arg0) throws Exception {
    }

    @ObfuscatedName("bk.s(I)V")
    public void method1103(int arg0) throws Exception {
    }

    @ObfuscatedName("bk.q()I")
    public int method1104() throws Exception {
        return this.field1187;
    }

    @ObfuscatedName("bk.g()V")
    public void method1113() throws Exception {
    }

    @ObfuscatedName("bk.m()V")
    public void method1105() {
    }

    @ObfuscatedName("bk.t()V")
    public void method1106() throws Exception {
    }
}
