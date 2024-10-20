package deob;

@ObfuscatedName("cs")
public final class class98 extends class100 {

    @ObfuscatedName("cs.f")
    public class327 field1183;

    @ObfuscatedName("cs.o")
    public class223 field1166;

    @ObfuscatedName("cs.u")
    public int field1167 = -1;

    @ObfuscatedName("cs.p")
    public int field1168 = -1;

    @ObfuscatedName("cs.e")
    public String[] field1165 = new String[3];

    @ObfuscatedName("cs.k")
    public int field1169;

    @ObfuscatedName("cs.g")
    public int field1171;

    @ObfuscatedName("cs.h")
    public int field1182;

    @ObfuscatedName("cs.n")
    public int field1173;

    @ObfuscatedName("cs.l")
    public int field1174;

    @ObfuscatedName("cs.m")
    public int field1176;

    @ObfuscatedName("cs.d")
    public int field1172;

    @ObfuscatedName("cs.c")
    public int field1178;

    @ObfuscatedName("cs.j")
    public class183 field1184;

    @ObfuscatedName("cs.r")
    public int field1188;

    @ObfuscatedName("cs.q")
    public int field1180;

    @ObfuscatedName("cs.t")
    public int field1181;

    @ObfuscatedName("cs.v")
    public int field1177;

    @ObfuscatedName("cs.x")
    public boolean field1175;

    @ObfuscatedName("cs.z")
    public int field1191;

    @ObfuscatedName("cs.i")
    public boolean field1185;

    @ObfuscatedName("cs.a")
    public int field1186;

    @ObfuscatedName("cs.w")
    public int field1187;

    @ObfuscatedName("cs.s")
    public class326 field1170;

    @ObfuscatedName("cs.y")
    public class326 field1189;

    @ObfuscatedName("cs.ac")
    public boolean field1190;

    @ObfuscatedName("cs.ay")
    public int field1179;

    @ObfuscatedName("cs.am")
    public int field1192;

