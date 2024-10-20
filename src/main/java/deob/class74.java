package deob;

@ObfuscatedName("bk")
public final class class74 extends class77 {

    @ObfuscatedName("bk.w")
    public String field913;

    @ObfuscatedName("bk.s")
    public class214 field888;

    @ObfuscatedName("bk.q")
    public int field889 = -1;

    @ObfuscatedName("bk.o")
    public int field890 = -1;

    @ObfuscatedName("bk.v")
    public String[] field892 = new String[3];

    @ObfuscatedName("bk.p")
    public int field911;

    @ObfuscatedName("bk.e")
    public int field894;

    @ObfuscatedName("bk.d")
    public int field895;

    @ObfuscatedName("bk.x")
    public int field896;

    @ObfuscatedName("bk.z")
    public int field904;

    @ObfuscatedName("bk.n")
    public int field910;

    @ObfuscatedName("bk.u")
    public int field899;

    @ObfuscatedName("bk.t")
    public int field898;

    @ObfuscatedName("bk.a")
    public class132 field901;

    @ObfuscatedName("bk.i")
    public int field902;

    @ObfuscatedName("bk.h")
    public int field903;

    @ObfuscatedName("bk.b")
    public int field893;

    @ObfuscatedName("bk.j")
    public int field905;

    @ObfuscatedName("bk.y")
    public boolean field906;

    @ObfuscatedName("bk.k")
    public int field907;

    @ObfuscatedName("bk.c")
    public boolean field908;

    @ObfuscatedName("bk.r")
    public int field909;

    @ObfuscatedName("bk.m")
    public int field914;

    @ObfuscatedName("bk.l")
    public boolean field887;

    @ObfuscatedName("bk.f")
    public int field912;

    @ObfuscatedName("bk.ap")
    public int field900;

