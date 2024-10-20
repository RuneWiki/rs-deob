package deob;

@ObfuscatedName("bj")
public final class class74 extends class78 {

    @ObfuscatedName("bj.a")
    public String field832;

    @ObfuscatedName("bj.w")
    public class225 field827;

    @ObfuscatedName("bj.e")
    public int field812 = -1;

    @ObfuscatedName("bj.k")
    public int field813 = -1;

    @ObfuscatedName("bj.z")
    public String[] field814 = new String[3];

    @ObfuscatedName("bj.t")
    public int field820;

    @ObfuscatedName("bj.f")
    public int field816;

    @ObfuscatedName("bj.g")
    public int field817;

    @ObfuscatedName("bj.j")
    public int field818;

    @ObfuscatedName("bj.x")
    public int field819;

    @ObfuscatedName("bj.c")
    public int field810;

    @ObfuscatedName("bj.s")
    public int field831;

    @ObfuscatedName("bj.n")
    public int field821;

    @ObfuscatedName("bj.y")
    public class133 field823;

    @ObfuscatedName("bj.o")
    public int field824;

    @ObfuscatedName("bj.r")
    public int field825;

    @ObfuscatedName("bj.i")
    public int field826;

    @ObfuscatedName("bj.l")
    public int field829;

    @ObfuscatedName("bj.m")
    public boolean field828;

    @ObfuscatedName("bj.q")
    public int field833;

    @ObfuscatedName("bj.b")
    public boolean field830;

    @ObfuscatedName("bj.h")
    public int field822;

    @ObfuscatedName("bj.d")
    public int field811;

    @ObfuscatedName("bj.v")
    public boolean field815;

    @ObfuscatedName("bj.p")
    public int field834;

    @ObfuscatedName("bj.ab")
    public int field835;

