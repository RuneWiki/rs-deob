package deob;

import java.awt.Component;

@ObfuscatedName("bi")
public class class60 {

    @ObfuscatedName("bi.m")
    public int[] field1254;

    @ObfuscatedName("bi.y")
    public class70 field1240;

    @ObfuscatedName("bi.u")
    public int field1252 = 32;

    @ObfuscatedName("bi.h")
    public long field1242 = class119.method3068();

    @ObfuscatedName("bi.l")
    public int field1234;

    @ObfuscatedName("bi.b")
    public int field1241;

    @ObfuscatedName("bi.g")
    public int field1245;

    @ObfuscatedName("bi.e")
    public long field1246 = 0L;

    @ObfuscatedName("bi.p")
    public int field1247 = 0;

    @ObfuscatedName("bi.s")
    public int field1235 = 0;

    @ObfuscatedName("bi.w")
    public int field1249 = 0;

    @ObfuscatedName("bi.i")
    public long field1244 = 0L;

    @ObfuscatedName("bi.r")
    public boolean field1251 = true;

    @ObfuscatedName("bi.t")
    public int field1248 = 0;

    @ObfuscatedName("bi.o")
    public class70[] field1253 = new class70[8];

    @ObfuscatedName("bi.aq")
    public class70[] field1243 = new class70[8];

