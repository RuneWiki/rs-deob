package deob;

import java.awt.Component;

@ObfuscatedName("bc")
public class class57 {

    @ObfuscatedName("bc.a")
    public int[] field1185;

    @ObfuscatedName("bc.y")
    public class67 field1175;

    @ObfuscatedName("bc.h")
    public int field1176 = 32;

    @ObfuscatedName("bc.z")
    public long field1177 = class115.method819();

    @ObfuscatedName("bc.w")
    public int field1178;

    @ObfuscatedName("bc.l")
    public int field1179;

    @ObfuscatedName("bc.q")
    public int field1174;

    @ObfuscatedName("bc.x")
    public long field1180 = 0L;

    @ObfuscatedName("bc.s")
    public int field1182 = 0;

    @ObfuscatedName("bc.n")
    public int field1183 = 0;

    @ObfuscatedName("bc.u")
    public int field1190 = 0;

    @ObfuscatedName("bc.m")
    public long field1184 = 0L;

    @ObfuscatedName("bc.e")
    public boolean field1186 = true;

    @ObfuscatedName("bc.ad")
    public int field1181 = 0;

    @ObfuscatedName("bc.ak")
    public class67[] field1189 = new class67[8];

    @ObfuscatedName("bc.ai")
    public class67[] field1188 = new class67[8];

    @ObfuscatedName("ao.t(IZIB)V")
    public static final void method827(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1170 = arg0;
        Statics.field1171 = arg1;
        Statics.field1172 = arg2;
    }

