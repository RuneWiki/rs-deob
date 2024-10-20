package deob;

@ObfuscatedName("cx")
public final class class83 extends class85 {

    @ObfuscatedName("cx.i")
    public class422 field1048;

    @ObfuscatedName("cx.w")
    public class260 field1042;

    @ObfuscatedName("cx.s")
    public int field1041 = -1;

    @ObfuscatedName("cx.a")
    public int field1061 = -1;

    @ObfuscatedName("cx.g")
    public String[] field1046 = new String[3];

    @ObfuscatedName("cx.e")
    public int field1058;

    @ObfuscatedName("cx.p")
    public int field1047;

    @ObfuscatedName("cx.j")
    public int field1049;

    @ObfuscatedName("cx.b")
    public int field1050;

    @ObfuscatedName("cx.x")
    public int field1051;

    @ObfuscatedName("cx.y")
    public int field1043;

    @ObfuscatedName("cx.k")
    public int field1052;

    @ObfuscatedName("cx.t")
    public int field1053;

    @ObfuscatedName("cx.l")
    public class220 field1067;

    @ObfuscatedName("cx.u")
    public int field1056;

    @ObfuscatedName("cx.n")
    public int field1057;

    @ObfuscatedName("cx.z")
    public int field1045;

    @ObfuscatedName("cx.q")
    public int field1059;

    @ObfuscatedName("cx.d")
    public boolean field1060;

    @ObfuscatedName("cx.r")
    public int field1054;

    @ObfuscatedName("cx.m")
    public boolean field1062;

    @ObfuscatedName("cx.c")
    public int field1063;

    @ObfuscatedName("cx.f")
    public int field1064;

    @ObfuscatedName("cx.h")
    public class343 field1065;

    @ObfuscatedName("cx.v")
    public class343 field1066;

    @ObfuscatedName("cx.ag")
    public class343 field1044;

    @ObfuscatedName("cx.ae")
    public boolean field1068;

    @ObfuscatedName("cx.aq")
    public int field1069;

    @ObfuscatedName("cx.al")
    public int field1070;

