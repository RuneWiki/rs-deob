package deob;

@ObfuscatedName("cn")
public class class93 {

    @ObfuscatedName("cn.w")
    public static byte[] field1376 = new byte[2048];

    @ObfuscatedName("cn.s")
    public static byte[] field1384 = new byte[2048];

    @ObfuscatedName("cn.j")
    public static class185[] field1378 = new class185[2048];

    @ObfuscatedName("cn.a")
    public static int field1379 = 0;

    @ObfuscatedName("cn.t")
    public static int[] field1380 = new int[2048];

    @ObfuscatedName("cn.r")
    public static int field1374 = 0;

    @ObfuscatedName("cn.m")
    public static int[] field1385 = new int[2048];

    @ObfuscatedName("cn.h")
    public static int[] field1383 = new int[2048];

    @ObfuscatedName("cn.o")
    public static int[] field1382 = new int[2048];

    @ObfuscatedName("cn.x")
    public static int[] field1387 = new int[2048];

    @ObfuscatedName("cn.q")
    public static int field1386 = 0;

    @ObfuscatedName("cn.v")
    public static int[] field1377 = new int[2048];

    @ObfuscatedName("cn.n")
    public static class185 field1388 = new class185(new byte[5000]);

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hz.p(Lgd;I)V")
    public static final void method3771(class191 arg0) {
        arg0.method3380();
        int var1 = client.field928;
        class72 var2 = Statics.field470 = client.field927[var1] = new class72();
        var2.field810 = var1;
        int var3 = arg0.method3371(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1153[0] = var5 - Statics.field407;
        var2.field1152 = (var2.field1153[0] << 7) + (var2.method1049() << 6);
        var2.field1154[0] = var6 - Statics.field1272;
        var2.field1117 = (var2.field1154[0] << 7) + (var2.method1049() << 6);
        Statics.field780 = var2.field809 = var4;
        if (field1378[var1] != null) {
            var2.method1072(field1378[var1]);
        }
        field1379 = 0;
        field1380[++field1379 - 1] = var1;
        field1376[var1] = 0;
        field1374 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3371(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1383[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1382[var7] = 0;
                field1387[var7] = -1;
                field1385[++field1374 - 1] = var7;
                field1376[var7] = 0;
            }
        }
        arg0.method3372();
    }

    @ObfuscatedName("bh.i(Lgd;II)V")
    public static final void method1546(class191 arg0, int arg1) {
        int var2 = arg0.field2488;
        field1386 = 0;
        method1737(arg0);
        for (int var3 = 0; var3 < field1386; var3++) {
            int var4 = field1377[var3];
            class72 var5 = client.field927[var4];
            int var6 = arg0.method3197();
            if ((var6 & 0x10) != 0) {
                var6 += arg0.method3197() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x80) != 0) {
                int var8 = arg0.method3124();
                class242[] var9 = new class242[] { class242.field3258, class242.field3254, class242.field3249, class242.field3253, class242.field3252, class242.field3251 };
                class242 var10 = (class242) class180.method4646(var9, arg0.method3197());
                boolean var11 = arg0.method3150() == 1;
                int var12 = arg0.method3197();
                int var13 = arg0.field2488;
                if (var5.field787 != null && var5.field788 != null) {
                    boolean var14 = false;
                    if (var10.field3257 && Statics.field2282.method1554(var5.field787)) {
                        var14 = true;
                    }
                    if (!var14 && client.field1040 == 0 && !var5.field808) {
                        field1388.field2488 = 0;
                        arg0.method3134(field1388.field2491, 0, var12);
                        field1388.field2488 = 0;
                        class185 var15 = field1388;
                        String var16 = class289.method4147(var15, 32767);
                        String var17 = class288.method4817(class294.method3927(var16));
                        var5.field1111 = var17.trim();
                        var5.field1115 = var8 >> 8;
                        var5.field1116 = var8 & 0xFF;
                        var5.field1114 = 150;
                        var5.field1104 = var11;
                        var5.field1131 = Statics.field470 != var5 && var10.field3257 && client.field858 != "" && var17.toLowerCase().indexOf(client.field858) == -1;
                        int var18;
                        if (var10.field3256) {
                            var18 = var11 ? 91 : 1;
                        } else {
                            var18 = var11 ? 90 : 2;
                        }
                        if (var10.field3255 == -1) {
                            Statics.method4020(var18, var5.field787.method4758(), var17);
                        } else {
                            int var20 = var10.field3255;
                            String var21 = "<img=" + var20 + ">";
                            Statics.method4020(var18, var21 + var5.field787.method4758(), var17);
                        }
                    }
                }
                arg0.field2488 = var12 + var13;
            }
            if ((var6 & 0x4) != 0) {
                var5.field1126 = arg0.method3160();
                if (var5.field1099 == 0) {
                    var5.field1149 = var5.field1126;
                    var5.field1126 = -1;
                }
            }
            if ((var6 & 0x200) != 0) {
                var5.field1135 = arg0.method3160();
                int var22 = arg0.method3169();
                var5.field1139 = var22 >> 16;
                var5.field1147 = (var22 & 0xFFFF) + client.field832;
                var5.field1136 = 0;
                var5.field1132 = 0;
                if (var5.field1147 > client.field832) {
                    var5.field1136 = -1;
                }
                if (var5.field1135 == 65535) {
                    var5.field1135 = -1;
                }
            }
            if ((var6 & 0x1000) != 0) {
                var7 = arg0.method3114();
            }
            if ((var6 & 0x100) != 0) {
                var5.field1121 = arg0.method3176();
                var5.field1142 = arg0.method3176();
                var5.field1141 = arg0.method3184();
                var5.field1143 = arg0.method3123();
                var5.field1144 = arg0.method3160() + client.field832;
                var5.field1108 = arg0.method3158() + client.field832;
                var5.field1146 = arg0.method3158();
                if (var5.field813) {
                    var5.field1121 += var5.field814;
                    var5.field1142 += var5.field815;
                    var5.field1141 += var5.field814;
                    var5.field1143 += var5.field815;
                    var5.field1099 = 0;
                } else {
                    var5.field1121 += var5.field1153[0];
                    var5.field1142 += var5.field1154[0];
                    var5.field1141 += var5.field1153[0];
                    var5.field1143 += var5.field1154[0];
                    var5.field1099 = 1;
                }
                var5.field1157 = 0;
            }
            if ((var6 & 0x800) != 0) {
                field1384[var4] = arg0.method3184();
            }
            if ((var6 & 0x1) != 0) {
                var5.field1113 = arg0.method3158();
                if (var5.field1113 == 65535) {
                    var5.field1113 = -1;
                }
            }
            if ((var6 & 0x8) != 0) {
                var5.field1111 = arg0.method3131();
                if (var5.field1111.charAt(0) == '~') {
                    var5.field1111 = var5.field1111.substring(1);
                    Statics.method4020(2, var5.field787.method4758(), var5.field1111);
                } else if (Statics.field470 == var5) {
                    Statics.method4020(2, var5.field787.method4758(), var5.field1111);
                }
                var5.field1104 = false;
                var5.field1115 = 0;
                var5.field1116 = 0;
                var5.field1114 = 150;
            }
            if ((var6 & 0x20) != 0) {
                int var23 = arg0.method3158();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = arg0.method3150();
                client.method180(var5, var23, var24);
            }
            if ((var6 & 0x400) != 0) {
                for (int var25 = 0; var25 < 3; var25++) {
                    var5.field803[var25] = arg0.method3131();
                }
            }
            if ((var6 & 0x40) != 0) {
                int var26 = arg0.method3152();
                if (var26 > 0) {
                    for (int var27 = 0; var27 < var26; var27++) {
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = -1;
                        int var31 = arg0.method3136();
                        if (var31 == 32767) {
                            var31 = arg0.method3136();
                            var29 = arg0.method3136();
                            var28 = arg0.method3136();
                            var30 = arg0.method3136();
                        } else if (var31 == 32766) {
                            var31 = -1;
                        } else {
                            var29 = arg0.method3136();
                        }
                        int var32 = arg0.method3136();
                        var5.method1466(var31, var29, var28, var30, client.field832, var32);
                    }
                }
                int var33 = arg0.method3150();
                if (var33 > 0) {
                    for (int var34 = 0; var34 < var33; var34++) {
                        int var35 = arg0.method3136();
                        int var36 = arg0.method3136();
                        if (var36 == 32767) {
                            var5.method1473(var35);
                        } else {
                            int var37 = arg0.method3136();
                            int var38 = arg0.method3150();
                            int var39 = var36 > 0 ? arg0.method3151() : var38;
                            var5.method1480(var35, client.field832, var36, var37, var38, var39);
                        }
                    }
                }
            }
            if ((var6 & 0x2) != 0) {
                int var40 = arg0.method3151();
                byte[] var41 = new byte[var40];
                class185 var42 = new class185(var41);
                arg0.method3171(var41, 0, var40);
                field1378[var4] = var42;
                var5.method1072(var42);
            }
            if (var5.field813) {
                if (var7 == 127) {
                    var5.method1047(var5.field814, var5.field815);
                } else {
                    byte var43;
                    if (var7 == -1) {
                        var43 = field1384[var4];
                    } else {
                        var43 = var7;
                    }
                    var5.method1037(var5.field814, var5.field815, var43);
                }
            }
        }
        if (arg0.field2488 - var2 != arg1) {
            throw new RuntimeException(arg0.field2488 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("co.w(Lgd;I)V")
    public static final void method1737(class191 arg0) {
        int var1 = 0;
        arg0.method3380();
        for (int var2 = 0; var2 < field1379; var2++) {
            int var3 = field1380[var2];
            if ((field1376[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1376[var3] = (byte) (field1376[var3] | 0x2);
                } else {
                    int var4 = arg0.method3371(1);
                    if (var4 == 0) {
                        var1 = method11(arg0);
                        field1376[var3] = (byte) (field1376[var3] | 0x2);
                    } else {
                        method16(arg0, var3);
                    }
                }
            }
        }
        arg0.method3372();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3380();
        for (int var5 = 0; var5 < field1379; var5++) {
            int var6 = field1380[var5];
            if ((field1376[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1376[var6] = (byte) (field1376[var6] | 0x2);
                } else {
                    int var7 = arg0.method3371(1);
                    if (var7 == 0) {
                        var1 = method11(arg0);
                        field1376[var6] = (byte) (field1376[var6] | 0x2);
                    } else {
                        method16(arg0, var6);
                    }
                }
            }
        }
        arg0.method3372();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3380();
        for (int var8 = 0; var8 < field1374; var8++) {
            int var9 = field1385[var8];
            if ((field1376[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1376[var9] = (byte) (field1376[var9] | 0x2);
                } else {
                    int var10 = arg0.method3371(1);
                    if (var10 == 0) {
                        var1 = method11(arg0);
                        field1376[var9] = (byte) (field1376[var9] | 0x2);
                    } else if (method4011(arg0, var9)) {
                        field1376[var9] = (byte) (field1376[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3372();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3380();
        for (int var11 = 0; var11 < field1374; var11++) {
            int var12 = field1385[var11];
            if ((field1376[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1376[var12] = (byte) (field1376[var12] | 0x2);
                } else {
                    int var13 = arg0.method3371(1);
                    if (var13 == 0) {
                        var1 = method11(arg0);
                        field1376[var12] = (byte) (field1376[var12] | 0x2);
                    } else if (method4011(arg0, var12)) {
                        field1376[var12] = (byte) (field1376[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3372();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1379 = 0;
        field1374 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1376[var14] = (byte) (field1376[var14] >> 1);
            class72 var15 = client.field927[var14];
            if (var15 == null) {
                field1385[++field1374 - 1] = var14;
            } else {
                field1380[++field1379 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("s.s(Lgd;I)I")
    public static int method11(class191 arg0) {
        int var1 = arg0.method3371(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3371(5);
        } else if (var1 == 2) {
            var2 = arg0.method3371(8);
        } else {
            var2 = arg0.method3371(11);
        }
        return var2;
    }

    @ObfuscatedName("j.j(Lgd;IB)V")
    public static void method16(class191 arg0, int arg1) {
        boolean var2 = arg0.method3371(1) == 1;
        if (var2) {
            field1377[++field1386 - 1] = arg1;
        }
        int var3 = arg0.method3371(2);
        class72 var4 = client.field927[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field813 = false;
            } else if (client.field928 == arg1) {
                throw new RuntimeException();
            } else {
                field1383[arg1] = (Statics.field1272 + var4.field1154[0] >> 13) + (Statics.field407 + var4.field1153[0] >> 13 << 14) + (var4.field809 << 28);
                if (var4.field1126 == -1) {
                    field1382[arg1] = var4.field1149;
                } else {
                    field1382[arg1] = var4.field1126;
                }
                field1387[arg1] = var4.field1113;
                client.field927[arg1] = null;
                if (arg0.method3371(1) != 0) {
                    method4011(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3371(3);
            int var6 = var4.field1153[0];
            int var7 = var4.field1154[0];
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
            if (client.field928 == arg1 && var4.field1152 < 1536 || var4.field1117 < 1536 || var4.field1152 >= 11776 || var4.field1117 >= 11776) {
                var4.method1047(var6, var7);
                var4.field813 = false;
            } else if (var2) {
                var4.field813 = true;
                var4.field814 = var6;
                var4.field815 = var7;
            } else {
                var4.field813 = false;
                var4.method1037(var6, var7, field1384[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3371(4);
            int var9 = var4.field1153[0];
            int var10 = var4.field1154[0];
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
            if (client.field928 == arg1 && var4.field1152 < 1536 || var4.field1117 < 1536 || var4.field1152 >= 11776 || var4.field1117 >= 11776) {
                var4.method1047(var9, var10);
                var4.field813 = false;
            } else if (var2) {
                var4.field813 = true;
                var4.field814 = var9;
                var4.field815 = var10;
            } else {
                var4.field813 = false;
                var4.method1037(var9, var10, field1384[arg1]);
            }
        } else {
            int var11 = arg0.method3371(1);
            if (var11 == 0) {
                int var12 = arg0.method3371(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1153[0] + var14;
                int var17 = var4.field1154[0] + var15;
                if (client.field928 == arg1 && var4.field1152 < 1536 || var4.field1117 < 1536 || var4.field1152 >= 11776 || var4.field1117 >= 11776) {
                    var4.method1047(var16, var17);
                    var4.field813 = false;
                } else if (var2) {
                    var4.field813 = true;
                    var4.field814 = var16;
                    var4.field815 = var17;
                } else {
                    var4.field813 = false;
                    var4.method1037(var16, var17, field1384[arg1]);
                }
                var4.field809 = (byte) (var4.field809 + var13 & 0x3);
                if (client.field928 == arg1) {
                    Statics.field780 = var4.field809;
                }
            } else {
                int var18 = arg0.method3371(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field407 + var4.field1153[0] + var20 & 0x3FFF) - Statics.field407;
                int var23 = (Statics.field1272 + var4.field1154[0] + var21 & 0x3FFF) - Statics.field1272;
                if (client.field928 == arg1 && var4.field1152 < 1536 || var4.field1117 < 1536 || var4.field1152 >= 11776 || var4.field1117 >= 11776) {
                    var4.method1047(var22, var23);
                    var4.field813 = false;
                } else if (var2) {
                    var4.field813 = true;
                    var4.field814 = var22;
                    var4.field815 = var23;
                } else {
                    var4.field813 = false;
                    var4.method1037(var22, var23, field1384[arg1]);
                }
                var4.field809 = (byte) (var4.field809 + var19 & 0x3);
                if (client.field928 == arg1) {
                    Statics.field780 = var4.field809;
                }
            }
        }
    }

    @ObfuscatedName("ig.a(Lgd;IB)Z")
    public static boolean method4011(class191 arg0, int arg1) {
        int var2 = arg0.method3371(2);
        if (var2 == 0) {
            if (arg0.method3371(1) != 0) {
                method4011(arg0, arg1);
            }
            int var3 = arg0.method3371(13);
            int var4 = arg0.method3371(13);
            boolean var5 = arg0.method3371(1) == 1;
            if (var5) {
                field1377[++field1386 - 1] = arg1;
            }
            if (client.field927[arg1] != null) {
                throw new RuntimeException();
            }
            class72 var6 = client.field927[arg1] = new class72();
            var6.field810 = arg1;
            if (field1378[arg1] != null) {
                var6.method1072(field1378[arg1]);
            }
            var6.field1149 = field1382[arg1];
            var6.field1113 = field1387[arg1];
            int var7 = field1383[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1155[0] = field1384[arg1];
            var6.field809 = (byte) var8;
            var6.method1047((var9 << 13) + var3 - Statics.field407, (var10 << 13) + var4 - Statics.field1272);
            var6.field813 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3371(2);
            int var12 = field1383[arg1];
            field1383[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3371(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1383[arg1];
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
            field1383[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3371(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1383[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1383[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("y.t(I)V")
    public static void method102() {
        field1379 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1378[var0] = null;
            field1384[var0] = 1;
        }
    }
}
