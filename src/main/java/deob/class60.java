package deob;

import java.awt.Component;

@ObfuscatedName("bq")
public class class60 {

    @ObfuscatedName("bq.j")
    public int[] field1252;

    @ObfuscatedName("bq.r")
    public class70 field1253;

    @ObfuscatedName("bq.x")
    public int field1249 = 32;

    @ObfuscatedName("bq.k")
    public long field1255 = class119.method3544();

    @ObfuscatedName("bq.v")
    public int field1254;

    @ObfuscatedName("bq.h")
    public int field1261;

    @ObfuscatedName("bq.u")
    public int field1256;

    @ObfuscatedName("bq.y")
    public long field1258 = 0L;

    @ObfuscatedName("bq.p")
    public int field1260 = 0;

    @ObfuscatedName("bq.s")
    public int field1247 = 0;

    @ObfuscatedName("bq.f")
    public int field1262 = 0;

    @ObfuscatedName("bq.i")
    public long field1270 = 0L;

    @ObfuscatedName("bq.d")
    public boolean field1264 = true;

    @ObfuscatedName("bq.a")
    public int field1266 = 0;

    @ObfuscatedName("bq.b")
    public class70[] field1267 = new class70[8];

    @ObfuscatedName("bq.aj")
    public class70[] field1268 = new class70[8];

