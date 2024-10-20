package deob;

@ObfuscatedName("ck")
public class class97 {

    @ObfuscatedName("ck.f")
    public static byte[] field1291 = new byte[2048];

    @ObfuscatedName("ck.n")
    public static class194[] field1292 = new class194[2048];

    @ObfuscatedName("ck.k")
    public static class445[] field1293 = new class445[2048];

    @ObfuscatedName("ck.w")
    public static int field1305 = 0;

    @ObfuscatedName("ck.s")
    public static int[] field1290 = new int[2048];

    @ObfuscatedName("ck.q")
    public static int field1296 = 0;

    @ObfuscatedName("ck.m")
    public static int[] field1297 = new int[2048];

    @ObfuscatedName("ck.x")
    public static int[] field1298 = new int[2048];

    @ObfuscatedName("ck.j")
    public static int[] field1299 = new int[2048];

    @ObfuscatedName("ck.v")
    public static int[] field1294 = new int[2048];

    @ObfuscatedName("ck.h")
    public static int field1300 = 0;

    @ObfuscatedName("ck.t")
    public static int[] field1302 = new int[2048];

    @ObfuscatedName("ck.u")
    public static class445 field1303 = new class445(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gb.c(Lqf;B)V")
    public static final void method3657(class444 arg0) {
        arg0.method7145();
        int var1 = client.field621;
        class85 var2 = Statics.field890 = client.field620[var1] = new class85();
        var2.field1100 = var1;
        int var3 = arg0.method7146(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1199[0] = var5 - Statics.field1560;
        var2.field1185 = (var2.field1199[0] << 7) + (var2.method2187() << 6);
        var2.field1201[0] = var6 - Statics.field2784;
        var2.field1129 = (var2.field1201[0] << 7) + (var2.method2187() << 6);
        Statics.field1013 = var2.field1106 = var4;
        if (field1293[var1] != null) {
            var2.method2209(field1293[var1]);
        }
        field1305 = 0;
        field1290[++field1305 - 1] = var1;
        field1291[var1] = 0;
        field1296 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method7146(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1298[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1299[var7] = 0;
                field1294[var7] = -1;
                field1297[++field1296 - 1] = var7;
                field1291[var7] = 0;
            }
        }
        arg0.method7147();
    }

    @ObfuscatedName("ba.p(Lqf;II)V")
    public static final void method2017(class444 arg0, int arg1) {
        int var2 = arg0.field4735;
        field1300 = 0;
        int var3 = 0;
        arg0.method7145();
        for (int var4 = 0; var4 < field1305; var4++) {
            int var5 = field1290[var4];
            if ((field1291[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1291[var5] = (byte) (field1291[var5] | 0x2);
                } else {
                    int var6 = arg0.method7146(1);
                    if (var6 == 0) {
                        var3 = method4087(arg0);
                        field1291[var5] = (byte) (field1291[var5] | 0x2);
                    } else {
                        method4797(arg0, var5);
                    }
                }
            }
        }
        arg0.method7147();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method7145();
        for (int var7 = 0; var7 < field1305; var7++) {
            int var8 = field1290[var7];
            if ((field1291[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1291[var8] = (byte) (field1291[var8] | 0x2);
                } else {
                    int var9 = arg0.method7146(1);
                    if (var9 == 0) {
                        var3 = method4087(arg0);
                        field1291[var8] = (byte) (field1291[var8] | 0x2);
                    } else {
                        method4797(arg0, var8);
                    }
                }
            }
        }
        arg0.method7147();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method7145();
        for (int var10 = 0; var10 < field1296; var10++) {
            int var11 = field1297[var10];
            if ((field1291[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1291[var11] = (byte) (field1291[var11] | 0x2);
                } else {
                    int var12 = arg0.method7146(1);
                    if (var12 == 0) {
                        var3 = method4087(arg0);
                        field1291[var11] = (byte) (field1291[var11] | 0x2);
                    } else if (method2878(arg0, var11)) {
                        field1291[var11] = (byte) (field1291[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method7147();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method7145();
        for (int var13 = 0; var13 < field1296; var13++) {
            int var14 = field1297[var13];
            if ((field1291[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1291[var14] = (byte) (field1291[var14] | 0x2);
                } else {
                    int var15 = arg0.method7146(1);
                    if (var15 == 0) {
                        var3 = method4087(arg0);
                        field1291[var14] = (byte) (field1291[var14] | 0x2);
                    } else if (method2878(arg0, var14)) {
                        field1291[var14] = (byte) (field1291[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method7147();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1305 = 0;
        field1296 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1291[var16] = (byte) (field1291[var16] >> 1);
            class85 var17 = client.field620[var16];
            if (var17 == null) {
                field1297[++field1296 - 1] = var16;
            } else {
                field1290[++field1305 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1300; var18++) {
            int var19 = field1302[var18];
            class85 var20 = client.field620[var19];
            int var21 = arg0.method7196();
            if ((var21 & 0x80) != 0) {
                var21 += arg0.method7196() << 8;
            }
            byte var22 = class194.field2249.field2246;
            if ((var21 & 0x8) != 0) {
                var20.field1149 = arg0.method7206();
                if (var20.field1149.charAt(0) == '~') {
                    var20.field1149 = var20.field1149.substring(1);
                    class100.method1932(2, var20.field1109.method7774(), var20.field1149);
                } else if (Statics.field890 == var20) {
                    class100.method1932(2, var20.field1109.method7774(), var20.field1149);
                }
                var20.field1150 = false;
                var20.field1153 = 0;
                var20.field1154 = 0;
                var20.field1152 = 150;
            }
            if ((var21 & 0x400) != 0) {
                var22 = arg0.method7197();
            }
            if ((var21 & 0x1) != 0) {
                int var23 = arg0.method7237();
                class312 var24 = (class312) class331.method5118(class312.method7090(), arg0.method7228());
                boolean var25 = arg0.method7228() == 1;
                int var26 = arg0.method7196();
                int var27 = arg0.field4735;
                if (var20.field1109 != null && var20.field1086 != null) {
                    boolean var28 = false;
                    if (var24.field3998 && Statics.field3345.method1711(var20.field1109)) {
                        var28 = true;
                    }
                    if (!var28 && client.field618 == 0 && !var20.field1105) {
                        field1303.field4735 = 0;
                        arg0.method7209(field1303.field4733, 0, var26);
                        field1303.field4735 = 0;
                        String var29 = class352.method5951(class345.method2821(class284.method4099(field1303)));
                        var20.field1149 = var29.trim();
                        var20.field1153 = var23 >> 8;
                        var20.field1154 = var23 & 0xFF;
                        var20.field1152 = 150;
                        var20.field1150 = var25;
                        var20.field1151 = Statics.field890 != var20 && var24.field3998 && client.field753 != "" && var29.toLowerCase().indexOf(client.field753) == -1;
                        int var30;
                        if (var24.field4003) {
                            var30 = var25 ? 91 : 1;
                        } else {
                            var30 = var25 ? 90 : 2;
                        }
                        if (var24.field4002 == -1) {
                            class100.method1932(var30, var20.field1109.method7774(), var29);
                        } else {
                            class100.method1932(var30, class93.method2016(var24.field4002) + var20.field1109.method7774(), var29);
                        }
                    }
                }
                arg0.field4735 = var26 + var27;
            }
            if ((var21 & 0x20) != 0) {
                int var31 = arg0.method7196();
                if (var31 > 0) {
                    for (int var32 = 0; var32 < var31; var32++) {
                        int var33 = -1;
                        int var34 = -1;
                        int var35 = -1;
                        int var36 = arg0.method7211();
                        if (var36 == 32767) {
                            var36 = arg0.method7211();
                            var34 = arg0.method7211();
                            var33 = arg0.method7211();
                            var35 = arg0.method7211();
                        } else if (var36 == 32766) {
                            var36 = -1;
                        } else {
                            var34 = arg0.method7211();
                        }
                        int var37 = arg0.method7211();
                        var20.method2230(var36, var34, var33, var35, client.field504, var37);
                    }
                }
                int var38 = arg0.method7196();
                if (var38 > 0) {
                    for (int var39 = 0; var39 < var38; var39++) {
                        int var40 = arg0.method7211();
                        int var41 = arg0.method7211();
                        if (var41 == 32767) {
                            var20.method2229(var40);
                        } else {
                            int var42 = arg0.method7211();
                            int var43 = arg0.method7296();
                            int var44 = var41 > 0 ? arg0.method7227() : var43;
                            var20.method2228(var40, client.field504, var41, var42, var43, var44);
                        }
                    }
                }
            }
            if ((var21 & 0x200) != 0) {
                class194[] var45 = field1292;
                class194[] var47 = new class194[] { class194.field2248, class194.field2249, class194.field2247, class194.field2245 };
                var45[var19] = (class194) class331.method5118(var47, arg0.method7197());
            }
            if ((var21 & 0x10) != 0) {
                var20.field1164 = arg0.method7416();
                if (var20.field1198 == 0) {
                    var20.field1157 = var20.field1164;
                    var20.field1164 = -1;
                }
            }
            if ((var21 & 0x4000) != 0) {
                var20.field1193 = arg0.method7248();
                var20.field1182 = arg0.method7197();
                var20.field1181 = arg0.method7197();
                var20.field1141 = arg0.method7197();
                var20.field1184 = arg0.method7238() + client.field504;
                var20.field1137 = arg0.method7198() + client.field504;
                var20.field1186 = arg0.method7238();
                if (var20.field1104) {
                    var20.field1193 += var20.field1112;
                    var20.field1182 += var20.field1113;
                    var20.field1181 += var20.field1112;
                    var20.field1141 += var20.field1113;
                    var20.field1198 = 0;
                } else {
                    var20.field1193 += var20.field1199[0];
                    var20.field1182 += var20.field1201[0];
                    var20.field1181 += var20.field1199[0];
                    var20.field1141 += var20.field1201[0];
                    var20.field1198 = 1;
                }
                var20.field1203 = 0;
            }
            if ((var21 & 0x2) != 0) {
                var20.field1179 = arg0.method7238();
                if (var20.field1179 == 65535) {
                    var20.field1179 = -1;
                }
            }
            if ((var21 & 0x800) != 0) {
                var20.field1189 = client.field504 + arg0.method7238();
                var20.field1159 = client.field504 + arg0.method7416();
                var20.field1191 = arg0.method7233();
                var20.field1192 = arg0.method7197();
                var20.field1170 = arg0.method7233();
                var20.field1195 = (byte) arg0.method7296();
            }
            if ((var21 & 0x4) != 0) {
                int var48 = arg0.method7296();
                byte[] var49 = new byte[var48];
                class445 var50 = new class445(var49);
                arg0.method7249(var49, 0, var48);
                field1293[var19] = var50;
                var20.method2209(var50);
            }
            if ((var21 & 0x100) != 0) {
                var20.field1175 = arg0.method7198();
                int var51 = arg0.method7408();
                var20.field1146 = var51 >> 16;
                var20.field1148 = (var51 & 0xFFFF) + client.field504;
                var20.field1139 = 0;
                var20.field1177 = 0;
                if (var20.field1148 > client.field504) {
                    var20.field1139 = -1;
                }
                if (var20.field1175 == 65535) {
                    var20.field1175 = -1;
                }
            }
            if ((var21 & 0x2000) != 0) {
                for (int var52 = 0; var52 < 3; var52++) {
                    var20.field1089[var52] = arg0.method7206();
                }
            }
            if ((var21 & 0x40) != 0) {
                int var53 = arg0.method7237();
                if (var53 == 65535) {
                    var53 = -1;
                }
                int var54 = arg0.method7228();
                client.method2785(var20, var53, var54);
            }
            if (var20.field1104) {
                if (var22 == 127) {
                    var20.method2180(var20.field1112, var20.field1113);
                } else {
                    class194 var56;
                    if (class194.field2249.field2246 == var22) {
                        var56 = field1292[var19];
                    } else {
                        class194[] var55 = new class194[] { class194.field2248, class194.field2249, class194.field2247, class194.field2245 };
                        var56 = (class194) class331.method5118(var55, var22);
                    }
                    var20.method2179(var20.field1112, var20.field1113, var56);
                }
            }
        }
        if (arg0.field4735 - var2 != arg1) {
            throw new RuntimeException(arg0.field4735 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("gg.f(Lqf;B)I")
    public static int method4087(class444 arg0) {
        int var1 = arg0.method7146(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method7146(5);
        } else if (var1 == 2) {
            var2 = arg0.method7146(8);
        } else {
            var2 = arg0.method7146(11);
        }
        return var2;
    }

    @ObfuscatedName("id.n(Lqf;II)V")
    public static void method4797(class444 arg0, int arg1) {
        boolean var2 = arg0.method7146(1) == 1;
        if (var2) {
            field1302[++field1300 - 1] = arg1;
        }
        int var3 = arg0.method7146(2);
        class85 var4 = client.field620[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1104 = false;
            } else if (client.field621 == arg1) {
                throw new RuntimeException();
            } else {
                field1298[arg1] = (Statics.field2784 + var4.field1201[0] >> 13) + (Statics.field1560 + var4.field1199[0] >> 13 << 14) + (var4.field1106 << 28);
                if (var4.field1164 == -1) {
                    field1299[arg1] = var4.field1157;
                } else {
                    field1299[arg1] = var4.field1164;
                }
                field1294[arg1] = var4.field1179;
                client.field620[arg1] = null;
                if (arg0.method7146(1) != 0) {
                    method2878(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method7146(3);
            int var6 = var4.field1199[0];
            int var7 = var4.field1201[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (client.field621 == arg1 && var4.field1185 < 1536 || var4.field1129 < 1536 || var4.field1185 >= 11776 || var4.field1129 >= 11776) {
                var4.method2180(var6, var7);
                var4.field1104 = false;
            } else if (var2) {
                var4.field1104 = true;
                var4.field1112 = var6;
                var4.field1113 = var7;
            } else {
                var4.field1104 = false;
                var4.method2179(var6, var7, field1292[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method7146(4);
            int var9 = var4.field1199[0];
            int var10 = var4.field1201[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (client.field621 == arg1 && var4.field1185 < 1536 || var4.field1129 < 1536 || var4.field1185 >= 11776 || var4.field1129 >= 11776) {
                var4.method2180(var9, var10);
                var4.field1104 = false;
            } else if (var2) {
                var4.field1104 = true;
                var4.field1112 = var9;
                var4.field1113 = var10;
            } else {
                var4.field1104 = false;
                var4.method2179(var9, var10, field1292[arg1]);
            }
        } else {
            int var11 = arg0.method7146(1);
            if (var11 == 0) {
                int var12 = arg0.method7146(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1199[0] + var14;
                int var17 = var4.field1201[0] + var15;
                if (client.field621 == arg1 && var4.field1185 < 1536 || var4.field1129 < 1536 || var4.field1185 >= 11776 || var4.field1129 >= 11776) {
                    var4.method2180(var16, var17);
                    var4.field1104 = false;
                } else if (var2) {
                    var4.field1104 = true;
                    var4.field1112 = var16;
                    var4.field1113 = var17;
                } else {
                    var4.field1104 = false;
                    var4.method2179(var16, var17, field1292[arg1]);
                }
                var4.field1106 = (byte) (var4.field1106 + var13 & 0x3);
                if (client.field621 == arg1) {
                    Statics.field1013 = var4.field1106;
                }
            } else {
                int var18 = arg0.method7146(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1560 + var4.field1199[0] + var20 & 0x3FFF) - Statics.field1560;
                int var23 = (Statics.field2784 + var4.field1201[0] + var21 & 0x3FFF) - Statics.field2784;
                if (client.field621 == arg1 && var4.field1185 < 1536 || var4.field1129 < 1536 || var4.field1185 >= 11776 || var4.field1129 >= 11776) {
                    var4.method2180(var22, var23);
                    var4.field1104 = false;
                } else if (var2) {
                    var4.field1104 = true;
                    var4.field1112 = var22;
                    var4.field1113 = var23;
                } else {
                    var4.field1104 = false;
                    var4.method2179(var22, var23, field1292[arg1]);
                }
                var4.field1106 = (byte) (var4.field1106 + var19 & 0x3);
                if (client.field621 == arg1) {
                    Statics.field1013 = var4.field1106;
                }
            }
        }
    }

    @ObfuscatedName("eg.k(Lqf;II)Z")
    public static boolean method2878(class444 arg0, int arg1) {
        int var2 = arg0.method7146(2);
        if (var2 == 0) {
            if (arg0.method7146(1) != 0) {
                method2878(arg0, arg1);
            }
            int var3 = arg0.method7146(13);
            int var4 = arg0.method7146(13);
            boolean var5 = arg0.method7146(1) == 1;
            if (var5) {
                field1302[++field1300 - 1] = arg1;
            }
            if (client.field620[arg1] != null) {
                throw new RuntimeException();
            }
            class85 var6 = client.field620[arg1] = new class85();
            var6.field1100 = arg1;
            if (field1293[arg1] != null) {
                var6.method2209(field1293[arg1]);
            }
            var6.field1157 = field1299[arg1];
            var6.field1179 = field1294[arg1];
            int var7 = field1298[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1143[0] = field1292[arg1];
            var6.field1106 = (byte) var8;
            var6.method2180((var9 << 13) + var3 - Statics.field1560, (var10 << 13) + var4 - Statics.field2784);
            var6.field1104 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method7146(2);
            int var12 = field1298[arg1];
            field1298[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method7146(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1298[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field1298[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method7146(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1298[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1298[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("gh.w(I)V")
    public static void method4091() {
        field1305 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1293[var0] = null;
            field1292[var0] = class194.field2247;
        }
    }
}
