package deob;

import java.awt.Component;

@ObfuscatedName("bg")
public class class57 {

    @ObfuscatedName("bg.d")
    public int[] field1198;

    @ObfuscatedName("bg.l")
    public class67 field1188;

    @ObfuscatedName("bg.y")
    public int field1194 = 32;

    @ObfuscatedName("bg.p")
    public long field1186 = class116.method2586();

    @ObfuscatedName("bg.k")
    public int field1184;

    @ObfuscatedName("bg.o")
    public int field1191;

    @ObfuscatedName("bg.b")
    public int field1192;

    @ObfuscatedName("bg.j")
    public long field1193 = 0L;

    @ObfuscatedName("bg.a")
    public int field1204 = 0;

    @ObfuscatedName("bg.u")
    public int field1189 = 0;

    @ObfuscatedName("bg.c")
    public int field1196 = 0;

    @ObfuscatedName("bg.n")
    public long field1197 = 0L;

    @ObfuscatedName("bg.q")
    public boolean field1187 = true;

    @ObfuscatedName("bg.ad")
    public int field1200 = 0;

    @ObfuscatedName("bg.as")
    public class67[] field1190 = new class67[8];

    @ObfuscatedName("bg.ag")
    public class67[] field1202 = new class67[8];

    @ObfuscatedName("bo.c(Lek;Ljava/awt/Component;III)Lbg;")
    public static final class57 method1457(class137 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1195 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1198 = new int[(Statics.field576 ? 2 : 1) * 256];
                var4.field1191 = arg3;
                var4.method1042(arg1);
                var4.field1184 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1184 > 16384) {
                    var4.field1184 = 16384;
                }
                var4.method1058(var4.field1184);
                if (Statics.field1185 > 0 && Statics.field1913 == null) {
                    Statics.field1913 = new class73();
                    Statics.field1913.field1358 = arg0;
                    arg0.method2701(Statics.field1913, Statics.field1185);
                }
                if (Statics.field1913 != null) {
                    if (Statics.field1913.field1353[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1913.field1353[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1198 = new int[256 * (Statics.field576 ? 2 : 1)];
                    var6.field1191 = arg3;
                    var6.method1042(arg1);
                    var6.field1184 = 16384;
                    var6.method1058(var6.field1184);
                    if (Statics.field1185 > 0 && Statics.field1913 == null) {
                        Statics.field1913 = new class73();
                        Statics.field1913.field1358 = arg0;
                        arg0.method2701(Statics.field1913, Statics.field1185);
                    }
                    if (Statics.field1913 != null) {
                        if (Statics.field1913.field1353[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1913.field1353[arg2] = var6;
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

    @ObfuscatedName("bg.n(Lby;I)V")
    public final synchronized void method1102(class67 arg0) {
        this.field1188 = arg0;
    }

    @ObfuscatedName("bg.q(I)V")
    public final synchronized void method1136() {
        if (this.field1198 == null) {
            return;
        }
        long var1 = class116.method2586();
        try {
            if (this.field1193 != 0L) {
                if (var1 < this.field1193) {
                    return;
                }
                this.method1058(this.field1184);
                this.field1193 = 0L;
                this.field1187 = true;
            }
            int var3 = this.method1044();
            if (this.field1196 - var3 > this.field1204) {
                this.field1204 = this.field1196 - var3;
            }
            int var4 = this.field1192 + this.field1191;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1184) {
                this.field1184 += 1024;
                if (this.field1184 > 16384) {
                    this.field1184 = 16384;
                }
                this.method1046();
                this.method1058(this.field1184);
                var3 = 0;
                this.field1187 = true;
                if (var4 + 256 > this.field1184) {
                    var4 = this.field1184 - 256;
                    this.field1192 = var4 - this.field1191;
                }
            }
            while (var3 < var4) {
                this.method1107(this.field1198, 256);
                this.method1045();
                var3 += 256;
            }
            if (var1 > this.field1197) {
                if (this.field1187) {
                    this.field1187 = false;
                } else if (this.field1204 == 0 && this.field1189 == 0) {
                    this.method1046();
                    this.field1193 = var1 + 2000L;
                    return;
                } else {
                    this.field1192 = Math.min(this.field1189, this.field1204);
                    this.field1189 = this.field1204;
                }
                this.field1204 = 0;
                this.field1197 = var1 + 2000L;
            }
            this.field1196 = var3;
        } catch (Exception var8) {
            this.method1046();
            this.field1193 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1186 + 500000L) {
                var1 = this.field1186;
            }
            while (var1 > this.field1186 + 5000L) {
                this.method1109(256);
                this.field1186 += (long) (256000 / Statics.field1195);
            }
        } catch (Exception var7) {
            this.field1186 = var1;
        }
    }

    @ObfuscatedName("bg.x(I)V")
    public final void method1104() {
        this.field1187 = true;
    }

    @ObfuscatedName("bg.v(I)V")
    public final synchronized void method1105() {
        this.field1187 = true;
        try {
            this.method1041();
        } catch (Exception var2) {
            this.method1046();
            this.field1193 = class116.method2586() + 2000L;
        }
    }

    @ObfuscatedName("bg.m(I)V")
    public final synchronized void method1106() {
        if (Statics.field1913 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1913.field1353[var2] == this) {
                    Statics.field1913.field1353[var2] = null;
                }
                if (Statics.field1913.field1353[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1913.field1356 = true;
                while (Statics.field1913.field1355) {
                    class128.method894(50L);
                }
                Statics.field1913 = null;
            }
        }
        this.method1046();
        this.field1198 = null;
    }

    @ObfuscatedName("bg.w(IB)V")
    public final void method1109(int arg0) {
        this.field1200 -= arg0;
        if (this.field1200 < 0) {
            this.field1200 = 0;
        }
        if (this.field1188 != null) {
            this.field1188.method1069(arg0);
        }
    }

    @ObfuscatedName("bg.e([II)V")
    public final void method1107(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field576) {
            var3 = arg1 << 1;
        }
        class121.method2533(arg0, 0, var3);
        this.field1200 -= arg1;
        if (this.field1188 != null && this.field1200 <= 0) {
            this.field1200 += Statics.field1195 >> 4;
            method562(this.field1188);
            this.method1113(this.field1188, this.field1188.method1280());
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
                        class67 var11 = this.field1190[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1268;
                                if (var12 == null || var12.field1267 <= var8) {
                                    var11.field1271 = true;
                                    int var13 = var11.method1066();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1267 += var13;
                                    }
                                    if (var4 >= this.field1194) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1059();
                                    if (var14 != null) {
                                        int var15 = var11.field1269;
                                        while (var14 != null) {
                                            this.method1113(var14, var15 * var14.method1280() >> 8);
                                            var14 = var11.method1065();
                                        }
                                    }
                                    class67 var16 = var11.field1270;
                                    var11.field1270 = null;
                                    if (var10 == null) {
                                        this.field1190[var7] = var16;
                                    } else {
                                        var10.field1270 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1202[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1270;
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
                class67 var18 = this.field1190[var17];
                class67[] var19 = this.field1190;
                this.field1202[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1270;
                    var18.field1270 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1200 < 0) {
            this.field1200 = 0;
        }
        if (this.field1188 != null) {
            this.field1188.method1067(arg0, 0, arg1);
        }
        this.field1186 = class116.method2586();
    }

    @ObfuscatedName("m.ad(Lby;S)V")
    public static final void method562(class67 arg0) {
        arg0.field1271 = false;
        if (arg0.field1268 != null) {
            arg0.field1268.field1267 = 0;
        }
        for (class67 var1 = arg0.method1059(); var1 != null; var1 = arg0.method1065()) {
            method562(var1);
        }
    }

    @ObfuscatedName("bg.as(Lby;II)V")
    public final void method1113(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1202[var3];
        if (var4 == null) {
            this.field1190[var3] = arg0;
        } else {
            var4.field1270 = arg0;
        }
        this.field1202[var3] = arg0;
        arg0.field1269 = arg1;
    }

    @ObfuscatedName("bg.t(Ljava/awt/Component;)V")
    public void method1042(Component arg0) throws Exception {
    }

    @ObfuscatedName("bg.i(I)V")
    public void method1058(int arg0) throws Exception {
    }

    @ObfuscatedName("bg.g()I")
    public int method1044() throws Exception {
        return this.field1184;
    }

    @ObfuscatedName("bg.h()V")
    public void method1045() throws Exception {
    }

    @ObfuscatedName("bg.z()V")
    public void method1046() {
    }

    @ObfuscatedName("bg.r()V")
    public void method1041() throws Exception {
    }
}