    @ObfuscatedName("b.m(Led;Ljava/awt/Component;IIB)Lbq;")
    public static final class60 method589(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1269 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1252 = new int[(Statics.field1248 ? 2 : 1) * 256];
                var4.field1261 = arg3;
                var4.method1223(arg1);
                var4.field1254 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1254 > 16384) {
                    var4.field1254 = 16384;
                }
                var4.method1250(var4.field1254);
                if (Statics.field1263 > 0 && Statics.field1250 == null) {
                    Statics.field1250 = new class76();
                    Statics.field1250.field1426 = arg0;
                    arg0.method2772(Statics.field1250, Statics.field1263);
                }
                if (Statics.field1250 != null) {
                    if (Statics.field1250.field1423[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1250.field1423[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bq.w(Lbp;I)V")
    public final synchronized void method1215(class70 arg0) {
        this.field1253 = arg0;
    }

    @ObfuscatedName("bq.e(I)V")
    public final synchronized void method1216() {
        if (this.field1252 == null) {
            return;
        }
        long var1 = class119.method3544();
        try {
            if (this.field1258 != 0L) {
                if (var1 < this.field1258) {
                    return;
                }
                this.method1250(this.field1254);
                this.field1258 = 0L;
                this.field1264 = true;
            }
            int var3 = this.method1225();
            if (this.field1262 - var3 > this.field1260) {
                this.field1260 = this.field1262 - var3;
            }
            int var4 = this.field1261 + this.field1256;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1254) {
                this.field1254 += 1024;
                if (this.field1254 > 16384) {
                    this.field1254 = 16384;
                }
                this.method1264();
                this.method1250(this.field1254);
                var3 = 0;
                this.field1264 = true;
                if (var4 + 256 > this.field1254) {
                    var4 = this.field1254 - 256;
                    this.field1256 = var4 - this.field1261;
                }
            }
            while (var3 < var4) {
                this.method1221(this.field1252, 256);
                this.method1226();
                var3 += 256;
            }
            if (var1 > this.field1270) {
                if (this.field1264) {
                    this.field1264 = false;
                } else if (this.field1260 == 0 && this.field1247 == 0) {
                    this.method1264();
                    this.field1258 = var1 + 2000L;
                    return;
                } else {
                    this.field1256 = Math.min(this.field1247, this.field1260);
                    this.field1247 = this.field1260;
                }
                this.field1260 = 0;
                this.field1270 = var1 + 2000L;
            }
            this.field1262 = var3;
        } catch (Exception var8) {
            this.method1264();
            this.field1258 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1255 + 500000L) {
                var1 = this.field1255;
            }
            while (var1 > this.field1255 + 5000L) {
                this.method1248(256);
                this.field1255 += (long) (256000 / Statics.field1269);
            }
        } catch (Exception var7) {
            this.field1255 = var1;
        }
    }

    @ObfuscatedName("bq.o(I)V")
    public final void method1227() {
        this.field1264 = true;
    }

    @ObfuscatedName("bq.g(I)V")
    public final synchronized void method1265() {
        this.field1264 = true;
        try {
            this.method1224();
        } catch (Exception var2) {
            this.method1264();
            this.field1258 = class119.method3544() + 2000L;
        }
    }

    @ObfuscatedName("bq.l(B)V")
    public final synchronized void method1219() {
        if (Statics.field1250 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1250.field1423[var2] == this) {
                    Statics.field1250.field1423[var2] = null;
                }
                if (Statics.field1250.field1423[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1250.field1424 = true;
                while (Statics.field1250.field1430) {
                    class131.method2828(50L);
                }
                Statics.field1250 = null;
            }
        }
        this.method1264();
        this.field1252 = null;
    }

    @ObfuscatedName("bq.j(II)V")
    public final void method1248(int arg0) {
        this.field1266 -= arg0;
        if (this.field1266 < 0) {
            this.field1266 = 0;
        }
        if (this.field1253 != null) {
            this.field1253.method1180(arg0);
        }
    }

    @ObfuscatedName("bq.r([II)V")
    public final void method1221(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1248) {
            var3 = arg1 << 1;
        }
        class124.method2606(arg0, 0, var3);
        this.field1266 -= arg1;
        if (this.field1253 != null && this.field1266 <= 0) {
            this.field1266 += Statics.field1269 >> 4;
            method1102(this.field1253);
            this.method1218(this.field1253, this.field1253.method1354());
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
                        class70 var10 = null;
                        class70 var11 = this.field1267[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field1339;
                                if (var12 == null || var12.field1337 <= var8) {
                                    var11.field1341 = true;
                                    int var13 = var11.method1177();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1337 += var13;
                                    }
                                    if (var4 >= this.field1249) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1175();
                                    if (var14 != null) {
                                        int var15 = var11.field1338;
                                        while (var14 != null) {
                                            this.method1218(var14, var15 * var14.method1354() >> 8);
                                            var14 = var11.method1176();
                                        }
                                    }
                                    class70 var16 = var11.field1340;
                                    var11.field1340 = null;
                                    if (var10 == null) {
                                        this.field1267[var7] = var16;
                                    } else {
                                        var10.field1340 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1268[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1340;
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
                class70 var18 = this.field1267[var17];
                class70[] var19 = this.field1267;
                this.field1268[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1340;
                    var18.field1340 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1266 < 0) {
            this.field1266 = 0;
        }
        if (this.field1253 != null) {
            this.field1253.method1169(arg0, 0, arg1);
        }
        this.field1255 = class119.method3544();
    }

    @ObfuscatedName("bs.x(Lbp;B)V")
    public static final void method1102(class70 arg0) {
        arg0.field1341 = false;
        if (arg0.field1339 != null) {
            arg0.field1339.field1337 = 0;
        }
        for (class70 var1 = arg0.method1175(); var1 != null; var1 = arg0.method1176()) {
            method1102(var1);
        }
    }

    @ObfuscatedName("bq.k(Lbp;II)V")
    public final void method1218(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1268[var3];
        if (var4 == null) {
            this.field1267[var3] = arg0;
        } else {
            var4.field1340 = arg0;
        }
        this.field1268[var3] = arg0;
        arg0.field1338 = arg1;
    }

    @ObfuscatedName("bq.v(Ljava/awt/Component;I)V")
    public void method1223(Component arg0) throws Exception {
    }

    @ObfuscatedName("bq.h(II)V")
    public void method1250(int arg0) throws Exception {
    }

    @ObfuscatedName("bq.u(I)I")
    public int method1225() throws Exception {
        return this.field1254;
    }

    @ObfuscatedName("bq.y()V")
    public void method1226() throws Exception {
    }

    @ObfuscatedName("bq.p(I)V")
    public void method1264() {
    }

    @ObfuscatedName("bq.s(B)V")
    public void method1224() throws Exception {
    }
}
