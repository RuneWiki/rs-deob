package deob;

import java.awt.Component;

@ObfuscatedName("be")
public class class60 {

    @ObfuscatedName("be.m")
    public int[] field1241;

    @ObfuscatedName("be.f")
    public class70 field1224;

    @ObfuscatedName("be.k")
    public int field1221 = 32;

    @ObfuscatedName("be.h")
    public long field1222 = class119.method2280();

    @ObfuscatedName("be.r")
    public int field1214;

    @ObfuscatedName("be.w")
    public int field1242;

    @ObfuscatedName("be.u")
    public int field1225;

    @ObfuscatedName("be.n")
    public long field1226 = 0L;

    @ObfuscatedName("be.d")
    public int field1227 = 0;

    @ObfuscatedName("be.a")
    public int field1228 = 0;

    @ObfuscatedName("be.b")
    public int field1229 = 0;

    @ObfuscatedName("be.q")
    public long field1236 = 0L;

    @ObfuscatedName("be.o")
    public boolean field1231 = true;

    @ObfuscatedName("be.e")
    public int field1233 = 0;

    @ObfuscatedName("be.j")
    public class70[] field1234 = new class70[8];

    @ObfuscatedName("be.ae")
    public class70[] field1235 = new class70[8];

    @ObfuscatedName("ab.s(Led;Ljava/awt/Component;III)Lbe;")
    public static final class60 method724(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1220 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1241 = new int[256 * (Statics.field1223 ? 2 : 1)];
                var4.field1242 = arg3;
                var4.method1207(arg1);
                var4.field1214 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1214 > 16384) {
                    var4.field1214 = 16384;
                }
                var4.method1170(var4.field1214);
                if (Statics.field1216 > 0 && Statics.field3210 == null) {
                    Statics.field3210 = new class76();
                    Statics.field3210.field1398 = arg0;
                    arg0.method2755(Statics.field3210, Statics.field1216);
                }
                if (Statics.field3210 != null) {
                    if (Statics.field3210.field1391[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3210.field1391[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("be.z(Lbi;I)V")
    public final synchronized void method1161(class70 arg0) {
        this.field1224 = arg0;
    }

    @ObfuscatedName("be.t(I)V")
    public final synchronized void method1169() {
        if (this.field1241 == null) {
            return;
        }
        long var1 = class119.method2280();
        try {
            if (this.field1226 != 0L) {
                if (var1 < this.field1226) {
                    return;
                }
                this.method1170(this.field1214);
                this.field1226 = 0L;
                this.field1231 = true;
            }
            int var3 = this.method1176();
            if (this.field1229 - var3 > this.field1227) {
                this.field1227 = this.field1229 - var3;
            }
            int var4 = this.field1242 + this.field1225;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1214) {
                this.field1214 += 1024;
                if (this.field1214 > 16384) {
                    this.field1214 = 16384;
                }
                this.method1172();
                this.method1170(this.field1214);
                var3 = 0;
                this.field1231 = true;
                if (var4 + 256 > this.field1214) {
                    var4 = this.field1214 - 256;
                    this.field1225 = var4 - this.field1242;
                }
            }
            while (var3 < var4) {
                this.method1192(this.field1241, 256);
                this.method1162();
                var3 += 256;
            }
            if (var1 > this.field1236) {
                if (this.field1231) {
                    this.field1231 = false;
                } else if (this.field1227 == 0 && this.field1228 == 0) {
                    this.method1172();
                    this.field1226 = var1 + 2000L;
                    return;
                } else {
                    this.field1225 = Math.min(this.field1228, this.field1227);
                    this.field1228 = this.field1227;
                }
                this.field1227 = 0;
                this.field1236 = var1 + 2000L;
            }
            this.field1229 = var3;
        } catch (Exception var8) {
            this.method1172();
            this.field1226 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1222 + 500000L) {
                var1 = this.field1222;
            }
            while (var1 > this.field1222 + 5000L) {
                this.method1166(256);
                this.field1222 += (long) (256000 / Statics.field1220);
            }
        } catch (Exception var7) {
            this.field1222 = var1;
        }
    }

    @ObfuscatedName("be.y(I)V")
    public final void method1214() {
        this.field1231 = true;
    }

    @ObfuscatedName("be.p(I)V")
    public final synchronized void method1164() {
        this.field1231 = true;
        try {
            this.method1204();
        } catch (Exception var2) {
            this.method1172();
            this.field1226 = class119.method2280() + 2000L;
        }
    }

    @ObfuscatedName("be.g(I)V")
    public final synchronized void method1165() {
        if (Statics.field3210 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3210.field1391[var2] == this) {
                    Statics.field3210.field1391[var2] = null;
                }
                if (Statics.field3210.field1391[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3210.field1392 = true;
                while (Statics.field3210.field1393) {
                    class131.method182(50L);
                }
                Statics.field3210 = null;
            }
        }
        this.method1172();
        this.field1241 = null;
    }

    @ObfuscatedName("be.m(IB)V")
    public final void method1166(int arg0) {
        this.field1233 -= arg0;
        if (this.field1233 < 0) {
            this.field1233 = 0;
        }
        if (this.field1224 != null) {
            this.field1224.method1137(arg0);
        }
    }

    @ObfuscatedName("be.f([II)V")
    public final void method1192(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1223) {
            var3 = arg1 << 1;
        }
        class124.method2579(arg0, 0, var3);
        this.field1233 -= arg1;
        if (this.field1224 != null && this.field1233 <= 0) {
            this.field1233 += Statics.field1220 >> 4;
            method883(this.field1224);
            this.method1168(this.field1224, this.field1224.method1292());
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
                        class70 var11 = this.field1234[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field1306;
                                if (var12 == null || var12.field1305 <= var8) {
                                    var11.field1307 = true;
                                    int var13 = var11.method1151();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1305 += var13;
                                    }
                                    if (var4 >= this.field1221) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1133();
                                    if (var14 != null) {
                                        int var15 = var11.field1308;
                                        while (var14 != null) {
                                            this.method1168(var14, var15 * var14.method1292() >> 8);
                                            var14 = var11.method1134();
                                        }
                                    }
                                    class70 var16 = var11.field1309;
                                    var11.field1309 = null;
                                    if (var10 == null) {
                                        this.field1234[var7] = var16;
                                    } else {
                                        var10.field1309 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1235[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1309;
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
                class70 var18 = this.field1234[var17];
                class70[] var19 = this.field1234;
                this.field1235[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1309;
                    var18.field1309 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1233 < 0) {
            this.field1233 = 0;
        }
        if (this.field1224 != null) {
            this.field1224.method1135(arg0, 0, arg1);
        }
        this.field1222 = class119.method2280();
    }

    @ObfuscatedName("ay.k(Lbi;I)V")
    public static final void method883(class70 arg0) {
        arg0.field1307 = false;
        if (arg0.field1306 != null) {
            arg0.field1306.field1305 = 0;
        }
        for (class70 var1 = arg0.method1133(); var1 != null; var1 = arg0.method1134()) {
            method883(var1);
        }
    }

    @ObfuscatedName("be.h(Lbi;II)V")
    public final void method1168(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1235[var3];
        if (var4 == null) {
            this.field1234[var3] = arg0;
        } else {
            var4.field1309 = arg0;
        }
        this.field1235[var3] = arg0;
        arg0.field1308 = arg1;
    }

    @ObfuscatedName("be.r(Ljava/awt/Component;I)V")
    public void method1207(Component arg0) throws Exception {
    }

    @ObfuscatedName("be.w(II)V")
    public void method1170(int arg0) throws Exception {
    }

    @ObfuscatedName("be.u(I)I")
    public int method1176() throws Exception {
        return this.field1214;
    }

    @ObfuscatedName("be.n()V")
    public void method1162() throws Exception {
    }

    @ObfuscatedName("be.d(I)V")
    public void method1172() {
    }

    @ObfuscatedName("be.a(I)V")
    public void method1204() throws Exception {
    }
}
