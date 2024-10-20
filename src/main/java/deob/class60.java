package deob;

import java.awt.Component;

@ObfuscatedName("ba")
public class class60 {

    @ObfuscatedName("ba.b")
    public int[] field1248;

    @ObfuscatedName("ba.u")
    public class70 field1249;

    @ObfuscatedName("ba.o")
    public int field1259 = 32;

    @ObfuscatedName("ba.p")
    public long field1251 = class119.method415();

    @ObfuscatedName("ba.i")
    public int field1255;

    @ObfuscatedName("ba.q")
    public int field1242;

    @ObfuscatedName("ba.g")
    public int field1254;

    @ObfuscatedName("ba.j")
    public long field1263 = 0L;

    @ObfuscatedName("ba.w")
    public int field1256 = 0;

    @ObfuscatedName("ba.x")
    public int field1257 = 0;

    @ObfuscatedName("ba.f")
    public int field1258 = 0;

    @ObfuscatedName("ba.t")
    public long field1265 = 0L;

    @ObfuscatedName("ba.z")
    public boolean field1260 = true;

    @ObfuscatedName("ba.d")
    public int field1252 = 0;

    @ObfuscatedName("ba.s")
    public class70[] field1262 = new class70[8];

    @ObfuscatedName("ba.ah")
    public class70[] field1250 = new class70[8];

