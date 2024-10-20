package deob;

import java.awt.Component;

@ObfuscatedName("bo")
public class class60 {

    @ObfuscatedName("bo.m")
    public int[] field1224;

    @ObfuscatedName("bo.k")
    public class70 field1225;

    @ObfuscatedName("bo.c")
    public int field1226 = 32;

    @ObfuscatedName("bo.w")
    public long field1227 = class119.method137();

    @ObfuscatedName("bo.l")
    public int field1228;

    @ObfuscatedName("bo.h")
    public int field1219;

    @ObfuscatedName("bo.i")
    public int field1230;

    @ObfuscatedName("bo.u")
    public long field1231 = 0L;

    @ObfuscatedName("bo.x")
    public int field1239 = 0;

    @ObfuscatedName("bo.d")
    public int field1233 = 0;

    @ObfuscatedName("bo.o")
    public int field1234 = 0;

    @ObfuscatedName("bo.j")
    public long field1221 = 0L;

    @ObfuscatedName("bo.q")
    public boolean field1222 = true;

    @ObfuscatedName("bo.s")
    public int field1238 = 0;

    @ObfuscatedName("bo.g")
    public class70[] field1232 = new class70[8];

    @ObfuscatedName("bo.aj")
    public class70[] field1240 = new class70[8];

    @ObfuscatedName("w.f(IZII)V")
    public static final void method112(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1236 = arg0;
        Statics.field1220 = arg1;
        Statics.field1242 = arg2;
    }

