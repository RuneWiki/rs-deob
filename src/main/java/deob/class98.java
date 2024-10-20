package deob;

@ObfuscatedName("co")
public class class98 {

    @ObfuscatedName("co.f")
    public static byte[] field1508 = new byte[2048];

    @ObfuscatedName("co.p")
    public static byte[] field1509 = new byte[2048];

    @ObfuscatedName("co.x")
    public static class175[] field1520 = new class175[2048];

    @ObfuscatedName("co.g")
    public static int field1511 = 0;

    @ObfuscatedName("co.c")
    public static int[] field1512 = new int[2048];

    @ObfuscatedName("co.l")
    public static int field1513 = 0;

    @ObfuscatedName("co.w")
    public static int[] field1514 = new int[2048];

    @ObfuscatedName("co.b")
    public static int[] field1506 = new int[2048];

    @ObfuscatedName("co.o")
    public static int[] field1516 = new int[2048];

    @ObfuscatedName("co.m")
    public static int[] field1517 = new int[2048];

    @ObfuscatedName("co.i")
    public static int field1507 = 0;

    @ObfuscatedName("co.s")
    public static int[] field1519 = new int[2048];

    @ObfuscatedName("co.r")
    public static class175 field1510 = new class175(new byte[5000]);

    public class98() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.j(Lfo;I)V")
    public static final void method2204(class181 arg0) {
        arg0.method3160();
        int var1 = client.field1019;
        class76 var2 = Statics.field312 = client.field1046[var1] = new class76();
        var2.field897 = var1;
        int var3 = arg0.method3142(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1228[0] = var5 - Statics.field608;
        var2.field1262 = (var2.field1228[0] << 7) + (var2.method1076() << 6);
        var2.field1234[0] = var6 - Statics.field587;
        var2.field1259 = (var2.field1234[0] << 7) + (var2.method1076() << 6);
        Statics.field509 = var2.field919 = var4;
        if (field1520[var1] != null) {
            var2.method1075(field1520[var1]);
        }
        field1511 = 0;
        field1512[++field1511 - 1] = var1;
        field1508[var1] = 0;
        field1513 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3142(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1506[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1516[var7] = 0;
                field1517[var7] = -1;
                field1514[++field1513 - 1] = var7;
                field1508[var7] = 0;
            }
        }
        arg0.method3143();
    }

    @ObfuscatedName("bt.h(Lfo;II)V")
    public static final void method1041(class181 arg0, int arg1) {
        int var2 = arg0.field2394;
        field1507 = 0;
        method1047(arg0);
        method1474(arg0);
        if (arg0.field2394 - var2 != arg1) {
            throw new RuntimeException(arg0.field2394 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bt.f(Lfo;B)V")
    public static final void method1047(class181 arg0) {
        int var1 = 0;
        arg0.method3160();
        for (int var2 = 0; var2 < field1511; var2++) {
            int var3 = field1512[var2];
            if ((field1508[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1508[var3] = (byte) (field1508[var3] | 0x2);
                } else {
                    int var4 = arg0.method3142(1);
                    if (var4 == 0) {
                        var1 = method1057(arg0);
                        field1508[var3] = (byte) (field1508[var3] | 0x2);
                    } else {
                        method4396(arg0, var3);
                    }
                }
            }
        }
        arg0.method3143();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3160();
        for (int var5 = 0; var5 < field1511; var5++) {
            int var6 = field1512[var5];
            if ((field1508[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1508[var6] = (byte) (field1508[var6] | 0x2);
                } else {
                    int var7 = arg0.method3142(1);
                    if (var7 == 0) {
                        var1 = method1057(arg0);
                        field1508[var6] = (byte) (field1508[var6] | 0x2);
                    } else {
                        method4396(arg0, var6);
                    }
                }
            }
        }
        arg0.method3143();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3160();
        for (int var8 = 0; var8 < field1513; var8++) {
            int var9 = field1514[var8];
            if ((field1508[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1508[var9] = (byte) (field1508[var9] | 0x2);
                } else {
                    int var10 = arg0.method3142(1);
                    if (var10 == 0) {
                        var1 = method1057(arg0);
                        field1508[var9] = (byte) (field1508[var9] | 0x2);
                    } else if (method484(arg0, var9)) {
                        field1508[var9] = (byte) (field1508[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3143();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3160();
        for (int var11 = 0; var11 < field1513; var11++) {
            int var12 = field1514[var11];
            if ((field1508[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1508[var12] = (byte) (field1508[var12] | 0x2);
                } else {
                    int var13 = arg0.method3142(1);
                    if (var13 == 0) {
                        var1 = method1057(arg0);
                        field1508[var12] = (byte) (field1508[var12] | 0x2);
                    } else if (method484(arg0, var12)) {
                        field1508[var12] = (byte) (field1508[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3143();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1511 = 0;
        field1513 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1508[var14] = (byte) (field1508[var14] >> 1);
            class76 var15 = client.field1046[var14];
            if (var15 == null) {
                field1514[++field1513 - 1] = var14;
            } else {
                field1512[++field1511 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("bo.p(Lfo;I)I")
    public static int method1057(class181 arg0) {
        int var1 = arg0.method3142(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3142(5);
        } else if (var1 == 2) {
            var2 = arg0.method3142(8);
        } else {
            var2 = arg0.method3142(11);
        }
        return var2;
    }

    @ObfuscatedName("jy.x(Lfo;II)V")
    public static void method4396(class181 arg0, int arg1) {
        boolean var2 = arg0.method3142(1) == 1;
        if (var2) {
            field1519[++field1507 - 1] = arg1;
        }
        int var3 = arg0.method3142(2);
        class76 var4 = client.field1046[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field904 = false;
            } else if (client.field1019 == arg1) {
                throw new RuntimeException();
            } else {
                field1506[arg1] = (Statics.field587 + var4.field1234[0] >> 13) + (Statics.field608 + var4.field1228[0] >> 13 << 14) + (var4.field919 << 28);
                if (var4.field1247 == -1) {
                    field1516[arg1] = var4.field1270;
                } else {
                    field1516[arg1] = var4.field1247;
                }
                field1517[arg1] = var4.field1245;
                client.field1046[arg1] = null;
                if (arg0.method3142(1) != 0) {
                    method484(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3142(3);
            int var6 = var4.field1228[0];
            int var7 = var4.field1234[0];
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
            if (client.field1019 == arg1 && var4.field1262 < 1536 || var4.field1259 < 1536 || var4.field1262 >= 11776 || var4.field1259 >= 11776) {
                var4.method1079(var6, var7);
                var4.field904 = false;
            } else if (var2) {
                var4.field904 = true;
                var4.field922 = var6;
                var4.field923 = var7;
            } else {
                var4.field904 = false;
                var4.method1078(var6, var7, field1509[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3142(4);
            int var9 = var4.field1228[0];
            int var10 = var4.field1234[0];
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
            if (client.field1019 == arg1 && var4.field1262 < 1536 || var4.field1259 < 1536 || var4.field1262 >= 11776 || var4.field1259 >= 11776) {
                var4.method1079(var9, var10);
                var4.field904 = false;
            } else if (var2) {
                var4.field904 = true;
                var4.field922 = var9;
                var4.field923 = var10;
            } else {
                var4.field904 = false;
                var4.method1078(var9, var10, field1509[arg1]);
            }
        } else {
            int var11 = arg0.method3142(1);
            if (var11 == 0) {
                int var12 = arg0.method3142(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1228[0] + var14;
                int var17 = var4.field1234[0] + var15;
                if (client.field1019 == arg1 && var4.field1262 < 1536 || var4.field1259 < 1536 || var4.field1262 >= 11776 || var4.field1259 >= 11776) {
                    var4.method1079(var16, var17);
                    var4.field904 = false;
                } else if (var2) {
                    var4.field904 = true;
                    var4.field922 = var16;
                    var4.field923 = var17;
                } else {
                    var4.field904 = false;
                    var4.method1078(var16, var17, field1509[arg1]);
                }
                var4.field919 = (byte) (var4.field919 + var13 & 0x3);
                if (client.field1019 == arg1) {
                    Statics.field509 = var4.field919;
                }
            } else {
                int var18 = arg0.method3142(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field608 + var4.field1228[0] + var20 & 0x3FFF) - Statics.field608;
                int var23 = (Statics.field587 + var4.field1234[0] + var21 & 0x3FFF) - Statics.field587;
                if (client.field1019 == arg1 && var4.field1262 < 1536 || var4.field1259 < 1536 || var4.field1262 >= 11776 || var4.field1259 >= 11776) {
                    var4.method1079(var22, var23);
                    var4.field904 = false;
                } else if (var2) {
                    var4.field904 = true;
                    var4.field922 = var22;
                    var4.field923 = var23;
                } else {
                    var4.field904 = false;
                    var4.method1078(var22, var23, field1509[arg1]);
                }
                var4.field919 = (byte) (var4.field919 + var19 & 0x3);
                if (client.field1019 == arg1) {
                    Statics.field509 = var4.field919;
                }
            }
        }
    }

    @ObfuscatedName("au.g(Lfo;II)Z")
    public static boolean method484(class181 arg0, int arg1) {
        int var2 = arg0.method3142(2);
        if (var2 == 0) {
            if (arg0.method3142(1) != 0) {
                method484(arg0, arg1);
            }
            int var3 = arg0.method3142(13);
            int var4 = arg0.method3142(13);
            boolean var5 = arg0.method3142(1) == 1;
            if (var5) {
                field1519[++field1507 - 1] = arg1;
            }
            if (client.field1046[arg1] != null) {
                throw new RuntimeException();
            }
            class76 var6 = client.field1046[arg1] = new class76();
            var6.field897 = arg1;
            if (field1520[arg1] != null) {
                var6.method1075(field1520[arg1]);
            }
            var6.field1270 = field1516[arg1];
            var6.field1245 = field1517[arg1];
            int var7 = field1506[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1252[0] = field1509[arg1];
            var6.field919 = (byte) var8;
            var6.method1079((var9 << 13) + var3 - Statics.field608, (var10 << 13) + var4 - Statics.field587);
            var6.field904 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3142(2);
            int var12 = field1506[arg1];
            field1506[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3142(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1506[arg1];
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
            field1506[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3142(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1506[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1506[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ct.c(Lfo;I)V")
    public static final void method1474(class181 arg0) {
        for (int var1 = 0; var1 < field1507; var1++) {
            int var2 = field1519[var1];
            class76 var3 = client.field1046[var2];
            int var4 = arg0.method2903();
            if ((var4 & 0x40) != 0) {
                var4 += arg0.method2903() << 8;
            }
            method334(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("aj.l(Lfo;ILbz;IB)V")
    public static final void method334(class181 arg0, int arg1, class76 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1) != 0) {
            int var5 = arg0.method2903();
            byte[] var6 = new byte[var5];
            class175 var7 = new class175(var6);
            arg0.method3052(var6, 0, var5);
            field1520[arg1] = var7;
            arg2.method1075(var7);
        }
        if ((arg3 & 0x10) != 0) {
            int var8 = arg0.method3023();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2903();
            client.method7(arg2, var8, var9);
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1245 = arg0.method3023();
            if (arg2.field1245 == 65535) {
                arg2.field1245 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1238 = arg0.method2911();
            if (arg2.field1238.charAt(0) == '~') {
                arg2.field1238 = arg2.field1238.substring(1);
                class100.method1553(2, arg2.field915, arg2.field1238);
            } else if (Statics.field312 == arg2) {
                class100.method1553(2, arg2.field915, arg2.field1238);
            }
            arg2.field1274 = false;
            arg2.field1236 = 0;
            arg2.field1237 = 0;
            arg2.field1275 = 150;
        }
        if ((arg3 & 0x8) != 0) {
            int var10 = arg0.method2903();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method3013();
                    if (var15 == 32767) {
                        var15 = arg0.method3013();
                        var13 = arg0.method3013();
                        var12 = arg0.method3013();
                        var14 = arg0.method3013();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method3013();
                    }
                    int var16 = arg0.method3013();
                    arg2.method1395(var15, var13, var12, var14, client.field944, var16);
                }
            }
            int var17 = arg0.method2903();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method3013();
                    int var20 = arg0.method3013();
                    if (var20 == 32767) {
                        arg2.method1397(var19);
                    } else {
                        int var21 = arg0.method3013();
                        int var22 = arg0.method2903();
                        int var23 = var20 > 0 ? arg0.method2903() : var22;
                        arg2.method1396(var19, client.field944, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1247 = arg0.method3023();
            if (arg2.field1269 == 0) {
                arg2.field1270 = arg2.field1247;
                arg2.field1247 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            int var24 = arg0.method3023();
            class232[] var25 = new class232[] { class232.field3169, class232.field3170, class232.field3165, class232.field3168, class232.field3167, class232.field3166 };
            class232 var26 = (class232) class170.method3644(var25, arg0.method2903());
            boolean var27 = arg0.method2903() == 1;
            int var28 = arg0.method2903();
            int var29 = arg0.field2394;
            if (arg2.field915 != null && arg2.field898 != null) {
                boolean var30 = false;
                if (var26.field3173 && client.method217(arg2.field915)) {
                    var30 = true;
                }
                if (!var30 && client.field1137 == 0 && !arg2.field918) {
                    field1510.field2394 = 0;
                    arg0.method3052(field1510.field2390, 0, var28);
                    field1510.field2394 = 0;
                    String var31 = class266.method4419(class272.method3946(class267.method3760(field1510)));
                    arg2.field1238 = var31.trim();
                    arg2.field1236 = var24 >> 8;
                    arg2.field1237 = var24 & 0xFF;
                    arg2.field1275 = 150;
                    arg2.field1274 = var27;
                    arg2.field1271 = Statics.field312 != arg2 && var26.field3173 && client.field1145 != "" && var31.toLowerCase().indexOf(client.field1145) == -1;
                    int var32;
                    if (var26.field3172) {
                        var32 = var27 ? 91 : 1;
                    } else {
                        var32 = var27 ? 90 : 2;
                    }
                    if (var26.field3171 == -1) {
                        class100.method1553(var32, arg2.field915, var31);
                    } else {
                        class100.method1553(var32, Statics.method1570(var26.field3171) + arg2.field915, var31);
                    }
                }
            }
            arg0.field2394 = var28 + var29;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1256 = arg0.method3023();
            int var33 = arg0.method2908();
            arg2.field1260 = var33 >> 16;
            arg2.field1225 = (var33 & 0xFFFF) + client.field944;
            arg2.field1257 = 0;
            arg2.field1258 = 0;
            if (arg2.field1225 > client.field944) {
                arg2.field1257 = -1;
            }
            if (arg2.field1256 == 65535) {
                arg2.field1256 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1261 = arg0.method2980();
            arg2.field1263 = arg0.method2980();
            arg2.field1272 = arg0.method2980();
            arg2.field1264 = arg0.method2980();
            arg2.field1265 = arg0.method3023() + client.field944;
            arg2.field1266 = arg0.method3023() + client.field944;
            arg2.field1267 = arg0.method3023();
            if (arg2.field904) {
                arg2.field1261 += arg2.field922;
                arg2.field1263 += arg2.field923;
                arg2.field1272 += arg2.field922;
                arg2.field1264 += arg2.field923;
                arg2.field1269 = 0;
            } else {
                arg2.field1261 += arg2.field1228[0];
                arg2.field1263 += arg2.field1234[0];
                arg2.field1272 += arg2.field1228[0];
                arg2.field1264 += arg2.field1234[0];
                arg2.field1269 = 1;
            }
            arg2.field1278 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            field1509[arg1] = arg0.method2980();
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method2980();
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var34 = 0; var34 < 3; var34++) {
                arg2.field910[var34] = arg0.method2911();
            }
        }
        if (!arg2.field904) {
            return;
        }
        if (var4 == 127) {
            arg2.method1079(arg2.field922, arg2.field923);
            return;
        }
        byte var35;
        if (var4 == -1) {
            var35 = field1509[arg1];
        } else {
            var35 = var4;
        }
        arg2.method1078(arg2.field922, arg2.field923, var35);
    }

    @ObfuscatedName("as.w(B)V")
    public static void method469() {
        field1511 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1520[var0] = null;
            field1509[var0] = 1;
        }
    }
}
