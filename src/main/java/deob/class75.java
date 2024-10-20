package deob;

@ObfuscatedName("bq")
public final class class75 extends class79 {

    @ObfuscatedName("bq.i")
    public String field913;

    @ObfuscatedName("bq.w")
    public class214 field917;

    @ObfuscatedName("bq.a")
    public int field895 = -1;

    @ObfuscatedName("bq.t")
    public int field894 = -1;

    @ObfuscatedName("bq.r")
    public String[] field905 = new String[3];

    @ObfuscatedName("bq.v")
    public int field896;

    @ObfuscatedName("bq.y")
    public int field897;

    @ObfuscatedName("bq.j")
    public int field898;

    @ObfuscatedName("bq.k")
    public int field899;

    @ObfuscatedName("bq.e")
    public int field906;

    @ObfuscatedName("bq.o")
    public int field903;

    @ObfuscatedName("bq.z")
    public int field902;

    @ObfuscatedName("bq.l")
    public int field893;

    @ObfuscatedName("bq.c")
    public class134 field904;

    @ObfuscatedName("bq.m")
    public int field892;

    @ObfuscatedName("bq.b")
    public int field900;

    @ObfuscatedName("bq.f")
    public int field907;

    @ObfuscatedName("bq.n")
    public int field908;

    @ObfuscatedName("bq.u")
    public boolean field909;

    @ObfuscatedName("bq.p")
    public int field910;

    @ObfuscatedName("bq.q")
    public boolean field911;

    @ObfuscatedName("bq.d")
    public int field912;

    @ObfuscatedName("bq.h")
    public int field915;

    @ObfuscatedName("bq.g")
    public boolean field914;

    @ObfuscatedName("bq.x")
    public int field918;

