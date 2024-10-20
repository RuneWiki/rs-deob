package deob;

import java.awt.Component;

@ObfuscatedName("bb")
public class class60 {

    @ObfuscatedName("bb.l")
    public int[] field1226;

    @ObfuscatedName("bb.m")
    public class70 field1238;

    @ObfuscatedName("bb.p")
    public int field1223 = 32;

    @ObfuscatedName("bb.f")
    public long field1240 = class119.method698();

    @ObfuscatedName("bb.d")
    public int field1227;

    @ObfuscatedName("bb.v")
    public int field1231;

    @ObfuscatedName("bb.q")
    public int field1228;

    @ObfuscatedName("bb.t")
    public long field1233 = 0L;

    @ObfuscatedName("bb.g")
    public int field1234 = 0;

    @ObfuscatedName("bb.s")
    public int field1224 = 0;

    @ObfuscatedName("bb.h")
    public int field1236 = 0;

    @ObfuscatedName("bb.u")
    public long field1237 = 0L;

    @ObfuscatedName("bb.a")
    public boolean field1235 = true;

    @ObfuscatedName("bb.w")
    public int field1232 = 0;

    @ObfuscatedName("bb.o")
    public class70[] field1241 = new class70[8];

    @ObfuscatedName("bb.ah")
    public class70[] field1242 = new class70[8];

    @ObfuscatedName("w.x(IZII)V")
    public static final void method572(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1229 = arg0;
        Statics.field1230 = arg1;
        Statics.field1225 = arg2;
    }

