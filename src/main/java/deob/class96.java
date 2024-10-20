package deob;

@ObfuscatedName("cp")
public class class96 {

    @ObfuscatedName("cp.m")
    public static byte[] field1245 = new byte[2048];

    @ObfuscatedName("cp.k")
    public static byte[] field1246 = new byte[2048];

    @ObfuscatedName("cp.o")
    public static class400[] field1247 = new class400[2048];

    @ObfuscatedName("cp.g")
    public static int field1257 = 0;

    @ObfuscatedName("cp.z")
    public static int[] field1249 = new int[2048];

    @ObfuscatedName("cp.a")
    public static int field1253 = 0;

    @ObfuscatedName("cp.u")
    public static int[] field1251 = new int[2048];

    @ObfuscatedName("cp.e")
    public static int[] field1252 = new int[2048];

    @ObfuscatedName("cp.l")
    public static int[] field1244 = new int[2048];

    @ObfuscatedName("cp.y")
    public static int[] field1254 = new int[2048];

    @ObfuscatedName("cp.v")
    public static int field1255 = 0;

    @ObfuscatedName("cp.f")
    public static int[] field1248 = new int[2048];

    @ObfuscatedName("cp.s")
    public static class400 field1256 = new class400(new byte[5000]);

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lm.n(Loq;I)V")
    public static final void method5290(class399 arg0) {
        arg0.method6168();
        int var1 = client.field606;
        class83 var2 = Statics.field1485 = client.field605[var1] = new class83();
        var2.field1071 = var1;
        int var3 = arg0.method6184(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1126[0] = var5 - Statics.field1942;
        var2.field1119 = (var2.field1126[0] << 7) + (var2.method2004() << 6);
        var2.field1150[0] = var6 - Statics.field3866;
        var2.field1096 = (var2.field1150[0] << 7) + (var2.method2004() << 6);
        Statics.field4237 = var2.field1067 = var4;
        if (field1247[var1] != null) {
            var2.method1986(field1247[var1]);
        }
        field1257 = 0;
        field1249[++field1257 - 1] = var1;
        field1245[var1] = 0;
        field1253 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6184(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1252[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1244[var7] = 0;
                field1254[var7] = -1;
                field1251[++field1253 - 1] = var7;
                field1245[var7] = 0;
            }
        }
        arg0.method6170();
    }

    @ObfuscatedName("ey.c(Loq;II)V")
    public static final void method2563(class399 arg0, int arg1) {
        int var2 = arg0.field4272;
        field1255 = 0;
        int var3 = 0;
        arg0.method6168();
        for (int var4 = 0; var4 < field1257; var4++) {
            int var5 = field1249[var4];
            if ((field1245[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var5] = (byte) (field1245[var5] | 0x2);
                } else {
                    int var6 = arg0.method6184(1);
                    if (var6 == 0) {
                        var3 = method1010(arg0);
                        field1245[var5] = (byte) (field1245[var5] | 0x2);
                    } else {
                        method4806(arg0, var5);
                    }
                }
            }
        }
        arg0.method6170();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6168();
        for (int var7 = 0; var7 < field1257; var7++) {
            int var8 = field1249[var7];
            if ((field1245[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var8] = (byte) (field1245[var8] | 0x2);
                } else {
                    int var9 = arg0.method6184(1);
                    if (var9 == 0) {
                        var3 = method1010(arg0);
                        field1245[var8] = (byte) (field1245[var8] | 0x2);
                    } else {
                        method4806(arg0, var8);
                    }
                }
            }
        }
        arg0.method6170();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6168();
        for (int var10 = 0; var10 < field1253; var10++) {
            int var11 = field1251[var10];
            if ((field1245[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var11] = (byte) (field1245[var11] | 0x2);
                } else {
                    int var12 = arg0.method6184(1);
                    if (var12 == 0) {
                        var3 = method1010(arg0);
                        field1245[var11] = (byte) (field1245[var11] | 0x2);
                    } else if (method4435(arg0, var11)) {
                        field1245[var11] = (byte) (field1245[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method6170();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6168();
        for (int var13 = 0; var13 < field1253; var13++) {
            int var14 = field1251[var13];
            if ((field1245[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1245[var14] = (byte) (field1245[var14] | 0x2);
                } else {
                    int var15 = arg0.method6184(1);
                    if (var15 == 0) {
                        var3 = method1010(arg0);
                        field1245[var14] = (byte) (field1245[var14] | 0x2);
                    } else if (method4435(arg0, var14)) {
                        field1245[var14] = (byte) (field1245[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method6170();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1257 = 0;
        field1253 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1245[var16] = (byte) (field1245[var16] >> 1);
            class83 var17 = client.field605[var16];
            if (var17 == null) {
                field1251[++field1253 - 1] = var16;
            } else {
                field1249[++field1257 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1255; var18++) {
            int var19 = field1248[var18];
            class83 var20 = client.field605[var19];
            int var21 = arg0.method6217();
            if ((var21 & 0x4) != 0) {
                var21 += arg0.method6217() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x200) != 0) {
                var22 = arg0.method6303();
            }
            if ((var21 & 0x100) != 0) {
                var20.field1136 = arg0.method6301();
                var20.field1142 = arg0.method6301();
                var20.field1122 = arg0.method6250();
                var20.field1111 = arg0.method6301();
                var20.field1140 = arg0.method6342() + client.field744;
                var20.field1141 = arg0.method6219() + client.field744;
                var20.field1102 = arg0.method6219();
                if (var20.field1075) {
                    var20.field1136 += var20.field1076;
                    var20.field1142 += var20.field1048;
                    var20.field1122 += var20.field1076;
                    var20.field1111 += var20.field1048;
                    var20.field1148 = 0;
                } else {
                    var20.field1136 += var20.field1126[0];
                    var20.field1142 += var20.field1150[0];
                    var20.field1122 += var20.field1126[0];
                    var20.field1111 += var20.field1150[0];
                    var20.field1148 = 1;
                }
                var20.field1153 = 0;
            }
            if ((var21 & 0x2000) != 0) {
                field1246[var19] = arg0.method6301();
            }
            if ((var21 & 0x10) != 0) {
                int var23 = arg0.method6342();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = arg0.method6246();
                client.method2232(var20, var23, var24);
            }
            if ((var21 & 0x20) != 0) {
                var20.field1107 = arg0.method6226();
                if (var20.field1107.charAt(0) == '~') {
                    var20.field1107 = var20.field1107.substring(1);
                    class98.method1908(2, var20.field1070.method6800(), var20.field1107);
                } else if (Statics.field1485 == var20) {
                    class98.method1908(2, var20.field1070.method6800(), var20.field1107);
                }
                var20.field1108 = false;
                var20.field1137 = 0;
                var20.field1133 = 0;
                var20.field1110 = 150;
            }
            if ((var21 & 0x8) != 0) {
                var20.field1120 = arg0.method6342();
                if (var20.field1120 == 65535) {
                    var20.field1120 = -1;
                }
            }
            if ((var21 & 0x40) != 0) {
                int var25 = arg0.method6342();
                class285 var26 = (class285) class304.method4518(class285.method2842(), arg0.method6246());
                boolean var27 = arg0.method6217() == 1;
                int var28 = arg0.method6251();
                int var29 = arg0.field4272;
                if (var20.field1070 != null && var20.field1064 != null) {
                    boolean var30 = false;
                    if (var26.field3665 && Statics.field100.method1571(var20.field1070)) {
                        var30 = true;
                    }
                    if (!var30 && client.field603 == 0 && !var20.field1069) {
                        field1256.field4272 = 0;
                        arg0.method6412(field1256.field4271, 0, var28);
                        field1256.field4272 = 0;
                        String var31 = class316.method5207(class319.method2351(class265.method3683(field1256)));
                        var20.field1107 = var31.trim();
                        var20.field1137 = var25 >> 8;
                        var20.field1133 = var25 & 0xFF;
                        var20.field1110 = 150;
                        var20.field1108 = var27;
                        var20.field1109 = Statics.field1485 != var20 && var26.field3665 && client.field648 != "" && var31.toLowerCase().indexOf(client.field648) == -1;
                        int var32;
                        if (var26.field3667) {
                            var32 = var27 ? 91 : 1;
                        } else {
                            var32 = var27 ? 90 : 2;
                        }
                        if (var26.field3666 == -1) {
                            class98.method1908(var32, var20.field1070.method6800(), var31);
                        } else {
                            class98.method1908(var32, class92.method1049(var26.field3666) + var20.field1070.method6800(), var31);
                        }
                    }
                }
                arg0.field4272 = var28 + var29;
            }
            if ((var21 & 0x800) != 0) {
                var20.field1131 = arg0.method6255();
                int var33 = arg0.method6222();
                var20.field1135 = var33 >> 16;
                var20.field1134 = (var33 & 0xFFFF) + client.field744;
                var20.field1132 = 0;
                var20.field1125 = 0;
                if (var20.field1134 > client.field744) {
                    var20.field1132 = -1;
                }
                if (var20.field1131 == 65535) {
                    var20.field1131 = -1;
                }
            }
            if ((var21 & 0x2) != 0) {
                int var34 = arg0.method6217();
                byte[] var35 = new byte[var34];
                class400 var36 = new class400(var35);
                arg0.method6412(var35, 0, var34);
                field1247[var19] = var36;
                var20.method1986(var36);
            }
            if ((var21 & 0x80) != 0) {
                var20.field1097 = arg0.method6255();
                if (var20.field1148 == 0) {
                    var20.field1145 = var20.field1097;
                    var20.field1097 = -1;
                }
            }
            if ((var21 & 0x1) != 0) {
                int var37 = arg0.method6246();
                if (var37 > 0) {
                    for (int var38 = 0; var38 < var37; var38++) {
                        int var39 = -1;
                        int var40 = -1;
                        int var41 = -1;
                        int var42 = arg0.method6231();
                        if (var42 == 32767) {
                            var42 = arg0.method6231();
                            var40 = arg0.method6231();
                            var39 = arg0.method6231();
                            var41 = arg0.method6231();
                        } else if (var42 == 32766) {
                            var42 = -1;
                        } else {
                            var40 = arg0.method6231();
                        }
                        int var43 = arg0.method6231();
                        var20.method2017(var42, var40, var39, var41, client.field744, var43);
                    }
                }
                int var44 = arg0.method6217();
                if (var44 > 0) {
                    for (int var45 = 0; var45 < var44; var45++) {
                        int var46 = arg0.method6231();
                        int var47 = arg0.method6231();
                        if (var47 == 32767) {
                            var20.method2019(var46);
                        } else {
                            int var48 = arg0.method6231();
                            int var49 = arg0.method6246();
                            int var50 = var47 > 0 ? arg0.method6409() : var49;
                            var20.method2018(var46, client.field744, var47, var48, var49, var50);
                        }
                    }
                }
            }
            if ((var21 & 0x400) != 0) {
                for (int var51 = 0; var51 < 3; var51++) {
                    var20.field1060[var51] = arg0.method6226();
                }
            }
            if (var20.field1075) {
                if (var22 == 127) {
                    var20.method1967(var20.field1076, var20.field1048);
                } else {
                    byte var52;
                    if (var22 == -1) {
                        var52 = field1246[var19];
                    } else {
                        var52 = var22;
                    }
                    var20.method1966(var20.field1076, var20.field1048, var52);
                }
            }
        }
        if (arg0.field4272 - var2 != arg1) {
            throw new RuntimeException(arg0.field4272 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bp.m(Loq;I)I")
    public static int method1010(class399 arg0) {
        int var1 = arg0.method6184(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method6184(5);
        } else if (var1 == 2) {
            var2 = arg0.method6184(8);
        } else {
            var2 = arg0.method6184(11);
        }
        return var2;
    }

    @ObfuscatedName("ks.k(Loq;II)V")
    public static void method4806(class399 arg0, int arg1) {
        boolean var2 = arg0.method6184(1) == 1;
        if (var2) {
            field1248[++field1255 - 1] = arg1;
        }
        int var3 = arg0.method6184(2);
        class83 var4 = client.field605[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1075 = false;
            } else if (client.field606 == arg1) {
                throw new RuntimeException();
            } else {
                field1252[arg1] = (Statics.field3866 + var4.field1150[0] >> 13) + (Statics.field1942 + var4.field1126[0] >> 13 << 14) + (var4.field1067 << 28);
                if (var4.field1097 == -1) {
                    field1244[arg1] = var4.field1145;
                } else {
                    field1244[arg1] = var4.field1097;
                }
                field1254[arg1] = var4.field1120;
                client.field605[arg1] = null;
                if (arg0.method6184(1) != 0) {
                    method4435(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6184(3);
            int var6 = var4.field1126[0];
            int var7 = var4.field1150[0];
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
            if (client.field606 == arg1 && var4.field1119 < 1536 || var4.field1096 < 1536 || var4.field1119 >= 11776 || var4.field1096 >= 11776) {
                var4.method1967(var6, var7);
                var4.field1075 = false;
            } else if (var2) {
                var4.field1075 = true;
                var4.field1076 = var6;
                var4.field1048 = var7;
            } else {
                var4.field1075 = false;
                var4.method1966(var6, var7, field1246[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6184(4);
            int var9 = var4.field1126[0];
            int var10 = var4.field1150[0];
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
            if (client.field606 == arg1 && var4.field1119 < 1536 || var4.field1096 < 1536 || var4.field1119 >= 11776 || var4.field1096 >= 11776) {
                var4.method1967(var9, var10);
                var4.field1075 = false;
            } else if (var2) {
                var4.field1075 = true;
                var4.field1076 = var9;
                var4.field1048 = var10;
            } else {
                var4.field1075 = false;
                var4.method1966(var9, var10, field1246[arg1]);
            }
        } else {
            int var11 = arg0.method6184(1);
            if (var11 == 0) {
                int var12 = arg0.method6184(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1126[0] + var14;
                int var17 = var4.field1150[0] + var15;
                if (client.field606 == arg1 && var4.field1119 < 1536 || var4.field1096 < 1536 || var4.field1119 >= 11776 || var4.field1096 >= 11776) {
                    var4.method1967(var16, var17);
                    var4.field1075 = false;
                } else if (var2) {
                    var4.field1075 = true;
                    var4.field1076 = var16;
                    var4.field1048 = var17;
                } else {
                    var4.field1075 = false;
                    var4.method1966(var16, var17, field1246[arg1]);
                }
                var4.field1067 = (byte) (var4.field1067 + var13 & 0x3);
                if (client.field606 == arg1) {
                    Statics.field4237 = var4.field1067;
                }
            } else {
                int var18 = arg0.method6184(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1942 + var4.field1126[0] + var20 & 0x3FFF) - Statics.field1942;
                int var23 = (Statics.field3866 + var4.field1150[0] + var21 & 0x3FFF) - Statics.field3866;
                if (client.field606 == arg1 && var4.field1119 < 1536 || var4.field1096 < 1536 || var4.field1119 >= 11776 || var4.field1096 >= 11776) {
                    var4.method1967(var22, var23);
                    var4.field1075 = false;
                } else if (var2) {
                    var4.field1075 = true;
                    var4.field1076 = var22;
                    var4.field1048 = var23;
                } else {
                    var4.field1075 = false;
                    var4.method1966(var22, var23, field1246[arg1]);
                }
                var4.field1067 = (byte) (var4.field1067 + var19 & 0x3);
                if (client.field606 == arg1) {
                    Statics.field4237 = var4.field1067;
                }
            }
        }
    }

    @ObfuscatedName("id.o(Loq;II)Z")
    public static boolean method4435(class399 arg0, int arg1) {
        int var2 = arg0.method6184(2);
        if (var2 == 0) {
            if (arg0.method6184(1) != 0) {
                method4435(arg0, arg1);
            }
            int var3 = arg0.method6184(13);
            int var4 = arg0.method6184(13);
            boolean var5 = arg0.method6184(1) == 1;
            if (var5) {
                field1248[++field1255 - 1] = arg1;
            }
            if (client.field605[arg1] != null) {
                throw new RuntimeException();
            }
            class83 var6 = client.field605[arg1] = new class83();
            var6.field1071 = arg1;
            if (field1247[arg1] != null) {
                var6.method1986(field1247[arg1]);
            }
            var6.field1145 = field1244[arg1];
            var6.field1120 = field1254[arg1];
            int var7 = field1252[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1151[0] = field1246[arg1];
            var6.field1067 = (byte) var8;
            var6.method1967((var9 << 13) + var3 - Statics.field1942, (var10 << 13) + var4 - Statics.field3866);
            var6.field1075 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6184(2);
            int var12 = field1252[arg1];
            field1252[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6184(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1252[arg1];
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
            field1252[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6184(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1252[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1252[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
