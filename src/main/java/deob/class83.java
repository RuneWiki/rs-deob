package deob;

@ObfuscatedName("ci")
public final class class83 extends class85 {

    @ObfuscatedName("ci.l")
    public class422 field1067;

    @ObfuscatedName("ci.q")
    public class260 field1062;

    @ObfuscatedName("ci.f")
    public int field1063 = -1;

    @ObfuscatedName("ci.j")
    public int field1064 = -1;

    @ObfuscatedName("ci.k")
    public String[] field1078 = new String[3];

    @ObfuscatedName("ci.t")
    public int field1074;

    @ObfuscatedName("ci.a")
    public int field1072;

    @ObfuscatedName("ci.e")
    public int field1069;

    @ObfuscatedName("ci.i")
    public int field1070;

    @ObfuscatedName("ci.y")
    public int field1079;

    @ObfuscatedName("ci.w")
    public int field1088;

    @ObfuscatedName("ci.g")
    public int field1073;

    @ObfuscatedName("ci.v")
    public int field1071;

    @ObfuscatedName("ci.s")
    public class220 field1075;

    @ObfuscatedName("ci.c")
    public int field1076;

    @ObfuscatedName("ci.b")
    public int field1065;

    @ObfuscatedName("ci.x")
    public int field1068;

    @ObfuscatedName("ci.p")
    public int field1066;

    @ObfuscatedName("ci.z")
    public boolean field1080;

    @ObfuscatedName("ci.h")
    public int field1081;

    @ObfuscatedName("ci.o")
    public boolean field1082;

    @ObfuscatedName("ci.r")
    public int field1083;

    @ObfuscatedName("ci.n")
    public int field1084;

    @ObfuscatedName("ci.u")
    public class343 field1085;

    @ObfuscatedName("ci.d")
    public class343 field1086;

    @ObfuscatedName("ci.ab")
    public class343 field1087;

    @ObfuscatedName("ci.ad")
    public boolean field1061;

    @ObfuscatedName("ci.as")
    public int field1089;

    @ObfuscatedName("ci.ak")
    public int field1090;

