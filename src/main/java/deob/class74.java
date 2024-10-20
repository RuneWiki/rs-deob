package deob;

@ObfuscatedName("bw")
public final class class74 extends class77 {

    @ObfuscatedName("bw.d")
    public String field896;

    @ObfuscatedName("bw.k")
    public class214 field906;

    @ObfuscatedName("bw.e")
    public int field886 = -1;

    @ObfuscatedName("bw.p")
    public int field889 = -1;

    @ObfuscatedName("bw.s")
    public String[] field900 = new String[3];

    @ObfuscatedName("bw.r")
    public int field894;

    @ObfuscatedName("bw.g")
    public int field890;

    @ObfuscatedName("bw.v")
    public int field891;

    @ObfuscatedName("bw.t")
    public int field892;

    @ObfuscatedName("bw.y")
    public int field893;

    @ObfuscatedName("bw.o")
    public int field907;

    @ObfuscatedName("bw.i")
    public int field898;

    @ObfuscatedName("bw.u")
    public int field885;

    @ObfuscatedName("bw.b")
    public class132 field897;

    @ObfuscatedName("bw.f")
    public int field905;

    @ObfuscatedName("bw.j")
    public int field899;

    @ObfuscatedName("bw.x")
    public int field884;

    @ObfuscatedName("bw.c")
    public int field901;

    @ObfuscatedName("bw.h")
    public boolean field902;

    @ObfuscatedName("bw.a")
    public int field903;

    @ObfuscatedName("bw.z")
    public boolean field904;

    @ObfuscatedName("bw.l")
    public int field895;

    @ObfuscatedName("bw.w")
    public int field887;

    @ObfuscatedName("bw.n")
    public boolean field888;

    @ObfuscatedName("bw.m")
    public int field908;

    @ObfuscatedName("bw.ae")
    public int field909;

