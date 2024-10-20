package deob;

import java.awt.Component;

@ObfuscatedName("bf")
public class class57 {

    @ObfuscatedName("bf.k")
    public int[] field1201;

    @ObfuscatedName("bf.c")
    public class67 field1186;

    @ObfuscatedName("bf.l")
    public int field1185 = 32;

    @ObfuscatedName("bf.t")
    public long field1188 = class116.method157();

    @ObfuscatedName("bf.i")
    public int field1180;

    @ObfuscatedName("bf.r")
    public int field1190;

    @ObfuscatedName("bf.m")
    public int field1191;

    @ObfuscatedName("bf.e")
    public long field1192 = 0L;

    @ObfuscatedName("bf.h")
    public int field1182 = 0;

    @ObfuscatedName("bf.z")
    public int field1194 = 0;

    @ObfuscatedName("bf.a")
    public int field1193 = 0;

    @ObfuscatedName("bf.w")
    public long field1196 = 0L;

    @ObfuscatedName("bf.g")
    public boolean field1197 = true;

    @ObfuscatedName("bf.ab")
    public int field1198 = 0;

    @ObfuscatedName("bf.ad")
    public class67[] field1199 = new class67[8];

    @ObfuscatedName("bf.an")
    public class67[] field1200 = new class67[8];

    @ObfuscatedName("dr.y(IZII)V")
    public static final void method2269(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1187 = arg0;
        Statics.field1181 = arg1;
        Statics.field1195 = arg2;
    }

