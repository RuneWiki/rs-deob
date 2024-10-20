package deob;

import java.awt.Component;

@ObfuscatedName("bj")
public class class57 {

    @ObfuscatedName("bj.h")
    public int[] field1182;

    @ObfuscatedName("bj.n")
    public class67 field1177;

    @ObfuscatedName("bj.j")
    public int field1178 = 32;

    @ObfuscatedName("bj.a")
    public long field1179 = class115.method82();

    @ObfuscatedName("bj.b")
    public int field1180;

    @ObfuscatedName("bj.c")
    public int field1181;

    @ObfuscatedName("bj.v")
    public int field1172;

    @ObfuscatedName("bj.p")
    public long field1183 = 0L;

    @ObfuscatedName("bj.i")
    public int field1192 = 0;

    @ObfuscatedName("bj.t")
    public int field1185 = 0;

    @ObfuscatedName("bj.u")
    public int field1186 = 0;

    @ObfuscatedName("bj.e")
    public long field1187 = 0L;

    @ObfuscatedName("bj.m")
    public boolean field1184 = true;

    @ObfuscatedName("bj.aw")
    public int field1190 = 0;

    @ObfuscatedName("bj.an")
    public class67[] field1197 = new class67[8];

    @ObfuscatedName("bj.ab")
    public class67[] field1176 = new class67[8];

