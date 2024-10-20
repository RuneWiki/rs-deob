package deob;

@ObfuscatedName("cr")
public class class94 {

    @ObfuscatedName("cr.o")
    public static byte[] field1412 = new byte[2048];

    @ObfuscatedName("cr.j")
    public static byte[] field1410 = new byte[2048];

    @ObfuscatedName("cr.k")
    public static class195[] field1414 = new class195[2048];

    @ObfuscatedName("cr.x")
    public static int field1415 = 0;

    @ObfuscatedName("cr.z")
    public static int[] field1416 = new int[2048];

    @ObfuscatedName("cr.p")
    public static int field1417 = 0;

    @ObfuscatedName("cr.w")
    public static int[] field1419 = new int[2048];

    @ObfuscatedName("cr.r")
    public static int[] field1421 = new int[2048];

    @ObfuscatedName("cr.d")
    public static int[] field1420 = new int[2048];

    @ObfuscatedName("cr.a")
    public static int[] field1413 = new int[2048];

    @ObfuscatedName("cr.e")
    public static int field1422 = 0;

    @ObfuscatedName("cr.f")
    public static int[] field1423 = new int[2048];

    @ObfuscatedName("cr.l")
    public static class195 field1424 = new class195(new byte[5000]);

    public class94() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.c(Lgf;S)V")
    public static final void method16(class202 arg0) {
        arg0.method3489();
        int var1 = client.field1001;
        class73 var2 = Statics.field260 = client.field972[var1] = new class73();
        var2.field844 = var1;
        int var3 = arg0.method3497(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1189[0] = var5 - Statics.field2499;
        var2.field1186 = (var2.field1189[0] << 7) + (var2.method1063() << 6);
        var2.field1207[0] = var6 - Statics.field29;
        var2.field1210 = (var2.field1207[0] << 7) + (var2.method1063() << 6);
        Statics.field2770 = var2.field843 = var4;
        if (field1414[var1] != null) {
            var2.method1035(field1414[var1]);
        }
        field1415 = 0;
        field1416[++field1415 - 1] = var1;
        field1412[var1] = 0;
        field1417 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3497(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1421[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1420[var7] = 0;
                field1413[var7] = -1;
                field1419[++field1417 - 1] = var7;
                field1412[var7] = 0;
            }
        }
        arg0.method3491();
    }

    @ObfuscatedName("client.i(Lgf;II)V")
    public static final void method1445(class202 arg0, int arg1) {
        int var2 = arg0.field2566;
        field1422 = 0;
        method689(arg0);
        method1714(arg0);
        if (arg0.field2566 - var2 != arg1) {
            throw new RuntimeException(arg0.field2566 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("an.o(Lgf;I)V")
    public static final void method689(class202 arg0) {
        int var1 = 0;
        arg0.method3489();
        for (int var2 = 0; var2 < field1415; var2++) {
            int var3 = field1416[var2];
            if ((field1412[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1412[var3] = (byte) (field1412[var3] | 0x2);
                } else {
                    int var4 = arg0.method3497(1);
                    if (var4 == 0) {
                        var1 = method1506(arg0);
                        field1412[var3] = (byte) (field1412[var3] | 0x2);
                    } else {
                        method2663(arg0, var3);
                    }
                }
            }
        }
        arg0.method3491();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3489();
        for (int var5 = 0; var5 < field1415; var5++) {
            int var6 = field1416[var5];
            if ((field1412[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1412[var6] = (byte) (field1412[var6] | 0x2);
                } else {
                    int var7 = arg0.method3497(1);
                    if (var7 == 0) {
                        var1 = method1506(arg0);
                        field1412[var6] = (byte) (field1412[var6] | 0x2);
                    } else {
                        method2663(arg0, var6);
                    }
                }
            }
        }
        arg0.method3491();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3489();
        for (int var8 = 0; var8 < field1417; var8++) {
            int var9 = field1419[var8];
            if ((field1412[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1412[var9] = (byte) (field1412[var9] | 0x2);
                } else {
                    int var10 = arg0.method3497(1);
                    if (var10 == 0) {
                        var1 = method1506(arg0);
                        field1412[var9] = (byte) (field1412[var9] | 0x2);
                    } else if (method25(arg0, var9)) {
                        field1412[var9] = (byte) (field1412[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3491();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3489();
        for (int var11 = 0; var11 < field1417; var11++) {
            int var12 = field1419[var11];
            if ((field1412[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1412[var12] = (byte) (field1412[var12] | 0x2);
                } else {
                    int var13 = arg0.method3497(1);
                    if (var13 == 0) {
                        var1 = method1506(arg0);
                        field1412[var12] = (byte) (field1412[var12] | 0x2);
                    } else if (method25(arg0, var12)) {
                        field1412[var12] = (byte) (field1412[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3491();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1415 = 0;
        field1417 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1412[var14] = (byte) (field1412[var14] >> 1);
            class73 var15 = client.field972[var14];
            if (var15 == null) {
                field1419[++field1417 - 1] = var14;
            } else {
                field1416[++field1415 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bz.j(Lgf;I)I")
    public static int method1506(class202 arg0) {
        int var1 = arg0.method3497(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3497(5);
        } else if (var1 == 2) {
            var2 = arg0.method3497(8);
        } else {
            var2 = arg0.method3497(11);
        }
        return var2;
    }

    @ObfuscatedName("ev.k(Lgf;IB)V")
    public static void method2663(class202 arg0, int arg1) {
        boolean var2 = arg0.method3497(1) == 1;
        if (var2) {
            field1423[++field1422 - 1] = arg1;
        }
        int var3 = arg0.method3497(2);
        class73 var4 = client.field972[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field838 = false;
            } else if (client.field1001 == arg1) {
                throw new RuntimeException();
            } else {
                field1421[arg1] = (Statics.field29 + var4.field1207[0] >> 13) + (Statics.field2499 + var4.field1189[0] >> 13 << 14) + (var4.field843 << 28);
                if (var4.field1166 == -1) {
                    field1420[arg1] = var4.field1202;
                } else {
                    field1420[arg1] = var4.field1166;
                }
                field1413[arg1] = var4.field1191;
                client.field972[arg1] = null;
                if (arg0.method3497(1) != 0) {
                    method25(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3497(3);
            int var6 = var4.field1189[0];
            int var7 = var4.field1207[0];
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
            if (client.field1001 == arg1 && var4.field1186 < 1536 || var4.field1210 < 1536 || var4.field1186 >= 11776 || var4.field1210 >= 11776) {
                var4.method1054(var6, var7);
                var4.field838 = false;
            } else if (var2) {
                var4.field838 = true;
                var4.field848 = var6;
                var4.field847 = var7;
            } else {
                var4.field838 = false;
                var4.method1044(var6, var7, field1410[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3497(4);
            int var9 = var4.field1189[0];
            int var10 = var4.field1207[0];
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
            if (client.field1001 == arg1 && var4.field1186 < 1536 || var4.field1210 < 1536 || var4.field1186 >= 11776 || var4.field1210 >= 11776) {
                var4.method1054(var9, var10);
                var4.field838 = false;
            } else if (var2) {
                var4.field838 = true;
                var4.field848 = var9;
                var4.field847 = var10;
            } else {
                var4.field838 = false;
                var4.method1044(var9, var10, field1410[arg1]);
            }
        } else {
            int var11 = arg0.method3497(1);
            if (var11 == 0) {
                int var12 = arg0.method3497(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1189[0] + var14;
                int var17 = var4.field1207[0] + var15;
                if (client.field1001 == arg1 && var4.field1186 < 1536 || var4.field1210 < 1536 || var4.field1186 >= 11776 || var4.field1210 >= 11776) {
                    var4.method1054(var16, var17);
                    var4.field838 = false;
                } else if (var2) {
                    var4.field838 = true;
                    var4.field848 = var16;
                    var4.field847 = var17;
                } else {
                    var4.field838 = false;
                    var4.method1044(var16, var17, field1410[arg1]);
                }
                var4.field843 = (byte) (var4.field843 + var13 & 0x3);
                if (client.field1001 == arg1) {
                    Statics.field2770 = var4.field843;
                }
            } else {
                int var18 = arg0.method3497(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2499 + var4.field1189[0] + var20 & 0x3FFF) - Statics.field2499;
                int var23 = (Statics.field29 + var4.field1207[0] + var21 & 0x3FFF) - Statics.field29;
                if (client.field1001 == arg1 && var4.field1186 < 1536 || var4.field1210 < 1536 || var4.field1186 >= 11776 || var4.field1210 >= 11776) {
                    var4.method1054(var22, var23);
                    var4.field838 = false;
                } else if (var2) {
                    var4.field838 = true;
                    var4.field848 = var22;
                    var4.field847 = var23;
                } else {
                    var4.field838 = false;
                    var4.method1044(var22, var23, field1410[arg1]);
                }
                var4.field843 = (byte) (var4.field843 + var19 & 0x3);
                if (client.field1001 == arg1) {
                    Statics.field2770 = var4.field843;
                }
            }
        }
    }

    @ObfuscatedName("z.x(Lgf;II)Z")
    public static boolean method25(class202 arg0, int arg1) {
        int var2 = arg0.method3497(2);
        if (var2 == 0) {
            if (arg0.method3497(1) != 0) {
                method25(arg0, arg1);
            }
            int var3 = arg0.method3497(13);
            int var4 = arg0.method3497(13);
            boolean var5 = arg0.method3497(1) == 1;
            if (var5) {
                field1423[++field1422 - 1] = arg1;
            }
            if (client.field972[arg1] != null) {
                throw new RuntimeException();
            }
            class73 var6 = client.field972[arg1] = new class73();
            var6.field844 = arg1;
            if (field1414[arg1] != null) {
                var6.method1035(field1414[arg1]);
            }
            var6.field1202 = field1420[arg1];
            var6.field1191 = field1413[arg1];
            int var7 = field1421[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1177[0] = field1410[arg1];
            var6.field843 = (byte) var8;
            var6.method1054((var9 << 13) + var3 - Statics.field2499, (var10 << 13) + var4 - Statics.field29);
            var6.field838 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3497(2);
            int var12 = field1421[arg1];
            field1421[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3497(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1421[arg1];
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
            field1421[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3497(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1421[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1421[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cv.z(Lgf;I)V")
    public static final void method1714(class202 arg0) {
        for (int var1 = 0; var1 < field1422; var1++) {
            int var2 = field1423[var1];
            class73 var3 = client.field972[var2];
            int var4 = arg0.method3429();
            if ((var4 & 0x20) != 0) {
                var4 += arg0.method3429() << 8;
            }
            method4357(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("jc.p(Lgf;ILbx;II)V")
    public static final void method4357(class202 arg0, int arg1, class73 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x100) != 0) {
            arg2.field1188 = arg0.method3422();
            int var5 = arg0.method3270();
            arg2.field1192 = var5 >> 16;
            arg2.field1190 = (var5 & 0xFFFF) + client.field867;
            arg2.field1160 = 0;
            arg2.field1157 = 0;
            if (arg2.field1190 > client.field867) {
                arg2.field1160 = -1;
            }
            if (arg2.field1188 == 65535) {
                arg2.field1188 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            field1410[arg1] = arg0.method3226();
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field1193 = arg0.method3226();
            arg2.field1203 = arg0.method3257();
            arg2.field1194 = arg0.method3226();
            arg2.field1179 = arg0.method3256();
            arg2.field1197 = arg0.method3219() + client.field867;
            arg2.field1198 = arg0.method3422() + client.field867;
            arg2.field1199 = arg0.method3422();
            if (arg2.field838) {
                arg2.field1193 += arg2.field848;
                arg2.field1203 += arg2.field847;
                arg2.field1194 += arg2.field848;
                arg2.field1179 += arg2.field847;
                arg2.field1205 = 0;
            } else {
                arg2.field1193 += arg2.field1189[0];
                arg2.field1203 += arg2.field1207[0];
                arg2.field1194 += arg2.field1189[0];
                arg2.field1179 += arg2.field1207[0];
                arg2.field1205 = 1;
            }
            arg2.field1195 = 0;
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1191 = arg0.method3218();
            if (arg2.field1191 == 65535) {
                arg2.field1191 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var6 = arg0.method3379();
            if (var6 > 0) {
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = -1;
                    int var11 = arg0.method3239();
                    if (var11 == 32767) {
                        var11 = arg0.method3239();
                        var9 = arg0.method3239();
                        var8 = arg0.method3239();
                        var10 = arg0.method3239();
                    } else if (var11 == 32766) {
                        var11 = -1;
                    } else {
                        var9 = arg0.method3239();
                    }
                    int var12 = arg0.method3239();
                    arg2.method1452(var11, var9, var8, var10, client.field867, var12);
                }
            }
            int var13 = arg0.method3379();
            if (var13 > 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    int var15 = arg0.method3239();
                    int var16 = arg0.method3239();
                    if (var16 == 32767) {
                        arg2.method1454(var15);
                    } else {
                        int var17 = arg0.method3239();
                        int var18 = arg0.method3379();
                        int var19 = var16 > 0 ? arg0.method3254() : var18;
                        arg2.method1451(var15, client.field867, var16, var17, var18, var19);
                    }
                }
            }
        }
        if ((arg3 & 0x200) != 0) {
            for (int var20 = 0; var20 < 3; var20++) {
                arg2.field826[var20] = arg0.method3427();
            }
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method3257();
        }
        if ((arg3 & 0x80) != 0) {
            int var21 = arg0.method3263();
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = arg0.method3429();
            client.method5086(arg2, var21, var22);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1153 = arg0.method3427();
            if (arg2.field1153.charAt(0) == '~') {
                arg2.field1153 = arg2.field1153.substring(1);
                class96.method3189(2, arg2.field824.method5038(), arg2.field1153);
            } else if (Statics.field260 == arg2) {
                class96.method3189(2, arg2.field824.method5038(), arg2.field1153);
            }
            arg2.field1168 = false;
            arg2.field1208 = 0;
            arg2.field1169 = 0;
            arg2.field1167 = 150;
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1166 = arg0.method3263();
            if (arg2.field1205 == 0) {
                arg2.field1202 = arg2.field1166;
                arg2.field1166 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var23 = arg0.method3422();
            class257 var24 = (class257) class190.method578(class257.method7(), arg0.method3254());
            boolean var25 = arg0.method3429() == 1;
            int var26 = arg0.method3254();
            int var27 = arg0.field2566;
            if (arg2.field824 != null && arg2.field821 != null) {
                boolean var28 = false;
                if (var24.field3328 && Statics.field2183.method1559(arg2.field824)) {
                    var28 = true;
                }
                if (!var28 && client.field970 == 0 && !arg2.field837) {
                    field1424.field2566 = 0;
                    arg0.method3265(field1424.field2567, 0, var26);
                    field1424.field2566 = 0;
                    class195 var29 = field1424;
                    String var30 = class314.method14(var29, 32767);
                    String var31 = class313.method5110(class319.method1775(var30));
                    arg2.field1153 = var31.trim();
                    arg2.field1208 = var23 >> 8;
                    arg2.field1169 = var23 & 0xFF;
                    arg2.field1167 = 150;
                    arg2.field1168 = var25;
                    arg2.field1180 = Statics.field260 != arg2 && var24.field3328 && client.field870 != "" && var31.toLowerCase().indexOf(client.field870) == -1;
                    int var32;
                    if (var24.field3336) {
                        var32 = var25 ? 91 : 1;
                    } else {
                        var32 = var25 ? 90 : 2;
                    }
                    if (var24.field3335 == -1) {
                        class96.method3189(var32, arg2.field824.method5038(), var31);
                    } else {
                        class96.method3189(var32, class87.method176(var24.field3335) + arg2.field824.method5038(), var31);
                    }
                }
            }
            arg0.field2566 = var26 + var27;
        }
        if ((arg3 & 0x8) != 0) {
            int var33 = arg0.method3429();
            byte[] var34 = new byte[var33];
            class195 var35 = new class195(var34);
            arg0.method3265(var34, 0, var33);
            field1414[arg1] = var35;
            arg2.method1035(var35);
        }
        if (!arg2.field838) {
            return;
        }
        if (var4 == 127) {
            arg2.method1054(arg2.field848, arg2.field847);
            return;
        }
        byte var36;
        if (var4 == -1) {
            var36 = field1410[arg1];
        } else {
            var36 = var4;
        }
        arg2.method1044(arg2.field848, arg2.field847, var36);
    }

    @ObfuscatedName("j.w(I)V")
    public static void method4() {
        field1415 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1414[var0] = null;
            field1410[var0] = 1;
        }
    }
}