    @ObfuscatedName("an.k(Leh;Ljava/awt/Component;III)Lbi;")
    public static final class60 method899(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1250 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1254 = new int[(Statics.field1239 ? 2 : 1) * 256];
                var4.field1241 = arg3;
                var4.method1190(arg1);
                var4.field1234 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1234 > 16384) {
                    var4.field1234 = 16384;
                }
                var4.method1191(var4.field1234);
                if (Statics.field1236 > 0 && Statics.field1237 == null) {
                    Statics.field1237 = new class76();
                    Statics.field1237.field1413 = arg0;
                    arg0.method2766(Statics.field1237, Statics.field1236);
                }
                if (Statics.field1237 != null) {
                    if (Statics.field1237.field1408[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1237.field1408[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bi.q(Lbf;B)V")
    public final synchronized void method1182(class70 arg0) {
        this.field1240 = arg0;
    }

    @ObfuscatedName("bi.f(I)V")
    public final synchronized void method1183() {
        if (this.field1254 == null) {
            return;
        }
        long var1 = class119.method3068();
        try {
            if (this.field1246 != 0L) {
                if (var1 < this.field1246) {
                    return;
                }
                this.method1191(this.field1234);
                this.field1246 = 0L;
                this.field1251 = true;
            }
            int var3 = this.method1192();
            if (this.field1249 - var3 > this.field1247) {
                this.field1247 = this.field1249 - var3;
            }
            int var4 = this.field1245 + this.field1241;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1234) {
                this.field1234 += 1024;
                if (this.field1234 > 16384) {
                    this.field1234 = 16384;
                }
                this.method1181();
                this.method1191(this.field1234);
                var3 = 0;
                this.field1251 = true;
                if (var4 + 256 > this.field1234) {
                    var4 = this.field1234 - 256;
                    this.field1245 = var4 - this.field1241;
                }
            }
            while (var3 < var4) {
                this.method1188(this.field1254, 256);
                this.method1193();
                var3 += 256;
            }
            if (var1 > this.field1244) {
                if (this.field1251) {
                    this.field1251 = false;
                } else if (this.field1247 == 0 && this.field1235 == 0) {
                    this.method1181();
                    this.field1246 = var1 + 2000L;
                    return;
                } else {
                    this.field1245 = Math.min(this.field1235, this.field1247);
                    this.field1235 = this.field1247;
                }
                this.field1247 = 0;
                this.field1244 = var1 + 2000L;
            }
            this.field1249 = var3;
        } catch (Exception var8) {
            this.method1181();
            this.field1246 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1242 + 500000L) {
                var1 = this.field1242;
            }
            while (var1 > this.field1242 + 5000L) {
                this.method1187(256);
                this.field1242 += (long) (256000 / Statics.field1250);
            }
        } catch (Exception var7) {
            this.field1242 = var1;
        }
    }

    @ObfuscatedName("bi.c(I)V")
    public final void method1230() {
        this.field1251 = true;
    }

    @ObfuscatedName("bi.v(I)V")
    public final synchronized void method1217() {
        this.field1251 = true;
        try {
            this.method1195();
        } catch (Exception var2) {
            this.method1181();
            this.field1246 = class119.method3068() + 2000L;
        }
    }

    @ObfuscatedName("bi.j(I)V")
    public final synchronized void method1223() {
        if (Statics.field1237 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1237.field1408[var2] == this) {
                    Statics.field1237.field1408[var2] = null;
                }
                if (Statics.field1237.field1408[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1237.field1409 = true;
                while (Statics.field1237.field1410) {
                    class131.method2702(50L);
                }
                Statics.field1237 = null;
            }
        }
        this.method1181();
        this.field1254 = null;
    }

    @ObfuscatedName("bi.m(II)V")
    public final void method1187(int arg0) {
        this.field1248 -= arg0;
        if (this.field1248 < 0) {
            this.field1248 = 0;
        }
        if (this.field1240 != null) {
            this.field1240.method1152(arg0);
        }
    }

    @ObfuscatedName("bi.y([II)V")
    public final void method1188(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1239) {
            var3 = arg1 << 1;
        }
        class124.method2636(arg0, 0, var3);
        this.field1248 -= arg1;
        if (this.field1240 != null && this.field1248 <= 0) {
            this.field1248 += Statics.field1250 >> 4;
            method900(this.field1240);
            this.method1189(this.field1240, this.field1240.method1345());
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
                        class70 var11 = this.field1253[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field1323;
                                if (var12 == null || var12.field1322 <= var8) {
                                    var11.field1326 = true;
                                    int var13 = var11.method1149();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1322 += var13;
                                    }
                                    if (var4 >= this.field1252) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1151();
                                    if (var14 != null) {
                                        int var15 = var11.field1324;
                                        while (var14 != null) {
                                            this.method1189(var14, var15 * var14.method1345() >> 8);
                                            var14 = var11.method1148();
                                        }
                                    }
                                    class70 var16 = var11.field1325;
                                    var11.field1325 = null;
                                    if (var10 == null) {
                                        this.field1253[var7] = var16;
                                    } else {
                                        var10.field1325 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1243[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1325;
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
                class70 var18 = this.field1253[var17];
                class70[] var19 = this.field1253;
                this.field1243[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1325;
                    var18.field1325 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1248 < 0) {
            this.field1248 = 0;
        }
        if (this.field1240 != null) {
            this.field1240.method1150(arg0, 0, arg1);
        }
        this.field1242 = class119.method3068();
    }

    @ObfuscatedName("an.u(Lbf;B)V")
    public static final void method900(class70 arg0) {
        arg0.field1326 = false;
        if (arg0.field1323 != null) {
            arg0.field1323.field1322 = 0;
        }
        for (class70 var1 = arg0.method1151(); var1 != null; var1 = arg0.method1148()) {
            method900(var1);
        }
    }

    @ObfuscatedName("bi.h(Lbf;II)V")
    public final void method1189(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1243[var3];
        if (var4 == null) {
            this.field1253[var3] = arg0;
        } else {
            var4.field1325 = arg0;
        }
        this.field1243[var3] = arg0;
        arg0.field1324 = arg1;
    }

    @ObfuscatedName("bi.l(Ljava/awt/Component;B)V")
    public void method1190(Component arg0) throws Exception {
    }

    @ObfuscatedName("bi.b(II)V")
    public void method1191(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.g(I)I")
    public int method1192() throws Exception {
        return this.field1234;
    }

    @ObfuscatedName("bi.e()V")
    public void method1193() throws Exception {
    }

    @ObfuscatedName("bi.p(B)V")
    public void method1181() {
    }

    @ObfuscatedName("bi.s(I)V")
    public void method1195() throws Exception {
    }
}