    @ObfuscatedName("dk.s(Ley;Ljava/awt/Component;IIB)Lbj;")
    public static final class57 method2589(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1194 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1182 = new int[256 * (Statics.field1173 ? 2 : 1)];
                var4.field1181 = arg3;
                var4.method1072(arg1);
                var4.field1180 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1180 > 16384) {
                    var4.field1180 = 16384;
                }
                var4.method1071(var4.field1180);
                if (Statics.field576 > 0 && Statics.field2881 == null) {
                    Statics.field2881 = new class73();
                    Statics.field2881.field1349 = arg0;
                    arg0.method2675(Statics.field2881, Statics.field576);
                }
                if (Statics.field2881 != null) {
                    if (Statics.field2881.field1345[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2881.field1345[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1182 = new int[256 * (Statics.field1173 ? 2 : 1)];
                    var6.field1181 = arg3;
                    var6.method1072(arg1);
                    var6.field1180 = 16384;
                    var6.method1071(var6.field1180);
                    if (Statics.field576 > 0 && Statics.field2881 == null) {
                        Statics.field2881 = new class73();
                        Statics.field2881.field1349 = arg0;
                        arg0.method2675(Statics.field2881, Statics.field576);
                    }
                    if (Statics.field2881 != null) {
                        if (Statics.field2881.field1345[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2881.field1345[arg2] = var6;
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

    @ObfuscatedName("bj.x(Lbt;B)V")
    public final synchronized void method1146(class67 arg0) {
        this.field1177 = arg0;
    }

    @ObfuscatedName("bj.y(I)V")
    public final synchronized void method1135() {
        if (this.field1182 == null) {
            return;
        }
        long var1 = class115.method82();
        try {
            if (this.field1183 != 0L) {
                if (var1 < this.field1183) {
                    return;
                }
                this.method1071(this.field1180);
                this.field1183 = 0L;
                this.field1184 = true;
            }
            int var3 = this.method1091();
            if (this.field1186 - var3 > this.field1192) {
                this.field1192 = this.field1186 - var3;
            }
            int var4 = this.field1181 + this.field1172;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1180) {
                this.field1180 += 1024;
                if (this.field1180 > 16384) {
                    this.field1180 = 16384;
                }
                this.method1074();
                this.method1071(this.field1180);
                var3 = 0;
                this.field1184 = true;
                if (var4 + 256 > this.field1180) {
                    var4 = this.field1180 - 256;
                    this.field1172 = var4 - this.field1181;
                }
            }
            while (var3 < var4) {
                this.method1129(this.field1182, 256);
                this.method1087();
                var3 += 256;
            }
            if (var1 > this.field1187) {
                if (this.field1184) {
                    this.field1184 = false;
                } else if (this.field1192 == 0 && this.field1185 == 0) {
                    this.method1074();
                    this.field1183 = var1 + 2000L;
                    return;
                } else {
                    this.field1172 = Math.min(this.field1185, this.field1192);
                    this.field1185 = this.field1192;
                }
                this.field1192 = 0;
                this.field1187 = var1 + 2000L;
            }
            this.field1186 = var3;
        } catch (Exception var8) {
            this.method1074();
            this.field1183 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1179 + 500000L) {
                var1 = this.field1179;
            }
            while (var1 > this.field1179 + 5000L) {
                this.method1137(256);
                this.field1179 += (long) (256000 / Statics.field1194);
            }
        } catch (Exception var7) {
            this.field1179 = var1;
        }
    }

    @ObfuscatedName("bj.w(I)V")
    public final void method1132() {
        this.field1184 = true;
    }

    @ObfuscatedName("bj.o(I)V")
    public final synchronized void method1144() {
        this.field1184 = true;
        try {
            this.method1076();
        } catch (Exception var2) {
            this.method1074();
            this.field1183 = class115.method82() + 2000L;
        }
    }

    @ObfuscatedName("bj.aw(B)V")
    public final synchronized void method1148() {
        if (Statics.field2881 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2881.field1345[var2] == this) {
                    Statics.field2881.field1345[var2] = null;
                }
                if (Statics.field2881.field1345[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2881.field1346 = true;
                while (Statics.field2881.field1347) {
                    class127.method712(50L);
                }
                Statics.field2881 = null;
            }
        }
        this.method1074();
        this.field1182 = null;
    }

    @ObfuscatedName("bj.an(II)V")
    public final void method1137(int arg0) {
        this.field1190 -= arg0;
        if (this.field1190 < 0) {
            this.field1190 = 0;
        }
        if (this.field1177 != null) {
            this.field1177.method1123(arg0);
        }
    }

    @ObfuscatedName("bj.ab([II)V")
    public final void method1129(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1173) {
            var3 = arg1 << 1;
        }
        class120.method2513(arg0, 0, var3);
        this.field1190 -= arg1;
        if (this.field1177 != null && this.field1190 <= 0) {
            this.field1190 += Statics.field1194 >> 4;
            method2636(this.field1177);
            this.method1154(this.field1177, this.field1177.method1231());
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
                                class66 var12 = var11.field1262;
                                if (var12 == null || var12.field1259 <= var8) {
                                    var11.field1261 = true;
                                    int var13 = var11.method1100();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1259 += var13;
                                    }
                                    if (var4 >= this.field1178) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1098();
                                    if (var14 != null) {
                                        int var15 = var11.field1260;
                                        while (var14 != null) {
                                            this.method1154(var14, var15 * var14.method1231() >> 8);
                                            var14 = var11.method1103();
                                        }
                                    }
                                    class67 var16 = var11.field1263;
                                    var11.field1263 = null;
                                    if (var10 == null) {
                                        this.field1197[var7] = var16;
                                    } else {
                                        var10.field1263 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1176[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1263;
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
                this.field1176[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1263;
                    var18.field1263 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1190 < 0) {
            this.field1190 = 0;
        }
        if (this.field1177 != null) {
            this.field1177.method1113(arg0, 0, arg1);
        }
        this.field1179 = class115.method82();
    }

    @ObfuscatedName("ep.al(Lbt;I)V")
    public static final void method2636(class67 arg0) {
        arg0.field1261 = false;
        if (arg0.field1262 != null) {
            arg0.field1262.field1259 = 0;
        }
        for (class67 var1 = arg0.method1098(); var1 != null; var1 = arg0.method1103()) {
            method2636(var1);
        }
    }

    @ObfuscatedName("bj.ay(Lbt;IB)V")
    public final void method1154(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1176[var3];
        if (var4 == null) {
            this.field1197[var3] = arg0;
        } else {
            var4.field1263 = arg0;
        }
        this.field1176[var3] = arg0;
        arg0.field1260 = arg1;
    }

    @ObfuscatedName("bj.z(Ljava/awt/Component;)V")
    public void method1072(Component arg0) throws Exception {
    }

    @ObfuscatedName("bj.q(I)V")
    public void method1071(int arg0) throws Exception {
    }

    @ObfuscatedName("bj.k()I")
    public int method1091() throws Exception {
        return this.field1180;
    }

    @ObfuscatedName("bj.f()V")
    public void method1087() throws Exception {
    }

    @ObfuscatedName("bj.d()V")
    public void method1074() {
    }

    @ObfuscatedName("bj.l()V")
    public void method1076() throws Exception {
    }
}
