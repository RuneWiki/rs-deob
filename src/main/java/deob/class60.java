package deob;

import java.awt.Component;

@ObfuscatedName("bp")
public class class60 {

    @ObfuscatedName("bp.n")
    public int[] field1252;

    @ObfuscatedName("bp.i")
    public class70 field1251;

    @ObfuscatedName("bp.g")
    public int field1253 = 32;

    @ObfuscatedName("bp.m")
    public long field1254 = class119.method64();

    @ObfuscatedName("bp.k")
    public int field1255;

    @ObfuscatedName("bp.x")
    public int field1256;

    @ObfuscatedName("bp.u")
    public int field1257;

    @ObfuscatedName("bp.j")
    public long field1258 = 0L;

    @ObfuscatedName("bp.q")
    public int field1248 = 0;

    @ObfuscatedName("bp.w")
    public int field1260 = 0;

    @ObfuscatedName("bp.b")
    public int field1247 = 0;

    @ObfuscatedName("bp.p")
    public long field1262 = 0L;

    @ObfuscatedName("bp.o")
    public boolean field1259 = true;

    @ObfuscatedName("bp.c")
    public int field1250 = 0;

    @ObfuscatedName("bp.f")
    public class70[] field1267 = new class70[8];

    @ObfuscatedName("bp.ac")
    public class70[] field1249 = new class70[8];

    @ObfuscatedName("b.a(IZIB)V")
    public static final void method179(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1266 = arg0;
        Statics.field1263 = arg1;
        Statics.field2123 = arg2;
    }

