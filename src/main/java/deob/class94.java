package deob;

@ObfuscatedName("co")
public class class94 {

    @ObfuscatedName("co.b")
    public static byte[] field1416 = new byte[2048];

    @ObfuscatedName("co.z")
    public static byte[] field1417 = new byte[2048];

    @ObfuscatedName("co.n")
    public static class195[] field1405 = new class195[2048];

    @ObfuscatedName("co.l")
    public static int field1408 = 0;

    @ObfuscatedName("co.s")
    public static int[] field1406 = new int[2048];

    @ObfuscatedName("co.y")
    public static int field1410 = 0;

    @ObfuscatedName("co.c")
    public static int[] field1411 = new int[2048];

    @ObfuscatedName("co.h")
    public static int[] field1412 = new int[2048];

    @ObfuscatedName("co.i")
    public static int[] field1413 = new int[2048];

    @ObfuscatedName("co.o")
    public static int[] field1409 = new int[2048];

    @ObfuscatedName("co.d")
    public static int field1415 = 0;

    @ObfuscatedName("co.r")
    public static int[] field1414 = new int[2048];

    @ObfuscatedName("co.p")
    public static class195 field1403 = new class195(new byte[5000]);

    public class94() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ko.e(Lgl;II)V")
    public static final void method4872(class202 arg0, int arg1) {
        int var2 = arg0.field2562;
        field1415 = 0;
        method49(arg0);
        for (int var3 = 0; var3 < field1415; var3++) {
            int var4 = field1414[var3];
            class73 var5 = client.field1004[var4];
            int var6 = arg0.method3332();
            if ((var6 & 0x20) != 0) {
                var6 += arg0.method3332() << 8;
            }
            method5038(arg0, var4, var5, var6);
        }
        if (arg0.field2562 - var2 != arg1) {
            throw new RuntimeException(arg0.field2562 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("o.b(Lgl;I)V")
    public static final void method49(class202 arg0) {
        int var1 = 0;
        arg0.method3559();
        for (int var2 = 0; var2 < field1408; var2++) {
            int var3 = field1406[var2];
            if ((field1416[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1416[var3] = (byte) (field1416[var3] | 0x2);
                } else {
                    int var4 = arg0.method3562(1);
                    if (var4 == 0) {
                        var1 = method1969(arg0);
                        field1416[var3] = (byte) (field1416[var3] | 0x2);
                    } else {
                        method3605(arg0, var3);
                    }
                }
            }
        }
        arg0.method3556();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3559();
        for (int var5 = 0; var5 < field1408; var5++) {
            int var6 = field1406[var5];
            if ((field1416[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1416[var6] = (byte) (field1416[var6] | 0x2);
                } else {
                    int var7 = arg0.method3562(1);
                    if (var7 == 0) {
                        var1 = method1969(arg0);
                        field1416[var6] = (byte) (field1416[var6] | 0x2);
                    } else {
                        method3605(arg0, var6);
                    }
                }
            }
        }
        arg0.method3556();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3559();
        for (int var8 = 0; var8 < field1410; var8++) {
            int var9 = field1411[var8];
            if ((field1416[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1416[var9] = (byte) (field1416[var9] | 0x2);
                } else {
                    int var10 = arg0.method3562(1);
                    if (var10 == 0) {
                        var1 = method1969(arg0);
                        field1416[var9] = (byte) (field1416[var9] | 0x2);
                    } else if (method1652(arg0, var9)) {
                        field1416[var9] = (byte) (field1416[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3556();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3559();
        for (int var11 = 0; var11 < field1410; var11++) {
            int var12 = field1411[var11];
            if ((field1416[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1416[var12] = (byte) (field1416[var12] | 0x2);
                } else {
                    int var13 = arg0.method3562(1);
                    if (var13 == 0) {
                        var1 = method1969(arg0);
                        field1416[var12] = (byte) (field1416[var12] | 0x2);
                    } else if (method1652(arg0, var12)) {
                        field1416[var12] = (byte) (field1416[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3556();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1408 = 0;
        field1410 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1416[var14] = (byte) (field1416[var14] >> 1);
            class73 var15 = client.field1004[var14];
            if (var15 == null) {
                field1411[++field1410 - 1] = var14;
            } else {
                field1406[++field1408 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("cr.z(Lgl;B)I")
    public static int method1969(class202 arg0) {
        int var1 = arg0.method3562(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3562(5);
        } else if (var1 == 2) {
            var2 = arg0.method3562(8);
        } else {
            var2 = arg0.method3562(11);
        }
        return var2;
    }

    @ObfuscatedName("go.n(Lgl;IB)V")
    public static void method3605(class202 arg0, int arg1) {
        boolean var2 = arg0.method3562(1) == 1;
        if (var2) {
            field1414[++field1415 - 1] = arg1;
        }
        int var3 = arg0.method3562(2);
        class73 var4 = client.field1004[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field841 = false;
            } else if (client.field969 == arg1) {
                throw new RuntimeException();
            } else {
                field1412[arg1] = (Statics.field594 + var4.field1197[0] >> 13) + (Statics.field2465 + var4.field1196[0] >> 13 << 14) + (var4.field832 << 28);
                if (var4.field1169 == -1) {
                    field1413[arg1] = var4.field1152;
                } else {
                    field1413[arg1] = var4.field1169;
                }
                field1409[arg1] = var4.field1167;
                client.field1004[arg1] = null;
                if (arg0.method3562(1) != 0) {
                    method1652(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3562(3);
            int var6 = var4.field1196[0];
            int var7 = var4.field1197[0];
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
            if (client.field969 == arg1 && var4.field1154 < 1536 || var4.field1148 < 1536 || var4.field1154 >= 11776 || var4.field1148 >= 11776) {
                var4.method1155(var6, var7);
                var4.field841 = false;
            } else if (var2) {
                var4.field841 = true;
                var4.field843 = var6;
                var4.field840 = var7;
            } else {
                var4.field841 = false;
                var4.method1121(var6, var7, field1417[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3562(4);
            int var9 = var4.field1196[0];
            int var10 = var4.field1197[0];
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
            if (client.field969 == arg1 && var4.field1154 < 1536 || var4.field1148 < 1536 || var4.field1154 >= 11776 || var4.field1148 >= 11776) {
                var4.method1155(var9, var10);
                var4.field841 = false;
            } else if (var2) {
                var4.field841 = true;
                var4.field843 = var9;
                var4.field840 = var10;
            } else {
                var4.field841 = false;
                var4.method1121(var9, var10, field1417[arg1]);
            }
        } else {
            int var11 = arg0.method3562(1);
            if (var11 == 0) {
                int var12 = arg0.method3562(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1196[0] + var14;
                int var17 = var4.field1197[0] + var15;
                if (client.field969 == arg1 && var4.field1154 < 1536 || var4.field1148 < 1536 || var4.field1154 >= 11776 || var4.field1148 >= 11776) {
                    var4.method1155(var16, var17);
                    var4.field841 = false;
                } else if (var2) {
                    var4.field841 = true;
                    var4.field843 = var16;
                    var4.field840 = var17;
                } else {
                    var4.field841 = false;
                    var4.method1121(var16, var17, field1417[arg1]);
                }
                var4.field832 = (byte) (var4.field832 + var13 & 0x3);
                if (client.field969 == arg1) {
                    Statics.field226 = var4.field832;
                }
            } else {
                int var18 = arg0.method3562(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2465 + var4.field1196[0] + var20 & 0x3FFF) - Statics.field2465;
                int var23 = (Statics.field594 + var4.field1197[0] + var21 & 0x3FFF) - Statics.field594;
                if (client.field969 == arg1 && var4.field1154 < 1536 || var4.field1148 < 1536 || var4.field1154 >= 11776 || var4.field1148 >= 11776) {
                    var4.method1155(var22, var23);
                    var4.field841 = false;
                } else if (var2) {
                    var4.field841 = true;
                    var4.field843 = var22;
                    var4.field840 = var23;
                } else {
                    var4.field841 = false;
                    var4.method1121(var22, var23, field1417[arg1]);
                }
                var4.field832 = (byte) (var4.field832 + var19 & 0x3);
                if (client.field969 == arg1) {
                    Statics.field226 = var4.field832;
                }
            }
        }
    }

    @ObfuscatedName("ce.l(Lgl;IB)Z")
    public static boolean method1652(class202 arg0, int arg1) {
        int var2 = arg0.method3562(2);
        if (var2 == 0) {
            if (arg0.method3562(1) != 0) {
                method1652(arg0, arg1);
            }
            int var3 = arg0.method3562(13);
            int var4 = arg0.method3562(13);
            boolean var5 = arg0.method3562(1) == 1;
            if (var5) {
                field1414[++field1415 - 1] = arg1;
            }
            if (client.field1004[arg1] != null) {
                throw new RuntimeException();
            }
            class73 var6 = client.field1004[arg1] = new class73();
            var6.field818 = arg1;
            if (field1405[arg1] != null) {
                var6.method1111(field1405[arg1]);
            }
            var6.field1152 = field1413[arg1];
            var6.field1167 = field1409[arg1];
            int var7 = field1412[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1198[0] = field1417[arg1];
            var6.field832 = (byte) var8;
            var6.method1155((var9 << 13) + var3 - Statics.field2465, (var10 << 13) + var4 - Statics.field594);
            var6.field841 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3562(2);
            int var12 = field1412[arg1];
            field1412[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3562(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1412[arg1];
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
            field1412[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3562(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1412[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1412[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("kn.s(Lgl;ILbd;II)V")
    public static final void method5038(class202 arg0, int arg1, class73 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method3340();
        }
        if ((arg3 & 0x800) != 0) {
            field1417[arg1] = arg0.method3341();
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var5 = 0; var5 < 3; var5++) {
                arg2.field820[var5] = arg0.method3429();
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var6 = arg0.method3345();
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg0.method3336();
            client.method3054(arg2, var6, var7);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1169 = arg0.method3337();
            if (arg2.field1199 == 0) {
                arg2.field1152 = arg2.field1169;
                arg2.field1169 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = arg0.method3338();
            byte[] var9 = new byte[var8];
            class195 var10 = new class195(var9);
            arg0.method3488(var9, 0, var8);
            field1405[arg1] = var10;
            arg2.method1111(var10);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1142 = arg0.method3310();
            int var11 = arg0.method3472();
            arg2.field1188 = var11 >> 16;
            arg2.field1162 = (var11 & 0xFFFF) + client.field913;
            arg2.field1163 = 0;
            arg2.field1180 = 0;
            if (arg2.field1162 > client.field913) {
                arg2.field1163 = -1;
            }
            if (arg2.field1142 == 65535) {
                arg2.field1142 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1167 = arg0.method3310();
            if (arg2.field1167 == 65535) {
                arg2.field1167 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var12 = arg0.method3310();
            class257 var13 = (class257) Statics.method3233(Statics.method2482(), arg0.method3376());
            boolean var14 = arg0.method3332() == 1;
            int var15 = arg0.method3376();
            int var16 = arg0.field2562;
            if (arg2.field829 != null && arg2.field817 != null) {
                boolean var17 = false;
                if (var13.field3343 && Statics.field1666.method1669(arg2.field829)) {
                    var17 = true;
                }
                if (!var17 && client.field1048 == 0 && !arg2.field836) {
                    field1403.field2562 = 0;
                    arg0.method3488(field1403.field2563, 0, var15);
                    field1403.field2562 = 0;
                    class195 var18 = field1403;
                    String var19 = class314.method1036(var18, 32767);
                    String var20 = class313.method5133(class319.method127(var19));
                    arg2.field1195 = var20.trim();
                    arg2.field1160 = var12 >> 8;
                    arg2.field1159 = var12 & 0xFF;
                    arg2.field1157 = 150;
                    arg2.field1192 = var14;
                    arg2.field1156 = Statics.field3435 != arg2 && var13.field3343 && client.field1069 != "" && var20.toLowerCase().indexOf(client.field1069) == -1;
                    int var21;
                    if (var13.field3342) {
                        var21 = var14 ? 91 : 1;
                    } else {
                        var21 = var14 ? 90 : 2;
                    }
                    if (var13.field3335 == -1) {
                        class96.method5053(var21, arg2.field829.method5060(), var20);
                    } else {
                        class96.method5053(var21, class87.method4176(var13.field3335) + arg2.field829.method5060(), var20);
                    }
                }
            }
            arg0.field2562 = var15 + var16;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1183 = arg0.method3296();
            arg2.field1185 = arg0.method3296();
            arg2.field1175 = arg0.method3341();
            arg2.field1186 = arg0.method3341();
            arg2.field1187 = arg0.method3310() + client.field913;
            arg2.field1140 = arg0.method3310() + client.field913;
            arg2.field1189 = arg0.method3310();
            if (arg2.field841) {
                arg2.field1183 += arg2.field843;
                arg2.field1185 += arg2.field840;
                arg2.field1175 += arg2.field843;
                arg2.field1186 += arg2.field840;
                arg2.field1199 = 0;
            } else {
                arg2.field1183 += arg2.field1196[0];
                arg2.field1185 += arg2.field1197[0];
                arg2.field1175 += arg2.field1196[0];
                arg2.field1186 += arg2.field1197[0];
                arg2.field1199 = 1;
            }
            arg2.field1179 = 0;
        }
        if ((arg3 & 0x2) != 0) {
            int var22 = arg0.method3336();
            if (var22 > 0) {
                for (int var23 = 0; var23 < var22; var23++) {
                    int var24 = -1;
                    int var25 = -1;
                    int var26 = -1;
                    int var27 = arg0.method3339();
                    if (var27 == 32767) {
                        var27 = arg0.method3339();
                        var25 = arg0.method3339();
                        var24 = arg0.method3339();
                        var26 = arg0.method3339();
                    } else if (var27 == 32766) {
                        var27 = -1;
                    } else {
                        var25 = arg0.method3339();
                    }
                    int var28 = arg0.method3339();
                    arg2.method1587(var27, var25, var24, var26, client.field913, var28);
                }
            }
            int var29 = arg0.method3338();
            if (var29 > 0) {
                for (int var30 = 0; var30 < var29; var30++) {
                    int var31 = arg0.method3339();
                    int var32 = arg0.method3339();
                    if (var32 == 32767) {
                        arg2.method1588(var31);
                    } else {
                        int var33 = arg0.method3339();
                        int var34 = arg0.method3336();
                        int var35 = var32 > 0 ? arg0.method3336() : var34;
                        arg2.method1590(var31, client.field913, var32, var33, var34, var35);
                    }
                }
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1195 = arg0.method3429();
            if (arg2.field1195.charAt(0) == '~') {
                arg2.field1195 = arg2.field1195.substring(1);
                class96.method5053(2, arg2.field829.method5060(), arg2.field1195);
            } else if (Statics.field3435 == arg2) {
                class96.method5053(2, arg2.field829.method5060(), arg2.field1195);
            }
            arg2.field1192 = false;
            arg2.field1160 = 0;
            arg2.field1159 = 0;
            arg2.field1157 = 150;
        }
        if (!arg2.field841) {
            return;
        }
        if (var4 == 127) {
            arg2.method1155(arg2.field843, arg2.field840);
            return;
        }
        byte var36;
        if (var4 == -1) {
            var36 = field1417[arg1];
        } else {
            var36 = var4;
        }
        arg2.method1121(arg2.field843, arg2.field840, var36);
    }
}
