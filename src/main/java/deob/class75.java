package deob;

@ObfuscatedName("bm")
public final class class75 extends class79 {

    @ObfuscatedName("bm.i")
    public String field906;

    @ObfuscatedName("bm.c")
    public class214 field902;

    @ObfuscatedName("bm.e")
    public int field892 = -1;

    @ObfuscatedName("bm.v")
    public int field900 = -1;

    @ObfuscatedName("bm.y")
    public String[] field893 = new String[3];

    @ObfuscatedName("bm.h")
    public int field896;

    @ObfuscatedName("bm.x")
    public int field897;

    @ObfuscatedName("bm.f")
    public int field898;

    @ObfuscatedName("bm.n")
    public int field899;

    @ObfuscatedName("bm.a")
    public int field903;

    @ObfuscatedName("bm.o")
    public int field901;

    @ObfuscatedName("bm.z")
    public int field895;

    @ObfuscatedName("bm.q")
    public int field911;

    @ObfuscatedName("bm.j")
    public class134 field904;

    @ObfuscatedName("bm.k")
    public int field905;

    @ObfuscatedName("bm.r")
    public int field907;

    @ObfuscatedName("bm.m")
    public int field890;

    @ObfuscatedName("bm.d")
    public int field908;

    @ObfuscatedName("bm.s")
    public boolean field909;

    @ObfuscatedName("bm.g")
    public int field910;

    @ObfuscatedName("bm.w")
    public boolean field914;

    @ObfuscatedName("bm.p")
    public int field912;

    @ObfuscatedName("bm.l")
    public int field913;

    @ObfuscatedName("bm.u")
    public boolean field891;

    @ObfuscatedName("bm.t")
    public int field915;

    @ObfuscatedName("bm.ad")
    public int field916;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field893[var1] = "";
        }
        this.field896 = 0;
        this.field897 = 0;
        this.field899 = 0;
        this.field903 = 0;
        this.field909 = false;
        this.field910 = 0;
        this.field914 = false;
        this.field891 = false;
    }

    @ObfuscatedName("bm.i(Lfx;I)V")
    public final void method1007(class174 arg0) {
        arg0.field2407 = 0;
        int var2 = arg0.method2870();
        this.field892 = arg0.method2938();
        this.field900 = arg0.method2938();
        int var3 = -1;
        this.field910 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2870();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2870();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2872();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method2996(var4[var5] - 512).field3531;
                    if (var8 != 0) {
                        this.field910 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2870();
            if (var11 < 0 || var11 >= Statics.field2628[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1284 = arg0.method2872();
        if (this.field1284 == 65535) {
            this.field1284 = -1;
        }
        this.field1249 = arg0.method2872();
        if (this.field1249 == 65535) {
            this.field1249 = -1;
        }
        this.field1250 = this.field1249;
        this.field1243 = arg0.method2872();
        if (this.field1243 == 65535) {
            this.field1243 = -1;
        }
        this.field1300 = arg0.method2872();
        if (this.field1300 == 65535) {
            this.field1300 = -1;
        }
        this.field1289 = arg0.method2872();
        if (this.field1289 == 65535) {
            this.field1289 = -1;
        }
        this.field1254 = arg0.method2872();
        if (this.field1254 == 65535) {
            this.field1254 = -1;
        }
        this.field1255 = arg0.method2872();
        if (this.field1255 == 65535) {
            this.field1255 = -1;
        }
        this.field906 = arg0.method2878();
        if (Statics.field1321 == this) {
            Statics.field2239 = this.field906;
        }
        this.field896 = arg0.method2870();
        this.field897 = arg0.method2872();
        this.field914 = arg0.method2870() == 1;
        if (client.field932 == 0 && client.field1098 >= 2) {
            this.field914 = false;
        }
        if (this.field902 == null) {
            this.field902 = new class214();
        }
        this.field902.method3606(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bm.c(I)I")
    public int method1022() {
        return this.field902 == null || this.field902.field2621 == -1 ? 1 : class259.method3724(this.field902.field2621).field3578;
    }

    @ObfuscatedName("bm.e(I)Led;")
    public final class134 method1026() {
        if (this.field902 == null) {
            return null;
        }
        class261 var1 = this.field1247 != -1 && this.field1278 == 0 ? class261.method3748(this.field1247) : null;
        class261 var2 = this.field1272 == -1 || this.field909 || this.field1284 == this.field1272 && var1 != null ? null : class261.method3748(this.field1272);
        class134 var3 = this.field902.method3612(var1, this.field1276, var2, this.field1273);
        if (var3 == null) {
            return null;
        }
        var3.method2277();
        this.field1293 = var3.field2141;
        if (!this.field909 && this.field1280 != -1 && this.field1281 != -1) {
            class134 var4 = class246.method1412(this.field1280).method3990(this.field1281);
            if (var4 != null) {
                var4.method2294(0, -this.field1303, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field909 && this.field904 != null) {
            if (client.field938 >= this.field903) {
                this.field904 = null;
            }
            if (client.field938 >= this.field899 && client.field938 < this.field903) {
                class134 var6 = this.field904;
                var6.method2294(this.field901 - this.field1275, this.field895 - this.field898, this.field911 - this.field1244);
                if (this.field1260 == 512) {
                    var6.method2283();
                    var6.method2283();
                    var6.method2283();
                } else if (this.field1260 == 1024) {
                    var6.method2283();
                    var6.method2283();
                } else if (this.field1260 == 1536) {
                    var6.method2283();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1260 == 512) {
                    var6.method2283();
                } else if (this.field1260 == 1024) {
                    var6.method2283();
                    var6.method2283();
                } else if (this.field1260 == 1536) {
                    var6.method2283();
                    var6.method2283();
                    var6.method2283();
                }
                var6.method2294(this.field1275 - this.field901, this.field898 - this.field895, this.field1244 - this.field911);
            }
        }
        var3.field1988 = true;
        return var3;
    }

    @ObfuscatedName("bm.v(IIBI)V")
    public final void method1010(int arg0, int arg1, byte arg2) {
        if (this.field1247 != -1 && class261.method3748(this.field1247).field3599 == 1) {
            this.field1247 = -1;
        }
        this.field1271 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1011(arg0, arg1);
        } else if (this.field1298[0] >= 0 && this.field1298[0] < 104 && this.field1299[0] >= 0 && this.field1299[0] < 104) {
            if (arg2 == 2) {
                client.method443(this, arg0, arg1, (byte) 2);
            }
            this.method1017(arg0, arg1, arg2);
        } else {
            this.method1011(arg0, arg1);
        }
    }

    @ObfuscatedName("bm.b(III)V")
    public void method1011(int arg0, int arg1) {
        this.field1264 = 0;
        this.field1302 = 0;
        this.field1301 = 0;
        this.field1298[0] = arg0;
        this.field1299[0] = arg1;
        int var3 = this.method1022();
        this.field1275 = this.field1298[0] * 128 + var3 * 64;
        this.field1244 = this.field1299[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bm.y(IIBI)V")
    public final void method1017(int arg0, int arg1, byte arg2) {
        if (this.field1264 < 9) {
            this.field1264++;
        }
        for (int var4 = this.field1264; var4 > 0; var4--) {
            this.field1298[var4] = this.field1298[var4 - 1];
            this.field1299[var4] = this.field1299[var4 - 1];
            this.field1258[var4] = this.field1258[var4 - 1];
        }
        this.field1298[0] = arg0;
        this.field1299[0] = arg1;
        this.field1258[0] = arg2;
    }

    @ObfuscatedName("bm.h(I)Z")
    public final boolean method1006() {
        return this.field902 != null;
    }
}
