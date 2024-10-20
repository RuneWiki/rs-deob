package deob;

@ObfuscatedName("bm")
public final class class75 extends class79 {

    @ObfuscatedName("bm.e")
    public String field895;

    @ObfuscatedName("bm.o")
    public class214 field881;

    @ObfuscatedName("bm.m")
    public int field884 = -1;

    @ObfuscatedName("bm.g")
    public int field896 = -1;

    @ObfuscatedName("bm.b")
    public String[] field885 = new String[3];

    @ObfuscatedName("bm.k")
    public int field886;

    @ObfuscatedName("bm.f")
    public int field902;

    @ObfuscatedName("bm.j")
    public int field888;

    @ObfuscatedName("bm.q")
    public int field900;

    @ObfuscatedName("bm.h")
    public int field903;

    @ObfuscatedName("bm.i")
    public int field891;

    @ObfuscatedName("bm.s")
    public int field908;

    @ObfuscatedName("bm.n")
    public int field893;

    @ObfuscatedName("bm.c")
    public class134 field894;

    @ObfuscatedName("bm.v")
    public int field899;

    @ObfuscatedName("bm.u")
    public int field880;

    @ObfuscatedName("bm.w")
    public int field897;

    @ObfuscatedName("bm.z")
    public int field898;

    @ObfuscatedName("bm.y")
    public boolean field890;

    @ObfuscatedName("bm.p")
    public int field882;

    @ObfuscatedName("bm.l")
    public boolean field901;

    @ObfuscatedName("bm.x")
    public int field889;

    @ObfuscatedName("bm.r")
    public int field883;

    @ObfuscatedName("bm.t")
    public boolean field904;

    @ObfuscatedName("bm.a")
    public int field905;

