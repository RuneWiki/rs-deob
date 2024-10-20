package deob;

@ObfuscatedName("cl")
public class class97 {

    @ObfuscatedName("cl.m")
    public static byte[] field1504 = new byte[2048];

    @ObfuscatedName("cl.g")
    public static byte[] field1505 = new byte[2048];

    @ObfuscatedName("cl.d")
    public static class174[] field1506 = new class174[2048];

    @ObfuscatedName("cl.b")
    public static int field1507 = 0;

    @ObfuscatedName("cl.k")
    public static int[] field1508 = new int[2048];

    @ObfuscatedName("cl.f")
    public static int field1515 = 0;

    @ObfuscatedName("cl.j")
    public static int[] field1509 = new int[2048];

    @ObfuscatedName("cl.q")
    public static int[] field1511 = new int[2048];

    @ObfuscatedName("cl.h")
    public static int[] field1512 = new int[2048];

    @ObfuscatedName("cl.i")
    public static int[] field1513 = new int[2048];

    @ObfuscatedName("cl.s")
    public static int field1516 = 0;

    @ObfuscatedName("cl.n")
    public static int[] field1510 = new int[2048];

    @ObfuscatedName("cl.c")
    public static class174 field1503 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.e(Lfk;B)V")
    public static final void method122(class180 arg0) {
        arg0.method3123();
        int var1 = client.field1046;
        class75 var2 = Statics.field3209 = client.field1041[var1] = new class75();
        var2.field883 = var1;
        int var3 = arg0.method3141(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1283[0] = var5 - Statics.field414;
        var2.field1243 = (var2.field1283[0] << 7) + (var2.method1017() << 6);
        var2.field1284[0] = var6 - Statics.field2117;
        var2.field1229 = (var2.field1284[0] << 7) + (var2.method1017() << 6);
        Statics.field267 = var2.field889 = var4;
        if (field1506[var1] != null) {
            var2.method1044(field1506[var1]);
        }
        field1507 = 0;
        field1508[++field1507 - 1] = var1;
        field1504[var1] = 0;
        field1515 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3141(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1511[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1512[var7] = 0;
                field1513[var7] = -1;
                field1509[++field1515 - 1] = var7;
                field1504[var7] = 0;
            }
        }
        arg0.method3124();
    }

    @ObfuscatedName("ac.o(Lfk;II)V")
    public static final void method546(class180 arg0, int arg1) {
        int var2 = arg0.field2370;
        field1516 = 0;
        int var3 = 0;
        arg0.method3123();
        for (int var4 = 0; var4 < field1507; var4++) {
            int var5 = field1508[var4];
            if ((field1504[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1504[var5] = (byte) (field1504[var5] | 0x2);
                } else {
                    int var6 = arg0.method3141(1);
                    if (var6 == 0) {
                        var3 = method310(arg0);
                        field1504[var5] = (byte) (field1504[var5] | 0x2);
                    } else {
                        Statics.method1607(arg0, var5);
                    }
                }
            }
        }
        arg0.method3124();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3123();
        for (int var7 = 0; var7 < field1507; var7++) {
            int var8 = field1508[var7];
            if ((field1504[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1504[var8] = (byte) (field1504[var8] | 0x2);
                } else {
                    int var9 = arg0.method3141(1);
                    if (var9 == 0) {
                        var3 = method310(arg0);
                        field1504[var8] = (byte) (field1504[var8] | 0x2);
                    } else {
                        Statics.method1607(arg0, var8);
                    }
                }
            }
        }
        arg0.method3124();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3123();
        for (int var10 = 0; var10 < field1515; var10++) {
            int var11 = field1509[var10];
            if ((field1504[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1504[var11] = (byte) (field1504[var11] | 0x2);
                } else {
                    int var12 = arg0.method3141(1);
                    if (var12 == 0) {
                        var3 = method310(arg0);
                        field1504[var11] = (byte) (field1504[var11] | 0x2);
                    } else if (method493(arg0, var11)) {
                        field1504[var11] = (byte) (field1504[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3124();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3123();
        for (int var13 = 0; var13 < field1515; var13++) {
            int var14 = field1509[var13];
            if ((field1504[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1504[var14] = (byte) (field1504[var14] | 0x2);
                } else {
                    int var15 = arg0.method3141(1);
                    if (var15 == 0) {
                        var3 = method310(arg0);
                        field1504[var14] = (byte) (field1504[var14] | 0x2);
                    } else if (method493(arg0, var14)) {
                        field1504[var14] = (byte) (field1504[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3124();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1507 = 0;
        field1515 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1504[var16] = (byte) (field1504[var16] >> 1);
            class75 var17 = client.field1041[var16];
            if (var17 == null) {
                field1509[++field1515 - 1] = var16;
            } else {
                field1508[++field1507 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1516; var18++) {
            int var19 = field1510[var18];
            class75 var20 = client.field1041[var19];
            int var21 = arg0.method2891();
            if ((var21 & 0x1) != 0) {
                var21 += arg0.method2891() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x4) != 0) {
                int var23 = arg0.method2891();
                byte[] var24 = new byte[var23];
                class174 var25 = new class174(var24);
                arg0.method2902(var24, 0, var23);
                field1506[var19] = var25;
                var20.method1044(var25);
            }
            if ((var21 & 0x80) != 0) {
                int var26 = arg0.method2930();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg0.method2891();
                Statics.method978(var20, var26, var27);
            }
            if ((var21 & 0x20) != 0) {
                var20.field1254 = arg0.method2930();
                if (var20.field1254 == 65535) {
                    var20.field1254 = -1;
                }
            }
            if ((var21 & 0x10) != 0) {
                var20.field1241 = arg0.method2899();
                if (var20.field1241.charAt(0) == '~') {
                    var20.field1241 = var20.field1241.substring(1);
                    class99.method3(2, var20.field895, var20.field1241);
                } else if (Statics.field3209 == var20) {
                    class99.method3(2, var20.field895, var20.field1241);
                }
                var20.field1257 = false;
                var20.field1266 = 0;
                var20.field1246 = 0;
                var20.field1240 = 150;
            }
            if ((var21 & 0x40) != 0) {
                int var28 = arg0.method2891();
                if (var28 > 0) {
                    for (int var29 = 0; var29 < var28; var29++) {
                        int var30 = -1;
                        int var31 = -1;
                        int var32 = -1;
                        int var33 = arg0.method2904();
                        if (var33 == 32767) {
                            var33 = arg0.method2904();
                            var31 = arg0.method2904();
                            var30 = arg0.method2904();
                            var32 = arg0.method2904();
                        } else if (var33 == 32766) {
                            var33 = -1;
                        } else {
                            var31 = arg0.method2904();
                        }
                        int var34 = arg0.method2904();
                        var20.method1381(var33, var31, var30, var32, client.field929, var34);
                    }
                }
                int var35 = arg0.method2891();
                if (var35 > 0) {
                    for (int var36 = 0; var36 < var35; var36++) {
                        int var37 = arg0.method2904();
                        int var38 = arg0.method2904();
                        if (var38 == 32767) {
                            var20.method1383(var37);
                        } else {
                            int var39 = arg0.method2904();
                            int var40 = arg0.method2891();
                            int var41 = var38 > 0 ? arg0.method2891() : var40;
                            var20.method1382(var37, client.field929, var38, var39, var40, var41);
                        }
                    }
                }
            }
            if ((var21 & 0x2) != 0) {
                var20.field1256 = arg0.method2930();
                if (var20.field1245 == 0) {
                    var20.field1247 = var20.field1256;
                    var20.field1256 = -1;
                }
            }
            if ((var21 & 0x8) != 0) {
                int var42 = arg0.method2930();
                class231 var43 = (class231) class169.method999(class231.method667(), arg0.method2891());
                boolean var44 = arg0.method2891() == 1;
                int var45 = arg0.method2891();
                int var46 = arg0.field2370;
                if (var20.field895 != null && var20.field881 != null) {
                    boolean var47 = false;
                    if (var43.field3156 && client.method2662(var20.field895)) {
                        var47 = true;
                    }
                    if (!var47 && client.field1001 == 0 && !var20.field901) {
                        field1503.field2370 = 0;
                        arg0.method2902(field1503.field2373, 0, var45);
                        field1503.field2370 = 0;
                        class174 var48 = field1503;
                        String var52;
                        try {
                            int var49 = var48.method2904();
                            if (var49 > 32767) {
                                var49 = 32767;
                            }
                            byte[] var50 = new byte[var49];
                            var48.field2370 += Statics.field3646.method2821(var48.field2373, var48.field2370, var50, 0, var49);
                            String var51 = class267.method1374(var50, 0, var49);
                            var52 = var51;
                        } catch (Exception var60) {
                            var52 = "Cabbage";
                        }
                        String var55 = class265.method4400(class271.method1532(var52));
                        var20.field1241 = var55.trim();
                        var20.field1266 = var42 >> 8;
                        var20.field1246 = var42 & 0xFF;
                        var20.field1240 = 150;
                        var20.field1257 = var44;
                        var20.field1234 = Statics.field3209 != var20 && var43.field3156 && client.field1139 != "" && var55.toLowerCase().indexOf(client.field1139) == -1;
                        int var56;
                        if (var43.field3149) {
                            var56 = var44 ? 91 : 1;
                        } else {
                            var56 = var44 ? 90 : 2;
                        }
                        if (var43.field3157 == -1) {
                            class99.method3(var56, var20.field895, var55);
                        } else {
                            class99.method3(var56, class89.method3740(var43.field3157) + var20.field895, var55);
                        }
                    }
                }
                arg0.field2370 = var45 + var46;
            }
            if ((var21 & 0x1000) != 0) {
                var20.field1265 = arg0.method2930();
                int var57 = arg0.method2896();
                var20.field1275 = var57 >> 16;
                var20.field1268 = (var57 & 0xFFFF) + client.field929;
                var20.field1273 = 0;
                var20.field1267 = 0;
                if (var20.field1268 > client.field929) {
                    var20.field1273 = -1;
                }
                if (var20.field1265 == 65535) {
                    var20.field1265 = -1;
                }
            }
            if ((var21 & 0x400) != 0) {
                var20.field1270 = arg0.method2944();
                var20.field1272 = arg0.method2944();
                var20.field1271 = arg0.method2944();
                var20.field1249 = arg0.method2944();
                var20.field1248 = arg0.method2930() + client.field929;
                var20.field1281 = arg0.method2930() + client.field929;
                var20.field1258 = arg0.method2930();
                if (var20.field904) {
                    var20.field1270 += var20.field905;
                    var20.field1272 += var20.field906;
                    var20.field1271 += var20.field905;
                    var20.field1249 += var20.field906;
                    var20.field1245 = 0;
                } else {
                    var20.field1270 += var20.field1283[0];
                    var20.field1272 += var20.field1284[0];
                    var20.field1271 += var20.field1283[0];
                    var20.field1249 += var20.field1284[0];
                    var20.field1245 = 1;
                }
                var20.field1287 = 0;
            }
            if ((var21 & 0x800) != 0) {
                field1505[var19] = arg0.method2944();
            }
            if ((var21 & 0x100) != 0) {
                var22 = arg0.method2944();
            }
            if ((var21 & 0x200) != 0) {
                for (int var58 = 0; var58 < 3; var58++) {
                    var20.field885[var58] = arg0.method2899();
                }
            }
            if (var20.field904) {
                if (var22 == 127) {
                    var20.method1020(var20.field905, var20.field906);
                } else {
                    byte var59;
                    if (var22 == -1) {
                        var59 = field1505[var19];
                    } else {
                        var59 = var22;
                    }
                    var20.method1033(var20.field905, var20.field906, var59);
                }
            }
        }
        if (arg0.field2370 - var2 != arg1) {
            throw new RuntimeException(arg0.field2370 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ap.m(Lfk;I)I")
    public static int method310(class180 arg0) {
        int var1 = arg0.method3141(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3141(5);
        } else if (var1 == 2) {
            var2 = arg0.method3141(8);
        } else {
            var2 = arg0.method3141(11);
        }
        return var2;
    }

    @ObfuscatedName("ao.d(Lfk;IB)Z")
    public static boolean method493(class180 arg0, int arg1) {
        int var2 = arg0.method3141(2);
        if (var2 == 0) {
            if (arg0.method3141(1) != 0) {
                method493(arg0, arg1);
            }
            int var3 = arg0.method3141(13);
            int var4 = arg0.method3141(13);
            boolean var5 = arg0.method3141(1) == 1;
            if (var5) {
                field1510[++field1516 - 1] = arg1;
            }
            if (client.field1041[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1041[arg1] = new class75();
            var6.field883 = arg1;
            if (field1506[arg1] != null) {
                var6.method1044(field1506[arg1]);
            }
            var6.field1247 = field1512[arg1];
            var6.field1254 = field1513[arg1];
            int var7 = field1511[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1285[0] = field1505[arg1];
            var6.field889 = (byte) var8;
            var6.method1020((var9 << 13) + var3 - Statics.field414, (var10 << 13) + var4 - Statics.field2117);
            var6.field904 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3141(2);
            int var12 = field1511[arg1];
            field1511[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3141(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1511[arg1];
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
            field1511[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3141(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1511[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1511[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("fh.b(I)V")
    public static void method3101() {
        field1507 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1506[var0] = null;
            field1505[var0] = 1;
        }
    }
}
