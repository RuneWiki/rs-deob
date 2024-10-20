package deob;

@ObfuscatedName("cm")
public class class97 {

    @ObfuscatedName("cm.u")
    public static byte[] field1485 = new byte[2048];

    @ObfuscatedName("cm.q")
    public static byte[] field1486 = new byte[2048];

    @ObfuscatedName("cm.g")
    public static class174[] field1487 = new class174[2048];

    @ObfuscatedName("cm.v")
    public static int field1490 = 0;

    @ObfuscatedName("cm.t")
    public static int[] field1497 = new int[2048];

    @ObfuscatedName("cm.p")
    public static int field1500 = 0;

    @ObfuscatedName("cm.l")
    public static int[] field1491 = new int[2048];

    @ObfuscatedName("cm.a")
    public static int[] field1492 = new int[2048];

    @ObfuscatedName("cm.k")
    public static int[] field1493 = new int[2048];

    @ObfuscatedName("cm.r")
    public static int[] field1494 = new int[2048];

    @ObfuscatedName("cm.b")
    public static int field1488 = 0;

    @ObfuscatedName("cm.x")
    public static int[] field1496 = new int[2048];

    @ObfuscatedName("cm.o")
    public static class174 field1484 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.i(Lfs;I)V")
    public static final void method1034(class180 arg0) {
        arg0.method3185();
        int var1 = client.field1012;
        class75 var2 = Statics.field308 = client.field1032[var1] = new class75();
        var2.field876 = var1;
        int var3 = arg0.method3186(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1254[0] = var5 - Statics.field2304;
        var2.field1247 = (var2.field1254[0] << 7) + (var2.method1052() << 6);
        var2.field1255[0] = var6 - Statics.field2147;
        var2.field1200 = (var2.field1255[0] << 7) + (var2.method1052() << 6);
        Statics.field3606 = var2.field875 = var4;
        if (field1487[var1] != null) {
            var2.method1051(field1487[var1]);
        }
        field1490 = 0;
        field1497[++field1490 - 1] = var1;
        field1485[var1] = 0;
        field1500 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3186(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1492[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1493[var7] = 0;
                field1494[var7] = -1;
                field1491[++field1500 - 1] = var7;
                field1485[var7] = 0;
            }
        }
        arg0.method3182();
    }

    @ObfuscatedName("bn.h(Lfs;I)V")
    public static final void method988(class180 arg0) {
        int var1 = 0;
        arg0.method3185();
        for (int var2 = 0; var2 < field1490; var2++) {
            int var3 = field1497[var2];
            if ((field1485[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1485[var3] = (byte) (field1485[var3] | 0x2);
                } else {
                    int var4 = arg0.method3186(1);
                    if (var4 == 0) {
                        var1 = method4387(arg0);
                        field1485[var3] = (byte) (field1485[var3] | 0x2);
                    } else {
                        method4338(arg0, var3);
                    }
                }
            }
        }
        arg0.method3182();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3185();
        for (int var5 = 0; var5 < field1490; var5++) {
            int var6 = field1497[var5];
            if ((field1485[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1485[var6] = (byte) (field1485[var6] | 0x2);
                } else {
                    int var7 = arg0.method3186(1);
                    if (var7 == 0) {
                        var1 = method4387(arg0);
                        field1485[var6] = (byte) (field1485[var6] | 0x2);
                    } else {
                        method4338(arg0, var6);
                    }
                }
            }
        }
        arg0.method3182();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3185();
        for (int var8 = 0; var8 < field1500; var8++) {
            int var9 = field1491[var8];
            if ((field1485[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1485[var9] = (byte) (field1485[var9] | 0x2);
                } else {
                    int var10 = arg0.method3186(1);
                    if (var10 == 0) {
                        var1 = method4387(arg0);
                        field1485[var9] = (byte) (field1485[var9] | 0x2);
                    } else if (method1075(arg0, var9)) {
                        field1485[var9] = (byte) (field1485[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3182();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3185();
        for (int var11 = 0; var11 < field1500; var11++) {
            int var12 = field1491[var11];
            if ((field1485[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1485[var12] = (byte) (field1485[var12] | 0x2);
                } else {
                    int var13 = arg0.method3186(1);
                    if (var13 == 0) {
                        var1 = method4387(arg0);
                        field1485[var12] = (byte) (field1485[var12] | 0x2);
                    } else if (method1075(arg0, var12)) {
                        field1485[var12] = (byte) (field1485[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3182();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1490 = 0;
        field1500 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1485[var14] = (byte) (field1485[var14] >> 1);
            class75 var15 = client.field1032[var14];
            if (var15 == null) {
                field1491[++field1500 - 1] = var14;
            } else {
                field1497[++field1490 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ip.u(Lfs;I)I")
    public static int method4387(class180 arg0) {
        int var1 = arg0.method3186(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3186(5);
        } else if (var1 == 2) {
            var2 = arg0.method3186(8);
        } else {
            var2 = arg0.method3186(11);
        }
        return var2;
    }

    @ObfuscatedName("ii.q(Lfs;IB)V")
    public static void method4338(class180 arg0, int arg1) {
        boolean var2 = arg0.method3186(1) == 1;
        if (var2) {
            field1496[++field1488 - 1] = arg1;
        }
        int var3 = arg0.method3186(2);
        class75 var4 = client.field1032[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field877 = false;
            } else if (client.field1012 == arg1) {
                throw new RuntimeException();
            } else {
                field1492[arg1] = (Statics.field2147 + var4.field1255[0] >> 13) + (Statics.field2304 + var4.field1254[0] >> 13 << 14) + (var4.field875 << 28);
                if (var4.field1231 == -1) {
                    field1493[arg1] = var4.field1248;
                } else {
                    field1493[arg1] = var4.field1231;
                }
                field1494[arg1] = var4.field1219;
                client.field1032[arg1] = null;
                if (arg0.method3186(1) != 0) {
                    method1075(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3186(3);
            int var6 = var4.field1254[0];
            int var7 = var4.field1255[0];
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
            if (client.field1012 == arg1 && var4.field1247 < 1536 || var4.field1200 < 1536 || var4.field1247 >= 11776 || var4.field1200 >= 11776) {
                var4.method1055(var6, var7);
                var4.field877 = false;
            } else if (var2) {
                var4.field877 = true;
                var4.field878 = var6;
                var4.field862 = var7;
            } else {
                var4.field877 = false;
                var4.method1054(var6, var7, field1486[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3186(4);
            int var9 = var4.field1254[0];
            int var10 = var4.field1255[0];
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
            if (client.field1012 == arg1 && var4.field1247 < 1536 || var4.field1200 < 1536 || var4.field1247 >= 11776 || var4.field1200 >= 11776) {
                var4.method1055(var9, var10);
                var4.field877 = false;
            } else if (var2) {
                var4.field877 = true;
                var4.field878 = var9;
                var4.field862 = var10;
            } else {
                var4.field877 = false;
                var4.method1054(var9, var10, field1486[arg1]);
            }
        } else {
            int var11 = arg0.method3186(1);
            if (var11 == 0) {
                int var12 = arg0.method3186(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1254[0] + var14;
                int var17 = var4.field1255[0] + var15;
                if (client.field1012 == arg1 && var4.field1247 < 1536 || var4.field1200 < 1536 || var4.field1247 >= 11776 || var4.field1200 >= 11776) {
                    var4.method1055(var16, var17);
                    var4.field877 = false;
                } else if (var2) {
                    var4.field877 = true;
                    var4.field878 = var16;
                    var4.field862 = var17;
                } else {
                    var4.field877 = false;
                    var4.method1054(var16, var17, field1486[arg1]);
                }
                var4.field875 = (byte) (var4.field875 + var13 & 0x3);
                if (client.field1012 == arg1) {
                    Statics.field3606 = var4.field875;
                }
            } else {
                int var18 = arg0.method3186(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2304 + var4.field1254[0] + var20 & 0x3FFF) - Statics.field2304;
                int var23 = (Statics.field2147 + var4.field1255[0] + var21 & 0x3FFF) - Statics.field2147;
                if (client.field1012 == arg1 && var4.field1247 < 1536 || var4.field1200 < 1536 || var4.field1247 >= 11776 || var4.field1200 >= 11776) {
                    var4.method1055(var22, var23);
                    var4.field877 = false;
                } else if (var2) {
                    var4.field877 = true;
                    var4.field878 = var22;
                    var4.field862 = var23;
                } else {
                    var4.field877 = false;
                    var4.method1054(var22, var23, field1486[arg1]);
                }
                var4.field875 = (byte) (var4.field875 + var19 & 0x3);
                if (client.field1012 == arg1) {
                    Statics.field3606 = var4.field875;
                }
            }
        }
    }

    @ObfuscatedName("bj.g(Lfs;II)Z")
    public static boolean method1075(class180 arg0, int arg1) {
        int var2 = arg0.method3186(2);
        if (var2 == 0) {
            if (arg0.method3186(1) != 0) {
                method1075(arg0, arg1);
            }
            int var3 = arg0.method3186(13);
            int var4 = arg0.method3186(13);
            boolean var5 = arg0.method3186(1) == 1;
            if (var5) {
                field1496[++field1488 - 1] = arg1;
            }
            if (client.field1032[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1032[arg1] = new class75();
            var6.field876 = arg1;
            if (field1487[arg1] != null) {
                var6.method1051(field1487[arg1]);
            }
            var6.field1248 = field1493[arg1];
            var6.field1219 = field1494[arg1];
            int var7 = field1492[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1256[0] = field1486[arg1];
            var6.field875 = (byte) var8;
            var6.method1055((var9 << 13) + var3 - Statics.field2304, (var10 << 13) + var4 - Statics.field2147);
            var6.field877 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3186(2);
            int var12 = field1492[arg1];
            field1492[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3186(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1492[arg1];
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
            field1492[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3186(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1492[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1492[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
