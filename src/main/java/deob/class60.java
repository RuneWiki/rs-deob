package deob;

import java.awt.Component;

@ObfuscatedName("bs")
public class class60 {

    @ObfuscatedName("bs.k")
    public int[] field1249;

    @ObfuscatedName("bs.u")
    public class70 field1257;

    @ObfuscatedName("bs.n")
    public int field1251 = 32;

    @ObfuscatedName("bs.b")
    public long field1252 = class119.method1224();

    @ObfuscatedName("bs.m")
    public int field1253;

    @ObfuscatedName("bs.q")
    public int field1254;

    @ObfuscatedName("bs.p")
    public int field1250;

    @ObfuscatedName("bs.w")
    public long field1247 = 0L;

    @ObfuscatedName("bs.o")
    public int field1259 = 0;

    @ObfuscatedName("bs.d")
    public int field1258 = 0;

    @ObfuscatedName("bs.f")
    public int field1263 = 0;

    @ObfuscatedName("bs.z")
    public long field1260 = 0L;

    @ObfuscatedName("bs.i")
    public boolean field1261 = true;

    @ObfuscatedName("bs.a")
    public int field1264 = 0;

    @ObfuscatedName("bs.c")
    public class70[] field1266 = new class70[8];

    @ObfuscatedName("bs.ad")
    public class70[] field1244 = new class70[8];