    @ObfuscatedName("bo.f(Ley;Ljava/awt/Component;III)Lbf;")
    public static final class57 method1555(class137 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1187 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1201 = new int[(Statics.field1181 ? 2 : 1) * 256];
                var4.field1190 = arg3;
                var4.method1075(arg1);
                var4.field1180 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1180 > 16384) {
                    var4.field1180 = 16384;
                }
                var4.method1077(var4.field1180);
                if (Statics.field1195 > 0 && Statics.field1183 == null) {
                    Statics.field1183 = new class73();
                    Statics.field1183.field1355 = arg0;
                    arg0.method2704(Statics.field1183, Statics.field1195);
                }
                if (Statics.field1183 != null) {
                    if (Statics.field1183.field1358[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1183.field1358[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1201 = new int[(Statics.field1181 ? 2 : 1) * 256];
                    var6.field1190 = arg3;
                    var6.method1075(arg1);
                    var6.field1180 = 16384;
                    var6.method1077(var6.field1180);
                    if (Statics.field1195 > 0 && Statics.field1183 == null) {
                        Statics.field1183 = new class73();
                        Statics.field1183.field1355 = arg0;
                        arg0.method2704(Statics.field1183, Statics.field1195);
                    }
                    if (Statics.field1183 != null) {
                        if (Statics.field1183.field1358[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1183.field1358[arg2] = var6;
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

    @ObfuscatedName("bf.q(Lbe;I)V")
    public final synchronized void method1137(class67 arg0) {
        this.field1186 = arg0;
    }

    @ObfuscatedName("bf.n(I)V")
    public final synchronized void method1128() {
        if (this.field1201 == null) {
            return;
        }
        long var1 = class116.method157();
        try {
            if (this.field1192 != 0L) {
                if (var1 < this.field1192) {
                    return;
                }
                this.method1077(this.field1180);
                this.field1192 = 0L;
                this.field1197 = true;
            }
            int var3 = this.method1083();
            if (this.field1193 - var3 > this.field1182) {
                this.field1182 = this.field1193 - var3;
            }
            int var4 = this.field1191 + this.field1190;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1180) {
                this.field1180 += 1024;
                if (this.field1180 > 16384) {
                    this.field1180 = 16384;
                }
                this.method1078();
                this.method1077(this.field1180);
                var3 = 0;
                this.field1197 = true;
                if (var4 + 256 > this.field1180) {
                    var4 = this.field1180 - 256;
                    this.field1191 = var4 - this.field1190;
                }
            }
            while (var3 < var4) {
                this.method1134(this.field1201, 256);
                this.method1082();
                var3 += 256;
            }
            if (var1 > this.field1196) {
                if (this.field1197) {
                    this.field1197 = false;
                } else if (this.field1182 == 0 && this.field1194 == 0) {
                    this.method1078();
                    this.field1192 = var1 + 2000L;
                    return;
                } else {
                    this.field1191 = Math.min(this.field1194, this.field1182);
                    this.field1194 = this.field1182;
                }
                this.field1182 = 0;
                this.field1196 = var1 + 2000L;
            }
            this.field1193 = var3;
        } catch (Exception var8) {
            this.method1078();
            this.field1192 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1188 + 500000L) {
                var1 = this.field1188;
            }
            while (var1 > this.field1188 + 5000L) {
                this.method1133(256);
                this.field1188 += (long) (256000 / Statics.field1187);
            }
        } catch (Exception var7) {
            this.field1188 = var1;
        }
    }

    @ObfuscatedName("bf.v(B)V")
    public final void method1130() {
        this.field1197 = true;
    }

    @ObfuscatedName("bf.ab(B)V")
    public final synchronized void method1140() {
        this.field1197 = true;
        try {
            this.method1079();
        } catch (Exception var2) {
            this.method1078();
            this.field1192 = class116.method157() + 2000L;
        }
    }

    @ObfuscatedName("bf.ad(I)V")
    public final synchronized void method1132() {
        if (Statics.field1183 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1183.field1358[var2] == this) {
                    Statics.field1183.field1358[var2] = null;
                }
                if (Statics.field1183.field1358[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1183.field1356 = true;
                while (Statics.field1183.field1357) {
                    class128.method2294(50L);
                }
                Statics.field1183 = null;
            }
        }
        this.method1078();
        this.field1201 = null;
    }

    @ObfuscatedName("bf.an(II)V")
    public final void method1133(int arg0) {
        this.field1198 -= arg0;
        if (this.field1198 < 0) {
            this.field1198 = 0;
        }
        if (this.field1186 != null) {
            this.field1186.method1105(arg0);
        }
    }

    @ObfuscatedName("bf.au([II)V")
    public final void method1134(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1181) {
            var3 = arg1 << 1;
        }
        class121.method2563(arg0, 0, var3);
        this.field1198 -= arg1;
        if (this.field1186 != null && this.field1198 <= 0) {
            this.field1198 += Statics.field1187 >> 4;
            method633(this.field1186);
            this.method1135(this.field1186, this.field1186.method1237());
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
                        class67 var11 = this.field1199[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1272;
                                if (var12 == null || var12.field1269 <= var8) {
                                    var11.field1270 = true;
                                    int var13 = var11.method1102();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1269 += var13;
                                    }
                                    if (var4 >= this.field1185) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1100();
                                    if (var14 != null) {
                                        int var15 = var11.field1271;
                                        while (var14 != null) {
                                            this.method1135(var14, var15 * var14.method1237() >> 8);
                                            var14 = var11.method1113();
                                        }
                                    }
                                    class67 var16 = var11.field1273;
                                    var11.field1273 = null;
                                    if (var10 == null) {
                                        this.field1199[var7] = var16;
                                    } else {
                                        var10.field1273 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1200[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1273;
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
                class67 var18 = this.field1199[var17];
                class67[] var19 = this.field1199;
                this.field1200[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1273;
                    var18.field1273 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1198 < 0) {
            this.field1198 = 0;
        }
        if (this.field1186 != null) {
            this.field1186.method1103(arg0, 0, arg1);
        }
        this.field1188 = class116.method157();
    }

    @ObfuscatedName("au.ap(Lbe;I)V")
    public static final void method633(class67 arg0) {
        arg0.field1270 = false;
        if (arg0.field1272 != null) {
            arg0.field1272.field1269 = 0;
        }
        for (class67 var1 = arg0.method1100(); var1 != null; var1 = arg0.method1113()) {
            method633(var1);
        }
    }

    @ObfuscatedName("bf.am(Lbe;II)V")
    public final void method1135(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1200[var3];
        if (var4 == null) {
            this.field1199[var3] = arg0;
        } else {
            var4.field1273 = arg0;
        }
        this.field1200[var3] = arg0;
        arg0.field1271 = arg1;
    }

    @ObfuscatedName("bf.s(Ljava/awt/Component;)V")
    public void method1075(Component arg0) throws Exception {
    }

    @ObfuscatedName("bf.j(I)V")
    public void method1077(int arg0) throws Exception {
    }

    @ObfuscatedName("bf.p()I")
    public int method1083() throws Exception {
        return this.field1180;
    }

    @ObfuscatedName("bf.x()V")
    public void method1082() throws Exception {
    }

    @ObfuscatedName("bf.d()V")
    public void method1078() {
    }

    @ObfuscatedName("bf.u()V")
    public void method1079() throws Exception {
    }
}
