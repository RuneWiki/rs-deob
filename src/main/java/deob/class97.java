package deob;

@ObfuscatedName("ch")
public class class97 {

    @ObfuscatedName("ch.x")
    public static byte[] field1507 = new byte[2048];

    @ObfuscatedName("ch.k")
    public static byte[] field1515 = new byte[2048];

    @ObfuscatedName("ch.f")
    public static class177[] field1509 = new class177[2048];

    @ObfuscatedName("ch.i")
    public static int field1510 = 0;

    @ObfuscatedName("ch.j")
    public static int[] field1511 = new int[2048];

    @ObfuscatedName("ch.m")
    public static int field1512 = 0;

    @ObfuscatedName("ch.u")
    public static int[] field1518 = new int[2048];

    @ObfuscatedName("ch.r")
    public static int[] field1506 = new int[2048];

    @ObfuscatedName("ch.v")
    public static int[] field1519 = new int[2048];

    @ObfuscatedName("ch.h")
    public static int[] field1516 = new int[2048];

    @ObfuscatedName("ch.a")
    public static int field1517 = 0;

    @ObfuscatedName("ch.p")
    public static int[] field1508 = new int[2048];

    @ObfuscatedName("ch.q")
    public static class177 field1514 = new class177(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.o(Lgb;I)I")
    public static int method994(class183 arg0) {
        int var1 = arg0.method3118(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3118(5);
        } else if (var1 == 2) {
            var2 = arg0.method3118(8);
        } else {
            var2 = arg0.method3118(11);
        }
        return var2;
    }

    @ObfuscatedName("ct.x(Lgb;II)V")
    public static void method1562(class183 arg0, int arg1) {
        boolean var2 = arg0.method3118(1) == 1;
        if (var2) {
            field1508[++field1517 - 1] = arg1;
        }
        int var3 = arg0.method3118(2);
        class75 var4 = client.field1048[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field917 = false;
            } else if (client.field1049 == arg1) {
                throw new RuntimeException();
            } else {
                field1506[arg1] = (Statics.field2461 + var4.field1291[0] >> 13) + (Statics.field353 + var4.field1255[0] >> 13 << 14) + (var4.field896 << 28);
                if (var4.field1263 == -1) {
                    field1519[arg1] = var4.field1286;
                } else {
                    field1519[arg1] = var4.field1263;
                }
                field1516[arg1] = var4.field1261;
                client.field1048[arg1] = null;
                if (arg0.method3118(1) != 0) {
                    method986(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3118(3);
            int var6 = var4.field1255[0];
            int var7 = var4.field1291[0];
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
            if (client.field1049 == arg1 && var4.field1264 < 1536 || var4.field1236 < 1536 || var4.field1264 >= 11776 || var4.field1236 >= 11776) {
                var4.method1034(var6, var7);
                var4.field917 = false;
            } else if (var2) {
                var4.field917 = true;
                var4.field918 = var6;
                var4.field919 = var7;
            } else {
                var4.field917 = false;
                var4.method1018(var6, var7, field1515[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3118(4);
            int var9 = var4.field1255[0];
            int var10 = var4.field1291[0];
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
            if (client.field1049 == arg1 && var4.field1264 < 1536 || var4.field1236 < 1536 || var4.field1264 >= 11776 || var4.field1236 >= 11776) {
                var4.method1034(var9, var10);
                var4.field917 = false;
            } else if (var2) {
                var4.field917 = true;
                var4.field918 = var9;
                var4.field919 = var10;
            } else {
                var4.field917 = false;
                var4.method1018(var9, var10, field1515[arg1]);
            }
        } else {
            int var11 = arg0.method3118(1);
            if (var11 == 0) {
                int var12 = arg0.method3118(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1255[0] + var14;
                int var17 = var4.field1291[0] + var15;
                if (client.field1049 == arg1 && var4.field1264 < 1536 || var4.field1236 < 1536 || var4.field1264 >= 11776 || var4.field1236 >= 11776) {
                    var4.method1034(var16, var17);
                    var4.field917 = false;
                } else if (var2) {
                    var4.field917 = true;
                    var4.field918 = var16;
                    var4.field919 = var17;
                } else {
                    var4.field917 = false;
                    var4.method1018(var16, var17, field1515[arg1]);
                }
                var4.field896 = (byte) (var4.field896 + var13 & 0x3);
                if (client.field1049 == arg1) {
                    Statics.field861 = var4.field896;
                }
            } else {
                int var18 = arg0.method3118(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field353 + var4.field1255[0] + var20 & 0x3FFF) - Statics.field353;
                int var23 = (Statics.field2461 + var4.field1291[0] + var21 & 0x3FFF) - Statics.field2461;
                if (client.field1049 == arg1 && var4.field1264 < 1536 || var4.field1236 < 1536 || var4.field1264 >= 11776 || var4.field1236 >= 11776) {
                    var4.method1034(var22, var23);
                    var4.field917 = false;
                } else if (var2) {
                    var4.field917 = true;
                    var4.field918 = var22;
                    var4.field919 = var23;
                } else {
                    var4.field917 = false;
                    var4.method1018(var22, var23, field1515[arg1]);
                }
                var4.field896 = (byte) (var4.field896 + var19 & 0x3);
                if (client.field1049 == arg1) {
                    Statics.field861 = var4.field896;
                }
            }
        }
    }

    @ObfuscatedName("bs.k(Lgb;II)Z")
    public static boolean method986(class183 arg0, int arg1) {
        int var2 = arg0.method3118(2);
        if (var2 == 0) {
            if (arg0.method3118(1) != 0) {
                method986(arg0, arg1);
            }
            int var3 = arg0.method3118(13);
            int var4 = arg0.method3118(13);
            boolean var5 = arg0.method3118(1) == 1;
            if (var5) {
                field1508[++field1517 - 1] = arg1;
            }
            if (client.field1048[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1048[arg1] = new class75();
            var6.field916 = arg1;
            if (field1509[arg1] != null) {
                var6.method1015(field1509[arg1]);
            }
            var6.field1286 = field1519[arg1];
            var6.field1261 = field1516[arg1];
            int var7 = field1506[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1259[0] = field1515[arg1];
            var6.field896 = (byte) var8;
            var6.method1034((var9 << 13) + var3 - Statics.field353, (var10 << 13) + var4 - Statics.field2461);
            var6.field917 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3118(2);
            int var12 = field1506[arg1];
            field1506[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3118(5);
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
            int var20 = arg0.method3118(18);
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
}