    public class74() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field814[var1] = "";
        }
        this.field820 = 0;
        this.field816 = 0;
        this.field818 = 0;
        this.field819 = 0;
        this.field828 = false;
        this.field833 = 0;
        this.field830 = false;
        this.field815 = false;
    }

    @ObfuscatedName("bj.a(Lgh;B)V")
    public final void method994(class185 arg0) {
        arg0.field2509 = 0;
        int var2 = arg0.method2962();
        this.field812 = arg0.method3015();
        this.field813 = arg0.method3015();
        int var3 = -1;
        this.field833 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2962();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2962();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3194();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class268.method4160(var4[var5] - 512).field3607;
                    if (var8 != 0) {
                        this.field833 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2962();
            if (var11 < 0 || var11 >= Statics.field2735[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1128 = arg0.method3194();
        if (this.field1128 == 65535) {
            this.field1128 = -1;
        }
        this.field1129 = arg0.method3194();
        if (this.field1129 == 65535) {
            this.field1129 = -1;
        }
        this.field1177 = this.field1129;
        this.field1140 = arg0.method3194();
        if (this.field1140 == 65535) {
            this.field1140 = -1;
        }
        this.field1132 = arg0.method3194();
        if (this.field1132 == 65535) {
            this.field1132 = -1;
        }
        this.field1133 = arg0.method3194();
        if (this.field1133 == 65535) {
            this.field1133 = -1;
        }
        this.field1124 = arg0.method3194();
        if (this.field1124 == 65535) {
            this.field1124 = -1;
        }
        this.field1131 = arg0.method3194();
        if (this.field1131 == 65535) {
            this.field1131 = -1;
        }
        this.field832 = arg0.method3168();
        if (Statics.field2088 == this) {
            Statics.field2116 = this.field832;
        }
        this.field820 = arg0.method2962();
        this.field816 = arg0.method3194();
        this.field830 = arg0.method2962() == 1;
        if (client.field849 == 0 && client.field996 >= 2) {
            this.field830 = false;
        }
        if (this.field827 == null) {
            this.field827 = new class225();
        }
        this.field827.method3765(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bj.w(I)I")
    public int method982() {
        return this.field827 == null || this.field827.field2732 == -1 ? 1 : class270.method1336(this.field827.field2732).field3621;
    }

    @ObfuscatedName("bj.e(I)Lef;")
    public final class133 method981() {
        if (this.field827 == null) {
            return null;
        }
        class272 var1 = this.field1155 != -1 && this.field1146 == 0 ? class272.method3881(this.field1155) : null;
        class272 var2 = this.field1152 == -1 || this.field828 || this.field1152 == this.field1128 && var1 != null ? null : class272.method3881(this.field1152);
        class133 var3 = this.field827.method3759(var1, this.field1169, var2, this.field1153);
        if (var3 == null) {
            return null;
        }
        var3.method2302();
        this.field1137 = var3.field2010;
        if (!this.field828 && this.field1160 != -1 && this.field1161 != -1) {
            class133 var4 = class257.method4035(this.field1160).method4109(this.field1161);
            if (var4 != null) {
                var4.method2321(0, -this.field1164, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (!this.field828 && this.field823 != null) {
            if (client.field963 >= this.field819) {
                this.field823 = null;
            }
            if (client.field963 >= this.field818 && client.field963 < this.field819) {
                class133 var6 = this.field823;
                var6.method2321(this.field810 - this.field1182, this.field831 - this.field817, this.field821 - this.field1143);
                if (this.field1174 == 512) {
                    var6.method2309();
                    var6.method2309();
                    var6.method2309();
                } else if (this.field1174 == 1024) {
                    var6.method2309();
                    var6.method2309();
                } else if (this.field1174 == 1536) {
                    var6.method2309();
                }
                class133[] var7 = new class133[] { var3, var6 };
                var3 = new class133(var7, 2);
                if (this.field1174 == 512) {
                    var6.method2309();
                } else if (this.field1174 == 1024) {
                    var6.method2309();
                    var6.method2309();
                } else if (this.field1174 == 1536) {
                    var6.method2309();
                    var6.method2309();
                    var6.method2309();
                }
                var6.method2321(this.field1182 - this.field810, this.field817 - this.field831, this.field1143 - this.field821);
            }
        }
        var3.field1852 = true;
        return var3;
    }

    @ObfuscatedName("bj.k(IIBB)V")
    public final void method986(int arg0, int arg1, byte arg2) {
        if (this.field1155 != -1 && class272.method3881(this.field1155).field3686 == 1) {
            this.field1155 = -1;
        }
        this.field1151 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method983(arg0, arg1);
        } else if (this.field1178[0] >= 0 && this.field1178[0] < 104 && this.field1179[0] >= 0 && this.field1179[0] < 104) {
            if (arg2 == 2) {
                class74 var4 = this;
                int var5 = this.field1178[0];
                int var6 = this.field1179[0];
                int var7 = this.method982();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method982();
                    client.field1105.field2224 = arg0;
                    client.field1105.field2225 = arg1;
                    client.field1105.field2226 = 1;
                    client.field1105.field2228 = 1;
                    class73 var9 = client.field1105;
                    class73 var10 = var9;
                    class167 var11 = client.field1090[this.field822];
                    int[] var12 = client.field1106;
                    int[] var13 = client.field1107;
                    int var14 = 0;
                    label469: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class168.method1415(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                var16 = Statics.method1437(var5, var6, var9, var11);
                            } else {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class168.field2219[var19][var20] = 99;
                                class168.field2217[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class168.field2221[var23] = var5;
                                int var65 = var23 + 1;
                                class168.field2222[var23] = var6;
                                int[][] var25 = var11.field2197;
                                boolean var30;
                                label455: while (true) {
                                    label453: while (true) {
                                        int var26;
                                        int var27;
                                        int var28;
                                        int var29;
                                        int var31;
                                        do {
                                            do {
                                                do {
                                                    label430: do {
                                                        if (var65 == var24) {
                                                            Statics.field2218 = var17;
                                                            Statics.field2216 = var18;
                                                            var30 = false;
                                                            break label455;
                                                        }
                                                        var17 = class168.field2221[var24];
                                                        var18 = class168.field2222[var24];
                                                        var24 = var24 + 1 & 0xFFF;
                                                        var26 = var17 - var21;
                                                        var27 = var18 - var22;
                                                        var28 = var17 - var11.field2206;
                                                        var29 = var18 - var11.field2207;
                                                        if (var10.method976(var8, var17, var18, var11)) {
                                                            Statics.field2218 = var17;
                                                            Statics.field2216 = var18;
                                                            var30 = true;
                                                            break label455;
                                                        }
                                                        var31 = class168.field2217[var26][var27] + 1;
                                                        if (var26 > 0 && class168.field2219[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var8 + var29 - 1] & 0x1240138) == 0) {
                                                            int var32 = 1;
                                                            while (true) {
                                                                if (var32 >= var8 - 1) {
                                                                    class168.field2221[var65] = var17 - 1;
                                                                    class168.field2222[var65] = var18;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class168.field2219[var26 - 1][var27] = 2;
                                                                    class168.field2217[var26 - 1][var27] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var28 - 1][var29 + var32] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var32++;
                                                            }
                                                        }
                                                        if (var26 < 128 - var8 && class168.field2219[var26 + 1][var27] == 0 && (var25[var8 + var28][var29] & 0x1240183) == 0 && (var25[var8 + var28][var8 + var29 - 1] & 0x12401E0) == 0) {
                                                            int var33 = 1;
                                                            while (true) {
                                                                if (var33 >= var8 - 1) {
                                                                    class168.field2221[var65] = var17 + 1;
                                                                    class168.field2222[var65] = var18;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class168.field2219[var26 + 1][var27] = 8;
                                                                    class168.field2217[var26 + 1][var27] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var8 + var28][var29 + var33] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var33++;
                                                            }
                                                        }
                                                        if (var27 > 0 && class168.field2219[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var8 + var28 - 1][var29 - 1] & 0x1240183) == 0) {
                                                            int var34 = 1;
                                                            while (true) {
                                                                if (var34 >= var8 - 1) {
                                                                    class168.field2221[var65] = var17;
                                                                    class168.field2222[var65] = var18 - 1;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class168.field2219[var26][var27 - 1] = 1;
                                                                    class168.field2217[var26][var27 - 1] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var28 + var34][var29 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var34++;
                                                            }
                                                        }
                                                        if (var27 < 128 - var8 && class168.field2219[var26][var27 + 1] == 0 && (var25[var28][var8 + var29] & 0x1240138) == 0 && (var25[var8 + var28 - 1][var8 + var29] & 0x12401E0) == 0) {
                                                            int var35 = 1;
                                                            while (true) {
                                                                if (var35 >= var8 - 1) {
                                                                    class168.field2221[var65] = var17;
                                                                    class168.field2222[var65] = var18 + 1;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class168.field2219[var26][var27 + 1] = 4;
                                                                    class168.field2217[var26][var27 + 1] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var28 + var35][var8 + var29] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var35++;
                                                            }
                                                        }
                                                        if (var26 > 0 && var27 > 0 && class168.field2219[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0) {
                                                            int var36 = 1;
                                                            while (true) {
                                                                if (var36 >= var8) {
                                                                    class168.field2221[var65] = var17 - 1;
                                                                    class168.field2222[var65] = var18 - 1;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class168.field2219[var26 - 1][var27 - 1] = 3;
                                                                    class168.field2217[var26 - 1][var27 - 1] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var28 - 1][var29 - 1 + var36] & 0x124013E) != 0 || (var25[var28 - 1 + var36][var29 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var36++;
                                                            }
                                                        }
                                                        if (var26 < 128 - var8 && var27 > 0 && class168.field2219[var26 + 1][var27 - 1] == 0 && (var25[var8 + var28][var29 - 1] & 0x1240183) == 0) {
                                                            int var37 = 1;
                                                            while (true) {
                                                                if (var37 >= var8) {
                                                                    class168.field2221[var65] = var17 + 1;
                                                                    class168.field2222[var65] = var18 - 1;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class168.field2219[var26 + 1][var27 - 1] = 9;
                                                                    class168.field2217[var26 + 1][var27 - 1] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var8 + var28][var29 - 1 + var37] & 0x12401E3) != 0 || (var25[var28 + var37][var29 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var37++;
                                                            }
                                                        }
                                                        if (var26 > 0 && var27 < 128 - var8 && class168.field2219[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var8 + var29] & 0x1240138) == 0) {
                                                            for (int var38 = 1; var38 < var8; var38++) {
                                                                if ((var25[var28 - 1][var29 + var38] & 0x124013E) != 0 || (var25[var28 - 1 + var38][var8 + var29] & 0x12401F8) != 0) {
                                                                    continue label430;
                                                                }
                                                            }
                                                            class168.field2221[var65] = var17 - 1;
                                                            class168.field2222[var65] = var18 + 1;
                                                            var65 = var65 + 1 & 0xFFF;
                                                            class168.field2219[var26 - 1][var27 + 1] = 6;
                                                            class168.field2217[var26 - 1][var27 + 1] = var31;
                                                        }
                                                    } while (var26 >= 128 - var8);
                                                } while (var27 >= 128 - var8);
                                            } while (class168.field2219[var26 + 1][var27 + 1] != 0);
                                        } while ((var25[var8 + var28][var8 + var29] & 0x12401E0) != 0);
                                        for (int var39 = 1; var39 < var8; var39++) {
                                            if ((var25[var28 + var39][var8 + var29] & 0x12401F8) != 0 || (var25[var8 + var28][var29 + var39] & 0x12401E3) != 0) {
                                                continue label453;
                                            }
                                        }
                                        class168.field2221[var65] = var17 + 1;
                                        class168.field2222[var65] = var18 + 1;
                                        var65 = var65 + 1 & 0xFFF;
                                        class168.field2219[var26 + 1][var27 + 1] = 12;
                                        class168.field2217[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var16 = var30;
                            }
                            int var58;
                            label508: {
                                int var40 = var5 - 64;
                                int var41 = var6 - 64;
                                int var42 = Statics.field2218;
                                int var43 = Statics.field2216;
                                if (!var16) {
                                    int var44 = Integer.MAX_VALUE;
                                    int var45 = Integer.MAX_VALUE;
                                    byte var46 = 10;
                                    int var47 = var10.field2224;
                                    int var48 = var10.field2225;
                                    int var49 = var10.field2226;
                                    int var50 = var10.field2228;
                                    for (int var51 = var47 - var46; var51 <= var46 + var47; var51++) {
                                        for (int var52 = var48 - var46; var52 <= var46 + var48; var52++) {
                                            int var53 = var51 - var40;
                                            int var54 = var52 - var41;
                                            if (var53 >= 0 && var54 >= 0 && var53 < 128 && var54 < 128 && class168.field2217[var53][var54] < 100) {
                                                int var55 = 0;
                                                if (var51 < var47) {
                                                    var55 = var47 - var51;
                                                } else if (var51 > var47 + var49 - 1) {
                                                    var55 = var51 - (var47 + var49 - 1);
                                                }
                                                int var56 = 0;
                                                if (var52 < var48) {
                                                    var56 = var48 - var52;
                                                } else if (var52 > var48 + var50 - 1) {
                                                    var56 = var52 - (var48 + var50 - 1);
                                                }
                                                int var57 = var55 * var55 + var56 * var56;
                                                if (var57 < var44 || var44 == var57 && class168.field2217[var53][var54] < var45) {
                                                    var44 = var57;
                                                    var45 = class168.field2217[var53][var54];
                                                    var42 = var51;
                                                    var43 = var52;
                                                }
                                            }
                                        }
                                    }
                                    if (var44 == Integer.MAX_VALUE) {
                                        var58 = -1;
                                        break label508;
                                    }
                                }
                                if (var5 == var42 && var6 == var43) {
                                    var58 = 0;
                                } else {
                                    byte var59 = 0;
                                    class168.field2221[var59] = var42;
                                    int var66 = var59 + 1;
                                    class168.field2222[var59] = var43;
                                    int var60;
                                    int var61 = var60 = class168.field2219[var42 - var40][var43 - var41];
                                    while (var5 != var42 || var6 != var43) {
                                        if (var60 != var61) {
                                            var60 = var61;
                                            class168.field2221[var66] = var42;
                                            class168.field2222[var66++] = var43;
                                        }
                                        if ((var61 & 0x2) != 0) {
                                            var42++;
                                        } else if ((var61 & 0x8) != 0) {
                                            var42--;
                                        }
                                        if ((var61 & 0x1) != 0) {
                                            var43++;
                                        } else if ((var61 & 0x4) != 0) {
                                            var43--;
                                        }
                                        var61 = class168.field2219[var42 - var40][var43 - var41];
                                    }
                                    int var62 = 0;
                                    while (var66-- > 0) {
                                        var12[var62] = class168.field2221[var66];
                                        var13[var62++] = class168.field2222[var66];
                                        if (var62 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var58 = var62;
                                }
                            }
                            int var63 = var58;
                            if (var58 < 1) {
                                break;
                            }
                            int var64 = 0;
                            while (true) {
                                if (var64 >= var63 - 1) {
                                    break label469;
                                }
                                var4.method984(client.field1106[var64], client.field1107[var64], (byte) 2);
                                var64++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class168.field2219[var14][var15] = 0;
                            class168.field2217[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method984(arg0, arg1, arg2);
        } else {
            this.method983(arg0, arg1);
        }
    }

    @ObfuscatedName("bj.u(IIS)V")
    public void method983(int arg0, int arg1) {
        this.field1136 = 0;
        this.field1156 = 0;
        this.field1181 = 0;
        this.field1178[0] = arg0;
        this.field1179[0] = arg1;
        int var3 = this.method982();
        this.field1182 = this.field1178[0] * 128 + var3 * 64;
        this.field1143 = this.field1179[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bj.z(IIBB)V")
    public final void method984(int arg0, int arg1, byte arg2) {
        if (this.field1136 < 9) {
            this.field1136++;
        }
        for (int var4 = this.field1136; var4 > 0; var4--) {
            this.field1178[var4] = this.field1178[var4 - 1];
            this.field1179[var4] = this.field1179[var4 - 1];
            this.field1168[var4] = this.field1168[var4 - 1];
        }
        this.field1178[0] = arg0;
        this.field1179[0] = arg1;
        this.field1168[0] = arg2;
    }

    @ObfuscatedName("bj.t(I)Z")
    public final boolean method985() {
        return this.field827 != null;
    }
}