    public class74() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field892[var1] = "";
        }
        this.field911 = 0;
        this.field894 = 0;
        this.field896 = 0;
        this.field904 = 0;
        this.field906 = false;
        this.field907 = 0;
        this.field908 = false;
        this.field887 = false;
    }

    @ObfuscatedName("bk.w(Lfz;B)V")
    public final void method1033(class174 arg0) {
        arg0.field2390 = 0;
        int var2 = arg0.method2971();
        this.field889 = arg0.method2972();
        this.field890 = arg0.method2972();
        int var3 = -1;
        this.field907 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2971();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2971();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3178();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method2694(var4[var5] - 512).field3538;
                    if (var8 != 0) {
                        this.field907 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2971();
            if (var11 < 0 || var11 >= Statics.field2613[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1267 = arg0.method3178();
        if (this.field1267 == 65535) {
            this.field1267 = -1;
        }
        this.field1254 = arg0.method3178();
        if (this.field1254 == 65535) {
            this.field1254 = -1;
        }
        this.field1228 = this.field1254;
        this.field1218 = arg0.method3178();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field1219 = arg0.method3178();
        if (this.field1219 == 65535) {
            this.field1219 = -1;
        }
        this.field1220 = arg0.method3178();
        if (this.field1220 == 65535) {
            this.field1220 = -1;
        }
        this.field1221 = arg0.method3178();
        if (this.field1221 == 65535) {
            this.field1221 = -1;
        }
        this.field1217 = arg0.method3178();
        if (this.field1217 == 65535) {
            this.field1217 = -1;
        }
        this.field913 = arg0.method3111();
        if (Statics.field832 == this) {
            Statics.field2212 = this.field913;
        }
        this.field911 = arg0.method2971();
        this.field894 = arg0.method3178();
        this.field908 = arg0.method2971() == 1;
        if (client.field1145 == 0 && client.field1082 >= 2) {
            this.field908 = false;
        }
        if (this.field888 == null) {
            this.field888 = new class214();
        }
        this.field888.method3736(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bk.s(B)I")
    public int method1029() {
        return this.field888 == null || this.field888.field2616 == -1 ? 1 : class259.method116(this.field888.field2616).field3556;
    }

    @ObfuscatedName("bk.q(B)Leh;")
    public final class132 method1030() {
        if (this.field888 == null) {
            return null;
        }
        class261 var1 = this.field1242 != -1 && this.field1269 == 0 ? class261.method4424(this.field1242) : null;
        class261 var2 = this.field1239 == -1 || this.field906 || this.field1267 == this.field1239 && var1 != null ? null : class261.method4424(this.field1239);
        class132 var3 = this.field888.method3738(var1, this.field1243, var2, this.field1240);
        if (var3 == null) {
            return null;
        }
        var3.method2358();
        this.field1229 = var3.field2103;
        if (!this.field906 && this.field1215 != -1 && this.field1216 != -1) {
            class132 var4 = class246.method4062(this.field1215).method4074(this.field1216);
            if (var4 != null) {
                var4.method2369(0, -this.field1251, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (!this.field906 && this.field901 != null) {
            if (client.field933 >= this.field904) {
                this.field901 = null;
            }
            if (client.field933 >= this.field896 && client.field933 < this.field904) {
                class132 var6 = this.field901;
                var6.method2369(this.field910 - this.field1225, this.field899 - this.field895, this.field898 - this.field1211);
                if (this.field1261 == 512) {
                    var6.method2365();
                    var6.method2365();
                    var6.method2365();
                } else if (this.field1261 == 1024) {
                    var6.method2365();
                    var6.method2365();
                } else if (this.field1261 == 1536) {
                    var6.method2365();
                }
                class132[] var7 = new class132[] { var3, var6 };
                var3 = new class132(var7, 2);
                if (this.field1261 == 512) {
                    var6.method2365();
                } else if (this.field1261 == 1024) {
                    var6.method2365();
                    var6.method2365();
                } else if (this.field1261 == 1536) {
                    var6.method2365();
                    var6.method2365();
                    var6.method2365();
                }
                var6.method2369(this.field1225 - this.field910, this.field895 - this.field899, this.field1211 - this.field898);
            }
        }
        var3.field1937 = true;
        return var3;
    }

    @ObfuscatedName("bk.o(IIBI)V")
    public final void method1031(int arg0, int arg1, byte arg2) {
        if (this.field1242 != -1 && class261.method4424(this.field1242).field3608 == 1) {
            this.field1242 = -1;
        }
        this.field1250 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1027(arg0, arg1);
        } else if (this.field1265[0] >= 0 && this.field1265[0] < 104 && this.field1266[0] >= 0 && this.field1266[0] < 104) {
            if (arg2 == 2) {
                class74 var4 = this;
                int var5 = this.field1265[0];
                int var6 = this.field1266[0];
                int var7 = this.method1029();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method1029();
                    client.field1190.field2308 = arg0;
                    client.field1190.field2307 = arg1;
                    client.field1190.field2310 = 1;
                    client.field1190.field2309 = 1;
                    class73 var11 = client.field1190;
                    int var12 = class163.method242(var5, var6, var10, var11, client.field987[this.field909], true, client.field1191, client.field1061);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method1046(client.field1191[var13], client.field1061[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method1046(arg0, arg1, arg2);
        } else {
            this.method1027(arg0, arg1);
        }
    }

    @ObfuscatedName("bk.g(III)V")
    public void method1027(int arg0, int arg1) {
        this.field1264 = 0;
        this.field1214 = 0;
        this.field1268 = 0;
        this.field1265[0] = arg0;
        this.field1266[0] = arg1;
        int var3 = this.method1029();
        this.field1225 = this.field1265[0] * 128 + var3 * 64;
        this.field1211 = this.field1266[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bk.v(IIBI)V")
    public final void method1046(int arg0, int arg1, byte arg2) {
        if (this.field1264 < 9) {
            this.field1264++;
        }
        for (int var4 = this.field1264; var4 > 0; var4--) {
            this.field1265[var4] = this.field1265[var4 - 1];
            this.field1266[var4] = this.field1266[var4 - 1];
            this.field1259[var4] = this.field1259[var4 - 1];
        }
        this.field1265[0] = arg0;
        this.field1266[0] = arg1;
        this.field1259[0] = arg2;
    }

    @ObfuscatedName("bk.p(I)Z")
    public final boolean method1034() {
        return this.field888 != null;
    }
}