    public class74() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field900[var1] = "";
        }
        this.field894 = 0;
        this.field890 = 0;
        this.field892 = 0;
        this.field893 = 0;
        this.field902 = false;
        this.field903 = 0;
        this.field904 = false;
        this.field888 = false;
    }

    @ObfuscatedName("bw.d(Lfg;I)V")
    public final void method1068(class174 arg0) {
        arg0.field2405 = 0;
        int var2 = arg0.method2955();
        this.field886 = arg0.method2956();
        this.field889 = arg0.method2956();
        int var3 = -1;
        this.field903 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2955();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2955();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3035();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method637(var4[var5] - 512).field3527;
                    if (var8 != 0) {
                        this.field903 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2955();
            if (var11 < 0 || var11 >= Statics.field2605[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1249 = arg0.method3035();
        if (this.field1249 == 65535) {
            this.field1249 = -1;
        }
        this.field1267 = arg0.method3035();
        if (this.field1267 == 65535) {
            this.field1267 = -1;
        }
        this.field1214 = this.field1267;
        this.field1216 = arg0.method3035();
        if (this.field1216 == 65535) {
            this.field1216 = -1;
        }
        this.field1261 = arg0.method3035();
        if (this.field1261 == 65535) {
            this.field1261 = -1;
        }
        this.field1218 = arg0.method3035();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field1219 = arg0.method3035();
        if (this.field1219 == 65535) {
            this.field1219 = -1;
        }
        this.field1220 = arg0.method3035();
        if (this.field1220 == 65535) {
            this.field1220 = -1;
        }
        this.field896 = arg0.method2964();
        if (Statics.field2427 == this) {
            Statics.field2225 = this.field896;
        }
        this.field894 = arg0.method2955();
        this.field890 = arg0.method3035();
        this.field904 = arg0.method2955() == 1;
        if (client.field923 == 0 && client.field1081 >= 2) {
            this.field904 = false;
        }
        if (this.field906 == null) {
            this.field906 = new class214();
        }
        this.field906.method3763(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bw.k(I)I")
    public int method1071() {
        return this.field906 == null || this.field906.field2632 == -1 ? 1 : class259.method1066(this.field906.field2632).field3560;
    }

    @ObfuscatedName("bw.e(I)Leb;")
    public final class132 method1070() {
        if (this.field906 == null) {
            return null;
        }
        class261 var1 = this.field1240 != -1 && this.field1245 == 0 ? class261.method3613(this.field1240) : null;
        class261 var2 = this.field1254 == -1 || this.field902 || this.field1254 == this.field1249 && var1 != null ? null : class261.method3613(this.field1254);
        class132 var3 = this.field906.method3739(var1, this.field1241, var2, this.field1228);
        if (var3 == null) {
            return null;
        }
        var3.method2364();
        this.field1258 = var3.field2115;
        if (!this.field902 && this.field1260 != -1 && this.field1250 != -1) {
            class132 var4 = class246.method2787(this.field1260).method4078(this.field1250);
            if (var4 != null) {
                var4.method2435(0, -this.field1215, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (!this.field902 && this.field897 != null) {
            if (client.field931 >= this.field893) {
                this.field897 = null;
            }
            if (client.field931 >= this.field892 && client.field931 < this.field893) {
                class132 var6 = this.field897;
                var6.method2435(this.field907 - this.field1243, this.field898 - this.field891, this.field885 - this.field1209);
                if (this.field1259 == 512) {
                    var6.method2426();
                    var6.method2426();
                    var6.method2426();
                } else if (this.field1259 == 1024) {
                    var6.method2426();
                    var6.method2426();
                } else if (this.field1259 == 1536) {
                    var6.method2426();
                }
                class132[] var7 = new class132[] { var3, var6 };
                var3 = new class132(var7, 2);
                if (this.field1259 == 512) {
                    var6.method2426();
                } else if (this.field1259 == 1024) {
                    var6.method2426();
                    var6.method2426();
                } else if (this.field1259 == 1536) {
                    var6.method2426();
                    var6.method2426();
                    var6.method2426();
                }
                var6.method2435(this.field1243 - this.field907, this.field891 - this.field898, this.field1209 - this.field885);
            }
        }
        var3.field1939 = true;
        return var3;
    }

    @ObfuscatedName("bw.p(IIBI)V")
    public final void method1067(int arg0, int arg1, byte arg2) {
        if (this.field1240 != -1 && class261.method3613(this.field1240).field3621 == 1) {
            this.field1240 = -1;
        }
        this.field1236 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1072(arg0, arg1);
        } else if (this.field1263[0] >= 0 && this.field1263[0] < 104 && this.field1264[0] >= 0 && this.field1264[0] < 104) {
            if (arg2 == 2) {
                client.method680(this, arg0, arg1, (byte) 2);
            }
            this.method1076(arg0, arg1, arg2);
        } else {
            this.method1072(arg0, arg1);
        }
    }

    @ObfuscatedName("bw.q(III)V")
    public void method1072(int arg0, int arg1) {
        this.field1213 = 0;
        this.field1242 = 0;
        this.field1252 = 0;
        this.field1263[0] = arg0;
        this.field1264[0] = arg1;
        int var3 = this.method1071();
        this.field1243 = this.field1263[0] * 128 + var3 * 64;
        this.field1209 = this.field1264[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bw.s(IIBB)V")
    public final void method1076(int arg0, int arg1, byte arg2) {
        if (this.field1213 < 9) {
            this.field1213++;
        }
        for (int var4 = this.field1213; var4 > 0; var4--) {
            this.field1263[var4] = this.field1263[var4 - 1];
            this.field1264[var4] = this.field1264[var4 - 1];
            this.field1265[var4] = this.field1265[var4 - 1];
        }
        this.field1263[0] = arg0;
        this.field1264[0] = arg1;
        this.field1265[0] = arg2;
    }

    @ObfuscatedName("bw.r(I)Z")
    public final boolean method1074() {
        return this.field906 != null;
    }
}
