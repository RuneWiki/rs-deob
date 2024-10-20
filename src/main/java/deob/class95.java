package deob;

@ObfuscatedName("cz")
public class class95 {

    @ObfuscatedName("cz.k")
    public static byte[] field1413 = new byte[2048];

    @ObfuscatedName("cz.z")
    public static byte[] field1411 = new byte[2048];

    @ObfuscatedName("cz.v")
    public static class181[] field1408 = new class181[2048];

    @ObfuscatedName("cz.m")
    public static int field1414 = 0;

    @ObfuscatedName("cz.b")
    public static int[] field1424 = new int[2048];

    @ObfuscatedName("cz.t")
    public static int field1415 = 0;

    @ObfuscatedName("cz.p")
    public static int[] field1416 = new int[2048];

    @ObfuscatedName("cz.r")
    public static int[] field1417 = new int[2048];

    @ObfuscatedName("cz.l")
    public static int[] field1418 = new int[2048];

    @ObfuscatedName("cz.u")
    public static int[] field1419 = new int[2048];

    @ObfuscatedName("cz.n")
    public static int field1420 = 0;

    @ObfuscatedName("cz.c")
    public static int[] field1421 = new int[2048];

    @ObfuscatedName("cz.y")
    public static class181 field1422 = new class181(new byte[5000]);

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.d(Lgv;B)V")
    public static final void method1531(class187 arg0) {
        arg0.method3295();
        int var1 = client.field976;
        class74 var2 = Statics.field2501 = client.field1054[var1] = new class74();
        var2.field858 = var1;
        int var3 = arg0.method3296(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1187[0] = var5 - Statics.field3306;
        var2.field1149 = (var2.field1187[0] << 7) + (var2.method1058() << 6);
        var2.field1203[0] = var6 - Statics.field2066;
        var2.field1198 = (var2.field1203[0] << 7) + (var2.method1058() << 6);
        Statics.field3219 = var2.field854 = var4;
        if (field1408[var1] != null) {
            var2.method1059(field1408[var1]);
        }
        field1414 = 0;
        field1424[++field1414 - 1] = var1;
        field1413[var1] = 0;
        field1415 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3296(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1417[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1418[var7] = 0;
                field1419[var7] = -1;
                field1416[++field1415 - 1] = var7;
                field1413[var7] = 0;
            }
        }
        arg0.method3297();
    }

    @ObfuscatedName("ar.x(Lgv;IB)V")
    public static final void method565(class187 arg0, int arg1) {
        int var2 = arg0.field2498;
        field1420 = 0;
        int var3 = 0;
        arg0.method3295();
        for (int var4 = 0; var4 < field1414; var4++) {
            int var5 = field1424[var4];
            if ((field1413[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1413[var5] = (byte) (field1413[var5] | 0x2);
                } else {
                    int var6 = arg0.method3296(1);
                    if (var6 == 0) {
                        var3 = method135(arg0);
                        field1413[var5] = (byte) (field1413[var5] | 0x2);
                    } else {
                        method3798(arg0, var5);
                    }
                }
            }
        }
        arg0.method3297();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3295();
        for (int var7 = 0; var7 < field1414; var7++) {
            int var8 = field1424[var7];
            if ((field1413[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1413[var8] = (byte) (field1413[var8] | 0x2);
                } else {
                    int var9 = arg0.method3296(1);
                    if (var9 == 0) {
                        var3 = method135(arg0);
                        field1413[var8] = (byte) (field1413[var8] | 0x2);
                    } else {
                        method3798(arg0, var8);
                    }
                }
            }
        }
        arg0.method3297();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3295();
        for (int var10 = 0; var10 < field1415; var10++) {
            int var11 = field1416[var10];
            if ((field1413[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1413[var11] = (byte) (field1413[var11] | 0x2);
                } else {
                    int var12 = arg0.method3296(1);
                    if (var12 == 0) {
                        var3 = method135(arg0);
                        field1413[var11] = (byte) (field1413[var11] | 0x2);
                    } else if (method378(arg0, var11)) {
                        field1413[var11] = (byte) (field1413[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3297();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3295();
        for (int var13 = 0; var13 < field1415; var13++) {
            int var14 = field1416[var13];
            if ((field1413[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1413[var14] = (byte) (field1413[var14] | 0x2);
                } else {
                    int var15 = arg0.method3296(1);
                    if (var15 == 0) {
                        var3 = method135(arg0);
                        field1413[var14] = (byte) (field1413[var14] | 0x2);
                    } else if (method378(arg0, var14)) {
                        field1413[var14] = (byte) (field1413[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3297();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1414 = 0;
        field1415 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1413[var16] = (byte) (field1413[var16] >> 1);
            class74 var17 = client.field1054[var16];
            if (var17 == null) {
                field1416[++field1415 - 1] = var16;
            } else {
                field1424[++field1414 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1420; var18++) {
            int var19 = field1421[var18];
            class74 var20 = client.field1054[var19];
            int var21 = arg0.method3204();
            if ((var21 & 0x20) != 0) {
                var21 += arg0.method3204() << 8;
            }
            method564(arg0, var19, var20, var21);
        }
        if (arg0.field2498 - var2 != arg1) {
            throw new RuntimeException(arg0.field2498 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("s.k(Lgv;I)I")
    public static int method135(class187 arg0) {
        int var1 = arg0.method3296(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3296(5);
        } else if (var1 == 2) {
            var2 = arg0.method3296(8);
        } else {
            var2 = arg0.method3296(11);
        }
        return var2;
    }

    @ObfuscatedName("hp.z(Lgv;II)V")
    public static void method3798(class187 arg0, int arg1) {
        boolean var2 = arg0.method3296(1) == 1;
        if (var2) {
            field1421[++field1420 - 1] = arg1;
        }
        int var3 = arg0.method3296(2);
        class74 var4 = client.field1054[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field837 = false;
            } else if (client.field976 == arg1) {
                throw new RuntimeException();
            } else {
                field1417[arg1] = (Statics.field2066 + var4.field1203[0] >> 13) + (Statics.field3306 + var4.field1187[0] >> 13 << 14) + (var4.field854 << 28);
                if (var4.field1175 == -1) {
                    field1418[arg1] = var4.field1151;
                } else {
                    field1418[arg1] = var4.field1175;
                }
                field1419[arg1] = var4.field1173;
                client.field1054[arg1] = null;
                if (arg0.method3296(1) != 0) {
                    method378(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3296(3);
            int var6 = var4.field1187[0];
            int var7 = var4.field1203[0];
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
            if (client.field976 == arg1 && var4.field1149 < 1536 || var4.field1198 < 1536 || var4.field1149 >= 11776 || var4.field1198 >= 11776) {
                var4.method1063(var6, var7);
                var4.field837 = false;
            } else if (var2) {
                var4.field837 = true;
                var4.field860 = var6;
                var4.field861 = var7;
            } else {
                var4.field837 = false;
                var4.method1072(var6, var7, field1411[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3296(4);
            int var9 = var4.field1187[0];
            int var10 = var4.field1203[0];
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
            if (client.field976 == arg1 && var4.field1149 < 1536 || var4.field1198 < 1536 || var4.field1149 >= 11776 || var4.field1198 >= 11776) {
                var4.method1063(var9, var10);
                var4.field837 = false;
            } else if (var2) {
                var4.field837 = true;
                var4.field860 = var9;
                var4.field861 = var10;
            } else {
                var4.field837 = false;
                var4.method1072(var9, var10, field1411[arg1]);
            }
        } else {
            int var11 = arg0.method3296(1);
            if (var11 == 0) {
                int var12 = arg0.method3296(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1187[0] + var14;
                int var17 = var4.field1203[0] + var15;
                if (client.field976 == arg1 && var4.field1149 < 1536 || var4.field1198 < 1536 || var4.field1149 >= 11776 || var4.field1198 >= 11776) {
                    var4.method1063(var16, var17);
                    var4.field837 = false;
                } else if (var2) {
                    var4.field837 = true;
                    var4.field860 = var16;
                    var4.field861 = var17;
                } else {
                    var4.field837 = false;
                    var4.method1072(var16, var17, field1411[arg1]);
                }
                var4.field854 = (byte) (var4.field854 + var13 & 0x3);
                if (client.field976 == arg1) {
                    Statics.field3219 = var4.field854;
                }
            } else {
                int var18 = arg0.method3296(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field3306 + var4.field1187[0] + var20 & 0x3FFF) - Statics.field3306;
                int var23 = (Statics.field2066 + var4.field1203[0] + var21 & 0x3FFF) - Statics.field2066;
                if (client.field976 == arg1 && var4.field1149 < 1536 || var4.field1198 < 1536 || var4.field1149 >= 11776 || var4.field1198 >= 11776) {
                    var4.method1063(var22, var23);
                    var4.field837 = false;
                } else if (var2) {
                    var4.field837 = true;
                    var4.field860 = var22;
                    var4.field861 = var23;
                } else {
                    var4.field837 = false;
                    var4.method1072(var22, var23, field1411[arg1]);
                }
                var4.field854 = (byte) (var4.field854 + var19 & 0x3);
                if (client.field976 == arg1) {
                    Statics.field3219 = var4.field854;
                }
            }
        }
    }

    @ObfuscatedName("aj.v(Lgv;IB)Z")
    public static boolean method378(class187 arg0, int arg1) {
        int var2 = arg0.method3296(2);
        if (var2 == 0) {
            if (arg0.method3296(1) != 0) {
                method378(arg0, arg1);
            }
            int var3 = arg0.method3296(13);
            int var4 = arg0.method3296(13);
            boolean var5 = arg0.method3296(1) == 1;
            if (var5) {
                field1421[++field1420 - 1] = arg1;
            }
            if (client.field1054[arg1] != null) {
                throw new RuntimeException();
            }
            class74 var6 = client.field1054[arg1] = new class74();
            var6.field858 = arg1;
            if (field1408[arg1] != null) {
                var6.method1059(field1408[arg1]);
            }
            var6.field1151 = field1418[arg1];
            var6.field1173 = field1419[arg1];
            int var7 = field1417[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1204[0] = field1411[arg1];
            var6.field854 = (byte) var8;
            var6.method1063((var9 << 13) + var3 - Statics.field3306, (var10 << 13) + var4 - Statics.field2066);
            var6.field837 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3296(2);
            int var12 = field1417[arg1];
            field1417[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3296(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1417[arg1];
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
            field1417[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3296(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1417[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1417[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ar.m(Lgv;ILbw;II)V")
    public static final void method564(class187 arg0, int arg1, class74 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1000) != 0) {
            field1411[arg1] = arg0.method3069();
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1173 = arg0.method3073();
            if (arg2.field1173 == 65535) {
                arg2.field1173 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1201 = arg0.method3075();
            int var5 = arg0.method3019();
            arg2.field1188 = var5 >> 16;
            arg2.field1182 = (var5 & 0xFFFF) + client.field881;
            arg2.field1185 = 0;
            arg2.field1186 = 0;
            if (arg2.field1182 > client.field881) {
                arg2.field1185 = -1;
            }
            if (arg2.field1201 == 65535) {
                arg2.field1201 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var6 = arg0.method3179();
            class238 var7 = (class238) class176.method1702(class238.method994(), arg0.method3162());
            boolean var8 = arg0.method3197() == 1;
            int var9 = arg0.method3162();
            int var10 = arg0.field2498;
            if (arg2.field844 != null && arg2.field857 != null) {
                boolean var11 = false;
                if (var7.field3260 && client.method228(arg2.field844)) {
                    var11 = true;
                }
                if (!var11 && client.field909 == 0 && !arg2.field839) {
                    field1422.field2498 = 0;
                    arg0.method3129(field1422.field2496, 0, var9);
                    field1422.field2498 = 0;
                    String var12 = class272.method4638(class278.method227(class273.method1014(field1422)));
                    arg2.field1193 = var12.trim();
                    arg2.field1164 = var6 >> 8;
                    arg2.field1165 = var6 & 0xFF;
                    arg2.field1178 = 150;
                    arg2.field1161 = var8;
                    arg2.field1162 = Statics.field2501 != arg2 && var7.field3260 && client.field1073 != "" && var12.toLowerCase().indexOf(client.field1073) == -1;
                    int var13;
                    if (var7.field3258) {
                        var13 = var8 ? 91 : 1;
                    } else {
                        var13 = var8 ? 90 : 2;
                    }
                    if (var7.field3252 == -1) {
                        class97.method706(var13, arg2.field844, var12);
                    } else {
                        class97.method706(var13, class88.method1449(var7.field3252) + arg2.field844, var12);
                    }
                }
            }
            arg0.field2498 = var9 + var10;
        }
        if ((arg3 & 0x80) != 0) {
            int var14 = arg0.method3197();
            byte[] var15 = new byte[var14];
            class181 var16 = new class181(var15);
            arg0.method3085(var15, 0, var14);
            field1408[arg1] = var16;
            arg2.method1059(var16);
        }
        if ((arg3 & 0x4) != 0) {
            int var17 = arg0.method3162();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = -1;
                    int var20 = -1;
                    int var21 = -1;
                    int var22 = arg0.method3044();
                    if (var22 == 32767) {
                        var22 = arg0.method3044();
                        var20 = arg0.method3044();
                        var19 = arg0.method3044();
                        var21 = arg0.method3044();
                    } else if (var22 == 32766) {
                        var22 = -1;
                    } else {
                        var20 = arg0.method3044();
                    }
                    int var23 = arg0.method3044();
                    arg2.method1458(var22, var20, var19, var21, client.field881, var23);
                }
            }
            int var24 = arg0.method3120();
            if (var24 > 0) {
                for (int var25 = 0; var25 < var24; var25++) {
                    int var26 = arg0.method3044();
                    int var27 = arg0.method3044();
                    if (var27 == 32767) {
                        arg2.method1457(var26);
                    } else {
                        int var28 = arg0.method3044();
                        int var29 = arg0.method3197();
                        int var30 = var27 > 0 ? arg0.method3120() : var29;
                        arg2.method1456(var26, client.field881, var27, var28, var29, var30);
                    }
                }
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1189 = arg0.method3236();
            arg2.field1191 = arg0.method3236();
            arg2.field1179 = arg0.method3068();
            arg2.field1167 = arg0.method3067();
            arg2.field1177 = arg0.method3073() + client.field881;
            arg2.field1194 = arg0.method3073() + client.field881;
            arg2.field1195 = arg0.method3179();
            if (arg2.field837) {
                arg2.field1189 += arg2.field860;
                arg2.field1191 += arg2.field861;
                arg2.field1179 += arg2.field860;
                arg2.field1167 += arg2.field861;
                arg2.field1184 = 0;
            } else {
                arg2.field1189 += arg2.field1187[0];
                arg2.field1191 += arg2.field1203[0];
                arg2.field1179 += arg2.field1187[0];
                arg2.field1167 += arg2.field1203[0];
                arg2.field1184 = 1;
            }
            arg2.field1160 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1193 = arg0.method3045();
            if (arg2.field1193.charAt(0) == '~') {
                arg2.field1193 = arg2.field1193.substring(1);
                class97.method706(2, arg2.field844, arg2.field1193);
            } else if (Statics.field2501 == arg2) {
                class97.method706(2, arg2.field844, arg2.field1193);
            }
            arg2.field1161 = false;
            arg2.field1164 = 0;
            arg2.field1165 = 0;
            arg2.field1178 = 150;
        }
        if ((arg3 & 0x400) != 0) {
            for (int var31 = 0; var31 < 3; var31++) {
                arg2.field840[var31] = arg0.method3045();
            }
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method3067();
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1175 = arg0.method3074();
            if (arg2.field1184 == 0) {
                arg2.field1151 = arg2.field1175;
                arg2.field1175 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var32 = arg0.method3073();
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = arg0.method3204();
            Statics.method1037(arg2, var32, var33);
        }
        if (!arg2.field837) {
            return;
        }
        if (var4 == 127) {
            arg2.method1063(arg2.field860, arg2.field861);
            return;
        }
        byte var34;
        if (var4 == -1) {
            var34 = field1411[arg1];
        } else {
            var34 = var4;
        }
        arg2.method1072(arg2.field860, arg2.field861, var34);
    }

    @ObfuscatedName("bw.b(I)V")
    public static void method1081() {
        field1414 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1408[var0] = null;
            field1411[var0] = 1;
        }
    }
}
