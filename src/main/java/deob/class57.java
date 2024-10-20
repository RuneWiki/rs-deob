package deob;

import java.awt.Component;

@ObfuscatedName("bd")
public class class57 {

    @ObfuscatedName("bd.e")
    public int[] field1180;

    @ObfuscatedName("bd.b")
    public class67 field1181;

    @ObfuscatedName("bd.o")
    public int field1178 = 32;

    @ObfuscatedName("bd.m")
    public long field1183 = class115.method2142();

    @ObfuscatedName("bd.x")
    public int field1184;

    @ObfuscatedName("bd.k")
    public int field1185;

    @ObfuscatedName("bd.n")
    public int field1196;

    @ObfuscatedName("bd.j")
    public long field1187 = 0L;

    @ObfuscatedName("bd.t")
    public int field1188 = 0;

    @ObfuscatedName("bd.z")
    public int field1189 = 0;

    @ObfuscatedName("bd.h")
    public int field1190 = 0;

    @ObfuscatedName("bd.i")
    public long field1182 = 0L;

    @ObfuscatedName("bd.q")
    public boolean field1195 = true;

    @ObfuscatedName("bd.ae")
    public int field1191 = 0;

    @ObfuscatedName("bd.ao")
    public class67[] field1179 = new class67[8];

    @ObfuscatedName("bd.ak")
    public class67[] field1197 = new class67[8];

