package deob;

@ObfuscatedName("ce")
public final class class98 extends class100 {

    @ObfuscatedName("ce.v")
    public class328 field1199;

    @ObfuscatedName("ce.n")
    public class245 field1194;

    @ObfuscatedName("ce.f")
    public int field1217 = -1;

    @ObfuscatedName("ce.y")
    public int field1196 = -1;

    @ObfuscatedName("ce.j")
    public String[] field1197 = new String[3];

    @ObfuscatedName("ce.r")
    public int field1198;

    @ObfuscatedName("ce.b")
    public int field1216;

    @ObfuscatedName("ce.d")
    public int field1200;

    @ObfuscatedName("ce.s")
    public int field1201;

    @ObfuscatedName("ce.u")
    public int field1222;

    @ObfuscatedName("ce.l")
    public int field1203;

    @ObfuscatedName("ce.o")
    public int field1204;

    @ObfuscatedName("ce.c")
    public int field1221;

    @ObfuscatedName("ce.e")
    public class205 field1213;

    @ObfuscatedName("ce.g")
    public int field1207;

    @ObfuscatedName("ce.a")
    public int field1208;

    @ObfuscatedName("ce.k")
    public int field1209;

    @ObfuscatedName("ce.m")
    public int field1210;

    @ObfuscatedName("ce.x")
    public boolean field1211;

    @ObfuscatedName("ce.z")
    public int field1212;

    @ObfuscatedName("ce.w")
    public boolean field1205;

    @ObfuscatedName("ce.t")
    public int field1214;

    @ObfuscatedName("ce.h")
    public int field1193;

    @ObfuscatedName("ce.q")
    public class327 field1215;

    @ObfuscatedName("ce.i")
    public class327 field1220;

    @ObfuscatedName("ce.ae")
    public class327 field1218;

    @ObfuscatedName("ce.ap")
    public boolean field1219;

    @ObfuscatedName("ce.ab")
    public int field1206;

    @ObfuscatedName("ce.al")
    public int field1195;

