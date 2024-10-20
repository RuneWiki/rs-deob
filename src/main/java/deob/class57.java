package deob;

import java.awt.Component;

@ObfuscatedName("bi")
public class class57 {

    @ObfuscatedName("bi.k")
    public int[] field1174;

    @ObfuscatedName("bi.b")
    public class67 field1179;

    @ObfuscatedName("bi.c")
    public int field1180 = 32;

    @ObfuscatedName("bi.l")
    public long field1178 = class115.method2082();

    @ObfuscatedName("bi.p")
    public int field1182;

    @ObfuscatedName("bi.d")
    public int field1185;

    @ObfuscatedName("bi.i")
    public int field1184;

    @ObfuscatedName("bi.x")
    public long field1181 = 0L;

    @ObfuscatedName("bi.j")
    public int field1186 = 0;

    @ObfuscatedName("bi.w")
    public int field1187 = 0;

    @ObfuscatedName("bi.r")
    public int field1188 = 0;

    @ObfuscatedName("bi.u")
    public long field1183 = 0L;

    @ObfuscatedName("bi.m")
    public boolean field1190 = true;

    @ObfuscatedName("bi.at")
    public int field1192 = 0;

    @ObfuscatedName("bi.aa")
    public class67[] field1193 = new class67[8];

    @ObfuscatedName("bi.ad")
    public class67[] field1194 = new class67[8];

    @ObfuscatedName("bi.e(Lbo;I)V")
    public final synchronized void method1195(class67 arg0) {
        this.field1179 = arg0;
    }

    @ObfuscatedName("bi.y(S)V")
    public final synchronized void method1165() {
        if (this.field1174 == null) {
            return;
        }
        long var1 = class115.method2082();
        try {
            if (this.field1181 != 0L) {
                if (var1 < this.field1181) {
                    return;
                }
                this.method1098(this.field1182);
                this.field1181 = 0L;
                this.field1190 = true;
            }
            int var3 = this.method1099();
            if (this.field1188 - var3 > this.field1186) {
                this.field1186 = this.field1188 - var3;
            }
            int var4 = this.field1185 + this.field1184;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1182) {
                this.field1182 += 1024;
                if (this.field1182 > 16384) {
                    this.field1182 = 16384;
                }
                this.method1113();
                this.method1098(this.field1182);
                var3 = 0;
                this.field1190 = true;
                if (var4 + 256 > this.field1182) {
                    var4 = this.field1182 - 256;
                    this.field1184 = var4 - this.field1185;
                }
            }
            while (var3 < var4) {
                this.method1196(this.field1174, 256);
                this.method1100();
                var3 += 256;
            }
            if (var1 > this.field1183) {
                if (this.field1190) {
                    this.field1190 = false;
                } else if (this.field1186 == 0 && this.field1187 == 0) {
                    this.method1113();
                    this.field1181 = var1 + 2000L;
                    return;
                } else {
                    this.field1184 = Math.min(this.field1187, this.field1186);
                    this.field1187 = this.field1186;
                }
                this.field1186 = 0;
                this.field1183 = var1 + 2000L;
            }
            this.field1188 = var3;
        } catch (Exception var8) {
            this.method1113();
            this.field1181 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1178 + 500000L) {
                var1 = this.field1178;
            }
            while (var1 > this.field1178 + 5000L) {
                this.method1168(256);
                this.field1178 += (long) (256000 / Statics.field1189);
            }
        } catch (Exception var7) {
            this.field1178 = var1;
        }
    }

    @ObfuscatedName("bi.a(I)V")
    public final void method1175() {
        this.field1190 = true;
    }

    @ObfuscatedName("bi.at(B)V")
    public final synchronized void method1167() {
        this.field1190 = true;
        try {
            this.method1102();
        } catch (Exception var2) {
            this.method1113();
            this.field1181 = class115.method2082() + 2000L;
        }
    }

    @ObfuscatedName("bi.aa(I)V")
    public final synchronized void method1164() {
        if (Statics.field217 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field217.field1360[var2] == this) {
                    Statics.field217.field1360[var2] = null;
                }
                if (Statics.field217.field1360[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field217.field1355 = true;
                while (Statics.field217.field1356) {
                    class127.method2075(50L);
                }
                Statics.field217 = null;
            }
        }
        this.method1113();
        this.field1174 = null;
    }

    @ObfuscatedName("bi.ad(II)V")
    public final void method1168(int arg0) {
        this.field1192 -= arg0;
        if (this.field1192 < 0) {
            this.field1192 = 0;
        }
        if (this.field1179 != null) {
            this.field1179.method1129(arg0);
        }
    }

    @ObfuscatedName("bi.af([II)V")
    public final void method1196(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3098) {
            var3 = arg1 << 1;
        }
        class120.method2618(arg0, 0, var3);
        this.field1192 -= arg1;
        if (this.field1179 != null && this.field1192 <= 0) {
            this.field1192 += Statics.field1189 >> 4;
            Statics.method680(this.field1179);
            this.method1169(this.field1179, this.field1179.method1282());
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
                        class67 var11 = this.field1193[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1271;
                                if (var12 == null || var12.field1268 <= var8) {
                                    var11.field1269 = true;
                                    int var13 = var11.method1127();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1268 += var13;
                                    }
                                    if (var4 >= this.field1180) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1124();
                                    if (var14 != null) {
                                        int var15 = var11.field1270;
                                        while (var14 != null) {
                                            this.method1169(var14, var15 * var14.method1282() >> 8);
                                            var14 = var11.method1157();
                                        }
                                    }
                                    class67 var16 = var11.field1272;
                                    var11.field1272 = null;
                                    if (var10 == null) {
                                        this.field1193[var7] = var16;
                                    } else {
                                        var10.field1272 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1194[var7] = var10;
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
                class67 var18 = this.field1193[var17];
                class67[] var19 = this.field1193;
                this.field1194[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1272;
                    var18.field1272 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1192 < 0) {
            this.field1192 = 0;
        }
        if (this.field1179 != null) {
            this.field1179.method1143(arg0, 0, arg1);
        }
        this.field1178 = class115.method2082();
    }

    @ObfuscatedName("bi.as(Lbo;II)V")
    public final void method1169(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1194[var3];
        if (var4 == null) {
            this.field1193[var3] = arg0;
        } else {
            var4.field1272 = arg0;
        }
        this.field1194[var3] = arg0;
        arg0.field1270 = arg1;
    }

    @ObfuscatedName("bi.h(Ljava/awt/Component;)V")
    public void method1097(Component arg0) throws Exception {
    }

    @ObfuscatedName("bi.q(I)V")
    public void method1098(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.v()I")
    public int method1099() throws Exception {
        return this.field1182;
    }

    @ObfuscatedName("bi.n()V")
    public void method1100() throws Exception {
    }

    @ObfuscatedName("bi.f()V")
    public void method1113() {
    }

    @ObfuscatedName("bi.g()V")
    public void method1102() throws Exception {
    }
}
