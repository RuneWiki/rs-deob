package deob;

@ObfuscatedName("ce")
public class class98 {

    @ObfuscatedName("ce.g")
    public static byte[] field1491 = new byte[2048];

    @ObfuscatedName("ce.y")
    public static byte[] field1492 = new byte[2048];

    @ObfuscatedName("ce.w")
    public static class175[] field1493 = new class175[2048];

    @ObfuscatedName("ce.k")
    public static int field1494 = 0;

    @ObfuscatedName("ce.v")
    public static int[] field1495 = new int[2048];

    @ObfuscatedName("ce.z")
    public static int field1496 = 0;

    @ObfuscatedName("ce.r")
    public static int[] field1499 = new int[2048];

    @ObfuscatedName("ce.u")
    public static int[] field1498 = new int[2048];

    @ObfuscatedName("ce.d")
    public static int[] field1497 = new int[2048];

    @ObfuscatedName("ce.o")
    public static int[] field1500 = new int[2048];

    @ObfuscatedName("ce.l")
    public static int field1501 = 0;

    @ObfuscatedName("ce.h")
    public static int[] field1502 = new int[2048];

    @ObfuscatedName("ce.s")
    public static class175 field1503 = new class175(new byte[5000]);

    public class98() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ik.e(Lfb;I)V")
    public static final void method3903(class181 arg0) {
        arg0.method3152();
        int var1 = client.field1129;
        class76 var2 = Statics.field655 = client.field1099[var1] = new class76();
        var2.field902 = var1;
        int var3 = arg0.method3157(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1261[0] = var5 - Statics.field376;
        var2.field1221 = (var2.field1261[0] << 7) + (var2.method1052() << 6);
        var2.field1262[0] = var6 - Statics.field847;
        var2.field1207 = (var2.field1262[0] << 7) + (var2.method1052() << 6);
        Statics.field424 = var2.field901 = var4;
        if (field1493[var1] != null) {
            var2.method1051(field1493[var1]);
        }
        field1494 = 0;
        field1495[++field1494 - 1] = var1;
        field1491[var1] = 0;
        field1496 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3157(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1498[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1497[var7] = 0;
                field1500[var7] = -1;
                field1499[++field1496 - 1] = var7;
                field1491[var7] = 0;
            }
        }
        arg0.method3158();
    }

    @ObfuscatedName("s.n(Lfb;IB)V")
    public static final void method73(class181 arg0, int arg1) {
        int var2 = arg0.field2381;
        field1501 = 0;
        method1023(arg0);
        for (int var3 = 0; var3 < field1501; var3++) {
            int var4 = field1502[var3];
            class76 var5 = client.field1099[var4];
            int var6 = arg0.method2928();
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method2928() << 8;
            }
            method3426(arg0, var4, var5, var6);
        }
        if (arg0.field2381 - var2 != arg1) {
            throw new RuntimeException(arg0.field2381 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bt.g(Lfb;B)V")
    public static final void method1023(class181 arg0) {
        int var1 = 0;
        arg0.method3152();
        for (int var2 = 0; var2 < field1494; var2++) {
            int var3 = field1495[var2];
            if ((field1491[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1491[var3] = (byte) (field1491[var3] | 0x2);
                } else {
                    int var4 = arg0.method3157(1);
                    if (var4 == 0) {
                        var1 = method2848(arg0);
                        field1491[var3] = (byte) (field1491[var3] | 0x2);
                    } else {
                        method1026(arg0, var3);
                    }
                }
            }
        }
        arg0.method3158();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3152();
        for (int var5 = 0; var5 < field1494; var5++) {
            int var6 = field1495[var5];
            if ((field1491[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1491[var6] = (byte) (field1491[var6] | 0x2);
                } else {
                    int var7 = arg0.method3157(1);
                    if (var7 == 0) {
                        var1 = method2848(arg0);
                        field1491[var6] = (byte) (field1491[var6] | 0x2);
                    } else {
                        method1026(arg0, var6);
                    }
                }
            }
        }
        arg0.method3158();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3152();
        for (int var8 = 0; var8 < field1496; var8++) {
            int var9 = field1499[var8];
            if ((field1491[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1491[var9] = (byte) (field1491[var9] | 0x2);
                } else {
                    int var10 = arg0.method3157(1);
                    if (var10 == 0) {
                        var1 = method2848(arg0);
                        field1491[var9] = (byte) (field1491[var9] | 0x2);
                    } else if (method626(arg0, var9)) {
                        field1491[var9] = (byte) (field1491[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3158();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3152();
        for (int var11 = 0; var11 < field1496; var11++) {
            int var12 = field1499[var11];
            if ((field1491[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1491[var12] = (byte) (field1491[var12] | 0x2);
                } else {
                    int var13 = arg0.method3157(1);
                    if (var13 == 0) {
                        var1 = method2848(arg0);
                        field1491[var12] = (byte) (field1491[var12] | 0x2);
                    } else if (method626(arg0, var12)) {
                        field1491[var12] = (byte) (field1491[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3158();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1494 = 0;
        field1496 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1491[var14] = (byte) (field1491[var14] >> 1);
            class76 var15 = client.field1099[var14];
            if (var15 == null) {
                field1499[++field1496 - 1] = var14;
            } else {
                field1495[++field1494 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("fz.y(Lfb;I)I")
    public static int method2848(class181 arg0) {
        int var1 = arg0.method3157(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3157(5);
        } else if (var1 == 2) {
            var2 = arg0.method3157(8);
        } else {
            var2 = arg0.method3157(11);
        }
        return var2;
    }

    @ObfuscatedName("bt.w(Lfb;II)V")
    public static void method1026(class181 arg0, int arg1) {
        boolean var2 = arg0.method3157(1) == 1;
        if (var2) {
            field1502[++field1501 - 1] = arg1;
        }
        int var3 = arg0.method3157(2);
        class76 var4 = client.field1099[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field903 = false;
            } else if (client.field1129 == arg1) {
                throw new RuntimeException();
            } else {
                field1498[arg1] = (Statics.field847 + var4.field1262[0] >> 13) + (Statics.field376 + var4.field1261[0] >> 13 << 14) + (var4.field901 << 28);
                if (var4.field1206 == -1) {
                    field1497[arg1] = var4.field1217;
                } else {
                    field1497[arg1] = var4.field1206;
                }
                field1500[arg1] = var4.field1232;
                client.field1099[arg1] = null;
                if (arg0.method3157(1) != 0) {
                    method626(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3157(3);
            int var6 = var4.field1261[0];
            int var7 = var4.field1262[0];
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
            if (client.field1129 == arg1 && var4.field1221 < 1536 || var4.field1207 < 1536 || var4.field1221 >= 11776 || var4.field1207 >= 11776) {
                var4.method1075(var6, var7);
                var4.field903 = false;
            } else if (var2) {
                var4.field903 = true;
                var4.field897 = var6;
                var4.field889 = var7;
            } else {
                var4.field903 = false;
                var4.method1054(var6, var7, field1492[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3157(4);
            int var9 = var4.field1261[0];
            int var10 = var4.field1262[0];
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
            if (client.field1129 == arg1 && var4.field1221 < 1536 || var4.field1207 < 1536 || var4.field1221 >= 11776 || var4.field1207 >= 11776) {
                var4.method1075(var9, var10);
                var4.field903 = false;
            } else if (var2) {
                var4.field903 = true;
                var4.field897 = var9;
                var4.field889 = var10;
            } else {
                var4.field903 = false;
                var4.method1054(var9, var10, field1492[arg1]);
            }
        } else {
            int var11 = arg0.method3157(1);
            if (var11 == 0) {
                int var12 = arg0.method3157(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1261[0] + var14;
                int var17 = var4.field1262[0] + var15;
                if (client.field1129 == arg1 && var4.field1221 < 1536 || var4.field1207 < 1536 || var4.field1221 >= 11776 || var4.field1207 >= 11776) {
                    var4.method1075(var16, var17);
                    var4.field903 = false;
                } else if (var2) {
                    var4.field903 = true;
                    var4.field897 = var16;
                    var4.field889 = var17;
                } else {
                    var4.field903 = false;
                    var4.method1054(var16, var17, field1492[arg1]);
                }
                var4.field901 = (byte) (var4.field901 + var13 & 0x3);
                if (client.field1129 == arg1) {
                    Statics.field424 = var4.field901;
                }
            } else {
                int var18 = arg0.method3157(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field376 + var4.field1261[0] + var20 & 0x3FFF) - Statics.field376;
                int var23 = (Statics.field847 + var4.field1262[0] + var21 & 0x3FFF) - Statics.field847;
                if (client.field1129 == arg1 && var4.field1221 < 1536 || var4.field1207 < 1536 || var4.field1221 >= 11776 || var4.field1207 >= 11776) {
                    var4.method1075(var22, var23);
                    var4.field903 = false;
                } else if (var2) {
                    var4.field903 = true;
                    var4.field897 = var22;
                    var4.field889 = var23;
                } else {
                    var4.field903 = false;
                    var4.method1054(var22, var23, field1492[arg1]);
                }
                var4.field901 = (byte) (var4.field901 + var19 & 0x3);
                if (client.field1129 == arg1) {
                    Statics.field424 = var4.field901;
                }
            }
        }
    }

    @ObfuscatedName("ap.k(Lfb;II)Z")
    public static boolean method626(class181 arg0, int arg1) {
        int var2 = arg0.method3157(2);
        if (var2 == 0) {
            if (arg0.method3157(1) != 0) {
                method626(arg0, arg1);
            }
            int var3 = arg0.method3157(13);
            int var4 = arg0.method3157(13);
            boolean var5 = arg0.method3157(1) == 1;
            if (var5) {
                field1502[++field1501 - 1] = arg1;
            }
            if (client.field1099[arg1] != null) {
                throw new RuntimeException();
            }
            class76 var6 = client.field1099[arg1] = new class76();
            var6.field902 = arg1;
            if (field1493[arg1] != null) {
                var6.method1051(field1493[arg1]);
            }
            var6.field1217 = field1497[arg1];
            var6.field1232 = field1500[arg1];
            int var7 = field1498[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1263[0] = field1492[arg1];
            var6.field901 = (byte) var8;
            var6.method1075((var9 << 13) + var3 - Statics.field376, (var10 << 13) + var4 - Statics.field847);
            var6.field903 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3157(2);
            int var12 = field1498[arg1];
            field1498[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3157(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1498[arg1];
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
            field1498[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3157(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1498[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1498[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("gi.v(Lfb;ILbk;IB)V")
    public static final void method3426(class181 arg0, int arg1, class76 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x2) != 0) {
            int var5 = arg0.method2928();
            byte[] var6 = new byte[var5];
            class175 var7 = new class175(var6);
            arg0.method2939(var6, 0, var5);
            field1493[arg1] = var7;
            arg2.method1051(var7);
        }
        if ((arg3 & 0x8) != 0) {
            int var8 = arg0.method3091();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2928();
            client.method4006(arg2, var8, var9);
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1232 = arg0.method3091();
            if (arg2.field1232 == 65535) {
                arg2.field1232 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1219 = arg0.method3113();
            if (arg2.field1219.charAt(0) == '~') {
                arg2.field1219 = arg2.field1219.substring(1);
                Statics.method206(2, arg2.field896, arg2.field1219);
            } else if (Statics.field655 == arg2) {
                Statics.method206(2, arg2.field896, arg2.field1219);
            }
            arg2.field1220 = false;
            arg2.field1223 = 0;
            arg2.field1224 = 0;
            arg2.field1222 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            int var10 = arg0.method2928();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method3046();
                    if (var15 == 32767) {
                        var15 = arg0.method3046();
                        var13 = arg0.method3046();
                        var12 = arg0.method3046();
                        var14 = arg0.method3046();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method3046();
                    }
                    int var16 = arg0.method3046();
                    arg2.method1410(var15, var13, var12, var14, client.field925, var16);
                }
            }
            int var17 = arg0.method2928();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method3046();
                    int var20 = arg0.method3046();
                    if (var20 == 32767) {
                        arg2.method1412(var19);
                    } else {
                        int var21 = arg0.method3046();
                        int var22 = arg0.method2928();
                        int var23 = var20 > 0 ? arg0.method2928() : var22;
                        arg2.method1411(var19, client.field925, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1206 = arg0.method3091();
            if (arg2.field1260 == 0) {
                arg2.field1217 = arg2.field1206;
                arg2.field1206 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var24 = arg0.method3091();
            class232 var25 = (class232) class170.method2298(class232.method1018(), arg0.method2928());
            boolean var26 = arg0.method2928() == 1;
            int var27 = arg0.method2928();
            int var28 = arg0.field2381;
            if (arg2.field896 != null && arg2.field881 != null) {
                boolean var29 = false;
                if (var25.field3153 && client.method163(arg2.field896)) {
                    var29 = true;
                }
                if (!var29 && client.field1132 == 0 && !arg2.field900) {
                    field1503.field2381 = 0;
                    arg0.method2939(field1503.field2376, 0, var27);
                    field1503.field2381 = 0;
                    class175 var30 = field1503;
                    String var34;
                    try {
                        int var31 = var30.method3046();
                        if (var31 > 32767) {
                            var31 = 32767;
                        }
                        byte[] var32 = new byte[var31];
                        var30.field2381 += Statics.field275.method2869(var30.field2376, var30.field2381, var32, 0, var31);
                        String var33 = class268.method3715(var32, 0, var31);
                        var34 = var33;
                    } catch (Exception var45) {
                        var34 = "Cabbage";
                    }
                    String var37 = class266.method4458(class272.method4539(var34));
                    arg2.field1219 = var37.trim();
                    arg2.field1223 = var24 >> 8;
                    arg2.field1224 = var24 & 0xFF;
                    arg2.field1222 = 150;
                    arg2.field1220 = var26;
                    arg2.field1259 = Statics.field655 != arg2 && var25.field3153 && client.field1122 != "" && var37.toLowerCase().indexOf(client.field1122) == -1;
                    int var38;
                    if (var25.field3164) {
                        var38 = var26 ? 91 : 1;
                    } else {
                        var38 = var26 ? 90 : 2;
                    }
                    if (var25.field3159 == -1) {
                        Statics.method206(var38, arg2.field896, var37);
                    } else {
                        int var40 = var25.field3159;
                        String var41 = "<img=" + var40 + ">";
                        Statics.method206(var38, var41 + arg2.field896, var37);
                    }
                }
            }
            arg0.field2381 = var27 + var28;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1234 = arg0.method3091();
            int var42 = arg0.method2933();
            arg2.field1266 = var42 >> 16;
            arg2.field1251 = (var42 & 0xFFFF) + client.field925;
            arg2.field1210 = 0;
            arg2.field1245 = 0;
            if (arg2.field1251 > client.field925) {
                arg2.field1210 = -1;
            }
            if (arg2.field1234 == 65535) {
                arg2.field1234 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1248 = arg0.method2998();
            arg2.field1252 = arg0.method2998();
            arg2.field1249 = arg0.method2998();
            arg2.field1229 = arg0.method2998();
            arg2.field1239 = arg0.method3091() + client.field925;
            arg2.field1253 = arg0.method3091() + client.field925;
            arg2.field1254 = arg0.method3091();
            if (arg2.field903) {
                arg2.field1248 += arg2.field897;
                arg2.field1252 += arg2.field889;
                arg2.field1249 += arg2.field897;
                arg2.field1229 += arg2.field889;
                arg2.field1260 = 0;
            } else {
                arg2.field1248 += arg2.field1261[0];
                arg2.field1252 += arg2.field1262[0];
                arg2.field1249 += arg2.field1261[0];
                arg2.field1229 += arg2.field1262[0];
                arg2.field1260 = 1;
            }
            arg2.field1265 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            field1492[arg1] = arg0.method2998();
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method2998();
        }
        if ((arg3 & 0x400) != 0) {
            for (int var43 = 0; var43 < 3; var43++) {
                arg2.field898[var43] = arg0.method3113();
            }
        }
        if (!arg2.field903) {
            return;
        }
        if (var4 == 127) {
            arg2.method1075(arg2.field897, arg2.field889);
            return;
        }
        byte var44;
        if (var4 == -1) {
            var44 = field1492[arg1];
        } else {
            var44 = var4;
        }
        arg2.method1054(arg2.field897, arg2.field889, var44);
    }

    @ObfuscatedName("ck.z(B)V")
    public static void method1657() {
        field1494 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1493[var0] = null;
            field1492[var0] = 1;
        }
    }
}