    @ObfuscatedName("n.g(Led;Ljava/awt/Component;III)Lbc;")
    public static final class57 method194(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1170 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1185 = new int[(Statics.field1171 ? 2 : 1) * 256];
                var4.field1179 = arg3;
                var4.method1088(arg1);
                var4.field1178 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1178 > 16384) {
                    var4.field1178 = 16384;
                }
                var4.method1108(var4.field1178);
                if (Statics.field1172 > 0 && Statics.field1173 == null) {
                    Statics.field1173 = new class73();
                    Statics.field1173.field1351 = arg0;
                    arg0.method2718(Statics.field1173, Statics.field1172);
                }
                if (Statics.field1173 != null) {
                    if (Statics.field1173.field1347[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1173.field1347[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1185 = new int[256 * (Statics.field1171 ? 2 : 1)];
                    var6.field1179 = arg3;
                    var6.method1088(arg1);
                    var6.field1178 = 16384;
                    var6.method1108(var6.field1178);
                    if (Statics.field1172 > 0 && Statics.field1173 == null) {
                        Statics.field1173 = new class73();
                        Statics.field1173.field1351 = arg0;
                        arg0.method2718(Statics.field1173, Statics.field1172);
                    }
                    if (Statics.field1173 != null) {
                        if (Statics.field1173.field1347[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1173.field1347[arg2] = var6;
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

    @ObfuscatedName("bc.af(Lbk;I)V")
    public final synchronized void method1155(class67 arg0) {
        this.field1175 = arg0;
    }

    @ObfuscatedName("bc.ad(I)V")
    public final synchronized void method1156() {
        if (this.field1185 == null) {
            return;
        }
        long var1 = class115.method819();
        try {
            if (this.field1180 != 0L) {
                if (var1 < this.field1180) {
                    return;
                }
                this.method1108(this.field1178);
                this.field1180 = 0L;
                this.field1186 = true;
            }
            int var3 = this.method1100();
            if (this.field1190 - var3 > this.field1182) {
                this.field1182 = this.field1190 - var3;
            }
            int var4 = this.field1179 + this.field1174;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1178) {
                this.field1178 += 1024;
                if (this.field1178 > 16384) {
                    this.field1178 = 16384;
                }
                this.method1092();
                this.method1108(this.field1178);
                var3 = 0;
                this.field1186 = true;
                if (var4 + 256 > this.field1178) {
                    var4 = this.field1178 - 256;
                    this.field1174 = var4 - this.field1179;
                }
            }
            while (var3 < var4) {
                this.method1160(this.field1185, 256);
                this.method1091();
                var3 += 256;
            }
            if (var1 > this.field1184) {
                if (this.field1186) {
                    this.field1186 = false;
                } else if (this.field1182 == 0 && this.field1183 == 0) {
                    this.method1092();
                    this.field1180 = var1 + 2000L;
                    return;
                } else {
                    this.field1174 = Math.min(this.field1183, this.field1182);
                    this.field1183 = this.field1182;
                }
                this.field1182 = 0;
                this.field1184 = var1 + 2000L;
            }
            this.field1190 = var3;
        } catch (Exception var8) {
            this.method1092();
            this.field1180 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1177 + 500000L) {
                var1 = this.field1177;
            }
            while (var1 > this.field1177 + 5000L) {
                this.method1176(256);
                this.field1177 += (long) (256000 / Statics.field1170);
            }
        } catch (Exception var7) {
            this.field1177 = var1;
        }
    }

    @ObfuscatedName("bc.ak(I)V")
    public final void method1170() {
        this.field1186 = true;
    }

    @ObfuscatedName("bc.ai(S)V")
    public final synchronized void method1158() {
        this.field1186 = true;
        try {
            this.method1096();
        } catch (Exception var2) {
            this.method1092();
            this.field1180 = class115.method819() + 2000L;
        }
    }

    @ObfuscatedName("bc.au(S)V")
    public final synchronized void method1159() {
        if (Statics.field1173 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1173.field1347[var2] == this) {
                    Statics.field1173.field1347[var2] = null;
                }
                if (Statics.field1173.field1347[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1173.field1354 = true;
                while (Statics.field1173.field1348) {
                    class127.method2134(50L);
                }
                Statics.field1173 = null;
            }
        }
        this.method1092();
        this.field1185 = null;
    }

    @ObfuscatedName("bc.ar(II)V")
    public final void method1176(int arg0) {
        this.field1181 -= arg0;
        if (this.field1181 < 0) {
            this.field1181 = 0;
        }
        if (this.field1175 != null) {
            this.field1175.method1122(arg0);
        }
    }

    @ObfuscatedName("bc.aw([II)V")
    public final void method1160(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1171) {
            var3 = arg1 << 1;
        }
        class120.method2570(arg0, 0, var3);
        this.field1181 -= arg1;
        if (this.field1175 != null && this.field1181 <= 0) {
            this.field1181 += Statics.field1170 >> 4;
            method196(this.field1175);
            this.method1162(this.field1175, this.field1175.method1272());
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
                        class67 var11 = this.field1189[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1261;
                                if (var12 == null || var12.field1260 <= var8) {
                                    var11.field1264 = true;
                                    int var13 = var11.method1119();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1260 += var13;
                                    }
                                    if (var4 >= this.field1176) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1139();
                                    if (var14 != null) {
                                        int var15 = var11.field1262;
                                        while (var14 != null) {
                                            this.method1162(var14, var15 * var14.method1272() >> 8);
                                            var14 = var11.method1118();
                                        }
                                    }
                                    class67 var16 = var11.field1263;
                                    var11.field1263 = null;
                                    if (var10 == null) {
                                        this.field1189[var7] = var16;
                                    } else {
                                        var10.field1263 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1188[var7] = var10;
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
                class67 var18 = this.field1189[var17];
                class67[] var19 = this.field1189;
                this.field1188[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1263;
                    var18.field1263 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1181 < 0) {
            this.field1181 = 0;
        }
        if (this.field1175 != null) {
            this.field1175.method1149(arg0, 0, arg1);
        }
        this.field1177 = class115.method819();
    }

    @ObfuscatedName("n.at(Lbk;B)V")
    public static final void method196(class67 arg0) {
        arg0.field1264 = false;
        if (arg0.field1261 != null) {
            arg0.field1261.field1260 = 0;
        }
        for (class67 var1 = arg0.method1139(); var1 != null; var1 = arg0.method1118()) {
            method196(var1);
        }
    }

    @ObfuscatedName("bc.al(Lbk;II)V")
    public final void method1162(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1188[var3];
        if (var4 == null) {
            this.field1189[var3] = arg0;
        } else {
            var4.field1263 = arg0;
        }
        this.field1188[var3] = arg0;
        arg0.field1262 = arg1;
    }

    @ObfuscatedName("bc.v(Ljava/awt/Component;)V")
    public void method1088(Component arg0) throws Exception {
    }

    @ObfuscatedName("bc.f(I)V")
    public void method1108(int arg0) throws Exception {
    }

    @ObfuscatedName("bc.i()I")
    public int method1100() throws Exception {
        return this.field1178;
    }

    @ObfuscatedName("bc.d()V")
    public void method1091() throws Exception {
    }

    @ObfuscatedName("bc.o()V")
    public void method1092() {
    }

    @ObfuscatedName("bc.c()V")
    public void method1096() throws Exception {
    }
}
