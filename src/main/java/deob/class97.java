package deob;

@ObfuscatedName("cg")
public class class97 {

    @ObfuscatedName("cg.i")
    public static byte[] field1284 = new byte[2048];

    @ObfuscatedName("cg.f")
    public static class194[] field1287 = new class194[2048];

    @ObfuscatedName("cg.b")
    public static class438[] field1277 = new class438[2048];

    @ObfuscatedName("cg.n")
    public static int field1276 = 0;

    @ObfuscatedName("cg.s")
    public static int[] field1275 = new int[2048];

    @ObfuscatedName("cg.l")
    public static int field1280 = 0;

    @ObfuscatedName("cg.q")
    public static int[] field1279 = new int[2048];

    @ObfuscatedName("cg.o")
    public static int[] field1281 = new int[2048];

    @ObfuscatedName("cg.r")
    public static int[] field1283 = new int[2048];

    @ObfuscatedName("cg.p")
    public static int[] field1282 = new int[2048];

    @ObfuscatedName("cg.w")
    public static int field1285 = 0;

    @ObfuscatedName("cg.k")
    public static int[] field1286 = new int[2048];

    @ObfuscatedName("cg.d")
    public static class438 field1274 = new class438(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("of.v(Lpz;B)V")
    public static final void method6740(class437 arg0) {
        arg0.method6922();
        int var1 = client.field622;
        class85 var2 = Statics.field4004 = client.field621[var1] = new class85();
        var2.field1093 = var1;
        int var3 = arg0.method6923(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1178[0] = var5 - Statics.field489;
        var2.field1132 = (var2.field1178[0] << 7) + (var2.method2033() << 6);
        var2.field1179[0] = var6 - Statics.field1843;
        var2.field1116 = (var2.field1179[0] << 7) + (var2.method2033() << 6);
        Statics.field99 = var2.field1092 = var4;
        if (field1277[var1] != null) {
            var2.method2015(field1277[var1]);
        }
        field1276 = 0;
        field1275[++field1276 - 1] = var1;
        field1284[var1] = 0;
        field1280 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6923(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1281[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1283[var7] = 0;
                field1282[var7] = -1;
                field1279[++field1280 - 1] = var7;
                field1284[var7] = 0;
            }
        }
        arg0.method6914();
    }

    @ObfuscatedName("by.c(Lpz;II)V")
    public static final void method1886(class437 arg0, int arg1) {
        int var2 = arg0.field4621;
        field1285 = 0;
        int var3 = 0;
        arg0.method6922();
        for (int var4 = 0; var4 < field1276; var4++) {
            int var5 = field1275[var4];
            if ((field1284[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1284[var5] = (byte) (field1284[var5] | 0x2);
                } else {
                    int var6 = arg0.method6923(1);
                    if (var6 == 0) {
                        var3 = method4683(arg0);
                        field1284[var5] = (byte) (field1284[var5] | 0x2);
                    } else {
                        method5048(arg0, var5);
                    }
                }
            }
        }
        arg0.method6914();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6922();
        for (int var7 = 0; var7 < field1276; var7++) {
            int var8 = field1275[var7];
            if ((field1284[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1284[var8] = (byte) (field1284[var8] | 0x2);
                } else {
                    int var9 = arg0.method6923(1);
                    if (var9 == 0) {
                        var3 = method4683(arg0);
                        field1284[var8] = (byte) (field1284[var8] | 0x2);
                    } else {
                        method5048(arg0, var8);
                    }
                }
            }
        }
        arg0.method6914();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6922();
        for (int var10 = 0; var10 < field1280; var10++) {
            int var11 = field1279[var10];
            if ((field1284[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1284[var11] = (byte) (field1284[var11] | 0x2);
                } else {
                    int var12 = arg0.method6923(1);
                    if (var12 == 0) {
                        var3 = method4683(arg0);
                        field1284[var11] = (byte) (field1284[var11] | 0x2);
                    } else if (method3144(arg0, var11)) {
                        field1284[var11] = (byte) (field1284[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method6914();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method6922();
        for (int var13 = 0; var13 < field1280; var13++) {
            int var14 = field1279[var13];
            if ((field1284[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1284[var14] = (byte) (field1284[var14] | 0x2);
                } else {
                    int var15 = arg0.method6923(1);
                    if (var15 == 0) {
                        var3 = method4683(arg0);
                        field1284[var14] = (byte) (field1284[var14] | 0x2);
                    } else if (method3144(arg0, var14)) {
                        field1284[var14] = (byte) (field1284[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method6914();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1276 = 0;
        field1280 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1284[var16] = (byte) (field1284[var16] >> 1);
            class85 var17 = client.field621[var16];
            if (var17 == null) {
                field1279[++field1280 - 1] = var16;
            } else {
                field1275[++field1276 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1285; var18++) {
            int var19 = field1286[var18];
            class85 var20 = client.field621[var19];
            int var21 = arg0.method6971();
            if ((var21 & 0x40) != 0) {
                var21 += arg0.method6971() << 8;
            }
            method1848(arg0, var19, var20, var21);
        }
        if (arg0.field4621 - var2 != arg1) {
            throw new RuntimeException(arg0.field4621 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("jv.i(Lpz;I)I")
    public static int method4683(class437 arg0) {
        int var1 = arg0.method6923(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method6923(5);
        } else if (var1 == 2) {
            var2 = arg0.method6923(8);
        } else {
            var2 = arg0.method6923(11);
        }
        return var2;
    }

    @ObfuscatedName("kp.f(Lpz;II)V")
    public static void method5048(class437 arg0, int arg1) {
        boolean var2 = arg0.method6923(1) == 1;
        if (var2) {
            field1286[++field1285 - 1] = arg1;
        }
        int var3 = arg0.method6923(2);
        class85 var4 = client.field621[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field1071 = false;
            } else if (client.field622 == arg1) {
                throw new RuntimeException();
            } else {
                field1281[arg1] = (Statics.field1843 + var4.field1179[0] >> 13) + (Statics.field489 + var4.field1178[0] >> 13 << 14) + (var4.field1092 << 28);
                if (var4.field1122 == -1) {
                    field1283[arg1] = var4.field1174;
                } else {
                    field1283[arg1] = var4.field1122;
                }
                field1282[arg1] = var4.field1142;
                client.field621[arg1] = null;
                if (arg0.method6923(1) != 0) {
                    method3144(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method6923(3);
            int var6 = var4.field1178[0];
            int var7 = var4.field1179[0];
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
            if (client.field622 == arg1 && var4.field1132 < 1536 || var4.field1116 < 1536 || var4.field1132 >= 11776 || var4.field1116 >= 11776) {
                var4.method2062(var6, var7);
                var4.field1071 = false;
            } else if (var2) {
                var4.field1071 = true;
                var4.field1098 = var6;
                var4.field1099 = var7;
            } else {
                var4.field1071 = false;
                var4.method2026(var6, var7, field1287[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method6923(4);
            int var9 = var4.field1178[0];
            int var10 = var4.field1179[0];
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
            if (client.field622 == arg1 && var4.field1132 < 1536 || var4.field1116 < 1536 || var4.field1132 >= 11776 || var4.field1116 >= 11776) {
                var4.method2062(var9, var10);
                var4.field1071 = false;
            } else if (var2) {
                var4.field1071 = true;
                var4.field1098 = var9;
                var4.field1099 = var10;
            } else {
                var4.field1071 = false;
                var4.method2026(var9, var10, field1287[arg1]);
            }
        } else {
            int var11 = arg0.method6923(1);
            if (var11 == 0) {
                int var12 = arg0.method6923(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1178[0] + var14;
                int var17 = var4.field1179[0] + var15;
                if (client.field622 == arg1 && var4.field1132 < 1536 || var4.field1116 < 1536 || var4.field1132 >= 11776 || var4.field1116 >= 11776) {
                    var4.method2062(var16, var17);
                    var4.field1071 = false;
                } else if (var2) {
                    var4.field1071 = true;
                    var4.field1098 = var16;
                    var4.field1099 = var17;
                } else {
                    var4.field1071 = false;
                    var4.method2026(var16, var17, field1287[arg1]);
                }
                var4.field1092 = (byte) (var4.field1092 + var13 & 0x3);
                if (client.field622 == arg1) {
                    Statics.field99 = var4.field1092;
                }
            } else {
                int var18 = arg0.method6923(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field489 + var4.field1178[0] + var20 & 0x3FFF) - Statics.field489;
                int var23 = (Statics.field1843 + var4.field1179[0] + var21 & 0x3FFF) - Statics.field1843;
                if (client.field622 == arg1 && var4.field1132 < 1536 || var4.field1116 < 1536 || var4.field1132 >= 11776 || var4.field1116 >= 11776) {
                    var4.method2062(var22, var23);
                    var4.field1071 = false;
                } else if (var2) {
                    var4.field1071 = true;
                    var4.field1098 = var22;
                    var4.field1099 = var23;
                } else {
                    var4.field1071 = false;
                    var4.method2026(var22, var23, field1287[arg1]);
                }
                var4.field1092 = (byte) (var4.field1092 + var19 & 0x3);
                if (client.field622 == arg1) {
                    Statics.field99 = var4.field1092;
                }
            }
        }
    }

    @ObfuscatedName("fz.b(Lpz;II)Z")
    public static boolean method3144(class437 arg0, int arg1) {
        int var2 = arg0.method6923(2);
        if (var2 == 0) {
            if (arg0.method6923(1) != 0) {
                method3144(arg0, arg1);
            }
            int var3 = arg0.method6923(13);
            int var4 = arg0.method6923(13);
            boolean var5 = arg0.method6923(1) == 1;
            if (var5) {
                field1286[++field1285 - 1] = arg1;
            }
            if (client.field621[arg1] != null) {
                throw new RuntimeException();
            }
            class85 var6 = client.field621[arg1] = new class85();
            var6.field1093 = arg1;
            if (field1277[arg1] != null) {
                var6.method2015(field1277[arg1]);
            }
            var6.field1174 = field1283[arg1];
            var6.field1142 = field1282[arg1];
            int var7 = field1281[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1124[0] = field1287[arg1];
            var6.field1092 = (byte) var8;
            var6.method2062((var9 << 13) + var3 - Statics.field489, (var10 << 13) + var4 - Statics.field1843);
            var6.field1071 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method6923(2);
            int var12 = field1281[arg1];
            field1281[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method6923(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1281[arg1];
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
            field1281[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method6923(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1281[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1281[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bs.n(Lpz;ILcz;II)V")
    public static final void method1848(class437 arg0, int arg1, class85 arg2, int arg3) {
        byte var4 = class194.field2187.field2184;
        if ((arg3 & 0x2000) != 0) {
            arg2.field1168 = client.field507 + arg0.method7011();
            arg2.field1169 = client.field507 + arg0.method7010();
            arg2.field1170 = arg0.method7005();
            arg2.field1115 = arg0.method7005();
            arg2.field1172 = arg0.method7182();
            arg2.field1123 = (byte) arg0.method7070();
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method7182();
        }
        if ((arg3 & 0x1) != 0) {
            int var5 = arg0.method7010();
            class311 var6 = (class311) class330.method4919(class311.method3855(), arg0.method6971());
            boolean var7 = arg0.method7039() == 1;
            int var8 = arg0.method7039();
            int var9 = arg0.field4621;
            if (arg2.field1073 != null && arg2.field1089 != null) {
                boolean var10 = false;
                if (var6.field3930 && Statics.field399.method1603(arg2.field1073)) {
                    var10 = true;
                }
                if (!var10 && client.field619 == 0 && !arg2.field1085) {
                    field1274.field4621 = 0;
                    arg0.method7111(field1274.field4618, 0, var8);
                    field1274.field4621 = 0;
                    String var11 = class345.method5745(class348.method579(class283.method3539(field1274)));
                    arg2.field1129 = var11.trim();
                    arg2.field1143 = var5 >> 8;
                    arg2.field1182 = var5 & 0xFF;
                    arg2.field1138 = 150;
                    arg2.field1160 = var7;
                    arg2.field1131 = Statics.field4004 != arg2 && var6.field3930 && client.field729 != "" && var11.toLowerCase().indexOf(client.field729) == -1;
                    int var12;
                    if (var6.field3929) {
                        var12 = var7 ? 91 : 1;
                    } else {
                        var12 = var7 ? 90 : 2;
                    }
                    if (var6.field3918 == -1) {
                        class99.method2077(var12, arg2.field1073.method7528(), var11);
                    } else {
                        class99.method2077(var12, class93.method1902(var6.field3918) + arg2.field1073.method7528(), var11);
                    }
                }
            }
            arg0.field4621 = var8 + var9;
        }
        if ((arg3 & 0x800) != 0) {
            for (int var13 = 0; var13 < 3; var13++) {
                arg2.field1094[var13] = arg0.method6981();
            }
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field1165 = arg0.method7010();
            int var14 = arg0.method7002();
            arg2.field1158 = var14 >> 16;
            arg2.field1135 = (var14 & 0xFFFF) + client.field507;
            arg2.field1157 = 0;
            arg2.field1156 = 0;
            if (arg2.field1135 > client.field507) {
                arg2.field1157 = -1;
            }
            if (arg2.field1165 == 65535) {
                arg2.field1165 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var15 = arg0.method7039();
            byte[] var16 = new byte[var15];
            class438 var17 = new class438(var16);
            arg0.method7111(var16, 0, var15);
            field1277[arg1] = var17;
            arg2.method2015(var17);
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1130 = arg0.method7004();
            arg2.field1161 = arg0.method7093();
            arg2.field1133 = arg0.method7182();
            arg2.field1162 = arg0.method7005();
            arg2.field1144 = arg0.method7011() + client.field507;
            arg2.field1164 = arg0.method7012() + client.field507;
            arg2.field1136 = arg0.method7010();
            if (arg2.field1071) {
                arg2.field1130 += arg2.field1098;
                arg2.field1161 += arg2.field1099;
                arg2.field1133 += arg2.field1098;
                arg2.field1162 += arg2.field1099;
                arg2.field1177 = 0;
            } else {
                arg2.field1130 += arg2.field1178[0];
                arg2.field1161 += arg2.field1179[0];
                arg2.field1133 += arg2.field1178[0];
                arg2.field1162 += arg2.field1179[0];
                arg2.field1177 = 1;
            }
            arg2.field1171 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1122 = arg0.method7148();
            if (arg2.field1177 == 0) {
                arg2.field1174 = arg2.field1122;
                arg2.field1122 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1129 = arg0.method6981();
            if (arg2.field1129.charAt(0) == '~') {
                arg2.field1129 = arg2.field1129.substring(1);
                class99.method2077(2, arg2.field1073.method7528(), arg2.field1129);
            } else if (Statics.field4004 == arg2) {
                class99.method2077(2, arg2.field1073.method7528(), arg2.field1129);
            }
            arg2.field1160 = false;
            arg2.field1143 = 0;
            arg2.field1182 = 0;
            arg2.field1138 = 150;
        }
        if ((arg3 & 0x8) != 0) {
            int var18 = arg0.method7012();
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = arg0.method7039();
            client.method1073(arg2, var18, var19);
        }
        if ((arg3 & 0x4000) != 0) {
            class194[] var20 = field1287;
            class194[] var22 = new class194[] { class194.field2186, class194.field2188, class194.field2187, class194.field2185 };
            var20[arg1] = (class194) class330.method4919(var22, arg0.method7005());
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1142 = arg0.method7010();
            if (arg2.field1142 == 65535) {
                arg2.field1142 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            int var23 = arg0.method7070();
            if (var23 > 0) {
                for (int var24 = 0; var24 < var23; var24++) {
                    int var25 = -1;
                    int var26 = -1;
                    int var27 = -1;
                    int var28 = arg0.method6986();
                    if (var28 == 32767) {
                        var28 = arg0.method6986();
                        var26 = arg0.method6986();
                        var25 = arg0.method6986();
                        var27 = arg0.method6986();
                    } else if (var28 == 32766) {
                        var28 = -1;
                    } else {
                        var26 = arg0.method6986();
                    }
                    int var29 = arg0.method6986();
                    arg2.method2068(var28, var26, var25, var27, client.field507, var29);
                }
            }
            int var30 = arg0.method6971();
            if (var30 > 0) {
                for (int var31 = 0; var31 < var30; var31++) {
                    int var32 = arg0.method6986();
                    int var33 = arg0.method6986();
                    if (var33 == 32767) {
                        arg2.method2066(var32);
                    } else {
                        int var34 = arg0.method6986();
                        int var35 = arg0.method6971();
                        int var36 = var33 > 0 ? arg0.method7070() : var35;
                        arg2.method2069(var32, client.field507, var33, var34, var35, var36);
                    }
                }
            }
        }
        if (!arg2.field1071) {
            return;
        }
        if (var4 == 127) {
            arg2.method2062(arg2.field1098, arg2.field1099);
            return;
        }
        class194 var38;
        if (class194.field2187.field2184 == var4) {
            var38 = field1287[arg1];
        } else {
            class194[] var37 = new class194[] { class194.field2186, class194.field2188, class194.field2187, class194.field2185 };
            var38 = (class194) class330.method4919(var37, var4);
        }
        arg2.method2026(arg2.field1098, arg2.field1099, var38);
    }
}