    public class98() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1165[var1] = "";
        }
        this.field1169 = 0;
        this.field1171 = 0;
        this.field1173 = 0;
        this.field1174 = 0;
        this.field1175 = false;
        this.field1191 = 0;
        this.field1185 = false;
        this.field1170 = class326.field3860;
        this.field1189 = class326.field3860;
        this.field1190 = false;
    }

    @ObfuscatedName("cs.f(Lnu;B)V")
    public final void method1846(class382 arg0) {
        arg0.field4155 = 0;
        int var2 = arg0.method5856();
        this.field1167 = arg0.method6045();
        this.field1168 = arg0.method6045();
        int var3 = -1;
        this.field1191 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5856();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5856();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5858();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class296.method194(var4[var5] - 512).field3688;
                    if (var8 != 0) {
                        this.field1191 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5856();
            if (var11 < 0 || var11 >= Statics.field1087[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1211 = arg0.method5858();
        if (this.field1211 == 65535) {
            this.field1211 = -1;
        }
        this.field1252 = arg0.method5858();
        if (this.field1252 == 65535) {
            this.field1252 = -1;
        }
        this.field1217 = this.field1252;
        this.field1218 = arg0.method5858();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field1219 = arg0.method5858();
        if (this.field1219 == 65535) {
            this.field1219 = -1;
        }
        this.field1220 = arg0.method5858();
        if (this.field1220 == 65535) {
            this.field1220 = -1;
        }
        this.field1247 = arg0.method5858();
        if (this.field1247 == 65535) {
            this.field1247 = -1;
        }
        this.field1222 = arg0.method5858();
        if (this.field1222 == 65535) {
            this.field1222 = -1;
        }
        this.field1183 = new class327(arg0.method5865(), Statics.field3841);
        this.method1848();
        this.method1851();
        if (Statics.field1374 == this) {
            Statics.field4292 = this.field1183.method5200();
        }
        this.field1169 = arg0.method5856();
        this.field1171 = arg0.method5858();
        this.field1185 = arg0.method5856() == 1;
        if (client.field786 == 0 && client.field797 >= 2) {
            this.field1185 = false;
        }
        if (this.field1166 == null) {
            this.field1166 = new class223();
        }
        this.field1166.method3704(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("cs.u(S)Z")
    public boolean method1847() {
        if (class326.field3860 == this.field1170) {
            this.method1871();
        }
        return class326.field3856 == this.field1170;
    }

    @ObfuscatedName("cs.p(I)V")
    public void method1848() {
        this.field1170 = class326.field3860;
    }

    @ObfuscatedName("cs.k(I)V")
    public void method1871() {
        this.field1170 = Statics.field118.method1473(this.field1183) ? class326.field3856 : class326.field3857;
    }

    @ObfuscatedName("cs.g(I)Z")
    public boolean method1850() {
        if (class326.field3860 == this.field1189) {
            this.method1852();
        }
        return class326.field3856 == this.field1189;
    }

    @ObfuscatedName("cs.h(I)V")
    public void method1851() {
        this.field1189 = class326.field3860;
    }

    @ObfuscatedName("cs.n(I)V")
    public void method1852() {
        this.field1189 = Statics.field1142 != null && Statics.field1142.method5168(this.field1183) ? class326.field3856 : class326.field3857;
    }

    @ObfuscatedName("cs.l(I)I")
    public int method1853() {
        return this.field1166 == null || this.field1166.field2599 == -1 ? 1 : class287.method1652(this.field1166.field2599).field3480;
    }

    @ObfuscatedName("cs.o(I)Lgv;")
    public final class183 method1649() {
        if (this.field1166 == null) {
            return null;
        }
        class298 var1 = this.field1216 != -1 && this.field1245 == 0 ? class298.method3795(this.field1216) : null;
        class298 var2 = this.field1261 == -1 || this.field1175 || this.field1261 == this.field1211 && var1 != null ? null : class298.method3795(this.field1261);
        class183 var3 = this.field1166.method3694(var1, this.field1243, var2, this.field1244);
        if (var3 == null) {
            return null;
        }
        var3.method3240();
        this.field1260 = var3.field1999;
        if (!this.field1175 && this.field1257 != -1 && this.field1248 != -1) {
            class183 var4 = class289.method3663(this.field1257).method4473(this.field1248);
            if (var4 != null) {
                var4.method3251(0, -this.field1239, 0);
                class183[] var5 = new class183[] { var3, var4 };
                var3 = new class183(var5, 2);
            }
        }
        if (!this.field1175 && this.field1184 != null) {
            if (client.field611 >= this.field1174) {
                this.field1184 = null;
            }
            if (client.field611 >= this.field1173 && client.field611 < this.field1174) {
                class183 var6 = this.field1184;
                var6.method3251(this.field1176 - this.field1232, this.field1172 - this.field1182, this.field1178 - this.field1210);
                if (this.field1226 == 512) {
                    var6.method3247();
                    var6.method3247();
                    var6.method3247();
                } else if (this.field1226 == 1024) {
                    var6.method3247();
                    var6.method3247();
                } else if (this.field1226 == 1536) {
                    var6.method3247();
                }
                class183[] var7 = new class183[] { var3, var6 };
                var3 = new class183(var7, 2);
                if (this.field1226 == 512) {
                    var6.method3247();
                } else if (this.field1226 == 1024) {
                    var6.method3247();
                    var6.method3247();
                } else if (this.field1226 == 1536) {
                    var6.method3247();
                    var6.method3247();
                    var6.method3247();
                }
                var6.method3251(this.field1232 - this.field1176, this.field1182 - this.field1172, this.field1210 - this.field1178);
            }
        }
        var3.field2078 = true;
        return var3;
    }

    @ObfuscatedName("cs.m(IIBI)V")
    public final void method1854(int arg0, int arg1, byte arg2) {
        if (this.field1216 != -1 && class298.method3795(this.field1216).field3724 == 1) {
            this.field1216 = -1;
        }
        this.field1238 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1855(arg0, arg1);
        } else if (this.field1265[0] >= 0 && this.field1265[0] < 104 && this.field1266[0] >= 0 && this.field1266[0] < 104) {
            if (arg2 == 2) {
                client.method294(this, arg0, arg1, (byte) 2);
            }
            this.method1874(arg0, arg1, arg2);
        } else {
            this.method1855(arg0, arg1);
        }
    }

    @ObfuscatedName("cs.d(III)V")
    public void method1855(int arg0, int arg1) {
        this.field1264 = 0;
        this.field1225 = 0;
        this.field1268 = 0;
        this.field1265[0] = arg0;
        this.field1266[0] = arg1;
        int var3 = this.method1853();
        this.field1232 = this.field1265[0] * 128 + var3 * 64;
        this.field1210 = this.field1266[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cs.c(IIBI)V")
    public final void method1874(int arg0, int arg1, byte arg2) {
        if (this.field1264 < 9) {
            this.field1264++;
        }
        for (int var4 = this.field1264; var4 > 0; var4--) {
            this.field1265[var4] = this.field1265[var4 - 1];
            this.field1266[var4] = this.field1266[var4 - 1];
            this.field1267[var4] = this.field1267[var4 - 1];
        }
        this.field1265[0] = arg0;
        this.field1266[0] = arg1;
        this.field1267[0] = arg2;
    }

    @ObfuscatedName("cs.j(B)Z")
    public final boolean method1857() {
        return this.field1166 != null;
    }
}
