package deob;

@ObfuscatedName("bz")
public final class class76 extends class79 {

    @ObfuscatedName("bz.j")
    public String field915;

    @ObfuscatedName("bz.h")
    public class215 field898;

    @ObfuscatedName("bz.f")
    public int field899 = -1;

    @ObfuscatedName("bz.p")
    public int field900 = -1;

    @ObfuscatedName("bz.g")
    public String[] field910 = new String[3];

    @ObfuscatedName("bz.c")
    public int field903;

    @ObfuscatedName("bz.l")
    public int field913;

    @ObfuscatedName("bz.w")
    public int field905;

    @ObfuscatedName("bz.b")
    public int field906;

    @ObfuscatedName("bz.o")
    public int field907;

    @ObfuscatedName("bz.m")
    public int field908;

    @ObfuscatedName("bz.i")
    public int field909;

    @ObfuscatedName("bz.s")
    public int field912;

    @ObfuscatedName("bz.r")
    public class135 field911;

    @ObfuscatedName("bz.e")
    public int field902;

    @ObfuscatedName("bz.a")
    public int field921;

    @ObfuscatedName("bz.v")
    public int field920;

    @ObfuscatedName("bz.t")
    public int field924;

    @ObfuscatedName("bz.y")
    public boolean field914;

    @ObfuscatedName("bz.z")
    public int field917;

    @ObfuscatedName("bz.u")
    public boolean field918;

    @ObfuscatedName("bz.k")
    public int field919;

    @ObfuscatedName("bz.q")
    public int field897;

    @ObfuscatedName("bz.n")
    public boolean field904;

    @ObfuscatedName("bz.d")
    public int field922;

    @ObfuscatedName("bz.ax")
    public int field923;

