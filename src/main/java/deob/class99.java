package deob;

@ObfuscatedName("ck")
public class class99 {

    @ObfuscatedName("ck.s")
    public static byte[] field1286 = new byte[2048];

    @ObfuscatedName("ck.t")
    public static byte[] field1285 = new byte[2048];

    @ObfuscatedName("ck.i")
    public static class310[] field1278 = new class310[2048];

    @ObfuscatedName("ck.o")
    public static int field1279 = 0;

    @ObfuscatedName("ck.x")
    public static int[] field1282 = new int[2048];

    @ObfuscatedName("ck.w")
    public static int field1281 = 0;

    @ObfuscatedName("ck.g")
    public static int[] field1276 = new int[2048];

    @ObfuscatedName("ck.m")
    public static int[] field1283 = new int[2048];

    @ObfuscatedName("ck.n")
    public static int[] field1284 = new int[2048];

    @ObfuscatedName("ck.d")
    public static int[] field1289 = new int[2048];

    @ObfuscatedName("ck.h")
    public static int field1275 = 0;

    @ObfuscatedName("ck.a")
    public static int[] field1287 = new int[2048];

    @ObfuscatedName("ck.q")
    public static class310 field1288 = new class310(new byte[5000]);

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ju.z(Lky;B)V")
    public static final void method4444(class309 arg0) {
        arg0.method5154();
        int var1 = client.field794;
        class76 var2 = Statics.field141 = client.field861[var1] = new class76();
        var2.field658 = var1;
        int var3 = arg0.method5135(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1031[0] = var5 - Statics.field348;
        var2.field995 = (var2.field1031[0] << 7) + (var2.method1140() << 6);
        var2.field1029[0] = var6 - Statics.field263;
        var2.field1024 = (var2.field1029[0] << 7) + (var2.method1140() << 6);
        Statics.field2544 = var2.field657 = var4;
        if (field1278[var1] != null) {
            var2.method1145(field1278[var1]);
        }
        field1279 = 0;
        field1282[++field1279 - 1] = var1;
        field1286[var1] = 0;
        field1281 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method5135(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1283[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1284[var7] = 0;
                field1289[var7] = -1;
                field1276[++field1281 - 1] = var7;
                field1286[var7] = 0;
            }
        }
        arg0.method5145();
    }

    @ObfuscatedName("s.k(Lky;IB)V")
    public static final void method18(class309 arg0, int arg1) {
        int var2 = arg0.field3734;
        field1275 = 0;
        int var3 = 0;
        arg0.method5154();
        for (int var4 = 0; var4 < field1279; var4++) {
            int var5 = field1282[var4];
            if ((field1286[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1286[var5] = (byte) (field1286[var5] | 0x2);
                } else {
                    int var6 = arg0.method5135(1);
                    if (var6 == 0) {
                        var3 = method1042(arg0);
                        field1286[var5] = (byte) (field1286[var5] | 0x2);
                    } else {
                        method3784(arg0, var5);
                    }
                }
            }
        }
        arg0.method5145();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5154();
        for (int var7 = 0; var7 < field1279; var7++) {
            int var8 = field1282[var7];
            if ((field1286[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1286[var8] = (byte) (field1286[var8] | 0x2);
                } else {
                    int var9 = arg0.method5135(1);
                    if (var9 == 0) {
                        var3 = method1042(arg0);
                        field1286[var8] = (byte) (field1286[var8] | 0x2);
                    } else {
                        method3784(arg0, var8);
                    }
                }
            }
        }
        arg0.method5145();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5154();
        for (int var10 = 0; var10 < field1281; var10++) {
            int var11 = field1276[var10];
            if ((field1286[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1286[var11] = (byte) (field1286[var11] | 0x2);
                } else {
                    int var12 = arg0.method5135(1);
                    if (var12 == 0) {
                        var3 = method1042(arg0);
                        field1286[var11] = (byte) (field1286[var11] | 0x2);
                    } else if (method3301(arg0, var11)) {
                        field1286[var11] = (byte) (field1286[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method5145();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method5154();
        for (int var13 = 0; var13 < field1281; var13++) {
            int var14 = field1276[var13];
            if ((field1286[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1286[var14] = (byte) (field1286[var14] | 0x2);
                } else {
                    int var15 = arg0.method5135(1);
                    if (var15 == 0) {
                        var3 = method1042(arg0);
                        field1286[var14] = (byte) (field1286[var14] | 0x2);
                    } else if (method3301(arg0, var14)) {
                        field1286[var14] = (byte) (field1286[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method5145();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1279 = 0;
        field1281 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1286[var16] = (byte) (field1286[var16] >> 1);
            class76 var17 = client.field861[var16];
            if (var17 == null) {
                field1276[++field1281 - 1] = var16;
            } else {
                field1282[++field1279 - 1] = var16;
            }
        }
        method200(arg0);
        if (arg0.field3734 - var2 != arg1) {
            throw new RuntimeException(arg0.field3734 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bu.s(Lky;S)I")
    public static int method1042(class309 arg0) {
        int var1 = arg0.method5135(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method5135(5);
        } else if (var1 == 2) {
            var2 = arg0.method5135(8);
        } else {
            var2 = arg0.method5135(11);
        }
        return var2;
    }

    @ObfuscatedName("hu.t(Lky;II)V")
    public static void method3784(class309 arg0, int arg1) {
        boolean var2 = arg0.method5135(1) == 1;
        if (var2) {
            field1287[++field1275 - 1] = arg1;
        }
        int var3 = arg0.method5135(2);
        class76 var4 = client.field861[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field661 = false;
            } else if (client.field794 == arg1) {
                throw new RuntimeException();
            } else {
                field1283[arg1] = (Statics.field263 + var4.field1029[0] >> 13) + (Statics.field348 + var4.field1031[0] >> 13 << 14) + (var4.field657 << 28);
                if (var4.field1001 == -1) {
                    field1284[arg1] = var4.field1032;
                } else {
                    field1284[arg1] = var4.field1001;
                }
                field1289[arg1] = var4.field999;
                client.field861[arg1] = null;
                if (arg0.method5135(1) != 0) {
                    method3301(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method5135(3);
            int var6 = var4.field1031[0];
            int var7 = var4.field1029[0];
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
            if (client.field794 == arg1 && var4.field995 < 1536 || var4.field1024 < 1536 || var4.field995 >= 11776 || var4.field1024 >= 11776) {
                var4.method1135(var6, var7);
                var4.field661 = false;
            } else if (var2) {
                var4.field661 = true;
                var4.field662 = var6;
                var4.field663 = var7;
            } else {
                var4.field661 = false;
                var4.method1142(var6, var7, field1285[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method5135(4);
            int var9 = var4.field1031[0];
            int var10 = var4.field1029[0];
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
            if (client.field794 == arg1 && var4.field995 < 1536 || var4.field1024 < 1536 || var4.field995 >= 11776 || var4.field1024 >= 11776) {
                var4.method1135(var9, var10);
                var4.field661 = false;
            } else if (var2) {
                var4.field661 = true;
                var4.field662 = var9;
                var4.field663 = var10;
            } else {
                var4.field661 = false;
                var4.method1142(var9, var10, field1285[arg1]);
            }
        } else {
            int var11 = arg0.method5135(1);
            if (var11 == 0) {
                int var12 = arg0.method5135(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1031[0] + var14;
                int var17 = var4.field1029[0] + var15;
                if (client.field794 == arg1 && var4.field995 < 1536 || var4.field1024 < 1536 || var4.field995 >= 11776 || var4.field1024 >= 11776) {
                    var4.method1135(var16, var17);
                    var4.field661 = false;
                } else if (var2) {
                    var4.field661 = true;
                    var4.field662 = var16;
                    var4.field663 = var17;
                } else {
                    var4.field661 = false;
                    var4.method1142(var16, var17, field1285[arg1]);
                }
                var4.field657 = (byte) (var4.field657 + var13 & 0x3);
                if (client.field794 == arg1) {
                    Statics.field2544 = var4.field657;
                }
            } else {
                int var18 = arg0.method5135(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field348 + var4.field1031[0] + var20 & 0x3FFF) - Statics.field348;
                int var23 = (Statics.field263 + var4.field1029[0] + var21 & 0x3FFF) - Statics.field263;
                if (client.field794 == arg1 && var4.field995 < 1536 || var4.field1024 < 1536 || var4.field995 >= 11776 || var4.field1024 >= 11776) {
                    var4.method1135(var22, var23);
                    var4.field661 = false;
                } else if (var2) {
                    var4.field661 = true;
                    var4.field662 = var22;
                    var4.field663 = var23;
                } else {
                    var4.field661 = false;
                    var4.method1142(var22, var23, field1285[arg1]);
                }
                var4.field657 = (byte) (var4.field657 + var19 & 0x3);
                if (client.field794 == arg1) {
                    Statics.field2544 = var4.field657;
                }
            }
        }
    }

    @ObfuscatedName("fw.i(Lky;IB)Z")
    public static boolean method3301(class309 arg0, int arg1) {
        int var2 = arg0.method5135(2);
        if (var2 == 0) {
            if (arg0.method5135(1) != 0) {
                method3301(arg0, arg1);
            }
            int var3 = arg0.method5135(13);
            int var4 = arg0.method5135(13);
            boolean var5 = arg0.method5135(1) == 1;
            if (var5) {
                field1287[++field1275 - 1] = arg1;
            }
            if (client.field861[arg1] != null) {
                throw new RuntimeException();
            }
            class76 var6 = client.field861[arg1] = new class76();
            var6.field658 = arg1;
            if (field1278[arg1] != null) {
                var6.method1145(field1278[arg1]);
            }
            var6.field1032 = field1284[arg1];
            var6.field999 = field1289[arg1];
            int var7 = field1283[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1013[0] = field1285[arg1];
            var6.field657 = (byte) var8;
            var6.method1135((var9 << 13) + var3 - Statics.field348, (var10 << 13) + var4 - Statics.field263);
            var6.field661 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method5135(2);
            int var12 = field1283[arg1];
            field1283[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method5135(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1283[arg1];
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
            field1283[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method5135(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1283[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1283[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("u.o(Lky;I)V")
    public static final void method200(class309 arg0) {
        for (int var1 = 0; var1 < field1275; var1++) {
            int var2 = field1287[var1];
            class76 var3 = client.field861[var2];
            int var4 = arg0.method5193();
            if ((var4 & 0x80) != 0) {
                var4 += arg0.method5193() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x800) != 0) {
                var3.field998 = arg0.method5194();
                var3.field1017 = arg0.method5306();
                var3.field1016 = arg0.method5194();
                var3.field1018 = arg0.method5194();
                var3.field1027 = arg0.method5233() + client.field674;
                var3.field1020 = arg0.method5231() + client.field674;
                var3.field1028 = arg0.method5232();
                if (var3.field661) {
                    var3.field998 += var3.field662;
                    var3.field1017 += var3.field663;
                    var3.field1016 += var3.field662;
                    var3.field1018 += var3.field663;
                    var3.field1006 = 0;
                } else {
                    var3.field998 += var3.field1031[0];
                    var3.field1017 += var3.field1029[0];
                    var3.field1016 += var3.field1031[0];
                    var3.field1018 += var3.field1029[0];
                    var3.field1006 = 1;
                }
                var3.field974 = 0;
            }
            if ((var4 & 0x4) != 0) {
                int var6 = arg0.method5232();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = arg0.method5193();
                client.method199(var3, var6, var7);
            }
            if ((var4 & 0x1000) != 0) {
                var5 = arg0.method5225();
            }
            if ((var4 & 0x40) != 0) {
                int var8 = arg0.method5232();
                class239 var9 = (class239) class205.method2633(class239.method1126(), arg0.method5215());
                boolean var10 = arg0.method5188() == 1;
                int var11 = arg0.method5215();
                int var12 = arg0.field3734;
                if (var3.field649 != null && var3.field645 != null) {
                    boolean var13 = false;
                    if (var9.field3134 && Statics.field456.method1756(var3.field649)) {
                        var13 = true;
                    }
                    if (!var13 && client.field791 == 0 && !var3.field656) {
                        field1288.field3734 = 0;
                        arg0.method5273(field1288.field3731, 0, var11);
                        field1288.field3734 = 0;
                        String var14 = class306.method5054(class301.method3703(class220.method1091(field1288)));
                        var3.field1021 = var14.trim();
                        var3.field990 = var8 >> 8;
                        var3.field991 = var8 & 0xFF;
                        var3.field989 = 150;
                        var3.field986 = var10;
                        var3.field987 = Statics.field141 != var3 && var9.field3134 && client.field914 != "" && var14.toLowerCase().indexOf(client.field914) == -1;
                        int var15;
                        if (var9.field3133) {
                            var15 = var10 ? 91 : 1;
                        } else {
                            var15 = var10 ? 90 : 2;
                        }
                        if (var9.field3124 == -1) {
                            class101.method317(var15, var3.field649.method4889(), var14);
                        } else {
                            class101.method317(var15, class91.method698(var9.field3124) + var3.field649.method4889(), var14);
                        }
                    }
                }
                arg0.field3734 = var11 + var12;
            }
            if ((var4 & 0x200) != 0) {
                field1285[var2] = arg0.method5194();
            }
            if ((var4 & 0x10) != 0) {
                int var16 = arg0.method5188();
                if (var16 > 0) {
                    for (int var17 = 0; var17 < var16; var17++) {
                        int var18 = -1;
                        int var19 = -1;
                        int var20 = -1;
                        int var21 = arg0.method5207();
                        if (var21 == 32767) {
                            var21 = arg0.method5207();
                            var19 = arg0.method5207();
                            var18 = arg0.method5207();
                            var20 = arg0.method5207();
                        } else if (var21 == 32766) {
                            var21 = -1;
                        } else {
                            var19 = arg0.method5207();
                        }
                        int var22 = arg0.method5207();
                        var3.method1633(var21, var19, var18, var20, client.field674, var22);
                    }
                }
                int var23 = arg0.method5222();
                if (var23 > 0) {
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = arg0.method5207();
                        int var26 = arg0.method5207();
                        if (var26 == 32767) {
                            var3.method1635(var25);
                        } else {
                            int var27 = arg0.method5207();
                            int var28 = arg0.method5193();
                            int var29 = var26 > 0 ? arg0.method5222() : var28;
                            var3.method1634(var25, client.field674, var26, var27, var28, var29);
                        }
                    }
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.field972 = arg0.method5195();
                int var30 = arg0.method5243();
                var3.field1004 = var30 >> 16;
                var3.field1014 = (var30 & 0xFFFF) + client.field674;
                var3.field1011 = 0;
                var3.field988 = 0;
                if (var3.field1014 > client.field674) {
                    var3.field1011 = -1;
                }
                if (var3.field972 == 65535) {
                    var3.field972 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1021 = arg0.method5202();
                if (var3.field1021.charAt(0) == '~') {
                    var3.field1021 = var3.field1021.substring(1);
                    class101.method317(2, var3.field649.method4889(), var3.field1021);
                } else if (Statics.field141 == var3) {
                    class101.method317(2, var3.field649.method4889(), var3.field1021);
                }
                var3.field986 = false;
                var3.field990 = 0;
                var3.field991 = 0;
                var3.field989 = 150;
            }
            if ((var4 & 0x1) != 0) {
                int var31 = arg0.method5215();
                byte[] var32 = new byte[var31];
                class310 var33 = new class310(var32);
                arg0.method5325(var32, 0, var31);
                field1278[var2] = var33;
                var3.method1145(var33);
            }
            if ((var4 & 0x8) != 0) {
                var3.field999 = arg0.method5233();
                if (var3.field999 == 65535) {
                    var3.field999 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1001 = arg0.method5231();
                if (var3.field1006 == 0) {
                    var3.field1032 = var3.field1001;
                    var3.field1001 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                for (int var34 = 0; var34 < 3; var34++) {
                    var3.field640[var34] = arg0.method5202();
                }
            }
            if (var3.field661) {
                if (var5 == 127) {
                    var3.method1135(var3.field662, var3.field663);
                } else {
                    byte var35;
                    if (var5 == -1) {
                        var35 = field1285[var2];
                    } else {
                        var35 = var5;
                    }
                    var3.method1142(var3.field662, var3.field663, var35);
                }
            }
        }
    }

    @ObfuscatedName("am.x(I)V")
    public static void method318() {
        field1279 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1278[var0] = null;
            field1285[var0] = 1;
        }
    }
}
