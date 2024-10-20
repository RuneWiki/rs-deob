package deob;

@ObfuscatedName("cj")
public final class class98 extends class100 {

    @ObfuscatedName("cj.f")
    public class329 field1175;

    @ObfuscatedName("cj.e")
    public class246 field1176;

    @ObfuscatedName("cj.v")
    public int field1182 = -1;

    @ObfuscatedName("cj.y")
    public int field1177 = -1;

    @ObfuscatedName("cj.o")
    public String[] field1180 = new String[3];

    @ObfuscatedName("cj.m")
    public int field1201;

    @ObfuscatedName("cj.r")
    public int field1188;

    @ObfuscatedName("cj.h")
    public int field1183;

    @ObfuscatedName("cj.d")
    public int field1184;

    @ObfuscatedName("cj.z")
    public int field1185;

    @ObfuscatedName("cj.b")
    public int field1186;

    @ObfuscatedName("cj.i")
    public int field1187;

    @ObfuscatedName("cj.k")
    public int field1198;

    @ObfuscatedName("cj.g")
    public class206 field1204;

    @ObfuscatedName("cj.t")
    public int field1190;

    @ObfuscatedName("cj.x")
    public int field1191;

    @ObfuscatedName("cj.u")
    public int field1192;

    @ObfuscatedName("cj.q")
    public int field1196;

    @ObfuscatedName("cj.s")
    public boolean field1194;

    @ObfuscatedName("cj.p")
    public int field1195;

    @ObfuscatedName("cj.c")
    public boolean field1189;

    @ObfuscatedName("cj.n")
    public int field1197;

    @ObfuscatedName("cj.l")
    public int field1193;

    @ObfuscatedName("cj.w")
    public class328 field1199;

    @ObfuscatedName("cj.a")
    public class328 field1200;

    @ObfuscatedName("cj.aw")
    public class328 field1178;

    @ObfuscatedName("cj.ak")
    public boolean field1202;

    @ObfuscatedName("cj.ad")
    public int field1203;

    @ObfuscatedName("cj.at")
    public int field1181;