    @ObfuscatedName("bm.ad")
    public int field906;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field885[var1] = "";
        }
        this.field886 = 0;
        this.field902 = 0;
        this.field900 = 0;
        this.field903 = 0;
        this.field890 = false;
        this.field882 = 0;
        this.field901 = false;
        this.field904 = false;
    }

    @ObfuscatedName("bm.e(Lfw;B)V")
    public final void method1044(class174 arg0) {
        arg0.field2370 = 0;
        int var2 = arg0.method2891();
        this.field884 = arg0.method2944();
        this.field896 = arg0.method2944();
        int var3 = -1;
        this.field882 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2891();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2891();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2930();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method461(var4[var5] - 512).field3470;
                    if (var8 != 0) {
                        this.field882 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2891();
            if (var11 < 0 || var11 >= Statics.field3204[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1276 = arg0.method2930();
        if (this.field1276 == 65535) {
            this.field1276 = -1;
        }
        this.field1278 = arg0.method2930();
        if (this.field1278 == 65535) {
            this.field1278 = -1;
        }
        this.field1235 = this.field1278;
        this.field1236 = arg0.method2930();
        if (this.field1236 == 65535) {
            this.field1236 = -1;
        }
        this.field1274 = arg0.method2930();
        if (this.field1274 == 65535) {
            this.field1274 = -1;
        }
        this.field1238 = arg0.method2930();
        if (this.field1238 == 65535) {
            this.field1238 = -1;
        }
        this.field1239 = arg0.method2930();
        if (this.field1239 == 65535) {
            this.field1239 = -1;
        }
        this.field1255 = arg0.method2930();
        if (this.field1255 == 65535) {
            this.field1255 = -1;
        }
        this.field895 = arg0.method2899();
        if (Statics.field3209 == this) {
            Statics.field2202 = this.field895;
        }
        this.field886 = arg0.method2891();
        this.field902 = arg0.method2930();
        this.field901 = arg0.method2891() == 1;
        if (client.field921 == 0 && client.field1088 >= 2) {
            this.field901 = false;
        }
        if (this.field881 == null) {
            this.field881 = new class214();
        }
        this.field881.method3610(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bm.o(I)I")
    public int method1017() {
        return this.field881 == null || this.field881.field2603 == -1 ? 1 : class259.method3097(this.field881.field2603).field3544;
    }

    @ObfuscatedName("bm.m(B)Leo;")
    public final class134 method1018() {
        if (this.field881 == null) {
            return null;
        }
        class261 var1 = this.field1260 != -1 && this.field1263 == 0 ? class261.method2746(this.field1260) : null;
        class261 var2 = this.field1237 == -1 || this.field890 || this.field1276 == this.field1237 && var1 != null ? null : class261.method2746(this.field1237);
        class134 var3 = this.field881.method3616(var1, this.field1261, var2, this.field1269);
        if (var3 == null) {
            return null;
        }
        var3.method2281();
        this.field1282 = var3.field2121;
        if (!this.field890 && this.field1265 != -1 && this.field1273 != -1) {
            class134 var4 = class246.method707(this.field1265).method3957(this.field1273);
            if (var4 != null) {
                var4.method2291(0, -this.field1275, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field890 && this.field894 != null) {
            if (client.field929 >= this.field903) {
                this.field894 = null;
            }
            if (client.field929 >= this.field900 && client.field929 < this.field903) {
                class134 var6 = this.field894;
                var6.method2291(this.field891 - this.field1243, this.field908 - this.field888, this.field893 - this.field1229);
                if (this.field1247 == 512) {
                    var6.method2288();
                    var6.method2288();
                    var6.method2288();
                } else if (this.field1247 == 1024) {
                    var6.method2288();
                    var6.method2288();
                } else if (this.field1247 == 1536) {
                    var6.method2288();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1247 == 512) {
                    var6.method2288();
                } else if (this.field1247 == 1024) {
                    var6.method2288();
                    var6.method2288();
                } else if (this.field1247 == 1536) {
                    var6.method2288();
                    var6.method2288();
                    var6.method2288();
                }
                var6.method2291(this.field1243 - this.field891, this.field888 - this.field908, this.field1229 - this.field893);
            }
        }
        var3.field1945 = true;
        return var3;
    }

    @ObfuscatedName("bm.g(IIBI)V")
    public final void method1033(int arg0, int arg1, byte arg2) {
        if (this.field1260 != -1 && class261.method2746(this.field1260).field3599 == 1) {
            this.field1260 = -1;
        }
        this.field1256 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1020(arg0, arg1);
        } else if (this.field1283[0] >= 0 && this.field1283[0] < 104 && this.field1284[0] >= 0 && this.field1284[0] < 104) {
            if (arg2 == 2) {
                client.method2714(this, arg0, arg1, (byte) 2);
            }
            this.method1021(arg0, arg1, arg2);
        } else {
            this.method1020(arg0, arg1);
        }
    }

    @ObfuscatedName("bm.d(III)V")
    public void method1020(int arg0, int arg1) {
        this.field1245 = 0;
        this.field1287 = 0;
        this.field1286 = 0;
        this.field1283[0] = arg0;
        this.field1284[0] = arg1;
        int var3 = this.method1017();
        this.field1243 = this.field1283[0] * 128 + var3 * 64;
        this.field1229 = this.field1284[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bm.b(IIBB)V")
    public final void method1021(int arg0, int arg1, byte arg2) {
        if (this.field1245 < 9) {
            this.field1245++;
        }
        for (int var4 = this.field1245; var4 > 0; var4--) {
            this.field1283[var4] = this.field1283[var4 - 1];
            this.field1284[var4] = this.field1284[var4 - 1];
            this.field1285[var4] = this.field1285[var4 - 1];
        }
        this.field1283[0] = arg0;
        this.field1284[0] = arg1;
        this.field1285[0] = arg2;
    }

    @ObfuscatedName("bm.k(B)Z")
    public final boolean method1031() {
        return this.field881 != null;
    }
}
