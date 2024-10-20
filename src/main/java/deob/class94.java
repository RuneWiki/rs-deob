package deob;

@ObfuscatedName("ca")
public class class94 {

    @ObfuscatedName("ca.t")
    public static byte[] field1429 = new byte[2048];

    @ObfuscatedName("ca.d")
    public static byte[] field1430 = new byte[2048];

    @ObfuscatedName("ca.h")
    public static class195[] field1431 = new class195[2048];

    @ObfuscatedName("ca.m")
    public static int field1432 = 0;

    @ObfuscatedName("ca.z")
    public static int[] field1437 = new int[2048];

    @ObfuscatedName("ca.i")
    public static int field1434 = 0;

    @ObfuscatedName("ca.u")
    public static int[] field1436 = new int[2048];

    @ObfuscatedName("ca.x")
    public static int[] field1441 = new int[2048];

    @ObfuscatedName("ca.y")
    public static int[] field1428 = new int[2048];

    @ObfuscatedName("ca.a")
    public static int[] field1435 = new int[2048];

    @ObfuscatedName("ca.w")
    public static int field1439 = 0;

    @ObfuscatedName("ca.n")
    public static int[] field1440 = new int[2048];

    @ObfuscatedName("ca.l")
    public static class195 field1433 = new class195(new byte[5000]);

