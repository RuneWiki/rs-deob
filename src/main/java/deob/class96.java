package deob;

@ObfuscatedName("ci")
public class class96 {

    @ObfuscatedName("ci.s")
    public static byte[] field1277 = new byte[2048];

    @ObfuscatedName("ci.e")
    public static class186[] field1278 = new class186[2048];

    @ObfuscatedName("ci.r")
    public static class421[] field1279 = new class421[2048];

    @ObfuscatedName("ci.o")
    public static int field1280 = 0;

    @ObfuscatedName("ci.i")
    public static int[] field1281 = new int[2048];

    @ObfuscatedName("ci.w")
    public static int field1287 = 0;

    @ObfuscatedName("ci.v")
    public static int[] field1289 = new int[2048];

    @ObfuscatedName("ci.a")
    public static int[] field1284 = new int[2048];

    @ObfuscatedName("ci.y")
    public static int[] field1285 = new int[2048];

    @ObfuscatedName("ci.u")
    public static int[] field1282 = new int[2048];

    @ObfuscatedName("ci.h")
    public static int field1283 = 0;

    @ObfuscatedName("ci.q")
    public static int[] field1288 = new int[2048];

    @ObfuscatedName("ci.x")
    public static class421 field1276 = new class421(new byte[5000]);

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("py.l(Lpc;IB)V")
    public static final void method7221(class420 arg0, int arg1) {
        int var2 = arg0.field4512;
        field1283 = 0;
        method2736(arg0);
        Statics.method2172(arg0);
        if (arg0.field4512 - var2 != arg1) {
            throw new RuntimeException(arg0.field4512 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ef.s(Lpc;I)V")
    public static final void method2736(class420 arg0) {
        int var1 = 0;
        arg0.method6615();
        for (int var2 = 0; var2 < field1280; var2++) {
            int var3 = field1281[var2];
            if ((field1277[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1277[var3] = (byte) (field1277[var3] | 0x2);
                } else {
                    int var4 = arg0.method6631(1);
                    if (var4 == 0) {
                        var1 = method14(arg0);
                        field1277[var3] = (byte) (field1277[var3] | 0x2);
                    } else {
                        method1039(arg0, var3);
                    }
                }
            }
        }
        arg0.method6636();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method6615();
        for (int var5 = 0; var5 < field1280; var5++) {
            int var6 = field1281[var5];
            if ((field1277[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1277[var6] = (byte) (field1277[var6] | 0x2);
                } else {
                    int var7 = arg0.method6631(1);
                    if (var7 == 0) {
                        var1 = method14(arg0);
                        field1277[var6] = (byte) (field1277[var6] | 0x2);
                    } else {
                        method1039(arg0, var6);
                    }
                }
            }
        }
        arg0.method6636();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method6615();
        for (int var8 = 0; var8 < field1287; var8++) {
            int var9 = field1289[var8];
            if ((field1277[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1277[var9] = (byte) (field1277[var9] | 0x2);
                } else {
                    int var10 = arg0.method6631(1);
                    if (var10 == 0) {
                        var1 = method14(arg0);
                        field1277[var9] = (byte) (field1277[var9] | 0x2);
                    } else if (method198(arg0, var9)) {
                        field1277[var9] = (byte) (field1277[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method6636();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method6615();
        for (int var11 = 0; var11 < field1287; var11++) {
            int var12 = field1289[var11];
            if ((field1277[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1277[var12] = (byte) (field1277[var12] | 0x2);
                } else {
                    int var13 = arg0.method6631(1);
                    if (var13 == 0) {
                        var1 = method14(arg0);
                        field1277[var12] = (byte) (field1277[var12] | 0x2);
                    } else if (method198(arg0, var12)) {
                        field1277[var12] = (byte) (field1277[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method6636();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1280 = 0;
        field1287 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1277[var14] = (byte) (field1277[var14] >> 1);
            class83 var15 = client.field619[var14];
            if (var15 == null) {
                field1289[++field1287 - 1] = var14;
            } else {
                field1281[++field1280 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("r.e(Lpc;I)I")
    public static int method14(class420 arg0) {
        int var1 = arg0.method6631(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method6631(5);
        } else if (var1 == 2) {
            var2 = arg0.method6631(8);
        } else {
            var2 = arg0.method6631(11);
        }
        return var2;
    }

    @ObfuscatedName("bg.r(Lpc;II)V")
    public static void method1039(class420 arg0, int arg1) {
        boolean var2 = arg0.method6631(1) == 1;
        if (var2) {
            field1288[++field1283 - 1] = arg1;
        }
        int var3 = arg0.method6631(2);
        class83 var4 = client.field619[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1068 = false;
            } else if (client.field576 == arg1) {
                throw new RuntimeException();
            } else {
                field1284[arg1] = (Statics.field1467 + var4.field1147[0] >> 13) + (Statics.field161 + var4.field1173[0] >> 13 << 14) + (var4.field1084 << 28);
                if (var4.field1139 == -1) {
                    field1285[arg1] = var4.field1169;
                } else {
                    field1285[arg1] = var4.field1139;
                }
                field1282[arg1] = var4.field1174;
                client.field619[arg1] = null;
                if (arg0.method6631(1) != 0) {
                    method198(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6631(3);
            int var6 = var4.field1173[0];
            int var7 = var4.field1147[0];
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
            if (client.field576 == arg1 && var4.field1161 < 1536 || var4.field1152 < 1536 || var4.field1161 >= 11776 || var4.field1152 >= 11776) {
                var4.method2019(var6, var7);
                var4.field1068 = false;
            } else if (var2) {
                var4.field1068 = true;
                var4.field1093 = var6;
                var4.field1090 = var7;
            } else {
                var4.field1068 = false;
                var4.method2018(var6, var7, field1278[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6631(4);
            int var9 = var4.field1173[0];
            int var10 = var4.field1147[0];
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
            if (client.field576 == arg1 && var4.field1161 < 1536 || var4.field1152 < 1536 || var4.field1161 >= 11776 || var4.field1152 >= 11776) {
                var4.method2019(var9, var10);
                var4.field1068 = false;
            } else if (var2) {
                var4.field1068 = true;
                var4.field1093 = var9;
                var4.field1090 = var10;
            } else {
                var4.field1068 = false;
                var4.method2018(var9, var10, field1278[arg1]);
            }
        } else {
            int var11 = arg0.method6631(1);
            if (var11 == 0) {
                int var12 = arg0.method6631(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1173[0] + var14;
                int var17 = var4.field1147[0] + var15;
                if (client.field576 == arg1 && var4.field1161 < 1536 || var4.field1152 < 1536 || var4.field1161 >= 11776 || var4.field1152 >= 11776) {
                    var4.method2019(var16, var17);
                    var4.field1068 = false;
                } else if (var2) {
                    var4.field1068 = true;
                    var4.field1093 = var16;
                    var4.field1090 = var17;
                } else {
                    var4.field1068 = false;
                    var4.method2018(var16, var17, field1278[arg1]);
                }
                var4.field1084 = (byte) (var4.field1084 + var13 & 0x3);
                if (client.field576 == arg1) {
                    Statics.field325 = var4.field1084;
                }
            } else {
                int var18 = arg0.method6631(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field161 + var4.field1173[0] + var20 & 0x3FFF) - Statics.field161;
                int var23 = (Statics.field1467 + var4.field1147[0] + var21 & 0x3FFF) - Statics.field1467;
                if (client.field576 == arg1 && var4.field1161 < 1536 || var4.field1152 < 1536 || var4.field1161 >= 11776 || var4.field1152 >= 11776) {
                    var4.method2019(var22, var23);
                    var4.field1068 = false;
                } else if (var2) {
                    var4.field1068 = true;
                    var4.field1093 = var22;
                    var4.field1090 = var23;
                } else {
                    var4.field1068 = false;
                    var4.method2018(var22, var23, field1278[arg1]);
                }
                var4.field1084 = (byte) (var4.field1084 + var19 & 0x3);
                if (client.field576 == arg1) {
                    Statics.field325 = var4.field1084;
                }
            }
        }
    }

    @ObfuscatedName("n.o(Lpc;II)Z")
    public static boolean method198(class420 arg0, int arg1) {
        int var2 = arg0.method6631(2);
        if (var2 == 0) {
            if (arg0.method6631(1) != 0) {
                method198(arg0, arg1);
            }
            int var3 = arg0.method6631(13);
            int var4 = arg0.method6631(13);
            boolean var5 = arg0.method6631(1) == 1;
            if (var5) {
                field1288[++field1283 - 1] = arg1;
            }
            if (client.field619[arg1] != null) {
                throw new RuntimeException();
            }
            class83 var6 = client.field619[arg1] = new class83();
            var6.field1088 = arg1;
            if (field1279[arg1] != null) {
                var6.method2009(field1279[arg1]);
            }
            var6.field1169 = field1285[arg1];
            var6.field1174 = field1282[arg1];
            int var7 = field1284[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1175[0] = field1278[arg1];
            var6.field1084 = (byte) var8;
            var6.method2019((var9 << 13) + var3 - Statics.field161, (var10 << 13) + var4 - Statics.field1467);
            var6.field1068 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6631(2);
            int var12 = field1284[arg1];
            field1284[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6631(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1284[arg1];
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
            field1284[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6631(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1284[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1284[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ie.w(I)V")
    public static void method4490() {
        field1280 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1279[var0] = null;
            field1278[var0] = class186.field2136;
        }
    }
}