    @ObfuscatedName("d.z(Lef;Ljava/awt/Component;III)Lbd;")
    public static final class57 method2(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1177 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1180 = new int[(Statics.field1186 ? 2 : 1) * 256];
                var4.field1185 = arg3;
                var4.method1098(arg1);
                var4.field1184 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1184 > 16384) {
                    var4.field1184 = 16384;
                }
                var4.method1103(var4.field1184);
                if (Statics.field1193 > 0 && Statics.field1175 == null) {
                    Statics.field1175 = new class73();
                    Statics.field1175.field1349 = arg0;
                    arg0.method2762(Statics.field1175, Statics.field1193);
                }
                if (Statics.field1175 != null) {
                    if (Statics.field1175.field1350[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1175.field1350[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1180 = new int[256 * (Statics.field1186 ? 2 : 1)];
                    var6.field1185 = arg3;
                    var6.method1098(arg1);
                    var6.field1184 = 16384;
                    var6.method1103(var6.field1184);
                    if (Statics.field1193 > 0 && Statics.field1175 == null) {
                        Statics.field1175 = new class73();
                        Statics.field1175.field1349 = arg0;
                        arg0.method2762(Statics.field1175, Statics.field1193);
                    }
                    if (Statics.field1175 != null) {
                        if (Statics.field1175.field1350[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1175.field1350[arg2] = var6;
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

    @ObfuscatedName("bd.h(Lbz;I)V")
    public final synchronized void method1165(class67 arg0) {
        this.field1181 = arg0;
    }

    @ObfuscatedName("bd.i(I)V")
    public final synchronized void method1157() {
        if (this.field1180 == null) {
            return;
        }
        long var1 = class115.method2142();
        try {
            if (this.field1187 != 0L) {
                if (var1 < this.field1187) {
                    return;
                }
                this.method1103(this.field1184);
                this.field1187 = 0L;
                this.field1195 = true;
            }
            int var3 = this.method1101();
            if (this.field1190 - var3 > this.field1188) {
                this.field1188 = this.field1190 - var3;
            }
            int var4 = this.field1196 + this.field1185;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1184) {
                this.field1184 += 1024;
                if (this.field1184 > 16384) {
                    this.field1184 = 16384;
                }
                this.method1102();
                this.method1103(this.field1184);
                var3 = 0;
                this.field1195 = true;
                if (var4 + 256 > this.field1184) {
                    var4 = this.field1184 - 256;
                    this.field1196 = var4 - this.field1185;
                }
            }
            while (var3 < var4) {
                this.method1182(this.field1180, 256);
                this.method1110();
                var3 += 256;
            }
            if (var1 > this.field1182) {
                if (this.field1195) {
                    this.field1195 = false;
                } else if (this.field1188 == 0 && this.field1189 == 0) {
                    this.method1102();
                    this.field1187 = var1 + 2000L;
                    return;
                } else {
                    this.field1196 = Math.min(this.field1189, this.field1188);
                    this.field1189 = this.field1188;
                }
                this.field1188 = 0;
                this.field1182 = var1 + 2000L;
            }
            this.field1190 = var3;
        } catch (Exception var8) {
            this.method1102();
            this.field1187 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1183 + 500000L) {
                var1 = this.field1183;
            }
            while (var1 > this.field1183 + 5000L) {
                this.method1161(256);
                this.field1183 += (long) (256000 / Statics.field1177);
            }
        } catch (Exception var7) {
            this.field1183 = var1;
        }
    }

    @ObfuscatedName("bd.q(B)V")
    public final void method1167() {
        this.field1195 = true;
    }

    @ObfuscatedName("bd.r(B)V")
    public final synchronized void method1159() {
        this.field1195 = true;
        try {
            this.method1097();
        } catch (Exception var2) {
            this.method1102();
            this.field1187 = class115.method2142() + 2000L;
        }
    }

    @ObfuscatedName("bd.s(S)V")
    public final synchronized void method1160() {
        if (Statics.field1175 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1175.field1350[var2] == this) {
                    Statics.field1175.field1350[var2] = null;
                }
                if (Statics.field1175.field1350[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1175.field1351 = true;
                while (Statics.field1175.field1352) {
                    class127.method724(50L);
                }
                Statics.field1175 = null;
            }
        }
        this.method1102();
        this.field1180 = null;
    }

    @ObfuscatedName("bd.g(IB)V")
    public final void method1161(int arg0) {
        this.field1191 -= arg0;
        if (this.field1191 < 0) {
            this.field1191 = 0;
        }
        if (this.field1181 != null) {
            this.field1181.method1125(arg0);
        }
    }

    @ObfuscatedName("bd.f([II)V")
    public final void method1182(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1186) {
            var3 = arg1 << 1;
        }
        class120.method2578(arg0, 0, var3);
        this.field1191 -= arg1;
        if (this.field1181 != null && this.field1191 <= 0) {
            this.field1191 += Statics.field1177 >> 4;
            method2653(this.field1181);
            this.method1163(this.field1181, this.field1181.method1322());
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
                        class67 var11 = this.field1179[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1265;
                                if (var12 == null || var12.field1264 <= var8) {
                                    var11.field1268 = true;
                                    int var13 = var11.method1122();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1264 += var13;
                                    }
                                    if (var4 >= this.field1178) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1120();
                                    if (var14 != null) {
                                        int var15 = var11.field1267;
                                        while (var14 != null) {
                                            this.method1163(var14, var15 * var14.method1322() >> 8);
                                            var14 = var11.method1121();
                                        }
                                    }
                                    class67 var16 = var11.field1266;
                                    var11.field1266 = null;
                                    if (var10 == null) {
                                        this.field1179[var7] = var16;
                                    } else {
                                        var10.field1266 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1197[var7] = var10;
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
                class67 var18 = this.field1179[var17];
                class67[] var19 = this.field1179;
                this.field1197[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1266;
                    var18.field1266 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1191 < 0) {
            this.field1191 = 0;
        }
        if (this.field1181 != null) {
            this.field1181.method1123(arg0, 0, arg1);
        }
        this.field1183 = class115.method2142();
    }

    @ObfuscatedName("dg.c(Lbz;I)V")
    public static final void method2653(class67 arg0) {
        arg0.field1268 = false;
        if (arg0.field1265 != null) {
            arg0.field1265.field1264 = 0;
        }
        for (class67 var1 = arg0.method1120(); var1 != null; var1 = arg0.method1121()) {
            method2653(var1);
        }
    }

    @ObfuscatedName("bd.ae(Lbz;II)V")
    public final void method1163(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1197[var3];
        if (var4 == null) {
            this.field1179[var3] = arg0;
        } else {
            var4.field1266 = arg0;
        }
        this.field1197[var3] = arg0;
        arg0.field1267 = arg1;
    }

    @ObfuscatedName("bd.d(Ljava/awt/Component;)V")
    public void method1098(Component arg0) throws Exception {
    }

    @ObfuscatedName("bd.p(I)V")
    public void method1103(int arg0) throws Exception {
    }

    @ObfuscatedName("bd.v()I")
    public int method1101() throws Exception {
        return this.field1184;
    }

    @ObfuscatedName("bd.l()V")
    public void method1110() throws Exception {
    }

    @ObfuscatedName("bd.y()V")
    public void method1102() {
    }

    @ObfuscatedName("bd.w()V")
    public void method1097() throws Exception {
    }
}
