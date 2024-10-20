package deob;

import java.awt.Component;

@ObfuscatedName("ba")
public class class60 {

    @ObfuscatedName("ba.d")
    public int[] field1235;

    @ObfuscatedName("ba.l")
    public class70 field1252;

    @ObfuscatedName("ba.m")
    public int field1237 = 32;

    @ObfuscatedName("ba.j")
    public long field1238 = class119.method719();

    @ObfuscatedName("ba.y")
    public int field1239;

    @ObfuscatedName("ba.s")
    public int field1231;

    @ObfuscatedName("ba.p")
    public int field1233;

    @ObfuscatedName("ba.v")
    public long field1242 = 0L;

    @ObfuscatedName("ba.r")
    public int field1243 = 0;

    @ObfuscatedName("ba.c")
    public int field1244 = 0;

    @ObfuscatedName("ba.w")
    public int field1245 = 0;

    @ObfuscatedName("ba.x")
    public long field1246 = 0L;

    @ObfuscatedName("ba.k")
    public boolean field1247 = true;

    @ObfuscatedName("ba.t")
    public int field1248 = 0;

    @ObfuscatedName("ba.a")
    public class70[] field1236 = new class70[8];

    @ObfuscatedName("ba.am")
    public class70[] field1250 = new class70[8];