    @ObfuscatedName("bq.ah")
    public int field916;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field905[var1] = "";
        }
        this.field896 = 0;
        this.field897 = 0;
        this.field899 = 0;
        this.field906 = 0;
        this.field909 = false;
        this.field910 = 0;
        this.field911 = false;
        this.field914 = false;
    }

    @ObfuscatedName("bq.i(Lfp;I)V")
    public final void method1045(class174 arg0) {
        arg0.field2399 = 0;
        int var2 = arg0.method3061();
        this.field895 = arg0.method2930();
        this.field894 = arg0.method2930();
        int var3 = -1;
        this.field910 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3061();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3061();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2882();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method3084(var4[var5] - 512).field3543;
                    if (var8 != 0) {
                        this.field910 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3061();
            if (var11 < 0 || var11 >= Statics.field2628[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1244 = arg0.method2882();
        if (this.field1244 == 65535) {
            this.field1244 = -1;
        }
        this.field1291 = arg0.method2882();
        if (this.field1291 == 65535) {
            this.field1291 = -1;
        }
        this.field1246 = this.field1291;
        this.field1247 = arg0.method2882();
        if (this.field1247 == 65535) {
            this.field1247 = -1;
        }
        this.field1284 = arg0.method2882();
        if (this.field1284 == 65535) {
            this.field1284 = -1;
        }
        this.field1271 = arg0.method2882();
        if (this.field1271 == 65535) {
            this.field1271 = -1;
        }
        this.field1250 = arg0.method2882();
        if (this.field1250 == 65535) {
            this.field1250 = -1;
        }
        this.field1251 = arg0.method2882();
        if (this.field1251 == 65535) {
            this.field1251 = -1;
        }
        this.field913 = arg0.method2884();
        if (Statics.field803 == this) {
            Statics.field2235 = this.field913;
        }
        this.field896 = arg0.method3061();
        this.field897 = arg0.method2882();
        this.field911 = arg0.method3061() == 1;
        if (client.field1203 == 0 && client.field1095 >= 2) {
            this.field911 = false;
        }
        if (this.field917 == null) {
            this.field917 = new class214();
        }
        this.field917.method3641(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bq.w(B)I")
    public int method1047() {
        return this.field917 == null || this.field917.field2624 == -1 ? 1 : class259.method471(this.field917.field2624).field3562;
    }

    @ObfuscatedName("bq.a(I)Let;")
    public final class134 method1044() {
        if (this.field917 == null) {
            return null;
        }
        class261 var1 = this.field1259 != -1 && this.field1282 == 0 ? class261.method3746(this.field1259) : null;
        class261 var2 = this.field1269 == -1 || this.field909 || this.field1269 == this.field1244 && var1 != null ? null : class261.method3746(this.field1269);
        class134 var3 = this.field917.method3615(var1, this.field1272, var2, this.field1280);
        if (var3 == null) {
            return null;
        }
        var3.method2269();
        this.field1289 = var3.field2136;
        if (!this.field909 && this.field1249 != -1 && this.field1245 != -1) {
            class134 var4 = class246.method2634(this.field1249).method3979(this.field1245);
            if (var4 != null) {
                var4.method2280(0, -this.field1239, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field909 && this.field904 != null) {
            if (client.field936 >= this.field906) {
                this.field904 = null;
            }
            if (client.field936 >= this.field899 && client.field936 < this.field906) {
                class134 var6 = this.field904;
                var6.method2280(this.field903 - this.field1273, this.field902 - this.field898, this.field893 - this.field1240);
                if (this.field1290 == 512) {
                    var6.method2263();
                    var6.method2263();
                    var6.method2263();
                } else if (this.field1290 == 1024) {
                    var6.method2263();
                    var6.method2263();
                } else if (this.field1290 == 1536) {
                    var6.method2263();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1290 == 512) {
                    var6.method2263();
                } else if (this.field1290 == 1024) {
                    var6.method2263();
                    var6.method2263();
                } else if (this.field1290 == 1536) {
                    var6.method2263();
                    var6.method2263();
                    var6.method2263();
                }
                var6.method2280(this.field1273 - this.field903, this.field898 - this.field902, this.field1240 - this.field893);
            }
        }
        var3.field1951 = true;
        return var3;
    }

    @ObfuscatedName("bq.t(IIBS)V")
    public final void method1049(int arg0, int arg1, byte arg2) {
        if (this.field1259 != -1 && class261.method3746(this.field1259).field3624 == 1) {
            this.field1259 = -1;
        }
        this.field1267 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1067(arg0, arg1);
        } else if (this.field1294[0] >= 0 && this.field1294[0] < 104 && this.field1296[0] >= 0 && this.field1296[0] < 104) {
            if (arg2 == 2) {
                class75 var4 = this;
                int var5 = this.field1294[0];
                int var6 = this.field1296[0];
                int var7 = this.method1047();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method1047();
                    client.field1205.field2326 = arg0;
                    client.field1205.field2324 = arg1;
                    client.field1205.field2325 = 1;
                    client.field1205.field2323 = 1;
                    class74 var11 = client.field1205;
                    int var12 = class163.method1726(var5, var6, var10, var11, client.field987[this.field912], true, client.field1206, client.field1054);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method1050(client.field1206[var13], client.field1054[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method1050(arg0, arg1, arg2);
        } else {
            this.method1067(arg0, arg1);
        }
    }

    @ObfuscatedName("bq.s(III)V")
    public void method1067(int arg0, int arg1) {
        this.field1293 = 0;
        this.field1270 = 0;
        this.field1276 = 0;
        this.field1294[0] = arg0;
        this.field1296[0] = arg1;
        int var3 = this.method1047();
        this.field1273 = this.field1294[0] * 128 + var3 * 64;
        this.field1240 = this.field1296[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bq.r(IIBI)V")
    public final void method1050(int arg0, int arg1, byte arg2) {
        if (this.field1293 < 9) {
            this.field1293++;
        }
        for (int var4 = this.field1293; var4 > 0; var4--) {
            this.field1294[var4] = this.field1294[var4 - 1];
            this.field1296[var4] = this.field1296[var4 - 1];
            this.field1298[var4] = this.field1298[var4 - 1];
        }
        this.field1294[0] = arg0;
        this.field1296[0] = arg1;
        this.field1298[0] = arg2;
    }

    @ObfuscatedName("bq.v(I)Z")
    public final boolean method1046() {
        return this.field917 != null;
    }
}
