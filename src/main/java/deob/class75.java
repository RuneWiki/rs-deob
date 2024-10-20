package deob;

@ObfuscatedName("bo")
public final class class75 extends class78 {

    @ObfuscatedName("bo.i")
    public String field925;

    @ObfuscatedName("bo.j")
    public class215 field902;

    @ObfuscatedName("bo.a")
    public int field903 = -1;

    @ObfuscatedName("bo.r")
    public int field904 = -1;

    @ObfuscatedName("bo.n")
    public String[] field905 = new String[3];

    @ObfuscatedName("bo.q")
    public int field907;

    @ObfuscatedName("bo.b")
    public int field919;

    @ObfuscatedName("bo.k")
    public int field909;

    @ObfuscatedName("bo.s")
    public int field930;

    @ObfuscatedName("bo.d")
    public int field922;

    @ObfuscatedName("bo.l")
    public int field912;

    @ObfuscatedName("bo.t")
    public int field928;

    @ObfuscatedName("bo.y")
    public int field914;

    @ObfuscatedName("bo.v")
    public class133 field915;

    @ObfuscatedName("bo.c")
    public int field916;

    @ObfuscatedName("bo.z")
    public int field917;

    @ObfuscatedName("bo.u")
    public int field923;

    @ObfuscatedName("bo.e")
    public int field901;

    @ObfuscatedName("bo.p")
    public boolean field920;

    @ObfuscatedName("bo.m")
    public int field921;

    @ObfuscatedName("bo.x")
    public boolean field926;

    @ObfuscatedName("bo.h")
    public int field911;

    @ObfuscatedName("bo.f")
    public int field924;

    @ObfuscatedName("bo.g")
    public boolean field910;

    @ObfuscatedName("bo.w")
    public int field906;

