package deob;

@ObfuscatedName("ca")
public class class97 {

    @ObfuscatedName("ca.q")
    public static byte[] field1312 = new byte[2048];

    @ObfuscatedName("ca.f")
    public static class193[] field1305 = new class193[2048];

    @ObfuscatedName("ca.j")
    public static class443[] field1308 = new class443[2048];

    @ObfuscatedName("ca.e")
    public static int field1309 = 0;

    @ObfuscatedName("ca.g")
    public static int[] field1310 = new int[2048];

    @ObfuscatedName("ca.w")
    public static int field1311 = 0;

    @ObfuscatedName("ca.y")
    public static int[] field1319 = new int[2048];

    @ObfuscatedName("ca.i")
    public static int[] field1313 = new int[2048];

    @ObfuscatedName("ca.s")
    public static int[] field1314 = new int[2048];

    @ObfuscatedName("ca.t")
    public static int[] field1315 = new int[2048];

    @ObfuscatedName("ca.z")
    public static int field1316 = 0;

    @ObfuscatedName("ca.r")
    public static int[] field1317 = new int[2048];

    @ObfuscatedName("ca.u")
    public static class443 field1318 = new class443(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nn.c(Lpq;I)V")
    public static final void method6093(class442 arg0) {
        arg0.method6991();
        int var1 = client.field611;
        class85 var2 = Statics.field1366 = client.field643[var1] = new class85();
        var2.field1112 = var1;
        int var3 = arg0.method6992(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1200[0] = var5 - Statics.field168;
        var2.field1137 = (var2.field1200[0] << 7) + (var2.method2029() << 6);
        var2.field1201[0] = var6 - Statics.field2674;
        var2.field1131 = (var2.field1201[0] << 7) + (var2.method2029() << 6);
        Statics.field1356 = var2.field1107 = var4;
        if (field1308[var1] != null) {
            var2.method2055(field1308[var1]);
        }
        field1309 = 0;
        field1310[++field1309 - 1] = var1;
        field1312[var1] = 0;
        field1311 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6992(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1313[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1314[var7] = 0;
                field1315[var7] = -1;
                field1319[++field1311 - 1] = var7;
                field1312[var7] = 0;
            }
        }
        arg0.method6993();
    }

    @ObfuscatedName("en.v(Lpq;IB)V")
    public static final void method2817(class442 arg0, int arg1) {
        int var2 = arg0.field4700;
        field1316 = 0;
        int var3 = 0;
        arg0.method6991();
        for (int var4 = 0; var4 < field1309; var4++) {
            int var5 = field1310[var4];
            if ((field1312[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1312[var5] = (byte) (field1312[var5] | 0x2);
                } else {
                    int var6 = arg0.method6992(1);
                    if (var6 == 0) {
                        int var7 = arg0.method6992(2);
                        int var8;
                        if (var7 == 0) {
                            var8 = 0;
                        } else if (var7 == 1) {
                            var8 = arg0.method6992(5);
                        } else if (var7 == 2) {
                            var8 = arg0.method6992(8);
                        } else {
                            var8 = arg0.method6992(11);
                        }
                        var3 = var8;
                        field1312[var5] = (byte) (field1312[var5] | 0x2);
                    } else {
                        method153(arg0, var5);
                    }
                }
            }
        }
        arg0.method6993();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6991();
        for (int var10 = 0; var10 < field1309; var10++) {
            int var11 = field1310[var10];
            if ((field1312[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1312[var11] = (byte) (field1312[var11] | 0x2);
                } else {
                    int var12 = arg0.method6992(1);
                    if (var12 == 0) {
                        int var13 = arg0.method6992(2);
                        int var14;
                        if (var13 == 0) {
                            var14 = 0;
                        } else if (var13 == 1) {
                            var14 = arg0.method6992(5);
                        } else if (var13 == 2) {
                            var14 = arg0.method6992(8);
                        } else {
                            var14 = arg0.method6992(11);
                        }
                        var3 = var14;
                        field1312[var11] = (byte) (field1312[var11] | 0x2);
                    } else {
                        method153(arg0, var11);
                    }
                }
            }
        }
        arg0.method6993();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6991();
        for (int var16 = 0; var16 < field1311; var16++) {
            int var17 = field1319[var16];
            if ((field1312[var17] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1312[var17] = (byte) (field1312[var17] | 0x2);
                } else {
                    int var18 = arg0.method6992(1);
                    if (var18 == 0) {
                        int var19 = arg0.method6992(2);
                        int var20;
                        if (var19 == 0) {
                            var20 = 0;
                        } else if (var19 == 1) {
                            var20 = arg0.method6992(5);
                        } else if (var19 == 2) {
                            var20 = arg0.method6992(8);
                        } else {
                            var20 = arg0.method6992(11);
                        }
                        var3 = var20;
                        field1312[var17] = (byte) (field1312[var17] | 0x2);
                    } else if (method4197(arg0, var17)) {
                        field1312[var17] = (byte) (field1312[var17] | 0x2);
                    }
                }
            }
        }
        arg0.method6993();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6991();
        for (int var22 = 0; var22 < field1311; var22++) {
            int var23 = field1319[var22];
            if ((field1312[var23] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1312[var23] = (byte) (field1312[var23] | 0x2);
                } else {
                    int var24 = arg0.method6992(1);
                    if (var24 == 0) {
                        int var25 = arg0.method6992(2);
                        int var26;
                        if (var25 == 0) {
                            var26 = 0;
                        } else if (var25 == 1) {
                            var26 = arg0.method6992(5);
                        } else if (var25 == 2) {
                            var26 = arg0.method6992(8);
                        } else {
                            var26 = arg0.method6992(11);
                        }
                        var3 = var26;
                        field1312[var23] = (byte) (field1312[var23] | 0x2);
                    } else if (method4197(arg0, var23)) {
                        field1312[var23] = (byte) (field1312[var23] | 0x2);
                    }
                }
            }
        }
        arg0.method6993();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1309 = 0;
        field1311 = 0;
        for (int var28 = 1; var28 < 2048; var28++) {
            field1312[var28] = (byte) (field1312[var28] >> 1);
            class85 var29 = client.field643[var28];
            if (var29 == null) {
                field1319[++field1311 - 1] = var28;
            } else {
                field1310[++field1309 - 1] = var28;
            }
        }
        for (int var30 = 0; var30 < field1316; var30++) {
            int var31 = field1317[var30];
            class85 var32 = client.field643[var31];
            int var33 = arg0.method7047();
            if ((var33 & 0x80) != 0) {
                var33 += arg0.method7047() << 8;
            }
            byte var34 = class193.field2209.field2211;
            if ((var33 & 0x800) != 0) {
                for (int var35 = 0; var35 < 3; var35++) {
                    var32.field1090[var35] = arg0.method7057();
                }
            }
            if ((var33 & 0x4) != 0) {
                int var36 = arg0.method7049();
                class310 var37 = (class310) class329.method2087(class310.method715(), arg0.method7080());
                boolean var38 = arg0.method7080() == 1;
                int var39 = arg0.method7047();
                int var40 = arg0.field4700;
                if (var32.field1114 != null && var32.field1087 != null) {
                    boolean var41 = false;
                    if (var37.field3965 && Statics.field1116.method1551(var32.field1114)) {
                        var41 = true;
                    }
                    if (!var41 && client.field608 == 0 && !var32.field1101) {
                        field1318.field4700 = 0;
                        arg0.method7142(field1318.field4701, 0, var39);
                        field1318.field4700 = 0;
                        String var42 = class350.method5804(class343.method5232(class282.method2722(field1318)));
                        var32.field1151 = var42.trim();
                        var32.field1155 = var36 >> 8;
                        var32.field1160 = var36 & 0xFF;
                        var32.field1154 = 150;
                        var32.field1152 = var38;
                        var32.field1153 = Statics.field1366 != var32 && var37.field3965 && client.field717 != "" && var42.toLowerCase().indexOf(client.field717) == -1;
                        int var43;
                        if (var37.field3964) {
                            var43 = var38 ? 91 : 1;
                        } else {
                            var43 = var38 ? 90 : 2;
                        }
                        if (var37.field3963 == -1) {
                            class99.method5035(var43, var32.field1114.method7617(), var42);
                        } else {
                            class99.method5035(var43, class93.method1971(var37.field3963) + var32.field1114.method7617(), var42);
                        }
                    }
                }
                arg0.field4700 = var39 + var40;
            }
            if ((var33 & 0x2000) != 0) {
                var32.field1175 = arg0.method7090();
                int var44 = arg0.method7052();
                var32.field1144 = var44 >> 16;
                var32.field1179 = (var44 & 0xFFFF) + client.field552;
                var32.field1177 = 0;
                var32.field1178 = 0;
                if (var32.field1179 > client.field552) {
                    var32.field1177 = -1;
                }
                if (var32.field1175 == 65535) {
                    var32.field1175 = -1;
                }
            }
            if ((var33 & 0x400) != 0) {
                var32.field1141 = arg0.method7266();
                var32.field1183 = arg0.method7048();
                var32.field1182 = arg0.method7266();
                var32.field1184 = arg0.method7082();
                var32.field1185 = arg0.method7088() + client.field552;
                var32.field1195 = arg0.method7090() + client.field552;
                var32.field1187 = arg0.method7049();
                if (var32.field1089) {
                    var32.field1141 += var32.field1113;
                    var32.field1183 += var32.field1103;
                    var32.field1182 += var32.field1113;
                    var32.field1184 += var32.field1103;
                    var32.field1199 = 0;
                } else {
                    var32.field1141 += var32.field1200[0];
                    var32.field1183 += var32.field1201[0];
                    var32.field1182 += var32.field1200[0];
                    var32.field1184 += var32.field1201[0];
                    var32.field1199 = 1;
                }
                var32.field1204 = 0;
            }
            if ((var33 & 0x8) != 0) {
                var32.field1166 = arg0.method7089();
                if (var32.field1199 == 0) {
                    var32.field1196 = var32.field1166;
                    var32.field1166 = -1;
                }
            }
            if ((var33 & 0x100) != 0) {
                class193[] var45 = field1305;
                class193[] var47 = new class193[] { class193.field2213, class193.field2209, class193.field2210, class193.field2212 };
                var45[var31] = (class193) class329.method2087(var47, arg0.method7266());
            }
            if ((var33 & 0x1) != 0) {
                var32.field1151 = arg0.method7057();
                if (var32.field1151.charAt(0) == '~') {
                    var32.field1151 = var32.field1151.substring(1);
                    class99.method5035(2, var32.field1114.method7617(), var32.field1151);
                } else if (Statics.field1366 == var32) {
                    class99.method5035(2, var32.field1114.method7617(), var32.field1151);
                }
                var32.field1152 = false;
                var32.field1155 = 0;
                var32.field1160 = 0;
                var32.field1154 = 150;
            }
            if ((var33 & 0x2) != 0) {
                int var48 = arg0.method7049();
                if (var48 == 65535) {
                    var48 = -1;
                }
                int var49 = arg0.method7080();
                client.method1789(var32, var48, var49);
            }
            if ((var33 & 0x20) != 0) {
                int var50 = arg0.method7081();
                if (var50 > 0) {
                    for (int var51 = 0; var51 < var50; var51++) {
                        int var52 = -1;
                        int var53 = -1;
                        int var54 = -1;
                        int var55 = arg0.method7062();
                        if (var55 == 32767) {
                            var55 = arg0.method7062();
                            var53 = arg0.method7062();
                            var52 = arg0.method7062();
                            var54 = arg0.method7062();
                        } else if (var55 == 32766) {
                            var55 = -1;
                        } else {
                            var53 = arg0.method7062();
                        }
                        int var56 = arg0.method7062();
                        var32.method2080(var55, var53, var52, var54, client.field552, var56);
                    }
                }
                int var57 = arg0.method7081();
                if (var57 > 0) {
                    for (int var58 = 0; var58 < var57; var58++) {
                        int var59 = arg0.method7062();
                        int var60 = arg0.method7062();
                        if (var60 == 32767) {
                            var32.method2082(var59);
                        } else {
                            int var61 = arg0.method7062();
                            int var62 = arg0.method7080();
                            int var63 = var60 > 0 ? arg0.method7080() : var62;
                            var32.method2081(var59, client.field552, var60, var61, var62, var63);
                        }
                    }
                }
            }
            if ((var33 & 0x40) != 0) {
                var32.field1139 = arg0.method7088();
                if (var32.field1139 == 65535) {
                    var32.field1139 = -1;
                }
            }
            if ((var33 & 0x200) != 0) {
                var32.field1190 = client.field552 + arg0.method7088();
                var32.field1136 = client.field552 + arg0.method7090();
                var32.field1192 = arg0.method7083();
                var32.field1193 = arg0.method7266();
                var32.field1194 = arg0.method7083();
                var32.field1134 = (byte) arg0.method7047();
            }
            if ((var33 & 0x4000) != 0) {
                var34 = arg0.method7266();
            }
            if ((var33 & 0x10) != 0) {
                int var64 = arg0.method7047();
                byte[] var65 = new byte[var64];
                class443 var66 = new class443(var65);
                arg0.method7142(var65, 0, var64);
                field1308[var31] = var66;
                var32.method2055(var66);
            }
            if (var32.field1089) {
                if (var34 == 127) {
                    var32.method2038(var32.field1113, var32.field1103);
                } else {
                    class193 var68;
                    if (class193.field2209.field2211 == var34) {
                        var68 = field1305[var31];
                    } else {
                        class193[] var67 = new class193[] { class193.field2213, class193.field2209, class193.field2210, class193.field2212 };
                        var68 = (class193) class329.method2087(var67, var34);
                    }
                    var32.method2037(var32.field1113, var32.field1103, var68);
                }
            }
        }
        if (arg0.field4700 - var2 != arg1) {
            throw new RuntimeException(arg0.field4700 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("u.q(Lpq;II)V")
    public static void method153(class442 arg0, int arg1) {
        boolean var2 = arg0.method6992(1) == 1;
        if (var2) {
            field1317[++field1316 - 1] = arg1;
        }
        int var3 = arg0.method6992(2);
        class85 var4 = client.field643[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1089 = false;
            } else if (client.field611 == arg1) {
                throw new RuntimeException();
            } else {
                field1313[arg1] = (Statics.field2674 + var4.field1201[0] >> 13) + (Statics.field168 + var4.field1200[0] >> 13 << 14) + (var4.field1107 << 28);
                if (var4.field1166 == -1) {
                    field1314[arg1] = var4.field1196;
                } else {
                    field1314[arg1] = var4.field1166;
                }
                field1315[arg1] = var4.field1139;
                client.field643[arg1] = null;
                if (arg0.method6992(1) != 0) {
                    method4197(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6992(3);
            int var6 = var4.field1200[0];
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
            if (client.field611 == arg1 && var4.field1137 < 1536 || var4.field1131 < 1536 || var4.field1137 >= 11776 || var4.field1131 >= 11776) {
                var4.method2038(var6, var7);
                var4.field1089 = false;
            } else if (var2) {
                var4.field1089 = true;
                var4.field1113 = var6;
                var4.field1103 = var7;
            } else {
                var4.field1089 = false;
                var4.method2037(var6, var7, field1305[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6992(4);
            int var9 = var4.field1200[0];
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
            if (client.field611 == arg1 && var4.field1137 < 1536 || var4.field1131 < 1536 || var4.field1137 >= 11776 || var4.field1131 >= 11776) {
                var4.method2038(var9, var10);
                var4.field1089 = false;
            } else if (var2) {
                var4.field1089 = true;
                var4.field1113 = var9;
                var4.field1103 = var10;
            } else {
                var4.field1089 = false;
                var4.method2037(var9, var10, field1305[arg1]);
            }
        } else {
            int var11 = arg0.method6992(1);
            if (var11 == 0) {
                int var12 = arg0.method6992(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1200[0] + var14;
                int var17 = var4.field1201[0] + var15;
                if (client.field611 == arg1 && var4.field1137 < 1536 || var4.field1131 < 1536 || var4.field1137 >= 11776 || var4.field1131 >= 11776) {
                    var4.method2038(var16, var17);
                    var4.field1089 = false;
                } else if (var2) {
                    var4.field1089 = true;
                    var4.field1113 = var16;
                    var4.field1103 = var17;
                } else {
                    var4.field1089 = false;
                    var4.method2037(var16, var17, field1305[arg1]);
                }
                var4.field1107 = (byte) (var4.field1107 + var13 & 0x3);
                if (client.field611 == arg1) {
                    Statics.field1356 = var4.field1107;
                }
            } else {
                int var18 = arg0.method6992(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field168 + var4.field1200[0] + var20 & 0x3FFF) - Statics.field168;
                int var23 = (Statics.field2674 + var4.field1201[0] + var21 & 0x3FFF) - Statics.field2674;
                if (client.field611 == arg1 && var4.field1137 < 1536 || var4.field1131 < 1536 || var4.field1137 >= 11776 || var4.field1131 >= 11776) {
                    var4.method2038(var22, var23);
                    var4.field1089 = false;
                } else if (var2) {
                    var4.field1089 = true;
                    var4.field1113 = var22;
                    var4.field1103 = var23;
                } else {
                    var4.field1089 = false;
                    var4.method2037(var22, var23, field1305[arg1]);
                }
                var4.field1107 = (byte) (var4.field1107 + var19 & 0x3);
                if (client.field611 == arg1) {
                    Statics.field1356 = var4.field1107;
                }
            }
        }
    }

    @ObfuscatedName("hx.f(Lpq;II)Z")
    public static boolean method4197(class442 arg0, int arg1) {
        int var2 = arg0.method6992(2);
        if (var2 == 0) {
            if (arg0.method6992(1) != 0) {
                method4197(arg0, arg1);
            }
            int var3 = arg0.method6992(13);
            int var4 = arg0.method6992(13);
            boolean var5 = arg0.method6992(1) == 1;
            if (var5) {
                field1317[++field1316 - 1] = arg1;
            }
            if (client.field643[arg1] != null) {
                throw new RuntimeException();
            }
            class85 var6 = client.field643[arg1] = new class85();
            var6.field1112 = arg1;
            if (field1308[arg1] != null) {
                var6.method2055(field1308[arg1]);
            }
            var6.field1196 = field1314[arg1];
            var6.field1139 = field1315[arg1];
            int var7 = field1313[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1202[0] = field1305[arg1];
            var6.field1107 = (byte) var8;
            var6.method2038((var9 << 13) + var3 - Statics.field168, (var10 << 13) + var4 - Statics.field2674);
            var6.field1089 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6992(2);
            int var12 = field1313[arg1];
            field1313[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6992(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1313[arg1];
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
            field1313[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6992(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1313[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1313[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("hd.j(I)V")
    public static void method4547() {
        field1309 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1308[var0] = null;
            field1305[var0] = class193.field2213;
        }
    }
}