    @ObfuscatedName("fc.i(Lef;Ljava/awt/Component;IIB)Lba;")
    public static final class60 method3061(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1240 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1235 = new int[256 * (Statics.field3222 ? 2 : 1)];
                var4.field1231 = arg3;
                var4.method1189(arg1);
                var4.field1239 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1239 > 16384) {
                    var4.field1239 = 16384;
                }
                var4.method1190(var4.field1239);
                if (Statics.field1232 > 0 && Statics.field1241 == null) {
                    Statics.field1241 = new class76();
                    Statics.field1241.field1411 = arg0;
                    arg0.method2773(Statics.field1241, Statics.field1232);
                }
                if (Statics.field1241 != null) {
                    if (Statics.field1241.field1410[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1241.field1410[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ba.h(Lbf;I)V")
    public final synchronized void method1228(class70 arg0) {
        this.field1252 = arg0;
    }

    @ObfuscatedName("ba.e(I)V")
    public final synchronized void method1205() {
        if (this.field1235 == null) {
            return;
        }
        long var1 = class119.method719();
        try {
            if (this.field1242 != 0L) {
                if (var1 < this.field1242) {
                    return;
                }
                this.method1190(this.field1239);
                this.field1242 = 0L;
                this.field1247 = true;
            }
            int var3 = this.method1191();
            if (this.field1245 - var3 > this.field1243) {
                this.field1243 = this.field1245 - var3;
            }
            int var4 = this.field1233 + this.field1231;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1239) {
                this.field1239 += 1024;
                if (this.field1239 > 16384) {
                    this.field1239 = 16384;
                }
                this.method1193();
                this.method1190(this.field1239);
                var3 = 0;
                this.field1247 = true;
                if (var4 + 256 > this.field1239) {
                    var4 = this.field1239 - 256;
                    this.field1233 = var4 - this.field1231;
                }
            }
            while (var3 < var4) {
                this.method1211(this.field1235, 256);
                this.method1192();
                var3 += 256;
            }
            if (var1 > this.field1246) {
                if (this.field1247) {
                    this.field1247 = false;
                } else if (this.field1243 == 0 && this.field1244 == 0) {
                    this.method1193();
                    this.field1242 = var1 + 2000L;
                    return;
                } else {
                    this.field1233 = Math.min(this.field1244, this.field1243);
                    this.field1244 = this.field1243;
                }
                this.field1243 = 0;
                this.field1246 = var1 + 2000L;
            }
            this.field1245 = var3;
        } catch (Exception var8) {
            this.method1193();
            this.field1242 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1238 + 500000L) {
                var1 = this.field1238;
            }
            while (var1 > this.field1238 + 5000L) {
                this.method1186(256);
                this.field1238 += (long) (256000 / Statics.field1240);
            }
        } catch (Exception var7) {
            this.field1238 = var1;
        }
    }

    @ObfuscatedName("ba.g(B)V")
    public final void method1221() {
        this.field1247 = true;
    }

    @ObfuscatedName("ba.n(S)V")
    public final synchronized void method1183() {
        this.field1247 = true;
        try {
            this.method1194();
        } catch (Exception var2) {
            this.method1193();
            this.field1242 = class119.method719() + 2000L;
        }
    }

    @ObfuscatedName("ba.u(B)V")
    public final synchronized void method1224() {
        if (Statics.field1241 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1241.field1410[var2] == this) {
                    Statics.field1241.field1410[var2] = null;
                }
                if (Statics.field1241.field1410[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1241.field1404 = true;
                while (Statics.field1241.field1405) {
                    class131.method3297(50L);
                }
                Statics.field1241 = null;
            }
        }
        this.method1193();
        this.field1235 = null;
    }

    @ObfuscatedName("ba.d(II)V")
    public final void method1186(int arg0) {
        this.field1248 -= arg0;
        if (this.field1248 < 0) {
            this.field1248 = 0;
        }
        if (this.field1252 != null) {
            this.field1252.method1169(arg0);
        }
    }

    @ObfuscatedName("ba.l([II)V")
    public final void method1211(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field3222) {
            var3 = arg1 << 1;
        }
        class124.method2614(arg0, 0, var3);
        this.field1248 -= arg1;
        if (this.field1252 != null && this.field1248 <= 0) {
            this.field1248 += Statics.field1240 >> 4;
            method536(this.field1252);
            this.method1182(this.field1252, this.field1252.method1425());
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
                        class70 var11 = this.field1236[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field1318;
                                if (var12 == null || var12.field1317 <= var8) {
                                    var11.field1321 = true;
                                    int var13 = var11.method1150();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1317 += var13;
                                    }
                                    if (var4 >= this.field1237) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1148();
                                    if (var14 != null) {
                                        int var15 = var11.field1320;
                                        while (var14 != null) {
                                            this.method1182(var14, var15 * var14.method1425() >> 8);
                                            var14 = var11.method1149();
                                        }
                                    }
                                    class70 var16 = var11.field1319;
                                    var11.field1319 = null;
                                    if (var10 == null) {
                                        this.field1236[var7] = var16;
                                    } else {
                                        var10.field1319 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1250[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1319;
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
                class70 var18 = this.field1236[var17];
                class70[] var19 = this.field1236;
                this.field1250[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1319;
                    var18.field1319 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1248 < 0) {
            this.field1248 = 0;
        }
        if (this.field1252 != null) {
            this.field1252.method1151(arg0, 0, arg1);
        }
        this.field1238 = class119.method719();
    }

    @ObfuscatedName("o.m(Lbf;B)V")
    public static final void method536(class70 arg0) {
        arg0.field1321 = false;
        if (arg0.field1318 != null) {
            arg0.field1318.field1317 = 0;
        }
        for (class70 var1 = arg0.method1148(); var1 != null; var1 = arg0.method1149()) {
            method536(var1);
        }
    }

    @ObfuscatedName("ba.j(Lbf;II)V")
    public final void method1182(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1250[var3];
        if (var4 == null) {
            this.field1236[var3] = arg0;
        } else {
            var4.field1319 = arg0;
        }
        this.field1250[var3] = arg0;
        arg0.field1320 = arg1;
    }

    @ObfuscatedName("ba.y(Ljava/awt/Component;B)V")
    public void method1189(Component arg0) throws Exception {
    }

    @ObfuscatedName("ba.s(II)V")
    public void method1190(int arg0) throws Exception {
    }

    @ObfuscatedName("ba.p(I)I")
    public int method1191() throws Exception {
        return this.field1239;
    }

    @ObfuscatedName("ba.v()V")
    public void method1192() throws Exception {
    }

    @ObfuscatedName("ba.r(I)V")
    public void method1193() {
    }

    @ObfuscatedName("ba.c(I)V")
    public void method1194() throws Exception {
    }
}