    public class94() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.o(Lgs;I)V")
    public static final void method7(class202 arg0) {
        arg0.method3463();
        int var1 = client.field987;
        class73 var2 = Statics.field642 = client.field986[var1] = new class73();
        var2.field837 = var1;
        int var3 = arg0.method3477(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1213[0] = var5 - Statics.field2048;
        var2.field1211 = (var2.field1213[0] << 7) + (var2.method1080() << 6);
        var2.field1214[0] = var6 - Statics.field360;
        var2.field1188 = (var2.field1214[0] << 7) + (var2.method1080() << 6);
        Statics.field270 = var2.field857 = var4;
        if (field1431[var1] != null) {
            var2.method1077(field1431[var1]);
        }
        field1432 = 0;
        field1437[++field1432 - 1] = var1;
        field1429[var1] = 0;
        field1434 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3477(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1441[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1428[var7] = 0;
                field1435[var7] = -1;
                field1436[++field1434 - 1] = var7;
                field1429[var7] = 0;
            }
        }
        arg0.method3465();
    }

    @ObfuscatedName("cf.k(Lgs;B)I")
    public static int method1644(class202 arg0) {
        int var1 = arg0.method3477(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3477(5);
        } else if (var1 == 2) {
            var2 = arg0.method3477(8);
        } else {
            var2 = arg0.method3477(11);
        }
        return var2;
    }

    @ObfuscatedName("f.t(Lgs;IB)V")
    public static void method172(class202 arg0, int arg1) {
        boolean var2 = arg0.method3477(1) == 1;
        if (var2) {
            field1440[++field1439 - 1] = arg1;
        }
        int var3 = arg0.method3477(2);
        class73 var4 = client.field986[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field861 = false;
            } else if (client.field987 == arg1) {
                throw new RuntimeException();
            } else {
                field1441[arg1] = (Statics.field360 + var4.field1214[0] >> 13) + (Statics.field2048 + var4.field1213[0] >> 13 << 14) + (var4.field857 << 28);
                if (var4.field1186 == -1) {
                    field1428[arg1] = var4.field1209;
                } else {
                    field1428[arg1] = var4.field1186;
                }
                field1435[arg1] = var4.field1207;
                client.field986[arg1] = null;
                if (arg0.method3477(1) != 0) {
                    method1029(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3477(3);
            int var6 = var4.field1213[0];
            int var7 = var4.field1214[0];
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
            if (client.field987 == arg1 && var4.field1211 < 1536 || var4.field1188 < 1536 || var4.field1211 >= 11776 || var4.field1188 >= 11776) {
                var4.method1083(var6, var7);
                var4.field861 = false;
            } else if (var2) {
                var4.field861 = true;
                var4.field862 = var6;
                var4.field838 = var7;
            } else {
                var4.field861 = false;
                var4.method1082(var6, var7, field1430[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3477(4);
            int var9 = var4.field1213[0];
            int var10 = var4.field1214[0];
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
            if (client.field987 == arg1 && var4.field1211 < 1536 || var4.field1188 < 1536 || var4.field1211 >= 11776 || var4.field1188 >= 11776) {
                var4.method1083(var9, var10);
                var4.field861 = false;
            } else if (var2) {
                var4.field861 = true;
                var4.field862 = var9;
                var4.field838 = var10;
            } else {
                var4.field861 = false;
                var4.method1082(var9, var10, field1430[arg1]);
            }
        } else {
            int var11 = arg0.method3477(1);
            if (var11 == 0) {
                int var12 = arg0.method3477(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1213[0] + var14;
                int var17 = var4.field1214[0] + var15;
                if (client.field987 == arg1 && var4.field1211 < 1536 || var4.field1188 < 1536 || var4.field1211 >= 11776 || var4.field1188 >= 11776) {
                    var4.method1083(var16, var17);
                    var4.field861 = false;
                } else if (var2) {
                    var4.field861 = true;
                    var4.field862 = var16;
                    var4.field838 = var17;
                } else {
                    var4.field861 = false;
                    var4.method1082(var16, var17, field1430[arg1]);
                }
                var4.field857 = (byte) (var4.field857 + var13 & 0x3);
                if (client.field987 == arg1) {
                    Statics.field270 = var4.field857;
                }
            } else {
                int var18 = arg0.method3477(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2048 + var4.field1213[0] + var20 & 0x3FFF) - Statics.field2048;
                int var23 = (Statics.field360 + var4.field1214[0] + var21 & 0x3FFF) - Statics.field360;
                if (client.field987 == arg1 && var4.field1211 < 1536 || var4.field1188 < 1536 || var4.field1211 >= 11776 || var4.field1188 >= 11776) {
                    var4.method1083(var22, var23);
                    var4.field861 = false;
                } else if (var2) {
                    var4.field861 = true;
                    var4.field862 = var22;
                    var4.field838 = var23;
                } else {
                    var4.field861 = false;
                    var4.method1082(var22, var23, field1430[arg1]);
                }
                var4.field857 = (byte) (var4.field857 + var19 & 0x3);
                if (client.field987 == arg1) {
                    Statics.field270 = var4.field857;
                }
            }
        }
    }

    @ObfuscatedName("bi.d(Lgs;IB)Z")
    public static boolean method1029(class202 arg0, int arg1) {
        int var2 = arg0.method3477(2);
        if (var2 == 0) {
            if (arg0.method3477(1) != 0) {
                method1029(arg0, arg1);
            }
            int var3 = arg0.method3477(13);
            int var4 = arg0.method3477(13);
            boolean var5 = arg0.method3477(1) == 1;
            if (var5) {
                field1440[++field1439 - 1] = arg1;
            }
            if (client.field986[arg1] != null) {
                throw new RuntimeException();
            }
            class73 var6 = client.field986[arg1] = new class73();
            var6.field837 = arg1;
            if (field1431[arg1] != null) {
                var6.method1077(field1431[arg1]);
            }
            var6.field1209 = field1428[arg1];
            var6.field1207 = field1435[arg1];
            int var7 = field1441[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1215[0] = field1430[arg1];
            var6.field857 = (byte) var8;
            var6.method1083((var9 << 13) + var3 - Statics.field2048, (var10 << 13) + var4 - Statics.field360);
            var6.field861 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3477(2);
            int var12 = field1441[arg1];
            field1441[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3477(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1441[arg1];
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
            field1441[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3477(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1441[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1441[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("jj.h(Lgs;ILbz;II)V")
    public static final void method4483(class202 arg0, int arg1, class73 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x4) != 0) {
            arg2.field1171 = arg0.method3284();
            if (arg2.field1171.charAt(0) == '~') {
                arg2.field1171 = arg2.field1171.substring(1);
                class96.method752(2, arg2.field842.method5015(), arg2.field1171);
            } else if (Statics.field642 == arg2) {
                class96.method752(2, arg2.field842.method5015(), arg2.field1171);
            }
            arg2.field1169 = false;
            arg2.field1175 = 0;
            arg2.field1176 = 0;
            arg2.field1174 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1207 = arg0.method3207();
            if (arg2.field1207 == 65535) {
                arg2.field1207 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1186 = arg0.method3243();
            if (arg2.field1212 == 0) {
                arg2.field1209 = arg2.field1186;
                arg2.field1186 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var5 = arg0.method3324();
            if (var5 > 0) {
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = -1;
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = arg0.method3219();
                    if (var10 == 32767) {
                        var10 = arg0.method3219();
                        var8 = arg0.method3219();
                        var7 = arg0.method3219();
                        var9 = arg0.method3219();
                    } else if (var10 == 32766) {
                        var10 = -1;
                    } else {
                        var8 = arg0.method3219();
                    }
                    int var11 = arg0.method3219();
                    arg2.method1514(var10, var8, var7, var9, client.field929, var11);
                }
            }
            int var12 = arg0.method3226();
            if (var12 > 0) {
                for (int var13 = 0; var13 < var12; var13++) {
                    int var14 = arg0.method3219();
                    int var15 = arg0.method3219();
                    if (var15 == 32767) {
                        arg2.method1516(var14);
                    } else {
                        int var16 = arg0.method3219();
                        int var17 = arg0.method3226();
                        int var18 = var15 > 0 ? arg0.method3234() : var17;
                        arg2.method1515(var14, client.field929, var15, var16, var17, var18);
                    }
                }
            }
        }
        if ((arg3 & 0x800) != 0) {
            for (int var19 = 0; var19 < 3; var19++) {
                arg2.field840[var19] = arg0.method3284();
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var20 = arg0.method3207();
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = arg0.method3226();
            client.method2834(arg2, var20, var21);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1195 = arg0.method3241();
            int var22 = arg0.method3251();
            arg2.field1199 = var22 >> 16;
            arg2.field1198 = (var22 & 0xFFFF) + client.field929;
            arg2.field1196 = 0;
            arg2.field1197 = 0;
            if (arg2.field1198 > client.field929) {
                arg2.field1196 = -1;
            }
            if (arg2.field1195 == 65535) {
                arg2.field1195 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var23 = arg0.method3241();
            class257[] var24 = new class257[] { class257.field3346, class257.field3345, class257.field3347, class257.field3350, class257.field3351, class257.field3348 };
            class257 var25 = (class257) class190.method4146(var24, arg0.method3234());
            boolean var26 = arg0.method3205() == 1;
            int var27 = arg0.method3226();
            int var28 = arg0.field2575;
            if (arg2.field842 != null && arg2.field848 != null) {
                boolean var29 = false;
                if (var25.field3353 && Statics.field426.method1593(arg2.field842)) {
                    var29 = true;
                }
                if (!var29 && client.field899 == 0 && !arg2.field856) {
                    field1433.field2575 = 0;
                    arg0.method3253(field1433.field2574, 0, var27);
                    field1433.field2575 = 0;
                    String var30 = class313.method5087(class319.method5003(class314.method2826(field1433)));
                    arg2.field1171 = var30.trim();
                    arg2.field1175 = var23 >> 8;
                    arg2.field1176 = var23 & 0xFF;
                    arg2.field1174 = 150;
                    arg2.field1169 = var26;
                    arg2.field1158 = Statics.field642 != arg2 && var25.field3353 && client.field1086 != "" && var30.toLowerCase().indexOf(client.field1086) == -1;
                    int var31;
                    if (var25.field3352) {
                        var31 = var26 ? 91 : 1;
                    } else {
                        var31 = var26 ? 90 : 2;
                    }
                    if (var25.field3349 == -1) {
                        class96.method752(var31, arg2.field842.method5015(), var30);
                    } else {
                        int var33 = var25.field3349;
                        String var34 = "<img=" + var33 + ">";
                        class96.method752(var31, var34 + arg2.field842.method5015(), var30);
                    }
                }
            }
            arg0.field2575 = var27 + var28;
        }
        if ((arg3 & 0x200) != 0) {
            var4 = arg0.method3236();
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1204 = arg0.method3210();
            arg2.field1200 = arg0.method3413();
            arg2.field1201 = arg0.method3236();
            arg2.field1203 = arg0.method3322();
            arg2.field1167 = arg0.method3241() + client.field929;
            arg2.field1205 = arg0.method3242() + client.field929;
            arg2.field1172 = arg0.method3243();
            if (arg2.field861) {
                arg2.field1204 += arg2.field862;
                arg2.field1200 += arg2.field838;
                arg2.field1201 += arg2.field862;
                arg2.field1203 += arg2.field838;
                arg2.field1212 = 0;
            } else {
                arg2.field1204 += arg2.field1213[0];
                arg2.field1200 += arg2.field1214[0];
                arg2.field1201 += arg2.field1213[0];
                arg2.field1203 += arg2.field1214[0];
                arg2.field1212 = 1;
            }
            arg2.field1217 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            field1430[arg1] = arg0.method3322();
        }
        if ((arg3 & 0x2) != 0) {
            int var35 = arg0.method3234();
            byte[] var36 = new byte[var35];
            class195 var37 = new class195(var36);
            arg0.method3349(var36, 0, var35);
            field1431[arg1] = var37;
            arg2.method1077(var37);
        }
        if (!arg2.field861) {
            return;
        }
        if (var4 == 127) {
            arg2.method1083(arg2.field862, arg2.field838);
            return;
        }
        byte var38;
        if (var4 == -1) {
            var38 = field1430[arg1];
        } else {
            var38 = var4;
        }
        arg2.method1082(arg2.field862, arg2.field838, var38);
    }
}