    public class98() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1197[var1] = "";
        }
        this.field1198 = 0;
        this.field1216 = 0;
        this.field1201 = 0;
        this.field1222 = 0;
        this.field1211 = false;
        this.field1212 = 0;
        this.field1205 = false;
        this.field1215 = class327.field3856;
        this.field1220 = class327.field3856;
        this.field1218 = class327.field3856;
        this.field1219 = false;
    }

    @ObfuscatedName("ce.v(Lnd;B)V")
    public final void method1911(class383 arg0) {
        arg0.field4158 = 0;
        int var2 = arg0.method5965();
        this.field1217 = arg0.method5966();
        this.field1196 = arg0.method5966();
        int var3 = -1;
        this.field1212 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5965();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5965();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5967();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class155.method4399(var4[var5] - 512).field1846;
                    if (var8 != 0) {
                        this.field1212 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5965();
            if (var11 < 0 || var11 >= Statics.field138[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1242 = arg0.method5967();
        if (this.field1242 == 65535) {
            this.field1242 = -1;
        }
        this.field1282 = arg0.method5967();
        if (this.field1282 == 65535) {
            this.field1282 = -1;
        }
        this.field1244 = this.field1282;
        this.field1245 = arg0.method5967();
        if (this.field1245 == 65535) {
            this.field1245 = -1;
        }
        this.field1268 = arg0.method5967();
        if (this.field1268 == 65535) {
            this.field1268 = -1;
        }
        this.field1293 = arg0.method5967();
        if (this.field1293 == 65535) {
            this.field1293 = -1;
        }
        this.field1248 = arg0.method5967();
        if (this.field1248 == 65535) {
            this.field1248 = -1;
        }
        this.field1294 = arg0.method5967();
        if (this.field1294 == 65535) {
            this.field1294 = -1;
        }
        this.field1199 = new class328(arg0.method5974(), Statics.field2039);
        this.method1913();
        this.method1915();
        this.method1952();
        if (Statics.field1163 == this) {
            Statics.field4290 = this.field1199.method5338();
        }
        this.field1198 = arg0.method5965();
        this.field1216 = arg0.method5967();
        this.field1205 = arg0.method5965() == 1;
        if (client.field851 == 0 && client.field811 >= 2) {
            this.field1205 = false;
        }
        class136[] var12 = null;
        boolean var13 = false;
        if (arg0.field4158 < arg0.field4155.length) {
            int var14 = arg0.method5967();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class136[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        int var19 = var4[var15] - 512;
                        int var20 = arg0.method5965();
                        boolean var21 = (var20 & 0x1) != 0;
                        boolean var22 = (var20 & 0x2) != 0;
                        class136 var23 = new class136(var19);
                        if (var21) {
                            int var24 = arg0.method5965();
                            int[] var25 = new int[] { var24 & 0xF, var24 >> 4 & 0xF };
                            boolean var26 = var23.field1538 != null && var23.field1538.length == var25.length;
                            for (int var27 = 0; var27 < 2; var27++) {
                                if (var25[var27] != 15) {
                                    short var28 = (short) arg0.method5967();
                                    if (var26) {
                                        var23.field1538[var25[var27]] = var28;
                                    }
                                }
                            }
                        }
                        if (var22) {
                            int var29 = arg0.method5965();
                            int[] var30 = new int[] { var29 & 0xF, var29 >> 4 & 0xF };
                            boolean var31 = var23.field1539 != null && var23.field1539.length == var30.length;
                            for (int var32 = 0; var32 < 2; var32++) {
                                if (var30[var32] != 15) {
                                    short var33 = (short) arg0.method5967();
                                    if (var31) {
                                        var23.field1539[var30[var32]] = var33;
                                    }
                                }
                            }
                        }
                        var12[var15] = var23;
                    }
                }
            }
        }
        if (this.field1194 == null) {
            this.field1194 = new class245();
        }
        this.field1194.method4278(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("ce.f(I)Z")
    public boolean method1912() {
        if (class327.field3856 == this.field1215) {
            this.method1914();
        }
        return class327.field3855 == this.field1215;
    }

    @ObfuscatedName("ce.y(B)V")
    public void method1913() {
        this.field1215 = class327.field3856;
    }

    @ObfuscatedName("ce.b(I)V")
    public void method1914() {
        this.field1215 = Statics.field1508.method1561(this.field1199) ? class327.field3855 : class327.field3854;
    }

    @ObfuscatedName("ce.d(B)Z")
    public boolean method1956() {
        if (class327.field3856 == this.field1220) {
            this.method1917();
        }
        return class327.field3855 == this.field1220;
    }

    @ObfuscatedName("ce.s(B)V")
    public void method1915() {
        this.field1220 = class327.field3856;
    }

    @ObfuscatedName("ce.u(I)V")
    public void method1917() {
        this.field1220 = Statics.field1987 != null && Statics.field1987.method5248(this.field1199) ? class327.field3855 : class327.field3854;
    }

    @ObfuscatedName("ce.l(B)V")
    public void method1918() {
        this.field1218 = client.field735[0] == null || client.field735[0].method71(this.field1199.method5338()) == -1 ? class327.field3854 : class327.field3855;
    }

    @ObfuscatedName("ce.o(I)V")
    public void method1952() {
        this.field1218 = class327.field3856;
    }

    @ObfuscatedName("ce.c(I)Z")
    public boolean method1931() {
        if (class327.field3856 == this.field1218) {
            this.method1918();
        }
        return class327.field3855 == this.field1218;
    }

    @ObfuscatedName("ce.e(I)I")
    public int method1921() {
        return this.field1194 == null || this.field1194.field2932 == -1 ? 1 : class146.method2653(this.field1194.field2932).field1637;
    }

    @ObfuscatedName("ce.n(B)Lgr;")
    public final class205 method1710() {
        if (this.field1194 == null) {
            return null;
        }
        class157 var1 = this.field1269 != -1 && this.field1272 == 0 ? class157.method2030(this.field1269) : null;
        class157 var2 = this.field1243 == -1 || this.field1211 || this.field1243 == this.field1242 && var1 != null ? null : class157.method2030(this.field1243);
        class205 var3 = this.field1194.method4254(var1, this.field1292, var2, this.field1252);
        if (var3 == null) {
            return null;
        }
        var3.method3791();
        this.field1277 = var3.field2360;
        if (!this.field1211 && this.field1274 != -1 && this.field1263 != -1) {
            class205 var4 = class148.method2427(this.field1274).method2562(this.field1263);
            if (var4 != null) {
                var4.method3802(0, -this.field1278, 0);
                class205[] var5 = new class205[] { var3, var4 };
                var3 = new class205(var5, 2);
            }
        }
        if (!this.field1211 && this.field1213 != null) {
            if (client.field650 >= this.field1222) {
                this.field1213 = null;
            }
            if (client.field650 >= this.field1201 && client.field650 < this.field1222) {
                class205 var6 = this.field1213;
                var6.method3802(this.field1203 - this.field1238, this.field1204 - this.field1200, this.field1221 - this.field1237);
                if (this.field1267 == 512) {
                    var6.method3798();
                    var6.method3798();
                    var6.method3798();
                } else if (this.field1267 == 1024) {
                    var6.method3798();
                    var6.method3798();
                } else if (this.field1267 == 1536) {
                    var6.method3798();
                }
                class205[] var7 = new class205[] { var3, var6 };
                var3 = new class205(var7, 2);
                if (this.field1267 == 512) {
                    var6.method3798();
                } else if (this.field1267 == 1024) {
                    var6.method3798();
                    var6.method3798();
                } else if (this.field1267 == 1536) {
                    var6.method3798();
                    var6.method3798();
                    var6.method3798();
                }
                var6.method3802(this.field1238 - this.field1203, this.field1200 - this.field1204, this.field1237 - this.field1221);
            }
        }
        var3.field2449 = true;
        return var3;
    }

    @ObfuscatedName("ce.g(IIBI)V")
    public final void method1934(int arg0, int arg1, byte arg2) {
        if (this.field1269 != -1 && class157.method2030(this.field1269).field1891 == 1) {
            this.field1269 = -1;
        }
        this.field1265 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1923(arg0, arg1);
        } else if (this.field1273[0] >= 0 && this.field1273[0] < 104 && this.field1287[0] >= 0 && this.field1287[0] < 104) {
            if (arg2 == 2) {
                class98 var4 = this;
                int var5 = this.field1273[0];
                int var6 = this.field1287[0];
                int var7 = this.method1921();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class160.method686(var5, var6, this.method1921(), client.method5879(arg0, arg1), client.field700[this.field1214], true, client.field690, client.field852);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method1970(client.field690[var9], client.field852[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method1970(arg0, arg1, arg2);
        } else {
            this.method1923(arg0, arg1);
        }
    }

    @ObfuscatedName("ce.a(III)V")
    public void method1923(int arg0, int arg1) {
        this.field1291 = 0;
        this.field1275 = 0;
        this.field1295 = 0;
        this.field1273[0] = arg0;
        this.field1287[0] = arg1;
        int var3 = this.method1921();
        this.field1238 = this.field1273[0] * 128 + var3 * 64;
        this.field1237 = this.field1287[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("ce.k(IIBB)V")
    public final void method1970(int arg0, int arg1, byte arg2) {
        if (this.field1291 < 9) {
            this.field1291++;
        }
        for (int var4 = this.field1291; var4 > 0; var4--) {
            this.field1273[var4] = this.field1273[var4 - 1];
            this.field1287[var4] = this.field1287[var4 - 1];
            this.field1247[var4] = this.field1247[var4 - 1];
        }
        this.field1273[0] = arg0;
        this.field1287[0] = arg1;
        this.field1247[0] = arg2;
    }

    @ObfuscatedName("ce.m(B)Z")
    public final boolean method1968() {
        return this.field1194 != null;
    }
}