    @ObfuscatedName("m.l(Led;Ljava/awt/Component;III)Lbs;")
    public static final class60 method138(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1255 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1249 = new int[256 * (Statics.field1265 ? 2 : 1)];
                var4.field1254 = arg3;
                var4.method1311(arg1);
                var4.field1253 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1253 > 16384) {
                    var4.field1253 = 16384;
                }
                var4.method1277(var4.field1253);
                if (Statics.field1246 > 0 && Statics.field3014 == null) {
                    Statics.field3014 = new class76();
                    Statics.field3014.field1428 = arg0;
                    arg0.method2880(Statics.field3014, Statics.field1246);
                }
                if (Statics.field3014 != null) {
                    if (Statics.field3014.field1425[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3014.field1425[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bs.g(Lbh;I)V")
    public final synchronized void method1292(class70 arg0) {
        this.field1257 = arg0;
    }

    @ObfuscatedName("bs.r(I)V")
    public final synchronized void method1269() {
        if (this.field1249 == null) {
            return;
        }
        long var1 = class119.method1224();
        try {
            if (this.field1247 != 0L) {
                if (var1 < this.field1247) {
                    return;
                }
                this.method1277(this.field1253);
                this.field1247 = 0L;
                this.field1261 = true;
            }
            int var3 = this.method1316();
            if (this.field1263 - var3 > this.field1259) {
                this.field1259 = this.field1263 - var3;
            }
            int var4 = this.field1254 + this.field1250;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1253) {
                this.field1253 += 1024;
                if (this.field1253 > 16384) {
                    this.field1253 = 16384;
                }
                this.method1280();
                this.method1277(this.field1253);
                var3 = 0;
                this.field1261 = true;
                if (var4 + 256 > this.field1253) {
                    var4 = this.field1253 - 256;
                    this.field1250 = var4 - this.field1254;
                }
            }
            while (var3 < var4) {
                this.method1274(this.field1249, 256);
                this.method1279();
                var3 += 256;
            }
            if (var1 > this.field1260) {
                if (this.field1261) {
                    this.field1261 = false;
                } else if (this.field1259 == 0 && this.field1258 == 0) {
                    this.method1280();
                    this.field1247 = var1 + 2000L;
                    return;
                } else {
                    this.field1250 = Math.min(this.field1258, this.field1259);
                    this.field1258 = this.field1259;
                }
                this.field1259 = 0;
                this.field1260 = var1 + 2000L;
            }
            this.field1263 = var3;
        } catch (Exception var8) {
            this.method1280();
            this.field1247 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1252 + 500000L) {
                var1 = this.field1252;
            }
            while (var1 > this.field1252 + 5000L) {
                this.method1273(256);
                this.field1252 += (long) (256000 / Statics.field1255);
            }
        } catch (Exception var7) {
            this.field1252 = var1;
        }
    }

    @ObfuscatedName("bs.e(B)V")
    public final void method1267() {
        this.field1261 = true;
    }

    @ObfuscatedName("bs.h(B)V")
    public final synchronized void method1271() {
        this.field1261 = true;
        try {
            this.method1276();
        } catch (Exception var2) {
            this.method1280();
            this.field1247 = class119.method1224() + 2000L;
        }
    }

    @ObfuscatedName("bs.s(I)V")
    public final synchronized void method1297() {
        if (Statics.field3014 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3014.field1425[var2] == this) {
                    Statics.field3014.field1425[var2] = null;
                }
                if (Statics.field3014.field1425[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3014.field1421 = true;
                while (Statics.field3014.field1422) {
                    class131.method587(50L);
                }
                Statics.field3014 = null;
            }
        }
        this.method1280();
        this.field1249 = null;
    }

    @ObfuscatedName("bs.k(II)V")
    public final void method1273(int arg0) {
        this.field1264 -= arg0;
        if (this.field1264 < 0) {
            this.field1264 = 0;
        }
        if (this.field1257 != null) {
            this.field1257.method1236(arg0);
        }
    }

    @ObfuscatedName("bs.u([II)V")
    public final void method1274(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1265) {
            var3 = arg1 << 1;
        }
        class124.method2719(arg0, 0, var3);
        this.field1264 -= arg1;
        if (this.field1257 != null && this.field1264 <= 0) {
            this.field1264 += Statics.field1255 >> 4;
            method2152(this.field1257);
            this.method1315(this.field1257, this.field1257.method1400());
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
                        class70 var11 = this.field1266[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field1335;
                                if (var12 == null || var12.field1334 <= var8) {
                                    var11.field1337 = true;
                                    int var13 = var11.method1255();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1334 += var13;
                                    }
                                    if (var4 >= this.field1251) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1231();
                                    if (var14 != null) {
                                        int var15 = var11.field1336;
                                        while (var14 != null) {
                                            this.method1315(var14, var15 * var14.method1400() >> 8);
                                            var14 = var11.method1232();
                                        }
                                    }
                                    class70 var16 = var11.field1338;
                                    var11.field1338 = null;
                                    if (var10 == null) {
                                        this.field1266[var7] = var16;
                                    } else {
                                        var10.field1338 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1244[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1338;
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
                class70 var18 = this.field1266[var17];
                class70[] var19 = this.field1266;
                this.field1244[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1338;
                    var18.field1338 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1264 < 0) {
            this.field1264 = 0;
        }
        if (this.field1257 != null) {
            this.field1257.method1234(arg0, 0, arg1);
        }
        this.field1252 = class119.method1224();
    }

    @ObfuscatedName("cu.n(Lbh;B)V")
    public static final void method2152(class70 arg0) {
        arg0.field1337 = false;
        if (arg0.field1335 != null) {
            arg0.field1335.field1334 = 0;
        }
        for (class70 var1 = arg0.method1231(); var1 != null; var1 = arg0.method1232()) {
            method2152(var1);
        }
    }

    @ObfuscatedName("bs.b(Lbh;II)V")
    public final void method1315(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1244[var3];
        if (var4 == null) {
            this.field1266[var3] = arg0;
        } else {
            var4.field1338 = arg0;
        }
        this.field1244[var3] = arg0;
        arg0.field1336 = arg1;
    }

    @ObfuscatedName("bs.m(Ljava/awt/Component;I)V")
    public void method1311(Component arg0) throws Exception {
    }

    @ObfuscatedName("bs.q(II)V")
    public void method1277(int arg0) throws Exception {
    }

    @ObfuscatedName("bs.p(I)I")
    public int method1316() throws Exception {
        return this.field1253;
    }

    @ObfuscatedName("bs.w()V")
    public void method1279() throws Exception {
    }

    @ObfuscatedName("bs.o(B)V")
    public void method1280() {
    }

    @ObfuscatedName("bs.d(I)V")
    public void method1276() throws Exception {
    }
}