    @ObfuscatedName("ai.d(Len;Ljava/awt/Component;III)Lbp;")
    public static final class60 method909(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1266 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1252 = new int[(Statics.field1263 ? 2 : 1) * 256];
                var4.field1256 = arg3;
                var4.method1220(arg1);
                var4.field1255 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1255 > 16384) {
                    var4.field1255 = 16384;
                }
                var4.method1239(var4.field1255);
                if (Statics.field2123 > 0 && Statics.field1261 == null) {
                    Statics.field1261 = new class76();
                    Statics.field1261.field1422 = arg0;
                    arg0.method2794(Statics.field1261, Statics.field2123);
                }
                if (Statics.field1261 != null) {
                    if (Statics.field1261.field1425[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1261.field1425[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bp.v(Lbu;B)V")
    public final synchronized void method1221(class70 arg0) {
        this.field1251 = arg0;
    }

    @ObfuscatedName("bp.r(B)V")
    public final synchronized void method1213() {
        if (this.field1252 == null) {
            return;
        }
        long var1 = class119.method64();
        try {
            if (this.field1258 != 0L) {
                if (var1 < this.field1258) {
                    return;
                }
                this.method1239(this.field1255);
                this.field1258 = 0L;
                this.field1259 = true;
            }
            int var3 = this.method1226();
            if (this.field1247 - var3 > this.field1248) {
                this.field1248 = this.field1247 - var3;
            }
            int var4 = this.field1257 + this.field1256;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1255) {
                this.field1255 += 1024;
                if (this.field1255 > 16384) {
                    this.field1255 = 16384;
                }
                this.method1224();
                this.method1239(this.field1255);
                var3 = 0;
                this.field1259 = true;
                if (var4 + 256 > this.field1255) {
                    var4 = this.field1255 - 256;
                    this.field1257 = var4 - this.field1256;
                }
            }
            while (var3 < var4) {
                this.method1219(this.field1252, 256);
                this.method1223();
                var3 += 256;
            }
            if (var1 > this.field1262) {
                if (this.field1259) {
                    this.field1259 = false;
                } else if (this.field1248 == 0 && this.field1260 == 0) {
                    this.method1224();
                    this.field1258 = var1 + 2000L;
                    return;
                } else {
                    this.field1257 = Math.min(this.field1260, this.field1248);
                    this.field1260 = this.field1248;
                }
                this.field1248 = 0;
                this.field1262 = var1 + 2000L;
            }
            this.field1247 = var3;
        } catch (Exception var8) {
            this.method1224();
            this.field1258 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1254 + 500000L) {
                var1 = this.field1254;
            }
            while (var1 > this.field1254 + 5000L) {
                this.method1217(256);
                this.field1254 += (long) (256000 / Statics.field1266);
            }
        } catch (Exception var7) {
            this.field1254 = var1;
        }
    }

    @ObfuscatedName("bp.z(I)V")
    public final void method1214() {
        this.field1259 = true;
    }

    @ObfuscatedName("bp.t(I)V")
    public final synchronized void method1215() {
        this.field1259 = true;
        try {
            this.method1225();
        } catch (Exception var2) {
            this.method1224();
            this.field1258 = class119.method64() + 2000L;
        }
    }

    @ObfuscatedName("bp.n(I)V")
    public final synchronized void method1218() {
        if (Statics.field1261 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1261.field1425[var2] == this) {
                    Statics.field1261.field1425[var2] = null;
                }
                if (Statics.field1261.field1425[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1261.field1420 = true;
                while (Statics.field1261.field1423) {
                    class131.method674(50L);
                }
                Statics.field1261 = null;
            }
        }
        this.method1224();
        this.field1252 = null;
    }

    @ObfuscatedName("bp.i(II)V")
    public final void method1217(int arg0) {
        this.field1250 -= arg0;
        if (this.field1250 < 0) {
            this.field1250 = 0;
        }
        if (this.field1251 != null) {
            this.field1251.method1175(arg0);
        }
    }

    @ObfuscatedName("bp.g([II)V")
    public final void method1219(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1263) {
            var3 = arg1 << 1;
        }
        class124.method2627(arg0, 0, var3);
        this.field1250 -= arg1;
        if (this.field1251 != null && this.field1250 <= 0) {
            this.field1250 += Statics.field1266 >> 4;
            method672(this.field1251);
            this.method1250(this.field1251, this.field1251.method1325());
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
                                class69 var12 = var11.field1336;
                                if (var12 == null || var12.field1335 <= var8) {
                                    var11.field1339 = true;
                                    int var13 = var11.method1172();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1335 += var13;
                                    }
                                    if (var4 >= this.field1253) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1208();
                                    if (var14 != null) {
                                        int var15 = var11.field1337;
                                        while (var14 != null) {
                                            this.method1250(var14, var15 * var14.method1325() >> 8);
                                            var14 = var11.method1171();
                                        }
                                    }
                                    class70 var16 = var11.field1338;
                                    var11.field1338 = null;
                                    if (var10 == null) {
                                        this.field1267[var7] = var16;
                                    } else {
                                        var10.field1338 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1249[var7] = var10;
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
                class70 var18 = this.field1267[var17];
                class70[] var19 = this.field1267;
                this.field1249[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1338;
                    var18.field1338 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1250 < 0) {
            this.field1250 = 0;
        }
        if (this.field1251 != null) {
            this.field1251.method1173(arg0, 0, arg1);
        }
        this.field1254 = class119.method64();
    }

    @ObfuscatedName("ap.m(Lbu;I)V")
    public static final void method672(class70 arg0) {
        arg0.field1339 = false;
        if (arg0.field1336 != null) {
            arg0.field1336.field1335 = 0;
        }
        for (class70 var1 = arg0.method1208(); var1 != null; var1 = arg0.method1171()) {
            method672(var1);
        }
    }

    @ObfuscatedName("bp.k(Lbu;II)V")
    public final void method1250(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1249[var3];
        if (var4 == null) {
            this.field1267[var3] = arg0;
        } else {
            var4.field1338 = arg0;
        }
        this.field1249[var3] = arg0;
        arg0.field1337 = arg1;
    }

    @ObfuscatedName("bp.x(Ljava/awt/Component;I)V")
    public void method1220(Component arg0) throws Exception {
    }

    @ObfuscatedName("bp.u(IB)V")
    public void method1239(int arg0) throws Exception {
    }

    @ObfuscatedName("bp.j(S)I")
    public int method1226() throws Exception {
        return this.field1255;
    }

    @ObfuscatedName("bp.q()V")
    public void method1223() throws Exception {
    }

    @ObfuscatedName("bp.w(I)V")
    public void method1224() {
    }

    @ObfuscatedName("bp.b(I)V")
    public void method1225() throws Exception {
    }
}
