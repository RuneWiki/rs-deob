package deob;

@ObfuscatedName("cr")
public class class97 {

    @ObfuscatedName("cr.i")
    public static byte[] field1504 = new byte[2048];

    @ObfuscatedName("cr.j")
    public static byte[] field1499 = new byte[2048];

    @ObfuscatedName("cr.f")
    public static class174[] field1498 = new class174[2048];

    @ObfuscatedName("cr.m")
    public static int field1500 = 0;

    @ObfuscatedName("cr.c")
    public static int[] field1502 = new int[2048];

    @ObfuscatedName("cr.z")
    public static int field1503 = 0;

    @ObfuscatedName("cr.h")
    public static int[] field1512 = new int[2048];

    @ObfuscatedName("cr.g")
    public static int[] field1505 = new int[2048];

    @ObfuscatedName("cr.e")
    public static int[] field1506 = new int[2048];

    @ObfuscatedName("cr.o")
    public static int[] field1496 = new int[2048];

    @ObfuscatedName("cr.x")
    public static int field1508 = 0;

    @ObfuscatedName("cr.a")
    public static int[] field1509 = new int[2048];

    @ObfuscatedName("cr.y")
    public static class174 field1510 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.n(Lfe;I)V")
    public static final void method3(class180 arg0) {
        arg0.method3149();
        int var1 = client.field1037;
        class75 var2 = Statics.field2350 = client.field1036[var1] = new class75();
        var2.field893 = var1;
        int var3 = arg0.method3150(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1282[0] = var5 - Statics.field749;
        var2.field1234 = (var2.field1282[0] << 7) + (var2.method1024() << 6);
        var2.field1283[0] = var6 - Statics.field357;
        var2.field1276 = (var2.field1283[0] << 7) + (var2.method1024() << 6);
        Statics.field1449 = var2.field892 = var4;
        if (field1498[var1] != null) {
            var2.method1022(field1498[var1]);
        }
        field1500 = 0;
        field1502[++field1500 - 1] = var1;
        field1504[var1] = 0;
        field1503 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3150(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1505[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1506[var7] = 0;
                field1496[var7] = -1;
                field1512[++field1503 - 1] = var7;
                field1504[var7] = 0;
            }
        }
        arg0.method3151();
    }

    @ObfuscatedName("be.p(Lfe;B)I")
    public static int method975(class180 arg0) {
        int var1 = arg0.method3150(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3150(5);
        } else if (var1 == 2) {
            var2 = arg0.method3150(8);
        } else {
            var2 = arg0.method3150(11);
        }
        return var2;
    }

    @ObfuscatedName("l.i(Lfe;II)V")
    public static void method161(class180 arg0, int arg1) {
        boolean var2 = arg0.method3150(1) == 1;
        if (var2) {
            field1509[++field1508 - 1] = arg1;
        }
        int var3 = arg0.method3150(2);
        class75 var4 = client.field1036[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field894 = false;
            } else if (client.field1037 == arg1) {
                throw new RuntimeException();
            } else {
                field1505[arg1] = (Statics.field357 + var4.field1283[0] >> 13) + (Statics.field749 + var4.field1282[0] >> 13 << 14) + (var4.field892 << 28);
                if (var4.field1255 == -1) {
                    field1506[arg1] = var4.field1253;
                } else {
                    field1506[arg1] = var4.field1255;
                }
                field1496[arg1] = var4.field1285;
                client.field1036[arg1] = null;
                if (arg0.method3150(1) != 0) {
                    method1563(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3150(3);
            int var6 = var4.field1282[0];
            int var7 = var4.field1283[0];
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
            if (client.field1037 == arg1 && var4.field1234 < 1536 || var4.field1276 < 1536 || var4.field1234 >= 11776 || var4.field1276 >= 11776) {
                var4.method1036(var6, var7);
                var4.field894 = false;
            } else if (var2) {
                var4.field894 = true;
                var4.field895 = var6;
                var4.field876 = var7;
            } else {
                var4.field894 = false;
                var4.method1009(var6, var7, field1499[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3150(4);
            int var9 = var4.field1282[0];
            int var10 = var4.field1283[0];
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
            if (client.field1037 == arg1 && var4.field1234 < 1536 || var4.field1276 < 1536 || var4.field1234 >= 11776 || var4.field1276 >= 11776) {
                var4.method1036(var9, var10);
                var4.field894 = false;
            } else if (var2) {
                var4.field894 = true;
                var4.field895 = var9;
                var4.field876 = var10;
            } else {
                var4.field894 = false;
                var4.method1009(var9, var10, field1499[arg1]);
            }
        } else {
            int var11 = arg0.method3150(1);
            if (var11 == 0) {
                int var12 = arg0.method3150(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1282[0] + var14;
                int var17 = var4.field1283[0] + var15;
                if (client.field1037 == arg1 && var4.field1234 < 1536 || var4.field1276 < 1536 || var4.field1234 >= 11776 || var4.field1276 >= 11776) {
                    var4.method1036(var16, var17);
                    var4.field894 = false;
                } else if (var2) {
                    var4.field894 = true;
                    var4.field895 = var16;
                    var4.field876 = var17;
                } else {
                    var4.field894 = false;
                    var4.method1009(var16, var17, field1499[arg1]);
                }
                var4.field892 = (byte) (var4.field892 + var13 & 0x3);
                if (client.field1037 == arg1) {
                    Statics.field1449 = var4.field892;
                }
            } else {
                int var18 = arg0.method3150(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field749 + var4.field1282[0] + var20 & 0x3FFF) - Statics.field749;
                int var23 = (Statics.field357 + var4.field1283[0] + var21 & 0x3FFF) - Statics.field357;
                if (client.field1037 == arg1 && var4.field1234 < 1536 || var4.field1276 < 1536 || var4.field1234 >= 11776 || var4.field1276 >= 11776) {
                    var4.method1036(var22, var23);
                    var4.field894 = false;
                } else if (var2) {
                    var4.field894 = true;
                    var4.field895 = var22;
                    var4.field876 = var23;
                } else {
                    var4.field894 = false;
                    var4.method1009(var22, var23, field1499[arg1]);
                }
                var4.field892 = (byte) (var4.field892 + var19 & 0x3);
                if (client.field1037 == arg1) {
                    Statics.field1449 = var4.field892;
                }
            }
        }
    }

    @ObfuscatedName("cn.j(Lfe;II)Z")
    public static boolean method1563(class180 arg0, int arg1) {
        int var2 = arg0.method3150(2);
        if (var2 == 0) {
            if (arg0.method3150(1) != 0) {
                method1563(arg0, arg1);
            }
            int var3 = arg0.method3150(13);
            int var4 = arg0.method3150(13);
            boolean var5 = arg0.method3150(1) == 1;
            if (var5) {
                field1509[++field1508 - 1] = arg1;
            }
            if (client.field1036[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1036[arg1] = new class75();
            var6.field893 = arg1;
            if (field1498[arg1] != null) {
                var6.method1022(field1498[arg1]);
            }
            var6.field1253 = field1506[arg1];
            var6.field1285 = field1496[arg1];
            int var7 = field1505[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1284[0] = field1499[arg1];
            var6.field892 = (byte) var8;
            var6.method1036((var9 << 13) + var3 - Statics.field749, (var10 << 13) + var4 - Statics.field357);
            var6.field894 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3150(2);
            int var12 = field1505[arg1];
            field1505[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3150(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1505[arg1];
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
            field1505[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3150(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1505[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1505[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}
