package deob;

@ObfuscatedName("ct")
public class class93 {

    @ObfuscatedName("ct.o")
    public static byte[] field1373 = new byte[2048];

    @ObfuscatedName("ct.p")
    public static byte[] field1379 = new byte[2048];

    @ObfuscatedName("ct.a")
    public static class194[] field1375 = new class194[2048];

    @ObfuscatedName("ct.h")
    public static int field1372 = 0;

    @ObfuscatedName("ct.l")
    public static int[] field1377 = new int[2048];

    @ObfuscatedName("ct.y")
    public static int field1378 = 0;

    @ObfuscatedName("ct.g")
    public static int[] field1384 = new int[2048];

    @ObfuscatedName("ct.c")
    public static int[] field1374 = new int[2048];

    @ObfuscatedName("ct.u")
    public static int[] field1381 = new int[2048];

    @ObfuscatedName("ct.r")
    public static int[] field1382 = new int[2048];

    @ObfuscatedName("ct.d")
    public static int field1383 = 0;

    @ObfuscatedName("ct.v")
    public static int[] field1371 = new int[2048];

    @ObfuscatedName("ct.s")
    public static class194 field1385 = new class194(new byte[5000]);

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.b(Lgu;I)V")
    public static final void method555(class200 arg0) {
        arg0.method3518();
        int var1 = client.field924;
        class72 var2 = Statics.field818 = client.field923[var1] = new class72();
        var2.field809 = var1;
        int var3 = arg0.method3529(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1150[0] = var5 - Statics.field710;
        var2.field1133 = (var2.field1150[0] << 7) + (var2.method1091() << 6);
        var2.field1151[0] = var6 - Statics.field401;
        var2.field1096 = (var2.field1151[0] << 7) + (var2.method1091() << 6);
        Statics.field2735 = var2.field803 = var4;
        if (field1375[var1] != null) {
            var2.method1098(field1375[var1]);
        }
        field1372 = 0;
        field1377[++field1372 - 1] = var1;
        field1373[var1] = 0;
        field1378 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3529(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1374[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1381[var7] = 0;
                field1382[var7] = -1;
                field1384[++field1378 - 1] = var7;
                field1373[var7] = 0;
            }
        }
        arg0.method3540();
    }

    @ObfuscatedName("fr.q(Lgu;IB)V")
    public static final void method2970(class200 arg0, int arg1) {
        int var2 = arg0.field2538;
        field1383 = 0;
        int var3 = 0;
        arg0.method3518();
        for (int var4 = 0; var4 < field1372; var4++) {
            int var5 = field1377[var4];
            if ((field1373[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1373[var5] = (byte) (field1373[var5] | 0x2);
                } else {
                    int var6 = arg0.method3529(1);
                    if (var6 == 0) {
                        var3 = method654(arg0);
                        field1373[var5] = (byte) (field1373[var5] | 0x2);
                    } else {
                        method337(arg0, var5);
                    }
                }
            }
        }
        arg0.method3540();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3518();
        for (int var7 = 0; var7 < field1372; var7++) {
            int var8 = field1377[var7];
            if ((field1373[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1373[var8] = (byte) (field1373[var8] | 0x2);
                } else {
                    int var9 = arg0.method3529(1);
                    if (var9 == 0) {
                        var3 = method654(arg0);
                        field1373[var8] = (byte) (field1373[var8] | 0x2);
                    } else {
                        method337(arg0, var8);
                    }
                }
            }
        }
        arg0.method3540();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3518();
        for (int var10 = 0; var10 < field1378; var10++) {
            int var11 = field1384[var10];
            if ((field1373[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1373[var11] = (byte) (field1373[var11] | 0x2);
                } else {
                    int var12 = arg0.method3529(1);
                    if (var12 == 0) {
                        var3 = method654(arg0);
                        field1373[var11] = (byte) (field1373[var11] | 0x2);
                    } else if (method36(arg0, var11)) {
                        field1373[var11] = (byte) (field1373[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3540();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3518();
        for (int var13 = 0; var13 < field1378; var13++) {
            int var14 = field1384[var13];
            if ((field1373[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1373[var14] = (byte) (field1373[var14] | 0x2);
                } else {
                    int var15 = arg0.method3529(1);
                    if (var15 == 0) {
                        var3 = method654(arg0);
                        field1373[var14] = (byte) (field1373[var14] | 0x2);
                    } else if (method36(arg0, var14)) {
                        field1373[var14] = (byte) (field1373[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3540();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1372 = 0;
        field1378 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1373[var16] = (byte) (field1373[var16] >> 1);
            class72 var17 = client.field923[var16];
            if (var17 == null) {
                field1384[++field1378 - 1] = var16;
            } else {
                field1377[++field1372 - 1] = var16;
            }
        }
        method162(arg0);
        if (arg0.field2538 - var2 != arg1) {
            throw new RuntimeException(arg0.field2538 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("aw.o(Lgu;I)I")
    public static int method654(class200 arg0) {
        int var1 = arg0.method3529(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3529(5);
        } else if (var1 == 2) {
            var2 = arg0.method3529(8);
        } else {
            var2 = arg0.method3529(11);
        }
        return var2;
    }

    @ObfuscatedName("ai.p(Lgu;IB)V")
    public static void method337(class200 arg0, int arg1) {
        boolean var2 = arg0.method3529(1) == 1;
        if (var2) {
            field1371[++field1383 - 1] = arg1;
        }
        int var3 = arg0.method3529(2);
        class72 var4 = client.field923[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field807 = false;
            } else if (client.field924 == arg1) {
                throw new RuntimeException();
            } else {
                field1374[arg1] = (Statics.field401 + var4.field1151[0] >> 13) + (Statics.field710 + var4.field1150[0] >> 13 << 14) + (var4.field803 << 28);
                if (var4.field1123 == -1) {
                    field1381[arg1] = var4.field1146;
                } else {
                    field1381[arg1] = var4.field1123;
                }
                field1382[arg1] = var4.field1139;
                client.field923[arg1] = null;
                if (arg0.method3529(1) != 0) {
                    method36(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3529(3);
            int var6 = var4.field1150[0];
            int var7 = var4.field1151[0];
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
            if (client.field924 == arg1 && var4.field1133 < 1536 || var4.field1096 < 1536 || var4.field1133 >= 11776 || var4.field1096 >= 11776) {
                var4.method1094(var6, var7);
                var4.field807 = false;
            } else if (var2) {
                var4.field807 = true;
                var4.field808 = var6;
                var4.field792 = var7;
            } else {
                var4.field807 = false;
                var4.method1093(var6, var7, field1379[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3529(4);
            int var9 = var4.field1150[0];
            int var10 = var4.field1151[0];
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
            if (client.field924 == arg1 && var4.field1133 < 1536 || var4.field1096 < 1536 || var4.field1133 >= 11776 || var4.field1096 >= 11776) {
                var4.method1094(var9, var10);
                var4.field807 = false;
            } else if (var2) {
                var4.field807 = true;
                var4.field808 = var9;
                var4.field792 = var10;
            } else {
                var4.field807 = false;
                var4.method1093(var9, var10, field1379[arg1]);
            }
        } else {
            int var11 = arg0.method3529(1);
            if (var11 == 0) {
                int var12 = arg0.method3529(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1150[0] + var14;
                int var17 = var4.field1151[0] + var15;
                if (client.field924 == arg1 && var4.field1133 < 1536 || var4.field1096 < 1536 || var4.field1133 >= 11776 || var4.field1096 >= 11776) {
                    var4.method1094(var16, var17);
                    var4.field807 = false;
                } else if (var2) {
                    var4.field807 = true;
                    var4.field808 = var16;
                    var4.field792 = var17;
                } else {
                    var4.field807 = false;
                    var4.method1093(var16, var17, field1379[arg1]);
                }
                var4.field803 = (byte) (var4.field803 + var13 & 0x3);
                if (client.field924 == arg1) {
                    Statics.field2735 = var4.field803;
                }
            } else {
                int var18 = arg0.method3529(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field710 + var4.field1150[0] + var20 & 0x3FFF) - Statics.field710;
                int var23 = (Statics.field401 + var4.field1151[0] + var21 & 0x3FFF) - Statics.field401;
                if (client.field924 == arg1 && var4.field1133 < 1536 || var4.field1096 < 1536 || var4.field1133 >= 11776 || var4.field1096 >= 11776) {
                    var4.method1094(var22, var23);
                    var4.field807 = false;
                } else if (var2) {
                    var4.field807 = true;
                    var4.field808 = var22;
                    var4.field792 = var23;
                } else {
                    var4.field807 = false;
                    var4.method1093(var22, var23, field1379[arg1]);
                }
                var4.field803 = (byte) (var4.field803 + var19 & 0x3);
                if (client.field924 == arg1) {
                    Statics.field2735 = var4.field803;
                }
            }
        }
    }

    @ObfuscatedName("c.a(Lgu;II)Z")
    public static boolean method36(class200 arg0, int arg1) {
        int var2 = arg0.method3529(2);
        if (var2 == 0) {
            if (arg0.method3529(1) != 0) {
                method36(arg0, arg1);
            }
            int var3 = arg0.method3529(13);
            int var4 = arg0.method3529(13);
            boolean var5 = arg0.method3529(1) == 1;
            if (var5) {
                field1371[++field1383 - 1] = arg1;
            }
            if (client.field923[arg1] != null) {
                throw new RuntimeException();
            }
            class72 var6 = client.field923[arg1] = new class72();
            var6.field809 = arg1;
            if (field1375[arg1] != null) {
                var6.method1098(field1375[arg1]);
            }
            var6.field1146 = field1381[arg1];
            var6.field1139 = field1382[arg1];
            int var7 = field1374[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1153[0] = field1379[arg1];
            var6.field803 = (byte) var8;
            var6.method1094((var9 << 13) + var3 - Statics.field710, (var10 << 13) + var4 - Statics.field401);
            var6.field807 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3529(2);
            int var12 = field1374[arg1];
            field1374[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3529(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1374[arg1];
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
            field1374[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3529(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1374[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1374[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("z.h(Lgu;I)V")
    public static final void method162(class200 arg0) {
        for (int var1 = 0; var1 < field1383; var1++) {
            int var2 = field1371[var1];
            class72 var3 = client.field923[var2];
            int var4 = arg0.method3247();
            if ((var4 & 0x1) != 0) {
                var4 += arg0.method3247() << 8;
            }
            method1838(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("cj.l(Lgu;ILbl;II)V")
    public static final void method1838(class200 arg0, int arg1, class72 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x4) != 0) {
            int var5 = arg0.method3276();
            byte[] var6 = new byte[var5];
            class194 var7 = new class194(var6);
            arg0.method3297(var6, 0, var5);
            field1375[arg1] = var7;
            arg2.method1098(var7);
        }
        if ((arg3 & 0x2) != 0) {
            int var8 = arg0.method3276();
            if (var8 > 0) {
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = -1;
                    int var11 = -1;
                    int var12 = -1;
                    int var13 = arg0.method3368();
                    if (var13 == 32767) {
                        var13 = arg0.method3368();
                        var11 = arg0.method3368();
                        var10 = arg0.method3368();
                        var12 = arg0.method3368();
                    } else if (var13 == 32766) {
                        var13 = -1;
                    } else {
                        var11 = arg0.method3368();
                    }
                    int var14 = arg0.method3368();
                    arg2.method1503(var13, var11, var10, var12, client.field830, var14);
                }
            }
            int var15 = arg0.method3277();
            if (var15 > 0) {
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = arg0.method3368();
                    int var18 = arg0.method3368();
                    if (var18 == 32767) {
                        arg2.method1504(var17);
                    } else {
                        int var19 = arg0.method3368();
                        int var20 = arg0.method3277();
                        int var21 = var18 > 0 ? arg0.method3276() : var20;
                        arg2.method1505(var17, client.field830, var18, var19, var20, var21);
                    }
                }
            }
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1123 = arg0.method3366();
            if (arg2.field1149 == 0) {
                arg2.field1146 = arg2.field1123;
                arg2.field1123 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1108 = arg0.method3366();
            int var22 = arg0.method3295();
            arg2.field1136 = var22 >> 16;
            arg2.field1135 = (var22 & 0xFFFF) + client.field830;
            arg2.field1105 = 0;
            arg2.field1145 = 0;
            if (arg2.field1135 > client.field830) {
                arg2.field1105 = -1;
            }
            if (arg2.field1108 == 65535) {
                arg2.field1108 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1147 = arg0.method3256();
            if (arg2.field1147.charAt(0) == '~') {
                arg2.field1147 = arg2.field1147.substring(1);
                class95.method2873(2, arg2.field800.method4926(), arg2.field1147);
            } else if (Statics.field818 == arg2) {
                class95.method2873(2, arg2.field800.method4926(), arg2.field1147);
            }
            arg2.field1104 = false;
            arg2.field1112 = 0;
            arg2.field1113 = 0;
            arg2.field1111 = 150;
        }
        if ((arg3 & 0x8) != 0) {
            int var23 = arg0.method3285();
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = arg0.method3276();
            client.method3141(arg2, var23, var24);
        }
        if ((arg3 & 0x800) != 0) {
            var4 = arg0.method3280();
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field1137 = arg0.method3280();
            arg2.field1109 = arg0.method3280();
            arg2.field1138 = arg0.method3248();
            arg2.field1120 = arg0.method3248();
            arg2.field1141 = arg0.method3399() + client.field830;
            arg2.field1142 = arg0.method3399() + client.field830;
            arg2.field1143 = arg0.method3366();
            if (arg2.field807) {
                arg2.field1137 += arg2.field808;
                arg2.field1109 += arg2.field792;
                arg2.field1138 += arg2.field808;
                arg2.field1120 += arg2.field792;
                arg2.field1149 = 0;
            } else {
                arg2.field1137 += arg2.field1150[0];
                arg2.field1109 += arg2.field1151[0];
                arg2.field1138 += arg2.field1150[0];
                arg2.field1120 += arg2.field1151[0];
                arg2.field1149 = 1;
            }
            arg2.field1154 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            field1379[arg1] = arg0.method3279();
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1139 = arg0.method3285();
            if (arg2.field1139 == 65535) {
                arg2.field1139 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            for (int var25 = 0; var25 < 3; var25++) {
                arg2.field786[var25] = arg0.method3256();
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var26 = arg0.method3399();
            class251 var27 = (class251) class189.method2486(class251.method358(), arg0.method3275());
            boolean var28 = arg0.method3275() == 1;
            int var29 = arg0.method3275();
            int var30 = arg0.field2538;
            if (arg2.field800 != null && arg2.field781 != null) {
                boolean var31 = false;
                if (var27.field3296 && Statics.field1278.method1580(arg2.field800)) {
                    var31 = true;
                }
                if (!var31 && client.field922 == 0 && !arg2.field802) {
                    field1385.field2538 = 0;
                    arg0.method3296(field1385.field2541, 0, var29);
                    field1385.field2538 = 0;
                    String var32 = class299.method5037(class305.method965(class300.method3575(field1385)));
                    arg2.field1147 = var32.trim();
                    arg2.field1112 = var26 >> 8;
                    arg2.field1113 = var26 & 0xFF;
                    arg2.field1111 = 150;
                    arg2.field1104 = var28;
                    arg2.field1110 = Statics.field818 != arg2 && var27.field3296 && client.field1023 != "" && var32.toLowerCase().indexOf(client.field1023) == -1;
                    int var33;
                    if (var27.field3295) {
                        var33 = var28 ? 91 : 1;
                    } else {
                        var33 = var28 ? 90 : 2;
                    }
                    if (var27.field3294 == -1) {
                        class95.method2873(var33, arg2.field800.method4926(), var32);
                    } else {
                        int var35 = var27.field3294;
                        String var36 = "<img=" + var35 + ">";
                        class95.method2873(var33, var36 + arg2.field800.method4926(), var32);
                    }
                }
            }
            arg0.field2538 = var29 + var30;
        }
        if (!arg2.field807) {
            return;
        }
        if (var4 == 127) {
            arg2.method1094(arg2.field808, arg2.field792);
            return;
        }
        byte var37;
        if (var4 == -1) {
            var37 = field1379[arg1];
        } else {
            var37 = var4;
        }
        arg2.method1093(arg2.field808, arg2.field792, var37);
    }

    @ObfuscatedName("ce.y(B)V")
    public static void method1841() {
        field1372 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1375[var0] = null;
            field1379[var0] = 1;
        }
    }
}
