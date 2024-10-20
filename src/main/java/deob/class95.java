package deob;

@ObfuscatedName("cg")
public class class95 {

    @ObfuscatedName("cg.i")
    public static byte[] field1408 = new byte[2048];

    @ObfuscatedName("cg.j")
    public static byte[] field1412 = new byte[2048];

    @ObfuscatedName("cg.v")
    public static class181[] field1405 = new class181[2048];

    @ObfuscatedName("cg.x")
    public static int field1406 = 0;

    @ObfuscatedName("cg.e")
    public static int[] field1407 = new int[2048];

    @ObfuscatedName("cg.l")
    public static int field1404 = 0;

    @ObfuscatedName("cg.b")
    public static int[] field1403 = new int[2048];

    @ObfuscatedName("cg.n")
    public static int[] field1410 = new int[2048];

    @ObfuscatedName("cg.c")
    public static int[] field1411 = new int[2048];

    @ObfuscatedName("cg.a")
    public static int[] field1413 = new int[2048];

    @ObfuscatedName("cg.y")
    public static int field1409 = 0;

    @ObfuscatedName("cg.w")
    public static int[] field1416 = new int[2048];

    @ObfuscatedName("cg.k")
    public static class181 field1415 = new class181(new byte[5000]);

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hs.m(Lgi;I)V")
    public static final void method3904(class187 arg0) {
        arg0.method3277();
        int var1 = client.field1052;
        class74 var2 = Statics.field601 = client.field1113[var1] = new class74();
        var2.field854 = var1;
        int var3 = arg0.method3278(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1199[0] = var5 - Statics.field1709;
        var2.field1188 = (var2.field1199[0] << 7) + (var2.method1069() << 6);
        var2.field1172[0] = var6 - Statics.field1710;
        var2.field1145 = (var2.field1172[0] << 7) + (var2.method1069() << 6);
        Statics.field801 = var2.field853 = var4;
        if (field1405[var1] != null) {
            var2.method1068(field1405[var1]);
        }
        field1406 = 0;
        field1407[++field1406 - 1] = var1;
        field1408[var1] = 0;
        field1404 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3278(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1410[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1411[var7] = 0;
                field1413[var7] = -1;
                field1403[++field1404 - 1] = var7;
                field1408[var7] = 0;
            }
        }
        arg0.method3296();
    }

    @ObfuscatedName("cr.p(Lgi;IB)V")
    public static final void method1598(class187 arg0, int arg1) {
        int var2 = arg0.field2498;
        field1409 = 0;
        method267(arg0);
        for (int var3 = 0; var3 < field1409; var3++) {
            int var4 = field1416[var3];
            class74 var5 = client.field1113[var4];
            int var6 = arg0.method3012();
            if ((var6 & 0x1) != 0) {
                var6 += arg0.method3012() << 8;
            }
            method597(arg0, var4, var5, var6);
        }
        if (arg0.field2498 - var2 != arg1) {
            throw new RuntimeException(arg0.field2498 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ag.i(Lgi;I)V")
    public static final void method267(class187 arg0) {
        int var1 = 0;
        arg0.method3277();
        for (int var2 = 0; var2 < field1406; var2++) {
            int var3 = field1407[var2];
            if ((field1408[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1408[var3] = (byte) (field1408[var3] | 0x2);
                } else {
                    int var4 = arg0.method3278(1);
                    if (var4 == 0) {
                        var1 = method4482(arg0);
                        field1408[var3] = (byte) (field1408[var3] | 0x2);
                    } else {
                        method723(arg0, var3);
                    }
                }
            }
        }
        arg0.method3296();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3277();
        for (int var5 = 0; var5 < field1406; var5++) {
            int var6 = field1407[var5];
            if ((field1408[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1408[var6] = (byte) (field1408[var6] | 0x2);
                } else {
                    int var7 = arg0.method3278(1);
                    if (var7 == 0) {
                        var1 = method4482(arg0);
                        field1408[var6] = (byte) (field1408[var6] | 0x2);
                    } else {
                        method723(arg0, var6);
                    }
                }
            }
        }
        arg0.method3296();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3277();
        for (int var8 = 0; var8 < field1404; var8++) {
            int var9 = field1403[var8];
            if ((field1408[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1408[var9] = (byte) (field1408[var9] | 0x2);
                } else {
                    int var10 = arg0.method3278(1);
                    if (var10 == 0) {
                        var1 = method4482(arg0);
                        field1408[var9] = (byte) (field1408[var9] | 0x2);
                    } else if (method513(arg0, var9)) {
                        field1408[var9] = (byte) (field1408[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3296();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3277();
        for (int var11 = 0; var11 < field1404; var11++) {
            int var12 = field1403[var11];
            if ((field1408[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1408[var12] = (byte) (field1408[var12] | 0x2);
                } else {
                    int var13 = arg0.method3278(1);
                    if (var13 == 0) {
                        var1 = method4482(arg0);
                        field1408[var12] = (byte) (field1408[var12] | 0x2);
                    } else if (method513(arg0, var12)) {
                        field1408[var12] = (byte) (field1408[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3296();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1406 = 0;
        field1404 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1408[var14] = (byte) (field1408[var14] >> 1);
            class74 var15 = client.field1113[var14];
            if (var15 == null) {
                field1403[++field1404 - 1] = var14;
            } else {
                field1407[++field1406 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("jy.j(Lgi;S)I")
    public static int method4482(class187 arg0) {
        int var1 = arg0.method3278(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3278(5);
        } else if (var1 == 2) {
            var2 = arg0.method3278(8);
        } else {
            var2 = arg0.method3278(11);
        }
        return var2;
    }

    @ObfuscatedName("ar.v(Lgi;II)V")
    public static void method723(class187 arg0, int arg1) {
        boolean var2 = arg0.method3278(1) == 1;
        if (var2) {
            field1416[++field1409 - 1] = arg1;
        }
        int var3 = arg0.method3278(2);
        class74 var4 = client.field1113[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field855 = false;
            } else if (client.field1052 == arg1) {
                throw new RuntimeException();
            } else {
                field1410[arg1] = (Statics.field1710 + var4.field1172[0] >> 13) + (Statics.field1709 + var4.field1199[0] >> 13 << 14) + (var4.field853 << 28);
                if (var4.field1203 == -1) {
                    field1411[arg1] = var4.field1195;
                } else {
                    field1411[arg1] = var4.field1203;
                }
                field1413[arg1] = var4.field1201;
                client.field1113[arg1] = null;
                if (arg0.method3278(1) != 0) {
                    method513(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3278(3);
            int var6 = var4.field1199[0];
            int var7 = var4.field1172[0];
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
            if (client.field1052 == arg1 && var4.field1188 < 1536 || var4.field1145 < 1536 || var4.field1188 >= 11776 || var4.field1145 >= 11776) {
                var4.method1072(var6, var7);
                var4.field855 = false;
            } else if (var2) {
                var4.field855 = true;
                var4.field856 = var6;
                var4.field859 = var7;
            } else {
                var4.field855 = false;
                var4.method1071(var6, var7, field1412[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3278(4);
            int var9 = var4.field1199[0];
            int var10 = var4.field1172[0];
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
            if (client.field1052 == arg1 && var4.field1188 < 1536 || var4.field1145 < 1536 || var4.field1188 >= 11776 || var4.field1145 >= 11776) {
                var4.method1072(var9, var10);
                var4.field855 = false;
            } else if (var2) {
                var4.field855 = true;
                var4.field856 = var9;
                var4.field859 = var10;
            } else {
                var4.field855 = false;
                var4.method1071(var9, var10, field1412[arg1]);
            }
        } else {
            int var11 = arg0.method3278(1);
            if (var11 == 0) {
                int var12 = arg0.method3278(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1199[0] + var14;
                int var17 = var4.field1172[0] + var15;
                if (client.field1052 == arg1 && var4.field1188 < 1536 || var4.field1145 < 1536 || var4.field1188 >= 11776 || var4.field1145 >= 11776) {
                    var4.method1072(var16, var17);
                    var4.field855 = false;
                } else if (var2) {
                    var4.field855 = true;
                    var4.field856 = var16;
                    var4.field859 = var17;
                } else {
                    var4.field855 = false;
                    var4.method1071(var16, var17, field1412[arg1]);
                }
                var4.field853 = (byte) (var4.field853 + var13 & 0x3);
                if (client.field1052 == arg1) {
                    Statics.field801 = var4.field853;
                }
            } else {
                int var18 = arg0.method3278(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field1709 + var4.field1199[0] + var20 & 0x3FFF) - Statics.field1709;
                int var23 = (Statics.field1710 + var4.field1172[0] + var21 & 0x3FFF) - Statics.field1710;
                if (client.field1052 == arg1 && var4.field1188 < 1536 || var4.field1145 < 1536 || var4.field1188 >= 11776 || var4.field1145 >= 11776) {
                    var4.method1072(var22, var23);
                    var4.field855 = false;
                } else if (var2) {
                    var4.field855 = true;
                    var4.field856 = var22;
                    var4.field859 = var23;
                } else {
                    var4.field855 = false;
                    var4.method1071(var22, var23, field1412[arg1]);
                }
                var4.field853 = (byte) (var4.field853 + var19 & 0x3);
                if (client.field1052 == arg1) {
                    Statics.field801 = var4.field853;
                }
            }
        }
    }

    @ObfuscatedName("ah.x(Lgi;IB)Z")
    public static boolean method513(class187 arg0, int arg1) {
        int var2 = arg0.method3278(2);
        if (var2 == 0) {
            if (arg0.method3278(1) != 0) {
                method513(arg0, arg1);
            }
            int var3 = arg0.method3278(13);
            int var4 = arg0.method3278(13);
            boolean var5 = arg0.method3278(1) == 1;
            if (var5) {
                field1416[++field1409 - 1] = arg1;
            }
            if (client.field1113[arg1] != null) {
                throw new RuntimeException();
            }
            class74 var6 = client.field1113[arg1] = new class74();
            var6.field854 = arg1;
            if (field1405[arg1] != null) {
                var6.method1068(field1405[arg1]);
            }
            var6.field1195 = field1411[arg1];
            var6.field1201 = field1413[arg1];
            int var7 = field1410[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1190[0] = field1412[arg1];
            var6.field853 = (byte) var8;
            var6.method1072((var9 << 13) + var3 - Statics.field1709, (var10 << 13) + var4 - Statics.field1710);
            var6.field855 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3278(2);
            int var12 = field1410[arg1];
            field1410[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3278(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1410[arg1];
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
            field1410[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3278(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1410[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1410[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ai.e(Lgi;ILbq;II)V")
    public static final void method597(class187 arg0, int arg1, class74 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x200) != 0) {
            arg2.field1181 = arg0.method3049();
            int var5 = arg0.method3058();
            arg2.field1185 = var5 >> 16;
            arg2.field1184 = (var5 & 0xFFFF) + client.field1054;
            arg2.field1182 = 0;
            arg2.field1183 = 0;
            if (arg2.field1184 > client.field1054) {
                arg2.field1182 = -1;
            }
            if (arg2.field1181 == 65535) {
                arg2.field1181 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            field1412[arg1] = arg0.method3045();
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1157 = arg0.method3021();
            if (arg2.field1157.charAt(0) == '~') {
                arg2.field1157 = arg2.field1157.substring(1);
                class97.method1752(2, arg2.field852, arg2.field1157);
            } else if (Statics.field601 == arg2) {
                class97.method1752(2, arg2.field852, arg2.field1157);
            }
            arg2.field1148 = false;
            arg2.field1161 = 0;
            arg2.field1189 = 0;
            arg2.field1149 = 150;
        }
        if ((arg3 & 0x40) != 0) {
            int var6 = arg0.method3040();
            if (var6 > 0) {
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = -1;
                    int var9 = -1;
                    int var10 = -1;
                    int var11 = arg0.method3140();
                    if (var11 == 32767) {
                        var11 = arg0.method3140();
                        var9 = arg0.method3140();
                        var8 = arg0.method3140();
                        var10 = arg0.method3140();
                    } else if (var11 == 32766) {
                        var11 = -1;
                    } else {
                        var9 = arg0.method3140();
                    }
                    int var12 = arg0.method3140();
                    arg2.method1473(var11, var9, var8, var10, client.field1054, var12);
                }
            }
            int var13 = arg0.method3041();
            if (var13 > 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    int var15 = arg0.method3140();
                    int var16 = arg0.method3140();
                    if (var16 == 32767) {
                        arg2.method1475(var15);
                    } else {
                        int var17 = arg0.method3140();
                        int var18 = arg0.method3134();
                        int var19 = var16 > 0 ? arg0.method3134() : var18;
                        arg2.method1474(var15, client.field1054, var16, var17, var18, var19);
                    }
                }
            }
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method3013();
        }
        if ((arg3 & 0x4) != 0) {
            int var20 = arg0.method3009();
            class238 var21 = (class238) class176.method676(class238.method102(), arg0.method3040());
            boolean var22 = arg0.method3134() == 1;
            int var23 = arg0.method3012();
            int var24 = arg0.field2498;
            if (arg2.field852 != null && arg2.field833 != null) {
                boolean var25 = false;
                if (var21.field3236 && client.method2378(arg2.field852)) {
                    var25 = true;
                }
                if (!var25 && client.field969 == 0 && !arg2.field845) {
                    field1415.field2498 = 0;
                    arg0.method3187(field1415.field2499, 0, var23);
                    field1415.field2498 = 0;
                    String var26 = class272.method4559(class278.method4379(class273.method2864(field1415)));
                    arg2.field1157 = var26.trim();
                    arg2.field1161 = var20 >> 8;
                    arg2.field1189 = var20 & 0xFF;
                    arg2.field1149 = 150;
                    arg2.field1148 = var22;
                    arg2.field1159 = Statics.field601 != arg2 && var21.field3236 && client.field1015 != "" && var26.toLowerCase().indexOf(client.field1015) == -1;
                    int var27;
                    if (var21.field3240) {
                        var27 = var22 ? 91 : 1;
                    } else {
                        var27 = var22 ? 90 : 2;
                    }
                    if (var21.field3241 == -1) {
                        class97.method1752(var27, arg2.field852, var26);
                    } else {
                        int var29 = var21.field3241;
                        String var30 = "<img=" + var29 + ">";
                        class97.method1752(var27, var30 + arg2.field852, var26);
                    }
                }
            }
            arg0.field2498 = var23 + var24;
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1201 = arg0.method3049();
            if (arg2.field1201 == 65535) {
                arg2.field1201 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var31 = arg0.method3040();
            byte[] var32 = new byte[var31];
            class181 var33 = new class181(var32);
            arg0.method3061(var32, 0, var31);
            field1405[arg1] = var33;
            arg2.method1068(var33);
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var34 = 0; var34 < 3; var34++) {
                arg2.field834[var34] = arg0.method3021();
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var35 = arg0.method3050();
            if (var35 == 65535) {
                var35 = -1;
            }
            int var36 = arg0.method3040();
            client.method462(arg2, var35, var36);
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1186 = arg0.method3045();
            arg2.field1160 = arg0.method3045();
            arg2.field1144 = arg0.method3045();
            arg2.field1200 = arg0.method3045();
            arg2.field1165 = arg0.method3050() + client.field1054;
            arg2.field1178 = arg0.method3049() + client.field1054;
            arg2.field1192 = arg0.method3050();
            if (arg2.field855) {
                arg2.field1186 += arg2.field856;
                arg2.field1160 += arg2.field859;
                arg2.field1144 += arg2.field856;
                arg2.field1200 += arg2.field859;
                arg2.field1198 = 0;
            } else {
                arg2.field1186 += arg2.field1199[0];
                arg2.field1160 += arg2.field1172[0];
                arg2.field1144 += arg2.field1199[0];
                arg2.field1200 += arg2.field1172[0];
                arg2.field1198 = 1;
            }
            arg2.field1187 = 0;
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1203 = arg0.method3050();
            if (arg2.field1198 == 0) {
                arg2.field1195 = arg2.field1203;
                arg2.field1203 = -1;
            }
        }
        if (!arg2.field855) {
            return;
        }
        if (var4 == 127) {
            arg2.method1072(arg2.field856, arg2.field859);
            return;
        }
        byte var37;
        if (var4 == -1) {
            var37 = field1412[arg1];
        } else {
            var37 = var4;
        }
        arg2.method1071(arg2.field856, arg2.field859, var37);
    }
}