    @ObfuscatedName("bo.ar")
    public int field927;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field905[var1] = "";
        }
        this.field907 = 0;
        this.field919 = 0;
        this.field930 = 0;
        this.field922 = 0;
        this.field920 = false;
        this.field921 = 0;
        this.field926 = false;
        this.field910 = false;
    }

    @ObfuscatedName("bo.i(Lfp;I)V")
    public final void method1036(class175 arg0) {
        arg0.field2395 = 0;
        int var2 = arg0.method2999();
        this.field903 = arg0.method3172();
        this.field904 = arg0.method3172();
        int var3 = -1;
        this.field921 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2999();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2999();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2995();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class258.method2955(var4[var5] - 512).field3532;
                    if (var8 != 0) {
                        this.field921 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2999();
            if (var11 < 0 || var11 >= Statics.field2629[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1235 = arg0.method2995();
        if (this.field1235 == 65535) {
            this.field1235 = -1;
        }
        this.field1254 = arg0.method2995();
        if (this.field1254 == 65535) {
            this.field1254 = -1;
        }
        this.field1252 = this.field1254;
        this.field1269 = arg0.method2995();
        if (this.field1269 == 65535) {
            this.field1269 = -1;
        }
        this.field1239 = arg0.method2995();
        if (this.field1239 == 65535) {
            this.field1239 = -1;
        }
        this.field1289 = arg0.method2995();
        if (this.field1289 == 65535) {
            this.field1289 = -1;
        }
        this.field1231 = arg0.method2995();
        if (this.field1231 == 65535) {
            this.field1231 = -1;
        }
        this.field1273 = arg0.method2995();
        if (this.field1273 == 65535) {
            this.field1273 = -1;
        }
        this.field925 = arg0.method3002();
        if (Statics.field908 == this) {
            Statics.field2228 = this.field925;
        }
        this.field907 = arg0.method2999();
        this.field919 = arg0.method2995();
        this.field926 = arg0.method2999() == 1;
        if (client.field944 == 0 && client.field1099 >= 2) {
            this.field926 = false;
        }
        if (this.field902 == null) {
            this.field902 = new class215();
        }
        this.field902.method3703(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bo.j(I)I")
    public int method1053() {
        return this.field902 == null || this.field902.field2626 == -1 ? 1 : class260.method2968(this.field902.field2626).field3575;
    }

    @ObfuscatedName("bo.a(I)Lem;")
    public final class133 method1038() {
        if (this.field902 == null) {
            return null;
        }
        class262 var1 = this.field1257 != -1 && this.field1262 == 0 ? class262.method3737(this.field1257) : null;
        class262 var2 = this.field1259 == -1 || this.field920 || this.field1259 == this.field1235 && var1 != null ? null : class262.method3737(this.field1259);
        class133 var3 = this.field902.method3720(var1, this.field1263, var2, this.field1260);
        if (var3 == null) {
            return null;
        }
        var3.method2310();
        this.field1280 = var3.field2129;
        if (!this.field920 && this.field1267 != -1 && this.field1268 != -1) {
            class133 var4 = class247.method80(this.field1267).method4017(this.field1268);
            if (var4 != null) {
                var4.method2321(0, -this.field1271, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (!this.field920 && this.field915 != null) {
            if (client.field973 >= this.field922) {
                this.field915 = null;
            }
            if (client.field973 >= this.field930 && client.field973 < this.field922) {
                class133 var6 = this.field915;
                var6.method2321(this.field912 - this.field1233, this.field928 - this.field909, this.field914 - this.field1232);
                if (this.field1281 == 512) {
                    var6.method2304();
                    var6.method2304();
                    var6.method2304();
                } else if (this.field1281 == 1024) {
                    var6.method2304();
                    var6.method2304();
                } else if (this.field1281 == 1536) {
                    var6.method2304();
                }
                class133[] var7 = new class133[] { var3, var6 };
                var3 = new class133(var7, 2);
                if (this.field1281 == 512) {
                    var6.method2304();
                } else if (this.field1281 == 1024) {
                    var6.method2304();
                    var6.method2304();
                } else if (this.field1281 == 1536) {
                    var6.method2304();
                    var6.method2304();
                    var6.method2304();
                }
                var6.method2321(this.field1233 - this.field912, this.field909 - this.field928, this.field1232 - this.field914);
            }
        }
        var3.field1958 = true;
        return var3;
    }

    @ObfuscatedName("bo.r(IIBI)V")
    public final void method1039(int arg0, int arg1, byte arg2) {
        if (this.field1257 != -1 && class262.method3737(this.field1257).field3609 == 1) {
            this.field1257 = -1;
        }
        this.field1258 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1040(arg0, arg1);
        } else if (this.field1248[0] >= 0 && this.field1248[0] < 104 && this.field1242[0] >= 0 && this.field1242[0] < 104) {
            if (arg2 == 2) {
                class75 var4 = this;
                int var5 = this.field1248[0];
                int var6 = this.field1242[0];
                int var7 = this.method1053();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method1053();
                    client.field964.field2315 = arg0;
                    client.field964.field2316 = arg1;
                    client.field964.field2317 = 1;
                    client.field964.field2318 = 1;
                    class74 var11 = client.field964;
                    int var12 = class164.method1473(var5, var6, var10, var11, client.field1004[this.field911], true, client.field1209, client.field1204);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method1041(client.field1209[var13], client.field1204[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method1041(arg0, arg1, arg2);
        } else {
            this.method1040(arg0, arg1);
        }
    }

    @ObfuscatedName("bo.o(III)V")
    public void method1040(int arg0, int arg1) {
        this.field1284 = 0;
        this.field1250 = 0;
        this.field1288 = 0;
        this.field1248[0] = arg0;
        this.field1242[0] = arg1;
        int var3 = this.method1053();
        this.field1233 = this.field1248[0] * 128 + var3 * 64;
        this.field1232 = this.field1242[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bo.n(IIBI)V")
    public final void method1041(int arg0, int arg1, byte arg2) {
        if (this.field1284 < 9) {
            this.field1284++;
        }
        for (int var4 = this.field1284; var4 > 0; var4--) {
            this.field1248[var4] = this.field1248[var4 - 1];
            this.field1242[var4] = this.field1242[var4 - 1];
            this.field1287[var4] = this.field1287[var4 - 1];
        }
        this.field1248[0] = arg0;
        this.field1242[0] = arg1;
        this.field1287[0] = arg2;
    }

    @ObfuscatedName("bo.q(I)Z")
    public final boolean method1050() {
        return this.field902 != null;
    }
}
