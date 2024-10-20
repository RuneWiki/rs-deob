package deob;

@ObfuscatedName("bh")
public final class class75 extends class79 {

    @ObfuscatedName("bh.p")
    public String field873;

    @ObfuscatedName("bh.m")
    public class214 field864;

    @ObfuscatedName("bh.e")
    public int field865 = -1;

    @ObfuscatedName("bh.t")
    public int field866 = -1;

    @ObfuscatedName("bh.z")
    public String[] field868 = new String[3];

    @ObfuscatedName("bh.j")
    public int field869;

    @ObfuscatedName("bh.i")
    public int field870;

    @ObfuscatedName("bh.f")
    public int field880;

    @ObfuscatedName("bh.c")
    public int field872;

    @ObfuscatedName("bh.o")
    public int field883;

    @ObfuscatedName("bh.q")
    public int field874;

    @ObfuscatedName("bh.n")
    public int field875;

    @ObfuscatedName("bh.a")
    public int field876;

    @ObfuscatedName("bh.g")
    public class134 field877;

    @ObfuscatedName("bh.v")
    public int field871;

    @ObfuscatedName("bh.s")
    public int field879;

    @ObfuscatedName("bh.k")
    public int field886;

    @ObfuscatedName("bh.r")
    public int field881;

    @ObfuscatedName("bh.l")
    public boolean field887;

    @ObfuscatedName("bh.h")
    public int field882;

    @ObfuscatedName("bh.d")
    public boolean field884;

    @ObfuscatedName("bh.x")
    public int field885;

    @ObfuscatedName("bh.b")
    public int field891;

    @ObfuscatedName("bh.y")
    public boolean field878;

    @ObfuscatedName("bh.u")
    public int field888;

    @ObfuscatedName("bh.av")
    public int field889;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field868[var1] = "";
        }
        this.field869 = 0;
        this.field870 = 0;
        this.field872 = 0;
        this.field883 = 0;
        this.field887 = false;
        this.field882 = 0;
        this.field884 = false;
        this.field878 = false;
    }

    @ObfuscatedName("bh.p(Lfr;I)V")
    public final void method1022(class174 arg0) {
        arg0.field2408 = 0;
        int var2 = arg0.method2810();
        this.field865 = arg0.method2811();
        this.field866 = arg0.method2811();
        int var3 = -1;
        this.field882 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2810();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2810();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2824();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method3684(var4[var5] - 512).field3541;
                    if (var8 != 0) {
                        this.field882 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2810();
            if (var11 < 0 || var11 >= Statics.field250[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1244 = arg0.method2824();
        if (this.field1244 == 65535) {
            this.field1244 = -1;
        }
        this.field1215 = arg0.method2824();
        if (this.field1215 == 65535) {
            this.field1215 = -1;
        }
        this.field1216 = this.field1215;
        this.field1217 = arg0.method2824();
        if (this.field1217 == 65535) {
            this.field1217 = -1;
        }
        this.field1218 = arg0.method2824();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field1219 = arg0.method2824();
        if (this.field1219 == 65535) {
            this.field1219 = -1;
        }
        this.field1220 = arg0.method2824();
        if (this.field1220 == 65535) {
            this.field1220 = -1;
        }
        this.field1221 = arg0.method2824();
        if (this.field1221 == 65535) {
            this.field1221 = -1;
        }
        this.field873 = arg0.method2818();
        if (Statics.field341 == this) {
            Statics.field2224 = this.field873;
        }
        this.field869 = arg0.method2810();
        this.field870 = arg0.method2824();
        this.field884 = arg0.method2810() == 1;
        if (client.field1162 == 0 && client.field1068 >= 2) {
            this.field884 = false;
        }
        if (this.field864 == null) {
            this.field864 = new class214();
        }
        this.field864.method3569(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bh.m(I)I")
    public int method1003() {
        return this.field864 == null || this.field864.field2634 == -1 ? 1 : class259.method2658(this.field864.field2634).field3560;
    }

    @ObfuscatedName("bh.e(I)Les;")
    public final class134 method1001() {
        if (this.field864 == null) {
            return null;
        }
        class261 var1 = this.field1261 != -1 && this.field1256 == 0 ? class261.method790(this.field1261) : null;
        class261 var2 = this.field1238 == -1 || this.field887 || this.field1244 == this.field1238 && var1 != null ? null : class261.method790(this.field1238);
        class134 var3 = this.field864.method3574(var1, this.field1253, var2, this.field1239);
        if (var3 == null) {
            return null;
        }
        var3.method2224();
        this.field1259 = var3.field2129;
        if (!this.field887 && this.field1246 != -1 && this.field1222 != -1) {
            class134 var4 = class246.method3873(this.field1246).method3910(this.field1222);
            if (var4 != null) {
                var4.method2235(0, -this.field1240, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field887 && this.field877 != null) {
            if (client.field960 >= this.field883) {
                this.field877 = null;
            }
            if (client.field960 >= this.field872 && client.field960 < this.field883) {
                class134 var6 = this.field877;
                var6.method2235(this.field874 - this.field1234, this.field875 - this.field880, this.field876 - this.field1210);
                if (this.field1250 == 512) {
                    var6.method2254();
                    var6.method2254();
                    var6.method2254();
                } else if (this.field1250 == 1024) {
                    var6.method2254();
                    var6.method2254();
                } else if (this.field1250 == 1536) {
                    var6.method2254();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1250 == 512) {
                    var6.method2254();
                } else if (this.field1250 == 1024) {
                    var6.method2254();
                    var6.method2254();
                } else if (this.field1250 == 1536) {
                    var6.method2254();
                    var6.method2254();
                    var6.method2254();
                }
                var6.method2235(this.field1234 - this.field874, this.field880 - this.field875, this.field1210 - this.field876);
            }
        }
        var3.field1950 = true;
        return var3;
    }

    @ObfuscatedName("bh.t(IIBS)V")
    public final void method1002(int arg0, int arg1, byte arg2) {
        if (this.field1261 != -1 && class261.method790(this.field1261).field3620 == 1) {
            this.field1261 = -1;
        }
        this.field1237 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1014(arg0, arg1);
        } else if (this.field1264[0] >= 0 && this.field1264[0] < 104 && this.field1265[0] >= 0 && this.field1265[0] < 104) {
            if (arg2 == 2) {
                client.method250(this, arg0, arg1, (byte) 2);
            }
            this.method1004(arg0, arg1, arg2);
        } else {
            this.method1014(arg0, arg1);
        }
    }

    @ObfuscatedName("bh.w(III)V")
    public void method1014(int arg0, int arg1) {
        this.field1211 = 0;
        this.field1268 = 0;
        this.field1267 = 0;
        this.field1264[0] = arg0;
        this.field1265[0] = arg1;
        int var3 = this.method1003();
        this.field1234 = this.field1264[0] * 128 + var3 * 64;
        this.field1210 = this.field1265[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bh.z(IIBI)V")
    public final void method1004(int arg0, int arg1, byte arg2) {
        if (this.field1211 < 9) {
            this.field1211++;
        }
        for (int var4 = this.field1211; var4 > 0; var4--) {
            this.field1264[var4] = this.field1264[var4 - 1];
            this.field1265[var4] = this.field1265[var4 - 1];
            this.field1266[var4] = this.field1266[var4 - 1];
        }
        this.field1264[0] = arg0;
        this.field1265[0] = arg1;
        this.field1266[0] = arg2;
    }

    @ObfuscatedName("bh.j(S)Z")
    public final boolean method1011() {
        return this.field864 != null;
    }
}