    public class83() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1046[var1] = "";
        }
        this.field1058 = 0;
        this.field1047 = 0;
        this.field1050 = 0;
        this.field1051 = 0;
        this.field1060 = false;
        this.field1054 = 0;
        this.field1062 = false;
        this.field1065 = class343.field3969;
        this.field1066 = class343.field3969;
        this.field1044 = class343.field3969;
        this.field1068 = false;
    }

    @ObfuscatedName("cx.i(Lop;I)V")
    public final void method2010(class401 arg0) {
        arg0.field4300 = 0;
        int var2 = arg0.method6240();
        this.field1041 = arg0.method6241();
        this.field1061 = arg0.method6241();
        int var3 = -1;
        this.field1054 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method6240();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method6240();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method6242();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class170.method2586(var4[var5] - 512).field1920;
                    if (var8 != 0) {
                        this.field1054 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method6240();
            if (var11 < 0 || var11 >= Statics.field1520[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1090 = arg0.method6242();
        if (this.field1090 == 65535) {
            this.field1090 = -1;
        }
        this.field1141 = arg0.method6242();
        if (this.field1141 == 65535) {
            this.field1141 = -1;
        }
        this.field1112 = this.field1141;
        this.field1094 = arg0.method6242();
        if (this.field1094 == 65535) {
            this.field1094 = -1;
        }
        this.field1114 = arg0.method6242();
        if (this.field1114 == 65535) {
            this.field1114 = -1;
        }
        this.field1095 = arg0.method6242();
        if (this.field1095 == 65535) {
            this.field1095 = -1;
        }
        this.field1096 = arg0.method6242();
        if (this.field1096 == 65535) {
            this.field1096 = -1;
        }
        this.field1097 = arg0.method6242();
        if (this.field1097 == 65535) {
            this.field1097 = -1;
        }
        this.field1048 = new class422(arg0.method6335(), Statics.field3757);
        this.method1993();
        this.method1996();
        this.method1998();
        if (Statics.field1674 == this) {
            Statics.field4439 = this.field1048.method6813();
        }
        this.field1058 = arg0.method6240();
        this.field1047 = arg0.method6242();
        this.field1062 = arg0.method6240() == 1;
        if (client.field489 == 0 && client.field640 >= 2) {
            this.field1062 = false;
        }
        class151[] var12 = null;
        boolean var13 = false;
        if (arg0.field4300 < arg0.field4302.length) {
            int var14 = arg0.method6242();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class151[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        var12[var15] = class151.method2838(var4[var15] - 512, arg0);
                    }
                }
            }
        }
        if (this.field1042 == null) {
            this.field1042 = new class260();
        }
        this.field1042.method4532(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("cx.s(B)Z")
    public boolean method1991() {
        if (class343.field3969 == this.field1065) {
            this.method1990();
        }
        return class343.field3970 == this.field1065;
    }

    @ObfuscatedName("cx.a(I)V")
    public void method1993() {
        this.field1065 = class343.field3969;
    }

    @ObfuscatedName("cx.j(I)V")
    public void method1990() {
        this.field1065 = Statics.field1352.method1605(this.field1048) ? class343.field3970 : class343.field3971;
    }

    @ObfuscatedName("cx.b(I)Z")
    public boolean method2023() {
        if (class343.field3969 == this.field1066) {
            this.method1997();
        }
        return class343.field3970 == this.field1066;
    }

    @ObfuscatedName("cx.x(B)V")
    public void method1996() {
        this.field1066 = class343.field3969;
    }

    @ObfuscatedName("cx.y(I)V")
    public void method1997() {
        this.field1066 = Statics.field3704 != null && Statics.field3704.method5498(this.field1048) ? class343.field3970 : class343.field3971;
    }

    @ObfuscatedName("cx.k(I)V")
    public void method1994() {
        for (int var1 = 0; var1 < 2; var1++) {
            if (client.field700[var1] != null && client.field700[var1].method2431(this.field1048.method6813()) != -1) {
                this.field1044 = class343.field3970;
                return;
            }
        }
        this.field1044 = class343.field3971;
    }

    @ObfuscatedName("cx.t(B)V")
    public void method1998() {
        this.field1044 = class343.field3969;
    }

    @ObfuscatedName("cx.l(B)Z")
    public boolean method2021() {
        if (class343.field3969 == this.field1044) {
            this.method1994();
        }
        return class343.field3970 == this.field1044;
    }

    @ObfuscatedName("cx.u(B)I")
    public int method2047() {
        return this.field1042 == null || this.field1042.field3029 == -1 ? 1 : class161.method1044(this.field1042.field3029).field1707;
    }

    @ObfuscatedName("cx.w(I)Lhl;")
    public final class220 method1799() {
        if (this.field1042 == null) {
            return null;
        }
        class172 var1 = this.field1118 != -1 && this.field1121 == 0 ? class172.method589(this.field1118) : null;
        class172 var2 = this.field1115 == -1 || this.field1060 || this.field1115 == this.field1090 && var1 != null ? null : class172.method589(this.field1115);
        class220 var3 = this.field1042.method4514(var1, this.field1119, var2, this.field1116);
        if (var3 == null) {
            return null;
        }
        var3.method4095();
        this.field1136 = var3.field2444;
        if (!this.field1060 && this.field1123 != -1 && this.field1142 != -1) {
            class220 var4 = class163.method6452(this.field1123).method2844(this.field1142);
            if (var4 != null) {
                var4.method4070(0, -this.field1127, 0);
                class220[] var5 = new class220[] { var3, var4 };
                var3 = new class220(var5, 2);
            }
        }
        if (!this.field1060 && this.field1067 != null) {
            if (client.field555 >= this.field1051) {
                this.field1067 = null;
            }
            if (client.field555 >= this.field1050 && client.field555 < this.field1051) {
                class220 var6 = this.field1067;
                var6.method4070(this.field1043 - this.field1092, this.field1052 - this.field1049, this.field1053 - this.field1085);
                if (this.field1137 == 512) {
                    var6.method4076();
                    var6.method4076();
                    var6.method4076();
                } else if (this.field1137 == 1024) {
                    var6.method4076();
                    var6.method4076();
                } else if (this.field1137 == 1536) {
                    var6.method4076();
                }
                class220[] var7 = new class220[] { var3, var6 };
                var3 = new class220(var7, 2);
                if (this.field1137 == 512) {
                    var6.method4076();
                } else if (this.field1137 == 1024) {
                    var6.method4076();
                    var6.method4076();
                } else if (this.field1137 == 1536) {
                    var6.method4076();
                    var6.method4076();
                    var6.method4076();
                }
                var6.method4070(this.field1092 - this.field1043, this.field1049 - this.field1052, this.field1085 - this.field1053);
            }
        }
        var3.field2570 = true;
        return var3;
    }

    @ObfuscatedName("cx.n(IIBI)V")
    public final void method2002(int arg0, int arg1, byte arg2) {
        if (this.field1118 != -1 && class172.method589(this.field1118).field1957 == 1) {
            this.field1118 = -1;
        }
        this.field1113 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2001(arg0, arg1);
        } else if (this.field1091[0] >= 0 && this.field1091[0] < 104 && this.field1144[0] >= 0 && this.field1144[0] < 104) {
            if (arg2 == 2) {
                class83 var4 = this;
                int var5 = this.field1091[0];
                int var6 = this.field1144[0];
                int var7 = this.method2047();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method2047();
                    client.field744.field1981 = arg0;
                    client.field744.field1983 = arg1;
                    client.field744.field1982 = 1;
                    client.field744.field1984 = 1;
                    class59 var9 = client.field744;
                    class59 var10 = var9;
                    class173 var11 = client.field594[this.field1063];
                    int[] var12 = client.field539;
                    int[] var13 = client.field749;
                    int var14 = 0;
                    label303: while (true) {
                        if (var14 >= 128) {
                            boolean var31;
                            if (var8 == 1) {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class175.field1990[var18][var19] = 99;
                                class175.field1989[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class175.field1993[var22] = var5;
                                int var57 = var22 + 1;
                                class175.field1994[var22] = var6;
                                int[][] var24 = var11.field1979;
                                boolean var29;
                                while (true) {
                                    if (var57 == var23) {
                                        Statics.field1980 = var16;
                                        Statics.field846 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class175.field1993[var23];
                                    var17 = class175.field1994[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var11.field1975;
                                    int var28 = var17 - var11.field1976;
                                    if (var10.method1075(1, var16, var17, var11)) {
                                        Statics.field1980 = var16;
                                        Statics.field846 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class175.field1989[var25][var26] + 1;
                                    if (var25 > 0 && class175.field1990[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0) {
                                        class175.field1993[var57] = var16 - 1;
                                        class175.field1994[var57] = var17;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1990[var25 - 1][var26] = 2;
                                        class175.field1989[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 127 && class175.field1990[var25 + 1][var26] == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0) {
                                        class175.field1993[var57] = var16 + 1;
                                        class175.field1994[var57] = var17;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1990[var25 + 1][var26] = 8;
                                        class175.field1989[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class175.field1990[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class175.field1993[var57] = var16;
                                        class175.field1994[var57] = var17 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1990[var25][var26 - 1] = 1;
                                        class175.field1989[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 127 && class175.field1990[var25][var26 + 1] == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class175.field1993[var57] = var16;
                                        class175.field1994[var57] = var17 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1990[var25][var26 + 1] = 4;
                                        class175.field1989[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class175.field1990[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class175.field1993[var57] = var16 - 1;
                                        class175.field1994[var57] = var17 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1990[var25 - 1][var26 - 1] = 3;
                                        class175.field1989[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 127 && var26 > 0 && class175.field1990[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class175.field1993[var57] = var16 + 1;
                                        class175.field1994[var57] = var17 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1990[var25 + 1][var26 - 1] = 9;
                                        class175.field1989[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 127 && class175.field1990[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class175.field1993[var57] = var16 - 1;
                                        class175.field1994[var57] = var17 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1990[var25 - 1][var26 + 1] = 6;
                                        class175.field1989[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 127 && var26 < 127 && class175.field1990[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 1] & 0x12401E0) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class175.field1993[var57] = var16 + 1;
                                        class175.field1994[var57] = var17 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1990[var25 + 1][var26 + 1] = 12;
                                        class175.field1989[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var31 = var29;
                            } else if (var8 == 2) {
                                var31 = class175.method3566(var5, var6, var9, var11);
                            } else {
                                var31 = class175.method5283(var5, var6, var8, var9, var11);
                            }
                            int var50;
                            label326: {
                                int var32 = var5 - 64;
                                int var33 = var6 - 64;
                                int var34 = Statics.field1980;
                                int var35 = Statics.field846;
                                if (!var31) {
                                    int var36 = Integer.MAX_VALUE;
                                    int var37 = Integer.MAX_VALUE;
                                    byte var38 = 10;
                                    int var39 = var10.field1981;
                                    int var40 = var10.field1983;
                                    int var41 = var10.field1982;
                                    int var42 = var10.field1984;
                                    for (int var43 = var39 - var38; var43 <= var38 + var39; var43++) {
                                        for (int var44 = var40 - var38; var44 <= var38 + var40; var44++) {
                                            int var45 = var43 - var32;
                                            int var46 = var44 - var33;
                                            if (var45 >= 0 && var46 >= 0 && var45 < 128 && var46 < 128 && class175.field1989[var45][var46] < 100) {
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
                                                if (var49 < var36 || var36 == var49 && class175.field1989[var45][var46] < var37) {
                                                    var36 = var49;
                                                    var37 = class175.field1989[var45][var46];
                                                    var34 = var43;
                                                    var35 = var44;
                                                }
                                            }
                                        }
                                    }
                                    if (var36 == Integer.MAX_VALUE) {
                                        var50 = -1;
                                        break label326;
                                    }
                                }
                                if (var5 == var34 && var6 == var35) {
                                    var50 = 0;
                                } else {
                                    byte var51 = 0;
                                    class175.field1993[var51] = var34;
                                    int var58 = var51 + 1;
                                    class175.field1994[var51] = var35;
                                    int var52;
                                    int var53 = var52 = class175.field1990[var34 - var32][var35 - var33];
                                    while (var5 != var34 || var6 != var35) {
                                        if (var52 != var53) {
                                            var52 = var53;
                                            class175.field1993[var58] = var34;
                                            class175.field1994[var58++] = var35;
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
                                        var53 = class175.field1990[var34 - var32][var35 - var33];
                                    }
                                    int var54 = 0;
                                    while (var58-- > 0) {
                                        var12[var54] = class175.field1993[var58];
                                        var13[var54++] = class175.field1994[var58];
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
                                    break label303;
                                }
                                var4.method2004(client.field539[var56], client.field749[var56], (byte) 2);
                                var56++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class175.field1990[var14][var15] = 0;
                            class175.field1989[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method2004(arg0, arg1, arg2);
        } else {
            this.method2001(arg0, arg1);
        }
    }

    @ObfuscatedName("cx.z(III)V")
    public void method2001(int arg0, int arg1) {
        this.field1122 = 0;
        this.field1145 = 0;
        this.field1086 = 0;
        this.field1091[0] = arg0;
        this.field1144[0] = arg1;
        int var3 = this.method2047();
        this.field1092 = this.field1091[0] * 128 + var3 * 64;
        this.field1085 = this.field1144[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cx.q(IIBI)V")
    public final void method2004(int arg0, int arg1, byte arg2) {
        if (this.field1122 < 9) {
            this.field1122++;
        }
        for (int var4 = this.field1122; var4 > 0; var4--) {
            this.field1091[var4] = this.field1091[var4 - 1];
            this.field1144[var4] = this.field1144[var4 - 1];
            this.field1143[var4] = this.field1143[var4 - 1];
        }
        this.field1091[0] = arg0;
        this.field1144[0] = arg1;
        this.field1143[0] = arg2;
    }

    @ObfuscatedName("cx.d(I)Z")
    public final boolean method2005() {
        return this.field1042 != null;
    }
}
