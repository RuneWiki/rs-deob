package deob;

@ObfuscatedName("bx")
public final class class75 extends class79 {

    @ObfuscatedName("bx.w")
    public String field907;

    @ObfuscatedName("bx.o")
    public class217 field895;

    @ObfuscatedName("bx.x")
    public int field894 = -1;

    @ObfuscatedName("bx.k")
    public int field897 = -1;

    @ObfuscatedName("bx.i")
    public String[] field899 = new String[3];

    @ObfuscatedName("bx.j")
    public int field898;

    @ObfuscatedName("bx.m")
    public int field912;

    @ObfuscatedName("bx.u")
    public int field900;

    @ObfuscatedName("bx.r")
    public int field902;

    @ObfuscatedName("bx.v")
    public int field903;

    @ObfuscatedName("bx.h")
    public int field904;

    @ObfuscatedName("bx.a")
    public int field905;

    @ObfuscatedName("bx.p")
    public int field910;

    @ObfuscatedName("bx.q")
    public class134 field901;

    @ObfuscatedName("bx.l")
    public int field908;

    @ObfuscatedName("bx.c")
    public int field909;

    @ObfuscatedName("bx.n")
    public int field915;

    @ObfuscatedName("bx.z")
    public int field911;

    @ObfuscatedName("bx.e")
    public boolean field906;

    @ObfuscatedName("bx.g")
    public int field913;

    @ObfuscatedName("bx.d")
    public boolean field914;

    @ObfuscatedName("bx.y")
    public int field896;

    @ObfuscatedName("bx.t")
    public int field916;

    @ObfuscatedName("bx.b")
    public boolean field917;

    @ObfuscatedName("bx.s")
    public int field918;

    @ObfuscatedName("bx.ap")
    public int field919;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field899[var1] = "";
        }
        this.field898 = 0;
        this.field912 = 0;
        this.field902 = 0;
        this.field903 = 0;
        this.field906 = false;
        this.field913 = 0;
        this.field914 = false;
        this.field917 = false;
    }

    @ObfuscatedName("bx.w(Lfi;B)V")
    public final void method1015(class177 arg0) {
        arg0.field2412 = 0;
        int var2 = arg0.method2931();
        this.field894 = arg0.method2885();
        this.field897 = arg0.method2885();
        int var3 = -1;
        this.field913 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2931();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2931();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2886();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class260.method3915(var4[var5] - 512).field3552;
                    if (var8 != 0) {
                        this.field913 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2931();
            if (var11 < 0 || var11 >= Statics.field3738[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1246 = arg0.method2886();
        if (this.field1246 == 65535) {
            this.field1246 = -1;
        }
        this.field1241 = arg0.method2886();
        if (this.field1241 == 65535) {
            this.field1241 = -1;
        }
        this.field1235 = this.field1241;
        this.field1268 = arg0.method2886();
        if (this.field1268 == 65535) {
            this.field1268 = -1;
        }
        this.field1244 = arg0.method2886();
        if (this.field1244 == 65535) {
            this.field1244 = -1;
        }
        this.field1245 = arg0.method2886();
        if (this.field1245 == 65535) {
            this.field1245 = -1;
        }
        this.field1288 = arg0.method2886();
        if (this.field1288 == 65535) {
            this.field1288 = -1;
        }
        this.field1247 = arg0.method2886();
        if (this.field1247 == 65535) {
            this.field1247 = -1;
        }
        this.field907 = arg0.method2892();
        if (Statics.field844 == this) {
            Statics.field2232 = this.field907;
        }
        this.field898 = arg0.method2931();
        this.field912 = arg0.method2886();
        this.field914 = arg0.method2931() == 1;
        if (client.field930 == 0 && client.field1095 >= 2) {
            this.field914 = false;
        }
        if (this.field895 == null) {
            this.field895 = new class217();
        }
        this.field895.method3631(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bx.o(I)I")
    public int method1016() {
        return this.field895 == null || this.field895.field2627 == -1 ? 1 : class262.method1007(this.field895.field2627).field3570;
    }

    @ObfuscatedName("bx.x(I)Lev;")
    public final class134 method1017() {
        if (this.field895 == null) {
            return null;
        }
        class264 var1 = this.field1267 != -1 && this.field1270 == 0 ? class264.method3098(this.field1267) : null;
        class264 var2 = this.field1242 == -1 || this.field906 || this.field1246 == this.field1242 && var1 != null ? null : class264.method3098(this.field1242);
        class134 var3 = this.field895.method3615(var1, this.field1279, var2, this.field1265);
        if (var3 == null) {
            return null;
        }
        var3.method2303();
        this.field1285 = var3.field2130;
        if (!this.field906 && this.field1292 != -1 && this.field1273 != -1) {
            class134 var4 = Statics.method3709(this.field1292).method3940(this.field1273);
            if (var4 != null) {
                var4.method2285(0, -this.field1276, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field906 && this.field901 != null) {
            if (client.field936 >= this.field903) {
                this.field901 = null;
            }
            if (client.field936 >= this.field902 && client.field936 < this.field903) {
                class134 var6 = this.field901;
                var6.method2285(this.field904 - this.field1264, this.field905 - this.field900, this.field910 - this.field1236);
                if (this.field1286 == 512) {
                    var6.method2261();
                    var6.method2261();
                    var6.method2261();
                } else if (this.field1286 == 1024) {
                    var6.method2261();
                    var6.method2261();
                } else if (this.field1286 == 1536) {
                    var6.method2261();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1286 == 512) {
                    var6.method2261();
                } else if (this.field1286 == 1024) {
                    var6.method2261();
                    var6.method2261();
                } else if (this.field1286 == 1536) {
                    var6.method2261();
                    var6.method2261();
                    var6.method2261();
                }
                var6.method2285(this.field1264 - this.field904, this.field900 - this.field905, this.field1236 - this.field910);
            }
        }
        var3.field1975 = true;
        return var3;
    }

    @ObfuscatedName("bx.k(IIBB)V")
    public final void method1018(int arg0, int arg1, byte arg2) {
        if (this.field1267 != -1 && class264.method3098(this.field1267).field3632 == 1) {
            this.field1267 = -1;
        }
        this.field1263 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1034(arg0, arg1);
        } else if (this.field1255[0] >= 0 && this.field1255[0] < 104 && this.field1291[0] >= 0 && this.field1291[0] < 104) {
            if (arg2 == 2) {
                client.method2729(this, arg0, arg1, (byte) 2);
            }
            this.method1019(arg0, arg1, arg2);
        } else {
            this.method1034(arg0, arg1);
        }
    }

    @ObfuscatedName("bx.f(III)V")
    public void method1034(int arg0, int arg1) {
        this.field1289 = 0;
        this.field1294 = 0;
        this.field1293 = 0;
        this.field1255[0] = arg0;
        this.field1291[0] = arg1;
        int var3 = this.method1016();
        this.field1264 = this.field1255[0] * 128 + var3 * 64;
        this.field1236 = this.field1291[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bx.i(IIBI)V")
    public final void method1019(int arg0, int arg1, byte arg2) {
        if (this.field1289 < 9) {
            this.field1289++;
        }
        for (int var4 = this.field1289; var4 > 0; var4--) {
            this.field1255[var4] = this.field1255[var4 - 1];
            this.field1291[var4] = this.field1291[var4 - 1];
            this.field1259[var4] = this.field1259[var4 - 1];
        }
        this.field1255[0] = arg0;
        this.field1291[0] = arg1;
        this.field1259[0] = arg2;
    }

    @ObfuscatedName("bx.j(I)Z")
    public final boolean method1020() {
        return this.field895 != null;
    }
}