    @ObfuscatedName("ez.e(Let;Ljava/awt/Component;IIB)Lbo;")
    public static final class60 method2962(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1236 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1224 = new int[256 * (Statics.field1220 ? 2 : 1)];
                var4.field1219 = arg3;
                var4.method1209(arg1);
                var4.field1228 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1228 > 16384) {
                    var4.field1228 = 16384;
                }
                var4.method1222(var4.field1228);
                if (Statics.field1242 > 0 && Statics.field1241 == null) {
                    Statics.field1241 = new class76();
                    Statics.field1241.field1400 = arg0;
                    arg0.method2768(Statics.field1241, Statics.field1242);
                }
                if (Statics.field1241 != null) {
                    if (Statics.field1241.field1395[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1241.field1395[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bo.n(Lbx;I)V")
    public final synchronized void method1247(class70 arg0) {
        this.field1225 = arg0;
    }

    @ObfuscatedName("bo.t(I)V")
    public final synchronized void method1202() {
        if (this.field1224 == null) {
            return;
        }
        long var1 = class119.method137();
        try {
            if (this.field1231 != 0L) {
                if (var1 < this.field1231) {
                    return;
                }
                this.method1222(this.field1228);
                this.field1231 = 0L;
                this.field1222 = true;
            }
            int var3 = this.method1207();
            if (this.field1234 - var3 > this.field1239) {
                this.field1239 = this.field1234 - var3;
            }
            int var4 = this.field1230 + this.field1219;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1228) {
                this.field1228 += 1024;
                if (this.field1228 > 16384) {
                    this.field1228 = 16384;
                }
                this.method1213();
                this.method1222(this.field1228);
                var3 = 0;
                this.field1222 = true;
                if (var4 + 256 > this.field1228) {
                    var4 = this.field1228 - 256;
                    this.field1230 = var4 - this.field1219;
                }
            }
            while (var3 < var4) {
                this.method1232(this.field1224, 256);
                this.method1212();
                var3 += 256;
            }
            if (var1 > this.field1221) {
                if (this.field1222) {
                    this.field1222 = false;
                } else if (this.field1239 == 0 && this.field1233 == 0) {
                    this.method1213();
                    this.field1231 = var1 + 2000L;
                    return;
                } else {
                    this.field1230 = Math.min(this.field1233, this.field1239);
                    this.field1233 = this.field1239;
                }
                this.field1239 = 0;
                this.field1221 = var1 + 2000L;
            }
            this.field1234 = var3;
        } catch (Exception var8) {
            this.method1213();
            this.field1231 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1227 + 500000L) {
                var1 = this.field1227;
            }
            while (var1 > this.field1227 + 5000L) {
                this.method1206(256);
                this.field1227 += (long) (256000 / Statics.field1236);
            }
        } catch (Exception var7) {
            this.field1227 = var1;
        }
    }

    @ObfuscatedName("bo.v(I)V")
    public final void method1203() {
        this.field1222 = true;
    }

    @ObfuscatedName("bo.b(I)V")
    public final synchronized void method1204() {
        this.field1222 = true;
        try {
            this.method1214();
        } catch (Exception var2) {
            this.method1213();
            this.field1231 = class119.method137() + 2000L;
        }
    }

    @ObfuscatedName("bo.m(I)V")
    public final synchronized void method1205() {
        if (Statics.field1241 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1241.field1395[var2] == this) {
                    Statics.field1241.field1395[var2] = null;
                }
                if (Statics.field1241.field1395[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1241.field1397 = true;
                while (Statics.field1241.field1398) {
                    class131.method2276(50L);
                }
                Statics.field1241 = null;
            }
        }
        this.method1213();
        this.field1224 = null;
    }

    @ObfuscatedName("bo.k(II)V")
    public final void method1206(int arg0) {
        this.field1238 -= arg0;
        if (this.field1238 < 0) {
            this.field1238 = 0;
        }
        if (this.field1225 != null) {
            this.field1225.method1161(arg0);
        }
    }

    @ObfuscatedName("bo.c([II)V")
    public final void method1232(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1220) {
            var3 = arg1 << 1;
        }
        class124.method2607(arg0, 0, var3);
        this.field1238 -= arg1;
        if (this.field1225 != null && this.field1238 <= 0) {
            this.field1238 += Statics.field1236 >> 4;
            method89(this.field1225);
            this.method1208(this.field1225, this.field1225.method1387());
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
                        class70 var11 = this.field1232[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field1313;
                                if (var12 == null || var12.field1310 <= var8) {
                                    var11.field1314 = true;
                                    int var13 = var11.method1158();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1310 += var13;
                                    }
                                    if (var4 >= this.field1226) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1156();
                                    if (var14 != null) {
                                        int var15 = var11.field1312;
                                        while (var14 != null) {
                                            this.method1208(var14, var15 * var14.method1387() >> 8);
                                            var14 = var11.method1157();
                                        }
                                    }
                                    class70 var16 = var11.field1311;
                                    var11.field1311 = null;
                                    if (var10 == null) {
                                        this.field1232[var7] = var16;
                                    } else {
                                        var10.field1311 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1240[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1311;
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
                class70 var18 = this.field1232[var17];
                class70[] var19 = this.field1232;
                this.field1240[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1311;
                    var18.field1311 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1238 < 0) {
            this.field1238 = 0;
        }
        if (this.field1225 != null) {
            this.field1225.method1159(arg0, 0, arg1);
        }
        this.field1227 = class119.method137();
    }

    @ObfuscatedName("m.w(Lbx;I)V")
    public static final void method89(class70 arg0) {
        arg0.field1314 = false;
        if (arg0.field1313 != null) {
            arg0.field1313.field1310 = 0;
        }
        for (class70 var1 = arg0.method1156(); var1 != null; var1 = arg0.method1157()) {
            method89(var1);
        }
    }

    @ObfuscatedName("bo.l(Lbx;IB)V")
    public final void method1208(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1240[var3];
        if (var4 == null) {
            this.field1232[var3] = arg0;
        } else {
            var4.field1311 = arg0;
        }
        this.field1240[var3] = arg0;
        arg0.field1312 = arg1;
    }

    @ObfuscatedName("bo.h(Ljava/awt/Component;B)V")
    public void method1209(Component arg0) throws Exception {
    }

    @ObfuscatedName("bo.i(II)V")
    public void method1222(int arg0) throws Exception {
    }

    @ObfuscatedName("bo.u(B)I")
    public int method1207() throws Exception {
        return this.field1228;
    }

    @ObfuscatedName("bo.x()V")
    public void method1212() throws Exception {
    }

    @ObfuscatedName("bo.d(B)V")
    public void method1213() {
    }

    @ObfuscatedName("bo.o(B)V")
    public void method1214() throws Exception {
    }
}