    public class98() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1180[var1] = "";
        }
        this.field1201 = 0;
        this.field1188 = 0;
        this.field1184 = 0;
        this.field1185 = 0;
        this.field1194 = false;
        this.field1195 = 0;
        this.field1189 = false;
        this.field1199 = class328.field3853;
        this.field1200 = class328.field3853;
        this.field1178 = class328.field3853;
        this.field1202 = false;
    }

    @ObfuscatedName("cj.f(Lnt;I)V")
    public final void method1943(class384 arg0) {
        arg0.field4161 = 0;
        int var2 = arg0.method5902();
        this.field1182 = arg0.method5968();
        this.field1177 = arg0.method5968();
        int var3 = -1;
        this.field1195 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5902();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5902();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5899();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class156.method4403(var4[var5] - 512).field1858;
                    if (var8 != 0) {
                        this.field1195 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5902();
            if (var11 < 0 || var11 >= Statics.field569[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1248 = arg0.method5899();
        if (this.field1248 == 65535) {
            this.field1248 = -1;
        }
        this.field1229 = arg0.method5899();
        if (this.field1229 == 65535) {
            this.field1229 = -1;
        }
        this.field1230 = this.field1229;
        this.field1253 = arg0.method5899();
        if (this.field1253 == 65535) {
            this.field1253 = -1;
        }
        this.field1267 = arg0.method5899();
        if (this.field1267 == 65535) {
            this.field1267 = -1;
        }
        this.field1256 = arg0.method5899();
        if (this.field1256 == 65535) {
            this.field1256 = -1;
        }
        this.field1234 = arg0.method5899();
        if (this.field1234 == 65535) {
            this.field1234 = -1;
        }
        this.field1235 = arg0.method5899();
        if (this.field1235 == 65535) {
            this.field1235 = -1;
        }
        this.field1175 = new class329(arg0.method5906(), Statics.field1311);
        this.method1990();
        this.method1949();
        this.method1952();
        if (Statics.field3197 == this) {
            Statics.field1027 = this.field1175.method5264();
        }
        this.field1201 = arg0.method5902();
        this.field1188 = arg0.method5899();
        this.field1189 = arg0.method5902() == 1;
        if (client.field816 == 0 && client.field792 >= 2) {
            this.field1189 = false;
        }
        class137[] var12 = null;
        boolean var13 = false;
        if (arg0.field4161 < arg0.field4160.length) {
            int var14 = arg0.method5899();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class137[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        var12[var15] = class137.method1770(var4[var15] - 512, arg0);
                    }
                }
            }
        }
        if (this.field1176 == null) {
            this.field1176 = new class246();
        }
        this.field1176.method4306(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("cj.v(I)Z")
    public boolean method1945() {
        if (class328.field3853 == this.field1199) {
            this.method1981();
        }
        return class328.field3852 == this.field1199;
    }

    @ObfuscatedName("cj.j(I)V")
    public void method1990() {
        this.field1199 = class328.field3853;
    }

    @ObfuscatedName("cj.o(I)V")
    public void method1981() {
        this.field1199 = Statics.field288.method1616(this.field1175) ? class328.field3852 : class328.field3851;
    }

    @ObfuscatedName("cj.m(S)Z")
    public boolean method1948() {
        if (class328.field3853 == this.field1200) {
            this.method1977();
        }
        return class328.field3852 == this.field1200;
    }

    @ObfuscatedName("cj.r(I)V")
    public void method1949() {
        this.field1200 = class328.field3853;
    }

    @ObfuscatedName("cj.h(I)V")
    public void method1977() {
        this.field1200 = Statics.field3675 != null && Statics.field3675.method5252(this.field1175) ? class328.field3852 : class328.field3851;
    }

    @ObfuscatedName("cj.d(I)V")
    public void method1951() {
        this.field1178 = client.field852[0] == null || client.field852[0].method147(this.field1175.method5264()) == -1 ? class328.field3851 : class328.field3852;
    }

    @ObfuscatedName("cj.z(I)V")
    public void method1952() {
        this.field1178 = class328.field3853;
    }

    @ObfuscatedName("cj.b(I)Z")
    public boolean method1953() {
        if (class328.field3853 == this.field1178) {
            this.method1951();
        }
        return class328.field3852 == this.field1178;
    }

    @ObfuscatedName("cj.i(I)I")
    public int method1954() {
        return this.field1176 == null || this.field1176.field2941 == -1 ? 1 : class147.method4374(this.field1176.field2941).field1666;
    }

    @ObfuscatedName("cj.e(I)Lgd;")
    public final class206 method1758() {
        if (this.field1176 == null) {
            return null;
        }
        class158 var1 = this.field1255 != -1 && this.field1258 == 0 ? class158.method3363(this.field1255) : null;
        class158 var2 = this.field1252 == -1 || this.field1194 || this.field1252 == this.field1248 && var1 != null ? null : class158.method3363(this.field1252);
        class206 var3 = this.field1176.method4288(var1, this.field1272, var2, this.field1222);
        if (var3 == null) {
            return null;
        }
        var3.method3842();
        this.field1273 = var3.field2359;
        if (!this.field1194 && this.field1260 != -1 && this.field1261 != -1) {
            class206 var4 = class149.method1892(this.field1260).method2580(this.field1261);
            if (var4 != null) {
                var4.method3872(0, -this.field1264, 0);
                class206[] var5 = new class206[] { var3, var4 };
                var3 = new class206(var5, 2);
            }
        }
        if (!this.field1194 && this.field1204 != null) {
            if (client.field631 >= this.field1185) {
                this.field1204 = null;
            }
            if (client.field631 >= this.field1184 && client.field631 < this.field1185) {
                class206 var6 = this.field1204;
                var6.method3872(this.field1186 - this.field1242, this.field1187 - this.field1183, this.field1198 - this.field1223);
                if (this.field1274 == 512) {
                    var6.method3848();
                    var6.method3848();
                    var6.method3848();
                } else if (this.field1274 == 1024) {
                    var6.method3848();
                    var6.method3848();
                } else if (this.field1274 == 1536) {
                    var6.method3848();
                }
                class206[] var7 = new class206[] { var3, var6 };
                var3 = new class206(var7, 2);
                if (this.field1274 == 512) {
                    var6.method3848();
                } else if (this.field1274 == 1024) {
                    var6.method3848();
                    var6.method3848();
                } else if (this.field1274 == 1536) {
                    var6.method3848();
                    var6.method3848();
                    var6.method3848();
                }
                var6.method3872(this.field1242 - this.field1186, this.field1183 - this.field1187, this.field1223 - this.field1198);
            }
        }
        var3.field2445 = true;
        return var3;
    }

    @ObfuscatedName("cj.k(IIBI)V")
    public final void method1956(int arg0, int arg1, byte arg2) {
        if (this.field1255 != -1 && class158.method3363(this.field1255).field1894 == 1) {
            this.field1255 = -1;
        }
        this.field1281 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1978(arg0, arg1);
        } else if (this.field1278[0] >= 0 && this.field1278[0] < 104 && this.field1279[0] >= 0 && this.field1279[0] < 104) {
            if (arg2 == 2) {
                class98 var4 = this;
                int var5 = this.field1278[0];
                int var6 = this.field1279[0];
                int var7 = this.method1954();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1954();
                    client.field734.field1916 = arg0;
                    client.field734.field1915 = arg1;
                    client.field734.field1921 = 1;
                    client.field734.field1917 = 1;
                    class74 var9 = client.field734;
                    class74 var10 = var9;
                    class159 var11 = client.field769[this.field1197];
                    int[] var12 = client.field740;
                    int[] var13 = client.field632;
                    int var14 = 0;
                    label339: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class161.method2313(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class161.field1924[var19][var20] = 99;
                                class161.field1925[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class161.field1926[var23] = var5;
                                int var57 = var23 + 1;
                                class161.field1922[var23] = var6;
                                int[][] var25 = var11.field1912;
                                boolean var30;
                                while (true) {
                                    if (var57 == var24) {
                                        Statics.field1034 = var17;
                                        Statics.field609 = var18;
                                        var30 = false;
                                        break;
                                    }
                                    var17 = class161.field1926[var24];
                                    var18 = class161.field1922[var24];
                                    var24 = var24 + 1 & 0xFFF;
                                    int var26 = var17 - var21;
                                    int var27 = var18 - var22;
                                    int var28 = var17 - var11.field1910;
                                    int var29 = var18 - var11.field1909;
                                    if (var10.method1037(2, var17, var18, var11)) {
                                        Statics.field1034 = var17;
                                        Statics.field609 = var18;
                                        var30 = true;
                                        break;
                                    }
                                    int var31 = class161.field1925[var26][var27] + 1;
                                    if (var26 > 0 && class161.field1924[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var29 + 1] & 0x1240138) == 0) {
                                        class161.field1926[var57] = var17 - 1;
                                        class161.field1922[var57] = var18;
                                        var57 = var57 + 1 & 0xFFF;
                                        class161.field1924[var26 - 1][var27] = 2;
                                        class161.field1925[var26 - 1][var27] = var31;
                                    }
                                    if (var26 < 126 && class161.field1924[var26 + 1][var27] == 0 && (var25[var28 + 2][var29] & 0x1240183) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E0) == 0) {
                                        class161.field1926[var57] = var17 + 1;
                                        class161.field1922[var57] = var18;
                                        var57 = var57 + 1 & 0xFFF;
                                        class161.field1924[var26 + 1][var27] = 8;
                                        class161.field1925[var26 + 1][var27] = var31;
                                    }
                                    if (var27 > 0 && class161.field1924[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var28 + 1][var29 - 1] & 0x1240183) == 0) {
                                        class161.field1926[var57] = var17;
                                        class161.field1922[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class161.field1924[var26][var27 - 1] = 1;
                                        class161.field1925[var26][var27 - 1] = var31;
                                    }
                                    if (var27 < 126 && class161.field1924[var26][var27 + 1] == 0 && (var25[var28][var29 + 2] & 0x1240138) == 0 && (var25[var28 + 1][var29 + 2] & 0x12401E0) == 0) {
                                        class161.field1926[var57] = var17;
                                        class161.field1922[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class161.field1924[var26][var27 + 1] = 4;
                                        class161.field1925[var26][var27 + 1] = var31;
                                    }
                                    if (var26 > 0 && var27 > 0 && class161.field1924[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29] & 0x124013E) == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0 && (var25[var28][var29 - 1] & 0x124018F) == 0) {
                                        class161.field1926[var57] = var17 - 1;
                                        class161.field1922[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class161.field1924[var26 - 1][var27 - 1] = 3;
                                        class161.field1925[var26 - 1][var27 - 1] = var31;
                                    }
                                    if (var26 < 126 && var27 > 0 && class161.field1924[var26 + 1][var27 - 1] == 0 && (var25[var28 + 1][var29 - 1] & 0x124018F) == 0 && (var25[var28 + 2][var29 - 1] & 0x1240183) == 0 && (var25[var28 + 2][var29] & 0x12401E3) == 0) {
                                        class161.field1926[var57] = var17 + 1;
                                        class161.field1922[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class161.field1924[var26 + 1][var27 - 1] = 9;
                                        class161.field1925[var26 + 1][var27 - 1] = var31;
                                    }
                                    if (var26 > 0 && var27 < 126 && class161.field1924[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var29 + 1] & 0x124013E) == 0 && (var25[var28 - 1][var29 + 2] & 0x1240138) == 0 && (var25[var28][var29 + 2] & 0x12401F8) == 0) {
                                        class161.field1926[var57] = var17 - 1;
                                        class161.field1922[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class161.field1924[var26 - 1][var27 + 1] = 6;
                                        class161.field1925[var26 - 1][var27 + 1] = var31;
                                    }
                                    if (var26 < 126 && var27 < 126 && class161.field1924[var26 + 1][var27 + 1] == 0 && (var25[var28 + 1][var29 + 2] & 0x12401F8) == 0 && (var25[var28 + 2][var29 + 2] & 0x12401E0) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E3) == 0) {
                                        class161.field1926[var57] = var17 + 1;
                                        class161.field1922[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class161.field1924[var26 + 1][var27 + 1] = 12;
                                        class161.field1925[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var16 = var30;
                            } else {
                                var16 = class161.method312(var5, var6, var8, var9, var11);
                            }
                            int var50;
                            label362: {
                                int var32 = var5 - 64;
                                int var33 = var6 - 64;
                                int var34 = Statics.field1034;
                                int var35 = Statics.field609;
                                if (!var16) {
                                    int var36 = Integer.MAX_VALUE;
                                    int var37 = Integer.MAX_VALUE;
                                    byte var38 = 10;
                                    int var39 = var10.field1916;
                                    int var40 = var10.field1915;
                                    int var41 = var10.field1921;
                                    int var42 = var10.field1917;
                                    for (int var43 = var39 - var38; var43 <= var38 + var39; var43++) {
                                        for (int var44 = var40 - var38; var44 <= var38 + var40; var44++) {
                                            int var45 = var43 - var32;
                                            int var46 = var44 - var33;
                                            if (var45 >= 0 && var46 >= 0 && var45 < 128 && var46 < 128 && class161.field1925[var45][var46] < 100) {
                                                int var47 = 0;
                                                if (var43 < var39) {
                                                    var47 = var39 - var43;
                                                } else if (var43 > var39 + var41 - 1) {
                                                    var47 = var43 - (var39 + var41 - 1);
                                                }
                                                int var48 = 0;
                                                if (var44 < var40) {
                                                    var48 = var40 - var44;
                                                } else if (var44 > var40 + var42 - 1) {
                                                    var48 = var44 - (var40 + var42 - 1);
                                                }
                                                int var49 = var47 * var47 + var48 * var48;
                                                if (var49 < var36 || var36 == var49 && class161.field1925[var45][var46] < var37) {
                                                    var36 = var49;
                                                    var37 = class161.field1925[var45][var46];
                                                    var34 = var43;
                                                    var35 = var44;
                                                }
                                            }
                                        }
                                    }
                                    if (var36 == Integer.MAX_VALUE) {
                                        var50 = -1;
                                        break label362;
                                    }
                                }
                                if (var5 == var34 && var6 == var35) {
                                    var50 = 0;
                                } else {
                                    byte var51 = 0;
                                    class161.field1926[var51] = var34;
                                    int var58 = var51 + 1;
                                    class161.field1922[var51] = var35;
                                    int var52;
                                    int var53 = var52 = class161.field1924[var34 - var32][var35 - var33];
                                    while (var5 != var34 || var6 != var35) {
                                        if (var52 != var53) {
                                            var52 = var53;
                                            class161.field1926[var58] = var34;
                                            class161.field1922[var58++] = var35;
                                        }
                                        if ((var53 & 0x2) != 0) {
                                            var34++;
                                        } else if ((var53 & 0x8) != 0) {
                                            var34--;
                                        }
                                        if ((var53 & 0x1) != 0) {
                                            var35++;
                                        } else if ((var53 & 0x4) != 0) {
                                            var35--;
                                        }
                                        var53 = class161.field1924[var34 - var32][var35 - var33];
                                    }
                                    int var54 = 0;
                                    while (var58-- > 0) {
                                        var12[var54] = class161.field1926[var58];
                                        var13[var54++] = class161.field1922[var58];
                                        if (var54 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var50 = var54;
                                }
                            }
                            int var55 = var50;
                            if (var50 < 1) {
                                break;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var55 - 1) {
                                    break label339;
                                }
                                var4.method1958(client.field740[var56], client.field632[var56], (byte) 2);
                                var56++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class161.field1924[var14][var15] = 0;
                            class161.field1925[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method1958(arg0, arg1, arg2);
        } else {
            this.method1978(arg0, arg1);
        }
    }

    @ObfuscatedName("cj.g(III)V")
    public void method1978(int arg0, int arg1) {
        this.field1228 = 0;
        this.field1282 = 0;
        this.field1243 = 0;
        this.field1278[0] = arg0;
        this.field1279[0] = arg1;
        int var3 = this.method1954();
        this.field1242 = this.field1278[0] * 128 + var3 * 64;
        this.field1223 = this.field1279[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cj.t(IIBI)V")
    public final void method1958(int arg0, int arg1, byte arg2) {
        if (this.field1228 < 9) {
            this.field1228++;
        }
        for (int var4 = this.field1228; var4 > 0; var4--) {
            this.field1278[var4] = this.field1278[var4 - 1];
            this.field1279[var4] = this.field1279[var4 - 1];
            this.field1280[var4] = this.field1280[var4 - 1];
        }
        this.field1278[0] = arg0;
        this.field1279[0] = arg1;
        this.field1280[0] = arg2;
    }

    @ObfuscatedName("cj.x(B)Z")
    public final boolean method1987() {
        return this.field1176 != null;
    }
}