    public class76() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field910[var1] = "";
        }
        this.field903 = 0;
        this.field913 = 0;
        this.field906 = 0;
        this.field907 = 0;
        this.field914 = false;
        this.field917 = 0;
        this.field918 = false;
        this.field904 = false;
    }

    @ObfuscatedName("bz.j(Lfb;I)V")
    public final void method1075(class175 arg0) {
        arg0.field2394 = 0;
        int var2 = arg0.method2903();
        this.field899 = arg0.method2980();
        this.field900 = arg0.method2980();
        int var3 = -1;
        this.field917 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2903();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2903();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3023();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class258.method1923(var4[var5] - 512).field3525;
                    if (var8 != 0) {
                        this.field917 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2903();
            if (var11 < 0 || var11 >= Statics.field2617[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1224 = arg0.method3023();
        if (this.field1224 == 65535) {
            this.field1224 = -1;
        }
        this.field1242 = arg0.method3023();
        if (this.field1242 == 65535) {
            this.field1242 = -1;
        }
        this.field1226 = this.field1242;
        this.field1227 = arg0.method3023();
        if (this.field1227 == 65535) {
            this.field1227 = -1;
        }
        this.field1219 = arg0.method3023();
        if (this.field1219 == 65535) {
            this.field1219 = -1;
        }
        this.field1229 = arg0.method3023();
        if (this.field1229 == 65535) {
            this.field1229 = -1;
        }
        this.field1230 = arg0.method3023();
        if (this.field1230 == 65535) {
            this.field1230 = -1;
        }
        this.field1223 = arg0.method3023();
        if (this.field1223 == 65535) {
            this.field1223 = -1;
        }
        this.field915 = arg0.method2911();
        if (Statics.field312 == this) {
            Statics.field2217 = this.field915;
        }
        this.field903 = arg0.method2903();
        this.field913 = arg0.method3023();
        this.field918 = arg0.method2903() == 1;
        if (client.field1183 == 0 && client.field1094 >= 2) {
            this.field918 = false;
        }
        if (this.field898 == null) {
            this.field898 = new class215();
        }
        this.field898.method3670(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bz.h(I)I")
    public int method1076() {
        return this.field898 == null || this.field898.field2628 == -1 ? 1 : class260.method3178(this.field898.field2628).field3544;
    }

    @ObfuscatedName("bz.f(I)Leo;")
    public final class135 method1077() {
        if (this.field898 == null) {
            return null;
        }
        class262 var1 = this.field1251 != -1 && this.field1254 == 0 ? class262.method1389(this.field1251) : null;
        class262 var2 = this.field1235 == -1 || this.field914 || this.field1235 == this.field1224 && var1 != null ? null : class262.method1389(this.field1235);
        class135 var3 = this.field898.method3650(var1, this.field1243, var2, this.field1249);
        if (var3 == null) {
            return null;
        }
        var3.method2305();
        this.field1232 = var3.field2130;
        if (!this.field914 && this.field1256 != -1 && this.field1257 != -1) {
            class135 var4 = class247.method473(this.field1256).method4012(this.field1257);
            if (var4 != null) {
                var4.method2315(0, -this.field1260, 0);
                class135[] var5 = new class135[] { var3, var4 };
                var3 = new class135(var5, 2);
            }
        }
        if (!this.field914 && this.field911 != null) {
            if (client.field944 >= this.field907) {
                this.field911 = null;
            }
            if (client.field944 >= this.field906 && client.field944 < this.field907) {
                class135 var6 = this.field911;
                var6.method2315(this.field908 - this.field1262, this.field909 - this.field905, this.field912 - this.field1259);
                if (this.field1270 == 512) {
                    var6.method2312();
                    var6.method2312();
                    var6.method2312();
                } else if (this.field1270 == 1024) {
                    var6.method2312();
                    var6.method2312();
                } else if (this.field1270 == 1536) {
                    var6.method2312();
                }
                class135[] var7 = new class135[] { var3, var6 };
                var3 = new class135(var7, 2);
                if (this.field1270 == 512) {
                    var6.method2312();
                } else if (this.field1270 == 1024) {
                    var6.method2312();
                    var6.method2312();
                } else if (this.field1270 == 1536) {
                    var6.method2312();
                    var6.method2312();
                    var6.method2312();
                }
                var6.method2315(this.field1262 - this.field908, this.field905 - this.field909, this.field1259 - this.field912);
            }
        }
        var3.field1991 = true;
        return var3;
    }

    @ObfuscatedName("bz.p(IIBB)V")
    public final void method1078(int arg0, int arg1, byte arg2) {
        if (this.field1251 != -1 && class262.method1389(this.field1251).field3606 == 1) {
            this.field1251 = -1;
        }
        this.field1247 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1079(arg0, arg1);
        } else if (this.field1228[0] >= 0 && this.field1228[0] < 104 && this.field1234[0] >= 0 && this.field1234[0] < 104) {
            if (arg2 == 2) {
                client.method1071(this, arg0, arg1, (byte) 2);
            }
            this.method1080(arg0, arg1, arg2);
        } else {
            this.method1079(arg0, arg1);
        }
    }

    @ObfuscatedName("bz.x(III)V")
    public void method1079(int arg0, int arg1) {
        this.field1269 = 0;
        this.field1278 = 0;
        this.field1277 = 0;
        this.field1228[0] = arg0;
        this.field1234[0] = arg1;
        int var3 = this.method1076();
        this.field1262 = this.field1228[0] * 128 + var3 * 64;
        this.field1259 = this.field1234[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bz.g(IIBI)V")
    public final void method1080(int arg0, int arg1, byte arg2) {
        if (this.field1269 < 9) {
            this.field1269++;
        }
        for (int var4 = this.field1269; var4 > 0; var4--) {
            this.field1228[var4] = this.field1228[var4 - 1];
            this.field1234[var4] = this.field1234[var4 - 1];
            this.field1252[var4] = this.field1252[var4 - 1];
        }
        this.field1228[0] = arg0;
        this.field1234[0] = arg1;
        this.field1252[0] = arg2;
    }

    @ObfuscatedName("bz.c(I)Z")
    public final boolean method1094() {
        return this.field898 != null;
    }
}