    public class83() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1078[var1] = "";
        }
        this.field1074 = 0;
        this.field1072 = 0;
        this.field1070 = 0;
        this.field1079 = 0;
        this.field1080 = false;
        this.field1081 = 0;
        this.field1082 = false;
        this.field1085 = class343.field3978;
        this.field1086 = class343.field3978;
        this.field1087 = class343.field3978;
        this.field1061 = false;
    }

    @ObfuscatedName("ci.l(Lot;I)V")
    public final void method1989(class401 arg0) {
        arg0.field4292 = 0;
        int var2 = arg0.method6272();
        this.field1063 = arg0.method6273();
        this.field1064 = arg0.method6273();
        int var3 = -1;
        this.field1081 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method6272();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method6272();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method6284();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class170.method2099(var4[var5] - 512).field1901;
                    if (var8 != 0) {
                        this.field1081 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method6272();
            if (var11 < 0 || var11 >= Statics.field2102[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1112 = arg0.method6284();
        if (this.field1112 == 65535) {
            this.field1112 = -1;
        }
        this.field1113 = arg0.method6284();
        if (this.field1113 == 65535) {
            this.field1113 = -1;
        }
        this.field1153 = this.field1113;
        this.field1115 = arg0.method6284();
        if (this.field1115 == 65535) {
            this.field1115 = -1;
        }
        this.field1116 = arg0.method6284();
        if (this.field1116 == 65535) {
            this.field1116 = -1;
        }
        this.field1117 = arg0.method6284();
        if (this.field1117 == 65535) {
            this.field1117 = -1;
        }
        this.field1118 = arg0.method6284();
        if (this.field1118 == 65535) {
            this.field1118 = -1;
        }
        this.field1119 = arg0.method6284();
        if (this.field1119 == 65535) {
            this.field1119 = -1;
        }
        this.field1067 = new class422(arg0.method6474(), Statics.field2137);
        this.method1991();
        this.method1994();
        this.method2034();
        if (Statics.field868 == this) {
            Statics.field4432 = this.field1067.method6815();
        }
        this.field1074 = arg0.method6272();
        this.field1072 = arg0.method6284();
        this.field1082 = arg0.method6272() == 1;
        if (client.field485 == 0 && client.field660 >= 2) {
            this.field1082 = false;
        }
        class151[] var12 = null;
        boolean var13 = false;
        if (arg0.field4292 < arg0.field4294.length) {
            int var14 = arg0.method6284();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class151[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        int var19 = var4[var15] - 512;
                        int var20 = arg0.method6272();
                        boolean var21 = (var20 & 0x1) != 0;
                        boolean var22 = (var20 & 0x2) != 0;
                        class151 var23 = new class151(var19);
                        if (var21) {
                            int var24 = arg0.method6272();
                            int[] var25 = new int[] { var24 & 0xF, var24 >> 4 & 0xF };
                            boolean var26 = var23.field1607 != null && var23.field1607.length == var25.length;
                            for (int var27 = 0; var27 < 2; var27++) {
                                if (var25[var27] != 15) {
                                    short var28 = (short) arg0.method6284();
                                    if (var26) {
                                        var23.field1607[var25[var27]] = var28;
                                    }
                                }
                            }
                        }
                        if (var22) {
                            int var29 = arg0.method6272();
                            int[] var30 = new int[] { var29 & 0xF, var29 >> 4 & 0xF };
                            boolean var31 = var23.field1608 != null && var23.field1608.length == var30.length;
                            for (int var32 = 0; var32 < 2; var32++) {
                                if (var30[var32] != 15) {
                                    short var33 = (short) arg0.method6284();
                                    if (var31) {
                                        var23.field1608[var30[var32]] = var33;
                                    }
                                }
                            }
                        }
                        var12[var15] = var23;
                    }
                }
            }
        }
        if (this.field1062 == null) {
            this.field1062 = new class260();
        }
        this.field1062.method4519(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("ci.f(I)Z")
    public boolean method1990() {
        if (class343.field3978 == this.field1085) {
            this.method1992();
        }
        return class343.field3977 == this.field1085;
    }

    @ObfuscatedName("ci.j(I)V")
    public void method1991() {
        this.field1085 = class343.field3978;
    }

    @ObfuscatedName("ci.m(B)V")
    public void method1992() {
        this.field1085 = Statics.field464.method1618(this.field1067) ? class343.field3977 : class343.field3979;
    }

    @ObfuscatedName("ci.k(I)Z")
    public boolean method1993() {
        if (class343.field3978 == this.field1086) {
            this.method2033();
        }
        return class343.field3977 == this.field1086;
    }

    @ObfuscatedName("ci.a(I)V")
    public void method1994() {
        this.field1086 = class343.field3978;
    }

    @ObfuscatedName("ci.e(B)V")
    public void method2033() {
        this.field1086 = Statics.field3205 != null && Statics.field3205.method5539(this.field1067) ? class343.field3977 : class343.field3979;
    }

    @ObfuscatedName("ci.i(I)V")
    public void method1996() {
        for (int var1 = 0; var1 < 2; var1++) {
            if (client.field721[var1] != null && client.field721[var1].method2413(this.field1067.method6815()) != -1) {
                this.field1087 = class343.field3977;
                return;
            }
        }
        this.field1087 = class343.field3979;
    }

    @ObfuscatedName("ci.y(B)V")
    public void method2034() {
        this.field1087 = class343.field3978;
    }

    @ObfuscatedName("ci.w(I)Z")
    public boolean method2007() {
        if (class343.field3978 == this.field1087) {
            this.method1996();
        }
        return class343.field3977 == this.field1087;
    }

    @ObfuscatedName("ci.g(I)I")
    public int method2001() {
        return this.field1062 == null || this.field1062.field3016 == -1 ? 1 : class161.method2362(this.field1062.field3016).field1717;
    }

    @ObfuscatedName("ci.q(B)Lhl;")
    public final class220 method1785() {
        if (this.field1062 == null) {
            return null;
        }
        class172 var1 = this.field1139 != -1 && this.field1142 == 0 ? class172.method2708(this.field1139) : null;
        class172 var2 = this.field1136 == -1 || this.field1080 || this.field1136 == this.field1112 && var1 != null ? null : class172.method2708(this.field1136);
        class220 var3 = this.field1062.method4522(var1, this.field1164, var2, this.field1132);
        if (var3 == null) {
            return null;
        }
        var3.method4076();
        this.field1157 = var3.field2449;
        if (!this.field1080 && this.field1125 != -1 && this.field1145 != -1) {
            class220 var4 = Statics.method304(this.field1125).method2814(this.field1145);
            if (var4 != null) {
                var4.method4119(0, -this.field1148, 0);
                class220[] var5 = new class220[] { var3, var4 };
                var3 = new class220(var5, 2);
            }
        }
        if (!this.field1080 && this.field1075 != null) {
            if (client.field494 >= this.field1079) {
                this.field1075 = null;
            }
            if (client.field494 >= this.field1070 && client.field494 < this.field1079) {
                class220 var6 = this.field1075;
                var6.method4119(this.field1088 - this.field1140, this.field1073 - this.field1069, this.field1071 - this.field1124);
                if (this.field1158 == 512) {
                    var6.method4098();
                    var6.method4098();
                    var6.method4098();
                } else if (this.field1158 == 1024) {
                    var6.method4098();
                    var6.method4098();
                } else if (this.field1158 == 1536) {
                    var6.method4098();
                }
                class220[] var7 = new class220[] { var3, var6 };
                var3 = new class220(var7, 2);
                if (this.field1158 == 512) {
                    var6.method4098();
                } else if (this.field1158 == 1024) {
                    var6.method4098();
                    var6.method4098();
                } else if (this.field1158 == 1536) {
                    var6.method4098();
                    var6.method4098();
                    var6.method4098();
                }
                var6.method4119(this.field1140 - this.field1088, this.field1069 - this.field1073, this.field1124 - this.field1071);
            }
        }
        var3.field2531 = true;
        return var3;
    }

    @ObfuscatedName("ci.v(IIBB)V")
    public final void method2000(int arg0, int arg1, byte arg2) {
        if (this.field1139 != -1 && class172.method2708(this.field1139).field1961 == 1) {
            this.field1139 = -1;
        }
        this.field1135 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2008(arg0, arg1);
        } else if (this.field1162[0] >= 0 && this.field1162[0] < 104 && this.field1163[0] >= 0 && this.field1163[0] < 104) {
            if (arg2 == 2) {
                class83 var4 = this;
                int var5 = this.field1162[0];
                int var6 = this.field1163[0];
                int var7 = this.method2001();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method2001();
                    client.field650.field1987 = arg0;
                    client.field650.field1984 = arg1;
                    client.field650.field1985 = 1;
                    client.field650.field1986 = 1;
                    class59 var9 = client.field650;
                    class59 var10 = var9;
                    class173 var11 = client.field712[this.field1083];
                    int[] var12 = client.field669;
                    int[] var13 = client.field492;
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
                                class175.field1994[var18][var19] = 99;
                                class175.field1992[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class175.field1997[var22] = var5;
                                int var57 = var22 + 1;
                                class175.field1998[var22] = var6;
                                int[][] var24 = var11.field1979;
                                boolean var29;
                                while (true) {
                                    if (var57 == var23) {
                                        Statics.field3871 = var16;
                                        Statics.field1995 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class175.field1997[var23];
                                    var17 = class175.field1998[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var11.field1975;
                                    int var28 = var17 - var11.field1976;
                                    if (var10.method1032(1, var16, var17, var11)) {
                                        Statics.field3871 = var16;
                                        Statics.field1995 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class175.field1992[var25][var26] + 1;
                                    if (var25 > 0 && class175.field1994[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0) {
                                        class175.field1997[var57] = var16 - 1;
                                        class175.field1998[var57] = var17;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1994[var25 - 1][var26] = 2;
                                        class175.field1992[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 127 && class175.field1994[var25 + 1][var26] == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0) {
                                        class175.field1997[var57] = var16 + 1;
                                        class175.field1998[var57] = var17;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1994[var25 + 1][var26] = 8;
                                        class175.field1992[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class175.field1994[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class175.field1997[var57] = var16;
                                        class175.field1998[var57] = var17 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1994[var25][var26 - 1] = 1;
                                        class175.field1992[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 127 && class175.field1994[var25][var26 + 1] == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class175.field1997[var57] = var16;
                                        class175.field1998[var57] = var17 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1994[var25][var26 + 1] = 4;
                                        class175.field1992[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class175.field1994[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class175.field1997[var57] = var16 - 1;
                                        class175.field1998[var57] = var17 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1994[var25 - 1][var26 - 1] = 3;
                                        class175.field1992[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 127 && var26 > 0 && class175.field1994[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class175.field1997[var57] = var16 + 1;
                                        class175.field1998[var57] = var17 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1994[var25 + 1][var26 - 1] = 9;
                                        class175.field1992[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 127 && class175.field1994[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class175.field1997[var57] = var16 - 1;
                                        class175.field1998[var57] = var17 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1994[var25 - 1][var26 + 1] = 6;
                                        class175.field1992[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 127 && var26 < 127 && class175.field1994[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 1] & 0x12401E0) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class175.field1997[var57] = var16 + 1;
                                        class175.field1998[var57] = var17 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class175.field1994[var25 + 1][var26 + 1] = 12;
                                        class175.field1992[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var31 = var29;
                            } else if (var8 == 2) {
                                var31 = class175.method374(var5, var6, var9, var11);
                            } else {
                                var31 = class175.method2490(var5, var6, var8, var9, var11);
                            }
                            int var50;
                            label326: {
                                int var32 = var5 - 64;
                                int var33 = var6 - 64;
                                int var34 = Statics.field3871;
                                int var35 = Statics.field1995;
                                if (!var31) {
                                    int var36 = Integer.MAX_VALUE;
                                    int var37 = Integer.MAX_VALUE;
                                    byte var38 = 10;
                                    int var39 = var10.field1987;
                                    int var40 = var10.field1984;
                                    int var41 = var10.field1985;
                                    int var42 = var10.field1986;
                                    for (int var43 = var39 - var38; var43 <= var38 + var39; var43++) {
                                        for (int var44 = var40 - var38; var44 <= var38 + var40; var44++) {
                                            int var45 = var43 - var32;
                                            int var46 = var44 - var33;
                                            if (var45 >= 0 && var46 >= 0 && var45 < 128 && var46 < 128 && class175.field1992[var45][var46] < 100) {
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
                                                if (var49 < var36 || var36 == var49 && class175.field1992[var45][var46] < var37) {
                                                    var36 = var49;
                                                    var37 = class175.field1992[var45][var46];
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
                                    class175.field1997[var51] = var34;
                                    int var58 = var51 + 1;
                                    class175.field1998[var51] = var35;
                                    int var52;
                                    int var53 = var52 = class175.field1994[var34 - var32][var35 - var33];
                                    while (var5 != var34 || var6 != var35) {
                                        if (var52 != var53) {
                                            var52 = var53;
                                            class175.field1997[var58] = var34;
                                            class175.field1998[var58++] = var35;
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
                                        var53 = class175.field1994[var34 - var32][var35 - var33];
                                    }
                                    int var54 = 0;
                                    while (var58-- > 0) {
                                        var12[var54] = class175.field1997[var58];
                                        var13[var54++] = class175.field1998[var58];
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
                                var4.method2002(client.field669[var56], client.field492[var56], (byte) 2);
                                var56++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class175.field1994[var14][var15] = 0;
                            class175.field1992[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method2002(arg0, arg1, arg2);
        } else {
            this.method2008(arg0, arg1);
        }
    }

    @ObfuscatedName("ci.s(III)V")
    public void method2008(int arg0, int arg1) {
        this.field1161 = 0;
        this.field1130 = 0;
        this.field1165 = 0;
        this.field1162[0] = arg0;
        this.field1163[0] = arg1;
        int var3 = this.method2001();
        this.field1140 = this.field1162[0] * 128 + var3 * 64;
        this.field1124 = this.field1163[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("ci.c(IIBI)V")
    public final void method2002(int arg0, int arg1, byte arg2) {
        if (this.field1161 < 9) {
            this.field1161++;
        }
        for (int var4 = this.field1161; var4 > 0; var4--) {
            this.field1162[var4] = this.field1162[var4 - 1];
            this.field1163[var4] = this.field1163[var4 - 1];
            this.field1114[var4] = this.field1114[var4 - 1];
        }
        this.field1162[0] = arg0;
        this.field1163[0] = arg1;
        this.field1114[0] = arg2;
    }

    @ObfuscatedName("ci.b(I)Z")
    public final boolean method1999() {
        return this.field1062 != null;
    }
}