    @ObfuscatedName("al.e(Lec;Ljava/awt/Component;III)Lba;")
    public static final class60 method659(class140 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1261 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class73 var4 = new class73();
                var4.field1248 = new int[(Statics.field1243 ? 2 : 1) * 256];
                var4.field1242 = arg3;
                var4.method1252(arg1);
                var4.field1255 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1255 > 16384) {
                    var4.field1255 = 16384;
                }
                var4.method1253(var4.field1255);
                if (Statics.field1244 > 0 && Statics.field1245 == null) {
                    Statics.field1245 = new class76();
                    Statics.field1245.field1424 = arg0;
                    arg0.method2852(Statics.field1245, Statics.field1244);
                }
                if (Statics.field1245 != null) {
                    if (Statics.field1245.field1419[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1245.field1419[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class60();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ba.l(Lbj;I)V")
    public final synchronized void method1244(class70 arg0) {
        this.field1249 = arg0;
    }

    @ObfuscatedName("ba.c(I)V")
    public final synchronized void method1245() {
        if (this.field1248 == null) {
            return;
        }
        long var1 = class119.method415();
        try {
            if (this.field1263 != 0L) {
                if (var1 < this.field1263) {
                    return;
                }
                this.method1253(this.field1255);
                this.field1263 = 0L;
                this.field1260 = true;
            }
            int var3 = this.method1254();
            if (this.field1258 - var3 > this.field1256) {
                this.field1256 = this.field1258 - var3;
            }
            int var4 = this.field1254 + this.field1242;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1255) {
                this.field1255 += 1024;
                if (this.field1255 > 16384) {
                    this.field1255 = 16384;
                }
                this.method1256();
                this.method1253(this.field1255);
                var3 = 0;
                this.field1260 = true;
                if (var4 + 256 > this.field1255) {
                    var4 = this.field1255 - 256;
                    this.field1254 = var4 - this.field1242;
                }
            }
            while (var3 < var4) {
                this.method1294(this.field1248, 256);
                this.method1255();
                var3 += 256;
            }
            if (var1 > this.field1265) {
                if (this.field1260) {
                    this.field1260 = false;
                } else if (this.field1256 == 0 && this.field1257 == 0) {
                    this.method1256();
                    this.field1263 = var1 + 2000L;
                    return;
                } else {
                    this.field1254 = Math.min(this.field1257, this.field1256);
                    this.field1257 = this.field1256;
                }
                this.field1256 = 0;
                this.field1265 = var1 + 2000L;
            }
            this.field1258 = var3;
        } catch (Exception var8) {
            this.method1256();
            this.field1263 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1251 + 500000L) {
                var1 = this.field1251;
            }
            while (var1 > this.field1251 + 5000L) {
                this.method1249(256);
                this.field1251 += (long) (256000 / Statics.field1261);
            }
        } catch (Exception var7) {
            this.field1251 = var1;
        }
    }

    @ObfuscatedName("ba.h(B)V")
    public final void method1246() {
        this.field1260 = true;
    }

    @ObfuscatedName("ba.r(I)V")
    public final synchronized void method1247() {
        this.field1260 = true;
        try {
            this.method1257();
        } catch (Exception var2) {
            this.method1256();
            this.field1263 = class119.method415() + 2000L;
        }
    }

    @ObfuscatedName("ba.a(I)V")
    public final synchronized void method1248() {
        if (Statics.field1245 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1245.field1419[var2] == this) {
                    Statics.field1245.field1419[var2] = null;
                }
                if (Statics.field1245.field1419[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1245.field1420 = true;
                while (Statics.field1245.field1418) {
                    class131.method2735(50L);
                }
                Statics.field1245 = null;
            }
        }
        this.method1256();
        this.field1248 = null;
    }

    @ObfuscatedName("ba.b(II)V")
    public final void method1249(int arg0) {
        this.field1252 -= arg0;
        if (this.field1252 < 0) {
            this.field1252 = 0;
        }
        if (this.field1249 != null) {
            this.field1249.method1217(arg0);
        }
    }

    @ObfuscatedName("ba.u([II)V")
    public final void method1294(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1243) {
            var3 = arg1 << 1;
        }
        class124.method2683(arg0, 0, var3);
        this.field1252 -= arg1;
        if (this.field1249 != null && this.field1252 <= 0) {
            this.field1252 += Statics.field1261 >> 4;
            method2839(this.field1249);
            this.method1251(this.field1249, this.field1249.method1380());
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
                        class70 var11 = this.field1262[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field1334;
                                if (var12 == null || var12.field1333 <= var8) {
                                    var11.field1337 = true;
                                    int var13 = var11.method1213();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1333 += var13;
                                    }
                                    if (var4 >= this.field1259) {
                                        break label105;
                                    }
                                    class70 var14 = var11.method1211();
                                    if (var14 != null) {
                                        int var15 = var11.field1335;
                                        while (var14 != null) {
                                            this.method1251(var14, var15 * var14.method1380() >> 8);
                                            var14 = var11.method1225();
                                        }
                                    }
                                    class70 var16 = var11.field1336;
                                    var11.field1336 = null;
                                    if (var10 == null) {
                                        this.field1262[var7] = var16;
                                    } else {
                                        var10.field1336 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1250[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1336;
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
                class70 var18 = this.field1262[var17];
                class70[] var19 = this.field1262;
                this.field1250[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class70 var21 = var18.field1336;
                    var18.field1336 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1252 < 0) {
            this.field1252 = 0;
        }
        if (this.field1249 != null) {
            this.field1249.method1214(arg0, 0, arg1);
        }
        this.field1251 = class119.method415();
    }

    @ObfuscatedName("ec.o(Lbj;I)V")
    public static final void method2839(class70 arg0) {
        arg0.field1337 = false;
        if (arg0.field1334 != null) {
            arg0.field1334.field1333 = 0;
        }
        for (class70 var1 = arg0.method1211(); var1 != null; var1 = arg0.method1225()) {
            method2839(var1);
        }
    }

    @ObfuscatedName("ba.p(Lbj;II)V")
    public final void method1251(class70 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class70 var4 = this.field1250[var3];
        if (var4 == null) {
            this.field1262[var3] = arg0;
        } else {
            var4.field1336 = arg0;
        }
        this.field1250[var3] = arg0;
        arg0.field1335 = arg1;
    }

    @ObfuscatedName("ba.i(Ljava/awt/Component;B)V")
    public void method1252(Component arg0) throws Exception {
    }

    @ObfuscatedName("ba.q(II)V")
    public void method1253(int arg0) throws Exception {
    }

    @ObfuscatedName("ba.g(I)I")
    public int method1254() throws Exception {
        return this.field1255;
    }

    @ObfuscatedName("ba.j()V")
    public void method1255() throws Exception {
    }

    @ObfuscatedName("ba.w(I)V")
    public void method1256() {
    }

    @ObfuscatedName("ba.x(B)V")
    public void method1257() throws Exception {
    }
}