    @ObfuscatedName("az.r(Leu;Ljava/awt/Component;IIB)Lbb;")
    public static final class60 method653(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1229 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1226 = new int[(Statics.field1230 ? 2 : 1) * 256];
                var4.field1231 = arg3;
                var4.method1191(arg1);
                var4.field1227 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1227 > 16384) {
                    var4.field1227 = 16384;
                }
                var4.method1192(var4.field1227);
                if (Statics.field1225 > 0 && Statics.field2964 == null) {
                    Statics.field2964 = new class76();
                    Statics.field2964.field1397 = arg0;
                    arg0.method2772(Statics.field2964, Statics.field1225);
                }
                if (Statics.field2964 != null) {
                    if (Statics.field2964.field1393[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2964.field1393[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bb.j(Lbd;I)V")
    public final synchronized void method1183(class70 arg0) {
        this.field1238 = arg0;
    }

    @ObfuscatedName("bb.z(B)V")
    public final synchronized void method1184() {
        if (this.field1226 == null) {
            return;
        }
        long var1 = class119.method698();
        try {
            if (this.field1233 != 0L) {
                if (var1 < this.field1233) {
                    return;
                }
                this.method1192(this.field1227);
                this.field1233 = 0L;
                this.field1235 = true;
            }
            int var3 = this.method1193();
            if (this.field1236 - var3 > this.field1234) {
                this.field1234 = this.field1236 - var3;
            }
            int var4 = this.field1231 + this.field1228;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1227) {
                this.field1227 += 1024;
                if (this.field1227 > 16384) {
                    this.field1227 = 16384;
                }
                this.method1235();
                this.method1192(this.field1227);
                var3 = 0;
                this.field1235 = true;
                if (var4 + 256 > this.field1227) {
                    var4 = this.field1227 - 256;
                    this.field1228 = var4 - this.field1231;
                }
            }
            while (var3 < var4) {
                this.method1189(this.field1226, 256);
                this.method1194();
                var3 += 256;
            }
            if (var1 > this.field1237) {
                if (this.field1235) {
                    this.field1235 = false;
                } else if (this.field1234 == 0 && this.field1224 == 0) {
                    this.method1235();
                    this.field1233 = var1 + 2000L;
                    return;
                } else {
                    this.field1228 = Math.min(this.field1224, this.field1234);
                    this.field1224 = this.field1234;
                }
                this.field1234 = 0;
                this.field1237 = var1 + 2000L;
            }
            this.field1236 = var3;
        } catch (Exception var8) {
            this.method1235();
            this.field1233 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1240 + 500000L) {
                var1 = this.field1240;
            }
            while (var1 > this.field1240 + 5000L) {
                this.method1188(256);
                this.field1240 += (long) (256000 / Statics.field1229);
            }
        } catch (Exception var7) {
            this.field1240 = var1;
        }
    }

    @ObfuscatedName("bb.i(S)V")
    public final void method1243() {
        this.field1235 = true;
    }

    @ObfuscatedName("bb.b(I)V")
    public final synchronized void method1232() {
        this.field1235 = true;
        try {
            this.method1185();
        } catch (Exception var2) {
            this.method1235();
            this.field1233 = class119.method698() + 2000L;
        }
    }

    @ObfuscatedName("bb.l(I)V")
    public final synchronized void method1187() {
        if (Statics.field2964 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2964.field1393[var2] == this) {
                    Statics.field2964.field1393[var2] = null;
                }
                if (Statics.field2964.field1393[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2964.field1394 = true;
                while (Statics.field2964.field1395) {
                    class131.method2672(50L);
                }
                Statics.field2964 = null;
            }
        }
        this.method1235();
        this.field1226 = null;
    }

    @ObfuscatedName("bb.m(IB)V")
    public final void method1188(int arg0) {
        this.field1232 -= arg0;
        if (this.field1232 < 0) {
            this.field1232 = 0;
        }
        if (this.field1238 != null) {
            this.field1238.method1158(arg0);
        }
    }

    @ObfuscatedName("bb.p([II)V")
    public final void method1189(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1230) {
            var3 = arg1 << 1;
        }
        class124.method2638(arg0, 0, var3);
        this.field1232 -= arg1;
        if (this.field1238 != null && this.field1232 <= 0) {
            this.field1232 += Statics.field1229 >> 4;
            method1063(this.field1238);
            this.method1190(this.field1238, this.field1238.method1411());
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
                        class70 var11 = this.field1241[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field1310;
                                if (var12 == null || var12.field1307 <= var8) {
                                    var11.field1309 = true;
                                    int var13 = var11.method1147();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1307 += var13;
                                    }
                                    if (var4 >= this.field1223) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1153();
                                    if (var14 != null) {
                                        int var15 = var11.field1308;
                                        while (var14 != null) {
                                            this.method1190(var14, var15 * var14.method1411() >> 8);
                                            var14 = var11.method1155();
                                        }
                                    }
                                    class70 var16 = var11.field1311;
                                    var11.field1311 = null;
                                    if (var10 == null) {
                                        this.field1241[var7] = var16;
                                    } else {
                                        var10.field1311 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1242[var7] = var10;
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
                class70 var18 = this.field1241[var17];
                class70[] var19 = this.field1241;
                this.field1242[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1311;
                    var18.field1311 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1232 < 0) {
            this.field1232 = 0;
        }
        if (this.field1238 != null) {
            this.field1238.method1179(arg0, 0, arg1);
        }
        this.field1240 = class119.method698();
    }

    @ObfuscatedName("bh.f(Lbd;B)V")
    public static final void method1063(class70 arg0) {
        arg0.field1309 = false;
        if (arg0.field1310 != null) {
            arg0.field1310.field1307 = 0;
        }
        for (class70 var1 = arg0.method1153(); var1 != null; var1 = arg0.method1155()) {
            method1063(var1);
        }
    }

    @ObfuscatedName("bb.d(Lbd;IB)V")
    public final void method1190(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1242[var3];
        if (var4 == null) {
            this.field1241[var3] = arg0;
        } else {
            var4.field1311 = arg0;
        }
        this.field1242[var3] = arg0;
        arg0.field1308 = arg1;
    }

    @ObfuscatedName("bb.v(Ljava/awt/Component;B)V")
    public void method1191(Component arg0) throws Exception {
    }

    @ObfuscatedName("bb.q(II)V")
    public void method1192(int arg0) throws Exception {
    }

    @ObfuscatedName("bb.t(I)I")
    public int method1193() throws Exception {
        return this.field1227;
    }

    @ObfuscatedName("bb.g()V")
    public void method1194() throws Exception {
    }

    @ObfuscatedName("bb.s(I)V")
    public void method1235() {
    }

    @ObfuscatedName("bb.h(I)V")
    public void method1185() throws Exception {
    }
}
